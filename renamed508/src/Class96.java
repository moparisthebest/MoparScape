/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class96
{
    static int anInt1695;
    static MRUNodes aClass98_1696;
    static int anInt1697 = 0;
    static int anInt1698;
    static MutableString aClass100_1699;
    static int anInt1700;
    static int[] mapDataAreaIndices;
    static Class68_Sub20_Sub10 aClass68_Sub20_Sub10_1702;
    static int[] BIT_MASKS;

    public static void method1559(byte i)
    {
        if (i > 61)
        {
            mapDataAreaIndices = null;
            aClass98_1696 = null;
            BIT_MASKS = null;
            aClass100_1699 = null;
            aClass68_Sub20_Sub10_1702 = null;
        }
    }

    static final void method1560(boolean bool, int i, int i_0_, int i_1_, Stream class68_sub14, int i_2_, int i_3_, byte i_4_, int i_5_)
    {
        do
        {
            try
            {
                anInt1698++;
                if (i < 0 || i >= 104 || i_5_ < 0 || i_5_ >= 104)
                {
                    for (;;)
                    {
                        int i_6_ = class68_sub14.readUByte();
                        if (i_6_ == 0)
                            break;
                        if (i_6_ == 1)
                        {
                            class68_sub14.readUByte();
                            break;
                        }
                        if (i_6_ <= 49)
                            class68_sub14.readUByte();
                    }
                } else
                {
                    if (!bool)
                        Object1.byteGroundArray[i_2_][i][i_5_] = (byte) 0;
                    for (;;)
                    {
                        int i_7_ = class68_sub14.readUByte();
                        if (i_7_ == 0)
                        {
                            if (bool)
                                Class68_Sub20_Sub12.intGroundArray[0][i][i_5_] = (Class74.anIntArrayArrayArray1335[0][i][i_5_]);
                            else if (i_2_ != 0)
                                Class68_Sub20_Sub12.intGroundArray[i_2_][i][i_5_] = (Class68_Sub20_Sub12.intGroundArray[i_2_ - 1][i][i_5_]) - 240;
                            else
                                Class68_Sub20_Sub12.intGroundArray[0][i][i_5_] = 8 * -(Class68_Sub13_Sub38.method895(i_5_ + 556238 + i_1_, true, i_0_ + (i + 932731)));
                            break;
                        }
                        if (i_7_ == 1)
                        {
                            int i_8_ = class68_sub14.readUByte();
                            if (!bool)
                            {
                                if (i_8_ == 1)
                                    i_8_ = 0;
                                if (i_2_ == 0)
                                    Class68_Sub20_Sub12.intGroundArray[0][i][i_5_] = -i_8_ * 8;
                                else
                                    Class68_Sub20_Sub12.intGroundArray[i_2_][i][i_5_] = (Class68_Sub20_Sub12.intGroundArray[i_2_ - 1][i][i_5_]) - i_8_ * 8;
                            } else
                                Class68_Sub20_Sub12.intGroundArray[0][i][i_5_] = (Class74.anIntArrayArrayArray1335[0][i][i_5_]) + 8 * i_8_;
                            break;
                        }
                        if (i_7_ <= 49)
                        {
                            Class68_Sub13_Sub35.aByteArrayArrayArray4030[i_2_][i][i_5_] = class68_sub14.readByte();
                            Class109.aByteArrayArrayArray1849[i_2_][i][i_5_] = (byte) ((i_7_ - 2) / 4);
                            Class85.aByteArrayArrayArray1556[i_2_][i][i_5_] = (byte) Class120.method1746(3, i_7_ - 2 + i_3_);
                        } else if (i_7_ <= 81)
                        {
                            if (!bool)
                                Object1.byteGroundArray[i_2_][i][i_5_] = (byte) (i_7_ - 49);
                        } else
                            Class52.aByteArrayArrayArray1014[i_2_][i][i_5_] = (byte) (i_7_ - 81);
                    }
                }
                if (i_4_ > 25)
                    break;
                method1561(-35, (byte) -31);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("pj.C(" + bool + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (class68_sub14 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
            }
            break;
        } while (false);
    }

    static final boolean method1561(int i, byte i_9_)
    {
        if (i_9_ > -112)
            return false;
        anInt1700++;
        if ((0x1 & i >> 21) == 0)
            return false;
        return true;
    }

    static final int method1562(boolean bool, int i, int i_10_, int i_11_)
    {
        Class68_Sub22 class68_sub22 = ((Class68_Sub22) Class68_Sub13_Sub8.aClass113_3566.method1684((long) i_10_, -60));
        anInt1695++;
        if (class68_sub22 == null)
            return 0;
        int i_12_ = 0;
        for (int i_13_ = i_11_; ((Class68_Sub22) class68_sub22).anIntArray3146.length > i_13_; i_13_++)
        {
            if (((Class68_Sub22) class68_sub22).anIntArray3146[i_13_] >= 0 && (Class14.anInt233 > ((Class68_Sub22) class68_sub22).anIntArray3146[i_13_]))
            {
                ItemDefinition class19 = GameApplet.method18(-25672, (((Class68_Sub22) class68_sub22).anIntArray3146[i_13_]));
                if (((ItemDefinition) class19).aClass113_394 != null)
                {
                    Class68_Sub10 class68_sub10 = (Class68_Sub10) ((ItemDefinition) class19).aClass113_394.method1684((long) i, -103);
                    if (class68_sub10 != null)
                    {
                        if (!bool)
                            i_12_ += ((Class68_Sub10) class68_sub10).anInt2904;
                        else
                            i_12_ += ((((Class68_Sub22) class68_sub22).anIntArray3143[i_13_]) * (((Class68_Sub10) class68_sub10).anInt2904));
                    }
                }
            }
        }
        return i_12_;
    }

    static
    {
        aClass98_1696 = new MRUNodes(5);
        aClass100_1699 = Class112.makeMutableString(43, "<)4col>");
        BIT_MASKS = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
    }
}
