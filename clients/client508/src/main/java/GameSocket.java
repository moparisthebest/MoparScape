/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class GameSocket implements Runnable {

    public boolean hasIOError = false;
    public static int anInt1119;
    public static int anInt1120;
    public JagSocket aClass31_1121;
    public static int anInt1122;
    public Socket socket;
    public int anInt1124 = 0;
    public static int anInt1125;
    public static int anInt1126;
    public InputStream inputStream;
    public static int[] anIntArray1128 = new int[99];
    public static int anInt1129;
    public OutputStream outputStream;
    public SignLink aSignLink_1131;
    public boolean closed = false;
    public static int anInt1133;
    public int buffIndex = 0;
    public static int anInt1135;
    public static int anInt1136;
    public static int anInt1137;
    public static int anInt1138;
    public static RSString[] aRSStringArray1139;
    public static int anInt1140;
    public static RSString aRSString_1141;
    public static boolean[] aBooleanArray1142;
    public static long aLong1143;
    public static Class68_Sub20_Sub10 aClass68_Sub20_Sub10_1144;
    public byte[] buffer;
    public static RSString aRSString_1146;
    public static RSString aRSString_1147;
    public static RSString aRSString_1148;
    public static int anInt1149;
    public static int anInt1150;

    public void finalize() {
        method594(-120);
        anInt1120++;
    }

    public void queueBytes(int i, byte[] is)
            throws IOException {
        anInt1150++;
        if (!closed) {
            if (hasIOError) {
                hasIOError = false;
                throw new IOException("Error in writer thread");
            }
            if (buffer == null) {
                buffer = new byte[5000];
            }
            synchronized (this) {
                for (int i_2_ = 0;
                     (i_2_ ^ 0xffffffff) > (i ^ 0xffffffff); i_2_++) {
                    buffer[buffIndex] = is[i_2_];
                    buffIndex = (1 + buffIndex) % 5000;
                    if (((anInt1124 - -4900) % 5000 ^ 0xffffffff) == (buffIndex ^ 0xffffffff)) {
                        throw new IOException("buffer overflow");
                    }
                }
                if (aClass31_1121 == null) {
                    aClass31_1121 = aSignLink_1131.method558((byte) -89, 3, this);
                }
                this.notifyAll();
            }
        }
    }

    public void run() {
        try {
            for (; ; ) {
                int i;
                int i_3_;
                synchronized (this) {
                    if (anInt1124 == buffIndex) {
                        if (closed) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException interruptedexception) {
                            /* empty */
                        }
                    }
                    i = anInt1124;
                    if ((buffIndex ^ 0xffffffff) > (anInt1124 ^ 0xffffffff)) {
                        i_3_ = -anInt1124 + 5000;
                    } else {
                        i_3_ = -anInt1124 + buffIndex;
                    }
                }
                if ((i_3_ ^ 0xffffffff) < -1) {
                    try {
                        outputStream.write(buffer, i, i_3_);
                    } catch (IOException ioexception) {
                        hasIOError = true;
                    }
                    anInt1124 = (i_3_ + anInt1124) % 5000;
                    try {
                        if (buffIndex == anInt1124) {
                            outputStream.flush();
                        }
                    } catch (IOException ioexception) {
                        hasIOError = true;
                    }
                }
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException ioexception) {
                /* empty */
            }
            buffer = null;
        } catch (Exception exception) {
            Class71.method1339(null, exception, 38);
        }
        anInt1122++;
    }

    public void flushInputStream(int j, byte[] is)
            throws IOException {
        flushInputStream(j, 0, is);
    }

    public void flushInputStream(int j, int i, byte[] is)
            throws IOException {
        anInt1140++;
        //     int i_6_ = 74 % ((i - 47) / 41);
        if (!closed) {
            while (j > 0) {
                int k = inputStream.read(is, i, j);
                if ((k ^ 0xffffffff) >= -1) {
                    throw new EOFException("EOF");
                }
                j -= k;
                i += k;
            }
        }
    }

    public static void method592(int i, Class21renamed class21) {
        anInt1133++;
        Class104.aClass92_Sub1Array1779 = Class13_Sub2.method256(class21, Class68_Sub20.anInt3089, 0,
                -122);
        Class112.aClass92_Sub1Array1886 = new Class92_Sub1[Class104.aClass92_Sub1Array1779.length];
        Class68_Sub13_Sub19.aClass92_Sub1Array3745 = new Class92_Sub1[Class104.aClass92_Sub1Array1779.length];
        Class68_Sub20_Sub17.aClass92_Sub1Array4431 = new Class92_Sub1[Class104.aClass92_Sub1Array1779.length];
        for (int i_8_ = 0;
             ((Class104.aClass92_Sub1Array1779.length ^ 0xffffffff) < (i_8_ ^ 0xffffffff));
             i_8_++) {
            Class104.aClass92_Sub1Array1779[i_8_].method1532();
            Class112.aClass92_Sub1Array1886[i_8_] = Class104.aClass92_Sub1Array1779[i_8_].method1535();
            Class104.aClass92_Sub1Array1779[i_8_].method1532();
            Class68_Sub13_Sub19.aClass92_Sub1Array3745[i_8_] = Class104.aClass92_Sub1Array1779[i_8_].method1535();
            Class104.aClass92_Sub1Array1779[i_8_].method1532();
            Class68_Sub20_Sub17.aClass92_Sub1Array4431[i_8_] = Class104.aClass92_Sub1Array1779[i_8_].method1535();
            Class104.aClass92_Sub1Array1779[i_8_].method1532();
        }
        Stream.aSpriteArray3006 = ISAACRandomGen.method1461(false, Class68_Sub26.anInt3182, 0, class21);
        Class68_Sub13_Sub23.aClass68_Sub20_Sub10Array3821 = Class127.method1780(0, Class51.anInt2259, 0, class21);
        Class68_Sub16.aClass68_Sub20_Sub10Array3030 = Class127.method1780(0, Class17.anInt280, 0, class21);
        Class59.aClass68_Sub20_Sub10Array1106 = Class127.method1780(i + -12339, Class68_Sub13_Sub16.anInt3695, 0,
                class21);
        Class108.aClass68_Sub20_Sub10Array1828 = Class127.method1780(0, Class113.anInt1902, 0, class21);
        Class68_Sub13_Sub12.aClass68_Sub20_Sub10Array3646 = Class68_Sub13_Sub16.method775(class21, 0, Class1_Sub5.anInt2500,
                (byte) 13);
        Class70.aClass68_Sub20_Sub10Array1286 = Class68_Sub13_Sub16.method775(class21, 0, Class68_Sub8.anInt2876,
                (byte) 13);
        Class68_Sub20_Sub17.aClass68_Sub20_Sub10_4440 = Class119.method1736(i + -12275, Applet_Sub1.anInt16, 0, class21);
        Class75_Sub2.aClass68_Sub20_Sub10Array3310 = Class68_Sub13_Sub16.method775(class21, 0,
                Class68_Sub13_Sub38.anInt4082,
                (byte) 13);
        Class112.aClass68_Sub20_Sub10Array1883 = Class68_Sub13_Sub16.method775(class21, 0,
                Class68_Sub13_Sub27.anInt3891,
                (byte) 13);
        Class68_Sub13_Sub23.aClass92Array3825 = Class13_Sub1.method248(class21, 0, false,
                Class68_Sub20_Sub14.anInt4378);
        if (i == 12339) {
            Stream.aClass92Array3010 = Class13_Sub1.method248(class21, 0, false, Class15.anInt252);
            Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3801.method1017(Stream.aClass92Array3010, null);
            Class68_Sub6.aClass68_Sub20_Sub1_2847.method1017(Stream.aClass92Array3010, null);
            Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1017(Stream.aClass92Array3010, null);
            Sprite sprite = Class68_Sub22.method1202(Class97.anInt1712, (byte) -96,
                    class21, 0);
            sprite.method1129();
            Class116.aClass68_Sub20_Sub10_2019 = sprite;
            Sprite[] sprites = ISAACRandomGen.method1461(false, Class97.anInt1706, 0, class21);
            for (int i_9_ = 0; ((sprites.length ^ 0xffffffff) < (i_9_ ^ 0xffffffff)); i_9_++) {
                sprites[i_9_].method1129();
            }
            Class88.aClass68_Sub20_Sub10Array1608 = sprites;
            int i_10_ = -10 + (int) (21.0 * Math.random());
            int i_11_ = (int) (21.0 * Math.random()) - 10;
            int i_12_ = -10 + (int) (Math.random() * 21.0);
            int i_13_ = (int) (41.0 * Math.random()) - 20;
            for (int i_14_ = 0;
                 (Stream.aSpriteArray3006.length > i_14_);
                 i_14_++) {
                Stream.aSpriteArray3006[i_14_].method1130(i_10_ + i_13_, i_11_ + i_13_, i_13_ + i_12_);
            }
            Class104.aClass92_Sub1Array1779[0].method1533(i_10_ + i_13_, i_13_ + i_11_, i_12_ + i_13_);
            Class68_Sub13_Sub11.aClass68_Sub20_Sub10Array3605 = Stream.aSpriteArray3006;
        }
    }

    public int read() throws IOException {
        anInt1125++;
        if (closed) {
            return 0;
        }
        int read = inputStream.read();
        return read;
    }

    public void method594(int i) {
        anInt1137++;
        if (i > -2) {
            aRSString_1146 = null;
        }
        if (!closed) {
            synchronized (this) {
                closed = true;
                this.notifyAll();
            }
            if (aClass31_1121 != null) {
                while ((aClass31_1121.anInt555 ^ 0xffffffff) == -1) {
                    Class50.method528(-5, 1L);
                }
                if (aClass31_1121.anInt555 == 1) {
                    try {
                        ((Thread) aClass31_1121.playerDefSocket).join();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            aClass31_1121 = null;
        }
    }

    public static void method595(int i, int i_15_, int i_16_, int i_17_,
                                 int i_18_) {
        if (i == -6) {
            if (i_18_ <= i_16_) {
                for (int i_19_ = i_18_;
                     (i_16_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
                    Class68_Sub22.anIntArrayArray3132[i_19_][i_15_] = i_17_;
                }
            } else {
                for (int i_20_ = i_16_; i_18_ > i_20_; i_20_++) {
                    Class68_Sub22.anIntArrayArray3132[i_20_][i_15_] = i_17_;
                }
            }
            anInt1119++;
        }
    }

    public static void method596(int i) {
        anInt1126++;
        Class48.method519((byte) -120);
        Class68_Sub16.method985((byte) -79);
        Class68_Sub13_Sub12.method756(true);
        Class72.method1352(i ^ ~0x38);
        Class87.method1489(76);
        Class47.method513((byte) 124);
        Class68_Sub20_Sub8.method1087(i);
        Animable.method55(i ^ ~0x1e87);
        Class4.method188(i + -26678);
        Class68_Sub28_Sub2.method1269(i + 5698);
        Class21_Sub1.method366(127);
        Class68_Sub13_Sub10.method743(7);
        Class97.method1561(122);
        Class68_Sub15.method980(i ^ 0x23);
        Class108.aClass98_1827.method1567(i + 127);
    }

    public int available() throws IOException {
        anInt1129++;
        if (closed) {
            return 0;
        }
        return inputStream.available();
    }

    public static void method598(int i) {
        boolean bool = true;
        anInt1135++;
        Class13_Sub1.method254(-12915, false);
        Class68_Sub13_Sub19.anInt3748 = 0;
        for (int i_21_ = 0;
             ((i_21_ ^ 0xffffffff) > (Class23.aByteArrayArray490.length ^ 0xffffffff));
             i_21_++) {
            if ((Class96.anIntArray1699[i_21_] ^ 0xffffffff) != 0 && Class23.aByteArrayArray490[i_21_] == null) {
                Class23.aByteArrayArray490[i_21_] = Class92.aClass21_Sub1_1644.method338(0, 0, Class96.anIntArray1699[i_21_]);
                if (Class23.aByteArrayArray490[i_21_] == null) {
                    Class68_Sub13_Sub19.anInt3748++;
                    bool = false;
                }
            }
            if (Class68_Sub13_Sub29.anIntArray3942[i_21_] != -1 && Class68_Sub20_Sub11.aByteArrayArray4332[i_21_] == null) {
                Class68_Sub20_Sub11.aByteArrayArray4332[i_21_] = (Class92.aClass21_Sub1_1644.method350(Class68_Sub20_Sub6.anIntArrayArray4246[i_21_],
                        Class68_Sub13_Sub29.anIntArray3942[i_21_], 0,
                        (byte) -28));
                if (Class68_Sub20_Sub11.aByteArrayArray4332[i_21_] == null) {
                    bool = false;
                    Class68_Sub13_Sub19.anInt3748++;
                }
            }
            if (Class80.anIntArray1406 != null && Class7.aByteArrayArray133[i_21_] == null && (Class80.anIntArray1406[i_21_] ^ 0xffffffff) != 0) {
                Class7.aByteArrayArray133[i_21_] = (Class92.aClass21_Sub1_1644.method350(Class68_Sub20_Sub6.anIntArrayArray4246[i_21_],
                        Class80.anIntArray1406[i_21_], 0, (byte) 115));
                if (Class7.aByteArrayArray133[i_21_] == null) {
                    bool = false;
                    Class68_Sub13_Sub19.anInt3748++;
                }
            }
        }
        if (Class97.aClass68_Sub20_Sub16_1702 == null || !(Class68_Sub20_Sub5.aClass21_Sub1_4221.method347((byte) -101,
                (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class97.aClass68_Sub20_Sub16_1702.aRSString_4412,
                        Class71.aRSString_1296})))))) {
            Class68_Sub13_Sub21.aClass91_3788 = null;
        } else if (!Class68_Sub20_Sub5.aClass21_Sub1_4221.method354(0, (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class97.aClass68_Sub20_Sub16_1702.aRSString_4412,
                Class71.aRSString_1296}))))) {
            Class68_Sub13_Sub19.anInt3748++;
            bool = false;
        } else {
            Class68_Sub13_Sub21.aClass91_3788 = Class90.method1510((Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{(Class97.aClass68_Sub20_Sub16_1702.aRSString_4412),
                    Class71.aRSString_1296}))),
                    12666,
                    Class68_Sub20_Sub5.aClass21_Sub1_4221);
        }
        if (!bool) {
            Class21renamed.anInt480 = 1;
        } else {
            Class45.anInt925 = 0;
            bool = true;
            for (int i_22_ = 0;
                 ((Class23.aByteArrayArray490.length ^ 0xffffffff) < (i_22_ ^ 0xffffffff));
                 i_22_++) {
                byte[] is = Class68_Sub20_Sub11.aByteArrayArray4332[i_22_];
                if (is != null) {
                    int i_23_ = -Class36.anInt643 + (Class119.anIntArray2089[i_22_] >> -1503568216) * 64;
                    int i_24_ = (-Class68_Sub13_Sub35.anInt4026 + (0xff & Class119.anIntArray2089[i_22_]) * 64);
                    if (Class36.aBoolean640) {
                        i_23_ = 10;
                        i_24_ = 10;
                    }
                    bool &= PacketParser.method1661(is, -32692, i_24_, i_23_);
                }
            }
            if (!bool) {
                Class21renamed.anInt480 = 2;
            } else {
                if (Class21renamed.anInt480 != 0) {
                    Class74.method1381(true,
                            (Class68_Sub20_Sub13_Sub2.method1166(2,
                                    (new RSString[]{Class68_Sub13_Sub19.aRSString_3742,
                                            Class101.aRSString_1743}))),
                            -16678);
                }
                if (i < 78) {
                    method595(113, 66, -49, 57, 30);
                }
                Class49.method524(16322);
                PacketStream.method971(137);
                Class68_Sub13_Sub4.method716();
                for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -5; i_25_++) {
                    Class109.aClass38Array1843[i_25_].method444(false);
                }
                for (int i_26_ = 0; i_26_ < 4; i_26_++) {
                    for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > -105; i_27_++) {
                        for (int i_28_ = 0; i_28_ < 104; i_28_++) {
                            Class64.aByteArrayArrayArray1178[i_26_][i_27_][i_28_] = (byte) 0;
                        }
                    }
                }
                Class68_Sub13_Sub1.method702(0, false);
                Class49.method524(16322);
                System.gc();
                Class13_Sub1.method254(-12915, true);
                Class16.method282(false, -1261);
                if (!Class36.aBoolean640) {
                    Class49.method526(false, false);
                    Class13_Sub1.method254(-12915, true);
                    Class68_Sub7.method670(false, (byte) 84);
                    if (Class7.aByteArrayArray133 != null) {
                        Class87.method1491((byte) -110);
                    }
                }
                if (Class36.aBoolean640) {
                    Class68.method645(false, (byte) -32);
                    Class13_Sub1.method254(-12915, true);
                    Class68_Sub13_Sub33.method865((byte) -124, false);
                }
                PacketStream.method971(137);
                Class13_Sub1.method254(-12915, true);
                Class114.method1690((byte) -111, false,
                        Class109.aClass38Array1843);
                Class13_Sub1.method254(-12915, true);
                int i_29_ = Class68_Sub25.anInt3174;
                if ((anInt1149 ^ 0xffffffff) > (i_29_ ^ 0xffffffff)) {
                    i_29_ = anInt1149;
                }
                if ((anInt1149 + -1 ^ 0xffffffff) < (i_29_ ^ 0xffffffff)) {
                    i_29_ = -1 + anInt1149;
                }
                if (!Class28.method398(24781)) {
                    Class1_Sub5.method138(Class68_Sub25.anInt3174);
                } else {
                    Class1_Sub5.method138(0);
                }
                Class123.method1749(108);
                for (int i_30_ = 0; i_30_ < 104; i_30_++) {
                    for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -105; i_31_++) {
                        Class68_Sub20_Sub9.method1100(i_30_, (byte) -52,
                                i_31_);
                    }
                }
                Class107.method1654(-13401);
                Class49.method524(16322);
                Class34.method414(-28968);
                PacketStream.method971(137);
                if (Class108.aFrame1832 != null && PlayerDefinition.connection != null && GameException.anInt2231 == 25) {
                    Class21renamed.stream.createFrame(22);
                    Class21renamed.stream.writeDWord(1057001181);
                    Class68_Sub13_Sub39.anInt4107++;
                }
                if (!Class36.aBoolean640) {
                    int i_32_ = (-6 + ItemDef.anInt365) / 8;
                    int i_33_ = (Class43.anInt732 - 6) / 8;
                    int i_34_ = (6 + ItemDef.anInt365) / 8;
                    int i_35_ = (6 + Class43.anInt732) / 8;
                    for (int i_36_ = i_32_ + -1; i_36_ <= 1 + i_34_; i_36_++) {
                        for (int i_37_ = i_33_ - 1; i_37_ <= 1 + i_35_;
                             i_37_++) {
                            if (i_32_ > i_36_ || i_36_ > i_34_ || (i_33_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff) || (i_35_ ^ 0xffffffff) > (i_37_ ^ 0xffffffff)) {
                                Class92.aClass21_Sub1_1644.method330((Class68_Sub20_Sub13_Sub2.method1166(2,
                                        (new RSString[]{Class83.aRSString_1525,
                                                Class68_Sub13_Sub24.method816(i_36_,
                                                        0),
                                                Class68_Sub20_Sub5.aRSString_4223,
                                                Class68_Sub13_Sub24.method816(i_37_, 0)}))),
                                        118);
                                Class92.aClass21_Sub1_1644.method330((Class68_Sub20_Sub13_Sub2.method1166(2,
                                        (new RSString[]{Class68_Sub20_Sub16.aRSString_4424,
                                                Class68_Sub13_Sub24.method816(i_36_,
                                                        0),
                                                Class68_Sub20_Sub5.aRSString_4223,
                                                Class68_Sub13_Sub24.method816(i_37_, 0)}))),
                                        114);
                            }
                        }
                    }
                }
                if (GameException.anInt2231 != 28) {
                    Class17.method296(30, (byte) -77);
                    if (PlayerDefinition.connection != null) {
                        Class21renamed.stream.createFrame(60);
                    }
                } else {
                    Class17.method296(10, (byte) -128);
                }
                Class49.method524(16322);
                Class20.method327((byte) 105);
            }
        }
    }

    public static void method599(byte i) {
        anIntArray1128 = null;
        aRSString_1141 = null;
        int i_38_ = -22 / ((i - -68) / 46);
        aBooleanArray1142 = null;
        aRSString_1147 = null;
        aRSString_1148 = null;
        aRSString_1146 = null;
        aClass68_Sub20_Sub10_1144 = null;
        aRSStringArray1139 = null;
    }

    public GameSocket(Socket socket1, SignLink class55) throws IOException {
        try {
            aSignLink_1131 = class55;
            socket = socket1;
            socket.setSoTimeout(30000);
            socket.setTcpNoDelay(true);
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("jk.<init>(" + (socket1 != null ? "{...}" : "null") + ',' + (class55 != null ? "{...}" : "null") + ')'));
        }
    }


    static {
        int i = 0;
        for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > -100; i_39_++) {
            int i_40_ = i_39_ - -1;
            int i_41_ = (int) (Math.pow(2.0, (double) i_40_ / 7.0) * 300.0 + (double) i_40_);
            i += i_41_;
            anIntArray1128[i_39_] = i / 4;
        }
        anInt1138 = 0;
        aRSString_1141 = RSString.newRsString("::tele ");
        aRSString_1146 = RSString.newRsString(" )2> <col=ffff00>");
        aRSString_1147 = RSString.newRsString(")1j");
        aRSStringArray1139 = new RSString[100];
        aRSString_1148 = RSString.newRsString("");
    }
}
