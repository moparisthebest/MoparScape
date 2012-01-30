/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class99 {
    public int anInt1733;
    public int anInt1734;
    public int[] anIntArray1735;
    public int[] anIntArray1736;

    public Class99() {
        Class68_Sub21.method1190(16);
        anInt1734 = (Class68_Sub21.method1196() != 0
                ? Class68_Sub21.method1190(4) + 1 : 1);
        if (Class68_Sub21.method1196() != 0)
            Class68_Sub21.method1190(8);
        Class68_Sub21.method1190(2);
        if (anInt1734 > 1)
            anInt1733 = Class68_Sub21.method1190(4);
        anIntArray1736 = new int[anInt1734];
        anIntArray1735 = new int[anInt1734];
        for (int i = 0; i < anInt1734; i++) {
            Class68_Sub21.method1190(8);
            anIntArray1736[i] = Class68_Sub21.method1190(8);
            anIntArray1735[i] = Class68_Sub21.method1190(8);
        }
    }
}
