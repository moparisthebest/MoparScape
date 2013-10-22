/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class74 {
    public static boolean aBoolean1324 = true;
    public static int anInt1325;
    public static int anInt1326;
    public static int anInt1327;
    public static int anInt1328;
    public static int anInt1329;
    public static Stream aStream_1330 = new Stream(8);
    public static RSString aRSString_1331;
    public static RSString aRSString_1332;
    public static int anInt1333;
    public static RSString aRSString_1334 = RSString.newRsString("slide:");
    public static int[][][] anIntArrayArrayArray1335;
    public static int[][][] anIntArrayArrayArray1336;
    public static RSString aRSString_1337;
    public static RSString aRSString_1338;

    public static void method1379(int i) {
        aRSString_1332 = null;
        aRSString_1338 = null;
        aRSString_1331 = null;
        aRSString_1337 = null;
        aStream_1330 = null;
        aRSString_1334 = null;
        anIntArrayArrayArray1335 = null;
        anIntArrayArrayArray1336 = null;
        if (i > -2)
            aStream_1330 = null;
    }

    public static Sprite method1380(int i) {
        anInt1327++;
        if (i != -14452)
            aStream_1330 = null;
        byte[] is = Class69.aByteArrayArray1240[0];
        int i_0_ = (Class68_Sub13_Sub12.anIntArray3639[0]
                * Class68_Sub13_Sub19.anIntArray3757[0]);
        Sprite sprite;
        if (!Class68_Sub10.aBooleanArray2905[0]) {
            int[] is_1_ = new int[i_0_];
            for (int i_2_ = 0; i_0_ > i_2_; i_2_++)
                is_1_[i_2_] = (Class68_Sub13_Sub17.anIntArray3719
                        [Class120.method1740(is[i_2_], 255)]);
            sprite
                    = (new Sprite
                    (Class97.anInt1703, Class68_Sub20_Sub15.anInt4405,
                            Class4.anIntArray96[0], Class116.anIntArray1996[0],
                            Class68_Sub13_Sub12.anIntArray3639[0],
                            Class68_Sub13_Sub19.anIntArray3757[0], is_1_));
        } else {
            byte[] is_3_ = Class3.aByteArrayArray78[0];
            int[] is_4_ = new int[i_0_];
            for (int i_5_ = 0; (i_0_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
                 i_5_++)
                is_4_[i_5_]
                        = Class70.method1335((Class68_Sub13_Sub17.anIntArray3719
                        [Class120.method1740(is[i_5_],
                        255)]),
                        (Class120.method1740(255, is_3_[i_5_])
                                << -1318416968));
            sprite
                    = (new Sprite_Sub1
                    (Class97.anInt1703, Class68_Sub20_Sub15.anInt4405,
                            Class4.anIntArray96[0], Class116.anIntArray1996[0],
                            Class68_Sub13_Sub12.anIntArray3639[0],
                            Class68_Sub13_Sub19.anIntArray3757[0], is_4_));
        }
        Class87.method1487((byte) -93);
        return sprite;
    }

    public static void method1381(boolean bool, RSString class100, int i) {
        anInt1329++;
        int i_6_ = 4;
        int i_7_ = i_6_ + 6;
        if (i != -16678)
            method1384(79L, 67, 108, 3, null, -121, 64);
        int i_8_ = 6 + i_6_;
        int i_9_
                = Class68_Sub6.aClass68_Sub20_Sub1_2847.method1018(class100, 250);
        int i_10_
                = 13 * Class68_Sub6.aClass68_Sub20_Sub1_2847.method1020(class100,
                250);
        Class79.method1439(-i_6_ + i_7_, -i_6_ + i_8_, i_6_ + i_6_ + i_9_,
                i_6_ + i_6_ + i_10_, 0);
        Class79.method1415(i_7_ + -i_6_, i_8_ - i_6_, i_6_ + i_9_ - -i_6_,
                i_10_ - (-i_6_ + -i_6_), 16777215);
        Class68_Sub6.aClass68_Sub20_Sub1_2847.method1019(class100, i_7_, i_8_,
                i_9_, i_10_, 16777215,
                -1, 1, 1, 0);
        Class127.method1781(-i_6_ + i_7_, i_8_ - i_6_, i_6_ + (i_6_ + i_9_),
                i_10_ - -i_6_ + i_6_, (byte) -62);
        if (!bool)
            Class13.method242(-121, i_9_, i_10_, i_7_, i_8_);
        else {
            try {
                Graphics graphics = Class86.aCanvas1585.getGraphics();
                Class1_Sub5.aClass72_2496.method1350(99, 0, 0, graphics);
            } catch (Exception exception) {
                Class86.aCanvas1585.repaint();
            }
        }
    }

    public static int method1382(int i, int i_11_) {
        double d = (double) (i >> 547338608 & 0xff) / 256.0;
        double d_12_ = (double) (0xff & i) / 256.0;
        anInt1325++;
        int i_13_ = -26 % ((i_11_ - 61) / 33);
        double d_14_ = (double) ((i & 0xfff1) >> -806508568) / 256.0;
        double d_15_ = 0.0;
        double d_16_ = d;
        if (d_16_ > d_14_)
            d_16_ = d_14_;
        if (d_16_ > d_12_)
            d_16_ = d_12_;
        double d_17_ = d;
        if (d_17_ < d_14_)
            d_17_ = d_14_;
        double d_18_ = 0.0;
        if (d_17_ < d_12_)
            d_17_ = d_12_;
        double d_19_ = (d_17_ + d_16_) / 2.0;
        int i_20_ = (int) (256.0 * d_19_);
        if ((i_20_ ^ 0xffffffff) > -1)
            i_20_ = 0;
        else if ((i_20_ ^ 0xffffffff) < -256)
            i_20_ = 255;
        if (d_17_ != d_16_) {
            if (d_19_ < 0.5)
                d_18_ = (-d_16_ + d_17_) / (d_16_ + d_17_);
            if (d_19_ >= 0.5)
                d_18_ = (d_17_ - d_16_) / (-d_17_ + 2.0 - d_16_);
            if (d == d_17_)
                d_15_ = (-d_12_ + d_14_) / (d_17_ - d_16_);
            else if (d_17_ == d_14_)
                d_15_ = 2.0 + (-d + d_12_) / (d_17_ - d_16_);
            else if (d_12_ == d_17_)
                d_15_ = (-d_14_ + d) / (-d_16_ + d_17_) + 4.0;
        }
        int i_21_ = (int) (d_18_ * 256.0);
        d_15_ /= 6.0;
        if (i_21_ < 0)
            i_21_ = 0;
        else if ((i_21_ ^ 0xffffffff) < -256)
            i_21_ = 255;
        int i_22_ = (int) (d_15_ * 256.0);
        if (i_20_ > 243)
            i_21_ >>= 4;
        else if ((i_20_ ^ 0xffffffff) >= -218) {
            if ((i_20_ ^ 0xffffffff) >= -193) {
                if ((i_20_ ^ 0xffffffff) < -180)
                    i_21_ >>= 1;
            } else
                i_21_ >>= 2;
        } else
            i_21_ >>= 3;
        return ((i_20_ >> 1191709857)
                + ((i_21_ >> -1297034779 << 1201007751)
                + (i_22_ >> -1173640894 << 1118688394)));
    }

    public static Class92 method1383(int i) {
        anInt1326++;
        Class92_Sub1 class92_sub1
                = new Class92_Sub1(Class97.anInt1703,
                Class68_Sub20_Sub15.anInt4405,
                Class4.anIntArray96[0],
                Class116.anIntArray1996[0],
                Class68_Sub13_Sub12.anIntArray3639[0],
                Class68_Sub13_Sub19.anIntArray3757[i],
                Class69.aByteArrayArray1240[0],
                Class68_Sub13_Sub17.anIntArray3719);
        Class87.method1487((byte) -93);
        return class92_sub1;
    }

    public static void method1384(long l, int i, int i_23_, int i_24_,
                                  RSString class100, int i_25_, int i_26_) {
        try {
            anInt1328++;
            Stream class68_sub14 = new Stream(128);
            class68_sub14.writeByte(10);
            class68_sub14.writeWord((int) (Math.random() * 99999.0));
            class68_sub14.writeWord(508);
            class68_sub14.writeQWord(true, l);
            class68_sub14.writeDWord(
                    (int) (Math.random() * 9.9999999E7));
            class68_sub14.writeString(class100);
            class68_sub14.writeDWord(
                    (int) (9.9999999E7 * Math.random()));
            class68_sub14.writeWord(Class68_Sub13_Sub20.anInt3780);
            class68_sub14.writeByte(i);
            int i_27_ = -21 / ((-52 - i_23_) / 55);
            class68_sub14.writeByte(i_24_);
            class68_sub14.writeDWord(
                    (int) (Math.random() * 9.9999999E7));
            class68_sub14.writeWord(i_26_);
            class68_sub14.writeWord(i_25_);
            class68_sub14.writeDWord(
                    (int) (9.9999999E7 * Math.random()));
            class68_sub14.doKeys();
            Class21renamed.stream.currentOffset = 0;
            Class21renamed.stream.writeByte(48);
            Class21renamed.stream.writeByte(
                    class68_sub14.currentOffset);
            Class21renamed.stream.writeBytes(class68_sub14.currentOffset, 0,
                    (class68_sub14
                            .buffer));
            Class68_Sub13_Sub27.anInt3914 = 1;
            Class64.anInt1190 = 0;
            Class50.anInt980 = -3;
            Class88.anInt1602 = 0;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("mg.E(" + l + ',' + i + ',' + i_23_
                            + ',' + i_24_ + ','
                            + (class100 != null ? "{...}" : "null")
                            + ',' + i_25_ + ',' + i_26_ + ')'));
        }
    }

    static {
        aRSString_1332 = aRSString_1334;
        aRSString_1337 = RSString.newRsString("Loading title screen )2 ");
        aRSString_1331 = aRSString_1337;
        aRSString_1338 = aRSString_1334;
    }
}
