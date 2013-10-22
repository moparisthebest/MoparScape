/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class123 implements KeyListener, FocusListener {
    public static int anInt2119;
    public static int anInt2120;
    public static int anInt2121;
    public static int anInt2122;
    public static Class113 aClass113_2123;
    public static int anInt2124;
    public static byte[] aByteArray2125 = new byte[520];
    public static int anInt2126;
    public static boolean aBoolean2127 = false;
    public static Stream aStream_2128;
    public static Class98 aClass98_2129;
    public static int anInt2130;

    public static void method1749(int i) {
        Stream.anIntArray3005 = null;
        Class85.aByteArrayArrayArray1554 = null;
        Class14.anIntArray236 = null;
        Class52.aByteArrayArrayArray1014 = null;
        Class68_Sub13_Sub22.anIntArray3805 = null;
        Class64.anIntArray1180 = null;
        Class68_Sub13_Sub35.aByteArrayArrayArray4028 = null;
        Class109.aByteArrayArrayArray1847 = null;
        Class74.anIntArrayArrayArray1336 = null;
        anInt2126++;
        GroundData.aByteArrayArrayArray676 = null;
        if (i < 27)
            method1750(-93);
        Class68_Sub13_Sub15.anIntArray3679 = null;
    }

    public void focusGained(FocusEvent focusevent) {
        anInt2120++;
    }

    public synchronized void keyPressed(KeyEvent keyevent) {
        anInt2122++;
        if (Class66.aClass123_1200 != null) {
            Class33.anInt590 = 0;
            int i = keyevent.getKeyCode();
            if (i < 0 || Class68_Sub13_Sub9.anIntArray3579.length <= i)
                i = -1;
            else {
                i = Class68_Sub13_Sub9.anIntArray3579[i];
                if ((i & 0x80) != 0)
                    i = -1;
            }
            if (Class33.anInt576 >= 0 && (i ^ 0xffffffff) <= -1) {
                Class90.anIntArray2335[Class33.anInt576] = i;
                Class33.anInt576 = 0x7f & 1 + Class33.anInt576;
                if ((Class33.anInt576 ^ 0xffffffff)
                        == (Class124.anInt2164 ^ 0xffffffff))
                    Class33.anInt576 = -1;
            }
            if (i >= 0) {
                int i_0_ = 1 + Class9.anInt177 & 0x7f;
                if ((i_0_ ^ 0xffffffff) != (Class70.anInt1281 ^ 0xffffffff)) {
                    Class68_Sub22.anIntArray3133[Class9.anInt177] = i;
                    Class13_Sub2.anIntArray2643[Class9.anInt177] = -1;
                    Class9.anInt177 = i_0_;
                }
            }
            int i_1_ = keyevent.getModifiers();
            if ((0xa & i_1_ ^ 0xffffffff) != -1 || i == 85
                    || (i ^ 0xffffffff) == -11)
                keyevent.consume();

            //client.keyListener.keyPressed(keyevent);
        }
    }

    public static void method1750(int i) {
        aByteArray2125 = null;
        aClass98_2129 = null;
        aClass113_2123 = null;
        if (i == 24205)
            aStream_2128 = null;
    }

    public synchronized void keyReleased(KeyEvent keyevent) {
        if (Class66.aClass123_1200 != null) {
            Class33.anInt590 = 0;
            int i = keyevent.getKeyCode();
            if (i >= 0 && Class68_Sub13_Sub9.anIntArray3579.length > i)
                i = Class68_Sub13_Sub9.anIntArray3579[i] & ~0x80;
            else
                i = -1;
            if ((Class33.anInt576 ^ 0xffffffff) <= -1 && i >= 0) {
                Class90.anIntArray2335[Class33.anInt576] = i ^ 0xffffffff;
                Class33.anInt576 = 0x7f & Class33.anInt576 + 1;
                if ((Class124.anInt2164 ^ 0xffffffff)
                        == (Class33.anInt576 ^ 0xffffffff))
                    Class33.anInt576 = -1;
            }
        }
        keyevent.consume();
        anInt2119++;
    }

    public synchronized void focusLost(FocusEvent focusevent) {
        if (Class66.aClass123_1200 != null)
            Class33.anInt576 = -1;
        anInt2121++;
    }

    public void keyTyped(KeyEvent keyevent) {
        anInt2124++;
        if (Class66.aClass123_1200 != null) {
            int i = Class68_Sub20.method1006(true, keyevent);
            if ((i ^ 0xffffffff) <= -1) {
                int i_2_ = 1 + Class9.anInt177 & 0x7f;
                if ((Class70.anInt1281 ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
                    Class68_Sub22.anIntArray3133[Class9.anInt177] = -1;
                    Class13_Sub2.anIntArray2643[Class9.anInt177] = i;
                    Class9.anInt177 = i_2_;
                }
            }
        }
        keyevent.consume();
    }

    static {
        aClass113_2123 = new Class113(4096);
        anInt2130 = 0;
        aClass98_2129 = new Class98(50);
    }
}
