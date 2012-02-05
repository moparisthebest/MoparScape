/* Class75_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75_Sub3 extends Class75 {
    public static RSString aRSString_3318 = RSString.newRsString("welle2:");
    public static int anInt3319;
    public static RSString aRSString_3320
            = RSString.newRsString("; Expires=");
    public static RSString aRSString_3321;
    public static RSString aRSString_3322
            = RSString.newRsString("; version=1; path=)4; domain=");
    public static int anInt3323;
    public static RSString aRSString_3324;
    public static int anInt3325;
    public static RSString aRSString_3326;
    public static int anInt3327 = -8 + (int) (Math.random() * 17.0);
    public static int anInt3328;
    public static RSString aRSString_3329
            = RSString.newRsString("Loading fonts )2 ");
    public static int anInt3330 = 0;

    public static void method1399(int i, Class68 class68, Class68 class68_0_) {
        try {
            anInt3325++;
            if (class68_0_.aClass68_1227 != null)
                class68_0_.method647(-17554);
            class68_0_.aClass68_1227 = class68.aClass68_1227;
            class68_0_.aClass68_1229 = class68;
            if (i < 82)
                aRSString_3318 = null;
            class68_0_.aClass68_1227.aClass68_1229 = class68_0_;
            class68_0_.aClass68_1229.aClass68_1227 = class68_0_;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("rh.B(" + i + ','
                            + (class68 != null ? "{...}" : "null")
                            + ','
                            + (class68_0_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public static void method1400(byte i) {
        aRSString_3329 = null;
        aRSString_3324 = null;
        aRSString_3320 = null;
        if (i != 26)
            method1400((byte) -121);
        aRSString_3321 = null;
        aRSString_3326 = null;
        aRSString_3322 = null;
        aRSString_3318 = null;
    }

    static {
        anInt3328 = 0;
        aRSString_3324 = aRSString_3329;
        aRSString_3326 = RSString.newRsString("Continue");
        aRSString_3321 = aRSString_3326;
    }
}
