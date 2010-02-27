/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class6
{
    private static float aFloat109;
    private int[][][] anIntArrayArrayArray110;
    int[] anIntArray111 = new int[2];
    static int[][] anIntArrayArray112 = new int[2][8];
    static int anInt113;
    private int[][][] anIntArrayArrayArray114 = new int[2][2][4];
    private static float[][] aFloatArrayArray115 = new float[2][8];
    private int[] anIntArray116;

    final void method193(Stream class68_sub14, Class5 class5)
    {
        int i = class68_sub14.readUByte();
        ((Class6) this).anIntArray111[0] = i >> 4;
        ((Class6) this).anIntArray111[1] = i & 0xf;
        if (i != 0)
        {
            anIntArray116[0] = class68_sub14.readUShort();
            anIntArray116[1] = class68_sub14.readUShort();
            int i_0_ = class68_sub14.readUByte();
            for (int i_1_ = 0; i_1_ < 2; i_1_++)
            {
                for (int i_2_ = 0; i_2_ < ((Class6) this).anIntArray111[i_1_]; i_2_++)
                {
                    anIntArrayArrayArray110[i_1_][0][i_2_] = class68_sub14.readUShort();
                    anIntArrayArrayArray114[i_1_][0][i_2_] = class68_sub14.readUShort();
                }
            }
            for (int i_3_ = 0; i_3_ < 2; i_3_++)
            {
                for (int i_4_ = 0; i_4_ < ((Class6) this).anIntArray111[i_3_]; i_4_++)
                {
                    if ((i_0_ & 1 << i_3_ * 4 << i_4_) != 0)
                    {
                        anIntArrayArrayArray110[i_3_][1][i_4_] = class68_sub14.readUShort();
                        anIntArrayArrayArray114[i_3_][1][i_4_] = class68_sub14.readUShort();
                    } else
                    {
                        anIntArrayArrayArray110[i_3_][1][i_4_] = anIntArrayArrayArray110[i_3_][0][i_4_];
                        anIntArrayArrayArray114[i_3_][1][i_4_] = anIntArrayArrayArray114[i_3_][0][i_4_];
                    }
                }
            }
            if (i_0_ != 0 || anIntArray116[1] != anIntArray116[0])
                class5.method189(class68_sub14);
        } else
            anIntArray116[0] = anIntArray116[1] = 0;
    }

    final int method194(int i, float f)
    {
        if (i == 0)
        {
            float f_5_ = ((float) anIntArray116[0] + (float) (anIntArray116[1] - anIntArray116[0]) * f);
            f_5_ *= 0.0030517578F;
            aFloat109 = (float) Math.pow(0.1, (double) (f_5_ / 20.0F));
            anInt113 = (int) (aFloat109 * 65536.0F);
        }
        if (((Class6) this).anIntArray111[i] == 0)
            return 0;
        float f_6_ = method198(i, 0, f);
        aFloatArrayArray115[i][0] = -2.0F * f_6_ * (float) Math.cos((double) method195(i, 0, f));
        aFloatArrayArray115[i][1] = f_6_ * f_6_;
        for (int i_7_ = 1; i_7_ < ((Class6) this).anIntArray111[i]; i_7_++)
        {
            f_6_ = method198(i, i_7_, f);
            float f_8_ = (-2.0F * f_6_ * (float) Math.cos((double) method195(i, i_7_, f)));
            float f_9_ = f_6_ * f_6_;
            aFloatArrayArray115[i][i_7_ * 2 + 1] = aFloatArrayArray115[i][i_7_ * 2 - 1] * f_9_;
            aFloatArrayArray115[i][i_7_ * 2] = (aFloatArrayArray115[i][i_7_ * 2 - 1] * f_8_ + aFloatArrayArray115[i][i_7_ * 2 - 2] * f_9_);
            for (int i_10_ = i_7_ * 2 - 1; i_10_ >= 2; i_10_--)
                aFloatArrayArray115[i][i_10_] += (aFloatArrayArray115[i][i_10_ - 1] * f_8_ + aFloatArrayArray115[i][i_10_ - 2] * f_9_);
            aFloatArrayArray115[i][1] += aFloatArrayArray115[i][0] * f_8_ + f_9_;
            aFloatArrayArray115[i][0] += f_8_;
        }
        if (i == 0)
        {
            for (int i_11_ = 0; i_11_ < ((Class6) this).anIntArray111[0] * 2; i_11_++)
                aFloatArrayArray115[0][i_11_] *= aFloat109;
        }
        for (int i_12_ = 0; i_12_ < ((Class6) this).anIntArray111[i] * 2; i_12_++)
            anIntArrayArray112[i][i_12_] = (int) (aFloatArrayArray115[i][i_12_] * 65536.0F);
        return ((Class6) this).anIntArray111[i] * 2;
    }

    private final float method195(int i, int i_13_, float f)
    {
        float f_14_ = ((float) anIntArrayArrayArray110[i][0][i_13_] + f * (float) (anIntArrayArrayArray110[i][1][i_13_] - anIntArrayArrayArray110[i][0][i_13_]));
        f_14_ *= 1.2207031E-4F;
        return method196(f_14_);
    }

    private static final float method196(float f)
    {
        float f_15_ = 32.703197F * (float) Math.pow(2.0, (double) f);
        return f_15_ * 3.1415927F / 11025.0F;
    }

    public static void method197()
    {
        aFloatArrayArray115 = null;
        anIntArrayArray112 = null;
    }

    private final float method198(int i, int i_16_, float f)
    {
        float f_17_ = ((float) anIntArrayArrayArray114[i][0][i_16_] + f * (float) (anIntArrayArrayArray114[i][1][i_16_] - anIntArrayArrayArray114[i][0][i_16_]));
        f_17_ *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0, (double) (-f_17_ / 20.0F));
    }

    public Class6()
    {
        anIntArrayArrayArray110 = new int[2][2][4];
        anIntArray116 = new int[2];
    }
}
