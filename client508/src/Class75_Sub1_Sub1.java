/* Class75_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75_Sub1_Sub1 extends Class75_Sub1 {
    public static int anInt4576;
    public static Class98 aClass98_4577;
    public static int anInt4578;
    public static int anInt4579;
    public static int anInt4580;
    public static RSString aRSString_4581 = RSString.newRsString("::gc");
    public static int anInt4582;
    public static int anInt4583;
    public static int anInt4584;
    public static int anInt4585;
    public static Class21renamed aClass21_4586;
    public static RSString aRSString_4587;
    public static Login aLogin_4588;
    public static SignLink signlink;
    public static int anInt4590;
    public static Class21renamed aClass21_4591;

    public static boolean method1391(boolean bool,
                                     Class68_Sub1[][][] class68_sub1s, int i,
                                     int i_0_, int i_1_, byte i_2_) {
        byte i_3_ = !bool ? (byte) (Class3.anInt84 & 0xff) : (byte) 1;
        anInt4576++;
        if (Class68_Sub20.aByteArrayArrayArray3095[GameSocket.anInt1149][i_0_][i]
                == i_3_)
            return false;
        if ((Class64.aByteArrayArrayArray1178[GameSocket.anInt1149][i_0_][i] & 0x4
                ^ 0xffffffff)
                == -1)
            return false;
        int i_4_ = 0;
        Class68_Sub13_Sub37.anIntArray4066[i_4_] = i_0_;
        int i_5_ = -107 % ((i_2_ - -16) / 61);
        int i_6_ = 0;
        Class68_Sub13_Sub21.anIntArray3797[i_4_++] = i;
        Class68_Sub20.aByteArrayArrayArray3095[GameSocket.anInt1149][i_0_][i]
                = i_3_;
        while ((i_6_ ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
            int i_7_ = ((Class68_Sub13_Sub37.anIntArray4066[i_6_] & 0xff5d07)
                    >> -1540119312);
            int i_8_ = Class68_Sub13_Sub37.anIntArray4066[i_6_] & 0xffff;
            int i_9_ = (Class68_Sub13_Sub37.anIntArray4066[i_6_] >> 1343402392
                    & 0xff);
            int i_10_ = 0xffff & Class68_Sub13_Sub21.anIntArray3797[i_6_];
            int i_11_ = ((0xff055a & Class68_Sub13_Sub21.anIntArray3797[i_6_])
                    >> 217901552);
            boolean bool_12_ = false;
            i_6_ = i_6_ + 1 & 0xfff;
            if ((0x4 & (Class64.aByteArrayArrayArray1178[GameSocket.anInt1149]
                    [i_8_][i_10_])
                    ^ 0xffffffff)
                    == -1)
                bool_12_ = true;
            boolean bool_13_ = false;
            while_144_:
            for (int i_14_ = GameSocket.anInt1149 - -1;
                 (i_14_ ^ 0xffffffff) >= -4; i_14_++) {
                if ((0x8 & Class64.aByteArrayArrayArray1178[i_14_][i_8_][i_10_]
                        ^ 0xffffffff)
                        == -1) {
                    if (bool_12_
                            && class68_sub1s[i_14_][i_8_][i_10_] != null) {
                        if (class68_sub1s[i_14_][i_8_][i_10_].aClass64_2757
                                != null) {
                            int i_15_ = Class91.method1520(i_7_, false);
                            if (((i_15_ ^ 0xffffffff)
                                    == ((class68_sub1s[i_14_][i_8_][i_10_]
                                    .aClass64_2757.anInt1187)
                                    ^ 0xffffffff))
                                    || ((i_15_ ^ 0xffffffff)
                                    == ((class68_sub1s[i_14_][i_8_][i_10_]
                                    .aClass64_2757.anInt1177)
                                    ^ 0xffffffff)))
                                continue;
                            if (i_9_ != 0) {
                                int i_16_ = Class91.method1520(i_9_, false);
                                if ((class68_sub1s[i_14_][i_8_][i_10_]
                                        .aClass64_2757.anInt1187) == i_16_
                                        || ((i_16_ ^ 0xffffffff)
                                        == ((class68_sub1s[i_14_][i_8_][i_10_]
                                        .aClass64_2757.anInt1177)
                                        ^ 0xffffffff)))
                                    continue;
                            }
                            if (i_11_ != 0) {
                                int i_17_ = Class91.method1520(i_11_, false);
                                if (((class68_sub1s[i_14_][i_8_][i_10_]
                                        .aClass64_2757.anInt1187)
                                        ^ 0xffffffff) == (i_17_ ^ 0xffffffff)
                                        || ((class68_sub1s[i_14_][i_8_][i_10_]
                                        .aClass64_2757.anInt1177)
                                        ^ 0xffffffff) == (i_17_ ^ 0xffffffff))
                                    continue;
                            }
                        }
                        if (class68_sub1s[i_14_][i_8_][i_10_].aClass69Array2772
                                != null) {
                            for (int i_18_ = 0; ((i_18_ ^ 0xffffffff)
                                    > ((class68_sub1s[i_14_][i_8_]
                                    [i_10_].anInt2771)
                                    ^ 0xffffffff)); i_18_++) {
                                int i_19_
                                        = (int) (0x3fL
                                        & ((class68_sub1s[i_14_][i_8_]
                                        [i_10_].aClass69Array2772
                                        [i_18_].aLong1243)
                                        >> -594552946));
                                if (i_19_ == 21)
                                    i_19_ = 19;
                                int i_20_
                                        = (int) (0x3L
                                        & ((class68_sub1s[i_14_][i_8_]
                                        [i_10_].aClass69Array2772
                                        [i_18_].aLong1243)
                                        >> -793082092));
                                int i_21_ = i_20_ << 2086889734 | i_19_;
                                if ((i_21_ ^ 0xffffffff) == (i_7_ ^ 0xffffffff)
                                        || i_9_ != 0 && i_9_ == i_21_
                                        || ((i_11_ ^ 0xffffffff) != -1
                                        && ((i_21_ ^ 0xffffffff)
                                        == (i_11_ ^ 0xffffffff))))
                                    continue while_144_;
                            }
                        }
                    }
                    bool_13_ = true;
                    Class68_Sub1 class68_sub1
                            = class68_sub1s[i_14_][i_8_][i_10_];
                    if (class68_sub1 != null && class68_sub1.anInt2771 > 0) {
                        for (int i_22_ = 0;
                             ((class68_sub1.anInt2771 ^ 0xffffffff)
                                     < (i_22_ ^ 0xffffffff));
                             i_22_++) {
                            Class69 class69
                                    = class68_sub1.aClass69Array2772[i_22_];
                            if (((class69.anInt1238 ^ 0xffffffff)
                                    != (class69.anInt1254 ^ 0xffffffff))
                                    || ((class69.anInt1234 ^ 0xffffffff)
                                    != (class69.anInt1253 ^ 0xffffffff))) {
                                for (int i_23_ = class69.anInt1254;
                                     ((class69.anInt1238 ^ 0xffffffff)
                                             <= (i_23_ ^ 0xffffffff));
                                     i_23_++) {
                                    for (int i_24_ = class69.anInt1253;
                                         ((class69.anInt1234 ^ 0xffffffff)
                                                 <= (i_24_ ^ 0xffffffff));
                                         i_24_++)
                                        Class68_Sub20
                                                .aByteArrayArrayArray3095[i_14_]
                                                [i_23_][i_24_]
                                                = i_3_;
                                }
                            }
                        }
                    }
                    Class68_Sub20.aByteArrayArrayArray3095[i_14_][i_8_][i_10_]
                            = i_3_;
                }
            }
            if (bool_13_) {
                if (Class21_Sub1.anIntArray2693[i_1_]
                        < (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [GameSocket.anInt1149 + 1][i_8_][i_10_]))
                    Class21_Sub1.anIntArray2693[i_1_]
                            = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                            [GameSocket.anInt1149 - -1][i_8_][i_10_]);
                int i_25_ = i_8_ << 423249287;
                if (i_25_ >= PlayerDefinition.anIntArray2180[i_1_]) {
                    if ((i_25_ ^ 0xffffffff)
                            < (Class7.anIntArray134[i_1_] ^ 0xffffffff))
                        Class7.anIntArray134[i_1_] = i_25_;
                } else
                    PlayerDefinition.anIntArray2180[i_1_] = i_25_;
                int i_26_ = i_10_ << 1915620551;
                if ((i_26_ ^ 0xffffffff)
                        > (Class68_Sub20_Sub16.anIntArray4408[i_1_] ^ 0xffffffff))
                    Class68_Sub20_Sub16.anIntArray4408[i_1_] = i_26_;
                else if ((i_26_ ^ 0xffffffff)
                        < (Login.anIntArray1510[i_1_] ^ 0xffffffff))
                    Login.anIntArray1510[i_1_] = i_26_;
            }
            if (!bool_12_) {
                if ((i_8_ ^ 0xffffffff) <= -2
                        && (Class68_Sub20.aByteArrayArrayArray3095
                        [GameSocket.anInt1149][i_8_ + -1][i_10_]) != i_3_) {
                    Class68_Sub13_Sub37.anIntArray4066[i_4_]
                            = Class70.method1335(Class70.method1335(1179648,
                            i_8_ + -1),
                            -754974720);
                    Class68_Sub13_Sub21.anIntArray3797[i_4_]
                            = Class70.method1335(1245184, i_10_);
                    i_4_ = 1 + i_4_ & 0xfff;
                    Class68_Sub20.aByteArrayArrayArray3095
                            [GameSocket.anInt1149][i_8_ + -1][i_10_]
                            = i_3_;
                }
                if ((++i_10_ ^ 0xffffffff) > -105) {
                    if (i_8_ - 1 >= 0
                            && i_3_ != (Class68_Sub20.aByteArrayArrayArray3095
                            [GameSocket.anInt1149][-1 + i_8_][i_10_])
                            && ((Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149][i_8_][i_10_]) & 0x4
                            ^ 0xffffffff) == -1
                            && ((Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149][-1 + i_8_][i_10_ - 1])
                            & 0x4) == 0) {
                        Class68_Sub13_Sub37.anIntArray4066[i_4_]
                                = Class70.method1335(Class70.method1335(1179648,
                                i_8_ + -1),
                                1375731712);
                        Class68_Sub13_Sub21.anIntArray3797[i_4_]
                                = Class70.method1335(i_10_, 1245184);
                        i_4_ = 1 + i_4_ & 0xfff;
                        Class68_Sub20.aByteArrayArrayArray3095
                                [GameSocket.anInt1149][i_8_ - 1][i_10_]
                                = i_3_;
                    }
                    if ((i_3_ ^ 0xffffffff)
                            != ((Class68_Sub20.aByteArrayArrayArray3095
                            [GameSocket.anInt1149][i_8_][i_10_])
                            ^ 0xffffffff)) {
                        Class68_Sub13_Sub37.anIntArray4066[i_4_]
                                = Class70.method1335(Class70.method1335(5373952,
                                i_8_),
                                318767104);
                        Class68_Sub13_Sub21.anIntArray3797[i_4_]
                                = Class70.method1335(5439488, i_10_);
                        i_4_ = i_4_ + 1 & 0xfff;
                        Class68_Sub20.aByteArrayArrayArray3095
                                [GameSocket.anInt1149][i_8_][i_10_]
                                = i_3_;
                    }
                    if (1 + i_8_ < 104
                            && ((Class68_Sub20.aByteArrayArrayArray3095
                            [GameSocket.anInt1149][1 + i_8_][i_10_])
                            ^ 0xffffffff) != (i_3_ ^ 0xffffffff)
                            && (0x4 & (Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149][i_8_][i_10_])) == 0
                            && (0x4 & (Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149][1 + i_8_][i_10_ - 1])
                            ^ 0xffffffff) == -1) {
                        Class68_Sub13_Sub37.anIntArray4066[i_4_]
                                = Class70.method1335(Class70.method1335(1 + i_8_,
                                5373952),
                                -1845493760);
                        Class68_Sub13_Sub21.anIntArray3797[i_4_]
                                = Class70.method1335(5439488, i_10_);
                        Class68_Sub20.aByteArrayArrayArray3095
                                [GameSocket.anInt1149][i_8_ - -1][i_10_]
                                = i_3_;
                        i_4_ = 1 + i_4_ & 0xfff;
                    }
                }
                i_10_--;
                if ((i_8_ - -1 ^ 0xffffffff) > -105
                        && (Class68_Sub20.aByteArrayArrayArray3095
                        [GameSocket.anInt1149][1 + i_8_][i_10_]) != i_3_) {
                    Class68_Sub13_Sub37.anIntArray4066[i_4_]
                            = Class70.method1335(1392508928,
                            Class70.method1335(1 + i_8_,
                                    9568256));
                    Class68_Sub13_Sub21.anIntArray3797[i_4_]
                            = Class70.method1335(i_10_, 9633792);
                    i_4_ = i_4_ - -1 & 0xfff;
                    Class68_Sub20.aByteArrayArrayArray3095
                            [GameSocket.anInt1149][1 + i_8_][i_10_]
                            = i_3_;
                }
                if (--i_10_ >= 0) {
                    if ((i_8_ + -1 ^ 0xffffffff) <= -1
                            && ((i_3_ ^ 0xffffffff)
                            != ((Class68_Sub20.aByteArrayArrayArray3095
                            [GameSocket.anInt1149][-1 + i_8_][i_10_])
                            ^ 0xffffffff))
                            && ((Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149][i_8_][i_10_])
                            & 0x4) == 0
                            && (0x4 & (Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149][i_8_ + -1][i_10_ + 1])
                            ^ 0xffffffff) == -1) {
                        Class68_Sub13_Sub37.anIntArray4066[i_4_]
                                = Class70.method1335(Class70.method1335(13762560,
                                i_8_ + -1),
                                301989888);
                        Class68_Sub13_Sub21.anIntArray3797[i_4_]
                                = Class70.method1335(i_10_, 13828096);
                        i_4_ = 0xfff & i_4_ + 1;
                        Class68_Sub20.aByteArrayArrayArray3095
                                [GameSocket.anInt1149][i_8_ + -1][i_10_]
                                = i_3_;
                    }
                    if (((Class68_Sub20.aByteArrayArrayArray3095
                            [GameSocket.anInt1149][i_8_][i_10_])
                            ^ 0xffffffff)
                            != (i_3_ ^ 0xffffffff)) {
                        Class68_Sub13_Sub37.anIntArray4066[i_4_]
                                = Class70.method1335(Class70.method1335(i_8_,
                                13762560),
                                -1828716544);
                        Class68_Sub13_Sub21.anIntArray3797[i_4_]
                                = Class70.method1335(i_10_, 13828096);
                        Class68_Sub20.aByteArrayArrayArray3095
                                [GameSocket.anInt1149][i_8_][i_10_]
                                = i_3_;
                        i_4_ = 0xfff & 1 + i_4_;
                    }
                    if (i_8_ + 1 < 104
                            && ((i_3_ ^ 0xffffffff)
                            != ((Class68_Sub20.aByteArrayArrayArray3095
                            [GameSocket.anInt1149][1 + i_8_][i_10_])
                            ^ 0xffffffff))
                            && (0x4 & (Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149][i_8_][i_10_])
                            ^ 0xffffffff) == -1
                            && ((Class64.aByteArrayArrayArray1178
                            [GameSocket.anInt1149][1 + i_8_][1 + i_10_]) & 0x4
                            ^ 0xffffffff) == -1) {
                        Class68_Sub13_Sub37.anIntArray4066[i_4_]
                                = Class70.method1335(Class70.method1335(9568256,
                                i_8_ + 1),
                                -771751936);
                        Class68_Sub13_Sub21.anIntArray3797[i_4_]
                                = Class70.method1335(9633792, i_10_);
                        i_4_ = i_4_ - -1 & 0xfff;
                        Class68_Sub20.aByteArrayArrayArray3095
                                [GameSocket.anInt1149][i_8_ + 1][i_10_]
                                = i_3_;
                    }
                }
            }
        }
        if (Class21_Sub1.anIntArray2693[i_1_] != -1000000) {
            Class21_Sub1.anIntArray2693[i_1_] += 10;
            PlayerDefinition.anIntArray2180[i_1_] -= 50;
            Class7.anIntArray134[i_1_] += 50;
            Login.anIntArray1510[i_1_] += 50;
            Class68_Sub20_Sub16.anIntArray4408[i_1_] -= 50;
        }
        return true;
    }

    public static void method1392(boolean bool) {
        if (bool == true) {
            anInt4582++;
            Class68_Sub13_Sub27.aClass98_3893.method1566((byte) 94);
            Class68_Sub20_Sub14.aClass98_4372.method1566((byte) 94);
        }
    }

    public static void method1393(int i, Stream class68_sub14) {
        anInt4583++;
        if (i < 28)
            aLogin_4588 = null;
        int i_27_ = Class75_Sub3.anInt3327 >> 148444930 << -2024238198;
        byte[][] is = new byte[Class68_Sub6.anInt2846][Class103.anInt1768];
        int i_28_ = Class101.anInt1744 >> 719721857;
        while ((class68_sub14.buffer.length ^ 0xffffffff)
                < (class68_sub14.currentOffset ^ 0xffffffff)) {
            int i_29_ = 0;
            int i_30_ = 0;
            boolean bool = false;
            if ((class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2) {
                i_29_ = class68_sub14.readUnsignedByte(-6677);
                i_30_ = class68_sub14.readUnsignedByte(-6677);
                bool = true;
            }
            int i_31_ = class68_sub14.readUnsignedByte(-6677);
            int i_32_ = class68_sub14.readUnsignedByte(-6677);
            int i_33_ = -Class70.anInt1273 + i_31_ * 64;
            int i_34_ = (Class103.anInt1768
                    + (-1 - (-Class68_Sub1.anInt2760 + i_32_ * 64)));
            if ((i_33_ ^ 0xffffffff) > -1 || -63 + i_34_ < 0
                    || 63 + i_33_ >= Class68_Sub6.anInt2846
                    || Class103.anInt1768 <= i_34_) {
                if (bool)
                    class68_sub14.currentOffset += 64;
                else
                    class68_sub14.currentOffset += 4096;
            } else {
                for (int i_35_ = 0; i_35_ < 64; i_35_++) {
                    byte[] is_36_ = is[i_35_ + i_33_];
                    for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > -65; i_37_++) {
                        if (!bool
                                || ((8 * i_29_ ^ 0xffffffff) >= (i_35_
                                ^ 0xffffffff)
                                && 8 + 8 * i_29_ > i_35_
                                && (i_37_ ^ 0xffffffff) <= (i_30_ * 8
                                ^ 0xffffffff)
                                && ((8 * i_30_ - -8 ^ 0xffffffff)
                                < (i_37_ ^ 0xffffffff))))
                            is_36_[i_34_ + -i_37_]
                                    = class68_sub14.method955(3390);
                    }
                }
            }
        }
        int i_38_ = Class68_Sub6.anInt2846;
        int i_39_ = Class103.anInt1768;
        int[] is_40_ = new int[i_39_];
        int[] is_41_ = new int[i_39_];
        int[] is_42_ = new int[i_39_];
        int[] is_43_ = new int[i_39_];
        int[] is_44_ = new int[i_39_];
        for (int i_45_ = -5; i_45_ < i_38_; i_45_++) {
            for (int i_46_ = 0; i_39_ > i_46_; i_46_++) {
                int i_47_ = i_45_ - -5;
                if (i_38_ > i_47_) {
                    int i_48_ = 0xff & is[i_47_][i_46_];
                    if ((i_48_ ^ 0xffffffff) < -1) {
                        Class53 class53
                                = Class68_Sub13_Sub2.method707(i_48_ - 1,
                                (byte) -128);
                        is_42_[i_46_] += class53.anInt1022;
                        is_40_[i_46_] += class53.anInt1027;
                        is_41_[i_46_] += class53.anInt1017;
                        is_43_[i_46_] += class53.anInt1015;
                        is_44_[i_46_]++;
                    }
                }
                int i_49_ = i_45_ - 5;
                if ((i_49_ ^ 0xffffffff) <= -1) {
                    int i_50_ = is[i_49_][i_46_] & 0xff;
                    if (i_50_ > 0) {
                        Class53 class53
                                = Class68_Sub13_Sub2.method707(i_50_ - 1,
                                (byte) -128);
                        is_42_[i_46_] -= class53.anInt1022;
                        is_40_[i_46_] -= class53.anInt1027;
                        is_41_[i_46_] -= class53.anInt1017;
                        is_43_[i_46_] -= class53.anInt1015;
                        is_44_[i_46_]--;
                    }
                }
            }
            if (i_45_ >= 0) {
                int i_51_ = 0;
                int[][] is_52_
                        = Class33.anIntArrayArrayArray584[i_45_ >> -1012151354];
                int i_53_ = 0;
                int i_54_ = 0;
                int i_55_ = 0;
                int i_56_ = 0;
                for (int i_57_ = -5;
                     (i_57_ ^ 0xffffffff) > (i_39_ ^ 0xffffffff); i_57_++) {
                    int i_58_ = i_57_ + -5;
                    int i_59_ = 5 + i_57_;
                    if (i_39_ > i_59_) {
                        i_51_ += is_42_[i_59_];
                        i_53_ += is_40_[i_59_];
                        i_55_ += is_44_[i_59_];
                        i_54_ += is_41_[i_59_];
                        i_56_ += is_43_[i_59_];
                    }
                    if ((i_58_ ^ 0xffffffff) <= -1) {
                        i_55_ -= is_44_[i_58_];
                        i_51_ -= is_42_[i_58_];
                        i_54_ -= is_41_[i_58_];
                        i_56_ -= is_43_[i_58_];
                        i_53_ -= is_40_[i_58_];
                    }
                    if ((i_57_ ^ 0xffffffff) <= -1
                            && (i_55_ ^ 0xffffffff) < -1) {
                        int[] is_60_ = is_52_[i_57_ >> -226701594];
                        int i_61_
                                = ((i_56_ ^ 0xffffffff) == -1 ? 0
                                : Class68_Sub9.method677(i_53_ / i_55_,
                                (byte) -82,
                                i_54_ / i_55_,
                                i_51_ * 256 / i_56_));
                        if (is[i_45_][i_57_] == 0) {
                            if (is_60_ != null)
                                is_60_[(Class120.method1740(63, i_45_)
                                        + (Class120.method1740(63, i_57_)
                                        << -1613445434))]
                                        = 0;
                        } else {
                            if (is_60_ == null)
                                is_60_ = is_52_[i_57_ >> 1409522502]
                                        = new int[4096];
                            int i_62_ = i_28_ + (i_61_ & 0x7f);
                            if ((i_62_ ^ 0xffffffff) > -1)
                                i_62_ = 0;
                            else if ((i_62_ ^ 0xffffffff) < -128)
                                i_62_ = 127;
                            int i_63_ = (i_62_ + (i_61_ + i_27_ & 0xfc00)
                                    - -(0x380 & i_61_));
                            is_60_[(Class120.method1740(63, i_45_)
                                    + (Class120.method1740(63, i_57_)
                                    << 277041574))]
                                    = (Class62.anIntArray1158
                                    [Class4.method185(2, 96, i_63_)]);
                        }
                    }
                }
            }
        }
    }

    public static int method1394(byte i, int i_64_, int i_65_) {
        if (i != 20)
            return -120;
        anInt4580++;
        int i_66_ = -1 + i_65_ & i_64_ >> 516948031;
        return (i_64_ + (i_64_ >>> 1824539903)) % i_65_ - -i_66_;
    }

    public static void method1395(byte i, Class68_Sub28 class68_sub28) {
        if (i < -3) {
            class68_sub28.aBoolean3227 = false;
            anInt4579++;
            if (class68_sub28.aClass68_Sub11_3225 != null)
                class68_sub28.aClass68_Sub11_3225.anInt2915 = 0;
            for (Class68_Sub28 class68_sub28_67_ = class68_sub28.method1226();
                 class68_sub28_67_ != null;
                 class68_sub28_67_ = class68_sub28.method1228())
                method1395((byte) -10, class68_sub28_67_);
        }
    }

    public static void method1396(byte i) {
        if (i != 15)
            method1394((byte) -48, 88, 69);
        aClass98_4577 = null;
        aRSString_4581 = null;
        aClass21_4591 = null;
        aClass21_4586 = null;
        signlink = null;
        aRSString_4587 = null;
        aLogin_4588 = null;
    }

    static {
        aClass98_4577 = new Class98(5);
        anInt4585 = 0;
        aRSString_4587 = RSString.newRsString("Lade Wordpack )2 ");
        aLogin_4588 = new Login(64);
        anInt4590 = 0;
    }
}
