/* Class68_Sub20_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub8 extends Class68_Sub20 {
    public static int anInt4268;
    public static int anInt4269;
    public static int anInt4270;
    public static int anInt4271;
    public static int anInt4272;
    public static int anInt4273;
    public int[][] anIntArrayArray4274;
    public static int anInt4275;
    public static int anInt4276;
    public int[] anIntArray4277;
    public static int anInt4278;
    public static Class21renamed aClass21_4279;
    public static int anInt4280;
    public static int anInt4281;
    public static RSString aRSString_4282 = RSString.newRsString("unzap");
    public static int anInt4283;
    public static int anInt4284;
    public int[] anIntArray4285;
    public static int anInt4286;
    public static int anInt4287;
    public static int anInt4288;
    public RSString[] aRSStringArray4289;
    public static Class21renamed aClass21_4290;

    public int method1079(int i, int i_0_, int i_1_) {
        anInt4280++;
        if (anIntArray4285 == null || i < 0 || i > anIntArray4285.length)
            return -1;
        if (i_0_ != -20484)
            method1089(-25, true, 33);
        if (anIntArrayArray4274[i] == null || i_1_ < 0
                || anIntArrayArray4274[i].length < i_1_)
            return -1;
        return anIntArrayArray4274[i][i_1_];
    }

    public int method1080(byte i) {
        if (i > -21)
            anIntArray4277 = null;
        anInt4286++;
        if (anIntArray4285 == null)
            return 0;
        return anIntArray4285.length;
    }

    public void method1081(int i, int[] is, Stream class68_sub14) {
        while_14_:
        do {
            try {
                anInt4281++;
                if (anIntArray4285 != null) {
                    int i_2_ = 0;
                    if (i <= -14) {
                        for (; ; ) {
                            if (anIntArray4285.length <= i_2_)
                                break while_14_;
                            if ((i_2_ ^ 0xffffffff)
                                    <= (is.length ^ 0xffffffff))
                                break;
                            int i_3_ = (PacketParser.anIntArray1861
                                    [method1082(i_2_, (byte) -66)]);
                            if (i_3_ > 0)
                                class68_sub14.method916((long) is[i_2_], -112,
                                        i_3_);
                            i_2_++;
                        }
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("gj.E(" + i + ','
                                + (is != null ? "{...}" : "null")
                                + ','
                                + (class68_sub14 != null ? "{...}"
                                : "null")
                                + ')'));
            }
            break;
        } while (false);
    }

    public int method1082(int i, byte i_4_) {
        anInt4268++;
        if (i_4_ != -66)
            anIntArray4285 = null;
        if (anIntArray4285 == null || i < 0
                || (anIntArray4285.length ^ 0xffffffff) > (i ^ 0xffffffff))
            return -1;
        return anIntArray4285[i];
    }

    public static void method1083(byte i, int i_5_) {
        anInt4272++;
        if (i_5_ >= 0) {
            int i_6_ = Class68_Sub13_Sub37.anIntArray4075[i_5_];
            int i_7_ = Class68_Sub28_Sub1.aShortArray4471[i_5_];
            long l = Class68_Sub13_Sub14.aLongArray3676[i_5_];
            if ((i_7_ ^ 0xffffffff) <= -2001)
                i_7_ -= 2000;
            int i_8_ = (int) Class68_Sub13_Sub14.aLongArray3676[i_5_];
            int i_9_ = Class37.anIntArray654[i_5_];
            if ((i_7_ ^ 0xffffffff) == -21) {
                Class1_Sub6_Sub2 class1_sub6_sub2
                        = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_8_];
                if (class1_sub6_sub2 != null) {
                    Class101.anInt1741++;
                    Class68_Sub13_Sub3.method713
                            (0, 0,
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0],
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0],
                                    1, 1, class1_sub6_sub2.anIntArray2570[0], false, 0,
                                    -3, 2, class1_sub6_sub2.anIntArray2523[0]);
                    Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                    Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                    client.anInt2376 = 2;
                    Class26.anInt523 = 0;
                    Class21renamed.stream.createFrame(227);
                    Class21renamed.stream.writeWordBigEndianA((byte) 19, i_8_);
                }
            }
            if (i_7_ == 41) {
                Class88.anInt1606++;
                Class21renamed.stream.createFrame(203);
                Class21renamed.stream.writeWordBigEndianA((byte) 19, i_9_);
                Class21renamed.stream.writeDWord(i_6_);
                Class21renamed.stream.writeWord(i_8_);
                Class68_Sub13_Sub24.anInt3833 = 0;
                Class1_Sub5.aClass45_2515
                        = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if (i_7_ == 58) {
                Class21renamed.stream.createFrame(137);
                Class72_Sub1.anInt3283++;
                Class21renamed.stream.writeWord(i_8_);
                Class21renamed.stream.writeDWord_v1((byte) -104, i_6_);
                Class21renamed.stream.writeWordBigEndian(i_9_, (byte) 38);
                Class68_Sub13_Sub24.anInt3833 = 0;
                Class1_Sub5.aClass45_2515
                        = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if ((i_7_ ^ 0xffffffff) == -8) {
                Class21renamed.stream.createFrame(152);
                GameException.anInt2242++;
                Class21renamed.stream.writeWordBigEndianA((byte) 19, i_9_);
                Class21renamed.stream.writeWordA(i_8_, -49);
                Class21renamed.stream.writeDWord_v1((byte) -102, i_6_);
                Class68_Sub13_Sub24.anInt3833 = 0;
                Class1_Sub5.aClass45_2515
                        = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if ((i_7_ ^ 0xffffffff) == -1006) {
                Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                Class26.anInt523 = 0;
                Class60.anInt1116++;
                Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                client.anInt2376 = 2;
                Class21renamed.stream.createFrame(84);
                Class21renamed.stream.writeWordA(i_8_, -37);
            }
            if (i_7_ == 35) {
                Class45.anInt824++;
                boolean bool
                        = (Class68_Sub13_Sub3.method713
                        (0, 0,
                                Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0],
                                Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0],
                                0, 0, i_6_, false, 0, -3, 2, i_9_));
                if (!bool)
                    bool
                            = Class68_Sub13_Sub3.method713(0, 0,
                            (Class68_Sub7
                                    .aClass1_Sub6_Sub2_2860
                                    .anIntArray2523[0]),
                            (Class68_Sub7
                                    .aClass1_Sub6_Sub2_2860
                                    .anIntArray2570[0]),
                            1, 1, i_6_, false, 0,
                            -3, 2, i_9_);
                Class26.anInt523 = 0;
                client.anInt2376 = 2;
                Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                Class21renamed.stream.createFrame(191);
                Class21renamed.stream
                        .writeWord(i_9_ - -Class36.anInt643);
                Class21renamed.stream
                        .writeWord(i_6_ + Class68_Sub13_Sub35.anInt4026);
                Class21renamed.stream.writeWordA(i_8_, -58);
            }
            if ((i_7_ ^ 0xffffffff) == -7) {
                Class114.anInt1929++;
                Class21renamed.stream.createFrame(136);
                Class21renamed.stream.writeDWord_v1((byte) -126, i_6_);
                Class21renamed.stream
                        .writeWord(Class68_Sub20_Sub16.anInt4422);
                Class21renamed.stream.writeWordBigEndianA((byte) 19, i_9_);
                Class21renamed.stream.writeDWord_v2(-19237,
                        Class107.anInt1821);
            }
            if (i_7_ == 1006) {
                Class85.anInt1555++;
                client.anInt2376 = 2;
                Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                Class26.anInt523 = 0;
                Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                Class21renamed.stream.createFrame(38);
                Class21renamed.stream.writeWordBigEndianA((byte) 19, i_8_);
            }
            if (i_7_ == 29) {
                Class1_Sub6_Sub1 class1_sub6_sub1
                        = Class102.aClass1_Sub6_Sub1Array1746[i_8_];
                if (class1_sub6_sub1 != null) {
                    Class68_Sub13_Sub3.method713
                            (0, 0,
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0],
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0],
                                    1, 1, class1_sub6_sub1.anIntArray2570[0], false, 0,
                                    -3, 2, class1_sub6_sub1.anIntArray2523[0]);
                    Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                    Class45.anInt834++;
                    Class26.anInt523 = 0;
                    Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                    client.anInt2376 = 2;
                    Class21renamed.stream.createFrame(123);
                    Class21renamed.stream.writeWord(i_8_);
                }
            }
            if ((i_7_ ^ 0xffffffff) == -13) {
                Class1_Sub6_Sub1 class1_sub6_sub1
                        = Class102.aClass1_Sub6_Sub1Array1746[i_8_];
                if (class1_sub6_sub1 != null) {
                    Class68_Sub13_Sub3.method713
                            (0, 0,
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0],
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0],
                                    1, 1, class1_sub6_sub1.anIntArray2570[0], false, 0,
                                    -3, 2, class1_sub6_sub1.anIntArray2523[0]);
                    Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                    Class26.anInt523 = 0;
                    client.anInt2376 = 2;
                    Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                    Class21renamed.stream.createFrame(7);
                    Class21renamed.stream.writeWordA(i_8_, -107);
                    Class90.anInt2329++;
                }
            }
            if ((i_7_ ^ 0xffffffff) == -5) {
                Class1_Sub6_Sub2 class1_sub6_sub2
                        = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_8_];
                if (class1_sub6_sub2 != null) {
                    Class1_Sub2.anInt2440++;
                    Class68_Sub13_Sub3.method713
                            (0, 0,
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0],
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0],
                                    1, 1, class1_sub6_sub2.anIntArray2570[0], false, 0,
                                    -3, 2, class1_sub6_sub2.anIntArray2523[0]);
                    Class26.anInt523 = 0;
                    Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                    client.anInt2376 = 2;
                    Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                    Class21renamed.stream.createFrame(35);
                    Class21renamed.stream.writeWordBigEndianA((byte) 19, i_8_);
                }
            }
            if (i_7_ == 39) {
                Class21renamed.stream.createFrame(40);
                Class21renamed.stream.writeWordBigEndian(i_8_, (byte) 38);
                Class85.anInt1562++;
                Class21renamed.stream
                        .writeWordA(Class68_Sub13_Sub33.anInt4001, -26);
                Class21renamed.stream
                        .writeDWord_v1((byte) -109, Class68_Sub28_Sub2.anInt4553);
                Class21renamed.stream.writeDWord_v1((byte) -111, i_6_);
                Class21renamed.stream.writeWordA(i_9_, -85);
                Class21renamed.stream
                        .writeWordA(Class1_Sub6_Sub2.anInt3399, -80);
                Class68_Sub13_Sub24.anInt3833 = 0;
                Class1_Sub5.aClass45_2515
                        = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if ((i_7_ ^ 0xffffffff) == -2
                    && Class75_Sub2.method1398(l, i_6_, -12974, i_9_)) {
                Class103.anInt1759++;
                Class21renamed.stream.createFrame(224);
                Class21renamed.stream.writeWordBigEndian
                        (i_6_ - -Class68_Sub13_Sub35.anInt4026, (byte) 38);
                Class21renamed.stream
                        .writeWord(Class68_Sub13_Sub33.anInt4001);
                Class21renamed.stream
                        .writeDWord_v1((byte) -107, Class68_Sub28_Sub2.anInt4553);
                Class21renamed.stream
                        .writeWordA(Class1_Sub6_Sub2.anInt3399, -80);
                Class21renamed.stream
                        .writeWordA(0x7fffffff & (int) (l >>> 1244652192), -106);
                Class21renamed.stream
                        .writeWord(i_9_ - -Class36.anInt643);
            }
            if (i_7_ == 2) {
                Class1_Sub6_Sub2 class1_sub6_sub2
                        = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_8_];
                if (class1_sub6_sub2 != null) {
                    Class68_Sub13_Sub13.anInt3652++;
                    Class68_Sub13_Sub3.method713
                            (0, 0,
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0],
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0],
                                    1, 1, class1_sub6_sub2.anIntArray2570[0], false, 0,
                                    -3, 2, class1_sub6_sub2.anIntArray2523[0]);
                    client.anInt2376 = 2;
                    Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                    Class26.anInt523 = 0;
                    Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                    Class21renamed.stream.createFrame(131);
                    Class21renamed.stream
                            .writeDWordBigEndian((byte) 127, Class68_Sub28_Sub2.anInt4553);
                    Class21renamed.stream.writeWordA(i_8_, -85);
                    Class21renamed.stream
                            .writeWordBigEndian(Class1_Sub6_Sub2.anInt3399, (byte) 38);
                    Class21renamed.stream
                            .writeWordBigEndian(Class68_Sub13_Sub33.anInt4001, (byte) 38);
                }
            }
            if ((i_7_ ^ 0xffffffff) == -1003) {
                client.anInt2376 = 2;
                Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                Class26.anInt523 = 0;
                Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                Class1_Sub6_Sub1 class1_sub6_sub1
                        = Class102.aClass1_Sub6_Sub1Array1746[i_8_];
                if (class1_sub6_sub1 != null) {
                    Class80 class80 = class1_sub6_sub1.aClass80_3395;
                    if (class80.anIntArray1431 != null)
                        class80 = class80.method1447(-94);
                    if (class80 != null) {
                        Class21renamed.stream.createFrame(88);
                        Class21renamed.stream.writeWord(class80.anInt1458);
                        Class125.anInt2172++;
                    }
                }
            }
            if ((i_7_ ^ 0xffffffff) == -32) {
                Class21renamed.stream.createFrame(154);
                Class21renamed.stream.writeWordBigEndianA((byte) 19, i_8_);
                GroundData.anInt668++;
                Class21renamed.stream
                        .writeWordBigEndian(Class68_Sub20_Sub16.anInt4422, (byte) 38);
                Class21renamed.stream.writeWordBigEndian(i_9_, (byte) 38);
                Class21renamed.stream.writeDWordBigEndian((byte) 127, i_6_);
                Class21renamed.stream.writeDWordBigEndian((byte) 127,
                        Class107.anInt1821);
                Class68_Sub13_Sub24.anInt3833 = 0;
                Class1_Sub5.aClass45_2515
                        = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if ((i_7_ ^ 0xffffffff) == -33) {
                Class45 class45 = Class66.method637(i_6_, false, i_9_);
                if (class45 != null) {
                    Class9.method208((byte) 96);
                    Class102.method1631
                            ((byte) -113,
                                    Class1_Sub6_Sub2.method164(106,
                                            client.method41(class45)),
                                    i_9_, i_6_);
                    Class68_Sub13_Sub37.anInt4062 = 0;
                    Class7.aRSString_118 = Class8.method204(0, class45);
                    if (Class7.aRSString_118 == null)
                        Class7.aRSString_118
                                = Class68_Sub13_Sub3.aRSString_3480;
                    if (!class45.aBoolean863)
                        Class68_Sub13_Sub1.aRSString_3452
                                = (Class68_Sub20_Sub13_Sub2.method1166
                                (2, new RSString[]{Class48.aRSString_953,
                                        class45.aRSString_898,
                                        Class68.aRSString_1223}));
                    else
                        Class68_Sub13_Sub1.aRSString_3452
                                = (Class68_Sub20_Sub13_Sub2.method1166
                                (2, new RSString[]{class45.aRSString_890,
                                        Class68.aRSString_1223}));
                }
            } else {
                if (i_7_ == 8) {
                    boolean bool
                            = Class68_Sub13_Sub3.method713(0, 0,
                            (Class68_Sub7
                                    .aClass1_Sub6_Sub2_2860
                                    .anIntArray2523[0]),
                            (Class68_Sub7
                                    .aClass1_Sub6_Sub2_2860
                                    .anIntArray2570[0]),
                            0, 0, i_6_, false, 0,
                            -3, 2, i_9_);
                    if (!bool)
                        bool = (Class68_Sub13_Sub3.method713
                                (0, 0,
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2523[0]),
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2570[0]),
                                        1, 1, i_6_, false, 0, -3, 2, i_9_));
                    Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
                    client.anInt2376 = 2;
                    Class26.anInt523 = 0;
                    Class68_Sub13_Sub23.anInt3823++;
                    Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                    Class21renamed.stream.createFrame(9);
                    Class21renamed.stream
                            .writeWordA(Class68_Sub13_Sub33.anInt4001, -41);
                    Class21renamed.stream.writeWordBigEndianA((byte) 19, i_8_);
                    Class21renamed.stream
                            .writeDWord_v2(-19237, Class68_Sub28_Sub2.anInt4553);
                    Class21renamed.stream.writeWordBigEndianA
                            ((byte) 19, i_6_ + Class68_Sub13_Sub35.anInt4026);
                    Class21renamed.stream
                            .writeWord(Class1_Sub6_Sub2.anInt3399);
                    Class21renamed.stream
                            .writeWordBigEndian(i_9_ + Class36.anInt643, (byte) 38);
                }
                if ((i_7_ ^ 0xffffffff) == -15) {
                    Class68_Sub20_Sub11.anInt4336++;
                    Class21renamed.stream.createFrame(220);
                    Class21renamed.stream.writeDWordBigEndian((byte) 127, i_6_);
                    Class21renamed.stream.writeWordBigEndian(i_8_, (byte) 38);
                    Class21renamed.stream.writeWordA(i_9_, -96);
                    Class68_Sub13_Sub24.anInt3833 = 0;
                    Class1_Sub5.aClass45_2515
                            = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                    Class63.anInt1172 = i_9_;
                }
                if ((i_7_ ^ 0xffffffff) == -17) {
                    Class9.method208((byte) 114);
                    Class45 class45
                            = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                    Class68_Sub13_Sub37.anInt4062 = 1;
                    Class68_Sub13_Sub33.anInt4001 = i_8_;
                    Class68_Sub28_Sub2.anInt4553 = i_6_;
                    Class1_Sub6_Sub2.anInt3399 = i_9_;
                    Class113.method1682(class45, -120);
                    Class44.aRSString_743
                            = (Class68_Sub20_Sub13_Sub2.method1166
                            (2, (new RSString[]
                                    {Class68_Sub13_Sub10.aRSString_3588,
                                            (Applet_Sub1.method18(-25672, i_8_)
                                                    .aRSString_362),
                                            Class68.aRSString_1223})));
                    if (Class44.aRSString_743 == null)
                        Class44.aRSString_743
                                = Class68_Sub13_Sub32.aRSString_3982;
                } else {
                    if ((i_7_ ^ 0xffffffff) == -10) {
                        Class71.anInt1297++;
                        boolean bool = (Class68_Sub13_Sub3.method713
                                (0, 0,
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2523[0]),
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2570[0]),
                                        0, 0, i_6_, false, 0, -3, 2, i_9_));
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, i_6_, false, 0, -3, 2, i_9_));
                        Class26.anInt523 = 0;
                        Class68_Sub22.anInt3140
                                = Class68_Sub13_Sub37.anInt4077;
                        client.anInt2376 = 2;
                        Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                        Class21renamed.stream.createFrame(33);
                        Class21renamed.stream.writeWordBigEndianA
                                ((byte) 19, Class68_Sub13_Sub35.anInt4026 + i_6_);
                        Class21renamed.stream.writeWordBigEndian(i_8_,
                                (byte) 38);
                        Class21renamed.stream
                                .writeWord(i_9_ - -Class36.anInt643);
                    }
                    if ((i_7_ ^ 0xffffffff) == -6)
                        Class68_Sub13_Sub16.method774(GameSocket.anInt1149, i_9_,
                                i_6_);
                    if ((i_7_ ^ 0xffffffff) == -14) {
                        Class68_Sub13_Sub38.anInt4080++;
                        Class21renamed.stream.createFrame(134);
                        Class21renamed.stream.writeWord(i_8_);
                        Class21renamed.stream.writeWordBigEndianA((byte) 19,
                                i_9_);
                        Class21renamed.stream.writeDWordBigEndian((byte) 127,
                                i_6_);
                        Class68_Sub13_Sub24.anInt3833 = 0;
                        Class1_Sub5.aClass45_2515
                                = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 25) {
                        Class1_Sub6_Sub2 class1_sub6_sub2
                                = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                                [i_8_]);
                        if (class1_sub6_sub2 != null) {
                            Class68_Sub6.anInt2840++;
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub2.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub2.anIntArray2523[0]);
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class26.anInt523 = 0;
                            client.anInt2376 = 2;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class21renamed.stream.createFrame(68);
                            Class21renamed.stream
                                    .writeWordBigEndianA((byte) 19, i_8_);
                        }
                    }
                    if ((i_7_ ^ 0xffffffff) == -4) {
                        Class118.anInt2079++;
                        boolean bool = (Class68_Sub13_Sub3.method713
                                (0, 0,
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2523[0]),
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2570[0]),
                                        0, 0, i_6_, false, 0, -3, 2, i_9_));
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, i_6_, false, 0, -3, 2, i_9_));
                        client.anInt2376 = 2;
                        Class68_Sub22.anInt3140
                                = Class68_Sub13_Sub37.anInt4077;
                        Class26.anInt523 = 0;
                        Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                        Class21renamed.stream.createFrame(39);
                        Class21renamed.stream.writeWordBigEndian(i_8_,
                                (byte) 38);
                        Class21renamed.stream
                                .writeWordA(Class36.anInt643 + i_9_, -61);
                        Class21renamed.stream.writeWordBigEndian
                                (Class68_Sub13_Sub35.anInt4026 + i_6_, (byte) 38);
                    }
                    if (i_7_ == 1001) {
                        Class45 class45
                                = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        if (class45 != null
                                && class45.anIntArray774[i_9_] >= 100000)
                            Class48.method520
                                    (Class68_Sub28_Sub2.aRSString_4556, 125,
                                            (Class68_Sub20_Sub13_Sub2.method1166
                                                    (2, (new RSString[]
                                                            {(Class68_Sub13_Sub24.method816
                                                                    (class45.anIntArray774[i_9_], 0)),
                                                                    Class68_Sub13_Sub22.aRSString_3808,
                                                                    (Applet_Sub1.method18(-25672, i_8_)
                                                                            .aRSString_362)}))),
                                            0);
                        else {
                            Class21renamed.stream.createFrame(38);
                            Class21renamed.stream
                                    .writeWordBigEndianA((byte) 19, i_8_);
                            Class85.anInt1555++;
                        }
                        Class68_Sub13_Sub24.anInt3833 = 0;
                        Class1_Sub5.aClass45_2515
                                = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 50) {
                        Class1_Sub6_Sub2 class1_sub6_sub2
                                = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                                [i_8_]);
                        if (class1_sub6_sub2 != null) {
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub2.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub2.anIntArray2523[0]);
                            Class75_Sub3.anInt3319++;
                            client.anInt2376 = 2;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class26.anInt523 = 0;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class21renamed.stream.createFrame(70);
                            Class21renamed.stream.writeWord
                                    (Class68_Sub20_Sub16.anInt4422);
                            Class21renamed.stream
                                    .writeWordBigEndian(i_8_, (byte) 38);
                            Class21renamed.stream
                                    .writeDWord(Class107.anInt1821);
                        }
                    }
                    if (i_7_ == 1003) {
                        Class113.anInt1914++;
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21renamed.stream.createFrame(190);
                        Class21renamed.stream.writeWordBigEndian(Class68_Sub13_Sub35.anInt4026 + i_6_, (byte) 38);
                        Class21renamed.stream.writeWordBigEndianA((byte) 19, i_9_ - -Class36.anInt643);
                        Class21renamed.stream.writeWordBigEndianA
                                ((byte) 19, 0x7fffffff & (int) (l >>> -517571104));
                    }
                    if ((i_7_ ^ 0xffffffff) == -23) {
                        Class21renamed.stream.createFrame(211);
                        Class68_Sub20_Sub13_Sub2.anInt4619++;
                        Class21renamed.stream.writeDWordBigEndian((byte) 127, i_6_);
                        Class21renamed.stream.writeWordBigEndianA((byte) 19, i_9_);
                        Class21renamed.stream.writeWord(i_8_);
                        Class68_Sub13_Sub24.anInt3833 = 0;
                        Class1_Sub5.aClass45_2515 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 11) {
                        Class1_Sub6_Sub1 class1_sub6_sub1
                                = Class102.aClass1_Sub6_Sub1Array1746[i_8_];
                        if (class1_sub6_sub1 != null) {
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub1.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub1.anIntArray2523[0]);
                            Class26.anInt523 = 0;
                            client.anInt2376 = 2;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class67.anInt1216++;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class21renamed.stream.createFrame(221);
                            Class21renamed.stream
                                    .writeWordBigEndianA((byte) 19, i_8_);
                        }
                    }
                    if (i_7_ == 30) {
                        Class67.anInt1214++;
                        boolean bool = (Class68_Sub13_Sub3.method713
                                (0, 0,
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2523[0]),
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2570[0]),
                                        0, 0, i_6_, false, 0, -3, 2, i_9_));
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, i_6_, false, 0, -3, 2, i_9_));
                        Class68_Sub22.anInt3140
                                = Class68_Sub13_Sub37.anInt4077;
                        Class26.anInt523 = 0;
                        client.anInt2376 = 2;
                        Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                        Class21renamed.stream.createFrame(201);
                        Class21renamed.stream.writeWordA(Class68_Sub13_Sub35.anInt4026 + i_6_, -111);
                        Class21renamed.stream.writeWord(Class36.anInt643 + i_9_);
                        Class21renamed.stream.writeWordBigEndianA((byte) 19, i_8_);
                    }
                    if (i_7_ == 36) {
                        Class21renamed.stream.createFrame(113);
                        Class21renamed.stream.writeDWord(
                                i_6_);
                        GameException.anInt2235++;
                        Class45 class45
                                = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        if (class45.anIntArrayArray908 != null
                                && class45.anIntArrayArray908[0][0] == 5) {
                            int i_10_ = class45.anIntArrayArray908[0][1];
                            Class103.anIntArray1767[i_10_]
                                    = -Class103.anIntArray1767[i_10_] + 1;
                            Class68_Sub13_Sub35.method878((byte) 67, i_10_);
                        }
                    }
                    if ((i_7_ ^ 0xffffffff) == -45) {
                        Class1_Sub6_Sub1 class1_sub6_sub1
                                = Class102.aClass1_Sub6_Sub1Array1746[i_8_];
                        if (class1_sub6_sub1 != null) {
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub1.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub1.anIntArray2523[0]);
                            client.anInt2376 = 2;
                            Class16.anInt262++;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class26.anInt523 = 0;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class21renamed.stream.createFrame(24);
                            Class21renamed.stream.writeWordA(i_8_,
                                    -25);
                            Class21renamed.stream
                                    .writeDWord_v1((byte) -87, Class107.anInt1821);
                            Class21renamed.stream
                                    .writeWordA(Class68_Sub20_Sub16.anInt4422, -51);
                        }
                    }
                    if (i_7_ == 24) {
                        Class1_Sub6_Sub2 class1_sub6_sub2
                                = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                                [i_8_]);
                        if (class1_sub6_sub2 != null) {
                            Class68_Sub13_Sub28.anInt3927++;
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub2.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub2.anIntArray2523[0]);
                            client.anInt2376 = 2;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class26.anInt523 = 0;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class21renamed.stream.createFrame(160);
                            Class21renamed.stream
                                    .writeWordBigEndian(i_8_, (byte) 38);
                        }
                    }
                    if (i_7_ == 17) {
                        Class68_Sub20_Sub13.anInt4360++;
                        Class21renamed.stream.createFrame(3);
                        Class21renamed.stream.writeDWord_v2(-19237, i_6_);
                        Class21renamed.stream.writeWordBigEndian(i_8_, (byte) 38);
                        Class21renamed.stream.writeWordBigEndian(i_9_, (byte) 38);
                        Class68_Sub13_Sub24.anInt3833 = 0;
                        Class1_Sub5.aClass45_2515 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 10)
                        Class20.method320(636);
                    if (i_7_ == 34) {
                        boolean bool = (Class68_Sub13_Sub3.method713
                                (0, 0,
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2523[0]),
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2570[0]),
                                        0, 0, i_6_, false, 0, -3, 2, i_9_));
                        Class75_Sub3_Sub1.anInt4592++;
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, i_6_, false, 0, -3, 2, i_9_));
                        Class68_Sub22.anInt3140
                                = Class68_Sub13_Sub37.anInt4077;
                        Class26.anInt523 = 0;
                        Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                        client.anInt2376 = 2;
                        Class21renamed.stream.createFrame(81);
                        Class21renamed.stream
                                .writeWordA(i_9_ - -Class36.anInt643, -119);
                        Class21renamed.stream
                                .writeDWord(Class107.anInt1821);
                        Class21renamed.stream.writeWord
                                (Class68_Sub13_Sub35.anInt4026 + i_6_);
                        Class21renamed.stream.writeWordA(i_8_, -23);
                        Class21renamed.stream.writeWordBigEndian
                                (Class68_Sub20_Sub16.anInt4422, (byte) 38);
                    }
                    if ((i_7_ ^ 0xffffffff) == -47) {
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21renamed.stream.createFrame(46);
                        Class21renamed.stream.writeWordBigEndianA
                                ((byte) 19, Class68_Sub13_Sub35.anInt4026 + i_6_);
                        Class21renamed.stream
                                .writeWordBigEndianA((byte) 19, Class36.anInt643 + i_9_);
                        Class68_Sub26.anInt3207++;
                        Class21renamed.stream.writeWordA
                                ((int) (l >>> 415014368) & 0x7fffffff, -55);
                    }
                    int i_11_ = -68 % ((i - -6) / 56);
                    if ((i_7_ ^ 0xffffffff) == -29) {
                        GameException.anInt2235++;
                        Class21renamed.stream.createFrame(113);
                        Class21renamed.stream.writeDWord(
                                i_6_);
                        Class45 class45
                                = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        if (class45.anIntArrayArray908 != null
                                && ((class45.anIntArrayArray908[0][0] ^ 0xffffffff)
                                == -6)) {
                            int i_12_ = class45.anIntArrayArray908[0][1];
                            if ((class45.anIntArray791[0] ^ 0xffffffff)
                                    != (Class103.anIntArray1767[i_12_]
                                    ^ 0xffffffff)) {
                                Class103.anIntArray1767[i_12_]
                                        = class45.anIntArray791[0];
                                Class68_Sub13_Sub35.method878((byte) 67,
                                        i_12_);
                            }
                        }
                    }
                    if (i_7_ == 37
                            && Class75_Sub2.method1398(l, i_6_, -12974, i_9_)) {
                        Class68_Sub13_Sub8.anInt3562++;
                        Class21renamed.stream.createFrame(114);
                        Class21renamed.stream.writeWordBigEndian
                                (Class68_Sub13_Sub35.anInt4026 + i_6_, (byte) 38);
                        Class21renamed.stream.writeWordA
                                ((int) (l >>> -254697952) & 0x7fffffff, -80);
                        Class21renamed.stream
                                .writeWordA(i_9_ - -Class36.anInt643, -93);
                        Class21renamed.stream
                                .writeDWord_v2(-19237, Class107.anInt1821);
                        Class21renamed.stream.writeWordBigEndian
                                (Class68_Sub20_Sub16.anInt4422, (byte) 38);
                    }
                    if ((i_7_ ^ 0xffffffff) == -52 || i_7_ == 1007)
                        Class17.method298(i_6_, (byte) 78, i_8_,
                                Class33.aRSStringArray582[i_5_],
                                i_9_);
                    if ((i_7_ ^ 0xffffffff) == -39) {
                        Class104.anInt1785++;
                        Class21renamed.stream.createFrame(185);
                        Class21renamed.stream.writeDWord_v2(-19237,
                                i_6_);
                        Class21renamed.stream.writeWord(i_9_);
                        Class21renamed.stream.writeWordBigEndianA((byte) 19,
                                i_8_);
                        Class68_Sub13_Sub24.anInt3833 = 0;
                        Class1_Sub5.aClass45_2515
                                = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 42) {
                        Class13_Sub4.anInt2691++;
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21renamed.stream.createFrame(94);
                        Class21renamed.stream
                                .writeWordA(Class36.anInt643 + i_9_, -30);
                        Class21renamed.stream.writeWordBigEndian
                                (0x7fffffff & (int) (l >>> -633461408), (byte) 38);
                        Class21renamed.stream.writeWordBigEndianA
                                ((byte) 19, i_6_ - -Class68_Sub13_Sub35.anInt4026);
                    }
                    if (i_7_ == 47) {
                        Class20.anInt411++;
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21renamed.stream.createFrame(228);
                        Class21renamed.stream.writeWordA(Class68_Sub13_Sub35.anInt4026 + i_6_, -28);
                        Class21renamed.stream.writeWordBigEndian(0x7fffffff & (int) (l >>> -929600736), (byte) 38);
                        Class21renamed.stream.writeWordBigEndianA((byte) 19, i_9_ + Class36.anInt643);
                    }
                    if (i_7_ == 26) {
                        Class1_Sub6_Sub2 class1_sub6_sub2
                                = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                                [i_8_]);
                        if (class1_sub6_sub2 != null) {
                            Class68_Sub20_Sub15.anInt4398++;
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub2.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub2.anIntArray2523[0]);
                            Class26.anInt523 = 0;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            client.anInt2376 = 2;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class21renamed.stream.createFrame(93);
                            Class21renamed.stream
                                    .writeWordBigEndianA((byte) 19, i_8_);
                        }
                    }
                    if (i_7_ == 49) {
                        Class1_Sub6_Sub2 class1_sub6_sub2
                                = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                                [i_8_]);
                        if (class1_sub6_sub2 != null) {
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub2.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub2.anIntArray2523[0]);
                            Class68_Sub28_Sub2.anInt4539++;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            client.anInt2376 = 2;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class26.anInt523 = 0;
                            Class21renamed.stream.createFrame(37);
                            Class21renamed.stream.writeWord(i_8_);
                        }
                    }
                    if ((i_7_ ^ 0xffffffff) == -44) {
                        Class21renamed.stream.createFrame(45);
                        Class21renamed.stream.writeWord(i_8_);
                        Class13_Sub1.anInt2636++;
                        Class21renamed.stream.writeWordBigEndian(i_9_,
                                (byte) 38);
                        Class21renamed.stream.writeDWord(
                                i_6_);
                        Class68_Sub13_Sub24.anInt3833 = 0;
                        Class1_Sub5.aClass45_2515
                                = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 33) {
                        Class1_Sub6_Sub2 class1_sub6_sub2
                                = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                                [i_8_]);
                        if (class1_sub6_sub2 != null) {
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub2.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub2.anIntArray2523[0]);
                            client.anInt2376 = 2;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class112.anInt1877++;
                            Class26.anInt523 = 0;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class21renamed.stream.createFrame(253);
                            Class21renamed.stream
                                    .writeWordBigEndianA((byte) 19, i_8_);
                        }
                    }
                    if ((i_7_ ^ 0xffffffff) == -16) {
                        Class1_Sub6_Sub1 class1_sub6_sub1
                                = Class102.aClass1_Sub6_Sub1Array1746[i_8_];
                        if (class1_sub6_sub1 != null) {
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub1.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub1.anIntArray2523[0]);
                            Class101.anInt1737++;
                            client.anInt2376 = 2;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class26.anInt523 = 0;
                            Class21renamed.stream.createFrame(12);
                            Class21renamed.stream.writeDWordBigEndian
                                    ((byte) 127, Class68_Sub28_Sub2.anInt4553);
                            Class21renamed.stream.writeWord(
                                    i_8_);
                            Class21renamed.stream.writeWordBigEndianA
                                    ((byte) 19, Class1_Sub6_Sub2.anInt3399);
                            Class21renamed.stream.writeWordA
                                    (Class68_Sub13_Sub33.anInt4001, -124);
                        }
                    }
                    if (i_7_ == 45) {
                        Class68_Sub13.anInt2930++;
                        boolean bool = (Class68_Sub13_Sub3.method713
                                (0, 0,
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2523[0]),
                                        (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                .anIntArray2570[0]),
                                        0, 0, i_6_, false, 0, -3, 2, i_9_));
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, i_6_, false, 0, -3, 2, i_9_));
                        Class26.anInt523 = 0;
                        Class68_Sub22.anInt3140
                                = Class68_Sub13_Sub37.anInt4077;
                        client.anInt2376 = 2;
                        Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                        Class21renamed.stream.createFrame(150);
                        Class21renamed.stream.writeWordBigEndian
                                (i_6_ + Class68_Sub13_Sub35.anInt4026, (byte) 38);
                        Class21renamed.stream.writeWordA(i_8_, -66);
                        Class21renamed.stream
                                .writeWord(i_9_ + Class36.anInt643);
                    }
                    if (i_7_ == 48) {
                        Class1_Sub6_Sub1 class1_sub6_sub1
                                = Class102.aClass1_Sub6_Sub1Array1746[i_8_];
                        if (class1_sub6_sub1 != null) {
                            Class114.anInt1933++;
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub1.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub1.anIntArray2523[0]);
                            Class26.anInt523 = 0;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            client.anInt2376 = 2;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class21renamed.stream.createFrame(52);
                            Class21renamed.stream.writeWordBigEndianA((byte) 19, i_8_);
                        }
                    }
                    if (i_7_ == 19) {
                        Class1_Sub6_Sub2 class1_sub6_sub2
                                = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                                [i_8_]);
                        if (class1_sub6_sub2 != null) {
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub2.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub2.anIntArray2523[0]);
                            client.anInt2376 = 2;
                            Class26.anInt523 = 0;
                            Login.anInt1509++;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class21renamed.stream.createFrame(183);
                            Class21renamed.stream
                                    .writeWordBigEndian(i_8_, (byte) 38);
                        }
                    }
                    if ((i_7_ ^ 0xffffffff) == -24) {
                        Class45 class45
                                = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        boolean bool = true;
                        if ((class45.anInt808 ^ 0xffffffff) < -1)
                            bool = Class54.method554(class45, 29905);
                        if (bool) {
                            GameException.anInt2235++;
                            Class21renamed.stream.createFrame(113);
                            Class21renamed.stream
                                    .writeDWord(i_6_);
                        }
                    }
                    if (i_7_ == 21) {
                        Class1_Sub6_Sub1 class1_sub6_sub1
                                = Class102.aClass1_Sub6_Sub1Array1746[i_8_];
                        if (class1_sub6_sub1 != null) {
                            Class68_Sub13_Sub3.method713
                                    (0, 0,
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2523[0]),
                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                    .anIntArray2570[0]),
                                            1, 1, class1_sub6_sub1.anIntArray2570[0],
                                            false, 0, -3, 2,
                                            class1_sub6_sub1.anIntArray2523[0]);
                            Class26.anInt523 = 0;
                            Class68_Sub22.anInt3140
                                    = Class68_Sub13_Sub37.anInt4077;
                            Class68_Sub20_Sub3.anInt4201++;
                            client.anInt2376 = 2;
                            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
                            Class21renamed.stream.createFrame(199);
                            Class21renamed.stream
                                    .writeWordBigEndian(i_8_, (byte) 38);
                        }
                    }
                    if ((i_7_ ^ 0xffffffff) == -19) {
                        Class68_Sub13_Sub21.anInt3785++;
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21renamed.stream.createFrame(158);
                        Class21renamed.stream.writeWordBigEndian(Class36.anInt643 + i_9_, (byte) 38);
                        Class21renamed.stream.writeWord(0x7fffffff & (int) (l >>> -1689064352));
                        Class21renamed.stream.writeWordBigEndianA((byte) 19, Class68_Sub13_Sub35.anInt4026 + i_6_);
                    }
                    if ((i_7_ ^ 0xffffffff) == -58
                            && Class29.aClass45_539 == null) {
                        Class68_Sub13_Sub39.method905(i_9_, i_6_, 327685);
                        Class29.aClass45_539
                                = Class66.method637(i_6_, false, i_9_);
                        Class113.method1682(Class29.aClass45_539, -120);
                    }
                    if ((i_7_ ^ 0xffffffff) == -41) {
                        Class21renamed.stream.createFrame(186);
                        Class68_Sub22.anInt3142++;
                        Class21renamed.stream.writeDWordBigEndian((byte) 127, i_6_);
                        Class21renamed.stream.writeWordA(i_8_, -122);
                        Class21renamed.stream.writeWordBigEndianA((byte) 19, i_9_);
                        Class68_Sub13_Sub24.anInt3833 = 0;
                        Class1_Sub5.aClass45_2515 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if ((Class68_Sub13_Sub37.anInt4062 ^ 0xffffffff) != -1) {
                        Class68_Sub13_Sub37.anInt4062 = 0;
                        Class113.method1682((Class68_Sub20_Sub15.method1170
                                (Class68_Sub28_Sub2.anInt4553,
                                        (byte) -80)),
                                -114);
                    }
                    if (Class21_Sub1.aBoolean2705)
                        Class9.method208((byte) 77);
                    if (Class1_Sub5.aClass45_2515 != null
                            && (Class68_Sub13_Sub24.anInt3833 ^ 0xffffffff) == -1)
                        Class113.method1682(Class1_Sub5.aClass45_2515, -128);
                }
            }
        }
    }

    public void method1084(byte i, Stream class68_sub14) {
        anInt4270++;
        if (i != 45)
            method1079(-45, -100, 114);
        for (; ; ) {
            int i_13_ = class68_sub14.readUnsignedByte(-6677);
            if (i_13_ == 0)
                break;
            method1085(class68_sub14, i_13_, i ^ 0x370a);
        }
    }

    public void method1085(Stream class68_sub14, int i, int i_14_) {
        anInt4275++;
        if (i_14_ != 14119)
            anIntArrayArray4274 = null;
        if (i == 1)
            aRSStringArray4289
                    = class68_sub14.readString(i_14_ ^ 0x3758).method1620(0, 60);
        else if ((i ^ 0xffffffff) != -3) {
            if ((i ^ 0xffffffff) == -4) {
                int i_15_ = class68_sub14.readUnsignedByte(-6677);
                anIntArray4285 = new int[i_15_];
                anIntArrayArray4274 = new int[i_15_][];
                for (int i_16_ = 0; i_15_ > i_16_; i_16_++) {
                    int i_17_ = class68_sub14.readUnsignedWord(1355769544);
                    anIntArray4285[i_16_] = i_17_;
                    anIntArrayArray4274[i_16_]
                            = new int[Class68_Sub13_Sub37.anIntArray4056[i_17_]];
                    for (int i_18_ = 0;
                         Class68_Sub13_Sub37.anIntArray4056[i_17_] > i_18_;
                         i_18_++)
                        anIntArrayArray4274[i_16_][i_18_]
                                = class68_sub14.readUnsignedWord(1355769544);
                }
            }
        } else {
            int i_19_ = class68_sub14.readUnsignedByte(-6677);
            anIntArray4277 = new int[i_19_];
            for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff);
                 i_20_++)
                anIntArray4277[i_20_] = class68_sub14.readUnsignedWord(1355769544);
        }
    }

    public static void method1086(int i, int i_21_) {
        anInt4276++;
        if (i == 0)
            Class68_Sub13_Sub28.aClass98_3923.method1564(i ^ ~0x494e, i_21_);
    }

    public static void method1087(int i) {
        anInt4287++;
        if (i != 0)
            method1095();
        Class91.aClass98_1636.method1567(-28);
        Class11.aClass98_193.method1567(122);
    }

    public RSString method1088(int i) {
        anInt4288++;
        RSString class100 = Class21renamed.method339(-18982, 80);
        if (aRSStringArray4289 == null)
            return Class68_Sub25.aRSString_3164;
        int i_22_ = 58 % ((-6 - i) / 43);
        class100.method1618(aRSStringArray4289[0], 12147);
        for (int i_23_ = 1; i_23_ < aRSStringArray4289.length; i_23_++) {
            class100.method1618(Class67.aRSString_1206, 12147);
            class100.method1618(aRSStringArray4289[i_23_], 12147);
        }
        return class100.method1587(true);
    }

    public static RSString method1089(int i, boolean bool, int i_24_) {
        anInt4271++;
        int i_25_ = -i + i_24_;
        if (i_25_ < -9)
            return Class71_Sub1.aRSString_3256;
        if ((i_25_ ^ 0xffffffff) > 5)
            return ISAACRandomGen.aRSString_1488;
        if (bool != true)
            return null;
        if ((i_25_ ^ 0xffffffff) > 2)
            return Class68_Sub20_Sub11.aRSString_4334;
        if ((i_25_ ^ 0xffffffff) > -1)
            return ISAACRandomGen.aRSString_1478;
        if (i_25_ > 9)
            return Class48.aRSString_953;
        if (i_25_ > 6)
            return Class128.aRSString_2221;
        if ((i_25_ ^ 0xffffffff) < -4)
            return Class97.aRSString_1710;
        if ((i_25_ ^ 0xffffffff) < -1)
            return Class103.aRSString_1769;
        return PacketStream.aRSString_4121;
    }

    public void method1090(byte i) {
        anInt4283++;
        if (anIntArray4277 != null) {
            for (int i_26_ = 0; i_26_ < anIntArray4277.length; i_26_++)
                anIntArray4277[i_26_]
                        = Class70.method1335(anIntArray4277[i_26_], 32768);
        }
        if (i != 38)
            method1079(120, -71, -4);
    }

    public static void method1091(int i, int i_27_) {
        anInt4269++;
        Class68_Sub13_Sub2.aClass98_3459.method1564(-18767, i_27_);
        if (i != 190)
            aClass21_4290 = null;
        Class75_Sub1_Sub1.aClass98_4577.method1564(-18767, i_27_);
    }

    public static void method1092(int i) {
        aClass21_4290 = null;
        aRSString_4282 = null;
        if (i != 1)
            aClass21_4290 = null;
        aClass21_4279 = null;
    }

    public RSString method1093(int i, Stream class68_sub14) {
        anInt4273++;
        int i_28_ = -92 / ((33 - i) / 34);
        RSString class100 = Class21renamed.method339(-18982, 80);
        if (anIntArray4285 != null) {
            for (int i_29_ = 0; (anIntArray4285.length ^ 0xffffffff) < (i_29_ ^ 0xffffffff); i_29_++) {
                class100.method1618(aRSStringArray4289[i_29_], 12147);
                class100.method1618(Class68_Sub8.method671(anIntArrayArray4274[i_29_], (class68_sub14.method908((Class75_Sub3_Sub1.anIntArray4599[anIntArray4285[i_29_]]), (byte) -41)), -1, anIntArray4285[i_29_]), 12147);
            }
        }
        class100.method1618(aRSStringArray4289[-1 + aRSStringArray4289.length], 12147);
        return class100.method1587(true);
    }

    public static int method1094(int i, int i_30_) {
        if (i_30_ != 654593194)
            aClass21_4279 = null;
        anInt4284++;
        return i >>> 654593194;
    }

    public static void method1095() {
        Class1_Sub7.anInt2597 = 0;
        while_17_:
        for (int i = 0; i < Class54.anInt1029; i++) {
            Class8 class8 = Class121.aClass8Array2102[i];
            if (Class68_Sub13_Sub10.anIntArray3591 != null) {
                for (int i_31_ = 0;
                     i_31_ < Class68_Sub13_Sub10.anIntArray3591.length;
                     i_31_++) {
                    if (Class68_Sub13_Sub10.anIntArray3591[i_31_] != -1000000
                            && ((class8.anInt152
                            <= Class68_Sub13_Sub10.anIntArray3591[i_31_])
                            || (class8.anInt150
                            <= Class68_Sub13_Sub10.anIntArray3591[i_31_]))
                            && (class8.anInt159 <= Class55.anIntArray2042[i_31_]
                            || (class8.anInt162
                            <= Class55.anIntArray2042[i_31_]))
                            && ((class8.anInt159
                            >= Class68_Sub22.anIntArray3137[i_31_])
                            || (class8.anInt162
                            >= Class68_Sub22.anIntArray3137[i_31_]))
                            && ((class8.anInt148
                            <= Class68_Sub16.anIntArray3029[i_31_])
                            || (class8.anInt147
                            <= Class68_Sub16.anIntArray3029[i_31_]))
                            && (class8.anInt148 >= Class53.anIntArray1020[i_31_]
                            || (class8.anInt147
                            >= Class53.anIntArray1020[i_31_])))
                        continue while_17_;
                }
            }
            if (class8.anInt142 == 1) {
                int i_32_ = (class8.anInt146 - Class68_Sub20_Sub10.anInt4319
                        + Class68_Sub20_Sub14.anInt4384);
                if (i_32_ >= 0 && i_32_ <= (Class68_Sub20_Sub14.anInt4384
                        + Class68_Sub20_Sub14.anInt4384)) {
                    int i_33_ = (class8.anInt145 - Class68_Sub26.anInt3186
                            + Class68_Sub20_Sub14.anInt4384);
                    if (i_33_ < 0)
                        i_33_ = 0;
                    int i_34_ = (class8.anInt156 - Class68_Sub26.anInt3186
                            + Class68_Sub20_Sub14.anInt4384);
                    if (i_34_ > (Class68_Sub20_Sub14.anInt4384
                            + Class68_Sub20_Sub14.anInt4384))
                        i_34_ = (Class68_Sub20_Sub14.anInt4384
                                + Class68_Sub20_Sub14.anInt4384);
                    boolean bool = false;
                    while (i_33_ <= i_34_) {
                        if (Class68_Sub9.aBooleanArrayArray2887[i_32_]
                                [i_33_++]) {
                            bool = true;
                            break;
                        }
                    }
                    if (bool) {
                        int i_35_ = Class25.anInt518 - class8.anInt159;
                        if (i_35_ > 32)
                            class8.anInt141 = 1;
                        else {
                            if (i_35_ >= -32)
                                continue;
                            class8.anInt141 = 2;
                            i_35_ = -i_35_;
                        }
                        class8.anInt138
                                = (class8.anInt148 - Class68_Sub20_Sub12.anInt4355
                                << 8) / i_35_;
                        class8.anInt157
                                = (class8.anInt147 - Class68_Sub20_Sub12.anInt4355
                                << 8) / i_35_;
                        class8.anInt153
                                = ((class8.anInt152 - Class68_Sub17.anInt3033 << 8)
                                / i_35_);
                        class8.anInt143
                                = ((class8.anInt150 - Class68_Sub17.anInt3033 << 8)
                                / i_35_);
                        Class68_Sub25.aClass8Array3168[Class1_Sub7.anInt2597++]
                                = class8;
                    }
                }
            } else if (class8.anInt142 == 2) {
                int i_36_ = (class8.anInt145 - Class68_Sub26.anInt3186
                        + Class68_Sub20_Sub14.anInt4384);
                if (i_36_ >= 0 && i_36_ <= (Class68_Sub20_Sub14.anInt4384
                        + Class68_Sub20_Sub14.anInt4384)) {
                    int i_37_
                            = (class8.anInt146 - Class68_Sub20_Sub10.anInt4319
                            + Class68_Sub20_Sub14.anInt4384);
                    if (i_37_ < 0)
                        i_37_ = 0;
                    int i_38_
                            = (class8.anInt149 - Class68_Sub20_Sub10.anInt4319
                            + Class68_Sub20_Sub14.anInt4384);
                    if (i_38_ > (Class68_Sub20_Sub14.anInt4384
                            + Class68_Sub20_Sub14.anInt4384))
                        i_38_ = (Class68_Sub20_Sub14.anInt4384
                                + Class68_Sub20_Sub14.anInt4384);
                    boolean bool = false;
                    while (i_37_ <= i_38_) {
                        if (Class68_Sub9.aBooleanArrayArray2887[i_37_++]
                                [i_36_]) {
                            bool = true;
                            break;
                        }
                    }
                    if (bool) {
                        int i_39_
                                = Class68_Sub20_Sub12.anInt4355 - class8.anInt148;
                        if (i_39_ > 32)
                            class8.anInt141 = 3;
                        else {
                            if (i_39_ >= -32)
                                continue;
                            class8.anInt141 = 4;
                            i_39_ = -i_39_;
                        }
                        class8.anInt139 = (class8.anInt159 - Class25.anInt518
                                << 8) / i_39_;
                        class8.anInt144 = (class8.anInt162 - Class25.anInt518
                                << 8) / i_39_;
                        class8.anInt153
                                = ((class8.anInt152 - Class68_Sub17.anInt3033 << 8)
                                / i_39_);
                        class8.anInt143
                                = ((class8.anInt150 - Class68_Sub17.anInt3033 << 8)
                                / i_39_);
                        Class68_Sub25.aClass8Array3168[Class1_Sub7.anInt2597++]
                                = class8;
                    }
                }
            } else if (class8.anInt142 == 4) {
                int i_40_ = class8.anInt152 - Class68_Sub17.anInt3033;
                if (i_40_ > 128) {
                    int i_41_ = (class8.anInt145 - Class68_Sub26.anInt3186
                            + Class68_Sub20_Sub14.anInt4384);
                    if (i_41_ < 0)
                        i_41_ = 0;
                    int i_42_ = (class8.anInt156 - Class68_Sub26.anInt3186
                            + Class68_Sub20_Sub14.anInt4384);
                    if (i_42_ > (Class68_Sub20_Sub14.anInt4384
                            + Class68_Sub20_Sub14.anInt4384))
                        i_42_ = (Class68_Sub20_Sub14.anInt4384
                                + Class68_Sub20_Sub14.anInt4384);
                    if (i_41_ <= i_42_) {
                        int i_43_
                                = (class8.anInt146 - Class68_Sub20_Sub10.anInt4319
                                + Class68_Sub20_Sub14.anInt4384);
                        if (i_43_ < 0)
                            i_43_ = 0;
                        int i_44_
                                = (class8.anInt149 - Class68_Sub20_Sub10.anInt4319
                                + Class68_Sub20_Sub14.anInt4384);
                        if (i_44_ > (Class68_Sub20_Sub14.anInt4384
                                + Class68_Sub20_Sub14.anInt4384))
                            i_44_ = (Class68_Sub20_Sub14.anInt4384
                                    + Class68_Sub20_Sub14.anInt4384);
                        boolean bool = false;
                        while_15_:
                        for (int i_45_ = i_43_; i_45_ <= i_44_; i_45_++) {
                            for (int i_46_ = i_41_; i_46_ <= i_42_; i_46_++) {
                                if (Class68_Sub9.aBooleanArrayArray2887[i_45_]
                                        [i_46_]) {
                                    bool = true;
                                    break while_15_;
                                }
                            }
                        }
                        if (bool) {
                            class8.anInt141 = 5;
                            class8.anInt139
                                    = ((class8.anInt159 - Class25.anInt518 << 8)
                                    / i_40_);
                            class8.anInt144
                                    = ((class8.anInt162 - Class25.anInt518 << 8)
                                    / i_40_);
                            class8.anInt138
                                    = ((class8.anInt148
                                    - Class68_Sub20_Sub12.anInt4355)
                                    << 8) / i_40_;
                            class8.anInt157
                                    = ((class8.anInt147
                                    - Class68_Sub20_Sub12.anInt4355)
                                    << 8) / i_40_;
                            Class68_Sub25.aClass8Array3168
                                    [Class1_Sub7.anInt2597++]
                                    = class8;
                        }
                    }
                }
            }
        }
    }
}
