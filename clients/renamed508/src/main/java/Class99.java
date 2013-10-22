/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class99
{
    int anInt1735;
    int anInt1736;
    int[] anIntArray1737;
    int[] anIntArray1738;

    Class99()
    {
        Class68_Sub21.method1190(16);
        ((Class99) this).anInt1736 = (Class68_Sub21.method1196() != 0 ? Class68_Sub21.method1190(4) + 1 : 1);
        if (Class68_Sub21.method1196() != 0)
            Class68_Sub21.method1190(8);
        Class68_Sub21.method1190(2);
        if (((Class99) this).anInt1736 > 1)
            ((Class99) this).anInt1735 = Class68_Sub21.method1190(4);
        ((Class99) this).anIntArray1738 = new int[((Class99) this).anInt1736];
        ((Class99) this).anIntArray1737 = new int[((Class99) this).anInt1736];
        for (int i = 0; i < ((Class99) this).anInt1736; i++)
        {
            Class68_Sub21.method1190(8);
            ((Class99) this).anIntArray1738[i] = Class68_Sub21.method1190(8);
            ((Class99) this).anIntArray1737[i] = Class68_Sub21.method1190(8);
        }
    }
}
