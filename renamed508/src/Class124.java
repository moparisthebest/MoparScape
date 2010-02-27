/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class Class124
{
    static int[][] anIntArrayArray2133;
    static int anInt2134;
    static int anInt2135;
    static int anInt2136;
    static int anInt2137;
    static MutableString aClass100_2138;
    static int anInt2139;
    static int anInt2140;
    static int anInt2141;
    private long aLong2142;
    static MutableString aClass100_2143 = Class112.makeMutableString(43, "sl_flags");
    private int anInt2144 = 0;
    static MutableString aClass100_2145;
    static int anInt2146;
    private long aLong2147;
    private static MutableString aClass100_2148;
    private long aLong2149 = -1L;
    static MutableString aClass100_2150;
    private static MutableString aClass100_2151 = Class112.makeMutableString(43, "Please wait)3)3)3");
    private byte[] aByteArray2152;
    static int anInt2153;
    private long aLong2154;
    private long aLong2155 = -1L;
    static MutableString aClass100_2156;
    static int anInt2157;
    private byte[] aByteArray2158;
    static int anInt2159;
    static int anInt2160;
    static boolean aBoolean2161;
    private FileOnDisk aClass2_2162;
    private long aLong2163;
    private int anInt2164;
    static MutableString aClass100_2165;
    static int anInt2166;

    static final Sprite method1757(byte i)
    {
        anInt2146++;
        int i_0_ = (Class68_Sub13_Sub19.anIntArray3759[0] * Class68_Sub13_Sub12.anIntArray3641[0]);
        int[] is = new int[i_0_];
        byte[] is_1_ = Object5.aByteArrayArray1240[0];
        int i_2_ = 0;
        if (i != -83)
            return null;
        for (/**/; i_2_ < i_0_; i_2_++)
            is[i_2_] = (Class68_Sub13_Sub17.anIntArray3721[Class120.method1746(255, is_1_[i_2_])]);
        Sprite class68_sub20_sub10_sub1 = (new Sprite(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[0], ObjectDefinition.anIntArray1998[0], Class68_Sub13_Sub12.anIntArray3641[0], Class68_Sub13_Sub19.anIntArray3759[0], is));
        Class87.method1493((byte) -93);
        return class68_sub20_sub10_sub1;
    }

    static final void method1758(Class21 class21, Class21 class21_3_, Class21 class21_4_, boolean bool, Class21 class21_5_)
    {
        try
        {
            Class1_Sub7.aClass21_2620 = class21;
            Class8.aClass21_164 = class21_5_;
            client.aClass21_2382 = class21_4_;
            if (bool == true)
            {
                anInt2160++;
                Class68_Sub10.aClass21_2909 = class21_3_;
                Class68_Sub13_Sub36.widgetCache = new Widget[client.aClass21_2382.method337(0)][];
                GameSocket.validWidgets = new boolean[client.aClass21_2382.method337(0)];
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wa.J(" + (class21 != null ? "{...}" : "null") + ',' + (class21_3_ != null ? "{...}" : "null") + ',' + (class21_4_ != null ? "{...}" : "null") + ',' + bool + ',' + (class21_5_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1759(int i, byte[] is) throws IOException
    {
        do
        {
            try
            {
                anInt2139++;
                method1767(0, is.length, 0, is);
                if (i <= -33)
                    break;
                method1758(null, null, null, true, null);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("wa.D(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final long method1760(byte i)
    {
        anInt2157++;
        if (i <= 48)
            aLong2142 = 100L;
        return aLong2142;
    }

    final void method1761(int i, int i_6_, int i_7_, byte[] is) throws IOException
    {
        try
        {
            anInt2153++;
            try
            {
                if (i_6_ == 0)
                {
                    if (aLong2142 < aLong2147 + (long) i)
                        aLong2142 = aLong2147 + (long) i;
                    if (aLong2155 != -1L && (aLong2147 < aLong2155 || aLong2155 + (long) anInt2144 < aLong2147))
                        method1764(i_6_ + 86);
                    if (aLong2155 != -1L && ((long) aByteArray2152.length + aLong2155 < aLong2147 + (long) i))
                    {
                        int i_8_ = (int) ((long) aByteArray2152.length - aLong2147 + aLong2155);
                        i -= i_8_;
                        Class39.arraycopy(is, i_7_, aByteArray2152, (int) (aLong2147 - aLong2155), i_8_);
                        aLong2147 += (long) i_8_;
                        anInt2144 = aByteArray2152.length;
                        method1764(40);
                        i_7_ += i_8_;
                    }
                    if (i > aByteArray2152.length)
                    {
                        long l = -1L;
                        long l_9_ = -1L;
                        if (aLong2147 != aLong2154)
                        {
                            aClass2_2162.seekTo(aLong2147);
                            aLong2154 = aLong2147;
                        }
                        aClass2_2162.write(i_7_, is, i);
                        if (aLong2147 + (long) i > aLong2149 && (aLong2147 + (long) i <= aLong2149 + (long) anInt2164))
                            l = (long) i + aLong2147;
                        else if (aLong2149 + (long) anInt2164 > aLong2147 && ((long) i + aLong2147 >= (long) anInt2164 + aLong2149))
                            l = (long) anInt2164 + aLong2149;
                        aLong2154 += (long) i;
                        if (aLong2147 < aLong2149 || aLong2147 >= aLong2149 + (long) anInt2164)
                        {
                            if (aLong2147 <= aLong2149 && aLong2149 < aLong2147 + (long) i)
                                l_9_ = aLong2149;
                        } else
                            l_9_ = aLong2147;
                        if (aLong2154 > aLong2163)
                            aLong2163 = aLong2154;
                        if (l_9_ > -1L && l > l_9_)
                        {
                            int i_10_ = (int) (l - l_9_);
                            Class39.arraycopy(is, (int) (l_9_ + (long) i_7_ - aLong2147), aByteArray2158, (int) (-aLong2149 + l_9_), i_10_);
                        }
                        aLong2147 += (long) i;
                    } else if (i > 0)
                    {
                        if (aLong2155 == -1L)
                            aLong2155 = aLong2147;
                        Class39.arraycopy(is, i_7_, aByteArray2152, (int) (aLong2147 - aLong2155), i);
                        aLong2147 += (long) i;
                        if (-aLong2155 + aLong2147 > (long) anInt2144)
                            anInt2144 = (int) (-aLong2155 + aLong2147);
                    }
                }
            } catch (IOException ioexception)
            {
                aLong2154 = -1L;
                throw ioexception;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wa.A(" + i + ',' + i_6_ + ',' + i_7_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1762(boolean bool)
    {
        aClass100_2145 = null;
        aClass100_2150 = null;
        if (bool != true)
            aClass100_2145 = null;
        aClass100_2156 = null;
        aClass100_2148 = null;
        anIntArrayArray2133 = null;
        aClass100_2151 = null;
        aClass100_2138 = null;
        aClass100_2165 = null;
        aClass100_2143 = null;
    }

    private final File method1763(boolean bool)
    {
        anInt2137++;
        if (bool != true)
            aLong2155 = 14L;
        return aClass2_2162.getFile();
    }

    private final void method1764(int i) throws IOException
    {
        anInt2134++;
        int i_11_ = -72 % ((i + 42) / 59);
        if (aLong2155 != -1L)
        {
            if (aLong2155 != aLong2154)
            {
                aClass2_2162.seekTo(aLong2155);
                aLong2154 = aLong2155;
            }
            long l = -1L;
            aClass2_2162.write(0, aByteArray2152, anInt2144);
            aLong2154 += (long) anInt2144;
            if (aLong2149 <= aLong2155 && aLong2155 < (long) anInt2164 + aLong2149)
                l = aLong2155;
            else if (aLong2155 <= aLong2149 && aLong2155 + (long) anInt2144 > aLong2149)
                l = aLong2149;
            long l_12_ = -1L;
            if ((long) anInt2144 + aLong2155 > aLong2149 && (aLong2155 + (long) anInt2144 <= (long) anInt2164 + aLong2149))
                l_12_ = aLong2155 + (long) anInt2144;
            else if ((long) anInt2164 + aLong2149 > aLong2155 && (aLong2149 + (long) anInt2164 <= (long) anInt2144 + aLong2155))
                l_12_ = (long) anInt2164 + aLong2149;
            if (aLong2154 > aLong2163)
                aLong2163 = aLong2154;
            if (l > -1L && l < l_12_)
            {
                int i_13_ = (int) (-l + l_12_);
                Class39.arraycopy(aByteArray2152, (int) (l - aLong2155), aByteArray2158, (int) (l - aLong2149), i_13_);
            }
            aLong2155 = -1L;
            anInt2144 = 0;
        }
    }

    final void method1765(int i) throws IOException
    {
        method1764(-121);
        if (i == -9715)
        {
            anInt2159++;
            aClass2_2162.close();
        }
    }

    final void method1766(long l, int i) throws IOException
    {
        anInt2136++;
        if (l < 0L)
            throw new IOException("Invalid seek to " + l + " in file " + method1763(true));
        aLong2147 = l;
        if (i != 1)
            aLong2142 = -83L;
    }

    final void method1767(int i, int i_14_, int i_15_, byte[] is) throws IOException
    {
        try
        {
            anInt2135++;
            try
            {
                if (i_14_ + i > is.length)
                    throw new ArrayIndexOutOfBoundsException(i_14_ + i - is.length);
                if (aLong2155 != -1L && aLong2147 >= aLong2155 && (aLong2147 + (long) i_14_ <= aLong2155 + (long) anInt2144))
                {
                    Class39.arraycopy(aByteArray2152, (int) (-aLong2155 + aLong2147), is, i, i_14_);
                    aLong2147 += (long) i_14_;
                    return;
                }
                long l = aLong2147;
                int i_16_ = i_14_;
                int i_17_ = i;
                if (aLong2147 >= aLong2149 && aLong2147 < (long) anInt2164 + aLong2149)
                {
                    int i_18_ = (int) ((long) anInt2164 - (aLong2147 - aLong2149));
                    if (i_14_ < i_18_)
                        i_18_ = i_14_;
                    i_14_ -= i_18_;
                    Class39.arraycopy(aByteArray2158, (int) (-aLong2149 + aLong2147), is, i, i_18_);
                    aLong2147 += (long) i_18_;
                    i += i_18_;
                }
                if (aByteArray2158.length < i_14_)
                {
                    aClass2_2162.seekTo(aLong2147);
                    aLong2154 = aLong2147;
                    while (i_14_ > 0)
                    {
                        int i_19_ = aClass2_2162.read(i_14_, i, is);
                        if (i_19_ == -1)
                            break;
                        i += i_19_;
                        i_14_ -= i_19_;
                        aLong2147 += (long) i_19_;
                        aLong2154 += (long) i_19_;
                    }
                } else if (i_14_ > 0)
                {
                    method1768(false);
                    int i_20_ = i_14_;
                    if (i_20_ > anInt2164)
                        i_20_ = anInt2164;
                    Class39.arraycopy(aByteArray2158, 0, is, i, i_20_);
                    aLong2147 += (long) i_20_;
                    i_14_ -= i_20_;
                    i += i_20_;
                }
                if (aLong2155 != -1L)
                {
                    if (aLong2155 > aLong2147 && i_14_ > 0)
                    {
                        int i_21_ = i + (int) (-aLong2147 + aLong2155);
                        if (i_21_ > i + i_14_)
                            i_21_ = i + i_14_;
                        while (i < i_21_)
                        {
                            is[i++] = (byte) 0;
                            aLong2147++;
                            i_14_--;
                        }
                    }
                    long l_22_ = -1L;
                    if (aLong2155 >= l && l + (long) i_16_ > aLong2155)
                        l_22_ = aLong2155;
                    else if (aLong2155 <= l && l < (long) anInt2144 + aLong2155)
                        l_22_ = l;
                    long l_23_ = -1L;
                    if (l < (long) anInt2144 + aLong2155 && aLong2155 + (long) anInt2144 <= (long) i_16_ + l)
                        l_23_ = (long) anInt2144 + aLong2155;
                    else if ((long) i_16_ + l > aLong2155 && (aLong2155 + (long) anInt2144 >= (long) i_16_ + l))
                        l_23_ = (long) i_16_ + l;
                    if (l_22_ > -1L && l_22_ < l_23_)
                    {
                        int i_24_ = (int) (-l_22_ + l_23_);
                        Class39.arraycopy(aByteArray2152, (int) (l_22_ - aLong2155), is, i_17_ + (int) (-l + l_22_), i_24_);
                        if (l_23_ > aLong2147)
                        {
                            i_14_ -= l_23_ - aLong2147;
                            aLong2147 = l_23_;
                        }
                    }
                }
            } catch (IOException ioexception)
            {
                aLong2154 = -1L;
                throw ioexception;
            }
            if (i_15_ < i_14_)
                throw new EOFException();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wa.I(" + i + ',' + i_14_ + ',' + i_15_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    private final void method1768(boolean bool) throws IOException
    {
        anInt2140++;
        if (bool == false)
        {
            anInt2164 = 0;
            if (aLong2147 != aLong2154)
            {
                aClass2_2162.seekTo(aLong2147);
                aLong2154 = aLong2147;
            }
            aLong2149 = aLong2147;
            int i;
            for (/**/; anInt2164 < aByteArray2158.length; anInt2164 += i)
            {
                int i_25_ = aByteArray2158.length - anInt2164;
                if (i_25_ > 200000000)
                    i_25_ = 200000000;
                i = aClass2_2162.read(i_25_, anInt2164, aByteArray2158);
                if (i == -1)
                    break;
                aLong2154 += (long) i;
            }
        }
    }

    Class124(FileOnDisk class2, int i, int i_26_) throws IOException
    {
        try
        {
            aClass2_2162 = class2;
            aLong2142 = aLong2163 = class2.getLength();
            aByteArray2158 = new byte[i];
            aByteArray2152 = new byte[i_26_];
            aLong2147 = 0L;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wa.<init>(" + (class2 != null ? "{...}" : "null") + ',' + i + ',' + i_26_ + ')'));
        }
    }

    static
    {
        anIntArrayArray2133 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
        aClass100_2148 = Class112.makeMutableString(43, "glow2:");
        aClass100_2145 = aClass100_2148;
        aClass100_2156 = Class112.makeMutableString(43, "(U0a )2 in: ");
        aBoolean2161 = false;
        aClass100_2150 = Class112.makeMutableString(43, "gelb:");
        aClass100_2138 = aClass100_2151;
        aClass100_2165 = aClass100_2148;
        anInt2166 = 0;
    }
}
