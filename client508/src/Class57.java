/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57 {
    public static Class21_Sub1 aClass21_Sub1_1068;
    public int anInt1069;
    public static int anInt1070;
    public long aLong1071;
    public static RSString aRSString_1072
            = (RSString.newRsString
            (
                    "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q"));
    public Animable aClass1_1073;
    public int anInt1074;
    public int anInt1075;
    public static int anInt1076;
    public static int[] anIntArray1077
            = {16776960, 16711680, 65280, 65535, 16711935, 16777215};
    public Animable aClass1_1078;
    public static int anInt1079;
    public static int anInt1080 = 0;
    public static RSString aRSString_1081;
    public static int anInt1082;
    public Animable aClass1_1083;
    public static int anInt1084;
    public int anInt1085;
    public static RSString aRSString_1086
            = RSString.newRsString("Members object");

    public static boolean method573(int i, int i_0_) {
        if (i != 140)
            anIntArray1077 = null;
        anInt1084++;
        if (i_0_ != 198 && (i_0_ ^ 0xffffffff) != -231 && i_0_ != 156
                && i_0_ != 140 && (i_0_ ^ 0xffffffff) != -224)
            return false;
        return true;
    }

    public static void method574(int i) {
        aClass21_Sub1_1068 = null;
        aRSString_1081 = null;
        anIntArray1077 = null;
        aRSString_1072 = null;
        if (i == 156)
            aRSString_1086 = null;
    }

    public static void method575(byte i, int i_1_, int i_2_, int i_3_) {
        anInt1082++;
        if (Class106.anInt1801 != 0 && (i_2_ ^ 0xffffffff) != -1
                && (Class1_Sub2.anInt2435 ^ 0xffffffff) > -51
                && (i_3_ ^ 0xffffffff) != 0) {
            Login.anIntArray1515[Class1_Sub2.anInt2435] = i_3_;
            PacketParser.anIntArray1876[Class1_Sub2.anInt2435] = i_2_;
            Class34.anIntArray596[Class1_Sub2.anInt2435] = i_1_;
            Class3.aClass46Array80[Class1_Sub2.anInt2435] = null;
            Class102.anIntArray1757[Class1_Sub2.anInt2435] = 0;
            Class1_Sub2.anInt2435++;
        }
        int i_4_ = 68 / ((59 - i) / 45);
    }

    public static void method576(int i, int i_5_) {
        anInt1076++;
        Class91.aClass98_1636.method1564(-18767, i);
        Class11.aClass98_193.method1564(-18767, i);
        if (i_5_ != 0)
            method575((byte) -5, 17, -8, 87);
    }

    static {
        aRSString_1081 = aRSString_1086;
    }
}
