/* Class68_Sub13_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub29 extends Class68_Sub13 {
    public static RSString aRSString_3930;
    public static int anInt3931;
    public static RSString aRSString_3932;
    public static int anInt3933;
    public static RSString aRSString_3934
            = RSString.newRsString("<col=00ff80>");
    public static int[] anIntArray3935;
    public static RSString aRSString_3936
            = RSString.newRsString("mapfunction");
    public int anInt3937 = 4;
    public static int anInt3938;
    public static RSString aRSString_3939;
    public static RSString aRSString_3940;
    public static boolean[] aBooleanArray3941;
    public static int[] anIntArray3942;
    public int anInt3943 = 4;

    public Class68_Sub13_Sub29() {
        super(1, false);
    }

    public int[][] method697(int i, boolean bool) {
        if (bool != true)
            method700(null, 104, 10);
        anInt3938++;
        int[][] is = aClass88_2939.method1496(i, (byte) 85);
        if (aClass88_2939.aBoolean1610) {
            int i_0_ = Class68_Sub1.anInt2775 / anInt3937;
            int i_1_ = Class68_Sub13_Sub19.anInt3746 / anInt3943;
            int[][] is_2_;
            if (i_0_ > 0) {
                int i_3_ = i % i_0_;
                is_2_ = this.method699(-93, 0,
                        Class68_Sub1.anInt2775 * i_3_ / i_0_);
            } else
                is_2_ = this.method699(-24, 0, 0);
            int[] is_4_ = is_2_[0];
            int[] is_5_ = is_2_[1];
            int[] is_6_ = is[1];
            int[] is_7_ = is[0];
            int[] is_8_ = is_2_[2];
            int[] is_9_ = is[2];
            for (int i_10_ = 0;
                 ((i_10_ ^ 0xffffffff)
                         > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                 i_10_++) {
                int i_11_;
                if ((i_1_ ^ 0xffffffff) < -1) {
                    int i_12_ = i_10_ % i_1_;
                    i_11_ = Class68_Sub13_Sub19.anInt3746 * i_12_ / i_1_;
                } else
                    i_11_ = 0;
                is_7_[i_10_] = is_4_[i_11_];
                is_6_[i_10_] = is_5_[i_11_];
                is_9_[i_10_] = is_8_[i_11_];
            }
        }
        return is;
    }

    public int[] method698(byte i, int i_13_) {
        anInt3931++;
        int[] is = aClass115_2936.method1697(false, i_13_);
        if (aClass115_2936.aBoolean1957) {
            int i_14_ = Class68_Sub1.anInt2775 / anInt3937;
            int i_15_ = Class68_Sub13_Sub19.anInt3746 / anInt3943;
            int[] is_16_;
            if (i_14_ <= 0)
                is_16_ = this.method696(0, 0, 29149);
            else {
                int i_17_ = i_13_ % i_14_;
                is_16_
                        = this.method696(0, Class68_Sub1.anInt2775 * i_17_ / i_14_,
                        29149);
            }
            for (int i_18_ = 0;
                 ((i_18_ ^ 0xffffffff)
                         > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                 i_18_++) {
                if ((i_15_ ^ 0xffffffff) >= -1)
                    is[i_18_] = is_16_[0];
                else {
                    int i_19_ = i_18_ % i_15_;
                    is[i_18_] = is_16_[(Class68_Sub13_Sub19.anInt3746 * i_19_
                            / i_15_)];
                }
            }
        }
        if (i != -61)
            method849(57);
        return is;
    }

    public static void method849(int i) {
        aRSString_3932 = null;
        aRSString_3940 = null;
        aRSString_3934 = null;
        anIntArray3935 = null;
        aRSString_3939 = null;
        int i_20_ = -47 % ((49 - i) / 53);
        aRSString_3936 = null;
        aBooleanArray3941 = null;
        aRSString_3930 = null;
        anIntArray3942 = null;
    }

    public void method700(Stream class68_sub14, int i, int i_21_) {
        if (i_21_ != -1)
            method698((byte) 87, -105);
        anInt3933++;
        int i_22_ = i;
        do {
            if ((i_22_ ^ 0xffffffff) != -1) {
                if (i_22_ != 1)
                    break;
            } else {
                anInt3943 = class68_sub14.readUnsignedByte(i_21_ ^ 0x1a14);
                break;
            }
            anInt3937 = class68_sub14.readUnsignedByte(-6677);
        } while (false);
    }

    static {
        aRSString_3932 = RSString.newRsString("Loaded fonts");
        aRSString_3930 = RSString.newRsString("Loaded wordpack");
        aRSString_3939 = aRSString_3930;
        aRSString_3940 = aRSString_3932;
        aBooleanArray3941 = new boolean[200];
        anIntArray3935 = new int[5];
    }
}
