/* Class21_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class21_Sub1 extends Class21
{
    static int[] anIntArray2695 = new int[2];
    static int anInt2696;
    static MutableString aClass100_2697;
    private volatile boolean aBoolean2698;
    private int anInt2699;
    static MutableString aClass100_2700 = Class112.makeMutableString(43, "Musik)2Engine vorbereitet)3");
    private Class89 aClass89_2701;
    static int anInt2702;
    private int anInt2703;
    static MutableString aClass100_2704;
    static long[] aLongArray2705;
    private boolean aBoolean2706 = false;
    static boolean aBoolean2707;
    static int anInt2708;
    static int anInt2709;
    private int anInt2710;
    static int anInt2711;
    static MutableString[] aClass100Array2712;
    private int anInt2713;
    static int anInt2714;
    private Class89 aClass89_2715;
    static int anInt2716;
    static int anInt2717;
    static int anInt2718;
    private volatile boolean[] aBooleanArray2719;
    static int anInt2720;
    static int anInt2721;

    final void method334(int i, byte i_0_)
    {
        anInt2709++;
        if (i_0_ < 84)
            aBoolean2706 = true;
        if (this.validIndex(i, 0))
            Class20.method326(anInt2699, i, true);
    }

    final void method364(int i, boolean bool, byte[] is, Class89 class89, int i_1_)
    {
        try
        {
            anInt2714++;
            if (class89 != aClass89_2715)
            {
                if (!bool && i_1_ == anInt2713)
                    aBoolean2698 = true;
                if (is == null || is.length <= 2)
                {
                    aBooleanArray2719[i_1_] = false;
                    if (aBoolean2706 || bool)
                        GameException.method1804(bool, ((Class21) this).anIntArray468[i_1_], anInt2699, (byte) 2, i_1_, this, (byte) 22);
                    return;
                }
                Class111.aCRC32_1874.reset();
                Class111.aCRC32_1874.update(is, 0, is.length - 2);
                int i_2_ = (int) Class111.aCRC32_1874.getValue();
                int i_3_ = ((0xff & is[is.length - 1]) + (is[is.length - 2] << 8 & 0xff00));
                if (((Class21) this).anIntArray468[i_1_] != i_2_ || i_3_ != ((Class21) this).anIntArray474[i_1_])
                {
                    aBooleanArray2719[i_1_] = false;
                    if (aBoolean2706 || bool)
                        GameException.method1804(bool, ((Class21) this).anIntArray468[i_1_], anInt2699, (byte) 2, i_1_, this, (byte) 22);
                    return;
                }
                aBooleanArray2719[i_1_] = true;
                if (bool)
                    ((Class21) this).anObjectArray435[i_1_] = Class120.method1745(false, (byte) -126, is);
            } else
            {
                if (aBoolean2698)
                    throw new RuntimeException();
                if (is == null)
                {
                    GameException.method1804(true, anInt2703, 255, (byte) 0, anInt2699, this, (byte) 22);
                    return;
                }
                Class111.aCRC32_1874.reset();
                Class111.aCRC32_1874.update(is, 0, is.length);
                int i_4_ = (int) Class111.aCRC32_1874.getValue();
                if (anInt2703 != i_4_)
                {
                    GameException.method1804(true, anInt2703, 255, (byte) 0, anInt2699, this, (byte) 22);
                    return;
                }
                Stream class68_sub14;
                try
                {
                    class68_sub14 = new Stream(MutableString.method1618(is, true));
                } catch (RuntimeException runtimeexception)
                {
                    GameException.method1804(true, anInt2703, 255, (byte) 0, anInt2699, this, (byte) 22);
                    return;
                }
                int i_5_ = class68_sub14.readUByte();
                if (i_5_ != 5 && i_5_ != 6)
                {
                    GameException.method1804(true, anInt2703, 255, (byte) 0, anInt2699, this, (byte) 22);
                    return;
                }
                int i_6_ = 0;
                if (i_5_ >= 6)
                    i_6_ = class68_sub14.readInteger();
                if (i_6_ != anInt2710)
                {
                    GameException.method1804(true, anInt2703, 255, (byte) 0, anInt2699, this, (byte) 22);
                    return;
                }
                this.method349(is, -25529);
                method372(-1);
            }
            int i_7_ = -14 / ((i - 77) / 41);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("sg.OA(" + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + (class89 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
        }
    }

    final int method365(int i)
    {
        anInt2717++;
        if (aBoolean2698)
            return 100;
        if (((Class21) this).anObjectArray435 != null)
            return 99;
        int i_8_ = Class68_Sub24.method1209(0, anInt2699, 255);
        if (i_8_ >= 100)
            i_8_ = 99;
        int i_9_ = 120 / ((i + 13) / 59);
        return i_8_;
    }

    static final void method366(int i)
    {
        anInt2711++;
        Class68_Sub13_Sub2.aClass98_3461.method1573(-114);
        if (i >= 29)
            Class75_Sub1_Sub1.aClass98_4579.method1573(-50);
    }

    static final boolean method367(int i, int i_10_)
    {
        if (i_10_ != -1)
            method370(-14);
        anInt2720++;
        if (i != (-i & i))
            return false;
        return true;
    }

    Class21_Sub1(Class89 class89, Class89 class89_11_, int i, boolean bool, boolean bool_12_, boolean bool_13_)
    {
        super(bool, bool_12_);
        aBoolean2698 = false;
        anInt2713 = -1;
        try
        {
            anInt2699 = i;
            aClass89_2715 = class89_11_;
            aClass89_2701 = class89;
            aBoolean2706 = bool_13_;
            Class72.method1360(this, -5720, anInt2699);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("sg.<init>(" + (class89 != null ? "{...}" : "null") + ',' + (class89_11_ != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + bool_12_ + ',' + bool_13_ + ')'));
        }
    }

    final int method332(int i, int i_14_)
    {
        anInt2696++;
        if (!this.validIndex(i_14_, i))
            return 0;
        if (((Class21) this).anObjectArray435[i_14_] != null)
            return 100;
        if (aBooleanArray2719[i_14_])
            return 100;
        return Class68_Sub24.method1209(0, i_14_, anInt2699);
    }

    final void method368(int i, byte i_15_, int i_16_)
    {
        anInt2708++;
        anInt2703 = i_16_;
        anInt2710 = i;
        if (aClass89_2715 != null)
            Class60.method586(aClass89_2715, this, 1, anInt2699);
        else
            GameException.method1804(true, anInt2703, 255, (byte) 0, anInt2699, this, (byte) 22);
        if (i_15_ <= 76)
            aLongArray2705 = null;
    }

    static final void method369(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, byte i_22_, int i_23_)
    {
        anInt2718++;
        int i_24_ = 0;
        if (i_22_ < -58)
        {
            int i_25_ = i_17_;
            int i_26_ = 0;
            int i_27_ = i_21_ - i;
            int i_28_ = i_21_ * i_21_;
            int i_29_ = i_17_ - i;
            int i_30_ = i_17_ * i_17_;
            int i_31_ = i_27_ * i_27_;
            int i_32_ = i_29_ * i_29_;
            int i_33_ = i_30_ << 1;
            int i_34_ = i_28_ << 1;
            int i_35_ = i_32_ << 1;
            int i_36_ = i_31_ << 1;
            int i_37_ = i_29_ << 1;
            int i_38_ = i_17_ << 1;
            int i_39_ = i_30_ - (i_38_ - 1) * i_34_;
            int i_40_ = (1 - i_38_) * i_28_ + i_33_;
            int i_41_ = i_31_ * (1 - i_37_) + i_35_;
            int i_42_ = i_28_ << 2;
            int i_43_ = i_32_ - i_36_ * (i_37_ - 1);
            int i_44_ = i_31_ << 2;
            int i_45_ = i_30_ << 2;
            int i_46_ = i_32_ << 2;
            int i_47_ = i_35_ * 3;
            int i_48_ = i_33_ * 3;
            int i_49_ = i_36_ * (i_37_ - 3);
            int i_50_ = i_34_ * (i_38_ - 3);
            int i_51_ = i_45_;
            int i_52_ = (i_17_ - 1) * i_42_;
            int i_53_ = (i_29_ - 1) * i_44_;
            int[] is = Class68_Sub22.anIntArrayArray3134[i_23_];
            int i_54_ = i_46_;
            Class34.method416(i_19_ - i_21_, (byte) -17, i_18_, is, i_19_ - i_27_);
            Class34.method416(i_19_ - i_27_, (byte) -17, i_20_, is, i_27_ + i_19_);
            Class34.method416(i_27_ + i_19_, (byte) -17, i_18_, is, i_21_ + i_19_);
            while (i_25_ > 0)
            {
                if (i_40_ < 0)
                {
                    while (i_40_ < 0)
                    {
                        i_24_++;
                        i_40_ += i_48_;
                        i_39_ += i_51_;
                        i_51_ += i_45_;
                        i_48_ += i_45_;
                    }
                }
                boolean bool = i_25_ <= i_29_;
                if (bool)
                {
                    if (i_41_ < 0)
                    {
                        while (i_41_ < 0)
                        {
                            i_26_++;
                            i_43_ += i_54_;
                            i_41_ += i_47_;
                            i_54_ += i_46_;
                            i_47_ += i_46_;
                        }
                    }
                    if (i_43_ < 0)
                    {
                        i_41_ += i_47_;
                        i_43_ += i_54_;
                        i_26_++;
                        i_54_ += i_46_;
                        i_47_ += i_46_;
                    }
                    i_41_ -= i_53_;
                    i_43_ -= i_49_;
                    i_49_ -= i_44_;
                    i_53_ -= i_44_;
                }
                if (i_39_ < 0)
                {
                    i_40_ += i_48_;
                    i_39_ += i_51_;
                    i_24_++;
                    i_48_ += i_45_;
                    i_51_ += i_45_;
                }
                i_40_ -= i_52_;
                i_25_--;
                int i_55_ = i_19_ + i_24_;
                int i_56_ = i_23_ + i_25_;
                i_52_ -= i_42_;
                int i_57_ = i_23_ - i_25_;
                int i_58_ = i_19_ - i_24_;
                i_39_ -= i_50_;
                if (!bool)
                {
                    Class34.method416(i_58_, (byte) -17, i_18_, Class68_Sub22.anIntArrayArray3134[i_57_], i_55_);
                    Class34.method416(i_58_, (byte) -17, i_18_, Class68_Sub22.anIntArrayArray3134[i_56_], i_55_);
                } else
                {
                    int i_59_ = i_19_ + i_26_;
                    int i_60_ = i_19_ - i_26_;
                    Class34.method416(i_58_, (byte) -17, i_18_, Class68_Sub22.anIntArrayArray3134[i_57_], i_60_);
                    Class34.method416(i_60_, (byte) -17, i_20_, Class68_Sub22.anIntArrayArray3134[i_57_], i_59_);
                    Class34.method416(i_59_, (byte) -17, i_18_, Class68_Sub22.anIntArrayArray3134[i_57_], i_55_);
                    Class34.method416(i_58_, (byte) -17, i_18_, Class68_Sub22.anIntArrayArray3134[i_56_], i_60_);
                    Class34.method416(i_60_, (byte) -17, i_20_, Class68_Sub22.anIntArrayArray3134[i_56_], i_59_);
                    Class34.method416(i_59_, (byte) -17, i_18_, Class68_Sub22.anIntArrayArray3134[i_56_], i_55_);
                }
                i_50_ -= i_42_;
            }
        }
    }

    final void method331(byte i, int i_61_)
    {
        anInt2721++;
        if (this.validIndex(i_61_, 0))
        {
            do
            {
                if (aClass89_2701 == null || aBooleanArray2719 == null || !aBooleanArray2719[i_61_])
                {
                    GameException.method1804(true, (((Class21) this).anIntArray468[i_61_]), anInt2699, (byte) 2, i_61_, this, (byte) 22);
                    if (client.anInt2387 == 0)
                        break;
                }
                Class60.method586(aClass89_2701, this, 1, i_61_);
            } while (false);
            if (i > -103)
                anIntArray2695 = null;
        }
    }

    public static void method370(int i)
    {
        aClass100_2704 = null;
        if (i != -677379135)
            method366(107);
        aClass100_2700 = null;
        aLongArray2705 = null;
        aClass100_2697 = null;
        anIntArray2695 = null;
        aClass100Array2712 = null;
    }

    final void method371(boolean bool, boolean bool_62_, int i, int i_63_, byte[] is)
    {
        do
        {
            try
            {
                if (i_63_ >= 122)
                {
                    anInt2702++;
                    if (bool_62_)
                    {
                        if (aBoolean2698)
                            throw new RuntimeException();
                        if (aClass89_2715 != null)
                            NodeList.method285(anInt2699, is, -30372, aClass89_2715);
                        this.method349(is, -25529);
                        method372(-1);
                    } else
                    {
                        is[is.length - 2] = (byte) (((Class21) this).anIntArray474[i] >> 8);
                        is[is.length - 1] = (byte) ((Class21) this).anIntArray474[i];
                        if (aClass89_2701 != null)
                        {
                            NodeList.method285(i, is, -30372, aClass89_2701);
                            aBooleanArray2719[i] = true;
                        }
                        if (!bool)
                            break;
                        ((Class21) this).anObjectArray435[i] = Class120.method1745(false, (byte) 71, is);
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("sg.TA(" + bool + ',' + bool_62_ + ',' + i + ',' + i_63_ + ',' + (is != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    private final void method372(int i)
    {
        anInt2716++;
        aBooleanArray2719 = new boolean[((Class21) this).anObjectArray435.length];
        for (int i_64_ = 0; i_64_ < aBooleanArray2719.length; i_64_++)
            aBooleanArray2719[i_64_] = false;
        if (aClass89_2701 == null)
            aBoolean2698 = true;
        else
        {
            anInt2713 = i;
            for (int i_65_ = 0; aBooleanArray2719.length > i_65_; i_65_++)
            {
                if (((Class21) this).dataSizes[i_65_] > 0)
                {
                    Class68_Sub25.method1213(this, (byte) -119, aClass89_2701, i_65_);
                    anInt2713 = i_65_;
                }
            }
            if (anInt2713 == -1)
                aBoolean2698 = true;
        }
    }

    static
    {
        aClass100_2697 = Class112.makeMutableString(43, "<col=ffffff>");
        aLongArray2705 = new long[100];
        aBoolean2707 = false;
        aClass100Array2712 = new MutableString[1000];
        aClass100_2704 = Class112.makeMutableString(43, "(Udns");
    }
}
