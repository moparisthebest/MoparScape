/* Class68_Sub13_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub31 extends Class68_Sub13 {
    public int anInt3955;
    public static int anInt3956;
    public static int anInt3957;
    public int anInt3958 = 0;
    public int[] anIntArray3959;
    public static int anInt3960;
    public static int anInt3961;
    public static int anInt3962;
    public static Class16 aClass16_3963 = new Class16();
    public int[] anIntArray3964;
    public static int anInt3965;
    public static int anInt3966;
    public static int anInt3967;
    public int anInt3968;
    public static int[] anIntArray3969;
    public static int[] anIntArray3970 = new int[32];
    public static Class21_Sub1 aClass21_Sub1_3971;
    public static int anInt3972;
    public static Class92_Sub1[] aClass92_Sub1Array3973;
    public static int anInt3974;
    public static int anInt3975;
    public static RSString aRSString_3976;
    public static int anInt3977;

    public Class68_Sub13_Sub31() {
        super(0, true);
        anInt3955 = 10;
        anInt3968 = 2048;
    }

    public void method690(byte i) {
        method856(-1);
        if (i > -22)
            anIntArray3964 = null;
        anInt3962++;
    }

    public static Sprite method854(int i, Class21renamed class21,
                                   int i_0_, int i_1_) {
        anInt3965++;
        if (i <= 49)
            anIntArray3969 = null;
        if (!Class68_Sub13_Sub36.method880(-29381, i_1_, class21, i_0_))
            return null;
        return Class74.method1380(-14452);
    }

    public static void method855(byte i) {
        int i_2_ = -14 / ((-23 - i) / 50);
        Class68_Sub20_Sub13.aClass98_4359.method1566((byte) 94);
        anInt3961++;
    }

    public void method856(int i) {
        anIntArray3964 = new int[anInt3955 - i];
        int i_3_ = 0;
        anInt3957++;
        anIntArray3959 = new int[anInt3955 + 1];
        int i_4_ = 4096 / anInt3955;
        int i_5_ = i_4_ * anInt3968 >> -1297789620;
        for (int i_6_ = 0; i_6_ < anInt3955; i_6_++) {
            anIntArray3964[i_6_] = i_3_;
            anIntArray3959[i_6_] = i_5_ + i_3_;
            i_3_ += i_4_;
        }
        anIntArray3964[anInt3955] = 4096;
        anIntArray3959[anInt3955] = anIntArray3959[0] + 4096;
    }

    public static void method857(int i, int i_7_, boolean bool, int i_8_,
                                 boolean bool_9_, int i_10_) {
        Class3.anInt84++;
        anInt3967++;
        if (!bool_9_) {
            Class68_Sub13_Sub27.method843(64, true);
            Class68_Sub9.method678(true, -125);
            Class68_Sub13_Sub27.method843(64, false);
        }
        Class68_Sub9.method678(bool, -127);
        if (!bool_9_)
            Class106.method1648((byte) -92);
        Class13_Sub4.method264(-1);
        if ((Class128.anInt2214 ^ 0xffffffff) == -2) {
            int i_11_ = Class16.anInt275;
            if ((i_11_ ^ 0xffffffff)
                    > (Class68_Sub29.anInt3233 / 256 ^ 0xffffffff))
                i_11_ = Class68_Sub29.anInt3233 / 256;
            if (Class69.aBooleanArray1237[4]
                    && i_11_ < Class11.anIntArray196[4] + 128)
                i_11_ = Class11.anIntArray196[4] + 128;
            int i_12_
                    = Class8.anInt163 + Class68_Sub13_Sub28.anInt3920 & 0x7ff;
            Class68_Sub24.method1208
                    (i_10_, i_12_, Class68_Sub20_Sub2.anInt4186,
                            (Class1_Sub6_Sub2.method163
                                    (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561,
                                            GameSocket.anInt1149,
                                            Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537, bool)) - 50,
                            600 - -(3 * i_11_), Class68_Sub20_Sub18.anInt4449, i_11_,
                            (byte) 65);
        }
        int i_13_ = Class68_Sub7.anInt2862;
        int i_14_ = Class85.anInt1558;
        int i_15_ = Class68_Sub5.anInt2833;
        int i_16_ = Class74.anInt1333;
        int i_17_ = Canvas_Sub1.anInt45;
        for (int i_18_ = 0; i_18_ < 5; i_18_++) {
            if (Class69.aBooleanArray1237[i_18_]) {
                int i_19_
                        = (int) ((double) -Class121.anIntArray2110[i_18_]
                        + (Math.random()
                        * (double) (2 * Class121.anIntArray2110[i_18_]
                        + 1))
                        + (Math.sin((double) (Class68_Sub13_Sub16
                        .anIntArray3697[i_18_])
                        * ((double) (Class68_Sub13_Sub29
                        .anIntArray3935[i_18_])
                        / 100.0))
                        * (double) Class11.anIntArray196[i_18_]));
                if (i_18_ == 2)
                    Class85.anInt1558 += i_19_;
                if ((i_18_ ^ 0xffffffff) == -5) {
                    Canvas_Sub1.anInt45 += i_19_;
                    if ((Canvas_Sub1.anInt45 ^ 0xffffffff) > -129)
                        Canvas_Sub1.anInt45 = 128;
                    if ((Canvas_Sub1.anInt45 ^ 0xffffffff) < -384)
                        Canvas_Sub1.anInt45 = 383;
                }
                if ((i_18_ ^ 0xffffffff) == -2)
                    Class68_Sub5.anInt2833 += i_19_;
                if (i_18_ == 0)
                    Class68_Sub7.anInt2862 += i_19_;
                if ((i_18_ ^ 0xffffffff) == -4)
                    Class74.anInt1333 = 0x7ff & Class74.anInt1333 + i_19_;
            }
        }
        Class68_Sub10.method684(-3);
        Class79.method1427(i_8_, i, i_8_ - -i_7_, i - -i_10_);
        Class62.method612();
        if (Class120.aBoolean2099
                || (Class68_Sub25.anInt3176 ^ 0xffffffff) > (i_8_ ^ 0xffffffff)
                || (Class68_Sub25.anInt3176 ^ 0xffffffff) <= (i_7_ + i_8_
                ^ 0xffffffff)
                || (i ^ 0xffffffff) < (Class92.anInt1646 ^ 0xffffffff)
                || (Class92.anInt1646 ^ 0xffffffff) <= (i + i_10_ ^ 0xffffffff)) {
            Class68_Sub19.aBoolean3070 = false;
            Class68_Sub13_Sub1.anInt3448 = 0;
        } else {
            Class68_Sub13_Sub1.anInt3448 = 0;
            Class68_Sub19.aBoolean3070 = true;
            int i_20_ = Class80.anInt1427;
            int i_21_ = PacketParser.anInt1875;
            Class68_Sub9.anInt2886
                    = ((i_21_ + -i_20_) * (Class68_Sub25.anInt3176 - i_8_) / i_7_
                    - -i_20_);
            int i_22_ = Animable.anInt63;
            int i_23_ = Class68_Sub13_Sub38.anInt4079;
            Class51.anInt2256
                    = (i_23_ + -i_22_) * (Class92.anInt1646 + -i) / i_10_ - -i_22_;
        }
        Class49.method524(16322);
        byte i_24_ = ((Class68_Sub7.method666(1) ^ 0xffffffff) != -3 ? (byte) 1
                : (byte) Class3.anInt84);
        Class79.method1439(i_8_, i, i_7_, i_10_, 0);
        Unknown.method1504
                (Class68_Sub7.anInt2862, Class68_Sub5.anInt2833, Class85.anInt1558,
                        Canvas_Sub1.anInt45, Class74.anInt1333,
                        Class68_Sub20.aByteArrayArrayArray3095,
                        Class21_Sub1.anIntArray2693, PlayerDefinition.anIntArray2180,
                        Class7.anIntArray134, Login.anIntArray1510,
                        Class68_Sub20_Sub16.anIntArray4408, GameSocket.anInt1149 - -1, i_24_,
                        Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561 >> 737831943,
                        Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537 >> 712564327);
        Class49.method524(16322);
        Class115.method1701();
        Class68_Sub13_Sub39.method904(i_10_, i_7_, i_8_, 256, i, 256,
                (byte) -32);
        Class68_Sub4.method659(113, i_7_, i, i_8_, 256, i_10_, 256);
        ((Class90) Class62.anInterface4_1159).method1516(Class109.anInt1844,
                0);
        Class68_Sub20_Sub18.method1184(i_10_, i_8_, i, i_7_, -17234);
        Class68_Sub5.anInt2833 = i_15_;
        Class74.anInt1333 = i_16_;
        Class68_Sub7.anInt2862 = i_13_;
        Class85.anInt1558 = i_14_;
        Canvas_Sub1.anInt45 = i_17_;
        if (Class68_Sub13_Sub28.aBoolean3919
                && ((Class68_Sub9.method679(true, false, (byte) 71) ^ 0xffffffff)
                == -1))
            Class68_Sub13_Sub28.aBoolean3919 = false;
        if (Class68_Sub13_Sub28.aBoolean3919) {
            Class79.method1439(i_8_, i, i_7_, i_10_, 0);
            Class74.method1381(false, Class68_Sub13_Sub19.aRSString_3742,
                    -16678);
        }
        if (!bool_9_ && !Class68_Sub13_Sub28.aBoolean3919
                && !Class120.aBoolean2099 && Class68_Sub25.anInt3176 >= i_8_
                && (Class68_Sub25.anInt3176 ^ 0xffffffff) > (i_8_ - -i_7_
                ^ 0xffffffff)
                && (Class92.anInt1646 ^ 0xffffffff) <= (i ^ 0xffffffff)
                && (Class92.anInt1646 ^ 0xffffffff) > (i_10_ + i ^ 0xffffffff))
            Class20.method323(i_8_, i, i_10_, Class92.anInt1646, !bool, i_7_,
                    Class68_Sub25.anInt3176);
    }

    public static int method858(int i, RSString class100) {
        anInt3972++;
        if (i != 64)
            return 54;
        if ((class100.method1590((byte) -104) ^ 0xffffffff) == -1)
            return -1;
        for (int i_25_ = 0;
             ((i_25_ ^ 0xffffffff)
                     > (Class102.aClass91_1756.anInt1637 ^ 0xffffffff));
             i_25_++) {
            if (Class102.aClass91_1756.aRSStringArray1635[i_25_]
                    .method1617(-577, class100))
                return i_25_;
        }
        return -1;
    }

    public static void method859(int i, int i_26_, int i_27_, int i_28_,
                                 Class68_Sub18 class68_sub18, int i_29_) {
        anInt3974++;
        if (class68_sub18.anInt3042 != -1
                || class68_sub18.anIntArray3053 != null) {
            int i_30_ = 0;
            if ((i_29_ ^ 0xffffffff) < (class68_sub18.anInt3062 ^ 0xffffffff))
                i_30_ += -class68_sub18.anInt3062 + i_29_;
            else if ((class68_sub18.anInt3064 ^ 0xffffffff)
                    < (i_29_ ^ 0xffffffff))
                i_30_ += class68_sub18.anInt3064 - i_29_;
            if (class68_sub18.anInt3038 >= i_27_) {
                if ((i_27_ ^ 0xffffffff)
                        > (class68_sub18.anInt3051 ^ 0xffffffff))
                    i_30_ += -i_27_ + class68_sub18.anInt3051;
            } else
                i_30_ += -class68_sub18.anInt3038 + i_27_;
            if (class68_sub18.anInt3057 == 0
                    || (class68_sub18.anInt3057 ^ 0xffffffff) > (i_30_ + -64
                    ^ 0xffffffff)
                    || Class68_Sub20_Sub15.anInt4399 == 0
                    || (class68_sub18.anInt3039 ^ 0xffffffff) != (i_26_
                    ^ 0xffffffff)) {
                if (class68_sub18.aClass68_Sub28_Sub3_3040 != null) {
                    Class80.aClass68_Sub28_Sub4_1418
                            .method1314(class68_sub18.aClass68_Sub28_Sub3_3040);
                    class68_sub18.aClass68_Sub28_Sub3_3040 = null;
                }
                if (class68_sub18.aClass68_Sub28_Sub3_3049 != null) {
                    Class80.aClass68_Sub28_Sub4_1418
                            .method1314(class68_sub18.aClass68_Sub28_Sub3_3049);
                    class68_sub18.aClass68_Sub28_Sub3_3049 = null;
                }
            } else {
                i_30_ -= 64;
                if (i >= 77) {
                    if ((i_30_ ^ 0xffffffff) > -1)
                        i_30_ = 0;
                    int i_31_ = ((class68_sub18.anInt3057 + -i_30_)
                            * Class68_Sub20_Sub15.anInt4399
                            / class68_sub18.anInt3057);
                    if (class68_sub18.aClass68_Sub28_Sub3_3040 == null) {
                        if (class68_sub18.anInt3042 >= 0) {
                            Class46 class46
                                    = Class46.method509(Class78.aClass21_Sub1_1388,
                                    class68_sub18.anInt3042,
                                    0);
                            if (class46 != null) {
                                Class68_Sub11_Sub1 class68_sub11_sub1
                                        = (class46.method508().method685
                                        (Class68_Sub20.aClass95_3079));
                                Class68_Sub28_Sub3 class68_sub28_sub3
                                        = (Class68_Sub28_Sub3.method1299
                                        (class68_sub11_sub1, 100, i_31_));
                                class68_sub28_sub3.method1272(-1);
                                Class80.aClass68_Sub28_Sub4_1418
                                        .method1316(class68_sub28_sub3);
                                class68_sub18.aClass68_Sub28_Sub3_3040
                                        = class68_sub28_sub3;
                            }
                        }
                    } else
                        class68_sub18.aClass68_Sub28_Sub3_3040
                                .method1279(i_31_);
                    if (class68_sub18.aClass68_Sub28_Sub3_3049 != null) {
                        class68_sub18.aClass68_Sub28_Sub3_3049
                                .method1279(i_31_);
                        if (!class68_sub18.aClass68_Sub28_Sub3_3049
                                .method646(84))
                            class68_sub18.aClass68_Sub28_Sub3_3049 = null;
                    } else if (class68_sub18.anIntArray3053 != null
                            && (class68_sub18.anInt3054 -= i_28_) <= 0) {
                        int i_32_
                                = (int) (Math.random()
                                * (double) (class68_sub18
                                .anIntArray3053).length);
                        Class46 class46
                                = Class46.method509(Class78.aClass21_Sub1_1388,
                                (class68_sub18.anIntArray3053
                                        [i_32_]),
                                0);
                        if (class46 != null) {
                            Class68_Sub11_Sub1 class68_sub11_sub1
                                    = class46.method508()
                                    .method685(Class68_Sub20.aClass95_3079);
                            Class68_Sub28_Sub3 class68_sub28_sub3
                                    = (Class68_Sub28_Sub3.method1299
                                    (class68_sub11_sub1, 100, i_31_));
                            class68_sub28_sub3.method1272(0);
                            Class80.aClass68_Sub28_Sub4_1418
                                    .method1316(class68_sub28_sub3);
                            class68_sub18.aClass68_Sub28_Sub3_3049
                                    = class68_sub28_sub3;
                            class68_sub18.anInt3054
                                    = ((int) (Math.random()
                                    * (double) (-class68_sub18.anInt3044
                                    + (class68_sub18
                                    .anInt3059)))
                                    + class68_sub18.anInt3044);
                        }
                    }
                }
            }
        }
    }

    public void method700(Stream class68_sub14, int i, int i_33_) {
        if (i_33_ != -1)
            anIntArray3969 = null;
        anInt3960++;
        int i_34_ = i;
        while_146_:
        do {
            do {
                if (i_34_ != 0) {
                    if ((i_34_ ^ 0xffffffff) != -2) {
                        if ((i_34_ ^ 0xffffffff) == -3)
                            break;
                        break while_146_;
                    }
                } else {
                    anInt3955 = class68_sub14.readUnsignedByte(-6677);
                    return;
                }
                anInt3968 = class68_sub14.readUnsignedWord(i_33_ + 1355769545);
                return;
            } while (false);
            anInt3958 = class68_sub14.readUnsignedByte(-6677);
        } while (false);
    }

    public static void method860(byte i) {
        if (i == 120) {
            anIntArray3970 = null;
            aClass92_Sub1Array3973 = null;
            aClass16_3963 = null;
            aRSString_3976 = null;
            anIntArray3969 = null;
            aClass21_Sub1_3971 = null;
        }
    }

    public int[] method698(byte i, int i_35_) {
        anInt3956++;
        if (i != -61)
            method858(-125, null);
        int[] is = aClass115_2936.method1697(false, i_35_);
        if (aClass115_2936.aBoolean1957) {
            int i_36_ = Class13_Sub3.anIntArray2672[i_35_];
            if ((anInt3958 ^ 0xffffffff) == -1) {
                int i_37_ = 0;
                for (int i_38_ = 0; i_38_ < anInt3955; i_38_++) {
                    if (anIntArray3964[i_38_] <= i_36_
                            && (i_36_ ^ 0xffffffff) > (anIntArray3964[1 + i_38_]
                            ^ 0xffffffff)) {
                        if ((i_36_ ^ 0xffffffff)
                                > (anIntArray3959[i_38_] ^ 0xffffffff))
                            i_37_ = 4096;
                        break;
                    }
                }
                Class39.method464(is, 0, Class68_Sub13_Sub19.anInt3746, i_37_);
            } else {
                for (int i_39_ = 0;
                     ((i_39_ ^ 0xffffffff)
                             > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                     i_39_++) {
                    int i_40_ = 0;
                    int i_41_ = 0;
                    int i_42_ = Class68_Sub13_Sub3.anIntArray3479[i_39_];
                    int i_43_ = anInt3958;
                    while_147_:
                    do {
                        do {
                            if ((i_43_ ^ 0xffffffff) != -2) {
                                if ((i_43_ ^ 0xffffffff) != -3) {
                                    if (i_43_ == 3)
                                        break;
                                    break while_147_;
                                }
                            } else {
                                i_41_ = i_42_;
                                break while_147_;
                            }
                            i_41_ = ((i_42_ + (i_36_ + -4096) >> 489836129)
                                    + 2048);
                            break while_147_;
                        } while (false);
                        i_41_ = 2048 + (i_42_ - i_36_ >> 428571105);
                    } while (false);
                    for (i_43_ = 0;
                         (i_43_ ^ 0xffffffff) > (anInt3955 ^ 0xffffffff);
                         i_43_++) {
                        if (anIntArray3964[i_43_] <= i_41_
                                && ((anIntArray3964[1 + i_43_] ^ 0xffffffff)
                                < (i_41_ ^ 0xffffffff))) {
                            if ((i_41_ ^ 0xffffffff)
                                    > (anIntArray3959[i_43_] ^ 0xffffffff))
                                i_40_ = 4096;
                            break;
                        }
                    }
                    is[i_39_] = i_40_;
                }
            }
        }
        return is;
    }

    public static void method861(byte i) {
        Class68_Sub13_Sub10.method742(5, true);
        Login.method1471(5, -120);
        Class44.method484((byte) 66, 5);
        Class55.method1726(-1, 5);
        Class28.method393(5, true);
        anInt3966++;
        Class9.method210(5, (byte) 35);
        Class57.method576(5, 0);
        Class68_Sub20_Sub12.method1150(9, 5);
        if (i >= -4)
            method857(-68, 94, false, -113, false, 93);
        Login.method1464(121, 5);
        Class68_Sub20_Sub8.method1086(0, 5);
        Class68_Sub20_Sub8.method1091(190, 5);
        Class104.method1640(0, 50);
        Class68_Sub13_Sub26.method827(-127, 5);
        Class98.method1563(5, 95);
        Class108.aClass98_1827.method1564(-18767, 5);
    }

    static {
        anIntArray3969 = new int[5];
        anInt3975 = -1;
        aRSString_3976
                = (RSString.newRsString
                (
                        "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3"));
    }
}
