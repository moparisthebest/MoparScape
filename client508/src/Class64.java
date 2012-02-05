/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class64 {
    public int anInt1176;
    public int anInt1177;
    public static byte[][][] aByteArrayArrayArray1178;
    public static RSString aRSString_1179 = RSString.newRsString("::fpson");
    public static int[] anIntArray1180;
    public Animable aClass1_1181;
    public static int anInt1182;
    public int anInt1183;
    public Animable aClass1_1184;
    public long aLong1185 = 0L;
    public int anInt1186;
    public int anInt1187;
    public static RSString aRSString_1188;
    public static int anInt1189;
    public static int anInt1190;
    public static int anInt1191;
    public static int anInt1192;
    public static int anInt1193;

    public static int method622(int i, boolean bool, int i_0_, byte[] is) {
        int i_1_ = -1;
        anInt1193++;
        for (int i_2_ = i_0_; (i_2_ ^ 0xffffffff) > (i ^ 0xffffffff); i_2_++)
            i_1_ = (Class68.anIntArray1219[0xff & (is[i_2_] ^ i_1_)]
                    ^ i_1_ >>> -215018360);
        if (bool != false)
            return -46;
        i_1_ ^= 0xffffffff;
        return i_1_;
    }

    public static void method623(int i) {
        if (i == -1154) {
            aByteArrayArrayArray1178 = null;
            anIntArray1180 = null;
            aRSString_1188 = null;
            aRSString_1179 = null;
        }
    }

    public static Class55 method624(byte i, int i_3_) {
        anInt1182++;
        Class55 class117
                = (Class55) Class91.aClass98_1636.method1570(14366, (long) i_3_);
        if (class117 != null)
            return class117;
        byte[] is = (Class68_Sub13_Sub24.aClass21_3831.method338
                (Class50_Sub2.method534(i_3_, (byte) 65), 0,
                        Class68_Sub20_Sub13_Sub2.method1165(i_3_, -840517817)));
        class117 = new Class55();
        if (is != null)
            class117.method1729(new Stream(is), i ^ ~0x5df5);
        if (i != -36)
            return null;
        class117.method1725((byte) -1);
        Class91.aClass98_1636.method1568(class117, i + 134, (long) i_3_);
        return class117;
    }

    public static void method625(int i) {
        Class125.aClass98_2171.method1566((byte) 94);
        Class12.aClass98_211.method1566((byte) 94);
        anInt1189++;
        if (i == -27434)
            Class68_Sub13_Sub20.aClass98_3778.method1566((byte) 94);
    }

    static {
        aByteArrayArrayArray1178 = new byte[4][104][104];
        aRSString_1188 = RSString.newRsString("sch-Utteln:");
        anInt1190 = 0;
        anInt1191 = 5063219;
    }
}
