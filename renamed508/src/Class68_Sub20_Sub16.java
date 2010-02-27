/* Class68_Sub20_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub16 extends NodeSub
{
    int anInt4408;
    int anInt4409 = 12800;
    static int[] anIntArray4410 = new int[2];
    int anInt4411 = -1;
    int anInt4412;
    static int anInt4413;
    MutableString aClass100_4414;
    boolean aBoolean4415;
    static MutableString aClass100_4416 = Class112.makeMutableString(43, " <col=00ff80>");
    static int anInt4417;
    static int[] anIntArray4418 = new int[256];
    static Class65 aClass65_4419;
    static int updateBlockCount;
    int anInt4421 = 12800;
    static int minimapInt3;
    static int anInt4423;
    static int anInt4424 = -1;
    int anInt4425;
    static MutableString aClass100_4426;
    static Class92_Sub1 aClass92_Sub1_4427;
    static int anInt4428;
    static int anInt4429;
    int anInt4430;
    MutableString aClass100_4431;
    NodeList aClass16_4432;

    final void method1172(int i)
    {
        ((Class68_Sub20_Sub16) this).anInt4421 = i;
        anInt4417++;
        ((Class68_Sub20_Sub16) this).anInt4408 = 0;
        ((Class68_Sub20_Sub16) this).anInt4409 = 12800;
        ((Class68_Sub20_Sub16) this).anInt4412 = 0;
        for (Class68_Sub4 class68_sub4 = (Class68_Sub4) ((Class68_Sub20_Sub16) this).aClass16_4432.method293((byte) 76); class68_sub4 != null; class68_sub4 = (Class68_Sub4) ((Class68_Sub20_Sub16) this).aClass16_4432.method290((byte) -106))
        {
            if (((Class68_Sub4) class68_sub4).anInt2825 > ((Class68_Sub20_Sub16) this).anInt4412)
                ((Class68_Sub20_Sub16) this).anInt4412 = ((Class68_Sub4) class68_sub4).anInt2825;
            if (((Class68_Sub20_Sub16) this).anInt4409 > ((Class68_Sub4) class68_sub4).anInt2824)
                ((Class68_Sub20_Sub16) this).anInt4409 = ((Class68_Sub4) class68_sub4).anInt2824;
            if (((Class68_Sub20_Sub16) this).anInt4421 > ((Class68_Sub4) class68_sub4).anInt2819)
                ((Class68_Sub20_Sub16) this).anInt4421 = ((Class68_Sub4) class68_sub4).anInt2819;
            if (((Class68_Sub4) class68_sub4).anInt2823 > ((Class68_Sub20_Sub16) this).anInt4408)
                ((Class68_Sub20_Sub16) this).anInt4408 = ((Class68_Sub4) class68_sub4).anInt2823;
        }
    }

    static final void method1173(int i, boolean bool, int i_0_, byte[] is, int i_1_, GroundData[] class38s, int i_2_, int i_3_, boolean bool_4_, int i_5_, int i_6_)
    {
        try
        {
            if (bool != false)
                anIntArray4410 = null;
            if (!bool_4_)
            {
                for (int i_7_ = 0; i_7_ < 8; i_7_++)
                {
                    for (int i_8_ = 0; i_8_ < 8; i_8_++)
                    {
                        if (i_7_ + i_0_ > 0 && i_0_ + i_7_ < 103 && i_6_ + i_8_ > 0 && i_6_ + i_8_ < 103)
                            ((GroundData) class38s[i_3_]).blocks[i_0_ + i_7_][i_8_ + i_6_] = Class120.method1746((((GroundData) class38s[i_3_]).blocks[i_0_ + i_7_][i_8_ + i_6_]), -16777217);
                    }
                }
            }
            anInt4428++;
            int i_9_;
            if (bool_4_)
                i_9_ = 1;
            else
                i_9_ = 4;
            Stream class68_sub14 = new Stream(is);
            for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
            {
                for (int i_11_ = 0; i_11_ < 64; i_11_++)
                {
                    for (int i_12_ = 0; i_12_ < 64; i_12_++)
                    {
                        if (i_5_ != i_10_ || i > i_11_ || i_11_ >= i + 8 || i_1_ > i_12_ || i_1_ + 8 <= i_12_)
                            Class96.method1560(bool_4_, -1, 0, 0, class68_sub14, 0, 0, (byte) 118, -1);
                        else
                            Class96.method1560(bool_4_, (i_0_ + Class68_Sub13_Sub17.method780(i_2_, 0x7 & i_12_, 0x7 & i_11_, -27039)), 0, 0, class68_sub14, i_3_, i_2_, (byte) 37, Animable.method54((byte) -94, i_2_, i_12_ & 0x7, i_11_ & 0x7) + i_6_);
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uf.E(" + i + ',' + bool + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ',' + i_1_ + ',' + (class38s != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + bool_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
        }
    }

    final boolean method1174(int i, int i_13_, int i_14_)
    {
        anInt4429++;
        if (((Class68_Sub20_Sub16) this).anInt4421 > i_13_ || i_13_ > ((Class68_Sub20_Sub16) this).anInt4412 || i_14_ < ((Class68_Sub20_Sub16) this).anInt4409 || ((Class68_Sub20_Sub16) this).anInt4408 < i_14_)
            return false;
        Class68_Sub4 class68_sub4 = (Class68_Sub4) ((Class68_Sub20_Sub16) this).aClass16_4432.method293((byte) 76);
        int i_15_ = -107 / ((-26 - i) / 57);
        for (/**/; class68_sub4 != null; class68_sub4 = (Class68_Sub4) ((Class68_Sub20_Sub16) this).aClass16_4432.method290((byte) 109))
        {
            if (class68_sub4.method656(i_13_, -9710, i_14_))
                return true;
        }
        return false;
    }

    public static void method1175(int i)
    {
        aClass92_Sub1_4427 = null;
        aClass100_4416 = null;
        if (i != 25465)
            anIntArray4410 = null;
        aClass100_4426 = null;
        anIntArray4410 = null;
        anIntArray4418 = null;
        aClass65_4419 = null;
    }

    static final int method1176(int i, int i_16_)
    {
        if (i_16_ != 255)
            return 40;
        anInt4423++;
        return i & 0xff;
    }

    static final void method1177(int i, Class21 class21, boolean bool, Class21 class21_17_)
    {
        try
        {
            Class68_Sub20_Sub3.aClass21_4194 = class21;
            if (i != 12800)
                method1176(62, 98);
            anInt4413++;
            Class68_Sub27.aBoolean3222 = bool;
            Class68_Sub28_Sub1.aClass21_4480 = class21_17_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uf.F(" + i + ',' + (class21 != null ? "{...}" : "null") + ',' + bool + ',' + (class21_17_ != null ? "{...}" : "null") + ')'));
        }
    }

    Class68_Sub20_Sub16(MutableString class100, MutableString class100_18_, int i, int i_19_, int i_20_, boolean bool)
    {
        ((Class68_Sub20_Sub16) this).anInt4408 = 0;
        ((Class68_Sub20_Sub16) this).anInt4412 = 0;
        ((Class68_Sub20_Sub16) this).aBoolean4415 = true;
        try
        {
            ((Class68_Sub20_Sub16) this).anInt4411 = i_20_;
            ((Class68_Sub20_Sub16) this).aBoolean4415 = bool;
            ((Class68_Sub20_Sub16) this).aClass100_4431 = class100_18_;
            ((Class68_Sub20_Sub16) this).anInt4425 = i;
            ((Class68_Sub20_Sub16) this).anInt4430 = i_19_;
            ((Class68_Sub20_Sub16) this).aClass100_4414 = class100;
            ((Class68_Sub20_Sub16) this).aClass16_4432 = new NodeList();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uf.<init>(" + (class100 != null ? "{...}" : "null") + ',' + (class100_18_ != null ? "{...}" : "null") + ',' + i + ',' + i_19_ + ',' + i_20_ + ',' + bool + ')'));
        }
    }

    static
    {
        minimapInt3 = 0;
        aClass100_4426 = Class112.makeMutableString(43, "l");
        aClass92_Sub1_4427 = null;
        updateBlockCount = 0;
    }
}
