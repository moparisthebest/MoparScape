/* Class68_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub15 extends Node
{
    static int anInt3013;
    static int anInt3014;
    static int anInt3015;
    long aLong3016;
    static MutableString[] chatMessages = new MutableString[1000];
    static int anInt3018;
    static int anInt3019;
    static int anInt3020;
    static int anInt3021;
    static Class21 aClass21_3022;

    static final int method977(int i, int i_0_)
    {
        if (i != 28443)
            method979(null, -10);
        anInt3019++;
        return i_0_ >>> 8;
    }

    static final boolean method978(boolean bool, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, byte i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_)
    {
        for (int i_12_ = 0; i_12_ < 104; i_12_++)
        {
            for (int i_13_ = 0; i_13_ < 104; i_13_++)
            {
                Class68_Sub8.anIntArrayArray2875[i_12_][i_13_] = 0;
                ObjectDefinition.anIntArrayArray2018[i_12_][i_13_] = 99999999;
            }
        }
        anInt3013++;
        int i_14_ = i;
        int i_15_ = i_8_;
        Class68_Sub8.anIntArrayArray2875[i][i_8_] = 99;
        int i_16_ = 0;
        ObjectDefinition.anIntArrayArray2018[i][i_8_] = 0;
        Class68_Sub13_Sub37.anIntArray4068[i_16_] = i;
        Class68_Sub13_Sub21.anIntArray3799[i_16_++] = i_8_;
        int i_17_ = 0;
        if (i_6_ < 108)
            aClass21_3022 = null;
        int[][] is = (((GroundData) Class109.groundDataArray[GameSocket.plane]).blocks);
        boolean bool_18_ = false;
        while_92_: while (i_16_ != i_17_)
        {
            i_14_ = Class68_Sub13_Sub37.anIntArray4068[i_17_];
            i_15_ = Class68_Sub13_Sub21.anIntArray3799[i_17_];
            i_17_ = i_17_ + 1 & 0xfff;
            if (i_7_ == i_14_ && i_1_ == i_15_)
            {
                bool_18_ = true;
                break;
            }
            if (i_9_ != 0)
            {
                if ((i_9_ < 5 || i_9_ == 10) && (Class109.groundDataArray[GameSocket.plane].method459(i_4_, i_7_, (byte) 108, i_14_, i_11_, i_1_, i_15_, i_9_ - 1)))
                {
                    bool_18_ = true;
                    break;
                }
                if (i_9_ < 10 && (Class109.groundDataArray[GameSocket.plane].method462(i_7_, i_14_, i_4_, (byte) 118, i_11_, i_1_, i_15_, i_9_ - 1)))
                {
                    bool_18_ = true;
                    break;
                }
            }
            if (i_5_ != 0 && i_3_ != 0 && (Class109.groundDataArray[GameSocket.plane].method448(15856, i_1_, i_11_, i_15_, i_3_, i_14_, i_10_, i_5_, i_7_)))
            {
                bool_18_ = true;
                break;
            }
            int i_19_ = ObjectDefinition.anIntArrayArray2018[i_14_][i_15_] + 1;
            while_85_: do
            {
                if (i_14_ > 0 && Class68_Sub8.anIntArrayArray2875[i_14_ - 1][i_15_] == 0 && (is[i_14_ - 1][i_15_] & 0x12c010e) == 0 && (is[i_14_ - 1][i_11_ + (i_15_ - 1)] & 0x12c0138) == 0)
                {
                    for (int i_20_ = 1; i_20_ < i_11_ - 1; i_20_++)
                    {
                        if ((is[i_14_ - 1][i_20_ + i_15_] & 0x12c013e) != 0)
                            break while_85_;
                    }
                    Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_14_ - 1;
                    Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_15_;
                    Class68_Sub8.anIntArrayArray2875[i_14_ - 1][i_15_] = 2;
                    ObjectDefinition.anIntArrayArray2018[i_14_ - 1][i_15_] = i_19_;
                    i_16_ = i_16_ + 1 & 0xfff;
                }
            } while (false);
            while_86_: do
            {
                if (i_14_ < 102 && Class68_Sub8.anIntArrayArray2875[i_14_ + 1][i_15_] == 0 && (is[i_11_ + i_14_][i_15_] & 0x12c0183) == 0 && ((0x12c01e0 & is[i_14_ + i_11_][i_15_ + (i_11_ - 1)]) == 0))
                {
                    for (int i_21_ = 1; i_11_ - 1 > i_21_; i_21_++)
                    {
                        if ((is[i_14_ + i_11_][i_21_ + i_15_] & 0x12c01e3) != 0)
                            break while_86_;
                    }
                    Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_14_ + 1;
                    Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_15_;
                    Class68_Sub8.anIntArrayArray2875[i_14_ + 1][i_15_] = 8;
                    i_16_ = 0xfff & i_16_ + 1;
                    ObjectDefinition.anIntArrayArray2018[i_14_ + 1][i_15_] = i_19_;
                }
            } while (false);
            while_87_: do
            {
                if (i_15_ > 0 && Class68_Sub8.anIntArrayArray2875[i_14_][i_15_ - 1] == 0 && (is[i_14_][i_15_ - 1] & 0x12c010e) == 0 && (0x12c0183 & is[i_11_ + i_14_ - 1][i_15_ - 1]) == 0)
                {
                    for (int i_22_ = 1; i_11_ - 1 > i_22_; i_22_++)
                    {
                        if ((is[i_14_ + i_22_][i_15_ - 1] & 0x12c018f) != 0)
                            break while_87_;
                    }
                    Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_14_;
                    Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_15_ - 1;
                    i_16_ = i_16_ + 1 & 0xfff;
                    Class68_Sub8.anIntArrayArray2875[i_14_][i_15_ - 1] = 1;
                    ObjectDefinition.anIntArrayArray2018[i_14_][i_15_ - 1] = i_19_;
                }
            } while (false);
            while_88_: do
            {
                if (i_15_ < 102 && Class68_Sub8.anIntArrayArray2875[i_14_][i_15_ + 1] == 0 && (0x12c0138 & is[i_14_][i_15_ + i_11_]) == 0 && ((0x12c01e0 & is[i_11_ + i_14_ - 1][i_11_ + i_15_]) == 0))
                {
                    for (int i_23_ = 1; i_11_ - 1 > i_23_; i_23_++)
                    {
                        if ((is[i_23_ + i_14_][i_15_ + i_11_] & 0x12c01f8) != 0)
                            break while_88_;
                    }
                    Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_14_;
                    Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_15_ + 1;
                    Class68_Sub8.anIntArrayArray2875[i_14_][i_15_ + 1] = 4;
                    i_16_ = 0xfff & i_16_ + 1;
                    ObjectDefinition.anIntArrayArray2018[i_14_][i_15_ + 1] = i_19_;
                }
            } while (false);
            while_89_: do
            {
                if (i_14_ > 0 && i_15_ > 0 && (Class68_Sub8.anIntArrayArray2875[i_14_ - 1][i_15_ - 1] == 0) && (0x12c0138 & is[i_14_ - 1][i_11_ - 1 + i_15_ - 1]) == 0 && (is[i_14_ - 1][i_15_ - 1] & 0x12c010e) == 0 && ((is[i_11_ - 1 + i_14_ - 1][i_15_ - 1] & 0x12c0183) == 0))
                {
                    for (int i_24_ = 1; i_24_ < i_11_ - 1; i_24_++)
                    {
                        if ((is[i_14_ - 1][i_15_ - 1 + i_24_] & 0x12c013e) != 0 || (0x12c018f & is[i_24_ + (i_14_ - 1)][i_15_ - 1]) != 0)
                            break while_89_;
                    }
                    Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_14_ - 1;
                    Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_15_ - 1;
                    Class68_Sub8.anIntArrayArray2875[i_14_ - 1][i_15_ - 1] = 3;
                    ObjectDefinition.anIntArrayArray2018[i_14_ - 1][i_15_ - 1] = i_19_;
                    i_16_ = 0xfff & i_16_ + 1;
                }
            } while (false);
            while_90_: do
            {
                if (i_14_ < 102 && i_15_ > 0 && (Class68_Sub8.anIntArrayArray2875[i_14_ + 1][i_15_ - 1] == 0) && (is[i_14_ + 1][i_15_ - 1] & 0x12c010e) == 0 && (0x12c0183 & is[i_14_ + i_11_][i_15_ - 1]) == 0 && ((0x12c01e0 & is[i_11_ + i_14_][i_15_ + i_11_ - 1 - 1]) == 0))
                {
                    for (int i_25_ = 1; i_11_ - 1 > i_25_; i_25_++)
                    {
                        if (((is[i_11_ + i_14_][i_25_ - 1 + i_15_] & 0x12c01e3) != 0) || (0x12c018f & is[i_14_ + (i_25_ + 1)][i_15_ - 1]) != 0)
                            break while_90_;
                    }
                    Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_14_ + 1;
                    Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_15_ - 1;
                    Class68_Sub8.anIntArrayArray2875[i_14_ + 1][i_15_ - 1] = 9;
                    ObjectDefinition.anIntArrayArray2018[i_14_ + 1][i_15_ - 1] = i_19_;
                    i_16_ = i_16_ + 1 & 0xfff;
                }
            } while (false);
            while_91_: do
            {
                if (i_14_ > 0 && i_15_ < 102 && (Class68_Sub8.anIntArrayArray2875[i_14_ - 1][i_15_ + 1] == 0) && (0x12c010e & is[i_14_ - 1][i_15_ + 1]) == 0 && (0x12c0138 & is[i_14_ - 1][i_15_ + i_11_]) == 0 && (is[i_14_][i_11_ + i_15_] & 0x12c01e0) == 0)
                {
                    for (int i_26_ = 1; i_26_ < i_11_ - 1; i_26_++)
                    {
                        if ((is[i_14_ - 1][i_26_ + 1 + i_15_] & 0x12c013e) != 0 || (is[i_26_ + i_14_ - 1][i_11_ + i_15_] & 0x12c01f8) != 0)
                            break while_91_;
                    }
                    Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_14_ - 1;
                    Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_15_ + 1;
                    Class68_Sub8.anIntArrayArray2875[i_14_ - 1][i_15_ + 1] = 6;
                    i_16_ = i_16_ + 1 & 0xfff;
                    ObjectDefinition.anIntArrayArray2018[i_14_ - 1][i_15_ + 1] = i_19_;
                }
            } while (false);
            if (i_14_ < 102 && i_15_ < 102 && Class68_Sub8.anIntArrayArray2875[i_14_ + 1][i_15_ + 1] == 0 && (is[i_14_ + 1][i_11_ + i_15_] & 0x12c0138) == 0 && (0x12c01e0 & is[i_14_ + i_11_][i_11_ + i_15_]) == 0 && (0x12c0183 & is[i_11_ + i_14_][i_15_ + 1]) == 0)
            {
                for (int i_27_ = 1; i_27_ < i_11_ - 1; i_27_++)
                {
                    if (((is[i_27_ + (i_14_ + 1)][i_11_ + i_15_] & 0x12c01f8) != 0) || ((is[i_11_ + i_14_][i_15_ + 1 + i_27_] & 0x12c01e3) != 0))
                        continue while_92_;
                }
                Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_14_ + 1;
                Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_15_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_14_ + 1][i_15_ + 1] = 12;
                i_16_ = i_16_ + 1 & 0xfff;
                ObjectDefinition.anIntArrayArray2018[i_14_ + 1][i_15_ + 1] = i_19_;
            }
        }
        Class32.anInt565 = 0;
        if (!bool_18_)
        {
            if (bool)
            {
                int i_28_ = 1000;
                int i_29_ = 100;
                int i_30_ = 10;
                for (int i_31_ = i_7_ - i_30_; i_31_ <= i_7_ + i_30_; i_31_++)
                {
                    for (int i_32_ = i_1_ - i_30_; i_32_ <= i_1_ + i_30_; i_32_++)
                    {
                        if (i_31_ >= 0 && i_32_ >= 0 && i_31_ < 104 && i_32_ < 104 && (ObjectDefinition.anIntArrayArray2018[i_31_][i_32_] < 100))
                        {
                            int i_33_ = 0;
                            int i_34_ = 0;
                            if (i_7_ > i_31_)
                                i_34_ = i_7_ - i_31_;
                            else if (i_31_ > i_7_ + i_5_ - 1)
                                i_34_ = i_31_ + 1 - i_7_ - i_5_;
                            if (i_1_ <= i_32_)
                            {
                                if (i_3_ + (i_1_ - 1) < i_32_)
                                    i_33_ = 1 - (i_1_ - (i_32_ - i_3_));
                            } else
                                i_33_ = i_1_ - i_32_;
                            int i_35_ = i_33_ * i_33_ + i_34_ * i_34_;
                            if (i_28_ > i_35_ || (i_35_ == i_28_ && i_29_ > (ObjectDefinition.anIntArrayArray2018[i_31_][i_32_])))
                            {
                                i_14_ = i_31_;
                                i_29_ = (ObjectDefinition.anIntArrayArray2018[i_31_][i_32_]);
                                i_15_ = i_32_;
                                i_28_ = i_35_;
                            }
                        }
                    }
                }
                if (i_28_ == 1000)
                    return false;
                if (i == i_14_ && i_8_ == i_15_)
                    return false;
                Class32.anInt565 = 1;
            } else
                return false;
        }
        i_17_ = 0;
        Class68_Sub13_Sub37.anIntArray4068[i_17_] = i_14_;
        Class68_Sub13_Sub21.anIntArray3799[i_17_++] = i_15_;
        int i_37_;
        int i_36_ = i_37_ = Class68_Sub8.anIntArrayArray2875[i_14_][i_15_];
        while (i_14_ != i || i_8_ != i_15_)
        {
            if (i_37_ != i_36_)
            {
                i_37_ = i_36_;
                Class68_Sub13_Sub37.anIntArray4068[i_17_] = i_14_;
                Class68_Sub13_Sub21.anIntArray3799[i_17_++] = i_15_;
            }
            if ((0x1 & i_36_) == 0)
            {
                if ((0x4 & i_36_) != 0)
                    i_15_--;
            } else
                i_15_++;
            if ((i_36_ & 0x2) != 0)
                i_14_++;
            else if ((0x8 & i_36_) != 0)
                i_14_--;
            i_36_ = Class68_Sub8.anIntArrayArray2875[i_14_][i_15_];
        }
        if (i_17_ > 0)
        {
            Class58.method580(i_17_, i_2_, (byte) 124);
            return true;
        }
        if (i_2_ == 1)
            return false;
        return true;
    }

    static final void method979(Class21 class21, int i)
    {
        do
        {
            try
            {
                Class68_Sub20_Sub15.anInt4404 = class21.getIndex(Class20.aClass100_413, (byte) -104);
                anInt3021++;
                if (i == 1)
                    break;
                anInt3015 = 52;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("lk.C(" + (class21 != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    static final void method980(int i)
    {
        anInt3020++;
        Class121.aClass98_2102.method1573(123);
        int i_38_ = -52 % ((-32 - i) / 44);
    }

    public static void method981(int i)
    {
        aClass21_3022 = null;
        if (i == 1)
            chatMessages = null;
    }

    public Class68_Sub15()
    {
        /* empty */
    }

    static final void method982(int i, int i_39_, int i_40_, byte i_41_, int i_42_)
    {
        if (i_41_ != -7)
            method982(-61, 57, -65, (byte) 13, 35);
        anInt3018++;
        if (GroundData.anInt677 <= i_40_ && i_40_ <= NodeCache.anInt1920)
        {
            i_42_ = Class68_Sub20_Sub15.method1171(i_42_, Class51.anInt2257, (byte) 114, Class35.anInt605);
            i_39_ = Class68_Sub20_Sub15.method1171(i_39_, Class51.anInt2257, (byte) 114, Class35.anInt605);
            GameSocket.method595(-6, i_40_, i_39_, i, i_42_);
        }
    }

    Class68_Sub15(long l)
    {
        ((Class68_Sub15) this).aLong3016 = l;
    }

    static
    {
        anInt3014 = 0;
    }
}
