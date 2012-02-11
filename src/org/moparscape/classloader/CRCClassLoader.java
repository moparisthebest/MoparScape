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

import org.moparscape.Debug;
import org.moparscape.res.impl.Downloader;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.GZIPInputStream;

/**
 * This is a class loader that loads classes from jars on the filesystem, optionally checking the CRC of the classes and
 * grabbing new updated jars if the CRC doesn't match.
 * <p/>
 */
public class CRCClassLoader extends URLClassLoader {

    public static final String[] illegalPackages = new String[]{"java.", "sun.", "javax."};

    private Map<String, byte[]> classes = new HashMap<String, byte[]>();
    private long crcVal = 0;
    private boolean fileExists = false;
    private ClassLoader parent = null;
    private ProtectionDomain pd = null;

    private int classesLoaded = 0;

    /**
     * Reads the jar file and calculates the CRC.  Sets up the class.
     * Responsibility of checking the CRC is the user's
     *
     * @param jarFileLoc The location of the jar file to load on the disk
     */
    public CRCClassLoader(String jarFileLoc) throws IOException {
        this(jarFileLoc, null);
    }

    public CRCClassLoader(String jarFileLoc, Class parent) throws IOException {
        //super(new URL[]{new URL("file://" + jarFileLoc)}, parent == null ? null : parent.getClassLoader());
        super(new URL[]{new URL("file://" + jarFileLoc)}, null);
        setup(jarFileLoc);
        if (parent != null) {
            this.parent = parent.getClassLoader();
            this.pd = parent.getProtectionDomain();
        }
    }

    public static CRCClassLoader newInstance(String jarFileLoc, String backupURL, long expectedCRC, boolean crcMismatchException) throws IOException {
        return newInstance(jarFileLoc, backupURL, expectedCRC, null, crcMismatchException);
    }

    /**
     * Reads the jar file and calculates the CRC.  Sets up the class.
     * If the provided CRC does not match, downloads the new jar file to
     * the provided location and tries again.  If it fails again, an IOException is thrown.
     *
     * @param jarFileLoc The location of the jar file to load on the disk
     */
    public static CRCClassLoader newInstance(String jarFileLoc, String backupURL, long expectedCRC, Class parent, boolean crcMismatchException) throws IOException {
        //super(new URL[]{}, parent == null ? null : parent.getClassLoader());
        CRCClassLoader ret = null;
        // wrap this one in a try / catch, so we can retry if it throws an exception
        try {
            ret = new CRCClassLoader(jarFileLoc, parent);

            // check CRC
            if (ret.successfullyLoaded(expectedCRC))
                return ret;
        } catch (IOException e) {
            //e.printStackTrace();
            // if we don't have a backupURL, just go ahead and rethrow this exception, can't do anything more
            if (backupURL == null)
                throw e;
        }

        if (backupURL != null) {

            //if(ret == null || ret.getCRC() != 0)
            if (ret != null && ret.fileExists())
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
                jarFileLoc = org.moparscape.res.ResourceGrabber.getRG().firstFileEndsWithIgnoreCase(jarWait, "jar.gz", "jar");
                org.moparscape.res.ResourceGrabber.getRG().freeResources(jarWait);
            }
            Debug.debug("new jarFileLoc: " + jarFileLoc);
            ret = new CRCClassLoader(jarFileLoc, parent);

        }
        if (!ret.successfullyLoaded(expectedCRC) && ret.getCRC() != 0) {
            String s = "CRC checksum failed. crc:" + ret.getCRC() + " expected:" + expectedCRC;
            if (crcMismatchException)
                throw new IOException(s);
            else
                System.err.println(s);
        }
        return ret;
    }

    public void addJar(String jarFileLoc) throws IOException {
        //this.setup(jarFileLoc, false);
        super.addURL(new URL("file://" + jarFileLoc));
    }

    private void setup(String jarFileLoc) throws IOException {
        this.setup(jarFileLoc, true);
    }

    private void setup(String jarFileLoc, boolean updateCRC) throws IOException {
        if (jarFileLoc == null)
            return;
        File f = new File(jarFileLoc);
        fileExists = f.exists() && f.isFile() && f.canRead();
        if (!fileExists) {
            Debug.debug("Jar file doesn't exist: " + jarFileLoc);
            return;
        }
        Debug.debug("Loading classes from jar: " + f.getAbsolutePath());

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
        JarInputStream in = new JarInputStream(is);
        JarEntry entry;
        while ((entry = in.getNextJarEntry()) != null) {
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
                ++classesLoaded;
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

    public boolean fileExists() {
        return this.fileExists;
    }

    public boolean successfullyLoaded() {
        //System.out.println("classesLoaded: "+classesLoaded);
        return this.successfullyLoaded(0);
    }

    public boolean successfullyLoaded(long expectedCRC) {
        if (expectedCRC == 0)
            return classesLoaded > 0;
        else
            return crcVal == expectedCRC;
        //return (expectedCRC == 0 && classesLoaded > 0) || crcVal == expectedCRC;
    }

    @Override
    public String toString() {
        return "CRCClassLoader{" +
                "crcVal=" + crcVal +
                ", classesLoaded=" + classesLoaded +
                ", fileExists=" + fileExists +
                //", successfullyLoaded(0)=" + successfullyLoaded(0) +
                ", classes" + classes +
                '}';
    }

    /*
    protected synchronized Class<?> loadClass(String name, boolean resolve)
            throws ClassNotFoundException {
        System.out.println("loadClass called: "+name);
        // First, check if the class has already been loaded
        Class c = findLoadedClass(name);
        System.out.println("past findLoadedClass: "+c);
        if (c == null) {
            try {
                c = super.loadClass(name, false);
                System.out.println("past super.loadClass: "+c);
            } catch (ClassNotFoundException e) {
                // ClassNotFoundException thrown if class not found
                // from the non-null parent class loader
            }
            if (c == null) {
                // If still not found, then invoke findClass in order
                // to find the class.
                c = findClass(name);
                System.out.println("past findClass: "+c);
            }
        }
        if (resolve) {
            resolveClass(c);
        }
        System.out.println("returning: "+c);
        return c;
    }*/

    // strange errors
    /*
    32-bit:
    past findLoadedClass: null
Exception in thread "thread applet-org.moparscape.Applet-1" java.lang.ClassFormatError: Incompatible magic value 1011373133 in class file client
	at java.lang.ClassLoader.defineClass1(Native Method)
	at java.lang.ClassLoader.defineClassCond(ClassLoader.java:632)
	at java.lang.ClassLoader.defineClass(ClassLoader.java:616)
	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
	at sun.plugin2.applet.Applet2ClassLoader.findClass(Applet2ClassLoader.java:141)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:307)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:296)
	at org.moparscape.classloader.CRCClassLoader.loadClass(CRCClassLoader.java:238)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:248)
	at org.moparscape.MainPanel.init(MainPanel.java:415)
	at org.moparscape.Applet.init(Applet.java:42)
	at sun.plugin2.applet.Plugin2Manager$AppletExecutionRunnable.run(Plugin2Manager.java:1579)
	at java.lang.Thread.run(Thread.java:619)

	64-bit:
	past findLoadedClass: null
java.lang.SecurityException: trusted loader attempted to load sandboxed resource from http://mopar.moparscape.org/
	at com.sun.deploy.security.CPCallbackHandler$ParentCallback.check(CPCallbackHandler.java:311)
	at com.sun.deploy.security.CPCallbackHandler$ParentCallback.access$1500(CPCallbackHandler.java:123)
	at com.sun.deploy.security.CPCallbackHandler$ChildElement.checkResource(CPCallbackHandler.java:480)
	at sun.plugin2.applet.Plugin2ClassLoader.checkResource(Plugin2ClassLoader.java:856)
	at sun.plugin2.applet.Applet2ClassLoader.findClass(Applet2ClassLoader.java:245)
	at sun.plugin2.applet.Plugin2ClassLoader.loadClass0(Plugin2ClassLoader.java:250)
	at sun.plugin2.applet.Plugin2ClassLoader.loadClass(Plugin2ClassLoader.java:180)
	at sun.plugin2.applet.Plugin2ClassLoader.loadClass(Plugin2ClassLoader.java:161)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:295)
	at org.moparscape.classloader.CRCClassLoader.loadClass(CRCClassLoader.java:238)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
	at org.moparscape.MainPanel.init(MainPanel.java:415)
	at org.moparscape.Applet.init(Applet.java:42)
	at sun.plugin2.applet.Plugin2Manager$AppletExecutionRunnable.run(Plugin2Manager.java:1637)
	at java.lang.Thread.run(Thread.java:662)
     */

    /**
     * Is called by the ClassLoader when the requested class
     * is not found in its cache. The parent is only used when
     * this is ran as an applet, strangely.
     *
     * @param name The name of the class
     */
    public Class<?> findClass(String name) throws ClassNotFoundException {
        //System.out.println("CRCClassLoader: Requesting class '" + name + "'");
        // let's make sure we don't provide a class in an illegal package
        // only let the parent load it (probably system classloader, which won't allow a bad package anyway)
        for (String pack : illegalPackages)
            if (name.startsWith(pack)) {
                // free the memory if it is taking up any
                classes.remove(name);
                // if the parent is null, we have no choice
                if (parent == null)
                    throw new ClassNotFoundException("Class '" + name + "' is in illegal package '" + pack + "'");
                // otherwise let the parent worry about it
                return parent.loadClass(name);
            }

        // first, try to load them from the classes we have on hand
        byte[] classBytes = classes.get(name);
        if (classBytes != null) {
            // free the memory
            classes.remove(name);
            //System.out.printf("removed class: '%s', size: '%d'\n", name, classes.size());
            // return the class
            return defineClass(name, classBytes, 0, classBytes.length, pd);
        }
        // now let's check the parent, if we have one
        if (parent != null)
            try {
                return parent.loadClass(name);
            } catch (Exception e) {
                // ignore
            }

        // if we still haven't found it, ask super, and if it's not found there, they will throw the exception for us
        return super.findClass(name);
    }

}
