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

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class ChecksumInputStream extends FilterInputStream {

    private Checksum cs;

    /**
     * This creates an InputStream that calculates the CRC as bytes are read.
     * @param in InputStream to calculate CRC for.
     */
    public ChecksumInputStream(InputStream in) {
        super(in);
        cs = new CRC32();
    }

    /**
     * This creates an InputStream that calculates the CRC as the bytes are read.  This constructor is useful if you
     * want to calculate the Checksum of numerous InputStreams all calculated together.
     * @param in
     * @param cs
     */
    public ChecksumInputStream(InputStream in, Checksum cs) {
        super(in);
        this.cs = cs;
    }

    public long getValue() {
        return cs.getValue();
    }

    @Override
    public int read() throws IOException {
        int byteValue = super.read();
        if (byteValue != -1) cs.update(byteValue);
        return byteValue;
    }
/*
    @Override
    public int read(byte[] b) throws IOException {
        int bytesRead = super.read(b);
        if (bytesRead != -1) cs.update(b, 0, b.length);
        return bytesRead;
    }
*/
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);
        if (bytesRead != -1) cs.update(b, off, bytesRead);
        return bytesRead;
    }

}
