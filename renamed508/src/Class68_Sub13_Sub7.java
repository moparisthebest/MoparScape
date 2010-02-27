/* Class68_Sub13_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub7 extends Class68_Sub13
{
    static int anInt3547;
    static int anInt3548;
    static int anInt3549;
    private int anInt3550 = 4096;
    static int anInt3551;
    static int anInt3552;
    static MutableString aClass100_3553 = Class112.makeMutableString(43, "cookieprefix");
    static MutableString aClass100_3554 = Class112.makeMutableString(43, "Verbindung abgebrochen)3");
    static int anInt3555;
    static int anInt3556;
    static int anInt3557;
    static int anInt3558;

    static final void method725(boolean bool, long l)
    {
        try
        {
            Thread.sleep(l);
            if (bool != false)
                method725(false, 103L);
        } catch (InterruptedException interruptedexception)
        {
            /* empty */
        }
        anInt3555++;
    }

    public Class68_Sub13_Sub7()
    {
        this(4096);
    }

    final int[] method698(byte i, int i_0_)
    {
        anInt3547++;
        if (i != -61)
            method700(null, 45, -36);
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_0_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
            Class39.method464(is, 0, Class68_Sub13_Sub19.anInt3748, anInt3550);
        return is;
    }

    static final Class68_Sub20_Sub16 method726(byte i, MutableString class100)
    {
        try
        {
            anInt3551++;
            for (Class68_Sub20_Sub16 class68_sub20_sub16 = ((Class68_Sub20_Sub16) Class35.aClass16_602.method293((byte) 76)); class68_sub20_sub16 != null; class68_sub20_sub16 = ((Class68_Sub20_Sub16) Class35.aClass16_602.method290((byte) -118)))
            {
                if (((Class68_Sub20_Sub16) class68_sub20_sub16).aClass100_4414.equalTo(class100))
                    return class68_sub20_sub16;
            }
            int i_1_ = 46 % ((i - 28) / 32);
            return null;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ee.J(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method727(int i)
    {
        aClass100_3553 = null;
        aClass100_3554 = null;
        if (i != 0)
            aClass100_3553 = null;
    }

    static final int method728(int i, int i_2_)
    {
        anInt3556++;
        if (i != -1872384500)
            aClass100_3553 = null;
        if (i_2_ >= 97 && i_2_ <= 122 || i_2_ >= 224 && i_2_ <= 254 && i_2_ != 247)
            return i_2_ - 32;
        if (i_2_ == 255)
            return 159;
        if (i_2_ == 156)
            return 140;
        return i_2_;
    }

    private Class68_Sub13_Sub7(int i)
    {
        super(0, true);
        anInt3550 = i;
    }

    static final Class method729(String string, int i) throws ClassNotFoundException
    {
        try
        {
            anInt3552++;
            if (string.equals("B"))
                return Byte.TYPE;
            if (string.equals("I"))
                return Integer.TYPE;
            if (string.equals("S"))
                return Short.TYPE;
            if (string.equals("J"))
                return Long.TYPE;
            if (string.equals("Z"))
                return Boolean.TYPE;
            if (string.equals("F"))
                return Float.TYPE;
            if (string.equals("D"))
                return Double.TYPE;
            if (i != -1)
                aClass100_3554 = null;
            if (string.equals("C"))
                return java.lang.Character.TYPE;
            return Class.forName(string);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ee.D(" + (string != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final void method730(byte i, int i_3_, MutableString class100)
    {
        do
        {
            try
            {
                anInt3549++;
                Class68_Sub20_Sub9 class68_sub20_sub9 = Class68_Sub13_Sub26_Sub1.method835(i_3_, 2, (byte) -120);
                class68_sub20_sub9.method1097(0);
                ((Class68_Sub20_Sub9) class68_sub20_sub9).aClass100_4302 = class100;
                if (i >= 69)
                    break;
                aClass100_3554 = null;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ee.B(" + i + ',' + i_3_ + ',' + (class100 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static final int method731(Class21 class21, int i, Class21 class21_4_)
    {
        try
        {
            anInt3548++;
            int i_5_ = 0;
            if (class21.method360(NodeCache.anInt1914, 0))
                i_5_++;
            if (class21.method360(GameException.anInt2243, 0))
                i_5_++;
            if (class21.method360(Class50.anInt986, 0))
                i_5_++;
            if (class21_4_.method360(NodeCache.anInt1914, 0))
                i_5_++;
            if (i < 43)
                method726((byte) -13, null);
            if (class21_4_.method360(GameException.anInt2243, 0))
                i_5_++;
            if (class21_4_.method360(Class50.anInt986, 0))
                i_5_++;
            return i_5_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ee.H(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + (class21_4_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method700(Stream class68_sub14, int i, int i_6_)
    {
        try
        {
            if (i_6_ != -1)
                aClass100_3553 = null;
            int i_7_ = i;
            if (i_7_ == 0)
                anInt3550 = (class68_sub14.readUByte() << 12) / 255;
            anInt3558++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ee.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_6_ + ')'));
        }
    }

    static final void updateLocalNPCPositions()
    {
        while (Class68_Sub13_Sub8.connectionVector.distanceToBitPosition(Class106.packetSize) >= 27)
        {
            int local_idx = Class68_Sub13_Sub8.connectionVector.readBits(15);
            if (local_idx == 32767)
                break;
            boolean bool = false;
            if (Class102.localNPCs[local_idx] == null)
            {
                bool = true;
                Class102.localNPCs[local_idx] = new NPC();
            }
            NPC npc = Class102.localNPCs[local_idx];
            Class68_Sub10.localNPCIndices[Class13_Sub2.localNPCCount++] = local_idx;
            npc.lastUpdate = Class68_Sub3.loopCycle;
            npc.definition = Class68_Sub13_Sub11.getNPCDefinition(Class68_Sub13_Sub8.connectionVector.readBits(14));
            int has_ublock = Class68_Sub13_Sub8.connectionVector.readBits(1);
            if (has_ublock == 1)
                CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = local_idx;
            int y_offset = Class68_Sub13_Sub8.connectionVector.readBits(5);
            if (y_offset > 15)
                y_offset -= 32;
            int x_offset = Class68_Sub13_Sub8.connectionVector.readBits(5);
            int i_12_ = (Class68_Sub13_Sub9.anIntArray3580[Class68_Sub13_Sub8.connectionVector.readBits(3)]);
            if (bool)
                ((Character) npc).turnDirection = ((Character) npc).anInt2550 = i_12_;
            if (x_offset > 15)
                x_offset -= 32;
            int teleported = Class68_Sub13_Sub8.connectionVector.readBits(1);
            ((Character) npc).anInt2534 = ((NPCDefinition) (((NPC) npc).definition)).anInt1412;
            ((Character) npc).raw_range = ((NPCDefinition) (((NPC) npc).definition)).anInt1453;
            ((Character) npc).anInt2532 = ((NPCDefinition) (((NPC) npc).definition)).anInt1411;
            ((Character) npc).anInt2583 = ((NPCDefinition) (((NPC) npc).definition)).anInt1458;
            ((Character) npc).anInt2567 = ((NPCDefinition) (((NPC) npc).definition)).anInt1469;
            ((Character) npc).anInt2566 = ((NPCDefinition) (((NPC) npc).definition)).anInt1423;
            ((Character) npc).anInt2545 = ((NPCDefinition) (((NPC) npc).definition)).anInt1442;
            if (((Character) npc).anInt2583 == 0)
                ((Character) npc).anInt2550 = 0;
            ((Character) npc).anInt2576 = ((NPCDefinition) (((NPC) npc).definition)).anInt1449;
            ((Character) npc).anInt2565 = ((NPCDefinition) (((NPC) npc).definition)).anInt1417;
            npc.setPosition(y_offset + Class68_Sub7.localPlayer.walkQueueY[0], Class68_Sub7.localPlayer.walkQueueX[0] + x_offset, teleported == 1);
            if (npc.definition.method1450())
                Class52.method543(19395, npc.walkQueueY[0], npc, null, 0, npc.walkQueueX[0], GameSocket.plane, null);
        }
        Class68_Sub13_Sub8.connectionVector.byteAccess();
    }
}
