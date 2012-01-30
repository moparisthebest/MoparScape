/* Class68_Sub20_Sub10_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

public class Sprite extends Class68_Sub20_Sub10 {
    public int[] pixels;

    public void method1117() {
        int[] is = new int[anInt4309 * anInt4311];
        int i = 0;
        for (int i_0_ = anInt4311 - 1; i_0_ >= 0; i_0_--) {
            for (int i_1_ = 0; i_1_ < anInt4309; i_1_++)
                is[i++] = pixels[i_1_ + i_0_ * anInt4309];
        }
        pixels = is;
        anInt4303 = anInt4313 - anInt4311 - anInt4303;
    }

    public void method1103(int i, int i_2_) {
        i += anInt4315;
        i_2_ += anInt4303;
        int i_3_ = i + i_2_ * Class79.anInt1401;
        int i_4_ = 0;
        int i_5_ = anInt4311;
        int i_6_ = anInt4309;
        int i_7_ = Class79.anInt1401 - i_6_;
        int i_8_ = 0;
        if (i_2_ < Class79.anInt1403) {
            int i_9_ = Class79.anInt1403 - i_2_;
            i_5_ -= i_9_;
            i_2_ = Class79.anInt1403;
            i_4_ += i_9_ * i_6_;
            i_3_ += i_9_ * Class79.anInt1401;
        }
        if (i_2_ + i_5_ > Class79.anInt1404)
            i_5_ -= i_2_ + i_5_ - Class79.anInt1404;
        if (i < Class79.anInt1400) {
            int i_10_ = Class79.anInt1400 - i;
            i_6_ -= i_10_;
            i = Class79.anInt1400;
            i_4_ += i_10_;
            i_3_ += i_10_;
            i_8_ += i_10_;
            i_7_ += i_10_;
        }
        if (i + i_6_ > Class79.anInt1398) {
            int i_11_ = i + i_6_ - Class79.anInt1398;
            i_6_ -= i_11_;
            i_8_ += i_11_;
            i_7_ += i_11_;
        }
        if (i_6_ > 0 && i_5_ > 0)
            method1122(Class79.anIntArray1402, pixels, 0, i_4_, i_3_,
                    i_6_, i_5_, i_7_, i_8_);
    }

    public void method1108(int i, int i_12_) {
        i += anInt4315;
        i_12_ += anInt4303;
        int i_13_ = i + i_12_ * Class79.anInt1401;
        int i_14_ = 0;
        int i_15_ = anInt4311;
        int i_16_ = anInt4309;
        int i_17_ = Class79.anInt1401 - i_16_;
        int i_18_ = 0;
        if (i_12_ < Class79.anInt1403) {
            int i_19_ = Class79.anInt1403 - i_12_;
            i_15_ -= i_19_;
            i_12_ = Class79.anInt1403;
            i_14_ += i_19_ * i_16_;
            i_13_ += i_19_ * Class79.anInt1401;
        }
        if (i_12_ + i_15_ > Class79.anInt1404)
            i_15_ -= i_12_ + i_15_ - Class79.anInt1404;
        if (i < Class79.anInt1400) {
            int i_20_ = Class79.anInt1400 - i;
            i_16_ -= i_20_;
            i = Class79.anInt1400;
            i_14_ += i_20_;
            i_13_ += i_20_;
            i_18_ += i_20_;
            i_17_ += i_20_;
        }
        if (i + i_16_ > Class79.anInt1398) {
            int i_21_ = i + i_16_ - Class79.anInt1398;
            i_16_ -= i_21_;
            i_18_ += i_21_;
            i_17_ += i_21_;
        }
        if (i_16_ > 0 && i_15_ > 0)
            method1128(Class79.anIntArray1402, pixels, i_14_, i_13_,
                    i_16_, i_15_, i_17_, i_18_);
    }

    public void method1118(int i) {
        int[] is = new int[anInt4309 * anInt4311];
        int i_22_ = 0;
        for (int i_23_ = 0; i_23_ < anInt4311; i_23_++) {
            for (int i_24_ = 0; i_24_ < anInt4309; i_24_++) {
                int i_25_ = pixels[i_22_];
                if (i_25_ == 0) {
                    if (i_24_ > 0 && pixels[i_22_ - 1] != 0)
                        i_25_ = i;
                    else if (i_23_ > 0
                            && pixels[i_22_ - anInt4309] != 0)
                        i_25_ = i;
                    else if (i_24_ < anInt4309 - 1
                            && pixels[i_22_ + 1] != 0)
                        i_25_ = i;
                    else if (i_23_ < anInt4311 - 1
                            && pixels[i_22_ + anInt4309] != 0)
                        i_25_ = i;
                }
                is[i_22_++] = i_25_;
            }
        }
        pixels = is;
    }

    public void method1119(int i, int i_26_, int i_27_, int i_28_, int i_29_,
                           int i_30_, int i_31_, int i_32_, int[] is,
                           int[] is_33_) {
        try {
            int i_34_ = -i_27_ / 2;
            int i_35_ = -i_28_ / 2;
            int i_36_ = (int) (Math.sin((double) i_31_ / 326.11) * 65536.0);
            int i_37_ = (int) (Math.cos((double) i_31_ / 326.11) * 65536.0);
            i_36_ = i_36_ * i_32_ >> 8;
            i_37_ = i_37_ * i_32_ >> 8;
            int i_38_ = (i_29_ << 16) + (i_35_ * i_36_ + i_34_ * i_37_);
            int i_39_ = (i_30_ << 16) + (i_35_ * i_37_ - i_34_ * i_36_);
            int i_40_ = i + i_26_ * Class79.anInt1401;
            for (i_26_ = 0; i_26_ < i_28_; i_26_++) {
                int i_41_ = is[i_26_];
                int i_42_ = i_40_ + i_41_;
                int i_43_ = i_38_ + i_37_ * i_41_;
                int i_44_ = i_39_ - i_36_ * i_41_;
                for (i = -is_33_[i_26_]; i < 0; i++) {
                    int i_45_ = (pixels
                            [(i_43_ >> 16) + (i_44_ >> 16) * anInt4309]);
                    if (i_45_ != 0)
                        Class79.anIntArray1402[i_42_++] = i_45_;
                    else
                        i_42_++;
                    i_43_ += i_37_;
                    i_44_ -= i_36_;
                }
                i_38_ += i_36_;
                i_39_ += i_37_;
                i_40_ += Class79.anInt1401;
            }
        } catch (Exception exception) {
            /* empty */
        }
    }

    public void method1107(int i, int i_46_, int i_47_, int i_48_, int i_49_,
                           int i_50_) {
        if (i_50_ != 0) {
            i -= anInt4315 << 4;
            i_46_ -= anInt4303 << 4;
            double d = (double) (i_49_ & 0xffff) * 9.587379924285257E-5;
            int i_51_ = (int) Math.floor(Math.sin(d) * (double) i_50_ + 0.5);
            int i_52_ = (int) Math.floor(Math.cos(d) * (double) i_50_ + 0.5);
            int i_53_ = -i * i_52_ + -i_46_ * i_51_;
            int i_54_ = i * i_51_ + -i_46_ * i_52_;
            int i_55_ = ((anInt4309 << 4) - i) * i_52_ + -i_46_ * i_51_;
            int i_56_ = -((anInt4309 << 4) - i) * i_51_ + -i_46_ * i_52_;
            int i_57_ = -i * i_52_ + ((anInt4311 << 4) - i_46_) * i_51_;
            int i_58_ = i * i_51_ + ((anInt4311 << 4) - i_46_) * i_52_;
            int i_59_ = (((anInt4309 << 4) - i) * i_52_
                    + ((anInt4311 << 4) - i_46_) * i_51_);
            int i_60_ = (-((anInt4309 << 4) - i) * i_51_
                    + ((anInt4311 << 4) - i_46_) * i_52_);
            int i_61_;
            int i_62_;
            if (i_53_ < i_55_) {
                i_61_ = i_53_;
                i_62_ = i_55_;
            } else {
                i_61_ = i_55_;
                i_62_ = i_53_;
            }
            if (i_57_ < i_61_)
                i_61_ = i_57_;
            if (i_59_ < i_61_)
                i_61_ = i_59_;
            if (i_57_ > i_62_)
                i_62_ = i_57_;
            if (i_59_ > i_62_)
                i_62_ = i_59_;
            int i_63_;
            int i_64_;
            if (i_54_ < i_56_) {
                i_63_ = i_54_;
                i_64_ = i_56_;
            } else {
                i_63_ = i_56_;
                i_64_ = i_54_;
            }
            if (i_58_ < i_63_)
                i_63_ = i_58_;
            if (i_60_ < i_63_)
                i_63_ = i_60_;
            if (i_58_ > i_64_)
                i_64_ = i_58_;
            if (i_60_ > i_64_)
                i_64_ = i_60_;
            i_61_ >>= 12;
            i_62_ = i_62_ + 4095 >> 12;
            i_63_ >>= 12;
            i_64_ = i_64_ + 4095 >> 12;
            i_61_ += i_47_;
            i_62_ += i_47_;
            i_63_ += i_48_;
            i_64_ += i_48_;
            i_61_ >>= 4;
            i_62_ = i_62_ + 15 >> 4;
            i_63_ >>= 4;
            i_64_ = i_64_ + 15 >> 4;
            if (i_61_ < Class79.anInt1400)
                i_61_ = Class79.anInt1400;
            if (i_62_ > Class79.anInt1398)
                i_62_ = Class79.anInt1398;
            if (i_63_ < Class79.anInt1403)
                i_63_ = Class79.anInt1403;
            if (i_64_ > Class79.anInt1404)
                i_64_ = Class79.anInt1404;
            i_62_ = i_61_ - i_62_;
            if (i_62_ < 0) {
                i_64_ = i_63_ - i_64_;
                if (i_64_ < 0) {
                    int i_65_ = i_63_ * Class79.anInt1401 + i_61_;
                    double d_66_ = 1.6777216E7 / (double) i_50_;
                    int i_67_ = (int) Math.floor(Math.sin(d) * d_66_ + 0.5);
                    int i_68_ = (int) Math.floor(Math.cos(d) * d_66_ + 0.5);
                    int i_69_ = (i_61_ << 4) + 8 - i_47_;
                    int i_70_ = (i_63_ << 4) + 8 - i_48_;
                    int i_71_ = (i << 8) - (i_70_ * i_67_ >> 4);
                    int i_72_ = (i_46_ << 8) + (i_70_ * i_68_ >> 4);
                    if (i_68_ == 0) {
                        if (i_67_ == 0) {
                            int i_73_ = i_64_;
                            while (i_73_ < 0) {
                                int i_74_ = i_65_;
                                int i_75_ = i_71_;
                                int i_76_ = i_72_;
                                int i_77_ = i_62_;
                                if (i_75_ >= 0 && i_76_ >= 0
                                        && i_75_ - (anInt4309 << 12) < 0
                                        && i_76_ - (anInt4311 << 12) < 0) {
                                    for (/**/; i_77_ < 0; i_77_++) {
                                        int i_78_
                                                = (pixels
                                                [((i_76_ >> 12) * anInt4309
                                                + (i_75_ >> 12))]);
                                        if (i_78_ != 0)
                                            Class79.anIntArray1402[i_74_++]
                                                    = i_78_;
                                        else
                                            i_74_++;
                                    }
                                }
                                i_73_++;
                                i_65_ += Class79.anInt1401;
                            }
                        } else if (i_67_ < 0) {
                            int i_79_ = i_64_;
                            while (i_79_ < 0) {
                                int i_80_ = i_65_;
                                int i_81_ = i_71_;
                                int i_82_ = i_72_ + (i_69_ * i_67_ >> 4);
                                int i_83_ = i_62_;
                                if (i_81_ >= 0
                                        && i_81_ - (anInt4309 << 12) < 0) {
                                    int i_84_;
                                    if ((i_84_ = i_82_ - (anInt4311 << 12))
                                            >= 0) {
                                        i_84_ = (i_67_ - i_84_) / i_67_;
                                        i_83_ += i_84_;
                                        i_82_ += i_67_ * i_84_;
                                        i_80_ += i_84_;
                                    }
                                    if ((i_84_ = (i_82_ - i_67_) / i_67_)
                                            > i_83_)
                                        i_83_ = i_84_;
                                    for (/**/; i_83_ < 0; i_83_++) {
                                        int i_85_
                                                = (pixels
                                                [((i_82_ >> 12) * anInt4309
                                                + (i_81_ >> 12))]);
                                        if (i_85_ != 0)
                                            Class79.anIntArray1402[i_80_++]
                                                    = i_85_;
                                        else
                                            i_80_++;
                                        i_82_ += i_67_;
                                    }
                                }
                                i_79_++;
                                i_71_ -= i_67_;
                                i_65_ += Class79.anInt1401;
                            }
                        } else {
                            int i_86_ = i_64_;
                            while (i_86_ < 0) {
                                int i_87_ = i_65_;
                                int i_88_ = i_71_;
                                int i_89_ = i_72_ + (i_69_ * i_67_ >> 4);
                                int i_90_ = i_62_;
                                if (i_88_ >= 0
                                        && i_88_ - (anInt4309 << 12) < 0) {
                                    if (i_89_ < 0) {
                                        int i_91_
                                                = (i_67_ - 1 - i_89_) / i_67_;
                                        i_90_ += i_91_;
                                        i_89_ += i_67_ * i_91_;
                                        i_87_ += i_91_;
                                    }
                                    int i_92_;
                                    if ((i_92_ = (1 + i_89_ - (anInt4311 << 12)
                                            - i_67_) / i_67_)
                                            > i_90_)
                                        i_90_ = i_92_;
                                    for (/**/; i_90_ < 0; i_90_++) {
                                        int i_93_
                                                = (pixels
                                                [((i_89_ >> 12) * anInt4309
                                                + (i_88_ >> 12))]);
                                        if (i_93_ != 0)
                                            Class79.anIntArray1402[i_87_++]
                                                    = i_93_;
                                        else
                                            i_87_++;
                                        i_89_ += i_67_;
                                    }
                                }
                                i_86_++;
                                i_71_ -= i_67_;
                                i_65_ += Class79.anInt1401;
                            }
                        }
                    } else if (i_68_ < 0) {
                        if (i_67_ == 0) {
                            int i_94_ = i_64_;
                            while (i_94_ < 0) {
                                int i_95_ = i_65_;
                                int i_96_ = i_71_ + (i_69_ * i_68_ >> 4);
                                int i_97_ = i_72_;
                                int i_98_ = i_62_;
                                if (i_97_ >= 0
                                        && i_97_ - (anInt4311 << 12) < 0) {
                                    int i_99_;
                                    if ((i_99_ = i_96_ - (anInt4309 << 12))
                                            >= 0) {
                                        i_99_ = (i_68_ - i_99_) / i_68_;
                                        i_98_ += i_99_;
                                        i_96_ += i_68_ * i_99_;
                                        i_95_ += i_99_;
                                    }
                                    if ((i_99_ = (i_96_ - i_68_) / i_68_)
                                            > i_98_)
                                        i_98_ = i_99_;
                                    for (/**/; i_98_ < 0; i_98_++) {
                                        int i_100_
                                                = (pixels
                                                [((i_97_ >> 12) * anInt4309
                                                + (i_96_ >> 12))]);
                                        if (i_100_ != 0)
                                            Class79.anIntArray1402[i_95_++]
                                                    = i_100_;
                                        else
                                            i_95_++;
                                        i_96_ += i_68_;
                                    }
                                }
                                i_94_++;
                                i_72_ += i_68_;
                                i_65_ += Class79.anInt1401;
                            }
                        } else if (i_67_ < 0) {
                            int i_101_ = i_64_;
                            while (i_101_ < 0) {
                                int i_102_ = i_65_;
                                int i_103_ = i_71_ + (i_69_ * i_68_ >> 4);
                                int i_104_ = i_72_ + (i_69_ * i_67_ >> 4);
                                int i_105_ = i_62_;
                                int i_106_;
                                if ((i_106_ = i_103_ - (anInt4309 << 12))
                                        >= 0) {
                                    i_106_ = (i_68_ - i_106_) / i_68_;
                                    i_105_ += i_106_;
                                    i_103_ += i_68_ * i_106_;
                                    i_104_ += i_67_ * i_106_;
                                    i_102_ += i_106_;
                                }
                                if ((i_106_ = (i_103_ - i_68_) / i_68_)
                                        > i_105_)
                                    i_105_ = i_106_;
                                if ((i_106_ = i_104_ - (anInt4311 << 12))
                                        >= 0) {
                                    i_106_ = (i_67_ - i_106_) / i_67_;
                                    i_105_ += i_106_;
                                    i_103_ += i_68_ * i_106_;
                                    i_104_ += i_67_ * i_106_;
                                    i_102_ += i_106_;
                                }
                                if ((i_106_ = (i_104_ - i_67_) / i_67_)
                                        > i_105_)
                                    i_105_ = i_106_;
                                for (/**/; i_105_ < 0; i_105_++) {
                                    int i_107_ = (pixels
                                            [((i_104_ >> 12) * anInt4309
                                            + (i_103_ >> 12))]);
                                    if (i_107_ != 0)
                                        Class79.anIntArray1402[i_102_++]
                                                = i_107_;
                                    else
                                        i_102_++;
                                    i_103_ += i_68_;
                                    i_104_ += i_67_;
                                }
                                i_101_++;
                                i_71_ -= i_67_;
                                i_72_ += i_68_;
                                i_65_ += Class79.anInt1401;
                            }
                        } else {
                            int i_108_ = i_64_;
                            while (i_108_ < 0) {
                                int i_109_ = i_65_;
                                int i_110_ = i_71_ + (i_69_ * i_68_ >> 4);
                                int i_111_ = i_72_ + (i_69_ * i_67_ >> 4);
                                int i_112_ = i_62_;
                                int i_113_;
                                if ((i_113_ = i_110_ - (anInt4309 << 12))
                                        >= 0) {
                                    i_113_ = (i_68_ - i_113_) / i_68_;
                                    i_112_ += i_113_;
                                    i_110_ += i_68_ * i_113_;
                                    i_111_ += i_67_ * i_113_;
                                    i_109_ += i_113_;
                                }
                                if ((i_113_ = (i_110_ - i_68_) / i_68_)
                                        > i_112_)
                                    i_112_ = i_113_;
                                if (i_111_ < 0) {
                                    i_113_ = (i_67_ - 1 - i_111_) / i_67_;
                                    i_112_ += i_113_;
                                    i_110_ += i_68_ * i_113_;
                                    i_111_ += i_67_ * i_113_;
                                    i_109_ += i_113_;
                                }
                                if ((i_113_ = (1 + i_111_ - (anInt4311 << 12)
                                        - i_67_) / i_67_)
                                        > i_112_)
                                    i_112_ = i_113_;
                                for (/**/; i_112_ < 0; i_112_++) {
                                    int i_114_ = (pixels
                                            [((i_111_ >> 12) * anInt4309
                                            + (i_110_ >> 12))]);
                                    if (i_114_ != 0)
                                        Class79.anIntArray1402[i_109_++]
                                                = i_114_;
                                    else
                                        i_109_++;
                                    i_110_ += i_68_;
                                    i_111_ += i_67_;
                                }
                                i_108_++;
                                i_71_ -= i_67_;
                                i_72_ += i_68_;
                                i_65_ += Class79.anInt1401;
                            }
                        }
                    } else if (i_67_ == 0) {
                        int i_115_ = i_64_;
                        while (i_115_ < 0) {
                            int i_116_ = i_65_;
                            int i_117_ = i_71_ + (i_69_ * i_68_ >> 4);
                            int i_118_ = i_72_;
                            int i_119_ = i_62_;
                            if (i_118_ >= 0
                                    && i_118_ - (anInt4311 << 12) < 0) {
                                if (i_117_ < 0) {
                                    int i_120_ = (i_68_ - 1 - i_117_) / i_68_;
                                    i_119_ += i_120_;
                                    i_117_ += i_68_ * i_120_;
                                    i_116_ += i_120_;
                                }
                                int i_121_;
                                if ((i_121_ = (1 + i_117_ - (anInt4309 << 12)
                                        - i_68_) / i_68_)
                                        > i_119_)
                                    i_119_ = i_121_;
                                for (/**/; i_119_ < 0; i_119_++) {
                                    int i_122_ = (pixels
                                            [((i_118_ >> 12) * anInt4309
                                            + (i_117_ >> 12))]);
                                    if (i_122_ != 0)
                                        Class79.anIntArray1402[i_116_++]
                                                = i_122_;
                                    else
                                        i_116_++;
                                    i_117_ += i_68_;
                                }
                            }
                            i_115_++;
                            i_72_ += i_68_;
                            i_65_ += Class79.anInt1401;
                        }
                    } else if (i_67_ < 0) {
                        int i_123_ = i_64_;
                        while (i_123_ < 0) {
                            int i_124_ = i_65_;
                            int i_125_ = i_71_ + (i_69_ * i_68_ >> 4);
                            int i_126_ = i_72_ + (i_69_ * i_67_ >> 4);
                            int i_127_ = i_62_;
                            if (i_125_ < 0) {
                                int i_128_ = (i_68_ - 1 - i_125_) / i_68_;
                                i_127_ += i_128_;
                                i_125_ += i_68_ * i_128_;
                                i_126_ += i_67_ * i_128_;
                                i_124_ += i_128_;
                            }
                            int i_129_;
                            if ((i_129_ = (1 + i_125_ - (anInt4309 << 12)
                                    - i_68_) / i_68_)
                                    > i_127_)
                                i_127_ = i_129_;
                            if ((i_129_ = i_126_ - (anInt4311 << 12)) >= 0) {
                                i_129_ = (i_67_ - i_129_) / i_67_;
                                i_127_ += i_129_;
                                i_125_ += i_68_ * i_129_;
                                i_126_ += i_67_ * i_129_;
                                i_124_ += i_129_;
                            }
                            if ((i_129_ = (i_126_ - i_67_) / i_67_) > i_127_)
                                i_127_ = i_129_;
                            for (/**/; i_127_ < 0; i_127_++) {
                                int i_130_
                                        = (pixels
                                        [(i_126_ >> 12) * anInt4309 + (i_125_
                                        >> 12)]);
                                if (i_130_ != 0)
                                    Class79.anIntArray1402[i_124_++] = i_130_;
                                else
                                    i_124_++;
                                i_125_ += i_68_;
                                i_126_ += i_67_;
                            }
                            i_123_++;
                            i_71_ -= i_67_;
                            i_72_ += i_68_;
                            i_65_ += Class79.anInt1401;
                        }
                    } else {
                        int i_131_ = i_64_;
                        while (i_131_ < 0) {
                            int i_132_ = i_65_;
                            int i_133_ = i_71_ + (i_69_ * i_68_ >> 4);
                            int i_134_ = i_72_ + (i_69_ * i_67_ >> 4);
                            int i_135_ = i_62_;
                            if (i_133_ < 0) {
                                int i_136_ = (i_68_ - 1 - i_133_) / i_68_;
                                i_135_ += i_136_;
                                i_133_ += i_68_ * i_136_;
                                i_134_ += i_67_ * i_136_;
                                i_132_ += i_136_;
                            }
                            int i_137_;
                            if ((i_137_ = (1 + i_133_ - (anInt4309 << 12)
                                    - i_68_) / i_68_)
                                    > i_135_)
                                i_135_ = i_137_;
                            if (i_134_ < 0) {
                                i_137_ = (i_67_ - 1 - i_134_) / i_67_;
                                i_135_ += i_137_;
                                i_133_ += i_68_ * i_137_;
                                i_134_ += i_67_ * i_137_;
                                i_132_ += i_137_;
                            }
                            if ((i_137_ = (1 + i_134_ - (anInt4311 << 12)
                                    - i_67_) / i_67_)
                                    > i_135_)
                                i_135_ = i_137_;
                            for (/**/; i_135_ < 0; i_135_++) {
                                int i_138_
                                        = (pixels
                                        [(i_134_ >> 12) * anInt4309 + (i_133_
                                        >> 12)]);
                                if (i_138_ != 0)
                                    Class79.anIntArray1402[i_132_++] = i_138_;
                                else
                                    i_132_++;
                                i_133_ += i_68_;
                                i_134_ += i_67_;
                            }
                            i_131_++;
                            i_71_ -= i_67_;
                            i_72_ += i_68_;
                            i_65_ += Class79.anInt1401;
                        }
                    }
                }
            }
        }
    }

    public void method1120() {
        int[] is = new int[anInt4309 * anInt4311];
        int i = 0;
        for (int i_139_ = 0; i_139_ < anInt4311; i_139_++) {
            for (int i_140_ = anInt4309 - 1; i_140_ >= 0; i_140_--)
                is[i++] = pixels[i_140_ + i_139_ * anInt4309];
        }
        pixels = is;
        anInt4315 = anInt4305 - anInt4309 - anInt4315;
    }

    public void method1121(int i, int i_141_, int i_142_, int i_143_,
                           int i_144_, int i_145_, double d, int i_146_) {
        try {
            int i_147_ = -i_142_ / 2;
            int i_148_ = -i_143_ / 2;
            int i_149_ = (int) (Math.sin(d) * 65536.0);
            int i_150_ = (int) (Math.cos(d) * 65536.0);
            i_149_ = i_149_ * i_146_ >> 8;
            i_150_ = i_150_ * i_146_ >> 8;
            int i_151_ = (i_144_ << 16) + (i_148_ * i_149_ + i_147_ * i_150_);
            int i_152_ = (i_145_ << 16) + (i_148_ * i_150_ - i_147_ * i_149_);
            int i_153_ = i + i_141_ * Class79.anInt1401;
            for (i_141_ = 0; i_141_ < i_143_; i_141_++) {
                int i_154_ = i_153_;
                int i_155_ = i_151_;
                int i_156_ = i_152_;
                for (i = -i_142_; i < 0; i++) {
                    int i_157_
                            = (pixels
                            [(i_155_ >> 16) + (i_156_ >> 16) * anInt4309]);
                    if (i_157_ != 0)
                        Class79.anIntArray1402[i_154_++] = i_157_;
                    else
                        i_154_++;
                    i_155_ += i_150_;
                    i_156_ -= i_149_;
                }
                i_151_ += i_149_;
                i_152_ += i_150_;
                i_153_ += Class79.anInt1401;
            }
        } catch (Exception exception) {
            /* empty */
        }
    }

    public static void method1122(int[] is, int[] is_158_, int i, int i_159_,
                                  int i_160_, int i_161_, int i_162_,
                                  int i_163_, int i_164_) {
        int i_165_ = -(i_161_ >> 2);
        i_161_ = -(i_161_ & 0x3);
        for (int i_166_ = -i_162_; i_166_ < 0; i_166_++) {
            for (int i_167_ = i_165_; i_167_ < 0; i_167_++) {
                i = is_158_[i_159_++];
                if (i != 0)
                    is[i_160_++] = i;
                else
                    i_160_++;
                i = is_158_[i_159_++];
                if (i != 0)
                    is[i_160_++] = i;
                else
                    i_160_++;
                i = is_158_[i_159_++];
                if (i != 0)
                    is[i_160_++] = i;
                else
                    i_160_++;
                i = is_158_[i_159_++];
                if (i != 0)
                    is[i_160_++] = i;
                else
                    i_160_++;
            }
            for (int i_168_ = i_161_; i_168_ < 0; i_168_++) {
                i = is_158_[i_159_++];
                if (i != 0)
                    is[i_160_++] = i;
                else
                    i_160_++;
            }
            i_160_ += i_163_;
            i_159_ += i_164_;
        }
    }

    public void method1123(int i) {
        for (int i_169_ = anInt4311 - 1; i_169_ > 0; i_169_--) {
            int i_170_ = i_169_ * anInt4309;
            for (int i_171_ = anInt4309 - 1; i_171_ > 0; i_171_--) {
                if (pixels[i_171_ + i_170_] == 0
                        && pixels[i_171_ + i_170_ - 1 - anInt4309] != 0)
                    pixels[i_171_ + i_170_] = i;
            }
        }
    }

    public static void method1124(int[] is, int[] is_172_, int i, int i_173_,
                                  int i_174_, int i_175_, int i_176_,
                                  int i_177_, int i_178_, int i_179_,
                                  int i_180_, int i_181_) {
        int i_182_ = i_173_;
        for (int i_183_ = -i_178_; i_183_ < 0; i_183_++) {
            int i_184_ = (i_174_ >> 16) * i_181_;
            for (int i_185_ = -i_177_; i_185_ < 0; i_185_++) {
                i = is_172_[(i_173_ >> 16) + i_184_];
                if (i != 0)
                    is[i_175_++] = i;
                else
                    i_175_++;
                i_173_ += i_179_;
            }
            i_174_ += i_180_;
            i_173_ = i_182_;
            i_175_ += i_176_;
        }
    }

    public void method1125(int i) {
        if (anInt4309 != anInt4305 || anInt4311 != anInt4313) {
            int i_186_ = i;
            if (i_186_ > anInt4315)
                i_186_ = anInt4315;
            int i_187_ = i;
            if (i_187_ + anInt4315 + anInt4309 > anInt4305)
                i_187_ = anInt4305 - anInt4315 - anInt4309;
            int i_188_ = i;
            if (i_188_ > anInt4303)
                i_188_ = anInt4303;
            int i_189_ = i;
            if (i_189_ + anInt4303 + anInt4311 > anInt4313)
                i_189_ = anInt4313 - anInt4303 - anInt4311;
            int i_190_ = anInt4309 + i_186_ + i_187_;
            int i_191_ = anInt4311 + i_188_ + i_189_;
            int[] is = new int[i_190_ * i_191_];
            for (int i_192_ = 0; i_192_ < anInt4311; i_192_++) {
                for (int i_193_ = 0; i_193_ < anInt4309; i_193_++)
                    is[(i_192_ + i_188_) * i_190_ + (i_193_ + i_186_)]
                            = pixels[i_192_ * anInt4309 + i_193_];
            }
            pixels = is;
            anInt4309 = i_190_;
            anInt4311 = i_191_;
            anInt4315 -= i_186_;
            anInt4303 -= i_188_;
        }
    }

    public void method1126() {
        Class79.method1432(pixels, anInt4309, anInt4311);
    }

    public void method1105(int i, int i_194_, int i_195_, int i_196_,
                           int i_197_) {
        if (i_195_ > 0 && i_196_ > 0) {
            int i_198_ = anInt4309;
            int i_199_ = anInt4311;
            int i_200_ = 0;
            int i_201_ = 0;
            int i_202_ = anInt4305;
            int i_203_ = anInt4313;
            int i_204_ = (i_202_ << 16) / i_195_;
            int i_205_ = (i_203_ << 16) / i_196_;
            if (anInt4315 > 0) {
                int i_206_ = ((anInt4315 << 16) + i_204_ - 1) / i_204_;
                i += i_206_;
                i_200_ += i_206_ * i_204_ - (anInt4315 << 16);
            }
            if (anInt4303 > 0) {
                int i_207_ = ((anInt4303 << 16) + i_205_ - 1) / i_205_;
                i_194_ += i_207_;
                i_201_ += i_207_ * i_205_ - (anInt4303 << 16);
            }
            if (i_198_ < i_202_)
                i_195_ = ((i_198_ << 16) - i_200_ + i_204_ - 1) / i_204_;
            if (i_199_ < i_203_)
                i_196_ = ((i_199_ << 16) - i_201_ + i_205_ - 1) / i_205_;
            int i_208_ = i + i_194_ * Class79.anInt1401;
            int i_209_ = Class79.anInt1401 - i_195_;
            if (i_194_ + i_196_ > Class79.anInt1404)
                i_196_ -= i_194_ + i_196_ - Class79.anInt1404;
            if (i_194_ < Class79.anInt1403) {
                int i_210_ = Class79.anInt1403 - i_194_;
                i_196_ -= i_210_;
                i_208_ += i_210_ * Class79.anInt1401;
                i_201_ += i_205_ * i_210_;
            }
            if (i + i_195_ > Class79.anInt1398) {
                int i_211_ = i + i_195_ - Class79.anInt1398;
                i_195_ -= i_211_;
                i_209_ += i_211_;
            }
            if (i < Class79.anInt1400) {
                int i_212_ = Class79.anInt1400 - i;
                i_195_ -= i_212_;
                i_208_ += i_212_;
                i_200_ += i_204_ * i_212_;
                i_209_ += i_212_;
            }
            method1131(Class79.anIntArray1402, pixels, 0, i_200_,
                    i_201_, i_208_, i_209_, i_195_, i_196_, i_204_, i_205_,
                    i_198_, i_197_);
        }
    }

    public void method1127(int i, int i_213_, int[] is, int[] is_214_) {
        if (Class79.anInt1404 - Class79.anInt1403 != is.length)
            throw new IllegalStateException();
        i += anInt4315;
        i_213_ += anInt4303;
        int i_215_ = 0;
        int i_216_ = anInt4311;
        int i_217_ = anInt4309;
        int i_218_ = Class79.anInt1401 - i_217_;
        int i_219_ = 0;
        int i_220_ = i + i_213_ * Class79.anInt1401;
        if (i_213_ < Class79.anInt1403) {
            int i_221_ = Class79.anInt1403 - i_213_;
            i_216_ -= i_221_;
            i_213_ = Class79.anInt1403;
            i_215_ += i_221_ * i_217_;
            i_220_ += i_221_ * Class79.anInt1401;
        }
        if (i_213_ + i_216_ > Class79.anInt1404)
            i_216_ -= i_213_ + i_216_ - Class79.anInt1404;
        if (i < Class79.anInt1400) {
            int i_222_ = Class79.anInt1400 - i;
            i_217_ -= i_222_;
            i = Class79.anInt1400;
            i_215_ += i_222_;
            i_220_ += i_222_;
            i_219_ += i_222_;
            i_218_ += i_222_;
        }
        if (i + i_217_ > Class79.anInt1398) {
            int i_223_ = i + i_217_ - Class79.anInt1398;
            i_217_ -= i_223_;
            i_219_ += i_223_;
            i_218_ += i_223_;
        }
        if (i_217_ > 0 && i_216_ > 0) {
            int i_224_ = i - Class79.anInt1400;
            int i_225_ = i_213_ - Class79.anInt1403;
            for (int i_226_ = i_225_; i_226_ < i_225_ + i_216_; i_226_++) {
                int i_227_ = is[i_226_];
                int i_228_ = is_214_[i_226_];
                int i_229_ = i_217_;
                if (i_224_ > i_227_) {
                    int i_230_ = i_224_ - i_227_;
                    if (i_230_ >= i_228_) {
                        i_215_ += i_217_ + i_219_;
                        i_220_ += i_217_ + i_218_;
                        continue;
                    }
                    i_228_ -= i_230_;
                } else {
                    int i_231_ = i_227_ - i_224_;
                    if (i_231_ >= i_217_) {
                        i_215_ += i_217_ + i_219_;
                        i_220_ += i_217_ + i_218_;
                        continue;
                    }
                    i_215_ += i_231_;
                    i_229_ -= i_231_;
                    i_220_ += i_231_;
                }
                int i_232_ = 0;
                if (i_229_ < i_228_)
                    i_228_ = i_229_;
                else
                    i_232_ = i_229_ - i_228_;
                for (int i_233_ = -i_228_; i_233_ < 0; i_233_++) {
                    int i_234_ = pixels[i_215_++];
                    if (i_234_ != 0)
                        Class79.anIntArray1402[i_220_++] = i_234_;
                    else
                        i_220_++;
                }
                i_215_ += i_232_ + i_219_;
                i_220_ += i_232_ + i_218_;
            }
        }
    }

    public static void method1128(int[] is, int[] is_235_, int i, int i_236_,
                                  int i_237_, int i_238_, int i_239_,
                                  int i_240_) {
        for (int i_241_ = -i_238_; i_241_ < 0; i_241_++) {
            int i_242_ = i_236_ + i_237_ - 3;
            while (i_236_ < i_242_) {
                is[i_236_++] = is_235_[i++];
                is[i_236_++] = is_235_[i++];
                is[i_236_++] = is_235_[i++];
                is[i_236_++] = is_235_[i++];
            }
            i_242_ += 3;
            while (i_236_ < i_242_)
                is[i_236_++] = is_235_[i++];
            i_236_ += i_239_;
            i += i_240_;
        }
    }

    public void method1129() {
        if (anInt4309 != anInt4305 || anInt4311 != anInt4313) {
            int[] is = new int[anInt4305 * anInt4313];
            for (int i = 0; i < anInt4311; i++) {
                for (int i_243_ = 0; i_243_ < anInt4309; i_243_++)
                    is[(i + anInt4303) * anInt4305 + (i_243_ + anInt4315)]
                            = pixels[i * anInt4309 + i_243_];
            }
            pixels = is;
            anInt4309 = anInt4305;
            anInt4311 = anInt4313;
            anInt4315 = 0;
            anInt4303 = 0;
        }
    }

    public void method1130(int i, int i_244_, int i_245_) {
        for (int i_246_ = 0; i_246_ < pixels.length; i_246_++) {
            int i_247_ = pixels[i_246_];
            if (i_247_ != 0) {
                int i_248_ = i_247_ >> 16 & 0xff;
                i_248_ += i;
                if (i_248_ < 1)
                    i_248_ = 1;
                else if (i_248_ > 255)
                    i_248_ = 255;
                int i_249_ = i_247_ >> 8 & 0xff;
                i_249_ += i_244_;
                if (i_249_ < 1)
                    i_249_ = 1;
                else if (i_249_ > 255)
                    i_249_ = 255;
                int i_250_ = i_247_ & 0xff;
                i_250_ += i_245_;
                if (i_250_ < 1)
                    i_250_ = 1;
                else if (i_250_ > 255)
                    i_250_ = 255;
                pixels[i_246_]
                        = (i_248_ << 16) + (i_249_ << 8) + i_250_;
            }
        }
    }

    public void method1112(int i, int i_251_, int i_252_, int i_253_) {
        if (i_252_ == 256)
            method1103(i, i_251_);
        else {
            i += anInt4315;
            i_251_ += anInt4303;
            int i_254_ = i + i_251_ * Class79.anInt1401;
            int i_255_ = 0;
            int i_256_ = anInt4311;
            int i_257_ = anInt4309;
            int i_258_ = Class79.anInt1401 - i_257_;
            int i_259_ = 0;
            if (i_251_ < Class79.anInt1403) {
                int i_260_ = Class79.anInt1403 - i_251_;
                i_256_ -= i_260_;
                i_251_ = Class79.anInt1403;
                i_255_ += i_260_ * i_257_;
                i_254_ += i_260_ * Class79.anInt1401;
            }
            if (i_251_ + i_256_ > Class79.anInt1404)
                i_256_ -= i_251_ + i_256_ - Class79.anInt1404;
            if (i < Class79.anInt1400) {
                int i_261_ = Class79.anInt1400 - i;
                i_257_ -= i_261_;
                i = Class79.anInt1400;
                i_255_ += i_261_;
                i_254_ += i_261_;
                i_259_ += i_261_;
                i_258_ += i_261_;
            }
            if (i + i_257_ > Class79.anInt1398) {
                int i_262_ = i + i_257_ - Class79.anInt1398;
                i_257_ -= i_262_;
                i_259_ += i_262_;
                i_258_ += i_262_;
            }
            if (i_257_ > 0 && i_256_ > 0)
                method1134(Class79.anIntArray1402, pixels, 0, i_255_,
                        i_254_, i_257_, i_256_, i_258_, i_259_, i_252_,
                        i_253_);
        }
    }

    public static void method1131(int[] is, int[] is_263_, int i, int i_264_,
                                  int i_265_, int i_266_, int i_267_,
                                  int i_268_, int i_269_, int i_270_,
                                  int i_271_, int i_272_, int i_273_) {
        int i_274_ = 256 - i_273_;
        int i_275_ = i_264_;
        for (int i_276_ = -i_269_; i_276_ < 0; i_276_++) {
            int i_277_ = (i_265_ >> 16) * i_272_;
            for (int i_278_ = -i_268_; i_278_ < 0; i_278_++) {
                i = is_263_[(i_264_ >> 16) + i_277_];
                if (i != 0) {
                    int i_279_ = is[i_266_];
                    is[i_266_++] = ((((i & 0xff00ff) * i_273_
                            + (i_279_ & 0xff00ff) * i_274_)
                            & ~0xff00ff)
                            + (((i & 0xff00) * i_273_
                            + (i_279_ & 0xff00) * i_274_)
                            & 0xff0000)) >> 8;
                } else
                    i_266_++;
                i_264_ += i_270_;
            }
            i_265_ += i_271_;
            i_264_ = i_275_;
            i_266_ += i_267_;
        }
    }

    public void method1132(int i, int i_280_, int i_281_, int i_282_,
                           int i_283_, int i_284_, int i_285_, int i_286_,
                           int[] is, int[] is_287_) {
        try {
            int i_288_ = -i_281_ / 2;
            int i_289_ = -i_282_ / 2;
            int i_290_ = (int) (Math.sin((double) i_285_ / 326.11) * 65536.0);
            int i_291_ = (int) (Math.cos((double) i_285_ / 326.11) * 65536.0);
            i_290_ = i_290_ * i_286_ >> 8;
            i_291_ = i_291_ * i_286_ >> 8;
            int i_292_ = (i_283_ << 16) + (i_289_ * i_290_ + i_288_ * i_291_);
            int i_293_ = (i_284_ << 16) + (i_289_ * i_291_ - i_288_ * i_290_);
            int i_294_ = i + i_280_ * Class79.anInt1401;
            for (i_280_ = 0; i_280_ < i_282_; i_280_++) {
                int i_295_ = is[i_280_];
                int i_296_ = i_294_ + i_295_;
                int i_297_ = i_292_ + i_291_ * i_295_;
                int i_298_ = i_293_ - i_290_ * i_295_;
                for (i = -is_287_[i_280_]; i < 0; i++) {
                    Class79.anIntArray1402[i_296_++]
                            = (pixels
                            [(i_297_ >> 16) + (i_298_ >> 16) * anInt4309]);
                    i_297_ += i_291_;
                    i_298_ -= i_290_;
                }
                i_292_ += i_290_;
                i_293_ += i_291_;
                i_294_ += Class79.anInt1401;
            }
        } catch (Exception exception) {
            /* empty */
        }
    }

    public static void method1133(int[] is, int[] is_299_, int i, int i_300_,
                                  int i_301_, int i_302_, int i_303_,
                                  int i_304_, int i_305_, int i_306_) {
        int i_307_ = 256 - i_306_;
        for (int i_308_ = -i_303_; i_308_ < 0; i_308_++) {
            for (int i_309_ = -i_302_; i_309_ < 0; i_309_++) {
                i = is_299_[i_300_++];
                if (i != 0) {
                    int i_310_ = is[i_301_];
                    is[i_301_++] = ((((i & 0xff00ff) * i_306_
                            + (i_310_ & 0xff00ff) * i_307_)
                            & ~0xff00ff)
                            + (((i & 0xff00) * i_306_
                            + (i_310_ & 0xff00) * i_307_)
                            & 0xff0000)) >> 8;
                } else
                    i_301_++;
            }
            i_301_ += i_304_;
            i_300_ += i_305_;
        }
    }

    public static void method1134
            (int[] is, int[] is_311_, int i, int i_312_, int i_313_, int i_314_,
             int i_315_, int i_316_, int i_317_, int i_318_, int i_319_) {
        int i_320_ = 256 - i_318_;
        int i_321_ = (i_319_ & 0xff00ff) * i_320_ & ~0xff00ff;
        int i_322_ = (i_319_ & 0xff00) * i_320_ & 0xff0000;
        i_319_ = (i_321_ | i_322_) >>> 8;
        for (int i_323_ = -i_315_; i_323_ < 0; i_323_++) {
            for (int i_324_ = -i_314_; i_324_ < 0; i_324_++) {
                i = is_311_[i_312_++];
                if (i != 0) {
                    i_321_ = (i & 0xff00ff) * i_318_ & ~0xff00ff;
                    i_322_ = (i & 0xff00) * i_318_ & 0xff0000;
                    is[i_313_++] = ((i_321_ | i_322_) >>> 8) + i_319_;
                } else
                    i_313_++;
            }
            i_313_ += i_316_;
            i_312_ += i_317_;
        }
    }

    public void method1110(int i, int i_325_, int i_326_) {
        i += anInt4315;
        i_325_ += anInt4303;
        int i_327_ = i + i_325_ * Class79.anInt1401;
        int i_328_ = 0;
        int i_329_ = anInt4311;
        int i_330_ = anInt4309;
        int i_331_ = Class79.anInt1401 - i_330_;
        int i_332_ = 0;
        if (i_325_ < Class79.anInt1403) {
            int i_333_ = Class79.anInt1403 - i_325_;
            i_329_ -= i_333_;
            i_325_ = Class79.anInt1403;
            i_328_ += i_333_ * i_330_;
            i_327_ += i_333_ * Class79.anInt1401;
        }
        if (i_325_ + i_329_ > Class79.anInt1404)
            i_329_ -= i_325_ + i_329_ - Class79.anInt1404;
        if (i < Class79.anInt1400) {
            int i_334_ = Class79.anInt1400 - i;
            i_330_ -= i_334_;
            i = Class79.anInt1400;
            i_328_ += i_334_;
            i_327_ += i_334_;
            i_332_ += i_334_;
            i_331_ += i_334_;
        }
        if (i + i_330_ > Class79.anInt1398) {
            int i_335_ = i + i_330_ - Class79.anInt1398;
            i_330_ -= i_335_;
            i_332_ += i_335_;
            i_331_ += i_335_;
        }
        if (i_330_ > 0 && i_329_ > 0)
            method1133(Class79.anIntArray1402, pixels, 0, i_328_,
                    i_327_, i_330_, i_329_, i_331_, i_332_, i_326_);
    }

    public static byte[] toByteArray(int[] values) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            for (int i : values) {
                byte[] b = new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
                bos.write(b, 0, b.length);
            }
            bos.close();
            return bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getMD5(byte[] data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(data);
            String md5 = "";
            for (byte b : digest.digest()) {
                md5 += byteToHex(b, true);
            }
            return md5;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private static final char[] hex = "0123456789ABCDEF".toCharArray();

    private static String byteToHex(byte b, boolean forceLeadingZero) {
        StringBuilder out = new StringBuilder();
        int ub = b & 0xff;
        if (ub / 16 > 0 || forceLeadingZero)
            out.append(hex[ub / 16]);
        out.append(hex[ub % 16]);
        return out.toString();
    }

    /* xxx sprite class, i think
       public Sprite(int i, int i_336_, int i_337_, int i_338_,
                       int i_339_, int i_340_, int[] is) {
       anInt4305 = i;
       anInt4313 = i_336_;
       anInt4315 = i_337_;
       anInt4303 = i_338_;
       anInt4309 = i_339_;
       anInt4311 = i_340_;
       pixels = is;
       }
    */

    public Sprite(int i, int i_336_, int i_337_, int i_338_, int w, int h, int[] is) {
        //       String hash = getMD5(toByteArray(is));
        //System.out.println("hash: "+hash);
        anInt4305 = i;
        anInt4313 = i_336_;
        anInt4315 = i_337_;
        anInt4303 = i_338_;
        anInt4309 = w;
        anInt4311 = h;
        pixels = is;
        //System.out.println("new sprite w:" + w + " h:" + h + " i:" + i + " i_336_:" + i_336_ + " i_337_:" + i_337_ + " i_338_:" + i_338_);
        // background: new sprite w:956 h:503 i:956 i_336_:503 i_337_:0 i_338_:0
        if (w == 956 && h == 503 && client.bgImage != null) {
//            System.out.println("LOADING CUSTOM BG IMAGE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            pixels = client.bgImage;
        }
        // logo (at login screen, after cache is loaded): new sprite w:348 h:114 i:360 i_336_:123 i_337_:6 i_338_:5
        if (w == 348 && h == 114 && i_337_ == 6 && i_338_ == 5) { //LOGO
            //        System.out.println("LOADING NO LOGO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            pixels = new int[w * h];
        }
    }

    public void method1113(int i, int i_341_, int i_342_, int i_343_) {
        if (i_342_ > 0 && i_343_ > 0) {
            int i_344_ = anInt4309;
            int i_345_ = anInt4311;
            int i_346_ = 0;
            int i_347_ = 0;
            int i_348_ = anInt4305;
            int i_349_ = anInt4313;
            int i_350_ = (i_348_ << 16) / i_342_;
            int i_351_ = (i_349_ << 16) / i_343_;
            if (anInt4315 > 0) {
                int i_352_ = ((anInt4315 << 16) + i_350_ - 1) / i_350_;
                i += i_352_;
                i_346_ += i_352_ * i_350_ - (anInt4315 << 16);
            }
            if (anInt4303 > 0) {
                int i_353_ = ((anInt4303 << 16) + i_351_ - 1) / i_351_;
                i_341_ += i_353_;
                i_347_ += i_353_ * i_351_ - (anInt4303 << 16);
            }
            if (i_344_ < i_348_)
                i_342_ = ((i_344_ << 16) - i_346_ + i_350_ - 1) / i_350_;
            if (i_345_ < i_349_)
                i_343_ = ((i_345_ << 16) - i_347_ + i_351_ - 1) / i_351_;
            int i_354_ = i + i_341_ * Class79.anInt1401;
            int i_355_ = Class79.anInt1401 - i_342_;
            if (i_341_ + i_343_ > Class79.anInt1404)
                i_343_ -= i_341_ + i_343_ - Class79.anInt1404;
            if (i_341_ < Class79.anInt1403) {
                int i_356_ = Class79.anInt1403 - i_341_;
                i_343_ -= i_356_;
                i_354_ += i_356_ * Class79.anInt1401;
                i_347_ += i_351_ * i_356_;
            }
            if (i + i_342_ > Class79.anInt1398) {
                int i_357_ = i + i_342_ - Class79.anInt1398;
                i_342_ -= i_357_;
                i_355_ += i_357_;
            }
            if (i < Class79.anInt1400) {
                int i_358_ = Class79.anInt1400 - i;
                i_342_ -= i_358_;
                i_354_ += i_358_;
                i_346_ += i_350_ * i_358_;
                i_355_ += i_358_;
            }
            method1124(Class79.anIntArray1402, pixels, 0, i_346_,
                    i_347_, i_354_, i_355_, i_342_, i_343_, i_350_, i_351_,
                    i_344_);
        }
    }

    public Sprite(int w, int h) {
        //System.out.println("new sprite w:" + w + " h:" + h);
        pixels = new int[w * h];
        anInt4309 = anInt4305 = w;
        anInt4311 = anInt4313 = h;
        anInt4315 = anInt4303 = 0;
    }
}
