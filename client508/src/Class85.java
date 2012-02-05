/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class85 {
    public static RSString aRSString_1547;
    public static int anInt1548;
    public static int anInt1549;
    public static RSString aRSString_1550
            = RSString.newRsString("name_icons");
    public static int anInt1551;
    public static RSString aRSString_1552 = RSString.newRsString("Players");
    public static SignLink aSignLink_1553;
    public static byte[][][] aByteArrayArrayArray1554;
    public static int anInt1555;
    public static RSString aRSString_1556;
    public static int anInt1557;
    public static int anInt1558;
    public static RSString aRSString_1559;
    public static int anInt1560;
    public static int anInt1561;
    public static int anInt1562;
    public static int[] anIntArray1563;
    public static RSString aRSString_1564;

    public static void method1479(int i) {
        aRSString_1556 = null;
        aRSString_1559 = null;
        aRSString_1550 = null;
        aRSString_1564 = null;
        aSignLink_1553 = null;
        aRSString_1547 = null;
        anIntArray1563 = null;
        aByteArrayArrayArray1554 = null;
        if (i != 0)
            aSignLink_1553 = null;
        aRSString_1552 = null;
    }

    public static void method1480
            (int i, Sprite[] sprites,
             Class21renamed class21, Class92_Sub1[] class92_sub1s,
             Class92_Sub1[] class92_sub1s_0_, Class92_Sub1[] class92_sub1s_1_,
             Class92_Sub1[] class92_sub1s_2_) {
        try {
            Class87.aClass21_1588 = class21;
            Class68_Sub19.aClass92_Sub1Array3069 = class92_sub1s_0_;
            Class1_Sub6.aClass92_Sub1Array2558 = class92_sub1s_2_;
            Class68_Sub13_Sub9.aSpriteArray3569
                    = sprites;
            if (i != -10675)
                anInt1548 = -51;
            anInt1560++;
            Class68_Sub13_Sub31.aClass92_Sub1Array3973 = class92_sub1s;
            Class68_Sub13_Sub2.aClass92_Sub1Array3463 = class92_sub1s_1_;
            Class35.aClass16_602.method284(105);
            int i_3_ = Class87.aClass21_1588.method335(Class55.aRSString_2052,
                    (byte) -126);
            int[] is = Class87.aClass21_1588.method345(false, i_3_);
            for (int i_4_ = 0; is.length > i_4_; i_4_++)
                Class35.aClass16_602.method286
                        (Class4.method184(new Stream(Class87
                                .aClass21_1588
                                .method338
                                        (is[i_4_], 0, i_3_)),
                                i + 10676),
                                true);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652
                    (runtimeexception,
                            ("oc.C(" + i + ','
                                    + (sprites != null ? "{...}"
                                    : "null")
                                    + ',' + (class21 != null ? "{...}" : "null") + ','
                                    + (class92_sub1s != null ? "{...}" : "null") + ','
                                    + (class92_sub1s_0_ != null ? "{...}" : "null") + ','
                                    + (class92_sub1s_1_ != null ? "{...}" : "null") + ','
                                    + (class92_sub1s_2_ != null ? "{...}" : "null")
                                    + ')'));
        }
    }

    public static Class68_Sub20_Sub1 method1481(byte[] is, boolean bool) {
        anInt1561++;
        if (is == null)
            return null;
        if (bool != false)
            method1481(null, false);
        Class68_Sub20_Sub1_Sub1 class68_sub20_sub1_sub1
                = new Class68_Sub20_Sub1_Sub1(is, Class4.anIntArray96,
                Class116.anIntArray1996,
                Class68_Sub13_Sub12.anIntArray3639,
                Class68_Sub13_Sub19.anIntArray3757,
                Class69.aByteArrayArray1240);
        Class87.method1487((byte) -93);
        return class68_sub20_sub1_sub1;
    }

    static {
        aRSString_1547 = RSString.newRsString("Loaded update list");
        anInt1549 = 500;
        anInt1548 = 0;
        aRSString_1556 = RSString.newRsString("<col=ffff00>");
        aRSString_1559 = aRSString_1552;
        anIntArray1563 = new int[2048];
        aRSString_1564 = aRSString_1547;
    }
}
