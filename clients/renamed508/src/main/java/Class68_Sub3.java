/* Class68_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub3 extends Node
{
    static MutableString aClass100_2801;
    int anInt2802;
    static int anInt2803;
    static int anInt2804;
    int anInt2805;
    static MutableString aClass100_2806 = Class112.makeMutableString(43, " <col=ffff00>");
    static int anInt2807;
    static int anInt2808;
    static MutableString aClass100_2809;
    boolean aBoolean2810 = false;
    private static MutableString aClass100_2811 = Class112.makeMutableString(43, "wave2:");
    static int anInt2812;
    static int anInt2813;
    static int loopCycle;

    static final void method651(byte i)
    {
        if (PlayerDefinition.connection != null)
        {
            PlayerDefinition.connection.method594(-20);
            PlayerDefinition.connection = null;
        }
        anInt2813++;
        CipheredByteVector.method971(137);
        Class68_Sub13_Sub4.method716();
        for (int i_0_ = 0; i_0_ < 4; i_0_++)
            Class109.groundDataArray[i_0_].method444(false);
        if (i > -104)
            method653(true);
        Class68_Sub13_Sub34.method875((byte) 108);
        System.gc();
        Class68_Sub13.method692(2, (byte) 127);
        Class101.anInt1747 = -1;
        Keyboard.aBoolean2129 = false;
        Class68_Sub13_Sub1.method702(0, true);
        Class68_Sub13_Sub35.baseY = 0;
        Class36.baseX = 0;
        Class36.aBoolean640 = false;
        for (int i_1_ = 0; i_1_ < Class34.aClass23Array594.length; i_1_++)
            Class34.aClass23Array594[i_1_] = null;
        Class13_Sub2.localNPCCount = 0;
        client.localPlayerCount = 0;
        for (int i_2_ = 0; i_2_ < 2048; i_2_++)
        {
            Class68_Sub13_Sub4.localPlayers[i_2_] = null;
            Ground.aClass68_Sub14Array2757[i_2_] = null;
        }
        for (int i_3_ = 0; i_3_ < 32768; i_3_++)
            Class102.localNPCs[i_3_] = null;
        for (int i_4_ = 0; i_4_ < 4; i_4_++)
        {
            for (int i_5_ = 0; i_5_ < 104; i_5_++)
            {
                for (int i_6_ = 0; i_6_ < 104; i_6_++)
                    Widget.groundItems[i_4_][i_5_][i_6_] = null;
            }
        }
        Player.method161(64);
    }

    static final void method652(int i, int i_7_, byte i_8_, MutableString class100, short i_9_, MutableString class100_10_, long l)
    {
        do
        {
            try
            {
                anInt2808++;
                if (i_8_ > -51)
                    method654(-54);
                if (!Class120.menuOpen)
                {
                    if (Class68_Sub13_Sub21.menuOptionsCount >= 500)
                        break;
                    Class71_Sub1.menuActions[(Class68_Sub13_Sub21.menuOptionsCount)] = class100_10_;
                    Class33.menuOptions[Class68_Sub13_Sub21.menuOptionsCount] = class100;
                    Class68_Sub28_Sub1.menuActionIDs[(Class68_Sub13_Sub21.menuOptionsCount)] = i_9_;
                    Class68_Sub13_Sub14.menuActionCommands1[(Class68_Sub13_Sub21.menuOptionsCount)] = l;
                    Class37.menuActionCommands2[Class68_Sub13_Sub21.menuOptionsCount] = i;
                    Class68_Sub13_Sub37.menuActionCommands3[(Class68_Sub13_Sub21.menuOptionsCount)] = i_7_;
                    Class68_Sub13_Sub21.menuOptionsCount++;
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("be.D(" + i + ',' + i_7_ + ',' + i_8_ + ',' + (class100 != null ? "{...}" : "null") + ',' + i_9_ + ',' + (class100_10_ != null ? "{...}" : "null") + ',' + l + ')'));
            }
            break;
        } while (false);
    }

    public static void method653(boolean bool)
    {
        aClass100_2809 = null;
        if (bool == true)
        {
            aClass100_2801 = null;
            aClass100_2811 = null;
            aClass100_2806 = null;
        }
    }

    static final void method654(int i)
    {
        anInt2804++;
        if (i == 0)
            Class96.aClass98_1696.method1572((byte) 94);
    }

    static final boolean method655(int i, int i_11_)
    {
        anInt2803++;
        if (i_11_ != 1)
            return false;
        if ((0x1 & i) == 0)
            return false;
        return true;
    }

    public Class68_Sub3()
    {
        /* empty */
    }

    static
    {
        aClass100_2801 = aClass100_2811;
        loopCycle = 0;
        anInt2807 = 0;
        aClass100_2809 = aClass100_2811;
    }
}
