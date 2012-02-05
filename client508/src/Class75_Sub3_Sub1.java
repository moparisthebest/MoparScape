/* Class75_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75_Sub3_Sub1 extends Class75_Sub3 {
    public static int anInt4592;
    public static int anInt4593;
    public static int anInt4594;
    public static int anInt4595 = 0;
    public static RSString aRSString_4596 = RSString.newRsString(")3");
    public static boolean aBoolean4597;
    public static short aShort4598 = 32767;
    public static int[] anIntArray4599;
    public static int anInt4600;
    public static int[][] anIntArrayArray4601;

    public static void method1401(int i, int i_0_, int i_1_, int i_2_,
                                  byte i_3_, int i_4_) {
        int i_5_ = i_1_;
        anInt4593++;
        int i_6_ = 0;
        int i_7_ = i_2_ * i_2_;
        int i_8_ = i_1_ * i_1_;
        if (i_3_ != 47)
            aShort4598 = (short) -19;
        int i_9_ = i_8_ << -779863583;
        int i_10_ = i_7_ << -1518401439;
        int i_11_ = i_1_ << -595804831;
        int i_12_ = -((i_11_ - 1) * i_10_) + i_8_;
        int i_13_ = i_9_ + i_7_ * (1 + -i_11_);
        int i_14_ = i_7_ << 1303195234;
        int i_15_ = i_8_ << -794882078;
        int i_16_ = i_10_ * ((i_5_ << -660150431) - 3);
        int i_17_ = i_9_ * (3 + (i_6_ << -1741293663));
        int i_18_ = i_15_ * (1 + i_6_);
        int i_19_ = (-1 + i_5_) * i_14_;
        if (Class35.anInt605 <= i_0_
                && (Class51.anInt2255 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff)) {
            int i_20_
                    = Class68_Sub20_Sub15.method1171(i_2_ + i, Class113.anInt1918,
                    (byte) 114, GroundData.anInt677);
            int i_21_
                    = Class68_Sub20_Sub15.method1171(-i_2_ + i, Class113.anInt1918,
                    (byte) 114, GroundData.anInt677);
            Class34.method416(i_21_, (byte) -17, i_4_,
                    Class68_Sub22.anIntArrayArray3132[i_0_], i_20_);
        }
        while ((i_5_ ^ 0xffffffff) < -1) {
            i_5_--;
            if (i_13_ < 0) {
                while ((i_13_ ^ 0xffffffff) > -1) {
                    i_13_ += i_17_;
                    i_12_ += i_18_;
                    i_18_ += i_15_;
                    i_17_ += i_15_;
                    i_6_++;
                }
            }
            int i_22_ = i_0_ + -i_5_;
            int i_23_ = i_5_ + i_0_;
            if ((i_12_ ^ 0xffffffff) > -1) {
                i_6_++;
                i_13_ += i_17_;
                i_12_ += i_18_;
                i_18_ += i_15_;
                i_17_ += i_15_;
            }
            i_13_ += -i_19_;
            i_12_ += -i_16_;
            if ((Class35.anInt605 ^ 0xffffffff) >= (i_23_ ^ 0xffffffff)
                    && Class51.anInt2255 >= i_22_) {
                int i_24_ = Class68_Sub20_Sub15.method1171(i_6_ + i,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                int i_25_ = Class68_Sub20_Sub15.method1171(-i_6_ + i,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                if ((Class35.anInt605 ^ 0xffffffff) >= (i_22_ ^ 0xffffffff))
                    Class34.method416(i_25_, (byte) -17, i_4_,
                            Class68_Sub22.anIntArrayArray3132[i_22_],
                            i_24_);
                if (i_23_ <= Class51.anInt2255)
                    Class34.method416(i_25_, (byte) -17, i_4_,
                            Class68_Sub22.anIntArrayArray3132[i_23_],
                            i_24_);
            }
            i_16_ -= i_14_;
            i_19_ -= i_14_;
        }
    }

    public static void method1402(int i) {
        if (i != 1)
            method1401(81, -116, -60, 54, (byte) -84, -25);
        aRSString_4596 = null;
        anIntArray4599 = null;
        anIntArrayArray4601 = null;
    }

    public static void method1403(boolean bool, int i) {
        anInt4594++;
        if (i == 1) {
            Class23.aBoolean501 = bool;
            Class68_Sub13_Sub16.aBoolean3709 = !Class28.method398(24781);
        }
    }

    static {
        aBoolean4597 = false;
        anIntArrayArray4601 = new int[5][5000];
        anIntArray4599 = new int[]{2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2};
    }
}
