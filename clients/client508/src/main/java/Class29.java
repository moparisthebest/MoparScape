/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class29 {
    public static int anInt534;
    public static RSString aRSString_535;
    public static int anInt536;
    public static int anInt537;
    public static RSString aRSString_538;
    public static Class45 aClass45_539 = null;

    public static void method401(int i, int i_0_, RSString class100) {
        anInt536++;
        RSString class100_1_ = class100.method1602(99).method1597(12688);
        boolean bool = false;
        for (int i_2_ = i;
             (i_2_ ^ 0xffffffff) > (client.anInt2382 ^ 0xffffffff); i_2_++) {
            Class1_Sub6_Sub2 class1_sub6_sub2
                    = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                    [Class85.anIntArray1563[i_2_]]);
            if (class1_sub6_sub2 != null
                    && class1_sub6_sub2.aRSString_3414 != null
                    && class1_sub6_sub2.aRSString_3414.method1600(false,
                    class100_1_)) {
                bool = true;
                Class68_Sub13_Sub3.method713
                        (0, 0,
                                Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0],
                                Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0], 1,
                                1, class1_sub6_sub2.anIntArray2570[0], false, 0, -3, 2,
                                class1_sub6_sub2.anIntArray2523[0]);
                if (i_0_ == 1) {
                    Class68_Sub13_Sub28.anInt3927++;
                    Class21renamed.stream.createFrame(160);
                    Class21renamed.stream.writeWordBigEndian(Class85.anIntArray1563[i_2_], (byte) 38);
                } else if ((i_0_ ^ 0xffffffff) == -5) {
                    Class112.anInt1877++;
                    Class21renamed.stream.createFrame(253);
                    Class21renamed.stream
                            .writeWordBigEndianA((byte) 19, Class85.anIntArray1563[i_2_]);
                } else if ((i_0_ ^ 0xffffffff) == -7) {
                    Class1_Sub2.anInt2440++;
                    Class21renamed.stream.createFrame(35);
                    Class21renamed.stream
                            .writeWordBigEndianA((byte) 19, Class85.anIntArray1563[i_2_]);
                } else if (i_0_ == 7) {
                    Class21renamed.stream.createFrame(93);
                    Class21renamed.stream
                            .writeWordBigEndianA((byte) 19, Class85.anIntArray1563[i_2_]);
                    Class68_Sub20_Sub15.anInt4398++;
                }
                break;
            }
        }
        if (!bool)
            Class48.method520(Class68_Sub28_Sub2.aRSString_4556, -85,
                    (Class68_Sub20_Sub13_Sub2.method1166
                            (2, new RSString[]{Class84.aRSString_1536,
                                    class100_1_})),
                    0);
    }

    public static void method402(int i) {
        aRSString_535 = null;
        if (i >= 39) {
            aRSString_538 = null;
            aClass45_539 = null;
        }
    }

    static {
        anInt537 = 0;
        aRSString_538 = RSString.newRsString("Attack");
        aRSString_535 = aRSString_538;
    }
}
