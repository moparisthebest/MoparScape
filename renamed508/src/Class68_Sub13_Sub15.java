import java.util.Arrays;

/* Class68_Sub13_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub15 extends Class68_Sub13
{
    private int anInt3679 = 3216;
    static int anInt3680;
    static int[] anIntArray3681;
    static int anInt3682;
    static int anInt3683;
    private int anInt3684;
    static int anInt3685;
    private int[] anIntArray3686;
    static int anInt3687;
    static int anInt3688;
    static int anInt3689;
    private int anInt3690 = 4096;
    static int anInt3691;
    static int anInt3692;
    static int anInt3693;
    static int anInt3694;
    static int anInt3695;

    final void method690(byte i)
    {
        if (i < -22)
        {
            method765((byte) -23);
            anInt3685++;
        }
    }

    static final void method764(int i, int i_0_, boolean bool)
    {
        if (i != Class68_Sub13_Sub19.anInt3748)
        {
            Class68_Sub13_Sub3.anIntArray3481 = new int[i];
            for (int i_1_ = 0; i_1_ < i; i_1_++)
                Class68_Sub13_Sub3.anIntArray3481[i_1_] = (i_1_ << 12) / i;
            Class68_Sub20_Sub13_Sub2.anInt4622 = i == 64 ? 2048 : 4096;
            Class30.anInt543 = i - 1;
            Class68_Sub13_Sub19.anInt3748 = i;
        }
        anInt3695++;
        if (i_0_ != Ground.anInt2777)
        {
            if (i_0_ != Class68_Sub13_Sub19.anInt3748)
            {
                Class13_Sub3.anIntArray2674 = new int[i_0_];
                for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
                    Class13_Sub3.anIntArray2674[i_2_] = (i_2_ << 12) / i_0_;
            } else
                Class13_Sub3.anIntArray2674 = Class68_Sub13_Sub3.anIntArray3481;
            Player.anInt3434 = i_0_ - 1;
            Ground.anInt2777 = i_0_;
        }
        if (bool != true)
            method767(81, 122, -111);
    }

    public Class68_Sub13_Sub15()
    {
        super(1, true);
        anIntArray3686 = new int[3];
        anInt3684 = 3216;
    }

    private final void method765(byte i)
    {
        double d = Math.cos((double) ((float) anInt3679 / 4096.0F));
        anInt3692++;
        anIntArray3686[0] = (int) (Math.sin((double) ((float) anInt3684 / 4096.0F)) * d * 4096.0);
        anIntArray3686[1] = (int) (d * Math.cos((double) ((float) anInt3684 / 4096.0F)) * 4096.0);
        anIntArray3686[2] = (int) (4096.0 * Math.sin((double) ((float) anInt3679 / 4096.0F)));
        int i_3_ = anIntArray3686[1] * anIntArray3686[1] >> 12;
        int i_4_ = anIntArray3686[2] * anIntArray3686[2] >> 12;
        int i_5_ = anIntArray3686[0] * anIntArray3686[0] >> 12;
        int i_6_ = (int) (4096.0 * Math.sqrt((double) (i_4_ + i_3_ + i_5_ >> 12)));
        if (i != -23)
            method766(3, -86L);
        if (i_6_ != 0)
        {
            anIntArray3686[2] = (anIntArray3686[2] << 12) / i_6_;
            anIntArray3686[0] = (anIntArray3686[0] << 12) / i_6_;
            anIntArray3686[1] = (anIntArray3686[1] << 12) / i_6_;
        }
    }

    static final void method766(int i, long l)
    {
        anInt3682++;
        if (l != 0L)
        {
            int i_7_ = 0;
            if (i != 23136)
                method770((byte) -1);
            for (/**/; i_7_ < Class32.friendCount; i_7_++)
            {
                if (Class68_Sub13_Sub21.friendList[i_7_] == l)
                {
                    Class66.anInt1201++;
                    Class32.friendCount--;
                    for (int i_8_ = i_7_; Class32.friendCount > i_8_; i_8_++)
                    {
                        Class68_Sub13_Sub38.aClass100Array4086[i_8_] = Class68_Sub13_Sub38.aClass100Array4086[i_8_ + 1];
                        MRUNodes.friendNodeIDs[i_8_] = MRUNodes.friendNodeIDs[i_8_ + 1];
                        Ground.aClass100Array2756[i_8_] = Ground.aClass100Array2756[i_8_ + 1];
                        Class68_Sub13_Sub21.friendList[i_8_] = Class68_Sub13_Sub21.friendList[i_8_ + 1];
                        Class68_Sub4.anIntArray2830[i_8_] = Class68_Sub4.anIntArray2830[i_8_ + 1];
                        Class68_Sub13_Sub29.aBooleanArray3943[i_8_] = Class68_Sub13_Sub29.aBooleanArray3943[i_8_ + 1];
                    }
                    Keyboard.anInt2132 = Class68_Sub22.anInt3150;
                    Class21.connectionVector.startPacket(132);
                    Class21.connectionVector.writeLong(l);
                    break;
                }
            }
        }
    }

    static final void method767(int i, int i_9_, int i_10_)
    {
        Class103.settingArray[i] = i_9_;
        anInt3687++;
        Class68_Sub15 class68_sub15 = (Class68_Sub15) Class37.aClass113_646.method1684((long) i, -123);
        do
        {
            if (class68_sub15 != null)
            {
                ((Class68_Sub15) class68_sub15).aLong3016 = Class36.method438(17161) + 500L;
                if (client.anInt2387 == 0)
                    break;
            }
            class68_sub15 = new Class68_Sub15(Class36.method438(17161) + 500L);
            Class37.aClass113_646.method1683((byte) 126, class68_sub15, (long) i);
        } while (false);
        int i_11_ = 97 % ((34 - i_10_) / 52);
    }

    final void method700(Stream class68_sub14, int i, int i_12_)
    {
        try
        {
            int i_13_ = i;
            while_72_: do
            {
                do
                {
                    if (i_13_ != 0)
                    {
                        if (i_13_ != 1)
                        {
                            if (i_13_ == 2)
                                break;
                            break while_72_;
                        }
                    } else
                    {
                        anInt3690 = class68_sub14.readUShort();
                        break while_72_;
                    }
                    anInt3684 = class68_sub14.readUShort();
                    break while_72_;
                } while (false);
                anInt3679 = class68_sub14.readUShort();
            } while (false);
            if (i_12_ != -1)
                anInt3679 = 123;
            anInt3680++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ii.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_12_ + ')'));
        }
    }

    final int[] method698(byte i, int i_14_)
    {
        anInt3688++;
        if (i != -61)
            anInt3690 = 7;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_14_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_15_ = Class68_Sub20_Sub13_Sub2.anInt4622 * anInt3690 >> 12;
            int[] is_16_ = this.method696(0, Player.anInt3434 & i_14_ - 1, 29149);
            int[] is_17_ = this.method696(0, i_14_, 29149);
            int[] is_18_ = this.method696(0, i_14_ + 1 & Player.anInt3434, 29149);
            for (int i_19_ = 0; Class68_Sub13_Sub19.anInt3748 > i_19_; i_19_++)
            {
                int i_20_ = ((is_17_[i_19_ - 1 & Class30.anInt543] - is_17_[i_19_ + 1 & Class30.anInt543]) * i_15_ >> 12);
                int i_21_ = (is_18_[i_19_] - is_16_[i_19_]) * i_15_ >> 12;
                int i_22_ = i_20_ >> 4;
                int i_23_ = i_21_ >> 4;
                if (i_22_ < 0)
                    i_22_ = -i_22_;
                if (i_23_ < 0)
                    i_23_ = -i_23_;
                if (i_22_ > 255)
                    i_22_ = 255;
                if (i_23_ > 255)
                    i_23_ = 255;
                int i_24_ = ((CachedItem.aByteArray4446[i_22_ + ((i_23_ + 1) * i_23_ >> 1)]) & 0xff);
                int i_25_ = i_20_ * i_24_ >> 8;
                int i_26_ = 4096 * i_24_ >> 8;
                i_25_ = i_25_ * anIntArray3686[0] >> 12;
                i_26_ = anIntArray3686[2] * i_26_ >> 12;
                int i_27_ = i_24_ * i_21_ >> 8;
                i_27_ = i_27_ * anIntArray3686[1] >> 12;
                is[i_19_] = i_27_ + (i_25_ + i_26_);
            }
        }
        return is;
    }

    static final void parseMapData(boolean bool)
    {
        Class36.aBoolean640 = bool;
        if (!Class36.aBoolean640)
        {
            int coordX = Class68_Sub13_Sub8.connectionVector.readUShortA();
            int py = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            int px = Class68_Sub13_Sub8.connectionVector.readUShortA();
            int mapdata_chunks = ((Class106.packetSize - ((Stream) Class68_Sub13_Sub8.connectionVector).position) / 16);
            Class68_Sub20_Sub6.mapData = new int[mapdata_chunks][4];
            for (int idx = 0; idx < mapdata_chunks; idx++)
            {
                for (int i = 0; i < 4; i++)
                    // unrenamed mapData field: fe.Z [[I
                    Class68_Sub20_Sub6.mapData[idx][i] = Class68_Sub13_Sub8.connectionVector.readInteger();
                System.out.printf("mapData[%d] = %s\n", idx, Arrays.toString(Class68_Sub20_Sub6.mapData[idx]));
            }
            boolean bool_34_ = false;
            int plane = Class68_Sub13_Sub8.connectionVector.readUByteC();
            int coordY = Class68_Sub13_Sub8.connectionVector.readUShort();
            System.out.printf("x,y,p = {%d,%d,%d} hash = %d\n", coordX, coordY, plane, (coordX << 8) | coordY);
            Class119.mapDataAreas = new int[mapdata_chunks];
            Class23.aByteArrayArray490 = new byte[mapdata_chunks][];
            NPCDefinition.anIntArray1408 = null;
            Class7.aByteArrayArray133 = null;
            if ((coordX / 8 == 48 || coordX / 8 == 49) && coordY / 8 == 48)
                bool_34_ = true;
            Class68_Sub13_Sub29.mapDataLandIndices = new int[mapdata_chunks];
            Class68_Sub20_Sub11.aByteArrayArray4334 = new byte[mapdata_chunks][];
            if (coordX / 8 == 48 && coordY / 8 == 148)
                bool_34_ = true;
            Class96.mapDataAreaIndices = new int[mapdata_chunks];
            mapdata_chunks = 0;
            for (int x = (coordX - 6) / 8; (coordX + 6) / 8 >= x; x++)
            {
                for (int y = (coordY - 6) / 8; (coordY + 6) / 8 >= y; y++)
                {
                    int pos = (x << 8) + y;
                    if (!bool_34_ || (y != 49 && y != 149 && y != 147 && x != 50 && (x != 49 || y != 47)))
                    {
                        Class119.mapDataAreas[mapdata_chunks] = pos;
                        // string pushed is m{x}_{y}
                        Class96.mapDataAreaIndices[mapdata_chunks] = (Class92.aClass21_Sub1_1646.getIndex((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class83.aClass100_1527, Class68_Sub13_Sub24.method816(x, 0), Class68_Sub20_Sub5.aClass100_4225, Class68_Sub13_Sub24.method816(y, 0) }))), (byte) -82));
                        // string pushed is l{x}_{y}
                        Class68_Sub13_Sub29.mapDataLandIndices[mapdata_chunks] = (Class92.aClass21_Sub1_1646.getIndex((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub20_Sub16.aClass100_4426, Class68_Sub13_Sub24.method816(x, 0), Class68_Sub20_Sub5.aClass100_4225, Class68_Sub13_Sub24.method816(y, 0) }))), (byte) -88));
                    } else
                    {
                        Class119.mapDataAreas[mapdata_chunks] = pos;
                        Class96.mapDataAreaIndices[mapdata_chunks] = -1;
                        Class68_Sub13_Sub29.mapDataLandIndices[mapdata_chunks] = -1;
                    }
                    mapdata_chunks++;
                }
            }
            RandomNumberGenerator.method1461(py, plane, false, px, coordX, coordY);
        } else
        {
            int i_40_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
            int i_41_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_42_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
            Class68_Sub13_Sub8.connectionVector.bitAccess();
            for (int i_43_ = 0; i_43_ < 4; i_43_++)
            {
                for (int i_44_ = 0; i_44_ < 13; i_44_++)
                {
                    for (int i_45_ = 0; i_45_ < 13; i_45_++)
                    {
                        int i_46_ = Class68_Sub13_Sub8.connectionVector.readBits(1);
                        if (i_46_ == 1)
                            Class68_Sub2.anIntArrayArrayArray2798[i_43_][i_44_][i_45_] = Class68_Sub13_Sub8.connectionVector.readBits(26);
                        else
                            Class68_Sub2.anIntArrayArrayArray2798[i_43_][i_44_][i_45_] = -1;
                    }
                }
            }
            Class68_Sub13_Sub8.connectionVector.byteAccess();
            int i_47_ = ((Class106.packetSize - ((Stream) Class68_Sub13_Sub8.connectionVector).position) / 16);
            Class68_Sub20_Sub6.mapData = new int[i_47_][4];
            for (int i_48_ = 0; i_48_ < i_47_; i_48_++)
            {
                for (int i_49_ = 0; i_49_ < 4; i_49_++)
                    // unrenamed mapData field: fe.Z [[I
                    Class68_Sub20_Sub6.mapData[i_48_][i_49_] = Class68_Sub13_Sub8.connectionVector.readLEInteger();
            }
            int i_50_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
            int i_51_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
            Class68_Sub20_Sub11.aByteArrayArray4334 = new byte[i_47_][];
            Class7.aByteArrayArray133 = null;
            Class96.mapDataAreaIndices = new int[i_47_];
            NPCDefinition.anIntArray1408 = null;
            Class119.mapDataAreas = new int[i_47_];
            Class23.aByteArrayArray490 = new byte[i_47_][];
            Class68_Sub13_Sub29.mapDataLandIndices = new int[i_47_];
            i_47_ = 0;
            for (int i_52_ = 0; i_52_ < 4; i_52_++)
            {
                for (int i_53_ = 0; i_53_ < 13; i_53_++)
                {
                    for (int i_54_ = 0; i_54_ < 13; i_54_++)
                    {
                        int i_55_ = (Class68_Sub2.anIntArrayArrayArray2798[i_52_][i_53_][i_54_]);
                        if (i_55_ != -1)
                        {
                            int i_56_ = 0x3ff & i_55_ >> 14;
                            int i_57_ = (i_55_ & 0x3fff) >> 3;
                            int i_58_ = i_57_ / 8 + (i_56_ / 8 << 8);
                            for (int i_59_ = 0; i_59_ < i_47_; i_59_++)
                            {
                                if (Class119.mapDataAreas[i_59_] == i_58_)
                                {
                                    i_58_ = -1;
                                    break;
                                }
                            }
                            if (i_58_ != -1)
                            {
                                int i_60_ = (i_58_ & 0xff02) >> 8;
                                int i_61_ = i_58_ & 0xff;
                                Class119.mapDataAreas[i_47_] = i_58_;
                                Class96.mapDataAreaIndices[i_47_] = (Class92.aClass21_Sub1_1646.getIndex((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class83.aClass100_1527, Class68_Sub13_Sub24.method816(i_60_, 0), Class68_Sub20_Sub5.aClass100_4225, (Class68_Sub13_Sub24.method816(i_61_, Class15.method278(95, 95))) }))), (byte) -99));
                                Class68_Sub13_Sub29.mapDataLandIndices[i_47_] = (Class92.aClass21_Sub1_1646.getIndex((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub20_Sub16.aClass100_4426), Class68_Sub13_Sub24.method816(i_60_, 0), Class68_Sub20_Sub5.aClass100_4225, Class68_Sub13_Sub24.method816(i_61_, 0) }))), (byte) -88));
                                i_47_++;
                            }
                        }
                    }
                }
            }
            RandomNumberGenerator.method1461(i_50_, i_40_, false, i_42_, i_51_, i_41_);
        }
        anInt3694++;
    }

    public static void method769(byte i)
    {
        if (i < 6)
            anIntArray3681 = null;
        anIntArray3681 = null;
    }

    static final void method770(byte i)
    {
        do
        {
            if (Class68_Sub13_Sub27.aFloat3915 > Class68_Sub9.aFloat2894)
            {
                Class68_Sub9.aFloat2894 += (double) Class68_Sub9.aFloat2894 / 30.0;
                if (Class68_Sub13_Sub27.aFloat3915 < Class68_Sub9.aFloat2894)
                    Class68_Sub9.aFloat2894 = Class68_Sub13_Sub27.aFloat3915;
                NodeSubList.method1788(-1);
                if (client.anInt2387 == 0)
                    break;
            }
            if (Class68_Sub13_Sub27.aFloat3915 < Class68_Sub9.aFloat2894)
            {
                Class68_Sub9.aFloat2894 -= (double) Class68_Sub9.aFloat2894 / 30.0;
                if (Class68_Sub13_Sub27.aFloat3915 > Class68_Sub9.aFloat2894)
                    Class68_Sub9.aFloat2894 = Class68_Sub13_Sub27.aFloat3915;
                NodeSubList.method1788(-1);
            }
        } while (false);
        anInt3693++;
        if (Class3.anInt85 != -1 && Class68_Sub22.anInt3147 != -1)
        {
            int i_62_ = Class3.anInt85 - Class68_Sub13_Sub24.anInt3846;
            int i_63_ = Class68_Sub22.anInt3147 - Class85.anInt1553;
            if (i_62_ < 2 || i_62_ > 2)
                i_62_ >>= 4;
            Class68_Sub13_Sub24.anInt3846 = i_62_ + Class68_Sub13_Sub24.anInt3846;
            if (i_63_ < 2 || i_63_ > 2)
                i_63_ >>= 4;
            Class85.anInt1553 = i_63_ + Class85.anInt1553;
            if (i_62_ == 0 && i_63_ == 0)
            {
                Class3.anInt85 = -1;
                Class68_Sub22.anInt3147 = -1;
            }
            NodeSubList.method1788(-1);
        }
        if (i >= -45)
            method764(72, -116, false);
    }
}
