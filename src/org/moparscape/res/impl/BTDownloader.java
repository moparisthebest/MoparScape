/*
 * Copyright (C) 2011  moparisthebest
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Official forums are http://www.moparscape.org/smf/
 * Email me at admin@moparisthebest.com , I read it but don't usually respond.
 */

package org.moparscape.res.impl;

import org.moparscape.res.DownloadListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 4/22/11
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class BTDownloader extends Downloader {

    private final Object lock = this;
    private static final String delim = ":";
    private static final int delay = 500; //milliseconds

    private String remoteBinDir = "http://www.moparscape.org/libs/";
    private String remoteBinSuffix = ".gz";
    //private String binDir = "/home/mopar/.moparscape/bin/";
    private String binDir = "/home/mopar/biggerdaddy/libtorrent/java_client/dist/";
    private String binName = "java_client.";
    private String programArgs = "";

    private Process proc = null;
    private BufferedReader stdin = null;
    private OutputStreamWriter stdout = null;
    private ReadThread readThread = null;
    private HashMap<String, DownloadListener> activeDls = new HashMap<String, DownloadListener>();

    //private synchronized boolean startProcess()
    private synchronized String readNextTag(String tag) {
        return readNextTag(tag, null);
    }

    private synchronized String readNextTag(String tag, String fallback) {
        System.out.println("in readNextTag, tag: " + tag);
        String line = null;
        try {
            while ((line = stdin.readLine()) != null) {
                System.out.println("debug line: " + line);
                if (line.startsWith(tag))
                    return line.split(delim)[1].trim();
                else if (fallback != null && line.startsWith(fallback))
                    return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        System.out.println("stream is over? so soon?");
        return null;
    }

    private synchronized void inputCommands(String... commands) {
        try {
            for (String command : commands)
                stdout.write(command, 0, command.length());
            stdout.flush();
        } catch (IOException e) {
            e.printStackTrace();
            //return null;
        }
    }

    @Override
    public void download(String url, String savePath, DownloadListener callback) {
        System.out.println("in btdownloader download()");
        if (callback == null)
            return;
        synchronized (lock) {
            // if the download is already running, return
            if (activeDls.containsKey(url))
                return;
            // if the process hasn't been started yet, boot it up
            if (proc == null) {
                String osName = System.getProperty("os.name").toLowerCase();
                String osArch = System.getProperty("os.arch").toLowerCase();

                long crc;
                // if it's windows, run 32-bit windows executable
                if (osName.contains("win")) {
                    binName += "win32.exe";
                    crc = 9089203;
                    // if it's a mac, we want to either ppc or i386
                } else if (osName.contains("mac")) {
                    if (osArch.contains("ppc")) {
                        binName += "osx.ppc";
                        crc = 9089203;
                    } else {
                        binName += "osx.i386";
                        crc = 9089203;
                    }
                } else {
                    // it should also work for FreeBSD and some others that support Linux executables
                    if (!osName.contains("linux"))
                        System.out.println("ATTENTION: Could not find a supported OS/Architecture, trying the Linux executable...");
                    binName += "linux.x86";
                    crc = 9089203;
                }
                /*
              // now that we have the binary name, verify we have the latest and the CRC is correct
              try {
                  if (!callback.download(remoteBinDir + binName + remoteBinSuffix, binDir, true, new ChecksumInfo(crc, new String[]{binName}))) {
                      callback.error("Failed to download '" + remoteBinDir + binName + remoteBinSuffix + "', cannot continue.", null);
                      return;
                  }

              } catch (MalformedURLException e) {
                  callback.error("Invalid URL", e);
                  return;
              }  */

                // now we have the correct binary, so lets run the thing!
                if (programArgs == null)
                    programArgs = "";
                String[] pargs = programArgs.split(" ");
                if (pargs[0].isEmpty())
                    pargs = new String[0];

                String[] cmd = new String[pargs.length + 3];
                // program name (first)
                cmd[0] = binDir + binName;
                // url (second to last)
                cmd[cmd.length - 2] = url;
                // savePath (last)
                cmd[cmd.length - 1] = savePath;
                // now fill in the middle
                System.arraycopy(pargs, 0, cmd, 1, pargs.length);
                //for(String arg: cmd)
                //    System.out.println("cmd: "+arg);
                try {
                    proc = Runtime.getRuntime().exec(cmd);
                    stdin = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                    stdout = new OutputStreamWriter(proc.getOutputStream());
                    // start reading thread
                    readThread = new ReadThread();
                    readThread.start();
                } catch (IOException e) {
                    callback.error("Program Execution failed.", e);
                    return;
                }

                // read startup code here, then add to activeDls if successful, should be done in dedicated thread

            } else { // then the process is already running, so just add the download (maybe same code as right above this)
                // start the torrent
                // syntax 'a torrenturl\n savepath\n'
                inputCommands("a", url + "\n", savePath + "\n");
            }

            String result = readNextTag("result");
            if (result == null || result.length() != 40) {
                callback.error("Adding torrent has failed.", null);
                return;
            }
            callback.starting("Downloading " + url, 1000000, "to " + savePath + "...");
            activeDls.put(result, callback);

        }
    }

    private class ReadThread extends Thread {

        private boolean run = true;
        private static final String template = "State: %s<br>Down: %s (%s) Up: %s (%s)";
        private final String[] tagNames = new String[]{"name", "state", "total_download", "total_upload",
                "download_rate", "upload_rate", "progress_ppm"};
        //private String[] tags = new String[tagNames.length];
        // a load factor of 2 with the max size of the hashmap should stop this from ever being resized, I think.
        private Map<String, String> tags = new HashMap<String, String>(tagNames.length, 2);

        private int counter = 0;

        @Override
        public void run() {
            while (run) {
                synchronized (lock) {
                    if (!run)
                        return;
                    // refresh the info
                    System.out.println("Sending r");
                    inputCommands("r");
                    String hash = null;
                    while ((hash = readNextTag("info_hash", "done")) != null) {
                        DownloadListener callback = activeDls.get(hash);
                        if (callback == null)
                            continue;
                        for (String tagName : tagNames)
                            tags.put(tagName, readNextTag(tagName, "delim"));
                        String state = tags.get("state");
                        // if we are not seeding
                        if (state != null && !state.equals("seeding")) {
                            String extraInfo = new Formatter().format(template,
                                    state,
                                    tags.get("total_download"),
                                    tags.get("download_rate"),
                                    tags.get("total_upload"),
                                    tags.get("upload_rate")
                            ).toString();
                            //System.out.println("extraInfo: "+extraInfo);
                            String name = tags.get("name");
                            if (name != null && name.length() != 0)
                                callback.setTitle("Downloading " + name);
                            callback.setExtraInfo(extraInfo);
                            callback.setProgress(Integer.parseInt(tags.get("progress_ppm")));
                        } else {
                            // if we are seeding, then we are finished, but not yet stopped..
                            if(callback.)
                            callback.finished();
                        }
                    }
                }
                try {
                    if (counter++ == -1) {
                        inputCommands("q");
                        System.out.println("exit code: " + proc.waitFor());
                        System.exit(0);
                    }
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    // just ignore
                }
            }
        }

        public void stopThread() {
            run = false;
        }
    }

    /**
     * Reports whether a url describes a torrent or not.
     *
     * @param url URL to resource.
     * @return true if this is a torrent, false otherwise.
     */
    @Override
    public boolean supportsURL(String url) {
        return url.startsWith("magnet:") || url.endsWith(".torrent");
    }
}
