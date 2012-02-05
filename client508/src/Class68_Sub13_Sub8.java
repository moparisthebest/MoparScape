/* Class68_Sub13_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub8 extends Class68_Sub13 {
    public static int anInt3557;
    public static int anInt3558;
    public static int anInt3559;
    public static PacketStream inStream
            = new PacketStream(5000);
    public static Class98 aClass98_3561 = new Class98(64);
    public static int anInt3562;
    public static int anInt3563;
    public static Class113 aClass113_3564 = new Class113(32);
    public static RSString aRSString_3565;
    public static RSString aRSString_3566 = RSString.newRsString("T");

    public static boolean method733(int i, int i_0_) {
        if (i != 0)
            return false;
        anInt3558++;
        if ((0x1 & i_0_ >> 586962909) == 0)
            return false;
        return true;
    }

    public int[] method698(byte i, int i_1_) {
        anInt3563++;
        if (i != -61)
            method698((byte) -99, 53);
        int[] is = aClass115_2936.method1697(false, i_1_);
        if (aClass115_2936.aBoolean1957)
            Class39.method464(is, 0, Class68_Sub13_Sub19.anInt3746,
                    Class13_Sub3.anIntArray2672[i_1_]);
        return is;
    }

    public Class68_Sub13_Sub8() {
        super(0, true);
    }

    public static RSString method734(int i, Stream class68_sub14,
                                     int i_2_) {
        anInt3559++;
        try {
            RSString class100 = new RSString();
            class100.anInt2293 = class68_sub14.method912(255);
            if (class100.anInt2293 > i_2_)
                class100.anInt2293 = i_2_;
            class100.bytes = new byte[class100.anInt2293];
            class68_sub14.currentOffset += (Class68_Sub16.aClass103_3028.method1635(class100.bytes, i + 8, class68_sub14.currentOffset, class100.anInt2293, i, class68_sub14.buffer));
            return class100;
        } catch (Exception exception) {
            return Class68_Sub1.aRSString_2761;
        }
    }

    public static void method735(int i) {
        aClass113_3564 = null;
        aClass98_3561 = null;
        aRSString_3566 = null;
        if (i != 9071)
            aClass113_3564 = null;
        aRSString_3565 = null;
        inStream = null;
    }

    static {
        aRSString_3565 = RSString.newRsString("Standort");
    }
}
