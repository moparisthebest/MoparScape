/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class94
{
    static NodeList aClass16_1673 = new NodeList();
    static int anInt1674;
    static int anInt1675;
    static int anInt1676;
    static int anInt1677;
    static int anInt1678;
    static int[] chatMessageTypes;
    static MutableString aClass100_1680 = Class112.makeMutableString(43, ")1 ");

    static final Class9 method1547(byte i, int i_0_)
    {
        anInt1677++;
        Class9 class9 = ((Class9) Class68_Sub8.aClass98_2872.getNodeForID((long) i_0_));
        if (class9 != null)
            return class9;
        if (i != 53)
            aClass16_1673 = null;
        byte[] is = Class28.aClass21_531.method338(i_0_, 0, 4);
        class9 = new Class9();
        if (is != null)
            class9.method207((byte) -64, new Stream(is), i_0_);
        Class68_Sub8.aClass98_2872.addObject(class9, (long) i_0_);
        return class9;
    }

    static final boolean method1548(int i, int i_1_)
    {
        if (i != 122)
            aClass16_1673 = null;
        anInt1675++;
        if ((i_1_ < 97 || i_1_ > 122) && (i_1_ < 65 || i_1_ > 90))
            return false;
        return true;
    }

    static final Stream method1549(int i)
    {
        anInt1674++;
        if (i != 0)
            return null;
        Stream class68_sub14 = new Stream(24);
        class68_sub14.writeByte(3);
        class68_sub14.writeByte(Widget.anInt919);
        class68_sub14.writeByte(!Class23.aBoolean501 ? 0 : 1);
        class68_sub14.writeByte(Class68_Sub20_Sub2.aBoolean4190 ? 1 : 0);
        class68_sub14.writeByte(!RandomNumberGenerator.aBoolean1489 ? 0 : 1);
        class68_sub14.writeByte(Item.aBoolean2434 ? 1 : 0);
        class68_sub14.writeByte(MutableString.aBoolean2264 ? 1 : 0);
        class68_sub14.writeByte(!Class68_Sub13_Sub2.aBoolean3462 ? 0 : 1);
        class68_sub14.writeByte(Class68_Sub22.aBoolean3151 ? 1 : 0);
        class68_sub14.writeByte((!Class68_Sub20_Sub13_Sub2.aBoolean4631 ? 0 : 1));
        class68_sub14.writeByte(Class68_Sub13_Sub26.anInt3878);
        class68_sub14.writeByte(Class68_Sub28_Sub1.aBoolean4523 ? 1 : 0);
        class68_sub14.writeByte(!Class68_Sub6.aBoolean2840 ? 0 : 1);
        class68_sub14.writeByte(!Class43.aBoolean741 ? 0 : 1);
        class68_sub14.writeByte(Object5.anInt1245);
        class68_sub14.writeByte(!Class74.aBoolean1324 ? 0 : 1);
        class68_sub14.writeByte(Class106.anInt1803);
        class68_sub14.writeByte(Class68_Sub13_Sub25.anInt3857);
        class68_sub14.writeByte(Class68_Sub20_Sub15.anInt4401);
        class68_sub14.writeShort(Mouse.anInt1573);
        class68_sub14.writeShort(Class54.anInt1032);
        class68_sub14.writeByte(Class68_Sub13_Sub21.aBoolean3795 ? 1 : 0);
        return class68_sub14;
    }

    public static void method1550(byte i)
    {
        aClass100_1680 = null;
        int i_2_ = -64 % ((33 - i) / 51);
        chatMessageTypes = null;
        aClass16_1673 = null;
    }

    static
    {
        anInt1678 = 50;
    }
}
