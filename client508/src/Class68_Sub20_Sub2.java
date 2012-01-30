/* Class68_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class68_Sub20_Sub2 extends Class68_Sub20 {
    public int anInt4181 = 0;
    public static int anInt4182;
    public static int anInt4183;
    public static int anInt4184;
    public static int anInt4185;
    public static int anInt4186;
    public static int anInt4187;
    public static boolean aBoolean4188 = true;
    public static int anInt4189 = 0;
    public static Font aFont4190;
    public static int anInt4191;

    public static void method1039(GroundData class38, int i, int i_0_, int i_1_,
                                  int i_2_, int i_3_, int i_4_) {
        long l = 0L;
        anInt4183++;
        if (i_2_ <= 10)
            method1043((byte) 55);
        boolean bool = false;
        int i_5_ = -1;
        if (i != 0) {
            if (i == 1)
                l = Class68_Sub13_Sub36.method883(i_1_, i_4_, i_3_);
            else if (i != 2) {
                if (i == 3)
                    l = Unknown.method1506(i_1_, i_4_, i_3_);
            } else
                l = Class68_Sub13_Sub9.method738(i_1_, i_4_, i_3_);
        } else
            l = Class107.method1650(i_1_, i_4_, i_3_);
        i_5_ = 0x7fffffff & (int) (l >>> -2076799584);
        boolean bool_6_ = false;
        int i_7_ = ((int) l & 0x3e7935) >> -125238508;
        Class116 class116 = Class1_Sub5.method140(107, i_5_);
        if (class116.method1707((byte) -6))
            Class68_Sub13_Sub21.method809(i_3_, class116, i_1_, (byte) 18,
                    i_4_);
        int i_8_ = 0x1f & (int) l >> -348570866;
        do {
            if ((l ^ 0xffffffffffffffffL) != -1L) {
                if (i != 0) {
                    if ((i ^ 0xffffffff) == -2) {
                        Class76 class76 = Class15.method279(i_1_, i_4_, i_3_);
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                Class47 class47
                                        = Class68_Sub13_Sub22.method812(i_1_, i_4_,
                                        i_3_);
                                if ((class116.anInt2022 ^ 0xffffffff) == -2)
                                    class38.method447(i_4_, -262145, i_3_);
                            }
                        } else {
                            Class69 class69
                                    = Class68_Sub20_Sub18.method1186(i_1_, i_4_,
                                    i_3_);
                            if ((class116.anInt2022 ^ 0xffffffff) == -1
                                    || ((class116.anInt1988 + i_4_ ^ 0xffffffff)
                                    <= -105)
                                    || i_3_ + class116.anInt1988 >= 104
                                    || i_4_ + class116.anInt1987 >= 104
                                    || class116.anInt1987 + i_3_ >= 104)
                                break;
                            class38.method454(class116.anInt1987, i_4_,
                                    class116.anInt1988, i_7_, i_3_,
                                    class116.aBoolean2030,
                                    (byte) 82);
                        }
                        break;
                    }
                    break;
                }
                Class64 class64 = Class68_Sub16.method988(i_1_, i_4_, i_3_);
                if (class116.anInt2022 != 0)
                    class38.method458(i_4_, i_8_, i_3_, true,
                            class116.aBoolean2030, i_7_);
            }
        } while (false);
    }

    public void method1040(int i, Stream class68_sub14, int i_9_) {
        anInt4185++;
        if (i == (i_9_ ^ 0xffffffff))
            anInt4181 = class68_sub14.readUnsignedWord(1355769544);
    }

    public static void method1041(int i) {
        if (i == -13893) {
            anInt4184++;
            Class50.aClass16_984 = new Class16();
        }
    }

    public static void method1042(byte i) {
        if (i == 23)
            aFont4190 = null;
    }

    public static Class97 method1043(byte i) {
        anInt4191++;
        try {
            if (i < 56)
                return null;
            //xxx return (Class97) Class.forName("Class97_Sub1").newInstance();
            return new Class97_Sub1();
        } catch (Throwable throwable) {
            return null;
        }
    }

    public static void method1044(byte i) {
        anInt4182++;
        if (i <= -56) {
            aFont4190 = null;
            Class118.aFontMetrics2074 = null;
            Unknown.anImage1622 = null;
        }
    }

    public void method1045(byte i, Stream class68_sub14) {
        for (; ; ) {
            int i_10_ = class68_sub14.readUnsignedByte(-6677);
            if (i_10_ == 0)
                break;
            method1040(-3, class68_sub14, i_10_);
        }
        anInt4187++;
        int i_11_ = -126 % ((i - -63) / 59);
    }
}
