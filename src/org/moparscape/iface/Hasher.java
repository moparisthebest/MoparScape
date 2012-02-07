/*
 * Copyright (C) 2012  moparisthebest
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

package org.moparscape.iface;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hasher {

    private MessageDigest md = null;

    /**
     * This reverts to a default of the SHA-1 algorithm
     */
    public Hasher() {
        this("SHA-1");
    }

    /**
     * You can specify whatever algorithm that Java supports to this, and if it isn't supported it will first
     * try to use SHA-1 and then MD5 before showing a warning and reverting to not hashing anything.
     *
     * null as the algorithm has a special value meaning you don't want hashString to actually hash anything.
     *
     * @param algorithm
     */
    public Hasher(String algorithm) {
        if(algorithm == null || algorithm.equalsIgnoreCase("none"))
            return;
        try {
            md = MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            try {
                md = MessageDigest.getInstance("SHA-1");
            } catch (NoSuchAlgorithmException e2) {
                try {
                    md = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException e3) {
                    System.err.println("Error: Your passwords will not be hashed before being sent over the network, be careful, and don't use anything important!!!!");
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Returns a hexadecimal representation of the hash of the string.
     *
     * @param toHash
     * @return
     */
    public synchronized String hashString(String toHash) {
        if (toHash == null)
            return null;
        if (md == null)
            return toHash;
        md.reset();
        md.update(toHash.getBytes());
        String ret = new java.math.BigInteger(1, md.digest()).toString(16);
        md.reset();
        return ret;
    }
}
