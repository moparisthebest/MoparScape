/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class108 {
    public static int anInt1824 = 0;
    public static Class45 aClass45_1825;
    public static int anInt1826 = 0;
    public static Class98 aClass98_1827 = new Class98(4);
    public static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array1828;
    public static int anInt1829;
    public static boolean aBoolean1830 = true;
    public static RSString aRSString_1831 = RSString.newRsString("Weiter");
    public static Frame aFrame1832;
    public static Class68_Sub1[][][] aClass68_Sub1ArrayArrayArray1833;

    public static void method1655(Class68_Sub1 class68_sub1, boolean bool) {
        Class72.aClass16_1312.method286(class68_sub1, true);
        for (; ; ) {
            Class68_Sub1 class68_sub1_0_
                    = (Class68_Sub1) Class72.aClass16_1312.method294(-115);
            if (class68_sub1_0_ == null)
                break;
            if (class68_sub1_0_.aBoolean2770) {
                int i = class68_sub1_0_.anInt2763;
                int i_1_ = class68_sub1_0_.anInt2782;
                int i_2_ = class68_sub1_0_.anInt2767;
                int i_3_ = class68_sub1_0_.anInt2765;
                Class68_Sub1[][] class68_sub1s
                        = Class22.aClass68_Sub1ArrayArrayArray484[i_2_];
                if (class68_sub1_0_.aBoolean2769) {
                    if (bool) {
                        if (i_2_ > 0) {
                            Class68_Sub1 class68_sub1_4_
                                    = (Class22.aClass68_Sub1ArrayArrayArray484
                                    [i_2_ - 1][i][i_1_]);
                            if (class68_sub1_4_ != null
                                    && class68_sub1_4_.aBoolean2770)
                                continue;
                        }
                        if (i <= Class68_Sub20_Sub10.anInt4319
                                && i > Class69.anInt1239) {
                            Class68_Sub1 class68_sub1_5_
                                    = class68_sub1s[i - 1][i_1_];
                            if (class68_sub1_5_ != null
                                    && class68_sub1_5_.aBoolean2770
                                    && (class68_sub1_5_.aBoolean2769
                                    || (class68_sub1_0_.anInt2768 & 0x1) == 0))
                                continue;
                        }
                        if (i >= Class68_Sub20_Sub10.anInt4319
                                && i < Class30.anInt549 - 1) {
                            Class68_Sub1 class68_sub1_6_
                                    = class68_sub1s[i + 1][i_1_];
                            if (class68_sub1_6_ != null
                                    && class68_sub1_6_.aBoolean2770
                                    && (class68_sub1_6_.aBoolean2769
                                    || (class68_sub1_0_.anInt2768 & 0x4) == 0))
                                continue;
                        }
                        if (i_1_ <= Class68_Sub26.anInt3186
                                && i_1_ > Class85.anInt1557) {
                            Class68_Sub1 class68_sub1_7_
                                    = class68_sub1s[i][i_1_ - 1];
                            if (class68_sub1_7_ != null
                                    && class68_sub1_7_.aBoolean2770
                                    && (class68_sub1_7_.aBoolean2769
                                    || (class68_sub1_0_.anInt2768 & 0x8) == 0))
                                continue;
                        }
                        if (i_1_ >= Class68_Sub26.anInt3186
                                && i_1_ < ISAACRandomGen.anInt1493 - 1) {
                            Class68_Sub1 class68_sub1_8_
                                    = class68_sub1s[i][i_1_ + 1];
                            if (class68_sub1_8_ != null
                                    && class68_sub1_8_.aBoolean2770
                                    && (class68_sub1_8_.aBoolean2769
                                    || (class68_sub1_0_.anInt2768 & 0x2) == 0))
                                continue;
                        }
                    } else
                        bool = true;
                    class68_sub1_0_.aBoolean2769 = false;
                    if (class68_sub1_0_.aClass68_Sub1_2780 != null) {
                        Class68_Sub1 class68_sub1_9_
                                = class68_sub1_0_.aClass68_Sub1_2780;
                        if (class68_sub1_9_.aClass7_2758 != null) {
                            if (!Class21renamed.method361(0, i, i_1_))
                                Class68_Sub16.method983((class68_sub1_9_
                                        .aClass7_2758),
                                        0,
                                        Class13_Sub2.anInt2651,
                                        Class66.anInt1205,
                                        Class128.anInt2220,
                                        Class16.anInt278, i,
                                        i_1_, false);
                            else
                                Class68_Sub16.method983((class68_sub1_9_
                                        .aClass7_2758),
                                        0,
                                        Class13_Sub2.anInt2651,
                                        Class66.anInt1205,
                                        Class128.anInt2220,
                                        Class16.anInt278, i,
                                        i_1_, true);
                        } else if (class68_sub1_9_.aClass77_2779 != null) {
                            if (!Class21renamed.method361(0, i, i_1_))
                                Class68_Sub13_Sub16.method778
                                        (class68_sub1_9_.aClass77_2779,
                                                Class13_Sub2.anInt2651, Class66.anInt1205,
                                                Class128.anInt2220, Class16.anInt278, i,
                                                i_1_, false);
                            else
                                Class68_Sub13_Sub16.method778
                                        (class68_sub1_9_.aClass77_2779,
                                                Class13_Sub2.anInt2651, Class66.anInt1205,
                                                Class128.anInt2220, Class16.anInt278, i,
                                                i_1_, true);
                        }
                        Class64 class64 = class68_sub1_9_.aClass64_2757;
                        if (class64 != null)
                            class64.aClass1_1181.method51
                                    (0, Class13_Sub2.anInt2651, Class66.anInt1205,
                                            Class128.anInt2220, Class16.anInt278,
                                            class64.anInt1183 - Class25.anInt518,
                                            class64.anInt1186 - Class68_Sub17.anInt3033,
                                            (class64.anInt1176
                                                    - Class68_Sub20_Sub12.anInt4355),
                                            class64.aLong1185);
                        for (int i_10_ = 0; i_10_ < class68_sub1_9_.anInt2771;
                             i_10_++) {
                            Class69 class69
                                    = class68_sub1_9_.aClass69Array2772[i_10_];
                            if (class69 != null)
                                class69.aClass1_1242.method51
                                        (class69.anInt1255, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278,
                                                class69.anInt1262 - Class25.anInt518,
                                                (class69.anInt1252
                                                        - Class68_Sub17.anInt3033),
                                                (class69.anInt1250
                                                        - Class68_Sub20_Sub12.anInt4355),
                                                class69.aLong1243);
                        }
                    }
                    boolean bool_11_ = false;
                    if (class68_sub1_0_.aClass7_2758 != null) {
                        if (!Class21renamed.method361(i_3_, i, i_1_)) {
                            bool_11_ = true;
                            if ((class68_sub1_0_.aClass7_2758.anInt129
                                    != 12345678)
                                    || (Stream.aBoolean2984
                                    && i_2_ <= Class68_Sub20_Sub5.anInt4225))
                                Class68_Sub16.method983((class68_sub1_0_
                                        .aClass7_2758),
                                        i_3_,
                                        Class13_Sub2.anInt2651,
                                        Class66.anInt1205,
                                        Class128.anInt2220,
                                        Class16.anInt278, i,
                                        i_1_, false);
                        } else
                            Class68_Sub16.method983((class68_sub1_0_
                                    .aClass7_2758),
                                    i_3_,
                                    Class13_Sub2.anInt2651,
                                    Class66.anInt1205,
                                    Class128.anInt2220,
                                    Class16.anInt278, i, i_1_,
                                    true);
                    } else if (class68_sub1_0_.aClass77_2779 != null) {
                        if (!Class21renamed.method361(i_3_, i, i_1_)) {
                            bool_11_ = true;
                            Class68_Sub13_Sub16.method778
                                    (class68_sub1_0_.aClass77_2779,
                                            Class13_Sub2.anInt2651, Class66.anInt1205,
                                            Class128.anInt2220, Class16.anInt278, i, i_1_,
                                            false);
                        } else
                            Class68_Sub13_Sub16.method778
                                    (class68_sub1_0_.aClass77_2779,
                                            Class13_Sub2.anInt2651, Class66.anInt1205,
                                            Class128.anInt2220, Class16.anInt278, i, i_1_,
                                            true);
                    }
                    if (bool_11_) {
                        Class47 class47 = class68_sub1_0_.aClass47_2777;
                        if (class47 != null
                                && (class47.aLong943 & 0x80000000L) != 0L)
                            class47.aClass1_931.method51
                                    (0, Class13_Sub2.anInt2651, Class66.anInt1205,
                                            Class128.anInt2220, Class16.anInt278,
                                            class47.anInt941 - Class25.anInt518,
                                            class47.anInt937 - Class68_Sub17.anInt3033,
                                            (class47.anInt932
                                                    - Class68_Sub20_Sub12.anInt4355),
                                            class47.aLong943);
                    }
                    int i_12_ = 0;
                    int i_13_ = 0;
                    Class64 class64 = class68_sub1_0_.aClass64_2757;
                    Class76 class76 = class68_sub1_0_.aClass76_2764;
                    if (class64 != null || class76 != null) {
                        if (Class68_Sub20_Sub10.anInt4319 == i)
                            i_12_++;
                        else if (Class68_Sub20_Sub10.anInt4319 < i)
                            i_12_ += 2;
                        if (Class68_Sub26.anInt3186 == i_1_)
                            i_12_ += 3;
                        else if (Class68_Sub26.anInt3186 > i_1_)
                            i_12_ += 6;
                        i_13_ = Class69.anIntArray1257[i_12_];
                        class68_sub1_0_.anInt2773
                                = PacketStream.anIntArray4132[i_12_];
                    }
                    if (class64 != null) {
                        if ((class64.anInt1187
                                & Class72_Sub1.anIntArray3273[i_12_])
                                != 0) {
                            if (class64.anInt1187 == 16) {
                                class68_sub1_0_.anInt2778 = 3;
                                class68_sub1_0_.anInt2774
                                        = Class115.anIntArray1943[i_12_];
                                class68_sub1_0_.anInt2776
                                        = 3 - class68_sub1_0_.anInt2774;
                            } else if (class64.anInt1187 == 32) {
                                class68_sub1_0_.anInt2778 = 6;
                                class68_sub1_0_.anInt2774
                                        = Class63.anIntArray1175[i_12_];
                                class68_sub1_0_.anInt2776
                                        = 6 - class68_sub1_0_.anInt2774;
                            } else if (class64.anInt1187 == 64) {
                                class68_sub1_0_.anInt2778 = 12;
                                class68_sub1_0_.anInt2774
                                        = Class63.anIntArray1174[i_12_];
                                class68_sub1_0_.anInt2776
                                        = 12 - class68_sub1_0_.anInt2774;
                            } else {
                                class68_sub1_0_.anInt2778 = 9;
                                class68_sub1_0_.anInt2774
                                        = Class68_Sub13.anIntArray2944[i_12_];
                                class68_sub1_0_.anInt2776
                                        = 9 - class68_sub1_0_.anInt2774;
                            }
                        } else
                            class68_sub1_0_.anInt2778 = 0;
                        if ((class64.anInt1187 & i_13_) != 0
                                && !Class68_Sub13_Sub27.method840(i_3_, i, i_1_,
                                (class64
                                        .anInt1187)))
                            class64.aClass1_1181.method51
                                    (0, Class13_Sub2.anInt2651, Class66.anInt1205,
                                            Class128.anInt2220, Class16.anInt278,
                                            class64.anInt1183 - Class25.anInt518,
                                            class64.anInt1186 - Class68_Sub17.anInt3033,
                                            (class64.anInt1176
                                                    - Class68_Sub20_Sub12.anInt4355),
                                            class64.aLong1185);
                        if ((class64.anInt1177 & i_13_) != 0
                                && !Class68_Sub13_Sub27.method840(i_3_, i, i_1_,
                                (class64
                                        .anInt1177)))
                            class64.aClass1_1184.method51
                                    (0, Class13_Sub2.anInt2651, Class66.anInt1205,
                                            Class128.anInt2220, Class16.anInt278,
                                            class64.anInt1183 - Class25.anInt518,
                                            class64.anInt1186 - Class68_Sub17.anInt3033,
                                            (class64.anInt1176
                                                    - Class68_Sub20_Sub12.anInt4355),
                                            class64.aLong1185);
                    }
                    if (class76 != null
                            && !Class68_Sub13_Sub16.method777(i_3_, i, i_1_,
                            class76
                                    .aClass1_1358
                                    .method56())) {
                        if ((class76.anInt1362 & i_13_) != 0)
                            class76.aClass1_1358.method51
                                    (0, Class13_Sub2.anInt2651, Class66.anInt1205,
                                            Class128.anInt2220, Class16.anInt278,
                                            (class76.anInt1349 - Class25.anInt518
                                                    + class76.anInt1356),
                                            class76.anInt1361 - Class68_Sub17.anInt3033,
                                            (class76.anInt1352
                                                    - Class68_Sub20_Sub12.anInt4355
                                                    + class76.anInt1363),
                                            class76.aLong1364);
                        else if (class76.anInt1362 == 256) {
                            int i_14_ = class76.anInt1349 - Class25.anInt518;
                            int i_15_
                                    = class76.anInt1361 - Class68_Sub17.anInt3033;
                            int i_16_ = (class76.anInt1352
                                    - Class68_Sub20_Sub12.anInt4355);
                            int i_17_ = class76.anInt1359;
                            int i_18_;
                            if (i_17_ == 1 || i_17_ == 2)
                                i_18_ = -i_14_;
                            else
                                i_18_ = i_14_;
                            int i_19_;
                            if (i_17_ == 2 || i_17_ == 3)
                                i_19_ = -i_16_;
                            else
                                i_19_ = i_16_;
                            if (i_19_ < i_18_)
                                class76.aClass1_1358.method51
                                        (0, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278,
                                                i_14_ + class76.anInt1356, i_15_,
                                                i_16_ + class76.anInt1363,
                                                class76.aLong1364);
                            else if (class76.aClass1_1360 != null)
                                class76.aClass1_1360.method51
                                        (0, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278, i_14_, i_15_, i_16_,
                                                class76.aLong1364);
                        }
                    }
                    if (bool_11_) {
                        Class47 class47 = class68_sub1_0_.aClass47_2777;
                        if (class47 != null
                                && (class47.aLong943 & 0x80000000L) == 0L)
                            class47.aClass1_931.method51
                                    (0, Class13_Sub2.anInt2651, Class66.anInt1205,
                                            Class128.anInt2220, Class16.anInt278,
                                            class47.anInt941 - Class25.anInt518,
                                            class47.anInt937 - Class68_Sub17.anInt3033,
                                            (class47.anInt932
                                                    - Class68_Sub20_Sub12.anInt4355),
                                            class47.aLong943);
                        Class57 class57 = class68_sub1_0_.aClass57_2759;
                        if (class57 != null && class57.anInt1069 == 0) {
                            if (class57.aClass1_1073 != null)
                                class57.aClass1_1073.method51
                                        (0, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278,
                                                class57.anInt1074 - Class25.anInt518,
                                                (class57.anInt1085
                                                        - Class68_Sub17.anInt3033),
                                                (class57.anInt1075
                                                        - Class68_Sub20_Sub12.anInt4355),
                                                class57.aLong1071);
                            if (class57.aClass1_1078 != null)
                                class57.aClass1_1078.method51
                                        (0, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278,
                                                class57.anInt1074 - Class25.anInt518,
                                                (class57.anInt1085
                                                        - Class68_Sub17.anInt3033),
                                                (class57.anInt1075
                                                        - Class68_Sub20_Sub12.anInt4355),
                                                class57.aLong1071);
                            if (class57.aClass1_1083 != null)
                                class57.aClass1_1083.method51
                                        (0, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278,
                                                class57.anInt1074 - Class25.anInt518,
                                                (class57.anInt1085
                                                        - Class68_Sub17.anInt3033),
                                                (class57.anInt1075
                                                        - Class68_Sub20_Sub12.anInt4355),
                                                class57.aLong1071);
                        }
                    }
                    int i_20_ = class68_sub1_0_.anInt2768;
                    if (i_20_ != 0) {
                        if (i < Class68_Sub20_Sub10.anInt4319
                                && (i_20_ & 0x4) != 0) {
                            Class68_Sub1 class68_sub1_21_
                                    = class68_sub1s[i + 1][i_1_];
                            if (class68_sub1_21_ != null
                                    && class68_sub1_21_.aBoolean2770)
                                Class72.aClass16_1312
                                        .method286(class68_sub1_21_, true);
                        }
                        if (i_1_ < Class68_Sub26.anInt3186
                                && (i_20_ & 0x2) != 0) {
                            Class68_Sub1 class68_sub1_22_
                                    = class68_sub1s[i][i_1_ + 1];
                            if (class68_sub1_22_ != null
                                    && class68_sub1_22_.aBoolean2770)
                                Class72.aClass16_1312
                                        .method286(class68_sub1_22_, true);
                        }
                        if (i > Class68_Sub20_Sub10.anInt4319
                                && (i_20_ & 0x1) != 0) {
                            Class68_Sub1 class68_sub1_23_
                                    = class68_sub1s[i - 1][i_1_];
                            if (class68_sub1_23_ != null
                                    && class68_sub1_23_.aBoolean2770)
                                Class72.aClass16_1312
                                        .method286(class68_sub1_23_, true);
                        }
                        if (i_1_ > Class68_Sub26.anInt3186
                                && (i_20_ & 0x8) != 0) {
                            Class68_Sub1 class68_sub1_24_
                                    = class68_sub1s[i][i_1_ - 1];
                            if (class68_sub1_24_ != null
                                    && class68_sub1_24_.aBoolean2770)
                                Class72.aClass16_1312
                                        .method286(class68_sub1_24_, true);
                        }
                    }
                }
                if (class68_sub1_0_.anInt2778 != 0) {
                    boolean bool_25_ = true;
                    for (int i_26_ = 0; i_26_ < class68_sub1_0_.anInt2771;
                         i_26_++) {
                        if ((class68_sub1_0_.aClass69Array2772[i_26_].anInt1260
                                != Class68_Sub1.anInt2756)
                                && ((class68_sub1_0_.anIntArray2766[i_26_]
                                & class68_sub1_0_.anInt2778)
                                == class68_sub1_0_.anInt2774)) {
                            bool_25_ = false;
                            break;
                        }
                    }
                    if (bool_25_) {
                        Class64 class64 = class68_sub1_0_.aClass64_2757;
                        if (!Class68_Sub13_Sub27.method840(i_3_, i, i_1_,
                                class64.anInt1187))
                            class64.aClass1_1181.method51
                                    (0, Class13_Sub2.anInt2651, Class66.anInt1205,
                                            Class128.anInt2220, Class16.anInt278,
                                            class64.anInt1183 - Class25.anInt518,
                                            class64.anInt1186 - Class68_Sub17.anInt3033,
                                            (class64.anInt1176
                                                    - Class68_Sub20_Sub12.anInt4355),
                                            class64.aLong1185);
                        class68_sub1_0_.anInt2778 = 0;
                    }
                }
                if (class68_sub1_0_.aBoolean2781) {
                    try {
                        int i_27_ = class68_sub1_0_.anInt2771;
                        class68_sub1_0_.aBoolean2781 = false;
                        int i_28_ = 0;
                        while_149_:
                        for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
                            Class69 class69
                                    = class68_sub1_0_.aClass69Array2772[i_29_];
                            if (class69.anInt1260 != Class68_Sub1.anInt2756) {
                                for (int i_30_ = class69.anInt1254;
                                     i_30_ <= class69.anInt1238; i_30_++) {
                                    for (int i_31_ = class69.anInt1253;
                                         i_31_ <= class69.anInt1234; i_31_++) {
                                        Class68_Sub1 class68_sub1_32_
                                                = class68_sub1s[i_30_][i_31_];
                                        if (class68_sub1_32_.aBoolean2769) {
                                            class68_sub1_0_.aBoolean2781
                                                    = true;
                                            continue while_149_;
                                        }
                                        if (class68_sub1_32_.anInt2778 != 0) {
                                            int i_33_ = 0;
                                            if (i_30_ > class69.anInt1254)
                                                i_33_++;
                                            if (i_30_ < class69.anInt1238)
                                                i_33_ += 4;
                                            if (i_31_ > class69.anInt1253)
                                                i_33_ += 8;
                                            if (i_31_ < class69.anInt1234)
                                                i_33_ += 2;
                                            if ((i_33_
                                                    & class68_sub1_32_.anInt2778)
                                                    == class68_sub1_0_.anInt2776) {
                                                class68_sub1_0_.aBoolean2781
                                                        = true;
                                                continue while_149_;
                                            }
                                        }
                                    }
                                }
                                Class75_Sub1.aClass69Array3306[i_28_++]
                                        = class69;
                                int i_34_ = (Class68_Sub20_Sub10.anInt4319
                                        - class69.anInt1254);
                                int i_35_ = (class69.anInt1238
                                        - Class68_Sub20_Sub10.anInt4319);
                                if (i_35_ > i_34_)
                                    i_34_ = i_35_;
                                int i_36_ = (Class68_Sub26.anInt3186
                                        - class69.anInt1253);
                                int i_37_ = (class69.anInt1234
                                        - Class68_Sub26.anInt3186);
                                if (i_37_ > i_36_)
                                    class69.anInt1256 = i_34_ + i_37_;
                                else
                                    class69.anInt1256 = i_34_ + i_36_;
                            }
                        }
                        while (i_28_ > 0) {
                            int i_38_ = -50;
                            int i_39_ = -1;
                            for (int i_40_ = 0; i_40_ < i_28_; i_40_++) {
                                Class69 class69
                                        = Class75_Sub1.aClass69Array3306[i_40_];
                                if (class69.anInt1260
                                        != Class68_Sub1.anInt2756) {
                                    if (class69.anInt1256 > i_38_) {
                                        i_38_ = class69.anInt1256;
                                        i_39_ = i_40_;
                                    } else if (class69.anInt1256 == i_38_) {
                                        int i_41_ = (class69.anInt1262
                                                - Class25.anInt518);
                                        int i_42_ = (class69.anInt1250
                                                - (Class68_Sub20_Sub12
                                                .anInt4355));
                                        int i_43_
                                                = ((Class75_Sub1.aClass69Array3306
                                                [i_39_].anInt1262)
                                                - Class25.anInt518);
                                        int i_44_
                                                = ((Class75_Sub1.aClass69Array3306
                                                [i_39_].anInt1250)
                                                - (Class68_Sub20_Sub12
                                                .anInt4355));
                                        if (i_41_ * i_41_ + i_42_ * i_42_
                                                > i_43_ * i_43_ + i_44_ * i_44_)
                                            i_39_ = i_40_;
                                    }
                                }
                            }
                            if (i_39_ == -1)
                                break;
                            Class69 class69
                                    = Class75_Sub1.aClass69Array3306[i_39_];
                            class69.anInt1260 = Class68_Sub1.anInt2756;
                            if (!Class68_Sub13_Sub10.method740
                                    (i_3_, class69.anInt1254, class69.anInt1238,
                                            class69.anInt1253, class69.anInt1234,
                                            class69.aClass1_1242.method56()))
                                class69.aClass1_1242.method51
                                        (class69.anInt1255, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278,
                                                class69.anInt1262 - Class25.anInt518,
                                                (class69.anInt1252
                                                        - Class68_Sub17.anInt3033),
                                                (class69.anInt1250
                                                        - Class68_Sub20_Sub12.anInt4355),
                                                class69.aLong1243);
                            for (int i_45_ = class69.anInt1254;
                                 i_45_ <= class69.anInt1238; i_45_++) {
                                for (int i_46_ = class69.anInt1253;
                                     i_46_ <= class69.anInt1234; i_46_++) {
                                    Class68_Sub1 class68_sub1_47_
                                            = class68_sub1s[i_45_][i_46_];
                                    if (class68_sub1_47_.anInt2778 != 0)
                                        Class72.aClass16_1312
                                                .method286(class68_sub1_47_, true);
                                    else if ((i_45_ != i || i_46_ != i_1_)
                                            && class68_sub1_47_.aBoolean2770)
                                        Class72.aClass16_1312
                                                .method286(class68_sub1_47_, true);
                                }
                            }
                        }
                        if (class68_sub1_0_.aBoolean2781)
                            continue;
                    } catch (Exception exception) {
                        class68_sub1_0_.aBoolean2781 = false;
                    }
                }
                if (class68_sub1_0_.aBoolean2770) {
                    if (class68_sub1_0_.anInt2778 == 0) {
                        if (i <= Class68_Sub20_Sub10.anInt4319
                                && i > Class69.anInt1239) {
                            Class68_Sub1 class68_sub1_48_
                                    = class68_sub1s[i - 1][i_1_];
                            if (class68_sub1_48_ != null
                                    && class68_sub1_48_.aBoolean2770)
                                continue;
                        }
                        if (i >= Class68_Sub20_Sub10.anInt4319
                                && i < Class30.anInt549 - 1) {
                            Class68_Sub1 class68_sub1_49_
                                    = class68_sub1s[i + 1][i_1_];
                            if (class68_sub1_49_ != null
                                    && class68_sub1_49_.aBoolean2770)
                                continue;
                        }
                        if (i_1_ <= Class68_Sub26.anInt3186
                                && i_1_ > Class85.anInt1557) {
                            Class68_Sub1 class68_sub1_50_
                                    = class68_sub1s[i][i_1_ - 1];
                            if (class68_sub1_50_ != null
                                    && class68_sub1_50_.aBoolean2770)
                                continue;
                        }
                        if (i_1_ >= Class68_Sub26.anInt3186
                                && i_1_ < ISAACRandomGen.anInt1493 - 1) {
                            Class68_Sub1 class68_sub1_51_
                                    = class68_sub1s[i][i_1_ + 1];
                            if (class68_sub1_51_ != null
                                    && class68_sub1_51_.aBoolean2770)
                                continue;
                        }
                        class68_sub1_0_.aBoolean2770 = false;
                        Class68_Sub13_Sub11.anInt3618--;
                        Class57 class57 = class68_sub1_0_.aClass57_2759;
                        if (class57 != null && class57.anInt1069 != 0) {
                            if (class57.aClass1_1073 != null)
                                class57.aClass1_1073.method51
                                        (0, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278,
                                                class57.anInt1074 - Class25.anInt518,
                                                (class57.anInt1085
                                                        - Class68_Sub17.anInt3033
                                                        - class57.anInt1069),
                                                (class57.anInt1075
                                                        - Class68_Sub20_Sub12.anInt4355),
                                                class57.aLong1071);
                            if (class57.aClass1_1078 != null)
                                class57.aClass1_1078.method51
                                        (0, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278,
                                                class57.anInt1074 - Class25.anInt518,
                                                (class57.anInt1085
                                                        - Class68_Sub17.anInt3033
                                                        - class57.anInt1069),
                                                (class57.anInt1075
                                                        - Class68_Sub20_Sub12.anInt4355),
                                                class57.aLong1071);
                            if (class57.aClass1_1083 != null)
                                class57.aClass1_1083.method51
                                        (0, Class13_Sub2.anInt2651,
                                                Class66.anInt1205, Class128.anInt2220,
                                                Class16.anInt278,
                                                class57.anInt1074 - Class25.anInt518,
                                                (class57.anInt1085
                                                        - Class68_Sub17.anInt3033
                                                        - class57.anInt1069),
                                                (class57.anInt1075
                                                        - Class68_Sub20_Sub12.anInt4355),
                                                class57.aLong1071);
                        }
                        if (class68_sub1_0_.anInt2773 != 0) {
                            Class76 class76 = class68_sub1_0_.aClass76_2764;
                            if (class76 != null
                                    && !(Class68_Sub13_Sub16.method777
                                    (i_3_, i, i_1_,
                                            class76.aClass1_1358.method56()))) {
                                if ((class76.anInt1362
                                        & class68_sub1_0_.anInt2773)
                                        != 0)
                                    class76.aClass1_1358.method51
                                            (0, Class13_Sub2.anInt2651,
                                                    Class66.anInt1205, Class128.anInt2220,
                                                    Class16.anInt278,
                                                    (class76.anInt1349 - Class25.anInt518
                                                            + class76.anInt1356),
                                                    (class76.anInt1361
                                                            - Class68_Sub17.anInt3033),
                                                    (class76.anInt1352
                                                            - Class68_Sub20_Sub12.anInt4355
                                                            + class76.anInt1363),
                                                    class76.aLong1364);
                                else if (class76.anInt1362 == 256) {
                                    int i_52_
                                            = class76.anInt1349 - Class25.anInt518;
                                    int i_53_ = (class76.anInt1361
                                            - Class68_Sub17.anInt3033);
                                    int i_54_
                                            = (class76.anInt1352
                                            - Class68_Sub20_Sub12.anInt4355);
                                    int i_55_ = class76.anInt1359;
                                    int i_56_;
                                    if (i_55_ == 1 || i_55_ == 2)
                                        i_56_ = -i_52_;
                                    else
                                        i_56_ = i_52_;
                                    int i_57_;
                                    if (i_55_ == 2 || i_55_ == 3)
                                        i_57_ = -i_54_;
                                    else
                                        i_57_ = i_54_;
                                    if (i_57_ >= i_56_)
                                        class76.aClass1_1358.method51
                                                (0, Class13_Sub2.anInt2651,
                                                        Class66.anInt1205,
                                                        Class128.anInt2220,
                                                        Class16.anInt278,
                                                        i_52_ + class76.anInt1356, i_53_,
                                                        i_54_ + class76.anInt1363,
                                                        class76.aLong1364);
                                    else if (class76.aClass1_1360 != null)
                                        class76.aClass1_1360.method51
                                                (0, Class13_Sub2.anInt2651,
                                                        Class66.anInt1205,
                                                        Class128.anInt2220,
                                                        Class16.anInt278, i_52_, i_53_,
                                                        i_54_, class76.aLong1364);
                                }
                            }
                            Class64 class64 = class68_sub1_0_.aClass64_2757;
                            if (class64 != null) {
                                if ((class64.anInt1177
                                        & class68_sub1_0_.anInt2773) != 0
                                        && !(Class68_Sub13_Sub27.method840
                                        (i_3_, i, i_1_, class64.anInt1177)))
                                    class64.aClass1_1184.method51
                                            (0, Class13_Sub2.anInt2651,
                                                    Class66.anInt1205, Class128.anInt2220,
                                                    Class16.anInt278,
                                                    class64.anInt1183 - Class25.anInt518,
                                                    (class64.anInt1186
                                                            - Class68_Sub17.anInt3033),
                                                    (class64.anInt1176
                                                            - Class68_Sub20_Sub12.anInt4355),
                                                    class64.aLong1185);
                                if ((class64.anInt1187
                                        & class68_sub1_0_.anInt2773) != 0
                                        && !(Class68_Sub13_Sub27.method840
                                        (i_3_, i, i_1_, class64.anInt1187)))
                                    class64.aClass1_1181.method51
                                            (0, Class13_Sub2.anInt2651,
                                                    Class66.anInt1205, Class128.anInt2220,
                                                    Class16.anInt278,
                                                    class64.anInt1183 - Class25.anInt518,
                                                    (class64.anInt1186
                                                            - Class68_Sub17.anInt3033),
                                                    (class64.anInt1176
                                                            - Class68_Sub20_Sub12.anInt4355),
                                                    class64.aLong1185);
                            }
                        }
                        if (i_2_ < Class86.anInt1582 - 1) {
                            Class68_Sub1 class68_sub1_58_
                                    = (Class22.aClass68_Sub1ArrayArrayArray484
                                    [i_2_ + 1][i][i_1_]);
                            if (class68_sub1_58_ != null
                                    && class68_sub1_58_.aBoolean2770)
                                Class72.aClass16_1312
                                        .method286(class68_sub1_58_, true);
                        }
                        if (i < Class68_Sub20_Sub10.anInt4319) {
                            Class68_Sub1 class68_sub1_59_
                                    = class68_sub1s[i + 1][i_1_];
                            if (class68_sub1_59_ != null
                                    && class68_sub1_59_.aBoolean2770)
                                Class72.aClass16_1312
                                        .method286(class68_sub1_59_, true);
                        }
                        if (i_1_ < Class68_Sub26.anInt3186) {
                            Class68_Sub1 class68_sub1_60_
                                    = class68_sub1s[i][i_1_ + 1];
                            if (class68_sub1_60_ != null
                                    && class68_sub1_60_.aBoolean2770)
                                Class72.aClass16_1312
                                        .method286(class68_sub1_60_, true);
                        }
                        if (i > Class68_Sub20_Sub10.anInt4319) {
                            Class68_Sub1 class68_sub1_61_
                                    = class68_sub1s[i - 1][i_1_];
                            if (class68_sub1_61_ != null
                                    && class68_sub1_61_.aBoolean2770)
                                Class72.aClass16_1312
                                        .method286(class68_sub1_61_, true);
                        }
                        if (i_1_ > Class68_Sub26.anInt3186) {
                            Class68_Sub1 class68_sub1_62_
                                    = class68_sub1s[i][i_1_ - 1];
                            if (class68_sub1_62_ != null
                                    && class68_sub1_62_.aBoolean2770)
                                Class72.aClass16_1312
                                        .method286(class68_sub1_62_, true);
                        }
                    }
                }
            }
        }
    }

    public static void method1656(int i) {
        aClass68_Sub20_Sub10Array1828 = null;
        aClass68_Sub1ArrayArrayArray1833 = null;
        aClass98_1827 = null;
        aClass45_1825 = null;
        if (i != 29889)
            anInt1829 = 69;
        aRSString_1831 = null;
        aFrame1832 = null;
    }
}
