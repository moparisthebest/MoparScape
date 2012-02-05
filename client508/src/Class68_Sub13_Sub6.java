/* Class68_Sub13_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub6 extends Class68_Sub13 {
    public static int anInt3523;
    public static RSString[] aRSStringArray3524;
    public static int anInt3525;
    public static RSString aRSString_3526;
    public static int anInt3527;
    public static RSString aRSString_3528;
    public static RSString aRSString_3529 = RSString.newRsString("Feb");
    public static RSString aRSString_3530;
    public static int anInt3531;
    public static int anInt3532;
    public static RSString aRSString_3533;
    public static RSString aRSString_3534;
    public static int anInt3535;
    public static RSString aRSString_3536;
    public static RSString aRSString_3537;
    public static RSString aRSString_3538;
    public static RSString aRSString_3539;
    public static int anInt3540;
    public static RSString aRSString_3541;
    public boolean aBoolean3542;
    public static RSString aRSString_3543;
    public int anInt3544 = 4096;

    public static RSString method720(int i, int i_0_) {
        anInt3535++;
        if (i_0_ != -1)
            method724(43, -92, 110);
        if (i < 999999999)
            return Class68_Sub13_Sub24.method816(i, 0);
        return Class13_Sub1.aRSString_2635;
    }

    public static Class68_Sub20_Sub10[] method721(int i) {
        anInt3531++;
        Class68_Sub20_Sub10[] class68_sub20_sub10s
                = new Class68_Sub20_Sub10[Stream.anInt3007];
        int i_1_ = 0;
        if (i != -21477)
            aRSString_3541 = null;
        for (/**/; Stream.anInt3007 > i_1_; i_1_++) {
            int i_2_ = (Class68_Sub13_Sub19.anIntArray3757[i_1_]
                    * Class68_Sub13_Sub12.anIntArray3639[i_1_]);
            byte[] is = Class69.aByteArrayArray1240[i_1_];
            int[] is_3_ = new int[i_2_];
            for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
                 i_4_++)
                is_3_[i_4_] = (Class68_Sub13_Sub17.anIntArray3719
                        [Class120.method1740(is[i_4_], 255)]);
            class68_sub20_sub10s[i_1_]
                    = (new Sprite
                    (Class97.anInt1703, Class68_Sub20_Sub15.anInt4405,
                            Class4.anIntArray96[i_1_], Class116.anIntArray1996[i_1_],
                            Class68_Sub13_Sub12.anIntArray3639[i_1_],
                            Class68_Sub13_Sub19.anIntArray3757[i_1_], is_3_));
        }
        Class87.method1487((byte) -93);
        return class68_sub20_sub10s;
    }

    public void method700(Stream class68_sub14, int i, int i_5_) {
        if (i_5_ != -1)
            aRSString_3526 = null;
        int i_6_ = i;
        do {
            if (i_6_ != 0) {
                if ((i_6_ ^ 0xffffffff) != -2)
                    break;
            } else {
                anInt3544 = class68_sub14.readUnsignedWord(1355769544);
                break;
            }
            aBoolean3542 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
        } while (false);
        anInt3523++;
    }

    public static void method722(byte i) {
        aRSString_3533 = null;
        aRSString_3543 = null;
        aRSString_3539 = null;
        aRSString_3534 = null;
        aRSStringArray3524 = null;
        aRSString_3537 = null;
        aRSString_3541 = null;
        aRSString_3530 = null;
        aRSString_3529 = null;
        aRSString_3526 = null;
        aRSString_3538 = null;
        aRSString_3528 = null;
        aRSString_3536 = null;
        if (i != 126)
            method724(69, 68, 57);
    }

    public static void method723
            (byte i, int i_7_, Class68_Sub20_Sub1 class68_sub20_sub1,
             Class68_Sub20_Sub1 class68_sub20_sub1_8_, int i_9_, int i_10_,
             int i_11_, Class45 class45) {
        do {
            try {
                anInt3540++;
                Class50.anInt990 = i_9_;
                Class68_Sub24.anInt3158 = i_7_;
                Class68_Sub13_Sub18.anInt3734 = i_11_;
                Class68_Sub8.anInt2867 = i_10_;
                Class59.aClass45_1101 = class45;
                if (Class76.aClass52_1354 == null) {
                    Class1_Sub1.aBoolean2414 = true;
                    if (Class109.aClass68_Sub20_Sub10Array1840 == null)
                        Class109.aClass68_Sub20_Sub10Array1840
                                = (Class68_Sub13_Sub16.method775
                                (Class52.aClass21_Sub1_1011, 0,
                                        Class69.anInt1248, (byte) 13));
                    if (Class52.aClass92Array1004 == null)
                        Class52.aClass92Array1004
                                = Class13_Sub1.method248((Class52
                                .aClass21_Sub1_1011),
                                0, false,
                                Class1_Sub5.anInt2514);
                    if (Class1_Sub2.aClass92Array2442 == null)
                        Class1_Sub2.aClass92Array2442
                                = Class13_Sub1.method248((Class52
                                .aClass21_Sub1_1011),
                                0, false,
                                (Class68_Sub20_Sub3
                                        .anInt4210));
                    if (Class34.aClass92Array593 == null)
                        Class34.aClass92Array593
                                = Class13_Sub1.method248((Class52
                                .aClass21_Sub1_1011),
                                0, false,
                                (Class68_Sub13_Sub27
                                        .anInt3911));
                    int i_12_ = 4 * (Class50.anInt990 / 5);
                    int i_13_ = Class50.anInt990 / 5;
                    if (i != -38)
                        aRSString_3528 = null;
                    Class79.method1435(Class68_Sub13_Sub18.anInt3734,
                            Class68_Sub24.anInt3158,
                            Class50.anInt990,
                            Class68_Sub8.anInt2867, 0, 168);
                    Class79.method1437(Class68_Sub13_Sub18.anInt3734,
                            Class68_Sub24.anInt3158, i_13_, 23,
                            12425273, 9135624);
                    Class79.method1437(Class68_Sub13_Sub18.anInt3734 + i_13_,
                            Class68_Sub24.anInt3158, i_12_, 23,
                            5197647, 2697513);
                    class68_sub20_sub1.method1032(Class1_Sub6.aRSString_2573,
                            (i_13_ / 2
                                    + (Class68_Sub13_Sub18
                                    .anInt3734)),
                            Class68_Sub24.anInt3158 + 15,
                            0, -1);
                    if (Class34.aClass92Array593 != null) {
                        Class34.aClass92Array593[1].method1527
                                (2 + Class68_Sub13_Sub18.anInt3734 - -i_13_,
                                        Class68_Sub24.anInt3158 - -1);
                        class68_sub20_sub1_8_.method1030
                                (Class118.aRSString_2083,
                                        i_13_ + (Class68_Sub13_Sub18.anInt3734 + 12),
                                        10 + Class68_Sub24.anInt3158, 16777215, -1);
                        Class34.aClass92Array593[0].method1527
                                (2 + (Class68_Sub13_Sub18.anInt3734 - -i_13_),
                                        Class68_Sub24.anInt3158 - -12);
                        class68_sub20_sub1_8_.method1030
                                (Class71.aRSString_1289,
                                        12 + i_13_ + Class68_Sub13_Sub18.anInt3734,
                                        Class68_Sub24.anInt3158 - -21, 16777215, -1);
                    }
                    if (Class1_Sub2.aClass92Array2442 != null) {
                        int i_14_
                                = Class68_Sub13_Sub18.anInt3734 - -i_13_ - -140;
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4609[0] == 0
                                && (Class51.anIntArray2257[0] ^ 0xffffffff) == -1)
                            Class1_Sub2.aClass92Array2442[2].method1527
                                    (i_14_, 4 + Class68_Sub24.anInt3158);
                        else
                            Class1_Sub2.aClass92Array2442[0].method1527
                                    (i_14_, Class68_Sub24.anInt3158 + 4);
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4609[0] == 0
                                && (Class51.anIntArray2257[0] ^ 0xffffffff) == -2)
                            Class1_Sub2.aClass92Array2442[3].method1527
                                    (i_14_ + 15, 4 + Class68_Sub24.anInt3158);
                        else
                            Class1_Sub2.aClass92Array2442[1].method1527
                                    (i_14_ + 15, Class68_Sub24.anInt3158 + 4);
                        class68_sub20_sub1.method1030(Login.aRSString_1507,
                                32 + i_14_,
                                (Class68_Sub24.anInt3158
                                        + 17),
                                16777215, -1);
                        int i_15_
                                = Class68_Sub13_Sub18.anInt3734 - (-i_13_ + -250);
                        if ((Class68_Sub13_Sub26_Sub1.anIntArray4609[0]
                                ^ 0xffffffff) != -2
                                || Class51.anIntArray2257[0] != 0)
                            Class1_Sub2.aClass92Array2442[0].method1527
                                    (i_15_, Class68_Sub24.anInt3158 - -4);
                        else
                            Class1_Sub2.aClass92Array2442[2].method1527
                                    (i_15_, 4 + Class68_Sub24.anInt3158);
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4609[0] != 1
                                || Class51.anIntArray2257[0] != 1)
                            Class1_Sub2.aClass92Array2442[1].method1527
                                    (15 + i_15_, Class68_Sub24.anInt3158 + 4);
                        else
                            Class1_Sub2.aClass92Array2442[3].method1527
                                    (15 + i_15_, Class68_Sub24.anInt3158 + 4);
                        class68_sub20_sub1.method1030(Class85.aRSString_1559,
                                32 + i_15_,
                                17 + (Class68_Sub24
                                        .anInt3158),
                                16777215, -1);
                        int i_16_
                                = Class68_Sub13_Sub18.anInt3734 - -i_13_ + 360;
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4609[0] == 2
                                && Class51.anIntArray2257[0] == 0)
                            Class1_Sub2.aClass92Array2442[2].method1527
                                    (i_16_, Class68_Sub24.anInt3158 + 4);
                        else
                            Class1_Sub2.aClass92Array2442[0].method1527
                                    (i_16_, Class68_Sub24.anInt3158 + 4);
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4609[0] == 2
                                && Class51.anIntArray2257[0] == 1)
                            Class1_Sub2.aClass92Array2442[3].method1527
                                    (i_16_ + 15, Class68_Sub24.anInt3158 - -4);
                        else
                            Class1_Sub2.aClass92Array2442[1].method1527
                                    (i_16_ - -15, 4 + Class68_Sub24.anInt3158);
                        class68_sub20_sub1.method1030
                                (Class1_Sub1.aRSString_2405, 32 + i_16_,
                                        17 + Class68_Sub24.anInt3158, 16777215, -1);
                        int i_17_
                                = 470 + Class68_Sub13_Sub18.anInt3734 - -i_13_;
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4609[0] == 3
                                && (Class51.anIntArray2257[0] ^ 0xffffffff) == -1)
                            Class1_Sub2.aClass92Array2442[2].method1527
                                    (i_17_, 4 + Class68_Sub24.anInt3158);
                        else
                            Class1_Sub2.aClass92Array2442[0].method1527
                                    (i_17_, 4 + Class68_Sub24.anInt3158);
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4609[0] != 3
                                || (Class51.anIntArray2257[0] ^ 0xffffffff) != -2)
                            Class1_Sub2.aClass92Array2442[1].method1527
                                    (15 + i_17_, Class68_Sub24.anInt3158 + 4);
                        else
                            Class1_Sub2.aClass92Array2442[3].method1527
                                    (15 + i_17_, 4 + Class68_Sub24.anInt3158);
                        class68_sub20_sub1.method1030
                                (Class68_Sub20_Sub14.aRSString_4376, 32 + i_17_,
                                        17 + Class68_Sub24.anInt3158, 16777215, -1);
                    }
                    Class79.method1439(Class50.anInt990 + -58 - 10,
                            4 + Class68_Sub24.anInt3158, 58, 16, 0);
                    Class68_Sub13_Sub36.anInt4037 = -1;
                    if (Class109.aClass68_Sub20_Sub10Array1840 == null)
                        break;
                    int i_18_ = 88;
                    int i_19_ = 19;
                    int i_20_ = (Class68_Sub8.anInt2867 + -23) / (1 + i_19_);
                    int i_21_ = Class50.anInt990 / (i_18_ + 1);
                    int i_22_;
                    int i_23_;
                    do {
                        i_22_ = i_20_;
                        i_23_ = i_21_;
                        if ((i_20_ * (-1 + i_21_) ^ 0xffffffff)
                                <= (Class68_Sub13_Sub19.anInt3759 ^ 0xffffffff))
                            i_21_--;
                        if (Class68_Sub13_Sub19.anInt3759
                                <= (-1 + i_20_) * i_21_)
                            i_20_--;
                        if (Class68_Sub13_Sub19.anInt3759
                                <= (-1 + i_20_) * i_21_)
                            i_20_--;
                    } while (i_20_ != i_22_ || i_23_ != i_21_);
                    i_22_
                            = (Class50.anInt990 + -(i_18_ * i_21_)) / (i_21_ + 1);
                    if ((i_22_ ^ 0xffffffff) < -6)
                        i_22_ = 5;
                    i_23_ = ((Class68_Sub8.anInt2867 + (-23 - i_19_ * i_20_))
                            / (1 + i_20_));
                    if ((i_23_ ^ 0xffffffff) < -6)
                        i_23_ = 5;
                    int i_24_ = ((Class50.anInt990 - i_18_ * i_21_
                            - (-1 + i_21_) * i_22_)
                            / 2);
                    int i_25_ = ((-((i_20_ + -1) * i_23_)
                            + (-(i_19_ * i_20_)
                            + (Class68_Sub8.anInt2867 + -23)))
                            / 2);
                    int i_26_ = 23 + i_25_;
                    int i_27_ = 0;
                    int i_28_ = i_24_;
                    for (int i_29_ = 0;
                         ((i_29_ ^ 0xffffffff)
                                 > (Class68_Sub13_Sub19.anInt3759 ^ 0xffffffff));
                         i_29_++) {
                        Class93 class93 = Class1_Sub6.aClass93Array2529[i_29_];
                        boolean bool = true;
                        RSString class100
                                = Class68_Sub13_Sub24.method816(class93.anInt1665,
                                0);
                        if ((class93.anInt1665 ^ 0xffffffff) != 0) {
                            if (class93.anInt1665 > 1980) {
                                bool = false;
                                class100 = Class75_Sub2.aRSString_3317;
                            }
                        } else {
                            bool = false;
                            class100 = Class102.aRSString_1751;
                        }
                        if ((i_28_ ^ 0xffffffff) < (Class96.anInt1695
                                ^ 0xffffffff)
                                || i_26_ > Class13.anInt223
                                || Class96.anInt1695 >= i_18_ + i_28_
                                || ((Class13.anInt223 ^ 0xffffffff)
                                <= (i_19_ + i_26_ ^ 0xffffffff))
                                || !bool)
                            Class109.aClass68_Sub20_Sub10Array1840
                                    [class93.aBoolean1661 ? 1 : 0].method1103
                                    (Class68_Sub13_Sub18.anInt3734 + i_28_,
                                            Class68_Sub24.anInt3158 - -i_26_);
                        else {
                            Class68_Sub13_Sub36.anInt4037 = i_29_;
                            Class109.aClass68_Sub20_Sub10Array1840
                                    [class93.aBoolean1661 ? 1 : 0].method1112
                                    (Class68_Sub13_Sub18.anInt3734 - -i_28_,
                                            Class68_Sub24.anInt3158 - -i_26_, 128,
                                            16777215);
                        }
                        if (Class52.aClass92Array1004 != null)
                            Class52.aClass92Array1004
                                    [(class93.anInt1666
                                    + (!class93.aBoolean1661 ? 0
                                    : Class52.aClass92Array1004.length / 2))]
                                    .method1527
                                            (i_28_ + Class68_Sub13_Sub18.anInt3734 - -29,
                                                    Class68_Sub24.anInt3158 + i_26_);
                        class68_sub20_sub1.method1032
                                (Class68_Sub13_Sub24.method816(class93.anInt1664,
                                        i + 38),
                                        Class68_Sub13_Sub18.anInt3734 + (i_28_ - -15),
                                        (i_26_ + Class68_Sub24.anInt3158 - -(i_19_ / 2)
                                                + 5),
                                        0, -1);
                        class68_sub20_sub1_8_.method1032
                                (class100,
                                        60 + i_28_ + Class68_Sub13_Sub18.anInt3734,
                                        (Class68_Sub24.anInt3158 + (i_26_ - -(i_19_ / 2))
                                                + 5),
                                        268435455, -1);
                        i_26_ += i_23_ - -i_19_;
                        if (i_20_ <= ++i_27_) {
                            i_26_ = i_25_ + 23;
                            i_27_ = 0;
                            i_28_ += i_22_ + i_18_;
                        }
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("ea.D(" + i + ',' + i_7_ + ','
                                + (class68_sub20_sub1 != null
                                ? "{...}" : "null")
                                + ','
                                + (class68_sub20_sub1_8_ != null
                                ? "{...}" : "null")
                                + ',' + i_9_ + ',' + i_10_ + ','
                                + i_11_ + ','
                                + (class45 != null ? "{...}"
                                : "null")
                                + ')'));
            }
            break;
        } while (false);
    }

    public static Class64 method724(int i, int i_30_, int i_31_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_30_][i_31_];
        if (class68_sub1 == null)
            return null;
        return class68_sub1.aClass64_2757;
    }

    public Class68_Sub13_Sub6() {
        super(1, false);
        aBoolean3542 = true;
    }

    public int[][] method697(int i, boolean bool) {
        anInt3525++;
        if (bool != true)
            anInt3544 = 100;
        int[][] is = aClass88_2939.method1496(i, (byte) -101);
        if (aClass88_2939.aBoolean1610) {
            int[] is_32_
                    = this.method696(0, Class1_Sub6_Sub2.anInt3432 & -1 + i,
                    29149);
            int[] is_33_ = this.method696(0, i, 29149);
            int[] is_34_
                    = this.method696(0, Class1_Sub6_Sub2.anInt3432 & i - -1,
                    29149);
            int[] is_35_ = is[0];
            int[] is_36_ = is[1];
            int[] is_37_ = is[2];
            for (int i_38_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_38_ ^ 0xffffffff)); i_38_++) {
                int i_39_ = ((is_33_[Class30.anInt543 & i_38_ + 1]
                        - is_33_[Class30.anInt543 & i_38_ + -1])
                        * anInt3544);
                int i_40_ = anInt3544 * (-is_32_[i_38_] + is_34_[i_38_]);
                int i_41_ = i_40_ >> 1650796588;
                int i_42_ = i_39_ >> -252799028;
                int i_43_ = i_41_ * i_41_ >> -812361652;
                int i_44_ = i_42_ * i_42_ >> -437259636;
                int i_45_
                        = (int) (Math.sqrt((double) ((float) (4096
                        + (i_43_ + i_44_))
                        / 4096.0F))
                        * 4096.0);
                int i_46_;
                int i_47_;
                int i_48_;
                if ((i_45_ ^ 0xffffffff) == -1) {
                    i_46_ = 0;
                    i_48_ = 0;
                    i_47_ = 0;
                } else {
                    i_46_ = i_40_ / i_45_;
                    i_47_ = i_39_ / i_45_;
                    i_48_ = 16777216 / i_45_;
                }
                if (aBoolean3542) {
                    i_48_ = (i_48_ >> 902826465) + 2048;
                    i_47_ = 2048 - -(i_47_ >> 330679649);
                    i_46_ = 2048 - -(i_46_ >> -800465215);
                }
                is_35_[i_38_] = i_47_;
                is_36_[i_38_] = i_46_;
                is_37_[i_38_] = i_48_;
            }
        }
        return is;
    }

    static {
        aRSString_3528 = RSString.newRsString("Dec");
        aRSString_3526 = RSString.newRsString("Sep");
        aRSString_3537 = RSString.newRsString("Nov");
        aRSString_3534 = RSString.newRsString("May");
        aRSString_3533 = RSString.newRsString("Oct");
        aRSString_3538 = RSString.newRsString("Jan");
        aRSString_3543 = RSString.newRsString("Jun");
        aRSString_3539 = RSString.newRsString("Apr");
        anInt3532 = 0;
        aRSString_3541 = RSString.newRsString("Jul");
        aRSString_3530 = RSString.newRsString("Aug");
        aRSString_3536 = RSString.newRsString("Mar");
        aRSStringArray3524
                = new RSString[]{aRSString_3538, aRSString_3529, aRSString_3536,
                aRSString_3539, aRSString_3534, aRSString_3543,
                aRSString_3541, aRSString_3530, aRSString_3526,
                aRSString_3533, aRSString_3537,
                aRSString_3528};
    }
}
