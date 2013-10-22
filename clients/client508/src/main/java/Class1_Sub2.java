/* Class1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class1_Sub2 extends Animable {
    public static Frame aFrame2429;
    public static int[][] anIntArrayArray2430;
    public int anInt2431;
    public static boolean aBoolean2432;
    public static Class68_Sub28_Sub1 aClass68_Sub28_Sub1_2433;
    public static int anInt2434;
    public static int anInt2435 = 0;
    public int anInt2436;
    public static int anInt2437;
    public static int anInt2438;
    public int anInt2439 = -32768;
    public static int anInt2440;
    public static int anInt2441;
    public static Class92[] aClass92Array2442;

    public void method51(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                         int i_4_, int i_5_, int i_6_, long l) {
        Class1_Sub3 class1_sub3 = Applet_Sub1.method18(-25672, anInt2431)
                .method318(anInt2436, null, 0, 13895);
        anInt2438++;
        if (class1_sub3 != null) {
            class1_sub3.method51(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_,
                    l);
            anInt2439 = class1_sub3.method56();
        }
    }

    public static void method70(int i) {
        if (i != 31756)
            aBoolean2432 = true;
        aFrame2429 = null;
        anIntArrayArray2430 = null;
        aClass92Array2442 = null;
        aClass68_Sub28_Sub1_2433 = null;
    }

    public static void method71(int i) {
        Class69.anApplet_Sub1_1241.method31((byte) 87);
        anInt2441++;
        if (i > -122)
            method71(111);
    }

    public int method56() {
        anInt2434++;
        return anInt2439;
    }

    static {
        aBoolean2432 = true;
    }
}
