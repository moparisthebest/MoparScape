/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class32 {
    public static int anInt560;
    public static int anInt561;
    public static RSString aRSString_562;
    public static Class45 aClass45_563;
    public int anInt564 = 0;
    public static int anInt565 = 0;
    public static RSString aRSString_566 = RSString.newRsString(")2");
    public static RSString aRSString_567
            = RSString.newRsString("Lade Schrifts-=tze )2 ");
    public static int anInt568;
    public static RSString aRSString_569;
    public static int anInt570;
    public static RSString aRSString_571;
    public static int anInt572;
    public static int anInt573 = 0;
    public static int anInt574;

    public void method406(Stream class68_sub14, int i, int i_0_) {
        anInt570++;
        if (i_0_ == (i ^ 0xffffffff))
            anInt564 = class68_sub14.readUnsignedWord(1355769544);
    }

    public void method407(int i, Stream class68_sub14) {
        if (i == 0) {
            anInt568++;
            for (; ; ) {
                int i_1_ = class68_sub14.readUnsignedByte(-6677);
                if (i_1_ == 0)
                    break;
                method406(class68_sub14, i_1_, -6);
            }
        }
    }

    public static void method408(int i) {
        if (Class68_Sub25.updateSocketCopy != null)
            Class68_Sub25.updateSocketCopy.method594(-81);
        if (i >= -63)
            method409(-12, 100, 4, -112);
        anInt572++;
    }

    public static Class68_Sub3 method409(int i, int i_2_, int i_3_, int i_4_) {
        anInt561++;
        Class68_Sub3 class68_sub3 = new Class68_Sub3();
        class68_sub3.anInt2800 = i;
        class68_sub3.anInt2803 = i_2_;
        Login.aClass113_1512.method1677((byte) 127, class68_sub3,
                (long) i_4_);
        Class76.method1406(i_2_, (byte) 112);
        Class45 class45 = Class68_Sub20_Sub15.method1170(i_4_, (byte) -80);
        if (class45 != null)
            Class113.method1682(class45, -116);
        if (Class29.aClass45_539 != null) {
            Class113.method1682(Class29.aClass45_539, -125);
            Class29.aClass45_539 = null;
        }
        Class68_Sub13_Sub21.anInt3803 = 0;
        Class120.aBoolean2099 = false;
        Class127.method1781(Class49.anInt969, Class68_Sub13_Sub14.anInt3667,
                Class68_Sub13_Sub15.anInt3687, Class33.anInt588,
                (byte) -114);
        if (class45 != null)
            Class68_Sub13_Sub27.method838(-1, false, class45);
        Class71.method1340(-1, i_2_);
        int i_5_ = -12 / ((i_3_ - 65) / 56);
        if (Class68_Sub13_Sub10.anInt3595 != -1)
            GameException.method1796(99, Class68_Sub13_Sub10.anInt3595,
                    1);
        return class68_sub3;
    }

    public static void method410(byte i) {
        aRSString_569 = null;
        aRSString_566 = null;
        aClass45_563 = null;
        aRSString_562 = null;
        if (i >= -21)
            method409(13, 66, -29, -26);
        aRSString_567 = null;
        aRSString_571 = null;
    }

    static {
        aRSString_571 = RSString.newRsString("Loading sprites )2 ");
        aRSString_562 = aRSString_571;
        aRSString_569 = RSString.newRsString("sl_back");
        anInt574 = 0;
    }
}
