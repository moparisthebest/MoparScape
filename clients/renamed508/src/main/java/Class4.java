/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class4
{
    static int anInt90;
    static int anInt91;
    static int anInt92;
    static int anInt93 = 0;
    static MutableString aClass100_94 = Class112.makeMutableString(43, "(U2");
    static boolean[] aBooleanArray95 = new boolean[100];
    static int[] anIntArray96;
    static int anInt97;

    static final Class68_Sub20_Sub16 method184(Stream class68_sub14, int i)
    {
        try
        {
            anInt97++;
            Class68_Sub20_Sub16 class68_sub20_sub16 = new Class68_Sub20_Sub16(class68_sub14.readString(), class68_sub14.readString(), class68_sub14.readUShort(), class68_sub14.readUShort(), class68_sub14.readInteger(), i == class68_sub14.readUByte());
            int i_0_ = class68_sub14.readUByte();
            for (int i_1_ = 0; i_0_ > i_1_; i_1_++)
                ((Class68_Sub20_Sub16) class68_sub20_sub16).aClass16_4432.pushFront(new Class68_Sub4(class68_sub14.readUShort(), class68_sub14.readUShort(), class68_sub14.readUShort(), class68_sub14.readUShort()));
            class68_sub20_sub16.method1172(i ^ 0x3201);
            return class68_sub20_sub16;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ae.A(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final int method185(int i, int i_2_, int i_3_)
    {
        anInt91++;
        if (i_3_ == -1)
            return 12345678;
        i_2_ = i_2_ * (i_3_ & 0x7f) >> 7;
        do
        {
            if (i_2_ >= i)
            {
                if (i_2_ <= 126)
                    break;
                i_2_ = 126;
                if (client.anInt2387 == 0)
                    break;
            }
            i_2_ = 2;
        } while (false);
        return (i_3_ & 0xff80) + i_2_;
    }

    static final void method186(int i, int i_4_)
    {
        for (Class68_Sub10 class68_sub10 = (Class68_Sub10) Class106.aClass113_1805.method1685(-32642); class68_sub10 != null; class68_sub10 = (Class68_Sub10) Class106.aClass113_1805.method1689((byte) -119))
        {
            if ((0xffffL & ((Node) class68_sub10).nodeID >> 48) == (long) i)
                class68_sub10.unlink();
        }
        if (i_4_ == 2)
            anInt90++;
    }

    public static void method187(boolean bool)
    {
        if (bool != true)
            method188(-40);
        anIntArray96 = null;
        aBooleanArray95 = null;
        aClass100_94 = null;
    }

    static final void method188(int i)
    {
        anInt92++;
        if (i != -26678)
            aClass100_94 = null;
        Class68_Sub13_Sub8.aClass98_3563.method1573(-6);
    }
}
