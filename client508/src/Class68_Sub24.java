/* Class68_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub24 extends Class68 {
    public static RSString aRSString_3152;
    public static int anInt3153 = 0;
    public static RSString aRSString_3154
            = RSString.newRsString("Loading textures )2 ");
    public static int anInt3155;
    public static int anInt3156;
    public static int anInt3157;
    public static int anInt3158;
    public static RSString aRSString_3159;
    public static int anInt3160;
    public static int anInt3161;
    public static RSString aRSString_3162;
    public RSString aRSString_3163;

    public static int method1205(int i, int i_0_, Class45 class45) {
        anInt3157++;
        if (class45.anIntArrayArray908 == null
                || ((class45.anIntArrayArray908.length ^ 0xffffffff)
                >= (i ^ 0xffffffff)))
            return -2;
        try {
            if (i_0_ != 20)
                method1208(-10, -70, 84, -119, -48, -79, 2, (byte) -64);
            int[] is = class45.anIntArrayArray908[i];
            int i_1_ = 0;
            int i_2_ = 0;
            int i_3_ = 0;
            for (; ; ) {
                int i_4_ = is[i_1_++];
                int i_5_ = 0;
                int i_6_ = 0;
                if (i_4_ == 0)
                    return i_3_;
                if ((i_4_ ^ 0xffffffff) == -2)
                    i_6_ = Class30.anIntArray548[is[i_1_++]];
                if ((i_4_ ^ 0xffffffff) == -16)
                    i_5_ = 1;
                if ((i_4_ ^ 0xffffffff) == -3)
                    i_6_ = Class88.anIntArray1603[is[i_1_++]];
                if (i_4_ == 16)
                    i_5_ = 2;
                if ((i_4_ ^ 0xffffffff) == -18)
                    i_5_ = 3;
                if ((i_4_ ^ 0xffffffff) == -4)
                    i_6_ = Class1_Sub5.anIntArray2516[is[i_1_++]];
                if (i_4_ == 4) {
                    int i_7_ = is[i_1_++] << -1088096752;
                    i_7_ += is[i_1_++];
                    Class45 class45_8_
                            = Class68_Sub20_Sub15.method1170(i_7_, (byte) -80);
                    int i_9_ = is[i_1_++];
                    if (i_9_ != -1
                            && (!Applet_Sub1.method18(-25672, i_9_).aBoolean371
                            || Class1_Sub7.aBoolean2612)) {
                        for (int i_10_ = 0;
                             class45_8_.anIntArray795.length > i_10_;
                             i_10_++) {
                            if (1 + i_9_ == class45_8_.anIntArray795[i_10_])
                                i_6_ += class45_8_.anIntArray774[i_10_];
                        }
                    }
                }
                if (i_4_ == 5)
                    i_6_ = Class103.anIntArray1767[is[i_1_++]];
                if ((i_4_ ^ 0xffffffff) == -7)
                    i_6_ = (GameSocket.anIntArray1128
                            [Class88.anIntArray1603[is[i_1_++]] + -1]);
                if ((i_4_ ^ 0xffffffff) == -8)
                    i_6_ = Class103.anIntArray1767[is[i_1_++]] * 100 / 46875;
                if ((i_4_ ^ 0xffffffff) == -9)
                    i_6_ = Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt3415;
                if (i_4_ == 9) {
                    for (int i_11_ = 0; i_11_ < 25; i_11_++) {
                        if (Class26.aBooleanArray522[i_11_])
                            i_6_ += Class88.anIntArray1603[i_11_];
                    }
                }
                if ((i_4_ ^ 0xffffffff) == -11) {
                    int i_12_ = is[i_1_++] << -562088496;
                    i_12_ += is[i_1_++];
                    Class45 class45_13_
                            = Class68_Sub20_Sub15.method1170(i_12_, (byte) -80);
                    int i_14_ = is[i_1_++];
                    if ((i_14_ ^ 0xffffffff) != 0
                            && (!Applet_Sub1.method18(-25672, i_14_).aBoolean371
                            || Class1_Sub7.aBoolean2612)) {
                        for (int i_15_ = 0;
                             i_15_ < class45_13_.anIntArray795.length;
                             i_15_++) {
                            if (1 + i_14_
                                    == class45_13_.anIntArray795[i_15_]) {
                                i_6_ = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (i_4_ == 11)
                    i_6_ = Class68_Sub20_Sub9.anInt4295;
                if (i_4_ == 12)
                    i_6_ = Class75_Sub3.anInt3330;
                if ((i_4_ ^ 0xffffffff) == -14) {
                    int i_16_ = Class103.anIntArray1767[is[i_1_++]];
                    int i_17_ = is[i_1_++];
                    i_6_ = (1 << i_17_ & i_16_) != 0 ? 1 : 0;
                }
                if ((i_4_ ^ 0xffffffff) == -15) {
                    int i_18_ = is[i_1_++];
                    i_6_ = Class18.method300(i_18_, false);
                }
                if ((i_4_ ^ 0xffffffff) == -19)
                    i_6_ = (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561
                            >> -879491993) - -Class36.anInt643;
                if (i_4_ == 19)
                    i_6_ = (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                            >> 329773287) + Class68_Sub13_Sub35.anInt4026;
                if (i_4_ == 20)
                    i_6_ = is[i_1_++];
                if ((i_5_ ^ 0xffffffff) != -1)
                    i_2_ = i_5_;
                else {
                    if (i_2_ == 0)
                        i_3_ += i_6_;
                    if (i_2_ == 1)
                        i_3_ -= i_6_;
                    if (i_2_ == 2 && (i_6_ ^ 0xffffffff) != -1)
                        i_3_ /= i_6_;
                    if (i_2_ == 3)
                        i_3_ *= i_6_;
                    i_2_ = 0;
                }
            }
        } catch (Exception exception) {
            return -1;
        }
    }

    public static void method1206(int i) {
        anInt3155++;
        synchronized (Class66.aClass123_1200) {
            Class70.anInt1281 = Class75_Sub1_Sub1.anInt4590;
            Class33.anInt590++;
            if ((Class33.anInt576 ^ 0xffffffff) > -1) {
                for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -113; i_19_++)
                    Class128.aBooleanArray2228[i_19_] = false;
                Class33.anInt576 = Class124.anInt2164;
            } else {
                while ((Class33.anInt576 ^ 0xffffffff)
                        != (Class124.anInt2164 ^ 0xffffffff)) {
                    int i_20_ = Class90.anIntArray2335[Class124.anInt2164];
                    Class124.anInt2164 = 1 + Class124.anInt2164 & 0x7f;
                    if (i_20_ >= 0)
                        Class128.aBooleanArray2228[i_20_] = true;
                    else
                        Class128.aBooleanArray2228[i_20_ ^ 0xffffffff] = false;
                }
            }
            Class75_Sub1_Sub1.anInt4590 = Class9.anInt177;
        }
        int i_21_ = 10 / ((i - 91) / 35);
    }

    public static void method1207(byte i) {
        aRSString_3159 = null;
        if (i != -69)
            aRSString_3152 = null;
        aRSString_3162 = null;
        aRSString_3154 = null;
        aRSString_3152 = null;
    }

    public static void method1208(int i, int i_22_, int i_23_, int i_24_,
                                  int i_25_, int i_26_, int i_27_,
                                  byte i_28_) {
        anInt3161++;
        int i_29_ = 2048 - i_27_ & 0x7ff;
        int i_30_ = -i_22_ + 2048 & 0x7ff;
        if (i_28_ > 26) {
            int i_31_ = 0;
            int i_32_ = i_25_;
            if (i_29_ != 0) {
                int i_33_ = Class62.anIntArray1155[i_29_];
                int i_34_ = Class62.anIntArray1167[i_29_];
                i_31_ = i_33_ * -i_32_ >> 334715760;
                i_32_ = i_32_ * i_34_ >> -1203448176;
            }
            int i_35_ = 0;
            if ((i_30_ ^ 0xffffffff) != -1) {
                int i_36_ = Class62.anIntArray1155[i_30_];
                i_35_ = i_32_ * i_36_ >> -111120368;
                int i_37_ = Class62.anIntArray1167[i_30_];
                i_32_ = i_37_ * i_32_ >> -1690074768;
            }
            Class74.anInt1333 = i_22_;
            Canvas_Sub1.anInt45 = i_27_;
            Class68_Sub5.anInt2833 = -i_31_ + i_24_;
            Class68_Sub7.anInt2862 = -i_35_ + i_23_;
            Class85.anInt1558 = -i_32_ + i_26_;
        }
    }

    public static int method1209(int i, int i_38_, int i_39_) {
        anInt3156++;
        if (i != 0)
            return -119;
        long l = (long) (i_38_ + (i_39_ << -1252810064));
        if (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811 == null
                || (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811.aLong1218
                ^ 0xffffffffffffffffL) != (l ^ 0xffffffffffffffffL))
            return 0;
        return ((Class123.aStream_2128.currentOffset * 99
                / (-Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811.aByte4391
                + Class123.aStream_2128.buffer.length))
                + 1);
    }

    public Class68_Sub24() {
        /* empty */
    }

    public Class68_Sub24(RSString class100, int i) {
        aRSString_3163 = class100;
    }

    static {
        aRSString_3152 = aRSString_3154;
        aRSString_3159 = RSString.newRsString("http:)4)4");
        aRSString_3162 = RSString.newRsString("settings");
    }
}
