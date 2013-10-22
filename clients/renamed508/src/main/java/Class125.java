/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class125 implements Runnable
{
    static MutableString aClass100_2167;
    Signlink aClass55_2168;
    static int cameraTurnSpeed_local;
    static int anInt2170;
    static int[] anIntArray2171 = new int[32];
    static Class21 aClass21_2172;
    static MRUNodes aClass98_2173;
    static int anInt2174;
    static int anInt2175 = 0;
    volatile Class35[] aClass35Array2176 = new Class35[2];
    private static MutableString aClass100_2177 = (Class112.makeMutableString(43, "You can(Wt add yourself to your own ignore list)3"));
    volatile boolean aBoolean2178 = false;
    static int anInt2179;
    volatile boolean aBoolean2180 = false;
    static int anInt2181;

    public final void run()
    {
        ((Class125) this).aBoolean2180 = true;
        anInt2181++;
        try
        {
            while (!((Class125) this).aBoolean2178)
            {
                for (int i = 0; i < 2; i++)
                {
                    Class35 class35 = ((Class125) this).aClass35Array2176[i];
                    if (class35 != null)
                        class35.method430((byte) 54);
                }
                Class50.method528(-5, 10L);
                GameCanvas.method46(((Class125) this).aClass55_2168, null, (byte) -103);
            }
        } catch (Exception exception)
        {
            Class71.method1339(null, exception, 38);
        } finally
        {
            ((Class125) this).aBoolean2180 = false;
        }
    }

    static final Class68_Sub20_Sub2 method1769(byte i, int i_0_)
    {
        anInt2170++;
        Class68_Sub20_Sub2 class68_sub20_sub2 = ((Class68_Sub20_Sub2) Class75_Sub1_Sub1.aClass82_4590.method1479((long) i_0_, (byte) -76));
        if (class68_sub20_sub2 != null)
            return class68_sub20_sub2;
        byte[] is = Class109.aClass21_1847.method338(i_0_, 0, 5);
        if (i <= 103)
            aClass100_2177 = null;
        class68_sub20_sub2 = new Class68_Sub20_Sub2();
        if (is != null)
            class68_sub20_sub2.method1045((byte) 108, new Stream(is));
        Class75_Sub1_Sub1.aClass82_4590.method1471((long) i_0_, (byte) -105, class68_sub20_sub2);
        return class68_sub20_sub2;
    }

    public static void method1770(int i)
    {
        aClass21_2172 = null;
        aClass100_2167 = null;
        aClass98_2173 = null;
        anIntArray2171 = null;
        int i_1_ = -37 / ((62 - i) / 41);
        aClass100_2177 = null;
    }

    static
    {
        aClass100_2167 = aClass100_2177;
        aClass98_2173 = new MRUNodes(200);
    }
}
