/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class103 {
    public static int anInt1759;
    public static int anInt1760;
    public int[] anIntArray1761;
    public static volatile boolean aBoolean1762;
    public static Class45[] aClass45Array1763;
    public byte[] aByteArray1764;
    public int[] anIntArray1765;
    public static int anInt1766;
    public static int[] anIntArray1767 = new int[2000];
    public static int anInt1768;
    public static RSString aRSString_1769
            = RSString.newRsString("<col=c0ff00>");
    public static int anInt1770;
    public static RSString aRSString_1771;
    public static int anInt1772;
    public static int port;
    public static int anInt1774;

    public int method1632(int i, byte[] is, byte[] is_0_, int i_1_, int i_2_,
                          int i_3_) {
        try {
            if (i_1_ != -2147483648)
                anInt1768 = -125;
            i += i_3_;
            anInt1760++;
            int i_4_ = 0;
            int i_5_ = i_2_ << 2068778659;
            for (/**/; (i ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
                int i_6_ = 0xff & is_0_[i_3_];
                int i_7_ = anIntArray1761[i_6_];
                int i_8_ = aByteArray1764[i_6_];
                if (i_8_ == 0)
                    throw new RuntimeException("No codeword for data value "
                            + i_6_);
                int i_9_ = i_5_ & 0x7;
                i_4_ &= -i_9_ >> -28910241;
                int i_10_ = i_5_ >> 1396436163;
                i_5_ += i_8_;
                int i_11_ = i_10_ + (i_9_ - -i_8_ + -1 >> -170448765);
                i_9_ += 24;
                is[i_10_]
                        = (byte) (i_4_ = Class70.method1335(i_4_, i_7_ >>> i_9_));
                if (i_10_ < i_11_) {
                    i_10_++;
                    i_9_ -= 8;
                    is[i_10_] = (byte) (i_4_ = i_7_ >>> i_9_);
                    if ((i_10_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff)) {
                        i_9_ -= 8;
                        i_10_++;
                        is[i_10_] = (byte) (i_4_ = i_7_ >>> i_9_);
                        if ((i_11_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff)) {
                            i_9_ -= 8;
                            i_10_++;
                            is[i_10_] = (byte) (i_4_ = i_7_ >>> i_9_);
                            if (i_10_ < i_11_) {
                                i_9_ -= 8;
                                i_10_++;
                                is[i_10_] = (byte) (i_4_ = i_7_ << -i_9_);
                            }
                        }
                    }
                }
            }
            return -i_2_ + (i_5_ - -7 >> 2144411171);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("sb.C(" + i + ','
                            + (is != null ? "{...}" : "null") + ','
                            + (is_0_ != null ? "{...}" : "null")
                            + ',' + i_1_ + ',' + i_2_ + ',' + i_3_
                            + ')'));
        }
    }

    public static void method1633(int i, int i_12_, int i_13_, byte i_14_,
                                  Class80 class80) {
        anInt1774++;
        if (Class68_Sub13_Sub21.anInt3803 < 400) {
            if (class80.anIntArray1431 != null)
                class80 = class80.method1447(-94);
            if (class80 != null && class80.aBoolean1433) {
                RSString class100 = class80.aRSString_1466;
                int i_15_ = 3 / ((50 - i_14_) / 35);
                if (class80.anInt1444 != 0)
                    class100 = (Class68_Sub20_Sub13_Sub2.method1166
                            (2, (new RSString[]
                                    {class100,
                                            (Class68_Sub20_Sub8.method1089
                                                    (class80.anInt1444, true,
                                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                                    .anInt3415))),
                                            Class68_Sub19.aRSString_3066,
                                            Class58.aRSString_1095,
                                            Class68_Sub13_Sub24
                                                    .method816(class80.anInt1444, 0),
                                            Class68_Sub26.aRSString_3195})));
                if (Class68_Sub13_Sub37.anInt4062 == 1) {
                    Class68_Sub3.method652(i_13_, i_12_, (byte) -102,
                            (Class68_Sub20_Sub13_Sub2.method1166
                                    (2, (new RSString[]
                                            {Class44.aRSString_743,
                                                    GameSocket.aRSString_1146,
                                                    class100}))),
                            (short) 15, Class76.aRSString_1347,
                            (long) i);
                    PacketParser.anInt1868++;
                } else if (Class21_Sub1.aBoolean2705) {
                    if ((Class33.anInt589 & 0x2) == 2) {
                        Class75_Sub1_Sub1.anInt4584++;
                        Class68_Sub3.method652(i_13_, i_12_, (byte) -70,
                                (Class68_Sub20_Sub13_Sub2
                                        .method1166
                                                (2, (new RSString[]
                                                        {(Class68_Sub13_Sub1
                                                                .aRSString_3452),
                                                                GameSocket.aRSString_1146,
                                                                class100}))),
                                (short) 44,
                                Class7.aRSString_118, (long) i);
                    }
                } else {
                    Class68_Sub1.anInt2762++;
                    RSString[] class100s = class80.aRSStringArray1432;
                    if (Class92.aBoolean1649)
                        class100s
                                = Class75_Sub1.method1387((byte) -117, class100s);
                    if (class100s != null) {
                        for (int i_16_ = 4; (i_16_ ^ 0xffffffff) <= -1;
                             i_16_--) {
                            if (class100s[i_16_] != null
                                    && (Class68_Sub13_Sub34.anInt4008 != 0
                                    || !(class100s[i_16_].method1600
                                    (false, Class29.aRSString_535)))) {
                                Class1_Sub2.anInt2437++;
                                short i_17_ = 0;
                                if ((i_16_ ^ 0xffffffff) == -1)
                                    i_17_ = (short) 12;
                                if (i_16_ == 1)
                                    i_17_ = (short) 29;
                                if (i_16_ == 2)
                                    i_17_ = (short) 48;
                                if ((i_16_ ^ 0xffffffff) == -4)
                                    i_17_ = (short) 21;
                                if (i_16_ == 4)
                                    i_17_ = (short) 11;
                                Class68_Sub3.method652
                                        (i_13_, i_12_, (byte) -91,
                                                (Class68_Sub20_Sub13_Sub2.method1166
                                                        (2, (new RSString[]
                                                                {PacketStream.aRSString_4121,
                                                                        class100}))),
                                                i_17_, class100s[i_16_], (long) i);
                            }
                        }
                    }
                    if (Class68_Sub13_Sub34.anInt4008 == 0
                            && class100s != null) {
                        for (int i_18_ = 4; i_18_ >= 0; i_18_--) {
                            if (class100s[i_18_] != null
                                    && (class100s[i_18_].method1600
                                    (false, Class29.aRSString_535))) {
                                short i_19_ = 0;
                                Class95.anInt1681++;
                                short i_20_ = 0;
                                if (i_18_ == 0)
                                    i_20_ = (short) 12;
                                if (class80.anInt1444
                                        > (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                        .anInt3415))
                                    i_19_ = (short) 2000;
                                if (i_18_ == 1)
                                    i_20_ = (short) 29;
                                if (i_18_ == 2)
                                    i_20_ = (short) 48;
                                if ((i_18_ ^ 0xffffffff) == -4)
                                    i_20_ = (short) 21;
                                if (i_18_ == 4)
                                    i_20_ = (short) 11;
                                if (i_20_ != 0)
                                    i_20_ += i_19_;
                                Class68_Sub3.method652
                                        (i_13_, i_12_, (byte) -86,
                                                (Class68_Sub20_Sub13_Sub2.method1166
                                                        (2, (new RSString[]
                                                                {PacketStream.aRSString_4121,
                                                                        class100}))),
                                                i_20_, class100s[i_18_], (long) i);
                            }
                        }
                    }
                    Class68_Sub3.method652(i_13_, i_12_, (byte) -126,
                            (Class68_Sub20_Sub13_Sub2.method1166
                                    (2, (new RSString[]
                                            {(PacketStream
                                                    .aRSString_4121),
                                                    class100}))),
                            (short) 1002,
                            Class119.aRSString_2086, (long) i);
                }
            }
        }
    }

    public static boolean method1634(Class21renamed class21, int i) {
        if (i != -1)
            method1636(11);
        anInt1770++;
        if (class21.method360(Class68_Sub20_Sub15.anInt4402, 0))
            return true;
        return false;
    }

    public int method1635(byte[] is, int i, int i_21_, int i_22_, int i_23_,
                          byte[] is_24_) {
        try {
            anInt1766++;
            if (i_22_ == 0)
                return 0;
            i_22_ += i_23_;
            int i_25_ = 0;
            if (i != 8)
                method1635(null, -18, 64, 32, 16, null);
            int i_26_ = i_21_;
            for (; ; ) {
                byte i_27_ = is_24_[i_26_];
                if ((i_27_ ^ 0xffffffff) > -1)
                    i_25_ = anIntArray1765[i_25_];
                else
                    i_25_++;
                int i_28_;
                if ((i_28_ = anIntArray1765[i_25_]) < 0) {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if ((i_22_ ^ 0xffffffff) >= (i_23_ ^ 0xffffffff))
                        break;
                    i_25_ = 0;
                }
                if ((i_27_ & 0x40 ^ 0xffffffff) != -1)
                    i_25_ = anIntArray1765[i_25_];
                else
                    i_25_++;
                if (((i_28_ = anIntArray1765[i_25_]) ^ 0xffffffff) > -1) {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if ((i_22_ ^ 0xffffffff) >= (i_23_ ^ 0xffffffff))
                        break;
                    i_25_ = 0;
                }
                if ((0x20 & i_27_) == 0)
                    i_25_++;
                else
                    i_25_ = anIntArray1765[i_25_];
                if ((i_28_ = anIntArray1765[i_25_]) < 0) {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_23_ >= i_22_)
                        break;
                    i_25_ = 0;
                }
                if ((0x10 & i_27_) != 0)
                    i_25_ = anIntArray1765[i_25_];
                else
                    i_25_++;
                if ((i_28_ = anIntArray1765[i_25_]) < 0) {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_22_ <= i_23_)
                        break;
                    i_25_ = 0;
                }
                if ((i_27_ & 0x8 ^ 0xffffffff) != -1)
                    i_25_ = anIntArray1765[i_25_];
                else
                    i_25_++;
                if (((i_28_ = anIntArray1765[i_25_]) ^ 0xffffffff) > -1) {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_23_ >= i_22_)
                        break;
                    i_25_ = 0;
                }
                if ((i_27_ & 0x4) == 0)
                    i_25_++;
                else
                    i_25_ = anIntArray1765[i_25_];
                if (((i_28_ = anIntArray1765[i_25_]) ^ 0xffffffff) > -1) {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_23_ >= i_22_)
                        break;
                    i_25_ = 0;
                }
                if ((0x2 & i_27_) != 0)
                    i_25_ = anIntArray1765[i_25_];
                else
                    i_25_++;
                if (((i_28_ = anIntArray1765[i_25_]) ^ 0xffffffff) > -1) {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_22_ <= i_23_)
                        break;
                    i_25_ = 0;
                }
                if ((i_27_ & 0x1 ^ 0xffffffff) != -1)
                    i_25_ = anIntArray1765[i_25_];
                else
                    i_25_++;
                if ((i_28_ = anIntArray1765[i_25_]) < 0) {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if ((i_23_ ^ 0xffffffff) <= (i_22_ ^ 0xffffffff))
                        break;
                    i_25_ = 0;
                }
                i_26_++;
            }
            return 1 + i_26_ - i_21_;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("sb.A("
                            + (is != null ? "{...}" : "null") + ','
                            + i + ',' + i_21_ + ',' + i_22_ + ','
                            + i_23_ + ','
                            + (is_24_ != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public Class103(byte[] is) {
        int[] is_29_ = new int[33];
        int i = 0;
        int i_30_ = is.length;
        aByteArray1764 = is;
        anIntArray1765 = new int[8];
        anIntArray1761 = new int[i_30_];
        for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
            int i_32_ = is[i_31_];
            if (i_32_ != 0) {
                int i_33_ = 1 << -i_32_ + 32;
                int i_34_ = is_29_[i_32_];
                anIntArray1761[i_31_] = i_34_;
                int i_35_;
                if ((i_34_ & i_33_ ^ 0xffffffff) != -1)
                    i_35_ = is_29_[i_32_ - 1];
                else {
                    for (int i_36_ = i_32_ - 1; i_36_ >= 1; i_36_--) {
                        int i_37_ = is_29_[i_36_];
                        if ((i_34_ ^ 0xffffffff) != (i_37_ ^ 0xffffffff))
                            break;
                        int i_38_ = 1 << 32 + -i_36_;
                        if ((i_37_ & i_38_) == 0)
                            is_29_[i_36_] = Class70.method1335(i_37_, i_38_);
                        else {
                            is_29_[i_36_] = is_29_[i_36_ + -1];
                            break;
                        }
                    }
                    i_35_ = i_34_ | i_33_;
                }
                is_29_[i_32_] = i_35_;
                for (int i_39_ = i_32_ + 1; (i_39_ ^ 0xffffffff) >= -33;
                     i_39_++) {
                    if (i_34_ == is_29_[i_39_])
                        is_29_[i_39_] = i_35_;
                }
                int i_40_ = 0;
                for (int i_41_ = 0; i_32_ > i_41_; i_41_++) {
                    int i_42_ = -2147483648 >>> i_41_;
                    if ((i_42_ & i_34_ ^ 0xffffffff) != -1) {
                        if (anIntArray1765[i_40_] == 0)
                            anIntArray1765[i_40_] = i;
                        i_40_ = anIntArray1765[i_40_];
                    } else
                        i_40_++;
                    if ((i_40_ ^ 0xffffffff)
                            <= (anIntArray1765.length ^ 0xffffffff)) {
                        int[] is_43_ = new int[2 * anIntArray1765.length];
                        for (int i_44_ = 0;
                             ((i_44_ ^ 0xffffffff)
                                     > (anIntArray1765.length ^ 0xffffffff));
                             i_44_++)
                            is_43_[i_44_] = anIntArray1765[i_44_];
                        anIntArray1765 = is_43_;
                    }
                    i_42_ >>>= 1;
                }
                anIntArray1765[i_40_] = i_31_ ^ 0xffffffff;
                if (i <= i_40_)
                    i = i_40_ + 1;
            }
        }
    }

    public static void method1636(int i) {
        anIntArray1767 = null;
        aRSString_1771 = null;
        int i_45_ = -70 / ((i - -71) / 48);
        aRSString_1769 = null;
        aClass45Array1763 = null;
    }

    static {
        aBoolean1762 = true;
        aRSString_1771 = RSString.newRsString("showVideoAd");
    }
}
