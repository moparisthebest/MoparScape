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

import org.moparscape.res.ChecksumInfo;
import org.moparscape.res.DownloadListener;

import java.net.MalformedURLException;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 4/22/11
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class BTDownloader extends Downloader {

    private final Object lock = this;

    private String remoteBinDir = "http://www.moparscape.org/libs/";
    private String remoteBinSuffix = ".gz";
    private String binDir = "/home/mopar/.moparscape/bin/";
    private String binName = "java_client.";

    private Process proc = null;
    private HashMap<String, DownloadListener> activeDls = new HashMap<String, DownloadListener>();

    //private synchronized boolean startProcess()

    @Override
    public void download(String url, String savePath, DownloadListener callback) {
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
                    if (!osName.contains("linux"))
                        System.out.println("ATTENTION: Could not find a supported OS/Architecture, trying the Linux executable...");
                    binName += "linux.x86";
                    crc = 9089203;
                }

                try {
                    if(!callback.download(remoteBinDir + binName + remoteBinSuffix, binDir, true, new ChecksumInfo(crc, new String[]{binName}))){
                        callback.error("Failed to download '"+remoteBinDir + binName + remoteBinSuffix+"', cannot continue.", null);
                        return;
                    }

                } catch (MalformedURLException e) {
                    callback.error("Invalid URL", e);
                    return;
                }


            }
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
