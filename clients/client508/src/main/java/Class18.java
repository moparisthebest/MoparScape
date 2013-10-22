/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class18 {
    public int anInt286;
    public byte[] aByteArray287;
    public byte[] aByteArray288 = new byte[18002];
    public static Class68_Sub20_Sub1_Sub1 aClass68_Sub20_Sub1_Sub1_289;
    public int anInt290;
    public int[] anIntArray291;
    public int anInt292;
    public int anInt293;
    public int anInt294;
    public byte[] aByteArray295;
    public static RSString aRSString_296;
    public byte aByte297;
    public int anInt298;
    public int[] anIntArray299;
    public byte[][] aByteArrayArray300 = new byte[6][258];
    public static int anInt301;
    public int anInt302;
    public int[][] anIntArrayArray303;
    public boolean[] aBooleanArray304;
    public int anInt305;
    public int anInt306;
    public int anInt307;
    public int anInt308;
    public static RSString aRSString_309;
    public int anInt310;
    public byte[] aByteArray311;
    public byte[] aByteArray312;
    public int anInt313;
    public int anInt314;
    public int anInt315;
    public static int anInt316;
    public static int anInt317;
    public static int anInt318;
    public int[] anIntArray319;
    public static RSString aRSString_320 = RSString.newRsString("M");
    public int[][] anIntArrayArray321;
    public int[] anIntArray322;
    public byte[] aByteArray323;
    public int[][] anIntArrayArray324;
    public boolean[] aBooleanArray325;
    public static int anInt326;

    public static void method299(int i) {
        aRSString_320 = null;
        aRSString_296 = null;
        aClass68_Sub20_Sub1_Sub1_289 = null;
        if (i == 18002)
            aRSString_309 = null;
    }

    public static int method300(int i, boolean bool) {
        if (bool != false)
            return 80;
        anInt317++;
        Class48 class48 = Class68_Sub13_Sub11.method752((byte) 81, i);
        int i_0_ = class48.anInt956;
        int i_1_ = class48.anInt958;
        int i_2_ = Class16.anIntArray259[i_0_ + -i_1_];
        int i_3_ = class48.anInt945;
        return i_2_ & Class103.anIntArray1767[i_3_] >> i_1_;
    }

    public static void method301(int i) {
        if (i > -84)
            method302(-32, null, 85);
        PacketStream.aClass98_4118.method1566((byte) 94);
        anInt326++;
    }

    public static void method302(int i, Class45[] class45s, int i_4_) {
        for (int i_5_ = i; i_5_ < class45s.length; i_5_++) {
            Class45 class45 = class45s[i_5_];
            if (class45 != null
                    && (class45.anInt799 ^ 0xffffffff) == (i_4_ ^ 0xffffffff)
                    && (!class45.aBoolean863 || !client.method45(class45))) {
                if ((class45.anInt896 ^ 0xffffffff) == -1) {
                    if (!class45.aBoolean863 && client.method45(class45)
                            && Class108.aClass45_1825 != class45)
                        continue;
                    method302(i, class45s, class45.anInt792);
                    if (class45.aClass45Array769 != null)
                        method302(i, class45.aClass45Array769,
                                class45.anInt792);
                    Class68_Sub3 class68_sub3
                            = ((Class68_Sub3)
                            Login.aClass113_1512
                                    .method1678((long) class45.anInt792, i + -53));
                    if (class68_sub3 != null)
                        Class43.method480(class68_sub3.anInt2803, -1);
                }
                if (class45.anInt896 == 6) {
                    if ((class45.anInt831 ^ 0xffffffff) != 0
                            || class45.anInt869 != -1) {
                        boolean bool = Class68_Sub19.method1000(i, class45);
                        int i_6_;
                        if (bool)
                            i_6_ = class45.anInt869;
                        else
                            i_6_ = class45.anInt831;
                        if (i_6_ != -1) {
                            Class55 class117
                                    = Class64.method624((byte) -36, i_6_);
                            if (class117 != null) {
                                class45.anInt771 += Class109.anInt1844;
                                while (((class117.anIntArray2058
                                        [class45.anInt756])
                                        ^ 0xffffffff)
                                        > (class45.anInt771 ^ 0xffffffff)) {
                                    class45.anInt771
                                            -= (class117.anIntArray2058
                                            [class45.anInt756]);
                                    class45.anInt756++;
                                    if ((class45.anInt756 ^ 0xffffffff)
                                            <= (class117.anIntArray2035.length
                                            ^ 0xffffffff)) {
                                        class45.anInt756 -= class117.anInt2072;
                                        if (class45.anInt756 < 0
                                                || (class117.anIntArray2035.length
                                                <= class45.anInt756))
                                            class45.anInt756 = 0;
                                    }
                                    Class113.method1682(class45, -124);
                                }
                            }
                        }
                    }
                    if (class45.anInt910 != 0 && !class45.aBoolean863) {
                        int i_7_ = class45.anInt910 >> -1796951952;
                        i_7_ *= Class109.anInt1844;
                        class45.anInt864 = i_7_ + class45.anInt864 & 0x7ff;
                        int i_8_
                                = class45.anInt910 << -486371248 >> -538030224;
                        i_8_ *= Class109.anInt1844;
                        class45.anInt814 = i_8_ + class45.anInt814 & 0x7ff;
                        Class113.method1682(class45, i + -115);
                    }
                }
            }
        }
        anInt301++;
    }

    public Class18() {
        anIntArray299 = new int[16];
        anIntArrayArray303 = new int[6][258];
        aByteArray311 = new byte[256];
        aByteArray287 = new byte[4096];
        anIntArray291 = new int[257];
        aBooleanArray304 = new boolean[256];
        anInt308 = 0;
        aByteArray323 = new byte[18002];
        anIntArrayArray321 = new int[6][258];
        anInt315 = 0;
        aBooleanArray325 = new boolean[16];
        anIntArrayArray324 = new int[6][258];
        anIntArray319 = new int[256];
        anIntArray322 = new int[6];
    }

    static {
        aRSString_309 = aRSString_320;
        anInt316 = (int) (33.0 * Math.random()) + -16;
        aRSString_296 = aRSString_320;
    }
}
