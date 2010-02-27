/* Class68_Sub20_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub8 extends NodeSub
{
    static int anInt4270;
    static int anInt4271;
    static int anInt4272;
    static int anInt4273;
    static int anInt4274;
    static int anInt4275;
    private int[][] anIntArrayArray4276;
    static int anInt4277;
    static int anInt4278;
    int[] anIntArray4279;
    static int anInt4280;
    static Class21 aClass21_4281;
    static int anInt4282;
    static int anInt4283;
    static MutableString aClass100_4284 = Class112.makeMutableString(43, "unzap");
    static int anInt4285;
    static int anInt4286;
    private int[] anIntArray4287;
    static int anInt4288;
    static int anInt4289;
    static int anInt4290;
    private MutableString[] aClass100Array4291;
    static Class21 aClass21_4292;

    final int method1079(int i, int i_0_, int i_1_)
    {
        anInt4282++;
        if (anIntArray4287 == null || i < 0 || i > anIntArray4287.length)
            return -1;
        if (i_0_ != -20484)
            method1089(-25, true, 33);
        if (anIntArrayArray4276[i] == null || i_1_ < 0 || anIntArrayArray4276[i].length < i_1_)
            return -1;
        return anIntArrayArray4276[i][i_1_];
    }

    final int method1080(byte i)
    {
        if (i > -21)
            ((Class68_Sub20_Sub8) this).anIntArray4279 = null;
        anInt4288++;
        if (anIntArray4287 == null)
            return 0;
        return anIntArray4287.length;
    }

    final void method1081(int i, int[] is, Stream class68_sub14)
    {
        while_16_: do
        {
            try
            {
                anInt4283++;
                if (anIntArray4287 != null)
                {
                    int i_2_ = 0;
                    if (i <= -14)
                    {
                        for (;;)
                        {
                            if (anIntArray4287.length <= i_2_)
                                break while_16_;
                            if (i_2_ >= is.length)
                                break;
                            int i_3_ = (Class111.anIntArray1863[method1082(i_2_, (byte) -66)]);
                            if (i_3_ > 0)
                                class68_sub14.writeBytes((long) is[i_2_], i_3_);
                            i_2_++;
                        }
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("gj.E(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final int method1082(int i, byte i_4_)
    {
        anInt4270++;
        if (i_4_ != -66)
            anIntArray4287 = null;
        if (anIntArray4287 == null || i < 0 || anIntArray4287.length < i)
            return -1;
        return anIntArray4287[i];
    }

    static final void method1083(byte i, int i_5_)
    {
        anInt4274++;
        if (i_5_ >= 0)
        {
            int i_6_ = Class68_Sub13_Sub37.menuActionCommands3[i_5_];
            int i_7_ = Class68_Sub28_Sub1.menuActionIDs[i_5_];
            long l = Class68_Sub13_Sub14.menuActionCommands1[i_5_];
            if (i_7_ >= 2000)
                i_7_ -= 2000;
            int i_8_ = (int) Class68_Sub13_Sub14.menuActionCommands1[i_5_];
            int i_9_ = Class37.menuActionCommands2[i_5_];
            if (i_7_ == 20)
            {
                Player class1_sub6_sub2 = Class68_Sub13_Sub4.localPlayers[i_8_];
                if (class1_sub6_sub2 != null)
                {
                    Class101.anInt1743++;
                    Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, ((Character) class1_sub6_sub2).walkQueueY[0], false, 0, -3, 2, ((Character) class1_sub6_sub2).walkQueueX[0]);
                    Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                    Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                    client.anInt2378 = 2;
                    Class26.anInt523 = 0;
                    Class21.connectionVector.startPacket(227);
                    Class21.connectionVector.writeLEShortA(i_8_);
                }
            }
            if (i_7_ == 41)
            {
                Class88.anInt1608++;
                Class21.connectionVector.startPacket(203);
                Class21.connectionVector.writeLEShortA(i_9_);
                Class21.connectionVector.writeDWord(i_6_);
                Class21.connectionVector.writeShort(i_8_);
                Class68_Sub13_Sub24.anInt3835 = 0;
                Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if (i_7_ == 58)
            {
                Class21.connectionVector.startPacket(137);
                Class72_Sub1.anInt3285++;
                Class21.connectionVector.writeShort(i_8_);
                Class21.connectionVector.method913((byte) -104, i_6_);
                Class21.connectionVector.writeLEShort(i_9_);
                Class68_Sub13_Sub24.anInt3835 = 0;
                Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if (i_7_ == 7)
            {
                Class21.connectionVector.startPacket(152);
                GameException.anInt2244++;
                Class21.connectionVector.writeLEShortA(i_9_);
                Class21.connectionVector.writeShortA(i_8_);
                Class21.connectionVector.method913((byte) -102, i_6_);
                Class68_Sub13_Sub24.anInt3835 = 0;
                Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if (i_7_ == 1005)
            {
                Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                Class26.anInt523 = 0;
                Class60.anInt1116++;
                Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                client.anInt2378 = 2;
                Class21.connectionVector.startPacket(84);
                Class21.connectionVector.writeShortA(i_8_);
            }
            if (i_7_ == 35)
            {
                Widget.anInt824++;
                boolean bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i_6_, false, 0, -3, 2, i_9_));
                if (!bool)
                    bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, i_6_, false, 0, -3, 2, i_9_));
                Class26.anInt523 = 0;
                client.anInt2378 = 2;
                Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                Class21.connectionVector.startPacket(191);
                Class21.connectionVector.writeShort(i_9_ + Class36.baseX);
                Class21.connectionVector.writeShort(i_6_ + Class68_Sub13_Sub35.baseY);
                Class21.connectionVector.writeShortA(i_8_);
            }
            if (i_7_ == 6)
            {
                Class114.anInt1931++;
                Class21.connectionVector.startPacket(136);
                Class21.connectionVector.method913((byte) -126, i_6_);
                Class21.connectionVector.writeShort(Class68_Sub20_Sub16.anInt4424);
                Class21.connectionVector.writeLEShortA(i_9_);
                Class21.connectionVector.method954(-19237, Class107.anInt1823);
            }
            if (i_7_ == 1006)
            {
                Class85.anInt1557++;
                client.anInt2378 = 2;
                Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                Class26.anInt523 = 0;
                Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                Class21.connectionVector.startPacket(38);
                Class21.connectionVector.writeLEShortA(i_8_);
            }
            if (i_7_ == 29)
            {
                NPC class1_sub6_sub1 = Class102.localNPCs[i_8_];
                if (class1_sub6_sub1 != null)
                {
                    Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, ((Character) class1_sub6_sub1).walkQueueY[0], false, 0, -3, 2, ((Character) class1_sub6_sub1).walkQueueX[0]);
                    Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                    Widget.anInt834++;
                    Class26.anInt523 = 0;
                    Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                    client.anInt2378 = 2;
                    Class21.connectionVector.startPacket(123);
                    Class21.connectionVector.writeShort(i_8_);
                }
            }
            if (i_7_ == 12)
            {
                NPC class1_sub6_sub1 = Class102.localNPCs[i_8_];
                if (class1_sub6_sub1 != null)
                {
                    Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, ((Character) class1_sub6_sub1).walkQueueY[0], false, 0, -3, 2, ((Character) class1_sub6_sub1).walkQueueX[0]);
                    Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                    Class26.anInt523 = 0;
                    client.anInt2378 = 2;
                    Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                    Class21.connectionVector.startPacket(7);
                    Class21.connectionVector.writeShortA(i_8_);
                    Class90.anInt2331++;
                }
            }
            if (i_7_ == 4)
            {
                Player class1_sub6_sub2 = Class68_Sub13_Sub4.localPlayers[i_8_];
                if (class1_sub6_sub2 != null)
                {
                    Item.anInt2442++;
                    Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, ((Character) class1_sub6_sub2).walkQueueY[0], false, 0, -3, 2, ((Character) class1_sub6_sub2).walkQueueX[0]);
                    Class26.anInt523 = 0;
                    Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                    client.anInt2378 = 2;
                    Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                    Class21.connectionVector.startPacket(35);
                    Class21.connectionVector.writeLEShortA(i_8_);
                }
            }
            if (i_7_ == 39)
            {
                Class21.connectionVector.startPacket(40);
                Class21.connectionVector.writeLEShort(i_8_);
                Class85.anInt1564++;
                Class21.connectionVector.writeShortA(Class68_Sub13_Sub33.anInt4003);
                Class21.connectionVector.method913((byte) -109, Class68_Sub28_Sub2.anInt4555);
                Class21.connectionVector.method913((byte) -111, i_6_);
                Class21.connectionVector.writeShortA(i_9_);
                Class21.connectionVector.writeShortA(Player.anInt3401);
                Class68_Sub13_Sub24.anInt3835 = 0;
                Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if (i_7_ == 1 && Class75_Sub2.method1398(l, i_6_, -12974, i_9_))
            {
                Class103.anInt1761++;
                Class21.connectionVector.startPacket(224);
                Class21.connectionVector.writeLEShort(i_6_ + Class68_Sub13_Sub35.baseY);
                Class21.connectionVector.writeShort(Class68_Sub13_Sub33.anInt4003);
                Class21.connectionVector.method913((byte) -107, Class68_Sub28_Sub2.anInt4555);
                Class21.connectionVector.writeShortA(Player.anInt3401);
                Class21.connectionVector.writeShortA(0x7fffffff & (int) (l >>> 32));
                Class21.connectionVector.writeShort(i_9_ + Class36.baseX);
            }
            if (i_7_ == 2)
            {
                Player class1_sub6_sub2 = Class68_Sub13_Sub4.localPlayers[i_8_];
                if (class1_sub6_sub2 != null)
                {
                    Class68_Sub13_Sub13.anInt3654++;
                    Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, ((Character) class1_sub6_sub2).walkQueueY[0], false, 0, -3, 2, ((Character) class1_sub6_sub2).walkQueueX[0]);
                    client.anInt2378 = 2;
                    Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                    Class26.anInt523 = 0;
                    Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                    Class21.connectionVector.startPacket(131);
                    Class21.connectionVector.writeLEInteger(Class68_Sub28_Sub2.anInt4555);
                    Class21.connectionVector.writeShortA(i_8_);
                    Class21.connectionVector.writeLEShort(Player.anInt3401);
                    Class21.connectionVector.writeLEShort(Class68_Sub13_Sub33.anInt4003);
                }
            }
            if (i_7_ == 1002)
            {
                client.anInt2378 = 2;
                Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                Class26.anInt523 = 0;
                Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                NPC class1_sub6_sub1 = Class102.localNPCs[i_8_];
                if (class1_sub6_sub1 != null)
                {
                    NPCDefinition class80 = ((NPC) class1_sub6_sub1).definition;
                    if (((NPCDefinition) class80).anIntArray1433 != null)
                        class80 = class80.method1453(-94);
                    if (class80 != null)
                    {
                        Class21.connectionVector.startPacket(88);
                        Class21.connectionVector.writeShort(((NPCDefinition) class80).type);
                        Class125.anInt2174++;
                    }
                }
            }
            if (i_7_ == 31)
            {
                Class21.connectionVector.startPacket(154);
                Class21.connectionVector.writeLEShortA(i_8_);
                GroundData.anInt668++;
                Class21.connectionVector.writeLEShort(Class68_Sub20_Sub16.anInt4424);
                Class21.connectionVector.writeLEShort(i_9_);
                Class21.connectionVector.writeLEInteger(i_6_);
                Class21.connectionVector.writeLEInteger(Class107.anInt1823);
                Class68_Sub13_Sub24.anInt3835 = 0;
                Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                Class63.anInt1172 = i_9_;
            }
            if (i_7_ == 32)
            {
                Widget class45 = Class66.method637(i_6_, false, i_9_);
                if (class45 != null)
                {
                    Class9.method208((byte) 96);
                    Class102.method1637((byte) -113, Player.method164(106, client.method41(class45)), i_9_, i_6_);
                    Class68_Sub13_Sub37.anInt4064 = 0;
                    Class7.aClass100_118 = Class8.method204(0, class45);
                    if (Class7.aClass100_118 == null)
                        Class7.aClass100_118 = Class68_Sub13_Sub3.aClass100_3482;
                    if (!((Widget) class45).aBoolean863)
                        Class68_Sub13_Sub1.aClass100_3454 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class48.aClass100_953, ((Widget) class45).spellName, Node.aClass100_1223 })));
                    else
                        Class68_Sub13_Sub1.aClass100_3454 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { ((Widget) class45).aClass100_890, Node.aClass100_1223 })));
                }
            } else
            {
                if (i_7_ == 8)
                {
                    boolean bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i_6_, false, 0, -3, 2, i_9_));
                    if (!bool)
                        bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, i_6_, false, 0, -3, 2, i_9_));
                    Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                    client.anInt2378 = 2;
                    Class26.anInt523 = 0;
                    Class68_Sub13_Sub23.anInt3825++;
                    Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                    Class21.connectionVector.startPacket(9);
                    Class21.connectionVector.writeShortA(Class68_Sub13_Sub33.anInt4003);
                    Class21.connectionVector.writeLEShortA(i_8_);
                    Class21.connectionVector.method954(-19237, Class68_Sub28_Sub2.anInt4555);
                    Class21.connectionVector.writeLEShortA(i_6_ + Class68_Sub13_Sub35.baseY);
                    Class21.connectionVector.writeShort(Player.anInt3401);
                    Class21.connectionVector.writeLEShort(i_9_ + Class36.baseX);
                }
                if (i_7_ == 14)
                {
                    Class68_Sub20_Sub11.anInt4338++;
                    Class21.connectionVector.startPacket(220);
                    Class21.connectionVector.writeLEInteger(i_6_);
                    Class21.connectionVector.writeLEShort(i_8_);
                    Class21.connectionVector.writeShortA(i_9_);
                    Class68_Sub13_Sub24.anInt3835 = 0;
                    Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                    Class63.anInt1172 = i_9_;
                }
                if (i_7_ == 16)
                {
                    Class9.method208((byte) 114);
                    Widget class45 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                    Class68_Sub13_Sub37.anInt4064 = 1;
                    Class68_Sub13_Sub33.anInt4003 = i_8_;
                    Class68_Sub28_Sub2.anInt4555 = i_6_;
                    Player.anInt3401 = i_9_;
                    NodeCache.method1688(class45, -120);
                    Class44.aClass100_743 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub10.aClass100_3590, (((ItemDefinition) GameApplet.method18(-25672, i_8_)).name), Node.aClass100_1223 })));
                    if (Class44.aClass100_743 == null)
                        Class44.aClass100_743 = Class68_Sub13_Sub32.aClass100_3984;
                } else
                {
                    if (i_7_ == 9)
                    {
                        Class71.anInt1297++;
                        boolean bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i_6_, false, 0, -3, 2, i_9_));
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, i_6_, false, 0, -3, 2, i_9_));
                        Class26.anInt523 = 0;
                        Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                        client.anInt2378 = 2;
                        Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                        Class21.connectionVector.startPacket(33);
                        Class21.connectionVector.writeLEShortA(Class68_Sub13_Sub35.baseY + i_6_);
                        Class21.connectionVector.writeLEShort(i_8_);
                        Class21.connectionVector.writeShort(i_9_ + Class36.baseX);
                    }
                    if (i_7_ == 5)
                        Class68_Sub13_Sub16.method774(GameSocket.plane, i_9_, i_6_);
                    if (i_7_ == 13)
                    {
                        Class68_Sub13_Sub38.anInt4082++;
                        Class21.connectionVector.startPacket(134);
                        Class21.connectionVector.writeShort(i_8_);
                        Class21.connectionVector.writeLEShortA(i_9_);
                        Class21.connectionVector.writeLEInteger(i_6_);
                        Class68_Sub13_Sub24.anInt3835 = 0;
                        Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 25)
                    {
                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_8_]);
                        if (class1_sub6_sub2 != null)
                        {
                            Class68_Sub6.anInt2842++;
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub2).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub2).walkQueueX[0]));
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class26.anInt523 = 0;
                            client.anInt2378 = 2;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class21.connectionVector.startPacket(68);
                            Class21.connectionVector.writeLEShortA(i_8_);
                        }
                    }
                    if (i_7_ == 3)
                    {
                        Class118.anInt2081++;
                        boolean bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i_6_, false, 0, -3, 2, i_9_));
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, i_6_, false, 0, -3, 2, i_9_));
                        client.anInt2378 = 2;
                        Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                        Class26.anInt523 = 0;
                        Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                        Class21.connectionVector.startPacket(39);
                        Class21.connectionVector.writeLEShort(i_8_);
                        Class21.connectionVector.writeShortA(Class36.baseX + i_9_);
                        Class21.connectionVector.writeLEShort(Class68_Sub13_Sub35.baseY + i_6_);
                    }
                    if (i_7_ == 1001)
                    {
                        Widget class45 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        do
                        {
                            if (class45 != null && (((Widget) class45).inventoryStackSizes[i_9_] >= 100000))
                            {
                                Class48.method520(Class68_Sub28_Sub2.aClass100_4558, 125, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub24.method816((((Widget) class45).inventoryStackSizes[i_9_]), 0)), Class68_Sub13_Sub22.aClass100_3810, (((ItemDefinition) GameApplet.method18(-25672, i_8_)).name) }))), 0);
                                if (client.anInt2387 == 0)
                                    break;
                            }
                            Class21.connectionVector.startPacket(38);
                            Class21.connectionVector.writeLEShortA(i_8_);
                            Class85.anInt1557++;
                        } while (false);
                        Class68_Sub13_Sub24.anInt3835 = 0;
                        Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 50)
                    {
                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_8_]);
                        if (class1_sub6_sub2 != null)
                        {
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub2).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub2).walkQueueX[0]));
                            Class75_Sub3.anInt3321++;
                            client.anInt2378 = 2;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class26.anInt523 = 0;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class21.connectionVector.startPacket(70);
                            Class21.connectionVector.writeShort(Class68_Sub20_Sub16.anInt4424);
                            Class21.connectionVector.writeLEShort(i_8_);
                            Class21.connectionVector.writeDWord(Class107.anInt1823);
                        }
                    }
                    if (i_7_ == 1003)
                    {
                        NodeCache.anInt1916++;
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21.connectionVector.startPacket(190);
                        Class21.connectionVector.writeLEShort(Class68_Sub13_Sub35.baseY + i_6_);
                        Class21.connectionVector.writeLEShortA(i_9_ + Class36.baseX);
                        Class21.connectionVector.writeLEShortA(0x7fffffff & (int) (l >>> 32));
                    }
                    if (i_7_ == 22)
                    {
                        Class21.connectionVector.startPacket(211);
                        Class68_Sub20_Sub13_Sub2.anInt4621++;
                        Class21.connectionVector.writeLEInteger(i_6_);
                        Class21.connectionVector.writeLEShortA(i_9_);
                        Class21.connectionVector.writeShort(i_8_);
                        Class68_Sub13_Sub24.anInt3835 = 0;
                        Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 11)
                    {
                        NPC class1_sub6_sub1 = Class102.localNPCs[i_8_];
                        if (class1_sub6_sub1 != null)
                        {
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub1).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub1).walkQueueX[0]));
                            Class26.anInt523 = 0;
                            client.anInt2378 = 2;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class67.anInt1216++;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class21.connectionVector.startPacket(221);
                            Class21.connectionVector.writeLEShortA(i_8_);
                        }
                    }
                    if (i_7_ == 30)
                    {
                        Class67.anInt1214++;
                        boolean bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i_6_, false, 0, -3, 2, i_9_));
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, i_6_, false, 0, -3, 2, i_9_));
                        Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                        Class26.anInt523 = 0;
                        client.anInt2378 = 2;
                        Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                        Class21.connectionVector.startPacket(201);
                        Class21.connectionVector.writeShortA(Class68_Sub13_Sub35.baseY + i_6_);
                        Class21.connectionVector.writeShort(Class36.baseX + i_9_);
                        Class21.connectionVector.writeLEShortA(i_8_);
                    }
                    if (i_7_ == 36)
                    {
                        Class21.connectionVector.startPacket(113);
                        Class21.connectionVector.writeDWord(i_6_);
                        GameException.anInt2237++;
                        Widget class45 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        if (((Widget) class45).valueIndices != null && (((Widget) class45).valueIndices[0][0] == 5))
                        {
                            int i_10_ = ((Widget) class45).valueIndices[0][1];
                            Class103.settingArray[i_10_] = 1 - Class103.settingArray[i_10_];
                            Class68_Sub13_Sub35.method878((byte) 67, i_10_);
                        }
                    }
                    if (i_7_ == 44)
                    {
                        NPC class1_sub6_sub1 = Class102.localNPCs[i_8_];
                        if (class1_sub6_sub1 != null)
                        {
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub1).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub1).walkQueueX[0]));
                            client.anInt2378 = 2;
                            NodeList.anInt262++;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class26.anInt523 = 0;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class21.connectionVector.startPacket(24);
                            Class21.connectionVector.writeShortA(i_8_);
                            Class21.connectionVector.method913((byte) -87, Class107.anInt1823);
                            Class21.connectionVector.writeShortA(Class68_Sub20_Sub16.anInt4424);
                        }
                    }
                    if (i_7_ == 24)
                    {
                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_8_]);
                        if (class1_sub6_sub2 != null)
                        {
                            Class68_Sub13_Sub28.anInt3929++;
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub2).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub2).walkQueueX[0]));
                            client.anInt2378 = 2;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class26.anInt523 = 0;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class21.connectionVector.startPacket(160);
                            Class21.connectionVector.writeLEShort(i_8_);
                        }
                    }
                    if (i_7_ == 17)
                    {
                        Class68_Sub20_Sub13.anInt4362++;
                        Class21.connectionVector.startPacket(3);
                        Class21.connectionVector.method954(-19237, i_6_);
                        Class21.connectionVector.writeLEShort(i_8_);
                        Class21.connectionVector.writeLEShort(i_9_);
                        Class68_Sub13_Sub24.anInt3835 = 0;
                        Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 10)
                        Class20.method320(636);
                    if (i_7_ == 34)
                    {
                        boolean bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i_6_, false, 0, -3, 2, i_9_));
                        Class75_Sub3_Sub1.anInt4594++;
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, i_6_, false, 0, -3, 2, i_9_));
                        Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                        Class26.anInt523 = 0;
                        Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                        client.anInt2378 = 2;
                        Class21.connectionVector.startPacket(81);
                        Class21.connectionVector.writeShortA(i_9_ + Class36.baseX);
                        Class21.connectionVector.writeDWord(Class107.anInt1823);
                        Class21.connectionVector.writeShort(Class68_Sub13_Sub35.baseY + i_6_);
                        Class21.connectionVector.writeShortA(i_8_);
                        Class21.connectionVector.writeLEShort(Class68_Sub20_Sub16.anInt4424);
                    }
                    if (i_7_ == 46)
                    {
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21.connectionVector.startPacket(46);
                        Class21.connectionVector.writeLEShortA(Class68_Sub13_Sub35.baseY + i_6_);
                        Class21.connectionVector.writeLEShortA(Class36.baseX + i_9_);
                        Class68_Sub26.anInt3209++;
                        Class21.connectionVector.writeShortA((int) (l >>> 32) & 0x7fffffff);
                    }
                    int i_11_ = -68 % ((i + 6) / 56);
                    if (i_7_ == 28)
                    {
                        GameException.anInt2237++;
                        Class21.connectionVector.startPacket(113);
                        Class21.connectionVector.writeDWord(i_6_);
                        Widget class45 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        if (((Widget) class45).valueIndices != null && (((Widget) class45).valueIndices[0][0] == 5))
                        {
                            int i_12_ = ((Widget) class45).valueIndices[0][1];
                            if (((Widget) class45).anIntArray791[0] != Class103.settingArray[i_12_])
                            {
                                Class103.settingArray[i_12_] = ((Widget) class45).anIntArray791[0];
                                Class68_Sub13_Sub35.method878((byte) 67, i_12_);
                            }
                        }
                    }
                    if (i_7_ == 37 && Class75_Sub2.method1398(l, i_6_, -12974, i_9_))
                    {
                        Class68_Sub13_Sub8.anInt3564++;
                        Class21.connectionVector.startPacket(114);
                        Class21.connectionVector.writeLEShort(Class68_Sub13_Sub35.baseY + i_6_);
                        Class21.connectionVector.writeShortA((int) (l >>> 32) & 0x7fffffff);
                        Class21.connectionVector.writeShortA(i_9_ + Class36.baseX);
                        Class21.connectionVector.method954(-19237, Class107.anInt1823);
                        Class21.connectionVector.writeLEShort(Class68_Sub20_Sub16.anInt4424);
                    }
                    if (i_7_ == 51 || i_7_ == 1007)
                        Class17.method298(i_6_, (byte) 78, i_8_, Class33.menuOptions[i_5_], i_9_);
                    if (i_7_ == 38)
                    {
                        Class104.anInt1787++;
                        Class21.connectionVector.startPacket(185);
                        Class21.connectionVector.method954(-19237, i_6_);
                        Class21.connectionVector.writeShort(i_9_);
                        Class21.connectionVector.writeLEShortA(i_8_);
                        Class68_Sub13_Sub24.anInt3835 = 0;
                        Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 42)
                    {
                        Class13_Sub4.anInt2693++;
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21.connectionVector.startPacket(94);
                        Class21.connectionVector.writeShortA(Class36.baseX + i_9_);
                        Class21.connectionVector.writeLEShort(0x7fffffff & (int) (l >>> 32));
                        Class21.connectionVector.writeLEShortA(i_6_ + Class68_Sub13_Sub35.baseY);
                    }
                    if (i_7_ == 47)
                    {
                        Class20.anInt411++;
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21.connectionVector.startPacket(228);
                        Class21.connectionVector.writeShortA(Class68_Sub13_Sub35.baseY + i_6_);
                        Class21.connectionVector.writeLEShort(0x7fffffff & (int) (l >>> 32));
                        Class21.connectionVector.writeLEShortA(i_9_ + Class36.baseX);
                    }
                    if (i_7_ == 26)
                    {
                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_8_]);
                        if (class1_sub6_sub2 != null)
                        {
                            Class68_Sub20_Sub15.anInt4400++;
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub2).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub2).walkQueueX[0]));
                            Class26.anInt523 = 0;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            client.anInt2378 = 2;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class21.connectionVector.startPacket(93);
                            Class21.connectionVector.writeLEShortA(i_8_);
                        }
                    }
                    if (i_7_ == 49)
                    {
                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_8_]);
                        if (class1_sub6_sub2 != null)
                        {
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub2).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub2).walkQueueX[0]));
                            Class68_Sub28_Sub2.anInt4541++;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            client.anInt2378 = 2;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class26.anInt523 = 0;
                            Class21.connectionVector.startPacket(37);
                            Class21.connectionVector.writeShort(i_8_);
                        }
                    }
                    if (i_7_ == 43)
                    {
                        Class21.connectionVector.startPacket(45);
                        Class21.connectionVector.writeShort(i_8_);
                        Class13_Sub1.anInt2638++;
                        Class21.connectionVector.writeLEShort(i_9_);
                        Class21.connectionVector.writeDWord(i_6_);
                        Class68_Sub13_Sub24.anInt3835 = 0;
                        Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (i_7_ == 33)
                    {
                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_8_]);
                        if (class1_sub6_sub2 != null)
                        {
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub2).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub2).walkQueueX[0]));
                            client.anInt2378 = 2;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class112.anInt1879++;
                            Class26.anInt523 = 0;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class21.connectionVector.startPacket(253);
                            Class21.connectionVector.writeLEShortA(i_8_);
                        }
                    }
                    if (i_7_ == 15)
                    {
                        NPC class1_sub6_sub1 = Class102.localNPCs[i_8_];
                        if (class1_sub6_sub1 != null)
                        {
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub1).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub1).walkQueueX[0]));
                            Class101.anInt1739++;
                            client.anInt2378 = 2;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class26.anInt523 = 0;
                            Class21.connectionVector.startPacket(12);
                            Class21.connectionVector.writeLEInteger(Class68_Sub28_Sub2.anInt4555);
                            Class21.connectionVector.writeShort(i_8_);
                            Class21.connectionVector.writeLEShortA(Player.anInt3401);
                            Class21.connectionVector.writeShortA(Class68_Sub13_Sub33.anInt4003);
                        }
                    }
                    if (i_7_ == 45)
                    {
                        Class68_Sub13.anInt2932++;
                        boolean bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i_6_, false, 0, -3, 2, i_9_));
                        if (!bool)
                            bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, i_6_, false, 0, -3, 2, i_9_));
                        Class26.anInt523 = 0;
                        Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                        client.anInt2378 = 2;
                        Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                        Class21.connectionVector.startPacket(150);
                        Class21.connectionVector.writeLEShort(i_6_ + Class68_Sub13_Sub35.baseY);
                        Class21.connectionVector.writeShortA(i_8_);
                        Class21.connectionVector.writeShort(i_9_ + Class36.baseX);
                    }
                    if (i_7_ == 48)
                    {
                        NPC class1_sub6_sub1 = Class102.localNPCs[i_8_];
                        if (class1_sub6_sub1 != null)
                        {
                            Class114.anInt1935++;
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub1).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub1).walkQueueX[0]));
                            Class26.anInt523 = 0;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            client.anInt2378 = 2;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class21.connectionVector.startPacket(52);
                            Class21.connectionVector.writeLEShortA(i_8_);
                        }
                    }
                    if (i_7_ == 19)
                    {
                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_8_]);
                        if (class1_sub6_sub2 != null)
                        {
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub2).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub2).walkQueueX[0]));
                            client.anInt2378 = 2;
                            Class26.anInt523 = 0;
                            Login.anInt1511++;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class21.connectionVector.startPacket(183);
                            Class21.connectionVector.writeLEShort(i_8_);
                        }
                    }
                    if (i_7_ == 23)
                    {
                        Widget class45 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        boolean bool = true;
                        if (((Widget) class45).anInt808 > 0)
                            bool = Class54.method554(class45, 29905);
                        if (bool)
                        {
                            GameException.anInt2237++;
                            Class21.connectionVector.startPacket(113);
                            Class21.connectionVector.writeDWord(i_6_);
                        }
                    }
                    if (i_7_ == 21)
                    {
                        NPC class1_sub6_sub1 = Class102.localNPCs[i_8_];
                        if (class1_sub6_sub1 != null)
                        {
                            Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub1).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub1).walkQueueX[0]));
                            Class26.anInt523 = 0;
                            Class68_Sub22.anInt3142 = Class68_Sub13_Sub37.anInt4079;
                            Class68_Sub20_Sub3.anInt4203++;
                            client.anInt2378 = 2;
                            Class68_Sub13_Sub21.anInt3789 = Class125.anInt2175;
                            Class21.connectionVector.startPacket(199);
                            Class21.connectionVector.writeLEShort(i_8_);
                        }
                    }
                    if (i_7_ == 18)
                    {
                        Class68_Sub13_Sub21.anInt3787++;
                        Class75_Sub2.method1398(l, i_6_, -12974, i_9_);
                        Class21.connectionVector.startPacket(158);
                        Class21.connectionVector.writeLEShort(Class36.baseX + i_9_);
                        Class21.connectionVector.writeShort(0x7fffffff & (int) (l >>> 32));
                        Class21.connectionVector.writeLEShortA(Class68_Sub13_Sub35.baseY + i_6_);
                    }
                    if (i_7_ == 57 && Class29.aClass45_539 == null)
                    {
                        Class68_Sub13_Sub39.method905(i_9_, i_6_, 327685);
                        Class29.aClass45_539 = Class66.method637(i_6_, false, i_9_);
                        NodeCache.method1688(Class29.aClass45_539, -120);
                    }
                    if (i_7_ == 40)
                    {
                        Class21.connectionVector.startPacket(186);
                        Class68_Sub22.anInt3144++;
                        Class21.connectionVector.writeLEInteger(i_6_);
                        Class21.connectionVector.writeShortA(i_8_);
                        Class21.connectionVector.writeLEShortA(i_9_);
                        Class68_Sub13_Sub24.anInt3835 = 0;
                        Class1_Sub5.aClass45_2517 = Class68_Sub20_Sub15.method1170(i_6_, (byte) -80);
                        Class63.anInt1172 = i_9_;
                    }
                    if (Class68_Sub13_Sub37.anInt4064 != 0)
                    {
                        Class68_Sub13_Sub37.anInt4064 = 0;
                        NodeCache.method1688((Class68_Sub20_Sub15.method1170(Class68_Sub28_Sub2.anInt4555, (byte) -80)), -114);
                    }
                    if (Class21_Sub1.aBoolean2707)
                        Class9.method208((byte) 77);
                    if (Class1_Sub5.aClass45_2517 != null && Class68_Sub13_Sub24.anInt3835 == 0)
                        NodeCache.method1688(Class1_Sub5.aClass45_2517, -128);
                }
            }
        }
    }

    final void method1084(byte i, Stream class68_sub14)
    {
        try
        {
            anInt4272++;
            if (i != 45)
                method1079(-45, -100, 114);
            for (;;)
            {
                int i_13_ = class68_sub14.readUByte();
                if (i_13_ == 0)
                    break;
                method1085(class68_sub14, i_13_, i ^ 0x370a);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("gj.O(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    private final void method1085(Stream class68_sub14, int i, int i_14_)
    {
        try
        {
            anInt4277++;
            if (i_14_ != 14119)
                anIntArrayArray4276 = null;
            if (i == 1)
                aClass100Array4291 = class68_sub14.readString().method1626(0, 60);
            else if (i != 2)
            {
                if (i == 3)
                {
                    int i_15_ = class68_sub14.readUByte();
                    anIntArray4287 = new int[i_15_];
                    anIntArrayArray4276 = new int[i_15_][];
                    for (int i_16_ = 0; i_15_ > i_16_; i_16_++)
                    {
                        int i_17_ = class68_sub14.readUShort();
                        anIntArray4287[i_16_] = i_17_;
                        anIntArrayArray4276[i_16_] = (new int[Class68_Sub13_Sub37.anIntArray4058[i_17_]]);
                        for (int i_18_ = 0; Class68_Sub13_Sub37.anIntArray4058[i_17_] > i_18_; i_18_++)
                            anIntArrayArray4276[i_16_][i_18_] = class68_sub14.readUShort();
                    }
                }
            } else
            {
                int i_19_ = class68_sub14.readUByte();
                ((Class68_Sub20_Sub8) this).anIntArray4279 = new int[i_19_];
                for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
                    ((Class68_Sub20_Sub8) this).anIntArray4279[i_20_] = class68_sub14.readUShort();
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("gj.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ')'));
        }
    }

    static final void method1086(int i, int i_21_)
    {
        anInt4278++;
        if (i == 0)
            Class68_Sub13_Sub28.aClass98_3925.method1570(i ^ ~0x494e, i_21_);
    }

    static final void method1087(int i)
    {
        anInt4289++;
        if (i != 0)
            method1095();
        Class91.aClass98_1638.method1573(-28);
        Class11.aClass98_193.method1573(122);
    }

    final MutableString method1088(int i)
    {
        anInt4290++;
        MutableString class100 = Class21.method339(-18982, 80);
        if (aClass100Array4291 == null)
            return Class68_Sub25.aClass100_3166;
        int i_22_ = 58 % ((-6 - i) / 43);
        class100.method1624(aClass100Array4291[0], 12147);
        for (int i_23_ = 1; i_23_ < aClass100Array4291.length; i_23_++)
        {
            class100.method1624(Class67.aClass100_1206, 12147);
            class100.method1624(aClass100Array4291[i_23_], 12147);
        }
        return class100.trim();
    }

    static final MutableString method1089(int i, boolean bool, int i_24_)
    {
        anInt4273++;
        int i_25_ = i_24_ - i;
        if (i_25_ < -9)
            return Class71_Sub1.aClass100_3258;
        if (i_25_ < -6)
            return RandomNumberGenerator.aClass100_1490;
        if (bool != true)
            return null;
        if (i_25_ < -3)
            return Class68_Sub20_Sub11.aClass100_4336;
        if (i_25_ < 0)
            return RandomNumberGenerator.aClass100_1480;
        if (i_25_ > 9)
            return Class48.aClass100_953;
        if (i_25_ > 6)
            return NodeSubList.aClass100_2223;
        if (i_25_ > 3)
            return Class97.aClass100_1712;
        if (i_25_ > 0)
            return Class103.aClass100_1771;
        return CipheredByteVector.aClass100_4123;
    }

    final void method1090(byte i)
    {
        anInt4285++;
        if (((Class68_Sub20_Sub8) this).anIntArray4279 != null)
        {
            for (int i_26_ = 0; i_26_ < ((Class68_Sub20_Sub8) this).anIntArray4279.length; i_26_++)
                ((Class68_Sub20_Sub8) this).anIntArray4279[i_26_] = Class70.OR((((Class68_Sub20_Sub8) this).anIntArray4279[i_26_]), 32768);
        }
        if (i != 38)
            method1079(120, -71, -4);
    }

    static final void method1091(int i, int i_27_)
    {
        anInt4271++;
        Class68_Sub13_Sub2.aClass98_3461.method1570(-18767, i_27_);
        if (i != 190)
            aClass21_4292 = null;
        Class75_Sub1_Sub1.aClass98_4579.method1570(-18767, i_27_);
    }

    public static void method1092(int i)
    {
        aClass21_4292 = null;
        aClass100_4284 = null;
        if (i != 1)
            aClass21_4292 = null;
        aClass21_4281 = null;
    }

    final MutableString method1093(int i, Stream class68_sub14)
    {
        try
        {
            anInt4275++;
            int i_28_ = -92 / ((33 - i) / 34);
            MutableString class100 = Class21.method339(-18982, 80);
            if (anIntArray4287 != null)
            {
                for (int i_29_ = 0; anIntArray4287.length > i_29_; i_29_++)
                {
                    class100.method1624(aClass100Array4291[i_29_], 12147);
                    class100.method1624((Class68_Sub8.method671(anIntArrayArray4276[i_29_], class68_sub14.readBytes((Class75_Sub3_Sub1.anIntArray4601[anIntArray4287[i_29_]])), -1, anIntArray4287[i_29_])), 12147);
                }
            }
            class100.method1624((aClass100Array4291[aClass100Array4291.length - 1]), 12147);
            return class100.trim();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("gj.F(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static final int method1094(int i, int i_30_)
    {
        if (i_30_ != 654593194)
            aClass21_4281 = null;
        anInt4286++;
        return i >>> 10;
    }

    static final void method1095()
    {
        Class1_Sub7.anInt2599 = 0;
        while_19_: for (int i = 0; i < Class54.anInt1029; i++)
        {
            Class8 class8 = Class121.aClass8Array2104[i];
            if (Class68_Sub13_Sub10.anIntArray3593 != null)
            {
                for (int i_31_ = 0; i_31_ < Class68_Sub13_Sub10.anIntArray3593.length; i_31_++)
                {
                    if (Class68_Sub13_Sub10.anIntArray3593[i_31_] != -1000000 && ((((Class8) class8).anInt152 <= Class68_Sub13_Sub10.anIntArray3593[i_31_]) || (((Class8) class8).anInt150 <= Class68_Sub13_Sub10.anIntArray3593[i_31_])) && ((((Class8) class8).anInt159 <= Animation.anIntArray2044[i_31_]) || (((Class8) class8).anInt162 <= Animation.anIntArray2044[i_31_]))
                            && ((((Class8) class8).anInt159 >= Class68_Sub22.anIntArray3139[i_31_]) || (((Class8) class8).anInt162 >= Class68_Sub22.anIntArray3139[i_31_])) && ((((Class8) class8).anInt148 <= Class68_Sub16.anIntArray3031[i_31_]) || (((Class8) class8).anInt147 <= Class68_Sub16.anIntArray3031[i_31_])) && ((((Class8) class8).anInt148 >= Class53.anIntArray1020[i_31_]) || (((Class8) class8).anInt147 >= Class53.anIntArray1020[i_31_])))
                        continue while_19_;
                }
            }
            if (((Class8) class8).anInt142 == 1)
            {
                int i_32_ = (((Class8) class8).anInt146 - Class68_Sub20_Sub10.anInt4321 + ClientScript.anInt4386);
                if (i_32_ >= 0 && i_32_ <= (ClientScript.anInt4386 + ClientScript.anInt4386))
                {
                    int i_33_ = (((Class8) class8).anInt145 - Class68_Sub26.anInt3188 + ClientScript.anInt4386);
                    if (i_33_ < 0)
                        i_33_ = 0;
                    int i_34_ = (((Class8) class8).anInt156 - Class68_Sub26.anInt3188 + ClientScript.anInt4386);
                    if (i_34_ > (ClientScript.anInt4386 + ClientScript.anInt4386))
                        i_34_ = (ClientScript.anInt4386 + ClientScript.anInt4386);
                    boolean bool = false;
                    while (i_33_ <= i_34_)
                    {
                        if (Class68_Sub9.aBooleanArrayArray2889[i_32_][i_33_++])
                        {
                            bool = true;
                            break;
                        }
                    }
                    if (bool)
                    {
                        int i_35_ = Class25.anInt518 - ((Class8) class8).anInt159;
                        if (i_35_ > 32)
                            ((Class8) class8).anInt141 = 1;
                        else
                        {
                            if (i_35_ >= -32)
                                continue;
                            ((Class8) class8).anInt141 = 2;
                            i_35_ = -i_35_;
                        }
                        ((Class8) class8).anInt138 = ((((Class8) class8).anInt148 - Class68_Sub20_Sub12.anInt4357) << 8) / i_35_;
                        ((Class8) class8).anInt157 = ((((Class8) class8).anInt147 - Class68_Sub20_Sub12.anInt4357) << 8) / i_35_;
                        ((Class8) class8).anInt153 = ((((Class8) class8).anInt152 - Class68_Sub17.anInt3035) << 8) / i_35_;
                        ((Class8) class8).anInt143 = ((((Class8) class8).anInt150 - Class68_Sub17.anInt3035) << 8) / i_35_;
                        Class68_Sub25.aClass8Array3170[Class1_Sub7.anInt2599++] = class8;
                    }
                }
            } else if (((Class8) class8).anInt142 == 2)
            {
                int i_36_ = (((Class8) class8).anInt145 - Class68_Sub26.anInt3188 + ClientScript.anInt4386);
                if (i_36_ >= 0 && i_36_ <= (ClientScript.anInt4386 + ClientScript.anInt4386))
                {
                    int i_37_ = (((Class8) class8).anInt146 - Class68_Sub20_Sub10.anInt4321 + ClientScript.anInt4386);
                    if (i_37_ < 0)
                        i_37_ = 0;
                    int i_38_ = (((Class8) class8).anInt149 - Class68_Sub20_Sub10.anInt4321 + ClientScript.anInt4386);
                    if (i_38_ > (ClientScript.anInt4386 + ClientScript.anInt4386))
                        i_38_ = (ClientScript.anInt4386 + ClientScript.anInt4386);
                    boolean bool = false;
                    while (i_37_ <= i_38_)
                    {
                        if (Class68_Sub9.aBooleanArrayArray2889[i_37_++][i_36_])
                        {
                            bool = true;
                            break;
                        }
                    }
                    if (bool)
                    {
                        int i_39_ = (Class68_Sub20_Sub12.anInt4357 - ((Class8) class8).anInt148);
                        if (i_39_ > 32)
                            ((Class8) class8).anInt141 = 3;
                        else
                        {
                            if (i_39_ >= -32)
                                continue;
                            ((Class8) class8).anInt141 = 4;
                            i_39_ = -i_39_;
                        }
                        ((Class8) class8).anInt139 = (((Class8) class8).anInt159 - Class25.anInt518 << 8) / i_39_;
                        ((Class8) class8).anInt144 = (((Class8) class8).anInt162 - Class25.anInt518 << 8) / i_39_;
                        ((Class8) class8).anInt153 = ((((Class8) class8).anInt152 - Class68_Sub17.anInt3035) << 8) / i_39_;
                        ((Class8) class8).anInt143 = ((((Class8) class8).anInt150 - Class68_Sub17.anInt3035) << 8) / i_39_;
                        Class68_Sub25.aClass8Array3170[Class1_Sub7.anInt2599++] = class8;
                    }
                }
            } else if (((Class8) class8).anInt142 == 4)
            {
                int i_40_ = ((Class8) class8).anInt152 - Class68_Sub17.anInt3035;
                if (i_40_ > 128)
                {
                    int i_41_ = (((Class8) class8).anInt145 - Class68_Sub26.anInt3188 + ClientScript.anInt4386);
                    if (i_41_ < 0)
                        i_41_ = 0;
                    int i_42_ = (((Class8) class8).anInt156 - Class68_Sub26.anInt3188 + ClientScript.anInt4386);
                    if (i_42_ > (ClientScript.anInt4386 + ClientScript.anInt4386))
                        i_42_ = (ClientScript.anInt4386 + ClientScript.anInt4386);
                    if (i_41_ <= i_42_)
                    {
                        int i_43_ = (((Class8) class8).anInt146 - Class68_Sub20_Sub10.anInt4321 + ClientScript.anInt4386);
                        if (i_43_ < 0)
                            i_43_ = 0;
                        int i_44_ = (((Class8) class8).anInt149 - Class68_Sub20_Sub10.anInt4321 + ClientScript.anInt4386);
                        if (i_44_ > (ClientScript.anInt4386 + ClientScript.anInt4386))
                            i_44_ = (ClientScript.anInt4386 + ClientScript.anInt4386);
                        boolean bool = false;
                        while_17_: for (int i_45_ = i_43_; i_45_ <= i_44_; i_45_++)
                        {
                            for (int i_46_ = i_41_; i_46_ <= i_42_; i_46_++)
                            {
                                if (Class68_Sub9.aBooleanArrayArray2889[i_45_][i_46_])
                                {
                                    bool = true;
                                    break while_17_;
                                }
                            }
                        }
                        if (bool)
                        {
                            ((Class8) class8).anInt141 = 5;
                            ((Class8) class8).anInt139 = ((((Class8) class8).anInt159 - Class25.anInt518) << 8) / i_40_;
                            ((Class8) class8).anInt144 = ((((Class8) class8).anInt162 - Class25.anInt518) << 8) / i_40_;
                            ((Class8) class8).anInt138 = ((((Class8) class8).anInt148 - Class68_Sub20_Sub12.anInt4357) << 8) / i_40_;
                            ((Class8) class8).anInt157 = ((((Class8) class8).anInt147 - Class68_Sub20_Sub12.anInt4357) << 8) / i_40_;
                            Class68_Sub25.aClass8Array3170[Class1_Sub7.anInt2599++] = class8;
                        }
                    }
                }
            }
        }
    }

    public Class68_Sub20_Sub8()
    {
        /* empty */
    }
}
