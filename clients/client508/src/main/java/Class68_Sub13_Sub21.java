/* Class68_Sub13_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub21 extends Class68_Sub13 {
    public static int anInt3785;
    public static int[] anIntArray3786;
    public static int anInt3787 = 0;
    public static Class91 aClass91_3788;
    public static int anInt3789;
    public static int anInt3790;
    public int anInt3791 = 4096;
    public static Class68_Sub6 aClass68_Sub6_3792;
    public static boolean aBoolean3793;
    public static int anInt3794;
    public static RSString aRSString_3795;
    public static volatile boolean aBoolean3796;
    public static int[] anIntArray3797;
    public static int anInt3798;
    public static RSString aRSString_3799;
    public static int anInt3800;
    public static Class68_Sub20_Sub1 aClass68_Sub20_Sub1_3801;
    public static long[] aLongArray3802;
    public static int anInt3803;
    public static Class21_Sub1 aClass21_Sub1_3804;

    public static int method805(int i, RSString class100) {
        anInt3794++;
        if (class100 == null)
            return -1;
        int i_0_ = 0;
        if (i != 31601)
            method807((byte) 66, 93, 122);
        for (/**/; (i_0_ ^ 0xffffffff) > (Class32.anInt573 ^ 0xffffffff);
                 i_0_++) {
            if (class100.method1600(false, (Class68_Sub13_Sub38
                    .aRSStringArray4084[i_0_])))
                return i_0_;
        }
        return -1;
    }

    public Class68_Sub13_Sub21() {
        super(1, true);
    }

    public static void method806(int i) {
        aRSString_3795 = null;
        anIntArray3786 = null;
        if (i > -65)
            method808(-106, 49, 57, 32, 5, 110, 104, -2, null, 88, true, 60L);
        aClass91_3788 = null;
        anIntArray3797 = null;
        aClass68_Sub20_Sub1_3801 = null;
        aClass21_Sub1_3804 = null;
        aRSString_3799 = null;
        aLongArray3802 = null;
        aClass68_Sub6_3792 = null;
    }

    public int[] method698(byte i, int i_1_) {
        int[] is = aClass115_2936.method1697(false, i_1_);
        anInt3798++;
        if (i != -61)
            aClass68_Sub6_3792 = null;
        if (aClass115_2936.aBoolean1957) {
            int[] is_2_
                    = this.method696(0, Class1_Sub6_Sub2.anInt3432 & i_1_ - 1,
                    29149);
            int[] is_3_ = this.method696(0, i_1_, 29149);
            int[] is_4_
                    = this.method696(0, Class1_Sub6_Sub2.anInt3432 & i_1_ + 1,
                    29149);
            for (int i_5_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_5_ ^ 0xffffffff)); i_5_++) {
                int i_6_ = ((-is_3_[Class30.anInt543 & -1 + i_5_]
                        + is_3_[Class30.anInt543 & i_5_ - -1])
                        * anInt3791);
                int i_7_ = anInt3791 * (-is_2_[i_5_] + is_4_[i_5_]);
                int i_8_ = i_7_ >> 1482857932;
                int i_9_ = i_8_ * i_8_ >> 142659340;
                int i_10_ = i_6_ >> -1944776724;
                int i_11_ = i_10_ * i_10_ >> 428458892;
                int i_12_
                        = (int) (Math.sqrt((double) ((float) (i_9_ + i_11_ - -4096)
                        / 4096.0F))
                        * 4096.0);
                int i_13_ = (i_12_ ^ 0xffffffff) == -1 ? 0 : 16777216 / i_12_;
                is[i_5_] = -i_13_ + 4096;
            }
        }
        return is;
    }

    public static int method807(byte i, int i_14_, int i_15_) {
        anInt3789++;
        int i_16_ = 0;
        int i_17_ = -40 % ((-47 - i) / 34);
        while ((i_15_ ^ 0xffffffff) < -1) {
            i_16_ = i_16_ << 2048908097 | 0x1 & i_14_;
            i_15_--;
            i_14_ >>>= 1;
        }
        return i_16_;
    }

    public void method700(Stream class68_sub14, int i, int i_18_) {
        if (i_18_ != -1)
            method807((byte) 95, 101, 33);
        anInt3800++;
        if (i == 0)
            anInt3791 = class68_sub14.readUnsignedWord(1355769544);
    }

    public static boolean method808(int i, int i_19_, int i_20_, int i_21_,
                                    int i_22_, int i_23_, int i_24_, int i_25_,
                                    Animable class1, int i_26_, boolean bool,
                                    long l) {
        boolean bool_27_ = (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                == Class68_Sub13_Sub14.anIntArrayArrayArray3671);
        int i_28_ = 0;
        for (int i_29_ = i_19_; i_29_ < i_19_ + i_21_; i_29_++) {
            for (int i_30_ = i_20_; i_30_ < i_20_ + i_22_; i_30_++) {
                if (i_29_ < 0 || i_30_ < 0 || i_29_ >= Applet_Sub1.anInt7
                        || i_30_ >= Class97.anInt1714)
                    return false;
                Class68_Sub1 class68_sub1
                        = Class22.aClass68_Sub1ArrayArrayArray484[i][i_29_][i_30_];
                if (class68_sub1 != null && class68_sub1.anInt2771 >= 5)
                    return false;
            }
        }
        Class69 class69 = new Class69();
        class69.aLong1243 = l;
        class69.anInt1249 = i;
        class69.anInt1262 = i_23_;
        class69.anInt1250 = i_24_;
        class69.anInt1252 = i_25_;
        class69.aClass1_1242 = class1;
        class69.anInt1255 = i_26_;
        class69.anInt1254 = i_19_;
        class69.anInt1253 = i_20_;
        class69.anInt1238 = i_19_ + i_21_ - 1;
        class69.anInt1234 = i_20_ + i_22_ - 1;
        for (int i_31_ = i_19_; i_31_ < i_19_ + i_21_; i_31_++) {
            for (int i_32_ = i_20_; i_32_ < i_20_ + i_22_; i_32_++) {
                int i_33_ = 0;
                if (i_31_ > i_19_)
                    i_33_++;
                if (i_31_ < i_19_ + i_21_ - 1)
                    i_33_ += 4;
                if (i_32_ > i_20_)
                    i_33_ += 8;
                if (i_32_ < i_20_ + i_22_ - 1)
                    i_33_ += 2;
                for (int i_34_ = i; i_34_ >= 0; i_34_--) {
                    if ((Class22.aClass68_Sub1ArrayArrayArray484[i_34_][i_31_]
                            [i_32_])
                            == null)
                        Class22.aClass68_Sub1ArrayArrayArray484[i_34_]
                                [i_31_][i_32_]
                                = new Class68_Sub1(i_34_, i_31_, i_32_);
                }
                Class68_Sub1 class68_sub1
                        = Class22.aClass68_Sub1ArrayArrayArray484[i][i_31_][i_32_];
                class68_sub1.aClass69Array2772[class68_sub1.anInt2771]
                        = class69;
                class68_sub1.anIntArray2766[class68_sub1.anInt2771] = i_33_;
                class68_sub1.anInt2768 |= i_33_;
                class68_sub1.anInt2771++;
                if (bool_27_
                        && Class1_Sub2.anIntArrayArray2430[i_31_][i_32_] != 0)
                    i_28_ = Class1_Sub2.anIntArrayArray2430[i_31_][i_32_];
            }
        }
        if (bool_27_ && i_28_ != 0) {
            for (int i_35_ = i_19_; i_35_ < i_19_ + i_21_; i_35_++) {
                for (int i_36_ = i_20_; i_36_ < i_20_ + i_22_; i_36_++) {
                    if (Class1_Sub2.anIntArrayArray2430[i_35_][i_36_] == 0)
                        Class1_Sub2.anIntArrayArray2430[i_35_][i_36_] = i_28_;
                }
            }
        }
        if (bool)
            Class68.aClass69Array1222[Class55.anInt2055++] = class69;
        return true;
    }

    public static void method809(int i, Class116 class116, int i_37_,
                                 byte i_38_, int i_39_) {
        anInt3790++;
        if (i_38_ == 18) {
            for (Class68_Sub18 class68_sub18
                         = ((Class68_Sub18)
                    Class8.aClass16_140.method293((byte) 76));
                 class68_sub18 != null;
                 class68_sub18 = ((Class68_Sub18)
                         Class8.aClass16_140.method290((byte) 109))) {
                if (i_37_ == class68_sub18.anInt3039
                        && (class68_sub18.anInt3064 ^ 0xffffffff) == (i_39_ * 128
                        ^ 0xffffffff)
                        && (class68_sub18.anInt3051 ^ 0xffffffff) == (128 * i
                        ^ 0xffffffff)
                        && ((class68_sub18.aClass116_3045.anInt2031 ^ 0xffffffff)
                        == (class116.anInt2031 ^ 0xffffffff))) {
                    if (class68_sub18.aClass68_Sub28_Sub3_3040 != null) {
                        Class80.aClass68_Sub28_Sub4_1418.method1314
                                (class68_sub18.aClass68_Sub28_Sub3_3040);
                        class68_sub18.aClass68_Sub28_Sub3_3040 = null;
                    }
                    if (class68_sub18.aClass68_Sub28_Sub3_3049 != null) {
                        Class80.aClass68_Sub28_Sub4_1418.method1314
                                (class68_sub18.aClass68_Sub28_Sub3_3049);
                        class68_sub18.aClass68_Sub28_Sub3_3049 = null;
                    }
                    class68_sub18.method647(i_38_ ^ ~0x4483);
                    break;
                }
            }
        }
    }

    static {
        anIntArray3786 = new int[]{12543016, 15504954, 15914854, 16773818};
        anIntArray3797 = new int[4096];
        aBoolean3796 = false;
        aRSString_3799
                = (RSString.newRsString
                (
                        "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3"));
        aRSString_3795 = aRSString_3799;
        aBoolean3793 = true;
        aClass68_Sub6_3792 = new Class68_Sub6(0, 0);
        aLongArray3802 = new long[200];
        anInt3803 = 0;
    }
}
