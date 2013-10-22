/* Class75_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class75_Sub3 extends Class75
{
    static MutableString aClass100_3320 = Class112.makeMutableString(43, "welle2:");
    static int anInt3321;
    static MutableString aClass100_3322 = Class112.makeMutableString(43, "; Expires=");
    static MutableString aClass100_3323;
    static MutableString aClass100_3324 = Class112.makeMutableString(43, "; version=1; path=)4; domain=");
    static int anInt3325;
    static MutableString aClass100_3326;
    static int anInt3327;
    private static MutableString aClass100_3328;
    static int anInt3329 = (int) (Math.random() * 17.0) - 8;
    static int location;
    private static MutableString aClass100_3331 = Class112.makeMutableString(43, "Loading fonts )2 ");
    static int anInt3332 = 0;

    static final void method1399(int i, Node class68, Node class68_0_)
    {
        try
        {
            anInt3327++;
            if (((Node) class68_0_).next != null)
                class68_0_.unlink();
            ((Node) class68_0_).next = ((Node) class68).next;
            ((Node) class68_0_).previous = class68;
            if (i < 82)
                aClass100_3320 = null;
            ((Node) ((Node) class68_0_).next).previous = class68_0_;
            ((Node) ((Node) class68_0_).previous).next = class68_0_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("rh.B(" + i + ',' + (class68 != null ? "{...}" : "null") + ',' + (class68_0_ != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1400(byte i)
    {
        aClass100_3331 = null;
        aClass100_3326 = null;
        aClass100_3322 = null;
        if (i != 26)
            method1400((byte) -121);
        aClass100_3323 = null;
        aClass100_3328 = null;
        aClass100_3324 = null;
        aClass100_3320 = null;
    }

    static
    {
        location = 0;
        aClass100_3326 = aClass100_3331;
        aClass100_3328 = Class112.makeMutableString(43, "Continue");
        aClass100_3323 = aClass100_3328;
    }
}
