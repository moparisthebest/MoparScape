/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class118 {
    public static int anInt2073;
    public static FontMetrics aFontMetrics2074;
    public static int anInt2075;
    public static long[] aLongArray2076 = new long[256];
    public static int[] anIntArray2077;
    public static boolean[] aBooleanArray2078 = new boolean[8];
    public static int anInt2079;
    public static RSString aRSString_2080;
    public static RSString aRSString_2081;
    public static RSString aRSString_2082;
    public static RSString aRSString_2083;
    public static RSString aRSString_2084;

    public static void method1730(boolean bool) {
        anInt2075++;
        if (Class76.aClass52_1354 != null) {
            if (bool != true)
                method1730(false);
            do {
                try {
                    byte[] is = Class76.aClass52_1354.method541((byte) 78);
                    if (is == null)
                        break;
                    Stream class68_sub14 = new Stream(is);
                    Class68_Sub13_Sub19.anInt3759
                            = class68_sub14.readUnsignedWord(1355769544);
                    Class1_Sub6.aClass93Array2529
                            = new Class93[Class68_Sub13_Sub19.anInt3759];
                    for (int i = 0;
                         ((Class68_Sub13_Sub19.anInt3759 ^ 0xffffffff)
                                 < (i ^ 0xffffffff));
                         i++) {
                        Class93 class93
                                = Class1_Sub6.aClass93Array2529[i] = new Class93();
                        int i_0_ = class68_sub14.readUnsignedWord(1355769544);
                        class93.aBoolean1661 = (i_0_ & 0x8000) != 0;
                        class93.anInt1664 = 0x7fff & i_0_;
                        class93.aRSString_1670 = class68_sub14.readString(127);
                        class93.anInt1665 = class68_sub14.method957(-22489);
                        class93.anInt1663 = i;
                        int i_1_ = class68_sub14.readUnsignedWord(1355769544);
                        class93.anInt1666 = Class76.method1404(3, i_1_);
                    }
                    Class28.method392((-1
                            + Class1_Sub6.aClass93Array2529.length),
                            -228, Class1_Sub6.aClass93Array2529, 0);
                    Class76.aClass52_1354 = null;
                } catch (Exception exception) {
                    exception.printStackTrace();
                    Class76.aClass52_1354 = null;
                    break;
                }
                break;
            } while (false);
        }
    }

    public static Class68_Sub20_Sub8 method1731(int i, byte i_2_) {
        Class68_Sub20_Sub8 class68_sub20_sub8 = ((Class68_Sub20_Sub8) Class1_Sub1.aLogin_2395.method1473((long) i, (byte) -76));
        anInt2073++;
        if (class68_sub20_sub8 != null)
            return class68_sub20_sub8;
        byte[] is;
        if (i < 32768)
            is = Class13_Sub3.aClass21_2671.method338(i, 0, 1);
        else
            is = Class92.aClass21_1652.method338(0x7fff & i, 0, 1);
        class68_sub20_sub8 = new Class68_Sub20_Sub8();
        if (is != null)
            class68_sub20_sub8.method1084((byte) 45, new Stream(is));
        if ((i ^ 0xffffffff) <= -32769)
            class68_sub20_sub8.method1090((byte) 38);
        Class1_Sub1.aLogin_2395.method1465((long) i, (byte) 90, class68_sub20_sub8);
        if (i_2_ < 75)
            method1732(-8);
        return class68_sub20_sub8;
    }

    public static void method1732(int i) {
        aRSString_2083 = null;
        aFontMetrics2074 = null;
        aBooleanArray2078 = null;
        aRSString_2084 = null;
        anIntArray2077 = null;
        aRSString_2081 = null;
        if (i != 32767)
            method1731(-9, (byte) -12);
        aLongArray2076 = null;
        aRSString_2080 = null;
        aRSString_2082 = null;
    }

    static {
        for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
            long l = (long) i;
            for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -9; i_3_++) {
                if ((l & 0x1L ^ 0xffffffffffffffffL) != -2L)
                    l >>>= 1;
                else
                    l = ~0x3693a86a2878f0bdL ^ l >>> -409417855;
            }
            aLongArray2076[i] = l;
        }
        aRSString_2081 = RSString.newRsString("<br>");
        aRSString_2082 = RSString.newRsString("Members only world");
        aRSString_2083 = aRSString_2082;
        aRSString_2084 = RSString.newRsString("skill)2");
        aRSString_2080 = aRSString_2084;
    }
}
