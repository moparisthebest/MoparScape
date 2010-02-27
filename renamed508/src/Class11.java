/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class Class11
{
    static int anInt188;
    static int anInt189;
    static int anInt190;
    static int anInt191;
    static int anInt192;
    static MRUNodes aClass98_193 = new MRUNodes(100);
    static int anInt194;
    static int anInt195;
    static int[] anIntArray196 = new int[5];

    static final int method229(byte i)
    {
        anInt190++;
        if (i <= 36)
            return 13;
        return Class20.idleTime;
    }

    public static void method230(byte i)
    {
        int i_0_ = -4 / ((i + 62) / 37);
        aClass98_193 = null;
        anIntArray196 = null;
    }

    static final Class68_Sub27 method231(int i, boolean bool, Class21 class21)
    {
        try
        {
            if (bool != true)
                aClass98_193 = null;
            anInt192++;
            byte[] is = class21.method359(0, i);
            if (is == null)
                return null;
            return new Class68_Sub27(is);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bf.A(" + i + ',' + bool + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method232(int i)
    {
        anInt195++;
        for (int i_1_ = 0; i_1_ < 5; i_1_++)
            Object5.aBooleanArray1237[i_1_] = false;
        NodeSubList.anInt2216 = 1;
        if (i == -10937)
        {
            Class71.anInt1298 = -1;
            Class84.anInt1537 = -1;
        }
    }

    static final void method233(int i, int i_2_)
    {
        java.awt.Container container;
        if (Item.aFrame2431 != null)
            container = Item.aFrame2431;
        else if (Class108.gameFrame != null)
            container = Class108.gameFrame;
        else
            container = Class75_Sub1_Sub1.signlink.gameApplet;
        anInt188++;
        Class68_Sub20_Sub17.appletWidth = container.getSize().width;
        Class21.appletHeight = container.getSize().height;
        if (container == Class108.gameFrame)
        {
            Insets insets = Class108.gameFrame.getInsets();
            Class68_Sub20_Sub17.appletWidth -= insets.right + insets.left;
            Class21.appletHeight -= insets.bottom + insets.top;
        }
        if (i_2_ >= -77)
            method229((byte) -81);
        Class68_Sub13_Sub9.appletHeight = 503;
        Class68_Sub13_Sub25.anInt3860 = Class71.anInt1293;
        Class52.anInt1013 = (Class68_Sub20_Sub17.appletWidth - 765) / 2;
        Class13_Sub3.appletWidth = 765;
        Mouse.gameCanvas.setSize(Class13_Sub3.appletWidth, Class68_Sub13_Sub9.appletHeight);
        if (container != Class108.gameFrame)
            Mouse.gameCanvas.setLocation(Class52.anInt1013, Class68_Sub13_Sub25.anInt3860);
        else
        {
            Insets insets = Class108.gameFrame.getInsets();
            Mouse.gameCanvas.setLocation(Class52.anInt1013 + insets.left, (Class68_Sub13_Sub25.anInt3860 + insets.top));
        }
        if (Class68_Sub13_Sub10.anInt3597 != -1)
            GameCanvas.method47(true, 640);
        Class72.method1348(0);
        if (Signlink.os_lower.startsWith("mac"))
            Class36.aLong644 = Class36.method438(17161) + (long) i;
        RandomNumberGenerator.aLong1482 = Class36.method438(17161) + (long) i;
        if (i == 0 && PlayerDefinition.connection != null)
        {
            if (GameException.anInt2233 == 30 || GameException.anInt2233 == 25)
                Class68_Sub20_Sub6.method1071((byte) -118);
        }
    }

    static final void method234(byte i, int i_3_, boolean bool, int i_4_, int i_5_)
    {
        anInt194++;
        if (Class68_Sub13_Sub25.method824(i_5_, (byte) -2))
        {
            Class68_Sub18.method994(-1, i_3_, bool, false, i_4_, (Class68_Sub13_Sub36.widgetCache[i_5_]));
            if (i != 99)
                method232(-17);
        }
    }

    static final void method235(int i, byte i_6_)
    {
        anInt191++;
        int i_7_ = -111 / ((i_6_ + 48) / 49);
        Class68_Sub22 class68_sub22 = ((Class68_Sub22) Class68_Sub13_Sub8.aClass113_3566.method1684((long) i, 74));
        if (class68_sub22 != null)
        {
            for (int i_8_ = 0; ((Class68_Sub22) class68_sub22).anIntArray3146.length > i_8_; i_8_++)
            {
                ((Class68_Sub22) class68_sub22).anIntArray3146[i_8_] = -1;
                ((Class68_Sub22) class68_sub22).anIntArray3143[i_8_] = 0;
            }
        }
    }

    static final void method236(int i)
    {
        Keyboard.aClass98_2131.method1572((byte) 94);
        anInt189++;
        if (i != 25580)
            aClass98_193 = null;
    }
}
