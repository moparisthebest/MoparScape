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

import java.io.*;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 4/22/11
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChecksumInfo {

    private long expectedCRC;
    private Checksum cs;
    private String[] list;
    private boolean whitelist;

    private boolean checksumCalculated = false;

    public ChecksumInfo() {
        this(0);
    }

    public static ChecksumInfo getChecksumInfo(String expectedCRC) {
        long eCRC = 0;
        try {
            eCRC = Long.parseLong(expectedCRC);
        } catch (Exception e) {
            //return null;  // should I do this?
        }
        return new ChecksumInfo(eCRC, null, true);
    }

    public ChecksumInfo(long expectedCRC) {
        this(expectedCRC, null, true);
    }

    public ChecksumInfo(long expectedCRC, Checksum cs) {
        this(expectedCRC, cs, true);
    }

    public ChecksumInfo(long expectedCRC, String[] list) {
        this(expectedCRC, null, true, list);
    }

    public ChecksumInfo(long expectedCRC, boolean whitelist, String... list) {
        this(expectedCRC, null, whitelist, list);
    }

    public ChecksumInfo(long expectedCRC, Checksum cs, String... list) {
        this(expectedCRC, cs, true, list);
    }

    public ChecksumInfo(long expectedCRC, Checksum cs, boolean whitelist, String... list) {
        if (cs == null)
            cs = new CRC32();

        this.expectedCRC = expectedCRC;
        this.cs = cs;
        this.setList(whitelist, list);
    }

    public void setList(boolean whitelist, String... list) {

        if (list.length == 0)
            list = null;
        this.list = list;
        this.whitelist = whitelist;
    }

    /**
     * This function recursively checksums an entire directory, optionally applying a whitelist or a blacklist
     *
     * @param savePath
     * @return
     */
    public synchronized boolean checksumMatch(String savePath) {
        if (checksumCalculated)
            cs.reset();
        checksumCalculated = true;
        File savePathFile = new File(savePath);
        // if we are using a whitelist with a list, just do those files
        if (whitelist && list != null && list.length > 0) {
            NullOutputStream nos = new NullOutputStream();
            for (String fileName : list)
                checksumSingleFile(new File(savePathFile, fileName), cs, nos);
            // then we are dealing with a blacklist, or no list
        } else {
            FileFilter ff = null;
            if (list != null && list.length > 0 && savePathFile.isDirectory()) {
                final File[] flist = new File[list.length];
                for (int x = 0; x < list.length; ++x)
                    flist[x] = new File(savePathFile, list[x]);
                //for(File f : flist) System.out.println("file list: "+f);
                ff = new FileFilter() {
                    public boolean accept(File name) {
                        //System.out.println("in list accept:"+name);
                        if (name.isDirectory())
                            return true;
                        for (File f : flist)
                            if (f.equals(name))
                                return whitelist;
                        return !whitelist;
                    }
                };
            }
            recursiveChecksum(savePathFile, cs, new NullOutputStream(), ff);
        }

        return cs.getValue() == expectedCRC;
    }

    public long getExpectedChecksum() {
        return expectedCRC;
    }

    public synchronized long getChecksum() {
        if (!checksumCalculated)
            throw new IllegalStateException("Must call checksumMatch to calculate Checksum first.");
        return cs.getValue();
    }

    public synchronized boolean checksumMatch(InputStream is) {
        return this.checksumMatch(is, null);
    }

    /**
     * This function checksums the entire InputStream
     *
     * @param is
     * @return
     */
    public synchronized boolean checksumMatch(InputStream is, OutputStream os) {
        if (checksumCalculated)
            cs.reset();
        checksumCalculated = true;
        try {
            //Downloader.writeStream(new ChecksumInputStream(is, cs), os == null ? new NullOutputStream() : os);
            Downloader.writeStream(new CheckedInputStream(is, cs), os == null ? new NullOutputStream() : os);
        } catch (Exception e) {
            // if there is an exception, just ignore it
        }
        return cs.getValue() == expectedCRC;
    }

    private static void checksumSingleFile(File path, Checksum cs, NullOutputStream nos) {
        if (path.isFile())
            try {
                //System.out.printf("checksuming File: '%s' crc so far: '%d'\n", path.getName(), cs.getValue());
                //Downloader.writeStream(new ChecksumInputStream(new FileInputStream(path), cs), nos);
                Downloader.writeStream(new CheckedInputStream(new FileInputStream(path), cs), nos);
            } catch (Exception e) {
                // if there is an exception, just ignore it
            }
    }

    private static void recursiveChecksum(File path, Checksum cs, NullOutputStream nos, FileFilter filter) {
        if (!path.exists())
            return;
        if (path.isDirectory()) {
            File[] children = path.listFiles(filter);
            //File[] children = path.listFiles();
            if (children.length == 0)
                return;
            // checksums depend on order, so we must sort them
            Arrays.sort(children);
            //System.out.println("files sorted length: "+children.length);
            //System.out.println("children[0]: "+children[0]);
            for (File file : children) {
                //System.out.println("Checksum so far: " + cs.getValue());
                //System.out.println("Checking filename: " + file.getAbsolutePath());
                recursiveChecksum(file, cs, nos, filter);
            }
            return;
        }
        checksumSingleFile(path, cs, nos);
    }

    public static long crcFile(String file) {
        ChecksumInfo ci = new ChecksumInfo();
        ci.checksumMatch(file);
        return ci.getChecksum();
    }

    @Override
    public String toString() {
        return "ChecksumInfo{" +
                "expectedCRC=" + expectedCRC +
                ", cs=" + cs +
                ", list=" + (list == null ? null : Arrays.asList(list)) +
                ", whitelist=" + whitelist +
                ", checksumCalculated=" + checksumCalculated +
                '}';
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: ChecksumInfo logFile jarFile...");
            return;
        }

        int extraSpaces = 2;
        boolean computerReadable = false;

        // check first 2 arguments for computer readable flag and alternate output stream
        int startArg = 0;
        for (int x = 0; x < 2; ++x)
            if (args[x].startsWith("-")) {
                ++startArg;
                if (args[x].equals("-c"))
                    computerReadable = true;
                else if (args[x].equals("-o"))
                    System.setOut(new PrintStream(new FileOutputStream(args[x + 1])));
            }

        String[] checksumArray = new String[args.length];
        int longestLength = 0;
        for (int x = startArg; x < args.length; ++x) {
            ChecksumInfo ci = new ChecksumInfo();
            ci.checksumMatch(new FileInputStream(args[x]));
            checksumArray[x] = String.valueOf(ci.getChecksum());
            if (checksumArray[x].length() > longestLength)
                longestLength = checksumArray[x].length();
        }

        String format = computerReadable ? "%s%sL /*-%s*/" : "%-" + (longestLength + extraSpaces) + "s%s";
        if (!computerReadable)
            for (int x = startArg; x < args.length; ++x)
                System.out.println(String.format(format, checksumArray[x], args[x]));
        else
            for (int x = startArg; x < args.length; ++x)
                System.out.print(String.format(format, (x > startArg) ? ", " : "", checksumArray[x], args[x].substring(args[x].lastIndexOf("/") + 1)));
    }
}
