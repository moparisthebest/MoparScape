/* Class35_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class35_Sub1 extends Class35 {
    public int anInt2720;
    public static Interface1 anInterface1_2721;

    public void method423(int i) throws Exception {
        if (i > 32768)
            throw new IllegalArgumentException();
        anInterface1_2721.method3(i, false, anInt2720);
    }

    public void method426() {
        anInterface1_2721.method1(anInt2720, 92);
    }

    public void method420() {
        anInterface1_2721.method4(anInt2720, anIntArray625);
    }

    public static void method436() {
        anInterface1_2721 = null;
    }

    public int method422() {
        return anInterface1_2721.method2((byte) 94, anInt2720);
    }

    public Class35_Sub1(SignLink class55, int i) {
        anInterface1_2721 = class55.method567(0);
        anInt2720 = i;
    }

    public void method433(Component component) throws Exception {
        anInterface1_2721.method5(Class93.anInt1660, Class7.aBoolean132,
                component, (byte) -23);
    }

    public void method434() {
        anInterface1_2721.method6((byte) -117, anInt2720);
    }
}
