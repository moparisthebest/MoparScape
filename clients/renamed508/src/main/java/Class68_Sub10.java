/* Class68_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub10 extends Node
{
    static MutableString aClass100_2902;
    static MutableString aClass100_2903;
    int anInt2904;
    static boolean aBoolean2905 = false;
    static int anInt2906;
    static boolean[] aBooleanArray2907;
    static int[] localNPCIndices;
    static Class21 aClass21_2909;
    static int anInt2910;
    static int anInt2911 = 0;
    static int anInt2912;
    static int localPlayerInteractingEntity;
    static Class65 aClass65_2914;
    static int anInt2915;
    static Class31 aClass31_2916;

    static final void method681(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte i_4_)
    {
        anInt2912++;
        if (i_4_ < 79)
            localNPCIndices = null;
        long l = Class107.method1656(i, i_1_, i_3_);
        if (l != 0L)
        {
            int i_5_ = ((int) l & 0x3da024) >> 20;
            int i_6_ = 0x1f & (int) l >> 14;
            int[] is = Class79.anIntArray1404;
            int i_7_ = i_0_;
            int i_8_ = (int) (l >>> 32) & 0x7fffffff;
            int i_9_ = 4 * (52736 - i_3_ * 512) + (4 * i_1_ + 24624);
            if (l > 0L)
                i_7_ = i_2_;
            ObjectDefinition class116 = Class1_Sub5.method140(106, i_8_);
            if (((ObjectDefinition) class116).anInt1975 == -1)
            {
                if (i_6_ == 0 || i_6_ == 2)
                {
                    if (i_5_ == 0)
                    {
                        is[i_9_] = i_7_;
                        is[i_9_ + 512] = i_7_;
                        is[i_9_ + 1024] = i_7_;
                        is[i_9_ + 1536] = i_7_;
                    } else if (i_5_ == 1)
                    {
                        is[i_9_] = i_7_;
                        is[i_9_ + 1] = i_7_;
                        is[i_9_ + 2] = i_7_;
                        is[i_9_ + 3] = i_7_;
                    } else if (i_5_ == 2)
                    {
                        is[i_9_ + 3] = i_7_;
                        is[i_9_ + 512 + 3] = i_7_;
                        is[i_9_ + 1024 + 3] = i_7_;
                        is[i_9_ + 3 + 1536] = i_7_;
                    } else if (i_5_ == 3)
                    {
                        is[i_9_ + 1536] = i_7_;
                        is[i_9_ + 1536 + 1] = i_7_;
                        is[i_9_ + 2 + 1536] = i_7_;
                        is[i_9_ + 1539] = i_7_;
                    }
                }
                if (i_6_ == 3)
                {
                    if (i_5_ != 0)
                    {
                        if (i_5_ != 1)
                        {
                            if (i_5_ == 2)
                                is[i_9_ + 3 + 1536] = i_7_;
                            else if (i_5_ == 3)
                                is[i_9_ + 1536] = i_7_;
                        } else
                            is[i_9_ + 3] = i_7_;
                    } else
                        is[i_9_] = i_7_;
                }
                if (i_6_ == 2)
                {
                    if (i_5_ != 3)
                    {
                        if (i_5_ != 0)
                        {
                            if (i_5_ == 1)
                            {
                                is[i_9_ + 3] = i_7_;
                                is[i_9_ + 515] = i_7_;
                                is[i_9_ + 3 + 1024] = i_7_;
                                is[i_9_ + 1539] = i_7_;
                            } else if (i_5_ == 2)
                            {
                                is[i_9_ + 1536] = i_7_;
                                is[i_9_ + 1 + 1536] = i_7_;
                                is[i_9_ + 1538] = i_7_;
                                is[i_9_ + 3 + 1536] = i_7_;
                            }
                        } else
                        {
                            is[i_9_] = i_7_;
                            is[i_9_ + 1] = i_7_;
                            is[i_9_ + 2] = i_7_;
                            is[i_9_ + 3] = i_7_;
                        }
                    } else
                    {
                        is[i_9_] = i_7_;
                        is[i_9_ + 512] = i_7_;
                        is[i_9_ + 1024] = i_7_;
                        is[i_9_ + 1536] = i_7_;
                    }
                }
            } else
            {
                Class92_Sub1 class92_sub1 = null;
                if (((ObjectDefinition) class116).aBoolean2019)
                {
                    if (i_5_ == 0)
                        class92_sub1 = (Class104.aClass92_Sub1Array1781[((ObjectDefinition) class116).anInt1975]);
                    else if (i_5_ == 1)
                        class92_sub1 = (Class112.aClass92_Sub1Array1888[((ObjectDefinition) class116).anInt1975]);
                    else if (i_5_ != 2)
                    {
                        if (i_5_ == 3)
                            class92_sub1 = (Class68_Sub20_Sub17.aClass92_Sub1Array4433[((ObjectDefinition) class116).anInt1975]);
                    } else
                        class92_sub1 = (Class68_Sub13_Sub19.aClass92_Sub1Array3747[((ObjectDefinition) class116).anInt1975]);
                } else
                    class92_sub1 = (Class104.aClass92_Sub1Array1781[((ObjectDefinition) class116).anInt1975]);
                if (class92_sub1 != null)
                {
                    int i_10_ = ((((ObjectDefinition) class116).anInt1990 * 4 - ((Class92) class92_sub1).anInt1661) / 2);
                    int i_11_ = ((((ObjectDefinition) class116).anInt1989 * 4 - ((Class92) class92_sub1).anInt1660) / 2);
                    class92_sub1.method1533(i_10_ + 4 * i_1_ + 48, (-((ObjectDefinition) class116).anInt1989 - i_3_ + 104) * 4 + (i_11_ + 48));
                }
            }
        }
        l = Class68_Sub13_Sub9.method738(i, i_1_, i_3_);
        if (l != 0L)
        {
            int i_12_ = 0x3 & (int) l >> 20;
            int i_13_ = (int) l >> 14 & 0x1f;
            int i_14_ = (int) (l >>> 32) & 0x7fffffff;
            ObjectDefinition class116 = Class1_Sub5.method140(127, i_14_);
            if (((ObjectDefinition) class116).anInt1975 == -1)
            {
                if (i_13_ == 9)
                {
                    int[] is = Class79.anIntArray1404;
                    int i_15_ = 15658734;
                    if (l > 0L)
                        i_15_ = 15597568;
                    int i_16_ = 4 * (103 - i_3_) * 512 + (4 * i_1_ + 24624);
                    if (i_12_ == 0 || i_12_ == 2)
                    {
                        is[i_16_ + 1536] = i_15_;
                        is[i_16_ + 1024 + 1] = i_15_;
                        is[i_16_ + 2 + 512] = i_15_;
                        is[i_16_ + 3] = i_15_;
                    } else
                    {
                        is[i_16_] = i_15_;
                        is[i_16_ + 1 + 512] = i_15_;
                        is[i_16_ + 1026] = i_15_;
                        is[i_16_ + 1539] = i_15_;
                    }
                }
            } else
            {
                Class92_Sub1 class92_sub1 = null;
                if (((ObjectDefinition) class116).aBoolean2019)
                {
                    if (i_12_ == 0)
                        class92_sub1 = (Class104.aClass92_Sub1Array1781[((ObjectDefinition) class116).anInt1975]);
                    else if (i_12_ != 1)
                    {
                        if (i_12_ != 2)
                        {
                            if (i_12_ == 3)
                                class92_sub1 = (Class68_Sub20_Sub17.aClass92_Sub1Array4433[((ObjectDefinition) class116).anInt1975]);
                        } else
                            class92_sub1 = (Class68_Sub13_Sub19.aClass92_Sub1Array3747[((ObjectDefinition) class116).anInt1975]);
                    } else
                        class92_sub1 = (Class112.aClass92_Sub1Array1888[((ObjectDefinition) class116).anInt1975]);
                } else
                    class92_sub1 = (Class104.aClass92_Sub1Array1781[((ObjectDefinition) class116).anInt1975]);
                if (class92_sub1 != null)
                {
                    int i_17_ = ((4 * ((ObjectDefinition) class116).anInt1989 - ((Class92) class92_sub1).anInt1660) / 2);
                    int i_18_ = ((((ObjectDefinition) class116).anInt1990 * 4 - ((Class92) class92_sub1).anInt1661) / 2);
                    class92_sub1.method1533(i_18_ + (i_1_ * 4 + 48), i_17_ + (4 * (104 - (i_3_ + (((ObjectDefinition) class116).anInt1989))) + 48));
                }
            }
        }
        l = Class89.method1512(i, i_1_, i_3_);
        if (l != 0L)
        {
            int i_19_ = ((int) l & 0x3f83b3) >> 20;
            int i_20_ = (int) (l >>> 32) & 0x7fffffff;
            ObjectDefinition class116 = Class1_Sub5.method140(82, i_20_);
            if (((ObjectDefinition) class116).anInt1975 != -1)
            {
                Class92_Sub1 class92_sub1 = null;
                if (!((ObjectDefinition) class116).aBoolean2019)
                    class92_sub1 = (Class104.aClass92_Sub1Array1781[((ObjectDefinition) class116).anInt1975]);
                else if (i_19_ == 0)
                    class92_sub1 = (Class104.aClass92_Sub1Array1781[((ObjectDefinition) class116).anInt1975]);
                else if (i_19_ != 1)
                {
                    if (i_19_ == 2)
                        class92_sub1 = (Class68_Sub13_Sub19.aClass92_Sub1Array3747[((ObjectDefinition) class116).anInt1975]);
                    else if (i_19_ == 3)
                        class92_sub1 = (Class68_Sub20_Sub17.aClass92_Sub1Array4433[((ObjectDefinition) class116).anInt1975]);
                } else
                    class92_sub1 = (Class112.aClass92_Sub1Array1888[((ObjectDefinition) class116).anInt1975]);
                if (class92_sub1 != null)
                {
                    int i_21_ = ((((ObjectDefinition) class116).anInt1989 * 4 - ((Class92) class92_sub1).anInt1660) / 2);
                    int i_22_ = ((((ObjectDefinition) class116).anInt1990 * 4 - ((Class92) class92_sub1).anInt1661) / 2);
                    class92_sub1.method1533(i_22_ + (4 * i_1_ + 48), (i_21_ + 48 + 4 * (104 - i_3_ - (((ObjectDefinition) class116).anInt1989))));
                }
            }
        }
    }

    public static void method682(int i)
    {
        aClass100_2902 = null;
        aClass31_2916 = null;
        aClass21_2909 = null;
        aClass100_2903 = null;
        aClass65_2914 = null;
        aBooleanArray2907 = null;
        if (i == 0)
            localNPCIndices = null;
    }

    public Class68_Sub10()
    {
        /* empty */
    }

    Class68_Sub10(int i)
    {
        ((Class68_Sub10) this).anInt2904 = i;
    }

    static final void method683(byte i)
    {
        anInt2915++;
        int i_23_ = -69 / ((i + 65) / 61);
        if (Class118.anIntArray2079 == null || Class78.anIntArray1396 == null)
        {
            Class118.anIntArray2079 = new int[256];
            Class78.anIntArray1396 = new int[256];
            for (int i_24_ = 0; i_24_ < 256; i_24_++)
            {
                double d = (double) i_24_ / 255.0 * 6.283185307179586;
                Class118.anIntArray2079[i_24_] = (int) (Math.sin(d) * 4096.0);
                Class78.anIntArray1396[i_24_] = (int) (Math.cos(d) * 4096.0);
            }
        }
    }

    static final void method684(int i)
    {
        anInt2906++;
        if (i == (Class68_Sub7.method666(1) ^ 0xffffffff))
        {
            byte i_25_ = (byte) (0xff & Class3.anInt84 - 4);
            int i_26_ = Class3.anInt84 % 104;
            for (int i_27_ = 0; i_27_ < 4; i_27_++)
            {
                for (int i_28_ = 0; i_28_ < 104; i_28_++)
                    NodeSub.aByteArrayArrayArray3097[i_27_][i_26_][i_28_] = i_25_;
            }
            if (GameSocket.plane != 3)
            {
                for (int i_29_ = 0; i_29_ < 2; i_29_++)
                {
                    Class21_Sub1.anIntArray2695[i_29_] = -1000000;
                    PlayerDefinition.anIntArray2182[i_29_] = 1000000;
                    Class7.anIntArray134[i_29_] = 0;
                    Class68_Sub20_Sub16.anIntArray4410[i_29_] = 1000000;
                    Login.anIntArray1512[i_29_] = 0;
                }
                do
                {
                    if (NodeSubList.anInt2216 == 1)
                    {
                        if ((0x4 & (Object1.byteGroundArray[GameSocket.plane][(((Character) Class68_Sub7.localPlayer).x) >> 7][(((Character) Class68_Sub7.localPlayer).y) >> 7])) != 0)
                            Class75_Sub1_Sub1.method1391(false, Class22.groundArray, (((Character) Class68_Sub7.localPlayer).y) >> 7, (((Character) Class68_Sub7.localPlayer).x) >> 7, 0, (byte) -125);
                        if (GameCanvas.cameraPitch < 310)
                        {
                            int i_30_ = ((((Character) Class68_Sub7.localPlayer).x) >> 7);
                            int i_31_ = Class85.cameraPositionY >> 7;
                            int i_32_ = ((((Character) Class68_Sub7.localPlayer).y) >> 7);
                            int i_33_ = Class68_Sub7.cameraPositionX >> 7;
                            int i_34_;
                            if (i_30_ <= i_33_)
                                i_34_ = i_33_ - i_30_;
                            else
                                i_34_ = i_30_ - i_33_;
                            int i_35_;
                            if (i_32_ <= i_31_)
                                i_35_ = i_31_ - i_32_;
                            else
                                i_35_ = i_32_ - i_31_;
                            if (i_35_ < i_34_)
                            {
                                int i_36_ = 32768;
                                int i_37_ = 65536 * i_35_ / i_34_;
                                while (i_33_ != i_30_)
                                {
                                    if (i_30_ > i_33_)
                                        i_33_++;
                                    else if (i_33_ > i_30_)
                                        i_33_--;
                                    if ((0x4 & (Object1.byteGroundArray[GameSocket.plane][i_33_][i_31_])) != 0)
                                    {
                                        Class75_Sub1_Sub1.method1391(false, (Class22.groundArray), i_31_, i_33_, 1, (byte) 104);
                                        break;
                                    }
                                    i_36_ += i_37_;
                                    if (i_36_ >= 65536)
                                    {
                                        i_36_ -= 65536;
                                        if (i_31_ >= i_32_)
                                        {
                                            if (i_31_ > i_32_)
                                                i_31_--;
                                        } else
                                            i_31_++;
                                        if (((Object1.byteGroundArray[GameSocket.plane][i_33_][i_31_]) & 0x4) != 0)
                                        {
                                            Class75_Sub1_Sub1.method1391(false, (Class22.groundArray), i_31_, i_33_, 1, (byte) 62);
                                            break;
                                        }
                                    }
                                }
                            } else
                            {
                                int i_38_ = i_34_ * 65536 / i_35_;
                                int i_39_ = 32768;
                                while (i_31_ != i_32_)
                                {
                                    if (i_31_ < i_32_)
                                        i_31_++;
                                    else if (i_31_ > i_32_)
                                        i_31_--;
                                    if ((0x4 & (Object1.byteGroundArray[GameSocket.plane][i_33_][i_31_])) != 0)
                                    {
                                        Class75_Sub1_Sub1.method1391(false, (Class22.groundArray), i_31_, i_33_, 1, (byte) -79);
                                        break;
                                    }
                                    i_39_ += i_38_;
                                    if (i_39_ >= 65536)
                                    {
                                        if (i_33_ < i_30_)
                                            i_33_++;
                                        else if (i_33_ > i_30_)
                                            i_33_--;
                                        i_39_ -= 65536;
                                        if (((Object1.byteGroundArray[GameSocket.plane][i_33_][i_31_]) & 0x4) != 0)
                                        {
                                            Class75_Sub1_Sub1.method1391(false, (Class22.groundArray), i_31_, i_33_, 1, (byte) -113);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else
                    {
                        int i_40_ = Player.fixZ((Class68_Sub7.cameraPositionX), GameSocket.plane, Class85.cameraPositionY);
                        if (i_40_ - Class68_Sub5.cameraPositionZ >= 800 || (0x4 & (Object1.byteGroundArray[GameSocket.plane][Class68_Sub7.cameraPositionX >> 7][Class85.cameraPositionY >> 7])) == 0)
                            break;
                        Class75_Sub1_Sub1.method1391(false, Class22.groundArray, Class85.cameraPositionY >> 7, Class68_Sub7.cameraPositionX >> 7, 1, (byte) -109);
                    }
                    break;
                } while (false);
            }
        }
    }

    static
    {
        anInt2910 = 0;
        localNPCIndices = new int[32768];
        aClass100_2903 = Class112.makeMutableString(43, "loginscreen");
        localPlayerInteractingEntity = -1;
        aClass100_2902 = Class112.makeMutableString(43, "::clientdrop");
    }
}
