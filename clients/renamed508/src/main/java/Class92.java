/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class92
{
    static Class21_Sub1 aClass21_Sub1_1646;
    int anInt1647;
    static int anInt1648;
    int anInt1649;
    static int clientVersion;
    static boolean aBoolean1651 = false;
    static short[][] aShortArrayArray1652;
    static int anInt1653;
    static Class21 aClass21_1654;
    static int anInt1655;
    static int anInt1656;
    int anInt1657;
    static MutableString aClass100_1658 = Class112.makeMutableString(43, ")3runescape)3com)4l=");
    int anInt1659;
    int anInt1660;
    int anInt1661;

    static final int method1532(int i, byte i_0_)
    {
        int i_1_ = -12 / ((-52 - i_0_) / 55);
        int i_2_ = 0;
        if (i < 0 || i >= 65536)
        {
            i_2_ += 16;
            i >>>= 16;
        }
        if (i >= 256)
        {
            i_2_ += 8;
            i >>>= 8;
        }
        if (i >= 16)
        {
            i_2_ += 4;
            i >>>= 4;
        }
        if (i >= 4)
        {
            i >>>= 2;
            i_2_ += 2;
        }
        anInt1656++;
        if (i >= 1)
        {
            i >>>= 1;
            i_2_++;
        }
        return i_2_ + i;
    }

    abstract void method1533(int i, int i_3_);

    abstract void method1534(int i, int i_4_, int i_5_);

    static final void method1535(int i)
    {
        anInt1653++;
        Class68_Sub13_Sub4.method716();
        if (i == 297)
        {
            for (int i_6_ = 0; i_6_ < 4; i_6_++)
                Class109.groundDataArray[i_6_].method444(false);
            System.gc();
        }
    }

    public static void method1536(int i)
    {
        aClass100_1658 = null;
        if (i != -1)
            aClass100_1658 = null;
        aShortArrayArray1652 = null;
        aClass21_1654 = null;
        aClass21_Sub1_1646 = null;
    }

    static final void method1537(int i, long l)
    {
        anInt1655++;
        if (l != 0L)
        {
            if (i >= -125)
                aClass21_1654 = null;
            for (int i_7_ = 0; Class68_Sub13_Sub26.anInt3882 > i_7_; i_7_++)
            {
                if (l == Class21_Sub1.aLongArray2705[i_7_])
                {
                    Class68_Sub13_Sub14.anInt3676++;
                    Class68_Sub13_Sub26.anInt3882--;
                    for (int i_8_ = i_7_; i_8_ < Class68_Sub13_Sub26.anInt3882; i_8_++)
                    {
                        Class21_Sub1.aLongArray2705[i_8_] = Class21_Sub1.aLongArray2705[i_8_ + 1];
                        Class68_Sub4.aClass100Array2829[i_8_] = Class68_Sub4.aClass100Array2829[i_8_ + 1];
                    }
                    Keyboard.anInt2132 = Class68_Sub22.anInt3150;
                    Class21.connectionVector.startPacket(2);
                    Class21.connectionVector.writeLong(l);
                    break;
                }
            }
        }
    }

    public Class92()
    {
        /* empty */
    }
}
