/* Class68_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub1 extends Class68_Sub13 {
    public static int anInt3448;
    public static int anInt3449;
    public static int anInt3450;
    public static int anInt3451;
    public static RSString aRSString_3452 = null;
    public static int anInt3453;
    public static int anInt3454;
    public static short aShort3455;

    public static void method702(int i, boolean bool) {
        for (Class68_Sub18 class68_sub18
                     = (Class68_Sub18) Class8.aClass16_140.method293((byte) 76);
             class68_sub18 != null;
             class68_sub18
                     = (Class68_Sub18) Class8.aClass16_140.method290((byte) 41)) {
            if (class68_sub18.aClass68_Sub28_Sub3_3040 != null) {
                Class80.aClass68_Sub28_Sub4_1418
                        .method1314(class68_sub18.aClass68_Sub28_Sub3_3040);
                class68_sub18.aClass68_Sub28_Sub3_3040 = null;
            }
            if (class68_sub18.aClass68_Sub28_Sub3_3049 != null) {
                Class80.aClass68_Sub28_Sub4_1418
                        .method1314(class68_sub18.aClass68_Sub28_Sub3_3049);
                class68_sub18.aClass68_Sub28_Sub3_3049 = null;
            }
            class68_sub18.method647(-17554);
        }
        anInt3451++;
        if (i == 0) {
            if (bool) {
                for (Class68_Sub18 class68_sub18
                             = ((Class68_Sub18)
                        Class51.aClass16_2251.method293((byte) 76));
                     class68_sub18 != null;
                     class68_sub18
                             = ((Class68_Sub18)
                             Class51.aClass16_2251.method290((byte) -127))) {
                    if (class68_sub18.aClass68_Sub28_Sub3_3040 != null) {
                        Class80.aClass68_Sub28_Sub4_1418.method1314
                                (class68_sub18.aClass68_Sub28_Sub3_3040);
                        class68_sub18.aClass68_Sub28_Sub3_3040 = null;
                    }
                    class68_sub18.method647(-17554);
                }
                for (Class68_Sub18 class68_sub18
                             = ((Class68_Sub18)
                        Class1_Sub5.aClass113_2509.method1679(-32642));
                     class68_sub18 != null;
                     class68_sub18
                             = (Class68_Sub18) Class1_Sub5.aClass113_2509
                             .method1683((byte) -105)) {
                    if (class68_sub18.aClass68_Sub28_Sub3_3040 != null) {
                        Class80.aClass68_Sub28_Sub4_1418.method1314
                                (class68_sub18.aClass68_Sub28_Sub3_3040);
                        class68_sub18.aClass68_Sub28_Sub3_3040 = null;
                    }
                    class68_sub18.method647(-17554);
                }
            }
        }
    }

    public static void method703(boolean bool, int i, int i_0_, int i_1_,
                                 int i_2_, int i_3_) {
        Class68_Sub20_Sub15.anInt4397 = (short) i;
        anInt3450++;
        Class34.anInt592 = (short) i_1_;
        if (i_2_ >= -65)
            aShort3455 = (short) -98;
    }

    public int[] method698(byte i, int i_4_) {
        if (i != -61)
            aRSString_3452 = null;
        anInt3454++;
        return Class68_Sub13_Sub3.anIntArray3479;
    }

    public Class68_Sub13_Sub1() {
        super(0, true);
    }

    public static void method704(byte i) {
        aRSString_3452 = null;
        if (i != -57)
            method703(true, -90, -110, 25, 4, 82);
    }

    public static void method705(int i, int i_5_, int i_6_, int i_7_, int i_8_,
                                 int i_9_, int i_10_, int i_11_, int i_12_) {
        int i_13_ = 0;
        if (i_12_ >= 53) {
            for (/**/; Class102.aClass91_1756.anInt1637 > i_13_; i_13_++) {
                int i_14_ = (-Class70.anInt1273
                        + Class102.aClass91_1756.aShortArray1631[i_13_]);
                int i_15_
                        = (Class103.anInt1768
                        - (1 - (-Class102.aClass91_1756.aShortArray1634[i_13_]
                        - -Class68_Sub1.anInt2760)));
                int i_16_
                        = (i_9_ - i_7_) * (i_14_ - i_11_) / (i_10_ - i_11_) + i_7_;
                int i_17_
                        = i_5_ - -((-i_5_ + i_6_) * (i_15_ - i_8_) / (-i_8_ + i));
                int i_18_ = 16777215;
                int i_19_ = Class102.aClass91_1756.method1525(-67, i_13_);
                Class65 class65 = null;
                if ((i_19_ ^ 0xffffffff) == -1) {
                    if ((double) Class68_Sub9.aFloat2892 == 3.0)
                        class65 = Class68_Sub13_Sub27.aClass65_3912;
                    if ((double) Class68_Sub9.aFloat2892 == 4.0)
                        class65 = Class68_Sub10.aClass65_2912;
                    if ((double) Class68_Sub9.aFloat2892 == 6.0)
                        class65 = Class68_Sub16.aClass65_3031;
                    if ((double) Class68_Sub9.aFloat2892 == 8.0)
                        class65 = Class55.aClass65_2036;
                }
                if ((i_19_ ^ 0xffffffff) == -2) {
                    if ((double) Class68_Sub9.aFloat2892 == 3.0)
                        class65 = Class68_Sub16.aClass65_3031;
                    if ((double) Class68_Sub9.aFloat2892 == 4.0)
                        class65 = Class55.aClass65_2036;
                    if ((double) Class68_Sub9.aFloat2892 == 6.0)
                        class65 = Class104.aClass65_1787;
                    if ((double) Class68_Sub9.aFloat2892 == 8.0)
                        class65 = Class72.aClass65_1305;
                }
                if (i_19_ == 2) {
                    i_18_ = 16755200;
                    if ((double) Class68_Sub9.aFloat2892 == 3.0)
                        class65 = Class104.aClass65_1787;
                    if ((double) Class68_Sub9.aFloat2892 == 4.0)
                        class65 = Class72.aClass65_1305;
                    if ((double) Class68_Sub9.aFloat2892 == 6.0)
                        class65 = Class75.aClass65_1344;
                    if ((double) Class68_Sub9.aFloat2892 == 8.0)
                        class65 = Class68_Sub20_Sub16.aClass65_4417;
                }
                if (Class102.aClass91_1756.anIntArray1640[i_13_] != -1)
                    i_18_ = Class102.aClass91_1756.anIntArray1640[i_13_];
                if (class65 != null) {
                    RSString[] class100s
                            = (new RSString
                            [1 + Class102.aClass91_1756.aRSStringArray1635
                            [i_13_].method1596(60, 74)]);
                    Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3801.method1013
                            (Class102.aClass91_1756.aRSStringArray1635[i_13_],
                                    null, class100s);
                    int i_20_ = class100s.length;
                    i_17_ -= class65.method627() * (-1 + i_20_) / 2;
                    i_17_ += class65.method629() / 2;
                    for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
                        RSString class100
                                = (i_20_ + -1 == i_21_ ? class100s[i_21_]
                                : (class100s[i_21_].method1607
                                (0, (byte) -74,
                                        -4 + class100s[i_21_]
                                                .method1590((byte) -112))));
                        class65.method630(class100, i_16_, i_17_, i_18_, true);
                        i_17_ += class65.method627();
                    }
                }
            }
            anInt3449++;
        }
    }

    public static void method706(boolean bool) {
        if (bool) {
            Class68_Sub20_Sub12.anIntArrayArrayArray4353
                    = Class68_Sub13_Sub14.anIntArrayArrayArray3671;
            Class22.aClass68_Sub1ArrayArrayArray484
                    = Class113.aClass68_Sub1ArrayArrayArray1919;
        } else {
            Class68_Sub20_Sub12.anIntArrayArrayArray4353
                    = Class74.anIntArrayArrayArray1335;
            Class22.aClass68_Sub1ArrayArrayArray484
                    = Class108.aClass68_Sub1ArrayArrayArray1833;
        }
        Class86.anInt1582 = Class22.aClass68_Sub1ArrayArrayArray484.length;
    }

    static {
        anInt3448 = 0;
        anInt3453 = 3353893;
        aShort3455 = (short) 1;
    }
}
