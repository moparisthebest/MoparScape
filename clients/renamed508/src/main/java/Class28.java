/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class28
{
    static int anInt524;
    static int anInt525;
    static int anInt526;
    static int anInt527;
    static Class21 aClass21_528;
    static Class21_Sub1 aClass21_Sub1_529;
    static int anInt530;
    static Class21 aClass21_531;
    static int anInt532;
    static int anInt533;

    static final void method392(int i, int i_0_, Class93[] class93s, int i_1_)
    {
        do
        {
            try
            {
                if (i_0_ != -228)
                    aClass21_528 = null;
                anInt533++;
                if (i_1_ >= i)
                    break;
                int i_2_ = i_1_ - 1;
                int i_3_ = i + 1;
                int i_4_ = (i_1_ + i) / 2;
                Class93 class93 = class93s[i_4_];
                class93s[i_4_] = class93s[i_1_];
                class93s[i_1_] = class93;
                while (i_3_ > i_2_)
                {
                    boolean bool = true;
                    do
                    {
                        i_3_--;
                        for (int i_5_ = 0; i_5_ < 4; i_5_++)
                        {
                            int i_6_;
                            int i_7_;
                            if (Class68_Sub13_Sub26_Sub1.anIntArray4611[i_5_] != 2)
                            {
                                if ((Class68_Sub13_Sub26_Sub1.anIntArray4611[i_5_]) != 1)
                                {
                                    if ((Class68_Sub13_Sub26_Sub1.anIntArray4611[i_5_]) != 3)
                                    {
                                        i_6_ = (((Class93) class93s[i_3_]).anInt1666);
                                        i_7_ = ((Class93) class93).anInt1666;
                                    } else
                                    {
                                        i_7_ = (((Class93) class93).aBoolean1663 ? 1 : 0);
                                        i_6_ = !(((Class93) class93s[i_3_]).aBoolean1663) ? 0 : 1;
                                    }
                                } else
                                {
                                    i_6_ = ((Class93) class93s[i_3_]).anInt1667;
                                    if (i_6_ == -1 && Class51.anIntArray2259[i_5_] == 1)
                                        i_6_ = 2001;
                                    i_7_ = ((Class93) class93).anInt1667;
                                    if (i_7_ == -1 && Class51.anIntArray2259[i_5_] == 1)
                                        i_7_ = 2001;
                                }
                            } else
                            {
                                i_6_ = ((Class93) class93s[i_3_]).anInt1665;
                                i_7_ = ((Class93) class93).anInt1665;
                            }
                            if (i_6_ == i_7_)
                            {
                                if (i_5_ == 3)
                                    bool = false;
                            } else
                            {
                                if ((Class51.anIntArray2259[i_5_] != 1 || i_7_ >= i_6_) && (Class51.anIntArray2259[i_5_] != 0 || i_7_ <= i_6_))
                                    bool = false;
                                break;
                            }
                        }
                    } while (bool);
                    bool = true;
                    do
                    {
                        i_2_++;
                        for (int i_8_ = 0; i_8_ < 4; i_8_++)
                        {
                            int i_9_;
                            int i_10_;
                            if (Class68_Sub13_Sub26_Sub1.anIntArray4611[i_8_] == 2)
                            {
                                i_9_ = ((Class93) class93s[i_2_]).anInt1665;
                                i_10_ = ((Class93) class93).anInt1665;
                            } else if ((Class68_Sub13_Sub26_Sub1.anIntArray4611[i_8_]) == 1)
                            {
                                i_9_ = ((Class93) class93s[i_2_]).anInt1667;
                                i_10_ = ((Class93) class93).anInt1667;
                                if (i_10_ == -1 && Class51.anIntArray2259[i_8_] == 1)
                                    i_10_ = 2001;
                                if (i_9_ == -1 && Class51.anIntArray2259[i_8_] == 1)
                                    i_9_ = 2001;
                            } else if ((Class68_Sub13_Sub26_Sub1.anIntArray4611[i_8_]) == 3)
                            {
                                i_9_ = (!((Class93) class93s[i_2_]).aBoolean1663 ? 0 : 1);
                                i_10_ = (!((Class93) class93).aBoolean1663 ? 0 : 1);
                            } else
                            {
                                i_10_ = ((Class93) class93).anInt1666;
                                i_9_ = ((Class93) class93s[i_2_]).anInt1666;
                            }
                            if (i_10_ != i_9_)
                            {
                                if ((Class51.anIntArray2259[i_8_] != 1 || i_10_ <= i_9_) && (Class51.anIntArray2259[i_8_] != 0 || i_9_ <= i_10_))
                                    bool = false;
                                break;
                            }
                            if (i_8_ == 3)
                                bool = false;
                        }
                    } while (bool);
                    if (i_3_ > i_2_)
                    {
                        Class93 class93_11_ = class93s[i_2_];
                        class93s[i_2_] = class93s[i_3_];
                        class93s[i_3_] = class93_11_;
                    }
                }
                method392(i_3_, -228, class93s, i_1_);
                method392(i, -228, class93s, i_3_ + 1);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("e.H(" + i + ',' + i_0_ + ',' + (class93s != null ? "{...}" : "null") + ',' + i_1_ + ')'));
            }
            break;
        } while (false);
    }

    static final void method393(int i, boolean bool)
    {
        if (bool != true)
            aClass21_531 = null;
        anInt525++;
        Class93.aClass98_1664.method1570(-18767, i);
        Class7.aClass98_124.method1570(-18767, i);
        Class96.aClass98_1696.method1570(-18767, i);
    }

    static final void method394(byte i, int i_12_)
    {
        anInt524++;
        if (i != -117)
            method397(-42, 32, -2, -81, 42, 107, -83);
        Class68_Sub20_Sub9 class68_sub20_sub9 = Class68_Sub13_Sub26_Sub1.method835(i_12_, 1, (byte) -128);
        class68_sub20_sub9.method1101((byte) -50);
    }

    static final void method395(byte i, Class21 class21)
    {
        try
        {
            int i_13_ = 95 / ((-64 - i) / 32);
            Class17.anInt279 = class21.getIndex(GameApplet.aClass100_36, (byte) -98);
            Class68_Sub13_Sub14.anInt3672 = class21.getIndex(Object3.aClass100_935, (byte) -82);
            anInt526++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("e.I(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    static final Class72 method396(Component component, int i, int i_14_, int i_15_)
    {
        try
        {
            anInt527++;
            try
            {
                Class var_class = Class.forName("Class72_Sub2");
                Class72 class72 = (Class72) var_class.newInstance();
                if (i_15_ >= -12)
                    method393(-53, false);
                class72.method1356(component, i, -121, i_14_);
                return class72;
            } catch (Throwable throwable)
            {
                Class72_Sub1 class72_sub1 = new Class72_Sub1();
                class72_sub1.method1356(component, i, -127, i_14_);
                return class72_sub1;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("e.B(" + (component != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ',' + i_15_ + ')'));
        }
    }

    static final void method397(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_)
    {
        Class8 class8 = new Class8();
        ((Class8) class8).anInt146 = i_16_ / 128;
        ((Class8) class8).anInt149 = i_17_ / 128;
        ((Class8) class8).anInt145 = i_18_ / 128;
        ((Class8) class8).anInt156 = i_19_ / 128;
        ((Class8) class8).anInt142 = i;
        ((Class8) class8).anInt159 = i_16_;
        ((Class8) class8).anInt162 = i_17_;
        ((Class8) class8).anInt148 = i_18_;
        ((Class8) class8).anInt147 = i_19_;
        ((Class8) class8).anInt152 = i_20_;
        ((Class8) class8).anInt150 = i_21_;
        Class121.aClass8Array2104[Class54.anInt1029++] = class8;
    }

    static final boolean method398(int i)
    {
        if (i != 24781)
            aClass21_Sub1_529 = null;
        anInt532++;
        return Class23.aBoolean501;
    }

    static final void method399(int i, int i_22_, int i_23_)
    {
        anInt530++;
        if (Class68_Sub13_Sub21.menuOptionsCount >= 2 || Class68_Sub13_Sub37.anInt4064 != 0 || Class21_Sub1.aBoolean2707)
        {
            if (i <= 22)
                aClass21_528 = null;
            MutableString class100;
            if (Class68_Sub13_Sub37.anInt4064 == 1 && Class68_Sub13_Sub21.menuOptionsCount < 2)
                class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Object2.aClass100_1347, Class51.aClass100_2260, Class44.aClass100_743, Class52.aClass100_1002 }));
            else if (!Class21_Sub1.aBoolean2707 || Class68_Sub13_Sub21.menuOptionsCount >= 2)
                class100 = Class58.method579((byte) -99, Class68_Sub13_Sub21.menuOptionsCount - 1);
            else
                class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class7.aClass100_118, Class51.aClass100_2260, Class68_Sub13_Sub1.aClass100_3454, Class52.aClass100_1002 }));
            if (Class68_Sub13_Sub21.menuOptionsCount > 2)
                class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100, Class109.aClass100_1836, Class68_Sub13_Sub24.method816((Class68_Sub13_Sub21.menuOptionsCount) - 2, 0), Class7.aClass100_137 })));
            int i_24_ = (Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1035(class100, i_23_ + 4, i_22_ + 15, 16777215, 0, Class68_Sub13_Sub26.aRandom3875, Class68_Sub13_Sub4.anInt3511));
            Class127.method1787(i_23_ + 4, i_22_, Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1029(class100) + i_24_, 15, (byte) -112);
        }
    }

    public static void method400(int i)
    {
        aClass21_531 = null;
        aClass21_528 = null;
        if (i != -1)
            aClass21_Sub1_529 = null;
        aClass21_Sub1_529 = null;
    }
}
