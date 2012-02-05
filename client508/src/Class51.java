/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Date;

public class Class51 implements Interface2 {
    public static int anInt2248;
    public static int anInt2249;
    public static int anInt2250;
    public static Class16 aClass16_2251 = new Class16();
    public static int anInt2252;
    public static int anInt2253;
    public static int anInt2254;
    public static int anInt2255;
    public static int anInt2256;
    public static int[] anIntArray2257 = {1, 1, 1, 1};
    public static RSString aRSString_2258;
    public static int anInt2259;
    public static RSString aRSString_2260;

    public RSString method7(int i, byte i_0_, long l, int[] is) {
        try {
            anInt2253++;
            if ((i ^ 0xffffffff) == -1) {
                Class68_Sub20_Sub3 class68_sub20_sub3
                        = Class68_Sub20.method1008(i_0_ + -1, is[0]);
                return class68_sub20_sub3.method1047((byte) -113, (int) l);
            }
            if (i_0_ != 22)
                return null;
            if ((i ^ 0xffffffff) == -2 || i == 10) {
                ItemDef class19 = Applet_Sub1.method18(-25672, (int) l);
                return class19.aRSString_362;
            }
            if (i == 6 || (i ^ 0xffffffff) == -8)
                return Class68_Sub20.method1008(21, is[0])
                        .method1047((byte) -112, (int) l);
            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("hh.A(" + i + ',' + i_0_ + ',' + l + ','
                            + (is != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method536(long l, byte i) {
        try {
            anInt2254++;
            if (l != 0L) {
                if ((Class68_Sub13_Sub26.anInt3880 ^ 0xffffffff) <= -101)
                    Class48.method520(Class68_Sub28_Sub2.aRSString_4556, -88,
                            Class52.aRSString_1005, 0);
                else {
                    RSString class100
                            = Class56.method570(l, -1).method1597(12688);
                    for (int i_1_ = 0;
                         ((Class68_Sub13_Sub26.anInt3880 ^ 0xffffffff)
                                 < (i_1_ ^ 0xffffffff));
                         i_1_++) {
                        if ((l ^ 0xffffffffffffffffL)
                                == (Class21_Sub1.aLongArray2703[i_1_]
                                ^ 0xffffffffffffffffL)) {
                            Class48.method520
                                    (Class68_Sub28_Sub2.aRSString_4556, -88,
                                            (Class68_Sub20_Sub13_Sub2.method1166
                                                    (2,
                                                            new RSString[]{class100,
                                                                    Class67.aRSString_1213})),
                                            0);
                            return;
                        }
                    }
                    int i_2_ = 9 / ((-19 - i) / 57);
                    for (int i_3_ = 0; Class32.anInt573 > i_3_; i_3_++) {
                        if ((Class68_Sub13_Sub21.aLongArray3802[i_3_]
                                ^ 0xffffffffffffffffL)
                                == (l ^ 0xffffffffffffffffL)) {
                            Class48.method520
                                    (Class68_Sub28_Sub2.aRSString_4556, 125,
                                            (Class68_Sub20_Sub13_Sub2.method1166
                                                    (2,
                                                            (new RSString[]
                                                                    {Class68_Sub20_Sub14.aRSString_4386,
                                                                            class100,
                                                                            Class68_Sub20_Sub18.aRSString_4450}))),
                                            0);
                            return;
                        }
                    }
                    if (class100.method1593((Class68_Sub7
                            .aClass1_Sub6_Sub2_2860
                            .aRSString_3414),
                            (byte) 103))
                        Class48.method520(Class68_Sub28_Sub2.aRSString_4556,
                                -99, Class125.aRSString_2165, 0);
                    else {
                        Class21_Sub1.aLongArray2703[(Class68_Sub13_Sub26
                                .anInt3880)]
                                = l;
                        Class68_Sub4.aRSStringArray2827
                                [Class68_Sub13_Sub26.anInt3880++]
                                = Class56.method570(l, -1);
                        Class123.anInt2130 = Class68_Sub22.anInt3148;
                        Class21renamed.stream.createFrame(61);
                        anInt2252++;
                        Class21renamed.stream.writeQWord(true, l);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "hh.E(" + l + ',' + i + ')');
        }
    }

    public static void method537(Class1_Sub6 class1_sub6, int i, int i_4_) {
        anInt2248++;
        if ((Class68_Sub3.anInt2812 ^ 0xffffffff)
                <= (class1_sub6.anInt2550 ^ 0xffffffff)) {
            if (Class68_Sub3.anInt2812 > class1_sub6.anInt2521)
                Class58.method578(class1_sub6, true);
            else
                Class75_Sub1.method1389(128, class1_sub6);
        } else
            Class1_Sub6_Sub1.method154((byte) 126, class1_sub6);
        if (i == 128) {
            if ((class1_sub6.anInt2561 ^ 0xffffffff) > -129
                    || class1_sub6.anInt2537 < 128
                    || (class1_sub6.anInt2561 ^ 0xffffffff) <= -13185
                    || class1_sub6.anInt2537 >= 13184) {
                class1_sub6.anInt2521 = 0;
                class1_sub6.anInt2537 = (class1_sub6.anIntArray2570[0] * 128
                        - -(class1_sub6.anInt2544 * 64));
                class1_sub6.anInt2552 = -1;
                class1_sub6.anInt2550 = 0;
                class1_sub6.anInt2561
                        = (64 * class1_sub6.anInt2544
                        + 128 * class1_sub6.anIntArray2523[0]);
                class1_sub6.anInt2568 = -1;
                class1_sub6.method153(i + -128);
            }
            if (class1_sub6 == Class68_Sub7.aClass1_Sub6_Sub2_2860
                    && ((class1_sub6.anInt2561 ^ 0xffffffff) > -1537
                    || (class1_sub6.anInt2537 ^ 0xffffffff) > -1537
                    || (class1_sub6.anInt2561 ^ 0xffffffff) <= -11777
                    || (class1_sub6.anInt2537 ^ 0xffffffff) <= -11777)) {
                class1_sub6.anInt2552 = -1;
                class1_sub6.anInt2550 = 0;
                class1_sub6.anInt2537 = (128 * class1_sub6.anIntArray2570[0]
                        + 64 * class1_sub6.anInt2544);
                class1_sub6.anInt2521 = 0;
                class1_sub6.anInt2561
                        = (64 * class1_sub6.anInt2544
                        + class1_sub6.anIntArray2523[0] * 128);
                class1_sub6.anInt2568 = -1;
                class1_sub6.method153(0);
            }
            Class128.method1788(i + 19978, class1_sub6);
            Class68_Sub20_Sub12.method1154(class1_sub6, 1);
        }
    }

    public static RSString method538(int i, long l) {
        try {
            Class70.aCalendar1283.setTime(new Date(l));
            int i_5_ = Class70.aCalendar1283.get(7);
            if (i >= -102)
                anInt2256 = -26;
            int i_6_ = Class70.aCalendar1283.get(5);
            anInt2250++;
            int i_7_ = Class70.aCalendar1283.get(2);
            int i_8_ = Class70.aCalendar1283.get(1);
            int i_9_ = Class70.aCalendar1283.get(11);
            int i_10_ = Class70.aCalendar1283.get(12);
            int i_11_ = Class70.aCalendar1283.get(13);
            return (Class68_Sub20_Sub13_Sub2.method1166
                    (2, (new RSString[]
                            {Class12.aRSStringArray200[i_5_ - 1],
                                    Class94.aRSString_1678,
                                    Class68_Sub13_Sub24.method816(i_6_ / 10, 0),
                                    Class68_Sub13_Sub24.method816(i_6_ % 10, 0),
                                    Class68_Sub18.aRSString_3052,
                                    Class68_Sub13_Sub6.aRSStringArray3524[i_7_],
                                    Class68_Sub18.aRSString_3052,
                                    Class68_Sub13_Sub24.method816(i_8_, 0),
                                    Class68_Sub20_Sub6.aRSString_4236,
                                    Class68_Sub13_Sub24.method816(i_9_ / 10, 0),
                                    Class68_Sub13_Sub24.method816(i_9_ % 10, 0),
                                    Class13.aRSString_218,
                                    Class68_Sub13_Sub24.method816(i_10_ / 10, 0),
                                    Class68_Sub13_Sub24.method816(i_10_ % 10, 0),
                                    Class13.aRSString_218,
                                    Class68_Sub13_Sub24.method816(i_11_ / 10, 0),
                                    Class68_Sub13_Sub24.method816(i_11_ % 10, 0),
                                    Class37.aRSString_651})));
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "hh.C(" + i + ',' + l + ')');
        }
    }

    public static void method539(int i, int i_12_, int i_13_, int i_14_) {
        anInt2249++;
        RSString class100
                = (Class68_Sub20_Sub13_Sub2.method1166
                (2, (new RSString[]
                        {GameSocket.aRSString_1141,
                                Class68_Sub13_Sub24.method816(i_12_, 0),
                                Class106.aRSString_1800,
                                Class68_Sub13_Sub24.method816(i >> 1784452358, 0),
                                Class106.aRSString_1800,
                                Class68_Sub13_Sub24.method816(i_13_ >> 436238662, 0),
                                Class106.aRSString_1800,
                                Class68_Sub13_Sub24.method816(0x3f & i, i_14_ + -24867),
                                Class106.aRSString_1800,
                                Class68_Sub13_Sub24.method816(0x3f & i_13_, 0)})));
        class100.method1577((byte) 112);
        if (i_14_ != 24867)
            aClass16_2251 = null;
        Class44.method486(class100, (byte) 1);
    }

    public static void method540(int i) {
        aRSString_2260 = null;
        if (i != 10)
            method536(117L, (byte) 123);
        anIntArray2257 = null;
        aClass16_2251 = null;
        aRSString_2258 = null;
    }

    static {
        anInt2256 = 0;
        anInt2255 = 100;
        aRSString_2260 = RSString.newRsString(" ");
        aRSString_2258 = aRSString_2260;
    }
}
