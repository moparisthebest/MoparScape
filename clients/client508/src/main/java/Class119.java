/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class119 {
    public static int anInt2085;
    public static RSString aRSString_2086;
    public static int anInt2087;
    public static int anInt2088;
    public static int[] anIntArray2089;
    public static int anInt2090;
    public static RSString aRSString_2091 = RSString.newRsString("Examine");

    public static void method1733(int i, int[][] is) {
        Class68_Sub22.anIntArrayArray3132 = is;
        if (i != 128)
            method1736(-15, -16, 76, null);
        anInt2087++;
    }

    public static void method1734(int i) {
        aRSString_2086 = null;
        aRSString_2091 = null;
        anIntArray2089 = null;
        if (i >= -32)
            method1736(97, -124, 127, null);
    }

    public static void method1735(int i) {
        for (int i_0_ = 0; Class56.anInt1059 > i_0_; i_0_++) {
            Class32 class32 = Class68_Sub13_Sub23.method813(-85, i_0_);
            if (class32 != null && (class32.anInt564 ^ 0xffffffff) == -1) {
                Class3.anIntArray79[i_0_] = 0;
                Class103.anIntArray1767[i_0_] = 0;
            }
        }
        int i_1_ = -112 % ((i - -72) / 51);
        anInt2085++;
        Class37.aClass113_646 = new Class113(16);
    }

    public static Class68_Sub20_Sub10 method1736(int i, int i_2_, int i_3_,
                                                 Class21renamed class21) {
        anInt2090++;
        if (i != 64)
            return null;
        if (!Class68_Sub13_Sub36.method880(-29381, i_2_, class21, i_3_))
            return null;
        return Class87.method1490((byte) -109);
    }

    public static void method1737(int i, int i_4_, int i_5_, int i_6_,
                                  Animable class1, Animable class1_7_, int i_8_,
                                  int i_9_, long l) {
        if (class1 != null || class1_7_ != null) {
            Class64 class64 = new Class64();
            class64.aLong1185 = l;
            class64.anInt1183 = i_4_ * 128 + 64;
            class64.anInt1176 = i_5_ * 128 + 64;
            class64.anInt1186 = i_6_;
            class64.aClass1_1181 = class1;
            class64.aClass1_1184 = class1_7_;
            class64.anInt1187 = i_8_;
            class64.anInt1177 = i_9_;
            for (int i_10_ = i; i_10_ >= 0; i_10_--) {
                if (Class22.aClass68_Sub1ArrayArrayArray484[i_10_][i_4_][i_5_]
                        == null)
                    Class22.aClass68_Sub1ArrayArrayArray484[i_10_][i_4_][i_5_]
                            = new Class68_Sub1(i_10_, i_4_, i_5_);
            }
            Class22.aClass68_Sub1ArrayArrayArray484[i][i_4_][i_5_]
                    .aClass64_2757
                    = class64;
        }
    }

    static {
        aRSString_2086 = aRSString_2091;
    }
}
