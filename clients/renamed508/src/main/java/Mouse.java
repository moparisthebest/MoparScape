/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Mouse implements MouseListener, MouseMotionListener, FocusListener
{
    static int anInt1567;
    static Class21 aClass21_1568;
    static int anInt1569 = 0;
    private static MutableString aClass100_1570 = Class112.makeMutableString(43, "Loading)3)3)3");
    static MutableString aClass100_1571;
    static int anInt1572;
    static int anInt1573 = 0;
    static int anInt1574;
    static int anInt1575;
    static MutableString aClass100_1576;
    static long[] aLongArray1577;
    static int anInt1578;
    static int anInt1579;
    static int anInt1580;
    static int anInt1581;
    static int anInt1582;
    static int anInt1583;
    static int anInt1584;
    static int anInt1585;
    static int anInt1586;
    static Canvas gameCanvas;
    static int anInt1588;

    public final void focusGained(FocusEvent focusevent)
    {
        try
        {
            anInt1579++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "od.focusGained(" + (focusevent != null ? "{...}" : "null") + ')');
        }
    }

    static final void method1488(int i, int i_0_)
    {
        anInt1582++;
        synchronized (Class33.mouse)
        {
            Class20.idleTime = i;
        }
        if (i_0_ != 0)
            gameCanvas = null;
    }

    public final void mouseClicked(MouseEvent mouseevent)
    {
        do
        {
            try
            {
                anInt1575++;
                if (!mouseevent.isPopupTrigger())
                    break;
                mouseevent.consume();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("od.mouseClicked(" + (mouseevent != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public final synchronized void mouseExited(MouseEvent mouseevent)
    {
        do
        {
            try
            {
                anInt1567++;
                if (Class33.mouse == null)
                    break;
                Class20.idleTime = 0;
                Class115.mouseX = -1;
                Class68_Sub20_Sub13.mouseY = -1;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("od.mouseExited(" + (mouseevent != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public final synchronized void mouseDragged(MouseEvent mouseevent)
    {
        do
        {
            try
            {
                anInt1581++;
                if (Class33.mouse == null)
                    break;
                Class20.idleTime = 0;
                Class115.mouseX = mouseevent.getX();
                Class68_Sub20_Sub13.mouseY = mouseevent.getY();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("od.mouseDragged(" + (mouseevent != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public static void method1489(int i)
    {
        aClass21_1568 = null;
        aClass100_1570 = null;
        aClass100_1576 = null;
        aLongArray1577 = null;
        gameCanvas = null;
        if (i != -20033)
            method1489(37);
        aClass100_1571 = null;
    }

    public Mouse()
    {
        /* empty */
    }

    public final synchronized void focusLost(FocusEvent focusevent)
    {
        do
        {
            try
            {
                anInt1585++;
                if (Class33.mouse == null)
                    break;
                client.mouseClickButton = 0;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, "od.focusLost(" + (focusevent != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }

    public final synchronized void mousePressed(MouseEvent mouseevent)
    {
        do
        {
            try
            {
                anInt1583++;
                if (Class33.mouse != null)
                {
                    Class20.idleTime = 0;
                    Class12.mouseClickX = mouseevent.getX();
                    Class48.mouseClickY = mouseevent.getY();
                    Class68_Sub13_Sub11.mouseClickTime = Class36.method438(17161);
                    do
                    {
                        if (!mouseevent.isMetaDown())
                        {
                            Class122.mouseClickLastButton = 1;
                            client.mouseClickButton = 1;
                            if (client.anInt2387 == 0)
                                break;
                        }
                        Class122.mouseClickLastButton = 2;
                        client.mouseClickButton = 2;
                    } while (false);
                    int i = mouseevent.getModifiers();
                }
                if (!mouseevent.isPopupTrigger())
                    break;
                mouseevent.consume();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("od.mousePressed(" + (mouseevent != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public final synchronized void mouseMoved(MouseEvent mouseevent)
    {
        try
        {
            if (Class33.mouse != null)
            {
                Class20.idleTime = 0;
                Class115.mouseX = mouseevent.getX();
                Class68_Sub20_Sub13.mouseY = mouseevent.getY();
            }
            anInt1580++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "od.mouseMoved(" + (mouseevent != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(MouseEvent mouseevent)
    {
        do
        {
            try
            {
                if (Class33.mouse != null)
                {
                    Class20.idleTime = 0;
                    client.mouseClickButton = 0;
                    int i = mouseevent.getModifiers();
                }
                anInt1572++;
                if (!mouseevent.isPopupTrigger())
                    break;
                mouseevent.consume();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("od.mouseReleased(" + (mouseevent != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public final synchronized void mouseEntered(MouseEvent mouseevent)
    {
        try
        {
            if (Class33.mouse != null)
            {
                Class20.idleTime = 0;
                Class115.mouseX = mouseevent.getX();
                Class68_Sub20_Sub13.mouseY = mouseevent.getY();
            }
            anInt1586++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "od.mouseEntered(" + (mouseevent != null ? "{...}" : "null") + ')');
        }
    }

    static final int method1490(int i, int i_1_, int i_2_, byte i_3_)
    {
        anInt1574++;
        if ((0x8 & Object1.byteGroundArray[i_1_][i_2_][i]) != 0)
            return 0;
        if (i_3_ >= -43)
            return 117;
        if (i_1_ > 0 && (Object1.byteGroundArray[1][i_2_][i] & 0x2) != 0)
            return i_1_ - 1;
        return i_1_;
    }

    static final void method1491(byte i, double d)
    {
        if (d != Class106.aDouble1804)
        {
            for (int i_4_ = 0; i_4_ < 256; i_4_++)
            {
                int i_5_ = (int) (Math.pow((double) i_4_ / 255.0, d) * 255.0);
                Class13_Sub2.anIntArray2643[i_4_] = i_5_ <= 255 ? i_5_ : 255;
            }
            Class106.aDouble1804 = d;
        }
        anInt1588++;
        if (i != 47)
            method1490(-26, -31, -30, (byte) 79);
    }

    static final boolean method1492(int i, int i_6_, int i_7_, long l)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_6_][i_7_];
        if (class68_sub1 == null)
            return false;
        if (((Ground) class68_sub1).object_1 != null && (((Object1) ((Ground) class68_sub1).object_1).uid) == l)
            return true;
        if (((Ground) class68_sub1).object_2 != null && (((Object2) ((Ground) class68_sub1).object_2).uid) == l)
            return true;
        if (((Ground) class68_sub1).object_3 != null && (((Object3) ((Ground) class68_sub1).object_3).uid) == l)
            return true;
        for (int i_8_ = 0; i_8_ < ((Ground) class68_sub1).anInt2773; i_8_++)
        {
            if (((Object5) (((Ground) class68_sub1).object_5[i_8_])).uid == l)
                return true;
        }
        return false;
    }

    static
    {
        aClass100_1571 = Class112.makeMutableString(43, "sl_stars");
        aLongArray1577 = new long[32];
        anInt1578 = -1;
        aClass100_1576 = aClass100_1570;
    }
}
