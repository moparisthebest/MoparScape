/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

public class Class20 {
    public static int anInt398;
    public static RSString aRSString_399;
    public static RSString aRSString_400;
    public static RSString aRSString_401;
    public int anInt402;
    public static int anInt403;
    public static RSString aRSString_404 = RSString.newRsString("Select");
    public byte[] aByteArray405;
    public static int anInt406;
    public byte[] aByteArray407;
    public int anInt408;
    public int anInt409;
    public static int anInt410;
    public static int anInt411;
    public static volatile int anInt412;
    public static RSString aRSString_413;
    public int anInt414;
    public int anInt415;
    public static int anInt416;
    public int anInt417;
    public int anInt418;
    public static int anInt419;
    public static int anInt420;
    public static RSString aRSString_421;

    public static void method320(int i) {
        Class3.anInt87++;
        anInt420++;
        Class21renamed.stream.createFrame(108);
        for (Class68_Sub3 class68_sub3 = (Class68_Sub3) Login.aClass113_1512.method1679(-32642);
             class68_sub3 != null;
             class68_sub3 = ((Class68_Sub3) Login.aClass113_1512.method1683((byte) -105))) {
            if ((class68_sub3.anInt2800 ^ 0xffffffff) == -1)
                Class68_Sub13_Sub10.method744(class68_sub3, true, true);
        }
        if (i != 636)
            method320(126);
        if (Class29.aClass45_539 != null) {
            Class113.method1682(Class29.aClass45_539, -124);
            Class29.aClass45_539 = null;
        }
    }

    public static void method321(Class21renamed class21, byte i, Class21renamed class21_0_) {
        try {
            Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3801
                    = Class90.method1509(class21, 0, (byte) 81, class21_0_,
                    Class113.anInt1912);
            int i_1_ = -114 % ((20 - i) / 61);
            Class72_Sub1.aClass68_Sub20_Sub1_Sub1_3276
                    = ((Class68_Sub20_Sub1_Sub1)
                    Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3801);
            anInt410++;
            Class68_Sub6.aClass68_Sub20_Sub1_2847
                    = Class90.method1509(class21, 0, (byte) 58, class21_0_,
                    GameException.anInt2241);
            Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511
                    = Class90.method1509(class21, 0, (byte) 67, class21_0_,
                    Class50.anInt986);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ch.F("
                            + (class21 != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (class21_0_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public static void method322(int i, Stream class68_sub14) {
        anInt406++;
        byte[] is = new byte[i];
        if (Class68_Sub13_Sub4.aClass124_3486 != null) {
            try {
                Class68_Sub13_Sub4.aClass124_3486.method1760(0L, i + -23);
                Class68_Sub13_Sub4.aClass124_3486.method1753(-128, is);
                int i_2_;
                for (i_2_ = 0; i_2_ < 24; i_2_++) {
                    if (is[i_2_] != 0)
                        break;
                }
                if (i_2_ >= 24)
                    throw new IOException();
            } catch (Exception exception) {
                for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -25; i_3_++)
                    is[i_3_] = (byte) -1;
            }
        }
        //xxx moparisthebest added
        //for(byte b : is)
        //    System.out.print(b + ", ");
        //System.out.println();
        class68_sub14.writeBytes(24, 0, is);
    }

    public static void method323(int i, int i_4_, int i_5_, int i_6_,
                                 boolean bool, int i_7_, int i_8_) {
        anInt398++;
        if ((Class68_Sub13_Sub37.anInt4062 ^ 0xffffffff) == -1
                && !Class21_Sub1.aBoolean2705) {
            Class23.anInt491++;
            int i_9_ = Class80.anInt1427;
            int i_10_ = PacketParser.anInt1875;
            int i_11_ = Class68_Sub13_Sub38.anInt4079;
            int i_12_ = Animable.anInt63;
            int i_13_ = i_9_ + (-i + i_8_) * (-i_9_ + i_10_) / i_7_;
            int i_14_ = i_12_ + (i_11_ - i_12_) * (i_6_ - i_4_) / i_5_;
            Class68_Sub3.method652(i_13_, i_14_, (byte) -108,
                    Class68_Sub28_Sub2.aRSString_4556,
                    (short) 5, Class37.aRSString_653, 0L);
        }
        long l = -1L;
        if (bool == true) {
            for (int i_15_ = 0; Class68_Sub13_Sub1.anInt3448 > i_15_;
                 i_15_++) {
                long l_16_ = Class68_Sub20_Sub15.aLongArray4389[i_15_];
                int i_17_ = 0x7f & (int) l_16_;
                int i_18_ = 0x7f & (int) l_16_ >> 12401223;
                int i_19_ = (0x64d29b4f & (int) l_16_) >> 1521701917;
                int i_20_ = (int) (l_16_ >>> 853512416) & 0x7fffffff;
                if (l != l_16_) {
                    l = l_16_;
                    if ((i_19_ ^ 0xffffffff) == -3
                            && Class86.method1486(GameSocket.anInt1149, i_17_, i_18_,
                            l_16_)) {
                        Class116 class116 = Class1_Sub5.method140(80, i_20_);
                        if (class116.anIntArray1994 != null)
                            class116 = class116.method1710(-1);
                        if (class116 == null)
                            continue;
                        if (Class68_Sub13_Sub37.anInt4062 != 1) {
                            if (!Class21_Sub1.aBoolean2705) {
                                Class68_Sub13_Sub24.anInt3846++;
                                RSString[] class100s
                                        = class116.aRSStringArray2006;
                                if (Class92.aBoolean1649)
                                    class100s
                                            = Class75_Sub1.method1387((byte) -106,
                                            class100s);
                                if (class100s != null) {
                                    for (int i_21_ = 4; i_21_ >= 0; i_21_--) {
                                        if (class100s[i_21_] != null) {
                                            Class1_Sub7.anInt2616++;
                                            short i_22_ = 0;
                                            if (i_21_ == 0)
                                                i_22_ = (short) 18;
                                            if ((i_21_ ^ 0xffffffff) == -2)
                                                i_22_ = (short) 47;
                                            if (i_21_ == 2)
                                                i_22_ = (short) 46;
                                            if ((i_21_ ^ 0xffffffff) == -4)
                                                i_22_ = (short) 42;
                                            if (i_21_ == 4)
                                                i_22_ = (short) 1003;
                                            Class68_Sub3.method652
                                                    (i_17_, i_18_, (byte) -119,
                                                            (Class68_Sub20_Sub13_Sub2
                                                                    .method1166
                                                                            (2,
                                                                                    (new RSString[]
                                                                                            {Class21renamed.aRSString_478,
                                                                                                    (class116
                                                                                                            .aRSString_2021)}))),
                                                            i_22_, class100s[i_21_],
                                                            l_16_);
                                        }
                                    }
                                }
                                Class68_Sub3.method652
                                        (i_17_, i_18_, (byte) -87,
                                                (Class68_Sub20_Sub13_Sub2.method1166
                                                        (2, (new RSString[]
                                                                {Class21renamed.aRSString_478,
                                                                        class116.aRSString_2021}))),
                                                (short) 1005, Class119.aRSString_2086,
                                                (long) class116.anInt2031);
                            } else if ((Class33.anInt589 & 0x4) == 4) {
                                Class1_Sub1.anInt2426++;
                                Class68_Sub3.method652
                                        (i_17_, i_18_, (byte) -126,
                                                (Class68_Sub20_Sub13_Sub2.method1166
                                                        (2, (new RSString[]
                                                                {Class68_Sub13_Sub1.aRSString_3452,
                                                                        Class114.aRSString_1930,
                                                                        class116.aRSString_2021}))),
                                                (short) 37, Class7.aRSString_118, l_16_);
                            }
                        } else {
                            RSString.anInt2315++;
                            Class68_Sub3.method652
                                    (i_17_, i_18_, (byte) -104,
                                            (Class68_Sub20_Sub13_Sub2.method1166
                                                    (2, (new RSString[]
                                                            {Class44.aRSString_743,
                                                                    Class114.aRSString_1930,
                                                                    class116.aRSString_2021}))),
                                            (short) 1, Class76.aRSString_1347, l_16_);
                        }
                    }
                    if (i_19_ == 1) {
                        Class1_Sub6_Sub1 class1_sub6_sub1
                                = Class102.aClass1_Sub6_Sub1Array1746[i_20_];
                        if (class1_sub6_sub1.aClass80_3395.anInt1451 == 1
                                && (class1_sub6_sub1.anInt2561 & 0x7f) == 64
                                && (class1_sub6_sub1.anInt2537 & 0x7f
                                ^ 0xffffffff) == -65) {
                            for (int i_23_ = 0; i_23_ < Class13_Sub2.anInt2645;
                                 i_23_++) {
                                Class1_Sub6_Sub1 class1_sub6_sub1_24_
                                        = (Class102.aClass1_Sub6_Sub1Array1746
                                        [Class68_Sub10.anIntArray2906[i_23_]]);
                                if (class1_sub6_sub1_24_ != null
                                        && class1_sub6_sub1_24_ != class1_sub6_sub1
                                        && (class1_sub6_sub1_24_.aClass80_3395
                                        .anInt1451) == 1
                                        && (class1_sub6_sub1_24_.anInt2561
                                        == class1_sub6_sub1.anInt2561)
                                        && (class1_sub6_sub1_24_.anInt2537
                                        == class1_sub6_sub1.anInt2537))
                                    Class103.method1633
                                            (Class68_Sub10.anIntArray2906[i_23_],
                                                    i_18_, i_17_, (byte) 111,
                                                    class1_sub6_sub1_24_.aClass80_3395);
                            }
                            for (int i_25_ = 0; i_25_ < client.anInt2382;
                                 i_25_++) {
                                Class1_Sub6_Sub2 class1_sub6_sub2
                                        = (Class68_Sub13_Sub4
                                        .aClass1_Sub6_Sub2Array3483
                                        [Class85.anIntArray1563[i_25_]]);
                                if (class1_sub6_sub2 != null
                                        && (class1_sub6_sub2.anInt2561
                                        == class1_sub6_sub1.anInt2561)
                                        && (class1_sub6_sub2.anInt2537
                                        == class1_sub6_sub1.anInt2537))
                                    Class68_Sub4.method661(class1_sub6_sub2,
                                            -126, i_17_, i_18_,
                                            (Class85
                                                    .anIntArray1563
                                                    [i_25_]));
                            }
                        }
                        Class103.method1633(i_20_, i_18_, i_17_, (byte) 93,
                                class1_sub6_sub1.aClass80_3395);
                    }
                    if (i_19_ == 0) {
                        Class1_Sub6_Sub2 class1_sub6_sub2
                                = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                                [i_20_]);
                        if (((class1_sub6_sub2.anInt2561 & 0x7f ^ 0xffffffff)
                                == -65)
                                && (class1_sub6_sub2.anInt2537 & 0x7f
                                ^ 0xffffffff) == -65) {
                            for (int i_26_ = 0; i_26_ < Class13_Sub2.anInt2645;
                                 i_26_++) {
                                Class1_Sub6_Sub1 class1_sub6_sub1
                                        = (Class102.aClass1_Sub6_Sub1Array1746
                                        [Class68_Sub10.anIntArray2906[i_26_]]);
                                if (class1_sub6_sub1 != null
                                        && ((class1_sub6_sub1.aClass80_3395
                                        .anInt1451)
                                        ^ 0xffffffff) == -2
                                        && (class1_sub6_sub1.anInt2561
                                        == class1_sub6_sub2.anInt2561)
                                        && (class1_sub6_sub1.anInt2537
                                        == class1_sub6_sub2.anInt2537))
                                    Class103.method1633
                                            (Class68_Sub10.anIntArray2906[i_26_],
                                                    i_18_, i_17_, (byte) -11,
                                                    class1_sub6_sub1.aClass80_3395);
                            }
                            for (int i_27_ = 0;
                                 ((i_27_ ^ 0xffffffff)
                                         > (client.anInt2382 ^ 0xffffffff));
                                 i_27_++) {
                                Class1_Sub6_Sub2 class1_sub6_sub2_28_
                                        = (Class68_Sub13_Sub4
                                        .aClass1_Sub6_Sub2Array3483
                                        [Class85.anIntArray1563[i_27_]]);
                                if (class1_sub6_sub2_28_ != null
                                        && class1_sub6_sub2 != class1_sub6_sub2_28_
                                        && ((class1_sub6_sub2_28_.anInt2561
                                        ^ 0xffffffff)
                                        == (class1_sub6_sub2.anInt2561
                                        ^ 0xffffffff))
                                        && ((class1_sub6_sub2.anInt2537
                                        ^ 0xffffffff)
                                        == (class1_sub6_sub2_28_.anInt2537
                                        ^ 0xffffffff)))
                                    Class68_Sub4.method661
                                            (class1_sub6_sub2_28_, -62, i_17_,
                                                    i_18_, Class85.anIntArray1563[i_27_]);
                            }
                        }
                        Class68_Sub4.method661(class1_sub6_sub2, -112, i_17_,
                                i_18_, i_20_);
                    }
                    if ((i_19_ ^ 0xffffffff) == -4) {
                        Class16 class16 = (Class45.aClass16ArrayArrayArray926
                                [GameSocket.anInt1149][i_17_][i_18_]);
                        if (class16 != null) {
                            for (Class68_Sub20_Sub18 class68_sub20_sub18
                                         = ((Class68_Sub20_Sub18)
                                    class16.method289(30568));
                                 class68_sub20_sub18 != null;
                                 class68_sub20_sub18
                                         = ((Class68_Sub20_Sub18)
                                         class16.method280((byte) -101))) {
                                int i_29_ = (class68_sub20_sub18
                                        .aClass1_Sub2_4445.anInt2431);
                                ItemDef class19
                                        = Applet_Sub1.method18(-25672, i_29_);
                                if (Class68_Sub13_Sub37.anInt4062 == 1) {
                                    Class75_Sub1.anInt3298++;
                                    Class68_Sub3.method652
                                            (i_17_, i_18_, (byte) -62,
                                                    (Class68_Sub20_Sub13_Sub2.method1166
                                                            (2, (new RSString[]
                                                                    {Class44.aRSString_743,
                                                                            Class25.aRSString_511,
                                                                            class19.aRSString_362}))),
                                                    (short) 8, Class76.aRSString_1347,
                                                    (long) i_29_);
                                } else if (Class21_Sub1.aBoolean2705) {
                                    if ((0x1 & Class33.anInt589 ^ 0xffffffff)
                                            == -2) {
                                        Class75_Sub3.anInt3323++;
                                        Class68_Sub3.method652
                                                (i_17_, i_18_, (byte) -128,
                                                        (Class68_Sub20_Sub13_Sub2
                                                                .method1166
                                                                        (2,
                                                                                (new RSString[]
                                                                                        {(Class68_Sub13_Sub1
                                                                                                .aRSString_3452),
                                                                                                Class25.aRSString_511,
                                                                                                class19.aRSString_362}))),
                                                        (short) 34, Class7.aRSString_118,
                                                        (long) i_29_);
                                    }
                                } else {
                                    Class57.anInt1070++;
                                    RSString[] class100s
                                            = class19.aRSStringArray369;
                                    if (Class92.aBoolean1649)
                                        class100s = (Class75_Sub1.method1387
                                                ((byte) -79, class100s));
                                    for (int i_30_ = 4; i_30_ >= 0; i_30_--) {
                                        if (class100s == null
                                                || class100s[i_30_] == null) {
                                            if (i_30_ == 2) {
                                                Class94.anInt1674++;
                                                Class68_Sub3.method652
                                                        (i_17_, i_18_, (byte) -104,
                                                                (Class68_Sub20_Sub13_Sub2
                                                                        .method1166
                                                                                (2,
                                                                                        (new RSString[]
                                                                                                {(Class68_Sub13_Sub10
                                                                                                        .aRSString_3588),
                                                                                                        (class19
                                                                                                                .aRSString_362)}))),
                                                                (short) 30,
                                                                (Class68_Sub13_Sub24
                                                                        .aRSString_3834),
                                                                (long) i_29_);
                                            }
                                        } else {
                                            Unknown.anInt1620++;
                                            short i_31_ = 0;
                                            if (i_30_ == 0)
                                                i_31_ = (short) 35;
                                            if (i_30_ == 1)
                                                i_31_ = (short) 45;
                                            if ((i_30_ ^ 0xffffffff) == -3)
                                                i_31_ = (short) 30;
                                            if (i_30_ == 3)
                                                i_31_ = (short) 3;
                                            if ((i_30_ ^ 0xffffffff) == -5)
                                                i_31_ = (short) 9;
                                            Class68_Sub3.method652
                                                    (i_17_, i_18_, (byte) -52,
                                                            (Class68_Sub20_Sub13_Sub2
                                                                    .method1166
                                                                            (2, (new RSString[]
                                                                                    {(Class68_Sub13_Sub10
                                                                                            .aRSString_3588),
                                                                                            (class19
                                                                                                    .aRSString_362)}))),
                                                            i_31_, class100s[i_30_],
                                                            (long) i_29_);
                                        }
                                    }
                                    Class68_Sub3.method652
                                            (i_17_, i_18_, (byte) -80,
                                                    (Class68_Sub20_Sub13_Sub2.method1166
                                                            (2, (new RSString[]
                                                                    {(Class68_Sub13_Sub10
                                                                            .aRSString_3588),
                                                                            class19.aRSString_362}))),
                                                    (short) 1006, Class119.aRSString_2086,
                                                    (long) i_29_);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method324(int i, int i_32_, int i_33_, byte[][][] is,
                                 int i_34_, byte i_35_, int i_36_, int i_37_) {
        Class68_Sub1.anInt2756++;
        Class68_Sub13_Sub11.anInt3618 = 0;
        int i_38_ = i_36_ - 16;
        int i_39_ = i_36_ + 16;
        int i_40_ = i_37_ - 16;
        int i_41_ = i_37_ + 16;
        for (int i_42_ = Class47.anInt944; i_42_ < Class86.anInt1582;
             i_42_++) {
            Class68_Sub1[][] class68_sub1s
                    = Class22.aClass68_Sub1ArrayArrayArray484[i_42_];
            for (int i_43_ = Class69.anInt1239; i_43_ < Class30.anInt549;
                 i_43_++) {
                for (int i_44_ = Class85.anInt1557; i_44_ < ISAACRandomGen.anInt1493;
                     i_44_++) {
                    Class68_Sub1 class68_sub1 = class68_sub1s[i_43_][i_44_];
                    if (class68_sub1 != null) {
                        if (!(Class68_Sub9.aBooleanArrayArray2887
                                [(i_43_ - Class68_Sub20_Sub10.anInt4319
                                + Class68_Sub20_Sub14.anInt4384)]
                                [(i_44_ - Class68_Sub26.anInt3186
                                + Class68_Sub20_Sub14.anInt4384)])
                                || (is != null && i_42_ >= i_34_
                                && is[i_42_][i_43_][i_44_] == i_35_)) {
                            class68_sub1.aBoolean2769 = false;
                            class68_sub1.aBoolean2770 = false;
                            class68_sub1.anInt2778 = 0;
                            if (i_43_ >= i_38_ && i_43_ <= i_39_
                                    && i_44_ >= i_40_ && i_44_ <= i_41_) {
                                if (class68_sub1.aClass64_2757 != null) {
                                    Class64 class64
                                            = class68_sub1.aClass64_2757;
                                    class64.aClass1_1181.method60
                                            (class64.anInt1176, class64.anInt1183,
                                                    100, class64.anInt1176,
                                                    class64.anInt1183);
                                    if (class64.aClass1_1184 != null)
                                        class64.aClass1_1184.method60
                                                (class64.anInt1176,
                                                        class64.anInt1183, 102,
                                                        class64.anInt1176,
                                                        class64.anInt1183);
                                }
                                if (class68_sub1.aClass76_2764 != null) {
                                    Class76 class76
                                            = class68_sub1.aClass76_2764;
                                    class76.aClass1_1358.method60
                                            (class76.anInt1352, class76.anInt1349,
                                                    98, class76.anInt1352,
                                                    class76.anInt1349);
                                    if (class76.aClass1_1360 != null)
                                        class76.aClass1_1360.method60
                                                (class76.anInt1352,
                                                        class76.anInt1349, 123,
                                                        class76.anInt1352,
                                                        class76.anInt1349);
                                }
                                if (class68_sub1.aClass47_2777 != null) {
                                    Class47 class47
                                            = class68_sub1.aClass47_2777;
                                    class47.aClass1_931.method60
                                            (class47.anInt932, class47.anInt941,
                                                    99, class47.anInt932,
                                                    class47.anInt941);
                                }
                                if (class68_sub1.aClass69Array2772 != null) {
                                    for (int i_45_ = 0;
                                         i_45_ < class68_sub1.anInt2771;
                                         i_45_++) {
                                        Class69 class69
                                                = (class68_sub1.aClass69Array2772
                                                [i_45_]);
                                        class69.aClass1_1242.method60
                                                (class69.anInt1234,
                                                        class69.anInt1254, 99,
                                                        class69.anInt1253,
                                                        class69.anInt1238);
                                    }
                                }
                            }
                        } else {
                            class68_sub1.aBoolean2769 = true;
                            class68_sub1.aBoolean2770 = true;
                            if (class68_sub1.anInt2771 > 0)
                                class68_sub1.aBoolean2781 = true;
                            else
                                class68_sub1.aBoolean2781 = false;
                            Class68_Sub13_Sub11.anInt3618++;
                        }
                    }
                }
            }
        }
        boolean bool = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                == Class68_Sub13_Sub14.anIntArrayArrayArray3671);
        for (int i_46_ = Class47.anInt944; i_46_ < Class86.anInt1582;
             i_46_++) {
            Class68_Sub1[][] class68_sub1s
                    = Class22.aClass68_Sub1ArrayArrayArray484[i_46_];
            for (int i_47_ = -Class68_Sub20_Sub14.anInt4384; i_47_ <= 0;
                 i_47_++) {
                int i_48_ = Class68_Sub20_Sub10.anInt4319 + i_47_;
                int i_49_ = Class68_Sub20_Sub10.anInt4319 - i_47_;
                if (i_48_ >= Class69.anInt1239 || i_49_ < Class30.anInt549) {
                    for (int i_50_ = -Class68_Sub20_Sub14.anInt4384;
                         i_50_ <= 0; i_50_++) {
                        int i_51_ = Class68_Sub26.anInt3186 + i_50_;
                        int i_52_ = Class68_Sub26.anInt3186 - i_50_;
                        if (i_48_ >= Class69.anInt1239) {
                            if (i_51_ >= Class85.anInt1557) {
                                Class68_Sub1 class68_sub1
                                        = class68_sub1s[i_48_][i_51_];
                                if (class68_sub1 != null
                                        && class68_sub1.aBoolean2769)
                                    Class108.method1655(class68_sub1, true);
                            }
                            if (i_52_ < ISAACRandomGen.anInt1493) {
                                Class68_Sub1 class68_sub1
                                        = class68_sub1s[i_48_][i_52_];
                                if (class68_sub1 != null
                                        && class68_sub1.aBoolean2769)
                                    Class108.method1655(class68_sub1, true);
                            }
                        }
                        if (i_49_ < Class30.anInt549) {
                            if (i_51_ >= Class85.anInt1557) {
                                Class68_Sub1 class68_sub1
                                        = class68_sub1s[i_49_][i_51_];
                                if (class68_sub1 != null
                                        && class68_sub1.aBoolean2769)
                                    Class108.method1655(class68_sub1, true);
                            }
                            if (i_52_ < ISAACRandomGen.anInt1493) {
                                Class68_Sub1 class68_sub1
                                        = class68_sub1s[i_49_][i_52_];
                                if (class68_sub1 != null
                                        && class68_sub1.aBoolean2769)
                                    Class108.method1655(class68_sub1, true);
                            }
                        }
                        if (Class68_Sub13_Sub11.anInt3618 == 0) {
                            if (!bool)
                                Stream.aBoolean2984 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int i_53_ = Class47.anInt944; i_53_ < Class86.anInt1582;
             i_53_++) {
            Class68_Sub1[][] class68_sub1s
                    = Class22.aClass68_Sub1ArrayArrayArray484[i_53_];
            for (int i_54_ = -Class68_Sub20_Sub14.anInt4384; i_54_ <= 0;
                 i_54_++) {
                int i_55_ = Class68_Sub20_Sub10.anInt4319 + i_54_;
                int i_56_ = Class68_Sub20_Sub10.anInt4319 - i_54_;
                if (i_55_ >= Class69.anInt1239 || i_56_ < Class30.anInt549) {
                    for (int i_57_ = -Class68_Sub20_Sub14.anInt4384;
                         i_57_ <= 0; i_57_++) {
                        int i_58_ = Class68_Sub26.anInt3186 + i_57_;
                        int i_59_ = Class68_Sub26.anInt3186 - i_57_;
                        if (i_55_ >= Class69.anInt1239) {
                            if (i_58_ >= Class85.anInt1557) {
                                Class68_Sub1 class68_sub1
                                        = class68_sub1s[i_55_][i_58_];
                                if (class68_sub1 != null
                                        && class68_sub1.aBoolean2769)
                                    Class108.method1655(class68_sub1, false);
                            }
                            if (i_59_ < ISAACRandomGen.anInt1493) {
                                Class68_Sub1 class68_sub1
                                        = class68_sub1s[i_55_][i_59_];
                                if (class68_sub1 != null
                                        && class68_sub1.aBoolean2769)
                                    Class108.method1655(class68_sub1, false);
                            }
                        }
                        if (i_56_ < Class30.anInt549) {
                            if (i_58_ >= Class85.anInt1557) {
                                Class68_Sub1 class68_sub1
                                        = class68_sub1s[i_56_][i_58_];
                                if (class68_sub1 != null
                                        && class68_sub1.aBoolean2769)
                                    Class108.method1655(class68_sub1, false);
                            }
                            if (i_59_ < ISAACRandomGen.anInt1493) {
                                Class68_Sub1 class68_sub1
                                        = class68_sub1s[i_56_][i_59_];
                                if (class68_sub1 != null
                                        && class68_sub1.aBoolean2769)
                                    Class108.method1655(class68_sub1, false);
                            }
                        }
                        if (Class68_Sub13_Sub11.anInt3618 == 0) {
                            if (!bool)
                                Stream.aBoolean2984 = false;
                            return;
                        }
                    }
                }
            }
        }
        Stream.aBoolean2984 = false;
    }

    public static void method325(byte i) {
        if (i == 87) {
            aRSString_400 = null;
            aRSString_421 = null;
            aRSString_401 = null;
            aRSString_413 = null;
            aRSString_399 = null;
            aRSString_404 = null;
        }
    }

    public static void method326(int i, int i_60_, boolean bool) {
        anInt416++;
        if (bool == true) {
            long l = (long) ((i << 1996473648) + i_60_);
            Class68_Sub20_Sub15 class68_sub20_sub15
                    = ((Class68_Sub20_Sub15)
                    Stream.aClass113_3008.method1678(l, -111));
            if (class68_sub20_sub15 != null)
                Class68_Sub7.aClass128_2854.method1786(class68_sub20_sub15,
                        (byte) 121);
        }
    }

    public static void method327(byte i) {
        Class68_Sub20_Sub13.aClass50_4364.method529(true);
        for (int i_61_ = 0; i_61_ < 32; i_61_++)
            Class86.aLongArray1575[i_61_] = 0L;
        for (int i_62_ = 0; i_62_ < 32; i_62_++)
            Class122.aLongArray2113[i_62_] = 0L;
        if (i < 24)
            method322(37, null);
        anInt419++;
        Class68_Sub13_Sub22.anInt3810 = 0;
    }

    static {
        aRSString_401 = aRSString_404;
        anInt403 = 0;
        aRSString_413 = RSString.newRsString("runes");
        anInt412 = 0;
        aRSString_421 = RSString.newRsString("cyan:");
        aRSString_400 = aRSString_421;
        aRSString_399 = aRSString_421;
    }
}
