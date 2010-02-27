/* Class68_Sub20_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub9 extends NodeSub
{
    static int anInt4293;
    static int anInt4294;
    int anInt4295;
    static MutableString aClass100_4296 = Class112.makeMutableString(43, ":");
    static int anInt4297;
    static int anInt4298;
    static int anInt4299;
    static int anInt4300;
    static int anInt4301;
    MutableString aClass100_4302;
    static int anInt4303;

    final int method1096(int i)
    {
        anInt4299++;
        if (i != -1597153401)
            method1101((byte) -37);
        return (int) ((Node) this).nodeID;
    }

    final void method1097(int i)
    {
        anInt4298++;
        ((NodeSub) this).nodeSubID |= ~0x7fffffffffffffffL;
        if ((long) i == method1098(i + 255))
            Class30.aClass128_550.method1793(this);
    }

    final long method1098(int i)
    {
        if (i != 255)
            aClass100_4296 = null;
        anInt4301++;
        return ((NodeSub) this).nodeSubID & 0x7fffffffffffffffL;
    }

    public static void method1099(boolean bool)
    {
        if (bool != false)
            anInt4297 = 85;
        aClass100_4296 = null;
    }

    static final void method1100(int i, byte i_0_, int i_1_)
    {
        anInt4300++;
        NodeList class16 = Widget.groundItems[GameSocket.plane][i][i_1_];
        if (class16 == null)
            Class68_Sub13_Sub22.method811(GameSocket.plane, i, i_1_);
        else
        {
            if (i_0_ != -52)
                method1100(-71, (byte) -68, -62);
            int i_2_ = -99999999;
            CachedItem class68_sub20_sub18 = (CachedItem) class16.method293((byte) 76);
            CachedItem class68_sub20_sub18_3_ = null;
            for (/**/; class68_sub20_sub18 != null; class68_sub20_sub18 = (CachedItem) class16.method290((byte) 67))
            {
                ItemDefinition class19 = GameApplet.method18(-25672, ((Item) (((CachedItem) class68_sub20_sub18).item)).id);
                int i_4_ = ((ItemDefinition) class19).anInt375;
                if (((ItemDefinition) class19).anInt381 == 1)
                    i_4_ *= ((Item) (((CachedItem) class68_sub20_sub18).item)).stackSize + 1;
                if (i_2_ < i_4_)
                {
                    i_2_ = i_4_;
                    class68_sub20_sub18_3_ = class68_sub20_sub18;
                }
            }
            if (class68_sub20_sub18_3_ == null)
                Class68_Sub13_Sub22.method811(GameSocket.plane, i, i_1_);
            else
            {
                class16.method291((byte) 43, class68_sub20_sub18_3_);
                class68_sub20_sub18 = (CachedItem) class16.method293((byte) 76);
                Item class1_sub2 = null;
                Item class1_sub2_5_ = null;
                for (/**/; class68_sub20_sub18 != null; class68_sub20_sub18 = ((CachedItem) class16.method290((byte) -125)))
                {
                    Item class1_sub2_6_ = (((CachedItem) class68_sub20_sub18).item);
                    if (((Item) class1_sub2_6_).id != ((Item) (((CachedItem) class68_sub20_sub18_3_).item)).id)
                    {
                        if (class1_sub2_5_ == null)
                            class1_sub2_5_ = class1_sub2_6_;
                        if ((((Item) class1_sub2_5_).id != ((Item) class1_sub2_6_).id) && class1_sub2 == null)
                            class1_sub2 = class1_sub2_6_;
                    }
                }
                long l = (long) ((i_1_ << 7) + i + 1610612736);
                Class1_Sub7.method169(GameSocket.plane, i, i_1_, Player.fixZ(i * 128 + 64, GameSocket.plane, 128 * i_1_ + 64), (((CachedItem) class68_sub20_sub18_3_).item), l, class1_sub2_5_, class1_sub2);
            }
        }
    }

    Class68_Sub20_Sub9(int i, int i_7_)
    {
        ((Node) this).nodeID = (long) i << 32 | (long) i_7_;
    }

    final void method1101(byte i)
    {
        int i_8_ = 17 / ((i - 9) / 37);
        ((NodeSub) this).nodeSubID = (~0x7fffffffffffffffL & ((NodeSub) this).nodeSubID | Class36.method438(17161) + 500L);
        Class13_Sub3.aClass128_2664.method1793(this);
        anInt4303++;
    }

    final int method1102(boolean bool)
    {
        anInt4294++;
        if (bool != false)
            method1099(true);
        return (int) (0xffL & ((Node) this).nodeID >>> 32);
    }

    static
    {
        anInt4293 = 0;
        anInt4297 = 0;
    }
}
