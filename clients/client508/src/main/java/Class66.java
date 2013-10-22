/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66 {
    public static Class123 aClass123_1200 = new Class123();
    public static int anInt1201;
    public static int anInt1202;
    public static Class21renamed aClass21_1203;
    public static int anInt1204;
    public static int anInt1205;

    public static void method636(int i) {
        if (i == 0) {
            aClass123_1200 = null;
            aClass21_1203 = null;
        }
    }

    public static Class45 method637(int i, boolean bool, int i_0_) {
        if (bool != false)
            aClass123_1200 = null;
        Class45 class45 = Class68_Sub20_Sub15.method1170(i, (byte) -80);
        anInt1202++;
        if ((i_0_ ^ 0xffffffff) == 0)
            return class45;
        if (class45 == null || class45.aClass45Array769 == null
                || ((class45.aClass45Array769.length ^ 0xffffffff)
                >= (i_0_ ^ 0xffffffff)))
            return null;
        return class45.aClass45Array769[i_0_];
    }

    public static void method638(int i, int i_1_, int i_2_) {
        Class3.anIntArray79[i_2_] = i_1_;
        Class68_Sub15 class68_sub15
                = ((Class68_Sub15)
                Class37.aClass113_646.method1678((long) i_2_, -88));
        anInt1204++;
        int i_3_ = 124 % ((i - -11) / 61);
        if (class68_sub15 != null) {
            if (class68_sub15.aLong3014 != 4611686018427387905L)
                class68_sub15.aLong3014
                        = 0x4000000000000000L | Class36.method438(17161) - -500L;
        } else {
            class68_sub15 = new Class68_Sub15(4611686018427387905L);
            Class37.aClass113_646.method1677((byte) -57, class68_sub15,
                    (long) i_2_);
        }
    }
}
