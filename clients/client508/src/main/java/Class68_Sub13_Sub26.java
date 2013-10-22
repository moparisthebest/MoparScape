/* Class68_Sub13_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.util.Random;

public class Class68_Sub13_Sub26 extends Class68_Sub13 {
    public static int anInt3870;
    public static int anInt3871;
    public int[] anIntArray3872;
    public static Random aRandom3873 = new Random();
    public static int anInt3874;
    public static int anInt3875;
    public static int anInt3876 = 2;
    public static int anInt3877;
    public static RSString aRSString_3878
            = RSString.newRsString("gleiten:");
    public int anInt3879 = -1;
    public static int anInt3880 = 0;
    public int anInt3881;
    public int anInt3882;
    public static int anInt3883 = 0;
    public static int anInt3884;
    public static int anInt3885;
    public static int anInt3886;

    public Class68_Sub13_Sub26() {
        super(0, false);
    }

    public int[][] method697(int i, boolean bool) {
        anInt3885++;
        if (bool != true)
            anInt3883 = -40;
        int[][] is = aClass88_2939.method1496(i, (byte) -98);
        if (aClass88_2939.aBoolean1610 && method826(0)) {
            int[] is_0_ = is[1];
            int[] is_1_ = is[2];
            int[] is_2_ = is[0];
            int i_3_ = ((Class68_Sub1.anInt2775 != anInt3881
                    ? i * anInt3881 / Class68_Sub1.anInt2775 : i)
                    * anInt3882);
            if (anInt3882 != Class68_Sub13_Sub19.anInt3746) {
                for (int i_4_ = 0;
                     ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                             < (i_4_ ^ 0xffffffff));
                     i_4_++) {
                    int i_5_
                            = anInt3882 * i_4_ / Class68_Sub13_Sub19.anInt3746;
                    int i_6_ = anIntArray3872[i_5_ + i_3_];
                    is_1_[i_4_]
                            = Class120.method1740(i_6_ << 1307678724, 4080);
                    is_0_[i_4_] = Class120.method1740(i_6_ >> 857470852, 4080);
                    is_2_[i_4_]
                            = Class120.method1740(16711680, i_6_) >> -1579996788;
                }
            } else {
                for (int i_7_ = 0; Class68_Sub13_Sub19.anInt3746 > i_7_;
                     i_7_++) {
                    int i_8_ = anIntArray3872[i_3_++];
                    is_1_[i_7_] = Class120.method1740(4080, i_8_ << 667311492);
                    is_0_[i_7_]
                            = Class120.method1740(4080, i_8_ >> -1924506844);
                    is_2_[i_7_]
                            = Class120.method1740(i_8_, 16711680) >> 793019564;
                }
            }
        }
        return is;
    }

    public int method689(int i) {
        if (i != 9485)
            method827(31, -110);
        anInt3870++;
        return anInt3879;
    }

    public boolean method826(int i) {
        anInt3884++;
        if (anIntArray3872 != null)
            return true;
        if (anInt3879 >= i) {
            Sprite sprite
                    = Class68_Sub29.method1319(anInt3879, Class83.aClass21_1526,
                    64);
            sprite.method1129();
            anInt3882 = sprite.anInt4309;
            anIntArray3872 = sprite.pixels;
            anInt3881 = sprite.anInt4311;
            return true;
        }
        return false;
    }

    public void method694(int i) {
        anInt3886++;
        super.method694(i);
        anIntArray3872 = null;
    }

    public static void method827(int i, int i_9_) {
        Class68_Sub28_Sub2.aClass98_4544.method1564(-18767, i_9_);
        int i_10_ = 94 % ((-4 - i) / 54);
        anInt3875++;
    }

    public static void method828(boolean bool) {
        if (bool != false)
            method827(11, 8);
        aRandom3873 = null;
        aRSString_3878 = null;
    }

    public static void method829(Class103 class103, int i) {
        if (i != 127)
            method829(null, 100);
        Class68_Sub16.aClass103_3028 = class103;
        anInt3874++;
    }

    public static void method830(int i, int i_11_, int i_12_, int i_13_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_11_][i_12_];
        if (class68_sub1 != null) {
            Class76 class76 = class68_sub1.aClass76_2764;
            if (class76 != null) {
                class76.anInt1356 = class76.anInt1356 * i_13_ / 16;
                class76.anInt1363 = class76.anInt1363 * i_13_ / 16;
            }
        }
    }

    public void method700(Stream class68_sub14, int i, int i_14_) {
        if (i_14_ != -1)
            method697(0, false);
        if (i == 0)
            anInt3879 = class68_sub14.readUnsignedWord(1355769544);
        anInt3871++;
    }

    public static void method831(SignLink class55, byte i, boolean bool) {
        anInt3877++;
        if (i <= -35) {
            do {
                if (!bool) {
                    Class2 class2 = null;
                    Class45.anInt919 = 3;
                    Class75_Sub3_Sub1.method1403(true, 1);
                    Class54.anInt1032 = 0;
                    Class68_Sub22.aBoolean3149 = true;
                    Class68_Sub20_Sub13_Sub2.aBoolean4629 = true;
                    Class68_Sub6.aBoolean2838 = true;
                    Class68_Sub13_Sub2.aBoolean3460 = true;
                    RSString.aBoolean2262 = true;
                    Class68_Sub20_Sub2.aBoolean4188 = true;
                    Class43.aBoolean741 = true;
                    Class68_Sub13_Sub21.aBoolean3793 = true;
                    ISAACRandomGen.aBoolean1487 = true;
                    Class69.anInt1245 = 0;
                    Class74.aBoolean1324 = true;
                    anInt3876 = 2;
                    Class1_Sub2.aBoolean2432 = true;
                    Class68_Sub20_Sub15.anInt4399 = 127;
                    Class86.anInt1571 = 0;
                    Class68_Sub13_Sub25.anInt3855 = 255;
                    Class68_Sub28_Sub1.aBoolean4521 = true;
                    Class106.anInt1801 = 127;
                    try {
                        JagSocket class31 = class55.method568(true, "runescape");
                        while (class31.anInt555 == 0)
                            Class50.method528(-5, 1L);
                        if ((class31.anInt555 ^ 0xffffffff) == -2) {
                            class2 = (Class2) class31.playerDefSocket;
                            byte[] is = new byte[(int) class2.method172(-1)];
                            int i_15_;
                            for (int i_16_ = 0;
                                 ((i_16_ ^ 0xffffffff)
                                         > (is.length ^ 0xffffffff));
                                 i_16_ += i_15_) {
                                i_15_ = class2.method177(is.length - i_16_, 0,
                                        i_16_, is);
                                if ((i_15_ ^ 0xffffffff) == 0)
                                    throw new IOException("EOF");
                            }
                            Class1_Sub5.method141(new Stream(is),
                                    (byte) 91);
                        }
                    } catch (Exception exception) {
                        /* empty */
                    }
                    try {
                        if (class2 == null)
                            break;
                        class2.method175(-8143);
                    } catch (Exception exception) {
                        /* empty */
                    }
                    break;
                }
                Class45.anInt919 = 3;
                Class75_Sub3_Sub1.method1403(false, 1);
                Class68_Sub13_Sub25.anInt3855 = 255;
                Class69.anInt1245 = 0;
                Class68_Sub20_Sub15.anInt4399 = 127;
                Class1_Sub2.aBoolean2432 = false;
                Class54.anInt1032 = 0;
                Class68_Sub20_Sub2.aBoolean4188 = false;
                Class68_Sub13_Sub21.aBoolean3793 = false;
                Class68_Sub22.aBoolean3149 = false;
                Class68_Sub13_Sub2.aBoolean3460 = false;
                Class106.anInt1801 = 127;
                Class68_Sub28_Sub1.aBoolean4521 = false;
                Class43.aBoolean741 = false;
                RSString.aBoolean2262 = false;
                Class74.aBoolean1324 = false;
                Class68_Sub6.aBoolean2838 = false;
                Class86.anInt1571 = 0;
                anInt3876 = 0;
                Class68_Sub20_Sub13_Sub2.aBoolean4629 = false;
                ISAACRandomGen.aBoolean1487 = false;
                Class68_Sub20_Sub10.method1115(true, class55);
            } while (false);
        }
    }
}
