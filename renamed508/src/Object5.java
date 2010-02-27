/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Object5
{
    static volatile boolean hasFocus;
    int anInt1234;
    static int anInt1235;
    static MutableString aClass100_1236;
    static boolean[] aBooleanArray1237 = new boolean[5];
    int anInt1238;
    static int anInt1239;
    static byte[][] aByteArrayArray1240;
    static GameApplet anApplet_Sub1_1241;
    Animable aClass1_1242;
    long uid = 0L;
    static MutableString aClass100_1244 = Class112.makeMutableString(43, "(Y<)4col>");
    static int anInt1245;
    private static MutableString aClass100_1246;
    static int anInt1247;
    static int anInt1248;
    int anInt1249;
    int anInt1250;
    static MutableString aClass100_1251;
    int anInt1252;
    int anInt1253;
    int anInt1254;
    int anInt1255;
    int anInt1256;
    static int[] anIntArray1257;
    static int anInt1258;
    static MutableString aClass100_1259;
    int anInt1260;
    static int anInt1261;
    int anInt1262;

    static final int method1326(int i, int i_0_, int i_1_)
    {
        if (i != 503159455)
            method1329((byte) 112);
        anInt1261++;
        int i_2_ = i_1_ >>> 31;
        return (i_2_ + i_1_) / i_0_ - i_2_;
    }

    static final void method1327(int i)
    {
        Class68_Sub13_Sub34.method875((byte) 108);
        anInt1235++;
        System.gc();
        Class17.method296(i, (byte) -68);
    }

    static final void method1328(Stream class68_sub14, int i)
    {
        try
        {
            anInt1258++;
            if (Class68_Sub13_Sub4.aClass124_3488 != null)
            {
                try
                {
                    Class68_Sub13_Sub4.aClass124_3488.method1766(0L, i - 23);
                    Class68_Sub13_Sub4.aClass124_3488.method1761(24, 0, ((Stream) class68_sub14).position, ((Stream) class68_sub14).buffer);
                } catch (Exception exception)
                {
                    /* empty */
                }
            }
            ((Stream) class68_sub14).position += i;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "lj.E(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final void method1329(byte i)
    {
        Class68_Sub13_Sub28.aClass98_3925.method1572((byte) 94);
        int i_3_ = 60 / ((-53 - i) / 38);
        anInt1247++;
    }

    public Object5()
    {
        /* empty */
    }

    public static void method1330(int i)
    {
        aClass100_1251 = null;
        aClass100_1259 = null;
        if (i != 24)
            anIntArray1257 = null;
        aClass100_1246 = null;
        anIntArray1257 = null;
        aByteArrayArray1240 = null;
        aClass100_1244 = null;
        aClass100_1236 = null;
        aBooleanArray1237 = null;
    }

    static
    {
        hasFocus = true;
        anInt1248 = -1;
        anInt1245 = 0;
        aClass100_1251 = null;
        anApplet_Sub1_1241 = null;
        anIntArray1257 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
        aClass100_1246 = Class112.makeMutableString(43, "white:");
        aClass100_1259 = aClass100_1246;
        aClass100_1236 = aClass100_1246;
    }
}
