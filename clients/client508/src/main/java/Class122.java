/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class122 {
    public static RSString aRSString_2111 = RSString.newRsString("Drop");
    public static RSString aRSString_2112;
    public static long[] aLongArray2113;
    public static int anInt2114;
    public static int anInt2115;
    public static volatile int anInt2116 = 0;
    public static int anInt2117;
    public static RSString aRSString_2118;

    public static void method1746(int i) {
        aRSString_2112 = null;
        aLongArray2113 = null;
        aRSString_2111 = null;
        if (i > -100)
            method1748(53, -1, -71);
        aRSString_2118 = null;
    }

    public static boolean method1747(int i, int i_0_, int i_1_, int i_2_,
                                     Animable class1, int i_3_, long l, int i_4_,
                                     int i_5_, int i_6_, int i_7_) {
        if (class1 == null)
            return true;
        return Class68_Sub13_Sub21.method808(i, i_4_, i_5_, i_6_ - i_4_ + 1,
                i_7_ - i_5_ + 1, i_0_, i_1_, i_2_,
                class1, i_3_, true, l);
    }

    public static boolean method1748(int i, int i_8_, int i_9_) {
        if (i_9_ != 28446)
            return false;
        if (i_8_ == 11)
            i_8_ = 10;
        anInt2117++;
        if ((i_8_ ^ 0xffffffff) <= -6 && (i_8_ ^ 0xffffffff) >= -9)
            i_8_ = 4;
        Class116 class116 = Class1_Sub5.method140(88, i);
        return class116.method1704(124, i_8_);
    }

    static {
        anInt2115 = 2301979;
        aRSString_2112 = aRSString_2111;
        aLongArray2113 = new long[32];
        aRSString_2118
                = RSString.newRsString("Starte 3D)2Softwarebibliothek)3");
    }
}
