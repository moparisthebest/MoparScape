/* Class68_Sub20_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

public abstract class Class68_Sub20_Sub10 extends Class68_Sub20 {
    public static int anInt4302;
    public int anInt4303;
    public static int anInt4304;
    public int anInt4305;
    public static long aLong4306 = 0L;
    public static int anInt4307;
    public static int anInt4308;
    public int anInt4309;
    public static int anInt4310;
    public int anInt4311;
    public static int anInt4312;
    public int anInt4313;
    public static Class16 aClass16_4314;
    public int anInt4315;
    public static int anInt4316;
    public static RSString aRSString_4317 = RSString.newRsString("null");
    public static Class124 aClass124_4318;
    public static int anInt4319;
    public static RSString aRSString_4320;

    public abstract void method1103(int i, int i_0_);

    public void method1104(int i, int i_1_, int i_2_, int i_3_, byte i_4_) {
        anInt4308++;
        int i_5_ = anInt4305 << -1286189757;
        i_2_ = (i_5_ & 0xf) + (i_2_ << -1503069852);
        int i_6_ = anInt4313 << 758495971;
        i_1_ = (0xf & i_6_) + (i_1_ << -563161628);
        int i_7_ = -44 / ((36 - i_4_) / 52);
        method1107(i_5_, i_6_, i_2_, i_1_, i, i_3_);
    }

    public abstract void method1105(int i, int i_8_, int i_9_, int i_10_,
                                    int i_11_);

    public static RSString method1106(boolean bool, int i,
                                      RSString[] class100s, int i_12_) {
        anInt4307++;
        int i_13_ = 0;
        for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
            if (class100s[i_14_ + i] == null)
                class100s[i_14_ + i] = Class68_Sub8.aRSString_2871;
            i_13_ += class100s[i + i_14_].anInt2293;
        }
        byte[] is = new byte[i_13_];
        int i_15_ = 0;
        for (int i_16_ = 0; i_12_ > i_16_; i_16_++) {
            RSString class100 = class100s[i - -i_16_];
            Class39.method465(class100.bytes, 0, is, i_15_,
                    class100.anInt2293);
            i_15_ += class100.anInt2293;
        }
        RSString class100 = new RSString();
        class100.anInt2293 = i_13_;
        class100.bytes = is;
        if (bool != true)
            return null;
        return class100;
    }

    public abstract void method1107(int i, int i_17_, int i_18_, int i_19_,
                                    int i_20_, int i_21_);

    public abstract void method1108(int i, int i_22_);

    public static void method1109(int i, Class21renamed class21,
                                  Class21renamed class21_23_) {
        do {
            try {
                anInt4312++;
                Class68_Sub15.aClass21_3020 = class21;
                Class9.aClass21_173 = class21_23_;
                Class119.anInt2088 = Class9.aClass21_173.method355(3, 0);
                if (i < -102)
                    break;
                aClass124_4318 = null;
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("jb.H(" + i + ','
                                + (class21 != null ? "{...}"
                                : "null")
                                + ','
                                + (class21_23_ != null ? "{...}"
                                : "null")
                                + ')'));
            }
            break;
        } while (false);
    }

    public abstract void method1110(int i, int i_24_, int i_25_);

    public static void method1111(int i, boolean bool, int i_26_, int i_27_,
                                  int i_28_) {
        Class34.method416(-i_26_ + i_27_, (byte) -17, i,
                Class68_Sub22.anIntArrayArray3132[i_28_],
                i_26_ + i_27_);
        anInt4304++;
        int i_29_ = -i_26_;
        int i_30_ = 0;
        if (bool == true) {
            int i_31_ = i_26_;
            int i_32_ = -1;
            while ((i_31_ ^ 0xffffffff) < (i_30_ ^ 0xffffffff)) {
                i_32_ += 2;
                i_30_++;
                i_29_ += i_32_;
                if (i_29_ >= 0) {
                    i_31_--;
                    i_29_ -= i_31_ << -268852863;
                    int[] is
                            = Class68_Sub22.anIntArrayArray3132[i_28_ - i_31_];
                    int[] is_33_
                            = Class68_Sub22.anIntArrayArray3132[i_31_ + i_28_];
                    int i_34_ = i_30_ + i_27_;
                    int i_35_ = i_27_ + -i_30_;
                    Class34.method416(i_35_, (byte) -17, i, is_33_, i_34_);
                    Class34.method416(i_35_, (byte) -17, i, is, i_34_);
                }
                int i_36_ = -i_31_ + i_27_;
                int[] is = Class68_Sub22.anIntArrayArray3132[i_28_ + -i_30_];
                int i_37_ = i_27_ + i_31_;
                int[] is_38_
                        = Class68_Sub22.anIntArrayArray3132[i_28_ + i_30_];
                Class34.method416(i_36_, (byte) -17, i, is_38_, i_37_);
                Class34.method416(i_36_, (byte) -17, i, is, i_37_);
            }
        }
    }

    public abstract void method1112(int i, int i_39_, int i_40_, int i_41_);

    public abstract void method1113(int i, int i_42_, int i_43_, int i_44_);

    public static int method1114(int i, byte i_45_, Random random) {
        anInt4316++;
        if ((i ^ 0xffffffff) >= -1)
            throw new IllegalArgumentException();
        if (i_45_ != 70)
            aClass124_4318 = null;
        if (Class21_Sub1.method367(i, -1))
            return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
                    >> -1825954720);
        int i_46_ = -2147483648 - (int) (4294967296L % (long) i);
        int i_47_;
        do
            i_47_ = random.nextInt();
        while (i_47_ >= i_46_);
        return Class75_Sub1_Sub1.method1394((byte) 20, i_47_, i);
    }

    public static void method1115(boolean bool, SignLink class55) {
        anInt4302++;
        Class2 class2 = null;
        try {
            JagSocket class31 = class55.method568(bool, "runescape");
            while (class31.anInt555 == 0)
                Class50.method528(-5, 1L);
            if (class31.anInt555 == 1) {
                class2 = (Class2) class31.playerDefSocket;
                Stream class68_sub14 = Class94.method1543(0);
                class2.method176(0, class68_sub14.buffer, 18405,
                        class68_sub14.currentOffset);
            }
        } catch (Exception exception) {
            /* empty */
        }
        do {
            try {
                if (class2 == null)
                    break;
                class2.method175(-8143);
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    public static void method1116(byte i) {
        aClass124_4318 = null;
        aRSString_4317 = null;
        if (i >= -97)
            method1111(-12, true, 107, 127, -107);
        aRSString_4320 = null;
        aClass16_4314 = null;
    }

    static {
        aClass16_4314 = new Class16();
        aRSString_4320 = RSString.newRsString("W-=hlen Sie eine Welt");
    }
}
