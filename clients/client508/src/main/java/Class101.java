/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class101 {
    public static int anInt1737;
    public static RSString aRSString_1738
            = RSString.newRsString("blinken2:");
    public static int anInt1739;
    public static RSString aRSString_1740 = RSString.newRsString("weiss:");
    public static int anInt1741;
    public static RSString aRSString_1742;
    public static RSString aRSString_1743;
    public static int anInt1744 = (int) (33.0 * Math.random()) + -16;
    public static int anInt1745;

    public static void method1624(int i) {
        aRSString_1740 = null;
        aRSString_1738 = null;
        aRSString_1743 = null;
        if (i != -31601)
            aRSString_1742 = null;
        aRSString_1742 = null;
    }

    public static void method1625
            (int i, int i_0_, Class1_Sub6_Sub1 class1_sub6_sub1, int i_1_) {
        if (i == 0) {
            if (class1_sub6_sub1.anInt2568 == i_0_ && i_0_ != -1) {
                Class55 class117 = Class64.method624((byte) -36, i_0_);
                int i_2_ = class117.anInt2061;
                if ((i_2_ ^ 0xffffffff) == -2) {
                    class1_sub6_sub1.anInt2522 = 0;
                    class1_sub6_sub1.anInt2545 = i_1_;
                    class1_sub6_sub1.anInt2549 = 0;
                    class1_sub6_sub1.anInt2556 = 0;
                    Class44.method489(false, class1_sub6_sub1.anInt2522,
                            class1_sub6_sub1.anInt2561, class117,
                            false, class1_sub6_sub1.anInt2537);
                }
                if ((i_2_ ^ 0xffffffff) == -3)
                    class1_sub6_sub1.anInt2549 = 0;
            } else if (i_0_ == -1
                    || (class1_sub6_sub1.anInt2568 ^ 0xffffffff) == 0
                    || ((Class64.method624((byte) -36, i_0_).anInt2051
                    ^ 0xffffffff)
                    <= ((Class64.method624
                    ((byte) -36, class1_sub6_sub1.anInt2568)
                    .anInt2051)
                    ^ 0xffffffff))) {
                class1_sub6_sub1.anInt2557 = class1_sub6_sub1.anInt2579;
                class1_sub6_sub1.anInt2549 = 0;
                class1_sub6_sub1.anInt2522 = 0;
                class1_sub6_sub1.anInt2568 = i_0_;
                class1_sub6_sub1.anInt2545 = i_1_;
                class1_sub6_sub1.anInt2556 = 0;
                if ((class1_sub6_sub1.anInt2568 ^ 0xffffffff) != 0)
                    Class44.method489(false, class1_sub6_sub1.anInt2522,
                            class1_sub6_sub1.anInt2561,
                            Class64.method624((byte) -36,
                                    (class1_sub6_sub1
                                            .anInt2568)),
                            false, class1_sub6_sub1.anInt2537);
            }
            anInt1739++;
        }
    }

    static {
        aRSString_1742 = RSString.newRsString("loc");
        anInt1745 = -1;
        aRSString_1743 = RSString.newRsString("<br>(X100(U(Y");
    }
}
