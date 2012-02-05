/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GroundData {
    public static RSString aRSString_656
            = RSString.newRsString("Bitte warten Sie)3)3)3");
    public static int anInt657;
    public int anInt658;
    public static Class21_Sub1 aClass21_Sub1_659;
    public static int anInt660;
    public static int anInt661;
    public int anInt662;
    public static int anInt663;
    public static int anInt664;
    public static int anInt665;
    public static int anInt666 = 0;
    public static int anInt667;
    public static int anInt668;
    public static int anInt669;
    public static int anInt670;
    public static int anInt671;
    public int anInt672;
    public static int anInt673;
    public static int anInt674;
    public static int anInt675;
    public static byte[][][] aByteArrayArrayArray676;
    public static int anInt677 = 0;
    public static int anInt678;
    public static int anInt679;
    public static int anInt680;
    public int[][] anIntArrayArray681;
    public static int anInt682;
    public static int anInt683;
    public int anInt684;
    public static int anInt685;
    public static int anInt686 = 0;

    public void method443(int i, byte i_0_, int i_1_) {
        i_1_ -= anInt658;
        i -= anInt662;
        anInt674++;
        if (i_0_ <= -44)
            anIntArrayArray681[i_1_][i]
                    = Class70.method1335(anIntArrayArray681[i_1_][i], 2097152);
    }

    public void method444(boolean bool) {
        for (int i = 0; i < anInt684; i++) {
            for (int i_2_ = 0; anInt672 > i_2_; i_2_++) {
                if (i == 0 || i_2_ == 0 || -5 + anInt684 <= i
                        || (-5 + anInt672 ^ 0xffffffff) >= (i_2_ ^ 0xffffffff))
                    anIntArrayArray681[i][i_2_] = 16777215;
                else
                    anIntArrayArray681[i][i_2_] = 16777216;
            }
        }
        if (bool != false)
            method449(-17);
        anInt660++;
    }

    public boolean method445(int i, boolean bool, int i_3_, int i_4_, int i_5_,
                             int i_6_, int i_7_, int i_8_, int i_9_) {
        if (bool != true)
            aClass21_Sub1_659 = null;
        anInt680++;
        if (i + i_9_ <= i_7_ || i_9_ >= i_7_ - -i_3_)
            return false;
        if (i_5_ + i_4_ <= i_6_ || i_4_ >= i_8_ + i_6_)
            return false;
        return true;
    }

    public void method446(int i, int i_10_, int i_11_) {
        i_11_ -= anInt658;
        i_10_ -= anInt662;
        anInt679++;
        anIntArrayArray681[i_11_][i_10_]
                = Class70.method1335(anIntArrayArray681[i_11_][i_10_], 262144);
        if (i >= -63)
            anInt677 = -2;
    }

    public void method447(int i, int i_12_, int i_13_) {
        i_13_ -= anInt662;
        anInt667++;
        i -= anInt658;
        anIntArrayArray681[i][i_13_]
                = Class120.method1740(anIntArrayArray681[i][i_13_], i_12_);
    }

    public boolean method448(int i, int i_14_, int i_15_, int i_16_, int i_17_,
                             int i_18_, int i_19_, int i_20_, int i_21_) {
        if (i != 15856)
            return false;
        anInt657++;
        if ((i_15_ ^ 0xffffffff) < -2) {
            if (method445(i_20_, true, i_15_, i_14_, i_17_, i_16_, i_18_,
                    i_15_, i_21_))
                return true;
            return method453(i_19_, i_15_, i_18_, i_21_, i_14_, i_15_, false,
                    i_17_, i_20_, i_16_);
        }
        int i_22_ = i_21_ + (i_20_ + -1);
        int i_23_ = i_17_ + i_14_ - 1;
        if (i_21_ <= i_18_ && i_22_ >= i_18_
                && (i_14_ ^ 0xffffffff) >= (i_16_ ^ 0xffffffff) && i_23_ >= i_16_)
            return true;
        if (i_18_ == -1 + i_21_ && i_14_ <= i_16_
                && (i_16_ ^ 0xffffffff) >= (i_23_ ^ 0xffffffff)
                && ((0x8
                & anIntArrayArray681[-anInt658 + i_18_][-anInt662 + i_16_])
                == 0)
                && (i_19_ & 0x8) == 0)
            return true;
        if (1 + i_22_ == i_18_ && i_16_ >= i_14_ && i_16_ <= i_23_
                && (0x80
                & anIntArrayArray681[i_18_ - anInt658][-anInt662 + i_16_]) == 0
                && (i_19_ & 0x2) == 0)
            return true;
        if (i_14_ - 1 == i_16_ && i_21_ <= i_18_ && i_18_ <= i_22_
                && ((0x2
                & anIntArrayArray681[-anInt658 + i_18_][i_16_ + -anInt662])
                == 0)
                && (0x4 & i_19_) == 0)
            return true;
        if ((i_16_ ^ 0xffffffff) == (1 + i_23_ ^ 0xffffffff) && i_18_ >= i_21_
                && (i_18_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff)
                && (0x20 & anIntArrayArray681[i_18_ - anInt658][i_16_ - anInt662]
                ^ 0xffffffff) == -1
                && (0x1 & i_19_ ^ 0xffffffff) == -1)
            return true;
        return false;
    }

    public static void method449(int i) {
        if (i != 2)
            method460(-69);
        Class7.aClass98_124.method1566((byte) 94);
        anInt665++;
    }

    public static void method450(int i, int i_24_, int i_25_, int i_26_,
                                 int i_27_, int i_28_, int i_29_, int i_30_) {
        anInt671++;
        if (i_26_ >= 1 && i_30_ >= 1 && i_26_ <= 102 && i_30_ <= 102) {
            if (!Class28.method398(24781)
                    && ((0x2 & Class64.aByteArrayArrayArray1178[0][i_26_][i_30_])
                    == 0)) {
                int i_31_ = i_27_;
                if ((Class64.aByteArrayArrayArray1178[i_27_][i_26_][i_30_]
                        & 0x8)
                        != 0)
                    i_31_ = 0;
                if (Class68_Sub13_Sub18.anInt3737 != i_31_)
                    return;
            }
            int i_32_ = i_27_;
            if ((i_32_ ^ 0xffffffff) > -4
                    && (Class64.aByteArrayArrayArray1178[1][i_26_][i_30_] & 0x2
                    ^ 0xffffffff) == -3)
                i_32_++;
            Class68_Sub20_Sub2.method1039(Class109.aClass38Array1843[i_27_],
                    i_24_, i_32_, i_27_, 28, i_30_,
                    i_26_);
            if ((i_25_ ^ 0xffffffff) <= -1) {
                boolean bool = ISAACRandomGen.aBoolean1487;
                ISAACRandomGen.aBoolean1487 = true;
                Class68_Sub20_Sub17.method1181((Class109.aClass38Array1843
                        [i_27_]),
                        1, false, i_30_, i_29_, i_26_,
                        i_28_, i_32_, i_27_, false,
                        i_25_);
                ISAACRandomGen.aBoolean1487 = bool;
            }
        }
        if (i != 0)
            method457(true);
    }

    public void method451(byte i, int i_33_, int i_34_, int i_35_) {
        anInt685++;
        anIntArrayArray681[i_35_][i_33_]
                = Class70.method1335(anIntArrayArray681[i_35_][i_33_], i_34_);
        if (i != -74)
            aRSString_656 = null;
    }

    public void method452(boolean bool, int i, int i_36_, int i_37_) {
        if (bool != false)
            aClass21_Sub1_659 = null;
        anInt664++;
        anIntArrayArray681[i_37_][i]
                = Class120.method1740(anIntArrayArray681[i_37_][i],
                i_36_ ^ 0xffffffff);
    }

    public boolean method453(int i, int i_38_, int i_39_, int i_40_, int i_41_,
                             int i_42_, boolean bool, int i_43_, int i_44_,
                             int i_45_) {
        int i_46_ = i_45_ - -i_42_;
        int i_47_ = i_38_ + i_39_;
        if (bool != false)
            anInt677 = -65;
        int i_48_ = i_40_ - -i_44_;
        int i_49_ = i_43_ + i_41_;
        anInt663++;
        if (i_39_ < i_40_ || i_48_ <= i_39_) {
            if (i_47_ <= i_40_
                    || (i_47_ ^ 0xffffffff) < (i_48_ ^ 0xffffffff)) {
                if (i_45_ >= i_41_
                        && (i_45_ ^ 0xffffffff) > (i_49_ ^ 0xffffffff)) {
                    if (i_40_ != i_47_ || (i & 0x8 ^ 0xffffffff) != -1) {
                        if (i_39_ == i_48_ && (i & 0x2 ^ 0xffffffff) == -1) {
                            int i_50_ = i_45_;
                            for (int i_51_ = i_49_ >= i_46_ ? i_46_ : i_49_;
                                 i_51_ > i_50_; i_50_++) {
                                if ((0x80 & (anIntArrayArray681
                                        [i_39_ + -anInt658]
                                        [i_50_ + -anInt662])
                                        ^ 0xffffffff)
                                        == -1)
                                    return true;
                            }
                        }
                    } else {
                        int i_52_ = i_49_ >= i_46_ ? i_46_ : i_49_;
                        for (int i_53_ = i_45_; i_53_ < i_52_; i_53_++) {
                            if ((0x8 & (anIntArrayArray681
                                    [-anInt658 + (i_47_ + -1)]
                                    [-anInt662 + i_53_])
                                    ^ 0xffffffff)
                                    == -1)
                                return true;
                        }
                    }
                } else if ((i_41_ ^ 0xffffffff) > (i_46_ ^ 0xffffffff)
                        && (i_46_ ^ 0xffffffff) >= (i_49_ ^ 0xffffffff)) {
                    if (i_40_ != i_47_ || (i & 0x8) != 0) {
                        if ((i_48_ ^ 0xffffffff) == (i_39_ ^ 0xffffffff)
                                && (0x2 & i) == 0) {
                            for (int i_54_ = i_41_; i_46_ > i_54_; i_54_++) {
                                if ((0x80 & (anIntArrayArray681
                                        [-anInt658 + i_39_]
                                        [-anInt662 + i_54_])
                                        ^ 0xffffffff)
                                        == -1)
                                    return true;
                            }
                        }
                    } else {
                        for (int i_55_ = i_41_;
                             (i_55_ ^ 0xffffffff) > (i_46_ ^ 0xffffffff);
                             i_55_++) {
                            if ((0x8 & (anIntArrayArray681
                                    [-1 + -anInt658 + i_47_]
                                    [i_55_ - anInt662])
                                    ^ 0xffffffff)
                                    == -1)
                                return true;
                        }
                    }
                }
            } else if ((i_46_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff)
                    && (0x4 & i ^ 0xffffffff) == -1) {
                for (int i_56_ = i_40_; i_47_ > i_56_; i_56_++) {
                    if (((anIntArrayArray681[i_56_ - anInt658]
                            [i_46_ + -anInt662 - 1]) & 0x2
                            ^ 0xffffffff)
                            == -1)
                        return true;
                }
            } else if ((i_49_ ^ 0xffffffff) == (i_45_ ^ 0xffffffff)
                    && (0x1 & i) == 0) {
                for (int i_57_ = i_40_;
                     (i_47_ ^ 0xffffffff) < (i_57_ ^ 0xffffffff); i_57_++) {
                    if (((anIntArrayArray681[-anInt658 + i_57_]
                            [i_45_ + -anInt662]) & 0x20
                            ^ 0xffffffff)
                            == -1)
                        return true;
                }
            }
        } else if ((i_46_ ^ 0xffffffff) != (i_41_ ^ 0xffffffff)
                || (0x4 & i ^ 0xffffffff) != -1) {
            if (i_49_ == i_45_ && (0x1 & i ^ 0xffffffff) == -1) {
                int i_58_ = i_39_;
                for (int i_59_ = i_47_ > i_48_ ? i_48_ : i_47_; i_59_ > i_58_;
                     i_58_++) {
                    if ((0x20 & (anIntArrayArray681[-anInt658 + i_58_]
                            [i_45_ + -anInt662]))
                            == 0)
                        return true;
                }
            }
        } else {
            int i_60_ = i_39_;
            for (int i_61_ = i_48_ < i_47_ ? i_48_ : i_47_; i_61_ > i_60_;
                 i_60_++) {
                if ((anIntArrayArray681[i_60_ + -anInt658][-1 + (i_46_
                        - anInt662)]
                        & 0x2)
                        == 0)
                    return true;
            }
        }
        return false;
    }

    public void method454(int i, int i_62_, int i_63_, int i_64_, int i_65_,
                          boolean bool, byte i_66_) {
        anInt675++;
        i_65_ -= anInt662;
        i_62_ -= anInt658;
        if ((i_64_ ^ 0xffffffff) == -2 || (i_64_ ^ 0xffffffff) == -4) {
            int i_67_ = i_63_;
            i_63_ = i;
            i = i_67_;
        }
        int i_68_ = 256;
        if (bool)
            i_68_ += 131072;
        if (i_66_ == 82) {
            for (int i_69_ = i_62_; i_69_ < i_63_ + i_62_; i_69_++) {
                if ((i_69_ ^ 0xffffffff) <= -1 && i_69_ < anInt684) {
                    for (int i_70_ = i_65_; i + i_65_ > i_70_; i_70_++) {
                        if (i_70_ >= 0
                                && (anInt672 ^ 0xffffffff) < (i_70_ ^ 0xffffffff))
                            method452(false, i_70_, i_68_, i_69_);
                    }
                }
            }
        }
    }

    public void method455(int i, boolean bool, int i_71_, int i_72_, int i_73_,
                          int i_74_) {
        i_74_ -= anInt662;
        int i_75_ = 256;
        anInt669++;
        if (bool)
            i_75_ += 131072;
        i_73_ -= anInt658;
        for (int i_76_ = i_73_; i_76_ < i_72_ + i_73_; i_76_++) {
            if (i_76_ >= 0 && i_76_ < anInt684) {
                for (int i_77_ = i_74_;
                     (i_71_ + i_74_ ^ 0xffffffff) < (i_77_ ^ 0xffffffff);
                     i_77_++) {
                    if (i_77_ >= 0
                            && (i_77_ ^ 0xffffffff) > (anInt672 ^ 0xffffffff))
                        method451((byte) -74, i_77_, i_75_, i_76_);
                }
            }
        }
        if (i >= -38)
            anInt658 = -81;
    }

    public static void method456(byte i) {
        if (i >= -103)
            method449(-65);
        aClass21_Sub1_659 = null;
        aRSString_656 = null;
        aByteArrayArrayArray676 = null;
    }

    public static int method457(boolean bool) {
        if (bool != false)
            anInt686 = 10;
        anInt661++;
        return 2;
    }

    public void method458(int i, int i_78_, int i_79_, boolean bool,
                          boolean bool_80_, int i_81_) {
        anInt678++;
        i -= anInt658;
        i_79_ -= anInt662;
        if ((i_78_ ^ 0xffffffff) == -1) {
            if ((i_81_ ^ 0xffffffff) == -1) {
                method452(false, i_79_, 128, i);
                method452(false, i_79_, 8, -1 + i);
            }
            if (i_81_ == 1) {
                method452(false, i_79_, 2, i);
                method452(false, i_79_ - -1, 32, i);
            }
            if (i_81_ == 2) {
                method452(false, i_79_, 8, i);
                method452(false, i_79_, 128, i + 1);
            }
            if (i_81_ == 3) {
                method452(!bool, i_79_, 32, i);
                method452(false, -1 + i_79_, 2, i);
            }
        }
        if (i_78_ == 1 || (i_78_ ^ 0xffffffff) == -4) {
            if (i_81_ == 0) {
                method452(false, i_79_, 1, i);
                method452(false, 1 + i_79_, 16, i + -1);
            }
            if ((i_81_ ^ 0xffffffff) == -2) {
                method452(!bool, i_79_, 4, i);
                method452(false, i_79_ + 1, 64, 1 + i);
            }
            if (i_81_ == 2) {
                method452(!bool, i_79_, 16, i);
                method452(false, -1 + i_79_, 1, 1 + i);
            }
            if (i_81_ == 3) {
                method452(false, i_79_, 64, i);
                method452(false, i_79_ - 1, 4, i - 1);
            }
        }
        if (i_78_ == 2) {
            if (i_81_ == 0) {
                method452(false, i_79_, 130, i);
                method452(false, i_79_, 8, -1 + i);
                method452(false, 1 + i_79_, 32, i);
            }
            if ((i_81_ ^ 0xffffffff) == -2) {
                method452(false, i_79_, 10, i);
                method452(!bool, 1 + i_79_, 32, i);
                method452(false, i_79_, 128, 1 + i);
            }
            if (i_81_ == 2) {
                method452(!bool, i_79_, 40, i);
                method452(!bool, i_79_, 128, 1 + i);
                method452(false, i_79_ + -1, 2, i);
            }
            if ((i_81_ ^ 0xffffffff) == -4) {
                method452(false, i_79_, 160, i);
                method452(false, -1 + i_79_, 2, i);
                method452(false, i_79_, 8, -1 + i);
            }
        }
        if (bool == true) {
            if (bool_80_) {
                if (i_78_ == 0) {
                    if ((i_81_ ^ 0xffffffff) == -1) {
                        method452(!bool, i_79_, 65536, i);
                        method452(false, i_79_, 4096, -1 + i);
                    }
                    if ((i_81_ ^ 0xffffffff) == -2) {
                        method452(!bool, i_79_, 1024, i);
                        method452(false, 1 + i_79_, 16384, i);
                    }
                    if ((i_81_ ^ 0xffffffff) == -3) {
                        method452(false, i_79_, 4096, i);
                        method452(!bool, i_79_, 65536, i - -1);
                    }
                    if ((i_81_ ^ 0xffffffff) == -4) {
                        method452(false, i_79_, 16384, i);
                        method452(false, i_79_ - 1, 1024, i);
                    }
                }
                if ((i_78_ ^ 0xffffffff) == -2 || (i_78_ ^ 0xffffffff) == -4) {
                    if (i_81_ == 0) {
                        method452(false, i_79_, 512, i);
                        method452(false, 1 + i_79_, 8192, i - 1);
                    }
                    if (i_81_ == 1) {
                        method452(false, i_79_, 2048, i);
                        method452(!bool, i_79_ + 1, 32768, 1 + i);
                    }
                    if ((i_81_ ^ 0xffffffff) == -3) {
                        method452(false, i_79_, 8192, i);
                        method452(false, -1 + i_79_, 512, i - -1);
                    }
                    if ((i_81_ ^ 0xffffffff) == -4) {
                        method452(!bool, i_79_, 32768, i);
                        method452(false, -1 + i_79_, 2048, -1 + i);
                    }
                }
                if ((i_78_ ^ 0xffffffff) == -3) {
                    if (i_81_ == 0) {
                        method452(!bool, i_79_, 66560, i);
                        method452(false, i_79_, 4096, i - 1);
                        method452(false, i_79_ - -1, 16384, i);
                    }
                    if (i_81_ == 1) {
                        method452(!bool, i_79_, 5120, i);
                        method452(!bool, 1 + i_79_, 16384, i);
                        method452(false, i_79_, 65536, i - -1);
                    }
                    if ((i_81_ ^ 0xffffffff) == -3) {
                        method452(false, i_79_, 20480, i);
                        method452(false, i_79_, 65536, i - -1);
                        method452(false, -1 + i_79_, 1024, i);
                    }
                    if (i_81_ == 3) {
                        method452(false, i_79_, 81920, i);
                        method452(!bool, i_79_ - 1, 1024, i);
                        method452(false, i_79_, 4096, i - 1);
                    }
                }
            }
        }
    }

    public boolean method459(int i, int i_82_, byte i_83_, int i_84_,
                             int i_85_, int i_86_, int i_87_, int i_88_) {
        if (i_83_ != 108)
            aClass21_Sub1_659 = null;
        anInt682++;
        if ((i_85_ ^ 0xffffffff) != -2) {
            if (i_84_ <= i_82_ && i_84_ - (-i_85_ + 1) >= i_82_
                    && i_86_ <= i_86_ && i_86_ <= i_85_ + i_86_ - 1)
                return true;
        } else if ((i_84_ ^ 0xffffffff) == (i_82_ ^ 0xffffffff)
                && i_87_ == i_86_)
            return true;
        i_82_ -= anInt658;
        i_84_ -= anInt658;
        i_87_ -= anInt662;
        i_86_ -= anInt662;
        if ((i_85_ ^ 0xffffffff) != -2) {
            int i_89_ = -1 + i_85_ + i_84_;
            int i_90_ = -1 + (i_87_ - -i_85_);
            if ((i_88_ ^ 0xffffffff) == -1) {
                if (i == 0) {
                    if ((i_82_ - i_85_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                            && (i_86_ ^ 0xffffffff) <= (i_87_ ^ 0xffffffff)
                            && (i_90_ ^ 0xffffffff) <= (i_86_ ^ 0xffffffff))
                        return true;
                    if (i_84_ <= i_82_
                            && (i_89_ ^ 0xffffffff) <= (i_82_ ^ 0xffffffff)
                            && (i_87_ ^ 0xffffffff) == (1 + i_86_ ^ 0xffffffff)
                            && (anIntArrayArray681[i_82_][i_87_] & 0x12c0120
                            ^ 0xffffffff) == -1)
                        return true;
                    if (i_84_ <= i_82_ && i_89_ >= i_82_
                            && (i_87_ ^ 0xffffffff) == (i_86_ + -i_85_
                            ^ 0xffffffff)
                            && (0x12c0102 & anIntArrayArray681[i_82_][i_90_]) == 0)
                        return true;
                } else if (i == 1) {
                    if (i_84_ <= i_82_
                            && (i_82_ ^ 0xffffffff) >= (i_89_ ^ 0xffffffff)
                            && i_86_ - -1 == i_87_)
                        return true;
                    if ((-i_85_ + i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                            && i_87_ <= i_86_ && i_90_ >= i_86_
                            && (anIntArrayArray681[i_89_][i_86_] & 0x12c0108) == 0)
                        return true;
                    if (1 + i_82_ == i_84_ && i_86_ >= i_87_ && i_86_ <= i_90_
                            && (anIntArrayArray681[i_84_][i_86_] & 0x12c0180) == 0)
                        return true;
                } else if ((i ^ 0xffffffff) == -3) {
                    if ((i_82_ - -1 ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                            && (i_87_ ^ 0xffffffff) >= (i_86_ ^ 0xffffffff)
                            && (i_86_ ^ 0xffffffff) >= (i_90_ ^ 0xffffffff))
                        return true;
                    if (i_82_ >= i_84_
                            && (i_82_ ^ 0xffffffff) >= (i_89_ ^ 0xffffffff)
                            && (i_87_ ^ 0xffffffff) == (i_86_ - -1 ^ 0xffffffff)
                            && (anIntArrayArray681[i_82_][i_87_] & 0x12c0120) == 0)
                        return true;
                    if ((i_82_ ^ 0xffffffff) <= (i_84_ ^ 0xffffffff)
                            && (i_89_ ^ 0xffffffff) <= (i_82_ ^ 0xffffffff)
                            && i_87_ == -i_85_ + i_86_
                            && (anIntArrayArray681[i_82_][i_90_] & 0x12c0102
                            ^ 0xffffffff) == -1)
                        return true;
                } else if ((i ^ 0xffffffff) == -4) {
                    if ((i_82_ ^ 0xffffffff) <= (i_84_ ^ 0xffffffff)
                            && (i_82_ ^ 0xffffffff) >= (i_89_ ^ 0xffffffff)
                            && (i_86_ - i_85_ ^ 0xffffffff) == (i_87_
                            ^ 0xffffffff))
                        return true;
                    if (-i_85_ + i_82_ == i_84_ && i_87_ <= i_86_
                            && (i_90_ ^ 0xffffffff) <= (i_86_ ^ 0xffffffff)
                            && (0x12c0108 & anIntArrayArray681[i_89_][i_86_]) == 0)
                        return true;
                    if ((i_84_ ^ 0xffffffff) == (i_82_ + 1 ^ 0xffffffff)
                            && (i_87_ ^ 0xffffffff) >= (i_86_ ^ 0xffffffff)
                            && (i_90_ ^ 0xffffffff) <= (i_86_ ^ 0xffffffff)
                            && (anIntArrayArray681[i_84_][i_86_] & 0x12c0180
                            ^ 0xffffffff) == -1)
                        return true;
                }
            }
            if ((i_88_ ^ 0xffffffff) == -3) {
                if (i != 0) {
                    if (i != 1) {
                        if ((i ^ 0xffffffff) != -3) {
                            if ((i ^ 0xffffffff) == -4) {
                                if (((i_82_ + -i_85_ ^ 0xffffffff)
                                        == (i_84_ ^ 0xffffffff))
                                        && (i_87_ ^ 0xffffffff) >= (i_86_
                                        ^ 0xffffffff)
                                        && (i_90_ ^ 0xffffffff) <= (i_86_
                                        ^ 0xffffffff))
                                    return true;
                                if (i_82_ >= i_84_ && i_82_ <= i_89_
                                        && (i_87_ ^ 0xffffffff) == (i_86_ - -1
                                        ^ 0xffffffff)
                                        && ((0x12c0120
                                        & anIntArrayArray681[i_82_][i_87_])
                                        == 0))
                                    return true;
                                if ((1 + i_82_ ^ 0xffffffff) == (i_84_
                                        ^ 0xffffffff)
                                        && (i_86_ ^ 0xffffffff) <= (i_87_
                                        ^ 0xffffffff)
                                        && i_90_ >= i_86_
                                        && ((0x12c0180
                                        & anIntArrayArray681[i_84_][i_86_])
                                        ^ 0xffffffff) == -1)
                                    return true;
                                if (i_82_ >= i_84_
                                        && (i_82_ ^ 0xffffffff) >= (i_89_
                                        ^ 0xffffffff)
                                        && i_86_ - i_85_ == i_87_)
                                    return true;
                            }
                        } else {
                            if (i_84_ == -i_85_ + i_82_ && i_86_ >= i_87_
                                    && (i_90_ ^ 0xffffffff) <= (i_86_ ^ 0xffffffff)
                                    && ((anIntArrayArray681[i_89_][i_86_]
                                    & 0x12c0108)
                                    ^ 0xffffffff) == -1)
                                return true;
                            if (i_82_ >= i_84_ && i_89_ >= i_82_
                                    && i_87_ == i_86_ - -1
                                    && ((anIntArrayArray681[i_82_][i_87_]
                                    & 0x12c0120)
                                    ^ 0xffffffff) == -1)
                                return true;
                            if (i_82_ + 1 == i_84_
                                    && (i_87_ ^ 0xffffffff) >= (i_86_ ^ 0xffffffff)
                                    && (i_90_ ^ 0xffffffff) <= (i_86_
                                    ^ 0xffffffff))
                                return true;
                            if ((i_82_ ^ 0xffffffff) <= (i_84_ ^ 0xffffffff)
                                    && i_89_ >= i_82_
                                    && ((-i_85_ + i_86_ ^ 0xffffffff)
                                    == (i_87_ ^ 0xffffffff)))
                                return true;
                        }
                    } else {
                        if (i_84_ == -i_85_ + i_82_ && i_87_ <= i_86_
                                && i_86_ <= i_90_
                                && ((0x12c0108 & anIntArrayArray681[i_89_][i_86_])
                                == 0))
                            return true;
                        if (i_82_ >= i_84_ && i_82_ <= i_89_
                                && i_87_ == i_86_ + 1)
                            return true;
                        if ((i_84_ ^ 0xffffffff) == (i_82_ + 1 ^ 0xffffffff)
                                && (i_86_ ^ 0xffffffff) <= (i_87_ ^ 0xffffffff)
                                && (i_86_ ^ 0xffffffff) >= (i_90_ ^ 0xffffffff))
                            return true;
                        if (i_82_ >= i_84_ && i_89_ >= i_82_
                                && -i_85_ + i_86_ == i_87_
                                && (0x12c0102 & anIntArrayArray681[i_82_][i_90_]
                                ^ 0xffffffff) == -1)
                            return true;
                    }
                } else {
                    if ((i_84_ ^ 0xffffffff) == (-i_85_ + i_82_ ^ 0xffffffff)
                            && i_86_ >= i_87_
                            && (i_90_ ^ 0xffffffff) <= (i_86_ ^ 0xffffffff))
                        return true;
                    if ((i_84_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff)
                            && (i_82_ ^ 0xffffffff) >= (i_89_ ^ 0xffffffff)
                            && (i_87_ ^ 0xffffffff) == (i_86_ - -1 ^ 0xffffffff))
                        return true;
                    if (i_82_ + 1 == i_84_ && i_86_ >= i_87_
                            && (i_90_ ^ 0xffffffff) <= (i_86_ ^ 0xffffffff)
                            && (0x12c0180 & anIntArrayArray681[i_84_][i_86_]
                            ^ 0xffffffff) == -1)
                        return true;
                    if ((i_84_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff)
                            && i_82_ <= i_89_
                            && (i_87_ ^ 0xffffffff) == (-i_85_ + i_86_
                            ^ 0xffffffff)
                            && (0x12c0102 & anIntArrayArray681[i_82_][i_90_]) == 0)
                        return true;
                }
            }
            if (i_88_ == 9) {
                if ((i_84_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff)
                        && i_89_ >= i_82_ && i_87_ == 1 + i_86_
                        && (anIntArrayArray681[i_82_][i_87_] & 0x12c0120) == 0)
                    return true;
                if ((i_82_ ^ 0xffffffff) <= (i_84_ ^ 0xffffffff)
                        && i_89_ >= i_82_ && i_86_ - i_85_ == i_87_
                        && (anIntArrayArray681[i_82_][i_90_] & 0x12c0102
                        ^ 0xffffffff) == -1)
                    return true;
                if ((i_82_ - i_85_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                        && i_87_ <= i_86_
                        && (i_90_ ^ 0xffffffff) <= (i_86_ ^ 0xffffffff)
                        && (anIntArrayArray681[i_89_][i_86_] & 0x12c0108) == 0)
                    return true;
                if ((1 + i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                        && i_87_ <= i_86_ && i_86_ <= i_90_
                        && (0x12c0180 & anIntArrayArray681[i_84_][i_86_]
                        ^ 0xffffffff) == -1)
                    return true;
            }
        } else {
            if (i_88_ == 0) {
                if (i != 0) {
                    if (i == 1) {
                        if ((i_84_ ^ 0xffffffff) == (i_82_ ^ 0xffffffff)
                                && i_86_ - -1 == i_87_)
                            return true;
                        if ((i_84_ ^ 0xffffffff) == (i_82_ - 1 ^ 0xffffffff)
                                && (i_86_ ^ 0xffffffff) == (i_87_ ^ 0xffffffff)
                                && (anIntArrayArray681[i_84_][i_87_] & 0x12c0108
                                ^ 0xffffffff) == -1)
                            return true;
                        if (1 + i_82_ == i_84_ && i_87_ == i_86_
                                && (anIntArrayArray681[i_84_][i_87_] & 0x12c0180
                                ^ 0xffffffff) == -1)
                            return true;
                    } else if (i == 2) {
                        if ((1 + i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                                && (i_87_ ^ 0xffffffff) == (i_86_ ^ 0xffffffff))
                            return true;
                        if ((i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                                && (i_87_ ^ 0xffffffff) == (i_86_ + 1 ^ 0xffffffff)
                                && ((0x12c0120 & anIntArrayArray681[i_84_][i_87_])
                                == 0))
                            return true;
                        if (i_82_ == i_84_ && i_86_ + -1 == i_87_
                                && (0x12c0102 & anIntArrayArray681[i_84_][i_87_]
                                ^ 0xffffffff) == -1)
                            return true;
                    } else if ((i ^ 0xffffffff) == -4) {
                        if ((i_84_ ^ 0xffffffff) == (i_82_ ^ 0xffffffff)
                                && i_87_ == i_86_ + -1)
                            return true;
                        if (i_84_ == i_82_ + -1
                                && (i_87_ ^ 0xffffffff) == (i_86_ ^ 0xffffffff)
                                && (anIntArrayArray681[i_84_][i_87_] & 0x12c0108
                                ^ 0xffffffff) == -1)
                            return true;
                        if (i_82_ - -1 == i_84_
                                && (i_86_ ^ 0xffffffff) == (i_87_ ^ 0xffffffff)
                                && (0x12c0180 & anIntArrayArray681[i_84_][i_87_]
                                ^ 0xffffffff) == -1)
                            return true;
                    }
                } else {
                    if ((-1 + i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                            && (i_87_ ^ 0xffffffff) == (i_86_ ^ 0xffffffff))
                        return true;
                    if ((i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                            && (i_87_ ^ 0xffffffff) == (1 + i_86_ ^ 0xffffffff)
                            && (anIntArrayArray681[i_84_][i_87_] & 0x12c0120
                            ^ 0xffffffff) == -1)
                        return true;
                    if ((i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                            && i_86_ - 1 == i_87_
                            && (0x12c0102 & anIntArrayArray681[i_84_][i_87_]) == 0)
                        return true;
                }
            }
            if (i_88_ == 2) {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            if (i_84_ == i_82_ + -1
                                    && (i_87_ ^ 0xffffffff) == (i_86_ ^ 0xffffffff)
                                    && ((0x12c0108
                                    & anIntArrayArray681[i_84_][i_87_])
                                    ^ 0xffffffff) == -1)
                                return true;
                            if (i_84_ == i_82_
                                    && (i_87_ ^ 0xffffffff) == (1 + i_86_
                                    ^ 0xffffffff)
                                    && ((0x12c0120
                                    & anIntArrayArray681[i_84_][i_87_])
                                    ^ 0xffffffff) == -1)
                                return true;
                            if ((i_84_ ^ 0xffffffff) == (i_82_ - -1
                                    ^ 0xffffffff)
                                    && (i_86_ ^ 0xffffffff) == (i_87_
                                    ^ 0xffffffff))
                                return true;
                            if ((i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                                    && i_87_ == i_86_ + -1)
                                return true;
                        } else if (i == 3) {
                            if (-1 + i_82_ == i_84_ && i_86_ == i_87_)
                                return true;
                            if (i_82_ == i_84_ && i_86_ - -1 == i_87_
                                    && ((anIntArrayArray681[i_84_][i_87_]
                                    & 0x12c0120)
                                    ^ 0xffffffff) == -1)
                                return true;
                            if ((1 + i_82_ ^ 0xffffffff) == (i_84_
                                    ^ 0xffffffff)
                                    && (i_86_ ^ 0xffffffff) == (i_87_ ^ 0xffffffff)
                                    && ((0x12c0180
                                    & anIntArrayArray681[i_84_][i_87_])
                                    ^ 0xffffffff) == -1)
                                return true;
                            if (i_84_ == i_82_
                                    && (i_87_ ^ 0xffffffff) == (-1 + i_86_
                                    ^ 0xffffffff))
                                return true;
                        }
                    } else {
                        if (i_82_ - 1 == i_84_
                                && (i_86_ ^ 0xffffffff) == (i_87_ ^ 0xffffffff)
                                && ((anIntArrayArray681[i_84_][i_87_] & 0x12c0108)
                                == 0))
                            return true;
                        if ((i_84_ ^ 0xffffffff) == (i_82_ ^ 0xffffffff)
                                && i_87_ == i_86_ - -1)
                            return true;
                        if ((i_84_ ^ 0xffffffff) == (1 + i_82_ ^ 0xffffffff)
                                && (i_87_ ^ 0xffffffff) == (i_86_ ^ 0xffffffff))
                            return true;
                        if ((i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                                && (-1 + i_86_ ^ 0xffffffff) == (i_87_
                                ^ 0xffffffff)
                                && (anIntArrayArray681[i_84_][i_87_] & 0x12c0102
                                ^ 0xffffffff) == -1)
                            return true;
                    }
                } else {
                    if ((-1 + i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                            && (i_87_ ^ 0xffffffff) == (i_86_ ^ 0xffffffff))
                        return true;
                    if (i_82_ == i_84_ && i_87_ == i_86_ - -1)
                        return true;
                    if ((1 + i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                            && i_87_ == i_86_
                            && (0x12c0180 & anIntArrayArray681[i_84_][i_87_]
                            ^ 0xffffffff) == -1)
                        return true;
                    if (i_82_ == i_84_ && i_86_ - 1 == i_87_
                            && (0x12c0102 & anIntArrayArray681[i_84_][i_87_]
                            ^ 0xffffffff) == -1)
                        return true;
                }
            }
            if (i_88_ == 9) {
                if ((i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                        && (i_86_ - -1 ^ 0xffffffff) == (i_87_ ^ 0xffffffff)
                        && (anIntArrayArray681[i_84_][i_87_] & 0x20) == 0)
                    return true;
                if ((i_82_ ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                        && i_87_ == i_86_ + -1
                        && (anIntArrayArray681[i_84_][i_87_] & 0x2) == 0)
                    return true;
                if (i_84_ == i_82_ + -1 && i_86_ == i_87_
                        && (anIntArrayArray681[i_84_][i_87_] & 0x8) == 0)
                    return true;
                if ((i_82_ - -1 ^ 0xffffffff) == (i_84_ ^ 0xffffffff)
                        && i_87_ == i_86_
                        && (0x80 & anIntArrayArray681[i_84_][i_87_]) == 0)
                    return true;
            }
        }
        return false;
    }

    public static Class92_Sub1 method460(int i) {
        if (i != 9662)
            anInt666 = 43;
        Class92_Sub1 class92_sub1
                = new Class92_Sub1(Class97.anInt1703,
                Class68_Sub20_Sub15.anInt4405,
                Class4.anIntArray96[0],
                Class116.anIntArray1996[0],
                Class68_Sub13_Sub12.anIntArray3639[0],
                Class68_Sub13_Sub19.anIntArray3757[0],
                Class69.aByteArrayArray1240[0],
                Class68_Sub13_Sub17.anIntArray3719);
        Class87.method1487((byte) -93);
        anInt673++;
        return class92_sub1;
    }

    public void method461(int i, int i_91_, boolean bool, int i_92_, int i_93_,
                          byte i_94_) {
        i_93_ -= anInt658;
        anInt670++;
        i_91_ -= anInt662;
        if (i_92_ == 0) {
            if ((i ^ 0xffffffff) == -1) {
                method451((byte) -74, i_91_, 128, i_93_);
                method451((byte) -74, i_91_, 8, -1 + i_93_);
            }
            if ((i ^ 0xffffffff) == -2) {
                method451((byte) -74, i_91_, 2, i_93_);
                method451((byte) -74, 1 + i_91_, 32, i_93_);
            }
            if (i == 2) {
                method451((byte) -74, i_91_, 8, i_93_);
                method451((byte) -74, i_91_, 128, 1 + i_93_);
            }
            if (i == 3) {
                method451((byte) -74, i_91_, 32, i_93_);
                method451((byte) -74, -1 + i_91_, 2, i_93_);
            }
        }
        int i_95_ = 78 % ((-87 - i_94_) / 37);
        if ((i_92_ ^ 0xffffffff) == -2 || i_92_ == 3) {
            if ((i ^ 0xffffffff) == -1) {
                method451((byte) -74, i_91_, 1, i_93_);
                method451((byte) -74, 1 + i_91_, 16, i_93_ - 1);
            }
            if ((i ^ 0xffffffff) == -2) {
                method451((byte) -74, i_91_, 4, i_93_);
                method451((byte) -74, 1 + i_91_, 64, 1 + i_93_);
            }
            if (i == 2) {
                method451((byte) -74, i_91_, 16, i_93_);
                method451((byte) -74, i_91_ + -1, 1, 1 + i_93_);
            }
            if ((i ^ 0xffffffff) == -4) {
                method451((byte) -74, i_91_, 64, i_93_);
                method451((byte) -74, i_91_ - 1, 4, i_93_ - 1);
            }
        }
        if ((i_92_ ^ 0xffffffff) == -3) {
            if ((i ^ 0xffffffff) == -1) {
                method451((byte) -74, i_91_, 130, i_93_);
                method451((byte) -74, i_91_, 8, i_93_ - 1);
                method451((byte) -74, i_91_ - -1, 32, i_93_);
            }
            if ((i ^ 0xffffffff) == -2) {
                method451((byte) -74, i_91_, 10, i_93_);
                method451((byte) -74, 1 + i_91_, 32, i_93_);
                method451((byte) -74, i_91_, 128, 1 + i_93_);
            }
            if ((i ^ 0xffffffff) == -3) {
                method451((byte) -74, i_91_, 40, i_93_);
                method451((byte) -74, i_91_, 128, 1 + i_93_);
                method451((byte) -74, i_91_ - 1, 2, i_93_);
            }
            if (i == 3) {
                method451((byte) -74, i_91_, 160, i_93_);
                method451((byte) -74, -1 + i_91_, 2, i_93_);
                method451((byte) -74, i_91_, 8, i_93_ - 1);
            }
        }
        if (bool) {
            if ((i_92_ ^ 0xffffffff) == -1) {
                if (i == 0) {
                    method451((byte) -74, i_91_, 65536, i_93_);
                    method451((byte) -74, i_91_, 4096, i_93_ + -1);
                }
                if ((i ^ 0xffffffff) == -2) {
                    method451((byte) -74, i_91_, 1024, i_93_);
                    method451((byte) -74, 1 + i_91_, 16384, i_93_);
                }
                if ((i ^ 0xffffffff) == -3) {
                    method451((byte) -74, i_91_, 4096, i_93_);
                    method451((byte) -74, i_91_, 65536, 1 + i_93_);
                }
                if (i == 3) {
                    method451((byte) -74, i_91_, 16384, i_93_);
                    method451((byte) -74, -1 + i_91_, 1024, i_93_);
                }
            }
            if (i_92_ == 1 || i_92_ == 3) {
                if ((i ^ 0xffffffff) == -1) {
                    method451((byte) -74, i_91_, 512, i_93_);
                    method451((byte) -74, 1 + i_91_, 8192, i_93_ - 1);
                }
                if (i == 1) {
                    method451((byte) -74, i_91_, 2048, i_93_);
                    method451((byte) -74, 1 + i_91_, 32768, 1 + i_93_);
                }
                if (i == 2) {
                    method451((byte) -74, i_91_, 8192, i_93_);
                    method451((byte) -74, -1 + i_91_, 512, i_93_ - -1);
                }
                if (i == 3) {
                    method451((byte) -74, i_91_, 32768, i_93_);
                    method451((byte) -74, -1 + i_91_, 2048, i_93_ - 1);
                }
            }
            if ((i_92_ ^ 0xffffffff) == -3) {
                if (i == 0) {
                    method451((byte) -74, i_91_, 66560, i_93_);
                    method451((byte) -74, i_91_, 4096, i_93_ + -1);
                    method451((byte) -74, i_91_ - -1, 16384, i_93_);
                }
                if (i == 1) {
                    method451((byte) -74, i_91_, 5120, i_93_);
                    method451((byte) -74, i_91_ - -1, 16384, i_93_);
                    method451((byte) -74, i_91_, 65536, 1 + i_93_);
                }
                if ((i ^ 0xffffffff) == -3) {
                    method451((byte) -74, i_91_, 20480, i_93_);
                    method451((byte) -74, i_91_, 65536, 1 + i_93_);
                    method451((byte) -74, -1 + i_91_, 1024, i_93_);
                }
                if (i == 3) {
                    method451((byte) -74, i_91_, 81920, i_93_);
                    method451((byte) -74, i_91_ + -1, 1024, i_93_);
                    method451((byte) -74, i_91_, 4096, -1 + i_93_);
                }
            }
        }
    }

    public boolean method462(int i, int i_96_, int i_97_, byte i_98_,
                             int i_99_, int i_100_, int i_101_, int i_102_) {
        anInt683++;
        if ((i_99_ ^ 0xffffffff) != -2) {
            if (i_96_ <= i && i <= -1 + (i_99_ + i_96_)
                    && (i_100_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff)
                    && -1 + (i_100_ - -i_99_) >= i_100_)
                return true;
        } else if ((i ^ 0xffffffff) == (i_96_ ^ 0xffffffff)
                && (i_100_ ^ 0xffffffff) == (i_101_ ^ 0xffffffff))
            return true;
        i -= anInt658;
        i_100_ -= anInt662;
        i_101_ -= anInt662;
        int i_103_ = -3 % ((18 - i_98_) / 36);
        i_96_ -= anInt658;
        if (i_99_ == 1) {
            if ((i_102_ ^ 0xffffffff) == -7 || i_102_ == 7) {
                if (i_102_ == 7)
                    i_97_ = 0x3 & i_97_ - -2;
                if ((i_97_ ^ 0xffffffff) == -1) {
                    if ((i_96_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)
                            && i_101_ == i_100_
                            && (anIntArrayArray681[i_96_][i_101_] & 0x80) == 0)
                        return true;
                    if (i_96_ == i && -1 + i_100_ == i_101_
                            && (anIntArrayArray681[i_96_][i_101_] & 0x2
                            ^ 0xffffffff) == -1)
                        return true;
                } else if (i_97_ != 1) {
                    if ((i_97_ ^ 0xffffffff) != -3) {
                        if ((i_97_ ^ 0xffffffff) == -4) {
                            if ((i_96_ ^ 0xffffffff) == (i - -1 ^ 0xffffffff)
                                    && (i_100_ ^ 0xffffffff) == (i_101_
                                    ^ 0xffffffff)
                                    && ((0x80 & anIntArrayArray681[i_96_][i_101_])
                                    == 0))
                                return true;
                            if ((i_96_ ^ 0xffffffff) == (i ^ 0xffffffff)
                                    && (i_101_ ^ 0xffffffff) == (1 + i_100_
                                    ^ 0xffffffff)
                                    && ((0x20 & anIntArrayArray681[i_96_][i_101_])
                                    == 0))
                                return true;
                        }
                    } else {
                        if (i_96_ == -1 + i
                                && (i_101_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff)
                                && (0x8 & anIntArrayArray681[i_96_][i_101_]) == 0)
                            return true;
                        if ((i_96_ ^ 0xffffffff) == (i ^ 0xffffffff)
                                && i_101_ == 1 + i_100_
                                && (0x20 & anIntArrayArray681[i_96_][i_101_]) == 0)
                            return true;
                    }
                } else {
                    if (i + -1 == i_96_
                            && (i_100_ ^ 0xffffffff) == (i_101_ ^ 0xffffffff)
                            && (anIntArrayArray681[i_96_][i_101_] & 0x8
                            ^ 0xffffffff) == -1)
                        return true;
                    if (i_96_ == i
                            && (i_101_ ^ 0xffffffff) == (-1 + i_100_ ^ 0xffffffff)
                            && (0x2 & anIntArrayArray681[i_96_][i_101_]
                            ^ 0xffffffff) == -1)
                        return true;
                }
            }
            if (i_102_ == 8) {
                if ((i_96_ ^ 0xffffffff) == (i ^ 0xffffffff)
                        && 1 + i_100_ == i_101_
                        && (0x20 & anIntArrayArray681[i_96_][i_101_]) == 0)
                    return true;
                if ((i_96_ ^ 0xffffffff) == (i ^ 0xffffffff)
                        && (i_101_ ^ 0xffffffff) == (-1 + i_100_ ^ 0xffffffff)
                        && ((0x2 & anIntArrayArray681[i_96_][i_101_] ^ 0xffffffff)
                        == -1))
                    return true;
                if (-1 + i == i_96_ && i_101_ == i_100_
                        && ((0x8 & anIntArrayArray681[i_96_][i_101_] ^ 0xffffffff)
                        == -1))
                    return true;
                if (i_96_ == i + 1 && i_100_ == i_101_
                        && ((0x80 & anIntArrayArray681[i_96_][i_101_] ^ 0xffffffff)
                        == -1))
                    return true;
            }
        } else {
            int i_104_ = -1 + (i_96_ + i_99_);
            int i_105_ = i_99_ + (i_101_ - 1);
            if (i_102_ == 6 || (i_102_ ^ 0xffffffff) == -8) {
                if (i_102_ == 7)
                    i_97_ = i_97_ + 2 & 0x3;
                if (i_97_ == 0) {
                    if (i + 1 == i_96_ && i_101_ <= i_100_
                            && (i_100_ ^ 0xffffffff) >= (i_105_ ^ 0xffffffff)
                            && (anIntArrayArray681[i_96_][i_100_] & 0x80
                            ^ 0xffffffff) == -1)
                        return true;
                    if ((i_96_ ^ 0xffffffff) >= (i ^ 0xffffffff) && i <= i_104_
                            && i_100_ + -i_99_ == i_101_
                            && ((anIntArrayArray681[i][i_105_] & 0x2 ^ 0xffffffff)
                            == -1))
                        return true;
                } else if (i_97_ == 1) {
                    if (-i_99_ + i == i_96_
                            && (i_101_ ^ 0xffffffff) >= (i_100_ ^ 0xffffffff)
                            && (i_100_ ^ 0xffffffff) >= (i_105_ ^ 0xffffffff)
                            && (anIntArrayArray681[i_104_][i_100_] & 0x8) == 0)
                        return true;
                    if (i >= i_96_ && (i ^ 0xffffffff) >= (i_104_ ^ 0xffffffff)
                            && -i_99_ + i_100_ == i_101_
                            && (0x2 & anIntArrayArray681[i][i_105_]) == 0)
                        return true;
                } else if ((i_97_ ^ 0xffffffff) == -3) {
                    if (i_96_ == -i_99_ + i
                            && (i_100_ ^ 0xffffffff) <= (i_101_ ^ 0xffffffff)
                            && (i_100_ ^ 0xffffffff) >= (i_105_ ^ 0xffffffff)
                            && (0x8 & anIntArrayArray681[i_104_][i_100_]
                            ^ 0xffffffff) == -1)
                        return true;
                    if (i >= i_96_ && (i ^ 0xffffffff) >= (i_104_ ^ 0xffffffff)
                            && i_101_ == 1 + i_100_
                            && ((0x20 & anIntArrayArray681[i][i_101_] ^ 0xffffffff)
                            == -1))
                        return true;
                } else if ((i_97_ ^ 0xffffffff) == -4) {
                    if ((i + 1 ^ 0xffffffff) == (i_96_ ^ 0xffffffff)
                            && i_101_ <= i_100_ && i_100_ <= i_105_
                            && (anIntArrayArray681[i_96_][i_100_] & 0x80
                            ^ 0xffffffff) == -1)
                        return true;
                    if ((i_96_ ^ 0xffffffff) >= (i ^ 0xffffffff) && i <= i_104_
                            && i_101_ == 1 + i_100_
                            && (0x20 & anIntArrayArray681[i][i_101_]) == 0)
                        return true;
                }
            }
            if (i_102_ == 8) {
                if (i >= i_96_ && i <= i_104_
                        && (i_100_ - -1 ^ 0xffffffff) == (i_101_ ^ 0xffffffff)
                        && (0x20 & anIntArrayArray681[i][i_101_]) == 0)
                    return true;
                if ((i_96_ ^ 0xffffffff) >= (i ^ 0xffffffff)
                        && (i ^ 0xffffffff) >= (i_104_ ^ 0xffffffff)
                        && (i_101_ ^ 0xffffffff) == (i_100_ - i_99_ ^ 0xffffffff)
                        && (anIntArrayArray681[i][i_105_] & 0x2) == 0)
                    return true;
                if ((-i_99_ + i ^ 0xffffffff) == (i_96_ ^ 0xffffffff)
                        && (i_101_ ^ 0xffffffff) >= (i_100_ ^ 0xffffffff)
                        && (i_100_ ^ 0xffffffff) >= (i_105_ ^ 0xffffffff)
                        && ((anIntArrayArray681[i_104_][i_100_] & 0x8 ^ 0xffffffff)
                        == -1))
                    return true;
                if ((1 + i ^ 0xffffffff) == (i_96_ ^ 0xffffffff)
                        && i_100_ >= i_101_ && i_100_ <= i_105_
                        && ((0x80 & anIntArrayArray681[i_96_][i_100_] ^ 0xffffffff)
                        == -1))
                    return true;
            }
        }
        return false;
    }

    public GroundData(int i, int i_106_) {
        anInt672 = i_106_;
        anInt684 = i;
        anIntArrayArray681 = new int[anInt684][anInt672];
        anInt658 = 0;
        anInt662 = 0;
        method444(false);
    }
}
