/* Class68_Sub13_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub22 extends Class68_Sub13 {
    public static int[] anIntArray3805;
    public static short aShort3806 = 32767;
    public int anInt3807 = 1;
    public static RSString aRSString_3808 = RSString.newRsString(" x ");
    public static int anInt3809;
    public static int anInt3810;
    public static Class68_Sub20_Sub15 aClass68_Sub20_Sub15_3811;
    public static float aFloat3812;
    public static int anInt3813;
    public int anInt3814 = 1;
    public static int anInt3815;

    public static void method810(byte i) {
        aRSString_3808 = null;
        anIntArray3805 = null;
        aClass68_Sub20_Sub15_3811 = null;
        if (i <= 10)
            method811(31, -36, 15);
    }

    public Class68_Sub13_Sub22() {
        super(1, false);
    }

    public void method700(Stream class68_sub14, int i, int i_0_) {
        if (i_0_ != -1)
            aShort3806 = (short) -91;
        anInt3813++;
        int i_1_ = i;
        while_95_:
        do {
            do {
                if ((i_1_ ^ 0xffffffff) != -1) {
                    if (i_1_ != 1) {
                        if ((i_1_ ^ 0xffffffff) == -3)
                            break;
                        break while_95_;
                    }
                } else {
                    anInt3814 = class68_sub14.readUnsignedByte(-6677);
                    return;
                }
                anInt3807 = class68_sub14.readUnsignedByte(-6677);
                return;
            } while (false);
            aBoolean2931 = class68_sub14.readUnsignedByte(i_0_ ^ 0x1a14) == 1;
        } while (false);
    }

    public int[][] method697(int i, boolean bool) {
        if (bool != true)
            method812(123, -69, -104);
        anInt3815++;
        int[][] is = aClass88_2939.method1496(i, (byte) -5);
        if (aClass88_2939.aBoolean1610) {
            int i_2_ = anInt3807 + (anInt3807 - -1);
            int i_3_ = 65536 / i_2_;
            int i_4_ = 1 + (anInt3814 - -anInt3814);
            int[][][] is_5_ = new int[i_2_][][];
            int i_6_ = 65536 / i_4_;
            for (int i_7_ = -anInt3807 + i;
                 (anInt3807 + i ^ 0xffffffff) <= (i_7_ ^ 0xffffffff); i_7_++) {
                int[][] is_8_
                        = this.method699(-53, 0,
                        i_7_ & Class1_Sub6_Sub2.anInt3432);
                int[][] is_9_ = new int[3][Class68_Sub13_Sub19.anInt3746];
                int i_10_ = 0;
                int i_11_ = 0;
                int i_12_ = 0;
                int[] is_13_ = is_8_[2];
                int[] is_14_ = is_8_[0];
                int[] is_15_ = is_8_[1];
                for (int i_16_ = -anInt3814; i_16_ <= anInt3814; i_16_++) {
                    int i_17_ = i_16_ & Class30.anInt543;
                    i_11_ += is_13_[i_17_];
                    i_12_ += is_15_[i_17_];
                    i_10_ += is_14_[i_17_];
                }
                int[] is_18_ = is_9_[0];
                int[] is_19_ = is_9_[1];
                int[] is_20_ = is_9_[2];
                int i_21_ = 0;
                while ((i_21_ ^ 0xffffffff)
                        > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)) {
                    is_18_[i_21_] = i_6_ * i_10_ >> 1286472336;
                    is_19_[i_21_] = i_12_ * i_6_ >> -1207358160;
                    is_20_[i_21_] = i_11_ * i_6_ >> -1475118032;
                    int i_22_ = i_21_ - anInt3814 & Class30.anInt543;
                    i_11_ -= is_13_[i_22_];
                    i_10_ -= is_14_[i_22_];
                    i_21_++;
                    i_12_ -= is_15_[i_22_];
                    i_22_ = Class30.anInt543 & anInt3814 + i_21_;
                    i_10_ += is_14_[i_22_];
                    i_11_ += is_13_[i_22_];
                    i_12_ += is_15_[i_22_];
                }
                is_5_[-i + i_7_ - -anInt3807] = is_9_;
            }
            int[] is_23_ = is[1];
            int[] is_24_ = is[0];
            int[] is_25_ = is[2];
            for (int i_26_ = 0; Class68_Sub13_Sub19.anInt3746 > i_26_;
                 i_26_++) {
                int i_27_ = 0;
                int i_28_ = 0;
                int i_29_ = 0;
                for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
                     i_30_++) {
                    int[][] is_31_ = is_5_[i_30_];
                    i_28_ += is_31_[1][i_26_];
                    i_29_ += is_31_[2][i_26_];
                    i_27_ += is_31_[0][i_26_];
                }
                is_24_[i_26_] = i_3_ * i_27_ >> 1830240528;
                is_23_[i_26_] = i_28_ * i_3_ >> -1467325008;
                is_25_[i_26_] = i_29_ * i_3_ >> -1725579088;
            }
        }
        return is;
    }

    public static Class57 method811(int i, int i_32_, int i_33_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_32_][i_33_];
        if (class68_sub1 == null)
            return null;
        Class57 class57 = class68_sub1.aClass57_2759;
        class68_sub1.aClass57_2759 = null;
        return class57;
    }

    public static Class47 method812(int i, int i_34_, int i_35_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_34_][i_35_];
        if (class68_sub1 == null)
            return null;
        Class47 class47 = class68_sub1.aClass47_2777;
        class68_sub1.aClass47_2777 = null;
        return class47;
    }

    public int[] method698(byte i, int i_36_) {
        int[] is = aClass115_2936.method1697(false, i_36_);
        if (i != -61)
            return null;
        if (aClass115_2936.aBoolean1957) {
            int i_37_ = 1 + (anInt3814 + anInt3814);
            int i_38_ = 1 + anInt3807 + anInt3807;
            int i_39_ = 65536 / i_37_;
            int[][] is_40_ = new int[i_38_][];
            for (int i_41_ = -anInt3807 + i_36_;
                 (i_41_ ^ 0xffffffff) >= (i_36_ - -anInt3807 ^ 0xffffffff);
                 i_41_++) {
                int[] is_42_
                        = this.method696(0, Class1_Sub6_Sub2.anInt3432 & i_41_,
                        29149);
                int i_43_ = 0;
                for (int i_44_ = -anInt3814;
                     (i_44_ ^ 0xffffffff) >= (anInt3814 ^ 0xffffffff); i_44_++)
                    i_43_ += is_42_[Class30.anInt543 & i_44_];
                int[] is_45_ = new int[Class68_Sub13_Sub19.anInt3746];
                int i_46_ = 0;
                while (i_46_ < Class68_Sub13_Sub19.anInt3746) {
                    is_45_[i_46_] = i_39_ * i_43_ >> 280919120;
                    i_43_ -= is_42_[Class30.anInt543 & i_46_ + -anInt3814];
                    i_46_++;
                    i_43_ += is_42_[Class30.anInt543 & i_46_ + anInt3814];
                }
                is_40_[-i_36_ + anInt3807 + i_41_] = is_45_;
            }
            int i_47_ = 65536 / i_38_;
            for (int i_48_ = 0; Class68_Sub13_Sub19.anInt3746 > i_48_;
                 i_48_++) {
                int i_49_ = 0;
                for (int i_50_ = 0; i_38_ > i_50_; i_50_++)
                    i_49_ += is_40_[i_50_][i_48_];
                is[i_48_] = i_49_ * i_47_ >> 1060602928;
            }
        }
        anInt3809++;
        return is;
    }
}
