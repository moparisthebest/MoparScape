/* Class68_Sub28_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub28_Sub2 extends Class68_Sub28 {
    public static int anInt4531;
    public static int anInt4532;
    public static int anInt4533;
    public static int anInt4534;
    public static int anInt4535;
    public static int anInt4536;
    public static int anInt4537;
    public static int anInt4538;
    public static int anInt4539;
    public static int anInt4540;
    public static int anInt4541;
    public Class16 aClass16_4542 = new Class16();
    public Class68_Sub28_Sub1 aClass68_Sub28_Sub1_4543;
    public static Class98 aClass98_4544 = new Class98(4);
    public static int anInt4545;
    public static int[] anIntArray4546;
    public static int anInt4547;
    public static RSString aRSString_4548;
    public static RSString aRSString_4549
            = RSString.newRsString("Konfig geladen)3");
    public static RSString aRSString_4550
            = RSString.newRsString("Spieler kann nicht gefunden werden: ");
    public static RSString username;
    public static RSString password;
    public static int anInt4553;
    public static int anInt4554;
    public Class68_Sub28_Sub4 aClass68_Sub28_Sub4_4555
            = new Class68_Sub28_Sub4();
    public static RSString aRSString_4556;

    public void method1225(int[] is, int i, int i_0_) {
        aClass68_Sub28_Sub4_4555.method1225(is, i, i_0_);
        anInt4531++;
        while_57_:
        for (Class68_Sub26 class68_sub26
                     = (Class68_Sub26) aClass16_4542.method293((byte) 76);
             class68_sub26 != null;
             class68_sub26
                     = (Class68_Sub26) aClass16_4542.method290((byte) -114)) {
            if (!aClass68_Sub28_Sub1_4543.method1231(class68_sub26,
                    (byte) -42)) {
                int i_1_ = i_0_;
                int i_2_ = i;
                while ((i_1_ ^ 0xffffffff)
                        < (class68_sub26.anInt3196 ^ 0xffffffff)) {
                    method1270(class68_sub26, class68_sub26.anInt3196, 24981,
                            i_2_, i_2_ - -i_1_, is);
                    i_2_ += class68_sub26.anInt3196;
                    i_1_ -= class68_sub26.anInt3196;
                    if (aClass68_Sub28_Sub1_4543.method1252(i_1_, i_2_,
                            class68_sub26,
                            (byte) -68, is))
                        continue while_57_;
                }
                method1270(class68_sub26, i_1_, 24981, i_2_, i_2_ - -i_1_, is);
                class68_sub26.anInt3196 -= i_1_;
            }
        }
    }

    public static void method1265(int i) {
        anInt4533++;
        if (i == -2 && Class54.aClass45_1033 == null
                && Class35.aClass45_606 == null) {
            int i_3_ = Class29.anInt537;
            if (Class120.aBoolean2099) {
                if (i_3_ != 1) {
                    int i_4_ = Class13.anInt223;
                    int i_5_ = Class96.anInt1695;
                    if ((i_5_ ^ 0xffffffff) > (-10 + Class49.anInt969
                            ^ 0xffffffff)
                            || (Class68_Sub13_Sub15.anInt3687 + Class49.anInt969
                            - -10) < i_5_
                            || ((i_4_ ^ 0xffffffff)
                            > (-10 + Class68_Sub13_Sub14.anInt3667
                            ^ 0xffffffff))
                            || ((i_4_ ^ 0xffffffff)
                            < (10 + (Class68_Sub13_Sub14.anInt3667
                            + Class33.anInt588)
                            ^ 0xffffffff))) {
                        Class120.aBoolean2099 = false;
                        Class127.method1781(Class49.anInt969,
                                Class68_Sub13_Sub14.anInt3667,
                                Class68_Sub13_Sub15.anInt3687,
                                Class33.anInt588, (byte) -45);
                    }
                }
                if (i_3_ == 1) {
                    int i_6_ = Class49.anInt969;
                    int i_7_ = Class68_Sub13_Sub14.anInt3667;
                    int i_8_ = Class68_Sub13_Sub37.anInt4077;
                    int i_9_ = Class125.anInt2173;
                    int i_10_ = -1;
                    int i_11_ = Class68_Sub13_Sub15.anInt3687;
                    for (int i_12_ = 0; i_12_ < Class68_Sub13_Sub21.anInt3803;
                         i_12_++) {
                        int i_13_
                                = (i_7_ - -31
                                - -(15 * (-1 + (Class68_Sub13_Sub21.anInt3803
                                + -i_12_))));
                        if ((i_8_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)
                                && (i_11_ + i_6_ ^ 0xffffffff) < (i_8_
                                ^ 0xffffffff)
                                && i_9_ > -13 + i_13_
                                && (i_9_ ^ 0xffffffff) > (i_13_ - -3 ^ 0xffffffff))
                            i_10_ = i_12_;
                    }
                    if ((i_10_ ^ 0xffffffff) != 0)
                        Class68_Sub20_Sub8.method1083((byte) 51, i_10_);
                    Class120.aBoolean2099 = false;
                    Class127.method1781(Class49.anInt969,
                            Class68_Sub13_Sub14.anInt3667,
                            Class68_Sub13_Sub15.anInt3687,
                            Class33.anInt588, (byte) -95);
                }
            } else {
                if (i_3_ == 1
                        && (Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff) < -1) {
                    short i_14_ = (Class68_Sub28_Sub1.aShortArray4471
                            [Class68_Sub13_Sub21.anInt3803 - 1]);
                    if ((i_14_ ^ 0xffffffff) == -42
                            || (i_14_ ^ 0xffffffff) == -41 || i_14_ == 43
                            || i_14_ == 38 || i_14_ == 58 || i_14_ == 14
                            || (i_14_ ^ 0xffffffff) == -18
                            || (i_14_ ^ 0xffffffff) == -14
                            || (i_14_ ^ 0xffffffff) == -8
                            || (i_14_ ^ 0xffffffff) == -23 || i_14_ == 16
                            || i_14_ == 1001) {
                        int i_15_ = (Class37.anIntArray654
                                [Class68_Sub13_Sub21.anInt3803 - 1]);
                        int i_16_ = (Class68_Sub13_Sub37.anIntArray4075
                                [Class68_Sub13_Sub21.anInt3803 + -1]);
                        Class45 class45
                                = Class68_Sub20_Sub15.method1170(i_16_,
                                (byte) -80);
                        if (Class52.method542(client.method41(class45), true)
                                || Class68_Sub13_Sub8
                                .method733(0, client.method41(class45))) {
                            Class68_Sub13_Sub6.anInt3532 = 0;
                            Class87.aBoolean1587 = false;
                            if (Class54.aClass45_1033 != null)
                                Class113.method1682(Class54.aClass45_1033,
                                        -115);
                            Class54.aClass45_1033
                                    = Class68_Sub20_Sub15.method1170(i_16_,
                                    (byte) -80);
                            Class68_Sub18.anInt3046 = Class125.anInt2173;
                            Class59.anInt1102 = Class68_Sub13_Sub37.anInt4077;
                            Class68_Sub20_Sub2.anInt4189 = i_15_;
                            Class113.method1682(Class54.aClass45_1033, -114);
                            return;
                        }
                    }
                }
                if ((i_3_ ^ 0xffffffff) == -2
                        && ((Class14.anInt228 == 1
                        && (Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff) < -3)
                        || Applet_Sub1.method17((byte) -121,
                        (Class68_Sub13_Sub21.anInt3803
                                + -1))))
                    i_3_ = 2;
                if (((i_3_ ^ 0xffffffff) == -3
                        && (Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff) < -1)
                        || (Class47.anInt940 ^ 0xffffffff) == -2)
                    Class68_Sub13_Sub18.method787((byte) -15);
                if ((i_3_ == 1
                        && (Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff) < -1)
                        || Class47.anInt940 == 2)
                    Class68_Sub13_Sub39.method901((byte) 106);
            }
        }
    }

    public void method1266(Class68_Sub26 class68_sub26, int i, int i_17_) {
        if ((aClass68_Sub28_Sub1_4543.anIntArray4524[class68_sub26.anInt3193]
                & 0x4) != 0
                && (class68_sub26.anInt3188 ^ 0xffffffff) > -1) {
            int i_18_ = ((aClass68_Sub28_Sub1_4543.anIntArray4461
                    [class68_sub26.anInt3193])
                    / Class93.anInt1660);
            int i_19_ = (i_18_ + (1048575 - class68_sub26.anInt3180)) / i_18_;
            class68_sub26.anInt3180
                    = i * i_18_ + class68_sub26.anInt3180 & 0xfffff;
            if (i_19_ <= i) {
                if (((aClass68_Sub28_Sub1_4543.anIntArray4501
                        [class68_sub26.anInt3193])
                        ^ 0xffffffff)
                        == -1)
                    class68_sub26.aClass68_Sub28_Sub3_3185
                            = (Class68_Sub28_Sub3.method1287
                            (class68_sub26.aClass68_Sub11_Sub1_3204,
                                    class68_sub26.aClass68_Sub28_Sub3_3185
                                            .method1294(),
                                    class68_sub26.aClass68_Sub28_Sub3_3185
                                            .method1291(),
                                    class68_sub26.aClass68_Sub28_Sub3_3185
                                            .method1284()));
                else {
                    class68_sub26.aClass68_Sub28_Sub3_3185
                            = (Class68_Sub28_Sub3.method1287
                            (class68_sub26.aClass68_Sub11_Sub1_3204,
                                    class68_sub26.aClass68_Sub28_Sub3_3185
                                            .method1294(),
                                    0,
                                    class68_sub26.aClass68_Sub28_Sub3_3185
                                            .method1284()));
                    aClass68_Sub28_Sub1_4543.method1243(class68_sub26,
                            ((class68_sub26
                                    .aClass68_Sub27_3194
                                    .aShortArray3211
                                    [(class68_sub26
                                    .anInt3198)])
                                    ^ 0xffffffff) > -1,
                            (byte) 59);
                }
                if ((class68_sub26.aClass68_Sub27_3194.aShortArray3211
                        [class68_sub26.anInt3198])
                        < 0)
                    class68_sub26.aClass68_Sub28_Sub3_3185.method1272(-1);
                i = class68_sub26.anInt3180 / i_18_;
            }
        }
        if (i_17_ != -1)
            aRSString_4550 = null;
        class68_sub26.aClass68_Sub28_Sub3_3185.method1229(i);
        anInt4534++;
    }

    public Class68_Sub28 method1226() {
        Class68_Sub26 class68_sub26
                = (Class68_Sub26) aClass16_4542.method293((byte) 76);
        anInt4535++;
        if (class68_sub26 == null)
            return null;
        if (class68_sub26.aClass68_Sub28_Sub3_3185 != null)
            return class68_sub26.aClass68_Sub28_Sub3_3185;
        return method1228();
    }

    public static void method1267(int i) {
        Class91.aClass98_1636.method1566((byte) 94);
        Class11.aClass98_193.method1566((byte) 94);
        anInt4537++;
        if (i <= 67)
            aClass98_4544 = null;
    }

    public static void method1268(int i) {
        aRSString_4550 = null;
        aClass98_4544 = null;
        password = null;
        aRSString_4556 = null;
        aRSString_4548 = null;
        anIntArray4546 = null;
        aRSString_4549 = null;
        if (i > -19)
            anInt4545 = -57;
        username = null;
    }

    public static void method1269(int i) {
        anInt4541++;
        Class68_Sub13_Sub28.aClass98_3923.method1567(i ^ 0x1632);
        if (i != 5698)
            aRSString_4556 = null;
    }

    public void method1270(Class68_Sub26 class68_sub26, int i, int i_20_,
                           int i_21_, int i_22_, int[] is) {
        try {
            if ((0x4 & (aClass68_Sub28_Sub1_4543.anIntArray4524
                    [class68_sub26.anInt3193])) != 0
                    && (class68_sub26.anInt3188 ^ 0xffffffff) > -1) {
                int i_23_ = ((aClass68_Sub28_Sub1_4543.anIntArray4461
                        [class68_sub26.anInt3193])
                        / Class93.anInt1660);
                for (; ; ) {
                    int i_24_
                            = (-class68_sub26.anInt3180 + 1048575 + i_23_) / i_23_;
                    if (i < i_24_)
                        break;
                    class68_sub26.aClass68_Sub28_Sub3_3185
                            .method1225(is, i_21_, i_24_);
                    class68_sub26.anInt3180 += -1048576 + i_23_ * i_24_;
                    i -= i_24_;
                    int i_25_ = Class93.anInt1660 / 100;
                    i_21_ += i_24_;
                    int i_26_ = 262144 / i_23_;
                    if (i_25_ > i_26_)
                        i_25_ = i_26_;
                    Class68_Sub28_Sub3 class68_sub28_sub3
                            = class68_sub26.aClass68_Sub28_Sub3_3185;
                    if ((aClass68_Sub28_Sub1_4543.anIntArray4501
                            [class68_sub26.anInt3193])
                            == 0)
                        class68_sub26.aClass68_Sub28_Sub3_3185
                                = (Class68_Sub28_Sub3.method1287
                                (class68_sub26.aClass68_Sub11_Sub1_3204,
                                        class68_sub28_sub3.method1294(),
                                        class68_sub28_sub3.method1291(),
                                        class68_sub28_sub3.method1284()));
                    else {
                        class68_sub26.aClass68_Sub28_Sub3_3185
                                = (Class68_Sub28_Sub3.method1287
                                (class68_sub26.aClass68_Sub11_Sub1_3204,
                                        class68_sub28_sub3.method1294(), 0,
                                        class68_sub28_sub3.method1284()));
                        aClass68_Sub28_Sub1_4543.method1243
                                (class68_sub26,
                                        ((class68_sub26.aClass68_Sub27_3194
                                                .aShortArray3211[class68_sub26.anInt3198])
                                                ^ 0xffffffff) > -1,
                                        (byte) 56);
                        class68_sub26.aClass68_Sub28_Sub3_3185.method1280
                                (i_25_, class68_sub28_sub3.method1291());
                    }
                    if (((class68_sub26.aClass68_Sub27_3194.aShortArray3211
                            [class68_sub26.anInt3198])
                            ^ 0xffffffff)
                            > -1)
                        class68_sub26.aClass68_Sub28_Sub3_3185.method1272(-1);
                    class68_sub28_sub3.method1288(i_25_);
                    class68_sub28_sub3.method1225(is, i_21_, i_22_ - i_21_);
                    if (class68_sub28_sub3.method1278())
                        aClass68_Sub28_Sub4_4555
                                .method1316(class68_sub28_sub3);
                }
                class68_sub26.anInt3180 += i_23_ * i;
            }
            anInt4536++;
            if (i_20_ != 24981)
                aRSString_4548 = null;
            class68_sub26.aClass68_Sub28_Sub3_3185.method1225(is, i_21_, i);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("hk.G("
                            + (class68_sub26 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_20_ + ',' + i_21_
                            + ',' + i_22_ + ','
                            + (is != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method1271(byte i) {
        if (i != -38)
            method1265(-58);
        anInt4532++;
        for (; ; ) {
            Class68_Sub25 class68_sub25;
            synchronized (Class68_Sub20_Sub10.aClass16_4314) {
                class68_sub25
                        = (Class68_Sub25) Class127.aClass16_2205.method294(-110);
            }
            if (class68_sub25 == null)
                break;
            class68_sub25.aClass21_Sub1_3175.method364
                    (-83, false, class68_sub25.aByteArray3165,
                            class68_sub25.aUnknown_3170, (int) class68_sub25.aLong1218);
        }
    }

    public int method1224() {
        anInt4540++;
        return 0;
    }

    public void method1229(int i) {
        aClass68_Sub28_Sub4_4555.method1229(i);
        anInt4538++;
        while_59_:
        for (Class68_Sub26 class68_sub26
                     = (Class68_Sub26) aClass16_4542.method293((byte) 76);
             class68_sub26 != null;
             class68_sub26
                     = (Class68_Sub26) aClass16_4542.method290((byte) -117)) {
            if (!aClass68_Sub28_Sub1_4543.method1231(class68_sub26,
                    (byte) -42)) {
                int i_27_ = i;
                while ((class68_sub26.anInt3196 ^ 0xffffffff)
                        > (i_27_ ^ 0xffffffff)) {
                    method1266(class68_sub26, class68_sub26.anInt3196, -1);
                    i_27_ -= class68_sub26.anInt3196;
                    if (aClass68_Sub28_Sub1_4543.method1252(i_27_, 0,
                            class68_sub26,
                            (byte) -68, null))
                        continue while_59_;
                }
                method1266(class68_sub26, i_27_, -1);
                class68_sub26.anInt3196 -= i_27_;
            }
        }
    }

    public Class68_Sub28 method1228() {
        anInt4554++;
        Class68_Sub26 class68_sub26;
        do {
            class68_sub26 = (Class68_Sub26) aClass16_4542.method290((byte) 61);
            if (class68_sub26 == null)
                return null;
        } while (class68_sub26.aClass68_Sub28_Sub3_3185 == null);
        return class68_sub26.aClass68_Sub28_Sub3_3185;
    }

    public Class68_Sub28_Sub2(Class68_Sub28_Sub1 class68_sub28_sub1) {
        aClass68_Sub28_Sub1_4543 = class68_sub28_sub1;
    }

    static {
        aRSString_4548 = RSString.newRsString("settings=");
        anInt4547 = 0;
        anInt4545 = -1;
        aRSString_4556 = RSString.newRsString("");
        password = aRSString_4556;
        username = aRSString_4556;
    }
}
