/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class29
{
    static int anInt534;
    static MutableString aClass100_535;
    static int anInt536;
    static int anInt537;
    private static MutableString aClass100_538;
    static Widget aClass45_539 = null;

    static final void method401(int i, int i_0_, MutableString class100)
    {
        do
        {
            try
            {
                anInt536++;
                MutableString class100_1_ = class100.method1608(99).method1603(12688);
                boolean bool = false;
                for (int i_2_ = i; i_2_ < client.localPlayerCount; i_2_++)
                {
                    Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[Class85.localPlayerIndices[i_2_]]);
                    if (class1_sub6_sub2 != null && (((Player) class1_sub6_sub2).name) != null && ((Player) class1_sub6_sub2).name.method1606(false, class100_1_))
                    {
                        bool = true;
                        Class68_Sub13_Sub3.method713(0, 0, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), (((Character) Class68_Sub7.localPlayer).walkQueueY[0]), 1, 1, (((Character) class1_sub6_sub2).walkQueueY[0]), false, 0, -3, 2, (((Character) class1_sub6_sub2).walkQueueX[0]));
                        if (i_0_ == 1)
                        {
                            Class68_Sub13_Sub28.anInt3929++;
                            Class21.connectionVector.startPacket(160);
                            Class21.connectionVector.writeLEShort(Class85.localPlayerIndices[i_2_]);
                        } else if (i_0_ == 4)
                        {
                            Class112.anInt1879++;
                            Class21.connectionVector.startPacket(253);
                            Class21.connectionVector.writeLEShortA(Class85.localPlayerIndices[i_2_]);
                        } else if (i_0_ == 6)
                        {
                            Item.anInt2442++;
                            Class21.connectionVector.startPacket(35);
                            Class21.connectionVector.writeLEShortA(Class85.localPlayerIndices[i_2_]);
                        } else if (i_0_ == 7)
                        {
                            Class21.connectionVector.startPacket(93);
                            Class21.connectionVector.writeLEShortA(Class85.localPlayerIndices[i_2_]);
                            Class68_Sub20_Sub15.anInt4400++;
                        }
                        break;
                    }
                }
                if (bool)
                    break;
                Class48.method520(Class68_Sub28_Sub2.aClass100_4558, -85, (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class84.aClass100_1538, class100_1_ })), 0);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("eb.B(" + i + ',' + i_0_ + ',' + (class100 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public static void method402(int i)
    {
        aClass100_535 = null;
        if (i >= 39)
        {
            aClass100_538 = null;
            aClass45_539 = null;
        }
    }

    static
    {
        anInt537 = 0;
        aClass100_538 = Class112.makeMutableString(43, "Attack");
        aClass100_535 = aClass100_538;
    }
}
