/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class40 {
    public int anInt687;
    public int anInt688;
    public int[] anIntArray689;
    public int anInt690;
    public int anInt691;
    public int anInt692;
    public int anInt693 = Class68_Sub21.method1190(16);

    public void method467(float[] fs, int i, boolean bool) {
        for (int i_0_ = 0; i_0_ < i; i_0_++)
            fs[i_0_] = 0.0F;
        if (!bool) {
            int i_1_ = Class68_Sub21.aClass24Array3123[anInt688].anInt504;
            int i_2_ = anInt691 - anInt687;
            int i_3_ = i_2_ / anInt690;
            int[] is = new int[i_3_];
            for (int i_4_ = 0; i_4_ < 8; i_4_++) {
                int i_5_ = 0;
                while (i_5_ < i_3_) {
                    if (i_4_ == 0) {
                        int i_6_ = Class68_Sub21.aClass24Array3123
                                [anInt688].method383();
                        for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
                            if (i_5_ + i_7_ < i_3_)
                                is[i_5_ + i_7_] = i_6_ % anInt692;
                            i_6_ /= anInt692;
                        }
                    }
                    for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
                        int i_9_ = is[i_5_];
                        int i_10_ = anIntArray689[i_9_ * 8 + i_4_];
                        if (i_10_ >= 0) {
                            int i_11_ = anInt687 + i_5_ * anInt690;
                            Class24 class24
                                    = Class68_Sub21.aClass24Array3123[i_10_];
                            if (anInt693 == 0) {
                                int i_12_ = anInt690 / class24.anInt504;
                                for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
                                    float[] fs_14_ = class24.method380();
                                    for (int i_15_ = 0;
                                         i_15_ < class24.anInt504; i_15_++)
                                        fs[i_11_ + i_13_ + i_15_ * i_12_]
                                                += fs_14_[i_15_];
                                }
                            } else {
                                int i_16_ = 0;
                                while (i_16_ < anInt690) {
                                    float[] fs_17_ = class24.method380();
                                    for (int i_18_ = 0;
                                         i_18_ < class24.anInt504; i_18_++) {
                                        fs[i_11_ + i_16_] += fs_17_[i_18_];
                                        i_16_++;
                                    }
                                }
                            }
                        }
                        if (++i_5_ >= i_3_)
                            break;
                    }
                }
            }
        }
    }

    public Class40() {
        anInt687 = Class68_Sub21.method1190(24);
        anInt691 = Class68_Sub21.method1190(24);
        anInt690 = Class68_Sub21.method1190(24) + 1;
        anInt692 = Class68_Sub21.method1190(6) + 1;
        anInt688 = Class68_Sub21.method1190(8);
        int[] is = new int[anInt692];
        for (int i = 0; i < anInt692; i++) {
            int i_19_ = 0;
            int i_20_ = Class68_Sub21.method1190(3);
            boolean bool = Class68_Sub21.method1196() != 0;
            if (bool)
                i_19_ = Class68_Sub21.method1190(5);
            is[i] = i_19_ << 3 | i_20_;
        }
        anIntArray689 = new int[anInt692 * 8];
        for (int i = 0; i < anInt692 * 8; i++)
            anIntArray689[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0
                    ? Class68_Sub21.method1190(8) : -1);
    }
}
