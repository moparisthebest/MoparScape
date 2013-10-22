/* Class68_Sub20_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

public abstract class Class68_Sub20_Sub1 extends Class68_Sub20 {
    public static RSString aRSString_4135;
    public static RSString aRSString_4136;
    public int anInt4137 = 0;
    public static RSString aRSString_4138;
    public int[] anIntArray4139;
    public static RSString aRSString_4140 = RSString.newRsString(")4shad");
    public static RSString aRSString_4141;
    public int anInt4142;
    public static RSString aRSString_4143;
    public int anInt4144;
    public static RSString aRSString_4145 = RSString.newRsString(")4str");
    public int[] anIntArray4146;
    public static RSString aRSString_4147;
    public static RSString aRSString_4148;
    public static RSString aRSString_4149;
    public static RSString aRSString_4150;
    public byte[] aByteArray4151;
    public int[] anIntArray4152;
    public Class92[] aClass92Array4153;
    public static RSString aRSString_4154;
    public static RSString aRSString_4155;
    public static RSString aRSString_4156;
    public static RSString aRSString_4157;
    public int[] anIntArray4158;
    public static RSString aRSString_4159;
    public static RSString aRSString_4160;
    public int[] anIntArray4161;
    public static RSString aRSString_4162;
    public static RSString aRSString_4163;
    public static RSString aRSString_4164;
    public static RSString aRSString_4165;
    public static RSString aRSString_4166;
    public static RSString aRSString_4167;
    public int[] anIntArray4168;
    public static RSString aRSString_4169;
    public static int anInt4170;
    public static RSString[] aRSStringArray4171;
    public static int anInt4172;
    public static int anInt4173;
    public static int anInt4174;
    public static int anInt4175;
    public static int anInt4176;
    public static int anInt4177;
    public static int anInt4178;
    public static int anInt4179;
    public static int anInt4180;

    public static RSString method1009(RSString class100) {
        int i = class100.method1590((byte) -121);
        int i_0_ = 0;
        for (int i_1_ = 0; i_1_ < i; i_1_++) {
            byte i_2_ = class100.bytes[i_1_];
            if (i_2_ == 60 || i_2_ == 62)
                i_0_ += 3;
        }
        RSString class100_3_ = new RSString();
        class100_3_.anInt2293 = i + i_0_;
        class100_3_.bytes = new byte[class100_3_.anInt2293];
        int i_4_ = 0;
        for (int i_5_ = 0; i_5_ < i; i_5_++) {
            byte i_6_ = class100.bytes[i_5_];
            if (i_6_ == 60) {
                class100_3_.bytes[i_4_++] = (byte) 60;
                class100_3_.bytes[i_4_++] = (byte) 108;
                class100_3_.bytes[i_4_++] = (byte) 116;
                class100_3_.bytes[i_4_++] = (byte) 62;
            } else if (i_6_ == 62) {
                class100_3_.bytes[i_4_++] = (byte) 60;
                class100_3_.bytes[i_4_++] = (byte) 103;
                class100_3_.bytes[i_4_++] = (byte) 116;
                class100_3_.bytes[i_4_++] = (byte) 62;
            } else
                class100_3_.bytes[i_4_++] = i_6_;
        }
        return class100_3_;
    }

    public void method1010(RSString class100, int i, int i_7_, int i_8_,
                           int i_9_, int i_10_, int i_11_) {
        if (class100 != null) {
            method1027(i_8_, i_9_);
            double d = 7.0 - (double) i_11_ / 8.0;
            if (d < 0.0)
                d = 0.0;
            int[] is = new int[class100.anInt2293];
            for (int i_12_ = 0; i_12_ < class100.anInt2293; i_12_++)
                is[i_12_]
                        = (int) (Math.sin((double) i_12_ / 1.5 + (double) i_10_)
                        * d);
            method1025(class100, i - method1029(class100) / 2, i_7_, null, is);
        }
    }

    public int method1011(int i) {
        return anIntArray4168[i & 0xff];
    }

    public void method1012(int i, int i_13_, int i_14_) {
        anInt4173 = -1;
        anInt4176 = -1;
        anInt4172 = anInt4177 = i_13_;
        anInt4180 = anInt4170 = i;
        anInt4179 = anInt4174 = i_14_;
        anInt4178 = 0;
        anInt4175 = 0;
    }

    public int method1013(RSString class100, int[] is, RSString[] class100s) {
        if (class100 == null)
            return 0;
        aRSString_4143.method1594(0, (byte) -80);
        int i = 0;
        int i_15_ = 0;
        int i_16_ = -1;
        int i_17_ = 0;
        int i_18_ = 0;
        int i_19_ = -1;
        int i_20_ = -1;
        int i_21_ = 0;
        int i_22_ = class100.method1590((byte) -122);
        for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
            int i_24_ = class100.method1578(i_23_, 7178);
            if (i_24_ == 60)
                i_19_ = i_23_;
            else {
                if (i_24_ == 62 && i_19_ != -1) {
                    RSString class100_25_
                            = class100.method1607(i_19_ + 1, (byte) -74, i_23_);
                    i_19_ = -1;
                    aRSString_4143.method1588(60, 26011);
                    aRSString_4143.method1618(class100_25_, 12147);
                    aRSString_4143.method1588(62, 26011);
                    if (class100_25_.method1593(aRSString_4149, (byte) 95)) {
                        if (class100s[i_21_] != null) {
                            class100s[i_21_].method1594(0, (byte) -103);
                            class100s[i_21_]
                                    = (class100s[i_21_].method1572
                                    (i_15_,
                                            aRSString_4143.method1590((byte) -108),
                                            -10000, aRSString_4143));
                        } else
                            class100s[i_21_]
                                    = (aRSString_4143.method1607
                                    (i_15_, (byte) -74,
                                            aRSString_4143.method1590((byte) -98)));
                        i_21_++;
                        i_15_ = aRSString_4143.method1590((byte) -108);
                        i = 0;
                        i_16_ = -1;
                        i_20_ = -1;
                    } else if (class100_25_.method1593(aRSString_4160,
                            (byte) 101)) {
                        i += method1011(60);
                        if (aByteArray4151 != null && i_20_ != -1)
                            i += aByteArray4151[(i_20_ << 8) + 60];
                        i_20_ = 60;
                    } else if (class100_25_.method1593(aRSString_4141,
                            (byte) 127)) {
                        i += method1011(62);
                        if (aByteArray4151 != null && i_20_ != -1)
                            i += aByteArray4151[(i_20_ << 8) + 62];
                        i_20_ = 62;
                    } else if (class100_25_.method1593(aRSString_4135,
                            (byte) 109)) {
                        i += method1011(160);
                        if (aByteArray4151 != null && i_20_ != -1)
                            i += aByteArray4151[(i_20_ << 8) + 160];
                        i_20_ = 160;
                    } else if (class100_25_.method1593(aRSString_4162,
                            (byte) 115)) {
                        i += method1011(173);
                        if (aByteArray4151 != null && i_20_ != -1)
                            i += aByteArray4151[(i_20_ << 8) + 173];
                        i_20_ = 173;
                    } else if (class100_25_.method1593(aRSString_4165,
                            (byte) 101)) {
                        i += method1011(215);
                        if (aByteArray4151 != null && i_20_ != -1)
                            i += aByteArray4151[(i_20_ << 8) + 215];
                        i_20_ = 215;
                    } else if (class100_25_.method1593(aRSString_4147,
                            (byte) 90)) {
                        i += method1011(128);
                        if (aByteArray4151 != null && i_20_ != -1)
                            i += aByteArray4151[(i_20_ << 8) + 128];
                        i_20_ = 128;
                    } else if (class100_25_.method1593(aRSString_4163,
                            (byte) 99)) {
                        i += method1011(169);
                        if (aByteArray4151 != null && i_20_ != -1)
                            i += aByteArray4151[(i_20_ << 8) + 169];
                        i_20_ = 169;
                    } else if (class100_25_.method1593(aRSString_4169,
                            (byte) 104)) {
                        i += method1011(174);
                        if (aByteArray4151 != null && i_20_ != -1)
                            i += aByteArray4151[(i_20_ << 8) + 174];
                        i_20_ = 174;
                    } else if (class100_25_.method1589(aRSString_4155, 45)) {
                        try {
                            int i_26_ = class100_25_.method1615(4, true)
                                    .method1619((byte) -118);
                            i += aClass92Array4153[i_26_].anInt1647;
                            i_20_ = -1;
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                    i_24_ = -1;
                }
                if (i_19_ == -1) {
                    if (i_24_ != -1) {
                        aRSString_4143.method1588(i_24_, 26011);
                        i += method1011(i_24_);
                        if (aByteArray4151 != null && i_20_ != -1)
                            i += aByteArray4151[(i_20_ << 8) + i_24_];
                        i_20_ = i_24_;
                    }
                    if (i_24_ == 32) {
                        i_16_ = aRSString_4143.method1590((byte) -116);
                        i_17_ = i;
                        i_18_ = 1;
                    }
                    if (is != null
                            && i > is[i_21_ < is.length ? i_21_ : is.length - 1]
                            && i_16_ >= 0) {
                        if (class100s[i_21_] != null) {
                            class100s[i_21_].method1594(0, (byte) -119);
                            class100s[i_21_]
                                    = class100s[i_21_].method1572(i_15_,
                                    i_16_ - i_18_,
                                    -10000,
                                    aRSString_4143);
                        } else
                            class100s[i_21_]
                                    = aRSString_4143.method1607(i_15_, (byte) -74,
                                    i_16_ - i_18_);
                        i_21_++;
                        i_15_ = i_16_;
                        i_16_ = -1;
                        i -= i_17_;
                        i_20_ = -1;
                    }
                    if (i_24_ == 45) {
                        i_16_ = aRSString_4143.method1590((byte) -103);
                        i_17_ = i;
                        i_18_ = 0;
                    }
                }
            }
        }
        if (aRSString_4143.method1590((byte) -110) > i_15_) {
            if (class100s[i_21_] != null) {
                class100s[i_21_].method1594(0, (byte) -72);
                class100s[i_21_]
                        = class100s[i_21_].method1572(i_15_,
                        aRSString_4143
                                .method1590((byte) -103),
                        -10000, aRSString_4143);
            } else
                class100s[i_21_]
                        = aRSString_4143.method1607(i_15_, (byte) -74,
                        aRSString_4143
                                .method1590((byte) -109));
            i_21_++;
        }
        return i_21_;
    }

    public static int method1014(byte[][] is, byte[][] is_27_, int[] is_28_,
                                 int[] is_29_, int[] is_30_, int i,
                                 int i_31_) {
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
        for (int i_43_ = i_36_; i_43_ < i_37_; i_43_++) {
            int i_44_ = is_39_[i_41_++] + is_40_[i_42_++];
            if (i_44_ < i_38_)
                i_38_ = i_44_;
        }
        return -i_38_;
    }

    public void method1015(RSString class100, int i, int i_45_, int i_46_,
                           int i_47_, int i_48_) {
        if (class100 != null) {
            method1027(i_46_, i_47_);
            int[] is = new int[class100.anInt2293];
            int[] is_49_ = new int[class100.anInt2293];
            for (int i_50_ = 0; i_50_ < class100.anInt2293; i_50_++) {
                is[i_50_] = (int) (Math.sin((double) i_50_ / 5.0
                        + (double) i_48_ / 5.0)
                        * 5.0);
                is_49_[i_50_] = (int) (Math.sin((double) i_50_ / 3.0
                        + (double) i_48_ / 5.0)
                        * 5.0);
            }
            method1025(class100, i - method1029(class100) / 2, i_45_, is,
                    is_49_);
        }
    }

    public void method1016(RSString class100, int i, int i_51_, int i_52_,
                           int i_53_, int i_54_) {
        if (class100 != null) {
            method1027(i_52_, i_53_);
            int[] is = new int[class100.anInt2293];
            for (int i_55_ = 0; i_55_ < class100.anInt2293; i_55_++)
                is[i_55_] = (int) (Math.sin((double) i_55_ / 2.0
                        + (double) i_54_ / 5.0)
                        * 5.0);
            method1025(class100, i - method1029(class100) / 2, i_51_, null,
                    is);
        }
    }

    public void method1017(Class92[] class92s, int[] is) {
        if (is != null && is.length != class92s.length)
            throw new IllegalArgumentException();
        aClass92Array4153 = class92s;
        anIntArray4161 = is;
    }

    public int method1018(RSString class100, int i) {
        int i_56_ = method1013(class100, new int[]{i}, aRSStringArray4171);
        int i_57_ = 0;
        for (int i_58_ = 0; i_58_ < i_56_; i_58_++) {
            int i_59_ = method1029(aRSStringArray4171[i_58_]);
            if (i_59_ > i_57_)
                i_57_ = i_59_;
        }
        return i_57_;
    }

    public int method1019(RSString class100, int i, int i_60_, int i_61_,
                          int i_62_, int i_63_, int i_64_, int i_65_,
                          int i_66_, int i_67_) {
        return method1034(class100, i, i_60_, i_61_, i_62_, i_63_, i_64_, 256,
                i_65_, i_66_, i_67_);
    }

    public int method1020(RSString class100, int i) {
        return method1013(class100, new int[]{i}, aRSStringArray4171);
    }

    public void method1021(RSString class100, int i, int i_68_) {
        i_68_ -= anInt4137;
        int i_69_ = -1;
        int i_70_ = -1;
        for (int i_71_ = 0; i_71_ < class100.anInt2293; i_71_++) {
            int i_72_ = class100.bytes[i_71_] & 0xff;
            if (i_72_ == 60)
                i_69_ = i_71_;
            else {
                if (i_72_ == 62 && i_69_ != -1) {
                    RSString class100_73_
                            = class100.method1607(i_69_ + 1, (byte) -74, i_71_);
                    i_69_ = -1;
                    if (class100_73_.method1593(aRSString_4160, (byte) 106))
                        i_72_ = 60;
                    else if (class100_73_.method1593(aRSString_4141,
                            (byte) 106))
                        i_72_ = 62;
                    else if (class100_73_.method1593(aRSString_4135,
                            (byte) 95))
                        i_72_ = 160;
                    else if (class100_73_.method1593(aRSString_4162,
                            (byte) 97))
                        i_72_ = 173;
                    else if (class100_73_.method1593(aRSString_4165,
                            (byte) 120))
                        i_72_ = 215;
                    else if (class100_73_.method1593(aRSString_4147,
                            (byte) 124))
                        i_72_ = 128;
                    else if (class100_73_.method1593(aRSString_4163,
                            (byte) 92))
                        i_72_ = 169;
                    else if (class100_73_.method1593(aRSString_4169,
                            (byte) 101))
                        i_72_ = 174;
                    else {
                        if (class100_73_.method1589(aRSString_4155, 61)) {
                            try {
                                int i_74_ = class100_73_.method1615
                                        (4, true)
                                        .method1619((byte) -3);
                                Class92 class92 = aClass92Array4153[i_74_];
                                int i_75_ = (anIntArray4161 != null
                                        ? anIntArray4161[i_74_]
                                        : class92.anInt1645);
                                if (anInt4179 == 256)
                                    class92.method1527(i, (i_68_ + anInt4137
                                            - i_75_));
                                else
                                    class92.method1528(i,
                                            (i_68_ + anInt4137
                                                    - i_75_),
                                            anInt4179);
                                i += class92.anInt1647;
                                i_70_ = -1;
                            } catch (Exception exception) {
                                /* empty */
                            }
                        } else
                            method1026(class100_73_);
                        continue;
                    }
                }
                if (i_69_ == -1) {
                    if (aByteArray4151 != null && i_70_ != -1)
                        i += aByteArray4151[(i_70_ << 8) + i_72_];
                    int i_76_ = anIntArray4158[i_72_];
                    int i_77_ = anIntArray4146[i_72_];
                    if (i_72_ != 32) {
                        if (anInt4179 == 256) {
                            if (anInt4172 != -1)
                                method1024(i_72_,
                                        i + anIntArray4152[i_72_] + 1,
                                        i_68_ + anIntArray4139[i_72_] + 1,
                                        i_76_, i_77_, anInt4172, true);
                            method1024(i_72_, i + anIntArray4152[i_72_],
                                    i_68_ + anIntArray4139[i_72_], i_76_,
                                    i_77_, anInt4180, false);
                        } else {
                            if (anInt4172 != -1)
                                method1023(i_72_,
                                        i + anIntArray4152[i_72_] + 1,
                                        i_68_ + anIntArray4139[i_72_] + 1,
                                        i_76_, i_77_, anInt4172, anInt4179,
                                        true);
                            method1023(i_72_, i + anIntArray4152[i_72_],
                                    i_68_ + anIntArray4139[i_72_], i_76_,
                                    i_77_, anInt4180, anInt4179, false);
                        }
                    } else if (anInt4178 > 0) {
                        anInt4175 += anInt4178;
                        i += anInt4175 >> 8;
                        anInt4175 &= 0xff;
                    }
                    int i_78_ = anIntArray4168[i_72_];
                    if (anInt4173 != -1)
                        Class79.method1428(i,
                                i_68_ + (int) ((double) anInt4137
                                        * 0.7),
                                i_78_, anInt4173);
                    if (anInt4176 != -1)
                        Class79.method1428(i, i_68_ + anInt4137 + 1, i_78_,
                                anInt4176);
                    i += i_78_;
                    i_70_ = i_72_;
                }
            }
        }
    }

    public void method1022(RSString class100, int i, int i_79_, int i_80_,
                           int i_81_) {
        if (class100 != null) {
            method1027(i_80_, i_81_);
            method1021(class100, i - method1029(class100), i_79_);
        }
    }

    public abstract void method1023(int i, int i_82_, int i_83_, int i_84_,
                                    int i_85_, int i_86_, int i_87_,
                                    boolean bool);

    public abstract void method1024(int i, int i_88_, int i_89_, int i_90_,
                                    int i_91_, int i_92_, boolean bool);

    public void method1025(RSString class100, int i, int i_93_, int[] is,
                           int[] is_94_) {
        i_93_ -= anInt4137;
        int i_95_ = -1;
        int i_96_ = -1;
        int i_97_ = 0;
        for (int i_98_ = 0; i_98_ < class100.anInt2293; i_98_++) {
            int i_99_ = class100.bytes[i_98_] & 0xff;
            if (i_99_ == 60)
                i_95_ = i_98_;
            else {
                if (i_99_ == 62 && i_95_ != -1) {
                    RSString class100_100_
                            = class100.method1607(i_95_ + 1, (byte) -74, i_98_);
                    i_95_ = -1;
                    if (class100_100_.method1593(aRSString_4160, (byte) 119))
                        i_99_ = 60;
                    else if (class100_100_.method1593(aRSString_4141,
                            (byte) 123))
                        i_99_ = 62;
                    else if (class100_100_.method1593(aRSString_4135,
                            (byte) 106))
                        i_99_ = 160;
                    else if (class100_100_.method1593(aRSString_4162,
                            (byte) 103))
                        i_99_ = 173;
                    else if (class100_100_.method1593(aRSString_4165,
                            (byte) 97))
                        i_99_ = 215;
                    else if (class100_100_.method1593(aRSString_4147,
                            (byte) 99))
                        i_99_ = 128;
                    else if (class100_100_.method1593(aRSString_4163,
                            (byte) 114))
                        i_99_ = 169;
                    else if (class100_100_.method1593(aRSString_4169,
                            (byte) 127))
                        i_99_ = 174;
                    else {
                        if (class100_100_.method1589(aRSString_4155, 90)) {
                            try {
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
                                int i_103_ = class100_100_.method1615
                                        (4, true)
                                        .method1619((byte) -53);
                                Class92 class92 = aClass92Array4153[i_103_];
                                int i_104_ = (anIntArray4161 != null
                                        ? anIntArray4161[i_103_]
                                        : class92.anInt1645);
                                if (anInt4179 == 256)
                                    class92.method1527(i + i_101_,
                                            (i_93_ + anInt4137
                                                    - i_104_ + i_102_));
                                else
                                    class92.method1528(i + i_101_,
                                            (i_93_ + anInt4137
                                                    - i_104_ + i_102_),
                                            anInt4179);
                                i += class92.anInt1647;
                                i_96_ = -1;
                            } catch (Exception exception) {
                                /* empty */
                            }
                        } else
                            method1026(class100_100_);
                        continue;
                    }
                }
                if (i_95_ == -1) {
                    if (aByteArray4151 != null && i_96_ != -1)
                        i += aByteArray4151[(i_96_ << 8) + i_99_];
                    int i_105_ = anIntArray4158[i_99_];
                    int i_106_ = anIntArray4146[i_99_];
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
                    if (i_99_ != 32) {
                        if (anInt4179 == 256) {
                            if (anInt4172 != -1)
                                method1024(i_99_,
                                        (i + anIntArray4152[i_99_] + 1
                                                + i_107_),
                                        (i_93_ + anIntArray4139[i_99_] + 1
                                                + i_108_),
                                        i_105_, i_106_, anInt4172, true);
                            method1024(i_99_,
                                    i + anIntArray4152[i_99_] + i_107_,
                                    i_93_ + anIntArray4139[i_99_] + i_108_,
                                    i_105_, i_106_, anInt4180, false);
                        } else {
                            if (anInt4172 != -1)
                                method1023(i_99_,
                                        (i + anIntArray4152[i_99_] + 1
                                                + i_107_),
                                        (i_93_ + anIntArray4139[i_99_] + 1
                                                + i_108_),
                                        i_105_, i_106_, anInt4172,
                                        anInt4179, true);
                            method1023(i_99_,
                                    i + anIntArray4152[i_99_] + i_107_,
                                    i_93_ + anIntArray4139[i_99_] + i_108_,
                                    i_105_, i_106_, anInt4180, anInt4179,
                                    false);
                        }
                    } else if (anInt4178 > 0) {
                        anInt4175 += anInt4178;
                        i += anInt4175 >> 8;
                        anInt4175 &= 0xff;
                    }
                    int i_109_ = anIntArray4168[i_99_];
                    if (anInt4173 != -1)
                        Class79.method1428(i,
                                i_93_ + (int) ((double) anInt4137
                                        * 0.7),
                                i_109_, anInt4173);
                    if (anInt4176 != -1)
                        Class79.method1428(i, i_93_ + anInt4137, i_109_,
                                anInt4176);
                    i += i_109_;
                    i_96_ = i_99_;
                }
            }
        }
    }

    public void method1026(RSString class100) {
        do {
            try {
                if (class100.method1589(aRSString_4148, 126))
                    anInt4180
                            = class100.method1615(4, true).method1605(16, 48);
                else if (class100.method1593(aRSString_4154, (byte) 117))
                    anInt4180 = anInt4170;
                else if (class100.method1589(aRSString_4136, 50))
                    anInt4179
                            = class100.method1615(6, true).method1619((byte) -118);
                else if (class100.method1593(aRSString_4164, (byte) 127))
                    anInt4179 = anInt4174;
                else if (class100.method1589(aRSString_4150, 61))
                    anInt4173
                            = class100.method1615(4, true).method1605(16, 90);
                else if (class100.method1593(aRSString_4157, (byte) 126))
                    anInt4173 = 8388608;
                else if (class100.method1593(aRSString_4145, (byte) 111))
                    anInt4173 = -1;
                else if (class100.method1589(aRSString_4166, 43))
                    anInt4176
                            = class100.method1615(2, true).method1605(16, 51);
                else if (class100.method1593(aRSString_4167, (byte) 127))
                    anInt4176 = 0;
                else if (class100.method1593(aRSString_4156, (byte) 117))
                    anInt4176 = -1;
                else if (class100.method1589(aRSString_4159, 98))
                    anInt4172
                            = class100.method1615(5, true).method1605(16, 51);
                else if (class100.method1593(aRSString_4138, (byte) 92))
                    anInt4172 = 0;
                else if (class100.method1593(aRSString_4140, (byte) 113))
                    anInt4172 = anInt4177;
                else {
                    if (!class100.method1593(aRSString_4149, (byte) 118))
                        break;
                    method1012(anInt4170, anInt4177, anInt4174);
                }
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    public void method1027(int i, int i_110_) {
        anInt4173 = -1;
        anInt4176 = -1;
        anInt4172 = anInt4177 = i_110_;
        anInt4180 = anInt4170 = i;
        anInt4179 = anInt4174 = 256;
        anInt4178 = 0;
        anInt4175 = 0;
    }

    public void method1028(byte[] is) {
        anIntArray4168 = new int[256];
        if (is.length == 257) {
            for (int i = 0; i < anIntArray4168.length; i++)
                anIntArray4168[i] = is[i] & 0xff;
            anInt4137 = is[256] & 0xff;
        } else {
            int i = 0;
            for (int i_111_ = 0; i_111_ < 256; i_111_++)
                anIntArray4168[i_111_] = is[i++] & 0xff;
            int[] is_112_ = new int[256];
            int[] is_113_ = new int[256];
            for (int i_114_ = 0; i_114_ < 256; i_114_++)
                is_112_[i_114_] = is[i++] & 0xff;
            for (int i_115_ = 0; i_115_ < 256; i_115_++)
                is_113_[i_115_] = is[i++] & 0xff;
            byte[][] is_116_ = new byte[256][];
            for (int i_117_ = 0; i_117_ < 256; i_117_++) {
                is_116_[i_117_] = new byte[is_112_[i_117_]];
                byte i_118_ = 0;
                for (int i_119_ = 0; i_119_ < is_116_[i_117_].length;
                     i_119_++) {
                    i_118_ += is[i++];
                    is_116_[i_117_][i_119_] = i_118_;
                }
            }
            byte[][] is_120_ = new byte[256][];
            for (int i_121_ = 0; i_121_ < 256; i_121_++) {
                is_120_[i_121_] = new byte[is_112_[i_121_]];
                byte i_122_ = 0;
                for (int i_123_ = 0; i_123_ < is_120_[i_121_].length;
                     i_123_++) {
                    i_122_ += is[i++];
                    is_120_[i_121_][i_123_] = i_122_;
                }
            }
            aByteArray4151 = new byte[65536];
            for (int i_124_ = 0; i_124_ < 256; i_124_++) {
                if (i_124_ != 32 && i_124_ != 160) {
                    for (int i_125_ = 0; i_125_ < 256; i_125_++) {
                        if (i_125_ != 32 && i_125_ != 160)
                            aByteArray4151[(i_124_ << 8) + i_125_]
                                    = (byte) method1014(is_116_, is_120_, is_113_,
                                    anIntArray4168, is_112_,
                                    i_124_, i_125_);
                    }
                }
            }
            anInt4137 = is_113_[32] + is_112_[32];
        }
    }

    public int method1029(RSString class100) {
        if (class100 == null)
            return 0;
        int i = -1;
        int i_126_ = -1;
        int i_127_ = 0;
        for (int i_128_ = 0; i_128_ < class100.anInt2293; i_128_++) {
            int i_129_ = class100.bytes[i_128_] & 0xff;
            if (i_129_ == 60)
                i = i_128_;
            else {
                if (i_129_ == 62 && i != -1) {
                    RSString class100_130_
                            = class100.method1607(i + 1, (byte) -74, i_128_);
                    i = -1;
                    if (class100_130_.method1593(aRSString_4160, (byte) 101))
                        i_129_ = 60;
                    else if (class100_130_.method1593(aRSString_4141,
                            (byte) 122))
                        i_129_ = 62;
                    else if (class100_130_.method1593(aRSString_4135,
                            (byte) 112))
                        i_129_ = 160;
                    else if (class100_130_.method1593(aRSString_4162,
                            (byte) 93))
                        i_129_ = 173;
                    else if (class100_130_.method1593(aRSString_4165,
                            (byte) 96))
                        i_129_ = 215;
                    else if (class100_130_.method1593(aRSString_4147,
                            (byte) 99))
                        i_129_ = 128;
                    else if (class100_130_.method1593(aRSString_4163,
                            (byte) 125))
                        i_129_ = 169;
                    else if (class100_130_.method1593(aRSString_4169,
                            (byte) 112))
                        i_129_ = 174;
                    else {
                        if (class100_130_.method1589(aRSString_4155, 64)) {
                            try {
                                int i_131_ = class100_130_.method1615
                                        (4, true)
                                        .method1619((byte) -22);
                                i_127_ += aClass92Array4153[i_131_].anInt1647;
                                i_126_ = -1;
                            } catch (Exception exception) {
                                /* empty */
                            }
                        }
                        continue;
                    }
                }
                if (i == -1) {
                    i_127_ += anIntArray4168[i_129_];
                    if (aByteArray4151 != null && i_126_ != -1)
                        i_127_ += aByteArray4151[(i_126_ << 8) + i_129_];
                    i_126_ = i_129_;
                }
            }
        }
        return i_127_;
    }

    public void method1030(RSString class100, int i, int i_132_, int i_133_,
                           int i_134_) {
        if (class100 != null) {
            method1027(i_133_, i_134_);
            method1021(class100, i, i_132_);
        }
    }

    public void method1031(RSString class100, int i) {
        int i_135_ = 0;
        boolean bool = false;
        for (int i_136_ = 0; i_136_ < class100.method1590((byte) -122);
             i_136_++) {
            int i_137_ = class100.method1578(i_136_, 7178);
            if (i_137_ == 60)
                bool = true;
            else if (i_137_ == 62)
                bool = false;
            else if (!bool && i_137_ == 32)
                i_135_++;
        }
        if (i_135_ > 0)
            anInt4178 = (i - method1029(class100) << 8) / i_135_;
    }

    public void method1032(RSString class100, int i, int i_138_, int i_139_,
                           int i_140_) {
        if (class100 != null) {
            method1027(i_139_, i_140_);
            method1021(class100, i - method1029(class100) / 2, i_138_);
        }
    }

    public static void method1033() {
        aRSString_4160 = null;
        aRSString_4141 = null;
        aRSString_4135 = null;
        aRSString_4162 = null;
        aRSString_4165 = null;
        aRSString_4147 = null;
        aRSString_4163 = null;
        aRSString_4169 = null;
        aRSString_4155 = null;
        aRSString_4149 = null;
        aRSString_4148 = null;
        aRSString_4154 = null;
        aRSString_4136 = null;
        aRSString_4164 = null;
        aRSString_4166 = null;
        aRSString_4167 = null;
        aRSString_4156 = null;
        aRSString_4159 = null;
        aRSString_4138 = null;
        aRSString_4140 = null;
        aRSString_4150 = null;
        aRSString_4157 = null;
        aRSString_4145 = null;
        aRSString_4143 = null;
        aRSStringArray4171 = null;
    }

    public int method1034(RSString class100, int i, int i_141_, int i_142_,
                          int i_143_, int i_144_, int i_145_, int i_146_,
                          int i_147_, int i_148_, int i_149_) {
        if (class100 == null)
            return 0;
        method1012(i_144_, i_145_, i_146_);
        if (i_149_ == 0)
            i_149_ = anInt4137;
        int[] is = {i_142_};
        if (i_143_ < anInt4142 + anInt4144 + i_149_
                && i_143_ < i_149_ + i_149_)
            is = null;
        int i_150_ = method1013(class100, is, aRSStringArray4171);
        if (i_148_ == 3 && i_150_ == 1)
            i_148_ = 1;
        int i_151_;
        if (i_148_ == 0)
            i_151_ = i_141_ + anInt4142;
        else if (i_148_ == 1)
            i_151_ = i_141_ + anInt4142 + (i_143_ - anInt4142 - anInt4144
                    - (i_150_ - 1) * i_149_) / 2;
        else if (i_148_ == 2)
            i_151_ = i_141_ + i_143_ - anInt4144 - (i_150_ - 1) * i_149_;
        else {
            int i_152_
                    = ((i_143_ - anInt4142 - anInt4144 - (i_150_ - 1) * i_149_)
                    / (i_150_ + 1));
            if (i_152_ < 0)
                i_152_ = 0;
            i_151_ = i_141_ + anInt4142 + i_152_;
            i_149_ += i_152_;
        }
        for (int i_153_ = 0; i_153_ < i_150_; i_153_++) {
            if (i_147_ == 0)
                method1021(aRSStringArray4171[i_153_], i, i_151_);
            else if (i_147_ == 1)
                method1021(aRSStringArray4171[i_153_],
                        i + (i_142_
                                - method1029(aRSStringArray4171[i_153_])) / 2,
                        i_151_);
            else if (i_147_ == 2)
                method1021(aRSStringArray4171[i_153_],
                        i + i_142_ - method1029(aRSStringArray4171[i_153_]),
                        i_151_);
            else if (i_153_ == i_150_ - 1)
                method1021(aRSStringArray4171[i_153_], i, i_151_);
            else {
                method1031(aRSStringArray4171[i_153_], i_142_);
                method1021(aRSStringArray4171[i_153_], i, i_151_);
                anInt4178 = 0;
            }
            i_151_ += i_149_;
        }
        return i_150_;
    }

    public Class68_Sub20_Sub1(byte[] is, int[] is_154_, int[] is_155_,
                              int[] is_156_, int[] is_157_) {
        anIntArray4152 = is_154_;
        anIntArray4139 = is_155_;
        anIntArray4158 = is_156_;
        anIntArray4146 = is_157_;
        method1028(is);
        int i = 2147483647;
        int i_158_ = -2147483648;
        for (int i_159_ = 0; i_159_ < 256; i_159_++) {
            if (anIntArray4139[i_159_] < i && anIntArray4146[i_159_] != 0)
                i = anIntArray4139[i_159_];
            if (anIntArray4139[i_159_] + anIntArray4146[i_159_] > i_158_)
                i_158_ = anIntArray4139[i_159_] + anIntArray4146[i_159_];
        }
        anInt4142 = anInt4137 - i;
        anInt4144 = i_158_ - anInt4137;
    }

    public int method1035(RSString class100, int i, int i_160_, int i_161_,
                          int i_162_, Random random, int i_163_) {
        if (class100 == null)
            return 0;
        random.setSeed((long) i_163_);
        method1012(i_161_, i_162_, 192 + (random.nextInt() & 0x1f));
        int[] is = new int[class100.anInt2293];
        int i_164_ = 0;
        for (int i_165_ = 0; i_165_ < class100.anInt2293; i_165_++) {
            is[i_165_] = i_164_;
            if ((random.nextInt() & 0x3) == 0)
                i_164_++;
        }
        method1025(class100, i, i_160_, is, null);
        return i_164_;
    }

    public Class68_Sub20_Sub1(byte[] is) {
        method1028(is);
    }

    static {
        aRSString_4136 = RSString.newRsString("trans=");
        aRSString_4141 = RSString.newRsString("gt");
        aRSString_4147 = RSString.newRsString("euro");
        aRSString_4150 = RSString.newRsString("str=");
        aRSString_4138 = RSString.newRsString("shad");
        aRSString_4148 = RSString.newRsString("col=");
        aRSString_4135 = RSString.newRsString("nbsp");
        aRSString_4149 = RSString.newRsString("br");
        aRSString_4157 = RSString.newRsString("str");
        aRSString_4156 = RSString.newRsString(")4u");
        aRSString_4160 = RSString.newRsString("lt");
        aRSString_4155 = RSString.newRsString("img=");
        aRSString_4159 = RSString.newRsString("shad=");
        aRSString_4162 = RSString.newRsString("shy");
        aRSString_4163 = RSString.newRsString("copy");
        aRSString_4166 = RSString.newRsString("u=");
        aRSString_4154 = RSString.newRsString(")4col");
        aRSString_4165 = RSString.newRsString("times");
        aRSString_4167 = RSString.newRsString("u");
        aRSString_4164 = RSString.newRsString(")4trans");
        aRSString_4169 = RSString.newRsString("reg");
        aRSString_4143 = Class21renamed.method339(-18982, 100);
        anInt4174 = 256;
        anInt4177 = -1;
        anInt4175 = 0;
        anInt4172 = -1;
        anInt4180 = 0;
        anInt4170 = 0;
        anInt4173 = -1;
        aRSStringArray4171 = new RSString[100];
        anInt4176 = -1;
        anInt4178 = 0;
        anInt4179 = 256;
    }
}
