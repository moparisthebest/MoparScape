/* Class68_Sub13_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class68_Sub13_Sub27 extends Class68_Sub13
{
    static int anInt3889;
    private int anInt3890;
    static int anInt3891;
    static int anInt3892;
    static int anInt3893;
    private int anInt3894 = 1024;
    static MRUNodes aClass98_3895;
    private int anInt3896 = 2048;
    static int anInt3897;
    private int anInt3898;
    private int anInt3899 = 1024;
    private int anInt3900;
    private int anInt3901 = 0;
    static int anInt3902;
    static MutableString aClass100_3903;
    static MutableString aClass100_3904 = Class112.makeMutableString(43, "<img=0>");
    static int anInt3905;
    static int anInt3906;
    static byte[][] allocatedHugeBuffers;
    private int anInt3908;
    private int anInt3909;
    private int anInt3910;
    static int anInt3911;
    static int anInt3912;
    static int anInt3913;
    static Class65 aClass65_3914;
    static float aFloat3915;
    static int anInt3916;
    static int language;
    static MutableString[] aClass100Array3918;

    static final int method836(int i)
    {
        if (i != 0)
            return 29;
        anInt3897++;
        return 16;
    }

    final void method700(Stream class68_sub14, int i, int i_0_)
    {
        do
        {
            try
            {
                anInt3912++;
                int i_1_ = i;
                while_127_: do
                {
                    while_126_: do
                    {
                        while_125_: do
                        {
                            while_124_: do
                            {
                                while_123_: do
                                {
                                    while_122_: do
                                    {
                                        while_121_: do
                                        {
                                            do
                                            {
                                                if (i_1_ != 0)
                                                {
                                                    if (i_1_ != 1)
                                                    {
                                                        if (i_1_ != 2)
                                                        {
                                                            if (i_1_ != 3)
                                                            {
                                                                if (i_1_ != 4)
                                                                {
                                                                    if (i_1_ != 5)
                                                                    {
                                                                        if (i_1_ != 6)
                                                                        {
                                                                            if (i_1_ != 7)
                                                                            {
                                                                                if (i_1_ == 8)
                                                                                    break while_126_;
                                                                                break while_127_;
                                                                            }
                                                                        } else
                                                                            break while_124_;
                                                                        break while_125_;
                                                                    }
                                                                } else
                                                                    break while_122_;
                                                                break while_123_;
                                                            }
                                                        } else
                                                            break;
                                                        break while_121_;
                                                    }
                                                } else
                                                {
                                                    anInt3908 = (class68_sub14.readUByte());
                                                    break while_127_;
                                                }
                                                anInt3890 = (class68_sub14.readUShort());
                                                break while_127_;
                                            } while (false);
                                            anInt3896 = class68_sub14.readUShort();
                                            break while_127_;
                                        } while (false);
                                        anInt3910 = (class68_sub14.readUShort());
                                        break while_127_;
                                    } while (false);
                                    anInt3900 = class68_sub14.readUShort();
                                    break while_127_;
                                } while (false);
                                anInt3898 = class68_sub14.readUShort();
                                break while_127_;
                            } while (false);
                            anInt3901 = class68_sub14.readUByte();
                            break while_127_;
                        } while (false);
                        anInt3894 = class68_sub14.readUShort();
                        break while_127_;
                    } while (false);
                    anInt3899 = class68_sub14.readUShort();
                } while (false);
                if (i_0_ == -1)
                    break;
                method839(-128, 32, 28, -22, -29, (byte) -27);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("pi.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
            }
            break;
        } while (false);
    }

    public static void method837(int i)
    {
        aClass100_3903 = null;
        aClass65_3914 = null;
        aClass98_3895 = null;
        allocatedHugeBuffers = null;
        aClass100Array3918 = null;
        if (i != 128)
            anInt3913 = -101;
        aClass100_3904 = null;
    }

    static final void method838(int i, boolean bool, Widget class45)
    {
        do
        {
            try
            {
                anInt3902++;
                int i_2_ = (((Widget) class45).anInt888 == 0 ? ((Widget) class45).anInt892 : ((Widget) class45).anInt888);
                int i_3_ = (((Widget) class45).anInt794 == 0 ? ((Widget) class45).anInt873 : ((Widget) class45).anInt794);
                Class68_Sub18.method994(((Widget) class45).anInt792, i_3_, bool, false, i_2_, (Class68_Sub13_Sub36.widgetCache[(((Widget) class45).anInt792 >> 16)]));
                if (((Widget) class45).widgetCache != null)
                    Class68_Sub18.method994(((Widget) class45).anInt792, i_3_, bool, false, i_2_, (((Widget) class45).widgetCache));
                Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1684((long) (((Widget) class45).anInt792), -78));
                if (class68_sub3 != null)
                    Class11.method234((byte) 99, i_3_, bool, i_2_, ((Class68_Sub3) class68_sub3).anInt2805);
                if (i == -1)
                    break;
                method842(28, null, -95);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("pi.F(" + i + ',' + bool + ',' + (class45 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static final void method839(int i, int i_4_, int i_5_, int i_6_, int i_7_, byte i_8_)
    {
        if (i <= Class51.anInt2257 && Class35.anInt605 <= i_6_)
        {
            boolean bool;
            if (GroundData.anInt677 <= i_7_)
            {
                if (NodeCache.anInt1920 >= i_7_)
                    bool = true;
                else
                {
                    i_7_ = NodeCache.anInt1920;
                    bool = false;
                }
            } else
            {
                bool = false;
                i_7_ = GroundData.anInt677;
            }
            boolean bool_9_;
            if (i_4_ < GroundData.anInt677)
            {
                i_4_ = GroundData.anInt677;
                bool_9_ = false;
            } else if (i_4_ <= NodeCache.anInt1920)
                bool_9_ = true;
            else
            {
                i_4_ = NodeCache.anInt1920;
                bool_9_ = false;
            }
            if (i < Class35.anInt605)
                i = Class35.anInt605;
            else
                Class34.method416(i_4_, (byte) -17, i_5_, Class68_Sub22.anIntArrayArray3134[i++], i_7_);
            if (Class51.anInt2257 < i_6_)
                i_6_ = Class51.anInt2257;
            else
                Class34.method416(i_4_, (byte) -17, i_5_, Class68_Sub22.anIntArrayArray3134[i_6_--], i_7_);
            if (bool_9_ && bool)
            {
                for (int i_10_ = i; i_6_ >= i_10_; i_10_++)
                {
                    int[] is = Class68_Sub22.anIntArrayArray3134[i_10_];
                    is[i_4_] = is[i_7_] = i_5_;
                }
            } else if (!bool_9_)
            {
                if (bool)
                {
                    for (int i_11_ = i; i_11_ <= i_6_; i_11_++)
                        Class68_Sub22.anIntArrayArray3134[i_11_][i_7_] = i_5_;
                }
            } else
            {
                for (int i_12_ = i; i_12_ <= i_6_; i_12_++)
                    Class68_Sub22.anIntArrayArray3134[i_12_][i_4_] = i_5_;
            }
        }
        anInt3911++;
        if (i_8_ < 82)
            method840(28, -10, -23, 0);
    }

    static final boolean method840(int i, int i_13_, int i_14_, int i_15_)
    {
        if (!Class21.method361(i, i_13_, i_14_))
            return false;
        int i_16_ = i_13_ << 7;
        int i_17_ = i_14_ << 7;
        int i_18_ = (Class68_Sub20_Sub12.intGroundArray[i][i_13_][i_14_] - 1);
        int i_19_ = i_18_ - 120;
        int i_20_ = i_18_ - 230;
        int i_21_ = i_18_ - 238;
        if (i_15_ < 16)
        {
            if (i_15_ == 1)
            {
                if (i_16_ > Class25.anInt518)
                {
                    if (!Login.method1478(i_16_, i_18_, i_17_))
                        return false;
                    if (!Login.method1478(i_16_, i_18_, i_17_ + 128))
                        return false;
                }
                if (i > 0)
                {
                    if (!Login.method1478(i_16_, i_19_, i_17_))
                        return false;
                    if (!Login.method1478(i_16_, i_19_, i_17_ + 128))
                        return false;
                }
                if (!Login.method1478(i_16_, i_20_, i_17_))
                    return false;
                if (!Login.method1478(i_16_, i_20_, i_17_ + 128))
                    return false;
                return true;
            }
            if (i_15_ == 2)
            {
                if (i_17_ < Class68_Sub20_Sub12.anInt4357)
                {
                    if (!Login.method1478(i_16_, i_18_, i_17_ + 128))
                        return false;
                    if (!Login.method1478(i_16_ + 128, i_18_, i_17_ + 128))
                        return false;
                }
                if (i > 0)
                {
                    if (!Login.method1478(i_16_, i_19_, i_17_ + 128))
                        return false;
                    if (!Login.method1478(i_16_ + 128, i_19_, i_17_ + 128))
                        return false;
                }
                if (!Login.method1478(i_16_, i_20_, i_17_ + 128))
                    return false;
                if (!Login.method1478(i_16_ + 128, i_20_, i_17_ + 128))
                    return false;
                return true;
            }
            if (i_15_ == 4)
            {
                if (i_16_ < Class25.anInt518)
                {
                    if (!Login.method1478(i_16_ + 128, i_18_, i_17_))
                        return false;
                    if (!Login.method1478(i_16_ + 128, i_18_, i_17_ + 128))
                        return false;
                }
                if (i > 0)
                {
                    if (!Login.method1478(i_16_ + 128, i_19_, i_17_))
                        return false;
                    if (!Login.method1478(i_16_ + 128, i_19_, i_17_ + 128))
                        return false;
                }
                if (!Login.method1478(i_16_ + 128, i_20_, i_17_))
                    return false;
                if (!Login.method1478(i_16_ + 128, i_20_, i_17_ + 128))
                    return false;
                return true;
            }
            if (i_15_ == 8)
            {
                if (i_17_ > Class68_Sub20_Sub12.anInt4357)
                {
                    if (!Login.method1478(i_16_, i_18_, i_17_))
                        return false;
                    if (!Login.method1478(i_16_ + 128, i_18_, i_17_))
                        return false;
                }
                if (i > 0)
                {
                    if (!Login.method1478(i_16_, i_19_, i_17_))
                        return false;
                    if (!Login.method1478(i_16_ + 128, i_19_, i_17_))
                        return false;
                }
                if (!Login.method1478(i_16_, i_20_, i_17_))
                    return false;
                if (!Login.method1478(i_16_ + 128, i_20_, i_17_))
                    return false;
                return true;
            }
        }
        if (!Login.method1478(i_16_ + 64, i_21_, i_17_ + 64))
            return false;
        if (i_15_ == 16)
        {
            if (!Login.method1478(i_16_, i_20_, i_17_ + 128))
                return false;
            return true;
        }
        if (i_15_ == 32)
        {
            if (!Login.method1478(i_16_ + 128, i_20_, i_17_ + 128))
                return false;
            return true;
        }
        if (i_15_ == 64)
        {
            if (!Login.method1478(i_16_ + 128, i_20_, i_17_))
                return false;
            return true;
        }
        if (i_15_ == 128)
        {
            if (!Login.method1478(i_16_, i_20_, i_17_))
                return false;
            return true;
        }
        return true;
    }

    private final void method841(Random random, int i, int i_22_, int[][] is, int i_23_, int i_24_, int i_25_)
    {
        try
        {
            anInt3905++;
            int i_26_ = (anInt3899 > 0 ? 4096 - Class68_Sub20_Sub10.method1114(anInt3899, (byte) 70, random) : 4096);
            if (i_25_ != 1)
                anInt3913 = -98;
            int i_27_ = anInt3909 * anInt3894 >> 12;
            int i_28_ = (anInt3909 - (i_27_ <= 0 ? 0 : Class68_Sub20_Sub10.method1114(i_27_, (byte) 70, random)));
            if (i_23_ >= Class68_Sub13_Sub19.anInt3748)
                i_23_ -= Class68_Sub13_Sub19.anInt3748;
            if (i_28_ > 0)
            {
                if (i_24_ > 0 && i_22_ > 0)
                {
                    int i_29_ = i_22_ / 2;
                    int i_30_ = i_24_ / 2;
                    int i_31_ = i_28_ <= i_29_ ? i_28_ : i_29_;
                    int i_32_ = i_30_ >= i_28_ ? i_28_ : i_30_;
                    int i_33_ = i_23_ + i_31_;
                    int i_34_ = i_22_ - i_31_ * 2;
                    for (int i_35_ = 0; i_35_ < i_24_; i_35_++)
                    {
                        int[] is_36_ = is[i_35_ + i];
                        if (i_35_ < i_32_)
                        {
                            int i_37_ = i_35_ * i_26_ / i_32_;
                            if (anInt3901 == 0)
                            {
                                for (int i_38_ = 0; i_31_ > i_38_; i_38_++)
                                {
                                    int i_39_ = i_26_ * i_38_ / i_31_;
                                    is_36_[Class120.method1746((Class30.anInt543), i_23_ + i_38_)] = is_36_[(Class120.method1746(i_23_ + i_22_ - 1 - i_38_, Class30.anInt543))] = i_37_ * i_39_ >> 12;
                                }
                            } else
                            {
                                for (int i_40_ = 0; i_40_ < i_31_; i_40_++)
                                {
                                    int i_41_ = i_40_ * i_26_ / i_31_;
                                    is_36_[Class120.method1746(i_40_ + i_23_, (Class30.anInt543))] = is_36_[(Class120.method1746(i_22_ + (i_23_ - (i_40_ + 1)), Class30.anInt543))] = i_41_ >= i_37_ ? i_37_ : i_41_;
                                }
                            }
                            if (Class68_Sub13_Sub19.anInt3748 < i_33_ + i_34_)
                            {
                                int i_42_ = Class68_Sub13_Sub19.anInt3748 - i_33_;
                                Class39.method464(is_36_, i_33_, i_42_, i_37_);
                                Class39.method464(is_36_, 0, i_34_ - i_42_, i_37_);
                            } else
                                Class39.method464(is_36_, i_33_, i_34_, i_37_);
                        } else
                        {
                            int i_43_ = i_24_ - i_35_ - 1;
                            if (i_32_ > i_43_)
                            {
                                int i_44_ = i_43_ * i_26_ / i_32_;
                                if (anInt3901 != 0)
                                {
                                    for (int i_45_ = 0; i_31_ > i_45_; i_45_++)
                                    {
                                        int i_46_ = i_26_ * i_45_ / i_31_;
                                        is_36_[Class120.method1746((Class30.anInt543), (i_45_ + i_23_))] = is_36_[(Class120.method1746(Class30.anInt543, (i_22_ + i_23_ - i_45_ - 1)))] = i_44_ <= i_46_ ? i_44_ : i_46_;
                                    }
                                } else
                                {
                                    for (int i_47_ = 0; i_31_ > i_47_; i_47_++)
                                    {
                                        int i_48_ = i_47_ * i_26_ / i_31_;
                                        is_36_[Class120.method1746((Class30.anInt543), (i_23_ + i_47_))] = is_36_[(Class120.method1746((i_23_ - i_47_ - (1 - i_22_)), Class30.anInt543))] = i_44_ * i_48_ >> 12;
                                    }
                                }
                                if (Class68_Sub13_Sub19.anInt3748 < i_34_ + i_33_)
                                {
                                    int i_49_ = (Class68_Sub13_Sub19.anInt3748 - i_33_);
                                    Class39.method464(is_36_, i_33_, i_49_, i_44_);
                                    Class39.method464(is_36_, 0, i_34_ - i_49_, i_44_);
                                } else
                                    Class39.method464(is_36_, i_33_, i_34_, i_44_);
                            } else
                            {
                                for (int i_50_ = 0; i_31_ > i_50_; i_50_++)
                                    is_36_[Class120.method1746((Class30.anInt543), i_23_ + i_50_)] = is_36_[Class120.method1746((Class30.anInt543), (-1 - i_50_ + i_23_ + i_22_))] = i_50_ * i_26_ / i_31_;
                                if (i_33_ + i_34_ <= Class68_Sub13_Sub19.anInt3748)
                                    Class39.method464(is_36_, i_33_, i_34_, i_26_);
                                else
                                {
                                    int i_51_ = (Class68_Sub13_Sub19.anInt3748 - i_33_);
                                    Class39.method464(is_36_, i_33_, i_51_, i_26_);
                                    Class39.method464(is_36_, 0, i_34_ - i_51_, i_26_);
                                }
                            }
                        }
                    }
                }
            } else if (i_23_ + i_22_ <= Class68_Sub13_Sub19.anInt3748)
            {
                for (int i_52_ = 0; i_52_ < i_24_; i_52_++)
                    Class39.method464(is[i + i_52_], i_23_, i_22_, i_26_);
            } else
            {
                int i_53_ = Class68_Sub13_Sub19.anInt3748 - i_23_;
                for (int i_54_ = 0; i_24_ > i_54_; i_54_++)
                {
                    int[] is_55_ = is[i_54_ + i];
                    Class39.method464(is_55_, i_23_, i_53_, i_26_);
                    Class39.method464(is_55_, 0, i_22_ - i_53_, i_26_);
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("pi.D(" + (random != null ? "{...}" : "null") + ',' + i + ',' + i_22_ + ',' + (is != null ? "{...}" : "null") + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
        }
    }

    static final MutableString method842(int i, byte[] is, int i_57_)
    {
        try
        {
            anInt3906++;
            MutableString class100 = new MutableString();
            ((MutableString) class100).data = new byte[i];
            ((MutableString) class100).length = 0;
            for (int i_58_ = i_57_; i_57_ + i > i_58_; i_58_++)
            {
                if (is[i_58_] != 0)
                    ((MutableString) class100).data[((MutableString) class100).length++] = is[i_58_];
            }
            return class100;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("pi.E(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_57_ + ')'));
        }
    }

    public Class68_Sub13_Sub27()
    {
        super(0, true);
        anInt3890 = 1024;
        anInt3900 = 819;
        anInt3898 = 1024;
        anInt3908 = 0;
        anInt3910 = 409;
    }

    static final void method843(int i, boolean bool)
    {
        anInt3892++;
        if ((((Character) Class68_Sub7.localPlayer).x >> 7 == Class95.destinationX) && (Class75_Sub2.destinationY == (((Character) Class68_Sub7.localPlayer).y) >> 7))
            Class95.destinationX = 0;
        int i_59_ = client.localPlayerCount;
        if (bool)
            i_59_ = 1;
        for (int i_60_ = 0; i_59_ > i_60_; i_60_++)
        {
            long l;
            Player class1_sub6_sub2;
            if (!bool)
            {
                class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[Class85.localPlayerIndices[i_60_]]);
                l = (long) Class85.localPlayerIndices[i_60_] << 32;
            } else
            {
                l = 8791798054912L;
                class1_sub6_sub2 = Class68_Sub7.localPlayer;
            }
            if (class1_sub6_sub2 != null && class1_sub6_sub2.hasDefinition())
            {
                ((Player) class1_sub6_sub2).aBoolean3426 = false;
                if ((MutableString.aBoolean2264 && client.localPlayerCount > 200 || client.localPlayerCount > 50) && !bool && (((Character) class1_sub6_sub2).anInt2526 == ((Character) class1_sub6_sub2).anInt2532))
                    ((Player) class1_sub6_sub2).aBoolean3426 = true;
                int i_61_ = ((Character) class1_sub6_sub2).x >> 7;
                int i_62_ = ((Character) class1_sub6_sub2).y >> 7;
                if (i_61_ >= 0 && i_61_ < 104 && i_62_ >= 0 && i_62_ < 104)
                {
                    if ((((Player) class1_sub6_sub2).model) != null && (((Player) class1_sub6_sub2).anInt3414 <= Class68_Sub3.loopCycle) && (((Player) class1_sub6_sub2).anInt3441 > Class68_Sub3.loopCycle))
                    {
                        ((Player) class1_sub6_sub2).aBoolean3426 = false;
                        ((Character) class1_sub6_sub2).anInt2584 = (Player.fixZ(((Character) class1_sub6_sub2).x, GameSocket.plane, ((Character) class1_sub6_sub2).y));
                        Class122.method1753(GameSocket.plane, ((Character) class1_sub6_sub2).x, ((Character) class1_sub6_sub2).y, ((Character) class1_sub6_sub2).anInt2584, class1_sub6_sub2, ((Character) class1_sub6_sub2).anInt2550, l, ((Player) class1_sub6_sub2).anInt3435, ((Player) class1_sub6_sub2).anInt3440, ((Player) class1_sub6_sub2).anInt3410, ((Player) class1_sub6_sub2).anInt3421);
                    } else
                    {
                        if (((Character) class1_sub6_sub2).raw_range == 1 && ((0x7f & ((Character) class1_sub6_sub2).x) == 64) && (((Character) class1_sub6_sub2).y & 0x7f) == 64)
                        {
                            if (Object2.anIntArrayArray1346[i_61_][i_62_] == Class3.anInt84)
                                continue;
                            Object2.anIntArrayArray1346[i_61_][i_62_] = Class3.anInt84;
                        }
                        ((Character) class1_sub6_sub2).anInt2584 = (Player.fixZ(((Character) class1_sub6_sub2).x, GameSocket.plane, ((Character) class1_sub6_sub2).y));
                        Class68_Sub20_Sub4.method1061(GameSocket.plane, ((Character) class1_sub6_sub2).x, ((Character) class1_sub6_sub2).y, ((Character) class1_sub6_sub2).anInt2584, ((((Character) class1_sub6_sub2).raw_range - 1) * 64) + 60, class1_sub6_sub2, ((Character) class1_sub6_sub2).anInt2550, l, ((Character) class1_sub6_sub2).aBoolean2585);
                    }
                }
            }
        }
        if (i != 64)
            language = -94;
    }

    final int[] method698(byte i, int i_63_)
    {
        anInt3891++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_63_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_64_ = 0;
            int[][] is_65_ = ((Class68_Sub13) this).aClass115_2938.method1702(-32044);
            int i_66_ = 0;
            int i_67_ = 0;
            int i_68_ = 0;
            int i_69_ = 0;
            boolean bool = true;
            boolean bool_70_ = true;
            int i_71_ = 0;
            int i_72_ = 0;
            int i_73_ = Class68_Sub13_Sub19.anInt3748 * anInt3890 >> 12;
            int i_74_ = Class68_Sub13_Sub19.anInt3748 * anInt3896 >> 12;
            int i_75_ = Ground.anInt2777 * anInt3900 >> 12;
            int i_76_ = Ground.anInt2777 * anInt3910 >> 12;
            if (i_75_ <= 1)
                return is_65_[i_63_];
            anInt3909 = Class68_Sub13_Sub19.anInt3748 / 8 * anInt3898 >> 12;
            int i_77_ = Class68_Sub13_Sub19.anInt3748 / i_73_ + 1;
            int[][] is_78_ = new int[i_77_][3];
            int[][] is_79_ = new int[i_77_][3];
            Random random = new Random((long) anInt3908);
            for (;;)
            {
                int i_80_ = (Class68_Sub20_Sub10.method1114(i_74_ - i_73_, (byte) 70, random) + i_73_);
                int i_81_ = i_80_ + i_69_;
                int i_82_ = (Class68_Sub20_Sub10.method1114(i_75_ - i_76_, (byte) 70, random) + i_76_);
                if (i_81_ > Class68_Sub13_Sub19.anInt3748)
                {
                    i_80_ = Class68_Sub13_Sub19.anInt3748 - i_69_;
                    i_81_ = Class68_Sub13_Sub19.anInt3748;
                }
                int i_83_;
                if (bool_70_)
                    i_83_ = 0;
                else
                {
                    int i_84_ = i_67_;
                    int[] is_85_ = is_79_[i_67_];
                    i_83_ = is_85_[2];
                    int i_86_ = 0;
                    int i_87_ = i_64_ + i_81_;
                    if (i_87_ < 0)
                        i_87_ += Class68_Sub13_Sub19.anInt3748;
                    if (Class68_Sub13_Sub19.anInt3748 < i_87_)
                        i_87_ -= Class68_Sub13_Sub19.anInt3748;
                    for (;;)
                    {
                        int[] is_88_ = is_79_[i_84_];
                        if (i_87_ >= is_88_[0] && i_87_ <= is_88_[1])
                            break;
                        i_86_++;
                        if (++i_84_ >= i_71_)
                            i_84_ = 0;
                    }
                    if (i_67_ != i_84_)
                    {
                        int i_89_ = i_69_ + i_64_;
                        if (i_89_ < 0)
                            i_89_ += Class68_Sub13_Sub19.anInt3748;
                        if (Class68_Sub13_Sub19.anInt3748 < i_89_)
                            i_89_ -= Class68_Sub13_Sub19.anInt3748;
                        for (int i_90_ = 1; i_90_ <= i_86_; i_90_++)
                        {
                            int[] is_91_ = is_79_[(i_90_ + i_67_) % i_71_];
                            i_83_ = Math.max(i_83_, is_91_[2]);
                        }
                        for (int i_92_ = 0; i_86_ >= i_92_; i_92_++)
                        {
                            int[] is_93_ = is_79_[(i_67_ + i_92_) % i_71_];
                            int i_94_ = is_93_[2];
                            if (i_94_ != i_83_)
                            {
                                int i_95_ = is_93_[0];
                                int i_96_ = is_93_[1];
                                int i_97_;
                                int i_98_;
                                if (i_89_ < i_87_)
                                {
                                    i_97_ = Math.max(i_89_, i_95_);
                                    i_98_ = Math.min(i_87_, i_96_);
                                } else if (i_95_ != 0)
                                {
                                    i_97_ = Math.max(i_89_, i_95_);
                                    i_98_ = Class68_Sub13_Sub19.anInt3748;
                                } else
                                {
                                    i_97_ = 0;
                                    i_98_ = Math.min(i_87_, i_96_);
                                }
                                method841(random, i_94_, i_98_ - i_97_, is_65_, i_97_ + i_68_, i_83_ - i_94_, 1);
                            }
                        }
                    }
                    i_67_ = i_84_;
                }
                if (i_82_ + i_83_ <= Ground.anInt2777)
                    bool = false;
                else
                    i_82_ = Ground.anInt2777 - i_83_;
                if (Class68_Sub13_Sub19.anInt3748 == i_81_)
                {
                    method841(random, i_83_, i_80_, is_65_, i_66_ + i_69_, i_82_, 1);
                    if (bool)
                        break;
                    bool_70_ = false;
                    int[] is_99_ = is_78_[i_72_++];
                    bool = true;
                    is_99_[2] = i_82_ + i_83_;
                    is_99_[0] = i_69_;
                    i_68_ = i_66_;
                    is_99_[1] = i_81_;
                    int[][] is_100_ = is_79_;
                    i_67_ = 0;
                    i_71_ = i_72_;
                    i_72_ = 0;
                    is_79_ = is_78_;
                    i_69_ = 0;
                    i_66_ = Class68_Sub20_Sub10.method1114((Class68_Sub13_Sub19.anInt3748), (byte) 70, random);
                    is_78_ = is_100_;
                    i_64_ = i_66_ - i_68_;
                    int i_101_ = i_64_;
                    if (i_101_ < 0)
                        i_101_ += Class68_Sub13_Sub19.anInt3748;
                    if (Class68_Sub13_Sub19.anInt3748 < i_101_)
                        i_101_ -= Class68_Sub13_Sub19.anInt3748;
                    for (;;)
                    {
                        int[] is_102_ = is_79_[i_67_];
                        if (i_101_ >= is_102_[0] && i_101_ <= is_102_[1])
                            break;
                        if (++i_67_ >= i_71_)
                            i_67_ = 0;
                    }
                } else
                {
                    int[] is_103_ = is_78_[i_72_++];
                    is_103_[1] = i_81_;
                    is_103_[2] = i_82_ + i_83_;
                    is_103_[0] = i_69_;
                    method841(random, i_83_, i_80_, is_65_, i_66_ + i_69_, i_82_, 1);
                    i_69_ = i_81_;
                }
            }
        }
        if (i != -61)
            method843(-113, true);
        return is;
    }

    final void method690(byte i)
    {
        anInt3889++;
        if (i >= -22)
            method839(-109, 82, 75, -110, -79, (byte) -79);
    }

    static
    {
        aClass100_3903 = Class112.makeMutableString(43, "floorshadows");
        allocatedHugeBuffers = new byte[50][];
        aClass98_3895 = new MRUNodes(64);
        anInt3913 = -1;
        anInt3916 = 0;
        language = 0;
        aClass100Array3918 = new MutableString[100];
    }
}
