/* Class68_Sub13_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub9 extends Class68_Sub13 {
    public static int anInt3567;
    public static int height;
    public static Sprite[] aSpriteArray3569;
    public static Class43[] aClass43Array3570;
    public int anInt3571 = 0;
    public static int anInt3572;
    public static int anInt3573;
    public int anInt3574 = 4096;
    public static JagSocket unknownSocket;
    public static int anInt3576;
    public static RSString aRSString_3577;
    public static int[] anIntArray3578;
    public static int[] anIntArray3579
            = {-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81,
            82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104,
            105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16,
            17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68,
            66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49,
            36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233,
            224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4,
            5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static RSString aRSString_3580;
    public static RSString aRSString_3581;
    public static int[] anIntArray3582;
    public static int anInt3583;

    public static void method736(int i) {
        anIntArray3582 = null;
        aRSString_3577 = null;
        unknownSocket = null;
        anIntArray3579 = null;
        aRSString_3580 = null;
        aRSString_3581 = null;
        anIntArray3578 = null;
        aSpriteArray3569 = null;
        aClass43Array3570 = null;
        if (i != -15578)
            method737(true);
    }

    public void method700(Stream class68_sub14, int i, int i_0_) {
        anInt3567++;
        if (i_0_ == -1) {
            int i_1_ = i;
            while_13_:
            do {
                do {
                    if (i_1_ != 0) {
                        if (i_1_ != 1) {
                            if ((i_1_ ^ 0xffffffff) == -3)
                                break;
                            break while_13_;
                        }
                    } else {
                        anInt3571 = class68_sub14.readUnsignedWord(1355769544);
                        return;
                    }
                    anInt3574 = class68_sub14.readUnsignedWord(1355769544);
                    return;
                } while (false);
                aBoolean2931
                        = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
            } while (false);
        }
    }

    public int[][] method697(int i, boolean bool) {
        anInt3573++;
        int[][] is = aClass88_2939.method1496(i, (byte) 81);
        if (aClass88_2939.aBoolean1610) {
            int[][] is_2_ = this.method699(-51, 0, i);
            int[] is_3_ = is_2_[0];
            int[] is_4_ = is_2_[1];
            int[] is_5_ = is_2_[2];
            int[] is_6_ = is[0];
            int[] is_7_ = is[2];
            int[] is_8_ = is[1];
            for (int i_9_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_9_ ^ 0xffffffff)); i_9_++) {
                int i_10_ = is_3_[i_9_];
                int i_11_ = is_4_[i_9_];
                int i_12_ = is_5_[i_9_];
                if ((anInt3571 ^ 0xffffffff) >= (i_10_ ^ 0xffffffff)) {
                    if ((i_10_ ^ 0xffffffff) >= (anInt3574 ^ 0xffffffff))
                        is_6_[i_9_] = i_10_;
                    else
                        is_6_[i_9_] = anInt3574;
                } else
                    is_6_[i_9_] = anInt3571;
                if ((i_11_ ^ 0xffffffff) <= (anInt3571 ^ 0xffffffff)) {
                    if (anInt3574 < i_11_)
                        is_8_[i_9_] = anInt3574;
                    else
                        is_8_[i_9_] = i_11_;
                } else
                    is_8_[i_9_] = anInt3571;
                if ((i_12_ ^ 0xffffffff) > (anInt3571 ^ 0xffffffff))
                    is_7_[i_9_] = anInt3571;
                else if (anInt3574 < i_12_)
                    is_7_[i_9_] = anInt3574;
                else
                    is_7_[i_9_] = i_12_;
            }
        }
        if (bool != true)
            aRSString_3580 = null;
        return is;
    }

    public Class68_Sub13_Sub9() {
        super(1, false);
    }

    public static void method737(boolean bool) {
        anInt3572++;
        do {
            try {
                if (Class70.anInt1287 == 1) {
                    int i
                            = Class1_Sub2.aClass68_Sub28_Sub1_2433.method1250(-32);
                    if ((i ^ 0xffffffff) < -1
                            && Class1_Sub2.aClass68_Sub28_Sub1_2433
                            .method1258(-1)) {
                        i -= Class68_Sub13_Sub11.anInt3620;
                        if ((i ^ 0xffffffff) > -1)
                            i = 0;
                        Class1_Sub2.aClass68_Sub28_Sub1_2433
                                .method1239((byte) -114, i);
                        break;
                    }
                    Class1_Sub2.aClass68_Sub28_Sub1_2433.method1249(98);
                    Class1_Sub2.aClass68_Sub28_Sub1_2433.method1246(true);
                    client.aClass68_Sub12_2379 = null;
                    if (GameException.aClass21_2236 != null)
                        Class70.anInt1287 = 2;
                    else
                        Class70.anInt1287 = 0;
                    Class93.aClass14_1667 = null;
                }
                if (bool == true)
                    break;
                aSpriteArray3569 = null;
            } catch (Exception exception) {
                exception.printStackTrace();
                Class1_Sub2.aClass68_Sub28_Sub1_2433.method1249(63);
                client.aClass68_Sub12_2379 = null;
                Class93.aClass14_1667 = null;
                Class70.anInt1287 = 0;
                GameException.aClass21_2236 = null;
                break;
            }
            break;
        } while (false);
    }

    public static long method738(int i, int i_13_, int i_14_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_13_][i_14_];
        if (class68_sub1 == null)
            return 0L;
        for (int i_15_ = 0; i_15_ < class68_sub1.anInt2771; i_15_++) {
            Class69 class69 = class68_sub1.aClass69Array2772[i_15_];
            if ((class69.aLong1243 >> 29 & 0x3L) == 2L
                    && class69.anInt1254 == i_13_ && class69.anInt1253 == i_14_)
                return class69.aLong1243;
        }
        return 0L;
    }

    public static boolean method739(boolean bool, int i) {
        anInt3576++;
        if (bool != false)
            method737(false);
        if (i < 48 || (i ^ 0xffffffff) < -58)
            return false;
        return true;
    }

    public int[] method698(byte i, int i_16_) {
        if (i != -61)
            method697(-14, false);
        anInt3583++;
        int[] is = aClass115_2936.method1697(false, i_16_);
        if (aClass115_2936.aBoolean1957) {
            int[] is_17_ = this.method696(0, i_16_, 29149);
            for (int i_18_ = 0;
                 ((i_18_ ^ 0xffffffff)
                         > (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff));
                 i_18_++) {
                int i_19_ = is_17_[i_18_];
                if (i_19_ >= anInt3571) {
                    if (i_19_ <= anInt3574)
                        is[i_18_] = i_19_;
                    else
                        is[i_18_] = anInt3574;
                } else
                    is[i_18_] = anInt3571;
            }
        }
        return is;
    }

    static {
        aRSString_3577 = RSString.newRsString("Fertigkeit)2");
        aRSString_3581
                = RSString.newRsString("Verbindung mit Update)2Server)3)3)3");
        anIntArray3578
                = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
        aClass43Array3570 = new Class43[50];
        anIntArray3582 = new int[100];
        aRSString_3580 = RSString.newRsString("hint_headicons");
    }
}
