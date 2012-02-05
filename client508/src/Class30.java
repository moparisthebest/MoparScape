/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class30 {
    public static Class68_Sub20_Sub16 aClass68_Sub20_Sub16_540;
    public static Class16 aClass16_541;
    public static RSString aRSString_542;
    public static int anInt543;
    public static int anInt544 = 0;
    public static int anInt545;
    public static int anInt546;
    public static int anInt547;
    public static int[] anIntArray548;
    public static int anInt549;
    public static Class128 aClass128_550;
    public static RSString aRSString_551;
    public static int anInt552;
    public static boolean aBoolean553;

    public static void method403(int i) {
        aRSString_551 = null;
        aRSString_542 = null;
        anIntArray548 = null;
        aClass16_541 = null;
        aClass128_550 = null;
        if (i != 0)
            anInt549 = 122;
        aClass68_Sub20_Sub16_540 = null;
    }

    public static void method404(byte i) {
        anInt545++;
        if (i == 113)
            Class80.anInt1465++;
    }

    public static void method405(int i, Class45 class45) {
        anInt547++;
        if (i > -124)
            method404((byte) -9);
        Class45 class45_0_
                = Class68_Sub20_Sub6.method1066((byte) 126, class45);
        int i_1_;
        int i_2_;
        if (class45_0_ != null) {
            i_1_ = class45_0_.anInt873;
            i_2_ = class45_0_.anInt892;
        } else {
            i_1_ = Class68_Sub13_Sub9.height;
            i_2_ = Class13_Sub3.width;
        }
        Class68_Sub20_Sub7.method1075(false, 123, i_1_, i_2_, class45);
        Class68_Sub20_Sub13.method1159(i_1_, class45, i_2_, -1198502738);
    }

    static {
        aRSString_542 = RSString.newRsString("Suche nach Updates )2 ");
        anIntArray548 = new int[25];
        anInt546 = 0;
        aClass16_541 = new Class16();
        aRSString_551 = RSString.newRsString("W-=hlen Sie eine Option");
        anInt552 = 0;
        aClass128_550 = new Class128();
        aBoolean553 = false;
    }
}
