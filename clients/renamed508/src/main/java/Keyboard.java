/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class Keyboard implements KeyListener, FocusListener
{
    static int anInt2121;
    static int anInt2122;
    static int anInt2123;
    static int anInt2124;
    static NodeCache aClass113_2125;
    static int anInt2126;
    static byte[] aByteArray2127 = new byte[520];
    static int anInt2128;
    static boolean aBoolean2129 = false;
    static Stream aClass68_Sub14_2130;
    static MRUNodes aClass98_2131;
    static int anInt2132;

    static final void method1755(int i)
    {
        Stream.anIntArray3007 = null;
        Class85.aByteArrayArrayArray1556 = null;
        Class14.anIntArray236 = null;
        Class52.aByteArrayArrayArray1014 = null;
        Class68_Sub13_Sub22.anIntArray3807 = null;
        Object1.anIntArray1180 = null;
        Class68_Sub13_Sub35.aByteArrayArrayArray4030 = null;
        Class109.aByteArrayArrayArray1849 = null;
        Class74.anIntArrayArrayArray1336 = null;
        anInt2128++;
        GroundData.aByteArrayArrayArray676 = null;
        if (i < 27)
            method1756(-93);
        Class68_Sub13_Sub15.anIntArray3681 = null;
    }

    public final void focusGained(FocusEvent focusevent)
    {
        try
        {
            anInt2122++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "vf.focusGained(" + (focusevent != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(KeyEvent keyevent)
    {
        do
        {
            try
            {
                anInt2124++;
                if (Class66.keyboard == null)
                    break;
                Class33.anInt590 = 0;
                int i = keyevent.getKeyCode();
                do
                {
                    if (i < 0 || Class68_Sub13_Sub9.anIntArray3581.length <= i)
                    {
                        i = -1;
                        if (client.anInt2387 == 0)
                            break;
                    }
                    i = Class68_Sub13_Sub9.anIntArray3581[i];
                    if ((i & 0x80) != 0)
                        i = -1;
                } while (false);
                if (Class33.anInt576 >= 0 && i >= 0)
                {
                    Class90.anIntArray2337[Class33.anInt576] = i;
                    Class33.anInt576 = 0x7f & Class33.anInt576 + 1;
                    if (Class33.anInt576 == Class124.anInt2166)
                        Class33.anInt576 = -1;
                }
                if (i >= 0)
                {
                    int i_0_ = Class9.anInt177 + 1 & 0x7f;
                    if (i_0_ != Class70.anInt1281)
                    {
                        Class68_Sub22.anIntArray3135[Class9.anInt177] = i;
                        Class13_Sub2.anIntArray2645[Class9.anInt177] = -1;
                        Class9.anInt177 = i_0_;
                    }
                }
                int i_1_ = keyevent.getModifiers();
                if ((0xa & i_1_) != 0 || i == 85 || i == 10)
                    keyevent.consume();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, "vf.keyPressed(" + (keyevent != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }

    public static void method1756(int i)
    {
        aByteArray2127 = null;
        aClass98_2131 = null;
        aClass113_2125 = null;
        if (i == 24205)
            aClass68_Sub14_2130 = null;
    }

    public final synchronized void keyReleased(KeyEvent keyevent)
    {
        try
        {
            if (Class66.keyboard != null)
            {
                Class33.anInt590 = 0;
                int i = keyevent.getKeyCode();
                do
                {
                    if (i >= 0 && Class68_Sub13_Sub9.anIntArray3581.length > i)
                    {
                        i = Class68_Sub13_Sub9.anIntArray3581[i] & ~0x80;
                        if (client.anInt2387 == 0)
                            break;
                    }
                    i = -1;
                } while (false);
                if (Class33.anInt576 >= 0 && i >= 0)
                {
                    Class90.anIntArray2337[Class33.anInt576] = i ^ 0xffffffff;
                    Class33.anInt576 = 0x7f & Class33.anInt576 + 1;
                    if (Class124.anInt2166 == Class33.anInt576)
                        Class33.anInt576 = -1;
                }
            }
            keyevent.consume();
            anInt2121++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("vf.keyReleased(" + (keyevent != null ? "{...}" : "null") + ')'));
        }
    }

    public final synchronized void focusLost(FocusEvent focusevent)
    {
        try
        {
            if (Class66.keyboard != null)
                Class33.anInt576 = -1;
            anInt2123++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "vf.focusLost(" + (focusevent != null ? "{...}" : "null") + ')');
        }
    }

    public Keyboard()
    {
        /* empty */
    }

    public final void keyTyped(KeyEvent keyevent)
    {
        try
        {
            anInt2126++;
            if (Class66.keyboard != null)
            {
                int i = NodeSub.method1006(true, keyevent);
                if (i >= 0)
                {
                    int i_2_ = Class9.anInt177 + 1 & 0x7f;
                    if (Class70.anInt1281 != i_2_)
                    {
                        Class68_Sub22.anIntArray3135[Class9.anInt177] = -1;
                        Class13_Sub2.anIntArray2645[Class9.anInt177] = i;
                        Class9.anInt177 = i_2_;
                    }
                }
            }
            keyevent.consume();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("vf.keyTyped(" + (keyevent != null ? "{...}" : "null") + ')'));
        }
    }

    static
    {
        aClass113_2125 = new NodeCache(4096);
        anInt2132 = 0;
        aClass98_2131 = new MRUNodes(50);
    }
}
