/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class94 {
    public static Class16 aClass16_1671 = new Class16();
    public static int anInt1672;
    public static int anInt1673;
    public static int anInt1674;
    public static int anInt1675;
    public static int anInt1676;
    public static int[] anIntArray1677;
    public static RSString aRSString_1678 = RSString.newRsString(")1 ");

    public static Class9 method1541(byte i, int i_0_) {
        anInt1675++;
        Class9 class9
                = ((Class9)
                Class68_Sub8.aClass98_2870.method1570(14366, (long) i_0_));
        if (class9 != null)
            return class9;
        if (i != 53)
            aClass16_1671 = null;
        byte[] is = Class28.aClass21_531.method338(i_0_, 0, 4);
        class9 = new Class9();
        if (is != null)
            class9.method207((byte) -64, new Stream(is), i_0_);
        Class68_Sub8.aClass98_2870.method1568(class9, i + 69, (long) i_0_);
        return class9;
    }

    public static boolean method1542(int i, int i_1_) {
        if (i != 122)
            aClass16_1671 = null;
        anInt1673++;
        if ((i_1_ < 97 || i_1_ > 122)
                && ((i_1_ ^ 0xffffffff) > -66 || (i_1_ ^ 0xffffffff) < -91))
            return false;
        return true;
    }

    public static Stream method1543(int i) {
        anInt1672++;
        if (i != 0)
            return null;
        Stream class68_sub14 = new Stream(24);
        class68_sub14.writeByte(3);
        class68_sub14.writeByte(Class45.anInt919);
        class68_sub14.writeByte(!Class23.aBoolean501 ? 0 : 1);
        class68_sub14.writeByte(Class68_Sub20_Sub2.aBoolean4188 ? 1 : 0);
        class68_sub14.writeByte(!ISAACRandomGen.aBoolean1487 ? 0 : 1);
        class68_sub14.writeByte(Class1_Sub2.aBoolean2432 ? 1 : 0);
        class68_sub14.writeByte(RSString.aBoolean2262 ? 1 : 0);
        class68_sub14.writeByte(!Class68_Sub13_Sub2.aBoolean3460 ? 0 : 1);
        class68_sub14.writeByte(Class68_Sub22.aBoolean3149 ? 1 : 0);
        class68_sub14.writeByte(
                (!Class68_Sub20_Sub13_Sub2.aBoolean4629 ? 0
                        : 1));
        class68_sub14.writeByte(Class68_Sub13_Sub26.anInt3876);
        class68_sub14.writeByte(Class68_Sub28_Sub1.aBoolean4521 ? 1 : 0);
        class68_sub14.writeByte(!Class68_Sub6.aBoolean2838 ? 0 : 1);
        class68_sub14.writeByte(!Class43.aBoolean741 ? 0 : 1);
        class68_sub14.writeByte(Class69.anInt1245);
        class68_sub14.writeByte(!Class74.aBoolean1324 ? 0 : 1);
        class68_sub14.writeByte(Class106.anInt1801);
        class68_sub14.writeByte(Class68_Sub13_Sub25.anInt3855);
        class68_sub14.writeByte(Class68_Sub20_Sub15.anInt4399);
        class68_sub14.writeWord(Class86.anInt1571);
        class68_sub14.writeWord(Class54.anInt1032);
        class68_sub14.writeByte(Class68_Sub13_Sub21.aBoolean3793 ? 1 : 0);
        return class68_sub14;
    }

    public static void method1544(byte i) {
        aRSString_1678 = null;
        int i_2_ = -64 % ((33 - i) / 51);
        anIntArray1677 = null;
        aClass16_1671 = null;
    }

    static {
        anInt1676 = 50;
    }
}
