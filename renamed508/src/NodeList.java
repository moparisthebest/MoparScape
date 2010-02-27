/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeList
{
    static int anInt253;
    static int anInt254;
    static int anInt255;
    static int anInt256;
    static int anInt257;
    static int anInt258;
    static int[] anIntArray259 = new int[32];
    static int anInt260;
    static int anInt261;
    static int anInt262;
    static int anInt263;
    static int anInt264;
    static int anInt265;
    Node head = new Node();
    static int anInt267;
    static int anInt268;
    static int anInt269;
    private Node current;
    static int anInt271;
    static boolean aBoolean272;
    static int anInt273;
    static MutableString aClass100_274;
    static int anInt275;
    static int anInt276;
    static long aLong277;
    static int anInt278;

    final Node next()
    {
        Node node = current;
        if (node == head)
        {
            current = null;
            return null;
        }
        current = node.next;
        return node;
    }

    public static void method281(int i)
    {
        aClass100_274 = null;
        if (i != 0)
            anInt278 = 92;
        anIntArray259 = null;
    }

    static final void method282(boolean bool, int i)
    {
        Class68_Sub13_Sub22.anIntArray3807 = new int[104];
        Object1.anIntArray1180 = new int[104];
        Stream.anIntArray3007 = new int[104];
        anInt268++;
        Class68_Sub25.anInt3176 = 99;
        Class68_Sub13_Sub15.anIntArray3681 = new int[104];
        Class14.anIntArray236 = new int[104];
        int i_0_;
        if (!bool)
            i_0_ = 4;
        else
            i_0_ = 1;
        Class52.aByteArrayArrayArray1014 = new byte[i_0_][104][104];
        Class68_Sub13_Sub35.aByteArrayArrayArray4030 = new byte[i_0_][104][104];
        GroundData.aByteArrayArrayArray676 = new byte[i_0_][105][105];
        Class109.aByteArrayArrayArray1849 = new byte[i_0_][104][104];
        Class85.aByteArrayArrayArray1556 = new byte[i_0_][104][104];
        if (i != -1261)
            anInt276 = -118;
        Class74.anIntArrayArrayArray1336 = new int[i_0_][105][105];
    }

    static final void method283(MutableString class100, int i, MutableString class100_1_, int i_2_)
    {
        try
        {
            Class68_Sub28_Sub2.password = class100;
            anInt264++;
            Class68_Sub28_Sub2.username = class100_1_;
            Class75_Sub3_Sub1.aBoolean4599 = false;
            Class36.anInt642 = 0;
            Class68_Sub13_Sub5.anInt3520 = i_2_;
            if (Class68_Sub28_Sub2.username.equalTo(Class68_Sub28_Sub2.aClass100_4558) || (Class68_Sub28_Sub2.password.equalTo(Class68_Sub28_Sub2.aClass100_4558)))
            {
                Class68_Sub20_Sub7.anInt4259 = 3;
                Class32.anInt574 = 0;
            } else
            {
                Class68_Sub20_Sub7.anInt4259 = -3;
                if (i <= 10)
                    method285(-14, null, -44, null);
                GroundData.anInt666 = 0;
                Class32.anInt574 = 1;
                Class68_Sub13_Sub24.anInt3843 = 0;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("c.B(" + (class100 != null ? "{...}" : "null") + ',' + i + ',' + (class100_1_ != null ? "{...}" : "null") + ',' + i_2_ + ')'));
        }
    }

    final void method284(int i)
    {
        for (;;)
        {
            Node node = head.previous;
            if (head == node)
                break;
            node.unlink();
        }
        current = null;
    }

    static final void method285(int i, byte[] is, int i_3_, Class89 class89)
    {
        try
        {
            anInt256++;
            Class68_Sub25 class68_sub25 = new Class68_Sub25();
            ((Class68_Sub25) class68_sub25).aByteArray3167 = is;
            ((Node) class68_sub25).nodeID = (long) i;
            ((Class68_Sub25) class68_sub25).anInt3179 = 0;
            ((Class68_Sub25) class68_sub25).aClass89_3172 = class89;
            synchronized (Class68_Sub20_Sub10.aClass16_4316)
            {
                Class68_Sub20_Sub10.aClass16_4316.pushFront(class68_sub25);
                if (i_3_ != -30372)
                    method283(null, -25, null, -36);
            }
            Class68_Sub20_Sub11.method1140(600);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("c.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_3_ + ',' + (class89 != null ? "{...}" : "null") + ')'));
        }
    }

    final void pushFront(Node node)
    {
        if (node.next != null)
            node.unlink();
        node.previous = head;
        node.next = head.next;
        node.next.previous = node;
        node.previous.next = node;
    }

    static final void parseLocalPlayersUpdateFlags()
    {
        for (int idx = 0; Class68_Sub20_Sub16.updateBlockCount > idx; idx++)
        {
            int index = CipheredByteVector.updateBlockIndices[idx];
            Player player = Class68_Sub13_Sub4.localPlayers[index];
            int flag = Class68_Sub13_Sub8.connectionVector.readUByte();
            if ((flag & 0x10) != 0)
                flag += Class68_Sub13_Sub8.connectionVector.readUByte() << 8;
            Class58.applyPlayerUpdateFlag(flag, player, -19219, index);
        }
    }

    final int getLength()
    {
        Node node = head.previous;
        int len = 0;
        for (/**/; head != node; node = node.previous)
            len++;
        return len;
    }

    final Node method289(int i)
    {
        if (i != 30568)
            method291((byte) 75, null);
        anInt258++;
        Node class68 = ((Node) ((NodeList) this).head).next;
        if (((NodeList) this).head == class68)
        {
            current = null;
            return null;
        }
        current = ((Node) class68).next;
        return class68;
    }

    final Node method290(byte i)
    {
        Node node = current;
        if (head == node)
        {
            current = null;
            return null;
        }
        current = node.previous;
        return node;
    }

    final void method291(byte i, Node class68)
    {
        do
        {
            try
            {
                if (((Node) class68).next != null)
                    class68.unlink();
                anInt261++;
                ((Node) class68).previous = ((Node) ((NodeList) this).head).previous;
                ((Node) class68).next = ((NodeList) this).head;
                ((Node) ((Node) class68).next).previous = class68;
                ((Node) ((Node) class68).previous).next = class68;
                if (i > 33)
                    break;
                anInt275 = 117;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, "c.K(" + i + ',' + (class68 != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }

    static final void method292(byte i)
    {
        anInt265++;
        for (int i_9_ = 0; i_9_ < 100; i_9_++)
            Class121.aBooleanArray2111[i_9_] = true;
        if (i <= 30)
            anInt275 = 91;
    }

    final Node method293(byte i)
    {
        if (i != 76)
            current = null;
        Node class68 = ((Node) ((NodeList) this).head).previous;
        anInt260++;
        if (class68 == ((NodeList) this).head)
        {
            current = null;
            return null;
        }
        current = ((Node) class68).previous;
        return class68;
    }

    final Node method294(int i)
    {
        anInt269++;
        Node class68 = ((Node) ((NodeList) this).head).previous;
        int i_10_ = -90 % ((-41 - i) / 50);
        if (class68 == ((NodeList) this).head)
            return null;
        class68.unlink();
        return class68;
    }

    public NodeList()
    {
        ((Node) ((NodeList) this).head).next = ((NodeList) this).head;
        ((Node) ((NodeList) this).head).previous = ((NodeList) this).head;
    }

    static
    {
        int i = 2;
        for (int i_11_ = 0; i_11_ < 32; i_11_++)
        {
            anIntArray259[i_11_] = i - 1;
            i += i;
        }
        anInt275 = 128;
        anInt276 = -1;
        anInt271 = 0;
        aClass100_274 = Class112.makeMutableString(43, ": ");
        aLong277 = 0L;
        anInt273 = 0;
    }
}
