/* Class68_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class68_Sub28 extends Node
{
    Class68_Sub11 aClass68_Sub11_3227;
    int anInt3228;
    volatile boolean aBoolean3229 = true;
    Class68_Sub28 aClass68_Sub28_3230;

    final void method1223(int[] is, int i, int i_0_)
    {
        if (((Class68_Sub28) this).aBoolean3229)
            method1225(is, i, i_0_);
        else
            method1229(i_0_);
    }

    abstract int method1224();

    abstract void method1225(int[] is, int i, int i_1_);

    abstract Class68_Sub28 method1226();

    int method1227()
    {
        return 255;
    }

    abstract Class68_Sub28 method1228();

    abstract void method1229(int i);

    public Class68_Sub28()
    {
        /* empty */
    }
}
