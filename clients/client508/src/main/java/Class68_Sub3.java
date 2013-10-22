/* Class68_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub3 extends Class68 {
    public static RSString aRSString_2799;
    public int anInt2800;
    public static int anInt2801;
    public static int anInt2802;
    public int anInt2803;
    public static RSString aRSString_2804
            = RSString.newRsString(" <col=ffff00>");
    public static int anInt2805;
    public static int anInt2806;
    public static RSString aRSString_2807;
    public boolean aBoolean2808 = false;
    public static RSString aRSString_2809 = RSString.newRsString("wave2:");
    public static int anInt2810;
    public static int anInt2811;
    public static int anInt2812;

    public static void method651(byte i) {
        if (PlayerDefinition.connection != null) {
            PlayerDefinition.connection.method594(-20);
            PlayerDefinition.connection = null;
        }
        anInt2811++;
        PacketStream.method971(137);
        Class68_Sub13_Sub4.method716();
        for (int i_0_ = 0; i_0_ < 4; i_0_++)
            Class109.aClass38Array1843[i_0_].method444(false);
        if (i > -104)
            method653(true);
        Class68_Sub13_Sub34.method875((byte) 108);
        System.gc();
        Class68_Sub13.method692(2, (byte) 127);
        Class101.anInt1745 = -1;
        Class123.aBoolean2127 = false;
        Class68_Sub13_Sub1.method702(0, true);
        Class68_Sub13_Sub35.anInt4026 = 0;
        Class36.anInt643 = 0;
        Class36.aBoolean640 = false;
        for (int i_1_ = 0;
             ((i_1_ ^ 0xffffffff)
                     > (Class34.aClass23Array594.length ^ 0xffffffff));
             i_1_++)
            Class34.aClass23Array594[i_1_] = null;
        Class13_Sub2.anInt2645 = 0;
        client.anInt2382 = 0;
        for (int i_2_ = 0; i_2_ < 2048; i_2_++) {
            Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_2_] = null;
            Class68_Sub1.aStreamArray2755[i_2_] = null;
        }
        for (int i_3_ = 0; i_3_ < 32768; i_3_++)
            Class102.aClass1_Sub6_Sub1Array1746[i_3_] = null;
        for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -5; i_4_++) {
            for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -105; i_5_++) {
                for (int i_6_ = 0; i_6_ < 104; i_6_++)
                    Class45.aClass16ArrayArrayArray926[i_4_][i_5_][i_6_]
                            = null;
            }
        }
        Class1_Sub6_Sub2.method161(64);
    }

    public static void method652(int i, int i_7_, byte i_8_, RSString class100,
                                 short i_9_, RSString class100_10_, long l) {
        do {
            try {
                anInt2806++;
                if (i_8_ > -51)
                    method654(-54);
                if (!Class120.aBoolean2099) {
                    if (Class68_Sub13_Sub21.anInt3803 >= 500)
                        break;
                    Class71_Sub1.aRSStringArray3257[(Class68_Sub13_Sub21
                            .anInt3803)]
                            = class100_10_;
                    Class33.aRSStringArray582[Class68_Sub13_Sub21.anInt3803]
                            = class100;
                    Class68_Sub28_Sub1.aShortArray4471[(Class68_Sub13_Sub21
                            .anInt3803)]
                            = i_9_;
                    Class68_Sub13_Sub14.aLongArray3676[(Class68_Sub13_Sub21
                            .anInt3803)]
                            = l;
                    Class37.anIntArray654[Class68_Sub13_Sub21.anInt3803] = i;
                    Class68_Sub13_Sub37.anIntArray4075[(Class68_Sub13_Sub21
                            .anInt3803)]
                            = i_7_;
                    Class68_Sub13_Sub21.anInt3803++;
                }
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("be.D(" + i + ',' + i_7_ + ','
                                + i_8_ + ','
                                + (class100 != null ? "{...}"
                                : "null")
                                + ',' + i_9_ + ','
                                + (class100_10_ != null ? "{...}"
                                : "null")
                                + ',' + l + ')'));
            }
            break;
        } while (false);
    }

    public static void method653(boolean bool) {
        aRSString_2807 = null;
        if (bool == true) {
            aRSString_2799 = null;
            aRSString_2809 = null;
            aRSString_2804 = null;
        }
    }

    public static void method654(int i) {
        anInt2802++;
        if (i == 0)
            Class96.aClass98_1694.method1566((byte) 94);
    }

    public static boolean method655(int i, int i_11_) {
        anInt2801++;
        if (i_11_ != 1)
            return false;
        if ((0x1 & i) == 0)
            return false;
        return true;
    }

    static {
        aRSString_2799 = aRSString_2809;
        anInt2812 = 0;
        anInt2805 = 0;
        aRSString_2807 = aRSString_2809;
    }
}
