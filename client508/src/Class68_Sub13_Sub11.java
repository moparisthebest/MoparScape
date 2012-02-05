/* Class68_Sub13_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub11 extends Class68_Sub13 {
    public int anInt3598;
    public static int anInt3599;
    public int anInt3600;
    public static int anInt3601;
    public static int anInt3602;
    public static long key;
    public static int anInt3604;
    public static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array3605;
    public int anInt3606;
    public static int anInt3607;
    public int anInt3608 = 2048;
    public int anInt3609;
    public static int anInt3610;
    public static RSString aRSString_3611;
    public static int anInt3612;
    public int anInt3613 = 8192;
    public static RSString aRSString_3614 = RSString.newRsString("K");
    public static int anInt3615;
    public static short aShort3616;
    public static int anInt3617;
    public static int anInt3618;
    public static volatile long aLong3619;
    public static int anInt3620;
    public static int anInt3621;
    public static byte[][][] aByteArrayArrayArray3622;
    public static int anInt3623;
    public static int anInt3624;
    public int anInt3625;
    public static short[][][] aShortArrayArrayArray3626;
    public static RSString aRSString_3627;

    public boolean method745(int i, byte i_0_, int i_1_) {
        anInt3607++;
        int i_2_ = 81 % ((50 - i_0_) / 41);
        int i_3_ = (-i + i_1_) * anInt3606 >> 918544460;
        int i_4_ = Class78.anIntArray1394[0xff & 255 * i_3_ >> 500460556];
        i_4_ = (i_4_ << -1081103284) / anInt3606;
        i_4_ = (i_4_ << -1260607892) / anInt3613;
        i_4_ = i_4_ * anInt3598 >> 1208641004;
        if (i - -i_1_ >= i_4_
                || (-i_4_ ^ 0xffffffff) <= (i + i_1_ ^ 0xffffffff))
            return false;
        return true;
    }

    public static void method746(int i, Stream class68_sub14) {
        if (i > 65) {
            while ((class68_sub14.buffer.length ^ 0xffffffff)
                    < (class68_sub14.currentOffset ^ 0xffffffff)) {
                boolean bool = false;
                int i_5_ = 0;
                int i_6_ = 0;
                if ((class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2) {
                    bool = true;
                    i_5_ = class68_sub14.readUnsignedByte(-6677);
                    i_6_ = class68_sub14.readUnsignedByte(-6677);
                }
                int i_7_ = class68_sub14.readUnsignedByte(-6677);
                int i_8_ = class68_sub14.readUnsignedByte(-6677);
                int i_9_ = -Class70.anInt1273 + i_7_ * 64;
                int i_10_ = (Class68_Sub1.anInt2760 + -(64 * i_8_)
                        + (-1 + Class103.anInt1768));
                if ((i_9_ ^ 0xffffffff) > -1 || (i_10_ + -63 ^ 0xffffffff) > -1
                        || Class68_Sub6.anInt2846 <= 63 + i_9_
                        || Class103.anInt1768 <= i_10_) {
                    for (int i_11_ = 0;
                         ((i_11_ ^ 0xffffffff)
                                 > ((bool ? 64 : 4096) ^ 0xffffffff));
                         i_11_++) {
                        byte i_12_ = class68_sub14.method955(3390);
                        if (i_12_ != 0)
                            class68_sub14.currentOffset++;
                    }
                } else {
                    int i_13_ = i_9_ >> 2087423014;
                    int i_14_ = i_10_ >> -1700832474;
                    for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -65; i_15_++) {
                        for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -65;
                             i_16_++) {
                            if (!bool
                                    || ((i_15_ ^ 0xffffffff) <= (8 * i_5_
                                    ^ 0xffffffff)
                                    && 8 + i_5_ * 8 > i_15_
                                    && ((8 * i_6_ ^ 0xffffffff)
                                    >= (i_16_ ^ 0xffffffff))
                                    && i_16_ < 8 * i_6_ + 8)) {
                                byte i_17_ = class68_sub14.method955(3390);
                                if ((i_17_ ^ 0xffffffff) != -1) {
                                    if ((Class12.aByteArrayArrayArray212[i_13_]
                                            [i_14_])
                                            == null)
                                        Class12.aByteArrayArrayArray212
                                                [i_13_][i_14_]
                                                = new byte[4096];
                                    Class12.aByteArrayArrayArray212[i_13_]
                                            [i_14_]
                                            [(63 + -i_16_ << -348620474) - -i_15_]
                                            = i_17_;
                                    byte i_18_ = class68_sub14.method955(3390);
                                    if ((Class68_Sub13_Sub16
                                            .aByteArrayArrayArray3710[i_13_]
                                            [i_14_])
                                            == null)
                                        Class68_Sub13_Sub16
                                                .aByteArrayArrayArray3710[i_13_]
                                                [i_14_]
                                                = new byte[4096];
                                    Class68_Sub13_Sub16
                                            .aByteArrayArrayArray3710[i_13_][i_14_]
                                            [(63 + -i_16_ << 1570227686) - -i_15_]
                                            = i_18_;
                                }
                            }
                        }
                    }
                }
            }
            anInt3610++;
        }
    }

    public static void method747(RSString class100, byte i) {
        anInt3624++;
        Class26.aRSString_521 = class100;
        if (Class75_Sub1_Sub1.signlink.anApplet1042 != null) {
            try {
                RSString class100_19_
                        = (Class68_Sub13_Sub7.aRSString_3551.method1610
                        (Class75_Sub1_Sub1.signlink.anApplet1042,
                                (byte) -31));
                RSString class100_20_
                        = (Class68_Sub13_Sub16.aRSString_3694.method1610
                        (Class75_Sub1_Sub1.signlink.anApplet1042,
                                (byte) -31));
                RSString class100_21_
                        = (Class68_Sub20_Sub13_Sub2.method1166
                        (2,
                                new RSString[]{class100_19_,
                                        Class68_Sub28_Sub2.aRSString_4548,
                                        class100, Class75_Sub3.aRSString_3322,
                                        class100_20_}));
                if (class100.method1590((byte) -118) != 0)
                    class100_21_
                            = (Class68_Sub20_Sub13_Sub2.method1166
                            (2,
                                    (new RSString[]
                                            {class100_21_, Class75_Sub3.aRSString_3320,
                                                    Class51.method538(-118,
                                                            (94608000000L
                                                                    + Class36.method438(17161))),
                                                    Class68_Sub27.aRSString_3215,
                                                    PlayerDefinition.method1765(94608000L, -96)})));
                else
                    class100_21_
                            = (Class68_Sub20_Sub13_Sub2.method1166
                            (2, new RSString[]{class100_21_,
                                    Applet_Sub1.aRSString_33}));
                if (i > 118)
                    Class68_Sub20_Sub13_Sub2.method1166
                            (2,
                                    new RSString[]{Class49.aRSString_963, class100_21_,
                                            Class68_Sub20.aRSString_3091})
                            .method1599
                                    ((byte) -45,
                                            Class75_Sub1_Sub1.signlink.anApplet1042);
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    public static void method748(int i, int i_22_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[0][i][i_22_];
        for (int i_23_ = 0; i_23_ < 3; i_23_++) {
            Class68_Sub1 class68_sub1_24_
                    = (Class22.aClass68_Sub1ArrayArrayArray484[i_23_][i][i_22_]
                    = (Class22.aClass68_Sub1ArrayArrayArray484[i_23_ + 1][i]
                    [i_22_]));
            if (class68_sub1_24_ != null) {
                class68_sub1_24_.anInt2767--;
                for (int i_25_ = 0; i_25_ < class68_sub1_24_.anInt2771;
                     i_25_++) {
                    Class69 class69
                            = class68_sub1_24_.aClass69Array2772[i_25_];
                    if ((class69.aLong1243 >> 29 & 0x3L) == 2L
                            && class69.anInt1254 == i
                            && class69.anInt1253 == i_22_)
                        class69.anInt1249--;
                }
            }
        }
        if (Class22.aClass68_Sub1ArrayArrayArray484[0][i][i_22_] == null)
            Class22.aClass68_Sub1ArrayArrayArray484[0][i][i_22_]
                    = new Class68_Sub1(0, i, i_22_);
        Class22.aClass68_Sub1ArrayArrayArray484[0][i][i_22_].aClass68_Sub1_2780
                = class68_sub1;
        Class22.aClass68_Sub1ArrayArrayArray484[3][i][i_22_] = null;
    }

    public void method700(Stream class68_sub14, int i, int i_26_) {
        anInt3617++;
        if (i_26_ != -1)
            anInt3606 = -119;
        int i_27_ = i;
        while_64_:
        do {
            while_63_:
            do {
                while_62_:
                do {
                    while_61_:
                    do {
                        while_60_:
                        do {
                            do {
                                if (i_27_ != 0) {
                                    if (i_27_ != 1) {
                                        if ((i_27_ ^ 0xffffffff) != -3) {
                                            if ((i_27_ ^ 0xffffffff) != -4) {
                                                if ((i_27_ ^ 0xffffffff)
                                                        != -5) {
                                                    if (i_27_ != 5) {
                                                        if (i_27_ == 6)
                                                            break while_63_;
                                                        break while_64_;
                                                    }
                                                } else
                                                    break while_61_;
                                                break while_62_;
                                            }
                                        } else
                                            break;
                                        break while_60_;
                                    }
                                } else {
                                    anInt3608
                                            = class68_sub14.readUnsignedWord(1355769544);
                                    return;
                                }
                                anInt3600
                                        = class68_sub14.readUnsignedWord(1355769544);
                                return;
                            } while (false);
                            anInt3625 = class68_sub14.readUnsignedWord(1355769544);
                            return;
                        } while (false);
                        anInt3609 = class68_sub14.readUnsignedWord(1355769544);
                        return;
                    } while (false);
                    anInt3606 = class68_sub14.readUnsignedWord(1355769544);
                    return;
                } while (false);
                anInt3598 = class68_sub14.readUnsignedWord(i_26_ + 1355769545);
                return;
            } while (false);
            anInt3613 = class68_sub14.readUnsignedWord(i_26_ + 1355769545);
        } while (false);
    }

    public Class68_Sub13_Sub11() {
        super(0, true);
        anInt3609 = 2048;
        anInt3606 = 12288;
        anInt3600 = 0;
        anInt3598 = 4096;
        anInt3625 = 0;
    }

    public static void method749(byte i) {
        if (i <= 14)
            method753(-56, 26);
        int i_28_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 8);
        if (client.anInt2382 > i_28_) {
            for (int i_29_ = i_28_; i_29_ < client.anInt2382; i_29_++)
                Class68_Sub13_Sub14.anIntArray3666[Class75_Sub3_Sub1.anInt4595++] = Class85.anIntArray1563[i_29_];
        }
        anInt3623++;
        if (i_28_ > client.anInt2382)
            throw new RuntimeException("gppov1");
        client.anInt2382 = 0;
        for (int i_30_ = 0; (i_28_ ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++) {
            int i_31_ = Class85.anIntArray1563[i_30_];
            Class1_Sub6_Sub2 class1_sub6_sub2 = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_31_];
            int i_32_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
            if (i_32_ == 0) {
                Class85.anIntArray1563[client.anInt2382++] = i_31_;
                class1_sub6_sub2.anInt2575 = Class68_Sub3.anInt2812;
            } else {
                int i_33_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 2);
                if (i_33_ == 0) {
                    Class85.anIntArray1563[client.anInt2382++] = i_31_;
                    class1_sub6_sub2.anInt2575 = Class68_Sub3.anInt2812;
                    PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = i_31_;
                } else if (i_33_ == 1) {
                    Class85.anIntArray1563[client.anInt2382++] = i_31_;
                    class1_sub6_sub2.anInt2575 = Class68_Sub3.anInt2812;
                    int i_34_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 3);
                    class1_sub6_sub2.method151(false, i_34_, (byte) 21);
                    int i_35_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
                    if (i_35_ == 1)
                        PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = i_31_;
                } else if (i_33_ == 2) {
                    Class85.anIntArray1563[client.anInt2382++] = i_31_;
                    class1_sub6_sub2.anInt2575 = Class68_Sub3.anInt2812;
                    int i_36_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 3);
                    class1_sub6_sub2.method151(true, i_36_, (byte) 21);
                    int i_37_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 3);
                    class1_sub6_sub2.method151(true, i_37_, (byte) 21);
                    int i_38_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
                    if ((i_38_ ^ 0xffffffff) == -2)
                        PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = i_31_;
                } else if ((i_33_ ^ 0xffffffff) == -4)
                    Class68_Sub13_Sub14.anIntArray3666[Class75_Sub3_Sub1.anInt4595++] = i_31_;
            }
        }
    }

    public void method690(byte i) {
        Class68_Sub10.method683((byte) -128);
        if (i <= -22)
            anInt3615++;
    }

    public boolean method750(int i, byte i_39_, int i_40_) {
        anInt3612++;
        int i_41_ = (i_40_ + i) * anInt3606 >> -1226454516;
        if (i_39_ <= 13)
            anInt3625 = 10;
        int i_42_
                = Class78.anIntArray1394[(255 * i_41_ & 0xfffa8) >> 2102241036];
        i_42_ = (i_42_ << 262318060) / anInt3606;
        i_42_ = (i_42_ << -229147252) / anInt3613;
        i_42_ = anInt3598 * i_42_ >> 64103340;
        if (i_42_ <= -i + i_40_ || i_40_ + -i <= -i_42_)
            return false;
        return true;
    }

    public static void method751(byte i) {
        aRSString_3614 = null;
        aByteArrayArrayArray3622 = null;
        aShortArrayArrayArray3626 = null;
        aClass68_Sub20_Sub10Array3605 = null;
        aRSString_3627 = null;
        aRSString_3611 = null;
        if (i != -66)
            anInt3620 = -85;
    }

    public int[] method698(byte i, int i_43_) {
        anInt3599++;
        if (i != -61)
            aRSString_3611 = null;
        int[] is = aClass115_2936.method1697(false, i_43_);
        if (aClass115_2936.aBoolean1957) {
            int i_44_ = -2048 + Class13_Sub3.anIntArray2672[i_43_];
            for (int i_45_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_45_ ^ 0xffffffff)); i_45_++) {
                int i_46_ = -2048 + Class68_Sub13_Sub3.anIntArray3479[i_45_];
                int i_47_ = anInt3600 + i_44_;
                i_47_ = (i_47_ ^ 0xffffffff) <= 2047 ? i_47_ : 4096 + i_47_;
                i_47_ = i_47_ > 2048 ? -4096 + i_47_ : i_47_;
                int i_48_ = anInt3608 + i_46_;
                i_48_ = i_48_ >= -2048 ? i_48_ : i_48_ + 4096;
                i_48_ = i_48_ > 2048 ? i_48_ - 4096 : i_48_;
                int i_49_ = anInt3625 + i_46_;
                int i_50_ = anInt3609 + i_44_;
                i_49_ = i_49_ >= -2048 ? i_49_ : 4096 + i_49_;
                i_49_ = (i_49_ ^ 0xffffffff) < -2049 ? -4096 + i_49_ : i_49_;
                i_50_ = (i_50_ ^ 0xffffffff) <= 2047 ? i_50_ : i_50_ - -4096;
                i_50_ = i_50_ > 2048 ? -4096 + i_50_ : i_50_;
                is[i_45_]
                        = (!method745(i_48_, (byte) 118, i_47_)
                        && !method750(i_49_, (byte) 35, i_50_)) ? 0 : 4096;
            }
        }
        return is;
    }

    public static Class48 method752(byte i, int i_51_) {
        anInt3604++;
        Class48 class48 = (Class48) Class68_Sub13_Sub8.aClass98_3561
                .method1570(i + 14285, (long) i_51_);
        if (class48 != null)
            return class48;
        byte[] is = (Class66.aClass21_1203.method338
                (GameException.method1795(i_51_, 72), i ^ 0x51,
                        Class68_Sub20_Sub8.method1094(i_51_, 654593194)));
        class48 = new Class48();
        if (is != null)
            class48.method517(126, new Stream(is));
        if (i != 81)
            return null;
        Class68_Sub13_Sub8.aClass98_3561.method1568(class48, 123,
                (long) i_51_);
        return class48;
    }

    public static Class80 method753(int i, int i_52_) {
        anInt3601++;
        Class80 class80
                = (Class80) Class93.aClass98_1662.method1570(14366, (long) i);
        if (class80 != null)
            return class80;
        byte[] is
                = Class1_Sub1.aClass21_2427.method338(Class90.method1515(i, 522),
                0,
                Class1_Sub6.method148(i,
                        -95));
        class80 = new Class80();
        class80.anInt1458 = i;
        if (is != null)
            class80.method1443(new Stream(is), (byte) -53);
        int i_53_ = 100 / ((-43 - i_52_) / 50);
        class80.method1452(24381);
        Class93.aClass98_1662.method1568(class80, 104, (long) i);
        return class80;
    }

    static {
        aRSString_3611 = aRSString_3614;
        aLong3619 = 0L;
        key = 0L;
        aShort3616 = (short) 256;
        anInt3621 = 0;
        anInt3618 = 0;
        anInt3602 = 1;
        aRSString_3627 = aRSString_3614;
    }
}
