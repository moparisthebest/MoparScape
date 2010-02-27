/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class15
{
    static int[] anIntArray244 = { 1, 4 };
    static int anInt245;
    static int anInt246;
    static boolean aBoolean247 = false;
    static volatile long aLong248 = 0L;
    static Class21 aClass21_249;
    static boolean aBoolean250;
    static Class92 aClass92_251;
    static int anInt252;

    static final int method273(int i, byte i_0_)
    {
        anInt246++;
        if (i_0_ < 37)
            method274(-109);
        return i >>> 8;
    }

    public static void method274(int i)
    {
        if (i != 0)
            method274(56);
        anIntArray244 = null;
        aClass92_251 = null;
        aClass21_249 = null;
    }

    abstract byte[] method275(int i);

    static final void method276(int i, int i_1_, int i_2_, int i_3_, int i_4_)
    {
        anInt245++;
        if (i != 1)
            method274(-15);
        if (i_1_ >= i_2_)
            Class34.method416(i_2_, (byte) -17, i_3_, Class68_Sub22.anIntArrayArray3134[i_4_], i_1_);
        else
            Class34.method416(i_1_, (byte) -17, i_3_, Class68_Sub22.anIntArrayArray3134[i_4_], i_2_);
    }

    abstract void method277(byte[] is, boolean bool);

    static int method278(int i, int i_5_)
    {
        return i ^ i_5_;
    }

    static final Object2 method279(int i, int i_6_, int i_7_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_6_][i_7_];
        if (class68_sub1 == null)
            return null;
        Object2 class76 = ((Ground) class68_sub1).object_2;
        ((Ground) class68_sub1).object_2 = null;
        return class76;
    }
}
