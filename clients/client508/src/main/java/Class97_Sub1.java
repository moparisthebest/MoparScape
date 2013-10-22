/* Class97_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class97_Sub1 extends Class97 implements MouseWheelListener {
    public int anInt3333 = 0;

    public void method1562(Component component, boolean bool) {
        component.addMouseWheelListener(this);
        if (bool != true)
            method1557(false);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
        anInt3333 += mousewheelevent.getWheelRotation();
    }

    public void method1558(int i, Component component) {
        if (i != 100)
            method1557(true);
        component.removeMouseWheelListener(this);
    }

    public synchronized int method1557(boolean bool) {
        if (bool)
            method1562(null, true);
        int i = anInt3333;
        anInt3333 = 0;
        return i;
    }
}
