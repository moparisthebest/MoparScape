/* Class68_Sub20_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub15 extends Class68_Sub20 {
    public static int anInt4388;
    public static long[] aLongArray4389 = new long[1000];
    public static RSString aRSString_4390
            = RSString.newRsString("showingVideoAd");
    public byte aByte4391;
    public int anInt4392;
    public static RSString aRSString_4393;
    public Class21_Sub1 aClass21_Sub1_4394;
    public static int anInt4395;
    public static RSString aRSString_4396
            = RSString.newRsString(":duelfriend:");
    public static int anInt4397;
    public static int anInt4398;
    public static int anInt4399 = 127;
    public static int anInt4400 = -1;
    public static int anInt4401;
    public static int anInt4402;
    public static int anInt4403;
    public static int anInt4404;
    public static int anInt4405;

    public static void method1168(byte i) {
        aRSString_4396 = null;
        aRSString_4390 = null;
        aLongArray4389 = null;
        if (i != -63)
            method1168((byte) -1);
        aRSString_4393 = null;
    }

    public static void method1169(int i, int i_0_, int i_1_, int i_2_,
                                  int i_3_, int i_4_, int i_5_, byte i_6_) {
        anInt4395++;
        if ((i_3_ ^ 0xffffffff) == (i_0_ ^ 0xffffffff))
            Class3.method179(i_5_, i_1_, i_4_, i_0_, i_2_, 73, i);
        else {
            if ((GroundData.anInt677 ^ 0xffffffff) >= (-i_0_ + i_1_ ^ 0xffffffff)
                    && Class113.anInt1918 >= i_0_ + i_1_
                    && i_2_ - i_3_ >= Class35.anInt605
                    && (i_3_ + i_2_ ^ 0xffffffff) >= (Class51.anInt2255
                    ^ 0xffffffff))
                Class21_Sub1.method369(i_4_, i_3_, i_5_, i_1_, i, i_0_,
                        (byte) -111, i_2_);
            else
                Class13.method241(i, i_0_, i_2_, i_3_, i_5_, i_1_, i_4_,
                        -1832820639);
            if (i_6_ != -12)
                aRSString_4396 = null;
        }
    }

    public static Class45 method1170(int i, byte i_7_) {
        if (i_7_ != -80)
            aRSString_4396 = null;
        anInt4401++;
        int i_8_ = i & 0xffff;
        int i_9_ = i >> -1432122384;
        if (Class68_Sub13_Sub36.aClass45ArrayArray4040[i_9_] == null
                || (Class68_Sub13_Sub36.aClass45ArrayArray4040[i_9_][i_8_]
                == null)) {
            boolean bool = Class68_Sub13_Sub25.method824(i_9_, (byte) -2);
            if (!bool)
                return null;
        }
        return Class68_Sub13_Sub36.aClass45ArrayArray4040[i_9_][i_8_];
    }

    public static int method1171(int i, int i_10_, byte i_11_, int i_12_) {
        if (i_11_ != 114)
            anInt4400 = 105;
        anInt4404++;
        if ((i ^ 0xffffffff) > (i_12_ ^ 0xffffffff))
            return i_12_;
        if ((i ^ 0xffffffff) >= (i_10_ ^ 0xffffffff))
            return i;
        return i_10_;
    }

    static {
        anInt4397 = 0;
        aRSString_4393 = RSString.newRsString("underlay");
    }
}
