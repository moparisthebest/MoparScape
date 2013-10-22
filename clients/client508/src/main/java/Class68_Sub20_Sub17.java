/* Class68_Sub20_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub17 extends Class68_Sub20 {
    public static Class92_Sub1[] aClass92_Sub1Array4431;
    public Class110[] aClass110Array4432;
    public static int anInt4433;
    public static int anInt4434;
    public static RSString aRSString_4435;
    public static int anInt4436;
    public static int anInt4437;
    public static RSString aRSString_4438
            = RSString.newRsString("leuchten3:");
    public static int anInt4439 = 0;
    public static Class68_Sub20_Sub10 aClass68_Sub20_Sub10_4440;
    public static Class45 aClass45_4441 = null;
    public static int[][][] anIntArrayArrayArray4442;
    public static int anInt4443;

    public static void method1178(int i) {
        if (Class128.aBooleanArray2228[96])
            Class116.anInt2007 += (-Class116.anInt2007 + -24) / 2;
        else if (!Class128.aBooleanArray2228[97])
            Class116.anInt2007 /= 2;
        else
            Class116.anInt2007 += (-Class116.anInt2007 + 24) / 2;
        int i_0_ = (Class68_Sub3.anInt2805
                + Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561);
        anInt4434++;
        Class8.anInt163 += Class116.anInt2007 / i;
        if (!Class128.aBooleanArray2228[98]) {
            if (Class128.aBooleanArray2228[99])
                Class68_Sub20_Sub5.anInt4226
                        += (-Class68_Sub20_Sub5.anInt4226 + -12) / 2;
            else
                Class68_Sub20_Sub5.anInt4226 /= 2;
        } else
            Class68_Sub20_Sub5.anInt4226
                    += (-Class68_Sub20_Sub5.anInt4226 + 12) / 2;
        Class16.anInt275 += Class68_Sub20_Sub5.anInt4226 / 2;
        int i_1_ = (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                + Class68_Sub20_Sub9.anInt4291);
        if (Class68_Sub20_Sub2.anInt4186 - i_0_ < -500
                || Class68_Sub20_Sub2.anInt4186 + -i_0_ > 500
                || (Class68_Sub20_Sub18.anInt4449 + -i_1_ ^ 0xffffffff) > 499
                || (Class68_Sub20_Sub18.anInt4449 + -i_1_ ^ 0xffffffff) < -501) {
            Class68_Sub20_Sub18.anInt4449 = i_1_;
            Class68_Sub20_Sub2.anInt4186 = i_0_;
        }
        if ((i_0_ ^ 0xffffffff) != (Class68_Sub20_Sub2.anInt4186 ^ 0xffffffff))
            Class68_Sub20_Sub2.anInt4186
                    += (-Class68_Sub20_Sub2.anInt4186 + i_0_) / 16;
        if ((Class68_Sub20_Sub18.anInt4449 ^ 0xffffffff)
                != (i_1_ ^ 0xffffffff))
            Class68_Sub20_Sub18.anInt4449
                    += (-Class68_Sub20_Sub18.anInt4449 + i_1_) / 16;
        Class68_Sub13_Sub20.method799((byte) -121);
    }

    public static void method1179(int i) {
        aClass68_Sub20_Sub10_4440 = null;
        if (i != 499)
            method1179(-51);
        anIntArrayArrayArray4442 = null;
        aClass45_4441 = null;
        aRSString_4438 = null;
        aClass92_Sub1Array4431 = null;
        aRSString_4435 = null;
    }

    public Class68_Sub20_Sub17(Class21renamed class21, Class21renamed class21_2_, int i,
                               boolean bool) {
        try {
            Class16 class16 = new Class16();
            int i_3_ = class21.method355(i, 0);
            aClass110Array4432 = new Class110[i_3_];
            int[] is = class21.method345(false, i);
            for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (is.length ^ 0xffffffff);
                 i_4_++) {
                byte[] is_5_ = class21.method338(is[i_4_], 0, i);
                int i_6_ = 0xff & is_5_[1] | (0xff & is_5_[0]) << 734028872;
                Class68_Sub7 class68_sub7
                        = (Class68_Sub7) class16.method293((byte) 76);
                Class68_Sub7 class68_sub7_7_ = null;
                for (/**/; class68_sub7 != null;
                         class68_sub7
                                 = (Class68_Sub7) class16.method290((byte) -107)) {
                    if (i_6_ == class68_sub7.anInt2857) {
                        class68_sub7_7_ = class68_sub7;
                        break;
                    }
                }
                if (class68_sub7_7_ == null) {
                    byte[] is_8_;
                    if (bool)
                        is_8_ = class21_2_.method343(i_6_, 14281, 0);
                    else
                        is_8_ = class21_2_.method343(0, 14281, i_6_);
                    class68_sub7_7_ = new Class68_Sub7(i_6_, is_8_);
                    class16.method286(class68_sub7_7_, true);
                }
                aClass110Array4432[is[i_4_]]
                        = new Class110(is_5_, class68_sub7_7_);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("w.<init>("
                            + (class21 != null ? "{...}" : "null")
                            + ','
                            + (class21_2_ != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + bool + ')'));
        }
    }

    public boolean method1180(boolean bool, int i) {
        if (bool != true)
            return true;
        anInt4443++;
        return aClass110Array4432[i].aBoolean1854;
    }

    public static void method1181
            (GroundData class38, int i, boolean bool, int i_9_, int i_10_, int i_11_,
             int i_12_, int i_13_, int i_14_, boolean bool_15_, int i_16_) {
        anInt4433++;
        if (!bool_15_ || Class28.method398(24781)
                || (Class64.aByteArrayArrayArray1178[0][i_11_][i_9_] & 0x2) != 0
                || ((Class64.aByteArrayArrayArray1178[i_14_][i_11_][i_9_] & 0x10
                ^ 0xffffffff) == -1
                && (Class86.method1484(i_9_, i_14_, i_11_, (byte) -68)
                == Class68_Sub13_Sub18.anInt3737))) {
            if (Class68_Sub25.anInt3174 > i_14_)
                Class68_Sub25.anInt3174 = i_14_;
            Class116 class116 = Class1_Sub5.method140(110, i_16_);
            int i_17_;
            int i_18_;
            if (i != i_10_ && (i_10_ ^ 0xffffffff) != -4) {
                i_18_ = class116.anInt1987;
                i_17_ = class116.anInt1988;
            } else {
                i_17_ = class116.anInt1987;
                i_18_ = class116.anInt1988;
            }
            int i_19_;
            int i_20_;
            if ((i_17_ + i_11_ ^ 0xffffffff) >= -105) {
                i_19_ = i_11_ - -(i_17_ - -1 >> -337102239);
                i_20_ = i_11_ + (i_17_ >> -456050847);
            } else {
                i_19_ = i_11_ - -1;
                i_20_ = i_11_;
            }
            int i_21_;
            int i_22_;
            if (i_18_ + i_9_ > 104) {
                i_21_ = i_9_;
                i_22_ = 1 + i_9_;
            } else {
                i_21_ = i_9_ - -(i_18_ >> -1166464799);
                i_22_ = i_9_ - -(1 + i_18_ >> -895671615);
            }
            int[][] is = Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_13_];
            int i_23_ = (i_18_ << -105619002) + (i_9_ << -1899253241);
            int i_24_ = (i_11_ << 387717831) - -(i_17_ << -1441891642);
            int i_25_
                    = ((is[i_20_][i_21_] - (-is[i_19_][i_21_] + -is[i_20_][i_22_])
                    + is[i_19_][i_22_])
                    >> -1107865470);
            int[][] is_26_ = null;
            if (bool)
                is_26_ = Class74.anIntArrayArrayArray1335[0];
            else if ((i_13_ ^ 0xffffffff) > -4)
                is_26_
                        = Class68_Sub20_Sub12.anIntArrayArrayArray4353[1 + i_13_];
            long l = (long) (0x40000000 | (i_10_ << 1760561524
                    | (i_9_ << 1552693575 | i_11_
                    | i_12_ << -484950450)));
            if ((class116.anInt1983 ^ 0xffffffff) == -1 || bool)
                l |= ~0x7fffffffffffffffL;
            if ((class116.anInt1972 ^ 0xffffffff) == -2)
                l |= 0x400000L;
            if (class116.aBoolean2005)
                l |= 0x80000000L;
            if (class116.method1707((byte) -6))
                Class52.method543(19395, i_9_, null, class116, i_10_, i_11_,
                        i_14_, null);
            boolean bool_27_ = !bool & class116.aBoolean2018;
            l |= (long) i_16_ << -519895968;
            if (i_12_ == 22) {
                if (ISAACRandomGen.aBoolean1487 || class116.anInt1983 != 0
                        || class116.anInt2022 == 1 || class116.aBoolean2004) {
                    Animable class1;
                    if (class116.anInt2002 == -1
                            && class116.anIntArray1994 == null) {
                        Class44 class44
                                = class116.method1702(22, null, bool_27_,
                                (byte) -116, bool_15_, i_25_,
                                i_10_, is, i_23_, is_26_,
                                i_24_);
                        class1 = class44.aClass1_746;
                    } else
                        class1
                                = new Class1_Sub7(i_16_, 22, i_10_, i_13_, i_11_,
                                i_9_, class116.anInt2002,
                                class116.aBoolean1997, null);
                    Class98.method1571(i_14_, i_11_, i_9_, i_25_, class1, l,
                            class116.aBoolean1960);
                    if ((class116.anInt2022 ^ 0xffffffff) == -2
                            && class38 != null)
                        class38.method446(-124, i_9_, i_11_);
                }
            } else if ((i_12_ ^ 0xffffffff) == -11
                    || (i_12_ ^ 0xffffffff) == -12) {
                Animable class1;
                if ((class116.anInt2002 ^ 0xffffffff) != 0
                        || class116.anIntArray1994 != null)
                    class1 = new Class1_Sub7(i_16_, 10,
                            i_12_ != 11 ? i_10_ : i_10_ + 4,
                            i_13_, i_11_, i_9_,
                            class116.anInt2002,
                            class116.aBoolean1997, null);
                else {
                    Class44 class44
                            = class116.method1702(10, null, bool_27_, (byte) -20,
                            bool_15_, i_25_,
                            i_12_ == 11 ? i_10_ + 4 : i_10_,
                            is, i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                }
                if (class1 != null) {
                    boolean bool_28_
                            = Class3.method181(i_14_, i_11_, i_9_, i_25_, i_17_,
                            i_18_, class1, 0, l);
                    if (class116.aBoolean2027 && bool_28_ && bool_15_) {
                        int i_29_ = 15;
                        if (class1 instanceof Class1_Sub3) {
                            i_29_ = ((Class1_Sub3) class1).method79() / 4;
                            if ((i_29_ ^ 0xffffffff) < -31)
                                i_29_ = 30;
                        }
                        for (int i_30_ = 0;
                             (i_30_ ^ 0xffffffff) >= (i_17_ ^ 0xffffffff);
                             i_30_++) {
                            for (int i_31_ = 0; i_31_ <= i_18_; i_31_++) {
                                if (((GroundData.aByteArrayArrayArray676[i_14_]
                                        [i_11_ - -i_30_][i_9_ + i_31_])
                                        ^ 0xffffffff)
                                        > (i_29_ ^ 0xffffffff))
                                    GroundData.aByteArrayArrayArray676[i_14_]
                                            [i_30_ + i_11_][i_31_ + i_9_]
                                            = (byte) i_29_;
                            }
                        }
                    }
                }
                if ((class116.anInt2022 ^ 0xffffffff) != -1 && class38 != null)
                    class38.method455(-120, class116.aBoolean2030, i_18_,
                            i_17_, i_11_, i_9_);
            } else if (i_12_ >= 12) {
                Animable class1;
                if (class116.anInt2002 != -1
                        || class116.anIntArray1994 != null)
                    class1 = new Class1_Sub7(i_16_, i_12_, i_10_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                else {
                    Class44 class44
                            = class116.method1702(i_12_, null, bool_27_,
                            (byte) -127, bool_15_, i_25_,
                            i_10_, is, i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                }
                Class3.method181(i_14_, i_11_, i_9_, i_25_, 1, 1, class1, 0,
                        l);
                if (bool_15_ && i_12_ >= 12 && i_12_ <= 17 && i_12_ != 13
                        && (i_14_ ^ 0xffffffff) < -1)
                    Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_]
                            = Class70.method1335((Class74.anIntArrayArrayArray1336
                            [i_14_][i_11_][i_9_]),
                            4);
                if ((class116.anInt2022 ^ 0xffffffff) != -1 && class38 != null)
                    class38.method455(-56, class116.aBoolean2030, i_18_, i_17_,
                            i_11_, i_9_);
            } else if (i_12_ == 0) {
                Animable class1;
                if (class116.anInt2002 == -1
                        && class116.anIntArray1994 == null) {
                    Class44 class44
                            = class116.method1702(0, null, bool_27_, (byte) -29,
                            bool_15_, i_25_, i_10_, is,
                            i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                } else
                    class1 = new Class1_Sub7(i_16_, 0, i_10_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                Class119.method1737(i_14_, i_11_, i_9_, i_25_, class1, null,
                        Class23.anIntArray498[i_10_], 0, l);
                if (bool_15_) {
                    if (i_10_ == 0) {
                        if (class116.aBoolean2027) {
                            GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_]
                                    = (byte) 50;
                            GroundData.aByteArrayArrayArray676[i_14_][i_11_]
                                    [1 + i_9_]
                                    = (byte) 50;
                        }
                        if (class116.aBoolean2008)
                            Class74.anIntArrayArrayArray1336[i_14_][i_11_]
                                    [i_9_]
                                    = Class70.method1335((Class74
                                    .anIntArrayArrayArray1336
                                    [i_14_][i_11_][i_9_]),
                                    1);
                    } else if (i_10_ == 1) {
                        if (class116.aBoolean2027) {
                            GroundData.aByteArrayArrayArray676[i_14_][i_11_]
                                    [1 + i_9_]
                                    = (byte) 50;
                            GroundData.aByteArrayArrayArray676[i_14_]
                                    [1 + i_11_][i_9_ + 1]
                                    = (byte) 50;
                        }
                        if (class116.aBoolean2008)
                            Class74.anIntArrayArrayArray1336[i_14_][i_11_]
                                    [1 + i_9_]
                                    = Class70.method1335((Class74
                                    .anIntArrayArrayArray1336
                                    [i_14_][i_11_]
                                    [1 + i_9_]),
                                    2);
                    } else if (i_10_ != 2) {
                        if ((i_10_ ^ 0xffffffff) == -4) {
                            if (class116.aBoolean2027) {
                                GroundData.aByteArrayArrayArray676[i_14_]
                                        [i_11_][i_9_]
                                        = (byte) 50;
                                GroundData.aByteArrayArrayArray676[i_14_]
                                        [i_11_ - -1][i_9_]
                                        = (byte) 50;
                            }
                            if (class116.aBoolean2008)
                                Class74.anIntArrayArrayArray1336[i_14_]
                                        [i_11_][i_9_]
                                        = (Class70.method1335
                                        ((Class74.anIntArrayArrayArray1336
                                                [i_14_][i_11_][i_9_]),
                                                2));
                        }
                    } else {
                        if (class116.aBoolean2027) {
                            GroundData.aByteArrayArrayArray676[i_14_]
                                    [i_11_ + 1][i_9_]
                                    = (byte) 50;
                            GroundData.aByteArrayArrayArray676[i_14_]
                                    [1 + i_11_][i_9_ + 1]
                                    = (byte) 50;
                        }
                        if (class116.aBoolean2008)
                            Class74.anIntArrayArrayArray1336[i_14_]
                                    [i_11_ - -1][i_9_]
                                    = Class70.method1335((Class74
                                    .anIntArrayArrayArray1336
                                    [i_14_][i_11_ - -1]
                                    [i_9_]),
                                    1);
                    }
                }
                if (class116.anInt2022 != 0 && class38 != null)
                    class38.method461(i_10_, i_9_, class116.aBoolean2030,
                            i_12_, i_11_, (byte) 0);
                if ((class116.anInt2025 ^ 0xffffffff) != -17)
                    Class68_Sub13_Sub26.method830(i_14_, i_11_, i_9_,
                            class116.anInt2025);
            } else if (i_12_ == 1) {
                Animable class1;
                if (class116.anInt2002 != -1
                        || class116.anIntArray1994 != null)
                    class1 = new Class1_Sub7(i_16_, 1, i_10_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                else {
                    Class44 class44
                            = class116.method1702(1, null, bool_27_, (byte) -51,
                            bool_15_, i_25_, i_10_, is,
                            i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                }
                Class119.method1737(i_14_, i_11_, i_9_, i_25_, class1, null,
                        Class68_Sub20_Sub7.anIntArray4261[i_10_],
                        0, l);
                if (class116.aBoolean2027 && bool_15_) {
                    if ((i_10_ ^ 0xffffffff) == -1)
                        GroundData.aByteArrayArrayArray676[i_14_][i_11_][(i_9_
                                - -1)]
                                = (byte) 50;
                    else if ((i_10_ ^ 0xffffffff) != -2) {
                        if (i_10_ == 2)
                            GroundData.aByteArrayArrayArray676[i_14_]
                                    [i_11_ + 1][i_9_]
                                    = (byte) 50;
                        else if (i_10_ == 3)
                            GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_]
                                    = (byte) 50;
                    } else
                        GroundData.aByteArrayArrayArray676[i_14_][1 + i_11_]
                                [i_9_ - -1]
                                = (byte) 50;
                }
                if ((class116.anInt2022 ^ 0xffffffff) != -1 && class38 != null)
                    class38.method461(i_10_, i_9_, class116.aBoolean2030,
                            i_12_, i_11_, (byte) 24);
            } else if (i_12_ == 2) {
                int i_32_ = 0x3 & 1 + i_10_;
                Animable class1;
                Animable class1_33_;
                if ((class116.anInt2002 ^ 0xffffffff) != 0
                        || class116.anIntArray1994 != null) {
                    class1 = new Class1_Sub7(i_16_, 2, 4 + i_10_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                    class1_33_ = new Class1_Sub7(i_16_, 2, i_32_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                } else {
                    Class44 class44
                            = class116.method1702(2, null, bool_27_, (byte) -49,
                            bool_15_, i_25_, i_10_ + 4, is,
                            i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                    class44
                            = class116.method1702(2, null, bool_27_, (byte) -116,
                            bool_15_, i_25_, i_32_, is,
                            i_23_, is_26_, i_24_);
                    class1_33_ = class44.aClass1_746;
                }
                Class119.method1737(i_14_, i_11_, i_9_, i_25_, class1,
                        class1_33_, Class23.anIntArray498[i_10_],
                        Class23.anIntArray498[i_32_], l);
                if (class116.aBoolean2008 && bool_15_) {
                    if (i_10_ != 0) {
                        if (i_10_ == 1) {
                            Class74.anIntArrayArrayArray1336[i_14_][i_11_]
                                    [i_9_ + 1]
                                    = Class70.method1335((Class74
                                    .anIntArrayArrayArray1336
                                    [i_14_][i_11_]
                                    [i_9_ + 1]),
                                    2);
                            Class74.anIntArrayArrayArray1336[i_14_]
                                    [1 + i_11_][i_9_]
                                    = Class70.method1335((Class74
                                    .anIntArrayArrayArray1336
                                    [i_14_][1 + i_11_]
                                    [i_9_]),
                                    1);
                        } else if ((i_10_ ^ 0xffffffff) == -3) {
                            Class74.anIntArrayArrayArray1336[i_14_]
                                    [1 + i_11_][i_9_]
                                    = Class70.method1335((Class74
                                    .anIntArrayArrayArray1336
                                    [i_14_][1 + i_11_]
                                    [i_9_]),
                                    1);
                            Class74.anIntArrayArrayArray1336[i_14_][i_11_]
                                    [i_9_]
                                    = Class70.method1335((Class74
                                    .anIntArrayArrayArray1336
                                    [i_14_][i_11_][i_9_]),
                                    2);
                        } else if ((i_10_ ^ 0xffffffff) == -4) {
                            Class74.anIntArrayArrayArray1336[i_14_][i_11_]
                                    [i_9_]
                                    = Class70.method1335((Class74
                                    .anIntArrayArrayArray1336
                                    [i_14_][i_11_][i_9_]),
                                    2);
                            Class74.anIntArrayArrayArray1336[i_14_][i_11_]
                                    [i_9_]
                                    = Class70.method1335((Class74
                                    .anIntArrayArrayArray1336
                                    [i_14_][i_11_][i_9_]),
                                    1);
                        }
                    } else {
                        Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_]
                                = Class70.method1335((Class74
                                .anIntArrayArrayArray1336
                                [i_14_][i_11_][i_9_]),
                                1);
                        Class74.anIntArrayArrayArray1336[i_14_][i_11_][(i_9_
                                + 1)]
                                = Class70.method1335((Class74
                                .anIntArrayArrayArray1336
                                [i_14_][i_11_][i_9_ + 1]),
                                2);
                    }
                }
                if ((class116.anInt2022 ^ 0xffffffff) != -1 && class38 != null)
                    class38.method461(i_10_, i_9_, class116.aBoolean2030,
                            i_12_, i_11_, (byte) -125);
                if (class116.anInt2025 != 16)
                    Class68_Sub13_Sub26.method830(i_14_, i_11_, i_9_,
                            class116.anInt2025);
            } else if ((i_12_ ^ 0xffffffff) == -4) {
                Animable class1;
                if ((class116.anInt2002 ^ 0xffffffff) == 0
                        && class116.anIntArray1994 == null) {
                    Class44 class44
                            = class116.method1702(3, null, bool_27_, (byte) -47,
                            bool_15_, i_25_, i_10_, is,
                            i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                } else
                    class1 = new Class1_Sub7(i_16_, 3, i_10_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                Class119.method1737(i_14_, i_11_, i_9_, i_25_, class1, null,
                        Class68_Sub20_Sub7.anIntArray4261[i_10_],
                        0, l);
                if (class116.aBoolean2027 && bool_15_) {
                    if (i_10_ != 0) {
                        if (i_10_ != 1) {
                            if ((i_10_ ^ 0xffffffff) != -3) {
                                if (i_10_ == 3)
                                    GroundData.aByteArrayArrayArray676[i_14_]
                                            [i_11_][i_9_]
                                            = (byte) 50;
                            } else
                                GroundData.aByteArrayArrayArray676[i_14_]
                                        [1 + i_11_][i_9_]
                                        = (byte) 50;
                        } else
                            GroundData.aByteArrayArrayArray676[i_14_]
                                    [i_11_ + 1][1 + i_9_]
                                    = (byte) 50;
                    } else
                        GroundData.aByteArrayArrayArray676[i_14_][i_11_][1 + i_9_]
                                = (byte) 50;
                }
                if (class116.anInt2022 != 0 && class38 != null)
                    class38.method461(i_10_, i_9_, class116.aBoolean2030,
                            i_12_, i_11_, (byte) -126);
            } else if (i_12_ == 9) {
                Animable class1;
                if ((class116.anInt2002 ^ 0xffffffff) != 0
                        || class116.anIntArray1994 != null)
                    class1 = new Class1_Sub7(i_16_, i_12_, i_10_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                else {
                    Class44 class44
                            = class116.method1702(i_12_, null, bool_27_,
                            (byte) -35, bool_15_, i_25_,
                            i_10_, is, i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                }
                Class3.method181(i_14_, i_11_, i_9_, i_25_, 1, 1, class1, 0,
                        l);
                if (class116.anInt2022 != 0 && class38 != null)
                    class38.method455(-87, class116.aBoolean2030, i_18_, i_17_,
                            i_11_, i_9_);
                if (class116.anInt2025 != 16)
                    Class68_Sub13_Sub26.method830(i_14_, i_11_, i_9_,
                            class116.anInt2025);
            } else if ((i_12_ ^ 0xffffffff) == -5) {
                Animable class1;
                if ((class116.anInt2002 ^ 0xffffffff) != 0
                        || class116.anIntArray1994 != null)
                    class1 = new Class1_Sub7(i_16_, 4, i_10_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                else {
                    Class44 class44
                            = class116.method1702(4, null, bool_27_, (byte) -32,
                            bool_15_, i_25_, i_10_, is,
                            i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                }
                Class23.method377(i_14_, i_11_, i_9_, i_25_, class1, null,
                        Class23.anIntArray498[i_10_], 0, 0, 0, l);
            } else if (i_12_ == 5) {
                int i_34_ = 16;
                long l_35_ = Class107.method1650(i_14_, i_11_, i_9_);
                if (l_35_ != 0L)
                    i_34_ = (Class1_Sub5.method140
                            (110, (int) (l_35_ >>> 2101198624) & 0x7fffffff)
                            .anInt2025);
                Animable class1;
                if (class116.anInt2002 == -1
                        && class116.anIntArray1994 == null) {
                    Class44 class44
                            = class116.method1702(4, null, bool_27_, (byte) -30,
                            bool_15_, i_25_, i_10_, is,
                            i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                } else
                    class1 = new Class1_Sub7(i_16_, 4, i_10_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                Class23.method377(i_14_, i_11_, i_9_, i_25_, class1, null,
                        Class23.anIntArray498[i_10_], 0,
                        (i_34_
                                * Class68_Sub20_Sub7.anIntArray4263[i_10_]),
                        Class115.anIntArray1950[i_10_] * i_34_, l);
            } else if (i_12_ == 6) {
                long l_36_ = Class107.method1650(i_14_, i_11_, i_9_);
                int i_37_ = 8;
                if ((l_36_ ^ 0xffffffffffffffffL) != -1L)
                    i_37_
                            = (Class1_Sub5.method140
                            (i + 122, 0x7fffffff & (int) (l_36_ >>> 427422752))
                            .anInt2025) / 2;
                Animable class1;
                if ((class116.anInt2002 ^ 0xffffffff) == 0
                        && class116.anIntArray1994 == null) {
                    Class44 class44
                            = class116.method1702(4, null, bool_27_, (byte) 127,
                            bool_15_, i_25_, i_10_ - -4, is,
                            i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                } else
                    class1 = new Class1_Sub7(i_16_, 4, i_10_ - -4, i_13_,
                            i_11_, i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                Class23.method377(i_14_, i_11_, i_9_, i_25_, class1, null, 256,
                        i_10_,
                        Class68_Sub13.anIntArray2920[i_10_] * i_37_,
                        (Class68_Sub13_Sub28.anIntArray3929[i_10_]
                                * i_37_),
                        l);
            } else if (i_12_ == 7) {
                int i_38_ = 0x3 & 2 + i_10_;
                Animable class1;
                if (class116.anInt2002 == -1
                        && class116.anIntArray1994 == null) {
                    Class44 class44
                            = class116.method1702(4, null, bool_27_, (byte) -48,
                            bool_15_, i_25_, 4 + i_38_, is,
                            i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                } else
                    class1 = new Class1_Sub7(i_16_, 4, i_38_ - -4, i_13_,
                            i_11_, i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                Class23.method377(i_14_, i_11_, i_9_, i_25_, class1, null, 256,
                        i_38_, 0, 0, l);
            } else if (i_12_ == 8) {
                int i_39_ = 8;
                int i_40_ = 0x3 & 2 + i_10_;
                long l_41_ = Class107.method1650(i_14_, i_11_, i_9_);
                if ((l_41_ ^ 0xffffffffffffffffL) != -1L)
                    i_39_ = (Class1_Sub5.method140
                            (106, 0x7fffffff & (int) (l_41_ >>> -1987366752))
                            .anInt2025) / 2;
                Animable class1;
                Animable class1_42_;
                if ((class116.anInt2002 ^ 0xffffffff) == 0
                        && class116.anIntArray1994 == null) {
                    Class44 class44
                            = class116.method1702(4, null, bool_27_, (byte) 125,
                            bool_15_, i_25_, i_10_ + 4, is,
                            i_23_, is_26_, i_24_);
                    class1 = class44.aClass1_746;
                    class44 = class116.method1702(4, null, bool_27_, (byte) -5,
                            bool_15_, i_25_, 4 + i_40_,
                            is, i_23_, is_26_, i_24_);
                    class1_42_ = class44.aClass1_746;
                } else {
                    class1 = new Class1_Sub7(i_16_, 4, i_10_ - -4, i_13_,
                            i_11_, i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                    class1_42_
                            = new Class1_Sub7(i_16_, 4, 4 + i_40_, i_13_, i_11_,
                            i_9_, class116.anInt2002,
                            class116.aBoolean1997, null);
                }
                Class23.method377(i_14_, i_11_, i_9_, i_25_, class1,
                        class1_42_, 256, i_10_,
                        Class68_Sub13.anIntArray2920[i_10_] * i_39_,
                        (Class68_Sub13_Sub28.anIntArray3929[i_10_]
                                * i_39_),
                        l);
            }
        }
    }

    public static boolean method1182(int i, int i_43_, int i_44_, int i_45_,
                                     int i_46_, int i_47_, int i_48_,
                                     int i_49_) {
        if (i_43_ < i_44_ && i_43_ < i_45_ && i_43_ < i_46_)
            return false;
        if (i_43_ > i_44_ && i_43_ > i_45_ && i_43_ > i_46_)
            return false;
        if (i < i_47_ && i < i_48_ && i < i_49_)
            return false;
        if (i > i_47_ && i > i_48_ && i > i_49_)
            return false;
        int i_50_ = ((i_43_ - i_44_) * (i_48_ - i_47_)
                - (i - i_47_) * (i_45_ - i_44_));
        int i_51_ = ((i_43_ - i_46_) * (i_47_ - i_49_)
                - (i - i_49_) * (i_44_ - i_46_));
        int i_52_ = ((i_43_ - i_45_) * (i_49_ - i_48_)
                - (i - i_48_) * (i_46_ - i_45_));
        if (i_50_ * i_52_ > 0 && i_52_ * i_51_ > 0)
            return true;
        return false;
    }

    static {
        aRSString_4435 = RSString.newRsString(")4a=");
    }
}
