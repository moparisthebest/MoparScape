/* Class75_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class75_Sub1 extends Class75
{
    static int anInt3293;
    static int[] anIntArray3294;
    static int[] anIntArray3295;
    static MRUNodes itemDefinitionNodes;
    static int[] anIntArray3297;
    static int anInt3298;
    static int[] anIntArray3299;
    static int anInt3300;
    static MutableString[] aClass100Array3301;
    static int[] anIntArray3302;
    static int anInt3303 = 50;
    static int anInt3304;
    static int[] anIntArray3305;
    static long aLong3306;
    static int[] anIntArray3307;
    static Object5[] aClass69Array3308;

    static final MutableString[] method1387(byte i, MutableString[] class100s)
    {
        try
        {
            anInt3298++;
            MutableString[] class100s_0_ = new MutableString[5];
            for (int i_1_ = 0; i_1_ < 5; i_1_++)
            {
                class100s_0_[i_1_] = (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class68_Sub13_Sub24.method816(i_1_, 0), NodeList.aClass100_274 }));
                if (class100s != null && class100s[i_1_] != null)
                    class100s_0_[i_1_] = (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { class100s_0_[i_1_], class100s[i_1_] }));
            }
            if (i >= -65)
                method1387((byte) -122, null);
            return class100s_0_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cg.I(" + i + ',' + (class100s != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1388(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_)
    {
        Class60.method587(-1, i_7_);
        int i_8_ = 0;
        anInt3293++;
        int i_9_ = i_7_;
        int i_10_ = -i_7_;
        int i_11_ = i_7_ - i_4_;
        if (i_11_ < 0)
            i_11_ = 0;
        int i_12_ = i_11_;
        if (i_6_ == -135)
        {
            int i_13_ = -i_11_;
            int i_14_ = -1;
            if (Class35.anInt605 <= i_2_ && i_2_ <= Class51.anInt2257)
            {
                int[] is = Class68_Sub22.anIntArrayArray3134[i_2_];
                int i_15_ = Class68_Sub20_Sub15.method1171(i_5_ - i_7_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                int i_16_ = Class68_Sub20_Sub15.method1171(i_5_ + i_7_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                int i_17_ = Class68_Sub20_Sub15.method1171(i_5_ - i_11_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                int i_18_ = Class68_Sub20_Sub15.method1171(i_5_ + i_11_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                Class34.method416(i_15_, (byte) -17, i_3_, is, i_17_);
                Class34.method416(i_17_, (byte) -17, i, is, i_18_);
                Class34.method416(i_18_, (byte) -17, i_3_, is, i_16_);
            }
            int i_19_ = -1;
            while (i_9_ > i_8_)
            {
                i_14_ += 2;
                i_19_ += 2;
                i_10_ += i_14_;
                i_13_ += i_19_;
                if (i_13_ >= 0 && i_12_ >= 1)
                {
                    i_12_--;
                    Class71_Sub1.anIntArray3257[i_12_] = i_8_;
                    i_13_ -= i_12_ << 1;
                }
                i_8_++;
                if (i_10_ >= 0)
                {
                    i_9_--;
                    i_10_ -= i_9_ << 1;
                    int i_20_ = i_2_ - i_9_;
                    int i_21_ = i_2_ + i_9_;
                    if (Class35.anInt605 <= i_21_ && i_20_ <= Class51.anInt2257)
                    {
                        if (i_11_ > i_9_)
                        {
                            int i_22_ = Class71_Sub1.anIntArray3257[i_9_];
                            int i_23_ = (Class68_Sub20_Sub15.method1171(i_5_ + i_8_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677));
                            int i_24_ = (Class68_Sub20_Sub15.method1171(i_5_ - i_8_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677));
                            int i_25_ = (Class68_Sub20_Sub15.method1171(i_22_ + i_5_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677));
                            int i_26_ = (Class68_Sub20_Sub15.method1171(i_5_ - i_22_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677));
                            if (Class51.anInt2257 >= i_21_)
                            {
                                int[] is = Class68_Sub22.anIntArrayArray3134[i_21_];
                                Class34.method416(i_24_, (byte) -17, i_3_, is, i_26_);
                                Class34.method416(i_26_, (byte) -17, i, is, i_25_);
                                Class34.method416(i_25_, (byte) -17, i_3_, is, i_23_);
                            }
                            if (i_20_ >= Class35.anInt605)
                            {
                                int[] is = Class68_Sub22.anIntArrayArray3134[i_20_];
                                Class34.method416(i_24_, (byte) -17, i_3_, is, i_26_);
                                Class34.method416(i_26_, (byte) -17, i, is, i_25_);
                                Class34.method416(i_25_, (byte) -17, i_3_, is, i_23_);
                            }
                        } else
                        {
                            int i_27_ = (Class68_Sub20_Sub15.method1171(i_5_ + i_8_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677));
                            int i_28_ = (Class68_Sub20_Sub15.method1171(i_5_ - i_8_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677));
                            if (Class51.anInt2257 >= i_21_)
                                Class34.method416(i_28_, (byte) -17, i_3_, (Class68_Sub22.anIntArrayArray3134[i_21_]), i_27_);
                            if (i_20_ >= Class35.anInt605)
                                Class34.method416(i_28_, (byte) -17, i_3_, (Class68_Sub22.anIntArrayArray3134[i_20_]), i_27_);
                        }
                    }
                }
                int i_29_ = i_2_ + i_8_;
                int i_30_ = i_2_ - i_8_;
                if (i_29_ >= Class35.anInt605 && i_30_ <= Class51.anInt2257)
                {
                    int i_31_ = i_9_ + i_5_;
                    int i_32_ = i_5_ - i_9_;
                    if (GroundData.anInt677 <= i_31_ && i_32_ <= NodeCache.anInt1920)
                    {
                        i_31_ = Class68_Sub20_Sub15.method1171(i_31_, (NodeCache.anInt1920), (byte) 114, GroundData.anInt677);
                        i_32_ = Class68_Sub20_Sub15.method1171(i_32_, (NodeCache.anInt1920), (byte) 114, GroundData.anInt677);
                        if (i_11_ > i_8_)
                        {
                            int i_33_ = (i_12_ < i_8_ ? Class71_Sub1.anIntArray3257[i_8_] : i_12_);
                            int i_34_ = (Class68_Sub20_Sub15.method1171(i_33_ + i_5_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677));
                            int i_35_ = (Class68_Sub20_Sub15.method1171(i_5_ - i_33_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677));
                            if (Class51.anInt2257 >= i_29_)
                            {
                                int[] is = Class68_Sub22.anIntArrayArray3134[i_29_];
                                Class34.method416(i_32_, (byte) -17, i_3_, is, i_35_);
                                Class34.method416(i_35_, (byte) -17, i, is, i_34_);
                                Class34.method416(i_34_, (byte) -17, i_3_, is, i_31_);
                            }
                            if (i_30_ >= Class35.anInt605)
                            {
                                int[] is = Class68_Sub22.anIntArrayArray3134[i_30_];
                                Class34.method416(i_32_, (byte) -17, i_3_, is, i_35_);
                                Class34.method416(i_35_, (byte) -17, i, is, i_34_);
                                Class34.method416(i_34_, (byte) -17, i_3_, is, i_31_);
                            }
                        } else
                        {
                            if (i_29_ <= Class51.anInt2257)
                                Class34.method416(i_32_, (byte) -17, i_3_, (Class68_Sub22.anIntArrayArray3134[i_29_]), i_31_);
                            if (i_30_ >= Class35.anInt605)
                                Class34.method416(i_32_, (byte) -17, i_3_, (Class68_Sub22.anIntArrayArray3134[i_30_]), i_31_);
                        }
                    }
                }
            }
        }
    }

    static final void method1389(int i, Character class1_sub6)
    {
        try
        {
            anInt3304++;
            if (Class68_Sub3.loopCycle == ((Character) class1_sub6).anInt2523 || ((Character) class1_sub6).animationID == -1 || ((Character) class1_sub6).anInt2547 != 0 || (((Character) class1_sub6).anInt2558 + 1 > (((Animation) Object1.getAnimation(((Character) class1_sub6).animationID)).anIntArray2060[((Character) class1_sub6).anInt2524])))
            {
                int i_36_ = (Class68_Sub3.loopCycle - ((Character) class1_sub6).anInt2552);
                int i_37_ = (((Character) class1_sub6).anInt2523 - ((Character) class1_sub6).anInt2552);
                int i_38_ = (((Character) class1_sub6).raw_range * 64 + 128 * ((Character) class1_sub6).anInt2520);
                int i_39_ = (128 * ((Character) class1_sub6).anInt2544 + 64 * ((Character) class1_sub6).raw_range);
                int i_40_ = (64 * ((Character) class1_sub6).raw_range + ((Character) class1_sub6).anInt2521 * 128);
                ((Character) class1_sub6).y = ((i_37_ - i_36_) * i_38_ + i_40_ * i_36_) / i_37_;
                int i_41_ = (((Character) class1_sub6).anInt2561 * 128 + ((Character) class1_sub6).raw_range * 64);
                ((Character) class1_sub6).x = (i_36_ * i_39_ + (i_37_ - i_36_) * i_41_) / i_37_;
            }
            if (i == 128)
            {
                if (((Character) class1_sub6).anInt2590 == 0)
                    ((Character) class1_sub6).turnDirection = 1024;
                if (((Character) class1_sub6).anInt2590 == 1)
                    ((Character) class1_sub6).turnDirection = 1536;
                if (((Character) class1_sub6).anInt2590 == 2)
                    ((Character) class1_sub6).turnDirection = 0;
                if (((Character) class1_sub6).anInt2590 == 3)
                    ((Character) class1_sub6).turnDirection = 512;
                ((Character) class1_sub6).anInt2550 = ((Character) class1_sub6).turnDirection;
                ((Character) class1_sub6).anInt2522 = 0;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "cg.H(" + i + ',' + (class1_sub6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void method1390(int i)
    {
        anIntArray3297 = null;
        anIntArray3307 = null;
        itemDefinitionNodes = null;
        anIntArray3294 = null;
        anIntArray3299 = null;
        anIntArray3302 = null;
        if (i != 32655)
            anIntArray3302 = null;
        aClass69Array3308 = null;
        anIntArray3305 = null;
        aClass100Array3301 = null;
        anIntArray3295 = null;
    }

    static
    {
        anIntArray3302 = new int[anInt3303];
        anIntArray3297 = new int[anInt3303];
        aLong3306 = 0L;
        anIntArray3305 = new int[anInt3303];
        anIntArray3294 = new int[anInt3303];
        anIntArray3295 = new int[anInt3303];
        aClass100Array3301 = new MutableString[anInt3303];
        anIntArray3307 = new int[anInt3303];
        anIntArray3299 = new int[anInt3303];
        itemDefinitionNodes = new MRUNodes(64);
        aClass69Array3308 = new Object5[100];
    }
}
