/* Class1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Item extends Animable
{
    static Frame aFrame2431;
    static int[][] anIntArrayArray2432;
    int id;
    static boolean aBoolean2434;
    static Class68_Sub28_Sub1 aClass68_Sub28_Sub1_2435;
    static int anInt2436;
    static int anInt2437 = 0;
    int stackSize;
    static int anInt2439;
    static int anInt2440;
    private int anInt2441 = -32768;
    static int anInt2442;
    static int anInt2443;
    static Class92[] aClass92Array2444;

    final void render(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, long l)
    {
        Model model = GameApplet.method18(-25672, id).method318(stackSize, null, 0, 13895);
        if (model != null)
        {
            model.render(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l);
            anInt2441 = model.method56();
        }
    }

    public static void method70(int i)
    {
        if (i != 31756)
            aBoolean2434 = true;
        aFrame2431 = null;
        anIntArrayArray2432 = null;
        aClass92Array2444 = null;
        aClass68_Sub28_Sub1_2435 = null;
    }

    static final void method71(int i)
    {
        Object5.anApplet_Sub1_1241.method31((byte) 87);
        anInt2443++;
        if (i > -122)
            method71(111);
    }

    final int method56()
    {
        anInt2436++;
        return anInt2441;
    }

    static
    {
        aBoolean2434 = true;
    }
}
