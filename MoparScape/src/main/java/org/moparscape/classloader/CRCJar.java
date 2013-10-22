/*
 * Copyright (C) 2009-2013 moparisthebest
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Official forums are http://www.moparscape.org/smf/
 * Email me at admin@moparisthebest.com.
 */

package org.moparscape.classloader;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * This calculates CRCs for a list of jars and outputs them to the requested file, or stdout.
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
