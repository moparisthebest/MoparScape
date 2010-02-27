/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class25
{
    static int anInt510;
    static MutableString aClass100_511 = Class112.makeMutableString(43, " )2> <col=ff9040>");
    static int anInt512;
    static Class21 aClass21_513;
    static int anInt514;
    static int anInt515;
    static int anInt516;
    static int anInt517 = 0;
    static int anInt518;

    static final void method384(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_)
    {
        anInt515++;
        if (Class68_Sub13_Sub25.method824(i_0_, (byte) -2))
        {
            client.method43(Class68_Sub13_Sub36.widgetCache[i_0_], -1, i_5_, i_2_, i_1_, i_6_, i_4_, i_3_);
            if (i > -1)
                anInt517 = -98;
        }
    }

    public static void method385(int i)
    {
        aClass100_511 = null;
        aClass21_513 = null;
        if (i != 0)
            anInt516 = -33;
    }

    static final void method386(MutableString class100, int i, MutableString class100_7_, int i_8_, int i_9_, MutableString class100_10_)
    {
        try
        {
            for (int i_11_ = 99; i_11_ > 0; i_11_--)
            {
                Class68_Sub13_Sub39.anIntArray4100[i_11_] = Class68_Sub13_Sub39.anIntArray4100[i_11_ - 1];
                Class68_Sub13_Sub27.aClass100Array3918[i_11_] = Class68_Sub13_Sub27.aClass100Array3918[i_11_ - 1];
                Animation.chatNames[i_11_] = Animation.chatNames[i_11_ - 1];
                GameSocket.aClass100Array1139[i_11_] = GameSocket.aClass100Array1139[i_11_ - 1];
                Class68_Sub13_Sub9.anIntArray3584[i_11_] = Class68_Sub13_Sub9.anIntArray3584[i_11_ - 1];
            }
            Class68_Sub13_Sub27.aClass100Array3918[0] = class100_7_;
            Animation.chatNames[0] = class100_10_;
            if (i == -19596)
            {
                Class68_Sub20_Sub3.anInt4198 = Class68_Sub22.anInt3150;
                Class68_Sub13_Sub39.anIntArray4100[0] = i_9_;
                Class22.anInt485++;
                anInt512++;
                Class68_Sub13_Sub9.anIntArray3584[0] = i_8_;
                GameSocket.aClass100Array1139[0] = class100;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("de.D(" + (class100 != null ? "{...}" : "null") + ',' + i + ',' + (class100_7_ != null ? "{...}" : "null") + ',' + i_8_ + ',' + i_9_ + ',' + (class100_10_ != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method387(boolean bool, MutableString class100, boolean bool_12_)
    {
        try
        {
            anInt510++;
            class100 = class100.toLowerCase((byte) 111);
            short[] is = new short[16];
            if (bool == true)
            {
                int i = 0;
                for (int i_13_ = 0; Class14.anInt233 > i_13_; i_13_++)
                {
                    ItemDefinition class19 = GameApplet.method18(-25672, i_13_);
                    if ((!bool_12_ || ((ItemDefinition) class19).aBoolean366) && ((ItemDefinition) class19).certTemplateID == -1 && ((ItemDefinition) class19).anInt339 == -1 && ((ItemDefinition) class19).anInt341 == 0 && ((ItemDefinition) class19).name.toLowerCase((byte) -99).method1601(-128, class100) != -1)
                    {
                        if (i >= 250)
                        {
                            Class68_Sub6.anInt2838 = -1;
                            Class13.aShortArray213 = null;
                            return;
                        }
                        if (is.length <= i)
                        {
                            short[] is_14_ = new short[is.length * 2];
                            for (int i_15_ = 0; i > i_15_; i_15_++)
                                is_14_[i_15_] = is[i_15_];
                            is = is_14_;
                        }
                        is[i++] = (short) i_13_;
                    }
                }
                Class13.aShortArray213 = is;
                Class68_Sub6.anInt2838 = i;
                Class97.anInt1719 = 0;
                MutableString[] class100s = new MutableString[Class68_Sub6.anInt2838];
                for (int i_16_ = 0; Class68_Sub6.anInt2838 > i_16_; i_16_++)
                    class100s[i_16_] = (((ItemDefinition) GameApplet.method18(-25672, is[i_16_])).name);
                Class72_Sub1.method1365(class100s, Class13.aShortArray213, -122);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("de.A(" + bool + ',' + (class100 != null ? "{...}" : "null") + ',' + bool_12_ + ')'));
        }
    }
}
