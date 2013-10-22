/* Class68_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub18 extends Class68 {
    public int anInt3038;
    public int anInt3039;
    public Class68_Sub28_Sub3 aClass68_Sub28_Sub3_3040;
    public static int anInt3041;
    public int anInt3042;
    public static RSString aRSString_3043 = RSString.newRsString("Nehmen");
    public int anInt3044;
    public Class116 aClass116_3045;
    public static int anInt3046;
    public int anInt3047 = 0;
    public static RSString aRSString_3048;
    public Class68_Sub28_Sub3 aClass68_Sub28_Sub3_3049;
    public Class1_Sub6_Sub2 aClass1_Sub6_Sub2_3050;
    public int anInt3051;
    public static RSString aRSString_3052 = RSString.newRsString(")2");
    public int[] anIntArray3053;
    public int anInt3054;
    public static int anInt3055;
    public static int anInt3056;
    public int anInt3057;
    public static boolean aBoolean3058;
    public int anInt3059;
    public Class1_Sub6_Sub1 aClass1_Sub6_Sub1_3060;
    public boolean aBoolean3061;
    public int anInt3062;
    public static RSString aRSString_3063;
    public int anInt3064;

    public static void method992(int i) {
        aRSString_3052 = null;
        if (i != 0)
            method995(-119);
        aRSString_3063 = null;
        aRSString_3043 = null;
        aRSString_3048 = null;
    }

    public void method993(int i) {
        if (i == 31506) {
            int i_0_ = anInt3042;
            if (aClass116_3045 == null) {
                if (aClass1_Sub6_Sub1_3060 == null) {
                    if (aClass1_Sub6_Sub2_3050 != null) {
                        anInt3042
                                = Applet_Sub1.method32(aClass1_Sub6_Sub2_3050,
                                i ^ ~0x6137);
                        anInt3057 = 128 * aClass1_Sub6_Sub2_3050.anInt3427;
                    }
                } else {
                    int i_1_
                            = Class72.method1349(aClass1_Sub6_Sub1_3060, false);
                    if (i_0_ != i_1_) {
                        anInt3042 = i_1_;
                        Class80 class80 = aClass1_Sub6_Sub1_3060.aClass80_3395;
                        if (class80.anIntArray1431 != null)
                            class80 = class80.method1447(-94);
                        if (class80 != null)
                            anInt3057 = 128 * class80.anInt1463;
                        else
                            anInt3057 = 0;
                    }
                }
            } else {
                Class116 class116 = aClass116_3045.method1710(i ^ ~0x7b12);
                if (class116 != null) {
                    anIntArray3053 = class116.anIntArray1995;
                    anInt3044 = class116.anInt1964;
                    anInt3042 = class116.anInt1982;
                    anInt3057 = 128 * class116.anInt1975;
                    anInt3059 = class116.anInt2000;
                } else {
                    anIntArray3053 = null;
                    anInt3057 = 0;
                    anInt3059 = 0;
                    anInt3042 = -1;
                    anInt3044 = 0;
                }
            }
            anInt3056++;
            if (anInt3042 != i_0_ && aClass68_Sub28_Sub3_3040 != null) {
                Class80.aClass68_Sub28_Sub4_1418
                        .method1314(aClass68_Sub28_Sub3_3040);
                aClass68_Sub28_Sub3_3040 = null;
            }
        }
    }

    public static void method994(int i, int i_2_, boolean bool,
                                 boolean bool_3_, int i_4_,
                                 Class45[] class45s) {
        if (bool_3_ != false)
            aRSString_3048 = null;
        for (int i_5_ = 0;
             (class45s.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
            Class45 class45 = class45s[i_5_];
            if (class45 != null && class45.anInt799 == i) {
                Class68_Sub20_Sub7.method1075(bool, 19, i_2_, i_4_, class45);
                Class68_Sub20_Sub13.method1159(i_2_, class45, i_4_,
                        -1198502738);
                if ((class45.anInt818 ^ 0xffffffff)
                        < (class45.anInt794 + -class45.anInt873 ^ 0xffffffff))
                    class45.anInt818 = -class45.anInt873 + class45.anInt794;
                if ((class45.anInt818 ^ 0xffffffff) > -1)
                    class45.anInt818 = 0;
                if (-class45.anInt892 + class45.anInt888 < class45.anInt847)
                    class45.anInt847 = class45.anInt888 + -class45.anInt892;
                if (class45.anInt847 < 0)
                    class45.anInt847 = 0;
                if ((class45.anInt896 ^ 0xffffffff) == -1)
                    Class68_Sub13_Sub27.method838(-1, bool, class45);
            }
        }
        anInt3041++;
    }

    public static void method995(int i) {
        anInt3055++;
        for (int i_6_ = 0; Class13_Sub2.anInt2645 > i_6_; i_6_++) {
            int i_7_ = Class68_Sub10.anIntArray2906[i_6_];
            Class1_Sub6_Sub1 class1_sub6_sub1
                    = Class102.aClass1_Sub6_Sub1Array1746[i_7_];
            if (class1_sub6_sub1 != null)
                Class51.method537(class1_sub6_sub1, 128,
                        class1_sub6_sub1.aClass80_3395.anInt1451);
        }
        if (i != 16986)
            method995(107);
    }

    static {
        aRSString_3048 = RSString.newRsString("M");
        aBoolean3058 = false;
        anInt3046 = 0;
        aRSString_3063 = RSString.newRsString("Wordpack geladen)3");
    }
}
