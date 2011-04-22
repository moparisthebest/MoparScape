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

    private String binDir = "";

    private Process proc = null;
    private HashMap<String, DownloadListener> activeDls = new HashMap<String, DownloadListener>();

    //private synchronized boolean startProcess()

    @Override
    public void download(String url, String savePath, DownloadListener callback) {
        synchronized (lock){
            // if the download is already running, return
            if(activeDls.containsKey(url))
                return;
            // if the process hasn't been started yet, boot it up
            if(proc == null){
                String osName = System.getProperty("os.name").toLowerCase();
          String osArch = System.getProperty("os.arch").toLowerCase();
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
