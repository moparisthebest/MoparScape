/* Class68_Sub13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub2 extends Class68_Sub13 {
    public static int anInt3456;
    public static int anInt3457;
    public static RSString aRSString_3458;
    public static Class98 aClass98_3459;
    public static boolean aBoolean3460 = true;
    public static int anInt3461;
    public static int anInt3462;
    public static Class92_Sub1[] aClass92_Sub1Array3463;

    public static Class53 method707(int i, byte i_0_) {
        anInt3461++;
        Class53 class53
                = ((Class53)
                PacketStream.aClass98_4118.method1570(14366, (long) i));
        if (i_0_ != -128)
            return null;
        if (class53 != null)
            return class53;
        byte[] is = Class28.aClass21_528.method338(i, i_0_ + 128, 1);
        class53 = new Class53();
        if (is != null)
            class53.method546(i_0_ ^ ~0x7f, i, new Stream(is));
        PacketStream.aClass98_4118.method1568(class53, 119, (long) i);
        return class53;
    }

    public static void method708(byte i) {
        aClass92_Sub1Array3463 = null;
        if (i != -47)
            aClass98_3459 = null;
        aClass98_3459 = null;
        aRSString_3458 = null;
    }

    public int[] method698(byte i, int i_1_) {
        anInt3456++;
        int[] is = aClass115_2936.method1697(false, i_1_);
        if (aClass115_2936.aBoolean1957) {
            int i_2_ = Class13_Sub3.anIntArray2672[i_1_];
            for (int i_3_ = 0;
                 ((i_3_ ^ 0xffffffff)
                         > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                 i_3_++)
                is[i_3_] = (method709(-113, i_2_,
                        Class68_Sub13_Sub3.anIntArray3479[i_3_])
                        % 4096);
        }
        if (i != -61)
            return null;
        return is;
    }

    public int method709(int i, int i_4_, int i_5_) {
        anInt3462++;
        int i_6_ = i_4_ * 57 + i_5_;
        int i_7_ = -69 % ((i - 4) / 40);
        i_6_ ^= i_6_ << -2090844671;
        return (-((0x7fffffff
                & (789221 + 15731 * (i_6_ * i_6_)) * i_6_ + 1376312589)
                / 262144)
                + 4096);
    }

    public static int method710(boolean bool, int i) {
        anInt3457++;
        long l = Class36.method438(17161);
        Class68_Sub15 class68_sub15
                = (bool ? (Class68_Sub15) Class37.aClass113_646.method1679(-32642)
                : ((Class68_Sub15)
                Class37.aClass113_646.method1683((byte) -118)));
        int i_8_ = 78 / ((-52 - i) / 58);
        for (/**/; class68_sub15 != null;
                 class68_sub15 = ((Class68_Sub15)
                         Class37.aClass113_646.method1683((byte) -108))) {
            if ((class68_sub15.aLong3014 & 0x3fffffffffffffffL) < l) {
                if ((0x4000000000000000L & class68_sub15.aLong3014) != 0L) {
                    int i_9_ = (int) class68_sub15.aLong1218;
                    Class103.anIntArray1767[i_9_] = Class3.anIntArray79[i_9_];
                    class68_sub15.method647(-17554);
                    return i_9_;
                }
                class68_sub15.method647(-17554);
            }
        }
        return -1;
    }

    public Class68_Sub13_Sub2() {
        super(0, true);
    }

    static {
        aRSString_3458 = RSString.newRsString("leuchten1:");
        aClass98_3459 = new Class98(260);
    }
}
