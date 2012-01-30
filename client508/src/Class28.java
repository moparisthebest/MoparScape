/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class28 {
    public static int anInt524;
    public static int anInt525;
    public static int anInt526;
    public static int anInt527;
    public static Class21renamed aClass21_528;
    public static Class21_Sub1 aClass21_Sub1_529;
    public static int anInt530;
    public static Class21renamed aClass21_531;
    public static int anInt532;
    public static int anInt533;

    public static void method392(int i, int i_0_, Class93[] class93s,
                                 int i_1_) {
        if (i_0_ != -228)
            aClass21_528 = null;
        anInt533++;
        if (i_1_ < i) {
            int i_2_ = i_1_ + -1;
            int i_3_ = i - -1;
            int i_4_ = (i_1_ - -i) / 2;
            Class93 class93 = class93s[i_4_];
            class93s[i_4_] = class93s[i_1_];
            class93s[i_1_] = class93;
            while ((i_3_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
                boolean bool = true;
                do {
                    i_3_--;
                    for (int i_5_ = 0; i_5_ < 4; i_5_++) {
                        int i_6_;
                        int i_7_;
                        if ((Class68_Sub13_Sub26_Sub1.anIntArray4609[i_5_]
                                ^ 0xffffffff)
                                != -3) {
                            if ((Class68_Sub13_Sub26_Sub1.anIntArray4609[i_5_]
                                    ^ 0xffffffff)
                                    != -2) {
                                if ((Class68_Sub13_Sub26_Sub1.anIntArray4609
                                        [i_5_])
                                        != 3) {
                                    i_6_ = class93s[i_3_].anInt1664;
                                    i_7_ = class93.anInt1664;
                                } else {
                                    i_7_ = class93.aBoolean1661 ? 1 : 0;
                                    i_6_
                                            = !class93s[i_3_].aBoolean1661 ? 0 : 1;
                                }
                            } else {
                                i_6_ = class93s[i_3_].anInt1665;
                                if (i_6_ == -1
                                        && Class51.anIntArray2257[i_5_] == 1)
                                    i_6_ = 2001;
                                i_7_ = class93.anInt1665;
                                if (i_7_ == -1 && (Class51.anIntArray2257[i_5_]
                                        ^ 0xffffffff) == -2)
                                    i_7_ = 2001;
                            }
                        } else {
                            i_6_ = class93s[i_3_].anInt1663;
                            i_7_ = class93.anInt1663;
                        }
                        if (i_6_ == i_7_) {
                            if ((i_5_ ^ 0xffffffff) == -4)
                                bool = false;
                        } else {
                            if ((((Class51.anIntArray2257[i_5_] ^ 0xffffffff)
                                    != -2)
                                    || i_7_ >= i_6_)
                                    && ((Class51.anIntArray2257[i_5_]
                                    ^ 0xffffffff) != -1
                                    || i_7_ <= i_6_))
                                bool = false;
                            break;
                        }
                    }
                } while (bool);
                bool = true;
                do {
                    i_2_++;
                    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -5; i_8_++) {
                        int i_9_;
                        int i_10_;
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4609[i_8_]
                                == 2) {
                            i_9_ = class93s[i_2_].anInt1663;
                            i_10_ = class93.anInt1663;
                        } else if ((Class68_Sub13_Sub26_Sub1.anIntArray4609
                                [i_8_])
                                == 1) {
                            i_9_ = class93s[i_2_].anInt1665;
                            i_10_ = class93.anInt1665;
                            if ((i_10_ ^ 0xffffffff) == 0
                                    && Class51.anIntArray2257[i_8_] == 1)
                                i_10_ = 2001;
                            if (i_9_ == -1
                                    && Class51.anIntArray2257[i_8_] == 1)
                                i_9_ = 2001;
                        } else if (((Class68_Sub13_Sub26_Sub1.anIntArray4609
                                [i_8_])
                                ^ 0xffffffff)
                                == -4) {
                            i_9_ = !class93s[i_2_].aBoolean1661 ? 0 : 1;
                            i_10_ = !class93.aBoolean1661 ? 0 : 1;
                        } else {
                            i_10_ = class93.anInt1664;
                            i_9_ = class93s[i_2_].anInt1664;
                        }
                        if (i_10_ != i_9_) {
                            if ((((Class51.anIntArray2257[i_8_] ^ 0xffffffff)
                                    != -2)
                                    || i_10_ <= i_9_)
                                    && ((Class51.anIntArray2257[i_8_]
                                    ^ 0xffffffff) != -1
                                    || i_9_ <= i_10_))
                                bool = false;
                            break;
                        }
                        if ((i_8_ ^ 0xffffffff) == -4)
                            bool = false;
                    }
                } while (bool);
                if ((i_3_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
                    Class93 class93_11_ = class93s[i_2_];
                    class93s[i_2_] = class93s[i_3_];
                    class93s[i_3_] = class93_11_;
                }
            }
            method392(i_3_, -228, class93s, i_1_);
            method392(i, -228, class93s, 1 + i_3_);
        }
    }

    public static void method393(int i, boolean bool) {
        if (bool != true)
            aClass21_531 = null;
        anInt525++;
        Class93.aClass98_1662.method1564(-18767, i);
        Class7.aClass98_124.method1564(-18767, i);
        Class96.aClass98_1694.method1564(-18767, i);
    }

    public static void method394(byte i, int i_12_) {
        anInt524++;
        if (i != -117)
            method397(-42, 32, -2, -81, 42, 107, -83);
        Class68_Sub20_Sub9 class68_sub20_sub9
                = Class68_Sub13_Sub26_Sub1.method835(i_12_, 1, (byte) -128);
        class68_sub20_sub9.method1101((byte) -50);
    }

    public static void method395(byte i, Class21renamed class21) {
        int i_13_ = 95 / ((-64 - i) / 32);
        Class17.anInt279
                = class21.method335(Applet_Sub1.aRSString_36, (byte) -98);
        Class68_Sub13_Sub14.anInt3670
                = class21.method335(Class47.aRSString_935, (byte) -82);
        anInt526++;
    }

    public static Class72 method396(Component component, int i, int i_14_,
                                    int i_15_) {
        anInt527++;
        try {
            //xxx Class72 class72 = (Class72) Class.forName("Class72_Sub2").newInstance();
            Class72 class72 = new Class72_Sub2();
            if (i_15_ >= -12)
                method393(-53, false);
            class72.method1356(component, i, -121, i_14_);
            return class72;
        } catch (Throwable throwable) {
            Class72_Sub1 class72_sub1 = new Class72_Sub1();
            class72_sub1.method1356(component, i, -127, i_14_);
            return class72_sub1;
        }
    }

    public static void method397(int i, int i_16_, int i_17_, int i_18_,
                                 int i_19_, int i_20_, int i_21_) {
        Class8 class8 = new Class8();
        class8.anInt146 = i_16_ / 128;
        class8.anInt149 = i_17_ / 128;
        class8.anInt145 = i_18_ / 128;
        class8.anInt156 = i_19_ / 128;
        class8.anInt142 = i;
        class8.anInt159 = i_16_;
        class8.anInt162 = i_17_;
        class8.anInt148 = i_18_;
        class8.anInt147 = i_19_;
        class8.anInt152 = i_20_;
        class8.anInt150 = i_21_;
        Class121.aClass8Array2102[Class54.anInt1029++] = class8;
    }

    public static boolean method398(int i) {
        if (i != 24781)
            aClass21_Sub1_529 = null;
        anInt532++;
        return Class23.aBoolean501;
    }

    public static void method399(int i, int i_22_, int i_23_) {
        anInt530++;
        if (Class68_Sub13_Sub21.anInt3803 >= 2
                || (Class68_Sub13_Sub37.anInt4062 ^ 0xffffffff) != -1
                || Class21_Sub1.aBoolean2705) {
            if (i <= 22)
                aClass21_528 = null;
            RSString class100;
            if (Class68_Sub13_Sub37.anInt4062 == 1
                    && Class68_Sub13_Sub21.anInt3803 < 2)
                class100 = (Class68_Sub20_Sub13_Sub2.method1166
                        (2, new RSString[]{Class76.aRSString_1347,
                                Class51.aRSString_2258,
                                Class44.aRSString_743,
                                Class52.aRSString_1002}));
            else if (!Class21_Sub1.aBoolean2705
                    || (Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff) <= -3)
                class100
                        = Class58.method579((byte) -99,
                        Class68_Sub13_Sub21.anInt3803 + -1);
            else
                class100
                        = (Class68_Sub20_Sub13_Sub2.method1166
                        (2, new RSString[]{Class7.aRSString_118,
                                Class51.aRSString_2258,
                                Class68_Sub13_Sub1.aRSString_3452,
                                Class52.aRSString_1002}));
            if ((Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff) < -3)
                class100
                        = (Class68_Sub20_Sub13_Sub2.method1166
                        (2,
                                (new RSString[]
                                        {class100, Class109.aRSString_1834,
                                                Class68_Sub13_Sub24.method816((Class68_Sub13_Sub21
                                                        .anInt3803) + -2,
                                                        0),
                                                Class7.aRSString_137})));
            int i_24_ = (Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1035
                    (class100, i_23_ - -4, 15 + i_22_, 16777215, 0,
                            Class68_Sub13_Sub26.aRandom3873,
                            Class68_Sub13_Sub4.anInt3509));
            Class127.method1781(i_23_ - -4, i_22_,
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511
                            .method1029(class100) - -i_24_,
                    15, (byte) -112);
        }
    }

    public static void method400(int i) {
        aClass21_531 = null;
        aClass21_528 = null;
        if (i != -1)
            aClass21_Sub1_529 = null;
        aClass21_Sub1_529 = null;
    }
}
