/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class78 {
    public static RSString aRSString_1387 = RSString.newRsString("lila:");
    public static Class21_Sub1 aClass21_Sub1_1388;
    public static RSString aRSString_1389;
    public static int anInt1390;
    public static RSString aRSString_1391 = RSString.newRsString("Ok");
    public static int anInt1392;
    public static int anInt1393;
    public static int[] anIntArray1394;
    public static int anInt1395;
    public static int anInt1396;

    public static void method1410(int i) {
        if (i <= 26)
            method1410(55);
        anInt1395++;
        Class68_Sub8.aClass98_2870.method1566((byte) 94);
    }

    public static void method1411(int i) {
        aRSString_1391 = null;
        aRSString_1389 = null;
        anIntArray1394 = null;
        aClass21_Sub1_1388 = null;
        aRSString_1387 = null;
        if (i != 5756)
            aClass21_Sub1_1388 = null;
    }

    public static void method1412(int i, int i_0_) {
        anInt1390++;
        if (i_0_ == Class70.anInt1287)
            Class1_Sub2.aClass68_Sub28_Sub1_2433.method1239((byte) -114, i);
        else
            Class67.anInt1217 = i;
    }

    public static void method1413(int i, int i_1_, int i_2_, int i_3_,
                                  int i_4_, int i_5_, int i_6_) {
        anInt1393++;
        int i_7_ = i_5_ + i_6_;
        int i_8_ = -i_6_ + i_4_;
        int i_9_ = i_5_;
        if (i_1_ == 16324) {
            for (/**/; i_7_ > i_9_; i_9_++)
                Class34.method416(i_2_, (byte) -17, i,
                        Class68_Sub22.anIntArrayArray3132[i_9_],
                        i_3_);
            for (int i_10_ = i_4_; i_10_ > i_8_; i_10_--)
                Class34.method416(i_2_, (byte) -17, i,
                        Class68_Sub22.anIntArrayArray3132[i_10_],
                        i_3_);
            int i_11_ = i_2_ - -i_6_;
            int i_12_ = i_3_ + -i_6_;
            for (int i_13_ = i_7_; i_13_ <= i_8_; i_13_++) {
                int[] is = Class68_Sub22.anIntArrayArray3132[i_13_];
                Class34.method416(i_2_, (byte) -17, i, is, i_11_);
                Class34.method416(i_12_, (byte) -17, i, is, i_3_);
            }
        }
    }

    public static int method1414(int i, int i_14_, int i_15_, byte i_16_,
                                 int i_17_) {
        anInt1396++;
        if (i_16_ != 25)
            return -88;
        int i_18_
                = -Class62.anIntArray1167[1024 * i / i_17_] + 65536 >> -236413695;
        return ((i_15_ * i_18_ >> 70466704)
                + ((65536 + -i_18_) * i_14_ >> -1130732240));
    }

    static {
        aRSString_1389 = aRSString_1391;
    }
}
