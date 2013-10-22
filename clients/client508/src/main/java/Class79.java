/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class79 {
    public static int anInt1397;
    public static int anInt1398;
    public static int[] anIntArray1399;
    public static int anInt1400;
    public static int anInt1401;
    public static int[] anIntArray1402;
    public static int anInt1403;
    public static int anInt1404 = 0;
    public static int[] anIntArray1405;

    public static void method1415(int i, int i_0_, int i_1_, int i_2_,
                                  int i_3_) {
        method1428(i, i_0_, i_1_, i_3_);
        method1428(i, i_0_ + i_2_ - 1, i_1_, i_3_);
        method1431(i, i_0_, i_2_, i_3_);
        method1431(i + i_1_ - 1, i_0_, i_2_, i_3_);
    }

    public static void method1416() {
        anInt1400 = 0;
        anInt1403 = 0;
        anInt1398 = anInt1401;
        anInt1404 = anInt1397;
        method1438();
    }

    public static void method1417(int i, int i_4_, int i_5_, int i_6_,
                                  int i_7_) {
        i_5_ -= i;
        i_6_ -= i_4_;
        if (i_6_ == 0) {
            if (i_5_ >= 0)
                method1428(i, i_4_, i_5_ + 1, i_7_);
            else
                method1428(i + i_5_, i_4_, -i_5_ + 1, i_7_);
        } else if (i_5_ == 0) {
            if (i_6_ >= 0)
                method1431(i, i_4_, i_6_ + 1, i_7_);
            else
                method1431(i, i_4_ + i_6_, -i_6_ + 1, i_7_);
        } else {
            if (i_5_ + i_6_ < 0) {
                i += i_5_;
                i_5_ = -i_5_;
                i_4_ += i_6_;
                i_6_ = -i_6_;
            }
            if (i_5_ > i_6_) {
                i_4_ <<= 16;
                i_4_ += 32768;
                i_6_ <<= 16;
                int i_8_
                        = (int) Math.floor((double) i_6_ / (double) i_5_ + 0.5);
                i_5_ += i;
                if (i < anInt1400) {
                    i_4_ += i_8_ * (anInt1400 - i);
                    i = anInt1400;
                }
                if (i_5_ >= anInt1398)
                    i_5_ = anInt1398 - 1;
                for (/**/; i <= i_5_; i++) {
                    int i_9_ = i_4_ >> 16;
                    if (i_9_ >= anInt1403 && i_9_ < anInt1404)
                        anIntArray1402[i + i_9_ * anInt1401] = i_7_;
                    i_4_ += i_8_;
                }
            } else {
                i <<= 16;
                i += 32768;
                i_5_ <<= 16;
                int i_10_
                        = (int) Math.floor((double) i_5_ / (double) i_6_ + 0.5);
                i_6_ += i_4_;
                if (i_4_ < anInt1403) {
                    i += i_10_ * (anInt1403 - i_4_);
                    i_4_ = anInt1403;
                }
                if (i_6_ >= anInt1404)
                    i_6_ = anInt1404 - 1;
                for (/**/; i_4_ <= i_6_; i_4_++) {
                    int i_11_ = i >> 16;
                    if (i_11_ >= anInt1400 && i_11_ < anInt1398)
                        anIntArray1402[i_11_ + i_4_ * anInt1401] = i_7_;
                    i += i_10_;
                }
            }
        }
    }

    public static void method1418() {
        int i = 0;
        int i_12_ = anInt1401 * anInt1397 - 7;
        while (i < i_12_) {
            anIntArray1402[i++] = 0;
            anIntArray1402[i++] = 0;
            anIntArray1402[i++] = 0;
            anIntArray1402[i++] = 0;
            anIntArray1402[i++] = 0;
            anIntArray1402[i++] = 0;
            anIntArray1402[i++] = 0;
            anIntArray1402[i++] = 0;
        }
        i_12_ += 7;
        while (i < i_12_)
            anIntArray1402[i++] = 0;
    }

    public static void method1419(int i, int i_13_, int i_14_, int[] is,
                                  int[] is_15_) {
        int i_16_ = i + i_13_ * anInt1401;
        for (i_13_ = 0; i_13_ < is.length; i_13_++) {
            int i_17_ = i_16_ + is[i_13_];
            for (i = -is_15_[i_13_]; i < 0; i++)
                anIntArray1402[i_17_++] = i_14_;
            i_16_ += anInt1401;
        }
    }

    public static void method1420() {
        anIntArray1402 = null;
        anIntArray1399 = null;
        anIntArray1405 = null;
    }

    public static void method1421(int i, int i_18_, int i_19_, int i_20_,
                                  int i_21_) {
        if (i >= anInt1400 && i < anInt1398) {
            if (i_18_ < anInt1403) {
                i_19_ -= anInt1403 - i_18_;
                i_18_ = anInt1403;
            }
            if (i_18_ + i_19_ > anInt1404)
                i_19_ = anInt1404 - i_18_;
            int i_22_ = 256 - i_21_;
            int i_23_ = (i_20_ >> 16 & 0xff) * i_21_;
            int i_24_ = (i_20_ >> 8 & 0xff) * i_21_;
            int i_25_ = (i_20_ & 0xff) * i_21_;
            int i_26_ = i + i_18_ * anInt1401;
            for (int i_27_ = 0; i_27_ < i_19_; i_27_++) {
                int i_28_ = (anIntArray1402[i_26_] >> 16 & 0xff) * i_22_;
                int i_29_ = (anIntArray1402[i_26_] >> 8 & 0xff) * i_22_;
                int i_30_ = (anIntArray1402[i_26_] & 0xff) * i_22_;
                int i_31_
                        = ((i_23_ + i_28_ >> 8 << 16) + (i_24_ + i_29_ >> 8 << 8)
                        + (i_25_ + i_30_ >> 8));
                anIntArray1402[i_26_] = i_31_;
                i_26_ += anInt1401;
            }
        }
    }

    public static void method1422(int[] is) {
        anInt1400 = is[0];
        anInt1403 = is[1];
        anInt1398 = is[2];
        anInt1404 = is[3];
        method1438();
    }

    public static void method1423(int i, int i_32_, int i_33_) {
        if (i >= anInt1400 && i_32_ >= anInt1403 && i < anInt1398
                && i_32_ < anInt1404)
            anIntArray1402[i + i_32_ * anInt1401] = i_33_;
    }

    public static void method1424(int[] is, int[] is_34_) {
        if (is.length != anInt1404 - anInt1403
                || is_34_.length != anInt1404 - anInt1403)
            throw new IllegalArgumentException();
        anIntArray1399 = is;
        anIntArray1405 = is_34_;
    }

    public static void method1425(int i, int i_35_, int i_36_, int i_37_) {
        if (i_36_ == 0)
            method1423(i, i_35_, i_37_);
        else {
            if (i_36_ < 0)
                i_36_ = -i_36_;
            int i_38_ = i_35_ - i_36_;
            if (i_38_ < anInt1403)
                i_38_ = anInt1403;
            int i_39_ = i_35_ + i_36_ + 1;
            if (i_39_ > anInt1404)
                i_39_ = anInt1404;
            int i_40_ = i_38_;
            int i_41_ = i_36_ * i_36_;
            int i_42_ = 0;
            int i_43_ = i_35_ - i_40_;
            int i_44_ = i_43_ * i_43_;
            int i_45_ = i_44_ - i_43_;
            if (i_35_ > i_39_)
                i_35_ = i_39_;
            while (i_40_ < i_35_) {
                for (/**/; i_45_ <= i_41_ || i_44_ <= i_41_;
                         i_45_ += i_42_++ + i_42_)
                    i_44_ += i_42_ + i_42_;
                int i_46_ = i - i_42_ + 1;
                if (i_46_ < anInt1400)
                    i_46_ = anInt1400;
                int i_47_ = i + i_42_;
                if (i_47_ > anInt1398)
                    i_47_ = anInt1398;
                int i_48_ = i_46_ + i_40_ * anInt1401;
                for (int i_49_ = i_46_; i_49_ < i_47_; i_49_++)
                    anIntArray1402[i_48_++] = i_37_;
                i_40_++;
                i_44_ -= i_43_-- + i_43_;
                i_45_ -= i_43_ + i_43_;
            }
            i_42_ = i_36_;
            i_43_ = i_40_ - i_35_;
            i_45_ = i_43_ * i_43_ + i_41_;
            i_44_ = i_45_ - i_42_;
            i_45_ -= i_43_;
            while (i_40_ < i_39_) {
                for (/**/; i_45_ > i_41_ && i_44_ > i_41_;
                         i_44_ -= i_42_ + i_42_)
                    i_45_ -= i_42_-- + i_42_;
                int i_50_ = i - i_42_;
                if (i_50_ < anInt1400)
                    i_50_ = anInt1400;
                int i_51_ = i + i_42_;
                if (i_51_ > anInt1398 - 1)
                    i_51_ = anInt1398 - 1;
                int i_52_ = i_50_ + i_40_ * anInt1401;
                for (int i_53_ = i_50_; i_53_ <= i_51_; i_53_++)
                    anIntArray1402[i_52_++] = i_37_;
                i_40_++;
                i_45_ += i_43_ + i_43_;
                i_44_ += i_43_++ + i_43_;
            }
        }
    }

    public static void method1426(int i, int i_54_, int i_55_, int i_56_) {
        if (anInt1400 < i)
            anInt1400 = i;
        if (anInt1403 < i_54_)
            anInt1403 = i_54_;
        if (anInt1398 > i_55_)
            anInt1398 = i_55_;
        if (anInt1404 > i_56_)
            anInt1404 = i_56_;
        method1438();
    }

    public static void method1427(int i, int i_57_, int i_58_, int i_59_) {
        if (i < 0)
            i = 0;
        if (i_57_ < 0)
            i_57_ = 0;
        if (i_58_ > anInt1401)
            i_58_ = anInt1401;
        if (i_59_ > anInt1397)
            i_59_ = anInt1397;
        anInt1400 = i;
        anInt1403 = i_57_;
        anInt1398 = i_58_;
        anInt1404 = i_59_;
        method1438();
    }

    public static void method1428(int i, int i_60_, int i_61_, int i_62_) {
        if (i_60_ >= anInt1403 && i_60_ < anInt1404) {
            if (i < anInt1400) {
                i_61_ -= anInt1400 - i;
                i = anInt1400;
            }
            if (i + i_61_ > anInt1398)
                i_61_ = anInt1398 - i;
            int i_63_ = i + i_60_ * anInt1401;
            for (int i_64_ = 0; i_64_ < i_61_; i_64_++)
                anIntArray1402[i_63_ + i_64_] = i_62_;
        }
    }

    public static void method1429(int i, int i_65_, int i_66_, int i_67_,
                                  int i_68_, int i_69_) {
        int i_70_ = i_66_ - i;
        int i_71_ = i_67_ - i_65_;
        int i_72_ = i_70_ >= 0 ? i_70_ : -i_70_;
        int i_73_ = i_71_ >= 0 ? i_71_ : -i_71_;
        int i_74_ = i_72_;
        if (i_74_ < i_73_)
            i_74_ = i_73_;
        if (i_74_ != 0) {
            int i_75_ = (i_70_ << 16) / i_74_;
            int i_76_ = (i_71_ << 16) / i_74_;
            if (i_76_ <= i_75_)
                i_75_ = -i_75_;
            else
                i_76_ = -i_76_;
            int i_77_ = i_69_ * i_76_ >> 17;
            int i_78_ = i_69_ * i_76_ + 1 >> 17;
            int i_79_ = i_69_ * i_75_ >> 17;
            int i_80_ = i_69_ * i_75_ + 1 >> 17;
            i -= Class62.method606();
            i_65_ -= Class62.method604();
            int i_81_ = i + i_77_;
            int i_82_ = i - i_78_;
            int i_83_ = i + i_70_ - i_78_;
            int i_84_ = i + i_70_ + i_77_;
            int i_85_ = i_65_ + i_79_;
            int i_86_ = i_65_ - i_80_;
            int i_87_ = i_65_ + i_71_ - i_80_;
            int i_88_ = i_65_ + i_71_ + i_79_;
            Class62.method601(i_81_, i_82_, i_83_);
            Class62.method610(i_85_, i_86_, i_87_, i_81_, i_82_, i_83_, i_68_);
            Class62.method601(i_81_, i_83_, i_84_);
            Class62.method610(i_85_, i_87_, i_88_, i_81_, i_83_, i_84_, i_68_);
        }
    }

    public static void method1430(int i, int i_89_, int i_90_, int i_91_,
                                  int i_92_) {
        if (i_89_ >= anInt1403 && i_89_ < anInt1404) {
            if (i < anInt1400) {
                i_90_ -= anInt1400 - i;
                i = anInt1400;
            }
            if (i + i_90_ > anInt1398)
                i_90_ = anInt1398 - i;
            int i_93_ = 256 - i_92_;
            int i_94_ = (i_91_ >> 16 & 0xff) * i_92_;
            int i_95_ = (i_91_ >> 8 & 0xff) * i_92_;
            int i_96_ = (i_91_ & 0xff) * i_92_;
            int i_97_ = i + i_89_ * anInt1401;
            for (int i_98_ = 0; i_98_ < i_90_; i_98_++) {
                int i_99_ = (anIntArray1402[i_97_] >> 16 & 0xff) * i_93_;
                int i_100_ = (anIntArray1402[i_97_] >> 8 & 0xff) * i_93_;
                int i_101_ = (anIntArray1402[i_97_] & 0xff) * i_93_;
                int i_102_
                        = ((i_94_ + i_99_ >> 8 << 16) + (i_95_ + i_100_ >> 8 << 8)
                        + (i_96_ + i_101_ >> 8));
                anIntArray1402[i_97_++] = i_102_;
            }
        }
    }

    public static void method1431(int i, int i_103_, int i_104_, int i_105_) {
        if (i >= anInt1400 && i < anInt1398) {
            if (i_103_ < anInt1403) {
                i_104_ -= anInt1403 - i_103_;
                i_103_ = anInt1403;
            }
            if (i_103_ + i_104_ > anInt1404)
                i_104_ = anInt1404 - i_103_;
            int i_106_ = i + i_103_ * anInt1401;
            for (int i_107_ = 0; i_107_ < i_104_; i_107_++)
                anIntArray1402[i_106_ + i_107_ * anInt1401] = i_105_;
        }
    }

    public static void method1432(int[] is, int i, int i_108_) {
        anIntArray1402 = is;
        anInt1401 = i;
        anInt1397 = i_108_;
        method1427(0, 0, i, i_108_);
    }

    public static void method1433(int i, int i_109_, int i_110_, int i_111_,
                                  int i_112_, int i_113_) {
        method1430(i, i_109_, i_110_, i_112_, i_113_);
        method1430(i, i_109_ + i_111_ - 1, i_110_, i_112_, i_113_);
        if (i_111_ >= 3) {
            method1421(i, i_109_ + 1, i_111_ - 2, i_112_, i_113_);
            method1421(i + i_110_ - 1, i_109_ + 1, i_111_ - 2, i_112_, i_113_);
        }
    }

    public static void method1434(int i, int i_114_, int i_115_, int i_116_,
                                  int i_117_) {
        if (i_117_ != 0) {
            if (i_117_ == 256)
                method1425(i, i_114_, i_115_, i_116_);
            else {
                if (i_115_ < 0)
                    i_115_ = -i_115_;
                int i_118_ = 256 - i_117_;
                int i_119_ = (i_116_ >> 16 & 0xff) * i_117_;
                int i_120_ = (i_116_ >> 8 & 0xff) * i_117_;
                int i_121_ = (i_116_ & 0xff) * i_117_;
                int i_122_ = i_114_ - i_115_;
                if (i_122_ < anInt1403)
                    i_122_ = anInt1403;
                int i_123_ = i_114_ + i_115_ + 1;
                if (i_123_ > anInt1404)
                    i_123_ = anInt1404;
                int i_124_ = i_122_;
                int i_125_ = i_115_ * i_115_;
                int i_126_ = 0;
                int i_127_ = i_114_ - i_124_;
                int i_128_ = i_127_ * i_127_;
                int i_129_ = i_128_ - i_127_;
                if (i_114_ > i_123_)
                    i_114_ = i_123_;
                while (i_124_ < i_114_) {
                    for (/**/; i_129_ <= i_125_ || i_128_ <= i_125_;
                             i_129_ += i_126_++ + i_126_)
                        i_128_ += i_126_ + i_126_;
                    int i_130_ = i - i_126_ + 1;
                    if (i_130_ < anInt1400)
                        i_130_ = anInt1400;
                    int i_131_ = i + i_126_;
                    if (i_131_ > anInt1398)
                        i_131_ = anInt1398;
                    int i_132_ = i_130_ + i_124_ * anInt1401;
                    for (int i_133_ = i_130_; i_133_ < i_131_; i_133_++) {
                        int i_134_
                                = (anIntArray1402[i_132_] >> 16 & 0xff) * i_118_;
                        int i_135_
                                = (anIntArray1402[i_132_] >> 8 & 0xff) * i_118_;
                        int i_136_ = (anIntArray1402[i_132_] & 0xff) * i_118_;
                        int i_137_ = ((i_119_ + i_134_ >> 8 << 16)
                                + (i_120_ + i_135_ >> 8 << 8)
                                + (i_121_ + i_136_ >> 8));
                        anIntArray1402[i_132_++] = i_137_;
                    }
                    i_124_++;
                    i_128_ -= i_127_-- + i_127_;
                    i_129_ -= i_127_ + i_127_;
                }
                i_126_ = i_115_;
                i_127_ = -i_127_;
                i_129_ = i_127_ * i_127_ + i_125_;
                i_128_ = i_129_ - i_126_;
                i_129_ -= i_127_;
                while (i_124_ < i_123_) {
                    for (/**/; i_129_ > i_125_ && i_128_ > i_125_;
                             i_128_ -= i_126_ + i_126_)
                        i_129_ -= i_126_-- + i_126_;
                    int i_138_ = i - i_126_;
                    if (i_138_ < anInt1400)
                        i_138_ = anInt1400;
                    int i_139_ = i + i_126_;
                    if (i_139_ > anInt1398 - 1)
                        i_139_ = anInt1398 - 1;
                    int i_140_ = i_138_ + i_124_ * anInt1401;
                    for (int i_141_ = i_138_; i_141_ <= i_139_; i_141_++) {
                        int i_142_
                                = (anIntArray1402[i_140_] >> 16 & 0xff) * i_118_;
                        int i_143_
                                = (anIntArray1402[i_140_] >> 8 & 0xff) * i_118_;
                        int i_144_ = (anIntArray1402[i_140_] & 0xff) * i_118_;
                        int i_145_ = ((i_119_ + i_142_ >> 8 << 16)
                                + (i_120_ + i_143_ >> 8 << 8)
                                + (i_121_ + i_144_ >> 8));
                        anIntArray1402[i_140_++] = i_145_;
                    }
                    i_124_++;
                    i_129_ += i_127_ + i_127_;
                    i_128_ += i_127_++ + i_127_;
                }
            }
        }
    }

    public static void method1435(int i, int i_146_, int i_147_, int i_148_,
                                  int i_149_, int i_150_) {
        if (i < anInt1400) {
            i_147_ -= anInt1400 - i;
            i = anInt1400;
        }
        if (i_146_ < anInt1403) {
            i_148_ -= anInt1403 - i_146_;
            i_146_ = anInt1403;
        }
        if (i + i_147_ > anInt1398)
            i_147_ = anInt1398 - i;
        if (i_146_ + i_148_ > anInt1404)
            i_148_ = anInt1404 - i_146_;
        i_149_ = (((i_149_ & 0xff00ff) * i_150_ >> 8 & 0xff00ff)
                + ((i_149_ & 0xff00) * i_150_ >> 8 & 0xff00));
        int i_151_ = 256 - i_150_;
        int i_152_ = anInt1401 - i_147_;
        int i_153_ = i + i_146_ * anInt1401;
        for (int i_154_ = 0; i_154_ < i_148_; i_154_++) {
            for (int i_155_ = -i_147_; i_155_ < 0; i_155_++) {
                int i_156_ = anIntArray1402[i_153_];
                i_156_ = (((i_156_ & 0xff00ff) * i_151_ >> 8 & 0xff00ff)
                        + ((i_156_ & 0xff00) * i_151_ >> 8 & 0xff00));
                anIntArray1402[i_153_++] = i_149_ + i_156_;
            }
            i_153_ += i_152_;
        }
    }

    public static void method1436(int[] is) {
        is[0] = anInt1400;
        is[1] = anInt1403;
        is[2] = anInt1398;
        is[3] = anInt1404;
    }

    public static void method1437(int i, int i_157_, int i_158_, int i_159_,
                                  int i_160_, int i_161_) {
        int i_162_ = 0;
        int i_163_ = 65536 / i_159_;
        if (i < anInt1400) {
            i_158_ -= anInt1400 - i;
            i = anInt1400;
        }
        if (i_157_ < anInt1403) {
            i_162_ += (anInt1403 - i_157_) * i_163_;
            i_159_ -= anInt1403 - i_157_;
            i_157_ = anInt1403;
        }
        if (i + i_158_ > anInt1398)
            i_158_ = anInt1398 - i;
        if (i_157_ + i_159_ > anInt1404)
            i_159_ = anInt1404 - i_157_;
        int i_164_ = anInt1401 - i_158_;
        int i_165_ = i + i_157_ * anInt1401;
        for (int i_166_ = -i_159_; i_166_ < 0; i_166_++) {
            int i_167_ = 65536 - i_162_ >> 8;
            int i_168_ = i_162_ >> 8;
            int i_169_
                    = (((i_160_ & 0xff00ff) * i_167_ + (i_161_ & 0xff00ff) * i_168_
                    & ~0xff00ff)
                    + ((i_160_ & 0xff00) * i_167_ + (i_161_ & 0xff00) * i_168_
                    & 0xff0000)) >>> 8;
            for (int i_170_ = -i_158_; i_170_ < 0; i_170_++)
                anIntArray1402[i_165_++] = i_169_;
            i_165_ += i_164_;
            i_162_ += i_163_;
        }
    }

    public static void method1438() {
        anIntArray1399 = null;
        anIntArray1405 = null;
    }

    public static void method1439(int i, int i_171_, int i_172_, int i_173_,
                                  int i_174_) {
        if (i < anInt1400) {
            i_172_ -= anInt1400 - i;
            i = anInt1400;
        }
        if (i_171_ < anInt1403) {
            i_173_ -= anInt1403 - i_171_;
            i_171_ = anInt1403;
        }
        if (i + i_172_ > anInt1398)
            i_172_ = anInt1398 - i;
        if (i_171_ + i_173_ > anInt1404)
            i_173_ = anInt1404 - i_171_;
        int i_175_ = anInt1401 - i_172_;
        int i_176_ = i + i_171_ * anInt1401;
        for (int i_177_ = -i_173_; i_177_ < 0; i_177_++) {
            for (int i_178_ = -i_172_; i_178_ < 0; i_178_++)
                anIntArray1402[i_176_++] = i_174_;
            i_176_ += i_175_;
        }
    }

    static {
        anInt1398 = 0;
        anInt1400 = 0;
        anInt1403 = 0;
    }
}
