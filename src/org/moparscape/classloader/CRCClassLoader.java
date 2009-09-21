/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moparscape.classloader;

import org.moparscape.Update;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.CRC32;

/**
 * This class feeds the classes into the applet.
 */
public class CRCClassLoader extends ClassLoader {

    private Map<String, byte[]> classes;
    private long crcVal;

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

    /**
     * Reads the jar file and calculates the CRC.  Sets up the class.
     * If the provided CRC does not match, downloads the new jar file to
     * the provided location and tries again.  If it fails again, an IOException is thrown.
     *
     * @param jarFileLoc The location of the jar file to load on the disk
     */
    public CRCClassLoader(String jarFileLoc, String backupURL, long expectedCRC) throws IOException {
        super();

        // wrap this one in a try / catch, so we can retry if it throws an exception
        try {
            setup(jarFileLoc);

            // check CRC
            if (getCRC() == expectedCRC)
                return;
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("CRC checksum failed, redownloading file");

//        URLConnection uc = new URL(backupURL).openConnection();
//        InputStream in = uc.getInputStream();
//        FileOutputStream fos = new FileOutputStream(jarFileLoc);
//        byte[] buffer = new byte[1024];
//        int len;
//        while ((len = in.read(buffer)) >= 0)
//            fos.write(buffer, 0, len);
//        fos.flush();
//        in.close();
//        fos.close();

        // use Update instead
        new Update(backupURL, jarFileLoc, true);

        setup(jarFileLoc);

        if (getCRC() != expectedCRC)
            throw new IOException("CRC checksum failed. crc:" + getCRC() + " expected:" + expectedCRC);
    }

    private void setup(String jarFileLoc) throws IOException {

        JarFile jf = new JarFile(jarFileLoc);
        Enumeration entries = jf.entries();

        classes = new HashMap<String, byte[]>();
        crcVal = 0;

        CRC32 crc = new CRC32();
        byte[] buffer = new byte[1024];

        while (entries.hasMoreElements()) {
            JarEntry entry = (JarEntry) entries.nextElement();
            if (entry.getName().endsWith(".class")) {
                //System.out.println("class name: " + entry.getName());
                InputStream in = jf.getInputStream(entry);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                int len;
                while ((len = in.read(buffer)) >= 0)
                    baos.write(buffer, 0, len);
                baos.flush();
                in.close();
                baos.close();

                // update crc
                byte[] classArr = baos.toByteArray();
                crc.update(classArr);

                String className = entry.getName().substring(0, entry.getName().lastIndexOf(".")).replaceAll("/", ".");
                // save class
                classes.put(className, classArr);
            }
        }
        jf.close();

        crcVal = crc.getValue();
    }

    public long getCRC() {
        return crcVal;
    }

    /**
     * Is called by the ClassLoader to load a class, It checks in its cache,
     * and in its parent ClassLoader, if not found it calls findClass()
     */
    public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        //uncomment this if you want to see the loaded classes
        //Cherokee.debug("Applet is loading class " + name);
        return super.loadClass(name, resolve);
    }

    /**
     * Is called by the ClassLoader when the requested class
     * is not found in its cache. Parses the class from its bytecode.
     *
     * @param name The name of the class
     */
    public Class<?> findClass(String name) throws ClassNotFoundException {

        byte[] classBytes = classes.get(name);
        if (classBytes == null)
            throw new ClassNotFoundException("Couldn't find class " + name);
        Class foundClass = defineClass(name, classBytes, 0, classBytes.length);
        return foundClass;
    }

    /**
     * Is called by the ClassLoader when the requested resource is not
     * found in its cache. Gives a URL of the resource but doesnt check
     * if it exists.
     *
     * @param name The name of the resource
     */
    public URL findResource(String name) {
        //TODO find a way to check if the resource exists
        return super.findResource(name);
    }

    /**
     * Is called by the ClassLoader when the requested resources is not
     * found in its cache. Simply calls the superclasses method.
     *
     * @param name The name of the resource
     */
    public Enumeration<URL> findResources(String name) throws IOException {
        //TODO find a way to do this
        return super.findResources(name);
    }
}
