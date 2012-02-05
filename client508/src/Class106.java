/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class106 {
    public static GameSocket aClass61_1798;
    public static int anInt1799 = 1;
    public static RSString aRSString_1800;
    public static int anInt1801;
    public static double aDouble1802 = -1.0;
    public static Class113 aClass113_1803;
    public static int anInt1804;
    public static int anInt1805;
    public static int anInt1806;
    public static int anInt1807;
    public static RSString aRSString_1808;
    public static int[] anIntArray1809;
    public static RSString aRSString_1810;

    public static int[] method1645(int[] is, int i) {
        anInt1807++;
        if (i > -28)
            return null;
        if (is == null)
            return null;
        int[] is_0_ = new int[is.length];
        Class39.method466(is, 0, is_0_, 0, is.length);
        return is_0_;
    }

    public static int method1646(int i, boolean bool) {
        if (bool != false)
            method1647(30);
        anInt1805++;
        return 0xff & i;
    }

    public static void method1647(int i) {
        aClass61_1798 = null;
        aRSString_1808 = null;
        anIntArray1809 = null;
        if (i != 0)
            aClass61_1798 = null;
        aRSString_1800 = null;
        aClass113_1803 = null;
        aRSString_1810 = null;
    }

    public static void method1648(byte i) {
        int i_1_ = -62 / (-i / 39);
        anInt1806++;
        for (Class68_Sub20_Sub4 class68_sub20_sub4
                     = ((Class68_Sub20_Sub4)
                Class45.aClass16_886.method293((byte) 76));
             class68_sub20_sub4 != null;
             class68_sub20_sub4
                     = ((Class68_Sub20_Sub4)
                     Class45.aClass16_886.method290((byte) 10))) {
            Class1_Sub1 class1_sub1 = class68_sub20_sub4.aClass1_Sub1_4214;
            if (class1_sub1.anInt2422 != GameSocket.anInt1149
                    || ((class1_sub1.anInt2408 ^ 0xffffffff)
                    > (Class68_Sub3.anInt2812 ^ 0xffffffff)))
                class68_sub20_sub4.method647(-17554);
            else if (Class68_Sub3.anInt2812 >= class1_sub1.anInt2393) {
                if ((class1_sub1.anInt2417 ^ 0xffffffff) < -1) {
                    Class1_Sub6_Sub1 class1_sub6_sub1
                            = (Class102.aClass1_Sub6_Sub1Array1746
                            [class1_sub1.anInt2417 + -1]);
                    if (class1_sub6_sub1 != null
                            && class1_sub6_sub1.anInt2561 >= 0
                            && class1_sub6_sub1.anInt2561 < 13312
                            && (class1_sub6_sub1.anInt2537 ^ 0xffffffff) <= -1
                            && class1_sub6_sub1.anInt2537 < 13312)
                        class1_sub1.method64(class1_sub6_sub1.anInt2561,
                                (byte) -8,
                                class1_sub6_sub1.anInt2537,
                                (Class1_Sub6_Sub2.method163
                                        (class1_sub6_sub1.anInt2561,
                                                class1_sub1.anInt2422,
                                                class1_sub6_sub1.anInt2537,
                                                false)) - class1_sub1.anInt2420,
                                Class68_Sub3.anInt2812);
                }
                if (class1_sub1.anInt2417 < 0) {
                    int i_2_ = -1 + -class1_sub1.anInt2417;
                    Class1_Sub6_Sub2 class1_sub6_sub2;
                    if (Class68_Sub10.anInt2911 != i_2_)
                        class1_sub6_sub2 = (Class68_Sub13_Sub4
                                .aClass1_Sub6_Sub2Array3483[i_2_]);
                    else
                        class1_sub6_sub2 = Class68_Sub7.aClass1_Sub6_Sub2_2860;
                    if (class1_sub6_sub2 != null
                            && (class1_sub6_sub2.anInt2561 ^ 0xffffffff) <= -1
                            && class1_sub6_sub2.anInt2561 < 13312
                            && (class1_sub6_sub2.anInt2537 ^ 0xffffffff) <= -1
                            && (class1_sub6_sub2.anInt2537 ^ 0xffffffff) > -13313)
                        class1_sub1.method64(class1_sub6_sub2.anInt2561,
                                (byte) -103,
                                class1_sub6_sub2.anInt2537,
                                ((Class1_Sub6_Sub2.method163
                                        (class1_sub6_sub2.anInt2561,
                                                class1_sub1.anInt2422,
                                                class1_sub6_sub2.anInt2537,
                                                false))
                                        + -class1_sub1.anInt2420),
                                Class68_Sub3.anInt2812);
                }
                class1_sub1.method66(Class109.anInt1844, false);
                Class68_Sub20_Sub4.method1061(GameSocket.anInt1149,
                        (int) class1_sub1.aDouble2406,
                        (int) class1_sub1.aDouble2398,
                        (int) class1_sub1.aDouble2390,
                        60, class1_sub1,
                        class1_sub1.anInt2407, -1L,
                        false);
            }
        }
    }

    static {
        anInt1801 = 127;
        aRSString_1800 = RSString.newRsString(")1");
        anIntArray1809 = new int[2000];
        aRSString_1808
                = (RSString.newRsString
                (
                        "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3"));
        anInt1804 = 0;
        aRSString_1810 = RSString.newRsString("Schrifts-=tze geladen)3");
        aClass113_1803 = new Class113(512);
    }
}
