package org.moparscape.classloader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.CRC32;

/**
 * @author mopar
 */
public class CRCJar {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: CRCJar jarFile");
            return;
        }
        long current = System.currentTimeMillis();
        CRC32 crc = new CRC32();

        JarFile jf = new JarFile(args[0]);
        Enumeration entries = jf.entries();
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

                // String className = entry.getName().substring(0, entry.getName().lastIndexOf(".")).replaceAll("/", ".");
            }
        }
        jf.close();

        // 2092023208
        System.out.println(args[0] + " crc: " + crc.getValue());
        System.out.println(System.currentTimeMillis() - current + "ms");
    }
}
