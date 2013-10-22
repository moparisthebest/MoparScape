/* Class68_Sub13_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub22 extends Class68_Sub13
{
    static int[] anIntArray3807;
    static short aShort3808 = 32767;
    private int anInt3809 = 1;
    static MutableString aClass100_3810 = Class112.makeMutableString(43, " x ");
    static int anInt3811;
    static int anInt3812;
    static Class68_Sub20_Sub15 aClass68_Sub20_Sub15_3813;
    static float aFloat3814;
    static int anInt3815;
    private int anInt3816 = 1;
    static int anInt3817;

    public static void method810(byte i)
    {
        aClass100_3810 = null;
        anIntArray3807 = null;
        aClass68_Sub20_Sub15_3813 = null;
        if (i <= 10)
            method811(31, -36, 15);
    }

    public Class68_Sub13_Sub22()
    {
        super(1, false);
    }

    final void method700(Stream class68_sub14, int i, int i_0_)
    {
        while_99_: do
        {
            try
            {
                if (i_0_ != -1)
                    aShort3808 = (short) -91;
                anInt3815++;
                int i_1_ = i;
                do
                {
                    if (i_1_ != 0)
                    {
                        if (i_1_ != 1)
                        {
                            if (i_1_ == 2)
                                break;
                            break while_99_;
                        }
                    } else
                    {
                        anInt3816 = class68_sub14.readUByte();
                        return;
                    }
                    anInt3809 = class68_sub14.readUByte();
                    return;
                } while (false);
                ((Class68_Sub13) this).aBoolean2933 = class68_sub14.readUByte() == 1;
                break;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("mh.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
            }
        } while (false);
    }

    final int[][] method697(int i, boolean bool)
    {
        if (bool != true)
            method812(123, -69, -104);
        anInt3817++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -5);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int i_2_ = anInt3809 + (anInt3809 + 1);
            int i_3_ = 65536 / i_2_;
            int i_4_ = anInt3816 + anInt3816 + 1;
            int[][][] is_5_ = new int[i_2_][][];
            int i_6_ = 65536 / i_4_;
            for (int i_7_ = i - anInt3809; anInt3809 + i >= i_7_; i_7_++)
            {
                int[][] is_8_ = this.method699(-53, 0, i_7_ & Player.anInt3434);
                int[][] is_9_ = new int[3][Class68_Sub13_Sub19.anInt3748];
                int i_10_ = 0;
                int i_11_ = 0;
                int i_12_ = 0;
                int[] is_13_ = is_8_[2];
                int[] is_14_ = is_8_[0];
                int[] is_15_ = is_8_[1];
                for (int i_16_ = -anInt3816; i_16_ <= anInt3816; i_16_++)
                {
                    int i_17_ = i_16_ & Class30.anInt543;
                    i_11_ += is_13_[i_17_];
                    i_12_ += is_15_[i_17_];
                    i_10_ += is_14_[i_17_];
                }
                int[] is_18_ = is_9_[0];
                int[] is_19_ = is_9_[1];
                int[] is_20_ = is_9_[2];
                int i_21_ = 0;
                while (i_21_ < Class68_Sub13_Sub19.anInt3748)
                {
                    is_18_[i_21_] = i_6_ * i_10_ >> 16;
                    is_19_[i_21_] = i_12_ * i_6_ >> 16;
                    is_20_[i_21_] = i_11_ * i_6_ >> 16;
                    int i_22_ = i_21_ - anInt3816 & Class30.anInt543;
                    i_11_ -= is_13_[i_22_];
                    i_10_ -= is_14_[i_22_];
                    i_21_++;
                    i_12_ -= is_15_[i_22_];
                    i_22_ = Class30.anInt543 & anInt3816 + i_21_;
                    i_10_ += is_14_[i_22_];
                    i_11_ += is_13_[i_22_];
                    i_12_ += is_15_[i_22_];
                }
                is_5_[i_7_ - i + anInt3809] = is_9_;
            }
            int[] is_23_ = is[1];
            int[] is_24_ = is[0];
            int[] is_25_ = is[2];
            for (int i_26_ = 0; Class68_Sub13_Sub19.anInt3748 > i_26_; i_26_++)
            {
                int i_27_ = 0;
                int i_28_ = 0;
                int i_29_ = 0;
                for (int i_30_ = 0; i_30_ < i_2_; i_30_++)
                {
                    int[][] is_31_ = is_5_[i_30_];
                    i_28_ += is_31_[1][i_26_];
                    i_29_ += is_31_[2][i_26_];
                    i_27_ += is_31_[0][i_26_];
                }
                is_24_[i_26_] = i_3_ * i_27_ >> 16;
                is_23_[i_26_] = i_28_ * i_3_ >> 16;
                is_25_[i_26_] = i_29_ * i_3_ >> 16;
            }
        }
        return is;
    }

    static final Object4 method811(int i, int i_32_, int i_33_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_32_][i_33_];
        if (class68_sub1 == null)
            return null;
        Object4 class57 = ((Ground) class68_sub1).object_4;
        ((Ground) class68_sub1).object_4 = null;
        return class57;
    }

    static final Object3 method812(int i, int i_34_, int i_35_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_34_][i_35_];
        if (class68_sub1 == null)
            return null;
        Object3 class47 = ((Ground) class68_sub1).object_3;
        ((Ground) class68_sub1).object_3 = null;
        return class47;
    }

    final int[] method698(byte i, int i_36_)
    {
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_36_);
        if (i != -61)
            return null;
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_37_ = anInt3816 + anInt3816 + 1;
            int i_38_ = anInt3809 + 1 + anInt3809;
            int i_39_ = 65536 / i_37_;
            int[][] is_40_ = new int[i_38_][];
            for (int i_41_ = i_36_ - anInt3809; i_41_ <= i_36_ + anInt3809; i_41_++)
            {
                int[] is_42_ = this.method696(0, Player.anInt3434 & i_41_, 29149);
                int i_43_ = 0;
                for (int i_44_ = -anInt3816; i_44_ <= anInt3816; i_44_++)
                    i_43_ += is_42_[Class30.anInt543 & i_44_];
                int[] is_45_ = new int[Class68_Sub13_Sub19.anInt3748];
                int i_46_ = 0;
                while (i_46_ < Class68_Sub13_Sub19.anInt3748)
                {
                    is_45_[i_46_] = i_39_ * i_43_ >> 16;
                    i_43_ -= is_42_[Class30.anInt543 & i_46_ - anInt3816];
                    i_46_++;
                    i_43_ += is_42_[Class30.anInt543 & i_46_ + anInt3816];
                }
                is_40_[anInt3809 - i_36_ + i_41_] = is_45_;
            }
            int i_47_ = 65536 / i_38_;
            for (int i_48_ = 0; Class68_Sub13_Sub19.anInt3748 > i_48_; i_48_++)
            {
                int i_49_ = 0;
                for (int i_50_ = 0; i_38_ > i_50_; i_50_++)
                    i_49_ += is_40_[i_50_][i_48_];
                is[i_48_] = i_49_ * i_47_ >> 16;
            }
        }
        anInt3811++;
        return is;
    }
}
