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

/**
 * Class:RandomAccessFile
 * User: Silabsoft 
 * Date: Jul 9, 2009
 * Time: 12:49:51 AM
 */
package org.moparscape.cacheutils.v508;

import java.io.IOException;
import java.io.File;
import java.io.EOFException;

public class RandomAccessFile
{
    public static int[][] anIntArrayArray2131;
    public static int anInt2132;
    public static int anInt2133;
    public static int anInt2134;
    public static int anInt2135;
       public FileOnDisk aFileOnDisk_2160;
    public static int anInt2137;
    public static int anInt2138;
    public static int anInt2139;
    public long aLong2140;

    public int anInt2142 = 0;

    public static int anInt2144;
    public long aLong2145;

    public long aLong2147 = -1L;

    public byte[] aByteArray2150;
    public static int anInt2151;
    public long aLong2152;
    public long aLong2153 = -1L;

    public static int anInt2155;
    public byte[] aByteArray2156;
    public static int anInt2157;
    public static int anInt2158;
    public static boolean aBoolean2159;

    public long aLong2161;
    public int anInt2162;
    public static int anInt2164;



    public void method1753(byte[] is) throws IOException {
	anInt2137++;
	readFully(0, is.length, 0, is);
    }

    public long method1754(byte i) {
	anInt2155++;
	if (i <= 48)
	    aLong2140 = 100L;
	return aLong2140;
    }

    public void method1755(int i, int i_6_, int i_7_, byte[] is)
	throws IOException {
	anInt2151++;
	try {
	    if (i_6_ == 0) {
		if (aLong2140 < aLong2145 - -(long) i)
		    aLong2140 = aLong2145 - -(long) i;
		if ((aLong2153 ^ 0xffffffffffffffffL) != 0L
		    && (((aLong2145 ^ 0xffffffffffffffffL)
			 > (aLong2153 ^ 0xffffffffffffffffL))
			|| aLong2153 - -(long) anInt2142 < aLong2145))
		    method1758(i_6_ + 86);
		if (aLong2153 != -1L
		    && (((long) aByteArray2150.length + aLong2153
			 ^ 0xffffffffffffffffL)
			> (aLong2145 + (long) i ^ 0xffffffffffffffffL))) {
		    int i_8_ = (int) ((long) aByteArray2150.length - aLong2145
				      + aLong2153);
		    i -= i_8_;
		    Misc.method465(is, i_7_, aByteArray2150,
				      (int) (aLong2145 - aLong2153), i_8_);
		    aLong2145 += (long) i_8_;
		    anInt2142 = aByteArray2150.length;
		    method1758(40);
		    i_7_ += i_8_;
		}
		if (i > aByteArray2150.length) {
		    long l = -1L;
		    long l_9_ = -1L;
		    if ((aLong2145 ^ 0xffffffffffffffffL)
			!= (aLong2152 ^ 0xffffffffffffffffL)) {
			aFileOnDisk_2160.method174(false, aLong2145);
			aLong2152 = aLong2145;
		    }
		    aFileOnDisk_2160.method176(i_7_, is, 18405, i);
		    if (((aLong2145 - -(long) i ^ 0xffffffffffffffffL)
			 < (aLong2147 ^ 0xffffffffffffffffL))
			&& (aLong2145 - -(long) i
			    <= aLong2147 + (long) anInt2162))
			l = (long) i + aLong2145;
		    else if (((aLong2147 + (long) anInt2162
			       ^ 0xffffffffffffffffL)
			      < (aLong2145 ^ 0xffffffffffffffffL))
			     && (((long) i + aLong2145 ^ 0xffffffffffffffffL)
				 <= ((long) anInt2162 + aLong2147
				     ^ 0xffffffffffffffffL)))
			l = (long) anInt2162 + aLong2147;
		    aLong2152 += (long) i;
		    if (((aLong2145 ^ 0xffffffffffffffffL)
			 > (aLong2147 ^ 0xffffffffffffffffL))
			|| ((aLong2145 ^ 0xffffffffffffffffL)
			    <= (aLong2147 - -(long) anInt2162
				^ 0xffffffffffffffffL))) {
			if (((aLong2145 ^ 0xffffffffffffffffL)
			     >= (aLong2147 ^ 0xffffffffffffffffL))
			    && aLong2147 < aLong2145 - -(long) i)
			    l_9_ = aLong2147;
		    } else
			l_9_ = aLong2145;
		    if (aLong2152 > aLong2161)
			aLong2161 = aLong2152;
		    if (l_9_ > -1L && ((l ^ 0xffffffffffffffffL)
				       < (l_9_ ^ 0xffffffffffffffffL))) {
			int i_10_ = (int) (l - l_9_);
			Misc.method465(is,
					  (int) (l_9_ + (long) i_7_
						 + -aLong2145),
					  aByteArray2156,
					  (int) (-aLong2147 + l_9_), i_10_);
		    }
		    aLong2145 += (long) i;
		} else if ((i ^ 0xffffffff) < -1) {
		    if (aLong2153 == -1L)
			aLong2153 = aLong2145;
		    Misc.method465(is, i_7_, aByteArray2150,
				      (int) (aLong2145 - aLong2153), i);
		    aLong2145 += (long) i;
		    if ((-aLong2153 + aLong2145 ^ 0xffffffffffffffffL)
			< ((long) anInt2142 ^ 0xffffffffffffffffL))
			anInt2142 = (int) (-aLong2153 + aLong2145);
		}
	    }
	} catch (IOException ioexception) {
	    aLong2152 = -1L;
	    throw ioexception;
	}
    }



    public File method1757(boolean bool) {
	anInt2135++;
	if (bool != true)
	    aLong2153 = 14L;
	return aFileOnDisk_2160.method173(0);
    }

    public void method1758(int i) throws IOException {
	anInt2132++;
	int i_11_ = -72 % ((i - -42) / 59);
	if ((aLong2153 ^ 0xffffffffffffffffL) != 0L) {
	    if ((aLong2153 ^ 0xffffffffffffffffL)
		!= (aLong2152 ^ 0xffffffffffffffffL)) {
		aFileOnDisk_2160.method174(false, aLong2153);
		aLong2152 = aLong2153;
	    }
	    long l = -1L;
	    aFileOnDisk_2160.method176(0, aByteArray2150, 18405, anInt2142);
	    aLong2152 += (long) anInt2142;
	    if ((aLong2147 ^ 0xffffffffffffffffL) >= (aLong2153
						      ^ 0xffffffffffffffffL)
		&& aLong2153 < (long) anInt2162 + aLong2147)
		l = aLong2153;
	    else if (aLong2153 <= aLong2147
		     && ((aLong2153 - -(long) anInt2142 ^ 0xffffffffffffffffL)
			 < (aLong2147 ^ 0xffffffffffffffffL)))
		l = aLong2147;
	    long l_12_ = -1L;
	    if ((long) anInt2142 + aLong2153 > aLong2147
		&& (aLong2153 + (long) anInt2142
		    <= (long) anInt2162 + aLong2147))
		l_12_ = aLong2153 + (long) anInt2142;
	    else if ((((long) anInt2162 + aLong2147 ^ 0xffffffffffffffffL)
		      < (aLong2153 ^ 0xffffffffffffffffL))
		     && ((aLong2147 - -(long) anInt2162 ^ 0xffffffffffffffffL)
			 >= ((long) anInt2142 + aLong2153
			     ^ 0xffffffffffffffffL)))
		l_12_ = (long) anInt2162 + aLong2147;
	    if ((aLong2152 ^ 0xffffffffffffffffL)
		< (aLong2161 ^ 0xffffffffffffffffL))
		aLong2161 = aLong2152;
	    if (l > -1L
		&& (l ^ 0xffffffffffffffffL) > (l_12_ ^ 0xffffffffffffffffL)) {
		int i_13_ = (int) (-l + l_12_);
		Misc.method465(aByteArray2150, (int) (l + -aLong2153),
				  aByteArray2156, (int) (l - aLong2147),
				  i_13_);
	    }
	    aLong2153 = -1L;
	    anInt2142 = 0;
	}
    }

    public void method1759(int i) throws IOException {
	method1758(-121);
	if (i == -9715) {
	    anInt2157++;
	    aFileOnDisk_2160.method175(i + 1572);
	}
    }

    public void seek(long l) throws IOException {
	    try {
		anInt2134++;
		if (l < 0L)
		    throw new IOException("Invalid seek to " + l + " in file "
					  + method1757(true));
		aLong2145 = l;
	    } catch (RuntimeException runtimeexception) {

              System.out.println("Error in seek");
	    }
    }

    public void readFully(int i, int i_14_, int i_15_, byte[] is)
	throws IOException {
	anInt2133++;
	try {
	    if (i_14_ + i > is.length)
		throw new ArrayIndexOutOfBoundsException(i_14_ + i
							 + -is.length);
	    if ((aLong2153 ^ 0xffffffffffffffffL) != 0L
		&& (aLong2145 ^ 0xffffffffffffffffL) <= (aLong2153
							 ^ 0xffffffffffffffffL)
		&& ((aLong2145 + (long) i_14_ ^ 0xffffffffffffffffL)
		    >= (aLong2153 - -(long) anInt2142
			^ 0xffffffffffffffffL))) {
		Misc.method465(aByteArray2150,
				  (int) (-aLong2153 + aLong2145), is, i,
				  i_14_);
		aLong2145 += (long) i_14_;
		return;
	    }
	    long l = aLong2145;
	    int i_16_ = i_14_;
	    int i_17_ = i;
	    if ((aLong2145 ^ 0xffffffffffffffffL) <= (aLong2147
						      ^ 0xffffffffffffffffL)
		&& aLong2145 < (long) anInt2162 + aLong2147) {
		int i_18_
		    = (int) ((long) anInt2162 - (aLong2145 + -aLong2147));
		if (i_14_ < i_18_)
		    i_18_ = i_14_;
		i_14_ -= i_18_;
		Misc.method465(aByteArray2156,
				  (int) (-aLong2147 + aLong2145), is, i,
				  i_18_);
		aLong2145 += (long) i_18_;
		i += i_18_;
	    }
	    if ((aByteArray2156.length ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
		aFileOnDisk_2160.method174(false, aLong2145);
		aLong2152 = aLong2145;
		while ((i_14_ ^ 0xffffffff) < -1) {
		    int i_19_ = aFileOnDisk_2160.method177(i_14_, 0, i, is);
		    if ((i_19_ ^ 0xffffffff) == 0)
			break;
		    i += i_19_;
		    i_14_ -= i_19_;
		    aLong2145 += (long) i_19_;
		    aLong2152 += (long) i_19_;
		}
	    } else if ((i_14_ ^ 0xffffffff) < -1) {
		method1762(false);
		int i_20_ = i_14_;
		if ((i_20_ ^ 0xffffffff) < (anInt2162 ^ 0xffffffff))
		    i_20_ = anInt2162;
		Misc.method465(aByteArray2156, 0, is, i, i_20_);
		aLong2145 += (long) i_20_;
		i_14_ -= i_20_;
		i += i_20_;
	    }
	    if ((aLong2153 ^ 0xffffffffffffffffL) != 0L) {
		if (aLong2153 > aLong2145 && (i_14_ ^ 0xffffffff) < -1) {
		    int i_21_ = i + (int) (-aLong2145 + aLong2153);
		    if ((i_21_ ^ 0xffffffff) < (i - -i_14_ ^ 0xffffffff))
			i_21_ = i - -i_14_;
		    while (i < i_21_) {
			is[i++] = (byte) 0;
			aLong2145++;
			i_14_--;
		    }
		}
		long l_22_ = -1L;
		if (aLong2153 >= l
		    && ((l - -(long) i_16_ ^ 0xffffffffffffffffL)
			< (aLong2153 ^ 0xffffffffffffffffL)))
		    l_22_ = aLong2153;
		else if (((aLong2153 ^ 0xffffffffffffffffL)
			  >= (l ^ 0xffffffffffffffffL))
			 && l < (long) anInt2142 + aLong2153)
		    l_22_ = l;
		long l_23_ = -1L;
		if ((l ^ 0xffffffffffffffffL) > ((long) anInt2142 + aLong2153
						 ^ 0xffffffffffffffffL)
		    && ((aLong2153 - -(long) anInt2142 ^ 0xffffffffffffffffL)
			>= ((long) i_16_ + l ^ 0xffffffffffffffffL)))
		    l_23_ = (long) anInt2142 + aLong2153;
		else if ((((long) i_16_ + l ^ 0xffffffffffffffffL)
			  < (aLong2153 ^ 0xffffffffffffffffL))
			 && aLong2153 - -(long) anInt2142 >= (long) i_16_ + l)
		    l_23_ = (long) i_16_ + l;
		if ((l_22_ ^ 0xffffffffffffffffL) < 0L
		    && ((l_22_ ^ 0xffffffffffffffffL)
			> (l_23_ ^ 0xffffffffffffffffL))) {
		    int i_24_ = (int) (-l_22_ + l_23_);
		    Misc.method465(aByteArray2150,
				      (int) (l_22_ - aLong2153), is,
				      i_17_ - -(int) (-l + l_22_), i_24_);
		    if ((l_23_ ^ 0xffffffffffffffffL)
			< (aLong2145 ^ 0xffffffffffffffffL)) {
			i_14_ -= l_23_ + -aLong2145;
			aLong2145 = l_23_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong2152 = -1L;
	    throw ioexception;
	}
	if (i_15_ < i_14_)
	    throw new EOFException();
    }

    public void method1762(boolean bool) throws IOException {
	anInt2138++;
	if (bool == false) {
	    anInt2162 = 0;
	    if ((aLong2145 ^ 0xffffffffffffffffL)
		!= (aLong2152 ^ 0xffffffffffffffffL)) {
		aFileOnDisk_2160.method174(false, aLong2145);
		aLong2152 = aLong2145;
	    }
	    aLong2147 = aLong2145;
	    int i;
	    for (/**/;
		 ((anInt2162 ^ 0xffffffff)
		  > (aByteArray2156.length ^ 0xffffffff));
		 anInt2162 += i) {
		int i_25_ = -anInt2162 + aByteArray2156.length;
		if (i_25_ > 200000000)
		    i_25_ = 200000000;
		i = aFileOnDisk_2160.method177(i_25_, 0, anInt2162,
					   aByteArray2156);
		if ((i ^ 0xffffffff) == 0)
		    break;
		aLong2152 += (long) i;
	    }
	}
    }

    public RandomAccessFile(FileOnDisk fileOnDisk, int i, int i_26_) throws IOException {
	aFileOnDisk_2160 = fileOnDisk;
	aLong2140 = aLong2161 = fileOnDisk.method172(-1);
	aByteArray2156 = new byte[i];
	aByteArray2150 = new byte[i_26_];
	aLong2145 = 0L;
    }


    static {
	anIntArrayArray2131
	    = new int[][] { new int[16],
			    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			    { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			    { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			    { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			    { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			    { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			    { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
			    { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			    { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
			    { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			    { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
			    { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1,
			      1 } };

	aBoolean2159 = false;

	anInt2164 = 0;
    }
}
