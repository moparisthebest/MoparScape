/* Class68_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub27 extends Class68 {
    public static int anInt3210;
    public short[] aShortArray3211;
    public byte[] aByteArray3212;
    public Class68_Sub11_Sub1[] aClass68_Sub11_Sub1Array3213;
    public static int anInt3214;
    public static RSString aRSString_3215
            = RSString.newRsString("; Max)2Age=");
    public int[] anIntArray3216;
    public byte[] aByteArray3217;
    public static int anInt3218;
    public static int anInt3219;
    public static boolean aBoolean3220;
    public int anInt3221;
    public byte[] aByteArray3222;
    public static int anInt3223;
    public Class20[] aClass20Array3224;

    public static void method1218(Animable class1, int i, int i_0_, int i_1_,
                                  int i_2_, int i_3_) {
        boolean bool = true;
        int i_4_ = i_0_;
        int i_5_ = i_0_ + i_2_;
        int i_6_ = i_1_ - 1;
        int i_7_ = i_1_ + i_3_;
        for (int i_8_ = i; i_8_ <= i + 1; i_8_++) {
            if (i_8_ != Class86.anInt1582) {
                for (int i_9_ = i_4_; i_9_ <= i_5_; i_9_++) {
                    if (i_9_ >= 0 && i_9_ < Applet_Sub1.anInt7) {
                        for (int i_10_ = i_6_; i_10_ <= i_7_; i_10_++) {
                            if (i_10_ >= 0 && i_10_ < Class97.anInt1714
                                    && (!bool || i_9_ >= i_5_ || i_10_ >= i_7_
                                    || i_10_ < i_1_ && i_9_ != i_0_)) {
                                Class68_Sub1 class68_sub1
                                        = (Class22.aClass68_Sub1ArrayArrayArray484
                                        [i_8_][i_9_][i_10_]);
                                if (class68_sub1 != null) {
                                    int i_11_
                                            = (((Class68_Sub20_Sub12
                                            .anIntArrayArrayArray4353[i_8_]
                                            [i_9_][i_10_])
                                            + (Class68_Sub20_Sub12
                                            .anIntArrayArrayArray4353[i_8_]
                                            [i_9_ + 1][i_10_])
                                            + (Class68_Sub20_Sub12
                                            .anIntArrayArrayArray4353[i_8_]
                                            [i_9_][i_10_ + 1])
                                            + (Class68_Sub20_Sub12
                                            .anIntArrayArrayArray4353[i_8_]
                                            [i_9_ + 1][i_10_ + 1])) / 4
                                            - ((Class68_Sub20_Sub12
                                            .anIntArrayArrayArray4353[i]
                                            [i_0_][i_1_])
                                            + (Class68_Sub20_Sub12
                                            .anIntArrayArrayArray4353[i]
                                            [i_0_ + 1][i_1_])
                                            + (Class68_Sub20_Sub12
                                            .anIntArrayArrayArray4353[i]
                                            [i_0_][i_1_ + 1])
                                            + (Class68_Sub20_Sub12
                                            .anIntArrayArrayArray4353[i]
                                            [i_0_ + 1][i_1_ + 1])) / 4);
                                    Class64 class64
                                            = class68_sub1.aClass64_2757;
                                    if (class64 != null) {
                                        if (class64.aClass1_1181.method58())
                                            class1.method52
                                                    (class64.aClass1_1181,
                                                            ((i_9_ - i_0_) * 128
                                                                    + (1 - i_2_) * 64),
                                                            i_11_,
                                                            ((i_10_ - i_1_) * 128
                                                                    + (1 - i_3_) * 64),
                                                            bool);
                                        if (class64.aClass1_1184 != null
                                                && class64.aClass1_1184.method58())
                                            class1.method52
                                                    (class64.aClass1_1184,
                                                            ((i_9_ - i_0_) * 128
                                                                    + (1 - i_2_) * 64),
                                                            i_11_,
                                                            ((i_10_ - i_1_) * 128
                                                                    + (1 - i_3_) * 64),
                                                            bool);
                                    }
                                    for (int i_12_ = 0;
                                         i_12_ < class68_sub1.anInt2771;
                                         i_12_++) {
                                        Class69 class69
                                                = (class68_sub1.aClass69Array2772
                                                [i_12_]);
                                        if (class69 != null
                                                && class69.aClass1_1242.method58()
                                                && (i_9_ == class69.anInt1254
                                                || i_9_ == i_4_)
                                                && (i_10_ == class69.anInt1253
                                                || i_10_ == i_6_)) {
                                            int i_13_
                                                    = (class69.anInt1238
                                                    - class69.anInt1254 + 1);
                                            int i_14_
                                                    = (class69.anInt1234
                                                    - class69.anInt1253 + 1);
                                            class1.method52
                                                    (class69.aClass1_1242,
                                                            ((class69.anInt1254 - i_0_)
                                                                    * 128) + (i_13_ - i_2_) * 64,
                                                            i_11_,
                                                            ((class69.anInt1253 - i_1_)
                                                                    * 128) + (i_14_ - i_3_) * 64,
                                                            bool);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i_4_--;
                bool = false;
            }
        }
    }

    public static int method1219(int i, int i_15_, int i_16_, int i_17_,
                                 int i_18_, int i_19_, byte i_20_) {
        if (i_20_ >= -123)
            anInt3219 = -63;
        anInt3214++;
        if ((0x1 & i ^ 0xffffffff) == -2) {
            int i_21_ = i_15_;
            i_15_ = i_18_;
            i_18_ = i_21_;
        }
        i_16_ &= 0x3;
        if ((i_16_ ^ 0xffffffff) == -1)
            return i_17_;
        if (i_16_ == 1)
            return 1 + (-i_15_ + -i_19_ + 7);
        if (i_16_ == 2)
            return -i_18_ - -8 - i_17_;
        return i_19_;
    }

    public void method1220(int i) {
        anInt3223++;
        anIntArray3216 = null;
        if (i != 4)
            method1222(66);
    }

    public boolean method1221(Class14 class14, int[] is, byte[] is_22_,
                              byte i) {
        try {
            anInt3218++;
            Class68_Sub11_Sub1 class68_sub11_sub1 = null;
            int i_23_ = 0;
            boolean bool = true;
            int i_24_ = 40 / ((5 - i) / 33);
            for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -129; i_25_++) {
                if (is_22_ == null || (is_22_[i_25_] ^ 0xffffffff) != -1) {
                    int i_26_ = anIntArray3216[i_25_];
                    if ((i_26_ ^ 0xffffffff) != -1) {
                        if (i_26_ != i_23_) {
                            i_23_ = i_26_;
                            if ((--i_26_ & 0x1 ^ 0xffffffff) != -1)
                                class68_sub11_sub1
                                        = class14.method270(i_26_ >> -1806557726,
                                        (byte) 53, is);
                            else
                                class68_sub11_sub1
                                        = class14.method266(0, is,
                                        i_26_ >> 1270280130);
                            if (class68_sub11_sub1 == null)
                                bool = false;
                        }
                        if (class68_sub11_sub1 != null) {
                            aClass68_Sub11_Sub1Array3213[i_25_]
                                    = class68_sub11_sub1;
                            anIntArray3216[i_25_] = 0;
                        }
                    }
                }
            }
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("vj.D("
                            + (class14 != null ? "{...}" : "null")
                            + ',' + (is != null ? "{...}" : "null")
                            + ','
                            + (is_22_ != null ? "{...}" : "null")
                            + ',' + i + ')'));
        }
    }

    public static void method1222(int i) {
        aRSString_3215 = null;
        if (i != -1)
            method1219(-24, 78, 74, 122, -54, -27, (byte) 10);
    }

    public Class68_Sub27() {
        /* empty */
    }

    public Class68_Sub27(byte[] is) {
        aByteArray3212 = new byte[128];
        aByteArray3222 = new byte[128];
        aClass68_Sub11_Sub1Array3213 = new Class68_Sub11_Sub1[128];
        aByteArray3217 = new byte[128];
        aShortArray3211 = new short[128];
        aClass20Array3224 = new Class20[128];
        int i = 0;
        anIntArray3216 = new int[128];
        Stream class68_sub14;
        for (class68_sub14 = new Stream(is);
             ((class68_sub14.buffer[i + class68_sub14.currentOffset]
                     ^ 0xffffffff)
                     != -1);
             i++) {
            /* empty */
        }
        byte[] is_27_ = new byte[i];
        for (int i_28_ = 0; i > i_28_; i_28_++)
            is_27_[i_28_] = class68_sub14.method955(3390);
        class68_sub14.currentOffset++;
        int i_29_ = class68_sub14.currentOffset;
        i++;
        int i_30_ = 0;
        for (class68_sub14.currentOffset += i;
             (class68_sub14.buffer[i_30_ + class68_sub14.currentOffset]
                     != 0);
             i_30_++) {
            /* empty */
        }
        byte[] is_31_ = new byte[i_30_];
        for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff);
             i_32_++)
            is_31_[i_32_] = class68_sub14.method955(3390);
        i_30_++;
        class68_sub14.currentOffset++;
        int i_33_ = class68_sub14.currentOffset;
        class68_sub14.currentOffset += i_30_;
        int i_34_;
        for (i_34_ = 0;
             (class68_sub14.buffer[class68_sub14.currentOffset - -i_34_]
                     != 0);
             i_34_++) {
            /* empty */
        }
        byte[] is_35_ = new byte[i_34_];
        for (int i_36_ = 0; i_34_ > i_36_; i_36_++)
            is_35_[i_36_] = class68_sub14.method955(3390);
        i_34_++;
        class68_sub14.currentOffset++;
        byte[] is_37_ = new byte[i_34_];
        int i_38_;
        if (i_34_ > 1) {
            int i_39_ = 1;
            i_38_ = 2;
            is_37_[1] = (byte) 1;
            for (int i_40_ = 2; (i_34_ ^ 0xffffffff) < (i_40_ ^ 0xffffffff);
                 i_40_++) {
                int i_41_ = class68_sub14.readUnsignedByte(-6677);
                if (i_41_ == 0)
                    i_39_ = i_38_++;
                else {
                    if ((i_41_ ^ 0xffffffff) >= (i_39_ ^ 0xffffffff))
                        i_41_--;
                    i_39_ = i_41_;
                }
                is_37_[i_40_] = (byte) i_39_;
            }
        } else
            i_38_ = i_34_;
        Class20[] class20s = new Class20[i_38_];
        for (int i_42_ = 0;
             (i_42_ ^ 0xffffffff) > (class20s.length ^ 0xffffffff); i_42_++) {
            Class20 class20 = class20s[i_42_] = new Class20();
            int i_43_ = class68_sub14.readUnsignedByte(-6677);
            if (i_43_ > 0)
                class20.aByteArray407 = new byte[i_43_ * 2];
            i_43_ = class68_sub14.readUnsignedByte(-6677);
            if ((i_43_ ^ 0xffffffff) < -1) {
                class20.aByteArray405 = new byte[i_43_ * 2 + 2];
                class20.aByteArray405[1] = (byte) 64;
            }
        }
        int i_44_ = 0;
        int i_45_ = class68_sub14.readUnsignedByte(-6677);
        byte[] is_46_ = (i_45_ ^ 0xffffffff) < -1 ? new byte[i_45_ * 2] : null;
        i_45_ = class68_sub14.readUnsignedByte(-6677);
        byte[] is_47_ = i_45_ > 0 ? new byte[i_45_ * 2] : null;
        for (/**/;
                 ((class68_sub14.buffer[i_44_ + class68_sub14.currentOffset]
                         ^ 0xffffffff)
                         != -1);
                 i_44_++) {
            /* empty */
        }
        byte[] is_48_ = new byte[i_44_];
        for (int i_49_ = 0; (i_44_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff);
             i_49_++)
            is_48_[i_49_] = class68_sub14.method955(3390);
        class68_sub14.currentOffset++;
        i_44_++;
        int i_50_ = 0;
        for (int i_51_ = 0; i_51_ < 128; i_51_++) {
            i_50_ += class68_sub14.readUnsignedByte(-6677);
            aShortArray3211[i_51_] = (short) i_50_;
        }
        i_50_ = 0;
        for (int i_52_ = 0; (i_52_ ^ 0xffffffff) > -129; i_52_++) {
            i_50_ += class68_sub14.readUnsignedByte(-6677);
            aShortArray3211[i_52_] += i_50_ << -569820856;
        }
        int i_53_ = 0;
        int i_54_ = 0;
        int i_55_ = 0;
        for (int i_56_ = 0; i_56_ < 128; i_56_++) {
            if ((i_53_ ^ 0xffffffff) == -1) {
                if (i_54_ < is_48_.length)
                    i_53_ = is_48_[i_54_++];
                else
                    i_53_ = -1;
                i_55_ = class68_sub14.method927(true);
            }
            aShortArray3211[i_56_]
                    += Class120.method1740(32768, i_55_ + -1 << 821558478);
            i_53_--;
            anIntArray3216[i_56_] = i_55_;
        }
        i_54_ = 0;
        i_53_ = 0;
        int i_57_ = 0;
        for (int i_58_ = 0; i_58_ < 128; i_58_++) {
            if ((anIntArray3216[i_58_] ^ 0xffffffff) != -1) {
                if (i_53_ == 0) {
                    if (i_54_ < is_27_.length)
                        i_53_ = is_27_[i_54_++];
                    else
                        i_53_ = -1;
                    i_57_ = -1 + class68_sub14.buffer[i_29_++];
                }
                aByteArray3217[i_58_] = (byte) i_57_;
                i_53_--;
            }
        }
        int i_59_ = 0;
        i_54_ = 0;
        i_53_ = 0;
        for (int i_60_ = 0; i_60_ < 128; i_60_++) {
            if ((anIntArray3216[i_60_] ^ 0xffffffff) != -1) {
                if ((i_53_ ^ 0xffffffff) == -1) {
                    i_59_ = (16 + class68_sub14.buffer[i_33_++]
                            << -1399136158);
                    if (i_54_ < is_31_.length)
                        i_53_ = is_31_[i_54_++];
                    else
                        i_53_ = -1;
                }
                aByteArray3222[i_60_] = (byte) i_59_;
                i_53_--;
            }
        }
        i_54_ = 0;
        i_53_ = 0;
        Class20 class20 = null;
        for (int i_61_ = 0; (i_61_ ^ 0xffffffff) > -129; i_61_++) {
            if (anIntArray3216[i_61_] != 0) {
                if (i_53_ == 0) {
                    class20 = class20s[is_37_[i_54_]];
                    if ((i_54_ ^ 0xffffffff) <= (is_35_.length ^ 0xffffffff))
                        i_53_ = -1;
                    else
                        i_53_ = is_35_[i_54_++];
                }
                aClass20Array3224[i_61_] = class20;
                i_53_--;
            }
        }
        i_54_ = 0;
        int i_62_ = 0;
        i_53_ = 0;
        for (int i_63_ = 0; i_63_ < 128; i_63_++) {
            if ((i_53_ ^ 0xffffffff) == -1) {
                if ((is_48_.length ^ 0xffffffff) >= (i_54_ ^ 0xffffffff))
                    i_53_ = -1;
                else
                    i_53_ = is_48_[i_54_++];
                if (anIntArray3216[i_63_] > 0)
                    i_62_ = class68_sub14.readUnsignedByte(-6677) - -1;
            }
            aByteArray3212[i_63_] = (byte) i_62_;
            i_53_--;
        }
        anInt3221 = 1 + class68_sub14.readUnsignedByte(-6677);
        for (int i_64_ = 0; (i_64_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff);
             i_64_++) {
            Class20 class20_65_ = class20s[i_64_];
            if (class20_65_.aByteArray407 != null) {
                for (int i_66_ = 1; class20_65_.aByteArray407.length > i_66_;
                     i_66_ += 2)
                    class20_65_.aByteArray407[i_66_]
                            = class68_sub14.method955(3390);
            }
            if (class20_65_.aByteArray405 != null) {
                for (int i_67_ = 3;
                     ((i_67_ ^ 0xffffffff)
                             > (-2 + class20_65_.aByteArray405.length ^ 0xffffffff));
                     i_67_ += 2)
                    class20_65_.aByteArray405[i_67_]
                            = class68_sub14.method955(3390);
            }
        }
        if (is_46_ != null) {
            for (int i_68_ = 1; is_46_.length > i_68_; i_68_ += 2)
                is_46_[i_68_] = class68_sub14.method955(3390);
        }
        if (is_47_ != null) {
            for (int i_69_ = 1;
                 (is_47_.length ^ 0xffffffff) < (i_69_ ^ 0xffffffff);
                 i_69_ += 2)
                is_47_[i_69_] = class68_sub14.method955(3390);
        }
        for (int i_70_ = 0; (i_70_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff);
             i_70_++) {
            Class20 class20_71_ = class20s[i_70_];
            if (class20_71_.aByteArray405 != null) {
                i_50_ = 0;
                for (int i_72_ = 2; i_72_ < class20_71_.aByteArray405.length;
                     i_72_ += 2) {
                    i_50_ = i_50_ + 1 - -class68_sub14.readUnsignedByte(-6677);
                    class20_71_.aByteArray405[i_72_] = (byte) i_50_;
                }
            }
        }
        for (int i_73_ = 0; i_73_ < i_38_; i_73_++) {
            Class20 class20_74_ = class20s[i_73_];
            if (class20_74_.aByteArray407 != null) {
                i_50_ = 0;
                for (int i_75_ = 2;
                     ((class20_74_.aByteArray407.length ^ 0xffffffff)
                             < (i_75_ ^ 0xffffffff));
                     i_75_ += 2) {
                    i_50_ = 1 + i_50_ - -class68_sub14.readUnsignedByte(-6677);
                    class20_74_.aByteArray407[i_75_] = (byte) i_50_;
                }
            }
        }
        if (is_46_ != null) {
            i_50_ = class68_sub14.readUnsignedByte(-6677);
            is_46_[0] = (byte) i_50_;
            for (int i_76_ = 2; i_76_ < is_46_.length; i_76_ += 2) {
                i_50_ = class68_sub14.readUnsignedByte(-6677) + i_50_ - -1;
                is_46_[i_76_] = (byte) i_50_;
            }
            int i_77_ = is_46_[0];
            int i_78_ = is_46_[1];
            for (int i_79_ = 0; i_77_ > i_79_; i_79_++)
                aByteArray3212[i_79_]
                        = (byte) (32 + i_78_ * aByteArray3212[i_79_]
                        >> 1819936230);
            int i_80_ = 2;
            while (i_80_ < is_46_.length) {
                int i_81_ = is_46_[i_80_];
                int i_82_ = is_46_[i_80_ + 1];
                i_80_ += 2;
                int i_83_ = i_78_ * (i_81_ - i_77_) + (-i_77_ + i_81_) / 2;
                for (int i_84_ = i_77_; i_84_ < i_81_; i_84_++) {
                    int i_85_
                            = Class69.method1326(503159455, i_81_ - i_77_, i_83_);
                    i_83_ += -i_78_ + i_82_;
                    aByteArray3212[i_84_]
                            = (byte) (32 + aByteArray3212[i_84_] * i_85_
                            >> -1612862202);
                }
                i_77_ = i_81_;
                i_78_ = i_82_;
            }
            Object object = null;
            for (int i_86_ = i_77_; (i_86_ ^ 0xffffffff) > -129; i_86_++)
                aByteArray3212[i_86_]
                        = (byte) (32 + i_78_ * aByteArray3212[i_86_] >> 316844998);
        }
        if (is_47_ != null) {
            i_50_ = class68_sub14.readUnsignedByte(-6677);
            is_47_[0] = (byte) i_50_;
            for (int i_87_ = 2;
                 (i_87_ ^ 0xffffffff) > (is_47_.length ^ 0xffffffff);
                 i_87_ += 2) {
                i_50_ = class68_sub14.readUnsignedByte(-6677) + i_50_ + 1;
                is_47_[i_87_] = (byte) i_50_;
            }
            int i_88_ = is_47_[0];
            int i_89_ = is_47_[1] << -2062689791;
            for (int i_90_ = 0; i_88_ > i_90_; i_90_++) {
                int i_91_ = i_89_ + (0xff & aByteArray3222[i_90_]);
                if ((i_91_ ^ 0xffffffff) > -1)
                    i_91_ = 0;
                if ((i_91_ ^ 0xffffffff) < -129)
                    i_91_ = 128;
                aByteArray3222[i_90_] = (byte) i_91_;
            }
            int i_92_ = 2;
            while (i_92_ < is_47_.length) {
                int i_93_ = is_47_[i_92_];
                int i_94_ = is_47_[i_92_ - -1] << 676653313;
                int i_95_ = (-i_88_ + i_93_) / 2 + i_89_ * (-i_88_ + i_93_);
                i_92_ += 2;
                for (int i_96_ = i_88_;
                     (i_93_ ^ 0xffffffff) < (i_96_ ^ 0xffffffff); i_96_++) {
                    int i_97_
                            = Class69.method1326(503159455, -i_88_ + i_93_, i_95_);
                    int i_98_ = i_97_ + (aByteArray3222[i_96_] & 0xff);
                    i_95_ += -i_89_ + i_94_;
                    if ((i_98_ ^ 0xffffffff) > -1)
                        i_98_ = 0;
                    if (i_98_ > 128)
                        i_98_ = 128;
                    aByteArray3222[i_96_] = (byte) i_98_;
                }
                i_89_ = i_94_;
                i_88_ = i_93_;
            }
            Object object = null;
            for (int i_99_ = i_88_; i_99_ < 128; i_99_++) {
                int i_100_ = (aByteArray3222[i_99_] & 0xff) - -i_89_;
                if ((i_100_ ^ 0xffffffff) > -1)
                    i_100_ = 0;
                if ((i_100_ ^ 0xffffffff) < -129)
                    i_100_ = 128;
                aByteArray3222[i_99_] = (byte) i_100_;
            }
        }
        for (int i_101_ = 0; i_38_ > i_101_; i_101_++)
            class20s[i_101_].anInt409 = class68_sub14.readUnsignedByte(-6677);
        for (int i_102_ = 0; i_38_ > i_102_; i_102_++) {
            Class20 class20_103_ = class20s[i_102_];
            if (class20_103_.aByteArray407 != null)
                class20_103_.anInt418 = class68_sub14.readUnsignedByte(-6677);
            if (class20_103_.aByteArray405 != null)
                class20_103_.anInt414 = class68_sub14.readUnsignedByte(-6677);
            if ((class20_103_.anInt409 ^ 0xffffffff) < -1)
                class20_103_.anInt402 = class68_sub14.readUnsignedByte(-6677);
        }
        for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff);
             i_104_++)
            class20s[i_104_].anInt408 = class68_sub14.readUnsignedByte(-6677);
        for (int i_105_ = 0; i_105_ < i_38_; i_105_++) {
            Class20 class20_106_ = class20s[i_105_];
            if ((class20_106_.anInt408 ^ 0xffffffff) < -1)
                class20_106_.anInt417 = class68_sub14.readUnsignedByte(-6677);
        }
        for (int i_107_ = 0; (i_107_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff);
             i_107_++) {
            Class20 class20_108_ = class20s[i_107_];
            if (class20_108_.anInt417 > 0)
                class20_108_.anInt415 = class68_sub14.readUnsignedByte(-6677);
        }
    }
}
