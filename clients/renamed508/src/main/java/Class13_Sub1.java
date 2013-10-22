/* Class13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class13_Sub1 extends Class13
{
    static int anInt2622;
    private final int anInt2623;
    static int anInt2624;
    static int anInt2625;
    static MutableString aClass100_2626;
    static int anInt2627;
    private static MutableString aClass100_2628 = Class112.makeMutableString(43, "Loading interfaces )2 ");
    static NodeList aClass16_2629;
    private final int anInt2630;
    private final int anInt2631;
    static int anInt2632;
    static int anInt2633;
    static int anInt2634;
    static MutableString aClass100_2635 = aClass100_2628;
    private final int anInt2636;
    static MutableString aClass100_2637 = Class112.makeMutableString(43, "(Z");
    static int anInt2638;
    static int anInt2639;
    static int anInt2640;
    static int anInt2641;
    static int anInt2642;

    static final void method246(byte i, int i_0_)
    {
        Sprite minimap;
        if (GameSocket.minimapSprite == null)
            minimap = new Sprite(512, 512);
        else
            minimap = (Sprite) GameSocket.minimapSprite;
        anInt2627++;
        int[] is = (((Sprite) minimap).pixels);
        int i_1_ = is.length;
        for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
            is[i_2_] = 1;
        for (int i_3_ = 1; i_3_ < 103; i_3_++)
        {
            int i_4_ = 4 * (52736 - 512 * i_3_) + 24628;
            for (int i_5_ = 1; i_5_ < 103; i_5_++)
            {
                if ((Object1.byteGroundArray[i_0_][i_5_][i_3_] & 0x18) == 0)
                    method249(is, i_4_, 512, i_0_, i_5_, i_3_);
                if (i_0_ < 3 && (Object1.byteGroundArray[i_0_ + 1][i_5_][i_3_] & 0x8) != 0)
                    method249(is, i_4_, 512, i_0_ + 1, i_5_, i_3_);
                i_4_ += 4;
            }
        }
        minimap.method1126();
        if (i != -124)
            method254(-46, false);
        int i_6_ = (int) (Math.random() * 20.0) - 10 + 238 << 16;
        int i_7_ = ((int) (Math.random() * 20.0) - 10 + (((int) (Math.random() * 20.0) + 238 - 10 << 8) + ((int) (20.0 * Math.random()) + 228 << 16) + 238));
        for (int i_8_ = 1; i_8_ < 103; i_8_++)
        {
            for (int i_9_ = 1; i_9_ < 103; i_9_++)
            {
                if ((0x18 & Object1.byteGroundArray[i_0_][i_9_][i_8_]) == 0)
                    Class68_Sub10.method681(i_0_, i_7_, i_9_, i_6_, i_8_, (byte) 91);
                if (i_0_ < 3 && (0x8 & (Object1.byteGroundArray[i_0_ + 1][i_9_][i_8_])) != 0)
                    Class68_Sub10.method681(i_0_ + 1, i_7_, i_9_, i_6_, i_8_, (byte) 92);
            }
        }
        Class52.anInt1006 = 0;
        for (int i_10_ = 0; i_10_ < 104; i_10_++)
        {
            for (int i_11_ = 0; i_11_ < 104; i_11_++)
            {
                long l = Class89.method1512(GameSocket.plane, i_10_, i_11_);
                if (l != 0L)
                {
                    ObjectDefinition class116 = Class1_Sub5.method140(i + 212, 0x7fffffff & (int) (l >>> 32));
                    int i_12_ = ((ObjectDefinition) class116).anInt1982;
                    if (((ObjectDefinition) class116).childrenIDs != null)
                    {
                        for (int i_13_ = 0; (((ObjectDefinition) class116).childrenIDs.length > i_13_); i_13_++)
                        {
                            if (((ObjectDefinition) class116).childrenIDs[i_13_] != -1)
                            {
                                ObjectDefinition class116_14_ = Class1_Sub5.method140(96, (((ObjectDefinition) class116).childrenIDs[i_13_]));
                                if (((ObjectDefinition) class116_14_).anInt1982 >= 0)
                                {
                                    i_12_ = ((ObjectDefinition) class116_14_).anInt1982;
                                    break;
                                }
                            }
                        }
                    }
                    if (i_12_ >= 0)
                    {
                        int i_15_ = i_11_;
                        int i_16_ = i_10_;
                        if (i_12_ != 22 && i_12_ != 29 && i_12_ != 34 && i_12_ != 36 && i_12_ != 46 && i_12_ != 47 && i_12_ != 48)
                        {
                            int[][] is_17_ = (((GroundData) (Class109.groundDataArray[GameSocket.plane])).blocks);
                            for (int i_18_ = 0; i_18_ < 10; i_18_++)
                            {
                                int i_19_ = (int) (Math.random() * 4.0);
                                if (i_19_ == 0 && i_16_ > 0 && i_16_ > i_10_ - 3 && ((is_17_[i_16_ - 1][i_15_] & 0x12c0108) == 0))
                                    i_16_--;
                                if (i_19_ == 1 && i_16_ < 103 && i_10_ + 3 > i_16_ && ((0x12c0180 & is_17_[i_16_ + 1][i_15_]) == 0))
                                    i_16_++;
                                if (i_19_ == 2 && i_15_ > 0 && i_15_ > i_11_ - 3 && ((is_17_[i_16_][i_15_ - 1] & 0x12c0102) == 0))
                                    i_15_--;
                                if (i_19_ == 3 && i_15_ < 103 && i_11_ + 3 > i_15_ && ((is_17_[i_16_][i_15_ + 1] & 0x12c0120) == 0))
                                    i_15_++;
                            }
                        }
                        Class68_Sub20_Sub19.anIntArray4454[Class52.anInt1006] = ((ObjectDefinition) class116).type;
                        Class95.anIntArray1685[Class52.anInt1006] = i_16_;
                        NodeCache.anIntArray1923[Class52.anInt1006] = i_15_;
                        Class52.anInt1006++;
                    }
                }
            }
        }
        GameSocket.minimapSprite = minimap;
        Class1_Sub5.aClass72_2498.method1358(108);
    }

    static final MutableString method247(int i, boolean bool, byte i_20_, int i_21_)
    {
        anInt2640++;
        if (i < 2 || i > 36)
            throw new IllegalArgumentException("Invalid radix:" + i);
        int i_22_ = i_21_ / i;
        int i_23_ = 1;
        for (/**/; i_22_ != 0; i_22_ /= i)
            i_23_++;
        int i_24_ = i_23_;
        if (i_21_ < 0 || bool)
            i_24_++;
        byte[] is = new byte[i_24_];
        if (i_21_ >= 0)
        {
            if (bool)
                is[0] = (byte) 43;
        } else
            is[0] = (byte) 45;
        if (i_20_ != 125)
            method254(120, true);
        for (int i_25_ = 0; i_23_ > i_25_; i_25_++)
        {
            int i_26_ = i_21_ % i;
            i_21_ /= i;
            if (i_26_ < 0)
                i_26_ = -i_26_;
            if (i_26_ > 9)
                i_26_ += 39;
            is[i_24_ - 1 - i_25_] = (byte) (i_26_ + 48);
        }
        MutableString class100 = new MutableString();
        ((MutableString) class100).data = is;
        ((MutableString) class100).length = i_24_;
        return class100;
    }

    static final Class92[] method248(Class21 class21, int i, boolean bool, int i_27_)
    {
        try
        {
            anInt2624++;
            if (bool != false)
                method247(-21, true, (byte) 121, 82);
            if (!Class68_Sub13_Sub36.method880(-29381, i_27_, class21, i))
                return null;
            return Class21.method328(32568);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("dj.I(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_27_ + ')'));
        }
    }

    final void method243(int i, int i_28_, int i_29_)
    {
        anInt2634++;
        int i_30_ = anInt2631 * i >> 12;
        if (i_28_ != 23700)
            aClass100_2637 = null;
        int i_31_ = i_29_ * anInt2623 >> 12;
        int i_32_ = i * anInt2630 >> 12;
        int i_33_ = anInt2636 * i_29_ >> 12;
        Class68_Sub20_Sub15.method1169(((Class13) this).anInt216, i_32_, i_30_, i_31_, i_33_, ((Class13) this).anInt222, ((Class13) this).anInt220, (byte) -12);
    }

    private static final void method249(int[] is, int i, int i_34_, int i_35_, int i_36_, int i_37_)
    {
        Ground class68_sub1 = Class22.groundArray[i_35_][i_36_][i_37_];
        if (class68_sub1 != null)
        {
            Class7 class7 = ((Ground) class68_sub1).aClass7_2760;
            if (class7 != null)
            {
                int i_38_ = ((Class7) class7).anInt119;
                if (i_38_ != 0)
                {
                    for (int i_39_ = 0; i_39_ < 4; i_39_++)
                    {
                        is[i] = i_38_;
                        is[i + 1] = i_38_;
                        is[i + 2] = i_38_;
                        is[i + 3] = i_38_;
                        i += i_34_;
                    }
                }
            } else
            {
                Class77 class77 = ((Ground) class68_sub1).aClass77_2781;
                if (class77 != null)
                {
                    int i_40_ = ((Class77) class77).anInt1371;
                    int i_41_ = ((Class77) class77).anInt1376;
                    int i_42_ = ((Class77) class77).anInt1383;
                    int i_43_ = ((Class77) class77).anInt1369;
                    int[] is_44_ = Class124.anIntArrayArray2133[i_40_];
                    int[] is_45_ = Class7.anIntArrayArray130[i_41_];
                    int i_46_ = 0;
                    if (i_42_ != 0)
                    {
                        for (int i_47_ = 0; i_47_ < 4; i_47_++)
                        {
                            is[i] = is_44_[is_45_[i_46_++]] == 0 ? i_42_ : i_43_;
                            is[i + 1] = is_44_[is_45_[i_46_++]] == 0 ? i_42_ : i_43_;
                            is[i + 2] = is_44_[is_45_[i_46_++]] == 0 ? i_42_ : i_43_;
                            is[i + 3] = is_44_[is_45_[i_46_++]] == 0 ? i_42_ : i_43_;
                            i += i_34_;
                        }
                    } else
                    {
                        for (int i_48_ = 0; i_48_ < 4; i_48_++)
                        {
                            if (is_44_[is_45_[i_46_++]] != 0)
                                is[i] = i_43_;
                            if (is_44_[is_45_[i_46_++]] != 0)
                                is[i + 1] = i_43_;
                            if (is_44_[is_45_[i_46_++]] != 0)
                                is[i + 2] = i_43_;
                            if (is_44_[is_45_[i_46_++]] != 0)
                                is[i + 3] = i_43_;
                            i += i_34_;
                        }
                    }
                }
            }
        }
    }

    static final int method250(MutableString class100, int i)
    {
        try
        {
            anInt2639++;
            if (i >= -104)
                aClass100_2637 = null;
            return class100.getLength() + 1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "dj.O(" + (class100 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final void method251(boolean bool)
    {
        anInt2633++;
        if (Class32.anInt574 == 5)
        {
            if (bool != false)
                aClass100_2637 = null;
            Class32.anInt574 = 6;
        }
    }

    final void method244(int i, int i_49_, int i_50_)
    {
        int i_51_ = i_50_ * anInt2631 >> 12;
        anInt2625++;
        int i_52_ = anInt2630 * i_50_ >> 12;
        int i_53_ = -30 % ((-49 - i_49_) / 43);
        int i_54_ = anInt2623 * i >> 12;
        int i_55_ = anInt2636 * i >> 12;
        Class58.method581(i_52_, (byte) 63, i_55_, i_54_, i_51_, ((Class13) this).anInt216);
    }

    final void method245(boolean bool, int i, int i_56_)
    {
        if (bool == true)
            anInt2642++;
    }

    public static void method252(int i)
    {
        aClass100_2626 = null;
        aClass100_2637 = null;
        int i_57_ = -84 % ((10 - i) / 38);
        aClass100_2628 = null;
        aClass16_2629 = null;
        aClass100_2635 = null;
    }

    static final void method253(int i)
    {
        anInt2632++;
        if (Class33.aBoolean587)
        {
            Class15.aClass92_251 = null;
            if (i != 20)
                aClass16_2629 = null;
            Class33.aBoolean587 = false;
            Class96.aClass68_Sub20_Sub10_1702 = null;
        }
    }

    static final void method254(int i, boolean bool)
    {
        if (i != -12915)
            method252(47);
        anInt2622++;
        Class49.method524(16322);
        if (GameException.anInt2233 == 30 || GameException.anInt2233 == 25)
        {
            Class75_Sub2.anInt3315++;
            if (Class75_Sub2.anInt3315 >= 50 || bool)
            {
                Class75_Sub2.anInt3315 = 0;
                if (!Class75_Sub3_Sub1.aBoolean4599 && PlayerDefinition.connection != null)
                {
                    Class21.connectionVector.startPacket(115);
                    try
                    {
                        PlayerDefinition.connection.queueBytes(0, (byte) 33, (((Stream) Class21.connectionVector).position), (((Stream) Class21.connectionVector).buffer));
                        ((Stream) Class21.connectionVector).position = 0;
                    } catch (java.io.IOException ioexception)
                    {
                        Class75_Sub3_Sub1.aBoolean4599 = true;
                    }
                    Class78.anInt1394++;
                }
                Class49.method524(i + 29237);
            }
        }
    }

    Class13_Sub1(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_)
    {
        super(i_61_, i_62_, i_63_);
        anInt2636 = i_60_;
        anInt2630 = i_59_;
        anInt2623 = i_58_;
        anInt2631 = i;
    }

    static
    {
        aClass100_2626 = Class112.makeMutableString(43, ")4l=");
        aClass16_2629 = new NodeList();
        anInt2641 = 0;
    }
}
