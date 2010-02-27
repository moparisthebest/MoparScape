/* Class68_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub17 extends Node
{
    static int anInt3034;
    static int anInt3035;
    int anInt3036;
    int anInt3037;
    static int anInt3038;
    static boolean[] aBooleanArray3039 = new boolean[100];

    public static void method989(int i)
    {
        int i_0_ = 86 / ((62 - i) / 33);
        aBooleanArray3039 = null;
    }

    static final void method990(byte i)
    {
        if (Class68_Sub13_Sub36.aClass35_4037 != null)
            Class68_Sub13_Sub36.aClass35_4037.method431(7759444);
        if (Animable.aClass35_66 != null)
            Animable.aClass35_66.method431(7759444);
        anInt3034++;
        if (i <= 62)
            method991(-70, false, 8, -46, 86);
        Class68_Sub13_Sub36.method887(22050, 2, Class74.aBoolean1324, 81);
        Class68_Sub13_Sub36.aClass35_4037 = Animation.method1723(Class75_Sub1_Sub1.signlink, (byte) 104, Mouse.gameCanvas, 22050, 0);
        Class68_Sub13_Sub36.aClass35_4037.method425(false, Class54.aClass68_Sub28_Sub1_1028);
        Animable.aClass35_66 = Animation.method1723(Class75_Sub1_Sub1.signlink, (byte) 104, Mouse.gameCanvas, 2048, 1);
        Animable.aClass35_66.method425(false, NPCDefinition.aClass68_Sub28_Sub4_1420);
    }

    Class68_Sub17(int i, int i_1_)
    {
        ((Class68_Sub17) this).anInt3036 = i;
        ((Class68_Sub17) this).anInt3037 = i_1_;
    }

    static final void method991(int i, boolean bool, int i_2_, int i_3_, int i_4_)
    {
        Class68_Sub13_Sub24.anInt3846 = Class68_Sub6.anInt2848 * i_4_ / i_3_;
        anInt3038++;
        Class3.anInt85 = -1;
        Class68_Sub22.anInt3147 = -1;
        Class85.anInt1553 = Class103.anInt1770 * i_2_ / i;
        NodeSubList.method1788(-1);
        if (bool != false)
            method990((byte) -38);
    }
}
