/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class54 {
    public static Class68_Sub28_Sub1 aClass68_Sub28_Sub1_1028;
    public static int anInt1029;
    public static RSString aRSString_1030;
    public static int anInt1031;
    public static int anInt1032 = 0;
    public static Class45 aClass45_1033;
    public static int anInt1034;
    public static int anInt1035;

    public static Class112 method552(int i, int i_0_) {
        anInt1031++;
        Class112 class112
                = ((Class112)
                Class68_Sub20_Sub13.aClass98_4359.method1570(14366, (long) i));
        if (class112 != null)
            return class112;
        byte[] is = Class9.aClass21_173.method338(i, 0, i_0_);
        class112 = new Class112();
        if (is != null)
            class112.method1676(true, new Stream(is));
        Class68_Sub20_Sub13.aClass98_4359.method1568(class112, 110, (long) i);
        return class112;
    }

    public static boolean method553(int i, int i_1_) {
        anInt1035++;
        if (i_1_ != 31155)
            return true;
        if (i >= 97 && i <= 122)
            return true;
        if (i >= 65 && (i ^ 0xffffffff) >= -91)
            return true;
        if ((i ^ 0xffffffff) <= -49 && i <= 57)
            return true;
        return false;
    }

    public static boolean method554(Class45 class45, int i) {
        if (i != 29905)
            return false;
        anInt1034++;
        if (class45.anInt808 == 205) {
            Class16.anInt273 = 250;
            return true;
        }
        return false;
    }

    public static void method555(byte i) {
        aClass68_Sub28_Sub1_1028 = null;
        int i_2_ = 41 / ((50 - i) / 46);
        aRSString_1030 = null;
        aClass45_1033 = null;
    }

    static {
        aRSString_1030 = RSString.newRsString("k");
    }
}
