/* Class68_Sub20_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub1_Sub1 extends Class68_Sub20_Sub1 {
    public byte[][] aByteArrayArray4614;

    public static void method1036(int[] is, byte[] is_0_, int i, int i_1_,
                                  int i_2_, int i_3_, int i_4_, int i_5_,
                                  int i_6_, int i_7_) {
        i = ((i & 0xff00ff) * i_7_ & ~0xff00ff) + ((i & 0xff00) * i_7_
                & 0xff0000) >> 8;
        i_7_ = 256 - i_7_;
        for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
            for (int i_9_ = -i_3_; i_9_ < 0; i_9_++) {
                if (is_0_[i_1_++] != 0) {
                    int i_10_ = is[i_2_];
                    is[i_2_++] = ((((i_10_ & 0xff00ff) * i_7_ & ~0xff00ff)
                            + ((i_10_ & 0xff00) * i_7_ & 0xff0000))
                            >> 8) + i;
                } else
                    i_2_++;
            }
            i_2_ += i_5_;
            i_1_ += i_6_;
        }
    }

    public void method1023(int i, int i_11_, int i_12_, int i_13_, int i_14_,
                           int i_15_, int i_16_, boolean bool) {
        int i_17_ = i_11_ + i_12_ * Class79.anInt1401;
        int i_18_ = Class79.anInt1401 - i_13_;
        int i_19_ = 0;
        int i_20_ = 0;
        if (i_12_ < Class79.anInt1403) {
            int i_21_ = Class79.anInt1403 - i_12_;
            i_14_ -= i_21_;
            i_12_ = Class79.anInt1403;
            i_20_ += i_21_ * i_13_;
            i_17_ += i_21_ * Class79.anInt1401;
        }
        if (i_12_ + i_14_ > Class79.anInt1404)
            i_14_ -= i_12_ + i_14_ - Class79.anInt1404;
        if (i_11_ < Class79.anInt1400) {
            int i_22_ = Class79.anInt1400 - i_11_;
            i_13_ -= i_22_;
            i_11_ = Class79.anInt1400;
            i_20_ += i_22_;
            i_17_ += i_22_;
            i_19_ += i_22_;
            i_18_ += i_22_;
        }
        if (i_11_ + i_13_ > Class79.anInt1398) {
            int i_23_ = i_11_ + i_13_ - Class79.anInt1398;
            i_13_ -= i_23_;
            i_19_ += i_23_;
            i_18_ += i_23_;
        }
        if (i_13_ > 0 && i_14_ > 0)
            method1036(Class79.anIntArray1402, aByteArrayArray4614[i], i_15_,
                    i_20_, i_17_, i_13_, i_14_, i_18_, i_19_, i_16_);
    }

    public Class68_Sub20_Sub1_Sub1(byte[] is) {
        super(is);
        aByteArrayArray4614 = new byte[256][];
    }

    public static void method1037(int[] is, byte[] is_24_, int i, int i_25_,
                                  int i_26_, int i_27_, int i_28_, int i_29_,
                                  int i_30_) {
        int i_31_ = -(i_27_ >> 2);
        i_27_ = -(i_27_ & 0x3);
        for (int i_32_ = -i_28_; i_32_ < 0; i_32_++) {
            for (int i_33_ = i_31_; i_33_ < 0; i_33_++) {
                if (is_24_[i_25_++] != 0)
                    is[i_26_++] = i;
                else
                    i_26_++;
                if (is_24_[i_25_++] != 0)
                    is[i_26_++] = i;
                else
                    i_26_++;
                if (is_24_[i_25_++] != 0)
                    is[i_26_++] = i;
                else
                    i_26_++;
                if (is_24_[i_25_++] != 0)
                    is[i_26_++] = i;
                else
                    i_26_++;
            }
            for (int i_34_ = i_27_; i_34_ < 0; i_34_++) {
                if (is_24_[i_25_++] != 0)
                    is[i_26_++] = i;
                else
                    i_26_++;
            }
            i_26_ += i_29_;
            i_25_ += i_30_;
        }
    }

    public void method1024(int i, int i_35_, int i_36_, int i_37_, int i_38_,
                           int i_39_, boolean bool) {
        int i_40_ = i_35_ + i_36_ * Class79.anInt1401;
        int i_41_ = Class79.anInt1401 - i_37_;
        int i_42_ = 0;
        int i_43_ = 0;
        if (i_36_ < Class79.anInt1403) {
            int i_44_ = Class79.anInt1403 - i_36_;
            i_38_ -= i_44_;
            i_36_ = Class79.anInt1403;
            i_43_ += i_44_ * i_37_;
            i_40_ += i_44_ * Class79.anInt1401;
        }
        if (i_36_ + i_38_ > Class79.anInt1404)
            i_38_ -= i_36_ + i_38_ - Class79.anInt1404;
        if (i_35_ < Class79.anInt1400) {
            int i_45_ = Class79.anInt1400 - i_35_;
            i_37_ -= i_45_;
            i_35_ = Class79.anInt1400;
            i_43_ += i_45_;
            i_40_ += i_45_;
            i_42_ += i_45_;
            i_41_ += i_45_;
        }
        if (i_35_ + i_37_ > Class79.anInt1398) {
            int i_46_ = i_35_ + i_37_ - Class79.anInt1398;
            i_37_ -= i_46_;
            i_42_ += i_46_;
            i_41_ += i_46_;
        }
        if (i_37_ > 0 && i_38_ > 0) {
            if (Class79.anIntArray1399 != null)
                method1038(Class79.anIntArray1402, aByteArrayArray4614[i],
                        i_35_, i_36_, i_37_, i_38_, i_39_, i_43_, i_40_,
                        i_41_, i_42_, Class79.anIntArray1399,
                        Class79.anIntArray1405);
            else
                method1037(Class79.anIntArray1402, aByteArrayArray4614[i],
                        i_39_, i_43_, i_40_, i_37_, i_38_, i_41_, i_42_);
        }
    }

    public Class68_Sub20_Sub1_Sub1(byte[] is, int[] is_47_, int[] is_48_,
                                   int[] is_49_, int[] is_50_,
                                   byte[][] is_51_) {
        super(is, is_47_, is_48_, is_49_, is_50_);
        aByteArrayArray4614 = new byte[256][];
        aByteArrayArray4614 = is_51_;
    }

    public static void method1038(int[] is, byte[] is_52_, int i, int i_53_,
                                  int i_54_, int i_55_, int i_56_, int i_57_,
                                  int i_58_, int i_59_, int i_60_,
                                  int[] is_61_, int[] is_62_) {
        int i_63_ = i - Class79.anInt1400;
        int i_64_ = i_53_ - Class79.anInt1403;
        for (int i_65_ = i_64_; i_65_ < i_64_ + i_55_; i_65_++) {
            int i_66_ = is_61_[i_65_];
            int i_67_ = is_62_[i_65_];
            int i_68_ = i_54_;
            if (i_63_ > i_66_) {
                int i_69_ = i_63_ - i_66_;
                if (i_69_ >= i_67_) {
                    i_57_ += i_54_ + i_60_;
                    i_58_ += i_54_ + i_59_;
                    continue;
                }
                i_67_ -= i_69_;
            } else {
                int i_70_ = i_66_ - i_63_;
                if (i_70_ >= i_54_) {
                    i_57_ += i_54_ + i_60_;
                    i_58_ += i_54_ + i_59_;
                    continue;
                }
                i_57_ += i_70_;
                i_68_ -= i_70_;
                i_58_ += i_70_;
            }
            int i_71_ = 0;
            if (i_68_ < i_67_)
                i_67_ = i_68_;
            else
                i_71_ = i_68_ - i_67_;
            for (int i_72_ = -i_67_; i_72_ < 0; i_72_++) {
                if (is_52_[i_57_++] != 0)
                    Class79.anIntArray1402[i_58_++] = i_56_;
                else
                    i_58_++;
            }
            i_57_ += i_71_ + i_60_;
            i_58_ += i_71_ + i_59_;
        }
    }
}
