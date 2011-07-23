/*
Copyright (c) 2011, Travis Burtrum
All rights reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

#include <iterator>
#include <cstdarg>
#include <signal.h>

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
#include "libtorrent/lazy_entry.hpp"
#include "libtorrent/bencode.hpp"
#include "libtorrent/session.hpp"
#include "libtorrent/alert_types.hpp"
#include "libtorrent/ip_filter.hpp"
#include "libtorrent/magnet_uri.hpp"

//#undef TORRENT_USE_I2P

using boost::bind;


bool print_debug = false;
FILE* g_log_file = 0;

void debug( const char* format, ... ) {
	if(!print_debug)
		return;
	printf("DEBUG: ");
	va_list args;
	va_start( args, format );
	vprintf(format, args);
	if (g_log_file){
		fprintf(g_log_file, "DEBUG: ");
		vfprintf(g_log_file, format, args);
		fprintf(g_log_file, "\n");
		fflush(g_log_file);
	}
	va_end( args );
	printf("\n");
	fflush(stdout);
}

#ifdef _WIN32
#define EXE ".exe"

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
#define EXE ""

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
		debug("select failed: %s\n", strerror(errno));

	libtorrent::sleep(500);
	return false;
}

#endif

int exit_status = 0;

// Define the function to be called when certain signals are sent to process
void signal_callback_handler(int signum){
#ifdef _GNU_SOURCE
	debug("Caught signal %d (%s), ignoring in future...", signum, strsignal(signum));
#else
	debug("Caught signal %d, ignoring in future...", signum);
#endif
	// set the exit status, the main loop checks if this is not 0, then quits nicely
	exit_status = signum;

	signal(signum, SIG_IGN);
}

const std::string tag_delim(": ");

int die_timeout = 10;
int allocation_mode = libtorrent::storage_mode_sparse;
//float preferred_ratio = 0.f;
float preferred_ratio = 1.f;
int torrent_upload_limit = 0;
int torrent_download_limit = 0;
int max_connections_per_torrent = 50;
int max_uploads_per_torrent = -1;
bool share_mode = false;
using libtorrent::torrent_status;

bool yes(libtorrent::torrent_status const&){ return true; }

std::string to_string(int v, int width)
{
	char buf[100];
	snprintf(buf, sizeof(buf), "%*d", width, v);
	return buf;
}

std::string add_suffix(float val, char const* suffix = 0, int padding = 0)
{
	std::string ret;

	const char* prefix[] = {"kB", "MB", "GB", "TB"};
	const int num_prefix = sizeof(prefix) / sizeof(const char*);
	for (int i = 0; i < num_prefix; ++i)
	{
		val /= 1000.f;
		if (std::fabs(val) < 1000.f)
		{
			ret = to_string(val, padding);
			ret += prefix[i];
			if (suffix) ret += suffix;
			return ret;
		}
	}
	ret = to_string(val, padding);
	ret += "PB";
	if (suffix) ret += suffix;
	return ret;
}


std::string hash_to_str(libtorrent::sha1_hash ih){
	using namespace libtorrent;
	return to_hex(ih.to_string());
}

std::string add_torrent(libtorrent::session& ses
	, std::string const& link
	, std::string const& save_path)
{
	using namespace libtorrent;

	error_code ec;
	// first we need to make sure we can create save_path
	// create directory for resume files
	create_directory(save_path, ec);
	if (ec){
		debug("failed to create save_path directory: %s", ec.message().c_str());
		return std::string();
	}

	// see if this is a torrentless download
	bool is_magnet_link = (std::strstr(link.c_str(), "magnet:") == link.c_str());
	std::string info_hash;
	std::string name;

	add_torrent_params p;
	p.share_mode = share_mode;
	p.save_path = save_path;
	p.storage_mode = (storage_mode_t)allocation_mode;
	p.paused = true;
	p.duplicate_is_error = false;
	p.auto_managed = true;

	boost::intrusive_ptr<torrent_info> t;
	// this exists to set the name of the possible .torrent file, because we can extract the infohash from a magnet link
	if(is_magnet_link){
		// taken from add_magnet_uri
		boost::optional<std::string> btih = url_has_argument(link, "xt");
		if (!btih || (btih->compare(0, 9, "urn:btih:") != 0)){
			debug("invalid magnet link (missing info hash): '%s'", link.c_str());
			return std::string();
		}
		sha1_hash i_hash;
		if (btih->size() == 40 + 9) from_hex(&(*btih)[9], 40, (char*)&i_hash[0]);
		else i_hash.assign(base32decode(btih->substr(9)));

		//torrent = combine_path(save_path, hash_to_str(info_hash) + ".torrent");
		info_hash = hash_to_str(i_hash);

		p.url = link;
	// this checks if this is a http link to a .torrent file, we can't get an infohash from this so we don't don't set 'torrent'
	// because there is no chance of resume data
	}else if (std::strstr(link.c_str(), "http://") == link.c_str() || std::strstr(link.c_str(), "https://") == link.c_str()){

		p.url = link;

	}else{
		t = new torrent_info(link.c_str(), ec);
		if (ec){
			debug("invalid torrent file: '%s' error: '%s'\n", link.c_str(), ec.message().c_str());
			return std::string();
		}
		info_hash = hash_to_str(t->info_hash());
		p.ti = t;
	}

	// only try to load the resume file if info_hash isn't empty
	// it might be empty if:
	// 1. we have a http link
	// otherwise we should try to load it
	std::vector<char> buf;
	if(!info_hash.empty()){
		info_hash = combine_path(save_path, info_hash + ".resume");
		debug("resume file we are trying to open: '%s'", info_hash.c_str());
		if (load_file(info_hash.c_str(), buf, ec) == 0){
			debug("using resume data: '%s'", info_hash.c_str());
			p.resume_data = &buf;
		}
	}

	torrent_handle h = ses.add_torrent(p, ec);
	if (ec)
	{
		debug("failed to add torrent: %s", ec.message().c_str());
		return std::string();
	}

	h.set_max_connections(max_connections_per_torrent);
	h.set_max_uploads(max_uploads_per_torrent);
	h.set_ratio(preferred_ratio);
	h.set_upload_limit(torrent_upload_limit);
	h.set_download_limit(torrent_download_limit);
#ifndef TORRENT_DISABLE_RESOLVE_COUNTRIES
	h.resolve_countries(true);
#endif
	return hash_to_str(h.info_hash());
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

static std::string state_str[] =
	{"checking (q)", "checking", "dl metadata"
	, "downloading", "finished", "seeding", "allocating", "checking (r)"};


void tag(const std::string& tag, const float& value){
	std::cout << tag << tag_delim << value << "\n";
}

void tag(const std::string& tag, const int& value){
	std::cout << tag << tag_delim << value << "\n";
}

void tag(const std::string& tag, const libtorrent::size_type& value){
	std::cout << tag << tag_delim << value << "\n";
}

void tag(const std::string& tag, const std::string& value){
	std::cout << tag << tag_delim << value << "\n";
}

void tag(const std::string& tag, const bool& value){
	std::cout << tag << tag_delim << (value ? std::string("true") : std::string("false")) << "\n";
}

void tag(const std::string& tag, int& num, const float& value){
	printf(tag.c_str(), num);
	std::cout << tag_delim << value << "\n";
}

void tag(const std::string& tag, int& num, const int& value){
	printf(tag.c_str(), num);
	std::cout << tag_delim << value << "\n";
}

void tag(const std::string& tag, int& num, const std::string& value){
	printf(tag.c_str(), num);
	std::cout << tag_delim << value << "\n";
}

void tag(const std::string& tag, int& num, const bool& value){
	printf(tag.c_str(), num);
	std::cout << tag_delim << (value ? std::string("true") : std::string("false")) << "\n";
}

void handle_alert(libtorrent::session& ses, libtorrent::alert* a)
{
	using namespace libtorrent;

	if (torrent_finished_alert* p = alert_cast<torrent_finished_alert>(a))
	{
		p->handle.set_max_connections(max_connections_per_torrent / 2);

		// write resume data for the finished torrent
		// the alert handler for save_resume_data_alert
		// will save it to disk
		torrent_handle h = p->handle;
		h.save_resume_data(torrent_handle::save_info_dict);
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
			//debug("save_resume_data_alert removing torrent: %s ------------------------------------", hash_to_str(h.info_hash()).c_str());
			//ses.remove_torrent(h);
		}
	}
	else if (save_resume_data_failed_alert* p = alert_cast<save_resume_data_failed_alert>(a))
	{
		torrent_handle h = p->handle;
		//debug("save_resume_data_failed_alert removing torrent: %s ------------------------------------", hash_to_str(h.info_hash()).c_str());
		//ses.remove_torrent(h);
	}
	else if (torrent_deleted_alert* p = alert_cast<torrent_deleted_alert>(a))
	{
		// this is not working for some reason
		tag("torrent_delete_result", hash_to_str(p->info_hash));
		std::cout.flush();
	}
}

void fatal_error(const char* error = 0){
	if(error != 0) printf("Fatal error: %s\n", error);
	printf("usage: java_client"EXE" [OPTIONS] [[TORRENT|MAGNETURL|URL] SAVE_PATH]\n\n"
					"OPTIONS:\n"
					"  -b                    print debug messages, must be first\n"
					"  -s <session file>     loads session state from this file, must be first arg\n"
					"                        or second to -b\n"
					"  -f <log file>         logs all debug events to the given file\n"
					"  -o <limit>            limits the number of simultaneous\n"
					"                        half-open TCP connections to the\n"
					"                        given number.\n"
					"  -p <port>             sets the listen port, default is random port 1024-65535\n"
					"  -r <ratio>            sets the preferred share ratio\n"
					"  -d <rate>             limits the download rate\n"
					"  -u <rate>             limits the upload rate\n"
					"  -S <limit>            limits the upload slots\n"
					"  -a <mode>             sets the allocation mode. [compact|full|sparse]\n"
					"  -U <rate>             sets per-torrent upload rate\n"
					"  -D <rate>             sets per-torrent download rate\n"
					"  -w <seconds>          sets the retry time for failed web seeds\n"
					"  -x <file>             loads an emule IP-filter file\n"
					"  -c <limit>            sets the max number of connections\n"
					"  -T <limit>            sets the max number of connections per torrent\n"
					"  -m <limit>            sets the max number of uploads per torrent\n"
					"  -Q                    start every torrent in share_mode\n"
#if TORRENT_USE_I2P
					"  -i <i2p-host>         the hostname to an I2P SAM bridge to use\n"
#endif
					"  -C <limit>            sets the max cache size. Specified in 16kB blocks\n"
					"  -F <seconds>          sets the UI refresh rate. This is the number of\n"
					"                        seconds between screen refreshes, default 1.\n"
					"  -q                    forces the client to print every -F seconds, instead of\n"
					"                        only when with 'r' is pressed\n"
					"  -e <timeout>          Waits (timeout * -F) and quits if 'r' is not pressed, default 10.\n"
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
					"  -l                    Disable Local Service Discovery\n"
					"  -Y                    Rate limit local peers\n"
					"  -v <limit>            Set the max number of active torrents\n"
					"  -y <proto>            Disable TCP or uTP connections, otherwise both are enabled. [tcp|utp]\n"
					"  "
					"\n"
					"TORRENT is a path to a .torrent file\n"
					"MAGNETURL is a magnet link\n"
					"URL is a url to a torrent file\n"
					"SAVE_PATH is the absolute path to save the torrent and .resume file to\n")
					;
	exit(EXIT_FAILURE);
}

int main(int argc, char* argv[])
{
	if (argc == 1)
	{
		fatal_error();
	}

	// Register signal and signal handler
	// http://www.yolinux.com/TUTORIALS/C++Signals.html

	// windows only signals
	// http://phobos.ramapo.edu/~vmiller/NetworkProgramming/signals.htm
	signal(SIGABRT, signal_callback_handler);
	signal(SIGINT, signal_callback_handler);
	signal(SIGTERM, signal_callback_handler);

#ifndef _WIN32
	signal(SIGHUP, signal_callback_handler);
	signal(SIGPIPE, signal_callback_handler);
#endif

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

	int listen_port = -1;
	int refresh_delay = 1;
	bool constant_loop = false;

	bool start_dht = true;
	bool start_upnp = true;
	bool start_lsd = true;

	session ses(fingerprint("LT", LIBTORRENT_VERSION_MAJOR, LIBTORRENT_VERSION_MINOR, 0, 0)
		, 0
		, alert::all_categories
			& ~(alert::dht_notification
			+ alert::progress_notification
			+ alert::debug_notification
			+ alert::stats_notification));

	// load the torrents given on the commandline
	//std::vector<std::string> torrents;
	std::multimap<std::string, std::string> torrents;
	// this is for loading a session state
	std::vector<char> in;
	error_code ec;
	for (int i = 1; i < argc; ++i)
	{
		if (argv[i][0] != '-')
		{
			//torrents.push_back(argv[i]);
			++i;
			// if there is a torrent, but no save_file location following, error out
			if (argc == i || argv[i][0] == '-')
					fatal_error("SAVE_PATH must always follow each TORRENT|MAGNETURL|URL.");

			// insert the torrent file and the save location, incrementing i because we already processed that one
			torrents.insert(std::pair<const std::string, std::string>(argv[i-1], argv[i]));
			continue;
		}

		// if there's a flag but no argument following, ignore it
		if (argc == i) continue;
		char const* arg = argv[i+1];
		switch (argv[i][1])
		{
			// loads the previous session state, this must always be the first argument, if it exists, or second behind -b
			case 's':
					if(i != 1 && (i != 2 && print_debug))
						fatal_error("-s not first argument, if you specify it, it must be first (or second to -b).");
					if (load_file(arg, in, ec) == 0)
					{
						lazy_entry e;
						if (lazy_bdecode(&in[0], &in[0] + in.size(), e, ec) == 0){
							ses.load_state(e);
							debug("loading state from file %s successful!", arg);
						}
					}
					break;
			// various session_settings
			case 'o': settings.half_open_limit = atoi(arg); break;
			case 'h': settings.allow_multiple_connections_per_ip = true; --i; break;
			case 'n': settings.announce_to_all_tiers = true; --i; break;
			case 't': settings.announce_to_all_trackers = true; --i; break;
			case 'd': settings.download_rate_limit = atoi(arg) * 1000; break;
			case 'u': settings.upload_rate_limit = atoi(arg) * 1000; break;
			case 'S': settings.unchoke_slots_limit = atoi(arg); break;
			case 'w': settings.urlseed_wait_retry = atoi(arg); break;
			case 'W':
				settings.max_peerlist_size = atoi(arg);
					settings.max_paused_peerlist_size = settings.max_peerlist_size / 2;
				break;
			case 'c': settings.connections_limit = atoi(arg); break;
			case 'C':
				settings.cache_size = atoi(arg);
				settings.use_read_cache = settings.cache_size > 0;
				settings.cache_buffer_chunk_size = settings.cache_size / 100;
				break;
			case 'A': settings.allowed_fast_set_size = atoi(arg); break;
			case 'R': settings.read_cache_line_size = atoi(arg); break;
			case 'O': settings.allow_reordered_disk_operations = false; --i; break;
			case 'Y': settings.ignore_limits_on_local_network = false; --i; break;
			case 'v':
					settings.active_limit = atoi(arg);
					settings.active_downloads = settings.active_limit / 2;
					settings.active_seeds = settings.active_limit / 2;
					break;
			// variables specific to this program
			case 'p': listen_port = atoi(arg); break;
			case 'b':
					if(i != 1) fatal_error("-b not first argument, if you specify it, it must be first.");
					print_debug = true; --i; break;
			case 'f': g_log_file = fopen(arg, "w+"); break;
			case 'F': refresh_delay = atoi(arg); break;
			case 'q': constant_loop = true; --i; break;
			case 'e': die_timeout = atoi(arg); break;
			// variables applied to each torrent started
			case 'T': max_connections_per_torrent = atoi(arg); break;
			case 'm': max_uploads_per_torrent = atoi(arg); break;
			case 'Q': share_mode = true; --i; break;
			case 'U': torrent_upload_limit = atoi(arg) * 1000; break;
			case 'D': torrent_download_limit = atoi(arg) * 1000; break;
			case 'r':
					preferred_ratio = atoi(arg);
					if (preferred_ratio != 0 && preferred_ratio < 1.f) preferred_ratio = 1.f;
					break;
			case 'a':
					if (strcmp(arg, "allocate") == 0) allocation_mode = storage_mode_allocate;
					else if (strcmp(arg, "compact") == 0) allocation_mode = storage_mode_compact;
					else if (strcmp(arg, "sparse") == 0) allocation_mode = storage_mode_sparse;
					break;
			// control whether to start certain extensions
			case 'H': start_dht = false; --i; break;
			case 'N': start_upnp = false; --i; break;
			case 'l': start_lsd = false; --i; break;
			// control protocol choice
			case 'M': settings.mixed_mode_algorithm = session_settings::prefer_tcp; --i; break;
			case 'y':
					if (strcmp(arg, "tcp") == 0){
						settings.enable_outgoing_tcp = false;
						settings.enable_incoming_tcp = false;
					}
					else if (strcmp(arg, "utp") == 0){
						settings.enable_outgoing_utp = false;
						settings.enable_incoming_utp = false;
					}
					break;
			// proxy settings
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
			case 'P':
				{
					char* port = (char*) strrchr(arg, ':');
					if (port == 0) fatal_error("invalid proxy hostname, no port found");
					*port++ = 0;
					ps.hostname = arg;
					ps.port = atoi(port);
					if (ps.port == 0) {
							debug("invalid proxy port");
						break;
					}
					if (ps.type == proxy_settings::none)
						ps.type = proxy_settings::socks5;
				}
				break;
			case 'L':
				{
					char* pw = (char*) strchr(arg, ':');
					if (pw == 0) fatal_error("invalid proxy username and password specified");
					*pw++ = 0;
					ps.username = arg;
					ps.password = pw;
					ps.type = proxy_settings::socks5_pw;
				}
				break;
			// ip filter
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
			default:
					// quick hack here to avoid snprintf or stream
					char error_msg[] = "invalid option -- ' '";
					error_msg[19] = argv[i][1];
					fatal_error(error_msg);
		}
		++i; // skip the argument
	}

	// load all the extensions
	ses.add_extension(&libtorrent::create_metadata_plugin);
	ses.add_extension(&libtorrent::create_ut_metadata_plugin);
	ses.add_extension(&libtorrent::create_ut_pex_plugin);
	ses.add_extension(&libtorrent::create_smart_ban_plugin);

	if(start_lsd) ses.start_lsd();
	if (start_upnp)
	{
		ses.start_upnp();
		ses.start_natpmp();
	}

	ses.set_proxy(ps);

	// let's listen on a random port, between 1024 and 65535
	// for the max we need to use 65525, since we add 10 to it
	if(listen_port < 0 || listen_port > 65535) listen_port = (rand()%65525)+1024;
	ses.listen_on(std::make_pair(listen_port, listen_port + 10), ec);
	if(ec){
		printf("Fatal error: failed to bind to any ports in range %d-%d message: %s\n", listen_port, listen_port+10, ec.message().c_str());
		return EXIT_FAILURE;
	}
	listen_port = ses.listen_port();
	debug("listening on port: %d", listen_port);

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

	for (std::multimap<std::string, std::string>::iterator i = torrents.begin(); !torrents.empty() && i != torrents.end(); ++i)
	{
		debug("adding %s save to %s", i->first.c_str(), i->second.c_str());

		// since we are just starting this program, we want to fail out if adding all of these torrents isn't successful
		std::string new_info_hash = add_torrent(ses, i->first, i->second);
		if(new_info_hash.empty()){
			printf("Fatal error: failed to add torrent '%s' to be saved to '%s', turn on debug for more info.\n", i->first.c_str(), i->second.c_str());
			return EXIT_FAILURE;
		}else{
			tag("result", new_info_hash);
		}
	}
	// flush once before main loop (necessary for java)
	std::cout.flush();

	// declare bools controlling what we print
	bool print_trackers = false;
	bool print_cache_status = false;
	bool print_dht_status = false;
	bool print_utp_stats = false;
	bool print_alerts = false;

	std::vector<torrent_status> handles;

	// if this counter reaches 2, then we quit gracefully
	int die_counter = 0;

	// main loop
	while (true)
	{

		handles.clear();
		//ses.get_torrent_status(&handles, boost::bind(&yes, _1));
		ses.get_torrent_status(&handles, &yes, 0);
		//ses.refresh_torrent_status(&handles);

		char c = 0;
		while (sleep_and_input(&c, refresh_delay))
		{
			// if this is true, quit without further ado
			if(exit_status != 0 || (c != 'r' && ++die_counter > die_timeout) ){
				c = 'q';
				break;
			}
			//if(c == '\n') break;
			debug("character read: '%c'", c);

			if (c == 'r' || c == 'q'){
				die_counter = 0;
				break;
			}
			// add torrent, requires a magnet link, url link, or path to a torrent file, and a save_path
			if(c == 'a'){
				// get magnet_url
				std::string magnet_url, save_path;
				std::getline(std::cin, magnet_url);
				//std::cin.ignore(INT_MAX, '\n');
				// get save_path
				std::getline(std::cin, save_path);
				//std::cin.ignore(INT_MAX, '\n');
				// add torrent, print result
				tag("result", add_torrent(ses, magnet_url, save_path));
				std::cout.flush();
				break;
			}

			// delete torrent, requires a info_hash
			if(c == 'd'){
				// get info_hash
				std::string i_hash;
				std::getline(std::cin, i_hash);
				//std::cin.ignore(INT_MAX, '\n');
				sha1_hash info_hash;
				//info_hash.assign(i_hash);
				from_hex(i_hash.c_str(), 40, (char*)&info_hash[0]);
				torrent_handle h = ses.find_torrent(info_hash);
				if(!h.is_valid()){
					debug("can't find torrent for specified info_hash: '%s'", hash_to_str(info_hash).c_str());
					tag("result", false);
					std::cout.flush();
					break;
				}
				// then the torrent was valid

				// this was called because the torrent delete alert never came, but it still didn't work, so I'll comment it out
				//ses.set_alert_mask(alert::all_categories);
				// this is an asynchronous call, so we need to wait for the result in the alert queue
				ses.remove_torrent(h);
				tag("result", true);
				std::cout.flush();
				break;
			}

			if (c == ' '){
				if (ses.is_paused()) ses.resume();
				else ses.pause();
				break;
			}

			// toggle displays
			if (c == 'b') print_debug = !print_debug;
			else if (c == 't') print_trackers = !print_trackers;
			else if (c == 'z') print_cache_status = !print_cache_status;
			else if (c == 'h') print_dht_status = !print_dht_status;
			else if (c == 'u') print_utp_stats = !print_utp_stats;
			else if (c == 'p') print_alerts = !print_alerts;

			else if (c == 'c') constant_loop = !constant_loop;
			else if (c == 's') share_mode = !share_mode;
		}

		if (c == 'q' || exit_status != 0) break;

		// loop through the alert queue to see if anything has happened.
		std::auto_ptr<alert> a;
		a = ses.pop_alert();
		while (a.get())
		{
			::handle_alert(ses, a.get());

			if (print_alerts)
				tag("alert", a.get()->message());

			a = ses.pop_alert();
		}
		// if we are printing the alerts, we need to flush them, because we may continue at the next statement
		if (print_alerts) std::cout.flush();

		if(c != 'r' && !constant_loop){
			// if c is still 0, that means no input, so increase die_counter, and check for too many
			if(c == 0 && ++die_counter > die_timeout) break;
			continue;
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

				 tag("info_hash", hash_to_str(s.handle.info_hash()));
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
					 tag("state", ( (s.paused && !s.auto_managed)?"paused": ((s.paused && s.auto_managed)?"queued":state_str[s.state]) ) );
					 tag("total_download", add_suffix(s.total_download));
					 tag("total_upload", add_suffix(s.total_upload));
					 tag("total_upload_ratio", (s.total_download == 0 ? 0 : s.total_upload / s.total_download) );
					 tag("download_rate", add_suffix(s.download_rate, "/s"));
					 tag("upload_rate", add_suffix(s.upload_rate, "/s"));
					 tag("down_bandwidth_queue", s.down_bandwidth_queue);
					 tag("up_bandwidth_queue", s.up_bandwidth_queue);
					 tag("all_time_download", add_suffix(s.all_time_download));
					 tag("all_time_upload", add_suffix(s.all_time_upload));
					 tag("total_done", add_suffix(s.total_done));
					 tag("progress_ppm", s.progress_ppm);
					 snprintf(str, sizeof(str), "%5.2f", s.progress_ppm / 10000.f);
					 tag("percent_done", std::string(str));
					 tag("num_peers", s.num_peers);
					 tag("num_seeds", s.num_seeds);
					 tag("connect_candidates", s.connect_candidates);
					 tag("swarm_downloaders", downloaders);
					 tag("swarm_seeds", seeds);
					 tag("distributed_copies", s.distributed_copies);
					 tag("seed_rank", s.seed_rank);

					 tag("need_save_resume", s.need_save_resume);
					 tag("sequential_download", s.sequential_download);
					 tag("sparse_regions", s.sparse_regions);
					 boost::posix_time::time_duration t = s.next_announce;
					 snprintf(str, sizeof(str), "%02d:%02d:%02d", t.hours(), t.minutes(), t.seconds());
					 tag("next_announce", std::string(str));
					 tag("current_tracker", s.current_tracker);
				 }
				 else
				 {
					 tag("state", state_str[s.state]);
				 }

				 // if seeding
				 if (s.state == torrent_status::seeding || s.state == torrent_status::finished)
				 {
					 const torrent_info& t = s.handle.get_torrent_info();
					 tag("num_files", t.num_files());
					 tag("save_path", s.handle.save_path());
					 int index = 0;
					 std::string file_list("");
					 for (torrent_info::file_iterator i = t.begin_files();
						  i != t.end_files(); ++i, ++index)
						  {/*
						  int first = t.map_file(index, 0, 0).piece;
					 int last = t.map_file(index, (std::max)(size_type(i->size)-1, size_type(0)), 0).piece;
					 printf("  %11"PRId64" %c%c%c%c [ %4d, %4d ] %7u %s %s %s%s\n"
										 , i->size
										 , (i->pad_file?'p':'-')
										 , (i->executable_attribute?'x':'-')
										 , (i->hidden_attribute?'h':'-')
										 , (i->symlink_attribute?'l':'-')
										 , first, last
										 , boost::uint32_t(t.files().mtime(*i))
										 , t.files().hash(*i) != sha1_hash(0) ? to_hex(t.files().hash(*i).to_string()).c_str() : ""
																																 , t.files().file_path(*i).c_str()
																																 , i->symlink_attribute ? "-> ": ""
																																								 , i->symlink_attribute && i->symlink_index != -1 ? t.files().symlink(*i).c_str() : "");
																																								 */
																																								 file_list += ((index == 0) ? "" : ", ")+t.files().file_path(*i);
						  }
						  tag("file_list", file_list);
				 }

				 if (print_trackers)
				 {
					 std::vector<announce_entry> tr = s.handle.trackers();
					 ptime now = time_now();
					 int tnum = 0;
					 for (std::vector<announce_entry>::iterator i = tr.begin()
						 , end(tr.end()); i != end; ++i, ++tnum)
					 {
						 tag("tracker_%d_url", tnum, i->url);
						 tag("tracker_%d_tier", tnum, i->tier);
						 tag("tracker_%d_fails", tnum, i->fails);
						 tag("tracker_%d_verified", tnum, i->verified);
						 tag("tracker_%d_updating", tnum, i->updating);
						 //                         tag("tracker_%d_will_announce", tnum, i->will_announce(now));
						 tag("tracker_%d_next_announce", tnum, total_seconds(i->next_announce - now));
						 tag("tracker_%d_min_announce", tnum, total_seconds(i->min_announce - now));
						 tag("tracker_%d_last_error", tnum, i->last_error.message());
						 tag("tracker_%d_message", tnum, i->message);
					 }
				 }
				 tag("delim", std::string("------------------------------------------------------------------------------------------------"));
			 }

			 tag("total_download", add_suffix(sess_stat.total_download));
			 tag("total_upload", add_suffix(sess_stat.total_upload));

			 tag("download_rate", add_suffix(sess_stat.download_rate, "/s"));
			 tag("upload_rate", add_suffix(sess_stat.upload_rate, "/s"));
			 tag("ip_overhead_download_rate", add_suffix(sess_stat.ip_overhead_download_rate, "/s"));
			 tag("ip_overhead_upload_rate", add_suffix(sess_stat.ip_overhead_upload_rate, "/s"));
			 tag("dht_download_rate", add_suffix(sess_stat.dht_download_rate, "/s"));
			 tag("dht_upload_rate", add_suffix(sess_stat.dht_upload_rate, "/s"));
			 tag("tracker_download_rate", add_suffix(sess_stat.tracker_download_rate, "/s"));
			 tag("tracker_upload_rate", add_suffix(sess_stat.tracker_upload_rate, "/s"));

			 tag("total_redundant_bytes", add_suffix(sess_stat.total_redundant_bytes));
			 tag("total_failed_bytes", add_suffix(sess_stat.total_failed_bytes));
			 tag("down_bandwidth_bytes_queue", sess_stat.down_bandwidth_bytes_queue);
			 tag("down_bandwidth_queue", sess_stat.down_bandwidth_queue);
			 tag("up_bandwidth_bytes_queue", sess_stat.up_bandwidth_bytes_queue);
			 tag("up_bandwidth_queue", sess_stat.up_bandwidth_queue);
			 tag("disk_write_queue", sess_stat.disk_write_queue);
			 tag("disk_read_queue", sess_stat.disk_read_queue);

			 tag("num_peers", sess_stat.num_peers);
			 tag("peerlist_size", sess_stat.peerlist_size);
			 tag("allowed_upload_slots", sess_stat.allowed_upload_slots);
			 tag("num_unchoked", sess_stat.num_unchoked);
			 tag("optimistic_unchoke_counter", sess_stat.optimistic_unchoke_counter);
			 tag("unchoke_counter", sess_stat.unchoke_counter);

			 if(print_cache_status)
			 {
				 cache_status cs = ses.get_cache_status();
				 if (cs.blocks_read < 1) cs.blocks_read = 1;
				 if (cs.blocks_written < 1) cs.blocks_written = 1;
				 snprintf(str, sizeof(str), "%"PRId64"%%", (cs.blocks_written - cs.writes) * 100 / cs.blocks_written);
				 tag("cache_write", std::string(str));
				 snprintf(str, sizeof(str), "%"PRId64"%%", cs.blocks_read_hit * 100 / cs.blocks_read);
				 tag("cache_read", std::string(str));
				 tag("cache_size", add_suffix(boost::int64_t(cs.cache_size) * 16 * 1024));
				 tag("cache_read_size", add_suffix(boost::int64_t(cs.read_cache_size) * 16 * 1024));
				 tag("cache_total_used_buffers", add_suffix(boost::int64_t(cs.total_used_buffers) * 16 * 1024));
				 tag("cache_queued_bytes", cs.queued_bytes);
			 }

			 #ifndef TORRENT_DISABLE_DHT
			 if (print_dht_status)
			 {
				 tag("dht_nodes", sess_stat.dht_nodes);
				 tag("dht_node_cache", sess_stat.dht_node_cache);
				 tag("dht_global_nodes", sess_stat.dht_global_nodes);
				 tag("dht_total_allocations", sess_stat.dht_total_allocations);

				 int bucket = 0;
				 for (std::vector<dht_routing_bucket>::iterator i = sess_stat.dht_routing_table.begin()
					 , end(sess_stat.dht_routing_table.end()); i != end; ++i, ++bucket)
				 {
					 tag("dht_bucket_%d_num_nodes", bucket, i->num_nodes);
					 tag("dht_bucket_%d_num_replacements", bucket, i->num_replacements);
					 tag("dht_bucket_%d_last_active", bucket, i->last_active);
				 }
				 // I'm just reusing this variable, should be named 'lookup' I suppose...
				 bucket = 0;
				 for (std::vector<dht_lookup>::iterator i = sess_stat.active_requests.begin()
					 , end(sess_stat.active_requests.end()); i != end; ++i, ++bucket)
				 {
					 tag("dht_lookup_%d_type", bucket, i->type);
					 tag("dht_lookup_%d_branch_factor", bucket, i->branch_factor);
					 tag("dht_lookup_%d_outstanding_requests", bucket, i->outstanding_requests);
					 tag("dht_lookup_%d_nodes_left", bucket, i->nodes_left);
					 tag("dht_lookup_%d_first_timeout", bucket, i->first_timeout);
					 tag("dht_lookup_%d_timeouts", bucket, i->timeouts);
					 tag("dht_lookup_%d_responses", bucket, i->responses);
					 tag("dht_lookup_%d_last_sent", bucket, i->last_sent);
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

			 tag("done", std::string("------------------------------------------------------------------------------------------------"));
			 // now push it all through
			 std::cout.flush();
	}
	if(die_counter > die_timeout)
		debug("Stopping because die_counter (%d) surpassed die_timeout (%d)", die_counter, die_timeout);
	if(exit_status != 0){
#ifdef _GNU_SOURCE
		debug("Stopping because exit_status is %d (%s)", exit_status, strsignal(exit_status));
#else
		debug("Stopping because exit_status is %d", exit_status);
#endif
	}
	debug("Now out of main loop, shutting down...");

	// keep track of the number of resume data
	// alerts to wait for
	int num_resume_data = 0;
	int num_paused = 0;
	int num_failed = 0;

	ses.pause();
	debug("saving resume data");
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
		st.handle.save_resume_data(torrent_handle::save_info_dict);
		++num_resume_data;
		debug("%d  ", num_resume_data);
	}
	debug("waiting for resume data");

	while (num_resume_data > 0)
	{
		alert const* a = ses.wait_for_alert(seconds(10));
		if (a == 0) continue;

		std::auto_ptr<alert> holder = ses.pop_alert();

		torrent_paused_alert const* tp = alert_cast<torrent_paused_alert>(a);
		if (tp)
		{
			++num_paused;
			debug("left: %d failed: %d pause: %d"
				, num_resume_data, num_failed, num_paused);
			continue;
		}

		save_resume_data_alert const* rd = alert_cast<save_resume_data_alert>(a);

		if (alert_cast<save_resume_data_failed_alert>(a))
		{
			++num_failed;
			--num_resume_data;
			debug("left: %d failed: %d pause: %d "
				, num_resume_data, num_failed, num_paused);
			continue;
		}

		if (!rd) continue;
		--num_resume_data;
		debug("left: %d failed: %d pause: %d "
			, num_resume_data, num_failed, num_paused);

		if (!rd->resume_data) continue;

		torrent_handle h = rd->handle;
		{
		std::vector<char> out;
		bencode(std::back_inserter(out), *rd->resume_data);
		save_file(combine_path(h.save_path(), hash_to_str(h.info_hash()) + ".resume"), out);
		}
		// not needed due to now saving info-dict in .resume data, so i'll comment it out
		/*
		if(save_torrent_file){
			debug("saving torrent file for %s as %s", h.name().c_str(), (hash_to_str(h.info_hash()) + ".torrent").c_str());
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
						debug("adding tracker to torrent file %s tier %d", i->url.c_str(), i->tier);
						new_torrent.add_tracker(i->url, i->tier);
					}else{
						debug("DUPLICATE tracker %s tier %d", i->url.c_str(), i->tier);
					}
			}
			std::vector<char> out;
			bencode(std::back_inserter(out), new_torrent.generate());
			save_file(combine_path(h.save_path(), hash_to_str(h.info_hash()) + ".torrent"), out);
			debug("done saving torrent file for %s", h.name().c_str());
		}
		*/
	}
	debug("saving session state");
	{
		entry session_state;
		ses.save_state(session_state);

		std::vector<char> out;
		bencode(std::back_inserter(out), session_state);
		save_file(".ses_state", out);
	}

	debug("closing session");

	return exit_status;
}

