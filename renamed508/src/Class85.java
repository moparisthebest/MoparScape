/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class85
{
    private static MutableString aClass100_1549;
    static int anInt1550;
    static int anInt1551;
    static MutableString aClass100_1552 = Class112.makeMutableString(43, "name_icons");
    static int anInt1553;
    private static MutableString aClass100_1554 = Class112.makeMutableString(43, "Players");
    static Signlink signlink;
    static byte[][][] aByteArrayArrayArray1556;
    static int anInt1557;
    static MutableString aClass100_1558;
    static int anInt1559;
    static int cameraPositionY;
    static MutableString aClass100_1561;
    static int anInt1562;
    static int anInt1563;
    static int anInt1564;
    static int[] localPlayerIndices;
    static MutableString aClass100_1566;

    public static void method1485(int i)
    {
        aClass100_1558 = null;
        aClass100_1561 = null;
        aClass100_1552 = null;
        aClass100_1566 = null;
        signlink = null;
        aClass100_1549 = null;
        localPlayerIndices = null;
        aByteArrayArrayArray1556 = null;
        if (i != 0)
            signlink = null;
        aClass100_1554 = null;
    }

    static final void method1486(int i, Sprite[] class68_sub20_sub10_sub1s, Class21 class21, Class92_Sub1[] class92_sub1s, Class92_Sub1[] class92_sub1s_0_, Class92_Sub1[] class92_sub1s_1_, Class92_Sub1[] class92_sub1s_2_)
    {
        try
        {
            Class87.aClass21_1590 = class21;
            Class68_Sub19.aClass92_Sub1Array3071 = class92_sub1s_0_;
            Character.aClass92_Sub1Array2560 = class92_sub1s_2_;
            Class68_Sub13_Sub9.aClass68_Sub20_Sub10_Sub1Array3571 = class68_sub20_sub10_sub1s;
            if (i != -10675)
                anInt1550 = -51;
            anInt1562++;
            Class68_Sub13_Sub31.aClass92_Sub1Array3975 = class92_sub1s;
            Class68_Sub13_Sub2.aClass92_Sub1Array3465 = class92_sub1s_1_;
            Class35.aClass16_602.method284(105);
            int i_3_ = Class87.aClass21_1590.getIndex(Animation.aClass100_2054, (byte) -126);
            int[] is = Class87.aClass21_1590.getData(i_3_);
            for (int i_4_ = 0; is.length > i_4_; i_4_++)
                Class35.aClass16_602.pushFront(Class4.method184(new Stream(Class87.aClass21_1590.method338(is[i_4_], 0, i_3_)), i + 10676));
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("oc.C(" + i + ',' + (class68_sub20_sub10_sub1s != null ? "{...}" : "null") + ',' + (class21 != null ? "{...}" : "null") + ',' + (class92_sub1s != null ? "{...}" : "null") + ',' + (class92_sub1s_0_ != null ? "{...}" : "null") + ',' + (class92_sub1s_1_ != null ? "{...}" : "null") + ',' + (class92_sub1s_2_ != null ? "{...}" : "null") + ')'));
        }
    }

    static final Class68_Sub20_Sub1 method1487(byte[] is, boolean bool)
    {
        try
        {
            anInt1563++;
            if (is == null)
                return null;
            if (bool != false)
                method1487(null, false);
            Class68_Sub20_Sub1_Sub1 class68_sub20_sub1_sub1 = new Class68_Sub20_Sub1_Sub1(is, Class4.anIntArray96, ObjectDefinition.anIntArray1998, (Class68_Sub13_Sub12.anIntArray3641), (Class68_Sub13_Sub19.anIntArray3759), Object5.aByteArrayArray1240);
            Class87.method1493((byte) -93);
            return class68_sub20_sub1_sub1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "oc.B(" + (is != null ? "{...}" : "null") + ',' + bool + ')');
        }
    }

    static
    {
        aClass100_1549 = Class112.makeMutableString(43, "Loaded update list");
        anInt1551 = 500;
        anInt1550 = 0;
        aClass100_1558 = Class112.makeMutableString(43, "<col=ffff00>");
        aClass100_1561 = aClass100_1554;
        localPlayerIndices = new int[2048];
        aClass100_1566 = aClass100_1549;
    }
}
