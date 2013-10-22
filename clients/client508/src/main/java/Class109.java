/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class109 {
    public static RSString aRSString_1834
            = RSString.newRsString("<col=ffffff> )4 ");
    public int[] anIntArray1835;
    public static short[] aShortArray1836;
    public static RSString aRSString_1837
            = RSString.newRsString("headicons_prayer");
    public static boolean aBoolean1838;
    public static int anInt1839 = 1;
    public static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array1840;
    public static int anInt1841;
    public static int anInt1842;
    public static GroundData[] aClass38Array1843;
    public static int anInt1844;
    public static Class21renamed aClass21_1845;
    public static GameSocket updateServer;
    public static byte[][][] aByteArrayArrayArray1847;

    public int method1657(int i, int i_0_) {
        anInt1841++;
        int i_1_ = (anIntArray1835.length >> -856325599) + i_0_;
        int i_2_ = i_1_ & i;
        for (; ; ) {
            int i_3_ = anIntArray1835[1 + i_2_ - -i_2_];
            if ((i_3_ ^ 0xffffffff) == 0)
                return -1;
            if ((anIntArray1835[i_2_ + i_2_] ^ 0xffffffff) == (i ^ 0xffffffff))
                return i_3_;
            i_2_ = i_1_ & i_2_ - -1;
        }
    }

    public Class109(int[] is) {
        int i;
        for (i = 1; is.length - -(is.length >> 903985793) >= i; i <<= 1) {
            /* empty */
        }
        anIntArray1835 = new int[i - -i];
        for (int i_4_ = 0; (i + i ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
            anIntArray1835[i_4_] = -1;
        for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (is.length ^ 0xffffffff);
             i_5_++) {
            int i_6_;
            for (i_6_ = is[i_5_] & i + -1;
                 (anIntArray1835[1 + (i_6_ + i_6_)] ^ 0xffffffff) != 0;
                 i_6_ = i + -1 & 1 + i_6_) {
                /* empty */
            }
            anIntArray1835[i_6_ - -i_6_] = is[i_5_];
            anIntArray1835[i_6_ - (-i_6_ - 1)] = i_5_;
        }
    }

    public static void method1658(int i) {
        if (i != 20)
            method1658(-7);
        aRSString_1837 = null;
        aRSString_1834 = null;
        updateServer = null;
        aClass38Array1843 = null;
        aClass68_Sub20_Sub10Array1840 = null;
        aClass21_1845 = null;
        aByteArrayArrayArray1847 = null;
        aShortArray1836 = null;
    }

    public static void method1659(byte i, Class21renamed class21) {
        anInt1842++;
        PlayerDefinition.aClass21_2192 = class21;
        Class56.anInt1059 = PlayerDefinition.aClass21_2192.method355(16, 0);
        if (i != -101)
            method1658(26);
    }

    static {
        aShortArray1836 = new short[]{24, 49, 20, 33, 19, 4, 26, 25};
        aClass38Array1843 = new GroundData[4];
        anInt1844 = 0;
    }
}
