/* Class1_Sub6_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub6_Sub2 extends Class1_Sub6 {
    public static int anInt3399;
    public static int anInt3400;
    public int anInt3401;
    public int anInt3402;
    public static int anInt3403;
    public static int anInt3404;
    public static int anInt3405;
    public int anInt3406 = 0;
    public int anInt3407;
    public int anInt3408;
    public int anInt3409;
    public PlayerDefinition aClass126_3410;
    public Class1_Sub3 aClass1_Sub3_3411;
    public int anInt3412;
    public static RSString aRSString_3413
            = RSString.newRsString("Lade Titelbild )2 ");
    public RSString aRSString_3414;
    public int anInt3415;
    public int anInt3416;
    public static int anInt3417;
    public static Login aLogin_3418;
    public int anInt3419;
    public static int anInt3420;
    public int anInt3421;
    public int anInt3422;
    public static int anInt3423;
    public boolean aBoolean3424;
    public short aShort3425;
    public short aShort3426;
    public int anInt3427;
    public static RSString aRSString_3428 = RSString.newRsString("::");
    public static RSString aRSString_3429;
    public static int[] anIntArray3430 = new int[100];
    public int anInt3431;
    public static int anInt3432;
    public int anInt3433;
    public int anInt3434;
    public int anInt3435;
    public static int anInt3436;
    public static int anInt3437;
    public int anInt3438;
    public int anInt3439;
    public static RSString aRSString_3440;
    public static RSString aRSString_3441;
    public static RSString aRSString_3442;

    public static void method157(int i, int i_0_, int i_1_, int i_2_) {
        Class108.aClass68_Sub1ArrayArrayArray1833
                = new Class68_Sub1[i][i_0_][i_1_];
        Class74.anIntArrayArrayArray1335 = new int[i][i_0_ + 1][i_1_ + 1];
        Class68_Sub13_Sub1.method706(false);
        Applet_Sub1.anInt7 = i_0_;
        Class97.anInt1714 = i_1_;
        Class72.anIntArrayArrayArray1311 = new int[i][i_0_ + 1][i_1_ + 1];
        Class68_Sub13_Sub4.method716();
        Class68_Sub20_Sub14.anInt4384 = i_2_;
        Class68_Sub9.aBooleanArrayArray2887
                = (new boolean
                [(Class68_Sub20_Sub14.anInt4384 + Class68_Sub20_Sub14.anInt4384
                + 1)]
                [(Class68_Sub20_Sub14.anInt4384 + Class68_Sub20_Sub14.anInt4384
                + 1)]);
        Class68_Sub13_Sub18.aBooleanArrayArray3738
                = (new boolean
                [(Class68_Sub20_Sub14.anInt4384 + Class68_Sub20_Sub14.anInt4384
                + 2)]
                [(Class68_Sub20_Sub14.anInt4384 + Class68_Sub20_Sub14.anInt4384
                + 2)]);
    }

    public void method158(int i, int i_3_, int i_4_, int i_5_, int i_6_,
                          boolean bool, int i_7_, int i_8_, int i_9_,
                          int i_10_, int i_11_, int i_12_,
                          Class1_Sub3 class1_sub3) {
        anInt3400++;
        int i_13_ = i_9_ * i_9_ + i_3_ * i_3_;
        if (bool != true)
            anInt3408 = 113;
        if (i_13_ >= 16 && i_13_ <= 360000) {
            int i_14_
                    = ((int) (325.949 * Math.atan2((double) i_9_, (double) i_3_))
                    & 0x7ff);
            Class1_Sub3 class1_sub3_15_
                    = Class88.method1494(i_4_, anInt2537, anInt2582, i_14_, -10,
                    class1_sub3, anInt2561);
            if (class1_sub3_15_ != null)
                class1_sub3_15_.method51(0, i_6_, i_5_, i_12_, i_10_, i_11_, i,
                        i_7_, -1L);
        }
    }

    public void method159(Stream class68_sub14, byte i) {
        class68_sub14.currentOffset = 0;
        anInt3423++;
        int i_16_ = class68_sub14.readUnsignedByte(-6677);
        if (i >= -3)
            aShort3425 = (short) 64;
        if ((0x2 & i_16_) == 2) {
            aShort3426 = (short) (class68_sub14.readUnsignedByte(-6677) << -1440797374);
            aShort3425 = (short) (class68_sub14.readUnsignedByte(-6677) << 1237400642);
        } else {
            aShort3425 = (short) 0;
            aShort3426 = (short) 0;
        }
        anInt3401 = 0x3 & i_16_ >> 1463074214;
        int i_17_ = anInt2544;
        anInt2544 = (0x7 & i_16_ >> 1102585635) + 1;
        anInt2537 += (anInt2544 - i_17_) * 64;
        int i_18_ = -1;
        boolean bool = (0x4 & i_16_) != 0;
        int i_19_ = i_16_ & 0x1;
        anInt2561 += 64 * (-i_17_ + anInt2544);
        anInt3435 = class68_sub14.method955(3390);
        int[] is = new int[12];
        anInt3422 = class68_sub14.method955(3390);
        anInt3431 = 0;
        for (int i_20_ = 0; i_20_ < 12; i_20_++) {
            int i_21_ = class68_sub14.readUnsignedByte(-6677);
            if (i_21_ == 0)
                is[i_20_] = 0;
            else {
                int i_22_ = class68_sub14.readUnsignedByte(-6677);
                int i_23_ = i_22_ + (i_21_ << -1305834968);
                if (i_20_ == 0 && i_23_ == 65535) {
                    i_18_ = class68_sub14.readUnsignedWord(1355769544);
                    break;
                }
                if (i_23_ >= 32768) {
                    i_23_ = Class68_Sub20_Sub13.anIntArray4367[-32768 + i_23_];
                    is[i_20_] = Class70.method1335(i_23_, 1073741824);
                    int i_24_ = Applet_Sub1.method18(-25672, i_23_).anInt383;
                    if (i_24_ != 0)
                        anInt3431 = i_24_;
                } else
                    is[i_20_] = Class70.method1335(-2147483648, i_23_ - 256);
            }
        }
        int[] is_25_ = new int[5];
        for (int i_26_ = 0; i_26_ < 5; i_26_++) {
            int i_27_ = class68_sub14.readUnsignedByte(-6677);
            if (i_27_ < 0 || i_27_ >= Class56.aShortArrayArray1065[i_26_].length)
                i_27_ = 0;
            is_25_[i_26_] = i_27_;
        }
        anInt2530 = class68_sub14.readUnsignedWord(1355769544);
        if (anInt2530 == 65535)
            anInt2530 = -1;
        anInt2565 = class68_sub14.readUnsignedWord(1355769544);
        if (anInt2565 == 65535)
            anInt2565 = -1;
        anInt2564 = anInt2565;
        anInt2543 = class68_sub14.readUnsignedWord(1355769544);
        if (anInt2543 == 65535)
            anInt2543 = -1;
        anInt2532 = class68_sub14.readUnsignedWord(1355769544);
        if (anInt2532 == 65535)
            anInt2532 = -1;
        anInt2574 = class68_sub14.readUnsignedWord(1355769544);
        if (anInt2574 == 65535)
            anInt2574 = -1;
        anInt2563 = class68_sub14.readUnsignedWord(1355769544);
        if (anInt2563 == 65535)
            anInt2563 = -1;
        anInt2540 = class68_sub14.readUnsignedWord(1355769544);
        if (anInt2540 == 65535)
            anInt2540 = -1;
        aRSString_3414 = Class56.method570(class68_sub14.readQWord(54), -1).method1597(12688);
        anInt3415 = class68_sub14.readUnsignedByte(-6677);
        if (bool)
            anInt3406 = class68_sub14.readUnsignedWord(1355769544);
        else
            anInt3406 = 0;
        int i_28_ = anInt3427;
        anInt3427 = class68_sub14.readUnsignedByte(-6677);
        if (anInt3427 == 0)
            Class113.method1681(-1, this);
        else {
            int i_29_ = anInt3421;
            int i_30_ = anInt3402;
            int i_31_ = anInt3409;
            anInt3402 = class68_sub14.readUnsignedWord(1355769544);
            anInt3421 = class68_sub14.readUnsignedWord(1355769544);
            anInt3409 = class68_sub14.readUnsignedWord(1355769544);
            if (i_28_ != anInt3427 || i_30_ != anInt3402 || anInt3421 != i_29_ || i_31_ != anInt3409)
                Class13_Sub2.method255((byte) -10, this);
        }
        if (aClass126_3410 == null)
            aClass126_3410 = new PlayerDefinition();
        aClass126_3410.method1773(is_25_, is, i_19_ == 1, (byte) -126, i_18_);
    }

    public RSString method160(int i) {
        RSString class100 = aRSString_3414;
        anInt3417++;
        if (Class116.aRSStringArray1992 != null)
            class100
                    = Class68_Sub20_Sub13_Sub2.method1166(2,
                    (new RSString[]
                            {(Class116
                                    .aRSStringArray1992
                                    [anInt3401]),
                                    class100}));
        if (i != 3000)
            aRSString_3414 = null;
        if (Class68_Sub20.aRSStringArray3093 != null)
            class100
                    = Class68_Sub20_Sub13_Sub2.method1166(i ^ 0xbba,
                    (new RSString[]
                            {class100,
                                    (Class68_Sub20
                                            .aRSStringArray3093
                                            [anInt3401])}));
        return class100;
    }

    public boolean method150(int i) {
        if (i <= 14)
            method51(49, 21, 126, -70, 76, 66, -93, -23, 86L);
        anInt3404++;
        if (aClass126_3410 == null)
            return false;
        return true;
    }

    public void method51(int i, int i_32_, int i_33_, int i_34_, int i_35_,
                         int i_36_, int i_37_, int i_38_, long l) {
        anInt3420++;
        if (aClass126_3410 != null) {
            Class55 class117
                    = (anInt2568 != -1 && (anInt2545 ^ 0xffffffff) == -1
                    ? Class64.method624((byte) -36, anInt2568) : null);
            Class55 class117_39_
                    = ((anInt2524 != -1 && !aBoolean3424
                    && ((anInt2524 ^ 0xffffffff) != (anInt2530 ^ 0xffffffff)
                    || class117 == null))
                    ? Class64.method624((byte) -36, anInt2524) : null);
            Class1_Sub3 class1_sub3
                    = aClass126_3410.method1768(anInt2522, class117, anInt2555,
                    class117_39_, (byte) 97);
            if (class1_sub3 != null) {
                anInt2566 = class1_sub3.method56();
                if (Class68_Sub20_Sub13_Sub2.aBoolean4629
                        && (aClass126_3410.anInt2201 == -1
                        || (Class68_Sub13_Sub11.method753
                        (aClass126_3410.anInt2201, -103).aBoolean1448))) {
                    Class1_Sub3 class1_sub3_40_
                            = (GameException.method1793
                            (anInt2537, i, anInt2582, class1_sub3,
                                    class117_39_ != null ? anInt2555 : anInt2522,
                                    class117_39_ != null ? class117_39_ : class117,
                                    240, 0, anInt2561, 1, 160, 0, 64, aBoolean2583));
                    class1_sub3_40_.method51(0, i_32_, i_33_, i_34_, i_35_,
                            i_36_, i_37_, i_38_, -1L);
                }
                if (Class68_Sub7.aClass1_Sub6_Sub2_2860 == this) {
                    for (int i_41_ = -1 + Class34.aClass23Array594.length;
                         i_41_ >= 0; i_41_--) {
                        Class23 class23 = Class34.aClass23Array594[i_41_];
                        if (class23 != null
                                && (class23.anInt495 ^ 0xffffffff) != 0) {
                            if (class23.anInt489 == 1 && class23.anInt493 >= 0
                                    && ((class23.anInt493 ^ 0xffffffff)
                                    > ((Class102
                                    .aClass1_Sub6_Sub1Array1746).length
                                    ^ 0xffffffff))) {
                                Class1_Sub6_Sub1 class1_sub6_sub1
                                        = (Class102.aClass1_Sub6_Sub1Array1746
                                        [class23.anInt493]);
                                if (class1_sub6_sub1 != null) {
                                    int i_42_
                                            = (class1_sub6_sub1.anInt2537 / 32
                                            - (Class68_Sub7
                                            .aClass1_Sub6_Sub2_2860
                                            .anInt2537) / 32);
                                    int i_43_
                                            = (class1_sub6_sub1.anInt2561 / 32
                                            - (Class68_Sub7
                                            .aClass1_Sub6_Sub2_2860
                                            .anInt2561) / 32);
                                    method158(i_37_, i_42_, class23.anInt495,
                                            i_33_, i_32_, true, i_38_, i,
                                            i_43_, i_35_, i_36_, i_34_,
                                            class1_sub3);
                                }
                            }
                            if (class23.anInt489 == 2) {
                                int i_44_
                                        = ((class23.anInt492
                                        + -Class68_Sub13_Sub35.anInt4026) * 4
                                        - (-2 + (Class68_Sub7
                                        .aClass1_Sub6_Sub2_2860
                                        .anInt2537) / 32));
                                int i_45_
                                        = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                        .anInt2561)
                                        / 32)
                                        + (4 * (-Class36.anInt643
                                        + class23.anInt496)
                                        - -2));
                                method158(i_37_, i_44_, class23.anInt495,
                                        i_33_, i_32_, true, i_38_, i, i_45_,
                                        i_35_, i_36_, i_34_, class1_sub3);
                            }
                            if ((class23.anInt489 ^ 0xffffffff) == -11
                                    && class23.anInt493 >= 0
                                    && ((class23.anInt493 ^ 0xffffffff)
                                    > ((Class68_Sub13_Sub4
                                    .aClass1_Sub6_Sub2Array3483).length
                                    ^ 0xffffffff))) {
                                Class1_Sub6_Sub2 class1_sub6_sub2_46_
                                        = (Class68_Sub13_Sub4
                                        .aClass1_Sub6_Sub2Array3483
                                        [class23.anInt493]);
                                if (class1_sub6_sub2_46_ != null) {
                                    int i_47_
                                            = (-((Class68_Sub7
                                            .aClass1_Sub6_Sub2_2860
                                            .anInt2561)
                                            / 32)
                                            + (class1_sub6_sub2_46_.anInt2561
                                            / 32));
                                    int i_48_
                                            = (class1_sub6_sub2_46_.anInt2537 / 32
                                            - (Class68_Sub7
                                            .aClass1_Sub6_Sub2_2860
                                            .anInt2537) / 32);
                                    method158(i_37_, i_48_, class23.anInt495,
                                            i_33_, i_32_, true, i_38_, i,
                                            i_47_, i_35_, i_36_, i_34_,
                                            class1_sub3);
                                }
                            }
                        }
                    }
                }
                int i_49_ = 0;
                int i_50_ = 0;
                int i_51_ = 0;
                if ((aShort3426 ^ 0xffffffff) != -1 && aShort3425 != 0) {
                    int i_52_ = Class62.anIntArray1155[i];
                    int i_53_ = Class62.anIntArray1167[i];
                    int i_54_ = aShort3426;
                    int i_55_ = aShort3425;
                    int i_56_ = -i_54_ / 2;
                    int i_57_ = -i_55_ / 2;
                    int i_58_
                            = -(i_52_ * i_56_) + i_53_ * i_57_ >> -1167294384;
                    int i_59_ = i_53_ * i_56_ + i_52_ * i_57_ >> -1961904976;
                    int i_60_ = i_54_ / 2;
                    int i_61_ = -i_55_ / 2;
                    int i_62_ = method163(i_59_ + anInt2561, GameSocket.anInt1149,
                            i_58_ + anInt2537, false);
                    int i_63_ = i_52_ * i_61_ - -(i_60_ * i_53_) >> -630227760;
                    int i_64_ = i_61_ * i_53_ + -(i_60_ * i_52_) >> 397580528;
                    int i_65_ = method163(anInt2561 + i_63_, GameSocket.anInt1149,
                            i_64_ + anInt2537, false);
                    int i_66_ = -i_54_ / 2;
                    int i_67_ = i_55_ / 2;
                    int i_68_ = i_66_ * i_53_ + i_52_ * i_67_ >> 1273859056;
                    int i_69_ = -(i_52_ * i_66_) + i_53_ * i_67_ >> 606108336;
                    int i_70_ = method163(i_68_ + anInt2561, GameSocket.anInt1149,
                            anInt2537 + i_69_, false);
                    int i_71_ = i_54_ / 2;
                    int i_72_ = i_55_ / 2;
                    int i_73_ = i_53_ * i_71_ + i_52_ * i_72_ >> 1893849104;
                    int i_74_ = -(i_52_ * i_71_) + i_72_ * i_53_ >> 1377446096;
                    int i_75_ = method163(i_73_ + anInt2561, GameSocket.anInt1149,
                            anInt2537 + i_74_, false);
                    i_51_ = i_75_ + i_62_;
                    int i_76_ = i_62_ >= i_65_ ? i_65_ : i_62_;
                    if ((i_51_ ^ 0xffffffff) < (i_65_ + i_70_ ^ 0xffffffff))
                        i_51_ = i_70_ + i_65_;
                    int i_77_ = i_70_ <= i_62_ ? i_70_ : i_62_;
                    int i_78_ = ((i_75_ ^ 0xffffffff) >= (i_65_ ^ 0xffffffff)
                            ? i_75_ : i_65_);
                    int i_79_ = i_75_ <= i_70_ ? i_75_ : i_70_;
                    i_50_ = 0x7ff & (int) (Math.atan2((double) (i_76_ - i_79_),
                            (double) i_55_)
                            * 325.95);
                    if ((i_50_ ^ 0xffffffff) != -1)
                        class1_sub3.method78(i_50_);
                    i_49_ = (int) (Math.atan2((double) (-i_78_ + i_77_),
                            (double) i_54_)
                            * 325.95) & 0x7ff;
                    if ((i_49_ ^ 0xffffffff) != -1)
                        class1_sub3.method85(i_49_);
                    i_51_ = -anInt2582 + (i_51_ >> -1892740159);
                    if ((i_51_ ^ 0xffffffff) != -1)
                        class1_sub3.method92(0, i_51_, 0);
                }
                Class1_Sub3 class1_sub3_80_ = null;
                if (!aBoolean3424 && (anInt2552 ^ 0xffffffff) != 0
                        && anInt2578 != -1) {
                    Class70 class70
                            = Class68_Sub20_Sub13.method1160(anInt2552, 1);
                    class1_sub3_80_ = class70.method1337(anInt2578, -10);
                    if (class1_sub3_80_ != null) {
                        class1_sub3_80_.method92(0, -anInt2560, 0);
                        if (class70.aBoolean1279) {
                            if (i_50_ != 0)
                                class1_sub3_80_.method78(i_50_);
                            if ((i_49_ ^ 0xffffffff) != -1)
                                class1_sub3_80_.method85(i_49_);
                            if ((i_51_ ^ 0xffffffff) != -1)
                                class1_sub3_80_.method92(0, i_51_, 0);
                        }
                    }
                }
                Class1_Sub3 class1_sub3_81_ = null;
                if (!aBoolean3424 && aClass1_Sub3_3411 != null) {
                    if (Class68_Sub3.anInt2812 >= anInt3439)
                        aClass1_Sub3_3411 = null;
                    if (Class68_Sub3.anInt2812 >= anInt3412
                            && (anInt3439 ^ 0xffffffff) < (Class68_Sub3.anInt2812
                            ^ 0xffffffff)) {
                        class1_sub3_81_ = aClass1_Sub3_3411;
                        class1_sub3_81_.method92(-anInt2561 + anInt3416,
                                anInt3434 - anInt2582,
                                anInt3407 - anInt2537);
                        if (anInt2533 == 512)
                            class1_sub3_81_.method88();
                        else if ((anInt2533 ^ 0xffffffff) == -1025)
                            class1_sub3_81_.method83();
                        else if (anInt2533 == 1536)
                            class1_sub3_81_.method80();
                    }
                }
                if (class1_sub3_80_ != null)
                    class1_sub3 = ((Class1_Sub3_Sub1) class1_sub3)
                            .method106(class1_sub3_80_);
                if (class1_sub3_81_ != null)
                    class1_sub3 = ((Class1_Sub3_Sub1) class1_sub3)
                            .method106(class1_sub3_81_);
                class1_sub3.aBoolean2443 = true;
                class1_sub3.method51(i, i_32_, i_33_, i_34_, i_35_, i_36_,
                        i_37_, i_38_, l);
                if (class1_sub3_81_ != null) {
                    if (anInt2533 == 512)
                        class1_sub3_81_.method80();
                    else if (anInt2533 != 1024) {
                        if ((anInt2533 ^ 0xffffffff) == -1537)
                            class1_sub3_81_.method88();
                    } else
                        class1_sub3_81_.method83();
                    class1_sub3_81_.method92(anInt2561 - anInt3416,
                            -anInt3434 + anInt2582,
                            -anInt3407 + anInt2537);
                }
            }
        }
    }

    public static void method161(int i) {
        if (i != 64)
            aRSString_3442 = null;
        anInt3437++;
        Class68_Sub13_Sub10.anInt3595 = Class124.anInt2139;
        Canvas_Sub1.method47(false, i + 576);
        Class16.method292((byte) 124);
        Class71.method1340(i ^ ~0x40, Class68_Sub13_Sub10.anInt3595);
        Class68_Sub7.aClass1_Sub6_Sub2_2860 = new Class1_Sub6_Sub2();
        Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561 = 3000;
        Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537 = 3000;
        Class43.method481(i ^ 0x43, Class52.aClass21_Sub1_1011);
        Class17.method296(10, (byte) -94);
    }

    public int method56() {
        anInt3436++;
        return anInt2566;
    }

    public static void method162(byte i) {
        aRSString_3429 = null;
        if (i <= 27)
            method162((byte) 69);
        aRSString_3428 = null;
        aLogin_3418 = null;
        aRSString_3441 = null;
        anIntArray3430 = null;
        aRSString_3442 = null;
        aRSString_3413 = null;
        aRSString_3440 = null;
    }

    public static int method163(int i, int i_82_, int i_83_, boolean bool) {
        anInt3405++;
        int i_84_ = i_83_ >> -1075247801;
        int i_85_ = i >> 560014343;
        if ((i_85_ ^ 0xffffffff) > -1 || i_84_ < 0
                || (i_85_ ^ 0xffffffff) < -104 || (i_84_ ^ 0xffffffff) < -104)
            return 0;
        int i_86_ = i_82_;
        int i_87_ = 0x7f & i;
        int i_88_ = i_83_ & 0x7f;
        if (bool != false)
            return -41;
        if (i_86_ < 3
                && (Class64.aByteArrayArrayArray1178[1][i_85_][i_84_] & 0x2) == 2)
            i_86_++;
        int i_89_
                = ((Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_86_][1 + i_85_]
                [i_84_]) * i_87_
                + (-i_87_ + 128) * (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                [i_86_][i_85_][i_84_])) >> -303145273;
        int i_90_ = ((i_87_ * (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                [i_86_][i_85_ + 1][1 + i_84_])
                + (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i_86_]
                [i_85_][i_84_ + 1]) * (-i_87_ + 128))
                >> -599314009);
        return (-i_88_ + 128) * i_89_ - -(i_90_ * i_88_) >> -558759673;
    }

    public static int method164(int i, int i_91_) {
        if (i < 94)
            method164(-31, -69);
        anInt3403++;
        return 0x3f & i_91_ >> -1110562197;
    }

    public Class1_Sub6_Sub2() {
        anInt3401 = 0;
        anInt3402 = -1;
        anInt3421 = -1;
        anInt3412 = 0;
        anInt3409 = -1;
        aBoolean3424 = false;
        aShort3426 = (short) 0;
        anInt3427 = 0;
        anInt3431 = 0;
        aShort3425 = (short) 0;
        anInt3422 = -1;
        anInt3415 = 0;
        anInt3435 = -1;
        anInt3439 = 0;
    }

    static {
        aRSString_3429 = RSString.newRsString("blinken1:");
        aLogin_3418 = new Login(64);
        aRSString_3442 = RSString.newRsString("flash2:");
        aRSString_3440 = aRSString_3442;
        aRSString_3441 = aRSString_3442;
    }
}
