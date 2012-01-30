/* Class68_Sub20_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.ref.SoftReference;

public class Class68_Sub20_Sub13_Sub1 extends Class68_Sub20_Sub13 {
    public SoftReference aSoftReference4616;

    public Object method1161(int i) {
        if (i >= -49)
            return null;
        return aSoftReference4616.get();
    }

    public boolean method1163(int i) {
        int i_0_ = 30 % ((i - -43) / 62);
        return true;
    }

    public Class68_Sub20_Sub13_Sub1(Object object) {
        aSoftReference4616 = new SoftReference(object);
    }
}
