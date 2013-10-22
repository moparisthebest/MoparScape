/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.*;

public class Class86
        implements MouseListener, MouseMotionListener, FocusListener {
    public static int anInt1565;
    public static Class21renamed aClass21_1566;
    public static int anInt1567 = 0;
    public static RSString aRSString_1568
            = RSString.newRsString("Loading)3)3)3");
    public static RSString aRSString_1569;
    public static int anInt1570;
    public static int anInt1571 = 0;
    public static int anInt1572;
    public static int anInt1573;
    public static RSString aRSString_1574;
    public static long[] aLongArray1575;
    public static int anInt1576;
    public static int anInt1577;
    public static int anInt1578;
    public static int anInt1579;
    public static int anInt1580;
    public static int anInt1581;
    public static int anInt1582;
    public static int anInt1583;
    public static int anInt1584;
    public static Canvas aCanvas1585;
    public static int anInt1586;

    public void focusGained(FocusEvent focusevent) {
        anInt1577++;
    }

    public static void method1482(int i, int i_0_) {
        anInt1580++;
        synchronized (Class33.aClass86_581) {
            Class20.anInt412 = i;
        }
        if (i_0_ != 0)
            aCanvas1585 = null;
    }

    public void mouseClicked(MouseEvent mouseevent) {
        anInt1573++;
        if (mouseevent.isPopupTrigger())
            mouseevent.consume();
    }

    public synchronized void mouseExited(MouseEvent mouseevent) {
        anInt1565++;
        if (Class33.aClass86_581 != null) {
            Class20.anInt412 = 0;
            Class115.anInt1958 = -1;
            Class68_Sub20_Sub13.anInt4365 = -1;
        }
    }

    public synchronized void mouseDragged(MouseEvent mouseevent) {
        anInt1579++;
        if (Class33.aClass86_581 != null) {
            Class20.anInt412 = 0;
            Class115.anInt1958 = mouseevent.getX();
            Class68_Sub20_Sub13.anInt4365 = mouseevent.getY();
        }
    }

    public static void method1483(int i) {
        aClass21_1566 = null;
        aRSString_1568 = null;
        aRSString_1574 = null;
        aLongArray1575 = null;
        aCanvas1585 = null;
        if (i != -20033)
            method1483(37);
        aRSString_1569 = null;
    }

    public synchronized void focusLost(FocusEvent focusevent) {
        anInt1583++;
        if (Class33.aClass86_581 != null)
            client.anInt2372 = 0;
    }

    public synchronized void mousePressed(MouseEvent mouseevent) {
        anInt1581++;
        if (Class33.aClass86_581 != null) {
            Class20.anInt412 = 0;
            Class12.anInt199 = mouseevent.getX();
            Class48.anInt954 = mouseevent.getY();
            Class68_Sub13_Sub11.aLong3619 = Class36.method438(17161);
            if (!mouseevent.isMetaDown()) {
                Class122.anInt2116 = 1;
                client.anInt2372 = 1;
            } else {
                Class122.anInt2116 = 2;
                client.anInt2372 = 2;
            }
            int i = mouseevent.getModifiers();
        }
        if (mouseevent.isPopupTrigger())
            mouseevent.consume();
    }

    public synchronized void mouseMoved(MouseEvent mouseevent) {
        if (Class33.aClass86_581 != null) {
            Class20.anInt412 = 0;
            Class115.anInt1958 = mouseevent.getX();
            Class68_Sub20_Sub13.anInt4365 = mouseevent.getY();
        }
        anInt1578++;
    }

    public synchronized void mouseReleased(MouseEvent mouseevent) {
        if (Class33.aClass86_581 != null) {
            Class20.anInt412 = 0;
            client.anInt2372 = 0;
            int i = mouseevent.getModifiers();
        }
        anInt1570++;
        if (mouseevent.isPopupTrigger())
            mouseevent.consume();
    }

    public synchronized void mouseEntered(MouseEvent mouseevent) {
        if (Class33.aClass86_581 != null) {
            Class20.anInt412 = 0;
            Class115.anInt1958 = mouseevent.getX();
            Class68_Sub20_Sub13.anInt4365 = mouseevent.getY();
        }
        anInt1584++;
    }

    public static int method1484(int i, int i_1_, int i_2_, byte i_3_) {
        anInt1572++;
        if ((0x8 & Class64.aByteArrayArrayArray1178[i_1_][i_2_][i]
                ^ 0xffffffff)
                != -1)
            return 0;
        if (i_3_ >= -43)
            return 117;
        if (i_1_ > 0
                && (Class64.aByteArrayArrayArray1178[1][i_2_][i] & 0x2) != 0)
            return i_1_ + -1;
        return i_1_;
    }

    public static void method1485(byte i, double d) {
        if (d != Class106.aDouble1802) {
            for (int i_4_ = 0; i_4_ < 256; i_4_++) {
                int i_5_ = (int) (Math.pow((double) i_4_ / 255.0, d) * 255.0);
                Class13_Sub2.anIntArray2641[i_4_]
                        = (i_5_ ^ 0xffffffff) >= -256 ? i_5_ : 255;
            }
            Class106.aDouble1802 = d;
        }
        anInt1586++;
        if (i != 47)
            method1484(-26, -31, -30, (byte) 79);
    }

    public static boolean method1486(int i, int i_6_, int i_7_, long l) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_6_][i_7_];
        if (class68_sub1 == null)
            return false;
        if (class68_sub1.aClass64_2757 != null
                && class68_sub1.aClass64_2757.aLong1185 == l)
            return true;
        if (class68_sub1.aClass76_2764 != null
                && class68_sub1.aClass76_2764.aLong1364 == l)
            return true;
        if (class68_sub1.aClass47_2777 != null
                && class68_sub1.aClass47_2777.aLong943 == l)
            return true;
        for (int i_8_ = 0; i_8_ < class68_sub1.anInt2771; i_8_++) {
            if (class68_sub1.aClass69Array2772[i_8_].aLong1243 == l)
                return true;
        }
        return false;
    }

    static {
        aRSString_1569 = RSString.newRsString("sl_stars");
        aLongArray1575 = new long[32];
        anInt1576 = -1;
        aRSString_1574 = aRSString_1568;
    }
}
