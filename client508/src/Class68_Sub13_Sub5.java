/* Class68_Sub13_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

public class Class68_Sub13_Sub5 extends Class68_Sub13 {
    public static int anInt3512;
    public static int anInt3513;
    public static int anInt3514;
    public static Class44 aClass44_3515 = new Class44();
    public static BigInteger aBigInteger3516;
    public static RSString aRSString_3517;
    public static int anInt3518 = -1;
    public static RSString aRSString_3519
            = RSString.newRsString("Allocated memory");
    public static RSString aRSString_3520;
    public static RSString aRSString_3521;
    public static Class21_Sub1 aClass21_Sub1_3522;

    public int[][] method697(int i, boolean bool) {
        anInt3512++;
        int[][] is = aClass88_2939.method1496(i, (byte) 54);
        if (bool != true)
            return null;
        if (aClass88_2939.aBoolean1610) {
            int[][] is_0_ = this.method699(-31, 0, i);
            int[] is_1_ = is_0_[0];
            int[] is_2_ = is_0_[1];
            int[] is_3_ = is_0_[2];
            int[] is_4_ = is[0];
            int[] is_5_ = is[2];
            int[] is_6_ = is[1];
            for (int i_7_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_7_ ^ 0xffffffff)); i_7_++) {
                is_4_[i_7_] = 4096 + -is_1_[i_7_];
                is_6_[i_7_] = -is_2_[i_7_] + 4096;
                is_5_[i_7_] = 4096 - is_3_[i_7_];
            }
        }
        return is;
    }

    public static void method719(int i) {
        aRSString_3519 = null;
        aRSString_3521 = null;
        aClass21_Sub1_3522 = null;
        aRSString_3517 = null;
        if (i == 4096) {
            aBigInteger3516 = null;
            aRSString_3520 = null;
            aClass44_3515 = null;
        }
    }

    public Class68_Sub13_Sub5() {
        super(1, false);
    }

    public int[] method698(byte i, int i_8_) {
        int[] is = aClass115_2936.method1697(false, i_8_);
        if (aClass115_2936.aBoolean1957) {
            int[] is_9_ = this.method696(0, i_8_, 29149);
            for (int i_10_ = 0; Class68_Sub13_Sub19.anInt3746 > i_10_; i_10_++)
                is[i_10_] = -is_9_[i_10_] + 4096;
        }
        if (i != -61)
            method700(null, -83, 113);
        anInt3513++;
        return is;
    }

    public void method700(Stream class68_sub14, int i, int i_11_) {
        if (i_11_ != -1)
            aClass21_Sub1_3522 = null;
        if (i == 0)
            aBoolean2931 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
        anInt3514++;
    }

    static {
        aRSString_3517 = aRSString_3519;
        aRSString_3521 = RSString.newRsString("Checking for updates )2 ");
        aRSString_3520 = aRSString_3521;
        aBigInteger3516
                = (new BigInteger
                ("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083"));
    }
}
