/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class88 {
    public static int anInt1594;
    public static int anInt1595;
    public int anInt1596;
    public int anInt1597;
    public Class16 aClass16_1598;
    public static int anInt1599;
    public int anInt1600 = 0;
    public Class68_Sub6[] aClass68_Sub6Array1601;
    public static int anInt1602;
    public static int[] anIntArray1603 = new int[25];
    public int anInt1604;
    public int[][][] anIntArrayArrayArray1605;
    public static int anInt1606;
    public static int anInt1607;
    public static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array1608;
    public static int anInt1609;
    public boolean aBoolean1610;

    public static RSString method1492(int i) {
        anInt1609++;
        RSString class100 = Class72.aRSString_1302;
        if ((Class75_Sub3.anInt3328 ^ 0xffffffff) != i)
            class100 = Class102.aRSString_1749;
        return (Class68_Sub20_Sub13_Sub2.method1166
                (i ^ ~0x2, (new RSString[]
                        {Class68_Sub24.aRSString_3159, class100,
                                Class92.aRSString_1656,
                                Class68_Sub13_Sub24
                                        .method816(Class68_Sub13_Sub27.anInt3915, 0),
                                Class68_Sub20_Sub17.aRSString_4435,
                                Class68_Sub13_Sub24
                                        .method816(Class68_Sub13_Sub20.anInt3780, 0),
                                Class68_Sub13_Sub3.aRSString_3469})));
    }

    public static void method1493(byte i) {
        if (i != 103)
            method1493((byte) -94);
        anIntArray1603 = null;
        aClass68_Sub20_Sub10Array1608 = null;
    }

    public static Class1_Sub3 method1494(int i, int i_0_, int i_1_, int i_2_,
                                         int i_3_, Class1_Sub3 class1_sub3,
                                         int i_4_) {
        anInt1607++;
        long l = (long) i;
        Class1_Sub3 class1_sub3_5_
                = ((Class1_Sub3)
                Class68_Sub28_Sub2.aClass98_4544.method1570(14366, l));
        if (class1_sub3_5_ == null) {
            Class1_Sub4 class1_sub4
                    = Class1_Sub4.method115(Class120.aClass21_Sub1_2095, i, 0);
            if (class1_sub4 == null)
                return null;
            class1_sub3_5_ = class1_sub4.method127(64, 768, -50, -10, -50);
            Class68_Sub28_Sub2.aClass98_4544.method1568(class1_sub3_5_, 115,
                    l);
        }
        int i_6_ = class1_sub3.method89();
        int i_7_ = class1_sub3.method84();
        int i_8_ = class1_sub3.method75();
        int i_9_ = class1_sub3.method87();
        class1_sub3_5_ = class1_sub3_5_.method81(true, true);
        if (i_2_ != 0)
            class1_sub3_5_.method90(i_2_);
        if (i_3_ != -10)
            return null;
        Class1_Sub3_Sub1 class1_sub3_sub1 = (Class1_Sub3_Sub1) class1_sub3_5_;
        if (i_1_ != Class1_Sub6_Sub2.method163(i_6_ + i_4_, GameSocket.anInt1149,
                i_8_ + i_0_, false)
                || Class1_Sub6_Sub2.method163(i_7_ + i_4_, GameSocket.anInt1149,
                i_0_ + i_9_, false) != i_1_) {
            for (int i_10_ = 0;
                 ((i_10_ ^ 0xffffffff)
                         > (class1_sub3_sub1.anInt3355 ^ 0xffffffff));
                 i_10_++)
                class1_sub3_sub1.anIntArray3334[i_10_]
                        += -i_1_ + Class1_Sub6_Sub2.method163((class1_sub3_sub1
                        .anIntArray3354
                        [i_10_]) - -i_4_,
                        GameSocket.anInt1149,
                        (class1_sub3_sub1
                                .anIntArray3343
                                [i_10_]) - -i_0_,
                        false);
            class1_sub3_sub1.aBoolean3345 = false;
        }
        return class1_sub3_5_;
    }

    public void method1495(int i) {
        anInt1595++;
        for (int i_11_ = i; anInt1596 > i_11_; i_11_++) {
            anIntArrayArrayArray1605[i_11_][0] = null;
            anIntArrayArrayArray1605[i_11_][1] = null;
            anIntArrayArrayArray1605[i_11_][2] = null;
            anIntArrayArrayArray1605[i_11_] = null;
        }
        aClass68_Sub6Array1601 = null;
        anIntArrayArrayArray1605 = null;
        aClass16_1598.method284(i ^ 0x69);
        aClass16_1598 = null;
    }

    public int[][] method1496(int i, byte i_12_) {
        int i_13_ = 96 % ((-65 - i_12_) / 33);
        anInt1594++;
        if (anInt1604 == anInt1596) {
            aBoolean1610 = aClass68_Sub6Array1601[i] == null;
            aClass68_Sub6Array1601[i] = Class68_Sub13_Sub21.aClass68_Sub6_3792;
            return anIntArrayArrayArray1605[i];
        }
        if ((anInt1596 ^ 0xffffffff) != -2) {
            Class68_Sub6 class68_sub6 = aClass68_Sub6Array1601[i];
            if (class68_sub6 != null)
                aBoolean1610 = false;
            else {
                aBoolean1610 = true;
                if ((anInt1600 ^ 0xffffffff) <= (anInt1596 ^ 0xffffffff)) {
                    Class68_Sub6 class68_sub6_14_
                            = (Class68_Sub6) aClass16_1598.method289(30568);
                    class68_sub6
                            = new Class68_Sub6(i, class68_sub6_14_.anInt2845);
                    aClass68_Sub6Array1601[class68_sub6_14_.anInt2839] = null;
                    class68_sub6_14_.method647(-17554);
                } else {
                    class68_sub6 = new Class68_Sub6(i, anInt1600);
                    anInt1600++;
                }
                aClass68_Sub6Array1601[i] = class68_sub6;
            }
            aClass16_1598.method291((byte) 85, class68_sub6);
            return anIntArrayArrayArray1605[class68_sub6.anInt2845];
        }
        aBoolean1610 = (anInt1597 ^ 0xffffffff) != (i ^ 0xffffffff);
        anInt1597 = i;
        return anIntArrayArrayArray1605[0];
    }

    public int[][][] method1497(byte i) {
        anInt1599++;
        if ((anInt1604 ^ 0xffffffff) != (anInt1596 ^ 0xffffffff))
            throw new RuntimeException("Can only retrieve a full image cache");
        if (i < 122)
            method1495(51);
        for (int i_15_ = 0; i_15_ < anInt1596; i_15_++)
            aClass68_Sub6Array1601[i_15_]
                    = Class68_Sub13_Sub21.aClass68_Sub6_3792;
        return anIntArrayArrayArray1605;
    }

    public Class88(int i, int i_16_, int i_17_) {
        anInt1597 = -1;
        aClass16_1598 = new Class16();
        aBoolean1610 = false;
        anInt1596 = i;
        anInt1604 = i_16_;
        aClass68_Sub6Array1601 = new Class68_Sub6[anInt1604];
        anIntArrayArrayArray1605 = new int[anInt1596][3][i_17_];
    }

    static {
        anInt1602 = 0;
    }
}
