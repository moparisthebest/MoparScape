/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSubList
{
    static int anInt2214;
    static int anInt2215;
    static int anInt2216;
    static int anInt2217;
    static int anInt2218;
    static int anInt2219;
    static int anInt2220;
    static int anInt2221;
    static int anInt2222;
    static MutableString aClass100_2223 = Class112.makeMutableString(43, "<col=40ff00>");
    static int anInt2224;
    static int anInt2225;
    private NodeSub aClass68_Sub20_2226 = new NodeSub();
    static MutableString aClass100_2227 = Class112.makeMutableString(43, "Zugewiesener Speicher)3");
    static int anInt2228;
    static int anInt2229;
    static boolean[] aBooleanArray2230 = new boolean[112];
    private NodeSub aClass68_Sub20_2231;

    static final void method1788(int i)
    {
        if ((Class68_Sub13_Sub24.anInt3846 ^ 0xffffffff) > i)
        {
            Class68_Sub13_Sub24.anInt3846 = 0;
            Class3.anInt85 = -1;
            Class68_Sub22.anInt3147 = -1;
        }
        anInt2220++;
        if (Class68_Sub13_Sub24.anInt3846 > Class68_Sub6.anInt2848)
        {
            Class68_Sub22.anInt3147 = -1;
            Class3.anInt85 = -1;
            Class68_Sub13_Sub24.anInt3846 = Class68_Sub6.anInt2848;
        }
        if (Class85.anInt1553 < 0)
        {
            Class3.anInt85 = -1;
            Class85.anInt1553 = 0;
            Class68_Sub22.anInt3147 = -1;
        }
        if (Class85.anInt1553 > Class103.anInt1770)
        {
            Class85.anInt1553 = Class103.anInt1770;
            Class68_Sub22.anInt3147 = -1;
            Class3.anInt85 = -1;
        }
    }

    final void method1789(byte i)
    {
        for (;;)
        {
            NodeSub class68_sub20 = ((NodeSub) aClass68_Sub20_2226).prevSub;
            if (aClass68_Sub20_2226 == class68_sub20)
                break;
            class68_sub20.unlinkSub();
        }
        anInt2225++;
        if (i <= -30)
            aClass68_Sub20_2231 = null;
    }

    final NodeSub method1790(int i)
    {
        NodeSub class68_sub20 = ((NodeSub) aClass68_Sub20_2226).prevSub;
        anInt2224++;
        if (class68_sub20 == aClass68_Sub20_2226)
        {
            aClass68_Sub20_2231 = null;
            return null;
        }
        aClass68_Sub20_2231 = ((NodeSub) class68_sub20).prevSub;
        if (i != 1742)
            method1789((byte) -63);
        return class68_sub20;
    }

    public static void method1791(int i)
    {
        aClass100_2223 = null;
        aClass100_2227 = null;
        if (i <= -23)
            aBooleanArray2230 = null;
    }

    final void method1792(NodeSub class68_sub20, byte i)
    {
        try
        {
            if (((NodeSub) class68_sub20).nextSub != null)
                class68_sub20.unlinkSub();
            anInt2218++;
            ((NodeSub) class68_sub20).prevSub = ((NodeSub) aClass68_Sub20_2226).prevSub;
            if (i != 121)
                method1796(107);
            ((NodeSub) class68_sub20).nextSub = aClass68_Sub20_2226;
            ((NodeSub) (((NodeSub) class68_sub20).nextSub)).prevSub = class68_sub20;
            ((NodeSub) (((NodeSub) class68_sub20).prevSub)).nextSub = class68_sub20;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "wh.H(" + (class68_sub20 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final void method1793(NodeSub class68_sub20)
    {
                if (((NodeSub) class68_sub20).nextSub != null)
                    class68_sub20.unlinkSub();
                ((NodeSub) class68_sub20).nextSub = (((NodeSub) aClass68_Sub20_2226).nextSub);
                ((NodeSub) class68_sub20).prevSub = aClass68_Sub20_2226;
                ((NodeSub) (((NodeSub) class68_sub20).nextSub)).prevSub = class68_sub20;
                ((NodeSub) (((NodeSub) class68_sub20).prevSub)).nextSub = class68_sub20;
    }

    static final void method1794(int i, Character class1_sub6)
    {
        try
        {
            anInt2221++;
            if (((Character) class1_sub6).anInt2583 != 0)
            {
                if (((Character) class1_sub6).interactingEntity != -1 && ((Character) class1_sub6).interactingEntity < 32768)
                {
                    NPC class1_sub6_sub1 = (Class102.localNPCs[((Character) class1_sub6).interactingEntity]);
                    if (class1_sub6_sub1 != null)
                    {
                        int i_0_ = (((Character) class1_sub6).x - ((Character) class1_sub6_sub1).x);
                        int i_1_ = (((Character) class1_sub6).y - ((Character) class1_sub6_sub1).y);
                        if (i_0_ != 0 || i_1_ != 0)
                            ((Character) class1_sub6).turnDirection = 0x7ff & (int) (Math.atan2((double) i_0_, (double) i_1_) * 325.949);
                    }
                }
                if (((Character) class1_sub6).interactingEntity >= 32768)
                {
                    int i_2_ = ((Character) class1_sub6).interactingEntity - 32768;
                    if (i_2_ == Class68_Sub10.localPlayerInteractingEntity)
                        i_2_ = 2047;
                    Player class1_sub6_sub2 = Class68_Sub13_Sub4.localPlayers[i_2_];
                    if (class1_sub6_sub2 != null)
                    {
                        int i_3_ = (((Character) class1_sub6).y - ((Character) class1_sub6_sub2).y);
                        int i_4_ = (((Character) class1_sub6).x - ((Character) class1_sub6_sub2).x);
                        if (i_4_ != 0 || i_3_ != 0)
                            ((Character) class1_sub6).turnDirection = (int) (Math.atan2((double) i_4_, (double) i_3_) * 325.949) & 0x7ff;
                    }
                }
                if ((((Character) class1_sub6).anInt2528 != 0 || ((Character) class1_sub6).anInt2574 != 0) && (((Character) class1_sub6).walkQueueLength == 0 || ((Character) class1_sub6).anInt2522 > 0))
                {
                    int i_5_ = (-((((Character) class1_sub6).anInt2528 - Class36.baseX - Class36.baseX) * 64) - 64 - (-(64 * ((Character) class1_sub6).raw_range) - ((Character) class1_sub6).x));
                    int i_6_ = ((((Character) class1_sub6).raw_range - 1) * 64 + ((Character) class1_sub6).y - 64 * (-Class68_Sub13_Sub35.baseY - Class68_Sub13_Sub35.baseY + ((Character) class1_sub6).anInt2574));
                    if (i_5_ != 0 || i_6_ != 0)
                        ((Character) class1_sub6).turnDirection = (int) (Math.atan2((double) i_5_, (double) i_6_) * 325.949) & 0x7ff;
                    ((Character) class1_sub6).anInt2528 = 0;
                    ((Character) class1_sub6).anInt2574 = 0;
                }
                int i_7_ = 0x7ff & (((Character) class1_sub6).turnDirection - ((Character) class1_sub6).anInt2550);
                if (i != 20106)
                    aBooleanArray2230 = null;
                if (i_7_ == 0)
                    ((Character) class1_sub6).anInt2564 = 0;
                else
                {
                    ((Character) class1_sub6).anInt2564++;
                    if (i_7_ > 1024)
                    {
                        ((Character) class1_sub6).anInt2550 -= ((Character) class1_sub6).anInt2583;
                        boolean bool = true;
                        if (((Character) class1_sub6).anInt2583 > i_7_ || (2048 - ((Character) class1_sub6).anInt2583 < i_7_))
                        {
                            ((Character) class1_sub6).anInt2550 = ((Character) class1_sub6).turnDirection;
                            bool = false;
                        }
                        if ((((Character) class1_sub6).anInt2526 == ((Character) class1_sub6).anInt2532) && (((Character) class1_sub6).anInt2564 > 25 || bool))
                        {
                            if (((Character) class1_sub6).anInt2567 != -1)
                                ((Character) class1_sub6).anInt2526 = ((Character) class1_sub6).anInt2567;
                            else
                                ((Character) class1_sub6).anInt2526 = ((Character) class1_sub6).anInt2545;
                        }
                    } else
                    {
                        boolean bool = true;
                        ((Character) class1_sub6).anInt2550 += ((Character) class1_sub6).anInt2583;
                        if (i_7_ < ((Character) class1_sub6).anInt2583 || (2048 - ((Character) class1_sub6).anInt2583 < i_7_))
                        {
                            ((Character) class1_sub6).anInt2550 = ((Character) class1_sub6).turnDirection;
                            bool = false;
                        }
                        if ((((Character) class1_sub6).anInt2526 == ((Character) class1_sub6).anInt2532) && (((Character) class1_sub6).anInt2564 > 25 || bool))
                        {
                            if (((Character) class1_sub6).anInt2566 == -1)
                                ((Character) class1_sub6).anInt2526 = ((Character) class1_sub6).anInt2545;
                            else
                                ((Character) class1_sub6).anInt2526 = ((Character) class1_sub6).anInt2566;
                        }
                    }
                    ((Character) class1_sub6).anInt2550 &= 0x7ff;
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "wh.J(" + i + ',' + (class1_sub6 != null ? "{...}" : "null") + ')');
        }
    }

    static final Class68_Sub20_Sub10 method1795(Class21 class21, int i, int i_8_)
    {
        try
        {
            anInt2214++;
            if (!Class56.method572(class21, -1, i_8_))
                return null;
            if (i != 23463)
                return null;
            return Class87.method1496((byte) -126);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wh.F(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ')'));
        }
    }

    final NodeSub method1796(int i)
    {
        NodeSub class68_sub20 = ((NodeSub) aClass68_Sub20_2226).prevSub;
        anInt2228++;
        if (aClass68_Sub20_2226 == class68_sub20)
            return null;
        class68_sub20.unlinkSub();
        if (i != 2265)
            return null;
        return class68_sub20;
    }

    final NodeSub method1797(int i)
    {
        anInt2219++;
        NodeSub class68_sub20 = aClass68_Sub20_2231;
        int i_9_ = 75 % ((i - 64) / 59);
        if (aClass68_Sub20_2226 == class68_sub20)
        {
            aClass68_Sub20_2231 = null;
            return null;
        }
        aClass68_Sub20_2231 = ((NodeSub) class68_sub20).prevSub;
        return class68_sub20;
    }

    static final void method1798(int i, int i_10_, byte i_11_, int i_12_, int i_13_)
    {
        anInt2215++;
        Class68_Sub22 class68_sub22 = ((Class68_Sub22) Class68_Sub13_Sub8.aClass113_3566.method1684((long) i_12_, 97));
        if (class68_sub22 == null)
        {
            class68_sub22 = new Class68_Sub22();
            Class68_Sub13_Sub8.aClass113_3566.method1683((byte) 121, class68_sub22, (long) i_12_);
        }
        if (i >= ((Class68_Sub22) class68_sub22).anIntArray3146.length)
        {
            int[] is = new int[i + 1];
            int[] is_14_ = new int[i + 1];
            for (int i_15_ = 0; ((Class68_Sub22) class68_sub22).anIntArray3146.length > i_15_; i_15_++)
            {
                is[i_15_] = ((Class68_Sub22) class68_sub22).anIntArray3146[i_15_];
                is_14_[i_15_] = ((Class68_Sub22) class68_sub22).anIntArray3143[i_15_];
            }
            for (int i_16_ = ((Class68_Sub22) class68_sub22).anIntArray3146.length; i_16_ < i; i_16_++)
            {
                is[i_16_] = -1;
                is_14_[i_16_] = 0;
            }
            ((Class68_Sub22) class68_sub22).anIntArray3143 = is_14_;
            ((Class68_Sub22) class68_sub22).anIntArray3146 = is;
        }
        if (i_11_ >= -11)
            method1798(0, 82, (byte) -2, -76, 28);
        ((Class68_Sub22) class68_sub22).anIntArray3146[i] = i_13_;
        ((Class68_Sub22) class68_sub22).anIntArray3143[i] = i_10_;
    }

    public NodeSubList()
    {
        ((NodeSub) aClass68_Sub20_2226).nextSub = aClass68_Sub20_2226;
        ((NodeSub) aClass68_Sub20_2226).prevSub = aClass68_Sub20_2226;
    }

    static
    {
        anInt2229 = 0;
    }
}
