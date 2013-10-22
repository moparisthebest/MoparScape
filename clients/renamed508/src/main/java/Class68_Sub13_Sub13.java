/* Class68_Sub13_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub13 extends Class68_Sub13
{
    static int anInt3651;
    static MutableString aClass100_3652 = Class112.makeMutableString(43, " steht bereits auf Ihrer Ignorieren)2Liste(Q");
    static int anInt3653;
    static int anInt3654;
    static int anInt3655;
    static int anInt3656;
    static int anInt3657;
    private int anInt3658;
    static MutableString aClass100_3659;
    static int anInt3660;
    private int anInt3661;
    static int anInt3662;
    static int anInt3663;
    private int[] anIntArray3664;
    static int anInt3665 = 0;
    private int anInt3666 = -1;

    static final Class68_Sub20_Sub10 method757(boolean bool, int i, int i_0_, int i_1_, boolean bool_2_, int i_3_, boolean bool_4_, int i_5_)
    {
        anInt3663++;
        ItemDefinition class19 = GameApplet.method18(-25672, i_1_);
        if (i_5_ > 1 && ((ItemDefinition) class19).anIntArray343 != null)
        {
            int i_6_ = -1;
            for (int i_7_ = 0; i_7_ < 10; i_7_++)
            {
                if (((ItemDefinition) class19).anIntArray353[i_7_] <= i_5_ && ((ItemDefinition) class19).anIntArray353[i_7_] != 0)
                    i_6_ = ((ItemDefinition) class19).anIntArray343[i_7_];
            }
            if (i_6_ != -1)
                class19 = GameApplet.method18(-25672, i_6_);
        }
        SpriteFactory class1_sub3_sub1 = class19.method305(-50);
        if (class1_sub3_sub1 == null)
            return null;
        Sprite class68_sub20_sub10_sub1 = null;
        if (((ItemDefinition) class19).certTemplateID != -1)
        {
            class68_sub20_sub10_sub1 = ((Sprite) method757(true, 0, -125, ((ItemDefinition) class19).anInt378, false, 1, true, 10));
            if (class68_sub20_sub10_sub1 == null)
                return null;
        } else if (((ItemDefinition) class19).anInt339 != -1)
        {
            class68_sub20_sub10_sub1 = ((Sprite) method757(false, i, -125, ((ItemDefinition) class19).anInt345, false, i_3_, true, i_5_));
            if (class68_sub20_sub10_sub1 == null)
                return null;
        }
        int[] is = Class79.anIntArray1404;
        int i_8_ = Class79.anInt1403;
        int[] is_9_ = new int[4];
        int i_10_ = Class79.anInt1399;
        Class79.method1442(is_9_);
        Sprite class68_sub20_sub10_sub1_11_ = new Sprite(36, 32);
        if (i_0_ > -123)
            method759(-88, 64);
        Class79.method1438(((Sprite) class68_sub20_sub10_sub1_11_).pixels, 36, 32);
        Class62.method612();
        Class62.method603(16, 16);
        Class62.aBoolean1163 = false;
        int i_12_ = ((ItemDefinition) class19).anInt336;
        if (!bool)
        {
            if (i_3_ == 2)
                i_12_ *= 1.04;
        } else
            i_12_ = (int) (1.5 * (double) i_12_);
        int i_13_ = (Class62.PRECOMUPTED_COSINE_CACHE[((ItemDefinition) class19).anInt389] * i_12_ >> 16);
        int i_14_ = (i_12_ * Class62.PRECOMPUTED_SINE_CACHE[((ItemDefinition) class19).anInt389] >> 16);
        class1_sub3_sub1.method77(0, ((ItemDefinition) class19).anInt395, ((ItemDefinition) class19).anInt355, ((ItemDefinition) class19).anInt389, ((ItemDefinition) class19).anInt358, i_14_ + (((ItemDefinition) class19).anInt391 - class1_sub3_sub1.method56() / 2), i_13_ + ((ItemDefinition) class19).anInt391);
        if (i_3_ >= 1)
        {
            class68_sub20_sub10_sub1_11_.method1118(1);
            if (i_3_ >= 2)
                class68_sub20_sub10_sub1_11_.method1118(16777215);
            Class79.method1438(((Sprite) class68_sub20_sub10_sub1_11_).pixels, 36, 32);
        }
        if (i != 0)
            class68_sub20_sub10_sub1_11_.method1123(i);
        if (((ItemDefinition) class19).certTemplateID == -1)
        {
            if (((ItemDefinition) class19).anInt339 != -1)
            {
                Class79.method1438(((Sprite) class68_sub20_sub10_sub1).pixels, 36, 32);
                class68_sub20_sub10_sub1_11_.method1103(0, 0);
                class68_sub20_sub10_sub1_11_ = class68_sub20_sub10_sub1;
            }
        } else
            class68_sub20_sub10_sub1.method1103(0, 0);
        if (bool_2_ && (((ItemDefinition) class19).anInt381 == 1 || i_5_ != 1) && i_5_ != -1)
            Class18.aClass68_Sub20_Sub1_Sub1_289.method1030(Animable.method50((byte) -83, i_5_), 0, 9, 16776960, 1);
        Class79.method1438(is, i_8_, i_10_);
        Class79.method1428(is_9_);
        Class62.method612();
        Class62.aBoolean1163 = true;
        return class68_sub20_sub10_sub1_11_;
    }

    final void method694(int i)
    {
        anInt3662++;
        super.method694(i);
        anIntArray3664 = null;
    }

    public static void method758(int i)
    {
        aClass100_3659 = null;
        aClass100_3652 = null;
        if (i != 1)
            aClass100_3652 = null;
    }

    final int[][] method697(int i, boolean bool)
    {
        if (bool != true)
            anInt3658 = -127;
        anInt3660++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) 101);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612 && method761(-9))
        {
            int i_15_ = anInt3658 * (Ground.anInt2777 != anInt3661 ? anInt3661 * i / Ground.anInt2777 : i);
            int[] is_16_ = is[1];
            int[] is_17_ = is[0];
            int[] is_18_ = is[2];
            if (Class68_Sub13_Sub19.anInt3748 == anInt3658)
            {
                for (int i_19_ = 0; i_19_ < Class68_Sub13_Sub19.anInt3748; i_19_++)
                {
                    int i_20_ = anIntArray3664[i_15_++];
                    is_18_[i_19_] = Class120.method1746(255, i_20_) << 4;
                    is_16_[i_19_] = Class120.method1746(65280, i_20_) >> 4;
                    is_17_[i_19_] = Class120.method1746(4080, i_20_ >> 12);
                }
            } else
            {
                for (int i_21_ = 0; Class68_Sub13_Sub19.anInt3748 > i_21_; i_21_++)
                {
                    int i_22_ = anInt3658 * i_21_ / Class68_Sub13_Sub19.anInt3748;
                    int i_23_ = anIntArray3664[i_15_ + i_22_];
                    is_18_[i_21_] = Class120.method1746(i_23_, 255) << 4;
                    is_16_[i_21_] = Class120.method1746(i_23_ >> 4, 4080);
                    is_17_[i_21_] = Class120.method1746(i_23_, 16711680) >> 12;
                }
            }
        }
        return is;
    }

    static final int method759(int i, int i_24_)
    {
        if (i_24_ <= 83)
            anInt3665 = 19;
        anInt3651++;
        return i >>> 8;
    }

    final void method700(Stream class68_sub14, int i, int i_25_)
    {
        do
        {
            try
            {
                anInt3656++;
                if ((i ^ 0xffffffff) != i_25_)
                    break;
                anInt3666 = class68_sub14.readUShort();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ib.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_25_ + ')'));
            }
            break;
        } while (false);
    }

    public Class68_Sub13_Sub13()
    {
        super(0, false);
    }

    static final void method760(int i)
    {
        Item.aClass68_Sub28_Sub1_2435.method1249(106);
        Class70.anInt1287 = 1;
        anInt3655++;
        if (i == 16777215)
            GameException.aClass21_2238 = null;
    }

    private final boolean method761(int i)
    {
        anInt3653++;
        int i_26_ = -85 % ((60 - i) / 57);
        if (anIntArray3664 != null)
            return true;
        if (anInt3666 >= 0)
        {
            int i_27_ = Class68_Sub13_Sub19.anInt3748;
            int i_28_ = Ground.anInt2777;
            int i_29_ = (!Class49.anInterface4_966.method9((byte) -111, anInt3666) ? 128 : 64);
            anIntArray3664 = Class49.anInterface4_966.method11(99, anInt3666);
            anInt3661 = i_29_;
            anInt3658 = i_29_;
            Class68_Sub13_Sub15.method764(i_27_, i_28_, true);
            if (anIntArray3664 == null)
                return false;
            return true;
        }
        return false;
    }

    final int method693(byte i)
    {
        anInt3657++;
        if (i > -43)
            method700(null, -25, 81);
        return anInt3666;
    }

    static
    {
        aClass100_3659 = Class112.makeMutableString(43, "Eingabeprozedur geladen)3");
    }
}
