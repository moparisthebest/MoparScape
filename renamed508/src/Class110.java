/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class110
{
    short[] aShortArray1850;
    private static short[] aShortArray1851;
    short[] aShortArray1852;
    private static short[] aShortArray1853;
    short[] aShortArray1854;
    private static short[] aShortArray1855;
    boolean aBoolean1856;
    Class68_Sub7 aClass68_Sub7_1857 = null;
    private static short[] aShortArray1858;
    private static short[] aShortArray1859 = new short[500];
    int anInt1860;
    short[] aShortArray1861;
    short[] aShortArray1862;

    public static void method1666()
    {
        aShortArray1855 = null;
        aShortArray1859 = null;
        aShortArray1858 = null;
        aShortArray1853 = null;
        aShortArray1851 = null;
    }

    Class110(byte[] is, Class68_Sub7 class68_sub7)
    {
        ((Class110) this).aBoolean1856 = false;
        ((Class110) this).anInt1860 = -1;
        ((Class110) this).aClass68_Sub7_1857 = class68_sub7;
        Stream class68_sub14 = new Stream(is);
        Stream class68_sub14_0_ = new Stream(is);
        ((Stream) class68_sub14).position = 2;
        int i = class68_sub14.readUByte();
        int i_1_ = 0;
        int i_2_ = -1;
        int i_3_ = -1;
        ((Stream) class68_sub14_0_).position = ((Stream) class68_sub14).position + i;
        for (int i_4_ = 0; i_4_ < i; i_4_++)
        {
            if ((((Class68_Sub7) ((Class110) this).aClass68_Sub7_1857).anIntArray2855[i_4_]) == 0)
                i_2_ = i_4_;
            int i_5_ = class68_sub14.readUByte();
            if (i_5_ > 0)
            {
                if ((((Class68_Sub7) ((Class110) this).aClass68_Sub7_1857).anIntArray2855[i_4_]) == 0)
                    i_3_ = i_4_;
                aShortArray1855[i_1_] = (short) i_4_;
                short i_6_ = 0;
                if ((((Class68_Sub7) ((Class110) this).aClass68_Sub7_1857).anIntArray2855[i_4_]) == 3)
                    i_6_ = (short) 128;
                if ((i_5_ & 0x1) != 0)
                    aShortArray1859[i_1_] = (short) class68_sub14_0_.method960(32767);
                else
                    aShortArray1859[i_1_] = i_6_;
                if ((i_5_ & 0x2) != 0)
                    aShortArray1858[i_1_] = (short) class68_sub14_0_.method960(32767);
                else
                    aShortArray1858[i_1_] = i_6_;
                if ((i_5_ & 0x4) != 0)
                    aShortArray1853[i_1_] = (short) class68_sub14_0_.method960(32767);
                else
                    aShortArray1853[i_1_] = i_6_;
                if ((((Class68_Sub7) ((Class110) this).aClass68_Sub7_1857).anIntArray2855[i_4_]) == 2)
                {
                    aShortArray1859[i_1_] = (short) (((aShortArray1859[i_1_] & 0xff) << 3) + (aShortArray1859[i_1_] >> 8 & 0x7));
                    aShortArray1858[i_1_] = (short) (((aShortArray1858[i_1_] & 0xff) << 3) + (aShortArray1858[i_1_] >> 8 & 0x7));
                    aShortArray1853[i_1_] = (short) (((aShortArray1853[i_1_] & 0xff) << 3) + (aShortArray1853[i_1_] >> 8 & 0x7));
                }
                aShortArray1851[i_1_] = (short) -1;
                if ((((Class68_Sub7) ((Class110) this).aClass68_Sub7_1857).anIntArray2855[i_4_]) >= 1 && (((Class68_Sub7) ((Class110) this).aClass68_Sub7_1857).anIntArray2855[i_4_]) <= 3 && i_2_ > i_3_)
                {
                    aShortArray1851[i_1_] = (short) i_2_;
                    i_3_ = i_2_;
                }
                i_1_++;
                if ((((Class68_Sub7) ((Class110) this).aClass68_Sub7_1857).anIntArray2855[i_4_]) == 5)
                    ((Class110) this).aBoolean1856 = true;
            }
        }
        if (((Stream) class68_sub14_0_).position != is.length)
            throw new RuntimeException();
        ((Class110) this).anInt1860 = i_1_;
        ((Class110) this).aShortArray1862 = new short[i_1_];
        ((Class110) this).aShortArray1850 = new short[i_1_];
        ((Class110) this).aShortArray1852 = new short[i_1_];
        ((Class110) this).aShortArray1861 = new short[i_1_];
        ((Class110) this).aShortArray1854 = new short[i_1_];
        for (int i_7_ = 0; i_7_ < i_1_; i_7_++)
        {
            ((Class110) this).aShortArray1862[i_7_] = aShortArray1855[i_7_];
            ((Class110) this).aShortArray1850[i_7_] = aShortArray1859[i_7_];
            ((Class110) this).aShortArray1852[i_7_] = aShortArray1858[i_7_];
            ((Class110) this).aShortArray1861[i_7_] = aShortArray1853[i_7_];
            ((Class110) this).aShortArray1854[i_7_] = aShortArray1851[i_7_];
        }
    }

    static
    {
        aShortArray1853 = new short[500];
        aShortArray1855 = new short[500];
        aShortArray1851 = new short[500];
        aShortArray1858 = new short[500];
    }
}
