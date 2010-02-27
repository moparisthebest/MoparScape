/* Class68_Sub13_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub33 extends Class68_Sub13
{
    static MutableString aClass100_3989;
    static int anInt3990;
    static int anInt3991;
    static int anInt3992;
    static PlayerDefinition aClass126_3993;
    static int anInt3994;
    static int anInt3995;
    static int anInt3996;
    static int anInt3997;
    private static MutableString aClass100_3998 = Class112.makeMutableString(43, "Walk here");
    static int anInt3999;
    private int anInt4000 = 32768;
    static Class114 aClass114_4001;
    static boolean aBoolean4002;
    static int anInt4003;

    final int[] method698(byte i, int i_0_)
    {
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_0_);
        anInt3996++;
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int[] is_1_ = this.method696(1, i_0_, i + 29210);
            int[] is_2_ = this.method696(2, i_0_, 29149);
            for (int i_3_ = 0; Class68_Sub13_Sub19.anInt3748 > i_3_; i_3_++)
            {
                int i_4_ = 0xff & is_1_[i_3_] >> 4;
                int i_5_ = anInt4000 * is_2_[i_3_] >> 12;
                int i_6_ = Class78.anIntArray1396[i_4_] * i_5_ >> 12;
                int i_7_ = Class30.anInt543 & (i_6_ >> 12) + i_3_;
                int i_8_ = i_5_ * Class118.anIntArray2079[i_4_] >> 12;
                int i_9_ = Player.anInt3434 & (i_8_ >> 12) + i_0_;
                int[] is_10_ = this.method696(0, i_9_, i ^ ~0x71e1);
                is[i_3_] = is_10_[i_7_];
            }
        }
        if (i != -61)
            method865((byte) -71, true);
        return is;
    }

    static final void method865(byte i, boolean bool)
    {
        anInt3994++;
        int i_11_ = 4;
        byte[][] is = Class68_Sub20_Sub11.aByteArrayArray4334;
        if (i >= -8)
            method866(68);
        for (int i_12_ = 0; i_11_ > i_12_; i_12_++)
        {
            Class49.method524(16322);
            for (int i_13_ = 0; i_13_ < 13; i_13_++)
            {
                for (int i_14_ = 0; i_14_ < 13; i_14_++)
                {
                    int i_15_ = (Class68_Sub2.anIntArrayArrayArray2798[i_12_][i_13_][i_14_]);
                    if (i_15_ != -1)
                    {
                        int i_16_ = (0x397e498 & i_15_) >> 24;
                        if (!bool || i_16_ == 0)
                        {
                            int i_17_ = i_15_ >> 1 & 0x3;
                            int i_18_ = 0x3ff & i_15_ >> 14;
                            int i_19_ = i_15_ >> 3 & 0x7ff;
                            int i_20_ = i_19_ / 8 + (i_18_ / 8 << 8);
                            for (int i_21_ = 0; i_21_ < Class119.mapDataAreas.length; i_21_++)
                            {
                                if (i_20_ == Class119.mapDataAreas[i_21_] && is[i_21_] != null)
                                {
                                    GameException.method1803(i_12_, bool, 8 * (0x7 & i_19_), 8 * i_13_, i_17_, (i_18_ & 0x7) * 8, is[i_21_], i_16_, Class109.groundDataArray, 73, i_14_ * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void method690(byte i)
    {
        anInt3992++;
        Class68_Sub10.method683((byte) 96);
        if (i > -22)
            anInt4003 = 51;
    }

    public Class68_Sub13_Sub33()
    {
        super(3, false);
    }

    final void method700(Stream class68_sub14, int i, int i_22_)
    {
        try
        {
            if (i_22_ != -1)
                aClass100_3998 = null;
            int i_23_ = i;
            do
            {
                if (i_23_ != 0)
                {
                    if (i_23_ != 1)
                        break;
                } else
                {
                    anInt4000 = class68_sub14.readUShort() << 4;
                    break;
                }
                ((Class68_Sub13) this).aBoolean2933 = class68_sub14.readUByte() == 1;
            } while (false);
            anInt3990++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("te.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_22_ + ')'));
        }
    }

    public static void method866(int i)
    {
        aClass126_3993 = null;
        if (i <= -3)
        {
            aClass114_4001 = null;
            aClass100_3998 = null;
            aClass100_3989 = null;
        }
    }

    static final void method867(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, boolean bool)
    {
        Stream.cameraPositionX_local = i;
        Class125.cameraTurnSpeed_local = i_26_;
        Class68_Sub13_Sub31.cameraPositionZ_local = i_28_;
        anInt3991++;
        if (i_27_ >= -83)
            method868(-36, 33, 16);
        Class68_Sub13_Sub37.cameraPositionY_local = i_24_;
        Class68_Sub24.cameraTurnStep_local = i_25_;
        if (bool && Class68_Sub24.cameraTurnStep_local >= 100)
        {
            Class85.cameraPositionY = 128 * Class68_Sub13_Sub37.cameraPositionY_local + 64;
            Class68_Sub7.cameraPositionX = 128 * Stream.cameraPositionX_local + 64;
            Class68_Sub5.cameraPositionZ = (Player.fixZ(Class68_Sub7.cameraPositionX, GameSocket.plane, Class85.cameraPositionY) - Class68_Sub13_Sub31.cameraPositionZ_local);
        }
        NodeSubList.anInt2216 = 2;
    }

    static final void method868(int i, int i_29_, int i_30_)
    {
        anInt3997++;
        int i_31_ = 0;
        if (i_30_ <= 54)
            aClass114_4001 = null;
        for (/**/; i_31_ < Class112.anInt1881; i_31_++)
        {
            Class9 class9 = Class94.method1547((byte) 53, i_31_);
            if (class9 != null)
            {
                int i_32_ = ((Class9) class9).anInt175;
                if (i_32_ >= 0 && !Class62.anInterface4_1159.method8((byte) 39, i_32_))
                    i_32_ = -1;
                int i_33_;
                if (((Class9) class9).anInt172 < 0)
                {
                    if (i_32_ >= 0)
                        i_33_ = (Class62.anIntArray1158[Class53.method547((byte) -91, Class62.anInterface4_1159.method12(i_32_, 102), 96)]);
                    else if (((Class9) class9).anInt168 == -1)
                        i_33_ = -1;
                    else
                    {
                        int i_34_ = ((Class9) class9).anInt168;
                        int i_35_ = i + (0x7f & i_34_);
                        if (i_35_ < 0)
                            i_35_ = 0;
                        else if (i_35_ > 127)
                            i_35_ = 127;
                        int i_36_ = i_35_ + ((i_34_ + i_29_ & 0xfc00) + (0x380 & i_34_));
                        i_33_ = (Class62.anIntArray1158[Class53.method547((byte) -91, i_36_, 96)]);
                    }
                } else
                {
                    int i_37_ = ((Class9) class9).anInt172;
                    int i_38_ = (0x7f & i_37_) + i;
                    if (i_38_ < 0)
                        i_38_ = 0;
                    else if (i_38_ > 127)
                        i_38_ = 127;
                    int i_39_ = (0x380 & i_37_) + ((0xfc00 & i_29_ + i_37_) + i_38_);
                    i_33_ = Class62.anIntArray1158[Class53.method547((byte) -91, i_39_, 96)];
                }
                Class121.anIntArray2106[i_31_ + 1] = i_33_;
            }
        }
    }

    final int[][] method697(int i, boolean bool)
    {
        anInt3995++;
        if (bool != true)
            aClass114_4001 = null;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -115);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[] is_40_ = this.method696(1, i, 29149);
            int[] is_41_ = this.method696(2, i, 29149);
            int[] is_42_ = is[0];
            int[] is_43_ = is[1];
            int[] is_44_ = is[2];
            for (int i_45_ = 0; Class68_Sub13_Sub19.anInt3748 > i_45_; i_45_++)
            {
                int i_46_ = (is_40_[i_45_] * 255 & 0xff0d5) >> 12;
                int i_47_ = anInt4000 * is_41_[i_45_] >> 12;
                int i_48_ = i_47_ * Class78.anIntArray1396[i_46_] >> 12;
                int i_49_ = Class30.anInt543 & i_45_ + (i_48_ >> 12);
                int i_50_ = Class118.anIntArray2079[i_46_] * i_47_ >> 12;
                int i_51_ = Player.anInt3434 & i + (i_50_ >> 12);
                int[][] is_52_ = this.method699(-57, 0, i_51_);
                is_42_[i_45_] = is_52_[0][i_49_];
                is_43_[i_45_] = is_52_[1][i_49_];
                is_44_[i_45_] = is_52_[2][i_49_];
            }
        }
        return is;
    }

    static
    {
        aClass100_3989 = aClass100_3998;
        aClass126_3993 = new PlayerDefinition();
        aClass114_4001 = new Class114();
        aBoolean4002 = false;
    }
}
