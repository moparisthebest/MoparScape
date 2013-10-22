/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Node
{
    long nodeID;
    static int[] anIntArray1219;
    static int anInt1220;
    static int anInt1221;
    static Object5[] aClass69Array1222 = new Object5[5000];
    static MutableString aClass100_1223 = Class112.makeMutableString(43, "<col=ffffff>");
    static int anInt1224;
    static byte aByte1225;
    static int anInt1226;
    Node next;
    static Class21_Sub1 aClass21_Sub1_1228;
    Node previous;
    static MutableString aClass100_1230;
    static Widget aClass45_1231;
    static int allocatedMediumBufferCount;

    public static void method643(int i)
    {
        aClass100_1230 = null;
        aClass69Array1222 = null;
        anIntArray1219 = null;
        aClass45_1231 = null;
        aClass100_1223 = null;
        aClass21_Sub1_1228 = null;
    }

    static final boolean method644(int i, int i_1_)
    {
        anInt1224++;
        if (i_1_ != 1424444319)
            return true;
        if ((0x1 & i >> 31) == 0)
            return false;
        return true;
    }

    static final void method645(boolean bool, byte i)
    {
        anInt1220++;
        if (i >= -13)
            method644(-38, -97);
        int i_2_ = 4;
        byte[][] is = Class23.aByteArrayArray490;
        for (int i_3_ = 0; i_2_ > i_3_; i_3_++)
        {
            Class49.method524(16322);
            for (int i_4_ = 0; i_4_ < 13; i_4_++)
            {
                for (int i_5_ = 0; i_5_ < 13; i_5_++)
                {
                    int i_6_ = (Class68_Sub2.anIntArrayArrayArray2798[i_3_][i_4_][i_5_]);
                    boolean bool_7_ = false;
                    if (i_6_ != -1)
                    {
                        int i_8_ = (0x36b78c8 & i_6_) >> 24;
                        if (!bool || i_8_ == 0)
                        {
                            int i_9_ = (i_6_ & 0xffda27) >> 14;
                            int i_10_ = (0x6 & i_6_) >> 1;
                            int i_11_ = (i_6_ & 0x3ffe) >> 3;
                            int i_12_ = (i_9_ / 8 << 8) + i_11_ / 8;
                            for (int i_13_ = 0; i_13_ < Class119.mapDataAreas.length; i_13_++)
                            {
                                if (Class119.mapDataAreas[i_13_] == i_12_ && is[i_13_] != null)
                                {
                                    bool_7_ = true;
                                    Class68_Sub20_Sub16.method1173((i_9_ & 0x7) * 8, false, i_4_ * 8, is[i_13_], 8 * (0x7 & i_11_), Class109.groundDataArray, i_10_, i_3_, bool, i_8_, i_5_ * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!bool_7_)
                        Class68_Sub13_Sub37.method893(8, -81, 8, i_3_, i_5_ * 8, 8 * i_4_);
                }
            }
        }
    }

    final boolean hasNext()
    {
        return next != null;
    }

    final void unlink()
    {
        if (next != null)
        {
            next.previous = previous;
            previous.next = next;
            next = null;
            previous = null;
        }
    }

    public Node()
    {
        /* empty */
    }

    static
    {
        anIntArray1219 = new int[256];
        for (int i = 0; i < 256; i++)
        {
            int i_14_ = i;
            for (int i_15_ = 0; i_15_ < 8; i_15_++)
            {
                if ((0x1 & i_14_) != 1)
                    i_14_ >>>= 1;
                else
                    i_14_ = ~0x12477cdf ^ i_14_ >>> 1;
            }
            anIntArray1219[i] = i_14_;
        }
        allocatedMediumBufferCount = 0;
        aClass100_1230 = Class112.makeMutableString(43, "Lade)3)3)3");
    }
}
