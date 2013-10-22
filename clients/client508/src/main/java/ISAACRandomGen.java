/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ISAACRandomGen {
    public static int anInt1473;
    public static int anInt1474;
    public static int anInt1475;
    public int[] anIntArray1476;
    public int anInt1477;
    public static RSString aRSString_1478;
    public int[] anIntArray1479;
    public static long aLong1480 = 0L;
    public static RSString aRSString_1481;
    public int anInt1482;
    public static int anInt1483;
    public static int anInt1484;
    public static int anInt1485;
    public int anInt1486;
    public static boolean aBoolean1487;
    public static RSString aRSString_1488;
    public static int anInt1489;
    public static int anInt1490;
    public int anInt1491;
    public static int anInt1492;
    public static int anInt1493;
    public static int anInt1494;
    public static long aLong1495;
    public static byte[] aByteArray1496;

    public void method1453(int i) {
        anInt1475++;
        int i_1_;
        int i_2_;
        int i_3_;
        int i_4_;
        int i_5_;
        int i_6_;
        int i_7_;
        int i_0_
                = i_1_ = i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = -1640531527;
        if (i == -1944247670) {
            for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -5; i_8_++) {
                i_0_ ^= i_1_ << 536238379;
                i_1_ += i_2_;
                i_3_ += i_0_;
                i_1_ ^= i_2_ >>> 1806484802;
                i_4_ += i_1_;
                i_2_ += i_3_;
                i_2_ ^= i_3_ << 831016456;
                i_3_ += i_4_;
                i_5_ += i_2_;
                i_3_ ^= i_4_ >>> -1300765904;
                i_4_ += i_5_;
                i_4_ ^= i_5_ << 189089642;
                i_7_ += i_4_;
                i_6_ += i_3_;
                i_5_ += i_6_;
                i_5_ ^= i_6_ >>> 643461668;
                i_0_ += i_5_;
                i_6_ += i_7_;
                i_6_ ^= i_7_ << 840512776;
                i_7_ += i_0_;
                i_7_ ^= i_0_ >>> -2035728055;
                i_2_ += i_7_;
                i_1_ += i_6_;
                i_0_ += i_1_;
            }
            for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -257; i_9_ += 8) {
                i_2_ += anIntArray1479[2 + i_9_];
                i_4_ += anIntArray1479[i_9_ + 4];
                i_1_ += anIntArray1479[i_9_ + 1];
                i_6_ += anIntArray1479[6 + i_9_];
                i_3_ += anIntArray1479[3 + i_9_];
                i_7_ += anIntArray1479[7 + i_9_];
                i_5_ += anIntArray1479[5 + i_9_];
                i_0_ += anIntArray1479[i_9_];
                i_0_ ^= i_1_ << -1712069621;
                i_1_ += i_2_;
                i_3_ += i_0_;
                i_1_ ^= i_2_ >>> -1776481118;
                i_2_ += i_3_;
                i_4_ += i_1_;
                i_2_ ^= i_3_ << 1600557576;
                i_3_ += i_4_;
                i_5_ += i_2_;
                i_3_ ^= i_4_ >>> -531635568;
                i_6_ += i_3_;
                i_4_ += i_5_;
                i_4_ ^= i_5_ << -1944247670;
                i_7_ += i_4_;
                i_5_ += i_6_;
                i_5_ ^= i_6_ >>> 1239888868;
                i_6_ += i_7_;
                i_6_ ^= i_7_ << -743941560;
                i_1_ += i_6_;
                i_0_ += i_5_;
                i_7_ += i_0_;
                i_7_ ^= i_0_ >>> -96812311;
                i_2_ += i_7_;
                i_0_ += i_1_;
                anIntArray1476[i_9_] = i_0_;
                anIntArray1476[i_9_ - -1] = i_1_;
                anIntArray1476[2 + i_9_] = i_2_;
                anIntArray1476[i_9_ - -3] = i_3_;
                anIntArray1476[4 + i_9_] = i_4_;
                anIntArray1476[i_9_ + 5] = i_5_;
                anIntArray1476[i_9_ + 6] = i_6_;
                anIntArray1476[7 + i_9_] = i_7_;
            }
            for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
                i_2_ += anIntArray1476[i_10_ - -2];
                i_7_ += anIntArray1476[7 + i_10_];
                i_0_ += anIntArray1476[i_10_];
                i_5_ += anIntArray1476[i_10_ + 5];
                i_4_ += anIntArray1476[4 + i_10_];
                i_1_ += anIntArray1476[i_10_ - -1];
                i_3_ += anIntArray1476[3 + i_10_];
                i_0_ ^= i_1_ << -1515579477;
                i_1_ += i_2_;
                i_3_ += i_0_;
                i_6_ += anIntArray1476[6 + i_10_];
                i_1_ ^= i_2_ >>> -1479284094;
                i_4_ += i_1_;
                i_2_ += i_3_;
                i_2_ ^= i_3_ << 1088272488;
                i_3_ += i_4_;
                i_5_ += i_2_;
                i_3_ ^= i_4_ >>> -1814256976;
                i_4_ += i_5_;
                i_4_ ^= i_5_ << 1752595018;
                i_7_ += i_4_;
                i_6_ += i_3_;
                i_5_ += i_6_;
                i_5_ ^= i_6_ >>> 1591112580;
                i_6_ += i_7_;
                i_6_ ^= i_7_ << -1848071032;
                i_1_ += i_6_;
                i_0_ += i_5_;
                i_7_ += i_0_;
                i_7_ ^= i_0_ >>> 982418569;
                i_0_ += i_1_;
                i_2_ += i_7_;
                anIntArray1476[i_10_] = i_0_;
                anIntArray1476[1 + i_10_] = i_1_;
                anIntArray1476[i_10_ + 2] = i_2_;
                anIntArray1476[i_10_ + 3] = i_3_;
                anIntArray1476[4 + i_10_] = i_4_;
                anIntArray1476[i_10_ - -5] = i_5_;
                anIntArray1476[6 + i_10_] = i_6_;
                anIntArray1476[7 + i_10_] = i_7_;
            }
            method1458(41);
            anInt1477 = 256;
        }
    }

    public static int method1454(byte i, Class21renamed class21) {
        if (i != -126)
            aLong1480 = -41L;
        anInt1485++;
        int i_11_ = 0;
        if (class21.method360(Class17.anInt279, i + 126))
            i_11_++;
        if (class21.method360(Class68_Sub13_Sub14.anInt3670, 0))
            i_11_++;
        return i_11_;
    }

    public static void method1455(byte i, int i_12_, int i_13_, boolean bool,
                                  int i_14_, int i_15_, int i_16_) {
        anInt1494++;
        if ((i_15_ ^ 0xffffffff) != (ItemDef.anInt365 ^ 0xffffffff)
                || (Class43.anInt732 ^ 0xffffffff) != (i_16_ ^ 0xffffffff)
                || ((Class68_Sub13_Sub18.anInt3737 ^ 0xffffffff) != (i_13_
                ^ 0xffffffff)
                && !Class28.method398(24781))) {
            Class68_Sub13_Sub18.anInt3737 = i_13_;
            Class43.anInt732 = i_16_;
            ItemDef.anInt365 = i_15_;
            if (Class28.method398(24781))
                Class68_Sub13_Sub18.anInt3737 = 0;
            if (!bool)
                Class17.method296(25, (byte) -85);
            else
                Class17.method296(28, (byte) -76);
            if (i >= -1)
                aLong1495 = -24L;
            Class74.method1381(true, Class68_Sub13_Sub19.aRSString_3742,
                    -16678);
            int i_17_ = Class36.anInt643;
            Class36.anInt643 = 8 * i_15_ + -48;
            int i_18_ = Class68_Sub13_Sub35.anInt4026;
            Class68_Sub13_Sub35.anInt4026 = i_16_ * 8 + -48;
            Class97.aClass68_Sub20_Sub16_1702
                    = PacketStream.method975(Class43.anInt732 * 8,
                    8 * ItemDef.anInt365, 111);
            int i_19_ = Class36.anInt643 - i_17_;
            i_17_ = Class36.anInt643;
            int i_20_ = Class68_Sub13_Sub35.anInt4026 - i_18_;
            i_18_ = Class68_Sub13_Sub35.anInt4026;
            if (bool) {
                Class13_Sub2.anInt2645 = 0;
                for (int i_21_ = 0; i_21_ < 32768; i_21_++) {
                    Class1_Sub6_Sub1 class1_sub6_sub1
                            = Class102.aClass1_Sub6_Sub1Array1746[i_21_];
                    if (class1_sub6_sub1 != null) {
                        class1_sub6_sub1.anInt2561 -= i_19_ * 128;
                        class1_sub6_sub1.anInt2537 -= i_20_ * 128;
                        if (class1_sub6_sub1.anInt2561 >= 0
                                && ((class1_sub6_sub1.anInt2561 ^ 0xffffffff)
                                >= -13185)
                                && (class1_sub6_sub1.anInt2537 ^ 0xffffffff) <= -1
                                && ((class1_sub6_sub1.anInt2537 ^ 0xffffffff)
                                >= -13185)) {
                            for (int i_22_ = 0; i_22_ < 10; i_22_++) {
                                class1_sub6_sub1.anIntArray2523[i_22_]
                                        -= i_19_;
                                class1_sub6_sub1.anIntArray2570[i_22_]
                                        -= i_20_;
                            }
                            Class68_Sub10.anIntArray2906
                                    [Class13_Sub2.anInt2645++]
                                    = i_21_;
                        } else {
                            Class102.aClass1_Sub6_Sub1Array1746[i_21_]
                                    .aClass80_3395
                                    = null;
                            Class102.aClass1_Sub6_Sub1Array1746[i_21_] = null;
                        }
                    }
                }
            } else {
                for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -32769; i_23_++) {
                    Class1_Sub6_Sub1 class1_sub6_sub1
                            = Class102.aClass1_Sub6_Sub1Array1746[i_23_];
                    if (class1_sub6_sub1 != null) {
                        for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -11;
                             i_24_++) {
                            class1_sub6_sub1.anIntArray2523[i_24_] -= i_19_;
                            class1_sub6_sub1.anIntArray2570[i_24_] -= i_20_;
                        }
                        class1_sub6_sub1.anInt2561 -= 128 * i_19_;
                        class1_sub6_sub1.anInt2537 -= 128 * i_20_;
                    }
                }
            }
            for (int i_25_ = 0; i_25_ < 2048; i_25_++) {
                Class1_Sub6_Sub2 class1_sub6_sub2
                        = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_25_];
                if (class1_sub6_sub2 != null) {
                    for (int i_26_ = 0; i_26_ < 10; i_26_++) {
                        class1_sub6_sub2.anIntArray2523[i_26_] -= i_19_;
                        class1_sub6_sub2.anIntArray2570[i_26_] -= i_20_;
                    }
                    class1_sub6_sub2.anInt2537 -= i_20_ * 128;
                    class1_sub6_sub2.anInt2561 -= 128 * i_19_;
                }
            }
            GameSocket.anInt1149 = i_13_;
            Class68_Sub7.aClass1_Sub6_Sub2_2860.method147(i_12_, (byte) -68,
                    i_14_, false);
            int i_27_ = 1;
            int i_28_ = 0;
            int i_29_ = 0;
            int i_30_ = 104;
            if ((i_19_ ^ 0xffffffff) > -1) {
                i_30_ = -1;
                i_28_ = 103;
                i_27_ = -1;
            }
            int i_31_ = 1;
            int i_32_ = 104;
            if (i_20_ < 0) {
                i_32_ = -1;
                i_31_ = -1;
                i_29_ = 103;
            }
            for (int i_33_ = i_28_;
                 (i_30_ ^ 0xffffffff) != (i_33_ ^ 0xffffffff);
                 i_33_ += i_27_) {
                for (int i_34_ = i_29_;
                     (i_32_ ^ 0xffffffff) != (i_34_ ^ 0xffffffff);
                     i_34_ += i_31_) {
                    int i_35_ = i_34_ - -i_20_;
                    int i_36_ = i_19_ + i_33_;
                    for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > -5; i_37_++) {
                        if ((i_36_ ^ 0xffffffff) <= -1
                                && (i_35_ ^ 0xffffffff) <= -1
                                && (i_36_ ^ 0xffffffff) > -105
                                && (i_35_ ^ 0xffffffff) > -105)
                            Class45.aClass16ArrayArrayArray926[i_37_]
                                    [i_33_][i_34_]
                                    = (Class45.aClass16ArrayArrayArray926[i_37_]
                                    [i_36_][i_35_]);
                        else
                            Class45.aClass16ArrayArrayArray926[i_37_]
                                    [i_33_][i_34_]
                                    = null;
                    }
                }
            }
            for (Class68_Sub2 class68_sub2
                         = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3963
                    .method293((byte) 76);
                 class68_sub2 != null;
                 class68_sub2
                         = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3963
                         .method290((byte) -108)) {
                class68_sub2.anInt2784 -= i_20_;
                class68_sub2.anInt2791 -= i_19_;
                if ((class68_sub2.anInt2791 ^ 0xffffffff) > -1
                        || (class68_sub2.anInt2784 ^ 0xffffffff) > -1
                        || class68_sub2.anInt2791 >= 104
                        || (class68_sub2.anInt2784 ^ 0xffffffff) <= -105)
                    class68_sub2.method647(-17554);
            }
            if (Class95.anInt1684 != 0) {
                Class75_Sub2.anInt3315 -= i_20_;
                Class95.anInt1684 -= i_19_;
            }
            if (!bool)
                Class128.anInt2214 = 1;
            else {
                Class8.anInt161 -= i_19_;
                PlayerDefinition.anInt2191 -= i_20_;
                Class68_Sub13_Sub37.anInt4067 -= i_20_;
                Stream.anInt2954 -= i_19_;
            }
            Class68_Sub13_Sub32.anInt3981 = -1;
            Class1_Sub2.anInt2435 = 0;
            Class105.aClass16_1790.method284(105);
            Class45.aClass16_886.method284(105);
        }
    }

    public static void method1456(int i, long l) {
        try {
            anInt1483++;
            Class21renamed.stream.currentOffset = 0;
            Class21renamed.stream.writeByte(118);
            Class21renamed.stream.writeQWord(true, l);
            Class68_Sub13_Sub27.anInt3914 = 1;
            Class50.anInt980 = i;
            Class88.anInt1602 = 0;
            Class64.anInt1190 = 0;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "ng.B(" + i + ',' + l + ')');
        }
    }

    public static Class92_Sub1[] method1457(int i) {
        anInt1492++;
        Class92_Sub1[] class92_sub1s
                = new Class92_Sub1[Stream.anInt3007];
        for (int i_38_ = 0; i_38_ < Stream.anInt3007; i_38_++)
            class92_sub1s[i_38_]
                    = new Class92_Sub1(Class97.anInt1703,
                    Class68_Sub20_Sub15.anInt4405,
                    Class4.anIntArray96[i_38_],
                    Class116.anIntArray1996[i_38_],
                    Class68_Sub13_Sub12.anIntArray3639[i_38_],
                    Class68_Sub13_Sub19.anIntArray3757[i_38_],
                    Class69.aByteArrayArray1240[i_38_],
                    Class68_Sub13_Sub17.anIntArray3719);
        Class87.method1487((byte) -93);
        if (i < 11)
            return null;
        return class92_sub1s;
    }

    public void method1458(int i) {
        anInt1491 += ++anInt1486;
        if (i < 11)
            aLong1480 = 42L;
        anInt1474++;
        for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > -257; i_39_++) {
            int i_40_ = anIntArray1476[i_39_];
            if ((0x2 & i_39_ ^ 0xffffffff) != -1) {
                if ((i_39_ & 0x1) != 0)
                    anInt1482 ^= anInt1482 >>> -210860752;
                else
                    anInt1482 ^= anInt1482 << 85627138;
            } else if ((0x1 & i_39_) == 0)
                anInt1482 ^= anInt1482 << 934053197;
            else
                anInt1482 ^= anInt1482 >>> 1106819302;
            anInt1482 += anIntArray1476[0xff & 128 + i_39_];
            int i_41_;
            anIntArray1476[i_39_] = i_41_
                    = (anInt1482
                    + anIntArray1476[Class120.method1740(i_40_ >> -491099262,
                    255)]
                    - -anInt1491);
            anIntArray1479[i_39_] = anInt1491
                    = i_40_ + anIntArray1476[Class120.method1740((i_41_
                    >> 1984091336
                    >> 1726074786),
                    255)];
        }
    }

    public static void method1459(byte i) {
        aByteArray1496 = null;
        if (i < 80)
            anInt1493 = 48;
        aRSString_1481 = null;
        aRSString_1478 = null;
        aRSString_1488 = null;
    }

    public static boolean method1460(int i) {
        if (i != -15855)
            aLong1480 = 17L;
        anInt1490++;
        if (Class68_Sub13_Sub10.anInt3597 != 0) {
            try {
                if (((Boolean) (Class68_Sub20_Sub15.aRSString_4390.method1604
                        (Class75_Sub1_Sub1.signlink.anApplet1042,
                                (byte) -123)))
                        .booleanValue())
                    return false;
                return true;
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        return true;
    }

    public static Sprite[] method1461
            (boolean bool, int i, int i_42_, Class21renamed class21) {
        anInt1473++;
        if (bool != false)
            anInt1493 = 43;
        if (!Class68_Sub13_Sub36.method880(-29381, i, class21, i_42_))
            return null;
        return Class121.method1744(true);
    }

    public int getNextKey(byte i) {
        if (anInt1477-- == 0) {
            method1458(87);
            anInt1477 = 255;
        }
        int i_43_ = 14 / ((i - 20) / 35);
        anInt1484++;
        return 0;
        //return anIntArray1479[anInt1477];
    }

    public ISAACRandomGen() {
        /* empty */
    }

    public ISAACRandomGen(int[] is) {
        anIntArray1476 = new int[256];
        anIntArray1479 = new int[256];
        for (int i = 0; is.length > i; i++)
            anIntArray1479[i] = is[i];
        method1453(-1944247670);
    }

    static {
        aRSString_1478 = RSString.newRsString("<col=ffb000>");
        aRSString_1488 = RSString.newRsString("<col=ff3000>");
        anInt1489 = -1;
        aBoolean1487 = true;
        aRSString_1481 = RSString.newRsString("details");
        aByteArray1496
                = new byte[]{95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106,
                107, 108, 109, 110, 111, 112, 113, 114, 115, 116,
                117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52,
                53, 54, 55, 56, 57};
    }
}
