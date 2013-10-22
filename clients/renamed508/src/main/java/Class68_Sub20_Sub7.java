/* Class68_Sub20_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub7 extends NodeSub
{
    static int anInt4254 = 0;
    static int anInt4255;
    static int anInt4256;
    static int anInt4257;
    static MutableString aClass100_4258 = Class112.makeMutableString(43, ")4g");
    static int anInt4259;
    static int anInt4260;
    static int anInt4261;
    static int anInt4262 = 0;
    static int[] anIntArray4263 = { 16, 32, 64, 128 };
    static long aLong4264;
    static int[] anIntArray4265;
    private NodeCache aClass113_4266;
    static int anInt4267;
    static short[] aShortArray4268;
    static MutableString aClass100_4269;

    public static void method1073(int i)
    {
        if (i != -23562)
            method1075(false, 72, 88, 47, null);
        anIntArray4263 = null;
        aClass100_4258 = null;
        aClass100_4269 = null;
        anIntArray4265 = null;
        aShortArray4268 = null;
    }

    private final void method1074(int i, int i_0_, Stream class68_sub14)
    {
        try
        {
            if (i == 249)
            {
                int i_1_ = class68_sub14.readUByte();
                if (aClass113_4266 == null)
                {
                    int i_2_ = Class90.method1523(i_1_, -21189);
                    aClass113_4266 = new NodeCache(i_2_);
                }
                for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
                {
                    boolean bool = class68_sub14.readUByte() == 1;
                    int i_4_ = class68_sub14.readTInteger();
                    Node class68;
                    if (!bool)
                        class68 = new Class68_Sub10(class68_sub14.readInteger());
                    else
                        class68 = new Class68_Sub5(class68_sub14.readString());
                    aClass113_4266.method1683((byte) 127, class68, (long) i_4_);
                }
            }
            if (i_0_ != -6)
                method1077(34, -83, -92);
            anInt4261++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("fh.A(" + i + ',' + i_0_ + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1075(boolean bool, int i, int i_5_, int i_6_, Widget class45)
    {
        do
        {
            try
            {
                if (i <= 9)
                    anIntArray4263 = null;
                anInt4256++;
                int i_7_ = ((Widget) class45).anInt892;
                int i_8_ = ((Widget) class45).anInt873;
                if (((Widget) class45).aByte779 != 0)
                {
                    if (((Widget) class45).aByte779 == 1)
                        ((Widget) class45).anInt892 = i_6_ - ((Widget) class45).width;
                    else if (((Widget) class45).aByte779 == 2)
                        ((Widget) class45).anInt892 = ((Widget) class45).width * i_6_ >> 14;
                    else if (((Widget) class45).aByte779 == 3)
                    {
                        if (((Widget) class45).type == 2)
                            ((Widget) class45).anInt892 = (((((Widget) class45).width - 1) * ((Widget) class45).inventorySpritePaddingX) + 32 * ((Widget) class45).width);
                        else if (((Widget) class45).type == 7)
                            ((Widget) class45).anInt892 = (115 * ((Widget) class45).width + ((((Widget) class45).width - 1) * ((Widget) class45).inventorySpritePaddingX));
                    }
                } else
                    ((Widget) class45).anInt892 = ((Widget) class45).width;
                if (((Widget) class45).aByte811 == 0)
                    ((Widget) class45).anInt873 = ((Widget) class45).height;
                else if (((Widget) class45).aByte811 != 1)
                {
                    if (((Widget) class45).aByte811 == 2)
                        ((Widget) class45).anInt873 = i_5_ * ((Widget) class45).height >> 14;
                    else if (((Widget) class45).aByte811 == 3)
                    {
                        if (((Widget) class45).type == 2)
                            ((Widget) class45).anInt873 = ((((Widget) class45).inventorySpritePaddingY * (((Widget) class45).height - 1)) + 32 * ((Widget) class45).height);
                        else if (((Widget) class45).type == 7)
                            ((Widget) class45).anInt873 = (((((Widget) class45).height - 1) * ((Widget) class45).inventorySpritePaddingY) + ((Widget) class45).height * 12);
                    }
                } else
                    ((Widget) class45).anInt873 = i_5_ - ((Widget) class45).height;
                if (((Widget) class45).aByte779 == 4)
                    ((Widget) class45).anInt892 = (((Widget) class45).anInt849 * ((Widget) class45).anInt873 / ((Widget) class45).anInt768);
                if (((Widget) class45).aByte811 == 4)
                    ((Widget) class45).anInt873 = (((Widget) class45).anInt892 * ((Widget) class45).anInt768 / ((Widget) class45).anInt849);
                if (NodeSub.aBoolean3096 && (client.method41(class45) != 0 || ((Widget) class45).type == 0))
                {
                    if (((Widget) class45).anInt873 < 5 && ((Widget) class45).anInt892 < 5)
                    {
                        ((Widget) class45).anInt892 = 5;
                        ((Widget) class45).anInt873 = 5;
                    } else
                    {
                        if (((Widget) class45).anInt892 <= 0)
                            ((Widget) class45).anInt892 = 5;
                        if (((Widget) class45).anInt873 <= 0)
                            ((Widget) class45).anInt873 = 5;
                    }
                }
                if (((Widget) class45).anInt808 == 1337)
                    Class68_Sub20_Sub17.aClass45_4443 = class45;
                if (!bool || ((Widget) class45).anObjectArray802 == null)
                    break;
                if (i_7_ != ((Widget) class45).anInt892 || i_8_ != ((Widget) class45).anInt873)
                {
                    ScriptParameters class68_sub29 = new ScriptParameters();
                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray802;
                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                    Class115.aClass16_1957.pushFront(class68_sub29);
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("fh.F(" + bool + ',' + i + ',' + i_5_ + ',' + i_6_ + ',' + (class45 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final MutableString method1076(int i, MutableString class100, int i_9_)
    {
        try
        {
            anInt4260++;
            if (aClass113_4266 == null)
                return class100;
            Class68_Sub5 class68_sub5 = (Class68_Sub5) aClass113_4266.method1684((long) i_9_, 73);
            if (i != -1)
                return null;
            if (class68_sub5 == null)
                return class100;
            return ((Class68_Sub5) class68_sub5).aClass100_2832;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("fh.B(" + i + ',' + (class100 != null ? "{...}" : "null") + ',' + i_9_ + ')'));
        }
    }

    final int method1077(int i, int i_10_, int i_11_)
    {
        anInt4267++;
        if (aClass113_4266 == null)
            return i;
        if (i_10_ != 9081)
            return -34;
        Class68_Sub10 class68_sub10 = (Class68_Sub10) aClass113_4266.method1684((long) i_11_, 74);
        if (class68_sub10 == null)
            return i;
        return ((Class68_Sub10) class68_sub10).anInt2904;
    }

    public Class68_Sub20_Sub7()
    {
        /* empty */
    }

    final void method1078(Stream class68_sub14, byte i)
    {
        try
        {
            if (i > -91)
                method1074(93, -71, null);
            for (;;)
            {
                int i_12_ = class68_sub14.readUByte();
                if (i_12_ == 0)
                    break;
                method1074(i_12_, -6, class68_sub14);
            }
            anInt4255++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "fh.C(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static
    {
        anInt4259 = -2;
        anInt4257 = 0;
        aLong4264 = 0L;
        anIntArray4265 = new int[] { 1, 0, -1, 0 };
        aClass100_4269 = Class112.makeMutableString(43, "(U");
        aShortArray4268 = new short[256];
    }
}
