/* Class68_Sub13_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub28 extends Class68_Sub13
{
    static int anInt3919 = 10;
    static int anInt3920;
    static boolean aBoolean3921 = true;
    static int anInt3922 = 0;
    static int anInt3923;
    private int anInt3924 = 6;
    static MRUNodes aClass98_3925;
    static int anInt3926;
    static int anInt3927;
    static int anInt3928;
    static int anInt3929;
    static int anInt3930;
    static int[] anIntArray3931 = { -1, -1, 1, 1 };

    static final void method844(byte i, int i_0_, int i_1_)
    {
        anInt3928++;
        if (i != 106)
            anInt3919 = -11;
        if (Class68_Sub13_Sub25.anInt3857 != 0 && i_1_ != -1)
        {
            Class68_Sub13_Sub38.method899(i_1_, Class21.aClass21_Sub1_472, false, 0, Class68_Sub13_Sub25.anInt3857, false);
            Keyboard.aBoolean2129 = true;
        }
    }

    static final void method845(byte i)
    {
        Class68_Sub13_Sub8.aClass98_3563.method1572((byte) 94);
        if (i == -115)
            anInt3923++;
    }

    final int[] method698(byte i, int i_2_)
    {
        anInt3926++;
        if (i != -61)
            return null;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_2_);
        while_137_: do
        {
            if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
            {
                int[] is_3_ = this.method696(0, i_2_, 29149);
                int[] is_4_ = this.method696(1, i_2_, 29149);
                int i_5_ = anInt3924;
                while_136_: do
                {
                    while_135_: do
                    {
                        while_134_: do
                        {
                            while_133_: do
                            {
                                while_132_: do
                                {
                                    while_131_: do
                                    {
                                        while_130_: do
                                        {
                                            while_129_: do
                                            {
                                                while_128_: do
                                                {
                                                    do
                                                    {
                                                        if (i_5_ != 1)
                                                        {
                                                            if (i_5_ != 2)
                                                            {
                                                                if (i_5_ != 3)
                                                                {
                                                                    if (i_5_ != 4)
                                                                    {
                                                                        if (i_5_ != 5)
                                                                        {
                                                                            if (i_5_ != 6)
                                                                            {
                                                                                if (i_5_ != 7)
                                                                                {
                                                                                    if (i_5_ != 8)
                                                                                    {
                                                                                        if (i_5_ != 9)
                                                                                        {
                                                                                            if (i_5_ != 10)
                                                                                            {
                                                                                                if (i_5_ != 11)
                                                                                                {
                                                                                                    if (i_5_ != 12)
                                                                                                        break while_137_;
                                                                                                } else
                                                                                                    break while_135_;
                                                                                                break while_136_;
                                                                                            }
                                                                                        } else
                                                                                            break while_133_;
                                                                                        break while_134_;
                                                                                    }
                                                                                } else
                                                                                    break while_131_;
                                                                                break while_132_;
                                                                            }
                                                                        } else
                                                                            break while_129_;
                                                                        break while_130_;
                                                                    }
                                                                } else
                                                                    break;
                                                                break while_128_;
                                                            }
                                                        } else
                                                        {
                                                            for (i_5_ = 0; (i_5_ < (Class68_Sub13_Sub19.anInt3748)); i_5_++)
                                                                is[i_5_] = ((is_4_[i_5_]) + (is_3_[i_5_]));
                                                            break while_137_;
                                                        }
                                                        for (i_5_ = 0; (i_5_ < (Class68_Sub13_Sub19.anInt3748)); i_5_++)
                                                            is[i_5_] = (is_3_[i_5_] - (is_4_[i_5_]));
                                                        break while_137_;
                                                    } while (false);
                                                    for (i_5_ = 0; ((Class68_Sub13_Sub19.anInt3748) > i_5_); i_5_++)
                                                        is[i_5_] = ((is_4_[i_5_] * is_3_[i_5_]) >> 12);
                                                    break while_137_;
                                                } while (false);
                                                for (i_5_ = 0; (i_5_ < (Class68_Sub13_Sub19.anInt3748)); i_5_++)
                                                {
                                                    int i_6_ = is_4_[i_5_];
                                                    is[i_5_] = (i_6_ != 0 ? (is_3_[i_5_] << 12) / i_6_ : 4096);
                                                }
                                                break while_137_;
                                            } while (false);
                                            for (i_5_ = 0; (Class68_Sub13_Sub19.anInt3748 > i_5_); i_5_++)
                                                is[i_5_] = (4096 - (((4096 - is_4_[i_5_]) * (4096 - is_3_[i_5_])) >> 12));
                                            break while_137_;
                                        } while (false);
                                        for (i_5_ = 0; (Class68_Sub13_Sub19.anInt3748 > i_5_); i_5_++)
                                        {
                                            int i_7_ = is_4_[i_5_];
                                            is[i_5_] = (i_7_ >= 2048 ? 4096 - (((4096 - is_3_[i_5_]) * (4096 - i_7_)) >> 11) : i_7_ * is_3_[i_5_] >> 11);
                                        }
                                        break while_137_;
                                    } while (false);
                                    for (i_5_ = 0; Class68_Sub13_Sub19.anInt3748 > i_5_; i_5_++)
                                    {
                                        int i_8_ = is_3_[i_5_];
                                        is[i_5_] = (i_8_ != 4096 ? (is_4_[i_5_] << 12) / (4096 - i_8_) : 4096);
                                    }
                                    break while_137_;
                                } while (false);
                                for (i_5_ = 0; Class68_Sub13_Sub19.anInt3748 > i_5_; i_5_++)
                                {
                                    int i_9_ = is_3_[i_5_];
                                    is[i_5_] = (i_9_ == 0 ? 0 : 4096 - (4096 - is_4_[i_5_] << 12) / i_9_);
                                }
                                break while_137_;
                            } while (false);
                            for (i_5_ = 0; Class68_Sub13_Sub19.anInt3748 > i_5_; i_5_++)
                            {
                                int i_10_ = is_3_[i_5_];
                                int i_11_ = is_4_[i_5_];
                                is[i_5_] = i_10_ < i_11_ ? i_10_ : i_11_;
                            }
                            break while_137_;
                        } while (false);
                        for (i_5_ = 0; i_5_ < Class68_Sub13_Sub19.anInt3748; i_5_++)
                        {
                            int i_12_ = is_4_[i_5_];
                            int i_13_ = is_3_[i_5_];
                            is[i_5_] = i_13_ <= i_12_ ? i_12_ : i_13_;
                        }
                        break while_137_;
                    } while (false);
                    for (i_5_ = 0; i_5_ < Class68_Sub13_Sub19.anInt3748; i_5_++)
                    {
                        int i_14_ = is_3_[i_5_];
                        int i_15_ = is_4_[i_5_];
                        is[i_5_] = i_14_ <= i_15_ ? i_15_ - i_14_ : i_14_ - i_15_;
                    }
                    break while_137_;
                } while (false);
                for (i_5_ = 0; Class68_Sub13_Sub19.anInt3748 > i_5_; i_5_++)
                {
                    int i_16_ = is_3_[i_5_];
                    int i_17_ = is_4_[i_5_];
                    is[i_5_] = i_16_ + i_17_ - (i_17_ * i_16_ >> 11);
                }
            }
        } while (false);
        return is;
    }

    static final void method846(int i, int i_18_, int i_19_)
    {
        anInt3920++;
        Class68_Sub20_Sub9 class68_sub20_sub9 = Class68_Sub13_Sub26_Sub1.method835(i_19_, 1, (byte) -127);
        class68_sub20_sub9.method1097(0);
        if (i_18_ < 89)
            method844((byte) -107, -116, -64);
        ((Class68_Sub20_Sub9) class68_sub20_sub9).anInt4295 = i;
    }

    public static void method847(boolean bool)
    {
        anIntArray3931 = null;
        aClass98_3925 = null;
        if (bool != true)
            method846(99, -56, -68);
    }

    public Class68_Sub13_Sub28()
    {
        super(2, false);
    }

    static final Object3 method848(int i, int i_20_, int i_21_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_20_][i_21_];
        if (class68_sub1 == null || ((Ground) class68_sub1).object_3 == null)
            return null;
        return ((Ground) class68_sub1).object_3;
    }

    final int[][] method697(int i, boolean bool)
    {
        anInt3930++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -102);
        while_147_: do
        {
            if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
            {
                int[][] is_22_ = this.method699(-125, 0, i);
                int[][] is_23_ = this.method699(-128, 1, i);
                int[] is_24_ = is[1];
                int[] is_25_ = is[2];
                int[] is_26_ = is[0];
                int[] is_27_ = is_22_[0];
                int[] is_28_ = is_22_[1];
                int[] is_29_ = is_22_[2];
                int[] is_30_ = is_23_[0];
                int[] is_31_ = is_23_[1];
                int[] is_32_ = is_23_[2];
                int i_33_ = anInt3924;
                while_146_: do
                {
                    while_145_: do
                    {
                        while_144_: do
                        {
                            while_143_: do
                            {
                                while_142_: do
                                {
                                    while_141_: do
                                    {
                                        while_140_: do
                                        {
                                            while_139_: do
                                            {
                                                while_138_: do
                                                {
                                                    do
                                                    {
                                                        if (i_33_ != 1)
                                                        {
                                                            if (i_33_ != 2)
                                                            {
                                                                if (i_33_ != 3)
                                                                {
                                                                    if (i_33_ != 4)
                                                                    {
                                                                        if (i_33_ != 5)
                                                                        {
                                                                            if (i_33_ != 6)
                                                                            {
                                                                                if (i_33_ != 7)
                                                                                {
                                                                                    if (i_33_ != 8)
                                                                                    {
                                                                                        if (i_33_ != 9)
                                                                                        {
                                                                                            if (i_33_ != 10)
                                                                                            {
                                                                                                if (i_33_ != 11)
                                                                                                {
                                                                                                    if (i_33_ != 12)
                                                                                                        break while_147_;
                                                                                                } else
                                                                                                    break while_145_;
                                                                                                break while_146_;
                                                                                            }
                                                                                        } else
                                                                                            break while_143_;
                                                                                        break while_144_;
                                                                                    }
                                                                                } else
                                                                                    break while_141_;
                                                                                break while_142_;
                                                                            }
                                                                        } else
                                                                            break while_139_;
                                                                        break while_140_;
                                                                    }
                                                                } else
                                                                    break;
                                                                break while_138_;
                                                            }
                                                        } else
                                                        {
                                                            for (i_33_ = 0; ((Class68_Sub13_Sub19.anInt3748) > i_33_); i_33_++)
                                                            {
                                                                is_26_[i_33_] = ((is_27_[i_33_]) + (is_30_[i_33_]));
                                                                is_24_[i_33_] = ((is_28_[i_33_]) + (is_31_[i_33_]));
                                                                is_25_[i_33_] = ((is_32_[i_33_]) + (is_29_[i_33_]));
                                                            }
                                                            break while_147_;
                                                        }
                                                        for (i_33_ = 0; ((Class68_Sub13_Sub19.anInt3748) > i_33_); i_33_++)
                                                        {
                                                            is_26_[i_33_] = ((is_27_[i_33_]) - (is_30_[i_33_]));
                                                            is_24_[i_33_] = ((is_28_[i_33_]) - (is_31_[i_33_]));
                                                            is_25_[i_33_] = ((is_29_[i_33_]) - (is_32_[i_33_]));
                                                        }
                                                        break while_147_;
                                                    } while (false);
                                                    for (i_33_ = 0; ((Class68_Sub13_Sub19.anInt3748) > i_33_); i_33_++)
                                                    {
                                                        is_26_[i_33_] = ((is_27_[i_33_] * (is_30_[i_33_])) >> 12);
                                                        is_24_[i_33_] = ((is_31_[i_33_] * (is_28_[i_33_])) >> 12);
                                                        is_25_[i_33_] = ((is_29_[i_33_] * (is_32_[i_33_])) >> 12);
                                                    }
                                                    break while_147_;
                                                } while (false);
                                                for (i_33_ = 0; ((Class68_Sub13_Sub19.anInt3748) > i_33_); i_33_++)
                                                {
                                                    int i_34_ = is_31_[i_33_];
                                                    int i_35_ = is_32_[i_33_];
                                                    int i_36_ = is_30_[i_33_];
                                                    is_26_[i_33_] = (i_36_ == 0 ? 4096 : (is_27_[i_33_] << 12) / i_36_);
                                                    is_24_[i_33_] = (i_34_ == 0 ? 4096 : (is_28_[i_33_] << 12) / i_34_);
                                                    is_25_[i_33_] = (i_35_ == 0 ? 4096 : (is_29_[i_33_] << 12) / i_35_);
                                                }
                                                break while_147_;
                                            } while (false);
                                            for (i_33_ = 0; i_33_ < (Class68_Sub13_Sub19.anInt3748); i_33_++)
                                            {
                                                is_26_[i_33_] = (4096 - (((4096 - is_30_[i_33_]) * (4096 - is_27_[i_33_])) >> 12));
                                                is_24_[i_33_] = (4096 - (((4096 - is_31_[i_33_]) * (4096 - is_28_[i_33_])) >> 12));
                                                is_25_[i_33_] = (4096 - (((4096 - is_32_[i_33_]) * (4096 - is_29_[i_33_])) >> 12));
                                            }
                                            break while_147_;
                                        } while (false);
                                        for (i_33_ = 0; (i_33_ < Class68_Sub13_Sub19.anInt3748); i_33_++)
                                        {
                                            int i_37_ = is_30_[i_33_];
                                            int i_38_ = is_32_[i_33_];
                                            int i_39_ = is_31_[i_33_];
                                            is_26_[i_33_] = (i_37_ < 2048 ? (i_37_ * is_27_[i_33_] >> 11) : 4096 - (((4096 - is_27_[i_33_]) * (4096 - i_37_)) >> 11));
                                            is_24_[i_33_] = (i_39_ >= 2048 ? (4096 - (((4096 - i_39_) * (4096 - is_28_[i_33_])) >> 11)) : (is_28_[i_33_] * i_39_ >> 11));
                                            is_25_[i_33_] = (i_38_ < 2048 ? (is_29_[i_33_] * i_38_ >> 11) : (4096 - (((4096 - i_38_) * (4096 - is_29_[i_33_])) >> 11)));
                                        }
                                        break while_147_;
                                    } while (false);
                                    for (i_33_ = 0; i_33_ < Class68_Sub13_Sub19.anInt3748; i_33_++)
                                    {
                                        int i_40_ = is_28_[i_33_];
                                        int i_41_ = is_27_[i_33_];
                                        int i_42_ = is_29_[i_33_];
                                        is_26_[i_33_] = (i_41_ == 4096 ? 4096 : ((is_30_[i_33_] << 12) / (4096 - i_41_)));
                                        is_24_[i_33_] = (i_40_ == 4096 ? 4096 : ((is_31_[i_33_] << 12) / (4096 - i_40_)));
                                        is_25_[i_33_] = (i_42_ == 4096 ? 4096 : ((is_32_[i_33_] << 12) / (4096 - i_42_)));
                                    }
                                    break while_147_;
                                } while (false);
                                for (i_33_ = 0; i_33_ < Class68_Sub13_Sub19.anInt3748; i_33_++)
                                {
                                    int i_43_ = is_29_[i_33_];
                                    int i_44_ = is_28_[i_33_];
                                    int i_45_ = is_27_[i_33_];
                                    is_26_[i_33_] = (i_45_ == 0 ? 0 : 4096 - (4096 - is_30_[i_33_] << 12) / i_45_);
                                    is_24_[i_33_] = (i_44_ == 0 ? 0 : 4096 - (4096 - is_31_[i_33_] << 12) / i_44_);
                                    is_25_[i_33_] = (i_43_ == 0 ? 0 : 4096 - (4096 - is_32_[i_33_] << 12) / i_43_);
                                }
                                break while_147_;
                            } while (false);
                            for (i_33_ = 0; i_33_ < Class68_Sub13_Sub19.anInt3748; i_33_++)
                            {
                                int i_46_ = is_29_[i_33_];
                                int i_47_ = is_31_[i_33_];
                                int i_48_ = is_27_[i_33_];
                                int i_49_ = is_30_[i_33_];
                                int i_50_ = is_32_[i_33_];
                                int i_51_ = is_28_[i_33_];
                                is_26_[i_33_] = i_49_ <= i_48_ ? i_49_ : i_48_;
                                is_24_[i_33_] = i_47_ > i_51_ ? i_51_ : i_47_;
                                is_25_[i_33_] = i_46_ < i_50_ ? i_46_ : i_50_;
                            }
                            break while_147_;
                        } while (false);
                        for (i_33_ = 0; Class68_Sub13_Sub19.anInt3748 > i_33_; i_33_++)
                        {
                            int i_52_ = is_28_[i_33_];
                            int i_53_ = is_27_[i_33_];
                            int i_54_ = is_31_[i_33_];
                            int i_55_ = is_29_[i_33_];
                            int i_56_ = is_32_[i_33_];
                            int i_57_ = is_30_[i_33_];
                            is_26_[i_33_] = i_57_ >= i_53_ ? i_57_ : i_53_;
                            is_24_[i_33_] = i_54_ < i_52_ ? i_52_ : i_54_;
                            is_25_[i_33_] = i_55_ > i_56_ ? i_55_ : i_56_;
                        }
                        break while_147_;
                    } while (false);
                    for (i_33_ = 0; i_33_ < Class68_Sub13_Sub19.anInt3748; i_33_++)
                    {
                        int i_58_ = is_31_[i_33_];
                        int i_59_ = is_28_[i_33_];
                        int i_60_ = is_32_[i_33_];
                        int i_61_ = is_29_[i_33_];
                        int i_62_ = is_30_[i_33_];
                        int i_63_ = is_27_[i_33_];
                        is_26_[i_33_] = i_62_ >= i_63_ ? i_62_ - i_63_ : i_63_ - i_62_;
                        is_24_[i_33_] = i_59_ > i_58_ ? i_59_ - i_58_ : i_58_ - i_59_;
                        is_25_[i_33_] = i_60_ < i_61_ ? i_61_ - i_60_ : i_60_ - i_61_;
                    }
                    break while_147_;
                } while (false);
                for (i_33_ = 0; i_33_ < Class68_Sub13_Sub19.anInt3748; i_33_++)
                {
                    int i_64_ = is_30_[i_33_];
                    int i_65_ = is_27_[i_33_];
                    int i_66_ = is_28_[i_33_];
                    int i_67_ = is_31_[i_33_];
                    int i_68_ = is_29_[i_33_];
                    int i_69_ = is_32_[i_33_];
                    is_26_[i_33_] = i_64_ - (i_64_ * i_65_ >> 11) + i_65_;
                    is_24_[i_33_] = i_67_ + i_66_ - (i_66_ * i_67_ >> 11);
                    is_25_[i_33_] = i_69_ - (i_68_ * i_69_ >> 11) + i_68_;
                }
            }
        } while (false);
        if (bool != true)
            method847(true);
        return is;
    }

    final void method700(Stream class68_sub14, int i, int i_70_)
    {
        try
        {
            int i_71_ = i;
            do
            {
                if (i_71_ != 0)
                {
                    if (i_71_ != 1)
                        break;
                } else
                {
                    anInt3924 = class68_sub14.readUByte();
                    break;
                }
                ((Class68_Sub13) this).aBoolean2933 = class68_sub14.readUByte() == 1;
            } while (false);
            if (i_70_ != -1)
                aClass98_3925 = null;
            anInt3927++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("rg.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_70_ + ')'));
        }
    }

    static
    {
        aClass98_3925 = new MRUNodes(64);
    }
}
