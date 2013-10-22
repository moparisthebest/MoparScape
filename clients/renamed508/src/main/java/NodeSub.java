/* Class68_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.KeyEvent;

class NodeSub extends Node
{
    static Class95 aClass95_3081;
    static short aShort3082 = 1;
    static Class21_Sub1[] aClass21_Sub1Array3083;
    static int anInt3084;
    static int anInt3085;
    static int anInt3086;
    long nodeSubID;
    static int anInt3088;
    NodeSub nextSub;
    static MutableString aClass100_3090 = Class112.makeMutableString(43, "Benutzeroberfl-=che geladen)3");
    static int anInt3091;
    static int[] anIntArray3092;
    static MutableString aClass100_3093;
    NodeSub prevSub;
    static MutableString[] aClass100Array3095;
    static boolean aBoolean3096;
    static byte[][][] aByteArrayArrayArray3097;
    static int anInt3098;
    static int anInt3099;

    public static void method1003(byte i)
    {
        aClass95_3081 = null;
        aClass100_3093 = null;
        aClass21_Sub1Array3083 = null;
        aClass100Array3095 = null;
        if (i > -13)
            anInt3091 = 57;
        aByteArrayArrayArray3097 = null;
        aClass100_3090 = null;
        anIntArray3092 = null;
    }

    static final void method1004(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, byte i_7_)
    {
        anInt3099++;
        if (!Class68_Sub13_Sub25.method824(i_3_, (byte) -2))
        {
            if (i_4_ != -1)
                Class121.aBooleanArray2111[i_4_] = true;
            else
            {
                for (int i_8_ = 0; i_8_ < 100; i_8_++)
                    Class121.aBooleanArray2111[i_8_] = true;
            }
        } else
        {
            Class103.aClass45Array1765 = null;
            if (i_7_ != -112)
                anIntArray3092 = null;
            Class68_Sub19.method999(i_1_, -21644, i_0_, (Class68_Sub13_Sub36.widgetCache[i_3_]), i_6_, i_4_, i, i_2_, -1, i_5_);
            if (Class103.aClass45Array1765 != null)
            {
                Class68_Sub19.method999(i_1_, -21644, i_0_, Class103.aClass45Array1765, i_6_, i_4_, i, Class121.anInt2109, -1412584499, Class68_Sub4.anInt2818);
                Class103.aClass45Array1765 = null;
            }
        }
    }

    final void unlinkSub()
    {
        if (nextSub != null)
        {
            nextSub.prevSub = prevSub;
            prevSub.nextSub = nextSub;
            prevSub = null;
            nextSub = null;
        }
    }

    static final int method1006(boolean bool, KeyEvent keyevent)
    {
        try
        {
            if (bool != true)
                return -15;
            anInt3084++;
            int i = keyevent.getKeyChar();
            if (i == 8364)
                return 128;
            if (i <= 0 || i >= 256)
                i = -1;
            return i;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("pe.LA(" + bool + ',' + (keyevent != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1007(Component component, boolean bool)
    {
        try
        {
            if (bool != true)
                anInt3091 = -124;
            anInt3086++;
            component.removeMouseListener(Class33.mouse);
            component.removeMouseMotionListener(Class33.mouse);
            component.removeFocusListener(Class33.mouse);
            client.mouseClickButton = 0;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("pe.NA(" + (component != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    static final Class68_Sub20_Sub3 method1008(int i, int i_9_)
    {
        anInt3098++;
        Class68_Sub20_Sub3 class68_sub20_sub3 = ((Class68_Sub20_Sub3) Class44.aClass82_755.method1479((long) i_9_, (byte) -76));
        if (class68_sub20_sub3 != null)
            return class68_sub20_sub3;
        if (i != 21)
            method1006(true, null);
        byte[] is = (Class75_Sub1_Sub1.aClass21_4588.method338(Class23.method376(i_9_, false), 0, Class68_Sub13_Sub13.method759(i_9_, 111)));
        class68_sub20_sub3 = new Class68_Sub20_Sub3();
        if (is != null)
            class68_sub20_sub3.method1048(0, new Stream(is));
        Class44.aClass82_755.method1471((long) i_9_, (byte) -116, class68_sub20_sub3);
        return class68_sub20_sub3;
    }

    public NodeSub()
    {
        /* empty */
    }

    static
    {
        anInt3088 = 0;
        aClass21_Sub1Array3083 = new Class21_Sub1[256];
        aBoolean3096 = false;
        aClass100_3093 = Class112.makeMutableString(43, "(R");
    }
}
