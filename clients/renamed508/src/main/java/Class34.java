/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class34
{
    static int anInt591;
    static int anInt592 = 0;
    static Class92[] aClass92Array593;
    static Class23[] aClass23Array594;
    static MutableString aClass100_595;
    static int[] anIntArray596;
    static int anInt597 = 0;
    static MutableString aClass100_598;
    static int anInt599;
    private static MutableString aClass100_600;
    static int anInt601;

    static final void method414(int i)
    {
        Class68_Sub2 class68_sub2 = ((Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method293((byte) 76));
        anInt601++;
        for (/**/; class68_sub2 != null; class68_sub2 = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method290((byte) 79))
        {
            if (((Class68_Sub2) class68_sub2).anInt2797 != -1)
                class68_sub2.unlink();
            else
            {
                ((Class68_Sub2) class68_sub2).anInt2796 = 0;
                Class68_Sub13_Sub36.method882(class68_sub2, true);
            }
        }
        if (i != -28968)
            method414(42);
    }

    static final int method415(byte i)
    {
        int i_0_ = 122 / ((51 - i) / 57);
        anInt599++;
        return (((Class106.anInt1803 == 0 ? 0 : 1) << 20) + (((!Class74.aBoolean1324 ? 0 : 1) << 19) + (0x60000 & Object5.anInt1245 << 17) + (((Class43.aBoolean741 ? 1 : 0) << 16) + ((Class68_Sub6.aBoolean2840 ? 1 : 0) << 15)))
                + (((Class68_Sub28_Sub1.aBoolean4523 ? 1 : 0) << 13) + ((Class68_Sub20_Sub13_Sub2.aBoolean4631 ? 1 : 0) << 10) + ((!Class68_Sub22.aBoolean3151 ? 0 : 1) << 9) + (((MutableString.aBoolean2264 ? 1 : 0) << 7) + ((!Item.aBoolean2434 ? 0 : 1) << 6) + ((RandomNumberGenerator.aBoolean1489 ? 1 : 0) << 5))) + (((Class68_Sub20_Sub2.aBoolean4190 ? 1 : 0) << 4) + ((Widget.anInt919 & 0x7) + (((Class23.aBoolean501 ? 1 : 0) << 3)
                - (-((!Class68_Sub13_Sub2.aBoolean3462 ? 0 : 1) << 8) - (0x1800 & Class68_Sub13_Sub26.anInt3878 << 11) - ((Class68_Sub13_Sub25.anInt3857 != 0 ? 1 : 0) << 21)) + ((Class68_Sub20_Sub15.anInt4401 != 0 ? 1 : 0) << 22)))));
    }

    static final void method416(int i, byte i_1_, int i_2_, int[] is, int i_3_)
    {
        try
        {
            if (i_1_ != -17)
                method417(false);
            int i_4_ = --i_3_ - 7;
            anInt591++;
            i--;
            while (i < i_4_)
            {
                is[++i] = i_2_;
                is[++i] = i_2_;
                is[++i] = i_2_;
                is[++i] = i_2_;
                is[++i] = i_2_;
                is[++i] = i_2_;
                is[++i] = i_2_;
                is[++i] = i_2_;
            }
            while (i < i_3_)
                is[++i] = i_2_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("fd.D(" + i + ',' + i_1_ + ',' + i_2_ + ',' + (is != null ? "{...}" : "null") + ',' + i_3_ + ')'));
        }
    }

    public static void method417(boolean bool)
    {
        aClass100_600 = null;
        aClass23Array594 = null;
        aClass92Array593 = null;
        aClass100_595 = null;
        if (bool == true)
        {
            anIntArray596 = null;
            aClass100_598 = null;
        }
    }

    static
    {
        anIntArray596 = new int[50];
        aClass100_595 = Class112.makeMutableString(43, "::noclip");
        aClass23Array594 = new Class23[4];
        aClass100_600 = Class112.makeMutableString(43, "Cancel");
        aClass100_598 = aClass100_600;
    }
}
