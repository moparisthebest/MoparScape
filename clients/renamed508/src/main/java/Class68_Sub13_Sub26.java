/* Class68_Sub13_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Random;

class Class68_Sub13_Sub26 extends Class68_Sub13
{
    static int anInt3872;
    static int anInt3873;
    int[] anIntArray3874;
    static Random aRandom3875 = new Random();
    static int anInt3876;
    static int anInt3877;
    static int anInt3878 = 2;
    static int anInt3879;
    static MutableString aClass100_3880 = Class112.makeMutableString(43, "gleiten:");
    private int anInt3881 = -1;
    static int anInt3882 = 0;
    int anInt3883;
    int anInt3884;
    static int minimapInt1 = 0;
    static int anInt3886;
    static int anInt3887;
    static int anInt3888;

    public Class68_Sub13_Sub26()
    {
        super(0, false);
    }

    int[][] method697(int i, boolean bool)
    {
        anInt3887++;
        if (bool != true)
            minimapInt1 = -40;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -98);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612 && method826(0))
        {
            int[] is_0_ = is[1];
            int[] is_1_ = is[2];
            int[] is_2_ = is[0];
            int i_3_ = (((Ground.anInt2777 != ((Class68_Sub13_Sub26) this).anInt3883) ? (i * ((Class68_Sub13_Sub26) this).anInt3883 / Ground.anInt2777) : i) * ((Class68_Sub13_Sub26) this).anInt3884);
            if (((Class68_Sub13_Sub26) this).anInt3884 != Class68_Sub13_Sub19.anInt3748)
            {
                for (int i_4_ = 0; Class68_Sub13_Sub19.anInt3748 > i_4_; i_4_++)
                {
                    int i_5_ = (((Class68_Sub13_Sub26) this).anInt3884 * i_4_ / Class68_Sub13_Sub19.anInt3748);
                    int i_6_ = (((Class68_Sub13_Sub26) this).anIntArray3874[i_5_ + i_3_]);
                    is_1_[i_4_] = Class120.method1746(i_6_ << 4, 4080);
                    is_0_[i_4_] = Class120.method1746(i_6_ >> 4, 4080);
                    is_2_[i_4_] = Class120.method1746(16711680, i_6_) >> 12;
                }
            } else
            {
                for (int i_7_ = 0; Class68_Sub13_Sub19.anInt3748 > i_7_; i_7_++)
                {
                    int i_8_ = ((Class68_Sub13_Sub26) this).anIntArray3874[i_3_++];
                    is_1_[i_7_] = Class120.method1746(4080, i_8_ << 4);
                    is_0_[i_7_] = Class120.method1746(4080, i_8_ >> 4);
                    is_2_[i_7_] = Class120.method1746(i_8_, 16711680) >> 12;
                }
            }
        }
        return is;
    }

    final int method689(int i)
    {
        if (i != 9485)
            method827(31, -110);
        anInt3872++;
        return anInt3881;
    }

    final boolean method826(int i)
    {
        anInt3886++;
        if (((Class68_Sub13_Sub26) this).anIntArray3874 != null)
            return true;
        if (anInt3881 >= i)
        {
            Sprite class68_sub20_sub10_sub1 = ScriptParameters.method1319(anInt3881, Class83.aClass21_1528, 64);
            class68_sub20_sub10_sub1.method1129();
            ((Class68_Sub13_Sub26) this).anInt3884 = ((Class68_Sub20_Sub10) class68_sub20_sub10_sub1).width;
            ((Class68_Sub13_Sub26) this).anIntArray3874 = (((Sprite) class68_sub20_sub10_sub1).pixels);
            ((Class68_Sub13_Sub26) this).anInt3883 = ((Class68_Sub20_Sub10) class68_sub20_sub10_sub1).height;
            return true;
        }
        return false;
    }

    final void method694(int i)
    {
        anInt3888++;
        super.method694(i);
        ((Class68_Sub13_Sub26) this).anIntArray3874 = null;
    }

    static final void method827(int i, int i_9_)
    {
        Class68_Sub28_Sub2.aClass98_4546.method1570(-18767, i_9_);
        int i_10_ = 94 % ((-4 - i) / 54);
        anInt3877++;
    }

    public static void method828(boolean bool)
    {
        if (bool != false)
            method827(11, 8);
        aRandom3875 = null;
        aClass100_3880 = null;
    }

    static final void method829(Class103 class103, int i)
    {
        try
        {
            if (i != 127)
                method829(null, 100);
            Class68_Sub16.aClass103_3030 = class103;
            anInt3876++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ok.F(" + (class103 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final void method830(int i, int i_11_, int i_12_, int i_13_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_11_][i_12_];
        if (class68_sub1 != null)
        {
            Object2 class76 = ((Ground) class68_sub1).object_2;
            if (class76 != null)
            {
                ((Object2) class76).anInt1356 = ((Object2) class76).anInt1356 * i_13_ / 16;
                ((Object2) class76).anInt1363 = ((Object2) class76).anInt1363 * i_13_ / 16;
            }
        }
    }

    final void method700(Stream class68_sub14, int i, int i_14_)
    {
        try
        {
            if (i_14_ != -1)
                method697(0, false);
            if (i == 0)
                anInt3881 = class68_sub14.readUShort();
            anInt3873++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ok.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ')'));
        }
    }

    static final void method831(Signlink class55, byte i, boolean bool)
    {
        do
        {
            try
            {
                anInt3879++;
                if (i > -35)
                    break;
                if (!bool)
                {
                    FileOnDisk class2 = null;
                    Widget.anInt919 = 3;
                    Class75_Sub3_Sub1.method1403(true, 1);
                    Class54.anInt1032 = 0;
                    Class68_Sub22.aBoolean3151 = true;
                    Class68_Sub20_Sub13_Sub2.aBoolean4631 = true;
                    Class68_Sub6.aBoolean2840 = true;
                    Class68_Sub13_Sub2.aBoolean3462 = true;
                    MutableString.aBoolean2264 = true;
                    Class68_Sub20_Sub2.aBoolean4190 = true;
                    Class43.aBoolean741 = true;
                    Class68_Sub13_Sub21.aBoolean3795 = true;
                    RandomNumberGenerator.aBoolean1489 = true;
                    Object5.anInt1245 = 0;
                    Class74.aBoolean1324 = true;
                    anInt3878 = 2;
                    Item.aBoolean2434 = true;
                    Class68_Sub20_Sub15.anInt4401 = 127;
                    Mouse.anInt1573 = 0;
                    Class68_Sub13_Sub25.anInt3857 = 255;
                    Class68_Sub28_Sub1.aBoolean4523 = true;
                    Class106.anInt1803 = 127;
                    try
                    {
                        Class31 class31 = class55.method568(true, "runescape");
                        while (class31.anInt555 == 0)
                            Class50.method528(-5, 1L);
                        if (class31.anInt555 == 1)
                        {
                            class2 = (FileOnDisk) class31.playerDefSocket;
                            byte[] is = new byte[(int) class2.getLength()];
                            int i_15_;
                            for (int i_16_ = 0; i_16_ < is.length; i_16_ += i_15_)
                            {
                                i_15_ = class2.read(is.length - i_16_, i_16_, is);
                                if (i_15_ == -1)
                                    throw new IOException("EOF");
                            }
                            Class1_Sub5.method141(new Stream(is), (byte) 91);
                        }
                    } catch (Exception exception)
                    {
                        /* empty */
                    }
                    try
                    {
                        if (class2 == null)
                            break;
                        class2.close();
                    } catch (Exception exception)
                    {
                        /* empty */
                    }
                    break;
                }
                Widget.anInt919 = 3;
                Class75_Sub3_Sub1.method1403(false, 1);
                Class68_Sub13_Sub25.anInt3857 = 255;
                Object5.anInt1245 = 0;
                Class68_Sub20_Sub15.anInt4401 = 127;
                Item.aBoolean2434 = false;
                Class54.anInt1032 = 0;
                Class68_Sub20_Sub2.aBoolean4190 = false;
                Class68_Sub13_Sub21.aBoolean3795 = false;
                Class68_Sub22.aBoolean3151 = false;
                Class68_Sub13_Sub2.aBoolean3462 = false;
                Class106.anInt1803 = 127;
                Class68_Sub28_Sub1.aBoolean4523 = false;
                Class43.aBoolean741 = false;
                MutableString.aBoolean2264 = false;
                Class74.aBoolean1324 = false;
                Class68_Sub6.aBoolean2840 = false;
                Mouse.anInt1573 = 0;
                anInt3878 = 0;
                Class68_Sub20_Sub13_Sub2.aBoolean4631 = false;
                RandomNumberGenerator.aBoolean1489 = false;
                Class68_Sub20_Sub10.method1115(true, class55);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ok.H(" + (class55 != null ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
            }
        } while (false);
    }
}
