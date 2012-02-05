/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75 {
    public static int anInt1339;
    public static RSString aRSString_1340
            = RSString.newRsString("Mitglieder)2Welt");
    public static RSString aRSString_1341;
    public static RSString aRSString_1342
            = RSString.newRsString(" from your ignore list first)3");
    public static Class16 aClass16_1343;
    public static Class65 aClass65_1344;

    public static void method1385(byte i) {
        aClass65_1344 = null;
        if (i <= 43)
            method1385((byte) 71);
        aRSString_1342 = null;
        aClass16_1343 = null;
        aRSString_1341 = null;
        aRSString_1340 = null;
    }

    public static void method1386(int i, Class21renamed class21) {
        if (i != -10509)
            method1386(111, null);
        anInt1339++;
        if (!Class33.aBoolean587) {
            Class79.method1418();
            Class96.aClass68_Sub20_Sub10_1700
                    = Class128.method1789(class21, i + 33972, Class17.anInt279);
            Class96.aClass68_Sub20_Sub10_1700.method1108(-95, 0);
            //xxx render logo (while cache is loading):
//            Class15.aClass92_251 = Class67.method642(class21, Class68_Sub13_Sub14.anInt3670, -30509);
//            Class15.aClass92_251.method1527(382 - Class15.aClass92_251.anInt1659 / 2, 18);
            Class33.aBoolean587 = true;
        }
    }

    static {
        aRSString_1341 = aRSString_1342;
        aClass16_1343 = new Class16();
    }
}
