/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public abstract class Class97 {
    public static Class68_Sub20_Sub16 aClass68_Sub20_Sub16_1702;
    public static int anInt1703;
    public static RSString aRSString_1704
            = RSString.newRsString("Loaded sprites");
    public static RSString aRSString_1705;
    public static int anInt1706;
    public static RSString aRSString_1707 = RSString.newRsString("flash3:");
    public static int anInt1708;
    public static int anInt1709;
    public static RSString aRSString_1710
            = RSString.newRsString("<col=80ff00>");
    public static long[] aLongArray1711 = new long[100];
    public static int anInt1712;
    public static RSString aRSString_1713;
    public static int anInt1714;
    public static int anInt1715;
    public static RSString aRSString_1716 = aRSString_1707;
    public static int anInt1717;
    public static RSString aRSString_1718;
    public static RSString aRSString_1719;

    public abstract int method1557(boolean bool);

    public abstract void method1558(int i, Component component);

    public static void method1559(int i) {
        aRSString_1718 = null;
        aRSString_1719 = null;
        aRSString_1707 = null;
        aRSString_1713 = null;
        aClass68_Sub20_Sub16_1702 = null;
        aRSString_1716 = null;
        aRSString_1705 = null;
        if (i == 1) {
            aRSString_1710 = null;
            aLongArray1711 = null;
            aRSString_1704 = null;
        }
    }

    public static void method1560(int i, int i_0_, boolean bool, int i_1_,
                                  int i_2_) {
        anInt1708++;
        Class21renamed.stream.currentOffset = 0;
        Class21renamed.stream.writeByte(85);
        Class21renamed.stream.writeByte(i);
        Class21renamed.stream.writeByte(i_0_);
        Class21renamed.stream.writeWord(i_1_);
        Class21renamed.stream.writeWord(i_2_);
        if (bool != true)
            method1560(85, -77, true, 110, 112);
        Class64.anInt1190 = 0;
        Class50.anInt980 = -3;
        Class88.anInt1602 = 0;
        Class68_Sub13_Sub27.anInt3914 = 1;
    }

    public static void method1561(int i) {
        Class68_Sub28_Sub2.aClass98_4544.method1567(-37);
        anInt1709++;
        if (i < 60)
            aRSString_1704 = null;
    }

    public abstract void method1562(Component component, boolean bool);

    static {
        aRSString_1713 = RSString.newRsString("Lade Texturen )2 ");
        aRSString_1718 = aRSString_1704;
        aRSString_1705 = RSString.newRsString("Hidden)2use");
        aRSString_1719 = aRSString_1707;
    }
}
