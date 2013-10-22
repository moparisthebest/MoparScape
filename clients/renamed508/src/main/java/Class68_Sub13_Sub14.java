/* Class68_Sub13_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub14 extends Class68_Sub13
{
    static int anInt3667;
    static int[] removeEntityIndices;
    static int menuY;
    static int anInt3670;
    static MutableString aClass100_3671;
    static int anInt3672 = -1;
    static int[][][] anIntArrayArrayArray3673;
    static int anInt3674;
    static int anInt3675;
    static int anInt3676;
    static int anInt3677;
    static long[] menuActionCommands1;

    public static void method762(int i)
    {
        if (i == 0)
        {
            anIntArrayArrayArray3673 = null;
            aClass100_3671 = null;
            menuActionCommands1 = null;
            removeEntityIndices = null;
        }
    }

    public Class68_Sub13_Sub14()
    {
        super(1, false);
    }

    final int[] method698(byte i, int i_0_)
    {
        if (i != -61)
            method763(64, 69, 4);
        anInt3667++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_0_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            for (int i_1_ = 0; i_1_ < Class68_Sub13_Sub19.anInt3748; i_1_++)
            {
                method763(i_1_, i + 2109, i_0_);
                int[] is_2_ = this.method696(0, Class12.anInt208, 29149);
                is[i_1_] = is_2_[Class112.anInt1893];
            }
        }
        return is;
    }

    final int[][] method697(int i, boolean bool)
    {
        anInt3674++;
        if (bool != true)
            menuActionCommands1 = null;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -126);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[] is_3_ = is[0];
            int[] is_4_ = is[1];
            int[] is_5_ = is[2];
            for (int i_6_ = 0; i_6_ < Class68_Sub13_Sub19.anInt3748; i_6_++)
            {
                method763(i_6_, 2048, i);
                int[][] is_7_ = this.method699(-79, 0, Class12.anInt208);
                is_3_[i_6_] = is_7_[0][Class112.anInt1893];
                is_4_[i_6_] = is_7_[1][Class112.anInt1893];
                is_5_[i_6_] = is_7_[2][Class112.anInt1893];
            }
        }
        return is;
    }

    final void method700(Stream class68_sub14, int i, int i_8_)
    {
        do
        {
            try
            {
                anInt3677++;
                if (i_8_ != (i ^ 0xffffffff))
                    break;
                ((Class68_Sub13) this).aBoolean2933 = class68_sub14.readUByte() == 1;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ih.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ')'));
            }
            break;
        } while (false);
    }

    private final void method763(int i, int i_9_, int i_10_)
    {
        anInt3670++;
        int i_11_ = Class68_Sub13_Sub3.anIntArray3481[i];
        int i_12_ = Class13_Sub3.anIntArray2674[i_10_];
        float f = (float) Math.atan2((double) (i_11_ - i_9_), (double) (i_12_ - 2048));
        if ((double) f >= -3.141592653589793 && (double) f <= -2.356194490192345)
        {
            Class112.anInt1893 = i;
            Class12.anInt208 = i_10_;
        } else if ((double) f <= -1.5707963267948966 && (double) f >= -2.356194490192345)
        {
            Class12.anInt208 = i;
            Class112.anInt1893 = i_10_;
        } else if ((double) f <= -0.7853981633974483 && (double) f >= -1.5707963267948966)
        {
            Class12.anInt208 = i;
            Class112.anInt1893 = Class68_Sub13_Sub19.anInt3748 - i_10_;
        } else if (f <= 0.0F && (double) f >= -0.7853981633974483)
        {
            Class112.anInt1893 = i;
            Class12.anInt208 = Ground.anInt2777 - i_10_;
        } else if (!(f >= 0.0F) || !((double) f <= 0.7853981633974483))
        {
            if (!((double) f >= 0.7853981633974483) || !((double) f <= 1.5707963267948966))
            {
                if ((double) f >= 1.5707963267948966 && (double) f <= 2.356194490192345)
                {
                    Class112.anInt1893 = i_10_;
                    Class12.anInt208 = Ground.anInt2777 - i;
                } else if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793)
                {
                    Class12.anInt208 = i_10_;
                    Class112.anInt1893 = Class68_Sub13_Sub19.anInt3748 - i;
                }
            } else
            {
                Class12.anInt208 = Ground.anInt2777 - i;
                Class112.anInt1893 = Class68_Sub13_Sub19.anInt3748 - i_10_;
            }
        } else
        {
            Class112.anInt1893 = Class68_Sub13_Sub19.anInt3748 - i;
            Class12.anInt208 = Ground.anInt2777 - i_10_;
        }
        Class112.anInt1893 &= Class30.anInt543;
        Class12.anInt208 &= Player.anInt3434;
    }

    static
    {
        removeEntityIndices = new int[1000];
        aClass100_3671 = Class112.makeMutableString(43, "3D)2Softwarebibliothek gestartet)3");
        anInt3675 = 2;
        menuActionCommands1 = new long[500];
    }
}
