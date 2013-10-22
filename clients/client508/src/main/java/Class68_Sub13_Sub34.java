/* Class68_Sub13_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub34 extends Class68_Sub13 {
    public static int anInt4002;
    public static int anInt4003;
    public static RSString aRSString_4004
            = RSString.newRsString("::fpsoff");
    public static int anInt4005;
    public static int anInt4006;
    public static int anInt4007;
    public static int anInt4008 = 0;
    public static int anInt4009;
    public static int anInt4010;
    public static int anInt4011;
    public static int[] anIntArray4012;
    public static int anInt4013 = -2;
    public static RSString aRSString_4014;
    public static int anInt4015;

    public static boolean method869(int i, byte i_0_) {
        anInt4003++;
        if (i < 32)
            return false;
        if (i == 127)
            return false;
        if (i_0_ > -34)
            anInt4008 = 46;
        if ((i ^ 0xffffffff) <= -130 && (i ^ 0xffffffff) >= -160)
            return false;
        return true;
    }

    public static void method870(int i) {
        for (Class68_Sub18 class68_sub18
                     = (Class68_Sub18) Class8.aClass16_140.method293((byte) 76);
             class68_sub18 != null;
             class68_sub18
                     = (Class68_Sub18) Class8.aClass16_140.method290((byte) 58)) {
            if (class68_sub18.aBoolean3061)
                class68_sub18.method993(31506);
        }
        if (i != 2)
            method874(-53);
        for (Class68_Sub18 class68_sub18
                     = (Class68_Sub18) Class51.aClass16_2251.method293((byte) 76);
             class68_sub18 != null;
             class68_sub18 = ((Class68_Sub18)
                     Class51.aClass16_2251.method290((byte) 60))) {
            if (class68_sub18.aBoolean3061)
                class68_sub18.method993(i + 31504);
        }
        anInt4009++;
    }

    public static int method871(int i, int i_1_) {
        i_1_ = i_1_ * (i & 0x7f) >> 7;
        if (i_1_ < 2)
            i_1_ = 2;
        else if (i_1_ > 126)
            i_1_ = 126;
        return (i & 0xff80) + i_1_;
    }

    public int[] method698(byte i, int i_2_) {
        if (i != -61)
            return null;
        int[] is = aClass115_2936.method1697(false, i_2_);
        if (aClass115_2936.aBoolean1957) {
            int[] is_3_ = this.method696(0, i_2_, 29149);
            int[] is_4_ = this.method696(1, i_2_, 29149);
            int[] is_5_ = this.method696(2, i_2_, 29149);
            for (int i_6_ = 0; i_6_ < Class68_Sub13_Sub19.anInt3746; i_6_++) {
                int i_7_ = is_5_[i_6_];
                if (i_7_ == 4096)
                    is[i_6_] = is_3_[i_6_];
                else if ((i_7_ ^ 0xffffffff) != -1)
                    is[i_6_]
                            = (is_4_[i_6_] * (-i_7_ + 4096) + i_7_ * is_3_[i_6_]
                            >> -21906292);
                else
                    is[i_6_] = is_4_[i_6_];
            }
        }
        anInt4007++;
        return is;
    }

    public int[][] method697(int i, boolean bool) {
        if (bool != true)
            method697(-2, true);
        int[][] is = aClass88_2939.method1496(i, (byte) -118);
        if (aClass88_2939.aBoolean1610) {
            int[] is_8_ = this.method696(2, i, 29149);
            int[][] is_9_ = this.method699(-67, 0, i);
            int[][] is_10_ = this.method699(-114, 1, i);
            int[] is_11_ = is[2];
            int[] is_12_ = is[0];
            int[] is_13_ = is[1];
            int[] is_14_ = is_9_[0];
            int[] is_15_ = is_9_[1];
            int[] is_16_ = is_9_[2];
            int[] is_17_ = is_10_[0];
            int[] is_18_ = is_10_[1];
            int[] is_19_ = is_10_[2];
            for (int i_20_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_20_ ^ 0xffffffff)); i_20_++) {
                int i_21_ = is_8_[i_20_];
                if ((i_21_ ^ 0xffffffff) != -4097) {
                    if ((i_21_ ^ 0xffffffff) == -1) {
                        is_12_[i_20_] = is_17_[i_20_];
                        is_13_[i_20_] = is_18_[i_20_];
                        is_11_[i_20_] = is_19_[i_20_];
                    } else {
                        int i_22_ = 4096 - i_21_;
                        is_12_[i_20_]
                                = (is_17_[i_20_] * i_22_ + i_21_ * is_14_[i_20_]
                                >> -223121748);
                        is_13_[i_20_]
                                = (is_18_[i_20_] * i_22_ + is_15_[i_20_] * i_21_
                                >> -1128653428);
                        is_11_[i_20_]
                                = (i_21_ * is_16_[i_20_] - -(i_22_ * is_19_[i_20_])
                                >> -66343540);
                    }
                } else {
                    is_12_[i_20_] = is_14_[i_20_];
                    is_13_[i_20_] = is_15_[i_20_];
                    is_11_[i_20_] = is_16_[i_20_];
                }
            }
        }
        anInt4015++;
        return is;
    }

    public static boolean method872(int i) {
        anInt4005++;
        if (i != 0)
            anIntArray4012 = null;
        try {
            if ((Class70.anInt1287 ^ 0xffffffff) == -3) {
                if (client.aClass68_Sub12_2379 == null) {
                    client.aClass68_Sub12_2379
                            = Class68_Sub12.method686((GameException
                            .aClass21_2236),
                            (Class68_Sub20_Sub15
                                    .anInt4403),
                            Class105.anInt1794);
                    if (client.aClass68_Sub12_2379 == null)
                        return false;
                }
                if (Class93.aClass14_1667 == null)
                    Class93.aClass14_1667
                            = new Class14(Class68_Sub20_Sub8.aClass21_4279,
                            Class83.aClass21_1529);
                if (Class1_Sub2.aClass68_Sub28_Sub1_2433.method1235
                        ((byte) -70, client.aClass68_Sub12_2379,
                                Class93.aClass14_1667, 22050, Class125.aClass21_2170)) {
                    Class1_Sub2.aClass68_Sub28_Sub1_2433.method1236((byte) 84);
                    Class1_Sub2.aClass68_Sub28_Sub1_2433
                            .method1239((byte) -126, Class67.anInt1217);
                    Class1_Sub2.aClass68_Sub28_Sub1_2433.method1259
                            (Class52.aBoolean998, true,
                                    client.aClass68_Sub12_2379);
                    GameException.aClass21_2236 = null;
                    client.aClass68_Sub12_2379 = null;
                    Class70.anInt1287 = 0;
                    Class93.aClass14_1667 = null;
                    return true;
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Class1_Sub2.aClass68_Sub28_Sub1_2433.method1249(73);
            GameException.aClass21_2236 = null;
            client.aClass68_Sub12_2379 = null;
            Class70.anInt1287 = 0;
            Class93.aClass14_1667 = null;
        }
        return false;
    }

    public static void method873(int i) {
        aRSString_4004 = null;
        aRSString_4014 = null;
        if (i != -26774)
            method871(-65, -93);
        anIntArray4012 = null;
    }

    public static void method874(int i) {
        Class68_Sub13_Sub21.anInt3803 = 0;
        Class68_Sub20.anInt3086 = -1;
        Class49.anInt962 = -1;
        Class104.anInt1784 = 0;
        anInt4010++;
        Class106.anInt1804 = 0;
        Class68_Sub20_Sub6.anInt4240 = -1;
        Class68_Sub20_Sub13.anInt4368 = 0;
        Class120.aBoolean2099 = false;
        Class68_Sub20_Sub7.anInt4252 = -1;
        Class68_Sub9.anInt2882 = 0;
        if (i == 2) {
            Class95.anInt1684 = 0;
            Class21renamed.stream.currentOffset = 0;
            Class68_Sub13_Sub8.inStream.currentOffset = 0;
            for (int i_23_ = 0;
                 ((Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483.length
                         ^ 0xffffffff)
                         < (i_23_ ^ 0xffffffff));
                 i_23_++) {
                if (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_23_]
                        != null)
                    Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_23_]
                            .anInt2525
                            = -1;
            }
            for (int i_24_ = 0;
                 Class102.aClass1_Sub6_Sub1Array1746.length > i_24_; i_24_++) {
                if (Class102.aClass1_Sub6_Sub1Array1746[i_24_] != null)
                    Class102.aClass1_Sub6_Sub1Array1746[i_24_].anInt2525 = -1;
            }
            Login.method1469(i ^ 0x7e);
            Class128.anInt2214 = 1;
            Class17.method296(30, (byte) -68);
            for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -101; i_25_++)
                Class121.aBooleanArray2109[i_25_] = true;
            Class30.aClass16_541.method284(105);
            Class68_Sub20_Sub6.method1071((byte) -118);
        }
    }

    public static void method875(byte i) {
        Class30.aClass68_Sub20_Sub16_540 = null;
        Class68_Sub13_Sub11.aShortArrayArrayArray3626 = null;
        Class68_Sub13_Sub16.aByteArrayArrayArray3710 = null;
        Class57.anInt1080 = 0;
        Class68.aClass45_1231 = null;
        Class12.aByteArrayArrayArray212 = null;
        anInt4006++;
        Class33.anIntArrayArrayArray584 = null;
        Class49.aByteArrayArrayArray970 = null;
        Class68_Sub13_Sub11.aByteArrayArrayArray3622 = null;
        Class48.aByteArrayArrayArray949 = null;
        Class68_Sub20_Sub17.anIntArrayArrayArray4442 = null;
        Class121.anIntArray2104 = null;
        Class75.aClass16_1343.method284(i ^ 0x5);
        Class72.aClass65_1305 = null;
        Class75.aClass65_1344 = null;
        Class102.aClass91_1756 = null;
        Class68_Sub16.aClass65_3031 = null;
        Class68_Sub10.aClass65_2912 = null;
        Class55.aClass65_2036 = null;
        Class104.aClass65_1787 = null;
        Animable.aClass68_Sub20_Sub10_59 = null;
        Class68_Sub20_Sub16.aClass65_4417 = null;
        if (i != 108)
            method869(-15, (byte) 46);
        Class68_Sub13_Sub27.aClass65_3912 = null;
    }

    public void method700(Stream class68_sub14, int i, int i_26_) {
        if (i_26_ != -1)
            method872(111);
        if (i == 0)
            aBoolean2931 = class68_sub14.readUnsignedByte(i_26_ + -6676) == 1;
        anInt4002++;
    }

    public Class68_Sub13_Sub34() {
        super(3, false);
    }

    static {
        anIntArray4012 = new int[32];
        aRSString_4014
                = (RSString.newRsString
                (
                        "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q"));
    }
}
