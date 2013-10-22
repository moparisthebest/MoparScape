/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class75
{
    static int anInt1339;
    static MutableString aClass100_1340 = Class112.makeMutableString(43, "Mitglieder)2Welt");
    static MutableString aClass100_1341;
    private static MutableString aClass100_1342 = Class112.makeMutableString(43, " from your ignore list first)3");
    static NodeList aClass16_1343;
    static Class65 aClass65_1344;

    public static void method1385(byte i)
    {
        aClass65_1344 = null;
        if (i <= 43)
            method1385((byte) 71);
        aClass100_1342 = null;
        aClass16_1343 = null;
        aClass100_1341 = null;
        aClass100_1340 = null;
    }

    static final void method1386(int i, Class21 class21)
    {
        try
        {
            if (i != -10509)
                method1386(111, null);
            anInt1339++;
            if (!Class33.aBoolean587)
            {
                Class79.method1424();
                Class96.aClass68_Sub20_Sub10_1702 = NodeSubList.method1795(class21, i + 33972, Class17.anInt279);
                Class96.aClass68_Sub20_Sub10_1702.method1108(-95, 0);
                Class15.aClass92_251 = Class67.method642(class21, Class68_Sub13_Sub14.anInt3672, -30509);
                Class15.aClass92_251.method1533(382 - ((Class92) Class15.aClass92_251).anInt1661 / 2, 18);
                Class33.aBoolean587 = true;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("mj.L(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    static
    {
        aClass100_1341 = aClass100_1342;
        aClass16_1343 = new NodeList();
    }
}
