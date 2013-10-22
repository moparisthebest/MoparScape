/* Class1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SpriteFactory extends Model
{
    int[] anIntArray3336;
    private byte[] aByteArray3337;
    private int[] anIntArray3338;
    private int anInt3339;
    private int[] anIntArray3340;
    private int[] anIntArray3341;
    private int[][] anIntArrayArray3342;
    private short aShort3343;
    private short aShort3344;
    int[] anIntArray3345;
    private byte[] aByteArray3346;
    boolean aBoolean3347 = false;
    private short height;
    private short aShort3349;
    private short[] aShortArray3350;
    private byte[] aByteArray3351;
    private short aShort3352;
    private int[] anIntArray3353;
    private short aShort3354;
    private short aShort3355;
    int[] anIntArray3356;
    int anInt3357;
    private int anInt3358 = 0;
    private int[] anIntArray3359;
    private int[] anIntArray3360;
    private int[][] anIntArrayArray3361;
    private byte aByte3362;
    private int[] anIntArray3363;
    private short aShort3364;
    private static SpriteFactory aClass1_Sub3_Sub1_3365 = new SpriteFactory();
    private int[] anIntArray3366;
    private static SpriteFactory aClass1_Sub3_Sub1_3367;
    private int[] anIntArray3368;
    private static byte[] aByteArray3369 = new byte[1];
    private static int[] anIntArray3370;
    private static int anInt3371;
    private static byte[] aByteArray3372;
    private static int[] anIntArray3373;
    private static int[] anIntArray3374;
    private static int[] anIntArray3375;
    private static int[] anIntArray3376;
    private static boolean[] aBooleanArray3377;
    private static int anInt3378;
    private static int anInt3379;
    private static int[] anIntArray3380;
    private static int[][] anIntArrayArray3381;
    private static int[] anIntArray3382;
    private static boolean[] aBooleanArray3383;
    private static int[] anIntArray3384;
    private static int[] anIntArray3385;
    private static int[] anIntArray3386;
    private static int[] anIntArray3387;
    private static int[] anIntArray3388;
    private static int[][] anIntArrayArray3389;
    private static int[] anIntArray3390;
    private static int[] anIntArray3391;

    final void method77(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_)
    {
        try
        {
            if (!((SpriteFactory) this).aBoolean3347)
                method101();
            int i_6_ = Class62.anInt1164;
            int i_7_ = Class62.anInt1160;
            int i_8_ = Class62.PRECOMPUTED_SINE_CACHE[i];
            int i_9_ = Class62.PRECOMUPTED_COSINE_CACHE[i];
            int i_10_ = Class62.PRECOMPUTED_SINE_CACHE[i_0_];
            int i_11_ = Class62.PRECOMUPTED_COSINE_CACHE[i_0_];
            int i_12_ = Class62.PRECOMPUTED_SINE_CACHE[i_1_];
            int i_13_ = Class62.PRECOMUPTED_COSINE_CACHE[i_1_];
            int i_14_ = Class62.PRECOMPUTED_SINE_CACHE[i_2_];
            int i_15_ = Class62.PRECOMUPTED_COSINE_CACHE[i_2_];
            int i_16_ = i_4_ * i_14_ + i_5_ * i_15_ >> 16;
            for (int i_17_ = 0; i_17_ < ((SpriteFactory) this).anInt3357; i_17_++)
            {
                int i_18_ = ((SpriteFactory) this).anIntArray3356[i_17_];
                int i_19_ = ((SpriteFactory) this).anIntArray3336[i_17_];
                int i_20_ = ((SpriteFactory) this).anIntArray3345[i_17_];
                if (i_1_ != 0)
                {
                    int i_21_ = i_19_ * i_12_ + i_18_ * i_13_ >> 16;
                    i_19_ = i_19_ * i_13_ - i_18_ * i_12_ >> 16;
                    i_18_ = i_21_;
                }
                if (i != 0)
                {
                    int i_22_ = i_19_ * i_9_ - i_20_ * i_8_ >> 16;
                    i_20_ = i_19_ * i_8_ + i_20_ * i_9_ >> 16;
                    i_19_ = i_22_;
                }
                if (i_0_ != 0)
                {
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
                anIntArray3388[i_17_] = i_20_ - i_16_;
                anIntArray3384[i_17_] = i_6_ + (i_18_ << 9) / i_20_;
                anIntArray3370[i_17_] = i_7_ + (i_19_ << 9) / i_20_;
                if (anInt3339 > 0)
                {
                    anIntArray3386[i_17_] = i_18_;
                    anIntArray3382[i_17_] = i_19_;
                    anIntArray3375[i_17_] = i_20_;
                }
            }
            method104(false, false, 0L, aShort3355, aShort3355 << 1);
        } catch (RuntimeException runtimeexception)
        {
            /* empty */
        }
    }

    final int getHeight()
    {
        if (!aBoolean3347)
            method101();
        return height;
    }

    private final boolean method93(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_)
    {
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

    final void calculatePosition(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_)
    {
        try
        {
            if (!((SpriteFactory) this).aBoolean3347)
                method101();
            int i_39_ = Class62.anInt1164;
            int i_40_ = Class62.anInt1160;
            int i_41_ = Class62.PRECOMPUTED_SINE_CACHE[i];
            int i_42_ = Class62.PRECOMUPTED_COSINE_CACHE[i];
            int i_43_ = Class62.PRECOMPUTED_SINE_CACHE[i_32_];
            int i_44_ = Class62.PRECOMUPTED_COSINE_CACHE[i_32_];
            int i_45_ = Class62.PRECOMPUTED_SINE_CACHE[i_33_];
            int i_46_ = Class62.PRECOMUPTED_COSINE_CACHE[i_33_];
            int i_47_ = Class62.PRECOMPUTED_SINE_CACHE[i_34_];
            int i_48_ = Class62.PRECOMUPTED_COSINE_CACHE[i_34_];
            int i_49_ = i_36_ * i_47_ + i_37_ * i_48_ >> 16;
            for (int i_50_ = 0; i_50_ < ((SpriteFactory) this).anInt3357; i_50_++)
            {
                int i_51_ = ((SpriteFactory) this).anIntArray3356[i_50_];
                int i_52_ = ((SpriteFactory) this).anIntArray3336[i_50_];
                int i_53_ = ((SpriteFactory) this).anIntArray3345[i_50_];
                if (i_33_ != 0)
                {
                    int i_54_ = i_52_ * i_45_ + i_51_ * i_46_ >> 16;
                    i_52_ = i_52_ * i_46_ - i_51_ * i_45_ >> 16;
                    i_51_ = i_54_;
                }
                if (i != 0)
                {
                    int i_55_ = i_52_ * i_42_ - i_53_ * i_41_ >> 16;
                    i_53_ = i_52_ * i_41_ + i_53_ * i_42_ >> 16;
                    i_52_ = i_55_;
                }
                if (i_32_ != 0)
                {
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
                anIntArray3388[i_50_] = i_53_ - i_49_;
                anIntArray3384[i_50_] = i_39_ + (i_51_ << 9) / i_38_;
                anIntArray3370[i_50_] = i_40_ + (i_52_ << 9) / i_38_;
                if (anInt3339 > 0)
                {
                    anIntArray3386[i_50_] = i_51_;
                    anIntArray3382[i_50_] = i_52_;
                    anIntArray3375[i_50_] = i_53_;
                }
            }
            method104(false, false, 0L, aShort3355, aShort3355 << 1);
        } catch (RuntimeException runtimeexception)
        {
            /* empty */
        }
    }

    final int method56()
    {
        if (!((SpriteFactory) this).aBoolean3347)
            method101();
        return aShort3344;
    }

    final void render(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, long l)
    {
        if (!((SpriteFactory) this).aBoolean3347)
            method101();
        int i_65_ = i_64_ * i_61_ - i_62_ * i_60_ >> 16;
        int i_66_ = i_63_ * i_58_ + i_65_ * i_59_ >> 16;
        int i_67_ = i_66_ + (aShort3364 * i_59_ + aShort3354 * i_58_ >> 16);
        if (i_67_ > 50)
        {
            int i_68_ = i_66_ + (-aShort3364 * i_59_ + aShort3344 * i_58_ >> 16);
            if (i_68_ < 3500)
            {
                int i_69_ = i_64_ * i_60_ + i_62_ * i_61_ >> 16;
                int i_70_ = i_69_ + aShort3364 << 9;
                if (i_70_ / i_67_ > NPCDefinition.anInt1429)
                {
                    int i_71_ = i_69_ - aShort3364 << 9;
                    if (i_71_ / i_67_ < Class111.anInt1877)
                    {
                        int i_72_ = i_63_ * i_59_ - i_65_ * i_58_ >> 16;
                        int i_73_ = (i_72_ + (aShort3364 * i_58_ + aShort3354 * i_59_ >> 16) << 9);
                        if (i_73_ / i_67_ > Animable.anInt63)
                        {
                            int i_74_ = (i_72_ + ((-aShort3364 * i_58_ + aShort3344 * i_59_) >> 16) << 9);
                            if (i_74_ / i_67_ < Class68_Sub13_Sub38.anInt4081)
                            {
                                boolean bool = false;
                                boolean bool_75_ = i_68_ <= 50;
                                boolean bool_76_ = bool_75_ || anInt3339 > 0;
                                int i_77_ = Class62.anInt1164;
                                int i_78_ = Class62.anInt1160;
                                int i_79_ = 0;
                                int i_80_ = 0;
                                if (i != 0)
                                {
                                    i_79_ = Class62.PRECOMPUTED_SINE_CACHE[i];
                                    i_80_ = Class62.PRECOMUPTED_COSINE_CACHE[i];
                                }
                                boolean bool_81_ = false;
                                if (l > 0L && Class68_Sub19.aBoolean3072 && i_68_ > 0)
                                {
                                    int i_82_;
                                    int i_83_;
                                    if (i_69_ > 0)
                                    {
                                        i_82_ = i_71_ / i_67_;
                                        i_83_ = i_70_ / i_68_;
                                    } else
                                    {
                                        i_82_ = i_71_ / i_68_;
                                        i_83_ = i_70_ / i_67_;
                                    }
                                    int i_84_;
                                    int i_85_;
                                    if (i_72_ > 0)
                                    {
                                        i_84_ = i_74_ / i_67_;
                                        i_85_ = i_73_ / i_68_;
                                    } else
                                    {
                                        i_84_ = i_74_ / i_68_;
                                        i_85_ = i_73_ / i_67_;
                                    }
                                    if (Class68_Sub9.anInt2888 >= i_82_ && Class68_Sub9.anInt2888 <= i_83_ && Class51.anInt2258 >= i_84_ && Class51.anInt2258 <= i_85_)
                                    {
                                        i_82_ = 999999;
                                        i_83_ = -999999;
                                        i_84_ = 999999;
                                        i_85_ = -999999;
                                        int[] is = (new int[] { aShort3352, aShort3349, aShort3352, aShort3349, aShort3352, aShort3349, aShort3352, aShort3349 });
                                        int[] is_86_ = (new int[] { aShort3343, aShort3343, height, height, aShort3343, aShort3343, height, height });
                                        int[] is_87_ = (new int[] { aShort3344, aShort3344, aShort3344, aShort3344, aShort3354, aShort3354, aShort3354, aShort3354 });
                                        for (int i_88_ = 0; i_88_ < 8; i_88_++)
                                        {
                                            int i_89_ = is[i_88_];
                                            int i_90_ = is_87_[i_88_];
                                            int i_91_ = is_86_[i_88_];
                                            if (i != 0)
                                            {
                                                int i_92_ = ((i_91_ * i_79_ + i_89_ * i_80_) >> 16);
                                                i_91_ = (i_91_ * i_80_ - i_89_ * i_79_) >> 16;
                                                i_89_ = i_92_;
                                            }
                                            i_89_ += i_62_;
                                            i_90_ += i_63_;
                                            i_91_ += i_64_;
                                            int i_93_ = ((i_91_ * i_60_ + i_89_ * i_61_) >> 16);
                                            i_91_ = (i_91_ * i_61_ - i_89_ * i_60_) >> 16;
                                            i_89_ = i_93_;
                                            i_93_ = (i_90_ * i_59_ - i_91_ * i_58_) >> 16;
                                            i_91_ = (i_90_ * i_58_ + i_91_ * i_59_) >> 16;
                                            i_90_ = i_93_;
                                            if (i_91_ > 0)
                                            {
                                                int i_94_ = (i_89_ << 9) / i_91_;
                                                int i_95_ = (i_90_ << 9) / i_91_;
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
                                        if (Class68_Sub9.anInt2888 >= i_82_ && Class68_Sub9.anInt2888 <= i_83_ && Class51.anInt2258 >= i_84_ && Class51.anInt2258 <= i_85_)
                                        {
                                            if (((Model) this).aBoolean2445)
                                                Class68_Sub20_Sub15.aLongArray4391[Class68_Sub13_Sub1.anInt3450++] = l;
                                            else
                                                bool_81_ = true;
                                        }
                                    }
                                }
                                for (int i_96_ = 0; (i_96_ < ((SpriteFactory) this).anInt3357); i_96_++)
                                {
                                    int i_97_ = (((SpriteFactory) this).anIntArray3356[i_96_]);
                                    int i_98_ = (((SpriteFactory) this).anIntArray3336[i_96_]);
                                    int i_99_ = (((SpriteFactory) this).anIntArray3345[i_96_]);
                                    if (i != 0)
                                    {
                                        int i_100_ = (i_99_ * i_79_ + i_97_ * i_80_ >> 16);
                                        i_99_ = (i_99_ * i_80_ - i_97_ * i_79_ >> 16);
                                        i_97_ = i_100_;
                                    }
                                    i_97_ += i_62_;
                                    i_98_ += i_63_;
                                    i_99_ += i_64_;
                                    int i_101_ = i_99_ * i_60_ + i_97_ * i_61_ >> 16;
                                    i_99_ = i_99_ * i_61_ - i_97_ * i_60_ >> 16;
                                    i_97_ = i_101_;
                                    i_101_ = i_98_ * i_59_ - i_99_ * i_58_ >> 16;
                                    i_99_ = i_98_ * i_58_ + i_99_ * i_59_ >> 16;
                                    i_98_ = i_101_;
                                    anIntArray3388[i_96_] = i_99_ - i_66_;
                                    if (i_99_ >= 50)
                                    {
                                        anIntArray3384[i_96_] = i_77_ + (i_97_ << 9) / i_99_;
                                        anIntArray3370[i_96_] = i_78_ + (i_98_ << 9) / i_99_;
                                    } else
                                    {
                                        anIntArray3384[i_96_] = -5000;
                                        bool = true;
                                    }
                                    if (bool_76_)
                                    {
                                        anIntArray3386[i_96_] = i_97_;
                                        anIntArray3382[i_96_] = i_98_;
                                        anIntArray3375[i_96_] = i_99_;
                                    }
                                }
                                try
                                {
                                    method104(bool, bool_81_, l, i_66_ - i_68_, i_67_ - i_68_ + 2);
                                } catch (Exception exception)
                                {
                                    /* empty */
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void method95(int i, int i_102_, int i_103_, int i_104_)
    {
        if (i == 0)
        {
            int i_105_ = 0;
            anInt3379 = 0;
            anInt3378 = 0;
            anInt3371 = 0;
            for (int i_106_ = 0; i_106_ < ((SpriteFactory) this).anInt3357; i_106_++)
            {
                anInt3379 += ((SpriteFactory) this).anIntArray3356[i_106_];
                anInt3378 += ((SpriteFactory) this).anIntArray3336[i_106_];
                anInt3371 += ((SpriteFactory) this).anIntArray3345[i_106_];
                i_105_++;
            }
            if (i_105_ > 0)
            {
                anInt3379 = anInt3379 / i_105_ + i_102_;
                anInt3378 = anInt3378 / i_105_ + i_103_;
                anInt3371 = anInt3371 / i_105_ + i_104_;
            } else
            {
                anInt3379 = i_102_;
                anInt3378 = i_103_;
                anInt3371 = i_104_;
            }
        } else if (i == 1)
        {
            for (int i_107_ = 0; i_107_ < ((SpriteFactory) this).anInt3357; i_107_++)
            {
                ((SpriteFactory) this).anIntArray3356[i_107_] += i_102_;
                ((SpriteFactory) this).anIntArray3336[i_107_] += i_103_;
                ((SpriteFactory) this).anIntArray3345[i_107_] += i_104_;
            }
        } else if (i == 2)
        {
            for (int i_108_ = 0; i_108_ < ((SpriteFactory) this).anInt3357; i_108_++)
            {
                ((SpriteFactory) this).anIntArray3356[i_108_] -= anInt3379;
                ((SpriteFactory) this).anIntArray3336[i_108_] -= anInt3378;
                ((SpriteFactory) this).anIntArray3345[i_108_] -= anInt3371;
                if (i_104_ != 0)
                {
                    int i_109_ = Class62.PRECOMPUTED_SINE_CACHE[i_104_];
                    int i_110_ = Class62.PRECOMUPTED_COSINE_CACHE[i_104_];
                    int i_111_ = (((((SpriteFactory) this).anIntArray3336[i_108_] * i_109_) + (((SpriteFactory) this).anIntArray3356[i_108_] * i_110_) + 32767) >> 16);
                    ((SpriteFactory) this).anIntArray3336[i_108_] = ((((SpriteFactory) this).anIntArray3336[i_108_] * i_110_) - (((SpriteFactory) this).anIntArray3356[i_108_] * i_109_) + 32767) >> 16;
                    ((SpriteFactory) this).anIntArray3356[i_108_] = i_111_;
                }
                if (i_102_ != 0)
                {
                    int i_112_ = Class62.PRECOMPUTED_SINE_CACHE[i_102_];
                    int i_113_ = Class62.PRECOMUPTED_COSINE_CACHE[i_102_];
                    int i_114_ = (((((SpriteFactory) this).anIntArray3336[i_108_] * i_113_) - (((SpriteFactory) this).anIntArray3345[i_108_] * i_112_) + 32767) >> 16);
                    ((SpriteFactory) this).anIntArray3345[i_108_] = ((((SpriteFactory) this).anIntArray3336[i_108_] * i_112_) + (((SpriteFactory) this).anIntArray3345[i_108_] * i_113_) + 32767) >> 16;
                    ((SpriteFactory) this).anIntArray3336[i_108_] = i_114_;
                }
                if (i_103_ != 0)
                {
                    int i_115_ = Class62.PRECOMPUTED_SINE_CACHE[i_103_];
                    int i_116_ = Class62.PRECOMUPTED_COSINE_CACHE[i_103_];
                    int i_117_ = (((((SpriteFactory) this).anIntArray3345[i_108_] * i_115_) + (((SpriteFactory) this).anIntArray3356[i_108_] * i_116_) + 32767) >> 16);
                    ((SpriteFactory) this).anIntArray3345[i_108_] = ((((SpriteFactory) this).anIntArray3345[i_108_] * i_116_) - (((SpriteFactory) this).anIntArray3356[i_108_] * i_115_) + 32767) >> 16;
                    ((SpriteFactory) this).anIntArray3356[i_108_] = i_117_;
                }
                ((SpriteFactory) this).anIntArray3356[i_108_] += anInt3379;
                ((SpriteFactory) this).anIntArray3336[i_108_] += anInt3378;
                ((SpriteFactory) this).anIntArray3345[i_108_] += anInt3371;
            }
        } else if (i == 3)
        {
            for (int i_118_ = 0; i_118_ < ((SpriteFactory) this).anInt3357; i_118_++)
            {
                ((SpriteFactory) this).anIntArray3356[i_118_] -= anInt3379;
                ((SpriteFactory) this).anIntArray3336[i_118_] -= anInt3378;
                ((SpriteFactory) this).anIntArray3345[i_118_] -= anInt3371;
                ((SpriteFactory) this).anIntArray3356[i_118_] = (((SpriteFactory) this).anIntArray3356[i_118_] * i_102_ / 128);
                ((SpriteFactory) this).anIntArray3336[i_118_] = (((SpriteFactory) this).anIntArray3336[i_118_] * i_103_ / 128);
                ((SpriteFactory) this).anIntArray3345[i_118_] = (((SpriteFactory) this).anIntArray3345[i_118_] * i_104_ / 128);
                ((SpriteFactory) this).anIntArray3356[i_118_] += anInt3379;
                ((SpriteFactory) this).anIntArray3336[i_118_] += anInt3378;
                ((SpriteFactory) this).anIntArray3345[i_118_] += anInt3371;
            }
        } else if (i == 5)
        {
            for (int i_119_ = 0; i_119_ < anInt3358; i_119_++)
            {
                int i_120_ = (aByteArray3351[i_119_] & 0xff) + i_102_ * 8;
                if (i_120_ < 0)
                    i_120_ = 0;
                else if (i_120_ > 255)
                    i_120_ = 255;
                aByteArray3351[i_119_] = (byte) i_120_;
            }
        }
    }

    final void method72(int i, int i_121_, int i_122_)
    {
        for (int i_123_ = 0; i_123_ < ((SpriteFactory) this).anInt3357; i_123_++)
        {
            ((SpriteFactory) this).anIntArray3356[i_123_] = ((SpriteFactory) this).anIntArray3356[i_123_] * i / 128;
            ((SpriteFactory) this).anIntArray3336[i_123_] = (((SpriteFactory) this).anIntArray3336[i_123_] * i_121_ / 128);
            ((SpriteFactory) this).anIntArray3345[i_123_] = (((SpriteFactory) this).anIntArray3345[i_123_] * i_122_ / 128);
        }
        ((SpriteFactory) this).aBoolean3347 = false;
    }

    final int method79()
    {
        if (!((SpriteFactory) this).aBoolean3347)
            method101();
        return aShort3364;
    }

    public static void method96()
    {
        aClass1_Sub3_Sub1_3365 = null;
        aByteArray3369 = null;
        aClass1_Sub3_Sub1_3367 = null;
        aByteArray3372 = null;
        aBooleanArray3377 = null;
        aBooleanArray3383 = null;
        anIntArray3384 = null;
        anIntArray3370 = null;
        anIntArray3388 = null;
        anIntArray3386 = null;
        anIntArray3382 = null;
        anIntArray3375 = null;
        anIntArray3391 = null;
        anIntArrayArray3389 = null;
        anIntArray3390 = null;
        anIntArrayArray3381 = null;
        anIntArray3376 = null;
        anIntArray3385 = null;
        anIntArray3373 = null;
        anIntArray3374 = null;
        anIntArray3387 = null;
        anIntArray3380 = null;
    }

    private final void method97(int i, int[] is, int i_124_, int i_125_, int i_126_)
    {
        int i_127_ = is.length;
        if (i == 0)
        {
            int i_128_ = 0;
            anInt3379 = 0;
            anInt3378 = 0;
            anInt3371 = 0;
            for (int i_129_ = 0; i_129_ < i_127_; i_129_++)
            {
                int i_130_ = is[i_129_];
                if (i_130_ < anIntArrayArray3361.length)
                {
                    int[] is_131_ = anIntArrayArray3361[i_130_];
                    for (int i_132_ = 0; i_132_ < is_131_.length; i_132_++)
                    {
                        int i_133_ = is_131_[i_132_];
                        anInt3379 += (((SpriteFactory) this).anIntArray3356[i_133_]);
                        anInt3378 += (((SpriteFactory) this).anIntArray3336[i_133_]);
                        anInt3371 += (((SpriteFactory) this).anIntArray3345[i_133_]);
                        i_128_++;
                    }
                }
            }
            if (i_128_ > 0)
            {
                anInt3379 = anInt3379 / i_128_ + i_124_;
                anInt3378 = anInt3378 / i_128_ + i_125_;
                anInt3371 = anInt3371 / i_128_ + i_126_;
            } else
            {
                anInt3379 = i_124_;
                anInt3378 = i_125_;
                anInt3371 = i_126_;
            }
        } else if (i == 1)
        {
            for (int i_134_ = 0; i_134_ < i_127_; i_134_++)
            {
                int i_135_ = is[i_134_];
                if (i_135_ < anIntArrayArray3361.length)
                {
                    int[] is_136_ = anIntArrayArray3361[i_135_];
                    for (int i_137_ = 0; i_137_ < is_136_.length; i_137_++)
                    {
                        int i_138_ = is_136_[i_137_];
                        ((SpriteFactory) this).anIntArray3356[i_138_] += i_124_;
                        ((SpriteFactory) this).anIntArray3336[i_138_] += i_125_;
                        ((SpriteFactory) this).anIntArray3345[i_138_] += i_126_;
                    }
                }
            }
        } else if (i == 2)
        {
            for (int i_139_ = 0; i_139_ < i_127_; i_139_++)
            {
                int i_140_ = is[i_139_];
                if (i_140_ < anIntArrayArray3361.length)
                {
                    int[] is_141_ = anIntArrayArray3361[i_140_];
                    for (int i_142_ = 0; i_142_ < is_141_.length; i_142_++)
                    {
                        int i_143_ = is_141_[i_142_];
                        ((SpriteFactory) this).anIntArray3356[i_143_] -= anInt3379;
                        ((SpriteFactory) this).anIntArray3336[i_143_] -= anInt3378;
                        ((SpriteFactory) this).anIntArray3345[i_143_] -= anInt3371;
                        if (i_126_ != 0)
                        {
                            int i_144_ = Class62.PRECOMPUTED_SINE_CACHE[i_126_];
                            int i_145_ = Class62.PRECOMUPTED_COSINE_CACHE[i_126_];
                            int i_146_ = (((((SpriteFactory) this).anIntArray3336[i_143_]) * i_144_ + (((SpriteFactory) this).anIntArray3356[i_143_]) * i_145_ + 32767) >> 16);
                            ((SpriteFactory) this).anIntArray3336[i_143_] = ((((SpriteFactory) this).anIntArray3336[i_143_]) * i_145_ - (((SpriteFactory) this).anIntArray3356[i_143_]) * i_144_ + 32767) >> 16;
                            ((SpriteFactory) this).anIntArray3356[i_143_] = i_146_;
                        }
                        if (i_124_ != 0)
                        {
                            int i_147_ = Class62.PRECOMPUTED_SINE_CACHE[i_124_];
                            int i_148_ = Class62.PRECOMUPTED_COSINE_CACHE[i_124_];
                            int i_149_ = (((((SpriteFactory) this).anIntArray3336[i_143_]) * i_148_ - (((SpriteFactory) this).anIntArray3345[i_143_]) * i_147_ + 32767) >> 16);
                            ((SpriteFactory) this).anIntArray3345[i_143_] = ((((SpriteFactory) this).anIntArray3336[i_143_]) * i_147_ + (((SpriteFactory) this).anIntArray3345[i_143_]) * i_148_ + 32767) >> 16;
                            ((SpriteFactory) this).anIntArray3336[i_143_] = i_149_;
                        }
                        if (i_125_ != 0)
                        {
                            int i_150_ = Class62.PRECOMPUTED_SINE_CACHE[i_125_];
                            int i_151_ = Class62.PRECOMUPTED_COSINE_CACHE[i_125_];
                            int i_152_ = (((((SpriteFactory) this).anIntArray3345[i_143_]) * i_150_ + (((SpriteFactory) this).anIntArray3356[i_143_]) * i_151_ + 32767) >> 16);
                            ((SpriteFactory) this).anIntArray3345[i_143_] = ((((SpriteFactory) this).anIntArray3345[i_143_]) * i_151_ - (((SpriteFactory) this).anIntArray3356[i_143_]) * i_150_ + 32767) >> 16;
                            ((SpriteFactory) this).anIntArray3356[i_143_] = i_152_;
                        }
                        ((SpriteFactory) this).anIntArray3356[i_143_] += anInt3379;
                        ((SpriteFactory) this).anIntArray3336[i_143_] += anInt3378;
                        ((SpriteFactory) this).anIntArray3345[i_143_] += anInt3371;
                    }
                }
            }
        } else if (i == 3)
        {
            for (int i_153_ = 0; i_153_ < i_127_; i_153_++)
            {
                int i_154_ = is[i_153_];
                if (i_154_ < anIntArrayArray3361.length)
                {
                    int[] is_155_ = anIntArrayArray3361[i_154_];
                    for (int i_156_ = 0; i_156_ < is_155_.length; i_156_++)
                    {
                        int i_157_ = is_155_[i_156_];
                        ((SpriteFactory) this).anIntArray3356[i_157_] -= anInt3379;
                        ((SpriteFactory) this).anIntArray3336[i_157_] -= anInt3378;
                        ((SpriteFactory) this).anIntArray3345[i_157_] -= anInt3371;
                        ((SpriteFactory) this).anIntArray3356[i_157_] = (((SpriteFactory) this).anIntArray3356[i_157_] * i_124_ / 128);
                        ((SpriteFactory) this).anIntArray3336[i_157_] = (((SpriteFactory) this).anIntArray3336[i_157_] * i_125_ / 128);
                        ((SpriteFactory) this).anIntArray3345[i_157_] = (((SpriteFactory) this).anIntArray3345[i_157_] * i_126_ / 128);
                        ((SpriteFactory) this).anIntArray3356[i_157_] += anInt3379;
                        ((SpriteFactory) this).anIntArray3336[i_157_] += anInt3378;
                        ((SpriteFactory) this).anIntArray3345[i_157_] += anInt3371;
                    }
                }
            }
        } else if (i == 5)
        {
            if (anIntArrayArray3342 != null && aByteArray3351 != null)
            {
                for (int i_158_ = 0; i_158_ < i_127_; i_158_++)
                {
                    int i_159_ = is[i_158_];
                    if (i_159_ < anIntArrayArray3342.length)
                    {
                        int[] is_160_ = anIntArrayArray3342[i_159_];
                        for (int i_161_ = 0; i_161_ < is_160_.length; i_161_++)
                        {
                            int i_162_ = is_160_[i_161_];
                            int i_163_ = (aByteArray3351[i_162_] & 0xff) + i_124_ * 8;
                            if (i_163_ < 0)
                                i_163_ = 0;
                            else if (i_163_ > 255)
                                i_163_ = 255;
                            aByteArray3351[i_162_] = (byte) i_163_;
                        }
                    }
                }
            }
        }
    }

    final void method92(int i, int i_164_, int i_165_)
    {
        for (int i_166_ = 0; i_166_ < ((SpriteFactory) this).anInt3357; i_166_++)
        {
            ((SpriteFactory) this).anIntArray3356[i_166_] += i;
            ((SpriteFactory) this).anIntArray3336[i_166_] += i_164_;
            ((SpriteFactory) this).anIntArray3345[i_166_] += i_165_;
        }
        ((SpriteFactory) this).aBoolean3347 = false;
    }

    private final Model method98(boolean bool, SpriteFactory class1_sub3_sub1_167_, byte[] is)
    {
        ((SpriteFactory) class1_sub3_sub1_167_).anInt3357 = ((SpriteFactory) this).anInt3357;
        class1_sub3_sub1_167_.anInt3358 = anInt3358;
        class1_sub3_sub1_167_.anInt3339 = anInt3339;
        if (((SpriteFactory) class1_sub3_sub1_167_).anIntArray3356 == null || ((((SpriteFactory) class1_sub3_sub1_167_).anIntArray3356).length < ((SpriteFactory) this).anInt3357))
        {
            ((SpriteFactory) class1_sub3_sub1_167_).anIntArray3356 = new int[((SpriteFactory) this).anInt3357 + 100];
            ((SpriteFactory) class1_sub3_sub1_167_).anIntArray3336 = new int[((SpriteFactory) this).anInt3357 + 100];
            ((SpriteFactory) class1_sub3_sub1_167_).anIntArray3345 = new int[((SpriteFactory) this).anInt3357 + 100];
        }
        for (int i = 0; i < ((SpriteFactory) this).anInt3357; i++)
        {
            ((SpriteFactory) class1_sub3_sub1_167_).anIntArray3356[i] = ((SpriteFactory) this).anIntArray3356[i];
            ((SpriteFactory) class1_sub3_sub1_167_).anIntArray3336[i] = ((SpriteFactory) this).anIntArray3336[i];
            ((SpriteFactory) class1_sub3_sub1_167_).anIntArray3345[i] = ((SpriteFactory) this).anIntArray3345[i];
        }
        if (bool)
            class1_sub3_sub1_167_.aByteArray3351 = aByteArray3351;
        else
        {
            class1_sub3_sub1_167_.aByteArray3351 = is;
            if (aByteArray3351 == null)
            {
                for (int i = 0; i < anInt3358; i++)
                    class1_sub3_sub1_167_.aByteArray3351[i] = (byte) 0;
            } else
            {
                for (int i = 0; i < anInt3358; i++)
                    class1_sub3_sub1_167_.aByteArray3351[i] = aByteArray3351[i];
            }
        }
        class1_sub3_sub1_167_.anIntArray3363 = anIntArray3363;
        class1_sub3_sub1_167_.anIntArray3338 = anIntArray3338;
        class1_sub3_sub1_167_.anIntArray3366 = anIntArray3366;
        class1_sub3_sub1_167_.anIntArray3353 = anIntArray3353;
        class1_sub3_sub1_167_.anIntArray3368 = anIntArray3368;
        class1_sub3_sub1_167_.anIntArray3341 = anIntArray3341;
        class1_sub3_sub1_167_.aByteArray3346 = aByteArray3346;
        class1_sub3_sub1_167_.aByteArray3337 = aByteArray3337;
        class1_sub3_sub1_167_.aShortArray3350 = aShortArray3350;
        class1_sub3_sub1_167_.aByte3362 = aByte3362;
        class1_sub3_sub1_167_.anIntArray3359 = anIntArray3359;
        class1_sub3_sub1_167_.anIntArray3340 = anIntArray3340;
        class1_sub3_sub1_167_.anIntArray3360 = anIntArray3360;
        class1_sub3_sub1_167_.anIntArrayArray3361 = anIntArrayArray3361;
        class1_sub3_sub1_167_.anIntArrayArray3342 = anIntArrayArray3342;
        ((Model) class1_sub3_sub1_167_).aBoolean2445 = ((Model) this).aBoolean2445;
        ((SpriteFactory) class1_sub3_sub1_167_).aBoolean3347 = false;
        return class1_sub3_sub1_167_;
    }

    private final void method99(int i)
    {
        int i_168_ = Class62.anInt1164;
        int i_169_ = Class62.anInt1160;
        int i_170_ = 0;
        int i_171_ = anIntArray3363[i];
        int i_172_ = anIntArray3338[i];
        int i_173_ = anIntArray3366[i];
        int i_174_ = anIntArray3375[i_171_];
        int i_175_ = anIntArray3375[i_172_];
        int i_176_ = anIntArray3375[i_173_];
        if (aByteArray3351 == null)
            Class62.anInt1153 = 0;
        else
            Class62.anInt1153 = aByteArray3351[i] & 0xff;
        if (i_174_ >= 50)
        {
            anIntArray3374[i_170_] = anIntArray3384[i_171_];
            anIntArray3387[i_170_] = anIntArray3370[i_171_];
            anIntArray3380[i_170_++] = anIntArray3353[i];
        } else
        {
            int i_177_ = anIntArray3386[i_171_];
            int i_178_ = anIntArray3382[i_171_];
            int i_179_ = anIntArray3353[i];
            if (i_176_ >= 50)
            {
                int i_180_ = (50 - i_174_) * Class62.anIntArray1154[i_176_ - i_174_];
                anIntArray3374[i_170_] = (i_168_ + (i_177_ + ((anIntArray3386[i_173_] - i_177_) * i_180_ >> 16) << 9) / 50);
                anIntArray3387[i_170_] = (i_169_ + (i_178_ + ((anIntArray3382[i_173_] - i_178_) * i_180_ >> 16) << 9) / 50);
                anIntArray3380[i_170_++] = i_179_ + ((anIntArray3341[i] - i_179_) * i_180_ >> 16);
            }
            if (i_175_ >= 50)
            {
                int i_181_ = (50 - i_174_) * Class62.anIntArray1154[i_175_ - i_174_];
                anIntArray3374[i_170_] = (i_168_ + (i_177_ + ((anIntArray3386[i_172_] - i_177_) * i_181_ >> 16) << 9) / 50);
                anIntArray3387[i_170_] = (i_169_ + (i_178_ + ((anIntArray3382[i_172_] - i_178_) * i_181_ >> 16) << 9) / 50);
                anIntArray3380[i_170_++] = i_179_ + ((anIntArray3368[i] - i_179_) * i_181_ >> 16);
            }
        }
        if (i_175_ >= 50)
        {
            anIntArray3374[i_170_] = anIntArray3384[i_172_];
            anIntArray3387[i_170_] = anIntArray3370[i_172_];
            anIntArray3380[i_170_++] = anIntArray3368[i];
        } else
        {
            int i_182_ = anIntArray3386[i_172_];
            int i_183_ = anIntArray3382[i_172_];
            int i_184_ = anIntArray3368[i];
            if (i_174_ >= 50)
            {
                int i_185_ = (50 - i_175_) * Class62.anIntArray1154[i_174_ - i_175_];
                anIntArray3374[i_170_] = (i_168_ + (i_182_ + ((anIntArray3386[i_171_] - i_182_) * i_185_ >> 16) << 9) / 50);
                anIntArray3387[i_170_] = (i_169_ + (i_183_ + ((anIntArray3382[i_171_] - i_183_) * i_185_ >> 16) << 9) / 50);
                anIntArray3380[i_170_++] = i_184_ + ((anIntArray3353[i] - i_184_) * i_185_ >> 16);
            }
            if (i_176_ >= 50)
            {
                int i_186_ = (50 - i_175_) * Class62.anIntArray1154[i_176_ - i_175_];
                anIntArray3374[i_170_] = (i_168_ + (i_182_ + ((anIntArray3386[i_173_] - i_182_) * i_186_ >> 16) << 9) / 50);
                anIntArray3387[i_170_] = (i_169_ + (i_183_ + ((anIntArray3382[i_173_] - i_183_) * i_186_ >> 16) << 9) / 50);
                anIntArray3380[i_170_++] = i_184_ + ((anIntArray3341[i] - i_184_) * i_186_ >> 16);
            }
        }
        if (i_176_ >= 50)
        {
            anIntArray3374[i_170_] = anIntArray3384[i_173_];
            anIntArray3387[i_170_] = anIntArray3370[i_173_];
            anIntArray3380[i_170_++] = anIntArray3341[i];
        } else
        {
            int i_187_ = anIntArray3386[i_173_];
            int i_188_ = anIntArray3382[i_173_];
            int i_189_ = anIntArray3341[i];
            if (i_175_ >= 50)
            {
                int i_190_ = (50 - i_176_) * Class62.anIntArray1154[i_175_ - i_176_];
                anIntArray3374[i_170_] = (i_168_ + (i_187_ + ((anIntArray3386[i_172_] - i_187_) * i_190_ >> 16) << 9) / 50);
                anIntArray3387[i_170_] = (i_169_ + (i_188_ + ((anIntArray3382[i_172_] - i_188_) * i_190_ >> 16) << 9) / 50);
                anIntArray3380[i_170_++] = i_189_ + ((anIntArray3368[i] - i_189_) * i_190_ >> 16);
            }
            if (i_174_ >= 50)
            {
                int i_191_ = (50 - i_176_) * Class62.anIntArray1154[i_174_ - i_176_];
                anIntArray3374[i_170_] = (i_168_ + (i_187_ + ((anIntArray3386[i_171_] - i_187_) * i_191_ >> 16) << 9) / 50);
                anIntArray3387[i_170_] = (i_169_ + (i_188_ + ((anIntArray3382[i_171_] - i_188_) * i_191_ >> 16) << 9) / 50);
                anIntArray3380[i_170_++] = i_189_ + ((anIntArray3353[i] - i_189_) * i_191_ >> 16);
            }
        }
        int i_192_ = anIntArray3374[0];
        int i_193_ = anIntArray3374[1];
        int i_194_ = anIntArray3374[2];
        int i_195_ = anIntArray3387[0];
        int i_196_ = anIntArray3387[1];
        int i_197_ = anIntArray3387[2];
        Class62.aBoolean1157 = false;
        if (i_170_ == 3)
        {
            if (i_192_ < 0 || i_193_ < 0 || i_194_ < 0 || i_192_ > Class62.anInt1168 || i_193_ > Class62.anInt1168 || i_194_ > Class62.anInt1168)
                Class62.aBoolean1157 = true;
            if (aShortArray3350 == null || aShortArray3350[i] == -1)
            {
                if (anIntArray3341[i] == -1)
                    Class62.method610(i_195_, i_196_, i_197_, i_192_, i_193_, i_194_, (Class62.anIntArray1158[anIntArray3353[i]]));
                else
                    Class62.method617(i_195_, i_196_, i_197_, i_192_, i_193_, i_194_, anIntArray3380[0], anIntArray3380[1], anIntArray3380[2]);
            } else
            {
                int i_198_;
                int i_199_;
                int i_200_;
                if (aByteArray3337 != null && aByteArray3337[i] != -1)
                {
                    int i_201_ = aByteArray3337[i] & 0xff;
                    i_198_ = anIntArray3359[i_201_];
                    i_199_ = anIntArray3340[i_201_];
                    i_200_ = anIntArray3360[i_201_];
                } else
                {
                    i_198_ = i_171_;
                    i_199_ = i_172_;
                    i_200_ = i_173_;
                }
                if (anIntArray3341[i] == -1)
                    Class62.method616(i_195_, i_196_, i_197_, i_192_, i_193_, i_194_, anIntArray3353[i], anIntArray3353[i], anIntArray3353[i], anIntArray3386[i_198_], anIntArray3386[i_199_], anIntArray3386[i_200_], anIntArray3382[i_198_], anIntArray3382[i_199_], anIntArray3382[i_200_], anIntArray3375[i_198_], anIntArray3375[i_199_], anIntArray3375[i_200_], aShortArray3350[i]);
                else
                    Class62.method616(i_195_, i_196_, i_197_, i_192_, i_193_, i_194_, anIntArray3380[0], anIntArray3380[1], anIntArray3380[2], anIntArray3386[i_198_], anIntArray3386[i_199_], anIntArray3386[i_200_], anIntArray3382[i_198_], anIntArray3382[i_199_], anIntArray3382[i_200_], anIntArray3375[i_198_], anIntArray3375[i_199_], anIntArray3375[i_200_], aShortArray3350[i]);
            }
        }
        if (i_170_ == 4)
        {
            if (i_192_ < 0 || i_193_ < 0 || i_194_ < 0 || i_192_ > Class62.anInt1168 || i_193_ > Class62.anInt1168 || i_194_ > Class62.anInt1168 || anIntArray3374[3] < 0 || anIntArray3374[3] > Class62.anInt1168)
                Class62.aBoolean1157 = true;
            if (aShortArray3350 == null || aShortArray3350[i] == -1)
            {
                if (anIntArray3341[i] == -1)
                {
                    int i_202_ = Class62.anIntArray1158[anIntArray3353[i]];
                    Class62.method610(i_195_, i_196_, i_197_, i_192_, i_193_, i_194_, i_202_);
                    Class62.method610(i_195_, i_197_, anIntArray3387[3], i_192_, i_194_, anIntArray3374[3], i_202_);
                } else
                {
                    Class62.method617(i_195_, i_196_, i_197_, i_192_, i_193_, i_194_, anIntArray3380[0], anIntArray3380[1], anIntArray3380[2]);
                    Class62.method617(i_195_, i_197_, anIntArray3387[3], i_192_, i_194_, anIntArray3374[3], anIntArray3380[0], anIntArray3380[2], anIntArray3380[3]);
                }
            } else
            {
                int i_203_;
                int i_204_;
                int i_205_;
                if (aByteArray3337 != null && aByteArray3337[i] != -1)
                {
                    int i_206_ = aByteArray3337[i] & 0xff;
                    i_203_ = anIntArray3359[i_206_];
                    i_204_ = anIntArray3340[i_206_];
                    i_205_ = anIntArray3360[i_206_];
                } else
                {
                    i_203_ = i_171_;
                    i_204_ = i_172_;
                    i_205_ = i_173_;
                }
                short i_207_ = aShortArray3350[i];
                if (anIntArray3341[i] == -1)
                {
                    Class62.method616(i_195_, i_196_, i_197_, i_192_, i_193_, i_194_, anIntArray3353[i], anIntArray3353[i], anIntArray3353[i], anIntArray3386[i_203_], anIntArray3386[i_204_], anIntArray3386[i_205_], anIntArray3382[i_203_], anIntArray3382[i_204_], anIntArray3382[i_205_], anIntArray3375[i_203_], anIntArray3375[i_204_], anIntArray3375[i_205_], i_207_);
                    Class62.method616(i_195_, i_197_, anIntArray3387[3], i_192_, i_194_, anIntArray3374[3], anIntArray3353[i], anIntArray3353[i], anIntArray3353[i], anIntArray3386[i_203_], anIntArray3386[i_204_], anIntArray3386[i_205_], anIntArray3382[i_203_], anIntArray3382[i_204_], anIntArray3382[i_205_], anIntArray3375[i_203_], anIntArray3375[i_204_], anIntArray3375[i_205_], i_207_);
                } else
                {
                    Class62.method616(i_195_, i_196_, i_197_, i_192_, i_193_, i_194_, anIntArray3380[0], anIntArray3380[1], anIntArray3380[2], anIntArray3386[i_203_], anIntArray3386[i_204_], anIntArray3386[i_205_], anIntArray3382[i_203_], anIntArray3382[i_204_], anIntArray3382[i_205_], anIntArray3375[i_203_], anIntArray3375[i_204_], anIntArray3375[i_205_], i_207_);
                    Class62.method616(i_195_, i_197_, anIntArray3387[3], i_192_, i_194_, anIntArray3374[3], anIntArray3380[0], anIntArray3380[2], anIntArray3380[3], anIntArray3386[i_203_], anIntArray3386[i_204_], anIntArray3386[i_205_], anIntArray3382[i_203_], anIntArray3382[i_204_], anIntArray3382[i_205_], anIntArray3375[i_203_], anIntArray3375[i_204_], anIntArray3375[i_205_], i_207_);
                }
            }
        }
    }

    final SpriteFactory method100(int i, int i_208_, int[][] is, int[][] is_209_, int i_210_, int i_211_, int i_212_, boolean bool)
    {
        if (!((SpriteFactory) this).aBoolean3347)
            method101();
        int i_213_ = i_210_ + aShort3352;
        int i_214_ = i_210_ + aShort3349;
        int i_215_ = i_212_ + aShort3343;
        int i_216_ = i_212_ + height;
        if ((i == 1 || i == 2 || i == 3 || i == 5) && (i_213_ < 0 || i_214_ + 128 >> 7 >= is.length || i_215_ < 0 || i_216_ + 128 >> 7 >= is[0].length))
            return this;
        if (i == 4 || i == 5)
        {
            if (is_209_ == null)
                return this;
            if (i_213_ < 0 || i_214_ + 128 >> 7 >= is_209_.length || i_215_ < 0 || i_216_ + 128 >> 7 >= is_209_[0].length)
                return this;
        } else
        {
            i_213_ >>= 7;
            i_214_ = i_214_ + 127 >> 7;
            i_215_ >>= 7;
            i_216_ = i_216_ + 127 >> 7;
            if (is[i_213_][i_215_] == i_211_ && is[i_214_][i_215_] == i_211_ && is[i_213_][i_216_] == i_211_ && is[i_214_][i_216_] == i_211_)
                return this;
        }
        SpriteFactory class1_sub3_sub1_217_;
        if (bool)
        {
            class1_sub3_sub1_217_ = new SpriteFactory();
            ((SpriteFactory) class1_sub3_sub1_217_).anInt3357 = ((SpriteFactory) this).anInt3357;
            class1_sub3_sub1_217_.anInt3358 = anInt3358;
            class1_sub3_sub1_217_.anInt3339 = anInt3339;
            class1_sub3_sub1_217_.anIntArray3363 = anIntArray3363;
            class1_sub3_sub1_217_.anIntArray3338 = anIntArray3338;
            class1_sub3_sub1_217_.anIntArray3366 = anIntArray3366;
            class1_sub3_sub1_217_.anIntArray3353 = anIntArray3353;
            class1_sub3_sub1_217_.anIntArray3368 = anIntArray3368;
            class1_sub3_sub1_217_.anIntArray3341 = anIntArray3341;
            class1_sub3_sub1_217_.aByteArray3346 = aByteArray3346;
            class1_sub3_sub1_217_.aByteArray3351 = aByteArray3351;
            class1_sub3_sub1_217_.aByteArray3337 = aByteArray3337;
            class1_sub3_sub1_217_.aShortArray3350 = aShortArray3350;
            class1_sub3_sub1_217_.aByte3362 = aByte3362;
            class1_sub3_sub1_217_.anIntArray3359 = anIntArray3359;
            class1_sub3_sub1_217_.anIntArray3340 = anIntArray3340;
            class1_sub3_sub1_217_.anIntArray3360 = anIntArray3360;
            class1_sub3_sub1_217_.anIntArrayArray3361 = anIntArrayArray3361;
            class1_sub3_sub1_217_.anIntArrayArray3342 = anIntArrayArray3342;
            ((Model) class1_sub3_sub1_217_).aBoolean2445 = ((Model) this).aBoolean2445;
            if (i == 3)
            {
                ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3356 = Class106.method1651((((SpriteFactory) this).anIntArray3356), -48);
                ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3336 = Class106.method1651((((SpriteFactory) this).anIntArray3336), -40);
                ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3345 = Class106.method1651((((SpriteFactory) this).anIntArray3345), -52);
            } else
            {
                ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3356 = ((SpriteFactory) this).anIntArray3356;
                ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3336 = (new int[((SpriteFactory) class1_sub3_sub1_217_).anInt3357]);
                ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3345 = ((SpriteFactory) this).anIntArray3345;
            }
        } else
            class1_sub3_sub1_217_ = this;
        if (i == 1)
        {
            for (int i_218_ = 0; i_218_ < ((SpriteFactory) class1_sub3_sub1_217_).anInt3357; i_218_++)
            {
                int i_219_ = (((SpriteFactory) this).anIntArray3356[i_218_] + i_210_);
                int i_220_ = (((SpriteFactory) this).anIntArray3345[i_218_] + i_212_);
                int i_221_ = i_219_ & 0x7f;
                int i_222_ = i_220_ & 0x7f;
                int i_223_ = i_219_ >> 7;
                int i_224_ = i_220_ >> 7;
                int i_225_ = ((is[i_223_][i_224_] * (128 - i_221_) + is[i_223_ + 1][i_224_] * i_221_) >> 7);
                int i_226_ = ((is[i_223_][i_224_ + 1] * (128 - i_221_) + is[i_223_ + 1][i_224_ + 1] * i_221_) >> 7);
                int i_227_ = i_225_ * (128 - i_222_) + i_226_ * i_222_ >> 7;
                ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3336[i_218_] = (((SpriteFactory) this).anIntArray3336[i_218_] + i_227_ - i_211_);
            }
        } else if (i == 2)
        {
            for (int i_228_ = 0; i_228_ < ((SpriteFactory) class1_sub3_sub1_217_).anInt3357; i_228_++)
            {
                int i_229_ = ((((SpriteFactory) this).anIntArray3336[i_228_] << 16) / aShort3344);
                if (i_229_ < i_208_)
                {
                    int i_230_ = (((SpriteFactory) this).anIntArray3356[i_228_] + i_210_);
                    int i_231_ = (((SpriteFactory) this).anIntArray3345[i_228_] + i_212_);
                    int i_232_ = i_230_ & 0x7f;
                    int i_233_ = i_231_ & 0x7f;
                    int i_234_ = i_230_ >> 7;
                    int i_235_ = i_231_ >> 7;
                    int i_236_ = ((is[i_234_][i_235_] * (128 - i_232_) + is[i_234_ + 1][i_235_] * i_232_) >> 7);
                    int i_237_ = ((is[i_234_][i_235_ + 1] * (128 - i_232_) + is[i_234_ + 1][i_235_ + 1] * i_232_) >> 7);
                    int i_238_ = i_236_ * (128 - i_233_) + i_237_ * i_233_ >> 7;
                    ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3336[i_228_] = (((SpriteFactory) this).anIntArray3336[i_228_] + (i_238_ - i_211_) * (i_208_ - i_229_) / i_208_);
                } else
                    ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3336[i_228_] = ((SpriteFactory) this).anIntArray3336[i_228_];
            }
        } else if (i == 3)
        {
            int i_239_ = (i_208_ & 0xff) * 4;
            int i_240_ = (i_208_ >> 8 & 0xff) * 4;
            class1_sub3_sub1_217_.method73(is, i_210_, i_211_, i_212_, i_239_, i_240_);
        } else if (i == 4)
        {
            int i_241_ = aShort3354 - aShort3344;
            for (int i_242_ = 0; i_242_ < ((SpriteFactory) this).anInt3357; i_242_++)
            {
                int i_243_ = (((SpriteFactory) this).anIntArray3356[i_242_] + i_210_);
                int i_244_ = (((SpriteFactory) this).anIntArray3345[i_242_] + i_212_);
                int i_245_ = i_243_ & 0x7f;
                int i_246_ = i_244_ & 0x7f;
                int i_247_ = i_243_ >> 7;
                int i_248_ = i_244_ >> 7;
                int i_249_ = ((is_209_[i_247_][i_248_] * (128 - i_245_) + is_209_[i_247_ + 1][i_248_] * i_245_) >> 7);
                int i_250_ = ((is_209_[i_247_][i_248_ + 1] * (128 - i_245_) + is_209_[i_247_ + 1][i_248_ + 1] * i_245_) >> 7);
                int i_251_ = i_249_ * (128 - i_246_) + i_250_ * i_246_ >> 7;
                ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3336[i_242_] = (((SpriteFactory) this).anIntArray3336[i_242_] + (i_251_ - i_211_) + i_241_);
            }
        } else if (i == 5)
        {
            int i_252_ = aShort3354 - aShort3344;
            for (int i_253_ = 0; i_253_ < ((SpriteFactory) this).anInt3357; i_253_++)
            {
                int i_254_ = (((SpriteFactory) this).anIntArray3356[i_253_] + i_210_);
                int i_255_ = (((SpriteFactory) this).anIntArray3345[i_253_] + i_212_);
                int i_256_ = i_254_ & 0x7f;
                int i_257_ = i_255_ & 0x7f;
                int i_258_ = i_254_ >> 7;
                int i_259_ = i_255_ >> 7;
                int i_260_ = ((is[i_258_][i_259_] * (128 - i_256_) + is[i_258_ + 1][i_259_] * i_256_) >> 7);
                int i_261_ = ((is[i_258_][i_259_ + 1] * (128 - i_256_) + is[i_258_ + 1][i_259_ + 1] * i_256_) >> 7);
                int i_262_ = i_260_ * (128 - i_257_) + i_261_ * i_257_ >> 7;
                i_260_ = (is_209_[i_258_][i_259_] * (128 - i_256_) + is_209_[i_258_ + 1][i_259_] * i_256_) >> 7;
                i_261_ = (is_209_[i_258_][i_259_ + 1] * (128 - i_256_) + is_209_[i_258_ + 1][i_259_ + 1] * i_256_) >> 7;
                int i_263_ = i_260_ * (128 - i_257_) + i_261_ * i_257_ >> 7;
                int i_264_ = i_262_ - i_263_;
                ((SpriteFactory) class1_sub3_sub1_217_).anIntArray3336[i_253_] = (((((SpriteFactory) this).anIntArray3336[i_253_] << 8) / i_252_ * i_264_) >> 8) - (i_211_ - i_262_);
            }
        }
        ((SpriteFactory) class1_sub3_sub1_217_).aBoolean3347 = false;
        return class1_sub3_sub1_217_;
    }

    final int method84()
    {
        if (!((SpriteFactory) this).aBoolean3347)
            method101();
        return aShort3349;
    }

    final void method88()
    {
        for (int i = 0; i < ((SpriteFactory) this).anInt3357; i++)
        {
            int i_265_ = ((SpriteFactory) this).anIntArray3345[i];
            ((SpriteFactory) this).anIntArray3345[i] = ((SpriteFactory) this).anIntArray3356[i];
            ((SpriteFactory) this).anIntArray3356[i] = -i_265_;
        }
        ((SpriteFactory) this).aBoolean3347 = false;
    }

    final int method89()
    {
        if (!((SpriteFactory) this).aBoolean3347)
            method101();
        return aShort3352;
    }

    private final void method101()
    {
        int i = 32767;
        int i_266_ = 32767;
        int i_267_ = 32767;
        int i_268_ = -32768;
        int i_269_ = -32768;
        int i_270_ = -32768;
        int i_271_ = 0;
        int i_272_ = 0;
        for (int i_273_ = 0; i_273_ < ((SpriteFactory) this).anInt3357; i_273_++)
        {
            int i_274_ = ((SpriteFactory) this).anIntArray3356[i_273_];
            int i_275_ = ((SpriteFactory) this).anIntArray3336[i_273_];
            int i_276_ = ((SpriteFactory) this).anIntArray3345[i_273_];
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
        aShort3352 = (short) i;
        aShort3349 = (short) i_268_;
        aShort3344 = (short) i_266_;
        aShort3354 = (short) i_269_;
        aShort3343 = (short) i_267_;
        height = (short) i_270_;
        aShort3364 = (short) (int) (Math.sqrt((double) i_271_) + 0.99);
        aShort3355 = (short) (int) (Math.sqrt((double) i_272_) + 0.99);
        ((SpriteFactory) this).aBoolean3347 = true;
    }

    final void method83()
    {
        for (int i = 0; i < ((SpriteFactory) this).anInt3357; i++)
        {
            ((SpriteFactory) this).anIntArray3356[i] = -((SpriteFactory) this).anIntArray3356[i];
            ((SpriteFactory) this).anIntArray3345[i] = -((SpriteFactory) this).anIntArray3345[i];
        }
        ((SpriteFactory) this).aBoolean3347 = false;
    }

    final Model method82(boolean bool, boolean bool_278_)
    {
        if (!bool && aByteArray3369.length < anInt3358)
            aByteArray3369 = new byte[anInt3358 + 100];
        return method98(bool, aClass1_Sub3_Sub1_3365, aByteArray3369);
    }

    final int method75()
    {
        if (!((SpriteFactory) this).aBoolean3347)
            method101();
        return aShort3343;
    }

    final Model method81(boolean bool, boolean bool_279_)
    {
        if (!bool && aByteArray3372.length < anInt3358)
            aByteArray3372 = new byte[anInt3358 + 100];
        return method98(bool, aClass1_Sub3_Sub1_3367, aByteArray3372);
    }

    final void method80()
    {
        for (int i = 0; i < ((SpriteFactory) this).anInt3357; i++)
        {
            int i_280_ = ((SpriteFactory) this).anIntArray3356[i];
            ((SpriteFactory) this).anIntArray3356[i] = ((SpriteFactory) this).anIntArray3345[i];
            ((SpriteFactory) this).anIntArray3345[i] = -i_280_;
        }
        ((SpriteFactory) this).aBoolean3347 = false;
    }

    final void method85(int i)
    {
        int i_281_ = Class62.PRECOMPUTED_SINE_CACHE[i];
        int i_282_ = Class62.PRECOMUPTED_COSINE_CACHE[i];
        for (int i_283_ = 0; i_283_ < ((SpriteFactory) this).anInt3357; i_283_++)
        {
            int i_284_ = ((((SpriteFactory) this).anIntArray3336[i_283_] * i_281_ + (((SpriteFactory) this).anIntArray3356[i_283_] * i_282_)) >> 16);
            ((SpriteFactory) this).anIntArray3336[i_283_] = (((SpriteFactory) this).anIntArray3336[i_283_] * i_282_ - (((SpriteFactory) this).anIntArray3356[i_283_] * i_281_)) >> 16;
            ((SpriteFactory) this).anIntArray3356[i_283_] = i_284_;
        }
        ((SpriteFactory) this).aBoolean3347 = false;
    }

    private static final int method102(int i)
    {
        if (i < 2)
            i = 2;
        else if (i > 126)
            i = 126;
        return i;
    }

    private static final int method103(int i, int i_285_)
    {
        i_285_ = i_285_ * (i & 0x7f) >> 7;
        if (i_285_ < 2)
            i_285_ = 2;
        else if (i_285_ > 126)
            i_285_ = 126;
        return (i & 0xff80) + i_285_;
    }

    final void method76(Class68_Sub20_Sub17 class68_sub20_sub17, int i)
    {
        if (anIntArrayArray3361 != null && i != -1)
        {
            Class110 class110 = (((Class68_Sub20_Sub17) class68_sub20_sub17).aClass110Array4434[i]);
            Class68_Sub7 class68_sub7 = ((Class110) class110).aClass68_Sub7_1857;
            anInt3379 = 0;
            anInt3378 = 0;
            anInt3371 = 0;
            for (int i_286_ = 0; i_286_ < ((Class110) class110).anInt1860; i_286_++)
            {
                short i_287_ = ((Class110) class110).aShortArray1862[i_286_];
                if (((Class68_Sub7) class68_sub7).aBooleanArray2851[i_287_])
                {
                    if (((Class110) class110).aShortArray1854[i_286_] != -1)
                        method95(0, 0, 0, 0);
                    method95((((Class68_Sub7) class68_sub7).anIntArray2855[i_287_]), ((Class110) class110).aShortArray1850[i_286_], ((Class110) class110).aShortArray1852[i_286_], ((Class110) class110).aShortArray1861[i_286_]);
                }
            }
            ((SpriteFactory) this).aBoolean3347 = false;
        }
    }

    private final void method104(boolean bool, boolean bool_288_, long l, int i, int i_289_)
    {
        if (i_289_ < 1600)
        {
            for (int i_290_ = 0; i_290_ < i_289_; i_290_++)
                anIntArray3391[i_290_] = 0;
            for (int i_291_ = 0; i_291_ < anInt3358; i_291_++)
            {
                if (anIntArray3341[i_291_] != -2)
                {
                    int i_292_ = anIntArray3363[i_291_];
                    int i_293_ = anIntArray3338[i_291_];
                    int i_294_ = anIntArray3366[i_291_];
                    int i_295_ = anIntArray3384[i_292_];
                    int i_296_ = anIntArray3384[i_293_];
                    int i_297_ = anIntArray3384[i_294_];
                    if (bool && (i_295_ == -5000 || i_296_ == -5000 || i_297_ == -5000))
                    {
                        int i_298_ = anIntArray3386[i_292_];
                        int i_299_ = anIntArray3386[i_293_];
                        int i_300_ = anIntArray3386[i_294_];
                        int i_301_ = anIntArray3382[i_292_];
                        int i_302_ = anIntArray3382[i_293_];
                        int i_303_ = anIntArray3382[i_294_];
                        int i_304_ = anIntArray3375[i_292_];
                        int i_305_ = anIntArray3375[i_293_];
                        int i_306_ = anIntArray3375[i_294_];
                        i_298_ -= i_299_;
                        i_300_ -= i_299_;
                        i_301_ -= i_302_;
                        i_303_ -= i_302_;
                        i_304_ -= i_305_;
                        i_306_ -= i_305_;
                        int i_307_ = i_301_ * i_306_ - i_304_ * i_303_;
                        int i_308_ = i_304_ * i_300_ - i_298_ * i_306_;
                        int i_309_ = i_298_ * i_303_ - i_301_ * i_300_;
                        if (i_299_ * i_307_ + i_302_ * i_308_ + i_305_ * i_309_ > 0)
                        {
                            aBooleanArray3383[i_291_] = true;
                            int i_310_ = ((anIntArray3388[i_292_] + anIntArray3388[i_293_] + anIntArray3388[i_294_]) / 3 + i);
                            anIntArrayArray3389[i_310_][anIntArray3391[i_310_]++] = i_291_;
                        }
                    } else
                    {
                        if (bool_288_ && method93((Class68_Sub9.anInt2888 + Class62.anInt1164), Class51.anInt2258 + Class62.anInt1160, anIntArray3370[i_292_], anIntArray3370[i_293_], anIntArray3370[i_294_], i_295_, i_296_, i_297_))
                        {
                            Class68_Sub20_Sub15.aLongArray4391[Class68_Sub13_Sub1.anInt3450++] = l;
                            bool_288_ = false;
                        }
                        if (((i_295_ - i_296_) * (anIntArray3370[i_294_] - anIntArray3370[i_293_]) - (anIntArray3370[i_292_] - anIntArray3370[i_293_]) * (i_297_ - i_296_)) > 0)
                        {
                            aBooleanArray3383[i_291_] = false;
                            if (i_295_ < 0 || i_296_ < 0 || i_297_ < 0 || i_295_ > Class62.anInt1168 || i_296_ > Class62.anInt1168 || i_297_ > Class62.anInt1168)
                                aBooleanArray3377[i_291_] = true;
                            else
                                aBooleanArray3377[i_291_] = false;
                            int i_311_ = ((anIntArray3388[i_292_] + anIntArray3388[i_293_] + anIntArray3388[i_294_]) / 3 + i);
                            anIntArrayArray3389[i_311_][anIntArray3391[i_311_]++] = i_291_;
                        }
                    }
                }
            }
            if (aByteArray3346 == null)
            {
                for (int i_312_ = i_289_ - 1; i_312_ >= 0; i_312_--)
                {
                    int i_313_ = anIntArray3391[i_312_];
                    if (i_313_ > 0)
                    {
                        int[] is = anIntArrayArray3389[i_312_];
                        for (int i_314_ = 0; i_314_ < i_313_; i_314_++)
                            method105(is[i_314_]);
                    }
                }
            } else
            {
                for (int i_315_ = 0; i_315_ < 12; i_315_++)
                {
                    anIntArray3390[i_315_] = 0;
                    anIntArray3373[i_315_] = 0;
                }
                for (int i_316_ = i_289_ - 1; i_316_ >= 0; i_316_--)
                {
                    int i_317_ = anIntArray3391[i_316_];
                    if (i_317_ > 0)
                    {
                        int[] is = anIntArrayArray3389[i_316_];
                        for (int i_318_ = 0; i_318_ < i_317_; i_318_++)
                        {
                            int i_319_ = is[i_318_];
                            byte i_320_ = aByteArray3346[i_319_];
                            int i_321_ = anIntArray3390[i_320_]++;
                            anIntArrayArray3381[i_320_][i_321_] = i_319_;
                            if (i_320_ < 10)
                                anIntArray3373[i_320_] += i_316_;
                            else if (i_320_ == 10)
                                anIntArray3376[i_321_] = i_316_;
                            else
                                anIntArray3385[i_321_] = i_316_;
                        }
                    }
                }
                int i_322_ = 0;
                if (anIntArray3390[1] > 0 || anIntArray3390[2] > 0)
                    i_322_ = ((anIntArray3373[1] + anIntArray3373[2]) / (anIntArray3390[1] + anIntArray3390[2]));
                int i_323_ = 0;
                if (anIntArray3390[3] > 0 || anIntArray3390[4] > 0)
                    i_323_ = ((anIntArray3373[3] + anIntArray3373[4]) / (anIntArray3390[3] + anIntArray3390[4]));
                int i_324_ = 0;
                if (anIntArray3390[6] > 0 || anIntArray3390[8] > 0)
                    i_324_ = ((anIntArray3373[6] + anIntArray3373[8]) / (anIntArray3390[6] + anIntArray3390[8]));
                int i_325_ = 0;
                int i_326_ = anIntArray3390[10];
                int[] is = anIntArrayArray3381[10];
                int[] is_327_ = anIntArray3376;
                if (i_325_ == i_326_)
                {
                    i_325_ = 0;
                    i_326_ = anIntArray3390[11];
                    is = anIntArrayArray3381[11];
                    is_327_ = anIntArray3385;
                }
                int i_328_;
                if (i_325_ < i_326_)
                    i_328_ = is_327_[i_325_];
                else
                    i_328_ = -1000;
                for (int i_329_ = 0; i_329_ < 10; i_329_++)
                {
                    while (i_329_ == 0)
                    {
                        if (i_328_ <= i_322_)
                            break;
                        method105(is[i_325_++]);
                        if (i_325_ == i_326_ && is != anIntArrayArray3381[11])
                        {
                            i_325_ = 0;
                            i_326_ = anIntArray3390[11];
                            is = anIntArrayArray3381[11];
                            is_327_ = anIntArray3385;
                        }
                        if (i_325_ < i_326_)
                            i_328_ = is_327_[i_325_];
                        else
                            i_328_ = -1000;
                    }
                    while (i_329_ == 3)
                    {
                        if (i_328_ <= i_323_)
                            break;
                        method105(is[i_325_++]);
                        if (i_325_ == i_326_ && is != anIntArrayArray3381[11])
                        {
                            i_325_ = 0;
                            i_326_ = anIntArray3390[11];
                            is = anIntArrayArray3381[11];
                            is_327_ = anIntArray3385;
                        }
                        if (i_325_ < i_326_)
                            i_328_ = is_327_[i_325_];
                        else
                            i_328_ = -1000;
                    }
                    while (i_329_ == 5 && i_328_ > i_324_)
                    {
                        method105(is[i_325_++]);
                        if (i_325_ == i_326_ && is != anIntArrayArray3381[11])
                        {
                            i_325_ = 0;
                            i_326_ = anIntArray3390[11];
                            is = anIntArrayArray3381[11];
                            is_327_ = anIntArray3385;
                        }
                        if (i_325_ < i_326_)
                            i_328_ = is_327_[i_325_];
                        else
                            i_328_ = -1000;
                    }
                    int i_330_ = anIntArray3390[i_329_];
                    int[] is_331_ = anIntArrayArray3381[i_329_];
                    for (int i_332_ = 0; i_332_ < i_330_; i_332_++)
                        method105(is_331_[i_332_]);
                }
                while (i_328_ != -1000)
                {
                    method105(is[i_325_++]);
                    if (i_325_ == i_326_ && is != anIntArrayArray3381[11])
                    {
                        i_325_ = 0;
                        is = anIntArrayArray3381[11];
                        i_326_ = anIntArray3390[11];
                        is_327_ = anIntArray3385;
                    }
                    if (i_325_ < i_326_)
                        i_328_ = is_327_[i_325_];
                    else
                        i_328_ = -1000;
                }
            }
        }
    }

    private final void method105(int i)
    {
        if (aBooleanArray3383[i])
            method99(i);
        else
        {
            int i_333_ = anIntArray3363[i];
            int i_334_ = anIntArray3338[i];
            int i_335_ = anIntArray3366[i];
            Class62.aBoolean1157 = aBooleanArray3377[i];
            if (aByteArray3351 == null)
                Class62.anInt1153 = 0;
            else
                Class62.anInt1153 = aByteArray3351[i] & 0xff;
            if (aShortArray3350 == null || aShortArray3350[i] == -1)
            {
                if (anIntArray3341[i] == -1)
                    Class62.method610(anIntArray3370[i_333_], anIntArray3370[i_334_], anIntArray3370[i_335_], anIntArray3384[i_333_], anIntArray3384[i_334_], anIntArray3384[i_335_], (Class62.anIntArray1158[anIntArray3353[i]]));
                else
                    Class62.method617(anIntArray3370[i_333_], anIntArray3370[i_334_], anIntArray3370[i_335_], anIntArray3384[i_333_], anIntArray3384[i_334_], anIntArray3384[i_335_], anIntArray3353[i], anIntArray3368[i], anIntArray3341[i]);
            } else
            {
                int i_336_;
                int i_337_;
                int i_338_;
                if (aByteArray3337 != null && aByteArray3337[i] != -1)
                {
                    int i_339_ = aByteArray3337[i] & 0xff;
                    i_336_ = anIntArray3359[i_339_];
                    i_337_ = anIntArray3340[i_339_];
                    i_338_ = anIntArray3360[i_339_];
                } else
                {
                    i_336_ = i_333_;
                    i_337_ = i_334_;
                    i_338_ = i_335_;
                }
                if (anIntArray3341[i] == -1)
                    Class62.method616(anIntArray3370[i_333_], anIntArray3370[i_334_], anIntArray3370[i_335_], anIntArray3384[i_333_], anIntArray3384[i_334_], anIntArray3384[i_335_], anIntArray3353[i], anIntArray3353[i], anIntArray3353[i], anIntArray3386[i_336_], anIntArray3386[i_337_], anIntArray3386[i_338_], anIntArray3382[i_336_], anIntArray3382[i_337_], anIntArray3382[i_338_], anIntArray3375[i_336_], anIntArray3375[i_337_], anIntArray3375[i_338_], aShortArray3350[i]);
                else
                    Class62.method616(anIntArray3370[i_333_], anIntArray3370[i_334_], anIntArray3370[i_335_], anIntArray3384[i_333_], anIntArray3384[i_334_], anIntArray3384[i_335_], anIntArray3353[i], anIntArray3368[i], anIntArray3341[i], anIntArray3386[i_336_], anIntArray3386[i_337_], anIntArray3386[i_338_], anIntArray3382[i_336_], anIntArray3382[i_337_], anIntArray3382[i_338_], anIntArray3375[i_336_], anIntArray3375[i_337_], anIntArray3375[i_338_], aShortArray3350[i]);
            }
        }
    }

    final void method78(int i)
    {
        int i_340_ = Class62.PRECOMPUTED_SINE_CACHE[i];
        int i_341_ = Class62.PRECOMUPTED_COSINE_CACHE[i];
        for (int i_342_ = 0; i_342_ < ((SpriteFactory) this).anInt3357; i_342_++)
        {
            int i_343_ = ((((SpriteFactory) this).anIntArray3336[i_342_] * i_341_ - (((SpriteFactory) this).anIntArray3345[i_342_] * i_340_)) >> 16);
            ((SpriteFactory) this).anIntArray3345[i_342_] = (((SpriteFactory) this).anIntArray3336[i_342_] * i_340_ + (((SpriteFactory) this).anIntArray3345[i_342_] * i_341_)) >> 16;
            ((SpriteFactory) this).anIntArray3336[i_342_] = i_343_;
        }
        ((SpriteFactory) this).aBoolean3347 = false;
    }

    final void method90(int i)
    {
        int i_344_ = Class62.PRECOMPUTED_SINE_CACHE[i];
        int i_345_ = Class62.PRECOMUPTED_COSINE_CACHE[i];
        for (int i_346_ = 0; i_346_ < ((SpriteFactory) this).anInt3357; i_346_++)
        {
            int i_347_ = ((((SpriteFactory) this).anIntArray3345[i_346_] * i_344_ + (((SpriteFactory) this).anIntArray3356[i_346_] * i_345_)) >> 16);
            ((SpriteFactory) this).anIntArray3345[i_346_] = (((SpriteFactory) this).anIntArray3345[i_346_] * i_345_ - (((SpriteFactory) this).anIntArray3356[i_346_] * i_344_)) >> 16;
            ((SpriteFactory) this).anIntArray3356[i_346_] = i_347_;
        }
        ((SpriteFactory) this).aBoolean3347 = false;
    }

    final Model method106(Model class1_sub3)
    {
        return new SpriteFactory((new SpriteFactory[] { this, (SpriteFactory) class1_sub3 }), 2);
    }

    final void method74(Class68_Sub20_Sub17 class68_sub20_sub17, int i, boolean bool)
    {
        if (anIntArrayArray3361 != null && i != -1)
        {
            Class110 class110 = (((Class68_Sub20_Sub17) class68_sub20_sub17).aClass110Array4434[i]);
            Class68_Sub7 class68_sub7 = ((Class110) class110).aClass68_Sub7_1857;
            anInt3379 = 0;
            anInt3378 = 0;
            anInt3371 = 0;
            for (int i_348_ = 0; i_348_ < ((Class110) class110).anInt1860; i_348_++)
            {
                short i_349_ = ((Class110) class110).aShortArray1862[i_348_];
                if (((Class110) class110).aShortArray1854[i_348_] != -1)
                    method97(0, (((Class68_Sub7) class68_sub7).anIntArrayArray2857[((Class110) class110).aShortArray1854[i_348_]]), 0, 0, 0);
                method97(((Class68_Sub7) class68_sub7).anIntArray2855[i_349_], (((Class68_Sub7) class68_sub7).anIntArrayArray2857[i_349_]), ((Class110) class110).aShortArray1850[i_348_], ((Class110) class110).aShortArray1852[i_348_], ((Class110) class110).aShortArray1861[i_348_]);
            }
            ((SpriteFactory) this).aBoolean3347 = false;
        }
    }

    final void method86(Class68_Sub20_Sub17 class68_sub20_sub17, int i, Class68_Sub20_Sub17 class68_sub20_sub17_350_, int i_351_, int[] is, boolean bool)
    {
        if (i != -1)
        {
            if (is == null || i_351_ == -1)
                method74(class68_sub20_sub17, i, bool);
            else
            {
                Class110 class110 = (((Class68_Sub20_Sub17) class68_sub20_sub17).aClass110Array4434[i]);
                Class110 class110_352_ = (((Class68_Sub20_Sub17) class68_sub20_sub17_350_).aClass110Array4434[i_351_]);
                Class68_Sub7 class68_sub7 = ((Class110) class110).aClass68_Sub7_1857;
                anInt3379 = 0;
                anInt3378 = 0;
                anInt3371 = 0;
                int i_353_ = 0;
                int i_354_ = is[i_353_++];
                for (int i_355_ = 0; i_355_ < ((Class110) class110).anInt1860; i_355_++)
                {
                    int i_356_;
                    for (i_356_ = ((Class110) class110).aShortArray1862[i_355_]; i_356_ > i_354_; i_354_ = is[i_353_++])
                    {
                        /* empty */
                    }
                    if (i_356_ != i_354_ || (((Class68_Sub7) class68_sub7).anIntArray2855[i_356_]) == 0)
                    {
                        if (((Class110) class110).aShortArray1854[i_355_] != -1)
                            method97(0, (((Class68_Sub7) class68_sub7).anIntArrayArray2857[(((Class110) class110).aShortArray1854[i_355_])]), 0, 0, 0);
                        method97((((Class68_Sub7) class68_sub7).anIntArray2855[i_356_]), (((Class68_Sub7) class68_sub7).anIntArrayArray2857[i_356_]), ((Class110) class110).aShortArray1850[i_355_], ((Class110) class110).aShortArray1852[i_355_], (((Class110) class110).aShortArray1861[i_355_]));
                    }
                }
                anInt3379 = 0;
                anInt3378 = 0;
                anInt3371 = 0;
                i_353_ = 0;
                i_354_ = is[i_353_++];
                for (int i_357_ = 0; i_357_ < ((Class110) class110_352_).anInt1860; i_357_++)
                {
                    int i_358_;
                    for (i_358_ = (((Class110) class110_352_).aShortArray1862[i_357_]); i_358_ > i_354_; i_354_ = is[i_353_++])
                    {
                        /* empty */
                    }
                    if (i_358_ == i_354_ || (((Class68_Sub7) class68_sub7).anIntArray2855[i_358_]) == 0)
                    {
                        if (((Class110) class110_352_).aShortArray1854[i_357_] != -1)
                            method97(0, (((Class68_Sub7) class68_sub7).anIntArrayArray2857[(((Class110) class110_352_).aShortArray1854[i_357_])]), 0, 0, 0);
                        method97((((Class68_Sub7) class68_sub7).anIntArray2855[i_358_]), (((Class68_Sub7) class68_sub7).anIntArrayArray2857[i_358_]), (((Class110) class110_352_).aShortArray1850[i_357_]), (((Class110) class110_352_).aShortArray1852[i_357_]), (((Class110) class110_352_).aShortArray1861[i_357_]));
                    }
                }
                ((SpriteFactory) this).aBoolean3347 = false;
            }
        }
    }

    public SpriteFactory()
    {
        ((SpriteFactory) this).anInt3357 = 0;
        anInt3339 = 0;
        aByte3362 = (byte) 0;
    }

    SpriteFactory(Class1_Sub4 class1_sub4, int i, int i_359_, int i_360_, int i_361_, int i_362_)
    {
        ((SpriteFactory) this).anInt3357 = 0;
        anInt3339 = 0;
        aByte3362 = (byte) 0;
        class1_sub4.method120();
        class1_sub4.method112();
        ((SpriteFactory) this).anInt3357 = ((Class1_Sub4) class1_sub4).anInt2447;
        ((SpriteFactory) this).anIntArray3356 = ((Class1_Sub4) class1_sub4).anIntArray2479;
        ((SpriteFactory) this).anIntArray3336 = ((Class1_Sub4) class1_sub4).anIntArray2475;
        ((SpriteFactory) this).anIntArray3345 = ((Class1_Sub4) class1_sub4).anIntArray2468;
        anInt3358 = ((Class1_Sub4) class1_sub4).anInt2477;
        anIntArray3363 = ((Class1_Sub4) class1_sub4).anIntArray2448;
        anIntArray3338 = ((Class1_Sub4) class1_sub4).anIntArray2488;
        anIntArray3366 = ((Class1_Sub4) class1_sub4).anIntArray2465;
        aByteArray3346 = ((Class1_Sub4) class1_sub4).aByteArray2482;
        aByteArray3351 = ((Class1_Sub4) class1_sub4).aByteArray2481;
        aByte3362 = ((Class1_Sub4) class1_sub4).aByte2491;
        anIntArrayArray3361 = ((Class1_Sub4) class1_sub4).anIntArrayArray2489;
        anIntArrayArray3342 = ((Class1_Sub4) class1_sub4).anIntArrayArray2486;
        int i_363_ = (int) Math.sqrt((double) (i_360_ * i_360_ + i_361_ * i_361_ + i_362_ * i_362_));
        int i_364_ = i_359_ * i_363_ >> 8;
        anIntArray3353 = new int[anInt3358];
        anIntArray3368 = new int[anInt3358];
        anIntArray3341 = new int[anInt3358];
        if (((Class1_Sub4) class1_sub4).aShortArray2467 != null)
        {
            aShortArray3350 = new short[anInt3358];
            for (int i_365_ = 0; i_365_ < anInt3358; i_365_++)
            {
                short i_366_ = ((Class1_Sub4) class1_sub4).aShortArray2467[i_365_];
                if (i_366_ != -1 && Class62.anInterface4_1159.method8((byte) 39, i_366_))
                    aShortArray3350[i_365_] = i_366_;
                else
                    aShortArray3350[i_365_] = (short) -1;
            }
        } else
            aShortArray3350 = null;
        if (((Class1_Sub4) class1_sub4).anInt2461 > 0 && ((Class1_Sub4) class1_sub4).aByteArray2494 != null)
        {
            int[] is = new int[((Class1_Sub4) class1_sub4).anInt2461];
            for (int i_367_ = 0; i_367_ < anInt3358; i_367_++)
            {
                if (((Class1_Sub4) class1_sub4).aByteArray2494[i_367_] != -1)
                    is[(((Class1_Sub4) class1_sub4).aByteArray2494[i_367_] & 0xff)]++;
            }
            anInt3339 = 0;
            for (int i_368_ = 0; i_368_ < ((Class1_Sub4) class1_sub4).anInt2461; i_368_++)
            {
                if (is[i_368_] > 0 && ((Class1_Sub4) class1_sub4).aByteArray2463[i_368_] == 0)
                    anInt3339++;
            }
            anIntArray3359 = new int[anInt3339];
            anIntArray3340 = new int[anInt3339];
            anIntArray3360 = new int[anInt3339];
            int i_369_ = 0;
            for (int i_370_ = 0; i_370_ < ((Class1_Sub4) class1_sub4).anInt2461; i_370_++)
            {
                if (is[i_370_] > 0 && (((Class1_Sub4) class1_sub4).aByteArray2463[i_370_] == 0))
                {
                    anIntArray3359[i_369_] = (((Class1_Sub4) class1_sub4).aShortArray2456[i_370_] & 0xffff);
                    anIntArray3340[i_369_] = (((Class1_Sub4) class1_sub4).aShortArray2454[i_370_] & 0xffff);
                    anIntArray3360[i_369_] = (((Class1_Sub4) class1_sub4).aShortArray2459[i_370_] & 0xffff);
                    is[i_370_] = i_369_++;
                } else
                    is[i_370_] = -1;
            }
            aByteArray3337 = new byte[anInt3358];
            for (int i_371_ = 0; i_371_ < anInt3358; i_371_++)
            {
                if (((Class1_Sub4) class1_sub4).aByteArray2494[i_371_] != -1)
                {
                    aByteArray3337[i_371_] = (byte) is[(((Class1_Sub4) class1_sub4).aByteArray2494[i_371_]) & 0xff];
                    if (aByteArray3337[i_371_] == -1 && aShortArray3350 != null)
                        aShortArray3350[i_371_] = (short) -1;
                } else
                    aByteArray3337[i_371_] = (byte) -1;
            }
        }
        for (int i_372_ = 0; i_372_ < anInt3358; i_372_++)
        {
            byte i_373_;
            if (((Class1_Sub4) class1_sub4).aByteArray2478 == null)
                i_373_ = (byte) 0;
            else
                i_373_ = ((Class1_Sub4) class1_sub4).aByteArray2478[i_372_];
            byte i_374_;
            if (((Class1_Sub4) class1_sub4).aByteArray2481 == null)
                i_374_ = (byte) 0;
            else
                i_374_ = ((Class1_Sub4) class1_sub4).aByteArray2481[i_372_];
            short i_375_;
            if (aShortArray3350 == null)
                i_375_ = (short) -1;
            else
                i_375_ = aShortArray3350[i_372_];
            if (i_374_ == -2)
                i_373_ = (byte) 3;
            if (i_374_ == -1)
                i_373_ = (byte) 2;
            if (i_375_ == -1)
            {
                if (i_373_ == 0)
                {
                    int i_376_ = (((Class1_Sub4) class1_sub4).aShortArray2464[i_372_] & 0xffff);
                    Class107 class107;
                    if (((Class1_Sub4) class1_sub4).aClass107Array2480 != null && (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3363[i_372_]]) != null)
                        class107 = (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3363[i_372_]]);
                    else
                        class107 = (((Class1_Sub4) class1_sub4).aClass107Array2453[anIntArray3363[i_372_]]);
                    int i_377_ = i + ((i_360_ * ((Class107) class107).anInt1822 + i_361_ * ((Class107) class107).anInt1824 + i_362_ * ((Class107) class107).anInt1813) / (i_364_ * ((Class107) class107).anInt1816));
                    anIntArray3353[i_372_] = method103(i_376_, i_377_);
                    if (((Class1_Sub4) class1_sub4).aClass107Array2480 != null && (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3338[i_372_]]) != null)
                        class107 = (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3338[i_372_]]);
                    else
                        class107 = (((Class1_Sub4) class1_sub4).aClass107Array2453[anIntArray3338[i_372_]]);
                    i_377_ = i + ((i_360_ * ((Class107) class107).anInt1822 + i_361_ * ((Class107) class107).anInt1824 + i_362_ * ((Class107) class107).anInt1813) / (i_364_ * ((Class107) class107).anInt1816));
                    anIntArray3368[i_372_] = method103(i_376_, i_377_);
                    if (((Class1_Sub4) class1_sub4).aClass107Array2480 != null && (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3366[i_372_]]) != null)
                        class107 = (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3366[i_372_]]);
                    else
                        class107 = (((Class1_Sub4) class1_sub4).aClass107Array2453[anIntArray3366[i_372_]]);
                    i_377_ = i + ((i_360_ * ((Class107) class107).anInt1822 + i_361_ * ((Class107) class107).anInt1824 + i_362_ * ((Class107) class107).anInt1813) / (i_364_ * ((Class107) class107).anInt1816));
                    anIntArray3341[i_372_] = method103(i_376_, i_377_);
                } else if (i_373_ == 1)
                {
                    Class104 class104 = (((Class1_Sub4) class1_sub4).aClass104Array2450[i_372_]);
                    int i_378_ = i + ((i_360_ * ((Class104) class104).anInt1783 + i_361_ * ((Class104) class104).anInt1790 + i_362_ * ((Class104) class104).anInt1784) / (i_364_ + i_364_ / 2));
                    anIntArray3353[i_372_] = method103((((Class1_Sub4) class1_sub4).aShortArray2464[i_372_]) & 0xffff, i_378_);
                    anIntArray3341[i_372_] = -1;
                } else if (i_373_ == 3)
                {
                    anIntArray3353[i_372_] = 128;
                    anIntArray3341[i_372_] = -1;
                } else
                    anIntArray3341[i_372_] = -2;
            } else if (i_373_ == 0)
            {
                Class107 class107;
                if (((Class1_Sub4) class1_sub4).aClass107Array2480 != null && (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3363[i_372_]]) != null)
                    class107 = (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3363[i_372_]]);
                else
                    class107 = (((Class1_Sub4) class1_sub4).aClass107Array2453[anIntArray3363[i_372_]]);
                int i_379_ = i + ((i_360_ * ((Class107) class107).anInt1822 + i_361_ * ((Class107) class107).anInt1824 + i_362_ * ((Class107) class107).anInt1813) / (i_364_ * ((Class107) class107).anInt1816));
                anIntArray3353[i_372_] = method102(i_379_);
                if (((Class1_Sub4) class1_sub4).aClass107Array2480 != null && (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3338[i_372_]]) != null)
                    class107 = (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3338[i_372_]]);
                else
                    class107 = (((Class1_Sub4) class1_sub4).aClass107Array2453[anIntArray3338[i_372_]]);
                i_379_ = i + ((i_360_ * ((Class107) class107).anInt1822 + i_361_ * ((Class107) class107).anInt1824 + i_362_ * ((Class107) class107).anInt1813) / (i_364_ * ((Class107) class107).anInt1816));
                anIntArray3368[i_372_] = method102(i_379_);
                if (((Class1_Sub4) class1_sub4).aClass107Array2480 != null && (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3366[i_372_]]) != null)
                    class107 = (((Class1_Sub4) class1_sub4).aClass107Array2480[anIntArray3366[i_372_]]);
                else
                    class107 = (((Class1_Sub4) class1_sub4).aClass107Array2453[anIntArray3366[i_372_]]);
                i_379_ = i + ((i_360_ * ((Class107) class107).anInt1822 + i_361_ * ((Class107) class107).anInt1824 + i_362_ * ((Class107) class107).anInt1813) / (i_364_ * ((Class107) class107).anInt1816));
                anIntArray3341[i_372_] = method102(i_379_);
            } else if (i_373_ == 1)
            {
                Class104 class104 = ((Class1_Sub4) class1_sub4).aClass104Array2450[i_372_];
                int i_380_ = i + ((i_360_ * ((Class104) class104).anInt1783 + i_361_ * ((Class104) class104).anInt1790 + i_362_ * ((Class104) class104).anInt1784) / (i_364_ + i_364_ / 2));
                anIntArray3353[i_372_] = method102(i_380_);
                anIntArray3341[i_372_] = -1;
            } else
                anIntArray3341[i_372_] = -2;
        }
    }

    private SpriteFactory(SpriteFactory[] class1_sub3_sub1s, int i)
    {
        ((SpriteFactory) this).anInt3357 = 0;
        anInt3339 = 0;
        aByte3362 = (byte) 0;
        boolean bool = false;
        boolean bool_381_ = false;
        boolean bool_382_ = false;
        boolean bool_383_ = false;
        ((SpriteFactory) this).anInt3357 = 0;
        anInt3358 = 0;
        anInt3339 = 0;
        aByte3362 = (byte) -1;
        for (int i_384_ = 0; i_384_ < i; i_384_++)
        {
            SpriteFactory class1_sub3_sub1_385_ = class1_sub3_sub1s[i_384_];
            if (class1_sub3_sub1_385_ != null)
            {
                ((SpriteFactory) this).anInt3357 += ((SpriteFactory) class1_sub3_sub1_385_).anInt3357;
                anInt3358 += class1_sub3_sub1_385_.anInt3358;
                anInt3339 += class1_sub3_sub1_385_.anInt3339;
                if (class1_sub3_sub1_385_.aByteArray3346 != null)
                    bool = true;
                else
                {
                    if (aByte3362 == -1)
                        aByte3362 = class1_sub3_sub1_385_.aByte3362;
                    if (aByte3362 != class1_sub3_sub1_385_.aByte3362)
                        bool = true;
                }
                bool_381_ = bool_381_ | class1_sub3_sub1_385_.aByteArray3351 != null;
                bool_382_ = (bool_382_ | class1_sub3_sub1_385_.aShortArray3350 != null);
                bool_383_ = bool_383_ | class1_sub3_sub1_385_.aByteArray3337 != null;
            }
        }
        ((SpriteFactory) this).anIntArray3356 = new int[((SpriteFactory) this).anInt3357];
        ((SpriteFactory) this).anIntArray3336 = new int[((SpriteFactory) this).anInt3357];
        ((SpriteFactory) this).anIntArray3345 = new int[((SpriteFactory) this).anInt3357];
        anIntArray3363 = new int[anInt3358];
        anIntArray3338 = new int[anInt3358];
        anIntArray3366 = new int[anInt3358];
        anIntArray3353 = new int[anInt3358];
        anIntArray3368 = new int[anInt3358];
        anIntArray3341 = new int[anInt3358];
        if (bool)
            aByteArray3346 = new byte[anInt3358];
        if (bool_381_)
            aByteArray3351 = new byte[anInt3358];
        if (bool_382_)
            aShortArray3350 = new short[anInt3358];
        if (bool_383_)
            aByteArray3337 = new byte[anInt3358];
        if (anInt3339 > 0)
        {
            anIntArray3359 = new int[anInt3339];
            anIntArray3340 = new int[anInt3339];
            anIntArray3360 = new int[anInt3339];
        }
        ((SpriteFactory) this).anInt3357 = 0;
        anInt3358 = 0;
        anInt3339 = 0;
        for (int i_386_ = 0; i_386_ < i; i_386_++)
        {
            SpriteFactory class1_sub3_sub1_387_ = class1_sub3_sub1s[i_386_];
            if (class1_sub3_sub1_387_ != null)
            {
                for (int i_388_ = 0; i_388_ < class1_sub3_sub1_387_.anInt3358; i_388_++)
                {
                    anIntArray3363[anInt3358] = (class1_sub3_sub1_387_.anIntArray3363[i_388_] + ((SpriteFactory) this).anInt3357);
                    anIntArray3338[anInt3358] = (class1_sub3_sub1_387_.anIntArray3338[i_388_] + ((SpriteFactory) this).anInt3357);
                    anIntArray3366[anInt3358] = (class1_sub3_sub1_387_.anIntArray3366[i_388_] + ((SpriteFactory) this).anInt3357);
                    anIntArray3353[anInt3358] = class1_sub3_sub1_387_.anIntArray3353[i_388_];
                    anIntArray3368[anInt3358] = class1_sub3_sub1_387_.anIntArray3368[i_388_];
                    anIntArray3341[anInt3358] = class1_sub3_sub1_387_.anIntArray3341[i_388_];
                    if (bool)
                    {
                        if (class1_sub3_sub1_387_.aByteArray3346 != null)
                            aByteArray3346[anInt3358] = class1_sub3_sub1_387_.aByteArray3346[i_388_];
                        else
                            aByteArray3346[anInt3358] = class1_sub3_sub1_387_.aByte3362;
                    }
                    if (bool_381_ && class1_sub3_sub1_387_.aByteArray3351 != null)
                        aByteArray3351[anInt3358] = class1_sub3_sub1_387_.aByteArray3351[i_388_];
                    if (bool_382_)
                    {
                        if (class1_sub3_sub1_387_.aShortArray3350 != null)
                            aShortArray3350[anInt3358] = (class1_sub3_sub1_387_.aShortArray3350[i_388_]);
                        else
                            aShortArray3350[anInt3358] = (short) -1;
                    }
                    if (bool_383_)
                    {
                        if (class1_sub3_sub1_387_.aByteArray3337 != null && (class1_sub3_sub1_387_.aByteArray3337[i_388_] != -1))
                            aByteArray3337[anInt3358] = (byte) ((class1_sub3_sub1_387_.aByteArray3337[i_388_]) + anInt3339);
                        else
                            aByteArray3337[anInt3358] = (byte) -1;
                    }
                    anInt3358++;
                }
                for (int i_389_ = 0; i_389_ < class1_sub3_sub1_387_.anInt3339; i_389_++)
                {
                    anIntArray3359[anInt3339] = (class1_sub3_sub1_387_.anIntArray3359[i_389_] + ((SpriteFactory) this).anInt3357);
                    anIntArray3340[anInt3339] = (class1_sub3_sub1_387_.anIntArray3340[i_389_] + ((SpriteFactory) this).anInt3357);
                    anIntArray3360[anInt3339] = (class1_sub3_sub1_387_.anIntArray3360[i_389_] + ((SpriteFactory) this).anInt3357);
                    anInt3339++;
                }
                for (int i_390_ = 0; (i_390_ < ((SpriteFactory) class1_sub3_sub1_387_).anInt3357); i_390_++)
                {
                    ((SpriteFactory) this).anIntArray3356[((SpriteFactory) this).anInt3357] = (((SpriteFactory) class1_sub3_sub1_387_).anIntArray3356[i_390_]);
                    ((SpriteFactory) this).anIntArray3336[((SpriteFactory) this).anInt3357] = (((SpriteFactory) class1_sub3_sub1_387_).anIntArray3336[i_390_]);
                    ((SpriteFactory) this).anIntArray3345[((SpriteFactory) this).anInt3357] = (((SpriteFactory) class1_sub3_sub1_387_).anIntArray3345[i_390_]);
                    ((SpriteFactory) this).anInt3357++;
                }
            }
        }
    }

    static
    {
        aClass1_Sub3_Sub1_3367 = new SpriteFactory();
        aByteArray3372 = new byte[1];
        anIntArray3374 = new int[10];
        anIntArray3373 = new int[12];
        anIntArray3375 = new int[4096];
        anIntArray3370 = new int[4096];
        anIntArray3382 = new int[4096];
        aBooleanArray3383 = new boolean[4096];
        anIntArray3376 = new int[4096];
        anIntArray3384 = new int[4096];
        anIntArrayArray3381 = new int[12][4096];
        anIntArray3386 = new int[4096];
        aBooleanArray3377 = new boolean[4096];
        anIntArray3380 = new int[10];
        anIntArray3390 = new int[12];
        anIntArray3387 = new int[10];
        anIntArray3388 = new int[4096];
        anIntArray3385 = new int[4096];
        anIntArray3391 = new int[1600];
        anIntArrayArray3389 = new int[1600][512];
    }
}
