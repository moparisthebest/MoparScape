/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class102
{
    static NPC[] localNPCs;
    static int anInt1749;
    static boolean aBoolean1750;
    static MutableString aClass100_1751 = Class112.makeMutableString(43, "www)2wtrc");
    static int anInt1752;
    static MutableString aClass100_1753;
    static int anInt1754;
    static Class21 aClass21_1755;
    private static MutableString aClass100_1756;
    static int anInt1757;
    static Class91 aClass91_1758;
    static int[] anIntArray1759;
    static int anInt1760;

    public static void method1632(int i)
    {
        aClass100_1751 = null;
        aClass100_1756 = null;
        aClass91_1758 = null;
        aClass100_1753 = null;
        localNPCs = null;
        if (i != 32768)
            aClass100_1756 = null;
        aClass21_1755 = null;
        anIntArray1759 = null;
    }

    static final Object5 method1633(int i, int i_0_, int i_1_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_0_][i_1_];
        if (class68_sub1 == null)
            return null;
        for (int i_2_ = 0; i_2_ < ((Ground) class68_sub1).anInt2773; i_2_++)
        {
            Object5 class69 = ((Ground) class68_sub1).object_5[i_2_];
            if ((((Object5) class69).uid >> 29 & 0x3L) == 2L && ((Object5) class69).anInt1254 == i_0_ && ((Object5) class69).anInt1253 == i_1_)
                return class69;
        }
        return null;
    }

    static final void method1634(int i, boolean bool, int i_3_, int i_4_, int i_5_, int i_6_)
    {
        if (bool == true)
        {
            for (int i_7_ = i; i_3_ >= i_7_; i_7_++)
                Class34.method416(i_5_, (byte) -17, i_6_, Class68_Sub22.anIntArrayArray3134[i_7_], i_4_);
            anInt1754++;
        }
    }

    static final void method1635(int i, int i_8_, int i_9_)
    {
        anInt1760++;
        Class48 class48 = Class68_Sub13_Sub11.method752((byte) 81, i);
        if (i_8_ != 0)
            aClass100_1756 = null;
        int i_10_ = ((Class48) class48).anInt958;
        int i_11_ = ((Class48) class48).anInt945;
        int i_12_ = ((Class48) class48).anInt956;
        int i_13_ = NodeList.anIntArray259[i_12_ - i_10_];
        if (i_9_ < 0 || i_9_ > i_13_)
            i_9_ = 0;
        i_13_ <<= i_10_;
        Class68_Sub13_Sub15.method767(i_11_, (((i_13_ ^ 0xffffffff) & Class103.settingArray[i_11_]) | i_9_ << i_10_ & i_13_), 87);
    }

    static final void method1636(int i, int i_14_, int i_15_, boolean bool, int i_16_)
    {
        anInt1757++;
        if (i >= Class35.anInt605 && i <= Class51.anInt2257)
        {
            i_15_ = Class68_Sub20_Sub15.method1171(i_15_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
            i_16_ = Class68_Sub20_Sub15.method1171(i_16_, NodeCache.anInt1920, (byte) 114, GroundData.anInt677);
            Class15.method276(1, i_16_, i_15_, i_14_, i);
        }
        if (bool != true)
            method1636(-105, 101, 125, false, -95);
    }

    static final void method1637(byte i, int i_17_, int i_18_, int i_19_)
    {
        anInt1749++;
        if (i > -48)
            method1632(118);
        Widget class45 = Class66.method637(i_19_, false, i_18_);
        if (class45 != null && ((Widget) class45).anObjectArray913 != null)
        {
            ScriptParameters class68_sub29 = new ScriptParameters();
            ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
            ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray913;
            Class68_Sub13_Sub16.method776(class68_sub29, 16);
        }
        Class21_Sub1.aBoolean2707 = true;
        Class33.anInt589 = i_17_;
        Class107.anInt1823 = i_19_;
        Class68_Sub20_Sub16.anInt4424 = i_18_;
        NodeCache.method1688(class45, -122);
    }

    static
    {
        localNPCs = new NPC[32768];
        aBoolean1750 = true;
        aClass100_1756 = Class112.makeMutableString(43, "OFF");
        aClass100_1753 = aClass100_1756;
        anIntArray1759 = new int[50];
    }
}
