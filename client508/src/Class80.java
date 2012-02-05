/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class80 {
    public static int[] anIntArray1406;
    public static int anInt1407;
    public static int anInt1408;
    public int anInt1409;
    public int anInt1410;
    public static int anInt1411;
    public short[] aShortArray1412;
    public Class113 aClass113_1413;
    public static int anInt1414;
    public int anInt1415;
    public int anInt1416 = 128;
    public static int anInt1417;
    public static Class68_Sub28_Sub4 aClass68_Sub28_Sub4_1418;
    public short aShort1419;
    public boolean aBoolean1420;
    public int anInt1421;
    public byte[] aByteArray1422;
    public short aShort1423;
    public boolean aBoolean1424;
    public short[] aShortArray1425;
    public int anInt1426;
    public static int anInt1427;
    public int anInt1428;
    public int anInt1429;
    public int anInt1430;
    public int[] anIntArray1431;
    public RSString[] aRSStringArray1432 = new RSString[5];
    public boolean aBoolean1433;
    public static int anInt1434 = -1;
    public int[] anIntArray1435;
    public short aShort1436;
    public int anInt1437 = -1;
    public boolean aBoolean1438;
    public int anInt1439;
    public int anInt1440;
    public static RSString aRSString_1441 = RSString.newRsString("null");
    public short[] aShortArray1442;
    public short[] aShortArray1443;
    public int anInt1444;
    public static int anInt1445;
    public byte aByte1446;
    public int anInt1447;
    public boolean aBoolean1448;
    public static int anInt1449;
    public static int anInt1450;
    public int anInt1451;
    public static int anInt1452;
    public byte aByte1453;
    public int[] anIntArray1454;
    public static RSString aRSString_1455
            = RSString.newRsString("Hierhin gehen");
    public int anInt1456;
    public int[][] anIntArrayArray1457;
    public int anInt1458;
    public static int anInt1459;
    public static int anInt1460;
    public int anInt1461;
    public int anInt1462;
    public int anInt1463;
    public short aShort1464;
    public static int anInt1465 = 0;
    public RSString aRSString_1466;
    public int anInt1467;
    public static int anInt1468;
    public int anInt1469;
    public byte aByte1470;
    public int anInt1471;
    public static int anInt1472;

    public RSString method1440(int i, RSString class100, int i_0_) {
        anInt1411++;
        if (aClass113_1413 == null)
            return class100;
        if (i != 0)
            return null;
        Class68_Sub5 class68_sub5
                = (Class68_Sub5) aClass113_1413.method1678((long) i_0_, -80);
        if (class68_sub5 == null)
            return class100;
        return class68_sub5.aRSString_2830;
    }

    public static void method1441(int i, RSString class100) {
        anInt1407++;
        for (Class68_Sub20_Sub16 class68_sub20_sub16
                     = ((Class68_Sub20_Sub16)
                Class35.aClass16_602.method293((byte) 76));
             class68_sub20_sub16 != null;
             class68_sub20_sub16
                     = ((Class68_Sub20_Sub16)
                     Class35.aClass16_602.method290((byte) 62))) {
            if (class68_sub20_sub16.aRSString_4412.method1593(class100,
                    (byte) 107)) {
                Class30.aClass68_Sub20_Sub16_540 = class68_sub20_sub16;
                return;
            }
        }
        if (i != 0)
            anInt1445 = 94;
    }

    public int method1442(int i, int i_1_, int i_2_) {
        anInt1460++;
        if (aClass113_1413 == null)
            return i_1_;
        Class68_Sub10 class68_sub10
                = (Class68_Sub10) aClass113_1413.method1678((long) i, -54);
        if (class68_sub10 == null)
            return i_1_;
        int i_3_ = 71 / ((i_2_ - 40) / 45);
        return class68_sub10.anInt2902;
    }

    public void method1443(Stream class68_sub14, byte i) {
        for (; ; ) {
            int i_4_ = class68_sub14.readUnsignedByte(-6677);
            if (i_4_ == 0)
                break;
            method1448(i_4_, class68_sub14, false);
        }
        anInt1472++;
        if (i != -53)
            method1444(-106);
    }

    public boolean method1444(int i) {
        anInt1452++;
        if (anIntArray1431 == null) {
            if ((anInt1429 ^ 0xffffffff) == 0 && anInt1430 == -1
                    && anInt1471 == -1)
                return false;
            return true;
        }
        for (int i_5_ = i; anIntArray1431.length > i_5_; i_5_++) {
            if (anIntArray1431[i_5_] != -1) {
                Class80 class80_6_
                        = Class68_Sub13_Sub11.method753(anIntArray1431[i_5_],
                        i ^ ~0x76);
                if ((class80_6_.anInt1429 ^ 0xffffffff) != 0
                        || (class80_6_.anInt1430 ^ 0xffffffff) != 0
                        || (class80_6_.anInt1471 ^ 0xffffffff) != 0)
                    return true;
            }
        }
        return false;
    }

    public static void method1445(int i) {
        Class121.aClass98_2100.method1566((byte) 94);
        anInt1449++;
        if (i != -10705)
            method1445(5);
    }

    public static void method1446(int i) {
        if (i == 1) {
            aRSString_1441 = null;
            aClass68_Sub28_Sub4_1418 = null;
            anIntArray1406 = null;
            aRSString_1455 = null;
        }
    }

    public Class80 method1447(int i) {
        anInt1468++;
        if (i != -94)
            method1446(80);
        int i_7_ = -1;
        if ((anInt1426 ^ 0xffffffff) != 0)
            i_7_ = Class18.method300(anInt1426, false);
        else if ((anInt1469 ^ 0xffffffff) != 0)
            i_7_ = Class103.anIntArray1767[anInt1469];
        if (i_7_ < 0 || -1 + anIntArray1431.length <= i_7_
                || (anIntArray1431[i_7_] ^ 0xffffffff) == 0) {
            int i_8_ = anIntArray1431[anIntArray1431.length + -1];
            if ((i_8_ ^ 0xffffffff) != 0)
                return Class68_Sub13_Sub11.method753(i_8_, 75);
            return null;
        }
        return Class68_Sub13_Sub11.method753(anIntArray1431[i_7_], 48);
    }

    public void method1448(int i, Stream class68_sub14, boolean bool) {
        anInt1459++;
        if ((i ^ 0xffffffff) != -2) {
            if ((i ^ 0xffffffff) != -3) {
                if ((i ^ 0xffffffff) != -13) {
                    if ((i ^ 0xffffffff) != -14) {
                        if (i == 14)
                            anInt1440 = class68_sub14.readUnsignedWord(1355769544);
                        else if ((i ^ 0xffffffff) != -16) {
                            if (i != 16) {
                                if ((i ^ 0xffffffff) != -18) {
                                    if ((i ^ 0xffffffff) > -31
                                            || (i ^ 0xffffffff) <= -36) {
                                        if ((i ^ 0xffffffff) == -41) {
                                            int i_9_ = class68_sub14
                                                    .readUnsignedByte(-6677);
                                            aShortArray1443 = new short[i_9_];
                                            aShortArray1412 = new short[i_9_];
                                            for (int i_10_ = 0; i_9_ > i_10_;
                                                 i_10_++) {
                                                aShortArray1443[i_10_]
                                                        = (short) (class68_sub14
                                                        .readUnsignedWord
                                                                (1355769544));
                                                aShortArray1412[i_10_]
                                                        = (short) (class68_sub14
                                                        .readUnsignedWord
                                                                (1355769544));
                                            }
                                        } else if (i == 41) {
                                            int i_11_ = class68_sub14
                                                    .readUnsignedByte(-6677);
                                            aShortArray1442 = new short[i_11_];
                                            aShortArray1425 = new short[i_11_];
                                            for (int i_12_ = 0;
                                                 ((i_12_ ^ 0xffffffff)
                                                         > (i_11_ ^ 0xffffffff));
                                                 i_12_++) {
                                                aShortArray1442[i_12_]
                                                        = (short) (class68_sub14
                                                        .readUnsignedWord
                                                                (1355769544));
                                                aShortArray1425[i_12_]
                                                        = (short) (class68_sub14
                                                        .readUnsignedWord
                                                                (1355769544));
                                            }
                                        } else if (i == 42) {
                                            int i_13_ = class68_sub14
                                                    .readUnsignedByte(-6677);
                                            aByteArray1422 = new byte[i_13_];
                                            for (int i_14_ = 0;
                                                 ((i_13_ ^ 0xffffffff)
                                                         < (i_14_ ^ 0xffffffff));
                                                 i_14_++)
                                                aByteArray1422[i_14_]
                                                        = class68_sub14
                                                        .method955(3390);
                                        } else if (i != 60) {
                                            if ((i ^ 0xffffffff) != -94) {
                                                if (i == 95)
                                                    anInt1444 = (class68_sub14
                                                            .readUnsignedWord
                                                                    (1355769544));
                                                else if ((i ^ 0xffffffff)
                                                        != -98) {
                                                    if ((i ^ 0xffffffff)
                                                            == -99)
                                                        anInt1416
                                                                = (class68_sub14
                                                                .readUnsignedWord
                                                                        (1355769544));
                                                    else if (i != 99) {
                                                        if (i != 100) {
                                                            if (i != 101) {
                                                                if (i == 102)
                                                                    anInt1439
                                                                            = (class68_sub14.readUnsignedWord
                                                                            (1355769544));
                                                                else if ((i
                                                                        ^ 0xffffffff)
                                                                        == -104)
                                                                    anInt1456
                                                                            = (class68_sub14.readUnsignedWord
                                                                            (1355769544));
                                                                else if (i == 106
                                                                        || ((i
                                                                        ^ 0xffffffff)
                                                                        == -119)) {
                                                                    anInt1426
                                                                            = (class68_sub14.readUnsignedWord
                                                                            (1355769544));
                                                                    if ((anInt1426
                                                                            ^ 0xffffffff)
                                                                            == -65536)
                                                                        anInt1426
                                                                                = -1;
                                                                    anInt1469
                                                                            = (class68_sub14.readUnsignedWord
                                                                            (1355769544));
                                                                    if (anInt1469
                                                                            == 65535)
                                                                        anInt1469
                                                                                = -1;
                                                                    int i_15_
                                                                            = -1;
                                                                    if (i
                                                                            == 118) {
                                                                        i_15_
                                                                                = class68_sub14.readUnsignedWord(1355769544);
                                                                        if (i_15_
                                                                                == 65535)
                                                                            i_15_ = -1;
                                                                    }
                                                                    int i_16_
                                                                            = (class68_sub14.readUnsignedByte
                                                                            (-6677));
                                                                    anIntArray1431
                                                                            = (new int
                                                                            [2 + i_16_]);
                                                                    for (int i_17_
                                                                                 = 0;
                                                                         ((i_17_
                                                                                 ^ 0xffffffff)
                                                                                 >= (i_16_
                                                                                 ^ 0xffffffff));
                                                                         i_17_++) {
                                                                        anIntArray1431
                                                                                [i_17_]
                                                                                = class68_sub14.readUnsignedWord(1355769544);
                                                                        if ((anIntArray1431[i_17_]
                                                                                ^ 0xffffffff)
                                                                                == -65536)
                                                                            anIntArray1431[i_17_] = -1;
                                                                    }
                                                                    anIntArray1431
                                                                            [1 + i_16_]
                                                                            = i_15_;
                                                                } else if (i
                                                                        != 107) {
                                                                    if ((i
                                                                            ^ 0xffffffff)
                                                                            == -110)
                                                                        aBoolean1424
                                                                                = false;
                                                                    else if (i
                                                                            == 111)
                                                                        aBoolean1448
                                                                                = false;
                                                                    else if (i
                                                                            == 113) {
                                                                        aShort1464
                                                                                = (short) class68_sub14.readUnsignedWord(1355769544);
                                                                        aShort1436
                                                                                = (short) class68_sub14.readUnsignedWord(1355769544);
                                                                    } else if ((i ^ 0xffffffff)
                                                                            == -115) {
                                                                        aByte1470
                                                                                = class68_sub14.method955(3390);
                                                                        aByte1453
                                                                                = class68_sub14.method955(3390);
                                                                    } else if (i
                                                                            == 115) {
                                                                        aShort1419
                                                                                = (short) (4 * class68_sub14.readUnsignedByte(-6677));
                                                                        aShort1423
                                                                                = (short) (class68_sub14.readUnsignedByte(-6677) * 4);
                                                                    } else if ((i ^ 0xffffffff)
                                                                            == -120)
                                                                        aByte1446
                                                                                = class68_sub14.method955(3390);
                                                                    else if ((i
                                                                            ^ 0xffffffff)
                                                                            != -121) {
                                                                        if ((i
                                                                                ^ 0xffffffff)
                                                                                == -122) {
                                                                            anIntArrayArray1457 = new int[anIntArray1454.length][];
                                                                            int i_18_ = class68_sub14.readUnsignedByte(-6677);
                                                                            for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
                                                                                int i_20_ = class68_sub14.readUnsignedByte(-6677);
                                                                                int[] is = anIntArrayArray1457[i_20_] = new int[3];
                                                                                is[0] = class68_sub14.method955(3390);
                                                                                is[1] = class68_sub14.method955(3390);
                                                                                is[2] = class68_sub14.method955(3390);
                                                                            }
                                                                        } else if (i == 122)
                                                                            anInt1437 = class68_sub14.readUnsignedWord(1355769544);
                                                                        else if ((i ^ 0xffffffff) == -250) {
                                                                            int i_21_ = class68_sub14.readUnsignedByte(-6677);
                                                                            if (aClass113_1413 == null) {
                                                                                int i_22_ = Class90.method1517(i_21_, -21189);
                                                                                aClass113_1413 = new Class113(i_22_);
                                                                            }
                                                                            for (int i_23_ = 0; i_21_ > i_23_; i_23_++) {
                                                                                boolean bool_24_ = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
                                                                                int i_25_ = class68_sub14.method921((byte) 50);
                                                                                Class68 class68;
                                                                                if (bool_24_)
                                                                                    class68 = new Class68_Sub5(class68_sub14.readString(127));
                                                                                else
                                                                                    class68 = new Class68_Sub10(class68_sub14.readDWord());
                                                                                aClass113_1413.method1677((byte) -59, class68, (long) i_25_);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        anInt1429
                                                                                = class68_sub14.readUnsignedWord(1355769544);
                                                                        anInt1430
                                                                                = class68_sub14.readUnsignedWord(1355769544);
                                                                        anInt1471
                                                                                = class68_sub14.readUnsignedWord(1355769544);
                                                                        anInt1463
                                                                                = class68_sub14.readUnsignedByte(-6677);
                                                                    }
                                                                } else
                                                                    aBoolean1433
                                                                            = false;
                                                            } else
                                                                anInt1462
                                                                        = (5
                                                                        * (class68_sub14
                                                                        .method955
                                                                                (3390)));
                                                        } else
                                                            anInt1428
                                                                    = (class68_sub14
                                                                    .method955
                                                                            (3390));
                                                    } else
                                                        aBoolean1420 = true;
                                                } else
                                                    anInt1461 = (class68_sub14
                                                            .readUnsignedWord
                                                                    (1355769544));
                                            } else
                                                aBoolean1438 = false;
                                        } else {
                                            int i_26_ = class68_sub14
                                                    .readUnsignedByte(-6677);
                                            anIntArray1435 = new int[i_26_];
                                            for (int i_27_ = 0;
                                                 ((i_26_ ^ 0xffffffff)
                                                         < (i_27_ ^ 0xffffffff));
                                                 i_27_++)
                                                anIntArray1435[i_27_]
                                                        = (class68_sub14.readUnsignedWord
                                                        (1355769544));
                                        }
                                    } else {
                                        aRSStringArray1432[-30 + i]
                                                = class68_sub14.readString(127);
                                        if (aRSStringArray1432[i - 30]
                                                .method1600
                                                        (false,
                                                                Class13_Sub2.aRSString_2647))
                                            aRSStringArray1432[i - 30] = null;
                                    }
                                } else {
                                    anInt1440
                                            = class68_sub14.readUnsignedWord(1355769544);
                                    anInt1410
                                            = class68_sub14.readUnsignedWord(1355769544);
                                    anInt1447
                                            = class68_sub14.readUnsignedWord(1355769544);
                                    anInt1415
                                            = class68_sub14.readUnsignedWord(1355769544);
                                }
                            } else
                                anInt1421
                                        = class68_sub14.readUnsignedWord(1355769544);
                        } else
                            anInt1467 = class68_sub14.readUnsignedWord(1355769544);
                    } else
                        anInt1409 = class68_sub14.readUnsignedWord(1355769544);
                } else
                    anInt1451 = class68_sub14.readUnsignedByte(-6677);
            } else
                aRSString_1466 = class68_sub14.readString(127);
        } else {
            int i_28_ = class68_sub14.readUnsignedByte(-6677);
            anIntArray1454 = new int[i_28_];
            for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff);
                 i_29_++)
                anIntArray1454[i_29_] = class68_sub14.readUnsignedWord(1355769544);
        }
        if (bool != false)
            method1447(29);
    }

    public boolean method1449(int i) {
        anInt1408++;
        if (anIntArray1431 == null)
            return true;
        int i_30_ = -1;
        if ((anInt1426 ^ 0xffffffff) != 0)
            i_30_ = Class18.method300(anInt1426, false);
        else if ((anInt1469 ^ 0xffffffff) != 0)
            i_30_ = Class103.anIntArray1767[anInt1469];
        if ((i_30_ ^ 0xffffffff) > -1
                || (anIntArray1431.length - 1 ^ 0xffffffff) >= (i_30_ ^ 0xffffffff)
                || anIntArray1431[i_30_] == -1) {
            int i_31_ = anIntArray1431[-1 + anIntArray1431.length];
            if ((i_31_ ^ 0xffffffff) == 0)
                return false;
            return true;
        }
        if (i != 8937)
            method1448(90, null, true);
        return true;
    }

    public Class1_Sub3 method1450(Class55 class117, byte i, int i_32_) {
        anInt1414++;
        if (anIntArray1431 != null) {
            Class80 class80_33_ = method1447(i + -106);
            if (class80_33_ == null)
                return null;
            return class80_33_.method1450(class117, (byte) 12, i_32_);
        }
        if (anIntArray1435 == null)
            return null;
        Class1_Sub3 class1_sub3
                = ((Class1_Sub3)
                Class96.aClass98_1694.method1570(14366, (long) anInt1458));
        if (class1_sub3 == null) {
            boolean bool = false;
            for (int i_34_ = 0; i_34_ < anIntArray1435.length; i_34_++) {
                if (!Class84.aClass21_1537.method344(anIntArray1435[i_34_], 0,
                        (byte) -98))
                    bool = true;
            }
            if (bool)
                return null;
            Class1_Sub4[] class1_sub4s
                    = new Class1_Sub4[anIntArray1435.length];
            for (int i_35_ = 0; i_35_ < anIntArray1435.length; i_35_++)
                class1_sub4s[i_35_]
                        = Class1_Sub4.method115(Class84.aClass21_1537,
                        anIntArray1435[i_35_], 0);
            Class1_Sub4 class1_sub4;
            if ((class1_sub4s.length ^ 0xffffffff) != -2)
                class1_sub4
                        = new Class1_Sub4(class1_sub4s, class1_sub4s.length);
            else
                class1_sub4 = class1_sub4s[0];
            if (aShortArray1443 != null) {
                for (int i_36_ = 0; i_36_ < aShortArray1443.length; i_36_++) {
                    if (aByteArray1422 == null
                            || (i_36_ ^ 0xffffffff) <= (aByteArray1422.length
                            ^ 0xffffffff))
                        class1_sub4.method129(aShortArray1443[i_36_],
                                aShortArray1412[i_36_]);
                    else
                        class1_sub4.method129(aShortArray1443[i_36_],
                                (Class68_Sub13_Sub25
                                        .aShortArray3854
                                        [(0xff
                                        & aByteArray1422[i_36_])]));
                }
            }
            if (aShortArray1442 != null) {
                for (int i_37_ = 0; ((aShortArray1442.length ^ 0xffffffff)
                        < (i_37_ ^ 0xffffffff)); i_37_++)
                    class1_sub4.method110(aShortArray1442[i_37_],
                            aShortArray1425[i_37_]);
            }
            class1_sub3 = class1_sub4.method127(64, 768, -50, -10, -50);
            Class96.aClass98_1694.method1568(class1_sub3, 97,
                    (long) anInt1458);
        }
        if (class117 != null)
            class1_sub3 = class117.method1722((byte) -73, class1_sub3, i_32_);
        if (i != 12)
            method1451(38, null, (byte) 38, null, -90);
        return class1_sub3;
    }

    public Class1_Sub3 method1451(int i, Class55 class117, byte i_38_,
                                  Class55 class117_39_, int i_40_) {
        try {
            anInt1450++;
            if (anIntArray1431 != null) {
                Class80 class80_41_ = method1447(-94);
                if (class80_41_ == null)
                    return null;
                return class80_41_.method1451(i, class117, (byte) -1,
                        class117_39_, i_40_);
            }
            Class1_Sub3 class1_sub3
                    = ((Class1_Sub3)
                    Class7.aClass98_124.method1570(14366, (long) anInt1458));
            if (class1_sub3 == null) {
                boolean bool = false;
                for (int i_42_ = 0; ((anIntArray1454.length ^ 0xffffffff)
                        < (i_42_ ^ 0xffffffff)); i_42_++) {
                    if (!Class84.aClass21_1537.method344(anIntArray1454[i_42_],
                            0, (byte) -126))
                        bool = true;
                }
                if (bool)
                    return null;
                Class1_Sub4[] class1_sub4s
                        = new Class1_Sub4[anIntArray1454.length];
                for (int i_43_ = 0; anIntArray1454.length > i_43_; i_43_++) {
                    class1_sub4s[i_43_]
                            = Class1_Sub4.method115(Class84.aClass21_1537,
                            anIntArray1454[i_43_], 0);
                    if (anIntArrayArray1457 != null
                            && anIntArrayArray1457[i_43_] != null
                            && class1_sub4s[i_43_] != null)
                        class1_sub4s[i_43_].method128
                                (anIntArrayArray1457[i_43_][0],
                                        anIntArrayArray1457[i_43_][1],
                                        anIntArrayArray1457[i_43_][2]);
                }
                Class1_Sub4 class1_sub4;
                if (class1_sub4s.length == 1)
                    class1_sub4 = class1_sub4s[0];
                else
                    class1_sub4
                            = new Class1_Sub4(class1_sub4s, class1_sub4s.length);
                if (aShortArray1443 != null) {
                    for (int i_44_ = 0; i_44_ < aShortArray1443.length;
                         i_44_++) {
                        if (aByteArray1422 != null
                                && i_44_ < aByteArray1422.length)
                            class1_sub4.method129(aShortArray1443[i_44_],
                                    (Class68_Sub13_Sub25
                                            .aShortArray3854
                                            [(aByteArray1422[i_44_]
                                            & 0xff)]));
                        else
                            class1_sub4.method129(aShortArray1443[i_44_],
                                    aShortArray1412[i_44_]);
                    }
                }
                if (aShortArray1442 != null) {
                    for (int i_45_ = 0; i_45_ < aShortArray1442.length;
                         i_45_++)
                        class1_sub4.method110(aShortArray1442[i_45_],
                                aShortArray1425[i_45_]);
                }
                class1_sub3
                        = class1_sub4.method127(anInt1428 + 64, 850 - -anInt1462,
                        -30, -50, -30);
                Class7.aClass98_124.method1568(class1_sub3, 107,
                        (long) anInt1458);
            }
            int i_46_ = 35 / ((-64 - i_38_) / 55);
            Class1_Sub3 class1_sub3_47_;
            if (class117_39_ == null || class117 == null) {
                if (class117_39_ != null)
                    class1_sub3_47_
                            = class117_39_.method1719(i_40_, true, class1_sub3);
                else if (class117 == null)
                    class1_sub3_47_ = class1_sub3.method82(true, true);
                else
                    class1_sub3_47_
                            = class117.method1719(i, true, class1_sub3);
            } else
                class1_sub3_47_
                        = class117_39_.method1727(class1_sub3, class117, i,
                        (byte) 104, i_40_);
            if ((anInt1461 ^ 0xffffffff) != -129 || anInt1416 != 128)
                class1_sub3_47_.method72(anInt1461, anInt1416, anInt1461);
            return class1_sub3_47_;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("nd.I(" + i + ','
                            + (class117 != null ? "{...}" : "null")
                            + ',' + i_38_ + ','
                            + (class117_39_ != null ? "{...}"
                            : "null")
                            + ',' + i_40_ + ')'));
        }
    }

    public void method1452(int i) {
        anInt1417++;
        if (i != 24381)
            anInt1469 = -100;
    }

    public Class80() {
        anInt1426 = -1;
        anInt1430 = -1;
        aBoolean1448 = true;
        anInt1410 = -1;
        anInt1421 = -1;
        anInt1440 = -1;
        aBoolean1438 = true;
        anInt1428 = 0;
        anInt1415 = -1;
        anInt1439 = -1;
        aShort1436 = (short) 0;
        aShort1419 = (short) 0;
        anInt1429 = -1;
        aBoolean1433 = true;
        anInt1461 = 128;
        anInt1447 = -1;
        anInt1467 = -1;
        aBoolean1420 = false;
        aShort1464 = (short) 0;
        anInt1462 = 0;
        aBoolean1424 = true;
        anInt1456 = 32;
        anInt1409 = -1;
        anInt1469 = -1;
        anInt1444 = -1;
        aByte1446 = (byte) 0;
        aRSString_1466 = aRSString_1441;
        aByte1453 = (byte) -16;
        anInt1471 = -1;
        aByte1470 = (byte) -96;
        aShort1423 = (short) 0;
        anInt1451 = 1;
        anInt1463 = 0;
    }
}
