/* Class50_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50_Sub1 extends Class50
{
    private long aLong2730 = System.nanoTime();

    final int method532(int i, int i_0_, int i_1_)
    {
        long l = (long) i * 1000000L;
        int i_2_ = 0;
        long l_3_ = aLong2730 - System.nanoTime();
        if (l_3_ < l)
            l_3_ = l;
        if (i_0_ != -19)
            return -96;
        Class50.method528(-5, l_3_ / 1000000L);
        long l_4_;
        for (l_4_ = System.nanoTime(); 10 > i_2_ && (i_2_ < 1 || aLong2730 < l_4_); i_2_++)
            aLong2730 += (long) i_1_ * 1000000L;
        if (l_4_ > aLong2730)
            aLong2730 = l_4_;
        return i_2_;
    }

    final void method529(boolean bool)
    {
        aLong2730 = System.nanoTime();
        if (bool != true)
            method529(false);
    }
}
