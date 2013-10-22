/* Class68_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub11_Sub1 extends Class68_Sub11
{
    int anInt3445;
    int anInt3446;
    byte[] aByteArray3447;
    boolean aBoolean3448;
    int anInt3449;

    final Class68_Sub11_Sub1 method685(Class95 class95)
    {
        ((Class68_Sub11_Sub1) this).aByteArray3447 = class95.method1552((byte) -127, ((Class68_Sub11_Sub1) this).aByteArray3447);
        ((Class68_Sub11_Sub1) this).anInt3449 = class95.method1553(((Class68_Sub11_Sub1) this).anInt3449, -100);
        if (((Class68_Sub11_Sub1) this).anInt3445 == ((Class68_Sub11_Sub1) this).anInt3446)
            ((Class68_Sub11_Sub1) this).anInt3445 = ((Class68_Sub11_Sub1) this).anInt3446 = class95.method1558(((Class68_Sub11_Sub1) this).anInt3445, (byte) 127);
        else
        {
            ((Class68_Sub11_Sub1) this).anInt3445 = class95.method1558(((Class68_Sub11_Sub1) this).anInt3445, (byte) 127);
            ((Class68_Sub11_Sub1) this).anInt3446 = class95.method1558(((Class68_Sub11_Sub1) this).anInt3446, (byte) 127);
            if (((Class68_Sub11_Sub1) this).anInt3445 == ((Class68_Sub11_Sub1) this).anInt3446)
                ((Class68_Sub11_Sub1) this).anInt3445--;
        }
        return this;
    }

    Class68_Sub11_Sub1(int i, byte[] is, int i_0_, int i_1_)
    {
        ((Class68_Sub11_Sub1) this).anInt3449 = i;
        ((Class68_Sub11_Sub1) this).aByteArray3447 = is;
        ((Class68_Sub11_Sub1) this).anInt3445 = i_0_;
        ((Class68_Sub11_Sub1) this).anInt3446 = i_1_;
    }

    Class68_Sub11_Sub1(int i, byte[] is, int i_2_, int i_3_, boolean bool)
    {
        ((Class68_Sub11_Sub1) this).anInt3449 = i;
        ((Class68_Sub11_Sub1) this).aByteArray3447 = is;
        ((Class68_Sub11_Sub1) this).anInt3445 = i_2_;
        ((Class68_Sub11_Sub1) this).anInt3446 = i_3_;
        ((Class68_Sub11_Sub1) this).aBoolean3448 = bool;
    }
}
