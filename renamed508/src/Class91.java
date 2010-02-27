/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class91
{
    static int anInt1632;
    short[] aShortArray1633;
    static int anInt1634;
    static int anInt1635;
    short[] aShortArray1636;
    MutableString[] aClass100Array1637;
    static MRUNodes aClass98_1638;
    int anInt1639;
    byte[] aByteArray1640;
    static int anInt1641;
    int[] anIntArray1642;
    static MutableString aClass100_1643 = Class112.makeMutableString(43, "scrollbar");
    static MutableString aClass100_1644;
    static int anInt1645;

    static final int method1526(int i, boolean bool)
    {
        if (bool != false)
            aClass100_1644 = null;
        anInt1645++;
        int i_0_ = 0x3f & i;
        int i_1_ = (i & 0xe6) >> 6;
        if (i_0_ != 18)
        {
            if (i_0_ == 19 || i_0_ == 21)
            {
                if (i_1_ == 0)
                    return 16;
                if (i_1_ == 1)
                    return 32;
                if (i_1_ == 2)
                    return 64;
                if (i_1_ == 3)
                    return 128;
            }
        } else
        {
            if (i_1_ == 0)
                return 1;
            if (i_1_ == 1)
                return 2;
            if (i_1_ == 2)
                return 4;
            if (i_1_ == 3)
                return 8;
        }
        return 0;
    }

    final boolean method1527(byte i, int i_2_)
    {
        anInt1632++;
        int i_3_ = 38 % ((i + 11) / 51);
        if ((0x4 & ((Class91) this).aByteArray1640[i_2_]) == 0)
            return false;
        return true;
    }

    public static void method1528(byte i)
    {
        if (i > -52)
            aClass100_1644 = null;
        aClass100_1643 = null;
        aClass98_1638 = null;
        aClass100_1644 = null;
    }

    static final void method1529(int i, int i_4_, int i_5_, Widget class45)
    {
        try
        {
            anInt1634++;
            if (Class35.aClass45_606 == null && !Class120.menuOpen && (class45 != null && Class95.method1554(class45, (byte) 3) != null))
            {
                if (i_5_ != -4798)
                    method1530(-50, null);
                Class35.aClass45_606 = class45;
                Class68_Sub13_Sub26_Sub1.aClass45_4609 = Class95.method1554(class45, (byte) 3);
                Class68_Sub26.anInt3202 = 0;
                Class58.anInt1087 = i_4_;
                Class68_Sub13_Sub25.anInt3855 = i;
                Class15.aBoolean247 = false;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("pb.B(" + i + ',' + i_4_ + ',' + i_5_ + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1530(int i, Widget class45)
    {
        try
        {
            if (i != 30341)
                method1526(-53, true);
            int i_6_ = ((Widget) class45).anInt808;
            anInt1635++;
            if (i_6_ == 324)
            {
                if (NPCDefinition.anInt1436 == -1)
                {
                    NPCDefinition.anInt1436 = ((Widget) class45).backgroundColor;
                    Class68_Sub13_Sub31.anInt3977 = ((Widget) class45).anInt833;
                }
                if (((PlayerDefinition) Class68_Sub13_Sub33.aClass126_3993).aBoolean2198)
                    ((Widget) class45).backgroundColor = NPCDefinition.anInt1436;
                else
                    ((Widget) class45).backgroundColor = Class68_Sub13_Sub31.anInt3977;
            } else if (i_6_ == 325)
            {
                if (NPCDefinition.anInt1436 == -1)
                {
                    NPCDefinition.anInt1436 = ((Widget) class45).backgroundColor;
                    Class68_Sub13_Sub31.anInt3977 = ((Widget) class45).anInt833;
                }
                if (((PlayerDefinition) Class68_Sub13_Sub33.aClass126_3993).aBoolean2198)
                    ((Widget) class45).backgroundColor = Class68_Sub13_Sub31.anInt3977;
                else
                    ((Widget) class45).backgroundColor = NPCDefinition.anInt1436;
            } else if (i_6_ == 327)
            {
                ((Widget) class45).anInt864 = 150;
                ((Widget) class45).anInt814 = (int) (256.0 * Math.sin((double) Class68_Sub3.loopCycle / 40.0)) & 0x7ff;
                ((Widget) class45).notWidgetSelectedModelID = -1;
                ((Widget) class45).notWidgetSelectedModelType = 5;
            } else if (i_6_ == 328)
            {
                if ((((Player) Class68_Sub7.localPlayer).name) == null)
                    ((Widget) class45).notWidgetSelectedModelID = 0;
                else
                {
                    ((Widget) class45).anInt864 = 150;
                    ((Widget) class45).anInt814 = (int) (256.0 * Math.sin((double) Class68_Sub3.loopCycle / 40.0)) & 0x7ff;
                    ((Widget) class45).notWidgetSelectedModelType = 5;
                    ((Widget) class45).notWidgetSelectedModelID = ((int) ((Player) Class68_Sub7.localPlayer).name.method1615(10908) << 11) + 2047;
                    ((Widget) class45).anInt831 = (((Character) Class68_Sub7.localPlayer).anInt2526);
                    ((Widget) class45).anInt756 = (((Character) Class68_Sub7.localPlayer).anInt2557);
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("pb.D(" + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    final int method1531(int i, int i_7_)
    {
        int i_8_ = 20 / ((29 - i) / 48);
        anInt1641++;
        return 0x3 & ((Class91) this).aByteArray1640[i_7_];
    }

    Class91(int i)
    {
        ((Class91) this).anInt1639 = i;
        ((Class91) this).aShortArray1636 = new short[((Class91) this).anInt1639];
        ((Class91) this).aShortArray1633 = new short[((Class91) this).anInt1639];
        ((Class91) this).anIntArray1642 = new int[((Class91) this).anInt1639];
        ((Class91) this).aByteArray1640 = new byte[((Class91) this).anInt1639];
        ((Class91) this).aClass100Array1637 = new MutableString[((Class91) this).anInt1639];
    }

    static
    {
        aClass98_1638 = new MRUNodes(64);
        aClass100_1644 = Class112.makeMutableString(43, "Texturen geladen)3");
    }
}
