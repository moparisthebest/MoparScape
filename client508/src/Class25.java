/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class25 {
    public static int anInt510;
    public static RSString aRSString_511
            = RSString.newRsString(" )2> <col=ff9040>");
    public static int anInt512;
    public static Class21renamed aClass21_513;
    public static int anInt514;
    public static int anInt515;
    public static int anInt516;
    public static int anInt517 = 0;
    public static int anInt518;

    public static void method384(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 int i_4_, int i_5_, int i_6_) {
        anInt515++;
        if (Class68_Sub13_Sub25.method824(i_0_, (byte) -2)) {
            client.method43(Class68_Sub13_Sub36.aClass45ArrayArray4040[i_0_],
                    -1, i_5_, i_2_, i_1_, i_6_, i_4_, i_3_);
            if (i > -1)
                anInt517 = -98;
        }
    }

    public static void method385(int i) {
        aRSString_511 = null;
        aClass21_513 = null;
        if (i != 0)
            anInt516 = -33;
    }

    public static void method386(RSString class100, int i,
                                 RSString class100_7_, int i_8_, int i_9_,
                                 RSString class100_10_) {
        try {
            for (int i_11_ = 99; (i_11_ ^ 0xffffffff) < -1; i_11_--) {
                Class68_Sub13_Sub39.anIntArray4098[i_11_]
                        = Class68_Sub13_Sub39.anIntArray4098[-1 + i_11_];
                Class68_Sub13_Sub27.aRSStringArray3916[i_11_]
                        = Class68_Sub13_Sub27.aRSStringArray3916[i_11_ + -1];
                Class55.aRSStringArray2067[i_11_]
                        = Class55.aRSStringArray2067[-1 + i_11_];
                GameSocket.aRSStringArray1139[i_11_]
                        = GameSocket.aRSStringArray1139[i_11_ - 1];
                Class68_Sub13_Sub9.anIntArray3582[i_11_]
                        = Class68_Sub13_Sub9.anIntArray3582[i_11_ - 1];
            }
            Class68_Sub13_Sub27.aRSStringArray3916[0] = class100_7_;
            Class55.aRSStringArray2067[0] = class100_10_;
            if (i == -19596) {
                Class68_Sub20_Sub3.anInt4196 = Class68_Sub22.anInt3148;
                Class68_Sub13_Sub39.anIntArray4098[0] = i_9_;
                Class22.anInt485++;
                anInt512++;
                Class68_Sub13_Sub9.anIntArray3582[0] = i_8_;
                GameSocket.aRSStringArray1139[0] = class100;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("de.D("
                            + (class100 != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (class100_7_ != null ? "{...}"
                            : "null")
                            + ',' + i_8_ + ',' + i_9_ + ','
                            + (class100_10_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public static void method387(boolean bool, RSString class100,
                                 boolean bool_12_) {
        anInt510++;
        class100 = class100.method1608((byte) 111);
        short[] is = new short[16];
        if (bool == true) {
            int i = 0;
            for (int i_13_ = 0; Class14.anInt233 > i_13_; i_13_++) {
                ItemDef class19 = Applet_Sub1.method18(-25672, i_13_);
                if ((!bool_12_ || class19.aBoolean366)
                        && class19.anInt385 == -1 && class19.anInt339 == -1
                        && (class19.anInt341 ^ 0xffffffff) == -1
                        && (class19.aRSString_362.method1608((byte) -99)
                        .method1595(-128, class100)
                        ^ 0xffffffff) != 0) {
                    if ((i ^ 0xffffffff) <= -251) {
                        Class68_Sub6.anInt2836 = -1;
                        Class13.aShortArray213 = null;
                        return;
                    }
                    if (is.length <= i) {
                        short[] is_14_ = new short[is.length * 2];
                        for (int i_15_ = 0;
                             (i ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++)
                            is_14_[i_15_] = is[i_15_];
                        is = is_14_;
                    }
                    is[i++] = (short) i_13_;
                }
            }
            Class13.aShortArray213 = is;
            Class68_Sub6.anInt2836 = i;
            Class97.anInt1717 = 0;
            RSString[] class100s = new RSString[Class68_Sub6.anInt2836];
            for (int i_16_ = 0; Class68_Sub6.anInt2836 > i_16_; i_16_++)
                class100s[i_16_]
                        = Applet_Sub1.method18(-25672, is[i_16_]).aRSString_362;
            Class72_Sub1.method1365(class100s, Class13.aShortArray213, -122);
        }
    }
}
