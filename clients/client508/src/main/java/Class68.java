/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68 {
    public long aLong1218;
    public static int[] anIntArray1219;
    public static int anInt1220;
    public static int anInt1221;
    public static Class69[] aClass69Array1222 = new Class69[5000];
    public static RSString aRSString_1223
            = RSString.newRsString("<col=ffffff>");
    public static int anInt1224;
    public static byte aByte1225;
    public static int anInt1226;
    public Class68 aClass68_1227;
    public static Class21_Sub1 aClass21_Sub1_1228;
    public Class68 aClass68_1229;
    public static RSString aRSString_1230;
    public static Class45 aClass45_1231;
    public static int anInt1232;

    public static void method643(int i) {
        aRSString_1230 = null;
        aClass69Array1222 = null;
        anIntArray1219 = null;
        int i_0_ = -117 / ((i - -67) / 42);
        aClass45_1231 = null;
        aRSString_1223 = null;
        aClass21_Sub1_1228 = null;
    }

    public static boolean method644(int i, int i_1_) {
        anInt1224++;
        if (i_1_ != 1424444319)
            return true;
        if ((0x1 & i >> 1424444319) == 0)
            return false;
        return true;
    }

    public static void method645(boolean bool, byte i) {
        anInt1220++;
        if (i >= -13)
            method644(-38, -97);
        int i_2_ = 4;
        byte[][] is = Class23.aByteArrayArray490;
        for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
            Class49.method524(16322);
            for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -14; i_4_++) {
                for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -14; i_5_++) {
                    int i_6_ = (Class68_Sub2.anIntArrayArrayArray2796[i_3_]
                            [i_4_][i_5_]);
                    boolean bool_7_ = false;
                    if (i_6_ != -1) {
                        int i_8_ = (0x36b78c8 & i_6_) >> 92564152;
                        if (!bool || i_8_ == 0) {
                            int i_9_ = (i_6_ & 0xffda27) >> 171936078;
                            int i_10_ = (0x6 & i_6_) >> 121929409;
                            int i_11_ = (i_6_ & 0x3ffe) >> 21854147;
                            int i_12_
                                    = (i_9_ / 8 << -1838768664) - -(i_11_ / 8);
                            for (int i_13_ = 0;
                                 ((i_13_ ^ 0xffffffff)
                                         > (Class119.anIntArray2089.length
                                         ^ 0xffffffff));
                                 i_13_++) {
                                if (Class119.anIntArray2089[i_13_] == i_12_
                                        && is[i_13_] != null) {
                                    bool_7_ = true;
                                    Class68_Sub20_Sub16.method1173
                                            ((i_9_ & 0x7) * 8, false, i_4_ * 8,
                                                    is[i_13_], 8 * (0x7 & i_11_),
                                                    Class109.aClass38Array1843, i_10_,
                                                    i_3_, bool, i_8_, i_5_ * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!bool_7_)
                        Class68_Sub13_Sub37.method893(8, -81, 8, i_3_,
                                i_5_ * 8, 8 * i_4_);
                }
            }
        }
    }

    public boolean method646(int i) {
        anInt1221++;
        if (aClass68_1227 == null)
            return false;
        if (i <= 64)
            method643(-119);
        return true;
    }

    public void method647(int i) {
        anInt1226++;
        if (aClass68_1227 != null && i == -17554) {
            aClass68_1227.aClass68_1229 = aClass68_1229;
            aClass68_1229.aClass68_1227 = aClass68_1227;
            aClass68_1227 = null;
            aClass68_1229 = null;
        }
    }

    static {
        anIntArray1219 = new int[256];
        for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
            int i_14_ = i;
            for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -9; i_15_++) {
                if ((0x1 & i_14_ ^ 0xffffffff) != -2)
                    i_14_ >>>= 1;
                else
                    i_14_ = ~0x12477cdf ^ i_14_ >>> -959825663;
            }
            anIntArray1219[i] = i_14_;
        }
        anInt1232 = 0;
        aRSString_1230 = RSString.newRsString("Lade)3)3)3");
    }
}
