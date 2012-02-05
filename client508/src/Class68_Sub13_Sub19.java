/* Class68_Sub13_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub19 extends Class68_Sub13 {
    public static RSString aRSString_3739 = RSString.newRsString("");
    public static RSString aRSString_3740;
    public static RSString aRSString_3741;
    public static RSString aRSString_3742;
    public boolean aBoolean3743 = true;
    public static int anInt3744;
    public static Class92_Sub1[] aClass92_Sub1Array3745;
    public static int anInt3746;
    public static int anInt3747;
    public static int anInt3748 = 0;
    public static int anInt3749;
    public static int anInt3750;
    public static int anInt3751;
    public boolean aBoolean3752 = true;
    public static int anInt3753;
    public static RSString aRSString_3754;
    public static int anInt3755;
    public static int anInt3756;
    public static int[] anIntArray3757;
    public static int anInt3758;
    public static int anInt3759;

    public static void method792(int i) {
        anInt3749++;
        boolean bool = false;
        if (i == 6364) {
            while (!bool) {
                bool = true;
                for (int i_0_ = 0; i_0_ < Class68_Sub13_Sub21.anInt3803 + -1;
                     i_0_++) {
                    if (Class68_Sub28_Sub1.aShortArray4471[i_0_] < 1000
                            && (Class68_Sub28_Sub1.aShortArray4471[i_0_ - -1]
                            ^ 0xffffffff) < -1001) {
                        bool = false;
                        RSString class100 = Class33.aRSStringArray582[i_0_];
                        Class33.aRSStringArray582[i_0_]
                                = Class33.aRSStringArray582[i_0_ - -1];
                        Class33.aRSStringArray582[i_0_ - -1] = class100;
                        RSString class100_1_
                                = Class71_Sub1.aRSStringArray3257[i_0_];
                        Class71_Sub1.aRSStringArray3257[i_0_]
                                = Class71_Sub1.aRSStringArray3257[1 + i_0_];
                        Class71_Sub1.aRSStringArray3257[1 + i_0_]
                                = class100_1_;
                        int i_2_ = Class37.anIntArray654[i_0_];
                        Class37.anIntArray654[i_0_]
                                = Class37.anIntArray654[i_0_ - -1];
                        Class37.anIntArray654[i_0_ + 1] = i_2_;
                        i_2_ = Class68_Sub13_Sub37.anIntArray4075[i_0_];
                        Class68_Sub13_Sub37.anIntArray4075[i_0_]
                                = Class68_Sub13_Sub37.anIntArray4075[i_0_ - -1];
                        Class68_Sub13_Sub37.anIntArray4075[i_0_ - -1] = i_2_;
                        short i_3_ = Class68_Sub28_Sub1.aShortArray4471[i_0_];
                        Class68_Sub28_Sub1.aShortArray4471[i_0_]
                                = Class68_Sub28_Sub1.aShortArray4471[i_0_ + 1];
                        Class68_Sub28_Sub1.aShortArray4471[1 + i_0_] = i_3_;
                        long l = Class68_Sub13_Sub14.aLongArray3676[i_0_];
                        Class68_Sub13_Sub14.aLongArray3676[i_0_]
                                = Class68_Sub13_Sub14.aLongArray3676[i_0_ - -1];
                        Class68_Sub13_Sub14.aLongArray3676[i_0_ + 1] = l;
                    }
                }
            }
        }
    }

    public Class68_Sub13_Sub19() {
        super(1, false);
    }

    public static int method793(int i, int i_4_) {
        if (i > -83)
            method795(null, (byte) 100);
        anInt3744++;
        return i_4_ >>> -118132568;
    }

    public int[] method698(byte i, int i_5_) {
        anInt3753++;
        int[] is = aClass115_2936.method1697(false, i_5_);
        if (i != -61)
            aRSString_3742 = null;
        if (aClass115_2936.aBoolean1957) {
            int[] is_6_
                    = this.method696(0,
                    (aBoolean3743
                            ? -i_5_ + Class1_Sub6_Sub2.anInt3432 : i_5_),
                    29149);
            if (!aBoolean3752)
                Class39.method466(is_6_, 0, is, 0, anInt3746);
            else {
                for (int i_7_ = 0; anInt3746 > i_7_; i_7_++)
                    is[i_7_] = is_6_[Class30.anInt543 - i_7_];
            }
        }
        return is;
    }

    public static boolean method794(int i, int i_8_) {
        anInt3747++;
        if (i != 32157)
            method793(-72, -38);
        if ((i_8_ >> 1379986100 & 0x1 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    public int[][] method697(int i, boolean bool) {
        anInt3758++;
        int[][] is = aClass88_2939.method1496(i, (byte) 3);
        if (aClass88_2939.aBoolean1610) {
            int[][] is_9_
                    = this.method699(-85, 0, (!aBoolean3743 ? i
                    : -i + Class1_Sub6_Sub2.anInt3432));
            int[] is_10_ = is_9_[1];
            int[] is_11_ = is_9_[0];
            int[] is_12_ = is[0];
            int[] is_13_ = is[2];
            int[] is_14_ = is[1];
            int[] is_15_ = is_9_[2];
            if (aBoolean3752) {
                for (int i_16_ = 0;
                     (anInt3746 ^ 0xffffffff) < (i_16_ ^ 0xffffffff);
                     i_16_++) {
                    is_12_[i_16_] = is_11_[Class30.anInt543 + -i_16_];
                    is_14_[i_16_] = is_10_[Class30.anInt543 + -i_16_];
                    is_13_[i_16_] = is_15_[Class30.anInt543 - i_16_];
                }
            } else {
                for (int i_17_ = 0;
                     (anInt3746 ^ 0xffffffff) < (i_17_ ^ 0xffffffff);
                     i_17_++) {
                    is_12_[i_17_] = is_11_[i_17_];
                    is_14_[i_17_] = is_10_[i_17_];
                    is_13_[i_17_] = is_15_[i_17_];
                }
            }
        }
        if (bool != true)
            aRSString_3754 = null;
        return is;
    }

    public void method700(Stream class68_sub14, int i, int i_18_) {
        anInt3751++;
        int i_19_ = i;
        while_76_:
        do {
            do {
                if ((i_19_ ^ 0xffffffff) != -1) {
                    if (i_19_ != 1) {
                        if (i_19_ == 2)
                            break;
                        break while_76_;
                    }
                } else {
                    aBoolean3752
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
                    break while_76_;
                }
                aBoolean3743 = class68_sub14.readUnsignedByte(-6677) == 1;
                break while_76_;
            } while (false);
            aBoolean2931 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
        } while (false);
        if (i_18_ != -1)
            method794(26, 123);
    }

    public static void method795(Applet_Sub1 applet_sub1, byte i) {
        anInt3756++;
        Class118.method1730(true);
        if (Class76.aClass52_1354 == null) {
            if (!Class1_Sub1.aBoolean2414)
                Class37.method442(500);
            else {
                if (Class29.anInt537 == 1) {
                    int i_20_ = Class50.anInt990 / 5;
                    int i_21_ = i_20_ + Class68_Sub13_Sub18.anInt3734 - -140;
                    if (Class68_Sub13_Sub37.anInt4077 < i_21_
                            || Class68_Sub13_Sub37.anInt4077 > 14 + i_21_
                            || Class68_Sub24.anInt3158 + 4 > Class125.anInt2173
                            || 18 + Class68_Sub24.anInt3158 < Class125.anInt2173) {
                        if (((Class68_Sub13_Sub37.anInt4077 ^ 0xffffffff)
                                <= (15 + i_21_ ^ 0xffffffff))
                                && 80 + i_21_ >= Class68_Sub13_Sub37.anInt4077
                                && ((Class125.anInt2173 ^ 0xffffffff)
                                <= (4 + Class68_Sub24.anInt3158 ^ 0xffffffff))
                                && (Class68_Sub24.anInt3158 - -18
                                >= Class125.anInt2173)) {
                            PacketParser.method1663(126, 0, 1);
                            return;
                        }
                    } else {
                        PacketParser.method1663(122, 0, 0);
                        return;
                    }
                    int i_22_ = 250 + (i_20_ + Class68_Sub13_Sub18.anInt3734);
                    if (i_22_ <= Class68_Sub13_Sub37.anInt4077
                            && ((Class68_Sub13_Sub37.anInt4077 ^ 0xffffffff)
                            >= (i_22_ + 14 ^ 0xffffffff))
                            && ((Class68_Sub24.anInt3158 - -4 ^ 0xffffffff)
                            >= (Class125.anInt2173 ^ 0xffffffff))
                            && ((Class125.anInt2173 ^ 0xffffffff)
                            >= (18 + Class68_Sub24.anInt3158 ^ 0xffffffff))) {
                        PacketParser.method1663(112, 1, 0);
                        return;
                    }
                    if (((Class68_Sub13_Sub37.anInt4077 ^ 0xffffffff)
                            <= (i_22_ - -15 ^ 0xffffffff))
                            && ((Class68_Sub13_Sub37.anInt4077 ^ 0xffffffff)
                            >= (80 + i_22_ ^ 0xffffffff))
                            && Class68_Sub24.anInt3158 - -4 <= Class125.anInt2173
                            && ((Class68_Sub24.anInt3158 + 18 ^ 0xffffffff)
                            <= (Class125.anInt2173 ^ 0xffffffff))) {
                        PacketParser.method1663(124, 1, 1);
                        return;
                    }
                    int i_23_ = 360 + (i_20_ + Class68_Sub13_Sub18.anInt3734);
                    if (i_23_ <= Class68_Sub13_Sub37.anInt4077
                            && ((i_23_ + 14 ^ 0xffffffff)
                            <= (Class68_Sub13_Sub37.anInt4077 ^ 0xffffffff))
                            && Class125.anInt2173 >= Class68_Sub24.anInt3158 - -4
                            && (Class125.anInt2173
                            <= 18 + Class68_Sub24.anInt3158)) {
                        PacketParser.method1663(105, 2, 0);
                        return;
                    }
                    if (((i_23_ + 15 ^ 0xffffffff)
                            >= (Class68_Sub13_Sub37.anInt4077 ^ 0xffffffff))
                            && Class68_Sub13_Sub37.anInt4077 <= i_23_ + 80
                            && Class125.anInt2173 >= 4 + Class68_Sub24.anInt3158
                            && ((18 + Class68_Sub24.anInt3158 ^ 0xffffffff)
                            <= (Class125.anInt2173 ^ 0xffffffff))) {
                        PacketParser.method1663(115, 2, 1);
                        return;
                    }
                    int i_24_ = i_20_ + Class68_Sub13_Sub18.anInt3734 + 470;
                    if (Class68_Sub13_Sub37.anInt4077 >= i_24_
                            && Class68_Sub13_Sub37.anInt4077 <= 14 + i_24_
                            && Class125.anInt2173 >= 4 + Class68_Sub24.anInt3158
                            && ((Class68_Sub24.anInt3158 - -18 ^ 0xffffffff)
                            <= (Class125.anInt2173 ^ 0xffffffff))) {
                        PacketParser.method1663(112, 3, 0);
                        return;
                    }
                    if (((Class68_Sub13_Sub37.anInt4077 ^ 0xffffffff)
                            <= (15 + i_24_ ^ 0xffffffff))
                            && 80 + i_24_ >= Class68_Sub13_Sub37.anInt4077
                            && ((Class68_Sub24.anInt3158 + 4 ^ 0xffffffff)
                            >= (Class125.anInt2173 ^ 0xffffffff))
                            && (18 + Class68_Sub24.anInt3158
                            >= Class125.anInt2173)) {
                        PacketParser.method1663(124, 3, 1);
                        return;
                    }
                    if ((Class68_Sub13_Sub36.anInt4037 ^ 0xffffffff) != 0) {
                        Class93 class93 = (Class1_Sub6.aClass93Array2529
                                [Class68_Sub13_Sub36.anInt4037]);
                        if (class93.aBoolean1661
                                != !Class1_Sub7.aBoolean2612) {
                            byte[] is
                                    = Class68_Sub20_Sub13_Sub2.method1166
                                    (2,
                                            new RSString[]{class93.aRSString_1670,
                                                    (Class68_Sub20_Sub11
                                                            .aRSString_4333)})
                                    .method1575((byte) -110);
                            Class68_Sub9.serverAddress
                                    = new String(is, 0, is.length);
                            Class106.anInt1799 = class93.anInt1664;
                            if ((Class75_Sub3.anInt3328 ^ 0xffffffff) != -1) {
                                Class68_Sub15.anInt3013
                                        = 50000 + Class106.anInt1799;
                                Class115.anInt1946
                                        = Class106.anInt1799 + 40000;
                                Class103.port = Class115.anInt1946;
                            }
                            if (Class59.aClass45_1101 != null) {
                                Class59.aClass45_1101.aBoolean764 = true;
                                Class113.method1682(Class59.aClass45_1101,
                                        -119);
                            }
                            return;
                        }
                        RSString class100 = Class33.aRSString_586;
                        if ((Class75_Sub3.anInt3328 ^ 0xffffffff) != -1)
                            class100
                                    = (Class68_Sub20_Sub13_Sub2.method1166
                                    (2, (new RSString[]
                                            {Class68_Sub20_Sub9.aRSString_4294,
                                                    (Class68_Sub13_Sub24.method816
                                                            (7000 + class93.anInt1664, 0))})));
                        RSString class100_25_
                                = (Class68_Sub20_Sub13_Sub2.method1166
                                (2,
                                        (new RSString[]
                                                {GameException.aRSString_2232,
                                                        class93.aRSString_1670,
                                                        Class68_Sub20_Sub11.aRSString_4333,
                                                        class100, Class13_Sub1.aRSString_2624,
                                                        (Class68_Sub13_Sub24.method816
                                                                (Class68_Sub13_Sub27.anInt3915, 0)),
                                                        Class52.aRSString_1009,
                                                        (Class68_Sub13_Sub24.method816
                                                                (Class68_Sub13_Sub20.anInt3780, 0)),
                                                        Class68_Sub20_Sub7.aRSString_4256,
                                                        Class68_Sub13_Sub24.method816(0, 0),
                                                        Class36.aRSString_639,
                                                        Class68_Sub13_Sub24
                                                                .method816(Class20.anInt403, 0),
                                                        GameSocket.aRSString_1147,
                                                        (Class68_Sub13_Sub24.method816
                                                                (Class68_Sub13_Sub10.anInt3597, 0))})));
                        try {
                            applet_sub1.getAppletContext().showDocument
                                    (class100_25_.method1574(-16294), "_self");
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                }
                if (i < 63)
                    anInt3746 = -85;
            }
        }
    }

    public static void method796(int i) {
        aClass92_Sub1Array3745 = null;
        if (i != 1)
            method795(null, (byte) 117);
        aRSString_3740 = null;
        anIntArray3757 = null;
        aRSString_3739 = null;
        aRSString_3754 = null;
        aRSString_3741 = null;
        aRSString_3742 = null;
    }

    public static void method797(Class21renamed class21, Class21renamed class21_26_,
                                 Class21renamed class21_27_, int i) {
        try {
            anInt3750++;
            Class68_Sub13_Sub24.aClass21_3843 = class21_27_;
            if (i >= -72)
                method793(-11, 6);
            Class68_Sub13_Sub24.aClass21_3831 = class21;
            Class50_Sub2.aClass21_2736 = class21_26_;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ld.F("
                            + (class21 != null ? "{...}" : "null")
                            + ','
                            + (class21_26_ != null ? "{...}"
                            : "null")
                            + ','
                            + (class21_27_ != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    static {
        aRSString_3741 = RSString.newRsString("Loaded interfaces");
        aRSString_3740 = aRSString_3741;
        anInt3755 = 0;
        aRSString_3754 = RSString.newRsString("Loading )2 please wait)3");
        anInt3759 = 0;
        aRSString_3742 = aRSString_3754;
    }
}
