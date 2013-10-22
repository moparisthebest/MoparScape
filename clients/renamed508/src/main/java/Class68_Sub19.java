/* Class68_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub19 extends Node
{
    static int anInt3067;
    static MutableString aClass100_3068 = Class112.makeMutableString(43, " (X");
    int anInt3069;
    static int anInt3070;
    static Class92_Sub1[] aClass92_Sub1Array3071;
    static boolean aBoolean3072 = false;
    static int anInt3073;
    static int anInt3074;
    MutableString aClass100_3075;
    static int anInt3076;
    byte aByte3077;
    MutableString aClass100_3078;
    static int[] anIntArray3079;
    static int anInt3080;

    static final MutableString method996(int i, Stream class68_sub14)
    {
        try
        {
            anInt3076++;
            int i_0_ = 19 % ((-21 - i) / 37);
            return Class68_Sub13_Sub8.method734(0, class68_sub14, 32767);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("oi.D(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static final int method997(int i, int i_1_, int i_2_)
    {
        if (i_2_ < 65)
            return 23;
        int i_3_ = 1;
        anInt3080++;
        while (i > 1)
        {
            if ((i & 0x1) != 0)
                i_3_ *= i_1_;
            i >>= 1;
            i_1_ *= i_1_;
        }
        if (i == 1)
            return i_3_ * i_1_;
        return i_3_;
    }

    public static void method998(boolean bool)
    {
        aClass92_Sub1Array3071 = null;
        aClass100_3068 = null;
        if (bool == true)
            anIntArray3079 = null;
    }

    static final void method999(int i, int i_4_, int i_5_, Widget[] class45s, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_)
    {
        try
        {
            Class79.method1433(i_8_, i_5_, i_6_, i);
            Class62.method612();
            if (i_4_ == -21644)
            {
                anInt3067++;
                int i_12_ = 0;
                for (/**/; i_12_ < class45s.length; i_12_++)
                {
                    Widget class45 = class45s[i_12_];
                    if (class45 != null && (i_10_ == ((Widget) class45).anInt799 || (i_10_ == -1412584499 && class45 == Class35.aClass45_606)))
                    {
                        int i_13_;
                        if (i_7_ == -1)
                        {
                            Class105.anIntArray1797[Class56.anInt1061] = i_11_ + ((Widget) class45).x;
                            Class71.anIntArray1294[Class56.anInt1061] = ((Widget) class45).y + i_9_;
                            ItemDefinition.anIntArray376[Class56.anInt1061] = ((Widget) class45).anInt892;
                            Player.anIntArray3432[Class56.anInt1061] = ((Widget) class45).anInt873;
                            i_13_ = Class56.anInt1061++;
                        } else
                            i_13_ = i_7_;
                        ((Widget) class45).anInt860 = Class68_Sub3.loopCycle;
                        ((Widget) class45).anInt902 = i_13_;
                        if (!((Widget) class45).aBoolean863 || !client.method45(class45))
                        {
                            if (((Widget) class45).anInt808 > 0)
                                Class91.method1530(30341, class45);
                            int i_14_ = ((Widget) class45).x + i_11_;
                            int i_15_ = ((Widget) class45).anInt775;
                            int i_16_ = i_9_ + ((Widget) class45).y;
                            if (NodeSub.aBoolean3096 && (client.method41(class45) != 0 || ((Widget) class45).type == 0) && i_15_ > 127)
                                i_15_ = 127;
                            if (Class35.aClass45_606 == class45)
                            {
                                if (i_10_ != -1412584499 && !((Widget) class45).aBoolean766)
                                {
                                    Class121.anInt2109 = i_9_;
                                    Class68_Sub4.anInt2818 = i_11_;
                                    Class103.aClass45Array1765 = class45s;
                                    continue;
                                }
                                if (Class15.aBoolean247 && Class68_Sub18.aBoolean3060)
                                {
                                    int i_17_ = Class13.anInt223;
                                    i_17_ -= Class58.anInt1087;
                                    if (i_17_ < NodeCache.anInt1905)
                                        i_17_ = NodeCache.anInt1905;
                                    int i_18_ = Class96.anInt1697;
                                    i_18_ -= Class68_Sub13_Sub25.anInt3855;
                                    if (Class68_Sub13_Sub37.anInt4075 > i_18_)
                                        i_18_ = Class68_Sub13_Sub37.anInt4075;
                                    if ((((Widget) (Class68_Sub13_Sub26_Sub1.aClass45_4609)).anInt892 + Class68_Sub13_Sub37.anInt4075) < ((Widget) class45).anInt892 + i_18_)
                                        i_18_ = (((Widget) (Class68_Sub13_Sub26_Sub1.aClass45_4609)).anInt892 + (Class68_Sub13_Sub37.anInt4075 - (((Widget) class45).anInt892)));
                                    i_14_ = i_18_;
                                    if ((NodeCache.anInt1905 + ((Widget) (Class68_Sub13_Sub26_Sub1.aClass45_4609)).anInt873) < i_17_ + ((Widget) class45).anInt873)
                                        i_17_ = (NodeCache.anInt1905 + (((Widget) (Class68_Sub13_Sub26_Sub1.aClass45_4609)).anInt873 - (((Widget) class45).anInt873)));
                                    i_16_ = i_17_;
                                }
                                if (!((Widget) class45).aBoolean766)
                                    i_15_ = 128;
                            }
                            int i_19_;
                            int i_20_;
                            int i_21_;
                            int i_22_;
                            if (((Widget) class45).type == 2)
                            {
                                i_19_ = i_8_;
                                i_21_ = i;
                                i_20_ = i_5_;
                                i_22_ = i_6_;
                            } else
                            {
                                i_19_ = i_14_ <= i_8_ ? i_8_ : i_14_;
                                i_20_ = i_16_ <= i_5_ ? i_5_ : i_16_;
                                int i_23_ = ((Widget) class45).anInt892 + i_14_;
                                int i_24_ = i_16_ + ((Widget) class45).anInt873;
                                if (((Widget) class45).type == 9)
                                {
                                    i_24_++;
                                    i_23_++;
                                }
                                i_21_ = i <= i_24_ ? i : i_24_;
                                i_22_ = i_23_ < i_6_ ? i_23_ : i_6_;
                            }
                            if (!((Widget) class45).aBoolean863 || i_19_ < i_22_ && i_20_ < i_21_)
                            {
                                if (((Widget) class45).anInt808 != 0)
                                {
                                    if (((Widget) class45).anInt808 == 1337)
                                    {
                                        Class68_Sub2.anInt2800 = i_14_;
                                        NodeList.anInt276 = i_16_;
                                        Class68_Sub20_Sub17.aClass45_4443 = class45;
                                        Class68_Sub13_Sub31.method857(i_16_, ((Widget) class45).anInt892, false, i_14_, (((Widget) class45).anInt808 == 1403), ((Widget) class45).anInt873);
                                        Class79.method1433(i_8_, i_5_, i_6_, i);
                                        continue;
                                    }
                                    if (((Widget) class45).anInt808 == 1338)
                                    {
                                        if (class45.method497(2663))
                                        {
                                            GameCanvas.method49(class45, i_14_, i_16_, i_13_, (byte) -101);
                                            Class79.method1433(i_8_, i_5_, i_6_, i);
                                        }
                                        continue;
                                    }
                                    if (((Widget) class45).anInt808 == 1339)
                                    {
                                        if (class45.method497(2663))
                                        {
                                            Class1_Sub1.method65(i_16_, i_13_, (byte) -123, class45, i_14_);
                                            Class79.method1433(i_8_, i_5_, i_6_, i);
                                        }
                                        continue;
                                    }
                                    if (((Widget) class45).anInt808 == 1400)
                                    {
                                        Class90.method1518(i_16_, (byte) 51, (((Widget) class45).anInt873), (((Widget) class45).anInt892), i_14_);
                                        Class121.aBooleanArray2111[i_13_] = true;
                                        Class68_Sub17.aBooleanArray3039[i_13_] = true;
                                        Class79.method1433(i_8_, i_5_, i_6_, i);
                                        continue;
                                    }
                                    if (((Widget) class45).anInt808 == 1401)
                                    {
                                        Class35.method424(i_16_, (((Widget) class45).anInt873), (((Widget) class45).anInt892), i_14_, true);
                                        Class121.aBooleanArray2111[i_13_] = true;
                                        Class68_Sub17.aBooleanArray3039[i_13_] = true;
                                        Class79.method1433(i_8_, i_5_, i_6_, i);
                                        continue;
                                    }
                                    if (((Widget) class45).anInt808 == 1402)
                                    {
                                        Class71.method1338(i_16_, i_14_, 95);
                                        Class121.aBooleanArray2111[i_13_] = true;
                                        Class68_Sub17.aBooleanArray3039[i_13_] = true;
                                        continue;
                                    }
                                    if (((Widget) class45).anInt808 == 1404)
                                    {
                                        Class68_Sub13_Sub6.method723((byte) -38, i_16_, (Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513), (Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3803), ((Widget) class45).anInt892, ((Widget) class45).anInt873, i_14_, class45);
                                        Class121.aBooleanArray2111[i_13_] = true;
                                        Class68_Sub17.aBooleanArray3039[i_13_] = true;
                                        continue;
                                    }
                                    if (((Widget) class45).anInt808 == 1405)
                                    {
                                        if (Class68_Sub22.aBoolean3136)
                                        {
                                            int i_25_ = i_14_ + (((Widget) class45).anInt892);
                                            int i_26_ = i_16_ + 15;
                                            Class68_Sub6.aClass68_Sub20_Sub1_2849.method1022((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { ItemDefinition.aClass100_396, (Class68_Sub13_Sub24.method816(Class34.anInt597, 0)) }))), i_25_, i_26_, 16776960, -1);
                                            i_26_ += 15;
                                            Runtime runtime = Runtime.getRuntime();
                                            int i_27_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                                            int i_28_ = 16776960;
                                            if (i_27_ > 65536)
                                                i_28_ = 16711680;
                                            Class68_Sub6.aClass68_Sub20_Sub1_2849.method1022((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class56.aClass100_1066, (Class68_Sub13_Sub24.method816(i_27_, i_4_ ^ ~0x548b)), (Class54.aClass100_1030) }))), i_25_, i_26_, i_28_, -1);
                                            Class121.aBooleanArray2111[i_13_] = true;
                                            i_26_ += 15;
                                            Class68_Sub17.aBooleanArray3039[i_13_] = true;
                                        }
                                        continue;
                                    }
                                }
                                if (!Class120.menuOpen)
                                {
                                    if (((Widget) class45).type == 0 && ((Widget) class45).aBoolean916 && i_19_ <= Class68_Sub25.anInt3178 && i_20_ <= Class92.anInt1648 && i_22_ > Class68_Sub25.anInt3178 && i_21_ > Class92.anInt1648 && !NodeSub.aBoolean3096)
                                    {
                                        Class68_Sub28_Sub1.menuActionIDs[0] = (short) 1004;
                                        Class71_Sub1.menuActions[0] = Class34.aClass100_598;
                                        Class68_Sub13_Sub21.menuOptionsCount = 1;
                                        Class33.menuOptions[0] = (Class68_Sub28_Sub2.aClass100_4558);
                                    }
                                    if (Class68_Sub25.anInt3178 >= i_19_ && Class92.anInt1648 >= i_20_ && i_22_ > Class68_Sub25.anInt3178 && Class92.anInt1648 < i_21_)
                                        Class121.method1751(Class68_Sub25.anInt3178 - i_14_, class45, true, Class92.anInt1648 - i_16_);
                                }
                                if (((Widget) class45).type == 0)
                                {
                                    if (!((Widget) class45).aBoolean863 && client.method45(class45) && class45 != Class108.aClass45_1827)
                                        continue;
                                    if (!((Widget) class45).aBoolean863)
                                    {
                                        if ((((Widget) class45).anInt794 - ((Widget) class45).anInt873) < ((Widget) class45).anInt818)
                                            ((Widget) class45).anInt818 = (((Widget) class45).anInt794 - (((Widget) class45).anInt873));
                                        if (((Widget) class45).anInt818 < 0)
                                            ((Widget) class45).anInt818 = 0;
                                    }
                                    method999(i_21_, -21644, i_20_, class45s, i_22_, i_13_, i_19_, (i_16_ - ((Widget) class45).anInt818), ((Widget) class45).anInt792, i_14_ - (((Widget) class45).anInt847));
                                    if (((Widget) class45).widgetCache != null)
                                        method999(i_21_, -21644, i_20_, (((Widget) class45).widgetCache), i_22_, i_13_, i_19_, i_16_ - (((Widget) class45).anInt818), ((Widget) class45).anInt792, i_14_ - (((Widget) class45).anInt847));
                                    Class68_Sub3 class68_sub3 = ((Class68_Sub3) (Login.aClass113_1514.method1684((long) (((Widget) class45).anInt792), i_4_ + 21602)));
                                    if (class68_sub3 != null)
                                    {
                                        if ((((Class68_Sub3) class68_sub3).anInt2802) == 0 && !Class120.menuOpen && i_19_ <= Class68_Sub25.anInt3178 && Class92.anInt1648 >= i_20_ && Class68_Sub25.anInt3178 < i_22_ && i_21_ > Class92.anInt1648 && !NodeSub.aBoolean3096)
                                        {
                                            Class68_Sub28_Sub1.menuActionIDs[0] = (short) 1004;
                                            Class71_Sub1.menuActions[0] = Class34.aClass100_598;
                                            Class68_Sub13_Sub21.menuOptionsCount = 1;
                                            Class33.menuOptions[0] = (Class68_Sub28_Sub2.aClass100_4558);
                                        }
                                        NodeSub.method1004(i_19_, i_20_, i_21_, i_16_, (((Class68_Sub3) class68_sub3).anInt2805), i_13_, i_14_, i_22_, (byte) -112);
                                    }
                                    Class79.method1433(i_8_, i_5_, i_6_, i);
                                    Class62.method612();
                                }
                                if (Class4.aBooleanArray95[i_13_] || Class68_Sub20_Sub5.anInt4231 > 1)
                                {
                                    if (((Widget) class45).type == 0 && !((Widget) class45).aBoolean863 && (((Widget) class45).anInt794 > ((Widget) class45).anInt873))
                                        Class68_Sub13_Sub16.method771(i_16_, ((Widget) class45).anInt818, ((Widget) class45).anInt794, (((Widget) class45).anInt892 + i_14_), ((Widget) class45).anInt873, (byte) -62);
                                    if (((Widget) class45).type != 1)
                                    {
                                        if (((Widget) class45).type == 2)
                                        {
                                            int i_29_ = 0;
                                            for (int i_30_ = 0; (((Widget) class45).height > i_30_); i_30_++)
                                            {
                                                for (int i_31_ = 0; ((((Widget) class45).width) > i_31_); i_31_++)
                                                {
                                                    int i_32_ = (i_16_ + ((((Widget) class45).inventorySpritePaddingY) + 32) * i_30_);
                                                    int i_33_ = (i_14_ + ((((Widget) class45).inventorySpritePaddingX) + 32) * i_31_);
                                                    if (i_29_ < 20)
                                                    {
                                                        i_33_ += (((Widget) class45).anIntArray826[i_29_]);
                                                        i_32_ += (((Widget) class45).anIntArray767[i_29_]);
                                                    }
                                                    if ((((Widget) class45).inventory[i_29_]) <= 0)
                                                    {
                                                        if (((((Widget) class45).anIntArray841) != null) && i_29_ < 20)
                                                        {
                                                            Class68_Sub20_Sub10 class68_sub20_sub10 = (class45.method499((byte) -40, i_29_));
                                                            if (class68_sub20_sub10 == null)
                                                            {
                                                                if (Class93.aBoolean1671)
                                                                    NodeCache.method1688(class45, (i_4_ + 21530));
                                                            } else
                                                                class68_sub20_sub10.method1103(i_33_, i_32_);
                                                        }
                                                    } else
                                                    {
                                                        boolean bool = false;
                                                        boolean bool_34_ = false;
                                                        int i_35_ = ((((Widget) class45).inventory[i_29_]) - 1);
                                                        if ((i_8_ < i_33_ + 32 && i_33_ < i_6_ && (i_32_ + 32 > i_5_) && i_32_ < i) || ((class45 == (Class54.aClass45_1033)) && ((Class68_Sub20_Sub2.anInt4191) == i_29_)))
                                                        {
                                                            Class68_Sub20_Sub10 class68_sub20_sub10;
                                                            if (((Class68_Sub13_Sub37.anInt4064) != 1) || (i_29_ != (Player.anInt3401)) || ((((Widget) class45).anInt792) != (Class68_Sub28_Sub2.anInt4555)))
                                                                class68_sub20_sub10 = (Class44.method491(1, (((Widget) class45).inventoryStackSizes[i_29_]), false, i_35_, 3153952, (((Widget) class45).aBoolean785)));
                                                            else
                                                                class68_sub20_sub10 = (Class44.method491(2, (((Widget) class45).inventoryStackSizes[i_29_]), false, i_35_, 0, (((Widget) class45).aBoolean785)));
                                                            if (Class62.aBoolean1152)
                                                                Class121.aBooleanArray2111[i_13_] = true;
                                                            if (class68_sub20_sub10 != null)
                                                            {
                                                                if (((Class54.aClass45_1033) != class45) || (i_29_ != (Class68_Sub20_Sub2.anInt4191)))
                                                                {
                                                                    if (((Class1_Sub5.aClass45_2517) != class45) || (i_29_ != Class63.anInt1172))
                                                                        class68_sub20_sub10.method1103(i_33_, i_32_);
                                                                    else
                                                                        class68_sub20_sub10.method1110(i_33_, i_32_, 128);
                                                                } else
                                                                {
                                                                    int i_36_ = ((Class96.anInt1697) - Class59.anInt1102);
                                                                    if ((i_36_ < 5) && (i_36_ > -5))
                                                                        i_36_ = 0;
                                                                    int i_37_ = ((Class13.anInt223) - Class68_Sub18.anInt3048);
                                                                    if ((i_37_ < 5) && (i_37_ > -5))
                                                                        i_37_ = 0;
                                                                    if ((Class68_Sub13_Sub6.anInt3534) < 5)
                                                                    {
                                                                        i_37_ = 0;
                                                                        i_36_ = 0;
                                                                    }
                                                                    class68_sub20_sub10.method1110((i_33_ + i_36_), (i_32_ + i_37_), 128);
                                                                    if (i_10_ != -1)
                                                                    {
                                                                        Widget class45_38_ = class45s[i_10_ & 0xffff];
                                                                        int i_39_ = Class79.anInt1406;
                                                                        int i_40_ = Class79.anInt1405;
                                                                        if ((i_40_ > i_32_ + i_37_) && ((Widget) class45_38_).anInt818 > 0)
                                                                        {
                                                                            int i_41_ = Class109.anInt1846 * (i_40_ + (-i_32_ - i_37_)) / 3;
                                                                            if (i_41_ > Class109.anInt1846 * 10)
                                                                                i_41_ = 10 * Class109.anInt1846;
                                                                            if (((Widget) class45_38_).anInt818 < i_41_)
                                                                                i_41_ = ((Widget) class45_38_).anInt818;
                                                                            Class68_Sub18.anInt3048 += i_41_;
                                                                            ((Widget) class45_38_).anInt818 -= i_41_;
                                                                            NodeCache.method1688(class45_38_, -116);
                                                                        }
                                                                        if ((i_39_ < i_37_ + 32 + i_32_) && ((Widget) class45_38_).anInt818 < ((Widget) class45_38_).anInt794 - ((Widget) class45_38_).anInt873)
                                                                        {
                                                                            int i_42_ = Class109.anInt1846 * (i_32_ + 32 + i_37_ - i_39_) / 3;
                                                                            if (i_42_ > 10 * Class109.anInt1846)
                                                                                i_42_ = Class109.anInt1846 * 10;
                                                                            if (((Widget) class45_38_).anInt794 - ((Widget) class45_38_).anInt818 - ((Widget) class45_38_).anInt873 < i_42_)
                                                                                i_42_ = ((Widget) class45_38_).anInt794 - ((Widget) class45_38_).anInt873 - ((Widget) class45_38_).anInt818;
                                                                            ((Widget) class45_38_).anInt818 += i_42_;
                                                                            Class68_Sub18.anInt3048 -= i_42_;
                                                                            NodeCache.method1688(class45_38_, -117);
                                                                        }
                                                                    }
                                                                }
                                                            } else
                                                                NodeCache.method1688(class45, -119);
                                                        }
                                                    }
                                                    i_29_++;
                                                }
                                            }
                                        } else if (((Widget) class45).type == 3)
                                        {
                                            int i_43_;
                                            if (method1000(i_4_ + 21644, class45))
                                            {
                                                i_43_ = (((Widget) class45).anInt862);
                                                if ((Class108.aClass45_1827 == class45) && (((Widget) class45).anInt776) != 0)
                                                    i_43_ = (((Widget) class45).anInt776);
                                            } else
                                            {
                                                i_43_ = (((Widget) class45).textColor);
                                                if ((class45 == Class108.aClass45_1827) && (((Widget) class45).anInt828) != 0)
                                                    i_43_ = (((Widget) class45).anInt828);
                                            }
                                            if (i_15_ != 0)
                                            {
                                                if (((Widget) class45).aBoolean866)
                                                    Class79.method1441(i_14_, i_16_, (((Widget) class45).anInt892), (((Widget) class45).anInt873), i_43_, 256 - (0xff & i_15_));
                                                else
                                                    Class79.method1439(i_14_, i_16_, (((Widget) class45).anInt892), (((Widget) class45).anInt873), i_43_, 256 - (0xff & i_15_));
                                            } else if (!((Widget) class45).aBoolean866)
                                                Class79.method1421(i_14_, i_16_, (((Widget) class45).anInt892), (((Widget) class45).anInt873), i_43_);
                                            else
                                                Class79.method1445(i_14_, i_16_, (((Widget) class45).anInt892), (((Widget) class45).anInt873), i_43_);
                                        } else if (((Widget) class45).type == 4)
                                        {
                                            Class68_Sub20_Sub1 class68_sub20_sub1 = (class45.method505(-103, (Stream.aClass92Array3012)));
                                            if (class68_sub20_sub1 == null)
                                            {
                                                if (Class93.aBoolean1671)
                                                    NodeCache.method1688(class45, -117);
                                            } else
                                            {
                                                MutableString class100 = (((Widget) class45).text);
                                                int i_44_;
                                                if (method1000(i_4_ ^ ~0x548b, class45))
                                                {
                                                    i_44_ = (((Widget) class45).anInt862);
                                                    if ((class45 == (Class108.aClass45_1827)) && (((Widget) class45).anInt776) != 0)
                                                        i_44_ = (((Widget) class45).anInt776);
                                                    if ((((Widget) class45).aClass100_880.getLength()) > 0)
                                                        class100 = (((Widget) class45).aClass100_880);
                                                } else
                                                {
                                                    i_44_ = (((Widget) class45).textColor);
                                                    if ((class45 == (Class108.aClass45_1827)) && (((Widget) class45).anInt828) != 0)
                                                        i_44_ = (((Widget) class45).anInt828);
                                                }
                                                if ((((Widget) class45).aBoolean863) && (((Widget) class45).anInt798) != -1)
                                                {
                                                    ItemDefinition class19 = (GameApplet.method18(-25672, (((Widget) class45).anInt798)));
                                                    class100 = (((ItemDefinition) class19).name);
                                                    if (class100 == null)
                                                        class100 = (Class68_Sub13_Sub32.aClass100_3984);
                                                    if (((((ItemDefinition) class19).anInt381) == 1 || (((Widget) class45).anInt915 != 1)) && (((Widget) class45).anInt915) != -1)
                                                        class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), class100, (Class68_Sub13_Sub10.aClass100_3595), (Class68_Sub13_Sub37.method889((((Widget) class45).anInt915), (i_4_ ^ 0x4054))) })));
                                                }
                                                if (class45 == Class29.aClass45_539)
                                                {
                                                    i_44_ = (((Widget) class45).textColor);
                                                    class100 = (Class124.aClass100_2138);
                                                }
                                                if (!((Widget) class45).aBoolean863)
                                                    class100 = (Class68_Sub20_Sub3.method1055(class100, 27757, class45));
                                                class68_sub20_sub1.method1019(class100, i_14_, i_16_, (((Widget) class45).anInt892), (((Widget) class45).anInt873), i_44_, (((Widget) class45).interfaceWidget) ? 0 : -1, (((Widget) class45).anInt777), (((Widget) class45).anInt830), (((Widget) class45).anInt789));
                                            }
                                        } else if (((Widget) class45).type == 5)
                                        {
                                            if (((Widget) class45).aBoolean863)
                                            {
                                                Class68_Sub20_Sub10 class68_sub20_sub10;
                                                if ((((Widget) class45).anInt798) != -1)
                                                    class68_sub20_sub10 = (Class44.method491(((Widget) class45).anInt859, ((Widget) class45).anInt915, false, ((Widget) class45).anInt798, ((Widget) class45).anInt906, (((Widget) class45).aBoolean785)));
                                                else
                                                    class68_sub20_sub10 = (class45.method507(false, 20503));
                                                if (class68_sub20_sub10 == null)
                                                {
                                                    if (Class93.aBoolean1671)
                                                        NodeCache.method1688(class45, -127);
                                                } else
                                                {
                                                    int i_45_ = (((Class68_Sub20_Sub10) class68_sub20_sub10).anInt4307);
                                                    int i_46_ = (((Class68_Sub20_Sub10) class68_sub20_sub10).anInt4315);
                                                    if (((Widget) class45).aBoolean827)
                                                    {
                                                        int i_47_ = (((((Widget) class45).anInt892) - 1 + i_45_) / i_45_);
                                                        int i_48_ = (((((Widget) class45).anInt873) + (i_46_ - 1)) / i_46_);
                                                        Class79.method1432(i_14_, i_16_, (i_14_ + (((Widget) class45).anInt892)), (i_16_ + (((Widget) class45).anInt873)));
                                                        for (int i_49_ = 0; i_47_ > i_49_; i_49_++)
                                                        {
                                                            for (int i_50_ = 0; i_48_ > i_50_; i_50_++)
                                                            {
                                                                if ((((Widget) class45).anInt845) != 0)
                                                                    class68_sub20_sub10.method1104((((Widget) class45).anInt845), ((i_50_ * i_46_) + i_16_ + (i_46_ / 2)), ((i_49_ * i_45_) + i_14_ + (i_45_ / 2)), 4096, (byte) 106);
                                                                else if (i_15_ != 0)
                                                                    class68_sub20_sub10.method1110(((i_49_ * i_45_) + i_14_), ((i_46_ * i_50_) + i_16_), (256 - (0xff & i_15_)));
                                                                else
                                                                    class68_sub20_sub10.method1103(((i_49_ * i_45_) + i_14_), (i_16_ + (i_46_ * i_50_)));
                                                            }
                                                        }
                                                        Class79.method1433(i_8_, i_5_, i_6_, i);
                                                    } else
                                                    {
                                                        int i_51_ = (4096 * (((Widget) class45).anInt892) / i_45_);
                                                        if (((Widget) class45).anInt845 == 0)
                                                        {
                                                            if (i_15_ != 0)
                                                                class68_sub20_sub10.method1105(i_14_, i_16_, (((Widget) class45).anInt892), (((Widget) class45).anInt873), (256 - (i_15_ & 0xff)));
                                                            else if ((i_45_ != (((Widget) class45).anInt892)) || ((((Widget) class45).anInt873) != i_46_))
                                                                class68_sub20_sub10.method1113(i_14_, i_16_, (((Widget) class45).anInt892), (((Widget) class45).anInt873));
                                                            else
                                                                class68_sub20_sub10.method1103(i_14_, i_16_);
                                                        } else
                                                            class68_sub20_sub10.method1104((((Widget) class45).anInt845), ((((Widget) class45).anInt873) / 2) + i_16_, ((((Widget) class45).anInt892) / 2) + i_14_, i_51_, (byte) 118);
                                                    }
                                                }
                                            } else
                                            {
                                                Class68_Sub20_Sub10 class68_sub20_sub10 = (class45.method507(method1000(0, class45), i_4_ + 42147));
                                                if (class68_sub20_sub10 == null)
                                                {
                                                    if (Class93.aBoolean1671)
                                                        NodeCache.method1688(class45, -121);
                                                } else
                                                    class68_sub20_sub10.method1103(i_14_, i_16_);
                                            }
                                        } else if (((Widget) class45).type == 6)
                                        {
                                            boolean bool = method1000(i_4_ + 21644, class45);
                                            Model class1_sub3 = null;
                                            int i_52_;
                                            if (bool)
                                                i_52_ = (((Widget) class45).anInt869);
                                            else
                                                i_52_ = (((Widget) class45).anInt831);
                                            int i_53_ = 0;
                                            if (((Widget) class45).anInt798 == -1)
                                            {
                                                if ((((Widget) class45).notWidgetSelectedModelType) == 5)
                                                {
                                                    if ((((Widget) class45).notWidgetSelectedModelID) != -1)
                                                    {
                                                        int i_54_ = (0x7ff & (((Widget) class45).notWidgetSelectedModelID));
                                                        if (i_54_ == (Class68_Sub10.localPlayerInteractingEntity))
                                                            i_54_ = 2047;
                                                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_54_]);
                                                        Animation class117 = (i_52_ == -1 ? null : (Object1.getAnimation(i_52_)));
                                                        if ((class1_sub6_sub2 != null) && (((int) (((Player) class1_sub6_sub2).name.method1615(10908)) << 11) == (~0x7ff & (((Widget) class45).notWidgetSelectedModelID))))
                                                            class1_sub3 = (((Player) class1_sub6_sub2).definition.method1774((((Widget) class45).anInt756), class117, 0, null, (byte) 46));
                                                    } else
                                                        class1_sub3 = (Class68_Sub13_Sub33.aClass126_3993.method1774(-1, null, -1, null, (byte) 99));
                                                } else if (i_52_ == -1)
                                                {
                                                    class1_sub3 = (class45.method506(-1, bool, (byte) -27, (((Player) (Class68_Sub7.localPlayer)).definition), null));
                                                    if (class1_sub3 == null && (Class93.aBoolean1671))
                                                        NodeCache.method1688(class45, -128);
                                                } else
                                                {
                                                    Animation class117 = (Object1.getAnimation(i_52_));
                                                    class1_sub3 = (class45.method506(((Widget) class45).anInt756, bool, (byte) -27, (((Player) (Class68_Sub7.localPlayer)).definition), class117));
                                                    if (class1_sub3 == null && (Class93.aBoolean1671))
                                                        NodeCache.method1688(class45, -115);
                                                }
                                            } else
                                            {
                                                ItemDefinition class19 = (GameApplet.method18(-25672, (((Widget) class45).anInt798)));
                                                if (class19 != null)
                                                {
                                                    class19 = (class19.method317(((Widget) class45).anInt915, -126));
                                                    Animation class117 = (i_52_ != -1 ? (Object1.getAnimation(i_52_)) : null);
                                                    class1_sub3 = (class19.method318(1, class117, ((Widget) class45).anInt756, 13895));
                                                    if (class1_sub3 == null)
                                                        NodeCache.method1688(class45, -128);
                                                    else
                                                        i_53_ = (-class1_sub3.method56() / 2);
                                                }
                                            }
                                            if (class1_sub3 != null)
                                            {
                                                int i_55_;
                                                if ((((Widget) class45).anInt793) <= 0)
                                                    i_55_ = 256;
                                                else
                                                    i_55_ = ((((Widget) class45).anInt892 << 8) / (((Widget) class45).anInt793));
                                                int i_56_;
                                                if ((((Widget) class45).anInt883) > 0)
                                                    i_56_ = ((((Widget) class45).anInt873 << 8) / (((Widget) class45).anInt883));
                                                else
                                                    i_56_ = 256;
                                                int i_57_ = ((((Widget) class45).anInt873) / 2 + i_16_ + (i_56_ * (((Widget) class45).anInt816) >> 8));
                                                int i_58_ = ((((Widget) class45).anInt892) / 2 + i_14_ + ((((Widget) class45).anInt857) * i_55_ >> 8));
                                                Class62.method603(i_58_, i_57_);
                                                int i_59_ = (((Class62.PRECOMPUTED_SINE_CACHE[(((Widget) class45).anInt864)]) * (((Widget) class45).anInt762)) >> 16);
                                                int i_60_ = (((((Widget) class45).anInt762) * (Class62.PRECOMUPTED_COSINE_CACHE[(((Widget) class45).anInt864)])) >> 16);
                                                if (!((Widget) class45).aBoolean863)
                                                    class1_sub3.method77(0, (((Widget) class45).anInt814), 0, (((Widget) class45).anInt864), 0, i_59_, i_60_);
                                                else if (!((Widget) class45).aBoolean813)
                                                    class1_sub3.method77(0, (((Widget) class45).anInt814), (((Widget) class45).anInt853), (((Widget) class45).anInt864), (((Widget) class45).anInt781), ((((Widget) class45).anInt842) + i_59_ + i_53_), i_60_ + (((Widget) class45).anInt842));
                                                else
                                                    ((SpriteFactory) class1_sub3).calculatePosition(0, (((Widget) class45).anInt814), (((Widget) class45).anInt853), (((Widget) class45).anInt864), (((Widget) class45).anInt781), (i_59_ + (i_53_ + (((Widget) class45).anInt842))), i_60_ + (((Widget) class45).anInt842), (((Widget) class45).anInt762));
                                                Class62.method620();
                                            }
                                        } else
                                        {
                                            if (((Widget) class45).type == 7)
                                            {
                                                Class68_Sub20_Sub1 class68_sub20_sub1 = (class45.method505(-92, (Stream.aClass92Array3012)));
                                                if (class68_sub20_sub1 == null)
                                                {
                                                    if (Class93.aBoolean1671)
                                                        NodeCache.method1688(class45, -116);
                                                    continue;
                                                }
                                                int i_61_ = 0;
                                                for (int i_62_ = 0; ((((Widget) class45).height) > i_62_); i_62_++)
                                                {
                                                    for (int i_63_ = 0; ((((Widget) class45).width) > i_63_); i_63_++)
                                                    {
                                                        if ((((Widget) class45).inventory[i_61_]) > 0)
                                                        {
                                                            ItemDefinition class19 = (GameApplet.method18((i_4_ - 4028), ((((Widget) class45).inventory[i_61_]) - 1)));
                                                            MutableString class100;
                                                            if (((((ItemDefinition) class19).anInt381) == 1) || ((((Widget) class45).inventoryStackSizes[i_61_]) != 1))
                                                                class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), ((ItemDefinition) class19).name, (Class68_Sub13_Sub10.aClass100_3595), (Class68_Sub13_Sub37.method889(((Widget) class45).inventoryStackSizes[i_61_], -5344)) })));
                                                            else
                                                                class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub10.aClass100_3590), ((ItemDefinition) class19).name, (MutableString.aClass100_2307) })));
                                                            int i_64_ = ((((((Widget) class45).inventorySpritePaddingX) + 115) * i_63_) + i_14_);
                                                            int i_65_ = (i_16_ + (((((Widget) class45).inventorySpritePaddingY) + 12) * i_62_));
                                                            if ((((Widget) class45).anInt777) != 0)
                                                            {
                                                                if ((((Widget) class45).anInt777) == 1)
                                                                    class68_sub20_sub1.method1032(class100, (i_64_ + 57), i_65_, (((Widget) class45).textColor), (!((Widget) class45).interfaceWidget ? -1 : 0));
                                                                else
                                                                    class68_sub20_sub1.method1022(class100, (i_64_ + 115 - 1), i_65_, (((Widget) class45).textColor), ((((Widget) class45).interfaceWidget) ? 0 : -1));
                                                            } else
                                                                class68_sub20_sub1.method1030(class100, i_64_, i_65_, (((Widget) class45).textColor), ((((Widget) class45).interfaceWidget) ? 0 : -1));
                                                        }
                                                        i_61_++;
                                                    }
                                                }
                                            }
                                            if ((((Widget) class45).type == 8) && (Class121.aClass45_2110 == class45) && (Class59.anInt1109 == Class94.anInt1678))
                                            {
                                                int i_66_ = 0;
                                                int i_67_ = 0;
                                                Class68_Sub20_Sub1 class68_sub20_sub1 = (Class68_Sub6.aClass68_Sub20_Sub1_2849);
                                                MutableString class100 = (((Widget) class45).text);
                                                class100 = (Class68_Sub20_Sub3.method1055(class100, i_4_ + 49401, class45));
                                                while ((class100.getLength()) > 0)
                                                {
                                                    int i_68_ = (class100.method1601(61, (Class118.aClass100_2083)));
                                                    MutableString class100_69_;
                                                    if (i_68_ == -1)
                                                    {
                                                        class100_69_ = class100;
                                                        class100 = (Class68_Sub28_Sub2.aClass100_4558);
                                                    } else
                                                    {
                                                        class100_69_ = (class100.method1613(0, (byte) -74, i_68_));
                                                        class100 = (class100.method1621(i_68_ + 4, true));
                                                    }
                                                    int i_70_ = (class68_sub20_sub1.method1029(class100_69_));
                                                    if (i_70_ > i_66_)
                                                        i_66_ = i_70_;
                                                    i_67_ += (((Class68_Sub20_Sub1) class68_sub20_sub1).anInt4139) + 1;
                                                }
                                                i_66_ += 6;
                                                i_67_ += 7;
                                                int i_71_ = (i_14_ + (((Widget) class45).anInt892) - 5 - i_66_);
                                                int i_72_ = (i_16_ - (-(((Widget) class45).anInt873) - 5));
                                                if (i < i_72_ + i_67_)
                                                    i_72_ = i - i_67_;
                                                if (i_71_ < i_14_ + 5)
                                                    i_71_ = i_14_ + 5;
                                                if (i_71_ + i_66_ > i_6_)
                                                    i_71_ = i_6_ - i_66_;
                                                Class79.method1445(i_71_, i_72_, i_66_, i_67_, 16777120);
                                                Class79.method1421(i_71_, i_72_, i_66_, i_67_, 0);
                                                class100 = (((Widget) class45).text);
                                                int i_73_ = ((((Class68_Sub20_Sub1) class68_sub20_sub1).anInt4139) + (i_72_ + 2));
                                                class100 = (Class68_Sub20_Sub3.method1055(class100, 27757, class45));
                                                while ((class100.getLength()) > 0)
                                                {
                                                    int i_74_ = (class100.method1601(92, (Class118.aClass100_2083)));
                                                    MutableString class100_75_;
                                                    if (i_74_ == -1)
                                                    {
                                                        class100_75_ = class100;
                                                        class100 = (Class68_Sub28_Sub2.aClass100_4558);
                                                    } else
                                                    {
                                                        class100_75_ = (class100.method1613(0, (byte) -74, i_74_));
                                                        class100 = (class100.method1621(i_74_ + 4, true));
                                                    }
                                                    class68_sub20_sub1.method1030(class100_75_, i_71_ + 3, i_73_, 0, -1);
                                                    i_73_ += (((Class68_Sub20_Sub1) class68_sub20_sub1).anInt4139) + 1;
                                                }
                                            }
                                            if (((Widget) class45).type == 9)
                                            {
                                                int i_76_;
                                                int i_77_;
                                                int i_78_;
                                                int i_79_;
                                                if (((Widget) class45).aBoolean894)
                                                {
                                                    i_77_ = i_16_;
                                                    i_76_ = i_14_;
                                                    i_79_ = i_14_ + (((Widget) class45).anInt892);
                                                    i_78_ = i_16_ + (((Widget) class45).anInt873);
                                                } else
                                                {
                                                    i_76_ = i_14_;
                                                    i_77_ = (((Widget) class45).anInt873) + i_16_;
                                                    i_78_ = i_16_;
                                                    i_79_ = (((Widget) class45).anInt892) + i_14_;
                                                }
                                                if ((((Widget) class45).anInt822) != 1)
                                                    Class79.method1435(i_76_, i_78_, i_79_, i_77_, (((Widget) class45).textColor), (((Widget) class45).anInt822));
                                                else
                                                    Class79.method1423(i_76_, i_78_, i_79_, i_77_, (((Widget) class45).textColor));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("oi.E(" + i + ',' + i_4_ + ',' + i_5_ + ',' + (class45s != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
        }
    }

    static final boolean method1000(int i, Widget class45)
    {
        try
        {
            anInt3070++;
            if (((Widget) class45).anIntArray796 == null)
                return false;
            for (int i_80_ = i; i_80_ < ((Widget) class45).anIntArray796.length; i_80_++)
            {
                int i_81_ = Class68_Sub24.method1205(i_80_, i + 20, class45);
                int i_82_ = ((Widget) class45).anIntArray791[i_80_];
                if (((Widget) class45).anIntArray796[i_80_] == 2)
                {
                    if (i_82_ <= i_81_)
                        return false;
                } else if (((Widget) class45).anIntArray796[i_80_] != 3)
                {
                    if (((Widget) class45).anIntArray796[i_80_] != 4)
                    {
                        if (i_81_ != i_82_)
                            return false;
                    } else if (i_82_ == i_81_)
                        return false;
                } else if (i_82_ >= i_81_)
                    return false;
            }
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("oi.F(" + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1001(byte i)
    {
        anInt3073++;
        Widget.aClass98_918.method1572((byte) 94);
        if (i >= -45)
            method997(7, 117, -119);
    }

    static final int method1002(int i, int i_83_, int i_84_)
    {
        if (i_84_ != 16)
            method997(124, 106, 95);
        anInt3074++;
        int i_85_ = (Class112.method1677(133988164, i_83_ - 1, i - 1) + Class112.method1677(133988164, i_83_ - 1, i + 1) - (-Class112.method1677(133988164, i_83_ + 1, i - 1) - Class112.method1677(133988164, i_83_ + 1, i + 1)));
        int i_86_ = (Class112.method1677(133988164, i_83_, i - 1) + (Class112.method1677(133988164, i_83_, i + 1) + (Class112.method1677(133988164, i_83_ - 1, i) + Class112.method1677(i_84_ ^ 0x7fc7f54, i_83_ + 1, i))));
        int i_87_ = Class112.method1677(133988164, i_83_, i);
        return i_86_ / 8 + (i_85_ / 16 + i_87_ / 4);
    }

    public Class68_Sub19()
    {
        /* empty */
    }
}
