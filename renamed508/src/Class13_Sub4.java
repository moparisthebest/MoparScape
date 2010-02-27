/* Class13_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class13_Sub4 extends Class13
{
    private final int anInt2678;
    static int anInt2679;
    private final int anInt2680;
    private final int anInt2681;
    static int anInt2682;
    private final int anInt2683;
    static int anInt2684 = 0;
    private final int anInt2685;
    static int anInt2686;
    private final int anInt2687;
    private final int anInt2688;
    static int anInt2689;
    private final int anInt2690;
    static int anInt2691;
    static int mode = 0;
    static int anInt2693;

    final void method245(boolean bool, int i, int i_0_)
    {
        int i_1_ = i * anInt2678 >> 12;
        anInt2691++;
        int i_2_ = anInt2683 * i >> 12;
        int i_3_ = i_0_ * anInt2687 >> 12;
        int i_4_ = anInt2685 * i_0_ >> 12;
        int i_5_ = i * anInt2680 >> 12;
        int i_6_ = i_0_ * anInt2681 >> 12;
        int i_7_ = anInt2688 * i_0_ >> 12;
        int i_8_ = i * anInt2690 >> 12;
        Class68_Sub25.method1212(i_2_, (byte) -119, i_3_, i_4_, i_1_, i_8_, i_6_, ((Class13) this).anInt220, i_7_, i_5_);
        if (bool != true)
            method245(false, -1, 2);
    }

    final void method243(int i, int i_9_, int i_10_)
    {
        anInt2679++;
        if (i_9_ != 23700)
            anInt2684 = -52;
    }

    final void method244(int i, int i_11_, int i_12_)
    {
        int i_13_ = -39 % ((i_11_ + 49) / 43);
        anInt2686++;
    }

    static final void method264(int i)
    {
        anInt2682++;
        if (i != -1)
            method264(84);
        for (Class68_Sub20_Sub5 class68_sub20_sub5 = ((Class68_Sub20_Sub5) Class105.aClass16_1792.method293((byte) 76)); class68_sub20_sub5 != null; class68_sub20_sub5 = ((Class68_Sub20_Sub5) Class105.aClass16_1792.method290((byte) 34)))
        {
            Class1_Sub5 class1_sub5 = ((Class68_Sub20_Sub5) class68_sub20_sub5).aClass1_Sub5_4224;
            if (GameSocket.plane != ((Class1_Sub5) class1_sub5).anInt2508 || ((Class1_Sub5) class1_sub5).aBoolean2514)
                class68_sub20_sub5.unlink();
            else if (Class68_Sub3.loopCycle >= ((Class1_Sub5) class1_sub5).anInt2505)
            {
                class1_sub5.method139(Class109.anInt1846, false);
                if (!((Class1_Sub5) class1_sub5).aBoolean2514)
                    Class68_Sub20_Sub4.method1061(((Class1_Sub5) class1_sub5).anInt2508, ((Class1_Sub5) class1_sub5).anInt2515, ((Class1_Sub5) class1_sub5).anInt2507, ((Class1_Sub5) class1_sub5).anInt2495, 60, class1_sub5, 0, -1L, false);
                else
                    class68_sub20_sub5.unlink();
            }
        }
    }

    Class13_Sub4(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_)
    {
        super(-1, i_21_, i_22_);
        anInt2683 = i_15_;
        anInt2690 = i_19_;
        anInt2678 = i;
        anInt2685 = i_16_;
        anInt2681 = i_18_;
        anInt2688 = i_20_;
        anInt2680 = i_17_;
        anInt2687 = i_14_;
    }
}
