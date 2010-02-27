/* Class68_Sub20_Sub13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub13_Sub2 extends Class68_Sub20_Sub13
{
    static int anInt4619;
    static int anInt4620;
    static int anInt4621;
    static int anInt4622;
    static MutableString aClass100_4623;
    static MutableString aClass100_4624 = Class112.makeMutableString(43, " steht bereits auf Ihrer Freunde)2Liste(Q");
    static MutableString aClass100_4625;
    static MutableString aClass100_4626;
    static int anInt4627;
    static int anInt4628;
    private Object anObject4629;
    static int anInt4630;
    static boolean aBoolean4631;
    static Class68_Sub19[] aClass68_Sub19Array4632;
    private static MutableString aClass100_4633;

    final boolean method1163(int i)
    {
        anInt4619++;
        int i_0_ = -40 % ((-43 - i) / 62);
        return false;
    }

    public static void method1164(int i)
    {
        aClass100_4625 = null;
        aClass100_4626 = null;
        aClass100_4633 = null;
        aClass100_4623 = null;
        aClass100_4624 = null;
        if (i != -840517817)
            method1164(43);
        aClass68_Sub19Array4632 = null;
    }

    static final int method1165(int i, int i_1_)
    {
        anInt4627++;
        if (i_1_ != -840517817)
            method1165(71, 80);
        return i >>> 7;
    }

    final Object method1161(int i)
    {
        if (i >= -49)
            return null;
        anInt4630++;
        return anObject4629;
    }

    static final MutableString method1166(int i, MutableString[] class100s)
    {
        try
        {
            anInt4628++;
            if (i > class100s.length)
                throw new IllegalArgumentException();
            return Class68_Sub20_Sub10.method1106(true, 0, class100s, class100s.length);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("o.H(" + i + ',' + (class100s != null ? "{...}" : "null") + ')'));
        }
    }

    Class68_Sub20_Sub13_Sub2(Object object)
    {
        try
        {
            anObject4629 = object;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "o.<init>(" + (object != null ? "{...}" : "null") + ')');
        }
    }

    static
    {
        aClass100_4623 = Class112.makeMutableString(43, "<img=1>");
        aClass100_4625 = Class112.makeMutableString(43, " )2> <col=ffffff>");
        aBoolean4631 = true;
        aClass100_4633 = Class112.makeMutableString(43, "Discard");
        aClass100_4626 = aClass100_4633;
    }
}
