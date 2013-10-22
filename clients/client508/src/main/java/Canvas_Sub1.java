/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.ActionEvent;

public class Canvas_Sub1 extends Canvas {
    public static int anInt45;
    public static int anInt46;
    public static int anInt47;
    public static int anInt48 = 0;
    public static int anInt49;
    public static int anInt50;
    public static RSString aRSString_51
            = RSString.newRsString("hint_mapmarkers");
    public static int anInt52;
    public Component aComponent53;

    public static void method46(SignLink class55, Object object, byte i) {
        do {
            try {
                if (i >= -49)
                    method48((byte) -99);
                anInt49++;
                if (class55.anEventQueue1056 != null) {
                    for (int i_0_ = 0;
                         (i_0_ < 50
                                 && class55.anEventQueue1056.peekEvent() != null);
                         i_0_++)
                        Class50.method528(-5, 1L);
                    if (object == null)
                        break;
                    class55.anEventQueue1056
                            .postEvent(new ActionEvent(object, 1001, "dummy"));
                }
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("hc.D("
                                + (class55 != null ? "{...}"
                                : "null")
                                + ','
                                + (object != null ? "{...}"
                                : "null")
                                + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    public void paint(Graphics graphics) {
        anInt50++;
        aComponent53.paint(graphics);
    }

    public static void method47(boolean bool, int i) {
        Class11.method234((byte) 99, Class68_Sub13_Sub9.height, bool,
                Class13_Sub3.width,
                Class68_Sub13_Sub10.anInt3595);
        anInt52++;
        if (i != 640)
            anInt45 = 80;
    }

    public static void method48(byte i) {
        aRSString_51 = null;
        int i_1_ = -74 % ((i - 43) / 60);
    }

    public void update(Graphics graphics) {
        aComponent53.update(graphics);
        anInt46++;
    }

    public static void method49(Class45 class45, int i, int i_2_, int i_3_,
                                byte i_4_) {
        Class49.method524(16322);
        anInt47++;
        Class79.method1427(i, i_2_, class45.anInt892 + i,
                class45.anInt873 + i_2_);
        if (i_4_ < -9) {
            if ((Class68_Sub9.anInt2882 ^ 0xffffffff) == -3
                    || Class68_Sub9.anInt2882 == 5
                    || GameSocket.aClass68_Sub20_Sub10_1144 == null)
                Class79.method1419(i, i_2_, 0, class45.anIntArray854,
                        class45.anIntArray783);
            else {
                int i_5_
                        = Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561 / 32 + 48;
                int i_6_
                        = 0x7ff & Class8.anInt163 - -Class68_Sub13_Sub26.anInt3883;
                int i_7_
                        = 464 - Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537 / 32;
                ((Sprite) GameSocket.aClass68_Sub20_Sub10_1144)
                        .method1132
                                (i, i_2_, class45.anInt892, class45.anInt873, i_5_, i_7_,
                                        i_6_, Class68_Sub20_Sub16.anInt4420 + 256,
                                        class45.anIntArray854, class45.anIntArray783);
                if (Class68_Sub13_Sub21.aClass91_3788 != null) {
                    for (int i_8_ = 0;
                         ((i_8_ ^ 0xffffffff)
                                 > (Class68_Sub13_Sub21.aClass91_3788.anInt1637
                                 ^ 0xffffffff));
                         i_8_++) {
                        if (Class68_Sub13_Sub21.aClass91_3788
                                .method1521((byte) 95, i_8_)) {
                            int i_9_
                                    = (2
                                    + 4 * (-Class68_Sub13_Sub35.anInt4026
                                    + (Class68_Sub13_Sub21.aClass91_3788
                                    .aShortArray1634[i_8_]))
                                    + -((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    .anInt2537)
                                    / 32));
                            int i_10_ = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    .anInt2561)
                                    / 32)
                                    + 2
                                    + ((Class68_Sub13_Sub21.aClass91_3788
                                    .aShortArray1631[i_8_])
                                    - Class36.anInt643) * 4);
                            int i_11_ = Class62.anIntArray1155[i_6_];
                            int i_12_ = Class62.anIntArray1167[i_6_];
                            i_12_ = (256 * i_12_
                                    / (256 + Class68_Sub20_Sub16.anInt4420));
                            Class68_Sub20_Sub1 class68_sub20_sub1
                                    = Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3801;
                            i_11_ = (256 * i_11_
                                    / (256 + Class68_Sub20_Sub16.anInt4420));
                            int i_13_
                                    = i_9_ * i_11_ + i_10_ * i_12_ >> -242397904;
                            int i_14_
                                    = i_12_ * i_9_ - i_11_ * i_10_ >> 1531632048;
                            if (Class68_Sub13_Sub21.aClass91_3788
                                    .method1525(126, i_8_)
                                    == 1)
                                class68_sub20_sub1
                                        = Class68_Sub6.aClass68_Sub20_Sub1_2847;
                            if ((Class68_Sub13_Sub21.aClass91_3788
                                    .method1525(-21, i_8_)
                                    ^ 0xffffffff)
                                    == -3)
                                class68_sub20_sub1
                                        = (Class68_Sub13_Sub4
                                        .aClass68_Sub20_Sub1_3511);
                            int i_15_ = (class68_sub20_sub1.method1018
                                    ((Class68_Sub13_Sub21.aClass91_3788
                                            .aRSStringArray1635[i_8_]),
                                            100));
                            i_13_ -= i_15_ / 2;
                            if (-class45.anInt892 <= i_13_
                                    && i_13_ <= class45.anInt892
                                    && (i_14_ ^ 0xffffffff) <= (-class45.anInt873
                                    ^ 0xffffffff)
                                    && class45.anInt873 >= i_14_) {
                                int i_16_ = 16777215;
                                if ((Class68_Sub13_Sub21.aClass91_3788
                                        .anIntArray1640[i_8_])
                                        != -1)
                                    i_16_ = (Class68_Sub13_Sub21.aClass91_3788
                                            .anIntArray1640[i_8_]);
                                Class79.method1424(class45.anIntArray854,
                                        class45.anIntArray783);
                                class68_sub20_sub1.method1034
                                        ((Class68_Sub13_Sub21.aClass91_3788
                                                .aRSStringArray1635[i_8_]),
                                                i_13_ + i - -(class45.anInt892 / 2),
                                                i_2_ - -(class45.anInt873 / 2) + -i_14_,
                                                i_15_, 50, i_16_, 0, 256, 1, 0, 0);
                                Class79.method1438();
                            }
                        }
                    }
                }
                for (int i_17_ = 0;
                     (Class52.anInt1006 ^ 0xffffffff) < (i_17_ ^ 0xffffffff);
                     i_17_++) {
                    int i_18_
                            = (2
                            + (Class113.anIntArray1921[i_17_] * 4
                            + -(Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                            / 32)));
                    int i_19_
                            = (-(Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561
                            / 32)
                            + 2 + Class95.anIntArray1683[i_17_] * 4);
                    Class116 class116
                            = Class1_Sub5.method140(95, (Class68_Sub20_Sub19
                            .anIntArray4452[i_17_]));
                    if (class116.anIntArray1994 != null) {
                        class116 = class116.method1710(-1);
                        if (class116 == null || class116.anInt1980 == -1)
                            continue;
                    }
                    Class33.method413(i_18_, -69, class45, i, i_19_,
                            (Class68_Sub13_Sub11
                                    .aClass68_Sub20_Sub10Array3605
                                    [class116.anInt1980]),
                            i_2_);
                }
                for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -105; i_20_++) {
                    for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -105; i_21_++) {
                        Class16 class16 = (Class45.aClass16ArrayArrayArray926
                                [GameSocket.anInt1149][i_20_][i_21_]);
                        if (class16 != null) {
                            int i_22_ = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    .anInt2537)
                                    / 32)
                                    + (4 * i_21_ + 2));
                            int i_23_ = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    .anInt2561)
                                    / 32)
                                    + (2 + 4 * i_20_));
                            Class33.method413(i_22_, -35, class45, i, i_23_,
                                    (Class112
                                            .aClass68_Sub20_Sub10Array1883
                                            [0]),
                                    i_2_);
                        }
                    }
                }
                for (int i_24_ = 0;
                     ((i_24_ ^ 0xffffffff)
                             > (Class13_Sub2.anInt2645 ^ 0xffffffff));
                     i_24_++) {
                    Class1_Sub6_Sub1 class1_sub6_sub1
                            = (Class102.aClass1_Sub6_Sub1Array1746
                            [Class68_Sub10.anIntArray2906[i_24_]]);
                    if (class1_sub6_sub1 != null
                            && class1_sub6_sub1.method150(111)) {
                        Class80 class80 = class1_sub6_sub1.aClass80_3395;
                        if (class80 != null && class80.anIntArray1431 != null)
                            class80 = class80.method1447(-94);
                        if (class80 != null && class80.aBoolean1438
                                && class80.aBoolean1433) {
                            int i_25_ = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    .anInt2561)
                                    / 32)
                                    + class1_sub6_sub1.anInt2561 / 32);
                            int i_26_ = (class1_sub6_sub1.anInt2537 / 32
                                    - (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    .anInt2537) / 32);
                            Class33.method413(i_26_, -89, class45, i, i_25_,
                                    (Class112
                                            .aClass68_Sub20_Sub10Array1883
                                            [1]),
                                    i_2_);
                        }
                    }
                }
                for (int i_27_ = 0;
                     (i_27_ ^ 0xffffffff) > (client.anInt2382 ^ 0xffffffff);
                     i_27_++) {
                    Class1_Sub6_Sub2 class1_sub6_sub2
                            = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                            [Class85.anIntArray1563[i_27_]]);
                    if (class1_sub6_sub2 != null
                            && class1_sub6_sub2.method150(97)) {
                        int i_28_
                                = (-(Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561
                                / 32)
                                + class1_sub6_sub2.anInt2561 / 32);
                        boolean bool = false;
                        int i_29_
                                = (-(Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                                / 32)
                                + class1_sub6_sub2.anInt2537 / 32);
                        long l = class1_sub6_sub2.aRSString_3414
                                .toLong(10908);
                        for (int i_30_ = 0; Class32.anInt573 > i_30_;
                             i_30_++) {
                            if (((Class68_Sub13_Sub21.aLongArray3802[i_30_]
                                    ^ 0xffffffffffffffffL)
                                    == (l ^ 0xffffffffffffffffL))
                                    && (Class98.anIntArray1724[i_30_]
                                    ^ 0xffffffff) != -1) {
                                bool = true;
                                break;
                            }
                        }
                        boolean bool_31_ = false;
                        if ((Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt3431
                                ^ 0xffffffff) != -1
                                && class1_sub6_sub2.anInt3431 != 0
                                && (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt3431
                                == class1_sub6_sub2.anInt3431))
                            bool_31_ = true;
                        if (!bool) {
                            if (!bool_31_)
                                Class33.method413
                                        (i_29_, -52, class45, i, i_28_,
                                                Class112.aClass68_Sub20_Sub10Array1883[2],
                                                i_2_);
                            else
                                Class33.method413
                                        (i_29_, -92, class45, i, i_28_,
                                                Class112.aClass68_Sub20_Sub10Array1883[4],
                                                i_2_);
                        } else
                            Class33.method413(i_29_, -27, class45, i, i_28_,
                                    (Class112
                                            .aClass68_Sub20_Sub10Array1883
                                            [3]),
                                    i_2_);
                    }
                }
                Class23[] class23s = Class34.aClass23Array594;
                for (int i_32_ = 0; class23s.length > i_32_; i_32_++) {
                    Class23 class23 = class23s[i_32_];
                    if (class23 != null && class23.anInt489 != 0
                            && (Class68_Sub3.anInt2812 % 20 ^ 0xffffffff) > -11) {
                        if (class23.anInt489 == 1
                                && (class23.anInt493 ^ 0xffffffff) <= -1
                                && ((class23.anInt493 ^ 0xffffffff)
                                > (Class102.aClass1_Sub6_Sub1Array1746.length
                                ^ 0xffffffff))) {
                            Class1_Sub6_Sub1 class1_sub6_sub1
                                    = (Class102.aClass1_Sub6_Sub1Array1746
                                    [class23.anInt493]);
                            if (class1_sub6_sub1 != null) {
                                int i_33_
                                        = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                        .anInt2561)
                                        / 32)
                                        + class1_sub6_sub1.anInt2561 / 32);
                                int i_34_
                                        = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                        .anInt2537)
                                        / 32)
                                        + class1_sub6_sub1.anInt2537 / 32);
                                Class53.method551(class23.anInt499, (byte) 122,
                                        i_33_, class45, i_2_, i,
                                        i_34_);
                            }
                        }
                        if (class23.anInt489 == 2) {
                            int i_35_
                                    = ((class23.anInt496 + -Class36.anInt643) * 4
                                    + 2
                                    + -((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    .anInt2561)
                                    / 32));
                            int i_36_ = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                    .anInt2537)
                                    / 32)
                                    + 2
                                    + (-Class68_Sub13_Sub35.anInt4026
                                    + class23.anInt492) * 4);
                            Class53.method551(class23.anInt499, (byte) 119,
                                    i_35_, class45, i_2_, i, i_36_);
                        }
                        if (class23.anInt489 == 10
                                && (class23.anInt493 ^ 0xffffffff) <= -1
                                && (class23.anInt493
                                < (Class68_Sub13_Sub4
                                .aClass1_Sub6_Sub2Array3483).length)) {
                            Class1_Sub6_Sub2 class1_sub6_sub2
                                    = (Class68_Sub13_Sub4
                                    .aClass1_Sub6_Sub2Array3483
                                    [class23.anInt493]);
                            if (class1_sub6_sub2 != null) {
                                int i_37_
                                        = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                        .anInt2561)
                                        / 32)
                                        + class1_sub6_sub2.anInt2561 / 32);
                                int i_38_
                                        = (-((Class68_Sub7.aClass1_Sub6_Sub2_2860
                                        .anInt2537)
                                        / 32)
                                        + class1_sub6_sub2.anInt2537 / 32);
                                Class53.method551(class23.anInt499, (byte) 110,
                                        i_37_, class45, i_2_, i,
                                        i_38_);
                            }
                        }
                    }
                }
                if ((Class95.anInt1684 ^ 0xffffffff) != -1) {
                    int i_39_
                            = (Class95.anInt1684 * 4 - -2
                            + -(Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561
                            / 32));
                    int i_40_
                            = (2
                            + (4 * Class75_Sub2.anInt3315
                            + -(Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537
                            / 32)));
                    Class33.method413(i_40_, -65, class45, i, i_39_,
                            (Class68_Sub20_Sub17
                                    .aClass68_Sub20_Sub10_4440),
                            i_2_);
                }
                Class79.method1439(class45.anInt892 / 2 + i - 1,
                        -1 + (i_2_ + class45.anInt873 / 2), 3, 3,
                        16777215);
            }
            Class68_Sub17.aBooleanArray3037[i_3_] = true;
        }
    }

    public Canvas_Sub1(Component component) {
        aComponent53 = component;
    }
}
