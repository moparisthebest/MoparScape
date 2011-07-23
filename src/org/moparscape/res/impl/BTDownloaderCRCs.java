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

package org.moparscape.res.impl;

/**
 * The crcs array in this file are automatically generated, so don't touch.
 */
public class BTDownloaderCRCs {

    private static final long[] crcs = new long[]{1388496215L /*-java_client.linux.x86*/, 1335574431L /*-java_client.osx.i386*/, 2025981925L /*-java_client.osx.ppc*/, 3379902210L /*-java_client.win32.exe*/};

    public static final int LINUX = 0;
    public static final int OSX386 = 1;
    public static final int OSXPPC = 2;
    public static final int WINDOWS = 3;


    public static long getCRC(int index){
        return crcs[index];
    }
}
