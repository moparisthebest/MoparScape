/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class3 {
    public static Class45 aClass45_73;
    public static int anInt74;
    public static short[] aShortArray75 = {6798, 8741, 25238, 4626, 4550};
    public static int anInt76;
    public static int anInt77;
    public static byte[][] aByteArrayArray78;
    public static int[] anIntArray79;
    public static Class46[] aClass46Array80 = new Class46[50];
    public int[] anIntArray81;
    public Class68_Sub13[] aClass68_Sub13Array82;
    public int[] anIntArray83;
    public static int anInt84;
    public static int anInt85;
    public static int anInt86;
    public static int anInt87;
    public Class68_Sub13 aClass68_Sub13_88;
    public Class68_Sub13 aClass68_Sub13_89;

    public int[] method178(boolean bool, boolean bool_0_, Class21renamed class21,
                           Interface4 interface4, int i, int i_1_, double d,
                           int i_2_) {
        try {
            Class86.method1485((byte) 47, d);
            int[] is = new int[i * i_1_];
            Class49.anInterface4_966 = interface4;
            Class83.aClass21_1526 = class21;
            Class68_Sub13_Sub15.method764(i, i_1_, true);
            for (int i_3_ = 0; aClass68_Sub13Array82.length > i_3_; i_3_++)
                aClass68_Sub13Array82[i_3_].method695(i, -256, i_1_);
            anInt77++;
            int i_4_;
            int i_5_;
            int i_6_;
            if (bool_0_) {
                i_6_ = -1;
                i_5_ = i - 1;
                i_4_ = -1;
            } else {
                i_4_ = i;
                i_5_ = 0;
                i_6_ = 1;
            }
            int i_7_ = 0;
            if (i_2_ != 2000)
                aShortArray75 = null;
            for (int i_8_ = 0; (i_1_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff);
                 i_8_++) {
                if (bool)
                    i_7_ = i_8_;
                int[] is_9_;
                int[] is_10_;
                int[] is_11_;
                if (aClass68_Sub13_88.aBoolean2931) {
                    int[] is_12_
                            = aClass68_Sub13_88.method698((byte) -61, i_8_);
                    is_10_ = is_12_;
                    is_9_ = is_12_;
                    is_11_ = is_12_;
                } else {
                    int[][] is_13_ = aClass68_Sub13_88.method697(i_8_, true);
                    is_9_ = is_13_[0];
                    is_10_ = is_13_[2];
                    is_11_ = is_13_[1];
                }
                for (int i_14_ = i_5_;
                     (i_14_ ^ 0xffffffff) != (i_4_ ^ 0xffffffff);
                     i_14_ += i_6_) {
                    int i_15_ = is_9_[i_14_] >> 437217892;
                    if (i_15_ > 255)
                        i_15_ = 255;
                    if ((i_15_ ^ 0xffffffff) > -1)
                        i_15_ = 0;
                    i_15_ = Class13_Sub2.anIntArray2641[i_15_];
                    int i_16_ = is_11_[i_14_] >> -1320973244;
                    if ((i_16_ ^ 0xffffffff) < -256)
                        i_16_ = 255;
                    if (i_16_ < 0)
                        i_16_ = 0;
                    i_16_ = Class13_Sub2.anIntArray2641[i_16_];
                    int i_17_ = is_10_[i_14_] >> -528239868;
                    if (i_17_ > 255)
                        i_17_ = 255;
                    if (i_17_ < 0)
                        i_17_ = 0;
                    i_17_ = Class13_Sub2.anIntArray2641[i_17_];
                    is[i_7_++] = ((i_16_ << -2094660728)
                            + (i_15_ << -549549072) - -i_17_);
                    if (bool)
                        i_7_ += -1 + i;
                }
            }
            for (int i_18_ = 0;
                 ((i_18_ ^ 0xffffffff)
                         > (aClass68_Sub13Array82.length ^ 0xffffffff));
                 i_18_++)
                aClass68_Sub13Array82[i_18_].method694(i_2_ + -1992);
            return is;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ad.B(" + bool + ',' + bool_0_ + ','
                            + (class21 != null ? "{...}" : "null")
                            + ','
                            + (interface4 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_1_ + ',' + d + ','
                            + i_2_ + ')'));
        }
    }

    public static void method179(int i, int i_19_, int i_20_, int i_21_,
                                 int i_22_, int i_23_, int i_24_) {
        if ((GroundData.anInt677 ^ 0xffffffff) >= (-i_21_ + i_19_ ^ 0xffffffff)
                && i_19_ - -i_21_ <= Class113.anInt1918
                && i_22_ - i_21_ >= Class35.anInt605
                && Class51.anInt2255 >= i_22_ + i_21_)
            Class8.method205(i_21_, i_20_, i_19_, true, i_24_, i, i_22_);
        else
            Class75_Sub1.method1388(i_24_, i_22_, i, i_20_, i_19_, -135,
                    i_21_);
        if (i_23_ <= 72)
            method181(-99, 50, 81, 76, -97, 76, null, 15, 29L);
        anInt74++;
    }

    public boolean method180(Interface4 interface4, int i, Class21renamed class21) {
        try {
            anInt86++;
            for (int i_25_ = i; i_25_ < anIntArray83.length; i_25_++) {
                if (!class21.method360(anIntArray83[i_25_], 0))
                    return false;
            }
            for (int i_26_ = 0;
                 (i_26_ ^ 0xffffffff) > (anIntArray81.length ^ 0xffffffff);
                 i_26_++) {
                if (!interface4.method13(true, anIntArray81[i_26_]))
                    return false;
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ad.E("
                            + (interface4 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (class21 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static boolean method181(int i, int i_27_, int i_28_, int i_29_,
                                    int i_30_, int i_31_, Animable class1,
                                    int i_32_, long l) {
        if (class1 == null)
            return true;
        int i_33_ = i_27_ * 128 + 64 * i_30_;
        int i_34_ = i_28_ * 128 + 64 * i_31_;
        return Class68_Sub13_Sub21.method808(i, i_27_, i_28_, i_30_, i_31_,
                i_33_, i_34_, i_29_, class1,
                i_32_, false, l);
    }

    public static void method182(int i) {
        aShortArray75 = null;
        anIntArray79 = null;
        aClass45_73 = null;
        int i_35_ = -17 % ((i - -24) / 35);
        aByteArrayArray78 = null;
        aClass46Array80 = null;
    }

    public static int method183(int i, int i_36_, int i_37_, int i_38_,
                                int i_39_, int i_40_, int i_41_) {
        if ((0x1 & i) == 1) {
            int i_42_ = i_37_;
            i_37_ = i_39_;
            i_39_ = i_42_;
        }
        anInt76++;
        if (i_40_ > -75)
            method182(-23);
        i_41_ &= 0x3;
        if (i_41_ == 0)
            return i_38_;
        if ((i_41_ ^ 0xffffffff) == -2)
            return i_36_;
        if ((i_41_ ^ 0xffffffff) == -3)
            return 7 - i_38_ - (i_37_ - 1);
        return 7 - (i_36_ - -i_39_) - -1;
    }

    public Class3() {
        anIntArray81 = new int[0];
        anIntArray83 = new int[0];
        aClass68_Sub13_88 = new Class68_Sub13_Sub7();
        aClass68_Sub13_88.anInt2942 = 1;
        aClass68_Sub13_89 = new Class68_Sub13_Sub7();
        aClass68_Sub13_89.anInt2942 = 1;
        aClass68_Sub13Array82
                = new Class68_Sub13[]{aClass68_Sub13_88, aClass68_Sub13_89};
    }

    public Class3(Stream class68_sub14) {
        int i = class68_sub14.readUnsignedByte(-6677);
        int i_43_ = 0;
        aClass68_Sub13Array82 = new Class68_Sub13[i];
        int i_44_ = 0;
        int[][] is = new int[i][];
        for (int i_45_ = 0; (i ^ 0xffffffff) < (i_45_ ^ 0xffffffff); i_45_++) {
            Class68_Sub13 class68_sub13
                    = Class104.method1637(true, class68_sub14);
            if ((class68_sub13.method689(9485) ^ 0xffffffff) <= -1)
                i_43_++;
            if (class68_sub13.method693((byte) -116) >= 0)
                i_44_++;
            int i_46_ = class68_sub13.aClass68_Sub13Array2941.length;
            is[i_45_] = new int[i_46_];
            for (int i_47_ = 0; i_46_ > i_47_; i_47_++)
                is[i_45_][i_47_] = class68_sub14.readUnsignedByte(-6677);
            aClass68_Sub13Array82[i_45_] = class68_sub13;
        }
        anIntArray81 = new int[i_44_];
        i_44_ = 0;
        anIntArray83 = new int[i_43_];
        i_43_ = 0;
        for (int i_48_ = 0; (i ^ 0xffffffff) < (i_48_ ^ 0xffffffff); i_48_++) {
            Class68_Sub13 class68_sub13 = aClass68_Sub13Array82[i_48_];
            int i_49_ = class68_sub13.aClass68_Sub13Array2941.length;
            for (int i_50_ = 0; i_50_ < i_49_; i_50_++)
                class68_sub13.aClass68_Sub13Array2941[i_50_]
                        = aClass68_Sub13Array82[is[i_48_][i_50_]];
            int i_51_ = class68_sub13.method689(9485);
            int i_52_ = class68_sub13.method693((byte) -127);
            if ((i_51_ ^ 0xffffffff) < -1)
                anIntArray83[i_43_++] = i_51_;
            if (i_52_ > 0)
                anIntArray81[i_44_++] = i_52_;
            is[i_48_] = null;
        }
        aClass68_Sub13_88
                = aClass68_Sub13Array82[class68_sub14.readUnsignedByte(-6677)];
        aClass68_Sub13_89
                = aClass68_Sub13Array82[class68_sub14.readUnsignedByte(-6677)];
        Object object = null;
    }

    static {
        anIntArray79 = new int[2000];
        anInt85 = -1;
        anInt84 = 0;
    }
}
