/* Class68_Sub20_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class68_Sub20_Sub1 extends NodeSub
{
    private static MutableString aClass100_4137;
    private static MutableString aClass100_4138;
    int anInt4139 = 0;
    private static MutableString aClass100_4140;
    private int[] anIntArray4141;
    private static MutableString aClass100_4142 = Class112.makeMutableString(43, ")4shad");
    private static MutableString aClass100_4143;
    private int anInt4144;
    private static MutableString aClass100_4145;
    private int anInt4146;
    private static MutableString aClass100_4147 = Class112.makeMutableString(43, ")4str");
    private int[] anIntArray4148;
    private static MutableString aClass100_4149;
    private static MutableString aClass100_4150;
    private static MutableString aClass100_4151;
    private static MutableString aClass100_4152;
    private byte[] aByteArray4153;
    private int[] anIntArray4154;
    private Class92[] aClass92Array4155;
    private static MutableString aClass100_4156;
    private static MutableString aClass100_4157;
    private static MutableString aClass100_4158;
    private static MutableString aClass100_4159;
    private int[] anIntArray4160;
    private static MutableString aClass100_4161;
    private static MutableString aClass100_4162;
    private int[] anIntArray4163;
    private static MutableString aClass100_4164;
    private static MutableString aClass100_4165;
    private static MutableString aClass100_4166;
    private static MutableString aClass100_4167;
    private static MutableString aClass100_4168;
    private static MutableString aClass100_4169;
    private int[] anIntArray4170;
    private static MutableString aClass100_4171;
    private static int anInt4172;
    private static MutableString[] aClass100Array4173;
    private static int anInt4174;
    private static int anInt4175;
    private static int anInt4176;
    private static int anInt4177;
    private static int anInt4178;
    private static int anInt4179;
    private static int anInt4180;
    private static int anInt4181;
    private static int anInt4182;

    static final MutableString method1009(MutableString class100)
    {
        int i = class100.getLength();
        int i_0_ = 0;
        for (int i_1_ = 0; i_1_ < i; i_1_++)
        {
            byte i_2_ = ((MutableString) class100).data[i_1_];
            if (i_2_ == 60 || i_2_ == 62)
                i_0_ += 3;
        }
        MutableString class100_3_ = new MutableString();
        ((MutableString) class100_3_).length = i + i_0_;
        ((MutableString) class100_3_).data = new byte[((MutableString) class100_3_).length];
        int i_4_ = 0;
        for (int i_5_ = 0; i_5_ < i; i_5_++)
        {
            byte i_6_ = ((MutableString) class100).data[i_5_];
            if (i_6_ == 60)
            {
                ((MutableString) class100_3_).data[i_4_++] = (byte) 60;
                ((MutableString) class100_3_).data[i_4_++] = (byte) 108;
                ((MutableString) class100_3_).data[i_4_++] = (byte) 116;
                ((MutableString) class100_3_).data[i_4_++] = (byte) 62;
            } else if (i_6_ == 62)
            {
                ((MutableString) class100_3_).data[i_4_++] = (byte) 60;
                ((MutableString) class100_3_).data[i_4_++] = (byte) 103;
                ((MutableString) class100_3_).data[i_4_++] = (byte) 116;
                ((MutableString) class100_3_).data[i_4_++] = (byte) 62;
            } else
                ((MutableString) class100_3_).data[i_4_++] = i_6_;
        }
        return class100_3_;
    }

    final void method1010(MutableString class100, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_)
    {
        if (class100 != null)
        {
            method1027(i_8_, i_9_);
            double d = 7.0 - (double) i_11_ / 8.0;
            if (d < 0.0)
                d = 0.0;
            int[] is = new int[((MutableString) class100).length];
            for (int i_12_ = 0; i_12_ < ((MutableString) class100).length; i_12_++)
                is[i_12_] = (int) (Math.sin((double) i_12_ / 1.5 + (double) i_10_) * d);
            method1025(class100, i - method1029(class100) / 2, i_7_, null, is);
        }
    }

    private final int method1011(int i)
    {
        return anIntArray4170[i & 0xff];
    }

    private final void method1012(int i, int i_13_, int i_14_)
    {
        anInt4175 = -1;
        anInt4178 = -1;
        anInt4174 = anInt4179 = i_13_;
        anInt4182 = anInt4172 = i;
        anInt4181 = anInt4176 = i_14_;
        anInt4180 = 0;
        anInt4177 = 0;
    }

    final int method1013(MutableString class100, int[] is, MutableString[] class100s)
    {
        if (class100 == null)
            return 0;
        aClass100_4145.method1600(0, (byte) -80);
        int i = 0;
        int i_15_ = 0;
        int i_16_ = -1;
        int i_17_ = 0;
        int i_18_ = 0;
        int i_19_ = -1;
        int i_20_ = -1;
        int i_21_ = 0;
        int i_22_ = class100.getLength();
        for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
        {
            int i_24_ = class100.charAt(i_23_);
            if (i_24_ == 60)
                i_19_ = i_23_;
            else
            {
                if (i_24_ == 62 && i_19_ != -1)
                {
                    MutableString class100_25_ = class100.method1613(i_19_ + 1, (byte) -74, i_23_);
                    i_19_ = -1;
                    aClass100_4145.method1594(60, 26011);
                    aClass100_4145.method1624(class100_25_, 12147);
                    aClass100_4145.method1594(62, 26011);
                    if (class100_25_.equalTo(aClass100_4151))
                    {
                        if (class100s[i_21_] != null)
                        {
                            class100s[i_21_].method1600(0, (byte) -103);
                            class100s[i_21_] = (class100s[i_21_].method1578(i_15_, aClass100_4145.getLength(), -10000, aClass100_4145));
                        } else
                            class100s[i_21_] = (aClass100_4145.method1613(i_15_, (byte) -74, aClass100_4145.getLength()));
                        i_21_++;
                        i_15_ = aClass100_4145.getLength();
                        i = 0;
                        i_16_ = -1;
                        i_20_ = -1;
                    } else if (class100_25_.equalTo(aClass100_4162))
                    {
                        i += method1011(60);
                        if (aByteArray4153 != null && i_20_ != -1)
                            i += aByteArray4153[(i_20_ << 8) + 60];
                        i_20_ = 60;
                    } else if (class100_25_.equalTo(aClass100_4143))
                    {
                        i += method1011(62);
                        if (aByteArray4153 != null && i_20_ != -1)
                            i += aByteArray4153[(i_20_ << 8) + 62];
                        i_20_ = 62;
                    } else if (class100_25_.equalTo(aClass100_4137))
                    {
                        i += method1011(160);
                        if (aByteArray4153 != null && i_20_ != -1)
                            i += aByteArray4153[(i_20_ << 8) + 160];
                        i_20_ = 160;
                    } else if (class100_25_.equalTo(aClass100_4164))
                    {
                        i += method1011(173);
                        if (aByteArray4153 != null && i_20_ != -1)
                            i += aByteArray4153[(i_20_ << 8) + 173];
                        i_20_ = 173;
                    } else if (class100_25_.equalTo(aClass100_4167))
                    {
                        i += method1011(215);
                        if (aByteArray4153 != null && i_20_ != -1)
                            i += aByteArray4153[(i_20_ << 8) + 215];
                        i_20_ = 215;
                    } else if (class100_25_.equalTo(aClass100_4149))
                    {
                        i += method1011(128);
                        if (aByteArray4153 != null && i_20_ != -1)
                            i += aByteArray4153[(i_20_ << 8) + 128];
                        i_20_ = 128;
                    } else if (class100_25_.equalTo(aClass100_4165))
                    {
                        i += method1011(169);
                        if (aByteArray4153 != null && i_20_ != -1)
                            i += aByteArray4153[(i_20_ << 8) + 169];
                        i_20_ = 169;
                    } else if (class100_25_.equalTo(aClass100_4171))
                    {
                        i += method1011(174);
                        if (aByteArray4153 != null && i_20_ != -1)
                            i += aByteArray4153[(i_20_ << 8) + 174];
                        i_20_ = 174;
                    } else if (class100_25_.method1595(aClass100_4157, 45))
                    {
                        try
                        {
                            int i_26_ = class100_25_.method1621(4, true).method1625((byte) -118);
                            i += (((Class92) aClass92Array4155[i_26_]).anInt1649);
                            i_20_ = -1;
                        } catch (Exception exception)
                        {
                            /* empty */
                        }
                    }
                    i_24_ = -1;
                }
                if (i_19_ == -1)
                {
                    if (i_24_ != -1)
                    {
                        aClass100_4145.method1594(i_24_, 26011);
                        i += method1011(i_24_);
                        if (aByteArray4153 != null && i_20_ != -1)
                            i += aByteArray4153[(i_20_ << 8) + i_24_];
                        i_20_ = i_24_;
                    }
                    if (i_24_ == 32)
                    {
                        i_16_ = aClass100_4145.getLength();
                        i_17_ = i;
                        i_18_ = 1;
                    }
                    if (is != null && i > is[i_21_ < is.length ? i_21_ : is.length - 1] && i_16_ >= 0)
                    {
                        if (class100s[i_21_] != null)
                        {
                            class100s[i_21_].method1600(0, (byte) -119);
                            class100s[i_21_] = class100s[i_21_].method1578(i_15_, i_16_ - i_18_, -10000, aClass100_4145);
                        } else
                            class100s[i_21_] = aClass100_4145.method1613(i_15_, (byte) -74, i_16_ - i_18_);
                        i_21_++;
                        i_15_ = i_16_;
                        i_16_ = -1;
                        i -= i_17_;
                        i_20_ = -1;
                    }
                    if (i_24_ == 45)
                    {
                        i_16_ = aClass100_4145.getLength();
                        i_17_ = i;
                        i_18_ = 0;
                    }
                }
            }
        }
        if (aClass100_4145.getLength() > i_15_)
        {
            if (class100s[i_21_] != null)
            {
                class100s[i_21_].method1600(0, (byte) -72);
                class100s[i_21_] = class100s[i_21_].method1578(i_15_, aClass100_4145.getLength(), -10000, aClass100_4145);
            } else
                class100s[i_21_] = aClass100_4145.method1613(i_15_, (byte) -74, aClass100_4145.getLength());
            i_21_++;
        }
        return i_21_;
    }

    private static final int method1014(byte[][] is, byte[][] is_27_, int[] is_28_, int[] is_29_, int[] is_30_, int i, int i_31_)
    {
        int i_32_ = is_28_[i];
        int i_33_ = i_32_ + is_30_[i];
        int i_34_ = is_28_[i_31_];
        int i_35_ = i_34_ + is_30_[i_31_];
        int i_36_ = i_32_;
        if (i_34_ > i_32_)
            i_36_ = i_34_;
        int i_37_ = i_33_;
        if (i_35_ < i_33_)
            i_37_ = i_35_;
        int i_38_ = is_29_[i];
        if (is_29_[i_31_] < i_38_)
            i_38_ = is_29_[i_31_];
        byte[] is_39_ = is_27_[i];
        byte[] is_40_ = is[i_31_];
        int i_41_ = i_36_ - i_32_;
        int i_42_ = i_36_ - i_34_;
        for (int i_43_ = i_36_; i_43_ < i_37_; i_43_++)
        {
            int i_44_ = is_39_[i_41_++] + is_40_[i_42_++];
            if (i_44_ < i_38_)
                i_38_ = i_44_;
        }
        return -i_38_;
    }

    final void method1015(MutableString class100, int i, int i_45_, int i_46_, int i_47_, int i_48_)
    {
        if (class100 != null)
        {
            method1027(i_46_, i_47_);
            int[] is = new int[((MutableString) class100).length];
            int[] is_49_ = new int[((MutableString) class100).length];
            for (int i_50_ = 0; i_50_ < ((MutableString) class100).length; i_50_++)
            {
                is[i_50_] = (int) (Math.sin((double) i_50_ / 5.0 + (double) i_48_ / 5.0) * 5.0);
                is_49_[i_50_] = (int) (Math.sin((double) i_50_ / 3.0 + (double) i_48_ / 5.0) * 5.0);
            }
            method1025(class100, i - method1029(class100) / 2, i_45_, is, is_49_);
        }
    }

    final void method1016(MutableString class100, int i, int i_51_, int i_52_, int i_53_, int i_54_)
    {
        if (class100 != null)
        {
            method1027(i_52_, i_53_);
            int[] is = new int[((MutableString) class100).length];
            for (int i_55_ = 0; i_55_ < ((MutableString) class100).length; i_55_++)
                is[i_55_] = (int) (Math.sin((double) i_55_ / 2.0 + (double) i_54_ / 5.0) * 5.0);
            method1025(class100, i - method1029(class100) / 2, i_51_, null, is);
        }
    }

    final void method1017(Class92[] class92s, int[] is)
    {
        if (is != null && is.length != class92s.length)
            throw new IllegalArgumentException();
        aClass92Array4155 = class92s;
        anIntArray4163 = is;
    }

    final int method1018(MutableString class100, int i)
    {
        int i_56_ = method1013(class100, new int[] { i }, aClass100Array4173);
        int i_57_ = 0;
        for (int i_58_ = 0; i_58_ < i_56_; i_58_++)
        {
            int i_59_ = method1029(aClass100Array4173[i_58_]);
            if (i_59_ > i_57_)
                i_57_ = i_59_;
        }
        return i_57_;
    }

    final int method1019(MutableString class100, int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_)
    {
        return method1034(class100, i, i_60_, i_61_, i_62_, i_63_, i_64_, 256, i_65_, i_66_, i_67_);
    }

    final int method1020(MutableString class100, int i)
    {
        return method1013(class100, new int[] { i }, aClass100Array4173);
    }

    private final void method1021(MutableString class100, int i, int i_68_)
    {
        i_68_ -= ((Class68_Sub20_Sub1) this).anInt4139;
        int i_69_ = -1;
        int i_70_ = -1;
        for (int i_71_ = 0; i_71_ < ((MutableString) class100).length; i_71_++)
        {
            int i_72_ = ((MutableString) class100).data[i_71_] & 0xff;
            if (i_72_ == 60)
                i_69_ = i_71_;
            else
            {
                if (i_72_ == 62 && i_69_ != -1)
                {
                    MutableString class100_73_ = class100.method1613(i_69_ + 1, (byte) -74, i_71_);
                    i_69_ = -1;
                    if (class100_73_.equalTo(aClass100_4162))
                        i_72_ = 60;
                    else if (class100_73_.equalTo(aClass100_4143))
                        i_72_ = 62;
                    else if (class100_73_.equalTo(aClass100_4137))
                        i_72_ = 160;
                    else if (class100_73_.equalTo(aClass100_4164))
                        i_72_ = 173;
                    else if (class100_73_.equalTo(aClass100_4167))
                        i_72_ = 215;
                    else if (class100_73_.equalTo(aClass100_4149))
                        i_72_ = 128;
                    else if (class100_73_.equalTo(aClass100_4165))
                        i_72_ = 169;
                    else if (class100_73_.equalTo(aClass100_4171))
                        i_72_ = 174;
                    else
                    {
                        if (class100_73_.method1595(aClass100_4157, 61))
                        {
                            try
                            {
                                int i_74_ = class100_73_.method1621(4, true).method1625((byte) -3);
                                Class92 class92 = aClass92Array4155[i_74_];
                                int i_75_ = (anIntArray4163 != null ? anIntArray4163[i_74_] : ((Class92) class92).anInt1647);
                                if (anInt4181 == 256)
                                    class92.method1533(i, (i_68_ + ((Class68_Sub20_Sub1) this).anInt4139 - i_75_));
                                else
                                    class92.method1534(i, (i_68_ + ((Class68_Sub20_Sub1) this).anInt4139 - i_75_), anInt4181);
                                i += ((Class92) class92).anInt1649;
                                i_70_ = -1;
                            } catch (Exception exception)
                            {
                                /* empty */
                            }
                        } else
                            method1026(class100_73_);
                        continue;
                    }
                }
                if (i_69_ == -1)
                {
                    if (aByteArray4153 != null && i_70_ != -1)
                        i += aByteArray4153[(i_70_ << 8) + i_72_];
                    int i_76_ = anIntArray4160[i_72_];
                    int i_77_ = anIntArray4148[i_72_];
                    if (i_72_ != 32)
                    {
                        if (anInt4181 == 256)
                        {
                            if (anInt4174 != -1)
                                method1024(i_72_, i + anIntArray4154[i_72_] + 1, i_68_ + anIntArray4141[i_72_] + 1, i_76_, i_77_, anInt4174, true);
                            method1024(i_72_, i + anIntArray4154[i_72_], i_68_ + anIntArray4141[i_72_], i_76_, i_77_, anInt4182, false);
                        } else
                        {
                            if (anInt4174 != -1)
                                method1023(i_72_, i + anIntArray4154[i_72_] + 1, i_68_ + anIntArray4141[i_72_] + 1, i_76_, i_77_, anInt4174, anInt4181, true);
                            method1023(i_72_, i + anIntArray4154[i_72_], i_68_ + anIntArray4141[i_72_], i_76_, i_77_, anInt4182, anInt4181, false);
                        }
                    } else if (anInt4180 > 0)
                    {
                        anInt4177 += anInt4180;
                        i += anInt4177 >> 8;
                        anInt4177 &= 0xff;
                    }
                    int i_78_ = anIntArray4170[i_72_];
                    if (anInt4175 != -1)
                        Class79.method1434(i, i_68_ + (int) ((double) ((Class68_Sub20_Sub1) this).anInt4139 * 0.7), i_78_, anInt4175);
                    if (anInt4178 != -1)
                        Class79.method1434(i, i_68_ + (((Class68_Sub20_Sub1) this).anInt4139) + 1, i_78_, anInt4178);
                    i += i_78_;
                    i_70_ = i_72_;
                }
            }
        }
    }

    final void method1022(MutableString class100, int i, int i_79_, int i_80_, int i_81_)
    {
        if (class100 != null)
        {
            method1027(i_80_, i_81_);
            method1021(class100, i - method1029(class100), i_79_);
        }
    }

    abstract void method1023(int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, boolean bool);

    abstract void method1024(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, boolean bool);

    private final void method1025(MutableString class100, int i, int i_93_, int[] is, int[] is_94_)
    {
        i_93_ -= ((Class68_Sub20_Sub1) this).anInt4139;
        int i_95_ = -1;
        int i_96_ = -1;
        int i_97_ = 0;
        for (int i_98_ = 0; i_98_ < ((MutableString) class100).length; i_98_++)
        {
            int i_99_ = ((MutableString) class100).data[i_98_] & 0xff;
            if (i_99_ == 60)
                i_95_ = i_98_;
            else
            {
                if (i_99_ == 62 && i_95_ != -1)
                {
                    MutableString class100_100_ = class100.method1613(i_95_ + 1, (byte) -74, i_98_);
                    i_95_ = -1;
                    if (class100_100_.equalTo(aClass100_4162))
                        i_99_ = 60;
                    else if (class100_100_.equalTo(aClass100_4143))
                        i_99_ = 62;
                    else if (class100_100_.equalTo(aClass100_4137))
                        i_99_ = 160;
                    else if (class100_100_.equalTo(aClass100_4164))
                        i_99_ = 173;
                    else if (class100_100_.equalTo(aClass100_4167))
                        i_99_ = 215;
                    else if (class100_100_.equalTo(aClass100_4149))
                        i_99_ = 128;
                    else if (class100_100_.equalTo(aClass100_4165))
                        i_99_ = 169;
                    else if (class100_100_.equalTo(aClass100_4171))
                        i_99_ = 174;
                    else
                    {
                        if (class100_100_.method1595(aClass100_4157, 90))
                        {
                            try
                            {
                                int i_101_;
                                if (is != null)
                                    i_101_ = is[i_97_];
                                else
                                    i_101_ = 0;
                                int i_102_;
                                if (is_94_ != null)
                                    i_102_ = is_94_[i_97_];
                                else
                                    i_102_ = 0;
                                i_97_++;
                                int i_103_ = class100_100_.method1621(4, true).method1625((byte) -53);
                                Class92 class92 = aClass92Array4155[i_103_];
                                int i_104_ = (anIntArray4163 != null ? anIntArray4163[i_103_] : ((Class92) class92).anInt1647);
                                if (anInt4181 == 256)
                                    class92.method1533(i + i_101_, (i_93_ + ((Class68_Sub20_Sub1) this).anInt4139 - i_104_ + i_102_));
                                else
                                    class92.method1534(i + i_101_, (i_93_ + ((Class68_Sub20_Sub1) this).anInt4139 - i_104_ + i_102_), anInt4181);
                                i += ((Class92) class92).anInt1649;
                                i_96_ = -1;
                            } catch (Exception exception)
                            {
                                /* empty */
                            }
                        } else
                            method1026(class100_100_);
                        continue;
                    }
                }
                if (i_95_ == -1)
                {
                    if (aByteArray4153 != null && i_96_ != -1)
                        i += aByteArray4153[(i_96_ << 8) + i_99_];
                    int i_105_ = anIntArray4160[i_99_];
                    int i_106_ = anIntArray4148[i_99_];
                    int i_107_;
                    if (is != null)
                        i_107_ = is[i_97_];
                    else
                        i_107_ = 0;
                    int i_108_;
                    if (is_94_ != null)
                        i_108_ = is_94_[i_97_];
                    else
                        i_108_ = 0;
                    i_97_++;
                    if (i_99_ != 32)
                    {
                        if (anInt4181 == 256)
                        {
                            if (anInt4174 != -1)
                                method1024(i_99_, (i + anIntArray4154[i_99_] + 1 + i_107_), (i_93_ + anIntArray4141[i_99_] + 1 + i_108_), i_105_, i_106_, anInt4174, true);
                            method1024(i_99_, i + anIntArray4154[i_99_] + i_107_, i_93_ + anIntArray4141[i_99_] + i_108_, i_105_, i_106_, anInt4182, false);
                        } else
                        {
                            if (anInt4174 != -1)
                                method1023(i_99_, (i + anIntArray4154[i_99_] + 1 + i_107_), (i_93_ + anIntArray4141[i_99_] + 1 + i_108_), i_105_, i_106_, anInt4174, anInt4181, true);
                            method1023(i_99_, i + anIntArray4154[i_99_] + i_107_, i_93_ + anIntArray4141[i_99_] + i_108_, i_105_, i_106_, anInt4182, anInt4181, false);
                        }
                    } else if (anInt4180 > 0)
                    {
                        anInt4177 += anInt4180;
                        i += anInt4177 >> 8;
                        anInt4177 &= 0xff;
                    }
                    int i_109_ = anIntArray4170[i_99_];
                    if (anInt4175 != -1)
                        Class79.method1434(i, i_93_ + (int) ((double) ((Class68_Sub20_Sub1) this).anInt4139 * 0.7), i_109_, anInt4175);
                    if (anInt4178 != -1)
                        Class79.method1434(i, i_93_ + (((Class68_Sub20_Sub1) this).anInt4139), i_109_, anInt4178);
                    i += i_109_;
                    i_96_ = i_99_;
                }
            }
        }
    }

    private final void method1026(MutableString class100)
    {
        do
        {
            try
            {
                if (class100.method1595(aClass100_4150, 126))
                    anInt4182 = class100.method1621(4, true).method1611(16, 48);
                else if (class100.equalTo(aClass100_4156))
                    anInt4182 = anInt4172;
                else if (class100.method1595(aClass100_4138, 50))
                    anInt4181 = class100.method1621(6, true).method1625((byte) -118);
                else if (class100.equalTo(aClass100_4166))
                    anInt4181 = anInt4176;
                else if (class100.method1595(aClass100_4152, 61))
                    anInt4175 = class100.method1621(4, true).method1611(16, 90);
                else if (class100.equalTo(aClass100_4159))
                    anInt4175 = 8388608;
                else if (class100.equalTo(aClass100_4147))
                    anInt4175 = -1;
                else if (class100.method1595(aClass100_4168, 43))
                    anInt4178 = class100.method1621(2, true).method1611(16, 51);
                else if (class100.equalTo(aClass100_4169))
                    anInt4178 = 0;
                else if (class100.equalTo(aClass100_4158))
                    anInt4178 = -1;
                else if (class100.method1595(aClass100_4161, 98))
                    anInt4174 = class100.method1621(5, true).method1611(16, 51);
                else if (class100.equalTo(aClass100_4140))
                    anInt4174 = 0;
                else if (class100.equalTo(aClass100_4142))
                    anInt4174 = anInt4179;
                else
                {
                    if (!class100.equalTo(aClass100_4151))
                        break;
                    method1012(anInt4172, anInt4179, anInt4176);
                }
            } catch (Exception exception)
            {
                break;
            }
            break;
        } while (false);
    }

    private final void method1027(int i, int i_110_)
    {
        anInt4175 = -1;
        anInt4178 = -1;
        anInt4174 = anInt4179 = i_110_;
        anInt4182 = anInt4172 = i;
        anInt4181 = anInt4176 = 256;
        anInt4180 = 0;
        anInt4177 = 0;
    }

    private final void method1028(byte[] is)
    {
        anIntArray4170 = new int[256];
        if (is.length == 257)
        {
            for (int i = 0; i < anIntArray4170.length; i++)
                anIntArray4170[i] = is[i] & 0xff;
            ((Class68_Sub20_Sub1) this).anInt4139 = is[256] & 0xff;
        } else
        {
            int i = 0;
            for (int i_111_ = 0; i_111_ < 256; i_111_++)
                anIntArray4170[i_111_] = is[i++] & 0xff;
            int[] is_112_ = new int[256];
            int[] is_113_ = new int[256];
            for (int i_114_ = 0; i_114_ < 256; i_114_++)
                is_112_[i_114_] = is[i++] & 0xff;
            for (int i_115_ = 0; i_115_ < 256; i_115_++)
                is_113_[i_115_] = is[i++] & 0xff;
            byte[][] is_116_ = new byte[256][];
            for (int i_117_ = 0; i_117_ < 256; i_117_++)
            {
                is_116_[i_117_] = new byte[is_112_[i_117_]];
                byte i_118_ = 0;
                for (int i_119_ = 0; i_119_ < is_116_[i_117_].length; i_119_++)
                {
                    i_118_ += is[i++];
                    is_116_[i_117_][i_119_] = i_118_;
                }
            }
            byte[][] is_120_ = new byte[256][];
            for (int i_121_ = 0; i_121_ < 256; i_121_++)
            {
                is_120_[i_121_] = new byte[is_112_[i_121_]];
                byte i_122_ = 0;
                for (int i_123_ = 0; i_123_ < is_120_[i_121_].length; i_123_++)
                {
                    i_122_ += is[i++];
                    is_120_[i_121_][i_123_] = i_122_;
                }
            }
            aByteArray4153 = new byte[65536];
            for (int i_124_ = 0; i_124_ < 256; i_124_++)
            {
                if (i_124_ != 32 && i_124_ != 160)
                {
                    for (int i_125_ = 0; i_125_ < 256; i_125_++)
                    {
                        if (i_125_ != 32 && i_125_ != 160)
                            aByteArray4153[(i_124_ << 8) + i_125_] = (byte) method1014(is_116_, is_120_, is_113_, anIntArray4170, is_112_, i_124_, i_125_);
                    }
                }
            }
            ((Class68_Sub20_Sub1) this).anInt4139 = is_113_[32] + is_112_[32];
        }
    }

    final int method1029(MutableString class100)
    {
        if (class100 == null)
            return 0;
        int i = -1;
        int i_126_ = -1;
        int i_127_ = 0;
        for (int i_128_ = 0; i_128_ < ((MutableString) class100).length; i_128_++)
        {
            int i_129_ = ((MutableString) class100).data[i_128_] & 0xff;
            if (i_129_ == 60)
                i = i_128_;
            else
            {
                if (i_129_ == 62 && i != -1)
                {
                    MutableString class100_130_ = class100.method1613(i + 1, (byte) -74, i_128_);
                    i = -1;
                    if (class100_130_.equalTo(aClass100_4162))
                        i_129_ = 60;
                    else if (class100_130_.equalTo(aClass100_4143))
                        i_129_ = 62;
                    else if (class100_130_.equalTo(aClass100_4137))
                        i_129_ = 160;
                    else if (class100_130_.equalTo(aClass100_4164))
                        i_129_ = 173;
                    else if (class100_130_.equalTo(aClass100_4167))
                        i_129_ = 215;
                    else if (class100_130_.equalTo(aClass100_4149))
                        i_129_ = 128;
                    else if (class100_130_.equalTo(aClass100_4165))
                        i_129_ = 169;
                    else if (class100_130_.equalTo(aClass100_4171))
                        i_129_ = 174;
                    else
                    {
                        if (class100_130_.method1595(aClass100_4157, 64))
                        {
                            try
                            {
                                int i_131_ = class100_130_.method1621(4, true).method1625((byte) -22);
                                i_127_ += (((Class92) aClass92Array4155[i_131_]).anInt1649);
                                i_126_ = -1;
                            } catch (Exception exception)
                            {
                                /* empty */
                            }
                        }
                        continue;
                    }
                }
                if (i == -1)
                {
                    i_127_ += anIntArray4170[i_129_];
                    if (aByteArray4153 != null && i_126_ != -1)
                        i_127_ += aByteArray4153[(i_126_ << 8) + i_129_];
                    i_126_ = i_129_;
                }
            }
        }
        return i_127_;
    }

    final void method1030(MutableString class100, int i, int i_132_, int i_133_, int i_134_)
    {
        if (class100 != null)
        {
            method1027(i_133_, i_134_);
            method1021(class100, i, i_132_);
        }
    }

    private final void method1031(MutableString class100, int i)
    {
        int i_135_ = 0;
        boolean bool = false;
        for (int i_136_ = 0; i_136_ < class100.getLength(); i_136_++)
        {
            int i_137_ = class100.charAt(i_136_);
            if (i_137_ == 60)
                bool = true;
            else if (i_137_ == 62)
                bool = false;
            else if (!bool && i_137_ == 32)
                i_135_++;
        }
        if (i_135_ > 0)
            anInt4180 = (i - method1029(class100) << 8) / i_135_;
    }

    final void method1032(MutableString class100, int i, int i_138_, int i_139_, int i_140_)
    {
        if (class100 != null)
        {
            method1027(i_139_, i_140_);
            method1021(class100, i - method1029(class100) / 2, i_138_);
        }
    }

    public static void method1033()
    {
        aClass100_4162 = null;
        aClass100_4143 = null;
        aClass100_4137 = null;
        aClass100_4164 = null;
        aClass100_4167 = null;
        aClass100_4149 = null;
        aClass100_4165 = null;
        aClass100_4171 = null;
        aClass100_4157 = null;
        aClass100_4151 = null;
        aClass100_4150 = null;
        aClass100_4156 = null;
        aClass100_4138 = null;
        aClass100_4166 = null;
        aClass100_4168 = null;
        aClass100_4169 = null;
        aClass100_4158 = null;
        aClass100_4161 = null;
        aClass100_4140 = null;
        aClass100_4142 = null;
        aClass100_4152 = null;
        aClass100_4159 = null;
        aClass100_4147 = null;
        aClass100_4145 = null;
        aClass100Array4173 = null;
    }

    final int method1034(MutableString class100, int i, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_)
    {
        if (class100 == null)
            return 0;
        method1012(i_144_, i_145_, i_146_);
        if (i_149_ == 0)
            i_149_ = ((Class68_Sub20_Sub1) this).anInt4139;
        int[] is = { i_142_ };
        if (i_143_ < anInt4144 + anInt4146 + i_149_ && i_143_ < i_149_ + i_149_)
            is = null;
        int i_150_ = method1013(class100, is, aClass100Array4173);
        if (i_148_ == 3 && i_150_ == 1)
            i_148_ = 1;
        int i_151_;
        if (i_148_ == 0)
            i_151_ = i_141_ + anInt4144;
        else if (i_148_ == 1)
            i_151_ = i_141_ + anInt4144 + (i_143_ - anInt4144 - anInt4146 - (i_150_ - 1) * i_149_) / 2;
        else if (i_148_ == 2)
            i_151_ = i_141_ + i_143_ - anInt4146 - (i_150_ - 1) * i_149_;
        else
        {
            int i_152_ = ((i_143_ - anInt4144 - anInt4146 - (i_150_ - 1) * i_149_) / (i_150_ + 1));
            if (i_152_ < 0)
                i_152_ = 0;
            i_151_ = i_141_ + anInt4144 + i_152_;
            i_149_ += i_152_;
        }
        for (int i_153_ = 0; i_153_ < i_150_; i_153_++)
        {
            if (i_147_ == 0)
                method1021(aClass100Array4173[i_153_], i, i_151_);
            else if (i_147_ == 1)
                method1021(aClass100Array4173[i_153_], i + (i_142_ - method1029(aClass100Array4173[i_153_])) / 2, i_151_);
            else if (i_147_ == 2)
                method1021(aClass100Array4173[i_153_], i + i_142_ - method1029(aClass100Array4173[i_153_]), i_151_);
            else if (i_153_ == i_150_ - 1)
                method1021(aClass100Array4173[i_153_], i, i_151_);
            else
            {
                method1031(aClass100Array4173[i_153_], i_142_);
                method1021(aClass100Array4173[i_153_], i, i_151_);
                anInt4180 = 0;
            }
            i_151_ += i_149_;
        }
        return i_150_;
    }

    Class68_Sub20_Sub1(byte[] is, int[] is_154_, int[] is_155_, int[] is_156_, int[] is_157_)
    {
        anIntArray4154 = is_154_;
        anIntArray4141 = is_155_;
        anIntArray4160 = is_156_;
        anIntArray4148 = is_157_;
        method1028(is);
        int i = 2147483647;
        int i_158_ = -2147483648;
        for (int i_159_ = 0; i_159_ < 256; i_159_++)
        {
            if (anIntArray4141[i_159_] < i && anIntArray4148[i_159_] != 0)
                i = anIntArray4141[i_159_];
            if (anIntArray4141[i_159_] + anIntArray4148[i_159_] > i_158_)
                i_158_ = anIntArray4141[i_159_] + anIntArray4148[i_159_];
        }
        anInt4144 = ((Class68_Sub20_Sub1) this).anInt4139 - i;
        anInt4146 = i_158_ - ((Class68_Sub20_Sub1) this).anInt4139;
    }

    final int method1035(MutableString class100, int i, int i_160_, int i_161_, int i_162_, Random random, int i_163_)
    {
        if (class100 == null)
            return 0;
        random.setSeed((long) i_163_);
        method1012(i_161_, i_162_, (random.nextInt() & 0x1f) + 192);
        int[] is = new int[((MutableString) class100).length];
        int i_164_ = 0;
        for (int i_165_ = 0; i_165_ < ((MutableString) class100).length; i_165_++)
        {
            is[i_165_] = i_164_;
            if ((random.nextInt() & 0x3) == 0)
                i_164_++;
        }
        method1025(class100, i, i_160_, is, null);
        return i_164_;
    }

    Class68_Sub20_Sub1(byte[] is)
    {
        method1028(is);
    }

    static
    {
        aClass100_4138 = Class112.makeMutableString(43, "trans=");
        aClass100_4143 = Class112.makeMutableString(43, "gt");
        aClass100_4149 = Class112.makeMutableString(43, "euro");
        aClass100_4152 = Class112.makeMutableString(43, "str=");
        aClass100_4140 = Class112.makeMutableString(43, "shad");
        aClass100_4150 = Class112.makeMutableString(43, "col=");
        aClass100_4137 = Class112.makeMutableString(43, "nbsp");
        aClass100_4151 = Class112.makeMutableString(43, "br");
        aClass100_4159 = Class112.makeMutableString(43, "str");
        aClass100_4158 = Class112.makeMutableString(43, ")4u");
        aClass100_4162 = Class112.makeMutableString(43, "lt");
        aClass100_4157 = Class112.makeMutableString(43, "img=");
        aClass100_4161 = Class112.makeMutableString(43, "shad=");
        aClass100_4164 = Class112.makeMutableString(43, "shy");
        aClass100_4165 = Class112.makeMutableString(43, "copy");
        aClass100_4168 = Class112.makeMutableString(43, "u=");
        aClass100_4156 = Class112.makeMutableString(43, ")4col");
        aClass100_4167 = Class112.makeMutableString(43, "times");
        aClass100_4169 = Class112.makeMutableString(43, "u");
        aClass100_4166 = Class112.makeMutableString(43, ")4trans");
        aClass100_4171 = Class112.makeMutableString(43, "reg");
        aClass100_4145 = Class21.method339(-18982, 100);
        anInt4176 = 256;
        anInt4179 = -1;
        anInt4177 = 0;
        anInt4174 = -1;
        anInt4182 = 0;
        anInt4172 = 0;
        anInt4175 = -1;
        aClass100Array4173 = new MutableString[100];
        anInt4178 = -1;
        anInt4180 = 0;
        anInt4181 = 256;
    }
}
