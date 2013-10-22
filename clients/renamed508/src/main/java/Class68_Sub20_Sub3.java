/* Class68_Sub20_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub3 extends NodeSub
{
    static Class21 aClass21_4194;
    private NodeCache aClass113_4195;
    static MutableString aClass100_4196;
    static int anInt4197;
    static int anInt4198 = 0;
    int anInt4199;
    static int anInt4200;
    int anInt4201;
    static int anInt4202;
    static int anInt4203;
    private NodeCache aClass113_4204;
    static int anInt4205;
    static int anInt4206;
    private int anInt4207;
    static int anInt4208;
    static int anInt4209;
    private MutableString aClass100_4210 = Class50.aClass100_992;
    static int anInt4211;
    static int anInt4212;
    static int anInt4213;
    static int anInt4214;
    static int anInt4215;

    final boolean method1046(byte i, int i_0_)
    {
        anInt4208++;
        if (aClass113_4204 == null)
            return false;
        if (aClass113_4195 == null)
            method1053(113);
        if (i > -78)
            method1055(null, 122, null);
        Class68_Sub10 class68_sub10 = (Class68_Sub10) aClass113_4195.method1684((long) i_0_, -74);
        if (class68_sub10 == null)
            return false;
        return true;
    }

    final MutableString method1047(byte i, int i_1_)
    {
        int i_2_ = -13 / ((i + 51) / 55);
        anInt4200++;
        if (aClass113_4204 == null)
            return aClass100_4210;
        Class68_Sub5 class68_sub5 = (Class68_Sub5) aClass113_4204.method1684((long) i_1_, -78);
        if (class68_sub5 == null)
            return aClass100_4210;
        return ((Class68_Sub5) class68_sub5).aClass100_2832;
    }

    final void method1048(int i, Stream class68_sub14)
    {
        do
        {
            try
            {
                for (;;)
                {
                    int i_3_ = class68_sub14.readUByte();
                    if (i_3_ == 0)
                        break;
                    method1057(class68_sub14, (byte) -119, i_3_);
                }
                anInt4205++;
                if (i == 0)
                    break;
                ((Class68_Sub20_Sub3) this).anInt4201 = 28;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("cd.A(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    private final void method1049(int i)
    {
        aClass113_4195 = new NodeCache(aClass113_4204.method1686(-128));
        if (i == 6)
        {
            for (Class68_Sub5 class68_sub5 = (Class68_Sub5) aClass113_4204.method1685(-32642); class68_sub5 != null; class68_sub5 = (Class68_Sub5) aClass113_4204.method1689((byte) -120))
            {
                Class68_Sub24 class68_sub24 = new Class68_Sub24((((Class68_Sub5) class68_sub5).aClass100_2832), (int) (((Node) class68_sub5).nodeID));
                aClass113_4195.method1683((byte) -9, class68_sub24, ((Class68_Sub5) class68_sub5).aClass100_2832.method1586(85));
            }
            anInt4215++;
        }
    }

    final boolean method1050(int i, MutableString class100)
    {
        try
        {
            anInt4206++;
            if (i < 62)
                return true;
            if (aClass113_4204 == null)
                return false;
            if (aClass113_4195 == null)
                method1049(6);
            for (Class68_Sub24 class68_sub24 = ((Class68_Sub24) aClass113_4195.method1684(class100.method1586(-85), -71)); class68_sub24 != null; class68_sub24 = (Class68_Sub24) aClass113_4195.method1692(127))
            {
                if (((Class68_Sub24) class68_sub24).aClass100_3165.equalTo(class100))
                    return true;
            }
            return false;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cd.D(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    static final int method1051(int i, int i_4_)
    {
        anInt4197++;
        if (i_4_ < 0)
            return 0;
        Class68_Sub22 class68_sub22 = ((Class68_Sub22) Class68_Sub13_Sub8.aClass113_3566.method1684((long) i_4_, i - 121));
        if (class68_sub22 == null)
            return (((Class68_Sub20_Sub2) Class125.method1769((byte) 106, i_4_)).anInt4183);
        int i_5_ = 0;
        for (int i_6_ = 0; i_6_ < ((Class68_Sub22) class68_sub22).anIntArray3146.length; i_6_++)
        {
            if (((Class68_Sub22) class68_sub22).anIntArray3146[i_6_] == -1)
                i_5_++;
        }
        i_5_ += ((((Class68_Sub20_Sub2) Class125.method1769((byte) 126, i_4_)).anInt4183) - ((Class68_Sub22) class68_sub22).anIntArray3146.length);
        if (i != 2)
            return -37;
        return i_5_;
    }

    static final Class105 method1052(int i)
    {
        anInt4214++;
        if (i != 3253)
            method1056(-92);
        try
        {
            return (Class105) Class.forName("Class105_Sub1").newInstance();
        } catch (Throwable throwable)
        {
            return null;
        }
    }

    private final void method1053(int i)
    {
        aClass113_4195 = new NodeCache(aClass113_4204.method1686(-128));
        if (i >= 50)
        {
            for (Class68_Sub10 class68_sub10 = (Class68_Sub10) aClass113_4204.method1685(-32642); class68_sub10 != null; class68_sub10 = ((Class68_Sub10) aClass113_4204.method1689((byte) -117)))
            {
                Class68_Sub10 class68_sub10_7_ = new Class68_Sub10((int) ((Node) class68_sub10).nodeID);
                aClass113_4195.method1683((byte) 123, class68_sub10_7_, (long) ((Class68_Sub10) class68_sub10).anInt2904);
            }
            anInt4213++;
        }
    }

    final int method1054(int i, int i_8_)
    {
        anInt4211++;
        if (aClass113_4204 == null)
            return anInt4207;
        Class68_Sub10 class68_sub10 = (Class68_Sub10) aClass113_4204.method1684((long) i, -84);
        if (i_8_ != -32511)
            return -78;
        if (class68_sub10 == null)
            return anInt4207;
        return ((Class68_Sub10) class68_sub10).anInt2904;
    }

    static final MutableString method1055(MutableString class100, int i, Widget class45)
    {
        try
        {
            anInt4209++;
            if (class100.method1601(-125, Class68_Sub20_Sub7.aClass100_4269) != -1)
            {
                for (;;)
                {
                    int i_9_ = class100.method1601(33, Class89.aClass100_1620);
                    if (i_9_ == -1)
                        break;
                    class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100.method1613(0, (byte) -74, i_9_), (Class68_Sub13_Sub6.method720(Class68_Sub24.method1205(0, 20, class45), i ^ ~0x6c6d)), class100.method1621(i_9_ + 2, true) })));
                }
                for (;;)
                {
                    int i_10_ = class100.method1601(i ^ 0x6c5c, Class4.aClass100_94);
                    if (i_10_ == -1)
                        break;
                    class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100.method1613(0, (byte) -74, i_10_), (Class68_Sub13_Sub6.method720(Class68_Sub24.method1205(1, 20, class45), -1)), class100.method1621(i_10_ + 2, true) })));
                }
                for (;;)
                {
                    int i_11_ = class100.method1601(i - 27678, Class89.aClass100_1621);
                    if (i_11_ == -1)
                        break;
                    class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100.method1613(0, (byte) -74, i_11_), (Class68_Sub13_Sub6.method720(Class68_Sub24.method1205(2, i - 27737, class45), -1)), class100.method1621(i_11_ + 2, true) })));
                }
                for (;;)
                {
                    int i_12_ = class100.method1601(-126, (Class68_Sub13_Sub18.aClass100_3734));
                    if (i_12_ == -1)
                        break;
                    class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100.method1613(0, (byte) -74, i_12_), (Class68_Sub13_Sub6.method720(Class68_Sub24.method1205(3, 20, class45), -1)), class100.method1621(i_12_ + 2, true) })));
                }
                for (;;)
                {
                    int i_13_ = class100.method1601(i - 27855, Class7.aClass100_127);
                    if (i_13_ == -1)
                        break;
                    class100 = (Class68_Sub20_Sub13_Sub2.method1166(i - 27755, (new MutableString[] { class100.method1613(0, (byte) -74, i_13_), (Class68_Sub13_Sub6.method720(Class68_Sub24.method1205(4, 20, class45), -1)), class100.method1621(i_13_ + 2, true) })));
                }
                for (;;)
                {
                    int i_14_ = class100.method1601(-73, Class21_Sub1.aClass100_2704);
                    if (i_14_ == -1)
                        break;
                    MutableString class100_15_ = Class68_Sub28_Sub2.aClass100_4558;
                    if (Class68_Sub10.aClass31_2916 != null)
                    {
                        class100_15_ = Class1_Sub7.method165((Class68_Sub10.aClass31_2916.anInt559), -17516);
                        try
                        {
                            if (Class68_Sub10.aClass31_2916.playerDefSocket != null)
                            {
                                byte[] is = ((String) Class68_Sub10.aClass31_2916.playerDefSocket).getBytes("ISO-8859-1");
                                class100_15_ = Class68_Sub13_Sub27.method842(is.length, is, 0);
                            }
                        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception)
                        {
                            /* empty */
                        }
                    }
                    class100 = (Class68_Sub20_Sub13_Sub2.method1166(i ^ 0x6c6f, (new MutableString[] { class100.method1613(0, (byte) -74, i_14_), class100_15_, class100.method1621(i_14_ + 4, true) })));
                }
            }
            if (i != 27757)
                aClass100_4196 = null;
            return class100;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cd.J(" + (class100 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1056(int i)
    {
        aClass21_4194 = null;
        if (i != 0)
            method1051(18, 45);
        aClass100_4196 = null;
    }

    public Class68_Sub20_Sub3()
    {
        /* empty */
    }

    private final void method1057(Stream class68_sub14, byte i, int i_16_)
    {
        try
        {
            anInt4202++;
            if (i != -119)
                aClass100_4210 = null;
            if (i_16_ == 1)
                ((Class68_Sub20_Sub3) this).anInt4199 = class68_sub14.readUByte();
            else if (i_16_ == 2)
                ((Class68_Sub20_Sub3) this).anInt4201 = class68_sub14.readUByte();
            else if (i_16_ == 3)
                aClass100_4210 = class68_sub14.readString();
            else if (i_16_ == 4)
                anInt4207 = class68_sub14.readInteger();
            else if (i_16_ == 5 || i_16_ == 6)
            {
                int i_17_ = class68_sub14.readUShort();
                aClass113_4204 = new NodeCache(Class90.method1523(i_17_, -21189));
                for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
                {
                    int i_19_ = class68_sub14.readInteger();
                    Node class68;
                    if (i_16_ == 5)
                        class68 = new Class68_Sub5(class68_sub14.readString());
                    else
                        class68 = new Class68_Sub10(class68_sub14.readInteger());
                    aClass113_4204.method1683((byte) 2, class68, (long) i_19_);
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cd.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ')'));
        }
    }

    static
    {
        aClass100_4196 = Class112.makeMutableString(43, "Untersuchen");
        anInt4212 = -1;
    }
}
