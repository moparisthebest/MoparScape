/* Class68_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub7 extends Class68 {
    public static int anInt2848;
    public boolean[] aBooleanArray2849;
    public int anInt2850;
    public static int anInt2851;
    public static int anInt2852;
    public int[] anIntArray2853;
    public static Class128 aClass128_2854 = new Class128();
    public int[][] anIntArrayArray2855;
    public static int anInt2856;
    public int anInt2857;
    public static RSString aRSString_2858;
    public static int anInt2859;
    public static Class1_Sub6_Sub2 aClass1_Sub6_Sub2_2860;
    public static RSString aRSString_2861;
    public static int anInt2862;
    public static RSString aRSString_2863
            = RSString.newRsString("Prepared sound engine");

    public static void method665(Class68_Sub20_Sub1 class68_sub20_sub1,
                                 int i) {
        anInt2856++;
        class68_sub20_sub1.method1032(Class48.aRSString_952,
                Class13_Sub3.width / 2,
                Class68_Sub13_Sub9.height / 2 + -26,
                16777215, -1);
        int i_0_ = Class68_Sub13_Sub9.height / 2 + -18;
        if (i != -27931)
            method670(false, (byte) 82);
        Class79.method1415(Class13_Sub3.width / 2 - 152, i_0_, 304, 34,
                9179409);
        Class79.method1415(Class13_Sub3.width / 2 - 151, i_0_ - -1, 302,
                32, 0);
        Class79.method1439(-150 + Class13_Sub3.width / 2, 2 + i_0_,
                Class68_Sub13_Sub28.anInt3917 * 3, 30, 9179409);
        Class79.method1439(-150 + (Class13_Sub3.width / 2
                - -(3 * Class68_Sub13_Sub28.anInt3917)),
                i_0_ - -2,
                300 + -(Class68_Sub13_Sub28.anInt3917 * 3), 30, 0);
        class68_sub20_sub1.method1032(Class68_Sub29.aRSString_3235,
                Class13_Sub3.width / 2,
                4 + Class68_Sub13_Sub9.height / 2,
                16777215, -1);
    }

    public static int method666(int i) {
        anInt2851++;
        if (Class63.aBoolean1170)
            return 0;
        if (i != 1)
            aRSString_2858 = null;
        if (!Class28.method398(24781))
            return 1;
        if (!Class68_Sub20_Sub2.aBoolean4188)
            return 1;
        return 2;
    }

    public static void method667(Class21renamed class21, int i) {
        if (i == -5545) {
            Class69.anInt1248
                    = class21.method335(Class32.aRSString_569, (byte) -84);
            anInt2859++;
            Class1_Sub5.anInt2514
                    = class21.method335(Class124.aRSString_2141, (byte) -125);
            Class68_Sub20_Sub3.anInt4210
                    = class21.method335(PacketStream.aRSString_4134,
                    (byte) -127);
            Class68_Sub13_Sub27.anInt3911
                    = class21.method335(Class86.aRSString_1569, (byte) -103);
        }
    }

    public static void method668(int i) {
        aClass128_2854 = null;
        if (i != 304)
            method666(-74);
        aRSString_2863 = null;
        aRSString_2858 = null;
        aRSString_2861 = null;
        aClass1_Sub6_Sub2_2860 = null;
    }

    public static void method669(int i) {
        int i_1_ = -1;
        int i_2_ = -71 / ((-81 - i) / 38);
        for (/**/; client.anInt2382 > i_1_; i_1_++) {
            int i_3_;
            if ((i_1_ ^ 0xffffffff) != 0)
                i_3_ = Class85.anIntArray1563[i_1_];
            else
                i_3_ = 2047;
            Class1_Sub6_Sub2 class1_sub6_sub2
                    = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_3_];
            if (class1_sub6_sub2 != null)
                Class51.method537(class1_sub6_sub2, 128,
                        class1_sub6_sub2.anInt2544);
        }
        anInt2852++;
    }

    public static void method670(boolean bool, byte i) {
        if (i == 84) {
            byte[][] is = Class68_Sub20_Sub11.aByteArrayArray4332;
            int i_4_ = Class23.aByteArrayArray490.length;
            for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
                byte[] is_6_ = is[i_5_];
                if (is_6_ != null) {
                    int i_7_ = (-Class36.anInt643
                            + 64 * (Class119.anIntArray2089[i_5_]
                            >> 1554965704));
                    int i_8_ = ((Class119.anIntArray2089[i_5_] & 0xff) * 64
                            - Class68_Sub13_Sub35.anInt4026);
                    Class49.method524(i ^ 0x3f96);
                    Class68_Sub8.method673(i_7_, i_8_, is_6_, bool,
                            Class109.aClass38Array1843, false);
                }
            }
            anInt2848++;
        }
    }

    public Class68_Sub7(int i, byte[] is) {
        anInt2857 = i;
        Stream class68_sub14 = new Stream(is);
        anInt2850 = class68_sub14.readUnsignedByte(-6677);
        aBooleanArray2849 = new boolean[anInt2850];
        anIntArrayArray2855 = new int[anInt2850][];
        anIntArray2853 = new int[anInt2850];
        for (int i_9_ = 0; i_9_ < anInt2850; i_9_++)
            anIntArray2853[i_9_] = class68_sub14.readUnsignedByte(-6677);
        for (int i_10_ = 0; (anInt2850 ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
             i_10_++)
            aBooleanArray2849[i_10_]
                    = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
        for (int i_11_ = 0; i_11_ < anInt2850; i_11_++)
            anIntArrayArray2855[i_11_]
                    = new int[class68_sub14.readUnsignedByte(-6677)];
        for (int i_12_ = 0; (anInt2850 ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
             i_12_++) {
            for (int i_13_ = 0;
                 ((i_13_ ^ 0xffffffff)
                         > (anIntArrayArray2855[i_12_].length ^ 0xffffffff));
                 i_13_++)
                anIntArrayArray2855[i_12_][i_13_]
                        = class68_sub14.readUnsignedByte(-6677);
        }
    }

    static {
        aRSString_2858 = RSString.newRsString("null");
        aRSString_2861 = aRSString_2863;
    }
}
