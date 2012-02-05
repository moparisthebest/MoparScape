/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class105 {
    public static Class16 aClass16_1790 = new Class16();
    public static int anInt1791;
    public static RSString aRSString_1792 = RSString.newRsString(": ");
    public static short[] aShortArray1793;
    public static int anInt1794;
    public static int[] anIntArray1795 = new int[100];
    public static int anInt1796;
    public static int anInt1797;

    public abstract Class68_Sub20_Sub13 method1641
            (Class68_Sub20_Sub13 class68_sub20_sub13, byte i);

    public static void method1642(int i) {
        aShortArray1793 = null;
        anIntArray1795 = null;
        aClass16_1790 = null;
        if (i != 190)
            method1644((byte) 96);
        aRSString_1792 = null;
    }

    public static void method1643(Class21renamed class21, Class21renamed class21_0_, int i) {
        try {
            Class75_Sub1_Sub1.aClass21_4591 = class21;
            Class68_Sub13_Sub30.aClass21_3947 = class21_0_;
            if (i != -27619)
                aShortArray1793 = null;
            anInt1796++;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("sd.B("
                            + (class21 != null ? "{...}" : "null")
                            + ','
                            + (class21_0_ != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    public static void method1644(byte i) {
        if ((SignLink.javaVendor.toLowerCase().indexOf("microsoft")
                ^ 0xffffffff)
                != 0) {
            Class68_Sub13_Sub9.anIntArray3579[223] = 28;
            Class68_Sub13_Sub9.anIntArray3579[220] = 74;
            Class68_Sub13_Sub9.anIntArray3579[189] = 26;
            Class68_Sub13_Sub9.anIntArray3579[221] = 43;
            Class68_Sub13_Sub9.anIntArray3579[188] = 71;
            Class68_Sub13_Sub9.anIntArray3579[190] = 72;
            Class68_Sub13_Sub9.anIntArray3579[187] = 27;
            Class68_Sub13_Sub9.anIntArray3579[222] = 59;
            Class68_Sub13_Sub9.anIntArray3579[191] = 73;
            Class68_Sub13_Sub9.anIntArray3579[219] = 42;
            Class68_Sub13_Sub9.anIntArray3579[192] = 58;
            Class68_Sub13_Sub9.anIntArray3579[186] = 57;
        } else {
            Class68_Sub13_Sub9.anIntArray3579[93] = 43;
            Class68_Sub13_Sub9.anIntArray3579[92] = 74;
            Class68_Sub13_Sub9.anIntArray3579[44] = 71;
            Class68_Sub13_Sub9.anIntArray3579[45] = 26;
            Class68_Sub13_Sub9.anIntArray3579[61] = 27;
            Class68_Sub13_Sub9.anIntArray3579[47] = 73;
            Class68_Sub13_Sub9.anIntArray3579[46] = 72;
            Class68_Sub13_Sub9.anIntArray3579[59] = 57;
            Class68_Sub13_Sub9.anIntArray3579[91] = 42;
            if (SignLink.setFocusTraversalKeysEnabled != null) {
                Class68_Sub13_Sub9.anIntArray3579[222] = 58;
                Class68_Sub13_Sub9.anIntArray3579[520] = 59;
                Class68_Sub13_Sub9.anIntArray3579[192] = 28;
            } else {
                Class68_Sub13_Sub9.anIntArray3579[222] = 59;
                Class68_Sub13_Sub9.anIntArray3579[192] = 58;
            }
        }
        if (i != -109)
            method1642(-115);
        anInt1791++;
    }
}
