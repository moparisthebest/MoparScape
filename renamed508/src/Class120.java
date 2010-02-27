/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120
{
    static MutableString aClass100_2094;
    private static MutableString aClass100_2095;
    static int allocatedHugeBufferCount = 0;
    static Class21_Sub1 aClass21_Sub1_2097;
    static MutableString aClass100_2098;
    static int anInt2099;
    static short[] aShortArray2100;
    static boolean menuOpen;

    public static void method1744(int i)
    {
        if (i != 0)
            aClass100_2098 = null;
        aClass21_Sub1_2097 = null;
        aClass100_2095 = null;
        aClass100_2094 = null;
        aClass100_2098 = null;
        aShortArray2100 = null;
    }

    static final Object method1745(boolean bool, byte i, byte[] is)
    {
        try
        {
            int i_0_ = -25 % ((-73 - i) / 52);
            anInt2099++;
            if (is == null)
                return null;
            if (is.length > 136 && !Class104.aBoolean1782)
            {
                try
                {
                    Class15 class15 = ((Class15) Class.forName("Class15_Sub1").newInstance());
                    class15.method277(is, true);
                    return class15;
                } catch (Throwable throwable)
                {
                    Class104.aBoolean1782 = true;
                }
            }
            if (bool)
                return Class89.method1514(is, false);
            return is;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ui.C(" + bool + ',' + i + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static int method1746(int i, int i_1_)
    {
        return i & i_1_;
    }

    static
    {
        aClass100_2095 = Class112.makeMutableString(43, "red:");
        aClass100_2098 = aClass100_2095;
        menuOpen = false;
        aClass100_2094 = aClass100_2095;
    }
}
