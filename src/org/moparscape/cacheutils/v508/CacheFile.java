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
 * Class:CacheFile
 * User: Silabsoft 
 * Date: Jul 9, 2009
 * Time: 1:26:06 AM
 */
package org.moparscape.cacheutils.v508;

import java.awt.*;

    public class CacheFile
{

    public int anInt1612;
    public static int anInt1613;
    public RandomAccessFile index;
    public static byte aByte1615;
    public RandomAccessFile data = null;
    public int anInt1617 = 65000;

    public static int anInt1620;

    public static Image anImage1622;
    public static int anInt1623;
    public static int anInt1624;
    public static int anInt1625;
    public static int anInt1626;
    public static int anInt1627;
    public static int anInt1628;
    public static int anInt1629;



    public boolean write(int i, byte i_39_, int i_40_, byte[] is, boolean bool) {
	anInt1625++;
	synchronized (data) {
	    try {
		int i_41_;
		if (bool) {
		    if (index.method1754((byte) 90)< (long) (i_40_ * 6 + 6))
			return false;
		    index.seek((long) (6 * i_40_));
		    index.readFully(0, 6, 0,Misc.aByteArray2125);
		    i_41_	= ((Misc.aByteArray2125[5] & 0xff) + (((Misc.aByteArray2125[4] & 0xff) << 33133832) + (0xff0000	 & Misc.aByteArray2125[3] << 1465956592)));
		    if ((i_41_ ^ 0xffffffff) >= -1|| ((long) i_41_ > data.method1754((byte) 75) / 520L))
			return false;
		} else {
		    i_41_= (int) ((519L + data.method1754((byte) 51)) / 520L);
		    if (i_41_  == 0)
			i_41_ = 1;
		}
		Misc.aByteArray2125[1] = (byte) (i >> 1817621192);
		Misc.aByteArray2125[2] = (byte) i;
		Misc.aByteArray2125[5] = (byte) i_41_;
		Misc.aByteArray2125[0] = (byte) (i >> 1069068976);
		Misc.aByteArray2125[3] = (byte) (i_41_ >> -1629510896);
		Misc.aByteArray2125[4] = (byte) (i_41_ >> -551024760);
		index.seek((long) (6 * i_40_));
		index.method1755(6, 0, 0, Misc.aByteArray2125);
		int i_42_ = -90 % ((40 - i_39_) / 54);
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_;
		for (/**/; (i ^ 0xffffffff) < (i_43_ ^ 0xffffffff);
		     i_43_ += i_45_) {
		    int i_46_ = 0;
		    if (bool) {
			data.seek((long) (i_41_ * 520));
			try {
			    data.readFully(0, 8, 0,
						      Misc.aByteArray2125);
			} catch (java.io.EOFException eofexception) {
			    break;
			}
			i_45_ = (((Misc.aByteArray2125[0] & 0xff)
				  << -765727032)
				 - -(Misc.aByteArray2125[1] & 0xff));
			i_46_ = ((Misc.aByteArray2125[6] & 0xff)
				 + (Misc.aByteArray2125[4] << -2029121968
				    & 0xff0000)
				 - -(0xff00 & (Misc.aByteArray2125[5]
					       << -2088592632)));
			int i_47_ = Misc.aByteArray2125[7] & 0xff;
			int i_48_ = (((0xff & Misc.aByteArray2125[2])
				      << 202860296)
				     - -(Misc.aByteArray2125[3] & 0xff));
			if (i_45_ != i_40_ || i_48_ != i_44_
			    || anInt1612 != i_47_)
			    return false;
			if (i_46_ < 0
			    || (((long) i_46_ ^ 0xffffffffffffffffL)
				< (data.method1754((byte) 116) / 520L
				   ^ 0xffffffffffffffffL)))
			    return false;
		    }
		    if (i_46_ == 0) {
			bool = false;
			i_46_ = (int) ((519L
					+ data.method1754((byte) 82))
				       / 520L);
			if ((i_46_ ^ 0xffffffff) == -1)
			    i_46_++;
			if ((i_46_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff))
			    i_46_++;
		    }
		    Misc.aByteArray2125[0] = (byte) (i_40_ >> 527566472);
		    Misc.aByteArray2125[2] = (byte) (i_44_ >> 1676955592);
		    Misc.aByteArray2125[7] = (byte) anInt1612;
		    Misc.aByteArray2125[1] = (byte) i_40_;
		    if ((i - i_43_ ^ 0xffffffff) >= -513)
			i_46_ = 0;
		    Misc.aByteArray2125[6] = (byte) i_46_;
		    Misc.aByteArray2125[5] = (byte) (i_46_ >> -11962840);
		    Misc.aByteArray2125[3] = (byte) i_44_;
		    i_45_ = i + -i_43_;
		   Misc.aByteArray2125[4] = (byte) (i_46_ >> -1151944720);
		    i_44_++;
		    if (i_45_ > 512)
			i_45_ = 512;
		    data.seek((long) (i_41_ * 520));
		    data.method1755(8, 0, 0,
					     Misc.aByteArray2125);
		    i_41_ = i_46_;
		    data.method1755(i_45_, 0, i_43_, is);
		}
		return true;
	    } catch (java.io.IOException ioexception) {
            ioexception .printStackTrace();
        return false;
	    }
	}
    }





    public String toString() {
	anInt1628++;
	return "Cache:" + anInt1612;
    }



     public byte[] read(int i) {
	anInt1627++;
	synchronized (index) {
	    try {
		if (index.method1754((byte) 101) < (long) (6 + i * 6))
		    return null;
		index.seek((long) (i * 6));
		index.readFully(0, 6, 0, Misc.aByteArray2125);
		int i_88_
		    = ((Misc.aByteArray2125[1] << -503326744 & 0xff00)
		       + (((Misc.aByteArray2125[0] & 0xff) << -1643323344)
			  - -(0xff & Misc.aByteArray2125[2])));
		int i_89_
		    = ((Misc.aByteArray2125[5] & 0xff)
		       + (Misc.aByteArray2125[3] << -1717736080 & 0xff0000)
		       + ((Misc.aByteArray2125[4] & 0xff) << 1834419496));
		if ((i_88_ ^ 0xffffffff) > -1 || anInt1617 < i_88_)
		    return null;
		if (i_89_ <= 0
		    || ((data.method1754((byte) 104) / 520L
			 ^ 0xffffffffffffffffL)
			> ((long) i_89_ ^ 0xffffffffffffffffL)))
		    return null;
		byte[] is = new byte[i_88_];
		int i_90_ = 0;
		int i_91_ = 0;
		while (i_88_ > i_90_) {
		    if (i_89_ == 0)
			return null;
		    data.seek((long) (520 * i_89_));
		    int i_92_ = i_88_ + -i_90_;
		    if (i_92_ > 512)
			i_92_ = 512;
		    data.readFully(0, i_92_ + 8,0,Misc.aByteArray2125);
		    int i_93_
			= ((0xff & Misc.aByteArray2125[6])
			   + ((0xff0000
			       & Misc.aByteArray2125[4] << -600163600)
			      - -(0xff00 & (Misc.aByteArray2125[5]
					    << -554764568))));
		    int i_94_
			= (((Misc.aByteArray2125[0] & 0xff) << -974042584)
			   - -(0xff & Misc.aByteArray2125[1]));
		    int i_95_ = ((0xff & Misc.aByteArray2125[3])
				 + ((0xff & Misc.aByteArray2125[2])
				    << -1322389528));
		    int i_96_ = 0xff & Misc.aByteArray2125[7];
		    if (i_94_ != i || i_95_ != i_91_
			|| (anInt1612 ^ 0xffffffff) != (i_96_ ^ 0xffffffff))
			return null;
		    if (i_93_ < 0
			|| ((long) i_93_
			    > data.method1754((byte) 67) / 520L))
			return null;
		    i_89_ = i_93_;
		    for (int i_97_ = 0;
			 (i_92_ ^ 0xffffffff) < (i_97_ ^ 0xffffffff); i_97_++)
			is[i_90_++] = Misc.aByteArray2125[i_97_ - -8];
		    i_91_++;
		}
		return is;
	    } catch (java.io.IOException ioexception) {
		return null;
	    }
	}
    }

    public static byte[] method1508(byte[] is, boolean bool) {
	int i = is.length;
	anInt1613++;
	byte[] is_98_ = new byte[i];
	if (bool != false)
	    method1508(null, true);
	Misc.method465B(is, 0, is_98_, 0, i);
	return is_98_;
    }

    public CacheFile(int i, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile_99_,
		   int i_100_) {
	index = null;
	try {
	    anInt1612 = i;
	    anInt1617 = i_100_;
	    index = randomAccessFile_99_;
	    data = randomAccessFile;
	} catch (RuntimeException runtimeexception) {
	    runtimeexception.printStackTrace();
	}
    }

}

