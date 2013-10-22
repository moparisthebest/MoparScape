/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class13 {
    public static short[] aShortArray213;
    public static RSString aRSString_214
            = RSString.newRsString("Update)2Liste geladen)3");
    public static RSString aRSString_215
            = RSString.newRsString("not yet implemented");
    public int anInt216;
    public static int anInt217;
    public static RSString aRSString_218;
    public static int anInt219;
    public int anInt220;
    public static Class21_Sub1 aClass21_Sub1_221;
    public int anInt222;
    public static int anInt223 = 0;

    public static void method240(int i) {
        aClass21_Sub1_221 = null;
        if (i != -28590)
            method240(111);
        aRSString_214 = null;
        aRSString_215 = null;
        aShortArray213 = null;
        aRSString_218 = null;
    }

    public static void method241(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 int i_4_, int i_5_, int i_6_) {
        anInt217++;
        int i_7_ = 0;
        int i_8_ = i_2_;
        int i_9_ = 0;
        int i_10_ = i_0_ - i_5_;
        int i_11_ = -i_5_ + i_2_;
        int i_12_ = i_0_ * i_0_;
        int i_13_ = i_2_ * i_2_;
        int i_14_ = i_10_ * i_10_;
        int i_15_ = i_13_ << 1681556737;
        int i_16_ = i_2_ << -1832820639;
        int i_17_ = i_11_ * i_11_;
        int i_18_ = i_14_ << 1391449889;
        int i_19_ = i_12_ << 1699540225;
        int i_20_ = i_17_ << 1513595521;
        int i_21_ = i_11_ << -833556799;
        if (i_6_ != -1832820639)
            aRSString_215 = null;
        int i_22_ = i_13_ + -((-1 + i_16_) * i_19_);
        int i_23_ = i_12_ * (1 + -i_16_) - -i_15_;
        int i_24_ = i_14_ * (-i_21_ + 1) - -i_20_;
        int i_25_ = i_13_ << 2063553986;
        int i_26_ = i_12_ << 914706850;
        int i_27_ = i_14_ << -221823518;
        int i_28_ = i_17_ + -((-1 + i_21_) * i_18_);
        int i_29_ = i_17_ << -57084446;
        int i_30_ = i_15_ * 3;
        int i_31_ = (i_16_ + -3) * i_19_;
        int i_32_ = i_20_ * 3;
        int i_33_ = (-3 + i_21_) * i_18_;
        int i_34_ = i_29_;
        int i_35_ = i_25_;
        int i_36_ = i_26_ * (-1 + i_2_);
        if ((i_1_ ^ 0xffffffff) <= (Class35.anInt605 ^ 0xffffffff)
                && Class51.anInt2255 >= i_1_) {
            int[] is = Class68_Sub22.anIntArrayArray3132[i_1_];
            int i_37_
                    = Class68_Sub20_Sub15.method1171(-i_0_ + i_4_,
                    Class113.anInt1918,
                    (byte) 114, GroundData.anInt677);
            int i_38_
                    = Class68_Sub20_Sub15.method1171(i_4_ - -i_0_,
                    Class113.anInt1918,
                    (byte) 114, GroundData.anInt677);
            int i_39_
                    = Class68_Sub20_Sub15.method1171(i_4_ - i_10_,
                    Class113.anInt1918,
                    (byte) 114, GroundData.anInt677);
            int i_40_
                    = Class68_Sub20_Sub15.method1171(i_10_ + i_4_,
                    Class113.anInt1918,
                    (byte) 114, GroundData.anInt677);
            Class34.method416(i_37_, (byte) -17, i_3_, is, i_39_);
            Class34.method416(i_39_, (byte) -17, i, is, i_40_);
            Class34.method416(i_40_, (byte) -17, i_3_, is, i_38_);
        }
        int i_41_ = (-1 + i_11_) * i_27_;
        while (i_8_ > 0) {
            if (i_23_ < 0) {
                while (i_23_ < 0) {
                    i_7_++;
                    i_23_ += i_30_;
                    i_22_ += i_35_;
                    i_30_ += i_25_;
                    i_35_ += i_25_;
                }
            }
            boolean bool = (i_8_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff);
            int i_42_ = --i_8_ + i_1_;
            if ((i_22_ ^ 0xffffffff) > -1) {
                i_23_ += i_30_;
                i_22_ += i_35_;
                i_35_ += i_25_;
                i_30_ += i_25_;
                i_7_++;
            }
            i_22_ += -i_31_;
            i_23_ += -i_36_;
            if (bool) {
                if ((i_24_ ^ 0xffffffff) > -1) {
                    while (i_24_ < 0) {
                        i_28_ += i_34_;
                        i_34_ += i_29_;
                        i_9_++;
                        i_24_ += i_32_;
                        i_32_ += i_29_;
                    }
                }
                if (i_28_ < 0) {
                    i_9_++;
                    i_28_ += i_34_;
                    i_24_ += i_32_;
                    i_32_ += i_29_;
                    i_34_ += i_29_;
                }
                i_28_ += -i_33_;
                i_33_ -= i_27_;
                i_24_ += -i_41_;
                i_41_ -= i_27_;
            }
            int i_43_ = -i_8_ + i_1_;
            i_31_ -= i_26_;
            if (i_42_ >= Class35.anInt605 && i_43_ <= Class51.anInt2255) {
                int i_44_ = Class68_Sub20_Sub15.method1171(i_4_ - -i_7_,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                int i_45_ = Class68_Sub20_Sub15.method1171(-i_7_ + i_4_,
                        Class113.anInt1918,
                        (byte) 114,
                        GroundData.anInt677);
                if (bool) {
                    int i_46_
                            = Class68_Sub20_Sub15.method1171(i_4_ - -i_9_,
                            Class113.anInt1918,
                            (byte) 114,
                            GroundData.anInt677);
                    int i_47_
                            = Class68_Sub20_Sub15.method1171(i_4_ + -i_9_,
                            Class113.anInt1918,
                            (byte) 114,
                            GroundData.anInt677);
                    if ((i_43_ ^ 0xffffffff)
                            <= (Class35.anInt605 ^ 0xffffffff)) {
                        int[] is = Class68_Sub22.anIntArrayArray3132[i_43_];
                        Class34.method416(i_45_, (byte) -17, i_3_, is, i_47_);
                        Class34.method416(i_47_, (byte) -17, i, is, i_46_);
                        Class34.method416(i_46_, (byte) -17, i_3_, is, i_44_);
                    }
                    if ((Class51.anInt2255 ^ 0xffffffff)
                            <= (i_42_ ^ 0xffffffff)) {
                        int[] is = Class68_Sub22.anIntArrayArray3132[i_42_];
                        Class34.method416(i_45_, (byte) -17, i_3_, is, i_47_);
                        Class34.method416(i_47_, (byte) -17, i, is, i_46_);
                        Class34.method416(i_46_, (byte) -17, i_3_, is, i_44_);
                    }
                } else {
                    if (i_43_ >= Class35.anInt605)
                        Class34.method416(i_45_, (byte) -17, i_3_,
                                (Class68_Sub22.anIntArrayArray3132
                                        [i_43_]),
                                i_44_);
                    if (i_42_ <= Class51.anInt2255)
                        Class34.method416(i_45_, (byte) -17, i_3_,
                                (Class68_Sub22.anIntArrayArray3132
                                        [i_42_]),
                                i_44_);
                }
            }
            i_36_ -= i_26_;
        }
    }

    public static void method242(int i, int i_48_, int i_49_, int i_50_,
                                 int i_51_) {
        anInt219++;
        if (i < -77) {
            for (int i_52_ = 0; i_52_ < Class56.anInt1061; i_52_++) {
                if (i_50_ < (ItemDef.anIntArray376[i_52_]
                        + Class105.anIntArray1795[i_52_])
                        && ((Class105.anIntArray1795[i_52_] ^ 0xffffffff)
                        > (i_50_ - -i_48_ ^ 0xffffffff))
                        && ((Class1_Sub6_Sub2.anIntArray3430[i_52_]
                        + Class71.anIntArray1294[i_52_])
                        ^ 0xffffffff) < (i_51_ ^ 0xffffffff)
                        && i_49_ + i_51_ > Class71.anIntArray1294[i_52_])
                    Class68_Sub17.aBooleanArray3037[i_52_] = true;
            }
        }
    }

    public abstract void method243(int i, int i_53_, int i_54_);

    public abstract void method244(int i, int i_55_, int i_56_);

    public abstract void method245(boolean bool, int i, int i_57_);

    public Class13(int i, int i_58_, int i_59_) {
        anInt222 = i_59_;
        anInt220 = i_58_;
        anInt216 = i;
    }

    static {
        aRSString_218 = RSString.newRsString(":");
    }
}
