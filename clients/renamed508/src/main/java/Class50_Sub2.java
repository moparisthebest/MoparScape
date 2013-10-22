/* Class50_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50_Sub2 extends Class50
{
    private static MutableString aClass100_2731;
    private static MutableString aClass100_2732 = Class112.makeMutableString(43, "Oct");
    private static MutableString aClass100_2733;
    static int anInt2734;
    static int anInt2735;
    private static MutableString aClass100_2736 = Class112.makeMutableString(43, "Mar");
    private int anInt2737;
    static Class21 aClass21_2738;
    private static MutableString aClass100_2739;
    static int anInt2740;
    private static MutableString aClass100_2741;
    static MutableString[] aClass100Array2742;
    private int anInt2743;
    private long aLong2744;
    private static MutableString aClass100_2745;
    private static MutableString aClass100_2746;
    static int anInt2747;
    private static MutableString aClass100_2748;
    private int anInt2749;
    static int anInt2750;
    private long[] aLongArray2751 = new long[10];
    private static MutableString aClass100_2752;
    private static MutableString aClass100_2753;
    private static MutableString aClass100_2754;
    private int anInt2755;

    static final int method534(int i, byte i_0_)
    {
        if (i_0_ != 65)
            return 78;
        anInt2735++;
        return 0x7f & i;
    }

    public static void method535(int i)
    {
        if (i != 25)
            aClass100_2753 = null;
        aClass100Array2742 = null;
        aClass100_2753 = null;
        aClass100_2736 = null;
        aClass100_2732 = null;
        aClass100_2754 = null;
        aClass100_2733 = null;
        aClass100_2731 = null;
        aClass21_2738 = null;
        aClass100_2745 = null;
        aClass100_2746 = null;
        aClass100_2739 = null;
        aClass100_2741 = null;
        aClass100_2752 = null;
        aClass100_2748 = null;
    }

    final void method529(boolean bool)
    {
        for (int i = 0; i < 10; i++)
            aLongArray2751[i] = 0L;
        anInt2750++;
        if (bool != true)
            method535(-115);
    }

    final int method532(int i, int i_1_, int i_2_)
    {
        anInt2740++;
        if (i_1_ != -19)
            aClass100_2736 = null;
        int i_3_ = anInt2743;
        anInt2743 = 300;
        int i_4_ = anInt2755;
        anInt2755 = 1;
        aLong2744 = Class36.method438(17161);
        if (aLongArray2751[anInt2749] == 0L)
        {
            anInt2743 = i_3_;
            anInt2755 = i_4_;
        } else if (aLongArray2751[anInt2749] < aLong2744)
            anInt2743 = (int) ((long) (i_2_ * 2560) / (aLong2744 - aLongArray2751[anInt2749]));
        if (anInt2743 < 25)
            anInt2743 = 25;
        if (anInt2743 > 256)
        {
            anInt2743 = 256;
            anInt2755 = (int) (-((aLong2744 - aLongArray2751[anInt2749]) / 10L) + (long) i_2_);
        }
        if (anInt2755 > i_2_)
            anInt2755 = i_2_;
        aLongArray2751[anInt2749] = aLong2744;
        anInt2749 = (anInt2749 + 1) % 10;
        if (anInt2755 > 1)
        {
            for (int i_5_ = 0; i_5_ < 10; i_5_++)
            {
                if (aLongArray2751[i_5_] != 0L)
                    aLongArray2751[i_5_] = aLongArray2751[i_5_] + (long) anInt2755;
            }
        }
        if (anInt2755 < i)
            anInt2755 = i;
        Class50.method528(i_1_ + 14, (long) anInt2755);
        int i_6_ = 0;
        while (anInt2737 < 256)
        {
            anInt2737 += anInt2743;
            i_6_++;
        }
        anInt2737 &= 0xff;
        return i_6_;
    }

    Class50_Sub2()
    {
        anInt2743 = 256;
        anInt2737 = 0;
        anInt2755 = 1;
        aLong2744 = Class36.method438(17161);
        for (int i = 0; i < 10; i++)
            aLongArray2751[i] = aLong2744;
    }

    static
    {
        aClass100_2731 = Class112.makeMutableString(43, "Dec");
        aClass100_2741 = Class112.makeMutableString(43, "Jun");
        aClass100_2745 = Class112.makeMutableString(43, "Jul");
        anInt2747 = 1;
        aClass100_2733 = Class112.makeMutableString(43, "Aug");
        aClass100_2739 = Class112.makeMutableString(43, "Apr");
        aClass100_2746 = Class112.makeMutableString(43, "Sep");
        aClass100_2754 = Class112.makeMutableString(43, "Jan");
        aClass100_2752 = Class112.makeMutableString(43, "Nov");
        aClass100_2748 = Class112.makeMutableString(43, "May");
        aClass100_2753 = Class112.makeMutableString(43, "Feb");
        aClass100Array2742 = new MutableString[] { aClass100_2754, aClass100_2753, aClass100_2736, aClass100_2739, aClass100_2748, aClass100_2741, aClass100_2745, aClass100_2733, aClass100_2746, aClass100_2732, aClass100_2752, aClass100_2731 };
    }
}
