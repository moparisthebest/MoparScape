/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101
{
    static int anInt1739;
    static MutableString aClass100_1740 = Class112.makeMutableString(43, "blinken2:");
    static int anInt1741;
    static MutableString aClass100_1742 = Class112.makeMutableString(43, "weiss:");
    static int anInt1743;
    static MutableString aClass100_1744;
    static MutableString aClass100_1745;
    static int anInt1746 = (int) (33.0 * Math.random()) - 16;
    static int anInt1747;

    public static void method1630(int i)
    {
        aClass100_1742 = null;
        aClass100_1740 = null;
        aClass100_1745 = null;
        if (i != -31601)
            aClass100_1744 = null;
        aClass100_1744 = null;
    }

    static final void method1631(int i, int i_0_, NPC class1_sub6_sub1, int i_1_)
    {
        try
        {
            if (i == 0)
            {
                if (((Character) class1_sub6_sub1).animationID == i_0_ && i_0_ != -1)
                {
                    Animation class117 = Object1.getAnimation(i_0_);
                    int i_2_ = ((Animation) class117).anInt2063;
                    if (i_2_ == 1)
                    {
                        ((Character) class1_sub6_sub1).anInt2524 = 0;
                        ((Character) class1_sub6_sub1).anInt2547 = i_1_;
                        ((Character) class1_sub6_sub1).anInt2551 = 0;
                        ((Character) class1_sub6_sub1).anInt2558 = 0;
                        Class44.method489(false, ((Character) class1_sub6_sub1).anInt2524, ((Character) class1_sub6_sub1).x, class117, false, ((Character) class1_sub6_sub1).y);
                    }
                    if (i_2_ == 2)
                        ((Character) class1_sub6_sub1).anInt2551 = 0;
                } else if (i_0_ == -1 || ((Character) class1_sub6_sub1).animationID == -1 || (((Animation) Object1.getAnimation(i_0_)).anInt2053 >= (((Animation) Object1.getAnimation((((Character) class1_sub6_sub1).animationID))).anInt2053)))
                {
                    ((Character) class1_sub6_sub1).anInt2559 = ((Character) class1_sub6_sub1).walkQueueLength;
                    ((Character) class1_sub6_sub1).anInt2551 = 0;
                    ((Character) class1_sub6_sub1).anInt2524 = 0;
                    ((Character) class1_sub6_sub1).animationID = i_0_;
                    ((Character) class1_sub6_sub1).anInt2547 = i_1_;
                    ((Character) class1_sub6_sub1).anInt2558 = 0;
                    if (((Character) class1_sub6_sub1).animationID != -1)
                        Class44.method489(false, ((Character) class1_sub6_sub1).anInt2524, ((Character) class1_sub6_sub1).x, Object1.getAnimation(((Character) class1_sub6_sub1).animationID), false, ((Character) class1_sub6_sub1).y);
                }
                anInt1741++;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("rc.B(" + i + ',' + i_0_ + ',' + (class1_sub6_sub1 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
        }
    }

    static
    {
        aClass100_1744 = Class112.makeMutableString(43, "loc");
        anInt1747 = -1;
        aClass100_1745 = Class112.makeMutableString(43, "<br>(X100(U(Y");
    }
}
