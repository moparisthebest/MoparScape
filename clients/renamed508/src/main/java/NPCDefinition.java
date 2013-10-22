/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NPCDefinition
{
    static int[] anIntArray1408;
    static int anInt1409;
    static int anInt1410;
    int anInt1411;
    int anInt1412;
    static int anInt1413;
    private short[] aShortArray1414;
    private NodeCache aClass113_1415;
    static int anInt1416;
    int anInt1417;
    private int anInt1418 = 128;
    static int anInt1419;
    static Class68_Sub28_Sub4 aClass68_Sub28_Sub4_1420;
    short aShort1421;
    boolean aBoolean1422;
    int anInt1423;
    private byte[] aByteArray1424;
    short aShort1425;
    boolean aBoolean1426;
    private short[] aShortArray1427;
    private int anInt1428;
    static int anInt1429;
    private int anInt1430;
    int anInt1431;
    int anInt1432;
    int[] anIntArray1433;
    MutableString[] actions = new MutableString[5];
    boolean aBoolean1435;
    static int anInt1436 = -1;
    private int[] anIntArray1437;
    short aShort1438;
    int anInt1439 = -1;
    boolean aBoolean1440;
    int anInt1441;
    int anInt1442;
    private static MutableString aClass100_1443 = Class112.makeMutableString(43, "null");
    private short[] aShortArray1444;
    private short[] aShortArray1445;
    int anInt1446;
    static int anInt1447;
    byte aByte1448;
    int anInt1449;
    boolean aBoolean1450;
    static int anInt1451;
    static int anInt1452;
    int anInt1453;
    static int anInt1454;
    byte aByte1455;
    private int[] anIntArray1456;
    static MutableString aClass100_1457 = Class112.makeMutableString(43, "Hierhin gehen");
    int anInt1458;
    private int[][] anIntArrayArray1459;
    int type;
    static int anInt1461;
    static int anInt1462;
    private int anInt1463;
    private int anInt1464;
    int anInt1465;
    short aShort1466;
    static int anInt1467 = 0;
    MutableString name;
    int anInt1469;
    static int anInt1470;
    private int anInt1471;
    byte aByte1472;
    int anInt1473;
    static int anInt1474;

    final MutableString method1446(int i, MutableString class100, int i_0_)
    {
        try
        {
            anInt1413++;
            if (aClass113_1415 == null)
                return class100;
            if (i != 0)
                return null;
            Class68_Sub5 class68_sub5 = (Class68_Sub5) aClass113_1415.method1684((long) i_0_, -80);
            if (class68_sub5 == null)
                return class100;
            return ((Class68_Sub5) class68_sub5).aClass100_2832;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("nd.K(" + i + ',' + (class100 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
        }
    }

    static final void method1447(int i, MutableString class100)
    {
        do
        {
            try
            {
                anInt1409++;
                for (Class68_Sub20_Sub16 class68_sub20_sub16 = ((Class68_Sub20_Sub16) Class35.aClass16_602.method293((byte) 76)); class68_sub20_sub16 != null; class68_sub20_sub16 = ((Class68_Sub20_Sub16) Class35.aClass16_602.method290((byte) 62)))
                {
                    if (((Class68_Sub20_Sub16) class68_sub20_sub16).aClass100_4414.equalTo(class100))
                    {
                        Class30.aClass68_Sub20_Sub16_540 = class68_sub20_sub16;
                        return;
                    }
                }
                if (i == 0)
                    break;
                anInt1447 = 94;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("nd.J(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final int method1448(int i, int i_1_, int i_2_)
    {
        anInt1462++;
        if (aClass113_1415 == null)
            return i_1_;
        Class68_Sub10 class68_sub10 = (Class68_Sub10) aClass113_1415.method1684((long) i, -54);
        if (class68_sub10 == null)
            return i_1_;
        return ((Class68_Sub10) class68_sub10).anInt2904;
    }

    final void method1449(Stream class68_sub14, byte i)
    {
        do
        {
            try
            {
                for (;;)
                {
                    int i_4_ = class68_sub14.readUByte();
                    if (i_4_ == 0)
                        break;
                    method1454(i_4_, class68_sub14, false);
                }
                anInt1474++;
                if (i == -53)
                    break;
                method1450();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("nd.D(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    final boolean method1450()
    {
        anInt1454++;
        if (((NPCDefinition) this).anIntArray1433 == null)
        {
            if (((NPCDefinition) this).anInt1431 == -1 && ((NPCDefinition) this).anInt1432 == -1 && ((NPCDefinition) this).anInt1473 == -1)
                return false;
            return true;
        }
        for (int i_5_ = 0; ((NPCDefinition) this).anIntArray1433.length > i_5_; i_5_++)
        {
            if (((NPCDefinition) this).anIntArray1433[i_5_] != -1)
            {
                NPCDefinition class80_6_ = Class68_Sub13_Sub11.getNPCDefinition((((NPCDefinition) this).anIntArray1433[i_5_]));
                if (((NPCDefinition) class80_6_).anInt1431 != -1 || ((NPCDefinition) class80_6_).anInt1432 != -1 || ((NPCDefinition) class80_6_).anInt1473 != -1)
                    return true;
            }
        }
        return false;
    }

    static final void method1451(int i)
    {
        Class121.aClass98_2102.method1572((byte) 94);
        anInt1451++;
        if (i != -10705)
            method1451(5);
    }

    public static void method1452(int i)
    {
        if (i == 1)
        {
            aClass100_1443 = null;
            aClass68_Sub28_Sub4_1420 = null;
            anIntArray1408 = null;
            aClass100_1457 = null;
        }
    }

    final NPCDefinition method1453(int i)
    {
        anInt1470++;
        if (i != -94)
            method1452(80);
        int i_7_ = -1;
        if (anInt1428 != -1)
            i_7_ = Class18.method300(anInt1428, false);
        else if (anInt1471 != -1)
            i_7_ = Class103.settingArray[anInt1471];
        if (i_7_ < 0 || ((NPCDefinition) this).anIntArray1433.length - 1 <= i_7_ || ((NPCDefinition) this).anIntArray1433[i_7_] == -1)
        {
            int i_8_ = (((NPCDefinition) this).anIntArray1433[((NPCDefinition) this).anIntArray1433.length - 1]);
            if (i_8_ != -1)
                return Class68_Sub13_Sub11.getNPCDefinition(i_8_);
            return null;
        }
        return Class68_Sub13_Sub11.getNPCDefinition(((NPCDefinition) this).anIntArray1433[i_7_]);
    }

    private final void method1454(int i, Stream class68_sub14, boolean bool)
    {
        do
        {
            try
            {
                anInt1461++;
                if (i != 1)
                {
                    if (i != 2)
                    {
                        if (i != 12)
                        {
                            if (i != 13)
                            {
                                if (i == 14)
                                    ((NPCDefinition) this).anInt1442 = class68_sub14.readUShort();
                                else if (i != 15)
                                {
                                    if (i != 16)
                                    {
                                        if (i != 17)
                                        {
                                            if (i < 30 || i >= 35)
                                            {
                                                if (i == 40)
                                                {
                                                    int i_9_ = (class68_sub14.readUByte());
                                                    aShortArray1445 = new short[i_9_];
                                                    aShortArray1414 = new short[i_9_];
                                                    for (int i_10_ = 0; i_9_ > i_10_; i_10_++)
                                                    {
                                                        aShortArray1445[i_10_] = (short) (class68_sub14.readUShort());
                                                        aShortArray1414[i_10_] = (short) (class68_sub14.readUShort());
                                                    }
                                                } else if (i == 41)
                                                {
                                                    int i_11_ = (class68_sub14.readUByte());
                                                    aShortArray1444 = new short[i_11_];
                                                    aShortArray1427 = new short[i_11_];
                                                    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
                                                    {
                                                        aShortArray1444[i_12_] = (short) (class68_sub14.readUShort());
                                                        aShortArray1427[i_12_] = (short) (class68_sub14.readUShort());
                                                    }
                                                } else if (i == 42)
                                                {
                                                    int i_13_ = (class68_sub14.readUByte());
                                                    aByteArray1424 = new byte[i_13_];
                                                    for (int i_14_ = 0; i_13_ > i_14_; i_14_++)
                                                        aByteArray1424[i_14_] = (class68_sub14.readByte());
                                                } else if (i != 60)
                                                {
                                                    if (i != 93)
                                                    {
                                                        if (i == 95)
                                                            ((NPCDefinition) this).anInt1446 = (class68_sub14.readUShort());
                                                        else if (i != 97)
                                                        {
                                                            if (i == 98)
                                                                anInt1418 = (class68_sub14.readUShort());
                                                            else if (i != 99)
                                                            {
                                                                if (i != 100)
                                                                {
                                                                    if (i != 101)
                                                                    {
                                                                        if (i == 102)
                                                                            ((NPCDefinition) this).anInt1441 = class68_sub14.readUShort();
                                                                        else if (i == 103)
                                                                            ((NPCDefinition) this).anInt1458 = class68_sub14.readUShort();
                                                                        else if (i == 106 || i == 118)
                                                                        {
                                                                            anInt1428 = class68_sub14.readUShort();
                                                                            if (anInt1428 == 65535)
                                                                                anInt1428 = -1;
                                                                            anInt1471 = class68_sub14.readUShort();
                                                                            if (anInt1471 == 65535)
                                                                                anInt1471 = -1;
                                                                            int i_15_ = -1;
                                                                            if (i == 118)
                                                                            {
                                                                                i_15_ = class68_sub14.readUShort();
                                                                                if (i_15_ == 65535)
                                                                                    i_15_ = -1;
                                                                            }
                                                                            int i_16_ = class68_sub14.readUByte();
                                                                            ((NPCDefinition) this).anIntArray1433 = new int[i_16_ + 2];
                                                                            for (int i_17_ = 0; i_17_ <= i_16_; i_17_++)
                                                                            {
                                                                                ((NPCDefinition) this).anIntArray1433[i_17_] = class68_sub14.readUShort();
                                                                                if (((NPCDefinition) this).anIntArray1433[i_17_] == 65535)
                                                                                    ((NPCDefinition) this).anIntArray1433[i_17_] = -1;
                                                                            }
                                                                            ((NPCDefinition) this).anIntArray1433[i_16_ + 1] = i_15_;
                                                                        } else if (i != 107)
                                                                        {
                                                                            if (i == 109)
                                                                                ((NPCDefinition) this).aBoolean1426 = false;
                                                                            else if (i == 111)
                                                                                ((NPCDefinition) this).aBoolean1450 = false;
                                                                            else if (i == 113)
                                                                            {
                                                                                ((NPCDefinition) this).aShort1466 = (short) class68_sub14.readUShort();
                                                                                ((NPCDefinition) this).aShort1438 = (short) class68_sub14.readUShort();
                                                                            } else if (i == 114)
                                                                            {
                                                                                ((NPCDefinition) this).aByte1472 = class68_sub14.readByte();
                                                                                ((NPCDefinition) this).aByte1455 = class68_sub14.readByte();
                                                                            } else if (i == 115)
                                                                            {
                                                                                ((NPCDefinition) this).aShort1421 = (short) (4 * class68_sub14.readUByte());
                                                                                ((NPCDefinition) this).aShort1425 = (short) (class68_sub14.readUByte() * 4);
                                                                            } else if (i == 119)
                                                                                ((NPCDefinition) this).aByte1448 = class68_sub14.readByte();
                                                                            else if (i != 120)
                                                                            {
                                                                                if (i == 121)
                                                                                {
                                                                                    anIntArrayArray1459 = new int[anIntArray1456.length][];
                                                                                    int i_18_ = class68_sub14.readUByte();
                                                                                    for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
                                                                                    {
                                                                                        int i_20_ = class68_sub14.readUByte();
                                                                                        int[] is = anIntArrayArray1459[i_20_] = new int[3];
                                                                                        is[0] = class68_sub14.readByte();
                                                                                        is[1] = class68_sub14.readByte();
                                                                                        is[2] = class68_sub14.readByte();
                                                                                    }
                                                                                } else if (i == 122)
                                                                                    ((NPCDefinition) this).anInt1439 = class68_sub14.readUShort();
                                                                                else if (i == 249)
                                                                                {
                                                                                    int i_21_ = class68_sub14.readUByte();
                                                                                    if (aClass113_1415 == null)
                                                                                    {
                                                                                        int i_22_ = Class90.method1523(i_21_, -21189);
                                                                                        aClass113_1415 = new NodeCache(i_22_);
                                                                                    }
                                                                                    for (int i_23_ = 0; i_21_ > i_23_; i_23_++)
                                                                                    {
                                                                                        boolean bool_24_ = class68_sub14.readUByte() == 1;
                                                                                        int i_25_ = class68_sub14.readTInteger();
                                                                                        Node class68;
                                                                                        if (bool_24_)
                                                                                            class68 = new Class68_Sub5(class68_sub14.readString());
                                                                                        else
                                                                                            class68 = new Class68_Sub10(class68_sub14.readInteger());
                                                                                        aClass113_1415.method1683((byte) -59, class68, (long) i_25_);
                                                                                    }
                                                                                }
                                                                            } else
                                                                            {
                                                                                ((NPCDefinition) this).anInt1431 = class68_sub14.readUShort();
                                                                                ((NPCDefinition) this).anInt1432 = class68_sub14.readUShort();
                                                                                ((NPCDefinition) this).anInt1473 = class68_sub14.readUShort();
                                                                                ((NPCDefinition) this).anInt1465 = class68_sub14.readUByte();
                                                                            }
                                                                        } else
                                                                            ((NPCDefinition) this).aBoolean1435 = false;
                                                                    } else
                                                                        anInt1464 = 5 * class68_sub14.readByte();
                                                                } else
                                                                    anInt1430 = (class68_sub14.readByte());
                                                            } else
                                                                ((NPCDefinition) this).aBoolean1422 = true;
                                                        } else
                                                            anInt1463 = (class68_sub14.readUShort());
                                                    } else
                                                        ((NPCDefinition) this).aBoolean1440 = false;
                                                } else
                                                {
                                                    int i_26_ = (class68_sub14.readUByte());
                                                    anIntArray1437 = new int[i_26_];
                                                    for (int i_27_ = 0; i_26_ > i_27_; i_27_++)
                                                        anIntArray1437[i_27_] = (class68_sub14.readUShort());
                                                }
                                            } else
                                            {
                                                ((NPCDefinition) this).actions[i - 30] = class68_sub14.readString();
                                                if (((NPCDefinition) this).actions[i - 30].method1606(false, (Class13_Sub2.aClass100_2649)))
                                                    ((NPCDefinition) this).actions[i - 30] = null;
                                            }
                                        } else
                                        {
                                            ((NPCDefinition) this).anInt1442 = class68_sub14.readUShort();
                                            ((NPCDefinition) this).anInt1412 = class68_sub14.readUShort();
                                            ((NPCDefinition) this).anInt1449 = class68_sub14.readUShort();
                                            ((NPCDefinition) this).anInt1417 = class68_sub14.readUShort();
                                        }
                                    } else
                                        ((NPCDefinition) this).anInt1423 = class68_sub14.readUShort();
                                } else
                                    ((NPCDefinition) this).anInt1469 = class68_sub14.readUShort();
                            } else
                                ((NPCDefinition) this).anInt1411 = class68_sub14.readUShort();
                        } else
                            ((NPCDefinition) this).anInt1453 = class68_sub14.readUByte();
                    } else
                        ((NPCDefinition) this).name = class68_sub14.readString();
                } else
                {
                    int i_28_ = class68_sub14.readUByte();
                    anIntArray1456 = new int[i_28_];
                    for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
                        anIntArray1456[i_29_] = class68_sub14.readUShort();
                }
                if (bool == false)
                    break;
                method1453(29);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("nd.M(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ',' + bool + ')'));
            }
            break;
        } while (false);
    }

    final boolean method1455(int i)
    {
        anInt1410++;
        if (((NPCDefinition) this).anIntArray1433 == null)
            return true;
        int i_30_ = -1;
        do
        {
            if (anInt1428 != -1)
            {
                i_30_ = Class18.method300(anInt1428, false);
                if (client.anInt2387 == 0)
                    break;
            }
            if (anInt1471 != -1)
                i_30_ = Class103.settingArray[anInt1471];
        } while (false);
        if (i_30_ < 0 || ((NPCDefinition) this).anIntArray1433.length - 1 <= i_30_ || ((NPCDefinition) this).anIntArray1433[i_30_] == -1)
        {
            int i_31_ = (((NPCDefinition) this).anIntArray1433[((NPCDefinition) this).anIntArray1433.length - 1]);
            if (i_31_ == -1)
                return false;
            return true;
        }
        if (i != 8937)
            method1454(90, null, true);
        return true;
    }

    final Model method1456(Animation class117, byte i, int i_32_)
    {
        try
        {
            anInt1416++;
            if (((NPCDefinition) this).anIntArray1433 != null)
            {
                NPCDefinition class80_33_ = method1453(i - 106);
                if (class80_33_ == null)
                    return null;
                return class80_33_.method1456(class117, (byte) 12, i_32_);
            }
            if (anIntArray1437 == null)
                return null;
            Model class1_sub3 = ((Model) Class96.aClass98_1696.getNodeForID((long) ((NPCDefinition) this).type));
            if (class1_sub3 == null)
            {
                boolean bool = false;
                for (int i_34_ = 0; i_34_ < anIntArray1437.length; i_34_++)
                {
                    if (!Class84.aClass21_1539.method344(anIntArray1437[i_34_], 0, (byte) -98))
                        bool = true;
                }
                if (bool)
                    return null;
                Class1_Sub4[] class1_sub4s = new Class1_Sub4[anIntArray1437.length];
                for (int i_35_ = 0; i_35_ < anIntArray1437.length; i_35_++)
                    class1_sub4s[i_35_] = Class1_Sub4.method115(Class84.aClass21_1539, anIntArray1437[i_35_], 0);
                Class1_Sub4 class1_sub4;
                if (class1_sub4s.length != 1)
                    class1_sub4 = new Class1_Sub4(class1_sub4s, class1_sub4s.length);
                else
                    class1_sub4 = class1_sub4s[0];
                if (aShortArray1445 != null)
                {
                    for (int i_36_ = 0; i_36_ < aShortArray1445.length; i_36_++)
                    {
                        if (aByteArray1424 == null || i_36_ >= aByteArray1424.length)
                            class1_sub4.method129(aShortArray1445[i_36_], aShortArray1414[i_36_]);
                        else
                            class1_sub4.method129(aShortArray1445[i_36_], (Class68_Sub13_Sub25.aShortArray3856[0xff & (aByteArray1424[i_36_])]));
                    }
                }
                if (aShortArray1444 != null)
                {
                    for (int i_37_ = 0; aShortArray1444.length > i_37_; i_37_++)
                        class1_sub4.method110(aShortArray1444[i_37_], aShortArray1427[i_37_]);
                }
                class1_sub3 = class1_sub4.method127(64, 768, -50, -10, -50);
                Class96.aClass98_1696.addObject(class1_sub3, (long) (((NPCDefinition) this).type));
            }
            if (class117 != null)
                class1_sub3 = class117.method1728((byte) -73, class1_sub3, i_32_);
            if (i != 12)
                method1457(38, null, (byte) 38, null, -90);
            return class1_sub3;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("nd.L(" + (class117 != null ? "{...}" : "null") + ',' + i + ',' + i_32_ + ')'));
        }
    }

    final Model method1457(int i, Animation class117, byte i_38_, Animation class117_39_, int i_40_)
    {
        try
        {
            anInt1452++;
            if (((NPCDefinition) this).anIntArray1433 != null)
            {
                NPCDefinition class80_41_ = method1453(-94);
                if (class80_41_ == null)
                    return null;
                return class80_41_.method1457(i, class117, (byte) -1, class117_39_, i_40_);
            }
            Model class1_sub3 = ((Model) Class7.aClass98_124.getNodeForID((long) ((NPCDefinition) this).type));
            if (class1_sub3 == null)
            {
                boolean bool = false;
                for (int i_42_ = 0; anIntArray1456.length > i_42_; i_42_++)
                {
                    if (!Class84.aClass21_1539.method344(anIntArray1456[i_42_], 0, (byte) -126))
                        bool = true;
                }
                if (bool)
                    return null;
                Class1_Sub4[] class1_sub4s = new Class1_Sub4[anIntArray1456.length];
                for (int i_43_ = 0; anIntArray1456.length > i_43_; i_43_++)
                {
                    class1_sub4s[i_43_] = Class1_Sub4.method115(Class84.aClass21_1539, anIntArray1456[i_43_], 0);
                    if (anIntArrayArray1459 != null && anIntArrayArray1459[i_43_] != null && class1_sub4s[i_43_] != null)
                        class1_sub4s[i_43_].method128(anIntArrayArray1459[i_43_][0], anIntArrayArray1459[i_43_][1], anIntArrayArray1459[i_43_][2]);
                }
                Class1_Sub4 class1_sub4;
                if (class1_sub4s.length == 1)
                    class1_sub4 = class1_sub4s[0];
                else
                    class1_sub4 = new Class1_Sub4(class1_sub4s, class1_sub4s.length);
                if (aShortArray1445 != null)
                {
                    for (int i_44_ = 0; i_44_ < aShortArray1445.length; i_44_++)
                    {
                        if (aByteArray1424 != null && i_44_ < aByteArray1424.length)
                            class1_sub4.method129(aShortArray1445[i_44_], (Class68_Sub13_Sub25.aShortArray3856[(aByteArray1424[i_44_] & 0xff)]));
                        else
                            class1_sub4.method129(aShortArray1445[i_44_], aShortArray1414[i_44_]);
                    }
                }
                if (aShortArray1444 != null)
                {
                    for (int i_45_ = 0; i_45_ < aShortArray1444.length; i_45_++)
                        class1_sub4.method110(aShortArray1444[i_45_], aShortArray1427[i_45_]);
                }
                class1_sub3 = class1_sub4.method127(anInt1430 + 64, anInt1464 + 850, -30, -50, -30);
                Class7.aClass98_124.addObject(class1_sub3, (long) (((NPCDefinition) this).type));
            }
            int i_46_ = 35 / ((-64 - i_38_) / 55);
            Model class1_sub3_47_;
            if (class117_39_ == null || class117 == null)
            {
                if (class117_39_ != null)
                    class1_sub3_47_ = class117_39_.method1725(i_40_, true, class1_sub3);
                else if (class117 == null)
                    class1_sub3_47_ = class1_sub3.method82(true, true);
                else
                    class1_sub3_47_ = class117.method1725(i, true, class1_sub3);
            } else
                class1_sub3_47_ = class117_39_.method1733(class1_sub3, class117, i, (byte) 104, i_40_);
            if (anInt1463 != 128 || anInt1418 != 128)
                class1_sub3_47_.method72(anInt1463, anInt1418, anInt1463);
            return class1_sub3_47_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("nd.I(" + i + ',' + (class117 != null ? "{...}" : "null") + ',' + i_38_ + ',' + (class117_39_ != null ? "{...}" : "null") + ',' + i_40_ + ')'));
        }
    }

    final void method1458(int i)
    {
        anInt1419++;
        if (i != 24381)
            anInt1471 = -100;
    }

    public NPCDefinition()
    {
        anInt1428 = -1;
        ((NPCDefinition) this).anInt1432 = -1;
        ((NPCDefinition) this).aBoolean1450 = true;
        ((NPCDefinition) this).anInt1412 = -1;
        ((NPCDefinition) this).anInt1423 = -1;
        ((NPCDefinition) this).anInt1442 = -1;
        ((NPCDefinition) this).aBoolean1440 = true;
        anInt1430 = 0;
        ((NPCDefinition) this).anInt1417 = -1;
        ((NPCDefinition) this).anInt1441 = -1;
        ((NPCDefinition) this).aShort1438 = (short) 0;
        ((NPCDefinition) this).aShort1421 = (short) 0;
        ((NPCDefinition) this).anInt1431 = -1;
        ((NPCDefinition) this).aBoolean1435 = true;
        anInt1463 = 128;
        ((NPCDefinition) this).anInt1449 = -1;
        ((NPCDefinition) this).anInt1469 = -1;
        ((NPCDefinition) this).aBoolean1422 = false;
        ((NPCDefinition) this).aShort1466 = (short) 0;
        anInt1464 = 0;
        ((NPCDefinition) this).aBoolean1426 = true;
        ((NPCDefinition) this).anInt1458 = 32;
        ((NPCDefinition) this).anInt1411 = -1;
        anInt1471 = -1;
        ((NPCDefinition) this).anInt1446 = -1;
        ((NPCDefinition) this).aByte1448 = (byte) 0;
        ((NPCDefinition) this).name = aClass100_1443;
        ((NPCDefinition) this).aByte1455 = (byte) -16;
        ((NPCDefinition) this).anInt1473 = -1;
        ((NPCDefinition) this).aByte1472 = (byte) -96;
        ((NPCDefinition) this).aShort1425 = (short) 0;
        ((NPCDefinition) this).anInt1453 = 1;
        ((NPCDefinition) this).anInt1465 = 0;
    }
}
