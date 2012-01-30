/* Class68_Sub13_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub30 extends Class68_Sub13 {
    public static int anInt3944;
    public int anInt3945 = 4096;
    public static int anInt3946;
    public static Class21renamed aClass21_3947;
    public static int anInt3948 = 0;
    public static int anInt3949;
    public static int anInt3950;
    public int anInt3951 = 4096;
    public int anInt3952 = 4096;
    public static Class21_Sub1 aClass21_Sub1_3953;
    public static int anInt3954;

    public static void method850(int i, byte i_0_, int i_1_, int i_2_,
                                 int i_3_) {
        if (i_0_ == -34) {
            for (Class68_Sub18 class68_sub18
                         = ((Class68_Sub18)
                    Class8.aClass16_140.method293((byte) 76));
                 class68_sub18 != null;
                 class68_sub18 = ((Class68_Sub18)
                         Class8.aClass16_140.method290((byte) -127)))
                Class68_Sub13_Sub31.method859(93, i_1_, i_2_, i, class68_sub18,
                        i_3_);
            for (Class68_Sub18 class68_sub18
                         = ((Class68_Sub18)
                    Class51.aClass16_2251.method293((byte) 76));
                 class68_sub18 != null;
                 class68_sub18 = (Class68_Sub18) Class51.aClass16_2251
                         .method290((byte) -125)) {
                int i_4_ = 1;
                if ((class68_sub18.aClass1_Sub6_Sub1_3060.anInt2524
                        ^ 0xffffffff)
                        != (class68_sub18.aClass1_Sub6_Sub1_3060.anInt2530
                        ^ 0xffffffff)) {
                    if (class68_sub18.aClass1_Sub6_Sub1_3060.anInt2540
                            == class68_sub18.aClass1_Sub6_Sub1_3060.anInt2524)
                        i_4_ = 2;
                } else
                    i_4_ = 0;
                if (i_4_ != class68_sub18.anInt3047) {
                    int i_5_ = Class72.method1349((class68_sub18
                            .aClass1_Sub6_Sub1_3060),
                            false);
                    if ((class68_sub18.anInt3042 ^ 0xffffffff)
                            != (i_5_ ^ 0xffffffff)) {
                        if (class68_sub18.aClass68_Sub28_Sub3_3040 != null) {
                            Class80.aClass68_Sub28_Sub4_1418.method1314
                                    (class68_sub18.aClass68_Sub28_Sub3_3040);
                            class68_sub18.aClass68_Sub28_Sub3_3040 = null;
                        }
                        class68_sub18.anInt3042 = i_5_;
                    }
                    class68_sub18.anInt3047 = i_4_;
                }
                class68_sub18.anInt3064
                        = class68_sub18.aClass1_Sub6_Sub1_3060.anInt2561;
                class68_sub18.anInt3038
                        = (class68_sub18.aClass1_Sub6_Sub1_3060.anInt2544 * 64
                        + class68_sub18.aClass1_Sub6_Sub1_3060.anInt2537);
                class68_sub18.anInt3051
                        = class68_sub18.aClass1_Sub6_Sub1_3060.anInt2537;
                class68_sub18.anInt3062
                        = (class68_sub18.aClass1_Sub6_Sub1_3060.anInt2561
                        + 64 * class68_sub18.aClass1_Sub6_Sub1_3060.anInt2544);
                Class68_Sub13_Sub31.method859(i_0_ ^ ~0x4d, i_1_, i_2_, i,
                        class68_sub18, i_3_);
            }
            anInt3944++;
            for (Class68_Sub18 class68_sub18
                         = ((Class68_Sub18)
                    Class1_Sub5.aClass113_2509.method1679(-32642));
                 class68_sub18 != null;
                 class68_sub18
                         = ((Class68_Sub18)
                         Class1_Sub5.aClass113_2509.method1683((byte) -102))) {
                int i_6_ = 1;
                if (class68_sub18.aClass1_Sub6_Sub2_3050.anInt2530
                        == class68_sub18.aClass1_Sub6_Sub2_3050.anInt2524)
                    i_6_ = 0;
                else if (class68_sub18.aClass1_Sub6_Sub2_3050.anInt2540
                        == class68_sub18.aClass1_Sub6_Sub2_3050.anInt2524)
                    i_6_ = 2;
                if ((class68_sub18.anInt3047 ^ 0xffffffff)
                        != (i_6_ ^ 0xffffffff)) {
                    int i_7_ = Applet_Sub1.method32((class68_sub18
                            .aClass1_Sub6_Sub2_3050),
                            -6694);
                    if ((i_7_ ^ 0xffffffff)
                            != (class68_sub18.anInt3042 ^ 0xffffffff)) {
                        if (class68_sub18.aClass68_Sub28_Sub3_3040 != null) {
                            Class80.aClass68_Sub28_Sub4_1418.method1314
                                    (class68_sub18.aClass68_Sub28_Sub3_3040);
                            class68_sub18.aClass68_Sub28_Sub3_3040 = null;
                        }
                        class68_sub18.anInt3042 = i_7_;
                    }
                    class68_sub18.anInt3047 = i_6_;
                }
                class68_sub18.anInt3051
                        = class68_sub18.aClass1_Sub6_Sub2_3050.anInt2537;
                class68_sub18.anInt3064
                        = class68_sub18.aClass1_Sub6_Sub2_3050.anInt2561;
                class68_sub18.anInt3038
                        = (class68_sub18.aClass1_Sub6_Sub2_3050.anInt2537
                        - -(class68_sub18.aClass1_Sub6_Sub2_3050.anInt2544
                        * 64));
                class68_sub18.anInt3062
                        = (class68_sub18.aClass1_Sub6_Sub2_3050.anInt2561
                        - -(64
                        * class68_sub18.aClass1_Sub6_Sub2_3050.anInt2544));
                Class68_Sub13_Sub31.method859(112, i_1_, i_2_, i,
                        class68_sub18, i_3_);
            }
        }
    }

    public static void method851(int i, int i_8_) {
        Login.anIntArray1510 = new int[i_8_];
        Class7.anIntArray134 = new int[i_8_];
        if (i >= -46)
            anInt3948 = -119;
        PlayerDefinition.anIntArray2180 = new int[i_8_];
        Class68_Sub20_Sub16.anIntArray4408 = new int[i_8_];
        Class21_Sub1.anIntArray2693 = new int[i_8_];
        anInt3946++;
    }

    public int[][] method697(int i, boolean bool) {
        anInt3950++;
        if (bool != true)
            return null;
        int[][] is = aClass88_2939.method1496(i, (byte) -122);
        if (aClass88_2939.aBoolean1610) {
            int[][] is_9_ = this.method699(-107, 0, i);
            int[] is_10_ = is_9_[0];
            int[] is_11_ = is_9_[1];
            int[] is_12_ = is_9_[2];
            int[] is_13_ = is[1];
            int[] is_14_ = is[2];
            int[] is_15_ = is[0];
            for (int i_16_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_16_ ^ 0xffffffff)); i_16_++) {
                int i_17_ = is_12_[i_16_];
                int i_18_ = is_11_[i_16_];
                int i_19_ = is_10_[i_16_];
                if (i_17_ == i_19_ && i_18_ == i_17_) {
                    is_15_[i_16_] = i_19_ * anInt3945 >> -311107764;
                    is_13_[i_16_] = i_17_ * anInt3952 >> 620264780;
                    is_14_[i_16_] = anInt3951 * i_18_ >> 1212671948;
                } else {
                    is_15_[i_16_] = anInt3945;
                    is_13_[i_16_] = anInt3952;
                    is_14_[i_16_] = anInt3951;
                }
            }
        }
        return is;
    }

    public static Class68_Sub20_Sub17 method852(int i, boolean bool,
                                                Class21renamed class21, int i_20_,
                                                Class21renamed class21_21_) {
        try {
            anInt3949++;
            boolean bool_22_ = true;
            int[] is = class21_21_.method345(false, i_20_);
            if (i > -31)
                aClass21_Sub1_3953 = null;
            for (int i_23_ = 0;
                 (i_23_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_23_++) {
                byte[] is_24_ = class21_21_.method343(is[i_23_], 14281, i_20_);
                if (is_24_ == null)
                    bool_22_ = false;
                else {
                    int i_25_
                            = is_24_[1] & 0xff | (0xff & is_24_[0]) << 707067688;
                    byte[] is_26_;
                    if (bool)
                        is_26_ = class21.method343(i_25_, 14281, 0);
                    else
                        is_26_ = class21.method343(0, 14281, i_25_);
                    if (is_26_ == null)
                        bool_22_ = false;
                }
            }
            if (!bool_22_)
                return null;
            try {
                return new Class68_Sub20_Sub17(class21_21_, class21, i_20_,
                        bool);
            } catch (Exception exception) {
                return null;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("sa.D(" + i + ',' + bool + ','
                            + (class21 != null ? "{...}" : "null")
                            + ',' + i_20_ + ','
                            + (class21_21_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public static void method853(int i) {
        aClass21_Sub1_3953 = null;
        int i_27_ = 89 / ((i - 55) / 54);
        aClass21_3947 = null;
    }

    public Class68_Sub13_Sub30() {
        super(1, false);
    }

    public void method700(Stream class68_sub14, int i, int i_28_) {
        anInt3954++;
        int i_29_ = i;
        while_145_:
        do {
            do {
                if (i_29_ != 0) {
                    if (i_29_ != 1) {
                        if (i_29_ == 2)
                            break;
                        break while_145_;
                    }
                } else {
                    anInt3945 = class68_sub14.readUnsignedWord(1355769544);
                    break while_145_;
                }
                anInt3952 = class68_sub14.readUnsignedWord(i_28_ + 1355769545);
                break while_145_;
            } while (false);
            anInt3951 = class68_sub14.readUnsignedWord(1355769544);
        } while (false);
        if (i_28_ != -1)
            method853(-105);
    }
}
