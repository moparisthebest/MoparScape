/* Class50_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class50_Sub2 extends Class50 {
    public static RSString aRSString_2729;
    public static RSString aRSString_2730 = RSString.newRsString("Oct");
    public static RSString aRSString_2731;
    public static int anInt2732;
    public static int anInt2733;
    public static RSString aRSString_2734 = RSString.newRsString("Mar");
    public int anInt2735;
    public static Class21renamed aClass21_2736;
    public static RSString aRSString_2737;
    public static int anInt2738;
    public static RSString aRSString_2739;
    public static RSString[] aRSStringArray2740;
    public int anInt2741;
    public long aLong2742;
    public static RSString aRSString_2743;
    public static RSString aRSString_2744;
    public static int anInt2745;
    public static RSString aRSString_2746;
    public int anInt2747;
    public static int anInt2748;
    public long[] aLongArray2749 = new long[10];
    public static RSString aRSString_2750;
    public static RSString aRSString_2751;
    public static RSString aRSString_2752;
    public int anInt2753;

    public static int method534(int i, byte i_0_) {
        if (i_0_ != 65)
            return 78;
        anInt2733++;
        return 0x7f & i;
    }

    public static void method535(int i) {
        if (i != 25)
            aRSString_2751 = null;
        aRSStringArray2740 = null;
        aRSString_2751 = null;
        aRSString_2734 = null;
        aRSString_2730 = null;
        aRSString_2752 = null;
        aRSString_2731 = null;
        aRSString_2729 = null;
        aClass21_2736 = null;
        aRSString_2743 = null;
        aRSString_2744 = null;
        aRSString_2737 = null;
        aRSString_2739 = null;
        aRSString_2750 = null;
        aRSString_2746 = null;
    }

    public void method529(boolean bool) {
        for (int i = 0; i < 10; i++)
            aLongArray2749[i] = 0L;
        anInt2748++;
        if (bool != true)
            method535(-115);
    }

    public int method532(int i, int i_1_, int i_2_) {
        anInt2738++;
        if (i_1_ != -19)
            aRSString_2734 = null;
        int i_3_ = anInt2741;
        anInt2741 = 300;
        int i_4_ = anInt2753;
        anInt2753 = 1;
        aLong2742 = Class36.method438(17161);
        if (aLongArray2749[anInt2747] == 0L) {
            anInt2741 = i_3_;
            anInt2753 = i_4_;
        } else if ((aLongArray2749[anInt2747] ^ 0xffffffffffffffffL)
                > (aLong2742 ^ 0xffffffffffffffffL))
            anInt2741 = (int) ((long) (i_2_ * 2560)
                    / (aLong2742 - aLongArray2749[anInt2747]));
        if (anInt2741 < 25)
            anInt2741 = 25;
        if ((anInt2741 ^ 0xffffffff) < -257) {
            anInt2741 = 256;
            anInt2753 = (int) (-((aLong2742 - aLongArray2749[anInt2747]) / 10L)
                    + (long) i_2_);
        }
        if (anInt2753 > i_2_)
            anInt2753 = i_2_;
        aLongArray2749[anInt2747] = aLong2742;
        anInt2747 = (anInt2747 + 1) % 10;
        if ((anInt2753 ^ 0xffffffff) < -2) {
            for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -11; i_5_++) {
                if (aLongArray2749[i_5_] != 0L)
                    aLongArray2749[i_5_]
                            = aLongArray2749[i_5_] - -(long) anInt2753;
            }
        }
        if ((anInt2753 ^ 0xffffffff) > (i ^ 0xffffffff))
            anInt2753 = i;
        Class50.method528(i_1_ + 14, (long) anInt2753);
        int i_6_ = 0;
        while ((anInt2735 ^ 0xffffffff) > -257) {
            anInt2735 += anInt2741;
            i_6_++;
        }
        anInt2735 &= 0xff;
        return i_6_;
    }

    public Class50_Sub2() {
        anInt2741 = 256;
        anInt2735 = 0;
        anInt2753 = 1;
        aLong2742 = Class36.method438(17161);
        for (int i = 0; i < 10; i++)
            aLongArray2749[i] = aLong2742;
    }

    static {
        aRSString_2729 = RSString.newRsString("Dec");
        aRSString_2739 = RSString.newRsString("Jun");
        aRSString_2743 = RSString.newRsString("Jul");
        anInt2745 = 1;
        aRSString_2731 = RSString.newRsString("Aug");
        aRSString_2737 = RSString.newRsString("Apr");
        aRSString_2744 = RSString.newRsString("Sep");
        aRSString_2752 = RSString.newRsString("Jan");
        aRSString_2750 = RSString.newRsString("Nov");
        aRSString_2746 = RSString.newRsString("May");
        aRSString_2751 = RSString.newRsString("Feb");
        aRSStringArray2740
                = new RSString[]{aRSString_2752, aRSString_2751, aRSString_2734,
                aRSString_2737, aRSString_2746, aRSString_2739,
                aRSString_2743, aRSString_2731, aRSString_2744,
                aRSString_2730, aRSString_2750,
                aRSString_2729};
    }
}
