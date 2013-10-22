/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class33 {
    public static int anInt575;
    public static int anInt576 = 0;
    public static int anInt577 = 0;
    public static int anInt578;
    public static short[] aShortArray579 = new short[256];
    public static int anInt580;
    public static Class86 aClass86_581;
    public static RSString[] aRSStringArray582 = new RSString[500];
    public static Class21_Sub1 aClass21_Sub1_583;
    public static int[][][] anIntArrayArrayArray584;
    public static RSString aRSString_585;
    public static RSString aRSString_586;
    public static boolean aBoolean587;
    public static int anInt588;
    public static int anInt589;
    public static volatile int anInt590;

    public static void method411(byte i) {
        anIntArrayArrayArray584 = null;
        if (i < 125)
            aClass21_Sub1_583 = null;
        aRSStringArray582 = null;
        aRSString_585 = null;
        aRSString_586 = null;
        aClass86_581 = null;
        aClass21_Sub1_583 = null;
        aShortArray579 = null;
    }

    public static synchronized byte[] method412(int i, byte i_0_) {
        anInt580++;
        if (i_0_ != -85)
            return null;
        if ((i ^ 0xffffffff) == -101 && Class13_Sub3.anInt2675 > 0) {
            byte[] is = Class114.aByteArrayArray1937[--Class13_Sub3.anInt2675];
            Class114.aByteArrayArray1937[Class13_Sub3.anInt2675] = null;
            return is;
        }
        if ((i ^ 0xffffffff) == -5001 && Class68.anInt1232 > 0) {
            byte[] is = Class107.aByteArrayArray1817[--Class68.anInt1232];
            Class107.aByteArrayArray1817[Class68.anInt1232] = null;
            return is;
        }
        if (i == 30000 && (Class120.anInt2094 ^ 0xffffffff) < -1) {
            byte[] is = (Class68_Sub13_Sub27.aByteArrayArray3905
                    [--Class120.anInt2094]);
            Class68_Sub13_Sub27.aByteArrayArray3905[Class120.anInt2094] = null;
            return is;
        }
        return new byte[i];
    }

    public static void method413
            (int i, int i_1_, Class45 class45, int i_2_, int i_3_,
             Class68_Sub20_Sub10 class68_sub20_sub10, int i_4_) {
        try {
            anInt578++;
            if (class68_sub20_sub10 != null) {
                int i_5_
                        = 0x7ff & Class68_Sub13_Sub26.anInt3883 + Class8.anInt163;
                int i_6_
                        = (Math.max(class45.anInt892 / 2, class45.anInt873 / 2)
                        - -10);
                int i_7_ = i_3_ * i_3_ - -(i * i);
                if ((i_6_ * i_6_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)) {
                    int i_8_ = Class62.anIntArray1155[i_5_];
                    int i_9_ = Class62.anIntArray1167[i_5_];
                    i_9_ = i_9_ * 256 / (256 + Class68_Sub20_Sub16.anInt4420);
                    i_8_ = 256 * i_8_ / (Class68_Sub20_Sub16.anInt4420 - -256);
                    if (i_1_ <= -23) {
                        int i_10_ = i_9_ * i_3_ + i_8_ * i >> -11489424;
                        int i_11_ = -(i_3_ * i_8_) + i * i_9_ >> -1721779952;
                        ((Sprite) class68_sub20_sub10)
                                .method1127
                                        ((i_10_ + (i_2_ + class45.anInt892 / 2)
                                                - class68_sub20_sub10.anInt4305 / 2),
                                                (-(class68_sub20_sub10.anInt4313 / 2)
                                                        + (i_4_ + class45.anInt873 / 2) + -i_11_),
                                                class45.anIntArray854, class45.anIntArray783);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("fb.A(" + i + ',' + i_1_ + ','
                            + (class45 != null ? "{...}" : "null")
                            + ',' + i_2_ + ',' + i_3_ + ','
                            + (class68_sub20_sub10 != null ? "{...}"
                            : "null")
                            + ',' + i_4_ + ')'));
        }
    }

    static {
        aClass86_581 = new Class86();
        aRSString_585 = RSString.newRsString(" loggt sich aus)3");
        aRSString_586 = RSString.newRsString("");
        anInt590 = 0;
    }
}
