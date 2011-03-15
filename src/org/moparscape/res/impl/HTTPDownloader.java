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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 3/12/11
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class HTTPDownloader extends Downloader {

    public void download(final String url, final String savePath, final DownloadListener callback) {
        new Thread() {

            public void run() {
                try {
                    // first make savedTo dir
                    new File(savePath).mkdirs();
                    String sp = savePath;
                    if (!sp.endsWith("/"))
                        sp += "/";

                    String savedTo = sp + url.substring(url.lastIndexOf('/') + 1);
                    URLConnection uc = new URL(url).openConnection();
                    if (uc instanceof HttpURLConnection) {
                        String userAgent = System.getProperty("http.agent");
                        if (userAgent == null)
                            userAgent = "Mozilla/5.0 ResourceGrabber";
                        uc.setRequestProperty("User-Agent", userAgent);
                    }
                    long length = uc.getContentLength();
                    InputStream in = uc.getInputStream();

                    if (callback != null) {
                        callback.starting("Downloading " + url, length, "to " + savedTo + "...");
                        in = new ProgressInputStream(in, callback);
                    }

                    writeStream(in, new FileOutputStream(savedTo));

                    if (callback != null) {
                        callback.finished(sp, savedTo);
                        callback.stopped();
                    }
                } catch (IOException e) {
                    if (callback != null)
                        callback.error("Error downloading file: " + url);
                }
            }
        }.start();
    }
}
