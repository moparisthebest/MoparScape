/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43
{
    int[] anIntArray731;
    static int anInt732;
    ClientScript aClass68_Sub20_Sub14_733;
    static Class89 aClass89_734;
    static int anInt735;
    int anInt736 = -1;
    static int anInt737;
    MutableString[] aClass100Array738;
    static int anInt739 = 0;
    static int anInt740;
    static boolean aBoolean741 = true;

    static final void method480(int i, int i_0_)
    {
        anInt737++;
        if (Class68_Sub13_Sub25.method824(i, (byte) -2))
            Class18.method302(0, Class68_Sub13_Sub36.widgetCache[i], i_0_);
    }

    static final void method481(int i, Class21 class21)
    {
        try
        {
            if (i != 3)
                aClass89_734 = null;
            Class68_Sub13.aClass92_Sub1Array2923 = Animable.method59(Class68_Sub20_Sub15.anInt4404, class21, false);
            anInt740++;
            Class68_Sub25.anIntArray3174 = new int[256];
            for (int i_1_ = 0; i_1_ < 3; i_1_++)
            {
                float f = (float) (0xff & (Class68_Sub13_Sub21.anIntArray3788[i_1_] >> 16));
                int i_2_ = (0xff & Class68_Sub13_Sub21.anIntArray3788[i_1_ + 1] >> 16);
                float f_3_ = (float) (Class68_Sub13_Sub21.anIntArray3788[i_1_] >> 8 & 0xff);
                float f_4_ = (-f + (float) i_2_) / 64.0F;
                int i_5_ = Class68_Sub13_Sub21.anIntArray3788[i_1_ + 1] >> 8 & 0xff;
                float f_6_ = (-f_3_ + (float) i_5_) / 64.0F;
                float f_7_ = (float) (0xff & Class68_Sub13_Sub21.anIntArray3788[i_1_]);
                int i_8_ = Class68_Sub13_Sub21.anIntArray3788[i_1_ + 1] & 0xff;
                float f_9_ = ((float) i_8_ - f_7_) / 64.0F;
                for (int i_10_ = 0; i_10_ < 64; i_10_++)
                {
                    Class68_Sub25.anIntArray3174[i_10_ + 64 * i_1_] = Class70.OR((int) f_7_, Class70.OR((int) f << 16, ((int) f_3_ << 8)));
                    f_3_ += f_6_;
                    f += f_4_;
                    f_7_ += f_9_;
                }
            }
            for (int i_11_ = 192; i_11_ < 255; i_11_++)
                Class68_Sub25.anIntArray3174[i_11_] = Class68_Sub13_Sub21.anIntArray3788[3];
            Class68_Sub19.anIntArray3079 = new int[32768];
            Class68_Sub20_Sub6.anIntArray4232 = new int[32768];
            Class84.method1482(i + 96, null);
            Class90.anIntArray2347 = new int[32768];
            NodeSub.anIntArray3092 = new int[32768];
            GameException.aClass68_Sub20_Sub10_Sub1_2248 = new Sprite(128, 254);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("gk.C(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    public Class43()
    {
        /* empty */
    }

    public static void method482(int i)
    {
        if (i != -2)
            anInt739 = -115;
        aClass89_734 = null;
    }

    static final void method483(int i, int i_12_, int i_13_, int i_14_, int i_15_, byte i_16_, int i_17_, int i_18_)
    {
        anInt735++;
        if (i_16_ > 115)
        {
            if (i_15_ >= 0 && i >= 0 && i_15_ < 103 && i < 103)
            {
                if (i_18_ == 0)
                {
                    Object1 class64 = Class68_Sub13_Sub6.method724(i_13_, i_15_, i);
                    if (class64 != null)
                    {
                        int i_19_ = (0x7fffffff & (int) (((Object1) class64).uid >>> 32));
                        if (i_12_ != 2)
                            ((Object1) class64).aClass1_1181 = new Class1_Sub7(i_19_, i_12_, i_14_, i_13_, i_15_, i, i_17_, false, (((Object1) class64).aClass1_1181));
                        else
                        {
                            ((Object1) class64).aClass1_1181 = new Class1_Sub7(i_19_, 2, i_14_ + 4, i_13_, i_15_, i, i_17_, false, (((Object1) class64).aClass1_1181));
                            ((Object1) class64).aClass1_1184 = new Class1_Sub7(i_19_, 2, 0x3 & i_14_ + 1, i_13_, i_15_, i, i_17_, false, (((Object1) class64).aClass1_1184));
                        }
                    }
                }
                if (i_18_ == 1)
                {
                    Object2 class76 = Class26.method388(i_13_, i_15_, i);
                    if (class76 != null)
                    {
                        int i_20_ = ((int) (((Object2) class76).uid >>> 32) & 0x7fffffff);
                        if (i_12_ != 4 && i_12_ != 5)
                        {
                            if (i_12_ == 6)
                                ((Object2) class76).aClass1_1358 = new Class1_Sub7(i_20_, 4, i_14_ + 4, i_13_, i_15_, i, i_17_, false, (((Object2) class76).aClass1_1358));
                            else if (i_12_ == 7)
                                ((Object2) class76).aClass1_1358 = new Class1_Sub7(i_20_, 4, (i_14_ + 2 & 0x3) + 4, i_13_, i_15_, i, i_17_, false, (((Object2) class76).aClass1_1358));
                            else if (i_12_ == 8)
                            {
                                ((Object2) class76).aClass1_1358 = new Class1_Sub7(i_20_, 4, i_14_ + 4, i_13_, i_15_, i, i_17_, false, (((Object2) class76).aClass1_1358));
                                ((Object2) class76).aClass1_1360 = new Class1_Sub7(i_20_, 4, (i_14_ + 2 & 0x3) + 4, i_13_, i_15_, i, i_17_, false, (((Object2) class76).aClass1_1360));
                            }
                        } else
                            ((Object2) class76).aClass1_1358 = new Class1_Sub7(i_20_, 4, i_14_, i_13_, i_15_, i, i_17_, false, (((Object2) class76).aClass1_1358));
                    }
                }
                if (i_18_ == 2)
                {
                    if (i_12_ == 11)
                        i_12_ = 10;
                    Object5 class69 = Class102.method1633(i_13_, i_15_, i);
                    if (class69 != null)
                        ((Object5) class69).aClass1_1242 = new Class1_Sub7((int) ((((Object5) class69).uid) >>> 32) & 0x7fffffff, i_12_, i_14_, i_13_, i_15_, i, i_17_, false, (((Object5) class69).aClass1_1242));
                }
                if (i_18_ == 3)
                {
                    Object3 class47 = Class68_Sub13_Sub28.method848(i_13_, i_15_, i);
                    if (class47 != null)
                        ((Object3) class47).aClass1_931 = new Class1_Sub7((0x7fffffff & (int) ((((Object3) class47).uid) >>> 32)), 22, i_14_, i_13_, i_15_, i, i_17_, false, ((Object3) class47).aClass1_931);
                }
            }
        }
    }
}
