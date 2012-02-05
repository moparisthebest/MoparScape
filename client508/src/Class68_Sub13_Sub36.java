/* Class68_Sub13_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub36 extends Class68_Sub13 {
    public static int anInt4030;
    public int[][] anIntArrayArray4031;
    public static RSString aRSString_4032;
    public static int anInt4033;
    public static int anInt4034;
    public static Class35 aClass35_4035;
    public static int anInt4036;
    public static int anInt4037 = -1;
    public static int anInt4038;
    public static int[] anIntArray4039;
    public static Class45[][] aClass45ArrayArray4040;
    public static int anInt4041;
    public static int anInt4042;
    public int[] anIntArray4043 = new int[257];
    public static int[] anIntArray4044;
    public static int anInt4045;
    public static int anInt4046;
    public static int anInt4047;
    public static int anInt4048;
    public static RSString aRSString_4049;

    public void method690(byte i) {
        anInt4038++;
        if (i >= -22)
            method883(-65, 21, -105);
        if (anIntArrayArray4031 == null)
            method881(false, 1);
        method884(3);
    }

    public int[][] method697(int i, boolean bool) {
        if (bool != true)
            return null;
        anInt4045++;
        int[][] is = aClass88_2939.method1496(i, (byte) -122);
        if (aClass88_2939.aBoolean1610) {
            int[] is_0_ = this.method696(0, i, 29149);
            int[] is_1_ = is[0];
            int[] is_2_ = is[1];
            int[] is_3_ = is[2];
            for (int i_4_ = 0;
                 ((i_4_ ^ 0xffffffff)
                         > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                 i_4_++) {
                int i_5_ = is_0_[i_4_] >> -1685668220;
                if ((i_5_ ^ 0xffffffff) > -1)
                    i_5_ = 0;
                if (i_5_ > 256)
                    i_5_ = 256;
                i_5_ = anIntArray4043[i_5_];
                is_1_[i_4_]
                        = Class120.method1740(16711680, i_5_) >> -1778227924;
                is_2_[i_4_] = Class120.method1740(4080, i_5_ >> 602634276);
                is_3_[i_4_] = Class120.method1740(i_5_ << -45325180, 4080);
            }
        }
        return is;
    }

    public static boolean method880(int i, int i_6_, Class21renamed class21,
                                    int i_7_) {
        anInt4030++;
        byte[] is = class21.method338(i_7_, i ^ i, i_6_);
        if (is == null)
            return false;
        Class68_Sub13_Sub24.method818(i + 43813, is);
        return true;
    }

    public void method881(boolean bool, int i) {
        if (bool != false)
            aClass35_4035 = null;
        anInt4042++;
        if ((i ^ 0xffffffff) != -1) {
            int i_8_ = i;
            while_168_:
            do {
                while_167_:
                do {
                    while_166_:
                    do {
                        while_165_:
                        do {
                            do {
                                if (i_8_ != 1) {
                                    if ((i_8_ ^ 0xffffffff) != -3) {
                                        if ((i_8_ ^ 0xffffffff) != -4) {
                                            if ((i_8_ ^ 0xffffffff) != -5) {
                                                if ((i_8_ ^ 0xffffffff)
                                                        != -6) {
                                                    if ((i_8_ ^ 0xffffffff)
                                                            != -7)
                                                        break while_168_;
                                                } else
                                                    break while_166_;
                                                break while_167_;
                                            }
                                        } else
                                            break;
                                        break while_165_;
                                    }
                                } else {
                                    anIntArrayArray4031 = new int[2][4];
                                    anIntArrayArray4031[0][0] = 0;
                                    anIntArrayArray4031[0][2] = 0;
                                    anIntArrayArray4031[1][0] = 4096;
                                    anIntArrayArray4031[0][3] = 0;
                                    anIntArrayArray4031[1][3] = 4096;
                                    anIntArrayArray4031[1][2] = 4096;
                                    anIntArrayArray4031[0][1] = 0;
                                    anIntArrayArray4031[1][1] = 4096;
                                    return;
                                }
                                anIntArrayArray4031 = new int[8][4];
                                anIntArrayArray4031[0][3] = 2361;
                                anIntArrayArray4031[0][2] = 2602;
                                anIntArrayArray4031[0][0] = 0;
                                anIntArrayArray4031[0][1] = 2650;
                                anIntArrayArray4031[1][2] = 1799;
                                anIntArrayArray4031[1][0] = 2867;
                                anIntArrayArray4031[2][2] = 1734;
                                anIntArrayArray4031[3][2] = 1220;
                                anIntArrayArray4031[1][1] = 2313;
                                anIntArrayArray4031[1][3] = 1558;
                                anIntArrayArray4031[2][1] = 2618;
                                anIntArrayArray4031[4][2] = 963;
                                anIntArrayArray4031[3][1] = 2296;
                                anIntArrayArray4031[5][2] = 2152;
                                anIntArrayArray4031[6][2] = 1060;
                                anIntArrayArray4031[2][0] = 3072;
                                anIntArrayArray4031[2][3] = 1413;
                                anIntArrayArray4031[3][0] = 3276;
                                anIntArrayArray4031[7][2] = 1413;
                                anIntArrayArray4031[3][3] = 947;
                                anIntArrayArray4031[4][3] = 722;
                                anIntArrayArray4031[4][0] = 3481;
                                anIntArrayArray4031[4][1] = 2072;
                                anIntArrayArray4031[5][3] = 1766;
                                anIntArrayArray4031[6][3] = 915;
                                anIntArrayArray4031[5][0] = 3686;
                                anIntArrayArray4031[7][3] = 1140;
                                anIntArrayArray4031[5][1] = 2730;
                                anIntArrayArray4031[6][1] = 2232;
                                anIntArrayArray4031[6][0] = 3891;
                                anIntArrayArray4031[7][1] = 1686;
                                anIntArrayArray4031[7][0] = 4096;
                                return;
                            } while (false);
                            anIntArrayArray4031 = new int[7][4];
                            anIntArrayArray4031[0][2] = 0;
                            anIntArrayArray4031[1][2] = 4096;
                            anIntArrayArray4031[2][2] = 4096;
                            anIntArrayArray4031[0][1] = 0;
                            anIntArrayArray4031[0][0] = 0;
                            anIntArrayArray4031[1][1] = 0;
                            anIntArrayArray4031[0][3] = 4096;
                            anIntArrayArray4031[1][0] = 663;
                            anIntArrayArray4031[3][2] = 4096;
                            anIntArrayArray4031[4][2] = 0;
                            anIntArrayArray4031[5][2] = 0;
                            anIntArrayArray4031[2][1] = 0;
                            anIntArrayArray4031[2][0] = 1363;
                            anIntArrayArray4031[3][1] = 4096;
                            anIntArrayArray4031[3][0] = 2048;
                            anIntArrayArray4031[1][3] = 4096;
                            anIntArrayArray4031[6][2] = 0;
                            anIntArrayArray4031[4][0] = 2727;
                            anIntArrayArray4031[2][3] = 0;
                            anIntArrayArray4031[5][0] = 3411;
                            anIntArrayArray4031[4][1] = 4096;
                            anIntArrayArray4031[5][1] = 4096;
                            anIntArrayArray4031[3][3] = 0;
                            anIntArrayArray4031[6][0] = 4096;
                            anIntArrayArray4031[6][1] = 0;
                            anIntArrayArray4031[4][3] = 0;
                            anIntArrayArray4031[5][3] = 4096;
                            anIntArrayArray4031[6][3] = 4096;
                            return;
                        } while (false);
                        anIntArrayArray4031 = new int[6][4];
                        anIntArrayArray4031[0][3] = 0;
                        anIntArrayArray4031[1][3] = 1493;
                        anIntArrayArray4031[0][0] = 0;
                        anIntArrayArray4031[1][0] = 1843;
                        anIntArrayArray4031[2][3] = 2939;
                        anIntArrayArray4031[0][1] = 0;
                        anIntArrayArray4031[2][0] = 2457;
                        anIntArrayArray4031[3][0] = 2781;
                        anIntArrayArray4031[3][3] = 3565;
                        anIntArrayArray4031[4][3] = 4031;
                        anIntArrayArray4031[0][2] = 0;
                        anIntArrayArray4031[4][0] = 3481;
                        anIntArrayArray4031[5][3] = 4096;
                        anIntArrayArray4031[1][1] = 0;
                        anIntArrayArray4031[1][2] = 0;
                        anIntArrayArray4031[2][1] = 0;
                        anIntArrayArray4031[2][2] = 0;
                        anIntArrayArray4031[5][0] = 4096;
                        anIntArrayArray4031[3][2] = 1124;
                        anIntArrayArray4031[3][1] = 0;
                        anIntArrayArray4031[4][1] = 546;
                        anIntArrayArray4031[4][2] = 3084;
                        anIntArrayArray4031[5][1] = 4096;
                        anIntArrayArray4031[5][2] = 4096;
                        return;
                    } while (false);
                    anIntArrayArray4031 = new int[16][4];
                    anIntArrayArray4031[0][3] = 321;
                    anIntArrayArray4031[0][2] = 192;
                    anIntArrayArray4031[0][0] = 0;
                    anIntArrayArray4031[1][3] = 562;
                    anIntArrayArray4031[2][3] = 803;
                    anIntArrayArray4031[1][0] = 155;
                    anIntArrayArray4031[1][2] = 449;
                    anIntArrayArray4031[2][2] = 690;
                    anIntArrayArray4031[0][1] = 80;
                    anIntArrayArray4031[3][3] = 1140;
                    anIntArrayArray4031[1][1] = 321;
                    anIntArrayArray4031[2][1] = 578;
                    anIntArrayArray4031[3][1] = 947;
                    anIntArrayArray4031[3][2] = 995;
                    anIntArrayArray4031[2][0] = 389;
                    anIntArrayArray4031[4][3] = 1509;
                    anIntArrayArray4031[4][2] = 1397;
                    anIntArrayArray4031[3][0] = 671;
                    anIntArrayArray4031[4][0] = 897;
                    anIntArrayArray4031[5][3] = 1413;
                    anIntArrayArray4031[4][1] = 1285;
                    anIntArrayArray4031[5][2] = 1429;
                    anIntArrayArray4031[5][1] = 1525;
                    anIntArrayArray4031[5][0] = 1175;
                    anIntArrayArray4031[6][0] = 1368;
                    anIntArrayArray4031[7][0] = 1507;
                    anIntArrayArray4031[6][3] = 1333;
                    anIntArrayArray4031[8][0] = 1736;
                    anIntArrayArray4031[7][3] = 1702;
                    anIntArrayArray4031[6][2] = 1461;
                    anIntArrayArray4031[9][0] = 2088;
                    anIntArrayArray4031[6][1] = 1734;
                    anIntArrayArray4031[10][0] = 2355;
                    anIntArrayArray4031[7][2] = 1525;
                    anIntArrayArray4031[8][3] = 2056;
                    anIntArrayArray4031[9][3] = 2666;
                    anIntArrayArray4031[10][3] = 3276;
                    anIntArrayArray4031[7][1] = 1413;
                    anIntArrayArray4031[8][1] = 1108;
                    anIntArrayArray4031[9][1] = 1766;
                    anIntArrayArray4031[8][2] = 1590;
                    anIntArrayArray4031[11][3] = 3228;
                    anIntArrayArray4031[11][0] = 2691;
                    anIntArrayArray4031[12][3] = 3196;
                    anIntArrayArray4031[13][3] = 3019;
                    anIntArrayArray4031[12][0] = 3031;
                    anIntArrayArray4031[13][0] = 3522;
                    anIntArrayArray4031[14][0] = 3727;
                    anIntArrayArray4031[9][2] = 2056;
                    anIntArrayArray4031[10][2] = 2586;
                    anIntArrayArray4031[15][0] = 4096;
                    anIntArrayArray4031[14][3] = 3228;
                    anIntArrayArray4031[11][2] = 3148;
                    anIntArrayArray4031[12][2] = 3710;
                    anIntArrayArray4031[10][1] = 2409;
                    anIntArrayArray4031[11][1] = 3116;
                    anIntArrayArray4031[15][3] = 2746;
                    anIntArrayArray4031[13][2] = 3421;
                    anIntArrayArray4031[12][1] = 3806;
                    anIntArrayArray4031[14][2] = 3148;
                    anIntArrayArray4031[13][1] = 3437;
                    anIntArrayArray4031[14][1] = 3116;
                    anIntArrayArray4031[15][1] = 2377;
                    anIntArrayArray4031[15][2] = 2505;
                    return;
                } while (false);
                anIntArrayArray4031 = new int[4][4];
                anIntArrayArray4031[0][2] = 4096;
                anIntArrayArray4031[0][0] = 2048;
                anIntArrayArray4031[1][0] = 2867;
                anIntArrayArray4031[2][0] = 3276;
                anIntArrayArray4031[0][1] = 0;
                anIntArrayArray4031[1][2] = 4096;
                anIntArrayArray4031[0][3] = 0;
                anIntArrayArray4031[2][2] = 4096;
                anIntArrayArray4031[3][2] = 0;
                anIntArrayArray4031[1][1] = 4096;
                anIntArrayArray4031[1][3] = 0;
                anIntArrayArray4031[3][0] = 4096;
                anIntArrayArray4031[2][3] = 0;
                anIntArrayArray4031[3][3] = 0;
                anIntArrayArray4031[2][1] = 4096;
                anIntArrayArray4031[3][1] = 4096;
                return;
            } while (false);
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    public Class68_Sub13_Sub36() {
        super(1, false);
    }

    public static void method882(Class68_Sub2 class68_sub2, boolean bool) {
        anInt4041++;
        long l = 0L;
        int i = -1;
        if ((class68_sub2.anInt2786 ^ 0xffffffff) == -1)
            l = Class107.method1650(class68_sub2.anInt2789,
                    class68_sub2.anInt2791,
                    class68_sub2.anInt2784);
        if ((class68_sub2.anInt2786 ^ 0xffffffff) == -2)
            l = method883(class68_sub2.anInt2789, class68_sub2.anInt2791,
                    class68_sub2.anInt2784);
        if (bool == true) {
            int i_9_ = 0;
            int i_10_ = 0;
            if (class68_sub2.anInt2786 == 2)
                l = Class68_Sub13_Sub9.method738(class68_sub2.anInt2789,
                        class68_sub2.anInt2791,
                        class68_sub2.anInt2784);
            if (class68_sub2.anInt2786 == 3)
                l = Unknown.method1506(class68_sub2.anInt2789,
                        class68_sub2.anInt2791,
                        class68_sub2.anInt2784);
            if ((l ^ 0xffffffffffffffffL) != -1L) {
                i_10_ = 0x3 & (int) l >> 1394171124;
                i_9_ = (0x7ec4a & (int) l) >> -729044818;
                i = (int) (l >>> -188883616) & 0x7fffffff;
            }
            class68_sub2.anInt2788 = i;
            class68_sub2.anInt2783 = i_9_;
            class68_sub2.anInt2793 = i_10_;
        }
    }

    public static long method883(int i, int i_11_, int i_12_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_11_][i_12_];
        if (class68_sub1 == null || class68_sub1.aClass76_2764 == null)
            return 0L;
        return class68_sub1.aClass76_2764.aLong1364;
    }

    public void method884(int i) {
        anInt4036++;
        if (i != 3)
            anIntArray4043 = null;
        int i_13_ = anIntArrayArray4031.length;
        if (i_13_ > 0) {
            for (int i_14_ = 0; i_14_ < 257; i_14_++) {
                int i_15_ = 0;
                int i_16_ = i_14_ << -2139063356;
                for (int i_17_ = 0;
                     (i_17_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_17_++) {
                    if ((anIntArrayArray4031[i_17_][0] ^ 0xffffffff)
                            < (i_16_ ^ 0xffffffff))
                        break;
                    i_15_++;
                }
                int i_18_;
                int i_19_;
                int i_20_;
                if (i_13_ > i_15_) {
                    int[] is = anIntArrayArray4031[i_15_];
                    if ((i_15_ ^ 0xffffffff) >= -1) {
                        i_20_ = is[3];
                        i_18_ = is[2];
                        i_19_ = is[1];
                    } else {
                        int[] is_21_ = anIntArrayArray4031[-1 + i_15_];
                        int i_22_ = ((i_16_ - is_21_[0] << -511742004)
                                / (-is_21_[0] + is[0]));
                        int i_23_ = -i_22_ + 4096;
                        i_18_
                                = is_21_[2] * i_23_ + is[2] * i_22_ >> 1194441644;
                        i_19_ = i_23_ * is_21_[1] + i_22_ * is[1] >> 811739436;
                        i_20_ = i_22_ * is[3] + is_21_[3] * i_23_ >> 623151116;
                    }
                } else {
                    int[] is = anIntArrayArray4031[-1 + i_13_];
                    i_18_ = is[2];
                    i_19_ = is[1];
                    i_20_ = is[3];
                }
                i_20_ >>= 4;
                i_19_ >>= 4;
                if ((i_19_ ^ 0xffffffff) > -1)
                    i_19_ = 0;
                else if ((i_19_ ^ 0xffffffff) < -256)
                    i_19_ = 255;
                i_18_ >>= 4;
                if ((i_18_ ^ 0xffffffff) <= -1) {
                    if ((i_18_ ^ 0xffffffff) < -256)
                        i_18_ = 255;
                } else
                    i_18_ = 0;
                if (i_20_ >= 0) {
                    if ((i_20_ ^ 0xffffffff) < -256)
                        i_20_ = 255;
                } else
                    i_20_ = 0;
                anIntArray4043[i_14_]
                        = Class70.method1335(Class70.method1335(i_18_ << 209806376,
                        (i_19_
                                << 1066707152)),
                        i_20_);
            }
        }
    }

    public static void method885(byte i, RSString class100) {
        anInt4034++;
        if (i == -62
                && Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630 != null) {
            int i_24_ = 0;
            long l = class100.toLong(10908);
            if ((l ^ 0xffffffffffffffffL) != -1L) {
                for (/**/;
                         ((Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630.length
                                 ^ 0xffffffff)
                                 < (i_24_ ^ 0xffffffff));
                         i_24_++) {
                    if ((l ^ 0xffffffffffffffffL)
                            == ((Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                            [i_24_].aLong1218)
                            ^ 0xffffffffffffffffL))
                        break;
                }
                if ((i_24_
                        < Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630.length)
                        && (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630[i_24_]
                        != null)) {
                    Class21renamed.stream.createFrame(200);
                    Class75_Sub2.anInt3316++;
                    Class21renamed.stream.writeQWord
                            (true, (Class68_Sub20_Sub13_Sub2
                                    .aClass68_Sub19Array4630[i_24_].aLong1218));
                }
            }
        }
    }

    public static void method886(int i) {
        if (i != 0)
            method883(-69, -77, -25);
        aClass35_4035 = null;
        aRSString_4032 = null;
        anIntArray4039 = null;
        aRSString_4049 = null;
        anIntArray4044 = null;
        aClass45ArrayArray4040 = null;
    }

    public static void method887(int i, int i_25_, boolean bool, int i_26_) {
        anInt4047++;
        int i_27_ = -66 % ((i_26_ - -73) / 51);
        if ((i ^ 0xffffffff) > -8001 || i > 48000)
            throw new IllegalArgumentException();
        Class7.aBoolean132 = bool;
        Class32.anInt560 = i_25_;
        Class93.anInt1660 = i;
    }

    public void method700(Stream class68_sub14, int i, int i_28_) {
        if (i_28_ == -1) {
            if (i == 0) {
                int i_29_ = class68_sub14.readUnsignedByte(-6677);
                if (i_29_ == 0) {
                    anIntArrayArray4031
                            = new int[class68_sub14.readUnsignedByte(i_28_ + -6676)][4];
                    for (int i_30_ = 0;
                         ((anIntArrayArray4031.length ^ 0xffffffff)
                                 < (i_30_ ^ 0xffffffff));
                         i_30_++) {
                        anIntArrayArray4031[i_30_][0]
                                = class68_sub14.readUnsignedWord(1355769544);
                        anIntArrayArray4031[i_30_][1]
                                = class68_sub14.readUnsignedByte(-6677) << 1696064164;
                        anIntArrayArray4031[i_30_][2]
                                = (class68_sub14.readUnsignedByte(i_28_ + -6676)
                                << 941944740);
                        anIntArrayArray4031[i_30_][3]
                                = class68_sub14.readUnsignedByte(-6677) << 1066621380;
                    }
                } else
                    method881(false, i_29_);
            }
            anInt4046++;
        }
    }

    static {
        aRSString_4032 = RSString.newRsString("Starting 3d library");
        anInt4033 = 0;
        anIntArray4044 = new int[32];
        aRSString_4049 = aRSString_4032;
        anIntArray4039 = new int[4096];
        for (int i = 0; i < 4096; i++)
            anIntArray4039[i] = Class68_Sub13_Sub20.method798(26151, i);
    }
}
