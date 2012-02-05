/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class107 {
    public int anInt1811;
    public static int anInt1812;
    public static int anInt1813;
    public int anInt1814;
    public static int anInt1815 = 0;
    public static int anInt1816;
    public static byte[][] aByteArrayArray1817;
    public static RSString aRSString_1818
            = RSString.newRsString("blaugr-Un:");
    public static int anInt1819;
    public int anInt1820;
    public static int anInt1821;
    public int anInt1822;
    public static int anInt1823;

    public static void method1649(int i, long l) {
        try {
            anInt1819++;
            if (l != 0L) {
                Class21renamed.stream.createFrame(42);
                if (i != -256)
                    method1650(-102, 125, 108);
                Class21renamed.stream.writeQWord(true, l);
                Class97.anInt1715++;
            }
        } catch (RuntimeException runtimeexception) {
            throw method1652(runtimeexception, "sh.C(" + i + ',' + l + ')');
        }
    }

    public static long method1650(int i, int i_0_, int i_1_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_][i_1_];
        if (class68_sub1 == null || class68_sub1.aClass64_2757 == null)
            return 0L;
        return class68_sub1.aClass64_2757.aLong1185;
    }

    public static void method1651(int i) {
        int i_2_ = Class30.aClass16_541.method288((byte) 70);
        anInt1823++;
        if (i_2_ != 0) {
            Class21renamed.stream.createFrame(67);
            Class21renamed.stream.writeByte(0);
            int i_3_ = Class21renamed.stream.currentOffset;
            int i_4_ = 0;
            Class68_Sub6.anInt2841++;
            if (i != -14394)
                method1651(112);
            Class68_Sub10 class68_sub10
                    = (Class68_Sub10) Class30.aClass16_541.method294(-98);
            Class21renamed.stream.writeWord(
                    class68_sub10.anInt2902);
            int i_5_ = class68_sub10.anInt2902;
            while ((class68_sub10
                    = (Class68_Sub10) Class30.aClass16_541.method294(-104))
                    != null) {
                if ((i_4_ ^ 0xffffffff) > -256
                        && (i_5_ - -1 ^ 0xffffffff) == (class68_sub10.anInt2902
                        ^ 0xffffffff))
                    i_4_++;
                else {
                    Class21renamed.stream.writeByte(i_4_);
                    i_4_ = 0;
                    Class21renamed.stream
                            .writeWord(class68_sub10.anInt2902);
                }
                i_5_ = class68_sub10.anInt2902;
            }
            Class21renamed.stream.writeByte(i_4_);
            Class21renamed.stream.method935
                    (-i_3_ + Class21renamed.stream.currentOffset, 125);
        }
    }

    public static GameException method1652(Throwable throwable,
                                           String string) {
        anInt1812++;
        GameException runtimeexception_sub1;
        if (throwable instanceof GameException) {
            runtimeexception_sub1 = (GameException) throwable;
            runtimeexception_sub1.aString2239 += ' ' + (String) string;
        } else
            runtimeexception_sub1
                    = new GameException(throwable, string);
        return runtimeexception_sub1;
    }

    public static void method1653(int i) {
        aByteArrayArray1817 = null;
        aRSString_1818 = null;
        if (i <= 121)
            method1650(33, 61, 40);
    }

    public static void method1654(int i) {
        if (i != -13401)
            method1651(46);
        anInt1813++;
        int i_6_ = Class68_Sub7.method666(i ^ ~0x3459);
        if (i_6_ != 0) {
            if ((i_6_ ^ 0xffffffff) != -2) {
                Class121.method1742(105, (byte) (Class3.anInt84 + -4 & 0xff));
                Class68_Sub13_Sub30.method851(-56, 2);
            } else {
                Class121.method1742(i + 13498, (byte) 0);
                Class68_Sub13_Sub30.method851(-54, 512);
                Class8.method202(true);
            }
        } else {
            Class68_Sub20.aByteArrayArrayArray3095 = null;
            Class68_Sub13_Sub30.method851(-91, 0);
        }
    }

    public Class107() {
        /* empty */
    }

    public Class107(Class107 class107_7_) {
        anInt1822 = class107_7_.anInt1822;
        anInt1820 = class107_7_.anInt1820;
        anInt1814 = class107_7_.anInt1814;
        anInt1811 = class107_7_.anInt1811;
    }

    static {
        aByteArrayArray1817 = new byte[250][];
    }
}
