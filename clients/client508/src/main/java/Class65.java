/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.PixelGrabber;

public class Class65 {
    public static String aString1194
            = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| "
            + String.valueOf('\u00c4') + String.valueOf('\u00cb')
            + String.valueOf('\u00cf') + String.valueOf('\u00d6')
            + String.valueOf('\u00dc') + String.valueOf('\u00e4')
            + String.valueOf('\u00eb') + String.valueOf('\u00ef')
            + String.valueOf('\u00f6') + String.valueOf('\u00fc')
            + String.valueOf('\u00ff') + String.valueOf('\u00df'));
    public int anInt1195 = 0;
    public byte[] aByteArray1196;
    public boolean aBoolean1197 = false;
    public static int anInt1198 = aString1194.length();
    public static int[] anIntArray1199 = new int[256];

    public void method626(Font font, FontMetrics fontmetrics, char c, int i,
                          boolean bool) {
        int i_0_ = fontmetrics.charWidth(c);
        int i_1_ = i_0_;
        if (bool) {
            try {
                if (c == '/')
                    bool = false;
                if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k'
                        || c == 'x' || c == 'y' || c == 'A' || c == 'V'
                        || c == 'W')
                    i_0_++;
            } catch (Exception exception) {
                /* empty */
            }
        }
        int i_2_ = fontmetrics.getMaxAscent();
        int i_3_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
        int i_4_ = fontmetrics.getHeight();
//        Image image = client.bgImage;
//        System.out.println("set the image: "+image);
//        if (image == null)
        Image image = Class86.aCanvas1585.createImage(i_0_, i_3_);
//        else
//            System.out.println("--------------not null image?");
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, i_0_, i_3_);
        graphics.setColor(Color.white);
        graphics.setFont(font);
        graphics.drawString(String.valueOf(c), 0, i_2_);
        if (bool)
            graphics.drawString(String.valueOf(c), 1, i_2_);
        int[] is = new int[i_0_ * i_3_];
        PixelGrabber pixelgrabber
                = new PixelGrabber(image, 0, 0, i_0_, i_3_, is, 0, i_0_);
        try {
            pixelgrabber.grabPixels();
        } catch (Exception exception) {
            /* empty */
        }
        image.flush();
        Object object = null;
        int i_5_ = 0;
        int i_6_ = 0;
        int i_7_ = i_0_;
        int i_8_ = i_3_;
        while_72_:
        for (int i_9_ = 0; i_9_ < i_3_; i_9_++) {
            for (int i_10_ = 0; i_10_ < i_0_; i_10_++) {
                int i_11_ = is[i_10_ + i_9_ * i_0_];
                if ((i_11_ & 0xffffff) != 0) {
                    i_6_ = i_9_;
                    break while_72_;
                }
            }
        }
        while_73_:
        for (int i_12_ = 0; i_12_ < i_0_; i_12_++) {
            for (int i_13_ = 0; i_13_ < i_3_; i_13_++) {
                int i_14_ = is[i_12_ + i_13_ * i_0_];
                if ((i_14_ & 0xffffff) != 0) {
                    i_5_ = i_12_;
                    break while_73_;
                }
            }
        }
        while_74_:
        for (int i_15_ = i_3_ - 1; i_15_ >= 0; i_15_--) {
            for (int i_16_ = 0; i_16_ < i_0_; i_16_++) {
                int i_17_ = is[i_16_ + i_15_ * i_0_];
                if ((i_17_ & 0xffffff) != 0) {
                    i_8_ = i_15_ + 1;
                    break while_74_;
                }
            }
        }
        while_75_:
        for (int i_18_ = i_0_ - 1; i_18_ >= 0; i_18_--) {
            for (int i_19_ = 0; i_19_ < i_3_; i_19_++) {
                int i_20_ = is[i_18_ + i_19_ * i_0_];
                if ((i_20_ & 0xffffff) != 0) {
                    i_7_ = i_18_ + 1;
                    break while_75_;
                }
            }
        }
        aByteArray1196[i * 9] = (byte) (anInt1195 / 16384);
        aByteArray1196[i * 9 + 1] = (byte) (anInt1195 / 128 & 0x7f);
        aByteArray1196[i * 9 + 2] = (byte) (anInt1195 & 0x7f);
        aByteArray1196[i * 9 + 3] = (byte) (i_7_ - i_5_);
        aByteArray1196[i * 9 + 4] = (byte) (i_8_ - i_6_);
        aByteArray1196[i * 9 + 5] = (byte) i_5_;
        aByteArray1196[i * 9 + 6] = (byte) (i_2_ - i_6_);
        aByteArray1196[i * 9 + 7] = (byte) i_1_;
        aByteArray1196[i * 9 + 8] = (byte) i_4_;
        for (int i_21_ = i_6_; i_21_ < i_8_; i_21_++) {
            for (int i_22_ = i_5_; i_22_ < i_7_; i_22_++) {
                int i_23_ = is[i_22_ + i_21_ * i_0_] & 0xff;
                if (i_23_ > 30 && i_23_ < 230)
                    aBoolean1197 = true;
                aByteArray1196[anInt1195++] = (byte) i_23_;
            }
        }
    }

    public int method627() {
        return aByteArray1196[8] - 1;
    }

    public void method628(int i, int i_24_, int i_25_, int i_26_, byte[] is) {
        int i_27_ = i_24_ + is[i + 5];
        int i_28_ = i_25_ - is[i + 6];
        int i_29_ = is[i + 3];
        int i_30_ = is[i + 4];
        int i_31_ = is[i] * 16384 + is[i + 1] * 128 + is[i + 2];
        int i_32_ = i_27_ + i_28_ * Class79.anInt1401;
        int i_33_ = Class79.anInt1401 - i_29_;
        int i_34_ = 0;
        if (i_28_ < Class79.anInt1403) {
            int i_35_ = Class79.anInt1403 - i_28_;
            i_30_ -= i_35_;
            i_28_ = Class79.anInt1403;
            i_31_ += i_35_ * i_29_;
            i_32_ += i_35_ * Class79.anInt1401;
        }
        if (i_28_ + i_30_ >= Class79.anInt1404)
            i_30_ -= i_28_ + i_30_ - Class79.anInt1404 + 1;
        if (i_27_ < Class79.anInt1400) {
            int i_36_ = Class79.anInt1400 - i_27_;
            i_29_ -= i_36_;
            i_27_ = Class79.anInt1400;
            i_31_ += i_36_;
            i_32_ += i_36_;
            i_34_ += i_36_;
            i_33_ += i_36_;
        }
        if (i_27_ + i_29_ >= Class79.anInt1398) {
            int i_37_ = i_27_ + i_29_ - Class79.anInt1398 + 1;
            i_29_ -= i_37_;
            i_34_ += i_37_;
            i_33_ += i_37_;
        }
        if (i_29_ > 0 && i_30_ > 0) {
            if (aBoolean1197)
                method631(Class79.anIntArray1402, is, i_26_, i_31_, i_32_,
                        i_29_, i_30_, i_33_, i_34_);
            else
                method635(Class79.anIntArray1402, is, i_26_, i_31_, i_32_,
                        i_29_, i_30_, i_33_, i_34_);
        }
    }

    public int method629() {
        return aByteArray1196[6];
    }

    public void method630(RSString class100, int i, int i_38_, int i_39_,
                          boolean bool) {
        int i_40_ = method634(class100) / 2;
        int i_41_ = method629();
        if (i - i_40_ <= Class79.anInt1398 && i + i_40_ >= Class79.anInt1400
                && i_38_ - i_41_ <= Class79.anInt1404 && i_38_ >= 0)
            method633(class100, i - i_40_, i_38_, i_39_, bool);
    }

    public void method631(int[] is, byte[] is_42_, int i, int i_43_, int i_44_,
                          int i_45_, int i_46_, int i_47_, int i_48_) {
        for (int i_49_ = -i_46_; i_49_ < 0; i_49_++) {
            for (int i_50_ = -i_45_; i_50_ < 0; i_50_++) {
                int i_51_ = is_42_[i_43_++] & 0xff;
                if (i_51_ > 30) {
                    if (i_51_ >= 230)
                        is[i_44_++] = i;
                    else {
                        int i_52_ = is[i_44_];
                        is[i_44_++] = ((((i & 0xff00ff) * i_51_
                                + (i_52_ & 0xff00ff) * (256 - i_51_))
                                & ~0xff00ff)
                                + (((i & 0xff00) * i_51_
                                + (i_52_ & 0xff00) * (256 - i_51_))
                                & 0xff0000)) >> 8;
                    }
                } else
                    i_44_++;
            }
            i_44_ += i_47_;
            i_43_ += i_48_;
        }
    }

    public static void method632() {
        aString1194 = null;
        anIntArray1199 = null;
    }

    public Class65(int i, boolean bool, Component component) {
        aByteArray1196 = new byte[100000];
        anInt1195 = anInt1198 * 9;
        aBoolean1197 = false;
        Font font = new Font("Helvetica", bool ? 1 : 0, i);
        FontMetrics fontmetrics = component.getFontMetrics(font);
        for (int i_53_ = 0; i_53_ < anInt1198; i_53_++)
            method626(font, fontmetrics, aString1194.charAt(i_53_), i_53_,
                    false);
        if (bool && aBoolean1197) {
            anInt1195 = anInt1198 * 9;
            aBoolean1197 = false;
            font = new Font("Helvetica", 0, i);
            fontmetrics = component.getFontMetrics(font);
            for (int i_54_ = 0; i_54_ < anInt1198; i_54_++)
                method626(font, fontmetrics, aString1194.charAt(i_54_), i_54_,
                        false);
            if (!aBoolean1197) {
                anInt1195 = anInt1198 * 9;
                aBoolean1197 = false;
                for (int i_55_ = 0; i_55_ < anInt1198; i_55_++)
                    method626(font, fontmetrics, aString1194.charAt(i_55_),
                            i_55_, true);
            }
        }
        byte[] is = new byte[anInt1195];
        for (int i_56_ = 0; i_56_ < anInt1195; i_56_++)
            is[i_56_] = aByteArray1196[i_56_];
        aByteArray1196 = is;
    }

    public void method633(RSString class100, int i, int i_57_, int i_58_,
                          boolean bool) {
        if (aBoolean1197 || i_58_ == 0)
            bool = false;
        for (int i_59_ = 0; i_59_ < class100.method1590((byte) -111);
             i_59_++) {
            int i_60_ = anIntArray1199[class100.method1578(i_59_, 7178)];
            if (bool) {
                method628(i_60_, i + 1, i_57_, 1, aByteArray1196);
                method628(i_60_, i, i_57_ + 1, 1, aByteArray1196);
            }
            method628(i_60_, i, i_57_, i_58_, aByteArray1196);
            i += aByteArray1196[i_60_ + 7];
        }
    }

    public int method634(RSString class100) {
        int i = 0;
        for (int i_61_ = 0; i_61_ < class100.method1590((byte) -107);
             i_61_++) {
            if (class100.method1578(i_61_, 7178) == 64
                    && i_61_ + 4 < class100.method1590((byte) -126)
                    && class100.method1578(i_61_ + 4, 7178) == 64)
                i_61_ += 4;
            else if (class100.method1578(i_61_, 7178) == 126
                    && i_61_ + 4 < class100.method1590((byte) -127)
                    && class100.method1578(i_61_ + 4, 7178) == 126)
                i_61_ += 4;
            else
                i += (aByteArray1196
                        [anIntArray1199[class100.method1578(i_61_, 7178)] + 7]);
        }
        return i;
    }

    public void method635(int[] is, byte[] is_62_, int i, int i_63_, int i_64_,
                          int i_65_, int i_66_, int i_67_, int i_68_) {
        int i_69_ = -(i_65_ >> 2);
        i_65_ = -(i_65_ & 0x3);
        for (int i_70_ = -i_66_; i_70_ < 0; i_70_++) {
            for (int i_71_ = i_69_; i_71_ < 0; i_71_++) {
                if (is_62_[i_63_++] != 0)
                    is[i_64_++] = i;
                else
                    i_64_++;
                if (is_62_[i_63_++] != 0)
                    is[i_64_++] = i;
                else
                    i_64_++;
                if (is_62_[i_63_++] != 0)
                    is[i_64_++] = i;
                else
                    i_64_++;
                if (is_62_[i_63_++] != 0)
                    is[i_64_++] = i;
                else
                    i_64_++;
            }
            for (int i_72_ = i_65_; i_72_ < 0; i_72_++) {
                if (is_62_[i_63_++] != 0)
                    is[i_64_++] = i;
                else
                    i_64_++;
            }
            i_64_ += i_67_;
            i_63_ += i_68_;
        }
    }

    static {
        for (int i = 0; i < 256; i++) {
            int i_73_ = aString1194.indexOf(i);
            if (i_73_ == -1)
                i_73_ = 74;
            anIntArray1199[i] = i_73_ * 9;
        }
    }
}
