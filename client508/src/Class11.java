/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class11 {
    public static int anInt188;
    public static int anInt189;
    public static int anInt190;
    public static int anInt191;
    public static int anInt192;
    public static Class98 aClass98_193 = new Class98(100);
    public static int anInt194;
    public static int anInt195;
    public static int[] anIntArray196 = new int[5];

    public static int method229(byte i) {
        anInt190++;
        if (i <= 36)
            return 13;
        return Class20.anInt412;
    }

    public static void method230(byte i) {
        int i_0_ = -4 / ((i - -62) / 37);
        aClass98_193 = null;
        anIntArray196 = null;
    }

    public static Class68_Sub27 method231(int i, boolean bool,
                                          Class21renamed class21) {
        if (bool != true)
            aClass98_193 = null;
        anInt192++;
        byte[] is = class21.method359(0, i);
        if (is == null)
            return null;
        return new Class68_Sub27(is);
    }

    public static void method232(int i) {
        anInt195++;
        for (int i_1_ = 0; i_1_ < 5; i_1_++)
            Class69.aBooleanArray1237[i_1_] = false;
        Class128.anInt2214 = 1;
        if (i == -10937) {
            Class71.anInt1298 = -1;
            Class84.anInt1535 = -1;
        }
    }

    public static void method233(int i, int i_2_) {
        java.awt.Container container;
        if (Class1_Sub2.aFrame2429 != null)
            container = Class1_Sub2.aFrame2429;
        else if (Class108.aFrame1832 != null)
            container = Class108.aFrame1832;
        else
            container = Class75_Sub1_Sub1.signlink.anApplet1042;
        anInt188++;
        Class68_Sub20_Sub17.anInt4437 = container.getSize().width;
        Class21renamed.anInt479 = container.getSize().height;
        if (container == Class108.aFrame1832) {
            Insets insets = Class108.aFrame1832.getInsets();
            Class68_Sub20_Sub17.anInt4437 -= insets.right + insets.left;
            Class21renamed.anInt479 -= insets.bottom + insets.top;
        }
        if (i_2_ >= -77)
            method229((byte) -81);
        Class68_Sub13_Sub9.height = 503;
        Class68_Sub13_Sub25.anInt3858 = Class71.anInt1293;
        Class52.anInt1013 = (-765 + Class68_Sub20_Sub17.anInt4437) / 2;
        Class13_Sub3.width = 765;
        Class86.aCanvas1585.setSize(Class13_Sub3.width,
                Class68_Sub13_Sub9.height);
        if (container != Class108.aFrame1832)
            Class86.aCanvas1585.setLocation(Class52.anInt1013,
                    Class68_Sub13_Sub25.anInt3858);
        else {
            Insets insets = Class108.aFrame1832.getInsets();
            Class86.aCanvas1585.setLocation(Class52.anInt1013 + insets.left,
                    (Class68_Sub13_Sub25.anInt3858
                            + insets.top));
        }
        if ((Class68_Sub13_Sub10.anInt3595 ^ 0xffffffff) != 0)
            Canvas_Sub1.method47(true, 640);
        Class72.method1348(0);
        if (SignLink.osNameLowercase.startsWith("mac"))
            Class36.aLong644 = Class36.method438(17161) + (long) i;
        ISAACRandomGen.aLong1480 = Class36.method438(17161) - -(long) i;
        if (i == 0 && PlayerDefinition.connection != null
                && ((GameException.anInt2231 ^ 0xffffffff) == -31
                || GameException.anInt2231 == 25))
            Class68_Sub20_Sub6.method1071((byte) -118);
    }

    public static void method234(byte i, int i_3_, boolean bool, int i_4_,
                                 int i_5_) {
        anInt194++;
        if (Class68_Sub13_Sub25.method824(i_5_, (byte) -2)) {
            Class68_Sub18.method994(-1, i_3_, bool, false, i_4_,
                    (Class68_Sub13_Sub36.aClass45ArrayArray4040
                            [i_5_]));
            if (i != 99)
                method232(-17);
        }
    }

    public static void method235(int i, byte i_6_) {
        anInt191++;
        int i_7_ = -111 / ((i_6_ - -48) / 49);
        Class68_Sub22 class68_sub22
                = ((Class68_Sub22)
                Class68_Sub13_Sub8.aClass113_3564.method1678((long) i, 74));
        if (class68_sub22 != null) {
            for (int i_8_ = 0; class68_sub22.anIntArray3144.length > i_8_;
                 i_8_++) {
                class68_sub22.anIntArray3144[i_8_] = -1;
                class68_sub22.anIntArray3141[i_8_] = 0;
            }
        }
    }

    public static void method236(int i) {
        Class123.aClass98_2129.method1566((byte) 94);
        anInt189++;
        if (i != 25580)
            aClass98_193 = null;
    }
}
