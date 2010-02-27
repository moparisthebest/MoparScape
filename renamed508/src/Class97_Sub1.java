/* Class97_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class Class97_Sub1 extends Class97 implements MouseWheelListener
{
    private int anInt3335 = 0;

    final void method1568(Component component, boolean bool)
    {
        component.addMouseWheelListener(this);
        if (bool != true)
            method1563(false);
    }

    public final synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent)
    {
        anInt3335 += mousewheelevent.getWheelRotation();
    }

    final void method1564(int i, Component component)
    {
        if (i != 100)
            method1563(true);
        component.removeMouseWheelListener(this);
    }

    final synchronized int method1563(boolean bool)
    {
        if (bool)
            method1568(null, true);
        int i = anInt3335;
        anInt3335 = 0;
        return i;
    }
}
