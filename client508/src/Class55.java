/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class55 {
    public static int anInt2032;
    public int anInt2033;
    public int[][] anIntArrayArray2034;
    public int[] anIntArray2035;
    public static Class65 aClass65_2036;
    public int anInt2037;
    public static Class21_Sub1 aClass21_Sub1_2038;
    public int anInt2039;
    public static int anInt2040;
    public static int anInt2041;
    public static int[] anIntArray2042;
    public int anInt2043;
    public static int anInt2044;
    public static RSString aRSString_2045;
    public static int anInt2046;
    public int anInt2047 = -1;
    public int[] anIntArray2048;
    public static int anInt2049;
    public int[] anIntArray2050;
    public int anInt2051;
    public static RSString aRSString_2052;
    public static RSString aRSString_2053;
    public boolean aBoolean2054;
    public static int anInt2055 = 0;
    public boolean aBoolean2056;
    public static int anInt2057;
    public int[] anIntArray2058;
    public static RSString aRSString_2059;
    public static int anInt2060;
    public int anInt2061;
    public static int anInt2062;
    public static RSString aRSString_2063;
    public static RSString aRSString_2064;
    public static int anInt2065;
    public static int anInt2066;
    public static RSString[] aRSStringArray2067;
    public static int anInt2068;
    public static int anInt2069;
    public static RSString aRSString_2070;
    public static byte aByte2071;
    public int anInt2072;

    public Class1_Sub3 method1716(Class1_Sub3 class1_sub3, int i, int i_0_) {
        i_0_ = anIntArray2035[i_0_];
        anInt2065++;
        Class68_Sub20_Sub17 class68_sub20_sub17
                = Class35.method432(i_0_ >> -1413375280, (byte) -40);
        i_0_ &= 0xffff;
        if (class68_sub20_sub17 == null)
            return class1_sub3.method81(true, true);
        Class1_Sub3 class1_sub3_1_
                = class1_sub3.method81(!class68_sub20_sub17.method1180(true, i_0_),
                !aBoolean2056);
        if (i != 8493)
            anInt2033 = 85;
        class1_sub3_1_.method74(class68_sub20_sub17, i_0_, aBoolean2056);
        return class1_sub3_1_;
    }

    public static Class35 method1717(SignLink class55, byte i,
                                     Component component, int i_2_, int i_3_) {
        try {
            anInt2069++;
            if (Class93.anInt1660 == 0)
                throw new IllegalStateException();
            if ((i_3_ ^ 0xffffffff) > -1 || (i_3_ ^ 0xffffffff) <= -3)
                throw new IllegalArgumentException();
            if ((i_2_ ^ 0xffffffff) > -257)
                i_2_ = 256;
            try {
                //xxx Class35 class35 = (Class35) Class.forName("Class35_Sub2").newInstance();
                Class35 class35 = new Class35_Sub2();
                class35.anIntArray625
                        = new int[256 * (Class7.aBoolean132 ? 2 : 1)];
                class35.anInt632 = i_2_;
                class35.method433(component);
                class35.anInt636 = (i_2_ & ~0x3ff) + 1024;
                if ((class35.anInt636 ^ 0xffffffff) < -16385)
                    class35.anInt636 = 16384;
                class35.method423(class35.anInt636);
                if ((Class32.anInt560 ^ 0xffffffff) < -1
                        && Class44.aClass125_742 == null) {
                    Class44.aClass125_742 = new Class125();
                    Class44.aClass125_742.aSignLink_2166 = class55;
                    class55.method558((byte) -125, Class32.anInt560,
                            Class44.aClass125_742);
                }
                if (Class44.aClass125_742 != null) {
                    if (Class44.aClass125_742.aClass35Array2174[i_3_] != null)
                        throw new IllegalArgumentException();
                    Class44.aClass125_742.aClass35Array2174[i_3_] = class35;
                }
                return class35;
            } catch (Throwable throwable) {
                try {
                    Class35_Sub1 class35_sub1
                            = new Class35_Sub1(class55, i_3_);
                    if (i != 104)
                        return null;
                    class35_sub1.anInt632 = i_2_;
                    class35_sub1.anIntArray625
                            = new int[(Class7.aBoolean132 ? 2 : 1) * 256];
                    class35_sub1.method433(component);
                    class35_sub1.anInt636 = 16384;
                    class35_sub1.method423(class35_sub1.anInt636);
                    if ((Class32.anInt560 ^ 0xffffffff) < -1
                            && Class44.aClass125_742 == null) {
                        Class44.aClass125_742 = new Class125();
                        Class44.aClass125_742.aSignLink_2166 = class55;
                        class55.method558((byte) -117, Class32.anInt560,
                                Class44.aClass125_742);
                    }
                    if (Class44.aClass125_742 != null) {
                        if (Class44.aClass125_742.aClass35Array2174[i_3_]
                                != null)
                            throw new IllegalArgumentException();
                        Class44.aClass125_742.aClass35Array2174[i_3_]
                                = class35_sub1;
                    }
                    return class35_sub1;
                } catch (Throwable throwable_4_) {
                    return new Class35();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("uc.B("
                            + (class55 != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (component != null ? "{...}" : "null")
                            + ',' + i_2_ + ',' + i_3_ + ')'));
        }
    }

    public static void method1718(int i) {
        aRSString_2053 = null;
        aClass21_Sub1_2038 = null;
        aClass65_2036 = null;
        anIntArray2042 = null;
        aRSString_2059 = null;
        aRSString_2064 = null;
        if (i == 31891) {
            aRSString_2045 = null;
            aRSStringArray2067 = null;
            aRSString_2070 = null;
            aRSString_2052 = null;
            aRSString_2063 = null;
        }
    }

    public Class1_Sub3 method1719(int i, boolean bool,
                                  Class1_Sub3 class1_sub3) {
        anInt2062++;
        i = anIntArray2035[i];
        Class68_Sub20_Sub17 class68_sub20_sub17
                = Class35.method432(i >> 2136200336, (byte) -89);
        i &= 0xffff;
        if (class68_sub20_sub17 == null)
            return class1_sub3.method82(true, true);
        Class1_Sub3 class1_sub3_5_
                = class1_sub3.method82(!class68_sub20_sub17.method1180(bool, i),
                !aBoolean2056);
        class1_sub3_5_.method74(class68_sub20_sub17, i, aBoolean2056);
        return class1_sub3_5_;
    }

    public static void method1720
            (int i, int i_6_, Class1_Sub6_Sub2 class1_sub6_sub2, int i_7_) {
        if (i_6_ == 0) {
            anInt2044++;
            do {
                if ((i_7_ ^ 0xffffffff) != (class1_sub6_sub2.anInt2568
                        ^ 0xffffffff)
                        || i_7_ == -1) {
                    if (i_7_ == -1 || class1_sub6_sub2.anInt2568 == -1
                            || ((Class64.method624((byte) -36, i_7_).anInt2051
                            ^ 0xffffffff)
                            <= ((Class64.method624
                            ((byte) -36, class1_sub6_sub2.anInt2568)
                            .anInt2051)
                            ^ 0xffffffff))) {
                        class1_sub6_sub2.anInt2568 = i_7_;
                        class1_sub6_sub2.anInt2522 = 0;
                        class1_sub6_sub2.anInt2549 = 0;
                        class1_sub6_sub2.anInt2556 = 0;
                        class1_sub6_sub2.anInt2545 = i;
                        class1_sub6_sub2.anInt2557
                                = class1_sub6_sub2.anInt2579;
                        if (class1_sub6_sub2.anInt2568 == -1)
                            break;
                        Class44.method489(false, class1_sub6_sub2.anInt2522,
                                class1_sub6_sub2.anInt2561,
                                Class64.method624((byte) -36,
                                        (class1_sub6_sub2
                                                .anInt2568)),
                                (class1_sub6_sub2
                                        == (Class68_Sub7
                                        .aClass1_Sub6_Sub2_2860)),
                                class1_sub6_sub2.anInt2537);
                    }
                    break;
                }
                Class55 class117 = Class64.method624((byte) -36, i_7_);
                int i_8_ = class117.anInt2061;
                if (i_8_ == 1) {
                    class1_sub6_sub2.anInt2549 = 0;
                    class1_sub6_sub2.anInt2556 = 0;
                    class1_sub6_sub2.anInt2522 = 0;
                    class1_sub6_sub2.anInt2545 = i;
                    Class44.method489(false, class1_sub6_sub2.anInt2522,
                            class1_sub6_sub2.anInt2561, class117,
                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    == class1_sub6_sub2),
                            class1_sub6_sub2.anInt2537);
                }
                if (i_8_ == 2)
                    class1_sub6_sub2.anInt2549 = 0;
            } while (false);
        }
    }

    public static int method1721(int i, int i_9_) {
        anInt2049++;
        if (i != 1)
            anIntArray2042 = null;
        if ((i_9_ ^ 0xffffffff) <= -66 && i_9_ <= 90
                || (i_9_ >= 192 && (i_9_ ^ 0xffffffff) >= -223
                && (i_9_ ^ 0xffffffff) != -216))
            return i_9_ + 32;
        if (i_9_ == 159)
            return 255;
        if (i_9_ == 140)
            return 156;
        return i_9_;
    }

    public Class1_Sub3 method1722(byte i, Class1_Sub3 class1_sub3, int i_10_) {
        anInt2066++;
        int i_11_ = anIntArray2035[i_10_];
        Class68_Sub20_Sub17 class68_sub20_sub17
                = Class35.method432(i_11_ >> -1391172048, (byte) -94);
        i_11_ &= 0xffff;
        if (class68_sub20_sub17 == null)
            return class1_sub3.method82(true, true);
        Class68_Sub20_Sub17 class68_sub20_sub17_12_ = null;
        int i_13_ = 0;
        if (anIntArray2048 != null
                && (anIntArray2048.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff)) {
            i_13_ = anIntArray2048[i_10_];
            class68_sub20_sub17_12_
                    = Class35.method432(i_13_ >> 1301424848, (byte) -48);
            i_13_ &= 0xffff;
        }
        if (class68_sub20_sub17_12_ == null
                || (i_13_ ^ 0xffffffff) == -65536) {
            Class1_Sub3 class1_sub3_14_
                    = class1_sub3.method82(!class68_sub20_sub17.method1180(true,
                    i_11_),
                    !aBoolean2056);
            class1_sub3_14_.method74(class68_sub20_sub17, i_11_, aBoolean2056);
            return class1_sub3_14_;
        }
        int i_15_ = -27 % ((i - -5) / 51);
        Class1_Sub3 class1_sub3_16_
                = class1_sub3.method82((!class68_sub20_sub17.method1180(true,
                i_11_)
                & !class68_sub20_sub17_12_
                .method1180(true, i_13_)),
                !aBoolean2056);
        class1_sub3_16_.method74(class68_sub20_sub17, i_11_, aBoolean2056);
        class1_sub3_16_.method74(class68_sub20_sub17_12_, i_13_, aBoolean2056);
        return class1_sub3_16_;
    }

    public void method1723(Stream str, int i, int i_17_) {
        if (i == 1) {
            int i_18_ = str.readUnsignedWord(i_17_ + 1355778338);
            anIntArray2058 = new int[i_18_];
            for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
                anIntArray2058[i_19_] = str.readUnsignedWord(Class15.method278(i_17_, -1355760786));
            anIntArray2035 = new int[i_18_];
            for (int i_20_ = 0; i_18_ > i_20_; i_20_++)
                anIntArray2035[i_20_] = str.readUnsignedWord(1355769544);
            for (int i_21_ = 0; i_18_ > i_21_; i_21_++)
                anIntArray2035[i_21_] = ((str.readUnsignedWord(1355769544) << -1074992464) + anIntArray2035[i_21_]);
        } else if (i != 2) {
            if (i == 3) {
                int i_22_ = str.readUnsignedByte(-6677);
                anIntArray2050 = new int[i_22_ - -1];
                for (int i_23_ = 0; i_22_ > i_23_; i_23_++)
                    anIntArray2050[i_23_] = str.readUnsignedByte(-6677);
                anIntArray2050[i_22_] = 9999999;
            } else if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 9) {
                                    if (i == 10)
                                        anInt2039 = str.readUnsignedByte(-6677);
                                    else if (i != 11) {
                                        if (i == 12) {
                                            int i_24_ = (str.readUnsignedByte(i_17_ ^ 0x384d));
                                            anIntArray2048 = new int[i_24_];
                                            for (int i_25_ = 0; i_24_ > i_25_; i_25_++)
                                                anIntArray2048[i_25_] = (str.readUnsignedWord(1355769544));
                                            for (int i_26_ = 0; i_24_ > i_26_; i_26_++)
                                                anIntArray2048[i_26_] = (((str.readUnsignedWord(1355769544)) << 1693894864) + (anIntArray2048[i_26_]));
                                        } else if (i != 13) {
                                            if (i == 14)
                                                aBoolean2056 = true;
                                        } else {
                                            int i_27_ = str.readUnsignedWord(1355769544);
                                            anIntArrayArray2034 = new int[i_27_][];
                                            for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
                                                int i_29_ = str.readUnsignedByte(-6677);
                                                if (i_29_ > 0) {
                                                    anIntArrayArray2034[i_28_] = new int[i_29_];
                                                    anIntArrayArray2034[i_28_][0] = (str.method921((byte) -97));
                                                    for (int i_30_ = 1; i_29_ > i_30_; i_30_++)
                                                        anIntArrayArray2034[i_28_][i_30_] = (str.readUnsignedWord(1355769544));
                                                }
                                            }
                                        }
                                    } else
                                        anInt2061 = str.readUnsignedByte(i_17_ + 2117);
                                } else
                                    anInt2043 = str.readUnsignedByte(-6677);
                            } else
                                anInt2037 = str.readUnsignedByte(i_17_ ^ 0x384d);
                        } else
                            anInt2033 = str.readUnsignedWord(1355769544);
                    } else
                        anInt2047 = str.readUnsignedWord(1355769544);
                } else
                    anInt2051 = str.readUnsignedByte(-6677);
            } else
                aBoolean2054 = true;
        } else
            anInt2072 = str.readUnsignedWord(i_17_ ^ ~0x50cf4491);
        if (i_17_ == -8794)
            anInt2032++;
    }

    public static void method1724(int i, int i_31_, boolean bool, int i_32_,
                                  int i_33_, int i_34_, int[] is, int i_35_,
                                  int i_36_, int i_37_, int i_38_) {
        int i_39_ = i_35_;
        anInt2060++;
        if (i_39_ < Class79.anInt1398) {
            if ((i_39_ ^ 0xffffffff) > (Class79.anInt1400 ^ 0xffffffff))
                i_39_ = Class79.anInt1400;
            int i_40_ = i_35_ - -i_31_;
            if ((Class79.anInt1400 ^ 0xffffffff) > (i_40_ ^ 0xffffffff)) {
                int i_41_ = i_36_;
                if ((Class79.anInt1398 ^ 0xffffffff) > (i_40_ ^ 0xffffffff))
                    i_40_ = Class79.anInt1398;
                if ((Class79.anInt1404 ^ 0xffffffff) < (i_41_ ^ 0xffffffff)) {
                    int i_42_ = i_32_ + i_36_;
                    if ((i_41_ ^ 0xffffffff)
                            > (Class79.anInt1403 ^ 0xffffffff))
                        i_41_ = Class79.anInt1403;
                    if ((i_42_ ^ 0xffffffff)
                            < (Class79.anInt1403 ^ 0xffffffff)) {
                        if (i_42_ > Class79.anInt1404)
                            i_42_ = Class79.anInt1404;
                        i_42_ -= i_36_;
                        if ((i ^ 0xffffffff) == -10) {
                            i_37_ = 0x3 & i_37_ + 1;
                            i = 1;
                        }
                        if (i_38_ != 2)
                            method1718(-121);
                        int i_43_ = i_41_ * Class79.anInt1401 + i_39_;
                        if ((i ^ 0xffffffff) == -11) {
                            i_37_ = 0x3 & i_37_ - -3;
                            i = 1;
                        }
                        i_41_ -= i_36_;
                        if ((i ^ 0xffffffff) == -12) {
                            i = 8;
                            i_37_ = 3 + i_37_ & 0x3;
                        }
                        int i_44_ = Class79.anInt1401 + i_39_ + -i_40_;
                        i_39_ -= i_35_;
                        i_40_ -= i_35_;
                        int i_45_ = -i_40_ + i_31_;
                        int i_46_ = -i_39_ + i_31_;
                        int i_47_ = -i_42_ + i_32_;
                        int i_48_ = i_32_ + -i_41_;
                        if (i == 1) {
                            if (i_37_ == 0) {
                                for (int i_49_ = i_41_; i_49_ < i_42_;
                                     i_49_++) {
                                    for (int i_50_ = i_39_; i_40_ > i_50_;
                                         i_50_++) {
                                        if ((i_49_ ^ 0xffffffff)
                                                <= (i_50_ ^ 0xffffffff))
                                            is[i_43_] = i_34_;
                                        else if (bool)
                                            is[i_43_] = i_33_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if ((i_37_ ^ 0xffffffff) == -2) {
                                for (int i_51_ = -1 + i_48_; i_51_ >= i_47_;
                                     i_51_--) {
                                    for (int i_52_ = i_39_; i_52_ < i_40_;
                                         i_52_++) {
                                        if ((i_52_ ^ 0xffffffff)
                                                < (i_51_ ^ 0xffffffff)) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if ((i_37_ ^ 0xffffffff) == -3) {
                                for (int i_53_ = i_41_;
                                     ((i_42_ ^ 0xffffffff)
                                             < (i_53_ ^ 0xffffffff));
                                     i_53_++) {
                                    for (int i_54_ = i_39_; i_54_ < i_40_;
                                         i_54_++) {
                                        if ((i_54_ ^ 0xffffffff)
                                                <= (i_53_ ^ 0xffffffff))
                                            is[i_43_] = i_34_;
                                        else if (bool)
                                            is[i_43_] = i_33_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if (i_37_ == 3) {
                                for (int i_55_ = i_48_ + -1;
                                     ((i_55_ ^ 0xffffffff)
                                             <= (i_47_ ^ 0xffffffff));
                                     i_55_--) {
                                    for (int i_56_ = i_39_; i_56_ < i_40_;
                                         i_56_++) {
                                        if (i_55_ > i_56_) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            }
                        } else if ((i ^ 0xffffffff) == -3) {
                            if ((i_37_ ^ 0xffffffff) == -1) {
                                for (int i_57_ = -1 + i_48_; i_47_ <= i_57_;
                                     i_57_--) {
                                    for (int i_58_ = i_39_; i_58_ < i_40_;
                                         i_58_++) {
                                        if (i_58_ > i_57_ >> -374295103) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if (i_37_ == 1) {
                                for (int i_59_ = i_41_;
                                     ((i_42_ ^ 0xffffffff)
                                             < (i_59_ ^ 0xffffffff));
                                     i_59_++) {
                                    for (int i_60_ = i_39_; i_40_ > i_60_;
                                         i_60_++) {
                                        if (i_43_ < 0
                                                || ((is.length ^ 0xffffffff)
                                                >= (i_43_ ^ 0xffffffff)))
                                            i_43_++;
                                        else {
                                            if ((i_59_ << -893375679
                                                    ^ 0xffffffff)
                                                    >= (i_60_ ^ 0xffffffff))
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if (i_37_ == 2) {
                                for (int i_61_ = i_41_;
                                     ((i_61_ ^ 0xffffffff)
                                             > (i_42_ ^ 0xffffffff));
                                     i_61_++) {
                                    for (int i_62_ = i_46_ + -1;
                                         i_62_ >= i_45_; i_62_--) {
                                        if ((i_61_ >> 1080453377 ^ 0xffffffff)
                                                > (i_62_ ^ 0xffffffff)) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if (i_37_ == 3) {
                                for (int i_63_ = i_48_ + -1;
                                     ((i_47_ ^ 0xffffffff)
                                             >= (i_63_ ^ 0xffffffff));
                                     i_63_--) {
                                    for (int i_64_ = i_46_ - 1;
                                         ((i_64_ ^ 0xffffffff)
                                                 <= (i_45_ ^ 0xffffffff));
                                         i_64_--) {
                                        if ((i_63_ << -1132408607 ^ 0xffffffff)
                                                < (i_64_ ^ 0xffffffff)) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            }
                        } else if ((i ^ 0xffffffff) == -4) {
                            if ((i_37_ ^ 0xffffffff) == -1) {
                                for (int i_65_ = i_48_ + -1;
                                     ((i_47_ ^ 0xffffffff)
                                             >= (i_65_ ^ 0xffffffff));
                                     i_65_--) {
                                    for (int i_66_ = i_46_ + -1;
                                         ((i_66_ ^ 0xffffffff)
                                                 <= (i_45_ ^ 0xffffffff));
                                         i_66_--) {
                                        if (i_65_ >> -668330591 >= i_66_)
                                            is[i_43_] = i_34_;
                                        else if (bool)
                                            is[i_43_] = i_33_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if ((i_37_ ^ 0xffffffff) == -2) {
                                for (int i_67_ = -1 + i_48_;
                                     ((i_47_ ^ 0xffffffff)
                                             >= (i_67_ ^ 0xffffffff));
                                     i_67_--) {
                                    for (int i_68_ = i_39_; i_40_ > i_68_;
                                         i_68_++) {
                                        if ((i_68_ ^ 0xffffffff)
                                                > (i_67_ << 588707393
                                                ^ 0xffffffff)) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if ((i_37_ ^ 0xffffffff) == -3) {
                                for (int i_69_ = i_41_;
                                     ((i_42_ ^ 0xffffffff)
                                             < (i_69_ ^ 0xffffffff));
                                     i_69_++) {
                                    for (int i_70_ = i_39_;
                                         ((i_70_ ^ 0xffffffff)
                                                 > (i_40_ ^ 0xffffffff));
                                         i_70_++) {
                                        if (i_69_ >> 1394317377 < i_70_) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if ((i_37_ ^ 0xffffffff) == -4) {
                                for (int i_71_ = i_41_;
                                     ((i_42_ ^ 0xffffffff)
                                             < (i_71_ ^ 0xffffffff));
                                     i_71_++) {
                                    for (int i_72_ = -1 + i_46_;
                                         ((i_72_ ^ 0xffffffff)
                                                 <= (i_45_ ^ 0xffffffff));
                                         i_72_--) {
                                        if ((i_72_ ^ 0xffffffff)
                                                <= (i_71_ << -2000851167
                                                ^ 0xffffffff))
                                            is[i_43_] = i_34_;
                                        else if (bool)
                                            is[i_43_] = i_33_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            }
                        } else if ((i ^ 0xffffffff) == -5) {
                            if ((i_37_ ^ 0xffffffff) == -1) {
                                for (int i_73_ = i_48_ - 1; i_47_ <= i_73_;
                                     i_73_--) {
                                    for (int i_74_ = i_39_;
                                         ((i_40_ ^ 0xffffffff)
                                                 < (i_74_ ^ 0xffffffff));
                                         i_74_++) {
                                        if ((i_73_ >> -622270527 ^ 0xffffffff)
                                                < (i_74_ ^ 0xffffffff)) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if ((i_37_ ^ 0xffffffff) == -2) {
                                for (int i_75_ = i_41_; i_42_ > i_75_;
                                     i_75_++) {
                                    for (int i_76_ = i_39_;
                                         ((i_40_ ^ 0xffffffff)
                                                 < (i_76_ ^ 0xffffffff));
                                         i_76_++) {
                                        if (i_75_ << -1042949727 < i_76_) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if ((i_37_ ^ 0xffffffff) == -3) {
                                for (int i_77_ = i_41_; i_42_ > i_77_;
                                     i_77_++) {
                                    for (int i_78_ = i_46_ - 1; i_78_ >= i_45_;
                                         i_78_--) {
                                        if (i_77_ >> -860562879 <= i_78_)
                                            is[i_43_] = i_34_;
                                        else if (bool)
                                            is[i_43_] = i_33_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if ((i_37_ ^ 0xffffffff) == -4) {
                                for (int i_79_ = -1 + i_48_; i_47_ <= i_79_;
                                     i_79_--) {
                                    for (int i_80_ = -1 + i_46_;
                                         i_80_ >= i_45_; i_80_--) {
                                        if ((i_79_ << 1757922945 ^ 0xffffffff)
                                                <= (i_80_ ^ 0xffffffff))
                                            is[i_43_] = i_34_;
                                        else if (bool)
                                            is[i_43_] = i_33_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            }
                        } else if ((i ^ 0xffffffff) == -6) {
                            if ((i_37_ ^ 0xffffffff) == -1) {
                                for (int i_81_ = i_48_ + -1; i_47_ <= i_81_;
                                     i_81_--) {
                                    for (int i_82_ = -1 + i_46_;
                                         i_45_ <= i_82_; i_82_--) {
                                        if ((i_82_ ^ 0xffffffff)
                                                <= (i_81_ >> 108043425
                                                ^ 0xffffffff))
                                            is[i_43_] = i_34_;
                                        else if (bool)
                                            is[i_43_] = i_33_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if (i_37_ == 1) {
                                for (int i_83_ = -1 + i_48_;
                                     ((i_83_ ^ 0xffffffff)
                                             <= (i_47_ ^ 0xffffffff));
                                     i_83_--) {
                                    for (int i_84_ = i_39_; i_40_ > i_84_;
                                         i_84_++) {
                                        if (i_83_ << 1351207873 < i_84_) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if (i_37_ == 2) {
                                for (int i_85_ = i_41_; i_85_ < i_42_;
                                     i_85_++) {
                                    for (int i_86_ = i_39_;
                                         ((i_86_ ^ 0xffffffff)
                                                 > (i_40_ ^ 0xffffffff));
                                         i_86_++) {
                                        if ((i_86_ ^ 0xffffffff)
                                                > (i_85_ >> 2046413473
                                                ^ 0xffffffff)) {
                                            if (bool)
                                                is[i_43_] = i_33_;
                                        } else
                                            is[i_43_] = i_34_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            } else if ((i_37_ ^ 0xffffffff) == -4) {
                                for (int i_87_ = i_41_;
                                     ((i_42_ ^ 0xffffffff)
                                             < (i_87_ ^ 0xffffffff));
                                     i_87_++) {
                                    for (int i_88_ = i_46_ - 1; i_88_ >= i_45_;
                                         i_88_--) {
                                        if ((i_87_ << 551578273 ^ 0xffffffff)
                                                <= (i_88_ ^ 0xffffffff))
                                            is[i_43_] = i_34_;
                                        else if (bool)
                                            is[i_43_] = i_33_;
                                        i_43_++;
                                    }
                                    i_43_ += i_44_;
                                }
                            }
                        } else {
                            if ((i ^ 0xffffffff) == -7) {
                                if (i_37_ == 0) {
                                    for (int i_89_ = i_41_; i_89_ < i_42_;
                                         i_89_++) {
                                        for (int i_90_ = i_39_; i_90_ < i_40_;
                                             i_90_++) {
                                            if ((i_31_ / 2 ^ 0xffffffff)
                                                    <= (i_90_ ^ 0xffffffff))
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                    return;
                                }
                                if (i_37_ == 1) {
                                    for (int i_91_ = i_41_; i_42_ > i_91_;
                                         i_91_++) {
                                        for (int i_92_ = i_39_;
                                             ((i_92_ ^ 0xffffffff)
                                                     > (i_40_ ^ 0xffffffff));
                                             i_92_++) {
                                            if ((i_91_ ^ 0xffffffff)
                                                    < (i_32_ / 2 ^ 0xffffffff)) {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                    return;
                                }
                                if ((i_37_ ^ 0xffffffff) == -3) {
                                    for (int i_93_ = i_41_; i_42_ > i_93_;
                                         i_93_++) {
                                        for (int i_94_ = i_39_; i_94_ < i_40_;
                                             i_94_++) {
                                            if (i_94_ < i_31_ / 2) {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                    return;
                                }
                                if (i_37_ == 3) {
                                    for (int i_95_ = i_41_;
                                         ((i_95_ ^ 0xffffffff)
                                                 > (i_42_ ^ 0xffffffff));
                                         i_95_++) {
                                        for (int i_96_ = i_39_;
                                             ((i_96_ ^ 0xffffffff)
                                                     > (i_40_ ^ 0xffffffff));
                                             i_96_++) {
                                            if ((i_95_ ^ 0xffffffff)
                                                    <= (i_32_ / 2 ^ 0xffffffff))
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                    return;
                                }
                            }
                            if (i == 7) {
                                if ((i_37_ ^ 0xffffffff) == -1) {
                                    for (int i_97_ = i_41_;
                                         ((i_97_ ^ 0xffffffff)
                                                 > (i_42_ ^ 0xffffffff));
                                         i_97_++) {
                                        for (int i_98_ = i_39_; i_40_ > i_98_;
                                             i_98_++) {
                                            if (-(i_32_ / 2) + i_97_ < i_98_) {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                    return;
                                }
                                if ((i_37_ ^ 0xffffffff) == -2) {
                                    for (int i_99_ = i_48_ - 1;
                                         ((i_47_ ^ 0xffffffff)
                                                 >= (i_99_ ^ 0xffffffff));
                                         i_99_--) {
                                        for (int i_100_ = i_39_;
                                             i_40_ > i_100_; i_100_++) {
                                            if ((-(i_32_ / 2) + i_99_
                                                    ^ 0xffffffff)
                                                    <= (i_100_ ^ 0xffffffff))
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                    return;
                                }
                                if ((i_37_ ^ 0xffffffff) == -3) {
                                    for (int i_101_ = -1 + i_48_;
                                         ((i_101_ ^ 0xffffffff)
                                                 <= (i_47_ ^ 0xffffffff));
                                         i_101_--) {
                                        for (int i_102_ = i_46_ - 1;
                                             i_45_ <= i_102_; i_102_--) {
                                            if (i_102_ > i_101_ - i_32_ / 2) {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                    return;
                                }
                                if ((i_37_ ^ 0xffffffff) == -4) {
                                    for (int i_103_ = i_41_;
                                         ((i_103_ ^ 0xffffffff)
                                                 > (i_42_ ^ 0xffffffff));
                                         i_103_++) {
                                        for (int i_104_ = i_46_ - 1;
                                             i_104_ >= i_45_; i_104_--) {
                                            if ((-(i_32_ / 2) + i_103_
                                                    ^ 0xffffffff)
                                                    > (i_104_ ^ 0xffffffff)) {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                    return;
                                }
                            }
                            if ((i ^ 0xffffffff) == -9) {
                                if (i_37_ == 0) {
                                    for (int i_105_ = i_41_; i_42_ > i_105_;
                                         i_105_++) {
                                        for (int i_106_ = i_39_;
                                             ((i_40_ ^ 0xffffffff)
                                                     < (i_106_ ^ 0xffffffff));
                                             i_106_++) {
                                            if (i_105_ + -(i_32_ / 2)
                                                    <= i_106_)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 1) {
                                    for (int i_107_ = i_48_ + -1;
                                         i_47_ <= i_107_; i_107_--) {
                                        for (int i_108_ = i_39_;
                                             ((i_40_ ^ 0xffffffff)
                                                     < (i_108_ ^ 0xffffffff));
                                             i_108_++) {
                                            if (-(i_32_ / 2) + i_107_
                                                    <= i_108_)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 2) {
                                    for (int i_109_ = i_48_ + -1;
                                         ((i_109_ ^ 0xffffffff)
                                                 <= (i_47_ ^ 0xffffffff));
                                         i_109_--) {
                                        for (int i_110_ = -1 + i_46_;
                                             i_110_ >= i_45_; i_110_--) {
                                            if ((-(i_32_ / 2) + i_109_
                                                    ^ 0xffffffff)
                                                    >= (i_110_ ^ 0xffffffff))
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 3) {
                                    for (int i_111_ = i_41_;
                                         ((i_42_ ^ 0xffffffff)
                                                 < (i_111_ ^ 0xffffffff));
                                         i_111_++) {
                                        for (int i_112_ = i_46_ - 1;
                                             i_112_ >= i_45_; i_112_--) {
                                            if (-(i_32_ / 2) + i_111_
                                                    > i_112_) {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void method1725(byte i) {
        if ((anInt2039 ^ 0xffffffff) == 0) {
            if (anIntArray2050 != null)
                anInt2039 = 2;
            else
                anInt2039 = 0;
        }
        int i_113_ = 17 % ((55 - i) / 54);
        anInt2068++;
        if ((anInt2043 ^ 0xffffffff) == 0) {
            if (anIntArray2050 != null)
                anInt2043 = 2;
            else
                anInt2043 = 0;
        }
    }

    public static void method1726(int i, int i_114_) {
        anInt2046++;
        Class68_Sub20_Sub12.aClass98_4348.method1564(-18767, i_114_);
        Class52.aClass98_1000.method1564(i ^ 0x494e, i_114_);
        if (i == -1) {
            Class68_Sub13_Sub20.aClass98_3765.method1564(-18767, i_114_);
            Class68_Sub13_Sub37.aClass98_4064.method1564(-18767, i_114_);
        }
    }

    public Class1_Sub3 method1727(Class1_Sub3 class1_sub3,
                                  Class55 class117_115_, int i, byte i_116_,
                                  int i_117_) {
        try {
            i_117_ = anIntArray2035[i_117_];
            int i_118_ = -52 / ((i_116_ - 57) / 44);
            anInt2057++;
            Class68_Sub20_Sub17 class68_sub20_sub17
                    = Class35.method432(i_117_ >> 2009279920, (byte) -47);
            i_117_ &= 0xffff;
            if (class68_sub20_sub17 == null)
                return class117_115_.method1719(i, true, class1_sub3);
            i = class117_115_.anIntArray2035[i];
            Class68_Sub20_Sub17 class68_sub20_sub17_119_
                    = Class35.method432(i >> -337583216, (byte) -96);
            i &= 0xffff;
            if (class68_sub20_sub17_119_ == null) {
                Class1_Sub3 class1_sub3_120_
                        = class1_sub3.method82(!class68_sub20_sub17
                        .method1180(true, i_117_),
                        !aBoolean2056);
                class1_sub3_120_.method74(class68_sub20_sub17, i_117_,
                        aBoolean2056);
                return class1_sub3_120_;
            }
            Class1_Sub3 class1_sub3_121_
                    = class1_sub3.method82((!class68_sub20_sub17.method1180(true,
                    i_117_)
                    & !class68_sub20_sub17_119_
                    .method1180(true, i)),
                    (!aBoolean2056
                            & !class117_115_.aBoolean2056));
            class1_sub3_121_.method86(class68_sub20_sub17, i_117_,
                    class68_sub20_sub17_119_, i,
                    anIntArray2050,
                    (aBoolean2056
                            | class117_115_.aBoolean2056));
            return class1_sub3_121_;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("uc.H("
                            + (class1_sub3 != null ? "{...}"
                            : "null")
                            + ','
                            + (class117_115_ != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_116_ + ',' + i_117_
                            + ')'));
        }
    }

    public Class1_Sub3 method1728(int i, Class1_Sub3 class1_sub3, int i_122_,
                                  int i_123_) {
        i = anIntArray2035[i];
        anInt2041++;
        if (i_123_ != -11436)
            anIntArray2048 = null;
        Class68_Sub20_Sub17 class68_sub20_sub17
                = Class35.method432(i >> 1564093840, (byte) -90);
        i &= 0xffff;
        if (class68_sub20_sub17 == null)
            return class1_sub3.method82(true, true);
        i_122_ &= 0x3;
        Class1_Sub3 class1_sub3_124_
                = class1_sub3.method82(!class68_sub20_sub17.method1180(true, i),
                !aBoolean2056);
        if (i_122_ != 1) {
            if (i_122_ != 2) {
                if (i_122_ == 3)
                    class1_sub3_124_.method80();
            } else
                class1_sub3_124_.method83();
        } else
            class1_sub3_124_.method88();
        class1_sub3_124_.method74(class68_sub20_sub17, i, aBoolean2056);
        if ((i_122_ ^ 0xffffffff) != -2) {
            if ((i_122_ ^ 0xffffffff) == -3)
                class1_sub3_124_.method83();
            else if ((i_122_ ^ 0xffffffff) == -4)
                class1_sub3_124_.method88();
        } else
            class1_sub3_124_.method80();
        return class1_sub3_124_;
    }

    public void method1729(Stream class68_sub14, int i) {
        anInt2040++;
        for (; ; ) {
            int i_125_ = class68_sub14.readUnsignedByte(-6677);
            if (i_125_ == 0)
                break;
            method1723(class68_sub14, i_125_, i + -32816);
        }
        if (i != 24022)
            method1722((byte) 23, null, 53);
    }

    public Class55() {
        anInt2043 = -1;
        anInt2033 = -1;
        anInt2039 = -1;
        anInt2037 = 99;
        anInt2051 = 5;
        aBoolean2056 = false;
        aBoolean2054 = false;
        anInt2061 = 2;
        anInt2072 = -1;
    }

    static {
        aRSString_2045 = RSString.newRsString("purple:");
        aRSString_2059 = aRSString_2045;
        aRSString_2052 = RSString.newRsString("details");
        aRSString_2063 = aRSString_2045;
        aRSString_2064 = RSString.newRsString("hint_mapedge");
        aRSStringArray2067 = new RSString[100];
        aRSString_2070 = (RSString.newRsString
                ("Please wait )2 attempting to reestablish)3"));
        aRSString_2053 = aRSString_2070;
    }
}
