/* Class68_Sub13_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub33 extends Class68_Sub13 {
    public static RSString aRSString_3987;
    public static int anInt3988;
    public static int anInt3989;
    public static int anInt3990;
    public static PlayerDefinition aClass126_3991;
    public static int anInt3992;
    public static int anInt3993;
    public static int anInt3994;
    public static int anInt3995;
    public static RSString aRSString_3996
            = RSString.newRsString("Walk here");
    public static int anInt3997;
    public int anInt3998 = 32768;
    public static Class114 aClass114_3999;
    public static boolean aBoolean4000;
    public static int anInt4001;

    public int[] method698(byte i, int i_0_) {
        int[] is = aClass115_2936.method1697(false, i_0_);
        anInt3994++;
        if (aClass115_2936.aBoolean1957) {
            int[] is_1_ = this.method696(1, i_0_, i + 29210);
            int[] is_2_ = this.method696(2, i_0_, 29149);
            for (int i_3_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_3_ ^ 0xffffffff)); i_3_++) {
                int i_4_ = 0xff & is_1_[i_3_] >> 1702924836;
                int i_5_ = anInt3998 * is_2_[i_3_] >> -763540564;
                int i_6_ = Class78.anIntArray1394[i_4_] * i_5_ >> -1251440436;
                int i_7_ = Class30.anInt543 & (i_6_ >> -1031310292) + i_3_;
                int i_8_ = i_5_ * Class118.anIntArray2077[i_4_] >> 2095166508;
                int i_9_
                        = Class1_Sub6_Sub2.anInt3432 & (i_8_ >> -552194164) + i_0_;
                int[] is_10_ = this.method696(0, i_9_, i ^ ~0x71e1);
                is[i_3_] = is_10_[i_7_];
            }
        }
        if (i != -61)
            method865((byte) -71, true);
        return is;
    }

    public static void method865(byte i, boolean bool) {
        anInt3992++;
        int i_11_ = 4;
        byte[][] is = Class68_Sub20_Sub11.aByteArrayArray4332;
        if (i >= -8)
            method866(68);
        for (int i_12_ = 0; (i_11_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
             i_12_++) {
            Class49.method524(16322);
            for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -14; i_13_++) {
                for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -14; i_14_++) {
                    int i_15_ = (Class68_Sub2.anIntArrayArrayArray2796[i_12_]
                            [i_13_][i_14_]);
                    if (i_15_ != -1) {
                        int i_16_ = (0x397e498 & i_15_) >> 1887294840;
                        if (!bool || (i_16_ ^ 0xffffffff) == -1) {
                            int i_17_ = i_15_ >> 741895745 & 0x3;
                            int i_18_ = 0x3ff & i_15_ >> 613354350;
                            int i_19_ = i_15_ >> -1395382493 & 0x7ff;
                            int i_20_ = i_19_ / 8 + (i_18_ / 8 << -637017144);
                            for (int i_21_ = 0;
                                 ((i_21_ ^ 0xffffffff)
                                         > (Class119.anIntArray2089.length
                                         ^ 0xffffffff));
                                 i_21_++) {
                                if (i_20_ == Class119.anIntArray2089[i_21_]
                                        && is[i_21_] != null) {
                                    GameException.method1797
                                            (i_12_, bool, 8 * (0x7 & i_19_),
                                                    8 * i_13_, i_17_, (i_18_ & 0x7) * 8,
                                                    is[i_21_], i_16_,
                                                    Class109.aClass38Array1843, 73,
                                                    i_14_ * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void method690(byte i) {
        anInt3990++;
        Class68_Sub10.method683((byte) 96);
        if (i > -22)
            anInt4001 = 51;
    }

    public Class68_Sub13_Sub33() {
        super(3, false);
    }

    public void method700(Stream class68_sub14, int i, int i_22_) {
        if (i_22_ != -1)
            aRSString_3996 = null;
        int i_23_ = i;
        do {
            if (i_23_ != 0) {
                if ((i_23_ ^ 0xffffffff) != -2)
                    break;
            } else {
                anInt3998 = class68_sub14.readUnsignedWord(1355769544) << -1461083036;
                break;
            }
            aBoolean2931 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
        } while (false);
        anInt3988++;
    }

    public static void method866(int i) {
        aClass126_3991 = null;
        if (i <= -3) {
            aClass114_3999 = null;
            aRSString_3996 = null;
            aRSString_3987 = null;
        }
    }

    public static void method867(int i, int i_24_, int i_25_, int i_26_,
                                 int i_27_, int i_28_, boolean bool) {
        Stream.anInt2954 = i;
        Class125.anInt2167 = i_26_;
        Class68_Sub13_Sub31.anInt3977 = i_28_;
        anInt3989++;
        if (i_27_ >= -83)
            method868(-36, 33, 16);
        Class68_Sub13_Sub37.anInt4067 = i_24_;
        Class68_Sub24.anInt3160 = i_25_;
        if (bool && (Class68_Sub24.anInt3160 ^ 0xffffffff) <= -101) {
            Class85.anInt1558 = 64 + 128 * Class68_Sub13_Sub37.anInt4067;
            Class68_Sub7.anInt2862 = 64 + 128 * Stream.anInt2954;
            Class68_Sub5.anInt2833
                    = (Class1_Sub6_Sub2.method163(Class68_Sub7.anInt2862,
                    GameSocket.anInt1149,
                    Class85.anInt1558, false)
                    + -Class68_Sub13_Sub31.anInt3977);
        }
        Class128.anInt2214 = 2;
    }

    public static void method868(int i, int i_29_, int i_30_) {
        anInt3995++;
        int i_31_ = 0;
        if (i_30_ <= 54)
            aClass114_3999 = null;
        for (/**/; i_31_ < Class112.anInt1879; i_31_++) {
            Class9 class9 = Class94.method1541((byte) 53, i_31_);
            if (class9 != null) {
                int i_32_ = class9.anInt175;
                if (i_32_ >= 0
                        && !Class62.anInterface4_1159.method8((byte) 39, i_32_))
                    i_32_ = -1;
                int i_33_;
                if (class9.anInt172 < 0) {
                    if ((i_32_ ^ 0xffffffff) <= -1)
                        i_33_ = (Class62.anIntArray1158
                                [Class53.method547((byte) -91,
                                Class62
                                        .anInterface4_1159
                                        .method12(i_32_, 102),
                                96)]);
                    else if (class9.anInt168 == -1)
                        i_33_ = -1;
                    else {
                        int i_34_ = class9.anInt168;
                        int i_35_ = i + (0x7f & i_34_);
                        if ((i_35_ ^ 0xffffffff) > -1)
                            i_35_ = 0;
                        else if (i_35_ > 127)
                            i_35_ = 127;
                        int i_36_ = i_35_ + ((i_34_ - -i_29_ & 0xfc00)
                                + (0x380 & i_34_));
                        i_33_ = (Class62.anIntArray1158
                                [Class53.method547((byte) -91, i_36_, 96)]);
                    }
                } else {
                    int i_37_ = class9.anInt172;
                    int i_38_ = (0x7f & i_37_) - -i;
                    if ((i_38_ ^ 0xffffffff) > -1)
                        i_38_ = 0;
                    else if ((i_38_ ^ 0xffffffff) < -128)
                        i_38_ = 127;
                    int i_39_
                            = (0x380 & i_37_) + ((0xfc00 & i_29_ + i_37_) + i_38_);
                    i_33_
                            = Class62.anIntArray1158[Class53.method547((byte) -91,
                            i_39_, 96)];
                }
                Class121.anIntArray2104[1 + i_31_] = i_33_;
            }
        }
    }

    public int[][] method697(int i, boolean bool) {
        anInt3993++;
        if (bool != true)
            aClass114_3999 = null;
        int[][] is = aClass88_2939.method1496(i, (byte) -115);
        if (aClass88_2939.aBoolean1610) {
            int[] is_40_ = this.method696(1, i, 29149);
            int[] is_41_ = this.method696(2, i, 29149);
            int[] is_42_ = is[0];
            int[] is_43_ = is[1];
            int[] is_44_ = is[2];
            for (int i_45_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_45_ ^ 0xffffffff)); i_45_++) {
                int i_46_ = (is_40_[i_45_] * 255 & 0xff0d5) >> -1042073652;
                int i_47_ = anInt3998 * is_41_[i_45_] >> 510089036;
                int i_48_
                        = i_47_ * Class78.anIntArray1394[i_46_] >> 2120473804;
                int i_49_ = Class30.anInt543 & i_45_ + (i_48_ >> 904924492);
                int i_50_
                        = Class118.anIntArray2077[i_46_] * i_47_ >> 1212368844;
                int i_51_
                        = Class1_Sub6_Sub2.anInt3432 & i + (i_50_ >> -1177106676);
                int[][] is_52_ = this.method699(-57, 0, i_51_);
                is_42_[i_45_] = is_52_[0][i_49_];
                is_43_[i_45_] = is_52_[1][i_49_];
                is_44_[i_45_] = is_52_[2][i_49_];
            }
        }
        return is;
    }

    static {
        aRSString_3987 = aRSString_3996;
        aClass126_3991 = new PlayerDefinition();
        aClass114_3999 = new Class114();
        aBoolean4000 = false;
    }
}
