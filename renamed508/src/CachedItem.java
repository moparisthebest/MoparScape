/* Class68_Sub20_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CachedItem extends NodeSub
{
    static byte[] aByteArray4446 = new byte[32896];
    Item item;
    static int anInt4448;
    static int anInt4449;
    static int anInt4450;
    static int anInt4451;
    static MutableString aClass100_4452;
    private static MutableString aClass100_4453;

    static final void method1183(byte i)
    {
        anInt4450++;
        Class97.anInt1717++;
        Class21.connectionVector.startPacket(42);
        if (i >= 81)
            Class21.connectionVector.writeLong(0L);
    }

    static final void method1184(int i, int i_0_, int i_1_, int i_2_, int i_3_)
    {
        anInt4449++;
        if (client.anInt2378 == 1)
            Class75_Sub2.aClass68_Sub20_Sub10Array3312[Class26.anInt523 / 100].method1103(Class68_Sub22.anInt3142 - 8, Class68_Sub13_Sub21.anInt3789 - 8);
        if (client.anInt2378 == 2)
            Class75_Sub2.aClass68_Sub20_Sub10Array3312[Class26.anInt523 / 100 + 4].method1103(Class68_Sub22.anInt3142 - 8, Class68_Sub13_Sub21.anInt3789 - 8);
        if (i_3_ != -17234)
            method1184(44, -23, -41, 64, -106);
        Class68_Sub4.method657(-127);
    }

    CachedItem(Item _item)
    {
        try
        {
            item = _item;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "wc.<init>(" + (_item != null ? "{...}" : "null") + ')');
        }
    }

    public static void method1185(byte i)
    {
        aByteArray4446 = null;
        aClass100_4453 = null;
        aClass100_4452 = null;
        aByteArray4446 = null;
    }

    static final Object5 method1186(int i, int i_4_, int i_5_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_4_][i_5_];
        if (class68_sub1 == null)
            return null;
        for (int i_6_ = 0; i_6_ < ((Ground) class68_sub1).anInt2773; i_6_++)
        {
            Object5 class69 = ((Ground) class68_sub1).object_5[i_6_];
            if ((((Object5) class69).uid >> 29 & 0x3L) == 2L && ((Object5) class69).anInt1254 == i_4_ && ((Object5) class69).anInt1253 == i_5_)
            {
                Class95.method1555(class69);
                return class69;
            }
        }
        return null;
    }

    static final Class13_Sub4 method1187(byte i, Stream class68_sub14)
    {
        try
        {
            if (i != 116)
                return null;
            anInt4448++;
            return new Class13_Sub4(class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readTInteger(), class68_sub14.readUByte());
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wc.C(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static
    {
        int i = 0;
        for (int i_7_ = 0; i_7_ < 256; i_7_++)
        {
            for (int i_8_ = 0; i_7_ >= i_8_; i_8_++)
                aByteArray4446[i++] = (byte) (int) (255.0 / Math.sqrt((double) ((float) (i_7_ * i_7_ + ((i_8_ * i_8_) + 65535)) / 65535.0F)));
        }
        aClass100_4453 = Class112.makeMutableString(43, " from your friend list first)3");
        aClass100_4452 = aClass100_4453;
    }
}
