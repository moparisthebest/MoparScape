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
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 3/12/11
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class URLDownloader extends Downloader {

    public void download(final String url, final String savePath, final DownloadListener callback) {

        //System.out.printf("URLDownloader: url: '%s', savePath: '%s'\n", url, savePath);

        if (badExtension(url)) {
            if (callback != null)
                callback.error("Bad extension, refusing to download: " + url, null);
            return;
        }

        new Thread() {

            public void run() {
                try {
                    String saveTo = saveTo(url, savePath);
                    URL toDownload = null;
                    try{
                        toDownload = new URL(url);
                    }catch(MalformedURLException e){
                        if(new File(url).exists())
                            toDownload = new URL("file://"+url);
                        else
                            throw e;
                    }
                    URLConnection uc = toDownload.openConnection();
                    if (uc instanceof HttpURLConnection) {
                        String userAgent = System.getProperty("http.agent");
                        if (userAgent == null)
                            userAgent = "Mozilla/5.0 ResourceGrabber";
                        uc.setRequestProperty("User-Agent", userAgent);
                    }
                    long length = uc.getContentLength();
                    InputStream in = uc.getInputStream();

                    if (callback != null) {
                        callback.starting("Downloading " + url, length, "to " + saveTo + "...");
                        in = new ProgressInputStream(in, callback);
                    }

                    writeStream(in, new FileOutputStream(saveTo));

                    if (callback != null) {
                        callback.finished(savePath, new File(saveTo).getName());
                        callback.stopped();
                    }
                } catch (Exception e) {
                    if (callback != null)
                        callback.error("Error downloading file: " + url, e);
                }
            }
        }.start();
    }

    private String saveTo(String url, String savePath) {
        // lets detect how we want to save this, if the path ends in a /, save the file named as-is in that folder
        // but if it ends in anything else, save the file to that file exactly
        String saveTo;
        if (savePath.endsWith("/")) {
            // first make savePath dir
            new File(savePath).mkdirs();
            return savePath + url.substring(url.lastIndexOf('/') + 1);
        } else {
            // create all directories except last file
            new File(savePath.substring(0, savePath.lastIndexOf('/'))).mkdirs();
            return savePath;
        }
    }

    public boolean supportsURL(String url) {
        // if it's a supported URL, return true
        try {
            new URL(url);
            return true;
        } catch (MalformedURLException e) {
            // if it's a file, put a "file://" in front of it
            // or allow files
            return new File(url).exists();
        }
    }

    @Override
    public String uniqueFoldername(String url) {
        if (url == null || !supportsURL(url))
            return null;

        // strip the ending file off (then guessing filenames won't work correctly)
        //url = url.substring(0, url.lastIndexOf('/'));

        url = url.toLowerCase().replaceFirst(".*://", "").replaceAll("/+", ".").replaceAll("(^\\.|\\.$)", "");

        return url + "/";
    }

    @Override
    public void guessFilenames(String url, String savePath, java.util.List<String> files) {
        super.guessFilenames(url, savePath, files);
        String saveTo = saveTo(url, savePath);
        synchronized (files) {
            if (!files.contains(saveTo))
                files.add(saveTo);
        }
    }

        @Override
    public void destroy() {
        // for now, do nothing
        //todo: try to stop all threads running
    }
}
