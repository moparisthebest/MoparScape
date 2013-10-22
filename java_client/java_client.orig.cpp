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

#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <iterator>
#include <exception>

#include <istream>

#include "libtorrent/entry.hpp"
#include "libtorrent/bencode.hpp"
#include "libtorrent/session.hpp"
#include "libtorrent/magnet_uri.hpp"

#ifdef _WIN32

#if defined(_MSC_VER)
#    define for if (false) {} else for
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
#include <time.h>

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

bool sleep_and_input(char* c, int seconds)
{
     // sets the terminal to single-character mode
     // and resets when destructed
     set_keypress s;

     fd_set set;
     FD_ZERO(&set);
     FD_SET(0, &set);
     timeval tv = {seconds, 0};
     if (select(1, &set, 0, 0, &tv) > 0)
     {
          *c = getc(stdin);
          return true;
     }
     return false;
}

#endif

typedef std::multimap<std::string, libtorrent::torrent_handle> handles_t;

libtorrent::session ses(libtorrent::fingerprint("LT", LIBTORRENT_VERSION_MAJOR, LIBTORRENT_VERSION_MINOR, 0, 0)
, libtorrent::session::start_default_features | libtorrent::session::add_default_plugins
, libtorrent::alert::all_categories
& ~(libtorrent::alert::dht_notification
+ libtorrent::alert::progress_notification
+ libtorrent::alert::debug_notification
+ libtorrent::alert::stats_notification));
// the string is the name of this particular file
handles_t handles;
int allocation_mode = libtorrent::storage_mode_sparse;

int listen_port = 6881;
int refresh_delay = 1;

int max_connections_per_torrent = 50;
int max_uploads = -1;
float preferred_ratio = 0.f;
int torrent_upload_limit = 0;
int torrent_download_limit = 0;

void debug(std::string const& message){
     std::cout << "DEBUG: " << message << "\n";
}


bool add_magnet(std::string const& magnet_url, std::string save_path){
     using namespace libtorrent;
     // start magnet stuff
     add_torrent_params p;
     p.save_path = save_path;
     error_code ec;
     p.storage_mode = (storage_mode_t)allocation_mode;
     debug("adding magnet_url: " + magnet_url + " save_path: " + save_path);
     torrent_handle h = add_magnet_uri(ses, magnet_url, p, ec);
     if (ec)
     {
          debug(ec.message());
          return false;
     }

     handles.insert(std::pair<const std::string, torrent_handle>(std::string(), h));

     h.set_max_connections(max_connections_per_torrent);
     h.set_max_uploads(max_uploads);
     h.set_ratio(preferred_ratio);
     h.set_upload_limit(torrent_upload_limit);
     h.set_download_limit(torrent_download_limit);

     return true;
}

char const* esc(char const* code)
{
     #ifdef ANSI_TERMINAL_COLORS
     // this is a silly optimization
     // to avoid copying of strings
     enum { num_strings = 200 };
     static char buf[num_strings][20];
     static int round_robin = 0;
     char* ret = buf[round_robin];
     ++round_robin;
     if (round_robin >= num_strings) round_robin = 0;
     ret[0] = '\033';
     ret[1] = '[';
     int i = 2;
     int j = 0;
     while (code[j]) ret[i++] = code[j++];
     ret[i++] = 'm';
     ret[i++] = 0;
     return ret;
     #else
     return "";
     #endif
}

std::string to_string(int v, int width)
{
     std::stringstream s;
     s.flags(std::ios_base::right);
     s.width(width);
     s.fill(' ');
     s << v;
     return s.str();
}

std::string& to_string(float v, int width, int precision = 3)
{
     // this is a silly optimization
     // to avoid copying of strings
     enum { num_strings = 20 };
     static std::string buf[num_strings];
     static int round_robin = 0;
     std::string& ret = buf[round_robin];
     ++round_robin;
     if (round_robin >= num_strings) round_robin = 0;
     ret.resize(20);
     int size = snprintf(&ret[0], 20, "%*.*f", width, precision, v);
     ret.resize((std::min)(size, width));
     return ret;
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

std::string const& piece_bar(libtorrent::bitfield const& p, int width)
{
     #ifdef ANSI_TERMINAL_COLORS
     static const char* lookup[] =
     {
          // black, blue, cyan, white
          "40", "44", "46", "47"
     };

     const int table_size = sizeof(lookup) / sizeof(lookup[0]);
     #else
     static const char char_lookup[] =
     { ' ', '.', ':', '-', '+', '*', '#'};

     const int table_size = sizeof(char_lookup) / sizeof(char_lookup[0]);
     #endif

     double piece_per_char = p.size() / double(width);
     static std::string bar;
     bar.clear();
     bar.reserve(width * 6);
     bar += "[";
     if (p.size() == 0)
     {
          for (int i = 0; i < width; ++i) bar += ' ';
          bar += "]";
          return bar;
     }

     // the [piece, piece + pieces_per_char) range is the pieces that are represented by each character
     double piece = 0;
     for (int i = 0; i < width; ++i, piece += piece_per_char)
     {
          int num_pieces = 0;
          int num_have = 0;
          int end = (std::max)(int(piece + piece_per_char), int(piece) + 1);
          for (int k = int(piece); k < end; ++k, ++num_pieces)
               if (p[k]) ++num_have;
               int color = int(std::ceil(num_have / float(num_pieces) * (table_size - 1)));
          #ifdef ANSI_TERMINAL_COLORS
          bar += esc(lookup[color]);
          bar += " ";
          #else
          bar += char_lookup[color];
          #endif
     }
     #ifdef ANSI_TERMINAL_COLORS
     bar += esc("0");
     #endif
     bar += "]";
     return bar;
}

std::string const& progress_bar(int progress, int width, char const* code = "33")
{
     static std::string bar;
     bar.clear();
     bar.reserve(width + 10);

     int progress_chars = (progress * width + 500) / 1000;
     bar = esc(code);
     std::fill_n(std::back_inserter(bar), progress_chars, '#');
     std::fill_n(std::back_inserter(bar), width - progress_chars, '-');
     bar += esc("0");
     return bar;
}

int save_file(boost::filesystem::path const& filename, std::vector<char>& v)
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

static char const* state_str[] =
{"checking (q)", "checking", "dl metadata"
, "downloading", "finished", "seeding", "allocating", "checking (r)"};

int main(int argc, char* argv[])
{
	using namespace libtorrent;
#if BOOST_VERSION < 103400
	namespace fs = boost::filesystem;
	fs::path::default_name_check(fs::no_check);
#endif

	if (argc != 1 && argc != 3)	{
          std::cerr << "usage: ./java_client [MAGNETURL] [SAVE_PATH]\n"
			"to stop the client, press q.\n";
		return 1;
	}

     session_settings settings;

     settings.user_agent = "client_test/" LIBTORRENT_VERSION;
     settings.auto_upload_slots_rate_based = true;
     //settings.announce_to_all_trackers = true;
     settings.optimize_hashing_for_speed = false;
     settings.disk_cache_algorithm = session_settings::largest_contiguous;

     pe_settings force_encryption;
     force_encryption.out_enc_policy = pe_settings::forced;
     force_encryption.in_enc_policy = pe_settings::forced;
     force_encryption.allowed_enc_level = pe_settings::rc4;

     proxy_settings ps;

     std::deque<std::string> events;

     std::vector<char> in;
     if (load_file(".ses_state", in) == 0)
     {
          printf("loading session state\n");
          lazy_entry e;
          if (lazy_bdecode(&in[0], &in[0] + in.size(), e) == 0)
               ses.load_state(e);
     }
/*
     ses.set_peer_proxy(ps);
     ses.set_web_seed_proxy(ps);
     ses.set_tracker_proxy(ps);
     #ifndef TORRENT_DISABLE_DHT
     ses.set_dht_proxy(ps);
     #endif
*/
     ses.listen_on(std::make_pair(listen_port, listen_port+10));

     ses.set_settings(settings);
     ses.set_pe_settings(force_encryption);

     #ifndef TORRENT_DISABLE_DHT
     ses.add_dht_router(std::make_pair(
     std::string("router.bittorrent.com"), 6881));
     ses.add_dht_router(std::make_pair(
     std::string("router.utorrent.com"), 6881));
     ses.add_dht_router(std::make_pair(
     std::string("router.bitcomet.com"), 6881));

     ses.start_dht();
     #endif

     // if there are 3 args, we want to immediatly start a torrent
     // if that torrent fails, then return an error code
     if (argc == 3 && !add_magnet(argv[1], argv[2])) {
          return 1;
     }

int active_torrent = 0;

	// now report progress and wait for commands
	int count = 0;
     for (;;)
     {
          char c = 0;
          while (sleep_and_input(&c, refresh_delay))
          {
               if(c == '\n') break;
               std::cout << "character read: '" << c << "'\n";
               if (c == 'q') break;

               if(c == 'a'){
                    // get magnet_url
                    std::string magnet_url, save_path;
                    std::getline(std::cin, magnet_url);
                    //std::cin.ignore(INT_MAX, '\n');
                    // get save_path
                    std::getline(std::cin, save_path);
                    //std::cin.ignore(INT_MAX, '\n');
                    // add torrent, print result
                    std::cout << "RESULT: " << (add_magnet(magnet_url, save_path) ? "true" : "false") << "\n";
               }
          }

          if (c == 'q') break;

          std::cout << "count: " << count++ << "\n";


          int terminal_width = 80;

          #ifndef _WIN32
          {
               winsize size;
               ioctl(STDOUT_FILENO, TIOCGWINSZ, (char*)&size);
               terminal_width = size.ws_col;

               if (terminal_width < 64)
                    terminal_width = 64;
          }
          #endif

          session_status sess_stat = ses.status();
          std::string out;
          char str[500];
          int torrent_index = 0;
          torrent_handle active_handle;
          for (handles_t::iterator i = handles.begin();
          i != handles.end(); ++torrent_index)
          {
               torrent_handle& h = i->second;
               if (!h.is_valid())
               {
                    handles.erase(i++);
                    continue;
               }
               else
               {
                    ++i;
               }

               /*
               count: 9
               *0  ubuntu-10.10-desktop-i386.iso             downloading   down: (298.kB) up: 3.43kB/s (14.6kB) swarm:  129:   8  bw queue: (0|0) all-time (Rx: 250.kB Tx:       ) seed rank: 0
               progress  : 20363       Bytes   0.00% -----------------------------------                                                                                                                                                                                                                 ]
               peers: 12 (95) seeds: 8 distributed copies: 10.00 sparse regions: 1 download: 30.5kB/s next announce: 00:00:00 tracker: http://denis.stalker.h3q.com:6969/announce
               */

               char const* term = "";
               if (active_torrent == torrent_index)
               {
                    out += esc("7");
                    out += "*";
               }
               else
               {
                    out += " ";
               }

               int queue_pos = h.queue_position();
               if (queue_pos == -1) out += "-  ";
               else
               {
                    snprintf(str, sizeof(str), "queue pos: %-3d\n", queue_pos);
                    out += str;
               }

               if (h.is_paused()) out += esc("34");
               else out += esc("37");

               std::string name = h.name();
               if (name.size() > 40) name.resize(40);
               snprintf(str, sizeof(str), "%-40s %s ", name.c_str(), term);
               out += str;

               torrent_status s = h.status();

               bool paused = h.is_paused();
               bool auto_managed = h.is_auto_managed();
               bool sequential_download = h.is_sequential_download();

               if (!s.error.empty())
               {
                    out += esc("31");
                    out += "error ";
                    out += s.error;
                    out += esc("0");
                    out += "\n";
                    continue;
               }

               int seeds = 0;
               int downloaders = 0;

               if (s.num_complete >= 0) seeds = s.num_complete;
               else seeds = s.list_seeds;

               if (s.num_incomplete >= 0) downloaders = s.num_incomplete;
               else downloaders = s.list_peers - s.list_seeds;

               if (s.state != torrent_status::queued_for_checking && s.state != torrent_status::checking_files)
               {
                    snprintf(str, sizeof(str), "%-13s down: (%s%s%s) up: %s%s%s (%s%s%s) swarm: %4d:%4d"
                    "  bw queue: (%d|%d) all-time (Rx: %s%s%s Tx: %s%s%s) seed rank: %x%s\n"
                    , (paused && !auto_managed)?"paused":(paused && auto_managed)?"queued":state_str[s.state]
                    , esc("32"), add_suffix(s.total_download).c_str(), term
                    , esc("31"), add_suffix(s.upload_rate, "/s").c_str(), term
                    , esc("31"), add_suffix(s.total_upload).c_str(), term
                    , downloaders, seeds
                    , s.up_bandwidth_queue, s.down_bandwidth_queue
                    , esc("32"), add_suffix(s.all_time_download).c_str(), term
                    , esc("31"), add_suffix(s.all_time_upload).c_str(), term
                    , s.seed_rank, esc("0"));
                    out += str;

                    if (torrent_index != active_torrent && s.state == torrent_status::seeding) continue;
                    char const* progress_bar_color = "33"; // yellow
                    if (s.state == torrent_status::downloading_metadata)
                    {
                         progress_bar_color = "35"; // magenta
                    }
                    else if (s.current_tracker.empty())
                    {
                         progress_bar_color = "31"; // red
                    }
                    else if (sess_stat.has_incoming_connections)
                    {
                         progress_bar_color = "32"; // green
                    }

                    snprintf(str, sizeof(str), "     %-10s: %s%-11"PRId64"%s Bytes %6.2f%% %s\n"
                    , sequential_download?"sequential":"progress"
                    , esc("32"), s.total_done, esc("0")
                    , s.progress_ppm / 10000.f
                    , progress_bar(s.progress_ppm / 1000, terminal_width - 43, progress_bar_color).c_str());
                    out += str;
               }
               else
               {
                    snprintf(str, sizeof(str), "%-13s %s\n"
                    , state_str[s.state]
                    , progress_bar(s.progress_ppm / 1000, terminal_width - 43 - 20, "35").c_str());
                    out += str;
               }

               if (true && s.progress_ppm < 1000000 && s.progress > 0)
               {
                    out += "     ";
                    out += piece_bar(s.pieces, terminal_width - 7);
                    out += "\n";
               }

               if (s.state != torrent_status::queued_for_checking && s.state != torrent_status::checking_files)
               {
                    boost::posix_time::time_duration t = s.next_announce;
                    snprintf(str, sizeof(str)
                    , "     peers: %s%d%s (%s%d%s) seeds: %s%d%s distributed copies: %s%4.2f%s "
                    "sparse regions: %d download: %s%s%s next announce: %s%02d:%02d:%02d%s "
                    "tracker: %s%s%s\n"
                    , esc("37"), s.num_peers, esc("0")
                    , esc("37"), s.connect_candidates, esc("0")
                    , esc("37"), s.num_seeds, esc("0")
                    , esc("37"), s.distributed_copies, esc("0")
                    , s.sparse_regions
                    , esc("32"), add_suffix(s.download_rate, "/s").c_str(), esc("0")
                    , esc("37"), t.hours(), t.minutes(), t.seconds(), esc("0")
                    , esc("36"), s.current_tracker.c_str(), esc("0"));
                    out += str;
               }

               if (torrent_index != active_torrent) continue;
               active_handle = h;

               std::cout << out << "\n";
          }



          std::cout.flush();
     }

     printf("saving session state\n");
     {
          entry session_state;
          ses.save_state(session_state);

          std::vector<char> out;
          bencode(std::back_inserter(out), session_state);
          save_file(".ses_state", out);
     }

	return 0;
}
