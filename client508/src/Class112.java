/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.zip.CRC32;

public class Class112 {
    public static int anInt1877;
    public boolean aBoolean1878 = false;
    public static int anInt1879;
    public static int anInt1880;
    public short[] aShortArray1881;
    public static int anInt1882;
    public static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array1883;
    public short[] aShortArray1884;
    public static int anInt1885;
    public static Class92_Sub1[] aClass92_Sub1Array1886;
    public static CRC32 aCRC32_1887;
    public static int anInt1888;
    public int[] anIntArray1889;
    public static int anInt1890;
    public static int anInt1891 = 0;
    public int[] anIntArray1892 = {-1, -1, -1, -1, -1};
    public static int anInt1893;
    public short[] aShortArray1894;
    public int anInt1895 = -1;
    public static int anInt1896;
    public short[] aShortArray1897;
    public static PacketStream extraStream;
    public static int anInt1899;
    public static int anInt1900;

    public Class1_Sub4 method1669(boolean bool) {
        anInt1888++;
        if (anIntArray1889 == null)
            return null;
        Class1_Sub4[] class1_sub4s = new Class1_Sub4[anIntArray1889.length];
        for (int i = 0; anIntArray1889.length > i; i++)
            class1_sub4s[i]
                    = Class1_Sub4.method115(Class68_Sub15.aClass21_3020,
                    anIntArray1889[i], 0);
        if (bool != false)
            extraStream = null;
        Class1_Sub4 class1_sub4;
        if ((class1_sub4s.length ^ 0xffffffff) == -2)
            class1_sub4 = class1_sub4s[0];
        else
            class1_sub4 = new Class1_Sub4(class1_sub4s, class1_sub4s.length);
        if (aShortArray1897 != null) {
            for (int i = 0;
                 (aShortArray1897.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
                class1_sub4.method129(aShortArray1897[i], aShortArray1894[i]);
        }
        if (aShortArray1881 != null) {
            for (int i = 0; i < aShortArray1881.length; i++)
                class1_sub4.method110(aShortArray1881[i], aShortArray1884[i]);
        }
        return class1_sub4;
    }

    public static void method1670(int i) {
        if (i != 133988164)
            method1671(-118, 57, 114);
        aClass92_Sub1Array1886 = null;
        aCRC32_1887 = null;
        extraStream = null;
        aClass68_Sub20_Sub10Array1883 = null;
    }

    public static int method1671(int i, int i_4_, int i_5_) {
        int i_6_ = i_5_ - -(57 * i_4_);
        if (i != 133988164)
            aClass68_Sub20_Sub10Array1883 = null;
        anInt1882++;
        i_6_ ^= i_6_ << 1931164621;
        int i_7_
                = 0x7fffffff & i_6_ * (15731 * i_6_ * i_6_ - -789221) + 1376312589;
        return (i_7_ & 0x7fc7f44) >> 1504697395;
    }

    public Class1_Sub4 method1672(int i) {
        anInt1890++;
        Class1_Sub4[] class1_sub4s = new Class1_Sub4[5];
        int i_8_ = 0;
        for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -6; i_9_++) {
            if (anIntArray1892[i_9_] != -1)
                class1_sub4s[i_8_++]
                        = Class1_Sub4.method115(Class68_Sub15.aClass21_3020,
                        anIntArray1892[i_9_], 0);
        }
        if (i >= -36)
            method1672(50);
        Class1_Sub4 class1_sub4 = new Class1_Sub4(class1_sub4s, i_8_);
        if (aShortArray1897 != null) {
            for (int i_10_ = 0; aShortArray1897.length > i_10_; i_10_++)
                class1_sub4.method129(aShortArray1897[i_10_],
                        aShortArray1894[i_10_]);
        }
        if (aShortArray1881 != null) {
            for (int i_11_ = 0;
                 (i_11_ ^ 0xffffffff) > (aShortArray1881.length ^ 0xffffffff);
                 i_11_++)
                class1_sub4.method110(aShortArray1881[i_11_],
                        aShortArray1884[i_11_]);
        }
        return class1_sub4;
    }

    public boolean method1673(int i) {
        boolean bool = true;
        if (i != -23720)
            return true;
        for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -6; i_12_++) {
            if ((anIntArray1892[i_12_] ^ 0xffffffff) != 0
                    && !Class68_Sub15.aClass21_3020
                    .method344(anIntArray1892[i_12_], 0, (byte) -128))
                bool = false;
        }
        anInt1880++;
        return bool;
    }

    public boolean method1674(byte i) {
        anInt1893++;
        if (anIntArray1889 == null)
            return true;
        boolean bool = true;
        if (i >= -114)
            anInt1879 = 21;
        for (int i_13_ = 0; anIntArray1889.length > i_13_; i_13_++) {
            if (!Class68_Sub15.aClass21_3020.method344(anIntArray1889[i_13_],
                    0, (byte) -117))
                bool = false;
        }
        return bool;
    }

    public void method1675(Stream class68_sub14, int i, int i_14_) {
        anInt1899++;
        if ((i ^ 0xffffffff) == -2)
            anInt1895 = class68_sub14.readUnsignedByte(-6677);
        else if (i == 2) {
            int i_15_ = class68_sub14.readUnsignedByte(-6677);
            anIntArray1889 = new int[i_15_];
            for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff);
                 i_16_++)
                anIntArray1889[i_16_] = class68_sub14.readUnsignedWord(1355769544);
        } else if ((i ^ 0xffffffff) == -4)
            aBoolean1878 = true;
        else if ((i ^ 0xffffffff) != -41) {
            if ((i ^ 0xffffffff) != -42) {
                if ((i ^ 0xffffffff) <= -61 && (i ^ 0xffffffff) > -71)
                    anIntArray1892[i + -60]
                            = (class68_sub14.readUnsignedWord
                            (Class15.method278(i_14_, -1355769576)));
            } else {
                int i_17_ = class68_sub14.readUnsignedByte(i_14_ ^ 0x1a3b);
                aShortArray1881 = new short[i_17_];
                aShortArray1884 = new short[i_17_];
                for (int i_18_ = 0; i_17_ > i_18_; i_18_++) {
                    aShortArray1881[i_18_]
                            = (short) class68_sub14.readUnsignedWord(1355769544);
                    aShortArray1884[i_18_]
                            = (short) class68_sub14.readUnsignedWord(i_14_ + 1355769592);
                }
            }
        } else {
            int i_19_ = class68_sub14.readUnsignedByte(i_14_ ^ 0x1a3b);
            aShortArray1894 = new short[i_19_];
            aShortArray1897 = new short[i_19_];
            for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
                aShortArray1897[i_20_]
                        = (short) class68_sub14.readUnsignedWord(i_14_ + 1355769592);
                aShortArray1894[i_20_]
                        = (short) class68_sub14.readUnsignedWord(1355769544);
            }
        }
        if (i_14_ != -48)
            anInt1891 = -103;
    }

    public void method1676(boolean bool, Stream class68_sub14) {
        for (; ; ) {
            int i = class68_sub14.readUnsignedByte(-6677);
            if (i == 0)
                break;
            method1675(class68_sub14, i, -48);
        }
        anInt1896++;
        if (bool != true)
            method1674((byte) 87);
    }

    static {
        aCRC32_1887 = new CRC32();
        extraStream = new PacketStream(5000);
    }
}
