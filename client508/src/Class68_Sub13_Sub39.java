/* Class68_Sub13_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

public class Class68_Sub13_Sub39 extends Class68_Sub13 {
    public static int anInt4090;
    public static int anInt4091;
    public static int anInt4092;
    public static int anInt4093;
    public static int anInt4094;
    public static int anInt4095;
    public static int anInt4096;
    public int anInt4097;
    public static int[] anIntArray4098;
    public short[] aShortArray4099 = new short[512];
    public int anInt4100;
    public int anInt4101;
    public static int[] anIntArray4102 = new int[32];
    public int anInt4103;
    public int anInt4104;
    public static int anInt4105;
    public int anInt4106;
    public static int anInt4107;
    public static int anInt4108;
    public byte[] aByteArray4109;

    public Class68_Sub13_Sub39() {
        super(0, true);
        anInt4097 = 0;
        anInt4101 = 2048;
        anInt4104 = 5;
        anInt4106 = 2;
        anInt4103 = 1;
        aByteArray4109 = new byte[512];
        anInt4100 = 5;
    }

    public int[] method698(byte i, int i_0_) {
        anInt4094++;
        int[] is = aClass115_2936.method1697(false, i_0_);
        if (i != -61)
            return null;
        if (aClass115_2936.aBoolean1957) {
            int i_1_ = anInt4100 * Class13_Sub3.anIntArray2672[i_0_] + 2048;
            int i_2_ = i_1_ >> 329137420;
            int i_3_ = i_2_ + 1;
            int i_4_ = 0;
            while_181_:
            for (/**/; Class68_Sub13_Sub19.anInt3746 > i_4_; i_4_++) {
                Class68_Sub20_Sub4.anInt4218 = Class108.anInt1829
                        = Class68_Sub27.anInt3219 = Class68_Sub20_Sub14.anInt4382
                        = 2147483647;
                int i_5_ = (anInt4104 * Class68_Sub13_Sub3.anIntArray3479[i_4_]
                        + 2048);
                int i_6_ = i_5_ >> -65607508;
                int i_7_ = i_6_ + 1;
                for (int i_8_ = i_2_ + -1;
                     (i_3_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff); i_8_++) {
                    int i_9_ = (aByteArray4109[0xff & (i_8_ < anInt4100 ? i_8_
                            : -anInt4100 + i_8_)]
                            & 0xff);
                    for (int i_10_ = -1 + i_6_; i_10_ <= i_7_; i_10_++) {
                        int i_11_ = (((aByteArray4109
                                [(i_9_ - -(((anInt4104 ^ 0xffffffff)
                                >= (i_10_ ^ 0xffffffff))
                                ? i_10_ + -anInt4104 : i_10_)
                                & 0xff)])
                                & 0xff)
                                * 2);
                        int i_12_ = (-(i_10_ << -732815412)
                                - aShortArray4099[i_11_++] + i_5_);
                        int i_13_ = i_1_ - ((i_8_ << -1632225748)
                                + aShortArray4099[i_11_]);
                        int i_14_ = anInt4103;
                        int i_15_;
                        while_177_:
                        do {
                            while_176_:
                            do {
                                while_175_:
                                do {
                                    while_174_:
                                    do {
                                        do {
                                            if (i_14_ != 1) {
                                                if ((i_14_ ^ 0xffffffff)
                                                        != -4) {
                                                    if ((i_14_ ^ 0xffffffff)
                                                            != -5) {
                                                        if (i_14_ != 5) {
                                                            if ((i_14_
                                                                    ^ 0xffffffff)
                                                                    == -3)
                                                                break while_175_;
                                                            break while_176_;
                                                        }
                                                    } else
                                                        break;
                                                    break while_174_;
                                                }
                                            } else {
                                                i_15_ = ((i_12_ * i_12_
                                                        - -(i_13_ * i_13_))
                                                        >> -1406160692);
                                                break while_177_;
                                            }
                                            i_12_ = ((i_12_ ^ 0xffffffff) <= -1
                                                    ? i_12_ : -i_12_);
                                            i_13_ = ((i_13_ ^ 0xffffffff) > -1
                                                    ? -i_13_ : i_13_);
                                            i_15_ = (((i_12_ ^ 0xffffffff)
                                                    >= (i_13_ ^ 0xffffffff))
                                                    ? i_13_ : i_12_);
                                            break while_177_;
                                        } while (false);
                                        i_12_
                                                = (int) (4096.0
                                                * (Math.sqrt
                                                ((double) ((float) ((i_12_
                                                        ^ 0xffffffff) <= -1
                                                        ? i_12_
                                                        : -i_12_)
                                                        / 4096.0F))));
                                        i_13_
                                                = (int) (4096.0
                                                * (Math.sqrt
                                                ((double) ((float) ((i_13_
                                                        < 0)
                                                        ? -i_13_
                                                        : i_13_)
                                                        / 4096.0F))));
                                        i_15_ = i_13_ + i_12_;
                                        i_15_ = i_15_ * i_15_ >> -1930277172;
                                        break while_177_;
                                    } while (false);
                                    i_12_ *= i_12_;
                                    i_13_ *= i_13_;
                                    i_15_
                                            = (int) (4096.0
                                            * (Math.sqrt
                                            (Math.sqrt
                                                    ((double) ((float) (i_12_
                                                            + i_13_)
                                                            / 1.6777216E7F)))));
                                    break while_177_;
                                } while (false);
                                i_15_ = (((i_12_ ^ 0xffffffff) <= -1 ? i_12_
                                        : -i_12_)
                                        + (i_13_ >= 0 ? i_13_ : -i_13_));
                                break while_177_;
                            } while (false);
                            i_15_ = (int) (4096.0
                                    * (Math.sqrt
                                    ((double) ((float) (i_13_ * i_13_
                                            + (i_12_
                                            * i_12_))
                                            / 1.6777216E7F))));
                        } while (false);
                        if ((i_15_ ^ 0xffffffff)
                                <= (Class68_Sub20_Sub4.anInt4218 ^ 0xffffffff)) {
                            if ((Class108.anInt1829 ^ 0xffffffff)
                                    >= (i_15_ ^ 0xffffffff)) {
                                if (Class68_Sub27.anInt3219 <= i_15_) {
                                    if (Class68_Sub20_Sub14.anInt4382 > i_15_)
                                        Class68_Sub20_Sub14.anInt4382 = i_15_;
                                } else {
                                    Class68_Sub20_Sub14.anInt4382
                                            = Class68_Sub27.anInt3219;
                                    Class68_Sub27.anInt3219 = i_15_;
                                }
                            } else {
                                Class68_Sub20_Sub14.anInt4382
                                        = Class68_Sub27.anInt3219;
                                Class68_Sub27.anInt3219 = Class108.anInt1829;
                                Class108.anInt1829 = i_15_;
                            }
                        } else {
                            Class68_Sub20_Sub14.anInt4382
                                    = Class68_Sub27.anInt3219;
                            Class68_Sub27.anInt3219 = Class108.anInt1829;
                            Class108.anInt1829 = Class68_Sub20_Sub4.anInt4218;
                            Class68_Sub20_Sub4.anInt4218 = i_15_;
                        }
                    }
                }
                int i_16_ = anInt4106;
                while_179_:
                do {
                    while_178_:
                    do {
                        do {
                            if (i_16_ != 0) {
                                if (i_16_ != 1) {
                                    if (i_16_ != 3) {
                                        if ((i_16_ ^ 0xffffffff) != -5) {
                                            if (i_16_ == 2)
                                                break while_179_;
                                            continue while_181_;
                                        }
                                    } else
                                        break;
                                    break while_178_;
                                }
                            } else {
                                is[i_4_] = Class68_Sub20_Sub4.anInt4218;
                                continue while_181_;
                            }
                            is[i_4_] = Class108.anInt1829;
                            continue while_181_;
                        } while (false);
                        is[i_4_] = Class68_Sub27.anInt3219;
                        continue while_181_;
                    } while (false);
                    is[i_4_] = Class68_Sub20_Sub14.anInt4382;
                    continue while_181_;
                } while (false);
                is[i_4_] = Class108.anInt1829 - Class68_Sub20_Sub4.anInt4218;
            }
        }
        return is;
    }

    public static void method901(byte i) {
        int i_17_ = 102 / ((i - -71) / 38);
        if (Class47.anInt940 == 2) {
            if (((Class68_Sub25.anInt3176 ^ 0xffffffff)
                    == (Class13_Sub4.anInt2682 ^ 0xffffffff))
                    && Class68_Sub13_Sub16.anInt3705 == Class92.anInt1646) {
                Class47.anInt940 = 0;
                Class68_Sub20_Sub8.method1083((byte) -126,
                        (Class68_Sub13_Sub21.anInt3803
                                - 1));
            }
        } else if (Class68_Sub13_Sub37.anInt4077 == Class68_Sub25.anInt3176
                && (Class92.anInt1646 ^ 0xffffffff) == (Class125.anInt2173
                ^ 0xffffffff)) {
            Class47.anInt940 = 0;
            Class68_Sub20_Sub8.method1083((byte) 102,
                    Class68_Sub13_Sub21.anInt3803 + -1);
        } else {
            Class68_Sub13_Sub16.anInt3705 = Class125.anInt2173;
            Class13_Sub4.anInt2682 = Class68_Sub13_Sub37.anInt4077;
            Class47.anInt940 = 2;
        }
        anInt4095++;
    }

    public static void method902(int i) {
        anIntArray4102 = null;
        if (i == -1)
            anIntArray4098 = null;
    }

    public void method700(Stream class68_sub14, int i, int i_18_) {
        anInt4093++;
        int i_19_ = i;
        while_186_:
        do {
            while_185_:
            do {
                while_184_:
                do {
                    while_183_:
                    do {
                        while_182_:
                        do {
                            do {
                                if ((i_19_ ^ 0xffffffff) != -1) {
                                    if ((i_19_ ^ 0xffffffff) != -2) {
                                        if (i_19_ != 2) {
                                            if ((i_19_ ^ 0xffffffff) != -4) {
                                                if (i_19_ != 4) {
                                                    if ((i_19_ ^ 0xffffffff)
                                                            != -6) {
                                                        if (i_19_ == 6)
                                                            break while_185_;
                                                        break while_186_;
                                                    }
                                                } else
                                                    break while_183_;
                                                break while_184_;
                                            }
                                        } else
                                            break;
                                        break while_182_;
                                    }
                                } else {
                                    anInt4104 = anInt4100
                                            = class68_sub14.readUnsignedByte(-6677);
                                    break while_186_;
                                }
                                anInt4097 = class68_sub14.readUnsignedByte(-6677);
                                break while_186_;
                            } while (false);
                            anInt4101 = class68_sub14.readUnsignedWord(1355769544);
                            break while_186_;
                        } while (false);
                        anInt4106 = class68_sub14.readUnsignedByte(-6677);
                        break while_186_;
                    } while (false);
                    anInt4103 = class68_sub14.readUnsignedByte(i_18_ ^ 0x1a14);
                    break while_186_;
                } while (false);
                anInt4104 = class68_sub14.readUnsignedByte(-6677);
                break while_186_;
            } while (false);
            anInt4100 = class68_sub14.readUnsignedByte(-6677);
        } while (false);
        if (i_18_ != -1)
            method905(127, -1, 114);
    }

    public void method690(byte i) {
        aByteArray4109 = Class68_Sub13_Sub37.method894((byte) 14, anInt4097);
        anInt4096++;
        if (i < -22)
            method906(-1632225748);
    }

    public static void method903(int i, int i_20_, int i_21_, int i_22_,
                                 int i_23_, int i_24_, int i_25_, int i_26_,
                                 int i_27_, int i_28_, int i_29_) {
        anInt4092++;
        int i_30_ = -i_25_ + i_20_;
        int i_31_ = i_29_ + -i_21_;
        boolean bool;
        if (Class68_Sub13_Sub36.anInt4033 <= 0
                || (Class68_Sub13_Sub36.anInt4033 % 10 ^ 0xffffffff) <= -6)
            bool = false;
        else
            bool = true;
        int i_32_ = 983040 / i_27_;
        int i_33_ = 983040 / i;
        for (int i_34_ = -i_32_; i_30_ - -i_32_ > i_34_; i_34_++) {
            int i_35_ = i_22_ + i_27_ * i_34_ >> 2056485616;
            int i_36_ = i_22_ - -(i_27_ * (1 + i_34_)) >> -2040025040;
            int i_37_ = -i_35_ + i_36_;
            if ((i_37_ ^ 0xffffffff) < -1) {
                int i_38_ = i_34_ + i_25_ >> 926459878;
                i_35_ += i_24_;
                i_36_ += i_24_;
                if ((i_38_ ^ 0xffffffff) <= -1
                        && ((i_38_ ^ 0xffffffff)
                        >= (-1 + (Class68_Sub20_Sub17
                        .anIntArrayArrayArray4442).length
                        ^ 0xffffffff))) {
                    int[][] is
                            = Class68_Sub20_Sub17.anIntArrayArrayArray4442[i_38_];
                    for (int i_39_ = -i_33_;
                         (i_31_ + i_33_ ^ 0xffffffff) < (i_39_ ^ 0xffffffff);
                         i_39_++) {
                        int i_40_ = i_26_ - -((1 + i_39_) * i) >> 740261616;
                        int i_41_ = i_26_ + i * i_39_ >> -613871312;
                        int i_42_ = i_40_ - i_41_;
                        if ((i_42_ ^ 0xffffffff) < -1) {
                            i_40_ += i_28_;
                            i_41_ += i_28_;
                            int i_43_ = i_21_ + i_39_ >> 245999110;
                            if (i_43_ >= 0 && i_43_ <= -1 + is.length
                                    && is[i_43_] != null) {
                                int i_44_ = ((i_34_ + i_25_ & 0x3f)
                                        + ((i_21_ + i_39_ & 0x3f)
                                        << -852910938));
                                int i_45_ = is[i_43_][i_44_];
                                if (i_45_ != 0) {
                                    Class116 class116
                                            = Class1_Sub5.method140(115,
                                            i_45_ + -1);
                                    if (bool && (class116.anInt1980
                                            == (Class68_Sub13_Sub12
                                            .anInt3644))) {
                                        Class68_Sub8 class68_sub8
                                                = new Class68_Sub8();
                                        class68_sub8.anInt2875 = i_41_;
                                        class68_sub8.anInt2878
                                                = class116.anInt1980;
                                        class68_sub8.anInt2869 = i_35_;
                                        Class94.aClass16_1671
                                                .method286(class68_sub8, true);
                                    }
                                    Class68_Sub13_Sub9
                                            .aSpriteArray3569
                                            [class116.anInt1980]
                                            .method1103(-7 + i_35_, i_41_ + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        int i_46_ = -124 / ((i_23_ - -31) / 58);
        for (Class68_Sub8 class68_sub8
                     = (Class68_Sub8) Class94.aClass16_1671.method293((byte) 76);
             class68_sub8 != null;
             class68_sub8 = ((Class68_Sub8)
                     Class94.aClass16_1671.method290((byte) -119))) {
            Class68_Sub13_Sub9.aSpriteArray3569
                    [class68_sub8.anInt2878].method1103
                    (-7 + class68_sub8.anInt2869, class68_sub8.anInt2875 - 7);
            Class79.method1434(class68_sub8.anInt2869, class68_sub8.anInt2875,
                    15, 16776960, 128);
            Class79.method1434(class68_sub8.anInt2869, class68_sub8.anInt2875,
                    7, 16777215, 256);
        }
        Class94.aClass16_1671.method284(105);
    }

    public static void method904(int i, int i_47_, int i_48_, int i_49_,
                                 int i_50_, int i_51_, byte i_52_) {
        anInt4091++;
        Class47.anInt938 = 0;
        for (int i_53_ = -1;
             ((client.anInt2382 + Class13_Sub2.anInt2645 ^ 0xffffffff)
                     < (i_53_ ^ 0xffffffff));
             i_53_++) {
            Class1_Sub6 class1_sub6;
            if (i_53_ == -1)
                class1_sub6 = Class68_Sub7.aClass1_Sub6_Sub2_2860;
            else if (i_53_ >= client.anInt2382)
                class1_sub6 = (Class102.aClass1_Sub6_Sub1Array1746
                        [(Class68_Sub10.anIntArray2906
                        [-client.anInt2382 + i_53_])]);
            else
                class1_sub6 = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                        [Class85.anIntArray1563[i_53_]]);
            if (class1_sub6 != null && class1_sub6.method150(109)) {
                if (class1_sub6 instanceof Class1_Sub6_Sub1) {
                    Class80 class80
                            = ((Class1_Sub6_Sub1) class1_sub6).aClass80_3395;
                    if (class80.anIntArray1431 != null)
                        class80 = class80.method1447(-94);
                    if (class80 == null)
                        continue;
                }
                if (i_53_ >= client.anInt2382) {
                    Class80 class80
                            = ((Class1_Sub6_Sub1) class1_sub6).aClass80_3395;
                    if (class80.anIntArray1431 != null)
                        class80 = class80.method1447(-94);
                    if ((class80.anInt1439 ^ 0xffffffff) <= -1
                            && ((class80.anInt1439 ^ 0xffffffff)
                            > (Class108.aClass68_Sub20_Sub10Array1828.length
                            ^ 0xffffffff))) {
                        Class95.method1550(93, i_51_, i_49_, i >> -617376639,
                                class1_sub6, i_47_ >> 253301537,
                                (class1_sub6.method152((byte) 109)
                                        - -15));
                        if ((Class86.anInt1576 ^ 0xffffffff) < 0)
                            Class108.aClass68_Sub20_Sub10Array1828
                                    [class80.anInt1439].method1103
                                    (i_48_ - (-Class86.anInt1576 - -12),
                                            i_50_ + Class114.anInt1925 - 30);
                    }
                    Class23[] class23s = Class34.aClass23Array594;
                    for (int i_54_ = 0;
                         (class23s.length ^ 0xffffffff) < (i_54_ ^ 0xffffffff);
                         i_54_++) {
                        Class23 class23 = class23s[i_54_];
                        if (class23 != null && class23.anInt489 == 1
                                && ((class23.anInt493 ^ 0xffffffff)
                                == ((Class68_Sub10.anIntArray2906
                                [-client.anInt2382 + i_53_])
                                ^ 0xffffffff))
                                && Class68_Sub3.anInt2812 % 20 < 10) {
                            Class95.method1550(54, i_51_, i_49_,
                                    i >> 1370432289, class1_sub6,
                                    i_47_ >> 319321345,
                                    (class1_sub6
                                            .method152((byte) -122)
                                            - -15));
                            if (Class86.anInt1576 > -1)
                                Class68_Sub13_Sub12
                                        .aClass68_Sub20_Sub10Array3646
                                        [class23.anInt499].method1103
                                        (Class86.anInt1576 + i_48_ - 12,
                                                i_50_ - (-Class114.anInt1925 - -28));
                        }
                    }
                } else {
                    Class1_Sub6_Sub2 class1_sub6_sub2
                            = (Class1_Sub6_Sub2) class1_sub6;
                    int i_55_ = 30;
                    if (class1_sub6_sub2.anInt3435 != -1
                            || class1_sub6_sub2.anInt3422 != -1) {
                        Class95.method1550(110, i_51_, i_49_, i >> -234316287,
                                class1_sub6, i_47_ >> 1474617121,
                                15 + class1_sub6
                                        .method152((byte) -114));
                        if (Class86.anInt1576 > -1) {
                            if (class1_sub6_sub2.anInt3435 != -1) {
                                Class59.aClass68_Sub20_Sub10Array1106
                                        [class1_sub6_sub2.anInt3435].method1103
                                        (-12 + Class86.anInt1576 + i_48_,
                                                i_50_ + (Class114.anInt1925 + -i_55_));
                                i_55_ += 25;
                            }
                            if (class1_sub6_sub2.anInt3422 != -1) {
                                Class108.aClass68_Sub20_Sub10Array1828
                                        [class1_sub6_sub2.anInt3422].method1103
                                        (-12 + i_48_ - -Class86.anInt1576,
                                                i_50_ + Class114.anInt1925 + -i_55_);
                                i_55_ += 25;
                            }
                        }
                    }
                    if (i_53_ >= 0) {
                        int i_56_ = 0;
                        for (Class23[] class23s = Class34.aClass23Array594;
                             class23s.length > i_56_; i_56_++) {
                            Class23 class23 = class23s[i_56_];
                            if (class23 != null && class23.anInt489 == 10
                                    && ((class23.anInt493 ^ 0xffffffff)
                                    == (Class85.anIntArray1563[i_53_]
                                    ^ 0xffffffff))) {
                                Class95.method1550
                                        (55, i_51_, i_49_, i >> 1187412609,
                                                class1_sub6, i_47_ >> 815114945,
                                                class1_sub6.method152((byte) 87) + 15);
                                if ((Class86.anInt1576 ^ 0xffffffff) < 0)
                                    Class68_Sub13_Sub12
                                            .aClass68_Sub20_Sub10Array3646
                                            [class23.anInt499].method1103
                                            (i_48_ - (-Class86.anInt1576 + 12),
                                                    -i_55_ + Class114.anInt1925 + i_50_);
                            }
                        }
                    }
                }
                if (class1_sub6.aRSString_2576 != null
                        && (i_53_ >= client.anInt2382
                        || (GroundData.anInt686 ^ 0xffffffff) == -1
                        || GroundData.anInt686 == 3
                        || ((GroundData.anInt686 ^ 0xffffffff) == -2
                        && (Class68_Sub13_Sub17.method785
                        (-86, (((Class1_Sub6_Sub2) class1_sub6)
                                .aRSString_3414)))))) {
                    Class95.method1550(33, i_51_, i_49_, i >> -1557620863,
                            class1_sub6, i_47_ >> 298870017,
                            class1_sub6.method152((byte) -111));
                    if ((Class86.anInt1576 ^ 0xffffffff) < 0
                            && Class47.anInt938 < Class75_Sub1.anInt3301) {
                        Class75_Sub1.anIntArray3292[Class47.anInt938]
                                = Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511
                                .method1029(class1_sub6.aRSString_2576) / 2;
                        Class75_Sub1.anIntArray3300[Class47.anInt938]
                                = (Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511
                                .anInt4137);
                        Class75_Sub1.anIntArray3293[Class47.anInt938]
                                = Class86.anInt1576;
                        Class75_Sub1.anIntArray3305[Class47.anInt938]
                                = Class114.anInt1925;
                        Class75_Sub1.anIntArray3295[Class47.anInt938]
                                = class1_sub6.anInt2535;
                        Class75_Sub1.anIntArray3297[Class47.anInt938]
                                = class1_sub6.anInt2539;
                        Class75_Sub1.anIntArray3303[Class47.anInt938]
                                = class1_sub6.anInt2569;
                        Class75_Sub1.aRSStringArray3299[Class47.anInt938]
                                = class1_sub6.aRSString_2576;
                        Class47.anInt938++;
                    }
                }
                if ((Class68_Sub3.anInt2812 ^ 0xffffffff)
                        > (class1_sub6.anInt2534 ^ 0xffffffff)) {
                    Class68_Sub20_Sub10 class68_sub20_sub10
                            = Class68_Sub16.aClass68_Sub20_Sub10Array3030[0];
                    Class68_Sub20_Sub10 class68_sub20_sub10_57_
                            = Class68_Sub16.aClass68_Sub20_Sub10Array3030[1];
                    if (class1_sub6 instanceof Class1_Sub6_Sub1) {
                        Class1_Sub6_Sub1 class1_sub6_sub1
                                = (Class1_Sub6_Sub1) class1_sub6;
                        Class68_Sub20_Sub10[] class68_sub20_sub10s
                                = ((Class68_Sub20_Sub10[])
                                (Class108.aClass98_1827.method1570
                                        (14366, (long) (class1_sub6_sub1.aClass80_3395
                                                .anInt1437))));
                        if (class68_sub20_sub10s == null) {
                            class68_sub20_sub10s
                                    = Class127.method1780(0,
                                    (class1_sub6_sub1
                                            .aClass80_3395
                                            .anInt1437),
                                    0,
                                    (Class52
                                            .aClass21_Sub1_1011));
                            if (class68_sub20_sub10s != null)
                                Class108.aClass98_1827.method1568
                                        (class68_sub20_sub10s, 100,
                                                (long) (class1_sub6_sub1.aClass80_3395
                                                        .anInt1437));
                        }
                        if (class68_sub20_sub10s != null
                                && class68_sub20_sub10s.length == 2) {
                            class68_sub20_sub10_57_ = class68_sub20_sub10s[1];
                            class68_sub20_sub10 = class68_sub20_sub10s[0];
                        }
                    }
                    Class95.method1550(57, i_51_, i_49_, i >> -1344746495,
                            class1_sub6, i_47_ >> 1523513249,
                            (class1_sub6.method152((byte) -120)
                                    - (-10
                                    - class68_sub20_sub10.anInt4311)));
                    if (Class86.anInt1576 > -1) {
                        int i_58_ = (Class86.anInt1576 + i_48_
                                + -(class68_sub20_sub10.anInt4309
                                >> -428194975));
                        int i_59_ = Class114.anInt1925 + i_50_ + -3;
                        class68_sub20_sub10.method1103(i_58_, i_59_);
                        int i_60_ = (class1_sub6.anInt2547
                                * class68_sub20_sub10.anInt4309 / 255);
                        int i_61_ = class68_sub20_sub10.anInt4311;
                        Class79.method1426(i_58_, i_59_, i_58_ - -i_60_,
                                i_59_ + i_61_);
                        class68_sub20_sub10_57_.method1103(i_58_, i_59_);
                        Class79.method1427(i_48_, i_50_, i_47_ + i_48_,
                                i_50_ + i);
                    }
                }
                for (int i_62_ = 0; i_62_ < 4; i_62_++) {
                    if ((Class68_Sub3.anInt2812 ^ 0xffffffff)
                            > (class1_sub6.anIntArray2580[i_62_] ^ 0xffffffff)) {
                        Class95.method1550(80, i_51_, i_49_, i >> -1803677215,
                                class1_sub6, i_47_ >> -57233215,
                                (class1_sub6.method152((byte) -121)
                                        / 2));
                        if ((Class86.anInt1576 ^ 0xffffffff) < 0) {
                            if (i_62_ == 1)
                                Class114.anInt1925 -= 20;
                            if (i_62_ == 2) {
                                Class86.anInt1576 -= 15;
                                Class114.anInt1925 -= 10;
                            }
                            if (i_62_ == 3) {
                                Class114.anInt1925 -= 10;
                                Class86.anInt1576 += 15;
                            }
                            Class68_Sub13_Sub23
                                    .aClass68_Sub20_Sub10Array3821
                                    [class1_sub6.anIntArray2571[i_62_]].method1103
                                    (i_48_ + Class86.anInt1576 + -12,
                                            -12 + i_50_ + Class114.anInt1925);
                            Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3801
                                    .method1032
                                            (Class68_Sub13_Sub24.method816((class1_sub6
                                                    .anIntArray2554
                                                    [i_62_]),
                                                    0),
                                                    -1 + Class86.anInt1576 + i_48_,
                                                    3 + Class114.anInt1925 + i_50_, 16777215, 0);
                        }
                    }
                }
            }
        }
        int i_63_ = 0;
        if (i_52_ >= -28)
            anIntArray4098 = null;
        for (/**/; i_63_ < Class47.anInt938; i_63_++) {
            int i_64_ = Class75_Sub1.anIntArray3305[i_63_];
            int i_65_ = Class75_Sub1.anIntArray3293[i_63_];
            int i_66_ = Class75_Sub1.anIntArray3292[i_63_];
            int i_67_ = Class75_Sub1.anIntArray3300[i_63_];
            boolean bool = true;
            while (bool) {
                bool = false;
                for (int i_68_ = 0;
                     (i_68_ ^ 0xffffffff) > (i_63_ ^ 0xffffffff); i_68_++) {
                    if (((2 + i_64_ ^ 0xffffffff)
                            < ((Class75_Sub1.anIntArray3305[i_68_]
                            + -Class75_Sub1.anIntArray3300[i_68_])
                            ^ 0xffffffff))
                            && (2 + Class75_Sub1.anIntArray3305[i_68_]
                            ^ 0xffffffff) < (i_64_ - i_67_ ^ 0xffffffff)
                            && ((i_65_ + -i_66_ ^ 0xffffffff)
                            > ((Class75_Sub1.anIntArray3293[i_68_]
                            - -Class75_Sub1.anIntArray3292[i_68_])
                            ^ 0xffffffff))
                            && ((-Class75_Sub1.anIntArray3292[i_68_]
                            + Class75_Sub1.anIntArray3293[i_68_])
                            < i_66_ + i_65_)
                            && (-Class75_Sub1.anIntArray3300[i_68_]
                            + Class75_Sub1.anIntArray3305[i_68_]) < i_64_) {
                        bool = true;
                        i_64_ = (Class75_Sub1.anIntArray3305[i_68_]
                                + -Class75_Sub1.anIntArray3300[i_68_]);
                    }
                }
            }
            Class86.anInt1576 = Class75_Sub1.anIntArray3293[i_63_];
            Class114.anInt1925 = Class75_Sub1.anIntArray3305[i_63_] = i_64_;
            RSString class100 = Class75_Sub1.aRSStringArray3299[i_63_];
            if ((Class68_Sub13_Sub19.anInt3755 ^ 0xffffffff) == -1) {
                int i_69_ = 16776960;
                if (Class75_Sub1.anIntArray3295[i_63_] < 6)
                    i_69_ = (Class57.anIntArray1077
                            [Class75_Sub1.anIntArray3295[i_63_]]);
                if (Class75_Sub1.anIntArray3295[i_63_] == 6)
                    i_69_ = Class3.anInt84 % 20 >= 10 ? 16776960 : 16711680;
                if ((Class75_Sub1.anIntArray3295[i_63_] ^ 0xffffffff) == -8)
                    i_69_ = Class3.anInt84 % 20 >= 10 ? 65535 : 255;
                if (Class75_Sub1.anIntArray3295[i_63_] == 8)
                    i_69_ = Class3.anInt84 % 20 < 10 ? 45056 : 8454016;
                if ((Class75_Sub1.anIntArray3295[i_63_] ^ 0xffffffff) == -10) {
                    int i_70_ = -Class75_Sub1.anIntArray3303[i_63_] + 150;
                    if ((i_70_ ^ 0xffffffff) > -51)
                        i_69_ = 1280 * i_70_ + 16711680;
                    else if (i_70_ < 100)
                        i_69_ = 16384000 - 327680 * i_70_ + 16776960;
                    else if ((i_70_ ^ 0xffffffff) > -151)
                        i_69_ = 65280 - -((-100 + i_70_) * 5);
                }
                if (Class75_Sub1.anIntArray3295[i_63_] == 10) {
                    int i_71_ = 150 - Class75_Sub1.anIntArray3303[i_63_];
                    if ((i_71_ ^ 0xffffffff) <= -51) {
                        if (i_71_ >= 100) {
                            if (i_71_ < 150)
                                i_69_
                                        = 327680 * (i_71_ - 100) + (255 - i_71_ * 5
                                        - -500);
                        } else
                            i_69_ = 16384000 - 327680 * i_71_ + 16711935;
                    } else
                        i_69_ = 16711680 + 5 * i_71_;
                }
                if ((Class75_Sub1.anIntArray3295[i_63_] ^ 0xffffffff) == -12) {
                    int i_72_ = 150 + -Class75_Sub1.anIntArray3303[i_63_];
                    if (i_72_ >= 50) {
                        if ((i_72_ ^ 0xffffffff) <= -101) {
                            if (i_72_ < 150)
                                i_69_ = -(327680 * i_72_) - -49545215;
                        } else
                            i_69_ = 327685 * i_72_ + -16318970;
                    } else
                        i_69_ = 16777215 - 327685 * i_72_;
                }
                if (Class75_Sub1.anIntArray3297[i_63_] == 0)
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1032
                            (class100, Class86.anInt1576 + i_48_,
                                    Class114.anInt1925 + i_50_, i_69_, 0);
                if ((Class75_Sub1.anIntArray3297[i_63_] ^ 0xffffffff) == -2)
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1016
                            (class100, Class86.anInt1576 + i_48_,
                                    Class114.anInt1925 + i_50_, i_69_, 0, Class3.anInt84);
                if (Class75_Sub1.anIntArray3297[i_63_] == 2)
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1015
                            (class100, i_48_ + Class86.anInt1576,
                                    Class114.anInt1925 + i_50_, i_69_, 0, Class3.anInt84);
                if ((Class75_Sub1.anIntArray3297[i_63_] ^ 0xffffffff) == -4)
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1010
                            (class100, Class86.anInt1576 + i_48_,
                                    Class114.anInt1925 + i_50_, i_69_, 0, Class3.anInt84,
                                    -Class75_Sub1.anIntArray3303[i_63_] + 150);
                if (Class75_Sub1.anIntArray3297[i_63_] == 4) {
                    int i_73_ = ((150 - Class75_Sub1.anIntArray3303[i_63_])
                            * (Class68_Sub13_Sub4
                            .aClass68_Sub20_Sub1_3511
                            .method1029(class100)
                            - -100)
                            / 150);
                    Class79.method1426(i_48_ + (Class86.anInt1576 - 50), i_50_,
                            i_48_ - -Class86.anInt1576 + 50,
                            i_50_ + i);
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1030
                            (class100, -i_73_ + Class86.anInt1576 + i_48_ - -50,
                                    i_50_ - -Class114.anInt1925, i_69_, 0);
                    Class79.method1427(i_48_, i_50_, i_47_ + i_48_, i + i_50_);
                }
                if ((Class75_Sub1.anIntArray3297[i_63_] ^ 0xffffffff) == -6) {
                    int i_74_ = 150 - Class75_Sub1.anIntArray3303[i_63_];
                    Class79.method1426(i_48_,
                            (Class114.anInt1925
                                    + (i_50_ + (-(Class68_Sub13_Sub4
                                    .aClass68_Sub20_Sub1_3511
                                    .anInt4137)
                                    + -1))),
                            i_48_ - -i_47_,
                            5 + (i_50_ - -Class114.anInt1925));
                    int i_75_ = 0;
                    if (i_74_ >= 25) {
                        if ((i_74_ ^ 0xffffffff) < -126)
                            i_75_ = -125 + i_74_;
                    } else
                        i_75_ = -25 + i_74_;
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1032
                            (class100, i_48_ - -Class86.anInt1576,
                                    i_75_ + (Class114.anInt1925 + i_50_), i_69_, 0);
                    Class79.method1427(i_48_, i_50_, i_47_ + i_48_, i_50_ + i);
                }
            } else
                Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1032
                        (class100, i_48_ + Class86.anInt1576,
                                Class114.anInt1925 + i_50_, 16776960, 0);
        }
    }

    public static void method905(int i, int i_76_, int i_77_) {
        Class70.anInt1272++;
        if (i_77_ != 327685)
            anIntArray4098 = null;
        anInt4108++;
        Class21renamed.stream.createFrame(63);
        Class21renamed.stream.writeWordBigEndianA((byte) 19, i);
        Class21renamed.stream.writeDWordBigEndian((byte) 127, i_76_);
    }

    public void method906(int i) {
        if (i != -1632225748)
            aByteArray4109 = null;
        Random random = new Random((long) anInt4097);
        aShortArray4099 = new short[512];
        if ((anInt4101 ^ 0xffffffff) < -1) {
            for (int i_78_ = 0; i_78_ < 512; i_78_++)
                aShortArray4099[i_78_]
                        = (short) Class68_Sub20_Sub10
                        .method1114(anInt4101, (byte) 70, random);
        }
        anInt4090++;
    }

    public static void method907(int i, int i_79_) {
        if (i >= -99)
            anIntArray4098 = null;
        Class68_Sub20_Sub9 class68_sub20_sub9
                = Class68_Sub13_Sub26_Sub1.method835(i_79_, 2, (byte) -121);
        anInt4105++;
        class68_sub20_sub9.method1101((byte) -87);
    }

    static {
        anIntArray4098 = new int[100];
    }
}
