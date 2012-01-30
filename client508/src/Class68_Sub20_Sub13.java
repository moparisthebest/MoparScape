/* Class68_Sub20_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class68_Sub20_Sub13 extends Class68_Sub20 {
    public static int anInt4356;
    public static int anInt4357;
    public static int anInt4358;
    public static Class98 aClass98_4359;
    public static int anInt4360;
    public static int anInt4361;
    public static int anInt4362;
    public static int anInt4363 = 0;
    public static Class50 aClass50_4364;
    public static volatile int anInt4365;
    public static Class113 aClass113_4366;
    public static int[] anIntArray4367;
    public static int anInt4368;

    public static void method1157(byte i, long l) {
        try {
            anInt4361++;
            if ((l ^ 0xffffffffffffffffL) != -1L) {
                if (Class32.anInt573 >= 100 && Class26.anInt519 != 1
                        || Class32.anInt573 >= 200)
                    Class48.method520(Class68_Sub28_Sub2.aRSString_4556, -74,
                            Class68_Sub13_Sub21.aRSString_3795, 0);
                else {
                    RSString class100
                            = Class56.method570(l, -1).method1597(12688);
                    for (int i_0_ = 0; i_0_ < Class32.anInt573; i_0_++) {
                        if ((l ^ 0xffffffffffffffffL)
                                == (Class68_Sub13_Sub21.aLongArray3802[i_0_]
                                ^ 0xffffffffffffffffL)) {
                            Class48.method520
                                    (Class68_Sub28_Sub2.aRSString_4556, 127,
                                            (Class68_Sub20_Sub13_Sub2.method1166
                                                    (2,
                                                            new RSString[]{class100,
                                                                    Class50.aRSString_985})),
                                            0);
                            return;
                        }
                    }
                    for (int i_1_ = 0; i_1_ < Class68_Sub13_Sub26.anInt3880;
                         i_1_++) {
                        if (Class21_Sub1.aLongArray2703[i_1_] == l) {
                            Class48.method520
                                    (Class68_Sub28_Sub2.aRSString_4556, 126,
                                            (Class68_Sub20_Sub13_Sub2.method1166
                                                    (2, (new RSString[]
                                                            {Class68_Sub20_Sub14.aRSString_4387,
                                                                    class100, Class75.aRSString_1341}))),
                                            0);
                            return;
                        }
                    }
                    if (class100.method1593((Class68_Sub7
                            .aClass1_Sub6_Sub2_2860
                            .aRSString_3414),
                            (byte) 99))
                        Class48.method520(Class68_Sub28_Sub2.aRSString_4556,
                                -89, Class68_Sub8.aRSString_2866, 0);
                    else {
                        Class68_Sub13_Sub38.aRSStringArray4084[(Class32
                                .anInt573)]
                                = class100;
                        Class68_Sub20_Sub10.anInt4310++;
                        Class68_Sub13_Sub21.aLongArray3802[Class32.anInt573]
                                = l;
                        Class98.anIntArray1724[Class32.anInt573] = 0;
                        Class68_Sub1.aRSStringArray2754[Class32.anInt573]
                                = Class68_Sub28_Sub2.aRSString_4556;
                        Class68_Sub4.anIntArray2828[Class32.anInt573] = 0;
                        Class68_Sub13_Sub29.aBooleanArray3941[Class32.anInt573]
                                = false;
                        Class32.anInt573++;
                        Class123.anInt2130 = Class68_Sub22.anInt3148;
                        if (i > 89) {
                            Class21renamed.stream.createFrame(30);
                            Class21renamed.stream.writeQWord(true, l);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "qj.F(" + i + ',' + l + ')');
        }
    }

    public static void method1158(int i, int i_2_, int i_3_, int i_4_,
                                  boolean bool) {
        anInt4362++;
        if (bool != true)
            aClass98_4359 = null;
        if ((i_4_ - i_3_ ^ 0xffffffff) > (GroundData.anInt677 ^ 0xffffffff)
                || i_4_ - -i_3_ > Class113.anInt1918
                || (i_2_ - i_3_ ^ 0xffffffff) > (Class35.anInt605 ^ 0xffffffff)
                || Class51.anInt2255 < i_3_ + i_2_)
            Class68_Sub13_Sub18.method786((byte) 83, i, i_4_, i_3_, i_2_);
        else
            Class68_Sub20_Sub10.method1111(i, bool, i_3_, i_4_, i_2_);
    }

    public static void method1159(int i, Class45 class45, int i_5_, int i_6_) {
        anInt4356++;
        if (i_6_ != -1198502738)
            anIntArray4367 = null;
        if ((class45.aByte904 ^ 0xffffffff) != -1) {
            if (class45.aByte904 != 1) {
                if ((class45.aByte904 ^ 0xffffffff) == -3)
                    class45.anInt815
                            = i_5_ - class45.anInt892 - class45.anInt810;
                else if (class45.aByte904 == 3)
                    class45.anInt815 = class45.anInt810 * i_5_ >> 2074648526;
                else if ((class45.aByte904 ^ 0xffffffff) != -5)
                    class45.anInt815
                            = i_5_ + -class45.anInt892 - (class45.anInt810 * i_5_
                            >> 580489870);
                else
                    class45.anInt815
                            = ((-class45.anInt892 + i_5_) / 2
                            + (class45.anInt810 * i_5_ >> -1198502738));
            } else
                class45.anInt815
                        = class45.anInt810 + (-class45.anInt892 + i_5_) / 2;
        } else
            class45.anInt815 = class45.anInt810;
        if ((class45.aByte820 ^ 0xffffffff) == -1)
            class45.anInt903 = class45.anInt914;
        else if ((class45.aByte820 ^ 0xffffffff) != -2) {
            if ((class45.aByte820 ^ 0xffffffff) == -3)
                class45.anInt903 = -class45.anInt873 + i + -class45.anInt914;
            else if (class45.aByte820 != 3) {
                if ((class45.aByte820 ^ 0xffffffff) != -5)
                    class45.anInt903 = (-(i * class45.anInt914 >> -1342515730)
                            + (-class45.anInt873 + i));
                else
                    class45.anInt903
                            = (i + -class45.anInt873) / 2 + (class45.anInt914 * i
                            >> 1334621262);
            } else
                class45.anInt903 = class45.anInt914 * i >> -1805519186;
        } else
            class45.anInt903 = class45.anInt914 + (-class45.anInt873 + i) / 2;
        if (Class68_Sub20.aBoolean3094
                && (client.method41(class45) != 0 || class45.anInt896 == 0)) {
            if ((class45.anInt815 ^ 0xffffffff) > -1)
                class45.anInt815 = 0;
            else if (class45.anInt815 + class45.anInt892 > i_5_)
                class45.anInt815 = i_5_ + -class45.anInt892;
            if (class45.anInt903 >= 0) {
                if ((i ^ 0xffffffff)
                        > (class45.anInt873 + class45.anInt903 ^ 0xffffffff))
                    class45.anInt903 = -class45.anInt873 + i;
            } else
                class45.anInt903 = 0;
        }
    }

    public static Class70 method1160(int i, int i_7_) {
        anInt4357++;
        Class70 class70
                = ((Class70)
                Class68_Sub13_Sub27.aClass98_3893.method1570(14366, (long) i));
        if (class70 != null)
            return class70;
        byte[] is = (Class68_Sub13_Sub30.aClass21_3947.method338
                (Class1_Sub6.method146(i_7_ ^ 0x6f, i), 0,
                        Class68_Sub13_Sub19.method793(i_7_ ^ ~0x57, i)));
        class70 = new Class70();
        if (i_7_ != 1)
            anInt4363 = -10;
        class70.anInt1277 = i;
        if (is != null)
            class70.method1336(new Stream(is), -1);
        Class68_Sub13_Sub27.aClass98_3893.method1568(class70, 111, (long) i);
        return class70;
    }

    public abstract Object method1161(int i);

    public static void method1162(boolean bool) {
        aClass50_4364 = null;
        aClass113_4366 = null;
        if (bool == true) {
            aClass98_4359 = null;
            anIntArray4367 = null;
        }
    }

    public abstract boolean method1163(int i);

    static {
        aClass98_4359 = new Class98(64);
        anInt4365 = -1;
        aClass113_4366 = new Class113(32);
        anInt4368 = 0;
    }
}
