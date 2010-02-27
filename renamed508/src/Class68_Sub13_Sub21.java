/* Class68_Sub13_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub21 extends Class68_Sub13
{
    static int anInt3787;
    static int[] anIntArray3788;
    static int anInt3789 = 0;
    static Class91 aClass91_3790;
    static int anInt3791;
    static int anInt3792;
    private int anInt3793 = 4096;
    static Class68_Sub6 aClass68_Sub6_3794;
    static boolean aBoolean3795;
    static int anInt3796;
    static MutableString aClass100_3797;
    static volatile boolean aBoolean3798;
    static int[] anIntArray3799;
    static int anInt3800;
    private static MutableString aClass100_3801;
    static int anInt3802;
    static Class68_Sub20_Sub1 aClass68_Sub20_Sub1_3803;
    static long[] friendList;
    static int menuOptionsCount;
    static Class21_Sub1 aClass21_Sub1_3806;

    static final int method805(int i, MutableString class100)
    {
        try
        {
            anInt3796++;
            if (class100 == null)
                return -1;
            int i_0_ = 0;
            if (i != 31601)
                method807((byte) 66, 93, 122);
            for (/**/; i_0_ < Class32.friendCount; i_0_++)
            {
                if (class100.method1606(false, (Class68_Sub13_Sub38.aClass100Array4086[i_0_])))
                    return i_0_;
            }
            return -1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ma.B(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    public Class68_Sub13_Sub21()
    {
        super(1, true);
    }

    public static void method806(int i)
    {
        aClass100_3797 = null;
        anIntArray3788 = null;
        if (i > -65)
            method808(-106, 49, 57, 32, 5, 110, 104, -2, null, 88, true, 60L);
        aClass91_3790 = null;
        anIntArray3799 = null;
        aClass68_Sub20_Sub1_3803 = null;
        aClass21_Sub1_3806 = null;
        aClass100_3801 = null;
        friendList = null;
        aClass68_Sub6_3794 = null;
    }

    final int[] method698(byte i, int i_1_)
    {
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_1_);
        anInt3800++;
        if (i != -61)
            aClass68_Sub6_3794 = null;
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int[] is_2_ = this.method696(0, Player.anInt3434 & i_1_ - 1, 29149);
            int[] is_3_ = this.method696(0, i_1_, 29149);
            int[] is_4_ = this.method696(0, Player.anInt3434 & i_1_ + 1, 29149);
            for (int i_5_ = 0; Class68_Sub13_Sub19.anInt3748 > i_5_; i_5_++)
            {
                int i_6_ = ((is_3_[Class30.anInt543 & i_5_ + 1] - is_3_[Class30.anInt543 & i_5_ - 1]) * anInt3793);
                int i_7_ = anInt3793 * (is_4_[i_5_] - is_2_[i_5_]);
                int i_8_ = i_7_ >> 12;
                int i_9_ = i_8_ * i_8_ >> 12;
                int i_10_ = i_6_ >> 12;
                int i_11_ = i_10_ * i_10_ >> 12;
                int i_12_ = (int) (Math.sqrt((double) ((float) (i_9_ + i_11_ + 4096) / 4096.0F)) * 4096.0);
                int i_13_ = i_12_ == 0 ? 0 : 16777216 / i_12_;
                is[i_5_] = 4096 - i_13_;
            }
        }
        return is;
    }

    static final int method807(byte i, int i_14_, int i_15_)
    {
        anInt3791++;
        int i_16_ = 0;
        int i_17_ = -40 % ((-47 - i) / 34);
        while (i_15_ > 0)
        {
            i_16_ = i_16_ << 1 | 0x1 & i_14_;
            i_15_--;
            i_14_ >>>= 1;
        }
        return i_16_;
    }

    final void method700(Stream class68_sub14, int i, int i_18_)
    {
        do
        {
            try
            {
                if (i_18_ != -1)
                    method807((byte) 95, 101, 33);
                anInt3802++;
                if (i != 0)
                    break;
                anInt3793 = class68_sub14.readUShort();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ma.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_18_ + ')'));
            }
            break;
        } while (false);
    }

    static final boolean method808(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, Animable class1, int i_26_, boolean bool, long l)
    {
        boolean bool_27_ = (Class68_Sub20_Sub12.intGroundArray == Class68_Sub13_Sub14.anIntArrayArrayArray3673);
        int i_28_ = 0;
        for (int i_29_ = i_19_; i_29_ < i_19_ + i_21_; i_29_++)
        {
            for (int i_30_ = i_20_; i_30_ < i_20_ + i_22_; i_30_++)
            {
                if (i_29_ < 0 || i_30_ < 0 || i_29_ >= GameApplet.anInt7 || i_30_ >= Class97.anInt1716)
                    return false;
                Ground class68_sub1 = Class22.groundArray[i][i_29_][i_30_];
                if (class68_sub1 != null && ((Ground) class68_sub1).anInt2773 >= 5)
                    return false;
            }
        }
        Object5 class69 = new Object5();
        ((Object5) class69).uid = l;
        ((Object5) class69).anInt1249 = i;
        ((Object5) class69).anInt1262 = i_23_;
        ((Object5) class69).anInt1250 = i_24_;
        ((Object5) class69).anInt1252 = i_25_;
        ((Object5) class69).aClass1_1242 = class1;
        ((Object5) class69).anInt1255 = i_26_;
        ((Object5) class69).anInt1254 = i_19_;
        ((Object5) class69).anInt1253 = i_20_;
        ((Object5) class69).anInt1238 = i_19_ + i_21_ - 1;
        ((Object5) class69).anInt1234 = i_20_ + i_22_ - 1;
        for (int i_31_ = i_19_; i_31_ < i_19_ + i_21_; i_31_++)
        {
            for (int i_32_ = i_20_; i_32_ < i_20_ + i_22_; i_32_++)
            {
                int i_33_ = 0;
                if (i_31_ > i_19_)
                    i_33_++;
                if (i_31_ < i_19_ + i_21_ - 1)
                    i_33_ += 4;
                if (i_32_ > i_20_)
                    i_33_ += 8;
                if (i_32_ < i_20_ + i_22_ - 1)
                    i_33_ += 2;
                for (int i_34_ = i; i_34_ >= 0; i_34_--)
                {
                    if ((Class22.groundArray[i_34_][i_31_][i_32_]) == null)
                        Class22.groundArray[i_34_][i_31_][i_32_] = new Ground(i_34_, i_31_, i_32_);
                }
                Ground class68_sub1 = Class22.groundArray[i][i_31_][i_32_];
                ((Ground) class68_sub1).object_5[((Ground) class68_sub1).anInt2773] = class69;
                ((Ground) class68_sub1).modifiers[((Ground) class68_sub1).anInt2773] = i_33_;
                ((Ground) class68_sub1).anInt2770 |= i_33_;
                ((Ground) class68_sub1).anInt2773++;
                if (bool_27_ && Item.anIntArrayArray2432[i_31_][i_32_] != 0)
                    i_28_ = Item.anIntArrayArray2432[i_31_][i_32_];
            }
        }
        if (bool_27_ && i_28_ != 0)
        {
            for (int i_35_ = i_19_; i_35_ < i_19_ + i_21_; i_35_++)
            {
                for (int i_36_ = i_20_; i_36_ < i_20_ + i_22_; i_36_++)
                {
                    if (Item.anIntArrayArray2432[i_35_][i_36_] == 0)
                        Item.anIntArrayArray2432[i_35_][i_36_] = i_28_;
                }
            }
        }
        if (bool)
            Node.aClass69Array1222[Animation.anInt2057++] = class69;
        return true;
    }

    static final void method809(int i, ObjectDefinition class116, int i_37_, byte i_38_, int i_39_)
    {
        try
        {
            anInt3792++;
            if (i_38_ == 18)
            {
                for (Class68_Sub18 class68_sub18 = ((Class68_Sub18) Class8.aClass16_140.method293((byte) 76)); class68_sub18 != null; class68_sub18 = ((Class68_Sub18) Class8.aClass16_140.method290((byte) 109)))
                {
                    if (i_37_ == ((Class68_Sub18) class68_sub18).anInt3041 && (((Class68_Sub18) class68_sub18).anInt3066 == i_39_ * 128) && ((Class68_Sub18) class68_sub18).anInt3053 == 128 * i && (((ObjectDefinition) (((Class68_Sub18) class68_sub18).aClass116_3047)).type == ((ObjectDefinition) class116).type))
                    {
                        if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042) != null)
                        {
                            NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042);
                            ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = null;
                        }
                        if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051) != null)
                        {
                            NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051);
                            ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051 = null;
                        }
                        class68_sub18.unlink();
                        break;
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ma.F(" + i + ',' + (class116 != null ? "{...}" : "null") + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ')'));
        }
    }

    static
    {
        anIntArray3788 = new int[] { 12543016, 15504954, 15914854, 16773818 };
        anIntArray3799 = new int[4096];
        aBoolean3798 = false;
        aClass100_3801 = (Class112.makeMutableString(43, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3"));
        aClass100_3797 = aClass100_3801;
        aBoolean3795 = true;
        aClass68_Sub6_3794 = new Class68_Sub6(0, 0);
        friendList = new long[200];
        menuOptionsCount = 0;
    }
}
