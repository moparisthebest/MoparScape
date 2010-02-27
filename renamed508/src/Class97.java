/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

abstract class Class97
{
    static Class68_Sub20_Sub16 aClass68_Sub20_Sub16_1704;
    static int anInt1705;
    private static MutableString aClass100_1706 = Class112.makeMutableString(43, "Loaded sprites");
    static MutableString aClass100_1707;
    static int anInt1708;
    private static MutableString aClass100_1709 = Class112.makeMutableString(43, "flash3:");
    static int anInt1710;
    static int anInt1711;
    static MutableString aClass100_1712 = Class112.makeMutableString(43, "<col=80ff00>");
    static long[] aLongArray1713 = new long[100];
    static int anInt1714;
    static MutableString aClass100_1715;
    static int anInt1716;
    static int anInt1717;
    static MutableString aClass100_1718 = aClass100_1709;
    static int anInt1719;
    static MutableString aClass100_1720;
    static MutableString aClass100_1721;

    abstract int method1563(boolean bool);

    abstract void method1564(int i, Component component);

    public static void method1565(int i)
    {
        aClass100_1720 = null;
        aClass100_1721 = null;
        aClass100_1709 = null;
        aClass100_1715 = null;
        aClass68_Sub20_Sub16_1704 = null;
        aClass100_1718 = null;
        aClass100_1707 = null;
        if (i == 1)
        {
            aClass100_1712 = null;
            aLongArray1713 = null;
            aClass100_1706 = null;
        }
    }

    static final void method1566(int i, int i_0_, boolean bool, int i_1_, int i_2_)
    {
        anInt1710++;
        ((Stream) Class21.connectionVector).position = 0;
        Class21.connectionVector.writeByte(85);
        Class21.connectionVector.writeByte(i);
        Class21.connectionVector.writeByte(i_0_);
        Class21.connectionVector.writeShort(i_1_);
        Class21.connectionVector.writeShort(i_2_);
        if (bool != true)
            method1566(85, -77, true, 110, 112);
        Object1.anInt1190 = 0;
        Class50.anInt980 = -3;
        Class88.anInt1604 = 0;
        Class68_Sub13_Sub27.anInt3916 = 1;
    }

    static final void method1567(int i)
    {
        Class68_Sub28_Sub2.aClass98_4546.method1573(-37);
        anInt1711++;
        if (i < 60)
            aClass100_1706 = null;
    }

    public Class97()
    {
        /* empty */
    }

    abstract void method1568(Component component, boolean bool);

    static
    {
        aClass100_1715 = Class112.makeMutableString(43, "Lade Texturen )2 ");
        aClass100_1720 = aClass100_1706;
        aClass100_1707 = Class112.makeMutableString(43, "Hidden)2use");
        aClass100_1721 = aClass100_1709;
    }
}
