/* Class13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class13_Sub2 extends Class13 {
    public static int[] anIntArray2641 = new int[256];
    public static RSString aRSString_2642;
    public static int[] anIntArray2643 = new int[128];
    public static int anInt2644;
    public static int anInt2645 = 0;
    public int anInt2646;
    public static RSString aRSString_2647;
    public static int anInt2648;
    public static int anInt2649;
    public int anInt2650;
    public static int anInt2651;
    public static int anInt2652;
    public int anInt2653;
    public static int anInt2654;
    public static int anInt2655;
    public int anInt2656;
    public static JagSocket aClass31_2657;
    public static int anInt2658;

    public Class13_Sub2(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                        int i_4_) {
        super(-1, i_3_, i_4_);
        anInt2650 = i_0_;
        anInt2646 = i_1_;
        anInt2653 = i;
        anInt2656 = i_2_;
    }

    public static void method255(byte i, Class1_Sub6_Sub2 class1_sub6_sub2) {
        if (i != -10)
            method256(null, -124, 33, 69);
        Class68_Sub18 class68_sub18
                = ((Class68_Sub18)
                Class1_Sub5.aClass113_2509.method1678(class1_sub6_sub2
                        .aRSString_3414
                        .toLong(10908),
                        117));
        anInt2649++;
        if (class68_sub18 == null)
            Class52.method543(19395, class1_sub6_sub2.anIntArray2570[0], null,
                    null, 0, class1_sub6_sub2.anIntArray2523[0],
                    GameSocket.anInt1149, class1_sub6_sub2);
        else
            class68_sub18.method993(31506);
    }

    public static Class92_Sub1[] method256(Class21renamed class21, int i, int i_5_,
                                           int i_6_) {
        anInt2655++;
        if (i_6_ > -93)
            return null;
        if (!Class68_Sub13_Sub36.method880(-29381, i, class21, i_5_))
            return null;
        return ISAACRandomGen.method1457(31);
    }

    public void method245(boolean bool, int i, int i_7_) {
        anInt2648++;
        int i_8_ = anInt2653 * i >> 269627692;
        if (bool != true)
            method243(-20, -94, 39);
        int i_9_ = i * anInt2646 >> 667851340;
        int i_10_ = i_7_ * anInt2656 >> -795303956;
        int i_11_ = anInt2650 * i_7_ >> 595146636;
        Class48.method514(i_8_, anInt220, i_11_, i_9_, (byte) -126, i_10_);
    }

    public static void method257(byte i) {
        anIntArray2643 = null;
        aClass31_2657 = null;
        if (i != 15)
            anIntArray2641 = null;
        aRSString_2647 = null;
        anIntArray2641 = null;
        aRSString_2642 = null;
    }

    public static int method258(Stream class68_sub14, int i,
                                RSString class100) {
        try {
            anInt2644++;
            int i_12_ = class68_sub14.currentOffset;
            class68_sub14.method956(class100.anInt2293, -1);
            class68_sub14.currentOffset += (Class68_Sub16.aClass103_3028.method1632(class100.anInt2293, class68_sub14.buffer, class100.bytes, -2147483648, class68_sub14.currentOffset, i));
            return -i_12_ + class68_sub14.currentOffset;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ke.I("
                            + (class68_sub14 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (class100 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public void method244(int i, int i_13_, int i_14_) {
        anInt2654++;
        int i_15_ = -17 % ((i_13_ - -49) / 43);
    }

    public void method243(int i, int i_16_, int i_17_) {
        anInt2658++;
        if (i_16_ != 23700)
            anIntArray2643 = null;
    }

    static {
        aRSString_2642 = RSString.newRsString("Hidden");
        anInt2652 = 0;
        aRSString_2647 = aRSString_2642;
    }
}
