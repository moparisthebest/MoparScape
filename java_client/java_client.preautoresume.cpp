/*
Copyright (C) 2009-2013 moparisthebest

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

Official forums are http://www.moparscape.org/smf/
Email me at admin@moparisthebest.com.
*/

#include <iterator>

#include "libtorrent/config.hpp"

#ifdef _MSC_VER
#pragma warning(push, 1)
#endif

#include <boost/bind.hpp>

#ifdef _MSC_VER
#pragma warning(pop)
#endif

#include "libtorrent/extensions/metadata_transfer.hpp"
#include "libtorrent/extensions/ut_metadata.hpp"
#include "libtorrent/extensions/ut_pex.hpp"
#include "libtorrent/extensions/smart_ban.hpp"

#include "libtorrent/entry.hpp"
#include "libtorrent/bencode.hpp"
#include "libtorrent/session.hpp"
#include "libtorrent/identify_client.hpp"
#include "libtorrent/alert_types.hpp"
#include "libtorrent/ip_filter.hpp"
#include "libtorrent/magnet_uri.hpp"
#include "libtorrent/bitfield.hpp"
#include "libtorrent/file.hpp"
#include "libtorrent/peer_info.hpp"
#include "libtorrent/socket_io.hpp" // print_address
#include "libtorrent/time.hpp"

#include "libtorrent/lazy_entry.hpp"

#include "libtorrent/create_torrent.hpp"

using boost::bind;

#ifdef _WIN32

#if defined(_MSC_VER)
#	define for if (false) {} else for
#endif

#include <windows.h>
#include <conio.h>

bool sleep_and_input(char* c, int sleep)
{
	for (int i = 0; i < sleep * 2; ++i)
	{
		if (_kbhit())
		{
			*c = _getch();
			return true;
		}
		Sleep(500);
	}
	return false;
};

#else

#include <stdlib.h>
#include <stdio.h>

#include <termios.h>
#include <string.h>
#include <sys/ioctl.h>

struct set_keypress
{
	set_keypress()
	{
		termios new_settings;
		tcgetattr(0,&stored_settings);
		new_settings = stored_settings;
		// Disable canonical mode, and set buffer size to 1 byte
		new_settings.c_lflag &= (~ICANON);
		new_settings.c_cc[VTIME] = 0;
		new_settings.c_cc[VMIN] = 1;
		tcsetattr(0,TCSANOW,&new_settings);
	}
	~set_keypress() { tcsetattr(0,TCSANOW,&stored_settings); }
	termios stored_settings;
};

bool sleep_and_input(char* c, int sleep)
{
	// sets the terminal to single-character mode
	// and resets when destructed
	set_keypress s;
	libtorrent::ptime start = libtorrent::time_now_hires();
	int ret = 0;
retry:
	fd_set set;
	FD_ZERO(&set);
	FD_SET(0, &set);
	timeval tv = {sleep, 0};
	ret = select(1, &set, 0, 0, &tv);
	if (ret > 0)
	{
		*c = getc(stdin);
		return true;
	}
	if (errno == EINTR)
	{
		if (total_milliseconds(libtorrent::time_now_hires() - start) < sleep * 1000)
			goto retry;
		return false;
	}

	if (ret < 0 && errno != 0 && errno != ETIMEDOUT)
		fprintf(stderr, "select failed: %s\n", strerror(errno));

	libtorrent::sleep(500);
	return false;
}

#endif

bool print_trackers = true;
bool print_peers = false;
bool print_log = true;
bool print_downloads = false;
bool print_piece_bar = false;
bool print_file_progress = false;
bool show_pad_files = false;
bool show_dht_status = true;
bool sequential_download = false;
bool print_utp_stats = true;

bool print_ip = true;
bool print_as = false;
bool print_timers = false;
bool print_block = false;
bool print_peer_rate = false;
bool print_fails = false;
bool print_send_bufs = true;

int listen_port = 6881;

std::string save_path(".");
int allocation_mode = libtorrent::storage_mode_sparse;

float preferred_ratio = 0.f;
int torrent_upload_limit = 0;
int torrent_download_limit = 0;
int max_connections_per_torrent = 50;
int max_uploads_per_torrent = -1;

bool share_mode = false;

// maps filenames to torrent_handles
typedef std::multimap<std::string, libtorrent::torrent_handle> handles_t;

using libtorrent::torrent_status;

bool yes(libtorrent::torrent_status const&)
{ return true; }

FILE* g_log_file = 0;

std::string to_string(int v, int width)
{
	char buf[100];
	snprintf(buf, sizeof(buf), "%*d", width, v);
	return buf;
}

std::string add_suffix(float val, char const* suffix = 0)
{
	std::string ret;
	if (val == 0)
	{
		ret.resize(4 + 2, ' ');
		if (suffix) ret.resize(4 + 2 + strlen(suffix), ' ');
		return ret;
	}

	const char* prefix[] = {"kB", "MB", "GB", "TB"};
	const int num_prefix = sizeof(prefix) / sizeof(const char*);
	for (int i = 0; i < num_prefix; ++i)
	{
		val /= 1000.f;
		if (std::fabs(val) < 1000.f)
		{
			ret = to_string(val, 4);
			ret += prefix[i];
			if (suffix) ret += suffix;
			return ret;
		}
	}
	ret = to_string(val, 4);
	ret += "PB";
	if (suffix) ret += suffix;
	return ret;
}


std::string hash_to_str(libtorrent::sha1_hash ih){
     using namespace libtorrent;
     return to_hex(ih.to_string());
}

using boost::bind;

void add_torrent(libtorrent::session& ses
	, std::set<libtorrent::torrent_handle>& non_files
	, std::string const& link
	, float preferred_ratio
	, int allocation_mode
	, std::string const& save_path
	, int torrent_upload_limit
	, int torrent_download_limit)
{
	using namespace libtorrent;

     // first see if this is a torrentless download
     bool is_magnet_link = (std::strstr(link.c_str(), "magnet:") == link.c_str());
     std::string torrent;
     std::string name;
     error_code ec;

     add_torrent_params p;
     p.share_mode = share_mode;
     p.save_path = save_path;
     p.storage_mode = (storage_mode_t)allocation_mode;
     p.paused = true;
     p.duplicate_is_error = false;
     p.auto_managed = true;

     // this exists to set the name of the possible .torrent file
     if(is_magnet_link){
          // taken from add_magnet_uri
          boost::optional<std::string> btih = url_has_argument(link, "xt");
          if (!btih || (btih->compare(0, 9, "urn:btih:") != 0)){
               printf("invalid magnet link (missing info hash): %s\n", ec.message().c_str());
               return;
          }
          sha1_hash info_hash;
          if (btih->size() == 40 + 9) from_hex(&(*btih)[9], 40, (char*)&info_hash[0]);
          else info_hash.assign(base32decode(btih->substr(9)));

          //torrent = combine_path(save_path, hash_to_str(info_hash) + ".torrent");
          torrent = combine_path(save_path, hash_to_str(info_hash) + ".resume");

          p.url = link;

     }else{
          torrent = link;
     }

     printf("torrent '%s', link '%s'\n", torrent.c_str(), link.c_str());

     // only try to load the torrent file if it isn't empty
     // it might be empty if:
     // 1. we have a magnet link
     // 2. a name could not be parsed from the magnet link
     // otherwise we should try to load the torrent
     boost::intrusive_ptr<torrent_info> t;
     std::vector<char> buf;
     if(!torrent.empty()){
          printf("torrent we are trying to open: '%s'\n", torrent.c_str());
          t = new torrent_info(torrent.c_str(), ec);
          // if there is no error, try to load the resume data
          if(!ec){
/*               std::string filename = combine_path(save_path, hash_to_str(t->info_hash()) + ".resume");

               if (load_file(filename.c_str(), buf, ec) == 0){
                    //p.resume_data = &buf;
                    printf(".resume data found: %s\n", t->name().c_str());
               }
*/
/*               if(!t->resume_data()->empty()){
                    p.resume_data = t->resume_data();
                    printf("DEBUG: t->resume_data size: %d\n", p.resume_data->size());
                    std::cout << "[ (" << p.resume_data->size() << ") ";
                    for (std::vector<char>::iterator i = p.resume_data->begin(); i != p.resume_data->end(); ++i)
                         std::cout << *i;
                    std::cout << " ]\n";

                    lazy_entry e;
                    int pos;
                    int ret = lazy_bdecode(&((*p.resume_data)[0]), (&((*p.resume_data)[0]) + p.resume_data->size()), e, ec, &pos);

                    if (ret != 0)
                    {
                         std::cerr << "invalid bencoding: " << ret << std::endl;
                         return;
                    }

                    std::cout << "\n\n----- raw info -----\n\n";
                    //std::cout << print_entry(e) << std::endl;

                    printf(".resume data found: %s\n", t->name().c_str());
               }
 */              p.ti = t;
               // if we are here, discard the magnet link, we don't want to use it anymore
               is_magnet_link = false;
               p.url.clear();
               printf("USING torrent file: %s\n", torrent.c_str());

               // if it's a magnet link, it basically just means we haven't saved a .torrent and resume data for it yet, so just reset the error
          }else if(is_magnet_link){
               printf("USING magnet link: %s\n", link.c_str());
               ec.clear();
               // otherwise, we have no choice but to error out
          }else{
               fprintf(stderr, "%s: %s\n", torrent.c_str(), ec.message().c_str());
               return;
          }
     }

	torrent_handle h = ses.add_torrent(p, ec);
	if (ec)
	{
		fprintf(stderr, "failed to add torrent: %s\n", ec.message().c_str());
		return;
	}

     non_files.insert(h);

	h.set_max_connections(max_connections_per_torrent);
     h.set_max_uploads(max_uploads_per_torrent);
	h.set_ratio(preferred_ratio);
	h.set_upload_limit(torrent_upload_limit);
	h.set_download_limit(torrent_download_limit);
#ifndef TORRENT_DISABLE_RESOLVE_COUNTRIES
	h.resolve_countries(true);
#endif
}

void print_alert(libtorrent::alert const* a, std::string& str)
{
	using namespace libtorrent;

	str += "alert: [";
	str += time_now_string();
	str += "] ";
	str += a->message();

	if (g_log_file)
		fprintf(g_log_file, "[%s] %s\n", time_now_string(),  a->message().c_str());
}

int save_file(std::string const& filename, std::vector<char>& v)
{
	using namespace libtorrent;

	file f;
	error_code ec;
	if (!f.open(filename, file::write_only, ec)) return -1;
	if (ec) return -1;
	file::iovec_t b = {&v[0], v.size()};
	size_type written = f.writev(0, &b, 1, ec);
	if (written != v.size()) return -3;
	if (ec) return -3;
	return 0;
}

void handle_alert(libtorrent::session& ses, libtorrent::alert* a
	, handles_t const& files, std::set<libtorrent::torrent_handle> const& non_files)
{
	using namespace libtorrent;

	if (torrent_finished_alert* p = alert_cast<torrent_finished_alert>(a))
	{
		p->handle.set_max_connections(max_connections_per_torrent / 2);

		// write resume data for the finished torrent
		// the alert handler for save_resume_data_alert
		// will save it to disk
		torrent_handle h = p->handle;
		h.save_resume_data();
	}
	else if (save_resume_data_alert* p = alert_cast<save_resume_data_alert>(a))
	{
		torrent_handle h = p->handle;
		TORRENT_ASSERT(p->resume_data);
		if (p->resume_data)
		{
			std::vector<char> out;
			bencode(std::back_inserter(out), *p->resume_data);
               save_file(combine_path(h.save_path(), hash_to_str(h.info_hash()) + ".resume"), out);
			if (non_files.find(h) == non_files.end()
				&& std::find_if(files.begin(), files.end()
					, boost::bind(&handles_t::value_type::second, _1) == h) == files.end())
				ses.remove_torrent(h);
		}
	}
	else if (save_resume_data_failed_alert* p = alert_cast<save_resume_data_failed_alert>(a))
	{
		torrent_handle h = p->handle;
		if (std::find_if(files.begin(), files.end()
			, boost::bind(&handles_t::value_type::second, _1) == h) == files.end())
			ses.remove_torrent(h);
	}
}

static char const* state_str[] =
	{"checking (q)", "checking", "dl metadata"
	, "downloading", "finished", "seeding", "allocating", "checking (r)"};


void tag(std::string tag, float& value){
     std::cout << tag << ": " << value << "\n";
}

void tag(std::string tag, int& value){
     std::cout << tag << ": " << value << "\n";
}

void tag(std::string tag, libtorrent::size_type& value){
     std::cout << tag << ": " << value << "\n";
}

void tag(std::string tag, std::string value){
     std::cout << tag << ": " << value << "\n";
}

void tag(std::string tag, char* value){
     std::cout << tag << ": " << value << "\n";
}

void tag(std::string tag, bool& value){
     std::cout << tag << ": " << (value ? std::string("true") : std::string("false")) << "\n";
}

int main(int argc, char* argv[])
{
	if (argc == 1)
	{
		fprintf(stderr, "usage: client_test [OPTIONS] [TORRENT|MAGNETURL|URL]\n\n"
			"OPTIONS:\n"
			"  -f <log file>         logs all events to the given file\n"
			"  -o <limit>            limits the number of simultaneous\n"
			"                        half-open TCP connections to the\n"
			"                        given number.\n"
			"  -p <port>             sets the listen port\n"
			"  -r <ratio>            sets the preferred share ratio\n"
			"  -d <rate>             limits the download rate\n"
			"  -u <rate>             limits the upload rate\n"
			"  -S <limit>            limits the upload slots\n"
			"  -a <mode>             sets the allocation mode. [compact|full]\n"
			"  -s <path>             sets the save path for downloads\n"
			"  -U <rate>             sets per-torrent upload rate\n"
			"  -D <rate>             sets per-torrent download rate\n"
			"  -w <seconds>          sets the retry time for failed web seeds\n"
			"  -x <file>             loads an emule IP-filter file\n"
			"  -c <limit>            sets the max number of connections\n"
			"  -T <limit>            sets the max number of connections per torrent\n"
#if TORRENT_USE_I2P
			"  -i <i2p-host>         the hostname to an I2P SAM bridge to use\n"
#endif
			"  -C <limit>            sets the max cache size. Specified in 16kB blocks\n"
			"  -F <seconds>          sets the UI refresh rate. This is the number of\n"
			"                        seconds between screen refreshes.\n"
			"  -n                    announce to trackers in all tiers\n"
			"  -t                    announce to all trackers\n"
			"  -h                    allow multiple connections from the same IP\n"
			"  -A <num pieces>       allowed pieces set size\n"
			"  -R <num blocks>       number of blocks per read cache line\n"
			"  -O                    Disallow disk job reordering\n"
			"  -P <host:port>        Use the specified SOCKS5 proxy\n"
			"  -L <user:passwd>      Use the specified username and password for the\n"
			"                        proxy specified by -P\n"
			"  -H                    Don't start DHT\n"
			"  -M                    Disable TCP/uTP bandwidth balancing\n"
			"  -W <num peers>        Set the max number of peers to keep in the peer list\n"
			"  -N                    Do not attempt to use UPnP and NAT-PMP to forward ports\n"
			"  -Y                    Rate limit local peers\n"
			"  -v <limit>            Set the max number of active torrents\n"
			"  -y                    Disable TCP connections (disable outgoing TCP and reject\n"
			"                        incoming TCP connections)\n"
			"  -q <num loops>        automatically quit the client after <num loops> of refreshes\n"
			"                        this is useful for scripting tests\n"
			"  "
			"\n\n"
			"TORRENT is a path to a .torrent file\n"
			"MAGNETURL is a magnet link\n"
			"URL is a url to a torrent file\n")
			;
		return 0;
	}

	using namespace libtorrent;
	session_settings settings;

	settings.user_agent = "java_client/" LIBTORRENT_VERSION;
	settings.choking_algorithm = session_settings::auto_expand_choker;
     settings.optimize_hashing_for_speed = false;
	settings.disk_cache_algorithm = session_settings::largest_contiguous;
	settings.volatile_read_cache = false;
     settings.mixed_mode_algorithm = session_settings::peer_proportional;

#ifndef TORRENT_DISABLE_ENCRYPTION
     pe_settings force_encryption;
     force_encryption.out_enc_policy = pe_settings::forced;
     force_encryption.in_enc_policy = pe_settings::forced;
     force_encryption.allowed_enc_level = pe_settings::rc4;
#endif

	proxy_settings ps;

	int refresh_delay = 1;
	bool start_dht = true;
	bool start_upnp = true;
	int loop_limit = 0;

	std::deque<std::string> events;

     // the string is the filename of the .torrent file, but only if
     // it was added through the directory monitor. It is used to
     // be able to remove torrents that were added via the directory
     // monitor when they're not in the directory anymore.
     std::vector<torrent_status> handles;
     handles_t files;
     // torrents that were not added via the monitor dir
     std::set<torrent_handle> non_files;

	//int counters[torrents_max];

	session ses(fingerprint("LT", LIBTORRENT_VERSION_MAJOR, LIBTORRENT_VERSION_MINOR, 0, 0)
		, session::add_default_plugins
		, alert::all_categories
			& ~(alert::dht_notification
			+ alert::progress_notification
			+ alert::debug_notification
			+ alert::stats_notification));

	std::vector<char> in;
	error_code ec;
	if (load_file(".ses_state", in, ec) == 0)
	{
		lazy_entry e;
		if (lazy_bdecode(&in[0], &in[0] + in.size(), e, ec) == 0)
			ses.load_state(e);
	}

     // load all the extensions
     ses.add_extension(&libtorrent::create_metadata_plugin);
     ses.add_extension(&libtorrent::create_ut_metadata_plugin);
     ses.add_extension(&libtorrent::create_ut_pex_plugin);
     ses.add_extension(&libtorrent::create_smart_ban_plugin);

#ifndef TORRENT_DISABLE_GEO_IP
	ses.load_asnum_db("GeoIPASNum.dat");
	ses.load_country_db("GeoIP.dat");
#endif

	// load the torrents given on the commandline
	std::vector<std::string> torrents;

     for (int i = 1; i < argc; ++i)
     {
          if (argv[i][0] != '-')
          {
               torrents.push_back(argv[i]);
               continue;
          }

		// if there's a flag but no argument following, ignore it
		if (argc == i) continue;
		char const* arg = argv[i+1];
		switch (argv[i][1])
		{
			case 'f': g_log_file = fopen(arg, "w+"); break;
			case 'o': settings.half_open_limit = atoi(arg); break;
			case 'h': settings.allow_multiple_connections_per_ip = true; --i; break;
			case 'p': listen_port = atoi(arg); break;
			case 'r':
				preferred_ratio = atoi(arg);
				if (preferred_ratio != 0 && preferred_ratio < 1.f) preferred_ratio = 1.f;
				break;
			case 'n': settings.announce_to_all_tiers = true; --i; break;
               case 't': settings.announce_to_all_trackers = true; --i; break;
			case 'd': settings.download_rate_limit = atoi(arg) * 1000; break;
			case 'u': settings.upload_rate_limit = atoi(arg) * 1000; break;
			case 'S': settings.unchoke_slots_limit = atoi(arg); break;
			case 'a':
				if (strcmp(arg, "allocate") == 0) allocation_mode = storage_mode_allocate;
				if (strcmp(arg, "compact") == 0) allocation_mode = storage_mode_compact;
				break;
			case 's': save_path = arg; break;
			case 'U': torrent_upload_limit = atoi(arg) * 1000; break;
			case 'D': torrent_download_limit = atoi(arg) * 1000; break;
			case 'Q': share_mode = true; --i; break;
			case 'w': settings.urlseed_wait_retry = atoi(arg); break;
			case 'F': refresh_delay = atoi(arg); break;
			case 'H': start_dht = false; --i; break;
			case 'W':
				settings.max_peerlist_size = atoi(arg);
				settings.max_paused_peerlist_size = atoi(arg) / 2;
				break;
			case 'x':
				{
					FILE* filter = fopen(arg, "r");
					if (filter)
					{
						ip_filter fil;
						unsigned int a,b,c,d,e,f,g,h, flags;
						while (fscanf(filter, "%u.%u.%u.%u - %u.%u.%u.%u %u\n", &a, &b, &c, &d, &e, &f, &g, &h, &flags) == 9)
						{
							address_v4 start((a << 24) + (b << 16) + (c << 8) + d);
							address_v4 last((e << 24) + (f << 16) + (g << 8) + h);
							if (flags <= 127) flags = ip_filter::blocked;
							else flags = 0;
							fil.add_rule(start, last, flags);
						}
						ses.set_ip_filter(fil);
						fclose(filter);
					}
				}
				break;
			case 'c': settings.connections_limit = atoi(arg); break;
			case 'T': max_connections_per_torrent = atoi(arg); break;
#if TORRENT_USE_I2P
			case 'i':
				{
					proxy_settings ps;
					ps.hostname = arg;
					ps.port = 7656; // default SAM port
					ps.type = proxy_settings::i2p_proxy;
					ses.set_i2p_proxy(ps);
					break;
				}
#endif // TORRENT_USE_I2P
			case 'C':
				settings.cache_size = atoi(arg);
				settings.use_read_cache = settings.cache_size > 0;
				settings.cache_buffer_chunk_size = settings.cache_size / 100;
				break;
			case 'A': settings.allowed_fast_set_size = atoi(arg); break;
			case 'R': settings.read_cache_line_size = atoi(arg); break;
			case 'O': settings.allow_reordered_disk_operations = false; --i; break;
			case 'M': settings.mixed_mode_algorithm = session_settings::prefer_tcp; --i; break;
			case 'y': settings.enable_outgoing_tcp = false; settings.enable_incoming_tcp = false; --i; break;
			case 'P':
				{
					char* port = (char*) strrchr(arg, ':');
					if (port == 0)
					{
						fprintf(stderr, "invalid proxy hostname, no port found\n");
						break;
					}
					*port++ = 0;
					ps.hostname = arg;
					ps.port = atoi(port);
					if (ps.port == 0) {
						fprintf(stderr, "invalid proxy port\n");
						break;
					}
					if (ps.type == proxy_settings::none)
						ps.type = proxy_settings::socks5;
				}
				break;
			case 'L':
				{
					char* pw = (char*) strchr(arg, ':');
					if (pw == 0)
					{
						fprintf(stderr, "invalid proxy username and password specified\n");
						break;
					}
					*pw++ = 0;
					ps.username = arg;
					ps.password = pw;
					ps.type = proxy_settings::socks5_pw;
				}
				break;
			case 'N': start_upnp = false; --i; break;
			case 'Y': settings.ignore_limits_on_local_network = false; --i; break;
			case 'v':
				settings.active_limit = atoi(arg);
				settings.active_downloads = atoi(arg) / 2;
				settings.active_seeds = atoi(arg) / 2;
				break;
			case 'q': loop_limit = atoi(arg); break;
		}
		++i; // skip the argument
	}

	// create directory for resume files
	create_directory(combine_path(save_path, ""), ec);
	if (ec)
		fprintf(stderr, "failed to create resume file directory: %s\n", ec.message().c_str());

	ses.start_lsd();
	if (start_upnp)
	{
		ses.start_upnp();
		ses.start_natpmp();
	}

	ses.set_proxy(ps);

     // let's listen on a random port, between 1024 and 65535
     // for the max we need to use 65525, since we add 10 to it
     listen_port = (rand()%65525)+1024;
	ses.listen_on(std::make_pair(listen_port, listen_port + 10));
     listen_port = ses.listen_port();
     printf("listening on port: %d\n", listen_port);

#ifndef TORRENT_DISABLE_DHT
	if (start_dht)
	{
		settings.use_dht_as_fallback = false;

		ses.add_dht_router(std::make_pair(
			std::string("router.bittorrent.com"), 6881));
		ses.add_dht_router(std::make_pair(
			std::string("router.utorrent.com"), 6881));
		ses.add_dht_router(std::make_pair(
			std::string("router.bitcomet.com"), 6881));

		ses.start_dht();
	}
#endif

     ses.set_settings(settings);
#ifndef TORRENT_DISABLE_ENCRYPTION
     ses.set_pe_settings(force_encryption);
#endif

	for (std::vector<std::string>::iterator i = torrents.begin()
		, end(torrents.end()); i != end; ++i)
	{
		if (std::strstr(i->c_str(), "http://") == i->c_str()
			|| std::strstr(i->c_str(), "https://") == i->c_str())
		{
			add_torrent_params p;
			p.share_mode = share_mode;
			p.save_path = save_path;
			p.storage_mode = (storage_mode_t)allocation_mode;
			p.url = *i;

			printf("adding URL: %s\n", i->c_str());
			error_code ec;
			torrent_handle h = ses.add_torrent(p, ec);
			if (ec)
			{
				printf("%s\n", ec.message().c_str());
				continue;
			}
			non_files.insert(h);

			h.set_max_connections(max_connections_per_torrent);
               h.set_max_uploads(max_uploads_per_torrent);
			h.set_ratio(preferred_ratio);
			h.set_upload_limit(torrent_upload_limit);
			h.set_download_limit(torrent_download_limit);
			continue;
		}

		// if it's a torrent file, open it as usual
		add_torrent(ses, non_files, i->c_str(), preferred_ratio
			, allocation_mode, save_path, torrent_upload_limit, torrent_download_limit);
	}

	// main loop
	std::vector<peer_info> peers;
	std::vector<partial_piece_info> queue;

	while (loop_limit > 1 || loop_limit == 0)
	{

		handles.clear();
          ses.get_torrent_status(&handles, boost::bind(&yes, _1));

		if (loop_limit > 1) --loop_limit;
		char c = 0;
		while (sleep_and_input(&c, refresh_delay))
		{
			if (c == 27)
			{
				// escape code, read another character
#ifdef _WIN32
				c = _getch();
#else
				c = getc(stdin);
#endif
				if (c != '[') break;
#ifdef _WIN32
				c = _getch();
#else
				c = getc(stdin);
#endif
			}

			if (c == ' ')
			{
				if (ses.is_paused()) ses.resume();
				else ses.pause();
			}

			if (c == 'm')
			{
				printf("saving peers for torrents\n");

				std::vector<peer_list_entry> peers;
				std::vector<torrent_handle> torrents = ses.get_torrents();
				for (std::vector<torrent_handle>::iterator i = torrents.begin();
					i != torrents.end(); ++i)
				{
					i->get_full_peer_list(peers);
					FILE* f = fopen(("peers_" + i->name()).c_str(), "w+");
					if (!f) break;
					for (std::vector<peer_list_entry>::iterator k = peers.begin()
						, end(peers.end()); k != end; ++k)
					{
						fprintf(f, "%s\t%d\n", print_address(k->ip.address()).c_str()
#ifndef TORRENT_DISABLE_GEO_IP
							, ses.as_for_ip(k->ip.address())
#else
							, 0
#endif
							);
					}
				}
			}

			if (c == 'q') break;

			if (c == 'R')
			{
				// save resume data for all torrents
				for (std::vector<torrent_status>::iterator i = handles.begin()
					, end(handles.end()); i != end; ++i)
				{
					if (i->need_save_resume)
						i->handle.save_resume_data();
				}
			}

			// toggle displays
			if (c == 't') print_trackers = !print_trackers;
			if (c == 'i') print_peers = !print_peers;
			if (c == 'l') print_log = !print_log;
			if (c == 'd') print_downloads = !print_downloads;
			if (c == 'f') print_file_progress = !print_file_progress;
			if (c == 'h') show_pad_files = !show_pad_files;
			if (c == 'a') print_piece_bar = !print_piece_bar;
			if (c == 'g') show_dht_status = !show_dht_status;
			if (c == 'u') print_utp_stats = !print_utp_stats;
			// toggle columns
			if (c == '1') print_ip = !print_ip;
			if (c == '2') print_as = !print_as;
			if (c == '3') print_timers = !print_timers;
			if (c == '4') print_block = !print_block;
			if (c == '5') print_peer_rate = !print_peer_rate;
			if (c == '6') print_fails = !print_fails;
			if (c == '7') print_send_bufs = !print_send_bufs;
		}
		if (c == 'q') break;

		// loop through the alert queue to see if anything has happened.
		std::auto_ptr<alert> a;
		a = ses.pop_alert();
		std::string now = time_now_string();
		while (a.get())
		{
			std::string event_string;

			::print_alert(a.get(), event_string);
			::handle_alert(ses, a.get(), files, non_files);

			events.push_back(event_string);
			if (events.size() >= 20) events.pop_front();

			a = ses.pop_alert();
		}

		session_status sess_stat = ses.status();

		char str[500];
		unsigned int torrent_index = 0;
		for (std::vector<torrent_status>::iterator i = handles.begin();
			i != handles.end(); ++torrent_index)
		{

			torrent_status& s = *i;
			if (!s.handle.is_valid())
			{
				i = handles.erase(i);
				continue;
			}
			else
			{
				++i;
			}

			tag("queue_position", s.queue_position);
               tag("is_paused", s.paused);
               tag("name", s.handle.name());
			tag("error", s.error);

			int seeds = 0;
			int downloaders = 0;

			if (s.num_complete >= 0) seeds = s.num_complete;
			else seeds = s.list_seeds;

			if (s.num_incomplete >= 0) downloaders = s.num_incomplete;
			else downloaders = s.list_peers - s.list_seeds;

			if (s.state != torrent_status::queued_for_checking && s.state != torrent_status::checking_files)
			{
                    tag("state", (s.paused && !s.auto_managed)?"paused":(s.paused && s.auto_managed)?"queued":state_str[s.state]);
                    tag("total_download", add_suffix(s.total_download));
                    tag("upload_rate", add_suffix(s.upload_rate, "/s"));
                    tag("total_upload", add_suffix(s.total_upload));
                    tag("swarm_downloaders", downloaders);
                    tag("swarm_seeds", seeds);
                    tag("up_bandwidth_queue", s.up_bandwidth_queue);
                    tag("down_bandwidth_queue", s.down_bandwidth_queue);
                    tag("all_time_download", add_suffix(s.all_time_download));
                    tag("all_time_upload", add_suffix(s.all_time_upload));
                    tag("seed_rank", s.seed_rank);
                    tag("need_save_resume", s.need_save_resume);
                    tag("sequential_download", s.sequential_download);
                    //tag("total_done", s.total_done);
                    snprintf(str, sizeof(str), "%6.2f%%", s.progress_ppm / 10000.f);
                    tag("bytes",  std::string(str));
			}
			else
			{
                    tag("state", state_str[s.state]);
			}

			if (s.state != torrent_status::queued_for_checking && s.state != torrent_status::checking_files)
			{
				boost::posix_time::time_duration t = s.next_announce;

                    tag("num_peers", s.num_peers);
                    tag("connect_candidates", s.connect_candidates);
                    tag("num_seeds", s.num_seeds);
                    tag("distributed_copies", s.distributed_copies);
                    tag("sparse_regions", s.sparse_regions);
                    tag("download_rate", add_suffix(s.download_rate, "/s"));
                    snprintf(str, sizeof(str), "%02d:%02d:%02d", t.hours(), t.minutes(), t.seconds());
                    tag("next_announce", std::string(str));
                    tag("current_tracker", s.current_tracker);
			}
			if (print_trackers)
               {
                    std::vector<announce_entry> tr = s.handle.trackers();
                    ptime now = time_now();
                    for (std::vector<announce_entry>::iterator i = tr.begin()
                         , end(tr.end()); i != end; ++i)
                    {
/*                         snprintf(str, sizeof(str), "%2d %-55s fails: %-3d (%-3d) %s %s %5d \"%s\" %s\n"
                         , i->tier, i->url.c_str(), i->fails, i->fail_limit, i->verified?"OK ":"-  "
                         , i->updating?"updating"
                         :!i->will_announce(now)?""
                         :to_string(total_seconds(i->next_announce - now), 8).c_str()
                         , i->min_announce > now ? total_seconds(i->min_announce - now) : 0
                         , i->last_error ? i->last_error.message().c_str() : ""
                         , i->message.c_str());
                         out += str;
*/                         tag("tracker", i->url.c_str());
                    }
               }
			tag("delim", std::string("------------------------------------------------------------------------------------------------"));
		}

		cache_status cs = ses.get_cache_status();
		if (cs.blocks_read < 1) cs.blocks_read = 1;
		if (cs.blocks_written < 1) cs.blocks_written = 1;

          tag("num_peers", sess_stat.num_peers);
          tag("download_rate", add_suffix(sess_stat.download_rate, "/s"));
          tag("total_download", add_suffix(sess_stat.total_download));
          tag("upload_rate", add_suffix(sess_stat.upload_rate, "/s"));
          tag("total_upload", add_suffix(sess_stat.total_upload));
          tag("ip_overhead_download_rate", add_suffix(sess_stat.ip_overhead_download_rate, "/s"));
          tag("ip_overhead_upload_rate", add_suffix(sess_stat.ip_overhead_upload_rate, "/s"));
          tag("dht_download_rate", add_suffix(sess_stat.dht_download_rate, "/s"));
          tag("dht_upload_rate", add_suffix(sess_stat.dht_upload_rate, "/s"));
          tag("tracker_download_rate", add_suffix(sess_stat.tracker_download_rate, "/s"));
          tag("tracker_upload_rate", add_suffix(sess_stat.tracker_upload_rate, "/s"));

          tag("total_redundant_bytes", add_suffix(sess_stat.total_redundant_bytes));
          tag("total_failed_bytes", add_suffix(sess_stat.total_failed_bytes));
          tag("num_unchoked", sess_stat.num_unchoked);
          tag("allowed_upload_slots", sess_stat.allowed_upload_slots);
          tag("up_bandwidth_bytes_queue", sess_stat.up_bandwidth_bytes_queue);
          tag("up_bandwidth_queue", sess_stat.up_bandwidth_queue);
          tag("down_bandwidth_bytes_queue", sess_stat.down_bandwidth_bytes_queue);
          tag("down_bandwidth_queue", sess_stat.down_bandwidth_queue);
          tag("disk_write_queue", sess_stat.disk_write_queue);
          tag("disk_read_queue", sess_stat.disk_read_queue);

          tag("optimistic_unchoke_counter", sess_stat.optimistic_unchoke_counter);
          tag("unchoke_counter", sess_stat.unchoke_counter);
          tag("peerlist_size", sess_stat.peerlist_size);

#ifndef TORRENT_DISABLE_DHT
		if (show_dht_status)
		{
               tag("dht_nodes", sess_stat.dht_nodes);
               tag("dht_node_cache", sess_stat.dht_node_cache);
               tag("dht_global_nodes", sess_stat.dht_global_nodes);
               tag("dht_total_allocations", sess_stat.dht_total_allocations);

			int bucket = 0;
			for (std::vector<dht_routing_bucket>::iterator i = sess_stat.dht_routing_table.begin()
				, end(sess_stat.dht_routing_table.end()); i != end; ++i, ++bucket)
			{
/*				snprintf(str, sizeof(str)
					, "%3d [%2d, %2d] active: %d\n"
					, bucket, i->num_nodes, i->num_replacements, i->last_active);
				out += str;
                    tag("dht_bucket_"+bucket+"_num_nodes", i->num_nodes);
                    tag("dht_bucket_"+bucket+"_num_replacements", i->num_replacements);
                    tag("dht_bucket_"+bucket+"_last_active", i->last_active);
*/			}
               // I'm just reusing this variable, should be named 'lookup' I suppose...
               bucket = 0;
			for (std::vector<dht_lookup>::iterator i = sess_stat.active_requests.begin()
				, end(sess_stat.active_requests.end()); i != end; ++i)
			{
/*				snprintf(str, sizeof(str)
					, "  %10s [limit: %2d] "
					"in-flight: %-2d "
					"left: %-3d "
					"1st-timeout: %-2d "
					"timeouts: %-2d "
					"responses: %-2d "
					"last_sent: %-2d\n"
					, i->type
					, i->branch_factor
					, i->outstanding_requests
					, i->nodes_left
					, i->first_timeout
					, i->timeouts
					, i->responses
					, i->last_sent);
				out += str;
                    tag("dht_lookup_"+bucket+"_type", i->type);
                    tag("dht_lookup_"+bucket+"_branch_factor", i->branch_factor);
                    tag("dht_lookup_"+bucket+"_outstanding_requests", i->outstanding_requests);
                    tag("dht_lookup_"+bucket+"_nodes_left", i->nodes_left);
                    tag("dht_lookup_"+bucket+"_first_timeout", i->first_timeout);
                    tag("dht_lookup_"+bucket+"_timeouts", i->timeouts);
                    tag("dht_lookup_"+bucket+"_responses", i->responses);
                    tag("dht_lookup_"+bucket+"_last_sent", i->last_sent);
*/
                    ++bucket;
			}
		}
#endif

		if (print_utp_stats)
		{
               tag("utp_num_idle", sess_stat.utp_stats.num_idle);
               tag("utp_num_syn_sent", sess_stat.utp_stats.num_syn_sent);
               tag("utp_num_connected", sess_stat.utp_stats.num_connected);
               tag("utp_num_fin_sent", sess_stat.utp_stats.num_fin_sent);
               tag("utp_num_close_wait", sess_stat.utp_stats.num_close_wait);
		}

		if (print_log)
		{
			for (std::deque<std::string>::iterator i = events.begin();
				i != events.end(); ++i)
			{
				std::cout << "\n" << *i;
			}
		}
		tag("done", std::string("------------------------------------------------------------------------------------------------"));
	}

	// keep track of the number of resume data
	// alerts to wait for
	int num_resume_data = 0;
	int num_paused = 0;
	int num_failed = 0;

	ses.pause();
	printf("saving resume data\n");
	std::vector<torrent_status> temp;
 	ses.get_torrent_status(&temp, &yes, 0);
	for (std::vector<torrent_status>::iterator i = temp.begin();
		i != temp.end(); ++i)
	{
		torrent_status& st = *i;
		if (!st.handle.is_valid()) continue;
		if (!st.has_metadata) continue;
		if (!st.need_save_resume) continue;

		// save_resume_data will generate an alert when it's done
		st.handle.save_resume_data();
		++num_resume_data;
		printf("\r%d  ", num_resume_data);
	}
	printf("\nwaiting for resume data\n");

	while (num_resume_data > 0)
	{
		alert const* a = ses.wait_for_alert(seconds(10));
		if (a == 0) continue;

		std::auto_ptr<alert> holder = ses.pop_alert();

		torrent_paused_alert const* tp = alert_cast<torrent_paused_alert>(a);
		if (tp)
		{
			++num_paused;
			printf("left: %d failed: %d pause: %d\n"
				, num_resume_data, num_failed, num_paused);
			continue;
		}

		save_resume_data_alert const* rd = alert_cast<save_resume_data_alert>(a);
/*		if (!rd)
		{
			std::string log;
			::print_alert(a, log);
			printf("\n%s\n", log.c_str());
		}
*/
		if (alert_cast<save_resume_data_failed_alert>(a))
		{
			++num_failed;
			--num_resume_data;
			printf("\rleft: %d failed: %d pause: %d "
				, num_resume_data, num_failed, num_paused);
			continue;
		}

		if (!rd) continue;
		--num_resume_data;
		printf("\rleft: %d failed: %d pause: %d "
			, num_resume_data, num_failed, num_paused);

		if (!rd->resume_data) continue;

          torrent_handle h = rd->handle;
          {
		std::vector<char> out;
		bencode(std::back_inserter(out), *rd->resume_data);
          save_file(combine_path(h.save_path(), hash_to_str(h.info_hash()) + ".resume"), out);
          }

          {
          printf("saving torrent file for %s as %s\n", h.name().c_str(), (hash_to_str(h.info_hash()) + ".torrent").c_str());
          torrent_info ti = h.get_torrent_info();
          create_torrent new_torrent(ti);
          // sometimes no trackers are added into our torrents, sometimes not all the trackers are added
          // I don't know why, so just put them in there the hard way
          std::vector<announce_entry> ti_tr = ti.trackers();
          std::vector<announce_entry> tr = h.trackers();
          for (std::vector<announce_entry>::iterator i = tr.begin()
               , end(tr.end()); i != end; ++i)
          {
               // if the url isn't long enough, or doesn't start with http or udp, don't add it
               // I chose 10 because the shortest valid url I could imagine would be something like udp://n.me
               if( (strlen(i->url.c_str()) < 10) || !( (std::strstr(i->url.c_str(), "http://") == i->url.c_str()) || (std::strstr(i->url.c_str(), "udp://") == i->url.c_str()) ) )
                    continue;

               // if ti doesn't have this tracker, we need to add it
               bool duplicate = false;
               for (std::vector<announce_entry>::iterator i2 = ti_tr.begin()
                    , end(ti_tr.end()); i2 != end; ++i2)
               {
                    if(i->url == i2->url){
                         duplicate = true;
                         break;
                    }
               }

               if(!duplicate){
                    printf("adding tracker to torrent file %s tier %d\n", i->url.c_str(), i->tier);
                    new_torrent.add_tracker(i->url, i->tier);
               }else{
                    printf("DUPLICATE tracker %s tier %d\n", i->url.c_str(), i->tier);
               }
          }
          std::vector<char> out;
          bencode(std::back_inserter(out), new_torrent.generate());
          save_file(combine_path(h.save_path(), hash_to_str(h.info_hash()) + ".torrent"), out);
          printf("done saving torrent file for %s\n", h.name().c_str());
          }
	}
	printf("\nsaving session state\n");
	{
		entry session_state;
		ses.save_state(session_state);

		std::vector<char> out;
		bencode(std::back_inserter(out), session_state);
		save_file(".ses_state", out);
	}

	printf("closing session\n");

	return 0;
}

