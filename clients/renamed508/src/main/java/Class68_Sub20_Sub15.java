/* Class68_Sub20_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub15 extends NodeSub
{
    static int anInt4390;
    static long[] aLongArray4391 = new long[1000];
    static MutableString aClass100_4392 = Class112.makeMutableString(43, "showingVideoAd");
    byte aByte4393;
    int anInt4394;
    static MutableString aClass100_4395;
    Class21_Sub1 aClass21_Sub1_4396;
    static int anInt4397;
    static MutableString aClass100_4398 = Class112.makeMutableString(43, ":duelfriend:");
    static int anInt4399;
    static int anInt4400;
    static int anInt4401 = 127;
    static int anInt4402 = -1;
    static int anInt4403;
    static int anInt4404;
    static int anInt4405;
    static int anInt4406;
    static int anInt4407;

    public static void method1168(byte i)
    {
        aClass100_4398 = null;
        aClass100_4392 = null;
        aLongArray4391 = null;
        if (i != -63)
            method1168((byte) -1);
        aClass100_4395 = null;
    }

    static final void method1169(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, byte i_6_)
    {
        anInt4397++;
        if (i_3_ == i_0_)
            Class3.method179(i_5_, i_1_, i_4_, i_0_, i_2_, 73, i);
        else
        {
            do
            {
                if (GroundData.anInt677 <= i_1_ - i_0_ && NodeCache.anInt1920 >= i_0_ + i_1_ && i_2_ - i_3_ >= Class35.anInt605 && i_3_ + i_2_ <= Class51.anInt2257)
                {
                    Class21_Sub1.method369(i_4_, i_3_, i_5_, i_1_, i, i_0_, (byte) -111, i_2_);
                    if (client.anInt2387 == 0)
                        break;
                }
                Class13.method241(i, i_0_, i_2_, i_3_, i_5_, i_1_, i_4_, -1832820639);
            } while (false);
            if (i_6_ != -12)
                aClass100_4398 = null;
        }
    }

    static final Widget method1170(int i, byte i_7_)
    {
        if (i_7_ != -80)
            aClass100_4398 = null;
        anInt4403++;
        int i_8_ = i & 0xffff;
        int i_9_ = i >> 16;
        if (Class68_Sub13_Sub36.widgetCache[i_9_] == null || (Class68_Sub13_Sub36.widgetCache[i_9_][i_8_] == null))
        {
            boolean bool = Class68_Sub13_Sub25.method824(i_9_, (byte) -2);
            if (!bool)
                return null;
        }
        return Class68_Sub13_Sub36.widgetCache[i_9_][i_8_];
    }

    public Class68_Sub20_Sub15()
    {
        /* empty */
    }

    static final int method1171(int i, int i_10_, byte i_11_, int i_12_)
    {
        if (i_11_ != 114)
            anInt4402 = 105;
        anInt4406++;
        if (i < i_12_)
            return i_12_;
        if (i <= i_10_)
            return i;
        return i_10_;
    }

    static
    {
        anInt4399 = 0;
        aClass100_4395 = Class112.makeMutableString(43, "underlay");
    }
}
