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

import org.moparscape.res.Base32;
import org.moparscape.res.ChecksumInfo;
import org.moparscape.res.DownloadListener;

import java.io.*;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

import static org.moparscape.res.DownloadListener.Status;
import static org.moparscape.res.DownloadListener.Status.*;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 4/22/11
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class BTDownloader extends Downloader {

    private static final boolean devMode = false;

    private final Object lock = this;
    private static final String delim = ":";
    private static final int delay = 500; //milliseconds
    private static final float requiredSeedRatio = 2;

    private String remoteBinDir = "http://www.moparscape.org/libs/";
    private String remoteBinSuffix = ".gz";
    private String binDir;
    private String binName = "java_client.";
    private String programArgs = "";

    // on windows, this needs to be \n, since getline() is used
    // on all other platforms, we just read a single character
    // so this should be empty
    private String commandAppend = "";

    private Process proc = null;
    private BufferedReader stdin = null;
    private OutputStreamWriter stdout = null;
    private ReadThread readThread = null;
    private HashMap<String, DownloadListener> activeDls = new HashMap<String, DownloadListener>();

    public BTDownloader(String binDir) {
        new File(binDir).mkdirs();
        if (!binDir.endsWith("/"))
            binDir += "/";
        this.binDir = binDir;
        if (devMode) {
            this.binDir = "/home/mopar/IdeaProjects/MoparScape4/java_client/dist/";
            programArgs = "-b -d 100 -D 100 -f /home/mopar/onefifty/java_client.log";
        }
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                //if(true) return;
                shutdownProcess();
            }
        });
    }

    @Override
    public void destroy() {
        this.shutdownProcess();
    }

    private void shutdownProcess() {
        this.shutdownProcess(null);
    }

    private void shutdownProcess(Exception cause) {
        synchronized (lock) {
            if (readThread != null) {
                // stop reading thread (this thread)
                readThread.stopThread();
                readThread = null;
                //p.waitFor();
            }
            if (proc != null) {
                try {
                    inputCommands("q");
                } catch (IOException e) {
                    // just ignore, it probably already shut down
                }
                Process p = proc;
                proc = null;
                stdin = null;
                stdout = null;

                try {
                    System.out.println("java_client exit code: " + p.waitFor());
                } catch (InterruptedException e) {
                    // guess we should assume proc ended, even though the call to waitFor was interrupted...
                }
                // lets be sure to destroy it too
                p.destroy();
            }
            // set error status for all activeDls and remove them, if the JVM isn't shutting down
            if (cause != null && !activeDls.isEmpty()) {
                for (DownloadListener dl : activeDls.values()) {
                    dl.error("I think java_client process ended? Aborting all torrent downloads.", cause);
                }
            }
        }
    }

    private synchronized String readNextTag(String tag) throws IOException {
        return readNextTag(tag, null);
    }

    private synchronized String readNextTag(String tag, String fallback) throws IOException {
        //System.out.println("in readNextTag, tag: " + tag);
        String line = null;
        while ((line = stdin.readLine()) != null) {
            //if (line.startsWith(tag))  System.out.println("debug line: " + line);
            if (line.startsWith(tag))
                return line.split(delim)[1].trim();
            else if (fallback != null && line.startsWith(fallback))
                return null;
        }
        throw new IOException("stream is over? so soon? process must have ended...");
    }

    private synchronized void inputCommands(String... commands) throws IOException {
        commands[0] += commandAppend;
        for (String command : commands)
            stdout.write(command, 0, command.length());
        stdout.flush();
    }

    @Override
    public void download(String url, String savePath, DownloadListener callback) {
        if (callback == null)
            return;
        new File(savePath).mkdirs();
        if (url.startsWith("http")) {
            // then have callback download it first
            try {
                String torrentSavePath = savePath + "torrent/";
                File tspFile = new File(torrentSavePath);
                tspFile.mkdirs();
                if (!callback.download(url, torrentSavePath, true, new ChecksumInfo(), this)) {
                    throw new Exception("Download failed");
                }
                url = tspFile.listFiles(new FilenameFilter(){
                    public boolean accept(File dir, String name) {
                        return name.toLowerCase().endsWith(".torrent");
                    }
                })[0].getAbsolutePath();
                System.out.println("new URL to download: "+url);
            } catch (Exception e) {
                callback.error("Failed to download .torrent file, cannot continue.", e);
                return;
            }
        }
        synchronized (lock) {
            // if the download is already running, return
            if (activeDls.containsKey(url))
                return;
            // if the process hasn't been started yet, boot it up
            if (proc == null) {
                String osName = System.getProperty("os.name").toLowerCase();
                //osName = "mac";
                //osName = "win";

                long crc;
                // if it's windows, run 32-bit windows executable
                if (osName.contains("win")) {
                    binName += "win32.exe";
                    crc = BTDownloaderCRCs.WINDOWS;
                    commandAppend = "\n";
                    // if it's a mac, we want to either ppc or i386
                } else if (osName.contains("mac")) {
                    String osArch = System.getProperty("os.arch").toLowerCase();
                    if (osArch.contains("ppc")) {
                        binName += "osx.ppc";
                        crc = BTDownloaderCRCs.OSXPPC;
                    } else {
                        binName += "osx.i386";
                        crc = BTDownloaderCRCs.OSX386;
                    }
                } else {
                    // it should also work for FreeBSD and some others that support Linux executables
                    if (!osName.contains("linux"))
                        System.out.println("ATTENTION: Could not find a supported OS/Architecture, trying the Linux executable...");
                    binName += "linux.x86";
                    crc = BTDownloaderCRCs.LINUX;
                }
                crc = BTDownloaderCRCs.getCRC((int) crc);

                // now that we have the binary name, verify we have the latest and the CRC is correct, if not in devMode
                if (!devMode)
                    try {
                        if (!callback.download(remoteBinDir + binName + remoteBinSuffix, binDir, true, new ChecksumInfo(crc, new String[]{binName}), this)) {
                            callback.error("Failed to download '" + remoteBinDir + binName + remoteBinSuffix + "', cannot continue.", null);
                            return;
                        }

                    } catch (Exception e) {
                        callback.error("java_client bin download error.", e);
                        return;
                    }

                // now we have the correct binary, so lets run the thing!
                if (programArgs == null)
                    programArgs = "";
                String[] pargs = programArgs.split(" ");
                if (pargs[0].isEmpty())
                    pargs = new String[0];

                String[] cmd = new String[pargs.length + 3];
                // program name (first)
                cmd[0] = binDir + binName;
                // set file to executable, just to be safe
                new File(cmd[0]).setExecutable(true);
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
                try {
                    inputCommands("a", url + "\n", savePath + "\n");
                } catch (IOException e) {
                    activeDls.put("doesn't matter, shutting down", callback);
                    shutdownProcess(e);
                    return;
                }
            }

            String result;
            try {
                result = readNextTag("result");
            } catch (IOException e) {
                activeDls.put("doesn't matter, shutting down", callback);
                shutdownProcess(e);
                return;
            }
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
        private static final String delim = "delim";
        private final String[] tagNames = new String[]{"name", "state", "total_download", "total_upload",
                "total_upload_ratio", "download_rate", "upload_rate", "progress_ppm", "save_path", "file_list"};
        //private String[] tags = new String[tagNames.length];
        // a load factor of 2 with the max size of the hashmap should stop this from ever being resized, I think.
        private Map<String, String> tags = new HashMap<String, String>(tagNames.length, 2);

        @Override
        public void run() {
            while (run) {
                synchronized (lock) {
                    if (!run)
                        return;
                    try {
                        // refresh the info
                        inputCommands("r");
                        String hash = null;
                        while ((hash = readNextTag("info_hash", "done")) != null) {
                            DownloadListener callback = activeDls.get(hash);
                            if (callback == null)
                                continue;
                            // read all the tag names we are interested in
                            for (String tagName : tagNames) {
                                String value = readNextTag(tagName, delim);
                                // if value is null, then we have reached delim, or an error has occured, either way, leave
                                if (value == null)
                                    break;
                                tags.put(tagName, value);
                            }
                            String state = tags.get("state");
                            // if we are not seeding
                            if (state != null && !state.equals("seeding") && !state.equals("finished")) {
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
                                Status status = callback.getStatus();
                                if ((status == RUNNING || status == STARTING)) {
                                    // if we are seeding, then we are finished, but not yet stopped..
                                    //for (String s : tags.get("file_list").split(", ")) System.out.println("extracting file: " + s);
                                    callback.finished(tags.get("save_path"), tags.get("file_list").split(", "));
                                    callback.reset("Seeding", (long) (requiredSeedRatio * 100), "from " + tags.get("save_path") + "...");
                                } else if (status == FINISHED) {
                                    // then we need to calculate if we have seeded enough to stop the torrent
                                    try {
                                        float total_upload_ratio = Float.parseFloat(tags.get("total_upload_ratio"));
                                        // if this is true, we are going to stop the torrent
                                        if (total_upload_ratio >= requiredSeedRatio) {
                                            inputCommands("d", hash + "\n");
                                            // if torrent removal is successful
                                            String result = readNextTag("result", delim);
                                            if (result != null && result.equals("true")) {
                                                callback.stopped();
                                                activeDls.remove(hash);
                                                // if there are no more activeDls, might as well shut down the torrent client
                                                if (activeDls.isEmpty())
                                                    shutdownProcess();
                                            }
                                        } else {
                                            // show the seeding progress here...
                                            String name = tags.get("name");
                                            if (name != null && name.length() != 0)
                                                callback.setTitle("Seeding " + name);
                                            callback.setProgress((int) (total_upload_ratio * 100));
                                            String extraInfo = new Formatter().format(template,
                                                    state,
                                                    tags.get("total_download"),
                                                    tags.get("download_rate"),
                                                    tags.get("total_upload"),
                                                    tags.get("upload_rate")
                                            ).toString();
                                            //System.out.println("extraInfo: "+extraInfo);
                                            callback.setExtraInfo(extraInfo);
                                        }
                                    } catch (NumberFormatException e) {
                                        // just ignore this and keep it running
                                    }
                                }
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("IOException caught, I think process ended? Aborting all torrent downloads.");
                        //e.printStackTrace();
                        shutdownProcess(e);
                    }
                    try {
                        if (run)
                            Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        // just ignore
                    }
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
        if (url == null)
            return false;
        url = url.toLowerCase();
        return url.startsWith("magnet:") || url.endsWith(".torrent");
    }

    @Override
    public String uniqueFoldername(String url) {
        if (url == null || !supportsURL(url))
            return null;
        url = url.toLowerCase();
        if (url.startsWith("magnet:")) {
            boolean base32 = url.contains("xt=urn:btih:");
            url = url.substring(url.indexOf("xt=") + 3, url.length());
            url = url.substring(0, url.indexOf("&"));
            url = url.substring(url.lastIndexOf(":") + 1, url.length()).toLowerCase();
            if (base32)
                url = new Base32().toSha1(url);
        } else {
            url = url.replaceFirst(".*://", "").replaceAll("/+", ".").replaceAll("(^\\.|\\.$)", "");
        }
        return url + "/";
    }
}
