/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class84 implements Runnable
{
    static int anInt1533;
    static Class21_Sub1 aClass21_Sub1_1534;
    boolean aBoolean1535 = true;
    static int anInt1536;
    static int anInt1537;
    static MutableString aClass100_1538;
    static Class21 aClass21_1539;
    static MutableString aClass100_1540 = Class112.makeMutableString(43, " loggt sich ein)3");
    static MutableString aClass100_1541;
    static int anInt1542;
    private static MutableString aClass100_1543;
    static int anInt1544;
    Object anObject1545 = new Object();
    int[] anIntArray1546 = new int[500];
    int anInt1547;
    int[] anIntArray1548 = new int[500];

    static final void method1482(int i, Class92_Sub1 class92_sub1)
    {
        do
        {
            try
            {
                int i_0_ = 256;
                for (int i_1_ = 0; Class68_Sub20_Sub6.anIntArray4232.length > i_1_; i_1_++)
                    Class68_Sub20_Sub6.anIntArray4232[i_1_] = 0;
                anInt1544++;
                if (i < 72)
                    aClass21_1539 = null;
                for (int i_2_ = 0; i_2_ < 5000; i_2_++)
                {
                    int i_3_ = (int) (128.0 * Math.random() * (double) i_0_);
                    Class68_Sub20_Sub6.anIntArray4232[i_3_] = (int) (284.0 * Math.random());
                }
                for (int i_4_ = 0; i_4_ < 20; i_4_++)
                {
                    for (int i_5_ = 1; i_0_ - 1 > i_5_; i_5_++)
                    {
                        for (int i_6_ = 1; i_6_ < 127; i_6_++)
                        {
                            int i_7_ = (i_5_ << 7) + i_6_;
                            Class68_Sub19.anIntArray3079[i_7_] = (Class68_Sub20_Sub6.anIntArray4232[i_7_ - 1] + ((Class68_Sub20_Sub6.anIntArray4232[i_7_ + 1]) + (Class68_Sub20_Sub6.anIntArray4232[i_7_ - 128]) + (Class68_Sub20_Sub6.anIntArray4232[i_7_ + 128]))) / 4;
                        }
                    }
                    int[] is = Class68_Sub20_Sub6.anIntArray4232;
                    Class68_Sub20_Sub6.anIntArray4232 = Class68_Sub19.anIntArray3079;
                    Class68_Sub19.anIntArray3079 = is;
                }
                if (class92_sub1 == null)
                    break;
                int i_8_ = 0;
                for (int i_9_ = 0; i_9_ < ((Class92) class92_sub1).anInt1660; i_9_++)
                {
                    for (int i_10_ = 0; ((Class92) class92_sub1).anInt1661 > i_10_; i_10_++)
                    {
                        if ((((Class92_Sub1) class92_sub1).aByteArray3334[i_8_++]) != 0)
                        {
                            int i_11_ = (((Class92) class92_sub1).anInt1659 + (i_10_ + 16));
                            int i_12_ = i_9_ + (((Class92) class92_sub1).anInt1657 + 16);
                            int i_13_ = i_11_ + (i_12_ << 7);
                            Class68_Sub20_Sub6.anIntArray4232[i_13_] = 0;
                        }
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("oa.A(" + i + ',' + (class92_sub1 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public final void run()
    {
        anInt1536++;
        while (((Class84) this).aBoolean1535)
        {
            synchronized (((Class84) this).anObject1545)
            {
                if (((Class84) this).anInt1547 < 500)
                {
                    ((Class84) this).anIntArray1546[((Class84) this).anInt1547] = Class96.anInt1697;
                    ((Class84) this).anIntArray1548[((Class84) this).anInt1547] = Class13.anInt223;
                    ((Class84) this).anInt1547++;
                }
            }
            Class50.method528(-5, 50L);
        }
    }

    public static void method1483(byte i)
    {
        aClass21_Sub1_1534 = null;
        aClass100_1541 = null;
        aClass100_1540 = null;
        aClass100_1543 = null;
        if (i == -127)
        {
            aClass100_1538 = null;
            aClass21_1539 = null;
        }
    }

    static final void method1484(int i, int i_14_, int i_15_, byte i_16_, int i_17_, int i_18_)
    {
        if (i_16_ >= 48)
        {
            if (GroundData.anInt677 <= i_15_ && i_17_ <= NodeCache.anInt1920 && i >= Class35.anInt605 && i_18_ <= Class51.anInt2257)
                Class102.method1634(i, true, i_18_, i_17_, i_15_, i_14_);
            else
                Class121.method1747(i, i_18_, i_17_, i_15_, -115, i_14_);
            anInt1533++;
        }
    }

    public Class84()
    {
        ((Class84) this).anInt1547 = 0;
    }

    static
    {
        anInt1537 = -1;
        aClass100_1543 = Class112.makeMutableString(43, "Unable to find ");
        anInt1542 = 0;
        aClass100_1541 = Class112.makeMutableString(43, "Versteckt");
        aClass100_1538 = aClass100_1543;
    }
}
