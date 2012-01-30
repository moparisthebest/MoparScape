/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Method;

public class Class53 {
    public int anInt1015;
    public static int anInt1016;
    public int anInt1017;
    public static int anInt1018;
    public static int anInt1019;
    public static int[] anIntArray1020;
    public static int anInt1021;
    public int anInt1022;
    public static int anInt1023;
    public static int anInt1024;
    public int anInt1025;
    public int anInt1026 = 0;
    public int anInt1027;

    public static void method545(Component component, int i) {
        anInt1016++;
        Method method = SignLink.setFocusTraversalKeysEnabled;
        if (method != null) {
            try {
                method.invoke(component, new Object[]{Boolean.FALSE});
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        component.addKeyListener(Class66.aClass123_1200);
        //xxx
        if(client.keyListener != null)
            component.addKeyListener(client.keyListener);
        if (i != 1611550343)
            method545(null, -119);
        component.addFocusListener(Class66.aClass123_1200);
    }

    public void method546(int i, int i_0_, Stream class68_sub14) {
        for (; ; ) {
            int i_1_ = class68_sub14.readUnsignedByte(i + -6677);
            if (i_1_ == 0)
                break;
            method548(30704, i_0_, i_1_, class68_sub14);
        }
        if (i == 0)
            anInt1018++;
    }

    public static int method547(byte i, int i_2_, int i_3_) {
        anInt1023++;
        if ((i_2_ ^ 0xffffffff) == 1)
            return 12345678;
        if ((i_2_ ^ 0xffffffff) == 0) {
            if (i_3_ < 2)
                i_3_ = 2;
            else if (i_3_ > 126)
                i_3_ = 126;
            return i_3_;
        }
        if (i != -91)
            method550((byte) -126);
        i_3_ = i_3_ * (0x7f & i_2_) >> 1611550343;
        if (i_3_ < 2)
            i_3_ = 2;
        else if ((i_3_ ^ 0xffffffff) < -127)
            i_3_ = 126;
        return i_3_ + (0xff80 & i_2_);
    }

    public void method548(int i, int i_4_, int i_5_,
                          Stream class68_sub14) {
        if (i_5_ != 1) {
            if (i_5_ != 2) {
                if ((i_5_ ^ 0xffffffff) == -4)
                    class68_sub14.readUnsignedWord(1355769544);
            } else {
                anInt1025 = class68_sub14.readUnsignedWord(1355769544);
                if (anInt1025 == 65535)
                    anInt1025 = -1;
            }
        } else {
            anInt1026 = class68_sub14.method921((byte) -119);
            method549(-1, anInt1026);
        }
        if (i != 30704)
            anInt1026 = -84;
        anInt1021++;
    }

    public void method549(int i, int i_6_) {
        anInt1024++;
        double d = (double) ((0xff3eb5 & i_6_) >> -1197475216) / 256.0;
        double d_7_ = (double) (0xff & i_6_ >> -715674776) / 256.0;
        double d_8_ = (double) (0xff & i_6_) / 256.0;
        double d_9_ = d;
        double d_10_ = d;
        if (d_10_ < d_7_)
            d_10_ = d_7_;
        if (d_9_ > d_7_)
            d_9_ = d_7_;
        double d_11_ = 0.0;
        if (d_10_ < d_8_)
            d_10_ = d_8_;
        if (d_8_ < d_9_)
            d_9_ = d_8_;
        double d_12_ = 0.0;
        double d_13_ = (d_9_ + d_10_) / 2.0;
        anInt1017 = (int) (256.0 * d_13_);
        if (i >= (anInt1017 ^ 0xffffffff)) {
            if (anInt1017 > 255)
                anInt1017 = 255;
        } else
            anInt1017 = 0;
        if (d_10_ != d_9_) {
            if (d_13_ < 0.5)
                d_12_ = (-d_9_ + d_10_) / (d_9_ + d_10_);
            if (d != d_10_) {
                if (d_10_ != d_7_) {
                    if (d_10_ == d_8_)
                        d_11_ = 4.0 + (-d_7_ + d) / (-d_9_ + d_10_);
                } else
                    d_11_ = (-d + d_8_) / (-d_9_ + d_10_) + 2.0;
            } else
                d_11_ = (-d_8_ + d_7_) / (d_10_ - d_9_);
            if (d_13_ >= 0.5)
                d_12_ = (d_10_ - d_9_) / (-d_9_ + (-d_10_ + 2.0));
        }
        d_11_ /= 6.0;
        anInt1027 = (int) (d_12_ * 256.0);
        if (d_13_ > 0.5)
            anInt1015 = (int) ((-d_13_ + 1.0) * d_12_ * 512.0);
        else
            anInt1015 = (int) (512.0 * (d_13_ * d_12_));
        if (anInt1027 >= 0) {
            if (anInt1027 > 255)
                anInt1027 = 255;
        } else
            anInt1027 = 0;
        if (anInt1015 < 1)
            anInt1015 = 1;
        anInt1022 = (int) ((double) anInt1015 * d_11_);
    }

    public static void method550(byte i) {
        anIntArray1020 = null;
        if (i != -28)
            method545(null, 22);
    }

    public static void method551(int i, byte i_14_, int i_15_, Class45 class45,
                                 int i_16_, int i_17_, int i_18_) {
        anInt1019++;
        if (i_14_ <= 96)
            anIntArray1020 = null;
        int i_19_ = i_15_ * i_15_ + i_18_ * i_18_;
        if (i_19_ <= 360000) {
            int i_20_ = Math.min(class45.anInt892 / 2, class45.anInt873 / 2);
            if ((i_20_ * i_20_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) {
                i_20_ -= 10;
                int i_21_
                        = Class68_Sub13_Sub26.anInt3883 + Class8.anInt163 & 0x7ff;
                int i_22_ = Class62.anIntArray1155[i_21_];
                i_22_ = i_22_ * 256 / (256 + Class68_Sub20_Sub16.anInt4420);
                int i_23_ = Class62.anIntArray1167[i_21_];
                i_23_ = 256 * i_23_ / (Class68_Sub20_Sub16.anInt4420 - -256);
                int i_24_ = i_18_ * i_22_ + i_15_ * i_23_ >> 683275280;
                int i_25_ = -(i_22_ * i_15_) + i_23_ * i_18_ >> 823015568;
                double d = Math.atan2((double) i_24_, (double) i_25_);
                int i_26_ = (int) (Math.sin(d) * (double) i_20_);
                int i_27_ = (int) ((double) i_20_ * Math.cos(d));
                ((Sprite)
                        Class88.aClass68_Sub20_Sub10Array1608[i])
                        .method1121
                                (-10 + i_17_ - -(class45.anInt892 / 2) + i_26_,
                                        -10 + (-i_27_ + i_16_ + class45.anInt873 / 2), 20, 20, 15,
                                        15, d, 256);
            } else
                Class33.method413(i_18_, -90, class45, i_17_, i_15_,
                        Class70.aClass68_Sub20_Sub10Array1286[i],
                        i_16_);
        }
    }

    public Class53() {
        anInt1025 = -1;
    }
}
