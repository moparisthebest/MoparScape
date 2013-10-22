/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96 {
    public static int anInt1693;
    public static Class98 aClass98_1694;
    public static int anInt1695 = 0;
    public static int anInt1696;
    public static RSString aRSString_1697;
    public static int anInt1698;
    public static int[] anIntArray1699;
    public static Class68_Sub20_Sub10 aClass68_Sub20_Sub10_1700;
    public static int[] anIntArray1701;

    public static void method1553(byte i) {
        if (i > 61) {
            anIntArray1699 = null;
            aClass98_1694 = null;
            anIntArray1701 = null;
            aRSString_1697 = null;
            aClass68_Sub20_Sub10_1700 = null;
        }
    }

    public static void method1554(boolean bool, int i, int i_0_, int i_1_,
                                  Stream class68_sub14, int i_2_,
                                  int i_3_, byte i_4_, int i_5_) {
        anInt1696++;
        if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) <= -105 || i_5_ < 0
                || i_5_ >= 104) {
            for (; ; ) {
                int i_6_ = class68_sub14.readUnsignedByte(-6677);
                if ((i_6_ ^ 0xffffffff) == -1)
                    break;
                if (i_6_ == 1) {
                    class68_sub14.readUnsignedByte(-6677);
                    break;
                }
                if (i_6_ <= 49)
                    class68_sub14.readUnsignedByte(-6677);
            }
        } else {
            if (!bool)
                Class64.aByteArrayArrayArray1178[i_2_][i][i_5_] = (byte) 0;
            for (; ; ) {
                int i_7_ = class68_sub14.readUnsignedByte(-6677);
                if (i_7_ == 0) {
                    if (bool)
                        Class68_Sub20_Sub12.anIntArrayArrayArray4353[0][i]
                                [i_5_]
                                = Class74.anIntArrayArrayArray1335[0][i][i_5_];
                    else if (i_2_ != 0)
                        Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_2_]
                                [i][i_5_]
                                = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                [-1 + i_2_][i][i_5_]) - 240;
                    else
                        Class68_Sub20_Sub12.anIntArrayArrayArray4353[0][i]
                                [i_5_]
                                = 8 * -Class68_Sub13_Sub38.method895((i_5_ + 556238
                                + i_1_),
                                true,
                                (i_0_
                                        + (932731
                                        - -i)));
                    break;
                }
                if (i_7_ == 1) {
                    int i_8_ = class68_sub14.readUnsignedByte(-6677);
                    if (!bool) {
                        if (i_8_ == 1)
                            i_8_ = 0;
                        if ((i_2_ ^ 0xffffffff) == -1)
                            Class68_Sub20_Sub12.anIntArrayArrayArray4353[0]
                                    [i][i_5_]
                                    = -i_8_ * 8;
                        else
                            Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                    [i_2_][i][i_5_]
                                    = -(i_8_ * 8) + (Class68_Sub20_Sub12
                                    .anIntArrayArrayArray4353
                                    [-1 + i_2_][i][i_5_]);
                    } else
                        Class68_Sub20_Sub12.anIntArrayArrayArray4353[0][i]
                                [i_5_]
                                = (Class74.anIntArrayArrayArray1335[0][i][i_5_]
                                + 8 * i_8_);
                    break;
                }
                if ((i_7_ ^ 0xffffffff) >= -50) {
                    Class68_Sub13_Sub35.aByteArrayArrayArray4028[i_2_][i][i_5_]
                            = class68_sub14.method955(3390);
                    Class109.aByteArrayArrayArray1847[i_2_][i][i_5_]
                            = (byte) ((i_7_ - 2) / 4);
                    Class85.aByteArrayArrayArray1554[i_2_][i][i_5_]
                            = (byte) Class120.method1740(3, i_7_ + -2 + i_3_);
                } else if (i_7_ <= 81) {
                    if (!bool)
                        Class64.aByteArrayArrayArray1178[i_2_][i][i_5_]
                                = (byte) (i_7_ - 49);
                } else
                    Class52.aByteArrayArrayArray1014[i_2_][i][i_5_]
                            = (byte) (-81 + i_7_);
            }
        }
        if (i_4_ <= 25)
            method1555(-35, (byte) -31);
    }

    public static boolean method1555(int i, byte i_9_) {
        if (i_9_ > -112)
            return false;
        anInt1698++;
        if ((0x1 & i >> -245386763 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    public static int method1556(boolean bool, int i, int i_10_, int i_11_) {
        Class68_Sub22 class68_sub22
                = ((Class68_Sub22)
                Class68_Sub13_Sub8.aClass113_3564.method1678((long) i_10_,
                        -60));
        anInt1693++;
        if (class68_sub22 == null)
            return 0;
        int i_12_ = 0;
        for (int i_13_ = i_11_; class68_sub22.anIntArray3144.length > i_13_;
             i_13_++) {
            if (class68_sub22.anIntArray3144[i_13_] >= 0
                    && ((Class14.anInt233 ^ 0xffffffff)
                    < (class68_sub22.anIntArray3144[i_13_] ^ 0xffffffff))) {
                ItemDef class19
                        = Applet_Sub1.method18(-25672, (class68_sub22
                        .anIntArray3144[i_13_]));
                if (class19.aClass113_394 != null) {
                    Class68_Sub10 class68_sub10
                            = ((Class68_Sub10)
                            class19.aClass113_394.method1678((long) i, -103));
                    if (class68_sub10 != null) {
                        if (!bool)
                            i_12_ += class68_sub10.anInt2902;
                        else
                            i_12_ += (class68_sub22.anIntArray3141[i_13_]
                                    * class68_sub10.anInt2902);
                    }
                }
            }
        }
        return i_12_;
    }

    static {
        aClass98_1694 = new Class98(5);
        aRSString_1697 = RSString.newRsString("<)4col>");
        anIntArray1701
                = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047,
                4095, 8191, 16383, 32767, 65535, 131071, 262143,
                524287, 1048575, 2097151, 4194303, 8388607, 16777215,
                33554431, 67108863, 134217727, 268435455, 536870911,
                1073741823, 2147483647, -1};
    }
}
