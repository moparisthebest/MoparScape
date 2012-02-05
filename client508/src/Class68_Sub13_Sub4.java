/* Class68_Sub13_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

public class Class68_Sub13_Sub4 extends Class68_Sub13 {
    public static Class1_Sub6_Sub2[] aClass1_Sub6_Sub2Array3483;
    public int anInt3484;
    public int[] anIntArray3485;
    public static Class124 aClass124_3486;
    public int anInt3487;
    public static int anInt3488 = 0;
    public int anInt3489;
    public int anInt3490;
    public int[][] anIntArrayArray3491;
    public static RSString aRSString_3492;
    public static int anInt3493;
    public int anInt3494 = 0;
    public int[][] anIntArrayArray3495;
    public static int anInt3496;
    public static int anInt3497;
    public int anInt3498 = 1024;
    public static int anInt3499;
    public int anInt3500;
    public static int anInt3501;
    public int anInt3502;
    public static int[][][] anIntArrayArrayArray3503;
    public static int anInt3504;
    public int anInt3505;
    public static int anInt3506;
    public int anInt3507;
    public static int anInt3508;
    public static int anInt3509;
    public int anInt3510;
    public static Class68_Sub20_Sub1 aClass68_Sub20_Sub1_3511;

    public int[] method698(byte i, int i_0_) {
        int[] is = aClass115_2936.method1697(false, i_0_);
        if (aClass115_2936.aBoolean1957) {
            int i_1_ = 0;
            int i_2_;
            for (i_2_ = anInt3494 + Class13_Sub3.anIntArray2672[i_0_];
                 (i_2_ ^ 0xffffffff) > -1; i_2_ += 4096) {
                /* empty */
            }
            for (/**/; (i_2_ ^ 0xffffffff) < -4097; i_2_ -= 4096) {
                /* empty */
            }
            for (/**/; i_1_ < anInt3484; i_1_++) {
                if ((anIntArray3485[i_1_] ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
                    break;
            }
            int i_3_ = anIntArray3485[i_1_ - 1];
            int i_4_ = i_1_ - 1;
            boolean bool = (0x1 & i_1_ ^ 0xffffffff) == -1;
            int i_5_ = anIntArray3485[i_1_];
            if ((i_2_ ^ 0xffffffff) >= (i_3_ + anInt3490 ^ 0xffffffff)
                    || -anInt3490 + i_5_ <= i_2_)
                Class39.method464(is, 0, Class68_Sub13_Sub19.anInt3746, 0);
            else {
                for (int i_6_ = 0;
                     ((i_6_ ^ 0xffffffff)
                             > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                     i_6_++) {
                    int i_7_ = 0;
                    int i_8_ = !bool ? -anInt3502 : anInt3502;
                    int i_9_;
                    for (i_9_ = (Class68_Sub13_Sub3.anIntArray3479[i_6_]
                            + (anInt3507 * i_8_ >> 523047916));
                         (i_9_ ^ 0xffffffff) > -1; i_9_ += 4096) {
                        /* empty */
                    }
                    for (/**/; i_9_ > 4096; i_9_ -= 4096) {
                        /* empty */
                    }
                    for (/**/; (anInt3505 ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
                             i_7_++) {
                        if (i_9_ < anIntArrayArray3491[i_4_][i_7_])
                            break;
                    }
                    int i_10_ = anIntArrayArray3491[i_4_][i_7_];
                    int i_11_ = i_7_ - 1;
                    int i_12_ = anIntArrayArray3491[i_4_][i_11_];
                    if ((i_12_ + anInt3490 ^ 0xffffffff) > (i_9_ ^ 0xffffffff)
                            && (i_9_ ^ 0xffffffff) > (i_10_ + -anInt3490
                            ^ 0xffffffff))
                        is[i_6_] = anIntArrayArray3495[i_4_][i_11_];
                    else
                        is[i_6_] = 0;
                }
            }
        }
        anInt3499++;
        if (i != -61)
            method698((byte) -77, -48);
        return is;
    }

    public void method690(byte i) {
        method715(0);
        if (i > -22)
            anIntArray3485 = null;
        anInt3506++;
    }

    public static void method714(int i) {
        if (i >= -97)
            method717(null, 122);
        aRSString_3492 = null;
        anIntArrayArrayArray3503 = null;
        aClass124_3486 = null;
        aClass1_Sub6_Sub2Array3483 = null;
        aClass68_Sub20_Sub1_3511 = null;
    }

    public void method715(int i) {
        Random random = new Random((long) anInt3484);
        anInt3490 = anInt3487 / 2;
        anInt3508++;
        anInt3507 = 4096 / anInt3505;
        anIntArrayArray3495 = new int[anInt3484][anInt3505];
        anIntArray3485 = new int[1 + anInt3484];
        anIntArrayArray3491 = new int[anInt3484][1 + anInt3505];
        int i_13_ = anInt3507 / 2;
        anInt3510 = 4096 / anInt3484;
        anIntArray3485[0] = 0;
        int i_14_ = anInt3510 / 2;
        for (int i_15_ = i; (i_15_ ^ 0xffffffff) > (anInt3484 ^ 0xffffffff);
             i_15_++) {
            if (i_15_ > 0) {
                int i_16_ = anInt3510;
                int i_17_
                        = ((-2048
                        + Class68_Sub20_Sub10.method1114(4096, (byte) 70,
                        random)) * anInt3489
                        >> 247639212);
                i_16_ += i_14_ * i_17_ >> -1309365524;
                anIntArray3485[i_15_] = anIntArray3485[-1 + i_15_] - -i_16_;
            }
            anIntArrayArray3491[i_15_][0] = 0;
            for (int i_18_ = 0;
                 (anInt3505 ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
                if (i_18_ > 0) {
                    int i_19_ = anInt3507;
                    int i_20_
                            = ((Class68_Sub20_Sub10.method1114(4096, (byte) 70,
                            random)
                            + -2048) * anInt3500
                            >> -1625992660);
                    i_19_ += i_13_ * i_20_ >> -1496180564;
                    anIntArrayArray3491[i_15_][i_18_]
                            = anIntArrayArray3491[i_15_][-1 + i_18_] - -i_19_;
                }
                anIntArrayArray3495[i_15_][i_18_]
                        = (anInt3498 <= 0 ? 4096
                        : -Class68_Sub20_Sub10.method1114(anInt3498, (byte) 70,
                        random) + 4096);
            }
            anIntArrayArray3491[i_15_][anInt3505] = 4096;
        }
        anIntArray3485[anInt3484] = 4096;
    }

    public void method700(Stream class68_sub14, int i, int i_21_) {
        int i_22_ = i;
        while_11_:
        do {
            while_10_:
            do {
                while_9_:
                do {
                    while_8_:
                    do {
                        while_7_:
                        do {
                            while_6_:
                            do {
                                do {
                                    if (i_22_ != 0) {
                                        if (i_22_ != 1) {
                                            if (i_22_ != 2) {
                                                if ((i_22_ ^ 0xffffffff)
                                                        != -4) {
                                                    if ((i_22_ ^ 0xffffffff)
                                                            != -5) {
                                                        if (i_22_ != 5) {
                                                            if ((i_22_
                                                                    ^ 0xffffffff)
                                                                    != -7) {
                                                                if ((i_22_
                                                                        ^ 0xffffffff)
                                                                        != -8)
                                                                    break while_11_;
                                                            } else
                                                                break while_9_;
                                                            break while_10_;
                                                        }
                                                    } else
                                                        break while_7_;
                                                    break while_8_;
                                                }
                                            } else
                                                break;
                                            break while_6_;
                                        }
                                    } else {
                                        anInt3505
                                                = class68_sub14.readUnsignedByte(-6677);
                                        break while_11_;
                                    }
                                    anInt3484 = class68_sub14
                                            .readUnsignedByte(i_21_ ^ 0x1a14);
                                    break while_11_;
                                } while (false);
                                anInt3500
                                        = class68_sub14.readUnsignedWord(1355769544);
                                break while_11_;
                            } while (false);
                            anInt3489 = class68_sub14.readUnsignedWord(1355769544);
                            break while_11_;
                        } while (false);
                        anInt3502 = class68_sub14.readUnsignedWord(1355769544);
                        break while_11_;
                    } while (false);
                    anInt3494 = class68_sub14.readUnsignedWord(i_21_ ^ ~0x50cf66c8);
                    break while_11_;
                } while (false);
                anInt3487 = class68_sub14.readUnsignedWord(1355769544);
                break while_11_;
            } while (false);
            anInt3498 = class68_sub14.readUnsignedWord(1355769544);
        } while (false);
        anInt3496++;
        if (i_21_ != -1)
            anInt3507 = 120;
    }

    public static void method716() {
        for (int i = 0; i < Class86.anInt1582; i++) {
            for (int i_23_ = 0; i_23_ < Applet_Sub1.anInt7; i_23_++) {
                for (int i_24_ = 0; i_24_ < Class97.anInt1714; i_24_++)
                    Class22.aClass68_Sub1ArrayArrayArray484[i][i_23_][i_24_]
                            = null;
            }
        }
        for (int i = 0; i < Class54.anInt1029; i++)
            Class121.aClass8Array2102[i] = null;
        Class54.anInt1029 = 0;
        for (int i = 0; i < Class55.anInt2055; i++)
            Class68.aClass69Array1222[i] = null;
        Class55.anInt2055 = 0;
        for (int i = 0; i < Class75_Sub1.aClass69Array3306.length; i++)
            Class75_Sub1.aClass69Array3306[i] = null;
    }

    public static void method717(Class1_Sub6_Sub1 class1_sub6_sub1, int i) {
        anInt3493++;
        for (Class68_Sub18 class68_sub18
                     = (Class68_Sub18) Class51.aClass16_2251.method293((byte) 76);
             class68_sub18 != null;
             class68_sub18 = ((Class68_Sub18)
                     Class51.aClass16_2251.method290((byte) 80))) {
            if (class68_sub18.aClass1_Sub6_Sub1_3060 == class1_sub6_sub1) {
                if (class68_sub18.aClass68_Sub28_Sub3_3040 != null) {
                    Class80.aClass68_Sub28_Sub4_1418
                            .method1314(class68_sub18.aClass68_Sub28_Sub3_3040);
                    class68_sub18.aClass68_Sub28_Sub3_3040 = null;
                }
                class68_sub18.method647(-17554);
                return;
            }
        }
        if (i != 2)
            aClass124_3486 = null;
    }

    public Class68_Sub13_Sub4() {
        super(0, true);
        anInt3489 = 204;
        anInt3502 = 1024;
        anInt3487 = 81;
        anInt3505 = 4;
        anInt3500 = 409;
        anInt3484 = 8;
    }

    public static void method718(byte i) {
        if (i == -88) {
            anInt3504++;
            Class68_Sub28_Sub2.aClass98_4544.method1566((byte) 94);
        }
    }

    static {
        aClass1_Sub6_Sub2Array3483 = new Class1_Sub6_Sub2[2048];
        anInt3497 = 0;
        aRSString_3492 = RSString.newRsString("<img=1>");
        anInt3501 = 2;
        anIntArrayArrayArray3503 = new int[2][][];
    }
}
