/* Class68_Sub13_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub38 extends Class68_Sub13
{
    static int anInt4080;
    static int anInt4081;
    static int anInt4082;
    static int anInt4083;
    static int anInt4084;
    static int anInt4085;
    static MutableString[] aClass100Array4086 = new MutableString[200];
    static int anInt4087;
    private int anInt4088 = 585;
    static int anInt4089;
    static int anInt4090;
    static int anInt4091;

    static final int method895(int i, boolean bool, int i_0_)
    {
        if (bool != true)
            return 53;
        anInt4089++;
        int i_1_ = (NPC.method156(4, i_0_ + 45365, i + 91923, -1) - 128 + (((NPC.method156(2, i_0_ + 10294, i + 37821, -1) - 128) >> 1) + (NPC.method156(1, i_0_, i, -1) - 128 >> 2)));
        i_1_ = (int) ((double) i_1_ * 0.3) + 35;
        if (i_1_ >= 10)
        {
            if (i_1_ > 60)
                i_1_ = 60;
        } else
            i_1_ = 10;
        return i_1_;
    }

    public static void method896(byte i)
    {
        if (i != -65)
            anInt4084 = -70;
        aClass100Array4086 = null;
    }

    static final Class68_Sub20_Sub10[] method897(byte i)
    {
        if (i != 15)
            method900(91, 31);
        anInt4087++;
        Class68_Sub20_Sub10[] class68_sub20_sub10s = new Class68_Sub20_Sub10[Stream.anInt3009];
        for (int i_2_ = 0; i_2_ < Stream.anInt3009; i_2_++)
        {
            byte[] is = Object5.aByteArrayArray1240[i_2_];
            int i_3_ = (Class68_Sub13_Sub12.anIntArray3641[i_2_] * Class68_Sub13_Sub19.anIntArray3759[i_2_]);
            if (Class68_Sub10.aBooleanArray2907[i_2_])
            {
                byte[] is_4_ = Class3.aByteArrayArray78[i_2_];
                int[] is_5_ = new int[i_3_];
                for (int i_6_ = 0; i_3_ > i_6_; i_6_++)
                    is_5_[i_6_] = (Class70.OR(Class120.method1746(is_4_[i_6_] << 24, -16777216), (Class68_Sub13_Sub17.anIntArray3721[Class120.method1746(255, is[i_6_])])));
                class68_sub20_sub10s[i_2_] = (new Class68_Sub20_Sub10_Sub1_Sub1(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[i_2_], ObjectDefinition.anIntArray1998[i_2_], Class68_Sub13_Sub12.anIntArray3641[i_2_], Class68_Sub13_Sub19.anIntArray3759[i_2_], is_5_));
            } else
            {
                int[] is_7_ = new int[i_3_];
                for (int i_8_ = 0; i_8_ < i_3_; i_8_++)
                    is_7_[i_8_] = (Class68_Sub13_Sub17.anIntArray3721[Class120.method1746(is[i_8_], 255)]);
                class68_sub20_sub10s[i_2_] = (new Sprite(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[i_2_], ObjectDefinition.anIntArray1998[i_2_], Class68_Sub13_Sub12.anIntArray3641[i_2_], Class68_Sub13_Sub19.anIntArray3759[i_2_], is_7_));
            }
        }
        Class87.method1493((byte) -93);
        return class68_sub20_sub10s;
    }

    static final void method898(Class21 class21, Class21 class21_9_, Interface2 interface2, byte i)
    {
        do
        {
            try
            {
                anInt4091++;
                Class13_Sub3.aClass21_2673 = class21_9_;
                Class37.anInterface2_649 = interface2;
                Class92.aClass21_1654 = class21;
                if (i == -117)
                    break;
                anInt4084 = 54;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("vi.F(" + (class21 != null ? "{...}" : "null") + ',' + (class21_9_ != null ? "{...}" : "null") + ',' + (interface2 != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    static final void method899(int i, Class21 class21, boolean bool, int i_10_, int i_11_, boolean bool_12_)
    {
        try
        {
            GameException.aClass21_2238 = class21;
            Class70.anInt1287 = 1;
            Class68_Sub13_Sub11.anInt3622 = 10000;
            Class68_Sub20_Sub15.anInt4405 = i;
            if (bool != false)
                anInt4081 = -46;
            Class52.aBoolean998 = bool_12_;
            Class67.anInt1217 = i_11_;
            Class105.anInt1796 = i_10_;
            anInt4085++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("vi.B(" + i + ',' + (class21 != null ? "{...}" : "null") + ',' + bool + ',' + i_10_ + ',' + i_11_ + ',' + bool_12_ + ')'));
        }
    }

    public Class68_Sub13_Sub38()
    {
        super(0, true);
    }

    static final void method900(int i, int i_13_)
    {
        Class30.aClass16_541.pushFront(new Class68_Sub10(i_13_));
        anInt4080++;
        int i_14_ = 86 % ((71 - i) / 53);
    }

    final void method700(Stream class68_sub14, int i, int i_15_)
    {
        try
        {
            anInt4083++;
            if (i_15_ != -1)
                anInt4081 = 59;
            int i_16_ = i;
            if (i_16_ == 0)
                anInt4088 = class68_sub14.readUShort();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("vi.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_15_ + ')'));
        }
    }

    final int[] method698(byte i, int i_17_)
    {
        if (i != -61)
            anInt4081 = -34;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_17_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_18_ = Class13_Sub3.anIntArray2674[i_17_];
            for (int i_19_ = 0; i_19_ < Class68_Sub13_Sub19.anInt3748; i_19_++)
            {
                int i_20_ = Class68_Sub13_Sub3.anIntArray3481[i_19_];
                if (i_20_ > anInt4088 && i_20_ < 4096 - anInt4088 && i_18_ > 2048 - anInt4088 && i_18_ < anInt4088 + 2048)
                {
                    int i_21_ = 2048 - i_20_;
                    i_21_ = i_21_ >= 0 ? i_21_ : -i_21_;
                    i_21_ <<= 12;
                    i_21_ /= 2048 - anInt4088;
                    is[i_19_] = 4096 - i_21_;
                } else if (2048 - anInt4088 < i_20_ && i_20_ < anInt4088 + 2048)
                {
                    int i_22_ = i_18_ - 2048;
                    i_22_ = i_22_ < 0 ? -i_22_ : i_22_;
                    i_22_ -= anInt4088;
                    i_22_ <<= 12;
                    is[i_19_] = i_22_ / (2048 - anInt4088);
                } else if (anInt4088 > i_18_ || 4096 - anInt4088 < i_18_)
                {
                    int i_23_ = i_20_ - 2048;
                    i_23_ = i_23_ >= 0 ? i_23_ : -i_23_;
                    i_23_ -= anInt4088;
                    i_23_ <<= 12;
                    is[i_19_] = i_23_ / (2048 - anInt4088);
                } else if (i_20_ < anInt4088 || 4096 - anInt4088 < i_20_)
                {
                    int i_24_ = 2048 - i_18_;
                    i_24_ = i_24_ < 0 ? -i_24_ : i_24_;
                    i_24_ <<= 12;
                    i_24_ /= 2048 - anInt4088;
                    is[i_19_] = 4096 - i_24_;
                } else
                    is[i_19_] = 0;
            }
        }
        anInt4090++;
        return is;
    }
}
