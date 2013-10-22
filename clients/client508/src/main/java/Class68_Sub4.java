/* Class68_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub4 extends Class68 {
    public static int anInt2813;
    public static int anInt2815 = 0;
    public static int anInt2816;
    public int anInt2817;
    public static int anInt2818;
    public static RSString aRSString_2819;
    public static int anInt2820;
    public int anInt2821;
    public int anInt2822;
    public int anInt2823;
    public static int anInt2824;
    public static int anInt2825;
    public static int anInt2826;
    public static RSString[] aRSStringArray2827;
    public static int[] anIntArray2828;
    public static RSString aRSString_2829;

    public boolean method656(int i, int i_0_, int i_1_) {
        if (i_0_ != -9710)
            method659(11, 92, 40, 111, -64, -112, -113);
        anInt2818++;
        if (i >= anInt2817 && anInt2823 >= i
                && (anInt2822 ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)
                && (anInt2821 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))
            return true;
        return false;
    }

    public static void method657(int i) {
        Class116.anInt2011 = 0;
        anInt2825++;
        int i_2_
                = ((Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561 >> -1474938329)
                + Class36.anInt643);
        if (i > -123)
            method660(-46, (byte) 115);
        int i_3_ = (Class68_Sub13_Sub35.anInt4026
                + (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                >> -2080897113));
        if (i_2_ >= 3053 && i_2_ <= 3156 && (i_3_ ^ 0xffffffff) <= -3057
                && (i_3_ ^ 0xffffffff) >= -3137)
            Class116.anInt2011 = 1;
        if ((i_2_ ^ 0xffffffff) <= -3073 && i_2_ <= 3118 && i_3_ >= 9492
                && i_3_ <= 9535)
            Class116.anInt2011 = 1;
        if (Class116.anInt2011 == 1 && i_2_ >= 3139
                && (i_2_ ^ 0xffffffff) >= -3200 && (i_3_ ^ 0xffffffff) <= -3009
                && i_3_ <= 3062)
            Class116.anInt2011 = 0;
    }

    public static void method658(int i) {
        aRSStringArray2827 = null;
        Stream.publicKey = null;
        if (i != 27392)
            method660(41, (byte) -106);
        anIntArray2828 = null;
        aRSString_2829 = null;
        aRSString_2819 = null;
    }

    public static void method659(int i, int i_4_, int i_5_, int i_6_, int i_7_,
                                 int i_8_, int i_9_) {
        if (i >= 22) {
            int i_10_ = 0;
            for (Class23[] class23s = Class34.aClass23Array594;
                 (class23s.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
                 i_10_++) {
                Class23 class23 = class23s[i_10_];
                if (class23 != null && class23.anInt489 == 2) {
                    Class67.method641(i_7_, i_9_, i_4_ >> 1891057889,
                            ((-Class68_Sub13_Sub35.anInt4026
                                    + class23.anInt492)
                                    << -1963004729) + class23.anInt503,
                            class23.anInt497 * 2, i_8_ >> 2070267841,
                            (class23.anInt496 + -Class36.anInt643
                                    << 744752135) + class23.anInt502,
                            (byte) -124);
                    if (Class86.anInt1576 > -1
                            && (Class68_Sub3.anInt2812 % 20 ^ 0xffffffff) > -11)
                        Class68_Sub13_Sub12.aClass68_Sub20_Sub10Array3646
                                [class23.anInt499].method1103
                                (i_6_ - -Class86.anInt1576 - 12,
                                        i_5_ - (-Class114.anInt1925 + 28));
                }
            }
            anInt2820++;
        }
    }

    public static void method660(int i, byte i_11_) {
        anInt2826++;
        Class47.anInt934 += 128 * i;
        if (Class47.anInt934 > Class68_Sub20_Sub6.anIntArray4230.length) {
            int i_12_ = (int) (Math.random() * 12.0);
            Class47.anInt934 -= Class68_Sub20_Sub6.anIntArray4230.length;
            Class84.method1476(79,
                    Class68_Sub13.aClass92_Sub1Array2921[i_12_]);
        }
        int i_13_ = 256;
        int i_14_ = i * 128;
        int i_15_ = (i_13_ + -i) * 128;
        int i_16_ = 0;
        for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
            int i_18_
                    = (Class68_Sub20.anIntArray3090[i_14_ + i_16_]
                    + -((Class68_Sub20_Sub6.anIntArray4230
                    [(Class47.anInt934 + i_16_
                    & Class68_Sub20_Sub6.anIntArray4230.length + -1)])
                    * i / 6));
            if ((i_18_ ^ 0xffffffff) > -1)
                i_18_ = 0;
            Class68_Sub20.anIntArray3090[i_16_++] = i_18_;
        }
        for (int i_19_ = i_13_ + -i;
             (i_19_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_19_++) {
            int i_20_ = i_19_ * 128;
            for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -129; i_21_++) {
                int i_22_ = (int) (Math.random() * 100.0);
                if (i_22_ >= 50 || i_21_ <= 10 || i_21_ >= 118)
                    Class68_Sub20.anIntArray3090[i_21_ - -i_20_] = 0;
                else {
                    // this stops the fire from being rendered:
                    // orig: Class68_Sub20.anIntArray3090[i_20_ + i_21_] = 255;
                    Class68_Sub20.anIntArray3090[i_20_ + i_21_] = 0;
                }
            }
        }
        if (i_11_ != 60)
            aRSString_2829 = null;
        for (int i_23_ = 0; i_23_ < -i + i_13_; i_23_++)
            Class68_Sub20_Sub16.anIntArray4416[i_23_]
                    = Class68_Sub20_Sub16.anIntArray4416[i_23_ + i];
        for (int i_24_ = i_13_ - i;
             (i_24_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_24_++) {
            Class68_Sub20_Sub16.anIntArray4416[i_24_]
                    = (int) ((16.0
                    * Math.sin((double) Class68_Sub13.anInt2923 / 14.0))
                    + 14.0 * Math.sin((double) Class68_Sub13.anInt2923
                    / 15.0)
                    + (Math.sin((double) Class68_Sub13.anInt2923 / 16.0)
                    * 12.0));
            Class68_Sub13.anInt2923++;
        }
        Class114.anInt1927 += i;
        int i_25_ = (i - -(Class68_Sub3.anInt2812 & 0x1)) / 2;
        if ((i_25_ ^ 0xffffffff) < -1) {
            for (int i_26_ = 0; Class114.anInt1927 > i_26_; i_26_++) {
                int i_27_ = (int) (124.0 * Math.random()) - -2;
                int i_28_ = (int) (128.0 * Math.random()) + 128;
                Class68_Sub20.anIntArray3090[(i_28_ << -2108211609) + i_27_]
                        = 192;
            }
            Class114.anInt1927 = 0;
            for (int i_29_ = 0; (i_13_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff);
                 i_29_++) {
                int i_30_ = 0;
                int i_31_ = i_29_ * 128;
                for (int i_32_ = -i_25_; (i_32_ ^ 0xffffffff) > -129;
                     i_32_++) {
                    if (i_32_ - -i_25_ < 128)
                        i_30_ += (Class68_Sub20.anIntArray3090
                                [i_25_ + i_31_ + i_32_]);
                    if (i_32_ + (-1 + -i_25_) >= 0)
                        i_30_ -= (Class68_Sub20.anIntArray3090
                                [i_32_ - -i_31_ + -i_25_ + -1]);
                    if (i_32_ >= 0)
                        Class90.anIntArray2345[i_32_ - -i_31_]
                                = i_30_ / (i_25_ * 2 - -1);
                }
            }
            for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > -129; i_33_++) {
                int i_34_ = 0;
                for (int i_35_ = -i_25_;
                     (i_13_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
                    int i_36_ = i_35_ * 128;
                    if (i_35_ + i_25_ < i_13_)
                        i_34_ += (Class90.anIntArray2345
                                [i_36_ + i_33_ - -(i_25_ * 128)]);
                    if ((i_35_ + (-1 + -i_25_) ^ 0xffffffff) <= -1)
                        i_34_ -= (Class90.anIntArray2345
                                [-(128 * i_25_) - 128 + (i_36_ + i_33_)]);
                    if ((i_35_ ^ 0xffffffff) <= -1)
                        Class68_Sub20.anIntArray3090[i_36_ + i_33_]
                                = i_34_ / (i_25_ * 2 + 1);
                }
            }
        }
    }

    public static void method661(Class1_Sub6_Sub2 class1_sub6_sub2, int i,
                                 int i_37_, int i_38_, int i_39_) {
        anInt2824++;
        if (Class68_Sub7.aClass1_Sub6_Sub2_2860 != class1_sub6_sub2) {
            if (i > -56)
                anIntArray2828 = null;
            if ((Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff) > -401) {
                RSString class100;
                if ((class1_sub6_sub2.anInt3406 ^ 0xffffffff) != -1)
                    class100
                            = (Class68_Sub20_Sub13_Sub2.method1166
                            (2,
                                    (new RSString[]
                                            {class1_sub6_sub2.method160(3000),
                                                    Class68_Sub19.aRSString_3066,
                                                    Class118.aRSString_2080,
                                                    Class68_Sub13_Sub24
                                                            .method816(class1_sub6_sub2.anInt3406, 0),
                                                    Class68_Sub26.aRSString_3195})));
                else
                    class100
                            = (Class68_Sub20_Sub13_Sub2.method1166
                            (2,
                                    (new RSString[]
                                            {class1_sub6_sub2.method160(3000),
                                                    (Class68_Sub20_Sub8.method1089
                                                            (class1_sub6_sub2.anInt3415, true,
                                                                    (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                                            .anInt3415))),
                                                    Class68_Sub19.aRSString_3066,
                                                    Class58.aRSString_1095,
                                                    Class68_Sub13_Sub24
                                                            .method816(class1_sub6_sub2.anInt3415, 0),
                                                    Class68_Sub26.aRSString_3195})));
                if ((Class68_Sub13_Sub37.anInt4062 ^ 0xffffffff) == -2) {
                    Class68_Sub3.method652(i_37_, i_38_, (byte) -124,
                            (Class68_Sub20_Sub13_Sub2.method1166
                                    (2, (new RSString[]
                                            {Class44.aRSString_743,
                                                    (Class68_Sub20_Sub13_Sub2
                                                            .aRSString_4623),
                                                    class100}))),
                            (short) 2, Class76.aRSString_1347,
                            (long) i_39_);
                    Class25.anInt514++;
                } else if (Class21_Sub1.aBoolean2705) {
                    if ((Class33.anInt589 & 0x8) == 8) {
                        Class33.anInt575++;
                        Class68_Sub3.method652
                                (i_37_, i_38_, (byte) -85,
                                        (Class68_Sub20_Sub13_Sub2.method1166
                                                (2, (new RSString[]
                                                        {Class68_Sub13_Sub1.aRSString_3452,
                                                                Class68_Sub20_Sub13_Sub2.aRSString_4623,
                                                                class100}))),
                                        (short) 50, Class7.aRSString_118, (long) i_39_);
                    }
                } else {
                    for (int i_40_ = 7; i_40_ >= 0; i_40_--) {
                        if (Class127.aRSStringArray2207[i_40_] != null) {
                            short i_41_ = 0;
                            if (Class68_Sub13_Sub34.anInt4008 == 0
                                    && (Class127.aRSStringArray2207[i_40_]
                                    .method1600
                                            (false, Class29.aRSString_535))) {
                                if ((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                        .anInt3415)
                                        < class1_sub6_sub2.anInt3415)
                                    i_41_ = (short) 2000;
                                if (((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                        .anInt3431)
                                        ^ 0xffffffff) != -1
                                        && class1_sub6_sub2.anInt3431 != 0) {
                                    if ((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                            .anInt3431)
                                            == class1_sub6_sub2.anInt3431)
                                        i_41_ = (short) 2000;
                                    else
                                        i_41_ = (short) 0;
                                }
                            } else if (Class118.aBooleanArray2078[i_40_])
                                i_41_ = (short) 2000;
                            boolean bool = false;
                            Class68_Sub6.anInt2842++;
                            short i_42_ = Class109.aShortArray1836[i_40_];
                            i_42_ += i_41_;
                            Class68_Sub3.method652
                                    (i_37_, i_38_, (byte) -56,
                                            (Class68_Sub20_Sub13_Sub2.method1166
                                                    (2, new RSString[]{Class68.aRSString_1223,
                                                            class100})),
                                            i_42_, Class127.aRSStringArray2207[i_40_],
                                            (long) i_39_);
                        }
                    }
                }
                for (int i_43_ = 0; i_43_ < Class68_Sub13_Sub21.anInt3803;
                     i_43_++) {
                    if ((Class68_Sub28_Sub1.aShortArray4471[i_43_]
                            ^ 0xffffffff)
                            == -6) {
                        Class33.aRSStringArray582[i_43_]
                                = (Class68_Sub20_Sub13_Sub2.method1166
                                (2, new RSString[]{Class68.aRSString_1223,
                                        class100}));
                        break;
                    }
                }
            }
        }
    }

    public Class68_Sub4(int i, int i_44_, int i_45_, int i_46_) {
        anInt2822 = i_44_;
        anInt2817 = i;
        anInt2823 = i_45_;
        anInt2821 = i_46_;
    }

    static {
        anInt2813 = 0;
        aRSString_2819 = null;
        aRSString_2829 = RSString.newRsString("zap");
        anIntArray2828 = new int[200];
        aRSStringArray2827 = new RSString[100];
    }
}
