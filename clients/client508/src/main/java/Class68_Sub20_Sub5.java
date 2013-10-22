/* Class68_Sub20_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub5 extends Class68_Sub20 {
    public static int anInt4220 = 0;
    public static Class21_Sub1 aClass21_Sub1_4221;
    public Class1_Sub5 aClass1_Sub5_4222;
    public static RSString aRSString_4223;
    public static int anInt4224;
    public static int anInt4225;
    public static int anInt4226 = 0;
    public static int anInt4227;
    public static RSString aRSString_4228;
    public static int anInt4229;

    public Class68_Sub20_Sub5(Class1_Sub5 class1_sub5) {
        aClass1_Sub5_4222 = class1_sub5;
    }

    public static void method1062(Animable class1, int i, int i_0_, int i_1_) {
        if (i_0_ < Applet_Sub1.anInt7) {
            Class68_Sub1 class68_sub1
                    = Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_ + 1][i_1_];
            if (class68_sub1 != null && class68_sub1.aClass47_2777 != null
                    && class68_sub1.aClass47_2777.aClass1_931.method58())
                class1.method52(class68_sub1.aClass47_2777.aClass1_931, 128, 0,
                        0, true);
        }
        if (i_1_ < Applet_Sub1.anInt7) {
            Class68_Sub1 class68_sub1
                    = Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_][i_1_ + 1];
            if (class68_sub1 != null && class68_sub1.aClass47_2777 != null
                    && class68_sub1.aClass47_2777.aClass1_931.method58())
                class1.method52(class68_sub1.aClass47_2777.aClass1_931, 0, 0,
                        128, true);
        }
        if (i_0_ < Applet_Sub1.anInt7 && i_1_ < Class97.anInt1714) {
            Class68_Sub1 class68_sub1
                    = (Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_ + 1]
                    [i_1_ + 1]);
            if (class68_sub1 != null && class68_sub1.aClass47_2777 != null
                    && class68_sub1.aClass47_2777.aClass1_931.method58())
                class1.method52(class68_sub1.aClass47_2777.aClass1_931, 128, 0,
                        128, true);
        }
        if (i_0_ < Applet_Sub1.anInt7 && i_1_ > 0) {
            Class68_Sub1 class68_sub1
                    = (Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_ + 1]
                    [i_1_ - 1]);
            if (class68_sub1 != null && class68_sub1.aClass47_2777 != null
                    && class68_sub1.aClass47_2777.aClass1_931.method58())
                class1.method52(class68_sub1.aClass47_2777.aClass1_931, 128, 0,
                        -128, true);
        }
    }

    public static void method1063(int i) {
        int i_2_ = 117 % ((-51 - i) / 42);
        aRSString_4223 = null;
        aClass21_Sub1_4221 = null;
        aRSString_4228 = null;
    }

    static {
        aRSString_4223 = RSString.newRsString("_");
        anInt4225 = 0;
        anInt4229 = 0;
        aRSString_4228 = (RSString.newRsString
                ("Clientscript error_fatal )2 check log for details"));
    }
}
