/* Class75_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75_Sub2 extends Class75 {
    public static RSString aRSString_3307;
    public static int anInt3308;
    public static RSString aRSString_3309
            = (RSString.newRsString
            (
                    "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100"));
    public static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array3310;
    public static Class124 aClass124_3311;
    public static RSString aRSString_3312;
    public static int anInt3313;
    public static boolean safeMode;
    public static int anInt3315;
    public static int anInt3316;
    public static RSString aRSString_3317;

    public static void method1397(byte i) {
        aRSString_3307 = null;
        aRSString_3312 = null;
        int i_0_ = -45 % ((i - 82) / 42);
        aClass124_3311 = null;
        aClass68_Sub20_Sub10Array3310 = null;
        aRSString_3317 = null;
        aRSString_3309 = null;
    }

    public static boolean method1398(long l, int i, int i_1_, int i_2_) {
        try {
            int i_3_ = (0x39a537 & (int) l) >> -2141360332;
            int i_4_ = (int) l >> 1299664686 & 0x1f;
            anInt3308++;
            int i_5_ = 0x7fffffff & (int) (l >>> -107367968);
            if (i_4_ != 10 && (i_4_ ^ 0xffffffff) != -12 && i_4_ != 22)
                Class68_Sub13_Sub3.method713
                        (i_3_, 1 + i_4_,
                                Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0],
                                Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0], 0,
                                0, i, true, 0, -3, 2, i_2_);
            else {
                Class116 class116 = Class1_Sub5.method140(91, i_5_);
                int i_6_;
                int i_7_;
                if (i_3_ == 0 || i_3_ == 2) {
                    i_7_ = class116.anInt1987;
                    i_6_ = class116.anInt1988;
                } else {
                    i_6_ = class116.anInt1987;
                    i_7_ = class116.anInt1988;
                }
                int i_8_ = class116.anInt1990;
                if (i_3_ != 0)
                    i_8_ = (0xf & i_8_ << i_3_) + (i_8_ >> 4 - i_3_);
                Class68_Sub13_Sub3.method713
                        (0, 0,
                                Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0],
                                Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0],
                                i_7_, i_6_, i, true, i_8_, -3, 2, i_2_);
            }
            Class68_Sub13_Sub21.anInt3787 = Class125.anInt2173;
            Class68_Sub22.anInt3140 = Class68_Sub13_Sub37.anInt4077;
            client.anInt2376 = 2;
            if (i_1_ != -12974)
                aRSString_3317 = null;
            Class26.anInt523 = 0;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("fg.B(" + l + ',' + i + ',' + i_1_ + ','
                            + i_2_ + ')'));
        }
    }

    static {
        aRSString_3307 = RSString.newRsString("VOLL");
        anInt3313 = 0;
        safeMode = false;
        anInt3315 = 0;
        aRSString_3312 = RSString.newRsString("FULL");
        aRSString_3317 = aRSString_3312;
    }
}
