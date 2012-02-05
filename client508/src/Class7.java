/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class7 {
    public int anInt117;
    public static RSString aRSString_118 = null;
    public int anInt119;
    public static int anInt120;
    public int anInt121;
    public static int anInt122;
    public static RSString aRSString_123 = RSString.newRsString("p12_full");
    public static Class98 aClass98_124;
    public int anInt125;
    public boolean aBoolean126 = true;
    public static RSString aRSString_127;
    public static int anInt128;
    public int anInt129;
    public static int[][] anIntArrayArray130;
    public int anInt131;
    public static boolean aBoolean132;
    public static byte[][] aByteArrayArray133;
    public static int[] anIntArray134;
    public static RSString aRSString_135;
    public static Class21_Sub1 aClass21_Sub1_136;
    public static RSString aRSString_137;

    public static void method199(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 int i_4_, boolean bool, int i_5_) {
        anInt128++;
        int i_6_
                = Class68_Sub20_Sub15.method1171(i_0_, Class51.anInt2255,
                (byte) 114, Class35.anInt605);
        int i_7_
                = Class68_Sub20_Sub15.method1171(i_4_, Class51.anInt2255,
                (byte) 114, Class35.anInt605);
        int i_8_
                = Class68_Sub20_Sub15.method1171(i_5_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        int i_9_
                = Class68_Sub20_Sub15.method1171(i_1_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        int i_10_
                = Class68_Sub20_Sub15.method1171(i_0_ + i, Class51.anInt2255,
                (byte) 114, Class35.anInt605);
        int i_11_
                = Class68_Sub20_Sub15.method1171(i_4_ - i, Class51.anInt2255,
                (byte) 114, Class35.anInt605);
        for (int i_12_ = i_6_; i_10_ > i_12_; i_12_++)
            Class34.method416(i_8_, (byte) -17, i_3_,
                    Class68_Sub22.anIntArrayArray3132[i_12_], i_9_);
        if (bool != false)
            anInt122 = 118;
        for (int i_13_ = i_7_; (i_13_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff);
             i_13_--)
            Class34.method416(i_8_, (byte) -17, i_3_,
                    Class68_Sub22.anIntArrayArray3132[i_13_], i_9_);
        int i_14_
                = Class68_Sub20_Sub15.method1171(i_5_ - -i, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        int i_15_
                = Class68_Sub20_Sub15.method1171(-i + i_1_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        for (int i_16_ = i_10_; (i_16_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff);
             i_16_++) {
            int[] is = Class68_Sub22.anIntArrayArray3132[i_16_];
            Class34.method416(i_8_, (byte) -17, i_3_, is, i_14_);
            Class34.method416(i_14_, (byte) -17, i_2_, is, i_15_);
            Class34.method416(i_15_, (byte) -17, i_3_, is, i_9_);
        }
    }

    public static void method200(byte i) {
        aClass21_Sub1_136 = null;
        aRSString_127 = null;
        anIntArray134 = null;
        aRSString_118 = null;
        aRSString_137 = null;
        anIntArrayArray130 = null;
        aRSString_123 = null;
        aByteArrayArray133 = null;
        aRSString_135 = null;
        if (i > 17)
            aClass98_124 = null;
    }

    public static int method201(int i) {
        int i_17_ = 121 / ((63 - i) / 46);
        anInt120++;
        return 6;
    }

    public Class7(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_,
                  boolean bool) {
        anInt121 = i_18_;
        aBoolean126 = bool;
        anInt119 = i_22_;
        anInt125 = i_21_;
        anInt129 = i_19_;
        anInt117 = i_20_;
        anInt131 = i;
    }

    static {
        anInt122 = 0;
        aRSString_127 = RSString.newRsString("(U5");
        anIntArrayArray130
                = (new int[][]
                {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
                        {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3},
                        {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                        {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}});
        aClass98_124 = new Class98(50);
        anIntArray134 = new int[2];
        aRSString_135 = RSString.newRsString(" more options");
        aRSString_137 = aRSString_135;
    }
}
