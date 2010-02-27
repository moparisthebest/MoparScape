/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeCache
{
    private Node aClass68_1903;
    static int anInt1904;
    static int anInt1905;
    static int anInt1906;
    private long aLong1907;
    static int anInt1908;
    private int size;
    static int anInt1910;
    private Node[] cache;
    static int anInt1912;
    static int anInt1913;
    static int anInt1914;
    static int anInt1915;
    static int anInt1916;
    static int anInt1917;
    static int anInt1918;
    static int anInt1919;
    static int anInt1920 = 100;
    static Ground[][][] aClass68_Sub1ArrayArrayArray1921;
    private int anInt1922 = 0;
    static int[] anIntArray1923 = new int[1000];
    static int anInt1924;
    private Node aClass68_1925;

    final void method1683(byte i, Node class68, long l)
    {
        try
        {
            anInt1906++;
            int i_0_ = -127 % ((i - 68) / 51);
            if (((Node) class68).next != null)
                class68.unlink();
            Node class68_1_ = cache[(int) ((long) (size - 1) & l)];
            ((Node) class68).previous = class68_1_;
            ((Node) class68).nodeID = l;
            ((Node) class68).next = ((Node) class68_1_).next;
            ((Node) ((Node) class68).next).previous = class68;
            ((Node) ((Node) class68).previous).next = class68;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("tg.K(" + i + ',' + (class68 != null ? "{...}" : "null") + ',' + l + ')'));
        }
    }

    final Node method1684(long l, int i)
    {
        int i_2_ = -86 % ((16 - i) / 54);
        anInt1919++;
        aLong1907 = l;
        Node class68 = cache[(int) ((long) (size - 1) & l)];
        for (aClass68_1903 = ((Node) class68).previous; class68 != aClass68_1903; aClass68_1903 = ((Node) aClass68_1903).previous)
        {
            if (l == ((Node) aClass68_1903).nodeID)
            {
                Node class68_3_ = aClass68_1903;
                aClass68_1903 = ((Node) aClass68_1903).previous;
                return class68_3_;
            }
        }
        aClass68_1903 = null;
        return null;
    }

    final Node method1685(int i)
    {
        anInt1922 = 0;
        anInt1917++;
        if (i != -32642)
            method1692(-62);
        return method1689((byte) -119);
    }

    final int method1686(int i)
    {
        if (i > -126)
            aLong1907 = -127L;
        anInt1924++;
        return size;
    }

    static final void method1687(int i, Player class1_sub6_sub2)
    {
        do
        {
            try
            {
                anInt1915++;
                Class68_Sub18 class68_sub18 = ((Class68_Sub18) (Class1_Sub5.aClass113_2511.method1684(((Player) class1_sub6_sub2).name.method1615(i + 10909), 127)));
                if (i != -1)
                    aClass68_Sub1ArrayArrayArray1921 = null;
                if (class68_sub18 == null)
                    break;
                if (((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 != null)
                {
                    NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042);
                    ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = null;
                }
                class68_sub18.unlink();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("tg.I(" + i + ',' + (class1_sub6_sub2 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static final void method1688(Widget class45, int i)
    {
        try
        {
            if (Class68_Sub13_Sub34.anInt4015 == ((Widget) class45).anInt860)
                Class121.aBooleanArray2111[((Widget) class45).anInt902] = true;
            if (i >= -112)
                method1691(null, false, true);
            anInt1918++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "tg.D(" + (class45 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final Node method1689(byte i)
    {
        anInt1908++;
        if (i > -95)
            anIntArray1923 = null;
        if (anInt1922 > 0 && aClass68_1925 != cache[anInt1922 - 1])
        {
            Node class68 = aClass68_1925;
            aClass68_1925 = ((Node) class68).previous;
            return class68;
        }
        while (anInt1922 < size)
        {
            Node class68 = ((Node) cache[anInt1922++]).previous;
            if (cache[anInt1922 - 1] != class68)
            {
                aClass68_1925 = ((Node) class68).previous;
                return class68;
            }
        }
        return null;
    }

    final void method1690(boolean bool)
    {
        anInt1910++;
        if (bool != false)
            anInt1914 = -36;
        for (int i = 0; i < size; i++)
        {
            Node class68 = cache[i];
            for (;;)
            {
                Node class68_4_ = ((Node) class68).previous;
                if (class68 == class68_4_)
                    break;
                class68_4_.unlink();
            }
        }
        aClass68_1925 = null;
        aClass68_1903 = null;
    }

    static final void method1691(GameSocket class61, boolean bool, boolean bool_5_)
    {
        try
        {
            if (Class68_Sub25.aClass61_3169 != null)
            {
                try
                {
                    Class68_Sub25.aClass61_3169.method594(-76);
                } catch (Exception exception)
                {
                    /* empty */
                }
                Class68_Sub25.aClass61_3169 = null;
            }
            anInt1912++;
            Class68_Sub25.aClass61_3169 = class61;
            Class50.method530(bool_5_, bool);
            Keyboard.aClass68_Sub14_2130 = null;
            ((Stream) Class74.aClass68_Sub14_1330).position = 0;
            Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813 = null;
            Object3.anInt942 = 0;
            for (;;)
            {
                Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) Class68_Sub20_Sub13.aClass113_4368.method1685(-32642));
                if (class68_sub20_sub15 == null)
                    break;
                Keyboard.aClass113_2125.method1683((byte) -116, class68_sub20_sub15, (((Node) class68_sub20_sub15).nodeID));
                Class56.anInt1067++;
                Class68_Sub24.anInt3155--;
            }
            for (;;)
            {
                Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) Class111.aClass113_1876.method1685(-32642));
                if (class68_sub20_sub15 == null)
                    break;
                Class68_Sub7.aClass128_2856.method1792(class68_sub20_sub15, (byte) 121);
                Stream.aClass113_3010.method1683((byte) -117, class68_sub20_sub15, (((Node) class68_sub20_sub15).nodeID));
                NodeSubList.anInt2229++;
                Class22.anInt483--;
            }
            if (Class89.aByte1617 != 0)
            {
                try
                {
                    Stream class68_sub14 = new Stream(4);
                    class68_sub14.writeByte(4);
                    class68_sub14.writeByte(Class89.aByte1617);
                    class68_sub14.writeShort(0);
                    Class68_Sub25.aClass61_3169.queueBytes(0, (byte) 92, 4, (((Stream) class68_sub14).buffer));
                } catch (java.io.IOException ioexception)
                {
                    try
                    {
                        Class68_Sub25.aClass61_3169.method594(-44);
                    } catch (Exception exception)
                    {
                        /* empty */
                    }
                    Class68_Sub25.aClass61_3169 = null;
                    Class68_Sub10.anInt2911++;
                }
            }
            NodeList.anInt271 = 0;
            RandomNumberGenerator.aLong1497 = Class36.method438(17161);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("tg.G(" + (class61 != null ? "{...}" : "null") + ',' + bool + ',' + bool_5_ + ')'));
        }
    }

    final Node method1692(int i)
    {
        anInt1913++;
        if (aClass68_1903 == null)
            return null;
        Node class68 = cache[(int) (aLong1907 & (long) (size - 1))];
        if (i < 66)
            aClass68_1925 = null;
        for (/**/; aClass68_1903 != class68; aClass68_1903 = ((Node) aClass68_1903).previous)
        {
            if (((Node) aClass68_1903).nodeID == aLong1907)
            {
                Node class68_6_ = aClass68_1903;
                aClass68_1903 = ((Node) aClass68_1903).previous;
                return class68_6_;
            }
        }
        aClass68_1903 = null;
        return null;
    }

    NodeCache(int i)
    {
        cache = new Node[i];
        size = i;
        for (int i_7_ = 0; i_7_ < i; i_7_++)
        {
            Node n = cache[i_7_] = new Node();
            ((Node) n).next = n;
            ((Node) n).previous = n;
        }
    }

    public static void method1693(int i)
    {
        aClass68_Sub1ArrayArrayArray1921 = null;
        if (i != 0)
            anInt1914 = 72;
        anIntArray1923 = null;
    }

    static
    {
        anInt1905 = -1;
    }
}
