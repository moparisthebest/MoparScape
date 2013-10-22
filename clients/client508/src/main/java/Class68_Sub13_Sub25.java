/* Class68_Sub13_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub25 extends Class68_Sub13 {
    public static int anInt3848;
    public static int anInt3849;
    public static int anInt3850;
    public static RSString aRSString_3851;
    public int[] anIntArray3852;
    public static int anInt3853;
    public static short[] aShortArray3854;
    public static int anInt3855 = 255;
    public static int anInt3856 = 0;
    public static int anInt3857;
    public static int anInt3858;
    public int[] anIntArray3859;
    public int[][] anIntArrayArray3860;
    public static int anInt3861;
    public static int anInt3862;
    public static int anInt3863;
    public static RSString aRSString_3864;
    public static int anInt3865;
    public int anInt3866;
    public short[] aShortArray3867 = new short[257];
    public static RSString aRSString_3868;
    public static RSString aRSString_3869;

    public void method690(byte i) {
        if (anIntArrayArray3860 == null)
            anIntArrayArray3860 = new int[][]{new int[2], {4096, 4096}};
        anInt3862++;
        if (anIntArrayArray3860.length < 2)
            throw new RuntimeException
                    ("Curve operation requires at least two markers");
        if (anInt3866 == 2)
            method822((byte) 100);
        if (i >= -22)
            anInt3853 = 22;
        Class68_Sub10.method683((byte) -128);
        method823((byte) 63);
    }

    public static void method820(int i) {
        aRSString_3851 = null;
        aShortArray3854 = null;
        if (i != -1)
            anInt3858 = -3;
        aRSString_3868 = null;
        aRSString_3864 = null;
        aRSString_3869 = null;
    }

    public void method700(Stream class68_sub14, int i, int i_0_) {
        if (i == 0) {
            anInt3866 = class68_sub14.readUnsignedByte(i_0_ ^ 0x1a14);
            anIntArrayArray3860 = new int[class68_sub14.readUnsignedByte(-6677)][2];
            for (int i_1_ = 0; i_1_ < anIntArrayArray3860.length; i_1_++) {
                anIntArrayArray3860[i_1_][0]
                        = class68_sub14.readUnsignedWord(i_0_ + 1355769545);
                anIntArrayArray3860[i_1_][1]
                        = class68_sub14.readUnsignedWord(Class15.method278(i_0_,
                        -1355769545));
            }
        }
        if (i_0_ != -1)
            anInt3853 = 120;
        anInt3849++;
    }

    public static void method821(boolean bool) {
        if (!Class120.aBoolean2099) {
            Class68_Sub13_Sub21.anInt3803 = 1;
            Class68_Sub28_Sub1.aShortArray4471[0] = (short) 1004;
            Class71_Sub1.aRSStringArray3257[0] = Class34.aRSString_598;
            Class33.aRSStringArray582[0] = Class68_Sub28_Sub2.aRSString_4556;
            if ((Class47.anInt940 ^ 0xffffffff) == -1) {
                if ((Class29.anInt537 ^ 0xffffffff) != -1) {
                    Class92.anInt1646 = Class125.anInt2173;
                    Class68_Sub25.anInt3176 = Class68_Sub13_Sub37.anInt4077;
                } else {
                    Class68_Sub25.anInt3176 = Class96.anInt1695;
                    Class92.anInt1646 = Class13.anInt223;
                }
            } else {
                Class92.anInt1646 = Class68_Sub13_Sub16.anInt3705;
                Class68_Sub25.anInt3176 = Class13_Sub4.anInt2682;
            }
        }
        if ((Class68_Sub13_Sub10.anInt3595 ^ 0xffffffff) != 0)
            Class43.method480(Class68_Sub13_Sub10.anInt3595, -1);
        anInt3865++;
        for (int i = 0; i < Class56.anInt1061; i++) {
            if (Class121.aBooleanArray2109[i])
                Class68_Sub17.aBooleanArray3037[i] = true;
            Class4.aBooleanArray95[i] = Class121.aBooleanArray2109[i];
            Class121.aBooleanArray2109[i] = false;
        }
        Class68_Sub2.anInt2798 = -1;
        Class3.aClass45_73 = null;
        Class68_Sub13_Sub34.anInt4013 = Class68_Sub3.anInt2812;
        if (bool != true)
            method824(-36, (byte) 44);
        Class16.anInt276 = -1;
        if ((Class68_Sub13_Sub10.anInt3595 ^ 0xffffffff) != 0) {
            Class56.anInt1061 = 0;
            Class68_Sub20.method1004(0, 0, Class68_Sub13_Sub9.height, 0,
                    Class68_Sub13_Sub10.anInt3595, -1, 0,
                    Class13_Sub3.width, (byte) -112);
        }
        Class79.method1416();
        Class68_Sub13_Sub19.method792(6364);
        if (!Class120.aBoolean2099) {
            if ((Class68_Sub2.anInt2798 ^ 0xffffffff) != 0)
                Class28.method399(106, Class16.anInt276,
                        Class68_Sub2.anInt2798);
        } else
            Class68_Sub29.method1320(4);
        if (Class68_Sub20_Sub5.anInt4229 == 3) {
            for (int i = 0; i < Class56.anInt1061; i++) {
                if (Class4.aBooleanArray95[i])
                    Class79.method1435(Class105.anIntArray1795[i],
                            Class71.anIntArray1294[i],
                            ItemDef.anIntArray376[i],
                            Class1_Sub6_Sub2.anIntArray3430[i],
                            16711935, 128);
                else if (Class68_Sub17.aBooleanArray3037[i])
                    Class79.method1435(Class105.anIntArray1795[i],
                            Class71.anIntArray1294[i],
                            ItemDef.anIntArray376[i],
                            Class1_Sub6_Sub2.anIntArray3430[i],
                            16711680, 128);
            }
        }
        Class68_Sub13_Sub30.method850(Class109.anInt1844, (byte) -34,
                GameSocket.anInt1149,
                (Class68_Sub7.aClass1_Sub6_Sub2_2860
                        .anInt2537),
                (Class68_Sub7.aClass1_Sub6_Sub2_2860
                        .anInt2561));
        Class109.anInt1844 = 0;
    }

    public void method822(byte i) {
        anInt3863++;
        int[] is = anIntArrayArray3860[0];
        int[] is_2_ = anIntArrayArray3860[1];
        int[] is_3_ = anIntArrayArray3860[-1 + anIntArrayArray3860.length];
        int[] is_4_ = anIntArrayArray3860[-2 + anIntArrayArray3860.length];
        anIntArray3859 = new int[]{is[0] + (-is_2_[0] + is[0]),
                is[1] + is[1] - is_2_[1]};
        if (i != 100)
            aShortArray3854 = null;
        anIntArray3852 = new int[]{-is_3_[0] + is_4_[0] + is_4_[0],
                is_4_[1] + (-is_3_[1] + is_4_[1])};
    }

    public void method823(byte i) {
        anInt3861++;
        int i_5_ = anInt3866;
        while_115_:
        do {
            do {
                if ((i_5_ ^ 0xffffffff) != -3) {
                    if ((i_5_ ^ 0xffffffff) != -2)
                        break;
                } else {
                    for (i_5_ = 0; i_5_ < 257; i_5_++) {
                        int i_6_ = i_5_ << -531366396;
                        int i_7_;
                        for (i_7_ = 1; anIntArrayArray3860.length + -1 > i_7_;
                             i_7_++) {
                            if ((anIntArrayArray3860[i_7_][0] ^ 0xffffffff)
                                    < (i_6_ ^ 0xffffffff))
                                break;
                        }
                        int[] is = anIntArrayArray3860[i_7_];
                        int[] is_8_ = anIntArrayArray3860[i_7_ - 1];
                        int i_9_ = method825((byte) -124, -2 + i_7_)[1];
                        int i_10_ = is_8_[1];
                        int i_11_ = is[1];
                        int i_12_ = method825((byte) -125, 1 + i_7_)[1];
                        int i_13_ = ((-is_8_[0] + i_6_ << -1639158068)
                                / (is[0] + -is_8_[0]));
                        int i_14_ = i_13_ * i_13_ >> 923410828;
                        int i_15_ = i_10_ + i_12_ - (i_11_ - -i_9_);
                        int i_16_ = i_11_ + -i_9_;
                        int i_17_
                                = (i_15_ * i_13_ >> 1275727628) * i_14_ >> 2912588;
                        int i_18_ = i_9_ - i_10_ + -i_15_;
                        int i_19_ = i_18_ * i_14_ >> -1672939188;
                        int i_20_ = i_16_ * i_13_ >> 532892332;
                        int i_21_ = i_10_;
                        int i_22_ = i_21_ + i_19_ + (i_17_ + i_20_);
                        if ((i_22_ ^ 0xffffffff) >= 32767)
                            i_22_ = -32767;
                        if ((i_22_ ^ 0xffffffff) <= -32769)
                            i_22_ = 32767;
                        aShortArray3867[i_5_] = (short) i_22_;
                    }
                    break while_115_;
                }
                for (i_5_ = 0; (i_5_ ^ 0xffffffff) > -258; i_5_++) {
                    int i_23_ = i_5_ << 1595077924;
                    int i_24_;
                    for (i_24_ = 1;
                         ((anIntArrayArray3860.length - 1 ^ 0xffffffff)
                                 < (i_24_ ^ 0xffffffff));
                         i_24_++) {
                        if (anIntArrayArray3860[i_24_][0] > i_23_)
                            break;
                    }
                    int[] is = anIntArrayArray3860[-1 + i_24_];
                    int[] is_25_ = anIntArrayArray3860[i_24_];
                    int i_26_ = ((-is[0] + i_23_ << -1257354836)
                            / (is_25_[0] - is[0]));
                    int i_27_ = (4096 + -(Class78.anIntArray1394
                            [(0x1fe9 & i_26_) >> -22165883])
                            >> 612093569);
                    int i_28_ = 4096 + -i_27_;
                    int i_29_
                            = i_27_ * is_25_[1] + is[1] * i_28_ >> 1106155820;
                    if ((i_29_ ^ 0xffffffff) >= 32767)
                        i_29_ = -32767;
                    if ((i_29_ ^ 0xffffffff) <= -32769)
                        i_29_ = 32767;
                    aShortArray3867[i_5_] = (short) i_29_;
                }
                break while_115_;
            } while (false);
            for (i_5_ = 0; i_5_ < 257; i_5_++) {
                int i_30_ = i_5_ << -822171836;
                int i_31_;
                for (i_31_ = 1; i_31_ < -1 + anIntArrayArray3860.length;
                     i_31_++) {
                    if ((i_30_ ^ 0xffffffff)
                            > (anIntArrayArray3860[i_31_][0] ^ 0xffffffff))
                        break;
                }
                int[] is = anIntArrayArray3860[i_31_];
                int[] is_32_ = anIntArrayArray3860[-1 + i_31_];
                int i_33_
                        = (i_30_ + -is_32_[0] << 499248940) / (-is_32_[0] + is[0]);
                int i_34_ = -i_33_ + 4096;
                int i_35_
                        = is_32_[1] * i_34_ - -(is[1] * i_33_) >> -1985295316;
                if (i_35_ <= -32768)
                    i_35_ = -32767;
                if ((i_35_ ^ 0xffffffff) <= -32769)
                    i_35_ = 32767;
                aShortArray3867[i_5_] = (short) i_35_;
            }
        } while (false);
        if (i != 63)
            method700(null, 65, 75);
    }

    public static boolean method824(int i, byte i_36_) {
        anInt3850++;
        if (GameSocket.aBooleanArray1142[i])
            return true;
        if (!client.aClass21_2380.method333((byte) -126, i))
            return false;
        int i_37_ = client.aClass21_2380.method355(i, 0);
        if (i_37_ == 0) {
            GameSocket.aBooleanArray1142[i] = true;
            return true;
        }
        if (Class68_Sub13_Sub36.aClass45ArrayArray4040[i] == null)
            Class68_Sub13_Sub36.aClass45ArrayArray4040[i] = new Class45[i_37_];
        for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > (i_37_ ^ 0xffffffff);
             i_38_++) {
            if (Class68_Sub13_Sub36.aClass45ArrayArray4040[i][i_38_] == null) {
                byte[] is = client.aClass21_2380.method338(i_38_, 0, i);
                if (is != null) {
                    Class68_Sub13_Sub36.aClass45ArrayArray4040[i][i_38_]
                            = new Class45();
                    Class68_Sub13_Sub36.aClass45ArrayArray4040[i][i_38_]
                            .anInt792
                            = (i << -359621840) + i_38_;
                    if (is[0] != -1)
                        Class68_Sub13_Sub36.aClass45ArrayArray4040[i]
                                [i_38_].method498(-18165, new Stream(is));
                    else
                        Class68_Sub13_Sub36.aClass45ArrayArray4040[i]
                                [i_38_].method502(-2, new Stream(is));
                }
            }
        }
        if (i_36_ != -2)
            anInt3858 = -29;
        GameSocket.aBooleanArray1142[i] = true;
        return true;
    }

    public int[] method825(byte i, int i_39_) {
        anInt3848++;
        if (i > -117)
            return null;
        if ((i_39_ ^ 0xffffffff) > -1)
            return anIntArray3859;
        if (i_39_ >= anIntArrayArray3860.length)
            return anIntArray3852;
        return anIntArrayArray3860[i_39_];
    }

    public Class68_Sub13_Sub25() {
        super(1, true);
        anInt3866 = 0;
    }

    public int[] method698(byte i, int i_40_) {
        anInt3857++;
        int[] is = aClass115_2936.method1697(false, i_40_);
        if (aClass115_2936.aBoolean1957) {
            int[] is_41_ = this.method696(0, i_40_, 29149);
            for (int i_42_ = 0;
                 ((i_42_ ^ 0xffffffff)
                         > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                 i_42_++) {
                int i_43_ = is_41_[i_42_] >> -184885884;
                if (i_43_ < 0)
                    i_43_ = 0;
                if (i_43_ > 256)
                    i_43_ = 256;
                is[i_42_] = aShortArray3867[i_43_];
            }
        }
        if (i != -61)
            method824(-50, (byte) -96);
        return is;
    }

    static {
        aRSString_3851 = RSString.newRsString("mapscene");
        aShortArray3854 = new short[256];
        aRSString_3864 = RSString.newRsString("Started 3d library");
        aRSString_3868 = aRSString_3864;
        anInt3858 = 0;
        anInt3853 = 0;
        aRSString_3869 = RSString.newRsString("<img=0>");
    }
}
