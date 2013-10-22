/* Class68_Sub28_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub28_Sub4 extends Class68_Sub28
{
    private NodeList aClass16_4574 = new NodeList();
    private NodeList aClass16_4575 = new NodeList();
    private int anInt4576 = -1;
    private int anInt4577 = 0;

    final int method1224()
    {
        return 0;
    }

    final Class68_Sub28 method1226()
    {
        return (Class68_Sub28) aClass16_4574.method293((byte) 76);
    }

    private final void method1312(Class68_Sub23 class68_sub23)
    {
        class68_sub23.unlink();
        class68_sub23.method1204();
        Node class68 = ((Node) ((NodeList) aClass16_4575).head).previous;
        if (class68 == ((NodeList) aClass16_4575).head)
            anInt4576 = -1;
        else
            anInt4576 = ((Class68_Sub23) (Class68_Sub23) class68).anInt3153;
    }

    private final void method1313(int i)
    {
        for (Class68_Sub28 class68_sub28 = (Class68_Sub28) aClass16_4574.method293((byte) 76); class68_sub28 != null; class68_sub28 = (Class68_Sub28) aClass16_4574.method290((byte) -110))
            class68_sub28.method1229(i);
    }

    final synchronized void method1314(Class68_Sub28 class68_sub28)
    {
        class68_sub28.unlink();
    }

    private final void method1315(Node class68, Class68_Sub23 class68_sub23)
    {
        for (/**/; (class68 != ((NodeList) aClass16_4575).head && (((Class68_Sub23) (Class68_Sub23) class68).anInt3153 <= ((Class68_Sub23) class68_sub23).anInt3153)); class68 = ((Node) class68).previous)
        {
            /* empty */
        }
        Class75_Sub3.method1399(86, class68, class68_sub23);
        anInt4576 = ((Class68_Sub23) (Class68_Sub23) (((Node) ((NodeList) aClass16_4575).head).previous)).anInt3153;
    }

    final synchronized void method1316(Class68_Sub28 class68_sub28)
    {
        aClass16_4574.method291((byte) 107, class68_sub28);
    }

    final synchronized void method1225(int[] is, int i, int i_0_)
    {
        do
        {
            if (anInt4576 < 0)
            {
                method1318(is, i, i_0_);
                break;
            }
            if (anInt4577 + i_0_ < anInt4576)
            {
                anInt4577 += i_0_;
                method1318(is, i, i_0_);
                break;
            }
            int i_1_ = anInt4576 - anInt4577;
            method1318(is, i, i_1_);
            i += i_1_;
            i_0_ -= i_1_;
            anInt4577 += i_1_;
            method1317();
            Class68_Sub23 class68_sub23 = (Class68_Sub23) aClass16_4575.method293((byte) 76);
            synchronized (class68_sub23)
            {
                int i_2_ = class68_sub23.method1203(this);
                if (i_2_ < 0)
                {
                    ((Class68_Sub23) class68_sub23).anInt3153 = 0;
                    method1312(class68_sub23);
                } else
                {
                    ((Class68_Sub23) class68_sub23).anInt3153 = i_2_;
                    method1315(((Node) class68_sub23).previous, class68_sub23);
                }
            }
        } while (i_0_ != 0);
    }

    final synchronized void method1229(int i)
    {
        do
        {
            if (anInt4576 < 0)
            {
                method1313(i);
                break;
            }
            if (anInt4577 + i < anInt4576)
            {
                anInt4577 += i;
                method1313(i);
                break;
            }
            int i_3_ = anInt4576 - anInt4577;
            method1313(i_3_);
            i -= i_3_;
            anInt4577 += i_3_;
            method1317();
            Class68_Sub23 class68_sub23 = (Class68_Sub23) aClass16_4575.method293((byte) 76);
            synchronized (class68_sub23)
            {
                int i_4_ = class68_sub23.method1203(this);
                if (i_4_ < 0)
                {
                    ((Class68_Sub23) class68_sub23).anInt3153 = 0;
                    method1312(class68_sub23);
                } else
                {
                    ((Class68_Sub23) class68_sub23).anInt3153 = i_4_;
                    method1315(((Node) class68_sub23).previous, class68_sub23);
                }
            }
        } while (i != 0);
    }

    private final void method1317()
    {
        if (anInt4577 > 0)
        {
            for (Class68_Sub23 class68_sub23 = (Class68_Sub23) aClass16_4575.method293((byte) 76); class68_sub23 != null; class68_sub23 = (Class68_Sub23) aClass16_4575.method290((byte) -127))
                ((Class68_Sub23) class68_sub23).anInt3153 -= anInt4577;
            anInt4576 -= anInt4577;
            anInt4577 = 0;
        }
    }

    final Class68_Sub28 method1228()
    {
        return (Class68_Sub28) aClass16_4574.method290((byte) -110);
    }

    private final void method1318(int[] is, int i, int i_5_)
    {
        for (Class68_Sub28 class68_sub28 = (Class68_Sub28) aClass16_4574.method293((byte) 76); class68_sub28 != null; class68_sub28 = (Class68_Sub28) aClass16_4574.method290((byte) -116))
            class68_sub28.method1223(is, i, i_5_);
    }

    public Class68_Sub28_Sub4()
    {
        /* empty */
    }
}
