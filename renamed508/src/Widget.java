/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Widget
{
    int anInt756 = 0;
    static int anInt757;
    static int anInt758;
    Object[] anObjectArray759;
    static int anInt760;
    boolean interfaceWidget;
    int anInt762;
    int anInt763;
    boolean aBoolean764;
    boolean aBoolean765;
    boolean aBoolean766;
    int[] anIntArray767;
    int anInt768;
    Widget[] widgetCache;
    Object[] anObjectArray770;
    int anInt771;
    Object[] anObjectArray772;
    int width = 0;
    int[] inventoryStackSizes;
    int anInt775;
    int anInt776;
    int anInt777;
    Object[] anObjectArray778;
    byte aByte779;
    int[] anIntArray780;
    int anInt781;
    int actionType;
    int[] anIntArray783;
    Object[] anObjectArray784;
    boolean aBoolean785;
    Object[] anObjectArray786;
    int[] anIntArray787;
    Object[] anObjectArray788;
    int anInt789;
    Object[] anObjectArray790;
    int[] anIntArray791;
    int anInt792;
    int anInt793;
    int anInt794;
    int[] inventory;
    int[] anIntArray796;
    private int widgetSelectedModelType;
    int anInt798;
    int anInt799;
    static int anInt800;
    Object[] anObjectArray801;
    Object[] anObjectArray802;
    int notWidgetSelectedModelID;
    static int anInt804;
    static int anInt805;
    Object[] anObjectArray806;
    Object[] anObjectArray807;
    int anInt808;
    static int anInt809;
    int anInt810;
    byte aByte811;
    Object[] anObjectArray812;
    boolean aBoolean813;
    int anInt814;
    int x;
    int anInt816;
    MutableString[] actions;
    int anInt818;
    boolean aBoolean819;
    byte aByte820;
    Object[] anObjectArray821;
    int anInt822;
    MutableString[] aClass100Array823;
    static int anInt824;
    boolean aBoolean825;
    int[] anIntArray826;
    boolean aBoolean827;
    int anInt828;
    static int anInt829;
    int anInt830;
    int anInt831;
    int textColor;
    int anInt833;
    static int anInt834;
    Object[] anObjectArray835;
    int anInt836;
    Object[] anObjectArray837;
    Object[] anObjectArray838;
    int anInt839;
    int backgroundColor;
    int[] anIntArray841;
    int anInt842;
    Object[] anObjectArray843;
    int anInt844;
    int anInt845;
    int inventorySpritePaddingY;
    int anInt847;
    Object[] anObjectArray848;
    int anInt849;
    boolean aBoolean850;
    boolean aBoolean851;
    private int widgetSelectedModelID;
    int anInt853;
    int[] anIntArray854;
    int anInt855;
    Object[] anObjectArray856;
    int anInt857;
    static int anInt858;
    int anInt859;
    int anInt860;
    Object[] anObjectArray861;
    int anInt862;
    boolean aBoolean863;
    int anInt864;
    int notWidgetSelectedModelType;
    boolean aBoolean866;
    int anInt867;
    Object[] anObjectArray868;
    int anInt869;
    int anInt870;
    Object[] anObjectArray871;
    Object[] anObjectArray872;
    int anInt873;
    Object[] anObjectArray874;
    Object[] anObjectArray875;
    MutableString tooltip;
    int anInt877;
    Object[] anObjectArray878;
    int anInt879;
    MutableString aClass100_880;
    MutableString text;
    static int anInt882;
    int anInt883;
    MutableString selectedAction;
    int inventorySpritePaddingX;
    static NodeList aClass16_886 = new NodeList();
    int[] anIntArray887;
    int anInt888;
    int anInt889;
    MutableString aClass100_890;
    int[] anIntArray891;
    int anInt892;
    Widget aClass45_893;
    boolean aBoolean894;
    static int anInt895;
    int type;
    Object[] anObjectArray897;
    MutableString spellName;
    int height;
    int[] anIntArray900;
    int anInt901;
    int anInt902;
    int y;
    byte aByte904;
    boolean aBoolean905;
    int anInt906;
    byte[] aByteArray907;
    int[][] valueIndices;
    int anInt909;
    int anInt910;
    Object[] anObjectArray911;
    static int anInt912;
    Object[] anObjectArray913;
    int anInt914;
    int anInt915;
    boolean aBoolean916;
    static int anInt917 = 0;
    static MRUNodes aClass98_918 = new MRUNodes(100);
    static int anInt919 = 3;
    static MutableString aClass100_920;
    static float aFloat921;
    private static MutableString aClass100_922;
    static MutableString aClass100_923;
    static MutableString aClass100_924;
    static int anInt925 = 0;
    static NodeList[][][] groundItems = new NodeList[4][104][104];
    private static MutableString aClass100_927;

    final void swapInventoryItems(int slota, int slotb)
    {
        int tmp = inventory[slotb];
        inventory[slotb] = inventory[slota];
        inventory[slota] = tmp;
        tmp = inventoryStackSizes[slotb];
        inventoryStackSizes[slotb] = inventoryStackSizes[slota];
        inventoryStackSizes[slota] = tmp;
    }

    final void method496(int i, MutableString class100, int i_3_)
    {
        try
        {
            if (i_3_ != 0)
                ((Widget) this).anInt768 = 47;
            if (((Widget) this).aClass100Array823 == null || ((Widget) this).aClass100Array823.length <= i)
            {
                MutableString[] class100s = new MutableString[i + 1];
                if (((Widget) this).aClass100Array823 != null)
                {
                    for (int i_4_ = 0; i_4_ < ((Widget) this).aClass100Array823.length; i_4_++)
                        class100s[i_4_] = ((Widget) this).aClass100Array823[i_4_];
                }
                ((Widget) this).aClass100Array823 = class100s;
            }
            ((Widget) this).aClass100Array823[i] = class100;
            anInt809++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ha.M(" + i + ',' + (class100 != null ? "{...}" : "null") + ',' + i_3_ + ')'));
        }
    }

    final boolean method497(int i)
    {
        anInt895++;
        if (((Widget) this).anIntArray854 != null)
            return true;
        Class92_Sub1 class92_sub1 = Class68_Sub13_Sub18.method791(Class8.aClass21_164, (byte) 66, ((Widget) this).backgroundColor, 0);
        if (class92_sub1 == null)
            return false;
        if (i != 2663)
            ((Widget) this).width = 6;
        class92_sub1.method1545();
        ((Widget) this).anIntArray854 = new int[((Class92) class92_sub1).anInt1660];
        ((Widget) this).anIntArray783 = new int[((Class92) class92_sub1).anInt1660];
        for (int i_5_ = 0; i_5_ < ((Class92) class92_sub1).anInt1660; i_5_++)
        {
            int i_6_ = 0;
            int i_7_ = ((Class92) class92_sub1).anInt1661;
            for (int i_8_ = 0; ((Class92) class92_sub1).anInt1661 > i_8_; i_8_++)
            {
                if ((((Class92_Sub1) class92_sub1).aByteArray3334[((Class92) class92_sub1).anInt1661 * i_5_ + i_8_]) != 0)
                {
                    i_6_ = i_8_;
                    break;
                }
            }
            for (int i_9_ = i_6_; i_9_ < ((Class92) class92_sub1).anInt1661; i_9_++)
            {
                if ((((Class92_Sub1) class92_sub1).aByteArray3334[((Class92) class92_sub1).anInt1661 * i_5_ + i_9_]) == 0)
                {
                    i_7_ = i_9_;
                    break;
                }
            }
            ((Widget) this).anIntArray854[i_5_] = i_6_;
            ((Widget) this).anIntArray783[i_5_] = i_7_ - i_6_;
        }
        return true;
    }

    final void method498(int i, Stream class68_sub14)
    {
        do
        {
            try
            {
                anInt882++;
                ((Widget) this).aBoolean863 = false;
                ((Widget) this).type = class68_sub14.readUByte();
                ((Widget) this).actionType = class68_sub14.readUByte();
                ((Widget) this).anInt808 = class68_sub14.readUShort();
                ((Widget) this).anInt810 = class68_sub14.readShort();
                ((Widget) this).anInt914 = class68_sub14.readShort();
                ((Widget) this).width = class68_sub14.readUShort();
                ((Widget) this).height = class68_sub14.readUShort();
                ((Widget) this).aByte779 = (byte) 0;
                ((Widget) this).aByte904 = (byte) 0;
                ((Widget) this).aByte811 = (byte) 0;
                ((Widget) this).aByte820 = (byte) 0;
                ((Widget) this).anInt775 = class68_sub14.readUByte();
                ((Widget) this).anInt799 = class68_sub14.readUShort();
                if (((Widget) this).anInt799 == 65535)
                    ((Widget) this).anInt799 = -1;
                else
                    ((Widget) this).anInt799 = (((Widget) this).anInt799 + (~0xffff & ((Widget) this).anInt792));
                ((Widget) this).anInt844 = class68_sub14.readUShort();
                if (((Widget) this).anInt844 == 65535)
                    ((Widget) this).anInt844 = -1;
                int i_10_ = class68_sub14.readUByte();
                if (i_10_ > 0)
                {
                    ((Widget) this).anIntArray796 = new int[i_10_];
                    ((Widget) this).anIntArray791 = new int[i_10_];
                    for (int i_11_ = 0; i_10_ > i_11_; i_11_++)
                    {
                        ((Widget) this).anIntArray796[i_11_] = class68_sub14.readUByte();
                        ((Widget) this).anIntArray791[i_11_] = class68_sub14.readUShort();
                    }
                }
                if (i != -18165)
                    aClass100_923 = null;
                int i_12_ = class68_sub14.readUByte();
                if (i_12_ > 0)
                {
                    ((Widget) this).valueIndices = new int[i_12_][];
                    for (int i_13_ = 0; i_12_ > i_13_; i_13_++)
                    {
                        int i_14_ = class68_sub14.readUShort();
                        ((Widget) this).valueIndices[i_13_] = new int[i_14_];
                        for (int i_15_ = 0; i_14_ > i_15_; i_15_++)
                        {
                            ((Widget) this).valueIndices[i_13_][i_15_] = class68_sub14.readUShort();
                            if ((((Widget) this).valueIndices[i_13_][i_15_]) == 65535)
                                ((Widget) this).valueIndices[i_13_][i_15_] = -1;
                        }
                    }
                }
                if (((Widget) this).type == 0)
                {
                    ((Widget) this).anInt794 = class68_sub14.readUShort();
                    ((Widget) this).aBoolean764 = class68_sub14.readUByte() == 1;
                }
                if (((Widget) this).type == 1)
                {
                    class68_sub14.readUShort();
                    class68_sub14.readUByte();
                }
                if (((Widget) this).type == 2)
                {
                    ((Widget) this).aByte811 = (byte) 3;
                    ((Widget) this).inventoryStackSizes = new int[(((Widget) this).width * ((Widget) this).height)];
                    ((Widget) this).inventory = new int[(((Widget) this).width * ((Widget) this).height)];
                    ((Widget) this).aByte779 = (byte) 3;
                    int i_16_ = class68_sub14.readUByte();
                    if (i_16_ == 1)
                        ((Widget) this).anInt763 |= 0x10000000;
                    int i_17_ = class68_sub14.readUByte();
                    if (i_17_ == 1)
                        ((Widget) this).anInt763 |= 0x40000000;
                    int i_18_ = class68_sub14.readUByte();
                    if (i_18_ == 1)
                        ((Widget) this).anInt763 |= ~0x7fffffff;
                    int i_19_ = class68_sub14.readUByte();
                    if (i_19_ == 1)
                        ((Widget) this).anInt763 |= 0x20000000;
                    ((Widget) this).inventorySpritePaddingX = class68_sub14.readUByte();
                    ((Widget) this).inventorySpritePaddingY = class68_sub14.readUByte();
                    ((Widget) this).anIntArray767 = new int[20];
                    ((Widget) this).anIntArray841 = new int[20];
                    ((Widget) this).anIntArray826 = new int[20];
                    for (int i_20_ = 0; i_20_ < 20; i_20_++)
                    {
                        int i_21_ = class68_sub14.readUByte();
                        if (i_21_ == 1)
                        {
                            ((Widget) this).anIntArray826[i_20_] = class68_sub14.readShort();
                            ((Widget) this).anIntArray767[i_20_] = class68_sub14.readShort();
                            ((Widget) this).anIntArray841[i_20_] = class68_sub14.readInteger();
                        } else
                            ((Widget) this).anIntArray841[i_20_] = -1;
                    }
                    ((Widget) this).actions = new MutableString[5];
                    for (int i_22_ = 0; i_22_ < 5; i_22_++)
                    {
                        MutableString class100 = class68_sub14.readString();
                        if (class100.getLength() > 0)
                        {
                            ((Widget) this).actions[i_22_] = class100;
                            ((Widget) this).anInt763 |= 1 << i_22_ + 23;
                        }
                    }
                }
                if (((Widget) this).type == 3)
                    ((Widget) this).aBoolean866 = class68_sub14.readUByte() == 1;
                if (((Widget) this).type == 4 || ((Widget) this).type == 1)
                {
                    ((Widget) this).anInt777 = class68_sub14.readUByte();
                    ((Widget) this).anInt830 = class68_sub14.readUByte();
                    ((Widget) this).anInt789 = class68_sub14.readUByte();
                    ((Widget) this).anInt901 = class68_sub14.readUShort();
                    if (((Widget) this).anInt901 == 65535)
                        ((Widget) this).anInt901 = -1;
                    ((Widget) this).interfaceWidget = class68_sub14.readUByte() == 1;
                }
                if (((Widget) this).type == 4)
                {
                    ((Widget) this).text = class68_sub14.readString();
                    ((Widget) this).aClass100_880 = class68_sub14.readString();
                }
                if (((Widget) this).type == 1 || ((Widget) this).type == 3 || ((Widget) this).type == 4)
                    ((Widget) this).textColor = class68_sub14.readInteger();
                if (((Widget) this).type == 3 || ((Widget) this).type == 4)
                {
                    ((Widget) this).anInt862 = class68_sub14.readInteger();
                    ((Widget) this).anInt828 = class68_sub14.readInteger();
                    ((Widget) this).anInt776 = class68_sub14.readInteger();
                }
                if (((Widget) this).type == 5)
                {
                    ((Widget) this).backgroundColor = class68_sub14.readInteger();
                    ((Widget) this).anInt833 = class68_sub14.readInteger();
                }
                if (((Widget) this).type == 6)
                {
                    ((Widget) this).notWidgetSelectedModelType = 1;
                    ((Widget) this).notWidgetSelectedModelID = class68_sub14.readUShort();
                    widgetSelectedModelType = 1;
                    if (((Widget) this).notWidgetSelectedModelID == 65535)
                        ((Widget) this).notWidgetSelectedModelID = -1;
                    widgetSelectedModelID = class68_sub14.readUShort();
                    if (widgetSelectedModelID == 65535)
                        widgetSelectedModelID = -1;
                    ((Widget) this).anInt831 = class68_sub14.readUShort();
                    if (((Widget) this).anInt831 == 65535)
                        ((Widget) this).anInt831 = -1;
                    ((Widget) this).anInt869 = class68_sub14.readUShort();
                    if (((Widget) this).anInt869 == 65535)
                        ((Widget) this).anInt869 = -1;
                    ((Widget) this).anInt762 = class68_sub14.readUShort();
                    ((Widget) this).anInt864 = class68_sub14.readUShort();
                    ((Widget) this).anInt814 = class68_sub14.readUShort();
                }
                if (((Widget) this).type == 7)
                {
                    ((Widget) this).aByte811 = (byte) 3;
                    ((Widget) this).inventoryStackSizes = new int[(((Widget) this).height * ((Widget) this).width)];
                    ((Widget) this).inventory = new int[(((Widget) this).height * ((Widget) this).width)];
                    ((Widget) this).aByte779 = (byte) 3;
                    ((Widget) this).anInt777 = class68_sub14.readUByte();
                    ((Widget) this).anInt901 = class68_sub14.readUShort();
                    if (((Widget) this).anInt901 == 65535)
                        ((Widget) this).anInt901 = -1;
                    ((Widget) this).interfaceWidget = class68_sub14.readUByte() == 1;
                    ((Widget) this).textColor = class68_sub14.readInteger();
                    ((Widget) this).inventorySpritePaddingX = class68_sub14.readShort();
                    ((Widget) this).inventorySpritePaddingY = class68_sub14.readShort();
                    int i_23_ = class68_sub14.readUByte();
                    ((Widget) this).actions = new MutableString[5];
                    if (i_23_ == 1)
                        ((Widget) this).anInt763 |= 0x40000000;
                    for (int i_24_ = 0; i_24_ < 5; i_24_++)
                    {
                        MutableString class100 = class68_sub14.readString();
                        if (class100.getLength() > 0)
                        {
                            ((Widget) this).actions[i_24_] = class100;
                            ((Widget) this).anInt763 |= 1 << i_24_ + 23;
                        }
                    }
                }
                if (((Widget) this).type == 8)
                    ((Widget) this).text = class68_sub14.readString();
                if (((Widget) this).actionType == 2 || ((Widget) this).type == 2)
                {
                    ((Widget) this).selectedAction = class68_sub14.readString();
                    ((Widget) this).spellName = class68_sub14.readString();
                    int i_25_ = class68_sub14.readUShort() & 0x3f;
                    ((Widget) this).anInt763 |= i_25_ << 11;
                }
                if (((Widget) this).actionType == 1 || ((Widget) this).actionType == 4 || ((Widget) this).actionType == 5 || ((Widget) this).actionType == 6)
                {
                    ((Widget) this).tooltip = class68_sub14.readString();
                    if (((Widget) this).tooltip.getLength() == 0)
                    {
                        if (((Widget) this).actionType == 1)
                            ((Widget) this).tooltip = Class78.aClass100_1391;
                        if (((Widget) this).actionType == 4)
                            ((Widget) this).tooltip = Class20.aClass100_401;
                        if (((Widget) this).actionType == 5)
                            ((Widget) this).tooltip = Class20.aClass100_401;
                        if (((Widget) this).actionType == 6)
                            ((Widget) this).tooltip = Class75_Sub3.aClass100_3323;
                    }
                }
                if (((Widget) this).actionType == 1 || ((Widget) this).actionType == 4 || ((Widget) this).actionType == 5)
                    ((Widget) this).anInt763 |= 0x400000;
                if (((Widget) this).actionType != 6)
                    break;
                ((Widget) this).anInt763 |= 0x1;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ha.E(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final Class68_Sub20_Sub10 method499(byte i, int i_26_)
    {
        Class93.aBoolean1671 = false;
        anInt758++;
        if (i_26_ < 0 || ((Widget) this).anIntArray841.length <= i_26_)
            return null;
        int i_27_ = ((Widget) this).anIntArray841[i_26_];
        if (i > -26)
            ((Widget) this).anObjectArray778 = null;
        if (i_27_ == -1)
            return null;
        Class68_Sub20_Sub10 class68_sub20_sub10 = ((Class68_Sub20_Sub10) Class125.aClass98_2173.getNodeForID((long) i_27_));
        if (class68_sub20_sub10 != null)
            return class68_sub20_sub10;
        class68_sub20_sub10 = Class119.method1742(64, i_27_, 0, Class8.aClass21_164);
        if (class68_sub20_sub10 == null)
            Class93.aBoolean1671 = true;
        else
            Class125.aClass98_2173.addObject(class68_sub20_sub10, (long) i_27_);
        return class68_sub20_sub10;
    }

    public static void method500(int i)
    {
        aClass100_920 = null;
        groundItems = null;
        aClass100_927 = null;
        aClass100_923 = null;
        aClass16_886 = null;
        if (i != 104)
            method501(null, 57);
        aClass98_918 = null;
        aClass100_924 = null;
        aClass100_922 = null;
    }

    static final void method501(Class21 class21, int i)
    {
        try
        {
            anInt829++;
            if (i == 1)
                Class102.aClass21_1755 = class21;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ha.C(" + (class21 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final void method502(int i, Stream class68_sub14)
    {
        try
        {
            ((Stream) class68_sub14).position++;
            anInt912++;
            ((Widget) this).aBoolean863 = true;
            ((Widget) this).type = class68_sub14.readUByte();
            ((Widget) this).anInt808 = class68_sub14.readUShort();
            ((Widget) this).anInt810 = class68_sub14.readShort();
            ((Widget) this).anInt914 = class68_sub14.readShort();
            ((Widget) this).width = class68_sub14.readUShort();
            ((Widget) this).height = class68_sub14.readUShort();
            ((Widget) this).aByte779 = class68_sub14.readByte();
            ((Widget) this).aByte811 = class68_sub14.readByte();
            ((Widget) this).aByte904 = class68_sub14.readByte();
            ((Widget) this).aByte820 = class68_sub14.readByte();
            ((Widget) this).anInt799 = class68_sub14.readUShort();
            if (((Widget) this).anInt799 == 65535)
                ((Widget) this).anInt799 = -1;
            else
                ((Widget) this).anInt799 = (((Widget) this).anInt799 + (~0xffff & ((Widget) this).anInt792));
            ((Widget) this).aBoolean764 = (class68_sub14.readUByte() ^ 0xffffffff) == i;
            if (((Widget) this).type == 0)
            {
                ((Widget) this).anInt888 = class68_sub14.readUShort();
                ((Widget) this).anInt794 = class68_sub14.readUShort();
                ((Widget) this).aBoolean916 = class68_sub14.readUByte() == 1;
            }
            if (((Widget) this).type == 5)
            {
                ((Widget) this).backgroundColor = class68_sub14.readInteger();
                ((Widget) this).anInt845 = class68_sub14.readUShort();
                int i_28_ = class68_sub14.readUByte();
                ((Widget) this).aBoolean827 = (0x1 & i_28_) != 0;
                ((Widget) this).aBoolean765 = (i_28_ & 0x2) != 0;
                ((Widget) this).anInt775 = class68_sub14.readUByte();
                ((Widget) this).anInt859 = class68_sub14.readUByte();
                ((Widget) this).anInt906 = class68_sub14.readInteger();
                ((Widget) this).aBoolean819 = class68_sub14.readUByte() == 1;
                ((Widget) this).aBoolean825 = class68_sub14.readUByte() == 1;
            }
            if (((Widget) this).type == 6)
            {
                ((Widget) this).notWidgetSelectedModelType = 1;
                ((Widget) this).notWidgetSelectedModelID = class68_sub14.readUShort();
                if (((Widget) this).notWidgetSelectedModelID == 65535)
                    ((Widget) this).notWidgetSelectedModelID = -1;
                ((Widget) this).anInt857 = class68_sub14.readShort();
                ((Widget) this).anInt816 = class68_sub14.readShort();
                ((Widget) this).anInt864 = class68_sub14.readUShort();
                ((Widget) this).anInt814 = class68_sub14.readUShort();
                ((Widget) this).anInt853 = class68_sub14.readUShort();
                ((Widget) this).anInt762 = class68_sub14.readUShort();
                ((Widget) this).anInt831 = class68_sub14.readUShort();
                if (((Widget) this).anInt831 == 65535)
                    ((Widget) this).anInt831 = -1;
                ((Widget) this).aBoolean813 = class68_sub14.readUByte() == 1;
                class68_sub14.readUShort();
                class68_sub14.readUShort();
                class68_sub14.readUByte();
                if (((Widget) this).aByte779 != 0)
                    ((Widget) this).anInt793 = class68_sub14.readUShort();
                if (((Widget) this).aByte811 != 0)
                    ((Widget) this).anInt883 = class68_sub14.readUShort();
            }
            if (((Widget) this).type == 4)
            {
                ((Widget) this).anInt901 = class68_sub14.readUShort();
                if (((Widget) this).anInt901 == 65535)
                    ((Widget) this).anInt901 = -1;
                ((Widget) this).text = class68_sub14.readString();
                ((Widget) this).anInt789 = class68_sub14.readUByte();
                ((Widget) this).anInt777 = class68_sub14.readUByte();
                ((Widget) this).anInt830 = class68_sub14.readUByte();
                ((Widget) this).interfaceWidget = class68_sub14.readUByte() == 1;
                ((Widget) this).textColor = class68_sub14.readInteger();
            }
            if (((Widget) this).type == 3)
            {
                ((Widget) this).textColor = class68_sub14.readInteger();
                ((Widget) this).aBoolean866 = class68_sub14.readUByte() == 1;
                ((Widget) this).anInt775 = class68_sub14.readUByte();
            }
            if (((Widget) this).type == 9)
            {
                ((Widget) this).anInt822 = class68_sub14.readUByte();
                ((Widget) this).textColor = class68_sub14.readInteger();
                ((Widget) this).aBoolean894 = class68_sub14.readUByte() == 1;
            }
            ((Widget) this).anInt763 = class68_sub14.readTInteger();
            int i_29_ = class68_sub14.readUByte();
            if (i_29_ > 0)
            {
                ((Widget) this).aByteArray907 = new byte[i_29_];
                for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
                    ((Widget) this).aByteArray907[i_30_] = class68_sub14.readByte();
            }
            ((Widget) this).aClass100_890 = class68_sub14.readString();
            int i_31_ = class68_sub14.readUByte();
            if (i_31_ > 0)
            {
                ((Widget) this).aClass100Array823 = new MutableString[i_31_];
                for (int i_32_ = 0; i_31_ > i_32_; i_32_++)
                    ((Widget) this).aClass100Array823[i_32_] = class68_sub14.readString();
            }
            ((Widget) this).anInt870 = class68_sub14.readUByte();
            ((Widget) this).anInt909 = class68_sub14.readUByte();
            ((Widget) this).aBoolean766 = class68_sub14.readUByte() == 1;
            ((Widget) this).selectedAction = class68_sub14.readString();
            ((Widget) this).anObjectArray759 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray784 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray772 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray806 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray913 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray786 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray837 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray861 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray878 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray856 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray838 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray788 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray911 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray790 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray821 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray807 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray778 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray848 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray875 = method504((byte) -72, class68_sub14);
            ((Widget) this).anObjectArray835 = method504((byte) -72, class68_sub14);
            ((Widget) this).anIntArray787 = method503(class68_sub14, 0);
            ((Widget) this).anIntArray887 = method503(class68_sub14, 0);
            ((Widget) this).anIntArray891 = method503(class68_sub14, 0);
            ((Widget) this).anIntArray900 = method503(class68_sub14, 0);
            ((Widget) this).anIntArray780 = method503(class68_sub14, 0);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ha.F(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    private final int[] method503(Stream class68_sub14, int i)
    {
        try
        {
            anInt804++;
            int i_33_ = class68_sub14.readUByte();
            if (i == i_33_)
                return null;
            int[] is = new int[i_33_];
            for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
                is[i_34_] = class68_sub14.readInteger();
            return is;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ha.L(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    private final Object[] method504(byte i, Stream class68_sub14)
    {
        try
        {
            anInt800++;
            int i_35_ = class68_sub14.readUByte();
            if (i_35_ == 0)
                return null;
            Object[] objects = new Object[i_35_];
            if (i != -72)
                ((Widget) this).anObjectArray913 = null;
            for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
            {
                int i_37_ = class68_sub14.readUByte();
                if (i_37_ == 0)
                    objects[i_36_] = new Integer(class68_sub14.readInteger());
                else if (i_37_ == 1)
                    objects[i_36_] = class68_sub14.readString();
            }
            ((Widget) this).aBoolean851 = true;
            return objects;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ha.G(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    final Class68_Sub20_Sub1 method505(int i, Class92[] class92s)
    {
        try
        {
            anInt858++;
            Class93.aBoolean1671 = false;
            if (((Widget) this).anInt901 == -1)
                return null;
            Class68_Sub20_Sub1 class68_sub20_sub1 = ((Class68_Sub20_Sub1) Class68_Sub13_Sub20.aClass98_3780.getNodeForID((long) ((Widget) this).anInt901));
            if (class68_sub20_sub1 != null)
                return class68_sub20_sub1;
            class68_sub20_sub1 = Class90.method1515(Class8.aClass21_164, 0, (byte) 127, Class68_Sub10.aClass21_2909, ((Widget) this).anInt901);
            do
            {
                if (class68_sub20_sub1 == null)
                {
                    Class93.aBoolean1671 = true;
                    if (client.anInt2387 == 0)
                        break;
                }
                class68_sub20_sub1.method1017(class92s, null);
                Class68_Sub13_Sub20.aClass98_3780.addObject(class68_sub20_sub1, (long) ((Widget) this).anInt901);
            } while (false);
            return class68_sub20_sub1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ha.I(" + i + ',' + (class92s != null ? "{...}" : "null") + ')'));
        }
    }

    final Model method506(int i, boolean bool, byte i_38_, PlayerDefinition class126, Animation class117)
    {
        try
        {
            anInt760++;
            if (i_38_ != -27)
                method505(103, null);
            Class93.aBoolean1671 = false;
            int i_39_;
            int i_40_;
            do
            {
                if (!bool)
                {
                    i_39_ = ((Widget) this).notWidgetSelectedModelID;
                    i_40_ = ((Widget) this).notWidgetSelectedModelType;
                    if (client.anInt2387 == 0)
                        break;
                }
                i_40_ = widgetSelectedModelType;
                i_39_ = widgetSelectedModelID;
            } while (false);
            if (i_40_ == 0)
                return null;
            if (i_40_ == 1 && i_39_ == -1)
                return null;
            if (i_40_ == 1)
            {
                Model class1_sub3 = ((Model) Class12.aClass98_211.getNodeForID((long) ((i_40_ << 16) + i_39_)));
                if (class1_sub3 == null)
                {
                    Class1_Sub4 class1_sub4 = Class1_Sub4.method115(Class1_Sub7.aClass21_2620, i_39_, 0);
                    if (class1_sub4 == null)
                    {
                        Class93.aBoolean1671 = true;
                        return null;
                    }
                    class1_sub3 = class1_sub4.method127(64, 768, -50, -10, -50);
                    Class12.aClass98_211.addObject(class1_sub3, (long) (i_39_ + (i_40_ << 16)));
                }
                if (class117 != null)
                    class1_sub3 = class117.method1728((byte) 123, class1_sub3, i);
                return class1_sub3;
            }
            if (i_40_ == 2)
            {
                Model class1_sub3 = Class68_Sub13_Sub11.getNPCDefinition(i_39_).method1456(class117, (byte) 12, i);
                if (class1_sub3 == null)
                {
                    Class93.aBoolean1671 = true;
                    return null;
                }
                return class1_sub3;
            }
            if (i_40_ == 3)
            {
                if (class126 == null)
                    return null;
                Model class1_sub3 = class126.method1777(i, class117, -13);
                if (class1_sub3 == null)
                {
                    Class93.aBoolean1671 = true;
                    return null;
                }
                return class1_sub3;
            }
            if (i_40_ == 4)
            {
                ItemDefinition class19 = GameApplet.method18(-25672, i_39_);
                Model class1_sub3 = class19.method318(10, class117, i, 13895);
                if (class1_sub3 == null)
                {
                    Class93.aBoolean1671 = true;
                    return null;
                }
                return class1_sub3;
            }
            if (i_40_ == 6)
            {
                Model class1_sub3 = Class68_Sub13_Sub11.getNPCDefinition(i_39_).method1457(0, null, (byte) -121, class117, i);
                if (class1_sub3 == null)
                {
                    Class93.aBoolean1671 = true;
                    return null;
                }
                return class1_sub3;
            }
            if (i_40_ == 7)
            {
                int i_41_ = ((Widget) this).notWidgetSelectedModelID & 0xffff;
                int i_42_ = ((Widget) this).notWidgetSelectedModelID >>> 16;
                Model class1_sub3 = class126.method1772(i, class117, i_42_, i_41_, (byte) -37);
                if (class1_sub3 == null)
                {
                    Class93.aBoolean1671 = true;
                    return null;
                }
                return class1_sub3;
            }
            return null;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ha.J(" + i + ',' + bool + ',' + i_38_ + ',' + (class126 != null ? "{...}" : "null") + ',' + (class117 != null ? "{...}" : "null") + ')'));
        }
    }

    final Class68_Sub20_Sub10 method507(boolean bool, int i)
    {
        Class93.aBoolean1671 = false;
        anInt805++;
        int i_43_;
        if (bool)
            i_43_ = ((Widget) this).anInt833;
        else
            i_43_ = ((Widget) this).backgroundColor;
        if (i_43_ == -1)
            return null;
        long l = ((long) i_43_ + ((!((Widget) this).aBoolean765 ? 0L : 1L) << 35) + (((long) ((Widget) this).anInt859 << 36) + ((!((Widget) this).aBoolean819 ? 0L : 1L) << 38) + ((((Widget) this).aBoolean825 ? 1L : 0L) << 39) + ((long) ((Widget) this).anInt906 << 40)));
        Class68_Sub20_Sub10 class68_sub20_sub10 = ((Class68_Sub20_Sub10) Class125.aClass98_2173.getNodeForID(l));
        if (class68_sub20_sub10 != null)
            return class68_sub20_sub10;
        Sprite class68_sub20_sub10_sub1;
        if (((Widget) this).aBoolean765)
            class68_sub20_sub10_sub1 = Class68_Sub13_Sub31.method854(90, Class8.aClass21_164, 0, i_43_);
        else
            class68_sub20_sub10_sub1 = Class68_Sub22.method1202(i_43_, (byte) -96, Class8.aClass21_164, 0);
        if (class68_sub20_sub10_sub1 == null)
        {
            Class93.aBoolean1671 = true;
            return null;
        }
        if (((Widget) this).aBoolean819)
            class68_sub20_sub10_sub1.method1117();
        Sprite class68_sub20_sub10_sub1_44_ = class68_sub20_sub10_sub1;
        if (((Widget) this).aBoolean825)
            class68_sub20_sub10_sub1.method1120();
        if (i != 20503)
            method506(45, true, (byte) 41, null, null);
        if (((Widget) this).anInt859 > 0)
            class68_sub20_sub10_sub1.method1125(((Widget) this).anInt859);
        if (((Widget) this).anInt859 >= 1)
            class68_sub20_sub10_sub1.method1118(1);
        if (((Widget) this).anInt859 >= 2)
            class68_sub20_sub10_sub1.method1118(16777215);
        if (((Widget) this).anInt906 != 0)
            class68_sub20_sub10_sub1.method1123(((Widget) this).anInt906);
        Class125.aClass98_2173.addObject(class68_sub20_sub10_sub1_44_, l);
        return class68_sub20_sub10_sub1_44_;
    }

    public Widget()
    {
        ((Widget) this).anInt768 = 1;
        ((Widget) this).anInt771 = 0;
        ((Widget) this).aBoolean765 = false;
        ((Widget) this).anInt777 = 0;
        ((Widget) this).anInt789 = 0;
        ((Widget) this).anInt794 = 0;
        ((Widget) this).anInt775 = 0;
        ((Widget) this).anInt810 = 0;
        ((Widget) this).anInt798 = -1;
        ((Widget) this).anInt799 = -1;
        ((Widget) this).aBoolean827 = false;
        ((Widget) this).anInt830 = 0;
        ((Widget) this).anInt792 = -1;
        ((Widget) this).anInt793 = 0;
        ((Widget) this).backgroundColor = -1;
        ((Widget) this).aBoolean766 = false;
        widgetSelectedModelType = 1;
        ((Widget) this).aBoolean785 = true;
        ((Widget) this).aByte820 = (byte) 0;
        ((Widget) this).anInt822 = 1;
        ((Widget) this).anInt816 = 0;
        ((Widget) this).anInt831 = -1;
        ((Widget) this).anInt847 = 0;
        ((Widget) this).anInt845 = 0;
        ((Widget) this).anInt814 = 0;
        ((Widget) this).anInt869 = -1;
        ((Widget) this).anInt870 = 0;
        ((Widget) this).interfaceWidget = false;
        ((Widget) this).anInt862 = 0;
        widgetSelectedModelID = -1;
        ((Widget) this).anInt844 = -1;
        ((Widget) this).aBoolean813 = false;
        ((Widget) this).anInt839 = 0;
        ((Widget) this).anInt776 = 0;
        ((Widget) this).anInt857 = 0;
        ((Widget) this).anInt808 = 0;
        ((Widget) this).anInt855 = 0;
        ((Widget) this).x = 0;
        ((Widget) this).aBoolean764 = false;
        ((Widget) this).anInt818 = 0;
        ((Widget) this).aClass100_880 = Class68_Sub22.aClass100_3141;
        ((Widget) this).anInt781 = 0;
        ((Widget) this).aBoolean863 = false;
        ((Widget) this).anInt842 = 0;
        ((Widget) this).aBoolean850 = false;
        ((Widget) this).anInt867 = -1;
        ((Widget) this).notWidgetSelectedModelID = -1;
        ((Widget) this).inventorySpritePaddingX = 0;
        ((Widget) this).anInt849 = 1;
        ((Widget) this).aClass100_890 = Class68_Sub22.aClass100_3141;
        ((Widget) this).text = Class68_Sub22.aClass100_3141;
        ((Widget) this).aBoolean851 = false;
        ((Widget) this).aByte779 = (byte) 0;
        ((Widget) this).anInt892 = 0;
        ((Widget) this).anInt762 = 100;
        ((Widget) this).anInt836 = -1;
        ((Widget) this).anInt828 = 0;
        ((Widget) this).anInt883 = 0;
        ((Widget) this).height = 0;
        ((Widget) this).anInt902 = -1;
        ((Widget) this).aBoolean894 = false;
        ((Widget) this).textColor = 0;
        ((Widget) this).selectedAction = Class68_Sub22.aClass100_3141;
        ((Widget) this).anInt889 = 0;
        ((Widget) this).aBoolean866 = false;
        ((Widget) this).aByte811 = (byte) 0;
        ((Widget) this).aByte904 = (byte) 0;
        ((Widget) this).anInt873 = 0;
        ((Widget) this).tooltip = Class78.aClass100_1391;
        ((Widget) this).spellName = Class68_Sub22.aClass100_3141;
        ((Widget) this).anInt909 = 0;
        ((Widget) this).anInt864 = 0;
        ((Widget) this).actionType = 0;
        ((Widget) this).inventorySpritePaddingY = 0;
        ((Widget) this).anInt888 = 0;
        ((Widget) this).anInt906 = 0;
        ((Widget) this).anInt879 = 0;
        ((Widget) this).y = 0;
        ((Widget) this).aBoolean905 = false;
        ((Widget) this).anInt914 = 0;
        ((Widget) this).anInt910 = 0;
        ((Widget) this).anInt853 = 0;
        ((Widget) this).notWidgetSelectedModelType = 1;
        ((Widget) this).anInt763 = 0;
        ((Widget) this).anInt859 = 0;
        ((Widget) this).anInt833 = -1;
        ((Widget) this).anInt901 = -1;
        ((Widget) this).aClass45_893 = null;
        ((Widget) this).anInt915 = 0;
        ((Widget) this).anInt877 = 0;
        ((Widget) this).aBoolean916 = false;
        ((Widget) this).anInt860 = -1;
    }

    static
    {
        aClass100_922 = Class112.makeMutableString(43, "glow3:");
        aClass100_923 = aClass100_922;
        aClass100_920 = aClass100_922;
        aClass100_927 = Class112.makeMutableString(43, "Close");
        aClass100_924 = aClass100_927;
    }
}
