/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

public class Class42 {
    public Class5 aClass5_706;
    public int[] anIntArray707 = new int[5];
    public static int[] anIntArray708;
    public Class5 aClass5_709;
    public Class5 aClass5_710;
    public int anInt711 = 0;
    public int anInt712 = 500;
    public Class6 aClass6_713;
    public static int[] anIntArray714 = new int[32768];
    public static int[] anIntArray715;
    public int anInt716;
    public static int[] anIntArray717;
    public int anInt718;
    public Class5 aClass5_719;
    public Class5 aClass5_720;
    public static int[] anIntArray721;
    public int[] anIntArray722 = new int[5];
    public Class5 aClass5_723;
    public static int[] anIntArray724;
    public Class5 aClass5_725;
    public Class5 aClass5_726;
    public static int[] anIntArray727;
    public int[] anIntArray728;
    public static int[] anIntArray729;
    public Class5 aClass5_730;

    public static void method476() {
        anIntArray715 = null;
        anIntArray714 = null;
        anIntArray708 = null;
        anIntArray724 = null;
        anIntArray729 = null;
        anIntArray717 = null;
        anIntArray727 = null;
        anIntArray721 = null;
    }

    public int[] method477(int i, int i_0_) {
        Class39.method463(anIntArray715, 0, i);
        if (i_0_ < 10)
            return anIntArray715;
        double d = (double) i / ((double) i_0_ + 0.0);
        aClass5_709.method192();
        aClass5_725.method192();
        int i_1_ = 0;
        int i_2_ = 0;
        int i_3_ = 0;
        if (aClass5_723 != null) {
            aClass5_723.method192();
            aClass5_726.method192();
            i_1_ = (int) ((double) (aClass5_723.anInt102 - aClass5_723.anInt98)
                    * 32.768 / d);
            i_2_ = (int) ((double) aClass5_723.anInt98 * 32.768 / d);
        }
        int i_4_ = 0;
        int i_5_ = 0;
        int i_6_ = 0;
        if (aClass5_730 != null) {
            aClass5_730.method192();
            aClass5_710.method192();
            i_4_ = (int) ((double) (aClass5_730.anInt102 - aClass5_730.anInt98)
                    * 32.768 / d);
            i_5_ = (int) ((double) aClass5_730.anInt98 * 32.768 / d);
        }
        for (int i_7_ = 0; i_7_ < 5; i_7_++) {
            if (anIntArray722[i_7_] != 0) {
                anIntArray724[i_7_] = 0;
                anIntArray729[i_7_] = (int) ((double) anIntArray728[i_7_] * d);
                anIntArray717[i_7_] = (anIntArray722[i_7_] << 14) / 100;
                anIntArray727[i_7_]
                        = (int) ((double) (aClass5_709.anInt102
                        - aClass5_709.anInt98)
                        * 32.768
                        * Math.pow(1.0057929410678534,
                        (double) anIntArray707[i_7_])
                        / d);
                anIntArray721[i_7_]
                        = (int) ((double) aClass5_709.anInt98 * 32.768 / d);
            }
        }
        for (int i_8_ = 0; i_8_ < i; i_8_++) {
            int i_9_ = aClass5_709.method190(i);
            int i_10_ = aClass5_725.method190(i);
            if (aClass5_723 != null) {
                int i_11_ = aClass5_723.method190(i);
                int i_12_ = aClass5_726.method190(i);
                i_9_ += method478(i_3_, i_12_, aClass5_723.anInt100) >> 1;
                i_3_ += (i_11_ * i_1_ >> 16) + i_2_;
            }
            if (aClass5_730 != null) {
                int i_13_ = aClass5_730.method190(i);
                int i_14_ = aClass5_710.method190(i);
                i_10_ = i_10_ * ((method478(i_6_, i_14_, aClass5_730.anInt100)
                        >> 1)
                        + 32768) >> 15;
                i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
            }
            for (int i_15_ = 0; i_15_ < 5; i_15_++) {
                if (anIntArray722[i_15_] != 0) {
                    int i_16_ = i_8_ + anIntArray729[i_15_];
                    if (i_16_ < i) {
                        anIntArray715[i_16_]
                                += method478(anIntArray724[i_15_],
                                i_10_ * anIntArray717[i_15_] >> 15,
                                aClass5_709.anInt100);
                        anIntArray724[i_15_] += (i_9_ * anIntArray727[i_15_]
                                >> 16) + anIntArray721[i_15_];
                    }
                }
            }
        }
        if (aClass5_706 != null) {
            aClass5_706.method192();
            aClass5_719.method192();
            int i_17_ = 0;
            boolean bool = false;
            boolean bool_18_ = true;
            for (int i_19_ = 0; i_19_ < i; i_19_++) {
                int i_20_ = aClass5_706.method190(i);
                int i_21_ = aClass5_719.method190(i);
                int i_22_;
                if (bool_18_)
                    i_22_ = aClass5_706.anInt98 + (((aClass5_706.anInt102
                            - aClass5_706.anInt98)
                            * i_20_)
                            >> 8);
                else
                    i_22_ = aClass5_706.anInt98 + (((aClass5_706.anInt102
                            - aClass5_706.anInt98)
                            * i_21_)
                            >> 8);
                i_17_ += 256;
                if (i_17_ >= i_22_) {
                    i_17_ = 0;
                    bool_18_ = !bool_18_;
                }
                if (bool_18_)
                    anIntArray715[i_19_] = 0;
            }
        }
        if (anInt716 > 0 && anInt718 > 0) {
            int i_23_ = (int) ((double) anInt716 * d);
            for (int i_24_ = i_23_; i_24_ < i; i_24_++)
                anIntArray715[i_24_]
                        += anIntArray715[i_24_ - i_23_] * anInt718 / 100;
        }
        if (aClass6_713.anIntArray111[0] > 0
                || aClass6_713.anIntArray111[1] > 0) {
            aClass5_720.method192();
            int i_25_ = aClass5_720.method190(i + 1);
            int i_26_ = aClass6_713.method194(0, (float) i_25_ / 65536.0F);
            int i_27_ = aClass6_713.method194(1, (float) i_25_ / 65536.0F);
            if (i >= i_26_ + i_27_) {
                int i_28_ = 0;
                int i_29_ = i_27_;
                if (i_29_ > i - i_26_)
                    i_29_ = i - i_26_;
                for (/**/; i_28_ < i_29_; i_28_++) {
                    int i_30_ = (int) (((long) anIntArray715[i_28_ + i_26_]
                            * (long) Class6.anInt113)
                            >> 16);
                    for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
                        i_30_ += (int) (((long) (anIntArray715
                                [i_28_ + i_26_ - 1 - i_31_])
                                * (long) (Class6.anIntArrayArray112[0]
                                [i_31_]))
                                >> 16);
                    for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
                        i_30_
                                -= (int) (((long) anIntArray715[i_28_ - 1 - i_32_]
                                * (long) (Class6.anIntArrayArray112[1]
                                [i_32_]))
                                >> 16);
                    anIntArray715[i_28_] = i_30_;
                    i_25_ = aClass5_720.method190(i + 1);
                }
                i_29_ = 128;
                for (; ; ) {
                    if (i_29_ > i - i_26_)
                        i_29_ = i - i_26_;
                    for (/**/; i_28_ < i_29_; i_28_++) {
                        int i_33_ = (int) (((long) anIntArray715[i_28_ + i_26_]
                                * (long) Class6.anInt113)
                                >> 16);
                        for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
                            i_33_
                                    += (int) (((long) (anIntArray715
                                    [i_28_ + i_26_ - 1 - i_34_])
                                    * (long) (Class6.anIntArrayArray112
                                    [0][i_34_]))
                                    >> 16);
                        for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
                            i_33_
                                    -= (int) (((long) (anIntArray715
                                    [i_28_ - 1 - i_35_])
                                    * (long) (Class6.anIntArrayArray112
                                    [1][i_35_]))
                                    >> 16);
                        anIntArray715[i_28_] = i_33_;
                        i_25_ = aClass5_720.method190(i + 1);
                    }
                    if (i_28_ >= i - i_26_)
                        break;
                    i_26_ = aClass6_713.method194(0, (float) i_25_ / 65536.0F);
                    i_27_ = aClass6_713.method194(1, (float) i_25_ / 65536.0F);
                    i_29_ += 128;
                }
                for (/**/; i_28_ < i; i_28_++) {
                    int i_36_ = 0;
                    for (int i_37_ = i_28_ + i_26_ - i; i_37_ < i_26_; i_37_++)
                        i_36_ += (int) (((long) (anIntArray715
                                [i_28_ + i_26_ - 1 - i_37_])
                                * (long) (Class6.anIntArrayArray112[0]
                                [i_37_]))
                                >> 16);
                    for (int i_38_ = 0; i_38_ < i_27_; i_38_++)
                        i_36_
                                -= (int) (((long) anIntArray715[i_28_ - 1 - i_38_]
                                * (long) (Class6.anIntArrayArray112[1]
                                [i_38_]))
                                >> 16);
                    anIntArray715[i_28_] = i_36_;
                    i_25_ = aClass5_720.method190(i + 1);
                }
            }
        }
        for (int i_39_ = 0; i_39_ < i; i_39_++) {
            if (anIntArray715[i_39_] < -32768)
                anIntArray715[i_39_] = -32768;
            if (anIntArray715[i_39_] > 32767)
                anIntArray715[i_39_] = 32767;
        }
        return anIntArray715;
    }

    public int method478(int i, int i_40_, int i_41_) {
        if (i_41_ == 1) {
            if ((i & 0x7fff) < 16384)
                return i_40_;
            return -i_40_;
        }
        if (i_41_ == 2)
            return anIntArray708[i & 0x7fff] * i_40_ >> 14;
        if (i_41_ == 3)
            return ((i & 0x7fff) * i_40_ >> 14) - i_40_;
        if (i_41_ == 4)
            return anIntArray714[i / 2607 & 0x7fff] * i_40_;
        return 0;
    }

    public void method479(Stream class68_sub14) {
        aClass5_709 = new Class5();
        aClass5_709.method191(class68_sub14);
        aClass5_725 = new Class5();
        aClass5_725.method191(class68_sub14);
        int i = class68_sub14.readUnsignedByte(-6677);
        if (i != 0) {
            class68_sub14.currentOffset--;
            aClass5_723 = new Class5();
            aClass5_723.method191(class68_sub14);
            aClass5_726 = new Class5();
            aClass5_726.method191(class68_sub14);
        }
        i = class68_sub14.readUnsignedByte(-6677);
        if (i != 0) {
            class68_sub14.currentOffset--;
            aClass5_730 = new Class5();
            aClass5_730.method191(class68_sub14);
            aClass5_710 = new Class5();
            aClass5_710.method191(class68_sub14);
        }
        i = class68_sub14.readUnsignedByte(-6677);
        if (i != 0) {
            class68_sub14.currentOffset--;
            aClass5_706 = new Class5();
            aClass5_706.method191(class68_sub14);
            aClass5_719 = new Class5();
            aClass5_719.method191(class68_sub14);
        }
        for (int i_42_ = 0; i_42_ < 10; i_42_++) {
            int i_43_ = class68_sub14.method912(255);
            if (i_43_ == 0)
                break;
            anIntArray722[i_42_] = i_43_;
            anIntArray707[i_42_] = class68_sub14.method960(32767);
            anIntArray728[i_42_] = class68_sub14.method912(255);
        }
        anInt716 = class68_sub14.method912(255);
        anInt718 = class68_sub14.method912(255);
        anInt712 = class68_sub14.readUnsignedWord(1355769544);
        anInt711 = class68_sub14.readUnsignedWord(1355769544);
        aClass6_713 = new Class6();
        aClass5_720 = new Class5();
        aClass6_713.method193(class68_sub14, aClass5_720);
    }

    public Class42() {
        anInt718 = 100;
        anInt716 = 0;
        anIntArray728 = new int[5];
    }

    static {
        Random random = new Random(0L);
        for (int i = 0; i < 32768; i++)
            anIntArray714[i] = (random.nextInt() & 0x2) - 1;
        anIntArray708 = new int[32768];
        for (int i = 0; i < 32768; i++)
            anIntArray708[i]
                    = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
        anIntArray715 = new int[220500];
        anIntArray717 = new int[5];
        anIntArray721 = new int[5];
        anIntArray724 = new int[5];
        anIntArray727 = new int[5];
        anIntArray729 = new int[5];
    }
}
