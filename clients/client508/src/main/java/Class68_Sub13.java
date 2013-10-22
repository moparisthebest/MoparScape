/* Class68_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class68_Sub13 extends Class68 {
    public static int anInt2918;
    public static int anInt2919;
    public static int[] anIntArray2920;
    public static Class92_Sub1[] aClass92_Sub1Array2921;
    public static RSString aRSString_2922;
    public static int anInt2923;
    public static int[] anIntArray2924 = new int[1000];
    public static int anInt2925;
    public static int anInt2926;
    public static int anInt2927;
    public static RSString aRSString_2928;
    public static int anInt2929;
    public static int anInt2930;
    public boolean aBoolean2931;
    public static int anInt2932;
    public static int anInt2933;
    public static int anInt2934;
    public static int anInt2935;
    public Class115 aClass115_2936;
    public static int anInt2937;
    public static int anInt2938;
    public Class88 aClass88_2939;
    public static int anInt2940;
    public Class68_Sub13[] aClass68_Sub13Array2941;
    public int anInt2942;
    public static int anInt2943;
    public static int[] anIntArray2944;

    public int method689(int i) {
        if (i != 9485)
            return 99;
        anInt2927++;
        return -1;
    }

    public void method690(byte i) {
        anInt2932++;
        if (i >= -22)
            method690((byte) -47);
    }

    public static void method691(byte i) {
        aClass92_Sub1Array2921 = null;
        if (i == 50) {
            aRSString_2928 = null;
            anIntArray2920 = null;
            aRSString_2922 = null;
            anIntArray2924 = null;
            anIntArray2944 = null;
        }
    }

    public static void method692(int i, byte i_0_) {
        Class68_Sub20_Sub15.anInt4403 = -1;
        Class52.aBoolean998 = false;
        Class105.anInt1794 = -1;
        anInt2933++;
        Class67.anInt1217 = 0;
        Class70.anInt1287 = 1;
        if (i_0_ < 118)
            aClass92_Sub1Array2921 = null;
        Class68_Sub13_Sub11.anInt3620 = i;
        GameException.aClass21_2236 = null;
    }

    public int method693(byte i) {
        anInt2918++;
        if (i > -43)
            anInt2923 = -96;
        return -1;
    }

    public void method694(int i) {
        if (!aBoolean2931) {
            aClass88_2939.method1495(0);
            aClass88_2939 = null;
        } else {
            aClass115_2936.method1700(true);
            aClass115_2936 = null;
        }
        anInt2935++;
        if (i != 8)
            anInt2923 = 91;
    }

    public void method695(int i, int i_1_, int i_2_) {
        anInt2929++;
        int i_3_ = i_1_ == (anInt2942 ^ 0xffffffff) ? i_2_ : anInt2942;
        if (!aBoolean2931)
            aClass88_2939 = new Class88(i_3_, i_2_, i);
        else
            aClass115_2936 = new Class115(i_3_, i_2_, i);
    }

    public int[] method696(int i, int i_4_, int i_5_) {
        anInt2934++;
        if (i_5_ != 29149)
            method691((byte) -29);
        if (aClass68_Sub13Array2941[i].aBoolean2931)
            return aClass68_Sub13Array2941[i].method698((byte) -61, i_4_);
        return aClass68_Sub13Array2941[i].method697(i_4_, true)[0];
    }

    public int[][] method697(int i, boolean bool) {
        anInt2926++;
        if (bool != true)
            anInt2943 = 55;
        throw new IllegalStateException
                ("This operation does not have a colour output");
    }

    public int[] method698(byte i, int i_6_) {
        anInt2919++;
        if (i != -61)
            anInt2942 = 9;
        throw new IllegalStateException
                ("This operation does not have a monochrome output");
    }

    public int[][] method699(int i, int i_7_, int i_8_) {
        anInt2925++;
        if (i >= -8)
            method691((byte) -105);
        if (!aClass68_Sub13Array2941[i_7_].aBoolean2931)
            return aClass68_Sub13Array2941[i_7_].method697(i_8_, true);
        int[][] is = new int[3][];
        int[] is_9_
                = aClass68_Sub13Array2941[i_7_].method698((byte) -61, i_8_);
        is[2] = is_9_;
        is[0] = is_9_;
        is[1] = is_9_;
        return is;
    }

    public Class68_Sub13(int i, boolean bool) {
        aBoolean2931 = bool;
        aClass68_Sub13Array2941 = new Class68_Sub13[i];
    }

    public void method700(Stream class68_sub14, int i, int i_10_) {
        anInt2937++;
        if (i_10_ != -1)
            method691((byte) -125);
    }

    public static void method701(int i) {
        anInt2940++;
        if (i == 0) {
            for (Class68_Sub3 class68_sub3
                         = ((Class68_Sub3)
                    Login.aClass113_1512.method1679(i ^ ~0x7f81));
                 class68_sub3 != null;
                 class68_sub3 = (Class68_Sub3) Login.aClass113_1512
                         .method1683((byte) -101)) {
                int i_11_ = class68_sub3.anInt2803;
                if (Class68_Sub13_Sub25.method824(i_11_, (byte) -2)) {
                    Class45[] class45s
                            = Class68_Sub13_Sub36.aClass45ArrayArray4040[i_11_];
                    boolean bool = true;
                    for (int i_12_ = 0; i_12_ < class45s.length; i_12_++) {
                        if (class45s[i_12_] != null) {
                            bool = class45s[i_12_].aBoolean863;
                            break;
                        }
                    }
                    if (!bool) {
                        int i_13_ = (int) class68_sub3.aLong1218;
                        Class45 class45
                                = Class68_Sub20_Sub15.method1170(i_13_,
                                (byte) -80);
                        if (class45 != null)
                            Class113.method1682(class45, -124);
                    }
                }
            }
        }
    }

    static {
        anInt2923 = 0;
        anIntArray2920 = new int[]{1, -1, -1, 1};
        aRSString_2928 = RSString.newRsString("cross");
        aRSString_2922 = RSString.newRsString(":tradereq:");
        anIntArray2944 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
    }
}
