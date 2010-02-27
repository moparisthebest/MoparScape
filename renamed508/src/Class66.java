/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class66
{
    static Keyboard keyboard = new Keyboard();
    static int anInt1201;
    static int anInt1202;
    static Class21 aClass21_1203;
    static int anInt1204;
    static int anInt1205;

    public static void method636(int i)
    {
        if (i == 0)
        {
            keyboard = null;
            aClass21_1203 = null;
        }
    }

    static final Widget method637(int i, boolean bool, int i_0_)
    {
        if (bool != false)
            keyboard = null;
        Widget class45 = Class68_Sub20_Sub15.method1170(i, (byte) -80);
        anInt1202++;
        if (i_0_ == -1)
            return class45;
        if (class45 == null || ((Widget) class45).widgetCache == null || ((Widget) class45).widgetCache.length <= i_0_)
            return null;
        return ((Widget) class45).widgetCache[i_0_];
    }

    static final void method638(int i, int i_1_, int i_2_)
    {
        Class3.anIntArray79[i_2_] = i_1_;
        Class68_Sub15 class68_sub15 = ((Class68_Sub15) Class37.aClass113_646.method1684((long) i_2_, -88));
        anInt1204++;
        int i_3_ = 124 % ((i + 11) / 61);
        if (class68_sub15 != null)
        {
            if (((Class68_Sub15) class68_sub15).aLong3016 != 4611686018427387905L)
                ((Class68_Sub15) class68_sub15).aLong3016 = 0x4000000000000000L | Class36.method438(17161) + 500L;
        } else
        {
            class68_sub15 = new Class68_Sub15(4611686018427387905L);
            Class37.aClass113_646.method1683((byte) -57, class68_sub15, (long) i_2_);
        }
    }
}
