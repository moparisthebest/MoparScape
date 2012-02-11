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
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class MakeTorrent {

    private long crc = 0;
    private File torrentFile = null;
    private File sharedFile = null;

    //private String[][] announceList = new String[][]{new String[]{"udp://tracker.moparisthebest.com:2710/announce"}, new String[]{"http://tracker.moparisthebest.com/announce"}, new String[]{"udp://exodus.desync.com:6969", "http://exodus.desync.com:6969/announce"}};
    //private String[][] announceList = new String[][]{new String[]{"udp://tracker.moparisthebest.com:2710/announce"}};
    private String[][] announceList = new String[][]{new String[]{"http://tracker.moparisthebest.com:2710/announce"}, new String[]{"http://tracker.moparisthebest.com/announce"}, new String[]{"udp://exodus.desync.com:6969", "http://exodus.desync.com:6969/announce"}};
    private String[] urlList = null;

    private String sha1InfoHash = null;
    private String base32InfoHash = null;

    private String[] magnetLinks = null;

    public MakeTorrent() {
        this((Component) null);
    }

    public MakeTorrent(Component parent) {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (fc.showOpenDialog(parent) != JFileChooser.APPROVE_OPTION) {
            System.out.println("Make Torrent command cancelled by user.");
            return;
        }


        String[] trackers = askForList(parent, "Enter a tracker URL (http/https/udp), otherwise a default list will be used.");
        String[][] announceList = null;
        if (trackers != null) {
            announceList = new String[trackers.length][1];
            for (int i = 0; i < trackers.length; ++i)
                announceList[i][0] = trackers[i];
        }
        this.setup(fc.getSelectedFile(), announceList, askForList(parent, "Enter a webseed URL (http:// or https://)"));
    }

    private String[] askForList(Component parent, String question) {
        question += " (Press Cancel if done)";

        java.util.List<String> list = new ArrayList<String>();

        String newItem = null;
        do {
            if (newItem != null)
                list.add(newItem);
            newItem = JOptionPane.showInputDialog(parent, question);
        } while (newItem != null && !newItem.isEmpty());

        return list.size() == 0 ? null : list.toArray(new String[list.size()]);
    }

    public MakeTorrent(String sharedFile) {
        this(sharedFile, (String[]) null);
    }

    public MakeTorrent(String sharedFile, String... urlList) {
        this(new File(sharedFile), urlList);
    }

    public MakeTorrent(File sharedFile) {
        this(sharedFile, (String[]) null);
    }

    public MakeTorrent(File sharedFile, String... urlList) {
        this(sharedFile, null, urlList);
        //this(sharedFile, new String[][]{new String[]{"udp://tracker.moparisthebest.com:2710/announce", "http://tracker.moparisthebest.com/announce"}}, urlList);
    }

    public MakeTorrent(File sharedFile, String[][] announceList, String[] urlList) {
        this.setup(sharedFile, announceList, urlList);
    }

    private void setup(File sharedFile, String[][] announceList, String[] urlList) {
        this.sharedFile = sharedFile;
        if (announceList != null)
            this.announceList = announceList;
        this.urlList = urlList;

        String absolutePath = sharedFile.getAbsolutePath();
        System.out.println("Creating torrent from: " + absolutePath);
        torrentFile = new File(absolutePath + ".torrent");
        try {
            this.createTorrent();
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
                crc = ChecksumInfo.crcFile(absolutePath);

        } catch (Exception e) {
            System.out.println("Calculating CRC for torrent failed: " + e.getMessage());
            Debug.debug(e);
            return;
        }
        System.out.println("info hash of torrent: " + sha1InfoHash);
        //System.out.println("info hash of torrent: " + new Base32().toSha1(base32InfoHash));
        System.out.println("CRC of torrent: " + crc);
        String magTrackers = "";
        if (this.announceList != null)
            for (String[] trackerList : this.announceList)
                for (String tracker : trackerList)
                    magTrackers += "&tr=" + urlEncode(tracker);
        String[][] magnetTypes = new String[][]{new String[]{"btih", base32InfoHash}, new String[]{"sha1", sha1InfoHash}};
        this.magnetLinks = new String[magnetTypes.length];
        for (int i = 0; i < this.magnetLinks.length; ++i) {
            this.magnetLinks[i] = String.format("magnet:?xt=urn:%s:%s&dn=%s%s", magnetTypes[i][0], magnetTypes[i][1], urlEncode(sharedFile.getName()), magTrackers);
            System.out.println("magnet link: " + this.magnetLinks[i]);
        }
        for(String url: urlList)
            System.out.println("webseed: "+url);
    }

    public String urlEncode(String url) {
        try {
            return URLEncoder.encode(url, "UTF-8");
        } catch (Exception e) {
            return url;
        }
    }

    @SuppressWarnings("unchecked")
    private void bencode(Object o, OutputStream out) throws IOException {
        try {
            if (o instanceof String)
                bencode((String) o, out);
            else if (o instanceof Map)
                bencode((Map<String, Object>) o, out);
            else if (o instanceof Number)
                bencode(((Number) o).longValue(), out);
            else if (o instanceof byte[])
                bencode((byte[]) o, out);
            else if (o instanceof Object[])
                bencode((Object[]) o, out);
            else
                throw new Error("Unencodable type");
        } catch (ClassCastException e) {
            Debug.debug(e);
            throw new Error("Unencodable type (ClassCastException)");
        }
    }

    private void bencode(Object[] list, OutputStream out) throws IOException {
        out.write('l');
        for (Object str : list)
            bencode(str, out);
        out.write('e');
    }

    private void bencode(long value, OutputStream out) throws IOException {
        out.write('i');
        out.write(Long.toString(value).getBytes("US-ASCII"));
        out.write('e');
    }

    private void bencode(String str, OutputStream out) throws IOException {
        bencode(str.getBytes("UTF-8"), out);
    }

    private void bencode(byte[] bytes, OutputStream out) throws IOException {
        out.write(Integer.toString(bytes.length).getBytes("US-ASCII"));
        out.write(':');
        out.write(bytes);
    }

    private void bencode(Map<String, Object> map, OutputStream out) throws IOException {
        // Sort the map. A generic encoder should sort by key bytes
        SortedMap<String, Object> sortedMap = new TreeMap<String, Object>(map);
        out.write('d');
        for (String key : sortedMap.keySet()) {
            bencode(key, out);
            bencode(sortedMap.get(key), out);
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
        if (pieceByteCount > 0)
            pieces.write(sha1.digest());
        return pieces.toByteArray();
    }

    public void createTorrent() throws IOException {
        final int pieceLength = 512 * 1024;
        Map<String, Object> info = new HashMap<String, Object>();
        info.put("name", sharedFile.getName());
        info.put("length", sharedFile.length());
        info.put("piece length", pieceLength);
        info.put("pieces", hashPieces(sharedFile, pieceLength));
        hashInfo(info);
        Map<String, Object> metainfo = new HashMap<String, Object>();
        if (announceList != null && announceList.length > 0 && announceList[0] != null && announceList[0].length > 0) {
            metainfo.put("announce", announceList[0][0]);
            if (announceList.length > 1 || announceList[0].length > 1)
                metainfo.put("announce-list", announceList);
        }
        if (urlList != null && urlList.length > 0)
            metainfo.put("url-list", (urlList.length == 1) ? urlList[0] : urlList);
        //metainfo.put("created by", "libtorrent");
        metainfo.put("created by", "ResourceGrabber");
        //metainfo.put("creation date", 1325820676);
        //metainfo.put("creation date", 1325821361);
        metainfo.put("creation date", System.currentTimeMillis() / 1000L);
        metainfo.put("info", info);
        OutputStream out = new FileOutputStream(torrentFile);
        bencode(metainfo, out);
        out.close();
    }

    public void hashInfo(Object o) throws IOException {
        MessageDigest sha1;
        try {
            sha1 = MessageDigest.getInstance("SHA");
        } catch (NoSuchAlgorithmException e) {
            throw new Error("SHA1 not supported");
        }
        bencode(o, new DigestOutputStream(new NullOutputStream(), sha1));
        byte[] hash = sha1.digest();
        this.base32InfoHash = new Base32().encode(hash);
        this.sha1InfoHash = new java.math.BigInteger(1, hash).toString(16);
    }

    public static void main(String[] args) throws Exception {
        /*
        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/dist/server317.zip", "http://cache.hybridscape.com/minimal317.9.zip", "http://bob.com/tom");
        System.out.println("----------------------------------------------");
        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/dist/torrents/server317.zip", "http://cache.hybridscape.com/minimal317.9.zip", "http://bob.com/tom");
        System.out.println("----------------------------------------------");
        new MakeTorrent("/home/mopar/.moparscape4/servers/default/317/server317.zip", "http://cache.hybridscape.com/minimal317.9.zip", "http://bob.com/tom");
        System.exit(0);
        */
        Debug.debug = true;
        if (args.length < 1) {
            System.out.println("Usage: MakeTorrent file [webseed...]");
            new MakeTorrent();
            return;
        }
        String[] webseeds = new String[args.length - 1];
        System.arraycopy(args, 1, webseeds, 0, webseeds.length);
        new MakeTorrent(args[0], webseeds);
       /*
        //new MakeTorrent();
        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/cachedump/minimal317.9.zip", "http://cache.hybridscape.com/minimal317.9.zip", "http://bob.com/tom");
        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/cachedump/minimal317.9.zip.gz");
        System.out.println("my crc: " + ChecksumInfo.crcFile("/home/mopar/onefifty/cachetest/minimal317"));

        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/dist/client317.jar");
        System.out.println("old CRC of jar: 48487200");

        new MakeTorrent("/home/mopar/IdeaProjects/MoparScape4/dist/client317.jar.gz");
*/
    }
}
