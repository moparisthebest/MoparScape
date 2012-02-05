/* Class68_Sub13_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub14 extends Class68_Sub13 {
    public static int anInt3665;
    public static int[] anIntArray3666;
    public static int anInt3667;
    public static int anInt3668;
    public static RSString aRSString_3669;
    public static int anInt3670 = -1;
    public static int[][][] anIntArrayArrayArray3671;
    public static int anInt3672;
    public static int anInt3673;
    public static int anInt3674;
    public static int anInt3675;
    public static long[] aLongArray3676;

    public static void method762(int i) {
        if (i == 0) {
            anIntArrayArrayArray3671 = null;
            aRSString_3669 = null;
            aLongArray3676 = null;
            anIntArray3666 = null;
        }
    }

    public Class68_Sub13_Sub14() {
        super(1, false);
    }

    public int[] method698(byte i, int i_0_) {
        if (i != -61)
            method763(64, 69, 4);
        anInt3665++;
        int[] is = aClass115_2936.method1697(false, i_0_);
        if (aClass115_2936.aBoolean1957) {
            for (int i_1_ = 0; i_1_ < Class68_Sub13_Sub19.anInt3746; i_1_++) {
                method763(i_1_, i + 2109, i_0_);
                int[] is_2_ = this.method696(0, Class12.anInt208, 29149);
                is[i_1_] = is_2_[Class112.anInt1891];
            }
        }
        return is;
    }

    public int[][] method697(int i, boolean bool) {
        anInt3672++;
        if (bool != true)
            aLongArray3676 = null;
        int[][] is = aClass88_2939.method1496(i, (byte) -126);
        if (aClass88_2939.aBoolean1610) {
            int[] is_3_ = is[0];
            int[] is_4_ = is[1];
            int[] is_5_ = is[2];
            for (int i_6_ = 0; i_6_ < Class68_Sub13_Sub19.anInt3746; i_6_++) {
                method763(i_6_, 2048, i);
                int[][] is_7_ = this.method699(-79, 0, Class12.anInt208);
                is_3_[i_6_] = is_7_[0][Class112.anInt1891];
                is_4_[i_6_] = is_7_[1][Class112.anInt1891];
                is_5_[i_6_] = is_7_[2][Class112.anInt1891];
            }
        }
        return is;
    }

    public void method700(Stream class68_sub14, int i, int i_8_) {
        anInt3675++;
        if (i_8_ == (i ^ 0xffffffff))
            aBoolean2931 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
    }

    public void method763(int i, int i_9_, int i_10_) {
        anInt3668++;
        int i_11_ = Class68_Sub13_Sub3.anIntArray3479[i];
        int i_12_ = Class13_Sub3.anIntArray2672[i_10_];
        float f = (float) Math.atan2((double) (i_11_ - i_9_),
                (double) (i_12_ + -2048));
        if ((double) f >= -3.141592653589793
                && (double) f <= -2.356194490192345) {
            Class112.anInt1891 = i;
            Class12.anInt208 = i_10_;
        } else if ((double) f <= -1.5707963267948966
                && (double) f >= -2.356194490192345) {
            Class12.anInt208 = i;
            Class112.anInt1891 = i_10_;
        } else if ((double) f <= -0.7853981633974483
                && (double) f >= -1.5707963267948966) {
            Class12.anInt208 = i;
            Class112.anInt1891 = -i_10_ + Class68_Sub13_Sub19.anInt3746;
        } else if (f <= 0.0F && (double) f >= -0.7853981633974483) {
            Class112.anInt1891 = i;
            Class12.anInt208 = Class68_Sub1.anInt2775 - i_10_;
        } else if (!(f >= 0.0F) || !((double) f <= 0.7853981633974483)) {
            if (!((double) f >= 0.7853981633974483)
                    || !((double) f <= 1.5707963267948966)) {
                if ((double) f >= 1.5707963267948966
                        && (double) f <= 2.356194490192345) {
                    Class112.anInt1891 = i_10_;
                    Class12.anInt208 = -i + Class68_Sub1.anInt2775;
                } else if ((double) f >= 2.356194490192345
                        && (double) f <= 3.141592653589793) {
                    Class12.anInt208 = i_10_;
                    Class112.anInt1891 = -i + Class68_Sub13_Sub19.anInt3746;
                }
            } else {
                Class12.anInt208 = Class68_Sub1.anInt2775 + -i;
                Class112.anInt1891 = Class68_Sub13_Sub19.anInt3746 - i_10_;
            }
        } else {
            Class112.anInt1891 = -i + Class68_Sub13_Sub19.anInt3746;
            Class12.anInt208 = Class68_Sub1.anInt2775 + -i_10_;
        }
        Class112.anInt1891 &= Class30.anInt543;
        Class12.anInt208 &= Class1_Sub6_Sub2.anInt3432;
    }

    static {
        anIntArray3666 = new int[1000];
        aRSString_3669
                = RSString.newRsString("3D)2Softwarebibliothek gestartet)3");
        anInt3673 = 2;
        aLongArray3676 = new long[500];
    }
}
