/* Class68_Sub20_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub19 extends Class68_Sub20 {
    public static int[] anIntArray4452 = new int[1000];
    public static int anInt4453;
    public byte[] aByteArray4454;
    public static short[][] aShortArrayArray4455
            = {{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437,
            2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580,
            784, 21966, 28950, -15697, -14002},
            {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145,
                    -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673,
                    -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019},
            new short[0], new short[0], new short[0]};

    public static int method1188(int i, byte i_0_) {
        i = (~0x2aaaaaaa & i >>> -537680191) + (0x55555555 & i);
        anInt4453++;
        i = ((i & ~0x33333333) >>> 2117050626) + (i & 0x33333333);
        i = (i >>> -1297626044) + i & 0xf0f0f0f;
        i += i >>> 1350981032;
        if (i_0_ >= -71)
            method1188(-59, (byte) 11);
        i += i >>> -1295753584;
        return 0xff & i;
    }

    public Class68_Sub20_Sub19(byte[] is) {
        aByteArray4454 = is;
    }

    public static void method1189(int i) {
        if (i == 26507) {
            anIntArray4452 = null;
            aShortArrayArray4455 = null;
        }
    }
}
