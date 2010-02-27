/* Class68_Sub20_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub5 extends NodeSub
{
    static int anInt4222 = 0;
    static Class21_Sub1 aClass21_Sub1_4223;
    Class1_Sub5 aClass1_Sub5_4224;
    static MutableString aClass100_4225;
    static int anInt4226;
    static int anInt4227;
    static int anInt4228 = 0;
    static int anInt4229;
    static MutableString aClass100_4230;
    static int anInt4231;

    Class68_Sub20_Sub5(Class1_Sub5 class1_sub5)
    {
        try
        {
            ((Class68_Sub20_Sub5) this).aClass1_Sub5_4224 = class1_sub5;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ec.<init>(" + (class1_sub5 != null ? "{...}" : "null") + ')');
        }
    }

    static final void method1062(Animable class1, int i, int i_0_, int i_1_)
    {
        if (i_0_ < GameApplet.anInt7)
        {
            Ground class68_sub1 = Class22.groundArray[i][i_0_ + 1][i_1_];
            if (class68_sub1 != null && ((Ground) class68_sub1).object_3 != null && ((Object3) ((Ground) class68_sub1).object_3).aClass1_931.method58())
                class1.method52(((Object3) (((Ground) class68_sub1).object_3)).aClass1_931, 128, 0, 0, true);
        }
        if (i_1_ < GameApplet.anInt7)
        {
            Ground class68_sub1 = Class22.groundArray[i][i_0_][i_1_ + 1];
            if (class68_sub1 != null && ((Ground) class68_sub1).object_3 != null && ((Object3) ((Ground) class68_sub1).object_3).aClass1_931.method58())
                class1.method52(((Object3) (((Ground) class68_sub1).object_3)).aClass1_931, 0, 0, 128, true);
        }
        if (i_0_ < GameApplet.anInt7 && i_1_ < Class97.anInt1716)
        {
            Ground class68_sub1 = (Class22.groundArray[i][i_0_ + 1][i_1_ + 1]);
            if (class68_sub1 != null && ((Ground) class68_sub1).object_3 != null && ((Object3) ((Ground) class68_sub1).object_3).aClass1_931.method58())
                class1.method52(((Object3) (((Ground) class68_sub1).object_3)).aClass1_931, 128, 0, 128, true);
        }
        if (i_0_ < GameApplet.anInt7 && i_1_ > 0)
        {
            Ground class68_sub1 = (Class22.groundArray[i][i_0_ + 1][i_1_ - 1]);
            if (class68_sub1 != null && ((Ground) class68_sub1).object_3 != null && ((Object3) ((Ground) class68_sub1).object_3).aClass1_931.method58())
                class1.method52(((Object3) (((Ground) class68_sub1).object_3)).aClass1_931, 128, 0, -128, true);
        }
    }

    public static void method1063(int i)
    {
        int i_2_ = 117 % ((-51 - i) / 42);
        aClass100_4225 = null;
        aClass21_Sub1_4223 = null;
        aClass100_4230 = null;
    }

    static
    {
        aClass100_4225 = Class112.makeMutableString(43, "_");
        anInt4227 = 0;
        anInt4231 = 0;
        aClass100_4230 = (Class112.makeMutableString(43, "Clientscript error )2 check log for details"));
    }
}
