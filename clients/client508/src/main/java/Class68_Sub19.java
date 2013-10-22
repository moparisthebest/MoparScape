/* Class68_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub19 extends Class68 {
    public static int anInt3065;
    public static RSString aRSString_3066 = RSString.newRsString(" (X");
    public int anInt3067;
    public static int anInt3068;
    public static Class92_Sub1[] aClass92_Sub1Array3069;
    public static boolean aBoolean3070 = false;
    public static int anInt3071;
    public static int anInt3072;
    public RSString aRSString_3073;
    public static int anInt3074;
    public byte aByte3075;
    public RSString aRSString_3076;
    public static int[] anIntArray3077;
    public static int anInt3078;

    public static RSString method996(int i, Stream class68_sub14) {
        anInt3074++;
        int i_0_ = 19 % ((-21 - i) / 37);
        return Class68_Sub13_Sub8.method734(0, class68_sub14, 32767);
    }

    public static int method997(int i, int i_1_, int i_2_) {
        if (i_2_ < 65)
            return 23;
        int i_3_ = 1;
        anInt3078++;
        while ((i ^ 0xffffffff) < -2) {
            if ((i & 0x1 ^ 0xffffffff) != -1)
                i_3_ *= i_1_;
            i >>= 1;
            i_1_ *= i_1_;
        }
        if ((i ^ 0xffffffff) == -2)
            return i_3_ * i_1_;
        return i_3_;
    }

    public static void method998(boolean bool) {
        aClass92_Sub1Array3069 = null;
        aRSString_3066 = null;
        if (bool == true)
            anIntArray3077 = null;
    }

    public static void method999(int i, int i_4_, int i_5_, Class45[] class45s,
                                 int i_6_, int i_7_, int i_8_, int i_9_,
                                 int i_10_, int i_11_) {
        Class79.method1427(i_8_, i_5_, i_6_, i);
        Class62.method612();
        if (i_4_ == -21644) {
            anInt3065++;
            for (int i_12_ = 0; i_12_ < class45s.length; i_12_++) {
                Class45 class45 = class45s[i_12_];
                if (class45 != null
                        && ((i_10_ ^ 0xffffffff) == (class45.anInt799 ^ 0xffffffff)
                        || (i_10_ == -1412584499
                        && class45 == Class35.aClass45_606))) {
                    int i_13_;
                    if (i_7_ == -1) {
                        Class105.anIntArray1795[Class56.anInt1061]
                                = i_11_ + class45.anInt815;
                        Class71.anIntArray1294[Class56.anInt1061]
                                = class45.anInt903 + i_9_;
                        ItemDef.anIntArray376[Class56.anInt1061]
                                = class45.anInt892;
                        Class1_Sub6_Sub2.anIntArray3430[Class56.anInt1061]
                                = class45.anInt873;
                        i_13_ = Class56.anInt1061++;
                    } else
                        i_13_ = i_7_;
                    class45.anInt860 = Class68_Sub3.anInt2812;
                    class45.anInt902 = i_13_;
                    if (!class45.aBoolean863 || !client.method45(class45)) {
                        if (class45.anInt808 > 0)
                            Class91.method1524(30341, class45);
                        int i_14_ = class45.anInt815 - -i_11_;
                        int i_15_ = class45.anInt775;
                        int i_16_ = i_9_ + class45.anInt903;
                        if (Class68_Sub20.aBoolean3094
                                && (client.method41(class45) != 0
                                || class45.anInt896 == 0)
                                && i_15_ > 127)
                            i_15_ = 127;
                        if (Class35.aClass45_606 == class45) {
                            if (i_10_ != -1412584499 && !class45.aBoolean766) {
                                Class121.anInt2107 = i_9_;
                                Class68_Sub4.anInt2816 = i_11_;
                                Class103.aClass45Array1763 = class45s;
                                continue;
                            }
                            if (Class15.aBoolean247
                                    && Class68_Sub18.aBoolean3058) {
                                int i_17_ = Class13.anInt223;
                                i_17_ -= Class58.anInt1087;
                                if (i_17_ < Class113.anInt1903)
                                    i_17_ = Class113.anInt1903;
                                int i_18_ = Class96.anInt1695;
                                i_18_ -= Class68_Sub13_Sub25.anInt3853;
                                if ((Class68_Sub13_Sub37.anInt4073
                                        ^ 0xffffffff)
                                        < (i_18_ ^ 0xffffffff))
                                    i_18_ = Class68_Sub13_Sub37.anInt4073;
                                if ((Class68_Sub13_Sub26_Sub1.aClass45_4607
                                        .anInt892) + Class68_Sub13_Sub37.anInt4073
                                        < class45.anInt892 + i_18_)
                                    i_18_ = ((Class68_Sub13_Sub26_Sub1
                                            .aClass45_4607.anInt892)
                                            + (Class68_Sub13_Sub37.anInt4073
                                            + -class45.anInt892));
                                i_14_ = i_18_;
                                if (((Class113.anInt1903
                                        + (Class68_Sub13_Sub26_Sub1.aClass45_4607
                                        .anInt873))
                                        ^ 0xffffffff)
                                        > (i_17_ + class45.anInt873 ^ 0xffffffff))
                                    i_17_ = (Class113.anInt1903
                                            + ((Class68_Sub13_Sub26_Sub1
                                            .aClass45_4607.anInt873)
                                            - class45.anInt873));
                                i_16_ = i_17_;
                            }
                            if (!class45.aBoolean766)
                                i_15_ = 128;
                        }
                        int i_19_;
                        int i_20_;
                        int i_21_;
                        int i_22_;
                        if (class45.anInt896 == 2) {
                            i_19_ = i_8_;
                            i_21_ = i;
                            i_20_ = i_5_;
                            i_22_ = i_6_;
                        } else {
                            i_19_ = i_14_ <= i_8_ ? i_8_ : i_14_;
                            i_20_
                                    = ((i_16_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff)
                                    ? i_5_ : i_16_);
                            int i_23_ = class45.anInt892 + i_14_;
                            int i_24_ = i_16_ - -class45.anInt873;
                            if ((class45.anInt896 ^ 0xffffffff) == -10) {
                                i_24_++;
                                i_23_++;
                            }
                            i_21_ = ((i ^ 0xffffffff) >= (i_24_ ^ 0xffffffff)
                                    ? i : i_24_);
                            i_22_ = ((i_23_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)
                                    ? i_23_ : i_6_);
                        }
                        if (!class45.aBoolean863
                                || ((i_19_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)
                                && i_20_ < i_21_)) {
                            if (class45.anInt808 != 0) {
                                if ((class45.anInt808 ^ 0xffffffff) == -1338) {
                                    Class68_Sub2.anInt2798 = i_14_;
                                    Class16.anInt276 = i_16_;
                                    Class68_Sub20_Sub17.aClass45_4441
                                            = class45;
                                    Class68_Sub13_Sub31.method857
                                            (i_16_, class45.anInt892, false, i_14_,
                                                    ((class45.anInt808 ^ 0xffffffff)
                                                            == -1404),
                                                    class45.anInt873);
                                    Class79.method1427(i_8_, i_5_, i_6_, i);
                                    continue;
                                }
                                if (class45.anInt808 == 1338) {
                                    if (class45.method497(2663)) {
                                        Canvas_Sub1.method49(class45, i_14_,
                                                i_16_, i_13_,
                                                (byte) -101);
                                        Class79.method1427(i_8_, i_5_, i_6_,
                                                i);
                                    }
                                    continue;
                                }
                                if (class45.anInt808 == 1339) {
                                    if (class45.method497(2663)) {
                                        Class1_Sub1.method65(i_16_, i_13_,
                                                (byte) -123,
                                                class45, i_14_);
                                        Class79.method1427(i_8_, i_5_, i_6_,
                                                i);
                                    }
                                    continue;
                                }
                                if ((class45.anInt808 ^ 0xffffffff) == -1401) {
                                    Class90.method1512(i_16_, (byte) 51,
                                            class45.anInt873,
                                            class45.anInt892,
                                            i_14_);
                                    Class121.aBooleanArray2109[i_13_] = true;
                                    Class68_Sub17.aBooleanArray3037[i_13_]
                                            = true;
                                    Class79.method1427(i_8_, i_5_, i_6_, i);
                                    continue;
                                }
                                if (class45.anInt808 == 1401) {
                                    Class35.method424(i_16_, class45.anInt873,
                                            class45.anInt892, i_14_,
                                            true);
                                    Class121.aBooleanArray2109[i_13_] = true;
                                    Class68_Sub17.aBooleanArray3037[i_13_]
                                            = true;
                                    Class79.method1427(i_8_, i_5_, i_6_, i);
                                    continue;
                                }
                                if (class45.anInt808 == 1402) {
                                    Class71.method1338(i_16_, i_14_, 95);
                                    Class121.aBooleanArray2109[i_13_] = true;
                                    Class68_Sub17.aBooleanArray3037[i_13_]
                                            = true;
                                    continue;
                                }
                                if ((class45.anInt808 ^ 0xffffffff) == -1405) {
                                    Class68_Sub13_Sub6.method723
                                            ((byte) -38, i_16_,
                                                    (Class68_Sub13_Sub4
                                                            .aClass68_Sub20_Sub1_3511),
                                                    (Class68_Sub13_Sub21
                                                            .aClass68_Sub20_Sub1_3801),
                                                    class45.anInt892, class45.anInt873,
                                                    i_14_, class45);
                                    Class121.aBooleanArray2109[i_13_] = true;
                                    Class68_Sub17.aBooleanArray3037[i_13_]
                                            = true;
                                    continue;
                                }
                                if (class45.anInt808 == 1405) {
                                    if (Class68_Sub22.aBoolean3134) {
                                        int i_25_ = i_14_ + class45.anInt892;
                                        int i_26_ = i_16_ + 15;
                                        Class68_Sub6
                                                .aClass68_Sub20_Sub1_2847
                                                .method1022
                                                        ((Class68_Sub20_Sub13_Sub2
                                                                .method1166
                                                                        (2,
                                                                                (new RSString[]
                                                                                        {ItemDef.aRSString_396,
                                                                                                (Class68_Sub13_Sub24
                                                                                                        .method816
                                                                                                                (Class34.anInt597, 0))}))),
                                                                i_25_, i_26_, 16776960, -1);
                                        i_26_ += 15;
                                        Runtime runtime = Runtime.getRuntime();
                                        int i_27_
                                                = (int) ((runtime.totalMemory()
                                                + -runtime.freeMemory())
                                                / 1024L);
                                        int i_28_ = 16776960;
                                        if (i_27_ > 65536)
                                            i_28_ = 16711680;
                                        Class68_Sub6
                                                .aClass68_Sub20_Sub1_2847
                                                .method1022
                                                        ((Class68_Sub20_Sub13_Sub2
                                                                .method1166
                                                                        (2,
                                                                                (new RSString[]
                                                                                        {Class56.aRSString_1066,
                                                                                                (Class68_Sub13_Sub24
                                                                                                        .method816
                                                                                                                (i_27_, i_4_ ^ ~0x548b)),
                                                                                                Class54.aRSString_1030}))),
                                                                i_25_, i_26_, i_28_, -1);
                                        Class121.aBooleanArray2109[i_13_]
                                                = true;
                                        i_26_ += 15;
                                        Class68_Sub17.aBooleanArray3037[i_13_]
                                                = true;
                                    }
                                    continue;
                                }
                            }
                            if (!Class120.aBoolean2099) {
                                if ((class45.anInt896 ^ 0xffffffff) == -1
                                        && class45.aBoolean916
                                        && ((i_19_ ^ 0xffffffff)
                                        >= (Class68_Sub25.anInt3176
                                        ^ 0xffffffff))
                                        && ((i_20_ ^ 0xffffffff)
                                        >= (Class92.anInt1646 ^ 0xffffffff))
                                        && ((i_22_ ^ 0xffffffff)
                                        < (Class68_Sub25.anInt3176
                                        ^ 0xffffffff))
                                        && ((i_21_ ^ 0xffffffff)
                                        < (Class92.anInt1646 ^ 0xffffffff))
                                        && !Class68_Sub20.aBoolean3094) {
                                    Class68_Sub28_Sub1.aShortArray4471[0]
                                            = (short) 1004;
                                    Class71_Sub1.aRSStringArray3257[0]
                                            = Class34.aRSString_598;
                                    Class68_Sub13_Sub21.anInt3803 = 1;
                                    Class33.aRSStringArray582[0]
                                            = Class68_Sub28_Sub2.aRSString_4556;
                                }
                                if (Class68_Sub25.anInt3176 >= i_19_
                                        && ((Class92.anInt1646 ^ 0xffffffff)
                                        <= (i_20_ ^ 0xffffffff))
                                        && i_22_ > Class68_Sub25.anInt3176
                                        && Class92.anInt1646 < i_21_)
                                    Class121.method1745(-i_14_ + (Class68_Sub25
                                            .anInt3176),
                                            class45, true,
                                            (-i_16_
                                                    + Class92.anInt1646));
                            }
                            if (class45.anInt896 == 0) {
                                if (!class45.aBoolean863
                                        && client.method45(class45)
                                        && class45 != Class108.aClass45_1825)
                                    continue;
                                if (!class45.aBoolean863) {
                                    if ((class45.anInt794 + -class45.anInt873
                                            ^ 0xffffffff)
                                            > (class45.anInt818 ^ 0xffffffff))
                                        class45.anInt818
                                                = (class45.anInt794
                                                - class45.anInt873);
                                    if (class45.anInt818 < 0)
                                        class45.anInt818 = 0;
                                }
                                method999(i_21_, -21644, i_20_, class45s,
                                        i_22_, i_13_, i_19_,
                                        i_16_ - class45.anInt818,
                                        class45.anInt792,
                                        -class45.anInt847 + i_14_);
                                if (class45.aClass45Array769 != null)
                                    method999(i_21_, -21644, i_20_,
                                            class45.aClass45Array769, i_22_,
                                            i_13_, i_19_,
                                            i_16_ + -class45.anInt818,
                                            class45.anInt792,
                                            -class45.anInt847 + i_14_);
                                Class68_Sub3 class68_sub3
                                        = ((Class68_Sub3)
                                        (Login.aClass113_1512.method1678
                                                ((long) class45.anInt792,
                                                        i_4_ + 21602)));
                                if (class68_sub3 != null) {
                                    if (((class68_sub3.anInt2800 ^ 0xffffffff)
                                            == -1)
                                            && !Class120.aBoolean2099
                                            && ((i_19_ ^ 0xffffffff)
                                            >= (Class68_Sub25.anInt3176
                                            ^ 0xffffffff))
                                            && ((Class92.anInt1646 ^ 0xffffffff)
                                            <= (i_20_ ^ 0xffffffff))
                                            && ((Class68_Sub25.anInt3176
                                            ^ 0xffffffff)
                                            > (i_22_ ^ 0xffffffff))
                                            && ((i_21_ ^ 0xffffffff)
                                            < (Class92.anInt1646 ^ 0xffffffff))
                                            && !Class68_Sub20.aBoolean3094) {
                                        Class68_Sub28_Sub1.aShortArray4471[0]
                                                = (short) 1004;
                                        Class71_Sub1.aRSStringArray3257[0]
                                                = Class34.aRSString_598;
                                        Class68_Sub13_Sub21.anInt3803 = 1;
                                        Class33.aRSStringArray582[0]
                                                = (Class68_Sub28_Sub2
                                                .aRSString_4556);
                                    }
                                    Class68_Sub20.method1004(i_19_, i_20_,
                                            i_21_, i_16_,
                                            (class68_sub3
                                                    .anInt2803),
                                            i_13_, i_14_,
                                            i_22_,
                                            (byte) -112);
                                }
                                Class79.method1427(i_8_, i_5_, i_6_, i);
                                Class62.method612();
                            }
                            if (Class4.aBooleanArray95[i_13_]
                                    || ((Class68_Sub20_Sub5.anInt4229 ^ 0xffffffff)
                                    < -2)) {
                                if ((class45.anInt896 ^ 0xffffffff) == -1
                                        && !class45.aBoolean863
                                        && class45.anInt794 > class45.anInt873)
                                    Class68_Sub13_Sub16.method771
                                            (i_16_, class45.anInt818,
                                                    class45.anInt794,
                                                    class45.anInt892 + i_14_,
                                                    class45.anInt873, (byte) -62);
                                if ((class45.anInt896 ^ 0xffffffff) != -2) {
                                    if ((class45.anInt896 ^ 0xffffffff)
                                            == -3) {
                                        int i_29_ = 0;
                                        for (int i_30_ = 0;
                                             ((class45.anInt899 ^ 0xffffffff)
                                                     < (i_30_ ^ 0xffffffff));
                                             i_30_++) {
                                            for (int i_31_ = 0;
                                                 ((class45.anInt773
                                                         ^ 0xffffffff)
                                                         < (i_31_ ^ 0xffffffff));
                                                 i_31_++) {
                                                int i_32_
                                                        = (i_16_
                                                        + ((32
                                                        - -class45.anInt846)
                                                        * i_30_));
                                                int i_33_
                                                        = i_14_ + (class45.anInt885
                                                        + 32) * i_31_;
                                                if ((i_29_ ^ 0xffffffff)
                                                        > -21) {
                                                    i_33_ += (class45
                                                            .anIntArray826
                                                            [i_29_]);
                                                    i_32_ += (class45
                                                            .anIntArray767
                                                            [i_29_]);
                                                }
                                                if (((class45.anIntArray795
                                                        [i_29_])
                                                        ^ 0xffffffff)
                                                        >= -1) {
                                                    if ((class45.anIntArray841
                                                            != null)
                                                            && i_29_ < 20) {
                                                        Class68_Sub20_Sub10 class68_sub20_sub10
                                                                = (class45
                                                                .method499
                                                                        ((byte) -40,
                                                                                i_29_));
                                                        if (class68_sub20_sub10
                                                                == null) {
                                                            if (Class93
                                                                    .aBoolean1669)
                                                                Class113
                                                                        .method1682
                                                                                (class45,
                                                                                        (i_4_
                                                                                                + 21530));
                                                        } else
                                                            class68_sub20_sub10
                                                                    .method1103
                                                                            (i_33_, i_32_);
                                                    }
                                                } else {
                                                    boolean bool = false;
                                                    boolean bool_34_ = false;
                                                    int i_35_ = (class45
                                                            .anIntArray795
                                                            [i_29_]) - 1;
                                                    if ((((i_8_ ^ 0xffffffff)
                                                            > (32 + i_33_
                                                            ^ 0xffffffff))
                                                            && i_33_ < i_6_
                                                            && ((i_32_ + 32
                                                            ^ 0xffffffff)
                                                            < (i_5_
                                                            ^ 0xffffffff))
                                                            && ((i_32_
                                                            ^ 0xffffffff)
                                                            > (i
                                                            ^ 0xffffffff)))
                                                            || ((class45
                                                            == (Class54
                                                            .aClass45_1033))
                                                            && ((Class68_Sub20_Sub2
                                                            .anInt4189)
                                                            == i_29_))) {
                                                        Class68_Sub20_Sub10 class68_sub20_sub10;
                                                        if ((Class68_Sub13_Sub37
                                                                .anInt4062) != 1
                                                                || ((i_29_
                                                                ^ 0xffffffff)
                                                                != ((Class1_Sub6_Sub2
                                                                .anInt3399)
                                                                ^ 0xffffffff))
                                                                || ((class45
                                                                .anInt792)
                                                                != (Class68_Sub28_Sub2
                                                                .anInt4553)))
                                                            class68_sub20_sub10
                                                                    = (Class44
                                                                    .method491
                                                                            (1,
                                                                                    (class45
                                                                                            .anIntArray774
                                                                                            [i_29_]),
                                                                                    false,
                                                                                    i_35_,
                                                                                    3153952,
                                                                                    (class45
                                                                                            .aBoolean785)));
                                                        else
                                                            class68_sub20_sub10
                                                                    = (Class44
                                                                    .method491
                                                                            (2,
                                                                                    (class45
                                                                                            .anIntArray774
                                                                                            [i_29_]),
                                                                                    false,
                                                                                    i_35_, 0,
                                                                                    (class45
                                                                                            .aBoolean785)));
                                                        if (Class62
                                                                .aBoolean1152)
                                                            Class121
                                                                    .aBooleanArray2109
                                                                    [i_13_]
                                                                    = true;
                                                        if (class68_sub20_sub10
                                                                != null) {
                                                            if (((Class54
                                                                    .aClass45_1033)
                                                                    != class45)
                                                                    || ((i_29_
                                                                    ^ 0xffffffff)
                                                                    != ((Class68_Sub20_Sub2
                                                                    .anInt4189)
                                                                    ^ 0xffffffff))) {
                                                                if (((Class1_Sub5
                                                                        .aClass45_2515)
                                                                        != class45)
                                                                        || ((i_29_
                                                                        ^ 0xffffffff)
                                                                        != (Class63.anInt1172
                                                                        ^ 0xffffffff)))
                                                                    class68_sub20_sub10
                                                                            .method1103
                                                                                    (i_33_,
                                                                                            i_32_);
                                                                else
                                                                    class68_sub20_sub10
                                                                            .method1110
                                                                                    (i_33_,
                                                                                            i_32_,
                                                                                            128);
                                                            } else {
                                                                int i_36_
                                                                        = ((Class96
                                                                        .anInt1695)
                                                                        + -(Class59
                                                                        .anInt1102));
                                                                if (i_36_ < 5
                                                                        && ((i_36_
                                                                        ^ 0xffffffff)
                                                                        < 4))
                                                                    i_36_ = 0;
                                                                int i_37_
                                                                        = (-(Class68_Sub18
                                                                        .anInt3046)
                                                                        + (Class13
                                                                        .anInt223));
                                                                if (((i_37_
                                                                        ^ 0xffffffff)
                                                                        > -6)
                                                                        && ((i_37_
                                                                        ^ 0xffffffff)
                                                                        < 4))
                                                                    i_37_ = 0;
                                                                if (((Class68_Sub13_Sub6
                                                                        .anInt3532)
                                                                        ^ 0xffffffff)
                                                                        > -6) {
                                                                    i_37_ = 0;
                                                                    i_36_ = 0;
                                                                }
                                                                class68_sub20_sub10
                                                                        .method1110
                                                                                ((i_33_
                                                                                        - -i_36_),
                                                                                        (i_32_
                                                                                                + i_37_),
                                                                                        128);
                                                                if (i_10_
                                                                        != -1) {
                                                                    Class45 class45_38_
                                                                            = (class45s
                                                                            [(i_10_
                                                                            & 0xffff)]);
                                                                    int i_39_
                                                                            = (Class79
                                                                            .anInt1404);
                                                                    int i_40_
                                                                            = (Class79
                                                                            .anInt1403);
                                                                    if (((i_40_
                                                                            ^ 0xffffffff)
                                                                            < ((i_32_
                                                                            + i_37_)
                                                                            ^ 0xffffffff))
                                                                            && (class45_38_.anInt818
                                                                            > 0)) {
                                                                        int i_41_
                                                                                = Class109.anInt1844 * (i_40_ + (-i_32_ - i_37_)) / 3;
                                                                        if ((i_41_
                                                                                ^ 0xffffffff)
                                                                                < (Class109.anInt1844 * 10
                                                                                ^ 0xffffffff))
                                                                            i_41_ = 10 * Class109.anInt1844;
                                                                        if ((class45_38_.anInt818
                                                                                ^ 0xffffffff)
                                                                                > (i_41_
                                                                                ^ 0xffffffff))
                                                                            i_41_ = class45_38_.anInt818;
                                                                        Class68_Sub18
                                                                                .anInt3046
                                                                                += i_41_;
                                                                        class45_38_
                                                                                .anInt818
                                                                                -= i_41_;
                                                                        Class113
                                                                                .method1682
                                                                                        (class45_38_,
                                                                                                -116);
                                                                    }
                                                                    if (((i_39_
                                                                            ^ 0xffffffff)
                                                                            > ((32
                                                                            + i_37_
                                                                            + i_32_)
                                                                            ^ 0xffffffff))
                                                                            && ((class45_38_.anInt818
                                                                            ^ 0xffffffff)
                                                                            > (class45_38_.anInt794 - class45_38_.anInt873
                                                                            ^ 0xffffffff))) {
                                                                        int i_42_
                                                                                = Class109.anInt1844 * (32 + i_32_ - -i_37_ + -i_39_) / 3;
                                                                        if ((i_42_
                                                                                ^ 0xffffffff)
                                                                                < (10 * Class109.anInt1844
                                                                                ^ 0xffffffff))
                                                                            i_42_ = Class109.anInt1844 * 10;
                                                                        if ((-class45_38_.anInt873 + (class45_38_.anInt794 - class45_38_.anInt818)
                                                                                ^ 0xffffffff)
                                                                                > (i_42_
                                                                                ^ 0xffffffff))
                                                                            i_42_ = -class45_38_.anInt818 + (class45_38_.anInt794 - class45_38_.anInt873);
                                                                        class45_38_
                                                                                .anInt818
                                                                                += i_42_;
                                                                        Class68_Sub18
                                                                                .anInt3046
                                                                                -= i_42_;
                                                                        Class113
                                                                                .method1682
                                                                                        (class45_38_,
                                                                                                -117);
                                                                    }
                                                                }
                                                            }
                                                        } else
                                                            Class113.method1682
                                                                    (class45,
                                                                            -119);
                                                    }
                                                }
                                                i_29_++;
                                            }
                                        }
                                    } else if (class45.anInt896 == 3) {
                                        int i_43_;
                                        if (method1000(i_4_ + 21644,
                                                class45)) {
                                            i_43_ = class45.anInt862;
                                            if ((Class108.aClass45_1825
                                                    == class45)
                                                    && (class45.anInt776
                                                    ^ 0xffffffff) != -1)
                                                i_43_ = class45.anInt776;
                                        } else {
                                            i_43_ = class45.anInt832;
                                            if ((class45
                                                    == Class108.aClass45_1825)
                                                    && (class45.anInt828
                                                    ^ 0xffffffff) != -1)
                                                i_43_ = class45.anInt828;
                                        }
                                        if (i_15_ != 0) {
                                            if (class45.aBoolean866)
                                                Class79.method1435
                                                        (i_14_, i_16_,
                                                                class45.anInt892,
                                                                class45.anInt873, i_43_,
                                                                -(0xff & i_15_) + 256);
                                            else
                                                Class79.method1433
                                                        (i_14_, i_16_,
                                                                class45.anInt892,
                                                                class45.anInt873, i_43_,
                                                                -(0xff & i_15_) + 256);
                                        } else if (!class45.aBoolean866)
                                            Class79.method1415(i_14_, i_16_,
                                                    (class45
                                                            .anInt892),
                                                    (class45
                                                            .anInt873),
                                                    i_43_);
                                        else
                                            Class79.method1439(i_14_, i_16_,
                                                    (class45
                                                            .anInt892),
                                                    (class45
                                                            .anInt873),
                                                    i_43_);
                                    } else if (class45.anInt896 == 4) {
                                        Class68_Sub20_Sub1 class68_sub20_sub1
                                                = (class45.method505
                                                (-103, (Stream
                                                        .aClass92Array3010)));
                                        if (class68_sub20_sub1 == null) {
                                            if (Class93.aBoolean1669)
                                                Class113.method1682(class45,
                                                        -117);
                                        } else {
                                            RSString class100
                                                    = class45.aRSString_881;
                                            int i_44_;
                                            if (method1000(i_4_ ^ ~0x548b,
                                                    class45)) {
                                                i_44_ = class45.anInt862;
                                                if ((class45
                                                        == Class108.aClass45_1825)
                                                        && (class45.anInt776
                                                        ^ 0xffffffff) != -1)
                                                    i_44_ = class45.anInt776;
                                                if (((class45.aRSString_880
                                                        .method1590
                                                                ((byte) -111))
                                                        ^ 0xffffffff)
                                                        < -1)
                                                    class100
                                                            = (class45
                                                            .aRSString_880);
                                            } else {
                                                i_44_ = class45.anInt832;
                                                if ((class45
                                                        == Class108.aClass45_1825)
                                                        && class45.anInt828 != 0)
                                                    i_44_ = class45.anInt828;
                                            }
                                            if (class45.aBoolean863
                                                    && (class45.anInt798
                                                    ^ 0xffffffff) != 0) {
                                                ItemDef class19
                                                        = (Applet_Sub1.method18
                                                        (-25672,
                                                                class45.anInt798));
                                                class100
                                                        = class19.aRSString_362;
                                                if (class100 == null)
                                                    class100
                                                            = (Class68_Sub13_Sub32
                                                            .aRSString_3982);
                                                if ((class19.anInt381 == 1
                                                        || class45.anInt915 != 1)
                                                        && (class45.anInt915
                                                        ^ 0xffffffff) != 0)
                                                    class100
                                                            = (Class68_Sub20_Sub13_Sub2
                                                            .method1166
                                                                    (2,
                                                                            (new RSString[]
                                                                                    {(Class68_Sub13_Sub10
                                                                                            .aRSString_3588),
                                                                                            class100,
                                                                                            (Class68_Sub13_Sub10
                                                                                                    .aRSString_3593),
                                                                                            (Class68_Sub13_Sub37
                                                                                                    .method889
                                                                                                            ((class45
                                                                                                                    .anInt915),
                                                                                                                    (i_4_
                                                                                                                            ^ 0x4054)))})));
                                            }
                                            if (class45
                                                    == Class29.aClass45_539) {
                                                i_44_ = class45.anInt832;
                                                class100
                                                        = Class124.aRSString_2136;
                                            }
                                            if (!class45.aBoolean863)
                                                class100 = (Class68_Sub20_Sub3
                                                        .method1055
                                                                (class100, 27757,
                                                                        class45));
                                            class68_sub20_sub1.method1019
                                                    (class100, i_14_, i_16_,
                                                            class45.anInt892,
                                                            class45.anInt873, i_44_,
                                                            class45.aBoolean761 ? 0 : -1,
                                                            class45.anInt777,
                                                            class45.anInt830,
                                                            class45.anInt789);
                                        }
                                    } else if ((class45.anInt896 ^ 0xffffffff)
                                            == -6) {
                                        if (class45.aBoolean863) {
                                            Class68_Sub20_Sub10 class68_sub20_sub10;
                                            if (class45.anInt798 != -1)
                                                class68_sub20_sub10
                                                        = (Class44.method491
                                                        (class45.anInt859,
                                                                class45.anInt915,
                                                                false,
                                                                class45.anInt798,
                                                                class45.anInt906,
                                                                class45.aBoolean785));
                                            else
                                                class68_sub20_sub10
                                                        = class45.method507(false,
                                                        20503);
                                            if (class68_sub20_sub10 == null) {
                                                if (Class93.aBoolean1669)
                                                    Class113.method1682
                                                            (class45, -127);
                                            } else {
                                                int i_45_
                                                        = (class68_sub20_sub10
                                                        .anInt4305);
                                                int i_46_
                                                        = (class68_sub20_sub10
                                                        .anInt4313);
                                                if (class45.aBoolean827) {
                                                    int i_47_
                                                            = ((class45.anInt892
                                                            + -1 + i_45_)
                                                            / i_45_);
                                                    int i_48_
                                                            = ((class45.anInt873
                                                            + (i_46_ + -1))
                                                            / i_46_);
                                                    Class79.method1426
                                                            (i_14_, i_16_,
                                                                    (i_14_
                                                                            - -class45.anInt892),
                                                                    (i_16_
                                                                            + class45.anInt873));
                                                    for (int i_49_ = 0;
                                                         ((i_47_ ^ 0xffffffff)
                                                                 < (i_49_
                                                                 ^ 0xffffffff));
                                                         i_49_++) {
                                                        for (int i_50_ = 0;
                                                             ((i_48_
                                                                     ^ 0xffffffff)
                                                                     < (i_50_
                                                                     ^ 0xffffffff));
                                                             i_50_++) {
                                                            if (((class45
                                                                    .anInt845)
                                                                    ^ 0xffffffff)
                                                                    != -1)
                                                                class68_sub20_sub10
                                                                        .method1104
                                                                                ((class45
                                                                                        .anInt845),
                                                                                        ((i_50_
                                                                                                * i_46_)
                                                                                                + i_16_
                                                                                                - -(i_46_
                                                                                                / 2)),
                                                                                        ((i_49_
                                                                                                * i_45_)
                                                                                                + i_14_
                                                                                                + (i_45_
                                                                                                / 2)),
                                                                                        4096,
                                                                                        (byte) 106);
                                                            else if (i_15_
                                                                    != 0)
                                                                class68_sub20_sub10
                                                                        .method1110
                                                                                (((i_49_
                                                                                        * i_45_)
                                                                                        + i_14_),
                                                                                        ((i_46_
                                                                                                * i_50_)
                                                                                                + i_16_),
                                                                                        (256
                                                                                                + -(0xff
                                                                                                & i_15_)));
                                                            else
                                                                class68_sub20_sub10
                                                                        .method1103
                                                                                (((i_49_
                                                                                        * i_45_)
                                                                                        + i_14_),
                                                                                        (i_16_
                                                                                                + (i_46_
                                                                                                * i_50_)));
                                                        }
                                                    }
                                                    Class79.method1427(i_8_,
                                                            i_5_,
                                                            i_6_,
                                                            i);
                                                } else {
                                                    int i_51_
                                                            = (4096
                                                            * class45.anInt892
                                                            / i_45_);
                                                    if (class45.anInt845
                                                            == 0) {
                                                        if ((i_15_
                                                                ^ 0xffffffff)
                                                                != -1)
                                                            class68_sub20_sub10
                                                                    .method1105
                                                                            (i_14_, i_16_,
                                                                                    (class45
                                                                                            .anInt892),
                                                                                    (class45
                                                                                            .anInt873),
                                                                                    (256
                                                                                            + -(i_15_
                                                                                            & 0xff)));
                                                        else if (((i_45_
                                                                ^ 0xffffffff)
                                                                != ((class45
                                                                .anInt892)
                                                                ^ 0xffffffff))
                                                                || (((class45
                                                                .anInt873)
                                                                ^ 0xffffffff)
                                                                != (i_46_
                                                                ^ 0xffffffff)))
                                                            class68_sub20_sub10
                                                                    .method1113
                                                                            (i_14_, i_16_,
                                                                                    (class45
                                                                                            .anInt892),
                                                                                    (class45
                                                                                            .anInt873));
                                                        else
                                                            class68_sub20_sub10
                                                                    .method1103
                                                                            (i_14_, i_16_);
                                                    } else
                                                        class68_sub20_sub10
                                                                .method1104
                                                                        (class45.anInt845,
                                                                                (class45.anInt873
                                                                                        / 2) + i_16_,
                                                                                (class45.anInt892
                                                                                        / 2) + i_14_,
                                                                                i_51_,
                                                                                (byte) 118);
                                                }
                                            }
                                        } else {
                                            Class68_Sub20_Sub10 class68_sub20_sub10
                                                    = (class45.method507
                                                    (method1000(0, class45),
                                                            i_4_ + 42147));
                                            if (class68_sub20_sub10 == null) {
                                                if (Class93.aBoolean1669)
                                                    Class113.method1682
                                                            (class45, -121);
                                            } else
                                                class68_sub20_sub10
                                                        .method1103(i_14_, i_16_);
                                        }
                                    } else if (class45.anInt896 == 6) {
                                        boolean bool = method1000(i_4_ + 21644,
                                                class45);
                                        Class1_Sub3 class1_sub3 = null;
                                        int i_52_;
                                        if (bool)
                                            i_52_ = class45.anInt869;
                                        else
                                            i_52_ = class45.anInt831;
                                        int i_53_ = 0;
                                        if ((class45.anInt798 ^ 0xffffffff)
                                                == 0) {
                                            if ((class45.anInt865 ^ 0xffffffff)
                                                    == -6) {
                                                if ((class45.anInt803
                                                        ^ 0xffffffff)
                                                        != 0) {
                                                    int i_54_
                                                            = (0x7ff
                                                            & class45.anInt803);
                                                    if ((i_54_ ^ 0xffffffff)
                                                            == ((Class68_Sub10
                                                            .anInt2911)
                                                            ^ 0xffffffff))
                                                        i_54_ = 2047;
                                                    Class1_Sub6_Sub2 class1_sub6_sub2
                                                            = (Class68_Sub13_Sub4
                                                            .aClass1_Sub6_Sub2Array3483
                                                            [i_54_]);
                                                    Class55 class117
                                                            = ((i_52_
                                                            ^ 0xffffffff) == 0
                                                            ? null
                                                            : (Class64.method624
                                                            ((byte) -36,
                                                                    i_52_)));
                                                    if ((class1_sub6_sub2
                                                            != null)
                                                            && ((((int) (class1_sub6_sub2
                                                            .aRSString_3414
                                                            .toLong
                                                                    (10908))
                                                            << -2035566133)
                                                            ^ 0xffffffff)
                                                            == ((~0x7ff
                                                            & (class45
                                                            .anInt803))
                                                            ^ 0xffffffff)))
                                                        class1_sub3
                                                                = (class1_sub6_sub2
                                                                .aClass126_3410
                                                                .method1768
                                                                        ((class45
                                                                                .anInt756),
                                                                                class117, 0,
                                                                                null,
                                                                                (byte) 46));
                                                } else
                                                    class1_sub3
                                                            = (Class68_Sub13_Sub33
                                                            .aClass126_3991
                                                            .method1768
                                                                    (-1, null, -1, null,
                                                                            (byte) 99));
                                            } else if ((i_52_ ^ 0xffffffff)
                                                    == 0) {
                                                class1_sub3
                                                        = (class45.method506
                                                        (-1, bool, (byte) -27,
                                                                (Class68_Sub7
                                                                        .aClass1_Sub6_Sub2_2860
                                                                        .aClass126_3410),
                                                                null));
                                                if (class1_sub3 == null
                                                        && Class93.aBoolean1669)
                                                    Class113.method1682
                                                            (class45, -128);
                                            } else {
                                                Class55 class117
                                                        = (Class64.method624
                                                        ((byte) -36, i_52_));
                                                class1_sub3
                                                        = (class45.method506
                                                        (class45.anInt756, bool,
                                                                (byte) -27,
                                                                (Class68_Sub7
                                                                        .aClass1_Sub6_Sub2_2860
                                                                        .aClass126_3410),
                                                                class117));
                                                if (class1_sub3 == null
                                                        && Class93.aBoolean1669)
                                                    Class113.method1682
                                                            (class45, -115);
                                            }
                                        } else {
                                            ItemDef class19
                                                    = (Applet_Sub1.method18
                                                    (-25672, class45.anInt798));
                                            if (class19 != null) {
                                                class19 = (class19.method317
                                                        (class45.anInt915,
                                                                -126));
                                                Class55 class117
                                                        = (i_52_ != -1
                                                        ? (Class64.method624
                                                        ((byte) -36, i_52_))
                                                        : null);
                                                class1_sub3
                                                        = (class19.method318
                                                        (1, class117,
                                                                class45.anInt756,
                                                                13895));
                                                if (class1_sub3 == null)
                                                    Class113.method1682
                                                            (class45, -128);
                                                else
                                                    i_53_
                                                            = -class1_sub3
                                                            .method56() / 2;
                                            }
                                        }
                                        if (class1_sub3 != null) {
                                            int i_55_;
                                            if (class45.anInt793 <= 0)
                                                i_55_ = 256;
                                            else
                                                i_55_ = ((class45.anInt892
                                                        << -2121766488)
                                                        / class45.anInt793);
                                            int i_56_;
                                            if ((class45.anInt883 ^ 0xffffffff)
                                                    < -1)
                                                i_56_ = ((class45.anInt873
                                                        << -830447320)
                                                        / class45.anInt883);
                                            else
                                                i_56_ = 256;
                                            int i_57_
                                                    = (class45.anInt873 / 2 + i_16_
                                                    + (i_56_ * class45.anInt816
                                                    >> 1319467880));
                                            int i_58_
                                                    = (class45.anInt892 / 2 + i_14_
                                                    + (class45.anInt857 * i_55_
                                                    >> 860822824));
                                            Class62.method603(i_58_, i_57_);
                                            int i_59_
                                                    = (((Class62.anIntArray1155
                                                    [class45.anInt864])
                                                    * class45.anInt762)
                                                    >> -11452624);
                                            int i_60_
                                                    = ((class45.anInt762
                                                    * (Class62.anIntArray1167
                                                    [class45.anInt864]))
                                                    >> 1627033072);
                                            if (!class45.aBoolean863)
                                                class1_sub3.method77
                                                        (0, class45.anInt814, 0,
                                                                class45.anInt864, 0,
                                                                i_59_, i_60_);
                                            else if (!class45.aBoolean813)
                                                class1_sub3.method77
                                                        (0, class45.anInt814,
                                                                class45.anInt853,
                                                                class45.anInt864,
                                                                class45.anInt781,
                                                                (class45.anInt842 + i_59_
                                                                        - -i_53_),
                                                                (i_60_
                                                                        - -class45.anInt842));
                                            else
                                                ((Class1_Sub3_Sub1)
                                                        class1_sub3)
                                                        .method94
                                                                (0, class45.anInt814,
                                                                        class45.anInt853,
                                                                        class45.anInt864,
                                                                        class45.anInt781,
                                                                        (i_59_
                                                                                + (i_53_
                                                                                - -class45.anInt842)),
                                                                        i_60_ + class45.anInt842,
                                                                        class45.anInt762);
                                            Class62.method620();
                                        }
                                    } else {
                                        if ((class45.anInt896 ^ 0xffffffff)
                                                == -8) {
                                            Class68_Sub20_Sub1 class68_sub20_sub1
                                                    = (class45.method505
                                                    (-92,
                                                            (Stream
                                                                    .aClass92Array3010)));
                                            if (class68_sub20_sub1 == null) {
                                                if (Class93.aBoolean1669)
                                                    Class113.method1682
                                                            (class45, -116);
                                                continue;
                                            }
                                            int i_61_ = 0;
                                            for (int i_62_ = 0;
                                                 class45.anInt899 > i_62_;
                                                 i_62_++) {
                                                for (int i_63_ = 0;
                                                     ((class45.anInt773
                                                             ^ 0xffffffff)
                                                             < (i_63_ ^ 0xffffffff));
                                                     i_63_++) {
                                                    if ((class45.anIntArray795
                                                            [i_61_])
                                                            > 0) {
                                                        ItemDef class19
                                                                = (Applet_Sub1
                                                                .method18
                                                                        (i_4_ + -4028,
                                                                                (class45
                                                                                        .anIntArray795
                                                                                        [i_61_]) - 1));
                                                        RSString class100;
                                                        if (((class19.anInt381
                                                                ^ 0xffffffff)
                                                                == -2)
                                                                || (class45
                                                                .anIntArray774
                                                                [i_61_]) != 1)
                                                            class100
                                                                    = (Class68_Sub20_Sub13_Sub2
                                                                    .method1166
                                                                            (2,
                                                                                    (new RSString[]
                                                                                            {(Class68_Sub13_Sub10
                                                                                                    .aRSString_3588),
                                                                                                    (class19
                                                                                                            .aRSString_362),
                                                                                                    (Class68_Sub13_Sub10
                                                                                                            .aRSString_3593),
                                                                                                    (Class68_Sub13_Sub37
                                                                                                            .method889
                                                                                                                    ((class45
                                                                                                                            .anIntArray774
                                                                                                                            [i_61_]),
                                                                                                                            -5344))})));
                                                        else
                                                            class100
                                                                    = (Class68_Sub20_Sub13_Sub2
                                                                    .method1166
                                                                            (2,
                                                                                    (new RSString[]
                                                                                            {(Class68_Sub13_Sub10
                                                                                                    .aRSString_3588),
                                                                                                    (class19
                                                                                                            .aRSString_362),
                                                                                                    (RSString
                                                                                                            .aRSString_2305)})));
                                                        int i_64_
                                                                = (((115
                                                                - -(class45
                                                                .anInt885))
                                                                * i_63_)
                                                                + i_14_);
                                                        int i_65_
                                                                = (i_16_
                                                                - -(((class45
                                                                .anInt846)
                                                                + 12)
                                                                * i_62_));
                                                        if (class45.anInt777
                                                                != 0) {
                                                            if ((class45
                                                                    .anInt777)
                                                                    == 1)
                                                                class68_sub20_sub1
                                                                        .method1032
                                                                                (class100,
                                                                                        (57
                                                                                                + i_64_),
                                                                                        i_65_,
                                                                                        (class45
                                                                                                .anInt832),
                                                                                        (!(class45
                                                                                                .aBoolean761)
                                                                                                ? -1
                                                                                                : 0));
                                                            else
                                                                class68_sub20_sub1
                                                                        .method1022
                                                                                (class100,
                                                                                        (-1
                                                                                                + (i_64_
                                                                                                + 115)),
                                                                                        i_65_,
                                                                                        (class45
                                                                                                .anInt832),
                                                                                        ((class45
                                                                                                .aBoolean761)
                                                                                                ? 0
                                                                                                : -1));
                                                        } else
                                                            class68_sub20_sub1
                                                                    .method1030
                                                                            (class100,
                                                                                    i_64_, i_65_,
                                                                                    (class45
                                                                                            .anInt832),
                                                                                    ((class45
                                                                                            .aBoolean761)
                                                                                            ? 0 : -1));
                                                    }
                                                    i_61_++;
                                                }
                                            }
                                        }
                                        if (((class45.anInt896 ^ 0xffffffff)
                                                == -9)
                                                && (Class121.aClass45_2108
                                                == class45)
                                                && (Class59.anInt1109
                                                == Class94.anInt1676)) {
                                            int i_66_ = 0;
                                            int i_67_ = 0;
                                            Class68_Sub20_Sub1 class68_sub20_sub1
                                                    = (Class68_Sub6
                                                    .aClass68_Sub20_Sub1_2847);
                                            RSString class100
                                                    = class45.aRSString_881;
                                            class100
                                                    = (Class68_Sub20_Sub3
                                                    .method1055
                                                            (class100, i_4_ + 49401,
                                                                    class45));
                                            while (class100
                                                    .method1590((byte) -117)
                                                    > 0) {
                                                int i_68_
                                                        = (class100.method1595
                                                        (61,
                                                                (Class118
                                                                        .aRSString_2081)));
                                                RSString class100_69_;
                                                if ((i_68_ ^ 0xffffffff)
                                                        == 0) {
                                                    class100_69_ = class100;
                                                    class100
                                                            = (Class68_Sub28_Sub2
                                                            .aRSString_4556);
                                                } else {
                                                    class100_69_
                                                            = (class100.method1607
                                                            (0, (byte) -74,
                                                                    i_68_));
                                                    class100
                                                            = (class100.method1615
                                                            (4 + i_68_, true));
                                                }
                                                int i_70_ = (class68_sub20_sub1
                                                        .method1029
                                                                (class100_69_));
                                                if (i_70_ > i_66_)
                                                    i_66_ = i_70_;
                                                i_67_ += (class68_sub20_sub1
                                                        .anInt4137) + 1;
                                            }
                                            i_66_ += 6;
                                            i_67_ += 7;
                                            int i_71_
                                                    = (-i_66_
                                                    + (-5 + (i_14_
                                                    - -(class45
                                                    .anInt892))));
                                            int i_72_
                                                    = (i_16_
                                                    - (-class45.anInt873 + -5));
                                            if ((i ^ 0xffffffff)
                                                    > (i_72_ + i_67_ ^ 0xffffffff))
                                                i_72_ = -i_67_ + i;
                                            if (i_71_ < i_14_ + 5)
                                                i_71_ = 5 + i_14_;
                                            if ((i_71_ + i_66_ ^ 0xffffffff)
                                                    < (i_6_ ^ 0xffffffff))
                                                i_71_ = -i_66_ + i_6_;
                                            Class79.method1439(i_71_, i_72_,
                                                    i_66_, i_67_,
                                                    16777120);
                                            Class79.method1415(i_71_, i_72_,
                                                    i_66_, i_67_,
                                                    0);
                                            class100 = class45.aRSString_881;
                                            int i_73_
                                                    = (class68_sub20_sub1.anInt4137
                                                    + (i_72_ + 2));
                                            class100
                                                    = (Class68_Sub20_Sub3
                                                    .method1055
                                                            (class100, 27757, class45));
                                            while (class100
                                                    .method1590((byte) -102)
                                                    > 0) {
                                                int i_74_
                                                        = (class100.method1595
                                                        (92,
                                                                (Class118
                                                                        .aRSString_2081)));
                                                RSString class100_75_;
                                                if ((i_74_ ^ 0xffffffff)
                                                        == 0) {
                                                    class100_75_ = class100;
                                                    class100
                                                            = (Class68_Sub28_Sub2
                                                            .aRSString_4556);
                                                } else {
                                                    class100_75_
                                                            = (class100.method1607
                                                            (0, (byte) -74,
                                                                    i_74_));
                                                    class100
                                                            = (class100.method1615
                                                            (i_74_ - -4, true));
                                                }
                                                class68_sub20_sub1.method1030
                                                        (class100_75_, i_71_ - -3,
                                                                i_73_, 0, -1);
                                                i_73_ += (class68_sub20_sub1
                                                        .anInt4137) - -1;
                                            }
                                        }
                                        if ((class45.anInt896 ^ 0xffffffff)
                                                == -10) {
                                            int i_76_;
                                            int i_77_;
                                            int i_78_;
                                            int i_79_;
                                            if (class45.aBoolean894) {
                                                i_77_ = i_16_;
                                                i_76_ = i_14_;
                                                i_79_ = (i_14_
                                                        - -class45.anInt892);
                                                i_78_
                                                        = i_16_ + class45.anInt873;
                                            } else {
                                                i_76_ = i_14_;
                                                i_77_
                                                        = class45.anInt873 + i_16_;
                                                i_78_ = i_16_;
                                                i_79_
                                                        = class45.anInt892 + i_14_;
                                            }
                                            if ((class45.anInt822 ^ 0xffffffff)
                                                    != -2)
                                                Class79.method1429
                                                        (i_76_, i_78_, i_79_,
                                                                i_77_, class45.anInt832,
                                                                class45.anInt822);
                                            else
                                                Class79.method1417
                                                        (i_76_, i_78_, i_79_,
                                                                i_77_, class45.anInt832);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean method1000(int i, Class45 class45) {
        anInt3068++;
        if (class45.anIntArray796 == null)
            return false;
        for (int i_80_ = i;
             ((i_80_ ^ 0xffffffff)
                     > (class45.anIntArray796.length ^ 0xffffffff));
             i_80_++) {
            int i_81_ = Class68_Sub24.method1205(i_80_, i + 20, class45);
            int i_82_ = class45.anIntArray791[i_80_];
            if (class45.anIntArray796[i_80_] == 2) {
                if ((i_82_ ^ 0xffffffff) >= (i_81_ ^ 0xffffffff))
                    return false;
            } else if ((class45.anIntArray796[i_80_] ^ 0xffffffff) != -4) {
                if ((class45.anIntArray796[i_80_] ^ 0xffffffff) != -5) {
                    if (i_81_ != i_82_)
                        return false;
                } else if (i_82_ == i_81_)
                    return false;
            } else if ((i_82_ ^ 0xffffffff) <= (i_81_ ^ 0xffffffff))
                return false;
        }
        return true;
    }

    public static void method1001(byte i) {
        anInt3071++;
        Class45.aClass98_918.method1566((byte) 94);
        if (i >= -45)
            method997(7, 117, -119);
    }

    public static int method1002(int i, int i_83_, int i_84_) {
        if (i_84_ != 16)
            method997(124, 106, 95);
        anInt3072++;
        int i_85_ = (Class112.method1671(133988164, i_83_ - 1, -1 + i)
                - -Class112.method1671(133988164, -1 + i_83_, 1 + i)
                - (-Class112.method1671(133988164, i_83_ - -1, -1 + i)
                - Class112.method1671(133988164, 1 + i_83_, i - -1)));
        int i_86_ = (Class112.method1671(133988164, i_83_, -1 + i)
                + (Class112.method1671(133988164, i_83_, 1 + i)
                + (Class112.method1671(133988164, -1 + i_83_, i)
                - -Class112.method1671(i_84_ ^ 0x7fc7f54, 1 + i_83_,
                i))));
        int i_87_ = Class112.method1671(133988164, i_83_, i);
        return i_86_ / 8 + (i_85_ / 16 - -(i_87_ / 4));
    }
}
