/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class88
{
    static int anInt1596;
    static int anInt1597;
    private int anInt1598;
    private int anInt1599;
    private NodeList aClass16_1600;
    static int anInt1601;
    private int anInt1602 = 0;
    private Class68_Sub6[] aClass68_Sub6Array1603;
    static int anInt1604;
    static int[] skillLevelMaxes = new int[25];
    private int anInt1606;
    private int[][][] anIntArrayArrayArray1607;
    static int anInt1608;
    static int anInt1609;
    static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array1610;
    static int anInt1611;
    boolean aBoolean1612;

    static final MutableString method1498(int i)
    {
        anInt1611++;
        MutableString class100 = Class72.aClass100_1302;
        if ((Class75_Sub3.location ^ 0xffffffff) != i)
            class100 = Class102.aClass100_1751;
        return (Class68_Sub20_Sub13_Sub2.method1166(i ^ ~0x2, (new MutableString[] { Class68_Sub24.aClass100_3161, class100, Class92.aClass100_1658, Class68_Sub13_Sub24.method816(Class68_Sub13_Sub27.language, 0), Class68_Sub20_Sub17.aClass100_4437, Class68_Sub13_Sub24.method816(Class68_Sub13_Sub20.anInt3782, 0), Class68_Sub13_Sub3.aClass100_3471 })));
    }

    public static void method1499(byte i)
    {
        if (i != 103)
            method1499((byte) -94);
        skillLevelMaxes = null;
        aClass68_Sub20_Sub10Array1610 = null;
    }

    static final Model method1500(int i, int i_0_, int i_1_, int i_2_, int i_3_, Model class1_sub3, int i_4_)
    {
        try
        {
            anInt1609++;
            long l = (long) i;
            Model class1_sub3_5_ = ((Model) Class68_Sub28_Sub2.aClass98_4546.getNodeForID(l));
            if (class1_sub3_5_ == null)
            {
                Class1_Sub4 class1_sub4 = Class1_Sub4.method115(Class120.aClass21_Sub1_2097, i, 0);
                if (class1_sub4 == null)
                    return null;
                class1_sub3_5_ = class1_sub4.method127(64, 768, -50, -10, -50);
                Class68_Sub28_Sub2.aClass98_4546.addObject(class1_sub3_5_, l);
            }
            int i_6_ = class1_sub3.method89();
            int i_7_ = class1_sub3.method84();
            int i_8_ = class1_sub3.method75();
            int i_9_ = class1_sub3.getHeight();
            class1_sub3_5_ = class1_sub3_5_.method81(true, true);
            if (i_2_ != 0)
                class1_sub3_5_.method90(i_2_);
            if (i_3_ != -10)
                return null;
            SpriteFactory class1_sub3_sub1 = (SpriteFactory) class1_sub3_5_;
            if (i_1_ != Player.fixZ(i_6_ + i_4_, GameSocket.plane, i_8_ + i_0_) || Player.fixZ(i_7_ + i_4_, GameSocket.plane, i_0_ + i_9_) != i_1_)
            {
                for (int i_10_ = 0; i_10_ < ((SpriteFactory) class1_sub3_sub1).anInt3357; i_10_++)
                    ((SpriteFactory) class1_sub3_sub1).anIntArray3336[i_10_] += Player.fixZ(((((SpriteFactory) class1_sub3_sub1).anIntArray3356[i_10_]) + i_4_), GameSocket.plane, ((((SpriteFactory) class1_sub3_sub1).anIntArray3345[i_10_]) + i_0_)) - i_1_;
                ((SpriteFactory) class1_sub3_sub1).aBoolean3347 = false;
            }
            return class1_sub3_5_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("of.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + (class1_sub3 != null ? "{...}" : "null") + ',' + i_4_ + ')'));
        }
    }

    final void method1501(int i)
    {
        anInt1597++;
        for (int i_11_ = i; anInt1598 > i_11_; i_11_++)
        {
            anIntArrayArrayArray1607[i_11_][0] = null;
            anIntArrayArrayArray1607[i_11_][1] = null;
            anIntArrayArrayArray1607[i_11_][2] = null;
            anIntArrayArrayArray1607[i_11_] = null;
        }
        aClass68_Sub6Array1603 = null;
        anIntArrayArrayArray1607 = null;
        aClass16_1600.method284(i ^ 0x69);
        aClass16_1600 = null;
    }

    final int[][] method1502(int i, byte i_12_)
    {
        int i_13_ = 96 % ((-65 - i_12_) / 33);
        anInt1596++;
        if (anInt1606 == anInt1598)
        {
            ((Class88) this).aBoolean1612 = aClass68_Sub6Array1603[i] == null;
            aClass68_Sub6Array1603[i] = Class68_Sub13_Sub21.aClass68_Sub6_3794;
            return anIntArrayArrayArray1607[i];
        }
        if (anInt1598 != 1)
        {
            Class68_Sub6 class68_sub6 = aClass68_Sub6Array1603[i];
            if (class68_sub6 != null)
                ((Class88) this).aBoolean1612 = false;
            else
            {
                ((Class88) this).aBoolean1612 = true;
                if (anInt1602 >= anInt1598)
                {
                    Class68_Sub6 class68_sub6_14_ = (Class68_Sub6) aClass16_1600.method289(30568);
                    class68_sub6 = new Class68_Sub6(i, (((Class68_Sub6) class68_sub6_14_).anInt2847));
                    aClass68_Sub6Array1603[(((Class68_Sub6) class68_sub6_14_).anInt2841)] = null;
                    class68_sub6_14_.unlink();
                } else
                {
                    class68_sub6 = new Class68_Sub6(i, anInt1602);
                    anInt1602++;
                }
                aClass68_Sub6Array1603[i] = class68_sub6;
            }
            aClass16_1600.method291((byte) 85, class68_sub6);
            return (anIntArrayArrayArray1607[((Class68_Sub6) class68_sub6).anInt2847]);
        }
        ((Class88) this).aBoolean1612 = anInt1599 != i;
        anInt1599 = i;
        return anIntArrayArrayArray1607[0];
    }

    final int[][][] method1503(byte i)
    {
        anInt1601++;
        if (anInt1606 != anInt1598)
            throw new RuntimeException("Can only retrieve a full image cache");
        if (i < 122)
            method1501(51);
        for (int i_15_ = 0; i_15_ < anInt1598; i_15_++)
            aClass68_Sub6Array1603[i_15_] = Class68_Sub13_Sub21.aClass68_Sub6_3794;
        return anIntArrayArrayArray1607;
    }

    Class88(int i, int i_16_, int i_17_)
    {
        anInt1599 = -1;
        aClass16_1600 = new NodeList();
        ((Class88) this).aBoolean1612 = false;
        anInt1598 = i;
        anInt1606 = i_16_;
        aClass68_Sub6Array1603 = new Class68_Sub6[anInt1606];
        anIntArrayArrayArray1607 = new int[anInt1598][3][i_17_];
    }

    static
    {
        anInt1604 = 0;
    }
}
