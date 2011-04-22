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
import java.util.zip.CRC32;
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

    public ChecksumInfo(long expectedCRC) {
        this(expectedCRC, null, null, true);
    }

    public ChecksumInfo(long expectedCRC, Checksum cs) {
        this(expectedCRC, cs, null, true);
    }

    public ChecksumInfo(long expectedCRC, String[] list) {
        this(expectedCRC, null, list, true);
    }

    public ChecksumInfo(long expectedCRC, String[] list, boolean whitelist) {
        this(expectedCRC, null, list, whitelist);
    }

    public ChecksumInfo(long expectedCRC, Checksum cs, String[] list) {
        this(expectedCRC, cs, list, true);
    }

    public ChecksumInfo(long expectedCRC, Checksum cs, String[] list, boolean whitelist) {
        this.expectedCRC = expectedCRC;
        this.cs = cs;
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
        if (!savePath.endsWith("/"))
            savePath += "/";
        if (cs == null)
            cs = new CRC32();
        FileFilter ff = null;
        if (list != null) {
            final File[] flist = new File[list.length];
            for (int x = 0; x < list.length; ++x)
                flist[x] = new File(savePath + list[x]);
            ff = new FileFilter() {
                public boolean accept(File name) {
                    for (File f : flist)
                        if (f.equals(name))
                            return whitelist;
                    return !whitelist;
                }
            };
        }
        recursiveChecksum(new File(savePath), cs, new NullOutputStream(), ff);

        return cs.getValue() == expectedCRC;
    }

    private static void recursiveChecksum(File path, Checksum cs, NullOutputStream nos, FileFilter filter) {
        if (!path.exists())
            return;
        for (File file : path.listFiles(filter)) {
            System.out.println("Checksum so far: " + cs.getValue());
            System.out.println("Checking filename: " + file.getAbsolutePath());
            if (file.isDirectory()) {
                recursiveChecksum(file, cs, nos, filter);
            } else {
                try {
                    Downloader.writeStream(new ChecksumInputStream(new FileInputStream(file), cs), nos);
                } catch (Exception e) {
                    // if there is an exception, just ignore it
                }
            }
        }
    }

    private static class NullOutputStream extends OutputStream {

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
