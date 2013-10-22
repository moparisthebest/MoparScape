/* Class68_Sub13_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub23 extends Class68_Sub13 {
    public static int anInt3816;
    public static int anInt3817;
    public static int anInt3818;
    public static RSString aRSString_3819 = RSString.newRsString("gr-Un:");
    public int anInt3820 = 1;
    public static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array3821;
    public int anInt3822 = 0;
    public static int anInt3823;
    public static int anInt3824;
    public static Class92[] aClass92Array3825;
    public static RSString aRSString_3826 = RSString.newRsString("Stufe)2");
    public static int anInt3827;
    public int anInt3828 = 0;

    public int[] method698(byte i, int i_0_) {
        anInt3824++;
        if (i != -61)
            method700(null, -71, -32);
        int[] is = aClass115_2936.method1697(false, i_0_);
        if (aClass115_2936.aBoolean1957) {
            int i_1_ = Class13_Sub3.anIntArray2672[i_0_];
            int i_2_ = -2048 + i_1_ >> 1787938369;
            for (int i_3_ = 0; i_3_ < Class68_Sub13_Sub19.anInt3746; i_3_++) {
                int i_4_ = Class68_Sub13_Sub3.anIntArray3479[i_3_];
                int i_5_ = -2048 + i_4_ >> 214580225;
                int i_6_;
                if (anInt3828 == 0)
                    i_6_ = anInt3820 * (i_4_ - i_1_);
                else {
                    int i_7_ = i_5_ * i_5_ - -(i_2_ * i_2_) >> 707503596;
                    i_6_ = (int) (4096.0 * Math.sqrt((double) ((float) i_7_
                            / 4096.0F)));
                    i_6_ = (int) (3.141592653589793
                            * (double) (anInt3820 * i_6_));
                }
                i_6_ -= i_6_ & ~0xfff;
                if ((anInt3822 ^ 0xffffffff) == -1)
                    i_6_ = 4096 + (Class118.anIntArray2077
                            [0xff & i_6_ >> 35459076]) >> -35407135;
                else if ((anInt3822 ^ 0xffffffff) == -3) {
                    i_6_ -= 2048;
                    if ((i_6_ ^ 0xffffffff) > -1)
                        i_6_ = -i_6_;
                    i_6_ = -i_6_ + 2048 << 1384424897;
                }
                is[i_3_] = i_6_;
            }
        }
        return is;
    }

    public static Class32 method813(int i, int i_8_) {
        if (i >= -3)
            return null;
        anInt3827++;
        Class32 class32 = (Class32) Class68_Sub13_Sub28.aClass98_3923
                .method1570(14366, (long) i_8_);
        if (class32 != null)
            return class32;
        byte[] is = PlayerDefinition.aClass21_2192.method338(i_8_, 0, 16);
        class32 = new Class32();
        if (is != null)
            class32.method407(0, new Stream(is));
        Class68_Sub13_Sub28.aClass98_3923.method1568(class32, 126,
                (long) i_8_);
        return class32;
    }

    public Class68_Sub13_Sub23() {
        super(0, true);
    }

    public void method690(byte i) {
        anInt3818++;
        Class68_Sub10.method683((byte) 43);
        if (i > -22)
            method690((byte) -3);
    }

    public static void method814(byte i, RSString class100) {
        if (i == 37) {
            anInt3816++;
            Class68_Sub13_Sub34.method875((byte) 108);
            Class80.method1441(0, class100);
        }
    }

    public static void method815(int i) {
        aClass92Array3825 = null;
        int i_9_ = -71 % ((i - -16) / 48);
        aClass68_Sub20_Sub10Array3821 = null;
        aRSString_3826 = null;
        aRSString_3819 = null;
    }

    public void method700(Stream class68_sub14, int i, int i_10_) {
        int i_11_ = i;
        while_113_:
        do {
            do {
                if ((i_11_ ^ 0xffffffff) != -1) {
                    if ((i_11_ ^ 0xffffffff) != -2) {
                        if ((i_11_ ^ 0xffffffff) == -4)
                            break;
                        break while_113_;
                    }
                } else {
                    anInt3828 = class68_sub14.readUnsignedByte(-6677);
                    break while_113_;
                }
                anInt3822 = class68_sub14.readUnsignedByte(i_10_ ^ 0x1a14);
                break while_113_;
            } while (false);
            anInt3820 = class68_sub14.readUnsignedByte(-6677);
        } while (false);
        if (i_10_ != -1)
            anInt3820 = -82;
        anInt3817++;
    }
}
