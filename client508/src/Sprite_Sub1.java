/* Class68_Sub20_Sub10_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Sprite_Sub1 extends Sprite {
    public void method1107(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                           int i_4_) {
        if (i_4_ != 0) {
            i -= anInt4315 << 4;
            i_0_ -= anInt4303 << 4;
            double d = (double) (i_3_ & 0xffff) * 9.587379924285257E-5;
            int i_5_ = (int) Math.floor(Math.sin(d) * (double) i_4_ + 0.5);
            int i_6_ = (int) Math.floor(Math.cos(d) * (double) i_4_ + 0.5);
            int i_7_ = -i * i_6_ + -i_0_ * i_5_;
            int i_8_ = i * i_5_ + -i_0_ * i_6_;
            int i_9_ = ((anInt4309 << 4) - i) * i_6_ + -i_0_ * i_5_;
            int i_10_ = -((anInt4309 << 4) - i) * i_5_ + -i_0_ * i_6_;
            int i_11_ = -i * i_6_ + ((anInt4311 << 4) - i_0_) * i_5_;
            int i_12_ = i * i_5_ + ((anInt4311 << 4) - i_0_) * i_6_;
            int i_13_ = (((anInt4309 << 4) - i) * i_6_
                    + ((anInt4311 << 4) - i_0_) * i_5_);
            int i_14_ = (-((anInt4309 << 4) - i) * i_5_
                    + ((anInt4311 << 4) - i_0_) * i_6_);
            int i_15_;
            int i_16_;
            if (i_7_ < i_9_) {
                i_15_ = i_7_;
                i_16_ = i_9_;
            } else {
                i_15_ = i_9_;
                i_16_ = i_7_;
            }
            if (i_11_ < i_15_)
                i_15_ = i_11_;
            if (i_13_ < i_15_)
                i_15_ = i_13_;
            if (i_11_ > i_16_)
                i_16_ = i_11_;
            if (i_13_ > i_16_)
                i_16_ = i_13_;
            int i_17_;
            int i_18_;
            if (i_8_ < i_10_) {
                i_17_ = i_8_;
                i_18_ = i_10_;
            } else {
                i_17_ = i_10_;
                i_18_ = i_8_;
            }
            if (i_12_ < i_17_)
                i_17_ = i_12_;
            if (i_14_ < i_17_)
                i_17_ = i_14_;
            if (i_12_ > i_18_)
                i_18_ = i_12_;
            if (i_14_ > i_18_)
                i_18_ = i_14_;
            i_15_ >>= 12;
            i_16_ = i_16_ + 4095 >> 12;
            i_17_ >>= 12;
            i_18_ = i_18_ + 4095 >> 12;
            i_15_ += i_1_;
            i_16_ += i_1_;
            i_17_ += i_2_;
            i_18_ += i_2_;
            i_15_ >>= 4;
            i_16_ = i_16_ + 15 >> 4;
            i_17_ >>= 4;
            i_18_ = i_18_ + 15 >> 4;
            if (i_15_ < Class79.anInt1400)
                i_15_ = Class79.anInt1400;
            if (i_16_ > Class79.anInt1398)
                i_16_ = Class79.anInt1398;
            if (i_17_ < Class79.anInt1403)
                i_17_ = Class79.anInt1403;
            if (i_18_ > Class79.anInt1404)
                i_18_ = Class79.anInt1404;
            i_16_ = i_15_ - i_16_;
            if (i_16_ < 0) {
                i_18_ = i_17_ - i_18_;
                if (i_18_ < 0) {
                    int i_19_ = i_17_ * Class79.anInt1401 + i_15_;
                    double d_20_ = 1.6777216E7 / (double) i_4_;
                    int i_21_ = (int) Math.floor(Math.sin(d) * d_20_ + 0.5);
                    int i_22_ = (int) Math.floor(Math.cos(d) * d_20_ + 0.5);
                    int i_23_ = (i_15_ << 4) + 8 - i_1_;
                    int i_24_ = (i_17_ << 4) + 8 - i_2_;
                    int i_25_ = (i << 8) - (i_24_ * i_21_ >> 4);
                    int i_26_ = (i_0_ << 8) + (i_24_ * i_22_ >> 4);
                    if (i_22_ == 0) {
                        if (i_21_ == 0) {
                            int i_27_ = i_18_;
                            while (i_27_ < 0) {
                                int i_28_ = i_19_;
                                int i_29_ = i_25_;
                                int i_30_ = i_26_;
                                int i_31_ = i_16_;
                                if (i_29_ >= 0 && i_30_ >= 0
                                        && i_29_ - (anInt4309 << 12) < 0
                                        && i_30_ - (anInt4311 << 12) < 0) {
                                    for (/**/; i_31_ < 0; i_31_++) {
                                        int i_32_
                                                = (pixels
                                                [((i_30_ >> 12) * anInt4309
                                                + (i_29_ >> 12))]);
                                        int i_33_
                                                = Class79.anIntArray1402[i_28_];
                                        int i_34_ = i_32_ >>> 24;
                                        int i_35_ = 256 - i_34_;
                                        Class79.anIntArray1402[i_28_++]
                                                = ((((i_32_ & 0xff00ff) * i_34_
                                                + (i_33_ & 0xff00ff) * i_35_)
                                                & ~0xff00ff)
                                                + (((i_32_ & 0xff00) * i_34_
                                                + (i_33_ & 0xff00) * i_35_)
                                                & 0xff0000)) >> 8;
                                    }
                                }
                                i_27_++;
                                i_19_ += Class79.anInt1401;
                            }
                        } else if (i_21_ < 0) {
                            int i_36_ = i_18_;
                            while (i_36_ < 0) {
                                int i_37_ = i_19_;
                                int i_38_ = i_25_;
                                int i_39_ = i_26_ + (i_23_ * i_21_ >> 4);
                                int i_40_ = i_16_;
                                if (i_38_ >= 0
                                        && i_38_ - (anInt4309 << 12) < 0) {
                                    int i_41_;
                                    if ((i_41_ = i_39_ - (anInt4311 << 12))
                                            >= 0) {
                                        i_41_ = (i_21_ - i_41_) / i_21_;
                                        i_40_ += i_41_;
                                        i_39_ += i_21_ * i_41_;
                                        i_37_ += i_41_;
                                    }
                                    if ((i_41_ = (i_39_ - i_21_) / i_21_)
                                            > i_40_)
                                        i_40_ = i_41_;
                                    for (/**/; i_40_ < 0; i_40_++) {
                                        int i_42_
                                                = (pixels
                                                [((i_39_ >> 12) * anInt4309
                                                + (i_38_ >> 12))]);
                                        int i_43_
                                                = Class79.anIntArray1402[i_37_];
                                        int i_44_ = i_42_ >>> 24;
                                        int i_45_ = 256 - i_44_;
                                        Class79.anIntArray1402[i_37_++]
                                                = ((((i_42_ & 0xff00ff) * i_44_
                                                + (i_43_ & 0xff00ff) * i_45_)
                                                & ~0xff00ff)
                                                + (((i_42_ & 0xff00) * i_44_
                                                + (i_43_ & 0xff00) * i_45_)
                                                & 0xff0000)) >> 8;
                                        i_39_ += i_21_;
                                    }
                                }
                                i_36_++;
                                i_25_ -= i_21_;
                                i_19_ += Class79.anInt1401;
                            }
                        } else {
                            int i_46_ = i_18_;
                            while (i_46_ < 0) {
                                int i_47_ = i_19_;
                                int i_48_ = i_25_;
                                int i_49_ = i_26_ + (i_23_ * i_21_ >> 4);
                                int i_50_ = i_16_;
                                if (i_48_ >= 0
                                        && i_48_ - (anInt4309 << 12) < 0) {
                                    if (i_49_ < 0) {
                                        int i_51_
                                                = (i_21_ - 1 - i_49_) / i_21_;
                                        i_50_ += i_51_;
                                        i_49_ += i_21_ * i_51_;
                                        i_47_ += i_51_;
                                    }
                                    int i_52_;
                                    if ((i_52_ = (1 + i_49_ - (anInt4311 << 12)
                                            - i_21_) / i_21_)
                                            > i_50_)
                                        i_50_ = i_52_;
                                    for (/**/; i_50_ < 0; i_50_++) {
                                        int i_53_
                                                = (pixels
                                                [((i_49_ >> 12) * anInt4309
                                                + (i_48_ >> 12))]);
                                        int i_54_
                                                = Class79.anIntArray1402[i_47_];
                                        int i_55_ = i_53_ >>> 24;
                                        int i_56_ = 256 - i_55_;
                                        Class79.anIntArray1402[i_47_++]
                                                = ((((i_53_ & 0xff00ff) * i_55_
                                                + (i_54_ & 0xff00ff) * i_56_)
                                                & ~0xff00ff)
                                                + (((i_53_ & 0xff00) * i_55_
                                                + (i_54_ & 0xff00) * i_56_)
                                                & 0xff0000)) >> 8;
                                        i_49_ += i_21_;
                                    }
                                }
                                i_46_++;
                                i_25_ -= i_21_;
                                i_19_ += Class79.anInt1401;
                            }
                        }
                    } else if (i_22_ < 0) {
                        if (i_21_ == 0) {
                            int i_57_ = i_18_;
                            while (i_57_ < 0) {
                                int i_58_ = i_19_;
                                int i_59_ = i_25_ + (i_23_ * i_22_ >> 4);
                                int i_60_ = i_26_;
                                int i_61_ = i_16_;
                                if (i_60_ >= 0
                                        && i_60_ - (anInt4311 << 12) < 0) {
                                    int i_62_;
                                    if ((i_62_ = i_59_ - (anInt4309 << 12))
                                            >= 0) {
                                        i_62_ = (i_22_ - i_62_) / i_22_;
                                        i_61_ += i_62_;
                                        i_59_ += i_22_ * i_62_;
                                        i_58_ += i_62_;
                                    }
                                    if ((i_62_ = (i_59_ - i_22_) / i_22_)
                                            > i_61_)
                                        i_61_ = i_62_;
                                    for (/**/; i_61_ < 0; i_61_++) {
                                        int i_63_
                                                = (pixels
                                                [((i_60_ >> 12) * anInt4309
                                                + (i_59_ >> 12))]);
                                        int i_64_
                                                = Class79.anIntArray1402[i_58_];
                                        int i_65_ = i_63_ >>> 24;
                                        int i_66_ = 256 - i_65_;
                                        Class79.anIntArray1402[i_58_++]
                                                = ((((i_63_ & 0xff00ff) * i_65_
                                                + (i_64_ & 0xff00ff) * i_66_)
                                                & ~0xff00ff)
                                                + (((i_63_ & 0xff00) * i_65_
                                                + (i_64_ & 0xff00) * i_66_)
                                                & 0xff0000)) >> 8;
                                        i_59_ += i_22_;
                                    }
                                }
                                i_57_++;
                                i_26_ += i_22_;
                                i_19_ += Class79.anInt1401;
                            }
                        } else if (i_21_ < 0) {
                            int i_67_ = i_18_;
                            while (i_67_ < 0) {
                                int i_68_ = i_19_;
                                int i_69_ = i_25_ + (i_23_ * i_22_ >> 4);
                                int i_70_ = i_26_ + (i_23_ * i_21_ >> 4);
                                int i_71_ = i_16_;
                                int i_72_;
                                if ((i_72_ = i_69_ - (anInt4309 << 12)) >= 0) {
                                    i_72_ = (i_22_ - i_72_) / i_22_;
                                    i_71_ += i_72_;
                                    i_69_ += i_22_ * i_72_;
                                    i_70_ += i_21_ * i_72_;
                                    i_68_ += i_72_;
                                }
                                if ((i_72_ = (i_69_ - i_22_) / i_22_) > i_71_)
                                    i_71_ = i_72_;
                                if ((i_72_ = i_70_ - (anInt4311 << 12)) >= 0) {
                                    i_72_ = (i_21_ - i_72_) / i_21_;
                                    i_71_ += i_72_;
                                    i_69_ += i_22_ * i_72_;
                                    i_70_ += i_21_ * i_72_;
                                    i_68_ += i_72_;
                                }
                                if ((i_72_ = (i_70_ - i_21_) / i_21_) > i_71_)
                                    i_71_ = i_72_;
                                for (/**/; i_71_ < 0; i_71_++) {
                                    int i_73_ = (pixels
                                            [((i_70_ >> 12) * anInt4309
                                            + (i_69_ >> 12))]);
                                    int i_74_ = Class79.anIntArray1402[i_68_];
                                    int i_75_ = i_73_ >>> 24;
                                    int i_76_ = 256 - i_75_;
                                    Class79.anIntArray1402[i_68_++]
                                            = ((((i_73_ & 0xff00ff) * i_75_
                                            + (i_74_ & 0xff00ff) * i_76_)
                                            & ~0xff00ff)
                                            + (((i_73_ & 0xff00) * i_75_
                                            + (i_74_ & 0xff00) * i_76_)
                                            & 0xff0000)) >> 8;
                                    i_69_ += i_22_;
                                    i_70_ += i_21_;
                                }
                                i_67_++;
                                i_25_ -= i_21_;
                                i_26_ += i_22_;
                                i_19_ += Class79.anInt1401;
                            }
                        } else {
                            int i_77_ = i_18_;
                            while (i_77_ < 0) {
                                int i_78_ = i_19_;
                                int i_79_ = i_25_ + (i_23_ * i_22_ >> 4);
                                int i_80_ = i_26_ + (i_23_ * i_21_ >> 4);
                                int i_81_ = i_16_;
                                int i_82_;
                                if ((i_82_ = i_79_ - (anInt4309 << 12)) >= 0) {
                                    i_82_ = (i_22_ - i_82_) / i_22_;
                                    i_81_ += i_82_;
                                    i_79_ += i_22_ * i_82_;
                                    i_80_ += i_21_ * i_82_;
                                    i_78_ += i_82_;
                                }
                                if ((i_82_ = (i_79_ - i_22_) / i_22_) > i_81_)
                                    i_81_ = i_82_;
                                if (i_80_ < 0) {
                                    i_82_ = (i_21_ - 1 - i_80_) / i_21_;
                                    i_81_ += i_82_;
                                    i_79_ += i_22_ * i_82_;
                                    i_80_ += i_21_ * i_82_;
                                    i_78_ += i_82_;
                                }
                                if ((i_82_ = (1 + i_80_ - (anInt4311 << 12)
                                        - i_21_) / i_21_)
                                        > i_81_)
                                    i_81_ = i_82_;
                                for (/**/; i_81_ < 0; i_81_++) {
                                    int i_83_ = (pixels
                                            [((i_80_ >> 12) * anInt4309
                                            + (i_79_ >> 12))]);
                                    int i_84_ = Class79.anIntArray1402[i_78_];
                                    int i_85_ = i_83_ >>> 24;
                                    int i_86_ = 256 - i_85_;
                                    Class79.anIntArray1402[i_78_++]
                                            = ((((i_83_ & 0xff00ff) * i_85_
                                            + (i_84_ & 0xff00ff) * i_86_)
                                            & ~0xff00ff)
                                            + (((i_83_ & 0xff00) * i_85_
                                            + (i_84_ & 0xff00) * i_86_)
                                            & 0xff0000)) >> 8;
                                    i_79_ += i_22_;
                                    i_80_ += i_21_;
                                }
                                i_77_++;
                                i_25_ -= i_21_;
                                i_26_ += i_22_;
                                i_19_ += Class79.anInt1401;
                            }
                        }
                    } else if (i_21_ == 0) {
                        int i_87_ = i_18_;
                        while (i_87_ < 0) {
                            int i_88_ = i_19_;
                            int i_89_ = i_25_ + (i_23_ * i_22_ >> 4);
                            int i_90_ = i_26_;
                            int i_91_ = i_16_;
                            if (i_90_ >= 0 && i_90_ - (anInt4311 << 12) < 0) {
                                if (i_89_ < 0) {
                                    int i_92_ = (i_22_ - 1 - i_89_) / i_22_;
                                    i_91_ += i_92_;
                                    i_89_ += i_22_ * i_92_;
                                    i_88_ += i_92_;
                                }
                                int i_93_;
                                if ((i_93_ = (1 + i_89_ - (anInt4309 << 12)
                                        - i_22_) / i_22_)
                                        > i_91_)
                                    i_91_ = i_93_;
                                for (/**/; i_91_ < 0; i_91_++) {
                                    int i_94_ = (pixels
                                            [((i_90_ >> 12) * anInt4309
                                            + (i_89_ >> 12))]);
                                    int i_95_ = Class79.anIntArray1402[i_88_];
                                    int i_96_ = i_94_ >>> 24;
                                    int i_97_ = 256 - i_96_;
                                    Class79.anIntArray1402[i_88_++]
                                            = ((((i_94_ & 0xff00ff) * i_96_
                                            + (i_95_ & 0xff00ff) * i_97_)
                                            & ~0xff00ff)
                                            + (((i_94_ & 0xff00) * i_96_
                                            + (i_95_ & 0xff00) * i_97_)
                                            & 0xff0000)) >> 8;
                                    i_89_ += i_22_;
                                }
                            }
                            i_87_++;
                            i_26_ += i_22_;
                            i_19_ += Class79.anInt1401;
                        }
                    } else if (i_21_ < 0) {
                        int i_98_ = i_18_;
                        while (i_98_ < 0) {
                            int i_99_ = i_19_;
                            int i_100_ = i_25_ + (i_23_ * i_22_ >> 4);
                            int i_101_ = i_26_ + (i_23_ * i_21_ >> 4);
                            int i_102_ = i_16_;
                            if (i_100_ < 0) {
                                int i_103_ = (i_22_ - 1 - i_100_) / i_22_;
                                i_102_ += i_103_;
                                i_100_ += i_22_ * i_103_;
                                i_101_ += i_21_ * i_103_;
                                i_99_ += i_103_;
                            }
                            int i_104_;
                            if ((i_104_ = (1 + i_100_ - (anInt4309 << 12)
                                    - i_22_) / i_22_)
                                    > i_102_)
                                i_102_ = i_104_;
                            if ((i_104_ = i_101_ - (anInt4311 << 12)) >= 0) {
                                i_104_ = (i_21_ - i_104_) / i_21_;
                                i_102_ += i_104_;
                                i_100_ += i_22_ * i_104_;
                                i_101_ += i_21_ * i_104_;
                                i_99_ += i_104_;
                            }
                            if ((i_104_ = (i_101_ - i_21_) / i_21_) > i_102_)
                                i_102_ = i_104_;
                            for (/**/; i_102_ < 0; i_102_++) {
                                int i_105_
                                        = (pixels
                                        [(i_101_ >> 12) * anInt4309 + (i_100_
                                        >> 12)]);
                                int i_106_ = Class79.anIntArray1402[i_99_];
                                int i_107_ = i_105_ >>> 24;
                                int i_108_ = 256 - i_107_;
                                Class79.anIntArray1402[i_99_++]
                                        = ((((i_105_ & 0xff00ff) * i_107_
                                        + (i_106_ & 0xff00ff) * i_108_)
                                        & ~0xff00ff)
                                        + (((i_105_ & 0xff00) * i_107_
                                        + (i_106_ & 0xff00) * i_108_)
                                        & 0xff0000)) >> 8;
                                i_100_ += i_22_;
                                i_101_ += i_21_;
                            }
                            i_98_++;
                            i_25_ -= i_21_;
                            i_26_ += i_22_;
                            i_19_ += Class79.anInt1401;
                        }
                    } else {
                        int i_109_ = i_18_;
                        while (i_109_ < 0) {
                            int i_110_ = i_19_;
                            int i_111_ = i_25_ + (i_23_ * i_22_ >> 4);
                            int i_112_ = i_26_ + (i_23_ * i_21_ >> 4);
                            int i_113_ = i_16_;
                            if (i_111_ < 0) {
                                int i_114_ = (i_22_ - 1 - i_111_) / i_22_;
                                i_113_ += i_114_;
                                i_111_ += i_22_ * i_114_;
                                i_112_ += i_21_ * i_114_;
                                i_110_ += i_114_;
                            }
                            int i_115_;
                            if ((i_115_ = (1 + i_111_ - (anInt4309 << 12)
                                    - i_22_) / i_22_)
                                    > i_113_)
                                i_113_ = i_115_;
                            if (i_112_ < 0) {
                                i_115_ = (i_21_ - 1 - i_112_) / i_21_;
                                i_113_ += i_115_;
                                i_111_ += i_22_ * i_115_;
                                i_112_ += i_21_ * i_115_;
                                i_110_ += i_115_;
                            }
                            if ((i_115_ = (1 + i_112_ - (anInt4311 << 12)
                                    - i_21_) / i_21_)
                                    > i_113_)
                                i_113_ = i_115_;
                            for (/**/; i_113_ < 0; i_113_++) {
                                int i_116_
                                        = (pixels
                                        [(i_112_ >> 12) * anInt4309 + (i_111_
                                        >> 12)]);
                                int i_117_ = Class79.anIntArray1402[i_110_];
                                int i_118_ = i_116_ >>> 24;
                                int i_119_ = 256 - i_118_;
                                Class79.anIntArray1402[i_110_++]
                                        = ((((i_116_ & 0xff00ff) * i_118_
                                        + (i_117_ & 0xff00ff) * i_119_)
                                        & ~0xff00ff)
                                        + (((i_116_ & 0xff00) * i_118_
                                        + (i_117_ & 0xff00) * i_119_)
                                        & 0xff0000)) >> 8;
                                i_111_ += i_22_;
                                i_112_ += i_21_;
                            }
                            i_109_++;
                            i_25_ -= i_21_;
                            i_26_ += i_22_;
                            i_19_ += Class79.anInt1401;
                        }
                    }
                }
            }
        }
    }

    public static void method1135(int[] is, int[] is_120_, int i, int i_121_,
                                  int i_122_, int i_123_, int i_124_,
                                  int i_125_, int i_126_) {
        int i_127_ = -i_123_;
        for (int i_128_ = -i_124_; i_128_ < 0; i_128_++) {
            for (int i_129_ = i_127_; i_129_ < 0; i_129_++) {
                int i_130_ = is_120_[i_121_] >>> 24;
                int i_131_ = 256 - i_130_;
                int i_132_ = is_120_[i_121_++];
                int i_133_ = is[i_122_];
                is[i_122_++] = ((((i_132_ & 0xff00ff) * i_130_
                        + (i_133_ & 0xff00ff) * i_131_)
                        & ~0xff00ff)
                        + (((i_132_ & 0xff00) * i_130_
                        + (i_133_ & 0xff00) * i_131_)
                        & 0xff0000)) >> 8;
            }
            i_122_ += i_125_;
            i_121_ += i_126_;
        }
    }

    public static void method1136(int[] is, int[] is_134_, int i, int i_135_,
                                  int i_136_, int i_137_, int i_138_,
                                  int i_139_) {
        for (int i_140_ = -i_137_; i_140_ < 0; i_140_++) {
            int i_141_ = i_135_ + i_136_;
            while (i_135_ < i_141_) {
                int i_142_ = is_134_[i] >>> 24;
                int i_143_ = 256 - i_142_;
                int i_144_ = is_134_[i++];
                int i_145_ = is[i_135_];
                is[i_135_++] = ((((i_144_ & 0xff00ff) * i_142_
                        + (i_145_ & 0xff00ff) * i_143_)
                        & ~0xff00ff)
                        + (((i_144_ & 0xff00) * i_142_
                        + (i_145_ & 0xff00) * i_143_)
                        & 0xff0000)) >> 8;
            }
            i_135_ += i_138_;
            i += i_139_;
        }
    }

    public void method1108(int i, int i_146_) {
        i += anInt4315;
        i_146_ += anInt4303;
        int i_147_ = i + i_146_ * Class79.anInt1401;
        int i_148_ = 0;
        int i_149_ = anInt4311;
        int i_150_ = anInt4309;
        int i_151_ = Class79.anInt1401 - i_150_;
        int i_152_ = 0;
        if (i_146_ < Class79.anInt1403) {
            int i_153_ = Class79.anInt1403 - i_146_;
            i_149_ -= i_153_;
            i_146_ = Class79.anInt1403;
            i_148_ += i_153_ * i_150_;
            i_147_ += i_153_ * Class79.anInt1401;
        }
        if (i_146_ + i_149_ > Class79.anInt1404)
            i_149_ -= i_146_ + i_149_ - Class79.anInt1404;
        if (i < Class79.anInt1400) {
            int i_154_ = Class79.anInt1400 - i;
            i_150_ -= i_154_;
            i = Class79.anInt1400;
            i_148_ += i_154_;
            i_147_ += i_154_;
            i_152_ += i_154_;
            i_151_ += i_154_;
        }
        if (i + i_150_ > Class79.anInt1398) {
            int i_155_ = i + i_150_ - Class79.anInt1398;
            i_150_ -= i_155_;
            i_152_ += i_155_;
            i_151_ += i_155_;
        }
        if (i_150_ > 0 && i_149_ > 0)
            method1136(Class79.anIntArray1402, pixels, i_148_, i_147_,
                    i_150_, i_149_, i_151_, i_152_);
    }

    public void method1132(int i, int i_156_, int i_157_, int i_158_,
                           int i_159_, int i_160_, int i_161_, int i_162_,
                           int[] is, int[] is_163_) {
        try {
            int i_164_ = -i_157_ / 2;
            int i_165_ = -i_158_ / 2;
            int i_166_ = (int) (Math.sin((double) i_161_ / 326.11) * 65536.0);
            int i_167_ = (int) (Math.cos((double) i_161_ / 326.11) * 65536.0);
            i_166_ = i_166_ * i_162_ >> 8;
            i_167_ = i_167_ * i_162_ >> 8;
            int i_168_ = (i_159_ << 16) + (i_165_ * i_166_ + i_164_ * i_167_);
            int i_169_ = (i_160_ << 16) + (i_165_ * i_167_ - i_164_ * i_166_);
            int i_170_ = i + i_156_ * Class79.anInt1401;
            for (i_156_ = 0; i_156_ < i_158_; i_156_++) {
                int i_171_ = is[i_156_];
                int i_172_ = i_170_ + i_171_;
                int i_173_ = i_168_ + i_167_ * i_171_;
                int i_174_ = i_169_ - i_166_ * i_171_;
                for (i = -is_163_[i_156_]; i < 0; i++) {
                    int i_175_
                            = (pixels
                            [(i_173_ >> 16) + (i_174_ >> 16) * anInt4309]);
                    int i_176_ = Class79.anIntArray1402[i_172_];
                    int i_177_ = i_175_ >>> 24;
                    int i_178_ = 256 - i_177_;
                    Class79.anIntArray1402[i_172_++]
                            = ((((i_175_ & 0xff00ff) * i_177_
                            + (i_176_ & 0xff00ff) * i_178_)
                            & ~0xff00ff)
                            + (((i_175_ & 0xff00) * i_177_
                            + (i_176_ & 0xff00) * i_178_)
                            & 0xff0000)) >> 8;
                    i_173_ += i_167_;
                    i_174_ -= i_166_;
                }
                i_168_ += i_166_;
                i_169_ += i_167_;
                i_170_ += Class79.anInt1401;
            }
        } catch (Exception exception) {
            /* empty */
        }
    }

    public static void method1137(int[] is, int[] is_179_, int i, int i_180_,
                                  int i_181_, int i_182_, int i_183_,
                                  int i_184_, int i_185_, int i_186_,
                                  int i_187_, int i_188_, int i_189_) {
        int i_190_ = i_180_;
        for (int i_191_ = -i_185_; i_191_ < 0; i_191_++) {
            int i_192_ = (i_181_ >> 16) * i_188_;
            for (int i_193_ = -i_184_; i_193_ < 0; i_193_++) {
                int i_194_ = is_179_[(i_180_ >> 16) + i_192_];
                int i_195_ = is[i_182_];
                int i_196_ = (i_194_ >>> 24) - (255 - i_189_);
                if (i_196_ < 0)
                    i_196_ = 0;
                int i_197_ = 256 - i_196_;
                is[i_182_++] = ((((i_194_ & 0xff00ff) * i_196_
                        + (i_195_ & 0xff00ff) * i_197_)
                        & ~0xff00ff)
                        + (((i_194_ & 0xff00) * i_196_
                        + (i_195_ & 0xff00) * i_197_)
                        & 0xff0000)) >> 8;
                i_180_ += i_186_;
            }
            i_181_ += i_187_;
            i_180_ = i_190_;
            i_182_ += i_183_;
        }
    }

    public static void method1138(int[] is, int[] is_198_, int i, int i_199_,
                                  int i_200_, int i_201_, int i_202_,
                                  int i_203_, int i_204_, int i_205_) {
        for (int i_206_ = -i_202_; i_206_ < 0; i_206_++) {
            for (int i_207_ = -i_201_; i_207_ < 0; i_207_++) {
                int i_208_ = (is_198_[i_199_] >>> 24) - (255 - i_205_);
                if (i_208_ < 0)
                    i_208_ = 0;
                int i_209_ = 256 - i_208_;
                int i_210_ = is_198_[i_199_++];
                int i_211_ = is[i_200_];
                is[i_200_++] = ((((i_210_ & 0xff00ff) * i_208_
                        + (i_211_ & 0xff00ff) * i_209_)
                        & ~0xff00ff)
                        + (((i_210_ & 0xff00) * i_208_
                        + (i_211_ & 0xff00) * i_209_)
                        & 0xff0000)) >> 8;
            }
            i_200_ += i_203_;
            i_199_ += i_204_;
        }
    }

    public void method1105(int i, int i_212_, int i_213_, int i_214_,
                           int i_215_) {
        if (i_213_ > 0 && i_214_ > 0) {
            int i_216_ = anInt4309;
            int i_217_ = anInt4311;
            int i_218_ = 0;
            int i_219_ = 0;
            int i_220_ = anInt4305;
            int i_221_ = anInt4313;
            int i_222_ = (i_220_ << 16) / i_213_;
            int i_223_ = (i_221_ << 16) / i_214_;
            if (anInt4315 > 0) {
                int i_224_ = ((anInt4315 << 16) + i_222_ - 1) / i_222_;
                i += i_224_;
                i_218_ += i_224_ * i_222_ - (anInt4315 << 16);
            }
            if (anInt4303 > 0) {
                int i_225_ = ((anInt4303 << 16) + i_223_ - 1) / i_223_;
                i_212_ += i_225_;
                i_219_ += i_225_ * i_223_ - (anInt4303 << 16);
            }
            if (i_216_ < i_220_)
                i_213_ = ((i_216_ << 16) - i_218_ + i_222_ - 1) / i_222_;
            if (i_217_ < i_221_)
                i_214_ = ((i_217_ << 16) - i_219_ + i_223_ - 1) / i_223_;
            int i_226_ = i + i_212_ * Class79.anInt1401;
            int i_227_ = Class79.anInt1401 - i_213_;
            if (i_212_ + i_214_ > Class79.anInt1404)
                i_214_ -= i_212_ + i_214_ - Class79.anInt1404;
            if (i_212_ < Class79.anInt1403) {
                int i_228_ = Class79.anInt1403 - i_212_;
                i_214_ -= i_228_;
                i_226_ += i_228_ * Class79.anInt1401;
                i_219_ += i_223_ * i_228_;
            }
            if (i + i_213_ > Class79.anInt1398) {
                int i_229_ = i + i_213_ - Class79.anInt1398;
                i_213_ -= i_229_;
                i_227_ += i_229_;
            }
            if (i < Class79.anInt1400) {
                int i_230_ = Class79.anInt1400 - i;
                i_213_ -= i_230_;
                i_226_ += i_230_;
                i_218_ += i_222_ * i_230_;
                i_227_ += i_230_;
            }
            method1137(Class79.anIntArray1402, pixels, 0, i_218_,
                    i_219_, i_226_, i_227_, i_213_, i_214_, i_222_, i_223_,
                    i_216_, i_215_);
        }
    }

    public void method1119(int i, int i_231_, int i_232_, int i_233_,
                           int i_234_, int i_235_, int i_236_, int i_237_,
                           int[] is, int[] is_238_) {
        try {
            int i_239_ = -i_232_ / 2;
            int i_240_ = -i_233_ / 2;
            int i_241_ = (int) (Math.sin((double) i_236_ / 326.11) * 65536.0);
            int i_242_ = (int) (Math.cos((double) i_236_ / 326.11) * 65536.0);
            i_241_ = i_241_ * i_237_ >> 8;
            i_242_ = i_242_ * i_237_ >> 8;
            int i_243_ = (i_234_ << 16) + (i_240_ * i_241_ + i_239_ * i_242_);
            int i_244_ = (i_235_ << 16) + (i_240_ * i_242_ - i_239_ * i_241_);
            int i_245_ = i + i_231_ * Class79.anInt1401;
            for (i_231_ = 0; i_231_ < i_233_; i_231_++) {
                int i_246_ = is[i_231_];
                int i_247_ = i_245_ + i_246_;
                int i_248_ = i_243_ + i_242_ * i_246_;
                int i_249_ = i_244_ - i_241_ * i_246_;
                for (i = -is_238_[i_231_]; i < 0; i++) {
                    int i_250_
                            = (pixels
                            [(i_248_ >> 16) + (i_249_ >> 16) * anInt4309]);
                    int i_251_ = Class79.anIntArray1402[i_247_];
                    int i_252_ = i_250_ >>> 24;
                    int i_253_ = 256 - i_252_;
                    Class79.anIntArray1402[i_247_++]
                            = ((((i_250_ & 0xff00ff) * i_252_
                            + (i_251_ & 0xff00ff) * i_253_)
                            & ~0xff00ff)
                            + (((i_250_ & 0xff00) * i_252_
                            + (i_251_ & 0xff00) * i_253_)
                            & 0xff0000)) >> 8;
                    i_248_ += i_242_;
                    i_249_ -= i_241_;
                }
                i_243_ += i_241_;
                i_244_ += i_242_;
                i_245_ += Class79.anInt1401;
            }
        } catch (Exception exception) {
            /* empty */
        }
    }

    public void method1103(int i, int i_254_) {
        i += anInt4315;
        i_254_ += anInt4303;
        int i_255_ = i + i_254_ * Class79.anInt1401;
        int i_256_ = 0;
        int i_257_ = anInt4311;
        int i_258_ = anInt4309;
        int i_259_ = Class79.anInt1401 - i_258_;
        int i_260_ = 0;
        if (i_254_ < Class79.anInt1403) {
            int i_261_ = Class79.anInt1403 - i_254_;
            i_257_ -= i_261_;
            i_254_ = Class79.anInt1403;
            i_256_ += i_261_ * i_258_;
            i_255_ += i_261_ * Class79.anInt1401;
        }
        if (i_254_ + i_257_ > Class79.anInt1404)
            i_257_ -= i_254_ + i_257_ - Class79.anInt1404;
        if (i < Class79.anInt1400) {
            int i_262_ = Class79.anInt1400 - i;
            i_258_ -= i_262_;
            i = Class79.anInt1400;
            i_256_ += i_262_;
            i_255_ += i_262_;
            i_260_ += i_262_;
            i_259_ += i_262_;
        }
        if (i + i_258_ > Class79.anInt1398) {
            int i_263_ = i + i_258_ - Class79.anInt1398;
            i_258_ -= i_263_;
            i_260_ += i_263_;
            i_259_ += i_263_;
        }
        if (i_258_ > 0 && i_257_ > 0)
            method1135(Class79.anIntArray1402, pixels, 0, i_256_,
                    i_255_, i_258_, i_257_, i_259_, i_260_);
    }

    public Sprite_Sub1(int i, int i_264_, int i_265_,
                       int i_266_, int i_267_, int i_268_,
                       int[] is) {
        super(i, i_264_, i_265_, i_266_, i_267_, i_268_, is);
    }

    public void method1110(int i, int i_269_, int i_270_) {
        i += anInt4315;
        i_269_ += anInt4303;
        int i_271_ = i + i_269_ * Class79.anInt1401;
        int i_272_ = 0;
        int i_273_ = anInt4311;
        int i_274_ = anInt4309;
        int i_275_ = Class79.anInt1401 - i_274_;
        int i_276_ = 0;
        if (i_269_ < Class79.anInt1403) {
            int i_277_ = Class79.anInt1403 - i_269_;
            i_273_ -= i_277_;
            i_269_ = Class79.anInt1403;
            i_272_ += i_277_ * i_274_;
            i_271_ += i_277_ * Class79.anInt1401;
        }
        if (i_269_ + i_273_ > Class79.anInt1404)
            i_273_ -= i_269_ + i_273_ - Class79.anInt1404;
        if (i < Class79.anInt1400) {
            int i_278_ = Class79.anInt1400 - i;
            i_274_ -= i_278_;
            i = Class79.anInt1400;
            i_272_ += i_278_;
            i_271_ += i_278_;
            i_276_ += i_278_;
            i_275_ += i_278_;
        }
        if (i + i_274_ > Class79.anInt1398) {
            int i_279_ = i + i_274_ - Class79.anInt1398;
            i_274_ -= i_279_;
            i_276_ += i_279_;
            i_275_ += i_279_;
        }
        if (i_274_ > 0 && i_273_ > 0)
            method1138(Class79.anIntArray1402, pixels, 0, i_272_,
                    i_271_, i_274_, i_273_, i_275_, i_276_, i_270_);
    }

    public void method1121(int i, int i_280_, int i_281_, int i_282_,
                           int i_283_, int i_284_, double d, int i_285_) {
        try {
            int i_286_ = -i_281_ / 2;
            int i_287_ = -i_282_ / 2;
            int i_288_ = (int) (Math.sin(d) * 65536.0);
            int i_289_ = (int) (Math.cos(d) * 65536.0);
            i_288_ = i_288_ * i_285_ >> 8;
            i_289_ = i_289_ * i_285_ >> 8;
            int i_290_ = (i_283_ << 16) + (i_287_ * i_288_ + i_286_ * i_289_);
            int i_291_ = (i_284_ << 16) + (i_287_ * i_289_ - i_286_ * i_288_);
            int i_292_ = i + i_280_ * Class79.anInt1401;
            for (i_280_ = 0; i_280_ < i_282_; i_280_++) {
                int i_293_ = i_292_;
                int i_294_ = i_290_;
                int i_295_ = i_291_;
                for (i = -i_281_; i < 0; i++) {
                    int i_296_
                            = (pixels
                            [(i_294_ >> 16) + (i_295_ >> 16) * anInt4309]);
                    int i_297_ = Class79.anIntArray1402[i_293_];
                    int i_298_ = i_296_ >>> 24;
                    int i_299_ = 256 - i_298_;
                    Class79.anIntArray1402[i_293_++]
                            = ((((i_296_ & 0xff00ff) * i_298_
                            + (i_297_ & 0xff00ff) * i_299_)
                            & ~0xff00ff)
                            + (((i_296_ & 0xff00) * i_298_
                            + (i_297_ & 0xff00) * i_299_)
                            & 0xff0000)) >> 8;
                    i_294_ += i_289_;
                    i_295_ -= i_288_;
                }
                i_290_ += i_288_;
                i_291_ += i_289_;
                i_292_ += Class79.anInt1401;
            }
        } catch (Exception exception) {
            /* empty */
        }
    }
}
