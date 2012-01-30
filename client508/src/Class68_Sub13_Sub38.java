/* Class68_Sub13_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub38 extends Class68_Sub13 {
    public static int anInt4078;
    public static int anInt4079;
    public static int anInt4080;
    public static int anInt4081;
    public static int anInt4082;
    public static int anInt4083;
    public static RSString[] aRSStringArray4084 = new RSString[200];
    public static int anInt4085;
    public int anInt4086 = 585;
    public static int anInt4087;
    public static int anInt4088;
    public static int anInt4089;

    public static int method895(int i, boolean bool, int i_0_) {
        if (bool != true)
            return 53;
        anInt4087++;
        int i_1_
                = (-128
                + Class1_Sub6_Sub1.method156(4, i_0_ + 45365, 91923 + i, -1)
                + ((-128 + Class1_Sub6_Sub1.method156(2, 10294 + i_0_,
                37821 + i, -1)
                >> -984476159)
                - -(Class1_Sub6_Sub1.method156(1, i_0_, i, -1) + -128
                >> 1128606402)));
        i_1_ = (int) ((double) i_1_ * 0.3) - -35;
        if (i_1_ >= 10) {
            if (i_1_ > 60)
                i_1_ = 60;
        } else
            i_1_ = 10;
        return i_1_;
    }

    public static void method896(byte i) {
        if (i != -65)
            anInt4082 = -70;
        aRSStringArray4084 = null;
    }

    public static Class68_Sub20_Sub10[] method897(byte i) {
        if (i != 15)
            method900(91, 31);
        anInt4085++;
        Class68_Sub20_Sub10[] class68_sub20_sub10s
                = new Class68_Sub20_Sub10[Stream.anInt3007];
        for (int i_2_ = 0;
             (i_2_ ^ 0xffffffff) > (Stream.anInt3007 ^ 0xffffffff);
             i_2_++) {
            byte[] is = Class69.aByteArrayArray1240[i_2_];
            int i_3_ = (Class68_Sub13_Sub12.anIntArray3639[i_2_]
                    * Class68_Sub13_Sub19.anIntArray3757[i_2_]);
            if (Class68_Sub10.aBooleanArray2905[i_2_]) {
                byte[] is_4_ = Class3.aByteArrayArray78[i_2_];
                int[] is_5_ = new int[i_3_];
                for (int i_6_ = 0; (i_3_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
                     i_6_++)
                    is_5_[i_6_]
                            = (Class70.method1335
                            (Class120.method1740(is_4_[i_6_] << 1514024664,
                                    -16777216),
                                    (Class68_Sub13_Sub17.anIntArray3719
                                            [Class120.method1740(255, is[i_6_])])));
                class68_sub20_sub10s[i_2_]
                        = (new Sprite_Sub1
                        (Class97.anInt1703, Class68_Sub20_Sub15.anInt4405,
                                Class4.anIntArray96[i_2_],
                                Class116.anIntArray1996[i_2_],
                                Class68_Sub13_Sub12.anIntArray3639[i_2_],
                                Class68_Sub13_Sub19.anIntArray3757[i_2_], is_5_));
            } else {
                int[] is_7_ = new int[i_3_];
                for (int i_8_ = 0; i_8_ < i_3_; i_8_++)
                    is_7_[i_8_] = (Class68_Sub13_Sub17.anIntArray3719
                            [Class120.method1740(is[i_8_], 255)]);
                class68_sub20_sub10s[i_2_]
                        = (new Sprite
                        (Class97.anInt1703, Class68_Sub20_Sub15.anInt4405,
                                Class4.anIntArray96[i_2_],
                                Class116.anIntArray1996[i_2_],
                                Class68_Sub13_Sub12.anIntArray3639[i_2_],
                                Class68_Sub13_Sub19.anIntArray3757[i_2_], is_7_));
            }
        }
        Class87.method1487((byte) -93);
        return class68_sub20_sub10s;
    }

    public static void method898(Class21renamed class21, Class21renamed class21_9_,
                                 Interface2 interface2, byte i) {
        do {
            try {
                anInt4089++;
                Class13_Sub3.aClass21_2671 = class21_9_;
                Class37.anInterface2_649 = interface2;
                Class92.aClass21_1652 = class21;
                if (i == -117)
                    break;
                anInt4082 = 54;
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652
                        (runtimeexception,
                                ("vi.F(" + (class21 != null ? "{...}" : "null")
                                        + ',' + (class21_9_ != null ? "{...}" : "null")
                                        + ',' + (interface2 != null ? "{...}" : "null")
                                        + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    public static void method899(int i, Class21renamed class21, boolean bool,
                                 int i_10_, int i_11_, boolean bool_12_) {
        GameException.aClass21_2236 = class21;
        Class70.anInt1287 = 1;
        Class68_Sub13_Sub11.anInt3620 = 10000;
        Class68_Sub20_Sub15.anInt4403 = i;
        if (bool != false)
            anInt4079 = -46;
        Class52.aBoolean998 = bool_12_;
        Class67.anInt1217 = i_11_;
        Class105.anInt1794 = i_10_;
        anInt4083++;
    }

    public Class68_Sub13_Sub38() {
        super(0, true);
    }

    public static void method900(int i, int i_13_) {
        Class30.aClass16_541.method286(new Class68_Sub10(i_13_), true);
        anInt4078++;
        int i_14_ = 86 % ((71 - i) / 53);
    }

    public void method700(Stream class68_sub14, int i, int i_15_) {
        anInt4081++;
        if (i_15_ != -1)
            anInt4079 = 59;
        int i_16_ = i;
        if (i_16_ == 0)
            anInt4086 = class68_sub14.readUnsignedWord(1355769544);
    }

    public int[] method698(byte i, int i_17_) {
        if (i != -61)
            anInt4079 = -34;
        int[] is = aClass115_2936.method1697(false, i_17_);
        if (aClass115_2936.aBoolean1957) {
            int i_18_ = Class13_Sub3.anIntArray2672[i_17_];
            for (int i_19_ = 0; i_19_ < Class68_Sub13_Sub19.anInt3746;
                 i_19_++) {
                int i_20_ = Class68_Sub13_Sub3.anIntArray3479[i_19_];
                if (i_20_ > anInt4086
                        && (i_20_ ^ 0xffffffff) > (-anInt4086 + 4096 ^ 0xffffffff)
                        && (i_18_ ^ 0xffffffff) < (2048 - anInt4086 ^ 0xffffffff)
                        && (i_18_ ^ 0xffffffff) > (2048 + anInt4086
                        ^ 0xffffffff)) {
                    int i_21_ = -i_20_ + 2048;
                    i_21_ = i_21_ >= 0 ? i_21_ : -i_21_;
                    i_21_ <<= 12;
                    i_21_ /= 2048 - anInt4086;
                    is[i_19_] = -i_21_ + 4096;
                } else if (2048 - anInt4086 < i_20_
                        && (i_20_ ^ 0xffffffff) > (anInt4086 + 2048
                        ^ 0xffffffff)) {
                    int i_22_ = -2048 + i_18_;
                    i_22_ = i_22_ < 0 ? -i_22_ : i_22_;
                    i_22_ -= anInt4086;
                    i_22_ <<= 12;
                    is[i_19_] = i_22_ / (2048 + -anInt4086);
                } else if ((anInt4086 ^ 0xffffffff) < (i_18_ ^ 0xffffffff)
                        || -anInt4086 + 4096 < i_18_) {
                    int i_23_ = -2048 + i_20_;
                    i_23_ = (i_23_ ^ 0xffffffff) <= -1 ? i_23_ : -i_23_;
                    i_23_ -= anInt4086;
                    i_23_ <<= 12;
                    is[i_19_] = i_23_ / (-anInt4086 + 2048);
                } else if (i_20_ < anInt4086 || 4096 - anInt4086 < i_20_) {
                    int i_24_ = -i_18_ + 2048;
                    i_24_ = i_24_ < 0 ? -i_24_ : i_24_;
                    i_24_ <<= 12;
                    i_24_ /= -anInt4086 + 2048;
                    is[i_19_] = 4096 + -i_24_;
                } else
                    is[i_19_] = 0;
            }
        }
        anInt4088++;
        return is;
    }
}
