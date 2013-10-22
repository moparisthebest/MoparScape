/* Class68_Sub13_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class68_Sub13_Sub16 extends Class68_Sub13 {
    public static RSString aRSString_3694;
    public static int anInt3695;
    public int anInt3696;
    public static int[] anIntArray3697 = new int[5];
    public static int anInt3698;
    public int anInt3699;
    public static int anInt3700;
    public static int anInt3701;
    public static Login aLogin_3702;
    public static int anInt3703;
    public static int anInt3704;
    public static int anInt3705 = 0;
    public static int anInt3706;
    public static int anInt3707;
    public int anInt3708;
    public static boolean aBoolean3709;
    public static byte[][][] aByteArrayArrayArray3710;

    public static void method771(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 byte i_4_) {
        if (i_4_ > -58)
            anIntArray3697 = null;
        Class68_Sub13_Sub23.aClass92Array3825[0].method1527(i_2_, i);
        anInt3701++;
        Class68_Sub13_Sub23.aClass92Array3825[1].method1527(i_2_,
                i - (-i_3_ + 16));
        int i_5_ = (i_3_ - 32) * i_3_ / i_1_;
        if (i_5_ < 8)
            i_5_ = 8;
        int i_6_ = (-i_5_ + i_3_ + -32) * i_0_ / (i_1_ + -i_3_);
        Class79.method1439(i_2_, 16 + i, 16, i_3_ - 32, Class122.anInt2115);
        Class79.method1439(i_2_, i_6_ + (i + 16), 16, i_5_, Class64.anInt1191);
        Class79.method1431(i_2_, i + (16 - -i_6_), i_5_, Class35.anInt626);
        Class79.method1431(1 + i_2_, i_6_ + 16 + i, i_5_, Class35.anInt626);
        Class79.method1428(i_2_, 16 + (i + i_6_), 16, Class35.anInt626);
        Class79.method1428(i_2_, 17 + i - -i_6_, 16, Class35.anInt626);
        Class79.method1431(i_2_ - -15, i + 16 + i_6_, i_5_,
                Class68_Sub13_Sub1.anInt3453);
        Class79.method1431(i_2_ + 14, 17 + (i - -i_6_), -1 + i_5_,
                Class68_Sub13_Sub1.anInt3453);
        Class79.method1428(i_2_, i_6_ + (15 + i) + i_5_, 16,
                Class68_Sub13_Sub1.anInt3453);
        Class79.method1428(i_2_ + 1, 14 + i + (i_6_ + i_5_), 15,
                Class68_Sub13_Sub1.anInt3453);
    }

    public void method772(byte i, int i_7_) {
        anInt3703++;
        anInt3699 = i_7_ >> 973142724 & 0xff0;
        anInt3708 = (0xff0000 & i_7_) >> 1082264972;
        anInt3696 = 0xff0 & i_7_ << 725776228;
        if (i > -45)
            method697(64, true);
    }

    public static void method773(int i) {
        aByteArrayArrayArray3710 = null;
        aRSString_3694 = null;
        anIntArray3697 = null;
        aLogin_3702 = null;
        if (i >= -58)
            aBoolean3709 = false;
    }

    public Class68_Sub13_Sub16() {
        this(0);
    }

    public static void method774(int i, int i_8_, int i_9_) {
        Stream.aBoolean2984 = true;
        Class68_Sub20_Sub5.anInt4225 = i;
        Class86.anInt1567 = i_8_;
        Class68_Sub20_Sub7.anInt4260 = i_9_;
        Class68_Sub20_Sub15.anInt4400 = -1;
        ISAACRandomGen.anInt1489 = -1;
    }

    public static Class68_Sub20_Sub10[] method775(Class21renamed class21, int i,
                                                  int i_10_, byte i_11_) {
        if (i_11_ != 13)
            aBoolean3709 = true;
        anInt3698++;
        if (!Class68_Sub13_Sub36.method880(-29381, i_10_, class21, i))
            return null;
        return Class68_Sub13_Sub6.method721(-21477);
    }

    public Class68_Sub13_Sub16(int i) {
        super(0, false);
        method772((byte) -79, i);
    }

    public static void method776(Class68_Sub29 class68_sub29, int i) {
        Class68_Sub28_Sub1.doAction(class68_sub29, (byte) 124, 200000);
        if (i != 16)
            aBoolean3709 = true;
        anInt3707++;
    }

    public static boolean method777(int i, int i_12_, int i_13_, int i_14_) {
        if (!Class21renamed.method361(i, i_12_, i_13_))
            return false;
        int i_15_ = i_12_ << 7;
        int i_16_ = i_13_ << 7;
        if (Login.method1472(i_15_ + 1,
                (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i]
                        [i_12_][i_13_]) + i_14_,
                i_16_ + 1)
                && Login.method1472(i_15_ + 128 - 1,
                (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [i][i_12_ + 1][i_13_]) + i_14_,
                i_16_ + 1)
                && Login.method1472(i_15_ + 128 - 1,
                (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [i][i_12_ + 1][i_13_ + 1]) + i_14_,
                i_16_ + 128 - 1)
                && Login.method1472(i_15_ + 1,
                (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [i][i_12_][i_13_ + 1]) + i_14_,
                i_16_ + 128 - 1))
            return true;
        return false;
    }

    public static void method778(Class77 class77, int i, int i_17_, int i_18_,
                                 int i_19_, int i_20_, int i_21_,
                                 boolean bool) {
        int i_22_ = class77.anIntArray1381.length;
        for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
            int i_24_ = class77.anIntArray1381[i_23_] - Class25.anInt518;
            int i_25_
                    = class77.anIntArray1372[i_23_] - Class68_Sub17.anInt3033;
            int i_26_ = (class77.anIntArray1378[i_23_]
                    - Class68_Sub20_Sub12.anInt4355);
            int i_27_ = i_26_ * i_18_ + i_24_ * i_19_ >> 16;
            i_26_ = i_26_ * i_19_ - i_24_ * i_18_ >> 16;
            i_24_ = i_27_;
            i_27_ = i_25_ * i_17_ - i_26_ * i >> 16;
            i_26_ = i_25_ * i + i_26_ * i_17_ >> 16;
            i_25_ = i_27_;
            if (i_26_ < 50)
                return;
            if (class77.anIntArray1365 != null) {
                Class77.anIntArray1377[i_23_] = i_24_;
                Class77.anIntArray1367[i_23_] = i_25_;
                Class77.anIntArray1368[i_23_] = i_26_;
            }
            Class77.anIntArray1375[i_23_]
                    = Class62.anInt1164 + (i_24_ << 9) / i_26_;
            Class77.anIntArray1374[i_23_]
                    = Class62.anInt1160 + (i_25_ << 9) / i_26_;
        }
        Class62.anInt1153 = 0;
        i_22_ = class77.anIntArray1370.length;
        for (int i_28_ = 0; i_28_ < i_22_; i_28_++) {
            int i_29_ = class77.anIntArray1370[i_28_];
            int i_30_ = class77.anIntArray1366[i_28_];
            int i_31_ = class77.anIntArray1382[i_28_];
            int i_32_ = Class77.anIntArray1375[i_29_];
            int i_33_ = Class77.anIntArray1375[i_30_];
            int i_34_ = Class77.anIntArray1375[i_31_];
            int i_35_ = Class77.anIntArray1374[i_29_];
            int i_36_ = Class77.anIntArray1374[i_30_];
            int i_37_ = Class77.anIntArray1374[i_31_];
            if ((i_32_ - i_33_) * (i_37_ - i_36_) - (i_35_ - i_36_) * (i_34_
                    - i_33_)
                    > 0) {
                if (Stream.aBoolean2984
                        && (Class68_Sub20_Sub17.method1182
                        (Class86.anInt1567 + Class62.anInt1164,
                                Class68_Sub20_Sub7.anInt4260 + Class62.anInt1160,
                                i_35_, i_36_, i_37_, i_32_, i_33_, i_34_))) {
                    Class68_Sub20_Sub15.anInt4400 = i_20_;
                    ISAACRandomGen.anInt1489 = i_21_;
                }
                if (!bool) {
                    Class62.aBoolean1157 = false;
                    if (i_32_ < 0 || i_33_ < 0 || i_34_ < 0
                            || i_32_ > Class62.anInt1168
                            || i_33_ > Class62.anInt1168
                            || i_34_ > Class62.anInt1168)
                        Class62.aBoolean1157 = true;
                    if (class77.anIntArray1365 == null
                            || class77.anIntArray1365[i_28_] == -1) {
                        if (class77.anIntArray1386[i_28_] != 12345678)
                            Class62.method617(i_35_, i_36_, i_37_, i_32_,
                                    i_33_, i_34_,
                                    class77.anIntArray1386[i_28_],
                                    class77.anIntArray1385[i_28_],
                                    class77.anIntArray1379[i_28_]);
                    } else if (Class68_Sub22.aBoolean3149) {
                        if (class77.aBoolean1380)
                            Class62.method600(i_35_, i_36_, i_37_, i_32_,
                                    i_33_, i_34_,
                                    class77.anIntArray1386[i_28_],
                                    class77.anIntArray1385[i_28_],
                                    class77.anIntArray1379[i_28_],
                                    Class77.anIntArray1377[0],
                                    Class77.anIntArray1377[1],
                                    Class77.anIntArray1377[3],
                                    Class77.anIntArray1367[0],
                                    Class77.anIntArray1367[1],
                                    Class77.anIntArray1367[3],
                                    Class77.anIntArray1368[0],
                                    Class77.anIntArray1368[1],
                                    Class77.anIntArray1368[3],
                                    class77.anIntArray1365[i_28_]);
                        else
                            Class62.method600(i_35_, i_36_, i_37_, i_32_,
                                    i_33_, i_34_,
                                    class77.anIntArray1386[i_28_],
                                    class77.anIntArray1385[i_28_],
                                    class77.anIntArray1379[i_28_],
                                    Class77.anIntArray1377[i_29_],
                                    Class77.anIntArray1377[i_30_],
                                    Class77.anIntArray1377[i_31_],
                                    Class77.anIntArray1367[i_29_],
                                    Class77.anIntArray1367[i_30_],
                                    Class77.anIntArray1367[i_31_],
                                    Class77.anIntArray1368[i_29_],
                                    Class77.anIntArray1368[i_30_],
                                    Class77.anIntArray1368[i_31_],
                                    class77.anIntArray1365[i_28_]);
                    } else {
                        int i_38_
                                = Class62.anInterface4_1159
                                .method12(class77.anIntArray1365[i_28_], 6);
                        Class62.method617
                                (i_35_, i_36_, i_37_, i_32_, i_33_, i_34_,
                                        Class68_Sub13_Sub34.method871(i_38_,
                                                (class77
                                                        .anIntArray1386
                                                        [i_28_])),
                                        Class68_Sub13_Sub34.method871(i_38_,
                                                (class77
                                                        .anIntArray1385
                                                        [i_28_])),
                                        Class68_Sub13_Sub34.method871(i_38_,
                                                (class77
                                                        .anIntArray1379
                                                        [i_28_])));
                    }
                }
            }
        }
    }

    public void method700(Stream class68_sub14, int i, int i_39_) {
        anInt3706++;
        int i_40_ = i;
        if ((i_40_ ^ 0xffffffff) == -1)
            method772((byte) -84, class68_sub14.method921((byte) -52));
        if (i_39_ != -1)
            aBoolean3709 = true;
    }

    public int[][] method697(int i, boolean bool) {
        if (bool != true)
            aLogin_3702 = null;
        anInt3704++;
        int[][] is = aClass88_2939.method1496(i, (byte) -20);
        if (aClass88_2939.aBoolean1610) {
            int[] is_41_ = is[0];
            int[] is_42_ = is[1];
            int[] is_43_ = is[2];
            for (int i_44_ = 0;
                 ((i_44_ ^ 0xffffffff)
                         > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                 i_44_++) {
                is_41_[i_44_] = anInt3708;
                is_42_[i_44_] = anInt3699;
                is_43_[i_44_] = anInt3696;
            }
        }
        return is;
    }

    public static void method779(int i, Color color, RSString class100,
                                 boolean bool, int i_45_) {
        do {
            try {
                anInt3700++;
                try {
                    Graphics graphics = Class86.aCanvas1585.getGraphics();
                    if (Class68_Sub20_Sub2.aFont4190 == null) {
                        Class68_Sub20_Sub2.aFont4190
                                = new Font("Helvetica", 1, 13);
                        Class118.aFontMetrics2074
                                = (Class86.aCanvas1585.getFontMetrics
                                (Class68_Sub20_Sub2.aFont4190));
                    }
                    if (bool) {
                        graphics.setColor(Color.black);
                        graphics.fillRect(0, 0, Class13_Sub3.width,
                                Class68_Sub13_Sub9.height);
                    }
                    if (color == null)
                        color = new Color(140, 17, 17);
                    try {
                        // xxx not background image
//                        Unknown.anImage1622 = client.bgImage;
//                        System.out.println("set the image: "+Unknown.anImage1622);
//                        if (Unknown.anImage1622 == null) {
                        Unknown.anImage1622 = Class86.aCanvas1585.createImage(304, 34);
                        //Unknown.anImage1622 = java.awt.Toolkit.getDefaultToolkit().getImage(new java.net.URL("http://i41.tinypic.com/5yg22a.png"));
//                        }
                        if (i_45_ != 23189)
                            method777(125, -44, -120, -27);
                        Graphics graphics_46_
                                = Unknown.anImage1622.getGraphics();
                        graphics_46_.setColor(color);
                        graphics_46_.drawRect(0, 0, 303, 33);
                        graphics_46_.fillRect(2, 2, i * 3, 30);
                        graphics_46_.setColor(Color.black);
                        graphics_46_.drawRect(1, 1, 301, 31);
                        graphics_46_.fillRect(3 * i + 2, 2, 300 + -(3 * i),
                                30);
                        graphics_46_.setFont(Class68_Sub20_Sub2.aFont4190);
                        graphics_46_.setColor(Color.white);
                        class100.method1583
                                ((-class100.method1591((byte) 101,
                                        Class118.aFontMetrics2074)
                                        + 304) / 2,
                                        22, graphics_46_, -42);
                        graphics.drawImage(Unknown.anImage1622,
                                Class13_Sub3.width / 2 + -152,
                                (Class68_Sub13_Sub9.height / 2
                                        - 18),
                                null);
                    } catch (Exception exception) {
                        int i_47_ = Class13_Sub3.width / 2 + -152;
                        int i_48_ = Class68_Sub13_Sub9.height / 2 + -18;
                        graphics.setColor(color);
                        graphics.drawRect(i_47_, i_48_, 303, 33);
                        graphics.fillRect(i_47_ - -2, i_48_ - -2, i * 3, 30);
                        graphics.setColor(Color.black);
                        graphics.drawRect(i_47_ + 1, i_48_ + 1, 301, 31);
                        graphics.fillRect(3 * i + (2 + i_47_), 2 + i_48_,
                                -(3 * i) + 300, 30);
                        graphics.setFont(Class68_Sub20_Sub2.aFont4190);
                        graphics.setColor(Color.white);
                        class100.method1583
                                ((-class100.method1591((byte) 117,
                                        Class118.aFontMetrics2074)
                                        + 304) / 2 + i_47_,
                                        22 + i_48_, graphics, -85);
                    }
                    if (Class68_Sub4.aRSString_2819 == null)
                        break;
                    graphics.setFont(Class68_Sub20_Sub2.aFont4190);
                    graphics.setColor(Color.white);
                    Class68_Sub4.aRSString_2819.method1583
                            ((Class13_Sub3.width / 2
                                    - (Class68_Sub4.aRSString_2819.method1591
                                    ((byte) 91, Class118.aFontMetrics2074)) / 2),
                                    -26 + Class68_Sub13_Sub9.height / 2, graphics,
                                    i_45_ ^ ~0x5aad);
                } catch (Exception exception) {
                    Class86.aCanvas1585.repaint();
                }
                break;
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("j.H(" + i + ','
                                + (color != null ? "{...}" : "null")
                                + ','
                                + (class100 != null ? "{...}"
                                : "null")
                                + ',' + bool + ',' + i_45_ + ')'));
            }
        } while (false);
    }

    static {
        aRSString_3694 = RSString.newRsString("cookiehost");
        aLogin_3702 = new Login(128);
        aBoolean3709 = false;
    }
}
