/* Class68_Sub13_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

public class Class68_Sub13_Sub27 extends Class68_Sub13 {
    public static int anInt3887;
    public int anInt3888;
    public static int anInt3889;
    public static int anInt3890;
    public static int anInt3891;
    public int anInt3892 = 1024;
    public static Class98 aClass98_3893;
    public int anInt3894 = 2048;
    public static int anInt3895;
    public int anInt3896;
    public int anInt3897 = 1024;
    public int anInt3898;
    public int anInt3899 = 0;
    public static int anInt3900;
    public static RSString aRSString_3901;
    public static RSString aRSString_3902 = RSString.newRsString("<img=0>");
    public static int anInt3903;
    public static int anInt3904;
    public static byte[][] aByteArrayArray3905;
    public int anInt3906;
    public int anInt3907;
    public int anInt3908;
    public static int anInt3909;
    public static int anInt3910;
    public static int anInt3911;
    public static Class65 aClass65_3912;
    public static float aFloat3913;
    public static int anInt3914;
    public static int anInt3915;
    public static RSString[] aRSStringArray3916;

    public static int method836(int i) {
        if (i != 0)
            return 29;
        anInt3895++;
        return 16;
    }

    public void method700(Stream class68_sub14, int i, int i_0_) {
        anInt3910++;
        int i_1_ = i;
        while_122_:
        do {
            while_121_:
            do {
                while_120_:
                do {
                    while_119_:
                    do {
                        while_118_:
                        do {
                            while_117_:
                            do {
                                while_116_:
                                do {
                                    do {
                                        if ((i_1_ ^ 0xffffffff) != -1) {
                                            if (i_1_ != 1) {
                                                if ((i_1_ ^ 0xffffffff)
                                                        != -3) {
                                                    if ((i_1_ ^ 0xffffffff)
                                                            != -4) {
                                                        if (i_1_ != 4) {
                                                            if (i_1_ != 5) {
                                                                if (i_1_
                                                                        != 6) {
                                                                    if (i_1_
                                                                            != 7) {
                                                                        if (i_1_
                                                                                == 8)
                                                                            break while_121_;
                                                                        break while_122_;
                                                                    }
                                                                } else
                                                                    break while_119_;
                                                                break while_120_;
                                                            }
                                                        } else
                                                            break while_117_;
                                                        break while_118_;
                                                    }
                                                } else
                                                    break;
                                                break while_116_;
                                            }
                                        } else {
                                            anInt3906 = class68_sub14
                                                    .readUnsignedByte(-6677);
                                            break while_122_;
                                        }
                                        anInt3888 = class68_sub14
                                                .readUnsignedWord(1355769544);
                                        break while_122_;
                                    } while (false);
                                    anInt3894
                                            = class68_sub14.readUnsignedWord(1355769544);
                                    break while_122_;
                                } while (false);
                                anInt3908 = class68_sub14
                                        .readUnsignedWord(i_0_ ^ ~0x50cf66c8);
                                break while_122_;
                            } while (false);
                            anInt3898 = class68_sub14.readUnsignedWord(1355769544);
                            break while_122_;
                        } while (false);
                        anInt3896
                                = class68_sub14.readUnsignedWord(i_0_ ^ ~0x50cf66c8);
                        break while_122_;
                    } while (false);
                    anInt3899 = class68_sub14.readUnsignedByte(-6677);
                    break while_122_;
                } while (false);
                anInt3892 = class68_sub14.readUnsignedWord(1355769544);
                break while_122_;
            } while (false);
            anInt3897 = class68_sub14.readUnsignedWord(1355769544);
        } while (false);
        if (i_0_ != -1)
            method839(-128, 32, 28, -22, -29, (byte) -27);
    }

    public static void method837(int i) {
        aRSString_3901 = null;
        aClass65_3912 = null;
        aClass98_3893 = null;
        aByteArrayArray3905 = null;
        aRSStringArray3916 = null;
        if (i != 128)
            anInt3911 = -101;
        aRSString_3902 = null;
    }

    public static void method838(int i, boolean bool, Class45 class45) {
        anInt3900++;
        int i_2_ = class45.anInt888 == 0 ? class45.anInt892 : class45.anInt888;
        int i_3_ = class45.anInt794 == 0 ? class45.anInt873 : class45.anInt794;
        Class68_Sub18.method994(class45.anInt792, i_3_, bool, false, i_2_,
                (Class68_Sub13_Sub36.aClass45ArrayArray4040
                        [class45.anInt792 >> -1042903824]));
        if (class45.aClass45Array769 != null)
            Class68_Sub18.method994(class45.anInt792, i_3_, bool, false, i_2_,
                    class45.aClass45Array769);
        Class68_Sub3 class68_sub3
                = ((Class68_Sub3)
                Login.aClass113_1512.method1678((long) class45.anInt792,
                        -78));
        if (class68_sub3 != null)
            Class11.method234((byte) 99, i_3_, bool, i_2_,
                    class68_sub3.anInt2803);
        if (i != -1)
            method842(28, null, 33, -95);
    }

    public static void method839(int i, int i_4_, int i_5_, int i_6_, int i_7_,
                                 byte i_8_) {
        if (i <= Class51.anInt2255
                && (Class35.anInt605 ^ 0xffffffff) >= (i_6_ ^ 0xffffffff)) {
            boolean bool;
            if ((GroundData.anInt677 ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)) {
                if ((Class113.anInt1918 ^ 0xffffffff) <= (i_7_ ^ 0xffffffff))
                    bool = true;
                else {
                    i_7_ = Class113.anInt1918;
                    bool = false;
                }
            } else {
                bool = false;
                i_7_ = GroundData.anInt677;
            }
            boolean bool_9_;
            if (i_4_ < GroundData.anInt677) {
                i_4_ = GroundData.anInt677;
                bool_9_ = false;
            } else if ((i_4_ ^ 0xffffffff)
                    >= (Class113.anInt1918 ^ 0xffffffff))
                bool_9_ = true;
            else {
                i_4_ = Class113.anInt1918;
                bool_9_ = false;
            }
            if ((i ^ 0xffffffff) > (Class35.anInt605 ^ 0xffffffff))
                i = Class35.anInt605;
            else
                Class34.method416(i_4_, (byte) -17, i_5_,
                        Class68_Sub22.anIntArrayArray3132[i++],
                        i_7_);
            if (Class51.anInt2255 < i_6_)
                i_6_ = Class51.anInt2255;
            else
                Class34.method416(i_4_, (byte) -17, i_5_,
                        Class68_Sub22.anIntArrayArray3132[i_6_--],
                        i_7_);
            if (bool_9_ && bool) {
                for (int i_10_ = i;
                     (i_6_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff); i_10_++) {
                    int[] is = Class68_Sub22.anIntArrayArray3132[i_10_];
                    is[i_4_] = is[i_7_] = i_5_;
                }
            } else if (!bool_9_) {
                if (bool) {
                    for (int i_11_ = i; i_11_ <= i_6_; i_11_++)
                        Class68_Sub22.anIntArrayArray3132[i_11_][i_7_] = i_5_;
                }
            } else {
                for (int i_12_ = i; i_12_ <= i_6_; i_12_++)
                    Class68_Sub22.anIntArrayArray3132[i_12_][i_4_] = i_5_;
            }
        }
        anInt3909++;
        if (i_8_ < 82)
            method840(28, -10, -23, 0);
    }

    public static boolean method840(int i, int i_13_, int i_14_, int i_15_) {
        if (!Class21renamed.method361(i, i_13_, i_14_))
            return false;
        int i_16_ = i_13_ << 7;
        int i_17_ = i_14_ << 7;
        int i_18_
                = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i][i_13_][i_14_]
                - 1);
        int i_19_ = i_18_ - 120;
        int i_20_ = i_18_ - 230;
        int i_21_ = i_18_ - 238;
        if (i_15_ < 16) {
            if (i_15_ == 1) {
                if (i_16_ > Class25.anInt518) {
                    if (!Login.method1472(i_16_, i_18_, i_17_))
                        return false;
                    if (!Login.method1472(i_16_, i_18_, i_17_ + 128))
                        return false;
                }
                if (i > 0) {
                    if (!Login.method1472(i_16_, i_19_, i_17_))
                        return false;
                    if (!Login.method1472(i_16_, i_19_, i_17_ + 128))
                        return false;
                }
                if (!Login.method1472(i_16_, i_20_, i_17_))
                    return false;
                if (!Login.method1472(i_16_, i_20_, i_17_ + 128))
                    return false;
                return true;
            }
            if (i_15_ == 2) {
                if (i_17_ < Class68_Sub20_Sub12.anInt4355) {
                    if (!Login.method1472(i_16_, i_18_, i_17_ + 128))
                        return false;
                    if (!Login.method1472(i_16_ + 128, i_18_, i_17_ + 128))
                        return false;
                }
                if (i > 0) {
                    if (!Login.method1472(i_16_, i_19_, i_17_ + 128))
                        return false;
                    if (!Login.method1472(i_16_ + 128, i_19_, i_17_ + 128))
                        return false;
                }
                if (!Login.method1472(i_16_, i_20_, i_17_ + 128))
                    return false;
                if (!Login.method1472(i_16_ + 128, i_20_, i_17_ + 128))
                    return false;
                return true;
            }
            if (i_15_ == 4) {
                if (i_16_ < Class25.anInt518) {
                    if (!Login.method1472(i_16_ + 128, i_18_, i_17_))
                        return false;
                    if (!Login.method1472(i_16_ + 128, i_18_, i_17_ + 128))
                        return false;
                }
                if (i > 0) {
                    if (!Login.method1472(i_16_ + 128, i_19_, i_17_))
                        return false;
                    if (!Login.method1472(i_16_ + 128, i_19_, i_17_ + 128))
                        return false;
                }
                if (!Login.method1472(i_16_ + 128, i_20_, i_17_))
                    return false;
                if (!Login.method1472(i_16_ + 128, i_20_, i_17_ + 128))
                    return false;
                return true;
            }
            if (i_15_ == 8) {
                if (i_17_ > Class68_Sub20_Sub12.anInt4355) {
                    if (!Login.method1472(i_16_, i_18_, i_17_))
                        return false;
                    if (!Login.method1472(i_16_ + 128, i_18_, i_17_))
                        return false;
                }
                if (i > 0) {
                    if (!Login.method1472(i_16_, i_19_, i_17_))
                        return false;
                    if (!Login.method1472(i_16_ + 128, i_19_, i_17_))
                        return false;
                }
                if (!Login.method1472(i_16_, i_20_, i_17_))
                    return false;
                if (!Login.method1472(i_16_ + 128, i_20_, i_17_))
                    return false;
                return true;
            }
        }
        if (!Login.method1472(i_16_ + 64, i_21_, i_17_ + 64))
            return false;
        if (i_15_ == 16) {
            if (!Login.method1472(i_16_, i_20_, i_17_ + 128))
                return false;
            return true;
        }
        if (i_15_ == 32) {
            if (!Login.method1472(i_16_ + 128, i_20_, i_17_ + 128))
                return false;
            return true;
        }
        if (i_15_ == 64) {
            if (!Login.method1472(i_16_ + 128, i_20_, i_17_))
                return false;
            return true;
        }
        if (i_15_ == 128) {
            if (!Login.method1472(i_16_, i_20_, i_17_))
                return false;
            return true;
        }
        return true;
    }

    public void method841(Random random, int i, int i_22_, int[][] is,
                          int i_23_, int i_24_, int i_25_) {
        try {
            anInt3903++;
            int i_26_
                    = ((anInt3897 ^ 0xffffffff) < -1
                    ? 4096 + -Class68_Sub20_Sub10.method1114(anInt3897,
                    (byte) 70, random)
                    : 4096);
            if (i_25_ != 1)
                anInt3911 = -98;
            int i_27_ = anInt3907 * anInt3892 >> 1394441932;
            int i_28_ = (anInt3907
                    + -(i_27_ <= 0 ? 0
                    : Class68_Sub20_Sub10.method1114(i_27_, (byte) 70,
                    random)));
            if (i_23_ >= Class68_Sub13_Sub19.anInt3746)
                i_23_ -= Class68_Sub13_Sub19.anInt3746;
            if ((i_28_ ^ 0xffffffff) < -1) {
                if ((i_24_ ^ 0xffffffff) < -1 && (i_22_ ^ 0xffffffff) < -1) {
                    int i_29_ = i_22_ / 2;
                    int i_30_ = i_24_ / 2;
                    int i_31_ = ((i_28_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff)
                            ? i_28_ : i_29_);
                    int i_32_ = i_30_ >= i_28_ ? i_28_ : i_30_;
                    int i_33_ = i_23_ - -i_31_;
                    int i_34_ = -(i_31_ * 2) + i_22_;
                    for (int i_35_ = 0;
                         (i_35_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff);
                         i_35_++) {
                        int[] is_36_ = is[i_35_ - -i];
                        if (i_35_ < i_32_) {
                            int i_37_ = i_35_ * i_26_ / i_32_;
                            if ((anInt3899 ^ 0xffffffff) == -1) {
                                for (int i_38_ = 0;
                                     ((i_31_ ^ 0xffffffff)
                                             < (i_38_ ^ 0xffffffff));
                                     i_38_++) {
                                    int i_39_ = i_26_ * i_38_ / i_31_;
                                    is_36_[Class120.method1740((Class30
                                            .anInt543),
                                            i_23_ + i_38_)]
                                            = is_36_[(Class120.method1740
                                            ((-1 + (i_23_ - -i_22_)
                                                    - i_38_),
                                                    Class30.anInt543))]
                                            = i_37_ * i_39_ >> 721366060;
                                }
                            } else {
                                for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
                                    int i_41_ = i_40_ * i_26_ / i_31_;
                                    is_36_[Class120.method1740(i_40_ + i_23_,
                                            (Class30
                                                    .anInt543))]
                                            = is_36_[(Class120.method1740
                                            (i_22_ + (i_23_
                                                    - (i_40_ - -1)),
                                                    Class30.anInt543))]
                                            = i_41_ >= i_37_ ? i_37_ : i_41_;
                                }
                            }
                            if ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                                    > (i_33_ - -i_34_ ^ 0xffffffff)) {
                                int i_42_
                                        = Class68_Sub13_Sub19.anInt3746 - i_33_;
                                Class39.method464(is_36_, i_33_, i_42_, i_37_);
                                Class39.method464(is_36_, 0, i_34_ + -i_42_,
                                        i_37_);
                            } else
                                Class39.method464(is_36_, i_33_, i_34_, i_37_);
                        } else {
                            int i_43_ = -i_35_ + i_24_ + -1;
                            if (i_32_ > i_43_) {
                                int i_44_ = i_43_ * i_26_ / i_32_;
                                if (anInt3899 != 0) {
                                    for (int i_45_ = 0;
                                         ((i_31_ ^ 0xffffffff)
                                                 < (i_45_ ^ 0xffffffff));
                                         i_45_++) {
                                        int i_46_ = i_26_ * i_45_ / i_31_;
                                        is_36_[Class120.method1740((Class30
                                                .anInt543),
                                                (i_45_
                                                        + i_23_))]
                                                = is_36_[(Class120.method1740
                                                (Class30.anInt543,
                                                        -1 + (-i_45_
                                                                + (i_22_
                                                                + i_23_))))]
                                                = i_44_ <= i_46_ ? i_44_ : i_46_;
                                    }
                                } else {
                                    for (int i_47_ = 0;
                                         ((i_31_ ^ 0xffffffff)
                                                 < (i_47_ ^ 0xffffffff));
                                         i_47_++) {
                                        int i_48_ = i_47_ * i_26_ / i_31_;
                                        is_36_[Class120.method1740((Class30
                                                .anInt543),
                                                (i_23_
                                                        - -i_47_))]
                                                = is_36_[(Class120.method1740
                                                (-i_47_ + i_23_ - (-i_22_
                                                        + 1),
                                                        Class30.anInt543))]
                                                = i_44_ * i_48_ >> -2072381044;
                                    }
                                }
                                if ((Class68_Sub13_Sub19.anInt3746
                                        ^ 0xffffffff)
                                        > (i_34_ + i_33_ ^ 0xffffffff)) {
                                    int i_49_
                                            = (-i_33_
                                            + Class68_Sub13_Sub19.anInt3746);
                                    Class39.method464(is_36_, i_33_, i_49_,
                                            i_44_);
                                    Class39.method464(is_36_, 0,
                                            i_34_ + -i_49_, i_44_);
                                } else
                                    Class39.method464(is_36_, i_33_, i_34_,
                                            i_44_);
                            } else {
                                for (int i_50_ = 0; i_31_ > i_50_; i_50_++)
                                    is_36_[Class120.method1740((Class30
                                            .anInt543),
                                            i_23_ + i_50_)]
                                            = is_36_
                                            [Class120.method1740((Class30
                                            .anInt543),
                                            (-1 + -i_50_
                                                    + i_23_
                                                    + i_22_))]
                                            = i_50_ * i_26_ / i_31_;
                                if ((i_33_ - -i_34_ ^ 0xffffffff)
                                        >= (Class68_Sub13_Sub19.anInt3746
                                        ^ 0xffffffff))
                                    Class39.method464(is_36_, i_33_, i_34_,
                                            i_26_);
                                else {
                                    int i_51_ = (Class68_Sub13_Sub19.anInt3746
                                            + -i_33_);
                                    Class39.method464(is_36_, i_33_, i_51_,
                                            i_26_);
                                    Class39.method464(is_36_, 0, i_34_ - i_51_,
                                            i_26_);
                                }
                            }
                        }
                    }
                }
            } else if ((i_23_ + i_22_ ^ 0xffffffff)
                    >= (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)) {
                for (int i_52_ = 0;
                     (i_52_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff); i_52_++)
                    Class39.method464(is[i - -i_52_], i_23_, i_22_, i_26_);
            } else {
                int i_53_ = -i_23_ + Class68_Sub13_Sub19.anInt3746;
                for (int i_54_ = 0; i_24_ > i_54_; i_54_++) {
                    int[] is_55_ = is[i_54_ + i];
                    Class39.method464(is_55_, i_23_, i_53_, i_26_);
                    Class39.method464(is_55_, 0, -i_53_ + i_22_, i_26_);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("pi.D("
                            + (random != null ? "{...}" : "null")
                            + ',' + i + ',' + i_22_ + ','
                            + (is != null ? "{...}" : "null") + ','
                            + i_23_ + ',' + i_24_ + ',' + i_25_
                            + ')'));
        }
    }

    public static RSString method842(int i, byte[] is, int i_56_, int i_57_) {
        anInt3904++;
        RSString class100 = new RSString();
        class100.bytes = new byte[i];
        class100.anInt2293 = 0;
        for (int i_58_ = i_57_;
             (i_57_ + i ^ 0xffffffff) < (i_58_ ^ 0xffffffff); i_58_++) {
            if ((is[i_58_] ^ 0xffffffff) != -1)
                class100.bytes[class100.anInt2293++] = is[i_58_];
        }
        if (i_56_ < 36)
            anInt3915 = -90;
        return class100;
    }

    public Class68_Sub13_Sub27() {
        super(0, true);
        anInt3888 = 1024;
        anInt3898 = 819;
        anInt3896 = 1024;
        anInt3906 = 0;
        anInt3908 = 409;
    }

    public static void method843(int i, boolean bool) {
        anInt3890++;
        if ((Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561 >> 671041927
                ^ 0xffffffff) == (Class95.anInt1684 ^ 0xffffffff)
                && ((Class75_Sub2.anInt3315 ^ 0xffffffff)
                == (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537 >> 1022329287
                ^ 0xffffffff)))
            Class95.anInt1684 = 0;
        int i_59_ = client.anInt2382;
        if (bool)
            i_59_ = 1;
        for (int i_60_ = 0; i_59_ > i_60_; i_60_++) {
            long l;
            Class1_Sub6_Sub2 class1_sub6_sub2;
            if (!bool) {
                class1_sub6_sub2
                        = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                        [Class85.anIntArray1563[i_60_]]);
                l = (long) Class85.anIntArray1563[i_60_] << 2057557280;
            } else {
                l = 8791798054912L;
                class1_sub6_sub2 = Class68_Sub7.aClass1_Sub6_Sub2_2860;
            }
            if (class1_sub6_sub2 != null && class1_sub6_sub2.method150(101)) {
                class1_sub6_sub2.aBoolean3424 = false;
                if ((RSString.aBoolean2262 && client.anInt2382 > 200
                        || client.anInt2382 > 50)
                        && !bool
                        && (class1_sub6_sub2.anInt2524
                        == class1_sub6_sub2.anInt2530))
                    class1_sub6_sub2.aBoolean3424 = true;
                int i_61_ = class1_sub6_sub2.anInt2561 >> -2062929593;
                int i_62_ = class1_sub6_sub2.anInt2537 >> -424576857;
                if ((i_61_ ^ 0xffffffff) <= -1 && i_61_ < 104
                        && (i_62_ ^ 0xffffffff) <= -1
                        && (i_62_ ^ 0xffffffff) > -105) {
                    if (class1_sub6_sub2.aClass1_Sub3_3411 != null
                            && ((class1_sub6_sub2.anInt3412 ^ 0xffffffff)
                            >= (Class68_Sub3.anInt2812 ^ 0xffffffff))
                            && ((class1_sub6_sub2.anInt3439 ^ 0xffffffff)
                            < (Class68_Sub3.anInt2812 ^ 0xffffffff))) {
                        class1_sub6_sub2.aBoolean3424 = false;
                        class1_sub6_sub2.anInt2582
                                = Class1_Sub6_Sub2.method163((class1_sub6_sub2
                                .anInt2561),
                                GameSocket.anInt1149,
                                (class1_sub6_sub2
                                        .anInt2537),
                                false);
                        Class122.method1747(GameSocket.anInt1149,
                                class1_sub6_sub2.anInt2561,
                                class1_sub6_sub2.anInt2537,
                                class1_sub6_sub2.anInt2582,
                                class1_sub6_sub2,
                                class1_sub6_sub2.anInt2548, l,
                                class1_sub6_sub2.anInt3433,
                                class1_sub6_sub2.anInt3438,
                                class1_sub6_sub2.anInt3408,
                                class1_sub6_sub2.anInt3419);
                    } else {
                        if (class1_sub6_sub2.anInt2544 == 1
                                && (0x7f & class1_sub6_sub2.anInt2561) == 64
                                && (class1_sub6_sub2.anInt2537 & 0x7f
                                ^ 0xffffffff) == -65) {
                            if ((Class76.anIntArrayArray1346[i_61_][i_62_]
                                    ^ 0xffffffff)
                                    == (Class3.anInt84 ^ 0xffffffff))
                                continue;
                            Class76.anIntArrayArray1346[i_61_][i_62_]
                                    = Class3.anInt84;
                        }
                        class1_sub6_sub2.anInt2582
                                = Class1_Sub6_Sub2.method163((class1_sub6_sub2
                                .anInt2561),
                                GameSocket.anInt1149,
                                (class1_sub6_sub2
                                        .anInt2537),
                                false);
                        Class68_Sub20_Sub4.method1061
                                (GameSocket.anInt1149, class1_sub6_sub2.anInt2561,
                                        class1_sub6_sub2.anInt2537,
                                        class1_sub6_sub2.anInt2582,
                                        (class1_sub6_sub2.anInt2544 - 1) * 64 - -60,
                                        class1_sub6_sub2, class1_sub6_sub2.anInt2548, l,
                                        class1_sub6_sub2.aBoolean2583);
                    }
                }
            }
        }
        if (i != 64)
            anInt3915 = -94;
    }

    public int[] method698(byte i, int i_63_) {
        anInt3889++;
        int[] is = aClass115_2936.method1697(false, i_63_);
        if (aClass115_2936.aBoolean1957) {
            int i_64_ = 0;
            int[][] is_65_ = aClass115_2936.method1696(-32044);
            int i_66_ = 0;
            int i_67_ = 0;
            int i_68_ = 0;
            int i_69_ = 0;
            boolean bool = true;
            boolean bool_70_ = true;
            int i_71_ = 0;
            int i_72_ = 0;
            int i_73_
                    = Class68_Sub13_Sub19.anInt3746 * anInt3888 >> -1038891860;
            int i_74_
                    = Class68_Sub13_Sub19.anInt3746 * anInt3894 >> -695056052;
            int i_75_ = Class68_Sub1.anInt2775 * anInt3898 >> 1716893868;
            int i_76_ = Class68_Sub1.anInt2775 * anInt3908 >> 764602188;
            if (i_75_ <= 1)
                return is_65_[i_63_];
            anInt3907
                    = Class68_Sub13_Sub19.anInt3746 / 8 * anInt3896 >> -1227770260;
            int i_77_ = Class68_Sub13_Sub19.anInt3746 / i_73_ + 1;
            int[][] is_78_ = new int[i_77_][3];
            int[][] is_79_ = new int[i_77_][3];
            Random random = new Random((long) anInt3906);
            for (; ; ) {
                int i_80_ = (Class68_Sub20_Sub10.method1114(-i_73_ + i_74_,
                        (byte) 70, random)
                        + i_73_);
                int i_81_ = i_80_ + i_69_;
                int i_82_ = (Class68_Sub20_Sub10.method1114(i_75_ + -i_76_,
                        (byte) 70, random)
                        + i_76_);
                if ((i_81_ ^ 0xffffffff)
                        < (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)) {
                    i_80_ = -i_69_ + Class68_Sub13_Sub19.anInt3746;
                    i_81_ = Class68_Sub13_Sub19.anInt3746;
                }
                int i_83_;
                if (bool_70_)
                    i_83_ = 0;
                else {
                    int i_84_ = i_67_;
                    int[] is_85_ = is_79_[i_67_];
                    i_83_ = is_85_[2];
                    int i_86_ = 0;
                    int i_87_ = i_64_ + i_81_;
                    if (i_87_ < 0)
                        i_87_ += Class68_Sub13_Sub19.anInt3746;
                    if (Class68_Sub13_Sub19.anInt3746 < i_87_)
                        i_87_ -= Class68_Sub13_Sub19.anInt3746;
                    for (; ; ) {
                        int[] is_88_ = is_79_[i_84_];
                        if ((i_87_ ^ 0xffffffff) <= (is_88_[0] ^ 0xffffffff)
                                && (i_87_ ^ 0xffffffff) >= (is_88_[1]
                                ^ 0xffffffff))
                            break;
                        i_86_++;
                        if (++i_84_ >= i_71_)
                            i_84_ = 0;
                    }
                    if ((i_67_ ^ 0xffffffff) != (i_84_ ^ 0xffffffff)) {
                        int i_89_ = i_69_ - -i_64_;
                        if ((i_89_ ^ 0xffffffff) > -1)
                            i_89_ += Class68_Sub13_Sub19.anInt3746;
                        if (Class68_Sub13_Sub19.anInt3746 < i_89_)
                            i_89_ -= Class68_Sub13_Sub19.anInt3746;
                        for (int i_90_ = 1;
                             (i_90_ ^ 0xffffffff) >= (i_86_ ^ 0xffffffff);
                             i_90_++) {
                            int[] is_91_ = is_79_[(i_90_ + i_67_) % i_71_];
                            i_83_ = Math.max(i_83_, is_91_[2]);
                        }
                        for (int i_92_ = 0;
                             (i_86_ ^ 0xffffffff) <= (i_92_ ^ 0xffffffff);
                             i_92_++) {
                            int[] is_93_ = is_79_[(i_67_ - -i_92_) % i_71_];
                            int i_94_ = is_93_[2];
                            if (i_94_ != i_83_) {
                                int i_95_ = is_93_[0];
                                int i_96_ = is_93_[1];
                                int i_97_;
                                int i_98_;
                                if ((i_89_ ^ 0xffffffff)
                                        > (i_87_ ^ 0xffffffff)) {
                                    i_97_ = Math.max(i_89_, i_95_);
                                    i_98_ = Math.min(i_87_, i_96_);
                                } else if ((i_95_ ^ 0xffffffff) != -1) {
                                    i_97_ = Math.max(i_89_, i_95_);
                                    i_98_ = Class68_Sub13_Sub19.anInt3746;
                                } else {
                                    i_97_ = 0;
                                    i_98_ = Math.min(i_87_, i_96_);
                                }
                                method841(random, i_94_, -i_97_ + i_98_,
                                        is_65_, i_97_ + i_68_,
                                        -i_94_ + i_83_, 1);
                            }
                        }
                    }
                    i_67_ = i_84_;
                }
                if (i_82_ + i_83_ <= Class68_Sub1.anInt2775)
                    bool = false;
                else
                    i_82_ = -i_83_ + Class68_Sub1.anInt2775;
                if ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                        == (i_81_ ^ 0xffffffff)) {
                    method841(random, i_83_, i_80_, is_65_, i_66_ + i_69_,
                            i_82_, 1);
                    if (bool)
                        break;
                    bool_70_ = false;
                    int[] is_99_ = is_78_[i_72_++];
                    bool = true;
                    is_99_[2] = i_82_ + i_83_;
                    is_99_[0] = i_69_;
                    i_68_ = i_66_;
                    is_99_[1] = i_81_;
                    int[][] is_100_ = is_79_;
                    i_67_ = 0;
                    i_71_ = i_72_;
                    i_72_ = 0;
                    is_79_ = is_78_;
                    i_69_ = 0;
                    i_66_ = Class68_Sub20_Sub10.method1114((Class68_Sub13_Sub19
                            .anInt3746),
                            (byte) 70, random);
                    is_78_ = is_100_;
                    i_64_ = i_66_ - i_68_;
                    int i_101_ = i_64_;
                    if ((i_101_ ^ 0xffffffff) > -1)
                        i_101_ += Class68_Sub13_Sub19.anInt3746;
                    if (Class68_Sub13_Sub19.anInt3746 < i_101_)
                        i_101_ -= Class68_Sub13_Sub19.anInt3746;
                    for (; ; ) {
                        int[] is_102_ = is_79_[i_67_];
                        if (i_101_ >= is_102_[0]
                                && (i_101_ ^ 0xffffffff) >= (is_102_[1]
                                ^ 0xffffffff))
                            break;
                        if (++i_67_ >= i_71_)
                            i_67_ = 0;
                    }
                } else {
                    int[] is_103_ = is_78_[i_72_++];
                    is_103_[1] = i_81_;
                    is_103_[2] = i_82_ + i_83_;
                    is_103_[0] = i_69_;
                    method841(random, i_83_, i_80_, is_65_, i_66_ + i_69_,
                            i_82_, 1);
                    i_69_ = i_81_;
                }
            }
        }
        if (i != -61)
            method843(-113, true);
        return is;
    }

    public void method690(byte i) {
        anInt3887++;
        if (i >= -22)
            method839(-109, 82, 75, -110, -79, (byte) -79);
    }

    static {
        aRSString_3901 = RSString.newRsString("floorshadows");
        aByteArrayArray3905 = new byte[50][];
        aClass98_3893 = new Class98(64);
        anInt3911 = -1;
        anInt3914 = 0;
        anInt3915 = 0;
        aRSStringArray3916 = new RSString[100];
    }
}
