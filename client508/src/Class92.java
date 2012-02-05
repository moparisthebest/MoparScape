/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class92 {
    public static Class21_Sub1 aClass21_Sub1_1644;
    public int anInt1645;
    public static int anInt1646;
    public int anInt1647;
    public static int anInt1648;
    public static boolean aBoolean1649 = false;
    public static short[][] aShortArrayArray1650;
    public static int anInt1651;
    public static Class21renamed aClass21_1652;
    public static int anInt1653;
    public static int anInt1654;
    public int anInt1655;
    public static RSString aRSString_1656
            = RSString.newRsString(")3runescape)3com)4l=");
    public int anInt1657;
    public int anInt1658;
    public int anInt1659;

    public static int method1526(int i, byte i_0_) {
        int i_1_ = -12 / ((-52 - i_0_) / 55);
        int i_2_ = 0;
        if ((i ^ 0xffffffff) > -1 || i >= 65536) {
            i_2_ += 16;
            i >>>= 16;
        }
        if (i >= 256) {
            i_2_ += 8;
            i >>>= 8;
        }
        if (i >= 16) {
            i_2_ += 4;
            i >>>= 4;
        }
        if ((i ^ 0xffffffff) <= -5) {
            i >>>= 2;
            i_2_ += 2;
        }
        anInt1654++;
        if (i >= 1) {
            i >>>= 1;
            i_2_++;
        }
        return i_2_ - -i;
    }

    public abstract void method1527(int i, int i_3_);

    public abstract void method1528(int i, int i_4_, int i_5_);

    public static void method1529(int i) {
        anInt1651++;
        Class68_Sub13_Sub4.method716();
        if (i == 297) {
            for (int i_6_ = 0; i_6_ < 4; i_6_++)
                Class109.aClass38Array1843[i_6_].method444(false);
            System.gc();
        }
    }

    public static void method1530(int i) {
        aRSString_1656 = null;
        if (i != -1)
            aRSString_1656 = null;
        aShortArrayArray1650 = null;
        aClass21_1652 = null;
        aClass21_Sub1_1644 = null;
    }

    public static void method1531(int i, long l) {
        try {
            anInt1653++;
            if (l != 0L) {
                if (i >= -125)
                    aClass21_1652 = null;
                for (int i_7_ = 0; Class68_Sub13_Sub26.anInt3880 > i_7_;
                     i_7_++) {
                    if ((l ^ 0xffffffffffffffffL)
                            == (Class21_Sub1.aLongArray2703[i_7_]
                            ^ 0xffffffffffffffffL)) {
                        Class68_Sub13_Sub14.anInt3674++;
                        Class68_Sub13_Sub26.anInt3880--;
                        for (int i_8_ = i_7_;
                             i_8_ < Class68_Sub13_Sub26.anInt3880; i_8_++) {
                            Class21_Sub1.aLongArray2703[i_8_]
                                    = Class21_Sub1.aLongArray2703[i_8_ - -1];
                            Class68_Sub4.aRSStringArray2827[i_8_]
                                    = Class68_Sub4.aRSStringArray2827[i_8_ - -1];
                        }
                        Class123.anInt2130 = Class68_Sub22.anInt3148;
                        Class21renamed.stream.createFrame(2);
                        Class21renamed.stream.writeQWord(true, l);
                        break;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "pc.C(" + i + ',' + l + ')');
        }
    }
}
