/* Class68_Sub13_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub3 extends Class68_Sub13 {
    public static short aShort3464 = 205;
    public static int anInt3465;
    public static int anInt3466;
    public static RSString aRSString_3467;
    public static RSString aRSString_3468;
    public static RSString aRSString_3469 = RSString.newRsString(")4");
    public static int anInt3470;
    public int anInt3471 = 2048;
    public static RSString aRSString_3472;
    public static int anInt3473;
    public int anInt3474 = 1024;
    public static int anInt3475;
    public static int anInt3476;
    public static int anInt3477;
    public static int anInt3478;
    public static int[] anIntArray3479;
    public static RSString aRSString_3480;
    public static RSString aRSString_3481;
    public int anInt3482 = 3072;

    public int[][] method697(int i, boolean bool) {
        anInt3466++;
        if (bool != true)
            aRSString_3481 = null;
        int[][] is = aClass88_2939.method1496(i, (byte) -123);
        if (aClass88_2939.aBoolean1610) {
            int[][] is_0_ = this.method699(-20, 0, i);
            int[] is_1_ = is_0_[1];
            int[] is_2_ = is_0_[0];
            int[] is_3_ = is_0_[2];
            int[] is_4_ = is[0];
            int[] is_5_ = is[1];
            int[] is_6_ = is[2];
            for (int i_7_ = 0; Class68_Sub13_Sub19.anInt3746 > i_7_; i_7_++) {
                is_4_[i_7_]
                        = anInt3474 + (anInt3471 * is_2_[i_7_] >> -2082788436);
                is_5_[i_7_]
                        = (is_1_[i_7_] * anInt3471 >> 367066188) + anInt3474;
                is_6_[i_7_]
                        = anInt3474 + (anInt3471 * is_3_[i_7_] >> -1240396596);
            }
        }
        return is;
    }

    public Class68_Sub13_Sub3() {
        super(1, false);
    }

    public int[] method698(byte i, int i_8_) {
        if (i != -61)
            aRSString_3467 = null;
        anInt3470++;
        int[] is = aClass115_2936.method1697(false, i_8_);
        if (aClass115_2936.aBoolean1957) {
            int[] is_9_ = this.method696(0, i_8_, i ^ ~0x71e1);
            for (int i_10_ = 0; i_10_ < Class68_Sub13_Sub19.anInt3746; i_10_++)
                is[i_10_]
                        = anInt3474 - -(is_9_[i_10_] * anInt3471 >> -1474050068);
        }
        return is;
    }

    public static boolean method711(int i, int i_11_, int i_12_, int i_13_,
                                    int i_14_, boolean bool, int i_15_,
                                    int i_16_, boolean bool_17_, int i_18_,
                                    int i_19_, int i_20_) {
        for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -105; i_21_++) {
            for (int i_22_ = 0; i_22_ < 104; i_22_++) {
                Class68_Sub8.anIntArrayArray2873[i_21_][i_22_] = 0;
                Class116.anIntArrayArray2016[i_21_][i_22_] = 99999999;
            }
        }
        int i_23_ = i_19_;
        Class68_Sub8.anIntArrayArray2873[i_19_][i] = 99;
        Class116.anIntArrayArray2016[i_19_][i] = 0;
        anInt3476++;
        int i_24_ = i;
        int i_25_ = 0;
        int i_26_ = 0;
        Class68_Sub13_Sub37.anIntArray4066[i_25_] = i_19_;
        Class68_Sub13_Sub21.anIntArray3797[i_25_++] = i;
        int[][] is
                = Class109.aClass38Array1843[GameSocket.anInt1149].anIntArrayArray681;
        boolean bool_27_ = false;
        while ((i_26_ ^ 0xffffffff) != (i_25_ ^ 0xffffffff)) {
            i_23_ = Class68_Sub13_Sub37.anIntArray4066[i_26_];
            i_24_ = Class68_Sub13_Sub21.anIntArray3797[i_26_];
            i_26_ = 1 + i_26_ & 0xfff;
            if ((i_23_ ^ 0xffffffff) == (i_15_ ^ 0xffffffff)
                    && i_18_ == i_24_) {
                bool_27_ = true;
                break;
            }
            if (i_14_ != 0) {
                if ((i_14_ ^ 0xffffffff) <= -6 && (i_14_ ^ 0xffffffff) != -11
                        || !(Class109.aClass38Array1843[GameSocket.anInt1149]
                        .method459
                                (i_12_, i_15_, (byte) 108, i_23_, 2, i_18_, i_24_,
                                        i_14_ - 1))) {
                    if (i_14_ < 10 && (Class109.aClass38Array1843
                            [GameSocket.anInt1149].method462
                            (i_15_, i_23_, i_12_, (byte) 69, 2,
                                    i_18_, i_24_, i_14_ - 1))) {
                        bool_27_ = true;
                        break;
                    }
                } else {
                    bool_27_ = true;
                    break;
                }
            }
            if ((i_11_ ^ 0xffffffff) != -1 && (i_13_ ^ 0xffffffff) != -1
                    && (Class109.aClass38Array1843[GameSocket.anInt1149].method448
                    (15856, i_18_, 2, i_24_, i_13_, i_23_, i_20_, i_11_,
                            i_15_))) {
                bool_27_ = true;
                break;
            }
            int i_28_ = Class116.anIntArrayArray2016[i_23_][i_24_] - -1;
            if ((i_23_ ^ 0xffffffff) < -1
                    && (Class68_Sub8.anIntArrayArray2873[-1 + i_23_][i_24_]
                    ^ 0xffffffff) == -1
                    && (0x12c010e & is[i_23_ + -1][i_24_] ^ 0xffffffff) == -1
                    && (is[i_23_ - 1][1 + i_24_] & 0x12c0138) == 0) {
                Class68_Sub13_Sub37.anIntArray4066[i_25_] = -1 + i_23_;
                Class68_Sub13_Sub21.anIntArray3797[i_25_] = i_24_;
                Class68_Sub8.anIntArrayArray2873[i_23_ + -1][i_24_] = 2;
                Class116.anIntArrayArray2016[i_23_ + -1][i_24_] = i_28_;
                i_25_ = 0xfff & i_25_ - -1;
            }
            if (i_23_ < 102
                    && (Class68_Sub8.anIntArrayArray2873[i_23_ + 1][i_24_]
                    ^ 0xffffffff) == -1
                    && (0x12c0183 & is[i_23_ - -2][i_24_] ^ 0xffffffff) == -1
                    && ((is[2 + i_23_][i_24_ - -1] & 0x12c01e0 ^ 0xffffffff)
                    == -1)) {
                Class68_Sub13_Sub37.anIntArray4066[i_25_] = 1 + i_23_;
                Class68_Sub13_Sub21.anIntArray3797[i_25_] = i_24_;
                Class68_Sub8.anIntArrayArray2873[1 + i_23_][i_24_] = 8;
                Class116.anIntArrayArray2016[i_23_ - -1][i_24_] = i_28_;
                i_25_ = i_25_ + 1 & 0xfff;
            }
            if (i_24_ > 0
                    && (Class68_Sub8.anIntArrayArray2873[i_23_][i_24_ + -1]
                    ^ 0xffffffff) == -1
                    && (0x12c010e & is[i_23_][-1 + i_24_] ^ 0xffffffff) == -1
                    && (0x12c0183 & is[1 + i_23_][-1 + i_24_]) == 0) {
                Class68_Sub13_Sub37.anIntArray4066[i_25_] = i_23_;
                Class68_Sub13_Sub21.anIntArray3797[i_25_] = -1 + i_24_;
                Class68_Sub8.anIntArrayArray2873[i_23_][i_24_ - 1] = 1;
                i_25_ = 0xfff & 1 + i_25_;
                Class116.anIntArrayArray2016[i_23_][-1 + i_24_] = i_28_;
            }
            if ((i_24_ ^ 0xffffffff) > -103
                    && Class68_Sub8.anIntArrayArray2873[i_23_][1 + i_24_] == 0
                    && (is[i_23_][i_24_ + 2] & 0x12c0138 ^ 0xffffffff) == -1
                    && (0x12c01e0 & is[1 + i_23_][i_24_ + 2]) == 0) {
                Class68_Sub13_Sub37.anIntArray4066[i_25_] = i_23_;
                Class68_Sub13_Sub21.anIntArray3797[i_25_] = 1 + i_24_;
                Class68_Sub8.anIntArrayArray2873[i_23_][1 + i_24_] = 4;
                Class116.anIntArrayArray2016[i_23_][1 + i_24_] = i_28_;
                i_25_ = i_25_ + 1 & 0xfff;
            }
            if ((i_23_ ^ 0xffffffff) < -1 && i_24_ > 0
                    && (Class68_Sub8.anIntArrayArray2873[i_23_ + -1][-1 + i_24_]
                    == 0)
                    && (0x12c0138 & is[-1 + i_23_][i_24_]) == 0
                    && (is[i_23_ + -1][i_24_ - 1] & 0x12c010e ^ 0xffffffff) == -1
                    && (is[i_23_][-1 + i_24_] & 0x12c0183) == 0) {
                Class68_Sub13_Sub37.anIntArray4066[i_25_] = i_23_ - 1;
                Class68_Sub13_Sub21.anIntArray3797[i_25_] = i_24_ - 1;
                i_25_ = 0xfff & i_25_ - -1;
                Class68_Sub8.anIntArrayArray2873[-1 + i_23_][i_24_ + -1] = 3;
                Class116.anIntArrayArray2016[i_23_ + -1][i_24_ + -1] = i_28_;
            }
            if ((i_23_ ^ 0xffffffff) > -103 && (i_24_ ^ 0xffffffff) < -1
                    && Class68_Sub8.anIntArrayArray2873[i_23_ + 1][-1 + i_24_] == 0
                    && (0x12c010e & is[1 + i_23_][-1 + i_24_]) == 0
                    && (0x12c0183 & is[2 + i_23_][i_24_ + -1]) == 0
                    && (0x12c01e0 & is[2 + i_23_][i_24_]) == 0) {
                Class68_Sub13_Sub37.anIntArray4066[i_25_] = 1 + i_23_;
                Class68_Sub13_Sub21.anIntArray3797[i_25_] = -1 + i_24_;
                Class68_Sub8.anIntArrayArray2873[1 + i_23_][i_24_ - 1] = 9;
                i_25_ = i_25_ + 1 & 0xfff;
                Class116.anIntArrayArray2016[i_23_ + 1][-1 + i_24_] = i_28_;
            }
            if (i_23_ > 0 && (i_24_ ^ 0xffffffff) > -103
                    && Class68_Sub8.anIntArrayArray2873[i_23_ + -1][1 + i_24_] == 0
                    && (is[-1 + i_23_][1 + i_24_] & 0x12c010e ^ 0xffffffff) == -1
                    && (0x12c0138 & is[i_23_ + -1][i_24_ + 2] ^ 0xffffffff) == -1
                    && (is[i_23_][2 + i_24_] & 0x12c01e0 ^ 0xffffffff) == -1) {
                Class68_Sub13_Sub37.anIntArray4066[i_25_] = -1 + i_23_;
                Class68_Sub13_Sub21.anIntArray3797[i_25_] = 1 + i_24_;
                Class68_Sub8.anIntArrayArray2873[i_23_ - 1][1 + i_24_] = 6;
                i_25_ = 0xfff & 1 + i_25_;
                Class116.anIntArrayArray2016[-1 + i_23_][1 + i_24_] = i_28_;
            }
            if ((i_23_ ^ 0xffffffff) > -103 && (i_24_ ^ 0xffffffff) > -103
                    && Class68_Sub8.anIntArrayArray2873[i_23_ + 1][i_24_ - -1] == 0
                    && (0x12c0138 & is[i_23_ + 1][2 + i_24_] ^ 0xffffffff) == -1
                    && (is[2 + i_23_][i_24_ - -2] & 0x12c01e0) == 0
                    && (is[2 + i_23_][1 + i_24_] & 0x12c0183 ^ 0xffffffff) == -1) {
                Class68_Sub13_Sub37.anIntArray4066[i_25_] = i_23_ - -1;
                Class68_Sub13_Sub21.anIntArray3797[i_25_] = i_24_ + 1;
                Class68_Sub8.anIntArrayArray2873[i_23_ - -1][1 + i_24_] = 12;
                Class116.anIntArrayArray2016[i_23_ - -1][i_24_ + 1] = i_28_;
                i_25_ = 1 + i_25_ & 0xfff;
            }
        }
        Class32.anInt565 = 0;
        if (!bool_27_) {
            if (!bool)
                return false;
            int i_29_ = 1000;
            int i_30_ = 10;
            int i_31_ = 100;
            for (int i_32_ = -i_30_ + i_15_;
                 (i_32_ ^ 0xffffffff) >= (i_30_ + i_15_ ^ 0xffffffff);
                 i_32_++) {
                for (int i_33_ = i_18_ - i_30_;
                     (i_33_ ^ 0xffffffff) >= (i_30_ + i_18_ ^ 0xffffffff);
                     i_33_++) {
                    if ((i_32_ ^ 0xffffffff) <= -1 && i_33_ >= 0 && i_32_ < 104
                            && i_33_ < 104
                            && Class116.anIntArrayArray2016[i_32_][i_33_] < 100) {
                        int i_34_ = 0;
                        if ((i_15_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff))
                            i_34_ = i_15_ - i_32_;
                        else if ((i_32_ ^ 0xffffffff)
                                < (i_15_ - -i_11_ - 1 ^ 0xffffffff))
                            i_34_ = -i_15_ + (-i_11_ + 1 + i_32_);
                        int i_35_ = 0;
                        if ((i_33_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff))
                            i_35_ = -i_33_ + i_18_;
                        else if (-1 + (i_13_ + i_18_) < i_33_)
                            i_35_ = i_33_ + (-i_13_ + -i_18_) + 1;
                        int i_36_ = i_34_ * i_34_ + i_35_ * i_35_;
                        if (i_29_ > i_36_
                                || ((i_29_ ^ 0xffffffff) == (i_36_ ^ 0xffffffff)
                                && ((i_31_ ^ 0xffffffff)
                                < ((Class116.anIntArrayArray2016[i_32_]
                                [i_33_])
                                ^ 0xffffffff)))) {
                            i_24_ = i_33_;
                            i_23_ = i_32_;
                            i_31_ = Class116.anIntArrayArray2016[i_32_][i_33_];
                            i_29_ = i_36_;
                        }
                    }
                }
            }
            if ((i_29_ ^ 0xffffffff) == -1001)
                return false;
            if ((i_19_ ^ 0xffffffff) == (i_23_ ^ 0xffffffff) && i_24_ == i)
                return false;
            Class32.anInt565 = 1;
        }
        i_26_ = 0;
        Class68_Sub13_Sub37.anIntArray4066[i_26_] = i_23_;
        if (bool_17_ != true)
            aRSString_3481 = null;
        Class68_Sub13_Sub21.anIntArray3797[i_26_++] = i_24_;
        int i_38_;
        int i_37_ = i_38_ = Class68_Sub8.anIntArrayArray2873[i_23_][i_24_];
        while ((i_19_ ^ 0xffffffff) != (i_23_ ^ 0xffffffff)
                || (i ^ 0xffffffff) != (i_24_ ^ 0xffffffff)) {
            if ((i_38_ ^ 0xffffffff) != (i_37_ ^ 0xffffffff)) {
                i_38_ = i_37_;
                Class68_Sub13_Sub37.anIntArray4066[i_26_] = i_23_;
                Class68_Sub13_Sub21.anIntArray3797[i_26_++] = i_24_;
            }
            if ((i_37_ & 0x1 ^ 0xffffffff) != -1)
                i_24_++;
            else if ((i_37_ & 0x4) != 0)
                i_24_--;
            if ((i_37_ & 0x2 ^ 0xffffffff) != -1)
                i_23_++;
            else if ((i_37_ & 0x8) != 0)
                i_23_--;
            i_37_ = Class68_Sub8.anIntArrayArray2873[i_23_][i_24_];
        }
        if ((i_26_ ^ 0xffffffff) < -1) {
            Class58.method580(i_26_, i_16_, (byte) 125);
            return true;
        }
        if (i_16_ == 1)
            return false;
        return true;
    }

    public void method690(byte i) {
        anInt3465++;
        if (i > -22)
            anInt3482 = -76;
        anInt3471 = anInt3482 + -anInt3474;
    }

    public static void method712(int i) {
        aRSString_3481 = null;
        if (i != 9927)
            aRSString_3469 = null;
        anIntArray3479 = null;
        aRSString_3480 = null;
        aRSString_3467 = null;
        aRSString_3472 = null;
        aRSString_3469 = null;
        aRSString_3468 = null;
    }

    public static boolean method713
            (int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_,
             int i_44_, boolean bool, int i_45_, int i_46_, int i_47_, int i_48_) {
        anInt3475++;
        if (i_46_
                == (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2544 ^ 0xffffffff))
            return method711(i_41_, i_43_, i, i_42_, i_39_, bool, i_48_, i_47_,
                    true, i_44_, i_40_, i_45_);
        if ((Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2544 ^ 0xffffffff) < -3)
            return Class68_Sub15.method978(bool, i_40_, i_44_, i_47_, i_42_, i,
                    i_43_, (byte) 121, i_48_, i_41_,
                    i_39_, i_45_,
                    (Class68_Sub7.aClass1_Sub6_Sub2_2860
                            .anInt2544));
        return Class68_Sub20_Sub11.method1141(i_44_, i_43_, i_39_, i_42_,
                i_41_, i_48_, (byte) 36, i_47_,
                i, i_40_, i_45_, bool);
    }

    public void method700(Stream class68_sub14, int i, int i_49_) {
        int i_50_ = i;
        while_0_:
        do {
            do {
                if ((i_50_ ^ 0xffffffff) != -1) {
                    if (i_50_ != 1) {
                        if (i_50_ == 2)
                            break;
                        break while_0_;
                    }
                } else {
                    anInt3474 = class68_sub14.readUnsignedWord(i_49_ ^ ~0x50cf66c8);
                    break while_0_;
                }
                anInt3482 = class68_sub14.readUnsignedWord(i_49_ + 1355769545);
                break while_0_;
            } while (false);
            aBoolean2931 = class68_sub14.readUnsignedByte(-6677) == 1;
        } while (false);
        anInt3478++;
        if (i_49_ != -1)
            method700(null, -25, 117);
    }

    static {
        aRSString_3467 = RSString.newRsString("");
        aRSString_3480 = RSString.newRsString("Null");
        aRSString_3481 = RSString.newRsString("yellow:");
        aRSString_3468 = aRSString_3481;
        aRSString_3472 = aRSString_3481;
    }
}
