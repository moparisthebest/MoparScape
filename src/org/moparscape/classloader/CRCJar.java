package org.moparscape.classloader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author mopar
 */
public class CRCJar {

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: CRCJar logFile jarFile...");
            return;
        }
        PrintStream log;
        if(args[0].equals("-"))
            log = System.out;
        else
            log = new PrintStream(new FileOutputStream(args[0]));

        for (int x= 1; x < args.length; ++x) {
            CRCClassLoader cl = new CRCClassLoader(args[x]);
            log.println(args[x] + " crc: " + cl.getCRC());
        }
    }
}
