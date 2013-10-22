/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class104
{
    static MutableString aClass100_1777 = Class112.makeMutableString(43, " zuerst von Ihrer Ignorieren)2Liste(Q");
    static int anInt1778;
    static MutableString aClass100_1779;
    static int anInt1780;
    static Class92_Sub1[] aClass92_Sub1Array1781;
    static boolean aBoolean1782 = false;
    int anInt1783;
    int anInt1784;
    static MutableString aClass100_1785;
    static int anInt1786;
    static int anInt1787;
    static int anInt1788;
    static Class65 aClass65_1789;
    int anInt1790;
    static int anInt1791;

    static final Class68_Sub13 method1643(boolean bool, Stream class68_sub14)
    {
        try
        {
            class68_sub14.readUByte();
            anInt1791++;
            int i = class68_sub14.readUByte();
            Class68_Sub13 class68_sub13 = Class48.method515(i, (byte) -46);
            if (bool != true)
                return null;
            ((Class68_Sub13) class68_sub13).anInt2944 = class68_sub14.readUByte();
            int i_0_ = class68_sub14.readUByte();
            for (int i_1_ = 0; i_0_ > i_1_; i_1_++)
            {
                int i_2_ = class68_sub14.readUByte();
                class68_sub13.method700(class68_sub14, i_2_, -1);
            }
            class68_sub13.method690((byte) -34);
            return class68_sub13;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("sc.C(" + bool + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1644(int i)
    {
        if (i == 0)
        {
            aClass100_1779 = null;
            aClass65_1789 = null;
            aClass100_1777 = null;
            aClass92_Sub1Array1781 = null;
            aClass100_1785 = null;
        }
    }

    static final void method1645(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_)
    {
        anInt1780++;
        if (i >= -101)
            aClass100_1777 = null;
        int i_9_ = Class68_Sub20_Sub15.method1171(i_5_, Class51.anInt2257, (byte) 114, Class35.anInt605);
        int i_10_ = Class68_Sub20_Sub15.method1171(i_4_, Class51.anInt2257, (byte) 114, Class35.anInt605);
        int i_11_ = Class68_Sub20_Sub15.method1171(i_7_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        int i_12_ = Class68_Sub20_Sub15.method1171(i_3_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        int i_13_ = Class68_Sub20_Sub15.method1171(i_5_ + i_6_, Class51.anInt2257, (byte) 114, Class35.anInt605);
        int i_14_ = Class68_Sub20_Sub15.method1171(i_4_ - i_6_, Class51.anInt2257, (byte) 114, Class35.anInt605);
        for (int i_15_ = i_9_; i_15_ < i_13_; i_15_++)
            Class34.method416(i_11_, (byte) -17, i_8_, Class68_Sub22.anIntArrayArray3134[i_15_], i_12_);
        for (int i_16_ = i_10_; i_16_ > i_14_; i_16_--)
            Class34.method416(i_11_, (byte) -17, i_8_, Class68_Sub22.anIntArrayArray3134[i_16_], i_12_);
        int i_17_ = Class68_Sub20_Sub15.method1171(i_7_ + i_6_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        int i_18_ = Class68_Sub20_Sub15.method1171(i_3_ - i_6_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        for (int i_19_ = i_13_; i_19_ <= i_14_; i_19_++)
        {
            int[] is = Class68_Sub22.anIntArrayArray3134[i_19_];
            Class34.method416(i_11_, (byte) -17, i_8_, is, i_17_);
            Class34.method416(i_18_, (byte) -17, i_8_, is, i_12_);
        }
    }

    static final void method1646(int i, int i_20_)
    {
        Class125.aClass98_2173.method1570(-18767, i_20_);
        Class12.aClass98_211.method1570(-18767, i_20_);
        anInt1778++;
        Class68_Sub13_Sub20.aClass98_3780.method1570(i ^ ~0x494e, i_20_);
        if (i != 0)
            method1643(true, null);
    }

    public Class104()
    {
        /* empty */
    }

    static
    {
        aClass100_1779 = Class112.makeMutableString(43, ":assist:");
        aClass100_1785 = Class112.makeMutableString(43, "slr2)3ws?order=LPWM");
        anInt1786 = 0;
    }
}
