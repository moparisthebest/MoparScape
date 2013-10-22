/* Class68_Sub13_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

public class Class68_Sub13_Sub37 extends Class68_Sub13 {
    public static int anInt4050;
    public short[] aShortArray4051;
    public boolean aBoolean4052;
    public static int anInt4053;
    public static int anInt4054;
    public static int anInt4055;
    public static int[] anIntArray4056;
    public int anInt4057;
    public int anInt4058 = 1638;
    public static int anInt4059;
    public byte[] aByteArray4060;
    public static RSString aRSString_4061
            = RSString.newRsString("leuchten2:");
    public static int anInt4062;
    public static int anInt4063;
    public static Class98 aClass98_4064;
    public short[] aShortArray4065;
    public static int[] anIntArray4066 = new int[4096];
    public static int anInt4067;
    public static int anInt4068;
    public static int anInt4069;
    public int anInt4070;
    public int anInt4071;
    public static RSString aRSString_4072;
    public static int anInt4073;
    public static int anInt4074;
    public static int[] anIntArray4075;
    public int anInt4076;
    public static int anInt4077;

    public Class68_Sub13_Sub37() {
        super(0, true);
        anInt4057 = 4;
        aBoolean4052 = true;
        anInt4070 = 4;
        anInt4071 = 4;
        aByteArray4060 = new byte[512];
        anInt4076 = 0;
    }

    public void method700(Stream class68_sub14, int i, int i_0_) {
        anInt4059++;
        int i_1_ = i;
        while_173_:
        do {
            while_172_:
            do {
                while_171_:
                do {
                    while_170_:
                    do {
                        while_169_:
                        do {
                            do {
                                if ((i_1_ ^ 0xffffffff) != -1) {
                                    if ((i_1_ ^ 0xffffffff) != -2) {
                                        if (i_1_ != 2) {
                                            if (i_1_ != 3) {
                                                if ((i_1_ ^ 0xffffffff)
                                                        != -5) {
                                                    if (i_1_ != 5) {
                                                        if ((i_1_ ^ 0xffffffff)
                                                                == -7)
                                                            break while_172_;
                                                        break while_173_;
                                                    }
                                                } else
                                                    break while_170_;
                                                break while_171_;
                                            }
                                        } else
                                            break;
                                        break while_169_;
                                    }
                                } else {
                                    aBoolean4052
                                            = (class68_sub14.readUnsignedByte(-6677)
                                            ^ 0xffffffff) == -2;
                                    break while_173_;
                                }
                                anInt4057
                                        = class68_sub14.readUnsignedByte(i_0_ ^ 0x1a14);
                                break while_173_;
                            } while (false);
                            anInt4058 = class68_sub14.method957(i_0_ ^ 0x57d8);
                            if ((anInt4058 ^ 0xffffffff) > -1) {
                                aShortArray4051 = new short[anInt4057];
                                for (i_1_ = 0; i_1_ < anInt4057; i_1_++)
                                    aShortArray4051[i_1_]
                                            = (short) (class68_sub14.method957
                                            (i_0_ + -22488));
                            }
                            break while_173_;
                        } while (false);
                        anInt4071 = anInt4070 = class68_sub14.readUnsignedByte(-6677);
                        break while_173_;
                    } while (false);
                    anInt4076 = class68_sub14.readUnsignedByte(-6677);
                    break while_173_;
                } while (false);
                anInt4071 = class68_sub14.readUnsignedByte(i_0_ ^ 0x1a14);
                break while_173_;
            } while (false);
            anInt4070 = class68_sub14.readUnsignedByte(-6677);
        } while (false);
        if (i_0_ != -1)
            method889(-85, -47);
    }

    public void method888(int[] is, int i, int i_2_) {
        anInt4074++;
        int i_3_ = anInt4070 * Class13_Sub3.anIntArray2672[i_2_];
        if (i == 0) {
            if (anInt4057 == 1) {
                int i_4_ = aShortArray4051[0];
                int i_5_ = aShortArray4065[0] << -396608308;
                int i_6_ = i_5_ * anInt4071 >> 617569580;
                int i_7_ = anInt4070 * i_5_ >> -792114740;
                int i_8_ = i_3_ * i_5_ >> 1937691244;
                int i_9_ = i_8_ >> 318363340;
                int i_10_ = i_9_ - -1;
                i_8_ &= 0xfff;
                if (i_10_ >= i_7_)
                    i_10_ = 0;
                int i_11_ = 0xff & aByteArray4060[0xff & i_9_];
                int i_12_ = 0xff & aByteArray4060[0xff & i_10_];
                int i_13_ = Class68_Sub13_Sub36.anIntArray4039[i_8_];
                if (aBoolean4052) {
                    for (int i_14_ = 0; Class68_Sub13_Sub19.anInt3746 > i_14_;
                         i_14_++) {
                        int i_15_
                                = (anInt4071
                                * Class68_Sub13_Sub3.anIntArray3479[i_14_]);
                        int i_16_ = method892(i_8_, i_11_, (byte) 91, i_13_,
                                i_15_ * i_5_ >> -520975284, i_6_,
                                i_12_);
                        i_16_ = i_16_ * i_4_ >> -1547488404;
                        is[i_14_] = (i_16_ >> 446084129) + 2048;
                    }
                } else {
                    for (int i_17_ = 0;
                         ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                                 < (i_17_ ^ 0xffffffff));
                         i_17_++) {
                        int i_18_
                                = (anInt4071
                                * Class68_Sub13_Sub3.anIntArray3479[i_17_]);
                        int i_19_ = method892(i_8_, i_11_, (byte) 44, i_13_,
                                i_18_ * i_5_ >> 1441094124, i_6_,
                                i_12_);
                        is[i_17_] = i_4_ * i_19_ >> 1619524844;
                    }
                }
            } else {
                int i_20_ = aShortArray4051[0];
                if (i_20_ > 8 || i_20_ < -8) {
                    int i_21_ = aShortArray4065[0] << -2113891540;
                    int i_22_ = i_21_ * i_3_ >> 1585559308;
                    int i_23_ = anInt4071 * i_21_ >> 647946124;
                    int i_24_ = i_22_ >> 991848108;
                    int i_25_ = 1 + i_24_;
                    int i_26_ = aByteArray4060[0xff & i_24_] & 0xff;
                    int i_27_ = anInt4070 * i_21_ >> -1069679572;
                    i_22_ &= 0xfff;
                    int i_28_ = Class68_Sub13_Sub36.anIntArray4039[i_22_];
                    if ((i_25_ ^ 0xffffffff) <= (i_27_ ^ 0xffffffff))
                        i_25_ = 0;
                    int i_29_ = 0xff & aByteArray4060[i_25_ & 0xff];
                    for (int i_30_ = 0; Class68_Sub13_Sub19.anInt3746 > i_30_;
                         i_30_++) {
                        int i_31_ = (Class68_Sub13_Sub3.anIntArray3479[i_30_]
                                * anInt4071);
                        int i_32_ = method892(i_22_, i_26_, (byte) -127, i_28_,
                                i_21_ * i_31_ >> -137120404,
                                i_23_, i_29_);
                        is[i_30_] = i_20_ * i_32_ >> -622495284;
                    }
                }
                for (int i_33_ = 1; anInt4057 > i_33_; i_33_++) {
                    i_20_ = aShortArray4051[i_33_];
                    if (i_20_ > 8 || i_20_ < -8) {
                        int i_34_ = aShortArray4065[i_33_] << 1603830348;
                        int i_35_ = anInt4071 * i_34_ >> -4411572;
                        int i_36_ = i_34_ * i_3_ >> 1335296716;
                        int i_37_ = anInt4070 * i_34_ >> 212904108;
                        int i_38_ = i_36_ >> -1045922644;
                        int i_39_ = aByteArray4060[0xff & i_38_] & 0xff;
                        int i_40_ = i_38_ + 1;
                        if ((i_37_ ^ 0xffffffff) >= (i_40_ ^ 0xffffffff))
                            i_40_ = 0;
                        int i_41_ = 0xff & aByteArray4060[0xff & i_40_];
                        i_36_ &= 0xfff;
                        int i_42_ = Class68_Sub13_Sub36.anIntArray4039[i_36_];
                        if (aBoolean4052
                                && (i_33_ ^ 0xffffffff) == (anInt4057 - 1
                                ^ 0xffffffff)) {
                            for (int i_43_ = 0;
                                 Class68_Sub13_Sub19.anInt3746 > i_43_;
                                 i_43_++) {
                                int i_44_
                                        = anInt4071 * (Class68_Sub13_Sub3
                                        .anIntArray3479[i_43_]);
                                int i_45_
                                        = method892(i_36_, i_39_, (byte) 36, i_42_,
                                        i_34_ * i_44_ >> 253365324,
                                        i_35_, i_41_);
                                i_45_ = ((i_45_ * i_20_ >> -1744754772)
                                        + is[i_43_]);
                                is[i_43_] = 2048 + (i_45_ >> 1115323041);
                            }
                        } else {
                            for (int i_46_ = 0;
                                 i_46_ < Class68_Sub13_Sub19.anInt3746;
                                 i_46_++) {
                                int i_47_
                                        = (Class68_Sub13_Sub3.anIntArray3479[i_46_]
                                        * anInt4071);
                                int i_48_
                                        = method892(i_36_, i_39_, (byte) 86, i_42_,
                                        i_34_ * i_47_ >> -1921482356,
                                        i_35_, i_41_);
                                is[i_46_] += i_48_ * i_20_ >> -2042177012;
                            }
                        }
                    }
                }
            }
        }
    }

    public static RSString method889(int i, int i_49_) {
        anInt4054++;
        RSString class100 = Class68_Sub13_Sub24.method816(i, 0);
        for (int i_50_ = class100.method1590((byte) -103) - 3; i_50_ > 0;
             i_50_ -= 3)
            class100
                    = (Class68_Sub20_Sub13_Sub2.method1166
                    (2,
                            new RSString[]{class100.method1607(0, (byte) -74, i_50_),
                                    Class106.aRSString_1800,
                                    class100.method1615(i_50_, true)}));
        if (i_49_ != -5344)
            anIntArray4056 = null;
        if ((class100.method1590((byte) -126) ^ 0xffffffff) < -10)
            return (Class68_Sub20_Sub13_Sub2.method1166
                    (2,
                            (new RSString[]
                                    {Class68_Sub20_Sub16.aRSString_4414,
                                            class100.method1607(0, (byte) -74,
                                                    (class100.method1590((byte) -100)
                                                            + -8)),
                                            Class18.aRSString_309, Class68_Sub19.aRSString_3066,
                                            class100, Class69.aRSString_1244})));
        if ((class100.method1590((byte) -97) ^ 0xffffffff) < -7)
            return (Class68_Sub20_Sub13_Sub2.method1166
                    (2, (new RSString[]
                            {GameException.aRSString_2240,
                                    class100.method1607(0, (byte) -74,
                                            (class100.method1590((byte) -99)
                                                    + -4)),
                                    Class68_Sub13_Sub11.aRSString_3627,
                                    Class68_Sub19.aRSString_3066, class100,
                                    Class69.aRSString_1244})));
        return (Class68_Sub20_Sub13_Sub2.method1166
                (2, new RSString[]{Class68_Sub3.aRSString_2804, class100,
                        RSString.aRSString_2305}));
    }

    public static void method890(byte i) {
        anIntArray4066 = null;
        if (i > -24)
            method893(5, -30, -77, -55, -30, 100);
        aRSString_4061 = null;
        anIntArray4075 = null;
        aClass98_4064 = null;
        anIntArray4056 = null;
        aRSString_4072 = null;
    }

    public void method690(byte i) {
        aByteArray4060 = method894((byte) 14, anInt4076);
        if (i >= -22)
            anInt4062 = 85;
        method891((byte) 125);
        for (int i_51_ = -1 + anInt4057; i_51_ >= 1; i_51_--) {
            short i_52_ = aShortArray4051[i_51_];
            if ((i_52_ ^ 0xffffffff) < -9 || i_52_ < -8)
                break;
            anInt4057--;
        }
        anInt4063++;
    }

    public int[] method698(byte i, int i_53_) {
        anInt4050++;
        if (i != -61)
            method888(null, -11, -125);
        int[] is = aClass115_2936.method1697(false, i_53_);
        if (aClass115_2936.aBoolean1957)
            method888(is, 0, i_53_);
        return is;
    }

    public void method891(byte i) {
        anInt4068++;
        if (anInt4058 <= 0) {
            if (aShortArray4051 != null
                    && aShortArray4051.length == anInt4057) {
                aShortArray4065 = new short[anInt4057];
                for (int i_54_ = 0; i_54_ < anInt4057; i_54_++)
                    aShortArray4065[i_54_]
                            = (short) (int) Math.pow(2.0, (double) i_54_);
            }
        } else {
            aShortArray4065 = new short[anInt4057];
            aShortArray4051 = new short[anInt4057];
            for (int i_55_ = 0; anInt4057 > i_55_; i_55_++) {
                aShortArray4051[i_55_]
                        = (short) (int) (Math.pow((double) ((float) anInt4058
                        / 4096.0F),
                        (double) i_55_)
                        * 4096.0);
                aShortArray4065[i_55_]
                        = (short) (int) Math.pow(2.0, (double) i_55_);
            }
        }
        if (i <= 112)
            method700(null, -67, -50);
    }

    public int method892(int i, int i_56_, byte i_57_, int i_58_, int i_59_,
                         int i_60_, int i_61_) {
        anInt4055++;
        int i_62_ = -4096 + i;
        int i_63_ = i_59_ >> 1110007436;
        int i_64_ = i_63_ - -1;
        if (i_60_ <= i_64_)
            i_64_ = 0;
        i_59_ &= 0xfff;
        int i_65_ = -4096 + i_59_;
        i_63_ &= 0xff;
        int i_66_ = aByteArray4060[i_63_ + i_56_] & 0x3;
        int i_67_ = Class68_Sub13_Sub36.anIntArray4039[i_59_];
        i_64_ &= 0xff;
        int i_68_;
        if (i_66_ <= 1)
            i_68_ = i_66_ != 0 ? i - i_59_ : i_59_ + i;
        else
            i_68_ = (i_66_ ^ 0xffffffff) != -3 ? -i + -i_59_ : -i + i_59_;
        i_66_ = 0x3 & aByteArray4060[i_64_ + i_56_];
        int i_69_;
        if ((i_66_ ^ 0xffffffff) < -2)
            i_69_ = i_66_ != 2 ? -i + -i_65_ : -i + i_65_;
        else
            i_69_ = i_66_ == 0 ? i_65_ + i : -i_65_ + i;
        int i_70_ = i_68_ + ((-i_68_ + i_69_) * i_67_ >> 1727990412);
        i_66_ = 0x3 & aByteArray4060[i_61_ + i_63_];
        int i_71_ = 20 / ((-38 - i_57_) / 35);
        if (i_66_ <= 1)
            i_68_ = i_66_ != 0 ? -i_59_ + i_62_ : i_59_ - -i_62_;
        else
            i_68_ = i_66_ != 2 ? -i_59_ + -i_62_ : i_59_ - i_62_;
        i_66_ = aByteArray4060[i_64_ - -i_61_] & 0x3;
        if ((i_66_ ^ 0xffffffff) >= -2)
            i_69_
                    = (i_66_ ^ 0xffffffff) == -1 ? i_62_ + i_65_ : -i_65_ + i_62_;
        else
            i_69_
                    = (i_66_ ^ 0xffffffff) == -3 ? i_65_ - i_62_ : -i_65_ + -i_62_;
        int i_72_ = ((i_69_ + -i_68_) * i_67_ >> -666703540) + i_68_;
        return (i_58_ * (i_72_ - i_70_) >> -1831752948) + i_70_;
    }

    public static void method893(int i, int i_73_, int i_74_, int i_75_,
                                 int i_76_, int i_77_) {
        anInt4053++;
        if (i_73_ > -51)
            anInt4077 = 102;
        for (int i_78_ = i_76_; i + i_76_ >= i_78_; i_78_++) {
            for (int i_79_ = i_77_; i_79_ <= i_74_ + i_77_; i_79_++) {
                if ((i_79_ ^ 0xffffffff) <= -1 && i_79_ < 104
                        && (i_78_ ^ 0xffffffff) <= -1 && i_78_ < 104)
                    GroundData.aByteArrayArrayArray676[i_75_][i_79_][i_78_]
                            = (byte) 127;
            }
        }
        for (int i_80_ = i_76_;
             (i_80_ ^ 0xffffffff) > (i_76_ - -i ^ 0xffffffff); i_80_++) {
            for (int i_81_ = i_77_; i_74_ + i_77_ > i_81_; i_81_++) {
                if ((i_81_ ^ 0xffffffff) <= -1 && (i_81_ ^ 0xffffffff) > -105
                        && i_80_ >= 0 && (i_80_ ^ 0xffffffff) > -105)
                    Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_81_][i_80_]
                            = ((i_75_ ^ 0xffffffff) < -1
                            ? (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                            [i_75_ + -1][i_81_][i_80_])
                            : 0);
            }
        }
        if (i_77_ > 0 && i_77_ < 104) {
            for (int i_82_ = 1 + i_76_;
                 (i_82_ ^ 0xffffffff) > (i + i_76_ ^ 0xffffffff); i_82_++) {
                if ((i_82_ ^ 0xffffffff) <= -1 && i_82_ < 104)
                    Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_77_][i_82_]
                            = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [-1 + i_77_][i_82_]);
            }
        }
        if (i_76_ > 0 && (i_76_ ^ 0xffffffff) > -105) {
            for (int i_83_ = i_77_ + 1; i_74_ + i_77_ > i_83_; i_83_++) {
                if (i_83_ >= 0 && (i_83_ ^ 0xffffffff) > -105)
                    Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_83_][i_76_]
                            = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_83_][-1 + i_76_]);
            }
        }
        if (i_77_ >= 0 && i_76_ >= 0 && i_77_ < 104
                && (i_76_ ^ 0xffffffff) > -105) {
            if ((i_75_ ^ 0xffffffff) == -1) {
                if (i_77_ <= 0 || (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [i_75_][-1 + i_77_][i_76_]) == 0) {
                    if (i_76_ <= 0
                            || (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_77_][i_76_ - 1]) == 0) {
                        if ((i_77_ ^ 0xffffffff) < -1
                                && (i_76_ ^ 0xffffffff) < -1
                                && ((Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                [i_75_][-1 + i_77_][-1 + i_76_])
                                ^ 0xffffffff) != -1)
                            Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                    [i_75_][i_77_][i_76_]
                                    = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                    [i_75_][-1 + i_77_][-1 + i_76_]);
                    } else
                        Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                                [i_77_][i_76_]
                                = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                                [i_75_][i_77_][i_76_ + -1]);
                } else
                    Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_77_][i_76_]
                            = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [-1 + i_77_][i_76_]);
            } else if ((i_77_ ^ 0xffffffff) >= -1
                    || ((Class68_Sub20_Sub12.anIntArrayArrayArray4353
                    [i_75_ - 1][-1 + i_77_][i_76_])
                    == (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                    [i_75_][i_77_ - 1][i_76_]))) {
                if (i_76_ > 0
                        && ((Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                        [i_77_][-1 + i_76_])
                        != (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [-1 + i_75_][i_77_][-1 + i_76_])))
                    Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_77_][i_76_]
                            = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_77_][-1 + i_76_]);
                else if ((i_77_ ^ 0xffffffff) < -1 && i_76_ > 0
                        && ((Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [i_75_][-1 + i_77_][-1 + i_76_])
                        != (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [i_75_ + -1][i_77_ - 1][i_76_ + -1])))
                    Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_77_][i_76_]
                            = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                            [i_77_ - 1][i_76_ + -1]);
            } else
                Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_][i_77_]
                        [i_76_]
                        = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_75_]
                        [-1 + i_77_][i_76_]);
        }
    }

    public static byte[] method894(byte i, int i_84_) {
        anInt4069++;
        if (i != 14)
            anInt4062 = -127;
        Class68_Sub20_Sub19 class68_sub20_sub19
                = ((Class68_Sub20_Sub19)
                Login.aLogin_1498.method1473((long) i_84_, (byte) -76));
        if (class68_sub20_sub19 == null) {
            byte[] is = new byte[512];
            Random random = new Random((long) i_84_);
            for (int i_85_ = 0; (i_85_ ^ 0xffffffff) > -256; i_85_++)
                is[i_85_] = (byte) i_85_;
            for (int i_86_ = 0; (i_86_ ^ 0xffffffff) > -256; i_86_++) {
                int i_87_ = -i_86_ + 255;
                int i_88_
                        = Class68_Sub20_Sub10.method1114(i_87_, (byte) 70, random);
                byte i_89_ = is[i_88_];
                is[i_88_] = is[i_87_];
                is[i_87_] = is[511 + -i_86_] = i_89_;
            }
            class68_sub20_sub19 = new Class68_Sub20_Sub19(is);
            Login.aLogin_1498.method1465((long) i_84_, (byte) 112,
                    class68_sub20_sub19);
        }
        return class68_sub20_sub19.aByteArray4454;
    }

    static {
        anIntArray4056 = new int[]{1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0};
        anInt4062 = 0;
        aClass98_4064 = new Class98(50);
        aRSString_4072 = RSString.newRsString("::rebuild");
        anIntArray4075 = new int[500];
        anInt4073 = -1;
        anInt4077 = 0;
    }
}
