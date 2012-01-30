/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121 {
    public static Class98 aClass98_2100;
    public static int anInt2101;
    public static Class8[] aClass8Array2102 = new Class8[500];
    public static int anInt2103;
    public static int[] anIntArray2104;
    public static int anInt2105;
    public static int anInt2106;
    public static int anInt2107;
    public static Class45 aClass45_2108;
    public static boolean[] aBooleanArray2109;
    public static int[] anIntArray2110;

    public static void method1741(int i, int i_0_, int i_1_, int i_2_,
                                  int i_3_, int i_4_) {
        anInt2103++;
        if (i_3_ > -15)
            aClass98_2100 = null;
        int i_5_
                = Class68_Sub20_Sub15.method1171(i, Class51.anInt2255, (byte) 114,
                Class35.anInt605);
        int i_6_
                = Class68_Sub20_Sub15.method1171(i_0_, Class51.anInt2255,
                (byte) 114, Class35.anInt605);
        int i_7_
                = Class68_Sub20_Sub15.method1171(i_2_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        int i_8_
                = Class68_Sub20_Sub15.method1171(i_1_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        for (int i_9_ = i_5_; i_6_ >= i_9_; i_9_++)
            Class34.method416(i_7_, (byte) -17, i_4_,
                    Class68_Sub22.anIntArrayArray3132[i_9_], i_8_);
    }

    public static void method1742(int i, byte i_10_) {
        if (Class68_Sub20.aByteArrayArrayArray3095 == null)
            Class68_Sub20.aByteArrayArrayArray3095 = new byte[4][104][104];
        if (i <= 90)
            anInt2107 = -104;
        anInt2101++;
        for (int i_11_ = 0; i_11_ < 4; i_11_++) {
            for (int i_12_ = 0; i_12_ < 104; i_12_++) {
                for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -105; i_13_++)
                    Class68_Sub20.aByteArrayArrayArray3095[i_11_][i_12_][i_13_]
                            = i_10_;
            }
        }
    }

    public static void method1743(int i) {
        aClass45_2108 = null;
        aClass8Array2102 = null;
        if (i == 1) {
            aClass98_2100 = null;
            anIntArray2104 = null;
            anIntArray2110 = null;
            aBooleanArray2109 = null;
        }
    }

    public static Sprite[] method1744(boolean bool) {
        if (bool != true)
            return null;
        anInt2105++;
        Sprite[] sprites
                = new Sprite[Stream.anInt3007];
        for (int i = 0;
             (Stream.anInt3007 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
            byte[] is = Class69.aByteArrayArray1240[i];
            int i_14_ = (Class68_Sub13_Sub19.anIntArray3757[i]
                    * Class68_Sub13_Sub12.anIntArray3639[i]);
            int[] is_15_ = new int[i_14_];
            for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff);
                 i_16_++)
                is_15_[i_16_] = (Class68_Sub13_Sub17.anIntArray3719
                        [Class120.method1740(is[i_16_], 255)]);
            sprites[i]
                    = (new Sprite
                    (Class97.anInt1703, Class68_Sub20_Sub15.anInt4405,
                            Class4.anIntArray96[i], Class116.anIntArray1996[i],
                            Class68_Sub13_Sub12.anIntArray3639[i],
                            Class68_Sub13_Sub19.anIntArray3757[i], is_15_));
        }
        Class87.method1487((byte) -93);
        return sprites;
    }

    public static void method1745(int i, Class45 class45, boolean bool,
                                  int i_17_) {
        if (bool != true)
            method1744(true);
        anInt2106++;
        if ((class45.anInt782 ^ 0xffffffff) == -2) {
            Class68_Sub3.method652(0, class45.anInt792, (byte) -56,
                    Class68_Sub28_Sub2.aRSString_4556,
                    (short) 23, class45.aRSString_876, 0L);
            Class68_Sub22.anInt3147++;
        }
        if ((class45.anInt782 ^ 0xffffffff) == -3
                && !Class21_Sub1.aBoolean2705) {
            RSString class100 = Class8.method204(0, class45);
            if (class100 != null) {
                Class68_Sub3.method652(-1, class45.anInt792, (byte) -125,
                        (Class68_Sub20_Sub13_Sub2.method1166
                                (2, (new RSString[]
                                        {Class48.aRSString_953,
                                                class45.aRSString_898}))),
                        (short) 32, class100, 0L);
                Class59.anInt1100++;
            }
        }
        if ((class45.anInt782 ^ 0xffffffff) == -4) {
            Class21renamed.anInt456++;
            Class68_Sub3.method652(0, class45.anInt792, (byte) -59,
                    Class68_Sub28_Sub2.aRSString_4556,
                    (short) 10, Class45.aRSString_924, 0L);
        }
        if ((class45.anInt782 ^ 0xffffffff) == -5) {
            Class68_Sub20_Sub11.anInt4328++;
            Class68_Sub3.method652(0, class45.anInt792, (byte) -76,
                    Class68_Sub28_Sub2.aRSString_4556,
                    (short) 36, class45.aRSString_876, 0L);
        }
        if (class45.anInt782 == 5) {
            Class68_Sub3.method652(0, class45.anInt792, (byte) -86,
                    Class68_Sub28_Sub2.aRSString_4556,
                    (short) 28, class45.aRSString_876, 0L);
            Class68_Sub13_Sub3.anInt3477++;
        }
        if (class45.anInt782 == 6 && Class29.aClass45_539 == null) {
            Class116.anInt1993++;
            Class68_Sub3.method652(-1, class45.anInt792, (byte) -78,
                    Class68_Sub28_Sub2.aRSString_4556,
                    (short) 57, class45.aRSString_876, 0L);
        }
        if (class45.anInt896 == 2) {
            int i_18_ = 0;
            for (int i_19_ = 0; class45.anInt899 > i_19_; i_19_++) {
                for (int i_20_ = 0;
                     (class45.anInt773 ^ 0xffffffff) < (i_20_ ^ 0xffffffff);
                     i_20_++) {
                    int i_21_ = i_20_ * (32 - -class45.anInt885);
                    int i_22_ = (32 + class45.anInt846) * i_19_;
                    if ((i_18_ ^ 0xffffffff) > -21) {
                        i_21_ += class45.anIntArray826[i_18_];
                        i_22_ += class45.anIntArray767[i_18_];
                    }
                    if ((i_21_ ^ 0xffffffff) >= (i ^ 0xffffffff)
                            && (i_17_ ^ 0xffffffff) <= (i_22_ ^ 0xffffffff)
                            && i_21_ - -32 > i && i_17_ < i_22_ + 32) {
                        Class68_Sub13_Sub32.anInt3978 = i_18_;
                        Class3.aClass45_73 = class45;
                        if (class45.anIntArray795[i_18_] > 0) {
                            ItemDef class19
                                    = Applet_Sub1.method18(-25672,
                                    (class45.anIntArray795
                                            [i_18_]) - 1);
                            if (Class68_Sub13_Sub37.anInt4062 == 1
                                    && (Class68_Sub20_Sub6.method1064
                                    (client.method41(class45), -207106658))) {
                                if ((class45.anInt792
                                        != Class68_Sub28_Sub2.anInt4553)
                                        || ((Class1_Sub6_Sub2.anInt3399
                                        ^ 0xffffffff)
                                        != (i_18_ ^ 0xffffffff))) {
                                    Class68_Sub3.method652
                                            (i_18_, class45.anInt792, (byte) -64,
                                                    (Class68_Sub20_Sub13_Sub2.method1166
                                                            (2, (new RSString[]
                                                                    {Class44.aRSString_743,
                                                                            Class25.aRSString_511,
                                                                            class19.aRSString_362}))),
                                                    (short) 39, Class76.aRSString_1347,
                                                    (long) class19.anInt350);
                                    Class68_Sub13_Sub36.anInt4048++;
                                }
                            } else if (!Class21_Sub1.aBoolean2705
                                    || !(Class68_Sub20_Sub6.method1064
                                    (client.method41(class45),
                                            -207106658))) {
                                Class115.anInt1956++;
                                RSString[] class100s
                                        = class19.aRSStringArray340;
                                if (Class92.aBoolean1649)
                                    class100s
                                            = Class75_Sub1.method1387((byte) -114,
                                            class100s);
                                if (Class68_Sub20_Sub6.method1064
                                        (client.method41(class45), -207106658)) {
                                    for (int i_23_ = 4; i_23_ >= 3; i_23_--) {
                                        if (class100s == null
                                                || class100s[i_23_] == null) {
                                            if ((i_23_ ^ 0xffffffff) == -5) {
                                                GameSocket.anInt1136++;
                                                Class68_Sub3.method652
                                                        (i_18_, class45.anInt792,
                                                                (byte) -111,
                                                                (Class68_Sub20_Sub13_Sub2
                                                                        .method1166
                                                                                (2,
                                                                                        (new RSString[]
                                                                                                {(Class68_Sub13_Sub10
                                                                                                        .aRSString_3588),
                                                                                                        (class19
                                                                                                                .aRSString_362)}))),
                                                                (short) 22,
                                                                Class122.aRSString_2112,
                                                                (long) class19.anInt350);
                                            }
                                        } else {
                                            short i_24_;
                                            if (i_23_ != 3)
                                                i_24_ = (short) 22;
                                            else
                                                i_24_ = (short) 7;
                                            Class107.anInt1816++;
                                            Class68_Sub3.method652
                                                    (i_18_, class45.anInt792,
                                                            (byte) -106,
                                                            (Class68_Sub20_Sub13_Sub2
                                                                    .method1166
                                                                            (2, (new RSString[]
                                                                                    {(Class68_Sub13_Sub10
                                                                                            .aRSString_3588),
                                                                                            (class19
                                                                                                    .aRSString_362)}))),
                                                            i_24_, class100s[i_23_],
                                                            (long) class19.anInt350);
                                        }
                                    }
                                }
                                if (Class68.method644(client.method41(class45),
                                        1424444319)) {
                                    Class68_Sub13_Sub24.anInt3840++;
                                    Class68_Sub3.method652
                                            (i_18_, class45.anInt792, (byte) -69,
                                                    (Class68_Sub20_Sub13_Sub2.method1166
                                                            (2, (new RSString[]
                                                                    {(Class68_Sub13_Sub10
                                                                            .aRSString_3588),
                                                                            class19.aRSString_362}))),
                                                    (short) 16, Class76.aRSString_1347,
                                                    (long) class19.anInt350);
                                }
                                if ((Class68_Sub20_Sub6.method1064
                                        (client.method41(class45), -207106658))
                                        && class100s != null) {
                                    for (int i_25_ = 2; i_25_ >= 0; i_25_--) {
                                        if (class100s[i_25_] != null) {
                                            Class68_Sub20_Sub15.anInt4388++;
                                            short i_26_ = 0;
                                            if (i_25_ == 0)
                                                i_26_ = (short) 14;
                                            if (i_25_ == 1)
                                                i_26_ = (short) 17;
                                            if (i_25_ == 2)
                                                i_26_ = (short) 13;
                                            Class68_Sub3.method652
                                                    (i_18_, class45.anInt792,
                                                            (byte) -66,
                                                            (Class68_Sub20_Sub13_Sub2
                                                                    .method1166
                                                                            (2, (new RSString[]
                                                                                    {(Class68_Sub13_Sub10
                                                                                            .aRSString_3588),
                                                                                            (class19
                                                                                                    .aRSString_362)}))),
                                                            i_26_, class100s[i_25_],
                                                            (long) class19.anInt350);
                                        }
                                    }
                                }
                                class100s = class45.aRSStringArray817;
                                if (Class92.aBoolean1649)
                                    class100s
                                            = Class75_Sub1.method1387((byte) -73,
                                            class100s);
                                if (class100s != null) {
                                    for (int i_27_ = 4; i_27_ >= 0; i_27_--) {
                                        if (class100s[i_27_] != null) {
                                            Class18.anInt318++;
                                            short i_28_ = 0;
                                            if ((i_27_ ^ 0xffffffff) == -1)
                                                i_28_ = (short) 41;
                                            if ((i_27_ ^ 0xffffffff) == -2)
                                                i_28_ = (short) 40;
                                            if (i_27_ == 2)
                                                i_28_ = (short) 43;
                                            if (i_27_ == 3)
                                                i_28_ = (short) 38;
                                            if (i_27_ == 4)
                                                i_28_ = (short) 58;
                                            Class68_Sub3.method652
                                                    (i_18_, class45.anInt792,
                                                            (byte) -60,
                                                            (Class68_Sub20_Sub13_Sub2
                                                                    .method1166
                                                                            (2, (new RSString[]
                                                                                    {(Class68_Sub13_Sub10
                                                                                            .aRSString_3588),
                                                                                            (class19
                                                                                                    .aRSString_362)}))),
                                                            i_28_, class100s[i_27_],
                                                            (long) class19.anInt350);
                                        }
                                    }
                                }
                                Class68_Sub3.method652
                                        (i_18_, class45.anInt792, (byte) -99,
                                                (Class68_Sub20_Sub13_Sub2.method1166
                                                        (2,
                                                                (new RSString[]
                                                                        {Class68_Sub13_Sub10.aRSString_3588,
                                                                                class19.aRSString_362}))),
                                                (short) 1001, Class119.aRSString_2086,
                                                (long) class19.anInt350);
                            } else if ((0x10 & Class33.anInt589 ^ 0xffffffff)
                                    == -17) {
                                Class68_Sub3.method652
                                        (i_18_, class45.anInt792, (byte) -77,
                                                (Class68_Sub20_Sub13_Sub2.method1166
                                                        (2, (new RSString[]
                                                                {Class68_Sub13_Sub1.aRSString_3452,
                                                                        Class25.aRSString_511,
                                                                        class19.aRSString_362}))),
                                                (short) 31, Class7.aRSString_118,
                                                (long) class19.anInt350);
                                Class122.anInt2114++;
                            }
                        }
                    }
                    i_18_++;
                }
            }
        }
        if (class45.aBoolean863) {
            if (Class21_Sub1.aBoolean2705) {
                if (Class96.method1555(client.method41(class45), (byte) -114)
                        && (Class33.anInt589 & 0x20 ^ 0xffffffff) == -33) {
                    Class68_Sub3.method652
                            (class45.anInt867, class45.anInt792, (byte) -92,
                                    (Class68_Sub20_Sub13_Sub2.method1166
                                            (2,
                                                    new RSString[]{Class68_Sub13_Sub1.aRSString_3452,
                                                            Class68_Sub20_Sub6.aRSString_4232,
                                                            class45.aRSString_890})),
                                    (short) 6, Class7.aRSString_118, 0L);
                    Class68_Sub13_Sub33.anInt3997++;
                }
            } else {
                for (int i_29_ = 9; i_29_ >= 5; i_29_--) {
                    RSString class100
                            = Class68_Sub13_Sub17.method781(-3574, i_29_, class45);
                    if (class100 != null) {
                        Class68_Sub6.anInt2837++;
                        Class68_Sub3.method652(class45.anInt867,
                                class45.anInt792, (byte) -121,
                                class45.aRSString_890,
                                (short) 1007, class100,
                                (long) (1 + i_29_));
                    }
                }
                RSString class100 = Class8.method204(0, class45);
                if (class100 != null) {
                    Class59.anInt1100++;
                    Class68_Sub3.method652(class45.anInt867, class45.anInt792,
                            (byte) -105, class45.aRSString_890,
                            (short) 32, class100, 0L);
                }
                for (int i_30_ = 4; i_30_ >= 0; i_30_--) {
                    RSString class100_31_
                            = Class68_Sub13_Sub17.method781(-3574, i_30_, class45);
                    if (class100_31_ != null) {
                        Class68_Sub3.method652(class45.anInt867,
                                class45.anInt792, (byte) -120,
                                class45.aRSString_890,
                                (short) 51, class100_31_,
                                (long) (1 + i_30_));
                        Class68_Sub6.anInt2837++;
                    }
                }
                if (Class68_Sub3.method655(client.method41(class45), 1)) {
                    Class68_Sub3.method652(class45.anInt867, class45.anInt792,
                            (byte) -102,
                            Class68_Sub28_Sub2.aRSString_4556,
                            (short) 57,
                            Class75_Sub3.aRSString_3321, 0L);
                    Class116.anInt1993++;
                }
            }
        }
    }

    static {
        aClass98_2100 = new Class98(32);
        aBooleanArray2109 = new boolean[100];
        anIntArray2110 = new int[5];
    }
}
