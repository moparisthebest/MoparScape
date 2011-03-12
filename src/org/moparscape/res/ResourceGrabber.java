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

package org.moparscape.res;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * This class is meant to retrieve resources from a variety of URLs, including all supported by Java in addition to
 * magnet links, and torrent files both locally and at http and https URLs.
 * <p/>
 * Torrent support is provided through the native java_client powered by libtorrent-rasterbar, the correct executable
 * for your platform is automatically checked for validity and downloaded via HTTP if need be.
 * <p/>
 * This class will refuse to download or extract files of certain extensions, currently including:
 * (exe|bat|cmd|com|sh|bash)
 * This is for security reasons.  The only exception to this rule is it will download java_client.exe for internal
 * purposes, but will only run it if the CRC is correct.
 * <p/>
 * This class is currently NOT thread-safe, so if you try and use it in a multi-threaded environment it will almost
 * certainly break in unexpected and bad ways.  Synchronize around it if you must.
 *
 * @author moparisthebest
 */
public class ResourceGrabber {

    private static final String javaClientLocation = "/tmp/";
    private static final String javaClientURL = "http://www.moparscape.org/libs/";

    public static void main(String[] args) throws IOException {
        //downloadHTTP("https://www.moparscape.org/libs/client.zip.gz", "/home/mopar/tests/extest");
        //extractFile("/home/mopar/tests/extest/client.zip.gz", "/home/mopar/tests/extest/");
        download("https://www.moparscape.org/libs/client.zip.gz", "/home/mopar/tests/extest", true, 98233333, new String[]{"client_test.linux.x86",  "client_test.osx.i386"});
        download("https://www.moparscape.org/libs/client.zip.gz", "/home/mopar/tests/extest", true, 98233333, new String[]{"combined"});
    }

    /**
     * Downloads resource specified by url to savePath.
     *
     * @param url      This can be any URL Java can natively handle, in addition to magnet links, and torrent files both locally and at http and https URLs.
     * @param savePath Directory to save the URL to.
     * @throws IOException Passed from calls this method makes.
     */
    public static void download(String url, String savePath) throws IOException {
        download(url, savePath, false);
    }

    /**
     * Downloads resource specified by url to savePath, then extracts the downloaded file. Current supported types are .zip.gz, .zip, and .gz.
     *
     * @param url      This can be any URL Java can natively handle, in addition to magnet links, and torrent files both locally and at http and https URLs.
     * @param savePath Directory to save the URL to, and extract the supported files to.
     * @throws IOException Passed from calls this method makes.
     */
    public static void downloadExtract(String url, String savePath) throws IOException {
        download(url, savePath, true);
    }

    public static void download(String url, String savePath, boolean extract, long crc, String[] fileList) throws IOException {
        if (!savePath.endsWith("/"))
            savePath += "/";
        // checksum all files in the filelist
        CRC32 crc32 = new CRC32();
        OutputStream os = new NullOutputStream();
        for (String file : fileList) {
            System.out.println("crc so far: "+crc32.getValue());
            writeStream(new ChecksumInputStream(new FileInputStream(savePath + file), crc32), os);
        }
        String s = "CRC checksum failed. crc:" + crc32.getValue() + " expected:" + crc;
        System.out.println(s);
    }

    public static void download(String url, String savePath, boolean extract) throws IOException {
        if (isTorrent(url)) {

        } else {
            String toExtract = downloadHTTP(url, savePath);
            if (extract)
                extractFile(toExtract, savePath);
        }
    }



}
