/* Class68_Sub13_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub19 extends Class68_Sub13
{
    static MutableString aClass100_3741 = Class112.makeMutableString(43, "");
    static MutableString aClass100_3742;
    private static MutableString aClass100_3743;
    static MutableString aClass100_3744;
    private boolean aBoolean3745 = true;
    static int anInt3746;
    static Class92_Sub1[] aClass92_Sub1Array3747;
    static int anInt3748;
    static int anInt3749;
    static int anInt3750 = 0;
    static int anInt3751;
    static int anInt3752;
    static int anInt3753;
    private boolean aBoolean3754 = true;
    static int anInt3755;
    private static MutableString aClass100_3756;
    static int anInt3757;
    static int anInt3758;
    static int[] anIntArray3759;
    static int anInt3760;
    static int anInt3761;

    static final void method792(int i)
    {
        anInt3751++;
        boolean bool = false;
        if (i == 6364)
        {
            while (!bool)
            {
                bool = true;
                for (int i_0_ = 0; i_0_ < Class68_Sub13_Sub21.menuOptionsCount - 1; i_0_++)
                {
                    if (Class68_Sub28_Sub1.menuActionIDs[i_0_] < 1000 && (Class68_Sub28_Sub1.menuActionIDs[i_0_ + 1] > 1000))
                    {
                        bool = false;
                        MutableString class100 = Class33.menuOptions[i_0_];
                        Class33.menuOptions[i_0_] = Class33.menuOptions[i_0_ + 1];
                        Class33.menuOptions[i_0_ + 1] = class100;
                        MutableString class100_1_ = Class71_Sub1.menuActions[i_0_];
                        Class71_Sub1.menuActions[i_0_] = Class71_Sub1.menuActions[i_0_ + 1];
                        Class71_Sub1.menuActions[i_0_ + 1] = class100_1_;
                        int i_2_ = Class37.menuActionCommands2[i_0_];
                        Class37.menuActionCommands2[i_0_] = Class37.menuActionCommands2[i_0_ + 1];
                        Class37.menuActionCommands2[i_0_ + 1] = i_2_;
                        i_2_ = Class68_Sub13_Sub37.menuActionCommands3[i_0_];
                        Class68_Sub13_Sub37.menuActionCommands3[i_0_] = Class68_Sub13_Sub37.menuActionCommands3[i_0_ + 1];
                        Class68_Sub13_Sub37.menuActionCommands3[i_0_ + 1] = i_2_;
                        short i_3_ = Class68_Sub28_Sub1.menuActionIDs[i_0_];
                        Class68_Sub28_Sub1.menuActionIDs[i_0_] = Class68_Sub28_Sub1.menuActionIDs[i_0_ + 1];
                        Class68_Sub28_Sub1.menuActionIDs[i_0_ + 1] = i_3_;
                        long l = Class68_Sub13_Sub14.menuActionCommands1[i_0_];
                        Class68_Sub13_Sub14.menuActionCommands1[i_0_] = Class68_Sub13_Sub14.menuActionCommands1[i_0_ + 1];
                        Class68_Sub13_Sub14.menuActionCommands1[i_0_ + 1] = l;
                    }
                }
            }
        }
    }

    public Class68_Sub13_Sub19()
    {
        super(1, false);
    }

    static final int method793(int i, int i_4_)
    {
        if (i > -83)
            method795(null, (byte) 100);
        anInt3746++;
        return i_4_ >>> 8;
    }

    final int[] method698(byte i, int i_5_)
    {
        anInt3755++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_5_);
        if (i != -61)
            aClass100_3744 = null;
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int[] is_6_ = this.method696(0, (aBoolean3745 ? Player.anInt3434 - i_5_ : i_5_), 29149);
            if (!aBoolean3754)
                Class39.method466(is_6_, 0, is, 0, anInt3748);
            else
            {
                for (int i_7_ = 0; anInt3748 > i_7_; i_7_++)
                    is[i_7_] = is_6_[Class30.anInt543 - i_7_];
            }
        }
        return is;
    }

    static final boolean method794(int i, int i_8_)
    {
        anInt3749++;
        if (i != 32157)
            method793(-72, -38);
        if ((i_8_ >> 20 & 0x1) == 0)
            return false;
        return true;
    }

    final int[][] method697(int i, boolean bool)
    {
        anInt3760++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) 3);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[][] is_9_ = this.method699(-85, 0, (!aBoolean3745 ? i : Player.anInt3434 - i));
            int[] is_10_ = is_9_[1];
            int[] is_11_ = is_9_[0];
            int[] is_12_ = is[0];
            int[] is_13_ = is[2];
            int[] is_14_ = is[1];
            int[] is_15_ = is_9_[2];
            if (aBoolean3754)
            {
                for (int i_16_ = 0; anInt3748 > i_16_; i_16_++)
                {
                    is_12_[i_16_] = is_11_[Class30.anInt543 - i_16_];
                    is_14_[i_16_] = is_10_[Class30.anInt543 - i_16_];
                    is_13_[i_16_] = is_15_[Class30.anInt543 - i_16_];
                }
            } else
            {
                for (int i_17_ = 0; anInt3748 > i_17_; i_17_++)
                {
                    is_12_[i_17_] = is_11_[i_17_];
                    is_14_[i_17_] = is_10_[i_17_];
                    is_13_[i_17_] = is_15_[i_17_];
                }
            }
        }
        if (bool != true)
            aClass100_3756 = null;
        return is;
    }

    final void method700(Stream class68_sub14, int i, int i_18_)
    {
        do
        {
            try
            {
                anInt3753++;
                int i_19_ = i;
                while_80_: do
                {
                    do
                    {
                        if (i_19_ != 0)
                        {
                            if (i_19_ != 1)
                            {
                                if (i_19_ == 2)
                                    break;
                                break while_80_;
                            }
                        } else
                        {
                            aBoolean3754 = class68_sub14.readUByte() == 1;
                            break while_80_;
                        }
                        aBoolean3745 = class68_sub14.readUByte() == 1;
                        break while_80_;
                    } while (false);
                    ((Class68_Sub13) this).aBoolean2933 = class68_sub14.readUByte() == 1;
                } while (false);
                if (i_18_ == -1)
                    break;
                method794(26, 123);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ld.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_18_ + ')'));
            }
            break;
        } while (false);
    }

    static final void method795(GameApplet applet_sub1, byte i)
    {
        do
        {
            try
            {
                anInt3758++;
                Class118.method1736(true);
                if (Object2.aClass52_1354 == null)
                {
                    if (!Class1_Sub1.aBoolean2416)
                        Class37.method442(500);
                    else
                    {
                        if (Class29.anInt537 == 1)
                        {
                            int i_20_ = Class50.anInt990 / 5;
                            int i_21_ = i_20_ + Class68_Sub13_Sub18.anInt3736 + 140;
                            if (Class68_Sub13_Sub37.anInt4079 < i_21_ || Class68_Sub13_Sub37.anInt4079 > i_21_ + 14 || (Class68_Sub24.anInt3160 + 4 > Class125.anInt2175) || (Class68_Sub24.anInt3160 + 18 < Class125.anInt2175))
                            {
                                if (Class68_Sub13_Sub37.anInt4079 >= i_21_ + 15 && (i_21_ + 80 >= Class68_Sub13_Sub37.anInt4079) && (Class125.anInt2175 >= Class68_Sub24.anInt3160 + 4) && (Class68_Sub24.anInt3160 + 18 >= Class125.anInt2175))
                                {
                                    Class111.method1669(126, 0, 1);
                                    break;
                                }
                            } else
                            {
                                Class111.method1669(122, 0, 0);
                                break;
                            }
                            int i_22_ = i_20_ + Class68_Sub13_Sub18.anInt3736 + 250;
                            if (i_22_ <= Class68_Sub13_Sub37.anInt4079 && Class68_Sub13_Sub37.anInt4079 <= i_22_ + 14 && (Class68_Sub24.anInt3160 + 4 <= Class125.anInt2175) && (Class125.anInt2175 <= Class68_Sub24.anInt3160 + 18))
                            {
                                Class111.method1669(112, 1, 0);
                                break;
                            }
                            if (Class68_Sub13_Sub37.anInt4079 >= i_22_ + 15 && Class68_Sub13_Sub37.anInt4079 <= i_22_ + 80 && (Class68_Sub24.anInt3160 + 4 <= Class125.anInt2175) && (Class68_Sub24.anInt3160 + 18 >= Class125.anInt2175))
                            {
                                Class111.method1669(124, 1, 1);
                                break;
                            }
                            int i_23_ = i_20_ + Class68_Sub13_Sub18.anInt3736 + 360;
                            if (i_23_ <= Class68_Sub13_Sub37.anInt4079 && i_23_ + 14 >= Class68_Sub13_Sub37.anInt4079 && (Class125.anInt2175 >= Class68_Sub24.anInt3160 + 4) && (Class125.anInt2175 <= Class68_Sub24.anInt3160 + 18))
                            {
                                Class111.method1669(105, 2, 0);
                                break;
                            }
                            if (i_23_ + 15 <= Class68_Sub13_Sub37.anInt4079 && Class68_Sub13_Sub37.anInt4079 <= i_23_ + 80 && (Class125.anInt2175 >= Class68_Sub24.anInt3160 + 4) && (Class68_Sub24.anInt3160 + 18 >= Class125.anInt2175))
                            {
                                Class111.method1669(115, 2, 1);
                                break;
                            }
                            int i_24_ = i_20_ + Class68_Sub13_Sub18.anInt3736 + 470;
                            if (Class68_Sub13_Sub37.anInt4079 >= i_24_ && Class68_Sub13_Sub37.anInt4079 <= i_24_ + 14 && (Class125.anInt2175 >= Class68_Sub24.anInt3160 + 4) && (Class68_Sub24.anInt3160 + 18 >= Class125.anInt2175))
                            {
                                Class111.method1669(112, 3, 0);
                                break;
                            }
                            if (Class68_Sub13_Sub37.anInt4079 >= i_24_ + 15 && i_24_ + 80 >= Class68_Sub13_Sub37.anInt4079 && (Class68_Sub24.anInt3160 + 4 <= Class125.anInt2175) && (Class68_Sub24.anInt3160 + 18 >= Class125.anInt2175))
                            {
                                Class111.method1669(124, 3, 1);
                                break;
                            }
                            if (Class68_Sub13_Sub36.anInt4039 != -1)
                            {
                                Class93 class93 = (Character.aClass93Array2531[Class68_Sub13_Sub36.anInt4039]);
                                if (((Class93) class93).aBoolean1663 != !Class1_Sub7.members)
                                {
                                    byte[] is = Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (((Class93) class93).aClass100_1672), (Class68_Sub20_Sub11.aClass100_4335) })).getData();
                                    Class68_Sub9.serverAddress = new String(is, 0, is.length);
                                    Class106.anInt1801 = ((Class93) class93).anInt1666;
                                    if (Class75_Sub3.location != 0)
                                    {
                                        Class68_Sub15.anInt3015 = Class106.anInt1801 + 50000;
                                        Class115.anInt1948 = Class106.anInt1801 + 40000;
                                        Class103.port = Class115.anInt1948;
                                    }
                                    if (Class59.aClass45_1101 != null)
                                    {
                                        ((Widget) Class59.aClass45_1101).aBoolean764 = true;
                                        NodeCache.method1688((Class59.aClass45_1101), -119);
                                    }
                                    break;
                                }
                                MutableString class100 = Class33.aClass100_586;
                                if (Class75_Sub3.location != 0)
                                    class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub20_Sub9.aClass100_4296), (Class68_Sub13_Sub24.method816((((Class93) class93).anInt1666 + 7000), 0)) })));
                                MutableString class100_25_ = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (GameException.aClass100_2234), ((Class93) class93).aClass100_1672, Class68_Sub20_Sub11.aClass100_4335, class100, Class13_Sub1.aClass100_2626, (Class68_Sub13_Sub24.method816(Class68_Sub13_Sub27.language, 0)), Class52.aClass100_1009, (Class68_Sub13_Sub24.method816(Class68_Sub13_Sub20.anInt3782, 0)), Class68_Sub20_Sub7.aClass100_4258, Class68_Sub13_Sub24.method816(0, 0),
                                        Class36.aClass100_639, Class68_Sub13_Sub24.method816(Class20.anInt403, 0), GameSocket.aClass100_1147, (Class68_Sub13_Sub24.method816(Class68_Sub13_Sub10.anInt3599, 0)) })));
                                try
                                {
                                    applet_sub1.getAppletContext().showDocument(class100_25_.toURL(), "_self");
                                } catch (Exception exception)
                                {
                                    /* empty */
                                }
                            }
                        }
                        if (i >= 63)
                            break;
                        anInt3748 = -85;
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ld.D(" + (applet_sub1 != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    public static void method796(int i)
    {
        aClass92_Sub1Array3747 = null;
        if (i != 1)
            method795(null, (byte) 117);
        aClass100_3742 = null;
        anIntArray3759 = null;
        aClass100_3741 = null;
        aClass100_3756 = null;
        aClass100_3743 = null;
        aClass100_3744 = null;
    }

    static final void method797(Class21 class21, Class21 class21_26_, Class21 class21_27_, int i)
    {
        try
        {
            anInt3752++;
            Class68_Sub13_Sub24.aClass21_3845 = class21_27_;
            if (i >= -72)
                method793(-11, 6);
            Class68_Sub13_Sub24.aClass21_3833 = class21;
            Class50_Sub2.aClass21_2738 = class21_26_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ld.F(" + (class21 != null ? "{...}" : "null") + ',' + (class21_26_ != null ? "{...}" : "null") + ',' + (class21_27_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    static
    {
        aClass100_3743 = Class112.makeMutableString(43, "Loaded interfaces");
        aClass100_3742 = aClass100_3743;
        anInt3757 = 0;
        aClass100_3756 = Class112.makeMutableString(43, "Loading )2 please wait)3");
        anInt3761 = 0;
        aClass100_3744 = aClass100_3756;
    }
}
