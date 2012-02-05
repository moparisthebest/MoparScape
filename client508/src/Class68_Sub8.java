/* Class68_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub8 extends Class68 {
    public static RSString aRSString_2864
            = RSString.newRsString("Sprites geladen)3");
    public static int anInt2865;
    public static RSString aRSString_2866;
    public static int anInt2867;
    public static int anInt2868;
    public int anInt2869;
    public static Class98 aClass98_2870;
    public static RSString aRSString_2871;
    public static RSString[] aRSStringArray2872;
    public static int[][] anIntArrayArray2873;
    public static int anInt2874;
    public int anInt2875;
    public static int anInt2876;
    public static int anInt2877;
    public int anInt2878;
    public static RSString aRSString_2879
            = (RSString.newRsString
            ("You can(Wt add yourself to your own friend list)3"));
    public static int anInt2880;

    public static RSString method671(int[] is, long l, int i, int i_0_) {
        try {
            if (i != -1)
                method674(-84, -68);
            anInt2868++;
            if (Class37.anInterface2_649 != null) {
                RSString class100
                        = Class37.anInterface2_649.method7(i_0_, (byte) 22, l, is);
                if (class100 != null)
                    return class100;
            }
            if (i_0_ == 5)
                return Class56.method570(l, -1).method1597(i ^ ~0x3190);
            return PlayerDefinition.method1765(l, -62);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("jc.B("
                            + (is != null ? "{...}" : "null") + ','
                            + l + ',' + i + ',' + i_0_ + ')'));
        }
    }

    public static void method672(int i, int i_1_) {
        anInt2865++;
        int i_2_ = -59 / ((i_1_ - 27) / 54);
        Class76.anInt1345 = 1000 / i;
    }

    public static void method673(int i, int i_3_, byte[] is, boolean bool,
                                 GroundData[] class38s, boolean bool_4_) {
        try {
            anInt2877++;
            Stream class68_sub14 = new Stream(is);
            if (bool_4_ != false)
                method676(17);
            int i_5_ = -1;
            for (; ; ) {
                int i_6_ = class68_sub14.method937(true);
                if ((i_6_ ^ 0xffffffff) == -1)
                    break;
                i_5_ += i_6_;
                int i_7_ = 0;
                for (; ; ) {
                    int i_8_ = class68_sub14.method912(255);
                    if (i_8_ == 0)
                        break;
                    i_7_ += -1 + i_8_;
                    int i_9_ = i_7_ & 0x3f;
                    int i_10_ = (0xfc0 & i_7_) >> -1109192570;
                    int i_11_ = class68_sub14.readUnsignedByte(-6677);
                    int i_12_ = i_7_ >> 1165969356;
                    int i_13_ = i_11_ >> 750935842;
                    int i_14_ = 0x3 & i_11_;
                    int i_15_ = i + i_10_;
                    int i_16_ = i_9_ + i_3_;
                    if ((i_15_ ^ 0xffffffff) < -1 && (i_16_ ^ 0xffffffff) < -1
                            && (i_15_ ^ 0xffffffff) > -104 && i_16_ < 103) {
                        GroundData class38 = null;
                        if (!bool) {
                            int i_17_ = i_12_;
                            if ((0x2 & (Class64.aByteArrayArrayArray1178[1]
                                    [i_15_][i_16_])
                                    ^ 0xffffffff)
                                    == -3)
                                i_17_--;
                            if ((i_17_ ^ 0xffffffff) <= -1)
                                class38 = class38s[i_17_];
                        }
                        Class68_Sub20_Sub17.method1181(class38, 1, bool, i_16_,
                                i_14_, i_15_, i_13_,
                                i_12_, i_12_, !bool,
                                i_5_);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("jc.D(" + i + ',' + i_3_ + ','
                            + (is != null ? "{...}" : "null") + ','
                            + bool + ','
                            + (class38s != null ? "{...}" : "null")
                            + ',' + bool_4_ + ')'));
        }
    }

    public static int method674(int i, int i_18_) {
        if (i_18_ != -528748559)
            method671(null, 125L, 117, 89);
        anInt2874++;
        return i >> -528748559 & 0x7;
    }

    public static void method675(int i, int i_19_) {
        Class68_Sub22.anInt3145 = -1;
        Class68_Sub13_Sub24.anInt3844 = i;
        Class3.anInt85 = i_19_;
        Class128.method1782(-1);
        anInt2880++;
    }

    public static void method676(int i) {
        aRSString_2866 = null;
        aClass98_2870 = null;
        aRSString_2864 = null;
        aRSString_2879 = null;
        aRSStringArray2872 = null;
        anIntArrayArray2873 = null;
        aRSString_2871 = null;
        int i_20_ = -16 / ((4 - i) / 49);
    }

    static {
        aRSString_2871 = RSString.newRsString("null");
        aRSString_2866 = aRSString_2879;
        anIntArrayArray2873 = new int[104][104];
        aClass98_2870 = new Class98(64);
    }
}
