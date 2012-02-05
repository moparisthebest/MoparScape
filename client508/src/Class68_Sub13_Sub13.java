/* Class68_Sub13_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub13 extends Class68_Sub13 {
    public static int anInt3649;
    public static RSString aRSString_3650
            = RSString.newRsString(
            " steht bereits auf Ihrer Ignorieren)2Liste(Q");
    public static int anInt3651;
    public static int anInt3652;
    public static int anInt3653;
    public static int anInt3654;
    public static int anInt3655;
    public int anInt3656;
    public static RSString aRSString_3657;
    public static int anInt3658;
    public int anInt3659;
    public static int anInt3660;
    public static int anInt3661;
    public int[] anIntArray3662;
    public static int anInt3663 = 0;
    public int anInt3664 = -1;

    public static Class68_Sub20_Sub10 method757
            (boolean bool, int i, int i_0_, int i_1_, boolean bool_2_, int i_3_,
             boolean bool_4_, int i_5_) {
        anInt3661++;
        ItemDef class19 = Applet_Sub1.method18(-25672, i_1_);
        if ((i_5_ ^ 0xffffffff) < -2 && class19.anIntArray343 != null) {
            int i_6_ = -1;
            for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -11; i_7_++) {
                if (((class19.anIntArray353[i_7_] ^ 0xffffffff)
                        >= (i_5_ ^ 0xffffffff))
                        && (class19.anIntArray353[i_7_] ^ 0xffffffff) != -1)
                    i_6_ = class19.anIntArray343[i_7_];
            }
            if (i_6_ != -1)
                class19 = Applet_Sub1.method18(-25672, i_6_);
        }
        Class1_Sub3_Sub1 class1_sub3_sub1 = class19.method305(-50);
        if (class1_sub3_sub1 == null)
            return null;
        Sprite sprite = null;
        if (class19.anInt385 != -1) {
            sprite
                    = (Sprite) method757(true, 0, -125,
                    class19.anInt378, false,
                    1, true, 10);
            if (sprite == null)
                return null;
        } else if (class19.anInt339 != -1) {
            sprite
                    = (Sprite) method757(false, i, -125,
                    class19.anInt345, false,
                    i_3_, true, i_5_);
            if (sprite == null)
                return null;
        }
        int[] is = Class79.anIntArray1402;
        int i_8_ = Class79.anInt1401;
        int[] is_9_ = new int[4];
        int i_10_ = Class79.anInt1397;
        Class79.method1436(is_9_);
        Sprite sprite_11_
                = new Sprite(36, 32);
        if (i_0_ > -123)
            method759(-88, 64);
        Class79.method1432(sprite_11_.pixels, 36,
                32);
        Class62.method612();
        Class62.method603(16, 16);
        Class62.aBoolean1163 = false;
        int i_12_ = class19.anInt336;
        if (!bool) {
            if ((i_3_ ^ 0xffffffff) == -3)
                i_12_ *= 1.04;
        } else
            i_12_ = (int) (1.5 * (double) i_12_);
        int i_13_
                = Class62.anIntArray1167[class19.anInt389] * i_12_ >> -310666320;
        int i_14_
                = i_12_ * Class62.anIntArray1155[class19.anInt389] >> -1666088464;
        class1_sub3_sub1.method77(0, class19.anInt395, class19.anInt355,
                class19.anInt389, class19.anInt358,
                i_14_ + (-(class1_sub3_sub1.method56() / 2)
                        + class19.anInt391),
                i_13_ + class19.anInt391);
        if (i_3_ >= 1) {
            sprite_11_.method1118(1);
            if ((i_3_ ^ 0xffffffff) <= -3)
                sprite_11_.method1118(16777215);
            Class79.method1432(sprite_11_.pixels, 36,
                    32);
        }
        if ((i ^ 0xffffffff) != -1)
            sprite_11_.method1123(i);
        if ((class19.anInt385 ^ 0xffffffff) == 0) {
            if ((class19.anInt339 ^ 0xffffffff) != 0) {
                Class79.method1432(sprite.pixels, 36,
                        32);
                sprite_11_.method1103(0, 0);
                sprite_11_ = sprite;
            }
        } else
            sprite.method1103(0, 0);
        if (bool_2_
                && ((class19.anInt381 ^ 0xffffffff) == -2
                || (i_5_ ^ 0xffffffff) != -2)
                && (i_5_ ^ 0xffffffff) != 0)
            Class18.aClass68_Sub20_Sub1_Sub1_289.method1030
                    (Animable.method50((byte) -83, i_5_), 0, 9, 16776960, 1);
        Class79.method1432(is, i_8_, i_10_);
        Class79.method1422(is_9_);
        Class62.method612();
        Class62.aBoolean1163 = true;
        return sprite_11_;
    }

    public void method694(int i) {
        anInt3660++;
        super.method694(i);
        anIntArray3662 = null;
    }

    public static void method758(int i) {
        aRSString_3657 = null;
        aRSString_3650 = null;
        if (i != 1)
            aRSString_3650 = null;
    }

    public int[][] method697(int i, boolean bool) {
        if (bool != true)
            anInt3656 = -127;
        anInt3658++;
        int[][] is = aClass88_2939.method1496(i, (byte) 101);
        if (aClass88_2939.aBoolean1610 && method761(-9)) {
            int i_15_
                    = (anInt3656
                    * ((Class68_Sub1.anInt2775 ^ 0xffffffff) != (anInt3659
                    ^ 0xffffffff)
                    ? anInt3659 * i / Class68_Sub1.anInt2775 : i));
            int[] is_16_ = is[1];
            int[] is_17_ = is[0];
            int[] is_18_ = is[2];
            if (Class68_Sub13_Sub19.anInt3746 == anInt3656) {
                for (int i_19_ = 0; i_19_ < Class68_Sub13_Sub19.anInt3746;
                     i_19_++) {
                    int i_20_ = anIntArray3662[i_15_++];
                    is_18_[i_19_]
                            = Class120.method1740(255, i_20_) << 1554447844;
                    is_16_[i_19_]
                            = Class120.method1740(65280, i_20_) >> 494843876;
                    is_17_[i_19_]
                            = Class120.method1740(4080, i_20_ >> 854552940);
                }
            } else {
                for (int i_21_ = 0;
                     ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                             < (i_21_ ^ 0xffffffff));
                     i_21_++) {
                    int i_22_
                            = anInt3656 * i_21_ / Class68_Sub13_Sub19.anInt3746;
                    int i_23_ = anIntArray3662[i_15_ - -i_22_];
                    is_18_[i_21_]
                            = Class120.method1740(i_23_, 255) << 1682950436;
                    is_16_[i_21_]
                            = Class120.method1740(i_23_ >> 549771812, 4080);
                    is_17_[i_21_]
                            = Class120.method1740(i_23_, 16711680) >> -987571188;
                }
            }
        }
        return is;
    }

    public static int method759(int i, int i_24_) {
        if (i_24_ <= 83)
            anInt3663 = 19;
        anInt3649++;
        return i >>> 420387688;
    }

    public void method700(Stream class68_sub14, int i, int i_25_) {
        anInt3654++;
        if ((i ^ 0xffffffff) == i_25_)
            anInt3664 = class68_sub14.readUnsignedWord(1355769544);
    }

    public Class68_Sub13_Sub13() {
        super(0, false);
    }

    public static void method760(int i) {
        Class1_Sub2.aClass68_Sub28_Sub1_2433.method1249(106);
        Class70.anInt1287 = 1;
        anInt3653++;
        if (i == 16777215)
            GameException.aClass21_2236 = null;
    }

    public boolean method761(int i) {
        anInt3651++;
        int i_26_ = -85 % ((60 - i) / 57);
        if (anIntArray3662 != null)
            return true;
        if (anInt3664 >= 0) {
            int i_27_ = Class68_Sub13_Sub19.anInt3746;
            int i_28_ = Class68_Sub1.anInt2775;
            int i_29_
                    = (!Class49.anInterface4_966.method9((byte) -111, anInt3664)
                    ? 128 : 64);
            anIntArray3662 = Class49.anInterface4_966.method11(99, anInt3664);
            anInt3659 = i_29_;
            anInt3656 = i_29_;
            Class68_Sub13_Sub15.method764(i_27_, i_28_, true);
            if (anIntArray3662 == null)
                return false;
            return true;
        }
        return false;
    }

    public int method693(byte i) {
        anInt3655++;
        if (i > -43)
            method700(null, -25, 81);
        return anInt3664;
    }

    static {
        aRSString_3657 = RSString.newRsString("Eingabeprozedur geladen)3");
    }
}
