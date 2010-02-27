/* Class68_Sub13_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub8 extends Class68_Sub13
{
    static int anInt3559;
    static int anInt3560;
    static int anInt3561;
    static CipheredByteVector connectionVector = new CipheredByteVector(5000);
    static MRUNodes aClass98_3563 = new MRUNodes(64);
    static int anInt3564;
    static int anInt3565;
    static NodeCache aClass113_3566 = new NodeCache(32);
    static MutableString aClass100_3567;
    static MutableString aClass100_3568 = Class112.makeMutableString(43, "T");

    static final boolean method733(int i, int i_0_)
    {
        if (i != 0)
            return false;
        anInt3560++;
        if ((0x1 & i_0_ >> 29) == 0)
            return false;
        return true;
    }

    final int[] method698(byte i, int i_1_)
    {
        anInt3565++;
        if (i != -61)
            method698((byte) -99, 53);
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_1_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
            Class39.method464(is, 0, Class68_Sub13_Sub19.anInt3748, Class13_Sub3.anIntArray2674[i_1_]);
        return is;
    }

    public Class68_Sub13_Sub8()
    {
        super(0, true);
    }

    static final MutableString method734(int i, Stream class68_sub14, int i_2_)
    {
        try
        {
            anInt3561++;
            try
            {
                MutableString class100 = new MutableString();
                ((MutableString) class100).length = class68_sub14.method912(255);
                if (((MutableString) class100).length > i_2_)
                    ((MutableString) class100).length = i_2_;
                ((MutableString) class100).data = new byte[((MutableString) class100).length];
                ((Stream) class68_sub14).position += (Class68_Sub16.aClass103_3030.method1641(((MutableString) class100).data, i + 8, ((Stream) class68_sub14).position, ((MutableString) class100).length, i, ((Stream) class68_sub14).buffer));
                return class100;
            } catch (Exception exception)
            {
                return Ground.aClass100_2763;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("f.D(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ',' + i_2_ + ')'));
        }
    }

    public static void method735(int i)
    {
        aClass113_3566 = null;
        aClass98_3563 = null;
        aClass100_3568 = null;
        if (i != 9071)
            aClass113_3566 = null;
        aClass100_3567 = null;
        connectionVector = null;
    }

    static
    {
        aClass100_3567 = Class112.makeMutableString(43, "Standort");
    }
}
