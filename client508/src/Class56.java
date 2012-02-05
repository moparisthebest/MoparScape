/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class56 {
    public static int anInt1059;
    public static int anInt1060;
    public static int anInt1061;
    public static RSString aRSString_1062;
    public static int anInt1063;
    public static int anInt1064;
    public static short[][] aShortArrayArray1065;
    public static RSString aRSString_1066 = RSString.newRsString("Mem:");
    public static int anInt1067;

    public static void method569(boolean bool) {
        aRSString_1066 = null;
        aShortArrayArray1065 = null;
        if (bool == true)
            aRSString_1062 = null;
    }

    public static RSString method570(long l, int i) {
        try {
            anInt1060++;
            if ((l ^ 0xffffffffffffffffL) >= -1L
                    || (l ^ 0xffffffffffffffffL) <= -6582952005840035282L)
                return null;
            if ((l % 37L ^ 0xffffffffffffffffL) == -1L)
                return null;
            int i_0_ = 0;
            for (long l_1_ = l; l_1_ != 0L; l_1_ /= 37L)
                i_0_++;
            byte[] is = new byte[i_0_];
            while (l != 0L) {
                long l_2_ = l;
                l /= 37L;
                is[--i_0_] = ISAACRandomGen.aByteArray1496[(int) (l_2_ + -(l * 37L))];
            }
            RSString class100 = new RSString();
            class100.bytes = is;
            class100.anInt2293 = is.length;
            if (i != -1)
                anInt1061 = -3;
            return class100;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "jd.A(" + l + ',' + i + ')');
        }
    }

    public static void method571(byte i) {
        anInt1063++;
        if ((Class68_Sub13_Sub10.anInt3595 ^ 0xffffffff) != 0)
            Class43.method480(Class68_Sub13_Sub10.anInt3595, -1);
        for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (anInt1061 ^ 0xffffffff);
             i_3_++) {
            if (Class121.aBooleanArray2109[i_3_])
                Class68_Sub17.aBooleanArray3037[i_3_] = true;
            Class4.aBooleanArray95[i_3_] = Class121.aBooleanArray2109[i_3_];
            Class121.aBooleanArray2109[i_3_] = false;
        }
        Class68_Sub2.anInt2798 = -1;
        Class68_Sub13_Sub34.anInt4013 = Class68_Sub3.anInt2812;
        Class16.anInt276 = -1;
        if (i != 46)
            method571((byte) -24);
        Class3.aClass45_73 = null;
        if (Class68_Sub13_Sub10.anInt3595 != -1) {
            anInt1061 = 0;
            Class68_Sub20.method1004(0, 0, Class68_Sub13_Sub9.height, 0,
                    Class68_Sub13_Sub10.anInt3595, -1, 0,
                    Class13_Sub3.width, (byte) -112);
        }
        Class79.method1416();
        Class109.anInt1844 = 0;
    }

    public static boolean method572(Class21renamed class21, int i, int i_4_) {
        if (i != -1)
            anInt1067 = -32;
        anInt1064++;
        byte[] is = class21.method359(0, i_4_);
        if (is == null)
            return false;
        Class68_Sub13_Sub24.method818(14432, is);
        return true;
    }

    static {
        aRSString_1062 = RSString.newRsString(" weitere Optionen");
        anInt1067 = 0;
        anInt1061 = 0;
    }
}
