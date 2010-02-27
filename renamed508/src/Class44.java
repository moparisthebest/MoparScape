/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import nativeadvert.browsercontrol;

final class Class44
{
    static Class125 aClass125_742;
    static MutableString aClass100_743 = null;
    static int anInt744;
    static int anInt745;
    Animable aClass1_746;
    static int anInt747;
    static int anInt748;
    static int anInt749;
    static int anInt750;
    static int anInt751;
    static int anInt752;
    static int anInt753;
    static int anInt754;
    static Login aClass82_755 = new Login(128);

    static final void method484(byte i, int i_0_)
    {
        if (i > 6)
        {
            anInt745++;
            Class68_Sub20_Sub13.aClass98_4361.method1570(-18767, i_0_);
        }
    }

    static final void method485(int i)
    {
        anInt749++;
        if (i != -1)
            aClass100_743 = null;
        if (browsercontrol.method1411())
            browsercontrol.method1413();
        Class71_Sub1.method1345(-68, Mouse.gameCanvas);
        NodeSub.method1007(Mouse.gameCanvas, true);
        if (MutableString.aClass97_2263 != null)
            MutableString.aClass97_2263.method1564(i + 101, Mouse.gameCanvas);
        Item.method71(-125);
        Class53.method545(Mouse.gameCanvas, 1611550343);
        Class72_Sub1.method1362(i - 88, Mouse.gameCanvas);
        if (MutableString.aClass97_2263 != null)
            MutableString.aClass97_2263.method1568(Mouse.gameCanvas, true);
        Class72.method1348(0);
        Class36.aLong644 = 0L;
    }

    static final void method486(MutableString class100, byte i)
    {
        try
        {
            anInt752++;
            if (Class68_Sub13_Sub13.anInt3665 >= 2)
            {
                if (class100.method1606(false, Class75_Sub1_Sub1.aClass100_4583))
                {
                    GameSocket.method596(0);
                    for (int i_1_ = 0; i_1_ < 10; i_1_++)
                        System.gc();
                    Runtime runtime = Runtime.getRuntime();
                    int i_2_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    Class48.method520(null, 14, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub22.aClass100_3152, Class68_Sub13_Sub24.method816(i_2_, 0), Class54.aClass100_1030 }))), 0);
                }
                if (class100.method1606(false, Class68_Sub10.aClass100_2902))
                    Class72_Sub1.method1367((byte) -21);
                if (class100.method1606(false, Class68_Sub13_Sub37.aClass100_4074))
                    Class17.method296(25, (byte) -98);
                if (class100.method1606(false, Object1.aClass100_1179))
                    Class68_Sub22.aBoolean3136 = true;
                if (class100.method1606(false, Class68_Sub13_Sub34.aClass100_4006))
                    Class68_Sub22.aBoolean3136 = false;
                if (class100.method1606(false, Class34.aClass100_595))
                {
                    for (int i_3_ = 0; i_3_ < 4; i_3_++)
                    {
                        for (int i_4_ = 1; i_4_ < 103; i_4_++)
                        {
                            for (int i_5_ = 1; i_5_ < 103; i_5_++)
                                ((GroundData) Class109.groundDataArray[i_3_]).blocks[i_4_][i_5_] = 0;
                        }
                    }
                }
                if (class100.method1595(Class50.aClass100_989, 95) && Class75_Sub3.location != 0)
                    Class68_Sub8.method672(class100.method1621(6, true).method1625((byte) 16), -47);
                if (class100.method1606(false, Class68_Sub13_Sub12.aClass100_3650) && Class75_Sub3.location == 2)
                    throw new RuntimeException();
                if (class100.method1595(Class1_Sub1.aClass100_2413, 96))
                {
                    Class68_Sub20_Sub5.anInt4231 = class100.method1621(12, true).method1591(true).method1625((byte) -41);
                    Class48.method520(null, 126, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub10.aClass100_3588, (Class68_Sub13_Sub24.method816(Class68_Sub20_Sub5.anInt4231, 0)) }))), 0);
                }
                if (class100.method1606(false, Class68_Sub20_Sub11.aClass100_4333))
                    NodeSub.aBoolean3096 = true;
            }
            if (i == 1)
            {
                Class68_Sub20_Sub5.anInt4226++;
                Class21.connectionVector.startPacket(107);
                Class21.connectionVector.writeByte(class100.getLength() - 1);
                Class21.connectionVector.writeString(class100.method1621(2, true));
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "h.H(" + (class100 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final void method487(int i, int i_6_, byte i_7_, int i_8_, int i_9_, int i_10_)
    {
        anInt750++;
        int i_11_ = i_6_ - i_10_;
        int i_12_ = i_8_ - i;
        if (i_12_ != 0)
        {
            if (i_11_ == 0)
            {
                Class15.method276(1, i_8_, i, i_9_, i_10_);
                return;
            }
        } else
        {
            if (i_11_ != 0)
                GameSocket.method595(-6, i, i_6_, i_9_, i_10_);
            return;
        }
        if (i_11_ < 0)
            i_11_ = -i_11_;
        if (i_12_ < 0)
            i_12_ = -i_12_;
        if (i_7_ > 29)
        {
            boolean bool = i_11_ > i_12_;
            if (bool)
            {
                int i_13_ = i;
                i = i_10_;
                int i_14_ = i_8_;
                i_10_ = i_13_;
                i_8_ = i_6_;
                i_6_ = i_14_;
            }
            if (i > i_8_)
            {
                int i_15_ = i;
                int i_16_ = i_10_;
                i_10_ = i_6_;
                i = i_8_;
                i_8_ = i_15_;
                i_6_ = i_16_;
            }
            int i_17_ = i_8_ - i;
            int i_18_ = i_10_;
            int i_19_ = i_6_ - i_10_;
            int i_20_ = -(i_17_ >> 1);
            int i_21_ = i_6_ > i_10_ ? 1 : -1;
            if (i_19_ < 0)
                i_19_ = -i_19_;
            if (!bool)
            {
                for (int i_22_ = i; i_8_ >= i_22_; i_22_++)
                {
                    Class68_Sub22.anIntArrayArray3134[i_18_][i_22_] = i_9_;
                    i_20_ += i_19_;
                    if (i_20_ > 0)
                    {
                        i_20_ -= i_17_;
                        i_18_ += i_21_;
                    }
                }
            } else
            {
                for (int i_23_ = i; i_23_ <= i_8_; i_23_++)
                {
                    Class68_Sub22.anIntArrayArray3134[i_23_][i_18_] = i_9_;
                    i_20_ += i_19_;
                    if (i_20_ > 0)
                    {
                        i_18_ += i_21_;
                        i_20_ -= i_17_;
                    }
                }
            }
        }
    }

    static final boolean method488(int i)
    {
        anInt754++;
        if (i >= -86)
            return true;
        long l = Class36.method438(17161);
        int i_24_ = (int) (l - RandomNumberGenerator.aLong1497);
        if (i_24_ > 200)
            i_24_ = 200;
        NodeList.anInt271 += i_24_;
        RandomNumberGenerator.aLong1497 = l;
        if (Class22.anInt483 == 0 && Class68_Sub24.anInt3155 == 0 && NodeSubList.anInt2229 == 0 && Class56.anInt1067 == 0)
            return true;
        if (Class68_Sub25.aClass61_3169 == null)
            return false;
        try
        {
            if (NodeList.anInt271 > 30000)
                throw new IOException();
            while (Class68_Sub24.anInt3155 < 20)
            {
                if (Class56.anInt1067 <= 0)
                    break;
                Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) Keyboard.aClass113_2125.method1685(-32642));
                Stream class68_sub14 = new Stream(4);
                class68_sub14.writeByte(1);
                class68_sub14.writeTInteger((int) (((Node) class68_sub20_sub15).nodeID));
                Class68_Sub25.aClass61_3169.queueBytes(0, (byte) 34, 4, (((Stream) class68_sub14).buffer));
                Class68_Sub20_Sub13.aClass113_4368.method1683((byte) -21, class68_sub20_sub15, ((Node) class68_sub20_sub15).nodeID);
                Class68_Sub24.anInt3155++;
                Class56.anInt1067--;
            }
            for (/**/; Class22.anInt483 < 20 && NodeSubList.anInt2229 > 0; Class22.anInt483++)
            {
                Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) Class68_Sub7.aClass128_2856.method1790(1742));
                Stream class68_sub14 = new Stream(4);
                class68_sub14.writeByte(0);
                class68_sub14.writeTInteger((int) (((Node) class68_sub20_sub15).nodeID));
                Class68_Sub25.aClass61_3169.queueBytes(0, (byte) 88, 4, (((Stream) class68_sub14).buffer));
                class68_sub20_sub15.unlinkSub();
                Class111.aClass113_1876.method1683((byte) -82, class68_sub20_sub15, (((Node) class68_sub20_sub15).nodeID));
                NodeSubList.anInt2229--;
            }
            for (int i_25_ = 0; i_25_ < 100; i_25_++)
            {
                int i_26_ = Class68_Sub25.aClass61_3169.available();
                if (i_26_ < 0)
                    throw new IOException();
                if (i_26_ == 0)
                    break;
                int i_27_ = 0;
                NodeList.anInt271 = 0;
                if (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813 != null)
                {
                    if (Object3.anInt942 == 0)
                        i_27_ = 1;
                } else
                    i_27_ = 8;
                if (i_27_ > 0)
                {
                    int i_28_ = (i_27_ - (((Stream) Class74.aClass68_Sub14_1330).position));
                    if (i_28_ > i_26_)
                        i_28_ = i_26_;
                    Class68_Sub25.aClass61_3169.read(i_28_, (((Stream) Class74.aClass68_Sub14_1330).position), (((Stream) Class74.aClass68_Sub14_1330).buffer));
                    if (Class89.aByte1617 != 0)
                    {
                        for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
                            ((Stream) Class74.aClass68_Sub14_1330).buffer[i_29_ + (((Stream) Class74.aClass68_Sub14_1330).position)] = (byte) (Class15.method278((((Stream) Class74.aClass68_Sub14_1330).buffer[(i_29_ + (((Stream) Class74.aClass68_Sub14_1330).position))]), Class89.aByte1617));
                    }
                    ((Stream) Class74.aClass68_Sub14_1330).position += i_28_;
                    if (i_27_ > (((Stream) Class74.aClass68_Sub14_1330).position))
                        break;
                    if (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813 == null)
                    {
                        ((Stream) Class74.aClass68_Sub14_1330).position = 0;
                        int i_30_ = Class74.aClass68_Sub14_1330.readUByte();
                        int i_31_ = Class74.aClass68_Sub14_1330.readUShort();
                        int i_32_ = Class74.aClass68_Sub14_1330.readUByte();
                        int i_33_ = Class74.aClass68_Sub14_1330.readInteger();
                        long l_34_ = (long) (i_31_ + (i_30_ << 16));
                        Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) Class68_Sub20_Sub13.aClass113_4368.method1684(l_34_, 84));
                        Class109.aBoolean1840 = true;
                        if (class68_sub20_sub15 == null)
                        {
                            class68_sub20_sub15 = ((Class68_Sub20_Sub15) Class111.aClass113_1876.method1684(l_34_, 101));
                            Class109.aBoolean1840 = false;
                        }
                        if (class68_sub20_sub15 == null)
                            throw new IOException();
                        Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813 = class68_sub20_sub15;
                        int i_35_ = i_32_ != 0 ? 9 : 5;
                        Keyboard.aClass68_Sub14_2130 = new Stream((((Class68_Sub20_Sub15) (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813)).aByte4393) + i_35_ + i_33_);
                        Keyboard.aClass68_Sub14_2130.writeByte(i_32_);
                        Keyboard.aClass68_Sub14_2130.writeDWord(i_33_);
                        ((Stream) Class74.aClass68_Sub14_1330).position = 0;
                        Object3.anInt942 = 8;
                    } else if (Object3.anInt942 == 0)
                    {
                        if ((((Stream) Class74.aClass68_Sub14_1330).buffer[0]) == -1)
                        {
                            Object3.anInt942 = 1;
                            ((Stream) Class74.aClass68_Sub14_1330).position = 0;
                        } else
                            Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813 = null;
                    }
                } else
                {
                    int i_36_ = ((((Stream) Keyboard.aClass68_Sub14_2130).buffer).length - (((Class68_Sub20_Sub15) Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813).aByte4393));
                    int i_37_ = 512 - Object3.anInt942;
                    if (i_36_ - (((Stream) Keyboard.aClass68_Sub14_2130).position) < i_37_)
                        i_37_ = i_36_ - ((Stream) Keyboard.aClass68_Sub14_2130).position;
                    if (i_26_ < i_37_)
                        i_37_ = i_26_;
                    Class68_Sub25.aClass61_3169.read(i_37_, (((Stream) Keyboard.aClass68_Sub14_2130).position), (((Stream) Keyboard.aClass68_Sub14_2130).buffer));
                    if (Class89.aByte1617 != 0)
                    {
                        for (int i_38_ = 0; i_37_ > i_38_; i_38_++)
                            ((Stream) Keyboard.aClass68_Sub14_2130).buffer[i_38_ + (((Stream) Keyboard.aClass68_Sub14_2130).position)] = (byte) (Class15.method278((((Stream) Keyboard.aClass68_Sub14_2130).buffer[(i_38_ + (((Stream) Keyboard.aClass68_Sub14_2130).position))]), Class89.aByte1617));
                    }
                    ((Stream) Keyboard.aClass68_Sub14_2130).position += i_37_;
                    Object3.anInt942 += i_37_;
                    if (i_36_ == (((Stream) Keyboard.aClass68_Sub14_2130).position))
                    {
                        if (((Node) (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813)).nodeID != 16711935L)
                        {
                            Class112.aCRC32_1889.reset();
                            Class112.aCRC32_1889.update(((Stream) Keyboard.aClass68_Sub14_2130).buffer, 0, i_36_);
                            int i_39_ = (int) Class112.aCRC32_1889.getValue();
                            if (i_39_ != ((Class68_Sub20_Sub15) (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813)).anInt4394)
                            {
                                try
                                {
                                    Class68_Sub25.aClass61_3169.method594(-105);
                                } catch (Exception exception)
                                {
                                    /* empty */
                                }
                                Class75_Sub1_Sub1.anInt4587++;
                                Class68_Sub25.aClass61_3169 = null;
                                Class89.aByte1617 = (byte) (int) (Math.random() * 255.0 + 1.0);
                                return false;
                            }
                            Class75_Sub1_Sub1.anInt4587 = 0;
                            Class68_Sub10.anInt2911 = 0;
                            ((Class68_Sub20_Sub15) Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813).aClass21_Sub1_4396.method371(Class109.aBoolean1840, (0xff0000L & (((Node) (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813)).nodeID)) == 16711680L, (int) (0xffffL & (((Node) (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813)).nodeID)), 125, (((Stream) Keyboard.aClass68_Sub14_2130).buffer));
                        } else
                        {
                            Class50.aClass68_Sub14_979 = Keyboard.aClass68_Sub14_2130;
                            for (int i_40_ = 0; i_40_ < 256; i_40_++)
                            {
                                Class21_Sub1 class21_sub1 = (NodeSub.aClass21_Sub1Array3083[i_40_]);
                                if (class21_sub1 != null)
                                {
                                    ((Stream) Class50.aClass68_Sub14_979).position = 8 * i_40_ + 5;
                                    int i_41_ = Class50.aClass68_Sub14_979.readInteger();
                                    int i_42_ = Class50.aClass68_Sub14_979.readInteger();
                                    class21_sub1.method368(i_42_, (byte) 102, i_41_);
                                }
                            }
                        }
                        Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813.unlink();
                        Object3.anInt942 = 0;
                        Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3813 = null;
                        Keyboard.aClass68_Sub14_2130 = null;
                        if (!Class109.aBoolean1840)
                            Class22.anInt483--;
                        else
                            Class68_Sub24.anInt3155--;
                    } else
                    {
                        if (Object3.anInt942 != 512)
                            break;
                        Object3.anInt942 = 0;
                    }
                }
            }
            return true;
        } catch (IOException ioexception)
        {
            try
            {
                Class68_Sub25.aClass61_3169.method594(-89);
            } catch (Exception exception)
            {
                /* empty */
            }
            Class68_Sub25.aClass61_3169 = null;
            Class68_Sub10.anInt2911++;
            return false;
        }
    }

    static final void method489(boolean bool, int i, int i_43_, Animation class117, boolean bool_44_, int i_45_)
    {
        try
        {
            anInt751++;
            if (Item.anInt2437 < 50 && (((Animation) class117).anIntArrayArray2036 != null && ((Animation) class117).anIntArrayArray2036.length > i && ((Animation) class117).anIntArrayArray2036[i] != null))
            {
                if (bool != false)
                    method488(105);
                int i_46_ = ((Animation) class117).anIntArrayArray2036[i][0];
                int i_47_ = i_46_ >> 8;
                if (((Animation) class117).anIntArrayArray2036[i].length > 1)
                {
                    int i_48_ = (int) (Math.random() * (double) (((Animation) class117).anIntArrayArray2036[i]).length);
                    if (i_48_ > 0)
                        i_47_ = (((Animation) class117).anIntArrayArray2036[i][i_48_]);
                }
                int i_49_ = i_46_ & 0xf;
                int i_50_ = i_46_ >> 4 & 0x7;
                if (i_49_ == 0)
                {
                    if (bool_44_)
                        Object4.method575((byte) -124, 0, i_50_, i_47_);
                } else if (Class68_Sub20_Sub15.anInt4401 != 0)
                {
                    Login.anIntArray1517[Item.anInt2437] = i_47_;
                    Class111.anIntArray1878[Item.anInt2437] = i_50_;
                    Class34.anIntArray596[Item.anInt2437] = 0;
                    int i_51_ = (i_43_ - 64) / 128;
                    Class3.aClass46Array80[Item.anInt2437] = null;
                    int i_52_ = (i_45_ - 64) / 128;
                    Class102.anIntArray1759[Item.anInt2437] = i_49_ + ((i_51_ << 16) + (i_52_ << 8));
                    Item.anInt2437++;
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("h.D(" + bool + ',' + i + ',' + i_43_ + ',' + (class117 != null ? "{...}" : "null") + ',' + bool_44_ + ',' + i_45_ + ')'));
        }
    }

    static final MutableString method490(boolean bool, byte i, int i_53_)
    {
        anInt748++;
        if (i != 42)
            method494(126);
        return Class13_Sub1.method247(10, bool, (byte) 125, i_53_);
    }

    static final Class68_Sub20_Sub10 method491(int i, int i_54_, boolean bool, int i_55_, int i_56_, boolean bool_57_)
    {
        anInt744++;
        int i_58_ = i_54_;
        int i_59_ = (i << 17) + i_55_ + (((!bool_57_ ? 0 : i_56_) << 19) + 65536);
        long l = (long) i_59_ * 3849834839L + 3147483667L * (long) i_58_;
        Class68_Sub20_Sub10 class68_sub20_sub10 = (Class68_Sub20_Sub10) Widget.aClass98_918.getNodeForID(l);
        if (class68_sub20_sub10 != null)
            return class68_sub20_sub10;
        Class62.aBoolean1152 = false;
        class68_sub20_sub10 = Class68_Sub13_Sub13.method757(bool, i_56_, -126, i_55_, bool_57_, i, false, i_54_);
        if (class68_sub20_sub10 != null && !Class62.aBoolean1152)
            Widget.aClass98_918.addObject(class68_sub20_sub10, l);
        return class68_sub20_sub10;
    }

    static final void method492(int i)
    {
        anInt747++;
        int[] is = new int[Class14.anInt233];
        if (i == 4)
        {
            int i_60_ = 0;
            for (int i_61_ = 0; i_61_ < Class14.anInt233; i_61_++)
            {
                ItemDefinition class19 = GameApplet.method18(-25672, i_61_);
                if (((ItemDefinition) class19).anInt390 >= 0 || ((ItemDefinition) class19).anInt387 >= 0)
                    is[i_60_++] = i_61_;
            }
            Class68_Sub20_Sub13.anIntArray4369 = new int[i_60_];
            for (int i_62_ = 0; i_62_ < i_60_; i_62_++)
                Class68_Sub20_Sub13.anIntArray4369[i_62_] = is[i_62_];
        }
    }

    static final void method493(byte i)
    {
        anInt753++;
        Class68_Sub13_Sub2.aClass98_3461.method1572((byte) 94);
        Class75_Sub1_Sub1.aClass98_4579.method1572((byte) 94);
        if (i > -56)
            aClass125_742 = null;
    }

    public Class44()
    {
        /* empty */
    }

    public static void method494(int i)
    {
        aClass125_742 = null;
        aClass100_743 = null;
        if (i == 8412)
            aClass82_755 = null;
    }
}
