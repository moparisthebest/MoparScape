/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.zip.Inflater;

public class Class114 {
    public Inflater anInflater1924;
    public static int anInt1925;
    public static RSString aRSString_1926
            = RSString.newRsString("blinken3:");
    public static int anInt1927;
    public static RSString aRSString_1928;
    public static int anInt1929;
    public static RSString aRSString_1930;
    public static int anInt1931;
    public static RSString aRSString_1932;
    public static int anInt1933;
    public static int anInt1934;
    public static int anInt1935;
    public static int anInt1936;
    public static byte[][] aByteArrayArray1937;
    public static int anInt1938;

    public void method1688(Stream class68_sub14, int i, byte[] is) {
        try {
            anInt1935++;
            if ((class68_sub14.buffer[class68_sub14.currentOffset]
                    ^ 0xffffffff) != -32
                    || (class68_sub14.buffer[1 + class68_sub14.currentOffset]
                    ^ 0xffffffff) != 116)
                throw new RuntimeException("Invalid GZIP header!");
            if (anInflater1924 == null)
                anInflater1924 = new Inflater(true);
            try {
                anInflater1924.setInput(class68_sub14.buffer,
                        class68_sub14.currentOffset + 10,
                        (-class68_sub14.currentOffset
                                - (10
                                - (-8
                                + (class68_sub14
                                .buffer).length))));
                anInflater1924.inflate(is);
            } catch (Exception exception) {
                anInflater1924.reset();
                throw new RuntimeException("Invalid GZIP compressed data!");
            }
            if (i < 98)
                method1692(-48);
            anInflater1924.reset();
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("th.D("
                            + (class68_sub14 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (is != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method1689(boolean bool) {
        aRSString_1928 = null;
        aRSString_1930 = null;
        if (bool != true)
            anInt1925 = 70;
        aRSString_1926 = null;
        aRSString_1932 = null;
        aByteArrayArray1937 = null;
    }

    public static void method1690(byte i, boolean bool, GroundData[] class38s) {
        anInt1931++;
        if (i != -111)
            method1689(true);
        int i_0_;
        if (!bool)
            i_0_ = 4;
        else
            i_0_ = 1;
        if (!bool) {
            for (int i_1_ = 0; i_1_ < 4; i_1_++) {
                for (int i_2_ = 0; i_2_ < 104; i_2_++) {
                    for (int i_3_ = 0; i_3_ < 104; i_3_++) {
                        if ((0x1 & (Class64.aByteArrayArrayArray1178[i_1_]
                                [i_2_][i_3_])
                                ^ 0xffffffff)
                                == -2) {
                            int i_4_ = i_1_;
                            if (((Class64.aByteArrayArrayArray1178[1][i_2_]
                                    [i_3_]) & 0x2
                                    ^ 0xffffffff)
                                    == -3)
                                i_4_--;
                            if (i_4_ >= 0)
                                class38s[i_4_].method443(i_3_, (byte) -52,
                                        i_2_);
                        }
                    }
                }
            }
            Class18.anInt316 += -2 + (int) (5.0 * Math.random());
            Class1_Sub1.anInt2424 += (int) (Math.random() * 5.0) - 2;
            if (Class18.anInt316 < -16)
                Class18.anInt316 = -16;
            if (Class1_Sub1.anInt2424 < -8)
                Class1_Sub1.anInt2424 = -8;
            if (Class1_Sub1.anInt2424 > 8)
                Class1_Sub1.anInt2424 = 8;
            if ((Class18.anInt316 ^ 0xffffffff) < -17)
                Class18.anInt316 = 16;
        }
        int[][] is = new int[104][104];
        int[][] is_5_ = new int[104][104];
        int i_6_ = Class1_Sub1.anInt2424 >> 637325858 << 414480426;
        int i_7_ = Class18.anInt316 >> 143231457;
        for (int i_8_ = 0; i_8_ < i_0_; i_8_++) {
            byte[][] is_9_ = GroundData.aByteArrayArrayArray676[i_8_];
            int i_10_ = (int) Math.sqrt(5100.0);
            int i_11_ = 768 * i_10_ >> 1083611208;
            for (int i_12_ = 1; (i_12_ ^ 0xffffffff) > -104; i_12_++) {
                for (int i_13_ = 1; i_13_ < 103; i_13_++) {
                    int i_14_
                            = ((Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_8_]
                            [1 + i_13_][i_12_])
                            + -(Class68_Sub20_Sub12.anIntArrayArrayArray4353
                            [i_8_][-1 + i_13_][i_12_]));
                    int i_15_ = 74;
                    int i_16_
                            = ((Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_8_]
                            [i_13_][i_12_ - -1])
                            + -(Class68_Sub20_Sub12.anIntArrayArrayArray4353
                            [i_8_][i_13_][i_12_ + -1]));
                    int i_17_
                            = (int) Math.sqrt((double) (i_14_ * i_14_
                            - (-65536
                            - i_16_ * i_16_)));
                    int i_18_ = (i_14_ << -1151407800) / i_17_;
                    int i_19_ = -65536 / i_17_;
                    int i_20_ = (i_16_ << 2145368648) / i_17_;
                    i_15_ += ((i_20_ * -50 + (i_18_ * -50 - -(-10 * i_19_)))
                            / i_11_);
                    int i_21_ = ((is_9_[i_13_][i_12_] >> -1329701343)
                            + ((is_9_[i_13_][1 + i_12_] >> 1622509059)
                            + (is_9_[i_13_][-1 + i_12_] >> -314110558))
                            + ((is_9_[i_13_ + -1][i_12_] >> -317261150)
                            + (is_9_[i_13_ + 1][i_12_] >> 280372739)));
                    is[i_13_][i_12_] = -i_21_ + i_15_;
                }
            }
            for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -105; i_22_++) {
                Stream.anIntArray3005[i_22_] = 0;
                Class68_Sub13_Sub15.anIntArray3679[i_22_] = 0;
                Class64.anIntArray1180[i_22_] = 0;
                Class14.anIntArray236[i_22_] = 0;
                Class68_Sub13_Sub22.anIntArray3805[i_22_] = 0;
            }
            for (int i_23_ = -5; i_23_ < 104; i_23_++) {
                for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -105; i_24_++) {
                    int i_25_ = i_23_ - -5;
                    if ((i_25_ ^ 0xffffffff) > -105) {
                        int i_26_ = 0xff & (Class52.aByteArrayArrayArray1014
                                [i_8_][i_25_][i_24_]);
                        if (i_26_ > 0) {
                            Class53 class53
                                    = Class68_Sub13_Sub2.method707(-1 + i_26_,
                                    (byte) -128);
                            Stream.anIntArray3005[i_24_]
                                    += class53.anInt1022;
                            Class68_Sub13_Sub15.anIntArray3679[i_24_]
                                    += class53.anInt1027;
                            Class64.anIntArray1180[i_24_] += class53.anInt1017;
                            Class14.anIntArray236[i_24_] += class53.anInt1015;
                            Class68_Sub13_Sub22.anIntArray3805[i_24_]++;
                        }
                    }
                    int i_27_ = -5 + i_23_;
                    if (i_27_ >= 0) {
                        int i_28_ = ((Class52.aByteArrayArrayArray1014[i_8_]
                                [i_27_][i_24_])
                                & 0xff);
                        if ((i_28_ ^ 0xffffffff) < -1) {
                            Class53 class53
                                    = Class68_Sub13_Sub2.method707(-1 + i_28_,
                                    (byte) -128);
                            Stream.anIntArray3005[i_24_]
                                    -= class53.anInt1022;
                            Class68_Sub13_Sub15.anIntArray3679[i_24_]
                                    -= class53.anInt1027;
                            Class64.anIntArray1180[i_24_] -= class53.anInt1017;
                            Class14.anIntArray236[i_24_] -= class53.anInt1015;
                            Class68_Sub13_Sub22.anIntArray3805[i_24_]--;
                        }
                    }
                }
                if ((i_23_ ^ 0xffffffff) <= -1) {
                    int i_29_ = 0;
                    int i_30_ = 0;
                    int i_31_ = 0;
                    int i_32_ = 0;
                    int i_33_ = 0;
                    for (int i_34_ = -5; (i_34_ ^ 0xffffffff) > -105;
                         i_34_++) {
                        int i_35_ = i_34_ + -5;
                        int i_36_ = i_34_ + 5;
                        if (i_36_ < 104) {
                            i_31_ += Class14.anIntArray236[i_36_];
                            i_32_ += Class68_Sub13_Sub22.anIntArray3805[i_36_];
                            i_33_ += Class64.anIntArray1180[i_36_];
                            i_29_ += Stream.anIntArray3005[i_36_];
                            i_30_ += Class68_Sub13_Sub15.anIntArray3679[i_36_];
                        }
                        if (i_35_ >= 0) {
                            i_30_ -= Class68_Sub13_Sub15.anIntArray3679[i_35_];
                            i_33_ -= Class64.anIntArray1180[i_35_];
                            i_32_ -= Class68_Sub13_Sub22.anIntArray3805[i_35_];
                            i_29_ -= Stream.anIntArray3005[i_35_];
                            i_31_ -= Class14.anIntArray236[i_35_];
                        }
                        if ((i_34_ ^ 0xffffffff) <= -1 && i_32_ > 0)
                            is_5_[i_23_][i_34_]
                                    = Class68_Sub9.method677(i_30_ / i_32_,
                                    (byte) -76,
                                    i_33_ / i_32_,
                                    256 * i_29_ / i_31_);
                    }
                }
            }
            for (int i_37_ = 1; i_37_ < 103; i_37_++) {
                for (int i_38_ = 1; i_38_ < 103; i_38_++) {
                    if (bool || Class28.method398(i + 24892)
                            || (0x2 & (Class64.aByteArrayArrayArray1178[0][i_37_]
                            [i_38_])) != 0
                            || (((Class64.aByteArrayArrayArray1178[i_8_][i_37_]
                            [i_38_])
                            & 0x10) == 0
                            && (Class86.method1484(i_38_, i_8_, i_37_,
                            (byte) -103)
                            == Class68_Sub13_Sub18.anInt3737))) {
                        if (Class68_Sub25.anInt3174 > i_8_)
                            Class68_Sub25.anInt3174 = i_8_;
                        int i_39_ = ((Class52.aByteArrayArrayArray1014[i_8_]
                                [i_37_][i_38_])
                                & 0xff);
                        int i_40_
                                = ((Class68_Sub13_Sub35.aByteArrayArrayArray4028
                                [i_8_][i_37_][i_38_])
                                & 0xff);
                        if (i_39_ > 0 || (i_40_ ^ 0xffffffff) < -1) {
                            int i_41_
                                    = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                    [i_8_][i_37_][i_38_]);
                            int i_42_
                                    = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                    [i_8_][1 + i_37_][i_38_]);
                            int i_43_
                                    = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                    [i_8_][1 + i_37_][i_38_ + 1]);
                            int i_44_
                                    = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                    [i_8_][i_37_][i_38_ - -1]);
                            if ((i_8_ ^ 0xffffffff) < -1) {
                                boolean bool_45_ = true;
                                if ((i_39_ ^ 0xffffffff) == -1
                                        && ((Class109.aByteArrayArrayArray1847
                                        [i_8_][i_37_][i_38_])
                                        ^ 0xffffffff) != -1)
                                    bool_45_ = false;
                                if ((i_40_ ^ 0xffffffff) < -1
                                        && !(Class94.method1541
                                        ((byte) 53, i_40_ - 1).aBoolean170))
                                    bool_45_ = false;
                                if (bool_45_ && i_41_ == i_42_
                                        && (i_43_ ^ 0xffffffff) == (i_41_
                                        ^ 0xffffffff)
                                        && (i_41_ ^ 0xffffffff) == (i_44_
                                        ^ 0xffffffff))
                                    Class74.anIntArrayArrayArray1336[i_8_]
                                            [i_37_][i_38_]
                                            = (Class70.method1335
                                            ((Class74.anIntArrayArrayArray1336
                                                    [i_8_][i_37_][i_38_]),
                                                    4));
                            }
                            int i_46_;
                            int i_47_;
                            if ((i_39_ ^ 0xffffffff) < -1) {
                                i_47_ = is_5_[i_37_][i_38_];
                                int i_48_ = (0x7f & i_47_) + i_7_;
                                if (i_48_ < 0)
                                    i_48_ = 0;
                                else if ((i_48_ ^ 0xffffffff) < -128)
                                    i_48_ = 127;
                                int i_49_ = i_48_ + ((i_47_ + i_6_ & 0xfc00)
                                        - -(0x380 & i_47_));
                                i_46_ = (Class62.anIntArray1158
                                        [Class4.method185(2, 96, i_49_)]);
                            } else {
                                i_46_ = 0;
                                i_47_ = -1;
                            }
                            int i_50_ = is[i_37_][i_38_];
                            int i_51_ = is[1 + i_37_][i_38_];
                            int i_52_ = is[i_37_][i_38_ - -1];
                            int i_53_ = is[1 + i_37_][1 + i_38_];
                            if (i_40_ != 0) {
                                int i_54_ = ((Class109.aByteArrayArrayArray1847
                                        [i_8_][i_37_][i_38_])
                                        - -1);
                                byte i_55_ = (Class85.aByteArrayArrayArray1554
                                        [i_8_][i_37_][i_38_]);
                                Class9 class9 = Class94.method1541((byte) 53,
                                        i_40_ + -1);
                                int i_56_ = class9.anInt175;
                                if ((i_56_ ^ 0xffffffff) <= -1
                                        && !Class62.anInterface4_1159
                                        .method8((byte) 39, i_56_))
                                    i_56_ = -1;
                                int i_57_;
                                int i_58_;
                                if (i_56_ >= 0) {
                                    i_58_ = -1;
                                    i_57_ = (Class62.anIntArray1158
                                            [(Class53.method547
                                            ((byte) -91,
                                                    Class62.anInterface4_1159
                                                            .method12(i_56_, 121),
                                                    96))]);
                                } else if ((class9.anInt168 ^ 0xffffffff)
                                        == 0) {
                                    i_57_ = 0;
                                    i_58_ = -2;
                                } else {
                                    i_58_ = class9.anInt168;
                                    int i_59_ = i_7_ + (i_58_ & 0x7f);
                                    if ((i_59_ ^ 0xffffffff) > -1)
                                        i_59_ = 0;
                                    else if (i_59_ > 127)
                                        i_59_ = 127;
                                    int i_60_
                                            = i_59_ + ((0x380 & i_58_)
                                            + (0xfc00 & i_6_ + i_58_));
                                    i_57_ = (Class62.anIntArray1158
                                            [Class53.method547((byte) -91,
                                            i_60_, 96)]);
                                }
                                if (class9.anInt172 >= 0) {
                                    int i_61_ = class9.anInt172;
                                    int i_62_ = (i_61_ & 0x7f) + i_7_;
                                    if (i_62_ < 0)
                                        i_62_ = 0;
                                    else if ((i_62_ ^ 0xffffffff) < -128)
                                        i_62_ = 127;
                                    int i_63_ = (i_62_ + (i_61_ & 0x380)
                                            + (0xfc00 & i_6_ + i_61_));
                                    i_57_ = (Class62.anIntArray1158
                                            [Class53.method547((byte) -91,
                                            i_63_, 96)]);
                                }
                                Class68_Sub1.method648
                                        (i_8_, i_37_, i_38_, i_54_, i_55_, i_56_,
                                                i_41_, i_42_, i_43_, i_44_,
                                                Class4.method185(2, i_50_, i_47_),
                                                Class4.method185(i ^ ~0x6c, i_51_, i_47_),
                                                Class4.method185(2, i_53_, i_47_),
                                                Class4.method185(2, i_52_, i_47_),
                                                Class53.method547((byte) -91, i_58_,
                                                        i_50_),
                                                Class53.method547((byte) -91, i_58_,
                                                        i_51_),
                                                Class53.method547((byte) -91, i_58_,
                                                        i_53_),
                                                Class53.method547((byte) -91, i_58_,
                                                        i_52_),
                                                i_46_, i_57_);
                            } else
                                Class68_Sub1.method648
                                        (i_8_, i_37_, i_38_, 0, 0, -1, i_41_,
                                                i_42_, i_43_, i_44_,
                                                Class4.method185(2, i_50_, i_47_),
                                                Class4.method185(2, i_51_, i_47_),
                                                Class4.method185(2, i_53_, i_47_),
                                                Class4.method185(i + 113, i_52_, i_47_),
                                                0, 0, 0, 0, i_46_, 0);
                        }
                    }
                }
            }
            Class52.aByteArrayArrayArray1014[i_8_] = null;
            Class68_Sub13_Sub35.aByteArrayArrayArray4028[i_8_] = null;
            Class109.aByteArrayArrayArray1847[i_8_] = null;
            Class85.aByteArrayArrayArray1554[i_8_] = null;
            GroundData.aByteArrayArrayArray676[i_8_] = null;
        }
        Unknown.method1498(-50, -10, -50);
        if (!bool) {
            for (int i_64_ = 0; (i_64_ ^ 0xffffffff) > -105; i_64_++) {
                for (int i_65_ = 0; i_65_ < 104; i_65_++) {
                    if ((Class64.aByteArrayArrayArray1178[1][i_64_][i_65_]
                            & 0x2)
                            == 2)
                        Class68_Sub13_Sub11.method748(i_64_, i_65_);
                }
            }
            for (int i_66_ = 0; i_66_ < 4; i_66_++) {
                for (int i_67_ = 0; (i_67_ ^ 0xffffffff) >= -105; i_67_++) {
                    for (int i_68_ = 0; i_68_ <= 104; i_68_++) {
                        if ((0x1 & (Class74.anIntArrayArrayArray1336[i_66_]
                                [i_68_][i_67_])
                                ^ 0xffffffff)
                                != -1) {
                            int i_69_;
                            for (i_69_ = i_67_;
                                 ((i_69_ ^ 0xffffffff) > -105
                                         && (0x1 & (Class74.anIntArrayArrayArray1336
                                         [i_66_][i_68_][1 + i_69_])) != 0);
                                 i_69_++) {
                                /* empty */
                            }
                            int i_70_ = i_66_;
                            int i_71_ = i_66_;
                            int i_72_;
                            for (i_72_ = i_67_; i_72_ > 0; i_72_--) {
                                if (((Class74.anIntArrayArrayArray1336[i_66_]
                                        [i_68_][i_72_ - 1]) & 0x1
                                        ^ 0xffffffff)
                                        == -1)
                                    break;
                            }
                            while_157_:
                            for (/**/; (i_70_ ^ 0xffffffff) < -1; i_70_--) {
                                for (int i_73_ = i_72_; i_73_ <= i_69_;
                                     i_73_++) {
                                    if (((Class74.anIntArrayArrayArray1336
                                            [-1 + i_70_][i_68_][i_73_]) & 0x1
                                            ^ 0xffffffff)
                                            == -1)
                                        break while_157_;
                                }
                            }
                            while_158_:
                            for (/**/; (i_71_ ^ 0xffffffff) > -4; i_71_++) {
                                for (int i_74_ = i_72_;
                                     ((i_69_ ^ 0xffffffff)
                                             <= (i_74_ ^ 0xffffffff));
                                     i_74_++) {
                                    if (((Class74.anIntArrayArrayArray1336
                                            [1 + i_71_][i_68_][i_74_])
                                            & 0x1)
                                            == 0)
                                        break while_158_;
                                }
                            }
                            int i_75_
                                    = (1 + i_69_ - i_72_) * (1 + (i_71_ + -i_70_));
                            if ((i_75_ ^ 0xffffffff) <= -9) {
                                int i_76_ = 240;
                                int i_77_ = (Class68_Sub20_Sub12
                                        .anIntArrayArrayArray4353[i_70_]
                                        [i_68_][i_72_]);
                                int i_78_ = ((Class68_Sub20_Sub12
                                        .anIntArrayArrayArray4353[i_71_]
                                        [i_68_][i_72_])
                                        - i_76_);
                                Class28.method397(1, 128 * i_68_, i_68_ * 128,
                                        i_72_ * 128,
                                        i_69_ * 128 + 128, i_78_,
                                        i_77_);
                                for (int i_79_ = i_70_;
                                     ((i_71_ ^ 0xffffffff)
                                             <= (i_79_ ^ 0xffffffff));
                                     i_79_++) {
                                    for (int i_80_ = i_72_; i_69_ >= i_80_;
                                         i_80_++)
                                        Class74.anIntArrayArrayArray1336
                                                [i_79_][i_68_][i_80_]
                                                = (Class120.method1740
                                                ((Class74
                                                        .anIntArrayArrayArray1336
                                                        [i_79_][i_68_][i_80_]),
                                                        -2));
                                }
                            }
                        }
                        if (((Class74.anIntArrayArrayArray1336[i_66_][i_68_]
                                [i_67_])
                                & 0x2)
                                != 0) {
                            int i_81_ = i_68_;
                            int i_82_ = i_68_;
                            int i_83_ = i_66_;
                            for (/**/;
                                     ((i_81_ ^ 0xffffffff) < -1
                                             && ((0x2 & (Class74.anIntArrayArrayArray1336
                                             [i_66_][i_81_ + -1][i_67_]))
                                             != 0));
                                     i_81_--) {
                                /* empty */
                            }
                            int i_84_ = i_66_;
                            for (/**/; (i_82_ ^ 0xffffffff) > -105; i_82_++) {
                                if (((Class74.anIntArrayArrayArray1336[i_66_]
                                        [i_82_ - -1][i_67_])
                                        & 0x2)
                                        == 0)
                                    break;
                            }
                            while_159_:
                            for (/**/; (i_83_ ^ 0xffffffff) < -1; i_83_--) {
                                for (int i_85_ = i_81_; i_85_ <= i_82_;
                                     i_85_++) {
                                    if (((Class74.anIntArrayArrayArray1336
                                            [i_83_ - 1][i_85_][i_67_])
                                            & 0x2)
                                            == 0)
                                        break while_159_;
                                }
                            }
                            while_160_:
                            for (/**/; (i_84_ ^ 0xffffffff) > -4; i_84_++) {
                                for (int i_86_ = i_81_; i_82_ >= i_86_;
                                     i_86_++) {
                                    if (((Class74.anIntArrayArrayArray1336
                                            [1 + i_84_][i_86_][i_67_]) & 0x2
                                            ^ 0xffffffff)
                                            == -1)
                                        break while_160_;
                                }
                            }
                            int i_87_ = ((i_82_ + -i_81_ + 1)
                                    * (i_84_ + (1 + -i_83_)));
                            if ((i_87_ ^ 0xffffffff) <= -9) {
                                int i_88_ = 240;
                                int i_89_ = ((Class68_Sub20_Sub12
                                        .anIntArrayArrayArray4353[i_84_]
                                        [i_81_][i_67_])
                                        - i_88_);
                                int i_90_ = (Class68_Sub20_Sub12
                                        .anIntArrayArrayArray4353[i_83_]
                                        [i_81_][i_67_]);
                                Class28.method397(2, 128 * i_81_,
                                        128 * i_82_ + 128,
                                        i_67_ * 128, 128 * i_67_,
                                        i_89_, i_90_);
                                for (int i_91_ = i_83_; i_91_ <= i_84_;
                                     i_91_++) {
                                    for (int i_92_ = i_81_;
                                         ((i_82_ ^ 0xffffffff)
                                                 <= (i_92_ ^ 0xffffffff));
                                         i_92_++)
                                        Class74.anIntArrayArrayArray1336
                                                [i_91_][i_92_][i_67_]
                                                = (Class120.method1740
                                                ((Class74
                                                        .anIntArrayArrayArray1336
                                                        [i_91_][i_92_][i_67_]),
                                                        -3));
                                }
                            }
                        }
                        if ((0x4 & (Class74.anIntArrayArrayArray1336[i_66_]
                                [i_68_][i_67_]))
                                != 0) {
                            int i_93_ = i_68_;
                            int i_94_ = i_68_;
                            int i_95_ = i_67_;
                            int i_96_ = i_67_;
                            for (/**/; i_95_ > 0; i_95_--) {
                                if (((Class74.anIntArrayArrayArray1336[i_66_]
                                        [i_68_][i_95_ + -1])
                                        & 0x4)
                                        == 0)
                                    break;
                            }
                            for (/**/; i_96_ < 104; i_96_++) {
                                if (((Class74.anIntArrayArrayArray1336[i_66_]
                                        [i_68_][1 + i_96_])
                                        & 0x4)
                                        == 0)
                                    break;
                            }
                            while_161_:
                            for (/**/; (i_93_ ^ 0xffffffff) < -1; i_93_--) {
                                for (int i_97_ = i_95_; i_96_ >= i_97_;
                                     i_97_++) {
                                    if ((0x4
                                            & (Class74.anIntArrayArrayArray1336
                                            [i_66_][i_93_ + -1][i_97_]))
                                            == 0)
                                        break while_161_;
                                }
                            }
                            while_162_:
                            for (/**/; i_94_ < 104; i_94_++) {
                                for (int i_98_ = i_95_; i_98_ <= i_96_;
                                     i_98_++) {
                                    if (((Class74.anIntArrayArrayArray1336
                                            [i_66_][i_94_ + 1][i_98_])
                                            & 0x4)
                                            == 0)
                                        break while_162_;
                                }
                            }
                            if (((1 + -i_95_ + i_96_) * (-i_93_ + (i_94_ + 1))
                                    ^ 0xffffffff)
                                    <= -5) {
                                int i_99_ = (Class68_Sub20_Sub12
                                        .anIntArrayArrayArray4353[i_66_]
                                        [i_93_][i_95_]);
                                Class28.method397(4, 128 * i_93_,
                                        128 * i_94_ + 128,
                                        i_95_ * 128,
                                        128 + 128 * i_96_, i_99_,
                                        i_99_);
                                for (int i_100_ = i_93_; i_94_ >= i_100_;
                                     i_100_++) {
                                    for (int i_101_ = i_95_;
                                         ((i_96_ ^ 0xffffffff)
                                                 <= (i_101_ ^ 0xffffffff));
                                         i_101_++)
                                        Class74.anIntArrayArrayArray1336
                                                [i_66_][i_100_][i_101_]
                                                = (Class120.method1740
                                                ((Class74
                                                        .anIntArrayArrayArray1336
                                                        [i_66_][i_100_][i_101_]),
                                                        -5));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public Class114() {
        this(-1, 1000000, 1000000);
    }

    public static void method1691(int i) {
        anInt1938++;
        int i_102_ = 64 + 128 * Stream.anInt2954;
        int i_103_ = Class68_Sub13_Sub37.anInt4067 * 128 + 64;
        int i_104_ = (Class1_Sub6_Sub2.method163(i_102_, GameSocket.anInt1149,
                i_103_, false)
                - Class68_Sub13_Sub31.anInt3977);
        if (Class68_Sub24.anInt3160 >= 100) {
            Class68_Sub7.anInt2862 = 64 + 128 * Stream.anInt2954;
            Class85.anInt1558 = Class68_Sub13_Sub37.anInt4067 * 128 + 64;
            Class68_Sub5.anInt2833
                    = (Class1_Sub6_Sub2.method163(Class68_Sub7.anInt2862,
                    GameSocket.anInt1149,
                    Class85.anInt1558, false)
                    - Class68_Sub13_Sub31.anInt3977);
        } else {
            if (Class68_Sub7.anInt2862 < i_102_) {
                Class68_Sub7.anInt2862
                        += ((-Class68_Sub7.anInt2862 + i_102_)
                        * Class68_Sub24.anInt3160 / 1000) + Class125.anInt2167;
                if ((i_102_ ^ 0xffffffff)
                        > (Class68_Sub7.anInt2862 ^ 0xffffffff))
                    Class68_Sub7.anInt2862 = i_102_;
            }
            if ((i_103_ ^ 0xffffffff) < (Class85.anInt1558 ^ 0xffffffff)) {
                Class85.anInt1558
                        += ((i_103_ + -Class85.anInt1558) * Class68_Sub24.anInt3160
                        / 1000) + Class125.anInt2167;
                if (Class85.anInt1558 > i_103_)
                    Class85.anInt1558 = i_103_;
            }
            if ((i_103_ ^ 0xffffffff) > (Class85.anInt1558 ^ 0xffffffff)) {
                Class85.anInt1558
                        -= Class125.anInt2167 - -(Class68_Sub24.anInt3160
                        * (-i_103_ + Class85.anInt1558)
                        / 1000);
                if (Class85.anInt1558 < i_103_)
                    Class85.anInt1558 = i_103_;
            }
            if (i_102_ < Class68_Sub7.anInt2862) {
                Class68_Sub7.anInt2862
                        -= ((-i_102_ + Class68_Sub7.anInt2862)
                        * Class68_Sub24.anInt3160 / 1000) + Class125.anInt2167;
                if ((Class68_Sub7.anInt2862 ^ 0xffffffff)
                        > (i_102_ ^ 0xffffffff))
                    Class68_Sub7.anInt2862 = i_102_;
            }
            if ((i_104_ ^ 0xffffffff)
                    < (Class68_Sub5.anInt2833 ^ 0xffffffff)) {
                Class68_Sub5.anInt2833 += (Class68_Sub24.anInt3160
                        * (i_104_ - Class68_Sub5.anInt2833)
                        / 1000) + Class125.anInt2167;
                if ((i_104_ ^ 0xffffffff)
                        > (Class68_Sub5.anInt2833 ^ 0xffffffff))
                    Class68_Sub5.anInt2833 = i_104_;
            }
            if (Class68_Sub5.anInt2833 > i_104_) {
                Class68_Sub5.anInt2833
                        -= Class125.anInt2167 + ((Class68_Sub5.anInt2833 - i_104_)
                        * Class68_Sub24.anInt3160 / 1000);
                if (Class68_Sub5.anInt2833 < i_104_)
                    Class68_Sub5.anInt2833 = i_104_;
            }
        }
        i_103_ = 64 + 128 * PlayerDefinition.anInt2191;
        i_102_ = 64 + 128 * Class8.anInt161;
        i_104_ = Class1_Sub6_Sub2.method163(i_102_, GameSocket.anInt1149, i_103_,
                false) - Class68_Sub13.anInt2943;
        if (i != -128)
            method1693((byte) 116, null);
        int i_105_ = i_104_ - Class68_Sub5.anInt2833;
        int i_106_ = i_102_ + -Class68_Sub7.anInt2862;
        int i_107_ = -Class85.anInt1558 + i_103_;
        int i_108_
                = (int) Math.sqrt((double) (i_107_ * i_107_ + i_106_ * i_106_));
        int i_109_ = 0x7ff & (int) (325.949 * Math.atan2((double) i_105_,
                (double) i_108_));
        if (i_109_ < 128)
            i_109_ = 128;
        if (i_109_ > 383)
            i_109_ = 383;
        int i_110_
                = 0x7ff & (int) (Math.atan2((double) i_106_, (double) i_107_)
                * -325.949);
        int i_111_ = i_110_ + -Class74.anInt1333;
        if (i_111_ > 1024)
            i_111_ -= 2048;
        if (i_111_ < -1024)
            i_111_ += 2048;
        if (Canvas_Sub1.anInt45 < i_109_) {
            Canvas_Sub1.anInt45
                    += (Class72.anInt1321 * (i_109_ + -Canvas_Sub1.anInt45) / 1000
                    + Class68_Sub20_Sub12.anInt4354);
            if ((Canvas_Sub1.anInt45 ^ 0xffffffff) < (i_109_ ^ 0xffffffff))
                Canvas_Sub1.anInt45 = i_109_;
        }
        if (i_111_ > 0) {
            Class74.anInt1333 += (Class68_Sub20_Sub12.anInt4354
                    + Class72.anInt1321 * i_111_ / 1000);
            Class74.anInt1333 &= 0x7ff;
        }
        if ((i_111_ ^ 0xffffffff) > -1) {
            Class74.anInt1333
                    -= Class68_Sub20_Sub12.anInt4354 - -(Class72.anInt1321
                    * -i_111_ / 1000);
            Class74.anInt1333 &= 0x7ff;
        }
        int i_112_ = -Class74.anInt1333 + i_110_;
        if ((Canvas_Sub1.anInt45 ^ 0xffffffff) < (i_109_ ^ 0xffffffff)) {
            Canvas_Sub1.anInt45
                    -= (Class72.anInt1321 * (-i_109_ + Canvas_Sub1.anInt45) / 1000
                    + Class68_Sub20_Sub12.anInt4354);
            if ((Canvas_Sub1.anInt45 ^ 0xffffffff) > (i_109_ ^ 0xffffffff))
                Canvas_Sub1.anInt45 = i_109_;
        }
        if ((i_112_ ^ 0xffffffff) < -1025)
            i_112_ -= 2048;
        if (i_112_ < -1024)
            i_112_ += 2048;
        if ((i_112_ ^ 0xffffffff) > -1 && i_111_ > 0
                || i_112_ > 0 && i_111_ < 0)
            Class74.anInt1333 = i_110_;
    }

    public static void method1692(int i) {
        if (i != 0)
            anInt1927 = -60;
        anInt1934++;
        if (!Class28.method398(i ^ 0x60cd)
                && ((GameSocket.anInt1149 ^ 0xffffffff)
                != (Class68_Sub13_Sub18.anInt3737 ^ 0xffffffff)))
            ISAACRandomGen.method1455((byte) -128,
                    (Class68_Sub7.aClass1_Sub6_Sub2_2860
                            .anIntArray2570[0]),
                    GameSocket.anInt1149, false,
                    (Class68_Sub7.aClass1_Sub6_Sub2_2860
                            .anIntArray2523[0]),
                    ItemDef.anInt365, Class43.anInt732);
        else if (Class68_Sub13_Sub32.anInt3981 != GameSocket.anInt1149) {
            Class68_Sub13_Sub32.anInt3981 = GameSocket.anInt1149;
            Class13_Sub1.method246((byte) -124, GameSocket.anInt1149);
            Class107.method1654(i + -13401);
        }
    }

    public static void method1693(byte i, Class21renamed class21) {
        Class28.aClass21_531 = class21;
        Class112.anInt1879 = Class28.aClass21_531.method355(4, 0);
        if (i >= -70)
            aRSString_1930 = null;
        anInt1936++;
    }

    public Class114(int i, int i_113_, int i_114_) {
        /* empty */
    }

    static {
        anInt1925 = -1;
        aRSString_1928 = RSString.newRsString("k");
        aRSString_1930 = RSString.newRsString(" )2> <col=00ffff>");
        anInt1927 = 0;
        aRSString_1932 = RSString.newRsString("Spielwelt erstellt)3");
        aByteArrayArray1937 = new byte[1000][];
    }
}
