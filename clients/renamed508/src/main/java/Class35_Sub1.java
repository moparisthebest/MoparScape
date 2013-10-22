/* Class35_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class35_Sub1 extends Class35
{
    private int anInt2722;
    private static Interface1 anInterface1_2723;

    final void method423(int i) throws Exception
    {
        if (i > 32768)
            throw new IllegalArgumentException();
        anInterface1_2723.method3(i, false, anInt2722);
    }

    final void method426()
    {
        anInterface1_2723.method1(anInt2722, 92);
    }

    final void method420()
    {
        anInterface1_2723.method4(anInt2722, ((Class35) this).anIntArray625);
    }

    public static void method436()
    {
        anInterface1_2723 = null;
    }

    final int method422()
    {
        return anInterface1_2723.method2((byte) 94, anInt2722);
    }

    Class35_Sub1(Signlink class55, int i)
    {
        anInterface1_2723 = class55.method567(0);
        anInt2722 = i;
    }

    final void method433(Component component) throws Exception
    {
        anInterface1_2723.method5(Class93.anInt1662, Class7.aBoolean132, component, (byte) -23);
    }

    final void method434()
    {
        anInterface1_2723.method6((byte) -117, anInt2722);
    }
}
