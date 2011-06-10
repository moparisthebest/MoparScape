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

import java.io.*;
import java.net.URL;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

public class HelpMe {

    public static void main(String[] args) throws Exception {
        String savePath = "./";
        String fileName = "java_client.win32.exe";
        File gzipFile = new File(savePath + "java_client.win32.exe.gz");
        if (!gzipFile.exists()){
            System.out.println("downloading gzip file...");
            writeStream(new URL("http://www.moparscape.org/libs/java_client.win32.exe.gz").openConnection().getInputStream(),
                    new FileOutputStream(gzipFile));
        }

        InputStream is = new FileInputStream(gzipFile);
        System.out.println("fileName: " + fileName);
        System.out.println("crc should be: 1752045540");
        CRC32 cr = new CRC32();
        System.out.println("extracting file and calculating CRC:");
        writeStream(new ChecksumInputStream(new GZIPInputStream(is), cr), new FileOutputStream(savePath + fileName));
        System.out.println("crc32: " + cr.getValue());
        cr.reset();
        //cr = new CRC32();  // same as above, but I tried
        System.out.println("calculating CRC of the file we just extracted (should be the exact same!):");
        writeStream(new ChecksumInputStream(new FileInputStream(savePath + fileName), cr), new FileOutputStream(savePath + fileName + ".bob"));
        System.out.println("crc32: " + cr.getValue());
    }

    public static final int bufferSize = 512;

    public static void writeStream(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[bufferSize];
        int len;
        while ((len = in.read(buffer)) >= 0) {
            out.write(buffer, 0, len);
            //if(in instanceof ZipInputStream) try{ Thread.sleep(1); }catch(InterruptedException e){ e.printStackTrace(); }

        }
        // if its a ZipInputStream we don't want to close it
        if (!(in instanceof ZipInputStream))
            in.close();
        out.close();
    }

    public static class ChecksumInputStream extends FilterInputStream {

        private Checksum cs;

        public ChecksumInputStream(InputStream in, Checksum cs) {
            super(in);
            this.cs = cs;
        }

        public long getValue() {
            return cs.getValue();
        }

        @Override
        public int read() throws IOException {
            int byteValue = super.read();
            if (byteValue != -1) cs.update(byteValue);
            return byteValue;
        }

        @Override
        public int read(byte[] b) throws IOException {
            int bytesRead = super.read(b);
            if (bytesRead != -1) cs.update(b, 0, b.length);
            return bytesRead;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            int bytesRead = super.read(b, off, len);
            if (bytesRead != -1) cs.update(b, off, len);
            return bytesRead;
        }

    }
}
