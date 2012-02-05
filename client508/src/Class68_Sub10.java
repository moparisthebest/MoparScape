/* Class68_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub10 extends Class68 {
    public static RSString aRSString_2900;
    public static RSString aRSString_2901;
    public int anInt2902;
    public static boolean aBoolean2903 = false;
    public static int anInt2904;
    public static boolean[] aBooleanArray2905;
    public static int[] anIntArray2906;
    public static Class21renamed aClass21_2907;
    public static int anInt2908;
    public static int anInt2909 = 0;
    public static int anInt2910;
    public static int anInt2911;
    public static Class65 aClass65_2912;
    public static int anInt2913;
    public static JagSocket aClass31_2914;

    public static void method681(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 byte i_4_) {
        anInt2910++;
        if (i_4_ < 79)
            anIntArray2906 = null;
        long l = Class107.method1650(i, i_1_, i_3_);
        if ((l ^ 0xffffffffffffffffL) != -1L) {
            int i_5_ = ((int) l & 0x3da024) >> -920493132;
            int i_6_ = 0x1f & (int) l >> -1013963858;
            int[] is = Class79.anIntArray1402;
            int i_7_ = i_0_;
            int i_8_ = (int) (l >>> -315819104) & 0x7fffffff;
            int i_9_ = 4 * (-(i_3_ * 512) + 52736) + (4 * i_1_ + 24624);
            if (l > 0L)
                i_7_ = i_2_;
            Class116 class116 = Class1_Sub5.method140(106, i_8_);
            if ((class116.anInt1973 ^ 0xffffffff) == 0) {
                if (i_6_ == 0 || i_6_ == 2) {
                    if (i_5_ == 0) {
                        is[i_9_] = i_7_;
                        is[i_9_ + 512] = i_7_;
                        is[1024 + i_9_] = i_7_;
                        is[1536 + i_9_] = i_7_;
                    } else if ((i_5_ ^ 0xffffffff) == -2) {
                        is[i_9_] = i_7_;
                        is[i_9_ + 1] = i_7_;
                        is[i_9_ + 2] = i_7_;
                        is[3 + i_9_] = i_7_;
                    } else if (i_5_ == 2) {
                        is[i_9_ - -3] = i_7_;
                        is[3 + (i_9_ + 512)] = i_7_;
                        is[3 + (i_9_ + 1024)] = i_7_;
                        is[1536 + (i_9_ - -3)] = i_7_;
                    } else if (i_5_ == 3) {
                        is[i_9_ + 1536] = i_7_;
                        is[i_9_ + 1536 + 1] = i_7_;
                        is[2 + i_9_ + 1536] = i_7_;
                        is[i_9_ + 1539] = i_7_;
                    }
                }
                if ((i_6_ ^ 0xffffffff) == -4) {
                    if ((i_5_ ^ 0xffffffff) != -1) {
                        if (i_5_ != 1) {
                            if ((i_5_ ^ 0xffffffff) == -3)
                                is[3 + i_9_ - -1536] = i_7_;
                            else if ((i_5_ ^ 0xffffffff) == -4)
                                is[1536 + i_9_] = i_7_;
                        } else
                            is[i_9_ + 3] = i_7_;
                    } else
                        is[i_9_] = i_7_;
                }
                if (i_6_ == 2) {
                    if (i_5_ != 3) {
                        if (i_5_ != 0) {
                            if ((i_5_ ^ 0xffffffff) == -2) {
                                is[i_9_ + 3] = i_7_;
                                is[i_9_ + 515] = i_7_;
                                is[1024 + (i_9_ + 3)] = i_7_;
                                is[i_9_ - -1539] = i_7_;
                            } else if (i_5_ == 2) {
                                is[1536 + i_9_] = i_7_;
                                is[1 + i_9_ + 1536] = i_7_;
                                is[1538 + i_9_] = i_7_;
                                is[1536 + (i_9_ - -3)] = i_7_;
                            }
                        } else {
                            is[i_9_] = i_7_;
                            is[i_9_ + 1] = i_7_;
                            is[2 + i_9_] = i_7_;
                            is[3 + i_9_] = i_7_;
                        }
                    } else {
                        is[i_9_] = i_7_;
                        is[i_9_ - -512] = i_7_;
                        is[i_9_ + 1024] = i_7_;
                        is[1536 + i_9_] = i_7_;
                    }
                }
            } else {
                Class92_Sub1 class92_sub1 = null;
                if (class116.aBoolean2017) {
                    if ((i_5_ ^ 0xffffffff) == -1)
                        class92_sub1 = (Class104.aClass92_Sub1Array1779
                                [class116.anInt1973]);
                    else if (i_5_ == 1)
                        class92_sub1 = (Class112.aClass92_Sub1Array1886
                                [class116.anInt1973]);
                    else if ((i_5_ ^ 0xffffffff) != -3) {
                        if ((i_5_ ^ 0xffffffff) == -4)
                            class92_sub1
                                    = (Class68_Sub20_Sub17.aClass92_Sub1Array4431
                                    [class116.anInt1973]);
                    } else
                        class92_sub1
                                = (Class68_Sub13_Sub19.aClass92_Sub1Array3745
                                [class116.anInt1973]);
                } else
                    class92_sub1
                            = Class104.aClass92_Sub1Array1779[class116.anInt1973];
                if (class92_sub1 != null) {
                    int i_10_
                            = ((class116.anInt1988 * 4 - class92_sub1.anInt1659)
                            / 2);
                    int i_11_
                            = ((-class92_sub1.anInt1658 + class116.anInt1987 * 4)
                            / 2);
                    class92_sub1.method1527(i_10_ + 4 * i_1_ + 48,
                            (-class116.anInt1987 + -i_3_
                                    + 104) * 4 + (48 + i_11_));
                }
            }
        }
        l = Class68_Sub13_Sub9.method738(i, i_1_, i_3_);
        if ((l ^ 0xffffffffffffffffL) != -1L) {
            int i_12_ = 0x3 & (int) l >> 1603407924;
            int i_13_ = (int) l >> 1977078766 & 0x1f;
            int i_14_ = (int) (l >>> -1604026208) & 0x7fffffff;
            Class116 class116 = Class1_Sub5.method140(127, i_14_);
            if ((class116.anInt1973 ^ 0xffffffff) == 0) {
                if (i_13_ == 9) {
                    int[] is = Class79.anIntArray1402;
                    int i_15_ = 15658734;
                    if ((l ^ 0xffffffffffffffffL) < -1L)
                        i_15_ = 15597568;
                    int i_16_ = 4 * (-i_3_ + 103) * 512 + (4 * i_1_ + 24624);
                    if (i_12_ == 0 || i_12_ == 2) {
                        is[1536 + i_16_] = i_15_;
                        is[1 + (i_16_ + 1024)] = i_15_;
                        is[512 + (i_16_ + 2)] = i_15_;
                        is[i_16_ + 3] = i_15_;
                    } else {
                        is[i_16_] = i_15_;
                        is[1 + i_16_ - -512] = i_15_;
                        is[1026 + i_16_] = i_15_;
                        is[i_16_ + 1539] = i_15_;
                    }
                }
            } else {
                Class92_Sub1 class92_sub1 = null;
                if (class116.aBoolean2017) {
                    if (i_12_ == 0)
                        class92_sub1 = (Class104.aClass92_Sub1Array1779
                                [class116.anInt1973]);
                    else if (i_12_ != 1) {
                        if (i_12_ != 2) {
                            if (i_12_ == 3)
                                class92_sub1 = (Class68_Sub20_Sub17
                                        .aClass92_Sub1Array4431
                                        [class116.anInt1973]);
                        } else
                            class92_sub1
                                    = (Class68_Sub13_Sub19.aClass92_Sub1Array3745
                                    [class116.anInt1973]);
                    } else
                        class92_sub1 = (Class112.aClass92_Sub1Array1886
                                [class116.anInt1973]);
                } else
                    class92_sub1
                            = Class104.aClass92_Sub1Array1779[class116.anInt1973];
                if (class92_sub1 != null) {
                    int i_17_
                            = ((4 * class116.anInt1987 - class92_sub1.anInt1658)
                            / 2);
                    int i_18_
                            = ((class116.anInt1988 * 4 - class92_sub1.anInt1659)
                            / 2);
                    class92_sub1.method1527
                            (i_18_ + (48 + i_1_ * 4),
                                    i_17_ + (48
                                            + 4 * (104 - (i_3_ - -class116.anInt1987))));
                }
            }
        }
        l = Unknown.method1506(i, i_1_, i_3_);
        if ((l ^ 0xffffffffffffffffL) != -1L) {
            int i_19_ = ((int) l & 0x3f83b3) >> 2052673076;
            int i_20_ = (int) (l >>> 2064286688) & 0x7fffffff;
            Class116 class116 = Class1_Sub5.method140(82, i_20_);
            if ((class116.anInt1973 ^ 0xffffffff) != 0) {
                Class92_Sub1 class92_sub1 = null;
                if (!class116.aBoolean2017)
                    class92_sub1
                            = Class104.aClass92_Sub1Array1779[class116.anInt1973];
                else if ((i_19_ ^ 0xffffffff) == -1)
                    class92_sub1
                            = Class104.aClass92_Sub1Array1779[class116.anInt1973];
                else if (i_19_ != 1) {
                    if ((i_19_ ^ 0xffffffff) == -3)
                        class92_sub1
                                = (Class68_Sub13_Sub19.aClass92_Sub1Array3745
                                [class116.anInt1973]);
                    else if (i_19_ == 3)
                        class92_sub1
                                = (Class68_Sub20_Sub17.aClass92_Sub1Array4431
                                [class116.anInt1973]);
                } else
                    class92_sub1
                            = Class112.aClass92_Sub1Array1886[class116.anInt1973];
                if (class92_sub1 != null) {
                    int i_21_
                            = ((class116.anInt1987 * 4 - class92_sub1.anInt1658)
                            / 2);
                    int i_22_
                            = ((-class92_sub1.anInt1659 + class116.anInt1988 * 4)
                            / 2);
                    class92_sub1.method1527(i_22_ + (48 + 4 * i_1_),
                            (i_21_ + 48
                                    - -(4 * (-class116.anInt1987
                                    + (-i_3_ + 104)))));
                }
            }
        }
    }

    public static void method682(int i) {
        aRSString_2900 = null;
        aClass31_2914 = null;
        aClass21_2907 = null;
        aRSString_2901 = null;
        aClass65_2912 = null;
        aBooleanArray2905 = null;
        if (i == 0)
            anIntArray2906 = null;
    }

    public Class68_Sub10() {
        /* empty */
    }

    public Class68_Sub10(int i) {
        anInt2902 = i;
    }

    public static void method683(byte i) {
        anInt2913++;
        int i_23_ = -69 / ((i - -65) / 61);
        if (Class118.anIntArray2077 == null
                || Class78.anIntArray1394 == null) {
            Class118.anIntArray2077 = new int[256];
            Class78.anIntArray1394 = new int[256];
            for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -257; i_24_++) {
                double d = (double) i_24_ / 255.0 * 6.283185307179586;
                Class118.anIntArray2077[i_24_] = (int) (Math.sin(d) * 4096.0);
                Class78.anIntArray1394[i_24_] = (int) (Math.cos(d) * 4096.0);
            }
        }
    }

    public static void method684(int i) {
        anInt2904++;
        if (i == (Class68_Sub7.method666(1) ^ 0xffffffff)) {
            byte i_25_ = (byte) (0xff & Class3.anInt84 + -4);
            int i_26_ = Class3.anInt84 % 104;
            for (int i_27_ = 0; i_27_ < 4; i_27_++) {
                for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -105; i_28_++)
                    Class68_Sub20.aByteArrayArrayArray3095[i_27_][i_26_][i_28_]
                            = i_25_;
            }
            if (GameSocket.anInt1149 != 3) {
                for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -3; i_29_++) {
                    Class21_Sub1.anIntArray2693[i_29_] = -1000000;
                    PlayerDefinition.anIntArray2180[i_29_] = 1000000;
                    Class7.anIntArray134[i_29_] = 0;
                    Class68_Sub20_Sub16.anIntArray4408[i_29_] = 1000000;
                    Login.anIntArray1510[i_29_] = 0;
                }
                if ((Class128.anInt2214 ^ 0xffffffff) == -2) {
                    if ((0x4 & (Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149]
                            [(Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561
                            >> -551140089)]
                            [(Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                            >> 729418503)])
                            ^ 0xffffffff)
                            != -1)
                        Class75_Sub1_Sub1.method1391
                                (false, Class22.aClass68_Sub1ArrayArrayArray484,
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                                                >> -1252316761),
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561
                                                >> -16710521),
                                        0, (byte) -125);
                    if (Canvas_Sub1.anInt45 < 310) {
                        int i_30_
                                = (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561
                                >> 607803239);
                        int i_31_ = Class85.anInt1558 >> -1080666425;
                        int i_32_
                                = (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                                >> -1840153689);
                        int i_33_ = Class68_Sub7.anInt2862 >> -78823161;
                        int i_34_;
                        if (i_30_ <= i_33_)
                            i_34_ = i_33_ + -i_30_;
                        else
                            i_34_ = -i_33_ + i_30_;
                        int i_35_;
                        if (i_32_ <= i_31_)
                            i_35_ = -i_32_ + i_31_;
                        else
                            i_35_ = -i_31_ + i_32_;
                        if ((i_35_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff)) {
                            int i_36_ = 32768;
                            int i_37_ = 65536 * i_35_ / i_34_;
                            while (i_33_ != i_30_) {
                                if (i_30_ > i_33_)
                                    i_33_++;
                                else if (i_33_ > i_30_)
                                    i_33_--;
                                if ((0x4 & (Class64.aByteArrayArrayArray1178
                                        [GameSocket.anInt1149][i_33_][i_31_]))
                                        != 0) {
                                    Class75_Sub1_Sub1.method1391
                                            (false,
                                                    (Class22
                                                            .aClass68_Sub1ArrayArrayArray484),
                                                    i_31_, i_33_, 1, (byte) 104);
                                    break;
                                }
                                i_36_ += i_37_;
                                if (i_36_ >= 65536) {
                                    i_36_ -= 65536;
                                    if ((i_31_ ^ 0xffffffff)
                                            <= (i_32_ ^ 0xffffffff)) {
                                        if (i_31_ > i_32_)
                                            i_31_--;
                                    } else
                                        i_31_++;
                                    if (((Class64.aByteArrayArrayArray1178
                                            [GameSocket.anInt1149][i_33_][i_31_])
                                            & 0x4)
                                            != 0) {
                                        Class75_Sub1_Sub1.method1391
                                                (false,
                                                        (Class22
                                                                .aClass68_Sub1ArrayArrayArray484),
                                                        i_31_, i_33_, 1, (byte) 62);
                                        break;
                                    }
                                }
                            }
                        } else {
                            int i_38_ = i_34_ * 65536 / i_35_;
                            int i_39_ = 32768;
                            while (i_31_ != i_32_) {
                                if ((i_31_ ^ 0xffffffff)
                                        > (i_32_ ^ 0xffffffff))
                                    i_31_++;
                                else if (i_31_ > i_32_)
                                    i_31_--;
                                if ((0x4 & (Class64.aByteArrayArrayArray1178
                                        [GameSocket.anInt1149][i_33_][i_31_])
                                        ^ 0xffffffff)
                                        != -1) {
                                    Class75_Sub1_Sub1.method1391
                                            (false,
                                                    (Class22
                                                            .aClass68_Sub1ArrayArrayArray484),
                                                    i_31_, i_33_, 1, (byte) -79);
                                    break;
                                }
                                i_39_ += i_38_;
                                if (i_39_ >= 65536) {
                                    if ((i_33_ ^ 0xffffffff)
                                            > (i_30_ ^ 0xffffffff))
                                        i_33_++;
                                    else if ((i_33_ ^ 0xffffffff)
                                            < (i_30_ ^ 0xffffffff))
                                        i_33_--;
                                    i_39_ -= 65536;
                                    if (((Class64.aByteArrayArrayArray1178
                                            [GameSocket.anInt1149][i_33_][i_31_])
                                            & 0x4)
                                            != 0) {
                                        Class75_Sub1_Sub1.method1391
                                                (false,
                                                        (Class22
                                                                .aClass68_Sub1ArrayArrayArray484),
                                                        i_31_, i_33_, 1, (byte) -113);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int i_40_
                            = Class1_Sub6_Sub2.method163(Class68_Sub7.anInt2862,
                            GameSocket.anInt1149,
                            Class85.anInt1558, false);
                    if (i_40_ + -Class68_Sub5.anInt2833 < 800
                            && (0x4 & (Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149]
                            [Class68_Sub7.anInt2862 >> 1691754311]
                            [Class85.anInt1558 >> 1757676263])) != 0)
                        Class75_Sub1_Sub1.method1391
                                (false, Class22.aClass68_Sub1ArrayArrayArray484,
                                        Class85.anInt1558 >> -576111289,
                                        Class68_Sub7.anInt2862 >> 35118439, 1,
                                        (byte) -109);
                }
            }
        }
    }

    static {
        anInt2908 = 0;
        anIntArray2906 = new int[32768];
        aRSString_2901 = RSString.newRsString("loginscreen");
        anInt2911 = -1;
        aRSString_2900 = RSString.newRsString("::clientdrop");
    }
}
