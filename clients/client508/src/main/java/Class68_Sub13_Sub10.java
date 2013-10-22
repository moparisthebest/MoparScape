/* Class68_Sub13_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub10 extends Class68_Sub13 {
    public static int anInt3584;
    public static int anInt3585;
    public static RSString aRSString_3586;
    public static int anInt3587;
    public static RSString aRSString_3588
            = RSString.newRsString("<col=ff9040>");
    public static int anInt3589;
    public static int anInt3590;
    public static int[] anIntArray3591;
    public int anInt3592 = 4096;
    public static RSString aRSString_3593;
    public static int anInt3594;
    public static int anInt3595;
    public int anInt3596 = 0;
    public static int anInt3597;

    public static boolean method740(int i, int i_0_, int i_1_, int i_2_,
                                    int i_3_, int i_4_) {
        if (i_0_ == i_1_ && i_2_ == i_3_) {
            if (!Class21renamed.method361(i, i_0_, i_2_))
                return false;
            int i_5_ = i_0_ << 7;
            int i_6_ = i_2_ << 7;
            if (Login.method1472(i_5_ + 1, (Class68_Sub20_Sub12
                    .anIntArrayArrayArray4353[i]
                    [i_0_][i_2_]) + i_4_, i_6_ + 1)
                    && Login.method1472(i_5_ + 128 - 1,
                    (Class68_Sub20_Sub12
                            .anIntArrayArrayArray4353[i][i_0_ + 1]
                            [i_2_]) + i_4_,
                    i_6_ + 1)
                    && Login.method1472(i_5_ + 128 - 1,
                    (Class68_Sub20_Sub12
                            .anIntArrayArrayArray4353[i][i_0_ + 1]
                            [i_2_ + 1]) + i_4_,
                    i_6_ + 128 - 1)
                    && Login.method1472(i_5_ + 1,
                    (Class68_Sub20_Sub12
                            .anIntArrayArrayArray4353[i][i_0_]
                            [i_2_ + 1]) + i_4_,
                    i_6_ + 128 - 1))
                return true;
            return false;
        }
        for (int i_7_ = i_0_; i_7_ <= i_1_; i_7_++) {
            for (int i_8_ = i_2_; i_8_ <= i_3_; i_8_++) {
                if (Class72.anIntArrayArrayArray1311[i][i_7_][i_8_]
                        == -Class68_Sub1.anInt2756)
                    return false;
            }
        }
        int i_9_ = (i_0_ << 7) + 1;
        int i_10_ = (i_2_ << 7) + 2;
        int i_11_
                = (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i][i_0_][i_2_]
                + i_4_);
        if (!Login.method1472(i_9_, i_11_, i_10_))
            return false;
        int i_12_ = (i_1_ << 7) - 1;
        if (!Login.method1472(i_12_, i_11_, i_10_))
            return false;
        int i_13_ = (i_3_ << 7) - 1;
        if (!Login.method1472(i_9_, i_11_, i_13_))
            return false;
        if (!Login.method1472(i_12_, i_11_, i_13_))
            return false;
        return true;
    }

    public static void method741(byte i) {
        aRSString_3593 = null;
        aRSString_3586 = null;
        int i_14_ = 100 % ((i - -80) / 46);
        anIntArray3591 = null;
        aRSString_3588 = null;
    }

    public Class68_Sub13_Sub10() {
        super(1, true);
    }

    public static void method742(int i, boolean bool) {
        Class68_Sub8.aClass98_2870.method1564(-18767, i);
        anInt3587++;
        if (bool != true)
            anInt3597 = 114;
    }

    public int[] method698(byte i, int i_15_) {
        int[] is = aClass115_2936.method1697(false, i_15_);
        if (i != -61)
            method698((byte) 2, 80);
        anInt3585++;
        if (aClass115_2936.aBoolean1957) {
            int[] is_16_ = this.method696(0, i_15_, i ^ ~0x71e1);
            for (int i_17_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_17_ ^ 0xffffffff)); i_17_++) {
                int i_18_ = is_16_[i_17_];
                is[i_17_] = i_18_ < anInt3596 || anInt3592 < i_18_ ? 0 : 4096;
            }
        }
        return is;
    }

    public static void method743(int i) {
        Class125.aClass98_2171.method1567(111);
        anInt3589++;
        if (i != 7)
            anIntArray3591 = null;
        Class12.aClass98_211.method1567(i + 108);
        Class68_Sub13_Sub20.aClass98_3778.method1567(115);
    }

    public void method700(Stream class68_sub14, int i, int i_19_) {
        if (i_19_ != -1)
            anInt3597 = 68;
        int i_20_ = i;
        do {
            if ((i_20_ ^ 0xffffffff) != -1) {
                if ((i_20_ ^ 0xffffffff) != -2)
                    break;
            } else {
                anInt3596 = class68_sub14.readUnsignedWord(1355769544);
                break;
            }
            anInt3592 = class68_sub14.readUnsignedWord(1355769544);
        } while (false);
        anInt3584++;
    }

    public static void method744(Class68_Sub3 class68_sub3, boolean bool,
                                 boolean bool_21_) {
        anInt3594++;
        int i = class68_sub3.anInt2803;
        if (bool != true)
            anInt3595 = 98;
        int i_22_ = (int) class68_sub3.aLong1218;
        class68_sub3.method647(-17554);
        if (bool_21_)
            ItemDef.method314(-10, i);
        Class4.method186(i, 2);
        Class45 class45 = Class68_Sub20_Sub15.method1170(i_22_, (byte) -80);
        if (class45 != null)
            Class113.method1682(class45, -124);
        Class68_Sub13_Sub21.anInt3803 = 0;
        Class120.aBoolean2099 = false;
        Class127.method1781(Class49.anInt969, Class68_Sub13_Sub14.anInt3667,
                Class68_Sub13_Sub15.anInt3687, Class33.anInt588,
                (byte) -107);
        if (anInt3595 != -1)
            GameException.method1796(116, anInt3595, 1);
    }

    static {
        aRSString_3586 = RSString.newRsString("rect_debug=");
        anInt3590 = 0;
        aRSString_3593 = RSString.newRsString("<)4col> x");
        anInt3597 = 1;
        anInt3595 = -1;
    }
}
