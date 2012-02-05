/* Class68_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub16 extends Class68 {
    public byte[] aByteArray3021;
    public static int anInt3022;
    public static int anInt3023;
    public static Class105 aClass105_3024;
    public static int anInt3025;
    public static RSString aRSString_3026
            = RSString.newRsString("wishes to trade with you)3");
    public static RSString aRSString_3027 = aRSString_3026;
    public static Class103 aClass103_3028;
    public static int[] anIntArray3029;
    public static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array3030;
    public static Class65 aClass65_3031;

    public static void method983(Class7 class7, int i, int i_0_, int i_1_,
                                 int i_2_, int i_3_, int i_4_, int i_5_,
                                 boolean bool) {
        int i_7_;
        int i_6_ = i_7_ = (i_4_ << 7) - Class25.anInt518;
        int i_9_;
        int i_8_ = i_9_ = (i_5_ << 7) - Class68_Sub20_Sub12.anInt4355;
        int i_11_;
        int i_10_ = i_11_ = i_6_ + 128;
        int i_13_;
        int i_12_ = i_13_ = i_8_ + 128;
        int i_14_
                = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i][i_4_][i_5_]
                - Class68_Sub17.anInt3033);
        int i_15_
                = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i][i_4_ + 1][i_5_]
                - Class68_Sub17.anInt3033);
        int i_16_ = ((Class68_Sub20_Sub12.anIntArrayArrayArray4353[i][i_4_ + 1]
                [i_5_ + 1])
                - Class68_Sub17.anInt3033);
        int i_17_
                = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i][i_4_][i_5_ + 1]
                - Class68_Sub17.anInt3033);
        int i_18_ = i_8_ * i_2_ + i_6_ * i_3_ >> 16;
        i_8_ = i_8_ * i_3_ - i_6_ * i_2_ >> 16;
        i_6_ = i_18_;
        i_18_ = i_14_ * i_1_ - i_8_ * i_0_ >> 16;
        i_8_ = i_14_ * i_0_ + i_8_ * i_1_ >> 16;
        i_14_ = i_18_;
        if (i_8_ >= 50) {
            i_18_ = i_9_ * i_2_ + i_10_ * i_3_ >> 16;
            i_9_ = i_9_ * i_3_ - i_10_ * i_2_ >> 16;
            i_10_ = i_18_;
            i_18_ = i_15_ * i_1_ - i_9_ * i_0_ >> 16;
            i_9_ = i_15_ * i_0_ + i_9_ * i_1_ >> 16;
            i_15_ = i_18_;
            if (i_9_ >= 50) {
                i_18_ = i_12_ * i_2_ + i_11_ * i_3_ >> 16;
                i_12_ = i_12_ * i_3_ - i_11_ * i_2_ >> 16;
                i_11_ = i_18_;
                i_18_ = i_16_ * i_1_ - i_12_ * i_0_ >> 16;
                i_12_ = i_16_ * i_0_ + i_12_ * i_1_ >> 16;
                i_16_ = i_18_;
                if (i_12_ >= 50) {
                    i_18_ = i_13_ * i_2_ + i_7_ * i_3_ >> 16;
                    i_13_ = i_13_ * i_3_ - i_7_ * i_2_ >> 16;
                    i_7_ = i_18_;
                    i_18_ = i_17_ * i_1_ - i_13_ * i_0_ >> 16;
                    i_13_ = i_17_ * i_0_ + i_13_ * i_1_ >> 16;
                    i_17_ = i_18_;
                    if (i_13_ >= 50) {
                        int i_19_ = Class62.anInt1164 + (i_6_ << 9) / i_8_;
                        int i_20_ = Class62.anInt1160 + (i_14_ << 9) / i_8_;
                        int i_21_ = Class62.anInt1164 + (i_10_ << 9) / i_9_;
                        int i_22_ = Class62.anInt1160 + (i_15_ << 9) / i_9_;
                        int i_23_ = Class62.anInt1164 + (i_11_ << 9) / i_12_;
                        int i_24_ = Class62.anInt1160 + (i_16_ << 9) / i_12_;
                        int i_25_ = Class62.anInt1164 + (i_7_ << 9) / i_13_;
                        int i_26_ = Class62.anInt1160 + (i_17_ << 9) / i_13_;
                        Class62.anInt1153 = 0;
                        if (((i_23_ - i_25_) * (i_22_ - i_26_)
                                - (i_24_ - i_26_) * (i_21_ - i_25_))
                                > 0) {
                            if (Stream.aBoolean2984
                                    && (Class68_Sub20_Sub17.method1182
                                    (Class86.anInt1567 + Class62.anInt1164,
                                            (Class68_Sub20_Sub7.anInt4260
                                                    + Class62.anInt1160),
                                            i_24_, i_26_, i_22_, i_23_, i_25_,
                                            i_21_))) {
                                Class68_Sub20_Sub15.anInt4400 = i_4_;
                                ISAACRandomGen.anInt1489 = i_5_;
                            }
                            if (!bool) {
                                Class62.aBoolean1157 = false;
                                if (i_23_ < 0 || i_25_ < 0 || i_21_ < 0
                                        || i_23_ > Class62.anInt1168
                                        || i_25_ > Class62.anInt1168
                                        || i_21_ > Class62.anInt1168)
                                    Class62.aBoolean1157 = true;
                                if (class7.anInt125 == -1) {
                                    if (class7.anInt129 != 12345678)
                                        Class62.method617(i_24_, i_26_, i_22_,
                                                i_23_, i_25_, i_21_,
                                                class7.anInt129,
                                                class7.anInt117,
                                                class7.anInt121);
                                } else if (Class68_Sub22.aBoolean3149) {
                                    if (class7.aBoolean126)
                                        Class62.method600(i_24_, i_26_, i_22_,
                                                i_23_, i_25_, i_21_,
                                                class7.anInt129,
                                                class7.anInt117,
                                                class7.anInt121,
                                                i_6_, i_10_, i_7_,
                                                i_14_, i_15_, i_17_,
                                                i_8_, i_9_, i_13_,
                                                class7.anInt125);
                                    else
                                        Class62.method600(i_24_, i_26_, i_22_,
                                                i_23_, i_25_, i_21_,
                                                class7.anInt129,
                                                class7.anInt117,
                                                class7.anInt121,
                                                i_11_, i_7_, i_10_,
                                                i_16_, i_17_, i_15_,
                                                i_12_, i_13_, i_9_,
                                                class7.anInt125);
                                } else {
                                    int i_27_
                                            = Class62.anInterface4_1159
                                            .method12(class7.anInt125, -23);
                                    Class62.method617
                                            (i_24_, i_26_, i_22_, i_23_, i_25_,
                                                    i_21_,
                                                    (Class68_Sub13_Sub34.method871
                                                            (i_27_, class7.anInt129)),
                                                    (Class68_Sub13_Sub34.method871
                                                            (i_27_, class7.anInt117)),
                                                    (Class68_Sub13_Sub34.method871
                                                            (i_27_, class7.anInt121)));
                                }
                            }
                        }
                        if (((i_19_ - i_21_) * (i_26_ - i_22_)
                                - (i_20_ - i_22_) * (i_25_ - i_21_))
                                > 0) {
                            if (Stream.aBoolean2984
                                    && (Class68_Sub20_Sub17.method1182
                                    (Class86.anInt1567 + Class62.anInt1164,
                                            (Class68_Sub20_Sub7.anInt4260
                                                    + Class62.anInt1160),
                                            i_20_, i_22_, i_26_, i_19_, i_21_,
                                            i_25_))) {
                                Class68_Sub20_Sub15.anInt4400 = i_4_;
                                ISAACRandomGen.anInt1489 = i_5_;
                            }
                            if (!bool) {
                                Class62.aBoolean1157 = false;
                                if (i_19_ < 0 || i_21_ < 0 || i_25_ < 0
                                        || i_19_ > Class62.anInt1168
                                        || i_21_ > Class62.anInt1168
                                        || i_25_ > Class62.anInt1168)
                                    Class62.aBoolean1157 = true;
                                if (class7.anInt125 == -1) {
                                    if (class7.anInt131 != 12345678)
                                        Class62.method617(i_20_, i_22_, i_26_,
                                                i_19_, i_21_, i_25_,
                                                class7.anInt131,
                                                class7.anInt121,
                                                class7.anInt117);
                                } else if (Class68_Sub22.aBoolean3149)
                                    Class62.method600(i_20_, i_22_, i_26_,
                                            i_19_, i_21_, i_25_,
                                            class7.anInt131,
                                            class7.anInt121,
                                            class7.anInt117, i_6_,
                                            i_10_, i_7_, i_14_,
                                            i_15_, i_17_, i_8_, i_9_,
                                            i_13_, class7.anInt125);
                                else {
                                    int i_28_
                                            = Class62.anInterface4_1159
                                            .method12(class7.anInt125, 117);
                                    Class62.method617
                                            (i_20_, i_22_, i_26_, i_19_, i_21_,
                                                    i_25_,
                                                    (Class68_Sub13_Sub34.method871
                                                            (i_28_, class7.anInt131)),
                                                    (Class68_Sub13_Sub34.method871
                                                            (i_28_, class7.anInt121)),
                                                    (Class68_Sub13_Sub34.method871
                                                            (i_28_, class7.anInt117)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static Class13_Sub3 method984(byte i, Stream class68_sub14) {
        anInt3025++;
        if (i < 70)
            aClass65_3031 = null;
        return new Class13_Sub3(class68_sub14.method957(-22489),
                class68_sub14.method957(-22489),
                class68_sub14.method957(-22489),
                class68_sub14.method957(-22489),
                class68_sub14.method921((byte) -97),
                class68_sub14.method921((byte) 91),
                class68_sub14.readUnsignedByte(-6677));
    }

    public static void method985(byte i) {
        anInt3023++;
        PacketStream.aClass98_4118.method1567(-123);
        if (i != -79)
            aClass65_3031 = null;
    }

    public static void method986(boolean bool) {
        aClass103_3028 = null;
        anIntArray3029 = null;
        aRSString_3027 = null;
        if (bool != false)
            method984((byte) -8, null);
        aClass68_Sub20_Sub10Array3030 = null;
        aRSString_3026 = null;
        aClass105_3024 = null;
        aClass65_3031 = null;
    }

    public static void method987(Class21renamed class21, int i) {
        if (i != -7486)
            aClass68_Sub20_Sub10Array3030 = null;
        Class15.aClass21_249 = class21;
        anInt3022++;
    }

    public static Class64 method988(int i, int i_29_, int i_30_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_29_][i_30_];
        if (class68_sub1 == null)
            return null;
        Class64 class64 = class68_sub1.aClass64_2757;
        class68_sub1.aClass64_2757 = null;
        return class64;
    }

    public Class68_Sub16(byte[] is) {
        aByteArray3021 = is;
    }

    static {
        aClass105_3024 = Class68_Sub20_Sub3.method1052(3253);
    }
}
