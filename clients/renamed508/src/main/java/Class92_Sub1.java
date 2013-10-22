/* Class92_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class92_Sub1 extends Class92
{
    private int[] anIntArray3333;
    byte[] aByteArray3334;

    final void method1534(int i, int i_0_, int i_1_)
    {
        i += ((Class92) this).anInt1659;
        i_0_ += ((Class92) this).anInt1657;
        int i_2_ = i + i_0_ * Class79.anInt1403;
        int i_3_ = 0;
        int i_4_ = ((Class92) this).anInt1660;
        int i_5_ = ((Class92) this).anInt1661;
        int i_6_ = Class79.anInt1403 - i_5_;
        int i_7_ = 0;
        if (i_0_ < Class79.anInt1405)
        {
            int i_8_ = Class79.anInt1405 - i_0_;
            i_4_ -= i_8_;
            i_0_ = Class79.anInt1405;
            i_3_ += i_8_ * i_5_;
            i_2_ += i_8_ * Class79.anInt1403;
        }
        if (i_0_ + i_4_ > Class79.anInt1406)
            i_4_ -= i_0_ + i_4_ - Class79.anInt1406;
        if (i < Class79.anInt1402)
        {
            int i_9_ = Class79.anInt1402 - i;
            i_5_ -= i_9_;
            i = Class79.anInt1402;
            i_3_ += i_9_;
            i_2_ += i_9_;
            i_7_ += i_9_;
            i_6_ += i_9_;
        }
        if (i + i_5_ > Class79.anInt1400)
        {
            int i_10_ = i + i_5_ - Class79.anInt1400;
            i_5_ -= i_10_;
            i_7_ += i_10_;
            i_6_ += i_10_;
        }
        if (i_5_ > 0 && i_4_ > 0)
            method1543(Class79.anIntArray1404, ((Class92_Sub1) this).aByteArray3334, anIntArray3333, i_3_, i_2_, i_5_, i_4_, i_6_, i_7_, i_1_);
    }

    final void method1538()
    {
        byte[] is = (new byte[((Class92) this).anInt1661 * ((Class92) this).anInt1660]);
        int i = 0;
        for (int i_11_ = 0; i_11_ < ((Class92) this).anInt1661; i_11_++)
        {
            for (int i_12_ = ((Class92) this).anInt1660 - 1; i_12_ >= 0; i_12_--)
                is[i++] = (((Class92_Sub1) this).aByteArray3334[i_11_ + i_12_ * ((Class92) this).anInt1661]);
        }
        ((Class92_Sub1) this).aByteArray3334 = is;
        int i_13_ = ((Class92) this).anInt1657;
        ((Class92) this).anInt1657 = ((Class92) this).anInt1659;
        ((Class92) this).anInt1659 = ((Class92) this).anInt1647 - ((Class92) this).anInt1660 - i_13_;
        i_13_ = ((Class92) this).anInt1660;
        ((Class92) this).anInt1660 = ((Class92) this).anInt1661;
        ((Class92) this).anInt1661 = i_13_;
        i_13_ = ((Class92) this).anInt1647;
        ((Class92) this).anInt1647 = ((Class92) this).anInt1649;
        ((Class92) this).anInt1649 = i_13_;
    }

    final void method1539(int i, int i_14_, int i_15_)
    {
        for (int i_16_ = 0; i_16_ < anIntArray3333.length; i_16_++)
        {
            int i_17_ = anIntArray3333[i_16_] >> 16 & 0xff;
            i_17_ += i;
            if (i_17_ < 0)
                i_17_ = 0;
            else if (i_17_ > 255)
                i_17_ = 255;
            int i_18_ = anIntArray3333[i_16_] >> 8 & 0xff;
            i_18_ += i_14_;
            if (i_18_ < 0)
                i_18_ = 0;
            else if (i_18_ > 255)
                i_18_ = 255;
            int i_19_ = anIntArray3333[i_16_] & 0xff;
            i_19_ += i_15_;
            if (i_19_ < 0)
                i_19_ = 0;
            else if (i_19_ > 255)
                i_19_ = 255;
            anIntArray3333[i_16_] = (i_17_ << 16) + (i_18_ << 8) + i_19_;
        }
    }

    private static final void method1540(int[] is, byte[] is_20_, int[] is_21_, int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_)
    {
        int i_30_ = i;
        for (int i_31_ = -i_26_; i_31_ < 0; i_31_++)
        {
            int i_32_ = (i_22_ >> 16) * i_29_;
            for (int i_33_ = -i_25_; i_33_ < 0; i_33_++)
            {
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

    final Class92_Sub1 method1541()
    {
        Class92_Sub1 class92_sub1_35_ = new Class92_Sub1(((Class92) this).anInt1661, ((Class92) this).anInt1660, anIntArray3333.length);
        ((Class92) class92_sub1_35_).anInt1649 = ((Class92) this).anInt1649;
        ((Class92) class92_sub1_35_).anInt1647 = ((Class92) this).anInt1647;
        ((Class92) class92_sub1_35_).anInt1659 = ((Class92) this).anInt1659;
        ((Class92) class92_sub1_35_).anInt1657 = ((Class92) this).anInt1657;
        int i = ((Class92_Sub1) this).aByteArray3334.length;
        for (int i_36_ = 0; i_36_ < i; i_36_++)
            ((Class92_Sub1) class92_sub1_35_).aByteArray3334[i_36_] = ((Class92_Sub1) this).aByteArray3334[i_36_];
        class92_sub1_35_.anIntArray3333 = anIntArray3333;
        return class92_sub1_35_;
    }

    private static final void method1542(int[] is, byte[] is_37_, int[] is_38_, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_)
    {
        int i_45_ = -(i_41_ >> 2);
        i_41_ = -(i_41_ & 0x3);
        for (int i_46_ = -i_42_; i_46_ < 0; i_46_++)
        {
            for (int i_47_ = i_45_; i_47_ < 0; i_47_++)
            {
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
            for (int i_48_ = i_41_; i_48_ < 0; i_48_++)
            {
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

    private static final void method1543(int[] is, byte[] is_49_, int[] is_50_, int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_)
    {
        int i_57_ = 256 - i_56_;
        for (int i_58_ = -i_53_; i_58_ < 0; i_58_++)
        {
            for (int i_59_ = -i_52_; i_59_ < 0; i_59_++)
            {
                int i_60_ = is_49_[i++];
                if (i_60_ != 0)
                {
                    i_60_ = is_50_[i_60_ & 0xff];
                    int i_61_ = is[i_51_];
                    is[i_51_++] = ((((i_60_ & 0xff00ff) * i_56_ + (i_61_ & 0xff00ff) * i_57_) & ~0xff00ff) + (((i_60_ & 0xff00) * i_56_ + (i_61_ & 0xff00) * i_57_) & 0xff0000)) >> 8;
                } else
                    i_51_++;
            }
            i_51_ += i_54_;
            i += i_55_;
        }
    }

    final void method1544(int i, int i_62_, int i_63_, int i_64_)
    {
        int i_65_ = ((Class92) this).anInt1661;
        int i_66_ = ((Class92) this).anInt1660;
        int i_67_ = 0;
        int i_68_ = 0;
        int i_69_ = ((Class92) this).anInt1649;
        int i_70_ = ((Class92) this).anInt1647;
        int i_71_ = (i_69_ << 16) / i_63_;
        int i_72_ = (i_70_ << 16) / i_64_;
        if (((Class92) this).anInt1659 > 0)
        {
            int i_73_ = ((((Class92) this).anInt1659 << 16) + i_71_ - 1) / i_71_;
            i += i_73_;
            i_67_ += i_73_ * i_71_ - (((Class92) this).anInt1659 << 16);
        }
        if (((Class92) this).anInt1657 > 0)
        {
            int i_74_ = ((((Class92) this).anInt1657 << 16) + i_72_ - 1) / i_72_;
            i_62_ += i_74_;
            i_68_ += i_74_ * i_72_ - (((Class92) this).anInt1657 << 16);
        }
        if (i_65_ < i_69_)
            i_63_ = ((i_65_ << 16) - i_67_ + i_71_ - 1) / i_71_;
        if (i_66_ < i_70_)
            i_64_ = ((i_66_ << 16) - i_68_ + i_72_ - 1) / i_72_;
        int i_75_ = i + i_62_ * Class79.anInt1403;
        int i_76_ = Class79.anInt1403 - i_63_;
        if (i_62_ + i_64_ > Class79.anInt1406)
            i_64_ -= i_62_ + i_64_ - Class79.anInt1406;
        if (i_62_ < Class79.anInt1405)
        {
            int i_77_ = Class79.anInt1405 - i_62_;
            i_64_ -= i_77_;
            i_75_ += i_77_ * Class79.anInt1403;
            i_68_ += i_72_ * i_77_;
        }
        if (i + i_63_ > Class79.anInt1400)
        {
            int i_78_ = i + i_63_ - Class79.anInt1400;
            i_63_ -= i_78_;
            i_76_ += i_78_;
        }
        if (i < Class79.anInt1402)
        {
            int i_79_ = Class79.anInt1402 - i;
            i_63_ -= i_79_;
            i_75_ += i_79_;
            i_67_ += i_71_ * i_79_;
            i_76_ += i_79_;
        }
        method1540(Class79.anIntArray1404, ((Class92_Sub1) this).aByteArray3334, anIntArray3333, i_67_, i_68_, i_75_, i_76_, i_63_, i_64_, i_71_, i_72_, i_65_);
    }

    final void method1533(int i, int i_80_)
    {
        i += ((Class92) this).anInt1659;
        i_80_ += ((Class92) this).anInt1657;
        int i_81_ = i + i_80_ * Class79.anInt1403;
        int i_82_ = 0;
        int i_83_ = ((Class92) this).anInt1660;
        int i_84_ = ((Class92) this).anInt1661;
        int i_85_ = Class79.anInt1403 - i_84_;
        int i_86_ = 0;
        if (i_80_ < Class79.anInt1405)
        {
            int i_87_ = Class79.anInt1405 - i_80_;
            i_83_ -= i_87_;
            i_80_ = Class79.anInt1405;
            i_82_ += i_87_ * i_84_;
            i_81_ += i_87_ * Class79.anInt1403;
        }
        if (i_80_ + i_83_ > Class79.anInt1406)
            i_83_ -= i_80_ + i_83_ - Class79.anInt1406;
        if (i < Class79.anInt1402)
        {
            int i_88_ = Class79.anInt1402 - i;
            i_84_ -= i_88_;
            i = Class79.anInt1402;
            i_82_ += i_88_;
            i_81_ += i_88_;
            i_86_ += i_88_;
            i_85_ += i_88_;
        }
        if (i + i_84_ > Class79.anInt1400)
        {
            int i_89_ = i + i_84_ - Class79.anInt1400;
            i_84_ -= i_89_;
            i_86_ += i_89_;
            i_85_ += i_89_;
        }
        if (i_84_ > 0 && i_83_ > 0)
            method1542(Class79.anIntArray1404, ((Class92_Sub1) this).aByteArray3334, anIntArray3333, 0, i_82_, i_81_, i_84_, i_83_, i_85_, i_86_);
    }

    final void method1545()
    {
        if (((Class92) this).anInt1661 != ((Class92) this).anInt1649 || ((Class92) this).anInt1660 != ((Class92) this).anInt1647)
        {
            byte[] is = (new byte[((Class92) this).anInt1649 * ((Class92) this).anInt1647]);
            int i = 0;
            for (int i_90_ = 0; i_90_ < ((Class92) this).anInt1660; i_90_++)
            {
                for (int i_91_ = 0; i_91_ < ((Class92) this).anInt1661; i_91_++)
                    is[(i_91_ + ((Class92) this).anInt1659 + ((i_90_ + ((Class92) this).anInt1657) * ((Class92) this).anInt1649))] = ((Class92_Sub1) this).aByteArray3334[i++];
            }
            ((Class92_Sub1) this).aByteArray3334 = is;
            ((Class92) this).anInt1661 = ((Class92) this).anInt1649;
            ((Class92) this).anInt1660 = ((Class92) this).anInt1647;
            ((Class92) this).anInt1659 = 0;
            ((Class92) this).anInt1657 = 0;
        }
    }

    Class92_Sub1(int i, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, byte[] is, int[] is_97_)
    {
        ((Class92) this).anInt1649 = i;
        ((Class92) this).anInt1647 = i_92_;
        ((Class92) this).anInt1659 = i_93_;
        ((Class92) this).anInt1657 = i_94_;
        ((Class92) this).anInt1661 = i_95_;
        ((Class92) this).anInt1660 = i_96_;
        ((Class92_Sub1) this).aByteArray3334 = is;
        anIntArray3333 = is_97_;
    }

    private Class92_Sub1(int i, int i_98_, int i_99_)
    {
        ((Class92) this).anInt1649 = ((Class92) this).anInt1661 = i;
        ((Class92) this).anInt1647 = ((Class92) this).anInt1660 = i_98_;
        ((Class92) this).anInt1659 = ((Class92) this).anInt1657 = 0;
        ((Class92_Sub1) this).aByteArray3334 = new byte[i * i_98_];
        anIntArray3333 = new int[i_99_];
    }
}
