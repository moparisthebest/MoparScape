/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class56
{
    static int anInt1059;
    static int anInt1060;
    static int anInt1061;
    static MutableString aClass100_1062;
    static int anInt1063;
    static int anInt1064;
    static short[][] aShortArrayArray1065;
    static MutableString aClass100_1066 = Class112.makeMutableString(43, "Mem:");
    static int anInt1067;

    public static void method569(boolean bool)
    {
        aClass100_1066 = null;
        aShortArrayArray1065 = null;
        if (bool == true)
            aClass100_1062 = null;
    }

    static final MutableString method570(long l, int i)
    {
        anInt1060++;
        if (l <= 0L || l >= 6582952005840035281L)
            return null;
        if (l % 37L == 0L)
            return null;
        int i_0_ = 0;
        for (long l_1_ = l; l_1_ != 0L; l_1_ /= 37L)
            i_0_++;
        byte[] is = new byte[i_0_];
        while (l != 0L)
        {
            long l_2_ = l;
            l /= 37L;
            is[--i_0_] = RandomNumberGenerator.aByteArray1498[(int) (l_2_ - l * 37L)];
        }
        MutableString class100 = new MutableString();
        ((MutableString) class100).data = is;
        ((MutableString) class100).length = is.length;
        if (i != -1)
            anInt1061 = -3;
        return class100;
    }

    static final void method571(byte i)
    {
        anInt1063++;
        if (Class68_Sub13_Sub10.anInt3597 != -1)
            Class43.method480(Class68_Sub13_Sub10.anInt3597, -1);
        for (int i_3_ = 0; i_3_ < anInt1061; i_3_++)
        {
            if (Class121.aBooleanArray2111[i_3_])
                Class68_Sub17.aBooleanArray3039[i_3_] = true;
            Class4.aBooleanArray95[i_3_] = Class121.aBooleanArray2111[i_3_];
            Class121.aBooleanArray2111[i_3_] = false;
        }
        Class68_Sub2.anInt2800 = -1;
        Class68_Sub13_Sub34.anInt4015 = Class68_Sub3.loopCycle;
        NodeList.anInt276 = -1;
        if (i != 46)
            method571((byte) -24);
        Class3.aClass45_73 = null;
        if (Class68_Sub13_Sub10.anInt3597 != -1)
        {
            anInt1061 = 0;
            NodeSub.method1004(0, 0, Class68_Sub13_Sub9.appletHeight, 0, Class68_Sub13_Sub10.anInt3597, -1, 0, Class13_Sub3.appletWidth, (byte) -112);
        }
        Class79.method1422();
        Class109.anInt1846 = 0;
    }

    static final boolean method572(Class21 class21, int i, int i_4_)
    {
        try
        {
            if (i != -1)
                anInt1067 = -32;
            anInt1064++;
            byte[] is = class21.method359(0, i_4_);
            if (is == null)
                return false;
            Class68_Sub13_Sub24.method818(14432, is);
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("jd.C(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + i_4_ + ')'));
        }
    }

    static
    {
        aClass100_1062 = Class112.makeMutableString(43, " weitere Optionen");
        anInt1067 = 0;
        anInt1061 = 0;
    }
}
