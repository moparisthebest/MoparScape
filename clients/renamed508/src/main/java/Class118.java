/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.FontMetrics;

final class Class118
{
    static int anInt2075;
    static FontMetrics aFontMetrics2076;
    static int anInt2077;
    static long[] aLongArray2078 = new long[256];
    static int[] anIntArray2079;
    static boolean[] aBooleanArray2080 = new boolean[8];
    static int anInt2081;
    static MutableString aClass100_2082;
    static MutableString aClass100_2083;
    private static MutableString aClass100_2084;
    static MutableString aClass100_2085;
    private static MutableString aClass100_2086;

    static final void method1736(boolean bool)
    {
        anInt2077++;
        if (Object2.aClass52_1354 != null)
        {
            if (bool != true)
                method1736(false);
            do
            {
                try
                {
                    byte[] is = Object2.aClass52_1354.method541((byte) 78);
                    if (is == null)
                        break;
                    Stream class68_sub14 = new Stream(is);
                    Class68_Sub13_Sub19.anInt3761 = class68_sub14.readUShort();
                    Character.aClass93Array2531 = new Class93[Class68_Sub13_Sub19.anInt3761];
                    for (int i = 0; Class68_Sub13_Sub19.anInt3761 > i; i++)
                    {
                        Class93 class93 = Character.aClass93Array2531[i] = new Class93();
                        int i_0_ = class68_sub14.readUShort();
                        ((Class93) class93).aBoolean1663 = (i_0_ & 0x8000) != 0;
                        ((Class93) class93).anInt1666 = 0x7fff & i_0_;
                        ((Class93) class93).aClass100_1672 = class68_sub14.readString();
                        ((Class93) class93).anInt1667 = class68_sub14.readShort();
                        ((Class93) class93).anInt1665 = i;
                        int i_1_ = class68_sub14.readUShort();
                        ((Class93) class93).anInt1668 = Object2.method1404(3, i_1_);
                    }
                    Class28.method392(Character.aClass93Array2531.length - 1, -228, Character.aClass93Array2531, 0);
                    Object2.aClass52_1354 = null;
                } catch (Exception exception)
                {
                    exception.printStackTrace();
                    Object2.aClass52_1354 = null;
                }
                break;
            } while (false);
        }
    }

    static final Class68_Sub20_Sub8 method1737(int i, byte i_2_)
    {
        Class68_Sub20_Sub8 class68_sub20_sub8 = ((Class68_Sub20_Sub8) Class1_Sub1.aClass82_2397.method1479((long) i, (byte) -76));
        anInt2075++;
        if (class68_sub20_sub8 != null)
            return class68_sub20_sub8;
        byte[] is;
        if (i < 32768)
            is = Class13_Sub3.aClass21_2673.method338(i, 0, 1);
        else
            is = Class92.aClass21_1654.method338(0x7fff & i, 0, 1);
        class68_sub20_sub8 = new Class68_Sub20_Sub8();
        if (is != null)
            class68_sub20_sub8.method1084((byte) 45, new Stream(is));
        if (i >= 32768)
            class68_sub20_sub8.method1090((byte) 38);
        Class1_Sub1.aClass82_2397.method1471((long) i, (byte) 90, class68_sub20_sub8);
        if (i_2_ < 75)
            method1738(-8);
        return class68_sub20_sub8;
    }

    public static void method1738(int i)
    {
        aClass100_2085 = null;
        aFontMetrics2076 = null;
        aBooleanArray2080 = null;
        aClass100_2086 = null;
        anIntArray2079 = null;
        aClass100_2083 = null;
        if (i != 32767)
            method1737(-9, (byte) -12);
        aLongArray2078 = null;
        aClass100_2082 = null;
        aClass100_2084 = null;
    }

    static
    {
        for (int i = 0; i < 256; i++)
        {
            long l = (long) i;
            for (int i_3_ = 0; i_3_ < 8; i_3_++)
            {
                if ((l & 0x1L) != 1L)
                    l >>>= 1;
                else
                    l = ~0x3693a86a2878f0bdL ^ l >>> 1;
            }
            aLongArray2078[i] = l;
        }
        aClass100_2083 = Class112.makeMutableString(43, "<br>");
        aClass100_2084 = Class112.makeMutableString(43, "Members only world");
        aClass100_2085 = aClass100_2084;
        aClass100_2086 = Class112.makeMutableString(43, "skill)2");
        aClass100_2082 = aClass100_2086;
    }
}
