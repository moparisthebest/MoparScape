/* Class68_Sub13_Sub26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.security.MessageDigest;

final class Class68_Sub13_Sub26_Sub1 extends Class68_Sub13_Sub26
{
    static MutableString aClass100_4604;
    static MutableString aClass100_4605;
    static int anInt4606;
    static MutableString aClass100_4607;
    private static MutableString aClass100_4608 = Class112.makeMutableString(43, "Created gameworld");
    static Widget aClass45_4609;
    private static MutableString aClass100_4610;
    static int[] anIntArray4611 = { 0, 1, 2, 3 };
    static int anInt4612;
    static int anInt4613;
    static int anInt4614;
    static MutableString aClass100_4615;

    public static void method832(byte i)
    {
        anIntArray4611 = null;
        aClass100_4615 = null;
        aClass100_4604 = null;
        aClass100_4607 = null;
        aClass45_4609 = null;
        aClass100_4610 = null;
        aClass100_4605 = null;
        aClass100_4608 = null;
        if (i != -27)
            aClass100_4608 = null;
    }

    final int[][] method697(int i, boolean bool)
    {
        if (bool != true)
            return null;
        anInt4606++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -99);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612 && this.method826(0))
        {
            int[] is_0_ = is[0];
            int[] is_1_ = is[1];
            int[] is_2_ = is[2];
            int i_3_ = (i % ((Class68_Sub13_Sub26) this).anInt3883 * ((Class68_Sub13_Sub26) this).anInt3883);
            for (int i_4_ = 0; Class68_Sub13_Sub19.anInt3748 > i_4_; i_4_++)
            {
                int i_5_ = (((Class68_Sub13_Sub26) this).anIntArray3874[i_3_ + i_4_ % ((Class68_Sub13_Sub26) this).anInt3884]);
                is_2_[i_4_] = Class120.method1746(255, i_5_) << 4;
                is_1_[i_4_] = Class120.method1746(4080, i_5_ >> 4);
                is_0_[i_4_] = Class120.method1746(4080, i_5_ >> 12);
            }
        }
        return is;
    }

    static final boolean method833(byte i, MutableString class100)
    {
        try
        {
            anInt4614++;
            try
            {
                int i_6_ = class100.indexOf(44);
                if (i_6_ == -1)
                    return false;
                MutableString class100_7_ = class100.method1613(0, (byte) -74, i_6_);
                MutableString class100_8_ = class100.method1621(i_6_ + 1, true);
                MessageDigest messagedigest = MessageDigest.getInstance("SHA");
                messagedigest.reset();
                messagedigest.update(class100_7_.getData());
                byte[] is = messagedigest.digest();
                byte[] is_9_ = class100_8_.method1612((byte) 24);
                Stream class68_sub14 = new Stream(5000);
                class68_sub14.writeBytes(is_9_.length, 0, is_9_);
                ((Stream) class68_sub14).position = 0;
                class68_sub14.rsaDecrypt(Class71_Sub1.RSA_DECRYPT_KEY, Class68_Sub13_Sub5.RSA_DECRYPT_MODULUS);
                if (((Stream) class68_sub14).buffer[0] != 1)
                    return false;
                if (i >= -87)
                    aClass100_4615 = null;
                for (int i_10_ = 0; i_10_ < 20; i_10_++)
                {
                    if (is[i_10_] != (((Stream) class68_sub14).buffer[i_10_ + 1]))
                        return false;
                }
                return true;
            } catch (Exception exception)
            {
                return false;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ka.D(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    public Class68_Sub13_Sub26_Sub1()
    {
        /* empty */
    }

    static final int method834(int i)
    {
        anInt4612++;
        if ((double) Class68_Sub13_Sub27.aFloat3915 == 3.0)
            return 37;
        if (i != 50)
            aClass45_4609 = null;
        if ((double) Class68_Sub13_Sub27.aFloat3915 == 4.0)
            return 50;
        if ((double) Class68_Sub13_Sub27.aFloat3915 == 6.0)
            return 75;
        return 100;
    }

    static final Class68_Sub20_Sub9 method835(int i, int i_11_, byte i_12_)
    {
        anInt4613++;
        if (i_12_ >= -119)
            method834(29);
        Class68_Sub20_Sub9 class68_sub20_sub9 = ((Class68_Sub20_Sub9) Class68_Sub13_Sub12.aClass113_3649.method1684((long) i_11_ << 32 | (long) i, -104));
        if (class68_sub20_sub9 == null)
        {
            class68_sub20_sub9 = new Class68_Sub20_Sub9(i_11_, i);
            Class68_Sub13_Sub12.aClass113_3649.method1683((byte) 121, class68_sub20_sub9, (((Node) class68_sub20_sub9).nodeID));
        }
        return class68_sub20_sub9;
    }

    static
    {
        aClass100_4610 = Class112.makeMutableString(43, "Choose Option");
        aClass45_4609 = null;
        aClass100_4615 = Class112.makeMutableString(43, "Ablegen");
        aClass100_4607 = aClass100_4610;
        aClass100_4604 = Class112.makeMutableString(43, ":clanreq:");
        aClass100_4605 = aClass100_4608;
    }
}
