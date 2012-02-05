/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4 {
    public static int anInt90;
    public static int anInt91;
    public static int anInt92;
    public static int anInt93 = 0;
    public static RSString aRSString_94 = RSString.newRsString("(U2");
    public static boolean[] aBooleanArray95 = new boolean[100];
    public static int[] anIntArray96;
    public static int anInt97;

    public static Class68_Sub20_Sub16 method184(Stream class68_sub14,
                                                int i) {
        anInt97++;
        Class68_Sub20_Sub16 class68_sub20_sub16
                = new Class68_Sub20_Sub16(class68_sub14.readString(127),
                class68_sub14.readString(i + 126),
                class68_sub14.readUnsignedWord(1355769544),
                class68_sub14.readUnsignedWord(1355769544),
                class68_sub14.readDWord(),
                i == class68_sub14.readUnsignedByte(-6677));
        int i_0_ = class68_sub14.readUnsignedByte(-6677);
        for (int i_1_ = 0; i_0_ > i_1_; i_1_++)
            class68_sub20_sub16.aClass16_4430.method286
                    (new Class68_Sub4(class68_sub14.readUnsignedWord(1355769544),
                            class68_sub14.readUnsignedWord(1355769544),
                            class68_sub14.readUnsignedWord(1355769544),
                            class68_sub14.readUnsignedWord(1355769544)),
                            true);
        class68_sub20_sub16.method1172(i ^ 0x3201);
        return class68_sub20_sub16;
    }

    public static int method185(int i, int i_2_, int i_3_) {
        anInt91++;
        if ((i_3_ ^ 0xffffffff) == 0)
            return 12345678;
        i_2_ = i_2_ * (i_3_ & 0x7f) >> 1673451751;
        if (i_2_ >= i) {
            if (i_2_ > 126)
                i_2_ = 126;
        } else
            i_2_ = 2;
        return (i_3_ & 0xff80) + i_2_;
    }

    public static void method186(int i, int i_4_) {
        for (Class68_Sub10 class68_sub10
                     = (Class68_Sub10) Class106.aClass113_1803.method1679(-32642);
             class68_sub10 != null;
             class68_sub10 = (Class68_Sub10) Class106.aClass113_1803
                     .method1683((byte) -119)) {
            if ((0xffffL & class68_sub10.aLong1218 >> 950968368) == (long) i)
                class68_sub10.method647(-17554);
        }
        if (i_4_ == 2)
            anInt90++;
    }

    public static void method187(boolean bool) {
        if (bool != true)
            method188(-40);
        anIntArray96 = null;
        aBooleanArray95 = null;
        aRSString_94 = null;
    }

    public static void method188(int i) {
        anInt92++;
        if (i != -26678)
            aRSString_94 = null;
        Class68_Sub13_Sub8.aClass98_3561.method1567(-6);
    }
}
