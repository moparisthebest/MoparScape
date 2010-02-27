/* Class68_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub8 extends Node
{
    static MutableString aClass100_2866 = Class112.makeMutableString(43, "Sprites geladen)3");
    static int anInt2867;
    static MutableString aClass100_2868;
    static int anInt2869;
    static int anInt2870;
    int anInt2871;
    static MRUNodes aClass98_2872;
    static MutableString aClass100_2873;
    static MutableString[] aClass100Array2874;
    static int[][] anIntArrayArray2875;
    static int anInt2876;
    int anInt2877;
    static int anInt2878;
    static int anInt2879;
    int anInt2880;
    private static MutableString aClass100_2881 = (Class112.makeMutableString(43, "You can(Wt add yourself to your own friend list)3"));
    static int anInt2882;

    static final MutableString method671(int[] is, long l, int i, int i_0_)
    {
        try
        {
            if (i != -1)
                method674(-84, -68);
            anInt2870++;
            if (Class37.anInterface2_649 != null)
            {
                MutableString class100 = Class37.anInterface2_649.method7(i_0_, (byte) 22, l, is);
                if (class100 != null)
                    return class100;
            }
            if (i_0_ == 5)
                return Class56.method570(l, -1).method1603(i ^ ~0x3190);
            return PlayerDefinition.method1771(l, -62);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("jc.B(" + (is != null ? "{...}" : "null") + ',' + l + ',' + i + ',' + i_0_ + ')'));
        }
    }

    static final void method672(int i, int i_1_)
    {
        anInt2867++;
        int i_2_ = -59 / ((i_1_ - 27) / 54);
        Object2.anInt1345 = 1000 / i;
    }

    static final void method673(int i, int i_3_, byte[] is, boolean bool, GroundData[] class38s, boolean bool_4_)
    {
        try
        {
            anInt2879++;
            Stream class68_sub14 = new Stream(is);
            if (bool_4_ != false)
                method676(17);
            int i_5_ = -1;
            for (;;)
            {
                int i_6_ = class68_sub14.method937(true);
                if (i_6_ == 0)
                    break;
                i_5_ += i_6_;
                int i_7_ = 0;
                for (;;)
                {
                    int i_8_ = class68_sub14.method912(255);
                    if (i_8_ == 0)
                        break;
                    i_7_ += i_8_ - 1;
                    int i_9_ = i_7_ & 0x3f;
                    int i_10_ = (0xfc0 & i_7_) >> 6;
                    int i_11_ = class68_sub14.readUByte();
                    int i_12_ = i_7_ >> 12;
                    int i_13_ = i_11_ >> 2;
                    int i_14_ = 0x3 & i_11_;
                    int i_15_ = i + i_10_;
                    int i_16_ = i_9_ + i_3_;
                    if (i_15_ > 0 && i_16_ > 0 && i_15_ < 103 && i_16_ < 103)
                    {
                        GroundData class38 = null;
                        if (!bool)
                        {
                            int i_17_ = i_12_;
                            if ((0x2 & (Object1.byteGroundArray[1][i_15_][i_16_])) == 2)
                                i_17_--;
                            if (i_17_ >= 0)
                                class38 = class38s[i_17_];
                        }
                        Class68_Sub20_Sub17.method1181(class38, 1, bool, i_16_, i_14_, i_15_, i_13_, i_12_, i_12_, !bool, i_5_);
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("jc.D(" + i + ',' + i_3_ + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + (class38s != null ? "{...}" : "null") + ',' + bool_4_ + ')'));
        }
    }

    static final int method674(int i, int i_18_)
    {
        if (i_18_ != -528748559)
            method671(null, 125L, 117, 89);
        anInt2876++;
        return i >> 17 & 0x7;
    }

    static final void method675(int i, int i_19_)
    {
        Class68_Sub22.anInt3147 = -1;
        Class68_Sub13_Sub24.anInt3846 = i;
        Class3.anInt85 = i_19_;
        NodeSubList.method1788(-1);
        anInt2882++;
    }

    public Class68_Sub8()
    {
        /* empty */
    }

    public static void method676(int i)
    {
        aClass100_2868 = null;
        aClass98_2872 = null;
        aClass100_2866 = null;
        aClass100_2881 = null;
        aClass100Array2874 = null;
        anIntArrayArray2875 = null;
        aClass100_2873 = null;
        int i_20_ = -16 / ((4 - i) / 49);
    }

    static
    {
        aClass100_2873 = Class112.makeMutableString(43, "null");
        aClass100_2868 = aClass100_2881;
        anIntArrayArray2875 = new int[104][104];
        aClass98_2872 = new MRUNodes(64);
    }
}
