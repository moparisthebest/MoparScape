/* Class1_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class1_Sub6 extends Animable {
    public static int anInt2517;
    public int anInt2518;
    public int anInt2519;
    public int anInt2520;
    public int anInt2521;
    public int anInt2522;
    public int[] anIntArray2523;
    public int anInt2524;
    public int anInt2525 = -1;
    public int anInt2526;
    public static int anInt2527;
    public static int anInt2528;
    public static Class93[] aClass93Array2529;
    public int anInt2530;
    public static int anInt2531;
    public int anInt2532;
    public int anInt2533;
    public int anInt2534;
    public int anInt2535;
    public static int anInt2536;
    public int anInt2537;
    public static RSString aRSString_2538
            = RSString.newRsString("Select a world");
    public int anInt2539 = 0;
    public int anInt2540;
    public int anInt2541;
    public int anInt2542;
    public int anInt2543;
    public int anInt2544;
    public int anInt2545;
    public boolean[] aBooleanArray2546;
    public int anInt2547;
    public int anInt2548;
    public int anInt2549;
    public int anInt2550;
    public static int anInt2551;
    public int anInt2552;
    public static int anInt2553;
    public int[] anIntArray2554;
    public int anInt2555;
    public int anInt2556;
    public int anInt2557;
    public static Class92_Sub1[] aClass92_Sub1Array2558;
    public int anInt2559;
    public int anInt2560;
    public int anInt2561;
    public int anInt2562;
    public int anInt2563;
    public int anInt2564;
    public int anInt2565;
    public int anInt2566;
    public static int anInt2567;
    public int anInt2568;
    public int anInt2569;
    public int[] anIntArray2570;
    public int[] anIntArray2571;
    public int anInt2572;
    public static RSString aRSString_2573;
    public int anInt2574;
    public int anInt2575;
    public RSString aRSString_2576;
    public int anInt2577;
    public int anInt2578;
    public int anInt2579;
    public int[] anIntArray2580;
    public int anInt2581;
    public int anInt2582;
    public boolean aBoolean2583;
    public static RSString aRSString_2584
            = RSString.newRsString("hitbar_default");
    public static long aLong2585;
    public int anInt2586;
    public static int anInt2587;
    public int anInt2588;
    public static int anInt2589;

    public static void method144(int i, int i_0_, int i_1_, boolean bool,
                                 int i_2_, int i_3_, int i_4_, int i_5_,
                                 int i_6_, int i_7_, int i_8_) {
        anInt2567++;
        if (bool != true)
            aLong2585 = -83L;
        int i_9_ = i_1_ - i_8_;
        if (i_1_ < Class68_Sub6.anInt2846)
            i_9_++;
        int i_10_ = -i_6_ + i_4_;
        if ((i_4_ ^ 0xffffffff) > (Class103.anInt1768 ^ 0xffffffff))
            i_10_++;
        for (int i_11_ = 0; i_9_ > i_11_; i_11_++) {
            int i_12_ = i * i_11_ + i_3_ >> -585219248;
            int i_13_ = (1 + i_11_) * i + i_3_ >> -291039376;
            int i_14_ = -i_12_ + i_13_;
            if ((i_14_ ^ 0xffffffff) < -1) {
                int i_15_ = i_11_ + i_8_ >> 2018114854;
                if (i_15_ < 0
                        || ((i_15_ ^ 0xffffffff)
                        < (-1 + Class33.anIntArrayArrayArray584.length
                        ^ 0xffffffff))) {
                    i_12_ += i_7_;
                    for (int i_16_ = 0; i_16_ < i_10_; i_16_++) {
                        int i_17_;
                        if ((Class30.aClass68_Sub20_Sub16_540.anInt4409
                                ^ 0xffffffff)
                                != 0)
                            i_17_ = Class30.aClass68_Sub20_Sub16_540.anInt4409;
                        else if ((0x4 & i_8_ + i_11_) != (i_16_ - -i_6_ & 0x4))
                            i_17_ = 4936552;
                        else
                            i_17_ = (Class121.anIntArray2104
                                    [Class68_Sub9.anInt2891 + 1]);
                        if ((i_17_ ^ 0xffffffff) == -1)
                            i_17_ = 1;
                        int i_18_ = (i_16_ * i_0_ + i_2_ >> 472557872) + i_5_;
                        int i_19_ = ((i_2_ + (1 + i_16_) * i_0_ >> 1252340496)
                                - -i_5_);
                        int i_20_ = -i_18_ + i_19_;
                        Class79.method1439(i_12_, i_18_, i_14_, i_20_, i_17_);
                    }
                    i_13_ += i_7_;
                } else {
                    i_12_ += i_7_;
                    i_13_ += i_7_;
                    byte[][] is = Class12.aByteArrayArrayArray212[i_15_];
                    int[][] is_21_ = Class33.anIntArrayArrayArray584[i_15_];
                    byte[][] is_22_ = Class48.aByteArrayArrayArray949[i_15_];
                    byte[][] is_23_ = Class49.aByteArrayArrayArray970[i_15_];
                    byte[][] is_24_
                            = Class68_Sub13_Sub16.aByteArrayArrayArray3710[i_15_];
                    byte[][] is_25_
                            = Class68_Sub13_Sub11.aByteArrayArrayArray3622[i_15_];
                    int i_26_ = 0;
                    for (/**/; (i_10_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff);
                             i_26_++) {
                        int i_27_ = i_26_ * i_0_ + i_2_ >> 92119376;
                        int i_28_ = i_0_ * (i_26_ - -1) + i_2_ >> 1999918128;
                        int i_29_ = i_28_ - i_27_;
                        if (i_29_ > 0) {
                            i_28_ += i_5_;
                            i_27_ += i_5_;
                            int i_30_ = i_6_ + i_26_ >> -121594938;
                            int i_31_ = 0x3f & i_11_ + i_8_;
                            int i_32_ = 0x3f & i_6_ + i_26_;
                            int i_33_ = (i_32_ << -947924250) - -i_31_;
                            int i_34_;
                            if (i_30_ >= 0
                                    && ((is_21_.length + -1 ^ 0xffffffff)
                                    <= (i_30_ ^ 0xffffffff))
                                    && is_21_[i_30_] != null)
                                i_34_ = is_21_[i_30_][i_33_];
                            else {
                                if ((Class30.aClass68_Sub20_Sub16_540.anInt4409
                                        ^ 0xffffffff)
                                        != 0)
                                    i_34_ = (Class30.aClass68_Sub20_Sub16_540
                                            .anInt4409);
                                else if ((i_8_ + i_11_ & 0x4)
                                        != (0x4 & i_6_ + i_26_))
                                    i_34_ = 4936552;
                                else
                                    i_34_ = (Class121.anIntArray2104
                                            [Class68_Sub9.anInt2891 - -1]);
                                if (i_30_ < 0 || is_21_.length + -1 < i_30_) {
                                    if (i_34_ == 0)
                                        i_34_ = 1;
                                    Class79.method1439(i_12_, i_27_, i_14_,
                                            i_29_, i_34_);
                                    continue;
                                }
                            }
                            if (i_34_ == 0)
                                i_34_ = 1;
                            int i_35_ = (is_22_[i_30_] == null ? 0
                                    : (Class121.anIntArray2104
                                    [is_22_[i_30_][i_33_] & 0xff]));
                            int i_36_ = (is[i_30_] != null
                                    ? (Class121.anIntArray2104
                                    [is[i_30_][i_33_] & 0xff])
                                    : 0);
                            if (i_36_ == 0 && i_35_ == 0)
                                Class79.method1439(i_12_, i_27_, i_14_, i_29_,
                                        i_34_);
                            else {
                                if ((i_36_ ^ 0xffffffff) != -1) {
                                    if ((i_36_ ^ 0xffffffff) == 0)
                                        i_36_ = 1;
                                    int i_37_
                                            = (is_24_[i_30_] == null ? (int) 0
                                            : is_24_[i_30_][i_33_]);
                                    int i_38_ = i_37_ & 0xfc;
                                    if ((i_38_ ^ 0xffffffff) == -1
                                            || i_14_ <= 1 || i_29_ <= 1)
                                        Class79.method1439(i_12_, i_27_, i_14_,
                                                i_29_, i_36_);
                                    else
                                        Class55.method1724
                                                (i_38_ >> -1828439646, i_14_, true,
                                                        i_29_, i_34_, i_36_,
                                                        Class79.anIntArray1402, i_12_,
                                                        i_27_, 0x3 & i_37_, 2);
                                }
                                if ((i_35_ ^ 0xffffffff) != -1) {
                                    int i_39_ = is_23_[i_30_][i_33_];
                                    int i_40_ = 0xfc & i_39_;
                                    if ((i_35_ ^ 0xffffffff) == 0)
                                        i_35_ = i_34_;
                                    if (i_40_ == 0
                                            || (i_14_ ^ 0xffffffff) >= -2
                                            || i_29_ <= 1)
                                        Class79.method1439(i_12_, i_27_, i_14_,
                                                i_29_, i_35_);
                                    Class55.method1724(i_40_ >> 55536706,
                                            i_14_,
                                            ((i_36_ ^ 0xffffffff)
                                                    == -1),
                                            i_29_, 0, i_35_,
                                            Class79.anIntArray1402,
                                            i_12_, i_27_,
                                            i_39_ & 0x3, 2);
                                }
                            }
                            if (is_25_[i_30_] != null) {
                                int i_41_ = 0xff & is_25_[i_30_][i_33_];
                                if (i_41_ != 0) {
                                    int i_42_;
                                    if ((i_14_ ^ 0xffffffff) != -2)
                                        i_42_ = i_13_ - 1;
                                    else
                                        i_42_ = i_12_;
                                    int i_43_;
                                    if (i_29_ == 1)
                                        i_43_ = i_27_;
                                    else
                                        i_43_ = i_28_ - 1;
                                    int i_44_ = 13421772;
                                    if (((i_41_ ^ 0xffffffff) <= -6
                                            && (i_41_ ^ 0xffffffff) >= -9)
                                            || ((i_41_ ^ 0xffffffff) <= -14
                                            && (i_41_ ^ 0xffffffff) >= -17)
                                            || (i_41_ >= 21
                                            && (i_41_ ^ 0xffffffff) >= -25)
                                            || i_41_ == 27 || i_41_ == 28) {
                                        i_44_ = 13369344;
                                        i_41_ -= 4;
                                    }
                                    if (i_41_ == 1)
                                        Class79.method1431(i_12_, i_27_, i_29_,
                                                i_44_);
                                    else if ((i_41_ ^ 0xffffffff) != -3) {
                                        if ((i_41_ ^ 0xffffffff) == -4)
                                            Class79.method1431(i_42_, i_27_,
                                                    i_29_, i_44_);
                                        else if (i_41_ != 4) {
                                            if ((i_41_ ^ 0xffffffff) != -10) {
                                                if (i_41_ == 10) {
                                                    Class79.method1431
                                                            (i_42_, i_27_, i_29_,
                                                                    16777215);
                                                    Class79.method1428(i_12_,
                                                            i_27_,
                                                            i_14_,
                                                            i_44_);
                                                } else if (i_41_ == 11) {
                                                    Class79.method1431
                                                            (i_42_, i_27_, i_29_,
                                                                    16777215);
                                                    Class79.method1428(i_12_,
                                                            i_43_,
                                                            i_14_,
                                                            i_44_);
                                                } else if (i_41_ != 12) {
                                                    if ((i_41_ ^ 0xffffffff)
                                                            == -18)
                                                        Class79.method1428
                                                                (i_12_, i_27_, 1,
                                                                        i_44_);
                                                    else if (i_41_ == 18)
                                                        Class79.method1428
                                                                (i_42_, i_27_, 1,
                                                                        i_44_);
                                                    else if (i_41_ == 19)
                                                        Class79.method1428
                                                                (i_42_, i_43_, 1,
                                                                        i_44_);
                                                    else if ((i_41_
                                                            ^ 0xffffffff)
                                                            == -21)
                                                        Class79.method1428
                                                                (i_12_, i_43_, 1,
                                                                        i_44_);
                                                    else if (i_41_ != 25) {
                                                        if (i_41_ == 26) {
                                                            for (int i_45_ = 0;
                                                                 i_29_ > i_45_;
                                                                 i_45_++)
                                                                Class79
                                                                        .method1428
                                                                                ((i_45_
                                                                                        + i_12_),
                                                                                        (i_45_
                                                                                                + i_27_),
                                                                                        1, i_44_);
                                                        }
                                                    } else {
                                                        for (int i_46_ = 0;
                                                             i_46_ < i_29_;
                                                             i_46_++)
                                                            Class79.method1428
                                                                    ((i_12_
                                                                            - -i_46_),
                                                                            (i_43_
                                                                                    + -i_46_),
                                                                            1, i_44_);
                                                    }
                                                } else {
                                                    Class79.method1431
                                                            (i_12_, i_27_, i_29_,
                                                                    16777215);
                                                    Class79.method1428(i_12_,
                                                            i_43_,
                                                            i_14_,
                                                            i_44_);
                                                }
                                            } else {
                                                Class79.method1431(i_12_,
                                                        i_27_,
                                                        i_29_,
                                                        16777215);
                                                Class79.method1428(i_12_,
                                                        i_27_,
                                                        i_14_,
                                                        i_44_);
                                            }
                                        } else
                                            Class79.method1428(i_12_, i_43_,
                                                    i_14_, i_44_);
                                    } else
                                        Class79.method1428(i_12_, i_27_, i_14_,
                                                i_44_);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i_47_ = -2; (i_9_ - -2 ^ 0xffffffff) < (i_47_ ^ 0xffffffff);
             i_47_++) {
            int i_48_ = i_3_ + i_47_ * i >> -1818531984;
            int i_49_ = i_3_ - -(i * (i_47_ - -1)) >> -525654480;
            int i_50_ = i_49_ + -i_48_;
            if ((i_50_ ^ 0xffffffff) < -1) {
                i_48_ += i_7_;
                int i_51_ = i_8_ + i_47_ >> -381628986;
                i_49_ += i_7_;
                if ((i_51_ ^ 0xffffffff) <= -1
                        && ((Class68_Sub13_Sub11.aShortArrayArrayArray3626.length
                        + -1)
                        ^ 0xffffffff) <= (i_51_ ^ 0xffffffff)) {
                    short[][] is
                            = Class68_Sub13_Sub11.aShortArrayArrayArray3626[i_51_];
                    for (int i_52_ = -2;
                         (2 + i_10_ ^ 0xffffffff) < (i_52_ ^ 0xffffffff);
                         i_52_++) {
                        int i_53_ = i_2_ + i_52_ * i_0_ >> -1561565936;
                        int i_54_ = i_2_ + i_0_ * (i_52_ + 1) >> -1290227504;
                        int i_55_ = -i_53_ + i_54_;
                        if (i_55_ > 0) {
                            i_54_ += i_5_;
                            i_53_ += i_5_;
                            int i_56_ = i_6_ + i_52_ >> 478924902;
                            if (i_56_ >= 0 && -1 + is.length >= i_56_) {
                                int i_57_
                                        = ((0x3f & i_8_ + i_47_)
                                        + ((0x3f & i_52_ - -i_6_) << 79829542));
                                if (is[i_56_] != null) {
                                    int i_58_ = 0x3fff & is[i_56_][i_57_];
                                    int i_59_
                                            = (0x3
                                            & is[i_56_][i_57_] >> -1163430578);
                                    if (i_58_ != 0) {
                                        if (i_59_ == 0)
                                            Class68_Sub19
                                                    .aClass92_Sub1Array3069
                                                    [-1 + i_58_].method1538
                                                    (i_48_, i_53_, i_50_ * 2,
                                                            i_55_ * 2);
                                        else if ((i_59_ ^ 0xffffffff) == -2)
                                            Class68_Sub13_Sub2
                                                    .aClass92_Sub1Array3463
                                                    [i_58_ - 1].method1538
                                                    (i_48_, i_53_, 2 * i_50_,
                                                            i_55_ * 2);
                                        else if (i_59_ == 2)
                                            Class68_Sub13_Sub31
                                                    .aClass92_Sub1Array3973
                                                    [i_58_ - 1].method1538
                                                    (i_48_, i_53_, i_50_ * 2,
                                                            2 * i_55_);
                                        else if ((i_59_ ^ 0xffffffff) == -4)
                                            aClass92_Sub1Array2558
                                                    [-1 + i_58_].method1538
                                                    (i_48_, i_53_, i_50_ * 2,
                                                            2 * i_55_);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method145(int i) {
        aRSString_2584 = null;
        aRSString_2573 = null;
        aClass93Array2529 = null;
        aClass92_Sub1Array2558 = null;
        if (i != 2)
            method148(-100, 10);
        aRSString_2538 = null;
    }

    public static int method146(int i, int i_60_) {
        if (i <= 79)
            aRSString_2573 = null;
        anInt2553++;
        return i_60_ & 0xff;
    }

    public void method147(int i, byte i_61_, int i_62_, boolean bool) {
        anInt2531++;
        if ((anInt2568 ^ 0xffffffff) != 0
                && (Class64.method624((byte) -36, anInt2568).anInt2039
                ^ 0xffffffff) == -2)
            anInt2568 = -1;
        if (!bool) {
            int i_63_ = -anIntArray2523[0] + i_62_;
            int i_64_ = -anIntArray2570[0] + i;
            if ((i_63_ ^ 0xffffffff) <= 7 && i_63_ <= 8
                    && (i_64_ ^ 0xffffffff) <= 7 && (i_64_ ^ 0xffffffff) >= -9) {
                if (anInt2579 < 9)
                    anInt2579++;
                for (int i_65_ = anInt2579; (i_65_ ^ 0xffffffff) < -1;
                     i_65_--) {
                    anIntArray2523[i_65_] = anIntArray2523[i_65_ + -1];
                    anIntArray2570[i_65_] = anIntArray2570[i_65_ + -1];
                    aBooleanArray2546[i_65_] = aBooleanArray2546[i_65_ + -1];
                }
                anIntArray2523[0] = i_62_;
                anIntArray2570[0] = i;
                aBooleanArray2546[0] = false;
                return;
            }
        }
        anInt2579 = 0;
        anInt2520 = 0;
        if (i_61_ == -68) {
            anInt2557 = 0;
            anIntArray2523[0] = i_62_;
            anIntArray2570[0] = i;
            anInt2561 = anIntArray2523[0] * 128 + anInt2544 * 64;
            anInt2537 = anIntArray2570[0] * 128 - -(64 * anInt2544);
        }
    }

    public static int method148(int i, int i_66_) {
        if (i_66_ > -73)
            aClass93Array2529 = null;
        anInt2589++;
        return i >>> -685042969;
    }

    public void method149(int i, boolean bool, int i_67_, int i_68_) {
        anInt2517++;
        for (int i_69_ = 0; (i_69_ ^ 0xffffffff) > -5; i_69_++) {
            if (i_67_ >= anIntArray2580[i_69_]) {
                anIntArray2554[i_69_] = i;
                anIntArray2571[i_69_] = i_68_;
                anIntArray2580[i_69_] = 70 + i_67_;
                return;
            }
        }
        if (bool != false)
            anInt2522 = 9;
    }

    public boolean method150(int i) {
        anInt2587++;
        if (i < 14)
            anInt2537 = 101;
        return false;
    }

    public void method151(boolean bool, int i, byte i_70_) {
        anInt2528++;
        int placeY = anIntArray2523[0]; // y
        int placeX = anIntArray2570[0]; // x
        if (i_70_ == 21) {
            if (anInt2568 != -1 && Class64.method624((byte) -36, anInt2568).anInt2039 == 1)
                anInt2568 = -1;
            if (anInt2579 < 9)
                anInt2579++;
            if (i == 0) {
                placeX++;
                placeY--;
            }
            for (int i_73_ = anInt2579; i_73_ > 0; i_73_--) {
                anIntArray2523[i_73_] = anIntArray2523[-1 + i_73_];
                anIntArray2570[i_73_] = anIntArray2570[i_73_ - 1];
                aBooleanArray2546[i_73_] = aBooleanArray2546[-1 + i_73_];
            }
            if (i == 1)
                placeX++;
            if (i == 2) {
                placeX++;
                placeY++;
            }
            aBooleanArray2546[0] = bool;
            if (i == 3)
                placeY--;
            if (i == 4)
                placeY++;
            if (i == 5) {
                placeY--;
                placeX--;
            }
            if (i == 6)
                placeX--;
            if (i == 7) {
                placeY++;
                placeX--;
            }
            anIntArray2523[0] = placeY;
            anIntArray2570[0] = placeX;
        }
    }

    public int method152(byte i) {
        anInt2527++;
        int i_74_ = 85 % ((i - -64) / 45);
        if (anInt2566 == -32768)
            return 200;
        return -anInt2566;
    }

    public void method153(int i) {
        anInt2551++;
        anInt2579 = i;
        anInt2557 = 0;
    }

    public Class1_Sub6() {
        anInt2532 = -1;
        anInt2535 = 0;
        anInt2543 = -1;
        anInt2545 = 0;
        anIntArray2523 = new int[10];
        anInt2524 = -1;
        anInt2555 = 0;
        anInt2522 = 0;
        anInt2549 = 0;
        anIntArray2554 = new int[4];
        anInt2520 = 0;
        anInt2557 = 0;
        anInt2544 = 1;
        anInt2530 = -1;
        anIntArray2570 = new int[10];
        anIntArray2571 = new int[4];
        anInt2534 = -1000;
        anInt2577 = 0;
        anInt2574 = -1;
        anInt2562 = 0;
        anInt2572 = 0;
        anInt2569 = 100;
        anInt2552 = -1;
        aRSString_2576 = null;
        anInt2568 = -1;
        anInt2564 = -1;
        anInt2563 = -1;
        aBooleanArray2546 = new boolean[10];
        anInt2581 = 32;
        anInt2579 = 0;
        anInt2556 = 0;
        anInt2566 = -32768;
        aBoolean2583 = false;
        anInt2586 = 0;
        anInt2540 = -1;
        anInt2578 = 0;
        anIntArray2580 = new int[4];
        anInt2575 = 0;
        anInt2565 = -1;
        anInt2526 = 0;
    }

    static {
        aRSString_2573 = aRSString_2538;
    }
}
