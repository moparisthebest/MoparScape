/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class22 {
    public static int anInt481;
    public static int anInt482 = 0;
    public static int anInt483 = 0;
    public static Class68_Sub1[][][] aClass68_Sub1ArrayArrayArray484;
    public static int anInt485;
    public static int anInt486;
    public static int anInt487;
    public static RSString aRSString_488;

    public static void method373(byte i) {
        Class68_Sub13_Sub8.inStream.method965(122);
        anInt487++;
        int i_0_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 8);
        if ((i_0_ ^ 0xffffffff) > (Class13_Sub2.anInt2645 ^ 0xffffffff)) {
            for (int i_1_ = i_0_;
                 (Class13_Sub2.anInt2645 ^ 0xffffffff) < (i_1_ ^ 0xffffffff);
                 i_1_++)
                Class68_Sub13_Sub14.anIntArray3666
                        [Class75_Sub3_Sub1.anInt4595++]
                        = Class68_Sub10.anIntArray2906[i_1_];
        }
        if ((i_0_ ^ 0xffffffff) < (Class13_Sub2.anInt2645 ^ 0xffffffff))
            throw new RuntimeException("gnpov1");
        Class13_Sub2.anInt2645 = 0;
        int i_2_ = 0;
        int i_3_ = 112 / ((46 - i) / 63);
        for (/**/; (i_2_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_2_++) {
            int i_4_ = Class68_Sub10.anIntArray2906[i_2_];
            Class1_Sub6_Sub1 class1_sub6_sub1 = Class102.aClass1_Sub6_Sub1Array1746[i_4_];
            int i_5_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
            if (i_5_ == 0) {
                Class68_Sub10.anIntArray2906[Class13_Sub2.anInt2645++] = i_4_;
                class1_sub6_sub1.anInt2575 = Class68_Sub3.anInt2812;
            } else {
                int i_6_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 2);
                if (i_6_ == 0) {
                    Class68_Sub10.anIntArray2906[Class13_Sub2.anInt2645++] = i_4_;
                    class1_sub6_sub1.anInt2575 = Class68_Sub3.anInt2812;
                    PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = i_4_;
                } else if (i_6_ == 1) {
                    Class68_Sub10.anIntArray2906[Class13_Sub2.anInt2645++] = i_4_;
                    class1_sub6_sub1.anInt2575 = Class68_Sub3.anInt2812;
                    int i_7_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 3);
                    class1_sub6_sub1.method151(false, i_7_, (byte) 21);
                    int i_8_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
                    if (i_8_ == 1)
                        PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = i_4_;
                } else if (i_6_ == 2) {
                    Class68_Sub10.anIntArray2906[Class13_Sub2.anInt2645++] = i_4_;
                    class1_sub6_sub1.anInt2575 = Class68_Sub3.anInt2812;
                    int i_9_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 3);
                    class1_sub6_sub1.method151(true, i_9_, (byte) 21);
                    int i_10_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 3);
                    class1_sub6_sub1.method151(true, i_10_, (byte) 21);
                    int i_11_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
                    if (i_11_ == 1)
                        PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = i_4_;
                } else if (i_6_ == 3)
                    Class68_Sub13_Sub14.anIntArray3666[Class75_Sub3_Sub1.anInt4595++] = i_4_;
            }
        }
    }

    public static void method374(byte i, Class21renamed class21) {
        if (i != 58)
            method374((byte) 95, null);
        anInt486++;
        Class66.aClass21_1203 = class21;
    }

    public static void method375(int i) {
        aClass68_Sub1ArrayArrayArray484 = null;
        aRSString_488 = null;
        if (i < 30)
            aClass68_Sub1ArrayArrayArray484 = null;
    }

    static {
        anInt481 = -1;
        anInt485 = 0;
        aRSString_488 = RSString.newRsString("compass");
    }
}
