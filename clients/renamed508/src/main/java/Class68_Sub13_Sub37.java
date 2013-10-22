/* Class68_Sub13_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class68_Sub13_Sub37 extends Class68_Sub13
{
    static int anInt4052;
    private short[] aShortArray4053;
    private boolean aBoolean4054;
    static int anInt4055;
    static int anInt4056;
    static int anInt4057;
    static int[] anIntArray4058;
    private int anInt4059;
    private int anInt4060 = 1638;
    static int anInt4061;
    private byte[] aByteArray4062;
    static MutableString aClass100_4063 = Class112.makeMutableString(43, "leuchten2:");
    static int anInt4064;
    static int anInt4065;
    static MRUNodes aClass98_4066;
    private short[] aShortArray4067;
    static int[] anIntArray4068 = new int[4096];
    static int cameraPositionY_local;
    static int anInt4070;
    static int anInt4071;
    private int anInt4072;
    private int anInt4073;
    static MutableString aClass100_4074;
    static int anInt4075;
    static int anInt4076;
    static int[] menuActionCommands3;
    private int anInt4078;
    static int anInt4079;

    public Class68_Sub13_Sub37()
    {
        super(0, true);
        anInt4059 = 4;
        aBoolean4054 = true;
        anInt4072 = 4;
        anInt4073 = 4;
        aByteArray4062 = new byte[512];
        anInt4078 = 0;
    }

    final void method700(Stream class68_sub14, int i, int i_0_)
    {
        do
        {
            try
            {
                anInt4061++;
                int i_1_ = i;
                while_179_: do
                {
                    while_178_: do
                    {
                        while_177_: do
                        {
                            while_176_: do
                            {
                                while_175_: do
                                {
                                    do
                                    {
                                        if (i_1_ != 0)
                                        {
                                            if (i_1_ != 1)
                                            {
                                                if (i_1_ != 2)
                                                {
                                                    if (i_1_ != 3)
                                                    {
                                                        if (i_1_ != 4)
                                                        {
                                                            if (i_1_ != 5)
                                                            {
                                                                if (i_1_ == 6)
                                                                    break while_178_;
                                                                break while_179_;
                                                            }
                                                        } else
                                                            break while_176_;
                                                        break while_177_;
                                                    }
                                                } else
                                                    break;
                                                break while_175_;
                                            }
                                        } else
                                        {
                                            aBoolean4054 = class68_sub14.readUByte() == 1;
                                            break while_179_;
                                        }
                                        anInt4059 = class68_sub14.readUByte();
                                        break while_179_;
                                    } while (false);
                                    anInt4060 = class68_sub14.readShort();
                                    if (anInt4060 < 0)
                                    {
                                        aShortArray4053 = new short[anInt4059];
                                        for (i_1_ = 0; i_1_ < anInt4059; i_1_++)
                                            aShortArray4053[i_1_] = (short) (class68_sub14.readShort());
                                    }
                                    break while_179_;
                                } while (false);
                                anInt4073 = anInt4072 = class68_sub14.readUByte();
                                break while_179_;
                            } while (false);
                            anInt4078 = class68_sub14.readUByte();
                            break while_179_;
                        } while (false);
                        anInt4073 = class68_sub14.readUByte();
                        break while_179_;
                    } while (false);
                    anInt4072 = class68_sub14.readUByte();
                } while (false);
                if (i_0_ == -1)
                    break;
                method889(-85, -47);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("vh.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
            }
            break;
        } while (false);
    }

    private final void method888(int[] is, int i, int i_2_)
    {
        try
        {
            anInt4076++;
            int i_3_ = anInt4072 * Class13_Sub3.anIntArray2674[i_2_];
            if (i == 0)
            {
                if (anInt4059 == 1)
                {
                    int i_4_ = aShortArray4053[0];
                    int i_5_ = aShortArray4067[0] << 12;
                    int i_6_ = i_5_ * anInt4073 >> 12;
                    int i_7_ = anInt4072 * i_5_ >> 12;
                    int i_8_ = i_3_ * i_5_ >> 12;
                    int i_9_ = i_8_ >> 12;
                    int i_10_ = i_9_ + 1;
                    i_8_ &= 0xfff;
                    if (i_10_ >= i_7_)
                        i_10_ = 0;
                    int i_11_ = 0xff & aByteArray4062[0xff & i_9_];
                    int i_12_ = 0xff & aByteArray4062[0xff & i_10_];
                    int i_13_ = Class68_Sub13_Sub36.anIntArray4041[i_8_];
                    if (aBoolean4054)
                    {
                        for (int i_14_ = 0; Class68_Sub13_Sub19.anInt3748 > i_14_; i_14_++)
                        {
                            int i_15_ = (anInt4073 * Class68_Sub13_Sub3.anIntArray3481[i_14_]);
                            int i_16_ = method892(i_8_, i_11_, (byte) 91, i_13_, i_15_ * i_5_ >> 12, i_6_, i_12_);
                            i_16_ = i_16_ * i_4_ >> 12;
                            is[i_14_] = (i_16_ >> 1) + 2048;
                        }
                    } else
                    {
                        for (int i_17_ = 0; Class68_Sub13_Sub19.anInt3748 > i_17_; i_17_++)
                        {
                            int i_18_ = (anInt4073 * Class68_Sub13_Sub3.anIntArray3481[i_17_]);
                            int i_19_ = method892(i_8_, i_11_, (byte) 44, i_13_, i_18_ * i_5_ >> 12, i_6_, i_12_);
                            is[i_17_] = i_4_ * i_19_ >> 12;
                        }
                    }
                } else
                {
                    int i_20_ = aShortArray4053[0];
                    if (i_20_ > 8 || i_20_ < -8)
                    {
                        int i_21_ = aShortArray4067[0] << 12;
                        int i_22_ = i_21_ * i_3_ >> 12;
                        int i_23_ = anInt4073 * i_21_ >> 12;
                        int i_24_ = i_22_ >> 12;
                        int i_25_ = i_24_ + 1;
                        int i_26_ = aByteArray4062[0xff & i_24_] & 0xff;
                        int i_27_ = anInt4072 * i_21_ >> 12;
                        i_22_ &= 0xfff;
                        int i_28_ = Class68_Sub13_Sub36.anIntArray4041[i_22_];
                        if (i_25_ >= i_27_)
                            i_25_ = 0;
                        int i_29_ = 0xff & aByteArray4062[i_25_ & 0xff];
                        for (int i_30_ = 0; Class68_Sub13_Sub19.anInt3748 > i_30_; i_30_++)
                        {
                            int i_31_ = (Class68_Sub13_Sub3.anIntArray3481[i_30_] * anInt4073);
                            int i_32_ = method892(i_22_, i_26_, (byte) -127, i_28_, i_21_ * i_31_ >> 12, i_23_, i_29_);
                            is[i_30_] = i_20_ * i_32_ >> 12;
                        }
                    }
                    for (int i_33_ = 1; anInt4059 > i_33_; i_33_++)
                    {
                        i_20_ = aShortArray4053[i_33_];
                        if (i_20_ > 8 || i_20_ < -8)
                        {
                            int i_34_ = aShortArray4067[i_33_] << 12;
                            int i_35_ = anInt4073 * i_34_ >> 12;
                            int i_36_ = i_34_ * i_3_ >> 12;
                            int i_37_ = anInt4072 * i_34_ >> 12;
                            int i_38_ = i_36_ >> 12;
                            int i_39_ = aByteArray4062[0xff & i_38_] & 0xff;
                            int i_40_ = i_38_ + 1;
                            if (i_37_ <= i_40_)
                                i_40_ = 0;
                            int i_41_ = 0xff & aByteArray4062[0xff & i_40_];
                            i_36_ &= 0xfff;
                            int i_42_ = Class68_Sub13_Sub36.anIntArray4041[i_36_];
                            if (aBoolean4054 && i_33_ == anInt4059 - 1)
                            {
                                for (int i_43_ = 0; Class68_Sub13_Sub19.anInt3748 > i_43_; i_43_++)
                                {
                                    int i_44_ = anInt4073 * (Class68_Sub13_Sub3.anIntArray3481[i_43_]);
                                    int i_45_ = method892(i_36_, i_39_, (byte) 36, i_42_, i_34_ * i_44_ >> 12, i_35_, i_41_);
                                    i_45_ = (i_45_ * i_20_ >> 12) + is[i_43_];
                                    is[i_43_] = (i_45_ >> 1) + 2048;
                                }
                            } else
                            {
                                for (int i_46_ = 0; i_46_ < Class68_Sub13_Sub19.anInt3748; i_46_++)
                                {
                                    int i_47_ = ((Class68_Sub13_Sub3.anIntArray3481[i_46_]) * anInt4073);
                                    int i_48_ = method892(i_36_, i_39_, (byte) 86, i_42_, i_34_ * i_47_ >> 12, i_35_, i_41_);
                                    is[i_46_] += i_48_ * i_20_ >> 12;
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("vh.H(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ')'));
        }
    }

    static final MutableString method889(int i, int i_49_)
    {
        anInt4056++;
        MutableString class100 = Class68_Sub13_Sub24.method816(i, 0);
        for (int i_50_ = class100.getLength() - 3; i_50_ > 0; i_50_ -= 3)
            class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { class100.method1613(0, (byte) -74, i_50_), Class106.aClass100_1802, class100.method1621(i_50_, true) }));
        if (i_49_ != -5344)
            anIntArray4058 = null;
        if (class100.getLength() > 9)
            return (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub20_Sub16.aClass100_4416, class100.method1613(0, (byte) -74, (class100.getLength() - 8)), Class18.aClass100_309, Class68_Sub19.aClass100_3068, class100, Object5.aClass100_1244 })));
        if (class100.getLength() > 6)
            return (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { GameException.aClass100_2242, class100.method1613(0, (byte) -74, (class100.getLength() - 4)), Class68_Sub13_Sub11.aClass100_3629, Class68_Sub19.aClass100_3068, class100, Object5.aClass100_1244 })));
        return (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class68_Sub3.aClass100_2806, class100, MutableString.aClass100_2307 }));
    }

    public static void method890(byte i)
    {
        anIntArray4068 = null;
        if (i > -24)
            method893(5, -30, -77, -55, -30, 100);
        aClass100_4063 = null;
        menuActionCommands3 = null;
        aClass98_4066 = null;
        anIntArray4058 = null;
        aClass100_4074 = null;
    }

    final void method690(byte i)
    {
        aByteArray4062 = method894((byte) 14, anInt4078);
        if (i >= -22)
            anInt4064 = 85;
        method891((byte) 125);
        for (int i_51_ = anInt4059 - 1; i_51_ >= 1; i_51_--)
        {
            short i_52_ = aShortArray4053[i_51_];
            if (i_52_ > 8 || i_52_ < -8)
                break;
            anInt4059--;
        }
        anInt4065++;
    }

    final int[] method698(byte i, int i_53_)
    {
        anInt4052++;
        if (i != -61)
            method888(null, -11, -125);
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_53_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
            method888(is, 0, i_53_);
        return is;
    }

    private final void method891(byte i)
    {
        anInt4070++;
        if (anInt4060 <= 0)
        {
            if (aShortArray4053 != null && aShortArray4053.length == anInt4059)
            {
                aShortArray4067 = new short[anInt4059];
                for (int i_54_ = 0; i_54_ < anInt4059; i_54_++)
                    aShortArray4067[i_54_] = (short) (int) Math.pow(2.0, (double) i_54_);
            }
        } else
        {
            aShortArray4067 = new short[anInt4059];
            aShortArray4053 = new short[anInt4059];
            for (int i_55_ = 0; anInt4059 > i_55_; i_55_++)
            {
                aShortArray4053[i_55_] = (short) (int) (Math.pow((double) ((float) anInt4060 / 4096.0F), (double) i_55_) * 4096.0);
                aShortArray4067[i_55_] = (short) (int) Math.pow(2.0, (double) i_55_);
            }
        }
        if (i <= 112)
            method700(null, -67, -50);
    }

    private final int method892(int i, int i_56_, byte i_57_, int i_58_, int i_59_, int i_60_, int i_61_)
    {
        anInt4057++;
        int i_62_ = i - 4096;
        int i_63_ = i_59_ >> 12;
        int i_64_ = i_63_ + 1;
        if (i_60_ <= i_64_)
            i_64_ = 0;
        i_59_ &= 0xfff;
        int i_65_ = i_59_ - 4096;
        i_63_ &= 0xff;
        int i_66_ = aByteArray4062[i_63_ + i_56_] & 0x3;
        int i_67_ = Class68_Sub13_Sub36.anIntArray4041[i_59_];
        i_64_ &= 0xff;
        int i_68_;
        if (i_66_ <= 1)
            i_68_ = i_66_ != 0 ? i - i_59_ : i_59_ + i;
        else
            i_68_ = i_66_ != 2 ? -i - i_59_ : i_59_ - i;
        i_66_ = 0x3 & aByteArray4062[i_64_ + i_56_];
        int i_69_;
        if (i_66_ > 1)
            i_69_ = i_66_ != 2 ? -i - i_65_ : i_65_ - i;
        else
            i_69_ = i_66_ == 0 ? i_65_ + i : i - i_65_;
        int i_70_ = i_68_ + ((i_69_ - i_68_) * i_67_ >> 12);
        i_66_ = 0x3 & aByteArray4062[i_61_ + i_63_];
        int i_71_ = 20 / ((-38 - i_57_) / 35);
        if (i_66_ <= 1)
            i_68_ = i_66_ != 0 ? i_62_ - i_59_ : i_59_ + i_62_;
        else
            i_68_ = i_66_ != 2 ? -i_59_ - i_62_ : i_59_ - i_62_;
        i_66_ = aByteArray4062[i_64_ + i_61_] & 0x3;
        if (i_66_ <= 1)
            i_69_ = i_66_ == 0 ? i_62_ + i_65_ : i_62_ - i_65_;
        else
            i_69_ = i_66_ == 2 ? i_65_ - i_62_ : -i_65_ - i_62_;
        int i_72_ = ((i_69_ - i_68_) * i_67_ >> 12) + i_68_;
        return (i_58_ * (i_72_ - i_70_) >> 12) + i_70_;
    }

    static final void method893(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_)
    {
        anInt4055++;
        if (i_73_ > -51)
            anInt4079 = 102;
        for (int i_78_ = i_76_; i + i_76_ >= i_78_; i_78_++)
        {
            for (int i_79_ = i_77_; i_79_ <= i_74_ + i_77_; i_79_++)
            {
                if (i_79_ >= 0 && i_79_ < 104 && i_78_ >= 0 && i_78_ < 104)
                    GroundData.aByteArrayArrayArray676[i_75_][i_79_][i_78_] = (byte) 127;
            }
        }
        for (int i_80_ = i_76_; i_80_ < i_76_ + i; i_80_++)
        {
            for (int i_81_ = i_77_; i_74_ + i_77_ > i_81_; i_81_++)
            {
                if (i_81_ >= 0 && i_81_ < 104 && i_80_ >= 0 && i_80_ < 104)
                    Class68_Sub20_Sub12.intGroundArray[i_75_][i_81_][i_80_] = i_75_ > 0 ? (Class68_Sub20_Sub12.intGroundArray[i_75_ - 1][i_81_][i_80_]) : 0;
            }
        }
        if (i_77_ > 0 && i_77_ < 104)
        {
            for (int i_82_ = i_76_ + 1; i_82_ < i + i_76_; i_82_++)
            {
                if (i_82_ >= 0 && i_82_ < 104)
                    Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_82_] = (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_ - 1][i_82_]);
            }
        }
        if (i_76_ > 0 && i_76_ < 104)
        {
            for (int i_83_ = i_77_ + 1; i_74_ + i_77_ > i_83_; i_83_++)
            {
                if (i_83_ >= 0 && i_83_ < 104)
                    Class68_Sub20_Sub12.intGroundArray[i_75_][i_83_][i_76_] = (Class68_Sub20_Sub12.intGroundArray[i_75_][i_83_][i_76_ - 1]);
            }
        }
        do
        {
            if (i_77_ >= 0 && i_76_ >= 0 && i_77_ < 104 && i_76_ < 104)
            {
                if (i_75_ == 0)
                {
                    if (i_77_ <= 0 || (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_ - 1][i_76_]) == 0)
                    {
                        if (i_76_ <= 0 || (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_ - 1]) == 0)
                        {
                            if (i_77_ > 0 && i_76_ > 0 && (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_ - 1][i_76_ - 1]) != 0)
                                Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_] = (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_ - 1][i_76_ - 1]);
                        } else
                            Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_] = (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_ - 1]);
                    } else
                        Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_] = (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_ - 1][i_76_]);
                } else if (i_77_ <= 0 || ((Class68_Sub20_Sub12.intGroundArray[i_75_ - 1][i_77_ - 1][i_76_]) == (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_ - 1][i_76_])))
                {
                    if (i_76_ > 0 && ((Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_ - 1]) != (Class68_Sub20_Sub12.intGroundArray[i_75_ - 1][i_77_][i_76_ - 1])))
                        Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_] = (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_ - 1]);
                    else
                    {
                        if (i_77_ > 0 && i_76_ > 0 && ((Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_ - 1][i_76_ - 1]) != (Class68_Sub20_Sub12.intGroundArray[i_75_ - 1][i_77_ - 1][i_76_ - 1])))
                            Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_] = (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_ - 1][i_76_ - 1]);
                        break;
                    }
                } else
                    Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_][i_76_] = (Class68_Sub20_Sub12.intGroundArray[i_75_][i_77_ - 1][i_76_]);
                break;
            }
        } while (false);
    }

    static final byte[] method894(byte i, int i_84_)
    {
        anInt4071++;
        if (i != 14)
            anInt4064 = -127;
        Class68_Sub20_Sub19 class68_sub20_sub19 = ((Class68_Sub20_Sub19) Login.aClass82_1500.method1479((long) i_84_, (byte) -76));
        if (class68_sub20_sub19 == null)
        {
            byte[] is = new byte[512];
            Random random = new Random((long) i_84_);
            for (int i_85_ = 0; i_85_ < 255; i_85_++)
                is[i_85_] = (byte) i_85_;
            for (int i_86_ = 0; i_86_ < 255; i_86_++)
            {
                int i_87_ = 255 - i_86_;
                int i_88_ = Class68_Sub20_Sub10.method1114(i_87_, (byte) 70, random);
                byte i_89_ = is[i_88_];
                is[i_88_] = is[i_87_];
                is[i_87_] = is[511 - i_86_] = i_89_;
            }
            class68_sub20_sub19 = new Class68_Sub20_Sub19(is);
            Login.aClass82_1500.method1471((long) i_84_, (byte) 112, class68_sub20_sub19);
        }
        return ((Class68_Sub20_Sub19) class68_sub20_sub19).aByteArray4456;
    }

    static
    {
        anIntArray4058 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };
        anInt4064 = 0;
        aClass98_4066 = new MRUNodes(50);
        aClass100_4074 = Class112.makeMutableString(43, "::rebuild");
        menuActionCommands3 = new int[500];
        anInt4075 = -1;
        anInt4079 = 0;
    }
}
