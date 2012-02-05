/* Class68_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub9 extends Class68 {
    public byte[][][] aByteArrayArrayArray2881;
    public static int anInt2882 = 0;
    public static String serverAddress;
    public int anInt2884;
    public static RSString aRSString_2885
            = RSString.newRsString("Abbrechen");
    public static int anInt2886 = 0;
    public static boolean[][] aBooleanArrayArray2887;
    public int[] anIntArray2888;
    public int[] anIntArray2889;
    public static int anInt2890;
    public static int anInt2891 = 0;
    public static float aFloat2892;
    public int[] anIntArray2893;
    public JagSocket[] aClass31Array2894;
    public static int anInt2895;
    public static int anInt2896;
    public int anInt2897;
    public JagSocket[] aClass31Array2898;
    public static int anInt2899;

    public static int method677(int i, byte i_0_, int i_1_, int i_2_) {
        anInt2896++;
        if (i_1_ > 243)
            i >>= 4;
        else if (i_1_ > 217)
            i >>= 3;
        else if ((i_1_ ^ 0xffffffff) >= -193) {
            if ((i_1_ ^ 0xffffffff) < -180)
                i >>= 1;
        } else
            i >>= 2;
        if (i_0_ >= -41)
            aBooleanArrayArray2887 = null;
        return ((i_1_ >> -469200223) + (i_2_ >> -888935646 << -1740396694)
                - -(i >> 2023893669 << -1627632793));
    }

    public static void method678(boolean bool, int i) {
        for (int i_3_ = 0;
             (Class13_Sub2.anInt2645 ^ 0xffffffff) < (i_3_ ^ 0xffffffff);
             i_3_++) {
            Class1_Sub6_Sub1 class1_sub6_sub1
                    = (Class102.aClass1_Sub6_Sub1Array1746
                    [Class68_Sub10.anIntArray2906[i_3_]]);
            long l
                    = (0x20000000L
                    | (long) Class68_Sub10.anIntArray2906[i_3_] << -768001120);
            if (class1_sub6_sub1 != null && class1_sub6_sub1.method150(109)
                    && !bool != class1_sub6_sub1.aClass80_3395.aBoolean1420
                    && class1_sub6_sub1.aClass80_3395.method1449(8937)) {
                int i_4_ = class1_sub6_sub1.anInt2561 >> 198532487;
                int i_5_ = class1_sub6_sub1.anInt2537 >> 1446181031;
                if ((i_4_ ^ 0xffffffff) <= -1 && i_4_ < 104
                        && (i_5_ ^ 0xffffffff) <= -1 && i_5_ < 104) {
                    if (class1_sub6_sub1.anInt2544 == 1
                            && ((0x7f & class1_sub6_sub1.anInt2561 ^ 0xffffffff)
                            == -65)
                            && ((0x7f & class1_sub6_sub1.anInt2537 ^ 0xffffffff)
                            == -65)) {
                        if ((Class3.anInt84 ^ 0xffffffff)
                                == (Class76.anIntArrayArray1346[i_4_][i_5_]
                                ^ 0xffffffff))
                            continue;
                        Class76.anIntArrayArray1346[i_4_][i_5_]
                                = Class3.anInt84;
                    }
                    if (!class1_sub6_sub1.aClass80_3395.aBoolean1433)
                        l |= ~0x7fffffffffffffffL;
                    class1_sub6_sub1.anInt2582
                            = Class1_Sub6_Sub2.method163((class1_sub6_sub1
                            .anInt2561),
                            GameSocket.anInt1149,
                            (class1_sub6_sub1
                                    .anInt2537),
                            false);
                    Class68_Sub20_Sub4.method1061
                            (GameSocket.anInt1149, class1_sub6_sub1.anInt2561,
                                    class1_sub6_sub1.anInt2537,
                                    class1_sub6_sub1.anInt2582,
                                    60 + 64 * (class1_sub6_sub1.anInt2544 + -1),
                                    class1_sub6_sub1, class1_sub6_sub1.anInt2548, l,
                                    class1_sub6_sub1.aBoolean2583);
                }
            }
        }
        if (i >= -124)
            method678(false, -2);
        anInt2899++;
    }

    public static int method679(boolean bool, boolean bool_6_, byte i) {
        if (i != 71)
            return 84;
        anInt2895++;
        int i_7_ = 0;
        if (bool)
            i_7_ += Class56.anInt1067 - -Class68_Sub24.anInt3153;
        if (bool_6_)
            i_7_ += Class22.anInt483 + Class128.anInt2227;
        return i_7_;
    }

    public static void method680(int i) {
        aBooleanArrayArray2887 = null;
        aRSString_2885 = null;
        serverAddress = null;
        if (i != -19267)
            aBooleanArrayArray2887 = null;
    }
}
