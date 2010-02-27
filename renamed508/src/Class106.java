/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class106
{
    static GameSocket aClass61_1800;
    static int anInt1801 = 1;
    static MutableString aClass100_1802;
    static int anInt1803;
    static double aDouble1804 = -1.0;
    static NodeCache aClass113_1805;
    static int packetSize;
    static int anInt1807;
    static int anInt1808;
    static int anInt1809;
    static MutableString aClass100_1810;
    static int[] anIntArray1811;
    static MutableString aClass100_1812;

    static final int[] method1651(int[] is, int i)
    {
        try
        {
            anInt1809++;
            if (i > -28)
                return null;
            if (is == null)
                return null;
            int[] is_0_ = new int[is.length];
            Class39.method466(is, 0, is_0_, 0, is.length);
            return is_0_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "sf.A(" + (is != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final int method1652(int i, boolean bool)
    {
        if (bool != false)
            method1653(30);
        anInt1807++;
        return 0xff & i;
    }

    public static void method1653(int i)
    {
        aClass61_1800 = null;
        aClass100_1810 = null;
        anIntArray1811 = null;
        if (i != 0)
            aClass61_1800 = null;
        aClass100_1802 = null;
        aClass113_1805 = null;
        aClass100_1812 = null;
    }

    static final void method1654(byte i)
    {
        int i_1_ = -62 / (-i / 39);
        anInt1808++;
        for (Class68_Sub20_Sub4 class68_sub20_sub4 = ((Class68_Sub20_Sub4) Widget.aClass16_886.method293((byte) 76)); class68_sub20_sub4 != null; class68_sub20_sub4 = ((Class68_Sub20_Sub4) Widget.aClass16_886.method290((byte) 10)))
        {
            Class1_Sub1 class1_sub1 = ((Class68_Sub20_Sub4) class68_sub20_sub4).aClass1_Sub1_4216;
            if (((Class1_Sub1) class1_sub1).anInt2424 != GameSocket.plane || (((Class1_Sub1) class1_sub1).anInt2410 < Class68_Sub3.loopCycle))
                class68_sub20_sub4.unlink();
            else if (Class68_Sub3.loopCycle >= ((Class1_Sub1) class1_sub1).anInt2395)
            {
                if (((Class1_Sub1) class1_sub1).anInt2419 > 0)
                {
                    NPC class1_sub6_sub1 = (Class102.localNPCs[((Class1_Sub1) class1_sub1).anInt2419 - 1]);
                    if (class1_sub6_sub1 != null && ((Character) class1_sub6_sub1).x >= 0 && ((Character) class1_sub6_sub1).x < 13312 && ((Character) class1_sub6_sub1).y >= 0 && ((Character) class1_sub6_sub1).y < 13312)
                        class1_sub1.method64(((Character) class1_sub6_sub1).x, (byte) -8, ((Character) class1_sub6_sub1).y, (Player.fixZ(((Character) class1_sub6_sub1).x, ((Class1_Sub1) class1_sub1).anInt2424, ((Character) class1_sub6_sub1).y)) - ((Class1_Sub1) class1_sub1).anInt2422, Class68_Sub3.loopCycle);
                }
                if (((Class1_Sub1) class1_sub1).anInt2419 < 0)
                {
                    int i_2_ = -1 - ((Class1_Sub1) class1_sub1).anInt2419;
                    Player class1_sub6_sub2;
                    if (Class68_Sub10.localPlayerInteractingEntity != i_2_)
                        class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[i_2_]);
                    else
                        class1_sub6_sub2 = Class68_Sub7.localPlayer;
                    if (class1_sub6_sub2 != null && ((Character) class1_sub6_sub2).x >= 0 && ((Character) class1_sub6_sub2).x < 13312 && ((Character) class1_sub6_sub2).y >= 0 && ((Character) class1_sub6_sub2).y < 13312)
                        class1_sub1.method64(((Character) class1_sub6_sub2).x, (byte) -103, ((Character) class1_sub6_sub2).y, (Player.fixZ(((Character) class1_sub6_sub2).x, ((Class1_Sub1) class1_sub1).anInt2424, ((Character) class1_sub6_sub2).y)) - ((Class1_Sub1) class1_sub1).anInt2422, Class68_Sub3.loopCycle);
                }
                class1_sub1.method66(Class109.anInt1846, false);
                Class68_Sub20_Sub4.method1061(GameSocket.plane, (int) ((Class1_Sub1) class1_sub1).aDouble2408, (int) ((Class1_Sub1) class1_sub1).aDouble2400, (int) ((Class1_Sub1) class1_sub1).aDouble2392, 60, class1_sub1, ((Class1_Sub1) class1_sub1).anInt2409, -1L, false);
            }
        }
    }

    static
    {
        anInt1803 = 127;
        aClass100_1802 = Class112.makeMutableString(43, ")1");
        anIntArray1811 = new int[2000];
        aClass100_1810 = (Class112.makeMutableString(43, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3"));
        packetSize = 0;
        aClass100_1812 = Class112.makeMutableString(43, "Schrifts-=tze geladen)3");
        aClass113_1805 = new NodeCache(512);
    }
}
