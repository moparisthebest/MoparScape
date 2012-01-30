/* Class92_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92_Sub1 extends Class92 {
    public int[] anIntArray3331;
    public byte[] aByteArray3332;

    public void method1528(int i, int i_0_, int i_1_) {
        i += anInt1657;
        i_0_ += anInt1655;
        int i_2_ = i + i_0_ * Class79.anInt1401;
        int i_3_ = 0;
        int i_4_ = anInt1658;
        int i_5_ = anInt1659;
        int i_6_ = Class79.anInt1401 - i_5_;
        int i_7_ = 0;
        if (i_0_ < Class79.anInt1403) {
            int i_8_ = Class79.anInt1403 - i_0_;
            i_4_ -= i_8_;
            i_0_ = Class79.anInt1403;
            i_3_ += i_8_ * i_5_;
            i_2_ += i_8_ * Class79.anInt1401;
        }
        if (i_0_ + i_4_ > Class79.anInt1404)
            i_4_ -= i_0_ + i_4_ - Class79.anInt1404;
        if (i < Class79.anInt1400) {
            int i_9_ = Class79.anInt1400 - i;
            i_5_ -= i_9_;
            i = Class79.anInt1400;
            i_3_ += i_9_;
            i_2_ += i_9_;
            i_7_ += i_9_;
            i_6_ += i_9_;
        }
        if (i + i_5_ > Class79.anInt1398) {
            int i_10_ = i + i_5_ - Class79.anInt1398;
            i_5_ -= i_10_;
            i_7_ += i_10_;
            i_6_ += i_10_;
        }
        if (i_5_ > 0 && i_4_ > 0)
            method1537(Class79.anIntArray1402, aByteArray3332, anIntArray3331,
                    i_3_, i_2_, i_5_, i_4_, i_6_, i_7_, i_1_);
    }

    public void method1532() {
        byte[] is = new byte[anInt1659 * anInt1658];
        int i = 0;
        for (int i_11_ = 0; i_11_ < anInt1659; i_11_++) {
            for (int i_12_ = anInt1658 - 1; i_12_ >= 0; i_12_--)
                is[i++] = aByteArray3332[i_11_ + i_12_ * anInt1659];
        }
        aByteArray3332 = is;
        int i_13_ = anInt1655;
        anInt1655 = anInt1657;
        anInt1657 = anInt1645 - anInt1658 - i_13_;
        i_13_ = anInt1658;
        anInt1658 = anInt1659;
        anInt1659 = i_13_;
        i_13_ = anInt1645;
        anInt1645 = anInt1647;
        anInt1647 = i_13_;
    }

    public void method1533(int i, int i_14_, int i_15_) {
        for (int i_16_ = 0; i_16_ < anIntArray3331.length; i_16_++) {
            int i_17_ = anIntArray3331[i_16_] >> 16 & 0xff;
            i_17_ += i;
            if (i_17_ < 0)
                i_17_ = 0;
            else if (i_17_ > 255)
                i_17_ = 255;
            int i_18_ = anIntArray3331[i_16_] >> 8 & 0xff;
            i_18_ += i_14_;
            if (i_18_ < 0)
                i_18_ = 0;
            else if (i_18_ > 255)
                i_18_ = 255;
            int i_19_ = anIntArray3331[i_16_] & 0xff;
            i_19_ += i_15_;
            if (i_19_ < 0)
                i_19_ = 0;
            else if (i_19_ > 255)
                i_19_ = 255;
            anIntArray3331[i_16_] = (i_17_ << 16) + (i_18_ << 8) + i_19_;
        }
    }

    public static void method1534(int[] is, byte[] is_20_, int[] is_21_, int i,
                                  int i_22_, int i_23_, int i_24_, int i_25_,
                                  int i_26_, int i_27_, int i_28_, int i_29_) {
        int i_30_ = i;
        for (int i_31_ = -i_26_; i_31_ < 0; i_31_++) {
            int i_32_ = (i_22_ >> 16) * i_29_;
            for (int i_33_ = -i_25_; i_33_ < 0; i_33_++) {
                int i_34_ = is_20_[(i >> 16) + i_32_];
                if (i_34_ != 0)
                    is[i_23_++] = is_21_[i_34_ & 0xff];
                else
                    i_23_++;
                i += i_27_;
            }
            i_22_ += i_28_;
            i = i_30_;
            i_23_ += i_24_;
        }
    }

    public Class92_Sub1 method1535() {
        Class92_Sub1 class92_sub1_35_
                = new Class92_Sub1(anInt1659, anInt1658, anIntArray3331.length);
        class92_sub1_35_.anInt1647 = anInt1647;
        class92_sub1_35_.anInt1645 = anInt1645;
        class92_sub1_35_.anInt1657 = anInt1657;
        class92_sub1_35_.anInt1655 = anInt1655;
        int i = aByteArray3332.length;
        for (int i_36_ = 0; i_36_ < i; i_36_++)
            class92_sub1_35_.aByteArray3332[i_36_] = aByteArray3332[i_36_];
        class92_sub1_35_.anIntArray3331 = anIntArray3331;
        return class92_sub1_35_;
    }

    public static void method1536(int[] is, byte[] is_37_, int[] is_38_, int i,
                                  int i_39_, int i_40_, int i_41_, int i_42_,
                                  int i_43_, int i_44_) {
        int i_45_ = -(i_41_ >> 2);
        i_41_ = -(i_41_ & 0x3);
        for (int i_46_ = -i_42_; i_46_ < 0; i_46_++) {
            for (int i_47_ = i_45_; i_47_ < 0; i_47_++) {
                i = is_37_[i_39_++];
                if (i != 0)
                    is[i_40_++] = is_38_[i & 0xff];
                else
                    i_40_++;
                i = is_37_[i_39_++];
                if (i != 0)
                    is[i_40_++] = is_38_[i & 0xff];
                else
                    i_40_++;
                i = is_37_[i_39_++];
                if (i != 0)
                    is[i_40_++] = is_38_[i & 0xff];
                else
                    i_40_++;
                i = is_37_[i_39_++];
                if (i != 0)
                    is[i_40_++] = is_38_[i & 0xff];
                else
                    i_40_++;
            }
            for (int i_48_ = i_41_; i_48_ < 0; i_48_++) {
                i = is_37_[i_39_++];
                if (i != 0)
                    is[i_40_++] = is_38_[i & 0xff];
                else
                    i_40_++;
            }
            i_40_ += i_43_;
            i_39_ += i_44_;
        }
    }

    public static void method1537(int[] is, byte[] is_49_, int[] is_50_, int i,
                                  int i_51_, int i_52_, int i_53_, int i_54_,
                                  int i_55_, int i_56_) {
        int i_57_ = 256 - i_56_;
        for (int i_58_ = -i_53_; i_58_ < 0; i_58_++) {
            for (int i_59_ = -i_52_; i_59_ < 0; i_59_++) {
                int i_60_ = is_49_[i++];
                if (i_60_ != 0) {
                    i_60_ = is_50_[i_60_ & 0xff];
                    int i_61_ = is[i_51_];
                    is[i_51_++] = ((((i_60_ & 0xff00ff) * i_56_
                            + (i_61_ & 0xff00ff) * i_57_)
                            & ~0xff00ff)
                            + (((i_60_ & 0xff00) * i_56_
                            + (i_61_ & 0xff00) * i_57_)
                            & 0xff0000)) >> 8;
                } else
                    i_51_++;
            }
            i_51_ += i_54_;
            i += i_55_;
        }
    }

    public void method1538(int i, int i_62_, int i_63_, int i_64_) {
        int i_65_ = anInt1659;
        int i_66_ = anInt1658;
        int i_67_ = 0;
        int i_68_ = 0;
        int i_69_ = anInt1647;
        int i_70_ = anInt1645;
        int i_71_ = (i_69_ << 16) / i_63_;
        int i_72_ = (i_70_ << 16) / i_64_;
        if (anInt1657 > 0) {
            int i_73_ = ((anInt1657 << 16) + i_71_ - 1) / i_71_;
            i += i_73_;
            i_67_ += i_73_ * i_71_ - (anInt1657 << 16);
        }
        if (anInt1655 > 0) {
            int i_74_ = ((anInt1655 << 16) + i_72_ - 1) / i_72_;
            i_62_ += i_74_;
            i_68_ += i_74_ * i_72_ - (anInt1655 << 16);
        }
        if (i_65_ < i_69_)
            i_63_ = ((i_65_ << 16) - i_67_ + i_71_ - 1) / i_71_;
        if (i_66_ < i_70_)
            i_64_ = ((i_66_ << 16) - i_68_ + i_72_ - 1) / i_72_;
        int i_75_ = i + i_62_ * Class79.anInt1401;
        int i_76_ = Class79.anInt1401 - i_63_;
        if (i_62_ + i_64_ > Class79.anInt1404)
            i_64_ -= i_62_ + i_64_ - Class79.anInt1404;
        if (i_62_ < Class79.anInt1403) {
            int i_77_ = Class79.anInt1403 - i_62_;
            i_64_ -= i_77_;
            i_75_ += i_77_ * Class79.anInt1401;
            i_68_ += i_72_ * i_77_;
        }
        if (i + i_63_ > Class79.anInt1398) {
            int i_78_ = i + i_63_ - Class79.anInt1398;
            i_63_ -= i_78_;
            i_76_ += i_78_;
        }
        if (i < Class79.anInt1400) {
            int i_79_ = Class79.anInt1400 - i;
            i_63_ -= i_79_;
            i_75_ += i_79_;
            i_67_ += i_71_ * i_79_;
            i_76_ += i_79_;
        }
        method1534(Class79.anIntArray1402, aByteArray3332, anIntArray3331,
                i_67_, i_68_, i_75_, i_76_, i_63_, i_64_, i_71_, i_72_,
                i_65_);
    }

    public void method1527(int i, int i_80_) {
        i += anInt1657;
        i_80_ += anInt1655;
        int i_81_ = i + i_80_ * Class79.anInt1401;
        int i_82_ = 0;
        int i_83_ = anInt1658;
        int i_84_ = anInt1659;
        int i_85_ = Class79.anInt1401 - i_84_;
        int i_86_ = 0;
        if (i_80_ < Class79.anInt1403) {
            int i_87_ = Class79.anInt1403 - i_80_;
            i_83_ -= i_87_;
            i_80_ = Class79.anInt1403;
            i_82_ += i_87_ * i_84_;
            i_81_ += i_87_ * Class79.anInt1401;
        }
        if (i_80_ + i_83_ > Class79.anInt1404)
            i_83_ -= i_80_ + i_83_ - Class79.anInt1404;
        if (i < Class79.anInt1400) {
            int i_88_ = Class79.anInt1400 - i;
            i_84_ -= i_88_;
            i = Class79.anInt1400;
            i_82_ += i_88_;
            i_81_ += i_88_;
            i_86_ += i_88_;
            i_85_ += i_88_;
        }
        if (i + i_84_ > Class79.anInt1398) {
            int i_89_ = i + i_84_ - Class79.anInt1398;
            i_84_ -= i_89_;
            i_86_ += i_89_;
            i_85_ += i_89_;
        }
        if (i_84_ > 0 && i_83_ > 0)
            method1536(Class79.anIntArray1402, aByteArray3332, anIntArray3331,
                    0, i_82_, i_81_, i_84_, i_83_, i_85_, i_86_);
    }

    public void method1539() {
        if (anInt1659 != anInt1647 || anInt1658 != anInt1645) {
            byte[] is = new byte[anInt1647 * anInt1645];
            int i = 0;
            for (int i_90_ = 0; i_90_ < anInt1658; i_90_++) {
                for (int i_91_ = 0; i_91_ < anInt1659; i_91_++)
                    is[i_91_ + anInt1657 + (i_90_ + anInt1655) * anInt1647]
                            = aByteArray3332[i++];
            }
            aByteArray3332 = is;
            anInt1659 = anInt1647;
            anInt1658 = anInt1645;
            anInt1657 = 0;
            anInt1655 = 0;
        }
    }

    public Class92_Sub1(int i, int i_92_, int i_93_, int i_94_, int i_95_,
                        int i_96_, byte[] is, int[] is_97_) {
        anInt1647 = i;
        anInt1645 = i_92_;
        anInt1657 = i_93_;
        anInt1655 = i_94_;
        anInt1659 = i_95_;
        anInt1658 = i_96_;
        aByteArray3332 = is;
        anIntArray3331 = is_97_;
    }

    public Class92_Sub1(int i, int i_98_, int i_99_) {
        anInt1647 = anInt1659 = i;
        anInt1645 = anInt1658 = i_98_;
        anInt1657 = anInt1655 = 0;
        aByteArray3332 = new byte[i * i_98_];
        anIntArray3331 = new int[i_99_];
    }
}
