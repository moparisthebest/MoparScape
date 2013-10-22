/* Class68_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Ground extends Node
{
    static MutableString[] aClass100Array2756 = new MutableString[200];
    static Stream[] aClass68_Sub14Array2757 = new Stream[2048];
    static int anInt2758;
    Object1 object_1;
    Class7 aClass7_2760;
    Object4 object_4;
    static int anInt2762;
    static MutableString aClass100_2763 = Class112.makeMutableString(43, "Cabbage");
    static int anInt2764;
    int y;
    Object2 object_2;
    int plane_1;
    int[] modifiers;
    int plane_2;
    int anInt2770;
    boolean aBoolean2771;
    boolean aBoolean2772;
    int anInt2773;
    Object5[] object_5 = new Object5[5];
    int anInt2775;
    int anInt2776;
    static int anInt2777;
    int anInt2778;
    Object3 object_3;
    int anInt2780;
    Class77 aClass77_2781;
    Ground aClass68_Sub1_2782;
    boolean aBoolean2783;
    int x;

    static final void method648(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_)
    {
        if (i_2_ == 0)
        {
            Class7 class7 = new Class7(i_9_, i_10_, i_11_, i_12_, -1, i_17_, false);
            for (int i_19_ = i; i_19_ >= 0; i_19_--)
            {
                if (Class22.groundArray[i_19_][i_0_][i_1_] == null)
                    Class22.groundArray[i_19_][i_0_][i_1_] = new Ground(i_19_, i_0_, i_1_);
            }
            ((Ground) (Class22.groundArray[i][i_0_][i_1_])).aClass7_2760 = class7;
        } else if (i_2_ == 1)
        {
            Class7 class7 = new Class7(i_13_, i_14_, i_15_, i_16_, i_4_, i_18_, i_5_ == i_6_ && i_5_ == i_7_ && i_5_ == i_8_);
            for (int i_20_ = i; i_20_ >= 0; i_20_--)
            {
                if (Class22.groundArray[i_20_][i_0_][i_1_] == null)
                    Class22.groundArray[i_20_][i_0_][i_1_] = new Ground(i_20_, i_0_, i_1_);
            }
            ((Ground) (Class22.groundArray[i][i_0_][i_1_])).aClass7_2760 = class7;
        } else
        {
            Class77 class77 = new Class77(i_2_, i_3_, i_4_, i_0_, i_1_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_);
            for (int i_21_ = i; i_21_ >= 0; i_21_--)
            {
                if (Class22.groundArray[i_21_][i_0_][i_1_] == null)
                    Class22.groundArray[i_21_][i_0_][i_1_] = new Ground(i_21_, i_0_, i_1_);
            }
            ((Ground) (Class22.groundArray[i][i_0_][i_1_])).aClass77_2781 = class77;
        }
    }

    Ground(int _plane, int _x, int _y)
    {
        ((Ground) this).modifiers = new int[5];
        ((Ground) this).anInt2770 = 0;
        ((Ground) this).x = _y;
        ((Ground) this).y = _x;
        ((Ground) this).plane_1 = ((Ground) this).plane_2 = _plane;
    }

    public static void method649(int i)
    {
        aClass100Array2756 = null;
        aClass100_2763 = null;
        if (i == 0)
            aClass68_Sub14Array2757 = null;
    }
}
