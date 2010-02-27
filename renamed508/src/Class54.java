/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class54
{
    static Class68_Sub28_Sub1 aClass68_Sub28_Sub1_1028;
    static int anInt1029;
    static MutableString aClass100_1030;
    static int anInt1031;
    static int anInt1032 = 0;
    static Widget aClass45_1033;
    static int anInt1034;
    static int anInt1035;

    static final Class112 method552(int i, int i_0_)
    {
        anInt1031++;
        Class112 class112 = ((Class112) Class68_Sub20_Sub13.aClass98_4361.getNodeForID((long) i));
        if (class112 != null)
            return class112;
        byte[] is = Class9.aClass21_173.method338(i, 0, i_0_);
        class112 = new Class112();
        if (is != null)
            class112.method1682(true, new Stream(is));
        Class68_Sub20_Sub13.aClass98_4361.addObject(class112, (long) i);
        return class112;
    }

    static final boolean method553(int i, int i_1_)
    {
        anInt1035++;
        if (i_1_ != 31155)
            return true;
        if (i >= 97 && i <= 122)
            return true;
        if (i >= 65 && i <= 90)
            return true;
        if (i >= 48 && i <= 57)
            return true;
        return false;
    }

    static final boolean method554(Widget class45, int i)
    {
        try
        {
            if (i != 29905)
                return false;
            anInt1034++;
            if (((Widget) class45).anInt808 == 205)
            {
                NodeList.anInt273 = 250;
                return true;
            }
            return false;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ij.D(" + (class45 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    public static void method555(byte i)
    {
        aClass68_Sub28_Sub1_1028 = null;
        int i_2_ = 41 / ((50 - i) / 46);
        aClass100_1030 = null;
        aClass45_1033 = null;
    }

    static
    {
        aClass100_1030 = Class112.makeMutableString(43, "k");
    }
}
