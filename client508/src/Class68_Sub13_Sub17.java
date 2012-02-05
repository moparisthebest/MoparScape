/* Class68_Sub13_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub17 extends Class68_Sub13 {
    public static boolean aBoolean3711 = false;
    public int anInt3712;
    public int anInt3713 = 4096;
    public static int anInt3714;
    public static int anInt3715;
    public int anInt3716;
    public int[] anIntArray3717;
    public static int anInt3718;
    public static int[] anIntArray3719;
    public static RSString aRSString_3720
            = RSString.newRsString(
            "RuneScape wird geladen )2 bitte warten)3)3)3");
    public static int anInt3721;
    public static int anInt3722;
    public int anInt3723;
    public static int anInt3724;
    public static int anInt3725;

    public Class68_Sub13_Sub17() {
        super(1, false);
        anInt3712 = 4096;
        anIntArray3717 = new int[3];
        anInt3716 = 409;
        anInt3723 = 4096;
    }

    public static int method780(int i, int i_0_, int i_1_, int i_2_) {
        anInt3714++;
        i &= 0x3;
        if (i == 0)
            return i_1_;
        if ((i ^ 0xffffffff) == -2)
            return i_0_;
        if (i_2_ != -27039)
            method785(-105, null);
        if (i == 2)
            return 7 - i_1_;
        return -i_0_ + 7;
    }

    public static RSString method781(int i, int i_3_, Class45 class45) {
        anInt3721++;
        if (!Class68_Sub13_Sub20.method803(i_3_, client.method41(class45),
                i + -28702)
                && class45.anObjectArray856 == null)
            return null;
        if (class45.aRSStringArray823 == null
                || (i_3_ ^ 0xffffffff) <= (class45.aRSStringArray823.length
                ^ 0xffffffff)
                || class45.aRSStringArray823[i_3_] == null
                || (class45.aRSStringArray823[i_3_].method1585(true)
                .method1590((byte) -107)
                ^ 0xffffffff) == -1) {
            if (Class68_Sub20.aBoolean3094)
                return (Class68_Sub20_Sub13_Sub2.method1166
                        (2,
                                new RSString[]{Login.aRSString_1513,
                                        Class68_Sub13_Sub24.method816(i_3_,
                                                0)}));
            return null;
        }
        if (i != -3574)
            method785(-79, null);
        return class45.aRSStringArray823[i_3_];
    }

    public static void method782(int i) {
        aRSString_3720 = null;
        if (i == 0)
            anIntArray3719 = null;
    }

    public int[][] method697(int i, boolean bool) {
        if (bool != true)
            method781(-121, 56, null);
        anInt3722++;
        int[][] is = aClass88_2939.method1496(i, (byte) -102);
        if (aClass88_2939.aBoolean1610) {
            int[][] is_4_ = this.method699(-71, 0, i);
            int[] is_5_ = is_4_[0];
            int[] is_6_ = is_4_[1];
            int[] is_7_ = is_4_[2];
            int[] is_8_ = is[0];
            int[] is_9_ = is[1];
            int[] is_10_ = is[2];
            for (int i_11_ = 0; i_11_ < Class68_Sub13_Sub19.anInt3746;
                 i_11_++) {
                int i_12_ = is_5_[i_11_];
                int i_13_ = -anIntArray3717[0] + i_12_;
                if (i_13_ < 0)
                    i_13_ = -i_13_;
                if ((anInt3716 ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
                    is_8_[i_11_] = i_12_;
                    is_9_[i_11_] = is_6_[i_11_];
                    is_10_[i_11_] = is_7_[i_11_];
                } else {
                    int i_14_ = is_6_[i_11_];
                    i_13_ = i_14_ + -anIntArray3717[1];
                    if (i_13_ < 0)
                        i_13_ = -i_13_;
                    if ((anInt3716 ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
                        is_8_[i_11_] = i_12_;
                        is_9_[i_11_] = i_14_;
                        is_10_[i_11_] = is_7_[i_11_];
                    } else {
                        int i_15_ = is_7_[i_11_];
                        i_13_ = i_15_ - anIntArray3717[2];
                        if (i_13_ < 0)
                            i_13_ = -i_13_;
                        if (i_13_ > anInt3716) {
                            is_8_[i_11_] = i_12_;
                            is_9_[i_11_] = i_14_;
                            is_10_[i_11_] = i_15_;
                        } else {
                            is_8_[i_11_] = anInt3712 * i_12_ >> 1602950764;
                            is_9_[i_11_] = i_14_ * anInt3723 >> 348864908;
                            is_10_[i_11_] = anInt3713 * i_15_ >> 1050357836;
                        }
                    }
                }
            }
        }
        return is;
    }

    public static int method783(int i, Class21renamed class21) {
        int i_16_ = 0;
        if (class21.method360(Class68_Sub20.anInt3089, 0))
            i_16_++;
        if (class21.method360(Class68_Sub26.anInt3182, 0))
            i_16_++;
        if (class21.method360(Class51.anInt2259, 0))
            i_16_++;
        anInt3718++;
        if (class21.method360(Class17.anInt280, 0))
            i_16_++;
        if (class21.method360(Class68_Sub13_Sub16.anInt3695, 0))
            i_16_++;
        if (class21.method360(Class113.anInt1902, i))
            i_16_++;
        if (class21.method360(Class1_Sub5.anInt2500, i))
            i_16_++;
        if (class21.method360(Class68_Sub8.anInt2876, i))
            i_16_++;
        if (class21.method360(Applet_Sub1.anInt16, 0))
            i_16_++;
        if (class21.method360(Class68_Sub13_Sub38.anInt4082, 0))
            i_16_++;
        if (class21.method360(Class68_Sub13_Sub27.anInt3891, 0))
            i_16_++;
        if (class21.method360(Class68_Sub20_Sub14.anInt4378, i + i))
            i_16_++;
        if (class21.method360(Class15.anInt252, 0))
            i_16_++;
        i_16_++;
        if (class21.method360(Class97.anInt1712, 0))
            i_16_++;
        if (class21.method360(Class97.anInt1706, i))
            i_16_++;
        return i_16_;
    }

    public void method700(Stream class68_sub14, int i, int i_17_) {
        int i_18_ = i;
        while_71_:
        do {
            while_70_:
            do {
                while_69_:
                do {
                    do {
                        if (i_18_ != 0) {
                            if (i_18_ != 1) {
                                if (i_18_ != 2) {
                                    if ((i_18_ ^ 0xffffffff) != -4) {
                                        if (i_18_ == 4)
                                            break while_70_;
                                        break while_71_;
                                    }
                                } else
                                    break;
                                break while_69_;
                            }
                        } else {
                            anInt3716 = class68_sub14.readUnsignedWord(1355769544);
                            break while_71_;
                        }
                        anInt3713 = class68_sub14.readUnsignedWord(1355769544);
                        break while_71_;
                    } while (false);
                    anInt3723 = class68_sub14.readUnsignedWord(1355769544);
                    break while_71_;
                } while (false);
                anInt3712 = class68_sub14.readUnsignedWord(1355769544);
                break while_71_;
            } while (false);
            int i_19_ = class68_sub14.method921((byte) 68);
            anIntArray3717[0]
                    = Class120.method1740(16711680, i_19_) << -1712408444;
            anIntArray3717[1] = Class120.method1740(4080, i_19_ >> 1164839076);
            anIntArray3717[2] = Class120.method1740(i_19_, 255) >> -2020022708;
        } while (false);
        if (i_17_ != -1)
            method781(22, -40, null);
        anInt3725++;
    }

    public static Class68_Sub20_Sub14 method784(int i, byte i_20_) {
        anInt3724++;
        Class68_Sub20_Sub14 class68_sub20_sub14
                = ((Class68_Sub20_Sub14)
                Class68_Sub13_Sub16.aLogin_3702.method1473((long) i,
                        (byte) -76));
        if (class68_sub20_sub14 != null)
            return class68_sub20_sub14;
        byte[] is = Class13.aClass21_Sub1_221.method338(0, 0, i);
        if (is == null)
            return null;
        class68_sub20_sub14 = new Class68_Sub20_Sub14();
        if (i_20_ < 22)
            aRSString_3720 = null;
        Stream class68_sub14 = new Stream(is);
        class68_sub14.currentOffset = class68_sub14.buffer.length - 2;
        int i_21_ = class68_sub14.readUnsignedWord(1355769544);
        int i_22_ = -2 + class68_sub14.buffer.length - (i_21_ - -12);
        class68_sub14.currentOffset = i_22_;
        int i_23_ = class68_sub14.readDWord();
        class68_sub20_sub14.anInt4379 = class68_sub14.readUnsignedWord(1355769544);
        class68_sub20_sub14.anInt4370 = class68_sub14.readUnsignedWord(1355769544);
        class68_sub20_sub14.anInt4373 = class68_sub14.readUnsignedWord(1355769544);
        class68_sub20_sub14.anInt4371 = class68_sub14.readUnsignedWord(1355769544);
        int i_24_ = class68_sub14.readUnsignedByte(-6677);
        if ((i_24_ ^ 0xffffffff) < -1) {
            class68_sub20_sub14.aClass113Array4380 = new Class113[i_24_];
            for (int i_25_ = 0; (i_24_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff);
                 i_25_++) {
                int i_26_ = class68_sub14.readUnsignedWord(1355769544);
                Class113 class113
                        = new Class113(Class90.method1517(i_26_, -21189));
                class68_sub20_sub14.aClass113Array4380[i_25_] = class113;
                while ((i_26_-- ^ 0xffffffff) < -1) {
                    int i_27_ = class68_sub14.readDWord();
                    int i_28_ = class68_sub14.readDWord();
                    class113.method1677((byte) -89, new Class68_Sub10(i_28_),
                            (long) i_27_);
                }
            }
        }
        int i_29_ = 0;
        class68_sub14.currentOffset = 0;
        class68_sub20_sub14.aRSString_4369 = class68_sub14.method948(23733);
        class68_sub20_sub14.anIntArray4374 = new int[i_23_];
        class68_sub20_sub14.anIntArray4377 = new int[i_23_];
        class68_sub20_sub14.aRSStringArray4375 = new RSString[i_23_];
        while ((class68_sub14.currentOffset ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
            int i_30_ = class68_sub14.readUnsignedWord(1355769544);
            if ((i_30_ ^ 0xffffffff) != -4) {
                if ((i_30_ ^ 0xffffffff) <= -101 || i_30_ == 21
                        || (i_30_ ^ 0xffffffff) == -39 || i_30_ == 39)
                    class68_sub20_sub14.anIntArray4374[i_29_]
                            = class68_sub14.readUnsignedByte(-6677);
                else
                    class68_sub20_sub14.anIntArray4374[i_29_] = class68_sub14.readDWord();
            } else
                class68_sub20_sub14.aRSStringArray4375[i_29_]
                        = class68_sub14.readString(127);
            class68_sub20_sub14.anIntArray4377[i_29_++] = i_30_;
        }
        Class68_Sub13_Sub16.aLogin_3702.method1465((long) i, (byte) -107,
                class68_sub20_sub14);
        return class68_sub20_sub14;
    }

    public static boolean method785(int i, RSString class100) {
        anInt3715++;
        if (class100 == null)
            return false;
        if (i > -68)
            anIntArray3719 = null;
        for (int i_31_ = 0; Class32.anInt573 > i_31_; i_31_++) {
            if (class100.method1600(false, (Class68_Sub13_Sub38
                    .aRSStringArray4084[i_31_])))
                return true;
        }
        if (class100.method1600(false, (Class68_Sub7.aClass1_Sub6_Sub2_2860
                .aRSString_3414)))
            return true;
        return false;
    }
}
