/* Class68_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub18 extends Node
{
    int anInt3040;
    int anInt3041;
    Class68_Sub28_Sub3 aClass68_Sub28_Sub3_3042;
    static int anInt3043;
    int anInt3044;
    static MutableString aClass100_3045 = Class112.makeMutableString(43, "Nehmen");
    int anInt3046;
    ObjectDefinition aClass116_3047;
    static int anInt3048;
    int anInt3049 = 0;
    static MutableString aClass100_3050;
    Class68_Sub28_Sub3 aClass68_Sub28_Sub3_3051;
    Player aClass1_Sub6_Sub2_3052;
    int anInt3053;
    static MutableString aClass100_3054 = Class112.makeMutableString(43, ")2");
    int[] anIntArray3055;
    int anInt3056;
    static int anInt3057;
    static int anInt3058;
    int anInt3059;
    static boolean aBoolean3060;
    int anInt3061;
    NPC aClass1_Sub6_Sub1_3062;
    boolean aBoolean3063;
    int anInt3064;
    static MutableString aClass100_3065;
    int anInt3066;

    public static void method992(int i)
    {
        aClass100_3054 = null;
        if (i != 0)
            method995(-119);
        aClass100_3065 = null;
        aClass100_3045 = null;
        aClass100_3050 = null;
    }

    final void method993(int i)
    {
        if (i == 31506)
        {
            int i_0_ = ((Class68_Sub18) this).anInt3044;
            if (((Class68_Sub18) this).aClass116_3047 == null)
            {
                if (((Class68_Sub18) this).aClass1_Sub6_Sub1_3062 == null)
                {
                    if (((Class68_Sub18) this).aClass1_Sub6_Sub2_3052 != null)
                    {
                        ((Class68_Sub18) this).anInt3044 = GameApplet.method32((((Class68_Sub18) this).aClass1_Sub6_Sub2_3052), i ^ ~0x6137);
                        ((Class68_Sub18) this).anInt3059 = 128 * ((Player) (((Class68_Sub18) this).aClass1_Sub6_Sub2_3052)).anInt3429;
                    }
                } else
                {
                    int i_1_ = Class72.method1349((((Class68_Sub18) this).aClass1_Sub6_Sub1_3062), false);
                    if (i_0_ != i_1_)
                    {
                        ((Class68_Sub18) this).anInt3044 = i_1_;
                        NPCDefinition class80 = (((NPC) ((Class68_Sub18) this).aClass1_Sub6_Sub1_3062).definition);
                        if (((NPCDefinition) class80).anIntArray1433 != null)
                            class80 = class80.method1453(-94);
                        if (class80 != null)
                            ((Class68_Sub18) this).anInt3059 = 128 * ((NPCDefinition) class80).anInt1465;
                        else
                            ((Class68_Sub18) this).anInt3059 = 0;
                    }
                }
            } else
            {
                ObjectDefinition class116 = ((Class68_Sub18) this).aClass116_3047.method1716(i ^ ~0x7b12);
                if (class116 != null)
                {
                    ((Class68_Sub18) this).anIntArray3055 = ((ObjectDefinition) class116).anIntArray1997;
                    ((Class68_Sub18) this).anInt3046 = ((ObjectDefinition) class116).anInt1966;
                    ((Class68_Sub18) this).anInt3044 = ((ObjectDefinition) class116).anInt1984;
                    ((Class68_Sub18) this).anInt3059 = 128 * ((ObjectDefinition) class116).anInt1977;
                    ((Class68_Sub18) this).anInt3061 = ((ObjectDefinition) class116).anInt2002;
                } else
                {
                    ((Class68_Sub18) this).anIntArray3055 = null;
                    ((Class68_Sub18) this).anInt3059 = 0;
                    ((Class68_Sub18) this).anInt3061 = 0;
                    ((Class68_Sub18) this).anInt3044 = -1;
                    ((Class68_Sub18) this).anInt3046 = 0;
                }
            }
            anInt3058++;
            if (((Class68_Sub18) this).anInt3044 != i_0_ && ((Class68_Sub18) this).aClass68_Sub28_Sub3_3042 != null)
            {
                NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) this).aClass68_Sub28_Sub3_3042);
                ((Class68_Sub18) this).aClass68_Sub28_Sub3_3042 = null;
            }
        }
    }

    static final void method994(int i, int i_2_, boolean bool, boolean bool_3_, int i_4_, Widget[] class45s)
    {
        try
        {
            if (bool_3_ != false)
                aClass100_3050 = null;
            for (int i_5_ = 0; class45s.length > i_5_; i_5_++)
            {
                Widget class45 = class45s[i_5_];
                if (class45 != null && ((Widget) class45).anInt799 == i)
                {
                    Class68_Sub20_Sub7.method1075(bool, 19, i_2_, i_4_, class45);
                    Class68_Sub20_Sub13.method1159(i_2_, class45, i_4_, -1198502738);
                    if (((Widget) class45).anInt818 > (((Widget) class45).anInt794 - ((Widget) class45).anInt873))
                        ((Widget) class45).anInt818 = (((Widget) class45).anInt794 - ((Widget) class45).anInt873);
                    if (((Widget) class45).anInt818 < 0)
                        ((Widget) class45).anInt818 = 0;
                    if ((((Widget) class45).anInt888 - ((Widget) class45).anInt892) < ((Widget) class45).anInt847)
                        ((Widget) class45).anInt847 = (((Widget) class45).anInt888 - ((Widget) class45).anInt892);
                    if (((Widget) class45).anInt847 < 0)
                        ((Widget) class45).anInt847 = 0;
                    if (((Widget) class45).type == 0)
                        Class68_Sub13_Sub27.method838(-1, bool, class45);
                }
            }
            anInt3043++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("nf.D(" + i + ',' + i_2_ + ',' + bool + ',' + bool_3_ + ',' + i_4_ + ',' + (class45s != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method995(int i)
    {
        anInt3057++;
        for (int i_6_ = 0; Class13_Sub2.localNPCCount > i_6_; i_6_++)
        {
            int i_7_ = Class68_Sub10.localNPCIndices[i_6_];
            NPC class1_sub6_sub1 = Class102.localNPCs[i_7_];
            if (class1_sub6_sub1 != null)
                Class51.method537(class1_sub6_sub1, 128, (((NPCDefinition) ((NPC) class1_sub6_sub1).definition).anInt1453));
        }
        if (i != 16986)
            method995(107);
    }

    static
    {
        aClass100_3050 = Class112.makeMutableString(43, "M");
        aBoolean3060 = false;
        anInt3048 = 0;
        aClass100_3065 = Class112.makeMutableString(43, "Wordpack geladen)3");
    }
}
