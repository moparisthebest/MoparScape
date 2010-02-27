/* Class68_Sub20_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub17 extends NodeSub
{
    static Class92_Sub1[] aClass92_Sub1Array4433;
    Class110[] aClass110Array4434;
    static int anInt4435;
    static int anInt4436;
    static MutableString aClass100_4437;
    static int anInt4438;
    static int appletWidth;
    static MutableString aClass100_4440 = Class112.makeMutableString(43, "leuchten3:");
    static int anInt4441 = 0;
    static Class68_Sub20_Sub10 aClass68_Sub20_Sub10_4442;
    static Widget aClass45_4443 = null;
    static int[][][] anIntArrayArrayArray4444;
    static int anInt4445;

    static final void method1178(int i)
    {
        if (NodeSubList.aBooleanArray2230[96])
            ObjectDefinition.anInt2009 += (-ObjectDefinition.anInt2009 - 24) / 2;
        else if (!NodeSubList.aBooleanArray2230[97])
            ObjectDefinition.anInt2009 /= 2;
        else
            ObjectDefinition.anInt2009 += (24 - ObjectDefinition.anInt2009) / 2;
        int i_0_ = (Class68_Sub3.anInt2807 + (((Character) Class68_Sub7.localPlayer).x));
        anInt4436++;
        Class8.minimapInt2 += ObjectDefinition.anInt2009 / i;
        if (!NodeSubList.aBooleanArray2230[98])
        {
            if (NodeSubList.aBooleanArray2230[99])
                Class68_Sub20_Sub5.anInt4228 += (-Class68_Sub20_Sub5.anInt4228 - 12) / 2;
            else
                Class68_Sub20_Sub5.anInt4228 /= 2;
        } else
            Class68_Sub20_Sub5.anInt4228 += (12 - Class68_Sub20_Sub5.anInt4228) / 2;
        NodeList.anInt275 += Class68_Sub20_Sub5.anInt4228 / 2;
        int i_1_ = (((Character) Class68_Sub7.localPlayer).y + Class68_Sub20_Sub9.anInt4293);
        if (Class68_Sub20_Sub2.anInt4188 - i_0_ < -500 || Class68_Sub20_Sub2.anInt4188 - i_0_ > 500 || CachedItem.anInt4451 - i_1_ < -500 || CachedItem.anInt4451 - i_1_ > 500)
        {
            CachedItem.anInt4451 = i_1_;
            Class68_Sub20_Sub2.anInt4188 = i_0_;
        }
        if (i_0_ != Class68_Sub20_Sub2.anInt4188)
            Class68_Sub20_Sub2.anInt4188 += (i_0_ - Class68_Sub20_Sub2.anInt4188) / 16;
        if (CachedItem.anInt4451 != i_1_)
            CachedItem.anInt4451 += (i_1_ - CachedItem.anInt4451) / 16;
        Class68_Sub13_Sub20.method799((byte) -121);
    }

    public static void method1179(int i)
    {
        aClass68_Sub20_Sub10_4442 = null;
        if (i != 499)
            method1179(-51);
        anIntArrayArrayArray4444 = null;
        aClass45_4443 = null;
        aClass100_4440 = null;
        aClass92_Sub1Array4433 = null;
        aClass100_4437 = null;
    }

    Class68_Sub20_Sub17(Class21 class21, Class21 class21_2_, int i, boolean bool)
    {
        try
        {
            NodeList class16 = new NodeList();
            int i_3_ = class21.method355(i, 0);
            ((Class68_Sub20_Sub17) this).aClass110Array4434 = new Class110[i_3_];
            int[] is = class21.getData(i);
            for (int i_4_ = 0; i_4_ < is.length; i_4_++)
            {
                byte[] is_5_ = class21.method338(is[i_4_], 0, i);
                int i_6_ = 0xff & is_5_[1] | (0xff & is_5_[0]) << 8;
                Class68_Sub7 class68_sub7 = (Class68_Sub7) class16.method293((byte) 76);
                Class68_Sub7 class68_sub7_7_ = null;
                for (/**/; class68_sub7 != null; class68_sub7 = (Class68_Sub7) class16.method290((byte) -107))
                {
                    if (i_6_ == ((Class68_Sub7) class68_sub7).anInt2859)
                    {
                        class68_sub7_7_ = class68_sub7;
                        break;
                    }
                }
                if (class68_sub7_7_ == null)
                {
                    byte[] is_8_;
                    if (bool)
                        is_8_ = class21_2_.method343(i_6_, 14281, 0);
                    else
                        is_8_ = class21_2_.method343(0, 14281, i_6_);
                    class68_sub7_7_ = new Class68_Sub7(i_6_, is_8_);
                    class16.pushFront(class68_sub7_7_);
                }
                ((Class68_Sub20_Sub17) this).aClass110Array4434[is[i_4_]] = new Class110(is_5_, class68_sub7_7_);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("w.<init>(" + (class21 != null ? "{...}" : "null") + ',' + (class21_2_ != null ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
        }
    }

    final boolean method1180(boolean bool, int i)
    {
        if (bool != true)
            return true;
        anInt4445++;
        return (((Class110) ((Class68_Sub20_Sub17) this).aClass110Array4434[i]).aBoolean1856);
    }

    static final void method1181(GroundData class38, int i, boolean bool, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool_15_, int i_16_)
    {
        try
        {
            anInt4435++;
            if (!bool_15_ || Class28.method398(24781) || ((Object1.byteGroundArray[0][i_11_][i_9_] & 0x2) != 0) || ((Object1.byteGroundArray[i_14_][i_11_][i_9_] & 0x10) == 0 && (Mouse.method1490(i_9_, i_14_, i_11_, (byte) -68) == Class68_Sub13_Sub18.anInt3739)))
            {
                if (Class68_Sub25.anInt3176 > i_14_)
                    Class68_Sub25.anInt3176 = i_14_;
                ObjectDefinition class116 = Class1_Sub5.method140(110, i_16_);
                int i_17_;
                int i_18_;
                if (i != i_10_ && i_10_ != 3)
                {
                    i_18_ = ((ObjectDefinition) class116).anInt1989;
                    i_17_ = ((ObjectDefinition) class116).anInt1990;
                } else
                {
                    i_17_ = ((ObjectDefinition) class116).anInt1989;
                    i_18_ = ((ObjectDefinition) class116).anInt1990;
                }
                int i_19_;
                int i_20_;
                if (i_17_ + i_11_ <= 104)
                {
                    i_19_ = i_11_ + (i_17_ + 1 >> 1);
                    i_20_ = i_11_ + (i_17_ >> 1);
                } else
                {
                    i_19_ = i_11_ + 1;
                    i_20_ = i_11_;
                }
                int i_21_;
                int i_22_;
                if (i_18_ + i_9_ > 104)
                {
                    i_21_ = i_9_;
                    i_22_ = i_9_ + 1;
                } else
                {
                    i_21_ = i_9_ + (i_18_ >> 1);
                    i_22_ = i_9_ + (i_18_ + 1 >> 1);
                }
                int[][] is = Class68_Sub20_Sub12.intGroundArray[i_13_];
                int i_23_ = (i_18_ << 6) + (i_9_ << 7);
                int i_24_ = (i_11_ << 7) + (i_17_ << 6);
                int i_25_ = ((is[i_20_][i_21_] - (-is[i_19_][i_21_] - is[i_20_][i_22_]) + is[i_19_][i_22_]) >> 2);
                int[][] is_26_ = null;
                if (bool)
                    is_26_ = Class74.anIntArrayArrayArray1335[0];
                else if (i_13_ < 3)
                    is_26_ = (Class68_Sub20_Sub12.intGroundArray[i_13_ + 1]);
                long l = (long) (0x40000000 | (i_10_ << 20 | (i_9_ << 7 | i_11_ | i_12_ << 14)));
                if (((ObjectDefinition) class116).anInt1985 == 0 || bool)
                    l |= ~0x7fffffffffffffffL;
                if (((ObjectDefinition) class116).anInt1974 == 1)
                    l |= 0x400000L;
                if (((ObjectDefinition) class116).aBoolean2007)
                    l |= 0x80000000L;
                if (class116.method1713((byte) -6))
                    Class52.method543(19395, i_9_, null, class116, i_10_, i_11_, i_14_, null);
                boolean bool_27_ = !bool & ((ObjectDefinition) class116).aBoolean2020;
                l |= (long) i_16_ << 32;
                if (i_12_ == 22)
                {
                    if (RandomNumberGenerator.aBoolean1489 || ((ObjectDefinition) class116).anInt1985 != 0 || ((ObjectDefinition) class116).anInt2024 == 1 || ((ObjectDefinition) class116).aBoolean2006)
                    {
                        Animable class1;
                        if (((ObjectDefinition) class116).anInt2004 == -1 && ((ObjectDefinition) class116).childrenIDs == null)
                        {
                            Class44 class44 = class116.method1708(22, null, bool_27_, (byte) -116, bool_15_, i_25_, i_10_, is, i_23_, is_26_, i_24_);
                            class1 = ((Class44) class44).aClass1_746;
                        } else
                            class1 = new Class1_Sub7(i_16_, 22, i_10_, i_13_, i_11_, i_9_, (((ObjectDefinition) class116).anInt2004), (((ObjectDefinition) class116).aBoolean1999), null);
                        MRUNodes.method1577(i_14_, i_11_, i_9_, i_25_, class1, l, ((ObjectDefinition) class116).aBoolean1962);
                        if (((ObjectDefinition) class116).anInt2024 == 1 && class38 != null)
                            class38.method446(-124, i_9_, i_11_);
                    }
                } else if (i_12_ == 10 || i_12_ == 11)
                {
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 != -1 || ((ObjectDefinition) class116).childrenIDs != null)
                        class1 = new Class1_Sub7(i_16_, 10, i_12_ != 11 ? i_10_ : i_10_ + 4, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    else
                    {
                        Class44 class44 = class116.method1708(10, null, bool_27_, (byte) -20, bool_15_, i_25_, (i_12_ == 11 ? i_10_ + 4 : i_10_), is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    }
                    if (class1 != null)
                    {
                        boolean bool_28_ = Class3.method181(i_14_, i_11_, i_9_, i_25_, i_17_, i_18_, class1, 0, l);
                        if (((ObjectDefinition) class116).aBoolean2029 && bool_28_ && bool_15_)
                        {
                            int i_29_ = 15;
                            if (class1 instanceof Model)
                            {
                                i_29_ = ((Model) class1).method79() / 4;
                                if (i_29_ > 30)
                                    i_29_ = 30;
                            }
                            for (int i_30_ = 0; i_30_ <= i_17_; i_30_++)
                            {
                                for (int i_31_ = 0; i_31_ <= i_18_; i_31_++)
                                {
                                    if ((GroundData.aByteArrayArrayArray676[i_14_][i_11_ + i_30_][i_9_ + i_31_]) < i_29_)
                                        GroundData.aByteArrayArrayArray676[i_14_][i_30_ + i_11_][i_31_ + i_9_] = (byte) i_29_;
                                }
                            }
                        }
                    }
                    if (((ObjectDefinition) class116).anInt2024 != 0 && class38 != null)
                        class38.method455(-120, ((ObjectDefinition) class116).aBoolean2032, i_18_, i_17_, i_11_, i_9_);
                } else if (i_12_ >= 12)
                {
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 != -1 || ((ObjectDefinition) class116).childrenIDs != null)
                        class1 = new Class1_Sub7(i_16_, i_12_, i_10_, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    else
                    {
                        Class44 class44 = class116.method1708(i_12_, null, bool_27_, (byte) -127, bool_15_, i_25_, i_10_, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    }
                    Class3.method181(i_14_, i_11_, i_9_, i_25_, 1, 1, class1, 0, l);
                    if (bool_15_ && i_12_ >= 12 && i_12_ <= 17 && i_12_ != 13 && i_14_ > 0)
                        Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_] = Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_]), 4);
                    if (((ObjectDefinition) class116).anInt2024 != 0 && class38 != null)
                        class38.method455(-56, ((ObjectDefinition) class116).aBoolean2032, i_18_, i_17_, i_11_, i_9_);
                } else if (i_12_ == 0)
                {
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 == -1 && ((ObjectDefinition) class116).childrenIDs == null)
                    {
                        Class44 class44 = class116.method1708(0, null, bool_27_, (byte) -29, bool_15_, i_25_, i_10_, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    } else
                        class1 = new Class1_Sub7(i_16_, 0, i_10_, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    Class119.method1743(i_14_, i_11_, i_9_, i_25_, class1, null, Class23.anIntArray498[i_10_], 0, l);
                    if (bool_15_)
                    {
                        if (i_10_ == 0)
                        {
                            if (((ObjectDefinition) class116).aBoolean2029)
                            {
                                GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_] = (byte) 50;
                                GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_ + 1] = (byte) 50;
                            }
                            if (((ObjectDefinition) class116).aBoolean2010)
                                Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_]), 1));
                        } else if (i_10_ == 1)
                        {
                            if (((ObjectDefinition) class116).aBoolean2029)
                            {
                                GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_ + 1] = (byte) 50;
                                GroundData.aByteArrayArrayArray676[i_14_][i_11_ + 1][i_9_ + 1] = (byte) 50;
                            }
                            if (((ObjectDefinition) class116).aBoolean2010)
                                Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_ + 1] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_ + 1]), 2));
                        } else if (i_10_ != 2)
                        {
                            if (i_10_ == 3)
                            {
                                if (((ObjectDefinition) class116).aBoolean2029)
                                {
                                    GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_] = (byte) 50;
                                    GroundData.aByteArrayArrayArray676[i_14_][i_11_ + 1][i_9_] = (byte) 50;
                                }
                                if (((ObjectDefinition) class116).aBoolean2010)
                                    Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_]), 2));
                            }
                        } else
                        {
                            if (((ObjectDefinition) class116).aBoolean2029)
                            {
                                GroundData.aByteArrayArrayArray676[i_14_][i_11_ + 1][i_9_] = (byte) 50;
                                GroundData.aByteArrayArrayArray676[i_14_][i_11_ + 1][i_9_ + 1] = (byte) 50;
                            }
                            if (((ObjectDefinition) class116).aBoolean2010)
                                Class74.anIntArrayArrayArray1336[i_14_][i_11_ + 1][i_9_] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_ + 1][i_9_]), 1));
                        }
                    }
                    if (((ObjectDefinition) class116).anInt2024 != 0 && class38 != null)
                        class38.method461(i_10_, i_9_, ((ObjectDefinition) class116).aBoolean2032, i_12_, i_11_, (byte) 0);
                    if (((ObjectDefinition) class116).anInt2027 != 16)
                        Class68_Sub13_Sub26.method830(i_14_, i_11_, i_9_, (((ObjectDefinition) class116).anInt2027));
                } else if (i_12_ == 1)
                {
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 != -1 || ((ObjectDefinition) class116).childrenIDs != null)
                        class1 = new Class1_Sub7(i_16_, 1, i_10_, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    else
                    {
                        Class44 class44 = class116.method1708(1, null, bool_27_, (byte) -51, bool_15_, i_25_, i_10_, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    }
                    Class119.method1743(i_14_, i_11_, i_9_, i_25_, class1, null, (Class68_Sub20_Sub7.anIntArray4263[i_10_]), 0, l);
                    if (((ObjectDefinition) class116).aBoolean2029 && bool_15_)
                    {
                        if (i_10_ == 0)
                            GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_ + 1] = (byte) 50;
                        else if (i_10_ != 1)
                        {
                            if (i_10_ == 2)
                                GroundData.aByteArrayArrayArray676[i_14_][i_11_ + 1][i_9_] = (byte) 50;
                            else if (i_10_ == 3)
                                GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_] = (byte) 50;
                        } else
                            GroundData.aByteArrayArrayArray676[i_14_][i_11_ + 1][i_9_ + 1] = (byte) 50;
                    }
                    if (((ObjectDefinition) class116).anInt2024 != 0 && class38 != null)
                        class38.method461(i_10_, i_9_, ((ObjectDefinition) class116).aBoolean2032, i_12_, i_11_, (byte) 24);
                } else if (i_12_ == 2)
                {
                    int i_32_ = 0x3 & i_10_ + 1;
                    Animable class1;
                    Animable class1_33_;
                    if (((ObjectDefinition) class116).anInt2004 != -1 || ((ObjectDefinition) class116).childrenIDs != null)
                    {
                        class1 = new Class1_Sub7(i_16_, 2, i_10_ + 4, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                        class1_33_ = new Class1_Sub7(i_16_, 2, i_32_, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    } else
                    {
                        Class44 class44 = class116.method1708(2, null, bool_27_, (byte) -49, bool_15_, i_25_, i_10_ + 4, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                        class44 = class116.method1708(2, null, bool_27_, (byte) -116, bool_15_, i_25_, i_32_, is, i_23_, is_26_, i_24_);
                        class1_33_ = ((Class44) class44).aClass1_746;
                    }
                    Class119.method1743(i_14_, i_11_, i_9_, i_25_, class1, class1_33_, Class23.anIntArray498[i_10_], Class23.anIntArray498[i_32_], l);
                    if (((ObjectDefinition) class116).aBoolean2010 && bool_15_)
                    {
                        if (i_10_ != 0)
                        {
                            if (i_10_ == 1)
                            {
                                Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_ + 1] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_ + 1]), 2));
                                Class74.anIntArrayArrayArray1336[i_14_][i_11_ + 1][i_9_] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_ + 1][i_9_]), 1));
                            } else if (i_10_ == 2)
                            {
                                Class74.anIntArrayArrayArray1336[i_14_][i_11_ + 1][i_9_] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_ + 1][i_9_]), 1));
                                Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_]), 2));
                            } else if (i_10_ == 3)
                            {
                                Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_]), 2));
                                Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_]), 1));
                            }
                        } else
                        {
                            Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_] = Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_]), 1);
                            Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_ + 1] = Class70.OR((Class74.anIntArrayArrayArray1336[i_14_][i_11_][i_9_ + 1]), 2);
                        }
                    }
                    if (((ObjectDefinition) class116).anInt2024 != 0 && class38 != null)
                        class38.method461(i_10_, i_9_, ((ObjectDefinition) class116).aBoolean2032, i_12_, i_11_, (byte) -125);
                    if (((ObjectDefinition) class116).anInt2027 != 16)
                        Class68_Sub13_Sub26.method830(i_14_, i_11_, i_9_, (((ObjectDefinition) class116).anInt2027));
                } else if (i_12_ == 3)
                {
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 == -1 && ((ObjectDefinition) class116).childrenIDs == null)
                    {
                        Class44 class44 = class116.method1708(3, null, bool_27_, (byte) -47, bool_15_, i_25_, i_10_, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    } else
                        class1 = new Class1_Sub7(i_16_, 3, i_10_, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    Class119.method1743(i_14_, i_11_, i_9_, i_25_, class1, null, (Class68_Sub20_Sub7.anIntArray4263[i_10_]), 0, l);
                    if (((ObjectDefinition) class116).aBoolean2029 && bool_15_)
                    {
                        if (i_10_ != 0)
                        {
                            if (i_10_ != 1)
                            {
                                if (i_10_ != 2)
                                {
                                    if (i_10_ == 3)
                                        GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_] = (byte) 50;
                                } else
                                    GroundData.aByteArrayArrayArray676[i_14_][i_11_ + 1][i_9_] = (byte) 50;
                            } else
                                GroundData.aByteArrayArrayArray676[i_14_][i_11_ + 1][i_9_ + 1] = (byte) 50;
                        } else
                            GroundData.aByteArrayArrayArray676[i_14_][i_11_][i_9_ + 1] = (byte) 50;
                    }
                    if (((ObjectDefinition) class116).anInt2024 != 0 && class38 != null)
                        class38.method461(i_10_, i_9_, ((ObjectDefinition) class116).aBoolean2032, i_12_, i_11_, (byte) -126);
                } else if (i_12_ == 9)
                {
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 != -1 || ((ObjectDefinition) class116).childrenIDs != null)
                        class1 = new Class1_Sub7(i_16_, i_12_, i_10_, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    else
                    {
                        Class44 class44 = class116.method1708(i_12_, null, bool_27_, (byte) -35, bool_15_, i_25_, i_10_, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    }
                    Class3.method181(i_14_, i_11_, i_9_, i_25_, 1, 1, class1, 0, l);
                    if (((ObjectDefinition) class116).anInt2024 != 0 && class38 != null)
                        class38.method455(-87, ((ObjectDefinition) class116).aBoolean2032, i_18_, i_17_, i_11_, i_9_);
                    if (((ObjectDefinition) class116).anInt2027 != 16)
                        Class68_Sub13_Sub26.method830(i_14_, i_11_, i_9_, (((ObjectDefinition) class116).anInt2027));
                } else if (i_12_ == 4)
                {
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 != -1 || ((ObjectDefinition) class116).childrenIDs != null)
                        class1 = new Class1_Sub7(i_16_, 4, i_10_, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    else
                    {
                        Class44 class44 = class116.method1708(4, null, bool_27_, (byte) -32, bool_15_, i_25_, i_10_, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    }
                    Class23.method377(i_14_, i_11_, i_9_, i_25_, class1, null, Class23.anIntArray498[i_10_], 0, 0, 0, l);
                } else if (i_12_ == 5)
                {
                    int i_34_ = 16;
                    long l_35_ = Class107.method1656(i_14_, i_11_, i_9_);
                    if (l_35_ != 0L)
                        i_34_ = (((ObjectDefinition) Class1_Sub5.method140(110, ((int) (l_35_ >>> 32) & 0x7fffffff))).anInt2027);
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 == -1 && ((ObjectDefinition) class116).childrenIDs == null)
                    {
                        Class44 class44 = class116.method1708(4, null, bool_27_, (byte) -30, bool_15_, i_25_, i_10_, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    } else
                        class1 = new Class1_Sub7(i_16_, 4, i_10_, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    Class23.method377(i_14_, i_11_, i_9_, i_25_, class1, null, Class23.anIntArray498[i_10_], 0, i_34_ * (Class68_Sub20_Sub7.anIntArray4265[i_10_]), Class115.anIntArray1952[i_10_] * i_34_, l);
                } else if (i_12_ == 6)
                {
                    long l_36_ = Class107.method1656(i_14_, i_11_, i_9_);
                    int i_37_ = 8;
                    if (l_36_ != 0L)
                        i_37_ = (((ObjectDefinition) Class1_Sub5.method140(i + 122, (0x7fffffff & (int) (l_36_ >>> 32)))).anInt2027) / 2;
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 == -1 && ((ObjectDefinition) class116).childrenIDs == null)
                    {
                        Class44 class44 = class116.method1708(4, null, bool_27_, (byte) 127, bool_15_, i_25_, i_10_ + 4, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    } else
                        class1 = new Class1_Sub7(i_16_, 4, i_10_ + 4, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    Class23.method377(i_14_, i_11_, i_9_, i_25_, class1, null, 256, i_10_, Class68_Sub13.anIntArray2922[i_10_] * i_37_, Class68_Sub13_Sub28.anIntArray3931[i_10_] * i_37_, l);
                } else if (i_12_ == 7)
                {
                    int i_38_ = 0x3 & i_10_ + 2;
                    Animable class1;
                    if (((ObjectDefinition) class116).anInt2004 == -1 && ((ObjectDefinition) class116).childrenIDs == null)
                    {
                        Class44 class44 = class116.method1708(4, null, bool_27_, (byte) -48, bool_15_, i_25_, i_38_ + 4, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                    } else
                        class1 = new Class1_Sub7(i_16_, 4, i_38_ + 4, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    Class23.method377(i_14_, i_11_, i_9_, i_25_, class1, null, 256, i_38_, 0, 0, l);
                } else if (i_12_ == 8)
                {
                    int i_39_ = 8;
                    int i_40_ = 0x3 & i_10_ + 2;
                    long l_41_ = Class107.method1656(i_14_, i_11_, i_9_);
                    if (l_41_ != 0L)
                        i_39_ = (((ObjectDefinition) Class1_Sub5.method140(106, (0x7fffffff & (int) (l_41_ >>> 32)))).anInt2027) / 2;
                    Animable class1;
                    Animable class1_42_;
                    if (((ObjectDefinition) class116).anInt2004 == -1 && ((ObjectDefinition) class116).childrenIDs == null)
                    {
                        Class44 class44 = class116.method1708(4, null, bool_27_, (byte) 125, bool_15_, i_25_, i_10_ + 4, is, i_23_, is_26_, i_24_);
                        class1 = ((Class44) class44).aClass1_746;
                        class44 = class116.method1708(4, null, bool_27_, (byte) -5, bool_15_, i_25_, i_40_ + 4, is, i_23_, is_26_, i_24_);
                        class1_42_ = ((Class44) class44).aClass1_746;
                    } else
                    {
                        class1 = new Class1_Sub7(i_16_, 4, i_10_ + 4, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                        class1_42_ = new Class1_Sub7(i_16_, 4, i_40_ + 4, i_13_, i_11_, i_9_, ((ObjectDefinition) class116).anInt2004, (((ObjectDefinition) class116).aBoolean1999), null);
                    }
                    Class23.method377(i_14_, i_11_, i_9_, i_25_, class1, class1_42_, 256, i_10_, Class68_Sub13.anIntArray2922[i_10_] * i_39_, Class68_Sub13_Sub28.anIntArray3931[i_10_] * i_39_, l);
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("w.E(" + (class38 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + bool_15_ + ',' + i_16_ + ')'));
        }
    }

    static final boolean method1182(int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_)
    {
        if (i_43_ < i_44_ && i_43_ < i_45_ && i_43_ < i_46_)
            return false;
        if (i_43_ > i_44_ && i_43_ > i_45_ && i_43_ > i_46_)
            return false;
        if (i < i_47_ && i < i_48_ && i < i_49_)
            return false;
        if (i > i_47_ && i > i_48_ && i > i_49_)
            return false;
        int i_50_ = ((i_43_ - i_44_) * (i_48_ - i_47_) - (i - i_47_) * (i_45_ - i_44_));
        int i_51_ = ((i_43_ - i_46_) * (i_47_ - i_49_) - (i - i_49_) * (i_44_ - i_46_));
        int i_52_ = ((i_43_ - i_45_) * (i_49_ - i_48_) - (i - i_48_) * (i_46_ - i_45_));
        if (i_50_ * i_52_ > 0 && i_52_ * i_51_ > 0)
            return true;
        return false;
    }

    static
    {
        aClass100_4437 = Class112.makeMutableString(43, ")4a=");
    }
}
