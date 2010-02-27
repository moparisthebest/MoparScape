/* Class68_Sub13_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class68_Sub13_Sub39 extends Class68_Sub13
{
    static int anInt4092;
    static int anInt4093;
    static int anInt4094;
    static int anInt4095;
    static int anInt4096;
    static int anInt4097;
    static int anInt4098;
    private int anInt4099;
    static int[] anIntArray4100;
    private short[] aShortArray4101 = new short[512];
    private int anInt4102;
    private int anInt4103;
    static int[] anIntArray4104 = new int[32];
    private int anInt4105;
    private int anInt4106;
    static int anInt4107;
    private int anInt4108;
    static int anInt4109;
    static int anInt4110;
    private byte[] aByteArray4111;

    public Class68_Sub13_Sub39()
    {
        super(0, true);
        anInt4099 = 0;
        anInt4103 = 2048;
        anInt4106 = 5;
        anInt4108 = 2;
        anInt4105 = 1;
        aByteArray4111 = new byte[512];
        anInt4102 = 5;
    }

    final int[] method698(byte i, int i_0_)
    {
        anInt4096++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_0_);
        if (i != -61)
            return null;
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_1_ = anInt4102 * Class13_Sub3.anIntArray2674[i_0_] + 2048;
            int i_2_ = i_1_ >> 12;
            int i_3_ = i_2_ + 1;
            int i_4_ = 0;
            while_187_: for (/**/; Class68_Sub13_Sub19.anInt3748 > i_4_; i_4_++)
            {
                Class68_Sub20_Sub4.anInt4220 = Class108.anInt1831 = Class68_Sub27.anInt3221 = ClientScript.anInt4384 = 2147483647;
                int i_5_ = (anInt4106 * Class68_Sub13_Sub3.anIntArray3481[i_4_] + 2048);
                int i_6_ = i_5_ >> 12;
                int i_7_ = i_6_ + 1;
                for (int i_8_ = i_2_ - 1; i_3_ >= i_8_; i_8_++)
                {
                    int i_9_ = (aByteArray4111[0xff & (i_8_ < anInt4102 ? i_8_ : i_8_ - anInt4102)] & 0xff);
                    for (int i_10_ = i_6_ - 1; i_10_ <= i_7_; i_10_++)
                    {
                        int i_11_ = (aByteArray4111[i_9_ + (anInt4106 <= i_10_ ? i_10_ - anInt4106 : i_10_) & 0xff] & 0xff) * 2;
                        int i_12_ = -(i_10_ << 12) - aShortArray4101[i_11_++] + i_5_;
                        int i_13_ = i_1_ - ((i_8_ << 12) + aShortArray4101[i_11_]);
                        int i_14_ = anInt4105;
                        int i_15_;
                        while_183_: do
                        {
                            while_182_: do
                            {
                                while_181_: do
                                {
                                    while_180_: do
                                    {
                                        do
                                        {
                                            if (i_14_ != 1)
                                            {
                                                if (i_14_ != 3)
                                                {
                                                    if (i_14_ != 4)
                                                    {
                                                        if (i_14_ != 5)
                                                        {
                                                            if (i_14_ == 2)
                                                                break while_181_;
                                                            break while_182_;
                                                        }
                                                    } else
                                                        break;
                                                    break while_180_;
                                                }
                                            } else
                                            {
                                                i_15_ = (i_12_ * i_12_ + i_13_ * i_13_) >> 12;
                                                break while_183_;
                                            }
                                            i_12_ = i_12_ >= 0 ? i_12_ : -i_12_;
                                            i_13_ = i_13_ < 0 ? -i_13_ : i_13_;
                                            i_15_ = (i_12_ <= i_13_ ? i_13_ : i_12_);
                                            break while_183_;
                                        } while (false);
                                        i_12_ = (int) (4096.0 * (Math.sqrt((double) ((float) ((i_12_ >= 0) ? i_12_ : -i_12_) / 4096.0F))));
                                        i_13_ = (int) (4096.0 * (Math.sqrt((double) ((float) ((i_13_ < 0) ? -i_13_ : i_13_) / 4096.0F))));
                                        i_15_ = i_13_ + i_12_;
                                        i_15_ = i_15_ * i_15_ >> 12;
                                        break while_183_;
                                    } while (false);
                                    i_12_ *= i_12_;
                                    i_13_ *= i_13_;
                                    i_15_ = (int) (4096.0 * (Math.sqrt(Math.sqrt((double) ((float) (i_12_ + i_13_) / 1.6777216E7F)))));
                                    break while_183_;
                                } while (false);
                                i_15_ = ((i_12_ >= 0 ? i_12_ : -i_12_) - (i_13_ >= 0 ? i_13_ : i_13_));
                                break while_183_;
                            } while (false);
                            i_15_ = (int) (4096.0 * (Math.sqrt((double) ((float) (i_13_ * i_13_ + (i_12_ * i_12_)) / 1.6777216E7F))));
                        } while (false);
                        if (i_15_ >= Class68_Sub20_Sub4.anInt4220)
                        {
                            if (Class108.anInt1831 <= i_15_)
                            {
                                if (Class68_Sub27.anInt3221 <= i_15_)
                                {
                                    if (ClientScript.anInt4384 > i_15_)
                                        ClientScript.anInt4384 = i_15_;
                                } else
                                {
                                    ClientScript.anInt4384 = Class68_Sub27.anInt3221;
                                    Class68_Sub27.anInt3221 = i_15_;
                                }
                            } else
                            {
                                ClientScript.anInt4384 = Class68_Sub27.anInt3221;
                                Class68_Sub27.anInt3221 = Class108.anInt1831;
                                Class108.anInt1831 = i_15_;
                            }
                        } else
                        {
                            ClientScript.anInt4384 = Class68_Sub27.anInt3221;
                            Class68_Sub27.anInt3221 = Class108.anInt1831;
                            Class108.anInt1831 = Class68_Sub20_Sub4.anInt4220;
                            Class68_Sub20_Sub4.anInt4220 = i_15_;
                        }
                    }
                }
                int i_16_ = anInt4108;
                while_185_: do
                {
                    while_184_: do
                    {
                        do
                        {
                            if (i_16_ != 0)
                            {
                                if (i_16_ != 1)
                                {
                                    if (i_16_ != 3)
                                    {
                                        if (i_16_ != 4)
                                        {
                                            if (i_16_ == 2)
                                                break while_185_;
                                            continue while_187_;
                                        }
                                    } else
                                        break;
                                    break while_184_;
                                }
                            } else
                            {
                                is[i_4_] = Class68_Sub20_Sub4.anInt4220;
                                continue while_187_;
                            }
                            is[i_4_] = Class108.anInt1831;
                            continue while_187_;
                        } while (false);
                        is[i_4_] = Class68_Sub27.anInt3221;
                        continue while_187_;
                    } while (false);
                    is[i_4_] = ClientScript.anInt4384;
                    continue while_187_;
                } while (false);
                is[i_4_] = Class108.anInt1831 - Class68_Sub20_Sub4.anInt4220;
            }
        }
        return is;
    }

    static final void method901(byte i)
    {
        int i_17_ = 102 / ((i + 71) / 38);
        if (Object3.anInt940 == 2)
        {
            if (Class68_Sub25.anInt3178 == Class13_Sub4.anInt2684 && Class68_Sub13_Sub16.anInt3707 == Class92.anInt1648)
            {
                Object3.anInt940 = 0;
                Class68_Sub20_Sub8.method1083((byte) -126, (Class68_Sub13_Sub21.menuOptionsCount - 1));
            }
        } else if (Class68_Sub13_Sub37.anInt4079 == Class68_Sub25.anInt3178 && Class92.anInt1648 == Class125.anInt2175)
        {
            Object3.anInt940 = 0;
            Class68_Sub20_Sub8.method1083((byte) 102, Class68_Sub13_Sub21.menuOptionsCount - 1);
        } else
        {
            Class68_Sub13_Sub16.anInt3707 = Class125.anInt2175;
            Class13_Sub4.anInt2684 = Class68_Sub13_Sub37.anInt4079;
            Object3.anInt940 = 2;
        }
        anInt4097++;
    }

    public static void method902(int i)
    {
        anIntArray4104 = null;
        if (i == -1)
            anIntArray4100 = null;
    }

    final void method700(Stream class68_sub14, int i, int i_18_)
    {
        do
        {
            try
            {
                anInt4095++;
                int i_19_ = i;
                while_192_: do
                {
                    while_191_: do
                    {
                        while_190_: do
                        {
                            while_189_: do
                            {
                                while_188_: do
                                {
                                    do
                                    {
                                        if (i_19_ != 0)
                                        {
                                            if (i_19_ != 1)
                                            {
                                                if (i_19_ != 2)
                                                {
                                                    if (i_19_ != 3)
                                                    {
                                                        if (i_19_ != 4)
                                                        {
                                                            if (i_19_ != 5)
                                                            {
                                                                if (i_19_ == 6)
                                                                    break while_191_;
                                                                break while_192_;
                                                            }
                                                        } else
                                                            break while_189_;
                                                        break while_190_;
                                                    }
                                                } else
                                                    break;
                                                break while_188_;
                                            }
                                        } else
                                        {
                                            anInt4106 = anInt4102 = class68_sub14.readUByte();
                                            break while_192_;
                                        }
                                        anInt4099 = class68_sub14.readUByte();
                                        break while_192_;
                                    } while (false);
                                    anInt4103 = class68_sub14.readUShort();
                                    break while_192_;
                                } while (false);
                                anInt4108 = class68_sub14.readUByte();
                                break while_192_;
                            } while (false);
                            anInt4105 = class68_sub14.readUByte();
                            break while_192_;
                        } while (false);
                        anInt4106 = class68_sub14.readUByte();
                        break while_192_;
                    } while (false);
                    anInt4102 = class68_sub14.readUByte();
                } while (false);
                if (i_18_ == -1)
                    break;
                method905(127, -1, 114);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("wi.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_18_ + ')'));
            }
            break;
        } while (false);
    }

    final void method690(byte i)
    {
        aByteArray4111 = Class68_Sub13_Sub37.method894((byte) 14, anInt4099);
        anInt4098++;
        if (i < -22)
            method906(-1632225748);
    }

    static final void method903(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_)
    {
        anInt4094++;
        int i_30_ = i_20_ - i_25_;
        int i_31_ = i_29_ - i_21_;
        boolean bool;
        if (Class68_Sub13_Sub36.anInt4035 <= 0 || Class68_Sub13_Sub36.anInt4035 % 10 >= 5)
            bool = false;
        else
            bool = true;
        int i_32_ = 983040 / i_27_;
        int i_33_ = 983040 / i;
        for (int i_34_ = -i_32_; i_30_ + i_32_ > i_34_; i_34_++)
        {
            int i_35_ = i_22_ + i_27_ * i_34_ >> 16;
            int i_36_ = i_22_ + i_27_ * (i_34_ + 1) >> 16;
            int i_37_ = i_36_ - i_35_;
            if (i_37_ > 0)
            {
                int i_38_ = i_34_ + i_25_ >> 6;
                i_35_ += i_24_;
                i_36_ += i_24_;
                if (i_38_ >= 0 && i_38_ <= (Class68_Sub20_Sub17.anIntArrayArrayArray4444).length - 1)
                {
                    int[][] is = Class68_Sub20_Sub17.anIntArrayArrayArray4444[i_38_];
                    for (int i_39_ = -i_33_; i_31_ + i_33_ > i_39_; i_39_++)
                    {
                        int i_40_ = i_26_ + (i_39_ + 1) * i >> 16;
                        int i_41_ = i_26_ + i * i_39_ >> 16;
                        int i_42_ = i_40_ - i_41_;
                        if (i_42_ > 0)
                        {
                            i_40_ += i_28_;
                            i_41_ += i_28_;
                            int i_43_ = i_21_ + i_39_ >> 6;
                            if (i_43_ >= 0 && i_43_ <= is.length - 1 && is[i_43_] != null)
                            {
                                int i_44_ = ((i_34_ + i_25_ & 0x3f) + ((i_21_ + i_39_ & 0x3f) << 6));
                                int i_45_ = is[i_43_][i_44_];
                                if (i_45_ != 0)
                                {
                                    ObjectDefinition class116 = Class1_Sub5.method140(115, i_45_ - 1);
                                    if (bool && (((ObjectDefinition) class116).anInt1982 == (Class68_Sub13_Sub12.anInt3646)))
                                    {
                                        Class68_Sub8 class68_sub8 = new Class68_Sub8();
                                        ((Class68_Sub8) class68_sub8).anInt2877 = i_41_;
                                        ((Class68_Sub8) class68_sub8).anInt2880 = ((ObjectDefinition) class116).anInt1982;
                                        ((Class68_Sub8) class68_sub8).anInt2871 = i_35_;
                                        Class94.aClass16_1673.pushFront(class68_sub8);
                                    }
                                    Class68_Sub13_Sub9.aClass68_Sub20_Sub10_Sub1Array3571[((ObjectDefinition) class116).anInt1982].method1103(i_35_ - 7, i_41_ - 7);
                                }
                            }
                        }
                    }
                }
            }
        }
        int i_46_ = -124 / ((i_23_ + 31) / 58);
        for (Class68_Sub8 class68_sub8 = (Class68_Sub8) Class94.aClass16_1673.method293((byte) 76); class68_sub8 != null; class68_sub8 = ((Class68_Sub8) Class94.aClass16_1673.method290((byte) -119)))
        {
            Class68_Sub13_Sub9.aClass68_Sub20_Sub10_Sub1Array3571[((Class68_Sub8) class68_sub8).anInt2880].method1103(((Class68_Sub8) class68_sub8).anInt2871 - 7, ((Class68_Sub8) class68_sub8).anInt2877 - 7);
            Class79.method1440(((Class68_Sub8) class68_sub8).anInt2871, ((Class68_Sub8) class68_sub8).anInt2877, 15, 16776960, 128);
            Class79.method1440(((Class68_Sub8) class68_sub8).anInt2871, ((Class68_Sub8) class68_sub8).anInt2877, 7, 16777215, 256);
        }
        Class94.aClass16_1673.method284(105);
    }

    static final void method904(int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, byte i_52_)
    {
        anInt4093++;
        Object3.anInt938 = 0;
        for (int i_53_ = -1; client.localPlayerCount + Class13_Sub2.localNPCCount > i_53_; i_53_++)
        {
            Character class1_sub6;
            if (i_53_ == -1)
                class1_sub6 = Class68_Sub7.localPlayer;
            else if (i_53_ >= client.localPlayerCount)
                class1_sub6 = (Class102.localNPCs[(Class68_Sub10.localNPCIndices[i_53_ - client.localPlayerCount])]);
            else
                class1_sub6 = (Class68_Sub13_Sub4.localPlayers[Class85.localPlayerIndices[i_53_]]);
            if (class1_sub6 != null && class1_sub6.hasDefinition())
            {
                if (class1_sub6 instanceof NPC)
                {
                    NPCDefinition class80 = (((NPC) (NPC) class1_sub6).definition);
                    if (((NPCDefinition) class80).anIntArray1433 != null)
                        class80 = class80.method1453(-94);
                    if (class80 == null)
                        continue;
                }
                if (i_53_ >= client.localPlayerCount)
                {
                    NPCDefinition class80 = (((NPC) (NPC) class1_sub6).definition);
                    if (((NPCDefinition) class80).anIntArray1433 != null)
                        class80 = class80.method1453(-94);
                    if (((NPCDefinition) class80).anInt1441 >= 0 && (((NPCDefinition) class80).anInt1441 < Class108.aClass68_Sub20_Sub10Array1830.length))
                    {
                        Class95.method1556(93, i_51_, i_49_, i >> 1, class1_sub6, i_47_ >> 1, (class1_sub6.getHeight() + 15));
                        if (Mouse.anInt1578 > -1)
                            Class108.aClass68_Sub20_Sub10Array1830[((NPCDefinition) class80).anInt1441].method1103(i_48_ - (-Mouse.anInt1578 + 12), i_50_ + Class114.anInt1927 - 30);
                    }
                    Class23[] class23s = Class34.aClass23Array594;
                    for (int i_54_ = 0; class23s.length > i_54_; i_54_++)
                    {
                        Class23 class23 = class23s[i_54_];
                        if (class23 != null && ((Class23) class23).anInt489 == 1 && (((Class23) class23).anInt493 == (Class68_Sub10.localNPCIndices[i_53_ - client.localPlayerCount])) && Class68_Sub3.loopCycle % 20 < 10)
                        {
                            Class95.method1556(54, i_51_, i_49_, i >> 1, class1_sub6, i_47_ >> 1, (class1_sub6.getHeight() + 15));
                            if (Mouse.anInt1578 > -1)
                                Class68_Sub13_Sub12.aClass68_Sub20_Sub10Array3648[((Class23) class23).anInt499].method1103(Mouse.anInt1578 + i_48_ - 12, i_50_ - (-Class114.anInt1927 + 28));
                        }
                    }
                } else
                {
                    Player class1_sub6_sub2 = (Player) class1_sub6;
                    int i_55_ = 30;
                    if (((Player) class1_sub6_sub2).anInt3437 != -1 || (((Player) class1_sub6_sub2).anInt3424 != -1))
                    {
                        Class95.method1556(110, i_51_, i_49_, i >> 1, class1_sub6, i_47_ >> 1, (class1_sub6.getHeight() + 15));
                        if (Mouse.anInt1578 > -1)
                        {
                            if (((Player) class1_sub6_sub2).anInt3437 != -1)
                            {
                                Class59.aClass68_Sub20_Sub10Array1106[(((Player) class1_sub6_sub2).anInt3437)].method1103(Mouse.anInt1578 - 12 + i_48_, i_50_ + (Class114.anInt1927 - i_55_));
                                i_55_ += 25;
                            }
                            if (((Player) class1_sub6_sub2).anInt3424 != -1)
                            {
                                Class108.aClass68_Sub20_Sub10Array1830[(((Player) class1_sub6_sub2).anInt3424)].method1103(i_48_ - 12 + Mouse.anInt1578, i_50_ + Class114.anInt1927 - i_55_);
                                i_55_ += 25;
                            }
                        }
                    }
                    if (i_53_ >= 0)
                    {
                        int i_56_ = 0;
                        for (Class23[] class23s = Class34.aClass23Array594; class23s.length > i_56_; i_56_++)
                        {
                            Class23 class23 = class23s[i_56_];
                            if (class23 != null && ((Class23) class23).anInt489 == 10 && (((Class23) class23).anInt493 == Class85.localPlayerIndices[i_53_]))
                            {
                                Class95.method1556(55, i_51_, i_49_, i >> 1, class1_sub6, i_47_ >> 1, (class1_sub6.getHeight() + 15));
                                if (Mouse.anInt1578 > -1)
                                    Class68_Sub13_Sub12.aClass68_Sub20_Sub10Array3648[((Class23) class23).anInt499].method1103(i_48_ - (12 - Mouse.anInt1578), Class114.anInt1927 - i_55_ + i_50_);
                            }
                        }
                    }
                }
                if (((Character) class1_sub6).message != null && (i_53_ >= client.localPlayerCount || GroundData.publicChatMode == 0 || GroundData.publicChatMode == 3 || (GroundData.publicChatMode == 1 && (Class68_Sub13_Sub17.method785(-86, ((Player) (Player) class1_sub6).name)))))
                {
                    Class95.method1556(33, i_51_, i_49_, i >> 1, class1_sub6, i_47_ >> 1, class1_sub6.getHeight());
                    if (Mouse.anInt1578 > -1 && Object3.anInt938 < Class75_Sub1.anInt3303)
                    {
                        Class75_Sub1.anIntArray3294[Object3.anInt938] = ((Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1029(((Character) class1_sub6).message)) / 2);
                        Class75_Sub1.anIntArray3302[Object3.anInt938] = (((Class68_Sub20_Sub1) Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513).anInt4139);
                        Class75_Sub1.anIntArray3295[Object3.anInt938] = Mouse.anInt1578;
                        Class75_Sub1.anIntArray3307[Object3.anInt938] = Class114.anInt1927;
                        Class75_Sub1.anIntArray3297[Object3.anInt938] = ((Character) class1_sub6).anInt2537;
                        Class75_Sub1.anIntArray3299[Object3.anInt938] = ((Character) class1_sub6).anInt2541;
                        Class75_Sub1.anIntArray3305[Object3.anInt938] = ((Character) class1_sub6).messageCycle;
                        Class75_Sub1.aClass100Array3301[Object3.anInt938] = ((Character) class1_sub6).message;
                        Object3.anInt938++;
                    }
                }
                if (Class68_Sub3.loopCycle < ((Character) class1_sub6).loopCycleStatus)
                {
                    Class68_Sub20_Sub10 class68_sub20_sub10 = Class68_Sub16.aClass68_Sub20_Sub10Array3032[0];
                    Class68_Sub20_Sub10 class68_sub20_sub10_57_ = Class68_Sub16.aClass68_Sub20_Sub10Array3032[1];
                    if (class1_sub6 instanceof NPC)
                    {
                        NPC class1_sub6_sub1 = (NPC) class1_sub6;
                        Class68_Sub20_Sub10[] class68_sub20_sub10s = ((Class68_Sub20_Sub10[]) (Class108.aClass98_1829.getNodeForID((long) ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1439)));
                        if (class68_sub20_sub10s == null)
                        {
                            class68_sub20_sub10s = Class127.method1786(0, (((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1439), 0, (Class52.aClass21_Sub1_1011));
                            if (class68_sub20_sub10s != null)
                                Class108.aClass98_1829.addObject(class68_sub20_sub10s, (long) (((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1439));
                        }
                        if (class68_sub20_sub10s != null && class68_sub20_sub10s.length == 2)
                        {
                            class68_sub20_sub10_57_ = class68_sub20_sub10s[1];
                            class68_sub20_sub10 = class68_sub20_sub10s[0];
                        }
                    }
                    Class95.method1556(57, i_51_, i_49_, i >> 1, class1_sub6, i_47_ >> 1, (class1_sub6.getHeight() - (-10 - (((Class68_Sub20_Sub10) class68_sub20_sub10).height))));
                    if (Mouse.anInt1578 > -1)
                    {
                        int i_58_ = (Mouse.anInt1578 + i_48_ - ((((Class68_Sub20_Sub10) class68_sub20_sub10).width) >> 1));
                        int i_59_ = Class114.anInt1927 + i_50_ - 3;
                        class68_sub20_sub10.method1103(i_58_, i_59_);
                        int i_60_ = (((Character) class1_sub6).hpRatio * (((Class68_Sub20_Sub10) class68_sub20_sub10).width) / 255);
                        int i_61_ = (((Class68_Sub20_Sub10) class68_sub20_sub10).height);
                        Class79.method1432(i_58_, i_59_, i_58_ + i_60_, i_59_ + i_61_);
                        class68_sub20_sub10_57_.method1103(i_58_, i_59_);
                        Class79.method1433(i_48_, i_50_, i_47_ + i_48_, i_50_ + i);
                    }
                }
                for (int i_62_ = 0; i_62_ < 4; i_62_++)
                {
                    if (Class68_Sub3.loopCycle < ((Character) class1_sub6).anIntArray2582[i_62_])
                    {
                        Class95.method1556(80, i_51_, i_49_, i >> 1, class1_sub6, i_47_ >> 1, (class1_sub6.getHeight() / 2));
                        if (Mouse.anInt1578 > -1)
                        {
                            if (i_62_ == 1)
                                Class114.anInt1927 -= 20;
                            if (i_62_ == 2)
                            {
                                Mouse.anInt1578 -= 15;
                                Class114.anInt1927 -= 10;
                            }
                            if (i_62_ == 3)
                            {
                                Class114.anInt1927 -= 10;
                                Mouse.anInt1578 += 15;
                            }
                            Class68_Sub13_Sub23.aClass68_Sub20_Sub10Array3823[(((Character) class1_sub6).anIntArray2573[i_62_])].method1103(i_48_ + Mouse.anInt1578 - 12, i_50_ - 12 + Class114.anInt1927);
                            Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3803.method1032(Class68_Sub13_Sub24.method816((((Character) class1_sub6).anIntArray2556[i_62_]), 0), Mouse.anInt1578 - 1 + i_48_, Class114.anInt1927 + 3 + i_50_, 16777215, 0);
                        }
                    }
                }
            }
        }
        int i_63_ = 0;
        if (i_52_ >= -28)
            anIntArray4100 = null;
        for (/**/; i_63_ < Object3.anInt938; i_63_++)
        {
            int i_64_ = Class75_Sub1.anIntArray3307[i_63_];
            int i_65_ = Class75_Sub1.anIntArray3295[i_63_];
            int i_66_ = Class75_Sub1.anIntArray3294[i_63_];
            int i_67_ = Class75_Sub1.anIntArray3302[i_63_];
            boolean bool = true;
            while (bool)
            {
                bool = false;
                for (int i_68_ = 0; i_68_ < i_63_; i_68_++)
                {
                    if (i_64_ + 2 > (Class75_Sub1.anIntArray3307[i_68_] - Class75_Sub1.anIntArray3302[i_68_]) && (Class75_Sub1.anIntArray3307[i_68_] + 2 > i_64_ - i_67_) && (i_65_ - i_66_ < (Class75_Sub1.anIntArray3295[i_68_] + Class75_Sub1.anIntArray3294[i_68_])) && ((Class75_Sub1.anIntArray3295[i_68_] - Class75_Sub1.anIntArray3294[i_68_]) < i_66_ + i_65_) && (Class75_Sub1.anIntArray3307[i_68_] - Class75_Sub1.anIntArray3302[i_68_]) < i_64_)
                    {
                        bool = true;
                        i_64_ = (Class75_Sub1.anIntArray3307[i_68_] - Class75_Sub1.anIntArray3302[i_68_]);
                    }
                }
            }
            Mouse.anInt1578 = Class75_Sub1.anIntArray3295[i_63_];
            Class114.anInt1927 = Class75_Sub1.anIntArray3307[i_63_] = i_64_;
            MutableString class100 = Class75_Sub1.aClass100Array3301[i_63_];
            if (Class68_Sub13_Sub19.anInt3757 == 0)
            {
                int i_69_ = 16776960;
                if (Class75_Sub1.anIntArray3297[i_63_] < 6)
                    i_69_ = (Object4.anIntArray1077[Class75_Sub1.anIntArray3297[i_63_]]);
                if (Class75_Sub1.anIntArray3297[i_63_] == 6)
                    i_69_ = Class3.anInt84 % 20 >= 10 ? 16776960 : 16711680;
                if (Class75_Sub1.anIntArray3297[i_63_] == 7)
                    i_69_ = Class3.anInt84 % 20 >= 10 ? 65535 : 255;
                if (Class75_Sub1.anIntArray3297[i_63_] == 8)
                    i_69_ = Class3.anInt84 % 20 < 10 ? 45056 : 8454016;
                if (Class75_Sub1.anIntArray3297[i_63_] == 9)
                {
                    int i_70_ = 150 - Class75_Sub1.anIntArray3305[i_63_];
                    if (i_70_ < 50)
                        i_69_ = 1280 * i_70_ + 16711680;
                    else if (i_70_ < 100)
                        i_69_ = 16384000 - 327680 * i_70_ + 16776960;
                    else if (i_70_ < 150)
                        i_69_ = (i_70_ - 100) * 5 + 65280;
                }
                if (Class75_Sub1.anIntArray3297[i_63_] == 10)
                {
                    int i_71_ = 150 - Class75_Sub1.anIntArray3305[i_63_];
                    if (i_71_ >= 50)
                    {
                        if (i_71_ >= 100)
                        {
                            if (i_71_ < 150)
                                i_69_ = 327680 * (i_71_ - 100) + (255 - i_71_ * 5 + 500);
                        } else
                            i_69_ = 16384000 - 327680 * i_71_ + 16711935;
                    } else
                        i_69_ = 5 * i_71_ + 16711680;
                }
                if (Class75_Sub1.anIntArray3297[i_63_] == 11)
                {
                    int i_72_ = 150 - Class75_Sub1.anIntArray3305[i_63_];
                    if (i_72_ >= 50)
                    {
                        if (i_72_ >= 100)
                        {
                            if (i_72_ < 150)
                                i_69_ = -(327680 * i_72_) + 49545215;
                        } else
                            i_69_ = 327685 * i_72_ - 16318970;
                    } else
                        i_69_ = 16777215 - 327685 * i_72_;
                }
                if (Class75_Sub1.anIntArray3299[i_63_] == 0)
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1032(class100, Mouse.anInt1578 + i_48_, Class114.anInt1927 + i_50_, i_69_, 0);
                if (Class75_Sub1.anIntArray3299[i_63_] == 1)
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1016(class100, Mouse.anInt1578 + i_48_, Class114.anInt1927 + i_50_, i_69_, 0, Class3.anInt84);
                if (Class75_Sub1.anIntArray3299[i_63_] == 2)
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1015(class100, i_48_ + Mouse.anInt1578, Class114.anInt1927 + i_50_, i_69_, 0, Class3.anInt84);
                if (Class75_Sub1.anIntArray3299[i_63_] == 3)
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1010(class100, Mouse.anInt1578 + i_48_, Class114.anInt1927 + i_50_, i_69_, 0, Class3.anInt84, 150 - Class75_Sub1.anIntArray3305[i_63_]);
                if (Class75_Sub1.anIntArray3299[i_63_] == 4)
                {
                    int i_73_ = ((150 - Class75_Sub1.anIntArray3305[i_63_]) * (Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1029(class100) + 100) / 150);
                    Class79.method1432(i_48_ + (Mouse.anInt1578 - 50), i_50_, i_48_ + Mouse.anInt1578 + 50, i_50_ + i);
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1030(class100, Mouse.anInt1578 - i_73_ + i_48_ + 50, i_50_ + Class114.anInt1927, i_69_, 0);
                    Class79.method1433(i_48_, i_50_, i_47_ + i_48_, i + i_50_);
                }
                if (Class75_Sub1.anIntArray3299[i_63_] == 5)
                {
                    int i_74_ = 150 - Class75_Sub1.anIntArray3305[i_63_];
                    Class79.method1432(i_48_, (Class114.anInt1927 + (i_50_ + (-(((Class68_Sub20_Sub1) (Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513)).anInt4139) - 1))), i_48_ + i_47_, i_50_ + Class114.anInt1927 + 5);
                    int i_75_ = 0;
                    if (i_74_ >= 25)
                    {
                        if (i_74_ > 125)
                            i_75_ = i_74_ - 125;
                    } else
                        i_75_ = i_74_ - 25;
                    Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1032(class100, i_48_ + Mouse.anInt1578, i_75_ + (Class114.anInt1927 + i_50_), i_69_, 0);
                    Class79.method1433(i_48_, i_50_, i_47_ + i_48_, i_50_ + i);
                }
            } else
                Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1032(class100, i_48_ + Mouse.anInt1578, Class114.anInt1927 + i_50_, 16776960, 0);
        }
    }

    static final void method905(int i, int i_76_, int i_77_)
    {
        Class70.anInt1272++;
        if (i_77_ != 327685)
            anIntArray4100 = null;
        anInt4110++;
        Class21.connectionVector.startPacket(63);
        Class21.connectionVector.writeLEShortA(i);
        Class21.connectionVector.writeLEInteger(i_76_);
    }

    private final void method906(int i)
    {
        if (i != -1632225748)
            aByteArray4111 = null;
        Random random = new Random((long) anInt4099);
        aShortArray4101 = new short[512];
        if (anInt4103 > 0)
        {
            for (int i_78_ = 0; i_78_ < 512; i_78_++)
                aShortArray4101[i_78_] = (short) Class68_Sub20_Sub10.method1114(anInt4103, (byte) 70, random);
        }
        anInt4092++;
    }

    static final void method907(int i, int i_79_)
    {
        if (i >= -99)
            anIntArray4100 = null;
        Class68_Sub20_Sub9 class68_sub20_sub9 = Class68_Sub13_Sub26_Sub1.method835(i_79_, 2, (byte) -121);
        anInt4107++;
        class68_sub20_sub9.method1101((byte) -87);
    }

    static
    {
        anIntArray4100 = new int[100];
    }
}
