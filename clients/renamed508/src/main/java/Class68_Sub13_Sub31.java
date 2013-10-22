/* Class68_Sub13_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub31 extends Class68_Sub13
{
    private int anInt3957;
    static int anInt3958;
    static int anInt3959;
    private int anInt3960 = 0;
    private int[] anIntArray3961;
    static int anInt3962;
    static int anInt3963;
    static int anInt3964;
    static NodeList aClass16_3965 = new NodeList();
    private int[] anIntArray3966;
    static int anInt3967;
    static int anInt3968;
    static int anInt3969;
    private int anInt3970;
    static int[] anIntArray3971;
    static int[] anIntArray3972 = new int[32];
    static Class21_Sub1 aClass21_Sub1_3973;
    static int anInt3974;
    static Class92_Sub1[] aClass92_Sub1Array3975;
    static int anInt3976;
    static int anInt3977;
    static MutableString aClass100_3978;
    static int cameraPositionZ_local;

    public Class68_Sub13_Sub31()
    {
        super(0, true);
        anInt3957 = 10;
        anInt3970 = 2048;
    }

    final void method690(byte i)
    {
        method856(-1);
        if (i > -22)
            anIntArray3966 = null;
        anInt3964++;
    }

    static final Sprite method854(int i, Class21 class21, int i_0_, int i_1_)
    {
        try
        {
            anInt3967++;
            if (i <= 49)
                anIntArray3971 = null;
            if (!Class68_Sub13_Sub36.method880(-29381, i_1_, class21, i_0_))
                return null;
            return Class74.method1380(-14452);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("se.D(" + i + ',' + (class21 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
        }
    }

    static final void method855(byte i)
    {
        int i_2_ = -14 / ((-23 - i) / 50);
        Class68_Sub20_Sub13.aClass98_4361.method1572((byte) 94);
        anInt3963++;
    }

    private final void method856(int i)
    {
        anIntArray3966 = new int[anInt3957 - i];
        int i_3_ = 0;
        anInt3959++;
        anIntArray3961 = new int[anInt3957 + 1];
        int i_4_ = 4096 / anInt3957;
        int i_5_ = i_4_ * anInt3970 >> 12;
        for (int i_6_ = 0; i_6_ < anInt3957; i_6_++)
        {
            anIntArray3966[i_6_] = i_3_;
            anIntArray3961[i_6_] = i_5_ + i_3_;
            i_3_ += i_4_;
        }
        anIntArray3966[anInt3957] = 4096;
        anIntArray3961[anInt3957] = anIntArray3961[0] + 4096;
    }

    static final void method857(int i, int i_7_, boolean bool, int i_8_, boolean bool_9_, int i_10_)
    {
        Class3.anInt84++;
        anInt3969++;
        if (!bool_9_)
        {
            Class68_Sub13_Sub27.method843(64, true);
            Class68_Sub9.method678(true, -125);
            Class68_Sub13_Sub27.method843(64, false);
        }
        Class68_Sub9.method678(bool, -127);
        if (!bool_9_)
            Class106.method1654((byte) -92);
        Class13_Sub4.method264(-1);
        if (NodeSubList.anInt2216 == 1)
        {
            int i_11_ = NodeList.anInt275;
            if (i_11_ < ScriptParameters.anInt3235 / 256)
                i_11_ = ScriptParameters.anInt3235 / 256;
            if (Object5.aBooleanArray1237[4] && i_11_ < Class11.anIntArray196[4] + 128)
                i_11_ = Class11.anIntArray196[4] + 128;
            int i_12_ = Class8.minimapInt2 + Class68_Sub13_Sub28.anInt3922 & 0x7ff;
            Class68_Sub24.method1208(i_10_, i_12_, Class68_Sub20_Sub2.anInt4188, (Player.fixZ((((Character) Class68_Sub7.localPlayer).x), GameSocket.plane, (((Character) Class68_Sub7.localPlayer).y))) - 50, 3 * i_11_ + 600, CachedItem.anInt4451, i_11_, (byte) 65);
        }
        int i_13_ = Class68_Sub7.cameraPositionX;
        int i_14_ = Class85.cameraPositionY;
        int i_15_ = Class68_Sub5.cameraPositionZ;
        int i_16_ = Class74.cameraYaw;
        int i_17_ = GameCanvas.cameraPitch;
        for (int i_18_ = 0; i_18_ < 5; i_18_++)
        {
            if (Object5.aBooleanArray1237[i_18_])
            {
                int i_19_ = (int) ((double) -Class121.anIntArray2112[i_18_] + (Math.random() * (double) (2 * Class121.anIntArray2112[i_18_] + 1)) + (Math.sin((double) (Class68_Sub13_Sub16.anIntArray3699[i_18_]) * ((double) (Class68_Sub13_Sub29.anIntArray3937[i_18_]) / 100.0)) * (double) Class11.anIntArray196[i_18_]));
                if (i_18_ == 2)
                    Class85.cameraPositionY += i_19_;
                if (i_18_ == 4)
                {
                    GameCanvas.cameraPitch += i_19_;
                    if (GameCanvas.cameraPitch < 128)
                        GameCanvas.cameraPitch = 128;
                    if (GameCanvas.cameraPitch > 383)
                        GameCanvas.cameraPitch = 383;
                }
                if (i_18_ == 1)
                    Class68_Sub5.cameraPositionZ += i_19_;
                if (i_18_ == 0)
                    Class68_Sub7.cameraPositionX += i_19_;
                if (i_18_ == 3)
                    Class74.cameraYaw = 0x7ff & Class74.cameraYaw + i_19_;
            }
        }
        Class68_Sub10.method684(-3);
        Class79.method1433(i_8_, i, i_8_ + i_7_, i + i_10_);
        Class62.method612();
        if (Class120.menuOpen || Class68_Sub25.anInt3178 < i_8_ || Class68_Sub25.anInt3178 >= i_7_ + i_8_ || i > Class92.anInt1648 || Class92.anInt1648 >= i + i_10_)
        {
            Class68_Sub19.aBoolean3072 = false;
            Class68_Sub13_Sub1.anInt3450 = 0;
        } else
        {
            Class68_Sub13_Sub1.anInt3450 = 0;
            Class68_Sub19.aBoolean3072 = true;
            int i_20_ = NPCDefinition.anInt1429;
            int i_21_ = Class111.anInt1877;
            Class68_Sub9.anInt2888 = ((i_21_ - i_20_) * (Class68_Sub25.anInt3178 - i_8_) / i_7_ + i_20_);
            int i_22_ = Animable.anInt63;
            int i_23_ = Class68_Sub13_Sub38.anInt4081;
            Class51.anInt2258 = (i_23_ - i_22_) * (Class92.anInt1648 - i) / i_10_ + i_22_;
        }
        Class49.method524(16322);
        byte i_24_ = (Class68_Sub7.method666(1) != 2 ? (byte) 1 : (byte) Class3.anInt84);
        Class79.method1445(i_8_, i, i_7_, i_10_, 0);
        Class89.method1510(Class68_Sub7.cameraPositionX, Class68_Sub5.cameraPositionZ, Class85.cameraPositionY, GameCanvas.cameraPitch, Class74.cameraYaw, NodeSub.aByteArrayArrayArray3097, Class21_Sub1.anIntArray2695, PlayerDefinition.anIntArray2182, Class7.anIntArray134, Login.anIntArray1512, Class68_Sub20_Sub16.anIntArray4410, GameSocket.plane + 1, i_24_, (((Character) Class68_Sub7.localPlayer).x) >> 7, (((Character) Class68_Sub7.localPlayer).y) >> 7);
        Class49.method524(16322);
        Class115.method1707();
        Class68_Sub13_Sub39.method904(i_10_, i_7_, i_8_, 256, i, 256, (byte) -32);
        Class68_Sub4.method659(113, i_7_, i, i_8_, 256, i_10_, 256);
        ((Class90) Class62.anInterface4_1159).method1522(Class109.anInt1846, 0);
        CachedItem.method1184(i_10_, i_8_, i, i_7_, -17234);
        Class68_Sub5.cameraPositionZ = i_15_;
        Class74.cameraYaw = i_16_;
        Class68_Sub7.cameraPositionX = i_13_;
        Class85.cameraPositionY = i_14_;
        GameCanvas.cameraPitch = i_17_;
        if (Class68_Sub13_Sub28.aBoolean3921 && Class68_Sub9.method679(true, false, (byte) 71) == 0)
            Class68_Sub13_Sub28.aBoolean3921 = false;
        if (Class68_Sub13_Sub28.aBoolean3921)
        {
            Class79.method1445(i_8_, i, i_7_, i_10_, 0);
            Class74.method1381(false, Class68_Sub13_Sub19.aClass100_3744, -16678);
        }
        if (!bool_9_ && !Class68_Sub13_Sub28.aBoolean3921 && !Class120.menuOpen && Class68_Sub25.anInt3178 >= i_8_ && Class68_Sub25.anInt3178 < i_8_ + i_7_ && Class92.anInt1648 >= i && Class92.anInt1648 < i_10_ + i)
            Class20.method323(i_8_, i, i_10_, Class92.anInt1648, !bool, i_7_, Class68_Sub25.anInt3178);
    }

    static final int method858(int i, MutableString class100)
    {
        try
        {
            anInt3974++;
            if (i != 64)
                return 54;
            if (class100.getLength() == 0)
                return -1;
            for (int i_25_ = 0; i_25_ < ((Class91) Class102.aClass91_1758).anInt1639; i_25_++)
            {
                if (((Class91) Class102.aClass91_1758).aClass100Array1637[i_25_].method1623(-577, class100))
                    return i_25_;
            }
            return -1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("se.H(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method859(int i, int i_26_, int i_27_, int i_28_, Class68_Sub18 class68_sub18, int i_29_)
    {
        do
        {
            try
            {
                anInt3976++;
                if (((Class68_Sub18) class68_sub18).anInt3044 != -1 || (((Class68_Sub18) class68_sub18).anIntArray3055 != null))
                {
                    int i_30_ = 0;
                    if (i_29_ > ((Class68_Sub18) class68_sub18).anInt3064)
                        i_30_ += (i_29_ - ((Class68_Sub18) class68_sub18).anInt3064);
                    else if (((Class68_Sub18) class68_sub18).anInt3066 > i_29_)
                        i_30_ += (((Class68_Sub18) class68_sub18).anInt3066 - i_29_);
                    if (((Class68_Sub18) class68_sub18).anInt3040 >= i_27_)
                    {
                        if (i_27_ < ((Class68_Sub18) class68_sub18).anInt3053)
                            i_30_ += (((Class68_Sub18) class68_sub18).anInt3053 - i_27_);
                    } else
                        i_30_ += (i_27_ - ((Class68_Sub18) class68_sub18).anInt3040);
                    if (((Class68_Sub18) class68_sub18).anInt3059 == 0 || (((Class68_Sub18) class68_sub18).anInt3059 < i_30_ - 64) || Class68_Sub20_Sub15.anInt4401 == 0 || (((Class68_Sub18) class68_sub18).anInt3041 != i_26_))
                    {
                        if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042) != null)
                        {
                            NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042);
                            ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = null;
                        }
                        if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051) != null)
                        {
                            NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051);
                            ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051 = null;
                        }
                    } else
                    {
                        i_30_ -= 64;
                        if (i >= 77)
                        {
                            if (i_30_ < 0)
                                i_30_ = 0;
                            int i_31_ = ((((Class68_Sub18) class68_sub18).anInt3059 - i_30_) * Class68_Sub20_Sub15.anInt4401 / (((Class68_Sub18) class68_sub18).anInt3059));
                            if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042) == null)
                            {
                                if (((Class68_Sub18) class68_sub18).anInt3044 >= 0)
                                {
                                    Class46 class46 = (Class46.method509(Class78.aClass21_Sub1_1390, (((Class68_Sub18) class68_sub18).anInt3044), 0));
                                    if (class46 != null)
                                    {
                                        Class68_Sub11_Sub1 class68_sub11_sub1 = (class46.method508().method685(NodeSub.aClass95_3081));
                                        Class68_Sub28_Sub3 class68_sub28_sub3 = (Class68_Sub28_Sub3.method1299(class68_sub11_sub1, 100, i_31_));
                                        class68_sub28_sub3.method1272(-1);
                                        NPCDefinition.aClass68_Sub28_Sub4_1420.method1316(class68_sub28_sub3);
                                        ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = class68_sub28_sub3;
                                    }
                                }
                            } else
                                ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042.method1279(i_31_);
                            if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051) != null)
                            {
                                ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051.method1279(i_31_);
                                if (!((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051.hasNext())
                                    ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051 = null;
                            } else
                            {
                                if ((((Class68_Sub18) class68_sub18).anIntArray3055) == null || (((Class68_Sub18) class68_sub18).anInt3056 -= i_28_) > 0)
                                    break;
                                int i_32_ = (int) (Math.random() * (double) (((Class68_Sub18) class68_sub18).anIntArray3055).length);
                                Class46 class46 = Class46.method509((Class78.aClass21_Sub1_1390), (((Class68_Sub18) class68_sub18).anIntArray3055[i_32_]), 0);
                                if (class46 == null)
                                    break;
                                Class68_Sub11_Sub1 class68_sub11_sub1 = (class46.method508().method685(NodeSub.aClass95_3081));
                                Class68_Sub28_Sub3 class68_sub28_sub3 = (Class68_Sub28_Sub3.method1299(class68_sub11_sub1, 100, i_31_));
                                class68_sub28_sub3.method1272(0);
                                NPCDefinition.aClass68_Sub28_Sub4_1420.method1316(class68_sub28_sub3);
                                ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051 = class68_sub28_sub3;
                                ((Class68_Sub18) class68_sub18).anInt3056 = ((int) (Math.random() * (double) ((((Class68_Sub18) class68_sub18).anInt3061) - (((Class68_Sub18) class68_sub18).anInt3046))) + (((Class68_Sub18) class68_sub18).anInt3046));
                            }
                        }
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("se.E(" + i + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + (class68_sub18 != null ? "{...}" : "null") + ',' + i_29_ + ')'));
            }
            break;
        } while (false);
    }

    final void method700(Stream class68_sub14, int i, int i_33_)
    {
        while_151_: do
        {
            try
            {
                if (i_33_ != -1)
                    anIntArray3971 = null;
                anInt3962++;
                int i_34_ = i;
                do
                {
                    if (i_34_ != 0)
                    {
                        if (i_34_ != 1)
                        {
                            if (i_34_ == 2)
                                break;
                            break while_151_;
                        }
                    } else
                    {
                        anInt3957 = class68_sub14.readUByte();
                        return;
                    }
                    anInt3970 = class68_sub14.readUShort();
                    return;
                } while (false);
                anInt3960 = class68_sub14.readUByte();
                break;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("se.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_33_ + ')'));
            }
        } while (false);
    }

    public static void method860(byte i)
    {
        if (i == 120)
        {
            anIntArray3972 = null;
            aClass92_Sub1Array3975 = null;
            aClass16_3965 = null;
            aClass100_3978 = null;
            anIntArray3971 = null;
            aClass21_Sub1_3973 = null;
        }
    }

    final int[] method698(byte i, int i_35_)
    {
        anInt3958++;
        if (i != -61)
            method858(-125, null);
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_35_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_36_ = Class13_Sub3.anIntArray2674[i_35_];
            if (anInt3960 == 0)
            {
                int i_37_ = 0;
                for (int i_38_ = 0; i_38_ < anInt3957; i_38_++)
                {
                    if (anIntArray3966[i_38_] <= i_36_ && i_36_ < anIntArray3966[i_38_ + 1])
                    {
                        if (i_36_ < anIntArray3961[i_38_])
                            i_37_ = 4096;
                        break;
                    }
                }
                Class39.method464(is, 0, Class68_Sub13_Sub19.anInt3748, i_37_);
            } else
            {
                for (int i_39_ = 0; i_39_ < Class68_Sub13_Sub19.anInt3748; i_39_++)
                {
                    int i_40_ = 0;
                    int i_41_ = 0;
                    int i_42_ = Class68_Sub13_Sub3.anIntArray3481[i_39_];
                    int i_43_ = anInt3960;
                    while_152_: do
                    {
                        do
                        {
                            if (i_43_ != 1)
                            {
                                if (i_43_ != 2)
                                {
                                    if (i_43_ == 3)
                                        break;
                                    break while_152_;
                                }
                            } else
                            {
                                i_41_ = i_42_;
                                break while_152_;
                            }
                            i_41_ = (i_42_ + (i_36_ - 4096) >> 1) + 2048;
                            break while_152_;
                        } while (false);
                        i_41_ = (i_42_ - i_36_ >> 1) + 2048;
                    } while (false);
                    for (i_43_ = 0; i_43_ < anInt3957; i_43_++)
                    {
                        if (anIntArray3966[i_43_] <= i_41_ && anIntArray3966[i_43_ + 1] > i_41_)
                        {
                            if (i_41_ < anIntArray3961[i_43_])
                                i_40_ = 4096;
                            break;
                        }
                    }
                    is[i_39_] = i_40_;
                }
            }
        }
        return is;
    }

    static final void method861(byte i)
    {
        Class68_Sub13_Sub10.method742(5, true);
        Login.method1477(5, -120);
        Class44.method484((byte) 66, 5);
        Animation.method1732(-1, 5);
        Class28.method393(5, true);
        anInt3968++;
        Class9.method210(5, (byte) 35);
        Object4.method576(5, 0);
        Class68_Sub20_Sub12.method1150(9, 5);
        if (i >= -4)
            method857(-68, 94, false, -113, false, 93);
        Login.method1470(121, 5);
        Class68_Sub20_Sub8.method1086(0, 5);
        Class68_Sub20_Sub8.method1091(190, 5);
        Class104.method1646(0, 50);
        Class68_Sub13_Sub26.method827(-127, 5);
        MRUNodes.method1569(5, 95);
        Class108.aClass98_1829.method1570(-18767, 5);
    }

    static
    {
        anIntArray3971 = new int[5];
        anInt3977 = -1;
        aClass100_3978 = (Class112.makeMutableString(43, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3"));
    }
}
