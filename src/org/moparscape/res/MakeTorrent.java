package org.moparscape.res;
/*
 * Copyright (C) 2012  moparisthebest
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

import org.moparscape.Debug;
import org.moparscape.classloader.CRCClassLoader;
import org.moparscape.res.impl.Downloader;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MakeTorrent {

    private long crc = 0;
    private File torrentFile = null;
    private File sharedFile = null;

    private String infoHash = null;

    public static MakeTorrent askForFile(Component parent) {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (fc.showOpenDialog(parent) != JFileChooser.APPROVE_OPTION) {
            System.out.println("Open command cancelled by user.");
            return null;
        }

        return new MakeTorrent(fc.getSelectedFile());
    }

    public MakeTorrent(String sharedFile) {
        this(new File(sharedFile));
    }

    public MakeTorrent(File sharedFile) {
        this(sharedFile, "udp://tracker.moparisthebest.com:2710/announce", "http://tracker.moparisthebest.com/announce");
    }

    public MakeTorrent(File sharedFile, String... announceURL) {
        this.sharedFile = sharedFile;
        String absolutePath = sharedFile.getAbsolutePath();
        System.out.println("Creating torrent from: " + absolutePath);
        torrentFile = new File(absolutePath + ".torrent");
        try {
            this.createTorrent(announceURL);
        } catch (Exception e) {
            System.out.println("Creating torrent failed: " + e.getMessage());
            Debug.debug(e);
            return;
        }
        // now calculate and print info about the torrent, like the CRC
        try {
            if (absolutePath.toLowerCase().endsWith(".jar") || absolutePath.toLowerCase().endsWith(".jar.gz")) {
                System.out.println("Detected jar file, calculating CRC with CRCClassLoader");
                crc = new CRCClassLoader(absolutePath).getCRC();
            } else if (Downloader.supportsExtraction(absolutePath)) {
                System.out.println("Detected file to extract, calculating CRC of extracted files only.");
                crc = Downloader.crcExtractFile(absolutePath);
                // debugging stuff below, it should (and currently does) produce the same CRC
                /*
                System.out.println("initial crc: "+crc);
                File tmpDir = Downloader.createTempDir();
                if(Downloader.extractFile(absolutePath, tmpDir.getAbsolutePath()))
                    crc = crcFile(tmpDir.getAbsolutePath());
                System.out.println("later crc: "+crc + " temp dir: "+tmpDir.getAbsolutePath());
                */
            }
            // if crc is still 0, just calculate the CRC of the sharedFile itself
            if (crc == 0)
                crc = crcFile(absolutePath);

        } catch (Exception e) {
            System.out.println("Calculating CRC for torrent failed: " + e.getMessage());
            Debug.debug(e);
            return;
        }
        System.out.println("CRC of torrent: " + crc);
        String magnet = String.format("magnet:?xt=urn:sha1:%s&dn=%s", infoHash, urlEncode(sharedFile.getName()));
        for (String tracker : announceURL)
            magnet += "&tr=" + urlEncode(tracker);
        System.out.println("magnet link: " + magnet);
    }

    public static String urlEncode(String url) {
        try {
            return URLEncoder.encode(url, "UTF-8");
        } catch (Exception e) {
            return url;
        }
    }

    public static long crcFile(String file) {
        ChecksumInfo ci = new ChecksumInfo();
        ci.checksumMatch(file);
        return ci.getChecksum();
    }

    private void encodeObject(Object o, OutputStream out) throws IOException {
        if (o instanceof String)
            encodeString((String) o, out);
        else if (o instanceof Map)
            encodeMap((Map) o, out);
        else if (o instanceof byte[])
            encodeBytes((byte[]) o, out);
        else if (o instanceof String[])
            encodeStringArray((String[]) o, out);
        else if (o instanceof Number)
            encodeLong(((Number) o).longValue(), out);
        else
            throw new Error("Unencodable type");
    }

    private void encodeLong(long value, OutputStream out) throws IOException {
        out.write('i');
        out.write(Long.toString(value).getBytes("US-ASCII"));
        out.write('e');
    }

    private void encodeBytes(byte[] bytes, OutputStream out) throws IOException {
        out.write(Integer.toString(bytes.length).getBytes("US-ASCII"));
        out.write(':');
        out.write(bytes);
    }

    private void encodeStringArray(String[] list, OutputStream out) throws IOException {
        out.write('l');
        out.write('l');

        for (String str : list)
            encodeString(str, out);

        out.write('e');
        out.write('e');
    }

    private void encodeString(String str, OutputStream out) throws IOException {
        encodeBytes(str.getBytes("UTF-8"), out);
    }

    private void encodeMap(Map<String, Object> map, OutputStream out) throws IOException {
        // Sort the map. A generic encoder should sort by key bytes
        SortedMap<String, Object> sortedMap = new TreeMap<String, Object>(map);
        out.write('d');
        for (String key : sortedMap.keySet()) {
            encodeString(key, out);
            encodeObject(sortedMap.get(key), out);
        }
        out.write('e');
    }

    private byte[] hashPieces(File file, int pieceLength) throws IOException {
        MessageDigest sha1;
        try {
            sha1 = MessageDigest.getInstance("SHA");
        } catch (NoSuchAlgorithmException e) {
            throw new Error("SHA1 not supported");
        }
        InputStream in = new FileInputStream(file);
        ByteArrayOutputStream pieces = new ByteArrayOutputStream();
        byte[] bytes = new byte[pieceLength];
        int pieceByteCount = 0, readCount = in.read(bytes, 0, pieceLength);
        while (readCount != -1) {
            pieceByteCount += readCount;
            sha1.update(bytes, 0, readCount);
            if (pieceByteCount == pieceLength) {
                pieceByteCount = 0;
                pieces.write(sha1.digest());
            }
            readCount = in.read(bytes, 0, pieceLength - pieceByteCount);
        }
        in.close();
        byte[] sha1Digest = sha1.digest();
        this.infoHash = new java.math.BigInteger(1, sha1Digest).toString(16);
        if (pieceByteCount > 0)
            pieces.write(sha1Digest);
        return pieces.toByteArray();
    }

    public void createTorrent(String... announceURL) throws IOException {
        final int pieceLength = 512 * 1024;
        Map<String, Object> info = new HashMap<String, Object>();
        info.put("name", sharedFile.getName());
        info.put("length", sharedFile.length());
        info.put("piece length", pieceLength);
        info.put("pieces", hashPieces(sharedFile, pieceLength));
        Map<String, Object> metainfo = new HashMap<String, Object>();
        if (announceURL != null && announceURL.length > 0) {
            metainfo.put("announce", announceURL[0]);
            // todo: this currently doesn't work
            if (announceURL.length > 1)
                metainfo.put("announce-list", announceURL);
        }
        metainfo.put("created by", "libtorrent");
        metainfo.put("creation date", 1325820676);
        metainfo.put("info", info);
        OutputStream out = new FileOutputStream(torrentFile);
        encodeMap(metainfo, out);
        out.close();
    }

    public static void main(String[] args) throws Exception {
        Debug.debug = true;
        //MakeTorrent.askForFile(null);
        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/cachedump/minimal317.9.zip");
        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/cachedump/minimal317.9.zip.gz");
        System.out.println("my crc: " + MakeTorrent.crcFile("/home/mopar/onefifty/cachetest/minimal317"));

        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/dist/client317.jar");
        System.out.println("old CRC of jar: 48487200");

        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/dist/client317.jar.gz");
    }
}
