/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GameException extends RuntimeException {
    public static RSString aRSString_2230;
    public static int anInt2231;
    public static RSString aRSString_2232;
    public static int anInt2233;
    public static int anInt2234;
    public static int anInt2235;
    public static Class21renamed aClass21_2236;
    public static int anInt2237;
    public static int anInt2238;
    public String aString2239;
    public static RSString aRSString_2240
            = RSString.newRsString(" <col=ffffff>");
    public static int anInt2241;
    public static int anInt2242;
    public static RSString aRSString_2243;
    public static RSString aRSString_2244;
    public static int anInt2245;
    public static Sprite aSprite_2246;
    public Throwable aThrowable2247;

    public static Class1_Sub3 method1793
            (int i, int i_0_, int i_1_, Class1_Sub3 class1_sub3, int i_2_,
             Class55 class117, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
             int i_8_, int i_9_, boolean bool) {
        try {
            long l = (((long) i_8_ << -1663761184)
                    + (long) ((i_3_ << -1502276232) + (i_7_ << -743990992)
                    + i_6_)
                    + ((long) i_4_ << 1875380208));
            anInt2238++;
            Class1_Sub3 class1_sub3_10_
                    = (Class1_Sub3) Class121.aClass98_2100.method1570(14366, l);
            if (class1_sub3_10_ == null) {
                int i_11_;
                if ((i_6_ ^ 0xffffffff) == -2)
                    i_11_ = 9;
                else if ((i_6_ ^ 0xffffffff) != -3) {
                    if (i_6_ == 3)
                        i_11_ = 15;
                    else if ((i_6_ ^ 0xffffffff) == -5)
                        i_11_ = 18;
                    else
                        i_11_ = 21;
                } else
                    i_11_ = 12;
                int i_12_ = 3;
                int[] is = {64, 96, 128};
                int[][] is_13_ = new int[i_12_][i_11_];
                Class1_Sub4 class1_sub4
                        = new Class1_Sub4(1 - -(i_11_ * i_12_),
                        -i_11_ + 2 * i_11_ * i_12_, 0);
                int i_14_ = class1_sub4.method131(0, 0, 0);
                for (int i_15_ = 0; i_12_ > i_15_; i_15_++) {
                    int i_16_ = is[i_15_];
                    int i_17_ = is[i_15_];
                    for (int i_18_ = 0; i_18_ < i_11_; i_18_++) {
                        int i_19_ = (i_18_ << -939650869) / i_11_;
                        int i_20_
                                = (i_5_ - -(i_17_ * Class62.anIntArray1155[i_19_])
                                >> -780014224);
                        int i_21_
                                = (i - -(i_16_ * Class62.anIntArray1167[i_19_])
                                >> 100362896);
                        is_13_[i_15_][i_18_]
                                = class1_sub4.method131(i_20_, 0, i_21_);
                    }
                }
                for (int i_22_ = 0;
                     (i_12_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
                    int i_23_ = (128 + 256 * i_22_) / i_12_;
                    int i_24_ = -i_23_ + 256;
                    short i_25_ = (short) ((((i_24_ * (i_8_ & 0x380)
                            + (0x380 & i_4_) * i_23_)
                            & 0x38000)
                            + (((i_4_ & 0xfc00) * i_23_
                            + (0xfc00 & i_8_) * i_24_)
                            & 0xfc0000)
                            + (((0x7f & i_4_) * i_23_
                            + (0x7f & i_8_) * i_24_)
                            & 0x7f00))
                            >> -1732730136);
                    byte i_26_
                            = (byte) (i_23_ * i_3_ + i_7_ * i_24_ >> -480210520);
                    for (int i_27_ = 0; i_11_ > i_27_; i_27_++) {
                        if ((i_22_ ^ 0xffffffff) != -1) {
                            class1_sub4.method136(is_13_[-1 + i_22_][i_27_],
                                    (is_13_[-1 + i_22_]
                                            [(1 + i_27_) % i_11_]),
                                    (is_13_[i_22_]
                                            [(1 + i_27_) % i_11_]),
                                    (byte) 1, i_25_, i_26_);
                            class1_sub4.method136(is_13_[-1 + i_22_][i_27_],
                                    (is_13_[i_22_]
                                            [(i_27_ - -1) % i_11_]),
                                    is_13_[i_22_][i_27_],
                                    (byte) 1, i_25_, i_26_);
                        } else
                            class1_sub4.method136(i_14_,
                                    (is_13_[0]
                                            [(i_27_ + 1) % i_11_]),
                                    is_13_[0][i_27_], (byte) 1,
                                    i_25_, i_26_);
                    }
                }
                class1_sub3_10_
                        = class1_sub4.method127(64, 768, -50, -10, -50);
                Class121.aClass98_2100.method1568(class1_sub3_10_, 127, l);
            }
            int i_28_ = 64 * i_6_ + -1;
            int i_29_ = -i_28_;
            int i_30_ = -i_28_;
            int i_31_ = i_28_;
            int i_32_ = i_28_;
            int i_33_ = class1_sub3.method89();
            if (bool) {
                if (i_0_ > 640 && (i_0_ ^ 0xffffffff) > -1409)
                    i_32_ += 128;
                if ((i_0_ ^ 0xffffffff) < -129 && (i_0_ ^ 0xffffffff) > -897)
                    i_29_ -= 128;
                if ((i_0_ ^ 0xffffffff) < -1665 || i_0_ < 384)
                    i_30_ -= 128;
                if ((i_0_ ^ 0xffffffff) < -1153 && (i_0_ ^ 0xffffffff) > -1921)
                    i_31_ += 128;
            }
            if (i_33_ < i_29_)
                i_33_ = i_29_;
            int i_34_ = class1_sub3.method84();
            if ((i_34_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff))
                i_34_ = i_31_;
            int i_35_ = class1_sub3.method75();
            if ((i_35_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff))
                i_35_ = i_30_;
            Class68_Sub20_Sub17 class68_sub20_sub17 = null;
            int i_36_ = class1_sub3.method87();
            if (class117 != null) {
                i_2_ = class117.anIntArray2035[i_2_];
                class68_sub20_sub17
                        = Class35.method432(i_2_ >> 1541839728, (byte) -96);
                i_2_ &= 0xffff;
            }
            int i_37_ = 125 % ((-7 - i_9_) / 52);
            if ((i_32_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff))
                i_36_ = i_32_;
            if (class68_sub20_sub17 == null) {
                class1_sub3_10_ = class1_sub3_10_.method81(true, true);
                class1_sub3_10_.method72((-i_33_ + i_34_) / 2, 128,
                        (i_36_ - i_35_) / 2);
                class1_sub3_10_.method92((i_33_ + i_34_) / 2, 0,
                        (i_35_ - -i_36_) / 2);
            } else {
                class1_sub3_10_
                        = class1_sub3_10_.method81(!class68_sub20_sub17
                        .method1180(true, i_2_),
                        true);
                class1_sub3_10_.method72((-i_33_ + i_34_) / 2, 128,
                        (i_36_ - i_35_) / 2);
                class1_sub3_10_.method92((i_33_ + i_34_) / 2, 0,
                        (i_36_ + i_35_) / 2);
                class1_sub3_10_.method76(class68_sub20_sub17, i_2_);
            }
            if ((i_0_ ^ 0xffffffff) != -1)
                class1_sub3_10_.method90(i_0_);
            Class1_Sub3_Sub1 class1_sub3_sub1
                    = (Class1_Sub3_Sub1) class1_sub3_10_;
            if (i_1_ != Class1_Sub6_Sub2.method163(i_5_ - -i_33_,
                    GameSocket.anInt1149,
                    i_35_ + i, false)
                    || Class1_Sub6_Sub2.method163(i_34_ + i_5_, GameSocket.anInt1149,
                    i_36_ + i, false) != i_1_) {
                for (int i_38_ = 0; class1_sub3_sub1.anInt3355 > i_38_;
                     i_38_++)
                    class1_sub3_sub1.anIntArray3334[i_38_]
                            += (Class1_Sub6_Sub2.method163
                            (class1_sub3_sub1.anIntArray3354[i_38_] + i_5_,
                                    GameSocket.anInt1149,
                                    i + class1_sub3_sub1.anIntArray3343[i_38_],
                                    false)) + -i_1_;
                class1_sub3_sub1.aBoolean3345 = false;
            }
            return class1_sub3_10_;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ua.A(" + i + ',' + i_0_ + ',' + i_1_
                            + ','
                            + (class1_sub3 != null ? "{...}"
                            : "null")
                            + ',' + i_2_ + ','
                            + (class117 != null ? "{...}" : "null")
                            + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
                            + ',' + i_6_ + ',' + i_7_ + ',' + i_8_
                            + ',' + i_9_ + ',' + bool + ')'));
        }
    }

    public static void method1794(int i) {
        aRSString_2230 = null;
        aRSString_2244 = null;
        aRSString_2232 = null;
        aRSString_2243 = null;
        aSprite_2246 = null;
        aClass21_2236 = null;
        if (i != 64)
            method1798(false, 79, 66, (byte) 113, 45, null, (byte) 12);
        aRSString_2240 = null;
    }

    public static int method1795(int i, int i_39_) {
        anInt2237++;
        if (i_39_ <= 44)
            anInt2241 = 118;
        return 0x3ff & i;
    }

    public static void method1796(int i, int i_40_, int i_41_) {
        if (i >= 65) {
            anInt2233++;
            if (Class68_Sub13_Sub25.method824(i_40_, (byte) -2))
                Class1_Sub5.method142(i_41_,
                        (Class68_Sub13_Sub36
                                .aClass45ArrayArray4040[i_40_]),
                        16);
        }
    }

    public static void method1797(int i, boolean bool, int i_42_, int i_43_,
                                  int i_44_, int i_45_, byte[] is, int i_46_,
                                  GroundData[] class38s, int i_47_, int i_48_) {
        try {
            anInt2245++;
            int i_49_ = -1;
            if (i_47_ < 67)
                aSprite_2246 = null;
            Stream class68_sub14 = new Stream(is);
            for (; ; ) {
                int i_50_ = class68_sub14.method937(true);
                if ((i_50_ ^ 0xffffffff) == -1)
                    break;
                int i_51_ = 0;
                i_49_ += i_50_;
                for (; ; ) {
                    int i_52_ = class68_sub14.method912(255);
                    if ((i_52_ ^ 0xffffffff) == -1)
                        break;
                    i_51_ += -1 + i_52_;
                    int i_53_ = (i_51_ & 0xfc8) >> -740717850;
                    int i_54_ = i_51_ >> 210097612;
                    int i_55_ = class68_sub14.readUnsignedByte(-6677);
                    int i_56_ = i_51_ & 0x3f;
                    int i_57_ = i_55_ >> -964823422;
                    int i_58_ = i_55_ & 0x3;
                    if (i_54_ == i_46_ && i_45_ <= i_53_
                            && (8 + i_45_ ^ 0xffffffff) < (i_53_ ^ 0xffffffff)
                            && i_56_ >= i_42_
                            && (i_42_ - -8 ^ 0xffffffff) < (i_56_ ^ 0xffffffff)) {
                        Class116 class116 = Class1_Sub5.method140(110, i_49_);
                        int i_59_
                                = i_43_ + Class3.method183(i_58_, i_56_ & 0x7,
                                class116.anInt1988,
                                i_53_ & 0x7,
                                class116.anInt1987,
                                -120, i_44_);
                        int i_60_
                                = (i_48_
                                - -Class68_Sub27.method1219(i_58_,
                                class116.anInt1988,
                                i_44_, i_56_ & 0x7,
                                class116.anInt1987,
                                0x7 & i_53_,
                                (byte) -128));
                        if (i_59_ > 0 && i_60_ > 0
                                && (i_59_ ^ 0xffffffff) > -104 && i_60_ < 103) {
                            GroundData class38 = null;
                            if (!bool) {
                                int i_61_ = i;
                                if (((Class64.aByteArrayArrayArray1178[1]
                                        [i_59_][i_60_]) & 0x2
                                        ^ 0xffffffff)
                                        == -3)
                                    i_61_--;
                                if ((i_61_ ^ 0xffffffff) <= -1)
                                    class38 = class38s[i_61_];
                            }
                            Class68_Sub20_Sub17.method1181(class38, 1, bool,
                                    i_60_,
                                    (0x3
                                            & i_58_ - -i_44_),
                                    i_59_, i_57_, i, i,
                                    !bool, i_49_);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ua.D(" + i + ',' + bool + ',' + i_42_
                            + ',' + i_43_ + ',' + i_44_ + ','
                            + i_45_ + ','
                            + (is != null ? "{...}" : "null") + ','
                            + i_46_ + ','
                            + (class38s != null ? "{...}" : "null")
                            + ',' + i_47_ + ',' + i_48_ + ')'));
        }
    }

    public static void method1798(boolean bool, int i, int i_62_, byte i_63_,
                                  int i_64_, Class21_Sub1 class21_sub1,
                                  byte i_65_) {
        long l = (long) (i_64_ + (i_62_ << 598658928));
        anInt2234++;
        Class68_Sub20_Sub15 class68_sub20_sub15
                = (Class68_Sub20_Sub15) Class123.aClass113_2123.method1678(l, -58);
        if (i_65_ == 22 && class68_sub20_sub15 == null) {
            class68_sub20_sub15
                    = ((Class68_Sub20_Sub15)
                    Class68_Sub20_Sub13.aClass113_4366.method1678(l, -47));
            if (class68_sub20_sub15 == null) {
                class68_sub20_sub15
                        = ((Class68_Sub20_Sub15)
                        Stream.aClass113_3008.method1678(l, 73));
                if (class68_sub20_sub15 != null) {
                    if (bool) {
                        class68_sub20_sub15.method1005((byte) 73);
                        Class123.aClass113_2123
                                .method1677((byte) 123, class68_sub20_sub15, l);
                        Class56.anInt1067++;
                        Class128.anInt2227--;
                    }
                } else {
                    if (!bool) {
                        class68_sub20_sub15
                                = ((Class68_Sub20_Sub15)
                                PacketParser.aClass113_1874.method1678(l, -100));
                        if (class68_sub20_sub15 != null)
                            return;
                    }
                    class68_sub20_sub15 = new Class68_Sub20_Sub15();
                    class68_sub20_sub15.aClass21_Sub1_4394 = class21_sub1;
                    class68_sub20_sub15.anInt4392 = i;
                    class68_sub20_sub15.aByte4391 = i_63_;
                    if (bool) {
                        Class123.aClass113_2123
                                .method1677((byte) 119, class68_sub20_sub15, l);
                        Class56.anInt1067++;
                    } else {
                        Class68_Sub7.aClass128_2854
                                .method1787(125, class68_sub20_sub15);
                        Stream.aClass113_3008
                                .method1677((byte) 127, class68_sub20_sub15, l);
                        Class128.anInt2227++;
                    }
                }
            }
        }
    }

    public GameException(Throwable throwable, String string) {
        aThrowable2247 = throwable;
        aString2239 = string;
    }

    static {
        aRSString_2232 = RSString.newRsString("http:)4)4");
        aRSString_2244 = RSString.newRsString("glow1:");
        aRSString_2230 = aRSString_2244;
        anInt2231 = 0;
        aRSString_2243 = aRSString_2244;
    }
}
