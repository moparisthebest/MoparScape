/* Class68_Sub13_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub30 extends Class68_Sub13
{
    static int anInt3946;
    private int anInt3947 = 4096;
    static int anInt3948;
    static Class21 aClass21_3949;
    static int anInt3950 = 0;
    static int anInt3951;
    static int anInt3952;
    private int anInt3953 = 4096;
    private int anInt3954 = 4096;
    static Class21_Sub1 aClass21_Sub1_3955;
    static int anInt3956;

    static final void method850(int i, byte i_0_, int i_1_, int i_2_, int i_3_)
    {
        if (i_0_ == -34)
        {
            for (Class68_Sub18 class68_sub18 = ((Class68_Sub18) Class8.aClass16_140.method293((byte) 76)); class68_sub18 != null; class68_sub18 = ((Class68_Sub18) Class8.aClass16_140.method290((byte) -127)))
                Class68_Sub13_Sub31.method859(93, i_1_, i_2_, i, class68_sub18, i_3_);
            for (Class68_Sub18 class68_sub18 = ((Class68_Sub18) Class51.aClass16_2253.method293((byte) 76)); class68_sub18 != null; class68_sub18 = (Class68_Sub18) Class51.aClass16_2253.method290((byte) -125))
            {
                int i_4_ = 1;
                if (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).anInt2526 != ((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).anInt2532)
                {
                    if (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).anInt2542 == ((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).anInt2526)
                        i_4_ = 2;
                } else
                    i_4_ = 0;
                if (i_4_ != ((Class68_Sub18) class68_sub18).anInt3049)
                {
                    int i_5_ = Class72.method1349((((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062), false);
                    if (((Class68_Sub18) class68_sub18).anInt3044 != i_5_)
                    {
                        if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042) != null)
                        {
                            NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042);
                            ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = null;
                        }
                        ((Class68_Sub18) class68_sub18).anInt3044 = i_5_;
                    }
                    ((Class68_Sub18) class68_sub18).anInt3049 = i_4_;
                }
                ((Class68_Sub18) class68_sub18).anInt3066 = ((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).x;
                ((Class68_Sub18) class68_sub18).anInt3040 = (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).raw_range * 64 + ((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).y);
                ((Class68_Sub18) class68_sub18).anInt3053 = ((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).y;
                ((Class68_Sub18) class68_sub18).anInt3064 = (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).x + 64 * (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062)).raw_range));
                Class68_Sub13_Sub31.method859(i_0_ ^ ~0x4d, i_1_, i_2_, i, class68_sub18, i_3_);
            }
            anInt3946++;
            for (Class68_Sub18 class68_sub18 = ((Class68_Sub18) Class1_Sub5.aClass113_2511.method1685(-32642)); class68_sub18 != null; class68_sub18 = ((Class68_Sub18) Class1_Sub5.aClass113_2511.method1689((byte) -102)))
            {
                int i_6_ = 1;
                if (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).anInt2532 == ((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).anInt2526)
                    i_6_ = 0;
                else if (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).anInt2542 == (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).anInt2526))
                    i_6_ = 2;
                if (((Class68_Sub18) class68_sub18).anInt3049 != i_6_)
                {
                    int i_7_ = GameApplet.method32((((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052), -6694);
                    if (i_7_ != ((Class68_Sub18) class68_sub18).anInt3044)
                    {
                        if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042) != null)
                        {
                            NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042);
                            ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = null;
                        }
                        ((Class68_Sub18) class68_sub18).anInt3044 = i_7_;
                    }
                    ((Class68_Sub18) class68_sub18).anInt3049 = i_6_;
                }
                ((Class68_Sub18) class68_sub18).anInt3053 = ((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).y;
                ((Class68_Sub18) class68_sub18).anInt3066 = ((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).x;
                ((Class68_Sub18) class68_sub18).anInt3040 = (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).y + (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).raw_range * 64));
                ((Class68_Sub18) class68_sub18).anInt3064 = (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).x + 64 * (((Character) (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub2_3052)).raw_range));
                Class68_Sub13_Sub31.method859(112, i_1_, i_2_, i, class68_sub18, i_3_);
            }
        }
    }

    static final void method851(int i, int i_8_)
    {
        Login.anIntArray1512 = new int[i_8_];
        Class7.anIntArray134 = new int[i_8_];
        if (i >= -46)
            anInt3950 = -119;
        PlayerDefinition.anIntArray2182 = new int[i_8_];
        Class68_Sub20_Sub16.anIntArray4410 = new int[i_8_];
        Class21_Sub1.anIntArray2695 = new int[i_8_];
        anInt3948++;
    }

    final int[][] method697(int i, boolean bool)
    {
        anInt3952++;
        if (bool != true)
            return null;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -122);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[][] is_9_ = this.method699(-107, 0, i);
            int[] is_10_ = is_9_[0];
            int[] is_11_ = is_9_[1];
            int[] is_12_ = is_9_[2];
            int[] is_13_ = is[1];
            int[] is_14_ = is[2];
            int[] is_15_ = is[0];
            for (int i_16_ = 0; Class68_Sub13_Sub19.anInt3748 > i_16_; i_16_++)
            {
                int i_17_ = is_12_[i_16_];
                int i_18_ = is_11_[i_16_];
                int i_19_ = is_10_[i_16_];
                if (i_17_ == i_19_ && i_18_ == i_17_)
                {
                    is_15_[i_16_] = i_19_ * anInt3947 >> 12;
                    is_13_[i_16_] = i_17_ * anInt3954 >> 12;
                    is_14_[i_16_] = anInt3953 * i_18_ >> 12;
                } else
                {
                    is_15_[i_16_] = anInt3947;
                    is_13_[i_16_] = anInt3954;
                    is_14_[i_16_] = anInt3953;
                }
            }
        }
        return is;
    }

    static final Class68_Sub20_Sub17 method852(int i, boolean bool, Class21 class21, int i_20_, Class21 class21_21_)
    {
        try
        {
            anInt3951++;
            boolean bool_22_ = true;
            int[] is = class21_21_.getData(i_20_);
            if (i > -31)
                aClass21_Sub1_3955 = null;
            for (int i_23_ = 0; i_23_ < is.length; i_23_++)
            {
                byte[] is_24_ = class21_21_.method343(is[i_23_], 14281, i_20_);
                if (is_24_ == null)
                    bool_22_ = false;
                else
                {
                    int i_25_ = is_24_[1] & 0xff | (0xff & is_24_[0]) << 8;
                    byte[] is_26_;
                    if (bool)
                        is_26_ = class21.method343(i_25_, 14281, 0);
                    else
                        is_26_ = class21.method343(0, 14281, i_25_);
                    if (is_26_ == null)
                        bool_22_ = false;
                }
            }
            if (!bool_22_)
                return null;
            try
            {
                return new Class68_Sub20_Sub17(class21_21_, class21, i_20_, bool);
            } catch (Exception exception)
            {
                return null;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("sa.D(" + i + ',' + bool + ',' + (class21 != null ? "{...}" : "null") + ',' + i_20_ + ',' + (class21_21_ != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method853(int i)
    {
        aClass21_Sub1_3955 = null;
        int i_27_ = 89 / ((i - 55) / 54);
        aClass21_3949 = null;
    }

    public Class68_Sub13_Sub30()
    {
        super(1, false);
    }

    final void method700(Stream class68_sub14, int i, int i_28_)
    {
        do
        {
            try
            {
                anInt3956++;
                int i_29_ = i;
                while_150_: do
                {
                    do
                    {
                        if (i_29_ != 0)
                        {
                            if (i_29_ != 1)
                            {
                                if (i_29_ == 2)
                                    break;
                                break while_150_;
                            }
                        } else
                        {
                            anInt3947 = class68_sub14.readUShort();
                            break while_150_;
                        }
                        anInt3954 = class68_sub14.readUShort();
                        break while_150_;
                    } while (false);
                    anInt3953 = class68_sub14.readUShort();
                } while (false);
                if (i_28_ == -1)
                    break;
                method853(-105);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("sa.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_28_ + ')'));
            }
            break;
        } while (false);
    }
}
