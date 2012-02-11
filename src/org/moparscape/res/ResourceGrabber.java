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

import org.moparscape.Debug;
import org.moparscape.res.impl.BTDownloader;
import org.moparscape.res.impl.Downloader;
import org.moparscape.res.impl.URLDownloader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
 * This class should be thread-safe.
 * <p/>
 * Only one instance of this class needs to be instantiated per-VM.  Currently this is enforced via the constructors.
 *
 * @author moparisthebest
 */
public class ResourceGrabber {
    private static final String fileListFile = "filesToCheck.txt";

    private static ResourceGrabber _instance = null;

    private final Downloader[] downloaders;

    private static final int delay = 1000; //milliseconds
    private static final int errorTicks = 60; // errorTicks * delay is how long errors will stay onscreen

    private JFrame frame = null;
    private javax.swing.Timer timer = null;
    private String title = "Resource Grabber";

    private final List<DlListener> downloadItems = new ArrayList<DlListener>(5);

    // this is only meant to be accessed by getNewUID(), which is synchronized
    private int currentUID = 0;

    public static void main1(String[] args) throws Exception {
        if (args.length == 0 || (args.length % 4) != 0) {
            System.out.println("Usage: ResourceGrabber [[TORRENT|MAGNETURL|URL] SAVE_PATH EXTRACT CRC]\n" +
                    "TORRENT is a path to a .torrent file\n" +
                    "MAGNETURL is a magnet link\n" +
                    "URL is a url to a torrent file\n" +
                    "SAVE_PATH is the absolute path to save the torrent and .resume file to\n" +
                    "EXTRACT is true if you wish to extract the downloaded file\n" +
                    "CRC if not 0 will only download the file if the CRC does not match, it will checksum every file in the save_path recursively.\n\n" +
                    "You can specify as many downloads on the command line as you wish.");
            return;
        }
        ResourceGrabber rg = getResourceGrabber(System.getProperty("user.home") + "/.moparscape/bin/");
        int[] uids = new int[args.length / 4];
        for (int x = 0; x < uids.length; ++x) {
            int argIndex = x * 4;
            String url = args[argIndex];
            String savePath = args[argIndex + 1];
            boolean extract = args[argIndex + 2].equalsIgnoreCase("true");
            long crc = 0;
            try {
                crc = Long.parseLong(args[argIndex + 3]);
            } catch (NumberFormatException e) {

            }
            System.out.println(String.format("Starting download %d, url: '%s' savePath: '%s' extract: '%b' crc: '%d'",
                    x + 1, url, savePath, extract, crc));
            uids[x] = rg.download(url, savePath, extract, crc == 0 ? null : new ChecksumInfo(crc));
            System.out.println("Started download " + (x + 1));
        }
        System.out.println("Started all downloads, now waiting until they all finish!");
        for (int x = 0; x < uids.length; ++x) {
            boolean result = false;
            try {
                result = rg.wait(uids[x]);
            } catch (Exception e) {
                System.out.println(String.format("Download %d failed, here is the exception:", x + 1));
                e.printStackTrace();
                continue;
            }

            if (uids[x] == -1)
                System.out.println(String.format("Download %d finished instantly, CRC must have matched!", x + 1));
            else if (result)
                System.out.println(String.format("Download %d finished successfully!", x + 1));
            else
                System.out.println(String.format("Download %d failed, don't know why...", x + 1));
        }
        System.out.println("All downloads are finished, exiting program...");
    }

    public static void main(String[] args) throws Exception {
        //downloadHTTP("https://www.moparscape.org/libs/client.zip.gz", "/home/mopar/tests/extest");
        //extractFile("/home/mopar/tests/extest/client.zip.gz", "/home/mopar/tests/extest/");
        //download("https://www.moparscape.org/libs/client.zip.gz", "/home/mopar/tests/extest", true, 98233333, new String[]{"client_test.linux.x86",  "client_test.osx.i386"});
        //download("https://www.moparscape.org/libs/client.zip.gz", "/home/mopar/tests/extest", true, 98233333, new String[]{"combined"});
        /*System.out.println("checksum: " + Downloader.checksum("/home/mopar/tests/extest", null, null, true));
        System.out.println("checksum: " + Downloader.checksum("/home/mopar/tests/extest", new Adler32(), null, true));
        System.out.println("checksum: " + Downloader.checksum("/home/mopar/tests/extest", null, new String[]{"client_test.linux.x86", "client.zip.gz"}, true));
        System.out.println("checksum: " + Downloader.checksum("/home/mopar/tests/extest", null, new String[]{"client_test.linux.x86", "client.zip.gz"}, false));
          */
        //System.out.println("filename: " + new URL("http://moparisthebest.com/bob/tom/cache.zip").getFile());
        /*String s = "result: x";
        for(String p : s.split(":"))
            System.out.println("part: '"+p.trim()+"'");
        if(true) return;  */
        ResourceGrabber rg = getResourceGrabber(System.getProperty("user.home") + "/.moparscape/bin/");
        System.out.println("before downloads...");
        rg.download("http://www.moparisthebest.com/downloads/cedegaSRC.tar.gz", "/home/mopar/tests/extest", true, null, true, new CompleteRunnable() {
            @Override
            public void run() {
                System.out.println("download complete bitches! uid: " + this.uid + " exception: " + this.ex);
            }
        });/*
        int clientZipUID = -1;
        try {
            //rg.download("http://www.moparisthebest.com/downloads/cedegaSRC.tar.gz", "/home/mopar/tests/extest", true);
            //rg.download("http://mirror01.th.ifl.net/releases//maverick/ubuntu-10.10-desktop-i386.iso", "/home/mopar/tests/extest", false);
            //Thread.sleep(30000);
            //int clientZipUID = rg.download("https://www.moparscape.org/libs/client.zip.gz", "/home/mopar/tests/extest", true);
            //int clientZipUID = rg.download("https://www.moparscape.org/libs/client.zip.torrent", "/home/mopar/tests/extest", true);
            //int clientZipUID = rg.download("magnet:?xt=urn:btih:a38d02c287893842a32825aa866e00828a318f07&dn=Ubuntu+11.04+%28Final%29&tr=udp%3A%2F%2Ftracker.openbittorrent.com%3A80&tr=udp%3A%2F%2Ftracker.publicbt.com%3A80&tr=udp%3A%2F%2Ftracker.ccc.de%3A80", "/home/mopar/tests/extest");
            clientZipUID = rg.download("magnet:?xt=urn:btih:87171cac4b10b28e8ceb00df18a883bbf3363fca&dn=House+S07E23+Moving+On+HDTV+XviD-2HD+%5Beztv%5D&tr=udp%3A%2F%2Ftracker.openbittorrent.com%3A80&tr=udp%3A%2F%2Ftracker.publicbt.com%3A80&tr=udp%3A%2F%2Ftracker.ccc.de%3A80", "/home/mopar/tests/extest");
        } catch (Exception e) {

        }
        //int clientZipUID = rg.download("magnet:?xt=urn:btih:CDXN5L2YV5FLXVL36GKUTRXIQDOUDKDY&dn=client.zip&tr=udp%3a%2f%2ftracker.openbittorrent.com%3a80", "/home/mopar/tests/dldir");
        System.out.println("returned: '" + rg.wait(clientZipUID) + "' after downloads..."); */

    }

    private ResourceGrabber(String binDir, String title) throws FileNotFoundException {
        if (title != null)
            this.title = title;
        File f = new File(binDir);
        if (!f.exists() && !f.isDirectory() && !f.mkdirs())
            throw new FileNotFoundException();
        if (!binDir.endsWith("/"))
            binDir += "/";
        // order matters here
        //downloaders = new Downloader[]{new BTDownloader(binDir), new URLDownloader()};
        downloaders = new Downloader[]{new URLDownloader()};
    }

    private ResourceGrabber(String binDir) throws FileNotFoundException {
        this(binDir, null);
    }

    public synchronized static ResourceGrabber getResourceGrabber(String binDir, String title) throws FileNotFoundException {
        if (_instance == null)
            _instance = new ResourceGrabber(binDir, title);
        return _instance;
    }

    public synchronized static ResourceGrabber getResourceGrabber() throws IllegalStateException {
        if (_instance == null)
            throw new IllegalStateException("Must call getResourceGrabber method with parameters first.");
        return _instance;
    }

    public synchronized static void destroy(){
        if(_instance == null)
            return;
        synchronized (_instance.downloadItems){
            for (final DlListener dll : _instance.downloadItems) {
                dll.autoRemove = true;
                dll.setStopped();
            }
        }
        for(Downloader d : _instance.downloaders)
            d.destroy();
        _instance = null;
    }

    public static ResourceGrabber getRG() throws IllegalStateException {
        return getResourceGrabber();
    }

    public static ResourceGrabber getResourceGrabber(String binDir) throws FileNotFoundException {
        return getResourceGrabber(binDir, null);
    }

    public boolean waitCatch(int uid) {
        return waitCatch(uid, 0L);
    }

    public boolean waitCatch(int uid, long timeout) {
        return waitCatch(uid, timeout, false);
    }

    public boolean waitCatch(int uid, boolean freeResults) {
        return waitCatch(uid, 0L, freeResults);
    }

    public boolean waitCatch(int uid, long timeout, boolean freeResults) {
        try {
            return this.wait(uid, timeout, freeResults);
        } catch (Exception e) {
            Debug.debug(e);
            return false;
        }
    }

    public boolean wait(int uid) throws Exception {
        return wait(uid, 0L);
    }

    public boolean wait(int uid, long timeout) throws Exception {
        return wait(uid, timeout, false);
    }

    public boolean wait(int uid, boolean freeResults) throws Exception {
        return wait(uid, 0L, freeResults);
    }

    private DlListener listenerForUID(int uid) {
        // -1 is a special value meaning return immediately
        // maybe because CRC was already correct and download not needed
        if (uid == -1)
            return null;
        // grab the listener for this uid
        synchronized (downloadItems) {
            for (final DlListener d : downloadItems)
                if (d.uid == uid)
                    return d;
        }
        return null;
    }

    public boolean wait(int uid, long timeout, boolean freeResults) throws Exception {

        DlListener dll = this.listenerForUID(uid);
        // if we couldn't find one, the download is finished, return
        if (dll == null)
            return true; // we don't really know how it ended, just return true I guess...
        DownloadListener.Status status = dll.getStatus();
        long startTime = timeout > 0L ? System.currentTimeMillis() : 0L;
        long elapsedTime;
        while (status != AbstractDownloadListener.Status.FINISHED
                && status != AbstractDownloadListener.Status.STOPPED
                && status != AbstractDownloadListener.Status.ERROR) {
            try {
                synchronized (dll) {
                    //dll.wait(timeout);
                    // todo: waiting for 0 (forever) sometimes locks up because of a race condition, make it smaller
                    //dll.wait(2000);
                    // maybe this will work instead, now that we are synchronized around dll
                    status = dll.getStatus();
                    if ((status != AbstractDownloadListener.Status.FINISHED
                            && status != AbstractDownloadListener.Status.STOPPED
                            && status != AbstractDownloadListener.Status.ERROR))
                        dll.wait(timeout);
                }
            } catch (InterruptedException e) {
                // just ignore it, let the loop go around again
            }
            status = dll.getStatus();

            if (timeout > 0L) {
                elapsedTime = System.currentTimeMillis() - startTime;
                // check and make sure we haven't gone over our allotted time
                if (elapsedTime >= timeout) {
                    if (freeResults)
                        dll.autoRemove = true;
                    return status == AbstractDownloadListener.Status.FINISHED
                            || status == AbstractDownloadListener.Status.STOPPED;
                } else
                    timeout -= elapsedTime; // if not, adjust timeout accordingly
            }

        }
        if (freeResults)
            dll.autoRemove = true;

        if (dll.exception != null)
            throw dll.exception;
        return status != AbstractDownloadListener.Status.ERROR;
    }

    public int download(String url, String savePath) throws MalformedURLException {
        return this.download(url, savePath, false, null);
    }

    public int download(String url, String savePath, boolean extract) throws MalformedURLException {
        return this.download(url, savePath, extract, null);
    }

    public int download(String url, String savePath, boolean extract, ChecksumInfo ci) throws MalformedURLException {
        return this.download(url, savePath, extract, ci, false);
    }

    public int download(String url, String savePath, boolean extract, ChecksumInfo ci, Downloader blacklist) throws MalformedURLException {
        return this.download(url, savePath, extract, ci, false, blacklist);
    }

    public String uniqueFoldername(String url) {
        return this.uniqueFoldername(url, null, null);
    }

    public String uniqueFoldername(String url, String savePath) {
        return this.uniqueFoldername(url, savePath, null);
    }

    public String uniqueFoldername(String url, String savePath, java.util.List<String> files) {
        Downloader dlr;
        try {
            dlr = getSupportedDownloader(url);
        } catch (MalformedURLException e) {
            return null;
        }
        // append to savePath a unique folder name
        if (savePath != null) {
            if (!savePath.endsWith("/"))
                savePath += "/";
            savePath = savePath + dlr.uniqueFoldername(url);
        } else {
            return dlr.uniqueFoldername(url);
        }

        // if a list of files are requested, try to make the Downloader take an educated guess
        if (files != null)
            dlr.guessFilenames(url, savePath, files);

        return savePath;
    }

    public int download(String url, String savePath, boolean extract, ChecksumInfo ci, boolean uniqueFolder) throws MalformedURLException {
        return this.download(url, savePath, extract, ci, uniqueFolder, (Downloader)null);
    }

    public int download(String url, String savePath, boolean extract, ChecksumInfo ci, boolean uniqueFolder, Downloader blacklist) throws MalformedURLException {

        // if a list of files are requested, try to make the Downloader take an educated guess
        // also append to savePath a unique folder name
        java.util.List<String> files = newThreadSafeList();
        if (uniqueFolder) {
            savePath = uniqueFoldername(url, savePath, files);
        }
        // check if file was already downloaded
        File listFile = new File(savePath + fileListFile);
        boolean listFileExists = listFile.exists() && listFile.canRead() && listFile.isFile();
        // if this file exists, and ci is null, or expectedChecksum is 0, just return -1 (already downloaded)
        //System.out.printf("url: '%s', listFileExists: '%b', ci: '%s'\n", url, listFileExists, ci);
        if (listFileExists && (ci != null && ci.getExpectedChecksum() == 0))
            return -1;
        // check crc if we are supposed to
        if (ci != null && listFileExists) {
            // try to load a whitelist from when the file was first downloaded, so we can only CRC those files
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                Downloader.writeStream(new FileInputStream(listFile), baos);
                String[] whitelist = new String(baos.toByteArray()).split("\n");

                //for(String file: whitelist) System.out.println("whitelist file: "+file);

                ci.setList(true, whitelist);
            } catch (Exception e) {
                Debug.debug(e);
            }
            /*
            String archive = new URL(url.startsWith("http") ? url : "file://"+url).getFile();
            archive = savePath+archive.substring(archive.lastIndexOf("/")+1, archive.length());
            System.out.println("crcExtractFile: "+Downloader.crcExtractFile(archive)+" archive: "+archive);
            ci.checksumMatch(savePath);
            System.out.println("crc: "+ci.getChecksum()+" expected: "+ci.getExpectedChecksum()+ " checksum match: "+url);
            */
            if (ci.checksumMatch(savePath))
                return -1;  // this signifies that the crc matches (instant success)
        }

        // otherwise go ahead and download it.
        Downloader dlr = getSupportedDownloader(url, blacklist);

        int uid = getNewUID();
        DlListener dll = new DlListener(uid, extract, ci, files, this);
        dlr.download(url, savePath, dll);
        synchronized (downloadItems)

        {
            downloadItems.add(dll);

            if (timer == null) {
                timer = new Timer(delay, new GUIUpdater());
                timer.start();
            } else if (!timer.isRunning()) {
                timer.start();
            }
        }

        return uid;
    }


    public int download(final String url, final String savePath, final boolean extract, final ChecksumInfo ci, final boolean uniqueFolder, final Runnable run) {
        final ResourceGrabber rg = this;
        final CompleteRunnable crun;
        if (run instanceof CompleteRunnable)
            crun = (CompleteRunnable) run;
        else
            crun = null;

        int tryUid = -1;
        try {
            tryUid = rg.download(url, savePath, extract, ci, uniqueFolder);
        } catch (Exception e) {
            if (crun != null)
                crun.setEx(e);
        }
        final int uid = tryUid;
        new Thread() {

            public void run() {
                boolean success = false;
                try {
                    success = rg.wait(uid, false);
                } catch (Exception e) {
                    if (crun != null)
                        crun.setEx(e);
                }
                if (crun != null)
                    crun.set(rg, success, uid, url, savePath, extract, ci, uniqueFolder);
                run.run();
                rg.freeResources(uid);
            }

        }.start();
        return uid;
    }

    public boolean downloadWait(String url, String savePath) throws Exception {
        return this.downloadWait(url, savePath, false, null);
    }

    public boolean downloadWait(String url, String savePath, boolean extract) throws Exception {
        return this.downloadWait(url, savePath, extract, null);
    }

    public boolean downloadWait(String url, String savePath, boolean extract, ChecksumInfo ci) throws Exception {
        return this.downloadWait(url, savePath, extract, ci, false);
    }

    public boolean downloadWait(String url, String savePath, boolean extract, ChecksumInfo ci, boolean uniqueFolder) throws Exception {
        return this.wait(this.download(url, savePath, extract, ci, uniqueFolder), true);
    }

    public boolean downloadWaitCatch(String url, String savePath) {
        return this.downloadWaitCatch(url, savePath, false, null);
    }

    public boolean downloadWaitCatch(String url, String savePath, boolean extract) {
        return this.downloadWaitCatch(url, savePath, extract, null);
    }

    public boolean downloadWaitCatch(String url, String savePath, boolean extract, ChecksumInfo ci) {
        try {
            return this.downloadWait(url, savePath, extract, ci);
        } catch (Exception e) {
            // ignore, just return false
            return false;
        }
    }

    public int downloadToUniqueFolder(String url, String parentFolder) throws MalformedURLException {
        return this.downloadToUniqueFolder(url, parentFolder, false, null);
    }

    public int downloadToUniqueFolder(String url, String parentFolder, boolean extract) throws MalformedURLException {
        return this.downloadToUniqueFolder(url, parentFolder, extract, null);
    }

    public int downloadToUniqueFolder(String url, String parentFolder, ChecksumInfo ci) throws MalformedURLException {
        return this.downloadToUniqueFolder(url, parentFolder, false, ci);
    }

    public int downloadToUniqueFolder(String url, String parentFolder, boolean extract, ChecksumInfo ci) throws MalformedURLException {
        return this.download(url, parentFolder, extract, ci, true);
    }

    public boolean downloadToUniqueFolderWait(String url, String parentFolder) throws Exception {
        return this.downloadToUniqueFolderWait(url, parentFolder, false, null);
    }

    public boolean downloadToUniqueFolderWait(String url, String parentFolder, boolean extract) throws Exception {
        return this.downloadToUniqueFolderWait(url, parentFolder, extract, null);
    }

    public boolean downloadToUniqueFolderWait(String url, String parentFolder, boolean extract, ChecksumInfo ci) throws Exception {
        return this.wait(this.download(url, parentFolder, extract, ci, true));
    }

    public boolean downloadToUniqueFolderWaitCatch(String url, String parentFolder) {
        return this.downloadToUniqueFolderWaitCatch(url, parentFolder, false, null);
    }

    public boolean downloadToUniqueFolderWaitCatch(String url, String parentFolder, boolean extract) {
        return this.downloadToUniqueFolderWaitCatch(url, parentFolder, extract, null);
    }

    public boolean downloadToUniqueFolderWaitCatch(String url, String parentFolder, boolean extract, ChecksumInfo ci) {
        try {
            return this.downloadToUniqueFolderWait(url, parentFolder, extract, ci);
        } catch (Exception e) {
            // ignore, just return false
            return false;
        }
    }


    private synchronized int getNewUID() {
        return this.currentUID++;
    }

    private Downloader getSupportedDownloader(String url) throws MalformedURLException {
        return this.getSupportedDownloader(url, null);
    }

    private Downloader getSupportedDownloader(String url, Downloader blacklist) throws MalformedURLException {
        for (Downloader dl : this.downloaders)
            if (dl != blacklist && dl.supportsURL(url)) {
                //System.out.println("url: " + url + " returning: " + dl);
                return dl;
            }
        throw new MalformedURLException("Unsupported URL: " + url);
    }

    public boolean supportedURL(String url) {
        try {
            this.getSupportedDownloader(url);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }

    public void freeResources(int uid) {
        DlListener dll = this.listenerForUID(uid);
        if (dll != null)
            dll.freeResources();
    }

    public java.util.List<String> getFileList(int uid) {
        DlListener dll = this.listenerForUID(uid);

        return dll == null ? null : dll.getFileList();
    }

    private java.util.List<String> newThreadSafeList() {
        return Collections.synchronizedList(this.newList());
    }

    private java.util.List<String> newThreadSafeList(int initalSize) {
        return Collections.synchronizedList(this.newList(initalSize));
    }

    private java.util.List<String> newList() {
        return new ArrayList<String>();
    }

    private java.util.List<String> newList(int initalSize) {
        return new ArrayList<String>(initalSize);
    }

    public String firstFileEndsWithIgnoreCase(String url, String savePath, int uid, String... suffixes) {
        return this.firstFileEndsWith(url, savePath, uid, true, suffixes);
    }

    public String firstFileEndsWith(String url, String savePath, int uid, String... suffixes) {
        return this.firstFileEndsWith(url, savePath, uid, false, suffixes);
    }

    public String firstFileEndsWith(String url, String savePath, int uid, boolean ignoreCase, String... suffixes) {
        return this.listenerForUID(uid) != null ? this.firstFileEndsWith(uid, ignoreCase, suffixes) : this.firstFileEndsWith(url, savePath, ignoreCase, suffixes);
    }

    public String firstFileEndsWithIgnoreCase(String url, String savePath, String... suffixes) {
        return this.firstFileEndsWith(url, savePath, true, suffixes);
    }

    public String firstFileEndsWith(String url, String savePath, String... suffixes) {
        return this.firstFileEndsWith(url, savePath, false, suffixes);
    }

    public String firstFileEndsWith(String url, String savePath, boolean ignoreCase, String... suffixes) {
        // no need for concurrent because only we have access to this list and it will only be accessed in a single thread
        java.util.List<String> files = newList(2);
        if (url != null)
            this.uniqueFoldername(url, savePath, files);
        else
            Downloader.listFiles(savePath, files);
        return this.firstFileEndsWith(files, ignoreCase, suffixes);
    }

    public String firstFileEndsWithIgnoreCase(int uid, String... suffixes) {
        return this.firstFileEndsWith(uid, true, suffixes);
    }

    public String firstFileEndsWith(int uid, String... suffixes) {
        return this.firstFileEndsWith(uid, false, suffixes);
    }

    public String firstFileEndsWith(int uid, boolean ignoreCase, String... suffixes) {
        return this.firstFileEndsWith(getFileList(uid), ignoreCase, suffixes);
    }

    public String firstFileEndsWithIgnoreCase(java.util.List<String> files, String... suffixes) {
        return this.firstFileEndsWith(files, true, suffixes);
    }

    public String firstFileEndsWith(java.util.List<String> files, String... suffixes) {
        return this.firstFileEndsWith(files, false, suffixes);
    }

    public String firstFileEndsWith(java.util.List<String> files, boolean ignoreCase, String... suffixes) {
        if (files == null || suffixes.length < 1)
            return null;

        synchronized (files) {
            for (String file : files)
                for (String suffix : suffixes)
                    if (((ignoreCase && suffix != null && file.toLowerCase().endsWith(suffix.toLowerCase())) || file.endsWith(suffix)) && !file.endsWith(fileListFile))
                        return file;
            // if the last value in suffixes is null, that is a special meaning to return the first file if no
            // others can be found that matches the previous ones
            if (suffixes[suffixes.length - 1] == null)
                return files.isEmpty() ? null : files.get(0);
        }
        return null;
    }


    private class GUIUpdater implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            synchronized (downloadItems) {
                for (final DlListener dll : downloadItems) {
                    /*
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("uid: " + dll.uid);
                    //System.out.println("dll: " + dll);
                    System.out.println("-------------------------------------------------------------");
*/
                    DownloadListener.Status status = dll.pollStatus();
                    if (status == null)
                        status = dll.getStatus();
                    while (status != null) {
                        switch (status) {
                            case NOT_STARTED:
                                break;
                            case FINISHED:
                            case RUNNING:
                                // check if we have called reset
                                if (dll.info != null) {
                                    dll.dip.reset(dll.title, dll.length, dll.info);
                                    dll.info = null;
                                    break;
                                }
                                // if its already running, we need to just update it
                                if (dll.title != null)
                                    dll.dip.setTitle(dll.title);
                                //if (dll.progress != 0)
                                //    dll.dip.setProgress(dll.progress);
                                if (dll.extraInfo != null)
                                    dll.dip.setInfo(dll.extraInfo);
                                // set them all not to update
                                dll.title = null;
                                dll.extraInfo = null;
                                break;
                            // then we need to start it up
                            case STARTING:
                                //dll.setRunning();
                                // this means we are RE-starting for some reason, so it's already added to the frame
                                if (dll.dip != null) {
                                    dll.dip.reset(dll.title, dll.length, dll.info);
                                    dll.info = null;
                                    break;
                                }
                                // otherwise, start fresh
                                dll.dip = new DownloadItemPanel(dll.title, dll.length, dll.info);
                                if (frame == null) {
                                    frame = new JFrame(title);
                                    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

                                    frame.getContentPane().add(dll.dip);

                                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                                    frame.setResizable(false);
                                    frame.pack();
                                    // sets the frame to appear in the middle of the screen
                                    // when called after pack()
                                    frame.setLocationRelativeTo(null);
                                    frame.setVisible(true);
                                    // or if we are trying to add a panel and the frame is already set up
                                } else {
                                    frame.getContentPane().add(dll.dip);
                                }
                                break;
                            case EXTRACTING:
                                //dll.setRunning();
                                if (dll.dip != null)
                                    dll.dip.reset(dll.title, dll.length, dll.info);
                                break;
                            case STOPPED:
                                if (!dll.autoRemove)
                                    break;
                                // since we are already in the event thread, this executes right after this exits
                                // or at least never at the same time, which is all we need to worry about.
                                SwingUtilities.invokeLater(
                                        new Runnable() {
                                            public void run() {
                                                synchronized (downloadItems) {
                                                    downloadItems.remove(dll);
                                                    if (frame == null)
                                                        return;
                                                    if (dll.dip != null)
                                                        frame.getContentPane().remove(dll.dip);
                                                    if (downloadItems.isEmpty()) {
                                                        frame.dispose();
                                                        frame = null;
                                                        timer.stop();
                                                    }
                                                }
                                            }
                                        });
                                break;
                            case ERROR:
                                //System.out.println("Error uid: " + dll.uid);
                                if (dll.extraInfo != null && dll.dip != null)
                                    dll.dip.error(dll.extraInfo);
                                dll.extraInfo = null;
                                // timeout error, once we reach errorTicks ticks change it to stopped
                                //System.out.println("error tick: " + dll.progress);
                                if (dll.autoRemove && (dll.progress++ > errorTicks))
                                    dll.setStopped();
                        }
                        status = dll.pollStatus();
                    }
                }
            }
            if (frame != null)
                frame.pack();
        }

    }

    private class DlListener extends AbstractDownloadListener {

        int uid;
        boolean extract;
        ChecksumInfo ci;
        java.util.List<String> files;
        DownloadItemPanel dip = null;
        ResourceGrabber rg = null;

        boolean autoRemove = false;

        public DlListener(int uid, boolean extract, ChecksumInfo ci, java.util.List<String> files, ResourceGrabber rg) {
            this.uid = uid;
            this.extract = extract;
            this.ci = ci;
            this.files = files;
            this.rg = rg;

            //this.autoRemove = (files == null);
        }

        @Override
        public void setProgress(int progress) {
            //super.setProgress(progress);
            // it is safe to update the progress outside of the event thread, and it looks cleaner, so do it
            if (dip != null)
                dip.setProgress(progress);
        }

        @Override
        public synchronized void finished(String savePath, String... filesDownloaded) {
            if (savePath != null && !savePath.endsWith("/"))
                savePath += "/";
/*
            if (extract)
                for (String file : filesDownloaded)
                    Downloader.extractFile(file, savePath, this, files);
            */
            if (files != null)
                files.clear();
            // if we are supposed to extract it, do so, add the names to files if they extract
            for (String file : filesDownloaded) {
                file = savePath + file;
                if (!(extract && Downloader.supportsExtraction(file) &&
                        Downloader.extractFile(file, savePath, this, files)) &&
                        files != null)
                    files.add(file);
            }

            // write files to a file in the savePath, to be used on later runs to see what to CRC
            if (files != null) {
                String[] fileArray = files.toArray(new String[files.size()]);
                // first strip off savePath from the files
                for (int x = 0; x < fileArray.length; ++x)
                    fileArray[x] = fileArray[x].replaceFirst(savePath, "");
                try {
                    FileOutputStream fos = new FileOutputStream(savePath + fileListFile);
                    for (String file : fileArray) {
                        file += "\n";
                        //System.out.print("file to crc: " + file);
                        fos.write(file.getBytes());
                    }
                    fos.close();
                } catch (Exception e) {
                    Debug.debug(e);
                }
                if (ci != null)
                    ci.setList(true, fileArray);
            }

            // if we want a list of files, grab one
            //if (files != null)
            //    Downloader.listFiles(savePath, files);

            // check crc if we are supposed to
            //System.out.println("savePath: "+savePath);
            if (ci != null && ci.getExpectedChecksum() != 0 && !ci.checksumMatch(savePath))
                error(String.format("CRC Mismatch. expected: %d actual: %d", ci.getExpectedChecksum(), ci.getChecksum()), null);
            else
                super.finished(savePath, filesDownloaded);


            //System.out.println("returning from finished");
            // we can at least free this now
            ci = null;
        }

        public void error(String msg, Exception e) {
            Debug.debug("Error: " + msg);
            Debug.debug(e);
            super.error(msg, e);
        }

        public synchronized void freeResources() {
            ci = null;
            files = null;
            autoRemove = true;
        }

        public synchronized java.util.List<String> getFileList() {
            return files;
        }

        public boolean download(String url, String savePath, boolean extract, ChecksumInfo ci, Downloader dl) throws Exception {
            return rg.wait(rg.download(url, savePath, extract, ci, dl), true);
        }

        /**
         * Checks equality with another Object
         *
         * @param other
         * @return
         */
        @Override
        public boolean equals(Object other) {
            //System.out.println("DlListener equals: " + other);
            return ((other != null) && (other instanceof DlListener) && (((DlListener) other).uid == this.uid));
        }

        @Override
        public String toString() {
            return "DlListener{" +
                    "uid=" + uid +
                    ", autoRemove=" + autoRemove +
                    ", status=" + peekStatus().toString() +
                    ", dip=" + dip +
                    '}';
        }
    }

    private class DownloadItemPanel extends JPanel {

        private final static String sep = "<html><hr><hr>";
        private final static String end = "</html>";

        JProgressBar progressBar = null;
        JLabel titleLabel = null;
        JLabel infoLabel = null;

        String origInfo = null;

        public DownloadItemPanel(String title, long length, String info) {
            super(new BorderLayout());
            this.add(this.titleLabel = new JLabel(sep + title + end), BorderLayout.NORTH);
            this.add(this.infoLabel = new JLabel(origInfo = info), BorderLayout.SOUTH);

            progressBar = new JProgressBar(0, 100);
            this.setLength(length);
            this.add(progressBar, BorderLayout.CENTER);
        }

        public void reset(final String title, final long length, final String info) {

            if (title != null)
                this.setTitle(title);
            if (info != null)
                infoLabel.setText(origInfo = info);

            this.setLength(length);

        }

        public void error(final String error) {
            this.setInfo("Error: " + error);
            this.setLength(-1);
        }

        private void setLength(long length) {
            if (length != -1) {
                progressBar.setValue(0);
                progressBar.setMaximum((int) length);
                progressBar.setIndeterminate(false);
                progressBar.setStringPainted(true);
            } else {
                progressBar.setIndeterminate(true);
                progressBar.setStringPainted(false);
            }

        }

        public void setProgress(final int progress) {
            progressBar.setValue(progress);
        }

        public void setTitle(final String title) {
            this.titleLabel.setText(sep + title + end);
            this.titleLabel.updateUI();
        }

        public void setInfo(final String info) {
            this.infoLabel.setText("<html>" + origInfo + "<hr>" + info + end);
        }

        @Override
        public String toString() {
            return "DownloadItemPanel{" +
                    "infoLabel=" + infoLabel.getText() +
                    ", titleLabel=" + titleLabel.getText() +
                    ", origInfo='" + origInfo + '\'' +
                    ", progressBar=" + progressBar.getPercentComplete() +
                    '}';
        }
    }
}
