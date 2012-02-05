/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Animable {
    public static int anInt54;
    public static int anInt55;
    public static int anInt56;
    public static int anInt57;
    public static int anInt58;
    public static Class68_Sub20_Sub10 aClass68_Sub20_Sub10_59;
    public static int anInt60;
    public static Class45 aClass45_61 = null;
    public static int anInt62;
    public static int anInt63;
    public static RSString aRSString_64
            = RSString.newRsString("Bitte entfernen Sie ");
    public static int anInt65;
    public static Class35 aClass35_66;
    public static int anInt67;
    public static int anInt68;

    public static RSString method50(byte i, int i_0_) {
        if (i > -36)
            anInt63 = -44;
        anInt55++;
        if (i_0_ < 100000)
            return (Class68_Sub20_Sub13_Sub2.method1166
                    (2,
                            new RSString[]{Class85.aRSString_1556,
                                    Class68_Sub13_Sub24.method816(i_0_, 0),
                                    Class96.aRSString_1697}));
        if (i_0_ < 10000000)
            return (Class68_Sub20_Sub13_Sub2.method1166
                    (2, (new RSString[]
                            {Class21_Sub1.aRSString_2695,
                                    Class68_Sub13_Sub24.method816(i_0_ / 1000, 0),
                                    Class68_Sub13_Sub11.aRSString_3611,
                                    Class96.aRSString_1697})));
        return (Class68_Sub20_Sub13_Sub2.method1166
                (2, (new RSString[]
                        {Class68_Sub13_Sub29.aRSString_3934,
                                Class68_Sub13_Sub24.method816(i_0_ / 1000000, 0),
                                Class18.aRSString_296, Class96.aRSString_1697})));
    }

    public abstract void method51(int i, int i_1_, int i_2_, int i_3_,
                                  int i_4_, int i_5_, int i_6_, int i_7_,
                                  long l);

    public void method52(Animable class1_8_, int i, int i_9_, int i_10_,
                         boolean bool) {
        anInt58++;
    }

    public static byte[] method53(boolean bool, byte i, Object object) {
        anInt56++;
        if (object == null)
            return null;
        if (object instanceof byte[]) {
            byte[] is = (byte[]) object;
            if (bool)
                return Unknown.method1508(is, false);
            return is;
        }
        if (i != -4)
            method54((byte) -77, -30, -86, 85);
        if (object instanceof Class15) {
            Class15 class15 = (Class15) object;
            return class15.method275(-82);
        }
        throw new IllegalArgumentException();
    }

    public static int method54(byte i, int i_11_, int i_12_, int i_13_) {
        anInt57++;
        i_11_ &= 0x3;
        if ((i_11_ ^ 0xffffffff) == -1)
            return i_12_;
        int i_14_ = -17 / ((-35 - i) / 45);
        if (i_11_ == 1)
            return -i_13_ + 7;
        if (i_11_ == 2)
            return 7 + -i_12_;
        return i_13_;
    }

    public static void method55(int i) {
        anInt60++;
        Class68_Sub13_Sub27.aClass98_3893.method1567(-20);
        Class68_Sub20_Sub14.aClass98_4372.method1567(111);
        if (i != -7816)
            aClass35_66 = null;
    }

    public abstract int method56();

    public Animable method57(int i, int i_15_, int i_16_) {
        anInt62++;
        return this;
    }

    public boolean method58() {
        anInt67++;
        return false;
    }

    public static Class92_Sub1[] method59(int i, Class21renamed class21,
                                          boolean bool) {
        anInt65++;
        if (bool != false)
            aClass68_Sub20_Sub10_59 = null;
        if (!Class56.method572(class21, -1, i))
            return null;
        return ISAACRandomGen.method1457(31);
    }

    public void method60(int i, int i_17_, int i_18_, int i_19_, int i_20_) {
        if (i_18_ <= 96)
            anInt63 = 32;
        anInt68++;
    }

    public static void method61(int i) {
        aClass68_Sub20_Sub10_59 = null;
        aClass45_61 = null;
        aClass35_66 = null;
        aRSString_64 = null;
        if (i <= 35)
            method59(5, null, false);
    }

    public static void method62(int i, byte[] is, int i_21_, boolean bool,
                                int i_22_, int i_23_, int i_24_,
                                GroundData[] class38s) {
        try {
            anInt54++;
            int i_25_;
            if (bool)
                i_25_ = 1;
            else
                i_25_ = 4;
            if (i_22_ < -1) {
                if (!bool) {
                    for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -5; i_26_++) {
                        for (int i_27_ = 0; i_27_ < 64; i_27_++) {
                            for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -65;
                                 i_28_++) {
                                if ((i_21_ - -i_27_ ^ 0xffffffff) < -1
                                        && i_21_ + i_27_ < 103
                                        && (i_28_ + i ^ 0xffffffff) < -1
                                        && i - -i_28_ < 103)
                                    class38s[i_26_].anIntArrayArray681
                                            [i_27_ + i_21_][i_28_ + i]
                                            = (Class120.method1740
                                            ((class38s[i_26_].anIntArrayArray681
                                                    [i_27_ + i_21_][i_28_ + i]),
                                                    -16777217));
                            }
                        }
                    }
                }
                Stream class68_sub14 = new Stream(is);
                for (int i_29_ = 0;
                     (i_25_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff); i_29_++) {
                    for (int i_30_ = 0; i_30_ < 64; i_30_++) {
                        for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -65;
                             i_31_++)
                            Class96.method1554(bool, i_21_ + i_30_, i_24_,
                                    i_23_, class68_sub14, i_29_, 0,
                                    (byte) 91, i_31_ + i);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("a.Q(" + i + ','
                            + (is != null ? "{...}" : "null") + ','
                            + i_21_ + ',' + bool + ',' + i_22_ + ','
                            + i_23_ + ',' + i_24_ + ','
                            + (class38s != null ? "{...}" : "null")
                            + ')'));
        }
    }
}
