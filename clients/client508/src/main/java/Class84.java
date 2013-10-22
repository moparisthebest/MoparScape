/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class84 implements Runnable {
    public static int anInt1531;
    public static Class21_Sub1 aClass21_Sub1_1532;
    public boolean aBoolean1533 = true;
    public static int anInt1534;
    public static int anInt1535;
    public static RSString aRSString_1536;
    public static Class21renamed aClass21_1537;
    public static RSString aRSString_1538
            = RSString.newRsString(" loggt sich ein)3");
    public static RSString aRSString_1539;
    public static int anInt1540;
    public static RSString aRSString_1541;
    public static int anInt1542;
    public Object anObject1543 = new Object();
    public int[] anIntArray1544 = new int[500];
    public int anInt1545;
    public int[] anIntArray1546 = new int[500];

    public static void method1476(int i, Class92_Sub1 class92_sub1) {
        int i_0_ = 256;
        for (int i_1_ = 0; Class68_Sub20_Sub6.anIntArray4230.length > i_1_;
             i_1_++)
            Class68_Sub20_Sub6.anIntArray4230[i_1_] = 0;
        anInt1542++;
        if (i < 72)
            aClass21_1537 = null;
        for (int i_2_ = 0; i_2_ < 5000; i_2_++) {
            int i_3_ = (int) (128.0 * Math.random() * (double) i_0_);
            Class68_Sub20_Sub6.anIntArray4230[i_3_]
                    = (int) (284.0 * Math.random());
        }
        for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -21; i_4_++) {
            for (int i_5_ = 1; -1 + i_0_ > i_5_; i_5_++) {
                for (int i_6_ = 1; (i_6_ ^ 0xffffffff) > -128; i_6_++) {
                    int i_7_ = (i_5_ << -468912249) + i_6_;
                    Class68_Sub19.anIntArray3077[i_7_]
                            = (Class68_Sub20_Sub6.anIntArray4230[i_7_ + -1]
                            + (Class68_Sub20_Sub6.anIntArray4230[i_7_ - -1]
                            + Class68_Sub20_Sub6.anIntArray4230[-128 + i_7_]
                            + (Class68_Sub20_Sub6.anIntArray4230
                            [i_7_ + 128]))) / 4;
                }
            }
            int[] is = Class68_Sub20_Sub6.anIntArray4230;
            Class68_Sub20_Sub6.anIntArray4230 = Class68_Sub19.anIntArray3077;
            Class68_Sub19.anIntArray3077 = is;
        }
        if (class92_sub1 != null) {
            int i_8_ = 0;
            for (int i_9_ = 0;
                 (i_9_ ^ 0xffffffff) > (class92_sub1.anInt1658 ^ 0xffffffff);
                 i_9_++) {
                for (int i_10_ = 0; ((class92_sub1.anInt1659 ^ 0xffffffff)
                        < (i_10_ ^ 0xffffffff)); i_10_++) {
                    if (class92_sub1.aByteArray3332[i_8_++] != 0) {
                        int i_11_ = class92_sub1.anInt1657 + (16 + i_10_);
                        int i_12_ = i_9_ + (16 + class92_sub1.anInt1655);
                        int i_13_ = i_11_ - -(i_12_ << 453988551);
                        Class68_Sub20_Sub6.anIntArray4230[i_13_] = 0;
                    }
                }
            }
        }
    }

    public void run() {
        anInt1534++;
        while (aBoolean1533) {
            synchronized (anObject1543) {
                if (anInt1545 < 500) {
                    anIntArray1544[anInt1545] = Class96.anInt1695;
                    anIntArray1546[anInt1545] = Class13.anInt223;
                    anInt1545++;
                }
            }
            Class50.method528(-5, 50L);
        }
    }

    public static void method1477(byte i) {
        aClass21_Sub1_1532 = null;
        aRSString_1539 = null;
        aRSString_1538 = null;
        aRSString_1541 = null;
        if (i == -127) {
            aRSString_1536 = null;
            aClass21_1537 = null;
        }
    }

    public static void method1478(int i, int i_14_, int i_15_, byte i_16_,
                                  int i_17_, int i_18_) {
        if (i_16_ >= 48) {
            if ((GroundData.anInt677 ^ 0xffffffff) >= (i_15_ ^ 0xffffffff)
                    && (i_17_ ^ 0xffffffff) >= (Class113.anInt1918 ^ 0xffffffff)
                    && i >= Class35.anInt605
                    && (i_18_ ^ 0xffffffff) >= (Class51.anInt2255 ^ 0xffffffff))
                Class102.method1628(i, true, i_18_, i_17_, i_15_, i_14_);
            else
                Class121.method1741(i, i_18_, i_17_, i_15_, -115, i_14_);
            anInt1531++;
        }
    }

    public Class84() {
        anInt1545 = 0;
    }

    static {
        anInt1535 = -1;
        aRSString_1541 = RSString.newRsString("Unable to find ");
        anInt1540 = 0;
        aRSString_1539 = RSString.newRsString("Versteckt");
        aRSString_1536 = aRSString_1541;
    }
}
