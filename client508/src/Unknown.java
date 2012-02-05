/* Unknown - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Unknown {
    public static RSString aRSString_1611;
    public int anInt1612;
    public static int anInt1613;
    public Class124 aClass124_1614;
    public static byte aByte1615;
    public Class124 aClass124_1616 = null;
    public int anInt1617 = 65000;
    public static RSString aRSString_1618 = RSString.newRsString("(U1");
    public static RSString aRSString_1619;
    public static int anInt1620;
    public static RSString aRSString_1621;
    public static Image anImage1622;
    public static int anInt1623;
    public static int anInt1624;
    public static int anInt1625;
    public static int anInt1626;
    public static int anInt1627;
    public static int anInt1628;
    public static int anInt1629;

    public static void method1498(int i, int i_0_, int i_1_) {
        for (int i_2_ = 0; i_2_ < Class86.anInt1582; i_2_++) {
            for (int i_3_ = 0; i_3_ < Applet_Sub1.anInt7; i_3_++) {
                for (int i_4_ = 0; i_4_ < Class97.anInt1714; i_4_++) {
                    Class68_Sub1 class68_sub1
                            = (Class22.aClass68_Sub1ArrayArrayArray484[i_2_][i_3_]
                            [i_4_]);
                    if (class68_sub1 != null) {
                        Class64 class64 = class68_sub1.aClass64_2757;
                        if (class64 != null
                                && class64.aClass1_1181.method58()) {
                            Class68_Sub27.method1218(class64.aClass1_1181,
                                    i_2_, i_3_, i_4_, 1, 1);
                            if (class64.aClass1_1184 != null
                                    && class64.aClass1_1184.method58()) {
                                Class68_Sub27.method1218(class64.aClass1_1184,
                                        i_2_, i_3_, i_4_, 1,
                                        1);
                                class64.aClass1_1181.method52((class64
                                        .aClass1_1184),
                                        0, 0, 0, false);
                                class64.aClass1_1184
                                        = class64.aClass1_1184.method57(i, i_0_,
                                        i_1_);
                            }
                            class64.aClass1_1181
                                    = class64.aClass1_1181.method57(i, i_0_, i_1_);
                        }
                        for (int i_5_ = 0; i_5_ < class68_sub1.anInt2771;
                             i_5_++) {
                            Class69 class69
                                    = class68_sub1.aClass69Array2772[i_5_];
                            if (class69 != null
                                    && class69.aClass1_1242.method58()) {
                                Class68_Sub27.method1218(class69.aClass1_1242,
                                        i_2_, i_3_, i_4_,
                                        (class69.anInt1238
                                                - class69.anInt1254
                                                + 1),
                                        (class69.anInt1234
                                                - class69.anInt1253
                                                + 1));
                                class69.aClass1_1242
                                        = class69.aClass1_1242.method57(i, i_0_,
                                        i_1_);
                            }
                        }
                        Class47 class47 = class68_sub1.aClass47_2777;
                        if (class47 != null
                                && class47.aClass1_931.method58()) {
                            Class68_Sub20_Sub5.method1062(class47.aClass1_931,
                                    i_2_, i_3_, i_4_);
                            class47.aClass1_931
                                    = class47.aClass1_931.method57(i, i_0_, i_1_);
                        }
                    }
                }
            }
        }
    }

    public static void method1499(int i, int i_6_, int i_7_, boolean bool,
                                  int i_8_, int i_9_) {
        anInt1629++;
        Class34.method416(-i_8_ + i_6_, (byte) -17, i_9_,
                Class68_Sub22.anIntArrayArray3132[i_7_],
                i_6_ + i_8_);
        int i_10_ = i;
        int i_11_ = i_8_ * i_8_;
        int i_12_ = 0;
        int i_13_ = i * i;
        int i_14_ = i_13_ << -836368127;
        int i_15_ = i_11_ << -1735381023;
        int i_16_ = i << 669055585;
        if (bool != true)
            anImage1622 = null;
        int i_17_ = (1 - i_16_) * i_11_ - -i_14_;
        int i_18_ = -((-1 + i_16_) * i_15_) + i_13_;
        int i_19_ = i_11_ << 1641909666;
        int i_20_ = i_13_ << -1520285566;
        int i_21_ = (3 + (i_12_ << 2113626465)) * i_14_;
        int i_22_ = i_19_ * (i_10_ + -1);
        int i_23_ = (i_12_ - -1) * i_20_;
        int i_24_ = (-3 + (i_10_ << 159282273)) * i_15_;
        while ((i_10_ ^ 0xffffffff) < -1) {
            i_10_--;
            if (i_17_ < 0) {
                while (i_17_ < 0) {
                    i_12_++;
                    i_18_ += i_23_;
                    i_23_ += i_20_;
                    i_17_ += i_21_;
                    i_21_ += i_20_;
                }
            }
            int i_25_ = -i_10_ + i_7_;
            if ((i_18_ ^ 0xffffffff) > -1) {
                i_12_++;
                i_18_ += i_23_;
                i_17_ += i_21_;
                i_21_ += i_20_;
                i_23_ += i_20_;
            }
            int i_26_ = i_6_ + i_12_;
            int i_27_ = i_6_ - i_12_;
            Class34.method416(i_27_, (byte) -17, i_9_,
                    Class68_Sub22.anIntArrayArray3132[i_25_], i_26_);
            i_17_ += -i_22_;
            i_22_ -= i_19_;
            i_18_ += -i_24_;
            i_24_ -= i_19_;
            int i_28_ = i_7_ + i_10_;
            Class34.method416(i_27_, (byte) -17, i_9_,
                    Class68_Sub22.anIntArrayArray3132[i_28_], i_26_);
        }
    }

    public static void method1500(int i, int i_29_, int i_30_, int i_31_,
                                  int i_32_, int i_33_, int i_34_, int i_35_,
                                  int i_36_, int i_37_) {
        anInt1626++;
        Class68_Sub2 class68_sub2 = null;
        if (i_29_ != 0)
            method1504(-51, 16, 10, 40, -61, null, null, null, null, null,
                    null, -61, (byte) 4, 55, -127);
        for (Class68_Sub2 class68_sub2_38_
                     = ((Class68_Sub2)
                Class68_Sub13_Sub31.aClass16_3963.method293((byte) 76));
             class68_sub2_38_ != null;
             class68_sub2_38_
                     = ((Class68_Sub2)
                     Class68_Sub13_Sub31.aClass16_3963.method290((byte) 14))) {
            if (i_35_ == class68_sub2_38_.anInt2789
                    && (i ^ 0xffffffff) == (class68_sub2_38_.anInt2791
                    ^ 0xffffffff)
                    && (i_32_ ^ 0xffffffff) == (class68_sub2_38_.anInt2784
                    ^ 0xffffffff)
                    && (i_31_ ^ 0xffffffff) == (class68_sub2_38_.anInt2786
                    ^ 0xffffffff)) {
                class68_sub2 = class68_sub2_38_;
                break;
            }
        }
        if (class68_sub2 == null) {
            class68_sub2 = new Class68_Sub2();
            class68_sub2.anInt2786 = i_31_;
            class68_sub2.anInt2791 = i;
            class68_sub2.anInt2789 = i_35_;
            class68_sub2.anInt2784 = i_32_;
            Class68_Sub13_Sub36.method882(class68_sub2, true);
            Class68_Sub13_Sub31.aClass16_3963.method286(class68_sub2, true);
        }
        class68_sub2.anInt2795 = i_30_;
        class68_sub2.anInt2790 = i_33_;
        class68_sub2.anInt2797 = i_37_;
        class68_sub2.anInt2794 = i_36_;
        class68_sub2.anInt2787 = i_34_;
    }

    public static void method1501(byte i) {
        aRSString_1619 = null;
        anImage1622 = null;
        aRSString_1621 = null;
        if (i < 99)
            method1506(124, 7, 65);
        aRSString_1618 = null;
        aRSString_1611 = null;
    }

    public boolean method1502(int i, byte i_39_, int i_40_, byte[] is,
                              boolean bool) {
        anInt1625++;
        synchronized (aClass124_1616) {
            try {
                int i_41_;
                if (bool) {
                    if (aClass124_1614.method1754((byte) 90)
                            < (long) (i_40_ * 6 + 6))
                        return false;
                    aClass124_1614.method1760((long) (6 * i_40_), 1);
                    aClass124_1614.method1761(0, 6, 0,
                            Class123.aByteArray2125);
                    i_41_
                            = ((Class123.aByteArray2125[5] & 0xff)
                            + (((Class123.aByteArray2125[4] & 0xff) << 33133832)
                            + (0xff0000
                            & Class123.aByteArray2125[3] << 1465956592)));
                    if ((i_41_ ^ 0xffffffff) >= -1
                            || ((long) i_41_
                            > aClass124_1616.method1754((byte) 75) / 520L))
                        return false;
                } else {
                    i_41_
                            = (int) ((519L + aClass124_1616.method1754((byte) 51))
                            / 520L);
                    if ((i_41_ ^ 0xffffffff) == -1)
                        i_41_ = 1;
                }
                Class123.aByteArray2125[1] = (byte) (i >> 1817621192);
                Class123.aByteArray2125[2] = (byte) i;
                Class123.aByteArray2125[5] = (byte) i_41_;
                Class123.aByteArray2125[0] = (byte) (i >> 1069068976);
                Class123.aByteArray2125[3] = (byte) (i_41_ >> -1629510896);
                Class123.aByteArray2125[4] = (byte) (i_41_ >> -551024760);
                aClass124_1614.method1760((long) (6 * i_40_), 1);
                aClass124_1614.method1755(6, 0, 0, Class123.aByteArray2125);
                int i_42_ = -90 % ((40 - i_39_) / 54);
                int i_43_ = 0;
                int i_44_ = 0;
                int i_45_;
                for (/**/; (i ^ 0xffffffff) < (i_43_ ^ 0xffffffff);
                         i_43_ += i_45_) {
                    int i_46_ = 0;
                    if (bool) {
                        aClass124_1616.method1760((long) (i_41_ * 520), 1);
                        try {
                            aClass124_1616.method1761(0, 8, 0,
                                    Class123.aByteArray2125);
                        } catch (java.io.EOFException eofexception) {
                            break;
                        }
                        i_45_ = (((Class123.aByteArray2125[0] & 0xff)
                                << -765727032)
                                - -(Class123.aByteArray2125[1] & 0xff));
                        i_46_ = ((Class123.aByteArray2125[6] & 0xff)
                                + (Class123.aByteArray2125[4] << -2029121968
                                & 0xff0000)
                                - -(0xff00 & (Class123.aByteArray2125[5]
                                << -2088592632)));
                        int i_47_ = Class123.aByteArray2125[7] & 0xff;
                        int i_48_ = (((0xff & Class123.aByteArray2125[2])
                                << 202860296)
                                - -(Class123.aByteArray2125[3] & 0xff));
                        if (i_45_ != i_40_ || i_48_ != i_44_
                                || anInt1612 != i_47_)
                            return false;
                        if (i_46_ < 0
                                || (((long) i_46_ ^ 0xffffffffffffffffL)
                                < (aClass124_1616.method1754((byte) 116) / 520L
                                ^ 0xffffffffffffffffL)))
                            return false;
                    }
                    if (i_46_ == 0) {
                        bool = false;
                        i_46_ = (int) ((519L
                                + aClass124_1616.method1754((byte) 82))
                                / 520L);
                        if ((i_46_ ^ 0xffffffff) == -1)
                            i_46_++;
                        if ((i_46_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff))
                            i_46_++;
                    }
                    Class123.aByteArray2125[0] = (byte) (i_40_ >> 527566472);
                    Class123.aByteArray2125[2] = (byte) (i_44_ >> 1676955592);
                    Class123.aByteArray2125[7] = (byte) anInt1612;
                    Class123.aByteArray2125[1] = (byte) i_40_;
                    if ((i - i_43_ ^ 0xffffffff) >= -513)
                        i_46_ = 0;
                    Class123.aByteArray2125[6] = (byte) i_46_;
                    Class123.aByteArray2125[5] = (byte) (i_46_ >> -11962840);
                    Class123.aByteArray2125[3] = (byte) i_44_;
                    i_45_ = i + -i_43_;
                    Class123.aByteArray2125[4] = (byte) (i_46_ >> -1151944720);
                    i_44_++;
                    if (i_45_ > 512)
                        i_45_ = 512;
                    aClass124_1616.method1760((long) (i_41_ * 520), 1);
                    aClass124_1616.method1755(8, 0, 0,
                            Class123.aByteArray2125);
                    i_41_ = i_46_;
                    aClass124_1616.method1755(i_45_, 0, i_43_, is);
                }
                return true;
            } catch (java.io.IOException ioexception) {
                return false;
            }
        }
    }

    public boolean method1503(byte[] is, int i, int i_49_, byte i_50_) {
        anInt1624++;
        synchronized (aClass124_1616) {
            if ((i_49_ ^ 0xffffffff) > -1 || anInt1617 < i_49_)
                throw new IllegalArgumentException();
            boolean bool = method1502(i_49_, (byte) 123, i, is, true);
            if (!bool)
                bool = method1502(i_49_, (byte) -109, i, is, false);
            int i_51_ = -116 % ((i_50_ - -61) / 47);
            return bool;
        }
    }

    public static void method1504
            (int i, int i_52_, int i_53_, int i_54_, int i_55_, byte[][][] is,
             int[] is_56_, int[] is_57_, int[] is_58_, int[] is_59_, int[] is_60_,
             int i_61_, byte i_62_, int i_63_, int i_64_) {
        if (i < 0)
            i = 0;
        else if (i >= Applet_Sub1.anInt7 * 128)
            i = Applet_Sub1.anInt7 * 128 - 1;
        if (i_53_ < 0)
            i_53_ = 0;
        else if (i_53_ >= Class97.anInt1714 * 128)
            i_53_ = Class97.anInt1714 * 128 - 1;
        Class13_Sub2.anInt2651 = Class62.anIntArray1155[i_54_];
        Class66.anInt1205 = Class62.anIntArray1167[i_54_];
        Class128.anInt2220 = Class62.anIntArray1155[i_55_];
        Class16.anInt278 = Class62.anIntArray1167[i_55_];
        Class25.anInt518 = i;
        Class68_Sub17.anInt3033 = i_52_;
        Class68_Sub20_Sub12.anInt4355 = i_53_;
        Class68_Sub20_Sub10.anInt4319 = i / 128;
        Class68_Sub26.anInt3186 = i_53_ / 128;
        Class69.anInt1239
                = Class68_Sub20_Sub10.anInt4319 - Class68_Sub20_Sub14.anInt4384;
        if (Class69.anInt1239 < 0)
            Class69.anInt1239 = 0;
        Class85.anInt1557
                = Class68_Sub26.anInt3186 - Class68_Sub20_Sub14.anInt4384;
        if (Class85.anInt1557 < 0)
            Class85.anInt1557 = 0;
        Class30.anInt549
                = Class68_Sub20_Sub10.anInt4319 + Class68_Sub20_Sub14.anInt4384;
        if (Class30.anInt549 > Applet_Sub1.anInt7)
            Class30.anInt549 = Applet_Sub1.anInt7;
        ISAACRandomGen.anInt1493
                = Class68_Sub26.anInt3186 + Class68_Sub20_Sub14.anInt4384;
        if (ISAACRandomGen.anInt1493 > Class97.anInt1714)
            ISAACRandomGen.anInt1493 = Class97.anInt1714;
        int i_65_ = 3500;
        for (int i_66_ = 0;
             i_66_ < (Class68_Sub20_Sub14.anInt4384
                     + Class68_Sub20_Sub14.anInt4384 + 2);
             i_66_++) {
            for (int i_67_ = 0;
                 i_67_ < (Class68_Sub20_Sub14.anInt4384
                         + Class68_Sub20_Sub14.anInt4384 + 2);
                 i_67_++) {
                int i_68_ = ((i_66_ - Class68_Sub20_Sub14.anInt4384 << 7)
                        - (Class25.anInt518 & 0x7f));
                int i_69_ = ((i_67_ - Class68_Sub20_Sub14.anInt4384 << 7)
                        - (Class68_Sub20_Sub12.anInt4355 & 0x7f));
                int i_70_ = (Class68_Sub20_Sub10.anInt4319
                        - Class68_Sub20_Sub14.anInt4384 + i_66_);
                int i_71_ = (Class68_Sub26.anInt3186
                        - Class68_Sub20_Sub14.anInt4384 + i_67_);
                if (i_70_ >= 0 && i_71_ >= 0 && i_70_ < Applet_Sub1.anInt7
                        && i_71_ < Class97.anInt1714) {
                    int i_72_;
                    if (Class68_Sub13_Sub14.anIntArrayArrayArray3671 != null)
                        i_72_
                                = (Class68_Sub13_Sub14.anIntArrayArrayArray3671[0]
                                [i_70_][i_71_]) - Class68_Sub17.anInt3033 + 128;
                    else
                        i_72_ = (Class74.anIntArrayArrayArray1335[0][i_70_]
                                [i_71_]) - Class68_Sub17.anInt3033 + 128;
                    int i_73_
                            = (Class74.anIntArrayArrayArray1335[3][i_70_][i_71_]
                            - Class68_Sub17.anInt3033 - 1000);
                    Class68_Sub13_Sub18.aBooleanArrayArray3738[i_66_][i_67_]
                            = Class68_Sub20_Sub12.method1151(i_68_, i_73_, i_72_,
                            i_69_, i_65_);
                } else
                    Class68_Sub13_Sub18.aBooleanArrayArray3738[i_66_][i_67_]
                            = false;
            }
        }
        for (int i_74_ = 0;
             i_74_ < (Class68_Sub20_Sub14.anInt4384
                     + Class68_Sub20_Sub14.anInt4384 + 1);
             i_74_++) {
            for (int i_75_ = 0;
                 i_75_ < (Class68_Sub20_Sub14.anInt4384
                         + Class68_Sub20_Sub14.anInt4384 + 1);
                 i_75_++)
                Class68_Sub9.aBooleanArrayArray2887[i_74_][i_75_]
                        = (Class68_Sub13_Sub18.aBooleanArrayArray3738[i_74_][i_75_]
                        || (Class68_Sub13_Sub18.aBooleanArrayArray3738
                        [i_74_ + 1][i_75_])
                        || (Class68_Sub13_Sub18.aBooleanArrayArray3738[i_74_]
                        [i_75_ + 1])
                        || (Class68_Sub13_Sub18.aBooleanArrayArray3738
                        [i_74_ + 1][i_75_ + 1]));
        }
        Class68_Sub13_Sub10.anIntArray3591 = is_56_;
        Class68_Sub22.anIntArray3137 = is_57_;
        Class55.anIntArray2042 = is_58_;
        Class68_Sub16.anIntArray3029 = is_59_;
        Class53.anIntArray1020 = is_60_;
        Class68_Sub20_Sub8.method1095();
        Class20.method324(i, i_52_, i_53_, is, i_61_, i_62_, i_63_, i_64_);
    }

    public static void method1505(byte i) {
        if (i >= -1)
            method1499(125, 31, 8, true, -92, -128);
        for (int i_76_ = 0; i_76_ < Class68_Sub20_Sub16.anInt4418; i_76_++) {
            int i_77_ = PacketStream.anIntArray4110[i_76_];
            Class1_Sub6_Sub1 class1_sub6_sub1 = Class102.aClass1_Sub6_Sub1Array1746[i_77_];
            int i_78_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            if ((i_78_ & 0x10) != 0) {
                class1_sub6_sub1.anInt2525 = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
                if (class1_sub6_sub1.anInt2525 == 65535)
                    class1_sub6_sub1.anInt2525 = -1;
            }
            if ((i_78_ & 0x8) != 0) {
                if (class1_sub6_sub1.aClass80_3395.method1444(0))
                    Class68_Sub13_Sub4.method717(class1_sub6_sub1, 2);
                class1_sub6_sub1.aClass80_3395 = (Class68_Sub13_Sub11.method753(Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(119), 18));
                class1_sub6_sub1.anInt2530 = class1_sub6_sub1.aClass80_3395.anInt1409;
                class1_sub6_sub1.anInt2565 = class1_sub6_sub1.aClass80_3395.anInt1467;
                class1_sub6_sub1.anInt2574 = class1_sub6_sub1.aClass80_3395.anInt1447;
                class1_sub6_sub1.anInt2543 = class1_sub6_sub1.aClass80_3395.anInt1440;
                class1_sub6_sub1.anInt2532 = class1_sub6_sub1.aClass80_3395.anInt1410;
                class1_sub6_sub1.anInt2564 = class1_sub6_sub1.aClass80_3395.anInt1421;
                class1_sub6_sub1.anInt2581 = class1_sub6_sub1.aClass80_3395.anInt1456;
                class1_sub6_sub1.anInt2544 = class1_sub6_sub1.aClass80_3395.anInt1451;
                class1_sub6_sub1.anInt2563 = class1_sub6_sub1.aClass80_3395.anInt1415;
                if (class1_sub6_sub1.aClass80_3395.method1444(0))
                    Class52.method543(19395, class1_sub6_sub1.anIntArray2570[0], class1_sub6_sub1, null, 0, class1_sub6_sub1.anIntArray2523[0], GameSocket.anInt1149, null);
            }
            if ((0x40 & i_78_) != 0) {
                class1_sub6_sub1.aRSString_2576 = Class68_Sub13_Sub8.inStream.readString(127);
                class1_sub6_sub1.anInt2569 = 100;
            }
            if ((i_78_ & 0x1) != 0) {
                int i_79_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
                if (i_79_ == 65535)
                    i_79_ = -1;
                int i_80_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                Class101.method1625(0, i_79_, class1_sub6_sub1, i_80_);
            }
            if ((i_78_ & 0x2) != 0) {
                class1_sub6_sub1.anInt2552 = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
                int i_81_ = Class68_Sub13_Sub8.inStream.readDWord_v2(false);
                class1_sub6_sub1.anInt2541 = (i_81_ & 0xffff) + Class68_Sub3.anInt2812;
                class1_sub6_sub1.anInt2586 = 0;
                if (class1_sub6_sub1.anInt2552 == 65535)
                    class1_sub6_sub1.anInt2552 = -1;
                class1_sub6_sub1.anInt2560 = i_81_ >> 1453284944;
                class1_sub6_sub1.anInt2578 = 0;
                if (Class68_Sub3.anInt2812 < class1_sub6_sub1.anInt2541)
                    class1_sub6_sub1.anInt2578 = -1;
            }
            if ((0x20 & i_78_) != 0) {
                int i_82_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                int i_83_ = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
                class1_sub6_sub1.method149(i_82_, false, Class68_Sub3.anInt2812, i_83_);
            }
            if ((i_78_ & 0x80) != 0) {
                class1_sub6_sub1.anInt2526 = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
                class1_sub6_sub1.anInt2572 = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            }
            if ((0x4 & i_78_) != 0) {
                int i_84_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                int i_85_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                class1_sub6_sub1.method149(i_84_, false, Class68_Sub3.anInt2812, i_85_);
                class1_sub6_sub1.anInt2534 = Class68_Sub3.anInt2812 + 300;
                class1_sub6_sub1.anInt2547 = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            }
        }
        anInt1623++;
    }

    public String toString() {
        anInt1628++;
        return "Cache:" + anInt1612;
    }

    public static long method1506(int i, int i_86_, int i_87_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_86_][i_87_];
        if (class68_sub1 == null || class68_sub1.aClass47_2777 == null)
            return 0L;
        return class68_sub1.aClass47_2777.aLong943;
    }

    public byte[] method1507(int i, boolean bool) {
        anInt1627++;
        synchronized (aClass124_1616) {
            try {
                if (aClass124_1614.method1754((byte) 101) < (long) (6 + i * 6))
                    return null;
                aClass124_1614.method1760((long) (i * 6), 1);
                aClass124_1614.method1761(0, 6, 0, Class123.aByteArray2125);
                int i_88_
                        = ((Class123.aByteArray2125[1] << -503326744 & 0xff00)
                        + (((Class123.aByteArray2125[0] & 0xff) << -1643323344)
                        - -(0xff & Class123.aByteArray2125[2])));
                int i_89_
                        = ((Class123.aByteArray2125[5] & 0xff)
                        + (Class123.aByteArray2125[3] << -1717736080 & 0xff0000)
                        + ((Class123.aByteArray2125[4] & 0xff) << 1834419496));
                if (bool != true)
                    return null;
                if ((i_88_ ^ 0xffffffff) > -1 || anInt1617 < i_88_)
                    return null;
                if (i_89_ <= 0
                        || ((aClass124_1616.method1754((byte) 104) / 520L
                        ^ 0xffffffffffffffffL)
                        > ((long) i_89_ ^ 0xffffffffffffffffL)))
                    return null;
                byte[] is = new byte[i_88_];
                int i_90_ = 0;
                int i_91_ = 0;
                while (i_88_ > i_90_) {
                    if (i_89_ == 0)
                        return null;
                    aClass124_1616.method1760((long) (520 * i_89_), 1);
                    int i_92_ = i_88_ + -i_90_;
                    if (i_92_ > 512)
                        i_92_ = 512;
                    aClass124_1616.method1761(0, i_92_ + 8, 0,
                            Class123.aByteArray2125);
                    int i_93_
                            = ((0xff & Class123.aByteArray2125[6])
                            + ((0xff0000
                            & Class123.aByteArray2125[4] << -600163600)
                            - -(0xff00 & (Class123.aByteArray2125[5]
                            << -554764568))));
                    int i_94_
                            = (((Class123.aByteArray2125[0] & 0xff) << -974042584)
                            - -(0xff & Class123.aByteArray2125[1]));
                    int i_95_ = ((0xff & Class123.aByteArray2125[3])
                            + ((0xff & Class123.aByteArray2125[2])
                            << -1322389528));
                    int i_96_ = 0xff & Class123.aByteArray2125[7];
                    if (i_94_ != i || i_95_ != i_91_
                            || (anInt1612 ^ 0xffffffff) != (i_96_ ^ 0xffffffff))
                        return null;
                    if (i_93_ < 0
                            || ((long) i_93_
                            > aClass124_1616.method1754((byte) 67) / 520L))
                        return null;
                    i_89_ = i_93_;
                    for (int i_97_ = 0;
                         (i_92_ ^ 0xffffffff) < (i_97_ ^ 0xffffffff); i_97_++)
                        is[i_90_++] = Class123.aByteArray2125[i_97_ - -8];
                    i_91_++;
                }
                return is;
            } catch (java.io.IOException ioexception) {
                return null;
            }
        }
    }

    public static byte[] method1508(byte[] is, boolean bool) {
        int i = is.length;
        anInt1613++;
        byte[] is_98_ = new byte[i];
        if (bool != false)
            method1508(null, true);
        Class39.method465(is, 0, is_98_, 0, i);
        return is_98_;
    }

    public Unknown(int i, Class124 class124, Class124 class124_99_,
                   int i_100_) {
        aClass124_1614 = null;
        try {
            anInt1612 = i;
            anInt1617 = i_100_;
            aClass124_1614 = class124_99_;
            aClass124_1616 = class124;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("p.<init>(" + i + ','
                            + (class124 != null ? "{...}" : "null")
                            + ','
                            + (class124_99_ != null ? "{...}"
                            : "null")
                            + ',' + i_100_ + ')'));
        }
    }

    static {
        aByte1615 = (byte) 0;
        aRSString_1619 = RSString.newRsString("(U3");
        aRSString_1611
                = RSString.newRsString("m-Ochte mit Ihnen handeln)3");
        aRSString_1621 = RSString.newRsString("<br>(X");
    }
}
