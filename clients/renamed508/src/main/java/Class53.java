/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Method;

final class Class53
{
    int anInt1015;
    static int anInt1016;
    int anInt1017;
    static int anInt1018;
    static int anInt1019;
    static int[] anIntArray1020;
    static int anInt1021;
    int anInt1022;
    static int anInt1023;
    static int anInt1024;
    private int anInt1025;
    private int anInt1026 = 0;
    int anInt1027;

    static final void method545(Component component, int i)
    {
        try
        {
            anInt1016++;
            Method method = Signlink.setFocusTraversalKeysEnabled;
            if (method != null)
            {
                try
                {
                    method.invoke(component, new Object[] { Boolean.FALSE });
                } catch (Throwable throwable)
                {
                    /* empty */
                }
            }
            component.addKeyListener(Class66.keyboard);
            if (i != 1611550343)
                method545(null, -119);
            component.addFocusListener(Class66.keyboard);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ig.F(" + (component != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final void method546(int i, int i_0_, Stream class68_sub14)
    {
        try
        {
            for (;;)
            {
                int i_1_ = class68_sub14.readUByte();
                if (i_1_ == 0)
                    break;
                method548(30704, i_0_, i_1_, class68_sub14);
            }
            if (i == 0)
                anInt1018++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ig.C(" + i + ',' + i_0_ + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static final int method547(byte i, int i_2_, int i_3_)
    {
        anInt1023++;
        if (i_2_ == -2)
            return 12345678;
        if (i_2_ == -1)
        {
            if (i_3_ < 2)
                i_3_ = 2;
            else if (i_3_ > 126)
                i_3_ = 126;
            return i_3_;
        }
        if (i != -91)
            method550((byte) -126);
        i_3_ = i_3_ * (0x7f & i_2_) >> 7;
        if (i_3_ < 2)
            i_3_ = 2;
        else if (i_3_ > 126)
            i_3_ = 126;
        return i_3_ + (0xff80 & i_2_);
    }

    private final void method548(int i, int i_4_, int i_5_, Stream class68_sub14)
    {
        try
        {
            if (i_5_ != 1)
            {
                if (i_5_ != 2)
                {
                    if (i_5_ == 3)
                        class68_sub14.readUShort();
                } else
                {
                    anInt1025 = class68_sub14.readUShort();
                    if (anInt1025 == 65535)
                        anInt1025 = -1;
                }
            } else
            {
                anInt1026 = class68_sub14.readTInteger();
                method549(-1, anInt1026);
            }
            if (i != 30704)
                anInt1026 = -84;
            anInt1021++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ig.D(" + i + ',' + i_4_ + ',' + i_5_ + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    private final void method549(int i, int i_6_)
    {
        anInt1024++;
        double d = (double) ((0xff3eb5 & i_6_) >> 16) / 256.0;
        double d_7_ = (double) (0xff & i_6_ >> 8) / 256.0;
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
        ((Class53) this).anInt1017 = (int) (256.0 * d_13_);
        if (i >= (((Class53) this).anInt1017 ^ 0xffffffff))
        {
            if (((Class53) this).anInt1017 > 255)
                ((Class53) this).anInt1017 = 255;
        } else
            ((Class53) this).anInt1017 = 0;
        if (d_10_ != d_9_)
        {
            if (d_13_ < 0.5)
                d_12_ = (-d_9_ + d_10_) / (d_9_ + d_10_);
            if (d != d_10_)
            {
                if (d_10_ != d_7_)
                {
                    if (d_10_ == d_8_)
                        d_11_ = (-d_7_ + d) / (-d_9_ + d_10_) + 4.0;
                } else
                    d_11_ = (-d + d_8_) / (-d_9_ + d_10_) + 2.0;
            } else
                d_11_ = (-d_8_ + d_7_) / (d_10_ - d_9_);
            if (d_13_ >= 0.5)
                d_12_ = (d_10_ - d_9_) / (-d_9_ + (-d_10_ + 2.0));
        }
        d_11_ /= 6.0;
        ((Class53) this).anInt1027 = (int) (d_12_ * 256.0);
        if (d_13_ > 0.5)
            ((Class53) this).anInt1015 = (int) ((-d_13_ + 1.0) * d_12_ * 512.0);
        else
            ((Class53) this).anInt1015 = (int) (512.0 * (d_13_ * d_12_));
        if (((Class53) this).anInt1027 >= 0)
        {
            if (((Class53) this).anInt1027 > 255)
                ((Class53) this).anInt1027 = 255;
        } else
            ((Class53) this).anInt1027 = 0;
        if (((Class53) this).anInt1015 < 1)
            ((Class53) this).anInt1015 = 1;
        ((Class53) this).anInt1022 = (int) ((double) ((Class53) this).anInt1015 * d_11_);
    }

    public static void method550(byte i)
    {
        anIntArray1020 = null;
        if (i != -28)
            method545(null, 22);
    }

    static final void method551(int i, byte i_14_, int i_15_, Widget class45, int i_16_, int i_17_, int i_18_)
    {
        try
        {
            anInt1019++;
            if (i_14_ <= 96)
                anIntArray1020 = null;
            int i_19_ = i_15_ * i_15_ + i_18_ * i_18_;
            if (i_19_ <= 360000)
            {
                int i_20_ = Math.min(((Widget) class45).anInt892 / 2, ((Widget) class45).anInt873 / 2);
                if (i_20_ * i_20_ < i_19_)
                {
                    i_20_ -= 10;
                    int i_21_ = (Class68_Sub13_Sub26.minimapInt1 + Class8.minimapInt2 & 0x7ff);
                    int i_22_ = Class62.PRECOMPUTED_SINE_CACHE[i_21_];
                    i_22_ = i_22_ * 256 / (Class68_Sub20_Sub16.minimapInt3 + 256);
                    int i_23_ = Class62.PRECOMUPTED_COSINE_CACHE[i_21_];
                    i_23_ = 256 * i_23_ / (Class68_Sub20_Sub16.minimapInt3 + 256);
                    int i_24_ = i_18_ * i_22_ + i_15_ * i_23_ >> 16;
                    int i_25_ = i_23_ * i_18_ - i_22_ * i_15_ >> 16;
                    double d = Math.atan2((double) i_24_, (double) i_25_);
                    int i_26_ = (int) (Math.sin(d) * (double) i_20_);
                    int i_27_ = (int) ((double) i_20_ * Math.cos(d));
                    ((Sprite) Class88.aClass68_Sub20_Sub10Array1610[i]).method1121(i_17_ - 10 + ((Widget) class45).anInt892 / 2 + i_26_, i_16_ - i_27_ + ((Widget) class45).anInt873 / 2 - 10, 20, 20, 15, 15, d, 256);
                } else
                    Class33.method413(i_18_, -90, class45, i_17_, i_15_, Class70.aClass68_Sub20_Sub10Array1286[i], i_16_);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ig.E(" + i + ',' + i_14_ + ',' + i_15_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ')'));
        }
    }

    public Class53()
    {
        anInt1025 = -1;
    }
}
