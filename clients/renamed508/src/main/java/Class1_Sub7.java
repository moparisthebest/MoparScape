/* Class1_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class1_Sub7 extends Animable
{
    static MutableString aClass100_2592 = Class112.makeMutableString(43, "Schlie-8en");
    static int anInt2593;
    private int anInt2594;
    static int anInt2595;
    static int anInt2596;
    private int anInt2597;
    private int anInt2598;
    static int anInt2599;
    private int anInt2600 = -1;
    private int anInt2601;
    static int anInt2602;
    static MutableString aClass100_2603;
    private int anInt2604;
    private int anInt2605;
    private int anInt2606;
    private Class92_Sub1 aClass92_Sub1_2607 = null;
    private int anInt2608;
    static int anInt2609;
    static int anInt2610;
    private int anInt2611;
    static int anInt2612;
    static MutableString aClass100_2613;
    static boolean members;
    private static MutableString aClass100_2615 = Class112.makeMutableString(43, "green:");
    private int anInt2616;
    static int anInt2617;
    static int anInt2618;
    private Animation aClass117_2619;
    static Class21 aClass21_2620;
    static int anInt2621;

    static final MutableString method165(int i, int i_0_)
    {
        if (i_0_ != -17516)
            return null;
        anInt2612++;
        return (Class68_Sub20_Sub13_Sub2.method1166(i_0_ ^ ~0x4469, (new MutableString[] { Class68_Sub13_Sub24.method816(0xff & i >> 24, 0), Class75_Sub3_Sub1.aClass100_4598, Class68_Sub13_Sub24.method816(0xff & i >> 16, 0), Class75_Sub3_Sub1.aClass100_4598, Class68_Sub13_Sub24.method816((0xffc7 & i) >> 8, 0), Class75_Sub3_Sub1.aClass100_4598, Class68_Sub13_Sub24.method816(i & 0xff, 0) })));
    }

    private final Animable method166(int i)
    {
        if (i != 675116226)
            return null;
        anInt2593++;
        return method167(false, 2);
    }

    private final Animable method167(boolean bool, int i)
    {
        anInt2610++;
        boolean bool_1_ = (Class74.anIntArrayArrayArray1335 != Class68_Sub20_Sub12.intGroundArray);
        ObjectDefinition class116 = Class1_Sub5.method140(i + 89, anInt2597);
        if (((ObjectDefinition) class116).childrenIDs != null)
            class116 = class116.method1716(i - 3);
        if (class116 == null)
            return null;
        int i_2_ = anInt2606 & 0x3;
        int i_3_;
        int i_4_;
        if (i_2_ == 1 || i_2_ == 3)
        {
            i_4_ = ((ObjectDefinition) class116).anInt1990;
            i_3_ = ((ObjectDefinition) class116).anInt1989;
        } else
        {
            i_3_ = ((ObjectDefinition) class116).anInt1990;
            i_4_ = ((ObjectDefinition) class116).anInt1989;
        }
        int i_5_ = anInt2611 + (i_3_ >> 1);
        int i_6_ = (i_4_ >> 1) + anInt2616;
        int i_7_ = anInt2611 + (i_3_ + 1 >> 1);
        int i_8_ = anInt2616 + (i_4_ + 1 >> 1);
        method171(i_5_ * 128, i_6_ * 128, (byte) -95);
        boolean bool_9_ = (!bool_1_ && ((ObjectDefinition) class116).aBoolean2020 && (anInt2600 != ((ObjectDefinition) class116).type || (anInt2605 != anInt2601 && Class68_Sub13_Sub26.anInt3878 >= 2)));
        if (bool && !bool_9_)
            return null;
        int[][] is = Class68_Sub20_Sub12.intGroundArray[anInt2598];
        int i_10_ = (anInt2611 << 7) + (i_3_ << 6);
        int i_11_ = (i_4_ << 6) + (anInt2616 << 7);
        boolean bool_12_ = aClass92_Sub1_2607 == null;
        int i_13_ = (is[i_7_][i_8_] + is[i_5_][i_8_] + (is[i_5_][i_6_] + is[i_7_][i_6_]) >> 2);
        int[][] is_14_ = null;
        if (!bool_1_)
        {
            if (anInt2598 < 3)
                is_14_ = (Class68_Sub20_Sub12.intGroundArray[anInt2598 + 1]);
        } else
            is_14_ = Class74.anIntArrayArrayArray1335[0];
        Class44 class44;
        if (aClass117_2619 != null)
            class44 = class116.method1720((!bool_12_ ? aClass92_Sub1_2607 : (Class68_Sub20_Sub16.aClass92_Sub1_4427)), aClass117_2619, bool_9_, i_10_, i_13_, anInt2605, anInt2606, is_14_, is, 65535, i_11_, anInt2604);
        else
            class44 = class116.method1708(anInt2604, (!bool_12_ ? aClass92_Sub1_2607 : (Class68_Sub20_Sub16.aClass92_Sub1_4427)), bool_9_, (byte) -10, false, i_13_, anInt2606, is, i_11_, is_14_, i_10_);
        if (i != 2)
            method171(13, 52, (byte) -73);
        if (class44 == null)
            return null;
        return ((Class44) class44).aClass1_746;
    }

    public static void method168(int i)
    {
        aClass100_2613 = null;
        aClass100_2615 = null;
        aClass100_2603 = null;
        aClass100_2592 = null;
        aClass21_2620 = null;
        if (i > -44)
            method168(-90);
    }

    static final void method169(int i, int i_15_, int i_16_, int i_17_, Animable class1, long l, Animable class1_18_, Animable class1_19_)
    {
        Object4 class57 = new Object4();
        ((Object4) class57).aClass1_1083 = class1;
        ((Object4) class57).anInt1074 = i_15_ * 128 + 64;
        ((Object4) class57).anInt1075 = i_16_ * 128 + 64;
        ((Object4) class57).anInt1085 = i_17_;
        ((Object4) class57).uid = l;
        ((Object4) class57).aClass1_1073 = class1_18_;
        ((Object4) class57).aClass1_1078 = class1_19_;
        int i_20_ = 0;
        Ground class68_sub1 = Class22.groundArray[i][i_15_][i_16_];
        if (class68_sub1 != null)
        {
            for (int i_21_ = 0; i_21_ < ((Ground) class68_sub1).anInt2773; i_21_++)
            {
                Object5 class69 = ((Ground) class68_sub1).object_5[i_21_];
                if ((((Object5) class69).uid & 0x400000L) == 4194304L)
                {
                    int i_22_ = ((Object5) class69).aClass1_1242.method56();
                    if (i_22_ != -32768 && i_22_ < i_20_)
                        i_20_ = i_22_;
                }
            }
        }
        ((Object4) class57).anInt1069 = -i_20_;
        if (Class22.groundArray[i][i_15_][i_16_] == null)
            Class22.groundArray[i][i_15_][i_16_] = new Ground(i, i_15_, i_16_);
        ((Ground) (Class22.groundArray[i][i_15_][i_16_])).object_4 = class57;
    }

    static final void method170(int i)
    {
        if (i != 255)
            aClass21_2620 = null;
        anInt2595++;
        if (Class33.mouse != null)
        {
            synchronized (Class33.mouse)
            {
                Class33.mouse = null;
            }
        }
    }

    final int method56()
    {
        anInt2602++;
        return anInt2594;
    }

    final void render(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, long l)
    {
        Animable class1 = method166(675116226);
        anInt2609++;
        if (class1 != null)
        {
            class1.render(i, i_23_, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_, l);
            anInt2594 = class1.method56();
        }
    }

    final void method60(int i, int i_30_, int i_31_, int i_32_, int i_33_)
    {
        anInt2596++;
        method171(128 * ((i_33_ - i_30_ >> 1) + i_30_) + 64, (i_32_ + (i - i_32_ >> 1)) * 128 + 64, (byte) -59);
        if (i_31_ < 96)
            anInt2606 = 5;
    }

    private final void method171(int i, int i_34_, byte i_35_)
    {
        anInt2617++;
        if (aClass117_2619 != null)
        {
            int i_36_ = Class68_Sub3.loopCycle - anInt2608;
            if (i_36_ > 100 && ((Animation) aClass117_2619).anInt2074 > 0)
            {
                int i_37_;
                for (i_37_ = (((Animation) aClass117_2619).anIntArray2037.length - ((Animation) aClass117_2619).anInt2074); anInt2605 < i_37_ && i_36_ > (((Animation) aClass117_2619).anIntArray2060[anInt2605]); anInt2605++)
                    i_36_ -= (((Animation) aClass117_2619).anIntArray2060[anInt2605]);
                if (anInt2605 >= i_37_)
                {
                    int i_38_ = 0;
                    for (int i_39_ = i_37_; (((Animation) aClass117_2619).anIntArray2037.length > i_39_); i_39_++)
                        i_38_ += (((Animation) aClass117_2619).anIntArray2060[i_39_]);
                    i_36_ %= i_38_;
                }
            }
            while (i_36_ > ((Animation) aClass117_2619).anIntArray2060[anInt2605])
            {
                Class44.method489(false, anInt2605, i, aClass117_2619, false, i_34_);
                i_36_ -= ((Animation) aClass117_2619).anIntArray2060[anInt2605];
                anInt2605++;
                if (anInt2605 >= ((Animation) aClass117_2619).anIntArray2037.length)
                {
                    anInt2605 -= ((Animation) aClass117_2619).anInt2074;
                    if (anInt2605 < 0 || (((Animation) aClass117_2619).anIntArray2037.length <= anInt2605))
                    {
                        aClass117_2619 = null;
                        break;
                    }
                }
            }
            anInt2608 = Class68_Sub3.loopCycle - i_36_;
        }
        if (i_35_ >= -25)
            anInt2600 = 24;
    }

    Class1_Sub7(int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, boolean bool, Animable class1)
    {
        anInt2601 = -1;
        anInt2594 = -32768;
        do
        {
            try
            {
                anInt2611 = i_43_;
                anInt2616 = i_44_;
                anInt2604 = i_40_;
                anInt2598 = i_42_;
                anInt2597 = i;
                anInt2606 = i_41_;
                if (i_45_ == -1)
                    break;
                aClass117_2619 = Object1.getAnimation(i_45_);
                anInt2608 = Class68_Sub3.loopCycle - 1;
                anInt2605 = 0;
                if (((Animation) aClass117_2619).anInt2063 == 0 && class1 != null && class1 instanceof Class1_Sub7)
                {
                    Class1_Sub7 class1_sub7_46_ = (Class1_Sub7) class1;
                    if (class1_sub7_46_.aClass117_2619 == aClass117_2619)
                    {
                        anInt2605 = class1_sub7_46_.anInt2605;
                        anInt2608 = class1_sub7_46_.anInt2608;
                        break;
                    }
                }
                if (!bool || ((Animation) aClass117_2619).anInt2074 == -1)
                    break;
                anInt2605 = (int) ((double) (((Animation) aClass117_2619).anIntArray2037).length * Math.random());
                anInt2608 -= (int) (Math.random() * (double) (((Animation) aClass117_2619).anIntArray2060[anInt2605]));
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("vc.<init>(" + i + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ',' + bool + ',' + (class1 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static
    {
        members = false;
        aClass100_2613 = aClass100_2615;
        aClass100_2603 = aClass100_2615;
        anInt2599 = 0;
    }
}
