/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class73 {
    public static Class18 aClass18_1323 = new Class18();

    public static byte method1370(Class18 class18) {
        return (byte) method1377(8, class18);
    }

    public static void method1371(int[] is, int[] is_0_, int[] is_1_,
                                  byte[] is_2_, int i, int i_3_, int i_4_) {
        int i_5_ = 0;
        for (int i_6_ = i; i_6_ <= i_3_; i_6_++) {
            for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
                if (is_2_[i_7_] == i_6_) {
                    is_1_[i_5_] = i_7_;
                    i_5_++;
                }
            }
        }
        for (int i_8_ = 0; i_8_ < 23; i_8_++)
            is_0_[i_8_] = 0;
        for (int i_9_ = 0; i_9_ < i_4_; i_9_++)
            is_0_[is_2_[i_9_] + 1]++;
        for (int i_10_ = 1; i_10_ < 23; i_10_++)
            is_0_[i_10_] += is_0_[i_10_ - 1];
        for (int i_11_ = 0; i_11_ < 23; i_11_++)
            is[i_11_] = 0;
        int i_12_ = 0;
        for (int i_13_ = i; i_13_ <= i_3_; i_13_++) {
            i_12_ += is_0_[i_13_ + 1] - is_0_[i_13_];
            is[i_13_] = i_12_ - 1;
            i_12_ <<= 1;
        }
        for (int i_14_ = i + 1; i_14_ <= i_3_; i_14_++)
            is_0_[i_14_] = (is[i_14_ - 1] + 1 << 1) - is_0_[i_14_];
    }

    public static void method1372(Class18 class18) {
        class18.anInt314 = 0;
        for (int i = 0; i < 256; i++) {
            if (class18.aBooleanArray304[i]) {
                class18.aByteArray311[class18.anInt314] = (byte) i;
                class18.anInt314++;
            }
        }
    }

    public static void method1373() {
        aClass18_1323 = null;
    }

    public static byte method1374(Class18 class18) {
        return (byte) method1377(1, class18);
    }

    public static void method1375(Class18 class18) {
        boolean bool = false;
        boolean bool_15_ = false;
        boolean bool_16_ = false;
        boolean bool_17_ = false;
        boolean bool_18_ = false;
        boolean bool_19_ = false;
        boolean bool_20_ = false;
        boolean bool_21_ = false;
        boolean bool_22_ = false;
        boolean bool_23_ = false;
        boolean bool_24_ = false;
        boolean bool_25_ = false;
        boolean bool_26_ = false;
        boolean bool_27_ = false;
        boolean bool_28_ = false;
        boolean bool_29_ = false;
        boolean bool_30_ = false;
        boolean bool_31_ = false;
        int i = 0;
        int[] is = null;
        int[] is_32_ = null;
        int[] is_33_ = null;
        class18.anInt307 = 1;
        if (Class17.anIntArray283 == null)
            Class17.anIntArray283 = new int[class18.anInt307 * 100000];
        boolean bool_34_ = true;
        while (bool_34_) {
            byte i_35_ = method1370(class18);
            if (i_35_ == 23)
                break;
            i_35_ = method1370(class18);
            i_35_ = method1370(class18);
            i_35_ = method1370(class18);
            i_35_ = method1370(class18);
            i_35_ = method1370(class18);
            i_35_ = method1370(class18);
            i_35_ = method1370(class18);
            i_35_ = method1370(class18);
            i_35_ = method1370(class18);
            i_35_ = method1374(class18);
            class18.anInt306 = 0;
            int i_36_ = method1370(class18);
            class18.anInt306 = class18.anInt306 << 8 | i_36_ & 0xff;
            i_36_ = method1370(class18);
            class18.anInt306 = class18.anInt306 << 8 | i_36_ & 0xff;
            i_36_ = method1370(class18);
            class18.anInt306 = class18.anInt306 << 8 | i_36_ & 0xff;
            for (int i_37_ = 0; i_37_ < 16; i_37_++) {
                i_35_ = method1374(class18);
                if (i_35_ == 1)
                    class18.aBooleanArray325[i_37_] = true;
                else
                    class18.aBooleanArray325[i_37_] = false;
            }
            for (int i_38_ = 0; i_38_ < 256; i_38_++)
                class18.aBooleanArray304[i_38_] = false;
            for (int i_39_ = 0; i_39_ < 16; i_39_++) {
                if (class18.aBooleanArray325[i_39_]) {
                    for (int i_40_ = 0; i_40_ < 16; i_40_++) {
                        i_35_ = method1374(class18);
                        if (i_35_ == 1)
                            class18.aBooleanArray304[i_39_ * 16 + i_40_]
                                    = true;
                    }
                }
            }
            method1372(class18);
            int i_41_ = class18.anInt314 + 2;
            int i_42_ = method1377(3, class18);
            int i_43_ = method1377(15, class18);
            for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
                int i_45_ = 0;
                for (; ; ) {
                    i_35_ = method1374(class18);
                    if (i_35_ == 0)
                        break;
                    i_45_++;
                }
                class18.aByteArray323[i_44_] = (byte) i_45_;
            }
            byte[] is_46_ = new byte[6];
            for (byte i_47_ = 0; i_47_ < i_42_; i_47_++)
                is_46_[i_47_] = i_47_;
            for (int i_48_ = 0; i_48_ < i_43_; i_48_++) {
                byte i_49_ = class18.aByteArray323[i_48_];
                byte i_50_ = is_46_[i_49_];
                for (/**/; i_49_ > 0; i_49_--)
                    is_46_[i_49_] = is_46_[i_49_ - 1];
                is_46_[0] = i_50_;
                class18.aByteArray288[i_48_] = i_50_;
            }
            for (int i_51_ = 0; i_51_ < i_42_; i_51_++) {
                int i_52_ = method1377(5, class18);
                for (int i_53_ = 0; i_53_ < i_41_; i_53_++) {
                    for (; ; ) {
                        i_35_ = method1374(class18);
                        if (i_35_ == 0)
                            break;
                        i_35_ = method1374(class18);
                        if (i_35_ == 0)
                            i_52_++;
                        else
                            i_52_--;
                    }
                    class18.aByteArrayArray300[i_51_][i_53_] = (byte) i_52_;
                }
            }
            for (int i_54_ = 0; i_54_ < i_42_; i_54_++) {
                int i_55_ = 32;
                byte i_56_ = 0;
                for (int i_57_ = 0; i_57_ < i_41_; i_57_++) {
                    if (class18.aByteArrayArray300[i_54_][i_57_] > i_56_)
                        i_56_ = class18.aByteArrayArray300[i_54_][i_57_];
                    if (class18.aByteArrayArray300[i_54_][i_57_] < i_55_)
                        i_55_ = class18.aByteArrayArray300[i_54_][i_57_];
                }
                method1371(class18.anIntArrayArray303[i_54_],
                        class18.anIntArrayArray321[i_54_],
                        class18.anIntArrayArray324[i_54_],
                        class18.aByteArrayArray300[i_54_], i_55_, i_56_,
                        i_41_);
                class18.anIntArray322[i_54_] = i_55_;
            }
            int i_58_ = class18.anInt314 + 1;
            int i_59_ = -1;
            int i_60_ = 0;
            for (int i_61_ = 0; i_61_ <= 255; i_61_++)
                class18.anIntArray319[i_61_] = 0;
            int i_62_ = 4095;
            for (int i_63_ = 15; i_63_ >= 0; i_63_--) {
                for (int i_64_ = 15; i_64_ >= 0; i_64_--) {
                    class18.aByteArray287[i_62_] = (byte) (i_63_ * 16 + i_64_);
                    i_62_--;
                }
                class18.anIntArray299[i_63_] = i_62_ + 1;
            }
            int i_65_ = 0;
            if (i_60_ == 0) {
                i_59_++;
                i_60_ = 50;
                byte i_66_ = class18.aByteArray288[i_59_];
                i = class18.anIntArray322[i_66_];
                is = class18.anIntArrayArray303[i_66_];
                is_33_ = class18.anIntArrayArray324[i_66_];
                is_32_ = class18.anIntArrayArray321[i_66_];
            }
            i_60_--;
            int i_67_ = i;
            int i_68_;
            int i_69_;
            for (i_69_ = method1377(i_67_, class18); i_69_ > is[i_67_];
                 i_69_ = i_69_ << 1 | i_68_) {
                i_67_++;
                i_68_ = method1374(class18);
            }
            int i_70_ = is_33_[i_69_ - is_32_[i_67_]];
            while (i_70_ != i_58_) {
                if (i_70_ == 0 || i_70_ == 1) {
                    int i_71_ = -1;
                    int i_72_ = 1;
                    do {
                        if (i_70_ == 0)
                            i_71_ += i_72_;
                        else if (i_70_ == 1)
                            i_71_ += 2 * i_72_;
                        i_72_ *= 2;
                        if (i_60_ == 0) {
                            i_59_++;
                            i_60_ = 50;
                            byte i_73_ = class18.aByteArray288[i_59_];
                            i = class18.anIntArray322[i_73_];
                            is = class18.anIntArrayArray303[i_73_];
                            is_33_ = class18.anIntArrayArray324[i_73_];
                            is_32_ = class18.anIntArrayArray321[i_73_];
                        }
                        i_60_--;
                        i_67_ = i;
                        for (i_69_ = method1377(i_67_, class18);
                             i_69_ > is[i_67_]; i_69_ = i_69_ << 1 | i_68_) {
                            i_67_++;
                            i_68_ = method1374(class18);
                        }
                        i_70_ = is_33_[i_69_ - is_32_[i_67_]];
                    } while (i_70_ == 0 || i_70_ == 1);
                    i_71_++;
                    i_36_ = (class18.aByteArray311
                            [(class18.aByteArray287[class18.anIntArray299[0]]
                            & 0xff)]);
                    class18.anIntArray319[i_36_ & 0xff] += i_71_;
                    for (/**/; i_71_ > 0; i_71_--) {
                        Class17.anIntArray283[i_65_] = i_36_ & 0xff;
                        i_65_++;
                    }
                } else {
                    int i_74_ = i_70_ - 1;
                    if (i_74_ < 16) {
                        int i_75_ = class18.anIntArray299[0];
                        i_35_ = class18.aByteArray287[i_75_ + i_74_];
                        for (/**/; i_74_ > 3; i_74_ -= 4) {
                            int i_76_ = i_75_ + i_74_;
                            class18.aByteArray287[i_76_]
                                    = class18.aByteArray287[i_76_ - 1];
                            class18.aByteArray287[i_76_ - 1]
                                    = class18.aByteArray287[i_76_ - 2];
                            class18.aByteArray287[i_76_ - 2]
                                    = class18.aByteArray287[i_76_ - 3];
                            class18.aByteArray287[i_76_ - 3]
                                    = class18.aByteArray287[i_76_ - 4];
                        }
                        for (/**/; i_74_ > 0; i_74_--)
                            class18.aByteArray287[i_75_ + i_74_]
                                    = class18.aByteArray287[i_75_ + i_74_ - 1];
                        class18.aByteArray287[i_75_] = i_35_;
                    } else {
                        int i_77_ = i_74_ / 16;
                        int i_78_ = i_74_ % 16;
                        int i_79_ = class18.anIntArray299[i_77_] + i_78_;
                        i_35_ = class18.aByteArray287[i_79_];
                        for (/**/; i_79_ > class18.anIntArray299[i_77_];
                                 i_79_--)
                            class18.aByteArray287[i_79_]
                                    = class18.aByteArray287[i_79_ - 1];
                        class18.anIntArray299[i_77_]++;
                        for (/**/; i_77_ > 0; i_77_--) {
                            class18.anIntArray299[i_77_]--;
                            class18.aByteArray287[class18.anIntArray299[i_77_]]
                                    = (class18.aByteArray287
                                    [(class18.anIntArray299[i_77_ - 1] + 16
                                    - 1)]);
                        }
                        class18.anIntArray299[0]--;
                        class18.aByteArray287[class18.anIntArray299[0]]
                                = i_35_;
                        if (class18.anIntArray299[0] == 0) {
                            int i_80_ = 4095;
                            for (int i_81_ = 15; i_81_ >= 0; i_81_--) {
                                for (int i_82_ = 15; i_82_ >= 0; i_82_--) {
                                    class18.aByteArray287[i_80_]
                                            = (class18.aByteArray287
                                            [(class18.anIntArray299[i_81_]
                                            + i_82_)]);
                                    i_80_--;
                                }
                                class18.anIntArray299[i_81_] = i_80_ + 1;
                            }
                        }
                    }
                    class18.anIntArray319[(class18.aByteArray311[i_35_ & 0xff]
                            & 0xff)]++;
                    Class17.anIntArray283[i_65_]
                            = class18.aByteArray311[i_35_ & 0xff] & 0xff;
                    i_65_++;
                    if (i_60_ == 0) {
                        i_59_++;
                        i_60_ = 50;
                        byte i_83_ = class18.aByteArray288[i_59_];
                        i = class18.anIntArray322[i_83_];
                        is = class18.anIntArrayArray303[i_83_];
                        is_33_ = class18.anIntArrayArray324[i_83_];
                        is_32_ = class18.anIntArrayArray321[i_83_];
                    }
                    i_60_--;
                    i_67_ = i;
                    for (i_69_ = method1377(i_67_, class18); i_69_ > is[i_67_];
                         i_69_ = i_69_ << 1 | i_68_) {
                        i_67_++;
                        i_68_ = method1374(class18);
                    }
                    i_70_ = is_33_[i_69_ - is_32_[i_67_]];
                }
            }
            class18.anInt292 = 0;
            class18.aByte297 = (byte) 0;
            class18.anIntArray291[0] = 0;
            for (int i_84_ = 1; i_84_ <= 256; i_84_++)
                class18.anIntArray291[i_84_]
                        = class18.anIntArray319[i_84_ - 1];
            for (int i_85_ = 1; i_85_ <= 256; i_85_++)
                class18.anIntArray291[i_85_]
                        += class18.anIntArray291[i_85_ - 1];
            for (int i_86_ = 0; i_86_ < i_65_; i_86_++) {
                i_36_ = (byte) (Class17.anIntArray283[i_86_] & 0xff);
                Class17.anIntArray283[class18.anIntArray291[i_36_ & 0xff]]
                        |= i_86_ << 8;
                class18.anIntArray291[i_36_ & 0xff]++;
            }
            class18.anInt290 = Class17.anIntArray283[class18.anInt306] >> 8;
            class18.anInt305 = 0;
            class18.anInt290 = Class17.anIntArray283[class18.anInt290];
            class18.anInt293 = (byte) (class18.anInt290 & 0xff);
            class18.anInt290 >>= 8;
            class18.anInt305++;
            class18.anInt310 = i_65_;
            method1378(class18);
            if (class18.anInt305 == class18.anInt310 + 1
                    && class18.anInt292 == 0)
                bool_34_ = true;
            else
                bool_34_ = false;
        }
    }

    public static int method1376(byte[] is, int i, byte[] is_87_, int i_88_,
                                 int i_89_) {
        synchronized (aClass18_1323) {
            aClass18_1323.aByteArray295 = is_87_;
            aClass18_1323.anInt308 = i_89_;
            aClass18_1323.aByteArray312 = is;
            aClass18_1323.anInt315 = 0;
            aClass18_1323.anInt294 = i;
            aClass18_1323.anInt298 = 0;
            aClass18_1323.anInt286 = 0;
            aClass18_1323.anInt313 = 0;
            aClass18_1323.anInt302 = 0;
            method1375(aClass18_1323);
            i -= aClass18_1323.anInt294;
            aClass18_1323.aByteArray295 = null;
            aClass18_1323.aByteArray312 = null;
            return i;
        }
    }

    public static int method1377(int i, Class18 class18) {
        int i_90_;
        for (; ; ) {
            if (class18.anInt298 >= i) {
                int i_91_
                        = class18.anInt286 >> class18.anInt298 - i & (1 << i) - 1;
                class18.anInt298 -= i;
                i_90_ = i_91_;
                break;
            }
            class18.anInt286
                    = (class18.anInt286 << 8
                    | class18.aByteArray295[class18.anInt308] & 0xff);
            class18.anInt298 += 8;
            class18.anInt308++;
            class18.anInt313++;
        }
        return i_90_;
    }

    public static void method1378(Class18 class18) {
        byte i = class18.aByte297;
        int i_92_ = class18.anInt292;
        int i_93_ = class18.anInt305;
        int i_94_ = class18.anInt293;
        int[] is = Class17.anIntArray283;
        int i_95_ = class18.anInt290;
        byte[] is_96_ = class18.aByteArray312;
        int i_97_ = class18.anInt315;
        int i_98_ = class18.anInt294;
        int i_99_ = i_98_;
        int i_100_ = class18.anInt310 + 1;
        while_94_:
        for (; ; ) {
            if (i_92_ > 0) {
                for (; ; ) {
                    if (i_98_ == 0)
                        break while_94_;
                    if (i_92_ == 1)
                        break;
                    is_96_[i_97_] = i;
                    i_92_--;
                    i_97_++;
                    i_98_--;
                }
                if (i_98_ == 0) {
                    i_92_ = 1;
                    break;
                }
                is_96_[i_97_] = i;
                i_97_++;
                i_98_--;
            }
            boolean bool = true;
            while (bool) {
                bool = false;
                if (i_93_ == i_100_) {
                    i_92_ = 0;
                    break while_94_;
                }
                i = (byte) i_94_;
                i_95_ = is[i_95_];
                int i_101_ = (byte) (i_95_ & 0xff);
                i_95_ >>= 8;
                i_93_++;
                if (i_101_ != i_94_) {
                    i_94_ = i_101_;
                    if (i_98_ == 0) {
                        i_92_ = 1;
                        break while_94_;
                    }
                    is_96_[i_97_] = i;
                    i_97_++;
                    i_98_--;
                    bool = true;
                } else if (i_93_ == i_100_) {
                    if (i_98_ == 0) {
                        i_92_ = 1;
                        break while_94_;
                    }
                    is_96_[i_97_] = i;
                    i_97_++;
                    i_98_--;
                    bool = true;
                }
            }
            i_92_ = 2;
            i_95_ = is[i_95_];
            int i_102_ = (byte) (i_95_ & 0xff);
            i_95_ >>= 8;
            if (++i_93_ != i_100_) {
                if (i_102_ != i_94_)
                    i_94_ = i_102_;
                else {
                    i_92_ = 3;
                    i_95_ = is[i_95_];
                    i_102_ = (byte) (i_95_ & 0xff);
                    i_95_ >>= 8;
                    if (++i_93_ != i_100_) {
                        if (i_102_ != i_94_)
                            i_94_ = i_102_;
                        else {
                            i_95_ = is[i_95_];
                            i_102_ = (byte) (i_95_ & 0xff);
                            i_95_ >>= 8;
                            i_93_++;
                            i_92_ = (i_102_ & 0xff) + 4;
                            i_95_ = is[i_95_];
                            i_94_ = (byte) (i_95_ & 0xff);
                            i_95_ >>= 8;
                            i_93_++;
                        }
                    }
                }
            }
        }
        int i_103_ = class18.anInt302;
        class18.anInt302 += i_99_ - i_98_;
        class18.aByte297 = i;
        class18.anInt292 = i_92_;
        class18.anInt305 = i_93_;
        class18.anInt293 = i_94_;
        Class17.anIntArray283 = is;
        class18.anInt290 = i_95_;
        class18.aByteArray312 = is_96_;
        class18.anInt315 = i_97_;
        class18.anInt294 = i_98_;
    }
}
