/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class15 {
    public static int[] anIntArray244 = {1, 4};
    public static int anInt245;
    public static int anInt246;
    public static boolean aBoolean247 = false;
    public static volatile long aLong248 = 0L;
    public static Class21renamed aClass21_249;
    public static boolean aBoolean250;
    public static Class92 aClass92_251;
    public static int anInt252;

    public static int method273(int i, byte i_0_) {
        anInt246++;
        if (i_0_ < 37)
            method274(-109);
        return i >>> -388623192;
    }

    public static void method274(int i) {
        if (i != 0)
            method274(56);
        anIntArray244 = null;
        aClass92_251 = null;
        aClass21_249 = null;
    }

    public abstract byte[] method275(int i);

    public static void method276(int i, int i_1_, int i_2_, int i_3_,
                                 int i_4_) {
        anInt245++;
        if (i != 1)
            method274(-15);
        if (i_1_ >= i_2_)
            Class34.method416(i_2_, (byte) -17, i_3_,
                    Class68_Sub22.anIntArrayArray3132[i_4_], i_1_);
        else
            Class34.method416(i_1_, (byte) -17, i_3_,
                    Class68_Sub22.anIntArrayArray3132[i_4_], i_2_);
    }

    public abstract void method277(byte[] is, boolean bool);

    public static int method278(int i, int i_5_) {
        return i ^ i_5_;
    }

    public static Class76 method279(int i, int i_6_, int i_7_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_6_][i_7_];
        if (class68_sub1 == null)
            return null;
        Class76 class76 = class68_sub1.aClass76_2764;
        class68_sub1.aClass76_2764 = null;
        return class76;
    }
}
