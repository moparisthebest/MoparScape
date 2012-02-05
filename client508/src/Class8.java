/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class8 {
    public int anInt138;
    public int anInt139;
    public static Class16 aClass16_140 = new Class16();
    public int anInt141;
    public int anInt142;
    public int anInt143;
    public int anInt144;
    public int anInt145;
    public int anInt146;
    public int anInt147;
    public int anInt148;
    public int anInt149;
    public int anInt150;
    public static int anInt151;
    public int anInt152;
    public int anInt153;
    public static int anInt154;
    public static int anInt155;
    public int anInt156;
    public int anInt157;
    public static int anInt158;
    public int anInt159;
    public static int anInt160 = 0;
    public static int anInt161;
    public int anInt162;
    public static int anInt163 = 0;
    public static Class21renamed aClass21_164;
    public static RSString aRSString_165
            = RSString.newRsString(":chalreq:");

    public static void method202(boolean bool) {
        anInt151++;
        int i = 0;
        for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -105; i_0_++) {
            for (int i_1_ = 0; i_1_ < 104; i_1_++) {
                if (Class75_Sub1_Sub1.method1391
                        (true, Class22.aClass68_Sub1ArrayArrayArray484, i_1_, i_0_,
                                i, (byte) 95))
                    i++;
                if (i >= 512)
                    return;
            }
        }
        if (bool != true)
            method203(true, null, null, null, 106);
    }

    public static void method203(boolean bool, RSString class100,
                                 RSString class100_2_, RSString class100_3_,
                                 int i) {
        try {
            if (bool != false)
                aClass16_140 = null;
            anInt155++;
            Class25.method386(class100_3_, -19596, class100, -1, i,
                    class100_2_);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ba.B(" + bool + ','
                            + (class100 != null ? "{...}" : "null")
                            + ','
                            + (class100_2_ != null ? "{...}"
                            : "null")
                            + ','
                            + (class100_3_ != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    public static RSString method204(int i, Class45 class45) {
        anInt158++;
        if (i == Class1_Sub6_Sub2.method164(118, client.method41(class45)))
            return null;
        if (class45.aRSString_884 == null
                || (class45.aRSString_884.method1585(true).method1590((byte) -125)
                == 0)) {
            if (Class68_Sub20.aBoolean3094)
                return Class97.aRSString_1705;
            return null;
        }
        return class45.aRSString_884;
    }

    public static void method205(int i, int i_4_, int i_5_, boolean bool,
                                 int i_6_, int i_7_, int i_8_) {
        Class60.method587(-1, i);
        int i_9_ = -i_4_ + i;
        int i_10_ = 0;
        if (i_9_ < 0)
            i_9_ = 0;
        int i_11_ = -i;
        int i_12_ = i;
        anInt154++;
        int i_13_ = i_9_;
        int i_14_ = -i_9_;
        int i_15_ = -1;
        int[] is = Class68_Sub22.anIntArrayArray3132[i_8_];
        int i_16_ = -1;
        int i_17_ = i_5_ + -i_9_;
        Class34.method416(i_5_ - i, (byte) -17, i_7_, is, i_17_);
        int i_18_ = i_5_ + i_9_;
        Class34.method416(i_17_, (byte) -17, i_6_, is, i_18_);
        Class34.method416(i_18_, (byte) -17, i_7_, is, i + i_5_);
        if (bool != true)
            anInt161 = -97;
        while (i_10_ < i_12_) {
            i_15_ += 2;
            i_16_ += 2;
            i_11_ += i_15_;
            i_14_ += i_16_;
            if (i_14_ >= 0 && (i_13_ ^ 0xffffffff) <= -2) {
                Class71_Sub1.anIntArray3255[i_13_] = i_10_;
                i_13_--;
                i_14_ -= i_13_ << 1629697313;
            }
            i_10_++;
            if (i_11_ >= 0) {
                i_12_--;
                i_11_ -= i_12_ << -163046623;
                if ((i_9_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)) {
                    int[] is_19_
                            = Class68_Sub22.anIntArrayArray3132[i_12_ + i_8_];
                    int[] is_20_
                            = Class68_Sub22.anIntArrayArray3132[i_8_ + -i_12_];
                    int i_21_ = i_10_ + i_5_;
                    int i_22_ = i_5_ - i_10_;
                    Class34.method416(i_22_, (byte) -17, i_7_, is_19_, i_21_);
                    Class34.method416(i_22_, (byte) -17, i_7_, is_20_, i_21_);
                } else {
                    int i_23_ = Class71_Sub1.anIntArray3255[i_12_];
                    int[] is_24_
                            = Class68_Sub22.anIntArrayArray3132[i_12_ + i_8_];
                    int i_25_ = i_5_ - i_10_;
                    int[] is_26_
                            = Class68_Sub22.anIntArrayArray3132[i_8_ + -i_12_];
                    int i_27_ = i_23_ + i_5_;
                    int i_28_ = i_5_ + i_10_;
                    int i_29_ = i_5_ - i_23_;
                    Class34.method416(i_25_, (byte) -17, i_7_, is_24_, i_29_);
                    Class34.method416(i_29_, (byte) -17, i_6_, is_24_, i_27_);
                    Class34.method416(i_27_, (byte) -17, i_7_, is_24_, i_28_);
                    Class34.method416(i_25_, (byte) -17, i_7_, is_26_, i_29_);
                    Class34.method416(i_29_, (byte) -17, i_6_, is_26_, i_27_);
                    Class34.method416(i_27_, (byte) -17, i_7_, is_26_, i_28_);
                }
            }
            int[] is_30_ = Class68_Sub22.anIntArrayArray3132[i_8_ - i_10_];
            int[] is_31_ = Class68_Sub22.anIntArrayArray3132[i_8_ + i_10_];
            int i_32_ = i_12_ + i_5_;
            int i_33_ = i_5_ - i_12_;
            if (i_10_ >= i_9_) {
                Class34.method416(i_33_, (byte) -17, i_7_, is_31_, i_32_);
                Class34.method416(i_33_, (byte) -17, i_7_, is_30_, i_32_);
            } else {
                int i_34_ = ((i_13_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)
                        ? Class71_Sub1.anIntArray3255[i_10_] : i_13_);
                int i_35_ = i_34_ + i_5_;
                int i_36_ = i_5_ + -i_34_;
                Class34.method416(i_33_, (byte) -17, i_7_, is_31_, i_36_);
                Class34.method416(i_36_, (byte) -17, i_6_, is_31_, i_35_);
                Class34.method416(i_35_, (byte) -17, i_7_, is_31_, i_32_);
                Class34.method416(i_33_, (byte) -17, i_7_, is_30_, i_36_);
                Class34.method416(i_36_, (byte) -17, i_6_, is_30_, i_35_);
                Class34.method416(i_35_, (byte) -17, i_7_, is_30_, i_32_);
            }
        }
    }

    public static void method206(byte i) {
        aRSString_165 = null;
        aClass21_164 = null;
        aClass16_140 = null;
        if (i != -9)
            aRSString_165 = null;
    }
}
