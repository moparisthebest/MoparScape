/* Class68_Sub13_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub3 extends Class68_Sub13
{
    static short aShort3466 = 205;
    static int anInt3467;
    static int anInt3468;
    static MutableString aClass100_3469;
    static MutableString aClass100_3470;
    static MutableString aClass100_3471 = Class112.makeMutableString(43, ")4");
    static int anInt3472;
    private int anInt3473 = 2048;
    static MutableString aClass100_3474;
    static int anInt3475;
    private int anInt3476 = 1024;
    static int anInt3477;
    static int anInt3478;
    static int anInt3479;
    static int anInt3480;
    static int[] anIntArray3481;
    static MutableString aClass100_3482;
    private static MutableString aClass100_3483;
    private int anInt3484 = 3072;

    final int[][] method697(int i, boolean bool)
    {
        anInt3468++;
        if (bool != true)
            aClass100_3483 = null;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -123);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[][] is_0_ = this.method699(-20, 0, i);
            int[] is_1_ = is_0_[1];
            int[] is_2_ = is_0_[0];
            int[] is_3_ = is_0_[2];
            int[] is_4_ = is[0];
            int[] is_5_ = is[1];
            int[] is_6_ = is[2];
            for (int i_7_ = 0; Class68_Sub13_Sub19.anInt3748 > i_7_; i_7_++)
            {
                is_4_[i_7_] = anInt3476 + (anInt3473 * is_2_[i_7_] >> 12);
                is_5_[i_7_] = (is_1_[i_7_] * anInt3473 >> 12) + anInt3476;
                is_6_[i_7_] = anInt3476 + (anInt3473 * is_3_[i_7_] >> 12);
            }
        }
        return is;
    }

    public Class68_Sub13_Sub3()
    {
        super(1, false);
    }

    final int[] method698(byte i, int i_8_)
    {
        if (i != -61)
            aClass100_3469 = null;
        anInt3472++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_8_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int[] is_9_ = this.method696(0, i_8_, i ^ ~0x71e1);
            for (int i_10_ = 0; i_10_ < Class68_Sub13_Sub19.anInt3748; i_10_++)
                is[i_10_] = anInt3476 + (is_9_[i_10_] * anInt3473 >> 12);
        }
        return is;
    }

    private static final boolean method711(int i, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, int i_15_, int i_16_, boolean bool_17_, int i_18_, int i_19_, int i_20_)
    {
        for (int i_21_ = 0; i_21_ < 104; i_21_++)
        {
            for (int i_22_ = 0; i_22_ < 104; i_22_++)
            {
                Class68_Sub8.anIntArrayArray2875[i_21_][i_22_] = 0;
                ObjectDefinition.anIntArrayArray2018[i_21_][i_22_] = 99999999;
            }
        }
        int i_23_ = i_19_;
        Class68_Sub8.anIntArrayArray2875[i_19_][i] = 99;
        ObjectDefinition.anIntArrayArray2018[i_19_][i] = 0;
        anInt3478++;
        int i_24_ = i;
        int i_25_ = 0;
        int i_26_ = 0;
        Class68_Sub13_Sub37.anIntArray4068[i_25_] = i_19_;
        Class68_Sub13_Sub21.anIntArray3799[i_25_++] = i;
        int[][] is = (((GroundData) Class109.groundDataArray[GameSocket.plane]).blocks);
        boolean bool_27_ = false;
        while (i_26_ != i_25_)
        {
            i_23_ = Class68_Sub13_Sub37.anIntArray4068[i_26_];
            i_24_ = Class68_Sub13_Sub21.anIntArray3799[i_26_];
            i_26_ = i_26_ + 1 & 0xfff;
            if (i_23_ == i_15_ && i_18_ == i_24_)
            {
                bool_27_ = true;
                break;
            }
            if (i_14_ != 0)
            {
                if (i_14_ >= 5 && i_14_ != 10 || !(Class109.groundDataArray[GameSocket.plane].method459(i_12_, i_15_, (byte) 108, i_23_, 2, i_18_, i_24_, i_14_ - 1)))
                {
                    if (i_14_ < 10 && (Class109.groundDataArray[GameSocket.plane].method462(i_15_, i_23_, i_12_, (byte) 69, 2, i_18_, i_24_, i_14_ - 1)))
                    {
                        bool_27_ = true;
                        break;
                    }
                } else
                {
                    bool_27_ = true;
                    break;
                }
            }
            if (i_11_ != 0 && i_13_ != 0 && (Class109.groundDataArray[GameSocket.plane].method448(15856, i_18_, 2, i_24_, i_13_, i_23_, i_20_, i_11_, i_15_)))
            {
                bool_27_ = true;
                break;
            }
            int i_28_ = ObjectDefinition.anIntArrayArray2018[i_23_][i_24_] + 1;
            if (i_23_ > 0 && Class68_Sub8.anIntArrayArray2875[i_23_ - 1][i_24_] == 0 && (0x12c010e & is[i_23_ - 1][i_24_]) == 0 && (is[i_23_ - 1][i_24_ + 1] & 0x12c0138) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_25_] = i_23_ - 1;
                Class68_Sub13_Sub21.anIntArray3799[i_25_] = i_24_;
                Class68_Sub8.anIntArrayArray2875[i_23_ - 1][i_24_] = 2;
                ObjectDefinition.anIntArrayArray2018[i_23_ - 1][i_24_] = i_28_;
                i_25_ = 0xfff & i_25_ + 1;
            }
            if (i_23_ < 102 && Class68_Sub8.anIntArrayArray2875[i_23_ + 1][i_24_] == 0 && (0x12c0183 & is[i_23_ + 2][i_24_]) == 0 && (is[i_23_ + 2][i_24_ + 1] & 0x12c01e0) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_25_] = i_23_ + 1;
                Class68_Sub13_Sub21.anIntArray3799[i_25_] = i_24_;
                Class68_Sub8.anIntArrayArray2875[i_23_ + 1][i_24_] = 8;
                ObjectDefinition.anIntArrayArray2018[i_23_ + 1][i_24_] = i_28_;
                i_25_ = i_25_ + 1 & 0xfff;
            }
            if (i_24_ > 0 && Class68_Sub8.anIntArrayArray2875[i_23_][i_24_ - 1] == 0 && (0x12c010e & is[i_23_][i_24_ - 1]) == 0 && (0x12c0183 & is[i_23_ + 1][i_24_ - 1]) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_25_] = i_23_;
                Class68_Sub13_Sub21.anIntArray3799[i_25_] = i_24_ - 1;
                Class68_Sub8.anIntArrayArray2875[i_23_][i_24_ - 1] = 1;
                i_25_ = 0xfff & i_25_ + 1;
                ObjectDefinition.anIntArrayArray2018[i_23_][i_24_ - 1] = i_28_;
            }
            if (i_24_ < 102 && Class68_Sub8.anIntArrayArray2875[i_23_][i_24_ + 1] == 0 && (is[i_23_][i_24_ + 2] & 0x12c0138) == 0 && (0x12c01e0 & is[i_23_ + 1][i_24_ + 2]) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_25_] = i_23_;
                Class68_Sub13_Sub21.anIntArray3799[i_25_] = i_24_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_23_][i_24_ + 1] = 4;
                ObjectDefinition.anIntArrayArray2018[i_23_][i_24_ + 1] = i_28_;
                i_25_ = i_25_ + 1 & 0xfff;
            }
            if (i_23_ > 0 && i_24_ > 0 && Class68_Sub8.anIntArrayArray2875[i_23_ - 1][i_24_ - 1] == 0 && (0x12c0138 & is[i_23_ - 1][i_24_]) == 0 && (is[i_23_ - 1][i_24_ - 1] & 0x12c010e) == 0 && (is[i_23_][i_24_ - 1] & 0x12c0183) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_25_] = i_23_ - 1;
                Class68_Sub13_Sub21.anIntArray3799[i_25_] = i_24_ - 1;
                i_25_ = 0xfff & i_25_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_23_ - 1][i_24_ - 1] = 3;
                ObjectDefinition.anIntArrayArray2018[i_23_ - 1][i_24_ - 1] = i_28_;
            }
            if (i_23_ < 102 && i_24_ > 0 && Class68_Sub8.anIntArrayArray2875[i_23_ + 1][i_24_ - 1] == 0 && (0x12c010e & is[i_23_ + 1][i_24_ - 1]) == 0 && (0x12c0183 & is[i_23_ + 2][i_24_ - 1]) == 0 && (0x12c01e0 & is[i_23_ + 2][i_24_]) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_25_] = i_23_ + 1;
                Class68_Sub13_Sub21.anIntArray3799[i_25_] = i_24_ - 1;
                Class68_Sub8.anIntArrayArray2875[i_23_ + 1][i_24_ - 1] = 9;
                i_25_ = i_25_ + 1 & 0xfff;
                ObjectDefinition.anIntArrayArray2018[i_23_ + 1][i_24_ - 1] = i_28_;
            }
            if (i_23_ > 0 && i_24_ < 102 && Class68_Sub8.anIntArrayArray2875[i_23_ - 1][i_24_ + 1] == 0 && (is[i_23_ - 1][i_24_ + 1] & 0x12c010e) == 0 && (0x12c0138 & is[i_23_ - 1][i_24_ + 2]) == 0 && (is[i_23_][i_24_ + 2] & 0x12c01e0) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_25_] = i_23_ - 1;
                Class68_Sub13_Sub21.anIntArray3799[i_25_] = i_24_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_23_ - 1][i_24_ + 1] = 6;
                i_25_ = 0xfff & i_25_ + 1;
                ObjectDefinition.anIntArrayArray2018[i_23_ - 1][i_24_ + 1] = i_28_;
            }
            if (i_23_ < 102 && i_24_ < 102 && Class68_Sub8.anIntArrayArray2875[i_23_ + 1][i_24_ + 1] == 0 && (0x12c0138 & is[i_23_ + 1][i_24_ + 2]) == 0 && (is[i_23_ + 2][i_24_ + 2] & 0x12c01e0) == 0 && (is[i_23_ + 2][i_24_ + 1] & 0x12c0183) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_25_] = i_23_ + 1;
                Class68_Sub13_Sub21.anIntArray3799[i_25_] = i_24_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_23_ + 1][i_24_ + 1] = 12;
                ObjectDefinition.anIntArrayArray2018[i_23_ + 1][i_24_ + 1] = i_28_;
                i_25_ = i_25_ + 1 & 0xfff;
            }
        }
        Class32.anInt565 = 0;
        if (!bool_27_)
        {
            if (!bool)
                return false;
            int i_29_ = 1000;
            int i_30_ = 10;
            int i_31_ = 100;
            for (int i_32_ = i_15_ - i_30_; i_32_ <= i_30_ + i_15_; i_32_++)
            {
                for (int i_33_ = i_18_ - i_30_; i_33_ <= i_30_ + i_18_; i_33_++)
                {
                    if (i_32_ >= 0 && i_33_ >= 0 && i_32_ < 104 && i_33_ < 104 && ObjectDefinition.anIntArrayArray2018[i_32_][i_33_] < 100)
                    {
                        int i_34_ = 0;
                        if (i_15_ > i_32_)
                            i_34_ = i_15_ - i_32_;
                        else if (i_32_ > i_15_ + i_11_ - 1)
                            i_34_ = 1 - i_11_ + i_32_ - i_15_;
                        int i_35_ = 0;
                        if (i_33_ < i_18_)
                            i_35_ = i_18_ - i_33_;
                        else if (i_13_ + i_18_ - 1 < i_33_)
                            i_35_ = i_33_ + (-i_13_ - i_18_) + 1;
                        int i_36_ = i_34_ * i_34_ + i_35_ * i_35_;
                        if (i_29_ > i_36_ || i_29_ == i_36_ && i_31_ > (ObjectDefinition.anIntArrayArray2018[i_32_][i_33_]))
                        {
                            i_24_ = i_33_;
                            i_23_ = i_32_;
                            i_31_ = ObjectDefinition.anIntArrayArray2018[i_32_][i_33_];
                            i_29_ = i_36_;
                        }
                    }
                }
            }
            if (i_29_ == 1000)
                return false;
            if (i_19_ == i_23_ && i_24_ == i)
                return false;
            Class32.anInt565 = 1;
        }
        i_26_ = 0;
        Class68_Sub13_Sub37.anIntArray4068[i_26_] = i_23_;
        if (bool_17_ != true)
            aClass100_3483 = null;
        Class68_Sub13_Sub21.anIntArray3799[i_26_++] = i_24_;
        int i_38_;
        int i_37_ = i_38_ = Class68_Sub8.anIntArrayArray2875[i_23_][i_24_];
        while (i_19_ != i_23_ || i != i_24_)
        {
            if (i_38_ != i_37_)
            {
                i_38_ = i_37_;
                Class68_Sub13_Sub37.anIntArray4068[i_26_] = i_23_;
                Class68_Sub13_Sub21.anIntArray3799[i_26_++] = i_24_;
            }
            if ((i_37_ & 0x1) != 0)
                i_24_++;
            else if ((i_37_ & 0x4) != 0)
                i_24_--;
            if ((i_37_ & 0x2) != 0)
                i_23_++;
            else if ((i_37_ & 0x8) != 0)
                i_23_--;
            i_37_ = Class68_Sub8.anIntArrayArray2875[i_23_][i_24_];
        }
        if (i_26_ > 0)
        {
            Class58.method580(i_26_, i_16_, (byte) 125);
            return true;
        }
        if (i_16_ == 1)
            return false;
        return true;
    }

    final void method690(byte i)
    {
        anInt3467++;
        if (i > -22)
            anInt3484 = -76;
        anInt3473 = anInt3484 - anInt3476;
    }

    public static void method712(int i)
    {
        aClass100_3483 = null;
        if (i != 9927)
            aClass100_3471 = null;
        anIntArray3481 = null;
        aClass100_3482 = null;
        aClass100_3469 = null;
        aClass100_3474 = null;
        aClass100_3471 = null;
        aClass100_3470 = null;
    }

    static final boolean method713(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, boolean bool, int i_45_, int i_46_, int i_47_, int i_48_)
    {
        anInt3477++;
        if (i_46_ == (((Character) Class68_Sub7.localPlayer).raw_range ^ 0xffffffff))
            return method711(i_41_, i_43_, i, i_42_, i_39_, bool, i_48_, i_47_, true, i_44_, i_40_, i_45_);
        if (((Character) Class68_Sub7.localPlayer).raw_range > 2)
            return Class68_Sub15.method978(bool, i_40_, i_44_, i_47_, i_42_, i, i_43_, (byte) 121, i_48_, i_41_, i_39_, i_45_, (((Character) (Class68_Sub7.localPlayer)).raw_range));
        return Class68_Sub20_Sub11.method1141(i_44_, i_43_, i_39_, i_42_, i_41_, i_48_, (byte) 36, i_47_, i, i_40_, i_45_, bool);
    }

    final void method700(Stream class68_sub14, int i, int i_49_)
    {
        do
        {
            try
            {
                int i_50_ = i;
                while_1_: do
                {
                    do
                    {
                        if (i_50_ != 0)
                        {
                            if (i_50_ != 1)
                            {
                                if (i_50_ == 2)
                                    break;
                                break while_1_;
                            }
                        } else
                        {
                            anInt3476 = class68_sub14.readUShort();
                            break while_1_;
                        }
                        anInt3484 = class68_sub14.readUShort();
                        break while_1_;
                    } while (false);
                    ((Class68_Sub13) this).aBoolean2933 = class68_sub14.readUByte() == 1;
                } while (false);
                anInt3480++;
                if (i_49_ == -1)
                    break;
                method700(null, -25, 117);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ce.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_49_ + ')'));
            }
            break;
        } while (false);
    }

    static
    {
        aClass100_3469 = Class112.makeMutableString(43, "");
        aClass100_3482 = Class112.makeMutableString(43, "Null");
        aClass100_3483 = Class112.makeMutableString(43, "yellow:");
        aClass100_3470 = aClass100_3483;
        aClass100_3474 = aClass100_3483;
    }
}
