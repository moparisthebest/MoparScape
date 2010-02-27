/* Class68_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class Class68_Sub20_Sub2 extends NodeSub
{
    int anInt4183 = 0;
    static int anInt4184;
    static int anInt4185;
    static int anInt4186;
    static int anInt4187;
    static int anInt4188;
    static int anInt4189;
    static boolean aBoolean4190 = true;
    static int anInt4191 = 0;
    static Font aFont4192;
    static int anInt4193;

    static final void method1039(GroundData class38, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_)
    {
        while_0_: do
        {
            do
            {
                try
                {
                    long l = 0L;
                    anInt4185++;
                    if (i_2_ <= 10)
                        method1043((byte) 55);
                    boolean bool = false;
                    int i_5_ = -1;
                    if (i != 0)
                    {
                        if (i == 1)
                            l = Class68_Sub13_Sub36.method883(i_1_, i_4_, i_3_);
                        else if (i != 2)
                        {
                            if (i == 3)
                                l = Class89.method1512(i_1_, i_4_, i_3_);
                        } else
                            l = Class68_Sub13_Sub9.method738(i_1_, i_4_, i_3_);
                    } else
                        l = Class107.method1656(i_1_, i_4_, i_3_);
                    i_5_ = 0x7fffffff & (int) (l >>> 32);
                    boolean bool_6_ = false;
                    int i_7_ = ((int) l & 0x3e7935) >> 20;
                    ObjectDefinition class116 = Class1_Sub5.method140(107, i_5_);
                    if (class116.method1713((byte) -6))
                        Class68_Sub13_Sub21.method809(i_3_, class116, i_1_, (byte) 18, i_4_);
                    int i_8_ = 0x1f & (int) l >> 14;
                    if (l == 0L)
                        break while_0_;
                    if (i != 0)
                    {
                        if (i == 1)
                        {
                            Object2 class76 = Class15.method279(i_1_, i_4_, i_3_);
                        } else
                        {
                            if (i != 2)
                            {
                                if (i == 3)
                                {
                                    Object3 class47 = Class68_Sub13_Sub22.method812(i_1_, i_4_, i_3_);
                                    if (((ObjectDefinition) class116).anInt2024 == 1)
                                        class38.method447(i_4_, -262145, i_3_);
                                }
                            } else
                            {
                                Object5 class69 = CachedItem.method1186(i_1_, i_4_, i_3_);
                                if (((ObjectDefinition) class116).anInt2024 == 0 || (((ObjectDefinition) class116).anInt1990 + i_4_ >= 104) || (i_3_ + ((ObjectDefinition) class116).anInt1990 >= 104) || (i_4_ + ((ObjectDefinition) class116).anInt1989 >= 104) || (((ObjectDefinition) class116).anInt1989 + i_3_ >= 104))
                                    break;
                                class38.method454(((ObjectDefinition) class116).anInt1989, i_4_, ((ObjectDefinition) class116).anInt1990, i_7_, i_3_, ((ObjectDefinition) class116).aBoolean2032, (byte) 82);
                            }
                            break;
                        }
                        break;
                    }
                    Object1 class64 = Class68_Sub16.method988(i_1_, i_4_, i_3_);
                    if (((ObjectDefinition) class116).anInt2024 == 0)
                        break while_0_;
                    class38.method458(i_4_, i_8_, i_3_, true, ((ObjectDefinition) class116).aBoolean2032, i_7_);
                } catch (RuntimeException runtimeexception)
                {
                    throw Class107.getException(runtimeexception, ("bk.A(" + (class38 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
                }
            } while (false);
            break;
        } while (false);
    }

    private final void method1040(int i, Stream class68_sub14, int i_9_)
    {
        do
        {
            try
            {
                anInt4187++;
                if (i != (i_9_ ^ 0xffffffff))
                    break;
                ((Class68_Sub20_Sub2) this).anInt4183 = class68_sub14.readUShort();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("bk.C(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ',' + i_9_ + ')'));
            }
            break;
        } while (false);
    }

    static final void method1041(int i)
    {
        if (i == -13893)
        {
            anInt4186++;
            Class50.aClass16_984 = new NodeList();
        }
    }

    public static void method1042(byte i)
    {
        if (i == 23)
            aFont4192 = null;
    }

    static final Class97 method1043(byte i)
    {
        anInt4193++;
        try
        {
            if (i < 56)
                return null;
            return (Class97) Class.forName("Class97_Sub1").newInstance();
        } catch (Throwable throwable)
        {
            return null;
        }
    }

    public Class68_Sub20_Sub2()
    {
        /* empty */
    }

    static final void method1044(byte i)
    {
        anInt4184++;
        if (i <= -56)
        {
            aFont4192 = null;
            Class118.aFontMetrics2076 = null;
            Class89.anImage1624 = null;
        }
    }

    final void method1045(byte i, Stream class68_sub14)
    {
        try
        {
            for (;;)
            {
                int i_10_ = class68_sub14.readUByte();
                if (i_10_ == 0)
                    break;
                method1040(-3, class68_sub14, i_10_);
            }
            anInt4189++;
            int i_11_ = -126 % ((i + 63) / 59);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bk.F(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }
}
