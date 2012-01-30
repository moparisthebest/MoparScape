/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.*;

public class PlayerDefinition {
    public static int[] anIntArray2180;
    public static int anInt2181;
    public int[] anIntArray2182;
    public int[] anIntArray2183;
    public static int anInt2184;
    public static boolean aBoolean2185 = false;
    public long aLong2186;
    public static int anInt2187;
    public static int anInt2188;
    public static int anInt2189;
    public static GameSocket connection;
    public static int anInt2191;
    public static Class21renamed aClass21_2192;
    public static int anInt2193;
    public static int anInt2194;
    public static int anInt2195;
    public boolean aBoolean2196;
    public static int anInt2197;
    public long aLong2198;
    public static int anInt2199;
    public static int anInt2200;
    public int anInt2201;

    public static RSString method1765(long l, int i) {
        try {
            anInt2195++;
            int i_0_ = -20 % ((-16 - i) / 36);
            return Class68_Sub29.method1322(10, l, 97, false);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "wf.A(" + l + ',' + i + ')');
        }
    }

    public Class1_Sub3 method1766(int i, Class55 class117, int i_1_, int i_2_,
                                  byte i_3_) {
        anInt2187++;
        long l = (long) i_1_ | ((long) i_1_ << 1725838304
                | (long) (i_2_ << -1329298704));
        if (i_3_ != -37)
            method1765(37L, 25);
        Class1_Sub3 class1_sub3
                = ((Class1_Sub3)
                Class75_Sub1_Sub1.aClass98_4577.method1570(i_3_ + 14403, l));
        if (class1_sub3 == null) {
            Class1_Sub4[] class1_sub4s = new Class1_Sub4[2];
            int i_4_ = 0;
            if (Class54.method552(i_1_, i_3_ + 40).method1673(i_3_ ^ 0x5c83)
                    && Class54.method552(i_2_, 3).method1673(i_3_ ^ 0x5c83)) {
                Class1_Sub4 class1_sub4
                        = Class54.method552(i_1_, i_3_ ^ ~0x27).method1672(-74);
                if (class1_sub4 != null)
                    class1_sub4s[i_4_++] = class1_sub4;
                class1_sub4 = Class54.method552(i_2_, 3).method1672(-123);
                if (class1_sub4 != null)
                    class1_sub4s[i_4_++] = class1_sub4;
                class1_sub4 = new Class1_Sub4(class1_sub4s, i_4_);
                for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -6; i_5_++) {
                    if (Class56.aShortArrayArray1065[i_5_].length
                            > anIntArray2182[i_5_])
                        class1_sub4.method129(Class120.aShortArray2098[i_5_],
                                (Class56.aShortArrayArray1065
                                        [i_5_][anIntArray2182[i_5_]]));
                    if ((anIntArray2182[i_5_] ^ 0xffffffff)
                            > (Class92.aShortArrayArray1650[i_5_].length
                            ^ 0xffffffff))
                        class1_sub4.method129((Class68_Sub13_Sub35
                                .aShortArray4023[i_5_]),
                                (Class92.aShortArrayArray1650
                                        [i_5_][anIntArray2182[i_5_]]));
                }
                class1_sub3 = class1_sub4.method127(64, 768, -50, -10, -50);
                Class75_Sub1_Sub1.aClass98_4577.method1568(class1_sub3, 99, l);
            } else
                return null;
        }
        if (class117 != null)
            class1_sub3 = class117.method1722((byte) -98, class1_sub3, i);
        return class1_sub3;
    }

    public void method1767(boolean bool, int i) {
        aBoolean2196 = bool;
        anInt2184++;
        int i_6_ = -19 / ((7 - i) / 45);
        method1775(-1);
    }

    public Class1_Sub3 method1768(int i, Class55 class117, int i_7_,
                                  Class55 class117_8_, byte i_9_) {
        try {
            anInt2189++;
            if ((anInt2201 ^ 0xffffffff) != 0)
                return (Class68_Sub13_Sub11.method753(anInt2201, 28).method1451
                        (i_7_, class117_8_, (byte) -119, class117, i));
            long l = aLong2186;
            int[] is = anIntArray2183;
            if (i_9_ <= 43)
                aClass21_2192 = null;
            if (class117 != null
                    && ((class117.anInt2047 ^ 0xffffffff) <= -1
                    || (class117.anInt2033 ^ 0xffffffff) <= -1)) {
                is = new int[12];
                for (int i_10_ = 0; i_10_ < 12; i_10_++)
                    is[i_10_] = anIntArray2183[i_10_];
                if (class117.anInt2047 >= 0) {
                    if ((class117.anInt2047 ^ 0xffffffff) != -65536) {
                        is[5] = Class70.method1335(1073741824,
                                class117.anInt2047);
                        l ^= (long) is[5] << 2032205984;
                    } else {
                        l ^= ~0xffffffffL;
                        is[5] = 0;
                    }
                }
                if ((class117.anInt2033 ^ 0xffffffff) <= -1) {
                    if ((class117.anInt2033 ^ 0xffffffff) == -65536) {
                        is[3] = 0;
                        l ^= 0xffffffffL;
                    } else {
                        is[3] = Class70.method1335(1073741824,
                                class117.anInt2033);
                        l ^= (long) is[3];
                    }
                }
            }
            Class1_Sub3 class1_sub3
                    = ((Class1_Sub3)
                    Class68_Sub13_Sub2.aClass98_3459.method1570(14366, l));
            if (class1_sub3 == null) {
                boolean bool = false;
                for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -13; i_11_++) {
                    int i_12_ = is[i_11_];
                    if ((0x40000000 & i_12_ ^ 0xffffffff) != -1) {
                        if (!Applet_Sub1.method18
                                (-25672, 0x3fffffff & i_12_)
                                .method308(aBoolean2196, -116))
                            bool = true;
                    } else if ((i_12_ & ~0x7fffffff) != 0
                            && !Class54.method552(i_12_ & 0x3fffffff, 3)
                            .method1674((byte) -118))
                        bool = true;
                }
                if (bool) {
                    if (aLong2198 != -1L)
                        class1_sub3
                                = (Class1_Sub3) Class68_Sub13_Sub2
                                .aClass98_3459
                                .method1570(14366, aLong2198);
                    if (class1_sub3 == null)
                        return null;
                }
                if (class1_sub3 == null) {
                    Class1_Sub4[] class1_sub4s = new Class1_Sub4[12];
                    int i_13_ = 0;
                    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -13; i_14_++) {
                        int i_15_ = is[i_14_];
                        if ((0x40000000 & i_15_) == 0) {
                            if ((i_15_ & ~0x7fffffff ^ 0xffffffff) != -1) {
                                Class1_Sub4 class1_sub4
                                        = Class54.method552
                                        (0x3fffffff & i_15_, 3)
                                        .method1669(false);
                                if (class1_sub4 != null)
                                    class1_sub4s[i_13_++] = class1_sub4;
                            }
                        } else {
                            Class1_Sub4 class1_sub4
                                    = Applet_Sub1.method18
                                    (-25672, 0x3fffffff & i_15_)
                                    .method319(aBoolean2196, (byte) 118);
                            if (class1_sub4 != null)
                                class1_sub4s[i_13_++] = class1_sub4;
                        }
                    }
                    int i_16_ = is[0];
                    if ((i_16_ & 0x40000000) != 0) {
                        ItemDef class19
                                = Applet_Sub1.method18(-25672, 0x3fffffff & i_16_);
                        if (class19.anIntArrayArray331 != null) {
                            for (int i_17_ = 0;
                                 ((class19.anIntArrayArray331.length
                                         ^ 0xffffffff)
                                         < (i_17_ ^ 0xffffffff));
                                 i_17_++) {
                                if (class19.anIntArrayArray331[i_17_] != null
                                        && class1_sub4s[i_17_ - -1] != null) {
                                    int i_18_
                                            = class19.anIntArrayArray331[i_17_][0];
                                    int i_19_
                                            = class19.anIntArrayArray331[i_17_][1];
                                    int i_20_
                                            = class19.anIntArrayArray331[i_17_][2];
                                    int i_21_
                                            = class19.anIntArrayArray331[i_17_][3];
                                    int i_22_
                                            = class19.anIntArrayArray331[i_17_][4];
                                    int i_23_
                                            = class19.anIntArrayArray331[i_17_][5];
                                    class1_sub4s[1 + i_17_]
                                            .method128(i_18_, i_19_, i_20_);
                                    class1_sub4s[i_17_ - -1]
                                            .method125(i_21_, i_22_, i_23_);
                                }
                            }
                        }
                    }
                    Class1_Sub4 class1_sub4
                            = new Class1_Sub4(class1_sub4s, i_13_);
                    for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -6; i_24_++) {
                        if (anIntArray2182[i_24_]
                                < Class56.aShortArrayArray1065[i_24_].length)
                            class1_sub4.method129((Class120.aShortArray2098
                                    [i_24_]),
                                    (Class56.aShortArrayArray1065
                                            [i_24_]
                                            [anIntArray2182[i_24_]]));
                        if (anIntArray2182[i_24_]
                                < Class92.aShortArrayArray1650[i_24_].length)
                            class1_sub4.method129((Class68_Sub13_Sub35
                                    .aShortArray4023[i_24_]),
                                    (Class92.aShortArrayArray1650
                                            [i_24_]
                                            [anIntArray2182[i_24_]]));
                    }
                    class1_sub3
                            = class1_sub4.method127(64, 850, -30, -50, -30);
                    Class68_Sub13_Sub2.aClass98_3459.method1568(class1_sub3,
                            102, l);
                    aLong2198 = l;
                }
            }
            if (class117 == null && class117_8_ == null)
                return class1_sub3;
            Class1_Sub3 class1_sub3_25_;
            if (class117 != null && class117_8_ != null)
                class1_sub3_25_ = class117.method1727(class1_sub3, class117_8_,
                        i_7_, (byte) -79, i);
            else if (class117 == null)
                class1_sub3_25_
                        = class117_8_.method1719(i_7_, true, class1_sub3);
            else
                class1_sub3_25_ = class117.method1719(i, true, class1_sub3);
            return class1_sub3_25_;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("wf.E(" + i + ','
                            + (class117 != null ? "{...}" : "null")
                            + ',' + i_7_ + ','
                            + (class117_8_ != null ? "{...}"
                            : "null")
                            + ',' + i_9_ + ')'));
        }
    }

    public void method1769(int i, int i_26_, int i_27_) {
        if (i_26_ == 41) {
            anIntArray2182[i] = i_27_;
            method1775(-1);
            anInt2181++;
        }
    }

    public static void method1770(int i) {
        connection = null;
        anIntArray2180 = null;
        if (i <= 56)
            aClass21_2192 = null;
        aClass21_2192 = null;
    }

    public Class1_Sub3 method1771(int i, Class55 class117, int i_28_) {
        if (i_28_ != -13)
            return null;
        anInt2194++;
        if ((anInt2201 ^ 0xffffffff) != 0)
            return Class68_Sub13_Sub11.method753(anInt2201, -111)
                    .method1450(class117, (byte) 12, i);
        Class1_Sub3 class1_sub3
                = ((Class1_Sub3)
                Class75_Sub1_Sub1.aClass98_4577.method1570(14366, aLong2186));
        if (class1_sub3 == null) {
            boolean bool = false;
            for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -13; i_29_++) {
                int i_30_ = anIntArray2183[i_29_];
                if ((0x40000000 & i_30_) == 0) {
                    if ((i_30_ & ~0x7fffffff) != 0
                            && !Class54.method552(0x3fffffff & i_30_, 3)
                            .method1673(i_28_ ^ 0x5cab))
                        bool = true;
                } else if (!Applet_Sub1.method18
                        (-25672, i_30_ & 0x3fffffff)
                        .method310(aBoolean2196, (byte) 75))
                    bool = true;
            }
            if (bool)
                return null;
            Class1_Sub4[] class1_sub4s = new Class1_Sub4[12];
            int i_31_ = 0;
            for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > -13; i_32_++) {
                int i_33_ = anIntArray2183[i_32_];
                if ((0x40000000 & i_33_) != 0) {
                    Class1_Sub4 class1_sub4
                            = Applet_Sub1.method18(-25672, 0x3fffffff & i_33_)
                            .method316(-31779, aBoolean2196);
                    if (class1_sub4 != null)
                        class1_sub4s[i_31_++] = class1_sub4;
                } else if ((~0x7fffffff & i_33_) != 0) {
                    Class1_Sub4 class1_sub4
                            = Class54.method552
                            (0x3fffffff & i_33_, i_28_ ^ ~0xf)
                            .method1672(-50);
                    if (class1_sub4 != null)
                        class1_sub4s[i_31_++] = class1_sub4;
                }
            }
            Class1_Sub4 class1_sub4 = new Class1_Sub4(class1_sub4s, i_31_);
            for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > -6; i_34_++) {
                if (anIntArray2182[i_34_]
                        < Class56.aShortArrayArray1065[i_34_].length)
                    class1_sub4.method129(Class120.aShortArray2098[i_34_],
                            (Class56.aShortArrayArray1065[i_34_]
                                    [anIntArray2182[i_34_]]));
                if (anIntArray2182[i_34_]
                        < Class92.aShortArrayArray1650[i_34_].length)
                    class1_sub4.method129((Class68_Sub13_Sub35.aShortArray4023
                            [i_34_]),
                            (Class92.aShortArrayArray1650[i_34_]
                                    [anIntArray2182[i_34_]]));
            }
            class1_sub3 = class1_sub4.method127(64, 768, -50, -10, -50);
            Class75_Sub1_Sub1.aClass98_4577.method1568(class1_sub3, 127,
                    aLong2186);
        }
        if (class117 != null)
            class1_sub3 = class117.method1722((byte) -64, class1_sub3, i);
        return class1_sub3;
    }

    public void method1772(int i, int i_35_, int i_36_) {
        anInt2199++;
        int i_37_ = Class48.anIntArray960[i];
        if (i_36_ != -27345)
            method1774(false);
        if ((anIntArray2183[i_37_] ^ 0xffffffff) != -1
                && Class54.method552(i_35_, 3) != null) {
            anIntArray2183[i_37_] = Class70.method1335(i_35_, -2147483648);
            method1775(-1);
        }
    }

    public void method1773(int[] is, int[] is_38_, boolean bool, byte i,
                           int i_39_) {
        do {
            try {
                if (is_38_ == null) {
                    is_38_ = new int[12];
                    for (int i_40_ = 0; i_40_ < 7; i_40_++) {
                        for (int i_41_ = 0;
                             ((i_41_ ^ 0xffffffff)
                                     > (Class119.anInt2088 ^ 0xffffffff));
                             i_41_++) {
                            Class112 class112 = Class54.method552(i_41_, 3);
                            if (class112 != null && !class112.aBoolean1878
                                    && ((class112.anInt1895 ^ 0xffffffff)
                                    == ((!bool ? 0 : 7) + i_40_
                                    ^ 0xffffffff))) {
                                is_38_[Class48.anIntArray960[i_40_]]
                                        = Class70.method1335(-2147483648, i_41_);
                                break;
                            }
                        }
                    }
                }
                anInt2201 = i_39_;
                anInt2197++;
                anIntArray2182 = is;
                aBoolean2196 = bool;
                anIntArray2183 = is_38_;
                method1775(-1);
                if (i < -125)
                    break;
                method1766(121, null, -17, 99, (byte) -74);
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("wf.K("
                                + (is != null ? "{...}" : "null")
                                + ','
                                + (is_38_ != null ? "{...}"
                                : "null")
                                + ',' + bool + ',' + i + ',' + i_39_
                                + ')'));
            }
            break;
        } while (false);
    }

    public int method1774(boolean bool) {
        if (bool != true)
            method1767(false, -75);
        anInt2200++;
        if (anInt2201 != -1)
            return (Class68_Sub13_Sub11.method753(anInt2201, -97).anInt1458
                    + 305419896);
        return (anIntArray2183[1]
                + ((anIntArray2183[11] << 954016229)
                + (anIntArray2183[0] << 907413679))
                + (anIntArray2182[4] << 363057108)
                + ((anIntArray2182[0] << 1973786873)
                - -(anIntArray2183[8] << 1034909194)));
    }

    public void method1775(int i) {
        anInt2188++;
        long l = aLong2186;
        long[] ls = Class118.aLongArray2076;
        aLong2186 = -1L;
        if (i != -1)
            method1765(-7L, 114);
        for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > -13; i_42_++) {
            aLong2186 = (aLong2186 >>> -1286536056
                    ^ ls[(int) (0xffL & (aLong2186
                    ^ (long) (anIntArray2183[i_42_]
                    >> 1998943416)))]);
            aLong2186 = (aLong2186 >>> 1024523528
                    ^ ls[(int) ((aLong2186 ^ (long) (anIntArray2183[i_42_]
                    >> 1308934576))
                    & 0xffL)]);
            aLong2186
                    = (aLong2186 >>> 369068232
                    ^ ls[(int) (((long) (anIntArray2183[i_42_] >> 1550174440)
                    ^ aLong2186)
                    & 0xffL)]);
            aLong2186 = ls[(int) (((long) anIntArray2183[i_42_] ^ aLong2186)
                    & 0xffL)] ^ aLong2186 >>> -672521208;
        }
        for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > -6; i_43_++)
            aLong2186 = (ls[(int) (0xffL & (aLong2186
                    ^ (long) anIntArray2182[i_43_]))]
                    ^ aLong2186 >>> -23528504);
        aLong2186 = (aLong2186 >>> -1369850616
                ^ ls[(int) (((long) (!aBoolean2196 ? 0 : 1) ^ aLong2186)
                & 0xffL)]);
        if ((l ^ 0xffffffffffffffffL) != -1L
                && (aLong2186 ^ 0xffffffffffffffffL) != (l ^ 0xffffffffffffffffL))
            Class68_Sub13_Sub2.aClass98_3459.method1569((byte) 28, l);
    }

    public static String method1776(Throwable throwable, int i)
            throws IOException {
        anInt2193++;
        String string;
        if (!(throwable instanceof GameException))
            string = "";
        else {
            GameException runtimeexception_sub1
                    = (GameException) throwable;
            throwable = runtimeexception_sub1.aThrowable2247;
            string = runtimeexception_sub1.aString2239 + " | ";
        }
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        throwable.printStackTrace(printwriter);
        printwriter.close();
        String string_44_ = stringwriter.toString();
        BufferedReader bufferedreader
                = new BufferedReader(new StringReader(string_44_));
        String string_45_ = bufferedreader.readLine();
        for (; ; ) {
            String string_46_ = bufferedreader.readLine();
            if (string_46_ == null)
                break;
            int i_47_ = string_46_.indexOf('(');
            int i_48_ = string_46_.indexOf(')', i_47_ + 1);
            if (i_47_ >= 0 && (i_48_ ^ 0xffffffff) <= -1) {
                String string_49_ = string_46_.substring(i_47_ - -1, i_48_);
                int i_50_ = string_49_.indexOf(".java:");
                if ((i_50_ ^ 0xffffffff) <= -1) {
                    string_49_ = (string_49_.substring(0, i_50_)
                            + string_49_.substring(i_50_ + 5));
                    string += string_49_ + ' ';
                    continue;
                }
                string_46_ = string_46_.substring(0, i_47_);
            }
            string_46_ = string_46_.trim();
            string_46_
                    = string_46_.substring(string_46_.lastIndexOf(' ') - -1);
            string_46_
                    = string_46_.substring(string_46_.lastIndexOf('\t') + 1);
            string += string_46_ + ' ';
        }
        string += "| " + (String) string_45_;
        int i_51_ = -123 / ((9 - i) / 32);
        return string;
    }

    static {
        anIntArray2180 = new int[2];
    }
}
