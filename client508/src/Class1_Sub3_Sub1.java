/* Class1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub3_Sub1 extends Class1_Sub3 {
    public int[] anIntArray3334;
    public byte[] aByteArray3335;
    public int[] anIntArray3336;
    public int anInt3337;
    public int[] anIntArray3338;
    public int[] anIntArray3339;
    public int[][] anIntArrayArray3340;
    public short aShort3341;
    public short aShort3342;
    public int[] anIntArray3343;
    public byte[] aByteArray3344;
    public boolean aBoolean3345 = false;
    public short aShort3346;
    public short aShort3347;
    public short[] aShortArray3348;
    public byte[] aByteArray3349;
    public short aShort3350;
    public int[] anIntArray3351;
    public short aShort3352;
    public short aShort3353;
    public int[] anIntArray3354;
    public int anInt3355;
    public int anInt3356 = 0;
    public int[] anIntArray3357;
    public int[] anIntArray3358;
    public int[][] anIntArrayArray3359;
    public byte aByte3360;
    public int[] anIntArray3361;
    public short aShort3362;
    public static Class1_Sub3_Sub1 aClass1_Sub3_Sub1_3363
            = new Class1_Sub3_Sub1();
    public int[] anIntArray3364;
    public static Class1_Sub3_Sub1 aClass1_Sub3_Sub1_3365;
    public int[] anIntArray3366;
    public static byte[] aByteArray3367 = new byte[1];
    public static int[] anIntArray3368;
    public static int anInt3369;
    public static byte[] aByteArray3370;
    public static int[] anIntArray3371;
    public static int[] anIntArray3372;
    public static int[] anIntArray3373;
    public static int[] anIntArray3374;
    public static boolean[] aBooleanArray3375;
    public static int anInt3376;
    public static int anInt3377;
    public static int[] anIntArray3378;
    public static int[][] anIntArrayArray3379;
    public static int[] anIntArray3380;
    public static boolean[] aBooleanArray3381;
    public static int[] anIntArray3382;
    public static int[] anIntArray3383;
    public static int[] anIntArray3384;
    public static int[] anIntArray3385;
    public static int[] anIntArray3386;
    public static int[][] anIntArrayArray3387;
    public static int[] anIntArray3388;
    public static int[] anIntArray3389;

    public void method77(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                         int i_4_, int i_5_) {
        try {
            if (!aBoolean3345)
                method101();
            int i_6_ = Class62.anInt1164;
            int i_7_ = Class62.anInt1160;
            int i_8_ = Class62.anIntArray1155[i];
            int i_9_ = Class62.anIntArray1167[i];
            int i_10_ = Class62.anIntArray1155[i_0_];
            int i_11_ = Class62.anIntArray1167[i_0_];
            int i_12_ = Class62.anIntArray1155[i_1_];
            int i_13_ = Class62.anIntArray1167[i_1_];
            int i_14_ = Class62.anIntArray1155[i_2_];
            int i_15_ = Class62.anIntArray1167[i_2_];
            int i_16_ = i_4_ * i_14_ + i_5_ * i_15_ >> 16;
            for (int i_17_ = 0; i_17_ < anInt3355; i_17_++) {
                int i_18_ = anIntArray3354[i_17_];
                int i_19_ = anIntArray3334[i_17_];
                int i_20_ = anIntArray3343[i_17_];
                if (i_1_ != 0) {
                    int i_21_ = i_19_ * i_12_ + i_18_ * i_13_ >> 16;
                    i_19_ = i_19_ * i_13_ - i_18_ * i_12_ >> 16;
                    i_18_ = i_21_;
                }
                if (i != 0) {
                    int i_22_ = i_19_ * i_9_ - i_20_ * i_8_ >> 16;
                    i_20_ = i_19_ * i_8_ + i_20_ * i_9_ >> 16;
                    i_19_ = i_22_;
                }
                if (i_0_ != 0) {
                    int i_23_ = i_20_ * i_10_ + i_18_ * i_11_ >> 16;
                    i_20_ = i_20_ * i_11_ - i_18_ * i_10_ >> 16;
                    i_18_ = i_23_;
                }
                i_18_ += i_3_;
                i_19_ += i_4_;
                i_20_ += i_5_;
                int i_24_ = i_19_ * i_15_ - i_20_ * i_14_ >> 16;
                i_20_ = i_19_ * i_14_ + i_20_ * i_15_ >> 16;
                i_19_ = i_24_;
                anIntArray3386[i_17_] = i_20_ - i_16_;
                anIntArray3382[i_17_] = i_6_ + (i_18_ << 9) / i_20_;
                anIntArray3368[i_17_] = i_7_ + (i_19_ << 9) / i_20_;
                if (anInt3337 > 0) {
                    anIntArray3384[i_17_] = i_18_;
                    anIntArray3380[i_17_] = i_19_;
                    anIntArray3373[i_17_] = i_20_;
                }
            }
            method104(false, false, 0L, aShort3353, aShort3353 << 1);
        } catch (RuntimeException runtimeexception) {
            /* empty */
        }
    }

    public int method87() {
        if (!aBoolean3345)
            method101();
        return aShort3346;
    }

    public boolean method93(int i, int i_25_, int i_26_, int i_27_, int i_28_,
                            int i_29_, int i_30_, int i_31_) {
        if (i_25_ < i_26_ && i_25_ < i_27_ && i_25_ < i_28_)
            return false;
        if (i_25_ > i_26_ && i_25_ > i_27_ && i_25_ > i_28_)
            return false;
        if (i < i_29_ && i < i_30_ && i < i_31_)
            return false;
        if (i > i_29_ && i > i_30_ && i > i_31_)
            return false;
        return true;
    }

    public void method94(int i, int i_32_, int i_33_, int i_34_, int i_35_,
                         int i_36_, int i_37_, int i_38_) {
        try {
            if (!aBoolean3345)
                method101();
            int i_39_ = Class62.anInt1164;
            int i_40_ = Class62.anInt1160;
            int i_41_ = Class62.anIntArray1155[i];
            int i_42_ = Class62.anIntArray1167[i];
            int i_43_ = Class62.anIntArray1155[i_32_];
            int i_44_ = Class62.anIntArray1167[i_32_];
            int i_45_ = Class62.anIntArray1155[i_33_];
            int i_46_ = Class62.anIntArray1167[i_33_];
            int i_47_ = Class62.anIntArray1155[i_34_];
            int i_48_ = Class62.anIntArray1167[i_34_];
            int i_49_ = i_36_ * i_47_ + i_37_ * i_48_ >> 16;
            for (int i_50_ = 0; i_50_ < anInt3355; i_50_++) {
                int i_51_ = anIntArray3354[i_50_];
                int i_52_ = anIntArray3334[i_50_];
                int i_53_ = anIntArray3343[i_50_];
                if (i_33_ != 0) {
                    int i_54_ = i_52_ * i_45_ + i_51_ * i_46_ >> 16;
                    i_52_ = i_52_ * i_46_ - i_51_ * i_45_ >> 16;
                    i_51_ = i_54_;
                }
                if (i != 0) {
                    int i_55_ = i_52_ * i_42_ - i_53_ * i_41_ >> 16;
                    i_53_ = i_52_ * i_41_ + i_53_ * i_42_ >> 16;
                    i_52_ = i_55_;
                }
                if (i_32_ != 0) {
                    int i_56_ = i_53_ * i_43_ + i_51_ * i_44_ >> 16;
                    i_53_ = i_53_ * i_44_ - i_51_ * i_43_ >> 16;
                    i_51_ = i_56_;
                }
                i_51_ += i_35_;
                i_52_ += i_36_;
                i_53_ += i_37_;
                int i_57_ = i_52_ * i_48_ - i_53_ * i_47_ >> 16;
                i_53_ = i_52_ * i_47_ + i_53_ * i_48_ >> 16;
                i_52_ = i_57_;
                anIntArray3386[i_50_] = i_53_ - i_49_;
                anIntArray3382[i_50_] = i_39_ + (i_51_ << 9) / i_38_;
                anIntArray3368[i_50_] = i_40_ + (i_52_ << 9) / i_38_;
                if (anInt3337 > 0) {
                    anIntArray3384[i_50_] = i_51_;
                    anIntArray3380[i_50_] = i_52_;
                    anIntArray3373[i_50_] = i_53_;
                }
            }
            method104(false, false, 0L, aShort3353, aShort3353 << 1);
        } catch (RuntimeException runtimeexception) {
            /* empty */
        }
    }

    public int method56() {
        if (!aBoolean3345)
            method101();
        return aShort3342;
    }

    public void method51(int i, int i_58_, int i_59_, int i_60_, int i_61_,
                         int i_62_, int i_63_, int i_64_, long l) {
        if (!aBoolean3345)
            method101();
        int i_65_ = i_64_ * i_61_ - i_62_ * i_60_ >> 16;
        int i_66_ = i_63_ * i_58_ + i_65_ * i_59_ >> 16;
        int i_67_ = i_66_ + (aShort3362 * i_59_ + aShort3352 * i_58_ >> 16);
        if (i_67_ > 50) {
            int i_68_
                    = i_66_ + (-aShort3362 * i_59_ + aShort3342 * i_58_ >> 16);
            if (i_68_ < 3500) {
                int i_69_ = i_64_ * i_60_ + i_62_ * i_61_ >> 16;
                int i_70_ = i_69_ + aShort3362 << 9;
                if (i_70_ / i_67_ > Class80.anInt1427) {
                    int i_71_ = i_69_ - aShort3362 << 9;
                    if (i_71_ / i_67_ < PacketParser.anInt1875) {
                        int i_72_ = i_63_ * i_59_ - i_65_ * i_58_ >> 16;
                        int i_73_
                                = (i_72_ + (aShort3362 * i_58_ + aShort3352 * i_59_
                                >> 16)
                                << 9);
                        if (i_73_ / i_67_ > Animable.anInt63) {
                            int i_74_ = (i_72_ + ((-aShort3362 * i_58_
                                    + aShort3342 * i_59_)
                                    >> 16)
                                    << 9);
                            if (i_74_ / i_67_
                                    < Class68_Sub13_Sub38.anInt4079) {
                                boolean bool = false;
                                boolean bool_75_ = i_68_ <= 50;
                                boolean bool_76_ = bool_75_ || anInt3337 > 0;
                                int i_77_ = Class62.anInt1164;
                                int i_78_ = Class62.anInt1160;
                                int i_79_ = 0;
                                int i_80_ = 0;
                                if (i != 0) {
                                    i_79_ = Class62.anIntArray1155[i];
                                    i_80_ = Class62.anIntArray1167[i];
                                }
                                boolean bool_81_ = false;
                                if (l > 0L && Class68_Sub19.aBoolean3070
                                        && i_68_ > 0) {
                                    int i_82_;
                                    int i_83_;
                                    if (i_69_ > 0) {
                                        i_82_ = i_71_ / i_67_;
                                        i_83_ = i_70_ / i_68_;
                                    } else {
                                        i_82_ = i_71_ / i_68_;
                                        i_83_ = i_70_ / i_67_;
                                    }
                                    int i_84_;
                                    int i_85_;
                                    if (i_72_ > 0) {
                                        i_84_ = i_74_ / i_67_;
                                        i_85_ = i_73_ / i_68_;
                                    } else {
                                        i_84_ = i_74_ / i_68_;
                                        i_85_ = i_73_ / i_67_;
                                    }
                                    if (Class68_Sub9.anInt2886 >= i_82_
                                            && Class68_Sub9.anInt2886 <= i_83_
                                            && Class51.anInt2256 >= i_84_
                                            && Class51.anInt2256 <= i_85_) {
                                        i_82_ = 999999;
                                        i_83_ = -999999;
                                        i_84_ = 999999;
                                        i_85_ = -999999;
                                        int[] is
                                                =
                                                {aShort3350, aShort3347,
                                                        aShort3350, aShort3347,
                                                        aShort3350, aShort3347,
                                                        aShort3350, aShort3347};
                                        int[] is_86_
                                                =
                                                {aShort3341, aShort3341,
                                                        aShort3346, aShort3346,
                                                        aShort3341, aShort3341,
                                                        aShort3346, aShort3346};
                                        int[] is_87_
                                                =
                                                {aShort3342, aShort3342,
                                                        aShort3342, aShort3342,
                                                        aShort3352, aShort3352,
                                                        aShort3352, aShort3352};
                                        for (int i_88_ = 0; i_88_ < 8;
                                             i_88_++) {
                                            int i_89_ = is[i_88_];
                                            int i_90_ = is_87_[i_88_];
                                            int i_91_ = is_86_[i_88_];
                                            if (i != 0) {
                                                int i_92_ = ((i_91_ * i_79_
                                                        + i_89_ * i_80_)
                                                        >> 16);
                                                i_91_
                                                        = (i_91_ * i_80_
                                                        - i_89_ * i_79_) >> 16;
                                                i_89_ = i_92_;
                                            }
                                            i_89_ += i_62_;
                                            i_90_ += i_63_;
                                            i_91_ += i_64_;
                                            int i_93_ = ((i_91_ * i_60_
                                                    + i_89_ * i_61_)
                                                    >> 16);
                                            i_91_ = (i_91_ * i_61_
                                                    - i_89_ * i_60_) >> 16;
                                            i_89_ = i_93_;
                                            i_93_ = (i_90_ * i_59_
                                                    - i_91_ * i_58_) >> 16;
                                            i_91_ = (i_90_ * i_58_
                                                    + i_91_ * i_59_) >> 16;
                                            i_90_ = i_93_;
                                            if (i_91_ > 0) {
                                                int i_94_
                                                        = (i_89_ << 9) / i_91_;
                                                int i_95_
                                                        = (i_90_ << 9) / i_91_;
                                                if (i_94_ < i_82_)
                                                    i_82_ = i_94_;
                                                if (i_94_ > i_83_)
                                                    i_83_ = i_94_;
                                                if (i_95_ < i_84_)
                                                    i_84_ = i_95_;
                                                if (i_95_ > i_85_)
                                                    i_85_ = i_95_;
                                            }
                                        }
                                        if (Class68_Sub9.anInt2886 >= i_82_
                                                && Class68_Sub9.anInt2886 <= i_83_
                                                && Class51.anInt2256 >= i_84_
                                                && Class51.anInt2256 <= i_85_) {
                                            if (aBoolean2443)
                                                Class68_Sub20_Sub15
                                                        .aLongArray4389
                                                        [Class68_Sub13_Sub1
                                                        .anInt3448++]
                                                        = l;
                                            else
                                                bool_81_ = true;
                                        }
                                    }
                                }
                                for (int i_96_ = 0; i_96_ < anInt3355;
                                     i_96_++) {
                                    int i_97_ = anIntArray3354[i_96_];
                                    int i_98_ = anIntArray3334[i_96_];
                                    int i_99_ = anIntArray3343[i_96_];
                                    if (i != 0) {
                                        int i_100_
                                                = (i_99_ * i_79_ + i_97_ * i_80_
                                                >> 16);
                                        i_99_ = (i_99_ * i_80_ - i_97_ * i_79_
                                                >> 16);
                                        i_97_ = i_100_;
                                    }
                                    i_97_ += i_62_;
                                    i_98_ += i_63_;
                                    i_99_ += i_64_;
                                    int i_101_
                                            = i_99_ * i_60_ + i_97_ * i_61_ >> 16;
                                    i_99_
                                            = i_99_ * i_61_ - i_97_ * i_60_ >> 16;
                                    i_97_ = i_101_;
                                    i_101_
                                            = i_98_ * i_59_ - i_99_ * i_58_ >> 16;
                                    i_99_
                                            = i_98_ * i_58_ + i_99_ * i_59_ >> 16;
                                    i_98_ = i_101_;
                                    anIntArray3386[i_96_] = i_99_ - i_66_;
                                    if (i_99_ >= 50) {
                                        anIntArray3382[i_96_]
                                                = i_77_ + (i_97_ << 9) / i_99_;
                                        anIntArray3368[i_96_]
                                                = i_78_ + (i_98_ << 9) / i_99_;
                                    } else {
                                        anIntArray3382[i_96_] = -5000;
                                        bool = true;
                                    }
                                    if (bool_76_) {
                                        anIntArray3384[i_96_] = i_97_;
                                        anIntArray3380[i_96_] = i_98_;
                                        anIntArray3373[i_96_] = i_99_;
                                    }
                                }
                                try {
                                    method104(bool, bool_81_, l, i_66_ - i_68_,
                                            i_67_ - i_68_ + 2);
                                } catch (Exception exception) {
                                    /* empty */
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void method95(int i, int i_102_, int i_103_, int i_104_) {
        if (i == 0) {
            int i_105_ = 0;
            anInt3377 = 0;
            anInt3376 = 0;
            anInt3369 = 0;
            for (int i_106_ = 0; i_106_ < anInt3355; i_106_++) {
                anInt3377 += anIntArray3354[i_106_];
                anInt3376 += anIntArray3334[i_106_];
                anInt3369 += anIntArray3343[i_106_];
                i_105_++;
            }
            if (i_105_ > 0) {
                anInt3377 = anInt3377 / i_105_ + i_102_;
                anInt3376 = anInt3376 / i_105_ + i_103_;
                anInt3369 = anInt3369 / i_105_ + i_104_;
            } else {
                anInt3377 = i_102_;
                anInt3376 = i_103_;
                anInt3369 = i_104_;
            }
        } else if (i == 1) {
            for (int i_107_ = 0; i_107_ < anInt3355; i_107_++) {
                anIntArray3354[i_107_] += i_102_;
                anIntArray3334[i_107_] += i_103_;
                anIntArray3343[i_107_] += i_104_;
            }
        } else if (i == 2) {
            for (int i_108_ = 0; i_108_ < anInt3355; i_108_++) {
                anIntArray3354[i_108_] -= anInt3377;
                anIntArray3334[i_108_] -= anInt3376;
                anIntArray3343[i_108_] -= anInt3369;
                if (i_104_ != 0) {
                    int i_109_ = Class62.anIntArray1155[i_104_];
                    int i_110_ = Class62.anIntArray1167[i_104_];
                    int i_111_ = ((anIntArray3334[i_108_] * i_109_
                            + anIntArray3354[i_108_] * i_110_ + 32767)
                            >> 16);
                    anIntArray3334[i_108_]
                            = (anIntArray3334[i_108_] * i_110_
                            - anIntArray3354[i_108_] * i_109_ + 32767) >> 16;
                    anIntArray3354[i_108_] = i_111_;
                }
                if (i_102_ != 0) {
                    int i_112_ = Class62.anIntArray1155[i_102_];
                    int i_113_ = Class62.anIntArray1167[i_102_];
                    int i_114_ = ((anIntArray3334[i_108_] * i_113_
                            - anIntArray3343[i_108_] * i_112_ + 32767)
                            >> 16);
                    anIntArray3343[i_108_]
                            = (anIntArray3334[i_108_] * i_112_
                            + anIntArray3343[i_108_] * i_113_ + 32767) >> 16;
                    anIntArray3334[i_108_] = i_114_;
                }
                if (i_103_ != 0) {
                    int i_115_ = Class62.anIntArray1155[i_103_];
                    int i_116_ = Class62.anIntArray1167[i_103_];
                    int i_117_ = ((anIntArray3343[i_108_] * i_115_
                            + anIntArray3354[i_108_] * i_116_ + 32767)
                            >> 16);
                    anIntArray3343[i_108_]
                            = (anIntArray3343[i_108_] * i_116_
                            - anIntArray3354[i_108_] * i_115_ + 32767) >> 16;
                    anIntArray3354[i_108_] = i_117_;
                }
                anIntArray3354[i_108_] += anInt3377;
                anIntArray3334[i_108_] += anInt3376;
                anIntArray3343[i_108_] += anInt3369;
            }
        } else if (i == 3) {
            for (int i_118_ = 0; i_118_ < anInt3355; i_118_++) {
                anIntArray3354[i_118_] -= anInt3377;
                anIntArray3334[i_118_] -= anInt3376;
                anIntArray3343[i_118_] -= anInt3369;
                anIntArray3354[i_118_] = anIntArray3354[i_118_] * i_102_ / 128;
                anIntArray3334[i_118_] = anIntArray3334[i_118_] * i_103_ / 128;
                anIntArray3343[i_118_] = anIntArray3343[i_118_] * i_104_ / 128;
                anIntArray3354[i_118_] += anInt3377;
                anIntArray3334[i_118_] += anInt3376;
                anIntArray3343[i_118_] += anInt3369;
            }
        } else if (i == 5) {
            for (int i_119_ = 0; i_119_ < anInt3356; i_119_++) {
                int i_120_ = (aByteArray3349[i_119_] & 0xff) + i_102_ * 8;
                if (i_120_ < 0)
                    i_120_ = 0;
                else if (i_120_ > 255)
                    i_120_ = 255;
                aByteArray3349[i_119_] = (byte) i_120_;
            }
        }
    }

    public void method72(int i, int i_121_, int i_122_) {
        for (int i_123_ = 0; i_123_ < anInt3355; i_123_++) {
            anIntArray3354[i_123_] = anIntArray3354[i_123_] * i / 128;
            anIntArray3334[i_123_] = anIntArray3334[i_123_] * i_121_ / 128;
            anIntArray3343[i_123_] = anIntArray3343[i_123_] * i_122_ / 128;
        }
        aBoolean3345 = false;
    }

    public int method79() {
        if (!aBoolean3345)
            method101();
        return aShort3362;
    }

    public static void method96() {
        aClass1_Sub3_Sub1_3363 = null;
        aByteArray3367 = null;
        aClass1_Sub3_Sub1_3365 = null;
        aByteArray3370 = null;
        aBooleanArray3375 = null;
        aBooleanArray3381 = null;
        anIntArray3382 = null;
        anIntArray3368 = null;
        anIntArray3386 = null;
        anIntArray3384 = null;
        anIntArray3380 = null;
        anIntArray3373 = null;
        anIntArray3389 = null;
        anIntArrayArray3387 = null;
        anIntArray3388 = null;
        anIntArrayArray3379 = null;
        anIntArray3374 = null;
        anIntArray3383 = null;
        anIntArray3371 = null;
        anIntArray3372 = null;
        anIntArray3385 = null;
        anIntArray3378 = null;
    }

    public void method97(int i, int[] is, int i_124_, int i_125_, int i_126_) {
        int i_127_ = is.length;
        if (i == 0) {
            int i_128_ = 0;
            anInt3377 = 0;
            anInt3376 = 0;
            anInt3369 = 0;
            for (int i_129_ = 0; i_129_ < i_127_; i_129_++) {
                int i_130_ = is[i_129_];
                if (i_130_ < anIntArrayArray3359.length) {
                    int[] is_131_ = anIntArrayArray3359[i_130_];
                    for (int i_132_ = 0; i_132_ < is_131_.length; i_132_++) {
                        int i_133_ = is_131_[i_132_];
                        anInt3377 += anIntArray3354[i_133_];
                        anInt3376 += anIntArray3334[i_133_];
                        anInt3369 += anIntArray3343[i_133_];
                        i_128_++;
                    }
                }
            }
            if (i_128_ > 0) {
                anInt3377 = anInt3377 / i_128_ + i_124_;
                anInt3376 = anInt3376 / i_128_ + i_125_;
                anInt3369 = anInt3369 / i_128_ + i_126_;
            } else {
                anInt3377 = i_124_;
                anInt3376 = i_125_;
                anInt3369 = i_126_;
            }
        } else if (i == 1) {
            for (int i_134_ = 0; i_134_ < i_127_; i_134_++) {
                int i_135_ = is[i_134_];
                if (i_135_ < anIntArrayArray3359.length) {
                    int[] is_136_ = anIntArrayArray3359[i_135_];
                    for (int i_137_ = 0; i_137_ < is_136_.length; i_137_++) {
                        int i_138_ = is_136_[i_137_];
                        anIntArray3354[i_138_] += i_124_;
                        anIntArray3334[i_138_] += i_125_;
                        anIntArray3343[i_138_] += i_126_;
                    }
                }
            }
        } else if (i == 2) {
            for (int i_139_ = 0; i_139_ < i_127_; i_139_++) {
                int i_140_ = is[i_139_];
                if (i_140_ < anIntArrayArray3359.length) {
                    int[] is_141_ = anIntArrayArray3359[i_140_];
                    for (int i_142_ = 0; i_142_ < is_141_.length; i_142_++) {
                        int i_143_ = is_141_[i_142_];
                        anIntArray3354[i_143_] -= anInt3377;
                        anIntArray3334[i_143_] -= anInt3376;
                        anIntArray3343[i_143_] -= anInt3369;
                        if (i_126_ != 0) {
                            int i_144_ = Class62.anIntArray1155[i_126_];
                            int i_145_ = Class62.anIntArray1167[i_126_];
                            int i_146_
                                    = ((anIntArray3334[i_143_] * i_144_
                                    + anIntArray3354[i_143_] * i_145_ + 32767)
                                    >> 16);
                            anIntArray3334[i_143_]
                                    = ((anIntArray3334[i_143_] * i_145_
                                    - anIntArray3354[i_143_] * i_144_ + 32767)
                                    >> 16);
                            anIntArray3354[i_143_] = i_146_;
                        }
                        if (i_124_ != 0) {
                            int i_147_ = Class62.anIntArray1155[i_124_];
                            int i_148_ = Class62.anIntArray1167[i_124_];
                            int i_149_
                                    = ((anIntArray3334[i_143_] * i_148_
                                    - anIntArray3343[i_143_] * i_147_ + 32767)
                                    >> 16);
                            anIntArray3343[i_143_]
                                    = ((anIntArray3334[i_143_] * i_147_
                                    + anIntArray3343[i_143_] * i_148_ + 32767)
                                    >> 16);
                            anIntArray3334[i_143_] = i_149_;
                        }
                        if (i_125_ != 0) {
                            int i_150_ = Class62.anIntArray1155[i_125_];
                            int i_151_ = Class62.anIntArray1167[i_125_];
                            int i_152_
                                    = ((anIntArray3343[i_143_] * i_150_
                                    + anIntArray3354[i_143_] * i_151_ + 32767)
                                    >> 16);
                            anIntArray3343[i_143_]
                                    = ((anIntArray3343[i_143_] * i_151_
                                    - anIntArray3354[i_143_] * i_150_ + 32767)
                                    >> 16);
                            anIntArray3354[i_143_] = i_152_;
                        }
                        anIntArray3354[i_143_] += anInt3377;
                        anIntArray3334[i_143_] += anInt3376;
                        anIntArray3343[i_143_] += anInt3369;
                    }
                }
            }
        } else if (i == 3) {
            for (int i_153_ = 0; i_153_ < i_127_; i_153_++) {
                int i_154_ = is[i_153_];
                if (i_154_ < anIntArrayArray3359.length) {
                    int[] is_155_ = anIntArrayArray3359[i_154_];
                    for (int i_156_ = 0; i_156_ < is_155_.length; i_156_++) {
                        int i_157_ = is_155_[i_156_];
                        anIntArray3354[i_157_] -= anInt3377;
                        anIntArray3334[i_157_] -= anInt3376;
                        anIntArray3343[i_157_] -= anInt3369;
                        anIntArray3354[i_157_]
                                = anIntArray3354[i_157_] * i_124_ / 128;
                        anIntArray3334[i_157_]
                                = anIntArray3334[i_157_] * i_125_ / 128;
                        anIntArray3343[i_157_]
                                = anIntArray3343[i_157_] * i_126_ / 128;
                        anIntArray3354[i_157_] += anInt3377;
                        anIntArray3334[i_157_] += anInt3376;
                        anIntArray3343[i_157_] += anInt3369;
                    }
                }
            }
        } else if (i == 5 && anIntArrayArray3340 != null
                && aByteArray3349 != null) {
            for (int i_158_ = 0; i_158_ < i_127_; i_158_++) {
                int i_159_ = is[i_158_];
                if (i_159_ < anIntArrayArray3340.length) {
                    int[] is_160_ = anIntArrayArray3340[i_159_];
                    for (int i_161_ = 0; i_161_ < is_160_.length; i_161_++) {
                        int i_162_ = is_160_[i_161_];
                        int i_163_
                                = (aByteArray3349[i_162_] & 0xff) + i_124_ * 8;
                        if (i_163_ < 0)
                            i_163_ = 0;
                        else if (i_163_ > 255)
                            i_163_ = 255;
                        aByteArray3349[i_162_] = (byte) i_163_;
                    }
                }
            }
        }
    }

    public void method92(int i, int i_164_, int i_165_) {
        for (int i_166_ = 0; i_166_ < anInt3355; i_166_++) {
            anIntArray3354[i_166_] += i;
            anIntArray3334[i_166_] += i_164_;
            anIntArray3343[i_166_] += i_165_;
        }
        aBoolean3345 = false;
    }

    public Class1_Sub3 method98
            (boolean bool, Class1_Sub3_Sub1 class1_sub3_sub1_167_, byte[] is) {
        class1_sub3_sub1_167_.anInt3355 = anInt3355;
        class1_sub3_sub1_167_.anInt3356 = anInt3356;
        class1_sub3_sub1_167_.anInt3337 = anInt3337;
        if (class1_sub3_sub1_167_.anIntArray3354 == null
                || class1_sub3_sub1_167_.anIntArray3354.length < anInt3355) {
            class1_sub3_sub1_167_.anIntArray3354 = new int[anInt3355 + 100];
            class1_sub3_sub1_167_.anIntArray3334 = new int[anInt3355 + 100];
            class1_sub3_sub1_167_.anIntArray3343 = new int[anInt3355 + 100];
        }
        for (int i = 0; i < anInt3355; i++) {
            class1_sub3_sub1_167_.anIntArray3354[i] = anIntArray3354[i];
            class1_sub3_sub1_167_.anIntArray3334[i] = anIntArray3334[i];
            class1_sub3_sub1_167_.anIntArray3343[i] = anIntArray3343[i];
        }
        if (bool)
            class1_sub3_sub1_167_.aByteArray3349 = aByteArray3349;
        else {
            class1_sub3_sub1_167_.aByteArray3349 = is;
            if (aByteArray3349 == null) {
                for (int i = 0; i < anInt3356; i++)
                    class1_sub3_sub1_167_.aByteArray3349[i] = (byte) 0;
            } else {
                for (int i = 0; i < anInt3356; i++)
                    class1_sub3_sub1_167_.aByteArray3349[i]
                            = aByteArray3349[i];
            }
        }
        class1_sub3_sub1_167_.anIntArray3361 = anIntArray3361;
        class1_sub3_sub1_167_.anIntArray3336 = anIntArray3336;
        class1_sub3_sub1_167_.anIntArray3364 = anIntArray3364;
        class1_sub3_sub1_167_.anIntArray3351 = anIntArray3351;
        class1_sub3_sub1_167_.anIntArray3366 = anIntArray3366;
        class1_sub3_sub1_167_.anIntArray3339 = anIntArray3339;
        class1_sub3_sub1_167_.aByteArray3344 = aByteArray3344;
        class1_sub3_sub1_167_.aByteArray3335 = aByteArray3335;
        class1_sub3_sub1_167_.aShortArray3348 = aShortArray3348;
        class1_sub3_sub1_167_.aByte3360 = aByte3360;
        class1_sub3_sub1_167_.anIntArray3357 = anIntArray3357;
        class1_sub3_sub1_167_.anIntArray3338 = anIntArray3338;
        class1_sub3_sub1_167_.anIntArray3358 = anIntArray3358;
        class1_sub3_sub1_167_.anIntArrayArray3359 = anIntArrayArray3359;
        class1_sub3_sub1_167_.anIntArrayArray3340 = anIntArrayArray3340;
        class1_sub3_sub1_167_.aBoolean2443 = aBoolean2443;
        class1_sub3_sub1_167_.aBoolean3345 = false;
        return class1_sub3_sub1_167_;
    }

    public void method99(int i) {
        int i_168_ = Class62.anInt1164;
        int i_169_ = Class62.anInt1160;
        int i_170_ = 0;
        int i_171_ = anIntArray3361[i];
        int i_172_ = anIntArray3336[i];
        int i_173_ = anIntArray3364[i];
        int i_174_ = anIntArray3373[i_171_];
        int i_175_ = anIntArray3373[i_172_];
        int i_176_ = anIntArray3373[i_173_];
        if (aByteArray3349 == null)
            Class62.anInt1153 = 0;
        else
            Class62.anInt1153 = aByteArray3349[i] & 0xff;
        if (i_174_ >= 50) {
            anIntArray3372[i_170_] = anIntArray3382[i_171_];
            anIntArray3385[i_170_] = anIntArray3368[i_171_];
            anIntArray3378[i_170_++] = anIntArray3351[i];
        } else {
            int i_177_ = anIntArray3384[i_171_];
            int i_178_ = anIntArray3380[i_171_];
            int i_179_ = anIntArray3351[i];
            if (i_176_ >= 50) {
                int i_180_
                        = (50 - i_174_) * Class62.anIntArray1154[i_176_ - i_174_];
                anIntArray3372[i_170_]
                        = (i_168_
                        + (i_177_ + ((anIntArray3384[i_173_] - i_177_) * i_180_
                        >> 16)
                        << 9) / 50);
                anIntArray3385[i_170_]
                        = (i_169_
                        + (i_178_ + ((anIntArray3380[i_173_] - i_178_) * i_180_
                        >> 16)
                        << 9) / 50);
                anIntArray3378[i_170_++]
                        = i_179_ + ((anIntArray3339[i] - i_179_) * i_180_ >> 16);
            }
            if (i_175_ >= 50) {
                int i_181_
                        = (50 - i_174_) * Class62.anIntArray1154[i_175_ - i_174_];
                anIntArray3372[i_170_]
                        = (i_168_
                        + (i_177_ + ((anIntArray3384[i_172_] - i_177_) * i_181_
                        >> 16)
                        << 9) / 50);
                anIntArray3385[i_170_]
                        = (i_169_
                        + (i_178_ + ((anIntArray3380[i_172_] - i_178_) * i_181_
                        >> 16)
                        << 9) / 50);
                anIntArray3378[i_170_++]
                        = i_179_ + ((anIntArray3366[i] - i_179_) * i_181_ >> 16);
            }
        }
        if (i_175_ >= 50) {
            anIntArray3372[i_170_] = anIntArray3382[i_172_];
            anIntArray3385[i_170_] = anIntArray3368[i_172_];
            anIntArray3378[i_170_++] = anIntArray3366[i];
        } else {
            int i_182_ = anIntArray3384[i_172_];
            int i_183_ = anIntArray3380[i_172_];
            int i_184_ = anIntArray3366[i];
            if (i_174_ >= 50) {
                int i_185_
                        = (50 - i_175_) * Class62.anIntArray1154[i_174_ - i_175_];
                anIntArray3372[i_170_]
                        = (i_168_
                        + (i_182_ + ((anIntArray3384[i_171_] - i_182_) * i_185_
                        >> 16)
                        << 9) / 50);
                anIntArray3385[i_170_]
                        = (i_169_
                        + (i_183_ + ((anIntArray3380[i_171_] - i_183_) * i_185_
                        >> 16)
                        << 9) / 50);
                anIntArray3378[i_170_++]
                        = i_184_ + ((anIntArray3351[i] - i_184_) * i_185_ >> 16);
            }
            if (i_176_ >= 50) {
                int i_186_
                        = (50 - i_175_) * Class62.anIntArray1154[i_176_ - i_175_];
                anIntArray3372[i_170_]
                        = (i_168_
                        + (i_182_ + ((anIntArray3384[i_173_] - i_182_) * i_186_
                        >> 16)
                        << 9) / 50);
                anIntArray3385[i_170_]
                        = (i_169_
                        + (i_183_ + ((anIntArray3380[i_173_] - i_183_) * i_186_
                        >> 16)
                        << 9) / 50);
                anIntArray3378[i_170_++]
                        = i_184_ + ((anIntArray3339[i] - i_184_) * i_186_ >> 16);
            }
        }
        if (i_176_ >= 50) {
            anIntArray3372[i_170_] = anIntArray3382[i_173_];
            anIntArray3385[i_170_] = anIntArray3368[i_173_];
            anIntArray3378[i_170_++] = anIntArray3339[i];
        } else {
            int i_187_ = anIntArray3384[i_173_];
            int i_188_ = anIntArray3380[i_173_];
            int i_189_ = anIntArray3339[i];
            if (i_175_ >= 50) {
                int i_190_
                        = (50 - i_176_) * Class62.anIntArray1154[i_175_ - i_176_];
                anIntArray3372[i_170_]
                        = (i_168_
                        + (i_187_ + ((anIntArray3384[i_172_] - i_187_) * i_190_
                        >> 16)
                        << 9) / 50);
                anIntArray3385[i_170_]
                        = (i_169_
                        + (i_188_ + ((anIntArray3380[i_172_] - i_188_) * i_190_
                        >> 16)
                        << 9) / 50);
                anIntArray3378[i_170_++]
                        = i_189_ + ((anIntArray3366[i] - i_189_) * i_190_ >> 16);
            }
            if (i_174_ >= 50) {
                int i_191_
                        = (50 - i_176_) * Class62.anIntArray1154[i_174_ - i_176_];
                anIntArray3372[i_170_]
                        = (i_168_
                        + (i_187_ + ((anIntArray3384[i_171_] - i_187_) * i_191_
                        >> 16)
                        << 9) / 50);
                anIntArray3385[i_170_]
                        = (i_169_
                        + (i_188_ + ((anIntArray3380[i_171_] - i_188_) * i_191_
                        >> 16)
                        << 9) / 50);
                anIntArray3378[i_170_++]
                        = i_189_ + ((anIntArray3351[i] - i_189_) * i_191_ >> 16);
            }
        }
        int i_192_ = anIntArray3372[0];
        int i_193_ = anIntArray3372[1];
        int i_194_ = anIntArray3372[2];
        int i_195_ = anIntArray3385[0];
        int i_196_ = anIntArray3385[1];
        int i_197_ = anIntArray3385[2];
        Class62.aBoolean1157 = false;
        if (i_170_ == 3) {
            if (i_192_ < 0 || i_193_ < 0 || i_194_ < 0
                    || i_192_ > Class62.anInt1168 || i_193_ > Class62.anInt1168
                    || i_194_ > Class62.anInt1168)
                Class62.aBoolean1157 = true;
            if (aShortArray3348 == null || aShortArray3348[i] == -1) {
                if (anIntArray3339[i] == -1)
                    Class62.method610(i_195_, i_196_, i_197_, i_192_, i_193_,
                            i_194_,
                            (Class62.anIntArray1158
                                    [anIntArray3351[i]]));
                else
                    Class62.method617(i_195_, i_196_, i_197_, i_192_, i_193_,
                            i_194_, anIntArray3378[0],
                            anIntArray3378[1], anIntArray3378[2]);
            } else {
                int i_198_;
                int i_199_;
                int i_200_;
                if (aByteArray3335 != null && aByteArray3335[i] != -1) {
                    int i_201_ = aByteArray3335[i] & 0xff;
                    i_198_ = anIntArray3357[i_201_];
                    i_199_ = anIntArray3338[i_201_];
                    i_200_ = anIntArray3358[i_201_];
                } else {
                    i_198_ = i_171_;
                    i_199_ = i_172_;
                    i_200_ = i_173_;
                }
                if (anIntArray3339[i] == -1)
                    Class62.method616(i_195_, i_196_, i_197_, i_192_, i_193_,
                            i_194_, anIntArray3351[i],
                            anIntArray3351[i], anIntArray3351[i],
                            anIntArray3384[i_198_],
                            anIntArray3384[i_199_],
                            anIntArray3384[i_200_],
                            anIntArray3380[i_198_],
                            anIntArray3380[i_199_],
                            anIntArray3380[i_200_],
                            anIntArray3373[i_198_],
                            anIntArray3373[i_199_],
                            anIntArray3373[i_200_],
                            aShortArray3348[i]);
                else
                    Class62.method616(i_195_, i_196_, i_197_, i_192_, i_193_,
                            i_194_, anIntArray3378[0],
                            anIntArray3378[1], anIntArray3378[2],
                            anIntArray3384[i_198_],
                            anIntArray3384[i_199_],
                            anIntArray3384[i_200_],
                            anIntArray3380[i_198_],
                            anIntArray3380[i_199_],
                            anIntArray3380[i_200_],
                            anIntArray3373[i_198_],
                            anIntArray3373[i_199_],
                            anIntArray3373[i_200_],
                            aShortArray3348[i]);
            }
        }
        if (i_170_ == 4) {
            if (i_192_ < 0 || i_193_ < 0 || i_194_ < 0
                    || i_192_ > Class62.anInt1168 || i_193_ > Class62.anInt1168
                    || i_194_ > Class62.anInt1168 || anIntArray3372[3] < 0
                    || anIntArray3372[3] > Class62.anInt1168)
                Class62.aBoolean1157 = true;
            if (aShortArray3348 == null || aShortArray3348[i] == -1) {
                if (anIntArray3339[i] == -1) {
                    int i_202_ = Class62.anIntArray1158[anIntArray3351[i]];
                    Class62.method610(i_195_, i_196_, i_197_, i_192_, i_193_,
                            i_194_, i_202_);
                    Class62.method610(i_195_, i_197_, anIntArray3385[3],
                            i_192_, i_194_, anIntArray3372[3],
                            i_202_);
                } else {
                    Class62.method617(i_195_, i_196_, i_197_, i_192_, i_193_,
                            i_194_, anIntArray3378[0],
                            anIntArray3378[1], anIntArray3378[2]);
                    Class62.method617(i_195_, i_197_, anIntArray3385[3],
                            i_192_, i_194_, anIntArray3372[3],
                            anIntArray3378[0], anIntArray3378[2],
                            anIntArray3378[3]);
                }
            } else {
                int i_203_;
                int i_204_;
                int i_205_;
                if (aByteArray3335 != null && aByteArray3335[i] != -1) {
                    int i_206_ = aByteArray3335[i] & 0xff;
                    i_203_ = anIntArray3357[i_206_];
                    i_204_ = anIntArray3338[i_206_];
                    i_205_ = anIntArray3358[i_206_];
                } else {
                    i_203_ = i_171_;
                    i_204_ = i_172_;
                    i_205_ = i_173_;
                }
                short i_207_ = aShortArray3348[i];
                if (anIntArray3339[i] == -1) {
                    Class62.method616(i_195_, i_196_, i_197_, i_192_, i_193_,
                            i_194_, anIntArray3351[i],
                            anIntArray3351[i], anIntArray3351[i],
                            anIntArray3384[i_203_],
                            anIntArray3384[i_204_],
                            anIntArray3384[i_205_],
                            anIntArray3380[i_203_],
                            anIntArray3380[i_204_],
                            anIntArray3380[i_205_],
                            anIntArray3373[i_203_],
                            anIntArray3373[i_204_],
                            anIntArray3373[i_205_], i_207_);
                    Class62.method616(i_195_, i_197_, anIntArray3385[3],
                            i_192_, i_194_, anIntArray3372[3],
                            anIntArray3351[i], anIntArray3351[i],
                            anIntArray3351[i],
                            anIntArray3384[i_203_],
                            anIntArray3384[i_204_],
                            anIntArray3384[i_205_],
                            anIntArray3380[i_203_],
                            anIntArray3380[i_204_],
                            anIntArray3380[i_205_],
                            anIntArray3373[i_203_],
                            anIntArray3373[i_204_],
                            anIntArray3373[i_205_], i_207_);
                } else {
                    Class62.method616(i_195_, i_196_, i_197_, i_192_, i_193_,
                            i_194_, anIntArray3378[0],
                            anIntArray3378[1], anIntArray3378[2],
                            anIntArray3384[i_203_],
                            anIntArray3384[i_204_],
                            anIntArray3384[i_205_],
                            anIntArray3380[i_203_],
                            anIntArray3380[i_204_],
                            anIntArray3380[i_205_],
                            anIntArray3373[i_203_],
                            anIntArray3373[i_204_],
                            anIntArray3373[i_205_], i_207_);
                    Class62.method616(i_195_, i_197_, anIntArray3385[3],
                            i_192_, i_194_, anIntArray3372[3],
                            anIntArray3378[0], anIntArray3378[2],
                            anIntArray3378[3],
                            anIntArray3384[i_203_],
                            anIntArray3384[i_204_],
                            anIntArray3384[i_205_],
                            anIntArray3380[i_203_],
                            anIntArray3380[i_204_],
                            anIntArray3380[i_205_],
                            anIntArray3373[i_203_],
                            anIntArray3373[i_204_],
                            anIntArray3373[i_205_], i_207_);
                }
            }
        }
    }

    public Class1_Sub3_Sub1 method100(int i, int i_208_, int[][] is,
                                      int[][] is_209_, int i_210_, int i_211_,
                                      int i_212_, boolean bool) {
        if (!aBoolean3345)
            method101();
        int i_213_ = i_210_ + aShort3350;
        int i_214_ = i_210_ + aShort3347;
        int i_215_ = i_212_ + aShort3341;
        int i_216_ = i_212_ + aShort3346;
        if ((i == 1 || i == 2 || i == 3 || i == 5)
                && (i_213_ < 0 || i_214_ + 128 >> 7 >= is.length || i_215_ < 0
                || i_216_ + 128 >> 7 >= is[0].length))
            return this;
        if (i == 4 || i == 5) {
            if (is_209_ == null)
                return this;
            if (i_213_ < 0 || i_214_ + 128 >> 7 >= is_209_.length || i_215_ < 0
                    || i_216_ + 128 >> 7 >= is_209_[0].length)
                return this;
        } else {
            i_213_ >>= 7;
            i_214_ = i_214_ + 127 >> 7;
            i_215_ >>= 7;
            i_216_ = i_216_ + 127 >> 7;
            if (is[i_213_][i_215_] == i_211_ && is[i_214_][i_215_] == i_211_
                    && is[i_213_][i_216_] == i_211_
                    && is[i_214_][i_216_] == i_211_)
                return this;
        }
        Class1_Sub3_Sub1 class1_sub3_sub1_217_;
        if (bool) {
            class1_sub3_sub1_217_ = new Class1_Sub3_Sub1();
            class1_sub3_sub1_217_.anInt3355 = anInt3355;
            class1_sub3_sub1_217_.anInt3356 = anInt3356;
            class1_sub3_sub1_217_.anInt3337 = anInt3337;
            class1_sub3_sub1_217_.anIntArray3361 = anIntArray3361;
            class1_sub3_sub1_217_.anIntArray3336 = anIntArray3336;
            class1_sub3_sub1_217_.anIntArray3364 = anIntArray3364;
            class1_sub3_sub1_217_.anIntArray3351 = anIntArray3351;
            class1_sub3_sub1_217_.anIntArray3366 = anIntArray3366;
            class1_sub3_sub1_217_.anIntArray3339 = anIntArray3339;
            class1_sub3_sub1_217_.aByteArray3344 = aByteArray3344;
            class1_sub3_sub1_217_.aByteArray3349 = aByteArray3349;
            class1_sub3_sub1_217_.aByteArray3335 = aByteArray3335;
            class1_sub3_sub1_217_.aShortArray3348 = aShortArray3348;
            class1_sub3_sub1_217_.aByte3360 = aByte3360;
            class1_sub3_sub1_217_.anIntArray3357 = anIntArray3357;
            class1_sub3_sub1_217_.anIntArray3338 = anIntArray3338;
            class1_sub3_sub1_217_.anIntArray3358 = anIntArray3358;
            class1_sub3_sub1_217_.anIntArrayArray3359 = anIntArrayArray3359;
            class1_sub3_sub1_217_.anIntArrayArray3340 = anIntArrayArray3340;
            class1_sub3_sub1_217_.aBoolean2443 = aBoolean2443;
            if (i == 3) {
                class1_sub3_sub1_217_.anIntArray3354
                        = Class106.method1645(anIntArray3354, -48);
                class1_sub3_sub1_217_.anIntArray3334
                        = Class106.method1645(anIntArray3334, -40);
                class1_sub3_sub1_217_.anIntArray3343
                        = Class106.method1645(anIntArray3343, -52);
            } else {
                class1_sub3_sub1_217_.anIntArray3354 = anIntArray3354;
                class1_sub3_sub1_217_.anIntArray3334
                        = new int[class1_sub3_sub1_217_.anInt3355];
                class1_sub3_sub1_217_.anIntArray3343 = anIntArray3343;
            }
        } else
            class1_sub3_sub1_217_ = this;
        if (i == 1) {
            for (int i_218_ = 0; i_218_ < class1_sub3_sub1_217_.anInt3355;
                 i_218_++) {
                int i_219_ = anIntArray3354[i_218_] + i_210_;
                int i_220_ = anIntArray3343[i_218_] + i_212_;
                int i_221_ = i_219_ & 0x7f;
                int i_222_ = i_220_ & 0x7f;
                int i_223_ = i_219_ >> 7;
                int i_224_ = i_220_ >> 7;
                int i_225_ = ((is[i_223_][i_224_] * (128 - i_221_)
                        + is[i_223_ + 1][i_224_] * i_221_)
                        >> 7);
                int i_226_ = ((is[i_223_][i_224_ + 1] * (128 - i_221_)
                        + is[i_223_ + 1][i_224_ + 1] * i_221_)
                        >> 7);
                int i_227_ = i_225_ * (128 - i_222_) + i_226_ * i_222_ >> 7;
                class1_sub3_sub1_217_.anIntArray3334[i_218_]
                        = anIntArray3334[i_218_] + i_227_ - i_211_;
            }
        } else if (i == 2) {
            for (int i_228_ = 0; i_228_ < class1_sub3_sub1_217_.anInt3355;
                 i_228_++) {
                int i_229_ = (anIntArray3334[i_228_] << 16) / aShort3342;
                if (i_229_ < i_208_) {
                    int i_230_ = anIntArray3354[i_228_] + i_210_;
                    int i_231_ = anIntArray3343[i_228_] + i_212_;
                    int i_232_ = i_230_ & 0x7f;
                    int i_233_ = i_231_ & 0x7f;
                    int i_234_ = i_230_ >> 7;
                    int i_235_ = i_231_ >> 7;
                    int i_236_ = ((is[i_234_][i_235_] * (128 - i_232_)
                            + is[i_234_ + 1][i_235_] * i_232_)
                            >> 7);
                    int i_237_ = ((is[i_234_][i_235_ + 1] * (128 - i_232_)
                            + is[i_234_ + 1][i_235_ + 1] * i_232_)
                            >> 7);
                    int i_238_
                            = i_236_ * (128 - i_233_) + i_237_ * i_233_ >> 7;
                    class1_sub3_sub1_217_.anIntArray3334[i_228_]
                            = (anIntArray3334[i_228_]
                            + (i_238_ - i_211_) * (i_208_ - i_229_) / i_208_);
                } else
                    class1_sub3_sub1_217_.anIntArray3334[i_228_]
                            = anIntArray3334[i_228_];
            }
        } else if (i == 3) {
            int i_239_ = (i_208_ & 0xff) * 4;
            int i_240_ = (i_208_ >> 8 & 0xff) * 4;
            class1_sub3_sub1_217_.method73(is, i_210_, i_211_, i_212_, i_239_,
                    i_240_);
        } else if (i == 4) {
            int i_241_ = aShort3352 - aShort3342;
            for (int i_242_ = 0; i_242_ < anInt3355; i_242_++) {
                int i_243_ = anIntArray3354[i_242_] + i_210_;
                int i_244_ = anIntArray3343[i_242_] + i_212_;
                int i_245_ = i_243_ & 0x7f;
                int i_246_ = i_244_ & 0x7f;
                int i_247_ = i_243_ >> 7;
                int i_248_ = i_244_ >> 7;
                int i_249_ = ((is_209_[i_247_][i_248_] * (128 - i_245_)
                        + is_209_[i_247_ + 1][i_248_] * i_245_)
                        >> 7);
                int i_250_ = ((is_209_[i_247_][i_248_ + 1] * (128 - i_245_)
                        + is_209_[i_247_ + 1][i_248_ + 1] * i_245_)
                        >> 7);
                int i_251_ = i_249_ * (128 - i_246_) + i_250_ * i_246_ >> 7;
                class1_sub3_sub1_217_.anIntArray3334[i_242_]
                        = anIntArray3334[i_242_] + (i_251_ - i_211_) + i_241_;
            }
        } else if (i == 5) {
            int i_252_ = aShort3352 - aShort3342;
            for (int i_253_ = 0; i_253_ < anInt3355; i_253_++) {
                int i_254_ = anIntArray3354[i_253_] + i_210_;
                int i_255_ = anIntArray3343[i_253_] + i_212_;
                int i_256_ = i_254_ & 0x7f;
                int i_257_ = i_255_ & 0x7f;
                int i_258_ = i_254_ >> 7;
                int i_259_ = i_255_ >> 7;
                int i_260_ = ((is[i_258_][i_259_] * (128 - i_256_)
                        + is[i_258_ + 1][i_259_] * i_256_)
                        >> 7);
                int i_261_ = ((is[i_258_][i_259_ + 1] * (128 - i_256_)
                        + is[i_258_ + 1][i_259_ + 1] * i_256_)
                        >> 7);
                int i_262_ = i_260_ * (128 - i_257_) + i_261_ * i_257_ >> 7;
                i_260_ = (is_209_[i_258_][i_259_] * (128 - i_256_)
                        + is_209_[i_258_ + 1][i_259_] * i_256_) >> 7;
                i_261_ = (is_209_[i_258_][i_259_ + 1] * (128 - i_256_)
                        + is_209_[i_258_ + 1][i_259_ + 1] * i_256_) >> 7;
                int i_263_ = i_260_ * (128 - i_257_) + i_261_ * i_257_ >> 7;
                int i_264_ = i_262_ - i_263_;
                class1_sub3_sub1_217_.anIntArray3334[i_253_]
                        = (((anIntArray3334[i_253_] << 8) / i_252_ * i_264_ >> 8)
                        - (i_211_ - i_262_));
            }
        }
        class1_sub3_sub1_217_.aBoolean3345 = false;
        return class1_sub3_sub1_217_;
    }

    public int method84() {
        if (!aBoolean3345)
            method101();
        return aShort3347;
    }

    public void method88() {
        for (int i = 0; i < anInt3355; i++) {
            int i_265_ = anIntArray3343[i];
            anIntArray3343[i] = anIntArray3354[i];
            anIntArray3354[i] = -i_265_;
        }
        aBoolean3345 = false;
    }

    public int method89() {
        if (!aBoolean3345)
            method101();
        return aShort3350;
    }

    public void method101() {
        int i = 32767;
        int i_266_ = 32767;
        int i_267_ = 32767;
        int i_268_ = -32768;
        int i_269_ = -32768;
        int i_270_ = -32768;
        int i_271_ = 0;
        int i_272_ = 0;
        for (int i_273_ = 0; i_273_ < anInt3355; i_273_++) {
            int i_274_ = anIntArray3354[i_273_];
            int i_275_ = anIntArray3334[i_273_];
            int i_276_ = anIntArray3343[i_273_];
            if (i_274_ < i)
                i = i_274_;
            if (i_274_ > i_268_)
                i_268_ = i_274_;
            if (i_275_ < i_266_)
                i_266_ = i_275_;
            if (i_275_ > i_269_)
                i_269_ = i_275_;
            if (i_276_ < i_267_)
                i_267_ = i_276_;
            if (i_276_ > i_270_)
                i_270_ = i_276_;
            int i_277_ = i_274_ * i_274_ + i_276_ * i_276_;
            if (i_277_ > i_271_)
                i_271_ = i_277_;
            i_277_ += i_275_ * i_275_;
            if (i_277_ > i_272_)
                i_272_ = i_277_;
        }
        aShort3350 = (short) i;
        aShort3347 = (short) i_268_;
        aShort3342 = (short) i_266_;
        aShort3352 = (short) i_269_;
        aShort3341 = (short) i_267_;
        aShort3346 = (short) i_270_;
        aShort3362 = (short) (int) (Math.sqrt((double) i_271_) + 0.99);
        aShort3353 = (short) (int) (Math.sqrt((double) i_272_) + 0.99);
        aBoolean3345 = true;
    }

    public void method83() {
        for (int i = 0; i < anInt3355; i++) {
            anIntArray3354[i] = -anIntArray3354[i];
            anIntArray3343[i] = -anIntArray3343[i];
        }
        aBoolean3345 = false;
    }

    public Class1_Sub3 method82(boolean bool, boolean bool_278_) {
        if (!bool && aByteArray3367.length < anInt3356)
            aByteArray3367 = new byte[anInt3356 + 100];
        return method98(bool, aClass1_Sub3_Sub1_3363, aByteArray3367);
    }

    public int method75() {
        if (!aBoolean3345)
            method101();
        return aShort3341;
    }

    public Class1_Sub3 method81(boolean bool, boolean bool_279_) {
        if (!bool && aByteArray3370.length < anInt3356)
            aByteArray3370 = new byte[anInt3356 + 100];
        return method98(bool, aClass1_Sub3_Sub1_3365, aByteArray3370);
    }

    public void method80() {
        for (int i = 0; i < anInt3355; i++) {
            int i_280_ = anIntArray3354[i];
            anIntArray3354[i] = anIntArray3343[i];
            anIntArray3343[i] = -i_280_;
        }
        aBoolean3345 = false;
    }

    public void method85(int i) {
        int i_281_ = Class62.anIntArray1155[i];
        int i_282_ = Class62.anIntArray1167[i];
        for (int i_283_ = 0; i_283_ < anInt3355; i_283_++) {
            int i_284_ = ((anIntArray3334[i_283_] * i_281_
                    + anIntArray3354[i_283_] * i_282_)
                    >> 16);
            anIntArray3334[i_283_] = (anIntArray3334[i_283_] * i_282_
                    - anIntArray3354[i_283_] * i_281_) >> 16;
            anIntArray3354[i_283_] = i_284_;
        }
        aBoolean3345 = false;
    }

    public static int method102(int i) {
        if (i < 2)
            i = 2;
        else if (i > 126)
            i = 126;
        return i;
    }

    public static int method103(int i, int i_285_) {
        i_285_ = i_285_ * (i & 0x7f) >> 7;
        if (i_285_ < 2)
            i_285_ = 2;
        else if (i_285_ > 126)
            i_285_ = 126;
        return (i & 0xff80) + i_285_;
    }

    public void method76(Class68_Sub20_Sub17 class68_sub20_sub17, int i) {
        if (anIntArrayArray3359 != null && i != -1) {
            Class110 class110 = class68_sub20_sub17.aClass110Array4432[i];
            Class68_Sub7 class68_sub7 = class110.aClass68_Sub7_1855;
            anInt3377 = 0;
            anInt3376 = 0;
            anInt3369 = 0;
            for (int i_286_ = 0; i_286_ < class110.anInt1858; i_286_++) {
                short i_287_ = class110.aShortArray1860[i_286_];
                if (class68_sub7.aBooleanArray2849[i_287_]) {
                    if (class110.aShortArray1852[i_286_] != -1)
                        method95(0, 0, 0, 0);
                    method95(class68_sub7.anIntArray2853[i_287_],
                            class110.aShortArray1848[i_286_],
                            class110.aShortArray1850[i_286_],
                            class110.aShortArray1859[i_286_]);
                }
            }
            aBoolean3345 = false;
        }
    }

    public void method104(boolean bool, boolean bool_288_, long l, int i,
                          int i_289_) {
        if (i_289_ < 1600) {
            for (int i_290_ = 0; i_290_ < i_289_; i_290_++)
                anIntArray3389[i_290_] = 0;
            for (int i_291_ = 0; i_291_ < anInt3356; i_291_++) {
                if (anIntArray3339[i_291_] != -2) {
                    int i_292_ = anIntArray3361[i_291_];
                    int i_293_ = anIntArray3336[i_291_];
                    int i_294_ = anIntArray3364[i_291_];
                    int i_295_ = anIntArray3382[i_292_];
                    int i_296_ = anIntArray3382[i_293_];
                    int i_297_ = anIntArray3382[i_294_];
                    if (bool && (i_295_ == -5000 || i_296_ == -5000
                            || i_297_ == -5000)) {
                        int i_298_ = anIntArray3384[i_292_];
                        int i_299_ = anIntArray3384[i_293_];
                        int i_300_ = anIntArray3384[i_294_];
                        int i_301_ = anIntArray3380[i_292_];
                        int i_302_ = anIntArray3380[i_293_];
                        int i_303_ = anIntArray3380[i_294_];
                        int i_304_ = anIntArray3373[i_292_];
                        int i_305_ = anIntArray3373[i_293_];
                        int i_306_ = anIntArray3373[i_294_];
                        i_298_ -= i_299_;
                        i_300_ -= i_299_;
                        i_301_ -= i_302_;
                        i_303_ -= i_302_;
                        i_304_ -= i_305_;
                        i_306_ -= i_305_;
                        int i_307_ = i_301_ * i_306_ - i_304_ * i_303_;
                        int i_308_ = i_304_ * i_300_ - i_298_ * i_306_;
                        int i_309_ = i_298_ * i_303_ - i_301_ * i_300_;
                        if (i_299_ * i_307_ + i_302_ * i_308_ + i_305_ * i_309_
                                > 0) {
                            aBooleanArray3381[i_291_] = true;
                            int i_310_ = ((anIntArray3386[i_292_]
                                    + anIntArray3386[i_293_]
                                    + anIntArray3386[i_294_]) / 3
                                    + i);
                            anIntArrayArray3387[i_310_]
                                    [anIntArray3389[i_310_]++]
                                    = i_291_;
                        }
                    } else {
                        if (bool_288_
                                && method93((Class68_Sub9.anInt2886
                                + Class62.anInt1164),
                                Class51.anInt2256 + Class62.anInt1160,
                                anIntArray3368[i_292_],
                                anIntArray3368[i_293_],
                                anIntArray3368[i_294_], i_295_, i_296_,
                                i_297_)) {
                            Class68_Sub20_Sub15.aLongArray4389
                                    [Class68_Sub13_Sub1.anInt3448++]
                                    = l;
                            bool_288_ = false;
                        }
                        if (((i_295_ - i_296_) * (anIntArray3368[i_294_]
                                - anIntArray3368[i_293_])
                                - (anIntArray3368[i_292_]
                                - anIntArray3368[i_293_]) * (i_297_ - i_296_))
                                > 0) {
                            aBooleanArray3381[i_291_] = false;
                            if (i_295_ < 0 || i_296_ < 0 || i_297_ < 0
                                    || i_295_ > Class62.anInt1168
                                    || i_296_ > Class62.anInt1168
                                    || i_297_ > Class62.anInt1168)
                                aBooleanArray3375[i_291_] = true;
                            else
                                aBooleanArray3375[i_291_] = false;
                            int i_311_ = ((anIntArray3386[i_292_]
                                    + anIntArray3386[i_293_]
                                    + anIntArray3386[i_294_]) / 3
                                    + i);
                            anIntArrayArray3387[i_311_]
                                    [anIntArray3389[i_311_]++]
                                    = i_291_;
                        }
                    }
                }
            }
            if (aByteArray3344 == null) {
                for (int i_312_ = i_289_ - 1; i_312_ >= 0; i_312_--) {
                    int i_313_ = anIntArray3389[i_312_];
                    if (i_313_ > 0) {
                        int[] is = anIntArrayArray3387[i_312_];
                        for (int i_314_ = 0; i_314_ < i_313_; i_314_++)
                            method105(is[i_314_]);
                    }
                }
            } else {
                for (int i_315_ = 0; i_315_ < 12; i_315_++) {
                    anIntArray3388[i_315_] = 0;
                    anIntArray3371[i_315_] = 0;
                }
                for (int i_316_ = i_289_ - 1; i_316_ >= 0; i_316_--) {
                    int i_317_ = anIntArray3389[i_316_];
                    if (i_317_ > 0) {
                        int[] is = anIntArrayArray3387[i_316_];
                        for (int i_318_ = 0; i_318_ < i_317_; i_318_++) {
                            int i_319_ = is[i_318_];
                            byte i_320_ = aByteArray3344[i_319_];
                            int i_321_ = anIntArray3388[i_320_]++;
                            anIntArrayArray3379[i_320_][i_321_] = i_319_;
                            if (i_320_ < 10)
                                anIntArray3371[i_320_] += i_316_;
                            else if (i_320_ == 10)
                                anIntArray3374[i_321_] = i_316_;
                            else
                                anIntArray3383[i_321_] = i_316_;
                        }
                    }
                }
                int i_322_ = 0;
                if (anIntArray3388[1] > 0 || anIntArray3388[2] > 0)
                    i_322_ = ((anIntArray3371[1] + anIntArray3371[2])
                            / (anIntArray3388[1] + anIntArray3388[2]));
                int i_323_ = 0;
                if (anIntArray3388[3] > 0 || anIntArray3388[4] > 0)
                    i_323_ = ((anIntArray3371[3] + anIntArray3371[4])
                            / (anIntArray3388[3] + anIntArray3388[4]));
                int i_324_ = 0;
                if (anIntArray3388[6] > 0 || anIntArray3388[8] > 0)
                    i_324_ = ((anIntArray3371[6] + anIntArray3371[8])
                            / (anIntArray3388[6] + anIntArray3388[8]));
                int i_325_ = 0;
                int i_326_ = anIntArray3388[10];
                int[] is = anIntArrayArray3379[10];
                int[] is_327_ = anIntArray3374;
                if (i_325_ == i_326_) {
                    i_325_ = 0;
                    i_326_ = anIntArray3388[11];
                    is = anIntArrayArray3379[11];
                    is_327_ = anIntArray3383;
                }
                int i_328_;
                if (i_325_ < i_326_)
                    i_328_ = is_327_[i_325_];
                else
                    i_328_ = -1000;
                for (int i_329_ = 0; i_329_ < 10; i_329_++) {
                    while (i_329_ == 0) {
                        if (i_328_ <= i_322_)
                            break;
                        method105(is[i_325_++]);
                        if (i_325_ == i_326_
                                && is != anIntArrayArray3379[11]) {
                            i_325_ = 0;
                            i_326_ = anIntArray3388[11];
                            is = anIntArrayArray3379[11];
                            is_327_ = anIntArray3383;
                        }
                        if (i_325_ < i_326_)
                            i_328_ = is_327_[i_325_];
                        else
                            i_328_ = -1000;
                    }
                    while (i_329_ == 3) {
                        if (i_328_ <= i_323_)
                            break;
                        method105(is[i_325_++]);
                        if (i_325_ == i_326_
                                && is != anIntArrayArray3379[11]) {
                            i_325_ = 0;
                            i_326_ = anIntArray3388[11];
                            is = anIntArrayArray3379[11];
                            is_327_ = anIntArray3383;
                        }
                        if (i_325_ < i_326_)
                            i_328_ = is_327_[i_325_];
                        else
                            i_328_ = -1000;
                    }
                    while (i_329_ == 5 && i_328_ > i_324_) {
                        method105(is[i_325_++]);
                        if (i_325_ == i_326_
                                && is != anIntArrayArray3379[11]) {
                            i_325_ = 0;
                            i_326_ = anIntArray3388[11];
                            is = anIntArrayArray3379[11];
                            is_327_ = anIntArray3383;
                        }
                        if (i_325_ < i_326_)
                            i_328_ = is_327_[i_325_];
                        else
                            i_328_ = -1000;
                    }
                    int i_330_ = anIntArray3388[i_329_];
                    int[] is_331_ = anIntArrayArray3379[i_329_];
                    for (int i_332_ = 0; i_332_ < i_330_; i_332_++)
                        method105(is_331_[i_332_]);
                }
                while (i_328_ != -1000) {
                    method105(is[i_325_++]);
                    if (i_325_ == i_326_ && is != anIntArrayArray3379[11]) {
                        i_325_ = 0;
                        is = anIntArrayArray3379[11];
                        i_326_ = anIntArray3388[11];
                        is_327_ = anIntArray3383;
                    }
                    if (i_325_ < i_326_)
                        i_328_ = is_327_[i_325_];
                    else
                        i_328_ = -1000;
                }
            }
        }
    }

    public void method105(int i) {
        if (aBooleanArray3381[i])
            method99(i);
        else {
            int i_333_ = anIntArray3361[i];
            int i_334_ = anIntArray3336[i];
            int i_335_ = anIntArray3364[i];
            Class62.aBoolean1157 = aBooleanArray3375[i];
            if (aByteArray3349 == null)
                Class62.anInt1153 = 0;
            else
                Class62.anInt1153 = aByteArray3349[i] & 0xff;
            if (aShortArray3348 == null || aShortArray3348[i] == -1) {
                if (anIntArray3339[i] == -1)
                    Class62.method610(anIntArray3368[i_333_],
                            anIntArray3368[i_334_],
                            anIntArray3368[i_335_],
                            anIntArray3382[i_333_],
                            anIntArray3382[i_334_],
                            anIntArray3382[i_335_],
                            (Class62.anIntArray1158
                                    [anIntArray3351[i]]));
                else
                    Class62.method617(anIntArray3368[i_333_],
                            anIntArray3368[i_334_],
                            anIntArray3368[i_335_],
                            anIntArray3382[i_333_],
                            anIntArray3382[i_334_],
                            anIntArray3382[i_335_],
                            anIntArray3351[i], anIntArray3366[i],
                            anIntArray3339[i]);
            } else {
                int i_336_;
                int i_337_;
                int i_338_;
                if (aByteArray3335 != null && aByteArray3335[i] != -1) {
                    int i_339_ = aByteArray3335[i] & 0xff;
                    i_336_ = anIntArray3357[i_339_];
                    i_337_ = anIntArray3338[i_339_];
                    i_338_ = anIntArray3358[i_339_];
                } else {
                    i_336_ = i_333_;
                    i_337_ = i_334_;
                    i_338_ = i_335_;
                }
                if (anIntArray3339[i] == -1)
                    Class62.method616
                            (anIntArray3368[i_333_], anIntArray3368[i_334_],
                                    anIntArray3368[i_335_], anIntArray3382[i_333_],
                                    anIntArray3382[i_334_], anIntArray3382[i_335_],
                                    anIntArray3351[i], anIntArray3351[i],
                                    anIntArray3351[i], anIntArray3384[i_336_],
                                    anIntArray3384[i_337_], anIntArray3384[i_338_],
                                    anIntArray3380[i_336_], anIntArray3380[i_337_],
                                    anIntArray3380[i_338_], anIntArray3373[i_336_],
                                    anIntArray3373[i_337_], anIntArray3373[i_338_],
                                    aShortArray3348[i]);
                else
                    Class62.method616
                            (anIntArray3368[i_333_], anIntArray3368[i_334_],
                                    anIntArray3368[i_335_], anIntArray3382[i_333_],
                                    anIntArray3382[i_334_], anIntArray3382[i_335_],
                                    anIntArray3351[i], anIntArray3366[i],
                                    anIntArray3339[i], anIntArray3384[i_336_],
                                    anIntArray3384[i_337_], anIntArray3384[i_338_],
                                    anIntArray3380[i_336_], anIntArray3380[i_337_],
                                    anIntArray3380[i_338_], anIntArray3373[i_336_],
                                    anIntArray3373[i_337_], anIntArray3373[i_338_],
                                    aShortArray3348[i]);
            }
        }
    }

    public void method78(int i) {
        int i_340_ = Class62.anIntArray1155[i];
        int i_341_ = Class62.anIntArray1167[i];
        for (int i_342_ = 0; i_342_ < anInt3355; i_342_++) {
            int i_343_ = ((anIntArray3334[i_342_] * i_341_
                    - anIntArray3343[i_342_] * i_340_)
                    >> 16);
            anIntArray3343[i_342_] = (anIntArray3334[i_342_] * i_340_
                    + anIntArray3343[i_342_] * i_341_) >> 16;
            anIntArray3334[i_342_] = i_343_;
        }
        aBoolean3345 = false;
    }

    public void method90(int i) {
        int i_344_ = Class62.anIntArray1155[i];
        int i_345_ = Class62.anIntArray1167[i];
        for (int i_346_ = 0; i_346_ < anInt3355; i_346_++) {
            int i_347_ = ((anIntArray3343[i_346_] * i_344_
                    + anIntArray3354[i_346_] * i_345_)
                    >> 16);
            anIntArray3343[i_346_] = (anIntArray3343[i_346_] * i_345_
                    - anIntArray3354[i_346_] * i_344_) >> 16;
            anIntArray3354[i_346_] = i_347_;
        }
        aBoolean3345 = false;
    }

    public Class1_Sub3 method106(Class1_Sub3 class1_sub3) {
        return new Class1_Sub3_Sub1((new Class1_Sub3_Sub1[]
                {this, (Class1_Sub3_Sub1) class1_sub3}),
                2);
    }

    public void method74(Class68_Sub20_Sub17 class68_sub20_sub17, int i,
                         boolean bool) {
        if (anIntArrayArray3359 != null && i != -1) {
            Class110 class110 = class68_sub20_sub17.aClass110Array4432[i];
            Class68_Sub7 class68_sub7 = class110.aClass68_Sub7_1855;
            anInt3377 = 0;
            anInt3376 = 0;
            anInt3369 = 0;
            for (int i_348_ = 0; i_348_ < class110.anInt1858; i_348_++) {
                short i_349_ = class110.aShortArray1860[i_348_];
                if (class110.aShortArray1852[i_348_] != -1)
                    method97(0, (class68_sub7.anIntArrayArray2855
                            [class110.aShortArray1852[i_348_]]), 0, 0, 0);
                method97(class68_sub7.anIntArray2853[i_349_],
                        class68_sub7.anIntArrayArray2855[i_349_],
                        class110.aShortArray1848[i_348_],
                        class110.aShortArray1850[i_348_],
                        class110.aShortArray1859[i_348_]);
            }
            aBoolean3345 = false;
        }
    }

    public void method86(Class68_Sub20_Sub17 class68_sub20_sub17, int i,
                         Class68_Sub20_Sub17 class68_sub20_sub17_350_,
                         int i_351_, int[] is, boolean bool) {
        if (i != -1) {
            if (is == null || i_351_ == -1)
                method74(class68_sub20_sub17, i, bool);
            else {
                Class110 class110 = class68_sub20_sub17.aClass110Array4432[i];
                Class110 class110_352_
                        = class68_sub20_sub17_350_.aClass110Array4432[i_351_];
                Class68_Sub7 class68_sub7 = class110.aClass68_Sub7_1855;
                anInt3377 = 0;
                anInt3376 = 0;
                anInt3369 = 0;
                int i_353_ = 0;
                int i_354_ = is[i_353_++];
                for (int i_355_ = 0; i_355_ < class110.anInt1858; i_355_++) {
                    int i_356_;
                    for (i_356_ = class110.aShortArray1860[i_355_];
                         i_356_ > i_354_; i_354_ = is[i_353_++]) {
                        /* empty */
                    }
                    if (i_356_ != i_354_
                            || class68_sub7.anIntArray2853[i_356_] == 0) {
                        if (class110.aShortArray1852[i_355_] != -1)
                            method97(0,
                                    (class68_sub7.anIntArrayArray2855
                                            [class110.aShortArray1852[i_355_]]),
                                    0, 0, 0);
                        method97(class68_sub7.anIntArray2853[i_356_],
                                class68_sub7.anIntArrayArray2855[i_356_],
                                class110.aShortArray1848[i_355_],
                                class110.aShortArray1850[i_355_],
                                class110.aShortArray1859[i_355_]);
                    }
                }
                anInt3377 = 0;
                anInt3376 = 0;
                anInt3369 = 0;
                i_353_ = 0;
                i_354_ = is[i_353_++];
                for (int i_357_ = 0; i_357_ < class110_352_.anInt1858;
                     i_357_++) {
                    int i_358_;
                    for (i_358_ = class110_352_.aShortArray1860[i_357_];
                         i_358_ > i_354_; i_354_ = is[i_353_++]) {
                        /* empty */
                    }
                    if (i_358_ == i_354_
                            || class68_sub7.anIntArray2853[i_358_] == 0) {
                        if (class110_352_.aShortArray1852[i_357_] != -1)
                            method97(0,
                                    (class68_sub7.anIntArrayArray2855
                                            [class110_352_.aShortArray1852[i_357_]]),
                                    0, 0, 0);
                        method97(class68_sub7.anIntArray2853[i_358_],
                                class68_sub7.anIntArrayArray2855[i_358_],
                                class110_352_.aShortArray1848[i_357_],
                                class110_352_.aShortArray1850[i_357_],
                                class110_352_.aShortArray1859[i_357_]);
                    }
                }
                aBoolean3345 = false;
            }
        }
    }

    public Class1_Sub3_Sub1() {
        anInt3355 = 0;
        anInt3337 = 0;
        aByte3360 = (byte) 0;
    }

    public Class1_Sub3_Sub1(Class1_Sub4 class1_sub4, int i, int i_359_,
                            int i_360_, int i_361_, int i_362_) {
        anInt3355 = 0;
        anInt3337 = 0;
        aByte3360 = (byte) 0;
        class1_sub4.method120();
        class1_sub4.method112();
        anInt3355 = class1_sub4.anInt2445;
        anIntArray3354 = class1_sub4.anIntArray2477;
        anIntArray3334 = class1_sub4.anIntArray2473;
        anIntArray3343 = class1_sub4.anIntArray2466;
        anInt3356 = class1_sub4.anInt2475;
        anIntArray3361 = class1_sub4.anIntArray2446;
        anIntArray3336 = class1_sub4.anIntArray2486;
        anIntArray3364 = class1_sub4.anIntArray2463;
        aByteArray3344 = class1_sub4.aByteArray2480;
        aByteArray3349 = class1_sub4.aByteArray2479;
        aByte3360 = class1_sub4.aByte2489;
        anIntArrayArray3359 = class1_sub4.anIntArrayArray2487;
        anIntArrayArray3340 = class1_sub4.anIntArrayArray2484;
        int i_363_
                = (int) Math.sqrt((double) (i_360_ * i_360_ + i_361_ * i_361_
                + i_362_ * i_362_));
        int i_364_ = i_359_ * i_363_ >> 8;
        anIntArray3351 = new int[anInt3356];
        anIntArray3366 = new int[anInt3356];
        anIntArray3339 = new int[anInt3356];
        if (class1_sub4.aShortArray2465 != null) {
            aShortArray3348 = new short[anInt3356];
            for (int i_365_ = 0; i_365_ < anInt3356; i_365_++) {
                short i_366_ = class1_sub4.aShortArray2465[i_365_];
                if (i_366_ != -1
                        && Class62.anInterface4_1159.method8((byte) 39, i_366_))
                    aShortArray3348[i_365_] = i_366_;
                else
                    aShortArray3348[i_365_] = (short) -1;
            }
        } else
            aShortArray3348 = null;
        if (class1_sub4.anInt2459 > 0 && class1_sub4.aByteArray2492 != null) {
            int[] is = new int[class1_sub4.anInt2459];
            for (int i_367_ = 0; i_367_ < anInt3356; i_367_++) {
                if (class1_sub4.aByteArray2492[i_367_] != -1)
                    is[class1_sub4.aByteArray2492[i_367_] & 0xff]++;
            }
            anInt3337 = 0;
            for (int i_368_ = 0; i_368_ < class1_sub4.anInt2459; i_368_++) {
                if (is[i_368_] > 0 && class1_sub4.aByteArray2461[i_368_] == 0)
                    anInt3337++;
            }
            anIntArray3357 = new int[anInt3337];
            anIntArray3338 = new int[anInt3337];
            anIntArray3358 = new int[anInt3337];
            int i_369_ = 0;
            for (int i_370_ = 0; i_370_ < class1_sub4.anInt2459; i_370_++) {
                if (is[i_370_] > 0
                        && class1_sub4.aByteArray2461[i_370_] == 0) {
                    anIntArray3357[i_369_]
                            = class1_sub4.aShortArray2454[i_370_] & 0xffff;
                    anIntArray3338[i_369_]
                            = class1_sub4.aShortArray2452[i_370_] & 0xffff;
                    anIntArray3358[i_369_]
                            = class1_sub4.aShortArray2457[i_370_] & 0xffff;
                    is[i_370_] = i_369_++;
                } else
                    is[i_370_] = -1;
            }
            aByteArray3335 = new byte[anInt3356];
            for (int i_371_ = 0; i_371_ < anInt3356; i_371_++) {
                if (class1_sub4.aByteArray2492[i_371_] != -1) {
                    aByteArray3335[i_371_]
                            = (byte) is[class1_sub4.aByteArray2492[i_371_] & 0xff];
                    if (aByteArray3335[i_371_] == -1
                            && aShortArray3348 != null)
                        aShortArray3348[i_371_] = (short) -1;
                } else
                    aByteArray3335[i_371_] = (byte) -1;
            }
        }
        for (int i_372_ = 0; i_372_ < anInt3356; i_372_++) {
            byte i_373_;
            if (class1_sub4.aByteArray2476 == null)
                i_373_ = (byte) 0;
            else
                i_373_ = class1_sub4.aByteArray2476[i_372_];
            byte i_374_;
            if (class1_sub4.aByteArray2479 == null)
                i_374_ = (byte) 0;
            else
                i_374_ = class1_sub4.aByteArray2479[i_372_];
            short i_375_;
            if (aShortArray3348 == null)
                i_375_ = (short) -1;
            else
                i_375_ = aShortArray3348[i_372_];
            if (i_374_ == -2)
                i_373_ = (byte) 3;
            if (i_374_ == -1)
                i_373_ = (byte) 2;
            if (i_375_ == -1) {
                if (i_373_ == 0) {
                    int i_376_ = class1_sub4.aShortArray2462[i_372_] & 0xffff;
                    Class107 class107;
                    if (class1_sub4.aClass107Array2478 != null
                            && (class1_sub4.aClass107Array2478
                            [anIntArray3361[i_372_]]) != null)
                        class107 = (class1_sub4.aClass107Array2478
                                [anIntArray3361[i_372_]]);
                    else
                        class107 = (class1_sub4.aClass107Array2451
                                [anIntArray3361[i_372_]]);
                    int i_377_ = i + ((i_360_ * class107.anInt1820
                            + i_361_ * class107.anInt1822
                            + i_362_ * class107.anInt1811)
                            / (i_364_ * class107.anInt1814));
                    anIntArray3351[i_372_] = method103(i_376_, i_377_);
                    if (class1_sub4.aClass107Array2478 != null
                            && (class1_sub4.aClass107Array2478
                            [anIntArray3336[i_372_]]) != null)
                        class107 = (class1_sub4.aClass107Array2478
                                [anIntArray3336[i_372_]]);
                    else
                        class107 = (class1_sub4.aClass107Array2451
                                [anIntArray3336[i_372_]]);
                    i_377_ = i + ((i_360_ * class107.anInt1820
                            + i_361_ * class107.anInt1822
                            + i_362_ * class107.anInt1811)
                            / (i_364_ * class107.anInt1814));
                    anIntArray3366[i_372_] = method103(i_376_, i_377_);
                    if (class1_sub4.aClass107Array2478 != null
                            && (class1_sub4.aClass107Array2478
                            [anIntArray3364[i_372_]]) != null)
                        class107 = (class1_sub4.aClass107Array2478
                                [anIntArray3364[i_372_]]);
                    else
                        class107 = (class1_sub4.aClass107Array2451
                                [anIntArray3364[i_372_]]);
                    i_377_ = i + ((i_360_ * class107.anInt1820
                            + i_361_ * class107.anInt1822
                            + i_362_ * class107.anInt1811)
                            / (i_364_ * class107.anInt1814));
                    anIntArray3339[i_372_] = method103(i_376_, i_377_);
                } else if (i_373_ == 1) {
                    Class104 class104 = class1_sub4.aClass104Array2448[i_372_];
                    int i_378_ = i + ((i_360_ * class104.anInt1781
                            + i_361_ * class104.anInt1788
                            + i_362_ * class104.anInt1782)
                            / (i_364_ + i_364_ / 2));
                    anIntArray3351[i_372_]
                            = method103((class1_sub4.aShortArray2462[i_372_]
                            & 0xffff),
                            i_378_);
                    anIntArray3339[i_372_] = -1;
                } else if (i_373_ == 3) {
                    anIntArray3351[i_372_] = 128;
                    anIntArray3339[i_372_] = -1;
                } else
                    anIntArray3339[i_372_] = -2;
            } else if (i_373_ == 0) {
                Class107 class107;
                if (class1_sub4.aClass107Array2478 != null
                        && (class1_sub4.aClass107Array2478[anIntArray3361[i_372_]]
                        != null))
                    class107 = (class1_sub4.aClass107Array2478
                            [anIntArray3361[i_372_]]);
                else
                    class107 = (class1_sub4.aClass107Array2451
                            [anIntArray3361[i_372_]]);
                int i_379_ = i + ((i_360_ * class107.anInt1820
                        + i_361_ * class107.anInt1822
                        + i_362_ * class107.anInt1811)
                        / (i_364_ * class107.anInt1814));
                anIntArray3351[i_372_] = method102(i_379_);
                if (class1_sub4.aClass107Array2478 != null
                        && (class1_sub4.aClass107Array2478[anIntArray3336[i_372_]]
                        != null))
                    class107 = (class1_sub4.aClass107Array2478
                            [anIntArray3336[i_372_]]);
                else
                    class107 = (class1_sub4.aClass107Array2451
                            [anIntArray3336[i_372_]]);
                i_379_ = i + ((i_360_ * class107.anInt1820
                        + i_361_ * class107.anInt1822
                        + i_362_ * class107.anInt1811)
                        / (i_364_ * class107.anInt1814));
                anIntArray3366[i_372_] = method102(i_379_);
                if (class1_sub4.aClass107Array2478 != null
                        && (class1_sub4.aClass107Array2478[anIntArray3364[i_372_]]
                        != null))
                    class107 = (class1_sub4.aClass107Array2478
                            [anIntArray3364[i_372_]]);
                else
                    class107 = (class1_sub4.aClass107Array2451
                            [anIntArray3364[i_372_]]);
                i_379_ = i + ((i_360_ * class107.anInt1820
                        + i_361_ * class107.anInt1822
                        + i_362_ * class107.anInt1811)
                        / (i_364_ * class107.anInt1814));
                anIntArray3339[i_372_] = method102(i_379_);
            } else if (i_373_ == 1) {
                Class104 class104 = class1_sub4.aClass104Array2448[i_372_];
                int i_380_ = i + ((i_360_ * class104.anInt1781
                        + i_361_ * class104.anInt1788
                        + i_362_ * class104.anInt1782)
                        / (i_364_ + i_364_ / 2));
                anIntArray3351[i_372_] = method102(i_380_);
                anIntArray3339[i_372_] = -1;
            } else
                anIntArray3339[i_372_] = -2;
        }
    }

    public Class1_Sub3_Sub1(Class1_Sub3_Sub1[] class1_sub3_sub1s, int i) {
        anInt3355 = 0;
        anInt3337 = 0;
        aByte3360 = (byte) 0;
        boolean bool = false;
        boolean bool_381_ = false;
        boolean bool_382_ = false;
        boolean bool_383_ = false;
        anInt3355 = 0;
        anInt3356 = 0;
        anInt3337 = 0;
        aByte3360 = (byte) -1;
        for (int i_384_ = 0; i_384_ < i; i_384_++) {
            Class1_Sub3_Sub1 class1_sub3_sub1_385_ = class1_sub3_sub1s[i_384_];
            if (class1_sub3_sub1_385_ != null) {
                anInt3355 += class1_sub3_sub1_385_.anInt3355;
                anInt3356 += class1_sub3_sub1_385_.anInt3356;
                anInt3337 += class1_sub3_sub1_385_.anInt3337;
                if (class1_sub3_sub1_385_.aByteArray3344 != null)
                    bool = true;
                else {
                    if (aByte3360 == -1)
                        aByte3360 = class1_sub3_sub1_385_.aByte3360;
                    if (aByte3360 != class1_sub3_sub1_385_.aByte3360)
                        bool = true;
                }
                bool_381_
                        = bool_381_ | class1_sub3_sub1_385_.aByteArray3349 != null;
                bool_382_ = (bool_382_
                        | class1_sub3_sub1_385_.aShortArray3348 != null);
                bool_383_
                        = bool_383_ | class1_sub3_sub1_385_.aByteArray3335 != null;
            }
        }
        anIntArray3354 = new int[anInt3355];
        anIntArray3334 = new int[anInt3355];
        anIntArray3343 = new int[anInt3355];
        anIntArray3361 = new int[anInt3356];
        anIntArray3336 = new int[anInt3356];
        anIntArray3364 = new int[anInt3356];
        anIntArray3351 = new int[anInt3356];
        anIntArray3366 = new int[anInt3356];
        anIntArray3339 = new int[anInt3356];
        if (bool)
            aByteArray3344 = new byte[anInt3356];
        if (bool_381_)
            aByteArray3349 = new byte[anInt3356];
        if (bool_382_)
            aShortArray3348 = new short[anInt3356];
        if (bool_383_)
            aByteArray3335 = new byte[anInt3356];
        if (anInt3337 > 0) {
            anIntArray3357 = new int[anInt3337];
            anIntArray3338 = new int[anInt3337];
            anIntArray3358 = new int[anInt3337];
        }
        anInt3355 = 0;
        anInt3356 = 0;
        anInt3337 = 0;
        for (int i_386_ = 0; i_386_ < i; i_386_++) {
            Class1_Sub3_Sub1 class1_sub3_sub1_387_ = class1_sub3_sub1s[i_386_];
            if (class1_sub3_sub1_387_ != null) {
                for (int i_388_ = 0; i_388_ < class1_sub3_sub1_387_.anInt3356;
                     i_388_++) {
                    anIntArray3361[anInt3356]
                            = (class1_sub3_sub1_387_.anIntArray3361[i_388_]
                            + anInt3355);
                    anIntArray3336[anInt3356]
                            = (class1_sub3_sub1_387_.anIntArray3336[i_388_]
                            + anInt3355);
                    anIntArray3364[anInt3356]
                            = (class1_sub3_sub1_387_.anIntArray3364[i_388_]
                            + anInt3355);
                    anIntArray3351[anInt3356]
                            = class1_sub3_sub1_387_.anIntArray3351[i_388_];
                    anIntArray3366[anInt3356]
                            = class1_sub3_sub1_387_.anIntArray3366[i_388_];
                    anIntArray3339[anInt3356]
                            = class1_sub3_sub1_387_.anIntArray3339[i_388_];
                    if (bool) {
                        if (class1_sub3_sub1_387_.aByteArray3344 != null)
                            aByteArray3344[anInt3356]
                                    = class1_sub3_sub1_387_.aByteArray3344[i_388_];
                        else
                            aByteArray3344[anInt3356]
                                    = class1_sub3_sub1_387_.aByte3360;
                    }
                    if (bool_381_
                            && class1_sub3_sub1_387_.aByteArray3349 != null)
                        aByteArray3349[anInt3356]
                                = class1_sub3_sub1_387_.aByteArray3349[i_388_];
                    if (bool_382_) {
                        if (class1_sub3_sub1_387_.aShortArray3348 != null)
                            aShortArray3348[anInt3356]
                                    = (class1_sub3_sub1_387_.aShortArray3348
                                    [i_388_]);
                        else
                            aShortArray3348[anInt3356] = (short) -1;
                    }
                    if (bool_383_) {
                        if (class1_sub3_sub1_387_.aByteArray3335 != null
                                && (class1_sub3_sub1_387_.aByteArray3335[i_388_]
                                != -1))
                            aByteArray3335[anInt3356]
                                    = (byte) ((class1_sub3_sub1_387_.aByteArray3335
                                    [i_388_])
                                    + anInt3337);
                        else
                            aByteArray3335[anInt3356] = (byte) -1;
                    }
                    anInt3356++;
                }
                for (int i_389_ = 0; i_389_ < class1_sub3_sub1_387_.anInt3337;
                     i_389_++) {
                    anIntArray3357[anInt3337]
                            = (class1_sub3_sub1_387_.anIntArray3357[i_389_]
                            + anInt3355);
                    anIntArray3338[anInt3337]
                            = (class1_sub3_sub1_387_.anIntArray3338[i_389_]
                            + anInt3355);
                    anIntArray3358[anInt3337]
                            = (class1_sub3_sub1_387_.anIntArray3358[i_389_]
                            + anInt3355);
                    anInt3337++;
                }
                for (int i_390_ = 0; i_390_ < class1_sub3_sub1_387_.anInt3355;
                     i_390_++) {
                    anIntArray3354[anInt3355]
                            = class1_sub3_sub1_387_.anIntArray3354[i_390_];
                    anIntArray3334[anInt3355]
                            = class1_sub3_sub1_387_.anIntArray3334[i_390_];
                    anIntArray3343[anInt3355]
                            = class1_sub3_sub1_387_.anIntArray3343[i_390_];
                    anInt3355++;
                }
            }
        }
    }

    static {
        aClass1_Sub3_Sub1_3365 = new Class1_Sub3_Sub1();
        aByteArray3370 = new byte[1];
        anIntArray3372 = new int[10];
        anIntArray3371 = new int[12];
        anIntArray3373 = new int[4096];
        anIntArray3368 = new int[4096];
        anIntArray3380 = new int[4096];
        aBooleanArray3381 = new boolean[4096];
        anIntArray3374 = new int[4096];
        anIntArray3382 = new int[4096];
        anIntArrayArray3379 = new int[12][4096];
        anIntArray3384 = new int[4096];
        aBooleanArray3375 = new boolean[4096];
        anIntArray3378 = new int[10];
        anIntArray3388 = new int[12];
        anIntArray3385 = new int[10];
        anIntArray3386 = new int[4096];
        anIntArray3383 = new int[4096];
        anIntArray3389 = new int[1600];
        anIntArrayArray3387 = new int[1600][512];
    }
}
