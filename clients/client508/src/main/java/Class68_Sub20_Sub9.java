/* Class68_Sub20_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub9 extends Class68_Sub20 {
    public static int anInt4291;
    public static int anInt4292;
    public int anInt4293;
    public static RSString aRSString_4294 = RSString.newRsString(":");
    public static int anInt4295;
    public static int anInt4296;
    public static int anInt4297;
    public static int anInt4298;
    public static int anInt4299;
    public RSString aRSString_4300;
    public static int anInt4301;

    public int method1096(int i) {
        anInt4297++;
        if (i != -1597153401)
            method1101((byte) -37);
        return (int) aLong1218;
    }

    public void method1097(int i) {
        anInt4296++;
        aLong3085 |= ~0x7fffffffffffffffL;
        if ((long) i == method1098(i + 255))
            Class30.aClass128_550.method1787(i ^ 0x4b, this);
    }

    public long method1098(int i) {
        if (i != 255)
            aRSString_4294 = null;
        anInt4299++;
        return aLong3085 & 0x7fffffffffffffffL;
    }

    public static void method1099(boolean bool) {
        if (bool != false)
            anInt4295 = 85;
        aRSString_4294 = null;
    }

    public static void method1100(int i, byte i_0_, int i_1_) {
        anInt4298++;
        Class16 class16
                = Class45.aClass16ArrayArrayArray926[GameSocket.anInt1149][i][i_1_];
        if (class16 == null)
            Class68_Sub13_Sub22.method811(GameSocket.anInt1149, i, i_1_);
        else {
            if (i_0_ != -52)
                method1100(-71, (byte) -68, -62);
            int i_2_ = -99999999;
            Class68_Sub20_Sub18 class68_sub20_sub18
                    = (Class68_Sub20_Sub18) class16.method293((byte) 76);
            Class68_Sub20_Sub18 class68_sub20_sub18_3_ = null;
            for (/**/; class68_sub20_sub18 != null;
                     class68_sub20_sub18
                             = (Class68_Sub20_Sub18) class16.method290((byte) 67)) {
                ItemDef class19
                        = Applet_Sub1.method18(-25672,
                        (class68_sub20_sub18
                                .aClass1_Sub2_4445.anInt2431));
                int i_4_ = class19.anInt375;
                if ((class19.anInt381 ^ 0xffffffff) == -2)
                    i_4_
                            *= 1 + class68_sub20_sub18.aClass1_Sub2_4445.anInt2436;
                if ((i_2_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
                    i_2_ = i_4_;
                    class68_sub20_sub18_3_ = class68_sub20_sub18;
                }
            }
            if (class68_sub20_sub18_3_ == null)
                Class68_Sub13_Sub22.method811(GameSocket.anInt1149, i, i_1_);
            else {
                class16.method291((byte) 43, class68_sub20_sub18_3_);
                class68_sub20_sub18
                        = (Class68_Sub20_Sub18) class16.method293((byte) 76);
                Class1_Sub2 class1_sub2 = null;
                Class1_Sub2 class1_sub2_5_ = null;
                for (/**/; class68_sub20_sub18 != null;
                         class68_sub20_sub18 = ((Class68_Sub20_Sub18)
                                 class16.method290((byte) -125))) {
                    Class1_Sub2 class1_sub2_6_
                            = class68_sub20_sub18.aClass1_Sub2_4445;
                    if ((class1_sub2_6_.anInt2431 ^ 0xffffffff)
                            != (class68_sub20_sub18_3_.aClass1_Sub2_4445.anInt2431
                            ^ 0xffffffff)) {
                        if (class1_sub2_5_ == null)
                            class1_sub2_5_ = class1_sub2_6_;
                        if ((class1_sub2_5_.anInt2431
                                != class1_sub2_6_.anInt2431)
                                && class1_sub2 == null)
                            class1_sub2 = class1_sub2_6_;
                    }
                }
                long l = (long) (1610612736 + ((i_1_ << -1597153401) + i));
                Class1_Sub7.method169(GameSocket.anInt1149, i, i_1_,
                        Class1_Sub6_Sub2.method163(i * 128 + 64,
                                (GameSocket
                                        .anInt1149),
                                (128 * i_1_
                                        - -64),
                                false),
                        class68_sub20_sub18_3_.aClass1_Sub2_4445,
                        l, class1_sub2_5_, class1_sub2);
            }
        }
    }

    public Class68_Sub20_Sub9(int i, int i_7_) {
        aLong1218 = (long) i << -221728608 | (long) i_7_;
    }

    public void method1101(byte i) {
        int i_8_ = 17 / ((i - 9) / 37);
        aLong3085 = (~0x7fffffffffffffffL & aLong3085
                | 500L + Class36.method438(17161));
        Class13_Sub3.aClass128_2662.method1787(124, this);
        anInt4301++;
    }

    public int method1102(boolean bool) {
        anInt4292++;
        if (bool != false)
            method1099(true);
        return (int) (0xffL & aLong1218 >>> -1198268384);
    }

    static {
        anInt4291 = 0;
        anInt4295 = 0;
    }
}
