/* Class68_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class68_Sub22 extends Node
{
    static int[][] anIntArrayArray3134;
    static int[] anIntArray3135 = new int[128];
    static boolean aBoolean3136;
    static MutableString aClass100_3137 = Class112.makeMutableString(43, "(U0a )2 non)2existant gosub script)2num: ");
    static BigInteger RSA_ENCRYPT_MODULUS;
    static int[] anIntArray3139;
    static int anInt3140;
    static MutableString aClass100_3141;
    static int anInt3142;
    int[] anIntArray3143 = new int[1];
    static int anInt3144;
    static int anInt3145;
    int[] anIntArray3146 = { -1 };
    static int anInt3147;
    static MutableString aClass100_3148;
    static int anInt3149;
    static int anInt3150;
    static boolean aBoolean3151;
    static MutableString aClass100_3152;

    public static void method1201(int i)
    {
        anIntArrayArray3134 = null;
        aClass100_3152 = null;
        anIntArray3135 = null;
        aClass100_3137 = null;
        RSA_ENCRYPT_MODULUS = null;
        aClass100_3148 = null;
        anIntArray3139 = null;
        aClass100_3141 = null;
        if (i != -1)
            method1201(7);
    }

    public Class68_Sub22()
    {
        /* empty */
    }

    static final Sprite method1202(int i, byte i_0_, Class21 class21, int i_1_)
    {
        try
        {
            if (i_0_ != -96)
                anIntArrayArray3134 = null;
            anInt3140++;
            if (!Class68_Sub13_Sub36.method880(-29381, i, class21, i_1_))
                return null;
            return Class124.method1757((byte) -83);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("qd.A(" + i + ',' + i_0_ + ',' + (class21 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
        }
    }

    static
    {
        aBoolean3136 = false;
        aClass100_3141 = Class112.makeMutableString(43, "");
        anInt3147 = -1;
        aClass100_3148 = Class112.makeMutableString(43, ":assistreq:");
        anInt3142 = 0;
        RSA_ENCRYPT_MODULUS = (new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789"));
        anInt3150 = 1;
        aBoolean3151 = true;
        aClass100_3152 = Class112.makeMutableString(43, "mem=");
    }
}
