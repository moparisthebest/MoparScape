/* Class68_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub17 extends Class68 {
    public static int anInt3032;
    public static int anInt3033;
    public int anInt3034;
    public int anInt3035;
    public static int anInt3036;
    public static boolean[] aBooleanArray3037 = new boolean[100];

    public static void method989(int i) {
        int i_0_ = 86 / ((62 - i) / 33);
        aBooleanArray3037 = null;
    }

    public static void method990(byte i) {
        if (Class68_Sub13_Sub36.aClass35_4035 != null)
            Class68_Sub13_Sub36.aClass35_4035.method431(7759444);
        if (Animable.aClass35_66 != null)
            Animable.aClass35_66.method431(7759444);
        anInt3032++;
        if (i <= 62)
            method991(-70, false, 8, -46, 86);
        Class68_Sub13_Sub36.method887(22050, 2, Class74.aBoolean1324, 81);
        Class68_Sub13_Sub36.aClass35_4035
                = Class55.method1717(Class75_Sub1_Sub1.signlink, (byte) 104,
                Class86.aCanvas1585, 22050, 0);
        Class68_Sub13_Sub36.aClass35_4035
                .method425(false, Class54.aClass68_Sub28_Sub1_1028);
        Animable.aClass35_66
                = Class55.method1717(Class75_Sub1_Sub1.signlink, (byte) 104,
                Class86.aCanvas1585, 2048, 1);
        Animable.aClass35_66.method425(false, Class80.aClass68_Sub28_Sub4_1418);
    }

    public Class68_Sub17(int i, int i_1_) {
        anInt3034 = i;
        anInt3035 = i_1_;
    }

    public static void method991(int i, boolean bool, int i_2_, int i_3_,
                                 int i_4_) {
        Class68_Sub13_Sub24.anInt3844 = Class68_Sub6.anInt2846 * i_4_ / i_3_;
        anInt3036++;
        Class3.anInt85 = -1;
        Class68_Sub22.anInt3145 = -1;
        Class85.anInt1551 = Class103.anInt1768 * i_2_ / i;
        Class128.method1782(-1);
        if (bool != false)
            method990((byte) -38);
    }
}
