/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class113 {
    public Class68 aClass68_1901;
    public static int anInt1902;
    public static int anInt1903;
    public static int anInt1904;
    public long aLong1905;
    public static int anInt1906;
    public int anInt1907;
    public static int anInt1908;
    public Class68[] aClass68Array1909;
    public static int anInt1910;
    public static int anInt1911;
    public static int anInt1912;
    public static int anInt1913;
    public static int anInt1914;
    public static int anInt1915;
    public static int anInt1916;
    public static int anInt1917;
    public static int anInt1918 = 100;
    public static Class68_Sub1[][][] aClass68_Sub1ArrayArrayArray1919;
    public int anInt1920 = 0;
    public static int[] anIntArray1921 = new int[1000];
    public static int anInt1922;
    public Class68 aClass68_1923;

    public void method1677(byte i, Class68 class68, long l) {
        try {
            anInt1904++;
            int i_0_ = -127 % ((i - 68) / 51);
            if (class68.aClass68_1227 != null)
                class68.method647(-17554);
            Class68 class68_1_ = aClass68Array1909[(int) ((long) (anInt1907 - 1) & l)];
            class68.aClass68_1229 = class68_1_;
            class68.aLong1218 = l;
            class68.aClass68_1227 = class68_1_.aClass68_1227;
            class68.aClass68_1227.aClass68_1229 = class68;
            class68.aClass68_1229.aClass68_1227 = class68;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception, ("tg.K(" + i + ','
                    + (class68 != null ? "{...}" : "null") + ',' + l + ')'));
        }
    }

    public Class68 method1678(long l, int i) {
        try {
            int i_2_ = -86 % ((16 - i) / 54);
            anInt1917++;
            aLong1905 = l;
            Class68 class68 = aClass68Array1909[(int) ((long) (-1 + anInt1907) & l)];
            for (aClass68_1901 = class68.aClass68_1229; class68 != aClass68_1901; aClass68_1901 = aClass68_1901.aClass68_1229) {
                if ((l ^ 0xffffffffffffffffL) == (aClass68_1901.aLong1218 ^ 0xffffffffffffffffL)) {
                    Class68 class68_3_ = aClass68_1901;
                    aClass68_1901 = aClass68_1901.aClass68_1229;
                    return class68_3_;
                }
            }
            aClass68_1901 = null;
            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception, "tg.J(" + l + ',' + i
                    + ')');
        }
    }

    public Class68 method1679(int i) {
        anInt1920 = 0;
        anInt1915++;
        if (i != -32642)
            method1686(-62);
        return method1683((byte) -119);
    }

    public int method1680(int i) {
        if (i > -126)
            aLong1905 = -127L;
        anInt1922++;
        return anInt1907;
    }

    public static void method1681(int i, Class1_Sub6_Sub2 class1_sub6_sub2) {
        anInt1913++;
        Class68_Sub18 class68_sub18 = ((Class68_Sub18) (Class1_Sub5.aClass113_2509
                .method1678(class1_sub6_sub2.aRSString_3414.toLong(i + 10909),
                        127)));
        if (i != -1)
            aClass68_Sub1ArrayArrayArray1919 = null;
        if (class68_sub18 != null) {
            if (class68_sub18.aClass68_Sub28_Sub3_3040 != null) {
                Class80.aClass68_Sub28_Sub4_1418
                        .method1314(class68_sub18.aClass68_Sub28_Sub3_3040);
                class68_sub18.aClass68_Sub28_Sub3_3040 = null;
            }
            class68_sub18.method647(-17554);
        }
    }

    public static void method1682(Class45 class45, int i) {
        if ((Class68_Sub13_Sub34.anInt4013 ^ 0xffffffff) == (class45.anInt860 ^ 0xffffffff))
            Class121.aBooleanArray2109[class45.anInt902] = true;
        if (i >= -112)
            doUpdateServer(null, false, true);
        anInt1916++;
    }

    public Class68 method1683(byte i) {
        anInt1906++;
        if (i > -95)
            anIntArray1921 = null;
        if ((anInt1920 ^ 0xffffffff) < -1
                && aClass68_1923 != aClass68Array1909[anInt1920 - 1]) {
            Class68 class68 = aClass68_1923;
            aClass68_1923 = class68.aClass68_1229;
            return class68;
        }
        while ((anInt1920 ^ 0xffffffff) > (anInt1907 ^ 0xffffffff)) {
            Class68 class68 = aClass68Array1909[anInt1920++].aClass68_1229;
            if (aClass68Array1909[-1 + anInt1920] != class68) {
                aClass68_1923 = class68.aClass68_1229;
                return class68;
            }
        }
        return null;
    }

    public void method1684(boolean bool) {
        anInt1908++;
        if (bool != false)
            anInt1912 = -36;
        for (int i = 0; (i ^ 0xffffffff) > (anInt1907 ^ 0xffffffff); i++) {
            Class68 class68 = aClass68Array1909[i];
            for (; ; ) {
                Class68 class68_4_ = class68.aClass68_1229;
                if (class68 == class68_4_)
                    break;
                class68_4_.method647(-17554);
            }
        }
        aClass68_1923 = null;
        aClass68_1901 = null;
    }

    public static void doUpdateServer(GameSocket updateSocket, boolean bool,
                                      boolean bool_5_) {
        if (Class68_Sub25.updateSocketCopy != null) {
            try {
                Class68_Sub25.updateSocketCopy.method594(-76);
            } catch (Exception exception) {
                /* empty */
            }
            Class68_Sub25.updateSocketCopy = null;
        }
        anInt1910++;
        Class68_Sub25.updateSocketCopy = updateSocket;
        Class50.method530(bool_5_, bool);
        Class123.aStream_2128 = null;
        Class74.aStream_1330.currentOffset = 0;
        Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811 = null;
        Class47.anInt942 = 0;
        for (; ; ) {
            Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) Class68_Sub20_Sub13.aClass113_4366
                    .method1679(-32642));
            if (class68_sub20_sub15 == null)
                break;
            Class123.aClass113_2123.method1677((byte) -116,
                    class68_sub20_sub15, class68_sub20_sub15.aLong1218);
            Class56.anInt1067++;
            Class68_Sub24.anInt3153--;
        }
        for (; ; ) {
            Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) PacketParser.aClass113_1874
                    .method1679(-32642));
            if (class68_sub20_sub15 == null)
                break;
            Class68_Sub7.aClass128_2854.method1786(class68_sub20_sub15,
                    (byte) 121);
            Stream.aClass113_3008.method1677((byte) -117, class68_sub20_sub15,
                    (class68_sub20_sub15.aLong1218));
            Class128.anInt2227++;
            Class22.anInt483--;
        }
        if (Unknown.aByte1615 != 0) {
            try {
                Stream class68_sub14 = new Stream(4);
                class68_sub14.writeByte(4);
                class68_sub14.writeByte(Unknown.aByte1615);
                class68_sub14.writeWord(0);
                Class68_Sub25.updateSocketCopy.queueBytes(4, class68_sub14.buffer);
            } catch (java.io.IOException ioexception) {
                try {
                    Class68_Sub25.updateSocketCopy.method594(-44);
                } catch (Exception exception) {
                    /* empty */
                }
                Class68_Sub25.updateSocketCopy = null;
                Class68_Sub10.anInt2909++;
            }
        }
        Class16.anInt271 = 0;
        ISAACRandomGen.aLong1495 = Class36.method438(17161);
    }

    public Class68 method1686(int i) {
        anInt1911++;
        if (aClass68_1901 == null)
            return null;
        Class68 class68 = aClass68Array1909[(int) (aLong1905 & (long) (-1 + anInt1907))];
        if (i < 66)
            aClass68_1923 = null;
        for (/**/; aClass68_1901 != class68; aClass68_1901 = aClass68_1901.aClass68_1229) {
            if (aClass68_1901.aLong1218 == aLong1905) {
                Class68 class68_6_ = aClass68_1901;
                aClass68_1901 = aClass68_1901.aClass68_1229;
                return class68_6_;
            }
        }
        aClass68_1901 = null;
        return null;
    }

    public Class113(int i) {
        aClass68Array1909 = new Class68[i];
        anInt1907 = i;
        for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i ^ 0xffffffff); i_7_++) {
            Class68 class68 = aClass68Array1909[i_7_] = new Class68();
            class68.aClass68_1227 = class68;
            class68.aClass68_1229 = class68;
        }
    }

    public static void method1687(int i) {
        aClass68_Sub1ArrayArrayArray1919 = null;
        if (i != 0)
            anInt1912 = 72;
        anIntArray1921 = null;
    }

    static {
        anInt1903 = -1;
    }
}
