/* Class68_Sub20_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub11 extends NodeSub
{
    static int anInt4323;
    static int anInt4324;
    static MutableString aClass100_4325;
    static int anInt4326;
    static int anInt4327;
    int[] anIntArray4328;
    int[] anIntArray4329;
    static int anInt4330;
    static int anInt4331;
    static int anInt4332;
    static MutableString aClass100_4333;
    static byte[][] aByteArrayArray4334;
    static MutableString aClass100_4335 = Class112.makeMutableString(43, ")3runescape)3com");
    static MutableString aClass100_4336;
    int[] anIntArray4337;
    static int anInt4338;
    static int anInt4339;
    int[] anIntArray4340;
    static int anInt4341;
    static int anInt4342;
    static int anInt4343;
    MutableString aClass100_4344;

    final int method1139(int i, int i_0_)
    {
        anInt4323++;
        if (((Class68_Sub20_Sub11) this).anIntArray4329 == null)
            return -1;
        int i_1_ = 0;
        if (i_0_ != -1)
            ((Class68_Sub20_Sub11) this).anIntArray4328 = null;
        for (/**/; i_1_ < ((Class68_Sub20_Sub11) this).anIntArray4329.length; i_1_++)
        {
            if (((Class68_Sub20_Sub11) this).anIntArray4337[i_1_] == i)
                return ((Class68_Sub20_Sub11) this).anIntArray4329[i_1_];
        }
        return -1;
    }

    static final void method1140(int i)
    {
        anInt4331++;
        synchronized (Class63.anObject1169)
        {
            if (Class9.anInt169 == 0)
                Class75_Sub1_Sub1.signlink.method558((byte) -58, 5, new Class87());
            Class9.anInt169 = i;
        }
    }

    static final boolean method1141(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, byte i_7_, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool)
    {
        int i_12_ = -107 / ((i_7_ + 27) / 58);
        for (int i_13_ = 0; i_13_ < 104; i_13_++)
        {
            for (int i_14_ = 0; i_14_ < 104; i_14_++)
            {
                Class68_Sub8.anIntArrayArray2875[i_13_][i_14_] = 0;
                ObjectDefinition.anIntArrayArray2018[i_13_][i_14_] = 99999999;
            }
        }
        Class68_Sub8.anIntArrayArray2875[i_10_][i_5_] = 99;
        int i_15_ = i_10_;
        anInt4342++;
        int i_16_ = 0;
        ObjectDefinition.anIntArrayArray2018[i_10_][i_5_] = 0;
        int i_17_ = i_5_;
        int i_18_ = 0;
        Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_10_;
        boolean bool_19_ = false;
        Class68_Sub13_Sub21.anIntArray3799[i_16_++] = i_5_;
        int[][] is = (((GroundData) Class109.groundDataArray[GameSocket.plane]).blocks);
        while (i_18_ != i_16_)
        {
            i_17_ = Class68_Sub13_Sub21.anIntArray3799[i_18_];
            i_15_ = Class68_Sub13_Sub37.anIntArray4068[i_18_];
            i_18_ = 0xfff & i_18_ + 1;
            if (i_15_ == i_6_ && i == i_17_)
            {
                bool_19_ = true;
                break;
            }
            if (i_3_ != 0)
            {
                if ((i_3_ < 5 || i_3_ == 10) && (Class109.groundDataArray[GameSocket.plane].method459(i_9_, i_6_, (byte) 108, i_15_, 1, i, i_17_, i_3_ - 1)))
                {
                    bool_19_ = true;
                    break;
                }
                if (i_3_ < 10 && (Class109.groundDataArray[GameSocket.plane].method462(i_6_, i_15_, i_9_, (byte) -37, 1, i, i_17_, i_3_ - 1)))
                {
                    bool_19_ = true;
                    break;
                }
            }
            if (i_2_ != 0 && i_4_ != 0 && (Class109.groundDataArray[GameSocket.plane].method448(15856, i, 1, i_17_, i_4_, i_15_, i_11_, i_2_, i_6_)))
            {
                bool_19_ = true;
                break;
            }
            int i_20_ = ObjectDefinition.anIntArrayArray2018[i_15_][i_17_] + 1;
            if (i_15_ > 0 && Class68_Sub8.anIntArrayArray2875[i_15_ - 1][i_17_] == 0 && (is[i_15_ - 1][i_17_] & 0x12c0108) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_15_ - 1;
                Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_17_;
                i_16_ = 0xfff & i_16_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_15_ - 1][i_17_] = 2;
                ObjectDefinition.anIntArrayArray2018[i_15_ - 1][i_17_] = i_20_;
            }
            if (i_15_ < 103 && Class68_Sub8.anIntArrayArray2875[i_15_ + 1][i_17_] == 0 && (0x12c0180 & is[i_15_ + 1][i_17_]) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_15_ + 1;
                Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_17_;
                i_16_ = i_16_ + 1 & 0xfff;
                Class68_Sub8.anIntArrayArray2875[i_15_ + 1][i_17_] = 8;
                ObjectDefinition.anIntArrayArray2018[i_15_ + 1][i_17_] = i_20_;
            }
            if (i_17_ > 0 && Class68_Sub8.anIntArrayArray2875[i_15_][i_17_ - 1] == 0 && (is[i_15_][i_17_ - 1] & 0x12c0102) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_15_;
                Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_17_ - 1;
                Class68_Sub8.anIntArrayArray2875[i_15_][i_17_ - 1] = 1;
                i_16_ = 0xfff & i_16_ + 1;
                ObjectDefinition.anIntArrayArray2018[i_15_][i_17_ - 1] = i_20_;
            }
            if (i_17_ < 103 && Class68_Sub8.anIntArrayArray2875[i_15_][i_17_ + 1] == 0 && (is[i_15_][i_17_ + 1] & 0x12c0120) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_15_;
                Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_17_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_15_][i_17_ + 1] = 4;
                ObjectDefinition.anIntArrayArray2018[i_15_][i_17_ + 1] = i_20_;
                i_16_ = i_16_ + 1 & 0xfff;
            }
            if (i_15_ > 0 && i_17_ > 0 && Class68_Sub8.anIntArrayArray2875[i_15_ - 1][i_17_ - 1] == 0 && (is[i_15_ - 1][i_17_ - 1] & 0x12c010e) == 0 && (is[i_15_ - 1][i_17_] & 0x12c0108) == 0 && (is[i_15_][i_17_ - 1] & 0x12c0102) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_15_ - 1;
                Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_17_ - 1;
                i_16_ = 0xfff & i_16_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_15_ - 1][i_17_ - 1] = 3;
                ObjectDefinition.anIntArrayArray2018[i_15_ - 1][i_17_ - 1] = i_20_;
            }
            if (i_15_ < 103 && i_17_ > 0 && Class68_Sub8.anIntArrayArray2875[i_15_ + 1][i_17_ - 1] == 0 && (0x12c0183 & is[i_15_ + 1][i_17_ - 1]) == 0 && (0x12c0180 & is[i_15_ + 1][i_17_]) == 0 && (0x12c0102 & is[i_15_][i_17_ - 1]) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_15_ + 1;
                Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_17_ - 1;
                i_16_ = 0xfff & i_16_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_15_ + 1][i_17_ - 1] = 9;
                ObjectDefinition.anIntArrayArray2018[i_15_ + 1][i_17_ - 1] = i_20_;
            }
            if (i_15_ > 0 && i_17_ < 103 && Class68_Sub8.anIntArrayArray2875[i_15_ - 1][i_17_ + 1] == 0 && (is[i_15_ - 1][i_17_ + 1] & 0x12c0138) == 0 && (0x12c0108 & is[i_15_ - 1][i_17_]) == 0 && (is[i_15_][i_17_ + 1] & 0x12c0120) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_15_ - 1;
                Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_17_ + 1;
                i_16_ = 0xfff & i_16_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_15_ - 1][i_17_ + 1] = 6;
                ObjectDefinition.anIntArrayArray2018[i_15_ - 1][i_17_ + 1] = i_20_;
            }
            if (i_15_ < 103 && i_17_ < 103 && Class68_Sub8.anIntArrayArray2875[i_15_ + 1][i_17_ + 1] == 0 && (is[i_15_ + 1][i_17_ + 1] & 0x12c01e0) == 0 && (0x12c0180 & is[i_15_ + 1][i_17_]) == 0 && (is[i_15_][i_17_ + 1] & 0x12c0120) == 0)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_16_] = i_15_ + 1;
                Class68_Sub13_Sub21.anIntArray3799[i_16_] = i_17_ + 1;
                Class68_Sub8.anIntArrayArray2875[i_15_ + 1][i_17_ + 1] = 12;
                ObjectDefinition.anIntArrayArray2018[i_15_ + 1][i_17_ + 1] = i_20_;
                i_16_ = 0xfff & i_16_ + 1;
            }
        }
        Class32.anInt565 = 0;
        if (!bool_19_)
        {
            if (bool)
            {
                int i_21_ = 1000;
                int i_22_ = 100;
                int i_23_ = 10;
                for (int i_24_ = i_6_ - i_23_; i_23_ + i_6_ >= i_24_; i_24_++)
                {
                    for (int i_25_ = i - i_23_; i + i_23_ >= i_25_; i_25_++)
                    {
                        if (i_24_ >= 0 && i_25_ >= 0 && i_24_ < 104 && i_25_ < 104 && (ObjectDefinition.anIntArrayArray2018[i_24_][i_25_] < 100))
                        {
                            int i_26_ = 0;
                            if (i_24_ < i_6_)
                                i_26_ = i_6_ - i_24_;
                            else if (i_24_ > i_6_ - 1 + i_2_)
                                i_26_ = -i_6_ - i_2_ - (-1 - i_24_);
                            int i_27_ = 0;
                            if (i > i_25_)
                                i_27_ = i - i_25_;
                            else if (i_4_ - 1 + i < i_25_)
                                i_27_ = i_25_ + 1 - i_4_ - i;
                            int i_28_ = i_26_ * i_26_ + i_27_ * i_27_;
                            if (i_21_ > i_28_ || (i_28_ == i_21_ && (ObjectDefinition.anIntArrayArray2018[i_24_][i_25_]) < i_22_))
                            {
                                i_15_ = i_24_;
                                i_21_ = i_28_;
                                i_22_ = (ObjectDefinition.anIntArrayArray2018[i_24_][i_25_]);
                                i_17_ = i_25_;
                            }
                        }
                    }
                }
                if (i_21_ == 1000)
                    return false;
                if (i_10_ == i_15_ && i_5_ == i_17_)
                    return false;
                Class32.anInt565 = 1;
            } else
                return false;
        }
        i_18_ = 0;
        Class68_Sub13_Sub37.anIntArray4068[i_18_] = i_15_;
        Class68_Sub13_Sub21.anIntArray3799[i_18_++] = i_17_;
        int i_30_;
        int i_29_ = i_30_ = Class68_Sub8.anIntArrayArray2875[i_15_][i_17_];
        while (i_15_ != i_10_ || i_5_ != i_17_)
        {
            if (i_30_ != i_29_)
            {
                Class68_Sub13_Sub37.anIntArray4068[i_18_] = i_15_;
                i_30_ = i_29_;
                Class68_Sub13_Sub21.anIntArray3799[i_18_++] = i_17_;
            }
            if ((0x1 & i_29_) != 0)
                i_17_++;
            else if ((i_29_ & 0x4) != 0)
                i_17_--;
            if ((i_29_ & 0x2) == 0)
            {
                if ((0x8 & i_29_) != 0)
                    i_15_--;
            } else
                i_15_++;
            i_29_ = Class68_Sub8.anIntArrayArray2875[i_15_][i_17_];
        }
        if (i_18_ > 0)
        {
            Class58.method580(i_18_, i_8_, (byte) 127);
            return true;
        }
        if (i_8_ == 1)
            return false;
        return true;
    }

    private final void method1142(boolean bool, Stream class68_sub14, int i)
    {
        try
        {
            anInt4327++;
            if (bool != false)
                method1146(102);
            if (i != 1)
            {
                if (i == 2)
                {
                    int i_31_ = class68_sub14.readUByte();
                    ((Class68_Sub20_Sub11) this).anIntArray4340 = new int[i_31_];
                    ((Class68_Sub20_Sub11) this).anIntArray4328 = new int[i_31_];
                    for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
                    {
                        ((Class68_Sub20_Sub11) this).anIntArray4340[i_32_] = class68_sub14.readUShort();
                        int i_33_ = class68_sub14.readUByte();
                        if (i_33_ == 0)
                            ((Class68_Sub20_Sub11) this).anIntArray4328[i_32_] = -1;
                        else
                            ((Class68_Sub20_Sub11) this).anIntArray4328[i_32_] = i_33_;
                    }
                } else if (i == 3)
                {
                    int i_34_ = class68_sub14.readUByte();
                    ((Class68_Sub20_Sub11) this).anIntArray4329 = new int[i_34_];
                    ((Class68_Sub20_Sub11) this).anIntArray4337 = new int[i_34_];
                    for (int i_35_ = 0; i_35_ < i_34_; i_35_++)
                    {
                        ((Class68_Sub20_Sub11) this).anIntArray4329[i_35_] = class68_sub14.readUShort();
                        int i_36_ = class68_sub14.readUByte();
                        if (i_36_ != 0)
                            ((Class68_Sub20_Sub11) this).anIntArray4337[i_35_] = i_36_;
                        else
                            ((Class68_Sub20_Sub11) this).anIntArray4337[i_35_] = -1;
                    }
                }
            } else
                ((Class68_Sub20_Sub11) this).aClass100_4344 = class68_sub14.readString();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("kj.K(" + bool + ',' + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final void method1143(Stream class68_sub14, boolean bool)
    {
        try
        {
            anInt4343++;
            if (bool != true)
                aClass100_4336 = null;
            for (;;)
            {
                int i = class68_sub14.readUByte();
                if (i == 0)
                    break;
                method1142(false, class68_sub14, i);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "kj.G(" + (class68_sub14 != null ? "{...}" : "null") + ',' + bool + ')');
        }
    }

    final int method1144(int i, int i_37_)
    {
        anInt4341++;
        if (((Class68_Sub20_Sub11) this).anIntArray4340 == null)
            return -1;
        if (i_37_ < 113)
            method1148(74, -95, 56);
        for (int i_38_ = 0; ((Class68_Sub20_Sub11) this).anIntArray4340.length > i_38_; i_38_++)
        {
            if (((Class68_Sub20_Sub11) this).anIntArray4328[i_38_] == i)
                return ((Class68_Sub20_Sub11) this).anIntArray4340[i_38_];
        }
        return -1;
    }

    final void method1145(byte i)
    {
        if (i > -40)
            method1149(-35, null, -90, -21);
        anInt4324++;
        if (((Class68_Sub20_Sub11) this).anIntArray4329 != null)
        {
            for (int i_39_ = 0; i_39_ < ((Class68_Sub20_Sub11) this).anIntArray4329.length; i_39_++)
                ((Class68_Sub20_Sub11) this).anIntArray4329[i_39_] = Class70.OR((((Class68_Sub20_Sub11) this).anIntArray4329[i_39_]), 32768);
        }
        if (((Class68_Sub20_Sub11) this).anIntArray4340 != null)
        {
            for (int i_40_ = 0; ((Class68_Sub20_Sub11) this).anIntArray4340.length > i_40_; i_40_++)
                ((Class68_Sub20_Sub11) this).anIntArray4340[i_40_] = Class70.OR((((Class68_Sub20_Sub11) this).anIntArray4340[i_40_]), 32768);
        }
    }

    public static void method1146(int i)
    {
        aClass100_4336 = null;
        aClass100_4335 = null;
        aClass100_4333 = null;
        aClass100_4325 = null;
        if (i != 0)
            method1146(-25);
        aByteArrayArray4334 = null;
    }

    static final void method1147(int i, Widget class45, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_)
    {
        do
        {
            try
            {
                if (i_43_ != 25504)
                    aByteArrayArray4334 = null;
                anInt4332++;
                if (!Class30.aBoolean553)
                    Class68_Sub15.anInt3014 = 0;
                else
                    Class68_Sub15.anInt3014 = 32;
                Class30.aBoolean553 = false;
                if (Class68_Sub20_Sub12.anInt4354 != 0)
                {
                    if (i_46_ < i_44_ || i_46_ >= i_44_ + 16 || i_45_ < i || i + 16 <= i_45_)
                    {
                        if (i_46_ >= i_44_ && i_46_ < i_44_ + 16 && i_45_ >= i + i_41_ - 16 && i_45_ < i + i_41_)
                        {
                            ((Widget) class45).anInt818 += 4;
                            NodeCache.method1688(class45, -122);
                        } else if (i_44_ - Class68_Sub15.anInt3014 <= i_46_ && (i_46_ < i_44_ + 16 + Class68_Sub15.anInt3014) && i_45_ >= i + 16 && i + i_41_ - 16 > i_45_)
                        {
                            int i_47_ = i_41_ * (i_41_ - 32) / i_42_;
                            if (i_47_ < 8)
                                i_47_ = 8;
                            int i_48_ = i_41_ - i_47_ - 32;
                            int i_49_ = i_45_ - i - (i_47_ / 2 + 16);
                            ((Widget) class45).anInt818 = (i_42_ - i_41_) * i_49_ / i_48_;
                            NodeCache.method1688(class45, -114);
                            Class30.aBoolean553 = true;
                        }
                    } else
                    {
                        ((Widget) class45).anInt818 -= 4;
                        NodeCache.method1688(class45, i_43_ ^ ~0x63d0);
                    }
                }
                if (Class68_Sub13_Sub30.anInt3950 == 0)
                    break;
                int i_50_ = ((Widget) class45).anInt892;
                if (i_46_ < i_44_ - i_50_ || i_45_ < i || i_44_ + 16 <= i_46_ || i_45_ > i_41_ + i)
                    break;
                ((Widget) class45).anInt818 += Class68_Sub13_Sub30.anInt3950 * 45;
                NodeCache.method1688(class45, -120);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("kj.E(" + i + ',' + (class45 != null ? "{...}" : "null") + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ')'));
            }
            break;
        } while (false);
    }

    static final int method1148(int i, int i_51_, int i_52_)
    {
        anInt4326++;
        Class68_Sub22 class68_sub22 = ((Class68_Sub22) Class68_Sub13_Sub8.aClass113_3566.method1684((long) i_52_, -125));
        if (class68_sub22 == null)
            return 0;
        if (i_51_ == -1)
            return 0;
        int i_53_ = i;
        for (int i_54_ = 0; i_54_ < ((Class68_Sub22) class68_sub22).anIntArray3143.length; i_54_++)
        {
            if (i_51_ == ((Class68_Sub22) class68_sub22).anIntArray3146[i_54_])
                i_53_ += ((Class68_Sub22) class68_sub22).anIntArray3143[i_54_];
        }
        return i_53_;
    }

    public Class68_Sub20_Sub11()
    {
        /* empty */
    }

    static final void method1149(int i, Widget class45, int i_55_, int i_56_)
    {
        do
        {
            try
            {
                anInt4339++;
                if ((Class68_Sub9.anInt2884 == 0 || Class68_Sub9.anInt2884 == 3) && class45.method497(2663))
                {
                    int i_57_ = ((Widget) class45).anIntArray854[i_55_];
                    if (i_56_ >= i_57_ && i_56_ <= (((Widget) class45).anIntArray783[i_55_] + i_57_))
                    {
                        i_56_ -= ((Widget) class45).anInt892 / 2;
                        i_55_ -= ((Widget) class45).anInt873 / 2;
                        int i_58_ = (Class68_Sub13_Sub26.minimapInt1 + Class8.minimapInt2 & 0x7ff);
                        int i_59_ = Class62.PRECOMUPTED_COSINE_CACHE[i_58_];
                        i_59_ = (i_59_ * (Class68_Sub20_Sub16.minimapInt3 + 256) >> 8);
                        int i_60_ = 53 % ((4 - i) / 50);
                        int i_61_ = Class62.PRECOMPUTED_SINE_CACHE[i_58_];
                        i_61_ = ((Class68_Sub20_Sub16.minimapInt3 + 256) * i_61_ >> 8);
                        int i_62_ = i_59_ * i_55_ - i_56_ * i_61_ >> 11;
                        int i_63_ = i_59_ * i_56_ + i_55_ * i_61_ >> 11;
                        int i_64_ = ((((Character) Class68_Sub7.localPlayer).y) - i_62_ >> 7);
                        int i_65_ = (i_63_ + (((Character) Class68_Sub7.localPlayer).x) >> 7);
                        if (Class68_Sub13_Sub13.anInt3665 > 0 && NodeSubList.aBooleanArray2230[82] && NodeSubList.aBooleanArray2230[81])
                            Class51.method539(Class36.baseX + i_65_, GameSocket.plane, i_64_ + (Class68_Sub13_Sub35.baseY), 24867);
                        else
                        {
                            boolean bool = (Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 0, 0, i_64_, true, 0, -3, 1, i_65_));
                            if (!bool)
                                break;
                            Class21.connectionVector.writeByte(i_56_);
                            Class21.connectionVector.writeByte(i_55_);
                            Class21.connectionVector.writeShort(Class8.minimapInt2);
                            Class21.connectionVector.writeByte(57);
                            Class21.connectionVector.writeByte(Class68_Sub13_Sub26.minimapInt1);
                            Class21.connectionVector.writeByte(Class68_Sub20_Sub16.minimapInt3);
                            Class21.connectionVector.writeByte(89);
                            Class21.connectionVector.writeShort((((Character) Class68_Sub7.localPlayer).x));
                            Class21.connectionVector.writeShort((((Character) Class68_Sub7.localPlayer).y));
                            Class21.connectionVector.writeByte(Class32.anInt565);
                            Class21.connectionVector.writeByte(63);
                        }
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("kj.J(" + i + ',' + (class45 != null ? "{...}" : "null") + ',' + i_55_ + ',' + i_56_ + ')'));
            }
            break;
        } while (false);
    }

    static
    {
        aClass100_4325 = Class112.makeMutableString(43, ":duelstake:");
        aClass100_4336 = Class112.makeMutableString(43, "<col=ff7000>");
        aClass100_4333 = Class112.makeMutableString(43, "::qa_op_test");
    }
}
