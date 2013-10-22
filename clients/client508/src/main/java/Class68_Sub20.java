/* Class68_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.KeyEvent;

public class Class68_Sub20 extends Class68 {
    public static Class95 aClass95_3079;
    public static short aShort3080 = 1;
    public static Class21_Sub1[] aClass21_Sub1Array3081;
    public static int anInt3082;
    public static int anInt3083;
    public static int anInt3084;
    public long aLong3085;
    public static int anInt3086;
    public Class68_Sub20 aClass68_Sub20_3087;
    public static RSString aRSString_3088
            = RSString.newRsString("Benutzeroberfl-=che geladen)3");
    public static int anInt3089;
    public static int[] anIntArray3090;
    public static RSString aRSString_3091;
    public Class68_Sub20 aClass68_Sub20_3092;
    public static RSString[] aRSStringArray3093;
    public static boolean aBoolean3094;
    public static byte[][][] aByteArrayArrayArray3095;
    public static int anInt3096;
    public static int anInt3097;

    public static void method1003(byte i) {
        aClass95_3079 = null;
        aRSString_3091 = null;
        aClass21_Sub1Array3081 = null;
        aRSStringArray3093 = null;
        if (i > -13)
            anInt3089 = 57;
        aByteArrayArrayArray3095 = null;
        aRSString_3088 = null;
        anIntArray3090 = null;
    }

    public static void method1004(int i, int i_0_, int i_1_, int i_2_,
                                  int i_3_, int i_4_, int i_5_, int i_6_,
                                  byte i_7_) {
        anInt3097++;
        if (!Class68_Sub13_Sub25.method824(i_3_, (byte) -2)) {
            if ((i_4_ ^ 0xffffffff) != 0)
                Class121.aBooleanArray2109[i_4_] = true;
            else {
                for (int i_8_ = 0; i_8_ < 100; i_8_++)
                    Class121.aBooleanArray2109[i_8_] = true;
            }
        } else {
            Class103.aClass45Array1763 = null;
            if (i_7_ != -112)
                anIntArray3090 = null;
            Class68_Sub19.method999(i_1_, -21644, i_0_,
                    (Class68_Sub13_Sub36.aClass45ArrayArray4040
                            [i_3_]),
                    i_6_, i_4_, i, i_2_, -1, i_5_);
            if (Class103.aClass45Array1763 != null) {
                Class68_Sub19.method999(i_1_, -21644, i_0_,
                        Class103.aClass45Array1763, i_6_, i_4_,
                        i, Class121.anInt2107, -1412584499,
                        Class68_Sub4.anInt2816);
                Class103.aClass45Array1763 = null;
            }
        }
    }

    public void method1005(byte i) {
        anInt3083++;
        if (i != 73)
            method1007(null, true);
        if (aClass68_Sub20_3087 != null) {
            aClass68_Sub20_3087.aClass68_Sub20_3092 = aClass68_Sub20_3092;
            aClass68_Sub20_3092.aClass68_Sub20_3087 = aClass68_Sub20_3087;
            aClass68_Sub20_3092 = null;
            aClass68_Sub20_3087 = null;
        }
    }

    public static int method1006(boolean bool, KeyEvent keyevent) {
        if (bool != true)
            return -15;
        anInt3082++;
        int i = keyevent.getKeyChar();
        if ((i ^ 0xffffffff) == -8365)
            return 128;
        if (i <= 0 || i >= 256)
            i = -1;
        return i;
    }

    public static void method1007(Component component, boolean bool) {
        if (bool != true)
            anInt3089 = -124;
        anInt3084++;
        component.removeMouseListener(Class33.aClass86_581);
        component.removeMouseMotionListener(Class33.aClass86_581);
        component.removeFocusListener(Class33.aClass86_581);
        client.anInt2372 = 0;
    }

    public static Class68_Sub20_Sub3 method1008(int i, int i_9_) {
        anInt3096++;
        Class68_Sub20_Sub3 class68_sub20_sub3
                = ((Class68_Sub20_Sub3)
                Class44.aLogin_755.method1473((long) i_9_, (byte) -76));
        if (class68_sub20_sub3 != null)
            return class68_sub20_sub3;
        if (i != 21)
            method1006(true, null);
        byte[] is = (Class75_Sub1_Sub1.aClass21_4586.method338
                (Class23.method376(i_9_, false), 0,
                        Class68_Sub13_Sub13.method759(i_9_, 111)));
        class68_sub20_sub3 = new Class68_Sub20_Sub3();
        if (is != null)
            class68_sub20_sub3.method1048(0, new Stream(is));
        Class44.aLogin_755.method1465((long) i_9_, (byte) -116,
                class68_sub20_sub3);
        return class68_sub20_sub3;
    }

    static {
        anInt3086 = 0;
        aClass21_Sub1Array3081 = new Class21_Sub1[256];
        aBoolean3094 = false;
        aRSString_3091 = RSString.newRsString("(R");
    }
}
