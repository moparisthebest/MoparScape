/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107
{
    int anInt1813;
    static int anInt1814;
    static int anInt1815;
    int anInt1816;
    static int anInt1817 = 0;
    static int anInt1818;
    static byte[][] allocatedMediumBuffers;
    static MutableString aClass100_1820 = Class112.makeMutableString(43, "blaugr-Un:");
    static int anInt1821;
    int anInt1822;
    static int anInt1823;
    int anInt1824;
    static int anInt1825;

    static final void method1655(int i, long l)
    {
        anInt1821++;
        if (l != 0L)
        {
            Class21.connectionVector.startPacket(42);
            if (i != -256)
                method1656(-102, 125, 108);
            Class21.connectionVector.writeLong(l);
            Class97.anInt1717++;
        }
    }

    static final long method1656(int i, int i_0_, int i_1_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_0_][i_1_];
        if (class68_sub1 == null || ((Ground) class68_sub1).object_1 == null)
            return 0L;
        return (((Object1) ((Ground) class68_sub1).object_1).uid);
    }

    static final void method1657(int i)
    {
        int i_2_ = Class30.aClass16_541.getLength();
        anInt1825++;
        if (i_2_ != 0)
        {
            Class21.connectionVector.startPacket(67);
            Class21.connectionVector.writeByte(0);
            int i_3_ = ((Stream) Class21.connectionVector).position;
            int i_4_ = 0;
            Class68_Sub6.anInt2843++;
            if (i != -14394)
                method1657(112);
            Class68_Sub10 class68_sub10 = (Class68_Sub10) Class30.aClass16_541.method294(-98);
            Class21.connectionVector.writeShort(((Class68_Sub10) class68_sub10).anInt2904);
            int i_5_ = ((Class68_Sub10) class68_sub10).anInt2904;
            while ((class68_sub10 = (Class68_Sub10) Class30.aClass16_541.method294(-104)) != null)
            {
                if (i_4_ < 255 && i_5_ + 1 == ((Class68_Sub10) class68_sub10).anInt2904)
                    i_4_++;
                else
                {
                    Class21.connectionVector.writeByte(i_4_);
                    i_4_ = 0;
                    Class21.connectionVector.writeShort((((Class68_Sub10) class68_sub10).anInt2904));
                }
                i_5_ = ((Class68_Sub10) class68_sub10).anInt2904;
            }
            Class21.connectionVector.writeByte(i_4_);
            Class21.connectionVector.writeSizeByte((((Stream) Class21.connectionVector).position - i_3_));
        }
    }

    static final GameException getException(Throwable cause, String message)
    {
        anInt1814++;
        GameException e;
        if (cause instanceof GameException)
        {
            e = (GameException) cause;
            ((GameException) e).message += ' ' + (String) message;
        } else
            e = new GameException(cause, message);
        return e;
    }

    public static void method1659(int i)
    {
        allocatedMediumBuffers = null;
        aClass100_1820 = null;
        if (i <= 121)
            method1656(33, 61, 40);
    }

    static final void method1660(int i)
    {
        if (i != -13401)
            method1657(46);
        anInt1815++;
        int i_6_ = Class68_Sub7.method666(i ^ ~0x3459);
        if (i_6_ != 0)
        {
            if (i_6_ != 1)
            {
                Class121.method1748(105, (byte) (Class3.anInt84 - 4 & 0xff));
                Class68_Sub13_Sub30.method851(-56, 2);
            } else
            {
                Class121.method1748(i + 13498, (byte) 0);
                Class68_Sub13_Sub30.method851(-54, 512);
                Class8.method202(true);
            }
        } else
        {
            NodeSub.aByteArrayArrayArray3097 = null;
            Class68_Sub13_Sub30.method851(-91, 0);
        }
    }

    public Class107()
    {
        /* empty */
    }

    Class107(Class107 class107_7_)
    {
        try
        {
            ((Class107) this).anInt1824 = ((Class107) class107_7_).anInt1824;
            ((Class107) this).anInt1822 = ((Class107) class107_7_).anInt1822;
            ((Class107) this).anInt1816 = ((Class107) class107_7_).anInt1816;
            ((Class107) this).anInt1813 = ((Class107) class107_7_).anInt1813;
        } catch (RuntimeException runtimeexception)
        {
            throw getException(runtimeexception, "sh.<init>(" + (class107_7_ != null ? "{...}" : "null") + ')');
        }
    }

    static
    {
        allocatedMediumBuffers = new byte[250][];
    }
}
