/* Class68_Sub13_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub32 extends Class68_Sub13
{
    static int anInt3980 = 0;
    static int anInt3981;
    static int anInt3982;
    static int anInt3983 = -1;
    static MutableString aClass100_3984 = Class112.makeMutableString(43, "null");
    static int anInt3985;
    static int anInt3986;
    private Class13[] aClass13Array3987;
    static int anInt3988;

    final int[][] method697(int i, boolean bool)
    {
        anInt3985++;
        if (bool != true)
            method698((byte) -45, 77);
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) 89);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int i_0_ = Class68_Sub13_Sub19.anInt3748;
            int i_1_ = Ground.anInt2777;
            int[][] is_2_ = new int[i_1_][i_0_];
            int[][][] is_3_ = ((Class68_Sub13) this).aClass88_2941.method1503((byte) 123);
            method863(is_2_, 23891);
            for (int i_4_ = 0; Ground.anInt2777 > i_4_; i_4_++)
            {
                int[] is_5_ = is_2_[i_4_];
                int[][] is_6_ = is_3_[i_4_];
                int[] is_7_ = is_6_[0];
                int[] is_8_ = is_6_[1];
                int[] is_9_ = is_6_[2];
                for (int i_10_ = 0; i_10_ < Class68_Sub13_Sub19.anInt3748; i_10_++)
                {
                    int i_11_ = is_5_[i_10_];
                    is_9_[i_10_] = Class120.method1746(i_11_ << 4, 4080);
                    is_8_[i_10_] = Class120.method1746(65280, i_11_) >> 4;
                    is_7_[i_10_] = Class120.method1746(i_11_ >> 12, 4080);
                }
            }
        }
        return is;
    }

    final void method700(Stream class68_sub14, int i, int i_12_)
    {
        do
        {
            try
            {
                anInt3988++;
                if ((i ^ 0xffffffff) == i_12_)
                {
                    aClass13Array3987 = new Class13[class68_sub14.readUByte()];
                    while_161_: for (int i_13_ = 0; aClass13Array3987.length > i_13_; i_13_++)
                    {
                        int i_14_ = class68_sub14.readUByte();
                        int i_15_ = i_14_;
                        while_159_: do
                        {
                            do
                            {
                                if (i_15_ != 0)
                                {
                                    if (i_15_ != 1)
                                    {
                                        if (i_15_ != 2)
                                        {
                                            if (i_15_ != 3)
                                                continue while_161_;
                                        } else
                                            break;
                                        break while_159_;
                                    }
                                } else
                                {
                                    aClass13Array3987[i_13_] = Object2.method1405(3, class68_sub14);
                                    continue while_161_;
                                }
                                aClass13Array3987[i_13_] = (CachedItem.method1187((byte) 116, class68_sub14));
                                continue while_161_;
                            } while (false);
                            aClass13Array3987[i_13_] = Class68_Sub16.method984((byte) 121, class68_sub14);
                            continue while_161_;
                        } while (false);
                        aClass13Array3987[i_13_] = MutableString.method1604(-20084, class68_sub14);
                    }
                } else
                {
                    if (i != 1)
                        break;
                    ((Class68_Sub13) this).aBoolean2933 = class68_sub14.readUByte() == 1;
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("td.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_12_ + ')'));
            }
            break;
        } while (false);
    }

    public Class68_Sub13_Sub32()
    {
        super(0, true);
    }

    public static void method862(int i)
    {
        aClass100_3984 = null;
        if (i > -62)
            method862(-27);
    }

    private final void method863(int[][] is, int i)
    {
        do
        {
            try
            {
                anInt3981++;
                int i_16_ = Class68_Sub13_Sub19.anInt3748;
                if (i == 23891)
                {
                    int i_17_ = Ground.anInt2777;
                    Class119.method1739(128, is);
                    Class68_Sub28_Sub1.method1241(Player.anInt3434, 0, 0, 20685, Class30.anInt543);
                    if (aClass13Array3987 == null)
                        break;
                    for (int i_18_ = 0; i_18_ < aClass13Array3987.length; i_18_++)
                    {
                        Class13 class13 = aClass13Array3987[i_18_];
                        int i_19_ = ((Class13) class13).anInt220;
                        int i_20_ = ((Class13) class13).anInt216;
                        if (i_20_ < 0)
                        {
                            if (i_19_ >= 0)
                                class13.method245(true, i_16_, i_17_);
                        } else if (i_19_ < 0)
                            class13.method244(i_17_, 103, i_16_);
                        else
                            class13.method243(i_16_, 23700, i_17_);
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("td.B(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    static final void method864(int i)
    {
        if (i == 0)
        {
            anInt3986++;
            for (Class68_Sub2 class68_sub2 = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method293((byte) 76); class68_sub2 != null; class68_sub2 = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method290((byte) 104))
            {
                if (((Class68_Sub2) class68_sub2).anInt2797 > 0)
                    ((Class68_Sub2) class68_sub2).anInt2797--;
                if (((Class68_Sub2) class68_sub2).anInt2797 != 0)
                {
                    if (((Class68_Sub2) class68_sub2).anInt2796 > 0)
                        ((Class68_Sub2) class68_sub2).anInt2796--;
                    if (((Class68_Sub2) class68_sub2).anInt2796 == 0 && ((Class68_Sub2) class68_sub2).anInt2793 >= 1 && ((Class68_Sub2) class68_sub2).anInt2786 >= 1 && ((Class68_Sub2) class68_sub2).anInt2793 <= 102 && ((Class68_Sub2) class68_sub2).anInt2786 <= 102 && (((Class68_Sub2) class68_sub2).anInt2799 < 0 || Class122.method1754(((Class68_Sub2) class68_sub2).anInt2799, ((Class68_Sub2) class68_sub2).anInt2792, 28446)))
                    {
                        GroundData.method450(i, ((Class68_Sub2) class68_sub2).anInt2788, ((Class68_Sub2) class68_sub2).anInt2799, ((Class68_Sub2) class68_sub2).anInt2793, ((Class68_Sub2) class68_sub2).anInt2791, ((Class68_Sub2) class68_sub2).anInt2792, ((Class68_Sub2) class68_sub2).anInt2789, ((Class68_Sub2) class68_sub2).anInt2786);
                        ((Class68_Sub2) class68_sub2).anInt2796 = -1;
                        if ((((Class68_Sub2) class68_sub2).anInt2790 == ((Class68_Sub2) class68_sub2).anInt2799) && ((Class68_Sub2) class68_sub2).anInt2790 == -1)
                            class68_sub2.unlink();
                        else if ((((Class68_Sub2) class68_sub2).anInt2790 == ((Class68_Sub2) class68_sub2).anInt2799) && (((Class68_Sub2) class68_sub2).anInt2795 == (((Class68_Sub2) class68_sub2).anInt2789)) && (((Class68_Sub2) class68_sub2).anInt2785 == (((Class68_Sub2) class68_sub2).anInt2792)))
                            class68_sub2.unlink();
                    }
                } else if (((Class68_Sub2) class68_sub2).anInt2790 < 0 || Class122.method1754(((Class68_Sub2) class68_sub2).anInt2790, ((Class68_Sub2) class68_sub2).anInt2785, 28446))
                {
                    GroundData.method450(0, ((Class68_Sub2) class68_sub2).anInt2788, ((Class68_Sub2) class68_sub2).anInt2790, ((Class68_Sub2) class68_sub2).anInt2793, ((Class68_Sub2) class68_sub2).anInt2791, ((Class68_Sub2) class68_sub2).anInt2785, ((Class68_Sub2) class68_sub2).anInt2795, ((Class68_Sub2) class68_sub2).anInt2786);
                    class68_sub2.unlink();
                }
            }
        }
    }

    final int[] method698(byte i, int i_21_)
    {
        if (i != -61)
            aClass100_3984 = null;
        anInt3982++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_21_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
            method863(((Class68_Sub13) this).aClass115_2938.method1702(i ^ 0x7d17), 23891);
        return is;
    }
}
