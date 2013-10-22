/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class30
{
    static Class68_Sub20_Sub16 aClass68_Sub20_Sub16_540;
    static NodeList aClass16_541;
    static MutableString aClass100_542;
    static int anInt543;
    static int anInt544 = 0;
    static int anInt545;
    static int anInt546;
    static int anInt547;
    static int[] skillLevels;
    static int anInt549;
    static NodeSubList aClass128_550;
    static MutableString aClass100_551;
    static int anInt552;
    static boolean aBoolean553;

    public static void method403(int i)
    {
        aClass100_551 = null;
        aClass100_542 = null;
        skillLevels = null;
        aClass16_541 = null;
        aClass128_550 = null;
        if (i != 0)
            anInt549 = 122;
        aClass68_Sub20_Sub16_540 = null;
    }

    static final void method404(byte i)
    {
        anInt545++;
        if (i == 113)
            NPCDefinition.anInt1467++;
    }

    static final void method405(int i, Widget class45)
    {
        try
        {
            anInt547++;
            if (i > -124)
                method404((byte) -9);
            Widget class45_0_ = Class68_Sub20_Sub6.method1066((byte) 126, class45);
            int i_1_;
            int i_2_;
            do
            {
                if (class45_0_ != null)
                {
                    i_1_ = ((Widget) class45_0_).anInt873;
                    i_2_ = ((Widget) class45_0_).anInt892;
                    if (client.anInt2387 == 0)
                        break;
                }
                i_1_ = Class68_Sub13_Sub9.appletHeight;
                i_2_ = Class13_Sub3.appletWidth;
            } while (false);
            Class68_Sub20_Sub7.method1075(false, 123, i_1_, i_2_, class45);
            Class68_Sub20_Sub13.method1159(i_1_, class45, i_2_, -1198502738);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ed.C(" + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    static
    {
        aClass100_542 = Class112.makeMutableString(43, "Suche nach Updates )2 ");
        skillLevels = new int[25];
        anInt546 = 0;
        aClass16_541 = new NodeList();
        aClass100_551 = Class112.makeMutableString(43, "W-=hlen Sie eine Option");
        anInt552 = 0;
        aClass128_550 = new NodeSubList();
        aBoolean553 = false;
    }
}
