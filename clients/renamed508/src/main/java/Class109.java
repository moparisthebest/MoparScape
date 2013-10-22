/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class109
{
    static MutableString aClass100_1836 = Class112.makeMutableString(43, "<col=ffffff> )4 ");
    private int[] anIntArray1837;
    static short[] aShortArray1838;
    static MutableString aClass100_1839 = Class112.makeMutableString(43, "headicons_prayer");
    static boolean aBoolean1840;
    static int anInt1841 = 1;
    static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array1842;
    static int anInt1843;
    static int anInt1844;
    static GroundData[] groundDataArray;
    static int anInt1846;
    static Class21 aClass21_1847;
    static GameSocket updateServer;
    static byte[][][] aByteArrayArrayArray1849;

    final int method1663(int hash, int i_0_)
    {
        anInt1843++;
        int i_1_ = (anIntArray1837.length >> 1) + i_0_;
        int i_2_ = i_1_ & hash;
        for (;;)
        {
            int i_3_ = anIntArray1837[i_2_ + 1 + i_2_];
            if (i_3_ == -1)
                return -1;
            if (anIntArray1837[i_2_ + i_2_] == hash)
                return i_3_;
            i_2_ = i_1_ & i_2_ + 1;
        }
    }

    Class109(int[] is)
    {
        try
        {
            int i;
            for (i = 1; is.length + (is.length >> 1) >= i; i <<= 1)
            {
                /* empty */
            }
            anIntArray1837 = new int[i + i];
            for (int i_4_ = 0; i + i > i_4_; i_4_++)
                anIntArray1837[i_4_] = -1;
            for (int i_5_ = 0; i_5_ < is.length; i_5_++)
            {
                int i_6_;
                for (i_6_ = is[i_5_] & i - 1; anIntArray1837[i_6_ + i_6_ + 1] != -1; i_6_ = i - 1 & i_6_ + 1)
                {
                    /* empty */
                }
                anIntArray1837[i_6_ + i_6_] = is[i_5_];
                anIntArray1837[i_6_ - (-i_6_ - 1)] = i_5_;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "sj.<init>(" + (is != null ? "{...}" : "null") + ')');
        }
    }

    public static void method1664(int i)
    {
        if (i != 20)
            method1664(-7);
        aClass100_1839 = null;
        aClass100_1836 = null;
        updateServer = null;
        groundDataArray = null;
        aClass68_Sub20_Sub10Array1842 = null;
        aClass21_1847 = null;
        aByteArrayArrayArray1849 = null;
        aShortArray1838 = null;
    }

    static final void method1665(byte i, Class21 class21)
    {
        do
        {
            try
            {
                anInt1844++;
                PlayerDefinition.aClass21_2194 = class21;
                Class56.anInt1059 = PlayerDefinition.aClass21_2194.method355(16, 0);
                if (i == -101)
                    break;
                method1664(26);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("sj.C(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static
    {
        aShortArray1838 = new short[] { 24, 49, 20, 33, 19, 4, 26, 25 };
        groundDataArray = new GroundData[4];
        anInt1846 = 0;
    }
}
