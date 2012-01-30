/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class110 {
    public short[] aShortArray1848;
    public static short[] aShortArray1849;
    public short[] aShortArray1850;
    public static short[] aShortArray1851;
    public short[] aShortArray1852;
    public static short[] aShortArray1853;
    public boolean aBoolean1854;
    public Class68_Sub7 aClass68_Sub7_1855 = null;
    public static short[] aShortArray1856;
    public static short[] aShortArray1857 = new short[500];
    public int anInt1858;
    public short[] aShortArray1859;
    public short[] aShortArray1860;

    public static void method1660() {
        aShortArray1853 = null;
        aShortArray1857 = null;
        aShortArray1856 = null;
        aShortArray1851 = null;
        aShortArray1849 = null;
    }

    public Class110(byte[] is, Class68_Sub7 class68_sub7) {
        aBoolean1854 = false;
        anInt1858 = -1;
        aClass68_Sub7_1855 = class68_sub7;
        Stream class68_sub14 = new Stream(is);
        Stream class68_sub14_0_ = new Stream(is);
        class68_sub14.currentOffset = 2;
        int i = class68_sub14.readUnsignedByte(-6677);
        int i_1_ = 0;
        int i_2_ = -1;
        int i_3_ = -1;
        class68_sub14_0_.currentOffset = class68_sub14.currentOffset + i;
        for (int i_4_ = 0; i_4_ < i; i_4_++) {
            if (aClass68_Sub7_1855.anIntArray2853[i_4_] == 0)
                i_2_ = i_4_;
            int i_5_ = class68_sub14.readUnsignedByte(-6677);
            if (i_5_ > 0) {
                if (aClass68_Sub7_1855.anIntArray2853[i_4_] == 0)
                    i_3_ = i_4_;
                aShortArray1853[i_1_] = (short) i_4_;
                short i_6_ = 0;
                if (aClass68_Sub7_1855.anIntArray2853[i_4_] == 3)
                    i_6_ = (short) 128;
                if ((i_5_ & 0x1) != 0)
                    aShortArray1857[i_1_]
                            = (short) class68_sub14_0_.method960(32767);
                else
                    aShortArray1857[i_1_] = i_6_;
                if ((i_5_ & 0x2) != 0)
                    aShortArray1856[i_1_]
                            = (short) class68_sub14_0_.method960(32767);
                else
                    aShortArray1856[i_1_] = i_6_;
                if ((i_5_ & 0x4) != 0)
                    aShortArray1851[i_1_]
                            = (short) class68_sub14_0_.method960(32767);
                else
                    aShortArray1851[i_1_] = i_6_;
                if (aClass68_Sub7_1855.anIntArray2853[i_4_] == 2) {
                    aShortArray1857[i_1_]
                            = (short) (((aShortArray1857[i_1_] & 0xff) << 3)
                            + (aShortArray1857[i_1_] >> 8 & 0x7));
                    aShortArray1856[i_1_]
                            = (short) (((aShortArray1856[i_1_] & 0xff) << 3)
                            + (aShortArray1856[i_1_] >> 8 & 0x7));
                    aShortArray1851[i_1_]
                            = (short) (((aShortArray1851[i_1_] & 0xff) << 3)
                            + (aShortArray1851[i_1_] >> 8 & 0x7));
                }
                aShortArray1849[i_1_] = (short) -1;
                if (aClass68_Sub7_1855.anIntArray2853[i_4_] >= 1
                        && aClass68_Sub7_1855.anIntArray2853[i_4_] <= 3
                        && i_2_ > i_3_) {
                    aShortArray1849[i_1_] = (short) i_2_;
                    i_3_ = i_2_;
                }
                i_1_++;
                if (aClass68_Sub7_1855.anIntArray2853[i_4_] == 5)
                    aBoolean1854 = true;
            }
        }
        if (class68_sub14_0_.currentOffset != is.length)
            throw new RuntimeException();
        anInt1858 = i_1_;
        aShortArray1860 = new short[i_1_];
        aShortArray1848 = new short[i_1_];
        aShortArray1850 = new short[i_1_];
        aShortArray1859 = new short[i_1_];
        aShortArray1852 = new short[i_1_];
        for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
            aShortArray1860[i_7_] = aShortArray1853[i_7_];
            aShortArray1848[i_7_] = aShortArray1857[i_7_];
            aShortArray1850[i_7_] = aShortArray1856[i_7_];
            aShortArray1859[i_7_] = aShortArray1851[i_7_];
            aShortArray1852[i_7_] = aShortArray1849[i_7_];
        }
    }

    static {
        aShortArray1851 = new short[500];
        aShortArray1853 = new short[500];
        aShortArray1849 = new short[500];
        aShortArray1856 = new short[500];
    }
}
