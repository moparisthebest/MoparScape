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

package org.moparscape.cacheutils.v317;


import java.math.BigInteger;

public final class ByteStream {

    public static ByteStream create() {
        ByteStream stream_1 = new ByteStream();
        stream_1.currentOffset = 0;
        stream_1.buffer = new byte[5000];
        return stream_1;
    }

    private ByteStream() {
    }

    public ByteStream(byte abyte0[]) {
        buffer = abyte0;
        currentOffset = 0;
    }

    public void createFrame(int i) {
 //       buffer[currentOffset++] = (byte) (i + encryption.getNextKey());
    }

    public void writeByte(int i) {
        buffer[currentOffset++] = (byte) i;
    }

    public void writeWord(int i) {
        buffer[currentOffset++] = (byte) (i >> 8);
        buffer[currentOffset++] = (byte) i;
    }

    public void method400(int i) {
        buffer[currentOffset++] = (byte) i;
        buffer[currentOffset++] = (byte) (i >> 8);
    }

    public void writeDWordBigEndian(int i) {
        buffer[currentOffset++] = (byte) (i >> 16);
        buffer[currentOffset++] = (byte) (i >> 8);
        buffer[currentOffset++] = (byte) i;
    }

    public void writeDWord(int i) {
        buffer[currentOffset++] = (byte) (i >> 24);
        buffer[currentOffset++] = (byte) (i >> 16);
        buffer[currentOffset++] = (byte) (i >> 8);
        buffer[currentOffset++] = (byte) i;
    }

    public void method403(int j) {
        buffer[currentOffset++] = (byte) j;
        buffer[currentOffset++] = (byte) (j >> 8);
        buffer[currentOffset++] = (byte) (j >> 16);
        buffer[currentOffset++] = (byte) (j >> 24);
    }

    public void writeQWord(long l) {
        try {
            buffer[currentOffset++] = (byte) (int) (l >> 56);
            buffer[currentOffset++] = (byte) (int) (l >> 48);
            buffer[currentOffset++] = (byte) (int) (l >> 40);
            buffer[currentOffset++] = (byte) (int) (l >> 32);
            buffer[currentOffset++] = (byte) (int) (l >> 24);
            buffer[currentOffset++] = (byte) (int) (l >> 16);
            buffer[currentOffset++] = (byte) (int) (l >> 8);
            buffer[currentOffset++] = (byte) (int) l;
        }
        catch (RuntimeException runtimeexception) {
            throw new RuntimeException();
        }
    }

    public void writeString(String s) {
        //s.getBytes(0, s.length(), buffer, currentOffset);    //deprecated
        System.arraycopy(s.getBytes(), 0, buffer, currentOffset, s.length());
        currentOffset += s.length();
        buffer[currentOffset++] = 10;
    }

    public void writeBytes(byte abyte0[], int i, int j) {
        for (int k = j; k < j + i; k++)
            buffer[currentOffset++] = abyte0[k];

    }

    public void writeBytes(int i) {
        buffer[currentOffset - i - 1] = (byte) i;
    }

    public int readUnsignedByte() {
        return buffer[currentOffset++] & 0xff;
    }

    public byte readSignedByte() {
        return buffer[currentOffset++];
    }

    public int readUnsignedWord() {
        currentOffset += 2;
        return ((buffer[currentOffset - 2] & 0xff) << 8) + (buffer[currentOffset - 1] & 0xff);
    }

    public int readSignedWord() {
        currentOffset += 2;
        int i = ((buffer[currentOffset - 2] & 0xff) << 8) + (buffer[currentOffset - 1] & 0xff);
        if (i > 32767)
            i -= 0x10000;
        return i;
    }

    public int read3Bytes() {
        currentOffset += 3;
        return ((buffer[currentOffset - 3] & 0xff) << 16) + ((buffer[currentOffset - 2] & 0xff) << 8) + (buffer[currentOffset - 1] & 0xff);
    }

    public int readDWord() {
        currentOffset += 4;
        return ((buffer[currentOffset - 4] & 0xff) << 24) + ((buffer[currentOffset - 3] & 0xff) << 16) + ((buffer[currentOffset - 2] & 0xff) << 8) + (buffer[currentOffset - 1] & 0xff);
    }

    public long readQWord() {
        long l = (long) readDWord() & 0xffffffffL;
        long l1 = (long) readDWord() & 0xffffffffL;
        return (l << 32) + l1;
    }

    public String readString() {
        int i = currentOffset;
        while (buffer[currentOffset++] != 10) ;
        return new String(buffer, i, currentOffset - i - 1);
    }

    public byte[] readBytes() {
        int i = currentOffset;
        while (buffer[currentOffset++] != 10) ;
        byte abyte0[] = new byte[currentOffset - i - 1];
        System.arraycopy(buffer, i, abyte0, i - i, currentOffset - 1 - i);
        return abyte0;
    }

    public void readBytes(int i, int j, byte abyte0[]) {
        for (int l = j; l < j + i; l++)
            abyte0[l] = buffer[currentOffset++];
    }

    public void initBitAccess() {
        bitPosition = currentOffset * 8;
    }

    public int readBits(int i) {
        int k = bitPosition >> 3;
        int l = 8 - (bitPosition & 7);
        int i1 = 0;
        bitPosition += i;
        for (; i > l; l = 8) {
            i1 += (buffer[k++] & anIntArray1409[l]) << i - l;
            i -= l;
        }
        if (i == l)
            i1 += buffer[k] & anIntArray1409[l];
        else
            i1 += buffer[k] >> l - i & anIntArray1409[i];
        return i1;
    }

    public void finishBitAccess() {
        currentOffset = (bitPosition + 7) / 8;
    }

    public int method421() {
        int i = buffer[currentOffset] & 0xff;
        if (i < 128)
            return readUnsignedByte() - 64;
        else
            return readUnsignedWord() - 49152;
    }

    public int method422() {
        int i = buffer[currentOffset] & 0xff;
        if (i < 128)
            return readUnsignedByte();
        else
            return readUnsignedWord() - 32768;
    }

    public void doKeys() {
        int i = currentOffset;
        currentOffset = 0;
        byte abyte0[] = new byte[i];
        readBytes(i, 0, abyte0);
        BigInteger biginteger2 = new BigInteger(abyte0);
        BigInteger biginteger3 = biginteger2/*.modPow(biginteger, biginteger1)*/;
        byte abyte1[] = biginteger3.toByteArray();
        currentOffset = 0;
        writeByte(abyte1.length);
        writeBytes(abyte1, abyte1.length, 0);
    }

    public void method424(int i) {
        buffer[currentOffset++] = (byte) (-i);
    }

    public void method425(int j) {
        buffer[currentOffset++] = (byte) (128 - j);
    }

    public int method426() {
        return buffer[currentOffset++] - 128 & 0xff;
    }

    public int method427() {
        return -buffer[currentOffset++] & 0xff;
    }

    public int method428() {
        return 128 - buffer[currentOffset++] & 0xff;
    }

    public byte method429() {
        return (byte) (-buffer[currentOffset++]);
    }

    public byte method430() {
        return (byte) (128 - buffer[currentOffset++]);
    }

    public void method431(int i) {
        buffer[currentOffset++] = (byte) i;
        buffer[currentOffset++] = (byte) (i >> 8);
    }

    public void method432(int j) {
        buffer[currentOffset++] = (byte) (j >> 8);
        buffer[currentOffset++] = (byte) (j + 128);
    }

    public void method433(int j) {
        buffer[currentOffset++] = (byte) (j + 128);
        buffer[currentOffset++] = (byte) (j >> 8);
    }

    public int method434() {
        currentOffset += 2;
        return ((buffer[currentOffset - 1] & 0xff) << 8) + (buffer[currentOffset - 2] & 0xff);
    }

    public int method435() {
        currentOffset += 2;
        return ((buffer[currentOffset - 2] & 0xff) << 8) + (buffer[currentOffset - 1] - 128 & 0xff);
    }

    public int method436() {
        currentOffset += 2;
        return ((buffer[currentOffset - 1] & 0xff) << 8) + (buffer[currentOffset - 2] - 128 & 0xff);
    }

    public int method437() {
        currentOffset += 2;
        int j = ((buffer[currentOffset - 1] & 0xff) << 8) + (buffer[currentOffset - 2] & 0xff);
        if (j > 32767)
            j -= 0x10000;
        return j;
    }

    public int method438() {
        currentOffset += 2;
        int j = ((buffer[currentOffset - 1] & 0xff) << 8) + (buffer[currentOffset - 2] - 128 & 0xff);
        if (j > 32767)
            j -= 0x10000;
        return j;
    }

    public int method439() {
        currentOffset += 4;
        return ((buffer[currentOffset - 2] & 0xff) << 24) + ((buffer[currentOffset - 1] & 0xff) << 16) + ((buffer[currentOffset - 4] & 0xff) << 8) + (buffer[currentOffset - 3] & 0xff);
    }

    public int method440() {
        currentOffset += 4;
        return ((buffer[currentOffset - 3] & 0xff) << 24) + ((buffer[currentOffset - 4] & 0xff) << 16) + ((buffer[currentOffset - 1] & 0xff) << 8) + (buffer[currentOffset - 2] & 0xff);
    }

    public void method441(int i, byte abyte0[], int j) {
        for (int k = (i + j) - 1; k >= i; k--)
            buffer[currentOffset++] = (byte) (abyte0[k] + 128);

    }

    public void method442(int i, int j, byte abyte0[]) {
        for (int k = (j + i) - 1; k >= j; k--)
            abyte0[k] = buffer[currentOffset++];

    }

    public void writeRSString(String class100) {
        currentOffset += method1611(currentOffset, class100.length(), 0, buffer, class100);
        buffer[currentOffset++] = (byte) 0;
    }

    public static int method1611(int i, int i_99_, int i_100_, byte[] is, String s) {
        method465(s.getBytes(), i_100_, is, i, i_99_ + -i_100_);
        return -i_100_ + i_99_;
    }

    public static void method465(byte[] is, int i, byte[] is_3_, int i_4_,
            int i_5_) {
        if (is == is_3_) {
            if (i == i_4_) {
                return;
            }
            if (i_4_ > i && i_4_ < i + i_5_) {
                i_5_--;
                i += i_5_;
                i_4_ += i_5_;
                i_5_ = i - i_5_;
                i_5_ += 7;
                while (i >= i_5_) {
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                    is_3_[i_4_--] = is[i--];
                }
                i_5_ -= 7;
                while (i >= i_5_) {
                    is_3_[i_4_--] = is[i--];
                }
                return;
            }
        }
        i_5_ += i;
        i_5_ -= 7;
        while (i < i_5_) {
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
            is_3_[i_4_++] = is[i++];
        }
        i_5_ += 7;
        while (i < i_5_) {
            is_3_[i_4_++] = is[i++];
        }
    }

    public byte buffer[];
    public int currentOffset;
    public int bitPosition;
    private static final int[] anIntArray1409 = {
            0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
            1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
            0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
            0x3fffffff, 0x7fffffff, -1
    };
 //   public ISAACRandomGen encryption;
    private static int anInt1412;

    //removed useless static initializer
}
