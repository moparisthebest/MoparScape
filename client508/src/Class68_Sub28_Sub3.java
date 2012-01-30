/* Class68_Sub28_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub28_Sub3 extends Class68_Sub28 {
    public int anInt4557;
    public int anInt4558;
    public int anInt4559;
    public int anInt4560;
    public int anInt4561;
    public int anInt4562;
    public int anInt4563;
    public int anInt4564;
    public int anInt4565;
    public int anInt4566;
    public int anInt4567;
    public int anInt4568;
    public int anInt4569;
    public boolean aBoolean4570;
    public int anInt4571;

    public synchronized void method1272(int i) {
        anInt4563 = i;
    }

    public static int method1273
            (int i, byte[] is, int[] is_0_, int i_1_, int i_2_, int i_3_, int i_4_,
             int i_5_, int i_6_, int i_7_, Class68_Sub28_Sub3 class68_sub28_sub3) {
        i_1_ >>= 8;
        i_7_ >>= 8;
        i_3_ <<= 2;
        i_4_ <<= 2;
        if ((i_5_ = i_2_ + i_1_ - (i_7_ - 1)) > i_6_)
            i_5_ = i_6_;
        i_2_ <<= 1;
        i_5_ <<= 1;
        i_5_ -= 6;
        while (i_2_ < i_5_) {
            i = is[i_1_--];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
            i = is[i_1_--];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
            i = is[i_1_--];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
            i = is[i_1_--];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
        }
        i_5_ += 6;
        while (i_2_ < i_5_) {
            i = is[i_1_--];
            is_0_[i_2_++] += i * i_3_;
            is_0_[i_2_++] += i * i_4_;
        }
        class68_sub28_sub3.anInt4567 = i_1_ << 8;
        return i_2_ >> 1;
    }

    public static int method1274(int i, byte[] is, int[] is_8_, int i_9_,
                                 int i_10_, int i_11_, int i_12_, int i_13_,
                                 int i_14_, int i_15_, int i_16_, int i_17_,
                                 Class68_Sub28_Sub3 class68_sub28_sub3) {
        i_9_ >>= 8;
        i_17_ >>= 8;
        i_11_ <<= 2;
        i_12_ <<= 2;
        i_13_ <<= 2;
        i_14_ <<= 2;
        if ((i_15_ = i_10_ + i_9_ - (i_17_ - 1)) > i_16_)
            i_15_ = i_16_;
        class68_sub28_sub3.anInt4566
                += class68_sub28_sub3.anInt4565 * (i_15_ - i_10_);
        i_10_ <<= 1;
        i_15_ <<= 1;
        i_15_ -= 6;
        while (i_10_ < i_15_) {
            i = is[i_9_--];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
            i = is[i_9_--];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
            i = is[i_9_--];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
            i = is[i_9_--];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
        }
        i_15_ += 6;
        while (i_10_ < i_15_) {
            i = is[i_9_--];
            is_8_[i_10_++] += i * i_11_;
            i_11_ += i_13_;
            is_8_[i_10_++] += i * i_12_;
            i_12_ += i_14_;
        }
        class68_sub28_sub3.anInt4564 = i_11_ >> 2;
        class68_sub28_sub3.anInt4571 = i_12_ >> 2;
        class68_sub28_sub3.anInt4567 = i_9_ << 8;
        return i_10_ >> 1;
    }

    public static int method1275
            (int i, int i_18_, byte[] is, int[] is_19_, int i_20_, int i_21_,
             int i_22_, int i_23_, int i_24_, int i_25_,
             Class68_Sub28_Sub3 class68_sub28_sub3, int i_26_, int i_27_) {
        if (i_26_ == 0
                || (i_23_ = i_21_ + (i_25_ + 256 - i_20_ + i_26_) / i_26_) > i_24_)
            i_23_ = i_24_;
        while (i_21_ < i_23_) {
            i_18_ = i_20_ >> 8;
            i = is[i_18_ - 1];
            is_19_[i_21_++]
                    += ((i << 8) + (is[i_18_] - i) * (i_20_ & 0xff)) * i_22_ >> 6;
            i_20_ += i_26_;
        }
        if (i_26_ == 0
                || (i_23_ = i_21_ + (i_25_ - i_20_ + i_26_) / i_26_) > i_24_)
            i_23_ = i_24_;
        i = i_27_;
        i_18_ = i_26_;
        while (i_21_ < i_23_) {
            is_19_[i_21_++]
                    += (((i << 8) + (is[i_20_ >> 8] - i) * (i_20_ & 0xff)) * i_22_
                    >> 6);
            i_20_ += i_18_;
        }
        class68_sub28_sub3.anInt4567 = i_20_;
        return i_21_;
    }

    public boolean method1276() {
        int i = anInt4560;
        int i_28_;
        int i_29_;
        if (i == -2147483648)
            i = i_28_ = i_29_ = 0;
        else {
            i_28_ = method1307(i, anInt4557);
            i_29_ = method1277(i, anInt4557);
        }
        if (anInt4566 != i || anInt4564 != i_28_ || anInt4571 != i_29_) {
            if (anInt4566 < i) {
                anInt4565 = 1;
                anInt4568 = i - anInt4566;
            } else if (anInt4566 > i) {
                anInt4565 = -1;
                anInt4568 = anInt4566 - i;
            } else
                anInt4565 = 0;
            if (anInt4564 < i_28_) {
                anInt4569 = 1;
                if (anInt4568 == 0 || anInt4568 > i_28_ - anInt4564)
                    anInt4568 = i_28_ - anInt4564;
            } else if (anInt4564 > i_28_) {
                anInt4569 = -1;
                if (anInt4568 == 0 || anInt4568 > anInt4564 - i_28_)
                    anInt4568 = anInt4564 - i_28_;
            } else
                anInt4569 = 0;
            if (anInt4571 < i_29_) {
                anInt4558 = 1;
                if (anInt4568 == 0 || anInt4568 > i_29_ - anInt4571)
                    anInt4568 = i_29_ - anInt4571;
            } else if (anInt4571 > i_29_) {
                anInt4558 = -1;
                if (anInt4568 == 0 || anInt4568 > anInt4571 - i_29_)
                    anInt4568 = anInt4571 - i_29_;
            } else
                anInt4558 = 0;
            return false;
        }
        if (anInt4560 == -2147483648) {
            anInt4560 = 0;
            anInt4566 = anInt4564 = anInt4571 = 0;
            this.method647(-17554);
            return true;
        }
        method1281();
        return false;
    }

    public static int method1277(int i, int i_30_) {
        if (i_30_ < 0)
            return -i;
        return (int) ((double) i * Math.sqrt((double) i_30_ * 1.220703125E-4)
                + 0.5);
    }

    public boolean method1278() {
        if (anInt4568 == 0)
            return false;
        return true;
    }

    public synchronized void method1279(int i) {
        method1297(i << 6, method1284());
    }

    public synchronized void method1280(int i, int i_31_) {
        method1289(i, i_31_, method1284());
    }

    public void method1281() {
        anInt4566 = anInt4560;
        anInt4564 = method1307(anInt4560, anInt4557);
        anInt4571 = method1277(anInt4560, anInt4557);
    }

    public int method1227() {
        int i = anInt4566 * 3 >> 6;
        i = (i ^ i >> 31) + (i >>> 31);
        if (anInt4563 == 0)
            i -= i * anInt4567 / ((((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                    .aByteArray3445).length
                    << 8);
        else if (anInt4563 >= 0)
            i -= i * anInt4561 / (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                    .aByteArray3445).length;
        if (i > 255)
            return 255;
        return i;
    }

    public int method1282(int[] is, int i, int i_32_, int i_33_, int i_34_) {
        while (anInt4568 > 0) {
            int i_35_ = i + anInt4568;
            if (i_35_ > i_33_)
                i_35_ = i_33_;
            anInt4568 += i;
            if (anInt4562 == 256 && (anInt4567 & 0xff) == 0) {
                if (Class7.aBoolean132)
                    i = method1301(0,
                            (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                                    .aByteArray3445),
                            is, anInt4567, i, anInt4564, anInt4571,
                            anInt4569, anInt4558, 0, i_35_, i_32_,
                            this);
                else
                    i = method1302((((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                            .aByteArray3445),
                            is, anInt4567, i, anInt4566, anInt4565, 0,
                            i_35_, i_32_, this);
            } else if (Class7.aBoolean132)
                i = method1300(0, 0,
                        (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                                .aByteArray3445),
                        is, anInt4567, i, anInt4564, anInt4571,
                        anInt4569, anInt4558, 0, i_35_, i_32_, this,
                        anInt4562, i_34_);
            else
                i = method1293(0, 0,
                        (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                                .aByteArray3445),
                        is, anInt4567, i, anInt4566, anInt4565, 0,
                        i_35_, i_32_, this, anInt4562, i_34_);
            anInt4568 -= i;
            if (anInt4568 != 0)
                return i;
            if (method1276())
                return i_33_;
        }
        if (anInt4562 == 256 && (anInt4567 & 0xff) == 0) {
            if (Class7.aBoolean132)
                return method1290(0,
                        (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                                .aByteArray3445),
                        is, anInt4567, i, anInt4564, anInt4571, 0,
                        i_33_, i_32_, this);
            return method1303((((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                    .aByteArray3445),
                    is, anInt4567, i, anInt4566, 0, i_33_, i_32_,
                    this);
        }
        if (Class7.aBoolean132)
            return method1285(0, 0,
                    (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                            .aByteArray3445),
                    is, anInt4567, i, anInt4564, anInt4571, 0, i_33_,
                    i_32_, this, anInt4562, i_34_);
        return method1283(0, 0,
                (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                        .aByteArray3445),
                is, anInt4567, i, anInt4566, 0, i_33_, i_32_, this,
                anInt4562, i_34_);
    }

    public static int method1283
            (int i, int i_36_, byte[] is, int[] is_37_, int i_38_, int i_39_,
             int i_40_, int i_41_, int i_42_, int i_43_,
             Class68_Sub28_Sub3 class68_sub28_sub3, int i_44_, int i_45_) {
        if (i_44_ == 0
                || (i_41_ = i_39_ + (i_43_ - i_38_ + i_44_ - 257) / i_44_) > i_42_)
            i_41_ = i_42_;
        while (i_39_ < i_41_) {
            i_36_ = i_38_ >> 8;
            i = is[i_36_];
            is_37_[i_39_++]
                    += (((i << 8) + (is[i_36_ + 1] - i) * (i_38_ & 0xff)) * i_40_
                    >> 6);
            i_38_ += i_44_;
        }
        if (i_44_ == 0
                || (i_41_ = i_39_ + (i_43_ - i_38_ + i_44_ - 1) / i_44_) > i_42_)
            i_41_ = i_42_;
        i_36_ = i_45_;
        while (i_39_ < i_41_) {
            i = is[i_38_ >> 8];
            is_37_[i_39_++]
                    += ((i << 8) + (i_36_ - i) * (i_38_ & 0xff)) * i_40_ >> 6;
            i_38_ += i_44_;
        }
        class68_sub28_sub3.anInt4567 = i_38_;
        return i_39_;
    }

    public synchronized int method1284() {
        if (anInt4557 < 0)
            return -1;
        return anInt4557;
    }

    public synchronized void method1229(int i) {
        if (anInt4568 > 0) {
            if (i >= anInt4568) {
                if (anInt4560 == -2147483648) {
                    anInt4560 = 0;
                    anInt4566 = anInt4564 = anInt4571 = 0;
                    this.method647(-17554);
                    i = anInt4568;
                }
                anInt4568 = 0;
                method1281();
            } else {
                anInt4566 += anInt4565 * i;
                anInt4564 += anInt4569 * i;
                anInt4571 += anInt4558 * i;
                anInt4568 -= i;
            }
        }
        Class68_Sub11_Sub1 class68_sub11_sub1
                = (Class68_Sub11_Sub1) aClass68_Sub11_3225;
        int i_46_ = anInt4561 << 8;
        int i_47_ = anInt4559 << 8;
        int i_48_ = class68_sub11_sub1.aByteArray3445.length << 8;
        int i_49_ = i_47_ - i_46_;
        if (i_49_ <= 0)
            anInt4563 = 0;
        if (anInt4567 < 0) {
            if (anInt4562 > 0)
                anInt4567 = 0;
            else {
                method1310();
                this.method647(-17554);
                return;
            }
        }
        if (anInt4567 >= i_48_) {
            if (anInt4562 < 0)
                anInt4567 = i_48_ - 1;
            else {
                method1310();
                this.method647(-17554);
                return;
            }
        }
        anInt4567 += anInt4562 * i;
        if (anInt4563 < 0) {
            if (aBoolean4570) {
                if (anInt4562 < 0) {
                    if (anInt4567 >= i_46_)
                        return;
                    anInt4567 = i_46_ + i_46_ - 1 - anInt4567;
                    anInt4562 = -anInt4562;
                }
                while (anInt4567 >= i_47_) {
                    anInt4567 = i_47_ + i_47_ - 1 - anInt4567;
                    anInt4562 = -anInt4562;
                    if (anInt4567 >= i_46_)
                        break;
                    anInt4567 = i_46_ + i_46_ - 1 - anInt4567;
                    anInt4562 = -anInt4562;
                }
            } else if (anInt4562 < 0) {
                if (anInt4567 < i_46_)
                    anInt4567 = i_47_ - 1 - (i_47_ - 1 - anInt4567) % i_49_;
            } else if (anInt4567 >= i_47_)
                anInt4567 = i_46_ + (anInt4567 - i_46_) % i_49_;
        } else {
            do {
                if (anInt4563 > 0) {
                    if (aBoolean4570) {
                        if (anInt4562 < 0) {
                            if (anInt4567 >= i_46_)
                                return;
                            anInt4567 = i_46_ + i_46_ - 1 - anInt4567;
                            anInt4562 = -anInt4562;
                            if (--anInt4563 == 0)
                                break;
                        }
                        do {
                            if (anInt4567 < i_47_)
                                return;
                            anInt4567 = i_47_ + i_47_ - 1 - anInt4567;
                            anInt4562 = -anInt4562;
                            if (--anInt4563 == 0)
                                break;
                            if (anInt4567 >= i_46_)
                                return;
                            anInt4567 = i_46_ + i_46_ - 1 - anInt4567;
                            anInt4562 = -anInt4562;
                        } while (--anInt4563 != 0);
                    } else if (anInt4562 < 0) {
                        if (anInt4567 >= i_46_)
                            return;
                        int i_50_ = (i_47_ - 1 - anInt4567) / i_49_;
                        if (i_50_ >= anInt4563) {
                            anInt4567 += i_49_ * anInt4563;
                            anInt4563 = 0;
                        } else {
                            anInt4567 += i_49_ * i_50_;
                            anInt4563 -= i_50_;
                            return;
                        }
                    } else {
                        if (anInt4567 < i_47_)
                            return;
                        int i_51_ = (anInt4567 - i_46_) / i_49_;
                        if (i_51_ >= anInt4563) {
                            anInt4567 -= i_49_ * anInt4563;
                            anInt4563 = 0;
                        } else {
                            anInt4567 -= i_49_ * i_51_;
                            anInt4563 -= i_51_;
                            return;
                        }
                    }
                }
            } while (false);
            if (anInt4562 < 0) {
                if (anInt4567 < 0) {
                    anInt4567 = -1;
                    method1310();
                    this.method647(-17554);
                }
            } else if (anInt4567 >= i_48_) {
                anInt4567 = i_48_;
                method1310();
                this.method647(-17554);
            }
        }
    }

    public static int method1285
            (int i, int i_52_, byte[] is, int[] is_53_, int i_54_, int i_55_,
             int i_56_, int i_57_, int i_58_, int i_59_, int i_60_,
             Class68_Sub28_Sub3 class68_sub28_sub3, int i_61_, int i_62_) {
        if (i_61_ == 0
                || (i_58_ = i_55_ + (i_60_ - i_54_ + i_61_ - 257) / i_61_) > i_59_)
            i_58_ = i_59_;
        i_55_ <<= 1;
        i_58_ <<= 1;
        while (i_55_ < i_58_) {
            i_52_ = i_54_ >> 8;
            i = is[i_52_];
            i = (i << 8) + (is[i_52_ + 1] - i) * (i_54_ & 0xff);
            is_53_[i_55_++] += i * i_56_ >> 6;
            is_53_[i_55_++] += i * i_57_ >> 6;
            i_54_ += i_61_;
        }
        if (i_61_ == 0
                || ((i_58_ = (i_55_ >> 1) + (i_60_ - i_54_ + i_61_ - 1) / i_61_)
                > i_59_))
            i_58_ = i_59_;
        i_58_ <<= 1;
        i_52_ = i_62_;
        while (i_55_ < i_58_) {
            i = is[i_54_ >> 8];
            i = (i << 8) + (i_52_ - i) * (i_54_ & 0xff);
            is_53_[i_55_++] += i * i_56_ >> 6;
            is_53_[i_55_++] += i * i_57_ >> 6;
            i_54_ += i_61_;
        }
        class68_sub28_sub3.anInt4567 = i_54_;
        return i_55_ >> 1;
    }

    public static int method1286
            (int i, int i_63_, byte[] is, int[] is_64_, int i_65_, int i_66_,
             int i_67_, int i_68_, int i_69_, int i_70_, int i_71_,
             Class68_Sub28_Sub3 class68_sub28_sub3, int i_72_, int i_73_) {
        if (i_72_ == 0
                || (i_69_ = i_66_ + (i_71_ + 256 - i_65_ + i_72_) / i_72_) > i_70_)
            i_69_ = i_70_;
        i_66_ <<= 1;
        i_69_ <<= 1;
        while (i_66_ < i_69_) {
            i_63_ = i_65_ >> 8;
            i = is[i_63_ - 1];
            i = (i << 8) + (is[i_63_] - i) * (i_65_ & 0xff);
            is_64_[i_66_++] += i * i_67_ >> 6;
            is_64_[i_66_++] += i * i_68_ >> 6;
            i_65_ += i_72_;
        }
        if (i_72_ == 0
                || ((i_69_ = (i_66_ >> 1) + (i_71_ - i_65_ + i_72_) / i_72_)
                > i_70_))
            i_69_ = i_70_;
        i_69_ <<= 1;
        i_63_ = i_73_;
        while (i_66_ < i_69_) {
            i = (i_63_ << 8) + (is[i_65_ >> 8] - i_63_) * (i_65_ & 0xff);
            is_64_[i_66_++] += i * i_67_ >> 6;
            is_64_[i_66_++] += i * i_68_ >> 6;
            i_65_ += i_72_;
        }
        class68_sub28_sub3.anInt4567 = i_65_;
        return i_66_ >> 1;
    }

    public Class68_Sub28 method1228() {
        return null;
    }

    public static Class68_Sub28_Sub3 method1287
            (Class68_Sub11_Sub1 class68_sub11_sub1, int i, int i_74_, int i_75_) {
        if (class68_sub11_sub1.aByteArray3445 == null
                || class68_sub11_sub1.aByteArray3445.length == 0)
            return null;
        return new Class68_Sub28_Sub3(class68_sub11_sub1, i, i_74_, i_75_);
    }

    public synchronized void method1288(int i) {
        if (i == 0) {
            method1298(0);
            this.method647(-17554);
        } else if (anInt4564 == 0 && anInt4571 == 0) {
            anInt4568 = 0;
            anInt4560 = 0;
            anInt4566 = 0;
            this.method647(-17554);
        } else {
            int i_76_ = -anInt4566;
            if (anInt4566 > i_76_)
                i_76_ = anInt4566;
            if (-anInt4564 > i_76_)
                i_76_ = -anInt4564;
            if (anInt4564 > i_76_)
                i_76_ = anInt4564;
            if (-anInt4571 > i_76_)
                i_76_ = -anInt4571;
            if (anInt4571 > i_76_)
                i_76_ = anInt4571;
            if (i > i_76_)
                i = i_76_;
            anInt4568 = i;
            anInt4560 = -2147483648;
            anInt4565 = -anInt4566 / i;
            anInt4569 = -anInt4564 / i;
            anInt4558 = -anInt4571 / i;
        }
    }

    public synchronized void method1289(int i, int i_77_, int i_78_) {
        if (i == 0)
            method1297(i_77_, i_78_);
        else {
            int i_79_ = method1307(i_77_, i_78_);
            int i_80_ = method1277(i_77_, i_78_);
            if (anInt4564 == i_79_ && anInt4571 == i_80_)
                anInt4568 = 0;
            else {
                int i_81_ = i_77_ - anInt4566;
                if (anInt4566 - i_77_ > i_81_)
                    i_81_ = anInt4566 - i_77_;
                if (i_79_ - anInt4564 > i_81_)
                    i_81_ = i_79_ - anInt4564;
                if (anInt4564 - i_79_ > i_81_)
                    i_81_ = anInt4564 - i_79_;
                if (i_80_ - anInt4571 > i_81_)
                    i_81_ = i_80_ - anInt4571;
                if (anInt4571 - i_80_ > i_81_)
                    i_81_ = anInt4571 - i_80_;
                if (i > i_81_)
                    i = i_81_;
                anInt4568 = i;
                anInt4560 = i_77_;
                anInt4557 = i_78_;
                anInt4565 = (i_77_ - anInt4566) / i;
                anInt4569 = (i_79_ - anInt4564) / i;
                anInt4558 = (i_80_ - anInt4571) / i;
            }
        }
    }

    public static int method1290(int i, byte[] is, int[] is_82_, int i_83_,
                                 int i_84_, int i_85_, int i_86_, int i_87_,
                                 int i_88_, int i_89_,
                                 Class68_Sub28_Sub3 class68_sub28_sub3) {
        i_83_ >>= 8;
        i_89_ >>= 8;
        i_85_ <<= 2;
        i_86_ <<= 2;
        if ((i_87_ = i_84_ + i_89_ - i_83_) > i_88_)
            i_87_ = i_88_;
        i_84_ <<= 1;
        i_87_ <<= 1;
        i_87_ -= 6;
        while (i_84_ < i_87_) {
            i = is[i_83_++];
            is_82_[i_84_++] += i * i_85_;
            is_82_[i_84_++] += i * i_86_;
            i = is[i_83_++];
            is_82_[i_84_++] += i * i_85_;
            is_82_[i_84_++] += i * i_86_;
            i = is[i_83_++];
            is_82_[i_84_++] += i * i_85_;
            is_82_[i_84_++] += i * i_86_;
            i = is[i_83_++];
            is_82_[i_84_++] += i * i_85_;
            is_82_[i_84_++] += i * i_86_;
        }
        i_87_ += 6;
        while (i_84_ < i_87_) {
            i = is[i_83_++];
            is_82_[i_84_++] += i * i_85_;
            is_82_[i_84_++] += i * i_86_;
        }
        class68_sub28_sub3.anInt4567 = i_83_ << 8;
        return i_84_ >> 1;
    }

    public int method1224() {
        if (anInt4560 == 0 && anInt4568 == 0)
            return 0;
        return 1;
    }

    public synchronized int method1291() {
        if (anInt4560 == -2147483648)
            return 0;
        return anInt4560;
    }

    public synchronized void method1292(int i) {
        int i_90_
                = (((Class68_Sub11_Sub1) aClass68_Sub11_3225).aByteArray3445.length
                << 8);
        if (i < -1)
            i = -1;
        if (i > i_90_)
            i = i_90_;
        anInt4567 = i;
    }

    public static int method1293
            (int i, int i_91_, byte[] is, int[] is_92_, int i_93_, int i_94_,
             int i_95_, int i_96_, int i_97_, int i_98_, int i_99_,
             Class68_Sub28_Sub3 class68_sub28_sub3, int i_100_, int i_101_) {
        class68_sub28_sub3.anInt4564 -= class68_sub28_sub3.anInt4569 * i_94_;
        class68_sub28_sub3.anInt4571 -= class68_sub28_sub3.anInt4558 * i_94_;
        if (i_100_ == 0
                || ((i_97_ = i_94_ + (i_99_ - i_93_ + i_100_ - 257) / i_100_)
                > i_98_))
            i_97_ = i_98_;
        while (i_94_ < i_97_) {
            i_91_ = i_93_ >> 8;
            i = is[i_91_];
            is_92_[i_94_++]
                    += (((i << 8) + (is[i_91_ + 1] - i) * (i_93_ & 0xff)) * i_95_
                    >> 6);
            i_95_ += i_96_;
            i_93_ += i_100_;
        }
        if (i_100_ == 0
                || (i_97_ = i_94_ + (i_99_ - i_93_ + i_100_ - 1) / i_100_) > i_98_)
            i_97_ = i_98_;
        i_91_ = i_101_;
        while (i_94_ < i_97_) {
            i = is[i_93_ >> 8];
            is_92_[i_94_++]
                    += ((i << 8) + (i_91_ - i) * (i_93_ & 0xff)) * i_95_ >> 6;
            i_95_ += i_96_;
            i_93_ += i_100_;
        }
        class68_sub28_sub3.anInt4564 += class68_sub28_sub3.anInt4569 * i_94_;
        class68_sub28_sub3.anInt4571 += class68_sub28_sub3.anInt4558 * i_94_;
        class68_sub28_sub3.anInt4566 = i_95_;
        class68_sub28_sub3.anInt4567 = i_93_;
        return i_94_;
    }

    public synchronized void method1225(int[] is, int i, int i_102_) {
        if (anInt4560 == 0 && anInt4568 == 0)
            method1229(i_102_);
        else {
            Class68_Sub11_Sub1 class68_sub11_sub1
                    = (Class68_Sub11_Sub1) aClass68_Sub11_3225;
            int i_103_ = anInt4561 << 8;
            int i_104_ = anInt4559 << 8;
            int i_105_ = class68_sub11_sub1.aByteArray3445.length << 8;
            int i_106_ = i_104_ - i_103_;
            if (i_106_ <= 0)
                anInt4563 = 0;
            int i_107_ = i;
            i_102_ += i;
            if (anInt4567 < 0) {
                if (anInt4562 > 0)
                    anInt4567 = 0;
                else {
                    method1310();
                    this.method647(-17554);
                    return;
                }
            }
            if (anInt4567 >= i_105_) {
                if (anInt4562 < 0)
                    anInt4567 = i_105_ - 1;
                else {
                    method1310();
                    this.method647(-17554);
                    return;
                }
            }
            if (anInt4563 < 0) {
                if (aBoolean4570) {
                    if (anInt4562 < 0) {
                        i_107_ = method1309(is, i_107_, i_103_, i_102_,
                                (class68_sub11_sub1.aByteArray3445
                                        [anInt4561]));
                        if (anInt4567 >= i_103_)
                            return;
                        anInt4567 = i_103_ + i_103_ - 1 - anInt4567;
                        anInt4562 = -anInt4562;
                    }
                    for (; ; ) {
                        i_107_ = method1282(is, i_107_, i_104_, i_102_,
                                (class68_sub11_sub1.aByteArray3445
                                        [anInt4559 - 1]));
                        if (anInt4567 < i_104_)
                            break;
                        anInt4567 = i_104_ + i_104_ - 1 - anInt4567;
                        anInt4562 = -anInt4562;
                        i_107_ = method1309(is, i_107_, i_103_, i_102_,
                                (class68_sub11_sub1.aByteArray3445
                                        [anInt4561]));
                        if (anInt4567 >= i_103_)
                            break;
                        anInt4567 = i_103_ + i_103_ - 1 - anInt4567;
                        anInt4562 = -anInt4562;
                    }
                } else if (anInt4562 < 0) {
                    for (; ; ) {
                        i_107_ = method1309(is, i_107_, i_103_, i_102_,
                                (class68_sub11_sub1.aByteArray3445
                                        [anInt4559 - 1]));
                        if (anInt4567 >= i_103_)
                            break;
                        anInt4567
                                = i_104_ - 1 - (i_104_ - 1 - anInt4567) % i_106_;
                    }
                } else {
                    for (; ; ) {
                        i_107_ = method1282(is, i_107_, i_104_, i_102_,
                                (class68_sub11_sub1.aByteArray3445
                                        [anInt4561]));
                        if (anInt4567 < i_104_)
                            break;
                        anInt4567 = i_103_ + (anInt4567 - i_103_) % i_106_;
                    }
                }
            } else {
                do {
                    if (anInt4563 > 0) {
                        if (aBoolean4570) {
                            if (anInt4562 < 0) {
                                i_107_
                                        = method1309(is, i_107_, i_103_, i_102_,
                                        (class68_sub11_sub1
                                                .aByteArray3445[anInt4561]));
                                if (anInt4567 >= i_103_)
                                    return;
                                anInt4567 = i_103_ + i_103_ - 1 - anInt4567;
                                anInt4562 = -anInt4562;
                                if (--anInt4563 == 0)
                                    break;
                            }
                            do {
                                i_107_ = method1282(is, i_107_, i_104_, i_102_,
                                        (class68_sub11_sub1
                                                .aByteArray3445
                                                [anInt4559 - 1]));
                                if (anInt4567 < i_104_)
                                    return;
                                anInt4567 = i_104_ + i_104_ - 1 - anInt4567;
                                anInt4562 = -anInt4562;
                                if (--anInt4563 == 0)
                                    break;
                                i_107_
                                        = method1309(is, i_107_, i_103_, i_102_,
                                        (class68_sub11_sub1
                                                .aByteArray3445[anInt4561]));
                                if (anInt4567 >= i_103_)
                                    return;
                                anInt4567 = i_103_ + i_103_ - 1 - anInt4567;
                                anInt4562 = -anInt4562;
                            } while (--anInt4563 != 0);
                        } else if (anInt4562 < 0) {
                            for (; ; ) {
                                i_107_ = method1309(is, i_107_, i_103_, i_102_,
                                        (class68_sub11_sub1
                                                .aByteArray3445
                                                [anInt4559 - 1]));
                                if (anInt4567 >= i_103_)
                                    return;
                                int i_108_ = (i_104_ - 1 - anInt4567) / i_106_;
                                if (i_108_ >= anInt4563) {
                                    anInt4567 += i_106_ * anInt4563;
                                    anInt4563 = 0;
                                    break;
                                }
                                anInt4567 += i_106_ * i_108_;
                                anInt4563 -= i_108_;
                            }
                        } else {
                            for (; ; ) {
                                i_107_
                                        = method1282(is, i_107_, i_104_, i_102_,
                                        (class68_sub11_sub1
                                                .aByteArray3445[anInt4561]));
                                if (anInt4567 < i_104_)
                                    return;
                                int i_109_ = (anInt4567 - i_103_) / i_106_;
                                if (i_109_ >= anInt4563) {
                                    anInt4567 -= i_106_ * anInt4563;
                                    anInt4563 = 0;
                                    break;
                                }
                                anInt4567 -= i_106_ * i_109_;
                                anInt4563 -= i_109_;
                            }
                        }
                    }
                } while (false);
                if (anInt4562 < 0) {
                    method1309(is, i_107_, 0, i_102_, 0);
                    if (anInt4567 < 0) {
                        anInt4567 = -1;
                        method1310();
                        this.method647(-17554);
                    }
                } else {
                    method1282(is, i_107_, i_105_, i_102_, 0);
                    if (anInt4567 >= i_105_) {
                        anInt4567 = i_105_;
                        method1310();
                        this.method647(-17554);
                    }
                }
            }
        }
    }

    public synchronized int method1294() {
        if (anInt4562 < 0)
            return -anInt4562;
        return anInt4562;
    }

    public Class68_Sub28 method1226() {
        return null;
    }

    public boolean method1295() {
        if (anInt4567 >= 0
                && anInt4567 < (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                .aByteArray3445).length << 8)
            return false;
        return true;
    }

    public synchronized void method1296(int i) {
        if (anInt4562 < 0)
            anInt4562 = -i;
        else
            anInt4562 = i;
    }

    public synchronized void method1297(int i, int i_110_) {
        anInt4560 = i;
        anInt4557 = i_110_;
        anInt4568 = 0;
        method1281();
    }

    public synchronized void method1298(int i) {
        method1297(i, method1284());
    }

    public static Class68_Sub28_Sub3 method1299
            (Class68_Sub11_Sub1 class68_sub11_sub1, int i, int i_111_) {
        if (class68_sub11_sub1.aByteArray3445 == null
                || class68_sub11_sub1.aByteArray3445.length == 0)
            return null;
        return new Class68_Sub28_Sub3(class68_sub11_sub1,
                (int) ((long) (class68_sub11_sub1
                        .anInt3447)
                        * 256L * (long) i
                        / (long) (100
                        * Class93.anInt1660)),
                i_111_ << 6);
    }

    public static int method1300
            (int i, int i_112_, byte[] is, int[] is_113_, int i_114_, int i_115_,
             int i_116_, int i_117_, int i_118_, int i_119_, int i_120_,
             int i_121_, int i_122_, Class68_Sub28_Sub3 class68_sub28_sub3,
             int i_123_, int i_124_) {
        class68_sub28_sub3.anInt4566 -= class68_sub28_sub3.anInt4565 * i_115_;
        if (i_123_ == 0
                || ((i_120_ = i_115_ + (i_122_ - i_114_ + i_123_ - 257) / i_123_)
                > i_121_))
            i_120_ = i_121_;
        i_115_ <<= 1;
        i_120_ <<= 1;
        while (i_115_ < i_120_) {
            i_112_ = i_114_ >> 8;
            i = is[i_112_];
            i = (i << 8) + (is[i_112_ + 1] - i) * (i_114_ & 0xff);
            is_113_[i_115_++] += i * i_116_ >> 6;
            i_116_ += i_118_;
            is_113_[i_115_++] += i * i_117_ >> 6;
            i_117_ += i_119_;
            i_114_ += i_123_;
        }
        if (i_123_ == 0 || (i_120_ = (i_115_ >> 1) + (i_122_ - i_114_ + i_123_
                - 1) / i_123_) > i_121_)
            i_120_ = i_121_;
        i_120_ <<= 1;
        i_112_ = i_124_;
        while (i_115_ < i_120_) {
            i = is[i_114_ >> 8];
            i = (i << 8) + (i_112_ - i) * (i_114_ & 0xff);
            is_113_[i_115_++] += i * i_116_ >> 6;
            i_116_ += i_118_;
            is_113_[i_115_++] += i * i_117_ >> 6;
            i_117_ += i_119_;
            i_114_ += i_123_;
        }
        i_115_ >>= 1;
        class68_sub28_sub3.anInt4566 += class68_sub28_sub3.anInt4565 * i_115_;
        class68_sub28_sub3.anInt4564 = i_116_;
        class68_sub28_sub3.anInt4571 = i_117_;
        class68_sub28_sub3.anInt4567 = i_114_;
        return i_115_;
    }

    public static int method1301
            (int i, byte[] is, int[] is_125_, int i_126_, int i_127_, int i_128_,
             int i_129_, int i_130_, int i_131_, int i_132_, int i_133_,
             int i_134_, Class68_Sub28_Sub3 class68_sub28_sub3) {
        i_126_ >>= 8;
        i_134_ >>= 8;
        i_128_ <<= 2;
        i_129_ <<= 2;
        i_130_ <<= 2;
        i_131_ <<= 2;
        if ((i_132_ = i_127_ + i_134_ - i_126_) > i_133_)
            i_132_ = i_133_;
        class68_sub28_sub3.anInt4566
                += class68_sub28_sub3.anInt4565 * (i_132_ - i_127_);
        i_127_ <<= 1;
        i_132_ <<= 1;
        i_132_ -= 6;
        while (i_127_ < i_132_) {
            i = is[i_126_++];
            is_125_[i_127_++] += i * i_128_;
            i_128_ += i_130_;
            is_125_[i_127_++] += i * i_129_;
            i_129_ += i_131_;
            i = is[i_126_++];
            is_125_[i_127_++] += i * i_128_;
            i_128_ += i_130_;
            is_125_[i_127_++] += i * i_129_;
            i_129_ += i_131_;
            i = is[i_126_++];
            is_125_[i_127_++] += i * i_128_;
            i_128_ += i_130_;
            is_125_[i_127_++] += i * i_129_;
            i_129_ += i_131_;
            i = is[i_126_++];
            is_125_[i_127_++] += i * i_128_;
            i_128_ += i_130_;
            is_125_[i_127_++] += i * i_129_;
            i_129_ += i_131_;
        }
        i_132_ += 6;
        while (i_127_ < i_132_) {
            i = is[i_126_++];
            is_125_[i_127_++] += i * i_128_;
            i_128_ += i_130_;
            is_125_[i_127_++] += i * i_129_;
            i_129_ += i_131_;
        }
        class68_sub28_sub3.anInt4564 = i_128_ >> 2;
        class68_sub28_sub3.anInt4571 = i_129_ >> 2;
        class68_sub28_sub3.anInt4567 = i_126_ << 8;
        return i_127_ >> 1;
    }

    public static int method1302(byte[] is, int[] is_135_, int i, int i_136_,
                                 int i_137_, int i_138_, int i_139_,
                                 int i_140_, int i_141_,
                                 Class68_Sub28_Sub3 class68_sub28_sub3) {
        i >>= 8;
        i_141_ >>= 8;
        i_137_ <<= 2;
        i_138_ <<= 2;
        if ((i_139_ = i_136_ + i_141_ - i) > i_140_)
            i_139_ = i_140_;
        class68_sub28_sub3.anInt4564
                += class68_sub28_sub3.anInt4569 * (i_139_ - i_136_);
        class68_sub28_sub3.anInt4571
                += class68_sub28_sub3.anInt4558 * (i_139_ - i_136_);
        i_139_ -= 3;
        while (i_136_ < i_139_) {
            is_135_[i_136_++] += is[i++] * i_137_;
            i_137_ += i_138_;
            is_135_[i_136_++] += is[i++] * i_137_;
            i_137_ += i_138_;
            is_135_[i_136_++] += is[i++] * i_137_;
            i_137_ += i_138_;
            is_135_[i_136_++] += is[i++] * i_137_;
            i_137_ += i_138_;
        }
        i_139_ += 3;
        while (i_136_ < i_139_) {
            is_135_[i_136_++] += is[i++] * i_137_;
            i_137_ += i_138_;
        }
        class68_sub28_sub3.anInt4566 = i_137_ >> 2;
        class68_sub28_sub3.anInt4567 = i << 8;
        return i_136_;
    }

    public static int method1303
            (byte[] is, int[] is_142_, int i, int i_143_, int i_144_, int i_145_,
             int i_146_, int i_147_, Class68_Sub28_Sub3 class68_sub28_sub3) {
        i >>= 8;
        i_147_ >>= 8;
        i_144_ <<= 2;
        if ((i_145_ = i_143_ + i_147_ - i) > i_146_)
            i_145_ = i_146_;
        i_145_ -= 3;
        while (i_143_ < i_145_) {
            is_142_[i_143_++] += is[i++] * i_144_;
            is_142_[i_143_++] += is[i++] * i_144_;
            is_142_[i_143_++] += is[i++] * i_144_;
            is_142_[i_143_++] += is[i++] * i_144_;
        }
        i_145_ += 3;
        while (i_143_ < i_145_)
            is_142_[i_143_++] += is[i++] * i_144_;
        class68_sub28_sub3.anInt4567 = i << 8;
        return i_143_;
    }

    public Class68_Sub28_Sub3(Class68_Sub11_Sub1 class68_sub11_sub1, int i,
                              int i_148_) {
        aClass68_Sub11_3225 = class68_sub11_sub1;
        anInt4561 = class68_sub11_sub1.anInt3443;
        anInt4559 = class68_sub11_sub1.anInt3444;
        aBoolean4570 = class68_sub11_sub1.aBoolean3446;
        anInt4562 = i;
        anInt4560 = i_148_;
        anInt4557 = 8192;
        anInt4567 = 0;
        method1281();
    }

    public static int method1304
            (int i, int i_149_, byte[] is, int[] is_150_, int i_151_, int i_152_,
             int i_153_, int i_154_, int i_155_, int i_156_, int i_157_,
             Class68_Sub28_Sub3 class68_sub28_sub3, int i_158_, int i_159_) {
        class68_sub28_sub3.anInt4564 -= class68_sub28_sub3.anInt4569 * i_152_;
        class68_sub28_sub3.anInt4571 -= class68_sub28_sub3.anInt4558 * i_152_;
        if (i_158_ == 0
                || ((i_155_ = i_152_ + (i_157_ + 256 - i_151_ + i_158_) / i_158_)
                > i_156_))
            i_155_ = i_156_;
        while (i_152_ < i_155_) {
            i_149_ = i_151_ >> 8;
            i = is[i_149_ - 1];
            is_150_[i_152_++]
                    += (((i << 8) + (is[i_149_] - i) * (i_151_ & 0xff)) * i_153_
                    >> 6);
            i_153_ += i_154_;
            i_151_ += i_158_;
        }
        if (i_158_ == 0
                || ((i_155_ = i_152_ + (i_157_ - i_151_ + i_158_) / i_158_)
                > i_156_))
            i_155_ = i_156_;
        i = i_159_;
        i_149_ = i_158_;
        while (i_152_ < i_155_) {
            is_150_[i_152_++]
                    += (((i << 8) + (is[i_151_ >> 8] - i) * (i_151_ & 0xff))
                    * i_153_) >> 6;
            i_153_ += i_154_;
            i_151_ += i_149_;
        }
        class68_sub28_sub3.anInt4564 += class68_sub28_sub3.anInt4569 * i_152_;
        class68_sub28_sub3.anInt4571 += class68_sub28_sub3.anInt4558 * i_152_;
        class68_sub28_sub3.anInt4566 = i_153_;
        class68_sub28_sub3.anInt4567 = i_151_;
        return i_152_;
    }

    public synchronized void method1305(boolean bool) {
        anInt4562 = (anInt4562 ^ anInt4562 >> 31) + (anInt4562 >>> 31);
        if (bool)
            anInt4562 = -anInt4562;
    }

    public static int method1306
            (byte[] is, int[] is_160_, int i, int i_161_, int i_162_, int i_163_,
             int i_164_, int i_165_, Class68_Sub28_Sub3 class68_sub28_sub3) {
        i >>= 8;
        i_165_ >>= 8;
        i_162_ <<= 2;
        if ((i_163_ = i_161_ + i - (i_165_ - 1)) > i_164_)
            i_163_ = i_164_;
        i_163_ -= 3;
        while (i_161_ < i_163_) {
            is_160_[i_161_++] += is[i--] * i_162_;
            is_160_[i_161_++] += is[i--] * i_162_;
            is_160_[i_161_++] += is[i--] * i_162_;
            is_160_[i_161_++] += is[i--] * i_162_;
        }
        i_163_ += 3;
        while (i_161_ < i_163_)
            is_160_[i_161_++] += is[i--] * i_162_;
        class68_sub28_sub3.anInt4567 = i << 8;
        return i_161_;
    }

    public static int method1307(int i, int i_166_) {
        if (i_166_ < 0)
            return i;
        return (int) (((double) i
                * Math.sqrt((double) (16384 - i_166_) * 1.220703125E-4))
                + 0.5);
    }

    public static int method1308(byte[] is, int[] is_167_, int i, int i_168_,
                                 int i_169_, int i_170_, int i_171_,
                                 int i_172_, int i_173_,
                                 Class68_Sub28_Sub3 class68_sub28_sub3) {
        i >>= 8;
        i_173_ >>= 8;
        i_169_ <<= 2;
        i_170_ <<= 2;
        if ((i_171_ = i_168_ + i - (i_173_ - 1)) > i_172_)
            i_171_ = i_172_;
        class68_sub28_sub3.anInt4564
                += class68_sub28_sub3.anInt4569 * (i_171_ - i_168_);
        class68_sub28_sub3.anInt4571
                += class68_sub28_sub3.anInt4558 * (i_171_ - i_168_);
        i_171_ -= 3;
        while (i_168_ < i_171_) {
            is_167_[i_168_++] += is[i--] * i_169_;
            i_169_ += i_170_;
            is_167_[i_168_++] += is[i--] * i_169_;
            i_169_ += i_170_;
            is_167_[i_168_++] += is[i--] * i_169_;
            i_169_ += i_170_;
            is_167_[i_168_++] += is[i--] * i_169_;
            i_169_ += i_170_;
        }
        i_171_ += 3;
        while (i_168_ < i_171_) {
            is_167_[i_168_++] += is[i--] * i_169_;
            i_169_ += i_170_;
        }
        class68_sub28_sub3.anInt4566 = i_169_ >> 2;
        class68_sub28_sub3.anInt4567 = i << 8;
        return i_168_;
    }

    public Class68_Sub28_Sub3(Class68_Sub11_Sub1 class68_sub11_sub1, int i,
                              int i_174_, int i_175_) {
        aClass68_Sub11_3225 = class68_sub11_sub1;
        anInt4561 = class68_sub11_sub1.anInt3443;
        anInt4559 = class68_sub11_sub1.anInt3444;
        aBoolean4570 = class68_sub11_sub1.aBoolean3446;
        anInt4562 = i;
        anInt4560 = i_174_;
        anInt4557 = i_175_;
        anInt4567 = 0;
        method1281();
    }

    public int method1309(int[] is, int i, int i_176_, int i_177_,
                          int i_178_) {
        while (anInt4568 > 0) {
            int i_179_ = i + anInt4568;
            if (i_179_ > i_177_)
                i_179_ = i_177_;
            anInt4568 += i;
            if (anInt4562 == -256 && (anInt4567 & 0xff) == 0) {
                if (Class7.aBoolean132)
                    i = method1274(0,
                            (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                                    .aByteArray3445),
                            is, anInt4567, i, anInt4564, anInt4571,
                            anInt4569, anInt4558, 0, i_179_, i_176_,
                            this);
                else
                    i = method1308((((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                            .aByteArray3445),
                            is, anInt4567, i, anInt4566, anInt4565, 0,
                            i_179_, i_176_, this);
            } else if (Class7.aBoolean132)
                i = method1311(0, 0,
                        (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                                .aByteArray3445),
                        is, anInt4567, i, anInt4564, anInt4571,
                        anInt4569, anInt4558, 0, i_179_, i_176_, this,
                        anInt4562, i_178_);
            else
                i = method1304(0, 0,
                        (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                                .aByteArray3445),
                        is, anInt4567, i, anInt4566, anInt4565, 0,
                        i_179_, i_176_, this, anInt4562, i_178_);
            anInt4568 -= i;
            if (anInt4568 != 0)
                return i;
            if (method1276())
                return i_177_;
        }
        if (anInt4562 == -256 && (anInt4567 & 0xff) == 0) {
            if (Class7.aBoolean132)
                return method1273(0,
                        (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                                .aByteArray3445),
                        is, anInt4567, i, anInt4564, anInt4571, 0,
                        i_177_, i_176_, this);
            return method1306((((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                    .aByteArray3445),
                    is, anInt4567, i, anInt4566, 0, i_177_, i_176_,
                    this);
        }
        if (Class7.aBoolean132)
            return method1286(0, 0,
                    (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                            .aByteArray3445),
                    is, anInt4567, i, anInt4564, anInt4571, 0,
                    i_177_, i_176_, this, anInt4562, i_178_);
        return method1275(0, 0,
                (((Class68_Sub11_Sub1) aClass68_Sub11_3225)
                        .aByteArray3445),
                is, anInt4567, i, anInt4566, 0, i_177_, i_176_, this,
                anInt4562, i_178_);
    }

    public void method1310() {
        if (anInt4568 != 0) {
            if (anInt4560 == -2147483648)
                anInt4560 = 0;
            anInt4568 = 0;
            method1281();
        }
    }

    public static int method1311
            (int i, int i_180_, byte[] is, int[] is_181_, int i_182_, int i_183_,
             int i_184_, int i_185_, int i_186_, int i_187_, int i_188_,
             int i_189_, int i_190_, Class68_Sub28_Sub3 class68_sub28_sub3,
             int i_191_, int i_192_) {
        class68_sub28_sub3.anInt4566 -= class68_sub28_sub3.anInt4565 * i_183_;
        if (i_191_ == 0
                || ((i_188_ = i_183_ + (i_190_ + 256 - i_182_ + i_191_) / i_191_)
                > i_189_))
            i_188_ = i_189_;
        i_183_ <<= 1;
        i_188_ <<= 1;
        while (i_183_ < i_188_) {
            i_180_ = i_182_ >> 8;
            i = is[i_180_ - 1];
            i = (i << 8) + (is[i_180_] - i) * (i_182_ & 0xff);
            is_181_[i_183_++] += i * i_184_ >> 6;
            i_184_ += i_186_;
            is_181_[i_183_++] += i * i_185_ >> 6;
            i_185_ += i_187_;
            i_182_ += i_191_;
        }
        if (i_191_ == 0
                || ((i_188_ = (i_183_ >> 1) + (i_190_ - i_182_ + i_191_) / i_191_)
                > i_189_))
            i_188_ = i_189_;
        i_188_ <<= 1;
        i_180_ = i_192_;
        while (i_183_ < i_188_) {
            i = (i_180_ << 8) + (is[i_182_ >> 8] - i_180_) * (i_182_ & 0xff);
            is_181_[i_183_++] += i * i_184_ >> 6;
            i_184_ += i_186_;
            is_181_[i_183_++] += i * i_185_ >> 6;
            i_185_ += i_187_;
            i_182_ += i_191_;
        }
        i_183_ >>= 1;
        class68_sub28_sub3.anInt4566 += class68_sub28_sub3.anInt4565 * i_183_;
        class68_sub28_sub3.anInt4564 = i_184_;
        class68_sub28_sub3.anInt4571 = i_185_;
        class68_sub28_sub3.anInt4567 = i_182_;
        return i_183_;
    }
}
