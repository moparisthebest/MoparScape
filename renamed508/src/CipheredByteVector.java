/* Class68_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CipheredByteVector extends Stream
{
    static int[] updateBlockIndices;
    static int anInt4113;
    static int anInt4114;
    static int anInt4115;
    static int anInt4116;
    static int anInt4117;
    private RandomNumberGenerator randomNumberGenerator;
    static Class1_Sub4[] aClass1_Sub4Array4119;
    static MRUNodes aClass98_4120;
    static int anInt4121;
    static MutableString aClass100_4122;
    static MutableString aClass100_4123 = Class112.makeMutableString(43, "<col=ffff00>");
    static int anInt4124;
    static int anInt4125;
    static int anInt4126;
    static int anInt4127;
    private int bitPosition;
    static boolean aBoolean4129;
    static int anInt4130;
    static int anInt4131;
    static int anInt4132;
    static int anInt4133;
    static int[] anIntArray4134;
    static Class21_Sub1 aClass21_Sub1_4135;
    static MutableString aClass100_4136;

    final void seedRNG(int[] keys)
    {
        randomNumberGenerator = new RandomNumberGenerator(keys);
    }

    final void bitAccess()
    {
        bitPosition = 8 * position;
    }

    final void byteAccess()
    {
        position = (bitPosition + 7) / 8;
    }

    final int readBits(int amount)
    {
        int bytePosition = bitPosition >> 3;
        int bitOffset = 8 - (bitPosition & 0x7);
        bitPosition += amount;
        int val = 0;
        for (/**/; bitOffset < amount; bitOffset = 8)
        {
            val += (buffer[bytePosition++] & Class96.BIT_MASKS[bitOffset]) << amount - bitOffset;
            amount -= bitOffset;
        }
        if (amount != bitOffset)
            val += buffer[bytePosition] >> bitOffset - amount & Class96.BIT_MASKS[amount];
        else
            val += Class96.BIT_MASKS[bitOffset] & buffer[bytePosition];
        return val;
    }

    static final int method968(int i, int i_5_)
    {
        anInt4124++;
        if (i == 16711935)
            return -1;
        if (i_5_ != -16844)
            return -120;
        return Class74.method1382(i, -82);
    }

    CipheredByteVector(int i)
    {
        super(i);
    }

    static final void method969(MutableString class100, int i, int i_6_)
    {
        try
        {
            anInt4116++;
            Class36.anInt641++;
            Class21.connectionVector.startPacket(111);
            if (i == -32443)
            {
                Class21.connectionVector.writeByte(i_6_);
                Class21.connectionVector.writeLELong(class100.method1615(10908));
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cc.EC(" + (class100 != null ? "{...}" : "null") + ',' + i + ',' + i_6_ + ')'));
        }
    }

    final int distanceToBitPosition(int i)
    {
        return 8 * i - bitPosition;
    }

    static final void method971(int i)
    {
        Class78.method1416(103);
        Class18.method301(-93);
        Class68_Sub13_Sub31.method855((byte) -103);
        Class59.method585((byte) -88);
        Class68_Sub26.method1215((byte) -108);
        Class1_Sub1.method68((byte) -96);
        Class68_Sub28_Sub2.method1267(125);
        Class75_Sub1_Sub1.method1392(true);
        Class68_Sub13_Sub28.method845((byte) -115);
        anInt4130++;
        Object5.method1329((byte) 78);
        Class44.method493((byte) -59);
        Object1.method625(-27434);
        Class68_Sub13_Sub4.method718((byte) -88);
        NPCDefinition.method1451(-10705);
        ((Class90) Class62.anInterface4_1159).method1519((byte) -95);
        Class68_Sub13_Sub16.aClass82_3704.method1476((byte) -11);
        Class68_Sub28_Sub1.aClass21_Sub1_4521.method357(0);
        Class58.aClass21_Sub1_1097.method357(0);
        Class68_Sub13_Sub21.aClass21_Sub1_3806.method357(i ^ i);
        Class78.aClass21_Sub1_1390.method357(i ^ 0x89);
        Class92.aClass21_Sub1_1646.method357(0);
        Class21.aClass21_Sub1_459.method357(0);
        Class120.aClass21_Sub1_2097.method357(0);
        Class52.aClass21_Sub1_1011.method357(0);
        Class84.aClass21_Sub1_1534.method357(0);
        Class21.aClass21_Sub1_472.method357(0);
        Class13.aClass21_Sub1_221.method357(0);
        Class108.aClass98_1829.method1572((byte) 94);
    }

    final int getPacket()
    {
        return (buffer[position++] - randomNumberGenerator.getNext()) & 0xff;
    }

    final void startPacket(int opcode)
    {
        buffer[position++] = (byte) (opcode + randomNumberGenerator.getNext());
    }

    public static void method974(boolean bool)
    {
        aClass98_4120 = null;
        aClass100_4123 = null;
        aClass1_Sub4Array4119 = null;
        if (bool != false)
            method974(true);
        aClass100_4122 = null;
        aClass100_4136 = null;
        aClass21_Sub1_4135 = null;
        anIntArray4134 = null;
        updateBlockIndices = null;
    }

    static final Class68_Sub20_Sub16 method975(int i, int i_10_, int i_11_)
    {
        anInt4125++;
        for (Class68_Sub20_Sub16 class68_sub20_sub16 = ((Class68_Sub20_Sub16) Class35.aClass16_602.method293((byte) 76)); class68_sub20_sub16 != null; class68_sub20_sub16 = ((Class68_Sub20_Sub16) Class35.aClass16_602.method290((byte) -110)))
        {
            if (((Class68_Sub20_Sub16) class68_sub20_sub16).aBoolean4415 && class68_sub20_sub16.method1174(67, i_10_, i))
                return class68_sub20_sub16;
        }
        if (i_11_ != 111)
            aClass1_Sub4Array4119 = null;
        return null;
    }

    final void readCipheredBytes(byte[] dest, int len, int off)
    {
        for (int idx = 0; idx < len; idx++)
            dest[idx + off] = (byte) (buffer[position++] - randomNumberGenerator.getNext());
    }

    static
    {
        aClass1_Sub4Array4119 = new Class1_Sub4[4];
        updateBlockIndices = new int[2048];
        aClass100_4122 = Class112.makeMutableString(43, "Ladevorgang )2 bitte warten Sie)3");
        aBoolean4129 = false;
        anIntArray4134 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
        aClass98_4120 = new MRUNodes(64);
        aClass100_4136 = Class112.makeMutableString(43, "sl_arrows");
    }
}
