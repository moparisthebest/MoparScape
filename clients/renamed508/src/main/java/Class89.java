/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

final class Class89
{
    static MutableString aClass100_1613;
    private int anInt1614;
    static int anInt1615;
    private Class124 aClass124_1616;
    static byte aByte1617;
    private Class124 aClass124_1618 = null;
    private int anInt1619 = 65000;
    static MutableString aClass100_1620 = Class112.makeMutableString(43, "(U1");
    static MutableString aClass100_1621;
    static int anInt1622;
    static MutableString aClass100_1623;
    static Image anImage1624;
    static int anInt1625;
    static int anInt1626;
    static int anInt1627;
    static int anInt1628;
    static int anInt1629;
    static int anInt1630;
    static int anInt1631;

    static final void method1504(int i, int i_0_, int i_1_)
    {
        for (int i_2_ = 0; i_2_ < Mouse.anInt1584; i_2_++)
        {
            for (int i_3_ = 0; i_3_ < GameApplet.anInt7; i_3_++)
            {
                for (int i_4_ = 0; i_4_ < Class97.anInt1716; i_4_++)
                {
                    Ground class68_sub1 = (Class22.groundArray[i_2_][i_3_][i_4_]);
                    if (class68_sub1 != null)
                    {
                        Object1 class64 = ((Ground) class68_sub1).object_1;
                        if (class64 != null && ((Object1) class64).aClass1_1181.method58())
                        {
                            Class68_Sub27.method1218((((Object1) class64).aClass1_1181), i_2_, i_3_, i_4_, 1, 1);
                            if (((Object1) class64).aClass1_1184 != null && ((Object1) class64).aClass1_1184.method58())
                            {
                                Class68_Sub27.method1218((((Object1) class64).aClass1_1184), i_2_, i_3_, i_4_, 1, 1);
                                ((Object1) class64).aClass1_1181.method52(((Object1) class64).aClass1_1184, 0, 0, 0, false);
                                ((Object1) class64).aClass1_1184 = ((Object1) class64).aClass1_1184.method57(i, i_0_, i_1_);
                            }
                            ((Object1) class64).aClass1_1181 = ((Object1) class64).aClass1_1181.method57(i, i_0_, i_1_);
                        }
                        for (int i_5_ = 0; i_5_ < ((Ground) class68_sub1).anInt2773; i_5_++)
                        {
                            Object5 class69 = (((Ground) class68_sub1).object_5[i_5_]);
                            if (class69 != null && ((Object5) class69).aClass1_1242.method58())
                            {
                                Class68_Sub27.method1218(((Object5) class69).aClass1_1242, i_2_, i_3_, i_4_, (((Object5) class69).anInt1238 - ((Object5) class69).anInt1254 + 1), (((Object5) class69).anInt1234 - ((Object5) class69).anInt1253 + 1));
                                ((Object5) class69).aClass1_1242 = ((Object5) class69).aClass1_1242.method57(i, i_0_, i_1_);
                            }
                        }
                        Object3 class47 = ((Ground) class68_sub1).object_3;
                        if (class47 != null && ((Object3) class47).aClass1_931.method58())
                        {
                            Class68_Sub20_Sub5.method1062((((Object3) class47).aClass1_931), i_2_, i_3_, i_4_);
                            ((Object3) class47).aClass1_931 = ((Object3) class47).aClass1_931.method57(i, i_0_, i_1_);
                        }
                    }
                }
            }
        }
    }

    static final void method1505(int i, int i_6_, int i_7_, boolean bool, int i_8_, int i_9_)
    {
        anInt1631++;
        Class34.method416(i_6_ - i_8_, (byte) -17, i_9_, Class68_Sub22.anIntArrayArray3134[i_7_], i_6_ + i_8_);
        int i_10_ = i;
        int i_11_ = i_8_ * i_8_;
        int i_12_ = 0;
        int i_13_ = i * i;
        int i_14_ = i_13_ << 1;
        int i_15_ = i_11_ << 1;
        int i_16_ = i << 1;
        if (bool != true)
            anImage1624 = null;
        int i_17_ = (1 - i_16_) * i_11_ + i_14_;
        int i_18_ = i_13_ - (i_16_ - 1) * i_15_;
        int i_19_ = i_11_ << 2;
        int i_20_ = i_13_ << 2;
        int i_21_ = ((i_12_ << 1) + 3) * i_14_;
        int i_22_ = i_19_ * (i_10_ - 1);
        int i_23_ = (i_12_ + 1) * i_20_;
        int i_24_ = ((i_10_ << 1) - 3) * i_15_;
        while (i_10_ > 0)
        {
            i_10_--;
            if (i_17_ < 0)
            {
                while (i_17_ < 0)
                {
                    i_12_++;
                    i_18_ += i_23_;
                    i_23_ += i_20_;
                    i_17_ += i_21_;
                    i_21_ += i_20_;
                }
            }
            int i_25_ = i_7_ - i_10_;
            if (i_18_ < 0)
            {
                i_12_++;
                i_18_ += i_23_;
                i_17_ += i_21_;
                i_21_ += i_20_;
                i_23_ += i_20_;
            }
            int i_26_ = i_6_ + i_12_;
            int i_27_ = i_6_ - i_12_;
            Class34.method416(i_27_, (byte) -17, i_9_, Class68_Sub22.anIntArrayArray3134[i_25_], i_26_);
            i_17_ -= i_22_;
            i_22_ -= i_19_;
            i_18_ -= i_24_;
            i_24_ -= i_19_;
            int i_28_ = i_7_ + i_10_;
            Class34.method416(i_27_, (byte) -17, i_9_, Class68_Sub22.anIntArrayArray3134[i_28_], i_26_);
        }
    }

    static final void method1506(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_)
    {
        anInt1628++;
        Class68_Sub2 class68_sub2 = null;
        if (i_29_ != 0)
            method1510(-51, 16, 10, 40, -61, null, null, null, null, null, null, -61, (byte) 4, 55, -127);
        for (Class68_Sub2 class68_sub2_38_ = ((Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method293((byte) 76)); class68_sub2_38_ != null; class68_sub2_38_ = ((Class68_Sub2) Class68_Sub13_Sub31.aClass16_3965.method290((byte) 14)))
        {
            if (i_35_ == ((Class68_Sub2) class68_sub2_38_).anInt2791 && i == ((Class68_Sub2) class68_sub2_38_).anInt2793 && i_32_ == ((Class68_Sub2) class68_sub2_38_).anInt2786 && i_31_ == ((Class68_Sub2) class68_sub2_38_).anInt2788)
            {
                class68_sub2 = class68_sub2_38_;
                break;
            }
        }
        if (class68_sub2 == null)
        {
            class68_sub2 = new Class68_Sub2();
            ((Class68_Sub2) class68_sub2).anInt2788 = i_31_;
            ((Class68_Sub2) class68_sub2).anInt2793 = i;
            ((Class68_Sub2) class68_sub2).anInt2791 = i_35_;
            ((Class68_Sub2) class68_sub2).anInt2786 = i_32_;
            Class68_Sub13_Sub36.method882(class68_sub2, true);
            Class68_Sub13_Sub31.aClass16_3965.pushFront(class68_sub2);
        }
        ((Class68_Sub2) class68_sub2).anInt2797 = i_30_;
        ((Class68_Sub2) class68_sub2).anInt2792 = i_33_;
        ((Class68_Sub2) class68_sub2).anInt2799 = i_37_;
        ((Class68_Sub2) class68_sub2).anInt2796 = i_36_;
        ((Class68_Sub2) class68_sub2).anInt2789 = i_34_;
    }

    public static void method1507(byte i)
    {
        aClass100_1621 = null;
        anImage1624 = null;
        aClass100_1623 = null;
        if (i < 99)
            method1512(124, 7, 65);
        aClass100_1620 = null;
        aClass100_1613 = null;
    }

    private final boolean method1508(int i, byte i_39_, int i_40_, byte[] is, boolean bool)
    {
        try
        {
            anInt1627++;
            synchronized (aClass124_1618)
            {
                try
                {
                    int i_41_;
                    if (bool)
                    {
                        if (aClass124_1616.method1760((byte) 90) < (long) (i_40_ * 6 + 6))
                            return false;
                        aClass124_1616.method1766((long) (6 * i_40_), 1);
                        aClass124_1616.method1767(0, 6, 0, Keyboard.aByteArray2127);
                        i_41_ = ((Keyboard.aByteArray2127[5] & 0xff) + (((Keyboard.aByteArray2127[4] & 0xff) << 8) + (0xff0000 & Keyboard.aByteArray2127[3] << 16)));
                        if (i_41_ <= 0 || ((long) i_41_ > aClass124_1618.method1760((byte) 75) / 520L))
                            return false;
                    } else
                    {
                        i_41_ = (int) ((aClass124_1618.method1760((byte) 51) + 519L) / 520L);
                        if (i_41_ == 0)
                            i_41_ = 1;
                    }
                    Keyboard.aByteArray2127[1] = (byte) (i >> 8);
                    Keyboard.aByteArray2127[2] = (byte) i;
                    Keyboard.aByteArray2127[5] = (byte) i_41_;
                    Keyboard.aByteArray2127[0] = (byte) (i >> 16);
                    Keyboard.aByteArray2127[3] = (byte) (i_41_ >> 16);
                    Keyboard.aByteArray2127[4] = (byte) (i_41_ >> 8);
                    aClass124_1616.method1766((long) (6 * i_40_), 1);
                    aClass124_1616.method1761(6, 0, 0, Keyboard.aByteArray2127);
                    int i_42_ = -90 % ((40 - i_39_) / 54);
                    int i_43_ = 0;
                    int i_44_ = 0;
                    int i_45_;
                    for (/**/; i > i_43_; i_43_ += i_45_)
                    {
                        int i_46_ = 0;
                        if (bool)
                        {
                            aClass124_1618.method1766((long) (i_41_ * 520), 1);
                            try
                            {
                                aClass124_1618.method1767(0, 8, 0, (Keyboard.aByteArray2127));
                            } catch (java.io.EOFException eofexception)
                            {
                                break;
                            }
                            i_45_ = (((Keyboard.aByteArray2127[0] & 0xff) << 8) + (Keyboard.aByteArray2127[1] & 0xff));
                            i_46_ = ((Keyboard.aByteArray2127[6] & 0xff) + (Keyboard.aByteArray2127[4] << 16 & 0xff0000) + (0xff00 & Keyboard.aByteArray2127[5] << 8));
                            int i_47_ = Keyboard.aByteArray2127[7] & 0xff;
                            int i_48_ = (((0xff & Keyboard.aByteArray2127[2]) << 8) + (Keyboard.aByteArray2127[3] & 0xff));
                            if (i_45_ != i_40_ || i_48_ != i_44_ || anInt1614 != i_47_)
                                return false;
                            if (i_46_ < 0 || ((long) i_46_ > (aClass124_1618.method1760((byte) 116) / 520L)))
                                return false;
                        }
                        if (i_46_ == 0)
                        {
                            bool = false;
                            i_46_ = (int) ((aClass124_1618.method1760((byte) 82) + 519L) / 520L);
                            if (i_46_ == 0)
                                i_46_++;
                            if (i_46_ == i_41_)
                                i_46_++;
                        }
                        Keyboard.aByteArray2127[0] = (byte) (i_40_ >> 8);
                        Keyboard.aByteArray2127[2] = (byte) (i_44_ >> 8);
                        Keyboard.aByteArray2127[7] = (byte) anInt1614;
                        Keyboard.aByteArray2127[1] = (byte) i_40_;
                        if (i - i_43_ <= 512)
                            i_46_ = 0;
                        Keyboard.aByteArray2127[6] = (byte) i_46_;
                        Keyboard.aByteArray2127[5] = (byte) (i_46_ >> 8);
                        Keyboard.aByteArray2127[3] = (byte) i_44_;
                        i_45_ = i - i_43_;
                        Keyboard.aByteArray2127[4] = (byte) (i_46_ >> 16);
                        i_44_++;
                        if (i_45_ > 512)
                            i_45_ = 512;
                        aClass124_1618.method1766((long) (i_41_ * 520), 1);
                        aClass124_1618.method1761(8, 0, 0, Keyboard.aByteArray2127);
                        i_41_ = i_46_;
                        aClass124_1618.method1761(i_45_, 0, i_43_, is);
                    }
                    return true;
                } catch (java.io.IOException ioexception)
                {
                    return false;
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("p.D(" + i + ',' + i_39_ + ',' + i_40_ + ',' + (is != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    final boolean method1509(byte[] is, int i, int i_49_, byte i_50_)
    {
        try
        {
            anInt1626++;
            synchronized (aClass124_1618)
            {
                if (i_49_ < 0 || anInt1619 < i_49_)
                    throw new IllegalArgumentException();
                boolean bool = method1508(i_49_, (byte) 123, i, is, true);
                if (!bool)
                    bool = method1508(i_49_, (byte) -109, i, is, false);
                int i_51_ = -116 % ((i_50_ + 61) / 47);
                return bool;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("p.G(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_49_ + ',' + i_50_ + ')'));
        }
    }

    static final void method1510(int i, int i_52_, int i_53_, int i_54_, int i_55_, byte[][][] is, int[] is_56_, int[] is_57_, int[] is_58_, int[] is_59_, int[] is_60_, int i_61_, byte i_62_, int i_63_, int i_64_)
    {
        if (i < 0)
            i = 0;
        else if (i >= GameApplet.anInt7 * 128)
            i = GameApplet.anInt7 * 128 - 1;
        if (i_53_ < 0)
            i_53_ = 0;
        else if (i_53_ >= Class97.anInt1716 * 128)
            i_53_ = Class97.anInt1716 * 128 - 1;
        Class13_Sub2.anInt2653 = Class62.PRECOMPUTED_SINE_CACHE[i_54_];
        Class66.anInt1205 = Class62.PRECOMUPTED_COSINE_CACHE[i_54_];
        NodeSubList.anInt2222 = Class62.PRECOMPUTED_SINE_CACHE[i_55_];
        NodeList.anInt278 = Class62.PRECOMUPTED_COSINE_CACHE[i_55_];
        Class25.anInt518 = i;
        Class68_Sub17.anInt3035 = i_52_;
        Class68_Sub20_Sub12.anInt4357 = i_53_;
        Class68_Sub20_Sub10.anInt4321 = i / 128;
        Class68_Sub26.anInt3188 = i_53_ / 128;
        Object5.anInt1239 = Class68_Sub20_Sub10.anInt4321 - ClientScript.anInt4386;
        if (Object5.anInt1239 < 0)
            Object5.anInt1239 = 0;
        Class85.anInt1559 = Class68_Sub26.anInt3188 - ClientScript.anInt4386;
        if (Class85.anInt1559 < 0)
            Class85.anInt1559 = 0;
        Class30.anInt549 = Class68_Sub20_Sub10.anInt4321 + ClientScript.anInt4386;
        if (Class30.anInt549 > GameApplet.anInt7)
            Class30.anInt549 = GameApplet.anInt7;
        RandomNumberGenerator.anInt1495 = Class68_Sub26.anInt3188 + ClientScript.anInt4386;
        if (RandomNumberGenerator.anInt1495 > Class97.anInt1716)
            RandomNumberGenerator.anInt1495 = Class97.anInt1716;
        int i_65_ = 3500;
        for (int i_66_ = 0; i_66_ < (ClientScript.anInt4386 + ClientScript.anInt4386 + 2); i_66_++)
        {
            for (int i_67_ = 0; i_67_ < (ClientScript.anInt4386 + ClientScript.anInt4386 + 2); i_67_++)
            {
                int i_68_ = ((i_66_ - ClientScript.anInt4386 << 7) - (Class25.anInt518 & 0x7f));
                int i_69_ = ((i_67_ - ClientScript.anInt4386 << 7) - (Class68_Sub20_Sub12.anInt4357 & 0x7f));
                int i_70_ = (Class68_Sub20_Sub10.anInt4321 - ClientScript.anInt4386 + i_66_);
                int i_71_ = (Class68_Sub26.anInt3188 - ClientScript.anInt4386 + i_67_);
                if (i_70_ >= 0 && i_71_ >= 0 && i_70_ < GameApplet.anInt7 && i_71_ < Class97.anInt1716)
                {
                    int i_72_;
                    if (Class68_Sub13_Sub14.anIntArrayArrayArray3673 != null)
                        i_72_ = (Class68_Sub13_Sub14.anIntArrayArrayArray3673[0][i_70_][i_71_]) - Class68_Sub17.anInt3035 + 128;
                    else
                        i_72_ = (Class74.anIntArrayArrayArray1335[0][i_70_][i_71_]) - Class68_Sub17.anInt3035 + 128;
                    int i_73_ = (Class74.anIntArrayArrayArray1335[3][i_70_][i_71_] - Class68_Sub17.anInt3035 - 1000);
                    Class68_Sub13_Sub18.aBooleanArrayArray3740[i_66_][i_67_] = Class68_Sub20_Sub12.method1151(i_68_, i_73_, i_72_, i_69_, i_65_);
                } else
                    Class68_Sub13_Sub18.aBooleanArrayArray3740[i_66_][i_67_] = false;
            }
        }
        for (int i_74_ = 0; i_74_ < (ClientScript.anInt4386 + ClientScript.anInt4386 + 1); i_74_++)
        {
            for (int i_75_ = 0; i_75_ < (ClientScript.anInt4386 + ClientScript.anInt4386 + 1); i_75_++)
                Class68_Sub9.aBooleanArrayArray2889[i_74_][i_75_] = (Class68_Sub13_Sub18.aBooleanArrayArray3740[i_74_][i_75_] || (Class68_Sub13_Sub18.aBooleanArrayArray3740[i_74_ + 1][i_75_]) || (Class68_Sub13_Sub18.aBooleanArrayArray3740[i_74_][i_75_ + 1]) || (Class68_Sub13_Sub18.aBooleanArrayArray3740[i_74_ + 1][i_75_ + 1]));
        }
        Class68_Sub13_Sub10.anIntArray3593 = is_56_;
        Class68_Sub22.anIntArray3139 = is_57_;
        Animation.anIntArray2044 = is_58_;
        Class68_Sub16.anIntArray3031 = is_59_;
        Class53.anIntArray1020 = is_60_;
        Class68_Sub20_Sub8.method1095();
        Class20.method324(i, i_52_, i_53_, is, i_61_, i_62_, i_63_, i_64_);
    }

    static final void parseLocalNPCUpdateFlag()
    {
        for (int idx = 0; idx < Class68_Sub20_Sub16.updateBlockCount; idx++)
        {
            int index = CipheredByteVector.updateBlockIndices[idx];
            NPC npc = Class102.localNPCs[index];
            int flag = Class68_Sub13_Sub8.connectionVector.readUByte();
            if ((flag & 0x10) != 0)
            {
                npc.interactingEntity = Class68_Sub13_Sub8.connectionVector.readUShort();
                if (npc.interactingEntity == 65535)
                    npc.interactingEntity = -1;
            }
            if ((flag & 0x8) != 0)
            {
                if (((NPC) npc).definition.method1450())
                    Class68_Sub13_Sub4.method717(npc, 2);
                ((NPC) npc).definition = (Class68_Sub13_Sub11.getNPCDefinition(Class68_Sub13_Sub8.connectionVector.readLEUShort()));
                ((Character) npc).anInt2532 = ((NPCDefinition) (((NPC) npc).definition)).anInt1411;
                ((Character) npc).anInt2567 = ((NPCDefinition) (((NPC) npc).definition)).anInt1469;
                ((Character) npc).anInt2576 = ((NPCDefinition) (((NPC) npc).definition)).anInt1449;
                ((Character) npc).anInt2545 = ((NPCDefinition) (((NPC) npc).definition)).anInt1442;
                ((Character) npc).anInt2534 = ((NPCDefinition) (((NPC) npc).definition)).anInt1412;
                ((Character) npc).anInt2566 = ((NPCDefinition) (((NPC) npc).definition)).anInt1423;
                ((Character) npc).anInt2583 = ((NPCDefinition) (((NPC) npc).definition)).anInt1458;
                ((Character) npc).raw_range = ((NPCDefinition) (((NPC) npc).definition)).anInt1453;
                ((Character) npc).anInt2565 = ((NPCDefinition) (((NPC) npc).definition)).anInt1417;
                if (((NPC) npc).definition.method1450())
                    Class52.method543(19395, (((Character) npc).walkQueueY[0]), npc, null, 0, (((Character) npc).walkQueueX[0]), GameSocket.plane, null);
            }
            if ((0x40 & flag) != 0)
            {
                ((Character) npc).message = Class68_Sub13_Sub8.connectionVector.readString();
                ((Character) npc).messageCycle = 100;
            }
            if ((flag & 0x1) != 0)
            {
                int i_79_ = Class68_Sub13_Sub8.connectionVector.readUShortA();
                if (i_79_ == 65535)
                    i_79_ = -1;
                int i_80_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                Class101.method1631(0, i_79_, npc, i_80_);
            }
            if ((flag & 0x2) != 0)
            {
                ((Character) npc).anInt2554 = Class68_Sub13_Sub8.connectionVector.readUShortA();
                int i_81_ = Class68_Sub13_Sub8.connectionVector.method932(false);
                ((Character) npc).anInt2543 = (i_81_ & 0xffff) + Class68_Sub3.loopCycle;
                ((Character) npc).anInt2588 = 0;
                if (((Character) npc).anInt2554 == 65535)
                    ((Character) npc).anInt2554 = -1;
                ((Character) npc).anInt2562 = i_81_ >> 16;
                ((Character) npc).anInt2580 = 0;
                if (Class68_Sub3.loopCycle < ((Character) npc).anInt2543)
                    ((Character) npc).anInt2580 = -1;
            }
            if ((0x20 & flag) != 0)
            {
                int i_82_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                int i_83_ = Class68_Sub13_Sub8.connectionVector.readUByteS();
                npc.method149(i_82_, false, Class68_Sub3.loopCycle, i_83_);
            }
            if ((flag & 0x80) != 0)
            {
                ((Character) npc).anInt2528 = Class68_Sub13_Sub8.connectionVector.readUShortA();
                ((Character) npc).anInt2574 = Class68_Sub13_Sub8.connectionVector.readLEUShortA();
            }
            if ((0x4 & flag) != 0)
            {
                int i_84_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                int i_85_ = Class68_Sub13_Sub8.connectionVector.readUByte();
                npc.method149(i_84_, false, Class68_Sub3.loopCycle, i_85_);
                ((Character) npc).loopCycleStatus = Class68_Sub3.loopCycle + 300;
                ((Character) npc).hpRatio = Class68_Sub13_Sub8.connectionVector.readUByteS();
            }
        }
        anInt1625++;
    }

    public final String toString()
    {
        anInt1630++;
        return "Cache:" + anInt1614;
    }

    static final long method1512(int i, int i_86_, int i_87_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_86_][i_87_];
        if (class68_sub1 == null || ((Ground) class68_sub1).object_3 == null)
            return 0L;
        return (((Object3) ((Ground) class68_sub1).object_3).uid);
    }

    final byte[] method1513(int i, boolean bool)
    {
        anInt1629++;
        synchronized (aClass124_1618)
        {
            try
            {
                if (aClass124_1616.method1760((byte) 101) < (long) (i * 6 + 6))
                    return null;
                aClass124_1616.method1766((long) (i * 6), 1);
                aClass124_1616.method1767(0, 6, 0, Keyboard.aByteArray2127);
                int i_88_ = ((Keyboard.aByteArray2127[1] << 8 & 0xff00) + (((Keyboard.aByteArray2127[0] & 0xff) << 16) + (0xff & Keyboard.aByteArray2127[2])));
                int i_89_ = ((Keyboard.aByteArray2127[5] & 0xff) + (Keyboard.aByteArray2127[3] << 16 & 0xff0000) + ((Keyboard.aByteArray2127[4] & 0xff) << 8));
                if (bool != true)
                    return null;
                if (i_88_ < 0 || anInt1619 < i_88_)
                    return null;
                if (i_89_ <= 0 || (aClass124_1618.method1760((byte) 104) / 520L < (long) i_89_))
                    return null;
                byte[] is = new byte[i_88_];
                int i_90_ = 0;
                int i_91_ = 0;
                while (i_88_ > i_90_)
                {
                    if (i_89_ == 0)
                        return null;
                    aClass124_1618.method1766((long) (520 * i_89_), 1);
                    int i_92_ = i_88_ - i_90_;
                    if (i_92_ > 512)
                        i_92_ = 512;
                    aClass124_1618.method1767(0, i_92_ + 8, 0, Keyboard.aByteArray2127);
                    int i_93_ = ((0xff & Keyboard.aByteArray2127[6]) + ((0xff0000 & Keyboard.aByteArray2127[4] << 16) + (0xff00 & Keyboard.aByteArray2127[5] << 8)));
                    int i_94_ = (((Keyboard.aByteArray2127[0] & 0xff) << 8) + (0xff & Keyboard.aByteArray2127[1]));
                    int i_95_ = ((0xff & Keyboard.aByteArray2127[3]) + ((0xff & Keyboard.aByteArray2127[2]) << 8));
                    int i_96_ = 0xff & Keyboard.aByteArray2127[7];
                    if (i_94_ != i || i_95_ != i_91_ || anInt1614 != i_96_)
                        return null;
                    if (i_93_ < 0 || ((long) i_93_ > aClass124_1618.method1760((byte) 67) / 520L))
                        return null;
                    i_89_ = i_93_;
                    for (int i_97_ = 0; i_92_ > i_97_; i_97_++)
                        is[i_90_++] = Keyboard.aByteArray2127[i_97_ + 8];
                    i_91_++;
                }
                return is;
            } catch (java.io.IOException ioexception)
            {
                return null;
            }
        }
    }

    static final byte[] method1514(byte[] is, boolean bool)
    {
        try
        {
            int i = is.length;
            anInt1615++;
            byte[] is_98_ = new byte[i];
            if (bool != false)
                method1514(null, true);
            Class39.arraycopy(is, 0, is_98_, 0, i);
            return is_98_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("p.C(" + (is != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    Class89(int i, Class124 class124, Class124 class124_99_, int i_100_)
    {
        aClass124_1616 = null;
        try
        {
            anInt1614 = i;
            anInt1619 = i_100_;
            aClass124_1616 = class124_99_;
            aClass124_1618 = class124;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("p.<init>(" + i + ',' + (class124 != null ? "{...}" : "null") + ',' + (class124_99_ != null ? "{...}" : "null") + ',' + i_100_ + ')'));
        }
    }

    static
    {
        aByte1617 = (byte) 0;
        aClass100_1621 = Class112.makeMutableString(43, "(U3");
        aClass100_1613 = Class112.makeMutableString(43, "m-Ochte mit Ihnen handeln)3");
        aClass100_1623 = Class112.makeMutableString(43, "<br>(X");
    }
}
