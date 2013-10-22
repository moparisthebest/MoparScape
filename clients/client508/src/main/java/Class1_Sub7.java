/* Class1_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub7 extends Animable {
    public static RSString aRSString_2590
            = RSString.newRsString("Schlie-8en");
    public static int anInt2591;
    public int anInt2592;
    public static int anInt2593;
    public static int anInt2594;
    public int anInt2595;
    public int anInt2596;
    public static int anInt2597;
    public int anInt2598 = -1;
    public int anInt2599;
    public static int anInt2600;
    public static RSString aRSString_2601;
    public int anInt2602;
    public int anInt2603;
    public int anInt2604;
    public Class92_Sub1 aClass92_Sub1_2605 = null;
    public int anInt2606;
    public static int anInt2607;
    public static int anInt2608;
    public int anInt2609;
    public static int anInt2610;
    public static RSString aRSString_2611;
    public static boolean aBoolean2612;
    public static RSString aRSString_2613 = RSString.newRsString("green:");
    public int anInt2614;
    public static int anInt2615;
    public static int anInt2616;
    public Class55 aClass55_2617;
    public static Class21renamed aClass21_2618;
    public static int anInt2619;

    public static RSString method165(int i, int i_0_) {
        if (i_0_ != -17516)
            return null;
        anInt2610++;
        return (Class68_Sub20_Sub13_Sub2.method1166
                (i_0_ ^ ~0x4469,
                        (new RSString[]
                                {Class68_Sub13_Sub24.method816(0xff & i >> -1240357992, 0),
                                        Class75_Sub3_Sub1.aRSString_4596,
                                        Class68_Sub13_Sub24.method816(0xff & i >> -1005336016, 0),
                                        Class75_Sub3_Sub1.aRSString_4596,
                                        Class68_Sub13_Sub24.method816((0xffc7 & i) >> 918212456,
                                                0),
                                        Class75_Sub3_Sub1.aRSString_4596,
                                        Class68_Sub13_Sub24.method816(i & 0xff, 0)})));
    }

    public Animable method166(int i) {
        if (i != 675116226)
            return null;
        anInt2591++;
        return method167(false, 2);
    }

    public Animable method167(boolean bool, int i) {
        anInt2608++;
        boolean bool_1_ = (Class74.anIntArrayArrayArray1335
                != Class68_Sub20_Sub12.anIntArrayArrayArray4353);
        Class116 class116 = Class1_Sub5.method140(i + 89, anInt2595);
        if (class116.anIntArray1994 != null)
            class116 = class116.method1710(i + -3);
        if (class116 == null)
            return null;
        int i_2_ = anInt2604 & 0x3;
        int i_3_;
        int i_4_;
        if (i_2_ == 1 || i_2_ == 3) {
            i_4_ = class116.anInt1988;
            i_3_ = class116.anInt1987;
        } else {
            i_3_ = class116.anInt1988;
            i_4_ = class116.anInt1987;
        }
        int i_5_ = anInt2609 - -(i_3_ >> 1952131809);
        int i_6_ = (i_4_ >> -580821599) + anInt2614;
        int i_7_ = anInt2609 - -(i_3_ - -1 >> -1235910239);
        int i_8_ = anInt2614 - -(1 + i_4_ >> 1627324641);
        method171(i_5_ * 128, i_6_ * 128, (byte) -95);
        boolean bool_9_ = (!bool_1_ && class116.aBoolean2018
                && ((anInt2598 ^ 0xffffffff) != (class116.anInt2031
                ^ 0xffffffff)
                || (anInt2603 != anInt2599
                && Class68_Sub13_Sub26.anInt3876 >= 2)));
        if (bool && !bool_9_)
            return null;
        int[][] is = Class68_Sub20_Sub12.anIntArrayArrayArray4353[anInt2596];
        int i_10_ = (anInt2609 << 1876830119) + (i_3_ << 135097254);
        int i_11_ = (i_4_ << 1252249254) + (anInt2614 << 1882080487);
        boolean bool_12_ = aClass92_Sub1_2605 == null;
        int i_13_ = (is[i_7_][i_8_] + is[i_5_][i_8_] + (is[i_5_][i_6_]
                + is[i_7_][i_6_])
                >> 675116226);
        int[][] is_14_ = null;
        if (!bool_1_) {
            if (anInt2596 < 3)
                is_14_ = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [1 + anInt2596]);
        } else
            is_14_ = Class74.anIntArrayArrayArray1335[0];
        Class44 class44;
        if (aClass55_2617 != null)
            class44 = class116.method1714((!bool_12_ ? aClass92_Sub1_2605
                    : (Class68_Sub20_Sub16
                    .aClass92_Sub1_4425)),
                    aClass55_2617, bool_9_, i_10_,
                    i_13_, anInt2603, anInt2604, is_14_,
                    is, 65535, i_11_, anInt2602);
        else
            class44 = class116.method1702(anInt2602,
                    (!bool_12_ ? aClass92_Sub1_2605
                            : (Class68_Sub20_Sub16
                            .aClass92_Sub1_4425)),
                    bool_9_, (byte) -10, false, i_13_,
                    anInt2604, is, i_11_, is_14_, i_10_);
        if (i != 2)
            method171(13, 52, (byte) -73);
        if (class44 == null)
            return null;
        return class44.aClass1_746;
    }

    public static void method168(int i) {
        aRSString_2611 = null;
        aRSString_2613 = null;
        aRSString_2601 = null;
        aRSString_2590 = null;
        aClass21_2618 = null;
        if (i > -44)
            method168(-90);
    }

    public static void method169(int i, int i_15_, int i_16_, int i_17_,
                                 Animable class1, long l, Animable class1_18_,
                                 Animable class1_19_) {
        Class57 class57 = new Class57();
        class57.aClass1_1083 = class1;
        class57.anInt1074 = i_15_ * 128 + 64;
        class57.anInt1075 = i_16_ * 128 + 64;
        class57.anInt1085 = i_17_;
        class57.aLong1071 = l;
        class57.aClass1_1073 = class1_18_;
        class57.aClass1_1078 = class1_19_;
        int i_20_ = 0;
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_15_][i_16_];
        if (class68_sub1 != null) {
            for (int i_21_ = 0; i_21_ < class68_sub1.anInt2771; i_21_++) {
                Class69 class69 = class68_sub1.aClass69Array2772[i_21_];
                if ((class69.aLong1243 & 0x400000L) == 4194304L) {
                    int i_22_ = class69.aClass1_1242.method56();
                    if (i_22_ != -32768 && i_22_ < i_20_)
                        i_20_ = i_22_;
                }
            }
        }
        class57.anInt1069 = -i_20_;
        if (Class22.aClass68_Sub1ArrayArrayArray484[i][i_15_][i_16_] == null)
            Class22.aClass68_Sub1ArrayArrayArray484[i][i_15_][i_16_]
                    = new Class68_Sub1(i, i_15_, i_16_);
        Class22.aClass68_Sub1ArrayArrayArray484[i][i_15_][i_16_].aClass57_2759
                = class57;
    }

    public static void method170(int i) {
        if (i != 255)
            aClass21_2618 = null;
        anInt2593++;
        if (Class33.aClass86_581 != null) {
            synchronized (Class33.aClass86_581) {
                Class33.aClass86_581 = null;
            }
        }
    }

    public int method56() {
        anInt2600++;
        return anInt2592;
    }

    public void method51(int i, int i_23_, int i_24_, int i_25_, int i_26_,
                         int i_27_, int i_28_, int i_29_, long l) {
        Animable class1 = method166(675116226);
        anInt2607++;
        if (class1 != null) {
            class1.method51(i, i_23_, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_,
                    l);
            anInt2592 = class1.method56();
        }
    }

    public void method60(int i, int i_30_, int i_31_, int i_32_, int i_33_) {
        anInt2594++;
        method171(128 * ((i_33_ + -i_30_ >> -315085247) + i_30_) + 64,
                64 + (i_32_ - -(i + -i_32_ >> -159060191)) * 128,
                (byte) -59);
        if (i_31_ < 96)
            anInt2604 = 5;
    }

    public void method171(int i, int i_34_, byte i_35_) {
        anInt2615++;
        if (aClass55_2617 != null) {
            int i_36_ = Class68_Sub3.anInt2812 + -anInt2606;
            if ((i_36_ ^ 0xffffffff) < -101 && aClass55_2617.anInt2072 > 0) {
                int i_37_;
                for (i_37_ = (-aClass55_2617.anInt2072
                        + aClass55_2617.anIntArray2035.length);
                     ((anInt2603 ^ 0xffffffff) > (i_37_ ^ 0xffffffff)
                             && i_36_ > aClass55_2617.anIntArray2058[anInt2603]);
                     anInt2603++)
                    i_36_ -= aClass55_2617.anIntArray2058[anInt2603];
                if (anInt2603 >= i_37_) {
                    int i_38_ = 0;
                    for (int i_39_ = i_37_;
                         ((aClass55_2617.anIntArray2035.length ^ 0xffffffff)
                                 < (i_39_ ^ 0xffffffff));
                         i_39_++)
                        i_38_ += aClass55_2617.anIntArray2058[i_39_];
                    i_36_ %= i_38_;
                }
            }
            while ((i_36_ ^ 0xffffffff)
                    < (aClass55_2617.anIntArray2058[anInt2603] ^ 0xffffffff)) {
                Class44.method489(false, anInt2603, i, aClass55_2617, false,
                        i_34_);
                i_36_ -= aClass55_2617.anIntArray2058[anInt2603];
                anInt2603++;
                if (anInt2603 >= aClass55_2617.anIntArray2035.length) {
                    anInt2603 -= aClass55_2617.anInt2072;
                    if (anInt2603 < 0
                            || ((aClass55_2617.anIntArray2035.length ^ 0xffffffff)
                            >= (anInt2603 ^ 0xffffffff))) {
                        aClass55_2617 = null;
                        break;
                    }
                }
            }
            anInt2606 = -i_36_ + Class68_Sub3.anInt2812;
        }
        if (i_35_ >= -25)
            anInt2598 = 24;
    }

    public Class1_Sub7(int i, int i_40_, int i_41_, int i_42_, int i_43_,
                       int i_44_, int i_45_, boolean bool, Animable class1) {
        anInt2599 = -1;
        anInt2592 = -32768;
        anInt2609 = i_43_;
        anInt2614 = i_44_;
        anInt2602 = i_40_;
        anInt2596 = i_42_;
        anInt2595 = i;
        anInt2604 = i_41_;
        if (i_45_ != -1) {
            aClass55_2617 = Class64.method624((byte) -36, i_45_);
            anInt2606 = -1 + Class68_Sub3.anInt2812;
            anInt2603 = 0;
            if ((aClass55_2617.anInt2061 ^ 0xffffffff) == -1 && class1 != null
                    && class1 instanceof Class1_Sub7) {
                Class1_Sub7 class1_sub7_46_ = (Class1_Sub7) class1;
                if (class1_sub7_46_.aClass55_2617 == aClass55_2617) {
                    anInt2603 = class1_sub7_46_.anInt2603;
                    anInt2606 = class1_sub7_46_.anInt2606;
                    return;
                }
            }
            if (bool && aClass55_2617.anInt2072 != -1) {
                anInt2603
                        = (int) ((double) aClass55_2617.anIntArray2035.length
                        * Math.random());
                anInt2606 -= (int) (Math.random()
                        * (double) (aClass55_2617.anIntArray2058
                        [anInt2603]));
            }
        }
    }

    static {
        aBoolean2612 = false;
        aRSString_2611 = aRSString_2613;
        aRSString_2601 = aRSString_2613;
        anInt2597 = 0;
    }
}
