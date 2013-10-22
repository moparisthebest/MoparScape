/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119
{
    static int anInt2087;
    static MutableString aClass100_2088;
    static int anInt2089;
    static int anInt2090;
    static int[] mapDataAreas;
    static int anInt2092;
    private static MutableString aClass100_2093 = Class112.makeMutableString(43, "Examine");

    static final void method1739(int i, int[][] is)
    {
        try
        {
            Class68_Sub22.anIntArrayArray3134 = is;
            if (i != 128)
                method1742(-15, -16, 76, null);
            anInt2089++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "uh.E(" + i + ',' + (is != null ? "{...}" : "null") + ')');
        }
    }

    public static void method1740(int i)
    {
        aClass100_2088 = null;
        aClass100_2093 = null;
        mapDataAreas = null;
        if (i >= -32)
            method1742(97, -124, 127, null);
    }

    static final void method1741(int i)
    {
        for (int i_0_ = 0; Class56.anInt1059 > i_0_; i_0_++)
        {
            Class32 class32 = Class68_Sub13_Sub23.method813(-85, i_0_);
            if (class32 != null && ((Class32) class32).anInt564 == 0)
            {
                Class3.anIntArray79[i_0_] = 0;
                Class103.settingArray[i_0_] = 0;
            }
        }
        int i_1_ = -112 % ((i + 72) / 51);
        anInt2087++;
        Class37.aClass113_646 = new NodeCache(16);
    }

    static final Class68_Sub20_Sub10 method1742(int i, int i_2_, int i_3_, Class21 class21)
    {
        try
        {
            anInt2092++;
            if (i != 64)
                return null;
            if (!Class68_Sub13_Sub36.method880(-29381, i_2_, class21, i_3_))
                return null;
            return Class87.method1496((byte) -109);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uh.D(" + i + ',' + i_2_ + ',' + i_3_ + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1743(int i, int i_4_, int i_5_, int i_6_, Animable class1, Animable class1_7_, int i_8_, int i_9_, long l)
    {
        if (class1 != null || class1_7_ != null)
        {
            Object1 class64 = new Object1();
            ((Object1) class64).uid = l;
            ((Object1) class64).anInt1183 = i_4_ * 128 + 64;
            ((Object1) class64).anInt1176 = i_5_ * 128 + 64;
            ((Object1) class64).anInt1186 = i_6_;
            ((Object1) class64).aClass1_1181 = class1;
            ((Object1) class64).aClass1_1184 = class1_7_;
            ((Object1) class64).anInt1187 = i_8_;
            ((Object1) class64).anInt1177 = i_9_;
            for (int i_10_ = i; i_10_ >= 0; i_10_--)
            {
                if (Class22.groundArray[i_10_][i_4_][i_5_] == null)
                    Class22.groundArray[i_10_][i_4_][i_5_] = new Ground(i_10_, i_4_, i_5_);
            }
            ((Ground) (Class22.groundArray[i][i_4_][i_5_])).object_1 = class64;
        }
    }

    static
    {
        aClass100_2088 = aClass100_2093;
    }
}
