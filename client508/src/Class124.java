/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public class Class124 {
    public static int[][] anIntArrayArray2131;
    public static int anInt2132;
    public static int anInt2133;
    public static int anInt2134;
    public static int anInt2135;
    public static RSString aRSString_2136;
    public static int anInt2137;
    public static int anInt2138;
    public static int anInt2139;
    public long aLong2140;
    public static RSString aRSString_2141
            = RSString.newRsString("sl_flags");
    public int anInt2142 = 0;
    public static RSString aRSString_2143;
    public static int anInt2144;
    public long aLong2145;
    public static RSString aRSString_2146;
    public long aLong2147 = -1L;
    public static RSString aRSString_2148;
    public static RSString aRSString_2149
            = RSString.newRsString("Please wait)3)3)3");
    public byte[] aByteArray2150;
    public static int anInt2151;
    public long aLong2152;
    public long aLong2153 = -1L;
    public static RSString aRSString_2154;
    public static int anInt2155;
    public byte[] aByteArray2156;
    public static int anInt2157;
    public static int anInt2158;
    public static boolean aBoolean2159;
    public Class2 aClass2_2160;
    public long aLong2161;
    public int anInt2162;
    public static RSString aRSString_2163;
    public static int anInt2164;

    public static Sprite method1751(byte i) {
        anInt2144++;
        int i_0_ = (Class68_Sub13_Sub19.anIntArray3757[0]
                * Class68_Sub13_Sub12.anIntArray3639[0]);
        int[] is = new int[i_0_];
        byte[] is_1_ = Class69.aByteArrayArray1240[0];
        int i_2_ = 0;
        if (i != -83)
            return null;
        for (/**/; (i_2_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_2_++)
            is[i_2_] = (Class68_Sub13_Sub17.anIntArray3719
                    [Class120.method1740(255, is_1_[i_2_])]);
        Sprite sprite
                = (new Sprite
                (Class97.anInt1703, Class68_Sub20_Sub15.anInt4405,
                        Class4.anIntArray96[0], Class116.anIntArray1996[0],
                        Class68_Sub13_Sub12.anIntArray3639[0],
                        Class68_Sub13_Sub19.anIntArray3757[0], is));
        Class87.method1487((byte) -93);
        return sprite;
    }

    public static void method1752(Class21renamed class21, Class21renamed class21_3_,
                                  Class21renamed class21_4_, boolean bool,
                                  Class21renamed class21_5_) {
        try {
            Class1_Sub7.aClass21_2618 = class21;
            Class8.aClass21_164 = class21_5_;
            client.aClass21_2380 = class21_4_;
            if (bool == true) {
                anInt2158++;
                Class68_Sub10.aClass21_2907 = class21_3_;
                Class68_Sub13_Sub36.aClass45ArrayArray4040
                        = new Class45[client.aClass21_2380.method337(0)][];
                GameSocket.aBooleanArray1142
                        = new boolean[client.aClass21_2380.method337(0)];
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652
                    (runtimeexception,
                            ("wa.J(" + (class21 != null ? "{...}" : "null") + ','
                                    + (class21_3_ != null ? "{...}" : "null") + ','
                                    + (class21_4_ != null ? "{...}" : "null") + ',' + bool
                                    + ',' + (class21_5_ != null ? "{...}" : "null")
                                    + ')'));
        }
    }

    public void method1753(int i, byte[] is) throws IOException {
        anInt2137++;
        method1761(0, is.length, 0, is);
        if (i > -33)
            method1752(null, null, null, true, null);
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
                    Class39.method465(is, i_7_, aByteArray2150,
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
                        aClass2_2160.method174(false, aLong2145);
                        aLong2152 = aLong2145;
                    }
                    aClass2_2160.method176(i_7_, is, 18405, i);
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
                        Class39.method465(is,
                                (int) (l_9_ + (long) i_7_
                                        + -aLong2145),
                                aByteArray2156,
                                (int) (-aLong2147 + l_9_), i_10_);
                    }
                    aLong2145 += (long) i;
                } else if ((i ^ 0xffffffff) < -1) {
                    if (aLong2153 == -1L)
                        aLong2153 = aLong2145;
                    Class39.method465(is, i_7_, aByteArray2150,
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

    public static void method1756(boolean bool) {
        aRSString_2143 = null;
        aRSString_2148 = null;
        if (bool != true)
            aRSString_2143 = null;
        aRSString_2154 = null;
        aRSString_2146 = null;
        anIntArrayArray2131 = null;
        aRSString_2149 = null;
        aRSString_2136 = null;
        aRSString_2163 = null;
        aRSString_2141 = null;
    }

    public File method1757(boolean bool) {
        anInt2135++;
        if (bool != true)
            aLong2153 = 14L;
        return aClass2_2160.method173(0);
    }

    public void method1758(int i) throws IOException {
        anInt2132++;
        int i_11_ = -72 % ((i - -42) / 59);
        if ((aLong2153 ^ 0xffffffffffffffffL) != 0L) {
            if ((aLong2153 ^ 0xffffffffffffffffL)
                    != (aLong2152 ^ 0xffffffffffffffffL)) {
                aClass2_2160.method174(false, aLong2153);
                aLong2152 = aLong2153;
            }
            long l = -1L;
            aClass2_2160.method176(0, aByteArray2150, 18405, anInt2142);
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
                Class39.method465(aByteArray2150, (int) (l + -aLong2153),
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
            aClass2_2160.method175(i + 1572);
        }
    }

    public void method1760(long l, int i) throws IOException {
        do {
            try {
                anInt2134++;
                if (l < 0L)
                    throw new IOException("Invalid seek to " + l + " in file "
                            + method1757(true));
                aLong2145 = l;
                if (i == 1)
                    break;
                aLong2140 = -83L;
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        "wa.K(" + l + ',' + i + ')');
            }
            break;
        } while (false);
    }

    public void method1761(int i, int i_14_, int i_15_, byte[] is)
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
                Class39.method465(aByteArray2150,
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
                Class39.method465(aByteArray2156,
                        (int) (-aLong2147 + aLong2145), is, i,
                        i_18_);
                aLong2145 += (long) i_18_;
                i += i_18_;
            }
            if ((aByteArray2156.length ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
                aClass2_2160.method174(false, aLong2145);
                aLong2152 = aLong2145;
                while ((i_14_ ^ 0xffffffff) < -1) {
                    int i_19_ = aClass2_2160.method177(i_14_, 0, i, is);
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
                Class39.method465(aByteArray2156, 0, is, i, i_20_);
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
                    Class39.method465(aByteArray2150,
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
                aClass2_2160.method174(false, aLong2145);
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
                i = aClass2_2160.method177(i_25_, 0, anInt2162,
                        aByteArray2156);
                if ((i ^ 0xffffffff) == 0)
                    break;
                aLong2152 += (long) i;
            }
        }
    }

    public Class124(Class2 class2, int i, int i_26_) throws IOException {
        aClass2_2160 = class2;
        aLong2140 = aLong2161 = class2.method172(-1);
        aByteArray2156 = new byte[i];
        aByteArray2150 = new byte[i_26_];
        aLong2145 = 0L;
    }

    static {
        anIntArrayArray2131
                = new int[][]{new int[16],
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1,
                        1}};
        aRSString_2146 = RSString.newRsString("glow2:");
        aRSString_2143 = aRSString_2146;
        aRSString_2154 = RSString.newRsString("(U0a )2 in: ");
        aBoolean2159 = false;
        aRSString_2148 = RSString.newRsString("gelb:");
        aRSString_2136 = aRSString_2149;
        aRSString_2163 = aRSString_2146;
        anInt2164 = 0;
    }
}
