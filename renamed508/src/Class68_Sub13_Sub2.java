/* Class68_Sub13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub2 extends Class68_Sub13
{
    static int anInt3458;
    static int anInt3459;
    static MutableString aClass100_3460;
    static MRUNodes aClass98_3461;
    static boolean aBoolean3462 = true;
    static int anInt3463;
    static int anInt3464;
    static Class92_Sub1[] aClass92_Sub1Array3465;

    static final Class53 method707(int i, byte i_0_)
    {
        anInt3463++;
        Class53 class53 = ((Class53) CipheredByteVector.aClass98_4120.getNodeForID((long) i));
        if (i_0_ != -128)
            return null;
        if (class53 != null)
            return class53;
        byte[] is = Class28.aClass21_528.method338(i, i_0_ + 128, 1);
        class53 = new Class53();
        if (is != null)
            class53.method546(i_0_ ^ ~0x7f, i, new Stream(is));
        CipheredByteVector.aClass98_4120.addObject(class53, (long) i);
        return class53;
    }

    public static void method708(byte i)
    {
        aClass92_Sub1Array3465 = null;
        if (i != -47)
            aClass98_3461 = null;
        aClass98_3461 = null;
        aClass100_3460 = null;
    }

    final int[] method698(byte i, int i_1_)
    {
        anInt3458++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_1_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_2_ = Class13_Sub3.anIntArray2674[i_1_];
            for (int i_3_ = 0; i_3_ < Class68_Sub13_Sub19.anInt3748; i_3_++)
                is[i_3_] = (method709(-113, i_2_, Class68_Sub13_Sub3.anIntArray3481[i_3_]) % 4096);
        }
        if (i != -61)
            return null;
        return is;
    }

    private final int method709(int i, int i_4_, int i_5_)
    {
        anInt3464++;
        int i_6_ = i_4_ * 57 + i_5_;
        int i_7_ = -69 % ((i - 4) / 40);
        i_6_ ^= i_6_ << 1;
        return 4096 - ((0x7fffffff & (15731 * (i_6_ * i_6_) + 789221) * i_6_ + 1376312589) / 262144);
    }

    static final int method710(boolean bool, int i)
    {
        anInt3459++;
        long l = Class36.method438(17161);
        Class68_Sub15 class68_sub15 = (bool ? (Class68_Sub15) Class37.aClass113_646.method1685(-32642) : ((Class68_Sub15) Class37.aClass113_646.method1689((byte) -118)));
        int i_8_ = 78 / ((-52 - i) / 58);
        for (/**/; class68_sub15 != null; class68_sub15 = ((Class68_Sub15) Class37.aClass113_646.method1689((byte) -108)))
        {
            if ((((Class68_Sub15) class68_sub15).aLong3016 & 0x3fffffffffffffffL) < l)
            {
                if ((0x4000000000000000L & ((Class68_Sub15) class68_sub15).aLong3016) != 0L)
                {
                    int i_9_ = (int) ((Node) class68_sub15).nodeID;
                    Class103.settingArray[i_9_] = Class3.anIntArray79[i_9_];
                    class68_sub15.unlink();
                    return i_9_;
                }
                class68_sub15.unlink();
            }
        }
        return -1;
    }

    public Class68_Sub13_Sub2()
    {
        super(0, true);
    }

    static
    {
        aClass100_3460 = Class112.makeMutableString(43, "leuchten1:");
        aClass98_3461 = new MRUNodes(260);
    }
}
