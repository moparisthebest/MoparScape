/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125 implements Runnable {
    public static RSString aRSString_2165;
    public SignLink aSignLink_2166;
    public static int anInt2167;
    public static int anInt2168;
    public static int[] anIntArray2169 = new int[32];
    public static Class21renamed aClass21_2170;
    public static Class98 aClass98_2171;
    public static int anInt2172;
    public static int anInt2173 = 0;
    public volatile Class35[] aClass35Array2174 = new Class35[2];
    public static RSString aRSString_2175
            = (RSString.newRsString
            ("You can(Wt add yourself to your own ignore list)3"));
    public volatile boolean aBoolean2176 = false;
    public static int anInt2177;
    public volatile boolean aBoolean2178 = false;
    public static int anInt2179;

    public void run() {
        aBoolean2178 = true;
        anInt2179++;
        try {
            while (!aBoolean2176) {
                for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
                    Class35 class35 = aClass35Array2174[i];
                    if (class35 != null)
                        class35.method430((byte) 54);
                }
                Class50.method528(-5, 10L);
                Canvas_Sub1.method46(aSignLink_2166, null, (byte) -103);
            }
        } catch (Exception exception) {
            Class71.method1339(null, exception, 38);
        } finally {
            aBoolean2178 = false;
        }
    }

    public static Class68_Sub20_Sub2 method1763(byte i, int i_0_) {
        anInt2168++;
        Class68_Sub20_Sub2 class68_sub20_sub2
                = ((Class68_Sub20_Sub2)
                Class75_Sub1_Sub1.aLogin_4588.method1473((long) i_0_,
                        (byte) -76));
        if (class68_sub20_sub2 != null)
            return class68_sub20_sub2;
        byte[] is = Class109.aClass21_1845.method338(i_0_, 0, 5);
        if (i <= 103)
            aRSString_2175 = null;
        class68_sub20_sub2 = new Class68_Sub20_Sub2();
        if (is != null)
            class68_sub20_sub2.method1045((byte) 108, new Stream(is));
        Class75_Sub1_Sub1.aLogin_4588.method1465((long) i_0_, (byte) -105,
                class68_sub20_sub2);
        return class68_sub20_sub2;
    }

    public static void method1764(int i) {
        aClass21_2170 = null;
        aRSString_2165 = null;
        aClass98_2171 = null;
        anIntArray2169 = null;
        int i_1_ = -37 / ((62 - i) / 41);
        aRSString_2175 = null;
    }

    static {
        aRSString_2165 = aRSString_2175;
        aClass98_2171 = new Class98(200);
    }
}
