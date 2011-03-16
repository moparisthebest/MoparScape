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

import org.moparscape.res.impl.Downloader;
import org.moparscape.res.impl.HTTPDownloader;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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

    private JFrame frame = null;
    Set<Integer> downloadItems = Collections.synchronizedSet(new HashSet<Integer>(5));

    // this is only meant to be accessed by getUID(), which is synchronized
    private int currentUID = 0;

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
        ResourceGrabber rg = new ResourceGrabber();
        //rg.download("http://www.moparisthebest.com/downloads/cedegaSRC.tar.gz", "/home/mopar/tests/extest", true);
        //rg.download("http://mirror01.th.ifl.net/releases//maverick/ubuntu-10.10-desktop-i386.iso", "/home/mopar/tests/extest", false);
        //Thread.sleep(2000);
        rg.download("https://www.moparscape.org/libs/client.zip.gz", "/home/mopar/tests/extest", true);
    }

    private int download(String url, String savePath, boolean extract) {
        int uid = getUID();
        new HTTPDownloader().download(url, savePath, new DlListener(uid, extract));
        return uid;
    }

    private synchronized int getUID() {
        return this.currentUID++;
    }

    private synchronized void checkFrame(final JPanel jp, int uid) {
        // not allowed
        if (jp == null)
            return;

        boolean add = !downloadItems.contains(uid);
        //System.out.println((add ? "adding" : "removing") + ": " + uid);
        if (add)
            downloadItems.add(uid);
        else
            downloadItems.remove(uid);
        // handle UIDs

        // if we are trying to add a panel and the frame is null
        if (add && frame == null) {
            try {
                SwingUtilities.invokeAndWait(
                        new Runnable() {
                            public void run() {
                                frame = new JFrame("Resource Grabber");
                                frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

                                frame.getContentPane().add(jp);

                                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                                frame.setResizable(false);
                                frame.pack();
                                // sets the frame to appear in the middle of the screen
                                // when called after pack()
                                frame.setLocationRelativeTo(null);
                                frame.setVisible(true);

                            }
                        }
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
            // or if we are trying to add a panel and the frame is already set up
        } else if (add) {
            SwingUtilities.invokeLater(
                    new Runnable() {
                        public void run() {
                            if (frame != null) {
                                frame.getContentPane().add(jp);
                                frame.pack();
                            }
                        }
                    }
            );
            // else we are not trying to remove a panel, and destroy the frame if there are no more items
        } else if (frame != null && downloadItems.isEmpty()) {
            try {
                SwingUtilities.invokeAndWait(
                        new Runnable() {
                            public void run() {
                                frame.dispose();
                                frame = null;

                            }
                        }
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
            // or just remove a single panel
        } else if (frame != null) {
            SwingUtilities.invokeLater(
                    new Runnable() {
                        public void run() {
                            if (frame != null) {
                                frame.getContentPane().remove(jp);
                                frame.pack();
                            }
                        }
                    }
            );
        }
    }

    private class DlListener implements DownloadListener {

        int uid;
        boolean extract;
        DownloadItemPanel dip = null;

        public DlListener(int uid, boolean extract) {
            this.uid = uid;
            this.extract = extract;
        }

        public void incrementProgress(int inc) {
            //DownloadItemPanel dip = downloadItems.get(uid);
            if (dip != null)
                dip.addProgress(inc);
        }

        public void setTitle(String title) {
            //DownloadItemPanel dip = downloadItems.get(uid);
            if (dip != null)
                dip.setTitle(title);
        }

        public void setInfo(String info) {
            //DownloadItemPanel dip = downloadItems.get(uid);
            if (dip != null)
                dip.setInfo(info);
        }

        public void starting(String title, long length, String info) {
            dip = new DownloadItemPanel(title, length, info);
            checkFrame(dip, uid);
        }

        public void extracting(final String title, final long length, final String info) {
            //DownloadItemPanel dip = downloadItems.get(uid);
            if (dip != null) {
                dip.reset(title, length, info);
                //dip.reset(title, length, info);
                /*
                frame.getContentPane().remove(dip);
                dip = new DownloadItemPanel(title, length, info);
                frame.getContentPane().add(dip);
                */
            }
        }

        public void finished(String savePath, String... filesDownloaded) {
            if (extract)
                for (String file : filesDownloaded)
                    Downloader.extractFile(file, savePath, this);
        }

        public void stopped() {
            //System.out.println("Stopped uid: " + uid);
            //DownloadItemPanel dip = downloadItems.get(uid);
            checkFrame(dip, uid);
        }

        public void error(String msg, Exception e) {
            //To change body of implemented methods use File | Settings | File Templates.
            System.out.println("Error uid: " + uid);
            System.out.println(msg);
            e.printStackTrace();
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

            progressBar = new JProgressBar(0, (int) length);
            progressBar.setValue(0);
            progressBar.setStringPainted(true);
            this.add(progressBar, BorderLayout.CENTER);
        }

        public void reset(final String title, final long length, final String info) {
            try {
                SwingUtilities.invokeAndWait(
                        new Runnable() {
                            public void run() {
                                titleLabel.setText(sep + title + end);
                                infoLabel.setText(origInfo = info);

                                progressBar.setValue(0);
                                progressBar.setMaximum((int) length);
                                if (frame != null)
                                    frame.pack();
                            }
                        }
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void error(final String error) {
            try {
                SwingUtilities.invokeAndWait(
                        new Runnable() {
                            public void run() {
                                infoLabel.setText("<html>" + origInfo + "<hr>Error: " + error + end);
                                progressBar.setIndeterminate(true);
                                if (frame != null)
                                    frame.pack();
                            }
                        }
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void addProgress(int progress) {
            this.setProgress(progressBar.getValue() + progress);
        }

        public void setProgress(final int progress) {
            try {
                SwingUtilities.invokeAndWait(
                        new Runnable() {
                            public void run() {
                                progressBar.setValue(progress);
                            }
                        }
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void setTitle(final String title) {
              setLabel(this.titleLabel, frame, title);
        }

        public void setInfo(final String info) {
            setLabel(this.infoLabel, frame, "<html>" + origInfo + "<hr>" + info + end);
        }
    }

    private static void setLabel(final JLabel jl, final JFrame jf, final String content) {
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                        public void run() {
                            jl.setText(content);
                            if (jf != null)
                                jf.pack();
                        }
                    }
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
