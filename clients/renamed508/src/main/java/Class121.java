/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class121
{
    static MRUNodes aClass98_2102;
    static int anInt2103;
    static Class8[] aClass8Array2104 = new Class8[500];
    static int anInt2105;
    static int[] anIntArray2106;
    static int anInt2107;
    static int anInt2108;
    static int anInt2109;
    static Widget aClass45_2110;
    static boolean[] aBooleanArray2111;
    static int[] anIntArray2112;

    static final void method1747(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_)
    {
        anInt2105++;
        if (i_3_ > -15)
            aClass98_2102 = null;
        int i_5_ = Class68_Sub20_Sub15.method1171(i, Class51.anInt2257, (byte) 114, Class35.anInt605);
        int i_6_ = Class68_Sub20_Sub15.method1171(i_0_, Class51.anInt2257, (byte) 114, Class35.anInt605);
        int i_7_ = Class68_Sub20_Sub15.method1171(i_2_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        int i_8_ = Class68_Sub20_Sub15.method1171(i_1_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        for (int i_9_ = i_5_; i_6_ >= i_9_; i_9_++)
            Class34.method416(i_7_, (byte) -17, i_4_, Class68_Sub22.anIntArrayArray3134[i_9_], i_8_);
    }

    static final void method1748(int i, byte i_10_)
    {
        if (NodeSub.aByteArrayArrayArray3097 == null)
            NodeSub.aByteArrayArrayArray3097 = new byte[4][104][104];
        if (i <= 90)
            anInt2109 = -104;
        anInt2103++;
        for (int i_11_ = 0; i_11_ < 4; i_11_++)
        {
            for (int i_12_ = 0; i_12_ < 104; i_12_++)
            {
                for (int i_13_ = 0; i_13_ < 104; i_13_++)
                    NodeSub.aByteArrayArrayArray3097[i_11_][i_12_][i_13_] = i_10_;
            }
        }
    }

    public static void method1749(int i)
    {
        aClass45_2110 = null;
        aClass8Array2104 = null;
        if (i == 1)
        {
            aClass98_2102 = null;
            anIntArray2106 = null;
            anIntArray2112 = null;
            aBooleanArray2111 = null;
        }
    }

    static final Sprite[] method1750(boolean bool)
    {
        if (bool != true)
            return null;
        anInt2107++;
        Sprite[] class68_sub20_sub10_sub1s = new Sprite[Stream.anInt3009];
        for (int i = 0; Stream.anInt3009 > i; i++)
        {
            byte[] is = Object5.aByteArrayArray1240[i];
            int i_14_ = (Class68_Sub13_Sub19.anIntArray3759[i] * Class68_Sub13_Sub12.anIntArray3641[i]);
            int[] is_15_ = new int[i_14_];
            for (int i_16_ = 0; i_16_ < i_14_; i_16_++)
                is_15_[i_16_] = (Class68_Sub13_Sub17.anIntArray3721[Class120.method1746(is[i_16_], 255)]);
            class68_sub20_sub10_sub1s[i] = (new Sprite(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[i], ObjectDefinition.anIntArray1998[i], Class68_Sub13_Sub12.anIntArray3641[i], Class68_Sub13_Sub19.anIntArray3759[i], is_15_));
        }
        Class87.method1493((byte) -93);
        return class68_sub20_sub10_sub1s;
    }

    static final void method1751(int i, Widget class45, boolean bool, int i_17_)
    {
        do
        {
            try
            {
                if (bool != true)
                    method1750(true);
                anInt2108++;
                if (((Widget) class45).actionType == 1)
                {
                    Class68_Sub3.method652(0, ((Widget) class45).anInt792, (byte) -56, Class68_Sub28_Sub2.aClass100_4558, (short) 23, ((Widget) class45).tooltip, 0L);
                    Class68_Sub22.anInt3149++;
                }
                if (((Widget) class45).actionType == 2 && !Class21_Sub1.aBoolean2707)
                {
                    MutableString class100 = Class8.method204(0, class45);
                    if (class100 != null)
                    {
                        Class68_Sub3.method652(-1, ((Widget) class45).anInt792, (byte) -125, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class48.aClass100_953, (((Widget) class45).spellName) }))), (short) 32, class100, 0L);
                        Class59.anInt1100++;
                    }
                }
                if (((Widget) class45).actionType == 3)
                {
                    Class21.anInt456++;
                    Class68_Sub3.method652(0, ((Widget) class45).anInt792, (byte) -59, Class68_Sub28_Sub2.aClass100_4558, (short) 10, Widget.aClass100_924, 0L);
                }
                if (((Widget) class45).actionType == 4)
                {
                    Class68_Sub20_Sub11.anInt4330++;
                    Class68_Sub3.method652(0, ((Widget) class45).anInt792, (byte) -76, Class68_Sub28_Sub2.aClass100_4558, (short) 36, ((Widget) class45).tooltip, 0L);
                }
                if (((Widget) class45).actionType == 5)
                {
                    Class68_Sub3.method652(0, ((Widget) class45).anInt792, (byte) -86, Class68_Sub28_Sub2.aClass100_4558, (short) 28, ((Widget) class45).tooltip, 0L);
                    Class68_Sub13_Sub3.anInt3479++;
                }
                if (((Widget) class45).actionType == 6 && Class29.aClass45_539 == null)
                {
                    ObjectDefinition.anInt1995++;
                    Class68_Sub3.method652(-1, ((Widget) class45).anInt792, (byte) -78, Class68_Sub28_Sub2.aClass100_4558, (short) 57, ((Widget) class45).tooltip, 0L);
                }
                if (((Widget) class45).type == 2)
                {
                    int i_18_ = 0;
                    for (int i_19_ = 0; ((Widget) class45).height > i_19_; i_19_++)
                    {
                        for (int i_20_ = 0; ((Widget) class45).width > i_20_; i_20_++)
                        {
                            int i_21_ = i_20_ * (((Widget) class45).inventorySpritePaddingX + 32);
                            int i_22_ = (((Widget) class45).inventorySpritePaddingY + 32) * i_19_;
                            if (i_18_ < 20)
                            {
                                i_21_ += (((Widget) class45).anIntArray826[i_18_]);
                                i_22_ += (((Widget) class45).anIntArray767[i_18_]);
                            }
                            if (i_21_ <= i && i_17_ >= i_22_ && i_21_ + 32 > i && i_17_ < i_22_ + 32)
                            {
                                Class68_Sub13_Sub32.anInt3980 = i_18_;
                                Class3.aClass45_73 = class45;
                                if (((Widget) class45).inventory[i_18_] > 0)
                                {
                                    ItemDefinition class19 = GameApplet.method18(-25672, (((Widget) class45).inventory[i_18_]) - 1);
                                    if (Class68_Sub13_Sub37.anInt4064 == 1 && (Class68_Sub20_Sub6.method1064(client.method41(class45), -207106658)))
                                    {
                                        if ((((Widget) class45).anInt792 != Class68_Sub28_Sub2.anInt4555) || (Player.anInt3401 != i_18_))
                                        {
                                            Class68_Sub3.method652(i_18_, ((Widget) class45).anInt792, (byte) -64, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class44.aClass100_743, Class25.aClass100_511, (((ItemDefinition) class19).name) }))), (short) 39, Object2.aClass100_1347, (long) (((ItemDefinition) class19).id));
                                            Class68_Sub13_Sub36.anInt4050++;
                                        }
                                    } else if (!Class21_Sub1.aBoolean2707 || !(Class68_Sub20_Sub6.method1064(client.method41(class45), -207106658)))
                                    {
                                        Class115.anInt1958++;
                                        MutableString[] class100s = (((ItemDefinition) class19).actions);
                                        if (Class92.aBoolean1651)
                                            class100s = (Class75_Sub1.method1387((byte) -114, class100s));
                                        if (Class68_Sub20_Sub6.method1064(client.method41(class45), -207106658))
                                        {
                                            for (int i_23_ = 4; i_23_ >= 3; i_23_--)
                                            {
                                                if (class100s == null || (class100s[i_23_] == null))
                                                {
                                                    if (i_23_ == 4)
                                                    {
                                                        GameSocket.anInt1136++;
                                                        Class68_Sub3.method652(i_18_, (((Widget) class45).anInt792), (byte) -111, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), (((ItemDefinition) class19).name) }))), (short) 22, (Class122.aClass100_2114), (long) (((ItemDefinition) class19).id));
                                                    }
                                                } else
                                                {
                                                    short i_24_;
                                                    if (i_23_ != 3)
                                                        i_24_ = (short) 22;
                                                    else
                                                        i_24_ = (short) 7;
                                                    Class107.anInt1818++;
                                                    Class68_Sub3.method652(i_18_, (((Widget) class45).anInt792), (byte) -106, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), (((ItemDefinition) class19).name) }))), i_24_, class100s[i_23_], (long) (((ItemDefinition) class19).id));
                                                }
                                            }
                                        }
                                        if (Node.method644(client.method41(class45), 1424444319))
                                        {
                                            Class68_Sub13_Sub24.anInt3842++;
                                            Class68_Sub3.method652(i_18_, ((Widget) class45).anInt792, (byte) -69, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), (((ItemDefinition) class19).name) }))), (short) 16, Object2.aClass100_1347, (long) (((ItemDefinition) class19).id));
                                        }
                                        if ((Class68_Sub20_Sub6.method1064(client.method41(class45), -207106658)) && class100s != null)
                                        {
                                            for (int i_25_ = 2; i_25_ >= 0; i_25_--)
                                            {
                                                if (class100s[i_25_] != null)
                                                {
                                                    Class68_Sub20_Sub15.anInt4390++;
                                                    short i_26_ = 0;
                                                    if (i_25_ == 0)
                                                        i_26_ = (short) 14;
                                                    if (i_25_ == 1)
                                                        i_26_ = (short) 17;
                                                    if (i_25_ == 2)
                                                        i_26_ = (short) 13;
                                                    Class68_Sub3.method652(i_18_, (((Widget) class45).anInt792), (byte) -66, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), (((ItemDefinition) class19).name) }))), i_26_, class100s[i_25_], (long) (((ItemDefinition) class19).id));
                                                }
                                            }
                                        }
                                        class100s = (((Widget) class45).actions);
                                        if (Class92.aBoolean1651)
                                            class100s = (Class75_Sub1.method1387((byte) -73, class100s));
                                        if (class100s != null)
                                        {
                                            for (int i_27_ = 4; i_27_ >= 0; i_27_--)
                                            {
                                                if (class100s[i_27_] != null)
                                                {
                                                    Class18.anInt318++;
                                                    short i_28_ = 0;
                                                    if (i_27_ == 0)
                                                        i_28_ = (short) 41;
                                                    if (i_27_ == 1)
                                                        i_28_ = (short) 40;
                                                    if (i_27_ == 2)
                                                        i_28_ = (short) 43;
                                                    if (i_27_ == 3)
                                                        i_28_ = (short) 38;
                                                    if (i_27_ == 4)
                                                        i_28_ = (short) 58;
                                                    Class68_Sub3.method652(i_18_, (((Widget) class45).anInt792), (byte) -60, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), (((ItemDefinition) class19).name) }))), i_28_, class100s[i_27_], (long) (((ItemDefinition) class19).id));
                                                }
                                            }
                                        }
                                        Class68_Sub3.method652(i_18_, ((Widget) class45).anInt792, (byte) -99, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), (((ItemDefinition) class19).name) }))), (short) 1001, Class119.aClass100_2088, (long) (((ItemDefinition) class19).id));
                                    } else if ((0x10 & Class33.anInt589) == 16)
                                    {
                                        Class68_Sub3.method652(i_18_, ((Widget) class45).anInt792, (byte) -77, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub1.aClass100_3454), Class25.aClass100_511, (((ItemDefinition) class19).name) }))), (short) 31, Class7.aClass100_118, (long) (((ItemDefinition) class19).id));
                                        Class122.anInt2116++;
                                    }
                                }
                            }
                            i_18_++;
                        }
                    }
                }
                if (!((Widget) class45).aBoolean863)
                    break;
                if (Class21_Sub1.aBoolean2707)
                {
                    if (Class96.method1561(client.method41(class45), (byte) -114) && (Class33.anInt589 & 0x20) == 32)
                    {
                        Class68_Sub3.method652(((Widget) class45).anInt867, ((Widget) class45).anInt792, (byte) -92, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub1.aClass100_3454, Class68_Sub20_Sub6.aClass100_4234, ((Widget) class45).aClass100_890 }))), (short) 6, Class7.aClass100_118, 0L);
                        Class68_Sub13_Sub33.anInt3999++;
                    }
                } else
                {
                    for (int i_29_ = 9; i_29_ >= 5; i_29_--)
                    {
                        MutableString class100 = Class68_Sub13_Sub17.method781(-3574, i_29_, class45);
                        if (class100 != null)
                        {
                            Class68_Sub6.anInt2839++;
                            Class68_Sub3.method652(((Widget) class45).anInt867, ((Widget) class45).anInt792, (byte) -121, ((Widget) class45).aClass100_890, (short) 1007, class100, (long) (i_29_ + 1));
                        }
                    }
                    MutableString class100 = Class8.method204(0, class45);
                    if (class100 != null)
                    {
                        Class59.anInt1100++;
                        Class68_Sub3.method652(((Widget) class45).anInt867, ((Widget) class45).anInt792, (byte) -105, (((Widget) class45).aClass100_890), (short) 32, class100, 0L);
                    }
                    for (int i_30_ = 4; i_30_ >= 0; i_30_--)
                    {
                        MutableString class100_31_ = Class68_Sub13_Sub17.method781(-3574, i_30_, class45);
                        if (class100_31_ != null)
                        {
                            Class68_Sub3.method652(((Widget) class45).anInt867, ((Widget) class45).anInt792, (byte) -120, ((Widget) class45).aClass100_890, (short) 51, class100_31_, (long) (i_30_ + 1));
                            Class68_Sub6.anInt2839++;
                        }
                    }
                    if (!Class68_Sub3.method655(client.method41(class45), 1))
                        break;
                    Class68_Sub3.method652(((Widget) class45).anInt867, ((Widget) class45).anInt792, (byte) -102, Class68_Sub28_Sub2.aClass100_4558, (short) 57, Class75_Sub3.aClass100_3323, 0L);
                    ObjectDefinition.anInt1995++;
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("vb.E(" + i + ',' + (class45 != null ? "{...}" : "null") + ',' + bool + ',' + i_17_ + ')'));
            }
            break;
        } while (false);
    }

    static
    {
        aClass98_2102 = new MRUNodes(32);
        aBooleanArray2111 = new boolean[100];
        anIntArray2112 = new int[5];
    }
}
