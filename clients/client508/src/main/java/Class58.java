/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class58 {
    public static int anInt1087 = 0;
    public static int anInt1088;
    public int anInt1089;
    public int[] anIntArray1090;
    public static int anInt1091;
    public static int anInt1092;
    public static int anInt1093;
    public static int anInt1094;
    public static RSString aRSString_1095;
    public static int anInt1096;
    public static Class21_Sub1 aClass21_Sub1_1097;
    public static RSString aRSString_1098 = RSString.newRsString("level)2");
    public Class68_Sub20_Sub8 aClass68_Sub20_Sub8_1099;

    /*
     * Player update masks.
     */
    public static void method577(int i, Class1_Sub6_Sub2 class1_sub6_sub2, int i_0_, int i_1_) {
        if ((i & 0x100) != 0) {
            class1_sub6_sub2.anInt2559 = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
            class1_sub6_sub2.anInt2518 = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            class1_sub6_sub2.anInt2542 = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            class1_sub6_sub2.anInt2519 = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            class1_sub6_sub2.anInt2550 = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544) + Class68_Sub3.anInt2812;
            class1_sub6_sub2.anInt2521 = Class68_Sub13_Sub8.inStream.readUnsignedWordA() + Class68_Sub3.anInt2812;
            class1_sub6_sub2.anInt2588 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            class1_sub6_sub2.anInt2579 = 1;
            class1_sub6_sub2.anInt2557 = 0;
        }
        if ((i & 0x200) != 0) {
            int i_2_ = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            int i_3_ = Class68_Sub13_Sub8.inStream.readUnsignedByteA();
            class1_sub6_sub2.method149(i_2_, false, Class68_Sub3.anInt2812, i_3_);
        }
        if (i_0_ == -19219) {
            anInt1093++;
            if ((0x20 & i) != 0) {
                class1_sub6_sub2.anInt2525 = Class68_Sub13_Sub8.inStream.readUnsignedWord(i_0_ ^ ~0x50cf2dda);
                if (class1_sub6_sub2.anInt2525 == 65535)
                    class1_sub6_sub2.anInt2525 = -1;
            }
            if ((0x4 & i) != 0) {
                class1_sub6_sub2.aRSString_2576 = Class68_Sub13_Sub8.inStream.readString(i_0_ ^ ~0x4b6d);
                if (class1_sub6_sub2.aRSString_2576.method1578(0, 7178) == 126) {
                    class1_sub6_sub2.aRSString_2576 = class1_sub6_sub2.aRSString_2576.method1615(1, true);
                    Class48.method520(class1_sub6_sub2.method160(i_0_ + 22219), 126, class1_sub6_sub2.aRSString_2576, 2);
                } else if (class1_sub6_sub2 == Class68_Sub7.aClass1_Sub6_Sub2_2860)
                    Class48.method520(class1_sub6_sub2.method160(3000), -107, class1_sub6_sub2.aRSString_2576, 2);
                class1_sub6_sub2.anInt2539 = 0;
                class1_sub6_sub2.anInt2569 = 150;
                class1_sub6_sub2.anInt2535 = 0;
            }
            if ((i & 0x400) != 0) {
                class1_sub6_sub2.anInt2552 = Class68_Sub13_Sub8.inStream.readUnsignedWord(i_0_ + 1355788763);
                int i_4_ = Class68_Sub13_Sub8.inStream.readDWord_v1();
                class1_sub6_sub2.anInt2541 = (i_4_ & 0xffff) + Class68_Sub3.anInt2812;
                class1_sub6_sub2.anInt2578 = 0;
                class1_sub6_sub2.anInt2560 = i_4_ >> 1501520208;
                class1_sub6_sub2.anInt2586 = 0;
                if (class1_sub6_sub2.anInt2552 == 65535)
                    class1_sub6_sub2.anInt2552 = -1;
                if (class1_sub6_sub2.anInt2541 > Class68_Sub3.anInt2812)
                    class1_sub6_sub2.anInt2578 = -1;
            }
            if ((0x40 & i) != 0) {
                class1_sub6_sub2.anInt2526 = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(i_0_ + 19308);
                class1_sub6_sub2.anInt2572 = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            }
            if ((i & 0x8) != 0) {
                int chatTextEffects = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
                boolean bool = (0x8000 & chatTextEffects) != 0;
                int rights = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
                int chatTextSize = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
                int offset = Class68_Sub13_Sub8.inStream.currentOffset;
                if (class1_sub6_sub2.aRSString_3414 != null && class1_sub6_sub2.aClass126_3410 != null) {
                    long l = class1_sub6_sub2.aRSString_3414.toLong(i_0_ + 30127);
                    boolean bool_9_ = false;
                    if (rights <= 1) {
                        if (!bool && (Class25.anInt517 == 1 || Class30.anInt552 == 1))
                            bool_9_ = true;
                        else {
                            for (int i_10_ = 0; Class68_Sub13_Sub26.anInt3880 > i_10_; i_10_++) {
                                if (l == Class21_Sub1.aLongArray2703[i_10_]) {
                                    bool_9_ = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!bool_9_ && Class116.anInt2011 == 0) {
                        Class95.aStream_1680.currentOffset = 0;
                        Class68_Sub13_Sub8.inStream.readBytes(0, 0, chatTextSize, Class95.aStream_1680.buffer);
                        Class95.aStream_1680.currentOffset = 0;
                        int i_11_ = -1;
                        RSString class100;
                        if (!bool)
                            class100 = (Class68_Sub20_Sub1.method1009(Class68_Sub19.method996(68, Class95.aStream_1680).method1616(i_0_ ^ ~0x4b10)));
                        else {
                            chatTextEffects &= 0x7fff;
                            Class58 class58 = Class70.method1334((Class95.aStream_1680), -10);
                            i_11_ = class58.anInt1089;
                            class100 = (class58.aClass68_Sub20_Sub8_1099.method1093(121, Class95.aStream_1680));
                        }
                        class1_sub6_sub2.aRSString_2576 = class100.method1585(true);
                        class1_sub6_sub2.anInt2535 = chatTextEffects >> 501220200;
                        class1_sub6_sub2.anInt2569 = 150;
                        class1_sub6_sub2.anInt2539 = 0xff & chatTextEffects;
                        if (rights == 2)
                            Class25.method386(null, -19596, (Class68_Sub20_Sub13_Sub2.method1166(i_0_ ^ ~0x4b10, (new RSString[]{Class68_Sub13_Sub4.aRSString_3492, class1_sub6_sub2.method160(i_0_ ^ ~0x40aa)}))), i_11_, bool ? 17 : 1, class100);
                        else if (rights != 1)
                            Class25.method386(null, -19596, class1_sub6_sub2.method160(3000), i_11_, !bool ? 2 : 17, class100);
                        else
                            Class25.method386(null, -19596, (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class68_Sub13_Sub27.aRSString_3902, class1_sub6_sub2.method160(3000)}))), i_11_, bool ? 17 : 1, class100);
                    }
                }
                Class68_Sub13_Sub8.inStream.currentOffset = chatTextSize + offset;
            }
            if ((0x1 & i) != 0) {
                int i_12_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
                if (i_12_ == 65535)
                    i_12_ = -1;
                int i_13_ = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
                Class55.method1720(i_13_, i_0_ ^ ~0x4b12, class1_sub6_sub2, i_12_);
            }
            if ((i & 0x80) != 0) {
                int i_14_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(i_0_ + 12542);
                byte[] is = new byte[i_14_];
                Stream class68_sub14 = new Stream(is);
                Class68_Sub13_Sub8.inStream.readBytes(0, 0, i_14_, is);
                Class68_Sub1.aStreamArray2755[i_1_] = class68_sub14;
                class1_sub6_sub2.method159(class68_sub14, (byte) -82);
            }
            if ((i & 0x2) != 0) {
                int i_15_ = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
                int i_16_ = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
                class1_sub6_sub2.method149(i_15_, false, Class68_Sub3.anInt2812, i_16_);
                class1_sub6_sub2.anInt2534 = 300 + Class68_Sub3.anInt2812;
                class1_sub6_sub2.anInt2547 = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            }
        }
    }

    public static void method578(Class1_Sub6 class1_sub6, boolean bool) {
        anInt1088++;
        class1_sub6.anInt2524 = class1_sub6.anInt2530;
        if ((class1_sub6.anInt2579 ^ 0xffffffff) == -1)
            class1_sub6.anInt2520 = 0;
        else {
            if (class1_sub6.anInt2568 != -1
                    && (class1_sub6.anInt2545 ^ 0xffffffff) == -1) {
                Class55 class117
                        = Class64.method624((byte) -36, class1_sub6.anInt2568);
                if (class1_sub6.anInt2557 > 0
                        && (class117.anInt2043 ^ 0xffffffff) == -1) {
                    class1_sub6.anInt2520++;
                    return;
                }
                if ((class1_sub6.anInt2557 ^ 0xffffffff) >= -1
                        && class117.anInt2039 == 0) {
                    class1_sub6.anInt2520++;
                    return;
                }
            }
            int i = class1_sub6.anInt2561;
            int i_17_ = class1_sub6.anInt2537;
            int i_18_
                    = (64 * class1_sub6.anInt2544
                    + (class1_sub6.anIntArray2570[-1 + class1_sub6.anInt2579]
                    * 128));
            int i_19_ = (class1_sub6.anInt2544 * 64
                    + 128 * (class1_sub6.anIntArray2523
                    [-1 + class1_sub6.anInt2579]));
            if ((i_19_ - i ^ 0xffffffff) < -257
                    || (-i + i_19_ ^ 0xffffffff) > 255
                    || (-i_17_ + i_18_ ^ 0xffffffff) < -257
                    || (i_18_ + -i_17_ ^ 0xffffffff) > 255) {
                class1_sub6.anInt2537 = i_18_;
                class1_sub6.anInt2561 = i_19_;
            } else {
                if (i_19_ > i) {
                    if (i_18_ > i_17_)
                        class1_sub6.anInt2533 = 1280;
                    else if ((i_17_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
                        class1_sub6.anInt2533 = 1792;
                    else
                        class1_sub6.anInt2533 = 1536;
                } else if (i > i_19_) {
                    if (i_18_ > i_17_)
                        class1_sub6.anInt2533 = 768;
                    else if (i_17_ > i_18_)
                        class1_sub6.anInt2533 = 256;
                    else
                        class1_sub6.anInt2533 = 512;
                } else if ((i_17_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff))
                    class1_sub6.anInt2533 = 1024;
                else if (i_17_ > i_18_)
                    class1_sub6.anInt2533 = 0;
                int i_20_ = class1_sub6.anInt2532;
                int i_21_
                        = class1_sub6.anInt2533 + -class1_sub6.anInt2548 & 0x7ff;
                int i_22_ = 4;
                if (i_21_ > 1024)
                    i_21_ -= 2048;
                if ((i_21_ ^ 0xffffffff) > 255 || i_21_ > 256) {
                    if ((i_21_ ^ 0xffffffff) <= -257 && i_21_ < 768)
                        i_20_ = class1_sub6.anInt2563;
                    else if ((i_21_ ^ 0xffffffff) <= 767
                            && (i_21_ ^ 0xffffffff) >= 255)
                        i_20_ = class1_sub6.anInt2574;
                } else
                    i_20_ = class1_sub6.anInt2543;
                boolean bool_23_ = bool;
                if ((i_20_ ^ 0xffffffff) == 0)
                    i_20_ = class1_sub6.anInt2543;
                class1_sub6.anInt2524 = i_20_;
                if (class1_sub6 instanceof Class1_Sub6_Sub1)
                    bool_23_ = (((Class1_Sub6_Sub1) class1_sub6).aClass80_3395
                            .aBoolean1424);
                if (!bool_23_) {
                    if (class1_sub6.anInt2579 > 1)
                        i_22_ = 6;
                    if (class1_sub6.anInt2579 > 2)
                        i_22_ = 8;
                    if (class1_sub6.anInt2520 > 0
                            && class1_sub6.anInt2579 > 1) {
                        i_22_ = 8;
                        class1_sub6.anInt2520--;
                    }
                } else {
                    if (((class1_sub6.anInt2533 ^ 0xffffffff)
                            != (class1_sub6.anInt2548 ^ 0xffffffff))
                            && class1_sub6.anInt2525 == -1
                            && class1_sub6.anInt2581 != 0)
                        i_22_ = 2;
                    if ((class1_sub6.anInt2579 ^ 0xffffffff) < -3)
                        i_22_ = 6;
                    if (class1_sub6.anInt2579 > 3)
                        i_22_ = 8;
                    if (class1_sub6.anInt2520 > 0
                            && (class1_sub6.anInt2579 ^ 0xffffffff) < -2) {
                        i_22_ = 8;
                        class1_sub6.anInt2520--;
                    }
                }
                if (class1_sub6.aBooleanArray2546[class1_sub6.anInt2579 - 1])
                    i_22_ <<= 1;
                if ((i ^ 0xffffffff) <= (i_19_ ^ 0xffffffff)) {
                    if ((i_19_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
                        class1_sub6.anInt2561 -= i_22_;
                        if ((class1_sub6.anInt2561 ^ 0xffffffff)
                                > (i_19_ ^ 0xffffffff))
                            class1_sub6.anInt2561 = i_19_;
                    }
                } else {
                    class1_sub6.anInt2561 += i_22_;
                    if (class1_sub6.anInt2561 > i_19_)
                        class1_sub6.anInt2561 = i_19_;
                }
                if (i_17_ < i_18_) {
                    class1_sub6.anInt2537 += i_22_;
                    if (i_18_ < class1_sub6.anInt2537)
                        class1_sub6.anInt2537 = i_18_;
                } else if (i_17_ > i_18_) {
                    class1_sub6.anInt2537 -= i_22_;
                    if (i_18_ > class1_sub6.anInt2537)
                        class1_sub6.anInt2537 = i_18_;
                }
                if (i_22_ >= 8
                        && ((class1_sub6.anInt2543 ^ 0xffffffff)
                        == (class1_sub6.anInt2524 ^ 0xffffffff))
                        && (class1_sub6.anInt2540 ^ 0xffffffff) != 0)
                    class1_sub6.anInt2524 = class1_sub6.anInt2540;
                if ((class1_sub6.anInt2561 ^ 0xffffffff) == (i_19_
                        ^ 0xffffffff)
                        && class1_sub6.anInt2537 == i_18_) {
                    if ((class1_sub6.anInt2557 ^ 0xffffffff) < -1)
                        class1_sub6.anInt2557--;
                    class1_sub6.anInt2579--;
                }
            }
        }
    }

    public static RSString method579(byte i, int i_24_) {
        anInt1092++;
        if (i >= -40)
            return null;
        if ((Class33.aRSStringArray582[i_24_].method1590((byte) -117)
                ^ 0xffffffff)
                >= -1)
            return Class71_Sub1.aRSStringArray3257[i_24_];
        return (Class68_Sub20_Sub13_Sub2.method1166
                (2, new RSString[]{Class71_Sub1.aRSStringArray3257[i_24_],
                        Class51.aRSString_2258,
                        Class33.aRSStringArray582[i_24_]}));
    }

    public static void method580(int i, int i_25_, byte i_26_) {
        anInt1096++;
        int i_27_ = i;
        if (i_27_ > 25)
            i_27_ = 25;
        i--;
        int i_28_ = Class68_Sub13_Sub37.anIntArray4066[i];
        int i_29_ = Class68_Sub13_Sub21.anIntArray3797[i];
        if (i_25_ == 0) {
            Class21renamed.stream.createFrame(49);
            Class68_Sub20_Sub17.anInt4436++;
            Class21renamed.stream.writeByte(i_27_ + i_27_ + 3);
        }
        if (i_25_ == 1) {
            Class68_Sub27.anInt3210++;
            Class21renamed.stream.createFrame(119);
            Class21renamed.stream.writeByte(14 + (3 + i_27_) - -i_27_);
        }
        if (i_25_ == 2) {
            Class21renamed.stream.createFrame(138);
            Class21renamed.stream.writeByte(i_27_ + i_27_ + 3);
            Class68_Sub20_Sub13_Sub2.anInt4618++;
        }
        Class21renamed.stream.writeWordBigEndianA((byte) 19, i_28_ + Class36.anInt643);
        Class21renamed.stream.writeWordA(i_29_ + Class68_Sub13_Sub35.anInt4026, -38);
        Class21renamed.stream.writeByteC(Class128.aBooleanArray2228[82] ? 1 : 0);
        Class75_Sub2.anInt3315 = Class68_Sub13_Sub21.anIntArray3797[0];
        if (i_26_ >= 123) {
            Class95.anInt1684 = Class68_Sub13_Sub37.anIntArray4066[0];
            for (int i_30_ = 1; i_30_ < i_27_; i_30_++) {
                i--;
                Class21renamed.stream.writeByte(((Class68_Sub13_Sub37.anIntArray4066[i]) + -i_28_));
                Class21renamed.stream.writeByteS(-i_29_ + Class68_Sub13_Sub21.anIntArray3797[i]);
            }
        }
    }

    public static void method581(int i, byte i_31_, int i_32_, int i_33_,
                                 int i_34_, int i_35_) {
        anInt1091++;
        if (i_31_ != 63)
            anInt1087 = -12;
        if (i_32_ == i)
            Class68_Sub20_Sub13.method1158(i_35_, i_33_, i, i_34_, true);
        else if (GroundData.anInt677 > i_34_ + -i
                || Class113.anInt1918 < i + i_34_
                || (Class35.anInt605 ^ 0xffffffff) < (i_33_ + -i_32_
                ^ 0xffffffff)
                || (i_33_ - -i_32_ ^ 0xffffffff) < (Class51.anInt2255
                ^ 0xffffffff))
            Class75_Sub3_Sub1.method1401(i_34_, i_33_, i_32_, i, (byte) 47,
                    i_35_);
        else
            Unknown.method1499(i_32_, i_34_, i_33_, true, i, i_35_);
    }

    public static void method582(int i) {
        anInt1094++;
        if (i >= 12) {
            do {
                try {
                    if (Class76.aClass52_1354 != null)
                        break;
                    Class76.aClass52_1354
                            = new Class52(Class75_Sub1_Sub1.signlink,
                            Class68_Sub20_Sub13_Sub2.method1166
                                    (2, (new RSString[]
                                            {Class88.method1492(-1),
                                                    Class104.aRSString_1783}))
                                    .method1574(-16294));
                } catch (Exception exception) {
                    exception.printStackTrace();
                    Class76.aClass52_1354 = null;
                    break;
                }
                break;
            } while (false);
        }
    }

    public static void method583(int i) {
        if (i != -2)
            method582(21);
        aClass21_Sub1_1097 = null;
        aRSString_1095 = null;
        aRSString_1098 = null;
    }

    static {
        aRSString_1095 = aRSString_1098;
    }
}
