/* Class68_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub7 extends Node
{
    static int anInt2850;
    boolean[] aBooleanArray2851;
    private int anInt2852;
    static int anInt2853;
    static int anInt2854;
    int[] anIntArray2855;
    static NodeSubList aClass128_2856 = new NodeSubList();
    int[][] anIntArrayArray2857;
    static int anInt2858;
    int anInt2859;
    static MutableString aClass100_2860;
    static int anInt2861;
    static Player localPlayer;
    static MutableString aClass100_2863;
    static int cameraPositionX;
    private static MutableString aClass100_2865 = Class112.makeMutableString(43, "Prepared sound engine");

    static final void method665(Class68_Sub20_Sub1 class68_sub20_sub1, int i)
    {
        try
        {
            anInt2858++;
            class68_sub20_sub1.method1032(Class48.aClass100_952, Class13_Sub3.appletWidth / 2, (Class68_Sub13_Sub9.appletHeight / 2 - 26), 16777215, -1);
            int i_0_ = Class68_Sub13_Sub9.appletHeight / 2 - 18;
            if (i != -27931)
                method670(false, (byte) 82);
            Class79.method1421(Class13_Sub3.appletWidth / 2 - 152, i_0_, 304, 34, 9179409);
            Class79.method1421(Class13_Sub3.appletWidth / 2 - 151, i_0_ + 1, 302, 32, 0);
            Class79.method1445(Class13_Sub3.appletWidth / 2 - 150, i_0_ + 2, Class68_Sub13_Sub28.anInt3919 * 3, 30, 9179409);
            Class79.method1445((Class13_Sub3.appletWidth / 2 + 3 * Class68_Sub13_Sub28.anInt3919 - 150), i_0_ + 2, 300 - Class68_Sub13_Sub28.anInt3919 * 3, 30, 0);
            class68_sub20_sub1.method1032(ScriptParameters.aClass100_3237, Class13_Sub3.appletWidth / 2, Class68_Sub13_Sub9.appletHeight / 2 + 4, 16777215, -1);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "gg.B(" + (class68_sub20_sub1 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final int method666(int i)
    {
        anInt2853++;
        if (Class63.aBoolean1170)
            return 0;
        if (i != 1)
            aClass100_2860 = null;
        if (!Class28.method398(24781))
            return 1;
        if (!Class68_Sub20_Sub2.aBoolean4190)
            return 1;
        return 2;
    }

    static final void method667(Class21 class21, int i)
    {
        try
        {
            if (i == -5545)
            {
                Object5.anInt1248 = class21.getIndex(Class32.aClass100_569, (byte) -84);
                anInt2861++;
                Class1_Sub5.anInt2516 = class21.getIndex(Class124.aClass100_2143, (byte) -125);
                Class68_Sub20_Sub3.anInt4212 = class21.getIndex(CipheredByteVector.aClass100_4136, (byte) -127);
                Class68_Sub13_Sub27.anInt3913 = class21.getIndex(Mouse.aClass100_1571, (byte) -103);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "gg.D(" + (class21 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    public static void method668(int i)
    {
        aClass128_2856 = null;
        if (i != 304)
            method666(-74);
        aClass100_2865 = null;
        aClass100_2860 = null;
        aClass100_2863 = null;
        localPlayer = null;
    }

    static final void method669(int i)
    {
        int i_1_ = -1;
        int i_2_ = -71 / ((-81 - i) / 38);
        for (/**/; client.localPlayerCount > i_1_; i_1_++)
        {
            int i_3_;
            if (i_1_ != -1)
                i_3_ = Class85.localPlayerIndices[i_1_];
            else
                i_3_ = 2047;
            Player class1_sub6_sub2 = Class68_Sub13_Sub4.localPlayers[i_3_];
            if (class1_sub6_sub2 != null)
                Class51.method537(class1_sub6_sub2, 128, ((Character) class1_sub6_sub2).raw_range);
        }
        anInt2854++;
    }

    static final void method670(boolean bool, byte i)
    {
        if (i == 84)
        {
            byte[][] is = Class68_Sub20_Sub11.aByteArrayArray4334;
            int i_4_ = Class23.aByteArrayArray490.length;
            for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
            {
                byte[] is_6_ = is[i_5_];
                if (is_6_ != null)
                {
                    int i_7_ = (64 * (Class119.mapDataAreas[i_5_] >> 8) - Class36.baseX);
                    int i_8_ = ((Class119.mapDataAreas[i_5_] & 0xff) * 64 - Class68_Sub13_Sub35.baseY);
                    Class49.method524(i ^ 0x3f96);
                    Class68_Sub8.method673(i_7_, i_8_, is_6_, bool, Class109.groundDataArray, false);
                }
            }
            anInt2850++;
        }
    }

    Class68_Sub7(int i, byte[] is)
    {
        try
        {
            ((Class68_Sub7) this).anInt2859 = i;
            Stream class68_sub14 = new Stream(is);
            anInt2852 = class68_sub14.readUByte();
            ((Class68_Sub7) this).aBooleanArray2851 = new boolean[anInt2852];
            ((Class68_Sub7) this).anIntArrayArray2857 = new int[anInt2852][];
            ((Class68_Sub7) this).anIntArray2855 = new int[anInt2852];
            for (int i_9_ = 0; i_9_ < anInt2852; i_9_++)
                ((Class68_Sub7) this).anIntArray2855[i_9_] = class68_sub14.readUByte();
            for (int i_10_ = 0; anInt2852 > i_10_; i_10_++)
                ((Class68_Sub7) this).aBooleanArray2851[i_10_] = class68_sub14.readUByte() == 1;
            for (int i_11_ = 0; i_11_ < anInt2852; i_11_++)
                ((Class68_Sub7) this).anIntArrayArray2857[i_11_] = new int[class68_sub14.readUByte()];
            for (int i_12_ = 0; anInt2852 > i_12_; i_12_++)
            {
                for (int i_13_ = 0; i_13_ < (((Class68_Sub7) this).anIntArrayArray2857[i_12_]).length; i_13_++)
                    ((Class68_Sub7) this).anIntArrayArray2857[i_12_][i_13_] = class68_sub14.readUByte();
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("gg.<init>(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static
    {
        aClass100_2860 = Class112.makeMutableString(43, "null");
        aClass100_2863 = aClass100_2865;
    }
}
