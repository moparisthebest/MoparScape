/* Class1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub5 extends Animable {
    public int anInt2493;
    public static int anInt2494;
    public Class55 aClass55_2495;
    public static Class72 aClass72_2496;
    public static int anInt2497;
    public static int anInt2498;
    public int anInt2499;
    public static int anInt2500;
    public static int anInt2501;
    public int anInt2502 = 0;
    public int anInt2503;
    public static int anInt2504;
    public int anInt2505;
    public int anInt2506;
    public static int anInt2507;
    public static int anInt2508;
    public static Class113 aClass113_2509;
    public int anInt2510;
    public int anInt2511;
    public boolean aBoolean2512;
    public int anInt2513;
    public static int anInt2514 = -1;
    public static Class45 aClass45_2515;
    public static int[] anIntArray2516;

    public static void method137(int i) {
        aClass72_2496 = null;
        anIntArray2516 = null;
        aClass45_2515 = null;
        if (i != 2)
            anIntArray2516 = null;
        aClass113_2509 = null;
    }

    public static void method138(int i) {
        Class47.anInt944 = i;
        for (int i_0_ = 0; i_0_ < Applet_Sub1.anInt7; i_0_++) {
            for (int i_1_ = 0; i_1_ < Class97.anInt1714; i_1_++) {
                if (Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_][i_1_]
                        == null)
                    Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_][i_1_]
                            = new Class68_Sub1(i, i_0_, i_1_);
            }
        }
    }

    public int method56() {
        anInt2497++;
        return anInt2510;
    }

    public void method51(int i, int i_2_, int i_3_, int i_4_, int i_5_,
                         int i_6_, int i_7_, int i_8_, long l) {
        anInt2498++;
        Class1_Sub3 class1_sub3 = method143(119);
        if (class1_sub3 != null) {
            class1_sub3.method51(i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_,
                    l);
            anInt2510 = class1_sub3.method56();
        }
    }

    public void method139(int i, boolean bool) {
        anInt2494++;
        if (!aBoolean2512) {
            anInt2502 += i;
            if (bool == false) {
                while (anInt2502 > aClass55_2495.anIntArray2058[anInt2499]) {
                    anInt2502 -= aClass55_2495.anIntArray2058[anInt2499];
                    anInt2499++;
                    if ((aClass55_2495.anIntArray2035.length ^ 0xffffffff)
                            >= (anInt2499 ^ 0xffffffff)) {
                        aBoolean2512 = true;
                        break;
                    }
                }
            }
        }
    }

    public static Class116 method140(int i, int i_9_) {
        anInt2504++;
        Class116 class116 = (Class116) Class68_Sub20_Sub12.aClass98_4348
                .method1570(14366, (long) i_9_);
        if (class116 != null)
            return class116;
        byte[] is = (Class68_Sub28_Sub1.aClass21_4478.method338
                (Class106.method1646(i_9_, false), 0,
                        Class68_Sub15.method977(28443, i_9_)));
        class116 = new Class116();
        class116.anInt2031 = i_9_;
        if (is != null)
            class116.method1711((byte) 29, new Stream(is));
        class116.method1706(-129);
        if (!Class68_Sub27.aBoolean3220 && class116.aBoolean1978)
            class116.aRSStringArray2006 = null;
        if (class116.aBoolean1968) {
            class116.anInt2022 = 0;
            class116.aBoolean2030 = false;
        }
        Class68_Sub20_Sub12.aClass98_4348.method1568(class116, 110,
                (long) i_9_);
        if (i < 79)
            anInt2514 = -82;
        return class116;
    }

    public static void method141(Stream class68_sub14, byte i) {
        anInt2508++;
        if (-class68_sub14.currentOffset + class68_sub14.buffer.length
                >= 1) {
            int i_10_ = class68_sub14.readUnsignedByte(-6677);
            if (i_10_ >= 0 && (i_10_ ^ 0xffffffff) >= -4) {
                int i_11_;
                if (i_10_ == 3)
                    i_11_ = 23;
                else if ((i_10_ ^ 0xffffffff) == -3)
                    i_11_ = 22;
                else if ((i_10_ ^ 0xffffffff) != -2)
                    i_11_ = 19;
                else
                    i_11_ = 23;
                if (i_11_ <= (-class68_sub14.currentOffset
                        + class68_sub14.buffer.length)) {
                    Class45.anInt919 = class68_sub14.readUnsignedByte(-6677);
                    if (Class45.anInt919 >= 1) {
                        if (Class45.anInt919 > 4)
                            Class45.anInt919 = 4;
                    } else
                        Class45.anInt919 = 1;
                    if (i <= 89)
                        anIntArray2516 = null;
                    Class75_Sub3_Sub1.method1403((class68_sub14
                            .readUnsignedByte(-6677)
                            ^ 0xffffffff) == -2,
                            1);
                    Class68_Sub20_Sub2.aBoolean4188
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
                    ISAACRandomGen.aBoolean1487 = class68_sub14.readUnsignedByte(-6677) == 1;
                    Class1_Sub2.aBoolean2432
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
                    RSString.aBoolean2262
                            = class68_sub14.readUnsignedByte(-6677) == 1;
                    Class68_Sub13_Sub2.aBoolean3460
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
                    Class68_Sub22.aBoolean3149
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
                    Class68_Sub20_Sub13_Sub2.aBoolean4629
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
                    Class68_Sub13_Sub26.anInt3876
                            = class68_sub14.readUnsignedByte(-6677);
                    if (Class68_Sub13_Sub26.anInt3876 > 2)
                        Class68_Sub13_Sub26.anInt3876 = 2;
                    if ((i_10_ ^ 0xffffffff) > -3) {
                        Class68_Sub28_Sub1.aBoolean4521
                                = ((class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff)
                                == -2);
                        class68_sub14.readUnsignedByte(-6677);
                    } else
                        Class68_Sub28_Sub1.aBoolean4521
                                = ((class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff)
                                == -2);
                    Class68_Sub6.aBoolean2838
                            = class68_sub14.readUnsignedByte(-6677) == 1;
                    Class43.aBoolean741 = class68_sub14.readUnsignedByte(-6677) == 1;
                    Class69.anInt1245 = class68_sub14.readUnsignedByte(-6677);
                    if ((Class69.anInt1245 ^ 0xffffffff) < -3)
                        Class69.anInt1245 = 2;
                    Class74.aBoolean1324
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
                    Class106.anInt1801 = class68_sub14.readUnsignedByte(-6677);
                    if (Class106.anInt1801 > 127)
                        Class106.anInt1801 = 127;
                    Class68_Sub13_Sub25.anInt3855
                            = class68_sub14.readUnsignedByte(-6677);
                    Class68_Sub20_Sub15.anInt4399
                            = class68_sub14.readUnsignedByte(-6677);
                    if (Class68_Sub20_Sub15.anInt4399 > 127)
                        Class68_Sub20_Sub15.anInt4399 = 127;
                    if (i_10_ >= 1) {
                        Class86.anInt1571
                                = class68_sub14.readUnsignedWord(1355769544);
                        Class54.anInt1032
                                = class68_sub14.readUnsignedWord(1355769544);
                    }
                    if ((i_10_ ^ 0xffffffff) <= -4)
                        Class68_Sub13_Sub21.aBoolean3793
                                = ((class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff)
                                == -2);
                }
            }
        }
    }

    public static void method142(int i, Class45[] class45s, int i_12_) {
        anInt2507++;
        if (i_12_ != 16)
            anInt2500 = -106;
        for (int i_13_ = 0; i_13_ < class45s.length; i_13_++) {
            Class45 class45 = class45s[i_13_];
            if (class45 != null) {
                if ((class45.anInt896 ^ 0xffffffff) == -1) {
                    if (class45.aClass45Array769 != null)
                        method142(i, class45.aClass45Array769, i_12_);
                    Class68_Sub3 class68_sub3
                            = ((Class68_Sub3)
                            Login.aClass113_1512
                                    .method1678((long) class45.anInt792, -63));
                    if (class68_sub3 != null)
                        GameException
                                .method1796(113, class68_sub3.anInt2803, i);
                }
                if ((i ^ 0xffffffff) == -1
                        && class45.anObjectArray897 != null) {
                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                    class68_sub29.aClass45_3239 = class45;
                    class68_sub29.anObjectArray3237 = class45.anObjectArray897;
                    Class68_Sub13_Sub16.method776(class68_sub29, 16);
                }
                if (i == 1 && class45.anObjectArray770 != null) {
                    if ((class45.anInt867 ^ 0xffffffff) <= -1) {
                        Class45 class45_14_
                                = Class68_Sub20_Sub15.method1170(class45.anInt792,
                                (byte) -80);
                        if (class45_14_ == null
                                || class45_14_.aClass45Array769 == null
                                || (class45_14_.aClass45Array769.length
                                <= class45.anInt867)
                                || (class45_14_.aClass45Array769[class45.anInt867]
                                != class45))
                            continue;
                    }
                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                    class68_sub29.anObjectArray3237 = class45.anObjectArray770;
                    class68_sub29.aClass45_3239 = class45;
                    Class68_Sub13_Sub16.method776(class68_sub29, 16);
                }
            }
        }
    }

    public Class1_Sub3 method143(int i) {
        anInt2501++;
        if (i <= 111)
            aClass113_2509 = null;
        Class70 class70 = Class68_Sub20_Sub13.method1160(anInt2511, 1);
        Class1_Sub3 class1_sub3;
        if (aBoolean2512)
            class1_sub3 = class70.method1337(-1, -10);
        else
            class1_sub3 = class70.method1337(anInt2499, -10);
        if (class1_sub3 == null)
            return null;
        return class1_sub3;
    }

    public Class1_Sub5(int i, int i_15_, int i_16_, int i_17_, int i_18_,
                       int i_19_, int i_20_) {
        anInt2499 = 0;
        anInt2510 = -32768;
        aBoolean2512 = false;
        anInt2506 = i_15_;
        anInt2513 = i_16_;
        anInt2503 = i_20_ - -i_19_;
        anInt2511 = i;
        anInt2493 = i_18_;
        anInt2505 = i_17_;
        int i_21_ = Class68_Sub20_Sub13.method1160(anInt2511, 1).anInt1282;
        if ((i_21_ ^ 0xffffffff) != 0) {
            aBoolean2512 = false;
            aClass55_2495 = Class64.method624((byte) -36, i_21_);
        } else
            aBoolean2512 = true;
    }

    static {
        aClass113_2509 = new Class113(16);
        anIntArray2516 = new int[25];
    }
}
