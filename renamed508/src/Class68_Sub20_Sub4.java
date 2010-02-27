/* Class68_Sub20_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub4 extends NodeSub
{
    Class1_Sub1 aClass1_Sub1_4216;
    static int anInt4217;
    static int anInt4218;
    static Class21_Sub1 aClass21_Sub1_4219;
    static int anInt4220;
    static MutableString aClass100_4221 = Class112.makeMutableString(43, "(U0a )2 via: ");

    Class68_Sub20_Sub4(Class1_Sub1 class1_sub1)
    {
        try
        {
            ((Class68_Sub20_Sub4) this).aClass1_Sub1_4216 = class1_sub1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ci.<init>(" + (class1_sub1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void method1058(int i)
    {
        aClass21_Sub1_4219 = null;
        if (i == 1152)
            aClass100_4221 = null;
    }

    static final void method1059(Class21 class21, int i)
    {
        try
        {
            if (i > 76)
            {
                Class109.aClass21_1847 = class21;
                anInt4218++;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ci.B(" + (class21 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final int method1060(byte i, int i_0_)
    {
        anInt4217++;
        if (i >= 65 && i <= 90)
            return i - 65;
        int i_1_ = -21 % ((-24 - i_0_) / 46);
        if (i >= 97 && i <= 122)
            return i - 97 + 26;
        if (i >= 48 && i <= 57)
            return i + 4;
        if (i == 43)
            return 62;
        if (i == 42)
            return 62;
        if (i == 47)
            return 63;
        if (i == 45)
            return 63;
        return -1;
    }

    static final boolean method1061(int i, int i_2_, int i_3_, int i_4_, int i_5_, Animable class1, int i_6_, long l, boolean bool)
    {
        if (class1 == null)
            return true;
        int i_7_ = i_2_ - i_5_;
        int i_8_ = i_3_ - i_5_;
        int i_9_ = i_2_ + i_5_;
        int i_10_ = i_3_ + i_5_;
        if (bool)
        {
            if (i_6_ > 640 && i_6_ < 1408)
                i_10_ += 128;
            if (i_6_ > 1152 && i_6_ < 1920)
                i_9_ += 128;
            if (i_6_ > 1664 || i_6_ < 384)
                i_8_ -= 128;
            if (i_6_ > 128 && i_6_ < 896)
                i_7_ -= 128;
        }
        i_7_ /= 128;
        i_8_ /= 128;
        i_9_ /= 128;
        i_10_ /= 128;
        return Class68_Sub13_Sub21.method808(i, i_7_, i_8_, i_9_ - i_7_ + 1, i_10_ - i_8_ + 1, i_2_, i_3_, i_4_, class1, i_6_, true, l);
    }
}
