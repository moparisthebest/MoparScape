/* Class68_Sub13_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Calendar;
import java.util.Random;

public class Class68_Sub13_Sub12 extends Class68_Sub13 {
    public static int anInt3628;
    public static short[][] aShortArrayArray3629
            = {{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433,
            2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571,
            908, 21830, 28946, -15701, -14010},
            {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153,
                    -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650,
                    -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010},
            {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094,
                    10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650,
                    -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010},
            {4626, 11146, 6439, 12, 4758, 10270},
            {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
    public int anInt3630;
    public static RSString aRSString_3631
            = RSString.newRsString("Connecting to update server");
    public int anInt3632 = 0;
    public static int anInt3633;
    public static int anInt3634;
    public static RSString aRSString_3635 = aRSString_3631;
    public static Calendar aCalendar3636;
    public static int anInt3637;
    public int anInt3638;
    public static int[] anIntArray3639;
    public int anInt3640 = 0;
    public static boolean aBoolean3641 = false;
    public static int anInt3642;
    public int anInt3643;
    public static int anInt3644;
    public static RSString aRSString_3645;
    public static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array3646;
    public static Class113 aClass113_3647;
    public static RSString aRSString_3648;

    public static void method754(int i, int i_0_) {
        Class85.anInt1551 = i;
        anInt3637++;
        Class68_Sub22.anInt3145 = -1;
        if (i_0_ >= 88) {
            Class68_Sub22.anInt3145 = -1;
            Class128.method1782(-1);
        }
    }

    public static void method755(byte i) {
        aShortArrayArray3629 = null;
        aRSString_3648 = null;
        aRSString_3645 = null;
        aCalendar3636 = null;
        aClass113_3647 = null;
        aRSString_3631 = null;
        aClass68_Sub20_Sub10Array3646 = null;
        if (i == 24) {
            aRSString_3635 = null;
            anIntArray3639 = null;
        }
    }

    public static void method756(boolean bool) {
        if (bool != true)
            aBoolean3641 = false;
        anInt3628++;
        Class68_Sub20_Sub13.aClass98_4359.method1567(110);
    }

    public int[] method698(byte i, int i_1_) {
        anInt3642++;
        if (i != -61)
            return null;
        int[] is = aClass115_2936.method1697(false, i_1_);
        if (aClass115_2936.aBoolean1957) {
            int i_2_ = anInt3643 >> -942921695;
            int[][] is_3_ = aClass115_2936.method1696(-32044);
            Random random = new Random((long) anInt3640);
            for (int i_4_ = 0; i_4_ < anInt3630; i_4_++) {
                int i_5_
                        = (anInt3643 <= 0 ? anInt3632
                        : anInt3632 + (Class68_Sub20_Sub10.method1114(anInt3643,
                        (byte) 70,
                        random)
                        - i_2_));
                i_5_ = 0xff & i_5_ >> -1757194012;
                int i_6_ = Class68_Sub20_Sub10.method1114((Class68_Sub13_Sub19
                        .anInt3746),
                        (byte) 70, random);
                int i_7_
                        = Class68_Sub20_Sub10.method1114(Class68_Sub1.anInt2775,
                        (byte) 70, random);
                int i_8_ = ((Class118.anIntArray2077[i_5_] * anInt3638
                        >> 1986795884)
                        + i_7_);
                int i_9_
                        = ((Class78.anIntArray1394[i_5_] * anInt3638 >> 1781805612)
                        + i_6_);
                int i_10_ = -i_7_ + i_8_;
                int i_11_ = -i_6_ + i_9_;
                if (i_11_ != 0 || (i_10_ ^ 0xffffffff) != -1) {
                    if ((i_10_ ^ 0xffffffff) > -1)
                        i_10_ = -i_10_;
                    if ((i_11_ ^ 0xffffffff) > -1)
                        i_11_ = -i_11_;
                    boolean bool = i_11_ < i_10_;
                    if (bool) {
                        int i_12_ = i_6_;
                        i_6_ = i_7_;
                        int i_13_ = i_9_;
                        i_7_ = i_12_;
                        i_9_ = i_8_;
                        i_8_ = i_13_;
                    }
                    if (i_6_ > i_9_) {
                        int i_14_ = i_6_;
                        i_6_ = i_9_;
                        i_9_ = i_14_;
                        int i_15_ = i_7_;
                        i_7_ = i_8_;
                        i_8_ = i_15_;
                    }
                    int i_16_ = i_7_;
                    int i_17_ = i_9_ + -i_6_;
                    int i_18_ = -i_17_ / 2;
                    int i_19_ = 2048 / i_17_;
                    int i_20_ = i_8_ + -i_7_;
                    if (i_20_ < 0)
                        i_20_ = -i_20_;
                    int i_21_
                            = (-(Class68_Sub20_Sub10.method1114(4096, (byte) 70,
                            random)
                            >> -468586238)
                            + 1024);
                    int i_22_ = i_8_ <= i_7_ ? -1 : 1;
                    for (int i_23_ = i_6_;
                         (i_9_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
                        i_18_ += i_20_;
                        int i_24_ = i_19_ * (i_23_ + -i_6_) + (1024 + i_21_);
                        int i_25_ = Class30.anInt543 & i_23_;
                        int i_26_ = i_16_ & Class1_Sub6_Sub2.anInt3432;
                        if (bool)
                            is_3_[i_26_][i_25_] = i_24_;
                        else
                            is_3_[i_25_][i_26_] = i_24_;
                        if (i_18_ > 0) {
                            i_18_ = -i_17_ + i_18_;
                            i_16_ = i_22_ + i_16_;
                        }
                    }
                }
            }
        }
        return is;
    }

    public void method700(Stream class68_sub14, int i, int i_27_) {
        anInt3634++;
        int i_28_ = i;
        while_67_:
        do {
            while_66_:
            do {
                while_65_:
                do {
                    do {
                        if ((i_28_ ^ 0xffffffff) != -1) {
                            if (i_28_ != 1) {
                                if ((i_28_ ^ 0xffffffff) != -3) {
                                    if ((i_28_ ^ 0xffffffff) != -4) {
                                        if (i_28_ == 4)
                                            break while_66_;
                                        break while_67_;
                                    }
                                } else
                                    break;
                                break while_65_;
                            }
                        } else {
                            anInt3640 = class68_sub14.readUnsignedByte(i_27_ + -6676);
                            break while_67_;
                        }
                        anInt3630 = class68_sub14.readUnsignedWord(1355769544);
                        break while_67_;
                    } while (false);
                    anInt3638 = class68_sub14.readUnsignedByte(i_27_ + -6676);
                    break while_67_;
                } while (false);
                anInt3632 = class68_sub14.readUnsignedWord(1355769544);
                break while_67_;
            } while (false);
            anInt3643 = class68_sub14.readUnsignedWord(i_27_ ^ ~0x50cf66c8);
        } while (false);
        if (i_27_ != -1)
            anInt3638 = -69;
    }

    public void method690(byte i) {
        if (i >= -22)
            method756(true);
        anInt3633++;
        Class68_Sub10.method683((byte) -127);
    }

    public Class68_Sub13_Sub12() {
        super(0, true);
        anInt3630 = 2000;
        anInt3638 = 16;
        anInt3643 = 4096;
    }

    static {
        aCalendar3636 = Calendar.getInstance();
        aRSString_3645 = RSString.newRsString("Lade Sprites )2 ");
        aClass113_3647 = new Class113(16);
        aRSString_3648 = RSString.newRsString("::errortest");
    }
}
