/* Class68_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub11_Sub1 extends Class68_Sub11 {
    public int anInt3443;
    public int anInt3444;
    public byte[] aByteArray3445;
    public boolean aBoolean3446;
    public int anInt3447;

    public Class68_Sub11_Sub1 method685(Class95 class95) {
        aByteArray3445 = class95.method1546((byte) -127, aByteArray3445);
        anInt3447 = class95.method1547(anInt3447, -100);
        if (anInt3443 == anInt3444)
            anInt3443 = anInt3444 = class95.method1552(anInt3443, (byte) 127);
        else {
            anInt3443 = class95.method1552(anInt3443, (byte) 127);
            anInt3444 = class95.method1552(anInt3444, (byte) 127);
            if (anInt3443 == anInt3444)
                anInt3443--;
        }
        return this;
    }

    public Class68_Sub11_Sub1(int i, byte[] is, int i_0_, int i_1_) {
        anInt3447 = i;
        aByteArray3445 = is;
        anInt3443 = i_0_;
        anInt3444 = i_1_;
    }

    public Class68_Sub11_Sub1(int i, byte[] is, int i_2_, int i_3_,
                              boolean bool) {
        anInt3447 = i;
        aByteArray3445 = is;
        anInt3443 = i_2_;
        anInt3444 = i_3_;
        aBoolean3446 = bool;
    }
}
