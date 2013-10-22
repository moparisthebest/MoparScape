/* Class68_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub29 extends Class68 {

    public static int anInt3229;
    public int anInt3230;
    public static RSString aRSString_3231;
    public int anInt3232;
    public static int anInt3233 = 0;
    public RSString aRSString_3234;
    public static RSString aRSString_3235;
    public static int anInt3236;
    public Object[] anObjectArray3237;
    public static int anInt3238;
    public Class45 aClass45_3239;
    public int anInt3240;
    public int anInt3241;
    public boolean aBoolean3242;
    public static int anInt3243 = 0;
    public Class45 aClass45_3244;
    public static int anInt3245;
    public int anInt3246;
    public static int anInt3247;
    public static RSString[] aRSStringArray3248;
    public static int anInt3249;

    public static Sprite method1319(int i, Class21renamed class21,
                                    int i_0_) {
        anInt3247++;
        if (i_0_ < 53) {
            aRSStringArray3248 = null;
        }
        if (!Class56.method572(class21, -1, i)) {
            return null;
        }
        return Class124.method1751((byte) -83);
    }

    public static void method1320(int i) {
        anInt3245++;
        int i_1_ = Class49.anInt969;
        int i_2_ = Class68_Sub13_Sub14.anInt3667;
        int i_3_ = Class33.anInt588;
        int i_4_ = Class68_Sub13_Sub15.anInt3687;
        int i_5_ = 6116423;
        Class79.method1439(i_1_, i_2_, i_4_, i_3_, i_5_);
        Class79.method1439(1 + i_1_, 1 + i_2_, -2 + i_4_, 16, 0);
        Class79.method1415(i_1_ - -1, 18 + i_2_, -2 + i_4_, i_3_ + -19, 0);
        Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1030(Class68_Sub13_Sub26_Sub1.aRSString_4605, i_1_ + 3, i_2_ - -14,
                i_5_, -1);
        int i_6_ = Class96.anInt1695;
        int i_7_ = Class13.anInt223;
        int i_8_ = 0;
        if (i == 4) {
            for (/**/; (i_8_ ^ 0xffffffff) > (Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff); i_8_++) {
                int i_9_ = ((-1 + (Class68_Sub13_Sub21.anInt3803 + -i_8_)) * 15 + (31 + i_2_));
                int i_10_ = 16777215;
                if ((i_6_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff) && i_4_ + i_1_ > i_6_ && (i_7_ ^ 0xffffffff) < (-13 + i_9_ ^ 0xffffffff) && i_7_ < i_9_ + 3) {
                    i_10_ = 16776960;
                }
                Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1030(Class58.method579((byte) -103, i_8_), 3 + i_1_, i_9_,
                        i_10_, 0);
            }
            Class13.method242(-97, Class68_Sub13_Sub15.anInt3687,
                    Class33.anInt588, Class49.anInt969,
                    Class68_Sub13_Sub14.anInt3667);
        }
    }

    public static void method1321(byte i) {
        anInt3238++;
        if (i > -99) {
            method1325(93, null);
        }
        for (int i_11_ = 0;
             (i_11_ ^ 0xffffffff) > (Class1_Sub2.anInt2435 ^ 0xffffffff);
             i_11_++) {
            Class34.anIntArray596[i_11_]--;
            if (Class34.anIntArray596[i_11_] < -10) {
                Class1_Sub2.anInt2435--;
                for (int i_12_ = i_11_;
                     ((i_12_ ^ 0xffffffff) > (Class1_Sub2.anInt2435 ^ 0xffffffff));
                     i_12_++) {
                    Login.anIntArray1515[i_12_] = Login.anIntArray1515[i_12_ - -1];
                    Class3.aClass46Array80[i_12_] = Class3.aClass46Array80[i_12_ + 1];
                    PacketParser.anIntArray1876[i_12_] = PacketParser.anIntArray1876[1 + i_12_];
                    Class34.anIntArray596[i_12_] = Class34.anIntArray596[1 + i_12_];
                    Class102.anIntArray1757[i_12_] = Class102.anIntArray1757[1 + i_12_];
                }
                i_11_--;
            } else {
                Class46 class46 = Class3.aClass46Array80[i_11_];
                if (class46 == null) {
                    class46 = Class46.method509(Class78.aClass21_Sub1_1388,
                            Login.anIntArray1515[i_11_], 0);
                    if (class46 == null) {
                        continue;
                    }
                    Class34.anIntArray596[i_11_] += class46.method510();
                    Class3.aClass46Array80[i_11_] = class46;
                }
                if (Class34.anIntArray596[i_11_] < 0) {
                    int i_13_;
                    if (Class102.anIntArray1757[i_11_] == 0) {
                        i_13_ = Class106.anInt1801;
                    } else {
                        int i_14_ = (Class102.anIntArray1757[i_11_] >> -1590293168 & 0xff);
                        int i_15_ = ((Class102.anIntArray1757[i_11_] & 0xff26) >> -783890328);
                        int i_16_ = (-Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561 + (i_14_ * 128 + 64));
                        int i_17_ = (0xff & Class102.anIntArray1757[i_11_]) * 128;
                        if (i_16_ < 0) {
                            i_16_ = -i_16_;
                        }
                        int i_18_ = (64 + i_15_ * 128 + -(Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537));
                        if ((i_18_ ^ 0xffffffff) > -1) {
                            i_18_ = -i_18_;
                        }
                        int i_19_ = -128 + (i_16_ - -i_18_);
                        if ((i_17_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) {
                            Class34.anIntArray596[i_11_] = -100;
                            continue;
                        }
                        if ((i_19_ ^ 0xffffffff) > -1) {
                            i_19_ = 0;
                        }
                        i_13_ = ((-i_19_ + i_17_) * Class68_Sub20_Sub15.anInt4399 / i_17_);
                    }
                    if ((i_13_ ^ 0xffffffff) < -1) {
                        Class68_Sub11_Sub1 class68_sub11_sub1 = class46.method508().method685(Class68_Sub20.aClass95_3079);
                        Class68_Sub28_Sub3 class68_sub28_sub3 = Class68_Sub28_Sub3.method1299(class68_sub11_sub1,
                                100, i_13_);
                        class68_sub28_sub3.method1272(PacketParser.anIntArray1876[i_11_] + -1);
                        Class80.aClass68_Sub28_Sub4_1418.method1316(class68_sub28_sub3);
                    }
                    Class34.anIntArray596[i_11_] = -100;
                }
            }
        }
        if (Class123.aBoolean2127 && !PacketParser.method1664(20778)) {
            if ((Class68_Sub13_Sub25.anInt3855 ^ 0xffffffff) != -1 && (Class101.anInt1745 ^ 0xffffffff) != 0) {
                Class68_Sub13_Sub38.method899(Class101.anInt1745,
                        Class21renamed.aClass21_Sub1_459, false,
                        0, Class68_Sub13_Sub25.anInt3855,
                        false);
            }
            Class123.aBoolean2127 = false;
        } else if ((Class68_Sub13_Sub25.anInt3855 ^ 0xffffffff) != -1 && Class101.anInt1745 != -1 && !PacketParser.method1664(20778)) {
            Class21renamed.stream.createFrame(247);
            Class70.anInt1268++;
            Class21renamed.stream.writeDWord(Class101.anInt1745);
            Class101.anInt1745 = -1;
        }
    }

    public static RSString method1322(int i, long l, int i_20_, boolean bool) {
        try {
            anInt3236++;
            if (i < 2 || i > 36) {
                throw new IllegalArgumentException("Invalid radix:" + i);
            }
            int i_21_ = 1;
            long l_22_ = l / (long) i;
            while ((l_22_ ^ 0xffffffffffffffffL) != -1L) {
                l_22_ /= (long) i;
                i_21_++;
            }
            int i_23_ = i_21_;
            if (l < 0L || bool) {
                i_23_++;
            }
            byte[] is = new byte[i_23_];
            if (l < 0L) {
                is[0] = (byte) 45;
            } else if (bool) {
                is[0] = (byte) 43;
            }
            if (i_20_ < 18) {
                method1324(36);
            }
            for (int i_24_ = 0; (i_21_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff);
                 i_24_++) {
                int i_25_ = (int) (l % (long) i);
                if ((i_25_ ^ 0xffffffff) > -1) {
                    i_25_ = -i_25_;
                }
                if (i_25_ > 9) {
                    i_25_ += 39;
                }
                is[-1 + (-i_24_ + i_23_)] = (byte) (i_25_ + 48);
                l /= (long) i;
            }
            RSString class100 = new RSString();
            class100.anInt2293 = i_23_;
            class100.bytes = is;
            return class100;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("wj.C(" + i + ',' + l + ',' + i_20_ + ',' + bool + ')'));
        }
    }

    public static void method1323(int i, int i_26_, int i_27_, int i_28_,
                                  int i_29_, int i_30_, int i_31_, int i_32_,
                                  int i_33_) {
        anInt3229++;
        int i_34_ = i_33_ + -i_29_;
        int i_35_ = (-i_28_ + i_30_ << 1948975632) / i_34_;
        if (i_31_ == 1391070128) {
            int i_36_ = i_27_ - i_26_;
            int i_37_ = (-i + i_32_ << 1391070128) / i_36_;
            Class1_Sub6.method144(i_35_, i_37_, i_33_, true, 0, 0, i_27_, i,
                    i_26_, i_28_, i_29_);
        }
    }

    public static void method1324(int i) {
        aRSString_3235 = null;
        aRSString_3231 = null;
        if (i > -88) {
            method1320(-124);
        }
        aRSStringArray3248 = null;
    }

    public static void method1325(int i, Stream class68_sub14) {
        anInt3249++;
        while ((class68_sub14.currentOffset ^ 0xffffffff) > (class68_sub14.buffer.length ^ 0xffffffff)) {
            int i_38_ = 0;
            boolean bool = false;
            int i_39_ = 0;
            if ((class68_sub14.readUnsignedByte(i ^ ~0x202c) ^ 0xffffffff) == -2) {
                i_38_ = class68_sub14.readUnsignedByte(-6677);
                i_39_ = class68_sub14.readUnsignedByte(i ^ ~0x202c);
                bool = true;
            }
            int i_40_ = class68_sub14.readUnsignedByte(i ^ ~0x202c);
            int i_41_ = class68_sub14.readUnsignedByte(i ^ ~0x202c);
            int i_42_ = (Class103.anInt1768 - (1 - (-(i_41_ * 64) - -Class68_Sub1.anInt2760)));
            int i_43_ = 64 * i_40_ + -Class70.anInt1273;
            if (i_43_ < 0 || (-63 + i_42_ ^ 0xffffffff) > -1 || (63 + i_43_ ^ 0xffffffff) <= (Class68_Sub6.anInt2846 ^ 0xffffffff) || (Class103.anInt1768 ^ 0xffffffff) >= (i_42_ ^ 0xffffffff)) {
                for (int i_44_ = 0; i_44_ < (!bool ? 4096 : 64); i_44_++) {
                    int i_45_ = class68_sub14.readUnsignedByte(-6677);
                    if ((i_45_ ^ 0xffffffff) != -1) {
                        if ((0x1 & i_45_ ^ 0xffffffff) == -2) {
                            class68_sub14.currentOffset++;
                        }
                        if ((i_45_ & 0x2) == 2) {
                            class68_sub14.currentOffset += 2;
                        }
                        if ((0x4 & i_45_ ^ 0xffffffff) == -5) {
                            class68_sub14.currentOffset += 3;
                        }
                    }
                }
            } else {
                int i_46_ = i_42_ >> 775255206;
                int i_47_ = i_43_ >> 1933108550;
                for (int i_48_ = 0; i_48_ < 64; i_48_++) {
                    for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -65; i_49_++) {
                        if (!bool || ((i_38_ * 8 ^ 0xffffffff) >= (i_48_ ^ 0xffffffff) && ((i_38_ * 8 + 8 ^ 0xffffffff) < (i_48_ ^ 0xffffffff)) && (i_49_ ^ 0xffffffff) <= (8 * i_39_ ^ 0xffffffff) && ((8 * i_39_ - -8 ^ 0xffffffff) < (i_49_ ^ 0xffffffff)))) {
                            int i_50_ = class68_sub14.readUnsignedByte(i ^ ~0x202c);
                            if ((i_50_ ^ 0xffffffff) != -1) {
                                if ((i_50_ & 0x1 ^ 0xffffffff) == -2) {
                                    int i_51_ = class68_sub14.readUnsignedByte(-6677);
                                    if ((Class68_Sub13_Sub11.aByteArrayArrayArray3622[i_47_][i_46_]) == null) {
                                        Class68_Sub13_Sub11.aByteArrayArrayArray3622[i_47_][i_46_] = new byte[4096];
                                    }
                                    Class68_Sub13_Sub11.aByteArrayArrayArray3622[i_47_][i_46_][(63 + -i_49_ << -872272474) + i_48_] = (byte) i_51_;
                                }
                                if ((i_50_ & 0x2 ^ 0xffffffff) == -3) {
                                    int i_52_ = class68_sub14.readUnsignedWord(1355769544);
                                    if ((Class68_Sub13_Sub11.aShortArrayArrayArray3626[i_47_][i_46_]) == null) {
                                        Class68_Sub13_Sub11.aShortArrayArrayArray3626[i_47_][i_46_] = new short[4096];
                                    }
                                    Class68_Sub13_Sub11.aShortArrayArrayArray3626[i_47_][i_46_][(63 - i_49_ << -167824250) + i_48_] = (short) i_52_;
                                }
                                if ((0x4 & i_50_ ^ 0xffffffff) == -5) {
                                    int i_53_ = ((0xff0000 & (class68_sub14.readUnsignedByte(-6677) << 247340304)) - (-(0xff00 & (class68_sub14.readUnsignedByte(-6677) << -729656856)) + -(class68_sub14.readUnsignedByte(-6677) & 0xff)));
                                    if ((Class68_Sub20_Sub17.anIntArrayArrayArray4442[i_47_][i_46_]) == null) {
                                        Class68_Sub20_Sub17.anIntArrayArrayArray4442[i_47_][i_46_] = new int[4096];
                                    }
                                    Class116 class116 = Class1_Sub5.method140(114, --i_53_);
                                    if (class116.anIntArray1994 != null) {
                                        class116 = class116.method1710(-1);
                                        if (class116 == null || (class116.anInt1980 ^ 0xffffffff) == 0) {
                                            continue;
                                        }
                                    }
                                    Class68_Sub20_Sub17.anIntArrayArrayArray4442[i_47_][i_46_][(63 - i_49_ << 2087320198) + i_48_] = 1 + class116.anInt2031;
                                    Class68_Sub8 class68_sub8 = new Class68_Sub8();
                                    class68_sub8.anInt2878 = class116.anInt1980;
                                    class68_sub8.anInt2869 = i_43_;
                                    class68_sub8.anInt2875 = i_42_;
                                    Class75.aClass16_1343.method286(class68_sub8, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i != 14904) {
            method1323(69, 76, -109, 33, -58, -2, 39, 107, -25);
        }
    }


    static {
        aRSString_3231 = RSString.newRsString("");
        aRSString_3235 = aRSString_3231;
    }
}
