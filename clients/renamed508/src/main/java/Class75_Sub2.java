/* Class75_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class75_Sub2 extends Class75
{
    static MutableString aClass100_3309;
    static int anInt3310;
    static MutableString aClass100_3311 = (Class112.makeMutableString(43, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100"));
    static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array3312;
    static Class124 aClass124_3313;
    private static MutableString aClass100_3314;
    static int anInt3315;
    static boolean safemode;
    static int destinationY;
    static int anInt3318;
    static MutableString aClass100_3319;

    public static void method1397(byte i)
    {
        aClass100_3309 = null;
        aClass100_3314 = null;
        int i_0_ = -45 % ((i - 82) / 42);
        aClass124_3313 = null;
        aClass68_Sub20_Sub10Array3312 = null;
        aClass100_3319 = null;
        aClass100_3311 = null;
    }

    static final boolean method1398(long l, int i, int i_1_, int i_2_)
    {
        int i_3_ = (0x39a537 & (int) l) >> 20;
        int i_4_ = (int) l >> 14 & 0x1f;
        anInt3310++;
        int i_5_ = 0x7fffffff & (int) (l >>> 32);
        if (i_4_ != 10 && i_4_ != 11 && i_4_ != 22)
            Class68_Sub13_Sub3.method713(i_3_, i_4_ + 1, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i, true, 0, -3, 2, i_2_);
        else
        {
            ObjectDefinition class116 = Class1_Sub5.method140(91, i_5_);
            int i_6_;
            int i_7_;
            if (i_3_ == 0 || i_3_ == 2)
            {
                i_7_ = ((ObjectDefinition) class116).anInt1989;
                i_6_ = ((ObjectDefinition) class116).anInt1990;
            } else
            {
                i_6_ = ((ObjectDefinition) class116).anInt1989;
                i_7_ = ((ObjectDefinition) class116).anInt1990;
            }
            int i_8_ = ((ObjectDefinition) class116).anInt1992;
            if (i_3_ != 0)
                i_8_ = (0xf & i_8_ << i_3_) + (i_8_ >> 4 - i_3_);
            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), i_7_, i_6_, i, true, i_8_, -3, 2, i_2_);
        }
        Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
        Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
        client.anInt2378 = 2;
        if (i_1_ != -12974)
            aClass100_3319 = null;
        Class26.anInt523 = 0;
        return true;
    }

    static
    {
        aClass100_3309 = Class112.makeMutableString(43, "VOLL");
        anInt3315 = 0;
        safemode = false;
        destinationY = 0;
        aClass100_3314 = Class112.makeMutableString(43, "FULL");
        aClass100_3319 = aClass100_3314;
    }
}
