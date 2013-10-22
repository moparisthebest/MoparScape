/* Class68_Sub13_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.Random;

final class Class68_Sub13_Sub12 extends Class68_Sub13
{
    static int anInt3630;
    static short[][] aShortArrayArray3631 = { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
            { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    private int anInt3632;
    private static MutableString aClass100_3633 = Class112.makeMutableString(43, "Connecting to update server");
    private int anInt3634 = 0;
    static int anInt3635;
    static int anInt3636;
    static MutableString aClass100_3637 = aClass100_3633;
    static Calendar aCalendar3638;
    static int anInt3639;
    private int anInt3640;
    static int[] anIntArray3641;
    private int anInt3642 = 0;
    static boolean aBoolean3643 = false;
    static int anInt3644;
    private int anInt3645;
    static int anInt3646;
    static MutableString aClass100_3647;
    static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array3648;
    static NodeCache aClass113_3649;
    static MutableString aClass100_3650;

    static final void method754(int i, int i_0_)
    {
        Class85.anInt1553 = i;
        anInt3639++;
        Class68_Sub22.anInt3147 = -1;
        if (i_0_ >= 88)
        {
            Class68_Sub22.anInt3147 = -1;
            NodeSubList.method1788(-1);
        }
    }

    public static void method755(byte i)
    {
        aShortArrayArray3631 = null;
        aClass100_3650 = null;
        aClass100_3647 = null;
        aCalendar3638 = null;
        aClass113_3649 = null;
        aClass100_3633 = null;
        aClass68_Sub20_Sub10Array3648 = null;
        if (i == 24)
        {
            aClass100_3637 = null;
            anIntArray3641 = null;
        }
    }

    static final void method756(boolean bool)
    {
        if (bool != true)
            aBoolean3643 = false;
        anInt3630++;
        Class68_Sub20_Sub13.aClass98_4361.method1573(110);
    }

    final int[] method698(byte i, int i_1_)
    {
        anInt3644++;
        if (i != -61)
            return null;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_1_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_2_ = anInt3645 >> 1;
            int[][] is_3_ = ((Class68_Sub13) this).aClass115_2938.method1702(-32044);
            Random random = new Random((long) anInt3642);
            for (int i_4_ = 0; i_4_ < anInt3632; i_4_++)
            {
                int i_5_ = (anInt3645 <= 0 ? anInt3634 : anInt3634 + (Class68_Sub20_Sub10.method1114(anInt3645, (byte) 70, random) - i_2_));
                i_5_ = 0xff & i_5_ >> 4;
                int i_6_ = Class68_Sub20_Sub10.method1114((Class68_Sub13_Sub19.anInt3748), (byte) 70, random);
                int i_7_ = Class68_Sub20_Sub10.method1114(Ground.anInt2777, (byte) 70, random);
                int i_8_ = (Class118.anIntArray2079[i_5_] * anInt3640 >> 12) + i_7_;
                int i_9_ = (Class78.anIntArray1396[i_5_] * anInt3640 >> 12) + i_6_;
                int i_10_ = i_8_ - i_7_;
                int i_11_ = i_9_ - i_6_;
                if (i_11_ != 0 || i_10_ != 0)
                {
                    if (i_10_ < 0)
                        i_10_ = -i_10_;
                    if (i_11_ < 0)
                        i_11_ = -i_11_;
                    boolean bool = i_11_ < i_10_;
                    if (bool)
                    {
                        int i_12_ = i_6_;
                        i_6_ = i_7_;
                        int i_13_ = i_9_;
                        i_7_ = i_12_;
                        i_9_ = i_8_;
                        i_8_ = i_13_;
                    }
                    if (i_6_ > i_9_)
                    {
                        int i_14_ = i_6_;
                        i_6_ = i_9_;
                        i_9_ = i_14_;
                        int i_15_ = i_7_;
                        i_7_ = i_8_;
                        i_8_ = i_15_;
                    }
                    int i_16_ = i_7_;
                    int i_17_ = i_9_ - i_6_;
                    int i_18_ = -i_17_ / 2;
                    int i_19_ = 2048 / i_17_;
                    int i_20_ = i_8_ - i_7_;
                    if (i_20_ < 0)
                        i_20_ = -i_20_;
                    int i_21_ = (1024 - (Class68_Sub20_Sub10.method1114(4096, (byte) 70, random) >> 2));
                    int i_22_ = i_8_ <= i_7_ ? -1 : 1;
                    for (int i_23_ = i_6_; i_9_ > i_23_; i_23_++)
                    {
                        i_18_ += i_20_;
                        int i_24_ = i_19_ * (i_23_ - i_6_) + (i_21_ + 1024);
                        int i_25_ = Class30.anInt543 & i_23_;
                        int i_26_ = i_16_ & Player.anInt3434;
                        if (bool)
                            is_3_[i_26_][i_25_] = i_24_;
                        else
                            is_3_[i_25_][i_26_] = i_24_;
                        if (i_18_ > 0)
                        {
                            i_18_ -= i_17_;
                            i_16_ = i_22_ + i_16_;
                        }
                    }
                }
            }
        }
        return is;
    }

    final void method700(Stream class68_sub14, int i, int i_27_)
    {
        do
        {
            try
            {
                anInt3636++;
                int i_28_ = i;
                while_71_: do
                {
                    while_70_: do
                    {
                        while_69_: do
                        {
                            do
                            {
                                if (i_28_ != 0)
                                {
                                    if (i_28_ != 1)
                                    {
                                        if (i_28_ != 2)
                                        {
                                            if (i_28_ != 3)
                                            {
                                                if (i_28_ == 4)
                                                    break while_70_;
                                                break while_71_;
                                            }
                                        } else
                                            break;
                                        break while_69_;
                                    }
                                } else
                                {
                                    anInt3642 = class68_sub14.readUByte();
                                    break while_71_;
                                }
                                anInt3632 = class68_sub14.readUShort();
                                break while_71_;
                            } while (false);
                            anInt3640 = class68_sub14.readUByte();
                            break while_71_;
                        } while (false);
                        anInt3634 = class68_sub14.readUShort();
                        break while_71_;
                    } while (false);
                    anInt3645 = class68_sub14.readUShort();
                } while (false);
                if (i_27_ == -1)
                    break;
                anInt3640 = -69;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ia.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_27_ + ')'));
            }
            break;
        } while (false);
    }

    final void method690(byte i)
    {
        if (i >= -22)
            method756(true);
        anInt3635++;
        Class68_Sub10.method683((byte) -127);
    }

    public Class68_Sub13_Sub12()
    {
        super(0, true);
        anInt3632 = 2000;
        anInt3640 = 16;
        anInt3645 = 4096;
    }

    static
    {
        aCalendar3638 = Calendar.getInstance();
        aClass100_3647 = Class112.makeMutableString(43, "Lade Sprites )2 ");
        aClass113_3649 = new NodeCache(16);
        aClass100_3650 = Class112.makeMutableString(43, "::errortest");
    }
}
