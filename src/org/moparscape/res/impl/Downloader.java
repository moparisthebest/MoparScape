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

import org.moparscape.res.ChecksumInputStream;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.zip.*;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 3/12/11
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Downloader {

    public abstract String download(String url, String savePath) throws IOException;

    protected static void writeStream(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0) {
            out.write(buffer, 0, len);
        }
        // if its a ZipInputStream we don't want to close it
        if (!(in instanceof ZipInputStream))
            in.close();
        out.close();
    }

    /**
     * Currently supports .zip, .gz, and .zip.gz
     *
     * @param fileName
     * @param savePath
     * @throws IOException
     */
    protected static void extractFile(String fileName, String savePath) throws IOException {
        boolean checkProgress = true;

        File file = new File(fileName);
        long length = file.length();

        InputStream is = new FileInputStream(file);
        ProgressInputStream pis = null;
        if (checkProgress) {
            pis = new ProgressInputStream(is, fileName, savePath, length, ProgressFrame.Type.EXTRACT);
            is = pis;
        }


        if (fileName.endsWith(".zip.gz"))
            is = new GZIPInputStream(is);
        else if (fileName.endsWith(".gz")) {
            // strip .gz off the end
            fileName = file.getName();
            fileName = fileName.substring(0, fileName.length() - 3);
            if (badExtension(fileName))
                return;
            if (checkProgress) {
                pis.setText("Extracting File: " + fileName);
                System.out.println("Extracting File: " + fileName);
            }
            writeStream(new GZIPInputStream(is), new FileOutputStream(savePath + fileName));
            return;
        } else if (fileName.endsWith(".zip")) {
            // if we are here, the streams are all set up to unzip below, so don't do anything
        } else {
            // otherwise this file can't be extracted, so just return for now
            return;
        }
        ZipInputStream zin = new ZipInputStream(is);
        ZipEntry entry;
        while ((entry = zin.getNextEntry()) != null) {
            String name = entry.getName();
            if (entry.isDirectory()) { // Checks if the entry is a directory.
                File folder = new File(savePath + name);
                deleteDirectory(folder);
                if (checkProgress) {
                    pis.setText("Creating Directory: " + name);
                    System.out.println("Creating Directory: " + name);
                }
                folder.mkdir();
            } else {// If the entry isn't a directory, then it should be a file?
                if (badExtension(entry.getName()))
                    continue;
                if (checkProgress) {
                    pis.setText("Extracting File: " + name);
                    System.out.println("Extracting File: " + name);
                }
                writeStream(zin, new FileOutputStream(savePath + name));
            }
            //try{ Thread.sleep(1000); }catch(InterruptedException e){ e.printStackTrace(); }
        }
        zin.close();
    }

    /**
     * This function recursively checksums an entire directory, optionally applying a whitelist or a blacklist
     *
     * @param savePath
     * @param cs
     * @param list
     * @param whitelist true if whitelist, false if blacklist.
     * @return
     */
    public static long checksum(String savePath, Checksum cs, String[] list, final boolean whitelist) {
        if(cs == null)
            cs = new CRC32();
        FileFilter ff = null;
        if (list != null) {
            final File[] flist = new File[list.length];
            for (int x = 0; x < list.length; ++x)
                flist[x] = new File(list[x]);
            ff = new FileFilter() {
                    public boolean accept(File name) {
                        for (File f : flist)
                            if (f.equals(name))
                                return whitelist;
                        return true;
                    }
                };
        }
        recursiveChecksum(new File(savePath), cs, new NullOutputStream(), ff);
        return cs.getValue();
    }

    private static void recursiveChecksum(File path, Checksum cs, NullOutputStream nos, FileFilter filter) {
        if (!path.exists())
            return;
        for (File file : path.listFiles(filter)) {
            System.out.println("Checking filename: "+file.getAbsolutePath());
            if (file.isDirectory()) {
                recursiveChecksum(file, cs, nos, filter);
            } else {
                System.out.println("Checksum so far: " + cs.getValue());
                try {
                    writeStream(new ChecksumInputStream(new FileInputStream(file), cs), nos);
                } catch (Exception e) {
                    // if there is an exception, just ignore it
                }
            }
        }
    }

    protected static boolean deleteDirectory(File path) {
        if (path.exists()) {
            File[] files = path.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    deleteDirectory(files[i]);
                } else {
                    files[i].delete();
                }
            }
        }
        return (path.delete());
    }

    protected static boolean badExtension(String file) {
        String[] badExts = new String[]{".exe", ".bat", ".cmd", ".com", ".sh", ".bash"};
        for (String badExt : badExts)
            if (file.endsWith(badExt))
                return true;
        return false;
    }

    /**
     * Reports whether a url describes a torrent or not.
     *
     * @param url URL to resource.
     * @return true if this is a torrent, false otherwise.
     */
    protected static boolean isTorrent(String url) {
        return url.startsWith("magnet:") || url.endsWith(".torrent");
    }

    protected static class ProgressFrame {

        private enum Type {
            HTTP, TORRENT, EXTRACT
        }

        JFrame dlFrame = null;
        JProgressBar progressBar = null;
        JLabel bottom = null;

        String bottomLabel = null;

        public ProgressFrame(String url, String savePath, long length, Type pType) {
            String title, topLabel;
            switch (pType) {
                case HTTP:
                    title = "HTTP Download Progress";
                    topLabel = "Downloading " + url;
                    bottomLabel = "to " + savePath + "...";
                    break;

                case TORRENT:
                    title = "Torrent Download Progress";
                    topLabel = "Downloading " + url;
                    bottomLabel = "to " + savePath + "...";
                    break;

                case EXTRACT:
                    title = "Extraction Progress";
                    topLabel = "Extracting " + url;
                    bottomLabel = "to " + savePath + "...";
                    break;

                default:
                    throw new RuntimeException("Unknown Progress Type.");
            }

            dlFrame = new JFrame(title);
            dlFrame.setLayout(new BorderLayout());
            progressBar = new JProgressBar(0, (int) length);
            progressBar.setValue(0);
            progressBar.setStringPainted(true);
            dlFrame.getContentPane().add(new JLabel(topLabel), BorderLayout.NORTH);
            dlFrame.getContentPane().add(progressBar, BorderLayout.CENTER);
            dlFrame.getContentPane().add(bottom = new JLabel(bottomLabel), BorderLayout.SOUTH);

            dlFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            dlFrame.setResizable(false);
            dlFrame.pack();
            // sets the frame to appear in the middle of the screen
            // when called after pack()
            dlFrame.setLocationRelativeTo(null);
            dlFrame.setVisible(true);
        }

        public ProgressFrame(String url, String savePath, long length) {
            this(url, savePath, length, Type.HTTP);
        }

        public void dispose() {
            dlFrame.dispose();
        }

        public void addProgress(int progress) {
            progressBar.setValue(progressBar.getValue() + progress);
        }

        public void setProgress(int progress) {
            progressBar.setValue(progress);
        }

        public void setText(String text) {
            bottom.setText("<html>" + bottomLabel + "<hr>" + text + "</html>");
            dlFrame.pack();
        }

    }

    protected static class ProgressInputStream extends FilterInputStream {

        private ProgressFrame pf = null;

        protected ProgressInputStream(InputStream in, String url, String savePath, long length, ProgressFrame.Type pType) {
            super(in);
            pf = new ProgressFrame(url, savePath, length, pType);
        }

        protected ProgressInputStream(InputStream in, String url, String savePath, long length) {
            this(in, url, savePath, length, ProgressFrame.Type.HTTP);
        }

        public void setText(String text) {
            pf.setText(text);
        }

        @Override
        public int read() throws IOException {
            int byteValue = super.read();
            if (byteValue != -1) pf.addProgress(1);
            return byteValue;
        }

        @Override
        public int read(byte[] b) throws IOException {
            int bytesRead = super.read(b);
            if (bytesRead != -1) pf.addProgress(bytesRead);
            return bytesRead;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            int bytesRead = super.read(b, off, len);
            if (bytesRead != -1) pf.addProgress(bytesRead);
            return bytesRead;
        }

        @Override
        public void close() throws IOException {
            pf.dispose();
            super.close();
        }
    }

    protected static class NullOutputStream extends OutputStream {

        @Override
        public void write(byte[] b, int off, int len) {

        }

        @Override
        public void write(int b) {

        }

        @Override
        public void write(byte[] b) throws IOException {

        }

    }

}
