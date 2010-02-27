/* Class68_Sub13_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub6 extends Class68_Sub13
{
    static int anInt3525;
    static MutableString[] aClass100Array3526;
    static int anInt3527;
    private static MutableString aClass100_3528;
    static int anInt3529;
    private static MutableString aClass100_3530;
    private static MutableString aClass100_3531 = Class112.makeMutableString(43, "Feb");
    private static MutableString aClass100_3532;
    static int anInt3533;
    static int anInt3534;
    private static MutableString aClass100_3535;
    private static MutableString aClass100_3536;
    static int anInt3537;
    private static MutableString aClass100_3538;
    private static MutableString aClass100_3539;
    private static MutableString aClass100_3540;
    private static MutableString aClass100_3541;
    static int anInt3542;
    private static MutableString aClass100_3543;
    private boolean aBoolean3544;
    private static MutableString aClass100_3545;
    private int anInt3546 = 4096;

    static final MutableString method720(int i, int i_0_)
    {
        anInt3537++;
        if (i_0_ != -1)
            method724(43, -92, 110);
        if (i < 999999999)
            return Class68_Sub13_Sub24.method816(i, 0);
        return Class13_Sub1.aClass100_2637;
    }

    static final Class68_Sub20_Sub10[] method721(int i)
    {
        anInt3533++;
        Class68_Sub20_Sub10[] class68_sub20_sub10s = new Class68_Sub20_Sub10[Stream.anInt3009];
        int i_1_ = 0;
        if (i != -21477)
            aClass100_3543 = null;
        for (/**/; Stream.anInt3009 > i_1_; i_1_++)
        {
            int i_2_ = (Class68_Sub13_Sub19.anIntArray3759[i_1_] * Class68_Sub13_Sub12.anIntArray3641[i_1_]);
            byte[] is = Object5.aByteArrayArray1240[i_1_];
            int[] is_3_ = new int[i_2_];
            for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
                is_3_[i_4_] = (Class68_Sub13_Sub17.anIntArray3721[Class120.method1746(is[i_4_], 255)]);
            class68_sub20_sub10s[i_1_] = (new Sprite(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[i_1_], ObjectDefinition.anIntArray1998[i_1_], Class68_Sub13_Sub12.anIntArray3641[i_1_], Class68_Sub13_Sub19.anIntArray3759[i_1_], is_3_));
        }
        Class87.method1493((byte) -93);
        return class68_sub20_sub10s;
    }

    final void method700(Stream class68_sub14, int i, int i_5_)
    {
        try
        {
            if (i_5_ != -1)
                aClass100_3528 = null;
            int i_6_ = i;
            do
            {
                if (i_6_ != 0)
                {
                    if (i_6_ != 1)
                        break;
                } else
                {
                    anInt3546 = class68_sub14.readUShort();
                    break;
                }
                aBoolean3544 = class68_sub14.readUByte() == 1;
            } while (false);
            anInt3525++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ea.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ')'));
        }
    }

    public static void method722(byte i)
    {
        aClass100_3535 = null;
        aClass100_3545 = null;
        aClass100_3541 = null;
        aClass100_3536 = null;
        aClass100Array3526 = null;
        aClass100_3539 = null;
        aClass100_3543 = null;
        aClass100_3532 = null;
        aClass100_3531 = null;
        aClass100_3528 = null;
        aClass100_3540 = null;
        aClass100_3530 = null;
        aClass100_3538 = null;
        if (i != 126)
            method724(69, 68, 57);
    }

    static final void method723(byte i, int i_7_, Class68_Sub20_Sub1 class68_sub20_sub1, Class68_Sub20_Sub1 class68_sub20_sub1_8_, int i_9_, int i_10_, int i_11_, Widget class45)
    {
        do
        {
            try
            {
                anInt3542++;
                Class50.anInt990 = i_9_;
                Class68_Sub24.anInt3160 = i_7_;
                Class68_Sub13_Sub18.anInt3736 = i_11_;
                Class68_Sub8.anInt2869 = i_10_;
                Class59.aClass45_1101 = class45;
                if (Object2.aClass52_1354 == null)
                {
                    Class1_Sub1.aBoolean2416 = true;
                    if (Class109.aClass68_Sub20_Sub10Array1842 == null)
                        Class109.aClass68_Sub20_Sub10Array1842 = (Class68_Sub13_Sub16.method775(Class52.aClass21_Sub1_1011, 0, Object5.anInt1248, (byte) 13));
                    if (Class52.aClass92Array1004 == null)
                        Class52.aClass92Array1004 = Class13_Sub1.method248((Class52.aClass21_Sub1_1011), 0, false, Class1_Sub5.anInt2516);
                    if (Item.aClass92Array2444 == null)
                        Item.aClass92Array2444 = Class13_Sub1.method248((Class52.aClass21_Sub1_1011), 0, false, (Class68_Sub20_Sub3.anInt4212));
                    if (Class34.aClass92Array593 == null)
                        Class34.aClass92Array593 = Class13_Sub1.method248((Class52.aClass21_Sub1_1011), 0, false, (Class68_Sub13_Sub27.anInt3913));
                    int i_12_ = 4 * (Class50.anInt990 / 5);
                    int i_13_ = Class50.anInt990 / 5;
                    if (i != -38)
                        aClass100_3530 = null;
                    Class79.method1441(Class68_Sub13_Sub18.anInt3736, Class68_Sub24.anInt3160, Class50.anInt990, Class68_Sub8.anInt2869, 0, 168);
                    Class79.method1443(Class68_Sub13_Sub18.anInt3736, Class68_Sub24.anInt3160, i_13_, 23, 12425273, 9135624);
                    Class79.method1443(Class68_Sub13_Sub18.anInt3736 + i_13_, Class68_Sub24.anInt3160, i_12_, 23, 5197647, 2697513);
                    class68_sub20_sub1.method1032(Character.aClass100_2575, (i_13_ / 2 + (Class68_Sub13_Sub18.anInt3736)), Class68_Sub24.anInt3160 + 15, 0, -1);
                    if (Class34.aClass92Array593 != null)
                    {
                        Class34.aClass92Array593[1].method1533(Class68_Sub13_Sub18.anInt3736 + 2 + i_13_, Class68_Sub24.anInt3160 + 1);
                        class68_sub20_sub1_8_.method1030(Class118.aClass100_2085, i_13_ + (Class68_Sub13_Sub18.anInt3736 + 12), Class68_Sub24.anInt3160 + 10, 16777215, -1);
                        Class34.aClass92Array593[0].method1533(Class68_Sub13_Sub18.anInt3736 + i_13_ + 2, Class68_Sub24.anInt3160 + 12);
                        class68_sub20_sub1_8_.method1030(Class71.aClass100_1289, i_13_ + 12 + Class68_Sub13_Sub18.anInt3736, Class68_Sub24.anInt3160 + 21, 16777215, -1);
                    }
                    if (Item.aClass92Array2444 != null)
                    {
                        int i_14_ = Class68_Sub13_Sub18.anInt3736 + i_13_ + 140;
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4611[0] == 0 && Class51.anIntArray2259[0] == 0)
                            Item.aClass92Array2444[2].method1533(i_14_, Class68_Sub24.anInt3160 + 4);
                        else
                            Item.aClass92Array2444[0].method1533(i_14_, Class68_Sub24.anInt3160 + 4);
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4611[0] == 0 && Class51.anIntArray2259[0] == 1)
                            Item.aClass92Array2444[3].method1533(i_14_ + 15, Class68_Sub24.anInt3160 + 4);
                        else
                            Item.aClass92Array2444[1].method1533(i_14_ + 15, Class68_Sub24.anInt3160 + 4);
                        class68_sub20_sub1.method1030(Login.aClass100_1509, i_14_ + 32, (Class68_Sub24.anInt3160 + 17), 16777215, -1);
                        int i_15_ = Class68_Sub13_Sub18.anInt3736 - (-i_13_ - 250);
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4611[0] != 1 || Class51.anIntArray2259[0] != 0)
                            Item.aClass92Array2444[0].method1533(i_15_, Class68_Sub24.anInt3160 + 4);
                        else
                            Item.aClass92Array2444[2].method1533(i_15_, Class68_Sub24.anInt3160 + 4);
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4611[0] != 1 || Class51.anIntArray2259[0] != 1)
                            Item.aClass92Array2444[1].method1533(i_15_ + 15, Class68_Sub24.anInt3160 + 4);
                        else
                            Item.aClass92Array2444[3].method1533(i_15_ + 15, Class68_Sub24.anInt3160 + 4);
                        class68_sub20_sub1.method1030(Class85.aClass100_1561, i_15_ + 32, (Class68_Sub24.anInt3160 + 17), 16777215, -1);
                        int i_16_ = Class68_Sub13_Sub18.anInt3736 + i_13_ + 360;
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4611[0] == 2 && Class51.anIntArray2259[0] == 0)
                            Item.aClass92Array2444[2].method1533(i_16_, Class68_Sub24.anInt3160 + 4);
                        else
                            Item.aClass92Array2444[0].method1533(i_16_, Class68_Sub24.anInt3160 + 4);
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4611[0] == 2 && Class51.anIntArray2259[0] == 1)
                            Item.aClass92Array2444[3].method1533(i_16_ + 15, Class68_Sub24.anInt3160 + 4);
                        else
                            Item.aClass92Array2444[1].method1533(i_16_ + 15, Class68_Sub24.anInt3160 + 4);
                        class68_sub20_sub1.method1030(Class1_Sub1.aClass100_2407, i_16_ + 32, Class68_Sub24.anInt3160 + 17, 16777215, -1);
                        int i_17_ = Class68_Sub13_Sub18.anInt3736 + 470 + i_13_;
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4611[0] == 3 && Class51.anIntArray2259[0] == 0)
                            Item.aClass92Array2444[2].method1533(i_17_, Class68_Sub24.anInt3160 + 4);
                        else
                            Item.aClass92Array2444[0].method1533(i_17_, Class68_Sub24.anInt3160 + 4);
                        if (Class68_Sub13_Sub26_Sub1.anIntArray4611[0] != 3 || Class51.anIntArray2259[0] != 1)
                            Item.aClass92Array2444[1].method1533(i_17_ + 15, Class68_Sub24.anInt3160 + 4);
                        else
                            Item.aClass92Array2444[3].method1533(i_17_ + 15, Class68_Sub24.anInt3160 + 4);
                        class68_sub20_sub1.method1030(ClientScript.aClass100_4378, i_17_ + 32, Class68_Sub24.anInt3160 + 17, 16777215, -1);
                    }
                    Class79.method1445(Class50.anInt990 - 58 - 10, Class68_Sub24.anInt3160 + 4, 58, 16, 0);
                    Class68_Sub13_Sub36.anInt4039 = -1;
                    if (Class109.aClass68_Sub20_Sub10Array1842 == null)
                        break;
                    int i_18_ = 88;
                    int i_19_ = 19;
                    int i_20_ = (Class68_Sub8.anInt2869 - 23) / (i_19_ + 1);
                    int i_21_ = Class50.anInt990 / (i_18_ + 1);
                    int i_22_;
                    int i_23_;
                    do
                    {
                        i_22_ = i_20_;
                        i_23_ = i_21_;
                        if (i_20_ * (i_21_ - 1) >= Class68_Sub13_Sub19.anInt3761)
                            i_21_--;
                        if (Class68_Sub13_Sub19.anInt3761 <= (i_20_ - 1) * i_21_)
                            i_20_--;
                        if (Class68_Sub13_Sub19.anInt3761 <= (i_20_ - 1) * i_21_)
                            i_20_--;
                    } while (i_20_ != i_22_ || i_23_ != i_21_);
                    i_22_ = (Class50.anInt990 - i_18_ * i_21_) / (i_21_ + 1);
                    if (i_22_ > 5)
                        i_22_ = 5;
                    i_23_ = ((Class68_Sub8.anInt2869 + (-23 - i_19_ * i_20_)) / (i_20_ + 1));
                    if (i_23_ > 5)
                        i_23_ = 5;
                    int i_24_ = ((Class50.anInt990 - i_18_ * i_21_ - (i_21_ - 1) * i_22_) / 2);
                    int i_25_ = ((Class68_Sub8.anInt2869 - 23 - i_19_ * i_20_ - (i_20_ - 1) * i_23_) / 2);
                    int i_26_ = i_25_ + 23;
                    int i_27_ = 0;
                    int i_28_ = i_24_;
                    for (int i_29_ = 0; i_29_ < Class68_Sub13_Sub19.anInt3761; i_29_++)
                    {
                        Class93 class93 = Character.aClass93Array2531[i_29_];
                        boolean bool = true;
                        MutableString class100 = Class68_Sub13_Sub24.method816(((Class93) class93).anInt1667, 0);
                        if (((Class93) class93).anInt1667 != -1)
                        {
                            if (((Class93) class93).anInt1667 > 1980)
                            {
                                bool = false;
                                class100 = Class75_Sub2.aClass100_3319;
                            }
                        } else
                        {
                            bool = false;
                            class100 = Class102.aClass100_1753;
                        }
                        if (i_28_ > Class96.anInt1697 || i_26_ > Class13.anInt223 || Class96.anInt1697 >= i_18_ + i_28_ || Class13.anInt223 >= i_19_ + i_26_ || !bool)
                            Class109.aClass68_Sub20_Sub10Array1842[((Class93) class93).aBoolean1663 ? 1 : 0].method1103(Class68_Sub13_Sub18.anInt3736 + i_28_, Class68_Sub24.anInt3160 + i_26_);
                        else
                        {
                            Class68_Sub13_Sub36.anInt4039 = i_29_;
                            Class109.aClass68_Sub20_Sub10Array1842[((Class93) class93).aBoolean1663 ? 1 : 0].method1112(Class68_Sub13_Sub18.anInt3736 + i_28_, Class68_Sub24.anInt3160 + i_26_, 128, 16777215);
                        }
                        if (Class52.aClass92Array1004 != null)
                            Class52.aClass92Array1004[(((Class93) class93).anInt1668 + (!((Class93) class93).aBoolean1663 ? 0 : Class52.aClass92Array1004.length / 2))].method1533(i_28_ + Class68_Sub13_Sub18.anInt3736 + 29, Class68_Sub24.anInt3160 + i_26_);
                        class68_sub20_sub1.method1032(Class68_Sub13_Sub24.method816((((Class93) class93).anInt1666), i + 38), Class68_Sub13_Sub18.anInt3736 + (i_28_ + 15), i_26_ + Class68_Sub24.anInt3160 + i_19_ / 2 + 5, 0, -1);
                        class68_sub20_sub1_8_.method1032(class100, i_28_ + 60 + Class68_Sub13_Sub18.anInt3736, Class68_Sub24.anInt3160 + (i_26_ + i_19_ / 2) + 5, 268435455, -1);
                        i_26_ += i_23_ + i_19_;
                        if (i_20_ <= ++i_27_)
                        {
                            i_26_ = i_25_ + 23;
                            i_27_ = 0;
                            i_28_ += i_22_ + i_18_;
                        }
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ea.D(" + i + ',' + i_7_ + ',' + (class68_sub20_sub1 != null ? "{...}" : "null") + ',' + (class68_sub20_sub1_8_ != null ? "{...}" : "null") + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + (class45 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static final Object1 method724(int i, int i_30_, int i_31_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_30_][i_31_];
        if (class68_sub1 == null)
            return null;
        return ((Ground) class68_sub1).object_1;
    }

    public Class68_Sub13_Sub6()
    {
        super(1, false);
        aBoolean3544 = true;
    }

    final int[][] method697(int i, boolean bool)
    {
        anInt3527++;
        if (bool != true)
            anInt3546 = 100;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -101);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[] is_32_ = this.method696(0, Player.anInt3434 & i - 1, 29149);
            int[] is_33_ = this.method696(0, i, 29149);
            int[] is_34_ = this.method696(0, Player.anInt3434 & i + 1, 29149);
            int[] is_35_ = is[0];
            int[] is_36_ = is[1];
            int[] is_37_ = is[2];
            for (int i_38_ = 0; Class68_Sub13_Sub19.anInt3748 > i_38_; i_38_++)
            {
                int i_39_ = ((is_33_[Class30.anInt543 & i_38_ + 1] - is_33_[Class30.anInt543 & i_38_ - 1]) * anInt3546);
                int i_40_ = anInt3546 * (is_34_[i_38_] - is_32_[i_38_]);
                int i_41_ = i_40_ >> 12;
                int i_42_ = i_39_ >> 12;
                int i_43_ = i_41_ * i_41_ >> 12;
                int i_44_ = i_42_ * i_42_ >> 12;
                int i_45_ = (int) (Math.sqrt((double) ((float) (i_43_ + i_44_ + 4096) / 4096.0F)) * 4096.0);
                int i_46_;
                int i_47_;
                int i_48_;
                if (i_45_ == 0)
                {
                    i_46_ = 0;
                    i_48_ = 0;
                    i_47_ = 0;
                } else
                {
                    i_46_ = i_40_ / i_45_;
                    i_47_ = i_39_ / i_45_;
                    i_48_ = 16777216 / i_45_;
                }
                if (aBoolean3544)
                {
                    i_48_ = (i_48_ >> 1) + 2048;
                    i_47_ = (i_47_ >> 1) + 2048;
                    i_46_ = (i_46_ >> 1) + 2048;
                }
                is_35_[i_38_] = i_47_;
                is_36_[i_38_] = i_46_;
                is_37_[i_38_] = i_48_;
            }
        }
        return is;
    }

    static
    {
        aClass100_3530 = Class112.makeMutableString(43, "Dec");
        aClass100_3528 = Class112.makeMutableString(43, "Sep");
        aClass100_3539 = Class112.makeMutableString(43, "Nov");
        aClass100_3536 = Class112.makeMutableString(43, "May");
        aClass100_3535 = Class112.makeMutableString(43, "Oct");
        aClass100_3540 = Class112.makeMutableString(43, "Jan");
        aClass100_3545 = Class112.makeMutableString(43, "Jun");
        aClass100_3541 = Class112.makeMutableString(43, "Apr");
        anInt3534 = 0;
        aClass100_3543 = Class112.makeMutableString(43, "Jul");
        aClass100_3532 = Class112.makeMutableString(43, "Aug");
        aClass100_3538 = Class112.makeMutableString(43, "Mar");
        aClass100Array3526 = new MutableString[] { aClass100_3540, aClass100_3531, aClass100_3538, aClass100_3541, aClass100_3536, aClass100_3545, aClass100_3543, aClass100_3532, aClass100_3528, aClass100_3535, aClass100_3539, aClass100_3530 };
    }
}
