/* Class1_Sub6_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub6_Sub1 extends Class1_Sub6 {
    public static int anInt3390;
    public static short aShort3391 = 256;
    public static long aLong3392 = 0L;
    public static int anInt3393;
    public static int anInt3394;
    public Class80 aClass80_3395;
    public static int anInt3396;
    public static int anInt3397;
    public static int anInt3398;

    public void method51(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                         int i_4_, int i_5_, int i_6_, long l) {
        anInt3393++;
        if (aClass80_3395 != null) {
            Class55 class117
                    = (anInt2568 != -1 && (anInt2545 ^ 0xffffffff) == -1
                    ? Class64.method624((byte) -36, anInt2568) : null);
            Class55 class117_7_
                    = ((anInt2524 != -1
                    && ((anInt2524 ^ 0xffffffff) != (anInt2530 ^ 0xffffffff)
                    || class117 == null))
                    ? Class64.method624((byte) -36, anInt2524) : null);
            Class1_Sub3 class1_sub3
                    = aClass80_3395.method1451(anInt2555, class117_7_, (byte) 17,
                    class117, anInt2522);
            if (class1_sub3 != null) {
                anInt2566 = class1_sub3.method56();
                Class80 class80 = aClass80_3395;
                if (class80.anIntArray1431 != null)
                    class80 = class80.method1447(-94);
                if (Class68_Sub20_Sub13_Sub2.aBoolean4629
                        && class80.aBoolean1448) {
                    Class1_Sub3 class1_sub3_8_
                            = (GameException.method1793
                            (anInt2537, i, anInt2582, class1_sub3,
                                    class117_7_ == null ? anInt2522 : anInt2555,
                                    class117_7_ != null ? class117_7_ : class117,
                                    aClass80_3395.aByte1453, aClass80_3395.aShort1436,
                                    anInt2561, aClass80_3395.anInt1451,
                                    aClass80_3395.aByte1470, aClass80_3395.aShort1464,
                                    126, aBoolean2583));
                    class1_sub3_8_.method51(0, i_0_, i_1_, i_2_, i_3_, i_4_,
                            i_5_, i_6_, -1L);
                }
                int i_9_ = 0;
                int i_10_ = 0;
                int i_11_ = 0;
                if ((aClass80_3395.aShort1419 ^ 0xffffffff) != -1
                        || aClass80_3395.aShort1423 != 0) {
                    int i_12_ = Class62.anIntArray1167[i];
                    int i_13_ = Class62.anIntArray1155[i];
                    int i_14_ = aClass80_3395.aShort1423;
                    int i_15_ = -i_14_ / 2;
                    int i_16_ = aClass80_3395.aShort1419;
                    int i_17_ = -i_16_ / 2;
                    int i_18_ = i_15_ * i_12_ + -(i_17_ * i_13_) >> 1251056880;
                    int i_19_ = i_17_ * i_12_ + i_13_ * i_15_ >> 115299728;
                    int i_20_
                            = Class1_Sub6_Sub2.method163(i_19_ + anInt2561,
                            GameSocket.anInt1149,
                            i_18_ + anInt2537, false);
                    int i_21_ = i_16_ / 2;
                    int i_22_ = -i_14_ / 2;
                    int i_23_ = i_22_ * i_13_ - -(i_21_ * i_12_) >> 1936501744;
                    int i_24_
                            = i_12_ * i_22_ + -(i_21_ * i_13_) >> -1685447984;
                    int i_25_
                            = Class1_Sub6_Sub2.method163(i_23_ + anInt2561,
                            GameSocket.anInt1149,
                            anInt2537 + i_24_, false);
                    int i_26_ = -i_16_ / 2;
                    int i_27_ = i_14_ / 2;
                    int i_28_
                            = -(i_13_ * i_26_) + i_12_ * i_27_ >> -1205804048;
                    int i_29_ = i_14_ / 2;
                    int i_30_ = i_27_ * i_13_ + i_26_ * i_12_ >> -1207711408;
                    int i_31_ = i_16_ / 2;
                    int i_32_
                            = i_29_ * i_13_ - -(i_31_ * i_12_) >> -1730400016;
                    int i_33_ = -(i_13_ * i_31_) + i_29_ * i_12_ >> -789010448;
                    int i_34_
                            = Class1_Sub6_Sub2.method163(i_30_ + anInt2561,
                            GameSocket.anInt1149,
                            i_28_ + anInt2537, false);
                    int i_35_
                            = Class1_Sub6_Sub2.method163(anInt2561 - -i_32_,
                            GameSocket.anInt1149,
                            anInt2537 + i_33_, false);
                    i_11_ = i_20_ + i_35_;
                    if ((i_34_ + i_25_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff))
                        i_11_ = i_25_ + i_34_;
                    int i_36_ = i_34_ < i_35_ ? i_34_ : i_35_;
                    int i_37_ = i_25_ > i_20_ ? i_20_ : i_25_;
                    int i_38_ = ((i_35_ ^ 0xffffffff) >= (i_25_ ^ 0xffffffff)
                            ? i_35_ : i_25_);
                    int i_39_ = ((i_34_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff)
                            ? i_20_ : i_34_);
                    if ((i_14_ ^ 0xffffffff) != -1) {
                        i_9_ = 0x7ff & (int) (Math.atan2((double) (-i_36_
                                + i_37_),
                                (double) i_14_)
                                * 325.95);
                        if ((i_9_ ^ 0xffffffff) != -1)
                            class1_sub3.method78(i_9_);
                    }
                    if ((i_16_ ^ 0xffffffff) != -1) {
                        i_10_ = (int) (325.95
                                * Math.atan2((double) (i_39_ + -i_38_),
                                (double) i_16_)) & 0x7ff;
                        if (i_10_ != 0)
                            class1_sub3.method85(i_10_);
                    }
                    i_11_ = -anInt2582 + (i_11_ >> 1813388225);
                    if ((i_11_ ^ 0xffffffff) != -1)
                        class1_sub3.method92(0, i_11_, 0);
                }
                Class1_Sub3 class1_sub3_40_ = null;
                if ((anInt2552 ^ 0xffffffff) != 0 && anInt2578 != -1) {
                    Class70 class70
                            = Class68_Sub20_Sub13.method1160(anInt2552, 1);
                    class1_sub3_40_ = class70.method1337(anInt2578, -10);
                    if (class1_sub3_40_ != null) {
                        class1_sub3_40_.method92(0, -anInt2560, 0);
                        if (class70.aBoolean1279) {
                            if (i_9_ != 0)
                                class1_sub3_40_.method78(i_9_);
                            if ((i_10_ ^ 0xffffffff) != -1)
                                class1_sub3_40_.method85(i_10_);
                            if ((i_11_ ^ 0xffffffff) != -1)
                                class1_sub3_40_.method92(0, i_11_, 0);
                        }
                    }
                }
                if (class1_sub3_40_ != null)
                    class1_sub3 = ((Class1_Sub3_Sub1) class1_sub3)
                            .method106(class1_sub3_40_);
                if (aClass80_3395.anInt1451 == 1)
                    class1_sub3.aBoolean2443 = true;
                class1_sub3.method51(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_,
                        i_6_, l);
            }
        }
    }

    public boolean method150(int i) {
        anInt3390++;
        if (aClass80_3395 == null)
            return false;
        if (i < 14)
            method155(null, false, -3);
        return true;
    }

    public static void method154(byte i, Class1_Sub6 class1_sub6) {
        if (i <= 116)
            method156(106, 48, 104, -51);
        if (class1_sub6.anInt2588 == 0)
            class1_sub6.anInt2533 = 1024;
        class1_sub6.anInt2520 = 0;
        anInt3398++;
        if (class1_sub6.anInt2588 == 1)
            class1_sub6.anInt2533 = 1536;
        int i_41_
                = class1_sub6.anInt2559 * 128 - -(64 * class1_sub6.anInt2544);
        if (class1_sub6.anInt2588 == 2)
            class1_sub6.anInt2533 = 0;
        int i_42_ = -Class68_Sub3.anInt2812 + class1_sub6.anInt2550;
        int i_43_
                = 128 * class1_sub6.anInt2518 - -(class1_sub6.anInt2544 * 64);
        class1_sub6.anInt2561 += (i_41_ + -class1_sub6.anInt2561) / i_42_;
        if ((class1_sub6.anInt2588 ^ 0xffffffff) == -4)
            class1_sub6.anInt2533 = 512;
        class1_sub6.anInt2537 += (i_43_ - class1_sub6.anInt2537) / i_42_;
    }

    public int method56() {
        anInt3394++;
        return anInt2566;
    }

    public static void method155(RSString class100, boolean bool, int i) {
        anInt3396++;
        if (i >= -112)
            aLong3392 = -56L;
        if (!bool) {
            try {
                Class69.anApplet_Sub1_1241.getAppletContext().showDocument
                        (class100.method1582(Class69.anApplet_Sub1_1241
                                .getCodeBase(),
                                4),
                                "_top");
            } catch (Exception exception) {
                /* empty */
            }
        } else {
            try {
                Class69.anApplet_Sub1_1241.getAppletContext().showDocument
                        (class100.method1582(Class69.anApplet_Sub1_1241
                                .getCodeBase(),
                                4),
                                "_blank");
            } catch (Exception exception) {
                /* empty */
            }
        }
    }

    public static int method156(int i, int i_44_, int i_45_, int i_46_) {
        anInt3397++;
        int i_47_ = i_44_ / i;
        int i_48_ = i_44_ & i_46_ + i;
        int i_49_ = i_45_ / i;
        int i_50_ = Class68_Sub19.method1002(i_47_, i_49_, i_46_ + 17);
        int i_51_ = i_45_ & -1 + i;
        int i_52_ = Class68_Sub19.method1002(1 + i_47_, i_49_, 16);
        int i_53_ = Class68_Sub19.method1002(i_47_, i_49_ - -1, 16);
        int i_54_ = Class68_Sub19.method1002(i_47_ + 1, 1 + i_49_, 16);
        int i_55_ = Class78.method1414(i_48_, i_50_, i_52_, (byte) 25, i);
        int i_56_ = Class78.method1414(i_48_, i_53_, i_54_, (byte) 25, i);
        return Class78.method1414(i_51_, i_55_, i_56_, (byte) 25, i);
    }
}
