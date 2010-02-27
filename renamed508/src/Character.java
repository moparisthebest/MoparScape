/* Class1_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Character extends Animable
{
    static int anInt2519;
    int anInt2520;
    int anInt2521;
    int anInt2522;
    int anInt2523;
    int anInt2524;
    int[] walkQueueX;
    int anInt2526;
    int interactingEntity = -1;
    int anInt2528;
    static int anInt2529;
    static int anInt2530;
    static Class93[] aClass93Array2531;
    int anInt2532;
    static int anInt2533;
    int anInt2534;
    int turnDirection;
    int loopCycleStatus;
    int anInt2537;
    static int anInt2538;
    int y;
    private static MutableString aClass100_2540 = Class112.makeMutableString(43, "Select a world");
    int anInt2541 = 0;
    int anInt2542;
    int anInt2543;
    int anInt2544;
    int anInt2545;
    int raw_range;
    int anInt2547;
    boolean[] aBooleanArray2548;
    int hpRatio;
    int anInt2550;
    int anInt2551;
    int anInt2552;
    static int anInt2553;
    int anInt2554;
    static int anInt2555;
    int[] anIntArray2556;
    int anInt2557;
    int anInt2558;
    int anInt2559;
    static Class92_Sub1[] aClass92_Sub1Array2560;
    int anInt2561;
    int anInt2562;
    int x;
    int anInt2564;
    int anInt2565;
    int anInt2566;
    int anInt2567;
    int height;
    static int anInt2569;
    int animationID;
    int messageCycle;
    int[] walkQueueY;
    int[] anIntArray2573;
    int anInt2574;
    static MutableString aClass100_2575;
    int anInt2576;
    int lastUpdate;
    MutableString message;
    int anInt2579;
    int anInt2580;
    int walkQueueLength;
    int[] anIntArray2582;
    int anInt2583;
    int anInt2584;
    boolean aBoolean2585;
    static MutableString aClass100_2586 = Class112.makeMutableString(43, "hitbar_default");
    static long aLong2587;
    int anInt2588;
    static int anInt2589;
    int anInt2590;
    static int anInt2591;

    static final void method144(int i, int i_0_, int i_1_, boolean bool, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_)
    {
        anInt2569++;
        if (bool != true)
            aLong2587 = -83L;
        int i_9_ = i_1_ - i_8_;
        if (i_1_ < Class68_Sub6.anInt2848)
            i_9_++;
        int i_10_ = i_4_ - i_6_;
        if (i_4_ < Class103.anInt1770)
            i_10_++;
        for (int i_11_ = 0; i_9_ > i_11_; i_11_++)
        {
            int i_12_ = i * i_11_ + i_3_ >> 16;
            int i_13_ = (i_11_ + 1) * i + i_3_ >> 16;
            int i_14_ = i_13_ - i_12_;
            if (i_14_ > 0)
            {
                int i_15_ = i_11_ + i_8_ >> 6;
                if (i_15_ < 0 || i_15_ > Class33.anIntArrayArrayArray584.length - 1)
                {
                    i_12_ += i_7_;
                    for (int i_16_ = 0; i_16_ < i_10_; i_16_++)
                    {
                        int i_17_;
                        if (((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4411 != -1)
                            i_17_ = ((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4411;
                        else if ((0x4 & i_8_ + i_11_) != (i_16_ + i_6_ & 0x4))
                            i_17_ = 4936552;
                        else
                            i_17_ = (Class121.anIntArray2106[Class68_Sub9.anInt2893 + 1]);
                        if (i_17_ == 0)
                            i_17_ = 1;
                        int i_18_ = (i_16_ * i_0_ + i_2_ >> 16) + i_5_;
                        int i_19_ = (i_2_ + (i_16_ + 1) * i_0_ >> 16) + i_5_;
                        int i_20_ = i_19_ - i_18_;
                        Class79.method1445(i_12_, i_18_, i_14_, i_20_, i_17_);
                    }
                    i_13_ += i_7_;
                } else
                {
                    i_12_ += i_7_;
                    i_13_ += i_7_;
                    byte[][] is = Class12.aByteArrayArrayArray212[i_15_];
                    int[][] is_21_ = Class33.anIntArrayArrayArray584[i_15_];
                    byte[][] is_22_ = Class48.aByteArrayArrayArray949[i_15_];
                    byte[][] is_23_ = Class49.aByteArrayArrayArray970[i_15_];
                    byte[][] is_24_ = Class68_Sub13_Sub16.aByteArrayArrayArray3712[i_15_];
                    byte[][] is_25_ = Class68_Sub13_Sub11.aByteArrayArrayArray3624[i_15_];
                    int i_26_ = 0;
                    for (/**/; i_10_ > i_26_; i_26_++)
                    {
                        int i_27_ = i_26_ * i_0_ + i_2_ >> 16;
                        int i_28_ = i_0_ * (i_26_ + 1) + i_2_ >> 16;
                        int i_29_ = i_28_ - i_27_;
                        if (i_29_ > 0)
                        {
                            i_28_ += i_5_;
                            i_27_ += i_5_;
                            int i_30_ = i_6_ + i_26_ >> 6;
                            int i_31_ = 0x3f & i_11_ + i_8_;
                            int i_32_ = 0x3f & i_6_ + i_26_;
                            int i_33_ = (i_32_ << 6) + i_31_;
                            int i_34_;
                            if (i_30_ >= 0 && is_21_.length - 1 >= i_30_ && is_21_[i_30_] != null)
                                i_34_ = is_21_[i_30_][i_33_];
                            else
                            {
                                if ((((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4411) != -1)
                                    i_34_ = (((Class68_Sub20_Sub16) Class30.aClass68_Sub20_Sub16_540).anInt4411);
                                else if ((i_8_ + i_11_ & 0x4) != (0x4 & i_6_ + i_26_))
                                    i_34_ = 4936552;
                                else
                                    i_34_ = (Class121.anIntArray2106[Class68_Sub9.anInt2893 + 1]);
                                if (i_30_ < 0 || is_21_.length - 1 < i_30_)
                                {
                                    if (i_34_ == 0)
                                        i_34_ = 1;
                                    Class79.method1445(i_12_, i_27_, i_14_, i_29_, i_34_);
                                    continue;
                                }
                            }
                            if (i_34_ == 0)
                                i_34_ = 1;
                            int i_35_ = (is_22_[i_30_] == null ? 0 : (Class121.anIntArray2106[is_22_[i_30_][i_33_] & 0xff]));
                            int i_36_ = (is[i_30_] != null ? (Class121.anIntArray2106[is[i_30_][i_33_] & 0xff]) : 0);
                            if (i_36_ == 0 && i_35_ == 0)
                                Class79.method1445(i_12_, i_27_, i_14_, i_29_, i_34_);
                            else
                            {
                                if (i_36_ != 0)
                                {
                                    if (i_36_ == -1)
                                        i_36_ = 1;
                                    int i_37_ = (is_24_[i_30_] == null ? (int) 0 : is_24_[i_30_][i_33_]);
                                    int i_38_ = i_37_ & 0xfc;
                                    if (i_38_ == 0 || i_14_ <= 1 || i_29_ <= 1)
                                        Class79.method1445(i_12_, i_27_, i_14_, i_29_, i_36_);
                                    else
                                        Animation.method1730(i_38_ >> 2, i_14_, true, i_29_, i_34_, i_36_, (Class79.anIntArray1404), i_12_, i_27_, 0x3 & i_37_, 2);
                                }
                                if (i_35_ != 0)
                                {
                                    int i_39_ = is_23_[i_30_][i_33_];
                                    int i_40_ = 0xfc & i_39_;
                                    if (i_35_ == -1)
                                        i_35_ = i_34_;
                                    if (i_40_ == 0 || i_14_ <= 1 || i_29_ <= 1)
                                        Class79.method1445(i_12_, i_27_, i_14_, i_29_, i_35_);
                                    Animation.method1730(i_40_ >> 2, i_14_, i_36_ == 0, i_29_, 0, i_35_, Class79.anIntArray1404, i_12_, i_27_, i_39_ & 0x3, 2);
                                }
                            }
                            if (is_25_[i_30_] != null)
                            {
                                int i_41_ = 0xff & is_25_[i_30_][i_33_];
                                if (i_41_ != 0)
                                {
                                    int i_42_;
                                    if (i_14_ != 1)
                                        i_42_ = i_13_ - 1;
                                    else
                                        i_42_ = i_12_;
                                    int i_43_;
                                    if (i_29_ == 1)
                                        i_43_ = i_27_;
                                    else
                                        i_43_ = i_28_ - 1;
                                    int i_44_ = 13421772;
                                    if (i_41_ >= 5 && i_41_ <= 8 || i_41_ >= 13 && i_41_ <= 16 || i_41_ >= 21 && i_41_ <= 24 || i_41_ == 27 || i_41_ == 28)
                                    {
                                        i_44_ = 13369344;
                                        i_41_ -= 4;
                                    }
                                    if (i_41_ == 1)
                                        Class79.method1437(i_12_, i_27_, i_29_, i_44_);
                                    else if (i_41_ != 2)
                                    {
                                        if (i_41_ == 3)
                                            Class79.method1437(i_42_, i_27_, i_29_, i_44_);
                                        else if (i_41_ != 4)
                                        {
                                            if (i_41_ != 9)
                                            {
                                                if (i_41_ == 10)
                                                {
                                                    Class79.method1437(i_42_, i_27_, i_29_, 16777215);
                                                    Class79.method1434(i_12_, i_27_, i_14_, i_44_);
                                                } else if (i_41_ == 11)
                                                {
                                                    Class79.method1437(i_42_, i_27_, i_29_, 16777215);
                                                    Class79.method1434(i_12_, i_43_, i_14_, i_44_);
                                                } else if (i_41_ != 12)
                                                {
                                                    if (i_41_ == 17)
                                                        Class79.method1434(i_12_, i_27_, 1, i_44_);
                                                    else if (i_41_ == 18)
                                                        Class79.method1434(i_42_, i_27_, 1, i_44_);
                                                    else if (i_41_ == 19)
                                                        Class79.method1434(i_42_, i_43_, 1, i_44_);
                                                    else if (i_41_ == 20)
                                                        Class79.method1434(i_12_, i_43_, 1, i_44_);
                                                    else if (i_41_ != 25)
                                                    {
                                                        if (i_41_ == 26)
                                                        {
                                                            for (int i_45_ = 0; i_29_ > i_45_; i_45_++)
                                                                Class79.method1434((i_45_ + i_12_), (i_45_ + i_27_), 1, i_44_);
                                                        }
                                                    } else
                                                    {
                                                        for (int i_46_ = 0; i_46_ < i_29_; i_46_++)
                                                            Class79.method1434(i_12_ + i_46_, i_43_ - i_46_, 1, i_44_);
                                                    }
                                                } else
                                                {
                                                    Class79.method1437(i_12_, i_27_, i_29_, 16777215);
                                                    Class79.method1434(i_12_, i_43_, i_14_, i_44_);
                                                }
                                            } else
                                            {
                                                Class79.method1437(i_12_, i_27_, i_29_, 16777215);
                                                Class79.method1434(i_12_, i_27_, i_14_, i_44_);
                                            }
                                        } else
                                            Class79.method1434(i_12_, i_43_, i_14_, i_44_);
                                    } else
                                        Class79.method1434(i_12_, i_27_, i_14_, i_44_);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i_47_ = -2; i_9_ + 2 > i_47_; i_47_++)
        {
            int i_48_ = i_3_ + i_47_ * i >> 16;
            int i_49_ = i_3_ + i * (i_47_ + 1) >> 16;
            int i_50_ = i_49_ - i_48_;
            if (i_50_ > 0)
            {
                i_48_ += i_7_;
                int i_51_ = i_8_ + i_47_ >> 6;
                i_49_ += i_7_;
                if (i_51_ >= 0 && (Class68_Sub13_Sub11.aShortArrayArrayArray3628.length - 1) >= i_51_)
                {
                    short[][] is = Class68_Sub13_Sub11.aShortArrayArrayArray3628[i_51_];
                    for (int i_52_ = -2; i_10_ + 2 > i_52_; i_52_++)
                    {
                        int i_53_ = i_2_ + i_52_ * i_0_ >> 16;
                        int i_54_ = i_2_ + i_0_ * (i_52_ + 1) >> 16;
                        int i_55_ = i_54_ - i_53_;
                        if (i_55_ > 0)
                        {
                            i_54_ += i_5_;
                            i_53_ += i_5_;
                            int i_56_ = i_6_ + i_52_ >> 6;
                            if (i_56_ >= 0 && is.length - 1 >= i_56_)
                            {
                                int i_57_ = ((0x3f & i_8_ + i_47_) + ((0x3f & i_52_ + i_6_) << 6));
                                if (is[i_56_] != null)
                                {
                                    int i_58_ = 0x3fff & is[i_56_][i_57_];
                                    int i_59_ = 0x3 & is[i_56_][i_57_] >> 14;
                                    if (i_58_ != 0)
                                    {
                                        if (i_59_ == 0)
                                            Class68_Sub19.aClass92_Sub1Array3071[i_58_ - 1].method1544(i_48_, i_53_, i_50_ * 2, i_55_ * 2);
                                        else if (i_59_ == 1)
                                            Class68_Sub13_Sub2.aClass92_Sub1Array3465[i_58_ - 1].method1544(i_48_, i_53_, 2 * i_50_, i_55_ * 2);
                                        else if (i_59_ == 2)
                                            Class68_Sub13_Sub31.aClass92_Sub1Array3975[i_58_ - 1].method1544(i_48_, i_53_, i_50_ * 2, 2 * i_55_);
                                        else if (i_59_ == 3)
                                            aClass92_Sub1Array2560[i_58_ - 1].method1544(i_48_, i_53_, i_50_ * 2, 2 * i_55_);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method145(int i)
    {
        aClass100_2586 = null;
        aClass100_2575 = null;
        aClass93Array2531 = null;
        aClass92_Sub1Array2560 = null;
        if (i != 2)
            method148(-100, 10);
        aClass100_2540 = null;
    }

    static final int UNSIGN_BYTE(int v)
    {
        return v & 0xff;
    }

    final void setPosition(int _y, int _x, boolean teleported)
    {
        if (animationID != -1 && Object1.getAnimation(animationID).resetStyle == 1)
            animationID = -1;
        if (!teleported)
        {
            int dx = _x - walkQueueX[0];
            int dy = _y - walkQueueY[0];
            if (dx >= -8 && dx <= 8 && dy >= -8 && dy <= 8)
            {
                if (walkQueueLength < 9)
                    walkQueueLength++;
                for (int i_65_ = walkQueueLength; i_65_ > 0; i_65_--)
                {
                    walkQueueX[i_65_] = walkQueueX[i_65_ - 1];
                    walkQueueY[i_65_] = walkQueueY[i_65_ - 1];
                    aBooleanArray2548[i_65_] = aBooleanArray2548[i_65_ - 1];
                }
                walkQueueX[0] = _x;
                walkQueueY[0] = _y;
                aBooleanArray2548[0] = false;
                return;
            }
        }
        walkQueueLength = 0;
        anInt2522 = 0;
        anInt2559 = 0;
        walkQueueX[0] = _x;
        walkQueueY[0] = _y;
        x = (walkQueueX[0] * 128 + raw_range * 64);
        y = (walkQueueY[0] * 128 + 64 * raw_range);
    }

    static final int method148(int i, int i_66_)
    {
        if (i_66_ > -73)
            aClass93Array2531 = null;
        anInt2591++;
        return i >>> 7;
    }

    final void method149(int i, boolean bool, int i_67_, int i_68_)
    {
        anInt2519++;
        for (int i_69_ = 0; i_69_ < 4; i_69_++)
        {
            if (i_67_ >= ((Character) this).anIntArray2582[i_69_])
            {
                ((Character) this).anIntArray2556[i_69_] = i;
                ((Character) this).anIntArray2573[i_69_] = i_68_;
                ((Character) this).anIntArray2582[i_69_] = i_67_ + 70;
                return;
            }
        }
        if (bool != false)
            ((Character) this).anInt2524 = 9;
    }

    boolean hasDefinition()
    {
        return false;
    }

    final void moveInDirection(boolean running, int direction)
    {
        anInt2530++;
        int i_71_ = ((Character) this).walkQueueX[0];
        int i_72_ = ((Character) this).walkQueueY[0];
            if (((Character) this).animationID != -1 && ((Animation) Object1.getAnimation((((Character) this).animationID))).resetStyle == 1)
                ((Character) this).animationID = -1;
            if (((Character) this).walkQueueLength < 9)
                ((Character) this).walkQueueLength++;
            if (direction == 0)
            {
                i_72_++;
                i_71_--;
            }
            for (int i_73_ = ((Character) this).walkQueueLength; i_73_ > 0; i_73_--)
            {
                ((Character) this).walkQueueX[i_73_] = ((Character) this).walkQueueX[i_73_ - 1];
                ((Character) this).walkQueueY[i_73_] = ((Character) this).walkQueueY[i_73_ - 1];
                ((Character) this).aBooleanArray2548[i_73_] = ((Character) this).aBooleanArray2548[i_73_ - 1];
            }
            if (direction == 1)
                i_72_++;
            if (direction == 2)
            {
                i_72_++;
                i_71_++;
            }
            ((Character) this).aBooleanArray2548[0] = running;
            if (direction == 3)
                i_71_--;
            if (direction == 4)
                i_71_++;
            if (direction == 5)
            {
                i_71_--;
                i_72_--;
            }
            if (direction == 6)
                i_72_--;
            if (direction == 7)
            {
                i_71_++;
                i_72_--;
            }
            ((Character) this).walkQueueX[0] = i_71_;
            ((Character) this).walkQueueY[0] = i_72_;
    }

    final int getHeight()
    {
        return height == -32768 ? 200 : -height;
    }

    final void method153(int i)
    {
        anInt2553++;
        ((Character) this).walkQueueLength = i;
        ((Character) this).anInt2559 = 0;
    }

    Character()
    {
        ((Character) this).anInt2534 = -1;
        ((Character) this).anInt2537 = 0;
        ((Character) this).anInt2545 = -1;
        ((Character) this).anInt2547 = 0;
        ((Character) this).walkQueueX = new int[10];
        ((Character) this).anInt2526 = -1;
        ((Character) this).anInt2557 = 0;
        ((Character) this).anInt2524 = 0;
        ((Character) this).anInt2551 = 0;
        ((Character) this).anIntArray2556 = new int[4];
        ((Character) this).anInt2522 = 0;
        ((Character) this).anInt2559 = 0;
        ((Character) this).raw_range = 1;
        ((Character) this).anInt2532 = -1;
        ((Character) this).walkQueueY = new int[10];
        ((Character) this).anIntArray2573 = new int[4];
        ((Character) this).loopCycleStatus = -1000;
        ((Character) this).anInt2579 = 0;
        ((Character) this).anInt2576 = -1;
        ((Character) this).anInt2564 = 0;
        ((Character) this).anInt2574 = 0;
        ((Character) this).messageCycle = 100;
        ((Character) this).anInt2554 = -1;
        ((Character) this).message = null;
        ((Character) this).animationID = -1;
        ((Character) this).anInt2566 = -1;
        ((Character) this).anInt2565 = -1;
        ((Character) this).aBooleanArray2548 = new boolean[10];
        ((Character) this).anInt2583 = 32;
        ((Character) this).walkQueueLength = 0;
        ((Character) this).anInt2558 = 0;
        ((Character) this).height = -32768;
        ((Character) this).aBoolean2585 = false;
        ((Character) this).anInt2588 = 0;
        ((Character) this).anInt2542 = -1;
        ((Character) this).anInt2580 = 0;
        ((Character) this).anIntArray2582 = new int[4];
        ((Character) this).lastUpdate = 0;
        ((Character) this).anInt2567 = -1;
        ((Character) this).anInt2528 = 0;
    }

    static
    {
        aClass100_2575 = aClass100_2540;
    }
}
