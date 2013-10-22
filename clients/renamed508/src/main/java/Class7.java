/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class7
{
    int anInt117;
    static MutableString aClass100_118 = null;
    int anInt119;
    static int anInt120;
    int anInt121;
    static int anInt122;
    static MutableString aClass100_123 = Class112.makeMutableString(43, "p12_full");
    static MRUNodes aClass98_124;
    int anInt125;
    boolean aBoolean126 = true;
    static MutableString aClass100_127;
    static int anInt128;
    int anInt129;
    static int[][] anIntArrayArray130;
    int anInt131;
    static boolean aBoolean132;
    static byte[][] aByteArrayArray133;
    static int[] anIntArray134;
    private static MutableString aClass100_135;
    static Class21_Sub1 aClass21_Sub1_136;
    static MutableString aClass100_137;

    static final void method199(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, int i_5_)
    {
        anInt128++;
        int i_6_ = Class68_Sub20_Sub15.method1171(i_0_, Class51.anInt2257, (byte) 114, Class35.anInt605);
        int i_7_ = Class68_Sub20_Sub15.method1171(i_4_, Class51.anInt2257, (byte) 114, Class35.anInt605);
        int i_8_ = Class68_Sub20_Sub15.method1171(i_5_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        int i_9_ = Class68_Sub20_Sub15.method1171(i_1_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        int i_10_ = Class68_Sub20_Sub15.method1171(i_0_ + i, Class51.anInt2257, (byte) 114, Class35.anInt605);
        int i_11_ = Class68_Sub20_Sub15.method1171(i_4_ - i, Class51.anInt2257, (byte) 114, Class35.anInt605);
        for (int i_12_ = i_6_; i_10_ > i_12_; i_12_++)
            Class34.method416(i_8_, (byte) -17, i_3_, Class68_Sub22.anIntArrayArray3134[i_12_], i_9_);
        if (bool != false)
            anInt122 = 118;
        for (int i_13_ = i_7_; i_13_ > i_11_; i_13_--)
            Class34.method416(i_8_, (byte) -17, i_3_, Class68_Sub22.anIntArrayArray3134[i_13_], i_9_);
        int i_14_ = Class68_Sub20_Sub15.method1171(i_5_ + i, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        int i_15_ = Class68_Sub20_Sub15.method1171(i_1_ - i, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        for (int i_16_ = i_10_; i_16_ <= i_11_; i_16_++)
        {
            int[] is = Class68_Sub22.anIntArrayArray3134[i_16_];
            Class34.method416(i_8_, (byte) -17, i_3_, is, i_14_);
            Class34.method416(i_14_, (byte) -17, i_2_, is, i_15_);
            Class34.method416(i_15_, (byte) -17, i_3_, is, i_9_);
        }
    }

    public static void method200(byte i)
    {
        aClass21_Sub1_136 = null;
        aClass100_127 = null;
        anIntArray134 = null;
        aClass100_118 = null;
        aClass100_137 = null;
        anIntArrayArray130 = null;
        aClass100_123 = null;
        aByteArrayArray133 = null;
        aClass100_135 = null;
        if (i > 17)
            aClass98_124 = null;
    }

    static final int method201(int i)
    {
        int i_17_ = 121 / ((63 - i) / 46);
        anInt120++;
        return 6;
    }

    Class7(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, boolean bool)
    {
        ((Class7) this).anInt121 = i_18_;
        ((Class7) this).aBoolean126 = bool;
        ((Class7) this).anInt119 = i_22_;
        ((Class7) this).anInt125 = i_21_;
        ((Class7) this).anInt129 = i_19_;
        ((Class7) this).anInt117 = i_20_;
        ((Class7) this).anInt131 = i;
    }

    static
    {
        anInt122 = 0;
        aClass100_127 = Class112.makeMutableString(43, "(U5");
        anIntArrayArray130 = (new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } });
        aClass98_124 = new MRUNodes(50);
        anIntArray134 = new int[2];
        aClass100_135 = Class112.makeMutableString(43, " more options");
        aClass100_137 = aClass100_135;
    }
}
