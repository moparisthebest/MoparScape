/* Class68_Sub20_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class Class68_Sub20_Sub13_Sub1 extends Class68_Sub20_Sub13
{
    private SoftReference aSoftReference4618;

    final Object method1161(int i)
    {
        if (i >= -49)
            return null;
        return aSoftReference4618.get();
    }

    final boolean method1163(int i)
    {
        int i_0_ = 30 % ((i + 43) / 62);
        return true;
    }

    Class68_Sub20_Sub13_Sub1(Object object)
    {
        aSoftReference4618 = new SoftReference(object);
    }
}
