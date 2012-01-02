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

import org.moparscape.res.ChecksumInfo;
import org.moparscape.res.DownloadListener;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 3/12/11
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Downloader {

    public static final int bufferSize = 512;

    // enforce empty default public constructor
    public Downloader() {

    }

    public abstract void download(String url, String savePath, DownloadListener callback);

    public abstract boolean supportsURL(String url);

    public abstract String uniqueFoldername(String url);

    public void guessFilenames(String url, String savePath, java.util.List<String> files) {
        // here we know nothing about the downloading implementation, so we just list all the files in the 'savePath'
        listFiles(savePath, files);
    }

    /**
     * Downloads resource specified by url to savePath.
     *
     * @param url      This can be any URL Java can natively handle, in addition to magnet links, and torrent files both locally and at http and https URLs.
     * @param savePath Directory to save the URL to.
     * @throws IOException Passed from calls this method makes.

    public static void download(String url, String savePath) throws IOException {
    download(url, savePath, false);
    }
     */
    /**
     * Downloads resource specified by url to savePath, then extracts the downloaded file. Current supported types are .zip.gz, .zip, and .gz.
     *
     * @param url      This can be any URL Java can natively handle, in addition to magnet links, and torrent files both locally and at http and https URLs.
     * @param savePath Directory to save the URL to, and extract the supported files to.
     * @throws IOException Passed from calls this method makes.
     */
/*    public static void downloadExtract(String url, String savePath) throws IOException {
        download(url, savePath, true);
    }

    public static void download(String url, String savePath, boolean extract) throws IOException {
        if (isTorrent(url)) {

        } else {
            String toExtract = "";//new HTTPDownloader.download(url, savePath);
            if (extract)
                extractFile(toExtract, savePath);
        }
    }
  */
    public static void writeStream(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[bufferSize];
        int len;
        while ((len = in.read(buffer)) >= 0) {
            out.write(buffer, 0, len);
            //if(in instanceof ZipInputStream) try{ Thread.sleep(1); }catch(InterruptedException e){ e.printStackTrace(); }
            //if(in instanceof ProgressInputStream) try{ Thread.sleep(1); }catch(InterruptedException e){ e.printStackTrace(); }
        }
        // if its a ZipInputStream we don't want to close it
        if (!(in instanceof ZipInputStream))
            in.close();
        out.close();
    }


    public static void listFiles(String savePath, java.util.List<String> fileList) {
        synchronized (fileList) {
            fileList.clear();
            listFiles(new File(savePath), fileList);
        }
    }

    /**
     *
     * @param path
     * @param fileList This must be synchronized around before calling this method
     */
    private static void listFiles(File path, java.util.List<String> fileList) {
        if (!path.exists())
            return;

        //if(path.isFile() && !fileList.contains(path.getAbsolutePath()))
        if (path.isFile())
            fileList.add(path.getAbsolutePath());
        else if (path.isDirectory())
            for (File file : path.listFiles())
                listFiles(file, fileList);
    }

    /**
     * Currently supports .zip, .gz, and .zip.gz
     *
     * @param fileName
     * @param savePath
     * @throws IOException
     */
    public static void extractFile(String fileName, String savePath, DownloadListener callback) {
        File file = new File(fileName);
        try {
            long length = file.length();

            InputStream is = new FileInputStream(file);
            if (callback != null) {
                callback.extracting("Extracting " + fileName, length, "to " + savePath + "...");
                is = new ProgressInputStream(is, callback);
            }

            //if(true)throw new RuntimeException("woohoo! fake exceptions!");

            if (fileName.endsWith(".zip.gz"))
                is = new GZIPInputStream(is);
            else if (fileName.endsWith(".gz")) {
                // strip .gz off the end
                fileName = file.getName();
                fileName = fileName.substring(0, fileName.length() - 3);
                // exception for java_client.exefalse &&
                if (badExtension(fileName)) {
                    // input stream to store uncompressed data in, no use in uncompressing twice
                    // we could write this to temporary file on the system, and delete it if its bad
                    // but I really don't ever want a potentially malicious binary on the end-users system
                    // so we will just store it in memory (java_client.win32.exe is fairly small anyhow)
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ChecksumInfo ci = new ChecksumInfo(BTDownloaderCRCs.getCRC(BTDownloaderCRCs.WINDOWS));
                    if ((!fileName.endsWith("java_client.win32.exe")) || (!ci.checksumMatch(new GZIPInputStream(is), baos))) {
                        if (fileName.endsWith("java_client.win32.exe"))
                            System.out.println(String.format("CRC Mismatch for java_client.win32.exe, expected: %d actual: %d", ci.getExpectedChecksum(), ci.getChecksum()));

                        // then no exception, just return with error
                        if (callback != null)
                            callback.error("Bad extension, refusing to extract: " + fileName, null);
                        file.delete();
                        return;
                    }
                    System.out.println("exe passes");
                    // if we are here, this is our java_client.win32.exe, and the CRC is correct, now just write it out to the file
                    // this should be quick enough I'm not going to bother with a ProgressInputStream
                    //writeStream(new ByteArrayInputStream(baos.toByteArray()), new FileOutputStream(savePath + fileName));
                    FileOutputStream fos = new FileOutputStream(savePath + fileName);
                    fos.write(baos.toByteArray());
                    fos.flush();
                    fos.close();
                    return;
                }
                if (callback != null)
                    callback.setExtraInfo("Extracting File: " + fileName);
                writeStream(new GZIPInputStream(is), new FileOutputStream(savePath + fileName));
                return;
            } else if (fileName.endsWith(".zip")) {
                // if we are here, the streams are all set up to unzip below, so don't do anything
            } else {
                // otherwise this file can't be extracted, so just return for now
                if (callback != null)
                    callback.error("Extraction of this file type is unsupported: " + fileName, null);
                return;
            }
            ZipInputStream zin = new ZipInputStream(is);
            ZipEntry entry;
            while ((entry = zin.getNextEntry()) != null) {
                String name = entry.getName();
                if (entry.isDirectory()) { // Checks if the entry is a directory.
                    File folder = new File(savePath + name);
                    deleteDirectory(folder);
                    if (callback != null)
                        callback.setExtraInfo("Creating Directory: " + name);
                    folder.mkdir();
                } else {// If the entry isn't a directory, then it should be a file?
                    if (badExtension(entry.getName()))
                        continue;
                    if (callback != null)
                        callback.setExtraInfo("Extracting File: " + name);
                    writeStream(zin, new FileOutputStream(savePath + name));
                }
                //try{ Thread.sleep(1000); }catch(InterruptedException e){ e.printStackTrace(); }
            }
            zin.close();
            if (callback != null)
                callback.setExtraInfo("File extraction completed successfully!");
        } catch (Exception e) {
            if (callback != null)
                callback.error("Extraction of this file failed: " + file.getAbsolutePath(), e);
        }
    }

    public static boolean deleteDirectory(File path) {
        if (path.exists() && path.isDirectory())
            for (File file : path.listFiles())
                if (file.isDirectory())
                    deleteDirectory(file);
                else
                    file.delete();
        return path.delete();
    }

    protected static boolean badExtension(String file) {
        String[] badExts = new String[]{".exe", ".bat", ".cmd", ".com", ".sh", ".bash"};
        for (String badExt : badExts)
            if (file.endsWith(badExt))
                return true;
        return false;
    }

    protected static class ProgressInputStream extends FilterInputStream {

        private DownloadListener dl = null;
        int progress = 0;

        protected ProgressInputStream(InputStream in, DownloadListener dl) {
            super(in);
            this.dl = dl;
        }

        @Override
        public int read() throws IOException {
            int byteValue = super.read();
            if (byteValue != -1) dl.setProgress(++progress);
            return byteValue;
        }

        @Override
        public int read(byte[] b) throws IOException {
            int bytesRead = super.read(b);
            if (bytesRead != -1) dl.setProgress(progress += bytesRead);
            return bytesRead;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            int bytesRead = super.read(b, off, len);
            if (bytesRead != -1) dl.setProgress(progress += bytesRead);
            return bytesRead;
        }

        @Override
        public void close() throws IOException {
            //dl.finished();
            //dl.stopped();
            super.close();
        }
    }

}
