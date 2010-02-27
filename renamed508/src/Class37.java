/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class37
{
    static NodeCache aClass113_646 = new NodeCache(16);
    static int anInt647;
    static int anInt648;
    static Interface2 anInterface2_649 = null;
    static MutableString aClass100_650 = Class112.makeMutableString(43, "b12_full");
    static MutableString aClass100_651;
    static MutableString aClass100_652 = Class112.makeMutableString(43, "null");
    static MutableString aClass100_653;
    static int[] menuActionCommands2;
    static MutableString aClass100_655;

    public static void method440(int i)
    {
        aClass100_651 = null;
        aClass100_652 = null;
        anInterface2_649 = null;
        if (i >= -66)
            aClass100_650 = null;
        menuActionCommands2 = null;
        aClass100_650 = null;
        aClass100_653 = null;
        aClass113_646 = null;
        aClass100_655 = null;
    }

    static final boolean method441(MutableString class100, boolean bool)
    {
        try
        {
            anInt648++;
            if (class100 == null)
                return false;
            for (int i = 0; Class68_Sub13_Sub26.anInt3882 > i; i++)
            {
                if (class100.method1606(false, Class68_Sub4.aClass100Array2829[i]))
                    return true;
            }
            if (bool != true)
                aClass113_646 = null;
            return false;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "g.A(" + (class100 != null ? "{...}" : "null") + ',' + bool + ')');
        }
    }

    static final void method442(int i)
    {
        Class109.aClass68_Sub20_Sub10Array1842 = null;
        anInt647++;
        Class52.aClass92Array1004 = null;
        Item.aClass92Array2444 = null;
        if (i == 500)
            Class34.aClass92Array593 = null;
    }

    static
    {
        aClass100_651 = Class112.makeMutableString(43, " GMT");
        menuActionCommands2 = new int[500];
        aClass100_655 = Class112.makeMutableString(43, "Welt");
    }
}
