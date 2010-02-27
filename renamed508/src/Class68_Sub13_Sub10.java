/* Class68_Sub13_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub10 extends Class68_Sub13
{
    static int anInt3586;
    static int anInt3587;
    static MutableString aClass100_3588;
    static int anInt3589;
    static MutableString aClass100_3590 = Class112.makeMutableString(43, "<col=ff9040>");
    static int anInt3591;
    static int anInt3592;
    static int[] anIntArray3593;
    private int anInt3594 = 4096;
    static MutableString aClass100_3595;
    static int anInt3596;
    static int anInt3597;
    private int anInt3598 = 0;
    static int anInt3599;

    static final boolean method740(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_)
    {
        if (i_0_ == i_1_ && i_2_ == i_3_)
        {
            if (!Class21.method361(i, i_0_, i_2_))
                return false;
            int i_5_ = i_0_ << 7;
            int i_6_ = i_2_ << 7;
            if (Login.method1478(i_5_ + 1, (Class68_Sub20_Sub12.intGroundArray[i][i_0_][i_2_]) + i_4_, i_6_ + 1) && Login.method1478(i_5_ + 128 - 1, (Class68_Sub20_Sub12.intGroundArray[i][i_0_ + 1][i_2_]) + i_4_, i_6_ + 1) && Login.method1478(i_5_ + 128 - 1, (Class68_Sub20_Sub12.intGroundArray[i][i_0_ + 1][i_2_ + 1]) + i_4_, i_6_ + 128 - 1)
                    && Login.method1478(i_5_ + 1, (Class68_Sub20_Sub12.intGroundArray[i][i_0_][i_2_ + 1]) + i_4_, i_6_ + 128 - 1))
                return true;
            return false;
        }
        for (int i_7_ = i_0_; i_7_ <= i_1_; i_7_++)
        {
            for (int i_8_ = i_2_; i_8_ <= i_3_; i_8_++)
            {
                if (Class72.anIntArrayArrayArray1311[i][i_7_][i_8_] == -Ground.anInt2758)
                    return false;
            }
        }
        int i_9_ = (i_0_ << 7) + 1;
        int i_10_ = (i_2_ << 7) + 2;
        int i_11_ = (Class68_Sub20_Sub12.intGroundArray[i][i_0_][i_2_] + i_4_);
        if (!Login.method1478(i_9_, i_11_, i_10_))
            return false;
        int i_12_ = (i_1_ << 7) - 1;
        if (!Login.method1478(i_12_, i_11_, i_10_))
            return false;
        int i_13_ = (i_3_ << 7) - 1;
        if (!Login.method1478(i_9_, i_11_, i_13_))
            return false;
        if (!Login.method1478(i_12_, i_11_, i_13_))
            return false;
        return true;
    }

    public static void method741(byte i)
    {
        aClass100_3595 = null;
        aClass100_3588 = null;
        int i_14_ = 100 % ((i + 80) / 46);
        anIntArray3593 = null;
        aClass100_3590 = null;
    }

    public Class68_Sub13_Sub10()
    {
        super(1, true);
    }

    static final void method742(int i, boolean bool)
    {
        Class68_Sub8.aClass98_2872.method1570(-18767, i);
        anInt3589++;
        if (bool != true)
            anInt3599 = 114;
    }

    final int[] method698(byte i, int i_15_)
    {
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_15_);
        if (i != -61)
            method698((byte) 2, 80);
        anInt3587++;
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int[] is_16_ = this.method696(0, i_15_, i ^ ~0x71e1);
            for (int i_17_ = 0; Class68_Sub13_Sub19.anInt3748 > i_17_; i_17_++)
            {
                int i_18_ = is_16_[i_17_];
                is[i_17_] = i_18_ < anInt3598 || anInt3594 < i_18_ ? 0 : 4096;
            }
        }
        return is;
    }

    static final void method743(int i)
    {
        Class125.aClass98_2173.method1573(111);
        anInt3591++;
        if (i != 7)
            anIntArray3593 = null;
        Class12.aClass98_211.method1573(i + 108);
        Class68_Sub13_Sub20.aClass98_3780.method1573(115);
    }

    final void method700(Stream class68_sub14, int i, int i_19_)
    {
        try
        {
            if (i_19_ != -1)
                anInt3599 = 68;
            int i_20_ = i;
            do
            {
                if (i_20_ != 0)
                {
                    if (i_20_ != 1)
                        break;
                } else
                {
                    anInt3598 = class68_sub14.readUShort();
                    break;
                }
                anInt3594 = class68_sub14.readUShort();
            } while (false);
            anInt3586++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hj.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_19_ + ')'));
        }
    }

    static final void method744(Class68_Sub3 class68_sub3, boolean bool, boolean bool_21_)
    {
        do
        {
            try
            {
                anInt3596++;
                int i = ((Class68_Sub3) class68_sub3).anInt2805;
                if (bool != true)
                    anInt3597 = 98;
                int i_22_ = (int) ((Node) class68_sub3).nodeID;
                class68_sub3.unlink();
                if (bool_21_)
                    ItemDefinition.method314(-10, i);
                Class4.method186(i, 2);
                Widget class45 = Class68_Sub20_Sub15.method1170(i_22_, (byte) -80);
                if (class45 != null)
                    NodeCache.method1688(class45, -124);
                Class68_Sub13_Sub21.menuOptionsCount = 0;
                Class120.menuOpen = false;
                Class127.method1787(Class49.menuX, Class68_Sub13_Sub14.menuY, Class68_Sub13_Sub15.anInt3689, Class33.anInt588, (byte) -107);
                if (anInt3597 == -1)
                    break;
                GameException.method1802(116, anInt3597, 1);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("hj.E(" + (class68_sub3 != null ? "{...}" : "null") + ',' + bool + ',' + bool_21_ + ')'));
            }
            break;
        } while (false);
    }

    static
    {
        aClass100_3588 = Class112.makeMutableString(43, "rect_debug=");
        anInt3592 = 0;
        aClass100_3595 = Class112.makeMutableString(43, "<)4col> x");
        anInt3599 = 1;
        anInt3597 = -1;
    }
}
