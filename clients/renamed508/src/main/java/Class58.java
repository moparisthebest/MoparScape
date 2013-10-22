/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class58
{
    static int anInt1087 = 0;
    static int anInt1088;
    int anInt1089;
    int[] anIntArray1090;
    static int anInt1091;
    static int anInt1092;
    static int anInt1093;
    static int anInt1094;
    static MutableString aClass100_1095;
    static int anInt1096;
    static Class21_Sub1 aClass21_Sub1_1097;
    private static MutableString aClass100_1098 = Class112.makeMutableString(43, "level)2");
    Class68_Sub20_Sub8 aClass68_Sub20_Sub8_1099;

    static final void applyPlayerUpdateFlag(int i, Player thePlayer, int i_0_, int i_1_)
    {
        do
        {
            try
            {
                if ((i & 0x100) != 0)
                {
                    ((Character) thePlayer).anInt2561 = Class68_Sub13_Sub8.connectionVector.readUByteC();
                    ((Character) thePlayer).anInt2520 = Class68_Sub13_Sub8.connectionVector.readUByteS();
                    ((Character) thePlayer).anInt2544 = Class68_Sub13_Sub8.connectionVector.readUByteS();
                    ((Character) thePlayer).anInt2521 = Class68_Sub13_Sub8.connectionVector.readUByteS();
                    ((Character) thePlayer).anInt2552 = Class68_Sub13_Sub8.connectionVector.readUShort() + Class68_Sub3.loopCycle;
                    ((Character) thePlayer).anInt2523 = Class68_Sub13_Sub8.connectionVector.readUShortA() + Class68_Sub3.loopCycle;
                    ((Character) thePlayer).anInt2590 = Class68_Sub13_Sub8.connectionVector.readUByte();
                    ((Character) thePlayer).walkQueueLength = 1;
                    ((Character) thePlayer).anInt2559 = 0;
                }
                if ((i & 0x200) != 0)
                {
                    int i_2_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
                    int i_3_ = Class68_Sub13_Sub8.connectionVector.readUByteA();
                    thePlayer.method149(i_2_, false, Class68_Sub3.loopCycle, i_3_);
                }
                if (i_0_ == -19219)
                {
                    anInt1093++;
                    if ((0x20 & i) != 0)
                    {
                        ((Character) thePlayer).interactingEntity = Class68_Sub13_Sub8.connectionVector.readUShort();
                        if (((Character) thePlayer).interactingEntity == 65535)
                            ((Character) thePlayer).interactingEntity = -1;
                    }
                    if ((0x4 & i) != 0)
                    {
                        ((Character) thePlayer).message = Class68_Sub13_Sub8.connectionVector.readString();
                        if (((Character) thePlayer).message.charAt(0) == 126)
                        {
                            ((Character) thePlayer).message = ((Character) thePlayer).message.method1621(1, true);
                            Class48.method520(thePlayer.method160(), 126, (((Character) thePlayer).message), 2);
                        } else if (thePlayer == Class68_Sub7.localPlayer)
                            Class48.method520(thePlayer.method160(), -107, (((Character) thePlayer).message), 2);
                        ((Character) thePlayer).anInt2541 = 0;
                        ((Character) thePlayer).messageCycle = 150;
                        ((Character) thePlayer).anInt2537 = 0;
                    }
                    if ((i & 0x400) != 0)
                    {
                        ((Character) thePlayer).anInt2554 = Class68_Sub13_Sub8.connectionVector.readUShort();
                        int i_4_ = Class68_Sub13_Sub8.connectionVector.method928(79);
                        ((Character) thePlayer).anInt2543 = (i_4_ & 0xffff) + Class68_Sub3.loopCycle;
                        ((Character) thePlayer).anInt2580 = 0;
                        ((Character) thePlayer).anInt2562 = i_4_ >> 16;
                        ((Character) thePlayer).anInt2588 = 0;
                        if (((Character) thePlayer).anInt2554 == 65535)
                            ((Character) thePlayer).anInt2554 = -1;
                        if (((Character) thePlayer).anInt2543 > Class68_Sub3.loopCycle)
                            ((Character) thePlayer).anInt2580 = -1;
                    }
                    if ((0x40 & i) != 0)
                    {
                        ((Character) thePlayer).anInt2528 = Class68_Sub13_Sub8.connectionVector.readLEUShort();
                        ((Character) thePlayer).anInt2574 = Class68_Sub13_Sub8.connectionVector.readUShortA();
                    }
                    if ((i & 0x8) != 0)
                    {
                        int i_5_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
                        boolean bool = (0x8000 & i_5_) != 0;
                        int i_6_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
                        int i_7_ = Class68_Sub13_Sub8.connectionVector.readUByteC();
                        int i_8_ = (((Stream) Class68_Sub13_Sub8.connectionVector).position);
                        if ((((Player) thePlayer).name) != null && (((Player) thePlayer).definition) != null)
                        {
                            long l = ((Player) thePlayer).name.method1615(i_0_ + 30127);
                            boolean bool_9_ = false;
                            if (i_6_ <= 1)
                            {
                                if (!bool && (Class25.anInt517 == 1 || Class30.anInt552 == 1))
                                    bool_9_ = true;
                                else
                                {
                                    for (int i_10_ = 0; Class68_Sub13_Sub26.anInt3882 > i_10_; i_10_++)
                                    {
                                        if (l == (Class21_Sub1.aLongArray2705[i_10_]))
                                        {
                                            bool_9_ = true;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!bool_9_ && ObjectDefinition.anInt2013 == 0)
                            {
                                ((Stream) Class95.aClass68_Sub14_1682).position = 0;
                                Class68_Sub13_Sub8.connectionVector.readBytes(0, i_7_, (((Stream) Class95.aClass68_Sub14_1682).buffer));
                                ((Stream) Class95.aClass68_Sub14_1682).position = 0;
                                int i_11_ = -1;
                                MutableString class100;
                                if (!bool)
                                    class100 = (Class68_Sub20_Sub1.method1009(Class68_Sub19.method996(68, Class95.aClass68_Sub14_1682).method1622(i_0_ ^ ~0x4b10)));
                                else
                                {
                                    i_5_ &= 0x7fff;
                                    Class58 class58 = (Class70.method1334(Class95.aClass68_Sub14_1682, -10));
                                    i_11_ = ((Class58) class58).anInt1089;
                                    class100 = (((Class58) class58).aClass68_Sub20_Sub8_1099.method1093(121, Class95.aClass68_Sub14_1682));
                                }
                                ((Character) thePlayer).message = class100.method1591(true);
                                ((Character) thePlayer).anInt2537 = i_5_ >> 8;
                                ((Character) thePlayer).messageCycle = 150;
                                ((Character) thePlayer).anInt2541 = 0xff & i_5_;
                                if (i_6_ == 2)
                                    Class25.method386(null, -19596, (Class68_Sub20_Sub13_Sub2.method1166(i_0_ ^ ~0x4b10, (new MutableString[] { (Class68_Sub13_Sub4.aClass100_3494), (thePlayer.method160()) }))), i_11_, bool ? 17 : 1, class100);
                                else if (i_6_ != 1)
                                    Class25.method386(null, -19596, thePlayer.method160(), i_11_, !bool ? 2 : 17, class100);
                                else
                                    Class25.method386(null, -19596, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub27.aClass100_3904), thePlayer.method160() }))), i_11_, bool ? 17 : 1, class100);
                            }
                        }
                        ((Stream) Class68_Sub13_Sub8.connectionVector).position = i_7_ + i_8_;
                    }
                    if ((0x1 & i) != 0)
                    {
                        int i_12_ = Class68_Sub13_Sub8.connectionVector.readUShort();
                        if (i_12_ == 65535)
                            i_12_ = -1;
                        int i_13_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
                        Animation.method1726(i_13_, i_0_ ^ ~0x4b12, thePlayer, i_12_);
                    }
                    if ((i & 0x80) != 0)
                    {
                        int i_14_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                        byte[] is = new byte[i_14_];
                        Stream class68_sub14 = new Stream(is);
                        Class68_Sub13_Sub8.connectionVector.readBytes(0, i_14_, is);
                        Ground.aClass68_Sub14Array2757[i_1_] = class68_sub14;
                        thePlayer.parseAppearance(class68_sub14);
                    }
                    if ((i & 0x2) == 0)
                        break;
                    int i_15_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
                    int i_16_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
                    thePlayer.method149(i_15_, false, Class68_Sub3.loopCycle, i_16_);
                    ((Character) thePlayer).loopCycleStatus = Class68_Sub3.loopCycle + 300;
                    ((Character) thePlayer).hpRatio = Class68_Sub13_Sub8.connectionVector.readUByteS();
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("jf.G(" + i + ',' + (thePlayer != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
            }
            break;
        } while (false);
    }

    static final void walkingStuff(Character theCharacter, boolean bool)
    {
        do
        {
            try
            {
                anInt1088++;
                ((Character) theCharacter).anInt2526 = ((Character) theCharacter).anInt2532;
                if (((Character) theCharacter).walkQueueLength == 0)
                    ((Character) theCharacter).anInt2522 = 0;
                else
                {
                    if (((Character) theCharacter).animationID != -1 && ((Character) theCharacter).anInt2547 == 0)
                    {
                        Animation class117 = Object1.getAnimation((((Character) theCharacter).animationID));
                        if (((Character) theCharacter).anInt2559 > 0 && ((Animation) class117).anInt2045 == 0)
                        {
                            ((Character) theCharacter).anInt2522++;
                            break;
                        }
                        if (((Character) theCharacter).anInt2559 <= 0 && ((Animation) class117).resetStyle == 0)
                        {
                            ((Character) theCharacter).anInt2522++;
                            break;
                        }
                    }
                    int i = ((Character) theCharacter).x;
                    int i_17_ = ((Character) theCharacter).y;
                    int i_18_ = (64 * ((Character) theCharacter).raw_range + ((((Character) theCharacter).walkQueueY[((Character) theCharacter).walkQueueLength - 1]) * 128));
                    int i_19_ = (((Character) theCharacter).raw_range * 64 + 128 * (((Character) theCharacter).walkQueueX[(((Character) theCharacter).walkQueueLength - 1)]));
                    if (i_19_ - i > 256 || i_19_ - i < -256 || i_18_ - i_17_ > 256 || i_18_ - i_17_ < -256)
                    {
                        ((Character) theCharacter).y = i_18_;
                        ((Character) theCharacter).x = i_19_;
                    } else
                    {
                        if (i_19_ > i)
                        {
                            if (i_18_ > i_17_)
                                ((Character) theCharacter).turnDirection = 1280;
                            else if (i_17_ > i_18_)
                                ((Character) theCharacter).turnDirection = 1792;
                            else
                                ((Character) theCharacter).turnDirection = 1536;
                        } else if (i > i_19_)
                        {
                            if (i_18_ > i_17_)
                                ((Character) theCharacter).turnDirection = 768;
                            else if (i_17_ > i_18_)
                                ((Character) theCharacter).turnDirection = 256;
                            else
                                ((Character) theCharacter).turnDirection = 512;
                        } else if (i_17_ < i_18_)
                            ((Character) theCharacter).turnDirection = 1024;
                        else if (i_17_ > i_18_)
                            ((Character) theCharacter).turnDirection = 0;
                        int i_20_ = ((Character) theCharacter).anInt2534;
                        int i_21_ = ((((Character) theCharacter).turnDirection - ((Character) theCharacter).anInt2550) & 0x7ff);
                        int i_22_ = 4;
                        if (i_21_ > 1024)
                            i_21_ -= 2048;
                        if (i_21_ < -256 || i_21_ > 256)
                        {
                            if (i_21_ >= 256 && i_21_ < 768)
                                i_20_ = ((Character) theCharacter).anInt2565;
                            else if (i_21_ >= -768 && i_21_ <= -256)
                                i_20_ = ((Character) theCharacter).anInt2576;
                        } else
                            i_20_ = ((Character) theCharacter).anInt2545;
                        boolean bool_23_ = bool;
                        if (i_20_ == -1)
                            i_20_ = ((Character) theCharacter).anInt2545;
                        ((Character) theCharacter).anInt2526 = i_20_;
                        if (theCharacter instanceof NPC)
                            bool_23_ = ((NPCDefinition) (((NPC) (NPC) theCharacter).definition)).aBoolean1426;
                        if (!bool_23_)
                        {
                            if (((Character) theCharacter).walkQueueLength > 1)
                                i_22_ = 6;
                            if (((Character) theCharacter).walkQueueLength > 2)
                                i_22_ = 8;
                            if (((Character) theCharacter).anInt2522 > 0 && ((Character) theCharacter).walkQueueLength > 1)
                            {
                                i_22_ = 8;
                                ((Character) theCharacter).anInt2522--;
                            }
                        } else
                        {
                            if ((((Character) theCharacter).turnDirection != ((Character) theCharacter).anInt2550) && ((Character) theCharacter).interactingEntity == -1 && ((Character) theCharacter).anInt2583 != 0)
                                i_22_ = 2;
                            if (((Character) theCharacter).walkQueueLength > 2)
                                i_22_ = 6;
                            if (((Character) theCharacter).walkQueueLength > 3)
                                i_22_ = 8;
                            if (((Character) theCharacter).anInt2522 > 0 && ((Character) theCharacter).walkQueueLength > 1)
                            {
                                i_22_ = 8;
                                ((Character) theCharacter).anInt2522--;
                            }
                        }
                        if (((Character) theCharacter).aBooleanArray2548[((Character) theCharacter).walkQueueLength - 1])
                            i_22_ <<= 1;
                        if (i >= i_19_)
                        {
                            if (i_19_ < i)
                            {
                                ((Character) theCharacter).x -= i_22_;
                                if (((Character) theCharacter).x < i_19_)
                                    ((Character) theCharacter).x = i_19_;
                            }
                        } else
                        {
                            ((Character) theCharacter).x += i_22_;
                            if (((Character) theCharacter).x > i_19_)
                                ((Character) theCharacter).x = i_19_;
                        }
                        if (i_17_ < i_18_)
                        {
                            ((Character) theCharacter).y += i_22_;
                            if (i_18_ < ((Character) theCharacter).y)
                                ((Character) theCharacter).y = i_18_;
                        } else if (i_17_ > i_18_)
                        {
                            ((Character) theCharacter).y -= i_22_;
                            if (i_18_ > ((Character) theCharacter).y)
                                ((Character) theCharacter).y = i_18_;
                        }
                        if (i_22_ >= 8 && (((Character) theCharacter).anInt2545 == ((Character) theCharacter).anInt2526) && ((Character) theCharacter).anInt2542 != -1)
                            ((Character) theCharacter).anInt2526 = ((Character) theCharacter).anInt2542;
                        if (((Character) theCharacter).x != i_19_ || ((Character) theCharacter).y != i_18_)
                            break;
                        if (((Character) theCharacter).anInt2559 > 0)
                            ((Character) theCharacter).anInt2559--;
                        ((Character) theCharacter).walkQueueLength--;
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("jf.B(" + (theCharacter != null ? "{...}" : "null") + ',' + bool + ')'));
            }
            break;
        } while (false);
    }

    static final MutableString method579(byte i, int i_24_)
    {
        anInt1092++;
        if (i >= -40)
            return null;
        if (Class33.menuOptions[i_24_].getLength() <= 0)
            return Class71_Sub1.menuActions[i_24_];
        return (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class71_Sub1.menuActions[i_24_], Class51.aClass100_2260, Class33.menuOptions[i_24_] }));
    }

    static final void method580(int i, int i_25_, byte i_26_)
    {
        anInt1096++;
        int i_27_ = i;
        if (i_27_ > 25)
            i_27_ = 25;
        i--;
        int i_28_ = Class68_Sub13_Sub37.anIntArray4068[i];
        int i_29_ = Class68_Sub13_Sub21.anIntArray3799[i];
        if (i_25_ == 0)
        {
            Class21.connectionVector.startPacket(49);
            Class68_Sub20_Sub17.anInt4438++;
            Class21.connectionVector.writeByte(i_27_ + i_27_ + 3);
        }
        if (i_25_ == 1)
        {
            Class68_Sub27.anInt3212++;
            Class21.connectionVector.startPacket(119);
            Class21.connectionVector.writeByte(i_27_ + 3 + 14 + i_27_);
        }
        if (i_25_ == 2)
        {
            Class21.connectionVector.startPacket(138);
            Class21.connectionVector.writeByte(i_27_ + i_27_ + 3);
            Class68_Sub20_Sub13_Sub2.anInt4620++;
        }
        Class21.connectionVector.writeLEShortA(i_28_ + Class36.baseX);
        Class21.connectionVector.writeShortA(i_29_ + Class68_Sub13_Sub35.baseY);
        Class21.connectionVector.writeByteC(NodeSubList.aBooleanArray2230[82] ? 1 : 0);
        Class75_Sub2.destinationY = Class68_Sub13_Sub21.anIntArray3799[0];
        if (i_26_ >= 123)
        {
            Class95.destinationX = Class68_Sub13_Sub37.anIntArray4068[0];
            for (int i_30_ = 1; i_30_ < i_27_; i_30_++)
            {
                i--;
                Class21.connectionVector.writeByte(((Class68_Sub13_Sub37.anIntArray4068[i]) - i_28_));
                Class21.connectionVector.writeByteS(((Class68_Sub13_Sub21.anIntArray3799[i]) - i_29_));
            }
        }
    }

    static final void method581(int i, byte i_31_, int i_32_, int i_33_, int i_34_, int i_35_)
    {
        anInt1091++;
        if (i_31_ != 63)
            anInt1087 = -12;
        if (i_32_ == i)
            Class68_Sub20_Sub13.method1158(i_35_, i_33_, i, i_34_, true);
        else if (GroundData.anInt677 > i_34_ - i || NodeCache.anInt1920 < i + i_34_ || Class35.anInt605 > i_33_ - i_32_ || i_33_ + i_32_ > Class51.anInt2257)
            Class75_Sub3_Sub1.method1401(i_34_, i_33_, i_32_, i, (byte) 47, i_35_);
        else
            Class89.method1505(i_32_, i_34_, i_33_, true, i, i_35_);
    }

    static final void method582(int i)
    {
        anInt1094++;
        if (i >= 12)
        {
            do
            {
                try
                {
                    if (Object2.aClass52_1354 != null)
                        break;
                    Object2.aClass52_1354 = new Class52(Class75_Sub1_Sub1.signlink, Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class88.method1498(-1), Class104.aClass100_1785 })).toURL());
                } catch (Exception exception)
                {
                    exception.printStackTrace();
                    Object2.aClass52_1354 = null;
                }
                break;
            } while (false);
        }
    }

    public static void method583(int i)
    {
        if (i != -2)
            method582(21);
        aClass21_Sub1_1097 = null;
        aClass100_1095 = null;
        aClass100_1098 = null;
    }

    public Class58()
    {
        /* empty */
    }

    static
    {
        aClass100_1095 = aClass100_1098;
    }
}
