/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class78
{
    static MutableString aClass100_1389 = Class112.makeMutableString(43, "lila:");
    static Class21_Sub1 aClass21_Sub1_1390;
    static MutableString aClass100_1391;
    static int anInt1392;
    private static MutableString aClass100_1393 = Class112.makeMutableString(43, "Ok");
    static int anInt1394;
    static int anInt1395;
    static int[] anIntArray1396;
    static int anInt1397;
    static int anInt1398;

    static final void method1416(int i)
    {
        if (i <= 26)
            method1416(55);
        anInt1397++;
        Class68_Sub8.aClass98_2872.method1572((byte) 94);
    }

    public static void method1417(int i)
    {
        aClass100_1393 = null;
        aClass100_1391 = null;
        anIntArray1396 = null;
        aClass21_Sub1_1390 = null;
        aClass100_1389 = null;
        if (i != 5756)
            aClass21_Sub1_1390 = null;
    }

    static final void method1418(int i, int i_0_)
    {
        anInt1392++;
        if (i_0_ == Class70.anInt1287)
            Item.aClass68_Sub28_Sub1_2435.method1239((byte) -114, i);
        else
            Class67.anInt1217 = i;
    }

    static final void method1419(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_)
    {
        anInt1395++;
        int i_7_ = i_5_ + i_6_;
        int i_8_ = i_4_ - i_6_;
        int i_9_ = i_5_;
        if (i_1_ == 16324)
        {
            for (/**/; i_7_ > i_9_; i_9_++)
                Class34.method416(i_2_, (byte) -17, i, Class68_Sub22.anIntArrayArray3134[i_9_], i_3_);
            for (int i_10_ = i_4_; i_10_ > i_8_; i_10_--)
                Class34.method416(i_2_, (byte) -17, i, Class68_Sub22.anIntArrayArray3134[i_10_], i_3_);
            int i_11_ = i_2_ + i_6_;
            int i_12_ = i_3_ - i_6_;
            for (int i_13_ = i_7_; i_13_ <= i_8_; i_13_++)
            {
                int[] is = Class68_Sub22.anIntArrayArray3134[i_13_];
                Class34.method416(i_2_, (byte) -17, i, is, i_11_);
                Class34.method416(i_12_, (byte) -17, i, is, i_3_);
            }
        }
    }

    static final int method1420(int i, int i_14_, int i_15_, byte i_16_, int i_17_)
    {
        anInt1398++;
        if (i_16_ != 25)
            return -88;
        int i_18_ = 65536 - Class62.PRECOMUPTED_COSINE_CACHE[1024 * i / i_17_] >> 1;
        return (i_15_ * i_18_ >> 16) + ((65536 - i_18_) * i_14_ >> 16);
    }

    static
    {
        aClass100_1391 = aClass100_1393;
    }
}
