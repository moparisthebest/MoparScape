/* Class68_Sub13_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub20 extends Class68_Sub13 {
    public int anInt3760 = 0;
    public int anInt3761;
    public static int anInt3762;
    public static int anInt3763;
    public int anInt3764;
    public static Class98 aClass98_3765 = new Class98(30);
    public int anInt3766;
    public static int anInt3767;
    public static int anInt3768;
    public int anInt3769 = 0;
    public int anInt3770 = 0;
    public int anInt3771;
    public static int anInt3772;
    public static int anInt3773;
    public static int anInt3774;
    public int anInt3775;
    public static int anInt3776;
    public int anInt3777;
    public static Class98 aClass98_3778 = new Class98(20);
    public static short[] aShortArray3779;
    public static int anInt3780;
    public static RSString aRSString_3781
            = RSString.newRsString("Speicher wird zugewiesen)3");
    public static RSString aRSString_3782;
    public static RSString aRSString_3783;
    public static RSString aRSString_3784;

    public static int method798(int i, int i_0_) {
        anInt3776++;
        if (i != 26151)
            method803(-53, 103, -43);
        int i_1_ = i_0_ * 6 + -61440;
        int i_2_ = 40960 - -(i_1_ * i_0_ >> 176455820);
        int i_3_ = (i_0_ * i_0_ >> -966678452) * i_0_ >> -1617612404;
        return i_3_ * i_2_ >> -1878668532;
    }

    public void method700(Stream class68_sub14, int i, int i_4_) {
        int i_5_ = i;
        while_89_:
        do {
            do {
                if ((i_5_ ^ 0xffffffff) != -1) {
                    if ((i_5_ ^ 0xffffffff) != -2) {
                        if (i_5_ == 2)
                            break;
                        break while_89_;
                    }
                } else {
                    anInt3770 = class68_sub14.method957(i_4_ ^ 0x57d8);
                    break while_89_;
                }
                anInt3760
                        = (class68_sub14.method955(3390) << 1048193548) / 100;
                break while_89_;
            } while (false);
            anInt3769 = (class68_sub14.method955(3390) << 1256237644) / 100;
        } while (false);
        if (i_4_ != -1)
            method803(-91, -92, 95);
        anInt3774++;
    }

    public int[][] method697(int i, boolean bool) {
        anInt3772++;
        if (bool != true)
            return null;
        int[][] is = aClass88_2939.method1496(i, (byte) 87);
        if (aClass88_2939.aBoolean1610) {
            int[][] is_6_ = this.method699(-40, 0, i);
            int[] is_7_ = is_6_[1];
            int[] is_8_ = is[0];
            int[] is_9_ = is_6_[2];
            int[] is_10_ = is[1];
            int[] is_11_ = is_6_[0];
            int[] is_12_ = is[2];
            for (int i_13_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_13_ ^ 0xffffffff)); i_13_++) {
                method800(is_7_[i_13_], is_9_[i_13_], is_11_[i_13_], false);
                anInt3766 += anInt3769;
                anInt3764 += anInt3770;
                if ((anInt3766 ^ 0xffffffff) > -1)
                    anInt3766 = 0;
                anInt3777 += anInt3760;
                if ((anInt3766 ^ 0xffffffff) < -4097)
                    anInt3766 = 4096;
                for (/**/; (anInt3764 ^ 0xffffffff) > -1; anInt3764 += 4096) {
                    /* empty */
                }
                if ((anInt3777 ^ 0xffffffff) > -1)
                    anInt3777 = 0;
                for (/**/; anInt3764 > 4096; anInt3764 -= 4096) {
                    /* empty */
                }
                if (anInt3777 > 4096)
                    anInt3777 = 4096;
                method804(anInt3766, false, anInt3764, anInt3777);
                is_8_[i_13_] = anInt3761;
                is_10_[i_13_] = anInt3775;
                is_12_[i_13_] = anInt3771;
            }
        }
        return is;
    }

    public Class68_Sub13_Sub20() {
        super(1, false);
    }

    public static void method799(byte i) {
        if ((Class16.anInt275 ^ 0xffffffff) > -129)
            Class16.anInt275 = 128;
        if (Class16.anInt275 > 383)
            Class16.anInt275 = 383;
        anInt3767++;
        Class8.anInt163 &= 0x7ff;
        int i_14_ = Class68_Sub20_Sub2.anInt4186 >> -14897657;
        int i_15_ = Class68_Sub20_Sub18.anInt4449 >> -909518393;
        int i_16_
                = Class1_Sub6_Sub2.method163(Class68_Sub20_Sub2.anInt4186,
                GameSocket.anInt1149,
                Class68_Sub20_Sub18.anInt4449, false);
        int i_17_ = 0;
        if (i_14_ > 3 && i_15_ > 3 && i_14_ < 100
                && (i_15_ ^ 0xffffffff) > -101) {
            for (int i_18_ = -4 + i_14_; i_18_ <= 4 + i_14_; i_18_++) {
                for (int i_19_ = -4 + i_15_; i_19_ <= 4 + i_15_; i_19_++) {
                    int i_20_ = GameSocket.anInt1149;
                    if ((i_20_ ^ 0xffffffff) > -4
                            && (Class64.aByteArrayArrayArray1178[1][i_18_][i_19_]
                            & 0x2) == 2)
                        i_20_++;
                    int i_21_ = (-(Class68_Sub20_Sub12.anIntArrayArrayArray4353
                            [i_20_][i_18_][i_19_])
                            + i_16_);
                    if (i_17_ < i_21_)
                        i_17_ = i_21_;
                }
            }
        }
        int i_22_ = 192 * i_17_;
        if (i <= -22) {
            if ((i_22_ ^ 0xffffffff) < -98049)
                i_22_ = 98048;
            if ((i_22_ ^ 0xffffffff) > -32769)
                i_22_ = 32768;
            if ((i_22_ ^ 0xffffffff) < (Class68_Sub29.anInt3233 ^ 0xffffffff))
                Class68_Sub29.anInt3233
                        += (i_22_ + -Class68_Sub29.anInt3233) / 24;
            else if (Class68_Sub29.anInt3233 > i_22_)
                Class68_Sub29.anInt3233
                        += (i_22_ + -Class68_Sub29.anInt3233) / 80;
        }
    }

    public void method800(int i, int i_23_, int i_24_, boolean bool) {
        anInt3762++;
        int i_25_ = i_24_ < i ? i_24_ : i;
        int i_26_ = (i_24_ ^ 0xffffffff) >= (i ^ 0xffffffff) ? i : i_24_;
        i_26_ = (i_23_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff) ? i_23_ : i_26_;
        i_25_ = (i_25_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff) ? i_23_ : i_25_;
        anInt3766 = (i_26_ + i_25_) / 2;
        int i_27_ = -i_25_ + i_26_;
        if ((anInt3766 ^ 0xffffffff) < -1 && anInt3766 < 4096)
            anInt3777
                    = (i_27_ << -1546870612) / (anInt3766 <= 2048 ? anInt3766 * 2
                    : 8192 - 2 * anInt3766);
        else
            anInt3777 = 0;
        if (i_27_ > 0) {
            int i_28_ = (-i_24_ + i_26_ << 1780777132) / i_27_;
            int i_29_ = (i_26_ - i << 1472044620) / i_27_;
            int i_30_ = (i_26_ + -i_23_ << 1198254060) / i_27_;
            if ((i_26_ ^ 0xffffffff) != (i_24_ ^ 0xffffffff)) {
                if ((i ^ 0xffffffff) == (i_26_ ^ 0xffffffff))
                    anInt3764 = i_25_ != i_23_ ? 12288 + -i_30_ : i_28_ + 4096;
                else
                    anInt3764 = ((i_25_ ^ 0xffffffff) != (i_24_ ^ 0xffffffff)
                            ? -i_28_ + 20480 : 12288 + i_29_);
            } else
                anInt3764 = i_25_ != i ? 4096 - i_29_ : i_30_ + 20480;
            anInt3764 /= 6;
        } else
            anInt3764 = 0;
        if (bool != false)
            aRSString_3781 = null;
    }

    public static void method801(int i) {
        aRSString_3781 = null;
        aClass98_3765 = null;
        aShortArray3779 = null;
        aRSString_3783 = null;
        aRSString_3784 = null;
        aRSString_3782 = null;
        if (i != -22338)
            method802(68);
        aClass98_3778 = null;
    }

    public static void method802(int i) {
        anInt3773++;
        while (Class68_Sub13_Sub8.inStream.method970(Class106.anInt1804, -128) >= 11) {
            int i_31_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 11);
            if (i_31_ == 2047)
                break;
            boolean bool = false;
            if (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_31_] == null) {
                bool = true;
                Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_31_] = new Class1_Sub6_Sub2();
                if (Class68_Sub1.aStreamArray2755[i_31_] != null)
                    Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_31_].method159(Class68_Sub1.aStreamArray2755[i_31_], (byte) -12);
            }
            Class85.anIntArray1563[client.anInt2382++] = i_31_;
            Class1_Sub6_Sub2 class1_sub6_sub2 = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_31_];
            class1_sub6_sub2.anInt2575 = Class68_Sub3.anInt2812;
            int i_32_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 5);
            int i_33_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
            if (i_33_ == 1)
                PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = i_31_;
            int i_34_ = (Class68_Sub13_Sub9.anIntArray3578[Class68_Sub13_Sub8.inStream.method967((byte) 0, 3)]);
            if (i_32_ > 15)
                i_32_ -= 32;
            if (bool)
                class1_sub6_sub2.anInt2533 = class1_sub6_sub2.anInt2548 = i_34_;
            int i_35_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
            int i_36_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 5);
            if (i_36_ > 15)
                i_36_ -= 32;
            class1_sub6_sub2.method147(Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0] + i_36_, (byte) -68,
                    Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0] + i_32_, i_35_ == 1);
        }
        int i_37_ = -46 / ((i - -42) / 42);
        Class68_Sub13_Sub8.inStream.method966((byte) -59);
    }

    public static boolean method803(int i, int i_38_, int i_39_) {
        if (i_39_ != -32276)
            anInt3780 = 11;
        anInt3763++;
        if ((i_38_ >> 1 + i & 0x1 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    public void method804(int i, boolean bool, int i_40_, int i_41_) {
        if (bool != false)
            anInt3769 = -97;
        int i_42_ = (i > 2048 ? -(i_41_ * i >> 463698700) + i_41_ + i
                : i * (4096 - -i_41_) >> 527559596);
        while_93_:
        do {
            if (i_42_ <= 0)
                anInt3761 = anInt3775 = anInt3771 = i;
            else {
                i_40_ *= 6;
                int i_43_ = i_40_ >> -1885464436;
                int i_44_ = -i_42_ + i - -i;
                int i_45_ = i_42_;
                int i_46_ = (-i_44_ + i_42_ << -1982504532) / i_42_;
                int i_47_ = -(i_43_ << -132334932) + i_40_;
                i_45_ = i_46_ * i_45_ >> 1173807372;
                i_45_ = i_45_ * i_47_ >> 994569804;
                int i_48_ = i_45_ + i_44_;
                int i_49_ = i_42_ - i_45_;
                int i_50_ = i_43_;
                while_92_:
                do {
                    while_91_:
                    do {
                        while_90_:
                        do {
                            do {
                                if ((i_50_ ^ 0xffffffff) != -1) {
                                    if (i_50_ != 1) {
                                        if ((i_50_ ^ 0xffffffff) != -3) {
                                            if (i_50_ != 3) {
                                                if ((i_50_ ^ 0xffffffff)
                                                        != -5) {
                                                    if ((i_50_ ^ 0xffffffff)
                                                            != -6)
                                                        break while_93_;
                                                } else
                                                    break while_91_;
                                                break while_92_;
                                            }
                                        } else
                                            break;
                                        break while_90_;
                                    }
                                } else {
                                    anInt3775 = i_48_;
                                    anInt3771 = i_44_;
                                    anInt3761 = i_42_;
                                    break while_93_;
                                }
                                anInt3771 = i_44_;
                                anInt3775 = i_42_;
                                anInt3761 = i_49_;
                                break while_93_;
                            } while (false);
                            anInt3771 = i_48_;
                            anInt3775 = i_42_;
                            anInt3761 = i_44_;
                            break while_93_;
                        } while (false);
                        anInt3761 = i_44_;
                        anInt3771 = i_42_;
                        anInt3775 = i_49_;
                        break while_93_;
                    } while (false);
                    anInt3771 = i_42_;
                    anInt3775 = i_44_;
                    anInt3761 = i_48_;
                    break while_93_;
                } while (false);
                anInt3761 = i_42_;
                anInt3775 = i_44_;
                anInt3771 = i_49_;
            }
        } while (false);
        anInt3768++;
    }

    static {
        anInt3780 = 0;
        aShortArray3779 = new short[]{-10304, 9104, -1, -1, -1};
        aRSString_3784 = RSString.newRsString("flash1:");
        aRSString_3783 = aRSString_3784;
        aRSString_3782 = aRSString_3784;
    }
}
