/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class116 {
    public static int anInt1959;
    public boolean aBoolean1960;
    public short aShort1961 = -1;
    public byte[] aByteArray1962;
    public byte aByte1963 = 0;
    public int anInt1964;
    public int anInt1965;
    public boolean aBoolean1966;
    public int[] anIntArray1967;
    public boolean aBoolean1968;
    public Class113 aClass113_1969;
    public static int anInt1970;
    public boolean aBoolean1971;
    public int anInt1972;
    public int anInt1973;
    public static int anInt1974;
    public int anInt1975;
    public int anInt1976;
    public int anInt1977;
    public boolean aBoolean1978;
    public int anInt1979;
    public int anInt1980;
    public short[] aShortArray1981;
    public int anInt1982;
    public int anInt1983;
    public static int anInt1984;
    public short[] aShortArray1985;
    public int anInt1986;
    public int anInt1987;
    public int anInt1988;
    public int anInt1989;
    public int anInt1990;
    public static int anInt1991;
    public static RSString[] aRSStringArray1992;
    public static int anInt1993;
    public int[] anIntArray1994;
    public int[] anIntArray1995;
    public static int[] anIntArray1996;
    public boolean aBoolean1997;
    public int anInt1998;
    public int anInt1999;
    public int anInt2000;
    public static int anInt2001;
    public int anInt2002;
    public int anInt2003;
    public boolean aBoolean2004;
    public boolean aBoolean2005;
    public RSString[] aRSStringArray2006;
    public static int anInt2007 = 0;
    public boolean aBoolean2008;
    public static int anInt2009;
    public int[] anIntArray2010;
    public static int anInt2011 = 0;
    public static int anInt2012;
    public int anInt2013;
    public static int anInt2014;
    public static int anInt2015;
    public static int[][] anIntArrayArray2016 = new int[104][104];
    public boolean aBoolean2017;
    public boolean aBoolean2018;
    public static Class68_Sub20_Sub10 aClass68_Sub20_Sub10_2019;
    public static int anInt2020;
    public RSString aRSString_2021;
    public int anInt2022;
    public short[] aShortArray2023;
    public static int anInt2024;
    public int anInt2025;
    public short[] aShortArray2026;
    public boolean aBoolean2027;
    public static int anInt2028;
    public static int anInt2029;
    public boolean aBoolean2030;
    public int anInt2031;

    public Class44 method1702(int i, Class92_Sub1 class92_sub1, boolean bool,
                              byte i_0_, boolean bool_1_, int i_2_, int i_3_,
                              int[][] is, int i_4_, int[][] is_5_, int i_6_) {
        try {
            anInt2020++;
            long l;
            if (anIntArray2010 == null)
                l = (long) ((anInt2031 << 1483642730) + i_3_);
            else
                l = (long) ((anInt2031 << -2129513334) + (i << 1803278083)
                        + i_3_);
            int i_7_ = 82 % ((58 - i_0_) / 62);
            boolean bool_8_;
            if (!bool_1_ || !aBoolean1966)
                bool_8_ = false;
            else {
                bool_8_ = true;
                l |= ~0x7fffffffffffffffL;
            }
            Animable class1
                    = ((Animable)
                    Class68_Sub13_Sub20.aClass98_3765.method1570(14366, l));
            if (class1 == null) {
                Class1_Sub4 class1_sub4 = method1715(i_3_, 0, i);
                if (class1_sub4 == null) {
                    Class68_Sub13_Sub5.aClass44_3515.aClass1_746 = null;
                    return Class68_Sub13_Sub5.aClass44_3515;
                }
                class1_sub4.method132();
                if (i == 10 && i_3_ > 3)
                    class1_sub4.method107(256);
                if (bool_8_) {
                    class1_sub4.aShort2468 = (short) (64 + anInt2013);
                    class1 = class1_sub4;
                    class1_sub4.aShort2474 = (short) (768 + 5 * anInt1979);
                    class1_sub4.method120();
                } else
                    class1 = new Class1_Sub3_Sub1(class1_sub4, anInt2013 + 64,
                            anInt1979 * 5 + 768, -50,
                            -10, -50);
                Class68_Sub13_Sub20.aClass98_3765.method1568(class1, 97, l);
            }
            if (bool_8_)
                class1 = ((Class1_Sub4) class1).method109();
            if ((aByte1963 ^ 0xffffffff) != -1) {
                if (!(class1 instanceof Class1_Sub3_Sub1)) {
                    if (class1 instanceof Class1_Sub4)
                        class1
                                = ((Class1_Sub4) class1).method111(aByte1963,
                                aShort1961, is,
                                is_5_, i_6_,
                                i_2_, i_4_,
                                true, false);
                } else
                    class1 = ((Class1_Sub3_Sub1) class1).method100(aByte1963,
                            aShort1961,
                            is, is_5_,
                            i_6_, i_2_,
                            i_4_, true);
            }
            Class68_Sub13_Sub5.aClass44_3515.aClass1_746 = class1;
            return Class68_Sub13_Sub5.aClass44_3515;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ub.G(" + i + ','
                            + (class92_sub1 != null ? "{...}"
                            : "null")
                            + ',' + bool + ',' + i_0_ + ','
                            + bool_1_ + ',' + i_2_ + ',' + i_3_
                            + ',' + (is != null ? "{...}" : "null")
                            + ',' + i_4_ + ','
                            + (is_5_ != null ? "{...}" : "null")
                            + ',' + i_6_ + ')'));
        }
    }

    public int method1703(byte i, int i_9_, int i_10_) {
        anInt2001++;
        if (aClass113_1969 == null)
            return i_9_;
        Class68_Sub10 class68_sub10
                = (Class68_Sub10) aClass113_1969.method1678((long) i_10_, 79);
        if (i > -85)
            aBoolean1960 = false;
        if (class68_sub10 == null)
            return i_9_;
        return class68_sub10.anInt2902;
    }

    public boolean method1704(int i, int i_11_) {
        int i_12_ = 100 % ((i - 49) / 62);
        anInt2028++;
        if (anIntArray2010 == null) {
            if (anIntArray1967 == null)
                return true;
            if ((i_11_ ^ 0xffffffff) != -11)
                return true;
            boolean bool = true;
            for (int i_13_ = 0;
                 (i_13_ ^ 0xffffffff) > (anIntArray1967.length ^ 0xffffffff);
                 i_13_++)
                bool &= (Class68_Sub20_Sub3.aClass21_4192.method344
                        (0xffff & anIntArray1967[i_13_], 0, (byte) -95));
            return bool;
        }
        for (int i_14_ = 0;
             (anIntArray2010.length ^ 0xffffffff) < (i_14_ ^ 0xffffffff);
             i_14_++) {
            if (i_11_ == anIntArray2010[i_14_])
                return (Class68_Sub20_Sub3.aClass21_4192.method344
                        (0xffff & anIntArray1967[i_14_], 0, (byte) -116));
        }
        return true;
    }

    public RSString method1705(int i, RSString class100, int i_15_) {
        anInt2029++;
        if (i != 256)
            aBoolean2005 = false;
        if (aClass113_1969 == null)
            return class100;
        Class68_Sub5 class68_sub5
                = ((Class68_Sub5)
                aClass113_1969.method1678((long) i_15_, i ^ ~0x12c));
        if (class68_sub5 == null)
            return class100;
        return class68_sub5.aRSString_2830;
    }

    public void method1706(int i) {
        anInt1974++;
        if ((anInt1983 ^ 0xffffffff) == 0) {
            anInt1983 = 0;
            if (anIntArray1967 != null
                    && (anIntArray2010 == null || anIntArray2010[0] == 10))
                anInt1983 = 1;
            for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -6; i_16_++) {
                if (aRSStringArray2006[i_16_] != null) {
                    anInt1983 = 1;
                    break;
                }
            }
        }
        if ((anInt1972 ^ 0xffffffff) == 0)
            anInt1972 = anInt2022 != 0 ? 1 : 0;
        if (i != -129)
            anInt1988 = -45;
    }

    public boolean method1707(byte i) {
        anInt1991++;
        if (anIntArray1994 == null) {
            if (anInt1982 == -1 && anIntArray1995 == null)
                return false;
            return true;
        }
        if (i != -6)
            return true;
        for (int i_17_ = 0;
             (i_17_ ^ 0xffffffff) > (anIntArray1994.length ^ 0xffffffff);
             i_17_++) {
            if ((anIntArray1994[i_17_] ^ 0xffffffff) != 0) {
                Class116 class116_18_
                        = Class1_Sub5.method140(96, anIntArray1994[i_17_]);
                if (class116_18_.anInt1982 != -1
                        || class116_18_.anIntArray1995 != null)
                    return true;
            }
        }
        return false;
    }

    public static int method1708(int i, byte i_19_, int i_20_) {
        if ((i ^ 0xffffffff) < (i_20_ ^ 0xffffffff)) {
            int i_21_ = i_20_;
            i_20_ = i;
            i = i_21_;
        }
        int i_22_ = 12 % ((-35 - i_19_) / 38);
        anInt2012++;
        int i_23_;
        for (/**/; (i ^ 0xffffffff) != -1; i = i_23_) {
            i_23_ = i_20_ % i;
            i_20_ = i;
        }
        return i_20_;
    }

    public void method1709(int i, Stream class68_sub14, int i_24_) {
        if (i_24_ == 1) {
            int i_25_ = class68_sub14.readUnsignedByte(-6677);
            if ((i_25_ ^ 0xffffffff) < -1) {
                if (anIntArray1967 != null
                        && !Class68_Sub13_Sub16.aBoolean3709)
                    class68_sub14.currentOffset += 3 * i_25_;
                else {
                    anIntArray2010 = new int[i_25_];
                    anIntArray1967 = new int[i_25_];
                    for (int i_26_ = 0;
                         (i_25_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff);
                         i_26_++) {
                        anIntArray1967[i_26_]
                                = class68_sub14.readUnsignedWord(1355769544);
                        anIntArray2010[i_26_] = class68_sub14.readUnsignedByte(-6677);
                    }
                }
            }
        } else if ((i_24_ ^ 0xffffffff) == -3)
            aRSString_2021 = class68_sub14.readString(i ^ ~0x7eedcb0a);
        else if ((i_24_ ^ 0xffffffff) != -6) {
            if (i_24_ != 14) {
                if ((i_24_ ^ 0xffffffff) == -16)
                    anInt1987 = class68_sub14.readUnsignedByte(-6677);
                else if ((i_24_ ^ 0xffffffff) != -18) {
                    if (i_24_ == 18)
                        aBoolean2030 = false;
                    else if (i_24_ == 19)
                        anInt1983 = class68_sub14.readUnsignedByte(i + 2129506657);
                    else if (i_24_ != 21) {
                        if ((i_24_ ^ 0xffffffff) != -23) {
                            if ((i_24_ ^ 0xffffffff) != -24) {
                                if ((i_24_ ^ 0xffffffff) != -25) {
                                    if ((i_24_ ^ 0xffffffff) != -28) {
                                        if (i_24_ != 28) {
                                            if ((i_24_ ^ 0xffffffff) != -30) {
                                                if (i_24_ != 39) {
                                                    if (i_24_ >= 30
                                                            && i_24_ < 35) {
                                                        aRSStringArray2006
                                                                [-30 + i_24_]
                                                                = (class68_sub14
                                                                .readString
                                                                        (127));
                                                        if (aRSStringArray2006
                                                                [-30 + i_24_]
                                                                .method1600
                                                                        (false,
                                                                                (Class13_Sub2
                                                                                        .aRSString_2647)))
                                                            aRSStringArray2006
                                                                    [i_24_ - 30]
                                                                    = null;
                                                    } else if ((i_24_
                                                            ^ 0xffffffff)
                                                            != -41) {
                                                        if ((i_24_
                                                                ^ 0xffffffff)
                                                                != -42) {
                                                            if ((i_24_
                                                                    ^ 0xffffffff)
                                                                    != -43) {
                                                                if ((i_24_
                                                                        ^ 0xffffffff)
                                                                        != -61) {
                                                                    if (i_24_
                                                                            != 62) {
                                                                        if (i_24_
                                                                                == 64)
                                                                            aBoolean2027 = false;
                                                                        else if ((i_24_ ^ 0xffffffff) == -66)
                                                                            anInt1977 = class68_sub14.readUnsignedWord(1355769544);
                                                                        else if ((i_24_ ^ 0xffffffff) != -67) {
                                                                            if ((i_24_ ^ 0xffffffff) == -68)
                                                                                anInt2003 = class68_sub14.readUnsignedWord(1355769544);
                                                                            else if (i_24_ == 68)
                                                                                anInt1973 = class68_sub14.readUnsignedWord(i ^ ~0x2e22adbd);
                                                                            else if ((i_24_ ^ 0xffffffff) != -70) {
                                                                                if (i_24_ != 70) {
                                                                                    if (i_24_ != 71) {
                                                                                        if ((i_24_ ^ 0xffffffff) == -73)
                                                                                            anInt1986 = class68_sub14.method957(i + 2129490845);
                                                                                        else if (i_24_ != 73) {
                                                                                            if ((i_24_ ^ 0xffffffff) != -75) {
                                                                                                if ((i_24_ ^ 0xffffffff) != -76) {
                                                                                                    if ((i_24_ ^ 0xffffffff) == -78 || (i_24_ ^ 0xffffffff) == -93) {
                                                                                                        anInt1976 = class68_sub14.readUnsignedWord(1355769544);
                                                                                                        if ((anInt1976 ^ 0xffffffff) == -65536)
                                                                                                            anInt1976 = -1;
                                                                                                        int i_27_ = -1;
                                                                                                        anInt1998 = class68_sub14.readUnsignedWord(1355769544);
                                                                                                        if (anInt1998 == 65535)
                                                                                                            anInt1998 = -1;
                                                                                                        if ((i_24_ ^ 0xffffffff) == -93) {
                                                                                                            i_27_ = class68_sub14.readUnsignedWord(1355769544);
                                                                                                            if (i_27_ == 65535)
                                                                                                                i_27_ = -1;
                                                                                                        }
                                                                                                        int i_28_ = class68_sub14.readUnsignedByte(-6677);
                                                                                                        anIntArray1994 = new int[i_28_ - -2];
                                                                                                        for (int i_29_ = 0; i_28_ >= i_29_; i_29_++) {
                                                                                                            anIntArray1994[i_29_] = class68_sub14.readUnsignedWord(1355769544);
                                                                                                            if ((anIntArray1994[i_29_] ^ 0xffffffff) == -65536)
                                                                                                                anIntArray1994[i_29_] = -1;
                                                                                                        }
                                                                                                        anIntArray1994[1 + i_28_] = i_27_;
                                                                                                    } else if (i_24_ != 78) {
                                                                                                        if (i_24_ == 79) {
                                                                                                            anInt1964 = class68_sub14.readUnsignedWord(1355769544);
                                                                                                            anInt2000 = class68_sub14.readUnsignedWord(i + -809684418);
                                                                                                            anInt1975 = class68_sub14.readUnsignedByte(-6677);
                                                                                                            int i_30_ = class68_sub14.readUnsignedByte(-6677);
                                                                                                            anIntArray1995 = new int[i_30_];
                                                                                                            for (int i_31_ = 0; i_30_ > i_31_; i_31_++)
                                                                                                                anIntArray1995[i_31_] = class68_sub14.readUnsignedWord(1355769544);
                                                                                                        } else if (i_24_ != 81) {
                                                                                                            if ((i_24_ ^ 0xffffffff) != -83) {
                                                                                                                if ((i_24_ ^ 0xffffffff) == -89)
                                                                                                                    aBoolean2018 = false;
                                                                                                                else if (i_24_ != 89) {
                                                                                                                    if ((i_24_ ^ 0xffffffff) != -91) {
                                                                                                                        if (i_24_ != 91) {
                                                                                                                            if ((i_24_ ^ 0xffffffff) == -94) {
                                                                                                                                aByte1963 = (byte) 3;
                                                                                                                                aShort1961 = (short) class68_sub14.readUnsignedWord(1355769544);
                                                                                                                            } else if (i_24_ != 94) {
                                                                                                                                if ((i_24_ ^ 0xffffffff) == -96)
                                                                                                                                    aByte1963 = (byte) 5;
                                                                                                                                else if (i_24_ != 96) {
                                                                                                                                    if (i_24_ == 97)
                                                                                                                                        aBoolean2017 = true;
                                                                                                                                    else if ((i_24_ ^ 0xffffffff) == -250) {
                                                                                                                                        int i_32_ = class68_sub14.readUnsignedByte(i + 2129506657);
                                                                                                                                        if (aClass113_1969 == null) {
                                                                                                                                            int i_33_ = Class90.method1517(i_32_, i ^ 0x7eed99b1);
                                                                                                                                            aClass113_1969 = new Class113(i_33_);
                                                                                                                                        }
                                                                                                                                        for (int i_34_ = 0; i_32_ > i_34_; i_34_++) {
                                                                                                                                            boolean bool = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
                                                                                                                                            int i_35_ = class68_sub14.method921((byte) -70);
                                                                                                                                            Class68 class68;
                                                                                                                                            if (bool)
                                                                                                                                                class68 = new Class68_Sub5(class68_sub14.readString(i + 2129513461));
                                                                                                                                            else
                                                                                                                                                class68 = new Class68_Sub10(class68_sub14.readDWord());
                                                                                                                                            aClass113_1969.method1677((byte) 11, class68, (long) i_35_);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else
                                                                                                                                    aBoolean2005 = true;
                                                                                                                            } else
                                                                                                                                aByte1963 = (byte) 4;
                                                                                                                        } else
                                                                                                                            aBoolean1978 = true;
                                                                                                                    } else
                                                                                                                        aBoolean1960 = true;
                                                                                                                } else
                                                                                                                    aBoolean1997 = false;
                                                                                                            }
                                                                                                        } else {
                                                                                                            aByte1963 = (byte) 2;
                                                                                                            aShort1961 = (short) (256 * class68_sub14.readUnsignedByte(i + 2129506657));
                                                                                                        }
                                                                                                    } else {
                                                                                                        anInt1982 = class68_sub14.readUnsignedWord(1355769544);
                                                                                                        anInt1975 = class68_sub14.readUnsignedByte(-6677);
                                                                                                    }
                                                                                                } else
                                                                                                    anInt1972 = class68_sub14.readUnsignedByte(-6677);
                                                                                            } else
                                                                                                aBoolean1968 = true;
                                                                                        } else
                                                                                            aBoolean2004 = true;
                                                                                    } else
                                                                                        anInt1989 = class68_sub14.method957(i + 2129490845);
                                                                                } else
                                                                                    anInt1965 = class68_sub14.method957(i + 2129490845);
                                                                            } else
                                                                                anInt1990 = class68_sub14.readUnsignedByte(-6677);
                                                                        } else
                                                                            anInt1999 = class68_sub14.readUnsignedWord(1355769544);
                                                                    } else
                                                                        aBoolean1971
                                                                                = true;
                                                                } else
                                                                    anInt1980
                                                                            = (class68_sub14.readUnsignedWord
                                                                            (1355769544));
                                                            } else {
                                                                int i_36_
                                                                        = (class68_sub14
                                                                        .readUnsignedByte
                                                                                (i
                                                                                        ^ 0x7eedd161));
                                                                aByteArray1962
                                                                        = (new byte
                                                                        [i_36_]);
                                                                for (int i_37_
                                                                             = 0;
                                                                     (i_36_
                                                                             > i_37_);
                                                                     i_37_++)
                                                                    aByteArray1962
                                                                            [i_37_]
                                                                            = (class68_sub14.method955
                                                                            (3390));
                                                            }
                                                        } else {
                                                            int i_38_
                                                                    = (class68_sub14
                                                                    .readUnsignedByte
                                                                            (i
                                                                                    + 2129506657));
                                                            aShortArray1985
                                                                    = (new short
                                                                    [i_38_]);
                                                            aShortArray2023
                                                                    = (new short
                                                                    [i_38_]);
                                                            for (int i_39_ = 0;
                                                                 ((i_39_
                                                                         ^ 0xffffffff)
                                                                         > (i_38_
                                                                         ^ 0xffffffff));
                                                                 i_39_++) {
                                                                aShortArray2023
                                                                        [i_39_]
                                                                        = (short) class68_sub14.readUnsignedWord(1355769544);
                                                                aShortArray1985
                                                                        [i_39_]
                                                                        = (short) class68_sub14.readUnsignedWord(1355769544);
                                                            }
                                                        }
                                                    } else {
                                                        int i_40_
                                                                = (class68_sub14
                                                                .readUnsignedByte
                                                                        (-6677));
                                                        aShortArray1981
                                                                = new short[i_40_];
                                                        aShortArray2026
                                                                = new short[i_40_];
                                                        for (int i_41_ = 0;
                                                             i_40_ > i_41_;
                                                             i_41_++) {
                                                            aShortArray2026
                                                                    [i_41_]
                                                                    = (short) (class68_sub14.readUnsignedWord
                                                                    (1355769544));
                                                            aShortArray1981
                                                                    [i_41_]
                                                                    = (short) (class68_sub14.readUnsignedWord
                                                                    (1355769544));
                                                        }
                                                    }
                                                } else
                                                    anInt1979
                                                            = 5 * (class68_sub14
                                                            .method955
                                                                    (i
                                                                            + 2129516724));
                                            } else
                                                anInt2013
                                                        = class68_sub14
                                                        .method955(3390);
                                        } else
                                            anInt2025
                                                    = (class68_sub14.readUnsignedByte
                                                    (i + 2129506657));
                                    } else
                                        anInt2022 = 1;
                                } else {
                                    anInt2002
                                            = class68_sub14.readUnsignedWord(1355769544);
                                    if ((anInt2002 ^ 0xffffffff) == -65536)
                                        anInt2002 = -1;
                                }
                            } else
                                aBoolean2008 = true;
                        } else
                            aBoolean1966 = true;
                    } else
                        aByte1963 = (byte) 1;
                } else {
                    anInt2022 = 0;
                    aBoolean2030 = false;
                }
            } else
                anInt1988 = class68_sub14.readUnsignedByte(i ^ 0x7eedd161);
        } else {
            int i_42_ = class68_sub14.readUnsignedByte(-6677);
            if ((i_42_ ^ 0xffffffff) < -1) {
                if (anIntArray1967 != null
                        && !Class68_Sub13_Sub16.aBoolean3709)
                    class68_sub14.currentOffset += 2 * i_42_;
                else {
                    anIntArray1967 = new int[i_42_];
                    anIntArray2010 = null;
                    for (int i_43_ = 0; i_42_ > i_43_; i_43_++)
                        anIntArray1967[i_43_]
                                = class68_sub14.readUnsignedWord(1355769544);
                }
            }
        }
        anInt2015++;
        if (i != -2129513334)
            aClass113_1969 = null;
    }

    public Class116 method1710(int i) {
        anInt2024++;
        int i_44_ = -1;
        if (anInt1976 != i)
            i_44_ = Class18.method300(anInt1976, false);
        else if (anInt1998 != -1)
            i_44_ = Class103.anIntArray1767[anInt1998];
        if ((i_44_ ^ 0xffffffff) > -1 || i_44_ >= anIntArray1994.length + -1
                || (anIntArray1994[i_44_] ^ 0xffffffff) == 0) {
            int i_45_ = anIntArray1994[anIntArray1994.length - 1];
            if (i_45_ == -1)
                return null;
            return Class1_Sub5.method140(87, i_45_);
        }
        return Class1_Sub5.method140(126, anIntArray1994[i_44_]);
    }

    public void method1711(byte i, Stream class68_sub14) {
        for (; ; ) {
            int i_46_ = class68_sub14.readUnsignedByte(-6677);
            if ((i_46_ ^ 0xffffffff) == -1)
                break;
            method1709(-2129513334, class68_sub14, i_46_);
        }
        if (i != 29)
            method1706(62);
        anInt2009++;
    }

    public boolean method1712(int i) {
        anInt2014++;
        if (i < 88)
            method1708(123, (byte) 83, -84);
        if (anIntArray1967 == null)
            return true;
        boolean bool = true;
        for (int i_47_ = 0; anIntArray1967.length > i_47_; i_47_++)
            bool &= (Class68_Sub20_Sub3.aClass21_4192.method344
                    (0xffff & anIntArray1967[i_47_], 0, (byte) -113));
        return bool;
    }

    public static void method1713(int i) {
        aRSStringArray1992 = null;
        anIntArrayArray2016 = null;
        if (i == 0) {
            anIntArray1996 = null;
            aClass68_Sub20_Sub10_2019 = null;
        }
    }

    public Class44 method1714(Class92_Sub1 class92_sub1, Class55 class117,
                              boolean bool, int i, int i_48_, int i_49_,
                              int i_50_, int[][] is, int[][] is_51_, int i_52_,
                              int i_53_, int i_54_) {
        try {
            anInt1970++;
            long l;
            if (anIntArray2010 == null)
                l = (long) ((anInt2031 << 2069897482) - -i_50_);
            else
                l = (long) ((anInt2031 << 1166367274) - -(i_54_ << -586457341)
                        + i_50_);
            Class1_Sub3_Sub1 class1_sub3_sub1
                    = ((Class1_Sub3_Sub1)
                    Class68_Sub13_Sub37.aClass98_4064.method1570(14366, l));
            if (class1_sub3_sub1 == null) {
                Class1_Sub4 class1_sub4 = method1715(i_50_, 0, i_54_);
                if (class1_sub4 == null)
                    return null;
                class1_sub3_sub1
                        = new Class1_Sub3_Sub1(class1_sub4, anInt2013 + 64,
                        5 * anInt1979 + 768, -50, -10, -50);
                Class68_Sub13_Sub37.aClass98_4064
                        .method1568(class1_sub3_sub1, i_52_ ^ 0xff99, l);
            }
            if (i_52_ != 65535)
                return null;
            boolean bool_55_ = false;
            if (class117 != null) {
                class1_sub3_sub1
                        = (Class1_Sub3_Sub1) class117.method1728(i_49_,
                        class1_sub3_sub1,
                        i_50_, -11436);
                bool_55_ = true;
            }
            if ((i_54_ ^ 0xffffffff) == -11 && (i_50_ ^ 0xffffffff) < -4) {
                if (!bool_55_) {
                    bool_55_ = true;
                    class1_sub3_sub1
                            = (Class1_Sub3_Sub1) class1_sub3_sub1.method82(true,
                            true);
                }
                class1_sub3_sub1.method90(256);
            }
            if ((aByte1963 ^ 0xffffffff) != -1) {
                if (!bool_55_) {
                    bool_55_ = true;
                    class1_sub3_sub1
                            = (Class1_Sub3_Sub1) class1_sub3_sub1.method82(true,
                            true);
                }
                class1_sub3_sub1
                        = class1_sub3_sub1.method100(aByte1963, aShort1961, is_51_,
                        is, i, i_48_, i_53_, false);
            }
            Class68_Sub13_Sub5.aClass44_3515.aClass1_746 = class1_sub3_sub1;
            return Class68_Sub13_Sub5.aClass44_3515;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ub.D("
                            + (class92_sub1 != null ? "{...}"
                            : "null")
                            + ','
                            + (class117 != null ? "{...}" : "null")
                            + ',' + bool + ',' + i + ',' + i_48_
                            + ',' + i_49_ + ',' + i_50_ + ','
                            + (is != null ? "{...}" : "null") + ','
                            + (is_51_ != null ? "{...}" : "null")
                            + ',' + i_52_ + ',' + i_53_ + ','
                            + i_54_ + ')'));
        }
    }

    public Class1_Sub4 method1715(int i, int i_56_, int i_57_) {
        boolean bool = aBoolean1971;
        anInt1984++;
        Class1_Sub4 class1_sub4 = null;
        if (i_57_ == 2 && (i ^ 0xffffffff) < -4)
            bool = !bool;
        if (anIntArray2010 != null) {
            int i_58_ = -1;
            for (int i_59_ = 0; i_59_ < anIntArray2010.length; i_59_++) {
                if (anIntArray2010[i_59_] == i_57_) {
                    i_58_ = i_59_;
                    break;
                }
            }
            if (i_58_ == -1)
                return null;
            int i_60_ = anIntArray1967[i_58_];
            if (bool)
                i_60_ += 65536;
            class1_sub4
                    = (Class1_Sub4) Class52.aClass98_1000.method1570(14366,
                    (long) i_60_);
            if (class1_sub4 == null) {
                class1_sub4
                        = Class1_Sub4.method115(Class68_Sub20_Sub3.aClass21_4192,
                        i_60_ & 0xffff, 0);
                if (class1_sub4 == null)
                    return null;
                if (bool)
                    class1_sub4.method114();
                Class52.aClass98_1000.method1568(class1_sub4, 107,
                        (long) i_60_);
            }
        } else {
            if ((i_57_ ^ 0xffffffff) != -11)
                return null;
            if (anIntArray1967 == null)
                return null;
            int i_61_ = anIntArray1967.length;
            for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > (i_61_ ^ 0xffffffff);
                 i_62_++) {
                int i_63_ = anIntArray1967[i_62_];
                if (bool)
                    i_63_ += 65536;
                class1_sub4
                        = ((Class1_Sub4)
                        Class52.aClass98_1000.method1570(14366, (long) i_63_));
                if (class1_sub4 == null) {
                    class1_sub4 = Class1_Sub4.method115((Class68_Sub20_Sub3
                            .aClass21_4192),
                            i_63_ & 0xffff, 0);
                    if (class1_sub4 == null)
                        return null;
                    if (bool)
                        class1_sub4.method114();
                    Class52.aClass98_1000.method1568(class1_sub4, 103,
                            (long) i_63_);
                }
                if (i_61_ > 1)
                    PacketStream.aClass1_Sub4Array4117[i_62_]
                            = class1_sub4;
            }
            if ((i_61_ ^ 0xffffffff) < -2)
                class1_sub4
                        = new Class1_Sub4(PacketStream.aClass1_Sub4Array4117,
                        i_61_);
        }
        boolean bool_64_;
        if ((anInt1965 ^ 0xffffffff) != -1 || (anInt1989 ^ 0xffffffff) != -1
                || anInt1986 != 0)
            bool_64_ = true;
        else
            bool_64_ = false;
        boolean bool_65_;
        if ((anInt1977 ^ 0xffffffff) == -129
                && (anInt1999 ^ 0xffffffff) == -129 && anInt2003 == 128)
            bool_65_ = false;
        else
            bool_65_ = true;
        Class1_Sub4 class1_sub4_66_
                = new Class1_Sub4(class1_sub4,
                i == i_56_ && !bool_65_ && !bool_64_,
                aShortArray2026 == null, aShortArray2023 == null,
                true);
        if ((i_57_ ^ 0xffffffff) == -5 && i > 3) {
            class1_sub4_66_.method107(256);
            class1_sub4_66_.method128(45, 0, -45);
        }
        i &= 0x3;
        if (i != 1) {
            if (i != 2) {
                if ((i ^ 0xffffffff) == -4)
                    class1_sub4_66_.method133();
            } else
                class1_sub4_66_.method123();
        } else
            class1_sub4_66_.method130();
        if (aShortArray2026 != null) {
            for (int i_67_ = 0; i_67_ < aShortArray2026.length; i_67_++) {
                if (aByteArray1962 != null && i_67_ < aByteArray1962.length)
                    class1_sub4_66_.method129(aShortArray2026[i_67_],
                            (Class33.aShortArray579
                                    [(aByteArray1962[i_67_]
                                    & 0xff)]));
                else
                    class1_sub4_66_.method129(aShortArray2026[i_67_],
                            aShortArray1981[i_67_]);
            }
        }
        if (aShortArray2023 != null) {
            for (int i_68_ = 0; i_68_ < aShortArray2023.length; i_68_++)
                class1_sub4_66_.method110(aShortArray2023[i_68_],
                        aShortArray1985[i_68_]);
        }
        if (bool_65_)
            class1_sub4_66_.method135(anInt1977, anInt1999, anInt2003);
        if (bool_64_)
            class1_sub4_66_.method128(anInt1965, anInt1989, anInt1986);
        return class1_sub4_66_;
    }

    public Class116() {
        aBoolean1960 = false;
        anInt1977 = 128;
        anInt1979 = 0;
        anInt1980 = -1;
        aBoolean1968 = false;
        anInt1965 = 0;
        anInt1972 = -1;
        aBoolean1971 = false;
        anInt1986 = 0;
        anInt1999 = 128;
        anInt1989 = 0;
        anInt1976 = -1;
        anInt2000 = 0;
        anInt1982 = -1;
        aBoolean1997 = true;
        aBoolean2004 = false;
        anInt2013 = 0;
        anInt1988 = 1;
        aBoolean2008 = false;
        anInt1975 = 0;
        anInt1964 = 0;
        aBoolean1966 = false;
        anInt1998 = -1;
        anInt1987 = 1;
        anInt1973 = -1;
        aBoolean1978 = false;
        anInt1983 = -1;
        aRSStringArray2006 = new RSString[5];
        anInt2002 = -1;
        aRSString_2021 = Class68_Sub20_Sub10.aRSString_4317;
        aBoolean2005 = false;
        anInt2003 = 128;
        anInt2022 = 2;
        aBoolean2017 = false;
        aBoolean2018 = true;
        anInt2025 = 16;
        aBoolean2027 = true;
        anInt1990 = 0;
        aBoolean2030 = true;
    }
}
