/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class33
{
    static int anInt575;
    static int anInt576 = 0;
    static int anInt577 = 0;
    static int anInt578;
    static short[] aShortArray579 = new short[256];
    static int anInt580;
    static Mouse mouse;
    static MutableString[] menuOptions = new MutableString[500];
    static Class21_Sub1 aClass21_Sub1_583;
    static int[][][] anIntArrayArrayArray584;
    static MutableString aClass100_585;
    static MutableString aClass100_586;
    static boolean aBoolean587;
    static int anInt588;
    static int anInt589;
    static volatile int anInt590;

    public static void method411(byte i)
    {
        anIntArrayArrayArray584 = null;
        if (i < 125)
            aClass21_Sub1_583 = null;
        menuOptions = null;
        aClass100_585 = null;
        aClass100_586 = null;
        mouse = null;
        aClass21_Sub1_583 = null;
        aShortArray579 = null;
    }

    static final synchronized byte[] allocateBuffer(int size)
    {
        if (size == 100 && Class13_Sub3.allocatedTinyBufferCount > 0)
        {
            byte[] is = Class114.allocatedTinyBuffers[--Class13_Sub3.allocatedTinyBufferCount];
            Class114.allocatedTinyBuffers[Class13_Sub3.allocatedTinyBufferCount] = null;
            return is;
        }
        if (size == 5000 && Node.allocatedMediumBufferCount > 0)
        {
            byte[] is = Class107.allocatedMediumBuffers[--Node.allocatedMediumBufferCount];
            Class107.allocatedMediumBuffers[Node.allocatedMediumBufferCount] = null;
            return is;
        }
        if (size == 30000 && Class120.allocatedHugeBufferCount > 0)
        {
            byte[] is = (Class68_Sub13_Sub27.allocatedHugeBuffers[--Class120.allocatedHugeBufferCount]);
            Class68_Sub13_Sub27.allocatedHugeBuffers[Class120.allocatedHugeBufferCount] = null;
            return is;
        }
        return new byte[size];
    }

    static final void method413(int i, int i_1_, Widget class45, int i_2_, int i_3_, Class68_Sub20_Sub10 class68_sub20_sub10, int i_4_)
    {
        try
        {
            anInt578++;
            if (class68_sub20_sub10 != null)
            {
                int i_5_ = 0x7ff & Class68_Sub13_Sub26.minimapInt1 + Class8.minimapInt2;
                int i_6_ = (Math.max(((Widget) class45).anInt892 / 2, ((Widget) class45).anInt873 / 2) + 10);
                int i_7_ = i_3_ * i_3_ + i * i;
                if (i_6_ * i_6_ >= i_7_)
                {
                    int i_8_ = Class62.PRECOMPUTED_SINE_CACHE[i_5_];
                    int i_9_ = Class62.PRECOMUPTED_COSINE_CACHE[i_5_];
                    i_9_ = i_9_ * 256 / (Class68_Sub20_Sub16.minimapInt3 + 256);
                    i_8_ = 256 * i_8_ / (Class68_Sub20_Sub16.minimapInt3 + 256);
                    if (i_1_ <= -23)
                    {
                        int i_10_ = i_9_ * i_3_ + i_8_ * i >> 16;
                        int i_11_ = i * i_9_ - i_3_ * i_8_ >> 16;
                        ((Sprite) class68_sub20_sub10).method1127((i_10_ + (i_2_ + ((Widget) class45).anInt892 / 2) - (((Class68_Sub20_Sub10) class68_sub20_sub10).anInt4307) / 2), (i_4_ + ((Widget) class45).anInt873 / 2 - (((Class68_Sub20_Sub10) class68_sub20_sub10).anInt4315) / 2 - i_11_), ((Widget) class45).anIntArray854, ((Widget) class45).anIntArray783);
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("fb.A(" + i + ',' + i_1_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + (class68_sub20_sub10 != null ? "{...}" : "null") + ',' + i_4_ + ')'));
        }
    }

    static
    {
        mouse = new Mouse();
        aClass100_585 = Class112.makeMutableString(43, " loggt sich aus)3");
        aClass100_586 = Class112.makeMutableString(43, "");
        anInt590 = 0;
    }
}
