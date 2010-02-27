/* Class68_Sub13_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

final class Class68_Sub13_Sub16 extends Class68_Sub13
{
    static MutableString aClass100_3696;
    static int anInt3697;
    private int anInt3698;
    static int[] anIntArray3699 = new int[5];
    static int anInt3700;
    private int anInt3701;
    static int anInt3702;
    static int anInt3703;
    static Login aClass82_3704;
    static int anInt3705;
    static int anInt3706;
    static int anInt3707 = 0;
    static int anInt3708;
    static int anInt3709;
    private int anInt3710;
    static boolean aBoolean3711;
    static byte[][][] aByteArrayArrayArray3712;

    static final void method771(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte i_4_)
    {
        if (i_4_ > -58)
            anIntArray3699 = null;
        Class68_Sub13_Sub23.aClass92Array3827[0].method1533(i_2_, i);
        anInt3703++;
        Class68_Sub13_Sub23.aClass92Array3827[1].method1533(i_2_, i - (16 - i_3_));
        int i_5_ = (i_3_ - 32) * i_3_ / i_1_;
        if (i_5_ < 8)
            i_5_ = 8;
        int i_6_ = (i_3_ - i_5_ - 32) * i_0_ / (i_1_ - i_3_);
        Class79.method1445(i_2_, i + 16, 16, i_3_ - 32, Class122.anInt2117);
        Class79.method1445(i_2_, i_6_ + (i + 16), 16, i_5_, Object1.anInt1191);
        Class79.method1437(i_2_, i + (i_6_ + 16), i_5_, Class35.anInt626);
        Class79.method1437(i_2_ + 1, i_6_ + 16 + i, i_5_, Class35.anInt626);
        Class79.method1434(i_2_, i + i_6_ + 16, 16, Class35.anInt626);
        Class79.method1434(i_2_, i + 17 + i_6_, 16, Class35.anInt626);
        Class79.method1437(i_2_ + 15, i + 16 + i_6_, i_5_, Class68_Sub13_Sub1.anInt3455);
        Class79.method1437(i_2_ + 14, i + i_6_ + 17, i_5_ - 1, Class68_Sub13_Sub1.anInt3455);
        Class79.method1434(i_2_, i_6_ + (i + 15) + i_5_, 16, Class68_Sub13_Sub1.anInt3455);
        Class79.method1434(i_2_ + 1, i + 14 + (i_6_ + i_5_), 15, Class68_Sub13_Sub1.anInt3455);
    }

    private final void method772(byte i, int i_7_)
    {
        anInt3705++;
        anInt3701 = i_7_ >> 4 & 0xff0;
        anInt3710 = (0xff0000 & i_7_) >> 12;
        anInt3698 = 0xff0 & i_7_ << 4;
        if (i > -45)
            method697(64, true);
    }

    public static void method773(int i)
    {
        aByteArrayArrayArray3712 = null;
        aClass100_3696 = null;
        anIntArray3699 = null;
        aClass82_3704 = null;
        if (i >= -58)
            aBoolean3711 = false;
    }

    public Class68_Sub13_Sub16()
    {
        this(0);
    }

    static final void method774(int i, int i_8_, int i_9_)
    {
        Stream.aBoolean2986 = true;
        Class68_Sub20_Sub5.anInt4227 = i;
        Mouse.anInt1569 = i_8_;
        Class68_Sub20_Sub7.anInt4262 = i_9_;
        Class68_Sub20_Sub15.anInt4402 = -1;
        RandomNumberGenerator.anInt1491 = -1;
    }

    static final Class68_Sub20_Sub10[] method775(Class21 class21, int i, int i_10_, byte i_11_)
    {
        try
        {
            if (i_11_ != 13)
                aBoolean3711 = true;
            anInt3700++;
            if (!Class68_Sub13_Sub36.method880(-29381, i_10_, class21, i))
                return null;
            return Class68_Sub13_Sub6.method721(-21477);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("j.D(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ',' + i_11_ + ')'));
        }
    }

    private Class68_Sub13_Sub16(int i)
    {
        super(0, false);
        method772((byte) -79, i);
    }

    static final void method776(ScriptParameters class68_sub29, int i)
    {
        try
        {
            Class68_Sub28_Sub1.method1260(class68_sub29, (byte) 124, 200000);
            if (i != 16)
                aBoolean3711 = true;
            anInt3709++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "j.U(" + (class68_sub29 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final boolean method777(int i, int i_12_, int i_13_, int i_14_)
    {
        if (!Class21.method361(i, i_12_, i_13_))
            return false;
        int i_15_ = i_12_ << 7;
        int i_16_ = i_13_ << 7;
        if (Login.method1478(i_15_ + 1, (Class68_Sub20_Sub12.intGroundArray[i][i_12_][i_13_]) + i_14_, i_16_ + 1) && Login.method1478(i_15_ + 128 - 1, (Class68_Sub20_Sub12.intGroundArray[i][i_12_ + 1][i_13_]) + i_14_, i_16_ + 1) && Login.method1478(i_15_ + 128 - 1, (Class68_Sub20_Sub12.intGroundArray[i][i_12_ + 1][i_13_ + 1]) + i_14_, i_16_ + 128 - 1)
                && Login.method1478(i_15_ + 1, (Class68_Sub20_Sub12.intGroundArray[i][i_12_][i_13_ + 1]) + i_14_, i_16_ + 128 - 1))
            return true;
        return false;
    }

    static final void method778(Class77 class77, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, boolean bool)
    {
        int i_22_ = ((Class77) class77).anIntArray1381.length;
        for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
        {
            int i_24_ = ((Class77) class77).anIntArray1381[i_23_] - Class25.anInt518;
            int i_25_ = (((Class77) class77).anIntArray1372[i_23_] - Class68_Sub17.anInt3035);
            int i_26_ = (((Class77) class77).anIntArray1378[i_23_] - Class68_Sub20_Sub12.anInt4357);
            int i_27_ = i_26_ * i_18_ + i_24_ * i_19_ >> 16;
            i_26_ = i_26_ * i_19_ - i_24_ * i_18_ >> 16;
            i_24_ = i_27_;
            i_27_ = i_25_ * i_17_ - i_26_ * i >> 16;
            i_26_ = i_25_ * i + i_26_ * i_17_ >> 16;
            i_25_ = i_27_;
            if (i_26_ < 50)
                return;
            if (((Class77) class77).anIntArray1365 != null)
            {
                Class77.anIntArray1377[i_23_] = i_24_;
                Class77.anIntArray1367[i_23_] = i_25_;
                Class77.anIntArray1368[i_23_] = i_26_;
            }
            Class77.anIntArray1375[i_23_] = Class62.anInt1164 + (i_24_ << 9) / i_26_;
            Class77.anIntArray1374[i_23_] = Class62.anInt1160 + (i_25_ << 9) / i_26_;
        }
        Class62.anInt1153 = 0;
        i_22_ = ((Class77) class77).anIntArray1370.length;
        for (int i_28_ = 0; i_28_ < i_22_; i_28_++)
        {
            int i_29_ = ((Class77) class77).anIntArray1370[i_28_];
            int i_30_ = ((Class77) class77).anIntArray1366[i_28_];
            int i_31_ = ((Class77) class77).anIntArray1382[i_28_];
            int i_32_ = Class77.anIntArray1375[i_29_];
            int i_33_ = Class77.anIntArray1375[i_30_];
            int i_34_ = Class77.anIntArray1375[i_31_];
            int i_35_ = Class77.anIntArray1374[i_29_];
            int i_36_ = Class77.anIntArray1374[i_30_];
            int i_37_ = Class77.anIntArray1374[i_31_];
            if ((i_32_ - i_33_) * (i_37_ - i_36_) - (i_35_ - i_36_) * (i_34_ - i_33_) > 0)
            {
                if (Stream.aBoolean2986 && (Class68_Sub20_Sub17.method1182(Mouse.anInt1569 + Class62.anInt1164, Class68_Sub20_Sub7.anInt4262 + Class62.anInt1160, i_35_, i_36_, i_37_, i_32_, i_33_, i_34_)))
                {
                    Class68_Sub20_Sub15.anInt4402 = i_20_;
                    RandomNumberGenerator.anInt1491 = i_21_;
                }
                if (!bool)
                {
                    Class62.aBoolean1157 = false;
                    if (i_32_ < 0 || i_33_ < 0 || i_34_ < 0 || i_32_ > Class62.anInt1168 || i_33_ > Class62.anInt1168 || i_34_ > Class62.anInt1168)
                        Class62.aBoolean1157 = true;
                    if (((Class77) class77).anIntArray1365 == null || ((Class77) class77).anIntArray1365[i_28_] == -1)
                    {
                        if (((Class77) class77).anIntArray1386[i_28_] != 12345678)
                            Class62.method617(i_35_, i_36_, i_37_, i_32_, i_33_, i_34_, ((Class77) class77).anIntArray1386[i_28_], ((Class77) class77).anIntArray1385[i_28_], ((Class77) class77).anIntArray1379[i_28_]);
                    } else if (Class68_Sub22.aBoolean3151)
                    {
                        if (((Class77) class77).aBoolean1380)
                            Class62.method600(i_35_, i_36_, i_37_, i_32_, i_33_, i_34_, ((Class77) class77).anIntArray1386[i_28_], ((Class77) class77).anIntArray1385[i_28_], ((Class77) class77).anIntArray1379[i_28_], Class77.anIntArray1377[0], Class77.anIntArray1377[1], Class77.anIntArray1377[3], Class77.anIntArray1367[0], Class77.anIntArray1367[1], Class77.anIntArray1367[3], Class77.anIntArray1368[0], Class77.anIntArray1368[1], Class77.anIntArray1368[3],
                                    ((Class77) class77).anIntArray1365[i_28_]);
                        else
                            Class62.method600(i_35_, i_36_, i_37_, i_32_, i_33_, i_34_, ((Class77) class77).anIntArray1386[i_28_], ((Class77) class77).anIntArray1385[i_28_], ((Class77) class77).anIntArray1379[i_28_], Class77.anIntArray1377[i_29_], Class77.anIntArray1377[i_30_], Class77.anIntArray1377[i_31_], Class77.anIntArray1367[i_29_], Class77.anIntArray1367[i_30_], Class77.anIntArray1367[i_31_], Class77.anIntArray1368[i_29_], Class77.anIntArray1368[i_30_], Class77.anIntArray1368[i_31_],
                                    ((Class77) class77).anIntArray1365[i_28_]);
                    } else
                    {
                        int i_38_ = (Class62.anInterface4_1159.method12(((Class77) class77).anIntArray1365[i_28_], 6));
                        Class62.method617(i_35_, i_36_, i_37_, i_32_, i_33_, i_34_, Class68_Sub13_Sub34.method871(i_38_, (((Class77) class77).anIntArray1386[i_28_])), Class68_Sub13_Sub34.method871(i_38_, (((Class77) class77).anIntArray1385[i_28_])), Class68_Sub13_Sub34.method871(i_38_, (((Class77) class77).anIntArray1379[i_28_])));
                    }
                }
            }
        }
    }

    final void method700(Stream class68_sub14, int i, int i_39_)
    {
        do
        {
            try
            {
                anInt3708++;
                int i_40_ = i;
                if (i_40_ == 0)
                    method772((byte) -84, class68_sub14.readTInteger());
                if (i_39_ == -1)
                    break;
                aBoolean3711 = true;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("j.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_39_ + ')'));
            }
            break;
        } while (false);
    }

    final int[][] method697(int i, boolean bool)
    {
        if (bool != true)
            aClass82_3704 = null;
        anInt3706++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -20);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[] is_41_ = is[0];
            int[] is_42_ = is[1];
            int[] is_43_ = is[2];
            for (int i_44_ = 0; i_44_ < Class68_Sub13_Sub19.anInt3748; i_44_++)
            {
                is_41_[i_44_] = anInt3710;
                is_42_[i_44_] = anInt3701;
                is_43_[i_44_] = anInt3698;
            }
        }
        return is;
    }

    static final void method779(int i, Color color, MutableString class100, boolean bool, int i_45_)
    {
        do
        {
            try
            {
                anInt3702++;
                try
                {
                    Graphics graphics = Mouse.gameCanvas.getGraphics();
                    if (Class68_Sub20_Sub2.aFont4192 == null)
                    {
                        Class68_Sub20_Sub2.aFont4192 = new Font("Helvetica", 1, 13);
                        Class118.aFontMetrics2076 = (Mouse.gameCanvas.getFontMetrics(Class68_Sub20_Sub2.aFont4192));
                    }
                    if (bool)
                    {
                        graphics.setColor(Color.black);
                        graphics.fillRect(0, 0, Class13_Sub3.appletWidth, Class68_Sub13_Sub9.appletHeight);
                    }
                    if (color == null)
                        color = new Color(140, 17, 17);
                    try
                    {
                        if (Class89.anImage1624 == null)
                            Class89.anImage1624 = Mouse.gameCanvas.createImage(304, 34);
                        if (i_45_ != 23189)
                            method777(125, -44, -120, -27);
                        Graphics graphics_46_ = Class89.anImage1624.getGraphics();
                        graphics_46_.setColor(color);
                        graphics_46_.drawRect(0, 0, 303, 33);
                        graphics_46_.fillRect(2, 2, i * 3, 30);
                        graphics_46_.setColor(Color.black);
                        graphics_46_.drawRect(1, 1, 301, 31);
                        graphics_46_.fillRect(3 * i + 2, 2, 300 - 3 * i, 30);
                        graphics_46_.setFont(Class68_Sub20_Sub2.aFont4192);
                        graphics_46_.setColor(Color.white);
                        class100.drawString(((304 - class100.stringWidth((Class118.aFontMetrics2076))) / 2), 22, graphics_46_);
                        graphics.drawImage(Class89.anImage1624, Class13_Sub3.appletWidth / 2 - 152, (Class68_Sub13_Sub9.appletHeight / 2 - 18), null);
                    } catch (Exception exception)
                    {
                        int i_47_ = Class13_Sub3.appletWidth / 2 - 152;
                        int i_48_ = Class68_Sub13_Sub9.appletHeight / 2 - 18;
                        graphics.setColor(color);
                        graphics.drawRect(i_47_, i_48_, 303, 33);
                        graphics.fillRect(i_47_ + 2, i_48_ + 2, i * 3, 30);
                        graphics.setColor(Color.black);
                        graphics.drawRect(i_47_ + 1, i_48_ + 1, 301, 31);
                        graphics.fillRect(3 * i + (i_47_ + 2), i_48_ + 2, 300 - 3 * i, 30);
                        graphics.setFont(Class68_Sub20_Sub2.aFont4192);
                        graphics.setColor(Color.white);
                        class100.drawString(((304 - class100.stringWidth((Class118.aFontMetrics2076))) / 2) + i_47_, i_48_ + 22, graphics);
                    }
                    if (Class68_Sub4.aClass100_2821 == null)
                        break;
                    graphics.setFont(Class68_Sub20_Sub2.aFont4192);
                    graphics.setColor(Color.white);
                    Class68_Sub4.aClass100_2821.drawString((Class13_Sub3.appletWidth / 2 - (Class68_Sub4.aClass100_2821.stringWidth(Class118.aFontMetrics2076)) / 2), Class68_Sub13_Sub9.appletHeight / 2 - 26, graphics);
                } catch (Exception exception)
                {
                    Mouse.gameCanvas.repaint();
                }
                break;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("j.H(" + i + ',' + (color != null ? "{...}" : "null") + ',' + (class100 != null ? "{...}" : "null") + ',' + bool + ',' + i_45_ + ')'));
            }
        } while (false);
    }

    static
    {
        aClass100_3696 = Class112.makeMutableString(43, "cookiehost");
        aClass82_3704 = new Login(128);
        aBoolean3711 = false;
    }
}
