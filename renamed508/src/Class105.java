/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class105
{
    static NodeList aClass16_1792 = new NodeList();
    static int anInt1793;
    static MutableString aClass100_1794 = Class112.makeMutableString(43, ": ");
    static short[] aShortArray1795;
    static int anInt1796;
    static int[] anIntArray1797 = new int[100];
    static int anInt1798;
    static int anInt1799;

    abstract Class68_Sub20_Sub13 method1647(Class68_Sub20_Sub13 class68_sub20_sub13, byte i);

    public static void method1648(int i)
    {
        aShortArray1795 = null;
        anIntArray1797 = null;
        aClass16_1792 = null;
        if (i != 190)
            method1650((byte) 96);
        aClass100_1794 = null;
    }

    static final void method1649(Class21 class21, Class21 class21_0_, int i)
    {
        try
        {
            Class75_Sub1_Sub1.aClass21_4593 = class21;
            Class68_Sub13_Sub30.aClass21_3949 = class21_0_;
            if (i != -27619)
                aShortArray1795 = null;
            anInt1798++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("sd.B(" + (class21 != null ? "{...}" : "null") + ',' + (class21_0_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    static final void method1650(byte i)
    {
        if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1)
        {
            Class68_Sub13_Sub9.anIntArray3581[223] = 28;
            Class68_Sub13_Sub9.anIntArray3581[220] = 74;
            Class68_Sub13_Sub9.anIntArray3581[189] = 26;
            Class68_Sub13_Sub9.anIntArray3581[221] = 43;
            Class68_Sub13_Sub9.anIntArray3581[188] = 71;
            Class68_Sub13_Sub9.anIntArray3581[190] = 72;
            Class68_Sub13_Sub9.anIntArray3581[187] = 27;
            Class68_Sub13_Sub9.anIntArray3581[222] = 59;
            Class68_Sub13_Sub9.anIntArray3581[191] = 73;
            Class68_Sub13_Sub9.anIntArray3581[219] = 42;
            Class68_Sub13_Sub9.anIntArray3581[192] = 58;
            Class68_Sub13_Sub9.anIntArray3581[186] = 57;
        } else
        {
            Class68_Sub13_Sub9.anIntArray3581[93] = 43;
            Class68_Sub13_Sub9.anIntArray3581[92] = 74;
            Class68_Sub13_Sub9.anIntArray3581[44] = 71;
            Class68_Sub13_Sub9.anIntArray3581[45] = 26;
            Class68_Sub13_Sub9.anIntArray3581[61] = 27;
            Class68_Sub13_Sub9.anIntArray3581[47] = 73;
            Class68_Sub13_Sub9.anIntArray3581[46] = 72;
            Class68_Sub13_Sub9.anIntArray3581[59] = 57;
            Class68_Sub13_Sub9.anIntArray3581[91] = 42;
            if (Signlink.setFocusTraversalKeysEnabled != null)
            {
                Class68_Sub13_Sub9.anIntArray3581[222] = 58;
                Class68_Sub13_Sub9.anIntArray3581[520] = 59;
                Class68_Sub13_Sub9.anIntArray3581[192] = 28;
            } else
            {
                Class68_Sub13_Sub9.anIntArray3581[222] = 59;
                Class68_Sub13_Sub9.anIntArray3581[192] = 58;
            }
        }
        if (i != -109)
            method1648(-115);
        anInt1793++;
    }
}
