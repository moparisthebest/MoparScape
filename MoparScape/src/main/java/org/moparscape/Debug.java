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

package org.moparscape;

/**
 * This class is just for convenience, to handle debug levels and print developer info.
 */
public class Debug {
    public static boolean debug = false;

    /**
     * This is called when you only want to print something to the command line in debug mode.
     *
     * @param s String to print only in debug mode.
     */
    public static void debug(String s) {
        if (debug)
            System.out.println(s);
    }

    public static void debug(String s, String... args) {
        if (debug) {
            System.out.printf(s, args);
            System.out.println();
        }
    }

    public static void debug(Object[] o){
        if(!debug)
            return;
        for(int x = 0; x < o.length; ++x)
            System.out.println(x+": "+o[x]);
    }

    /**
     * Called when you want to print an exception's Stack Trace only when in debug mode.
     *
     * @param e
     */
    public static void debug(Exception e) {
        if (debug && e != null)
            e.printStackTrace();
    }

    /**
     * Is debug on or not
     *
     * @return Whether MoparScape was run in debug mode
     */
    public static boolean debug() {
        return debug;
    }
}
