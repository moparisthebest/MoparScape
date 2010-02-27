/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.zip.CRC32;

final class Class111
{
    static int[] anIntArray1863 = { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };
    static int anInt1864;
    static int[] anIntArray1865;
    private static MutableString aClass100_1866 = Class112.makeMutableString(43, "shake:");
    static int anInt1867;
    static int anInt1868;
    static MutableString aClass100_1869 = aClass100_1866;
    static int anInt1870;
    static int anInt1871;
    static MutableString aClass100_1872;
    static int anInt1873;
    static CRC32 aCRC32_1874;
    static int anInt1875;
    static NodeCache aClass113_1876;
    static int anInt1877;
    static int[] anIntArray1878;

    static final boolean method1667(byte[] is, int i, int i_0_, int i_1_)
    {
        try
        {
            if (i != -32692)
                anIntArray1878 = null;
            anInt1867++;
            boolean bool = true;
            Stream class68_sub14 = new Stream(is);
            int i_2_ = -1;
            for (;;)
            {
                int i_3_ = class68_sub14.method937(true);
                if (i_3_ == 0)
                    break;
                i_2_ += i_3_;
                int i_4_ = 0;
                boolean bool_5_ = false;
                for (;;)
                {
                    if (bool_5_)
                    {
                        int i_6_ = class68_sub14.method912(255);
                        if (i_6_ == 0)
                            break;
                        class68_sub14.readUByte();
                    } else
                    {
                        int i_7_ = class68_sub14.method912(255);
                        if (i_7_ == 0)
                            break;
                        i_4_ += i_7_ - 1;
                        int i_8_ = 0x3f & i_4_;
                        int i_9_ = (0xfe6 & i_4_) >> 6;
                        int i_10_ = i_8_ + i_0_;
                        int i_11_ = i_9_ + i_1_;
                        int i_12_ = class68_sub14.readUByte() >> 2;
                        if (i_11_ > 0 && i_10_ > 0 && i_11_ < 103 && i_10_ < 103)
                        {
                            ObjectDefinition class116 = Class1_Sub5.method140(i + 32781, i_2_);
                            if (i_12_ != 22 || RandomNumberGenerator.aBoolean1489 || ((ObjectDefinition) class116).anInt1985 != 0 || ((ObjectDefinition) class116).anInt2024 == 1 || ((ObjectDefinition) class116).aBoolean2006)
                            {
                                if (!class116.method1718(107))
                                {
                                    bool = false;
                                    Widget.anInt925++;
                                }
                                bool_5_ = true;
                            }
                        }
                    }
                }
            }
            return bool;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("tb.G(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ')'));
        }
    }

    static final void method1668(boolean bool, int i, int i_13_, int i_14_, Class21 class21, boolean bool_15_, int i_16_)
    {
        try
        {
            if (bool_15_ != false)
                method1672((byte) 81);
            Class68_Sub20_Sub15.anInt4405 = i_14_;
            Class68_Sub13_Sub11.anInt3622 = i_13_;
            Class105.anInt1796 = i;
            Class52.aBoolean998 = bool;
            Class67.anInt1217 = i_16_;
            GameException.aClass21_2238 = class21;
            anInt1873++;
            Class70.anInt1287 = 1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("tb.B(" + bool + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + (class21 != null ? "{...}" : "null") + ',' + bool_15_ + ',' + i_16_ + ')'));
        }
    }

    static final void method1669(int i, int i_17_, int i_18_)
    {
        anInt1868++;
        int[] is = new int[4];
        int[] is_19_ = new int[4];
        is[0] = i_17_;
        int i_20_ = 1;
        is_19_[0] = i_18_;
        for (int i_21_ = 0; i_21_ < 4; i_21_++)
        {
            if (i_17_ != Class68_Sub13_Sub26_Sub1.anIntArray4611[i_21_])
            {
                is[i_20_] = Class68_Sub13_Sub26_Sub1.anIntArray4611[i_21_];
                is_19_[i_20_] = Class51.anIntArray2259[i_21_];
                i_20_++;
            }
        }
        Class51.anIntArray2259 = is_19_;
        if (i <= 104)
            method1670(39);
        Class68_Sub13_Sub26_Sub1.anIntArray4611 = is;
        Class28.method392(Character.aClass93Array2531.length - 1, -228, Character.aClass93Array2531, 0);
    }

    static final boolean method1670(int i)
    {
        anInt1871++;
        if (i != 20778)
            aClass100_1872 = null;
        if (Class70.anInt1287 != 0)
            return true;
        return Item.aClass68_Sub28_Sub1_2435.method1258(-1);
    }

    static final void method1671(Class21 class21, byte i, Class21 class21_22_)
    {
        do
        {
            try
            {
                anInt1864++;
                Class1_Sub1.aClass21_2429 = class21;
                Class84.aClass21_1539 = class21_22_;
                if (i == 82)
                    break;
                aClass113_1876 = null;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("tb.E(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + (class21_22_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public static void method1672(byte i)
    {
        aClass100_1869 = null;
        aClass100_1872 = null;
        if (i <= -8)
        {
            anIntArray1865 = null;
            aClass100_1866 = null;
            anIntArray1878 = null;
            aCRC32_1874 = null;
            anIntArray1863 = null;
            aClass113_1876 = null;
        }
    }

    static final boolean parsePacket(int i) throws IOException
    {
        if (PlayerDefinition.connection == null)
            return false;
        int avail = PlayerDefinition.connection.available();
        if (avail == 0)
            return false;
        if (Class49.packetOpcode == -1)
        {
            avail--;
            PlayerDefinition.connection.read(1, 0, Class68_Sub13_Sub8.connectionVector.buffer);
            Class68_Sub13_Sub8.connectionVector.position = 0;
            Class49.packetOpcode = Class68_Sub13_Sub8.connectionVector.getPacket();
            Class106.packetSize = Class9.packetSizes[Class49.packetOpcode];
        }
        if (Class106.packetSize == -1)
        {
            if (avail <= 0)
                return false;
            PlayerDefinition.connection.read(1, 0, Class68_Sub13_Sub8.connectionVector.buffer);
            Class106.packetSize = 0xff & Class68_Sub13_Sub8.connectionVector.buffer[0];
            avail--;
        }
        if (Class106.packetSize == -2)
        {
            if (avail > 1)
            {
                avail -= 2;
                PlayerDefinition.connection.read(2, 0, Class68_Sub13_Sub8.connectionVector.buffer);
                Class68_Sub13_Sub8.connectionVector.position = 0;
                Class106.packetSize = Class68_Sub13_Sub8.connectionVector.readUShort();
            } else
                return false;
        }
        if (Class106.packetSize > avail)
            return false;
        Class68_Sub13_Sub8.connectionVector.position = 0;
        PlayerDefinition.connection.read(Class106.packetSize, 0, Class68_Sub13_Sub8.connectionVector.buffer);
        Class68_Sub20_Sub13.anInt4370 = 0;
        Class68_Sub20_Sub7.anInt4254 = Class68_Sub20_Sub6.anInt4242;
        Class68_Sub20_Sub6.anInt4242 = NodeSub.anInt3088;
        NodeSub.anInt3088 = Class49.packetOpcode;
        if (Class49.packetOpcode == 93)
        {
            int i_24_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_25_ = Class68_Sub13_Sub8.connectionVector.readUByteA();
            int i_26_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1684((long) i_26_, 103));
            if (class68_sub3 != null)
                Class68_Sub13_Sub10.method744(class68_sub3, true, (((Class68_Sub3) class68_sub3).anInt2805) != i_24_);
            Class32.method409(i_25_, i_24_, -58, i_26_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 217)
        {
            Class68_Sub13.method701(0);
            int i_27_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
            int i_28_ = Class68_Sub13_Sub8.connectionVector.method932(false);
            int i_29_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
            Class1_Sub5.skillExperiences[i_29_] = i_28_;
            Class30.skillLevels[i_29_] = i_27_;
            Class88.skillLevelMaxes[i_29_] = 1;
            for (int i_30_ = 0; i_30_ < 98; i_30_++)
            {
                if (i_28_ >= GameSocket.skillExperiencesMax[i_30_])
                    Class88.skillLevelMaxes[i_29_] = i_30_ + 2;
            }
            Class68_Sub13_Sub36.anIntArray4046[Class120.method1746(31, Class30.anInt544++)] = i_29_;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 57)
        {
            int i_31_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
            int i_32_ = Class68_Sub13_Sub8.connectionVector.readUByteA();
            int i_33_ = Class68_Sub13_Sub8.connectionVector.readUByteA();
            GameSocket.plane = i_31_ >> 1;
            Class68_Sub7.localPlayer.setPosition(i_32_, i_33_, (i_31_ & 0x1) == 1);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 132)
        {
            Class68_Sub13_Sub11.method747(Class68_Sub13_Sub8.connectionVector.readString(), (byte) 125);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 210)
        {
            if (Class68_Sub13_Sub10.anInt3597 != -1)
                GameException.method1802(89, Class68_Sub13_Sub10.anInt3597, 0);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 41)
        {
            int i_34_ = Class68_Sub13_Sub8.connectionVector.method928(101);
            int i_35_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
            Widget class45 = Class68_Sub20_Sub15.method1170(i_34_, (byte) -80);
            if (class45 != null && ((Widget) class45).type == 0)
            {
                if (((Widget) class45).anInt794 - ((Widget) class45).anInt873 < i_35_)
                    i_35_ = (((Widget) class45).anInt794 - ((Widget) class45).anInt873);
                if (i_35_ < 0)
                    i_35_ = 0;
                if (((Widget) class45).anInt818 != i_35_)
                {
                    ((Widget) class45).anInt818 = i_35_;
                    NodeCache.method1688(class45, -124);
                }
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 223)
        {
            int i_36_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_37_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            if (i_37_ == 65535)
                i_37_ = -1;
            int i_38_ = Class68_Sub13_Sub8.connectionVector.readLEInteger();
            if (i_36_ == 65535)
                i_36_ = -1;
            int i_39_ = Class68_Sub13_Sub8.connectionVector.readLEInteger();
            for (int i_40_ = i_37_; i_40_ <= i_36_; i_40_++)
            {
                long l = ((long) i_38_ << 32) + (long) i_40_;
                Node class68 = Class106.aClass113_1805.method1684(l, -115);
                if (class68 != null)
                    class68.unlink();
                Class106.aClass113_1805.method1683((byte) 120, new Class68_Sub10(i_39_), l);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 115)
        {
            Widget.anInt917 = Class68_Sub13_Sub8.connectionVector.readUByte();
            Keyboard.anInt2132 = Class68_Sub22.anInt3150;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 55)
        {
            Object5.method1328(Class68_Sub13_Sub8.connectionVector, 24);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 117)
        {
            int i_41_ = (Class106.packetSize + ((Stream) Class68_Sub13_Sub8.connectionVector).position);
            int i_42_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_43_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            if (i_42_ != Class68_Sub13_Sub10.anInt3597)
            {
                Class68_Sub13_Sub10.anInt3597 = i_42_;
                Object2.method1406(Class68_Sub13_Sub10.anInt3597, (byte) 108);
                GameCanvas.method47(false, 640);
                Class71.method1340(-1, Class68_Sub13_Sub10.anInt3597);
                for (int i_44_ = 0; i_44_ < 100; i_44_++)
                    Class121.aBooleanArray2111[i_44_] = true;
            }
            while (i_43_-- > 0)
            {
                int i_45_ = Class68_Sub13_Sub8.connectionVector.readInteger();
                int i_46_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                int i_47_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1684((long) i_45_, 82));
                if (class68_sub3 != null && i_46_ != ((Class68_Sub3) class68_sub3).anInt2805)
                {
                    Class68_Sub13_Sub10.method744(class68_sub3, true, true);
                    class68_sub3 = null;
                }
                if (class68_sub3 == null)
                    class68_sub3 = Class32.method409(i_47_, i_46_, i ^ ~0x668c, i_45_);
                ((Class68_Sub3) class68_sub3).aBoolean2810 = true;
            }
            for (Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1685(-32642)); class68_sub3 != null; class68_sub3 = (Class68_Sub3) Login.aClass113_1514.method1689((byte) -122))
            {
                if (((Class68_Sub3) class68_sub3).aBoolean2810)
                    ((Class68_Sub3) class68_sub3).aBoolean2810 = false;
                else
                    Class68_Sub13_Sub10.method744(class68_sub3, true, true);
            }
            Class106.aClass113_1805.method1690(false);
            while (((Stream) Class68_Sub13_Sub8.connectionVector).position < i_41_)
            {
                int i_48_ = Class68_Sub13_Sub8.connectionVector.readInteger();
                int i_49_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                int i_50_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                int i_51_ = Class68_Sub13_Sub8.connectionVector.readInteger();
                for (int i_52_ = i_49_; i_52_ <= i_50_; i_52_++)
                {
                    long l = (long) i_52_ + ((long) i_48_ << 32);
                    Class106.aClass113_1805.method1683((byte) -27, new Class68_Sub10(i_51_), l);
                }
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 64)
        {
            int i_53_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            if (i_53_ == 65535)
                i_53_ = -1;
            int i_54_ = Class68_Sub13_Sub8.connectionVector.method928(i + 26479);
            Widget class45 = Class68_Sub20_Sub15.method1170(i_54_, (byte) -80);
            if (((Widget) class45).notWidgetSelectedModelType != 1 || i_53_ != ((Widget) class45).notWidgetSelectedModelID)
            {
                ((Widget) class45).notWidgetSelectedModelID = i_53_;
                ((Widget) class45).notWidgetSelectedModelType = 1;
                NodeCache.method1688(class45, -116);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 240)
        {
            Class68_Sub13_Sub26.anInt3882 = Class106.packetSize / 8;
            for (int i_55_ = 0; Class68_Sub13_Sub26.anInt3882 > i_55_; i_55_++)
            {
                Class21_Sub1.aLongArray2705[i_55_] = Class68_Sub13_Sub8.connectionVector.readLong();
                Class68_Sub4.aClass100Array2829[i_55_] = Class56.method570(Class21_Sub1.aLongArray2705[i_55_], -1);
            }
            Keyboard.anInt2132 = Class68_Sub22.anInt3150;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 154)
        {
            long l = Class68_Sub13_Sub8.connectionVector.readLong();
            int i_56_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_57_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            MutableString class100 = Class68_Sub28_Sub2.aClass100_4558;
            if (i_56_ > 0)
                class100 = Class68_Sub13_Sub8.connectionVector.readString();
            boolean bool = true;
            if (l < 0L)
            {
                bool = false;
                l &= 0x7fffffffffffffffL;
            }
            MutableString class100_58_ = Class56.method570(l, i ^ 0x66f1).method1603(12688);
            for (int i_59_ = 0; i_59_ < Class32.friendCount; i_59_++)
            {
                if (l == Class68_Sub13_Sub21.friendList[i_59_])
                {
                    if (MRUNodes.friendNodeIDs[i_59_] != i_56_)
                    {
                        MRUNodes.friendNodeIDs[i_59_] = i_56_;
                        if (i_56_ > 0)
                            Class48.method520(Class68_Sub28_Sub2.aClass100_4558, 127, (Class68_Sub20_Sub13_Sub2.method1166(i + 26356, (new MutableString[] { class100_58_, Class127.aClass100_2210 }))), 5);
                        if (i_56_ == 0)
                            Class48.method520(Class68_Sub28_Sub2.aClass100_4558, -38, (Class68_Sub20_Sub13_Sub2.method1166(i + 26356, (new MutableString[] { class100_58_, Class72_Sub1.aClass100_3274 }))), 5);
                    }
                    Ground.aClass100Array2756[i_59_] = class100;
                    class100_58_ = null;
                    Class68_Sub4.anIntArray2830[i_59_] = i_57_;
                    Class68_Sub13_Sub29.aBooleanArray3943[i_59_] = bool;
                    break;
                }
            }
            if (class100_58_ != null && Class32.friendCount < 200)
            {
                Class68_Sub13_Sub21.friendList[Class32.friendCount] = l;
                Class68_Sub13_Sub38.aClass100Array4086[Class32.friendCount] = class100_58_;
                MRUNodes.friendNodeIDs[Class32.friendCount] = i_56_;
                Ground.aClass100Array2756[Class32.friendCount] = class100;
                Class68_Sub4.anIntArray2830[Class32.friendCount] = i_57_;
                Class68_Sub13_Sub29.aBooleanArray3943[Class32.friendCount] = bool;
                Class32.friendCount++;
            }
            Keyboard.anInt2132 = Class68_Sub22.anInt3150;
            int i_60_ = Class32.friendCount;
            boolean bool_61_ = false;
            while (i_60_ > 0)
            {
                bool_61_ = true;
                i_60_--;
                for (int i_62_ = 0; i_62_ < i_60_; i_62_++)
                {
                    if ((MRUNodes.friendNodeIDs[i_62_] != Class106.anInt1801 && (Class106.anInt1801 == MRUNodes.friendNodeIDs[i_62_ + 1])) || (MRUNodes.friendNodeIDs[i_62_] == 0 && MRUNodes.friendNodeIDs[i_62_ + 1] != 0))
                    {
                        int i_63_ = MRUNodes.friendNodeIDs[i_62_];
                        bool_61_ = false;
                        MRUNodes.friendNodeIDs[i_62_] = MRUNodes.friendNodeIDs[i_62_ + 1];
                        MRUNodes.friendNodeIDs[i_62_ + 1] = i_63_;
                        MutableString class100_64_ = Ground.aClass100Array2756[i_62_];
                        Ground.aClass100Array2756[i_62_] = Ground.aClass100Array2756[i_62_ + 1];
                        Ground.aClass100Array2756[i_62_ + 1] = class100_64_;
                        MutableString class100_65_ = Class68_Sub13_Sub38.aClass100Array4086[i_62_];
                        Class68_Sub13_Sub38.aClass100Array4086[i_62_] = (Class68_Sub13_Sub38.aClass100Array4086[i_62_ + 1]);
                        Class68_Sub13_Sub38.aClass100Array4086[i_62_ + 1] = class100_65_;
                        long l_66_ = Class68_Sub13_Sub21.friendList[i_62_];
                        Class68_Sub13_Sub21.friendList[i_62_] = Class68_Sub13_Sub21.friendList[i_62_ + 1];
                        Class68_Sub13_Sub21.friendList[i_62_ + 1] = l_66_;
                        int i_67_ = Class68_Sub4.anIntArray2830[i_62_];
                        Class68_Sub4.anIntArray2830[i_62_] = Class68_Sub4.anIntArray2830[i_62_ + 1];
                        Class68_Sub4.anIntArray2830[i_62_ + 1] = i_67_;
                        boolean bool_68_ = Class68_Sub13_Sub29.aBooleanArray3943[i_62_];
                        Class68_Sub13_Sub29.aBooleanArray3943[i_62_] = Class68_Sub13_Sub29.aBooleanArray3943[i_62_ + 1];
                        Class68_Sub13_Sub29.aBooleanArray3943[i_62_ + 1] = bool_68_;
                    }
                }
                if (bool_61_)
                    break;
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 229)
        {
            long l = Class68_Sub13_Sub8.connectionVector.readLong();
            Class68_Sub13_Sub8.connectionVector.readByte();
            long l_69_ = Class68_Sub13_Sub8.connectionVector.readLong();
            long l_70_ = (long) Class68_Sub13_Sub8.connectionVector.readUShort();
            boolean bool = false;
            long l_71_ = (long) Class68_Sub13_Sub8.connectionVector.readTInteger();
            long l_72_ = l_71_ + (l_70_ << 32);
            int i_73_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            while_155_: do
            {
                for (int i_74_ = 0; i_74_ < 100; i_74_++)
                {
                    if (l_72_ == Class97.aLongArray1713[i_74_])
                    {
                        bool = true;
                        break while_155_;
                    }
                }
                if (i_73_ <= 1)
                {
                    if (Class25.anInt517 == 1 || Class30.anInt552 == 1)
                        bool = true;
                    else
                    {
                        for (int i_75_ = 0; Class68_Sub13_Sub26.anInt3882 > i_75_; i_75_++)
                        {
                            if (Class21_Sub1.aLongArray2705[i_75_] == l)
                            {
                                bool = true;
                                break;
                            }
                        }
                    }
                }
            } while (false);
            if (!bool && ObjectDefinition.anInt2013 == 0)
            {
                Class97.aLongArray1713[GameSocket.anInt1138] = l_72_;
                GameSocket.anInt1138 = (GameSocket.anInt1138 + 1) % 100;
                MutableString class100 = (Class68_Sub20_Sub1.method1009(Class68_Sub19.method996(i + 26266, Class68_Sub13_Sub8.connectionVector).method1622(2)));
                if (i_73_ == 2 || i_73_ == 3)
                    Class8.method203(false, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub4.aClass100_3494, Class56.method570(l, i ^ 0x66f1).method1603(12688) }))), class100, Class56.method570(l_69_, i + 26353).method1603(12688), 9);
                else if (i_73_ != 1)
                    Class8.method203(false, Class56.method570(l, -1).method1603(12688), class100, Class56.method570(l_69_, -1).method1603(12688), 9);
                else
                    Class8.method203(false, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub27.aClass100_3904, Class56.method570(l, -1).method1603(12688) }))), class100, Class56.method570(l_69_, -1).method1603(i ^ ~0x5761), 9);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 124)
        {
            Class68_Sub28_Sub1.anInt4493 = Class68_Sub13_Sub8.connectionVector.readUByteC();
            Class93.anInt1670 = Class68_Sub13_Sub8.connectionVector.readUByteS();
            while (Class106.packetSize > ((Stream) Class68_Sub13_Sub8.connectionVector).position)
            {
                Class49.packetOpcode = Class68_Sub13_Sub8.connectionVector.readUByte();
                Class68_Sub13_Sub18.method789(-1);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 29 || Class49.packetOpcode == 232 || Class49.packetOpcode == 50 || Class49.packetOpcode == 21 || Class49.packetOpcode == 75 || Class49.packetOpcode == 248 || Class49.packetOpcode == 112 || Class49.packetOpcode == 201 || Class49.packetOpcode == 25 || Class49.packetOpcode == 110 || Class49.packetOpcode == 196 || Class49.packetOpcode == 30)
        {
            Class68_Sub13_Sub18.method789(-1);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 121)
        {
            long l = Class68_Sub13_Sub8.connectionVector.readLong();
            int i_76_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            byte i_77_ = Class68_Sub13_Sub8.connectionVector.readByte();
            boolean bool = false;
            if ((l & ~0x7fffffffffffffffL) != 0L)
                bool = true;
            if (bool)
            {
                if (Class68_Sub20_Sub8.anInt4280 == 0)
                {
                    Class49.packetOpcode = -1;
                    return true;
                }
                l &= 0x7fffffffffffffffL;
                boolean bool_78_ = false;
                int i_79_;
                for (i_79_ = 0; Class68_Sub20_Sub8.anInt4280 > i_79_; i_79_++)
                {
                    if ((((Node) (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_79_])).nodeID) == l && i_76_ == ((Class68_Sub19) (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_79_])).anInt3069)
                        break;
                }
                if (i_79_ < Class68_Sub20_Sub8.anInt4280)
                {
                    for (/**/; i_79_ < Class68_Sub20_Sub8.anInt4280 - 1; i_79_++)
                        Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_79_] = (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_79_ + 1]);
                    Class68_Sub20_Sub8.anInt4280--;
                    Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[Class68_Sub20_Sub8.anInt4280] = null;
                }
            } else
            {
                MutableString class100 = Class68_Sub13_Sub8.connectionVector.readString();
                Class68_Sub19 class68_sub19 = new Class68_Sub19();
                ((Node) class68_sub19).nodeID = l;
                ((Class68_Sub19) class68_sub19).aClass100_3075 = Class56.method570(((Node) class68_sub19).nodeID, i + 26353);
                ((Class68_Sub19) class68_sub19).anInt3069 = i_76_;
                ((Class68_Sub19) class68_sub19).aClass100_3078 = class100;
                ((Class68_Sub19) class68_sub19).aByte3077 = i_77_;
                int i_80_;
                for (i_80_ = Class68_Sub20_Sub8.anInt4280 - 1; i_80_ >= 0; i_80_--)
                {
                    int i_81_ = (((Class68_Sub19) (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_80_])).aClass100_3075.method1620(false, ((Class68_Sub19) class68_sub19).aClass100_3075));
                    if (i_81_ == 0)
                    {
                        ((Class68_Sub19) (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_80_])).anInt3069 = i_76_;
                        ((Class68_Sub19) (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_80_])).aByte3077 = i_77_;
                        ((Class68_Sub19) (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_80_])).aClass100_3078 = class100;
                        if (l == Class72_Sub1.aLong3287)
                            Node.aByte1225 = i_77_;
                        Class49.packetOpcode = -1;
                        Class68_Sub28_Sub2.anInt4549 = Class68_Sub22.anInt3150;
                        return true;
                    }
                    if (i_81_ < 0)
                        break;
                }
                if (Class68_Sub20_Sub8.anInt4280 >= (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632).length)
                {
                    Class49.packetOpcode = -1;
                    return true;
                }
                for (int i_82_ = Class68_Sub20_Sub8.anInt4280 - 1; i_80_ < i_82_; i_82_--)
                    Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_82_ + 1] = (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_82_]);
                if (Class68_Sub20_Sub8.anInt4280 == 0)
                    Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632 = new Class68_Sub19[100];
                Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_80_ + 1] = class68_sub19;
                if (l == Class72_Sub1.aLong3287)
                    Node.aByte1225 = i_77_;
                Class68_Sub20_Sub8.anInt4280++;
            }
            Class49.packetOpcode = -1;
            Class68_Sub28_Sub2.anInt4549 = Class68_Sub22.anInt3150;
            return true;
        }
        if (Class49.packetOpcode == 89)
        {
            long l = Class68_Sub13_Sub8.connectionVector.readLong();
            MutableString class100 = (Class68_Sub20_Sub1.method1009(Class68_Sub19.method996(25, Class68_Sub13_Sub8.connectionVector).method1622(2)));
            Class48.method520(Class56.method570(l, -1).method1603(12688), -67, class100, 6);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 142)
        {
            Class68_Sub13_Sub15.parseMapData(false);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 149)
        {
            long l = Class68_Sub13_Sub8.connectionVector.readLong();
            long l_83_ = (long) Class68_Sub13_Sub8.connectionVector.readUShort();
            long l_84_ = (long) Class68_Sub13_Sub8.connectionVector.readTInteger();
            long l_85_ = l_84_ + (l_83_ << 32);
            int i_86_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            boolean bool = false;
            int i_87_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            while_156_: do
            {
                for (int i_88_ = 0; i_88_ < 100; i_88_++)
                {
                    if (Class97.aLongArray1713[i_88_] == l_85_)
                    {
                        bool = true;
                        break while_156_;
                    }
                }
                if (i_86_ <= 1)
                {
                    for (int i_89_ = 0; Class68_Sub13_Sub26.anInt3882 > i_89_; i_89_++)
                    {
                        if (l == Class21_Sub1.aLongArray2705[i_89_])
                        {
                            bool = true;
                            break;
                        }
                    }
                }
            } while (false);
            if (!bool && ObjectDefinition.anInt2013 == 0)
            {
                Class97.aLongArray1713[GameSocket.anInt1138] = l_85_;
                GameSocket.anInt1138 = (GameSocket.anInt1138 + 1) % 100;
                MutableString class100 = (Class118.method1737(i_87_, (byte) 76).method1093(-90, Class68_Sub13_Sub8.connectionVector));
                if (i_86_ == 2)
                    Class25.method386(null, -19596, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub4.aClass100_3494, Class56.method570(l, -1).method1603(i ^ ~0x5761) }))), i_87_, 18, class100);
                else if (i_86_ != 1)
                    Class25.method386(null, -19596, Class56.method570(l, -1).method1603(12688), i_87_, 18, class100);
                else
                    Class25.method386(null, -19596, (Class68_Sub20_Sub13_Sub2.method1166(i + 26356, (new MutableString[] { Class68_Sub13_Sub27.aClass100_3904, Class56.method570(l, i + 26353).method1603(12688) }))), i_87_, 18, class100);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 186)
        {
            GroundData.publicChatMode = Class68_Sub13_Sub8.connectionVector.readUByte();
            Class68_Sub13_Sub4.anInt3499 = Class68_Sub13_Sub8.connectionVector.readUByte();
            Class68_Sub4.anInt2815 = Class68_Sub13_Sub8.connectionVector.readUByte();
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 195)
        {
            int i_90_ = Class68_Sub13_Sub8.connectionVector.method928(126);
            int i_91_ = (i_90_ & 0x32edbabc) >> 28;
            int i_92_ = 0x3fff & i_90_ >> 14;
            int i_93_ = 0x3fff & i_90_;
            int i_94_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            if (i_94_ == 65535)
                i_94_ = -1;
            int i_95_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            i_92_ -= Class36.baseX;
            int i_96_ = 0x3 & i_95_;
            int i_97_ = i_95_ >> 2;
            i_93_ -= Class68_Sub13_Sub35.baseY;
            int i_98_ = Class12.anIntArray201[i_97_];
            Class43.method483(i_93_, i_97_, i_91_, i_96_, i_92_, (byte) 126, i_94_, i_98_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 156)
        {
            int i_99_ = Class68_Sub13_Sub8.connectionVector.readLEInteger();
            int i_100_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
            int i_101_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            Class68_Sub13_Sub38.method900(-31, i_101_);
            Class68_Sub13_Sub28.method846(i_99_, 93, i_100_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 101)
        {
            int i_102_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            Widget class45 = Class68_Sub20_Sub15.method1170(i_102_, (byte) -80);
            ((Widget) class45).notWidgetSelectedModelType = 3;
            ((Widget) class45).notWidgetSelectedModelID = ((Player) Class68_Sub7.localPlayer).definition.method1780(true);
            NodeCache.method1688(class45, -128);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 176)
        {
            long l = Class68_Sub13_Sub8.connectionVector.readLong();
            Class68_Sub13_Sub8.connectionVector.readByte();
            long l_103_ = Class68_Sub13_Sub8.connectionVector.readLong();
            long l_104_ = (long) Class68_Sub13_Sub8.connectionVector.readUShort();
            long l_105_ = (long) Class68_Sub13_Sub8.connectionVector.readTInteger();
            int i_106_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_107_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            long l_108_ = l_105_ + (l_104_ << 32);
            boolean bool = false;
            while_157_: do
            {
                for (int i_109_ = 0; i_109_ < 100; i_109_++)
                {
                    if (Class97.aLongArray1713[i_109_] == l_108_)
                    {
                        bool = true;
                        break while_157_;
                    }
                }
                if (i_106_ <= 1)
                {
                    for (int i_110_ = 0; i_110_ < Class68_Sub13_Sub26.anInt3882; i_110_++)
                    {
                        if (Class21_Sub1.aLongArray2705[i_110_] == l)
                        {
                            bool = true;
                            break;
                        }
                    }
                }
            } while (false);
            if (!bool && ObjectDefinition.anInt2013 == 0)
            {
                Class97.aLongArray1713[GameSocket.anInt1138] = l_108_;
                GameSocket.anInt1138 = (GameSocket.anInt1138 + 1) % 100;
                MutableString class100 = (Class118.method1737(i_107_, (byte) 101).method1093(-37, Class68_Sub13_Sub8.connectionVector));
                if (i_106_ != 2 && i_106_ != 3)
                {
                    if (i_106_ != 1)
                        Class25.method386(Class56.method570(l_103_, -1).method1603(12688), -19596, Class56.method570(l, -1).method1603(12688), i_107_, 20, class100);
                    else
                        Class25.method386(Class56.method570(l_103_, i + 26353).method1603(i + 39042), -19596, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub27.aClass100_3904), Class56.method570(l, -1).method1603(12688) }))), i_107_, 20, class100);
                } else
                    Class25.method386(Class56.method570(l_103_, -1).method1603(12688), -19596, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub4.aClass100_3494, Class56.method570(l, -1).method1603(12688) }))), i_107_, 20, class100);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 139)
        {
            Class12.method238(Class75_Sub1_Sub1.signlink, Class68_Sub13_Sub8.connectionVector, Class106.packetSize, (byte) 101);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 12)
        {
            int i_111_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_112_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_113_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_114_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_115_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            Object5.aBooleanArray1237[i_111_] = true;
            Class121.anIntArray2112[i_111_] = i_112_;
            Class11.anIntArray196[i_111_] = i_113_;
            Class68_Sub13_Sub29.anIntArray3937[i_111_] = i_114_;
            Class68_Sub13_Sub16.anIntArray3699[i_111_] = i_115_;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 178)
        {
            long l = Class68_Sub13_Sub8.connectionVector.readLong();
            long l_116_ = (long) Class68_Sub13_Sub8.connectionVector.readUShort();
            boolean bool = false;
            long l_117_ = (long) Class68_Sub13_Sub8.connectionVector.readTInteger();
            int i_118_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            long l_119_ = (l_116_ << 32) + l_117_;
            while_158_: do
            {
                for (int i_120_ = 0; i_120_ < 100; i_120_++)
                {
                    if (Class97.aLongArray1713[i_120_] == l_119_)
                    {
                        bool = true;
                        break while_158_;
                    }
                }
                if (i_118_ <= 1)
                {
                    if (Class25.anInt517 == 1 || Class30.anInt552 == 1)
                        bool = true;
                    else
                    {
                        for (int i_121_ = 0; Class68_Sub13_Sub26.anInt3882 > i_121_; i_121_++)
                        {
                            if (l == Class21_Sub1.aLongArray2705[i_121_])
                            {
                                bool = true;
                                break;
                            }
                        }
                    }
                }
            } while (false);
            if (!bool && ObjectDefinition.anInt2013 == 0)
            {
                Class97.aLongArray1713[GameSocket.anInt1138] = l_119_;
                GameSocket.anInt1138 = (GameSocket.anInt1138 + 1) % 100;
                MutableString class100 = (Class68_Sub20_Sub1.method1009(Class68_Sub19.method996(27, Class68_Sub13_Sub8.connectionVector).method1622(2)));
                if (i_118_ == 2 || i_118_ == 3)
                    Class48.method520((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub4.aClass100_3494, Class56.method570(l, -1).method1603(12688) }))), 126, class100, 7);
                else if (i_118_ == 1)
                    Class48.method520((Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub27.aClass100_3904, Class56.method570(l, i + 26353).method1603(12688) }))), 125, class100, 7);
                else
                    Class48.method520(Class56.method570(l, -1).method1603(i + 39042), i ^ 0x668b, class100, 3);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 179)
        {
            MutableString class100 = Class68_Sub13_Sub8.connectionVector.readString();
            int i_122_ = Class68_Sub13_Sub8.connectionVector.method928(i ^ ~0x6693);
            Widget class45 = Class68_Sub20_Sub15.method1170(i_122_, (byte) -80);
            if (!class100.equalTo(((Widget) class45).text))
            {
                ((Widget) class45).text = class100;
                NodeCache.method1688(class45, -115);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 100)
        {
            int i_123_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
            byte i_124_ = Class68_Sub13_Sub8.connectionVector.readByteA();
            Class66.method638(i + 26474, i_124_, i_123_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 104)
        {
            Class68_Sub3.method651((byte) -127);
            Class49.packetOpcode = -1;
            return false;
        }
        if (Class49.packetOpcode == 146)
        {
            int i_125_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            if (i_125_ == 65535)
                i_125_ = -1;
            Class1_Sub1.method63(79, i_125_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 251)
        {
            int i_126_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            int i_127_ = Class68_Sub13_Sub8.connectionVector.method930(false);
            if (i_126_ == 65535)
                i_126_ = -1;
            Class68_Sub13_Sub28.method844((byte) 106, i_127_, i_126_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 56)
        {
            Class11.method232(-10937);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 239)
        {
            int i_128_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_129_ = Class68_Sub13_Sub8.connectionVector.readUByteA();
            if (i_129_ == 2)
                Object5.method1327(25);
            Class68_Sub13_Sub10.anInt3597 = i_128_;
            Object2.method1406(i_128_, (byte) 126);
            GameCanvas.method47(false, 640);
            Class71.method1340(i ^ 0x66f1, Class68_Sub13_Sub10.anInt3597);
            for (int i_130_ = 0; i_130_ < 100; i_130_++)
                Class121.aBooleanArray2111[i_130_] = true;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 135)
        {
            int i_131_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            int i_132_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            Widget class45;
            if (i_131_ >= 0)
                class45 = Class68_Sub20_Sub15.method1170(i_131_, (byte) -80);
            else
                class45 = null;
            if (i_131_ < -70000)
                i_132_ += 32768;
            while (((Stream) Class68_Sub13_Sub8.connectionVector).position < Class106.packetSize)
            {
                int i_133_ = Class68_Sub13_Sub8.connectionVector.method912(255);
                int i_134_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                int i_135_ = 0;
                if (i_134_ != 0)
                {
                    i_135_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                    if (i_135_ == 255)
                        i_135_ = Class68_Sub13_Sub8.connectionVector.readInteger();
                }
                if (class45 != null && i_133_ >= 0 && i_133_ < ((Widget) class45).inventory.length)
                {
                    ((Widget) class45).inventory[i_133_] = i_134_;
                    ((Widget) class45).inventoryStackSizes[i_133_] = i_135_;
                }
                NodeSubList.method1798(i_133_, i_135_, (byte) -67, i_132_, i_134_ - 1);
            }
            if (class45 != null)
                NodeCache.method1688(class45, i + 26234);
            Class68_Sub13.method701(0);
            Class68_Sub13_Sub39.anIntArray4104[Class120.method1746(31, ScriptParameters.anInt3245++)] = Class120.method1746(32767, i_132_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 120)
        {
            int i_136_ = Class68_Sub13_Sub8.connectionVector.readShort();
            int i_137_ = Class68_Sub13_Sub8.connectionVector.method932(false);
            int i_138_ = Class68_Sub13_Sub8.connectionVector.readShort();
            Widget class45 = Class68_Sub20_Sub15.method1170(i_137_, (byte) -80);
            ((Widget) class45).y = ((Widget) class45).anInt914 = i_138_;
            ((Widget) class45).aByte820 = (byte) 0;
            ((Widget) class45).aByte904 = (byte) 0;
            ((Widget) class45).x = ((Widget) class45).anInt810 = i_136_;
            NodeCache.method1688(class45, i + 26228);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 234)
        {
            long l = Class68_Sub13_Sub8.connectionVector.readLong();
            int i_139_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            MutableString class100 = (Class118.method1737(i_139_, (byte) 96).method1093(114, Class68_Sub13_Sub8.connectionVector));
            Class25.method386(null, -19596, Class56.method570(l, -1).method1603(12688), i_139_, 19, class100);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 184)
        {
            int i_140_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            int i_141_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            int i_142_ = i_141_ & 0x1f;
            int i_143_ = (i_141_ & 0x7ebf) >> 10;
            int i_144_ = (i_141_ & 0x3ff) >> 5;
            int i_145_ = (i_143_ << 19) + ((i_144_ << 11) + (i_142_ << 3));
            Widget class45 = Class68_Sub20_Sub15.method1170(i_140_, (byte) -80);
            if (((Widget) class45).textColor != i_145_)
            {
                ((Widget) class45).textColor = i_145_;
                NodeCache.method1688(class45, -123);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 137)
        {
            int i_146_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            if (Class68_Sub13_Sub8.connectionVector.readUByte() == 0)
                Class63.aClass49Array1171[i_146_] = new Class49();
            else
            {
                ((Stream) Class68_Sub13_Sub8.connectionVector).position--;
                Class63.aClass49Array1171[i_146_] = new Class49(Class68_Sub13_Sub8.connectionVector);
            }
            Class4.anInt93 = Class68_Sub22.anInt3150;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 249)
        {
            Class68_Sub28_Sub1.anInt4493 = Class68_Sub13_Sub8.connectionVector.readUByte();
            Class93.anInt1670 = Class68_Sub13_Sub8.connectionVector.readUByte();
            for (int i_147_ = Class93.anInt1670; Class93.anInt1670 + 8 > i_147_; i_147_++)
            {
                for (int i_148_ = Class68_Sub28_Sub1.anInt4493; i_148_ < Class68_Sub28_Sub1.anInt4493 + 8; i_148_++)
                {
                    if ((Widget.groundItems[GameSocket.plane][i_147_][i_148_]) != null)
                    {
                        Widget.groundItems[GameSocket.plane][i_147_][i_148_] = null;
                        Class68_Sub20_Sub9.method1100(i_147_, (byte) -52, i_148_);
                    }
                }
            }
            for (Class68_Sub2 class68_sub2 = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method293((byte) 76); class68_sub2 != null; class68_sub2 = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method290((byte) -105))
            {
                if ((((Class68_Sub2) class68_sub2).anInt2793 >= Class93.anInt1670) && (Class93.anInt1670 + 8 > ((Class68_Sub2) class68_sub2).anInt2793) && (((Class68_Sub2) class68_sub2).anInt2786 >= Class68_Sub28_Sub1.anInt4493) && (Class68_Sub28_Sub1.anInt4493 + 8 > ((Class68_Sub2) class68_sub2).anInt2786) && (((Class68_Sub2) class68_sub2).anInt2791 == GameSocket.plane))
                    ((Class68_Sub2) class68_sub2).anInt2797 = 0;
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 119)
        {
            int i_149_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            if (i_149_ == 65535)
                i_149_ = -1;
            int i_150_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_151_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            Object4.method575((byte) 122, i_151_, i_150_, i_149_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 170)
        {
            MutableString class100 = Class68_Sub13_Sub8.connectionVector.readString();
            int i_152_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            int i_153_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            Class68_Sub13_Sub38.method900(-21, i_152_);
            Class68_Sub13_Sub7.method730((byte) 120, i_153_, class100);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 222)
        {
            Class72.updateLocalNPCs();
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 8)
        {
            Class104.anInt1786 = 30 * Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            Class68_Sub20_Sub5.anInt4222 = Class68_Sub22.anInt3150;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 219)
        {
            int i_154_ = Class68_Sub13_Sub8.connectionVector.method928(19);
            Widget class45 = Class68_Sub20_Sub15.method1170(i_154_, (byte) -80);
            for (int i_155_ = 0; i_155_ < ((Widget) class45).inventory.length; i_155_++)
            {
                ((Widget) class45).inventory[i_155_] = -1;
                ((Widget) class45).inventory[i_155_] = 0;
            }
            NodeCache.method1688(class45, i + 26236);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 172)
        {
            int i_156_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            Class68_Sub10.aClass31_2916 = Class75_Sub1_Sub1.signlink.method563(i_156_, i + 26354);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 82)
        {
            Class68_Sub28_Sub2.anInt4549 = Class68_Sub22.anInt3150;
            long l = Class68_Sub13_Sub8.connectionVector.readLong();
            if (l == 0L)
            {
                Class68_Sub20_Sub8.anInt4280 = 0;
                Class49.packetOpcode = -1;
                Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632 = null;
                Object5.aClass100_1251 = null;
                Class90.aClass100_2353 = null;
                return true;
            }
            long l_157_ = Class68_Sub13_Sub8.connectionVector.readLong();
            Object5.aClass100_1251 = Class56.method570(l_157_, i + 26353);
            Class90.aClass100_2353 = Class56.method570(l, i + 26353);
            Animation.aByte2073 = Class68_Sub13_Sub8.connectionVector.readByte();
            int i_158_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            if (i_158_ == 255)
            {
                Class49.packetOpcode = -1;
                return true;
            }
            Class68_Sub20_Sub8.anInt4280 = i_158_;
            Class68_Sub19[] class68_sub19s = new Class68_Sub19[100];
            for (int i_159_ = 0; Class68_Sub20_Sub8.anInt4280 > i_159_; i_159_++)
            {
                class68_sub19s[i_159_] = new Class68_Sub19();
                ((Node) class68_sub19s[i_159_]).nodeID = Class68_Sub13_Sub8.connectionVector.readLong();
                ((Class68_Sub19) class68_sub19s[i_159_]).aClass100_3075 = Class56.method570((((Node) class68_sub19s[i_159_]).nodeID), -1);
                ((Class68_Sub19) class68_sub19s[i_159_]).anInt3069 = Class68_Sub13_Sub8.connectionVector.readUShort();
                ((Class68_Sub19) class68_sub19s[i_159_]).aByte3077 = Class68_Sub13_Sub8.connectionVector.readByte();
                ((Class68_Sub19) class68_sub19s[i_159_]).aClass100_3078 = Class68_Sub13_Sub8.connectionVector.readString();
                if (((Node) class68_sub19s[i_159_]).nodeID == Class72_Sub1.aLong3287)
                    Node.aByte1225 = ((Class68_Sub19) class68_sub19s[i_159_]).aByte3077;
            }
            boolean bool = false;
            int i_160_ = Class68_Sub20_Sub8.anInt4280;
            while (i_160_ > 0)
            {
                i_160_--;
                bool = true;
                for (int i_161_ = 0; i_160_ > i_161_; i_161_++)
                {
                    if ((((Class68_Sub19) class68_sub19s[i_161_]).aClass100_3075.method1620(false, (((Class68_Sub19) class68_sub19s[i_161_ + 1]).aClass100_3075))) > 0)
                    {
                        Class68_Sub19 class68_sub19 = class68_sub19s[i_161_];
                        bool = false;
                        class68_sub19s[i_161_] = class68_sub19s[i_161_ + 1];
                        class68_sub19s[i_161_ + 1] = class68_sub19;
                    }
                }
                if (bool)
                    break;
            }
            Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632 = class68_sub19s;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 40)
        {
            int i_162_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_163_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
            NodeList.anInt275 = i_163_;
            Class8.minimapInt2 = i_162_;
            Class68_Sub13_Sub20.method799((byte) -100);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 37)
        {
            Class68_Sub13.method701(0);
            Class75_Sub3.anInt3332 = Class68_Sub13_Sub8.connectionVector.readShort();
            Class68_Sub20_Sub5.anInt4222 = Class68_Sub22.anInt3150;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 59)
        {
            boolean bool = (Class68_Sub13_Sub8.connectionVector.readUByteC() == 1);
            int i_164_ = Class68_Sub13_Sub8.connectionVector.method928(16);
            Widget class45 = Class68_Sub20_Sub15.method1170(i_164_, (byte) -80);
            if (((Widget) class45).aBoolean764 == !bool)
            {
                ((Widget) class45).aBoolean764 = bool;
                NodeCache.method1688(class45, -120);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 226)
        {
            Class68_Sub9.anInt2884 = Class68_Sub13_Sub8.connectionVector.readUByte();
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 247)
        {
            int i_165_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
            int i_166_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
            int i_167_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            Class68_Sub13_Sub38.method900(-119, i_165_);
            Class68_Sub13_Sub28.method846(i_166_, i + 26475, i_167_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 177)
        {
            Class68_Sub28_Sub1.anInt4493 = Class68_Sub13_Sub8.connectionVector.readUByte();
            Class93.anInt1670 = Class68_Sub13_Sub8.connectionVector.readUByteS();
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 140)
        {
            int i_168_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_169_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            int i_170_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
            int i_171_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            if (i_169_ >> 30 == 0)
            {
                if (i_169_ >> 29 != 0)
                {
                    int i_172_ = i_169_ & 0xffff;
                    NPC class1_sub6_sub1 = Class102.localNPCs[i_172_];
                    if (class1_sub6_sub1 != null)
                    {
                        ((Character) class1_sub6_sub1).anInt2588 = 0;
                        ((Character) class1_sub6_sub1).anInt2554 = i_170_;
                        if (((Character) class1_sub6_sub1).anInt2554 == 65535)
                            ((Character) class1_sub6_sub1).anInt2554 = -1;
                        ((Character) class1_sub6_sub1).anInt2580 = 0;
                        ((Character) class1_sub6_sub1).anInt2562 = i_171_;
                        ((Character) class1_sub6_sub1).anInt2543 = Class68_Sub3.loopCycle + i_168_;
                        if (((Character) class1_sub6_sub1).anInt2543 > Class68_Sub3.loopCycle)
                            ((Character) class1_sub6_sub1).anInt2580 = -1;
                    }
                } else if (i_169_ >> 28 != 0)
                {
                    int i_173_ = 0xffff & i_169_;
                    Player class1_sub6_sub2;
                    if (Class68_Sub10.localPlayerInteractingEntity != i_173_)
                        class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_173_]);
                    else
                        class1_sub6_sub2 = Class68_Sub7.localPlayer;
                    if (class1_sub6_sub2 != null)
                    {
                        ((Character) class1_sub6_sub2).anInt2543 = i_168_ + Class68_Sub3.loopCycle;
                        ((Character) class1_sub6_sub2).anInt2554 = i_170_;
                        ((Character) class1_sub6_sub2).anInt2562 = i_171_;
                        if (((Character) class1_sub6_sub2).anInt2554 == 65535)
                            ((Character) class1_sub6_sub2).anInt2554 = -1;
                        ((Character) class1_sub6_sub2).anInt2588 = 0;
                        ((Character) class1_sub6_sub2).anInt2580 = 0;
                        if (((Character) class1_sub6_sub2).anInt2543 > Class68_Sub3.loopCycle)
                            ((Character) class1_sub6_sub2).anInt2580 = -1;
                    }
                }
            } else
            {
                int i_174_ = i_169_ >> 28 & 0x3;
                int i_175_ = (0x3fff & i_169_ >> 14) - Class36.baseX;
                int i_176_ = (i_169_ & 0x3fff) - Class68_Sub13_Sub35.baseY;
                if (i_175_ >= 0 && i_176_ >= 0 && i_175_ < 104 && i_176_ < 104)
                {
                    i_175_ = 128 * i_175_ + 64;
                    i_176_ = i_176_ * 128 + 64;
                    Class1_Sub5 class1_sub5 = new Class1_Sub5(i_170_, i_174_, i_175_, i_176_, (Player.fixZ(i_175_, i_174_, i_176_) - i_171_), i_168_, Class68_Sub3.loopCycle);
                    Class105.aClass16_1792.pushFront(new Class68_Sub20_Sub5(class1_sub5));
                }
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 174)
        {
            int i_177_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_178_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
            int i_179_ = Class68_Sub13_Sub8.connectionVector.method932(false);
            Widget class45 = Class68_Sub20_Sub15.method1170(i_179_, (byte) -80);
            Class49.packetOpcode = -1;
            ((Widget) class45).anInt910 = (i_177_ << 16) + i_178_;
            return true;
        }
        if (Class49.packetOpcode == 216)
        {
            Class95.updateLocalPlayers();
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 245)
        {
            int i_180_ = Class68_Sub13_Sub8.connectionVector.method932(false);
            int i_181_ = Class68_Sub13_Sub8.connectionVector.readShort();
            Widget class45 = Class68_Sub20_Sub15.method1170(i_180_, (byte) -80);
            if (((Widget) class45).anInt831 != i_181_ || i_181_ == -1)
            {
                ((Widget) class45).anInt771 = 0;
                ((Widget) class45).anInt831 = i_181_;
                ((Widget) class45).anInt756 = 0;
                NodeCache.method1688(class45, -122);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 118)
        {
            int i_182_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            int i_183_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1684((long) i_182_, 88));
            Class68_Sub3 class68_sub3_184_ = ((Class68_Sub3) Login.aClass113_1514.method1684((long) i_183_, 111));
            if (class68_sub3_184_ != null)
                Class68_Sub13_Sub10.method744(class68_sub3_184_, true, (class68_sub3 == null || (((Class68_Sub3) class68_sub3).anInt2805 != ((Class68_Sub3) class68_sub3_184_).anInt2805)));
            if (class68_sub3 != null)
            {
                class68_sub3.unlink();
                Login.aClass113_1514.method1683((byte) 127, class68_sub3, (long) i_183_);
            }
            Widget class45 = Class68_Sub20_Sub15.method1170(i_182_, (byte) -80);
            if (class45 != null)
                NodeCache.method1688(class45, -115);
            class45 = Class68_Sub20_Sub15.method1170(i_183_, (byte) -80);
            if (class45 != null)
            {
                NodeCache.method1688(class45, -122);
                Class68_Sub13_Sub27.method838(-1, true, class45);
            }
            if (Class68_Sub13_Sub10.anInt3597 != -1)
                GameException.method1802(i + 26449, Class68_Sub13_Sub10.anInt3597, 1);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 211)
        {
            int i_185_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_186_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_187_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_188_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_189_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            Class68_Sub13_Sub33.method867(i_185_, i_186_, i_189_, i_188_, -118, i_187_, true);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 10)
        {
            int i_190_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
            int i_191_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            int i_192_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            NPC class1_sub6_sub1 = Class102.localNPCs[i_192_];
            if (class1_sub6_sub1 != null)
                Class101.method1631(0, i_191_, class1_sub6_sub1, i_190_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 108)
        {
            Class119.method1741(i + 26430);
            Class68_Sub13.method701(0);
            Class68_Sub4.anInt2817 += 32;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 252)
        {
            int i_193_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
            MutableString class100 = Class68_Sub13_Sub8.connectionVector.readString();
            int i_194_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
            if (i_194_ >= 1 && i_194_ <= 8)
            {
                if (class100.method1606(false, Class68_Sub13_Sub32.aClass100_3984))
                    class100 = null;
                Class127.aClass100Array2209[i_194_ - 1] = class100;
                Class118.aBooleanArray2080[i_194_ - 1] = i_193_ == 0;
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 49)
        {
            int i_195_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
            int i_196_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_197_ = Class68_Sub13_Sub8.connectionVector.readLEInteger();
            int i_198_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
            Widget class45 = Class68_Sub20_Sub15.method1170(i_197_, (byte) -80);
            if (i_195_ != ((Widget) class45).anInt864 || i_198_ != ((Widget) class45).anInt814 || ((Widget) class45).anInt762 != i_196_)
            {
                ((Widget) class45).anInt762 = i_196_;
                ((Widget) class45).anInt864 = i_195_;
                ((Widget) class45).anInt814 = i_198_;
                NodeCache.method1688(class45, -120);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 152)
        {
            MutableString class100 = Class68_Sub13_Sub8.connectionVector.readString();
            Object[] objects = new Object[class100.getLength() + 1];
            for (int i_199_ = class100.getLength() - 1; i_199_ >= 0; i_199_--)
            {
                if (class100.charAt(i_199_) == 115)
                    objects[i_199_ + 1] = Class68_Sub13_Sub8.connectionVector.readString();
                else
                    objects[i_199_ + 1] = new Integer(Class68_Sub13_Sub8.connectionVector.readInteger());
            }
            objects[0] = new Integer(Class68_Sub13_Sub8.connectionVector.readInteger());
            ScriptParameters class68_sub29 = new ScriptParameters();
            ((ScriptParameters) class68_sub29).parameters = objects;
            Class68_Sub13_Sub16.method776(class68_sub29, 16);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 173)
        {
            Class68_Sub13_Sub15.parseMapData(true);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 109)
        {
            int i_200_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            int i_201_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
            Class13_Sub3.method261(i ^ ~0x66f1, i_200_, i_201_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 193)
        {
            int i_202_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_203_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_204_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_205_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_206_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            Class68_Sub13_Sub24.method819(i_205_, i_204_, i_202_, true, i_203_, i_206_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 38)
        {
            for (int i_207_ = 0; Class103.settingArray.length > i_207_; i_207_++)
            {
                if (Class103.settingArray[i_207_] != Class3.anIntArray79[i_207_])
                {
                    Class103.settingArray[i_207_] = Class3.anIntArray79[i_207_];
                    Class68_Sub13_Sub35.method878((byte) 67, i_207_);
                    Class68_Sub13_Sub34.anIntArray4014[Class120.method1746(Class68_Sub4.anInt2817++, 31)] = i_207_;
                }
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 6)
        {
            int i_208_ = Class68_Sub13_Sub8.connectionVector.method932(false);
            int i_209_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
            Widget class45 = Class68_Sub20_Sub15.method1170(i_208_, (byte) -80);
            if (i_209_ == 65535)
                i_209_ = -1;
            if (((Widget) class45).notWidgetSelectedModelType != 2 || ((Widget) class45).notWidgetSelectedModelID != i_209_)
            {
                ((Widget) class45).notWidgetSelectedModelID = i_209_;
                ((Widget) class45).notWidgetSelectedModelType = 2;
                NodeCache.method1688(class45, -113);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 205)
        {
            if (Class106.packetSize == 0)
                Class37.aClass100_653 = Class68_Sub13_Sub33.aClass100_3989;
            else
                Class37.aClass100_653 = Class68_Sub13_Sub8.connectionVector.readString();
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 218)
        {
            MutableString class100 = Class68_Sub13_Sub8.connectionVector.readString();
            if (!class100.method1579(Class68_Sub13.aClass100_2924, true))
            {
                if (!class100.method1579(Class8.aClass100_165, true))
                {
                    if (class100.method1579(Class68_Sub22.aClass100_3148, true))
                    {
                        MutableString class100_210_ = (class100.method1613(0, (byte) -74, class100.method1601(83, Class13.aClass100_218)));
                        long l = class100_210_.method1615(10908);
                        boolean bool = false;
                        for (int i_211_ = 0; i_211_ < Class68_Sub13_Sub26.anInt3882; i_211_++)
                        {
                            if (l == Class21_Sub1.aLongArray2705[i_211_])
                            {
                                bool = true;
                                break;
                            }
                        }
                        if (!bool && ObjectDefinition.anInt2013 == 0)
                            Class48.method520(class100_210_, -110, (Class68_Sub28_Sub2.aClass100_4558), 10);
                    } else if (class100.method1579(Class83.aClass100_1530, true))
                    {
                        MutableString class100_212_ = (class100.method1613(0, (byte) -74, class100.method1601(-71, Class83.aClass100_1530)));
                        Class48.method520(Class68_Sub28_Sub2.aClass100_4558, 126, class100_212_, 11);
                    } else if (!class100.method1579(Class127.aClass100_2213, true))
                    {
                        if (!class100.method1579(Class104.aClass100_1779, true))
                        {
                            if (class100.method1579((Class68_Sub20_Sub11.aClass100_4325), true))
                            {
                                MutableString class100_213_ = (class100.method1613(0, (byte) -74, (class100.method1601(37, Class13.aClass100_218))));
                                long l = class100_213_.method1615(i ^ ~0x4c6d);
                                boolean bool = false;
                                for (int i_214_ = 0; i_214_ < Class68_Sub13_Sub26.anInt3882; i_214_++)
                                {
                                    if (l == (Class21_Sub1.aLongArray2705[i_214_]))
                                    {
                                        bool = true;
                                        break;
                                    }
                                }
                                if (!bool && ObjectDefinition.anInt2013 == 0)
                                    Class48.method520(class100_213_, i ^ 0x66b1, (Class68_Sub28_Sub2.aClass100_4558), 14);
                            } else if (class100.method1579((Class68_Sub20_Sub15.aClass100_4398), true))
                            {
                                MutableString class100_215_ = (class100.method1613(0, (byte) -74, (class100.method1601(-90, Class13.aClass100_218))));
                                long l = class100_215_.method1615(10908);
                                boolean bool = false;
                                for (int i_216_ = 0; Class68_Sub13_Sub26.anInt3882 > i_216_; i_216_++)
                                {
                                    if (l == (Class21_Sub1.aLongArray2705[i_216_]))
                                    {
                                        bool = true;
                                        break;
                                    }
                                }
                                if (!bool && ObjectDefinition.anInt2013 == 0)
                                    Class48.method520(class100_215_, -108, (Class68_Sub28_Sub2.aClass100_4558), 15);
                            } else if (!class100.method1579((Class68_Sub13_Sub26_Sub1.aClass100_4604), true))
                                Class48.method520((Class68_Sub28_Sub2.aClass100_4558), 127, class100, 0);
                            else
                            {
                                MutableString class100_217_ = (class100.method1613(0, (byte) -74, (class100.method1601(63, Class13.aClass100_218))));
                                long l = class100_217_.method1615(i ^ ~0x4c6d);
                                boolean bool = false;
                                for (int i_218_ = 0; Class68_Sub13_Sub26.anInt3882 > i_218_; i_218_++)
                                {
                                    if (Class21_Sub1.aLongArray2705[i_218_] == l)
                                    {
                                        bool = true;
                                        break;
                                    }
                                }
                                if (!bool && ObjectDefinition.anInt2013 == 0)
                                    Class48.method520(class100_217_, i ^ 0x6680, (Class68_Sub28_Sub2.aClass100_4558), 16);
                            }
                        } else
                        {
                            MutableString class100_219_ = (class100.method1613(0, (byte) -74, class100.method1601(-113, (Class104.aClass100_1779))));
                            if (ObjectDefinition.anInt2013 == 0)
                                Class48.method520((Class68_Sub28_Sub2.aClass100_4558), -12, class100_219_, 13);
                        }
                    } else
                    {
                        MutableString class100_220_ = (class100.method1613(0, (byte) -74, class100.method1601(-57, Class127.aClass100_2213)));
                        if (ObjectDefinition.anInt2013 == 0)
                            Class48.method520((Class68_Sub28_Sub2.aClass100_4558), i + 26270, class100_220_, 12);
                    }
                } else
                {
                    MutableString class100_221_ = (class100.method1613(0, (byte) -74, class100.method1601(89, Class13.aClass100_218)));
                    long l = class100_221_.method1615(10908);
                    boolean bool = false;
                    for (int i_222_ = 0; i_222_ < Class68_Sub13_Sub26.anInt3882; i_222_++)
                    {
                        if (Class21_Sub1.aLongArray2705[i_222_] == l)
                        {
                            bool = true;
                            break;
                        }
                    }
                    if (!bool && ObjectDefinition.anInt2013 == 0)
                    {
                        MutableString class100_223_ = (class100.method1613(class100.method1601(-126, Class13.aClass100_218) + 1, (byte) -74, class100.getLength() - 9));
                        Class48.method520(class100_221_, -112, class100_223_, 8);
                    }
                }
            } else
            {
                MutableString class100_224_ = (class100.method1613(0, (byte) -74, class100.method1601(i ^ 0x668d, Class13.aClass100_218)));
                long l = class100_224_.method1615(10908);
                boolean bool = false;
                for (int i_225_ = 0; i_225_ < Class68_Sub13_Sub26.anInt3882; i_225_++)
                {
                    if (Class21_Sub1.aLongArray2705[i_225_] == l)
                    {
                        bool = true;
                        break;
                    }
                }
                if (!bool && ObjectDefinition.anInt2013 == 0)
                    Class48.method520(class100_224_, i ^ 0x6698, Class68_Sub16.aClass100_3029, 4);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 144)
        {
            byte[] is = new byte[Class106.packetSize];
            Class68_Sub13_Sub8.connectionVector.readCipheredBytes(is, Class106.packetSize, 0);
            NPC.method155(Class68_Sub13_Sub27.method842(Class106.packetSize, is, 0), true, -125);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 3)
        {
            Class49.packetOpcode = -1;
            Class95.destinationX = 0;
            return true;
        }
        if (Class49.packetOpcode == 161)
        {
            int i_226_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            int i_227_ = Class68_Sub13_Sub8.connectionVector.method928(55);
            Class66.method638(95, i_227_, i_226_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 227)
        {
            int i_228_ = Class68_Sub13_Sub8.connectionVector.readUByte();
            int i_229_ = i_228_ >> 6;
            Class23 class23 = new Class23();
            ((Class23) class23).anInt489 = i_228_ & 0x3f;
            ((Class23) class23).anInt499 = Class68_Sub13_Sub8.connectionVector.readUByte();
            if (((Class23) class23).anInt499 >= 0 && (((Class23) class23).anInt499 < (Class68_Sub13_Sub12.aClass68_Sub20_Sub10Array3648).length))
            {
                if (((Class23) class23).anInt489 == 1 || ((Class23) class23).anInt489 == 10)
                {
                    ((Class23) class23).anInt493 = Class68_Sub13_Sub8.connectionVector.readUShort();
                    ((Stream) Class68_Sub13_Sub8.connectionVector).position += 3;
                } else if (((Class23) class23).anInt489 >= 2 && ((Class23) class23).anInt489 <= 6)
                {
                    if (((Class23) class23).anInt489 == 2)
                    {
                        ((Class23) class23).anInt502 = 64;
                        ((Class23) class23).anInt503 = 64;
                    }
                    if (((Class23) class23).anInt489 == 3)
                    {
                        ((Class23) class23).anInt502 = 0;
                        ((Class23) class23).anInt503 = 64;
                    }
                    if (((Class23) class23).anInt489 == 4)
                    {
                        ((Class23) class23).anInt503 = 64;
                        ((Class23) class23).anInt502 = 128;
                    }
                    if (((Class23) class23).anInt489 == 5)
                    {
                        ((Class23) class23).anInt503 = 0;
                        ((Class23) class23).anInt502 = 64;
                    }
                    if (((Class23) class23).anInt489 == 6)
                    {
                        ((Class23) class23).anInt503 = 128;
                        ((Class23) class23).anInt502 = 64;
                    }
                    ((Class23) class23).anInt489 = 2;
                    ((Class23) class23).anInt496 = Class68_Sub13_Sub8.connectionVector.readUShort();
                    ((Class23) class23).anInt492 = Class68_Sub13_Sub8.connectionVector.readUShort();
                    ((Class23) class23).anInt497 = Class68_Sub13_Sub8.connectionVector.readUByte();
                }
                ((Class23) class23).anInt495 = Class68_Sub13_Sub8.connectionVector.readUShort();
                if (((Class23) class23).anInt495 == 65535)
                    ((Class23) class23).anInt495 = -1;
                Class34.aClass23Array594[i_229_] = class23;
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 190)
        {
            int i_230_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            Class72_Sub1.method1364(i_230_, -107);
            Class68_Sub13_Sub39.anIntArray4104[Class120.method1746(31, ScriptParameters.anInt3245++)] = Class120.method1746(i_230_, 32767);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 246)
        {
            int i_231_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1684((long) i_231_, 107));
            if (class68_sub3 != null)
                Class68_Sub13_Sub10.method744(class68_sub3, true, true);
            if (Class29.aClass45_539 != null)
            {
                NodeCache.method1688(Class29.aClass45_539, -125);
                Class29.aClass45_539 = null;
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 191)
        {
            MutableString class100 = Class68_Sub13_Sub8.connectionVector.readString();
            int i_232_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
            int i_233_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            Class68_Sub13_Sub38.method900(-55, i_233_);
            Class68_Sub13_Sub7.method730((byte) 88, i_232_, class100);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 255)
        {
            int i_234_ = Class68_Sub13_Sub8.connectionVector.readInteger();
            int i_235_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            Widget class45;
            if (i_234_ >= 0)
                class45 = Class68_Sub20_Sub15.method1170(i_234_, (byte) -80);
            else
                class45 = null;
            if (class45 != null)
            {
                for (int i_236_ = 0; i_236_ < ((Widget) class45).inventory.length; i_236_++)
                {
                    ((Widget) class45).inventory[i_236_] = 0;
                    ((Widget) class45).inventoryStackSizes[i_236_] = 0;
                }
            }
            if (i_234_ < -70000)
                i_235_ += 32768;
            Class11.method235(i_235_, (byte) 45);
            int i_237_ = Class68_Sub13_Sub8.connectionVector.readUShort();
            for (int i_238_ = 0; i_237_ > i_238_; i_238_++)
            {
                int i_239_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
                if (i_239_ == 255)
                    i_239_ = Class68_Sub13_Sub8.connectionVector.method932(false);
                int i_240_ = Class68_Sub13_Sub8.connectionVector.readLEUShort();
                if (class45 != null && ((Widget) class45).inventory.length > i_238_)
                {
                    ((Widget) class45).inventory[i_238_] = i_240_;
                    ((Widget) class45).inventoryStackSizes[i_238_] = i_239_;
                }
                NodeSubList.method1798(i_238_, i_239_, (byte) -32, i_235_, i_240_ - 1);
            }
            if (class45 != null)
                NodeCache.method1688(class45, -118);
            Class68_Sub13.method701(0);
            Class68_Sub13_Sub39.anIntArray4104[Class120.method1746(ScriptParameters.anInt3245++, 31)] = Class120.method1746(32767, i_235_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 1)
        {
            int i_241_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
            int i_242_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            Class13_Sub3.method261(i ^ ~0x66f1, i_241_, i_242_);
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 99)
        {
            Class68_Sub13.method701(0);
            Class68_Sub20_Sub9.anInt4297 = Class68_Sub13_Sub8.connectionVector.readUByte();
            Class68_Sub20_Sub5.anInt4222 = Class68_Sub22.anInt3150;
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 35)
        {
            int i_243_ = Class68_Sub13_Sub8.connectionVector.method932(false);
            int i_244_ = Class68_Sub13_Sub8.connectionVector.readLEInteger();
            int i_245_ = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            Widget class45 = Class68_Sub20_Sub15.method1170(i_243_, (byte) -80);
            if (i_245_ == 65535)
                i_245_ = -1;
            if (!((Widget) class45).aBoolean863)
            {
                if (i_245_ == -1)
                {
                    Class49.packetOpcode = -1;
                    ((Widget) class45).notWidgetSelectedModelType = 0;
                    return true;
                }
                ItemDefinition class19 = GameApplet.method18(i ^ 0x2b6, i_245_);
                ((Widget) class45).anInt814 = ((ItemDefinition) class19).anInt395;
                ((Widget) class45).anInt864 = ((ItemDefinition) class19).anInt389;
                ((Widget) class45).notWidgetSelectedModelID = i_245_;
                ((Widget) class45).anInt762 = 100 * ((ItemDefinition) class19).anInt336 / i_244_;
                ((Widget) class45).notWidgetSelectedModelType = 4;
                NodeCache.method1688(class45, i + 26234);
            } else
            {
                ((Widget) class45).anInt915 = i_244_;
                ((Widget) class45).anInt798 = i_245_;
                ItemDefinition class19 = GameApplet.method18(-25672, i_245_);
                ((Widget) class45).anInt814 = ((ItemDefinition) class19).anInt395;
                ((Widget) class45).anInt853 = ((ItemDefinition) class19).anInt355;
                ((Widget) class45).anInt864 = ((ItemDefinition) class19).anInt389;
                ((Widget) class45).anInt781 = ((ItemDefinition) class19).anInt358;
                ((Widget) class45).anInt842 = ((ItemDefinition) class19).anInt391;
                ((Widget) class45).anInt762 = ((ItemDefinition) class19).anInt336;
                if (((Widget) class45).anInt793 > 0)
                    ((Widget) class45).anInt762 = (32 * ((Widget) class45).anInt762 / ((Widget) class45).anInt793);
                else if (((Widget) class45).width > 0)
                    ((Widget) class45).anInt762 = (32 * ((Widget) class45).anInt762 / ((Widget) class45).width);
                NodeCache.method1688(class45, -126);
            }
            Class49.packetOpcode = -1;
            return true;
        }
        if (Class49.packetOpcode == 114)
        {
            for (int i_246_ = 0; Class68_Sub13_Sub4.localPlayers.length > i_246_; i_246_++)
            {
                if (Class68_Sub13_Sub4.localPlayers[i_246_] != null)
                    ((Character) (Class68_Sub13_Sub4.localPlayers[i_246_])).animationID = -1;
            }
            for (int i_247_ = 0; Class102.localNPCs.length > i_247_; i_247_++)
            {
                if (Class102.localNPCs[i_247_] != null)
                    ((Character) Class102.localNPCs[i_247_]).animationID = -1;
            }
            Class49.packetOpcode = -1;
            return true;
        }
        Class71.method1339(("T1 - " + Class49.packetOpcode + "," + Class68_Sub20_Sub6.anInt4242 + "," + Class68_Sub20_Sub7.anInt4254 + " - " + Class106.packetSize), null, 38);
        Class68_Sub3.method651((byte) -116);
        return true;
    }

    static
    {
        anIntArray1865 = new int[64];
        aClass100_1872 = aClass100_1866;
        aCRC32_1874 = new CRC32();
        aClass113_1876 = new NodeCache(4096);
        anIntArray1878 = new int[50];
    }
}
