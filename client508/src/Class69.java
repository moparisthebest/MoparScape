/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class69 {
    public static volatile boolean aBoolean1233;
    public int anInt1234;
    public static int anInt1235;
    public static RSString aRSString_1236;
    public static boolean[] aBooleanArray1237 = new boolean[5];
    public int anInt1238;
    public static int anInt1239;
    public static byte[][] aByteArrayArray1240;
    public static Applet_Sub1 anApplet_Sub1_1241;
    public Animable aClass1_1242;
    public long aLong1243 = 0L;
    public static RSString aRSString_1244
            = RSString.newRsString("(Y<)4col>");
    public static int anInt1245;
    public static RSString aRSString_1246;
    public static int anInt1247;
    public static int anInt1248;
    public int anInt1249;
    public int anInt1250;
    public static RSString aRSString_1251;
    public int anInt1252;
    public int anInt1253;
    public int anInt1254;
    public int anInt1255;
    public int anInt1256;
    public static int[] anIntArray1257;
    public static int anInt1258;
    public static RSString aRSString_1259;
    public int anInt1260;
    public static int anInt1261;
    public int anInt1262;

    public static int method1326(int i, int i_0_, int i_1_) {
        if (i != 503159455)
            method1329((byte) 112);
        anInt1261++;
        int i_2_ = i_1_ >>> 503159455;
        return -i_2_ + (i_2_ + i_1_) / i_0_;
    }

    public static void method1327(int i) {
        Class68_Sub13_Sub34.method875((byte) 108);
        anInt1235++;
        System.gc();
        Class17.method296(i, (byte) -68);
    }

    public static void method1328(Stream class68_sub14, int i) {
        anInt1258++;
        if (Class68_Sub13_Sub4.aClass124_3486 != null) {
            try {
                Class68_Sub13_Sub4.aClass124_3486.method1760(0L, i + -23);
                Class68_Sub13_Sub4.aClass124_3486.method1755
                        (24, 0, class68_sub14.currentOffset,
                                class68_sub14.buffer);
            } catch (Exception exception) {
                /* empty */
            }
        }
        class68_sub14.currentOffset += i;
    }

    public static void method1329(byte i) {
        Class68_Sub13_Sub28.aClass98_3923.method1566((byte) 94);
        int i_3_ = 60 / ((-53 - i) / 38);
        anInt1247++;
    }

    public static void method1330(int i) {
        aRSString_1251 = null;
        aRSString_1259 = null;
        if (i != 24)
            anIntArray1257 = null;
        aRSString_1246 = null;
        anIntArray1257 = null;
        aByteArrayArray1240 = null;
        aRSString_1244 = null;
        aRSString_1236 = null;
        aBooleanArray1237 = null;
    }

    static {
        aBoolean1233 = true;
        anInt1248 = -1;
        anInt1245 = 0;
        aRSString_1251 = null;
        anApplet_Sub1_1241 = null;
        anIntArray1257 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
        aRSString_1246 = RSString.newRsString("white:");
        aRSString_1259 = aRSString_1246;
        aRSString_1236 = aRSString_1246;
    }
}
