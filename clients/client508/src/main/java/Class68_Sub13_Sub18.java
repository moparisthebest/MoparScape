/* Class68_Sub13_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub18 extends Class68_Sub13 {
    public static int anInt3726;
    public static RSString aRSString_3727 = RSString.newRsString("wave:");
    public static RSString aRSString_3728 = aRSString_3727;
    public static int anInt3729;
    public static int anInt3730;
    public static RSString aRSString_3731;
    public static RSString aRSString_3732 = RSString.newRsString("(U4");
    public static int anInt3733;
    public static int anInt3734;
    public static int anInt3735;
    public static int anInt3736;
    public static int anInt3737;
    public static boolean[][] aBooleanArrayArray3738;

    public static void method786(byte i, int i_0_, int i_1_, int i_2_,
                                 int i_3_) {
        int i_4_ = -i_2_;
        anInt3729++;
        int i_5_ = -1;
        int i_6_ = i_2_;
        int i_7_
                = Class68_Sub20_Sub15.method1171(i_1_ - -i_2_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        int i_8_
                = Class68_Sub20_Sub15.method1171(-i_2_ + i_1_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        if (i != 83)
            aRSString_3728 = null;
        int i_9_ = 0;
        Class34.method416(i_8_, (byte) -17, i_0_,
                Class68_Sub22.anIntArrayArray3132[i_3_], i_7_);
        while ((i_9_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
            i_5_ += 2;
            i_4_ += i_5_;
            if ((i_4_ ^ 0xffffffff) < -1) {
                int i_10_ = --i_6_ + i_3_;
                i_4_ -= i_6_ << 1795291777;
                int i_11_ = -i_6_ + i_3_;
                if (i_10_ >= Class35.anInt605
                        && (i_11_ ^ 0xffffffff) >= (Class51.anInt2255
                        ^ 0xffffffff)) {
                    int i_12_
                            = Class68_Sub20_Sub15.method1171(i_9_ + i_1_,
                            Class113.anInt1918,
                            (byte) 114,
                            GroundData.anInt677);
                    int i_13_
                            = Class68_Sub20_Sub15.method1171(-i_9_ + i_1_,
                            Class113.anInt1918,
                            (byte) 114,
                            GroundData.anInt677);
                    if (i_10_ <= Class51.anInt2255)
                        Class34.method416(i_13_, (byte) -17, i_0_,
                                (Class68_Sub22.anIntArrayArray3132
                                        [i_10_]),
                                i_12_);
                    if ((i_11_ ^ 0xffffffff)
                            <= (Class35.anInt605 ^ 0xffffffff))
                        Class34.method416(i_13_, (byte) -17, i_0_,
                                (Class68_Sub22.anIntArrayArray3132
                                        [i_11_]),
                                i_12_);
                }
            }
            i_9_++;
            int i_14_ = i_3_ - i_9_;
            int i_15_ = i_3_ + i_9_;
            if (Class35.anInt605 <= i_15_ && Class51.anInt2255 >= i_14_) {
                int i_16_ = Class68_Sub20_Sub15.method1171(i_6_ + i_1_,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                int i_17_ = Class68_Sub20_Sub15.method1171(-i_6_ + i_1_,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                if (Class51.anInt2255 >= i_15_)
                    Class34.method416(i_17_, (byte) -17, i_0_,
                            Class68_Sub22.anIntArrayArray3132[i_15_],
                            i_16_);
                if (Class35.anInt605 <= i_14_)
                    Class34.method416(i_17_, (byte) -17, i_0_,
                            Class68_Sub22.anIntArrayArray3132[i_14_],
                            i_16_);
            }
        }
    }

    public static void method787(byte i) {
        int i_18_ = Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511
                .method1029(Class68_Sub13_Sub26_Sub1.aRSString_4605);
        for (int i_19_ = 0; i_19_ < Class68_Sub13_Sub21.anInt3803; i_19_++) {
            int i_20_ = Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511
                    .method1029(Class58.method579((byte) -59, i_19_));
            if ((i_20_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
                i_18_ = i_20_;
        }
        i_18_ += 8;
        int i_21_ = -(i_18_ / 2) + Class68_Sub25.anInt3176;
        if (Class13_Sub3.width < i_18_ + i_21_)
            i_21_ = Class13_Sub3.width - i_18_;
        int i_22_ = 21 + 15 * Class68_Sub13_Sub21.anInt3803;
        if (i_21_ < 0)
            i_21_ = 0;
        int i_23_ = Class92.anInt1646;
        anInt3726++;
        if ((Class68_Sub13_Sub9.height ^ 0xffffffff)
                > (i_22_ + i_23_ ^ 0xffffffff))
            i_23_ = -i_22_ + Class68_Sub13_Sub9.height;
        if ((i_23_ ^ 0xffffffff) > -1)
            i_23_ = 0;
        int i_24_ = -52 % ((i - 39) / 41);
        if ((Class47.anInt940 ^ 0xffffffff) != -2) {
            if (Class68_Sub25.anInt3176 != Class68_Sub13_Sub37.anInt4077
                    || (Class125.anInt2173 ^ 0xffffffff) != (Class92.anInt1646
                    ^ 0xffffffff)) {
                Class13_Sub4.anInt2682 = Class68_Sub13_Sub37.anInt4077;
                Class47.anInt940 = 1;
                Class68_Sub13_Sub16.anInt3705 = Class125.anInt2173;
            } else {
                Class49.anInt969 = i_21_;
                Class33.anInt588 = 22 + 15 * Class68_Sub13_Sub21.anInt3803;
                Class120.aBoolean2099 = true;
                Class68_Sub13_Sub15.anInt3687 = i_18_;
                Class68_Sub13_Sub14.anInt3667 = i_23_;
                Class47.anInt940 = 0;
            }
        } else if (((Class68_Sub25.anInt3176 ^ 0xffffffff)
                == (Class13_Sub4.anInt2682 ^ 0xffffffff))
                && ((Class92.anInt1646 ^ 0xffffffff)
                == (Class68_Sub13_Sub16.anInt3705 ^ 0xffffffff))) {
            Class68_Sub13_Sub14.anInt3667 = i_23_;
            Class49.anInt969 = i_21_;
            Class120.aBoolean2099 = true;
            Class68_Sub13_Sub15.anInt3687 = i_18_;
            Class33.anInt588 = 22 + Class68_Sub13_Sub21.anInt3803 * 15;
            Class47.anInt940 = 0;
        }
    }

    public static void method788(int i) {
        if (i != 208)
            method787((byte) -16);
        aRSString_3727 = null;
        aBooleanArrayArray3738 = null;
        aRSString_3732 = null;
        aRSString_3731 = null;
        aRSString_3728 = null;
    }

    public Class68_Sub13_Sub18() {
        super(1, true);
    }

    public int[] method698(byte i, int i_25_) {
        if (i != -61)
            method788(-89);
        anInt3733++;
        int[] is = aClass115_2936.method1697(false, i_25_);
        if (aClass115_2936.aBoolean1957) {
            int[][] is_26_ = this.method699(-114, 0, i_25_);
            int[] is_27_ = is_26_[0];
            int[] is_28_ = is_26_[2];
            int[] is_29_ = is_26_[1];
            for (int i_30_ = 0; Class68_Sub13_Sub19.anInt3746 > i_30_; i_30_++)
                is[i_30_]
                        = (is_27_[i_30_] - -is_29_[i_30_] + is_28_[i_30_]) / 3;
        }
        return is;
    }

    public static void method789(int i) {
        anInt3736++;
        if ((Class49.anInt962 ^ 0xffffffff) == -249) {
            int i_31_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_32_ = (0x7 & i_31_ >> -1708747836) + Class93.anInt1668;
            int i_33_ = (i_31_ & 0x7) + Class68_Sub28_Sub1.anInt4491;
            int i_34_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            int i_35_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_36_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            if (i_32_ >= 0 && (i_33_ ^ 0xffffffff) <= -1 && i_32_ < 104
                    && i_33_ < 104) {
                i_32_ = i_32_ * 128 - -64;
                i_33_ = i_33_ * 128 + 64;
                Class1_Sub5 class1_sub5
                        = (new Class1_Sub5
                        (i_34_, GameSocket.anInt1149, i_32_, i_33_,
                                -i_35_ + Class1_Sub6_Sub2.method163(i_32_,
                                        GameSocket.anInt1149,
                                        i_33_, false),
                                i_36_, Class68_Sub3.anInt2812));
                Class105.aClass16_1790
                        .method286(new Class68_Sub20_Sub5(class1_sub5), true);
            }
        } else if ((Class49.anInt962 ^ 0xffffffff) == -30) {
            int i_37_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_38_ = 2 * Class68_Sub28_Sub1.anInt4491 + (i_37_ & 0xf);
            int i_39_ = ((0xf6 & i_37_) >> -555358940) + Class93.anInt1668 * 2;
            int i_40_ = i_39_ + Class68_Sub13_Sub8.inStream
                    .method955(i + 3391);
            int i_41_ = i_38_ + Class68_Sub13_Sub8.inStream
                    .method955(3390);
            int i_42_ = Class68_Sub13_Sub8.inStream
                    .method957(-22489);
            int i_43_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            int i_44_ = 4 * Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(-6677);
            int i_45_ = (Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i + -6676)
                    * 4);
            int i_46_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(i ^ ~0x50cf66c8);
            int i_47_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            int i_48_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i ^ 0x1a14);
            int i_49_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i + -6676);
            if (i_39_ >= 0 && i_38_ >= 0 && (i_39_ ^ 0xffffffff) > -209
                    && (i_38_ ^ 0xffffffff) > -209 && (i_40_ ^ 0xffffffff) <= -1
                    && (i_41_ ^ 0xffffffff) <= -1 && (i_40_ ^ 0xffffffff) > -209
                    && i_41_ < 208 && (i_43_ ^ 0xffffffff) != -65536) {
                i_39_ *= 64;
                i_38_ = 64 * i_38_;
                i_40_ *= 64;
                Class1_Sub1 class1_sub1
                        = (new Class1_Sub1
                        (i_43_, GameSocket.anInt1149, i_39_, i_38_,
                                -i_44_ + Class1_Sub6_Sub2.method163(i_39_,
                                        GameSocket.anInt1149,
                                        i_38_, false),
                                Class68_Sub3.anInt2812 + i_46_,
                                i_47_ - -Class68_Sub3.anInt2812, i_48_, i_49_, i_42_,
                                i_45_));
                i_41_ *= 64;
                class1_sub1.method64(i_40_, (byte) -105, i_41_,
                        (Class1_Sub6_Sub2.method163(i_40_,
                                (GameSocket
                                        .anInt1149),
                                i_41_, false)
                                + -i_45_),
                        Class68_Sub3.anInt2812 + i_46_);
                Class45.aClass16_886
                        .method286(new Class68_Sub20_Sub4(class1_sub1), true);
            }
        } else if (Class49.anInt962 == 30) {
            int i_50_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWordBigEndian(i ^ 0x47);
            int i_51_ = Class68_Sub13_Sub8.inStream.readUnsignedByteA();
            int i_52_ = Class68_Sub28_Sub1.anInt4491 + (0x7 & i_51_);
            int i_53_ = Class93.anInt1668 + (0x7 & i_51_ >> -1355904828);
            int i_54_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
            int i_55_ = i_54_ >> 631527074;
            int i_56_ = Class12.anIntArray201[i_55_];
            int i_57_ = 0x3 & i_54_;
            if ((i_53_ ^ 0xffffffff) <= -1 && (i_52_ ^ 0xffffffff) <= -1
                    && (i_53_ ^ 0xffffffff) > -105 && (i_52_ ^ 0xffffffff) > -105)
                Unknown.method1500(i_53_, i ^ 0xffffffff, -1, i_56_, i_52_,
                        i_55_, i_57_, GameSocket.anInt1149, 0, i_50_);
        } else if (Class49.anInt962 == 110) {
            int i_58_ = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            int i_59_ = i_58_ >> -1965788638;
            int i_60_ = i_58_ & 0x3;
            int i_61_ = Class12.anIntArray201[i_59_];
            int i_62_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            int i_63_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            int i_64_ = Class68_Sub28_Sub1.anInt4491 - -(0x7 & i_63_);
            if (i_62_ == 65535)
                i_62_ = -1;
            int i_65_ = Class93.anInt1668 + ((i_63_ & 0x75) >> -1786063068);
            Class43.method483(i_64_, i_59_, GameSocket.anInt1149, i_60_, i_65_,
                    (byte) 117, i_62_, i_61_);
        } else if ((Class49.anInt962 ^ 0xffffffff) == -233) {
            int i_66_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_67_ = Class93.anInt1668 + ((0x7d & i_66_) >> -2136350684);
            int i_68_ = Class68_Sub28_Sub1.anInt4491 + (0x7 & i_66_);
            int i_69_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            if ((i_69_ ^ 0xffffffff) == -65536)
                i_69_ = -1;
            int i_70_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_71_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i + -6676);
            int i_72_ = i_70_ >> -246061916 & 0xf;
            int i_73_ = i_70_ & 0x7;
            if (i_67_ >= 0 && (i_68_ ^ 0xffffffff) <= -1
                    && (i_67_ ^ 0xffffffff) > -105
                    && (i_68_ ^ 0xffffffff) > -105) {
                int i_74_ = i_72_ + 1;
                if ((Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0]
                        >= i_67_ - i_74_)
                        && ((i_74_ + i_67_ ^ 0xffffffff)
                        <= ((Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523
                        [0])
                        ^ 0xffffffff))
                        && ((i_68_ + -i_74_ ^ 0xffffffff)
                        >= ((Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570
                        [0])
                        ^ 0xffffffff))
                        && ((i_68_ + i_74_ ^ 0xffffffff)
                        <= ((Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570
                        [0])
                        ^ 0xffffffff))
                        && (Class68_Sub20_Sub15.anInt4399 ^ 0xffffffff) != -1
                        && i_73_ > 0 && (Class1_Sub2.anInt2435 ^ 0xffffffff) > -51
                        && (i_69_ ^ 0xffffffff) != 0) {
                    Login.anIntArray1515[Class1_Sub2.anInt2435] = i_69_;
                    PacketParser.anIntArray1876[Class1_Sub2.anInt2435] = i_73_;
                    Class34.anIntArray596[Class1_Sub2.anInt2435] = i_71_;
                    Class3.aClass46Array80[Class1_Sub2.anInt2435] = null;
                    Class102.anIntArray1757[Class1_Sub2.anInt2435]
                            = ((i_67_ << -1907916944) - -(i_68_ << 560581576)
                            - -i_72_);
                    Class1_Sub2.anInt2435++;
                }
            }
        } else if (Class49.anInt962 == 201) {
            int i_75_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_76_ = ((i_75_ & 0x73) >> 177348356) + Class93.anInt1668;
            int i_77_ = (i_75_ & 0x7) + Class68_Sub28_Sub1.anInt4491;
            int i_78_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
            if (i_76_ >= 0 && i_77_ >= 0 && i_76_ < 104 && (i_77_ ^ 0xffffffff) > -105) {
                Class16 class16 = (Class45.aClass16ArrayArrayArray926[GameSocket.anInt1149][i_76_][i_77_]);
                if (class16 != null) {
                    for (Class68_Sub20_Sub18 class68_sub20_sub18 = ((Class68_Sub20_Sub18) class16.method293((byte) 76));
                         class68_sub20_sub18 != null;
                         class68_sub20_sub18 = ((Class68_Sub20_Sub18) class16.method290((byte) 16))) {
                        if ((0x7fff & i_78_ ^ 0xffffffff) == (class68_sub20_sub18.aClass1_Sub2_4445.anInt2431 ^ 0xffffffff)) {
                            class68_sub20_sub18.method647(i + -17553);
                            break;
                        }
                    }
                    if (class16.method293((byte) 76) == null)
                        Class45.aClass16ArrayArrayArray926[GameSocket.anInt1149][i_76_][i_77_] = null;
                    Class68_Sub20_Sub9.method1100(i_76_, (byte) -52, i_77_);
                }
            }
        } else {
            if ((Class49.anInt962 ^ 0xffffffff) == -22) {
                int i_79_ = Class68_Sub13_Sub8.inStream.readUnsignedByteA();
                int i_80_ = i_79_ & 0x3;
                int i_81_ = i_79_ >> -1321675038;
                int i_82_ = Class12.anIntArray201[i_81_];
                int i_83_ = Class68_Sub13_Sub8.inStream
                        .method955(3390);
                int i_84_ = Class68_Sub13_Sub8.inStream
                        .method919((byte) 88);
                int i_85_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
                int i_86_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
                int i_87_ = Class68_Sub13_Sub8.inStream
                        .readUnsignedWord(1355769544);
                int i_88_ = Class68_Sub13_Sub8.inStream
                        .readUnsignedByte(-6677);
                int i_89_ = Class93.anInt1668 - -(0x7 & i_88_ >> -1932319804);
                int i_90_ = Class68_Sub28_Sub1.anInt4491 - -(0x7 & i_88_);
                int i_91_ = Class68_Sub13_Sub8.inStream
                        .method919((byte) 59);
                int i_92_ = Class68_Sub13_Sub8.inStream
                        .readUnsignedWordBigEndian(-41);
                int i_93_ = Class68_Sub13_Sub8.inStream
                        .method917(false);
                Class1_Sub6_Sub2 class1_sub6_sub2;
                if (Class68_Sub10.anInt2911 != i_85_)
                    class1_sub6_sub2
                            = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_85_];
                else
                    class1_sub6_sub2 = Class68_Sub7.aClass1_Sub6_Sub2_2860;
                if (class1_sub6_sub2 != null) {
                    Class116 class116 = Class1_Sub5.method140(84, i_87_);
                    int i_94_;
                    int i_95_;
                    if ((i_80_ ^ 0xffffffff) == -2
                            || (i_80_ ^ 0xffffffff) == -4) {
                        i_95_ = class116.anInt1988;
                        i_94_ = class116.anInt1987;
                    } else {
                        i_94_ = class116.anInt1988;
                        i_95_ = class116.anInt1987;
                    }
                    int i_96_ = i_90_ - -(i_95_ >> -572452511);
                    int i_97_ = i_90_ + (1 + i_95_ >> 857882625);
                    int i_98_ = (i_94_ >> 1312690017) + i_89_;
                    int[][] is = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                            [GameSocket.anInt1149]);
                    int i_99_ = (i_94_ - -1 >> -1222094271) + i_89_;
                    int[][] is_100_ = null;
                    if (GameSocket.anInt1149 < 3)
                        is_100_ = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                [1 + GameSocket.anInt1149]);
                    int i_101_ = (is[i_98_][i_96_] + (is[i_99_][i_96_]
                            - -is[i_98_][i_97_]
                            + is[i_99_][i_97_])
                            >> -962628286);
                    int i_102_
                            = (i_89_ << 1985401543) + (i_94_ << -1970496986);
                    int i_103_ = (i_90_ << -914098265) - -(i_95_ << 74204806);
                    Class44 class44
                            = class116.method1702(i_81_, null,
                            class116.aBoolean2018,
                            (byte) 123, false, i_101_, i_80_,
                            is, i_103_, is_100_, i_102_);
                    if (class44 != null) {
                        if (i_93_ < i_84_) {
                            int i_104_ = i_84_;
                            i_84_ = i_93_;
                            i_93_ = i_104_;
                        }
                        Unknown.method1500(i_89_, 0, 1 + i_86_, i_82_, i_90_,
                                0, 0, GameSocket.anInt1149, i_92_ - -1,
                                -1);
                        class1_sub6_sub2.aClass1_Sub3_3411
                                = (Class1_Sub3) class44.aClass1_746;
                        class1_sub6_sub2.anInt3407 = 64 * i_95_ + 128 * i_90_;
                        class1_sub6_sub2.anInt3433 = i_84_ + i_89_;
                        class1_sub6_sub2.anInt3439
                                = Class68_Sub3.anInt2812 + i_86_;
                        class1_sub6_sub2.anInt3412
                                = Class68_Sub3.anInt2812 + i_92_;
                        class1_sub6_sub2.anInt3434 = i_101_;
                        class1_sub6_sub2.anInt3416 = 64 * i_94_ + 128 * i_89_;
                        class1_sub6_sub2.anInt3408 = i_93_ + i_89_;
                        if ((i_91_ ^ 0xffffffff) < (i_83_ ^ 0xffffffff)) {
                            int i_105_ = i_91_;
                            i_91_ = i_83_;
                            i_83_ = i_105_;
                        }
                        class1_sub6_sub2.anInt3438 = i_90_ - -i_91_;
                        class1_sub6_sub2.anInt3419 = i_83_ + i_90_;
                    }
                }
            }
            if ((Class49.anInt962 ^ 0xffffffff) == -197) {
                int i_106_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
                int i_107_ = (0x7 & i_106_) + Class68_Sub28_Sub1.anInt4491;
                int i_108_
                        = ((i_106_ & 0x76) >> 742230052) + Class93.anInt1668;
                int i_109_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
                int i_110_ = i_109_ & 0x3;
                int i_111_ = i_109_ >> -989803230;
                int i_112_ = Class12.anIntArray201[i_111_];
                if (i_108_ >= 0 && (i_107_ ^ 0xffffffff) <= -1 && i_108_ < 104
                        && i_107_ < 104)
                    Unknown.method1500(i_108_, i ^ 0xffffffff, -1, i_112_,
                            i_107_, i_111_, i_110_,
                            GameSocket.anInt1149, 0, -1);
            } else {
                if (i != -1)
                    method789(81);
                if ((Class49.anInt962 ^ 0xffffffff) == -113) {
                    int i_113_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedByte(-6677);
                    int i_114_
                            = Class93.anInt1668 - -(i_113_ >> -449700668 & 0x7);
                    int i_115_ = Class68_Sub28_Sub1.anInt4491 + (i_113_ & 0x7);
                    int i_116_
                            = i_114_ + Class68_Sub13_Sub8
                            .inStream
                            .method955(3390);
                    int i_117_ = (Class68_Sub13_Sub8
                            .inStream.method955(3390)
                            + i_115_);
                    int i_118_ = Class68_Sub13_Sub8
                            .inStream
                            .method957(-22489);
                    int i_119_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedWord(1355769544);
                    int i_120_
                            = 4 * Class68_Sub13_Sub8.inStream
                            .readUnsignedByte(-6677);
                    int i_121_
                            = 4 * Class68_Sub13_Sub8.inStream
                            .readUnsignedByte(-6677);
                    int i_122_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedWord(1355769544);
                    int i_123_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedWord(1355769544);
                    int i_124_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedByte(i + -6676);
                    int i_125_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedByte(-6677);
                    if (i_114_ >= 0 && (i_115_ ^ 0xffffffff) <= -1
                            && (i_114_ ^ 0xffffffff) > -105
                            && (i_115_ ^ 0xffffffff) > -105 && i_116_ >= 0
                            && i_117_ >= 0 && i_116_ < 104 && i_117_ < 104
                            && i_119_ != 65535) {
                        i_114_ = i_114_ * 128 - -64;
                        i_115_ = 64 + i_115_ * 128;
                        i_117_ = 128 * i_117_ - -64;
                        Class1_Sub1 class1_sub1
                                = (new Class1_Sub1
                                (i_119_, GameSocket.anInt1149, i_114_, i_115_,
                                        (Class1_Sub6_Sub2.method163(i_114_,
                                                GameSocket.anInt1149,
                                                i_115_, false)
                                                + -i_120_),
                                        i_122_ + Class68_Sub3.anInt2812,
                                        Class68_Sub3.anInt2812 + i_123_, i_124_,
                                        i_125_, i_118_, i_121_));
                        i_116_ = i_116_ * 128 - -64;
                        class1_sub1.method64
                                (i_116_, (byte) -45, i_117_,
                                        (-i_121_
                                                + Class1_Sub6_Sub2.method163(i_116_,
                                                GameSocket.anInt1149,
                                                i_117_, false)),
                                        i_122_ - -Class68_Sub3.anInt2812);
                        Class45.aClass16_886.method286
                                (new Class68_Sub20_Sub4(class1_sub1), true);
                    }
                } else if (Class49.anInt962 == 75) {
                    int i_126_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
                    int i_127_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedWord(i ^ ~0x50cf66c8);
                    int i_128_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedWord(1355769544);
                    int i_129_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
                    int i_130_ = (i_129_ & 0x7) + Class68_Sub28_Sub1.anInt4491;
                    int i_131_
                            = Class93.anInt1668 + (0x7 & i_129_ >> 1825986180);
                    if (i_131_ >= 0 && i_130_ >= 0
                            && (i_131_ ^ 0xffffffff) > -105
                            && (i_130_ ^ 0xffffffff) > -105
                            && ((Class68_Sub10.anInt2911 ^ 0xffffffff)
                            != (i_126_ ^ 0xffffffff))) {
                        Class1_Sub2 class1_sub2 = new Class1_Sub2();
                        class1_sub2.anInt2431 = i_127_;
                        class1_sub2.anInt2436 = i_128_;
                        if ((Class45.aClass16ArrayArrayArray926
                                [GameSocket.anInt1149][i_131_][i_130_])
                                == null)
                            Class45.aClass16ArrayArrayArray926
                                    [GameSocket.anInt1149][i_131_][i_130_]
                                    = new Class16();
                        Class45.aClass16ArrayArrayArray926
                                [GameSocket.anInt1149][i_131_][i_130_].method286
                                (new Class68_Sub20_Sub18(class1_sub2), true);
                        Class68_Sub20_Sub9.method1100(i_131_, (byte) -52,
                                i_130_);
                    }
                } else if (Class49.anInt962 == 25) {
                    int i_132_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
                    int i_133_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
                    int i_134_ = (0x7 & i_133_ >> 2071123620) + Class93.anInt1668;
                    int i_135_ = Class68_Sub28_Sub1.anInt4491 + (i_133_ & 0x7);
                    int i_136_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
                    if ((i_134_ ^ 0xffffffff) <= -1 && (i_135_ ^ 0xffffffff) <= -1 && i_134_ < 104 && (i_135_ ^ 0xffffffff) > -105) {
                        Class1_Sub2 class1_sub2 = new Class1_Sub2();
                        class1_sub2.anInt2431 = i_136_;
                        class1_sub2.anInt2436 = i_132_;
                        if ((Class45.aClass16ArrayArrayArray926[GameSocket.anInt1149][i_134_][i_135_]) == null)
                            Class45.aClass16ArrayArrayArray926[GameSocket.anInt1149][i_134_][i_135_] = new Class16();
                        Class45.aClass16ArrayArrayArray926[GameSocket.anInt1149][i_134_][i_135_].method286(new Class68_Sub20_Sub18(class1_sub2), true);
                        Class68_Sub20_Sub9.method1100(i_134_, (byte) -52, i_135_);
                    }
                } else if ((Class49.anInt962 ^ 0xffffffff) == -51) {
                    int i_137_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedByte(-6677);
                    int i_138_ = Class68_Sub28_Sub1.anInt4491 + (i_137_ & 0x7);
                    int i_139_
                            = (i_137_ >> -1733180188 & 0x7) + Class93.anInt1668;
                    int i_140_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedWord(i ^ ~0x50cf66c8);
                    int i_141_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedWord(1355769544);
                    int i_142_ = Class68_Sub13_Sub8
                            .inStream
                            .readUnsignedWord(1355769544);
                    if ((i_139_ ^ 0xffffffff) <= -1
                            && (i_138_ ^ 0xffffffff) <= -1
                            && (i_139_ ^ 0xffffffff) > -105 && i_138_ < 104) {
                        Class16 class16
                                = (Class45.aClass16ArrayArrayArray926
                                [GameSocket.anInt1149][i_139_][i_138_]);
                        if (class16 != null) {
                            for (Class68_Sub20_Sub18 class68_sub20_sub18
                                         = ((Class68_Sub20_Sub18)
                                    class16.method293((byte) 76));
                                 class68_sub20_sub18 != null;
                                 class68_sub20_sub18
                                         = ((Class68_Sub20_Sub18)
                                         class16.method290((byte) 34))) {
                                Class1_Sub2 class1_sub2
                                        = class68_sub20_sub18.aClass1_Sub2_4445;
                                if (((class1_sub2.anInt2431 ^ 0xffffffff)
                                        == (0x7fff & i_140_ ^ 0xffffffff))
                                        && class1_sub2.anInt2436 == i_141_) {
                                    class1_sub2.anInt2436 = i_142_;
                                    break;
                                }
                            }
                            Class68_Sub20_Sub9.method1100(i_139_, (byte) -52,
                                    i_138_);
                        }
                    }
                }
            }
        }
    }

    public static int method790(int i) {
        anInt3730++;
        if (i != 7)
            anInt3734 = -13;
        return Class33.anInt590;
    }

    public static Class92_Sub1 method791(Class21renamed class21, byte i, int i_143_,
                                         int i_144_) {
        anInt3735++;
        if (i != 66)
            return null;
        if (!Class68_Sub13_Sub36.method880(-29381, i_143_, class21, i_144_))
            return null;
        return GroundData.method460(i ^ 0x25fc);
    }

    static {
        aRSString_3731 = aRSString_3727;
        anInt3737 = 0;
    }
}
