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

import org.moparscape.res.impl.BTDownloader;
import org.moparscape.res.impl.Downloader;
import org.moparscape.res.impl.URLDownloader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;
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
 * This class is currently NOT thread-safe, so if you try and use it in a multi-threaded environment it will almost
 * certainly break in unexpected and bad ways.  Synchronize around it if you must.
 *
 * @author moparisthebest
 */
public class ResourceGrabber {

    private final Downloader[] downloaders;

    private static final int delay = 500; //milliseconds
    private static final int errorTicks = 60; // errorTicks * delay is how long errors will stay onscreen

    private JFrame frame = null;
    private javax.swing.Timer timer = null;
    private String title = "Resource Grabber";

    private final List<DlListener> downloadItems = new ArrayList<DlListener>(5);

    // this is only meant to be accessed by getUID(), which is synchronized
    private int currentUID = 0;

    public static void main(String[] args) throws Exception {
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
        ResourceGrabber rg = new ResourceGrabber(System.getProperty("user.home") + "/.moparscape/bin/");
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

    public static void main2(String[] args) throws Exception {
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
        ResourceGrabber rg = new ResourceGrabber(System.getProperty("user.home") + "/.moparscape/bin/");
        System.out.println("before downloads...");
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
        System.out.println("returned: '" + rg.wait(clientZipUID) + "' after downloads...");

    }

    public ResourceGrabber(String binDir, String title) throws FileNotFoundException {
        if(title != null)
            this.title = title;
        File f = new File(binDir);
        if (!f.exists() && !f.isDirectory() && !f.mkdirs())
            throw new FileNotFoundException();
        if (!binDir.endsWith("/"))
            binDir += "/";
        downloaders = new Downloader[]{new BTDownloader(binDir), new URLDownloader()};
    }

    public ResourceGrabber(String binDir) throws FileNotFoundException {
        this(binDir, null);
    }

    public boolean wait(int uid) throws Exception {
        // -1 is a special value meaning return immediately
        // maybe because CRC was already correct and download not needed
        if (uid == -1)
            return true;

        DlListener dll = null;
        // grab the listener for this uid
        synchronized (downloadItems) {
            for (final DlListener d : downloadItems) {
                if (d.uid == uid) {
                    dll = d;
                    break;
                }
            }
        }
        // if we couldn't find one, the download is finished, return
        if (dll == null)
            return true; // we don't really know how it ended, just return true I guess...
        AbstractDownloadListener.Status status = dll.getStatus();
        while (status != AbstractDownloadListener.Status.FINISHED
                && status != AbstractDownloadListener.Status.STOPPED
                && status != AbstractDownloadListener.Status.ERROR) {
            try {
                synchronized (dll) {
                    dll.wait();
                }
            } catch (InterruptedException e) {
                // just ignore it, let the loop go around again
            }
            status = dll.getStatus();
        }
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

        // check crc if we are supposed to
        if (ci != null && ci.checksumMatch(savePath))
            return -1;  // this signifies that the crc matches (instant success)
        // otherwise go ahead and download it.
        Downloader dlr = getSupportedDownloader(url);

        int uid = getUID();
        DlListener dll = new DlListener(uid, extract, ci, this);
        dlr.download(url, savePath, dll);
        synchronized (downloadItems) {
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

    private synchronized int getUID() {
        return this.currentUID++;
    }

    private Downloader getSupportedDownloader(String url) throws MalformedURLException {
        for (Downloader dl : this.downloaders)
            if (dl.supportsURL(url))
                return dl;
        throw new MalformedURLException("Unsupported URL: " + url);
    }


    private class GUIUpdater implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            synchronized (downloadItems) {
                for (final DlListener dll : downloadItems) {
                    //System.out.println("uid   : " + dll.uid);
                    //System.out.println("status: " + dll.getStatus().toString());
                    switch (dll.getStatus()) {
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
                            dll.setRunning();
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
                            dll.setRunning();
                            dll.dip.reset(dll.title, dll.length, dll.info);
                            break;
                        case STOPPED:
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
                            if (dll.progress++ > errorTicks)
                                dll.setStopped();
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
        DownloadItemPanel dip = null;
        ResourceGrabber rg = null;

        public DlListener(int uid, boolean extract, ChecksumInfo ci, ResourceGrabber rg) {
            this.uid = uid;
            this.extract = extract;
            this.ci = ci;
            this.rg = rg;
        }

        @Override
        public void setProgress(int progress) {
            //super.setProgress(progress);
            // it is safe to update the progress outside of the event thread, and it looks cleaner, so do it
            if (dip != null)
                dip.setProgress(progress);
        }

        @Override
        public void finished(String savePath, String... filesDownloaded) {
            // if we are supposed to extract it, do so
            if (extract)
                for (String file : filesDownloaded)
                    Downloader.extractFile(file, savePath, this);

            // check crc if we are supposed to
            // TODO: should we only check filesDownloaded? Then we can't specify extracted files to CRC only.
            //System.out.println("savePath: "+savePath);
            if (ci != null && !ci.checksumMatch(savePath))
                error(String.format("CRC Mismatch. expected: %d actual: %d", ci.getExpectedChecksum(), ci.getChecksum()), null);
            else
                super.finished(savePath, filesDownloaded);
        }

        public boolean download(String url, String savePath, boolean extract, ChecksumInfo ci) throws Exception {
            return rg.wait(rg.download(url, savePath, extract, ci));
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
                titleLabel.setText(sep + title + end);
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
        }

        public void setInfo(final String info) {
            this.infoLabel.setText("<html>" + origInfo + "<hr>" + info + end);
        }
    }
}
