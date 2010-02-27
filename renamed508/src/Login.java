/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Login
{
    static int anInt1499;
    static Login aClass82_1500 = new Login(16);
    static int anInt1501;
    static int anInt1502;
    static int anInt1503;
    static int anInt1504;
    static int anInt1505;
    static int anInt1506;
    static int anInt1507;
    private NodeSub aClass68_Sub20_1508 = new NodeSub();
    static MutableString aClass100_1509;
    static int anInt1510;
    static int anInt1511;
    static int[] anIntArray1512 = new int[2];
    private static MutableString aClass100_1513 = Class112.makeMutableString(43, "World");
    static NodeCache aClass113_1514;
    static MutableString aClass100_1515;
    static int anInt1516;
    static int[] anIntArray1517;
    private int anInt1518;
    private int anInt1519;
    static int anInt1520;
    private NodeCache aClass113_1521;
    private NodeSubList aClass128_1522 = new NodeSubList();
    static MutableString aClass100_1523;
    private static MutableString aClass100_1524;

    // login method xxx
    static final void login(boolean bool)
    {
        anInt1502++;
        if (Class32.anInt574 != 0 && Class32.anInt574 != 5)
        {
            try
            {
                if (++Class68_Sub13_Sub24.anInt3843 > 2000)
                {
                    if (PlayerDefinition.connection != null)
                    {
                        PlayerDefinition.connection.method594(-64);
                        PlayerDefinition.connection = null;
                    }
                    if (GroundData.anInt666 >= 1)
                    {
                        Class68_Sub20_Sub7.anInt4259 = -5;
                        Class32.anInt574 = 0;
                        return;
                    }
                    if (Class115.anInt1948 != Class103.port)
                        Class103.port = Class115.anInt1948;
                    else
                        Class103.port = Class68_Sub15.anInt3015;
                    GroundData.anInt666++;
                    Class32.anInt574 = 1;
                    Class68_Sub13_Sub24.anInt3843 = 0;
                }
                if (bool != false)
                    aClass100_1524 = null;
                if (Class32.anInt574 == 1)
                {
                    Class13_Sub2.aClass31_2659 = (Class75_Sub1_Sub1.signlink.method559(Class68_Sub9.serverAddress, (byte) 116, Class103.port));
                    Class32.anInt574 = 2;
                }
                if (Class32.anInt574 == 2)
                {
                    if (Class13_Sub2.aClass31_2659.anInt555 == 2)
                        throw new IOException();
                    if (Class13_Sub2.aClass31_2659.anInt555 != 1)
                        return;
                    // xxx start here
                    PlayerDefinition.connection = new GameSocket(((Socket) Class13_Sub2.aClass31_2659.playerDefSocket), Class75_Sub1_Sub1.signlink);
                    Class13_Sub2.aClass31_2659 = null;
                    long l = (Class72_Sub1.aLong3287 = Class68_Sub28_Sub2.username.method1615(10908));
                    ((Stream) Class21.connectionVector).position = 0;
                    Class21.connectionVector.writeByte(14);
                    int i = (int) (0x1fL & l >> 16);
                    Class21.connectionVector.writeByte(i);
                    PlayerDefinition.connection.queueBytes(0, (byte) 36, 2, (((Stream) Class21.connectionVector).buffer));
                    if (Class68_Sub13_Sub36.aClass35_4037 != null)
                        Class68_Sub13_Sub36.aClass35_4037.method418(bool);
                    if (Animable.aClass35_66 != null)
                        Animable.aClass35_66.method418(bool);
                    int i_0_ = PlayerDefinition.connection.method593(112);
                    if (Class68_Sub13_Sub36.aClass35_4037 != null)
                        Class68_Sub13_Sub36.aClass35_4037.method418(false);
                    if (Animable.aClass35_66 != null)
                        Animable.aClass35_66.method418(false);
                    if (i_0_ != 0)
                    {
                        Class68_Sub20_Sub7.anInt4259 = i_0_;
                        Class32.anInt574 = 0;
                        PlayerDefinition.connection.method594(-7);
                        PlayerDefinition.connection = null;
                        return;
                    }
                    Class32.anInt574 = 3;
                }
                if (Class32.anInt574 == 3)
                {
                    if (PlayerDefinition.connection.available() < 8)
                        return;
                    PlayerDefinition.connection.read(8, 0, (((Stream) Class68_Sub13_Sub8.connectionVector).buffer));
                    ((Stream) Class68_Sub13_Sub8.connectionVector).position = 0;
                    Class68_Sub13_Sub11.aLong3605 = Class68_Sub13_Sub8.connectionVector.readLong();
                    int[] is = new int[4];
                    is[1] = (int) (9.9999999E7 * Math.random());
                    is[0] = (int) (9.9999999E7 * Math.random());
                    is[2] = (int) (Class68_Sub13_Sub11.aLong3605 >> 32);
                    ((Stream) Class21.connectionVector).position = 0;
                    is[3] = (int) Class68_Sub13_Sub11.aLong3605;
                    Class21.connectionVector.writeByte(10);
                    Class21.connectionVector.writeDWord(is[0]);
                    Class21.connectionVector.writeDWord(is[1]);
                    Class21.connectionVector.writeDWord(is[2]);
                    Class21.connectionVector.writeDWord(is[3]);
                    Class21.connectionVector.writeLong(Class68_Sub28_Sub2.username.method1615(10908));
                    Class21.connectionVector.writeString(Class68_Sub28_Sub2.password);
                    Class21.connectionVector.rsaEncrypt(Class68_Sub4.RSA_ENCRYPT_KEY, Class68_Sub22.RSA_ENCRYPT_MODULUS);
                    ((Stream) Class112.aClass68_Sub14_Sub1_1900).position = 0;
                    if (GameException.anInt2233 == 40)
                        Class112.aClass68_Sub14_Sub1_1900.writeByte(18);
                    else
                        Class112.aClass68_Sub14_Sub1_1900.writeByte(16);
                    Class112.aClass68_Sub14_Sub1_1900.writeShort(((((Stream) Class21.connectionVector).position) + 151 + Class13_Sub1.method250(Class26.aClass100_521, -106)));
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(508);
                    Class112.aClass68_Sub14_Sub1_1900.writeByte(Class68_Sub13_Sub5.anInt3520);
                    Class112.aClass68_Sub14_Sub1_1900.writeByte(0);
                    Class112.aClass68_Sub14_Sub1_1900.writeByte(Class71_Sub1.method1344((byte) 97));
                    Class112.aClass68_Sub14_Sub1_1900.writeShort(Class13_Sub3.appletWidth);
                    Class112.aClass68_Sub14_Sub1_1900.writeShort(Class68_Sub13_Sub9.appletHeight);
                    Class20.method322(24, Class112.aClass68_Sub14_Sub1_1900);
                    Class112.aClass68_Sub14_Sub1_1900.writeString(Class26.aClass100_521);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(Class68_Sub13_Sub20.anInt3782);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(Class34.method415((byte) 119));
                    Class108.aBoolean1832 = true;
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord((((Class21) Class68_Sub28_Sub1.aClass21_Sub1_4521).anInt428));
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class58.aClass21_Sub1_1097).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class68_Sub6.aClass21_Sub1_2845).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord((((Class21) Class68_Sub13_Sub21.aClass21_Sub1_3806).anInt428));
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class78.aClass21_Sub1_1390).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class92.aClass21_Sub1_1646).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class21.aClass21_Sub1_459).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class120.aClass21_Sub1_2097).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class52.aClass21_Sub1_1011).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord((((Class21) Class68_Sub13_Sub30.aClass21_Sub1_3955).anInt428));
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class84.aClass21_Sub1_1534).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class21.aClass21_Sub1_472).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class13.aClass21_Sub1_221).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class63.aClass21_Sub1_1173).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord((((Class21) Class68_Sub20_Sub4.aClass21_Sub1_4219).anInt428));
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class28.aClass21_Sub1_529).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class7.aClass21_Sub1_136).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class33.aClass21_Sub1_583).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Node.aClass21_Sub1_1228).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Animation.aClass21_Sub1_2040).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Object4.aClass21_Sub1_1068).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord((((Class21) Class68_Sub13_Sub31.aClass21_Sub1_3973).anInt428));
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) Class14.aClass21_Sub1_229).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord((((Class21) Class68_Sub20_Sub5.aClass21_Sub1_4223).anInt428));
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord((((Class21) Class68_Sub13_Sub5.aClass21_Sub1_3524).anInt428));
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord(((Class21) GroundData.aClass21_Sub1_659).anInt428);
                    Class112.aClass68_Sub14_Sub1_1900.writeDWord((((Class21) CipheredByteVector.aClass21_Sub1_4135).anInt428));
                    Class112.aClass68_Sub14_Sub1_1900.writeBytes((((Stream) Class21.connectionVector).position), 0, (((Stream) Class21.connectionVector).buffer));
                    PlayerDefinition.connection.queueBytes(0, (byte) 86, (((Stream) Class112.aClass68_Sub14_Sub1_1900).position), (((Stream) Class112.aClass68_Sub14_Sub1_1900).buffer));
                    Class21.connectionVector.seedRNG(is);
                    for (int i = 0; i < 4; i++)
                        is[i] += 50;
                    Class68_Sub13_Sub8.connectionVector.seedRNG(is);
                    Class32.anInt574 = 4;
                }
                if (Class32.anInt574 == 4)
                {
                    if (PlayerDefinition.connection.available() < 1)
                        return;
                    int i = PlayerDefinition.connection.method593(110);
                    if (i == 21)
                        Class32.anInt574 = 7;
                    else if (i != 1)
                    {
                        if (i == 2)
                            Class32.anInt574 = 8;
                        else
                        {
                            if (i != 15)
                            {
                                if (i != 23 || GroundData.anInt666 >= 1)
                                {
                                    Class68_Sub20_Sub7.anInt4259 = i;
                                    Class32.anInt574 = 0;
                                    PlayerDefinition.connection.method594(-41);
                                    PlayerDefinition.connection = null;
                                } else
                                {
                                    Class32.anInt574 = 1;
                                    Class68_Sub13_Sub24.anInt3843 = 0;
                                    GroundData.anInt666++;
                                    PlayerDefinition.connection.method594(-48);
                                    PlayerDefinition.connection = null;
                                }
                            } else
                            {
                                Class68_Sub20_Sub7.anInt4259 = i;
                                Class32.anInt574 = 0;
                                return;
                            }
                            return;
                        }
                    } else
                    {
                        Class32.anInt574 = 5;
                        Class68_Sub20_Sub7.anInt4259 = i;
                        return;
                    }
                }
                if (Class32.anInt574 == 6)
                {
                    ((Stream) Class21.connectionVector).position = 0;
                    Class21.connectionVector.startPacket(17);
                    PlayerDefinition.connection.queueBytes(0, (byte) 87, (((Stream) Class21.connectionVector).position), (((Stream) Class21.connectionVector).buffer));
                    Class32.anInt574 = 4;
                } else if (Class32.anInt574 == 7)
                {
                    if (PlayerDefinition.connection.available() >= 1)
                    {
                        Class36.anInt642 = PlayerDefinition.connection.method593(98) * 60 + 180;
                        Class32.anInt574 = 0;
                        Class68_Sub20_Sub7.anInt4259 = 21;
                        PlayerDefinition.connection.method594(-51);
                        PlayerDefinition.connection = null;
                    }
                } else
                {
                    if (Class32.anInt574 == 8)
                    {
                        if (PlayerDefinition.connection.available() < 11)
                            return;
                        PlayerDefinition.connection.read(11, 0, (((Stream) Class68_Sub13_Sub8.connectionVector).buffer));
                        ((Stream) Class68_Sub13_Sub8.connectionVector).position = 0;
                        Class68_Sub13_Sub13.anInt3665 = Class68_Sub13_Sub8.connectionVector.readUByte();
                        Class8.anInt160 = Class68_Sub13_Sub8.connectionVector.readUByte();
                        Class25.anInt517 = Class68_Sub13_Sub8.connectionVector.readUByte();
                        if (Class25.anInt517 != 1)
                        {
                            try
                            {
                                Class68_Sub20_Sub8.aClass100_4284.method1610((Class75_Sub1_Sub1.signlink.gameApplet), (byte) -123);
                            } catch (Throwable throwable)
                            {
                                /* empty */
                            }
                        } else
                        {
                            try
                            {
                                Class68_Sub4.aClass100_2831.method1610((Class75_Sub1_Sub1.signlink.gameApplet), (byte) -123);
                            } catch (Throwable throwable)
                            {
                                /* empty */
                            }
                        }
                        Class30.anInt552 = Class68_Sub13_Sub8.connectionVector.readUByte();
                        Class68_Sub13_Sub33.aBoolean4002 = Class68_Sub13_Sub8.connectionVector.readUByte() == 1;
                        Class68_Sub10.localPlayerInteractingEntity = Class68_Sub13_Sub8.connectionVector.readUShort();
                        Class26.anInt519 = Class68_Sub13_Sub8.connectionVector.readUByte();
                        Class49.packetOpcode = Class68_Sub13_Sub8.connectionVector.getPacket();
                        Class106.packetSize = Class68_Sub13_Sub8.connectionVector.readUShort();
                        Class32.anInt574 = 9;
                    }
                    if (Class32.anInt574 == 9)
                    {
                        if (PlayerDefinition.connection.available() >= Class106.packetSize)
                        {
                            ((Stream) Class68_Sub13_Sub8.connectionVector).position = 0;
                            PlayerDefinition.connection.read(Class106.packetSize, 0, (((Stream) Class68_Sub13_Sub8.connectionVector).buffer));
                            Class32.anInt574 = 0;
                            Class68_Sub20_Sub7.anInt4259 = 2;
                            Class21.method358(10938);
                            ItemDefinition.anInt365 = -1;
                            Class68_Sub13_Sub15.parseMapData(false);
                            Class49.packetOpcode = -1;
                        }
                    }
                }
            } catch (IOException ioexception)
            {
                if (PlayerDefinition.connection != null)
                {
                    PlayerDefinition.connection.method594(-94);
                    PlayerDefinition.connection = null;
                }
                if (GroundData.anInt666 < 1)
                {
                    Class32.anInt574 = 1;
                    Class68_Sub13_Sub24.anInt3843 = 0;
                    GroundData.anInt666++;
                    if (Class103.port != Class115.anInt1948)
                        Class103.port = Class115.anInt1948;
                    else
                        Class103.port = Class68_Sub15.anInt3015;
                } else
                {
                    Class32.anInt574 = 0;
                    Class68_Sub20_Sub7.anInt4259 = -4;
                }
            }
        }
    }

    static final void method1470(int i, int i_1_)
    {
        anInt1504++;
        Class68_Sub13_Sub8.aClass98_3563.method1570(-18767, i_1_);
        int i_2_ = -47 % ((i - 38) / 47);
    }

    final void method1471(long l, byte i, NodeSub class68_sub20)
    {
        try
        {
            if (anInt1518 != 0)
                anInt1518--;
            else
            {
                NodeSub class68_sub20_3_ = aClass128_1522.method1796(2265);
                class68_sub20_3_.unlink();
                class68_sub20_3_.unlinkSub();
                if (aClass68_Sub20_1508 == class68_sub20_3_)
                {
                    class68_sub20_3_ = aClass128_1522.method1796(2265);
                    class68_sub20_3_.unlink();
                    class68_sub20_3_.unlinkSub();
                }
            }
            anInt1507++;
            aClass113_1521.method1683((byte) 9, class68_sub20, l);
            int i_4_ = -84 % ((43 - i) / 39);
            aClass128_1522.method1793(class68_sub20);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("nj.E(" + l + ',' + i + ',' + (class68_sub20 != null ? "{...}" : "null") + ')'));
        }
    }

    final Node method1472(int i)
    {
        anInt1501++;
        if (i <= 37)
            return null;
        return aClass113_1521.method1689((byte) -122);
    }

    public static void method1473(byte i)
    {
        aClass100_1524 = null;
        aClass100_1515 = null;
        aClass100_1523 = null;
        if (i != 69)
            login(true);
        aClass113_1514 = null;
        anIntArray1512 = null;
        aClass100_1509 = null;
        anIntArray1517 = null;
        aClass100_1513 = null;
        aClass82_1500 = null;
    }

    static final boolean method1474(Class68_Sub28_Sub1 class68_sub28_sub1, Class21 class21, boolean bool, Class21 class21_5_, Class21 class21_6_)
    {
        try
        {
            Class83.aClass21_1531 = class21_6_;
            Class125.aClass21_2172 = class21_5_;
            if (bool != false)
                return true;
            Item.aClass68_Sub28_Sub1_2435 = class68_sub28_sub1;
            anInt1503++;
            Class68_Sub20_Sub8.aClass21_4281 = class21;
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("nj.K(" + (class68_sub28_sub1 != null ? "{...}" : "null") + ',' + (class21 != null ? "{...}" : "null") + ',' + bool + ',' + (class21_5_ != null ? "{...}" : "null") + ',' + (class21_6_ != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1475(int i)
    {
        if (i < 115)
            method1473((byte) -105);
        anInt1506++;
        Class68_Sub13_Sub8.aClass113_3566 = new NodeCache(32);
    }

    final void method1476(byte i)
    {
        anInt1499++;
        aClass128_1522.method1789((byte) -56);
        aClass113_1521.method1690(false);
        aClass68_Sub20_1508 = new NodeSub();
        if (i != -11)
            aClass100_1513 = null;
        anInt1518 = anInt1519;
    }

    static final void method1477(int i, int i_7_)
    {
        int i_8_ = 97 / ((63 - i_7_) / 48);
        anInt1510++;
        CipheredByteVector.aClass98_4120.method1570(-18767, i);
    }

    static final boolean method1478(int i, int i_9_, int i_10_)
    {
        for (int i_11_ = 0; i_11_ < Class1_Sub7.anInt2599; i_11_++)
        {
            Class8 class8 = Class68_Sub25.aClass8Array3170[i_11_];
            if (((Class8) class8).anInt141 == 1)
            {
                int i_12_ = ((Class8) class8).anInt159 - i;
                if (i_12_ > 0)
                {
                    int i_13_ = (((Class8) class8).anInt148 + (((Class8) class8).anInt138 * i_12_ >> 8));
                    int i_14_ = (((Class8) class8).anInt147 + (((Class8) class8).anInt157 * i_12_ >> 8));
                    int i_15_ = (((Class8) class8).anInt152 + (((Class8) class8).anInt153 * i_12_ >> 8));
                    int i_16_ = (((Class8) class8).anInt150 + (((Class8) class8).anInt143 * i_12_ >> 8));
                    if (i_10_ >= i_13_ && i_10_ <= i_14_ && i_9_ >= i_15_ && i_9_ <= i_16_)
                        return true;
                }
            } else if (((Class8) class8).anInt141 == 2)
            {
                int i_17_ = i - ((Class8) class8).anInt159;
                if (i_17_ > 0)
                {
                    int i_18_ = (((Class8) class8).anInt148 + (((Class8) class8).anInt138 * i_17_ >> 8));
                    int i_19_ = (((Class8) class8).anInt147 + (((Class8) class8).anInt157 * i_17_ >> 8));
                    int i_20_ = (((Class8) class8).anInt152 + (((Class8) class8).anInt153 * i_17_ >> 8));
                    int i_21_ = (((Class8) class8).anInt150 + (((Class8) class8).anInt143 * i_17_ >> 8));
                    if (i_10_ >= i_18_ && i_10_ <= i_19_ && i_9_ >= i_20_ && i_9_ <= i_21_)
                        return true;
                }
            } else if (((Class8) class8).anInt141 == 3)
            {
                int i_22_ = ((Class8) class8).anInt148 - i_10_;
                if (i_22_ > 0)
                {
                    int i_23_ = (((Class8) class8).anInt159 + (((Class8) class8).anInt139 * i_22_ >> 8));
                    int i_24_ = (((Class8) class8).anInt162 + (((Class8) class8).anInt144 * i_22_ >> 8));
                    int i_25_ = (((Class8) class8).anInt152 + (((Class8) class8).anInt153 * i_22_ >> 8));
                    int i_26_ = (((Class8) class8).anInt150 + (((Class8) class8).anInt143 * i_22_ >> 8));
                    if (i >= i_23_ && i <= i_24_ && i_9_ >= i_25_ && i_9_ <= i_26_)
                        return true;
                }
            } else if (((Class8) class8).anInt141 == 4)
            {
                int i_27_ = i_10_ - ((Class8) class8).anInt148;
                if (i_27_ > 0)
                {
                    int i_28_ = (((Class8) class8).anInt159 + (((Class8) class8).anInt139 * i_27_ >> 8));
                    int i_29_ = (((Class8) class8).anInt162 + (((Class8) class8).anInt144 * i_27_ >> 8));
                    int i_30_ = (((Class8) class8).anInt152 + (((Class8) class8).anInt153 * i_27_ >> 8));
                    int i_31_ = (((Class8) class8).anInt150 + (((Class8) class8).anInt143 * i_27_ >> 8));
                    if (i >= i_28_ && i <= i_29_ && i_9_ >= i_30_ && i_9_ <= i_31_)
                        return true;
                }
            } else if (((Class8) class8).anInt141 == 5)
            {
                int i_32_ = i_9_ - ((Class8) class8).anInt152;
                if (i_32_ > 0)
                {
                    int i_33_ = (((Class8) class8).anInt159 + (((Class8) class8).anInt139 * i_32_ >> 8));
                    int i_34_ = (((Class8) class8).anInt162 + (((Class8) class8).anInt144 * i_32_ >> 8));
                    int i_35_ = (((Class8) class8).anInt148 + (((Class8) class8).anInt138 * i_32_ >> 8));
                    int i_36_ = (((Class8) class8).anInt147 + (((Class8) class8).anInt157 * i_32_ >> 8));
                    if (i >= i_33_ && i <= i_34_ && i_10_ >= i_35_ && i_10_ <= i_36_)
                        return true;
                }
            }
        }
        return false;
    }

    final NodeSub method1479(long l, byte i)
    {
        if (i != -76)
            aClass68_Sub20_1508 = null;
        NodeSub class68_sub20 = (NodeSub) aClass113_1521.method1684(l, -111);
        anInt1505++;
        if (class68_sub20 != null)
            aClass128_1522.method1793(class68_sub20);
        return class68_sub20;
    }

    final Node method1480(int i)
    {
        anInt1520++;
        if (i != 0)
            aClass100_1509 = null;
        return aClass113_1521.method1685(-32642);
    }

    Login(int i)
    {
        anInt1518 = i;
        anInt1519 = i;
        int i_37_;
        for (i_37_ = 1; i_37_ + i_37_ < i; i_37_ += i_37_)
        {
            /* empty */
        }
        aClass113_1521 = new NodeCache(i_37_);
    }

    static
    {
        aClass100_1509 = aClass100_1513;
        aClass100_1515 = Class112.makeMutableString(43, "Hidden)2");
        anIntArray1517 = new int[50];
        aClass113_1514 = new NodeCache(8);
        aClass100_1524 = Class112.makeMutableString(43, "Loaded config");
        aClass100_1523 = aClass100_1524;
    }
}
