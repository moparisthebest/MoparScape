/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class32
{
    static int anInt560;
    static int anInt561;
    static MutableString aClass100_562;
    static Widget aClass45_563;
    int anInt564 = 0;
    static int anInt565 = 0;
    static MutableString aClass100_566 = Class112.makeMutableString(43, ")2");
    static MutableString aClass100_567 = Class112.makeMutableString(43, "Lade Schrifts-=tze )2 ");
    static int anInt568;
    static MutableString aClass100_569;
    static int anInt570;
    private static MutableString aClass100_571;
    static int anInt572;
    static int friendCount = 0;
    static int anInt574;

    private final void method406(Stream class68_sub14, int i, int i_0_)
    {
        do
        {
            try
            {
                anInt570++;
                if (i_0_ != (i ^ 0xffffffff))
                    break;
                ((Class32) this).anInt564 = class68_sub14.readUShort();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ek.B(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
            }
            break;
        } while (false);
    }

    final void method407(int i, Stream class68_sub14)
    {
        try
        {
            if (i == 0)
            {
                anInt568++;
                for (;;)
                {
                    int i_1_ = class68_sub14.readUByte();
                    if (i_1_ == 0)
                        break;
                    method406(class68_sub14, i_1_, -6);
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ek.D(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method408(int i)
    {
        if (Class68_Sub25.aClass61_3169 != null)
            Class68_Sub25.aClass61_3169.method594(-81);
        if (i >= -63)
            method409(-12, 100, 4, -112);
        anInt572++;
    }

    static final Class68_Sub3 method409(int i, int i_2_, int i_3_, int i_4_)
    {
        anInt561++;
        Class68_Sub3 class68_sub3 = new Class68_Sub3();
        ((Class68_Sub3) class68_sub3).anInt2802 = i;
        ((Class68_Sub3) class68_sub3).anInt2805 = i_2_;
        Login.aClass113_1514.method1683((byte) 127, class68_sub3, (long) i_4_);
        Object2.method1406(i_2_, (byte) 112);
        Widget class45 = Class68_Sub20_Sub15.method1170(i_4_, (byte) -80);
        if (class45 != null)
            NodeCache.method1688(class45, -116);
        if (Class29.aClass45_539 != null)
        {
            NodeCache.method1688(Class29.aClass45_539, -125);
            Class29.aClass45_539 = null;
        }
        Class68_Sub13_Sub21.menuOptionsCount = 0;
        Class120.menuOpen = false;
        Class127.method1787(Class49.menuX, Class68_Sub13_Sub14.menuY, Class68_Sub13_Sub15.anInt3689, Class33.anInt588, (byte) -114);
        if (class45 != null)
            Class68_Sub13_Sub27.method838(-1, false, class45);
        Class71.method1340(-1, i_2_);
        int i_5_ = -12 / ((i_3_ - 65) / 56);
        if (Class68_Sub13_Sub10.anInt3597 != -1)
            GameException.method1802(99, Class68_Sub13_Sub10.anInt3597, 1);
        return class68_sub3;
    }

    public static void method410(byte i)
    {
        aClass100_569 = null;
        aClass100_566 = null;
        aClass45_563 = null;
        aClass100_562 = null;
        if (i >= -21)
            method409(13, 66, -29, -26);
        aClass100_567 = null;
        aClass100_571 = null;
    }

    public Class32()
    {
        /* empty */
    }

    static
    {
        aClass100_571 = Class112.makeMutableString(43, "Loading sprites )2 ");
        aClass100_562 = aClass100_571;
        aClass100_569 = Class112.makeMutableString(43, "sl_back");
        anInt574 = 0;
    }
}
