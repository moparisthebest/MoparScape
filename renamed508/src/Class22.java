/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class22
{
    static int anInt481;
    static int anInt482 = 0;
    static int anInt483 = 0;
    static Ground[][][] groundArray;
    static int anInt485;
    static int anInt486;
    static int anInt487;
    static MutableString aClass100_488;

    static final void parseLocalNPCUpdateHeader()
    {
        Class68_Sub13_Sub8.connectionVector.bitAccess();
        int to_update = Class68_Sub13_Sub8.connectionVector.readBits(8);
        if (to_update < Class13_Sub2.localNPCCount)
        {
            for (int i_1_ = to_update; Class13_Sub2.localNPCCount > i_1_; i_1_++)
                Class68_Sub13_Sub14.removeEntityIndices[Class75_Sub3_Sub1.removeEntityCount++] = Class68_Sub10.localNPCIndices[i_1_];
        }
        if (to_update > Class13_Sub2.localNPCCount)
            throw new RuntimeException("gnpov1");
        Class13_Sub2.localNPCCount = 0;
        int iidx = 0;
        for (/**/; iidx < to_update; iidx++)
        {
            int local_idx = Class68_Sub10.localNPCIndices[iidx];
            NPC npc = Class102.localNPCs[local_idx];
            int has_update = Class68_Sub13_Sub8.connectionVector.readBits(1);
            if (has_update == 0)
            {
                Class68_Sub10.localNPCIndices[Class13_Sub2.localNPCCount++] = local_idx;
                npc.lastUpdate = Class68_Sub3.loopCycle;
            } else
            {
                int update_type = Class68_Sub13_Sub8.connectionVector.readBits(2);
                if (update_type == 0)
                {
                    Class68_Sub10.localNPCIndices[Class13_Sub2.localNPCCount++] = local_idx;
                    npc.lastUpdate = Class68_Sub3.loopCycle;
                    CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = local_idx;
                } else if (update_type == 1)
                {
                    Class68_Sub10.localNPCIndices[Class13_Sub2.localNPCCount++] = local_idx;
                    npc.lastUpdate = Class68_Sub3.loopCycle;
                    int dir = Class68_Sub13_Sub8.connectionVector.readBits(3);
                    npc.moveInDirection(false, dir);
                    int has_ublock = Class68_Sub13_Sub8.connectionVector.readBits(1);
                    if (has_ublock == 1)
                        CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = local_idx;
                } else if (update_type == 2)
                {
                    Class68_Sub10.localNPCIndices[Class13_Sub2.localNPCCount++] = local_idx;
                    npc.lastUpdate = Class68_Sub3.loopCycle;
                    int dir = Class68_Sub13_Sub8.connectionVector.readBits(3);
                    npc.moveInDirection(true, dir);
                    dir = Class68_Sub13_Sub8.connectionVector.readBits(3);
                    npc.moveInDirection(true, dir);
                    int has_ublock = Class68_Sub13_Sub8.connectionVector.readBits(1);
                    if (has_ublock == 1)
                        CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = local_idx;
                } else if (update_type == 3)
                    Class68_Sub13_Sub14.removeEntityIndices[Class75_Sub3_Sub1.removeEntityCount++] = local_idx;
            }
        }
    }

    static final void method374(byte i, Class21 class21)
    {
        try
        {
            if (i != 58)
                method374((byte) 95, null);
            anInt486++;
            Class66.aClass21_1203 = class21;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ck.C(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method375(int i)
    {
        groundArray = null;
        aClass100_488 = null;
        if (i < 30)
            groundArray = null;
    }

    static
    {
        anInt481 = -1;
        anInt485 = 0;
        aClass100_488 = Class112.makeMutableString(43, "compass");
    }
}
