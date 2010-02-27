/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Class49
{
    static int packetOpcode = 0;
    static MutableString aClass100_963 = Class112.makeMutableString(43, "document)3cookie=(R");
    int anInt964;
    static int anInt965;
    static Interface4 anInterface4_966;
    private byte aByte967;
    int anInt968;
    static int menuX;
    static byte[][][] aByteArrayArrayArray970;
    static int anInt971;
    int anInt972;
    static int anInt973;
    static int anInt974;
    int anInt975;
    static int anInt976;
    int anInt977;

    public static void method521(boolean bool)
    {
        if (bool != true)
            anInterface4_966 = null;
        aByteArrayArrayArray970 = null;
        aClass100_963 = null;
        anInterface4_966 = null;
    }

    final int method522(int i)
    {
        if (i != 7)
            return -110;
        anInt971++;
        return 0x7 & aByte967;
    }

    final int method523(int i)
    {
        anInt974++;
        if (i != 8)
            return 97;
        if ((aByte967 & 0x8) != 8)
            return 0;
        return 1;
    }

    static final void method524(int i)
    {
        anInt965++;
        if (Animable.aClass35_66 != null)
            Animable.aClass35_66.method430((byte) 94);
        if (i == 16322)
        {
            if (Class68_Sub13_Sub36.aClass35_4037 != null)
                Class68_Sub13_Sub36.aClass35_4037.method430((byte) 119);
        }
    }

    static final void method525(byte i)
    {
        anInt976++;
        if (Class68_Sub13_Sub27.anInt3916 != 0)
        {
            try
            {
                if (++Object1.anInt1190 > 2000)
                {
                    if (PlayerDefinition.connection != null)
                    {
                        PlayerDefinition.connection.method594(-47);
                        PlayerDefinition.connection = null;
                    }
                    if (Class88.anInt1604 >= 1)
                    {
                        Class50.anInt980 = -5;
                        Class68_Sub13_Sub27.anInt3916 = 0;
                        return;
                    }
                    Class68_Sub13_Sub27.anInt3916 = 1;
                    if (Class103.port == Class115.anInt1948)
                        Class103.port = Class68_Sub15.anInt3015;
                    else
                        Class103.port = Class115.anInt1948;
                    Object1.anInt1190 = 0;
                    Class88.anInt1604++;
                }
                if (Class68_Sub13_Sub27.anInt3916 == 1)
                {
                    Class13_Sub2.aClass31_2659 = (Class75_Sub1_Sub1.signlink.method559(Class68_Sub9.serverAddress, (byte) 113, Class103.port));
                    Class68_Sub13_Sub27.anInt3916 = 2;
                }
                if (Class68_Sub13_Sub27.anInt3916 == 2)
                {
                    if (Class13_Sub2.aClass31_2659.anInt555 == 2)
                        throw new IOException();
                    if (Class13_Sub2.aClass31_2659.anInt555 != 1)
                        return;
                    PlayerDefinition.connection = new GameSocket(((Socket) Class13_Sub2.aClass31_2659.playerDefSocket), Class75_Sub1_Sub1.signlink);
                    Class13_Sub2.aClass31_2659 = null;
                    PlayerDefinition.connection.queueBytes(0, (byte) 78, (((Stream) Class21.connectionVector).position), (((Stream) Class21.connectionVector).buffer));
                    if (Class68_Sub13_Sub36.aClass35_4037 != null)
                        Class68_Sub13_Sub36.aClass35_4037.method418(false);
                    if (Animable.aClass35_66 != null)
                        Animable.aClass35_66.method418(false);
                    int i_0_ = PlayerDefinition.connection.method593(55);
                    if (Class68_Sub13_Sub36.aClass35_4037 != null)
                        Class68_Sub13_Sub36.aClass35_4037.method418(false);
                    if (Animable.aClass35_66 != null)
                        Animable.aClass35_66.method418(false);
                    if (i_0_ != 21)
                    {
                        Class68_Sub13_Sub27.anInt3916 = 0;
                        Class50.anInt980 = i_0_;
                        PlayerDefinition.connection.method594(-89);
                        PlayerDefinition.connection = null;
                        return;
                    }
                    Class68_Sub13_Sub27.anInt3916 = 3;
                }
                if (i < 5)
                    method524(110);
                if (Class68_Sub13_Sub27.anInt3916 == 3)
                {
                    if (PlayerDefinition.connection.available() < 1)
                        return;
                    Class68_Sub8.aClass100Array2874 = new MutableString[PlayerDefinition.connection.method593(114)];
                    Class68_Sub13_Sub27.anInt3916 = 4;
                }
                if (Class68_Sub13_Sub27.anInt3916 == 4)
                {
                    if (PlayerDefinition.connection.available() >= Class68_Sub8.aClass100Array2874.length * 8)
                    {
                        ((Stream) Class68_Sub13_Sub8.connectionVector).position = 0;
                        PlayerDefinition.connection.read(8 * Class68_Sub8.aClass100Array2874.length, 0, (((Stream) Class68_Sub13_Sub8.connectionVector).buffer));
                        for (int i_1_ = 0; i_1_ < Class68_Sub8.aClass100Array2874.length; i_1_++)
                            Class68_Sub8.aClass100Array2874[i_1_] = (Class56.method570(Class68_Sub13_Sub8.connectionVector.readLong(), -1));
                        Class50.anInt980 = 21;
                        Class68_Sub13_Sub27.anInt3916 = 0;
                        PlayerDefinition.connection.method594(-25);
                        PlayerDefinition.connection = null;
                    }
                }
            } catch (IOException ioexception)
            {
                if (PlayerDefinition.connection != null)
                {
                    PlayerDefinition.connection.method594(-119);
                    PlayerDefinition.connection = null;
                }
                if (Class88.anInt1604 >= 1)
                {
                    Class50.anInt980 = -4;
                    Class68_Sub13_Sub27.anInt3916 = 0;
                } else
                {
                    if (Class103.port != Class115.anInt1948)
                        Class103.port = Class115.anInt1948;
                    else
                        Class103.port = Class68_Sub15.anInt3015;
                    Class68_Sub13_Sub27.anInt3916 = 1;
                    Class88.anInt1604++;
                    Object1.anInt1190 = 0;
                }
            }
        }
    }

    static final void method526(boolean bool, boolean bool_2_)
    {
        anInt973++;
        byte[][] is = Class23.aByteArrayArray490;
        int i = 4;
        int i_3_ = is.length;
        for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
        {
            int i_5_ = (Class119.mapDataAreas[i_4_] >> 8) * 64 - Class36.baseX;
            int i_6_ = ((Class119.mapDataAreas[i_4_] & 0xff) * 64 - Class68_Sub13_Sub35.baseY);
            byte[] is_7_ = is[i_4_];
            if (is_7_ != null)
            {
                method524(16322);
                Animable.method62(i_6_, is_7_, i_5_, bool, -4, 8 * (Class43.anInt732 - 6), ItemDefinition.anInt365 * 8 - 48, Class109.groundDataArray);
            }
        }
        int i_8_ = 0;
        if (bool_2_ != false)
            aByteArrayArrayArray970 = null;
        for (/**/; i_8_ < i_3_; i_8_++)
        {
            int i_9_ = (64 * (0xff & Class119.mapDataAreas[i_8_]) - Class68_Sub13_Sub35.baseY);
            byte[] is_10_ = is[i_8_];
            int i_11_ = 64 * (Class119.mapDataAreas[i_8_] >> 8) - Class36.baseX;
            if (is_10_ == null && Class43.anInt732 < 800)
            {
                method524(16322);
                for (int i_12_ = 0; i > i_12_; i_12_++)
                    Class68_Sub13_Sub37.method893(64, -73, 64, i_12_, i_9_, i_11_);
            }
        }
    }

    public Class49()
    {
        /* empty */
    }

    Class49(Stream class68_sub14)
    {
        try
        {
            aByte967 = class68_sub14.readByte();
            ((Class49) this).anInt964 = class68_sub14.readUShort();
            ((Class49) this).anInt977 = class68_sub14.readInteger();
            ((Class49) this).anInt968 = class68_sub14.readInteger();
            ((Class49) this).anInt972 = class68_sub14.readInteger();
            ((Class49) this).anInt975 = class68_sub14.readInteger();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "hf.<init>(" + (class68_sub14 != null ? "{...}" : "null") + ')');
        }
    }
}
