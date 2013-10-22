/* Class68_Sub13_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub35 extends Class68_Sub13
{
    static int anInt4018;
    static int anInt4019;
    private int anInt4020 = 0;
    static int anInt4021;
    static int anInt4022;
    static MutableString aClass100_4023 = Class112.makeMutableString(43, "mapflag");
    static int[] anIntArray4024 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154,
            155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98,
            98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };
    static short[] aShortArray4025;
    private int anInt4026 = 1365;
    private int anInt4027 = 20;
    static int baseY;
    private int anInt4029 = 0;
    static byte[][][] aByteArrayArrayArray4030;
    static int anInt4031;

    public Class68_Sub13_Sub35()
    {
        super(0, true);
    }

    static final int method876(int i, int i_0_, int i_1_)
    {
        anInt4031++;
        Class68_Sub22 class68_sub22 = ((Class68_Sub22) Class68_Sub13_Sub8.aClass113_3566.method1684((long) i_0_, i_1_ ^ ~0x5074));
        if (i_1_ != 20558)
            method877((byte) 96, null);
        if (class68_sub22 == null)
            return 0;
        if (i < 0 || ((Class68_Sub22) class68_sub22).anIntArray3143.length <= i)
            return 0;
        return ((Class68_Sub22) class68_sub22).anIntArray3143[i];
    }

    static final void method877(byte i, Stream class68_sub14)
    {
        do
        {
            try
            {
                while (((Stream) class68_sub14).position < (((Stream) class68_sub14).buffer).length)
                {
                    int i_2_ = 0;
                    boolean bool = false;
                    int i_3_ = 0;
                    if (class68_sub14.readUByte() == 1)
                    {
                        i_2_ = class68_sub14.readUByte();
                        i_3_ = class68_sub14.readUByte();
                        bool = true;
                    }
                    int i_4_ = class68_sub14.readUByte();
                    int i_5_ = class68_sub14.readUByte();
                    int i_6_ = 64 * i_4_ - Class70.anInt1273;
                    int i_7_ = (Class103.anInt1770 - (1 - Ground.anInt2762) - 64 * i_5_);
                    if (i_6_ < 0 || i_7_ - 63 < 0 || i_6_ + 63 >= Class68_Sub6.anInt2848 || Class103.anInt1770 <= i_7_)
                    {
                        for (int i_8_ = 0; i_8_ < (!bool ? 4096 : 64); i_8_++)
                        {
                            byte i_9_ = class68_sub14.readByte();
                            if (i_9_ != 0)
                                ((Stream) class68_sub14).position++;
                        }
                    } else
                    {
                        int i_10_ = i_6_ >> 6;
                        int i_11_ = i_7_ >> 6;
                        for (int i_12_ = 0; i_12_ < 64; i_12_++)
                        {
                            for (int i_13_ = 0; i_13_ < 64; i_13_++)
                            {
                                if (!bool || (i_2_ * 8 <= i_12_ && i_12_ < 8 * i_2_ + 8 && i_3_ * 8 <= i_13_ && i_3_ * 8 + 8 > i_13_))
                                {
                                    byte i_14_ = class68_sub14.readByte();
                                    if (i_14_ != 0)
                                    {
                                        if ((Class48.aByteArrayArrayArray949[i_10_][i_11_]) == null)
                                            Class48.aByteArrayArrayArray949[i_10_][i_11_] = new byte[4096];
                                        Class48.aByteArrayArrayArray949[i_10_][i_11_][(63 - i_13_ << 6) + i_12_] = i_14_;
                                        byte i_15_ = class68_sub14.readByte();
                                        if ((Class49.aByteArrayArrayArray970[i_10_][i_11_]) == null)
                                            Class49.aByteArrayArrayArray970[i_10_][i_11_] = new byte[4096];
                                        Class49.aByteArrayArrayArray970[i_10_][i_11_][i_12_ + (63 - i_13_ << 6)] = i_15_;
                                    }
                                }
                            }
                        }
                    }
                }
                anInt4022++;
                if (i == 69)
                    break;
                aShortArray4025 = null;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("va.C(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final void method700(Stream class68_sub14, int i, int i_16_)
    {
        while_170_: do
        {
            try
            {
                anInt4018++;
                if (i_16_ != -1)
                    anInt4020 = -80;
                int i_17_ = i;
                while_169_: do
                {
                    while_168_: do
                    {
                        do
                        {
                            if (i_17_ != 0)
                            {
                                if (i_17_ == 1)
                                    break;
                                if (i_17_ == 2)
                                    break while_168_;
                                if (i_17_ != 3)
                                    break while_170_;
                                if (client.anInt2387 == 0)
                                    break while_169_;
                            }
                            anInt4026 = class68_sub14.readUShort();
                            return;
                        } while (false);
                        anInt4027 = class68_sub14.readUShort();
                        return;
                    } while (false);
                    anInt4029 = class68_sub14.readUShort();
                    return;
                } while (false);
                anInt4020 = class68_sub14.readUShort();
                break;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("va.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ')'));
            }
        } while (false);
    }

    final int[] method698(byte i, int i_18_)
    {
        if (i != -61)
            aByteArrayArrayArray4030 = null;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_18_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            for (int i_19_ = 0; Class68_Sub13_Sub19.anInt3748 > i_19_; i_19_++)
            {
                int i_20_ = anInt4029 + (Class68_Sub13_Sub3.anIntArray3481[i_19_] << 12) / anInt4026;
                int i_21_ = anInt4020 + (Class13_Sub3.anIntArray2674[i_18_] << 12) / anInt4026;
                int i_22_ = i_20_;
                int i_23_ = i_21_;
                int i_24_ = i_20_;
                int i_25_ = i_21_;
                int i_26_ = 0;
                int i_27_ = i_21_ * i_21_ >> 12;
                for (int i_28_ = i_20_ * i_20_ >> 12; i_28_ + i_27_ < 16384 && anInt4027 > i_26_; i_27_ = i_25_ * i_25_ >> 12)
                {
                    i_26_++;
                    i_25_ = i_23_ + (i_25_ * i_24_ >> 12) * 2;
                    i_24_ = i_22_ + i_28_ - i_27_;
                    i_28_ = i_24_ * i_24_ >> 12;
                }
                is[i_19_] = i_26_ >= anInt4027 - 1 ? 0 : (i_26_ << 12) / anInt4027;
            }
        }
        anInt4019++;
        return is;
    }

    static final void method878(byte i, int i_29_)
    {
        anInt4021++;
        Class68_Sub13.method701(0);
        Class68_Sub13_Sub34.method870(i - 65);
        int i_30_ = ((Class32) Class68_Sub13_Sub23.method813(-85, i_29_)).anInt564;
        if (i_30_ != 0)
        {
            int i_31_ = Class103.settingArray[i_29_];
            if (i == 67)
            {
                if (i_30_ == 9)
                    Class108.anInt1826 = i_31_;
                if (i_30_ == 6)
                    Class68_Sub13_Sub19.anInt3757 = i_31_;
                if (i_30_ == 5)
                    Class14.anInt228 = i_31_;
            }
        }
    }

    public static void method879(byte i)
    {
        aShortArray4025 = null;
        aByteArrayArrayArray4030 = null;
        if (i < -121)
        {
            anIntArray4024 = null;
            aClass100_4023 = null;
        }
    }
}
