/* Class68_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub25 extends Node
{
    static MutableString aClass100_3166 = Class112.makeMutableString(43, "");
    byte[] aByteArray3167;
    static int anInt3168;
    static GameSocket aClass61_3169;
    static Class8[] aClass8Array3170 = new Class8[500];
    static int anInt3171;
    Class89 aClass89_3172;
    static MutableString aClass100_3173 = Class112.makeMutableString(43, "event_opbase");
    static int[] anIntArray3174;
    static int anInt3175;
    static int anInt3176 = 99;
    Class21_Sub1 aClass21_Sub1_3177;
    static int anInt3178;
    int anInt3179;

    static final boolean method1210(byte i)
    {
        anInt3171++;
        synchronized (Class66.keyboard)
        {
            if (Class70.anInt1281 == Class75_Sub1_Sub1.anInt4592)
                return false;
            Class59.anInt1104 = Class68_Sub22.anIntArray3135[Class70.anInt1281];
            Character.anInt2538 = Class13_Sub2.anIntArray2645[Class70.anInt1281];
            Class70.anInt1281 = 0x7f & Class70.anInt1281 + 1;
            if (i != 111)
                return false;
            return true;
        }
    }

    public static void method1211(int i)
    {
        aClass8Array3170 = null;
        anIntArray3174 = null;
        aClass100_3166 = null;
        int i_0_ = -53 % ((i - 33) / 49);
        aClass61_3169 = null;
        aClass100_3173 = null;
    }

    static final void method1212(int i, byte i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_)
    {
        anInt3175++;
        do
        {
            if (i_4_ < GroundData.anInt677 || i_4_ > NodeCache.anInt1920 || GroundData.anInt677 > i || i > NodeCache.anInt1920 || i_9_ < GroundData.anInt677 || i_9_ > NodeCache.anInt1920 || i_5_ < GroundData.anInt677 || NodeCache.anInt1920 < i_5_ || Class35.anInt605 > i_2_ || Class51.anInt2257 < i_2_ || Class35.anInt605 > i_3_ || Class51.anInt2257 < i_3_ || i_6_ < Class35.anInt605 || Class51.anInt2257 < i_6_ || Class35.anInt605 > i_8_ || i_8_ > Class51.anInt2257)
            {
                Class9.method212(i_2_, i_9_, i, 1580177356, i_8_, i_6_, i_3_, i_5_, i_4_, i_7_);
                if (client.anInt2387 == 0)
                    break;
            }
            Class70.method1333(i_5_, -99, i_6_, i, i_2_, i_4_, i_7_, i_3_, i_9_, i_8_);
        } while (false);
        if (i_1_ > -80)
            aClass100_3166 = null;
    }

    static final void method1213(Class21_Sub1 class21_sub1, byte i, Class89 class89, int i_10_)
    {
        try
        {
            anInt3168++;
            Class68_Sub25 class68_sub25 = new Class68_Sub25();
            int i_11_ = 4 / ((-78 - i) / 32);
            ((Class68_Sub25) class68_sub25).anInt3179 = 1;
            ((Class68_Sub25) class68_sub25).aClass21_Sub1_3177 = class21_sub1;
            ((Node) class68_sub25).nodeID = (long) i_10_;
            ((Class68_Sub25) class68_sub25).aClass89_3172 = class89;
            synchronized (Class68_Sub20_Sub10.aClass16_4316)
            {
                Class68_Sub20_Sub10.aClass16_4316.pushFront(class68_sub25);
            }
            Class68_Sub20_Sub11.method1140(600);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("v.C(" + (class21_sub1 != null ? "{...}" : "null") + ',' + i + ',' + (class89 != null ? "{...}" : "null") + ',' + i_10_ + ')'));
        }
    }

    public Class68_Sub25()
    {
        /* empty */
    }
}
