/* Class68_Sub13_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub18 extends Class68_Sub13
{
    static int anInt3728;
    private static MutableString aClass100_3729 = Class112.makeMutableString(43, "wave:");
    static MutableString aClass100_3730 = aClass100_3729;
    static int anInt3731;
    static int anInt3732;
    static MutableString aClass100_3733;
    static MutableString aClass100_3734 = Class112.makeMutableString(43, "(U4");
    static int anInt3735;
    static int anInt3736;
    static int anInt3737;
    static int anInt3738;
    static int anInt3739;
    static boolean[][] aBooleanArrayArray3740;

    static final void method786(byte i, int i_0_, int i_1_, int i_2_, int i_3_)
    {
        int i_4_ = -i_2_;
        anInt3731++;
        int i_5_ = -1;
        int i_6_ = i_2_;
        int i_7_ = Class68_Sub20_Sub15.method1171(i_1_ + i_2_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        int i_8_ = Class68_Sub20_Sub15.method1171(i_1_ - i_2_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
        if (i != 83)
            aClass100_3730 = null;
        int i_9_ = 0;
        Class34.method416(i_8_, (byte) -17, i_0_, Class68_Sub22.anIntArrayArray3134[i_3_], i_7_);
        while (i_9_ < i_6_)
        {
            i_5_ += 2;
            i_4_ += i_5_;
            if (i_4_ > 0)
            {
                int i_10_ = --i_6_ + i_3_;
                i_4_ -= i_6_ << 1;
                int i_11_ = i_3_ - i_6_;
                if (i_10_ >= Class35.anInt605 && i_11_ <= Class51.anInt2257)
                {
                    int i_12_ = Class68_Sub20_Sub15.method1171(i_9_ + i_1_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                    int i_13_ = Class68_Sub20_Sub15.method1171(i_1_ - i_9_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                    if (i_10_ <= Class51.anInt2257)
                        Class34.method416(i_13_, (byte) -17, i_0_, (Class68_Sub22.anIntArrayArray3134[i_10_]), i_12_);
                    if (i_11_ >= Class35.anInt605)
                        Class34.method416(i_13_, (byte) -17, i_0_, (Class68_Sub22.anIntArrayArray3134[i_11_]), i_12_);
                }
            }
            i_9_++;
            int i_14_ = i_3_ - i_9_;
            int i_15_ = i_3_ + i_9_;
            if (Class35.anInt605 <= i_15_ && Class51.anInt2257 >= i_14_)
            {
                int i_16_ = Class68_Sub20_Sub15.method1171(i_6_ + i_1_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                int i_17_ = Class68_Sub20_Sub15.method1171(i_1_ - i_6_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
                if (Class51.anInt2257 >= i_15_)
                    Class34.method416(i_17_, (byte) -17, i_0_, Class68_Sub22.anIntArrayArray3134[i_15_], i_16_);
                if (Class35.anInt605 <= i_14_)
                    Class34.method416(i_17_, (byte) -17, i_0_, Class68_Sub22.anIntArrayArray3134[i_14_], i_16_);
            }
        }
    }

    static final void method787(byte i)
    {
        int i_18_ = Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1029(Class68_Sub13_Sub26_Sub1.aClass100_4607);
        for (int i_19_ = 0; i_19_ < Class68_Sub13_Sub21.menuOptionsCount; i_19_++)
        {
            int i_20_ = Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1029(Class58.method579((byte) -59, i_19_));
            if (i_20_ > i_18_)
                i_18_ = i_20_;
        }
        i_18_ += 8;
        int i_21_ = Class68_Sub25.anInt3178 - i_18_ / 2;
        if (Class13_Sub3.appletWidth < i_18_ + i_21_)
            i_21_ = Class13_Sub3.appletWidth - i_18_;
        int i_22_ = 15 * Class68_Sub13_Sub21.menuOptionsCount + 21;
        if (i_21_ < 0)
            i_21_ = 0;
        int i_23_ = Class92.anInt1648;
        anInt3728++;
        if (Class68_Sub13_Sub9.appletHeight < i_22_ + i_23_)
            i_23_ = Class68_Sub13_Sub9.appletHeight - i_22_;
        if (i_23_ < 0)
            i_23_ = 0;
        int i_24_ = -52 % ((i - 39) / 41);
        if (Object3.anInt940 != 1)
        {
            if (Class68_Sub25.anInt3178 != Class68_Sub13_Sub37.anInt4079 || Class125.anInt2175 != Class92.anInt1648)
            {
                Class13_Sub4.anInt2684 = Class68_Sub13_Sub37.anInt4079;
                Object3.anInt940 = 1;
                Class68_Sub13_Sub16.anInt3707 = Class125.anInt2175;
            } else
            {
                Class49.menuX = i_21_;
                Class33.anInt588 = 15 * Class68_Sub13_Sub21.menuOptionsCount + 22;
                Class120.menuOpen = true;
                Class68_Sub13_Sub15.anInt3689 = i_18_;
                Class68_Sub13_Sub14.menuY = i_23_;
                Object3.anInt940 = 0;
            }
        } else if (Class68_Sub25.anInt3178 == Class13_Sub4.anInt2684 && Class92.anInt1648 == Class68_Sub13_Sub16.anInt3707)
        {
            Class68_Sub13_Sub14.menuY = i_23_;
            Class49.menuX = i_21_;
            Class120.menuOpen = true;
            Class68_Sub13_Sub15.anInt3689 = i_18_;
            Class33.anInt588 = Class68_Sub13_Sub21.menuOptionsCount * 15 + 22;
            Object3.anInt940 = 0;
        }
    }

    public static void method788(int i)
    {
        if (i != 208)
            method787((byte) -16);
        aClass100_3729 = null;
        aBooleanArrayArray3740 = null;
        aClass100_3734 = null;
        aClass100_3733 = null;
        aClass100_3730 = null;
    }

    public Class68_Sub13_Sub18()
    {
        super(1, true);
    }

    final int[] method698(byte i, int i_25_)
    {
        if (i != -61)
            method788(-89);
        anInt3735++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_25_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int[][] is_26_ = this.method699(-114, 0, i_25_);
            int[] is_27_ = is_26_[0];
            int[] is_28_ = is_26_[2];
            int[] is_29_ = is_26_[1];
            for (int i_30_ = 0; Class68_Sub13_Sub19.anInt3748 > i_30_; i_30_++)
                is[i_30_] = (is_27_[i_30_] + is_29_[i_30_] + is_28_[i_30_]) / 3;
        }
        return is;
    }

    static final void method789(int i)
    {
        anInt3738++;
        if (Class49.packetOpcode == 248)
        {
            int i_31_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_32_ = (0x7 & i_31_ >> 4) + Class93.anInt1670;
            int i_33_ = (i_31_ & 0x7) + Class68_Sub28_Sub1.anInt4493;
            int i_34_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_35_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_36_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            if (i_32_ >= 0 && i_33_ >= 0 && i_32_ < 104 && i_33_ < 104)
            {
                i_32_ = i_32_ * 128 + 64;
                i_33_ = i_33_ * 128 + 64;
                Class1_Sub5 class1_sub5 = new Class1_Sub5(i_34_, GameSocket.plane, i_32_, i_33_, (Player.fixZ(i_32_, (GameSocket.plane), i_33_) - i_35_), i_36_, Class68_Sub3.loopCycle);
                Class105.aClass16_1792.pushFront(new Class68_Sub20_Sub5(class1_sub5));
            }
        } else if (Class49.packetOpcode == 29)
        {
            int i_37_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_38_ = 2 * Class68_Sub28_Sub1.anInt4493 + (i_37_ & 0xf);
            int i_39_ = ((0xf6 & i_37_) >> 4) + Class93.anInt1670 * 2;
            int i_40_ = i_39_ + Class68_Sub13_Sub8.connectionVector.readByte();
            int i_41_ = i_38_ + Class68_Sub13_Sub8.connectionVector.readByte();
            int i_42_ = Class68_Sub13_Sub8.connectionVector.readShort();
            int i_43_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_44_ = 4 * Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_45_ = (Class68_Sub13_Sub8.connectionVector.readUByte() * 4);
            int i_46_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_47_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_48_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_49_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            if (i_39_ >= 0 && i_38_ >= 0 && i_39_ < 208 && i_38_ < 208 && i_40_ >= 0 && i_41_ >= 0 && i_40_ < 208 && i_41_ < 208 && i_43_ != 65535)
            {
                i_39_ *= 64;
                i_38_ = 64 * i_38_;
                i_40_ *= 64;
                Class1_Sub1 class1_sub1 = new Class1_Sub1(i_43_, GameSocket.plane, i_39_, i_38_, (Player.fixZ(i_39_, (GameSocket.plane), i_38_) - i_44_), Class68_Sub3.loopCycle + i_46_, i_47_ + Class68_Sub3.loopCycle, i_48_, i_49_, i_42_, i_45_);
                i_41_ *= 64;
                class1_sub1.method64(i_40_, (byte) -105, i_41_, (Player.fixZ(i_40_, (GameSocket.plane), i_41_) - i_45_), Class68_Sub3.loopCycle + i_46_);
                Widget.aClass16_886.pushFront(new Class68_Sub20_Sub4(class1_sub1));
            }
        } else if (Class49.packetOpcode == 30)
        {
            int i_50_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
            int i_51_ = Class68_Sub13_Sub8.connectionVector.readUByteA();
            int i_52_ = Class68_Sub28_Sub1.anInt4493 + (0x7 & i_51_);
            int i_53_ = Class93.anInt1670 + (0x7 & i_51_ >> 4);
            int i_54_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
            int i_55_ = i_54_ >> 2;
            int i_56_ = Class12.anIntArray201[i_55_];
            int i_57_ = 0x3 & i_54_;
            if (i_53_ >= 0 && i_52_ >= 0 && i_53_ < 104 && i_52_ < 104)
                Class89.method1506(i_53_, i ^ 0xffffffff, -1, i_56_, i_52_, i_55_, i_57_, GameSocket.plane, 0, i_50_);
        } else if (Class49.packetOpcode == 110)
        {
            int i_58_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
            int i_59_ = i_58_ >> 2;
            int i_60_ = i_58_ & 0x3;
            int i_61_ = Class12.anIntArray201[i_59_];
            int i_62_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            int i_63_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
            int i_64_ = Class68_Sub28_Sub1.anInt4493 + (0x7 & i_63_);
            if (i_62_ == 65535)
                i_62_ = -1;
            int i_65_ = Class93.anInt1670 + ((i_63_ & 0x75) >> 4);
            Class43.method483(i_64_, i_59_, GameSocket.plane, i_60_, i_65_, (byte) 117, i_62_, i_61_);
        } else if (Class49.packetOpcode == 232)
        {
            int i_66_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_67_ = Class93.anInt1670 + ((0x7d & i_66_) >> 4);
            int i_68_ = Class68_Sub28_Sub1.anInt4493 + (0x7 & i_66_);
            int i_69_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            if (i_69_ == 65535)
                i_69_ = -1;
            int i_70_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_71_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_72_ = i_70_ >> 4 & 0xf;
            int i_73_ = i_70_ & 0x7;
            if (i_67_ >= 0 && i_68_ >= 0 && i_67_ < 104 && i_68_ < 104)
            {
                int i_74_ = i_72_ + 1;
                if ((((Character) Class68_Sub7.localPlayer).walkQueueX[0]) >= i_67_ - i_74_ && (i_74_ + i_67_ >= (((Character) Class68_Sub7.localPlayer).walkQueueX[0])) && (i_68_ - i_74_ <= (((Character) Class68_Sub7.localPlayer).walkQueueY[0])) && (i_68_ + i_74_ >= (((Character) Class68_Sub7.localPlayer).walkQueueY[0])) && Class68_Sub20_Sub15.anInt4401 != 0 && i_73_ > 0 && Item.anInt2437 < 50 && i_69_ != -1)
                {
                    Login.anIntArray1517[Item.anInt2437] = i_69_;
                    Class111.anIntArray1878[Item.anInt2437] = i_73_;
                    Class34.anIntArray596[Item.anInt2437] = i_71_;
                    Class3.aClass46Array80[Item.anInt2437] = null;
                    Class102.anIntArray1759[Item.anInt2437] = (i_67_ << 16) + (i_68_ << 8) + i_72_;
                    Item.anInt2437++;
                }
            }
        } else if (Class49.packetOpcode == 201)
        {
            int i_75_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_76_ = ((i_75_ & 0x73) >> 4) + Class93.anInt1670;
            int i_77_ = (i_75_ & 0x7) + Class68_Sub28_Sub1.anInt4493;
            int i_78_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            if (i_76_ >= 0 && i_77_ >= 0 && i_76_ < 104 && i_77_ < 104)
            {
                NodeList class16 = (Widget.groundItems[GameSocket.plane][i_76_][i_77_]);
                if (class16 != null)
                {
                    for (CachedItem class68_sub20_sub18 = ((CachedItem) class16.method293((byte) 76)); class68_sub20_sub18 != null; class68_sub20_sub18 = ((CachedItem) class16.method290((byte) 16)))
                    {
                        if ((0x7fff & i_78_) == ((Item) (((CachedItem) class68_sub20_sub18).item)).id)
                        {
                            class68_sub20_sub18.unlink();
                            break;
                        }
                    }
                    if (class16.method293((byte) 76) == null)
                        Widget.groundItems[GameSocket.plane][i_76_][i_77_] = null;
                    Class68_Sub20_Sub9.method1100(i_76_, (byte) -52, i_77_);
                }
            }
        } else
        {
            if (Class49.packetOpcode == 21)
            {
                int i_79_ = Class68_Sub13_Sub8.connectionVector.readUByteA();
                int i_80_ = i_79_ & 0x3;
                int i_81_ = i_79_ >> 2;
                int i_82_ = Class12.anIntArray201[i_81_];
                int i_83_ = Class68_Sub13_Sub8.connectionVector.readByte();
                int i_84_ = Class68_Sub13_Sub8.connectionVector.readByteA();
                int i_85_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
                int i_86_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
                int i_87_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                int i_88_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                int i_89_ = Class93.anInt1670 + (0x7 & i_88_ >> 4);
                int i_90_ = Class68_Sub28_Sub1.anInt4493 + (0x7 & i_88_);
                int i_91_ = Class68_Sub13_Sub8.connectionVector.readByteA();
                int i_92_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
                int i_93_ = Class68_Sub13_Sub8.connectionVector.readByteC();
                Player class1_sub6_sub2;
                if (Class68_Sub10.localPlayerInteractingEntity != i_85_)
                    class1_sub6_sub2 = Class68_Sub13_Sub4.localPlayers[i_85_];
                else
                    class1_sub6_sub2 = Class68_Sub7.localPlayer;
                if (class1_sub6_sub2 != null)
                {
                    ObjectDefinition class116 = Class1_Sub5.method140(84, i_87_);
                    int i_94_;
                    int i_95_;
                    if (i_80_ == 1 || i_80_ == 3)
                    {
                        i_95_ = ((ObjectDefinition) class116).anInt1990;
                        i_94_ = ((ObjectDefinition) class116).anInt1989;
                    } else
                    {
                        i_94_ = ((ObjectDefinition) class116).anInt1990;
                        i_95_ = ((ObjectDefinition) class116).anInt1989;
                    }
                    int i_96_ = i_90_ + (i_95_ >> 1);
                    int i_97_ = i_90_ + (i_95_ + 1 >> 1);
                    int i_98_ = (i_94_ >> 1) + i_89_;
                    int[][] is = (Class68_Sub20_Sub12.intGroundArray[GameSocket.plane]);
                    int i_99_ = (i_94_ + 1 >> 1) + i_89_;
                    int[][] is_100_ = null;
                    if (GameSocket.plane < 3)
                        is_100_ = (Class68_Sub20_Sub12.intGroundArray[GameSocket.plane + 1]);
                    int i_101_ = (is[i_98_][i_96_] + (is[i_99_][i_96_] + is[i_98_][i_97_] + is[i_99_][i_97_]) >> 2);
                    int i_102_ = (i_89_ << 7) + (i_94_ << 6);
                    int i_103_ = (i_90_ << 7) + (i_95_ << 6);
                    Class44 class44 = class116.method1708(i_81_, null, (((ObjectDefinition) class116).aBoolean2020), (byte) 123, false, i_101_, i_80_, is, i_103_, is_100_, i_102_);
                    if (class44 != null)
                    {
                        if (i_93_ < i_84_)
                        {
                            int i_104_ = i_84_;
                            i_84_ = i_93_;
                            i_93_ = i_104_;
                        }
                        Class89.method1506(i_89_, 0, i_86_ + 1, i_82_, i_90_, 0, 0, GameSocket.plane, i_92_ + 1, -1);
                        ((Player) class1_sub6_sub2).model = (Model) ((Class44) class44).aClass1_746;
                        ((Player) class1_sub6_sub2).anInt3409 = 64 * i_95_ + 128 * i_90_;
                        ((Player) class1_sub6_sub2).anInt3435 = i_84_ + i_89_;
                        ((Player) class1_sub6_sub2).anInt3441 = Class68_Sub3.loopCycle + i_86_;
                        ((Player) class1_sub6_sub2).anInt3414 = Class68_Sub3.loopCycle + i_92_;
                        ((Player) class1_sub6_sub2).anInt3436 = i_101_;
                        ((Player) class1_sub6_sub2).anInt3418 = 64 * i_94_ + 128 * i_89_;
                        ((Player) class1_sub6_sub2).anInt3410 = i_93_ + i_89_;
                        if (i_91_ > i_83_)
                        {
                            int i_105_ = i_91_;
                            i_91_ = i_83_;
                            i_83_ = i_105_;
                        }
                        ((Player) class1_sub6_sub2).anInt3440 = i_90_ + i_91_;
                        ((Player) class1_sub6_sub2).anInt3421 = i_83_ + i_90_;
                    }
                }
            }
            if (Class49.packetOpcode == 196)
            {
                int i_106_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
                int i_107_ = (0x7 & i_106_) + Class68_Sub28_Sub1.anInt4493;
                int i_108_ = ((i_106_ & 0x76) >> 4) + Class93.anInt1670;
                int i_109_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
                int i_110_ = i_109_ & 0x3;
                int i_111_ = i_109_ >> 2;
                int i_112_ = Class12.anIntArray201[i_111_];
                if (i_108_ >= 0 && i_107_ >= 0 && i_108_ < 104 && i_107_ < 104)
                    Class89.method1506(i_108_, i ^ 0xffffffff, -1, i_112_, i_107_, i_111_, i_110_, GameSocket.plane, 0, -1);
            } else
            {
                if (i != -1)
                    method789(81);
                if (Class49.packetOpcode == 112)
                {
                    int i_113_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                    int i_114_ = Class93.anInt1670 + (i_113_ >> 4 & 0x7);
                    int i_115_ = Class68_Sub28_Sub1.anInt4493 + (i_113_ & 0x7);
                    int i_116_ = i_114_ + Class68_Sub13_Sub8.connectionVector.readByte();
                    int i_117_ = (Class68_Sub13_Sub8.connectionVector.readByte() + i_115_);
                    int i_118_ = Class68_Sub13_Sub8.connectionVector.readShort();
                    int i_119_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                    int i_120_ = 4 * Class68_Sub13_Sub8.connectionVector.readUByte();
                    int i_121_ = 4 * Class68_Sub13_Sub8.connectionVector.readUByte();
                    int i_122_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                    int i_123_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                    int i_124_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                    int i_125_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                    if (i_114_ >= 0 && i_115_ >= 0 && i_114_ < 104 && i_115_ < 104 && i_116_ >= 0 && i_117_ >= 0 && i_116_ < 104 && i_117_ < 104 && i_119_ != 65535)
                    {
                        i_114_ = i_114_ * 128 + 64;
                        i_115_ = i_115_ * 128 + 64;
                        i_117_ = 128 * i_117_ + 64;
                        Class1_Sub1 class1_sub1 = (new Class1_Sub1(i_119_, GameSocket.plane, i_114_, i_115_, (Player.fixZ(i_114_, GameSocket.plane, i_115_) - i_120_), i_122_ + Class68_Sub3.loopCycle, Class68_Sub3.loopCycle + i_123_, i_124_, i_125_, i_118_, i_121_));
                        i_116_ = i_116_ * 128 + 64;
                        class1_sub1.method64(i_116_, (byte) -45, i_117_, (Player.fixZ(i_116_, GameSocket.plane, i_117_)) - i_121_, i_122_ + Class68_Sub3.loopCycle);
                        Widget.aClass16_886.pushFront(new Class68_Sub20_Sub4(class1_sub1));
                    }
                } else if (Class49.packetOpcode == 75)
                {
                    int i_126_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
                    int i_127_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                    int i_128_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                    int i_129_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
                    int i_130_ = (i_129_ & 0x7) + Class68_Sub28_Sub1.anInt4493;
                    int i_131_ = Class93.anInt1670 + (0x7 & i_129_ >> 4);
                    if (i_131_ >= 0 && i_130_ >= 0 && i_131_ < 104 && i_130_ < 104 && Class68_Sub10.localPlayerInteractingEntity != i_126_)
                    {
                        Item class1_sub2 = new Item();
                        ((Item) class1_sub2).id = i_127_;
                        ((Item) class1_sub2).stackSize = i_128_;
                        if ((Widget.groundItems[GameSocket.plane][i_131_][i_130_]) == null)
                            Widget.groundItems[GameSocket.plane][i_131_][i_130_] = new NodeList();
                        Widget.groundItems[GameSocket.plane][i_131_][i_130_].pushFront(new CachedItem(class1_sub2));
                        Class68_Sub20_Sub9.method1100(i_131_, (byte) -52, i_130_);
                    }
                } else if (Class49.packetOpcode == 25)
                {
                    int i_132_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
                    int i_133_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                    int i_134_ = (0x7 & i_133_ >> 4) + Class93.anInt1670;
                    int i_135_ = Class68_Sub28_Sub1.anInt4493 + (i_133_ & 0x7);
                    int i_136_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
                    if (i_134_ >= 0 && i_135_ >= 0 && i_134_ < 104 && i_135_ < 104)
                    {
                        Item class1_sub2 = new Item();
                        ((Item) class1_sub2).id = i_136_;
                        ((Item) class1_sub2).stackSize = i_132_;
                        if ((Widget.groundItems[GameSocket.plane][i_134_][i_135_]) == null)
                            Widget.groundItems[GameSocket.plane][i_134_][i_135_] = new NodeList();
                        Widget.groundItems[GameSocket.plane][i_134_][i_135_].pushFront(new CachedItem(class1_sub2));
                        Class68_Sub20_Sub9.method1100(i_134_, (byte) -52, i_135_);
                    }
                } else if (Class49.packetOpcode == 50)
                {
                    int i_137_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                    int i_138_ = Class68_Sub28_Sub1.anInt4493 + (i_137_ & 0x7);
                    int i_139_ = (i_137_ >> 4 & 0x7) + Class93.anInt1670;
                    int i_140_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                    int i_141_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                    int i_142_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                    if (i_139_ >= 0 && i_138_ >= 0 && i_139_ < 104 && i_138_ < 104)
                    {
                        NodeList class16 = (Widget.groundItems[GameSocket.plane][i_139_][i_138_]);
                        if (class16 != null)
                        {
                            for (CachedItem class68_sub20_sub18 = ((CachedItem) class16.method293((byte) 76)); class68_sub20_sub18 != null; class68_sub20_sub18 = ((CachedItem) class16.method290((byte) 34)))
                            {
                                Item class1_sub2 = (((CachedItem) class68_sub20_sub18).item);
                                if ((((Item) class1_sub2).id == (0x7fff & i_140_)) && (((Item) class1_sub2).stackSize == i_141_))
                                {
                                    ((Item) class1_sub2).stackSize = i_142_;
                                    break;
                                }
                            }
                            Class68_Sub20_Sub9.method1100(i_139_, (byte) -52, i_138_);
                        }
                    }
                }
            }
        }
    }

    static final int method790(int i)
    {
        anInt3732++;
        if (i != 7)
            anInt3736 = -13;
        return Class33.anInt590;
    }

    static final Class92_Sub1 method791(Class21 class21, byte i, int i_143_, int i_144_)
    {
        try
        {
            anInt3737++;
            if (i != 66)
                return null;
            if (!Class68_Sub13_Sub36.method880(-29381, i_143_, class21, i_144_))
                return null;
            return GroundData.method460(i ^ 0x25fc);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("la.C(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + i_143_ + ',' + i_144_ + ')'));
        }
    }

    static
    {
        aClass100_3733 = aClass100_3729;
        anInt3739 = 0;
    }
}
