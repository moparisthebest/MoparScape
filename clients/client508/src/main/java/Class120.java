/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120 {
    public static RSString aRSString_2092;
    public static RSString aRSString_2093;
    public static int anInt2094 = 0;
    public static Class21_Sub1 aClass21_Sub1_2095;
    public static RSString aRSString_2096;
    public static int anInt2097;
    public static short[] aShortArray2098;
    public static boolean aBoolean2099;

    public static void method1738(int i) {
        if (i != 0)
            aRSString_2096 = null;
        aClass21_Sub1_2095 = null;
        aRSString_2093 = null;
        aRSString_2092 = null;
        aRSString_2096 = null;
        aShortArray2098 = null;
    }

    public static Object method1739(boolean bool, byte i, byte[] is) {
        int i_0_ = -25 % ((-73 - i) / 52);
        anInt2097++;
        if (is == null)
            return null;
        if ((is.length ^ 0xffffffff) < -137 && !Class104.aBoolean1780) {
            try {
                //xxx Class15 class15 = (Class15) Class.forName("Class15_Sub1").newInstance();
                Class15 class15 = new Class15_Sub1();
                class15.method277(is, true);
                return class15;
            } catch (Throwable throwable) {
                Class104.aBoolean1780 = true;
            }
        }
        if (bool)
            return Unknown.method1508(is, false);
        return is;
    }

    public static int method1740(int i, int i_1_) {
        return i & i_1_;
    }

    static {
        aRSString_2093 = RSString.newRsString("red:");
        aRSString_2096 = aRSString_2093;
        aBoolean2099 = false;
        aRSString_2092 = aRSString_2093;
    }
}
