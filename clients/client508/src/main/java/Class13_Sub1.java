/* Class13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class13_Sub1 extends Class13 {
    public static int anInt2620;
    public int anInt2621;
    public static int anInt2622;
    public static int anInt2623;
    public static RSString aRSString_2624;
    public static int anInt2625;
    public static RSString aRSString_2626
            = RSString.newRsString("Loading interfaces )2 ");
    public static Class16 aClass16_2627;
    public int anInt2628;
    public int anInt2629;
    public static int anInt2630;
    public static int anInt2631;
    public static int anInt2632;
    public static RSString aRSString_2633 = aRSString_2626;
    public int anInt2634;
    public static RSString aRSString_2635 = RSString.newRsString("(Z");
    public static int anInt2636;
    public static int anInt2637;
    public static int anInt2638;
    public static int anInt2639;
    public static int anInt2640;

    public static void method246(byte i, int i_0_) {
        Sprite sprite;
        if (GameSocket.aClass68_Sub20_Sub10_1144 == null)
            sprite = new Sprite(512, 512);
        else
            sprite
                    = (Sprite) GameSocket.aClass68_Sub20_Sub10_1144;
        anInt2625++;
        int[] is = sprite.pixels;
        int i_1_ = is.length;
        for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_2_++)
            is[i_2_] = 1;
        for (int i_3_ = 1; (i_3_ ^ 0xffffffff) > -104; i_3_++) {
            int i_4_ = 24628 - -(4 * (52736 + -(512 * i_3_)));
            for (int i_5_ = 1; i_5_ < 103; i_5_++) {
                if ((Class64.aByteArrayArrayArray1178[i_0_][i_5_][i_3_] & 0x18
                        ^ 0xffffffff)
                        == -1)
                    method249(is, i_4_, 512, i_0_, i_5_, i_3_);
                if ((i_0_ ^ 0xffffffff) > -4
                        && ((Class64.aByteArrayArrayArray1178[1 + i_0_][i_5_][i_3_]
                        & 0x8)
                        ^ 0xffffffff) != -1)
                    method249(is, i_4_, 512, 1 + i_0_, i_5_, i_3_);
                i_4_ += 4;
            }
        }
        sprite.method1126();
        if (i != -124)
            method254(-46, false);
        int i_6_ = 238 + ((int) (Math.random() * 20.0) - 10) << -1313258800;
        int i_7_
                = (-10 + (int) (Math.random() * 20.0)
                + (238
                + ((238 + (int) (Math.random() * 20.0) + -10 << -2005976952)
                + (228 - -(int) (20.0 * Math.random()) << 1887366288))));
        for (int i_8_ = 1; (i_8_ ^ 0xffffffff) > -104; i_8_++) {
            for (int i_9_ = 1; (i_9_ ^ 0xffffffff) > -104; i_9_++) {
                if ((0x18 & Class64.aByteArrayArrayArray1178[i_0_][i_9_][i_8_])
                        == 0)
                    Class68_Sub10.method681(i_0_, i_7_, i_9_, i_6_, i_8_,
                            (byte) 91);
                if ((i_0_ ^ 0xffffffff) > -4
                        && (0x8 & (Class64.aByteArrayArrayArray1178[i_0_ - -1]
                        [i_9_][i_8_])
                        ^ 0xffffffff) != -1)
                    Class68_Sub10.method681(1 + i_0_, i_7_, i_9_, i_6_, i_8_,
                            (byte) 92);
            }
        }
        Class52.anInt1006 = 0;
        for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -105; i_10_++) {
            for (int i_11_ = 0; i_11_ < 104; i_11_++) {
                long l = Unknown.method1506(GameSocket.anInt1149, i_10_, i_11_);
                if (l != 0L) {
                    Class116 class116
                            = Class1_Sub5.method140(i + 212,
                            (0x7fffffff
                                    & (int) (l >>> 1113552736)));
                    int i_12_ = class116.anInt1980;
                    if (class116.anIntArray1994 != null) {
                        for (int i_13_ = 0;
                             class116.anIntArray1994.length > i_13_; i_13_++) {
                            if ((class116.anIntArray1994[i_13_] ^ 0xffffffff)
                                    != 0) {
                                Class116 class116_14_
                                        = Class1_Sub5.method140(96,
                                        (class116
                                                .anIntArray1994
                                                [i_13_]));
                                if (class116_14_.anInt1980 >= 0) {
                                    i_12_ = class116_14_.anInt1980;
                                    break;
                                }
                            }
                        }
                    }
                    if (i_12_ >= 0) {
                        int i_15_ = i_11_;
                        int i_16_ = i_10_;
                        if (i_12_ != 22 && i_12_ != 29
                                && (i_12_ ^ 0xffffffff) != -35 && i_12_ != 36
                                && (i_12_ ^ 0xffffffff) != -47
                                && (i_12_ ^ 0xffffffff) != -48 && i_12_ != 48) {
                            int[][] is_17_
                                    = (Class109.aClass38Array1843
                                    [GameSocket.anInt1149].anIntArrayArray681);
                            for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -11;
                                 i_18_++) {
                                int i_19_ = (int) (Math.random() * 4.0);
                                if ((i_19_ ^ 0xffffffff) == -1
                                        && (i_16_ ^ 0xffffffff) < -1
                                        && (i_16_ ^ 0xffffffff) < (i_10_ + -3
                                        ^ 0xffffffff)
                                        && ((is_17_[-1 + i_16_][i_15_] & 0x12c0108)
                                        == 0))
                                    i_16_--;
                                if ((i_19_ ^ 0xffffffff) == -2
                                        && (i_16_ ^ 0xffffffff) > -104
                                        && ((3 + i_10_ ^ 0xffffffff)
                                        < (i_16_ ^ 0xffffffff))
                                        && ((0x12c0180 & is_17_[1 + i_16_][i_15_])
                                        == 0))
                                    i_16_++;
                                if ((i_19_ ^ 0xffffffff) == -3 && i_15_ > 0
                                        && i_15_ > -3 + i_11_
                                        && ((is_17_[i_16_][i_15_ + -1] & 0x12c0102)
                                        == 0))
                                    i_15_--;
                                if ((i_19_ ^ 0xffffffff) == -4 && i_15_ < 103
                                        && i_11_ - -3 > i_15_
                                        && (is_17_[i_16_][i_15_ - -1] & 0x12c0120
                                        ^ 0xffffffff) == -1)
                                    i_15_++;
                            }
                        }
                        Class68_Sub20_Sub19.anIntArray4452[Class52.anInt1006]
                                = class116.anInt2031;
                        Class95.anIntArray1683[Class52.anInt1006] = i_16_;
                        Class113.anIntArray1921[Class52.anInt1006] = i_15_;
                        Class52.anInt1006++;
                    }
                }
            }
        }
        GameSocket.aClass68_Sub20_Sub10_1144 = sprite;
        Class1_Sub5.aClass72_2496.method1358(108);
    }

    public static RSString method247(int i, boolean bool, byte i_20_,
                                     int i_21_) {
        anInt2638++;
        if ((i ^ 0xffffffff) > -3 || i > 36)
            throw new IllegalArgumentException("Invalid radix:" + i);
        int i_22_ = i_21_ / i;
        int i_23_ = 1;
        for (/**/; (i_22_ ^ 0xffffffff) != -1; i_22_ /= i)
            i_23_++;
        int i_24_ = i_23_;
        if (i_21_ < 0 || bool)
            i_24_++;
        byte[] is = new byte[i_24_];
        if (i_21_ >= 0) {
            if (bool)
                is[0] = (byte) 43;
        } else
            is[0] = (byte) 45;
        if (i_20_ != 125)
            method254(120, true);
        for (int i_25_ = 0; (i_23_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff);
             i_25_++) {
            int i_26_ = i_21_ % i;
            i_21_ /= i;
            if ((i_26_ ^ 0xffffffff) > -1)
                i_26_ = -i_26_;
            if ((i_26_ ^ 0xffffffff) < -10)
                i_26_ += 39;
            is[-i_25_ + (i_24_ + -1)] = (byte) (i_26_ + 48);
        }
        RSString class100 = new RSString();
        class100.bytes = is;
        class100.anInt2293 = i_24_;
        return class100;
    }

    public static Class92[] method248(Class21renamed class21, int i, boolean bool,
                                      int i_27_) {
        anInt2622++;
        if (bool != false)
            method247(-21, true, (byte) 121, 82);
        if (!Class68_Sub13_Sub36.method880(-29381, i_27_, class21, i))
            return null;
        return Class21renamed.method328(32568);
    }

    public void method243(int i, int i_28_, int i_29_) {
        anInt2632++;
        int i_30_ = anInt2629 * i >> -567332404;
        if (i_28_ != 23700)
            aRSString_2635 = null;
        int i_31_ = i_29_ * anInt2621 >> 202273740;
        int i_32_ = i * anInt2628 >> 1011932524;
        int i_33_ = anInt2634 * i_29_ >> -1687003508;
        Class68_Sub20_Sub15.method1169(anInt216, i_32_, i_30_, i_31_, i_33_,
                anInt222, anInt220, (byte) -12);
    }

    public static void method249(int[] is, int i, int i_34_, int i_35_,
                                 int i_36_, int i_37_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i_35_][i_36_][i_37_];
        if (class68_sub1 != null) {
            Class7 class7 = class68_sub1.aClass7_2758;
            if (class7 != null) {
                int i_38_ = class7.anInt119;
                if (i_38_ != 0) {
                    for (int i_39_ = 0; i_39_ < 4; i_39_++) {
                        is[i] = i_38_;
                        is[i + 1] = i_38_;
                        is[i + 2] = i_38_;
                        is[i + 3] = i_38_;
                        i += i_34_;
                    }
                }
            } else {
                Class77 class77 = class68_sub1.aClass77_2779;
                if (class77 != null) {
                    int i_40_ = class77.anInt1371;
                    int i_41_ = class77.anInt1376;
                    int i_42_ = class77.anInt1383;
                    int i_43_ = class77.anInt1369;
                    int[] is_44_ = Class124.anIntArrayArray2131[i_40_];
                    int[] is_45_ = Class7.anIntArrayArray130[i_41_];
                    int i_46_ = 0;
                    if (i_42_ != 0) {
                        for (int i_47_ = 0; i_47_ < 4; i_47_++) {
                            is[i]
                                    = is_44_[is_45_[i_46_++]] == 0 ? i_42_ : i_43_;
                            is[i + 1]
                                    = is_44_[is_45_[i_46_++]] == 0 ? i_42_ : i_43_;
                            is[i + 2]
                                    = is_44_[is_45_[i_46_++]] == 0 ? i_42_ : i_43_;
                            is[i + 3]
                                    = is_44_[is_45_[i_46_++]] == 0 ? i_42_ : i_43_;
                            i += i_34_;
                        }
                    } else {
                        for (int i_48_ = 0; i_48_ < 4; i_48_++) {
                            if (is_44_[is_45_[i_46_++]] != 0)
                                is[i] = i_43_;
                            if (is_44_[is_45_[i_46_++]] != 0)
                                is[i + 1] = i_43_;
                            if (is_44_[is_45_[i_46_++]] != 0)
                                is[i + 2] = i_43_;
                            if (is_44_[is_45_[i_46_++]] != 0)
                                is[i + 3] = i_43_;
                            i += i_34_;
                        }
                    }
                }
            }
        }
    }

    public static int method250(RSString class100, int i) {
        anInt2637++;
        if (i >= -104)
            aRSString_2635 = null;
        return class100.method1590((byte) -105) - -1;
    }

    public static void method251(boolean bool) {
        anInt2631++;
        if ((Class32.anInt574 ^ 0xffffffff) == -6) {
            if (bool != false)
                aRSString_2635 = null;
            Class32.anInt574 = 6;
        }
    }

    public void method244(int i, int i_49_, int i_50_) {
        int i_51_ = i_50_ * anInt2629 >> -1941234900;
        anInt2623++;
        int i_52_ = anInt2628 * i_50_ >> 146088972;
        int i_53_ = -30 % ((-49 - i_49_) / 43);
        int i_54_ = anInt2621 * i >> 1243673516;
        int i_55_ = anInt2634 * i >> -1759137172;
        Class58.method581(i_52_, (byte) 63, i_55_, i_54_, i_51_, anInt216);
    }

    public void method245(boolean bool, int i, int i_56_) {
        if (bool == true)
            anInt2640++;
    }

    public static void method252(int i) {
        aRSString_2624 = null;
        aRSString_2635 = null;
        int i_57_ = -84 % ((10 - i) / 38);
        aRSString_2626 = null;
        aClass16_2627 = null;
        aRSString_2633 = null;
    }

    public static void method253(int i) {
        anInt2630++;
        if (Class33.aBoolean587) {
            Class15.aClass92_251 = null;
            if (i != 20)
                aClass16_2627 = null;
            Class33.aBoolean587 = false;
            Class96.aClass68_Sub20_Sub10_1700 = null;
        }
    }

    public static void method254(int i, boolean bool) {
        if (i != -12915)
            method252(47);
        anInt2620++;
        Class49.method524(16322);
        if ((GameException.anInt2231 ^ 0xffffffff) == -31
                || GameException.anInt2231 == 25) {
            Class75_Sub2.anInt3313++;
            if (Class75_Sub2.anInt3313 >= 50 || bool) {
                Class75_Sub2.anInt3313 = 0;
                if (!Class75_Sub3_Sub1.aBoolean4597
                        && PlayerDefinition.connection != null) {
                    Class21renamed.stream.createFrame(115);
                    try {
                        PlayerDefinition.connection.queueBytes(Class21renamed.stream.currentOffset, Class21renamed.stream.buffer);
                        Class21renamed.stream.currentOffset = 0;
                    } catch (java.io.IOException ioexception) {
                        Class75_Sub3_Sub1.aBoolean4597 = true;
                    }
                    Class78.anInt1392++;
                }
                Class49.method524(i + 29237);
            }
        }
    }

    public Class13_Sub1(int i, int i_58_, int i_59_, int i_60_, int i_61_,
                        int i_62_, int i_63_) {
        super(i_61_, i_62_, i_63_);
        anInt2634 = i_60_;
        anInt2628 = i_59_;
        anInt2621 = i_58_;
        anInt2629 = i;
    }

    static {
        aRSString_2624 = RSString.newRsString(")4l=");
        aClass16_2627 = new Class16();
        anInt2639 = 0;
    }
}
