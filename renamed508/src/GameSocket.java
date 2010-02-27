/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class GameSocket implements Runnable
{
    private boolean error = false;
    static int anInt1119;
    static int anInt1120;
    private Class31 aClass31_1121;
    static int anInt1122;
    private Socket sock;
    private int readPointer = 0;
    static int anInt1125;
    static int anInt1126;
    private InputStream in;
    static int[] skillExperiencesMax = new int[99];
    static int anInt1129;
    private OutputStream out;
    private Signlink signlink;
    private boolean closed = false;
    static int anInt1133;
    private int writePointer = 0;
    static int anInt1135;
    static int anInt1136;
    static int anInt1137;
    static int anInt1138;
    static MutableString[] aClass100Array1139;
    static int anInt1140;
    static MutableString aClass100_1141;
    static boolean[] validWidgets;
    static long aLong1143;
    static Class68_Sub20_Sub10 minimapSprite;
    private byte[] buffer;
    static MutableString aClass100_1146;
    static MutableString aClass100_1147;
    static MutableString aClass100_1148;
    static int plane;
    static int anInt1150;

    protected final void finalize()
    {
        method594(-120);
        anInt1120++;
    }

    final void queueBytes(int i, byte i_0_, int i_1_, byte[] is) throws IOException
    {
        try
        {
            if (!closed)
            {
                if (error)
                {
                    error = false;
                    throw new IOException();
                }
                if (i_0_ >= 23)
                {
                    if (buffer == null)
                        buffer = new byte[5000];
                    synchronized (this)
                    {
                        for (int idx = 0; idx < i_1_; idx++)
                        {
                            buffer[writePointer] = is[idx + i];
                            writePointer = (writePointer + 1) % 5000;
                            if ((readPointer + 4900) % 5000 == writePointer)
                                throw new IOException();
                        }
                        if (aClass31_1121 == null)
                            aClass31_1121 = signlink.method558((byte) -89, 3, this);
                        this.notifyAll();
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("jk.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    public final void run()
    {
        try
        {
            for (;;)
            {
                int off;
                int len;
                synchronized (this)
                {
                    if (readPointer == writePointer)
                    {
                        if (closed)
                            break;
                        try
                        {
                            this.wait();
                        } catch (InterruptedException interruptedexception)
                        {
                            /* empty */
                        }
                    }
                    off = readPointer;
                    if (writePointer < readPointer)
                        len = 5000 - readPointer;
                    else
                        len = writePointer - readPointer;
                }
                if (len > 0)
                {
                    try
                    {
                        out.write(buffer, off, len);
                    } catch (IOException ioexception)
                    {
                        error = true;
                    }
                    readPointer = (len + readPointer) % 5000;
                    try
                    {
                        if (writePointer == readPointer)
                            out.flush();
                    } catch (IOException ioexception)
                    {
                        error = true;
                    }
                }
            }
            try
            {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
                if (sock != null)
                    sock.close();
            } catch (IOException ioexception)
            {
                /* empty */
            }
            buffer = null;
        } catch (Exception exception)
        {
            Class71.method1339(null, exception, 38);
        }
    }

    final void read(int length, int offset, byte[] data) throws IOException
    {
        try
        {
            if (!closed)
            {
                while (length > 0)
                {
                    int read = in.read(data, offset, length);
                    if (read <= 0)
                        throw new EOFException();
                    length -= read;
                    offset += read;
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("jk.J(" + length + ',' + offset + ',' + (data != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method592(int i, Class21 class21)
    {
        try
        {
            anInt1133++;
            Class104.aClass92_Sub1Array1781 = Class13_Sub2.method256(class21, NodeSub.anInt3091, 0, -122);
            Class112.aClass92_Sub1Array1888 = new Class92_Sub1[Class104.aClass92_Sub1Array1781.length];
            Class68_Sub13_Sub19.aClass92_Sub1Array3747 = new Class92_Sub1[Class104.aClass92_Sub1Array1781.length];
            Class68_Sub20_Sub17.aClass92_Sub1Array4433 = new Class92_Sub1[Class104.aClass92_Sub1Array1781.length];
            for (int i_8_ = 0; Class104.aClass92_Sub1Array1781.length > i_8_; i_8_++)
            {
                Class104.aClass92_Sub1Array1781[i_8_].method1538();
                Class112.aClass92_Sub1Array1888[i_8_] = Class104.aClass92_Sub1Array1781[i_8_].method1541();
                Class104.aClass92_Sub1Array1781[i_8_].method1538();
                Class68_Sub13_Sub19.aClass92_Sub1Array3747[i_8_] = Class104.aClass92_Sub1Array1781[i_8_].method1541();
                Class104.aClass92_Sub1Array1781[i_8_].method1538();
                Class68_Sub20_Sub17.aClass92_Sub1Array4433[i_8_] = Class104.aClass92_Sub1Array1781[i_8_].method1541();
                Class104.aClass92_Sub1Array1781[i_8_].method1538();
            }
            Stream.aClass68_Sub20_Sub10_Sub1Array3008 = RandomNumberGenerator.method1467(false, Class68_Sub26.anInt3184, 0, class21);
            Class68_Sub13_Sub23.aClass68_Sub20_Sub10Array3823 = Class127.method1786(0, Class51.anInt2261, 0, class21);
            Class68_Sub16.aClass68_Sub20_Sub10Array3032 = Class127.method1786(0, Class17.anInt280, 0, class21);
            Class59.aClass68_Sub20_Sub10Array1106 = Class127.method1786(i - 12339, Class68_Sub13_Sub16.anInt3697, 0, class21);
            Class108.aClass68_Sub20_Sub10Array1830 = Class127.method1786(0, NodeCache.anInt1904, 0, class21);
            Class68_Sub13_Sub12.aClass68_Sub20_Sub10Array3648 = Class68_Sub13_Sub16.method775(class21, 0, Class1_Sub5.anInt2502, (byte) 13);
            Class70.aClass68_Sub20_Sub10Array1286 = Class68_Sub13_Sub16.method775(class21, 0, Class68_Sub8.anInt2878, (byte) 13);
            Class68_Sub20_Sub17.aClass68_Sub20_Sub10_4442 = Class119.method1742(i - 12275, GameApplet.anInt16, 0, class21);
            Class75_Sub2.aClass68_Sub20_Sub10Array3312 = Class68_Sub13_Sub16.method775(class21, 0, Class68_Sub13_Sub38.anInt4084, (byte) 13);
            Class112.minimapDots = Class68_Sub13_Sub16.method775(class21, 0, Class68_Sub13_Sub27.anInt3893, (byte) 13);
            Class68_Sub13_Sub23.aClass92Array3827 = Class13_Sub1.method248(class21, 0, false, ClientScript.anInt4380);
            if (i == 12339)
            {
                Stream.aClass92Array3012 = Class13_Sub1.method248(class21, 0, false, Class15.anInt252);
                Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3803.method1017(Stream.aClass92Array3012, null);
                Class68_Sub6.aClass68_Sub20_Sub1_2849.method1017(Stream.aClass92Array3012, null);
                Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1017(Stream.aClass92Array3012, null);
                Sprite class68_sub20_sub10_sub1 = Class68_Sub22.method1202(Class97.anInt1714, (byte) -96, class21, 0);
                class68_sub20_sub10_sub1.method1129();
                ObjectDefinition.aClass68_Sub20_Sub10_2021 = class68_sub20_sub10_sub1;
                Sprite[] class68_sub20_sub10_sub1s = RandomNumberGenerator.method1467(false, Class97.anInt1708, 0, class21);
                for (int i_9_ = 0; class68_sub20_sub10_sub1s.length > i_9_; i_9_++)
                    class68_sub20_sub10_sub1s[i_9_].method1129();
                Class88.aClass68_Sub20_Sub10Array1610 = class68_sub20_sub10_sub1s;
                int i_10_ = (int) (21.0 * Math.random()) - 10;
                int i_11_ = (int) (21.0 * Math.random()) - 10;
                int i_12_ = (int) (Math.random() * 21.0) - 10;
                int i_13_ = (int) (41.0 * Math.random()) - 20;
                for (int i_14_ = 0; (Stream.aClass68_Sub20_Sub10_Sub1Array3008.length > i_14_); i_14_++)
                    Stream.aClass68_Sub20_Sub10_Sub1Array3008[i_14_].method1130(i_10_ + i_13_, i_11_ + i_13_, i_13_ + i_12_);
                Class104.aClass92_Sub1Array1781[0].method1539(i_10_ + i_13_, i_13_ + i_11_, i_12_ + i_13_);
                Class68_Sub13_Sub11.mapMarkers = Stream.aClass68_Sub20_Sub10_Sub1Array3008;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("jk.A(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    final int method593(int i) throws IOException
    {
        anInt1125++;
        if (closed)
            return 0;
        if (i <= 38)
            return 120;
        return in.read();
    }

    final void method594(int i)
    {
        anInt1137++;
        if (i > -2)
            aClass100_1146 = null;
        if (!closed)
        {
            synchronized (this)
            {
                closed = true;
                this.notifyAll();
            }
            if (aClass31_1121 != null)
            {
                while (aClass31_1121.anInt555 == 0)
                    Class50.method528(-5, 1L);
                if (aClass31_1121.anInt555 == 1)
                {
                    try
                    {
                        ((Thread) aClass31_1121.playerDefSocket).join();
                    } catch (InterruptedException interruptedexception)
                    {
                        /* empty */
                    }
                }
            }
            aClass31_1121 = null;
        }
    }

    static final void method595(int i, int i_15_, int i_16_, int i_17_, int i_18_)
    {
        if (i == -6)
        {
            if (i_18_ <= i_16_)
            {
                for (int i_19_ = i_18_; i_16_ > i_19_; i_19_++)
                    Class68_Sub22.anIntArrayArray3134[i_19_][i_15_] = i_17_;
            } else
            {
                for (int i_20_ = i_16_; i_18_ > i_20_; i_20_++)
                    Class68_Sub22.anIntArrayArray3134[i_20_][i_15_] = i_17_;
            }
            anInt1119++;
        }
    }

    static final void method596(int i)
    {
        anInt1126++;
        Class48.method519((byte) -120);
        Class68_Sub16.method985((byte) -79);
        Class68_Sub13_Sub12.method756(true);
        Class72.method1352(i ^ ~0x38);
        Class87.method1495(76);
        Object3.method513((byte) 124);
        Class68_Sub20_Sub8.method1087(i);
        Animable.method55(i ^ ~0x1e87);
        Class4.method188(i - 26678);
        Class68_Sub28_Sub2.method1269(i + 5698);
        Class21_Sub1.method366(127);
        Class68_Sub13_Sub10.method743(7);
        Class97.method1567(122);
        Class68_Sub15.method980(i ^ 0x23);
        Class108.aClass98_1829.method1573(i + 127);
    }

    final int available() throws IOException
    {
        if (closed)
            return 0;
        return in.available();
    }

    static final void method598(int i)
    {
        boolean bool = true;
        anInt1135++;
        Class13_Sub1.method254(-12915, false);
        Class68_Sub13_Sub19.anInt3750 = 0;
        for (int i_21_ = 0; i_21_ < Class23.aByteArrayArray490.length; i_21_++)
        {
            if (Class96.mapDataAreaIndices[i_21_] != -1 && Class23.aByteArrayArray490[i_21_] == null)
            {
                Class23.aByteArrayArray490[i_21_] = Class92.aClass21_Sub1_1646.method338(0, 0, Class96.mapDataAreaIndices[i_21_]);
                if (Class23.aByteArrayArray490[i_21_] == null)
                {
                    Class68_Sub13_Sub19.anInt3750++;
                    bool = false;
                }
            }
            if (Class68_Sub13_Sub29.mapDataLandIndices[i_21_] != -1 && Class68_Sub20_Sub11.aByteArrayArray4334[i_21_] == null)
            {
                Class68_Sub20_Sub11.aByteArrayArray4334[i_21_] = (Class92.aClass21_Sub1_1646.method350(Class68_Sub20_Sub6.mapData[i_21_], Class68_Sub13_Sub29.mapDataLandIndices[i_21_], 0, (byte) -28));
                if (Class68_Sub20_Sub11.aByteArrayArray4334[i_21_] == null)
                {
                    bool = false;
                    Class68_Sub13_Sub19.anInt3750++;
                }
            }
            if (NPCDefinition.anIntArray1408 != null && Class7.aByteArrayArray133[i_21_] == null && NPCDefinition.anIntArray1408[i_21_] != -1)
            {
                Class7.aByteArrayArray133[i_21_] = (Class92.aClass21_Sub1_1646.method350(Class68_Sub20_Sub6.mapData[i_21_], NPCDefinition.anIntArray1408[i_21_], 0, (byte) 115));
                if (Class7.aByteArrayArray133[i_21_] == null)
                {
                    bool = false;
                    Class68_Sub13_Sub19.anInt3750++;
                }
            }
        }
        if (Class97.aClass68_Sub20_Sub16_1704 == null || !(Class68_Sub20_Sub5.aClass21_Sub1_4223.method347((byte) -101, (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { (((Class68_Sub20_Sub16) Class97.aClass68_Sub20_Sub16_1704).aClass100_4414), Class71.aClass100_1296 })))))
            Class68_Sub13_Sub21.aClass91_3790 = null;
        else if (!Class68_Sub20_Sub5.aClass21_Sub1_4223.method354(0, (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { (((Class68_Sub20_Sub16) Class97.aClass68_Sub20_Sub16_1704).aClass100_4414), Class71.aClass100_1296 }))))
        {
            Class68_Sub13_Sub19.anInt3750++;
            bool = false;
        } else
            Class68_Sub13_Sub21.aClass91_3790 = Class90.method1516((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (((Class68_Sub20_Sub16) Class97.aClass68_Sub20_Sub16_1704).aClass100_4414), Class71.aClass100_1296 }))), 12666, Class68_Sub20_Sub5.aClass21_Sub1_4223);
        if (!bool)
            Class21.anInt480 = 1;
        else
        {
            Widget.anInt925 = 0;
            bool = true;
            for (int i_22_ = 0; Class23.aByteArrayArray490.length > i_22_; i_22_++)
            {
                byte[] is = Class68_Sub20_Sub11.aByteArrayArray4334[i_22_];
                if (is != null)
                {
                    int i_23_ = ((Class119.mapDataAreas[i_22_] >> 8) * 64 - Class36.baseX);
                    int i_24_ = ((0xff & Class119.mapDataAreas[i_22_]) * 64 - Class68_Sub13_Sub35.baseY);
                    if (Class36.aBoolean640)
                    {
                        i_23_ = 10;
                        i_24_ = 10;
                    }
                    bool &= Class111.method1667(is, -32692, i_24_, i_23_);
                }
            }
            if (!bool)
                Class21.anInt480 = 2;
            else
            {
                if (Class21.anInt480 != 0)
                    Class74.method1381(true, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub19.aClass100_3744, Class101.aClass100_1745 }))), -16678);
                if (i < 78)
                    method595(113, 66, -49, 57, 30);
                Class49.method524(16322);
                CipheredByteVector.method971(137);
                Class68_Sub13_Sub4.method716();
                for (int i_25_ = 0; i_25_ < 4; i_25_++)
                    Class109.groundDataArray[i_25_].method444(false);
                for (int i_26_ = 0; i_26_ < 4; i_26_++)
                {
                    for (int i_27_ = 0; i_27_ < 104; i_27_++)
                    {
                        for (int i_28_ = 0; i_28_ < 104; i_28_++)
                            Object1.byteGroundArray[i_26_][i_27_][i_28_] = (byte) 0;
                    }
                }
                Class68_Sub13_Sub1.method702(0, false);
                Class49.method524(16322);
                System.gc();
                Class13_Sub1.method254(-12915, true);
                NodeList.method282(false, -1261);
                if (!Class36.aBoolean640)
                {
                    Class49.method526(false, false);
                    Class13_Sub1.method254(-12915, true);
                    Class68_Sub7.method670(false, (byte) 84);
                    if (Class7.aByteArrayArray133 != null)
                        Class87.method1497((byte) -110);
                }
                if (Class36.aBoolean640)
                {
                    Node.method645(false, (byte) -32);
                    Class13_Sub1.method254(-12915, true);
                    Class68_Sub13_Sub33.method865((byte) -124, false);
                }
                CipheredByteVector.method971(137);
                Class13_Sub1.method254(-12915, true);
                Class114.method1696((byte) -111, false, Class109.groundDataArray);
                Class13_Sub1.method254(-12915, true);
                int i_29_ = Class68_Sub25.anInt3176;
                if (plane < i_29_)
                    i_29_ = plane;
                if (plane - 1 > i_29_)
                    i_29_ = plane - 1;
                if (!Class28.method398(24781))
                    Class1_Sub5.method138(Class68_Sub25.anInt3176);
                else
                    Class1_Sub5.method138(0);
                Keyboard.method1755(108);
                for (int i_30_ = 0; i_30_ < 104; i_30_++)
                {
                    for (int i_31_ = 0; i_31_ < 104; i_31_++)
                        Class68_Sub20_Sub9.method1100(i_30_, (byte) -52, i_31_);
                }
                Class107.method1660(-13401);
                Class49.method524(16322);
                Class34.method414(-28968);
                CipheredByteVector.method971(137);
                if (Class108.gameFrame != null && PlayerDefinition.connection != null && GameException.anInt2233 == 25)
                {
                    Class21.connectionVector.startPacket(22);
                    Class21.connectionVector.writeDWord(1057001181);
                    Class68_Sub13_Sub39.anInt4109++;
                }
                if (!Class36.aBoolean640)
                {
                    int i_32_ = (ItemDefinition.anInt365 - 6) / 8;
                    int i_33_ = (Class43.anInt732 - 6) / 8;
                    int i_34_ = (ItemDefinition.anInt365 + 6) / 8;
                    int i_35_ = (Class43.anInt732 + 6) / 8;
                    for (int i_36_ = i_32_ - 1; i_36_ <= i_34_ + 1; i_36_++)
                    {
                        for (int i_37_ = i_33_ - 1; i_37_ <= i_35_ + 1; i_37_++)
                        {
                            if (i_32_ > i_36_ || i_36_ > i_34_ || i_33_ > i_37_ || i_35_ < i_37_)
                            {
                                Class92.aClass21_Sub1_1646.method330((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class83.aClass100_1527, Class68_Sub13_Sub24.method816(i_36_, 0), Class68_Sub20_Sub5.aClass100_4225, Class68_Sub13_Sub24.method816(i_37_, 0) }))), 118);
                                Class92.aClass21_Sub1_1646.method330((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub20_Sub16.aClass100_4426, Class68_Sub13_Sub24.method816(i_36_, 0), Class68_Sub20_Sub5.aClass100_4225, Class68_Sub13_Sub24.method816(i_37_, 0) }))), 114);
                            }
                        }
                    }
                }
                if (GameException.anInt2233 != 28)
                {
                    Class17.method296(30, (byte) -77);
                    if (PlayerDefinition.connection != null)
                        Class21.connectionVector.startPacket(60);
                } else
                    Class17.method296(10, (byte) -128);
                Class49.method524(16322);
                Class20.method327((byte) 105);
            }
        }
    }

    public static void method599(byte i)
    {
        skillExperiencesMax = null;
        aClass100_1141 = null;
        int i_38_ = -22 / ((i + 68) / 46);
        validWidgets = null;
        aClass100_1147 = null;
        aClass100_1148 = null;
        aClass100_1146 = null;
        minimapSprite = null;
        aClass100Array1139 = null;
    }

    GameSocket(Socket socket, Signlink class55) throws IOException
    {
        try
        {
            signlink = class55;
            sock = socket;
            sock.setSoTimeout(30000);
            sock.setTcpNoDelay(true);
            in = sock.getInputStream();
            out = sock.getOutputStream();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("jk.<init>(" + (socket != null ? "{...}" : "null") + ',' + (class55 != null ? "{...}" : "null") + ')'));
        }
    }

    static
    {
        int i = 0;
        for (int i_39_ = 0; i_39_ < 99; i_39_++)
        {
            int i_40_ = i_39_ + 1;
            int i_41_ = (int) (Math.pow(2.0, (double) i_40_ / 7.0) * 300.0 + (double) i_40_);
            i += i_41_;
            skillExperiencesMax[i_39_] = i / 4;
        }
        anInt1138 = 0;
        aClass100_1141 = Class112.makeMutableString(43, "::tele ");
        aClass100_1146 = Class112.makeMutableString(43, " )2> <col=ffff00>");
        aClass100_1147 = Class112.makeMutableString(43, ")1j");
        aClass100Array1139 = new MutableString[100];
        aClass100_1148 = Class112.makeMutableString(43, "");
    }
}
