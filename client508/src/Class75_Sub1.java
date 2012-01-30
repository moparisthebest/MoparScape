/* Class75_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75_Sub1 extends Class75 {
    public static int anInt3291;
    public static int[] anIntArray3292;
    public static int[] anIntArray3293;
    public static Class98 aClass98_3294;
    public static int[] anIntArray3295;
    public static int anInt3296;
    public static int[] anIntArray3297;
    public static int anInt3298;
    public static RSString[] aRSStringArray3299;
    public static int[] anIntArray3300;
    public static int anInt3301 = 50;
    public static int anInt3302;
    public static int[] anIntArray3303;
    public static long aLong3304;
    public static int[] anIntArray3305;
    public static Class69[] aClass69Array3306;

    public static RSString[] method1387(byte i, RSString[] class100s) {
        anInt3296++;
        RSString[] class100s_0_ = new RSString[5];
        for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -6; i_1_++) {
            class100s_0_[i_1_]
                    = (Class68_Sub20_Sub13_Sub2.method1166
                    (2, new RSString[]{Class68_Sub13_Sub24.method816(i_1_, 0),
                            Class16.aRSString_274}));
            if (class100s != null && class100s[i_1_] != null)
                class100s_0_[i_1_]
                        = Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]
                        {(class100s_0_
                                [i_1_]),
                                (class100s
                                        [i_1_])}));
        }
        if (i >= -65)
            method1387((byte) -122, null);
        return class100s_0_;
    }

    public static void method1388(int i, int i_2_, int i_3_, int i_4_,
                                  int i_5_, int i_6_, int i_7_) {
        Class60.method587(-1, i_7_);
        int i_8_ = 0;
        anInt3291++;
        int i_9_ = i_7_;
        int i_10_ = -i_7_;
        int i_11_ = i_7_ + -i_4_;
        if ((i_11_ ^ 0xffffffff) > -1)
            i_11_ = 0;
        int i_12_ = i_11_;
        if (i_6_ == -135) {
            int i_13_ = -i_11_;
            int i_14_ = -1;
            if ((Class35.anInt605 ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)
                    && i_2_ <= Class51.anInt2255) {
                int[] is = Class68_Sub22.anIntArrayArray3132[i_2_];
                int i_15_ = Class68_Sub20_Sub15.method1171(i_5_ - i_7_,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                int i_16_ = Class68_Sub20_Sub15.method1171(i_5_ - -i_7_,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                int i_17_ = Class68_Sub20_Sub15.method1171(-i_11_ + i_5_,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                int i_18_ = Class68_Sub20_Sub15.method1171(i_5_ - -i_11_,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                Class34.method416(i_15_, (byte) -17, i_3_, is, i_17_);
                Class34.method416(i_17_, (byte) -17, i, is, i_18_);
                Class34.method416(i_18_, (byte) -17, i_3_, is, i_16_);
            }
            int i_19_ = -1;
            while ((i_9_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
                i_14_ += 2;
                i_19_ += 2;
                i_10_ += i_14_;
                i_13_ += i_19_;
                if (i_13_ >= 0 && (i_12_ ^ 0xffffffff) <= -2) {
                    i_12_--;
                    Class71_Sub1.anIntArray3255[i_12_] = i_8_;
                    i_13_ -= i_12_ << 1586863489;
                }
                i_8_++;
                if (i_10_ >= 0) {
                    i_9_--;
                    i_10_ -= i_9_ << -199004927;
                    int i_20_ = i_2_ + -i_9_;
                    int i_21_ = i_2_ + i_9_;
                    if ((Class35.anInt605 ^ 0xffffffff) >= (i_21_ ^ 0xffffffff)
                            && i_20_ <= Class51.anInt2255) {
                        if (i_11_ > i_9_) {
                            int i_22_ = Class71_Sub1.anIntArray3255[i_9_];
                            int i_23_ = (Class68_Sub20_Sub15.method1171
                                    (i_5_ + i_8_, Class113.anInt1918,
                                            (byte) 114, GroundData.anInt677));
                            int i_24_ = (Class68_Sub20_Sub15.method1171
                                    (-i_8_ + i_5_, Class113.anInt1918,
                                            (byte) 114, GroundData.anInt677));
                            int i_25_ = (Class68_Sub20_Sub15.method1171
                                    (i_22_ + i_5_, Class113.anInt1918,
                                            (byte) 114, GroundData.anInt677));
                            int i_26_ = (Class68_Sub20_Sub15.method1171
                                    (i_5_ + -i_22_, Class113.anInt1918,
                                            (byte) 114, GroundData.anInt677));
                            if (Class51.anInt2255 >= i_21_) {
                                int[] is
                                        = Class68_Sub22.anIntArrayArray3132[i_21_];
                                Class34.method416(i_24_, (byte) -17, i_3_, is,
                                        i_26_);
                                Class34.method416(i_26_, (byte) -17, i, is,
                                        i_25_);
                                Class34.method416(i_25_, (byte) -17, i_3_, is,
                                        i_23_);
                            }
                            if (i_20_ >= Class35.anInt605) {
                                int[] is
                                        = Class68_Sub22.anIntArrayArray3132[i_20_];
                                Class34.method416(i_24_, (byte) -17, i_3_, is,
                                        i_26_);
                                Class34.method416(i_26_, (byte) -17, i, is,
                                        i_25_);
                                Class34.method416(i_25_, (byte) -17, i_3_, is,
                                        i_23_);
                            }
                        } else {
                            int i_27_ = (Class68_Sub20_Sub15.method1171
                                    (i_5_ - -i_8_, Class113.anInt1918,
                                            (byte) 114, GroundData.anInt677));
                            int i_28_ = (Class68_Sub20_Sub15.method1171
                                    (-i_8_ + i_5_, Class113.anInt1918,
                                            (byte) 114, GroundData.anInt677));
                            if ((Class51.anInt2255 ^ 0xffffffff)
                                    <= (i_21_ ^ 0xffffffff))
                                Class34.method416(i_28_, (byte) -17, i_3_,
                                        (Class68_Sub22
                                                .anIntArrayArray3132
                                                [i_21_]),
                                        i_27_);
                            if (i_20_ >= Class35.anInt605)
                                Class34.method416(i_28_, (byte) -17, i_3_,
                                        (Class68_Sub22
                                                .anIntArrayArray3132
                                                [i_20_]),
                                        i_27_);
                        }
                    }
                }
                int i_29_ = i_2_ - -i_8_;
                int i_30_ = i_2_ - i_8_;
                if ((i_29_ ^ 0xffffffff) <= (Class35.anInt605 ^ 0xffffffff)
                        && (i_30_ ^ 0xffffffff) >= (Class51.anInt2255
                        ^ 0xffffffff)) {
                    int i_31_ = i_9_ + i_5_;
                    int i_32_ = i_5_ + -i_9_;
                    if (GroundData.anInt677 <= i_31_
                            && (i_32_ ^ 0xffffffff) >= (Class113.anInt1918
                            ^ 0xffffffff)) {
                        i_31_
                                = Class68_Sub20_Sub15.method1171(i_31_,
                                (Class113
                                        .anInt1918),
                                (byte) 114,
                                GroundData.anInt677);
                        i_32_
                                = Class68_Sub20_Sub15.method1171(i_32_,
                                (Class113
                                        .anInt1918),
                                (byte) 114,
                                GroundData.anInt677);
                        if (i_11_ > i_8_) {
                            int i_33_ = (i_12_ < i_8_
                                    ? Class71_Sub1.anIntArray3255[i_8_]
                                    : i_12_);
                            int i_34_ = (Class68_Sub20_Sub15.method1171
                                    (i_33_ + i_5_, Class113.anInt1918,
                                            (byte) 114, GroundData.anInt677));
                            int i_35_ = (Class68_Sub20_Sub15.method1171
                                    (i_5_ + -i_33_, Class113.anInt1918,
                                            (byte) 114, GroundData.anInt677));
                            if ((Class51.anInt2255 ^ 0xffffffff)
                                    <= (i_29_ ^ 0xffffffff)) {
                                int[] is
                                        = Class68_Sub22.anIntArrayArray3132[i_29_];
                                Class34.method416(i_32_, (byte) -17, i_3_, is,
                                        i_35_);
                                Class34.method416(i_35_, (byte) -17, i, is,
                                        i_34_);
                                Class34.method416(i_34_, (byte) -17, i_3_, is,
                                        i_31_);
                            }
                            if (i_30_ >= Class35.anInt605) {
                                int[] is
                                        = Class68_Sub22.anIntArrayArray3132[i_30_];
                                Class34.method416(i_32_, (byte) -17, i_3_, is,
                                        i_35_);
                                Class34.method416(i_35_, (byte) -17, i, is,
                                        i_34_);
                                Class34.method416(i_34_, (byte) -17, i_3_, is,
                                        i_31_);
                            }
                        } else {
                            if (i_29_ <= Class51.anInt2255)
                                Class34.method416(i_32_, (byte) -17, i_3_,
                                        (Class68_Sub22
                                                .anIntArrayArray3132
                                                [i_29_]),
                                        i_31_);
                            if ((i_30_ ^ 0xffffffff)
                                    <= (Class35.anInt605 ^ 0xffffffff))
                                Class34.method416(i_32_, (byte) -17, i_3_,
                                        (Class68_Sub22
                                                .anIntArrayArray3132
                                                [i_30_]),
                                        i_31_);
                        }
                    }
                }
            }
        }
    }

    public static void method1389(int i, Class1_Sub6 class1_sub6) {
        anInt3302++;
        if ((Class68_Sub3.anInt2812 ^ 0xffffffff) == (class1_sub6.anInt2521
                ^ 0xffffffff)
                || class1_sub6.anInt2568 == -1 || class1_sub6.anInt2545 != 0
                || (class1_sub6.anInt2556 + 1
                > (Class64.method624((byte) -36, class1_sub6.anInt2568)
                .anIntArray2058[class1_sub6.anInt2522]))) {
            int i_36_ = Class68_Sub3.anInt2812 + -class1_sub6.anInt2550;
            int i_37_ = -class1_sub6.anInt2550 + class1_sub6.anInt2521;
            int i_38_
                    = class1_sub6.anInt2544 * 64 + 128 * class1_sub6.anInt2518;
            int i_39_
                    = 128 * class1_sub6.anInt2542 + 64 * class1_sub6.anInt2544;
            int i_40_
                    = 64 * class1_sub6.anInt2544 + class1_sub6.anInt2519 * 128;
            class1_sub6.anInt2537
                    = ((i_37_ - i_36_) * i_38_ - -(i_40_ * i_36_)) / i_37_;
            int i_41_
                    = class1_sub6.anInt2559 * 128 + class1_sub6.anInt2544 * 64;
            class1_sub6.anInt2561
                    = (i_36_ * i_39_ + (i_37_ - i_36_) * i_41_) / i_37_;
        }
        if (i == 128) {
            if (class1_sub6.anInt2588 == 0)
                class1_sub6.anInt2533 = 1024;
            if (class1_sub6.anInt2588 == 1)
                class1_sub6.anInt2533 = 1536;
            if (class1_sub6.anInt2588 == 2)
                class1_sub6.anInt2533 = 0;
            if ((class1_sub6.anInt2588 ^ 0xffffffff) == -4)
                class1_sub6.anInt2533 = 512;
            class1_sub6.anInt2548 = class1_sub6.anInt2533;
            class1_sub6.anInt2520 = 0;
        }
    }

    public static void method1390(int i) {
        anIntArray3295 = null;
        anIntArray3305 = null;
        aClass98_3294 = null;
        anIntArray3292 = null;
        anIntArray3297 = null;
        anIntArray3300 = null;
        if (i != 32655)
            anIntArray3300 = null;
        aClass69Array3306 = null;
        anIntArray3303 = null;
        aRSStringArray3299 = null;
        anIntArray3293 = null;
    }

    static {
        anIntArray3300 = new int[anInt3301];
        anIntArray3295 = new int[anInt3301];
        aLong3304 = 0L;
        anIntArray3303 = new int[anInt3301];
        anIntArray3292 = new int[anInt3301];
        anIntArray3293 = new int[anInt3301];
        aRSStringArray3299 = new RSString[anInt3301];
        anIntArray3305 = new int[anInt3301];
        anIntArray3297 = new int[anInt3301];
        aClass98_3294 = new Class98(64);
        aClass69Array3306 = new Class69[100];
    }
}
