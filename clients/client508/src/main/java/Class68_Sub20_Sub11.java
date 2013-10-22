/* Class68_Sub20_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub11 extends Class68_Sub20 {
    public static int anInt4321;
    public static int anInt4322;
    public static RSString aRSString_4323;
    public static int anInt4324;
    public static int anInt4325;
    public int[] anIntArray4326;
    public int[] anIntArray4327;
    public static int anInt4328;
    public static int anInt4329;
    public static int anInt4330;
    public static RSString aRSString_4331;
    public static byte[][] aByteArrayArray4332;
    public static RSString aRSString_4333
            = RSString.newRsString(")3runescape)3com");
    public static RSString aRSString_4334;
    public int[] anIntArray4335;
    public static int anInt4336;
    public static int anInt4337;
    public int[] anIntArray4338;
    public static int anInt4339;
    public static int anInt4340;
    public static int anInt4341;
    public RSString aRSString_4342;

    public int method1139(int i, int i_0_) {
        anInt4321++;
        if (anIntArray4327 == null)
            return -1;
        int i_1_ = 0;
        if (i_0_ != -1)
            anIntArray4326 = null;
        for (/**/; i_1_ < anIntArray4327.length; i_1_++) {
            if (anIntArray4335[i_1_] == i)
                return anIntArray4327[i_1_];
        }
        return -1;
    }

    public static void method1140(int i) {
        anInt4329++;
        synchronized (Class63.anObject1169) {
            if (Class9.anInt169 == 0)
                Class75_Sub1_Sub1.signlink.method558((byte) -58, 5,
                        new Class87());
            Class9.anInt169 = i;
        }
    }

    public static boolean method1141
            (int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, byte i_7_,
             int i_8_, int i_9_, int i_10_, int i_11_, boolean bool) {
        int i_12_ = -107 / ((i_7_ - -27) / 58);
        for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -105; i_13_++) {
            for (int i_14_ = 0; i_14_ < 104; i_14_++) {
                Class68_Sub8.anIntArrayArray2873[i_13_][i_14_] = 0;
                Class116.anIntArrayArray2016[i_13_][i_14_] = 99999999;
            }
        }
        Class68_Sub8.anIntArrayArray2873[i_10_][i_5_] = 99;
        int i_15_ = i_10_;
        anInt4340++;
        int i_16_ = 0;
        Class116.anIntArrayArray2016[i_10_][i_5_] = 0;
        int i_17_ = i_5_;
        int i_18_ = 0;
        Class68_Sub13_Sub37.anIntArray4066[i_16_] = i_10_;
        boolean bool_19_ = false;
        Class68_Sub13_Sub21.anIntArray3797[i_16_++] = i_5_;
        int[][] is
                = Class109.aClass38Array1843[GameSocket.anInt1149].anIntArrayArray681;
        while (i_18_ != i_16_) {
            i_17_ = Class68_Sub13_Sub21.anIntArray3797[i_18_];
            i_15_ = Class68_Sub13_Sub37.anIntArray4066[i_18_];
            i_18_ = 0xfff & i_18_ + 1;
            if ((i_15_ ^ 0xffffffff) == (i_6_ ^ 0xffffffff)
                    && (i ^ 0xffffffff) == (i_17_ ^ 0xffffffff)) {
                bool_19_ = true;
                break;
            }
            if (i_3_ != 0) {
                if (((i_3_ ^ 0xffffffff) > -6 || (i_3_ ^ 0xffffffff) == -11)
                        && (Class109.aClass38Array1843[GameSocket.anInt1149].method459
                        (i_9_, i_6_, (byte) 108, i_15_, 1, i, i_17_,
                                i_3_ - 1))) {
                    bool_19_ = true;
                    break;
                }
                if (i_3_ < 10
                        && (Class109.aClass38Array1843[GameSocket.anInt1149].method462
                        (i_6_, i_15_, i_9_, (byte) -37, 1, i, i_17_,
                                i_3_ + -1))) {
                    bool_19_ = true;
                    break;
                }
            }
            if ((i_2_ ^ 0xffffffff) != -1 && (i_4_ ^ 0xffffffff) != -1
                    && (Class109.aClass38Array1843[GameSocket.anInt1149].method448
                    (15856, i, 1, i_17_, i_4_, i_15_, i_11_, i_2_, i_6_))) {
                bool_19_ = true;
                break;
            }
            int i_20_ = Class116.anIntArrayArray2016[i_15_][i_17_] + 1;
            if ((i_15_ ^ 0xffffffff) < -1
                    && (Class68_Sub8.anIntArrayArray2873[-1 + i_15_][i_17_]
                    ^ 0xffffffff) == -1
                    && (is[-1 + i_15_][i_17_] & 0x12c0108 ^ 0xffffffff) == -1) {
                Class68_Sub13_Sub37.anIntArray4066[i_16_] = i_15_ + -1;
                Class68_Sub13_Sub21.anIntArray3797[i_16_] = i_17_;
                i_16_ = 0xfff & i_16_ + 1;
                Class68_Sub8.anIntArrayArray2873[i_15_ + -1][i_17_] = 2;
                Class116.anIntArrayArray2016[-1 + i_15_][i_17_] = i_20_;
            }
            if (i_15_ < 103
                    && Class68_Sub8.anIntArrayArray2873[i_15_ - -1][i_17_] == 0
                    && (0x12c0180 & is[i_15_ - -1][i_17_] ^ 0xffffffff) == -1) {
                Class68_Sub13_Sub37.anIntArray4066[i_16_] = 1 + i_15_;
                Class68_Sub13_Sub21.anIntArray3797[i_16_] = i_17_;
                i_16_ = 1 + i_16_ & 0xfff;
                Class68_Sub8.anIntArrayArray2873[1 + i_15_][i_17_] = 8;
                Class116.anIntArrayArray2016[1 + i_15_][i_17_] = i_20_;
            }
            if ((i_17_ ^ 0xffffffff) < -1
                    && (Class68_Sub8.anIntArrayArray2873[i_15_][i_17_ - 1]
                    ^ 0xffffffff) == -1
                    && (is[i_15_][-1 + i_17_] & 0x12c0102) == 0) {
                Class68_Sub13_Sub37.anIntArray4066[i_16_] = i_15_;
                Class68_Sub13_Sub21.anIntArray3797[i_16_] = -1 + i_17_;
                Class68_Sub8.anIntArrayArray2873[i_15_][i_17_ + -1] = 1;
                i_16_ = 0xfff & i_16_ - -1;
                Class116.anIntArrayArray2016[i_15_][-1 + i_17_] = i_20_;
            }
            if (i_17_ < 103
                    && Class68_Sub8.anIntArrayArray2873[i_15_][i_17_ - -1] == 0
                    && (is[i_15_][i_17_ - -1] & 0x12c0120) == 0) {
                Class68_Sub13_Sub37.anIntArray4066[i_16_] = i_15_;
                Class68_Sub13_Sub21.anIntArray3797[i_16_] = i_17_ - -1;
                Class68_Sub8.anIntArrayArray2873[i_15_][i_17_ + 1] = 4;
                Class116.anIntArrayArray2016[i_15_][i_17_ - -1] = i_20_;
                i_16_ = i_16_ - -1 & 0xfff;
            }
            if ((i_15_ ^ 0xffffffff) < -1 && i_17_ > 0
                    && (Class68_Sub8.anIntArrayArray2873[-1 + i_15_][i_17_ + -1]
                    ^ 0xffffffff) == -1
                    && (is[i_15_ - 1][-1 + i_17_] & 0x12c010e ^ 0xffffffff) == -1
                    && (is[i_15_ - 1][i_17_] & 0x12c0108) == 0
                    && (is[i_15_][-1 + i_17_] & 0x12c0102 ^ 0xffffffff) == -1) {
                Class68_Sub13_Sub37.anIntArray4066[i_16_] = -1 + i_15_;
                Class68_Sub13_Sub21.anIntArray3797[i_16_] = i_17_ - 1;
                i_16_ = 0xfff & 1 + i_16_;
                Class68_Sub8.anIntArrayArray2873[i_15_ + -1][-1 + i_17_] = 3;
                Class116.anIntArrayArray2016[i_15_ + -1][-1 + i_17_] = i_20_;
            }
            if ((i_15_ ^ 0xffffffff) > -104 && (i_17_ ^ 0xffffffff) < -1
                    && Class68_Sub8.anIntArrayArray2873[1 + i_15_][i_17_ - 1] == 0
                    && (0x12c0183 & is[1 + i_15_][i_17_ + -1]) == 0
                    && (0x12c0180 & is[1 + i_15_][i_17_]) == 0
                    && (0x12c0102 & is[i_15_][i_17_ + -1] ^ 0xffffffff) == -1) {
                Class68_Sub13_Sub37.anIntArray4066[i_16_] = 1 + i_15_;
                Class68_Sub13_Sub21.anIntArray3797[i_16_] = i_17_ + -1;
                i_16_ = 0xfff & 1 + i_16_;
                Class68_Sub8.anIntArrayArray2873[i_15_ + 1][-1 + i_17_] = 9;
                Class116.anIntArrayArray2016[1 + i_15_][i_17_ + -1] = i_20_;
            }
            if ((i_15_ ^ 0xffffffff) < -1 && (i_17_ ^ 0xffffffff) > -104
                    && (Class68_Sub8.anIntArrayArray2873[-1 + i_15_][1 + i_17_]
                    ^ 0xffffffff) == -1
                    && (is[-1 + i_15_][i_17_ + 1] & 0x12c0138) == 0
                    && (0x12c0108 & is[i_15_ + -1][i_17_] ^ 0xffffffff) == -1
                    && (is[i_15_][1 + i_17_] & 0x12c0120) == 0) {
                Class68_Sub13_Sub37.anIntArray4066[i_16_] = i_15_ - 1;
                Class68_Sub13_Sub21.anIntArray3797[i_16_] = 1 + i_17_;
                i_16_ = 0xfff & i_16_ - -1;
                Class68_Sub8.anIntArrayArray2873[-1 + i_15_][1 + i_17_] = 6;
                Class116.anIntArrayArray2016[i_15_ - 1][i_17_ - -1] = i_20_;
            }
            if (i_15_ < 103 && i_17_ < 103
                    && Class68_Sub8.anIntArrayArray2873[i_15_ - -1][1 + i_17_] == 0
                    && (is[i_15_ + 1][i_17_ + 1] & 0x12c01e0 ^ 0xffffffff) == -1
                    && (0x12c0180 & is[1 + i_15_][i_17_] ^ 0xffffffff) == -1
                    && (is[i_15_][i_17_ - -1] & 0x12c0120) == 0) {
                Class68_Sub13_Sub37.anIntArray4066[i_16_] = i_15_ - -1;
                Class68_Sub13_Sub21.anIntArray3797[i_16_] = 1 + i_17_;
                Class68_Sub8.anIntArrayArray2873[i_15_ + 1][i_17_ - -1] = 12;
                Class116.anIntArrayArray2016[1 + i_15_][1 + i_17_] = i_20_;
                i_16_ = 0xfff & i_16_ + 1;
            }
        }
        Class32.anInt565 = 0;
        if (!bool_19_) {
            if (bool) {
                int i_21_ = 1000;
                int i_22_ = 100;
                int i_23_ = 10;
                for (int i_24_ = -i_23_ + i_6_; i_23_ + i_6_ >= i_24_;
                     i_24_++) {
                    for (int i_25_ = i - i_23_; i - -i_23_ >= i_25_; i_25_++) {
                        if (i_24_ >= 0 && (i_25_ ^ 0xffffffff) <= -1
                                && i_24_ < 104 && i_25_ < 104
                                && (Class116.anIntArrayArray2016[i_24_][i_25_]
                                ^ 0xffffffff) > -101) {
                            int i_26_ = 0;
                            if (i_24_ < i_6_)
                                i_26_ = -i_24_ + i_6_;
                            else if ((i_24_ ^ 0xffffffff)
                                    < (-1 + i_6_ - -i_2_ ^ 0xffffffff))
                                i_26_ = -i_6_ + -i_2_ - (-1 - i_24_);
                            int i_27_ = 0;
                            if (i > i_25_)
                                i_27_ = -i_25_ + i;
                            else if ((-1 + i_4_ + i ^ 0xffffffff)
                                    > (i_25_ ^ 0xffffffff))
                                i_27_ = -i + (-i_4_ + (1 + i_25_));
                            int i_28_ = i_26_ * i_26_ - -(i_27_ * i_27_);
                            if ((i_21_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff)
                                    || (i_28_ == i_21_
                                    && (((Class116.anIntArrayArray2016[i_24_]
                                    [i_25_])
                                    ^ 0xffffffff)
                                    > (i_22_ ^ 0xffffffff)))) {
                                i_15_ = i_24_;
                                i_21_ = i_28_;
                                i_22_ = (Class116.anIntArrayArray2016[i_24_]
                                        [i_25_]);
                                i_17_ = i_25_;
                            }
                        }
                    }
                }
                if (i_21_ == 1000)
                    return false;
                if (i_10_ == i_15_
                        && (i_5_ ^ 0xffffffff) == (i_17_ ^ 0xffffffff))
                    return false;
                Class32.anInt565 = 1;
            } else
                return false;
        }
        i_18_ = 0;
        Class68_Sub13_Sub37.anIntArray4066[i_18_] = i_15_;
        Class68_Sub13_Sub21.anIntArray3797[i_18_++] = i_17_;
        int i_30_;
        int i_29_ = i_30_ = Class68_Sub8.anIntArrayArray2873[i_15_][i_17_];
        while ((i_15_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff)
                || (i_5_ ^ 0xffffffff) != (i_17_ ^ 0xffffffff)) {
            if (i_30_ != i_29_) {
                Class68_Sub13_Sub37.anIntArray4066[i_18_] = i_15_;
                i_30_ = i_29_;
                Class68_Sub13_Sub21.anIntArray3797[i_18_++] = i_17_;
            }
            if ((0x1 & i_29_ ^ 0xffffffff) != -1)
                i_17_++;
            else if ((i_29_ & 0x4 ^ 0xffffffff) != -1)
                i_17_--;
            if ((i_29_ & 0x2 ^ 0xffffffff) == -1) {
                if ((0x8 & i_29_) != 0)
                    i_15_--;
            } else
                i_15_++;
            i_29_ = Class68_Sub8.anIntArrayArray2873[i_15_][i_17_];
        }
        if (i_18_ > 0) {
            Class58.method580(i_18_, i_8_, (byte) 127);
            return true;
        }
        if ((i_8_ ^ 0xffffffff) == -2)
            return false;
        return true;
    }

    public void method1142(boolean bool, Stream class68_sub14, int i) {
        anInt4325++;
        if (bool != false)
            method1146(102);
        if ((i ^ 0xffffffff) != -2) {
            if (i == 2) {
                int i_31_ = class68_sub14.readUnsignedByte(-6677);
                anIntArray4338 = new int[i_31_];
                anIntArray4326 = new int[i_31_];
                for (int i_32_ = 0;
                     (i_32_ ^ 0xffffffff) > (i_31_ ^ 0xffffffff); i_32_++) {
                    anIntArray4338[i_32_]
                            = class68_sub14.readUnsignedWord(1355769544);
                    int i_33_ = class68_sub14.readUnsignedByte(-6677);
                    if ((i_33_ ^ 0xffffffff) == -1)
                        anIntArray4326[i_32_] = -1;
                    else
                        anIntArray4326[i_32_] = i_33_;
                }
            } else if (i == 3) {
                int i_34_ = class68_sub14.readUnsignedByte(-6677);
                anIntArray4327 = new int[i_34_];
                anIntArray4335 = new int[i_34_];
                for (int i_35_ = 0;
                     (i_35_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff); i_35_++) {
                    anIntArray4327[i_35_]
                            = class68_sub14.readUnsignedWord(1355769544);
                    int i_36_ = class68_sub14.readUnsignedByte(-6677);
                    if (i_36_ != 0)
                        anIntArray4335[i_35_] = i_36_;
                    else
                        anIntArray4335[i_35_] = -1;
                }
            }
        } else
            aRSString_4342 = class68_sub14.readString(127);
    }

    public void method1143(Stream class68_sub14, boolean bool) {
        anInt4341++;
        if (bool != true)
            aRSString_4334 = null;
        for (; ; ) {
            int i = class68_sub14.readUnsignedByte(-6677);
            if (i == 0)
                break;
            method1142(false, class68_sub14, i);
        }
    }

    public int method1144(int i, int i_37_) {
        anInt4339++;
        if (anIntArray4338 == null)
            return -1;
        if (i_37_ < 113)
            method1148(74, -95, 56);
        for (int i_38_ = 0;
             (anIntArray4338.length ^ 0xffffffff) < (i_38_ ^ 0xffffffff);
             i_38_++) {
            if ((anIntArray4326[i_38_] ^ 0xffffffff) == (i ^ 0xffffffff))
                return anIntArray4338[i_38_];
        }
        return -1;
    }

    public void method1145(byte i) {
        if (i > -40)
            method1149(-35, null, -90, -21);
        anInt4322++;
        if (anIntArray4327 != null) {
            for (int i_39_ = 0;
                 (i_39_ ^ 0xffffffff) > (anIntArray4327.length ^ 0xffffffff);
                 i_39_++)
                anIntArray4327[i_39_]
                        = Class70.method1335(anIntArray4327[i_39_], 32768);
        }
        if (anIntArray4338 != null) {
            for (int i_40_ = 0; anIntArray4338.length > i_40_; i_40_++)
                anIntArray4338[i_40_]
                        = Class70.method1335(anIntArray4338[i_40_], 32768);
        }
    }

    public static void method1146(int i) {
        aRSString_4334 = null;
        aRSString_4333 = null;
        aRSString_4331 = null;
        aRSString_4323 = null;
        if (i != 0)
            method1146(-25);
        aByteArrayArray4332 = null;
    }

    public static void method1147(int i, Class45 class45, int i_41_, int i_42_,
                                  int i_43_, int i_44_, int i_45_, int i_46_) {
        if (i_43_ != 25504)
            aByteArrayArray4332 = null;
        anInt4330++;
        if (!Class30.aBoolean553)
            Class68_Sub15.anInt3012 = 0;
        else
            Class68_Sub15.anInt3012 = 32;
        Class30.aBoolean553 = false;
        if (Class68_Sub20_Sub12.anInt4352 != 0) {
            if ((i_46_ ^ 0xffffffff) > (i_44_ ^ 0xffffffff)
                    || (i_46_ ^ 0xffffffff) <= (16 + i_44_ ^ 0xffffffff)
                    || i_45_ < i || 16 + i <= i_45_) {
                if ((i_46_ ^ 0xffffffff) <= (i_44_ ^ 0xffffffff)
                        && i_46_ < 16 + i_44_ && i_45_ >= i - -i_41_ - 16
                        && i_45_ < i + i_41_) {
                    class45.anInt818 += 4;
                    Class113.method1682(class45, -122);
                } else if (((i_44_ + -Class68_Sub15.anInt3012 ^ 0xffffffff)
                        >= (i_46_ ^ 0xffffffff))
                        && ((i_46_ ^ 0xffffffff)
                        > (16 + i_44_ + Class68_Sub15.anInt3012
                        ^ 0xffffffff))
                        && i_45_ >= i - -16
                        && (i + i_41_ - 16 ^ 0xffffffff) < (i_45_
                        ^ 0xffffffff)) {
                    int i_47_ = i_41_ * (i_41_ - 32) / i_42_;
                    if (i_47_ < 8)
                        i_47_ = 8;
                    int i_48_ = -i_47_ + i_41_ - 32;
                    int i_49_ = i_45_ - i - (16 - -(i_47_ / 2));
                    class45.anInt818 = (i_42_ - i_41_) * i_49_ / i_48_;
                    Class113.method1682(class45, -114);
                    Class30.aBoolean553 = true;
                }
            } else {
                class45.anInt818 -= 4;
                Class113.method1682(class45, i_43_ ^ ~0x63d0);
            }
        }
        if (Class68_Sub13_Sub30.anInt3948 != 0) {
            int i_50_ = class45.anInt892;
            if ((i_46_ ^ 0xffffffff) <= (-i_50_ + i_44_ ^ 0xffffffff)
                    && (i_45_ ^ 0xffffffff) <= (i ^ 0xffffffff)
                    && i_44_ - -16 > i_46_ && i_45_ <= i_41_ + i) {
                class45.anInt818 += Class68_Sub13_Sub30.anInt3948 * 45;
                Class113.method1682(class45, -120);
            }
        }
    }

    public static int method1148(int i, int i_51_, int i_52_) {
        anInt4324++;
        Class68_Sub22 class68_sub22
                = ((Class68_Sub22)
                Class68_Sub13_Sub8.aClass113_3564.method1678((long) i_52_,
                        -125));
        if (class68_sub22 == null)
            return 0;
        if (i_51_ == -1)
            return 0;
        int i_53_ = i;
        for (int i_54_ = 0; i_54_ < class68_sub22.anIntArray3141.length;
             i_54_++) {
            if (i_51_ == class68_sub22.anIntArray3144[i_54_])
                i_53_ += class68_sub22.anIntArray3141[i_54_];
        }
        return i_53_;
    }

    public static void method1149(int i, Class45 class45, int i_55_,
                                  int i_56_) {
        anInt4337++;
        if ((Class68_Sub9.anInt2882 == 0 || Class68_Sub9.anInt2882 == 3)
                && class45.method497(2663)) {
            int i_57_ = class45.anIntArray854[i_55_];
            if ((i_56_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff)
                    && i_56_ <= class45.anIntArray783[i_55_] + i_57_) {
                i_56_ -= class45.anInt892 / 2;
                i_55_ -= class45.anInt873 / 2;
                int i_58_
                        = Class68_Sub13_Sub26.anInt3883 + Class8.anInt163 & 0x7ff;
                int i_59_ = Class62.anIntArray1167[i_58_];
                i_59_ = (i_59_ * (Class68_Sub20_Sub16.anInt4420 + 256)
                        >> -910221912);
                int i_60_ = 53 % ((4 - i) / 50);
                int i_61_ = Class62.anIntArray1155[i_58_];
                i_61_ = ((256 + Class68_Sub20_Sub16.anInt4420) * i_61_
                        >> 1439887720);
                int i_62_ = -(i_56_ * i_61_) + i_59_ * i_55_ >> 1723296619;
                int i_63_ = i_59_ * i_56_ + i_55_ * i_61_ >> -1686322517;
                int i_64_
                        = (-i_62_ + Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                        >> -495060793);
                int i_65_
                        = (i_63_ + Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561
                        >> -383880377);
                if (Class68_Sub13_Sub13.anInt3663 > 0
                        && Class128.aBooleanArray2228[82]
                        && Class128.aBooleanArray2228[81])
                    Class51.method539(Class36.anInt643 - -i_65_,
                            GameSocket.anInt1149,
                            i_64_ + Class68_Sub13_Sub35.anInt4026,
                            24867);
                else {
                    boolean bool
                            = Class68_Sub13_Sub3.method713(0, 0,
                            (Class68_Sub7
                                    .aClass1_Sub6_Sub2_2860
                                    .anIntArray2523[0]),
                            (Class68_Sub7
                                    .aClass1_Sub6_Sub2_2860
                                    .anIntArray2570[0]),
                            0, 0, i_64_, true, 0,
                            -3, 1, i_65_);
                    if (bool) {
                        Class21renamed.stream.writeByte(i_56_);
                        Class21renamed.stream.writeByte(i_55_);
                        Class21renamed.stream
                                .writeWord(Class8.anInt163);
                        Class21renamed.stream.writeByte(57);
                        Class21renamed.stream
                                .writeByte(Class68_Sub13_Sub26.anInt3883);
                        Class21renamed.stream
                                .writeByte(Class68_Sub20_Sub16.anInt4420);
                        Class21renamed.stream.writeByte(89);
                        Class21renamed.stream.writeWord
                                (
                                        Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561);
                        Class21renamed.stream.writeWord
                                (
                                        Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537);
                        Class21renamed.stream
                                .writeByte(Class32.anInt565);
                        Class21renamed.stream.writeByte(63);
                    }
                }
            }
        }
    }

    static {
        aRSString_4323 = RSString.newRsString(":duelstake:");
        aRSString_4334 = RSString.newRsString("<col=ff7000>");
        aRSString_4331 = RSString.newRsString("::qa_op_test");
    }
}
