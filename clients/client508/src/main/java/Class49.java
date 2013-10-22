/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

public class Class49 {

    public static int anInt962 = 0;
    public static RSString aRSString_963 = RSString.newRsString("document)3cookie=(R");
    public int anInt964;
    public static int anInt965;
    public static Interface4 anInterface4_966;
    public byte aByte967;
    public int anInt968;
    public static int anInt969;
    public static byte[][][] aByteArrayArrayArray970;
    public static int anInt971;
    public int anInt972;
    public static int anInt973;
    public static int anInt974;
    public int anInt975;
    public static int anInt976;
    public int anInt977;

    public static void method521(boolean bool) {
        if (bool != true)
            anInterface4_966 = null;
        aByteArrayArrayArray970 = null;
        aRSString_963 = null;
        anInterface4_966 = null;
    }

    public int method522(int i) {
        if (i != 7)
            return -110;
        anInt971++;
        return 0x7 & aByte967;
    }

    public int method523(int i) {
        anInt974++;
        if (i != 8)
            return 97;
        if ((aByte967 & 0x8 ^ 0xffffffff) != -9)
            return 0;
        return 1;
    }

    public static void method524(int i) {
        anInt965++;
        if (Animable.aClass35_66 != null)
            Animable.aClass35_66.method430((byte) 94);
        if (i == 16322)
            if (Class68_Sub13_Sub36.aClass35_4035 != null)
                Class68_Sub13_Sub36.aClass35_4035.method430((byte) 119);
    }

    public static void method525(byte i) {
        anInt976++;
        if ((Class68_Sub13_Sub27.anInt3914 ^ 0xffffffff) != -1)
            try {
                if (++Class64.anInt1190 > 2000) {
                    if (PlayerDefinition.connection != null) {
                        PlayerDefinition.connection.method594(-47);
                        PlayerDefinition.connection = null;
                    }
                    if (Class88.anInt1602 >= 1) {
                        Class50.anInt980 = -5;
                        Class68_Sub13_Sub27.anInt3914 = 0;
                        return;
                    }
                    Class68_Sub13_Sub27.anInt3914 = 1;
                    if ((Class103.port ^ 0xffffffff) == (Class115.anInt1946 ^ 0xffffffff))
                        Class103.port = Class68_Sub15.anInt3013;
                    else
                        Class103.port = Class115.anInt1946;
                    Class64.anInt1190 = 0;
                    Class88.anInt1602++;
                }
                if (Class68_Sub13_Sub27.anInt3914 == 1) {
                    Class13_Sub2.aClass31_2657 = (Class75_Sub1_Sub1.signlink.newJagSocket(Class68_Sub9.serverAddress, (byte) 113, Class103.port));
                    Class68_Sub13_Sub27.anInt3914 = 2;
                }
                if ((Class68_Sub13_Sub27.anInt3914 ^ 0xffffffff) == -3) {
                    if (Class13_Sub2.aClass31_2657.anInt555 == 2)
                        throw new IOException();
                    if (Class13_Sub2.aClass31_2657.anInt555 != 1)
                        return;
                    PlayerDefinition.connection = new GameSocket(((Socket) Class13_Sub2.aClass31_2657.playerDefSocket),
                            Class75_Sub1_Sub1.signlink);
                    Class13_Sub2.aClass31_2657 = null;
                    PlayerDefinition.connection.queueBytes(
                            Class21renamed.stream.currentOffset,
                            Class21renamed.stream.buffer);
                    if (Class68_Sub13_Sub36.aClass35_4035 != null)
                        Class68_Sub13_Sub36.aClass35_4035.method418(false);
                    if (Animable.aClass35_66 != null)
                        Animable.aClass35_66.method418(false);
                    int i_0_ = PlayerDefinition.connection.read();
                    if (Class68_Sub13_Sub36.aClass35_4035 != null)
                        Class68_Sub13_Sub36.aClass35_4035.method418(false);
                    if (Animable.aClass35_66 != null)
                        Animable.aClass35_66.method418(false);
                    if ((i_0_ ^ 0xffffffff) != -22) {
                        Class68_Sub13_Sub27.anInt3914 = 0;
                        Class50.anInt980 = i_0_;
                        PlayerDefinition.connection.method594(-89);
                        PlayerDefinition.connection = null;
                        return;
                    }
                    Class68_Sub13_Sub27.anInt3914 = 3;
                }
                if (i < 5)
                    method524(110);
                if ((Class68_Sub13_Sub27.anInt3914 ^ 0xffffffff) == -4) {
                    if ((PlayerDefinition.connection.available() ^ 0xffffffff) > -2)
                        return;
                    Class68_Sub8.aRSStringArray2872 = new RSString[PlayerDefinition.connection.read()];
                    Class68_Sub13_Sub27.anInt3914 = 4;
                }
                if (Class68_Sub13_Sub27.anInt3914 == 4)
                    if (PlayerDefinition.connection.available() >= Class68_Sub8.aRSStringArray2872.length * 8) {
                        Class68_Sub13_Sub8.inStream.currentOffset = 0;
                        PlayerDefinition.connection.flushInputStream(8 * Class68_Sub8.aRSStringArray2872.length,
                                (Class68_Sub13_Sub8.inStream.buffer));
                        for (int i_1_ = 0;
                             i_1_ < Class68_Sub8.aRSStringArray2872.length;
                             i_1_++)
                            Class68_Sub8.aRSStringArray2872[i_1_] = (Class56.method570(Class68_Sub13_Sub8.inStream.readQWord(88),
                                    -1));
                        Class50.anInt980 = 21;
                        Class68_Sub13_Sub27.anInt3914 = 0;
                        PlayerDefinition.connection.method594(-25);
                        PlayerDefinition.connection = null;
                    }
            } catch (IOException ioexception) {
                if (PlayerDefinition.connection != null) {
                    PlayerDefinition.connection.method594(-119);
                    PlayerDefinition.connection = null;
                }
                if ((Class88.anInt1602 ^ 0xffffffff) <= -2) {
                    Class50.anInt980 = -4;
                    Class68_Sub13_Sub27.anInt3914 = 0;
                } else {
                    if (Class103.port != Class115.anInt1946)
                        Class103.port = Class115.anInt1946;
                    else
                        Class103.port = Class68_Sub15.anInt3013;
                    Class68_Sub13_Sub27.anInt3914 = 1;
                    Class88.anInt1602++;
                    Class64.anInt1190 = 0;
                }
            }
    }

    public static void method526(boolean bool, boolean bool_2_) {
        anInt973++;
        byte[][] is = Class23.aByteArrayArray490;
        int i = 4;
        int i_3_ = is.length;
        for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_4_++) {
            int i_5_ = (-Class36.anInt643 + (Class119.anIntArray2089[i_4_] >> 567718824) * 64);
            int i_6_ = (-Class68_Sub13_Sub35.anInt4026 + (Class119.anIntArray2089[i_4_] & 0xff) * 64);
            byte[] is_7_ = is[i_4_];
            if (is_7_ != null) {
                method524(16322);
                Animable.method62(i_6_, is_7_, i_5_, bool, -4,
                        8 * (-6 + Class43.anInt732),
                        ItemDef.anInt365 * 8 - 48,
                        Class109.aClass38Array1843);
            }
        }
        int i_8_ = 0;
        if (bool_2_ != false)
            aByteArrayArrayArray970 = null;
        for (/**/; i_8_ < i_3_; i_8_++) {
            int i_9_ = (64 * (0xff & Class119.anIntArray2089[i_8_]) + -Class68_Sub13_Sub35.anInt4026);
            byte[] is_10_ = is[i_8_];
            int i_11_ = (64 * (Class119.anIntArray2089[i_8_] >> 1005714728) + -Class36.anInt643);
            if (is_10_ == null && Class43.anInt732 < 800) {
                method524(16322);
                for (int i_12_ = 0; (i ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
                     i_12_++)
                    Class68_Sub13_Sub37.method893(64, -73, 64, i_12_, i_9_,
                            i_11_);
            }
        }
    }

    public Class49() {
        /* empty */
    }

    public Class49(Stream class68_sub14) {
        aByte967 = class68_sub14.method955(3390);
        anInt964 = class68_sub14.readUnsignedWord(1355769544);
        anInt977 = class68_sub14.readDWord();
        anInt968 = class68_sub14.readDWord();
        anInt972 = class68_sub14.readDWord();
        anInt975 = class68_sub14.readDWord();
    }
}
