/* Class68_Sub13_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub24 extends Class68_Sub13 {
    public int anInt3829 = 1;
    public static int anInt3830;
    public static Class21renamed aClass21_3831;
    public static int anInt3832;
    public static int anInt3833;
    public static RSString aRSString_3834;
    public int anInt3835;
    public static int anInt3836;
    public int anInt3837 = 1;
    public static RSString aRSString_3838;
    public static RSString aRSString_3839;
    public static int anInt3840;
    public static int anInt3841 = 0;
    public static int anInt3842;
    public static Class21renamed aClass21_3843;
    public static int anInt3844;
    public static int anInt3845;
    public static int anInt3846;
    public static RSString aRSString_3847;

    public static RSString method816(int i, int i_0_) {
        anInt3830++;
        if (i_0_ != 0)
            aClass21_3843 = null;
        return Class13_Sub1.method247(10, false, (byte) 125, i);
    }

    public void method700(Stream class68_sub14, int i, int i_1_) {
        int i_2_ = i;
        while_114_:
        do {
            do {
                if (i_2_ != 0) {
                    if ((i_2_ ^ 0xffffffff) != -2) {
                        if (i_2_ == 2)
                            break;
                        break while_114_;
                    }
                } else {
                    anInt3837 = class68_sub14.readUnsignedByte(-6677);
                    break while_114_;
                }
                anInt3829 = class68_sub14.readUnsignedByte(-6677);
                break while_114_;
            } while (false);
            anInt3835 = class68_sub14.readUnsignedWord(1355769544);
        } while (false);
        if (i_1_ != -1)
            method818(111, null);
        anInt3832++;
    }

    public Class68_Sub13_Sub24() {
        super(0, true);
        anInt3835 = 204;
    }

    public static void method817(int i) {
        if (i != 0)
            anInt3833 = 92;
        aClass21_3831 = null;
        aRSString_3847 = null;
        aRSString_3838 = null;
        aClass21_3843 = null;
        aRSString_3834 = null;
        aRSString_3839 = null;
    }

    public static void method818(int i, byte[] is) {
        anInt3836++;
        Stream class68_sub14 = new Stream(is);
        class68_sub14.currentOffset = is.length - 2;
        Stream.anInt3007 = class68_sub14.readUnsignedWord(1355769544);
        Class4.anIntArray96 = new int[Stream.anInt3007];
        Class3.aByteArrayArray78 = new byte[Stream.anInt3007][];
        Class69.aByteArrayArray1240 = new byte[Stream.anInt3007][];
        Class116.anIntArray1996 = new int[Stream.anInt3007];
        Class68_Sub13_Sub19.anIntArray3757 = new int[Stream.anInt3007];
        Class68_Sub10.aBooleanArray2905 = new boolean[Stream.anInt3007];
        Class68_Sub13_Sub12.anIntArray3639 = new int[Stream.anInt3007];
        class68_sub14.currentOffset = -7 + is.length - 8 * Stream.anInt3007;
        Class97.anInt1703 = class68_sub14.readUnsignedWord(i ^ 0x50cf5ea8);
        Class68_Sub20_Sub15.anInt4405
                = class68_sub14.readUnsignedWord(i ^ 0x50cf5ea8);
        int i_3_ = (class68_sub14.readUnsignedByte(-6677) & 0xff) - -1;
        for (int i_4_ = 0;
             (Stream.anInt3007 ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
             i_4_++)
            Class4.anIntArray96[i_4_]
                    = class68_sub14.readUnsignedWord(Class15.method278(i, 1355767464));
        for (int i_5_ = 0; Stream.anInt3007 > i_5_; i_5_++)
            Class116.anIntArray1996[i_5_]
                    = class68_sub14.readUnsignedWord(Class15.method278(i, 1355767464));
        for (int i_6_ = 0;
             (Stream.anInt3007 ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
             i_6_++)
            Class68_Sub13_Sub12.anIntArray3639[i_6_]
                    = class68_sub14.readUnsignedWord(i + 1355755112);
        for (int i_7_ = 0; Stream.anInt3007 > i_7_; i_7_++)
            Class68_Sub13_Sub19.anIntArray3757[i_7_]
                    = class68_sub14.readUnsignedWord(1355769544);
        if (i != 14432)
            aRSString_3847 = null;
        class68_sub14.currentOffset
                = -(8 * Stream.anInt3007) + (is.length + -7
                - 3 * (-1 + i_3_));
        Class68_Sub13_Sub17.anIntArray3719 = new int[i_3_];
        for (int i_8_ = 1; (i_8_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_8_++) {
            Class68_Sub13_Sub17.anIntArray3719[i_8_]
                    = class68_sub14.method921((byte) 118);
            if (Class68_Sub13_Sub17.anIntArray3719[i_8_] == 0)
                Class68_Sub13_Sub17.anIntArray3719[i_8_] = 1;
        }
        class68_sub14.currentOffset = 0;
        for (int i_9_ = 0;
             (i_9_ ^ 0xffffffff) > (Stream.anInt3007 ^ 0xffffffff);
             i_9_++) {
            int i_10_ = Class68_Sub13_Sub12.anIntArray3639[i_9_];
            int i_11_ = Class68_Sub13_Sub19.anIntArray3757[i_9_];
            int i_12_ = i_10_ * i_11_;
            byte[] is_13_ = new byte[i_12_];
            byte[] is_14_ = new byte[i_12_];
            boolean bool = false;
            Class69.aByteArrayArray1240[i_9_] = is_14_;
            Class3.aByteArrayArray78[i_9_] = is_13_;
            int i_15_ = class68_sub14.readUnsignedByte(-6677);
            if ((0x1 & i_15_) == 0) {
                for (int i_16_ = 0;
                     (i_12_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++)
                    is_14_[i_16_] = class68_sub14.method955(3390);
                if ((0x2 & i_15_ ^ 0xffffffff) != -1) {
                    for (int i_17_ = 0; i_12_ > i_17_; i_17_++) {
                        byte i_18_
                                = is_13_[i_17_] = class68_sub14.method955(3390);
                        bool = bool | i_18_ != -1;
                    }
                }
            } else {
                for (int i_19_ = 0; i_10_ > i_19_; i_19_++) {
                    for (int i_20_ = 0;
                         (i_11_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++)
                        is_14_[i_19_ + i_10_ * i_20_]
                                = class68_sub14.method955(3390);
                }
                if ((0x2 & i_15_ ^ 0xffffffff) != -1) {
                    for (int i_21_ = 0;
                         (i_10_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff);
                         i_21_++) {
                        for (int i_22_ = 0; i_22_ < i_11_; i_22_++) {
                            byte i_23_ = (is_13_[i_21_ - -(i_22_ * i_10_)]
                                    = class68_sub14.method955(3390));
                            bool = bool | (i_23_ ^ 0xffffffff) != 0;
                        }
                    }
                }
            }
            Class68_Sub10.aBooleanArray2905[i_9_] = bool;
        }
    }

    public int[] method698(byte i, int i_24_) {
        if (i != -61)
            return null;
        int[] is = aClass115_2936.method1697(false, i_24_);
        if (aClass115_2936.aBoolean1957) {
            int i_25_ = 0;
            for (/**/; (i_25_ ^ 0xffffffff) > (Class68_Sub13_Sub19.anInt3746
                    ^ 0xffffffff); i_25_++) {
                int i_26_ = Class68_Sub13_Sub3.anIntArray3479[i_25_];
                int i_27_ = i_26_ * anInt3837 >> -175664180;
                int i_28_ = anInt3837 * (i_26_ % (4096 / anInt3837));
                int i_29_ = Class13_Sub3.anIntArray2672[i_24_];
                int i_30_ = i_29_ * anInt3829 >> 1807983244;
                int i_31_ = anInt3829 * (i_29_ % (4096 / anInt3829));
                if (i_31_ < anInt3835) {
                    for (i_27_ -= i_30_; i_27_ < 0; i_27_ += 4) {
                        /* empty */
                    }
                    for (/**/; (i_27_ ^ 0xffffffff) < -4; i_27_ -= 4) {
                        /* empty */
                    }
                    if ((i_27_ ^ 0xffffffff) != -2) {
                        is[i_25_] = 0;
                        continue;
                    }
                    if (anInt3835 > i_28_) {
                        is[i_25_] = 0;
                        continue;
                    }
                }
                if (i_28_ < anInt3835) {
                    for (i_27_ -= i_30_; (i_27_ ^ 0xffffffff) > -1;
                         i_27_ += 4) {
                        /* empty */
                    }
                    for (/**/; (i_27_ ^ 0xffffffff) < -4; i_27_ -= 4) {
                        /* empty */
                    }
                    if ((i_27_ ^ 0xffffffff) < -1) {
                        is[i_25_] = 0;
                        continue;
                    }
                }
                is[i_25_] = 4096;
            }
        }
        anInt3842++;
        return is;
    }

    public static void method819(int i, int i_32_, int i_33_, boolean bool,
                                 int i_34_, int i_35_) {
        Class72.anInt1321 = i_35_;
        anInt3845++;
        PlayerDefinition.anInt2191 = i_34_;
        Class68_Sub20_Sub12.anInt4354 = i;
        if (bool != true)
            method816(20, -89);
        Class68_Sub13.anInt2943 = i_32_;
        Class8.anInt161 = i_33_;
        if (Class72.anInt1321 >= 100) {
            int i_36_ = 128 * Class8.anInt161 + 64;
            int i_37_ = 64 + PlayerDefinition.anInt2191 * 128;
            int i_38_ = (Class1_Sub6_Sub2.method163(i_36_, GameSocket.anInt1149,
                    i_37_, false)
                    + -Class68_Sub13.anInt2943);
            int i_39_ = i_37_ + -Class85.anInt1558;
            int i_40_ = -Class68_Sub5.anInt2833 + i_38_;
            int i_41_ = i_36_ - Class68_Sub7.anInt2862;
            int i_42_
                    = (int) Math.sqrt((double) (i_41_ * i_41_ + i_39_ * i_39_));
            Canvas_Sub1.anInt45
                    = ((int) (Math.atan2((double) i_40_, (double) i_42_) * 325.949)
                    & 0x7ff);
            Class74.anInt1333
                    = (int) (Math.atan2((double) i_41_, (double) i_39_)
                    * -325.949) & 0x7ff;
            if (Canvas_Sub1.anInt45 < 128)
                Canvas_Sub1.anInt45 = 128;
            if ((Canvas_Sub1.anInt45 ^ 0xffffffff) < -384)
                Canvas_Sub1.anInt45 = 383;
        }
        Class128.anInt2214 = 2;
    }

    static {
        aRSString_3838 = RSString.newRsString("Take");
        aRSString_3839 = RSString.newRsString("overlay2");
        anInt3833 = 0;
        aRSString_3847 = RSString.newRsString("Freie Welt");
        aRSString_3834 = aRSString_3838;
    }
}
