/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class90 implements Interface4
{
    private boolean[] aBooleanArray2329;
    static int anInt2330;
    static int anInt2331;
    static int anInt2332;
    static int anInt2333;
    static int anInt2334;
    static int anInt2335;
    private Class21 aClass21_2336;
    static int[] anIntArray2337;
    static int anInt2338;
    static int anInt2339;
    static int anInt2340;
    private Class21 aClass21_2341;
    private Login aClass82_2342;
    static MutableString aClass100_2343 = Class112.makeMutableString(43, "headicons_pk");
    private byte[] aByteArray2344;
    static int anInt2345;
    static int anInt2346;
    static int[] anIntArray2347;
    private boolean aBoolean2348;
    static int anInt2349;
    private boolean[] aBooleanArray2350;
    private byte[] aByteArray2351;
    static int anInt2352;
    static MutableString aClass100_2353;
    static int anInt2354;
    private int anInt2355 = 50;
    static MutableString aClass100_2356;
    static MutableString aClass100_2357;
    static int anInt2358;
    private boolean[] aBooleanArray2359;
    private short[] aShortArray2360;
    static int anInt2361;
    private boolean[] aBooleanArray2362;
    private byte[] aByteArray2363;
    static int anInt2364;
    private boolean[] aBooleanArray2365;
    static int anInt2366;
    private byte[] aByteArray2367;

    public final boolean method9(byte i, int i_0_)
    {
        anInt2345++;
        if (aBoolean2348 || aBooleanArray2329[i_0_])
            return true;
        if (i >= -110)
            method1519((byte) -57);
        return false;
    }

    public final int[] method11(int i, int i_1_)
    {
        Class68_Sub20_Sub6 class68_sub20_sub6 = method1520((byte) 84, i_1_);
        anInt2333++;
        if (i <= 70)
            return null;
        if (class68_sub20_sub6 == null)
            return null;
        return class68_sub20_sub6.method1065(this, -109, aClass21_2336, (aBoolean2348 || aBooleanArray2329[i_1_]));
    }

    public final boolean method10(int i, int i_2_)
    {
        if (i_2_ != 2)
            return true;
        anInt2358++;
        return aBooleanArray2365[i];
    }

    static final Class68_Sub20_Sub1 method1515(Class21 class21, int i, byte i_3_, Class21 class21_4_, int i_5_)
    {
        try
        {
            anInt2339++;
            if (!Class68_Sub13_Sub36.method880(-29381, i_5_, class21, i))
                return null;
            if (i_3_ < 52)
                method1525(45);
            return Class85.method1487(class21_4_.method338(i, 0, i_5_), false);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("pa.O(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + (class21_4_ != null ? "{...}" : "null") + ',' + i_5_ + ')'));
        }
    }

    static final Class91 method1516(MutableString class100, int i, Class21 class21)
    {
        try
        {
            anInt2330++;
            int i_6_ = class21.getIndex(class100, (byte) -94);
            if (i != 12666)
                aClass100_2356 = null;
            if (i_6_ == -1)
                return new Class91(0);
            int[] is = class21.getData(i_6_);
            Class91 class91 = new Class91(is.length);
            for (int i_7_ = 0; ((Class91) class91).anInt1639 > i_7_; i_7_++)
            {
                Stream class68_sub14 = new Stream(class21.method338(is[i_7_], 0, i_6_));
                ((Class91) class91).aClass100Array1637[i_7_] = class68_sub14.readString();
                ((Class91) class91).aByteArray1640[i_7_] = class68_sub14.readByte();
                ((Class91) class91).aShortArray1633[i_7_] = (short) class68_sub14.readUShort();
                ((Class91) class91).aShortArray1636[i_7_] = (short) class68_sub14.readUShort();
                ((Class91) class91).anIntArray1642[i_7_] = class68_sub14.readInteger();
            }
            return class91;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("pa.H(" + (class100 != null ? "{...}" : "null") + ',' + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1517(boolean bool)
    {
        if (NodeList.anInt273 > 0)
            NodeList.anInt273--;
        anInt2364++;
        if (Class104.anInt1786 > 1)
        {
            Class68_Sub20_Sub5.anInt4222 = Class68_Sub22.anInt3150;
            Class104.anInt1786--;
        }
        if (Class75_Sub3_Sub1.aBoolean4599)
        {
            Class75_Sub3_Sub1.aBoolean4599 = false;
            Class72_Sub1.method1367((byte) -21);
        } else
        {
            for (int i = 0; i < 100; i++)
            {
                if (!Class14.method265(-110))
                    break;
            }
            if (GameException.anInt2233 == 30)
            {
                Class50.method531(false, 141, Class21.connectionVector);
                synchronized (((Class84) Class14.aClass84_241).anObject1545)
                {
                    if (!Class68_Sub13_Sub33.aBoolean4002)
                        ((Class84) Class14.aClass84_241).anInt1547 = 0;
                    else if (Class29.anInt537 != 0 || (((Class84) Class14.aClass84_241).anInt1547 >= 40))
                    {
                        Class83.anInt1529++;
                        Class21.connectionVector.startPacket(117);
                        Class21.connectionVector.writeByte(0);
                        int i = (((Stream) Class21.connectionVector).position);
                        int i_8_ = 0;
                        for (int i_9_ = 0; i_9_ < ((Class84) Class14.aClass84_241).anInt1547; i_9_++)
                        {
                            if (((Stream) Class21.connectionVector).position - i >= 240)
                                break;
                            int i_10_ = (((Class84) Class14.aClass84_241).anIntArray1548[i_9_]);
                            int i_11_ = (((Class84) Class14.aClass84_241).anIntArray1546[i_9_]);
                            if (i_10_ >= 0)
                            {
                                if (i_10_ > 65534)
                                    i_10_ = 65534;
                            } else
                                i_10_ = 0;
                            i_8_++;
                            if (i_11_ < 0)
                                i_11_ = 0;
                            else if (i_11_ > 65534)
                                i_11_ = 65534;
                            boolean bool_12_ = false;
                            if ((((Class84) Class14.aClass84_241).anIntArray1548[i_9_]) == -1 && (((Class84) Class14.aClass84_241).anIntArray1546[i_9_]) == -1)
                            {
                                bool_12_ = true;
                                i_10_ = -1;
                                i_11_ = -1;
                            }
                            if (Class68_Sub13_Sub4.anInt3490 == i_11_ && i_10_ == Class68_Sub20_Sub17.anInt4441)
                            {
                                if (Class7.anInt122 < 2047)
                                    Class7.anInt122++;
                            } else
                            {
                                int i_13_ = i_10_ - Class68_Sub20_Sub17.anInt4441;
                                Class68_Sub20_Sub17.anInt4441 = i_10_;
                                int i_14_ = i_11_ - Class68_Sub13_Sub4.anInt3490;
                                Class68_Sub13_Sub4.anInt3490 = i_11_;
                                if (Class7.anInt122 < 8 && i_14_ >= -32 && i_14_ <= 31 && i_13_ >= -32 && i_13_ <= 31)
                                {
                                    i_14_ += 32;
                                    i_13_ += 32;
                                    Class21.connectionVector.writeShort(((i_14_ << 6) + (Class7.anInt122 << 12) + i_13_));
                                    Class7.anInt122 = 0;
                                } else if (Class7.anInt122 < 32 && i_14_ >= -128 && i_14_ <= 127 && i_13_ >= -128 && i_13_ <= 127)
                                {
                                    i_13_ += 128;
                                    Class21.connectionVector.writeByte(Class7.anInt122 + 128);
                                    i_14_ += 128;
                                    Class21.connectionVector.writeShort((i_14_ << 8) + i_13_);
                                    Class7.anInt122 = 0;
                                } else if (Class7.anInt122 < 32)
                                {
                                    Class21.connectionVector.writeByte(Class7.anInt122 + 192);
                                    if (!bool_12_)
                                        Class21.connectionVector.writeDWord(i_10_ << 16 | i_11_);
                                    else
                                        Class21.connectionVector.writeDWord(-2147483648);
                                    Class7.anInt122 = 0;
                                } else
                                {
                                    Class21.connectionVector.writeShort(Class7.anInt122 + 57344);
                                    if (bool_12_)
                                        Class21.connectionVector.writeDWord(-2147483648);
                                    else
                                        Class21.connectionVector.writeDWord(i_10_ << 16 | i_11_);
                                    Class7.anInt122 = 0;
                                }
                            }
                        }
                        Class21.connectionVector.writeSizeByte((((Stream) Class21.connectionVector).position) - i);
                        if (((Class84) Class14.aClass84_241).anInt1547 <= i_8_)
                            ((Class84) Class14.aClass84_241).anInt1547 = 0;
                        else
                        {
                            ((Class84) Class14.aClass84_241).anInt1547 -= i_8_;
                            for (int i_15_ = 0; (((Class84) Class14.aClass84_241).anInt1547 > i_15_); i_15_++)
                            {
                                ((Class84) Class14.aClass84_241).anIntArray1546[i_15_] = (((Class84) Class14.aClass84_241).anIntArray1546[i_15_ + i_8_]);
                                ((Class84) Class14.aClass84_241).anIntArray1548[i_15_] = (((Class84) Class14.aClass84_241).anIntArray1548[i_8_ + i_15_]);
                            }
                        }
                    }
                }
                if (Class29.anInt537 != 0)
                {
                    long l = ((-Class68_Sub20_Sub10.aLong4308 + Class68_Sub20_Sub7.aLong4264) / 50L);
                    Class50_Sub2.anInt2734++;
                    Class68_Sub20_Sub10.aLong4308 = Class68_Sub20_Sub7.aLong4264;
                    if (l > 32767L)
                        l = 32767L;
                    int i = Class125.anInt2175;
                    int i_16_ = Class68_Sub13_Sub37.anInt4079;
                    int i_17_ = (int) l;
                    if (i >= 0)
                    {
                        if (i > 65535)
                            i = 65535;
                    } else
                        i = 0;
                    int i_18_ = 0;
                    if (i_16_ >= 0)
                    {
                        if (i_16_ > 65535)
                            i_16_ = 65535;
                    } else
                        i_16_ = 0;
                    if (Class29.anInt537 == 2)
                        i_18_ = 1;
                    Class21.connectionVector.startPacket(59);
                    Class21.connectionVector.writeShort(i_17_ | i_18_ << 15);
                    Class21.connectionVector.method913((byte) -116, i_16_ | i << 16);
                }
                if (Class108.anInt1828 > 0)
                    Class108.anInt1828--;
                if (NodeSubList.aBooleanArray2230[96] || NodeSubList.aBooleanArray2230[97] || NodeSubList.aBooleanArray2230[98] || NodeSubList.aBooleanArray2230[99])
                    Class102.aBoolean1750 = true;
                if (Class102.aBoolean1750 && Class108.anInt1828 <= 0)
                {
                    Class68_Sub13_Sub8.anInt3559++;
                    Class108.anInt1828 = 20;
                    Class102.aBoolean1750 = false;
                    Class21.connectionVector.startPacket(99);
                    Class21.connectionVector.writeLEShortA(NodeList.anInt275);
                    Class21.connectionVector.writeShortA(Class8.minimapInt2);
                }
                if (!Class15.aBoolean250 == false && !Class17.aBoolean284 == true)
                {
                    GameApplet.anInt22++;
                    Class17.aBoolean284 = true;
                    Class21.connectionVector.startPacket(248);
                    Class21.connectionVector.writeByte(1);
                }
                if (!Class15.aBoolean250 != false && Class17.aBoolean284 != false)
                {
                    GameApplet.anInt22++;
                    Class17.aBoolean284 = false;
                    Class21.connectionVector.startPacket(248);
                    Class21.connectionVector.writeByte(0);
                }
                if (!Class108.aBoolean1832)
                {
                    Class68_Sub22.anInt3145++;
                    Class21.connectionVector.startPacket(165);
                    Class21.connectionVector.method954(-19237, Class34.method415((byte) 112));
                    Class108.aBoolean1832 = true;
                }
                Class114.method1698(0);
                if (GameException.anInt2233 == 30)
                {
                    Class68_Sub13_Sub32.method864(0);
                    ScriptParameters.method1321((byte) -110);
                    Class68_Sub20_Sub13.anInt4370++;
                    if (Class68_Sub20_Sub13.anInt4370 > 750)
                        Class72_Sub1.method1367((byte) -21);
                    else
                    {
                        Class68_Sub7.method669(51);
                        Class68_Sub18.method995(16986);
                        Class71.method1341((byte) 122);
                        if (Node.aClass45_1231 != null)
                            Class68_Sub13_Sub15.method770((byte) -84);
                        for (int i = Class68_Sub13_Sub2.method710(bool, -115); i != -1; i = Class68_Sub13_Sub2.method710(false, -122))
                        {
                            Class68_Sub13_Sub35.method878((byte) 67, i);
                            Class68_Sub13_Sub34.anIntArray4014[Class120.method1746(Class68_Sub4.anInt2817++, 31)] = i;
                        }
                        for (Class68_Sub20_Sub9 class68_sub20_sub9 = Class71_Sub1.method1346((byte) 37); class68_sub20_sub9 != null; class68_sub20_sub9 = Class71_Sub1.method1346((byte) 37))
                        {
                            int i = class68_sub20_sub9.method1102(!bool);
                            int i_19_ = class68_sub20_sub9.method1096(-1597153401);
                            if (i != 1)
                            {
                                if (i == 2)
                                {
                                    Class21_Sub1.aClass100Array2712[i_19_] = ((Class68_Sub20_Sub9) class68_sub20_sub9).aClass100_4302;
                                    Class68_Sub13_Sub31.anIntArray3972[Class120.method1746(31, Class68_Sub10.anInt2910++)] = i_19_;
                                }
                            } else
                            {
                                Class106.anIntArray1811[i_19_] = ((Class68_Sub20_Sub9) class68_sub20_sub9).anInt4295;
                                Class125.anIntArray2171[Class120.method1746(31, Class13_Sub1.anInt2641++)] = i_19_;
                            }
                        }
                        if (client.anInt2378 != 0)
                        {
                            Class26.anInt523 += 20;
                            if (Class26.anInt523 >= 400)
                                client.anInt2378 = 0;
                        }
                        Class109.anInt1846++;
                        if (Class1_Sub5.aClass45_2517 != null)
                        {
                            Class68_Sub13_Sub24.anInt3835++;
                            if (Class68_Sub13_Sub24.anInt3835 >= 15)
                            {
                                NodeCache.method1688(Class1_Sub5.aClass45_2517, -116);
                                Class1_Sub5.aClass45_2517 = null;
                            }
                        }
                        if (Class54.aClass45_1033 != null)
                        {
                            NodeCache.method1688(Class54.aClass45_1033, -116);
                            if (Class59.anInt1102 + 5 < Class96.anInt1697 || Class59.anInt1102 - 5 > Class96.anInt1697 || (Class68_Sub18.anInt3048 + 5 < Class13.anInt223) || (Class13.anInt223 < Class68_Sub18.anInt3048 - 5))
                                Class87.aBoolean1589 = true;
                            Class68_Sub13_Sub6.anInt3534++;
                            if (Class68_Sub20_Sub12.anInt4354 == 0)
                            {
                                if (!Class87.aBoolean1589 || Class68_Sub13_Sub6.anInt3534 < 5)
                                {
                                    if ((Class14.anInt228 == 1 || (GameApplet.method17((byte) -125, (Class68_Sub13_Sub21.menuOptionsCount - 1)))) && Class68_Sub13_Sub21.menuOptionsCount > 2)
                                        Class68_Sub13_Sub18.method787((byte) -49);
                                    else if (Class68_Sub13_Sub21.menuOptionsCount > 0)
                                        Class68_Sub13_Sub39.method901((byte) 46);
                                } else if ((Class3.aClass45_73 == Class54.aClass45_1033) && (Class68_Sub20_Sub2.anInt4191 != (Class68_Sub13_Sub32.anInt3980)))
                                {
                                    Class68_Sub9.anInt2892++;
                                    Widget class45 = Class54.aClass45_1033;
                                    int i = 0;
                                    if (Class108.anInt1826 == 1 && ((Widget) class45).anInt808 == 206)
                                        i = 1;
                                    if ((((Widget) class45).inventory[Class68_Sub13_Sub32.anInt3980]) <= 0)
                                        i = 0;
                                    if (Class68_Sub13_Sub8.method733(0, client.method41(class45)))
                                    {
                                        int i_20_ = Class68_Sub20_Sub2.anInt4191;
                                        int i_21_ = Class68_Sub13_Sub32.anInt3980;
                                        ((Widget) class45).inventory[i_21_] = (((Widget) class45).inventory[i_20_]);
                                        ((Widget) class45).inventoryStackSizes[i_21_] = (((Widget) class45).inventoryStackSizes[i_20_]);
                                        ((Widget) class45).inventory[i_20_] = -1;
                                        ((Widget) class45).inventoryStackSizes[i_20_] = 0;
                                    } else if (i != 1)
                                        class45.swapInventoryItems((Class68_Sub13_Sub32.anInt3980), (Class68_Sub20_Sub2.anInt4191));
                                    else
                                    {
                                        int i_22_ = Class68_Sub13_Sub32.anInt3980;
                                        int i_23_ = Class68_Sub20_Sub2.anInt4191;
                                        while (i_23_ != i_22_)
                                        {
                                            if (i_22_ >= i_23_)
                                            {
                                                if (i_22_ > i_23_)
                                                {
                                                    class45.swapInventoryItems((i_23_ + 1), i_23_);
                                                    i_23_++;
                                                }
                                            } else
                                            {
                                                class45.swapInventoryItems(i_23_ - 1, i_23_);
                                                i_23_--;
                                            }
                                        }
                                    }
                                    Class21.connectionVector.startPacket(167);
                                    Class21.connectionVector.writeLEShortA(Class68_Sub13_Sub32.anInt3980);
                                    Class21.connectionVector.writeByteA(i);
                                    Class21.connectionVector.writeLEShortA(Class68_Sub20_Sub2.anInt4191);
                                    Class21.connectionVector.writeLEInteger((((Widget) Class54.aClass45_1033).anInt792));
                                }
                                Class68_Sub13_Sub24.anInt3835 = 10;
                                Class54.aClass45_1033 = null;
                                Class29.anInt537 = 0;
                            }
                        }
                        Class124.aBoolean2161 = false;
                        Class68_Sub18.aBoolean3060 = false;
                        Widget class45 = Class108.aClass45_1827;
                        Class108.aClass45_1827 = null;
                        Animable.aClass45_61 = null;
                        Class43.anInt739 = 0;
                        Widget class45_24_ = Class121.aClass45_2110;
                        Class121.aClass45_2110 = null;
                        for (/**/; (Class68_Sub25.method1210((byte) 111) && Class43.anInt739 < 128); Class43.anInt739++)
                        {
                            ClientScript.anIntArray4387[(Class43.anInt739)] = Class59.anInt1104;
                            Class50.anIntArray983[Class43.anInt739] = Character.anInt2538;
                        }
                        Node.aClass45_1231 = null;
                        if (Class68_Sub13_Sub10.anInt3597 != -1)
                            Class25.method384(-88, Class68_Sub13_Sub10.anInt3597, Class13_Sub3.appletWidth, 0, 0, 0, 0, Class68_Sub13_Sub9.appletHeight);
                        Class68_Sub22.anInt3150++;
                        for (;;)
                        {
                            ScriptParameters class68_sub29 = ((ScriptParameters) Class35.aClass16_623.method294(-107));
                            if (class68_sub29 == null)
                                break;
                            Widget class45_25_ = (((ScriptParameters) class68_sub29).aClass45_3241);
                            if (((Widget) class45_25_).anInt867 >= 0)
                            {
                                Widget class45_26_ = (Class68_Sub20_Sub15.method1170(((Widget) class45_25_).anInt799, (byte) -80));
                                if (class45_26_ == null || (((Widget) class45_26_).widgetCache) == null || (((Widget) class45_25_).anInt867 >= (((Widget) class45_26_).widgetCache).length) || (class45_25_ != (((Widget) class45_26_).widgetCache[(((Widget) class45_25_).anInt867)])))
                                    continue;
                            }
                            Class68_Sub13_Sub16.method776(class68_sub29, 16);
                        }
                        for (;;)
                        {
                            ScriptParameters class68_sub29 = ((ScriptParameters) Class13_Sub1.aClass16_2629.method294(-95));
                            if (class68_sub29 == null)
                                break;
                            Widget class45_27_ = (((ScriptParameters) class68_sub29).aClass45_3241);
                            if (((Widget) class45_27_).anInt867 >= 0)
                            {
                                Widget class45_28_ = (Class68_Sub20_Sub15.method1170(((Widget) class45_27_).anInt799, (byte) -80));
                                if (class45_28_ == null || (((Widget) class45_28_).widgetCache) == null || (((Widget) class45_27_).anInt867 >= (((Widget) class45_28_).widgetCache).length) || ((((Widget) class45_28_).widgetCache[((Widget) class45_27_).anInt867]) != class45_27_))
                                    continue;
                            }
                            Class68_Sub13_Sub16.method776(class68_sub29, 16);
                        }
                        for (;;)
                        {
                            ScriptParameters class68_sub29 = ((ScriptParameters) Class115.aClass16_1957.method294(80));
                            if (class68_sub29 == null)
                                break;
                            Widget class45_29_ = (((ScriptParameters) class68_sub29).aClass45_3241);
                            if (((Widget) class45_29_).anInt867 >= 0)
                            {
                                Widget class45_30_ = (Class68_Sub20_Sub15.method1170(((Widget) class45_29_).anInt799, (byte) -80));
                                if (class45_30_ == null || (((Widget) class45_30_).widgetCache) == null || (((Widget) class45_29_).anInt867 >= (((Widget) class45_30_).widgetCache).length) || (class45_29_ != (((Widget) class45_30_).widgetCache[(((Widget) class45_29_).anInt867)])))
                                    continue;
                            }
                            Class68_Sub13_Sub16.method776(class68_sub29, 16);
                        }
                        if (Class68_Sub10.aBoolean2905 && Node.aClass45_1231 == null)
                            Class68_Sub10.aBoolean2905 = false;
                        if (Class35.aClass45_606 != null)
                            Class127.method1783((byte) -113);
                        if (Class68_Sub13_Sub13.anInt3665 > 0 && NodeSubList.aBooleanArray2230[82] && NodeSubList.aBooleanArray2230[81] && Class68_Sub13_Sub30.anInt3950 != 0)
                        {
                            int i = (GameSocket.plane - Class68_Sub13_Sub30.anInt3950);
                            if (i < 0)
                                i = 0;
                            else if (i > 3)
                                i = 3;
                            Class51.method539(((((Character) (Class68_Sub7.localPlayer)).walkQueueX[0]) + Class36.baseX), i, (Class68_Sub13_Sub35.baseY + (((Character) (Class68_Sub7.localPlayer)).walkQueueY[0])), 24867);
                        }
                        if (Class68_Sub20_Sub15.anInt4402 != -1)
                        {
                            int i = Class68_Sub20_Sub15.anInt4402;
                            int i_31_ = RandomNumberGenerator.anInt1491;
                            if (Class68_Sub13_Sub13.anInt3665 <= 0 || !NodeSubList.aBooleanArray2230[82] || !NodeSubList.aBooleanArray2230[81])
                            {
                                boolean bool_32_ = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i_31_, true, 0, -3, 0, i));
                                if (bool_32_)
                                {
                                    Class26.anInt523 = 0;
                                    Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                                    client.anInt2378 = 1;
                                    Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                                }
                            } else
                                Class51.method539(Class36.baseX + i, GameSocket.plane, (Class68_Sub13_Sub35.baseY) + i_31_, 24867);
                            Class68_Sub20_Sub15.anInt4402 = -1;
                        }
                        Class68_Sub28_Sub2.method1265(-2);
                        if (class45 != Class108.aClass45_1827)
                        {
                            if (class45 != null)
                                NodeCache.method1688(class45, -114);
                            if (Class108.aClass45_1827 != null)
                                NodeCache.method1688(Class108.aClass45_1827, -116);
                        }
                        if (Class121.aClass45_2110 != class45_24_ && Class59.anInt1109 == Class94.anInt1678)
                        {
                            if (class45_24_ != null)
                                NodeCache.method1688(class45_24_, -119);
                            if (Class121.aClass45_2110 != null)
                                NodeCache.method1688(Class121.aClass45_2110, -119);
                        }
                        if (Class121.aClass45_2110 != null)
                        {
                            if (Class94.anInt1678 > Class59.anInt1109)
                            {
                                Class59.anInt1109++;
                                if (Class59.anInt1109 == Class94.anInt1678)
                                    NodeCache.method1688(Class121.aClass45_2110, -113);
                            }
                        } else if (Class59.anInt1109 > 0)
                            Class59.anInt1109--;
                        if (NodeSubList.anInt2216 != 1)
                        {
                            if (NodeSubList.anInt2216 != 2)
                                Object2.method1407(-1);
                            else
                                Class114.method1697(-128);
                        } else
                            Class68_Sub20_Sub17.method1178(2);
                        for (int i = 0; i < 5; i++)
                            Class68_Sub13_Sub16.anIntArray3699[i]++;
                        int i = Class11.method229((byte) 47);
                        int i_33_ = Class68_Sub13_Sub18.method790(7);
                        if (i > 4500 && i_33_ > 4500)
                        {
                            NodeList.anInt273 = 250;
                            Mouse.method1488(4000, 0);
                            Class14.anInt232++;
                            Class21.connectionVector.startPacket(47);
                        }
                        Class68_Sub20_Sub13.anInt4365++;
                        Class22.anInt482++;
                        if (Class22.anInt482 > 500)
                        {
                            Class22.anInt482 = 0;
                            int i_34_ = (int) (Math.random() * 8.0);
                            if ((i_34_ & 0x2) == 2)
                                Class68_Sub20_Sub9.anInt4293 += Class68_Sub13_Sub14.anInt3675;
                            if ((0x1 & i_34_) == 1)
                                Class68_Sub3.anInt2807 += Class68_Sub26.anInt3185;
                            if ((0x4 & i_34_) == 4)
                                Class68_Sub13_Sub28.anInt3922 += Class68_Sub28_Sub1.anInt4505;
                        }
                        if (Class68_Sub20_Sub13.anInt4365 > 500)
                        {
                            Class68_Sub20_Sub13.anInt4365 = 0;
                            int i_35_ = (int) (8.0 * Math.random());
                            if ((i_35_ & 0x2) == 2)
                                Class68_Sub20_Sub16.minimapInt3 += Class1_Sub1.anInt2414;
                            if ((0x1 & i_35_) == 1)
                                Class68_Sub13_Sub26.minimapInt1 += Class68_Sub13_Sub4.anInt3503;
                        }
                        if (Class68_Sub20_Sub16.minimapInt3 < -20)
                            Class1_Sub1.anInt2414 = 1;
                        if (Class68_Sub13_Sub28.anInt3922 < -40)
                            Class68_Sub28_Sub1.anInt4505 = 1;
                        if (Class68_Sub3.anInt2807 < -50)
                            Class68_Sub26.anInt3185 = 2;
                        if (Class68_Sub20_Sub16.minimapInt3 > 10)
                            Class1_Sub1.anInt2414 = -1;
                        Class75_Sub2.anInt3315++;
                        if (Class68_Sub13_Sub26.minimapInt1 < -60)
                            Class68_Sub13_Sub4.anInt3503 = 2;
                        if (Class68_Sub3.anInt2807 > 50)
                            Class68_Sub26.anInt3185 = -2;
                        if (Class68_Sub13_Sub28.anInt3922 > 40)
                            Class68_Sub28_Sub1.anInt4505 = -1;
                        if (Class68_Sub20_Sub9.anInt4293 < -55)
                            Class68_Sub13_Sub14.anInt3675 = 2;
                        if (Class68_Sub13_Sub26.minimapInt1 > 60)
                            Class68_Sub13_Sub4.anInt3503 = -2;
                        if (Class68_Sub20_Sub9.anInt4293 > 55)
                            Class68_Sub13_Sub14.anInt3675 = -2;
                        if (Class75_Sub2.anInt3315 > 50)
                        {
                            Class78.anInt1394++;
                            Class21.connectionVector.startPacket(115);
                        }
                        Class107.method1657(-14394);
                        do
                        {
                            try
                            {
                                if (PlayerDefinition.connection == null || (((Stream) Class21.connectionVector).position) <= 0)
                                    break;
                                PlayerDefinition.connection.queueBytes(0, (byte) 81, (((Stream) Class21.connectionVector).position), (((Stream) Class21.connectionVector).buffer));
                                Class75_Sub2.anInt3315 = 0;
                                ((Stream) Class21.connectionVector).position = 0;
                            } catch (java.io.IOException ioexception)
                            {
                                Class72_Sub1.method1367((byte) -21);
                            }
                            break;
                        } while (false);
                    }
                }
            }
        }
    }

    static final void method1518(int i, byte i_36_, int i_37_, int i_38_, int i_39_)
    {
        if (Object4.anInt1080 < 100)
            Class115.method1701(false);
        anInt2338++;
        Class79.method1433(i_39_, i, i_38_ + i_39_, i + i_37_);
        if (Object4.anInt1080 < 100)
        {
            int i_40_ = 20;
            int i_41_ = i_39_ + i_38_ / 2;
            int i_42_ = i_37_ / 2 - 18 + i - i_40_;
            Class79.method1445(i_39_, i, i_38_, i_37_, 0);
            Class79.method1421(i_41_ - 152, i_42_, 304, 34, 9179409);
            Class79.method1421(i_41_ - 151, i_42_ + 1, 302, 32, 0);
            Class79.method1445(i_41_ - 150, i_42_ + 2, 3 * Object4.anInt1080, 30, 9179409);
            Class79.method1445(Object4.anInt1080 * 3 - 150 + i_41_, i_42_ + 2, 300 - Object4.anInt1080 * 3, 30, 0);
            Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1032(Mouse.aClass100_1576, i_41_, i_42_ + i_40_, 16777215, -1);
        } else
        {
            Object1.anInt1192 = Class85.anInt1553 - (int) ((float) i_37_ / Class68_Sub9.aFloat2894);
            Class13_Sub4.anInt2689 = (int) ((float) (i_38_ * 2) / Class68_Sub9.aFloat2894);
            Class1_Sub7.anInt2621 = (int) ((float) (i_37_ * 2) / Class68_Sub9.aFloat2894);
            Class25.anInt516 = (Class68_Sub13_Sub24.anInt3846 - (int) ((float) i_38_ / Class68_Sub9.aFloat2894));
            if (i_36_ != 51)
                method1517(false);
            int i_43_ = (Class68_Sub13_Sub24.anInt3846 - (int) ((float) i_38_ / Class68_Sub9.aFloat2894));
            int i_44_ = (Class85.anInt1553 - (int) ((float) i_37_ / Class68_Sub9.aFloat2894));
            int i_45_ = ((int) ((float) i_37_ / Class68_Sub9.aFloat2894) + Class85.anInt1553);
            int i_46_ = ((int) ((float) i_38_ / Class68_Sub9.aFloat2894) + Class68_Sub13_Sub24.anInt3846);
            ScriptParameters.method1323(i, i_44_, i_45_, i_39_, i_43_, i_38_ + i_39_, 1391070128, i + i_37_, i_46_);
            Class115.method1700(i_43_, i, false, i_37_ + i, i_39_ + i_38_, i_45_, i_44_, i_46_, i_39_);
            Class68_Sub13_Sub1.method705(i_45_, i, i_37_ + i, i_39_, i_44_, i_39_ + i_38_, i_46_, i_43_, 73);
            if (Class68_Sub13_Sub36.anInt4035 > 0)
                Class68_Sub13_Sub36.anInt4035--;
            if (Class68_Sub22.aBoolean3136)
            {
                int i_47_ = i_38_ + i_39_ - 5;
                int i_48_ = i + i_37_ - 8;
                Class68_Sub6.aClass68_Sub20_Sub1_2849.method1022((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class71.aClass100_1288, Class68_Sub13_Sub24.method816(Class34.anInt597, 0) }))), i_47_, i_48_, 16776960, -1);
                i_48_ -= 15;
                Runtime runtime = Runtime.getRuntime();
                int i_49_ = 16776960;
                int i_50_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                if (i_50_ > 65536)
                    i_49_ = 16711680;
                Class68_Sub6.aClass68_Sub20_Sub1_2849.method1022((Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Object3.aClass100_933, Class68_Sub13_Sub24.method816(i_50_, 0), Class114.aClass100_1930 })), i_47_, i_48_, i_49_, -1);
                i_48_ -= 15;
            }
        }
    }

    final void method1519(byte i)
    {
        anInt2335++;
        aClass82_2342.method1476((byte) -11);
        if (i > -94)
        {
            /* empty */
        }
    }

    public final boolean method8(byte i, int i_51_)
    {
        if (i != 39)
            method1524((byte) 2, true);
        anInt2354++;
        return aBooleanArray2359[i_51_];
    }

    public final int[] method14(float f, int i, int i_52_)
    {
        if (i != 99)
            return null;
        anInt2332++;
        Class68_Sub20_Sub6 class68_sub20_sub6 = method1520((byte) 109, i_52_);
        if (class68_sub20_sub6 == null)
            return null;
        ((Class68_Sub20_Sub6) class68_sub20_sub6).aBoolean4249 = true;
        return class68_sub20_sub6.method1072((byte) -92, aClass21_2336, this, f, (aBoolean2348 || aBooleanArray2329[i_52_]));
    }

    private final Class68_Sub20_Sub6 method1520(byte i, int i_53_)
    {
        int i_54_ = -67 / (-i / 47);
        anInt2361++;
        Class68_Sub20_Sub6 class68_sub20_sub6 = ((Class68_Sub20_Sub6) aClass82_2342.method1479((long) i_53_, (byte) -76));
        if (class68_sub20_sub6 != null)
            return class68_sub20_sub6;
        byte[] is = aClass21_2341.method338(0, 0, i_53_);
        if (is == null)
            return null;
        Stream class68_sub14 = new Stream(is);
        class68_sub20_sub6 = new Class68_Sub20_Sub6(class68_sub14);
        aClass82_2342.method1471((long) i_53_, (byte) 105, class68_sub20_sub6);
        return class68_sub20_sub6;
    }

    static final int method1521(int i, int i_55_)
    {
        if (i_55_ != 522)
            return -35;
        anInt2349++;
        return i & 0x7f;
    }

    public final int method12(int i, int i_56_)
    {
        int i_57_ = 103 / ((56 - i_56_) / 44);
        anInt2346++;
        return 0xffff & aShortArray2360[i];
    }

    final void method1522(int i, int i_58_)
    {
        for (Class68_Sub20_Sub6 class68_sub20_sub6 = (Class68_Sub20_Sub6) aClass82_2342.method1480(i_58_); class68_sub20_sub6 != null; class68_sub20_sub6 = (Class68_Sub20_Sub6) aClass82_2342.method1472(125))
        {
            if (((Class68_Sub20_Sub6) class68_sub20_sub6).aBoolean4249)
            {
                class68_sub20_sub6.method1070(i, -27276);
                ((Class68_Sub20_Sub6) class68_sub20_sub6).aBoolean4249 = false;
            }
        }
        anInt2352++;
    }

    static final int method1523(int i, int i_59_)
    {
        i--;
        anInt2334++;
        i |= i >>> 1;
        i |= i >>> 2;
        i |= i >>> 4;
        if (i_59_ != -21189)
            method1523(-80, 15);
        i |= i >>> 8;
        i |= i >>> 16;
        return i + 1;
    }

    final void method1524(byte i, boolean bool)
    {
        if (i == -97)
        {
            aBoolean2348 = bool;
            anInt2366++;
            method1519((byte) -117);
        }
    }

    public static void method1525(int i)
    {
        if (i == 6287)
        {
            anIntArray2347 = null;
            aClass100_2353 = null;
            anIntArray2337 = null;
            aClass100_2356 = null;
            aClass100_2343 = null;
            aClass100_2357 = null;
        }
    }

    public final boolean method13(boolean bool, int i)
    {
        Class68_Sub20_Sub6 class68_sub20_sub6 = method1520((byte) -120, i);
        anInt2340++;
        if (class68_sub20_sub6 == null)
            return false;
        if (bool != true)
            method1520((byte) 35, -31);
        return class68_sub20_sub6.method1068(this, -5947, aClass21_2336);
    }

    Class90(Class21 class21, Class21 class21_60_, Class21 class21_61_, int i, boolean bool)
    {
        aBoolean2348 = false;
        try
        {
            anInt2355 = i;
            aClass21_2341 = class21;
            aClass21_2336 = class21_61_;
            aBoolean2348 = bool;
            aClass82_2342 = new Login(anInt2355);
            Stream class68_sub14 = new Stream(class21_60_.method338(0, 0, 0));
            int i_62_ = class68_sub14.readUShort();
            aBooleanArray2362 = new boolean[i_62_];
            aBooleanArray2350 = new boolean[i_62_];
            aBooleanArray2365 = new boolean[i_62_];
            aByteArray2367 = new byte[i_62_];
            aBooleanArray2329 = new boolean[i_62_];
            aByteArray2344 = new byte[i_62_];
            aShortArray2360 = new short[i_62_];
            aBooleanArray2359 = new boolean[i_62_];
            aByteArray2351 = new byte[i_62_];
            aByteArray2363 = new byte[i_62_];
            for (int i_63_ = 0; i_62_ > i_63_; i_63_++)
                aBooleanArray2350[i_63_] = class68_sub14.readUByte() == 1;
            for (int i_64_ = 0; i_62_ > i_64_; i_64_++)
            {
                if (aBooleanArray2350[i_64_])
                    aBooleanArray2359[i_64_] = class68_sub14.readUByte() == 1;
            }
            for (int i_65_ = 0; i_65_ < i_62_; i_65_++)
            {
                if (aBooleanArray2350[i_65_])
                    aBooleanArray2365[i_65_] = class68_sub14.readUByte() == 1;
            }
            for (int i_66_ = 0; i_66_ < i_62_; i_66_++)
            {
                if (aBooleanArray2350[i_66_])
                    aBooleanArray2329[i_66_] = class68_sub14.readUByte() == 1;
            }
            for (int i_67_ = 0; i_67_ < i_62_; i_67_++)
            {
                if (aBooleanArray2350[i_67_])
                    aBooleanArray2362[i_67_] = class68_sub14.readUByte() == 1;
            }
            for (int i_68_ = 0; i_68_ < i_62_; i_68_++)
            {
                if (aBooleanArray2350[i_68_])
                    aByteArray2351[i_68_] = class68_sub14.readByte();
            }
            for (int i_69_ = 0; i_69_ < i_62_; i_69_++)
            {
                if (aBooleanArray2350[i_69_])
                    aByteArray2367[i_69_] = class68_sub14.readByte();
            }
            for (int i_70_ = 0; i_62_ > i_70_; i_70_++)
            {
                if (aBooleanArray2350[i_70_])
                    aByteArray2344[i_70_] = class68_sub14.readByte();
            }
            for (int i_71_ = 0; i_62_ > i_71_; i_71_++)
            {
                if (aBooleanArray2350[i_71_])
                    aByteArray2363[i_71_] = class68_sub14.readByte();
            }
            for (int i_72_ = 0; i_62_ > i_72_; i_72_++)
            {
                if (aBooleanArray2350[i_72_])
                    aShortArray2360[i_72_] = (short) class68_sub14.readUShort();
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("pa.<init>(" + (class21 != null ? "{...}" : "null") + ',' + (class21_60_ != null ? "{...}" : "null") + ',' + (class21_61_ != null ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
        }
    }

    static
    {
        anIntArray2337 = new int[128];
        aClass100_2356 = Class112.makeMutableString(43, "Lade Benutzeroberfl-=che )2 ");
        aClass100_2353 = null;
        aClass100_2357 = Class112.makeMutableString(43, "p11_full");
    }
}
