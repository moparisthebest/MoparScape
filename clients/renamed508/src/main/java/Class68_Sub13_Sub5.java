/* Class68_Sub13_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class68_Sub13_Sub5 extends Class68_Sub13
{
    static int anInt3514;
    static int anInt3515;
    static int anInt3516;
    static Class44 aClass44_3517 = new Class44();
    static BigInteger RSA_DECRYPT_MODULUS;
    static MutableString aClass100_3519;
    static int anInt3520 = -1;
    private static MutableString aClass100_3521 = Class112.makeMutableString(43, "Allocated memory");
    static MutableString aClass100_3522;
    private static MutableString aClass100_3523;
    static Class21_Sub1 aClass21_Sub1_3524;

    final int[][] method697(int i, boolean bool)
    {
        anInt3514++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) 54);
        if (bool != true)
            return null;
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[][] is_0_ = this.method699(-31, 0, i);
            int[] is_1_ = is_0_[0];
            int[] is_2_ = is_0_[1];
            int[] is_3_ = is_0_[2];
            int[] is_4_ = is[0];
            int[] is_5_ = is[2];
            int[] is_6_ = is[1];
            for (int i_7_ = 0; Class68_Sub13_Sub19.anInt3748 > i_7_; i_7_++)
            {
                is_4_[i_7_] = 4096 - is_1_[i_7_];
                is_6_[i_7_] = 4096 - is_2_[i_7_];
                is_5_[i_7_] = 4096 - is_3_[i_7_];
            }
        }
        return is;
    }

    public static void method719(int i)
    {
        aClass100_3521 = null;
        aClass100_3523 = null;
        aClass21_Sub1_3524 = null;
        aClass100_3519 = null;
        if (i == 4096)
        {
            RSA_DECRYPT_MODULUS = null;
            aClass100_3522 = null;
            aClass44_3517 = null;
        }
    }

    public Class68_Sub13_Sub5()
    {
        super(1, false);
    }

    final int[] method698(byte i, int i_8_)
    {
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_8_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int[] is_9_ = this.method696(0, i_8_, 29149);
            for (int i_10_ = 0; Class68_Sub13_Sub19.anInt3748 > i_10_; i_10_++)
                is[i_10_] = 4096 - is_9_[i_10_];
        }
        if (i != -61)
            method700(null, -83, 113);
        anInt3515++;
        return is;
    }

    final void method700(Stream class68_sub14, int i, int i_11_)
    {
        try
        {
            if (i_11_ != -1)
                aClass21_Sub1_3524 = null;
            if (i == 0)
                ((Class68_Sub13) this).aBoolean2933 = class68_sub14.readUByte() == 1;
            anInt3516++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("di.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ')'));
        }
    }

    static
    {
        aClass100_3519 = aClass100_3521;
        aClass100_3523 = Class112.makeMutableString(43, "Checking for updates )2 ");
        aClass100_3522 = aClass100_3523;
        RSA_DECRYPT_MODULUS = (new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083"));
    }
}
