/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RandomNumberGenerator
{
    static int anInt1475;
    static int anInt1476;
    static int anInt1477;
    private int[] memory;
    private int numberIndex;
    static MutableString aClass100_1480;
    private int[] numbers;
    static long aLong1482 = 0L;
    static MutableString aClass100_1483;
    private int accumulator;
    static int anInt1485;
    static int anInt1486;
    static int anInt1487;
    private int counter;
    static boolean aBoolean1489;
    static MutableString aClass100_1490;
    static int anInt1491;
    static int anInt1492;
    private int lastResult;
    static int anInt1494;
    static int anInt1495;
    static int anInt1496;
    static long aLong1497;
    static byte[] aByteArray1498;

    private final void initialize()
    {
        int i_1_;
        int i_2_;
        int i_3_;
        int i_4_;
        int i_5_;
        int i_6_;
        int i_7_;
        int i_0_ = i_1_ = i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = -1640531527;
        for (int i_8_ = 0; i_8_ < 4; i_8_++)
        {
            i_0_ ^= i_1_ << 11;
            i_1_ += i_2_;
            i_3_ += i_0_;
            i_1_ ^= i_2_ >>> 2;
            i_4_ += i_1_;
            i_2_ += i_3_;
            i_2_ ^= i_3_ << 8;
            i_3_ += i_4_;
            i_5_ += i_2_;
            i_3_ ^= i_4_ >>> 16;
            i_4_ += i_5_;
            i_4_ ^= i_5_ << 10;
            i_7_ += i_4_;
            i_6_ += i_3_;
            i_5_ += i_6_;
            i_5_ ^= i_6_ >>> 4;
            i_0_ += i_5_;
            i_6_ += i_7_;
            i_6_ ^= i_7_ << 8;
            i_7_ += i_0_;
            i_7_ ^= i_0_ >>> 9;
            i_2_ += i_7_;
            i_1_ += i_6_;
            i_0_ += i_1_;
        }
        for (int i_9_ = 0; i_9_ < 256; i_9_ += 8)
        {
            i_2_ += numbers[i_9_ + 2];
            i_4_ += numbers[i_9_ + 4];
            i_1_ += numbers[i_9_ + 1];
            i_6_ += numbers[i_9_ + 6];
            i_3_ += numbers[i_9_ + 3];
            i_7_ += numbers[i_9_ + 7];
            i_5_ += numbers[i_9_ + 5];
            i_0_ += numbers[i_9_];
            i_0_ ^= i_1_ << 11;
            i_1_ += i_2_;
            i_3_ += i_0_;
            i_1_ ^= i_2_ >>> 2;
            i_2_ += i_3_;
            i_4_ += i_1_;
            i_2_ ^= i_3_ << 8;
            i_3_ += i_4_;
            i_5_ += i_2_;
            i_3_ ^= i_4_ >>> 16;
            i_6_ += i_3_;
            i_4_ += i_5_;
            i_4_ ^= i_5_ << 10;
            i_7_ += i_4_;
            i_5_ += i_6_;
            i_5_ ^= i_6_ >>> 4;
            i_6_ += i_7_;
            i_6_ ^= i_7_ << 8;
            i_1_ += i_6_;
            i_0_ += i_5_;
            i_7_ += i_0_;
            i_7_ ^= i_0_ >>> 9;
            i_2_ += i_7_;
            i_0_ += i_1_;
            memory[i_9_] = i_0_;
            memory[i_9_ + 1] = i_1_;
            memory[i_9_ + 2] = i_2_;
            memory[i_9_ + 3] = i_3_;
            memory[i_9_ + 4] = i_4_;
            memory[i_9_ + 5] = i_5_;
            memory[i_9_ + 6] = i_6_;
            memory[i_9_ + 7] = i_7_;
        }
        for (int i_10_ = 0; i_10_ < 256; i_10_ += 8)
        {
            i_2_ += memory[i_10_ + 2];
            i_7_ += memory[i_10_ + 7];
            i_0_ += memory[i_10_];
            i_5_ += memory[i_10_ + 5];
            i_4_ += memory[i_10_ + 4];
            i_1_ += memory[i_10_ + 1];
            i_3_ += memory[i_10_ + 3];
            i_0_ ^= i_1_ << 11;
            i_1_ += i_2_;
            i_3_ += i_0_;
            i_6_ += memory[i_10_ + 6];
            i_1_ ^= i_2_ >>> 2;
            i_4_ += i_1_;
            i_2_ += i_3_;
            i_2_ ^= i_3_ << 8;
            i_3_ += i_4_;
            i_5_ += i_2_;
            i_3_ ^= i_4_ >>> 16;
            i_4_ += i_5_;
            i_4_ ^= i_5_ << 10;
            i_7_ += i_4_;
            i_6_ += i_3_;
            i_5_ += i_6_;
            i_5_ ^= i_6_ >>> 4;
            i_6_ += i_7_;
            i_6_ ^= i_7_ << 8;
            i_1_ += i_6_;
            i_0_ += i_5_;
            i_7_ += i_0_;
            i_7_ ^= i_0_ >>> 9;
            i_0_ += i_1_;
            i_2_ += i_7_;
            memory[i_10_] = i_0_;
            memory[i_10_ + 1] = i_1_;
            memory[i_10_ + 2] = i_2_;
            memory[i_10_ + 3] = i_3_;
            memory[i_10_ + 4] = i_4_;
            memory[i_10_ + 5] = i_5_;
            memory[i_10_ + 6] = i_6_;
            memory[i_10_ + 7] = i_7_;
        }
        generate();
        numberIndex = 256;
    }

    static final int method1460(byte i, Class21 class21)
    {
        try
        {
            if (i != -126)
                aLong1482 = -41L;
            anInt1487++;
            int i_11_ = 0;
            if (class21.method360(Class17.anInt279, i + 126))
                i_11_++;
            if (class21.method360(Class68_Sub13_Sub14.anInt3672, 0))
                i_11_++;
            return i_11_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ng.D(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1461(int y, int plane, boolean bool, int x, int coordX, int coordY)
    {
        anInt1496++;
        if (coordX != ItemDefinition.anInt365 || Class43.anInt732 != coordY || (Class68_Sub13_Sub18.anInt3739 != plane && !Class28.method398(24781)))
        {
            Class68_Sub13_Sub18.anInt3739 = plane;
            Class43.anInt732 = coordY;
            ItemDefinition.anInt365 = coordX;
            if (Class28.method398(24781))
                Class68_Sub13_Sub18.anInt3739 = 0;
            if (!bool)
                Class17.method296(25, (byte) -85);
            else
                Class17.method296(28, (byte) -76);
            Class74.method1381(true, Class68_Sub13_Sub19.aClass100_3744, -16678);
            int i_17_ = Class36.baseX;
            Class36.baseX = 8 * coordX - 48;
            int i_18_ = Class68_Sub13_Sub35.baseY;
            Class68_Sub13_Sub35.baseY = coordY * 8 - 48;
            Class97.aClass68_Sub20_Sub16_1704 = CipheredByteVector.method975(Class43.anInt732 * 8, 8 * ItemDefinition.anInt365, 111);
            int i_19_ = Class36.baseX - i_17_;
            i_17_ = Class36.baseX;
            int i_20_ = Class68_Sub13_Sub35.baseY - i_18_;
            i_18_ = Class68_Sub13_Sub35.baseY;
            if (bool)
            {
                Class13_Sub2.localNPCCount = 0;
                for (int i_21_ = 0; i_21_ < 32768; i_21_++)
                {
                    NPC class1_sub6_sub1 = Class102.localNPCs[i_21_];
                    if (class1_sub6_sub1 != null)
                    {
                        ((Character) class1_sub6_sub1).x -= i_19_ * 128;
                        ((Character) class1_sub6_sub1).y -= i_20_ * 128;
                        if (((Character) class1_sub6_sub1).x >= 0 && (((Character) class1_sub6_sub1).x <= 13184) && ((Character) class1_sub6_sub1).y >= 0 && (((Character) class1_sub6_sub1).y <= 13184))
                        {
                            for (int i_22_ = 0; i_22_ < 10; i_22_++)
                            {
                                ((Character) class1_sub6_sub1).walkQueueX[i_22_] -= i_19_;
                                ((Character) class1_sub6_sub1).walkQueueY[i_22_] -= i_20_;
                            }
                            Class68_Sub10.localNPCIndices[Class13_Sub2.localNPCCount++] = i_21_;
                        } else
                        {
                            ((NPC) (Class102.localNPCs[i_21_])).definition = null;
                            Class102.localNPCs[i_21_] = null;
                        }
                    }
                }
            } else
            {
                for (int i_23_ = 0; i_23_ < 32768; i_23_++)
                {
                    NPC class1_sub6_sub1 = Class102.localNPCs[i_23_];
                    if (class1_sub6_sub1 != null)
                    {
                        for (int i_24_ = 0; i_24_ < 10; i_24_++)
                        {
                            ((Character) class1_sub6_sub1).walkQueueX[i_24_] -= i_19_;
                            ((Character) class1_sub6_sub1).walkQueueY[i_24_] -= i_20_;
                        }
                        ((Character) class1_sub6_sub1).x -= 128 * i_19_;
                        ((Character) class1_sub6_sub1).y -= 128 * i_20_;
                    }
                }
            }
            for (int i_25_ = 0; i_25_ < 2048; i_25_++)
            {
                Player class1_sub6_sub2 = Class68_Sub13_Sub4.localPlayers[i_25_];
                if (class1_sub6_sub2 != null)
                {
                    for (int i_26_ = 0; i_26_ < 10; i_26_++)
                    {
                        ((Character) class1_sub6_sub2).walkQueueX[i_26_] -= i_19_;
                        ((Character) class1_sub6_sub2).walkQueueY[i_26_] -= i_20_;
                    }
                    ((Character) class1_sub6_sub2).y -= i_20_ * 128;
                    ((Character) class1_sub6_sub2).x -= 128 * i_19_;
                }
            }
            GameSocket.plane = plane;
            Class68_Sub7.localPlayer.setPosition(y, x, false);
            int i_27_ = 1;
            int i_28_ = 0;
            int i_29_ = 0;
            int i_30_ = 104;
            if (i_19_ < 0)
            {
                i_30_ = -1;
                i_28_ = 103;
                i_27_ = -1;
            }
            int i_31_ = 1;
            int i_32_ = 104;
            if (i_20_ < 0)
            {
                i_32_ = -1;
                i_31_ = -1;
                i_29_ = 103;
            }
            for (int i_33_ = i_28_; i_30_ != i_33_; i_33_ += i_27_)
            {
                for (int i_34_ = i_29_; i_32_ != i_34_; i_34_ += i_31_)
                {
                    int i_35_ = i_34_ + i_20_;
                    int i_36_ = i_19_ + i_33_;
                    for (int i_37_ = 0; i_37_ < 4; i_37_++)
                    {
                        if (i_36_ >= 0 && i_35_ >= 0 && i_36_ < 104 && i_35_ < 104)
                            Widget.groundItems[i_37_][i_33_][i_34_] = (Widget.groundItems[i_37_][i_36_][i_35_]);
                        else
                            Widget.groundItems[i_37_][i_33_][i_34_] = null;
                    }
                }
            }
            for (Class68_Sub2 class68_sub2 = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method293((byte) 76); class68_sub2 != null; class68_sub2 = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method290((byte) -108))
            {
                ((Class68_Sub2) class68_sub2).anInt2786 -= i_20_;
                ((Class68_Sub2) class68_sub2).anInt2793 -= i_19_;
                if (((Class68_Sub2) class68_sub2).anInt2793 < 0 || ((Class68_Sub2) class68_sub2).anInt2786 < 0 || ((Class68_Sub2) class68_sub2).anInt2793 >= 104 || ((Class68_Sub2) class68_sub2).anInt2786 >= 104)
                    class68_sub2.unlink();
            }
            if (Class95.destinationX != 0)
            {
                Class75_Sub2.destinationY -= i_20_;
                Class95.destinationX -= i_19_;
            }
            if (!bool)
                NodeSubList.anInt2216 = 1;
            else
            {
                Class8.cameraViewToX -= i_19_;
                PlayerDefinition.cameraViewToY -= i_20_;
                Class68_Sub13_Sub37.cameraPositionY_local -= i_20_;
                Stream.cameraPositionX_local -= i_19_;
            }
            Class68_Sub13_Sub32.anInt3983 = -1;
            Item.anInt2437 = 0;
            Class105.aClass16_1792.method284(105);
            Widget.aClass16_886.method284(105);
        }
    }

    static final void method1462(int i, long l)
    {
        anInt1485++;
        ((Stream) Class21.connectionVector).position = 0;
        Class21.connectionVector.writeByte(118);
        Class21.connectionVector.writeLong(l);
        Class68_Sub13_Sub27.anInt3916 = 1;
        Class50.anInt980 = i;
        Class88.anInt1604 = 0;
        Object1.anInt1190 = 0;
    }

    static final Class92_Sub1[] method1463(int i)
    {
        anInt1494++;
        Class92_Sub1[] class92_sub1s = new Class92_Sub1[Stream.anInt3009];
        for (int i_38_ = 0; i_38_ < Stream.anInt3009; i_38_++)
            class92_sub1s[i_38_] = new Class92_Sub1(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[i_38_], ObjectDefinition.anIntArray1998[i_38_], Class68_Sub13_Sub12.anIntArray3641[i_38_], Class68_Sub13_Sub19.anIntArray3759[i_38_], Object5.aByteArrayArray1240[i_38_], Class68_Sub13_Sub17.anIntArray3721);
        Class87.method1493((byte) -93);
        if (i < 11)
            return null;
        return class92_sub1s;
    }

    private final void generate()
    {
        lastResult += ++counter;
        for (int i_39_ = 0; i_39_ < 256; i_39_++)
        {
            int i_40_ = memory[i_39_];
            if ((0x2 & i_39_) != 0)
            {
                if ((i_39_ & 0x1) != 0)
                    accumulator ^= accumulator >>> 16;
                else
                    accumulator ^= accumulator << 2;
            } else if ((0x1 & i_39_) == 0)
                accumulator ^= accumulator << 13;
            else
                accumulator ^= accumulator >>> 6;
            accumulator += memory[0xff & i_39_ + 128];
            int i_41_;
            memory[i_39_] = i_41_ = (accumulator + memory[Class120.method1746(i_40_ >> 2, 255)] + lastResult);
            numbers[i_39_] = lastResult = i_40_ + memory[Class120.method1746(i_41_ >> 8 >> 2, 255)];
        }
    }

    public static void method1465(byte i)
    {
        aByteArray1498 = null;
        if (i < 80)
            anInt1495 = 48;
        aClass100_1483 = null;
        aClass100_1480 = null;
        aClass100_1490 = null;
    }

    static final boolean method1466(int i)
    {
        if (i != -15855)
            aLong1482 = 17L;
        anInt1492++;
        if (Class68_Sub13_Sub10.anInt3599 != 0)
        {
            try
            {
                if (((Boolean) (Class68_Sub20_Sub15.aClass100_4392.method1610(Class75_Sub1_Sub1.signlink.gameApplet, (byte) -123))).booleanValue())
                    return false;
                return true;
            } catch (Throwable throwable)
            {
                /* empty */
            }
        }
        return true;
    }

    static final Sprite[] method1467(boolean bool, int i, int i_42_, Class21 class21)
    {
        try
        {
            anInt1475++;
            if (bool != false)
                anInt1495 = 43;
            if (!Class68_Sub13_Sub36.method880(-29381, i, class21, i_42_))
                return null;
            return Class121.method1750(true);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ng.C(" + bool + ',' + i + ',' + i_42_ + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    final int getNext()
    {
        if (numberIndex-- == 0)
        {
            generate();
            numberIndex = 255;
        }
        return numbers[numberIndex];
    }

    private RandomNumberGenerator()
    {
        /* empty */
    }

    RandomNumberGenerator(int[] is)
    {
        try
        {
            memory = new int[256];
            numbers = new int[256];
            for (int i = 0; is.length > i; i++)
                numbers[i] = is[i];
            initialize();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ng.<init>(" + (is != null ? "{...}" : "null") + ')');
        }
    }

    static
    {
        aClass100_1480 = Class112.makeMutableString(43, "<col=ffb000>");
        aClass100_1490 = Class112.makeMutableString(43, "<col=ff3000>");
        anInt1491 = -1;
        aBoolean1489 = true;
        aClass100_1483 = Class112.makeMutableString(43, "details");
        aByteArray1498 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
    }
}
