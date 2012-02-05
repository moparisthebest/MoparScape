/* Class68_Sub13_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub35 extends Class68_Sub13 {
    public static int anInt4016;
    public static int anInt4017;
    public int anInt4018 = 0;
    public static int anInt4019;
    public static int anInt4020;
    public static RSString aRSString_4021 = RSString.newRsString("mapflag");
    public static int[] anIntArray4022
            = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
            19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
            36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52,
            53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78,
            83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107,
            108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125,
            133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155,
            157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181,
            182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194,
            195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207,
            208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220,
            221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233,
            234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246,
            247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87,
            87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109,
            109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139,
            139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158,
            158, 253, 254, 170, 170, 170, 170, 178, 255, 178};
    public static short[] aShortArray4023;
    public int anInt4024 = 1365;
    public int anInt4025 = 20;
    public static int anInt4026;
    public int anInt4027 = 0;
    public static byte[][][] aByteArrayArrayArray4028;
    public static int anInt4029;

    public Class68_Sub13_Sub35() {
        super(0, true);
    }

    public static int method876(int i, int i_0_, int i_1_) {
        anInt4029++;
        Class68_Sub22 class68_sub22
                = ((Class68_Sub22)
                Class68_Sub13_Sub8.aClass113_3564.method1678((long) i_0_,
                        i_1_ ^ ~0x5074));
        if (i_1_ != 20558)
            method877((byte) 96, null);
        if (class68_sub22 == null)
            return 0;
        if ((i ^ 0xffffffff) > -1 || class68_sub22.anIntArray3141.length <= i)
            return 0;
        return class68_sub22.anIntArray3141[i];
    }

    public static void method877(byte i, Stream class68_sub14) {
        while ((class68_sub14.currentOffset ^ 0xffffffff)
                > (class68_sub14.buffer.length ^ 0xffffffff)) {
            int i_2_ = 0;
            boolean bool = false;
            int i_3_ = 0;
            if (class68_sub14.readUnsignedByte(-6677) == 1) {
                i_2_ = class68_sub14.readUnsignedByte(-6677);
                i_3_ = class68_sub14.readUnsignedByte(-6677);
                bool = true;
            }
            int i_4_ = class68_sub14.readUnsignedByte(-6677);
            int i_5_ = class68_sub14.readUnsignedByte(-6677);
            int i_6_ = -Class70.anInt1273 + 64 * i_4_;
            int i_7_ = (Class103.anInt1768 - (1 + -Class68_Sub1.anInt2760)
                    - 64 * i_5_);
            if ((i_6_ ^ 0xffffffff) > -1 || -63 + i_7_ < 0
                    || i_6_ + 63 >= Class68_Sub6.anInt2846
                    || Class103.anInt1768 <= i_7_) {
                for (int i_8_ = 0; i_8_ < (!bool ? 4096 : 64); i_8_++) {
                    byte i_9_ = class68_sub14.method955(i + 3321);
                    if ((i_9_ ^ 0xffffffff) != -1)
                        class68_sub14.currentOffset++;
                }
            } else {
                int i_10_ = i_6_ >> 1962666918;
                int i_11_ = i_7_ >> 1252998118;
                for (int i_12_ = 0; i_12_ < 64; i_12_++) {
                    for (int i_13_ = 0; i_13_ < 64; i_13_++) {
                        if (!bool
                                || ((i_2_ * 8 ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)
                                && (i_12_ ^ 0xffffffff) > (8 * i_2_ + 8
                                ^ 0xffffffff)
                                && i_3_ * 8 <= i_13_
                                && ((8 + i_3_ * 8 ^ 0xffffffff)
                                < (i_13_ ^ 0xffffffff)))) {
                            byte i_14_ = class68_sub14.method955(3390);
                            if ((i_14_ ^ 0xffffffff) != -1) {
                                if ((Class48.aByteArrayArrayArray949[i_10_]
                                        [i_11_])
                                        == null)
                                    Class48.aByteArrayArrayArray949[i_10_]
                                            [i_11_]
                                            = new byte[4096];
                                Class48.aByteArrayArrayArray949[i_10_]
                                        [i_11_]
                                        [(-i_13_ + 63 << -248863738) + i_12_]
                                        = i_14_;
                                byte i_15_ = class68_sub14.method955(3390);
                                if ((Class49.aByteArrayArrayArray970[i_10_]
                                        [i_11_])
                                        == null)
                                    Class49.aByteArrayArrayArray970[i_10_]
                                            [i_11_]
                                            = new byte[4096];
                                Class49.aByteArrayArrayArray970[i_10_]
                                        [i_11_]
                                        [i_12_ + (63 + -i_13_ << -1094152442)]
                                        = i_15_;
                            }
                        }
                    }
                }
            }
        }
        anInt4020++;
        if (i != 69)
            aShortArray4023 = null;
    }

    public void method700(Stream class68_sub14, int i, int i_16_) {
        anInt4016++;
        if (i_16_ != -1)
            anInt4018 = -80;
        int i_17_ = i;
        while_164_:
        do {
            while_163_:
            do {
                do {
                    if ((i_17_ ^ 0xffffffff) != -1) {
                        if (i_17_ != 1) {
                            if (i_17_ != 2) {
                                if ((i_17_ ^ 0xffffffff) != -4)
                                    break while_164_;
                            } else
                                break;
                            break while_163_;
                        }
                    } else {
                        anInt4024
                                = class68_sub14.readUnsignedWord(i_16_ ^ ~0x50cf66c8);
                        return;
                    }
                    anInt4025 = class68_sub14.readUnsignedWord(1355769544);
                    return;
                } while (false);
                anInt4027 = class68_sub14.readUnsignedWord(i_16_ ^ ~0x50cf66c8);
                return;
            } while (false);
            anInt4018 = class68_sub14.readUnsignedWord(i_16_ + 1355769545);
        } while (false);
    }

    public int[] method698(byte i, int i_18_) {
        if (i != -61)
            aByteArrayArrayArray4028 = null;
        int[] is = aClass115_2936.method1697(false, i_18_);
        if (aClass115_2936.aBoolean1957) {
            for (int i_19_ = 0; Class68_Sub13_Sub19.anInt3746 > i_19_;
                 i_19_++) {
                int i_20_
                        = anInt4027 + (Class68_Sub13_Sub3.anIntArray3479[i_19_]
                        << -257137684) / anInt4024;
                int i_21_ = anInt4018 + (Class13_Sub3.anIntArray2672[i_18_]
                        << 2125293196) / anInt4024;
                int i_22_ = i_20_;
                int i_23_ = i_21_;
                int i_24_ = i_20_;
                int i_25_ = i_21_;
                int i_26_ = 0;
                int i_27_ = i_21_ * i_21_ >> -753809620;
                for (int i_28_ = i_20_ * i_20_ >> -649432308;
                     ((i_28_ + i_27_ ^ 0xffffffff) > -16385
                             && (anInt4025 ^ 0xffffffff) < (i_26_ ^ 0xffffffff));
                     i_27_ = i_25_ * i_25_ >> -1870905716) {
                    i_26_++;
                    i_25_ = i_23_ + (i_25_ * i_24_ >> -1604113332) * 2;
                    i_24_ = i_22_ + i_28_ + -i_27_;
                    i_28_ = i_24_ * i_24_ >> 1006622892;
                }
                is[i_19_] = (i_26_ >= anInt4025 + -1 ? 0
                        : (i_26_ << -1158003732) / anInt4025);
            }
        }
        anInt4017++;
        return is;
    }

    public static void method878(byte i, int i_29_) {
        anInt4019++;
        Class68_Sub13.method701(0);
        Class68_Sub13_Sub34.method870(i + -65);
        int i_30_ = Class68_Sub13_Sub23.method813(-85, i_29_).anInt564;
        if ((i_30_ ^ 0xffffffff) != -1) {
            int i_31_ = Class103.anIntArray1767[i_29_];
            if (i == 67) {
                if (i_30_ == 9)
                    Class108.anInt1824 = i_31_;
                if ((i_30_ ^ 0xffffffff) == -7)
                    Class68_Sub13_Sub19.anInt3755 = i_31_;
                if (i_30_ == 5)
                    Class14.anInt228 = i_31_;
            }
        }
    }

    public static void method879(byte i) {
        aShortArray4023 = null;
        aByteArrayArrayArray4028 = null;
        if (i < -121) {
            anIntArray4022 = null;
            aRSString_4021 = null;
        }
    }
}
