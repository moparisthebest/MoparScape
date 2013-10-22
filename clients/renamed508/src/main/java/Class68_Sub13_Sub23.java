/* Class68_Sub13_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub23 extends Class68_Sub13
{
    static int anInt3818;
    static int anInt3819;
    static int anInt3820;
    static MutableString aClass100_3821 = Class112.makeMutableString(43, "gr-Un:");
    private int anInt3822 = 1;
    static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array3823;
    private int anInt3824 = 0;
    static int anInt3825;
    static int anInt3826;
    static Class92[] aClass92Array3827;
    static MutableString aClass100_3828 = Class112.makeMutableString(43, "Stufe)2");
    static int anInt3829;
    private int anInt3830 = 0;

    final int[] method698(byte i, int i_0_)
    {
        anInt3826++;
        if (i != -61)
            method700(null, -71, -32);
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_0_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_1_ = Class13_Sub3.anIntArray2674[i_0_];
            int i_2_ = i_1_ - 2048 >> 1;
            for (int i_3_ = 0; i_3_ < Class68_Sub13_Sub19.anInt3748; i_3_++)
            {
                int i_4_ = Class68_Sub13_Sub3.anIntArray3481[i_3_];
                int i_5_ = i_4_ - 2048 >> 1;
                int i_6_;
                if (anInt3830 == 0)
                    i_6_ = anInt3822 * (i_4_ - i_1_);
                else
                {
                    int i_7_ = i_5_ * i_5_ + i_2_ * i_2_ >> 12;
                    i_6_ = (int) (4096.0 * Math.sqrt((double) ((float) i_7_ / 4096.0F)));
                    i_6_ = (int) (3.141592653589793 * (double) (anInt3822 * i_6_));
                }
                i_6_ -= i_6_ & ~0xfff;
                if (anInt3824 == 0)
                    i_6_ = (Class118.anIntArray2079[0xff & i_6_ >> 4] + 4096 >> 1);
                else if (anInt3824 == 2)
                {
                    i_6_ -= 2048;
                    if (i_6_ < 0)
                        i_6_ = -i_6_;
                    i_6_ = 2048 - i_6_ << 1;
                }
                is[i_3_] = i_6_;
            }
        }
        return is;
    }

    static final Class32 method813(int i, int i_8_)
    {
        if (i >= -3)
            return null;
        anInt3829++;
        Class32 class32 = (Class32) Class68_Sub13_Sub28.aClass98_3925.getNodeForID((long) i_8_);
        if (class32 != null)
            return class32;
        byte[] is = PlayerDefinition.aClass21_2194.method338(i_8_, 0, 16);
        class32 = new Class32();
        if (is != null)
            class32.method407(0, new Stream(is));
        Class68_Sub13_Sub28.aClass98_3925.addObject(class32, (long) i_8_);
        return class32;
    }

    public Class68_Sub13_Sub23()
    {
        super(0, true);
    }

    final void method690(byte i)
    {
        anInt3820++;
        Class68_Sub10.method683((byte) 43);
        if (i > -22)
            method690((byte) -3);
    }

    static final void method814(byte i, MutableString class100)
    {
        try
        {
            if (i == 37)
            {
                anInt3818++;
                Class68_Sub13_Sub34.method875((byte) 108);
                NPCDefinition.method1447(0, class100);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ob.D(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method815(int i)
    {
        aClass92Array3827 = null;
        int i_9_ = -71 % ((i + 16) / 48);
        aClass68_Sub20_Sub10Array3823 = null;
        aClass100_3828 = null;
        aClass100_3821 = null;
    }

    final void method700(Stream class68_sub14, int i, int i_10_)
    {
        try
        {
            int i_11_ = i;
            while_118_: do
            {
                do
                {
                    if (i_11_ != 0)
                    {
                        if (i_11_ != 1)
                        {
                            if (i_11_ == 3)
                                break;
                            break while_118_;
                        }
                    } else
                    {
                        anInt3830 = class68_sub14.readUByte();
                        break while_118_;
                    }
                    anInt3824 = class68_sub14.readUByte();
                    break while_118_;
                } while (false);
                anInt3822 = class68_sub14.readUByte();
            } while (false);
            if (i_10_ != -1)
                anInt3822 = -82;
            anInt3819++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ob.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ')'));
        }
    }
}
