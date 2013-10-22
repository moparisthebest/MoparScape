/* Class68_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class68_Sub13 extends Node
{
    static int anInt2920;
    static int anInt2921;
    static int[] anIntArray2922;
    static Class92_Sub1[] aClass92_Sub1Array2923;
    static MutableString aClass100_2924;
    static int anInt2925;
    static int[] anIntArray2926 = new int[1000];
    static int anInt2927;
    static int anInt2928;
    static int anInt2929;
    static MutableString aClass100_2930;
    static int anInt2931;
    static int anInt2932;
    boolean aBoolean2933;
    static int anInt2934;
    static int anInt2935;
    static int anInt2936;
    static int anInt2937;
    Class115 aClass115_2938;
    static int anInt2939;
    static int anInt2940;
    Class88 aClass88_2941;
    static int anInt2942;
    Class68_Sub13[] aClass68_Sub13Array2943;
    int anInt2944;
    static int cameraViewToZ;
    static int[] anIntArray2946;

    int method689(int i)
    {
        if (i != 9485)
            return 99;
        anInt2929++;
        return -1;
    }

    void method690(byte i)
    {
        anInt2934++;
        if (i >= -22)
            method690((byte) -47);
    }

    public static void method691(byte i)
    {
        aClass92_Sub1Array2923 = null;
        if (i == 50)
        {
            aClass100_2930 = null;
            anIntArray2922 = null;
            aClass100_2924 = null;
            anIntArray2926 = null;
            anIntArray2946 = null;
        }
    }

    static final void method692(int i, byte i_0_)
    {
        Class68_Sub20_Sub15.anInt4405 = -1;
        Class52.aBoolean998 = false;
        Class105.anInt1796 = -1;
        anInt2935++;
        Class67.anInt1217 = 0;
        Class70.anInt1287 = 1;
        if (i_0_ < 118)
            aClass92_Sub1Array2923 = null;
        Class68_Sub13_Sub11.anInt3622 = i;
        GameException.aClass21_2238 = null;
    }

    int method693(byte i)
    {
        anInt2920++;
        if (i > -43)
            anInt2925 = -96;
        return -1;
    }

    void method694(int i)
    {
        if (!((Class68_Sub13) this).aBoolean2933)
        {
            ((Class68_Sub13) this).aClass88_2941.method1501(0);
            ((Class68_Sub13) this).aClass88_2941 = null;
        } else
        {
            ((Class68_Sub13) this).aClass115_2938.method1706(true);
            ((Class68_Sub13) this).aClass115_2938 = null;
        }
        anInt2937++;
        if (i != 8)
            anInt2925 = 91;
    }

    final void method695(int i, int i_1_, int i_2_)
    {
        anInt2931++;
        int i_3_ = (i_1_ == (((Class68_Sub13) this).anInt2944 ^ 0xffffffff) ? i_2_ : ((Class68_Sub13) this).anInt2944);
        if (!((Class68_Sub13) this).aBoolean2933)
            ((Class68_Sub13) this).aClass88_2941 = new Class88(i_3_, i_2_, i);
        else
            ((Class68_Sub13) this).aClass115_2938 = new Class115(i_3_, i_2_, i);
    }

    final int[] method696(int i, int i_4_, int i_5_)
    {
        anInt2936++;
        if (i_5_ != 29149)
            method691((byte) -29);
        if (((Class68_Sub13) ((Class68_Sub13) this).aClass68_Sub13Array2943[i]).aBoolean2933)
            return ((Class68_Sub13) this).aClass68_Sub13Array2943[i].method698((byte) -61, i_4_);
        return (((Class68_Sub13) this).aClass68_Sub13Array2943[i].method697(i_4_, true)[0]);
    }

    int[][] method697(int i, boolean bool)
    {
        anInt2928++;
        if (bool != true)
            cameraViewToZ = 55;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    int[] method698(byte i, int i_6_)
    {
        anInt2921++;
        if (i != -61)
            ((Class68_Sub13) this).anInt2944 = 9;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    final int[][] method699(int i, int i_7_, int i_8_)
    {
        anInt2927++;
        if (i >= -8)
            method691((byte) -105);
        if (!((Class68_Sub13) (((Class68_Sub13) this).aClass68_Sub13Array2943[i_7_])).aBoolean2933)
            return ((Class68_Sub13) this).aClass68_Sub13Array2943[i_7_].method697(i_8_, true);
        int[][] is = new int[3][];
        int[] is_9_ = ((Class68_Sub13) this).aClass68_Sub13Array2943[i_7_].method698((byte) -61, i_8_);
        is[2] = is_9_;
        is[0] = is_9_;
        is[1] = is_9_;
        return is;
    }

    Class68_Sub13(int i, boolean bool)
    {
        ((Class68_Sub13) this).aBoolean2933 = bool;
        ((Class68_Sub13) this).aClass68_Sub13Array2943 = new Class68_Sub13[i];
    }

    void method700(Stream class68_sub14, int i, int i_10_)
    {
        do
        {
            try
            {
                anInt2939++;
                if (i_10_ == -1)
                    break;
                method691((byte) -125);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("lf.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ')'));
            }
            break;
        } while (false);
    }

    static final void method701(int i)
    {
        anInt2942++;
        if (i == 0)
        {
            for (Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1685(i ^ ~0x7f81)); class68_sub3 != null; class68_sub3 = (Class68_Sub3) Login.aClass113_1514.method1689((byte) -101))
            {
                int i_11_ = ((Class68_Sub3) class68_sub3).anInt2805;
                if (Class68_Sub13_Sub25.method824(i_11_, (byte) -2))
                {
                    Widget[] class45s = Class68_Sub13_Sub36.widgetCache[i_11_];
                    boolean bool = true;
                    for (int i_12_ = 0; i_12_ < class45s.length; i_12_++)
                    {
                        if (class45s[i_12_] != null)
                        {
                            bool = ((Widget) class45s[i_12_]).aBoolean863;
                            break;
                        }
                    }
                    if (!bool)
                    {
                        int i_13_ = (int) ((Node) class68_sub3).nodeID;
                        Widget class45 = Class68_Sub20_Sub15.method1170(i_13_, (byte) -80);
                        if (class45 != null)
                            NodeCache.method1688(class45, -124);
                    }
                }
            }
        }
    }

    static
    {
        anInt2925 = 0;
        anIntArray2922 = new int[] { 1, -1, -1, 1 };
        aClass100_2930 = Class112.makeMutableString(43, "cross");
        aClass100_2924 = Class112.makeMutableString(43, ":tradereq:");
        anIntArray2946 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
    }
}
