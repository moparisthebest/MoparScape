/* Class68_Sub13_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub25 extends Class68_Sub13
{
    static int anInt3850;
    static int anInt3851;
    static int anInt3852;
    static MutableString aClass100_3853;
    private int[] anIntArray3854;
    static int anInt3855;
    static short[] aShortArray3856;
    static int anInt3857 = 255;
    static int anInt3858 = 0;
    static int anInt3859;
    static int anInt3860;
    private int[] anIntArray3861;
    private int[][] anIntArrayArray3862;
    static int anInt3863;
    static int anInt3864;
    static int anInt3865;
    private static MutableString aClass100_3866;
    static int anInt3867;
    private int anInt3868;
    private short[] aShortArray3869 = new short[257];
    static MutableString aClass100_3870;
    static MutableString aClass100_3871;

    final void method690(byte i)
    {
        if (anIntArrayArray3862 == null)
            anIntArrayArray3862 = new int[][] { new int[2], { 4096, 4096 } };
        anInt3864++;
        if (anIntArrayArray3862.length < 2)
            throw new RuntimeException("Curve operation requires at least two markers");
        if (anInt3868 == 2)
            method822((byte) 100);
        if (i >= -22)
            anInt3855 = 22;
        Class68_Sub10.method683((byte) -128);
        method823((byte) 63);
    }

    public static void method820(int i)
    {
        aClass100_3853 = null;
        aShortArray3856 = null;
        if (i != -1)
            anInt3860 = -3;
        aClass100_3870 = null;
        aClass100_3866 = null;
        aClass100_3871 = null;
    }

    final void method700(Stream class68_sub14, int i, int i_0_)
    {
        try
        {
            if (i == 0)
            {
                anInt3868 = class68_sub14.readUByte();
                anIntArrayArray3862 = new int[class68_sub14.readUByte()][2];
                for (int i_1_ = 0; i_1_ < anIntArrayArray3862.length; i_1_++)
                {
                    anIntArrayArray3862[i_1_][0] = class68_sub14.readUShort();
                    anIntArrayArray3862[i_1_][1] = class68_sub14.readUShort();
                }
            }
            if (i_0_ != -1)
                anInt3855 = 120;
            anInt3851++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("oj.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
        }
    }

    static final void method821(boolean bool)
    {
        if (!Class120.menuOpen)
        {
            Class68_Sub13_Sub21.menuOptionsCount = 1;
            Class68_Sub28_Sub1.menuActionIDs[0] = (short) 1004;
            Class71_Sub1.menuActions[0] = Class34.aClass100_598;
            Class33.menuOptions[0] = Class68_Sub28_Sub2.aClass100_4558;
            if (Object3.anInt940 == 0)
            {
                if (Class29.anInt537 != 0)
                {
                    Class92.anInt1648 = Class125.anInt2175;
                    Class68_Sub25.anInt3178 = Class68_Sub13_Sub37.anInt4079;
                } else
                {
                    Class68_Sub25.anInt3178 = Class96.anInt1697;
                    Class92.anInt1648 = Class13.anInt223;
                }
            } else
            {
                Class92.anInt1648 = Class68_Sub13_Sub16.anInt3707;
                Class68_Sub25.anInt3178 = Class13_Sub4.anInt2684;
            }
        }
        if (Class68_Sub13_Sub10.anInt3597 != -1)
            Class43.method480(Class68_Sub13_Sub10.anInt3597, -1);
        anInt3867++;
        for (int i = 0; i < Class56.anInt1061; i++)
        {
            if (Class121.aBooleanArray2111[i])
                Class68_Sub17.aBooleanArray3039[i] = true;
            Class4.aBooleanArray95[i] = Class121.aBooleanArray2111[i];
            Class121.aBooleanArray2111[i] = false;
        }
        Class68_Sub2.anInt2800 = -1;
        Class3.aClass45_73 = null;
        Class68_Sub13_Sub34.anInt4015 = Class68_Sub3.loopCycle;
        if (bool != true)
            method824(-36, (byte) 44);
        NodeList.anInt276 = -1;
        if (Class68_Sub13_Sub10.anInt3597 != -1)
        {
            Class56.anInt1061 = 0;
            NodeSub.method1004(0, 0, Class68_Sub13_Sub9.appletHeight, 0, Class68_Sub13_Sub10.anInt3597, -1, 0, Class13_Sub3.appletWidth, (byte) -112);
        }
        Class79.method1422();
        Class68_Sub13_Sub19.method792(6364);
        if (!Class120.menuOpen)
        {
            if (Class68_Sub2.anInt2800 != -1)
                Class28.method399(106, NodeList.anInt276, Class68_Sub2.anInt2800);
        } else
            ScriptParameters.method1320(4);
        if (Class68_Sub20_Sub5.anInt4231 == 3)
        {
            for (int i = 0; i < Class56.anInt1061; i++)
            {
                if (Class4.aBooleanArray95[i])
                    Class79.method1441(Class105.anIntArray1797[i], Class71.anIntArray1294[i], ItemDefinition.anIntArray376[i], Player.anIntArray3432[i], 16711935, 128);
                else if (Class68_Sub17.aBooleanArray3039[i])
                    Class79.method1441(Class105.anIntArray1797[i], Class71.anIntArray1294[i], ItemDefinition.anIntArray376[i], Player.anIntArray3432[i], 16711680, 128);
            }
        }
        Class68_Sub13_Sub30.method850(Class109.anInt1846, (byte) -34, GameSocket.plane, ((Character) Class68_Sub7.localPlayer).y, ((Character) Class68_Sub7.localPlayer).x);
        Class109.anInt1846 = 0;
    }

    private final void method822(byte i)
    {
        anInt3865++;
        int[] is = anIntArrayArray3862[0];
        int[] is_2_ = anIntArrayArray3862[1];
        int[] is_3_ = anIntArrayArray3862[anIntArrayArray3862.length - 1];
        int[] is_4_ = anIntArrayArray3862[anIntArrayArray3862.length - 2];
        anIntArray3861 = new int[] { is[0] + (is[0] - is_2_[0]), is[1] + is[1] - is_2_[1] };
        if (i != 100)
            aShortArray3856 = null;
        anIntArray3854 = new int[] { is_4_[0] - is_3_[0] + is_4_[0], is_4_[1] + (is_4_[1] - is_3_[1]) };
    }

    private final void method823(byte i)
    {
        anInt3863++;
        int i_5_ = anInt3868;
        while_120_: do
        {
            do
            {
                if (i_5_ != 2)
                {
                    if (i_5_ != 1)
                        break;
                } else
                {
                    for (i_5_ = 0; i_5_ < 257; i_5_++)
                    {
                        int i_6_ = i_5_ << 4;
                        int i_7_;
                        for (i_7_ = 1; anIntArrayArray3862.length - 1 > i_7_; i_7_++)
                        {
                            if (anIntArrayArray3862[i_7_][0] > i_6_)
                                break;
                        }
                        int[] is = anIntArrayArray3862[i_7_];
                        int[] is_8_ = anIntArrayArray3862[i_7_ - 1];
                        int i_9_ = method825((byte) -124, i_7_ - 2)[1];
                        int i_10_ = is_8_[1];
                        int i_11_ = is[1];
                        int i_12_ = method825((byte) -125, i_7_ + 1)[1];
                        int i_13_ = (i_6_ - is_8_[0] << 12) / (is[0] - is_8_[0]);
                        int i_14_ = i_13_ * i_13_ >> 12;
                        int i_15_ = i_10_ + i_12_ - (i_11_ + i_9_);
                        int i_16_ = i_11_ - i_9_;
                        int i_17_ = (i_15_ * i_13_ >> 12) * i_14_ >> 12;
                        int i_18_ = i_9_ - i_10_ - i_15_;
                        int i_19_ = i_18_ * i_14_ >> 12;
                        int i_20_ = i_16_ * i_13_ >> 12;
                        int i_21_ = i_10_;
                        int i_22_ = i_21_ + i_19_ + (i_17_ + i_20_);
                        if (i_22_ <= -32768)
                            i_22_ = -32767;
                        if (i_22_ >= 32768)
                            i_22_ = 32767;
                        aShortArray3869[i_5_] = (short) i_22_;
                    }
                    break while_120_;
                }
                for (i_5_ = 0; i_5_ < 257; i_5_++)
                {
                    int i_23_ = i_5_ << 4;
                    int i_24_;
                    for (i_24_ = 1; anIntArrayArray3862.length - 1 > i_24_; i_24_++)
                    {
                        if (anIntArrayArray3862[i_24_][0] > i_23_)
                            break;
                    }
                    int[] is = anIntArrayArray3862[i_24_ - 1];
                    int[] is_25_ = anIntArrayArray3862[i_24_];
                    int i_26_ = (i_23_ - is[0] << 12) / (is_25_[0] - is[0]);
                    int i_27_ = (4096 - Class78.anIntArray1396[(0x1fe9 & i_26_) >> 5] >> 1);
                    int i_28_ = 4096 - i_27_;
                    int i_29_ = i_27_ * is_25_[1] + is[1] * i_28_ >> 12;
                    if (i_29_ <= -32768)
                        i_29_ = -32767;
                    if (i_29_ >= 32768)
                        i_29_ = 32767;
                    aShortArray3869[i_5_] = (short) i_29_;
                }
                break while_120_;
            } while (false);
            for (i_5_ = 0; i_5_ < 257; i_5_++)
            {
                int i_30_ = i_5_ << 4;
                int i_31_;
                for (i_31_ = 1; i_31_ < anIntArrayArray3862.length - 1; i_31_++)
                {
                    if (i_30_ < anIntArrayArray3862[i_31_][0])
                        break;
                }
                int[] is = anIntArrayArray3862[i_31_];
                int[] is_32_ = anIntArrayArray3862[i_31_ - 1];
                int i_33_ = (i_30_ - is_32_[0] << 12) / (is[0] - is_32_[0]);
                int i_34_ = 4096 - i_33_;
                int i_35_ = is_32_[1] * i_34_ + is[1] * i_33_ >> 12;
                if (i_35_ <= -32768)
                    i_35_ = -32767;
                if (i_35_ >= 32768)
                    i_35_ = 32767;
                aShortArray3869[i_5_] = (short) i_35_;
            }
        } while (false);
        if (i != 63)
            method700(null, 65, 75);
    }

    static final boolean method824(int i, byte i_36_)
    {
        anInt3852++;
        if (GameSocket.validWidgets[i])
            return true;
        if (!client.aClass21_2382.method333((byte) -126, i))
            return false;
        int i_37_ = client.aClass21_2382.method355(i, 0);
        if (i_37_ == 0)
        {
            GameSocket.validWidgets[i] = true;
            return true;
        }
        if (Class68_Sub13_Sub36.widgetCache[i] == null)
            Class68_Sub13_Sub36.widgetCache[i] = new Widget[i_37_];
        for (int i_38_ = 0; i_38_ < i_37_; i_38_++)
        {
            if (Class68_Sub13_Sub36.widgetCache[i][i_38_] == null)
            {
                byte[] is = client.aClass21_2382.method338(i_38_, 0, i);
                if (is != null)
                {
                    Class68_Sub13_Sub36.widgetCache[i][i_38_] = new Widget();
                    ((Widget) (Class68_Sub13_Sub36.widgetCache[i][i_38_])).anInt792 = (i << 16) + i_38_;
                    if (is[0] != -1)
                        Class68_Sub13_Sub36.widgetCache[i][i_38_].method498(-18165, new Stream(is));
                    else
                        Class68_Sub13_Sub36.widgetCache[i][i_38_].method502(-2, new Stream(is));
                }
            }
        }
        if (i_36_ != -2)
            anInt3860 = -29;
        GameSocket.validWidgets[i] = true;
        return true;
    }

    private final int[] method825(byte i, int i_39_)
    {
        anInt3850++;
        if (i > -117)
            return null;
        if (i_39_ < 0)
            return anIntArray3861;
        if (i_39_ >= anIntArrayArray3862.length)
            return anIntArray3854;
        return anIntArrayArray3862[i_39_];
    }

    public Class68_Sub13_Sub25()
    {
        super(1, true);
        anInt3868 = 0;
    }

    final int[] method698(byte i, int i_40_)
    {
        anInt3859++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_40_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int[] is_41_ = this.method696(0, i_40_, 29149);
            for (int i_42_ = 0; i_42_ < Class68_Sub13_Sub19.anInt3748; i_42_++)
            {
                int i_43_ = is_41_[i_42_] >> 4;
                if (i_43_ < 0)
                    i_43_ = 0;
                if (i_43_ > 256)
                    i_43_ = 256;
                is[i_42_] = aShortArray3869[i_43_];
            }
        }
        if (i != -61)
            method824(-50, (byte) -96);
        return is;
    }

    static
    {
        aClass100_3853 = Class112.makeMutableString(43, "mapscene");
        aShortArray3856 = new short[256];
        aClass100_3866 = Class112.makeMutableString(43, "Started 3d library");
        aClass100_3870 = aClass100_3866;
        anInt3860 = 0;
        anInt3855 = 0;
        aClass100_3871 = Class112.makeMutableString(43, "<img=0>");
    }
}
