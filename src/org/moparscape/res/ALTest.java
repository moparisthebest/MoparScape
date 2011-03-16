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

import java.util.ArrayList;
import java.util.List;

public class ALTest {

    public static void main(String[] args) throws Exception {
        final List<Object> downloadItems = new ArrayList<Object>(5);
        int uid = 0;
        downloadItems.add(new ALTest(uid));
        System.out.println("downloads size: "+downloadItems.size());
        System.out.println("downloads contains(uid): "+downloadItems.contains(uid));
        System.out.println("downloads contains(Integer(uid)): "+downloadItems.contains(new Integer(uid)));
        System.out.println("downloads contains(ALTest): "+downloadItems.contains(new ALTest(uid)));
    }

    private int uid;

    public ALTest(int uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object other) {
        System.out.println("ALTest equals: " + other);
        return ((other instanceof ALTest) && ((ALTest) other).uid == this.uid) ||
                ((other instanceof Integer) && other.equals(this.uid));
    }
}
