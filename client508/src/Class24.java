/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class24 {
    public int anInt504;
    public int[] anIntArray505;
    public float[][] aFloatArrayArray506;
    public int anInt507;
    public int[] anIntArray508;
    public int[] anIntArray509;

    public float[] method380() {
        return aFloatArrayArray506[method383()];
    }

    public static int method381(int i, int i_0_) {
        int i_1_;
        for (i_1_ = (int) Math.pow((double) i, 1.0 / (double) i_0_) + 1;
             Class68_Sub19.method997(i_0_, i_1_, 107) > i; i_1_--) {
            /* empty */
        }
        return i_1_;
    }

    public void method382() {
        int[] is = new int[anInt507];
        int[] is_2_ = new int[33];
        for (int i = 0; i < anInt507; i++) {
            int i_3_ = anIntArray508[i];
            if (i_3_ != 0) {
                int i_4_ = 1 << 32 - i_3_;
                int i_5_ = is_2_[i_3_];
                is[i] = i_5_;
                int i_6_;
                if ((i_5_ & i_4_) != 0)
                    i_6_ = is_2_[i_3_ - 1];
                else {
                    i_6_ = i_5_ | i_4_;
                    for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
                        int i_8_ = is_2_[i_7_];
                        if (i_8_ != i_5_)
                            break;
                        int i_9_ = 1 << 32 - i_7_;
                        if ((i_8_ & i_9_) != 0) {
                            is_2_[i_7_] = is_2_[i_7_ - 1];
                            break;
                        }
                        is_2_[i_7_] = i_8_ | i_9_;
                    }
                }
                is_2_[i_3_] = i_6_;
                for (int i_10_ = i_3_ + 1; i_10_ <= 32; i_10_++) {
                    int i_11_ = is_2_[i_10_];
                    if (i_11_ == i_5_)
                        is_2_[i_10_] = i_6_;
                }
            }
        }
        anIntArray509 = new int[8];
        int i = 0;
        for (int i_12_ = 0; i_12_ < anInt507; i_12_++) {
            int i_13_ = anIntArray508[i_12_];
            if (i_13_ != 0) {
                int i_14_ = is[i_12_];
                int i_15_ = 0;
                for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
                    int i_17_ = -2147483648 >>> i_16_;
                    if ((i_14_ & i_17_) != 0) {
                        if (anIntArray509[i_15_] == 0)
                            anIntArray509[i_15_] = i;
                        i_15_ = anIntArray509[i_15_];
                    } else
                        i_15_++;
                    if (i_15_ >= anIntArray509.length) {
                        int[] is_18_ = new int[anIntArray509.length * 2];
                        for (int i_19_ = 0; i_19_ < anIntArray509.length;
                             i_19_++)
                            is_18_[i_19_] = anIntArray509[i_19_];
                        anIntArray509 = is_18_;
                    }
                    i_17_ >>>= 1;
                }
                anIntArray509[i_15_] = i_12_ ^ 0xffffffff;
                if (i_15_ >= i)
                    i = i_15_ + 1;
            }
        }
    }

    public Class24() {
        Class68_Sub21.method1190(24);
        anInt504 = Class68_Sub21.method1190(16);
        anInt507 = Class68_Sub21.method1190(24);
        anIntArray508 = new int[anInt507];
        boolean bool = Class68_Sub21.method1196() != 0;
        if (bool) {
            int i = 0;
            int i_20_ = Class68_Sub21.method1190(5) + 1;
            while (i < anInt507) {
                int i_21_ = (Class68_Sub21.method1190
                        (Class92.method1526(anInt507 - i, (byte) -108)));
                for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
                    anIntArray508[i++] = i_20_;
                i_20_++;
            }
        } else {
            boolean bool_23_ = Class68_Sub21.method1196() != 0;
            for (int i = 0; i < anInt507; i++) {
                if (bool_23_ && Class68_Sub21.method1196() == 0)
                    anIntArray508[i] = 0;
                else
                    anIntArray508[i] = Class68_Sub21.method1190(5) + 1;
            }
        }
        method382();
        int i = Class68_Sub21.method1190(4);
        if (i > 0) {
            float f = Class68_Sub21.method1197(Class68_Sub21.method1190(32));
            float f_24_
                    = Class68_Sub21.method1197(Class68_Sub21.method1190(32));
            int i_25_ = Class68_Sub21.method1190(4) + 1;
            boolean bool_26_ = Class68_Sub21.method1196() != 0;
            int i_27_;
            if (i == 1)
                i_27_ = method381(anInt507, anInt504);
            else
                i_27_ = anInt507 * anInt504;
            anIntArray505 = new int[i_27_];
            for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
                anIntArray505[i_28_] = Class68_Sub21.method1190(i_25_);
            aFloatArrayArray506 = new float[anInt507][anInt504];
            if (i == 1) {
                for (int i_29_ = 0; i_29_ < anInt507; i_29_++) {
                    float f_30_ = 0.0F;
                    int i_31_ = 1;
                    for (int i_32_ = 0; i_32_ < anInt504; i_32_++) {
                        int i_33_ = i_29_ / i_31_ % i_27_;
                        float f_34_
                                = (float) anIntArray505[i_33_] * f_24_ + f + f_30_;
                        aFloatArrayArray506[i_29_][i_32_] = f_34_;
                        if (bool_26_)
                            f_30_ = f_34_;
                        i_31_ *= i_27_;
                    }
                }
            } else {
                for (int i_35_ = 0; i_35_ < anInt507; i_35_++) {
                    float f_36_ = 0.0F;
                    int i_37_ = i_35_ * anInt504;
                    for (int i_38_ = 0; i_38_ < anInt504; i_38_++) {
                        float f_39_
                                = (float) anIntArray505[i_37_] * f_24_ + f + f_36_;
                        aFloatArrayArray506[i_35_][i_38_] = f_39_;
                        if (bool_26_)
                            f_36_ = f_39_;
                        i_37_++;
                    }
                }
            }
        }
    }

    public int method383() {
        int i;
        for (i = 0; anIntArray509[i] >= 0;
             i = Class68_Sub21.method1196() != 0 ? anIntArray509[i] : i + 1) {
            /* empty */
        }
        return anIntArray509[i] ^ 0xffffffff;
    }
}
