/* Class68_Sub13_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub29 extends Class68_Sub13
{
    private static MutableString aClass100_3932;
    static int anInt3933;
    private static MutableString aClass100_3934;
    static int anInt3935;
    static MutableString aClass100_3936 = Class112.makeMutableString(43, "<col=00ff80>");
    static int[] anIntArray3937;
    static MutableString aClass100_3938 = Class112.makeMutableString(43, "mapfunction");
    private int anInt3939 = 4;
    static int anInt3940;
    static MutableString aClass100_3941;
    static MutableString aClass100_3942;
    static boolean[] aBooleanArray3943;
    static int[] mapDataLandIndices;
    private int anInt3945 = 4;

    public Class68_Sub13_Sub29()
    {
        super(1, false);
    }

    final int[][] method697(int i, boolean bool)
    {
        if (bool != true)
            method700(null, 104, 10);
        anInt3940++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) 85);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int i_0_ = Ground.anInt2777 / anInt3939;
            int i_1_ = Class68_Sub13_Sub19.anInt3748 / anInt3945;
            int[][] is_2_;
            if (i_0_ > 0)
            {
                int i_3_ = i % i_0_;
                is_2_ = this.method699(-93, 0, Ground.anInt2777 * i_3_ / i_0_);
            } else
                is_2_ = this.method699(-24, 0, 0);
            int[] is_4_ = is_2_[0];
            int[] is_5_ = is_2_[1];
            int[] is_6_ = is[1];
            int[] is_7_ = is[0];
            int[] is_8_ = is_2_[2];
            int[] is_9_ = is[2];
            for (int i_10_ = 0; i_10_ < Class68_Sub13_Sub19.anInt3748; i_10_++)
            {
                int i_11_;
                if (i_1_ > 0)
                {
                    int i_12_ = i_10_ % i_1_;
                    i_11_ = Class68_Sub13_Sub19.anInt3748 * i_12_ / i_1_;
                } else
                    i_11_ = 0;
                is_7_[i_10_] = is_4_[i_11_];
                is_6_[i_10_] = is_5_[i_11_];
                is_9_[i_10_] = is_8_[i_11_];
            }
        }
        return is;
    }

    final int[] method698(byte i, int i_13_)
    {
        anInt3933++;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_13_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_14_ = Ground.anInt2777 / anInt3939;
            int i_15_ = Class68_Sub13_Sub19.anInt3748 / anInt3945;
            int[] is_16_;
            if (i_14_ <= 0)
                is_16_ = this.method696(0, 0, 29149);
            else
            {
                int i_17_ = i_13_ % i_14_;
                is_16_ = this.method696(0, Ground.anInt2777 * i_17_ / i_14_, 29149);
            }
            for (int i_18_ = 0; i_18_ < Class68_Sub13_Sub19.anInt3748; i_18_++)
            {
                if (i_15_ <= 0)
                    is[i_18_] = is_16_[0];
                else
                {
                    int i_19_ = i_18_ % i_15_;
                    is[i_18_] = is_16_[(Class68_Sub13_Sub19.anInt3748 * i_19_ / i_15_)];
                }
            }
        }
        if (i != -61)
            method849(57);
        return is;
    }

    public static void method849(int i)
    {
        aClass100_3934 = null;
        aClass100_3942 = null;
        aClass100_3936 = null;
        anIntArray3937 = null;
        aClass100_3941 = null;
        int i_20_ = -47 % ((49 - i) / 53);
        aClass100_3938 = null;
        aBooleanArray3943 = null;
        aClass100_3932 = null;
        mapDataLandIndices = null;
    }

    final void method700(Stream class68_sub14, int i, int i_21_)
    {
        do
        {
            try
            {
                if (i_21_ != -1)
                    method698((byte) 87, -105);
                anInt3935++;
                int i_22_ = i;
                if (i_22_ != 0)
                {
                    if (i_22_ != 1)
                        break;
                } else
                {
                    anInt3945 = class68_sub14.readUByte();
                    break;
                }
                anInt3939 = class68_sub14.readUByte();
                break;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("s.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_21_ + ')'));
            }
        } while (false);
    }

    static
    {
        aClass100_3934 = Class112.makeMutableString(43, "Loaded fonts");
        aClass100_3932 = Class112.makeMutableString(43, "Loaded wordpack");
        aClass100_3941 = aClass100_3932;
        aClass100_3942 = aClass100_3934;
        aBooleanArray3943 = new boolean[200];
        anIntArray3937 = new int[5];
    }
}
