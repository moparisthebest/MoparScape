/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95 {
    public static int anInt1679;
    public static Stream aStream_1680;
    public static int anInt1681;
    public static int anInt1682;
    public static int[] anIntArray1683 = new int[1000];
    public static int anInt1684 = 0;
    public int anInt1685;
    public static int anInt1686;
    public static int anInt1687;
    public int[][] anIntArrayArray1688;
    public static int anInt1689;
    public int anInt1690;
    public static RSString aRSString_1691 = RSString.newRsString("0(U");
    public static int anInt1692;

    public static void method1545(int i) {
        aRSString_1691 = null;
        aStream_1680 = null;
        if (i != -26412)
            aRSString_1691 = null;
        anIntArray1683 = null;
    }

    public byte[] method1546(byte i, byte[] is) {
        if (anIntArrayArray1688 != null) {
            int i_0_ = ((int) ((long) is.length * (long) anInt1685
                    / (long) anInt1690)
                    + 14);
            int[] is_1_ = new int[i_0_];
            int i_2_ = 0;
            int i_3_ = 0;
            for (int i_4_ = 0; is.length > i_4_; i_4_++) {
                int i_5_ = is[i_4_];
                int[] is_6_ = anIntArrayArray1688[i_2_];
                for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -15; i_7_++)
                    is_1_[i_7_ + i_3_] += is_6_[i_7_] * i_5_;
                i_2_ += anInt1685;
                int i_8_ = i_2_ / anInt1690;
                i_2_ -= anInt1690 * i_8_;
                i_3_ += i_8_;
            }
            is = new byte[i_0_];
            for (int i_9_ = 0; (i_0_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
                 i_9_++) {
                int i_10_ = 32768 + is_1_[i_9_] >> -1654271568;
                if ((i_10_ ^ 0xffffffff) > 127)
                    is[i_9_] = (byte) -128;
                else if (i_10_ <= 127)
                    is[i_9_] = (byte) i_10_;
                else
                    is[i_9_] = (byte) 127;
            }
        }
        anInt1689++;
        if (i >= -118)
            method1552(-122, (byte) -69);
        return is;
    }

    public int method1547(int i, int i_11_) {
        if (anIntArrayArray1688 != null)
            i = (int) ((long) anInt1685 * (long) i / (long) anInt1690);
        if (i_11_ > -75)
            method1552(98, (byte) 124);
        anInt1682++;
        return i;
    }

    public static Class45 method1548(Class45 class45, byte i) {
        anInt1679++;
        Class45 class45_12_ = client.method36(class45);
        if (class45_12_ == null)
            class45_12_ = class45.aClass45_893;
        if (i != 3)
            return null;
        return class45_12_;
    }

    public static void method1549(Class69 class69) {
        for (int i = class69.anInt1254; i <= class69.anInt1238; i++) {
            for (int i_13_ = class69.anInt1253; i_13_ <= class69.anInt1234;
                 i_13_++) {
                Class68_Sub1 class68_sub1
                        = (Class22.aClass68_Sub1ArrayArrayArray484
                        [class69.anInt1249][i][i_13_]);
                if (class68_sub1 != null) {
                    for (int i_14_ = 0; i_14_ < class68_sub1.anInt2771;
                         i_14_++) {
                        if (class68_sub1.aClass69Array2772[i_14_] == class69) {
                            class68_sub1.anInt2771--;
                            for (int i_15_ = i_14_;
                                 i_15_ < class68_sub1.anInt2771; i_15_++) {
                                class68_sub1.aClass69Array2772[i_15_]
                                        = (class68_sub1.aClass69Array2772
                                        [i_15_ + 1]);
                                class68_sub1.anIntArray2766[i_15_]
                                        = class68_sub1.anIntArray2766[i_15_ + 1];
                            }
                            class68_sub1.aClass69Array2772[(class68_sub1
                                    .anInt2771)]
                                    = null;
                            break;
                        }
                    }
                    class68_sub1.anInt2768 = 0;
                    for (int i_16_ = 0; i_16_ < class68_sub1.anInt2771;
                         i_16_++)
                        class68_sub1.anInt2768
                                |= class68_sub1.anIntArray2766[i_16_];
                }
            }
        }
    }

    public Class95(int i, int i_17_) {
        if (i_17_ != i) {
            int i_18_ = Class116.method1708(i_17_, (byte) -124, i);
            i_17_ /= i_18_;
            anInt1685 = i_17_;
            i /= i_18_;
            anIntArrayArray1688 = new int[i][14];
            anInt1690 = i;
            for (int i_19_ = 0; (i ^ 0xffffffff) < (i_19_ ^ 0xffffffff);
                 i_19_++) {
                double d = (double) i_19_ / (double) i + 6.0;
                int[] is = anIntArrayArray1688[i_19_];
                int i_20_ = (int) Math.floor(-7.0 + d + 1.0);
                if ((i_20_ ^ 0xffffffff) > -1)
                    i_20_ = 0;
                double d_21_ = (double) i_17_ / (double) i;
                int i_22_ = (int) Math.ceil(7.0 + d);
                if (i_22_ > 14)
                    i_22_ = 14;
                for (/**/; i_22_ > i_20_; i_20_++) {
                    double d_23_ = d_21_;
                    double d_24_ = (-d + (double) i_20_) * 3.141592653589793;
                    if (d_24_ < -1.0E-4 || d_24_ > 1.0E-4)
                        d_23_ *= Math.sin(d_24_) / d_24_;
                    d_23_ *= 0.54 + 0.46 * Math.cos(((double) i_20_ - d)
                            * 0.2243994752564138);
                    is[i_20_] = (int) Math.floor(0.5 + 65536.0 * d_23_);
                }
            }
        }
    }

    public static void method1550(int i, int i_25_, int i_26_, int i_27_,
                                  Class1_Sub6 class1_sub6, int i_28_,
                                  int i_29_) {
        Class67.method641(i_25_, i_26_, i_28_, class1_sub6.anInt2537, i_29_,
                i_27_, class1_sub6.anInt2561, (byte) -127);
        anInt1687++;
        if (i < 16)
            method1548(null, (byte) 64);
    }

    public static void method1551(byte i) {
        Class75_Sub3_Sub1.anInt4595 = 0;
        Class68_Sub20_Sub16.anInt4418 = 0;
        anInt1686++;
        Class68_Sub20_Sub6.method1067(-19342);
        Class68_Sub13_Sub11.method749((byte) 70);
        Class68_Sub13_Sub20.method802(-92);
        Class16.method287(0);
        for (int i_30_ = 0; Class75_Sub3_Sub1.anInt4595 > i_30_; i_30_++) {
            int i_31_ = Class68_Sub13_Sub14.anIntArray3666[i_30_];
            if (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_31_].anInt2575 != Class68_Sub3.anInt2812) {
                if ((Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_31_].anInt3427) > 0)
                    Class113.method1681(-1, (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_31_]));
                Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_31_] = null;
            }
        }
        if (Class68_Sub13_Sub8.inStream.currentOffset != Class106.anInt1804)
            throw new RuntimeException("gpp1 pos:" + (Class68_Sub13_Sub8.inStream.currentOffset) + " psize:" + Class106.anInt1804);
        int i_32_ = 0;
        if (i >= -68)
            method1551((byte) -52);
        for (/**/; client.anInt2382 > i_32_; i_32_++) {
            if ((Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[Class85.anIntArray1563[i_32_]]) == null)
                throw new RuntimeException("gpp2 pos:" + i_32_ + " size:" + client.anInt2382);
        }
    }

    public int method1552(int i, byte i_33_) {
        if (i_33_ != 127)
            return -26;
        if (anIntArrayArray1688 != null)
            i = (int) ((long) anInt1685 * (long) i / (long) anInt1690) + 6;
        anInt1692++;
        return i;
    }

    static {
        aStream_1680 = new Stream(new byte[5000]);
    }
}
