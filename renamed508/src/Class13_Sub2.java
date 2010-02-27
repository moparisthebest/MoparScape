/* Class13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class13_Sub2 extends Class13
{
    static int[] anIntArray2643 = new int[256];
    private static MutableString aClass100_2644;
    static int[] anIntArray2645 = new int[128];
    static int anInt2646;
    static int localNPCCount = 0;
    private final int anInt2648;
    static MutableString aClass100_2649;
    static int anInt2650;
    static int anInt2651;
    private final int anInt2652;
    static int anInt2653;
    static int anInt2654;
    private final int anInt2655;
    static int anInt2656;
    static int anInt2657;
    private final int anInt2658;
    static Class31 aClass31_2659;
    static int anInt2660;

    Class13_Sub2(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_)
    {
        super(-1, i_3_, i_4_);
        anInt2652 = i_0_;
        anInt2648 = i_1_;
        anInt2655 = i;
        anInt2658 = i_2_;
    }

    static final void method255(byte i, Player class1_sub6_sub2)
    {
        try
        {
            if (i != -10)
                method256(null, -124, 33, 69);
            Class68_Sub18 class68_sub18 = (Class68_Sub18) (Class1_Sub5.aClass113_2511.method1684(((Player) class1_sub6_sub2).name.method1615(10908), 117));
            anInt2651++;
            if (class68_sub18 == null)
                Class52.method543(19395, (((Character) class1_sub6_sub2).walkQueueY[0]), null, null, 0, (((Character) class1_sub6_sub2).walkQueueX[0]), GameSocket.plane, class1_sub6_sub2);
            else
                class68_sub18.method993(31506);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ke.H(" + i + ',' + (class1_sub6_sub2 != null ? "{...}" : "null") + ')'));
        }
    }

    static final Class92_Sub1[] method256(Class21 class21, int i, int i_5_, int i_6_)
    {
        try
        {
            anInt2657++;
            if (i_6_ > -93)
                return null;
            if (!Class68_Sub13_Sub36.method880(-29381, i, class21, i_5_))
                return null;
            return RandomNumberGenerator.method1463(31);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ke.J(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ',' + i_6_ + ')'));
        }
    }

    final void method245(boolean bool, int i, int i_7_)
    {
        anInt2650++;
        int i_8_ = anInt2655 * i >> 12;
        if (bool != true)
            method243(-20, -94, 39);
        int i_9_ = i * anInt2648 >> 12;
        int i_10_ = i_7_ * anInt2658 >> 12;
        int i_11_ = anInt2652 * i_7_ >> 12;
        Class48.method514(i_8_, ((Class13) this).anInt220, i_11_, i_9_, (byte) -126, i_10_);
    }

    public static void method257(byte i)
    {
        anIntArray2645 = null;
        aClass31_2659 = null;
        if (i != 15)
            anIntArray2643 = null;
        aClass100_2649 = null;
        anIntArray2643 = null;
        aClass100_2644 = null;
    }

    static final int method258(Stream class68_sub14, int i, MutableString class100)
    {
        try
        {
            anInt2646++;
            int i_12_ = ((Stream) class68_sub14).position;
            class68_sub14.method956(((MutableString) class100).length, -1);
            ((Stream) class68_sub14).position += (Class68_Sub16.aClass103_3030.method1638(((MutableString) class100).length, ((Stream) class68_sub14).buffer, ((MutableString) class100).data, -2147483648, ((Stream) class68_sub14).position, i));
            return ((Stream) class68_sub14).position - i_12_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ke.I(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method244(int i, int i_13_, int i_14_)
    {
        anInt2656++;
        int i_15_ = -17 % ((i_13_ + 49) / 43);
    }

    final void method243(int i, int i_16_, int i_17_)
    {
        anInt2660++;
        if (i_16_ != 23700)
            anIntArray2645 = null;
    }

    static
    {
        aClass100_2644 = Class112.makeMutableString(43, "Hidden");
        anInt2654 = 0;
        aClass100_2649 = aClass100_2644;
    }
}
