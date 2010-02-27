/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class18
{
    int anInt286;
    byte[] aByteArray287;
    byte[] aByteArray288 = new byte[18002];
    static Class68_Sub20_Sub1_Sub1 aClass68_Sub20_Sub1_Sub1_289;
    int anInt290;
    int[] anIntArray291;
    int anInt292;
    int anInt293;
    int anInt294;
    byte[] aByteArray295;
    static MutableString aClass100_296;
    byte aByte297;
    int anInt298;
    int[] anIntArray299;
    byte[][] aByteArrayArray300 = new byte[6][258];
    static int anInt301;
    int anInt302;
    int[][] anIntArrayArray303;
    boolean[] aBooleanArray304;
    int anInt305;
    int anInt306;
    int anInt307;
    int anInt308;
    static MutableString aClass100_309;
    int anInt310;
    byte[] aByteArray311;
    byte[] aByteArray312;
    int anInt313;
    int anInt314;
    int anInt315;
    static int anInt316;
    static int anInt317;
    static int anInt318;
    int[] anIntArray319;
    private static MutableString aClass100_320 = Class112.makeMutableString(43, "M");
    int[][] anIntArrayArray321;
    int[] anIntArray322;
    byte[] aByteArray323;
    int[][] anIntArrayArray324;
    boolean[] aBooleanArray325;
    static int anInt326;

    public static void method299(int i)
    {
        aClass100_320 = null;
        aClass100_296 = null;
        aClass68_Sub20_Sub1_Sub1_289 = null;
        if (i == 18002)
            aClass100_309 = null;
    }

    static final int method300(int i, boolean bool)
    {
        if (bool != false)
            return 80;
        anInt317++;
        Class48 class48 = Class68_Sub13_Sub11.method752((byte) 81, i);
        int i_0_ = ((Class48) class48).anInt956;
        int i_1_ = ((Class48) class48).anInt958;
        int i_2_ = NodeList.anIntArray259[i_0_ - i_1_];
        int i_3_ = ((Class48) class48).anInt945;
        return i_2_ & Class103.settingArray[i_3_] >> i_1_;
    }

    static final void method301(int i)
    {
        if (i > -84)
            method302(-32, null, 85);
        CipheredByteVector.aClass98_4120.method1572((byte) 94);
        anInt326++;
    }

    static final void method302(int i, Widget[] class45s, int i_4_)
    {
        try
        {
            for (int i_5_ = i; i_5_ < class45s.length; i_5_++)
            {
                Widget class45 = class45s[i_5_];
                if (class45 != null && ((Widget) class45).anInt799 == i_4_ && (!((Widget) class45).aBoolean863 || !client.method45(class45)))
                {
                    if (((Widget) class45).type == 0)
                    {
                        if (!((Widget) class45).aBoolean863 && client.method45(class45) && Class108.aClass45_1827 != class45)
                            continue;
                        method302(i, class45s, ((Widget) class45).anInt792);
                        if (((Widget) class45).widgetCache != null)
                            method302(i, ((Widget) class45).widgetCache, ((Widget) class45).anInt792);
                        Class68_Sub3 class68_sub3 = ((Class68_Sub3) (Login.aClass113_1514.method1684((long) ((Widget) class45).anInt792, i - 53)));
                        if (class68_sub3 != null)
                            Class43.method480((((Class68_Sub3) class68_sub3).anInt2805), -1);
                    }
                    if (((Widget) class45).type == 6)
                    {
                        if (((Widget) class45).anInt831 != -1 || ((Widget) class45).anInt869 != -1)
                        {
                            boolean bool = Class68_Sub19.method1000(i, class45);
                            int i_6_;
                            if (bool)
                                i_6_ = ((Widget) class45).anInt869;
                            else
                                i_6_ = ((Widget) class45).anInt831;
                            if (i_6_ != -1)
                            {
                                Animation class117 = Object1.getAnimation(i_6_);
                                if (class117 != null)
                                {
                                    ((Widget) class45).anInt771 += Class109.anInt1846;
                                    while ((((Animation) class117).anIntArray2060[((Widget) class45).anInt756]) < ((Widget) class45).anInt771)
                                    {
                                        ((Widget) class45).anInt771 -= (((Animation) class117).anIntArray2060[(((Widget) class45).anInt756)]);
                                        ((Widget) class45).anInt756++;
                                        if (((Widget) class45).anInt756 >= (((Animation) class117).anIntArray2037).length)
                                        {
                                            ((Widget) class45).anInt756 -= (((Animation) class117).anInt2074);
                                            if ((((Widget) class45).anInt756 < 0) || ((((Animation) class117).anIntArray2037).length <= (((Widget) class45).anInt756)))
                                                ((Widget) class45).anInt756 = 0;
                                        }
                                        NodeCache.method1688(class45, -124);
                                    }
                                }
                            }
                        }
                        if (((Widget) class45).anInt910 != 0 && !((Widget) class45).aBoolean863)
                        {
                            int i_7_ = ((Widget) class45).anInt910 >> 16;
                            i_7_ *= Class109.anInt1846;
                            ((Widget) class45).anInt864 = i_7_ + ((Widget) class45).anInt864 & 0x7ff;
                            int i_8_ = ((Widget) class45).anInt910 << 16 >> 16;
                            i_8_ *= Class109.anInt1846;
                            ((Widget) class45).anInt814 = i_8_ + ((Widget) class45).anInt814 & 0x7ff;
                            NodeCache.method1688(class45, i - 115);
                        }
                    }
                }
            }
            anInt301++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cb.B(" + i + ',' + (class45s != null ? "{...}" : "null") + ',' + i_4_ + ')'));
        }
    }

    Class18()
    {
        ((Class18) this).anIntArray299 = new int[16];
        ((Class18) this).anIntArrayArray303 = new int[6][258];
        ((Class18) this).aByteArray311 = new byte[256];
        ((Class18) this).aByteArray287 = new byte[4096];
        ((Class18) this).anIntArray291 = new int[257];
        ((Class18) this).aBooleanArray304 = new boolean[256];
        ((Class18) this).anInt308 = 0;
        ((Class18) this).aByteArray323 = new byte[18002];
        ((Class18) this).anIntArrayArray321 = new int[6][258];
        ((Class18) this).anInt315 = 0;
        ((Class18) this).aBooleanArray325 = new boolean[16];
        ((Class18) this).anIntArrayArray324 = new int[6][258];
        ((Class18) this).anIntArray319 = new int[256];
        ((Class18) this).anIntArray322 = new int[6];
    }

    static
    {
        aClass100_309 = aClass100_320;
        anInt316 = (int) (33.0 * Math.random()) - 16;
        aClass100_296 = aClass100_320;
    }
}
