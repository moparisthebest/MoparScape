/* Class68_Sub20_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub12 extends Class68_Sub20 {
    public static int anInt4343;
    public RSString aRSString_4344;
    public int anInt4345;
    public static int anInt4346;
    public static int anInt4347;
    public static Class98 aClass98_4348 = new Class98(64);
    public static int anInt4349;
    public int anInt4350;
    public static int anInt4351;
    public static int anInt4352 = 0;
    public static int[][][] anIntArrayArrayArray4353;
    public static int anInt4354;
    public static int anInt4355;

    public static void method1150(int i, int i_0_) {
        if (i != 9)
            method1152(false);
        anInt4346++;
        Class68_Sub13_Sub27.aClass98_3893.method1564(-18767, i_0_);
        Class68_Sub20_Sub14.aClass98_4372.method1564(-18767, i_0_);
    }

    public static boolean method1151(int i, int i_1_, int i_2_, int i_3_,
                                     int i_4_) {
        int i_5_ = i_3_ * Class128.anInt2220 + i * Class16.anInt278 >> 16;
        int i_6_ = i_3_ * Class16.anInt278 - i * Class128.anInt2220 >> 16;
        int i_7_
                = i_1_ * Class13_Sub2.anInt2651 + i_6_ * Class66.anInt1205 >> 16;
        int i_8_
                = i_1_ * Class66.anInt1205 - i_6_ * Class13_Sub2.anInt2651 >> 16;
        if (i_7_ < 1)
            i_7_ = 1;
        int i_9_ = (i_5_ << 9) / i_7_;
        int i_10_ = (i_8_ << 9) / i_7_;
        int i_11_
                = i_2_ * Class13_Sub2.anInt2651 + i_6_ * Class66.anInt1205 >> 16;
        int i_12_
                = i_2_ * Class66.anInt1205 - i_6_ * Class13_Sub2.anInt2651 >> 16;
        if (i_11_ < 1)
            i_11_ = 1;
        int i_13_ = (i_5_ << 9) / i_11_;
        int i_14_ = (i_12_ << 9) / i_11_;
        if (i_7_ < 50 && i_11_ < 50)
            return false;
        if (i_7_ > i_4_ && i_11_ > i_4_)
            return false;
        if (i_9_ < Class80.anInt1427 && i_13_ < Class80.anInt1427)
            return false;
        if (i_9_ > PacketParser.anInt1875 && i_13_ > PacketParser.anInt1875)
            return false;
        if (i_10_ < Animable.anInt63 && i_14_ < Animable.anInt63)
            return false;
        if (i_10_ > Class68_Sub13_Sub38.anInt4079
                && i_14_ > Class68_Sub13_Sub38.anInt4079)
            return false;
        return true;
    }

    public static void method1152(boolean bool) {
        if (bool != true)
            method1151(29, 48, -43, -20, -24);
        aClass98_4348 = null;
        anIntArrayArrayArray4353 = null;
    }

    public void method1153(Stream class68_sub14, int i, int i_15_) {
        if (i != 5)
            method1155(29);
        if ((i_15_ ^ 0xffffffff) == -2)
            anInt4350 = class68_sub14.readUnsignedByte(i + -6682);
        else if ((i_15_ ^ 0xffffffff) != -3) {
            if (i_15_ == 5)
                aRSString_4344 = class68_sub14.readString(i + 122);
        } else
            anInt4345 = class68_sub14.readDWord();
        anInt4343++;
    }

    public static void method1154(Class1_Sub6 class1_sub6, int i) {
        class1_sub6.aBoolean2583 = false;
        if (class1_sub6.anInt2524 != -1) {
            Class55 class117
                    = Class64.method624((byte) -36, class1_sub6.anInt2524);
            if (class117 == null || class117.anIntArray2035 == null)
                class1_sub6.anInt2524 = -1;
            else {
                class1_sub6.anInt2577++;
                if (((class1_sub6.anInt2555 ^ 0xffffffff)
                        > (class117.anIntArray2035.length ^ 0xffffffff))
                        && (class117.anIntArray2058[class1_sub6.anInt2555]
                        < class1_sub6.anInt2577)) {
                    class1_sub6.anInt2577 = 1;
                    class1_sub6.anInt2555++;
                    Class44.method489(false, class1_sub6.anInt2555,
                            class1_sub6.anInt2561, class117,
                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    == class1_sub6),
                            class1_sub6.anInt2537);
                }
                if ((class1_sub6.anInt2555 ^ 0xffffffff)
                        <= (class117.anIntArray2035.length ^ 0xffffffff)) {
                    class1_sub6.anInt2555 = 0;
                    class1_sub6.anInt2577 = 0;
                    Class44.method489(false, class1_sub6.anInt2555,
                            class1_sub6.anInt2561, class117,
                            (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    == class1_sub6),
                            class1_sub6.anInt2537);
                }
            }
        }
        if (class1_sub6.anInt2552 != -1
                && (class1_sub6.anInt2541 ^ 0xffffffff) >= (Class68_Sub3.anInt2812
                ^ 0xffffffff)) {
            if ((class1_sub6.anInt2578 ^ 0xffffffff) > -1)
                class1_sub6.anInt2578 = 0;
            int i_16_ = (Class68_Sub20_Sub13.method1160
                    (class1_sub6.anInt2552, 1).anInt1282);
            if ((i_16_ ^ 0xffffffff) != 0) {
                Class55 class117 = Class64.method624((byte) -36, i_16_);
                if (class117 != null && class117.anIntArray2035 != null) {
                    class1_sub6.anInt2586++;
                    if (((class1_sub6.anInt2578 ^ 0xffffffff)
                            > (class117.anIntArray2035.length ^ 0xffffffff))
                            && ((class117.anIntArray2058[class1_sub6.anInt2578]
                            ^ 0xffffffff)
                            > (class1_sub6.anInt2586 ^ 0xffffffff))) {
                        class1_sub6.anInt2586 = 1;
                        class1_sub6.anInt2578++;
                        Class44.method489(false, class1_sub6.anInt2578,
                                class1_sub6.anInt2561, class117,
                                (class1_sub6
                                        == (Class68_Sub7
                                        .aClass1_Sub6_Sub2_2860)),
                                class1_sub6.anInt2537);
                    }
                    if ((class117.anIntArray2035.length ^ 0xffffffff)
                            >= (class1_sub6.anInt2578 ^ 0xffffffff))
                        class1_sub6.anInt2552 = -1;
                } else
                    class1_sub6.anInt2552 = -1;
            } else
                class1_sub6.anInt2552 = -1;
        }
        anInt4347++;
        if (i != 1)
            anInt4352 = -38;
        if ((class1_sub6.anInt2568 ^ 0xffffffff) != 0
                && (class1_sub6.anInt2545 ^ 0xffffffff) >= -2) {
            Class55 class117
                    = Class64.method624((byte) -36, class1_sub6.anInt2568);
            if (class117.anInt2043 == 1 && class1_sub6.anInt2557 > 0
                    && Class68_Sub3.anInt2812 >= class1_sub6.anInt2550
                    && ((Class68_Sub3.anInt2812 ^ 0xffffffff)
                    < (class1_sub6.anInt2521 ^ 0xffffffff))) {
                class1_sub6.anInt2545 = 1;
                return;
            }
        }
        if (class1_sub6.anInt2568 != -1 && class1_sub6.anInt2545 == 0) {
            Class55 class117
                    = Class64.method624((byte) -36, class1_sub6.anInt2568);
            if (class117 != null && class117.anIntArray2035 != null) {
                class1_sub6.anInt2556++;
                if (class1_sub6.anInt2522 < class117.anIntArray2035.length
                        && (class117.anIntArray2058[class1_sub6.anInt2522]
                        ^ 0xffffffff) > (class1_sub6.anInt2556 ^ 0xffffffff)) {
                    class1_sub6.anInt2556 = 1;
                    class1_sub6.anInt2522++;
                    Class44.method489(false, class1_sub6.anInt2522,
                            class1_sub6.anInt2561, class117,
                            (class1_sub6
                                    == Class68_Sub7.aClass1_Sub6_Sub2_2860),
                            class1_sub6.anInt2537);
                }
                if (class1_sub6.anInt2522 >= class117.anIntArray2035.length) {
                    class1_sub6.anInt2522 -= class117.anInt2072;
                    class1_sub6.anInt2549++;
                    if (class1_sub6.anInt2549 >= class117.anInt2037)
                        class1_sub6.anInt2568 = -1;
                    else if ((class1_sub6.anInt2522 ^ 0xffffffff) <= -1
                            && ((class117.anIntArray2035.length ^ 0xffffffff)
                            < (class1_sub6.anInt2522 ^ 0xffffffff)))
                        Class44.method489(false, class1_sub6.anInt2522,
                                class1_sub6.anInt2561, class117,
                                (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                        == class1_sub6),
                                class1_sub6.anInt2537);
                    else
                        class1_sub6.anInt2568 = -1;
                }
                class1_sub6.aBoolean2583 = class117.aBoolean2054;
            } else
                class1_sub6.anInt2568 = -1;
        }
        if (class1_sub6.anInt2545 > 0)
            class1_sub6.anInt2545--;
    }

    public boolean method1155(int i) {
        anInt4351++;
        if (i != 115)
            method1151(-88, -16, 25, 34, 28);
        if (anInt4350 != 115)
            return false;
        return true;
    }

    public void method1156(int i, Stream class68_sub14) {
        if (i != 1)
            anInt4352 = 122;
        anInt4349++;
        for (; ; ) {
            int i_17_ = class68_sub14.readUnsignedByte(-6677);
            if (i_17_ == 0)
                break;
            method1153(class68_sub14, i ^ 0x4, i_17_);
        }
    }
}
