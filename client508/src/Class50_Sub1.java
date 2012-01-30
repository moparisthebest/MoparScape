/* Class50_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class50_Sub1 extends Class50 {
    public long aLong2728 = System.nanoTime();

    public int method532(int i, int i_0_, int i_1_) {
        long l = (long) i * 1000000L;
        int i_2_ = 0;
        long l_3_ = aLong2728 - System.nanoTime();
        if (l_3_ < l)
            l_3_ = l;
        if (i_0_ != -19)
            return -96;
        Class50.method528(-5, l_3_ / 1000000L);
        long l_4_;
        for (l_4_ = System.nanoTime();
             10 > i_2_ && ((i_2_ ^ 0xffffffff) > -2 || aLong2728 < l_4_);
             i_2_++)
            aLong2728 += (long) i_1_ * 1000000L;
        if (l_4_ > aLong2728)
            aLong2728 = l_4_;
        return i_2_;
    }

    public void method529(boolean bool) {
        aLong2728 = System.nanoTime();
        if (bool != true)
            method529(false);
    }
}
