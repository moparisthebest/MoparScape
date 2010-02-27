/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class122
{
    private static MutableString aClass100_2113 = Class112.makeMutableString(43, "Drop");
    static MutableString aClass100_2114;
    static long[] aLongArray2115;
    static int anInt2116;
    static int anInt2117;
    static volatile int mouseClickLastButton = 0;
    static int anInt2119;
    static MutableString aClass100_2120;

    public static void method1752(int i)
    {
        aClass100_2114 = null;
        aLongArray2115 = null;
        aClass100_2113 = null;
        if (i > -100)
            method1754(53, -1, -71);
        aClass100_2120 = null;
    }

    static final boolean method1753(int i, int i_0_, int i_1_, int i_2_, Animable class1, int i_3_, long l, int i_4_, int i_5_, int i_6_, int i_7_)
    {
        if (class1 == null)
            return true;
        return Class68_Sub13_Sub21.method808(i, i_4_, i_5_, i_6_ - i_4_ + 1, i_7_ - i_5_ + 1, i_0_, i_1_, i_2_, class1, i_3_, true, l);
    }

    static final boolean method1754(int i, int i_8_, int i_9_)
    {
        if (i_9_ != 28446)
            return false;
        if (i_8_ == 11)
            i_8_ = 10;
        anInt2119++;
        if (i_8_ >= 5 && i_8_ <= 8)
            i_8_ = 4;
        ObjectDefinition class116 = Class1_Sub5.method140(88, i);
        return class116.method1710(124, i_8_);
    }

    static
    {
        anInt2117 = 2301979;
        aClass100_2114 = aClass100_2113;
        aLongArray2115 = new long[32];
        aClass100_2120 = Class112.makeMutableString(43, "Starte 3D)2Softwarebibliothek)3");
    }
}
