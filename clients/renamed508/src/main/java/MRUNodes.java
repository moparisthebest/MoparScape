/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MRUNodes
{
    static Widget aClass45_1722;
    static int anInt1723;
    private int spaceLeft;
    private NodeCache nodeCache;
    static int[] friendNodeIDs = new int[200];
    static int anInt1727;
    static int anInt1728;
    static int anInt1729;
    static int anInt1730;
    static int anInt1731;
    private NodeSubList nodeSubList = new NodeSubList();
    static int anInt1733;
    private int initialCount;

    static final void method1569(int i, int i_0_)
    {
        anInt1730++;
        if (i_0_ >= 52)
            Class121.aClass98_2102.method1570(-18767, i);
    }

    final void method1570(int i, int i_1_)
    {
        if (i != -18767)
            friendNodeIDs = null;
        if (Class68_Sub16.aClass105_3026 != null)
        {
            for (Class68_Sub20_Sub13 class68_sub20_sub13 = (Class68_Sub20_Sub13) nodeSubList.method1790(1742); class68_sub20_sub13 != null; class68_sub20_sub13 = ((Class68_Sub20_Sub13) nodeSubList.method1797(i + 18644)))
            {
                if (class68_sub20_sub13.method1163(-111))
                {
                    if (class68_sub20_sub13.method1161(i ^ 0x491b) == null)
                    {
                        class68_sub20_sub13.unlink();
                        class68_sub20_sub13.unlinkSub();
                        spaceLeft++;
                    }
                } else if (++((NodeSub) class68_sub20_sub13).nodeSubID > (long) i_1_)
                {
                    Class68_Sub20_Sub13 class68_sub20_sub13_2_ = Class68_Sub16.aClass105_3026.method1647(class68_sub20_sub13, (byte) 122);
                    nodeCache.method1683((byte) 126, class68_sub20_sub13_2_, (((Node) class68_sub20_sub13).nodeID));
                    Class12.method239((byte) -74, class68_sub20_sub13_2_, class68_sub20_sub13);
                    class68_sub20_sub13.unlink();
                    class68_sub20_sub13.unlinkSub();
                }
            }
        }
        anInt1733++;
    }

    public static void method1571(byte i)
    {
        aClass45_1722 = null;
        friendNodeIDs = null;
        int i_3_ = -75 / ((80 - i) / 41);
    }

    final void method1572(byte i)
    {
        if (i == 94)
        {
            anInt1728++;
            nodeSubList.method1789((byte) -39);
            nodeCache.method1690(false);
            spaceLeft = initialCount;
        }
    }

    final void method1573(int i)
    {
        for (Class68_Sub20_Sub13 class68_sub20_sub13 = (Class68_Sub20_Sub13) nodeSubList.method1790(1742); class68_sub20_sub13 != null; class68_sub20_sub13 = (Class68_Sub20_Sub13) nodeSubList.method1797(-105))
        {
            if (class68_sub20_sub13.method1163(-112))
            {
                class68_sub20_sub13.unlink();
                class68_sub20_sub13.unlinkSub();
                spaceLeft++;
            }
        }
        anInt1727++;
        int i_4_ = 13 % ((i - 51) / 56);
    }

    final void addObject(Object object, long l)
    {
        try
        {
            anInt1729++;
            method1575((byte) 28, l);
            if (spaceLeft == 0)
            {
                Class68_Sub20_Sub13 class68_sub20_sub13 = (Class68_Sub20_Sub13) nodeSubList.method1796(2265);
                class68_sub20_sub13.unlink();
                class68_sub20_sub13.unlinkSub();
            } else
                spaceLeft--;
            Class68_Sub20_Sub13_Sub2 class68_sub20_sub13_sub2 = new Class68_Sub20_Sub13_Sub2(object);
            nodeCache.method1683((byte) 125, class68_sub20_sub13_sub2, l);
            nodeSubList.method1793(class68_sub20_sub13_sub2);
            ((NodeSub) class68_sub20_sub13_sub2).nodeSubID = 0L;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("qc.D(" + (object != null ? "{...}" : "null") + ',' + ',' + l + ')'));
        }
    }

    final void method1575(byte i, long l)
    {
        anInt1731++;
        Class68_Sub20_Sub13 class68_sub20_sub13 = (Class68_Sub20_Sub13) nodeCache.method1684(l, i - 111);
        if (class68_sub20_sub13 != null)
        {
            class68_sub20_sub13.unlink();
            class68_sub20_sub13.unlinkSub();
            spaceLeft++;
        }
        if (i != 28)
            initialCount = -4;
    }

    final Object getNodeForID(long l)
    {
        Class68_Sub20_Sub13 class68_sub20_sub13 = (Class68_Sub20_Sub13) nodeCache.method1684(l, 90);
        if (class68_sub20_sub13 == null)
            return null;
        Object object = class68_sub20_sub13.method1161(-105);
        if (object == null)
        {
            class68_sub20_sub13.unlink();
            class68_sub20_sub13.unlinkSub();
            spaceLeft++;
            return null;
        }
        if (!class68_sub20_sub13.method1163(-109))
        {
            nodeSubList.method1793(class68_sub20_sub13);
            ((NodeSub) class68_sub20_sub13).nodeSubID = 0L;
        } else
        {
            Class68_Sub20_Sub13_Sub2 class68_sub20_sub13_sub2 = new Class68_Sub20_Sub13_Sub2(object);
            nodeCache.method1683((byte) -40, class68_sub20_sub13_sub2, (((Node) class68_sub20_sub13).nodeID));
            nodeSubList.method1793(class68_sub20_sub13_sub2);
            ((NodeSub) class68_sub20_sub13_sub2).nodeSubID = 0L;
            class68_sub20_sub13.unlink();
            class68_sub20_sub13.unlinkSub();
        }
        return object;
    }

    MRUNodes(int i)
    {
        initialCount = i;
        int i_5_ = 1;
        spaceLeft = i;
        for (/**/; i > i_5_ + i_5_; i_5_ += i_5_)
        {
            /* empty */
        }
        nodeCache = new NodeCache(i_5_);
    }

    static final void method1577(int i, int i_6_, int i_7_, int i_8_, Animable class1, long l, boolean bool)
    {
        if (class1 != null)
        {
            Object3 class47 = new Object3();
            ((Object3) class47).aClass1_931 = class1;
            ((Object3) class47).anInt941 = i_6_ * 128 + 64;
            ((Object3) class47).anInt932 = i_7_ * 128 + 64;
            ((Object3) class47).anInt937 = i_8_;
            ((Object3) class47).uid = l;
            if (Class22.groundArray[i][i_6_][i_7_] == null)
                Class22.groundArray[i][i_6_][i_7_] = new Ground(i, i_6_, i_7_);
            ((Ground) (Class22.groundArray[i][i_6_][i_7_])).object_3 = class47;
        }
    }
}
