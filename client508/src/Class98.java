/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98 {
    public static Class45 aClass45_1720;
    public static int anInt1721;
    public int anInt1722;
    public Class113 aClass113_1723;
    public static int[] anIntArray1724 = new int[200];
    public static int anInt1725;
    public static int anInt1726;
    public static int anInt1727;
    public static int anInt1728;
    public static int anInt1729;
    public Class128 aClass128_1730 = new Class128();
    public static int anInt1731;
    public int anInt1732;

    public static void method1563(int i, int i_0_) {
        anInt1728++;
        if (i_0_ >= 52)
            Class121.aClass98_2100.method1564(-18767, i);
    }

    public void method1564(int i, int i_1_) {
        if (i != -18767)
            anIntArray1724 = null;
        if (Class68_Sub16.aClass105_3024 != null) {
            for (Class68_Sub20_Sub13 class68_sub20_sub13
                         = (Class68_Sub20_Sub13) aClass128_1730.method1784(1742);
                 class68_sub20_sub13 != null;
                 class68_sub20_sub13
                         = ((Class68_Sub20_Sub13)
                         aClass128_1730.method1791(i + 18644))) {
                if (class68_sub20_sub13.method1163(-111)) {
                    if (class68_sub20_sub13.method1161(i ^ 0x491b) == null) {
                        class68_sub20_sub13.method647(i + 1213);
                        class68_sub20_sub13.method1005((byte) 73);
                        anInt1722++;
                    }
                } else if ((++class68_sub20_sub13.aLong3085
                        ^ 0xffffffffffffffffL)
                        < ((long) i_1_ ^ 0xffffffffffffffffL)) {
                    Class68_Sub20_Sub13 class68_sub20_sub13_2_
                            = Class68_Sub16.aClass105_3024
                            .method1641(class68_sub20_sub13, (byte) 122);
                    aClass113_1723.method1677((byte) 126,
                            class68_sub20_sub13_2_,
                            class68_sub20_sub13.aLong1218);
                    Class12.method239((byte) -74, class68_sub20_sub13_2_,
                            class68_sub20_sub13);
                    class68_sub20_sub13.method647(-17554);
                    class68_sub20_sub13.method1005((byte) 73);
                }
            }
        }
        anInt1731++;
    }

    public static void method1565(byte i) {
        aClass45_1720 = null;
        anIntArray1724 = null;
        int i_3_ = -75 / ((80 - i) / 41);
    }

    public void method1566(byte i) {
        if (i == 94) {
            anInt1726++;
            aClass128_1730.method1783((byte) -39);
            aClass113_1723.method1684(false);
            anInt1722 = anInt1732;
        }
    }

    public void method1567(int i) {
        for (Class68_Sub20_Sub13 class68_sub20_sub13
                     = (Class68_Sub20_Sub13) aClass128_1730.method1784(1742);
             class68_sub20_sub13 != null;
             class68_sub20_sub13
                     = (Class68_Sub20_Sub13) aClass128_1730.method1791(-105)) {
            if (class68_sub20_sub13.method1163(-112)) {
                class68_sub20_sub13.method647(-17554);
                class68_sub20_sub13.method1005((byte) 73);
                anInt1722++;
            }
        }
        anInt1725++;
        int i_4_ = 13 % ((i - 51) / 56);
    }

    public void method1568(Object object, int i, long l) {
        try {
            anInt1727++;
            method1569((byte) 28, l);
            if ((anInt1722 ^ 0xffffffff) == -1) {
                Class68_Sub20_Sub13 class68_sub20_sub13
                        = (Class68_Sub20_Sub13) aClass128_1730.method1790(2265);
                class68_sub20_sub13.method647(-17554);
                class68_sub20_sub13.method1005((byte) 73);
            } else
                anInt1722--;
            if (i > 95) {
                Class68_Sub20_Sub13_Sub2 class68_sub20_sub13_sub2
                        = new Class68_Sub20_Sub13_Sub2(object);
                aClass113_1723.method1677((byte) 125, class68_sub20_sub13_sub2,
                        l);
                aClass128_1730.method1787(71, class68_sub20_sub13_sub2);
                class68_sub20_sub13_sub2.aLong3085 = 0L;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("qc.D("
                            + (object != null ? "{...}" : "null")
                            + ',' + i + ',' + l + ')'));
        }
    }

    public void method1569(byte i, long l) {
        do {
            try {
                anInt1729++;
                Class68_Sub20_Sub13 class68_sub20_sub13
                        = ((Class68_Sub20_Sub13)
                        aClass113_1723.method1678(l, i + -111));
                if (class68_sub20_sub13 != null) {
                    class68_sub20_sub13.method647(-17554);
                    class68_sub20_sub13.method1005((byte) 73);
                    anInt1722++;
                }
                if (i == 28)
                    break;
                anInt1732 = -4;
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        "qc.A(" + i + ',' + l + ')');
            }
            break;
        } while (false);
    }

    public Object method1570(int i, long l) {
        try {
            anInt1721++;
            if (i != 14366)
                method1565((byte) 64);
            Class68_Sub20_Sub13 class68_sub20_sub13
                    = (Class68_Sub20_Sub13) aClass113_1723.method1678(l, 90);
            if (class68_sub20_sub13 == null)
                return null;
            Object object = class68_sub20_sub13.method1161(-105);
            if (object == null) {
                class68_sub20_sub13.method647(-17554);
                class68_sub20_sub13.method1005((byte) 73);
                anInt1722++;
                return null;
            }
            if (!class68_sub20_sub13.method1163(-109)) {
                aClass128_1730.method1787(i ^ 0x385b, class68_sub20_sub13);
                class68_sub20_sub13.aLong3085 = 0L;
            } else {
                Class68_Sub20_Sub13_Sub2 class68_sub20_sub13_sub2
                        = new Class68_Sub20_Sub13_Sub2(object);
                aClass113_1723.method1677((byte) -40, class68_sub20_sub13_sub2,
                        class68_sub20_sub13.aLong1218);
                aClass128_1730.method1787(99, class68_sub20_sub13_sub2);
                class68_sub20_sub13_sub2.aLong3085 = 0L;
                class68_sub20_sub13.method647(i ^ ~0x7c8f);
                class68_sub20_sub13.method1005((byte) 73);
            }
            return object;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "qc.E(" + i + ',' + l + ')');
        }
    }

    public Class98(int i) {
        anInt1732 = i;
        int i_5_ = 1;
        anInt1722 = i;
        for (/**/; (i ^ 0xffffffff) < (i_5_ + i_5_ ^ 0xffffffff);
                 i_5_ += i_5_) {
            /* empty */
        }
        aClass113_1723 = new Class113(i_5_);
    }

    public static void method1571(int i, int i_6_, int i_7_, int i_8_,
                                  Animable class1, long l, boolean bool) {
        if (class1 != null) {
            Class47 class47 = new Class47();
            class47.aClass1_931 = class1;
            class47.anInt941 = i_6_ * 128 + 64;
            class47.anInt932 = i_7_ * 128 + 64;
            class47.anInt937 = i_8_;
            class47.aLong943 = l;
            if (Class22.aClass68_Sub1ArrayArrayArray484[i][i_6_][i_7_] == null)
                Class22.aClass68_Sub1ArrayArrayArray484[i][i_6_][i_7_]
                        = new Class68_Sub1(i, i_6_, i_7_);
            Class22.aClass68_Sub1ArrayArrayArray484[i][i_6_][i_7_]
                    .aClass47_2777
                    = class47;
        }
    }
}
