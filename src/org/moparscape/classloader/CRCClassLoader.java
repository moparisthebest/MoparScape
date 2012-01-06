/*
 * Copyright (C) 2010  moparisthebest
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

package org.moparscape.classloader;

import org.moparscape.res.impl.Downloader;

import java.io.*;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.*;

/**
 * This is a class loader that loads classes from jars on the filesystem, optionally checking the CRC of the classes and
 * grabbing new updated jars if the CRC doesn't match.
 */
public class CRCClassLoader extends ClassLoader {

    private Map<String, byte[]> classes = new HashMap<String, byte[]>();
    private long crcVal;
    private ClassLoader parent = null;
    private ProtectionDomain pd = null;

    /**
     * Reads the jar file and calculates the CRC.  Sets up the class.
     * Responsibility of checking the CRC is the user's
     *
     * @param jarFileLoc The location of the jar file to load on the disk
     */
    public CRCClassLoader(String jarFileLoc) throws IOException {
        super();
        setup(jarFileLoc);
    }

    public CRCClassLoader(String jarFileLoc, Class parent) throws IOException {
        this(jarFileLoc);
        this.parent = parent.getClassLoader();
        this.pd = parent.getProtectionDomain();
    }

    public CRCClassLoader(String jarFileLoc, String backupURL, long expectedCRC, Class parent, boolean crcMismatchException) throws IOException {
        this(jarFileLoc, backupURL, expectedCRC, crcMismatchException);
        this.parent = parent.getClassLoader();
        this.pd = parent.getProtectionDomain();
    }

    /**
     * Reads the jar file and calculates the CRC.  Sets up the class.
     * If the provided CRC does not match, downloads the new jar file to
     * the provided location and tries again.  If it fails again, an IOException is thrown.
     *
     * @param jarFileLoc The location of the jar file to load on the disk
     */
    public CRCClassLoader(String jarFileLoc, String backupURL, long expectedCRC, boolean crcMismatchException) throws IOException {
        super();

        // wrap this one in a try / catch, so we can retry if it throws an exception
        try {
            setup(jarFileLoc);

            // check CRC
            if (getCRC() == expectedCRC)
                return;
        } catch (IOException e) {
            //e.printStackTrace();
            // if we don't have a backupURL, just go ahead and rethrow this exception, can't do anything more
            if (backupURL == null)
                throw e;
        }

        if (backupURL != null) {

            System.out.println("CRC checksum failed, downloading new file.");

//          URLConnection uc = new URL(backupURL).openConnection();
//          InputStream in = uc.getInputStream();
//          FileOutputStream fos = new FileOutputStream(jarFileLoc);
//          byte[] buffer = new byte[1024];
//          int len;
//          while ((len = in.read(buffer)) >= 0)
//            fos.write(buffer, 0, len);
//          fos.flush();
//          in.close();
//          fos.close();

            // use Update instead
            //new Update(backupURL, jarFileLoc, true);
            // use ResourceGrabber
            int jarWait = org.moparscape.res.ResourceGrabber.getRG().download(backupURL, jarFileLoc);
            if (org.moparscape.res.ResourceGrabber.getRG().waitCatch(jarWait)) {
                jarFileLoc = org.moparscape.res.ResourceGrabber.getRG().firstFileEndsWithIgnoreCase(jarWait, "jar");
                org.moparscape.res.ResourceGrabber.getRG().freeResources(jarWait);
            }

            setup(jarFileLoc);

        }

        if (getCRC() != expectedCRC) {
            String s = "CRC checksum failed. crc:" + getCRC() + " expected:" + expectedCRC;
            if (crcMismatchException)
                throw new IOException(s);
            else
                System.err.println(s);
        }
    }

    public void addJar(String jarFileLoc) throws IOException {
        this.setup(jarFileLoc, false);
    }

    private void setup(String jarFileLoc) throws IOException {
        this.setup(jarFileLoc, true);
    }

    private void setup(String jarFileLoc, boolean updateCRC) throws IOException {
        File f = new File(jarFileLoc);
        if (!f.exists() || !f.isFile()) {
            System.err.println("Jar file doesn't exist: " + jarFileLoc);
            return;
        }

        if (updateCRC)
            classes = new HashMap<String, byte[]>();

        CRC32 crc = null;
        if (updateCRC) {
            crcVal = 0;
            crc = new CRC32();
        }
        /*
        JarFile jf = new JarFile(f);
        Enumeration entries = jf.entries();
        while (entries.hasMoreElements()) {
            JarEntry entry = (JarEntry) entries.nextElement();
        */
        InputStream is = new FileInputStream(f);
        if (jarFileLoc.toLowerCase().endsWith(".gz"))
                is = new GZIPInputStream(is);
        ZipInputStream in = new ZipInputStream(is);
        ZipEntry entry;
        while ((entry = in.getNextEntry()) != null) {
            if (entry.getName().endsWith(".class")) {
                //InputStream in = jf.getInputStream(entry);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                OutputStream out = baos;
                if (updateCRC)
                    //in = new CheckedInputStream(in, crc);
                    out = new CheckedOutputStream(out, crc);

                Downloader.writeStream(in, out);

                String className = entry.getName().substring(0, entry.getName().lastIndexOf(".")).replaceAll("/", ".");
                //if (updateCRC)  System.out.println("class name: " + className);
                // save class
                classes.put(className, baos.toByteArray());
            }
        }
        //jf.close();
        in.close();

        if (updateCRC)
            crcVal = crc.getValue();
    }

    public long getCRC() {
        return crcVal;
    }

    /**
     * Is called by the ClassLoader when the requested class
     * is not found in its cache. The parent is only used when
     * this is ran as an applet, strangely.
     *
     * @param name The name of the class
     */
    public Class<?> findClass(String name) throws ClassNotFoundException {
        //System.out.println("CRCClassLoader: Requesting class '" + name + "'");
        byte[] classBytes = classes.get(name);
        if (classBytes == null) {
            if (parent == null)
                throw new ClassNotFoundException("Couldn't find class " + name);
            //System.out.println("Couldn't find class '" + name + "' trying parent class loader.");
            return parent.loadClass(name);
        }
        Class foundClass = defineClass(name, classBytes, 0, classBytes.length, pd);
        return foundClass;
    }

}
