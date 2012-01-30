/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class17 {

    public static int anInt279;
    public static int anInt280;
    public static int anInt281;
    public static int anInt282;
    public static int[] anIntArray283;
    public static boolean aBoolean284 = true;
    public static int anInt285;

    public static void method295(int i) {
        anIntArray283 = null;
        if (i != 1) {
            method297(-128, -96, 87, -108, -32, -125);
        }
    }

    public static void method296(int i, byte i_0_) {
        if (i_0_ >= -66) {
            aBoolean284 = true;
        }
        anInt282++;
        if (i != GameException.anInt2231) {
            if (GameException.anInt2231 == 0) {
                Class68_Sub20_Sub2.method1044((byte) -79);
            }
            if ((i ^ 0xffffffff) == -41) {
                Class16.method283(Class68_Sub28_Sub2.password, 104,
                        Class68_Sub28_Sub2.username,
                        Class68_Sub13_Sub5.anInt3518);
            }
            boolean bool = ((i ^ 0xffffffff) == -6 || (i ^ 0xffffffff) == -11 || (i ^ 0xffffffff) == -29);
            if ((i ^ 0xffffffff) != -41 && Class106.aClass61_1798 != null) {
                Class106.aClass61_1798.method594(-23);
                Class106.aClass61_1798 = null;
            }
            if (i == 25 || i == 28) {
                Class68_Sub13_Sub19.anInt3748 = 0;
                Class68_Sub13_Sub11.anInt3602 = 1;
                Class50_Sub2.anInt2745 = 1;
                Class21renamed.anInt480 = 0;
                Class45.anInt925 = 0;
                Class68_Sub13_Sub34.method875((byte) 108);
            }
            if ((i ^ 0xffffffff) == -6) {
                Class75.method1386(-10509, Class52.aClass21_Sub1_1011);
            } else {
                Class13_Sub1.method253(20);
            }
            boolean bool_1_ = (GameException.anInt2231 == 5 || (GameException.anInt2231 ^ 0xffffffff) == -11 || (GameException.anInt2231 ^ 0xffffffff) == -29);
            if (!bool_1_ != !bool) {
                if (bool) {
                    Class101.anInt1745 = Class68_Sub13_Sub15.anInt3681;
                    if (Class68_Sub13_Sub25.anInt3855 != 0) {
                        PacketParser.method1662(false, 0, 2,
                                Class68_Sub13_Sub15.anInt3681,
                                Class21renamed.aClass21_Sub1_459, false,
                                255);
                    } else {
                        Class68_Sub13.method692(2, (byte) 125);
                    }
                    Class50.method530(false, false);
                } else {
                    Class68_Sub13.method692(2, (byte) 127);
                    Class50.method530(true, false);
                }
            }
            GameException.anInt2231 = i;
        }
    }

    public static void method297(int i, int i_2_, int i_3_, int i_4_, int i_5_,
                                 int i_6_) {
        anInt285++;
        Class34.method416(i_4_, (byte) -17, i_2_,
                Class68_Sub22.anIntArrayArray3132[i_3_++], i);
        Class34.method416(i_4_, (byte) -17, i_2_,
                Class68_Sub22.anIntArrayArray3132[i_5_--], i);
        for (int i_7_ = i_3_; i_7_ <= i_5_; i_7_++) {
            int[] is = Class68_Sub22.anIntArrayArray3132[i_7_];
            is[i_4_] = is[i] = i_2_;
        }
        if (i_6_ < 12) {
            anIntArray283 = null;
        }
    }

    public static void method298(int i, byte i_8_, int i_9_, RSString class100,
                                 int i_10_) {
        Class45 class45 = Class66.method637(i, false, i_10_);
        anInt281++;
        if (class45 != null) {
            if (class45.anObjectArray856 != null) {
                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                class68_sub29.aRSString_3234 = class100;
                class68_sub29.aClass45_3239 = class45;
                class68_sub29.anObjectArray3237 = class45.anObjectArray856;
                class68_sub29.anInt3246 = i_9_;
                Class68_Sub13_Sub16.method776(class68_sub29, 16);
            }
            boolean bool = true;
            if (class45.anInt808 > 0) {
                bool = Class54.method554(class45, 29905);
            }
            if (i_8_ <= 38) {
                method297(21, 24, -15, -70, -12, 109);
            }
            if (bool && Class68_Sub13_Sub20.method803(-1 + i_9_,
                    client.method41(class45),
                    -32276)) {
                if ((i_9_ ^ 0xffffffff) == -2) {
                    Class103.anInt1772++;
                    Class21renamed.stream.createFrame(233);
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
                if ((i_9_ ^ 0xffffffff) == -3) {
                    Class71_Sub1.anInt3253++;
                    Class21renamed.stream.createFrame(21);
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
                if (i_9_ == 3) {
                    Class102.anInt1750++;
                    Class21renamed.stream.createFrame(169);
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
                if (i_9_ == 4) {
                    Class21renamed.stream.createFrame(214);
                    PacketStream.anInt4111++;
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
                if (i_9_ == 5) {
                    Class57.anInt1079++;
                    Class21renamed.stream.createFrame(173);
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
                if (i_9_ == 6) {
                    Class68_Sub13_Sub6.anInt3527++;
                    Class21renamed.stream.createFrame(232);
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
                if ((i_9_ ^ 0xffffffff) == -8) {
                    Class75_Sub3_Sub1.anInt4600++;
                    Class21renamed.stream.createFrame(133);
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
                if ((i_9_ ^ 0xffffffff) == -9) {
                    Class21renamed.stream.createFrame(102);
                    Class68_Sub13_Sub34.anInt4011++;
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
                if (i_9_ == 9) {
                    Class21renamed.stream.createFrame(226);
                    Class72_Sub1.anInt3282++;
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
                if (i_9_ == 10) {
                    Class29.anInt534++;
                    Class21renamed.stream.createFrame(90);
                    Class21renamed.stream.writeDWord(i);
                    Class21renamed.stream.writeWord(i_10_);
                }
            }
        }
    }


    static {
        anInt279 = -1;
    }
}
