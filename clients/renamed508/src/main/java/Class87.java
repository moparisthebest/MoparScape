/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class87 implements Runnable
{
    static boolean aBoolean1589 = false;
    static Class21 aClass21_1590;
    static int anInt1591;
    static int anInt1592;
    static int anInt1593;
    static int anInt1594;
    static int anInt1595;

    static final void method1493(byte i)
    {
        Class68_Sub13_Sub12.anIntArray3641 = null;
        Object5.aByteArrayArray1240 = null;
        Class68_Sub13_Sub17.anIntArray3721 = null;
        if (i != -93)
            aBoolean1589 = true;
        ObjectDefinition.anIntArray1998 = null;
        Class4.anIntArray96 = null;
        Class68_Sub13_Sub19.anIntArray3759 = null;
        anInt1595++;
    }

    public static void method1494(byte i)
    {
        aClass21_1590 = null;
        int i_0_ = 9 % ((i + 76) / 48);
    }

    static final void method1495(int i)
    {
        Class93.aClass98_1664.method1573(-51);
        anInt1593++;
        Class7.aClass98_124.method1573(-54);
        Class96.aClass98_1696.method1573(-9);
        if (i <= 52)
            aClass21_1590 = null;
    }

    public final void run()
    {
        anInt1594++;
        try
        {
            for (;;)
            {
                Class68_Sub25 class68_sub25;
                synchronized (Class68_Sub20_Sub10.aClass16_4316)
                {
                    class68_sub25 = (Class68_Sub25) Class68_Sub20_Sub10.aClass16_4316.method293((byte) 76);
                }
                if (class68_sub25 == null)
                {
                    Class50.method528(-5, 100L);
                    synchronized (Class63.anObject1169)
                    {
                        if (Class9.anInt169 <= 1)
                        {
                            Class9.anInt169 = 0;
                            Class63.anObject1169.notifyAll();
                            break;
                        }
                        Class9.anInt169--;
                    }
                } else
                {
                    if (((Class68_Sub25) class68_sub25).anInt3179 == 0)
                    {
                        ((Class68_Sub25) class68_sub25).aClass89_3172.method1509(((Class68_Sub25) class68_sub25).aByteArray3167, (int) ((Node) class68_sub25).nodeID, (((Class68_Sub25) class68_sub25).aByteArray3167).length, (byte) -111);
                        synchronized (Class68_Sub20_Sub10.aClass16_4316)
                        {
                            class68_sub25.unlink();
                        }
                    } else if (((Class68_Sub25) class68_sub25).anInt3179 == 1)
                    {
                        ((Class68_Sub25) class68_sub25).aByteArray3167 = (((Class68_Sub25) class68_sub25).aClass89_3172.method1513((int) ((Node) class68_sub25).nodeID, true));
                        synchronized (Class68_Sub20_Sub10.aClass16_4316)
                        {
                            Class127.aClass16_2207.pushFront(class68_sub25);
                        }
                    }
                    synchronized (Class63.anObject1169)
                    {
                        if (Class9.anInt169 <= 1)
                        {
                            Class9.anInt169 = 0;
                            Class63.anObject1169.notifyAll();
                            break;
                        }
                        Class9.anInt169 = 600;
                    }
                }
            }
        } catch (Exception exception)
        {
            Class71.method1339(null, exception, 38);
        }
    }

    static final Class68_Sub20_Sub10 method1496(byte i)
    {
        int i_1_ = -82 % ((-66 - i) / 35);
        int i_2_ = (Class68_Sub13_Sub19.anIntArray3759[0] * Class68_Sub13_Sub12.anIntArray3641[0]);
        byte[] is = Object5.aByteArrayArray1240[0];
        int[] is_3_ = new int[i_2_];
        anInt1591++;
        for (int i_4_ = 0; i_2_ > i_4_; i_4_++)
            is_3_[i_4_] = (Class68_Sub13_Sub17.anIntArray3721[Class120.method1746(is[i_4_], 255)]);
        Sprite class68_sub20_sub10_sub1 = (new Sprite(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[0], ObjectDefinition.anIntArray1998[0], Class68_Sub13_Sub12.anIntArray3641[0], Class68_Sub13_Sub19.anIntArray3759[0], is_3_));
        method1493((byte) -93);
        return class68_sub20_sub10_sub1;
    }

    static final void method1497(byte i)
    {
        if (i != -110)
            method1497((byte) -69);
        anInt1592++;
        int i_5_ = Class7.aByteArrayArray133.length;
        for (int i_6_ = 0; i_5_ > i_6_; i_6_++)
        {
            if (Class7.aByteArrayArray133[i_6_] != null)
            {
                int i_7_ = -1;
                for (int i_8_ = 0; Class85.anInt1550 > i_8_; i_8_++)
                {
                    if (Class111.anIntArray1865[i_8_] == Class119.mapDataAreas[i_6_])
                    {
                        i_7_ = i_8_;
                        break;
                    }
                }
                if (i_7_ == -1)
                {
                    Class111.anIntArray1865[Class85.anInt1550] = Class119.mapDataAreas[i_6_];
                    i_7_ = Class85.anInt1550++;
                }
                Stream class68_sub14 = new Stream(Class7.aByteArrayArray133[i_6_]);
                int i_9_ = 0;
                while (Class7.aByteArrayArray133[i_6_].length > ((Stream) class68_sub14).position)
                {
                    if (i_9_ >= 511)
                        break;
                    int i_10_ = i_7_ | i_9_++ << 6;
                    int i_11_ = class68_sub14.readUShort();
                    int i_12_ = i_11_ >> 14;
                    int i_13_ = i_11_ & 0x3f;
                    int i_14_ = 0x3f & i_11_ >> 7;
                    int i_15_ = i_14_ + ((Class119.mapDataAreas[i_6_] >> 8) * 64 - Class36.baseX);
                    int i_16_ = i_13_ + (64 * (Class119.mapDataAreas[i_6_] & 0xff) - Class68_Sub13_Sub35.baseY);
                    NPCDefinition class80 = (Class68_Sub13_Sub11.getNPCDefinition(class68_sub14.readUShort()));
                    if (Class102.localNPCs[i_10_] == null && (((NPCDefinition) class80).aByte1448 & 0x1) > 0 && Class68_Sub13_Sub18.anInt3739 == i_12_ && i_15_ >= 0 && ((NPCDefinition) class80).anInt1453 + i_15_ < 104 && i_16_ >= 0 && ((NPCDefinition) class80).anInt1453 + i_16_ < 104)
                    {
                        Class102.localNPCs[i_10_] = new NPC();
                        NPC class1_sub6_sub1 = Class102.localNPCs[i_10_];
                        Class68_Sub10.localNPCIndices[Class13_Sub2.localNPCCount++] = i_10_;
                        ((Character) class1_sub6_sub1).lastUpdate = Class68_Sub3.loopCycle;
                        ((NPC) class1_sub6_sub1).definition = class80;
                        ((Character) class1_sub6_sub1).anInt2532 = ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1411;
                        ((Character) class1_sub6_sub1).anInt2545 = ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1442;
                        ((Character) class1_sub6_sub1).anInt2566 = ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1423;
                        ((Character) class1_sub6_sub1).anInt2567 = ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1469;
                        ((Character) class1_sub6_sub1).anInt2583 = ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1458;
                        ((Character) class1_sub6_sub1).anInt2565 = ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1417;
                        ((Character) class1_sub6_sub1).anInt2534 = ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1412;
                        ((Character) class1_sub6_sub1).raw_range = ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1453;
                        ((Character) class1_sub6_sub1).anInt2576 = ((NPCDefinition) (((NPC) class1_sub6_sub1).definition)).anInt1449;
                        if (((Character) class1_sub6_sub1).anInt2583 == 0)
                            ((Character) class1_sub6_sub1).anInt2550 = 0;
                        class1_sub6_sub1.setPosition(i_16_, i_15_, true);
                    }
                }
            }
        }
    }
}
