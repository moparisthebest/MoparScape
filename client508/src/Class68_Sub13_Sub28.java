/* Class68_Sub13_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub28 extends Class68_Sub13 {
    public static int anInt3917 = 10;
    public static int anInt3918;
    public static boolean aBoolean3919 = true;
    public static int anInt3920 = 0;
    public static int anInt3921;
    public int anInt3922 = 6;
    public static Class98 aClass98_3923;
    public static int anInt3924;
    public static int anInt3925;
    public static int anInt3926;
    public static int anInt3927;
    public static int anInt3928;
    public static int[] anIntArray3929 = {-1, -1, 1, 1};

    public static void method844(byte i, int i_0_, int i_1_) {
        anInt3926++;
        if (i != 106)
            anInt3917 = -11;
        if (Class68_Sub13_Sub25.anInt3855 != 0 && (i_1_ ^ 0xffffffff) != 0) {
            Class68_Sub13_Sub38.method899(i_1_, Class21renamed.aClass21_Sub1_472,
                    false, 0,
                    Class68_Sub13_Sub25.anInt3855,
                    false);
            Class123.aBoolean2127 = true;
        }
    }

    public static void method845(byte i) {
        Class68_Sub13_Sub8.aClass98_3561.method1566((byte) 94);
        if (i == -115)
            anInt3921++;
    }

    public int[] method698(byte i, int i_2_) {
        anInt3924++;
        if (i != -61)
            return null;
        int[] is = aClass115_2936.method1697(false, i_2_);
        while_132_:
        do {
            if (aClass115_2936.aBoolean1957) {
                int[] is_3_ = this.method696(0, i_2_, 29149);
                int[] is_4_ = this.method696(1, i_2_, 29149);
                int i_5_ = anInt3922;
                while_131_:
                do {
                    while_130_:
                    do {
                        while_129_:
                        do {
                            while_128_:
                            do {
                                while_127_:
                                do {
                                    while_126_:
                                    do {
                                        while_125_:
                                        do {
                                            while_124_:
                                            do {
                                                while_123_:
                                                do {
                                                    do {
                                                        if ((i_5_ ^ 0xffffffff)
                                                                != -2) {
                                                            if (i_5_ != 2) {
                                                                if ((i_5_
                                                                        ^ 0xffffffff)
                                                                        != -4) {
                                                                    if ((i_5_
                                                                            ^ 0xffffffff)
                                                                            != -5) {
                                                                        if ((i_5_
                                                                                ^ 0xffffffff)
                                                                                != -6) {
                                                                            if ((i_5_ ^ 0xffffffff) != -7) {
                                                                                if ((i_5_ ^ 0xffffffff) != -8) {
                                                                                    if (i_5_ != 8) {
                                                                                        if ((i_5_ ^ 0xffffffff) != -10) {
                                                                                            if (i_5_ != 10) {
                                                                                                if (i_5_ != 11) {
                                                                                                    if ((i_5_ ^ 0xffffffff) != -13)
                                                                                                        break while_132_;
                                                                                                } else
                                                                                                    break while_130_;
                                                                                                break while_131_;
                                                                                            }
                                                                                        } else
                                                                                            break while_128_;
                                                                                        break while_129_;
                                                                                    }
                                                                                } else
                                                                                    break while_126_;
                                                                                break while_127_;
                                                                            }
                                                                        } else
                                                                            break while_124_;
                                                                        break while_125_;
                                                                    }
                                                                } else
                                                                    break;
                                                                break while_123_;
                                                            }
                                                        } else {
                                                            for (i_5_ = 0;
                                                                 ((i_5_
                                                                         ^ 0xffffffff)
                                                                         > ((Class68_Sub13_Sub19
                                                                         .anInt3746)
                                                                         ^ 0xffffffff));
                                                                 i_5_++)
                                                                is[i_5_]
                                                                        = ((is_4_
                                                                        [i_5_])
                                                                        + (is_3_
                                                                        [i_5_]));
                                                            break while_132_;
                                                        }
                                                        for (i_5_ = 0;
                                                             (i_5_
                                                                     < (Class68_Sub13_Sub19
                                                                     .anInt3746));
                                                             i_5_++)
                                                            is[i_5_]
                                                                    = (is_3_[i_5_]
                                                                    - (is_4_
                                                                    [i_5_]));
                                                        break while_132_;
                                                    } while (false);
                                                    for (i_5_ = 0;
                                                         ((Class68_Sub13_Sub19
                                                                 .anInt3746)
                                                                 > i_5_);
                                                         i_5_++)
                                                        is[i_5_]
                                                                = ((is_4_[i_5_]
                                                                * is_3_[i_5_])
                                                                >> -40724276);
                                                    break while_132_;
                                                } while (false);
                                                for (i_5_ = 0;
                                                     ((i_5_ ^ 0xffffffff)
                                                             > ((Class68_Sub13_Sub19
                                                             .anInt3746)
                                                             ^ 0xffffffff));
                                                     i_5_++) {
                                                    int i_6_ = is_4_[i_5_];
                                                    is[i_5_]
                                                            = (((i_6_ ^ 0xffffffff)
                                                            != -1)
                                                            ? ((is_3_[i_5_]
                                                            << 710496812)
                                                            / i_6_)
                                                            : 4096);
                                                }
                                                break while_132_;
                                            } while (false);
                                            for (i_5_ = 0;
                                                 (((Class68_Sub13_Sub19
                                                         .anInt3746)
                                                         ^ 0xffffffff)
                                                         < (i_5_ ^ 0xffffffff));
                                                 i_5_++)
                                                is[i_5_]
                                                        = 4096 + -(((-is_4_[i_5_]
                                                        + 4096)
                                                        * (-is_3_[i_5_]
                                                        + 4096))
                                                        >> -1186110484);
                                            break while_132_;
                                        } while (false);
                                        for (i_5_ = 0;
                                             (Class68_Sub13_Sub19.anInt3746
                                                     > i_5_);
                                             i_5_++) {
                                            int i_7_ = is_4_[i_5_];
                                            is[i_5_]
                                                    = ((i_7_ ^ 0xffffffff) <= -2049
                                                    ? -(((4096 + -is_3_[i_5_])
                                                    * (-i_7_ + 4096))
                                                    >> 1743551403) + 4096
                                                    : (i_7_ * is_3_[i_5_]
                                                    >> 1871217099));
                                        }
                                        break while_132_;
                                    } while (false);
                                    for (i_5_ = 0;
                                         Class68_Sub13_Sub19.anInt3746 > i_5_;
                                         i_5_++) {
                                        int i_8_ = is_3_[i_5_];
                                        is[i_5_]
                                                = ((i_8_ ^ 0xffffffff) != -4097
                                                ? ((is_4_[i_5_] << -663849236)
                                                / (4096 + -i_8_))
                                                : 4096);
                                    }
                                    break while_132_;
                                } while (false);
                                for (i_5_ = 0;
                                     ((Class68_Sub13_Sub19.anInt3746
                                             ^ 0xffffffff)
                                             < (i_5_ ^ 0xffffffff));
                                     i_5_++) {
                                    int i_9_ = is_3_[i_5_];
                                    is[i_5_] = (i_9_ == 0 ? 0
                                            : -((4096 + -is_4_[i_5_]
                                            << 109881068)
                                            / i_9_) + 4096);
                                }
                                break while_132_;
                            } while (false);
                            for (i_5_ = 0;
                                 ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                                         < (i_5_ ^ 0xffffffff));
                                 i_5_++) {
                                int i_10_ = is_3_[i_5_];
                                int i_11_ = is_4_[i_5_];
                                is[i_5_]
                                        = ((i_10_ ^ 0xffffffff) > (i_11_
                                        ^ 0xffffffff)
                                        ? i_10_ : i_11_);
                            }
                            break while_132_;
                        } while (false);
                        for (i_5_ = 0; i_5_ < Class68_Sub13_Sub19.anInt3746;
                             i_5_++) {
                            int i_12_ = is_4_[i_5_];
                            int i_13_ = is_3_[i_5_];
                            is[i_5_]
                                    = ((i_13_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)
                                    ? i_12_ : i_13_);
                        }
                        break while_132_;
                    } while (false);
                    for (i_5_ = 0;
                         ((i_5_ ^ 0xffffffff)
                                 > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                         i_5_++) {
                        int i_14_ = is_3_[i_5_];
                        int i_15_ = is_4_[i_5_];
                        is[i_5_]
                                = i_14_ <= i_15_ ? i_15_ - i_14_ : i_14_ + -i_15_;
                    }
                    break while_132_;
                } while (false);
                for (i_5_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                        < (i_5_ ^ 0xffffffff)); i_5_++) {
                    int i_16_ = is_3_[i_5_];
                    int i_17_ = is_4_[i_5_];
                    is[i_5_]
                            = -(i_17_ * i_16_ >> -1131577557) + (i_16_ - -i_17_);
                }
            }
        } while (false);
        return is;
    }

    public static void method846(int i, int i_18_, int i_19_) {
        anInt3918++;
        Class68_Sub20_Sub9 class68_sub20_sub9
                = Class68_Sub13_Sub26_Sub1.method835(i_19_, 1, (byte) -127);
        class68_sub20_sub9.method1097(0);
        if (i_18_ < 89)
            method844((byte) -107, -116, -64);
        class68_sub20_sub9.anInt4293 = i;
    }

    public static void method847(boolean bool) {
        anIntArray3929 = null;
        aClass98_3923 = null;
        if (bool != true)
            method846(99, -56, -68);
    }

    public Class68_Sub13_Sub28() {
        super(2, false);
    }

    public static Class47 method848(int i, int i_20_, int i_21_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_20_][i_21_];
        if (class68_sub1 == null || class68_sub1.aClass47_2777 == null)
            return null;
        return class68_sub1.aClass47_2777;
    }

    public int[][] method697(int i, boolean bool) {
        anInt3928++;
        int[][] is = aClass88_2939.method1496(i, (byte) -102);
        while_142_:
        do {
            if (aClass88_2939.aBoolean1610) {
                int[][] is_22_ = this.method699(-125, 0, i);
                int[][] is_23_ = this.method699(-128, 1, i);
                int[] is_24_ = is[1];
                int[] is_25_ = is[2];
                int[] is_26_ = is[0];
                int[] is_27_ = is_22_[0];
                int[] is_28_ = is_22_[1];
                int[] is_29_ = is_22_[2];
                int[] is_30_ = is_23_[0];
                int[] is_31_ = is_23_[1];
                int[] is_32_ = is_23_[2];
                int i_33_ = anInt3922;
                while_141_:
                do {
                    while_140_:
                    do {
                        while_139_:
                        do {
                            while_138_:
                            do {
                                while_137_:
                                do {
                                    while_136_:
                                    do {
                                        while_135_:
                                        do {
                                            while_134_:
                                            do {
                                                while_133_:
                                                do {
                                                    do {
                                                        if ((i_33_
                                                                ^ 0xffffffff)
                                                                != -2) {
                                                            if (i_33_ != 2) {
                                                                if (i_33_
                                                                        != 3) {
                                                                    if (i_33_
                                                                            != 4) {
                                                                        if (i_33_
                                                                                != 5) {
                                                                            if (i_33_ != 6) {
                                                                                if ((i_33_ ^ 0xffffffff) != -8) {
                                                                                    if ((i_33_ ^ 0xffffffff) != -9) {
                                                                                        if (i_33_ != 9) {
                                                                                            if ((i_33_ ^ 0xffffffff) != -11) {
                                                                                                if (i_33_ != 11) {
                                                                                                    if ((i_33_ ^ 0xffffffff) != -13)
                                                                                                        break while_142_;
                                                                                                } else
                                                                                                    break while_140_;
                                                                                                break while_141_;
                                                                                            }
                                                                                        } else
                                                                                            break while_138_;
                                                                                        break while_139_;
                                                                                    }
                                                                                } else
                                                                                    break while_136_;
                                                                                break while_137_;
                                                                            }
                                                                        } else
                                                                            break while_134_;
                                                                        break while_135_;
                                                                    }
                                                                } else
                                                                    break;
                                                                break while_133_;
                                                            }
                                                        } else {
                                                            for (i_33_ = 0;
                                                                 (((Class68_Sub13_Sub19
                                                                         .anInt3746)
                                                                         ^ 0xffffffff)
                                                                         < (i_33_
                                                                         ^ 0xffffffff));
                                                                 i_33_++) {
                                                                is_26_[i_33_]
                                                                        = ((is_27_
                                                                        [i_33_])
                                                                        - -(is_30_
                                                                        [i_33_]));
                                                                is_24_[i_33_]
                                                                        = ((is_28_
                                                                        [i_33_])
                                                                        + (is_31_
                                                                        [i_33_]));
                                                                is_25_[i_33_]
                                                                        = ((is_32_
                                                                        [i_33_])
                                                                        + (is_29_
                                                                        [i_33_]));
                                                            }
                                                            break while_142_;
                                                        }
                                                        for (i_33_ = 0;
                                                             (((Class68_Sub13_Sub19
                                                                     .anInt3746)
                                                                     ^ 0xffffffff)
                                                                     < (i_33_
                                                                     ^ 0xffffffff));
                                                             i_33_++) {
                                                            is_26_[i_33_]
                                                                    = ((is_27_
                                                                    [i_33_])
                                                                    - (is_30_
                                                                    [i_33_]));
                                                            is_24_[i_33_]
                                                                    = (-(is_31_
                                                                    [i_33_])
                                                                    + (is_28_
                                                                    [i_33_]));
                                                            is_25_[i_33_]
                                                                    = (-(is_32_
                                                                    [i_33_])
                                                                    + (is_29_
                                                                    [i_33_]));
                                                        }
                                                        break while_142_;
                                                    } while (false);
                                                    for (i_33_ = 0;
                                                         ((Class68_Sub13_Sub19
                                                                 .anInt3746)
                                                                 > i_33_);
                                                         i_33_++) {
                                                        is_26_[i_33_]
                                                                = ((is_27_[i_33_]
                                                                * (is_30_
                                                                [i_33_]))
                                                                >> -924891028);
                                                        is_24_[i_33_]
                                                                = ((is_31_[i_33_]
                                                                * (is_28_
                                                                [i_33_]))
                                                                >> -1164470868);
                                                        is_25_[i_33_]
                                                                = ((is_29_[i_33_]
                                                                * (is_32_
                                                                [i_33_]))
                                                                >> -253440052);
                                                    }
                                                    break while_142_;
                                                } while (false);
                                                for (i_33_ = 0;
                                                     ((Class68_Sub13_Sub19
                                                             .anInt3746)
                                                             > i_33_);
                                                     i_33_++) {
                                                    int i_34_ = is_31_[i_33_];
                                                    int i_35_ = is_32_[i_33_];
                                                    int i_36_ = is_30_[i_33_];
                                                    is_26_[i_33_]
                                                            = (i_36_ == 0 ? 4096
                                                            : ((is_27_[i_33_]
                                                            << -1354494100)
                                                            / i_36_));
                                                    is_24_[i_33_]
                                                            = ((i_34_
                                                            ^ 0xffffffff) == -1
                                                            ? 4096
                                                            : ((is_28_[i_33_]
                                                            << 433702380)
                                                            / i_34_));
                                                    is_25_[i_33_]
                                                            = (i_35_ == 0 ? 4096
                                                            : ((is_29_[i_33_]
                                                            << 1115671852)
                                                            / i_35_));
                                                }
                                                break while_142_;
                                            } while (false);
                                            for (i_33_ = 0;
                                                 ((i_33_ ^ 0xffffffff)
                                                         > ((Class68_Sub13_Sub19
                                                         .anInt3746)
                                                         ^ 0xffffffff));
                                                 i_33_++) {
                                                is_26_[i_33_]
                                                        = (4096
                                                        - (((4096
                                                        + -is_30_[i_33_])
                                                        * (-is_27_[i_33_]
                                                        + 4096))
                                                        >> -1301301364));
                                                is_24_[i_33_]
                                                        = (4096
                                                        - (((-is_31_[i_33_]
                                                        + 4096)
                                                        * (-is_28_[i_33_]
                                                        + 4096))
                                                        >> 1991461676));
                                                is_25_[i_33_]
                                                        = -(((-is_32_[i_33_]
                                                        + 4096)
                                                        * (-is_29_[i_33_]
                                                        + 4096))
                                                        >> 691978508) + 4096;
                                            }
                                            break while_142_;
                                        } while (false);
                                        for (i_33_ = 0;
                                             ((i_33_ ^ 0xffffffff)
                                                     > (Class68_Sub13_Sub19.anInt3746
                                                     ^ 0xffffffff));
                                             i_33_++) {
                                            int i_37_ = is_30_[i_33_];
                                            int i_38_ = is_32_[i_33_];
                                            int i_39_ = is_31_[i_33_];
                                            is_26_[i_33_]
                                                    = ((i_37_ ^ 0xffffffff) > -2049
                                                    ? (i_37_ * is_27_[i_33_]
                                                    >> -2125438965)
                                                    : (4096
                                                    + -(((4096
                                                    - is_27_[i_33_])
                                                    * (4096 - i_37_))
                                                    >> -323397653)));
                                            is_24_[i_33_]
                                                    = (i_39_ >= 2048
                                                    ? 4096 - (((4096 - i_39_)
                                                    * (-is_28_[i_33_]
                                                    + 4096))
                                                    >> 2089853707)
                                                    : (is_28_[i_33_] * i_39_
                                                    >> -485175445));
                                            is_25_[i_33_]
                                                    = ((i_38_ ^ 0xffffffff) > -2049
                                                    ? (is_29_[i_33_] * i_38_
                                                    >> 1030249003)
                                                    : 4096 - (((-i_38_ + 4096)
                                                    * (-is_29_[i_33_]
                                                    + 4096))
                                                    >> -1943585397));
                                        }
                                        break while_142_;
                                    } while (false);
                                    for (i_33_ = 0;
                                         i_33_ < Class68_Sub13_Sub19.anInt3746;
                                         i_33_++) {
                                        int i_40_ = is_28_[i_33_];
                                        int i_41_ = is_27_[i_33_];
                                        int i_42_ = is_29_[i_33_];
                                        is_26_[i_33_]
                                                = (i_41_ == 4096 ? 4096
                                                : ((is_30_[i_33_] << 1483772396)
                                                / (4096 + -i_41_)));
                                        is_24_[i_33_]
                                                = (i_40_ == 4096 ? 4096
                                                : ((is_31_[i_33_] << -43184116)
                                                / (4096 - i_40_)));
                                        is_25_[i_33_]
                                                = (i_42_ == 4096 ? 4096
                                                : ((is_32_[i_33_] << -522695380)
                                                / (4096 - i_42_)));
                                    }
                                    break while_142_;
                                } while (false);
                                for (i_33_ = 0;
                                     i_33_ < Class68_Sub13_Sub19.anInt3746;
                                     i_33_++) {
                                    int i_43_ = is_29_[i_33_];
                                    int i_44_ = is_28_[i_33_];
                                    int i_45_ = is_27_[i_33_];
                                    is_26_[i_33_]
                                            = (i_45_ == 0 ? 0
                                            : 4096 + -((-is_30_[i_33_] + 4096
                                            << -532940436)
                                            / i_45_));
                                    is_24_[i_33_]
                                            = ((i_44_ ^ 0xffffffff) == -1 ? 0
                                            : -((-is_31_[i_33_] + 4096
                                            << 1211544780)
                                            / i_44_) + 4096);
                                    is_25_[i_33_] = (i_43_ == 0 ? 0
                                            : -((4096 - is_32_[i_33_]
                                            << 318990316)
                                            / i_43_) + 4096);
                                }
                                break while_142_;
                            } while (false);
                            for (i_33_ = 0; ((i_33_ ^ 0xffffffff)
                                    > (Class68_Sub13_Sub19.anInt3746
                                    ^ 0xffffffff)); i_33_++) {
                                int i_46_ = is_29_[i_33_];
                                int i_47_ = is_31_[i_33_];
                                int i_48_ = is_27_[i_33_];
                                int i_49_ = is_30_[i_33_];
                                int i_50_ = is_32_[i_33_];
                                int i_51_ = is_28_[i_33_];
                                is_26_[i_33_] = i_49_ <= i_48_ ? i_49_ : i_48_;
                                is_24_[i_33_]
                                        = ((i_47_ ^ 0xffffffff) < (i_51_
                                        ^ 0xffffffff)
                                        ? i_51_ : i_47_);
                                is_25_[i_33_] = i_46_ < i_50_ ? i_46_ : i_50_;
                            }
                            break while_142_;
                        } while (false);
                        for (i_33_ = 0;
                             ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                                     < (i_33_ ^ 0xffffffff));
                             i_33_++) {
                            int i_52_ = is_28_[i_33_];
                            int i_53_ = is_27_[i_33_];
                            int i_54_ = is_31_[i_33_];
                            int i_55_ = is_29_[i_33_];
                            int i_56_ = is_32_[i_33_];
                            int i_57_ = is_30_[i_33_];
                            is_26_[i_33_]
                                    = ((i_57_ ^ 0xffffffff) <= (i_53_ ^ 0xffffffff)
                                    ? i_57_ : i_53_);
                            is_24_[i_33_]
                                    = ((i_54_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff)
                                    ? i_52_ : i_54_);
                            is_25_[i_33_]
                                    = ((i_55_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff)
                                    ? i_55_ : i_56_);
                        }
                        break while_142_;
                    } while (false);
                    for (i_33_ = 0; i_33_ < Class68_Sub13_Sub19.anInt3746;
                         i_33_++) {
                        int i_58_ = is_31_[i_33_];
                        int i_59_ = is_28_[i_33_];
                        int i_60_ = is_32_[i_33_];
                        int i_61_ = is_29_[i_33_];
                        int i_62_ = is_30_[i_33_];
                        int i_63_ = is_27_[i_33_];
                        is_26_[i_33_]
                                = i_62_ >= i_63_ ? i_62_ - i_63_ : i_63_ + -i_62_;
                        is_24_[i_33_]
                                = i_59_ > i_58_ ? -i_58_ + i_59_ : i_58_ - i_59_;
                        is_25_[i_33_]
                                = ((i_60_ ^ 0xffffffff) > (i_61_ ^ 0xffffffff)
                                ? i_61_ - i_60_ : i_60_ - i_61_);
                    }
                    break while_142_;
                } while (false);
                for (i_33_ = 0;
                     ((i_33_ ^ 0xffffffff)
                             > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                     i_33_++) {
                    int i_64_ = is_30_[i_33_];
                    int i_65_ = is_27_[i_33_];
                    int i_66_ = is_28_[i_33_];
                    int i_67_ = is_31_[i_33_];
                    int i_68_ = is_29_[i_33_];
                    int i_69_ = is_32_[i_33_];
                    is_26_[i_33_]
                            = -(i_64_ * i_65_ >> -729444213) + i_64_ + i_65_;
                    is_24_[i_33_]
                            = i_67_ + i_66_ - (i_66_ * i_67_ >> 231254347);
                    is_25_[i_33_]
                            = -(i_68_ * i_69_ >> -1152234805) + i_69_ + i_68_;
                }
            }
        } while (false);
        if (bool != true)
            method847(true);
        return is;
    }

    public void method700(Stream class68_sub14, int i, int i_70_) {
        int i_71_ = i;
        do {
            if (i_71_ != 0) {
                if (i_71_ != 1)
                    break;
            } else {
                anInt3922 = class68_sub14.readUnsignedByte(i_70_ + -6676);
                break;
            }
            aBoolean2931 = class68_sub14.readUnsignedByte(i_70_ + -6676) == 1;
        } while (false);
        if (i_70_ != -1)
            aClass98_3923 = null;
        anInt3925++;
    }

    static {
        aClass98_3923 = new Class98(64);
    }
}
