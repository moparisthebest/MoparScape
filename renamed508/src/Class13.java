/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class13
{
    static short[] aShortArray213;
    static MutableString aClass100_214 = Class112.makeMutableString(43, "Update)2Liste geladen)3");
    static MutableString aClass100_215 = Class112.makeMutableString(43, "not yet implemented");
    int anInt216;
    static int anInt217;
    static MutableString aClass100_218;
    static int anInt219;
    int anInt220;
    static Class21_Sub1 aClass21_Sub1_221;
    int anInt222;
    static int anInt223 = 0;

    public static void method240(int i)
    {
        aClass21_Sub1_221 = null;
        if (i != -28590)
            method240(111);
        aClass100_214 = null;
        aClass100_215 = null;
        aShortArray213 = null;
        aClass100_218 = null;
    }

    static final void method241(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_)
    {
        anInt217++;
        int i_7_ = 0;
        int i_8_ = i_2_;
        int i_9_ = 0;
        int i_10_ = i_0_ - i_5_;
        int i_11_ = i_2_ - i_5_;
        int i_12_ = i_0_ * i_0_;
        int i_13_ = i_2_ * i_2_;
        int i_14_ = i_10_ * i_10_;
        int i_15_ = i_13_ << 1;
        int i_16_ = i_2_ << 1;
        int i_17_ = i_11_ * i_11_;
        int i_18_ = i_14_ << 1;
        int i_19_ = i_12_ << 1;
        int i_20_ = i_17_ << 1;
        int i_21_ = i_11_ << 1;
        if (i_6_ != -1832820639)
            aClass100_215 = null;
        int i_22_ = i_13_ - (i_16_ - 1) * i_19_;
        int i_23_ = i_12_ * (1 - i_16_) + i_15_;
        int i_24_ = i_14_ * (1 - i_21_) + i_20_;
        int i_25_ = i_13_ << 2;
        int i_26_ = i_12_ << 2;
        int i_27_ = i_14_ << 2;
        int i_28_ = i_17_ - (i_21_ - 1) * i_18_;
        int i_29_ = i_17_ << 2;
        int i_30_ = i_15_ * 3;
        int i_31_ = (i_16_ - 3) * i_19_;
        int i_32_ = i_20_ * 3;
        int i_33_ = (i_21_ - 3) * i_18_;
        int i_34_ = i_29_;
        int i_35_ = i_25_;
        int i_36_ = i_26_ * (i_2_ - 1);
        if (i_1_ >= Class35.anInt605 && Class51.anInt2257 >= i_1_)
        {
            int[] is = Class68_Sub22.anIntArrayArray3134[i_1_];
            int i_37_ = Class68_Sub20_Sub15.method1171(i_4_ - i_0_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
            int i_38_ = Class68_Sub20_Sub15.method1171(i_4_ + i_0_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
            int i_39_ = Class68_Sub20_Sub15.method1171(i_4_ - i_10_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
            int i_40_ = Class68_Sub20_Sub15.method1171(i_10_ + i_4_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
            Class34.method416(i_37_, (byte) -17, i_3_, is, i_39_);
            Class34.method416(i_39_, (byte) -17, i, is, i_40_);
            Class34.method416(i_40_, (byte) -17, i_3_, is, i_38_);
        }
        int i_41_ = (i_11_ - 1) * i_27_;
        while (i_8_ > 0)
        {
            if (i_23_ < 0)
            {
                while (i_23_ < 0)
                {
                    i_7_++;
                    i_23_ += i_30_;
                    i_22_ += i_35_;
                    i_30_ += i_25_;
                    i_35_ += i_25_;
                }
            }
            boolean bool = i_8_ <= i_11_;
            int i_42_ = --i_8_ + i_1_;
            if (i_22_ < 0)
            {
                i_23_ += i_30_;
                i_22_ += i_35_;
                i_35_ += i_25_;
                i_30_ += i_25_;
                i_7_++;
            }
            i_22_ -= i_31_;
            i_23_ -= i_36_;
            if (bool)
            {
                if (i_24_ < 0)
                {
                    while (i_24_ < 0)
                    {
                        i_28_ += i_34_;
                        i_34_ += i_29_;
                        i_9_++;
                        i_24_ += i_32_;
                        i_32_ += i_29_;
                    }
                }
                if (i_28_ < 0)
                {
                    i_9_++;
                    i_28_ += i_34_;
                    i_24_ += i_32_;
                    i_32_ += i_29_;
                    i_34_ += i_29_;
                }
                i_28_ -= i_33_;
                i_33_ -= i_27_;
                i_24_ -= i_41_;
                i_41_ -= i_27_;
            }
            int i_43_ = i_1_ - i_8_;
            i_31_ -= i_26_;
            if (i_42_ >= Class35.anInt605 && i_43_ <= Class51.anInt2257)
            {
                int i_44_ = Class68_Sub20_Sub15.method1171(i_4_ + i_7_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                int i_45_ = Class68_Sub20_Sub15.method1171(i_4_ - i_7_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                if (bool)
                {
                    int i_46_ = Class68_Sub20_Sub15.method1171(i_4_ + i_9_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                    int i_47_ = Class68_Sub20_Sub15.method1171(i_4_ - i_9_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                    if (i_43_ >= Class35.anInt605)
                    {
                        int[] is = Class68_Sub22.anIntArrayArray3134[i_43_];
                        Class34.method416(i_45_, (byte) -17, i_3_, is, i_47_);
                        Class34.method416(i_47_, (byte) -17, i, is, i_46_);
                        Class34.method416(i_46_, (byte) -17, i_3_, is, i_44_);
                    }
                    if (Class51.anInt2257 >= i_42_)
                    {
                        int[] is = Class68_Sub22.anIntArrayArray3134[i_42_];
                        Class34.method416(i_45_, (byte) -17, i_3_, is, i_47_);
                        Class34.method416(i_47_, (byte) -17, i, is, i_46_);
                        Class34.method416(i_46_, (byte) -17, i_3_, is, i_44_);
                    }
                } else
                {
                    if (i_43_ >= Class35.anInt605)
                        Class34.method416(i_45_, (byte) -17, i_3_, (Class68_Sub22.anIntArrayArray3134[i_43_]), i_44_);
                    if (i_42_ <= Class51.anInt2257)
                        Class34.method416(i_45_, (byte) -17, i_3_, (Class68_Sub22.anIntArrayArray3134[i_42_]), i_44_);
                }
            }
            i_36_ -= i_26_;
        }
    }

    static final void method242(int i, int i_48_, int i_49_, int i_50_, int i_51_)
    {
        anInt219++;
        if (i < -77)
        {
            for (int i_52_ = 0; i_52_ < Class56.anInt1061; i_52_++)
            {
                if (i_50_ < (ItemDefinition.anIntArray376[i_52_] + Class105.anIntArray1797[i_52_]) && Class105.anIntArray1797[i_52_] < i_50_ + i_48_ && (Player.anIntArray3432[i_52_] + Class71.anIntArray1294[i_52_]) > i_51_ && i_49_ + i_51_ > Class71.anIntArray1294[i_52_])
                    Class68_Sub17.aBooleanArray3039[i_52_] = true;
            }
        }
    }

    abstract void method243(int i, int i_53_, int i_54_);

    abstract void method244(int i, int i_55_, int i_56_);

    abstract void method245(boolean bool, int i, int i_57_);

    Class13(int i, int i_58_, int i_59_)
    {
        ((Class13) this).anInt222 = i_59_;
        ((Class13) this).anInt220 = i_58_;
        ((Class13) this).anInt216 = i;
    }

    static
    {
        aClass100_218 = Class112.makeMutableString(43, ":");
    }
}
