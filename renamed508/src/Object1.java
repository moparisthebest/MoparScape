/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Object1
{
    int anInt1176;
    int anInt1177;
    static byte[][][] byteGroundArray;
    static MutableString aClass100_1179 = Class112.makeMutableString(43, "::fpson");
    static int[] anIntArray1180;
    Animable aClass1_1181;
    static int anInt1182;
    int anInt1183;
    Animable aClass1_1184;
    long uid = 0L;
    int anInt1186;
    int anInt1187;
    static MutableString aClass100_1188;
    static int anInt1189;
    static int anInt1190;
    static int anInt1191;
    static int anInt1192;
    static int anInt1193;

    static final int method622(int i, boolean bool, int i_0_, byte[] is)
    {
        try
        {
            int i_1_ = -1;
            anInt1193++;
            for (int i_2_ = i_0_; i_2_ < i; i_2_++)
                i_1_ = (Node.anIntArray1219[0xff & (is[i_2_] ^ i_1_)] ^ i_1_ >>> 8);
            if (bool != false)
                return -46;
            i_1_ ^= 0xffffffff;
            return i_1_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("kk.C(" + i + ',' + bool + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method623(int i)
    {
        if (i == -1154)
        {
            byteGroundArray = null;
            anIntArray1180 = null;
            aClass100_1188 = null;
            aClass100_1179 = null;
        }
    }

    static final Animation getAnimation(int i_3_)
    {
        anInt1182++;
        Animation anim = (Animation) Class91.aClass98_1638.getNodeForID((long) i_3_);
        if (anim != null)
            return anim;
        byte[] dat = (Class68_Sub13_Sub24.aClass21_3833.method338(Class50_Sub2.method534(i_3_, (byte) 65), 0, Class68_Sub20_Sub13_Sub2.method1165(i_3_, -840517817)));
        anim = new Animation();
        if (dat != null)
            anim.method1735(new Stream(dat));
        anim.method1731((byte) -1);
        Class91.aClass98_1638.addObject(anim, (long) i_3_);
        return anim;
    }

    static final void method625(int i)
    {
        Class125.aClass98_2173.method1572((byte) 94);
        Class12.aClass98_211.method1572((byte) 94);
        anInt1189++;
        if (i == -27434)
            Class68_Sub13_Sub20.aClass98_3780.method1572((byte) 94);
    }

    public Object1()
    {
        /* empty */
    }

    static
    {
        byteGroundArray = new byte[4][104][104];
        aClass100_1188 = Class112.makeMutableString(43, "sch-Utteln:");
        anInt1190 = 0;
        anInt1191 = 5063219;
    }
}
