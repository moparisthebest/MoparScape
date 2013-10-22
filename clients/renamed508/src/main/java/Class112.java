/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

final class Class112
{
    static int anInt1879;
    boolean aBoolean1880 = false;
    static int anInt1881;
    static int anInt1882;
    private short[] aShortArray1883;
    static int anInt1884;
    static Class68_Sub20_Sub10[] minimapDots;
    private short[] aShortArray1886;
    static int anInt1887;
    static Class92_Sub1[] aClass92_Sub1Array1888;
    static CRC32 aCRC32_1889;
    static int anInt1890;
    private int[] anIntArray1891;
    static int anInt1892;
    static int anInt1893 = 0;
    private int[] anIntArray1894 = { -1, -1, -1, -1, -1 };
    static int anInt1895;
    private short[] aShortArray1896;
    int anInt1897 = -1;
    static int anInt1898;
    private short[] aShortArray1899;
    static CipheredByteVector aClass68_Sub14_Sub1_1900;
    static int anInt1901;
    static int anInt1902;

    static final MutableString makeMutableString(int i, String string)
    {
        try
        {
            byte[] is = string.getBytes();
            anInt1887++;
            int i_0_ = is.length;
            MutableString class100 = new MutableString();
            if (i != 43)
                return null;
            ((MutableString) class100).data = new byte[i_0_];
            int i_1_ = 0;
            while (i_0_ > i_1_)
            {
                int i_2_ = is[i_1_++] & 0xff;
                if (i_2_ > 45 || i_2_ < 40)
                {
                    if (i_2_ != 0)
                        ((MutableString) class100).data[((MutableString) class100).length++] = (byte) i_2_;
                } else
                {
                    if (i_1_ >= i_0_)
                        break;
                    int i_3_ = 0xff & is[i_1_++];
                    ((MutableString) class100).data[((MutableString) class100).length++] = (byte) (i_3_ + ((i_2_ - 40) * 43 - 48));
                }
            }
            class100.trim();
            return class100.method1628(i + 4053);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("tc.B(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    final Class1_Sub4 method1675(boolean bool)
    {
        anInt1890++;
        if (anIntArray1891 == null)
            return null;
        Class1_Sub4[] class1_sub4s = new Class1_Sub4[anIntArray1891.length];
        for (int i = 0; anIntArray1891.length > i; i++)
            class1_sub4s[i] = Class1_Sub4.method115(Class68_Sub15.aClass21_3022, anIntArray1891[i], 0);
        if (bool != false)
            aClass68_Sub14_Sub1_1900 = null;
        Class1_Sub4 class1_sub4;
        if (class1_sub4s.length == 1)
            class1_sub4 = class1_sub4s[0];
        else
            class1_sub4 = new Class1_Sub4(class1_sub4s, class1_sub4s.length);
        if (aShortArray1899 != null)
        {
            for (int i = 0; aShortArray1899.length > i; i++)
                class1_sub4.method129(aShortArray1899[i], aShortArray1896[i]);
        }
        if (aShortArray1883 != null)
        {
            for (int i = 0; i < aShortArray1883.length; i++)
                class1_sub4.method110(aShortArray1883[i], aShortArray1886[i]);
        }
        return class1_sub4;
    }

    public static void method1676(int i)
    {
        if (i != 133988164)
            method1677(-118, 57, 114);
        aClass92_Sub1Array1888 = null;
        aCRC32_1889 = null;
        aClass68_Sub14_Sub1_1900 = null;
        minimapDots = null;
    }

    static final int method1677(int i, int i_4_, int i_5_)
    {
        int i_6_ = i_5_ + 57 * i_4_;
        if (i != 133988164)
            minimapDots = null;
        anInt1884++;
        i_6_ ^= i_6_ << 13;
        int i_7_ = 0x7fffffff & i_6_ * (15731 * i_6_ * i_6_ + 789221) + 1376312589;
        return (i_7_ & 0x7fc7f44) >> 19;
    }

    final Class1_Sub4 method1678(int i)
    {
        anInt1892++;
        Class1_Sub4[] class1_sub4s = new Class1_Sub4[5];
        int i_8_ = 0;
        for (int i_9_ = 0; i_9_ < 5; i_9_++)
        {
            if (anIntArray1894[i_9_] != -1)
                class1_sub4s[i_8_++] = Class1_Sub4.method115(Class68_Sub15.aClass21_3022, anIntArray1894[i_9_], 0);
        }
        if (i >= -36)
            method1678(50);
        Class1_Sub4 class1_sub4 = new Class1_Sub4(class1_sub4s, i_8_);
        if (aShortArray1899 != null)
        {
            for (int i_10_ = 0; aShortArray1899.length > i_10_; i_10_++)
                class1_sub4.method129(aShortArray1899[i_10_], aShortArray1896[i_10_]);
        }
        if (aShortArray1883 != null)
        {
            for (int i_11_ = 0; i_11_ < aShortArray1883.length; i_11_++)
                class1_sub4.method110(aShortArray1883[i_11_], aShortArray1886[i_11_]);
        }
        return class1_sub4;
    }

    final boolean method1679(int i)
    {
        boolean bool = true;
        if (i != -23720)
            return true;
        for (int i_12_ = 0; i_12_ < 5; i_12_++)
        {
            if (anIntArray1894[i_12_] != -1 && !Class68_Sub15.aClass21_3022.method344(anIntArray1894[i_12_], 0, (byte) -128))
                bool = false;
        }
        anInt1882++;
        return bool;
    }

    final boolean method1680(byte i)
    {
        anInt1895++;
        if (anIntArray1891 == null)
            return true;
        boolean bool = true;
        if (i >= -114)
            anInt1881 = 21;
        for (int i_13_ = 0; anIntArray1891.length > i_13_; i_13_++)
        {
            if (!Class68_Sub15.aClass21_3022.method344(anIntArray1891[i_13_], 0, (byte) -117))
                bool = false;
        }
        return bool;
    }

    public Class112()
    {
        /* empty */
    }

    private final void method1681(Stream class68_sub14, int i, int i_14_)
    {
        do
        {
            try
            {
                anInt1901++;
                if (i == 1)
                    ((Class112) this).anInt1897 = class68_sub14.readUByte();
                else if (i == 2)
                {
                    int i_15_ = class68_sub14.readUByte();
                    anIntArray1891 = new int[i_15_];
                    for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
                        anIntArray1891[i_16_] = class68_sub14.readUShort();
                } else if (i == 3)
                    ((Class112) this).aBoolean1880 = true;
                else if (i != 40)
                {
                    if (i != 41)
                    {
                        if (i >= 60 && i < 70)
                            anIntArray1894[i - 60] = (class68_sub14.readUShort());
                    } else
                    {
                        int i_17_ = class68_sub14.readUByte();
                        aShortArray1883 = new short[i_17_];
                        aShortArray1886 = new short[i_17_];
                        for (int i_18_ = 0; i_17_ > i_18_; i_18_++)
                        {
                            aShortArray1883[i_18_] = (short) class68_sub14.readUShort();
                            aShortArray1886[i_18_] = (short) class68_sub14.readUShort();
                        }
                    }
                } else
                {
                    int i_19_ = class68_sub14.readUByte();
                    aShortArray1896 = new short[i_19_];
                    aShortArray1899 = new short[i_19_];
                    for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
                    {
                        aShortArray1899[i_20_] = (short) class68_sub14.readUShort();
                        aShortArray1896[i_20_] = (short) class68_sub14.readUShort();
                    }
                }
                if (i_14_ == -48)
                    break;
                anInt1893 = -103;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("tc.A(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ')'));
            }
            break;
        } while (false);
    }

    final void method1682(boolean bool, Stream class68_sub14)
    {
        do
        {
            try
            {
                for (;;)
                {
                    int i = class68_sub14.readUByte();
                    if (i == 0)
                        break;
                    method1681(class68_sub14, i, -48);
                }
                anInt1898++;
                if (bool == true)
                    break;
                method1680((byte) 87);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("tc.D(" + bool + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static
    {
        aCRC32_1889 = new CRC32();
        aClass68_Sub14_Sub1_1900 = new CipheredByteVector(5000);
    }
}
