/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class62 {
    public static float aFloat1151;
    public static boolean aBoolean1152;
    public static int anInt1153;
    public static int[] anIntArray1154 = new int[2048];
    public static int[] anIntArray1155;
    public static int[] anIntArray1156;
    public static boolean aBoolean1157;
    public static int[] anIntArray1158;
    public static Interface4 anInterface4_1159;
    public static int anInt1160;
    public static boolean aBoolean1161;
    public static int anInt1162;
    public static boolean aBoolean1163;
    public static int anInt1164;
    public static int[] anIntArray1165;
    public static boolean aBoolean1166;
    public static int[] anIntArray1167;
    public static int anInt1168;

    public static void method600
            (int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
             int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_,
             int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
        int[] is = anInterface4_1159.method14(aFloat1151, 99, i_17_);
        if (is == null) {
            int i_18_ = anInterface4_1159.method12(i_17_, 101);
            method617(i, i_0_, i_1_, i_2_, i_3_, i_4_, method607(i_18_, i_5_),
                    method607(i_18_, i_6_), method607(i_18_, i_7_));
        } else {
            aBoolean1166 = anInterface4_1159.method9((byte) -120, i_17_);
            aBoolean1161 = anInterface4_1159.method10(i_17_, 2);
            int i_19_ = i_3_ - i_2_;
            int i_20_ = i_0_ - i;
            int i_21_ = i_4_ - i_2_;
            int i_22_ = i_1_ - i;
            int i_23_ = i_6_ - i_5_;
            int i_24_ = i_7_ - i_5_;
            int i_25_ = 0;
            if (i_0_ != i)
                i_25_ = (i_3_ - i_2_ << 16) / (i_0_ - i);
            int i_26_ = 0;
            if (i_1_ != i_0_)
                i_26_ = (i_4_ - i_3_ << 16) / (i_1_ - i_0_);
            int i_27_ = 0;
            if (i_1_ != i)
                i_27_ = (i_2_ - i_4_ << 16) / (i - i_1_);
            int i_28_ = i_19_ * i_22_ - i_21_ * i_20_;
            if (i_28_ != 0) {
                int i_29_ = (i_23_ * i_22_ - i_24_ * i_20_ << 9) / i_28_;
                int i_30_ = (i_24_ * i_19_ - i_23_ * i_21_ << 9) / i_28_;
                i_9_ = i_8_ - i_9_;
                i_12_ = i_11_ - i_12_;
                i_15_ = i_14_ - i_15_;
                i_10_ -= i_8_;
                i_13_ -= i_11_;
                i_16_ -= i_14_;
                int i_31_ = i_10_ * i_11_ - i_13_ * i_8_ << 14;
                int i_32_ = i_13_ * i_14_ - i_16_ * i_11_ << 5;
                int i_33_ = i_16_ * i_8_ - i_10_ * i_14_ << 5;
                int i_34_ = i_9_ * i_11_ - i_12_ * i_8_ << 14;
                int i_35_ = i_12_ * i_14_ - i_15_ * i_11_ << 5;
                int i_36_ = i_15_ * i_8_ - i_9_ * i_14_ << 5;
                int i_37_ = i_12_ * i_10_ - i_9_ * i_13_ << 14;
                int i_38_ = i_15_ * i_13_ - i_12_ * i_16_ << 5;
                int i_39_ = i_9_ * i_16_ - i_15_ * i_10_ << 5;
                if (i <= i_0_ && i <= i_1_) {
                    if (i < anInt1162) {
                        if (i_0_ > anInt1162)
                            i_0_ = anInt1162;
                        if (i_1_ > anInt1162)
                            i_1_ = anInt1162;
                        i_5_ = (i_5_ << 9) - i_29_ * i_2_ + i_29_;
                        if (i_0_ < i_1_) {
                            i_4_ = i_2_ <<= 16;
                            if (i < 0) {
                                i_4_ -= i_27_ * i;
                                i_2_ -= i_25_ * i;
                                i_5_ -= i_30_ * i;
                                i = 0;
                            }
                            i_3_ <<= 16;
                            if (i_0_ < 0) {
                                i_3_ -= i_26_ * i_0_;
                                i_0_ = 0;
                            }
                            int i_40_ = i - anInt1160;
                            i_31_ += i_33_ * i_40_;
                            i_34_ += i_36_ * i_40_;
                            i_37_ += i_39_ * i_40_;
                            if (i != i_0_ && i_27_ < i_25_
                                    || i == i_0_ && i_27_ > i_26_) {
                                i_1_ -= i_0_;
                                i_0_ -= i;
                                i = anIntArray1156[i];
                                while (--i_0_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i, i_4_ >> 16, i_2_ >> 16, i_5_,
                                            i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_4_ += i_27_;
                                    i_2_ += i_25_;
                                    i_5_ += i_30_;
                                    i += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                                while (--i_1_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i, i_4_ >> 16, i_3_ >> 16, i_5_,
                                            i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_4_ += i_27_;
                                    i_3_ += i_26_;
                                    i_5_ += i_30_;
                                    i += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                            } else {
                                i_1_ -= i_0_;
                                i_0_ -= i;
                                i = anIntArray1156[i];
                                while (--i_0_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i, i_2_ >> 16, i_4_ >> 16, i_5_,
                                            i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_4_ += i_27_;
                                    i_2_ += i_25_;
                                    i_5_ += i_30_;
                                    i += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                                while (--i_1_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i, i_3_ >> 16, i_4_ >> 16, i_5_,
                                            i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_4_ += i_27_;
                                    i_3_ += i_26_;
                                    i_5_ += i_30_;
                                    i += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                            }
                        } else {
                            i_3_ = i_2_ <<= 16;
                            if (i < 0) {
                                i_3_ -= i_27_ * i;
                                i_2_ -= i_25_ * i;
                                i_5_ -= i_30_ * i;
                                i = 0;
                            }
                            i_4_ <<= 16;
                            if (i_1_ < 0) {
                                i_4_ -= i_26_ * i_1_;
                                i_1_ = 0;
                            }
                            int i_41_ = i - anInt1160;
                            i_31_ += i_33_ * i_41_;
                            i_34_ += i_36_ * i_41_;
                            i_37_ += i_39_ * i_41_;
                            if (i != i_1_ && i_27_ < i_25_
                                    || i == i_1_ && i_26_ > i_25_) {
                                i_0_ -= i_1_;
                                i_1_ -= i;
                                i = anIntArray1156[i];
                                while (--i_1_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i, i_3_ >> 16, i_2_ >> 16, i_5_,
                                            i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_3_ += i_27_;
                                    i_2_ += i_25_;
                                    i_5_ += i_30_;
                                    i += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                                while (--i_0_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i, i_4_ >> 16, i_2_ >> 16, i_5_,
                                            i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_4_ += i_26_;
                                    i_2_ += i_25_;
                                    i_5_ += i_30_;
                                    i += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                            } else {
                                i_0_ -= i_1_;
                                i_1_ -= i;
                                i = anIntArray1156[i];
                                while (--i_1_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i, i_2_ >> 16, i_3_ >> 16, i_5_,
                                            i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_3_ += i_27_;
                                    i_2_ += i_25_;
                                    i_5_ += i_30_;
                                    i += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                                while (--i_0_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i, i_2_ >> 16, i_4_ >> 16, i_5_,
                                            i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_4_ += i_26_;
                                    i_2_ += i_25_;
                                    i_5_ += i_30_;
                                    i += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                            }
                        }
                    }
                } else if (i_0_ <= i_1_) {
                    if (i_0_ < anInt1162) {
                        if (i_1_ > anInt1162)
                            i_1_ = anInt1162;
                        if (i > anInt1162)
                            i = anInt1162;
                        i_6_ = (i_6_ << 9) - i_29_ * i_3_ + i_29_;
                        if (i_1_ < i) {
                            i_2_ = i_3_ <<= 16;
                            if (i_0_ < 0) {
                                i_2_ -= i_25_ * i_0_;
                                i_3_ -= i_26_ * i_0_;
                                i_6_ -= i_30_ * i_0_;
                                i_0_ = 0;
                            }
                            i_4_ <<= 16;
                            if (i_1_ < 0) {
                                i_4_ -= i_27_ * i_1_;
                                i_1_ = 0;
                            }
                            int i_42_ = i_0_ - anInt1160;
                            i_31_ += i_33_ * i_42_;
                            i_34_ += i_36_ * i_42_;
                            i_37_ += i_39_ * i_42_;
                            if (i_0_ != i_1_ && i_25_ < i_26_
                                    || i_0_ == i_1_ && i_25_ > i_27_) {
                                i -= i_1_;
                                i_1_ -= i_0_;
                                i_0_ = anIntArray1156[i_0_];
                                while (--i_1_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i_0_, i_2_ >> 16, i_3_ >> 16,
                                            i_6_, i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_2_ += i_25_;
                                    i_3_ += i_26_;
                                    i_6_ += i_30_;
                                    i_0_ += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                                while (--i >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i_0_, i_2_ >> 16, i_4_ >> 16,
                                            i_6_, i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_2_ += i_25_;
                                    i_4_ += i_27_;
                                    i_6_ += i_30_;
                                    i_0_ += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                            } else {
                                i -= i_1_;
                                i_1_ -= i_0_;
                                i_0_ = anIntArray1156[i_0_];
                                while (--i_1_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i_0_, i_3_ >> 16, i_2_ >> 16,
                                            i_6_, i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_2_ += i_25_;
                                    i_3_ += i_26_;
                                    i_6_ += i_30_;
                                    i_0_ += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                                while (--i >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i_0_, i_4_ >> 16, i_2_ >> 16,
                                            i_6_, i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_2_ += i_25_;
                                    i_4_ += i_27_;
                                    i_6_ += i_30_;
                                    i_0_ += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                            }
                        } else {
                            i_4_ = i_3_ <<= 16;
                            if (i_0_ < 0) {
                                i_4_ -= i_25_ * i_0_;
                                i_3_ -= i_26_ * i_0_;
                                i_6_ -= i_30_ * i_0_;
                                i_0_ = 0;
                            }
                            i_2_ <<= 16;
                            if (i < 0) {
                                i_2_ -= i_27_ * i;
                                i = 0;
                            }
                            int i_43_ = i_0_ - anInt1160;
                            i_31_ += i_33_ * i_43_;
                            i_34_ += i_36_ * i_43_;
                            i_37_ += i_39_ * i_43_;
                            if (i_25_ < i_26_) {
                                i_1_ -= i;
                                i -= i_0_;
                                i_0_ = anIntArray1156[i_0_];
                                while (--i >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i_0_, i_4_ >> 16, i_3_ >> 16,
                                            i_6_, i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_4_ += i_25_;
                                    i_3_ += i_26_;
                                    i_6_ += i_30_;
                                    i_0_ += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                                while (--i_1_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i_0_, i_2_ >> 16, i_3_ >> 16,
                                            i_6_, i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_2_ += i_27_;
                                    i_3_ += i_26_;
                                    i_6_ += i_30_;
                                    i_0_ += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                            } else {
                                i_1_ -= i;
                                i -= i_0_;
                                i_0_ = anIntArray1156[i_0_];
                                while (--i >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i_0_, i_3_ >> 16, i_4_ >> 16,
                                            i_6_, i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_4_ += i_25_;
                                    i_3_ += i_26_;
                                    i_6_ += i_30_;
                                    i_0_ += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                                while (--i_1_ >= 0) {
                                    method619(Class79.anIntArray1402, is, 0, 0,
                                            i_0_, i_3_ >> 16, i_2_ >> 16,
                                            i_6_, i_29_, i_31_, i_34_, i_37_,
                                            i_32_, i_35_, i_38_);
                                    i_2_ += i_27_;
                                    i_3_ += i_26_;
                                    i_6_ += i_30_;
                                    i_0_ += Class79.anInt1401;
                                    i_31_ += i_33_;
                                    i_34_ += i_36_;
                                    i_37_ += i_39_;
                                }
                            }
                        }
                    }
                } else if (i_1_ < anInt1162) {
                    if (i > anInt1162)
                        i = anInt1162;
                    if (i_0_ > anInt1162)
                        i_0_ = anInt1162;
                    i_7_ = (i_7_ << 9) - i_29_ * i_4_ + i_29_;
                    if (i < i_0_) {
                        i_3_ = i_4_ <<= 16;
                        if (i_1_ < 0) {
                            i_3_ -= i_26_ * i_1_;
                            i_4_ -= i_27_ * i_1_;
                            i_7_ -= i_30_ * i_1_;
                            i_1_ = 0;
                        }
                        i_2_ <<= 16;
                        if (i < 0) {
                            i_2_ -= i_25_ * i;
                            i = 0;
                        }
                        int i_44_ = i_1_ - anInt1160;
                        i_31_ += i_33_ * i_44_;
                        i_34_ += i_36_ * i_44_;
                        i_37_ += i_39_ * i_44_;
                        if (i_26_ < i_27_) {
                            i_0_ -= i;
                            i -= i_1_;
                            i_1_ = anIntArray1156[i_1_];
                            while (--i >= 0) {
                                method619(Class79.anIntArray1402, is, 0, 0,
                                        i_1_, i_3_ >> 16, i_4_ >> 16, i_7_,
                                        i_29_, i_31_, i_34_, i_37_, i_32_,
                                        i_35_, i_38_);
                                i_3_ += i_26_;
                                i_4_ += i_27_;
                                i_7_ += i_30_;
                                i_1_ += Class79.anInt1401;
                                i_31_ += i_33_;
                                i_34_ += i_36_;
                                i_37_ += i_39_;
                            }
                            while (--i_0_ >= 0) {
                                method619(Class79.anIntArray1402, is, 0, 0,
                                        i_1_, i_3_ >> 16, i_2_ >> 16, i_7_,
                                        i_29_, i_31_, i_34_, i_37_, i_32_,
                                        i_35_, i_38_);
                                i_3_ += i_26_;
                                i_2_ += i_25_;
                                i_7_ += i_30_;
                                i_1_ += Class79.anInt1401;
                                i_31_ += i_33_;
                                i_34_ += i_36_;
                                i_37_ += i_39_;
                            }
                        } else {
                            i_0_ -= i;
                            i -= i_1_;
                            i_1_ = anIntArray1156[i_1_];
                            while (--i >= 0) {
                                method619(Class79.anIntArray1402, is, 0, 0,
                                        i_1_, i_4_ >> 16, i_3_ >> 16, i_7_,
                                        i_29_, i_31_, i_34_, i_37_, i_32_,
                                        i_35_, i_38_);
                                i_3_ += i_26_;
                                i_4_ += i_27_;
                                i_7_ += i_30_;
                                i_1_ += Class79.anInt1401;
                                i_31_ += i_33_;
                                i_34_ += i_36_;
                                i_37_ += i_39_;
                            }
                            while (--i_0_ >= 0) {
                                method619(Class79.anIntArray1402, is, 0, 0,
                                        i_1_, i_2_ >> 16, i_3_ >> 16, i_7_,
                                        i_29_, i_31_, i_34_, i_37_, i_32_,
                                        i_35_, i_38_);
                                i_3_ += i_26_;
                                i_2_ += i_25_;
                                i_7_ += i_30_;
                                i_1_ += Class79.anInt1401;
                                i_31_ += i_33_;
                                i_34_ += i_36_;
                                i_37_ += i_39_;
                            }
                        }
                    } else {
                        i_2_ = i_4_ <<= 16;
                        if (i_1_ < 0) {
                            i_2_ -= i_26_ * i_1_;
                            i_4_ -= i_27_ * i_1_;
                            i_7_ -= i_30_ * i_1_;
                            i_1_ = 0;
                        }
                        i_3_ <<= 16;
                        if (i_0_ < 0) {
                            i_3_ -= i_25_ * i_0_;
                            i_0_ = 0;
                        }
                        int i_45_ = i_1_ - anInt1160;
                        i_31_ += i_33_ * i_45_;
                        i_34_ += i_36_ * i_45_;
                        i_37_ += i_39_ * i_45_;
                        if (i_26_ < i_27_) {
                            i -= i_0_;
                            i_0_ -= i_1_;
                            i_1_ = anIntArray1156[i_1_];
                            while (--i_0_ >= 0) {
                                method619(Class79.anIntArray1402, is, 0, 0,
                                        i_1_, i_2_ >> 16, i_4_ >> 16, i_7_,
                                        i_29_, i_31_, i_34_, i_37_, i_32_,
                                        i_35_, i_38_);
                                i_2_ += i_26_;
                                i_4_ += i_27_;
                                i_7_ += i_30_;
                                i_1_ += Class79.anInt1401;
                                i_31_ += i_33_;
                                i_34_ += i_36_;
                                i_37_ += i_39_;
                            }
                            while (--i >= 0) {
                                method619(Class79.anIntArray1402, is, 0, 0,
                                        i_1_, i_3_ >> 16, i_4_ >> 16, i_7_,
                                        i_29_, i_31_, i_34_, i_37_, i_32_,
                                        i_35_, i_38_);
                                i_3_ += i_25_;
                                i_4_ += i_27_;
                                i_7_ += i_30_;
                                i_1_ += Class79.anInt1401;
                                i_31_ += i_33_;
                                i_34_ += i_36_;
                                i_37_ += i_39_;
                            }
                        } else {
                            i -= i_0_;
                            i_0_ -= i_1_;
                            i_1_ = anIntArray1156[i_1_];
                            while (--i_0_ >= 0) {
                                method619(Class79.anIntArray1402, is, 0, 0,
                                        i_1_, i_4_ >> 16, i_2_ >> 16, i_7_,
                                        i_29_, i_31_, i_34_, i_37_, i_32_,
                                        i_35_, i_38_);
                                i_2_ += i_26_;
                                i_4_ += i_27_;
                                i_7_ += i_30_;
                                i_1_ += Class79.anInt1401;
                                i_31_ += i_33_;
                                i_34_ += i_36_;
                                i_37_ += i_39_;
                            }
                            while (--i >= 0) {
                                method619(Class79.anIntArray1402, is, 0, 0,
                                        i_1_, i_4_ >> 16, i_3_ >> 16, i_7_,
                                        i_29_, i_31_, i_34_, i_37_, i_32_,
                                        i_35_, i_38_);
                                i_3_ += i_25_;
                                i_4_ += i_27_;
                                i_7_ += i_30_;
                                i_1_ += Class79.anInt1401;
                                i_31_ += i_33_;
                                i_34_ += i_36_;
                                i_37_ += i_39_;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method601(int i, int i_46_, int i_47_) {
        aBoolean1157
                = (i < 0 || i > anInt1168 || i_46_ < 0 || i_46_ > anInt1168
                || i_47_ < 0 || i_47_ > anInt1168);
    }

    public static void method602() {
        anIntArray1156 = null;
        anIntArray1158 = null;
        anInterface4_1159 = null;
        anIntArray1165 = null;
        anIntArray1154 = null;
        anIntArray1155 = null;
        anIntArray1167 = null;
    }

    public static void method603(int i, int i_48_) {
        int i_49_ = anIntArray1156[0];
        int i_50_ = i_49_ / Class79.anInt1401;
        int i_51_ = i_49_ - i_50_ * Class79.anInt1401;
        anInt1164 = i - i_51_;
        anInt1160 = i_48_ - i_50_;
        Class80.anInt1427 = -anInt1164;
        PacketParser.anInt1875 = anInt1168 - anInt1164;
        Animable.anInt63 = -anInt1160;
        Class68_Sub13_Sub38.anInt4079 = anInt1162 - anInt1160;
    }

    public static int method604() {
        return anIntArray1156[0] / Class79.anInt1401;
    }

    public static void method605(int[] is, int i, int i_52_, int i_53_,
                                 int i_54_, int i_55_, int i_56_, int i_57_) {
        if (aBoolean1157) {
            if (i_55_ > anInt1168)
                i_55_ = anInt1168;
            if (i_54_ < 0)
                i_54_ = 0;
        }
        if (i_54_ < i_55_) {
            i += i_54_;
            i_56_ += i_57_ * i_54_;
            if (aBoolean1163) {
                i_53_ = i_55_ - i_54_ >> 2;
                i_57_ <<= 2;
                if (anInt1153 == 0) {
                    if (i_53_ > 0) {
                        do {
                            i_52_ = anIntArray1158[i_56_ >> 8];
                            i_56_ += i_57_;
                            is[i++] = i_52_;
                            is[i++] = i_52_;
                            is[i++] = i_52_;
                            is[i++] = i_52_;
                        } while (--i_53_ > 0);
                    }
                    i_53_ = i_55_ - i_54_ & 0x3;
                    if (i_53_ > 0) {
                        i_52_ = anIntArray1158[i_56_ >> 8];
                        do
                            is[i++] = i_52_;
                        while (--i_53_ > 0);
                    }
                } else {
                    int i_58_ = anInt1153;
                    int i_59_ = 256 - anInt1153;
                    if (i_53_ > 0) {
                        do {
                            i_52_ = anIntArray1158[i_56_ >> 8];
                            i_56_ += i_57_;
                            i_52_
                                    = (((i_52_ & 0xff00ff) * i_59_ >> 8 & 0xff00ff)
                                    + ((i_52_ & 0xff00) * i_59_ >> 8 & 0xff00));
                            int i_60_ = is[i];
                            is[i++]
                                    = (i_52_
                                    + ((i_60_ & 0xff00ff) * i_58_ >> 8
                                    & 0xff00ff)
                                    + ((i_60_ & 0xff00) * i_58_ >> 8 & 0xff00));
                            i_60_ = is[i];
                            is[i++]
                                    = (i_52_
                                    + ((i_60_ & 0xff00ff) * i_58_ >> 8
                                    & 0xff00ff)
                                    + ((i_60_ & 0xff00) * i_58_ >> 8 & 0xff00));
                            i_60_ = is[i];
                            is[i++]
                                    = (i_52_
                                    + ((i_60_ & 0xff00ff) * i_58_ >> 8
                                    & 0xff00ff)
                                    + ((i_60_ & 0xff00) * i_58_ >> 8 & 0xff00));
                            i_60_ = is[i];
                            is[i++]
                                    = (i_52_
                                    + ((i_60_ & 0xff00ff) * i_58_ >> 8
                                    & 0xff00ff)
                                    + ((i_60_ & 0xff00) * i_58_ >> 8 & 0xff00));
                        } while (--i_53_ > 0);
                    }
                    i_53_ = i_55_ - i_54_ & 0x3;
                    if (i_53_ > 0) {
                        i_52_ = anIntArray1158[i_56_ >> 8];
                        i_52_ = (((i_52_ & 0xff00ff) * i_59_ >> 8 & 0xff00ff)
                                + ((i_52_ & 0xff00) * i_59_ >> 8 & 0xff00));
                        do {
                            int i_61_ = is[i];
                            is[i++]
                                    = (i_52_
                                    + ((i_61_ & 0xff00ff) * i_58_ >> 8
                                    & 0xff00ff)
                                    + ((i_61_ & 0xff00) * i_58_ >> 8 & 0xff00));
                        } while (--i_53_ > 0);
                    }
                }
            } else {
                i_53_ = i_55_ - i_54_;
                if (anInt1153 == 0) {
                    do {
                        is[i++] = anIntArray1158[i_56_ >> 8];
                        i_56_ += i_57_;
                    } while (--i_53_ > 0);
                } else {
                    int i_62_ = anInt1153;
                    int i_63_ = 256 - anInt1153;
                    do {
                        i_52_ = anIntArray1158[i_56_ >> 8];
                        i_56_ += i_57_;
                        i_52_ = (((i_52_ & 0xff00ff) * i_63_ >> 8 & 0xff00ff)
                                + ((i_52_ & 0xff00) * i_63_ >> 8 & 0xff00));
                        int i_64_ = is[i];
                        is[i++]
                                = (i_52_
                                + ((i_64_ & 0xff00ff) * i_62_ >> 8 & 0xff00ff)
                                + ((i_64_ & 0xff00) * i_62_ >> 8 & 0xff00));
                    } while (--i_53_ > 0);
                }
            }
        }
    }

    public static int method606() {
        return anIntArray1156[0] % Class79.anInt1401;
    }

    public static int method607(int i, int i_65_) {
        i_65_ = i_65_ * (i & 0x7f) >> 7;
        if (i_65_ < 2)
            i_65_ = 2;
        else if (i_65_ > 126)
            i_65_ = 126;
        return (i & 0xff80) + i_65_;
    }

    public static void method608(int[] is, int[] is_66_, int i, int i_67_,
                                 int i_68_, int i_69_, int i_70_, int i_71_,
                                 int i_72_, int i_73_, int i_74_, int i_75_,
                                 int i_76_, int i_77_, int i_78_) {
        if (aBoolean1157) {
            if (i_70_ > anInt1168)
                i_70_ = anInt1168;
            if (i_69_ < 0)
                i_69_ = 0;
        }
        if (i_69_ < i_70_) {
            i_68_ += i_69_;
            i_71_ += i_72_ * i_69_;
            int i_79_ = i_70_ - i_69_;
            do {
                if (aBoolean1166) {
                    int i_80_ = i_69_ - anInt1164;
                    i_73_ += (i_76_ >> 3) * i_80_;
                    i_74_ += (i_77_ >> 3) * i_80_;
                    i_75_ += (i_78_ >> 3) * i_80_;
                    int i_81_ = i_75_ >> 12;
                    int i_82_;
                    int i_83_;
                    if (i_81_ != 0) {
                        i_82_ = i_73_ / i_81_;
                        i_83_ = i_74_ / i_81_;
                    } else {
                        i_82_ = 0;
                        i_83_ = 0;
                    }
                    i_73_ += i_76_;
                    i_74_ += i_77_;
                    i_75_ += i_78_;
                    i_81_ = i_75_ >> 12;
                    int i_84_;
                    int i_85_;
                    if (i_81_ != 0) {
                        i_84_ = i_73_ / i_81_;
                        i_85_ = i_74_ / i_81_;
                    } else {
                        i_84_ = 0;
                        i_85_ = 0;
                    }
                    i = (i_82_ << 20) + i_83_;
                    int i_86_
                            = (i_84_ - i_82_ >> 3 << 20) + (i_85_ - i_83_ >> 3);
                    i_79_ >>= 3;
                    i_72_ <<= 3;
                    int i_87_ = i_71_ >> 8;
                    if (aBoolean1161) {
                        if (i_79_ > 0) {
                            do {
                                i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)];
                                is[i_68_++]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                                i += i_86_;
                                i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)];
                                is[i_68_++]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                                i += i_86_;
                                i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)];
                                is[i_68_++]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                                i += i_86_;
                                i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)];
                                is[i_68_++]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                                i += i_86_;
                                i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)];
                                is[i_68_++]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                                i += i_86_;
                                i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)];
                                is[i_68_++]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                                i += i_86_;
                                i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)];
                                is[i_68_++]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                                i += i_86_;
                                i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)];
                                is[i_68_++]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                                i += i_86_;
                                i_82_ = i_84_;
                                i_83_ = i_85_;
                                i_73_ += i_76_;
                                i_74_ += i_77_;
                                i_75_ += i_78_;
                                i_81_ = i_75_ >> 12;
                                if (i_81_ != 0) {
                                    i_84_ = i_73_ / i_81_;
                                    i_85_ = i_74_ / i_81_;
                                } else {
                                    i_84_ = 0;
                                    i_85_ = 0;
                                }
                                i = (i_82_ << 20) + i_83_;
                                i_86_ = ((i_84_ - i_82_ >> 3 << 20)
                                        + (i_85_ - i_83_ >> 3));
                                i_71_ += i_72_;
                                i_87_ = i_71_ >> 8;
                            } while (--i_79_ > 0);
                        }
                        i_79_ = i_70_ - i_69_ & 0x7;
                        if (i_79_ > 0) {
                            do {
                                i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)];
                                is[i_68_++]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                                i += i_86_;
                            } while (--i_79_ > 0);
                        }
                    } else {
                        if (i_79_ > 0) {
                            do {
                                if ((i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_68_] = (((i_67_ & 0xff00ff) * i_87_
                                            & ~0xff00ff)
                                            + ((i_67_ & 0xff00) * i_87_
                                            & 0xff0000)) >> 8;
                                i_68_++;
                                i += i_86_;
                                if ((i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_68_] = (((i_67_ & 0xff00ff) * i_87_
                                            & ~0xff00ff)
                                            + ((i_67_ & 0xff00) * i_87_
                                            & 0xff0000)) >> 8;
                                i_68_++;
                                i += i_86_;
                                if ((i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_68_] = (((i_67_ & 0xff00ff) * i_87_
                                            & ~0xff00ff)
                                            + ((i_67_ & 0xff00) * i_87_
                                            & 0xff0000)) >> 8;
                                i_68_++;
                                i += i_86_;
                                if ((i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_68_] = (((i_67_ & 0xff00ff) * i_87_
                                            & ~0xff00ff)
                                            + ((i_67_ & 0xff00) * i_87_
                                            & 0xff0000)) >> 8;
                                i_68_++;
                                i += i_86_;
                                if ((i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_68_] = (((i_67_ & 0xff00ff) * i_87_
                                            & ~0xff00ff)
                                            + ((i_67_ & 0xff00) * i_87_
                                            & 0xff0000)) >> 8;
                                i_68_++;
                                i += i_86_;
                                if ((i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_68_] = (((i_67_ & 0xff00ff) * i_87_
                                            & ~0xff00ff)
                                            + ((i_67_ & 0xff00) * i_87_
                                            & 0xff0000)) >> 8;
                                i_68_++;
                                i += i_86_;
                                if ((i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_68_] = (((i_67_ & 0xff00ff) * i_87_
                                            & ~0xff00ff)
                                            + ((i_67_ & 0xff00) * i_87_
                                            & 0xff0000)) >> 8;
                                i_68_++;
                                i += i_86_;
                                if ((i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_68_] = (((i_67_ & 0xff00ff) * i_87_
                                            & ~0xff00ff)
                                            + ((i_67_ & 0xff00) * i_87_
                                            & 0xff0000)) >> 8;
                                i_68_++;
                                i += i_86_;
                                i_82_ = i_84_;
                                i_83_ = i_85_;
                                i_73_ += i_76_;
                                i_74_ += i_77_;
                                i_75_ += i_78_;
                                i_81_ = i_75_ >> 12;
                                if (i_81_ != 0) {
                                    i_84_ = i_73_ / i_81_;
                                    i_85_ = i_74_ / i_81_;
                                } else {
                                    i_84_ = 0;
                                    i_85_ = 0;
                                }
                                i = (i_82_ << 20) + i_83_;
                                i_86_ = ((i_84_ - i_82_ >> 3 << 20)
                                        + (i_85_ - i_83_ >> 3));
                                i_71_ += i_72_;
                                i_87_ = i_71_ >> 8;
                            } while (--i_79_ > 0);
                        }
                        i_79_ = i_70_ - i_69_ & 0x7;
                        if (i_79_ <= 0)
                            break;
                        do {
                            if ((i_67_ = is_66_[(i & 0xfc0) + (i >>> 26)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_87_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_87_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_86_;
                        } while (--i_79_ > 0);
                    }
                    break;
                }
                int i_88_ = i_69_ - anInt1164;
                i_73_ += (i_76_ >> 3) * i_88_;
                i_74_ += (i_77_ >> 3) * i_88_;
                i_75_ += (i_78_ >> 3) * i_88_;
                int i_89_ = i_75_ >> 14;
                int i_90_;
                int i_91_;
                if (i_89_ != 0) {
                    i_90_ = i_73_ / i_89_;
                    i_91_ = i_74_ / i_89_;
                } else {
                    i_90_ = 0;
                    i_91_ = 0;
                }
                i_73_ += i_76_;
                i_74_ += i_77_;
                i_75_ += i_78_;
                i_89_ = i_75_ >> 14;
                int i_92_;
                int i_93_;
                if (i_89_ != 0) {
                    i_92_ = i_73_ / i_89_;
                    i_93_ = i_74_ / i_89_;
                } else {
                    i_92_ = 0;
                    i_93_ = 0;
                }
                i = (i_90_ << 18) + i_91_;
                int i_94_ = (i_92_ - i_90_ >> 3 << 18) + (i_93_ - i_91_ >> 3);
                i_79_ >>= 3;
                i_72_ <<= 3;
                int i_95_ = i_71_ >> 8;
                if (aBoolean1161) {
                    if (i_79_ > 0) {
                        do {
                            i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)];
                            is[i_68_++]
                                    = ((((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                    + ((i_67_ & 0xff00) * i_95_ & 0xff0000))
                                    >> 8);
                            i += i_94_;
                            i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)];
                            is[i_68_++]
                                    = ((((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                    + ((i_67_ & 0xff00) * i_95_ & 0xff0000))
                                    >> 8);
                            i += i_94_;
                            i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)];
                            is[i_68_++]
                                    = ((((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                    + ((i_67_ & 0xff00) * i_95_ & 0xff0000))
                                    >> 8);
                            i += i_94_;
                            i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)];
                            is[i_68_++]
                                    = ((((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                    + ((i_67_ & 0xff00) * i_95_ & 0xff0000))
                                    >> 8);
                            i += i_94_;
                            i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)];
                            is[i_68_++]
                                    = ((((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                    + ((i_67_ & 0xff00) * i_95_ & 0xff0000))
                                    >> 8);
                            i += i_94_;
                            i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)];
                            is[i_68_++]
                                    = ((((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                    + ((i_67_ & 0xff00) * i_95_ & 0xff0000))
                                    >> 8);
                            i += i_94_;
                            i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)];
                            is[i_68_++]
                                    = ((((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                    + ((i_67_ & 0xff00) * i_95_ & 0xff0000))
                                    >> 8);
                            i += i_94_;
                            i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)];
                            is[i_68_++]
                                    = ((((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                    + ((i_67_ & 0xff00) * i_95_ & 0xff0000))
                                    >> 8);
                            i += i_94_;
                            i_90_ = i_92_;
                            i_91_ = i_93_;
                            i_73_ += i_76_;
                            i_74_ += i_77_;
                            i_75_ += i_78_;
                            i_89_ = i_75_ >> 14;
                            if (i_89_ != 0) {
                                i_92_ = i_73_ / i_89_;
                                i_93_ = i_74_ / i_89_;
                            } else {
                                i_92_ = 0;
                                i_93_ = 0;
                            }
                            i = (i_90_ << 18) + i_91_;
                            i_94_ = (i_92_ - i_90_ >> 3 << 18) + (i_93_ - i_91_
                                    >> 3);
                            i_71_ += i_72_;
                            i_95_ = i_71_ >> 8;
                        } while (--i_79_ > 0);
                    }
                    i_79_ = i_70_ - i_69_ & 0x7;
                    if (i_79_ > 0) {
                        do {
                            i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)];
                            is[i_68_++]
                                    = ((((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                    + ((i_67_ & 0xff00) * i_95_ & 0xff0000))
                                    >> 8);
                            i += i_94_;
                        } while (--i_79_ > 0);
                        break;
                    }
                } else {
                    if (i_79_ > 0) {
                        do {
                            if ((i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_95_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_94_;
                            if ((i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_95_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_94_;
                            if ((i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_95_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_94_;
                            if ((i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_95_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_94_;
                            if ((i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_95_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_94_;
                            if ((i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_95_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_94_;
                            if ((i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_95_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_94_;
                            if ((i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_95_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_94_;
                            i_90_ = i_92_;
                            i_91_ = i_93_;
                            i_73_ += i_76_;
                            i_74_ += i_77_;
                            i_75_ += i_78_;
                            i_89_ = i_75_ >> 14;
                            if (i_89_ != 0) {
                                i_92_ = i_73_ / i_89_;
                                i_93_ = i_74_ / i_89_;
                            } else {
                                i_92_ = 0;
                                i_93_ = 0;
                            }
                            i = (i_90_ << 18) + i_91_;
                            i_94_ = (i_92_ - i_90_ >> 3 << 18) + (i_93_ - i_91_
                                    >> 3);
                            i_71_ += i_72_;
                            i_95_ = i_71_ >> 8;
                        } while (--i_79_ > 0);
                    }
                    i_79_ = i_70_ - i_69_ & 0x7;
                    if (i_79_ > 0) {
                        do {
                            if ((i_67_ = is_66_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_68_]
                                        = (((i_67_ & 0xff00ff) * i_95_ & ~0xff00ff)
                                        + ((i_67_ & 0xff00) * i_95_
                                        & 0xff0000)) >> 8;
                            i_68_++;
                            i += i_94_;
                        } while (--i_79_ > 0);
                    }
                }
            } while (false);
        }
    }

    public static void method609(float f) {
        aFloat1151 = f;
        aFloat1151 += Math.random() * 0.03 - 0.015;
    }

    public static void method610(int i, int i_96_, int i_97_, int i_98_,
                                 int i_99_, int i_100_, int i_101_) {
        int i_102_ = 0;
        if (i_96_ != i)
            i_102_ = (i_99_ - i_98_ << 16) / (i_96_ - i);
        int i_103_ = 0;
        if (i_97_ != i_96_)
            i_103_ = (i_100_ - i_99_ << 16) / (i_97_ - i_96_);
        int i_104_ = 0;
        if (i_97_ != i)
            i_104_ = (i_98_ - i_100_ << 16) / (i - i_97_);
        if (i <= i_96_ && i <= i_97_) {
            if (i < anInt1162) {
                if (i_96_ > anInt1162)
                    i_96_ = anInt1162;
                if (i_97_ > anInt1162)
                    i_97_ = anInt1162;
                if (i_96_ < i_97_) {
                    i_100_ = i_98_ <<= 16;
                    if (i < 0) {
                        i_100_ -= i_104_ * i;
                        i_98_ -= i_102_ * i;
                        i = 0;
                    }
                    i_99_ <<= 16;
                    if (i_96_ < 0) {
                        i_99_ -= i_103_ * i_96_;
                        i_96_ = 0;
                    }
                    if (i != i_96_ && i_104_ < i_102_
                            || i == i_96_ && i_104_ > i_103_) {
                        i_97_ -= i_96_;
                        i_96_ -= i;
                        i = anIntArray1156[i];
                        while (--i_96_ >= 0) {
                            method615(Class79.anIntArray1402, i, i_101_, 0,
                                    i_100_ >> 16, i_98_ >> 16);
                            i_100_ += i_104_;
                            i_98_ += i_102_;
                            i += Class79.anInt1401;
                        }
                        while (--i_97_ >= 0) {
                            method615(Class79.anIntArray1402, i, i_101_, 0,
                                    i_100_ >> 16, i_99_ >> 16);
                            i_100_ += i_104_;
                            i_99_ += i_103_;
                            i += Class79.anInt1401;
                        }
                    } else {
                        i_97_ -= i_96_;
                        i_96_ -= i;
                        i = anIntArray1156[i];
                        while (--i_96_ >= 0) {
                            method615(Class79.anIntArray1402, i, i_101_, 0,
                                    i_98_ >> 16, i_100_ >> 16);
                            i_100_ += i_104_;
                            i_98_ += i_102_;
                            i += Class79.anInt1401;
                        }
                        while (--i_97_ >= 0) {
                            method615(Class79.anIntArray1402, i, i_101_, 0,
                                    i_99_ >> 16, i_100_ >> 16);
                            i_100_ += i_104_;
                            i_99_ += i_103_;
                            i += Class79.anInt1401;
                        }
                    }
                } else {
                    i_99_ = i_98_ <<= 16;
                    if (i < 0) {
                        i_99_ -= i_104_ * i;
                        i_98_ -= i_102_ * i;
                        i = 0;
                    }
                    i_100_ <<= 16;
                    if (i_97_ < 0) {
                        i_100_ -= i_103_ * i_97_;
                        i_97_ = 0;
                    }
                    if (i != i_97_ && i_104_ < i_102_
                            || i == i_97_ && i_103_ > i_102_) {
                        i_96_ -= i_97_;
                        i_97_ -= i;
                        i = anIntArray1156[i];
                        while (--i_97_ >= 0) {
                            method615(Class79.anIntArray1402, i, i_101_, 0,
                                    i_99_ >> 16, i_98_ >> 16);
                            i_99_ += i_104_;
                            i_98_ += i_102_;
                            i += Class79.anInt1401;
                        }
                        while (--i_96_ >= 0) {
                            method615(Class79.anIntArray1402, i, i_101_, 0,
                                    i_100_ >> 16, i_98_ >> 16);
                            i_100_ += i_103_;
                            i_98_ += i_102_;
                            i += Class79.anInt1401;
                        }
                    } else {
                        i_96_ -= i_97_;
                        i_97_ -= i;
                        i = anIntArray1156[i];
                        while (--i_97_ >= 0) {
                            method615(Class79.anIntArray1402, i, i_101_, 0,
                                    i_98_ >> 16, i_99_ >> 16);
                            i_99_ += i_104_;
                            i_98_ += i_102_;
                            i += Class79.anInt1401;
                        }
                        while (--i_96_ >= 0) {
                            method615(Class79.anIntArray1402, i, i_101_, 0,
                                    i_98_ >> 16, i_100_ >> 16);
                            i_100_ += i_103_;
                            i_98_ += i_102_;
                            i += Class79.anInt1401;
                        }
                    }
                }
            }
        } else if (i_96_ <= i_97_) {
            if (i_96_ < anInt1162) {
                if (i_97_ > anInt1162)
                    i_97_ = anInt1162;
                if (i > anInt1162)
                    i = anInt1162;
                if (i_97_ < i) {
                    i_98_ = i_99_ <<= 16;
                    if (i_96_ < 0) {
                        i_98_ -= i_102_ * i_96_;
                        i_99_ -= i_103_ * i_96_;
                        i_96_ = 0;
                    }
                    i_100_ <<= 16;
                    if (i_97_ < 0) {
                        i_100_ -= i_104_ * i_97_;
                        i_97_ = 0;
                    }
                    if (i_96_ != i_97_ && i_102_ < i_103_
                            || i_96_ == i_97_ && i_102_ > i_104_) {
                        i -= i_97_;
                        i_97_ -= i_96_;
                        i_96_ = anIntArray1156[i_96_];
                        while (--i_97_ >= 0) {
                            method615(Class79.anIntArray1402, i_96_, i_101_, 0,
                                    i_98_ >> 16, i_99_ >> 16);
                            i_98_ += i_102_;
                            i_99_ += i_103_;
                            i_96_ += Class79.anInt1401;
                        }
                        while (--i >= 0) {
                            method615(Class79.anIntArray1402, i_96_, i_101_, 0,
                                    i_98_ >> 16, i_100_ >> 16);
                            i_98_ += i_102_;
                            i_100_ += i_104_;
                            i_96_ += Class79.anInt1401;
                        }
                    } else {
                        i -= i_97_;
                        i_97_ -= i_96_;
                        i_96_ = anIntArray1156[i_96_];
                        while (--i_97_ >= 0) {
                            method615(Class79.anIntArray1402, i_96_, i_101_, 0,
                                    i_99_ >> 16, i_98_ >> 16);
                            i_98_ += i_102_;
                            i_99_ += i_103_;
                            i_96_ += Class79.anInt1401;
                        }
                        while (--i >= 0) {
                            method615(Class79.anIntArray1402, i_96_, i_101_, 0,
                                    i_100_ >> 16, i_98_ >> 16);
                            i_98_ += i_102_;
                            i_100_ += i_104_;
                            i_96_ += Class79.anInt1401;
                        }
                    }
                } else {
                    i_100_ = i_99_ <<= 16;
                    if (i_96_ < 0) {
                        i_100_ -= i_102_ * i_96_;
                        i_99_ -= i_103_ * i_96_;
                        i_96_ = 0;
                    }
                    i_98_ <<= 16;
                    if (i < 0) {
                        i_98_ -= i_104_ * i;
                        i = 0;
                    }
                    if (i_102_ < i_103_) {
                        i_97_ -= i;
                        i -= i_96_;
                        i_96_ = anIntArray1156[i_96_];
                        while (--i >= 0) {
                            method615(Class79.anIntArray1402, i_96_, i_101_, 0,
                                    i_100_ >> 16, i_99_ >> 16);
                            i_100_ += i_102_;
                            i_99_ += i_103_;
                            i_96_ += Class79.anInt1401;
                        }
                        while (--i_97_ >= 0) {
                            method615(Class79.anIntArray1402, i_96_, i_101_, 0,
                                    i_98_ >> 16, i_99_ >> 16);
                            i_98_ += i_104_;
                            i_99_ += i_103_;
                            i_96_ += Class79.anInt1401;
                        }
                    } else {
                        i_97_ -= i;
                        i -= i_96_;
                        i_96_ = anIntArray1156[i_96_];
                        while (--i >= 0) {
                            method615(Class79.anIntArray1402, i_96_, i_101_, 0,
                                    i_99_ >> 16, i_100_ >> 16);
                            i_100_ += i_102_;
                            i_99_ += i_103_;
                            i_96_ += Class79.anInt1401;
                        }
                        while (--i_97_ >= 0) {
                            method615(Class79.anIntArray1402, i_96_, i_101_, 0,
                                    i_99_ >> 16, i_98_ >> 16);
                            i_98_ += i_104_;
                            i_99_ += i_103_;
                            i_96_ += Class79.anInt1401;
                        }
                    }
                }
            }
        } else if (i_97_ < anInt1162) {
            if (i > anInt1162)
                i = anInt1162;
            if (i_96_ > anInt1162)
                i_96_ = anInt1162;
            if (i < i_96_) {
                i_99_ = i_100_ <<= 16;
                if (i_97_ < 0) {
                    i_99_ -= i_103_ * i_97_;
                    i_100_ -= i_104_ * i_97_;
                    i_97_ = 0;
                }
                i_98_ <<= 16;
                if (i < 0) {
                    i_98_ -= i_102_ * i;
                    i = 0;
                }
                if (i_103_ < i_104_) {
                    i_96_ -= i;
                    i -= i_97_;
                    i_97_ = anIntArray1156[i_97_];
                    while (--i >= 0) {
                        method615(Class79.anIntArray1402, i_97_, i_101_, 0,
                                i_99_ >> 16, i_100_ >> 16);
                        i_99_ += i_103_;
                        i_100_ += i_104_;
                        i_97_ += Class79.anInt1401;
                    }
                    while (--i_96_ >= 0) {
                        method615(Class79.anIntArray1402, i_97_, i_101_, 0,
                                i_99_ >> 16, i_98_ >> 16);
                        i_99_ += i_103_;
                        i_98_ += i_102_;
                        i_97_ += Class79.anInt1401;
                    }
                } else {
                    i_96_ -= i;
                    i -= i_97_;
                    i_97_ = anIntArray1156[i_97_];
                    while (--i >= 0) {
                        method615(Class79.anIntArray1402, i_97_, i_101_, 0,
                                i_100_ >> 16, i_99_ >> 16);
                        i_99_ += i_103_;
                        i_100_ += i_104_;
                        i_97_ += Class79.anInt1401;
                    }
                    while (--i_96_ >= 0) {
                        method615(Class79.anIntArray1402, i_97_, i_101_, 0,
                                i_98_ >> 16, i_99_ >> 16);
                        i_99_ += i_103_;
                        i_98_ += i_102_;
                        i_97_ += Class79.anInt1401;
                    }
                }
            } else {
                i_98_ = i_100_ <<= 16;
                if (i_97_ < 0) {
                    i_98_ -= i_103_ * i_97_;
                    i_100_ -= i_104_ * i_97_;
                    i_97_ = 0;
                }
                i_99_ <<= 16;
                if (i_96_ < 0) {
                    i_99_ -= i_102_ * i_96_;
                    i_96_ = 0;
                }
                if (i_103_ < i_104_) {
                    i -= i_96_;
                    i_96_ -= i_97_;
                    i_97_ = anIntArray1156[i_97_];
                    while (--i_96_ >= 0) {
                        method615(Class79.anIntArray1402, i_97_, i_101_, 0,
                                i_98_ >> 16, i_100_ >> 16);
                        i_98_ += i_103_;
                        i_100_ += i_104_;
                        i_97_ += Class79.anInt1401;
                    }
                    while (--i >= 0) {
                        method615(Class79.anIntArray1402, i_97_, i_101_, 0,
                                i_99_ >> 16, i_100_ >> 16);
                        i_99_ += i_102_;
                        i_100_ += i_104_;
                        i_97_ += Class79.anInt1401;
                    }
                } else {
                    i -= i_96_;
                    i_96_ -= i_97_;
                    i_97_ = anIntArray1156[i_97_];
                    while (--i_96_ >= 0) {
                        method615(Class79.anIntArray1402, i_97_, i_101_, 0,
                                i_100_ >> 16, i_98_ >> 16);
                        i_98_ += i_103_;
                        i_100_ += i_104_;
                        i_97_ += Class79.anInt1401;
                    }
                    while (--i >= 0) {
                        method615(Class79.anIntArray1402, i_97_, i_101_, 0,
                                i_100_ >> 16, i_99_ >> 16);
                        i_99_ += i_102_;
                        i_100_ += i_104_;
                        i_97_ += Class79.anInt1401;
                    }
                }
            }
        }
    }

    public static void method611(Interface4 interface4) {
        anInterface4_1159 = interface4;
    }

    public static void method612() {
        method613(Class79.anInt1400, Class79.anInt1403, Class79.anInt1398,
                Class79.anInt1404);
    }

    public static void method613(int i, int i_105_, int i_106_, int i_107_) {
        anInt1168 = i_106_ - i;
        anInt1162 = i_107_ - i_105_;
        method620();
        if (anIntArray1156.length < anInt1162)
            anIntArray1156 = new int[Class90.method1517(anInt1162, -21189)];
        int i_108_ = i_105_ * Class79.anInt1401 + i;
        for (int i_109_ = 0; i_109_ < anInt1162; i_109_++) {
            anIntArray1156[i_109_] = i_108_;
            i_108_ += Class79.anInt1401;
        }
    }

    public static void method614(float f) {
        method609(f);
        method618(0, 512);
    }

    public static void method615(int[] is, int i, int i_110_, int i_111_,
                                 int i_112_, int i_113_) {
        if (aBoolean1157) {
            if (i_113_ > anInt1168)
                i_113_ = anInt1168;
            if (i_112_ < 0)
                i_112_ = 0;
        }
        if (i_112_ < i_113_) {
            i += i_112_;
            i_111_ = i_113_ - i_112_ >> 2;
            if (anInt1153 == 0) {
                while (--i_111_ >= 0) {
                    is[i++] = i_110_;
                    is[i++] = i_110_;
                    is[i++] = i_110_;
                    is[i++] = i_110_;
                }
                i_111_ = i_113_ - i_112_ & 0x3;
                while (--i_111_ >= 0)
                    is[i++] = i_110_;
            } else if (anInt1153 == 254) {
                while (--i_111_ >= 0) {
                    is[i++] = is[i];
                    is[i++] = is[i];
                    is[i++] = is[i];
                    is[i++] = is[i];
                }
                i_111_ = i_113_ - i_112_ & 0x3;
                while (--i_111_ >= 0)
                    is[i++] = is[i];
            } else {
                int i_114_ = anInt1153;
                int i_115_ = 256 - anInt1153;
                i_110_ = (((i_110_ & 0xff00ff) * i_115_ >> 8 & 0xff00ff)
                        + ((i_110_ & 0xff00) * i_115_ >> 8 & 0xff00));
                while (--i_111_ >= 0) {
                    int i_116_ = is[i];
                    is[i++] = (i_110_
                            + ((i_116_ & 0xff00ff) * i_114_ >> 8 & 0xff00ff)
                            + ((i_116_ & 0xff00) * i_114_ >> 8 & 0xff00));
                    i_116_ = is[i];
                    is[i++] = (i_110_
                            + ((i_116_ & 0xff00ff) * i_114_ >> 8 & 0xff00ff)
                            + ((i_116_ & 0xff00) * i_114_ >> 8 & 0xff00));
                    i_116_ = is[i];
                    is[i++] = (i_110_
                            + ((i_116_ & 0xff00ff) * i_114_ >> 8 & 0xff00ff)
                            + ((i_116_ & 0xff00) * i_114_ >> 8 & 0xff00));
                    i_116_ = is[i];
                    is[i++] = (i_110_
                            + ((i_116_ & 0xff00ff) * i_114_ >> 8 & 0xff00ff)
                            + ((i_116_ & 0xff00) * i_114_ >> 8 & 0xff00));
                }
                i_111_ = i_113_ - i_112_ & 0x3;
                while (--i_111_ >= 0) {
                    int i_117_ = is[i];
                    is[i++] = (i_110_
                            + ((i_117_ & 0xff00ff) * i_114_ >> 8 & 0xff00ff)
                            + ((i_117_ & 0xff00) * i_114_ >> 8 & 0xff00));
                }
            }
        }
    }

    public static void method616
            (int i, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_,
             int i_123_, int i_124_, int i_125_, int i_126_, int i_127_,
             int i_128_, int i_129_, int i_130_, int i_131_, int i_132_,
             int i_133_, int i_134_, int i_135_) {
        int[] is = anInterface4_1159.method14(aFloat1151, 99, i_135_);
        if (is == null || anInt1153 > 10) {
            int i_136_ = anInterface4_1159.method12(i_135_, -79);
            aBoolean1152 = true;
            method617(i, i_118_, i_119_, i_120_, i_121_, i_122_,
                    method607(i_136_, i_123_), method607(i_136_, i_124_),
                    method607(i_136_, i_125_));
        } else {
            aBoolean1166 = anInterface4_1159.method9((byte) -118, i_135_);
            aBoolean1161 = anInterface4_1159.method10(i_135_, 2);
            int i_137_ = i_121_ - i_120_;
            int i_138_ = i_118_ - i;
            int i_139_ = i_122_ - i_120_;
            int i_140_ = i_119_ - i;
            int i_141_ = i_124_ - i_123_;
            int i_142_ = i_125_ - i_123_;
            int i_143_ = 0;
            if (i_118_ != i)
                i_143_ = (i_121_ - i_120_ << 16) / (i_118_ - i);
            int i_144_ = 0;
            if (i_119_ != i_118_)
                i_144_ = (i_122_ - i_121_ << 16) / (i_119_ - i_118_);
            int i_145_ = 0;
            if (i_119_ != i)
                i_145_ = (i_120_ - i_122_ << 16) / (i - i_119_);
            int i_146_ = i_137_ * i_140_ - i_139_ * i_138_;
            if (i_146_ != 0) {
                int i_147_ = (i_141_ * i_140_ - i_142_ * i_138_ << 9) / i_146_;
                int i_148_ = (i_142_ * i_137_ - i_141_ * i_139_ << 9) / i_146_;
                i_127_ = i_126_ - i_127_;
                i_130_ = i_129_ - i_130_;
                i_133_ = i_132_ - i_133_;
                i_128_ -= i_126_;
                i_131_ -= i_129_;
                i_134_ -= i_132_;
                int i_149_ = i_128_ * i_129_ - i_131_ * i_126_ << 14;
                int i_150_ = i_131_ * i_132_ - i_134_ * i_129_ << 8;
                int i_151_ = i_134_ * i_126_ - i_128_ * i_132_ << 5;
                int i_152_ = i_127_ * i_129_ - i_130_ * i_126_ << 14;
                int i_153_ = i_130_ * i_132_ - i_133_ * i_129_ << 8;
                int i_154_ = i_133_ * i_126_ - i_127_ * i_132_ << 5;
                int i_155_ = i_130_ * i_128_ - i_127_ * i_131_ << 14;
                int i_156_ = i_133_ * i_131_ - i_130_ * i_134_ << 8;
                int i_157_ = i_127_ * i_134_ - i_133_ * i_128_ << 5;
                if (i <= i_118_ && i <= i_119_) {
                    if (i < anInt1162) {
                        if (i_118_ > anInt1162)
                            i_118_ = anInt1162;
                        if (i_119_ > anInt1162)
                            i_119_ = anInt1162;
                        i_123_ = (i_123_ << 9) - i_147_ * i_120_ + i_147_;
                        if (i_118_ < i_119_) {
                            i_122_ = i_120_ <<= 16;
                            if (i < 0) {
                                i_122_ -= i_145_ * i;
                                i_120_ -= i_143_ * i;
                                i_123_ -= i_148_ * i;
                                i = 0;
                            }
                            i_121_ <<= 16;
                            if (i_118_ < 0) {
                                i_121_ -= i_144_ * i_118_;
                                i_118_ = 0;
                            }
                            int i_158_ = i - anInt1160;
                            i_149_ += i_151_ * i_158_;
                            i_152_ += i_154_ * i_158_;
                            i_155_ += i_157_ * i_158_;
                            if (i != i_118_ && i_145_ < i_143_
                                    || i == i_118_ && i_145_ > i_144_) {
                                i_119_ -= i_118_;
                                i_118_ -= i;
                                i = anIntArray1156[i];
                                while (--i_118_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i, i_122_ >> 16, i_120_ >> 16,
                                            i_123_, i_147_, i_149_, i_152_,
                                            i_155_, i_150_, i_153_, i_156_);
                                    i_122_ += i_145_;
                                    i_120_ += i_143_;
                                    i_123_ += i_148_;
                                    i += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                                while (--i_119_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i, i_122_ >> 16, i_121_ >> 16,
                                            i_123_, i_147_, i_149_, i_152_,
                                            i_155_, i_150_, i_153_, i_156_);
                                    i_122_ += i_145_;
                                    i_121_ += i_144_;
                                    i_123_ += i_148_;
                                    i += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                            } else {
                                i_119_ -= i_118_;
                                i_118_ -= i;
                                i = anIntArray1156[i];
                                while (--i_118_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i, i_120_ >> 16, i_122_ >> 16,
                                            i_123_, i_147_, i_149_, i_152_,
                                            i_155_, i_150_, i_153_, i_156_);
                                    i_122_ += i_145_;
                                    i_120_ += i_143_;
                                    i_123_ += i_148_;
                                    i += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                                while (--i_119_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i, i_121_ >> 16, i_122_ >> 16,
                                            i_123_, i_147_, i_149_, i_152_,
                                            i_155_, i_150_, i_153_, i_156_);
                                    i_122_ += i_145_;
                                    i_121_ += i_144_;
                                    i_123_ += i_148_;
                                    i += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                            }
                        } else {
                            i_121_ = i_120_ <<= 16;
                            if (i < 0) {
                                i_121_ -= i_145_ * i;
                                i_120_ -= i_143_ * i;
                                i_123_ -= i_148_ * i;
                                i = 0;
                            }
                            i_122_ <<= 16;
                            if (i_119_ < 0) {
                                i_122_ -= i_144_ * i_119_;
                                i_119_ = 0;
                            }
                            int i_159_ = i - anInt1160;
                            i_149_ += i_151_ * i_159_;
                            i_152_ += i_154_ * i_159_;
                            i_155_ += i_157_ * i_159_;
                            if (i != i_119_ && i_145_ < i_143_
                                    || i == i_119_ && i_144_ > i_143_) {
                                i_118_ -= i_119_;
                                i_119_ -= i;
                                i = anIntArray1156[i];
                                while (--i_119_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i, i_121_ >> 16, i_120_ >> 16,
                                            i_123_, i_147_, i_149_, i_152_,
                                            i_155_, i_150_, i_153_, i_156_);
                                    i_121_ += i_145_;
                                    i_120_ += i_143_;
                                    i_123_ += i_148_;
                                    i += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                                while (--i_118_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i, i_122_ >> 16, i_120_ >> 16,
                                            i_123_, i_147_, i_149_, i_152_,
                                            i_155_, i_150_, i_153_, i_156_);
                                    i_122_ += i_144_;
                                    i_120_ += i_143_;
                                    i_123_ += i_148_;
                                    i += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                            } else {
                                i_118_ -= i_119_;
                                i_119_ -= i;
                                i = anIntArray1156[i];
                                while (--i_119_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i, i_120_ >> 16, i_121_ >> 16,
                                            i_123_, i_147_, i_149_, i_152_,
                                            i_155_, i_150_, i_153_, i_156_);
                                    i_121_ += i_145_;
                                    i_120_ += i_143_;
                                    i_123_ += i_148_;
                                    i += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                                while (--i_118_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i, i_120_ >> 16, i_122_ >> 16,
                                            i_123_, i_147_, i_149_, i_152_,
                                            i_155_, i_150_, i_153_, i_156_);
                                    i_122_ += i_144_;
                                    i_120_ += i_143_;
                                    i_123_ += i_148_;
                                    i += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                            }
                        }
                    }
                } else if (i_118_ <= i_119_) {
                    if (i_118_ < anInt1162) {
                        if (i_119_ > anInt1162)
                            i_119_ = anInt1162;
                        if (i > anInt1162)
                            i = anInt1162;
                        i_124_ = (i_124_ << 9) - i_147_ * i_121_ + i_147_;
                        if (i_119_ < i) {
                            i_120_ = i_121_ <<= 16;
                            if (i_118_ < 0) {
                                i_120_ -= i_143_ * i_118_;
                                i_121_ -= i_144_ * i_118_;
                                i_124_ -= i_148_ * i_118_;
                                i_118_ = 0;
                            }
                            i_122_ <<= 16;
                            if (i_119_ < 0) {
                                i_122_ -= i_145_ * i_119_;
                                i_119_ = 0;
                            }
                            int i_160_ = i_118_ - anInt1160;
                            i_149_ += i_151_ * i_160_;
                            i_152_ += i_154_ * i_160_;
                            i_155_ += i_157_ * i_160_;
                            if (i_118_ != i_119_ && i_143_ < i_144_
                                    || i_118_ == i_119_ && i_143_ > i_145_) {
                                i -= i_119_;
                                i_119_ -= i_118_;
                                i_118_ = anIntArray1156[i_118_];
                                while (--i_119_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i_118_, i_120_ >> 16,
                                            i_121_ >> 16, i_124_, i_147_,
                                            i_149_, i_152_, i_155_, i_150_,
                                            i_153_, i_156_);
                                    i_120_ += i_143_;
                                    i_121_ += i_144_;
                                    i_124_ += i_148_;
                                    i_118_ += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                                while (--i >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i_118_, i_120_ >> 16,
                                            i_122_ >> 16, i_124_, i_147_,
                                            i_149_, i_152_, i_155_, i_150_,
                                            i_153_, i_156_);
                                    i_120_ += i_143_;
                                    i_122_ += i_145_;
                                    i_124_ += i_148_;
                                    i_118_ += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                            } else {
                                i -= i_119_;
                                i_119_ -= i_118_;
                                i_118_ = anIntArray1156[i_118_];
                                while (--i_119_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i_118_, i_121_ >> 16,
                                            i_120_ >> 16, i_124_, i_147_,
                                            i_149_, i_152_, i_155_, i_150_,
                                            i_153_, i_156_);
                                    i_120_ += i_143_;
                                    i_121_ += i_144_;
                                    i_124_ += i_148_;
                                    i_118_ += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                                while (--i >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i_118_, i_122_ >> 16,
                                            i_120_ >> 16, i_124_, i_147_,
                                            i_149_, i_152_, i_155_, i_150_,
                                            i_153_, i_156_);
                                    i_120_ += i_143_;
                                    i_122_ += i_145_;
                                    i_124_ += i_148_;
                                    i_118_ += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                            }
                        } else {
                            i_122_ = i_121_ <<= 16;
                            if (i_118_ < 0) {
                                i_122_ -= i_143_ * i_118_;
                                i_121_ -= i_144_ * i_118_;
                                i_124_ -= i_148_ * i_118_;
                                i_118_ = 0;
                            }
                            i_120_ <<= 16;
                            if (i < 0) {
                                i_120_ -= i_145_ * i;
                                i = 0;
                            }
                            int i_161_ = i_118_ - anInt1160;
                            i_149_ += i_151_ * i_161_;
                            i_152_ += i_154_ * i_161_;
                            i_155_ += i_157_ * i_161_;
                            if (i_143_ < i_144_) {
                                i_119_ -= i;
                                i -= i_118_;
                                i_118_ = anIntArray1156[i_118_];
                                while (--i >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i_118_, i_122_ >> 16,
                                            i_121_ >> 16, i_124_, i_147_,
                                            i_149_, i_152_, i_155_, i_150_,
                                            i_153_, i_156_);
                                    i_122_ += i_143_;
                                    i_121_ += i_144_;
                                    i_124_ += i_148_;
                                    i_118_ += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                                while (--i_119_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i_118_, i_120_ >> 16,
                                            i_121_ >> 16, i_124_, i_147_,
                                            i_149_, i_152_, i_155_, i_150_,
                                            i_153_, i_156_);
                                    i_120_ += i_145_;
                                    i_121_ += i_144_;
                                    i_124_ += i_148_;
                                    i_118_ += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                            } else {
                                i_119_ -= i;
                                i -= i_118_;
                                i_118_ = anIntArray1156[i_118_];
                                while (--i >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i_118_, i_121_ >> 16,
                                            i_122_ >> 16, i_124_, i_147_,
                                            i_149_, i_152_, i_155_, i_150_,
                                            i_153_, i_156_);
                                    i_122_ += i_143_;
                                    i_121_ += i_144_;
                                    i_124_ += i_148_;
                                    i_118_ += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                                while (--i_119_ >= 0) {
                                    method608(Class79.anIntArray1402, is, 0, 0,
                                            i_118_, i_121_ >> 16,
                                            i_120_ >> 16, i_124_, i_147_,
                                            i_149_, i_152_, i_155_, i_150_,
                                            i_153_, i_156_);
                                    i_120_ += i_145_;
                                    i_121_ += i_144_;
                                    i_124_ += i_148_;
                                    i_118_ += Class79.anInt1401;
                                    i_149_ += i_151_;
                                    i_152_ += i_154_;
                                    i_155_ += i_157_;
                                }
                            }
                        }
                    }
                } else if (i_119_ < anInt1162) {
                    if (i > anInt1162)
                        i = anInt1162;
                    if (i_118_ > anInt1162)
                        i_118_ = anInt1162;
                    i_125_ = (i_125_ << 9) - i_147_ * i_122_ + i_147_;
                    if (i < i_118_) {
                        i_121_ = i_122_ <<= 16;
                        if (i_119_ < 0) {
                            i_121_ -= i_144_ * i_119_;
                            i_122_ -= i_145_ * i_119_;
                            i_125_ -= i_148_ * i_119_;
                            i_119_ = 0;
                        }
                        i_120_ <<= 16;
                        if (i < 0) {
                            i_120_ -= i_143_ * i;
                            i = 0;
                        }
                        int i_162_ = i_119_ - anInt1160;
                        i_149_ += i_151_ * i_162_;
                        i_152_ += i_154_ * i_162_;
                        i_155_ += i_157_ * i_162_;
                        if (i_144_ < i_145_) {
                            i_118_ -= i;
                            i -= i_119_;
                            i_119_ = anIntArray1156[i_119_];
                            while (--i >= 0) {
                                method608(Class79.anIntArray1402, is, 0, 0,
                                        i_119_, i_121_ >> 16, i_122_ >> 16,
                                        i_125_, i_147_, i_149_, i_152_,
                                        i_155_, i_150_, i_153_, i_156_);
                                i_121_ += i_144_;
                                i_122_ += i_145_;
                                i_125_ += i_148_;
                                i_119_ += Class79.anInt1401;
                                i_149_ += i_151_;
                                i_152_ += i_154_;
                                i_155_ += i_157_;
                            }
                            while (--i_118_ >= 0) {
                                method608(Class79.anIntArray1402, is, 0, 0,
                                        i_119_, i_121_ >> 16, i_120_ >> 16,
                                        i_125_, i_147_, i_149_, i_152_,
                                        i_155_, i_150_, i_153_, i_156_);
                                i_121_ += i_144_;
                                i_120_ += i_143_;
                                i_125_ += i_148_;
                                i_119_ += Class79.anInt1401;
                                i_149_ += i_151_;
                                i_152_ += i_154_;
                                i_155_ += i_157_;
                            }
                        } else {
                            i_118_ -= i;
                            i -= i_119_;
                            i_119_ = anIntArray1156[i_119_];
                            while (--i >= 0) {
                                method608(Class79.anIntArray1402, is, 0, 0,
                                        i_119_, i_122_ >> 16, i_121_ >> 16,
                                        i_125_, i_147_, i_149_, i_152_,
                                        i_155_, i_150_, i_153_, i_156_);
                                i_121_ += i_144_;
                                i_122_ += i_145_;
                                i_125_ += i_148_;
                                i_119_ += Class79.anInt1401;
                                i_149_ += i_151_;
                                i_152_ += i_154_;
                                i_155_ += i_157_;
                            }
                            while (--i_118_ >= 0) {
                                method608(Class79.anIntArray1402, is, 0, 0,
                                        i_119_, i_120_ >> 16, i_121_ >> 16,
                                        i_125_, i_147_, i_149_, i_152_,
                                        i_155_, i_150_, i_153_, i_156_);
                                i_121_ += i_144_;
                                i_120_ += i_143_;
                                i_125_ += i_148_;
                                i_119_ += Class79.anInt1401;
                                i_149_ += i_151_;
                                i_152_ += i_154_;
                                i_155_ += i_157_;
                            }
                        }
                    } else {
                        i_120_ = i_122_ <<= 16;
                        if (i_119_ < 0) {
                            i_120_ -= i_144_ * i_119_;
                            i_122_ -= i_145_ * i_119_;
                            i_125_ -= i_148_ * i_119_;
                            i_119_ = 0;
                        }
                        i_121_ <<= 16;
                        if (i_118_ < 0) {
                            i_121_ -= i_143_ * i_118_;
                            i_118_ = 0;
                        }
                        int i_163_ = i_119_ - anInt1160;
                        i_149_ += i_151_ * i_163_;
                        i_152_ += i_154_ * i_163_;
                        i_155_ += i_157_ * i_163_;
                        if (i_144_ < i_145_) {
                            i -= i_118_;
                            i_118_ -= i_119_;
                            i_119_ = anIntArray1156[i_119_];
                            while (--i_118_ >= 0) {
                                method608(Class79.anIntArray1402, is, 0, 0,
                                        i_119_, i_120_ >> 16, i_122_ >> 16,
                                        i_125_, i_147_, i_149_, i_152_,
                                        i_155_, i_150_, i_153_, i_156_);
                                i_120_ += i_144_;
                                i_122_ += i_145_;
                                i_125_ += i_148_;
                                i_119_ += Class79.anInt1401;
                                i_149_ += i_151_;
                                i_152_ += i_154_;
                                i_155_ += i_157_;
                            }
                            while (--i >= 0) {
                                method608(Class79.anIntArray1402, is, 0, 0,
                                        i_119_, i_121_ >> 16, i_122_ >> 16,
                                        i_125_, i_147_, i_149_, i_152_,
                                        i_155_, i_150_, i_153_, i_156_);
                                i_121_ += i_143_;
                                i_122_ += i_145_;
                                i_125_ += i_148_;
                                i_119_ += Class79.anInt1401;
                                i_149_ += i_151_;
                                i_152_ += i_154_;
                                i_155_ += i_157_;
                            }
                        } else {
                            i -= i_118_;
                            i_118_ -= i_119_;
                            i_119_ = anIntArray1156[i_119_];
                            while (--i_118_ >= 0) {
                                method608(Class79.anIntArray1402, is, 0, 0,
                                        i_119_, i_122_ >> 16, i_120_ >> 16,
                                        i_125_, i_147_, i_149_, i_152_,
                                        i_155_, i_150_, i_153_, i_156_);
                                i_120_ += i_144_;
                                i_122_ += i_145_;
                                i_125_ += i_148_;
                                i_119_ += Class79.anInt1401;
                                i_149_ += i_151_;
                                i_152_ += i_154_;
                                i_155_ += i_157_;
                            }
                            while (--i >= 0) {
                                method608(Class79.anIntArray1402, is, 0, 0,
                                        i_119_, i_122_ >> 16, i_121_ >> 16,
                                        i_125_, i_147_, i_149_, i_152_,
                                        i_155_, i_150_, i_153_, i_156_);
                                i_121_ += i_143_;
                                i_122_ += i_145_;
                                i_125_ += i_148_;
                                i_119_ += Class79.anInt1401;
                                i_149_ += i_151_;
                                i_152_ += i_154_;
                                i_155_ += i_157_;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method617(int i, int i_164_, int i_165_, int i_166_,
                                 int i_167_, int i_168_, int i_169_,
                                 int i_170_, int i_171_) {
        int i_172_ = i_167_ - i_166_;
        int i_173_ = i_164_ - i;
        int i_174_ = i_168_ - i_166_;
        int i_175_ = i_165_ - i;
        int i_176_ = i_170_ - i_169_;
        int i_177_ = i_171_ - i_169_;
        int i_178_;
        if (i_165_ != i_164_)
            i_178_ = (i_168_ - i_167_ << 16) / (i_165_ - i_164_);
        else
            i_178_ = 0;
        int i_179_;
        if (i_164_ != i)
            i_179_ = (i_172_ << 16) / i_173_;
        else
            i_179_ = 0;
        int i_180_;
        if (i_165_ != i)
            i_180_ = (i_174_ << 16) / i_175_;
        else
            i_180_ = 0;
        int i_181_ = i_172_ * i_175_ - i_174_ * i_173_;
        if (i_181_ != 0) {
            int i_182_ = (i_176_ * i_175_ - i_177_ * i_173_ << 8) / i_181_;
            int i_183_ = (i_177_ * i_172_ - i_176_ * i_174_ << 8) / i_181_;
            if (i <= i_164_ && i <= i_165_) {
                if (i < anInt1162) {
                    if (i_164_ > anInt1162)
                        i_164_ = anInt1162;
                    if (i_165_ > anInt1162)
                        i_165_ = anInt1162;
                    i_169_ = (i_169_ << 8) - i_182_ * i_166_ + i_182_;
                    if (i_164_ < i_165_) {
                        i_168_ = i_166_ <<= 16;
                        if (i < 0) {
                            i_168_ -= i_180_ * i;
                            i_166_ -= i_179_ * i;
                            i_169_ -= i_183_ * i;
                            i = 0;
                        }
                        i_167_ <<= 16;
                        if (i_164_ < 0) {
                            i_167_ -= i_178_ * i_164_;
                            i_164_ = 0;
                        }
                        if (i != i_164_ && i_180_ < i_179_
                                || i == i_164_ && i_180_ > i_178_) {
                            i_165_ -= i_164_;
                            i_164_ -= i;
                            i = anIntArray1156[i];
                            while (--i_164_ >= 0) {
                                method605(Class79.anIntArray1402, i, 0, 0,
                                        i_168_ >> 16, i_166_ >> 16, i_169_,
                                        i_182_);
                                i_168_ += i_180_;
                                i_166_ += i_179_;
                                i_169_ += i_183_;
                                i += Class79.anInt1401;
                            }
                            while (--i_165_ >= 0) {
                                method605(Class79.anIntArray1402, i, 0, 0,
                                        i_168_ >> 16, i_167_ >> 16, i_169_,
                                        i_182_);
                                i_168_ += i_180_;
                                i_167_ += i_178_;
                                i_169_ += i_183_;
                                i += Class79.anInt1401;
                            }
                        } else {
                            i_165_ -= i_164_;
                            i_164_ -= i;
                            i = anIntArray1156[i];
                            while (--i_164_ >= 0) {
                                method605(Class79.anIntArray1402, i, 0, 0,
                                        i_166_ >> 16, i_168_ >> 16, i_169_,
                                        i_182_);
                                i_168_ += i_180_;
                                i_166_ += i_179_;
                                i_169_ += i_183_;
                                i += Class79.anInt1401;
                            }
                            while (--i_165_ >= 0) {
                                method605(Class79.anIntArray1402, i, 0, 0,
                                        i_167_ >> 16, i_168_ >> 16, i_169_,
                                        i_182_);
                                i_168_ += i_180_;
                                i_167_ += i_178_;
                                i_169_ += i_183_;
                                i += Class79.anInt1401;
                            }
                        }
                    } else {
                        i_167_ = i_166_ <<= 16;
                        if (i < 0) {
                            i_167_ -= i_180_ * i;
                            i_166_ -= i_179_ * i;
                            i_169_ -= i_183_ * i;
                            i = 0;
                        }
                        i_168_ <<= 16;
                        if (i_165_ < 0) {
                            i_168_ -= i_178_ * i_165_;
                            i_165_ = 0;
                        }
                        if (i != i_165_ && i_180_ < i_179_
                                || i == i_165_ && i_178_ > i_179_) {
                            i_164_ -= i_165_;
                            i_165_ -= i;
                            i = anIntArray1156[i];
                            while (--i_165_ >= 0) {
                                method605(Class79.anIntArray1402, i, 0, 0,
                                        i_167_ >> 16, i_166_ >> 16, i_169_,
                                        i_182_);
                                i_167_ += i_180_;
                                i_166_ += i_179_;
                                i_169_ += i_183_;
                                i += Class79.anInt1401;
                            }
                            while (--i_164_ >= 0) {
                                method605(Class79.anIntArray1402, i, 0, 0,
                                        i_168_ >> 16, i_166_ >> 16, i_169_,
                                        i_182_);
                                i_168_ += i_178_;
                                i_166_ += i_179_;
                                i_169_ += i_183_;
                                i += Class79.anInt1401;
                            }
                        } else {
                            i_164_ -= i_165_;
                            i_165_ -= i;
                            i = anIntArray1156[i];
                            while (--i_165_ >= 0) {
                                method605(Class79.anIntArray1402, i, 0, 0,
                                        i_166_ >> 16, i_167_ >> 16, i_169_,
                                        i_182_);
                                i_167_ += i_180_;
                                i_166_ += i_179_;
                                i_169_ += i_183_;
                                i += Class79.anInt1401;
                            }
                            while (--i_164_ >= 0) {
                                method605(Class79.anIntArray1402, i, 0, 0,
                                        i_166_ >> 16, i_168_ >> 16, i_169_,
                                        i_182_);
                                i_168_ += i_178_;
                                i_166_ += i_179_;
                                i_169_ += i_183_;
                                i += Class79.anInt1401;
                            }
                        }
                    }
                }
            } else if (i_164_ <= i_165_) {
                if (i_164_ < anInt1162) {
                    if (i_165_ > anInt1162)
                        i_165_ = anInt1162;
                    if (i > anInt1162)
                        i = anInt1162;
                    i_170_ = (i_170_ << 8) - i_182_ * i_167_ + i_182_;
                    if (i_165_ < i) {
                        i_166_ = i_167_ <<= 16;
                        if (i_164_ < 0) {
                            i_166_ -= i_179_ * i_164_;
                            i_167_ -= i_178_ * i_164_;
                            i_170_ -= i_183_ * i_164_;
                            i_164_ = 0;
                        }
                        i_168_ <<= 16;
                        if (i_165_ < 0) {
                            i_168_ -= i_180_ * i_165_;
                            i_165_ = 0;
                        }
                        if (i_164_ != i_165_ && i_179_ < i_178_
                                || i_164_ == i_165_ && i_179_ > i_180_) {
                            i -= i_165_;
                            i_165_ -= i_164_;
                            i_164_ = anIntArray1156[i_164_];
                            while (--i_165_ >= 0) {
                                method605(Class79.anIntArray1402, i_164_, 0, 0,
                                        i_166_ >> 16, i_167_ >> 16, i_170_,
                                        i_182_);
                                i_166_ += i_179_;
                                i_167_ += i_178_;
                                i_170_ += i_183_;
                                i_164_ += Class79.anInt1401;
                            }
                            while (--i >= 0) {
                                method605(Class79.anIntArray1402, i_164_, 0, 0,
                                        i_166_ >> 16, i_168_ >> 16, i_170_,
                                        i_182_);
                                i_166_ += i_179_;
                                i_168_ += i_180_;
                                i_170_ += i_183_;
                                i_164_ += Class79.anInt1401;
                            }
                        } else {
                            i -= i_165_;
                            i_165_ -= i_164_;
                            i_164_ = anIntArray1156[i_164_];
                            while (--i_165_ >= 0) {
                                method605(Class79.anIntArray1402, i_164_, 0, 0,
                                        i_167_ >> 16, i_166_ >> 16, i_170_,
                                        i_182_);
                                i_166_ += i_179_;
                                i_167_ += i_178_;
                                i_170_ += i_183_;
                                i_164_ += Class79.anInt1401;
                            }
                            while (--i >= 0) {
                                method605(Class79.anIntArray1402, i_164_, 0, 0,
                                        i_168_ >> 16, i_166_ >> 16, i_170_,
                                        i_182_);
                                i_166_ += i_179_;
                                i_168_ += i_180_;
                                i_170_ += i_183_;
                                i_164_ += Class79.anInt1401;
                            }
                        }
                    } else {
                        i_168_ = i_167_ <<= 16;
                        if (i_164_ < 0) {
                            i_168_ -= i_179_ * i_164_;
                            i_167_ -= i_178_ * i_164_;
                            i_170_ -= i_183_ * i_164_;
                            i_164_ = 0;
                        }
                        i_166_ <<= 16;
                        if (i < 0) {
                            i_166_ -= i_180_ * i;
                            i = 0;
                        }
                        if (i_179_ < i_178_) {
                            i_165_ -= i;
                            i -= i_164_;
                            i_164_ = anIntArray1156[i_164_];
                            while (--i >= 0) {
                                method605(Class79.anIntArray1402, i_164_, 0, 0,
                                        i_168_ >> 16, i_167_ >> 16, i_170_,
                                        i_182_);
                                i_168_ += i_179_;
                                i_167_ += i_178_;
                                i_170_ += i_183_;
                                i_164_ += Class79.anInt1401;
                            }
                            while (--i_165_ >= 0) {
                                method605(Class79.anIntArray1402, i_164_, 0, 0,
                                        i_166_ >> 16, i_167_ >> 16, i_170_,
                                        i_182_);
                                i_166_ += i_180_;
                                i_167_ += i_178_;
                                i_170_ += i_183_;
                                i_164_ += Class79.anInt1401;
                            }
                        } else {
                            i_165_ -= i;
                            i -= i_164_;
                            i_164_ = anIntArray1156[i_164_];
                            while (--i >= 0) {
                                method605(Class79.anIntArray1402, i_164_, 0, 0,
                                        i_167_ >> 16, i_168_ >> 16, i_170_,
                                        i_182_);
                                i_168_ += i_179_;
                                i_167_ += i_178_;
                                i_170_ += i_183_;
                                i_164_ += Class79.anInt1401;
                            }
                            while (--i_165_ >= 0) {
                                method605(Class79.anIntArray1402, i_164_, 0, 0,
                                        i_167_ >> 16, i_166_ >> 16, i_170_,
                                        i_182_);
                                i_166_ += i_180_;
                                i_167_ += i_178_;
                                i_170_ += i_183_;
                                i_164_ += Class79.anInt1401;
                            }
                        }
                    }
                }
            } else if (i_165_ < anInt1162) {
                if (i > anInt1162)
                    i = anInt1162;
                if (i_164_ > anInt1162)
                    i_164_ = anInt1162;
                i_171_ = (i_171_ << 8) - i_182_ * i_168_ + i_182_;
                if (i < i_164_) {
                    i_167_ = i_168_ <<= 16;
                    if (i_165_ < 0) {
                        i_167_ -= i_178_ * i_165_;
                        i_168_ -= i_180_ * i_165_;
                        i_171_ -= i_183_ * i_165_;
                        i_165_ = 0;
                    }
                    i_166_ <<= 16;
                    if (i < 0) {
                        i_166_ -= i_179_ * i;
                        i = 0;
                    }
                    if (i_178_ < i_180_) {
                        i_164_ -= i;
                        i -= i_165_;
                        i_165_ = anIntArray1156[i_165_];
                        while (--i >= 0) {
                            method605(Class79.anIntArray1402, i_165_, 0, 0,
                                    i_167_ >> 16, i_168_ >> 16, i_171_,
                                    i_182_);
                            i_167_ += i_178_;
                            i_168_ += i_180_;
                            i_171_ += i_183_;
                            i_165_ += Class79.anInt1401;
                        }
                        while (--i_164_ >= 0) {
                            method605(Class79.anIntArray1402, i_165_, 0, 0,
                                    i_167_ >> 16, i_166_ >> 16, i_171_,
                                    i_182_);
                            i_167_ += i_178_;
                            i_166_ += i_179_;
                            i_171_ += i_183_;
                            i_165_ += Class79.anInt1401;
                        }
                    } else {
                        i_164_ -= i;
                        i -= i_165_;
                        i_165_ = anIntArray1156[i_165_];
                        while (--i >= 0) {
                            method605(Class79.anIntArray1402, i_165_, 0, 0,
                                    i_168_ >> 16, i_167_ >> 16, i_171_,
                                    i_182_);
                            i_167_ += i_178_;
                            i_168_ += i_180_;
                            i_171_ += i_183_;
                            i_165_ += Class79.anInt1401;
                        }
                        while (--i_164_ >= 0) {
                            method605(Class79.anIntArray1402, i_165_, 0, 0,
                                    i_166_ >> 16, i_167_ >> 16, i_171_,
                                    i_182_);
                            i_167_ += i_178_;
                            i_166_ += i_179_;
                            i_171_ += i_183_;
                            i_165_ += Class79.anInt1401;
                        }
                    }
                } else {
                    i_166_ = i_168_ <<= 16;
                    if (i_165_ < 0) {
                        i_166_ -= i_178_ * i_165_;
                        i_168_ -= i_180_ * i_165_;
                        i_171_ -= i_183_ * i_165_;
                        i_165_ = 0;
                    }
                    i_167_ <<= 16;
                    if (i_164_ < 0) {
                        i_167_ -= i_179_ * i_164_;
                        i_164_ = 0;
                    }
                    if (i_178_ < i_180_) {
                        i -= i_164_;
                        i_164_ -= i_165_;
                        i_165_ = anIntArray1156[i_165_];
                        while (--i_164_ >= 0) {
                            method605(Class79.anIntArray1402, i_165_, 0, 0,
                                    i_166_ >> 16, i_168_ >> 16, i_171_,
                                    i_182_);
                            i_166_ += i_178_;
                            i_168_ += i_180_;
                            i_171_ += i_183_;
                            i_165_ += Class79.anInt1401;
                        }
                        while (--i >= 0) {
                            method605(Class79.anIntArray1402, i_165_, 0, 0,
                                    i_167_ >> 16, i_168_ >> 16, i_171_,
                                    i_182_);
                            i_167_ += i_179_;
                            i_168_ += i_180_;
                            i_171_ += i_183_;
                            i_165_ += Class79.anInt1401;
                        }
                    } else {
                        i -= i_164_;
                        i_164_ -= i_165_;
                        i_165_ = anIntArray1156[i_165_];
                        while (--i_164_ >= 0) {
                            method605(Class79.anIntArray1402, i_165_, 0, 0,
                                    i_168_ >> 16, i_166_ >> 16, i_171_,
                                    i_182_);
                            i_166_ += i_178_;
                            i_168_ += i_180_;
                            i_171_ += i_183_;
                            i_165_ += Class79.anInt1401;
                        }
                        while (--i >= 0) {
                            method605(Class79.anIntArray1402, i_165_, 0, 0,
                                    i_168_ >> 16, i_167_ >> 16, i_171_,
                                    i_182_);
                            i_167_ += i_179_;
                            i_168_ += i_180_;
                            i_171_ += i_183_;
                            i_165_ += Class79.anInt1401;
                        }
                    }
                }
            }
        }
    }

    public static void method618(int i, int i_184_) {
        int i_185_ = i * 128;
        for (int i_186_ = i; i_186_ < i_184_; i_186_++) {
            double d = (double) (i_186_ >> 3) / 64.0 + 0.0078125;
            double d_187_ = (double) (i_186_ & 0x7) / 8.0 + 0.0625;
            for (int i_188_ = 0; i_188_ < 128; i_188_++) {
                double d_189_ = (double) i_188_ / 128.0;
                double d_190_ = d_189_;
                double d_191_ = d_189_;
                double d_192_ = d_189_;
                if (d_187_ != 0.0) {
                    double d_193_;
                    if (d_189_ < 0.5)
                        d_193_ = d_189_ * (1.0 + d_187_);
                    else
                        d_193_ = d_189_ + d_187_ - d_189_ * d_187_;
                    double d_194_ = 2.0 * d_189_ - d_193_;
                    double d_195_ = d + 0.3333333333333333;
                    if (d_195_ > 1.0)
                        d_195_--;
                    double d_196_ = d;
                    double d_197_ = d - 0.3333333333333333;
                    if (d_197_ < 0.0)
                        d_197_++;
                    if (6.0 * d_195_ < 1.0)
                        d_190_ = d_194_ + (d_193_ - d_194_) * 6.0 * d_195_;
                    else if (2.0 * d_195_ < 1.0)
                        d_190_ = d_193_;
                    else if (3.0 * d_195_ < 2.0)
                        d_190_
                                = d_194_ + ((d_193_ - d_194_)
                                * (0.6666666666666666 - d_195_) * 6.0);
                    else
                        d_190_ = d_194_;
                    if (6.0 * d_196_ < 1.0)
                        d_191_ = d_194_ + (d_193_ - d_194_) * 6.0 * d_196_;
                    else if (2.0 * d_196_ < 1.0)
                        d_191_ = d_193_;
                    else if (3.0 * d_196_ < 2.0)
                        d_191_
                                = d_194_ + ((d_193_ - d_194_)
                                * (0.6666666666666666 - d_196_) * 6.0);
                    else
                        d_191_ = d_194_;
                    if (6.0 * d_197_ < 1.0)
                        d_192_ = d_194_ + (d_193_ - d_194_) * 6.0 * d_197_;
                    else if (2.0 * d_197_ < 1.0)
                        d_192_ = d_193_;
                    else if (3.0 * d_197_ < 2.0)
                        d_192_
                                = d_194_ + ((d_193_ - d_194_)
                                * (0.6666666666666666 - d_197_) * 6.0);
                    else
                        d_192_ = d_194_;
                }
                d_190_ = Math.pow(d_190_, (double) aFloat1151);
                d_191_ = Math.pow(d_191_, (double) aFloat1151);
                d_192_ = Math.pow(d_192_, (double) aFloat1151);
                int i_198_ = (int) (d_190_ * 256.0);
                int i_199_ = (int) (d_191_ * 256.0);
                int i_200_ = (int) (d_192_ * 256.0);
                int i_201_ = (i_198_ << 16) + (i_199_ << 8) + i_200_;
                if (i_201_ == 0)
                    i_201_ = 1;
                anIntArray1158[i_185_++] = i_201_;
            }
        }
    }

    public static void method619
            (int[] is, int[] is_202_, int i, int i_203_, int i_204_, int i_205_,
             int i_206_, int i_207_, int i_208_, int i_209_, int i_210_,
             int i_211_, int i_212_, int i_213_, int i_214_) {
        if (aBoolean1157) {
            if (i_206_ > anInt1168)
                i_206_ = anInt1168;
            if (i_205_ < 0)
                i_205_ = 0;
        }
        if (i_205_ < i_206_) {
            i_204_ += i_205_;
            i_207_ += i_208_ * i_205_;
            int i_215_ = i_206_ - i_205_;
            do {
                if (aBoolean1166) {
                    int i_216_ = i_205_ - anInt1164;
                    i_209_ += i_212_ * i_216_;
                    i_210_ += i_213_ * i_216_;
                    i_211_ += i_214_ * i_216_;
                    int i_217_ = i_211_ >> 12;
                    int i_218_;
                    int i_219_;
                    if (i_217_ != 0) {
                        i_218_ = i_209_ / i_217_;
                        i_219_ = i_210_ / i_217_;
                    } else {
                        i_218_ = 0;
                        i_219_ = 0;
                    }
                    i_209_ += i_212_ * i_215_;
                    i_210_ += i_213_ * i_215_;
                    i_211_ += i_214_ * i_215_;
                    i_217_ = i_211_ >> 12;
                    int i_220_;
                    int i_221_;
                    if (i_217_ != 0) {
                        i_220_ = i_209_ / i_217_;
                        i_221_ = i_210_ / i_217_;
                    } else {
                        i_220_ = 0;
                        i_221_ = 0;
                    }
                    i = (i_218_ << 20) + i_219_;
                    int i_222_ = (((i_220_ - i_218_) / i_215_ << 20)
                            + (i_221_ - i_219_) / i_215_);
                    i_215_ >>= 3;
                    i_208_ <<= 3;
                    int i_223_ = i_207_ >> 8;
                    if (aBoolean1161) {
                        if (i_215_ > 0) {
                            do {
                                i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
                                is[i_204_++] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                                i += i_222_;
                                i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
                                is[i_204_++] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                                i += i_222_;
                                i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
                                is[i_204_++] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                                i += i_222_;
                                i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
                                is[i_204_++] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                                i += i_222_;
                                i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
                                is[i_204_++] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                                i += i_222_;
                                i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
                                is[i_204_++] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                                i += i_222_;
                                i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
                                is[i_204_++] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                                i += i_222_;
                                i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
                                is[i_204_++] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                                i += i_222_;
                                i_207_ += i_208_;
                                i_223_ = i_207_ >> 8;
                            } while (--i_215_ > 0);
                        }
                        i_215_ = i_206_ - i_205_ & 0x7;
                        if (i_215_ > 0) {
                            do {
                                i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
                                is[i_204_++] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                                i += i_222_;
                            } while (--i_215_ > 0);
                        }
                    } else {
                        if (i_215_ > 0) {
                            do {
                                if ((i_203_
                                        = is_202_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_204_] = (((i_203_ & 0xff00ff) * i_223_
                                            & ~0xff00ff)
                                            + ((i_203_ & 0xff00) * i_223_
                                            & 0xff0000)) >> 8;
                                i_204_++;
                                i += i_222_;
                                if ((i_203_
                                        = is_202_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_204_] = (((i_203_ & 0xff00ff) * i_223_
                                            & ~0xff00ff)
                                            + ((i_203_ & 0xff00) * i_223_
                                            & 0xff0000)) >> 8;
                                i_204_++;
                                i += i_222_;
                                if ((i_203_
                                        = is_202_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_204_] = (((i_203_ & 0xff00ff) * i_223_
                                            & ~0xff00ff)
                                            + ((i_203_ & 0xff00) * i_223_
                                            & 0xff0000)) >> 8;
                                i_204_++;
                                i += i_222_;
                                if ((i_203_
                                        = is_202_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_204_] = (((i_203_ & 0xff00ff) * i_223_
                                            & ~0xff00ff)
                                            + ((i_203_ & 0xff00) * i_223_
                                            & 0xff0000)) >> 8;
                                i_204_++;
                                i += i_222_;
                                if ((i_203_
                                        = is_202_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_204_] = (((i_203_ & 0xff00ff) * i_223_
                                            & ~0xff00ff)
                                            + ((i_203_ & 0xff00) * i_223_
                                            & 0xff0000)) >> 8;
                                i_204_++;
                                i += i_222_;
                                if ((i_203_
                                        = is_202_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_204_] = (((i_203_ & 0xff00ff) * i_223_
                                            & ~0xff00ff)
                                            + ((i_203_ & 0xff00) * i_223_
                                            & 0xff0000)) >> 8;
                                i_204_++;
                                i += i_222_;
                                if ((i_203_
                                        = is_202_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_204_] = (((i_203_ & 0xff00ff) * i_223_
                                            & ~0xff00ff)
                                            + ((i_203_ & 0xff00) * i_223_
                                            & 0xff0000)) >> 8;
                                i_204_++;
                                i += i_222_;
                                if ((i_203_
                                        = is_202_[(i & 0xfc0) + (i >>> 26)])
                                        != 0)
                                    is[i_204_] = (((i_203_ & 0xff00ff) * i_223_
                                            & ~0xff00ff)
                                            + ((i_203_ & 0xff00) * i_223_
                                            & 0xff0000)) >> 8;
                                i_204_++;
                                i += i_222_;
                                i_207_ += i_208_;
                                i_223_ = i_207_ >> 8;
                            } while (--i_215_ > 0);
                        }
                        i_215_ = i_206_ - i_205_ & 0x7;
                        if (i_215_ <= 0)
                            break;
                        do {
                            if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_223_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_223_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_222_;
                        } while (--i_215_ > 0);
                    }
                    break;
                }
                int i_224_ = i_205_ - anInt1164;
                i_209_ += i_212_ * i_224_;
                i_210_ += i_213_ * i_224_;
                i_211_ += i_214_ * i_224_;
                int i_225_ = i_211_ >> 14;
                int i_226_;
                int i_227_;
                if (i_225_ != 0) {
                    i_226_ = i_209_ / i_225_;
                    i_227_ = i_210_ / i_225_;
                } else {
                    i_226_ = 0;
                    i_227_ = 0;
                }
                i_209_ += i_212_ * i_215_;
                i_210_ += i_213_ * i_215_;
                i_211_ += i_214_ * i_215_;
                i_225_ = i_211_ >> 14;
                int i_228_;
                int i_229_;
                if (i_225_ != 0) {
                    i_228_ = i_209_ / i_225_;
                    i_229_ = i_210_ / i_225_;
                } else {
                    i_228_ = 0;
                    i_229_ = 0;
                }
                i = (i_226_ << 18) + i_227_;
                int i_230_ = (((i_228_ - i_226_) / i_215_ << 18)
                        + (i_229_ - i_227_) / i_215_);
                i_215_ >>= 3;
                i_208_ <<= 3;
                int i_231_ = i_207_ >> 8;
                if (aBoolean1161) {
                    if (i_215_ > 0) {
                        do {
                            i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
                            is[i_204_++]
                                    = ((((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff)
                                    + ((i_203_ & 0xff00) * i_231_ & 0xff0000))
                                    >> 8);
                            i += i_230_;
                            i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
                            is[i_204_++]
                                    = ((((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff)
                                    + ((i_203_ & 0xff00) * i_231_ & 0xff0000))
                                    >> 8);
                            i += i_230_;
                            i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
                            is[i_204_++]
                                    = ((((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff)
                                    + ((i_203_ & 0xff00) * i_231_ & 0xff0000))
                                    >> 8);
                            i += i_230_;
                            i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
                            is[i_204_++]
                                    = ((((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff)
                                    + ((i_203_ & 0xff00) * i_231_ & 0xff0000))
                                    >> 8);
                            i += i_230_;
                            i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
                            is[i_204_++]
                                    = ((((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff)
                                    + ((i_203_ & 0xff00) * i_231_ & 0xff0000))
                                    >> 8);
                            i += i_230_;
                            i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
                            is[i_204_++]
                                    = ((((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff)
                                    + ((i_203_ & 0xff00) * i_231_ & 0xff0000))
                                    >> 8);
                            i += i_230_;
                            i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
                            is[i_204_++]
                                    = ((((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff)
                                    + ((i_203_ & 0xff00) * i_231_ & 0xff0000))
                                    >> 8);
                            i += i_230_;
                            i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
                            is[i_204_++]
                                    = ((((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff)
                                    + ((i_203_ & 0xff00) * i_231_ & 0xff0000))
                                    >> 8);
                            i += i_230_;
                            i_207_ += i_208_;
                            i_231_ = i_207_ >> 8;
                        } while (--i_215_ > 0);
                    }
                    i_215_ = i_206_ - i_205_ & 0x7;
                    if (i_215_ > 0) {
                        do {
                            i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
                            is[i_204_++]
                                    = ((((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff)
                                    + ((i_203_ & 0xff00) * i_231_ & 0xff0000))
                                    >> 8);
                            i += i_230_;
                        } while (--i_215_ > 0);
                        break;
                    }
                } else {
                    if (i_215_ > 0) {
                        do {
                            if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_231_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_231_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_230_;
                            if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_231_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_231_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_230_;
                            if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_231_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_231_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_230_;
                            if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_231_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_231_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_230_;
                            if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_231_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_231_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_230_;
                            if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_231_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_231_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_230_;
                            if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_231_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_231_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_230_;
                            if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_231_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_231_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_230_;
                            i_207_ += i_208_;
                            i_231_ = i_207_ >> 8;
                        } while (--i_215_ > 0);
                    }
                    i_215_ = i_206_ - i_205_ & 0x7;
                    if (i_215_ > 0) {
                        do {
                            if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)])
                                    != 0)
                                is[i_204_] = (((i_203_ & 0xff00ff) * i_231_
                                        & ~0xff00ff)
                                        + ((i_203_ & 0xff00) * i_231_
                                        & 0xff0000)) >> 8;
                            i_204_++;
                            i += i_230_;
                        } while (--i_215_ > 0);
                    }
                }
            } while (false);
        }
    }

    public static void method620() {
        anInt1164 = anInt1168 / 2;
        anInt1160 = anInt1162 / 2;
        Class80.anInt1427 = -anInt1164;
        PacketParser.anInt1875 = anInt1168 - anInt1164;
        Animable.anInt63 = -anInt1160;
        Class68_Sub13_Sub38.anInt4079 = anInt1162 - anInt1160;
    }

    static {
        anInt1153 = 0;
        anIntArray1155 = new int[2048];
        aBoolean1157 = false;
        aBoolean1161 = false;
        anIntArray1156 = new int[1024];
        aBoolean1152 = false;
        aBoolean1166 = false;
        anIntArray1158 = new int[65536];
        anIntArray1165 = new int[512];
        aFloat1151 = 1.0F;
        anIntArray1167 = new int[2048];
        aBoolean1163 = true;
        for (int i = 1; i < 512; i++)
            anIntArray1165[i] = 32768 / i;
        for (int i = 1; i < 2048; i++)
            anIntArray1154[i] = 65536 / i;
        for (int i = 0; i < 2048; i++) {
            anIntArray1155[i]
                    = (int) (65536.0 * Math.sin((double) i * 0.0030679615));
            anIntArray1167[i]
                    = (int) (65536.0 * Math.cos((double) i * 0.0030679615));
        }
    }
}
