/* Class68_Sub13_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub32 extends Class68_Sub13 {
    public static int anInt3978 = 0;
    public static int anInt3979;
    public static int anInt3980;
    public static int anInt3981 = -1;
    public static RSString aRSString_3982 = RSString.newRsString("null");
    public static int anInt3983;
    public static int anInt3984;
    public Class13[] aClass13Array3985;
    public static int anInt3986;

    public int[][] method697(int i, boolean bool) {
        anInt3983++;
        if (bool != true)
            method698((byte) -45, 77);
        int[][] is = aClass88_2939.method1496(i, (byte) 89);
        if (aClass88_2939.aBoolean1610) {
            int i_0_ = Class68_Sub13_Sub19.anInt3746;
            int i_1_ = Class68_Sub1.anInt2775;
            int[][] is_2_ = new int[i_1_][i_0_];
            int[][][] is_3_ = aClass88_2939.method1497((byte) 123);
            method863(is_2_, 23891);
            for (int i_4_ = 0;
                 (Class68_Sub1.anInt2775 ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
                 i_4_++) {
                int[] is_5_ = is_2_[i_4_];
                int[][] is_6_ = is_3_[i_4_];
                int[] is_7_ = is_6_[0];
                int[] is_8_ = is_6_[1];
                int[] is_9_ = is_6_[2];
                for (int i_10_ = 0; i_10_ < Class68_Sub13_Sub19.anInt3746;
                     i_10_++) {
                    int i_11_ = is_5_[i_10_];
                    is_9_[i_10_]
                            = Class120.method1740(i_11_ << -741736188, 4080);
                    is_8_[i_10_]
                            = Class120.method1740(65280, i_11_) >> -739883420;
                    is_7_[i_10_]
                            = Class120.method1740(i_11_ >> -1987974356, 4080);
                }
            }
        }
        return is;
    }

    public void method700(Stream class68_sub14, int i, int i_12_) {
        anInt3986++;
        if ((i ^ 0xffffffff) == i_12_) {
            aClass13Array3985 = new Class13[class68_sub14.readUnsignedByte(-6677)];
            while_156_:
            for (int i_13_ = 0; aClass13Array3985.length > i_13_; i_13_++) {
                int i_14_ = class68_sub14.readUnsignedByte(-6677);
                int i_15_ = i_14_;
                while_154_:
                do {
                    do {
                        if (i_15_ != 0) {
                            if ((i_15_ ^ 0xffffffff) != -2) {
                                if (i_15_ != 2) {
                                    if (i_15_ != 3)
                                        continue while_156_;
                                } else
                                    break;
                                break while_154_;
                            }
                        } else {
                            aClass13Array3985[i_13_]
                                    = Class76.method1405(3, class68_sub14);
                            continue while_156_;
                        }
                        aClass13Array3985[i_13_]
                                = Class68_Sub20_Sub18.method1187((byte) 116,
                                class68_sub14);
                        continue while_156_;
                    } while (false);
                    aClass13Array3985[i_13_]
                            = Class68_Sub16.method984((byte) 121, class68_sub14);
                    continue while_156_;
                } while (false);
                aClass13Array3985[i_13_]
                        = RSString.method1598(-20084, class68_sub14);
            }
        } else if ((i ^ 0xffffffff) == -2)
            aBoolean2931 = class68_sub14.readUnsignedByte(-6677) == 1;
    }

    public Class68_Sub13_Sub32() {
        super(0, true);
    }

    public static void method862(int i) {
        aRSString_3982 = null;
        if (i > -62)
            method862(-27);
    }

    public void method863(int[][] is, int i) {
        anInt3979++;
        int i_16_ = Class68_Sub13_Sub19.anInt3746;
        if (i == 23891) {
            int i_17_ = Class68_Sub1.anInt2775;
            Class119.method1733(128, is);
            Class68_Sub28_Sub1.method1241(Class1_Sub6_Sub2.anInt3432, 0, 0,
                    20685, Class30.anInt543);
            if (aClass13Array3985 != null) {
                for (int i_18_ = 0;
                     ((i_18_ ^ 0xffffffff)
                             > (aClass13Array3985.length ^ 0xffffffff));
                     i_18_++) {
                    Class13 class13 = aClass13Array3985[i_18_];
                    int i_19_ = class13.anInt220;
                    int i_20_ = class13.anInt216;
                    if ((i_20_ ^ 0xffffffff) > -1) {
                        if (i_19_ >= 0)
                            class13.method245(true, i_16_, i_17_);
                    } else if (i_19_ < 0)
                        class13.method244(i_17_, 103, i_16_);
                    else
                        class13.method243(i_16_, 23700, i_17_);
                }
            }
        }
    }

    public static void method864(int i) {
        if (i == 0) {
            anInt3984++;
            for (Class68_Sub2 class68_sub2
                         = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3963
                    .method293((byte) 76);
                 class68_sub2 != null;
                 class68_sub2
                         = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3963
                         .method290((byte) 104)) {
                if (class68_sub2.anInt2795 > 0)
                    class68_sub2.anInt2795--;
                if ((class68_sub2.anInt2795 ^ 0xffffffff) != -1) {
                    if (class68_sub2.anInt2794 > 0)
                        class68_sub2.anInt2794--;
                    if ((class68_sub2.anInt2794 ^ 0xffffffff) == -1
                            && class68_sub2.anInt2791 >= 1
                            && class68_sub2.anInt2784 >= 1
                            && class68_sub2.anInt2791 <= 102
                            && (class68_sub2.anInt2784 ^ 0xffffffff) >= -103
                            && ((class68_sub2.anInt2797 ^ 0xffffffff) > -1
                            || Class122.method1748(class68_sub2.anInt2797,
                            class68_sub2.anInt2790,
                            28446))) {
                        GroundData.method450(i, class68_sub2.anInt2786,
                                class68_sub2.anInt2797,
                                class68_sub2.anInt2791,
                                class68_sub2.anInt2789,
                                class68_sub2.anInt2790,
                                class68_sub2.anInt2787,
                                class68_sub2.anInt2784);
                        class68_sub2.anInt2794 = -1;
                        if (((class68_sub2.anInt2788 ^ 0xffffffff)
                                == (class68_sub2.anInt2797 ^ 0xffffffff))
                                && class68_sub2.anInt2788 == -1)
                            class68_sub2.method647(-17554);
                        else if (((class68_sub2.anInt2788 ^ 0xffffffff)
                                == (class68_sub2.anInt2797 ^ 0xffffffff))
                                && (class68_sub2.anInt2793
                                == class68_sub2.anInt2787)
                                && ((class68_sub2.anInt2783 ^ 0xffffffff)
                                == (class68_sub2.anInt2790 ^ 0xffffffff)))
                            class68_sub2.method647(-17554);
                    }
                } else if (class68_sub2.anInt2788 < 0
                        || Class122.method1748(class68_sub2.anInt2788,
                        class68_sub2.anInt2783,
                        28446)) {
                    GroundData.method450(0, class68_sub2.anInt2786,
                            class68_sub2.anInt2788,
                            class68_sub2.anInt2791,
                            class68_sub2.anInt2789,
                            class68_sub2.anInt2783,
                            class68_sub2.anInt2793,
                            class68_sub2.anInt2784);
                    class68_sub2.method647(-17554);
                }
            }
        }
    }

    public int[] method698(byte i, int i_21_) {
        if (i != -61)
            aRSString_3982 = null;
        anInt3980++;
        int[] is = aClass115_2936.method1697(false, i_21_);
        if (aClass115_2936.aBoolean1957)
            method863(aClass115_2936.method1696(i ^ 0x7d17), 23891);
        return is;
    }
}
