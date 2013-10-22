/* Class68_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub9 extends Node
{
    byte[][][] aByteArrayArrayArray2883;
    static int anInt2884 = 0;
    static String serverAddress;
    int anInt2886;
    static MutableString aClass100_2887 = Class112.makeMutableString(43, "Abbrechen");
    static int anInt2888 = 0;
    static boolean[][] aBooleanArrayArray2889;
    int[] anIntArray2890;
    int[] anIntArray2891;
    static int anInt2892;
    static int anInt2893 = 0;
    static float aFloat2894;
    int[] anIntArray2895;
    Class31[] aClass31Array2896;
    static int anInt2897;
    static int anInt2898;
    int anInt2899;
    Class31[] aClass31Array2900;
    static int anInt2901;

    static final int method677(int i, byte i_0_, int i_1_, int i_2_)
    {
        anInt2898++;
        if (i_1_ > 243)
            i >>= 4;
        else if (i_1_ > 217)
            i >>= 3;
        else if (i_1_ <= 192)
        {
            if (i_1_ > 179)
                i >>= 1;
        } else
            i >>= 2;
        if (i_0_ >= -41)
            aBooleanArrayArray2889 = null;
        return (i_1_ >> 1) + (i_2_ >> 2 << 10) + (i >> 5 << 7);
    }

    static final void method678(boolean bool, int i)
    {
        for (int i_3_ = 0; Class13_Sub2.localNPCCount > i_3_; i_3_++)
        {
            NPC class1_sub6_sub1 = (Class102.localNPCs[Class68_Sub10.localNPCIndices[i_3_]]);
            long l = (0x20000000L | (long) Class68_Sub10.localNPCIndices[i_3_] << 32);
            if (class1_sub6_sub1 != null && class1_sub6_sub1.hasDefinition() && !bool != ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).aBoolean1422 && ((NPC) class1_sub6_sub1).definition.method1455(8937))
            {
                int i_4_ = ((Character) class1_sub6_sub1).x >> 7;
                int i_5_ = ((Character) class1_sub6_sub1).y >> 7;
                if (i_4_ >= 0 && i_4_ < 104 && i_5_ >= 0 && i_5_ < 104)
                {
                    if (((Character) class1_sub6_sub1).raw_range == 1 && ((0x7f & ((Character) class1_sub6_sub1).x) == 64) && ((0x7f & ((Character) class1_sub6_sub1).y) == 64))
                    {
                        if (Class3.anInt84 == Object2.anIntArrayArray1346[i_4_][i_5_])
                            continue;
                        Object2.anIntArrayArray1346[i_4_][i_5_] = Class3.anInt84;
                    }
                    if (!((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).aBoolean1435)
                        l |= ~0x7fffffffffffffffL;
                    ((Character) class1_sub6_sub1).anInt2584 = (Player.fixZ(((Character) class1_sub6_sub1).x, GameSocket.plane, ((Character) class1_sub6_sub1).y));
                    Class68_Sub20_Sub4.method1061(GameSocket.plane, ((Character) class1_sub6_sub1).x, ((Character) class1_sub6_sub1).y, ((Character) class1_sub6_sub1).anInt2584, (64 * (((Character) class1_sub6_sub1).raw_range - 1) + 60), class1_sub6_sub1, ((Character) class1_sub6_sub1).anInt2550, l, ((Character) class1_sub6_sub1).aBoolean2585);
                }
            }
        }
        if (i >= -124)
            method678(false, -2);
        anInt2901++;
    }

    static final int method679(boolean bool, boolean bool_6_, byte i)
    {
        if (i != 71)
            return 84;
        anInt2897++;
        int i_7_ = 0;
        if (bool)
            i_7_ += Class56.anInt1067 + Class68_Sub24.anInt3155;
        if (bool_6_)
            i_7_ += Class22.anInt483 + NodeSubList.anInt2229;
        return i_7_;
    }

    public Class68_Sub9()
    {
        /* empty */
    }

    public static void method680(int i)
    {
        aBooleanArrayArray2889 = null;
        aClass100_2887 = null;
        serverAddress = null;
        if (i != -19267)
            aBooleanArrayArray2889 = null;
    }
}
