/* PacketParser - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.util.zip.CRC32;

public class PacketParser {
    public static int[] anIntArray1861 = {2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2};
    public static int anInt1862;
    public static int[] anIntArray1863;
    public static RSString aRSString_1864 = RSString.newRsString("shake:");
    public static int anInt1865;
    public static int anInt1866;
    public static RSString aRSString_1867 = aRSString_1864;
    public static int anInt1868;
    public static int anInt1869;
    public static RSString aRSString_1870;
    public static int anInt1871;
    public static CRC32 aCRC32_1872;
    public static int anInt1873;
    public static Class113 aClass113_1874;
    public static int anInt1875;
    public static int[] anIntArray1876;

    public static boolean method1661(byte[] is, int i, int i_0_, int i_1_) {
        if (i != -32692)
            anIntArray1876 = null;
        anInt1865++;
        boolean bool = true;
        Stream class68_sub14 = new Stream(is);
        int i_2_ = -1;
        for (; ; ) {
            int i_3_ = class68_sub14.method937(true);
            if ((i_3_ ^ 0xffffffff) == -1)
                break;
            i_2_ += i_3_;
            int i_4_ = 0;
            boolean bool_5_ = false;
            for (; ; ) {
                if (bool_5_) {
                    int i_6_ = class68_sub14.method912(255);
                    if ((i_6_ ^ 0xffffffff) == -1)
                        break;
                    class68_sub14.readUnsignedByte(-6677);
                } else {
                    int i_7_ = class68_sub14.method912(255);
                    if ((i_7_ ^ 0xffffffff) == -1)
                        break;
                    i_4_ += i_7_ - 1;
                    int i_8_ = 0x3f & i_4_;
                    int i_9_ = (0xfe6 & i_4_) >> -693368570;
                    int i_10_ = i_8_ - -i_0_;
                    int i_11_ = i_9_ - -i_1_;
                    int i_12_ = class68_sub14.readUnsignedByte(-6677) >> 1429884258;
                    if (i_11_ > 0 && (i_10_ ^ 0xffffffff) < -1
                            && (i_11_ ^ 0xffffffff) > -104 && i_10_ < 103) {
                        Class116 class116
                                = Class1_Sub5.method140(i + 32781, i_2_);
                        if ((i_12_ ^ 0xffffffff) != -23 || ISAACRandomGen.aBoolean1487
                                || class116.anInt1983 != 0
                                || (class116.anInt2022 ^ 0xffffffff) == -2
                                || class116.aBoolean2004) {
                            if (!class116.method1712(107)) {
                                bool = false;
                                Class45.anInt925++;
                            }
                            bool_5_ = true;
                        }
                    }
                }
            }
        }
        return bool;
    }

    public static void method1662(boolean bool, int i, int i_13_, int i_14_,
                                  Class21renamed class21, boolean bool_15_,
                                  int i_16_) {
        if (bool_15_ != false)
            method1666((byte) 81);
        Class68_Sub20_Sub15.anInt4403 = i_14_;
        Class68_Sub13_Sub11.anInt3620 = i_13_;
        Class105.anInt1794 = i;
        Class52.aBoolean998 = bool;
        Class67.anInt1217 = i_16_;
        GameException.aClass21_2236 = class21;
        anInt1871++;
        Class70.anInt1287 = 1;
    }

    public static void method1663(int i, int i_17_, int i_18_) {
        anInt1866++;
        int[] is = new int[4];
        int[] is_19_ = new int[4];
        is[0] = i_17_;
        int i_20_ = 1;
        is_19_[0] = i_18_;
        for (int i_21_ = 0; i_21_ < 4; i_21_++) {
            if ((i_17_ ^ 0xffffffff)
                    != (Class68_Sub13_Sub26_Sub1.anIntArray4609[i_21_]
                    ^ 0xffffffff)) {
                is[i_20_] = Class68_Sub13_Sub26_Sub1.anIntArray4609[i_21_];
                is_19_[i_20_] = Class51.anIntArray2257[i_21_];
                i_20_++;
            }
        }
        Class51.anIntArray2257 = is_19_;
        if (i <= 104)
            method1664(39);
        Class68_Sub13_Sub26_Sub1.anIntArray4609 = is;
        Class28.method392(Class1_Sub6.aClass93Array2529.length - 1, -228,
                Class1_Sub6.aClass93Array2529, 0);
    }

    public static boolean method1664(int i) {
        anInt1869++;
        if (i != 20778)
            aRSString_1870 = null;
        if ((Class70.anInt1287 ^ 0xffffffff) != -1)
            return true;
        return Class1_Sub2.aClass68_Sub28_Sub1_2433.method1258(-1);
    }

    public static void method1665(Class21renamed class21, byte i,
                                  Class21renamed class21_22_) {
        do {
            try {
                anInt1862++;
                Class1_Sub1.aClass21_2427 = class21;
                Class84.aClass21_1537 = class21_22_;
                if (i == 82)
                    break;
                aClass113_1874 = null;
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("tb.E("
                                + (class21 != null ? "{...}"
                                : "null")
                                + ',' + i + ','
                                + (class21_22_ != null ? "{...}"
                                : "null")
                                + ')'));
            }
            break;
        } while (false);
    }

    public static void method1666(byte i) {
        aRSString_1867 = null;
        aRSString_1870 = null;
        if (i <= -8) {
            anIntArray1863 = null;
            aRSString_1864 = null;
            anIntArray1876 = null;
            aCRC32_1872 = null;
            anIntArray1861 = null;
            aClass113_1874 = null;
        }
    }

    public static boolean method1667(int i) throws IOException {
        anInt1873++;
        if (PlayerDefinition.connection == null)
            return false;
        int i_23_ = PlayerDefinition.connection.available();
        if ((i_23_ ^ 0xffffffff) == -1)
            return false;
        if ((Class49.anInt962 ^ 0xffffffff) == 0) {
            i_23_--;
            PlayerDefinition.connection.flushInputStream(1,
                    (Class68_Sub13_Sub8
                            .inStream
                            .buffer));
            Class68_Sub13_Sub8.inStream.currentOffset = 0;
            Class49.anInt962
                    = Class68_Sub13_Sub8.inStream.method972(255);
            Class106.anInt1804 = Class9.anIntArray178[Class49.anInt962];
        }
        if (i != -26354)
            aRSString_1867 = null;
        if (Class106.anInt1804 == -1) {
            if ((i_23_ ^ 0xffffffff) >= -1)
                return false;
            PlayerDefinition.connection.flushInputStream(1,
                    (Class68_Sub13_Sub8
                            .inStream
                            .buffer));
            Class106.anInt1804
                    = 0xff & (Class68_Sub13_Sub8.inStream
                    .buffer[0]);
            i_23_--;
        }
        if (Class106.anInt1804 == -2) {
            if ((i_23_ ^ 0xffffffff) < -2) {
                i_23_ -= 2;
                PlayerDefinition.connection.flushInputStream(2,
                        (Class68_Sub13_Sub8
                                .inStream
                                .buffer));
                Class68_Sub13_Sub8.inStream.currentOffset = 0;
                Class106.anInt1804
                        = Class68_Sub13_Sub8.inStream
                        .readUnsignedWord(1355769544);
            } else
                return false;
        }
        if (Class106.anInt1804 > i_23_)
            return false;
        Class68_Sub13_Sub8.inStream.currentOffset = 0;
        PlayerDefinition.connection.flushInputStream(Class106.anInt1804,
                (Class68_Sub13_Sub8
                        .inStream
                        .buffer));
        Class68_Sub20_Sub13.anInt4368 = 0;
        Class68_Sub20_Sub7.anInt4252 = Class68_Sub20_Sub6.anInt4240;
        Class68_Sub20_Sub6.anInt4240 = Class68_Sub20.anInt3086;
        Class68_Sub20.anInt3086 = Class49.anInt962;
        if (Class49.anInt962 == 93) {
            int i_24_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
            int i_25_ = Class68_Sub13_Sub8.inStream.readUnsignedByteA();
            int i_26_ = Class68_Sub13_Sub8.inStream.readDWord();
            Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1512.method1678((long) i_26_, 103));
            if (class68_sub3 != null)
                Class68_Sub13_Sub10.method744(class68_sub3, true, class68_sub3.anInt2803 != i_24_);
            Class32.method409(i_25_, i_24_, -58, i_26_);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 217) {
            Class68_Sub13.method701(0);
            int i_27_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
            int i_28_ = Class68_Sub13_Sub8.inStream.readDWord_v2(false);
            int i_29_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
            Class1_Sub5.anIntArray2516[i_29_] = i_28_;
            Class30.anIntArray548[i_29_] = i_27_;
            Class88.anIntArray1603[i_29_] = 1;
            for (int i_30_ = 0; i_30_ < 98; i_30_++) {
                if (i_28_ >= GameSocket.anIntArray1128[i_30_])
                    Class88.anIntArray1603[i_29_] = i_30_ + 2;
            }
            Class68_Sub13_Sub36.anIntArray4044[Class120.method1740(31, Class30.anInt544++)] = i_29_;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 57) {
            int i_31_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            int i_32_ = Class68_Sub13_Sub8.inStream.readUnsignedByteA();
            int i_33_ = Class68_Sub13_Sub8.inStream.readUnsignedByteA();
            GameSocket.anInt1149 = i_31_ >> 1847841633;
            Class68_Sub7.aClass1_Sub6_Sub2_2860
                    .method147(i_32_, (byte) -68, i_33_, (i_31_ & 0x1) == 1);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 132) {
            Class68_Sub13_Sub11.method747(Class68_Sub13_Sub8.inStream.readString(127), (byte) 125);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -211) {
            if (Class68_Sub13_Sub10.anInt3595 != -1)
                GameException
                        .method1796(89, Class68_Sub13_Sub10.anInt3595, 0);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -42) {
            int i_34_
                    = Class68_Sub13_Sub8.inStream.readDWord_v1();
            int i_35_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_34_, (byte) -80);
            if (class45 != null && class45.anInt896 == 0) {
                if ((class45.anInt794 + -class45.anInt873 ^ 0xffffffff)
                        > (i_35_ ^ 0xffffffff))
                    i_35_ = class45.anInt794 + -class45.anInt873;
                if (i_35_ < 0)
                    i_35_ = 0;
                if ((class45.anInt818 ^ 0xffffffff) != (i_35_ ^ 0xffffffff)) {
                    class45.anInt818 = i_35_;
                    Class113.method1682(class45, -124);
                }
            }
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -224) {
            int i_36_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            int i_37_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            if (i_37_ == 65535)
                i_37_ = -1;
            int i_38_ = Class68_Sub13_Sub8.inStream
                    .method940((byte) 121);
            if ((i_36_ ^ 0xffffffff) == -65536)
                i_36_ = -1;
            int i_39_ = Class68_Sub13_Sub8.inStream
                    .method940((byte) 126);
            for (int i_40_ = i_37_;
                 (i_40_ ^ 0xffffffff) >= (i_36_ ^ 0xffffffff); i_40_++) {
                long l = ((long) i_38_ << -1214487776) + (long) i_40_;
                Class68 class68 = Class106.aClass113_1803.method1678(l, -115);
                if (class68 != null)
                    class68.method647(i ^ 0x2260);
                Class106.aClass113_1803
                        .method1677((byte) 120, new Class68_Sub10(i_39_), l);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 115) {
            Class45.anInt917 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            Class123.anInt2130 = Class68_Sub22.anInt3148;
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -56) {
            Class69.method1328(Class68_Sub13_Sub8.inStream, 24);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -118) {
            int i_41_ = (Class106.anInt1804 + Class68_Sub13_Sub8.inStream.currentOffset);
            int i_42_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
            int i_43_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
            if ((i_42_ ^ 0xffffffff) != (Class68_Sub13_Sub10.anInt3595 ^ 0xffffffff)) {
                Class68_Sub13_Sub10.anInt3595 = i_42_;
                Class76.method1406(Class68_Sub13_Sub10.anInt3595, (byte) 108);
                Canvas_Sub1.method47(false, 640);
                Class71.method1340(-1, Class68_Sub13_Sub10.anInt3595);
                for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > -101; i_44_++)
                    Class121.aBooleanArray2109[i_44_] = true;
            }
            while ((i_43_-- ^ 0xffffffff) < -1) {
                int i_45_ = Class68_Sub13_Sub8.inStream.readDWord();
                int i_46_ = Class68_Sub13_Sub8.inStream
                        .readUnsignedWord(i + 1355795898);
                int i_47_ = Class68_Sub13_Sub8.inStream
                        .readUnsignedByte(-6677);
                Class68_Sub3 class68_sub3
                        = ((Class68_Sub3)
                        Login.aClass113_1512.method1678((long) i_45_, 82));
                if (class68_sub3 != null && i_46_ != class68_sub3.anInt2803) {
                    Class68_Sub13_Sub10.method744(class68_sub3, true, true);
                    class68_sub3 = null;
                }
                if (class68_sub3 == null)
                    class68_sub3
                            = Class32.method409(i_47_, i_46_, i ^ ~0x668c, i_45_);
                class68_sub3.aBoolean2808 = true;
            }
            for (Class68_Sub3 class68_sub3
                         = ((Class68_Sub3)
                    Login.aClass113_1512.method1679(-32642));
                 class68_sub3 != null;
                 class68_sub3 = (Class68_Sub3) Login.aClass113_1512
                         .method1683((byte) -122)) {
                if (class68_sub3.aBoolean2808)
                    class68_sub3.aBoolean2808 = false;
                else
                    Class68_Sub13_Sub10.method744(class68_sub3, true, true);
            }
            Class106.aClass113_1803.method1684(false);
            while ((Class68_Sub13_Sub8.inStream.currentOffset
                    ^ 0xffffffff)
                    > (i_41_ ^ 0xffffffff)) {
                int i_48_ = Class68_Sub13_Sub8.inStream.readDWord();
                int i_49_ = Class68_Sub13_Sub8.inStream
                        .readUnsignedWord(1355769544);
                int i_50_ = Class68_Sub13_Sub8.inStream
                        .readUnsignedWord(1355769544);
                int i_51_ = Class68_Sub13_Sub8.inStream.readDWord();
                for (int i_52_ = i_49_;
                     (i_52_ ^ 0xffffffff) >= (i_50_ ^ 0xffffffff); i_52_++) {
                    long l = (long) i_52_ + ((long) i_48_ << -1002536224);
                    Class106.aClass113_1803
                            .method1677((byte) -27, new Class68_Sub10(i_51_), l);
                }
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 64) {
            int i_53_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            if ((i_53_ ^ 0xffffffff) == -65536)
                i_53_ = -1;
            int i_54_ = Class68_Sub13_Sub8.inStream.readDWord_v1();
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_54_, (byte) -80);
            if ((class45.anInt865 ^ 0xffffffff) != -2
                    || i_53_ != class45.anInt803) {
                class45.anInt803 = i_53_;
                class45.anInt865 = 1;
                Class113.method1682(class45, -116);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -241) {
            Class68_Sub13_Sub26.anInt3880 = Class106.anInt1804 / 8;
            for (int i_55_ = 0; ((Class68_Sub13_Sub26.anInt3880 ^ 0xffffffff)
                    < (i_55_ ^ 0xffffffff)); i_55_++) {
                Class21_Sub1.aLongArray2703[i_55_]
                        = Class68_Sub13_Sub8.inStream
                        .readQWord(Class15.method278(i, -26299));
                Class68_Sub4.aRSStringArray2827[i_55_]
                        = Class56.method570(Class21_Sub1.aLongArray2703[i_55_],
                        -1);
            }
            Class123.anInt2130 = Class68_Sub22.anInt3148;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 154) {
            long l = Class68_Sub13_Sub8.inStream
                    .readQWord(i + 26465);
            int i_56_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            int i_57_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            RSString class100 = Class68_Sub28_Sub2.aRSString_4556;
            if (i_56_ > 0)
                class100 = Class68_Sub13_Sub8.inStream
                        .readString(127);
            boolean bool = true;
            if ((l ^ 0xffffffffffffffffL) > -1L) {
                bool = false;
                l &= 0x7fffffffffffffffL;
            }
            RSString class100_58_
                    = Class56.method570(l, i ^ 0x66f1).method1597(12688);
            for (int i_59_ = 0; i_59_ < Class32.anInt573; i_59_++) {
                if (l == Class68_Sub13_Sub21.aLongArray3802[i_59_]) {
                    if (Class98.anIntArray1724[i_59_] != i_56_) {
                        Class98.anIntArray1724[i_59_] = i_56_;
                        if ((i_56_ ^ 0xffffffff) < -1)
                            Class48.method520
                                    (Class68_Sub28_Sub2.aRSString_4556, 127,
                                            (Class68_Sub20_Sub13_Sub2.method1166
                                                    (i + 26356, (new RSString[]
                                                            {class100_58_,
                                                                    Class127.aRSString_2208}))),
                                            5);
                        if (i_56_ == 0)
                            Class48.method520
                                    (Class68_Sub28_Sub2.aRSString_4556, -38,
                                            (Class68_Sub20_Sub13_Sub2.method1166
                                                    (i + 26356,
                                                            (new RSString[]
                                                                    {class100_58_,
                                                                            Class72_Sub1.aRSString_3272}))),
                                            5);
                    }
                    Class68_Sub1.aRSStringArray2754[i_59_] = class100;
                    class100_58_ = null;
                    Class68_Sub4.anIntArray2828[i_59_] = i_57_;
                    Class68_Sub13_Sub29.aBooleanArray3941[i_59_] = bool;
                    break;
                }
            }
            if (class100_58_ != null && Class32.anInt573 < 200) {
                Class68_Sub13_Sub21.aLongArray3802[Class32.anInt573] = l;
                Class68_Sub13_Sub38.aRSStringArray4084[Class32.anInt573]
                        = class100_58_;
                Class98.anIntArray1724[Class32.anInt573] = i_56_;
                Class68_Sub1.aRSStringArray2754[Class32.anInt573] = class100;
                Class68_Sub4.anIntArray2828[Class32.anInt573] = i_57_;
                Class68_Sub13_Sub29.aBooleanArray3941[Class32.anInt573] = bool;
                Class32.anInt573++;
            }
            Class123.anInt2130 = Class68_Sub22.anInt3148;
            int i_60_ = Class32.anInt573;
            boolean bool_61_ = false;
            while (i_60_ > 0) {
                bool_61_ = true;
                i_60_--;
                for (int i_62_ = 0; i_62_ < i_60_; i_62_++) {
                    if ((Class98.anIntArray1724[i_62_] != Class106.anInt1799
                            && ((Class106.anInt1799 ^ 0xffffffff)
                            == (Class98.anIntArray1724[1 + i_62_]
                            ^ 0xffffffff)))
                            || (Class98.anIntArray1724[i_62_] == 0
                            && Class98.anIntArray1724[i_62_ + 1] != 0)) {
                        int i_63_ = Class98.anIntArray1724[i_62_];
                        bool_61_ = false;
                        Class98.anIntArray1724[i_62_]
                                = Class98.anIntArray1724[i_62_ - -1];
                        Class98.anIntArray1724[i_62_ - -1] = i_63_;
                        RSString class100_64_
                                = Class68_Sub1.aRSStringArray2754[i_62_];
                        Class68_Sub1.aRSStringArray2754[i_62_]
                                = Class68_Sub1.aRSStringArray2754[i_62_ + 1];
                        Class68_Sub1.aRSStringArray2754[1 + i_62_]
                                = class100_64_;
                        RSString class100_65_
                                = Class68_Sub13_Sub38.aRSStringArray4084[i_62_];
                        Class68_Sub13_Sub38.aRSStringArray4084[i_62_]
                                = (Class68_Sub13_Sub38.aRSStringArray4084
                                [i_62_ - -1]);
                        Class68_Sub13_Sub38.aRSStringArray4084[1 + i_62_]
                                = class100_65_;
                        long l_66_ = Class68_Sub13_Sub21.aLongArray3802[i_62_];
                        Class68_Sub13_Sub21.aLongArray3802[i_62_]
                                = Class68_Sub13_Sub21.aLongArray3802[i_62_ - -1];
                        Class68_Sub13_Sub21.aLongArray3802[1 + i_62_] = l_66_;
                        int i_67_ = Class68_Sub4.anIntArray2828[i_62_];
                        Class68_Sub4.anIntArray2828[i_62_]
                                = Class68_Sub4.anIntArray2828[1 + i_62_];
                        Class68_Sub4.anIntArray2828[i_62_ + 1] = i_67_;
                        boolean bool_68_
                                = Class68_Sub13_Sub29.aBooleanArray3941[i_62_];
                        Class68_Sub13_Sub29.aBooleanArray3941[i_62_]
                                = Class68_Sub13_Sub29.aBooleanArray3941[1 + i_62_];
                        Class68_Sub13_Sub29.aBooleanArray3941[i_62_ - -1]
                                = bool_68_;
                    }
                }
                if (bool_61_)
                    break;
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 229) {
            long l = Class68_Sub13_Sub8.inStream.readQWord(61);
            Class68_Sub13_Sub8.inStream.method955(3390);
            long l_69_
                    = Class68_Sub13_Sub8.inStream.readQWord(105);
            long l_70_ = (long) Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            boolean bool = false;
            long l_71_ = (long) Class68_Sub13_Sub8.inStream
                    .method921((byte) 87);
            long l_72_ = l_71_ + (l_70_ << 255256160);
            int i_73_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i + 19677);
            while_150_:
            do {
                for (int i_74_ = 0; (i_74_ ^ 0xffffffff) > -101; i_74_++) {
                    if ((l_72_ ^ 0xffffffffffffffffL)
                            == (Class97.aLongArray1711[i_74_]
                            ^ 0xffffffffffffffffL)) {
                        bool = true;
                        break while_150_;
                    }
                }
                if ((i_73_ ^ 0xffffffff) >= -2) {
                    if (Class25.anInt517 == 1 || Class30.anInt552 == 1)
                        bool = true;
                    else {
                        for (int i_75_ = 0;
                             Class68_Sub13_Sub26.anInt3880 > i_75_; i_75_++) {
                            if ((Class21_Sub1.aLongArray2703[i_75_]
                                    ^ 0xffffffffffffffffL)
                                    == (l ^ 0xffffffffffffffffL)) {
                                bool = true;
                                break;
                            }
                        }
                    }
                }
            } while (false);
            if (!bool && Class116.anInt2011 == 0) {
                Class97.aLongArray1711[GameSocket.anInt1138] = l_72_;
                GameSocket.anInt1138 = (GameSocket.anInt1138 - -1) % 100;
                RSString class100
                        = (Class68_Sub20_Sub1.method1009
                        (Class68_Sub19.method996
                                (i + 26266,
                                        Class68_Sub13_Sub8.inStream)
                                .method1616(2)));
                if (i_73_ == 2 || i_73_ == 3)
                    Class8.method203(false,
                            (Class68_Sub20_Sub13_Sub2.method1166
                                    (2, (new RSString[]
                                            {Class68_Sub13_Sub4.aRSString_3492,
                                                    Class56.method570
                                                            (l, i ^ 0x66f1)
                                                            .method1597(12688)}))),
                            class100,
                            Class56.method570(l_69_, i + 26353)
                                    .method1597(12688),
                            9);
                else if ((i_73_ ^ 0xffffffff) != -2)
                    Class8.method203
                            (false, Class56.method570(l, -1).method1597(12688),
                                    class100,
                                    Class56.method570(l_69_, -1).method1597(12688), 9);
                else
                    Class8.method203(false,
                            (Class68_Sub20_Sub13_Sub2.method1166
                                    (2,
                                            (new RSString[]
                                                    {Class68_Sub13_Sub27.aRSString_3902,
                                                            Class56.method570(l, -1)
                                                                    .method1597(12688)}))),
                            class100,
                            Class56.method570(l_69_, -1)
                                    .method1597(i ^ ~0x5761),
                            9);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 124) {
            Class68_Sub28_Sub1.anInt4491 = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
            Class93.anInt1668
                    = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            while ((Class106.anInt1804 ^ 0xffffffff)
                    < (Class68_Sub13_Sub8.inStream.currentOffset
                    ^ 0xffffffff)) {
                Class49.anInt962 = Class68_Sub13_Sub8
                        .inStream
                        .readUnsignedByte(i ^ 0x7ce5);
                Class68_Sub13_Sub18.method789(-1);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -30 || Class49.anInt962 == 232
                || (Class49.anInt962 ^ 0xffffffff) == -51 || Class49.anInt962 == 21
                || Class49.anInt962 == 75
                || (Class49.anInt962 ^ 0xffffffff) == -249
                || Class49.anInt962 == 112
                || (Class49.anInt962 ^ 0xffffffff) == -202
                || (Class49.anInt962 ^ 0xffffffff) == -26
                || Class49.anInt962 == 110 || Class49.anInt962 == 196
                || Class49.anInt962 == 30) {
            Class68_Sub13_Sub18.method789(-1);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 121) {
            long l = Class68_Sub13_Sub8.inStream.readQWord(46);
            int i_76_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            byte i_77_ = Class68_Sub13_Sub8.inStream
                    .method955(i ^ ~0x6bcf);
            boolean bool = false;
            if ((l & ~0x7fffffffffffffffL ^ 0xffffffffffffffffL) != -1L)
                bool = true;
            if (bool) {
                if (Class68_Sub20_Sub8.anInt4278 == 0) {
                    Class49.anInt962 = -1;
                    return true;
                }
                l &= 0x7fffffffffffffffL;
                boolean bool_78_ = false;
                int i_79_;
                for (i_79_ = 0; Class68_Sub20_Sub8.anInt4278 > i_79_;
                     i_79_++) {
                    if ((Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                            [i_79_].aLong1218) == l
                            && i_76_ == (Class68_Sub20_Sub13_Sub2
                            .aClass68_Sub19Array4630[i_79_]
                            .anInt3067))
                        break;
                }
                if (i_79_ < Class68_Sub20_Sub8.anInt4278) {
                    for (/**/; i_79_ < -1 + Class68_Sub20_Sub8.anInt4278;
                             i_79_++)
                        Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630[i_79_]
                                = (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                                [1 + i_79_]);
                    Class68_Sub20_Sub8.anInt4278--;
                    Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                            [Class68_Sub20_Sub8.anInt4278]
                            = null;
                }
            } else {
                RSString class100 = Class68_Sub13_Sub8
                        .inStream
                        .readString(127);
                Class68_Sub19 class68_sub19 = new Class68_Sub19();
                class68_sub19.aLong1218 = l;
                class68_sub19.aRSString_3073
                        = Class56.method570(class68_sub19.aLong1218, i + 26353);
                class68_sub19.anInt3067 = i_76_;
                class68_sub19.aRSString_3076 = class100;
                class68_sub19.aByte3075 = i_77_;
                int i_80_;
                for (i_80_ = Class68_Sub20_Sub8.anInt4278 + -1; i_80_ >= 0;
                     i_80_--) {
                    int i_81_
                            = Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                            [i_80_].aRSString_3073
                            .method1614(false, class68_sub19.aRSString_3073);
                    if ((i_81_ ^ 0xffffffff) == -1) {
                        Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                                [i_80_].anInt3067
                                = i_76_;
                        Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                                [i_80_].aByte3075
                                = i_77_;
                        Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                                [i_80_].aRSString_3076
                                = class100;
                        if (l == Class72_Sub1.aLong3285)
                            Class68.aByte1225 = i_77_;
                        Class49.anInt962 = -1;
                        Class68_Sub28_Sub2.anInt4547 = Class68_Sub22.anInt3148;
                        return true;
                    }
                    if ((i_81_ ^ 0xffffffff) > -1)
                        break;
                }
                if ((Class68_Sub20_Sub8.anInt4278 ^ 0xffffffff)
                        <= (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630.length
                        ^ 0xffffffff)) {
                    Class49.anInt962 = -1;
                    return true;
                }
                for (int i_82_ = Class68_Sub20_Sub8.anInt4278 - 1;
                     i_80_ < i_82_; i_82_--)
                    Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630[1 + i_82_]
                            = (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                            [i_82_]);
                if ((Class68_Sub20_Sub8.anInt4278 ^ 0xffffffff) == -1)
                    Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630
                            = new Class68_Sub19[100];
                Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630[1 + i_80_]
                        = class68_sub19;
                if ((l ^ 0xffffffffffffffffL)
                        == (Class72_Sub1.aLong3285 ^ 0xffffffffffffffffL))
                    Class68.aByte1225 = i_77_;
                Class68_Sub20_Sub8.anInt4278++;
            }
            Class49.anInt962 = -1;
            Class68_Sub28_Sub2.anInt4547 = Class68_Sub22.anInt3148;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -90) {
            long l = Class68_Sub13_Sub8.inStream.readQWord(81);
            RSString class100
                    = (Class68_Sub20_Sub1.method1009
                    (Class68_Sub19.method996
                            (25, Class68_Sub13_Sub8.inStream)
                            .method1616(2)));
            Class48.method520(Class56.method570(l, -1).method1597(12688), -67,
                    class100, 6);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -143) {
            Class68_Sub13_Sub15.method768((byte) 95, false);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -150) {
            long l = Class68_Sub13_Sub8.inStream
                    .readQWord(i + 26456);
            long l_83_ = (long) Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            long l_84_ = (long) Class68_Sub13_Sub8.inStream
                    .method921((byte) -69);
            long l_85_ = l_84_ + (l_83_ << 1243878112);
            int i_86_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i + 19677);
            boolean bool = false;
            int i_87_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            while_151_:
            do {
                for (int i_88_ = 0; (i_88_ ^ 0xffffffff) > -101; i_88_++) {
                    if ((Class97.aLongArray1711[i_88_] ^ 0xffffffffffffffffL)
                            == (l_85_ ^ 0xffffffffffffffffL)) {
                        bool = true;
                        break while_151_;
                    }
                }
                if ((i_86_ ^ 0xffffffff) >= -2) {
                    for (int i_89_ = 0;
                         ((Class68_Sub13_Sub26.anInt3880 ^ 0xffffffff)
                                 < (i_89_ ^ 0xffffffff));
                         i_89_++) {
                        if ((l ^ 0xffffffffffffffffL)
                                == (Class21_Sub1.aLongArray2703[i_89_]
                                ^ 0xffffffffffffffffL)) {
                            bool = true;
                            break;
                        }
                    }
                }
            } while (false);
            if (!bool && (Class116.anInt2011 ^ 0xffffffff) == -1) {
                Class97.aLongArray1711[GameSocket.anInt1138] = l_85_;
                GameSocket.anInt1138 = (1 + GameSocket.anInt1138) % 100;
                RSString class100
                        = (Class118.method1731(i_87_, (byte) 76).method1093
                        (-90, Class68_Sub13_Sub8.inStream));
                if ((i_86_ ^ 0xffffffff) == -3)
                    Class25.method386(null, -19596,
                            (Class68_Sub20_Sub13_Sub2.method1166
                                    (2,
                                            (new RSString[]
                                                    {Class68_Sub13_Sub4.aRSString_3492,
                                                            Class56.method570(l, -1)
                                                                    .method1597(i ^ ~0x5761)}))),
                            i_87_, 18, class100);
                else if (i_86_ != 1)
                    Class25.method386(null, -19596,
                            Class56.method570(l, -1)
                                    .method1597(12688),
                            i_87_, 18, class100);
                else
                    Class25.method386(null, -19596,
                            (Class68_Sub20_Sub13_Sub2.method1166
                                    (i + 26356,
                                            (new RSString[]
                                                    {Class68_Sub13_Sub27.aRSString_3902,
                                                            Class56.method570(l, i + 26353)
                                                                    .method1597(12688)}))),
                            i_87_, 18, class100);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 186) {
            GroundData.anInt686
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            Class68_Sub13_Sub4.anInt3497
                    = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i ^ 0x7ce5);
            Class68_Sub4.anInt2813
                    = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i + 19677);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -196) {
            int i_90_ = Class68_Sub13_Sub8.inStream.readDWord_v1();
            int i_91_ = (i_90_ & 0x32edbabc) >> -375335812;
            int i_92_ = 0x3fff & i_90_ >> 1567317006;
            int i_93_ = 0x3fff & i_90_;
            int i_94_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            if ((i_94_ ^ 0xffffffff) == -65536)
                i_94_ = -1;
            int i_95_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            i_92_ -= Class36.anInt643;
            int i_96_ = 0x3 & i_95_;
            int i_97_ = i_95_ >> 723066338;
            i_93_ -= Class68_Sub13_Sub35.anInt4026;
            int i_98_ = Class12.anIntArray201[i_97_];
            Class43.method483(i_93_, i_97_, i_91_, i_96_, i_92_, (byte) 126,
                    i_94_, i_98_);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 156) {
            int i_99_ = Class68_Sub13_Sub8.inStream
                    .method940((byte) 88);
            int i_100_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            int i_101_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(i ^ ~0x50cf0039);
            Class68_Sub13_Sub38.method900(-31, i_101_);
            Class68_Sub13_Sub28.method846(i_99_, 93, i_100_);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -102) {
            int i_102_ = Class68_Sub13_Sub8.inStream.readDWord();
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_102_, (byte) -80);
            class45.anInt865 = 3;
            class45.anInt803 = Class68_Sub7.aClass1_Sub6_Sub2_2860
                    .aClass126_3410.method1774(true);
            Class113.method1682(class45, -128);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -177) {
            long l = Class68_Sub13_Sub8.inStream.readQWord(87);
            Class68_Sub13_Sub8.inStream.method955(3390);
            long l_103_
                    = Class68_Sub13_Sub8.inStream.readQWord(72);
            long l_104_ = (long) Class68_Sub13_Sub8
                    .inStream
                    .readUnsignedWord(1355769544);
            long l_105_ = (long) Class68_Sub13_Sub8
                    .inStream
                    .method921((byte) -114);
            int i_106_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i + 19677);
            int i_107_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            long l_108_ = l_105_ + (l_104_ << -1861613600);
            boolean bool = false;
            while_152_:
            do {
                for (int i_109_ = 0; i_109_ < 100; i_109_++) {
                    if ((Class97.aLongArray1711[i_109_] ^ 0xffffffffffffffffL)
                            == (l_108_ ^ 0xffffffffffffffffL)) {
                        bool = true;
                        break while_152_;
                    }
                }
                if ((i_106_ ^ 0xffffffff) >= -2) {
                    for (int i_110_ = 0;
                         i_110_ < Class68_Sub13_Sub26.anInt3880; i_110_++) {
                        if ((Class21_Sub1.aLongArray2703[i_110_]
                                ^ 0xffffffffffffffffL)
                                == (l ^ 0xffffffffffffffffL)) {
                            bool = true;
                            break;
                        }
                    }
                }
            } while (false);
            if (!bool && (Class116.anInt2011 ^ 0xffffffff) == -1) {
                Class97.aLongArray1711[GameSocket.anInt1138] = l_108_;
                GameSocket.anInt1138 = (1 + GameSocket.anInt1138) % 100;
                RSString class100
                        = (Class118.method1731(i_107_, (byte) 101).method1093
                        (-37, Class68_Sub13_Sub8.inStream));
                if ((i_106_ ^ 0xffffffff) != -3
                        && (i_106_ ^ 0xffffffff) != -4) {
                    if ((i_106_ ^ 0xffffffff) != -2)
                        Class25.method386(Class56.method570(l_103_, -1)
                                .method1597(12688),
                                -19596,
                                Class56.method570(l, -1)
                                        .method1597(12688),
                                i_107_, 20, class100);
                    else
                        Class25.method386(Class56.method570
                                (l_103_, i + 26353)
                                .method1597(i + 39042),
                                -19596,
                                (Class68_Sub20_Sub13_Sub2.method1166
                                        (2, (new RSString[]
                                                {(Class68_Sub13_Sub27
                                                        .aRSString_3902),
                                                        Class56.method570(l, -1)
                                                                .method1597(12688)}))),
                                i_107_, 20, class100);
                } else
                    Class25.method386(Class56.method570(l_103_, -1)
                            .method1597(12688),
                            -19596,
                            (Class68_Sub20_Sub13_Sub2.method1166
                                    (2,
                                            (new RSString[]
                                                    {Class68_Sub13_Sub4.aRSString_3492,
                                                            Class56.method570(l, -1)
                                                                    .method1597(12688)}))),
                            i_107_, 20, class100);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -140) {
            Class12.method238(Class75_Sub1_Sub1.signlink, Class68_Sub13_Sub8.inStream, Class106.anInt1804, (byte) 101);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -13) {
            int i_111_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_112_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_113_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_114_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_115_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            Class69.aBooleanArray1237[i_111_] = true;
            Class121.anIntArray2110[i_111_] = i_112_;
            Class11.anIntArray196[i_111_] = i_113_;
            Class68_Sub13_Sub29.anIntArray3935[i_111_] = i_114_;
            Class68_Sub13_Sub16.anIntArray3697[i_111_] = i_115_;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 178) {
            long l = Class68_Sub13_Sub8.inStream
                    .readQWord(i + 26477);
            long l_116_ = (long) Class68_Sub13_Sub8
                    .inStream
                    .readUnsignedWord(1355769544);
            boolean bool = false;
            long l_117_ = (long) Class68_Sub13_Sub8
                    .inStream
                    .method921((byte) -112);
            int i_118_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i ^ 0x7ce5);
            long l_119_ = (l_116_ << 53194464) + l_117_;
            while_153_:
            do {
                for (int i_120_ = 0; i_120_ < 100; i_120_++) {
                    if (Class97.aLongArray1711[i_120_] == l_119_) {
                        bool = true;
                        break while_153_;
                    }
                }
                if (i_118_ <= 1) {
                    if ((Class25.anInt517 ^ 0xffffffff) == -2
                            || (Class30.anInt552 ^ 0xffffffff) == -2)
                        bool = true;
                    else {
                        for (int i_121_ = 0;
                             Class68_Sub13_Sub26.anInt3880 > i_121_;
                             i_121_++) {
                            if (l == Class21_Sub1.aLongArray2703[i_121_]) {
                                bool = true;
                                break;
                            }
                        }
                    }
                }
            } while (false);
            if (!bool && Class116.anInt2011 == 0) {
                Class97.aLongArray1711[GameSocket.anInt1138] = l_119_;
                GameSocket.anInt1138 = (GameSocket.anInt1138 - -1) % 100;
                RSString class100
                        = (Class68_Sub20_Sub1.method1009
                        (Class68_Sub19.method996
                                (27, Class68_Sub13_Sub8.inStream)
                                .method1616(2)));
                if (i_118_ == 2 || (i_118_ ^ 0xffffffff) == -4)
                    Class48.method520((Class68_Sub20_Sub13_Sub2.method1166
                            (2,
                                    (new RSString[]
                                            {Class68_Sub13_Sub4.aRSString_3492,
                                                    Class56.method570(l, -1)
                                                            .method1597(12688)}))),
                            126, class100, 7);
                else if ((i_118_ ^ 0xffffffff) == -2)
                    Class48.method520((Class68_Sub20_Sub13_Sub2.method1166
                            (2,
                                    (new RSString[]
                                            {Class68_Sub13_Sub27.aRSString_3902,
                                                    Class56.method570(l, i + 26353)
                                                            .method1597(12688)}))),
                            125, class100, 7);
                else
                    Class48.method520(Class56.method570(l, -1)
                            .method1597(i + 39042),
                            i ^ 0x668b, class100, 3);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 179) {
            RSString class100 = Class68_Sub13_Sub8.inStream.readString(127);
            int i_122_ = Class68_Sub13_Sub8.inStream.readDWord_v1();
            Class45 class45 = Class68_Sub20_Sub15.method1170(i_122_, (byte) -80);
            if (!class100.method1593(class45.aRSString_881, (byte) 116)) {
                class45.aRSString_881 = class100;
                Class113.method1682(class45, -115);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 100) {
            int i_123_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            byte i_124_ = Class68_Sub13_Sub8.inStream.method919((byte) 46);
            Class66.method638(i + 26474, i_124_, i_123_);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -105) {
            Class68_Sub3.method651((byte) -127);
            Class49.anInt962 = -1;
            return false;
        }
        if (Class49.anInt962 == 146) {
            int i_125_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            if (i_125_ == 65535)
                i_125_ = -1;
            Class1_Sub1.method63(79, i_125_);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 251) {
            int i_126_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            int i_127_
                    = Class68_Sub13_Sub8.inStream.method930(false);
            if (i_126_ == 65535)
                i_126_ = -1;
            Class68_Sub13_Sub28.method844((byte) 106, i_127_, i_126_);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 56) {
            Class11.method232(-10937);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -240) {
            int i_128_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
            int i_129_ = Class68_Sub13_Sub8.inStream.readUnsignedByteA();
            if (i_129_ == 2)
                Class69.method1327(25);
            Class68_Sub13_Sub10.anInt3595 = i_128_;
            Class76.method1406(i_128_, (byte) 126);
            Canvas_Sub1.method47(false, 640);
            Class71.method1340(i ^ 0x66f1, Class68_Sub13_Sub10.anInt3595);
            for (int i_130_ = 0; (i_130_ ^ 0xffffffff) > -101; i_130_++)
                Class121.aBooleanArray2109[i_130_] = true;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 135) {
            int i_131_
                    = Class68_Sub13_Sub8.inStream.readDWord();
            int i_132_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            Class45 class45;
            if ((i_131_ ^ 0xffffffff) <= -1)
                class45 = Class68_Sub20_Sub15.method1170(i_131_, (byte) -80);
            else
                class45 = null;
            if ((i_131_ ^ 0xffffffff) > 69999)
                i_132_ += 32768;
            while ((Class68_Sub13_Sub8.inStream.currentOffset
                    ^ 0xffffffff)
                    > (Class106.anInt1804 ^ 0xffffffff)) {
                int i_133_ = Class68_Sub13_Sub8.inStream
                        .method912(255);
                int i_134_ = Class68_Sub13_Sub8.inStream
                        .readUnsignedWord(1355769544);
                int i_135_ = 0;
                if (i_134_ != 0) {
                    i_135_ = Class68_Sub13_Sub8.inStream
                            .readUnsignedByte(-6677);
                    if ((i_135_ ^ 0xffffffff) == -256)
                        i_135_ = Class68_Sub13_Sub8.inStream.readDWord();
                }
                if (class45 != null && (i_133_ ^ 0xffffffff) <= -1
                        && i_133_ < class45.anIntArray795.length) {
                    class45.anIntArray795[i_133_] = i_134_;
                    class45.anIntArray774[i_133_] = i_135_;
                }
                Class128.method1792(i_133_, i_135_, (byte) -67, i_132_,
                        -1 + i_134_);
            }
            if (class45 != null)
                Class113.method1682(class45, i + 26234);
            Class68_Sub13.method701(0);
            Class68_Sub13_Sub39.anIntArray4102
                    [Class120.method1740(31, Class68_Sub29.anInt3243++)]
                    = Class120.method1740(32767, i_132_);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 120) {
            int i_136_ = Class68_Sub13_Sub8.inStream
                    .method957(-22489);
            int i_137_
                    = Class68_Sub13_Sub8.inStream.readDWord_v2(false);
            int i_138_ = Class68_Sub13_Sub8.inStream
                    .method957(-22489);
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_137_, (byte) -80);
            class45.anInt903 = class45.anInt914 = i_138_;
            class45.aByte820 = (byte) 0;
            class45.aByte904 = (byte) 0;
            class45.anInt815 = class45.anInt810 = i_136_;
            Class113.method1682(class45, i + 26228);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -235) {
            long l = Class68_Sub13_Sub8.inStream.readQWord(86);
            int i_139_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            RSString class100
                    = (Class118.method1731(i_139_, (byte) 96).method1093
                    (114, Class68_Sub13_Sub8.inStream));
            Class25.method386(null, -19596,
                    Class56.method570(l, -1).method1597(12688),
                    i_139_, 19, class100);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -185) {
            int i_140_
                    = Class68_Sub13_Sub8.inStream.readDWord();
            int i_141_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            int i_142_ = i_141_ & 0x1f;
            int i_143_ = (i_141_ & 0x7ebf) >> 25808906;
            int i_144_ = (i_141_ & 0x3ff) >> -1941183739;
            int i_145_ = (i_143_ << 1507059315) + ((i_144_ << -2092832469)
                    + (i_142_ << -944266717));
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_140_, (byte) -80);
            if (class45.anInt832 != i_145_) {
                class45.anInt832 = i_145_;
                Class113.method1682(class45, -123);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 137) {
            int i_146_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            if (Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677) == 0)
                Class63.aClass49Array1171[i_146_] = new Class49();
            else {
                Class68_Sub13_Sub8.inStream.currentOffset--;
                Class63.aClass49Array1171[i_146_] = new Class49(Class68_Sub13_Sub8.inStream);
            }
            Class4.anInt93 = Class68_Sub22.anInt3148;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 249) {
            Class68_Sub28_Sub1.anInt4491 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            Class93.anInt1668 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            for (int i_147_ = Class93.anInt1668; (Class93.anInt1668 + 8 ^ 0xffffffff) < (i_147_ ^ 0xffffffff); i_147_++) {
                for (int i_148_ = Class68_Sub28_Sub1.anInt4491; ((i_148_ ^ 0xffffffff) > (8 + Class68_Sub28_Sub1.anInt4491 ^ 0xffffffff)); i_148_++) {
                    if ((Class45.aClass16ArrayArrayArray926[GameSocket.anInt1149][i_147_][i_148_]) != null) {
                        Class45.aClass16ArrayArrayArray926[GameSocket.anInt1149][i_147_][i_148_] = null;
                        Class68_Sub20_Sub9.method1100(i_147_, (byte) -52, i_148_);
                    }
                }
            }
            for (Class68_Sub2 class68_sub2
                         = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3963
                    .method293((byte) 76);
                 class68_sub2 != null;
                 class68_sub2
                         = (Class68_Sub2) Class68_Sub13_Sub31.aClass16_3963
                         .method290((byte) -105)) {
                if ((class68_sub2.anInt2791 ^ 0xffffffff) <= (Class93.anInt1668
                        ^ 0xffffffff)
                        && ((Class93.anInt1668 + 8 ^ 0xffffffff)
                        < (class68_sub2.anInt2791 ^ 0xffffffff))
                        && class68_sub2.anInt2784 >= Class68_Sub28_Sub1.anInt4491
                        && (8 + Class68_Sub28_Sub1.anInt4491
                        > class68_sub2.anInt2784)
                        && class68_sub2.anInt2789 == GameSocket.anInt1149)
                    class68_sub2.anInt2795 = 0;
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 119) {
            int i_149_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            if (i_149_ == 65535)
                i_149_ = -1;
            int i_150_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_151_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(i ^ ~0x50cf0039);
            Class57.method575((byte) 122, i_151_, i_150_, i_149_);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 170) {
            RSString class100
                    = Class68_Sub13_Sub8.inStream.readString(127);
            int i_152_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            int i_153_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            Class68_Sub13_Sub38.method900(-21, i_152_);
            Class68_Sub13_Sub7.method730((byte) 120, i_153_, class100);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 222) {
            Class72.method1347(false);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 8) {
            Class104.anInt1784 = 30 * Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            Class68_Sub20_Sub5.anInt4220 = Class68_Sub22.anInt3148;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 219) {
            int i_154_
                    = Class68_Sub13_Sub8.inStream.readDWord_v1();
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_154_, (byte) -80);
            for (int i_155_ = 0; i_155_ < class45.anIntArray795.length;
                 i_155_++) {
                class45.anIntArray795[i_155_] = -1;
                class45.anIntArray795[i_155_] = 0;
            }
            Class113.method1682(class45, i + 26236);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 172) {
            int i_156_ = Class68_Sub13_Sub8.inStream.readDWord();
            Class68_Sub10.aClass31_2914
                    = Class75_Sub1_Sub1.signlink.method563(i_156_, i + 26354);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -83) {
            Class68_Sub28_Sub2.anInt4547 = Class68_Sub22.anInt3148;
            long l = Class68_Sub13_Sub8.inStream.readQWord(97);
            if (l == 0L) {
                Class68_Sub20_Sub8.anInt4278 = 0;
                Class49.anInt962 = -1;
                Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630 = null;
                Class69.aRSString_1251 = null;
                Class90.aRSString_2351 = null;
                return true;
            }
            long l_157_
                    = Class68_Sub13_Sub8.inStream.readQWord(100);
            Class69.aRSString_1251 = Class56.method570(l_157_, i + 26353);
            Class90.aRSString_2351 = Class56.method570(l, i + 26353);
            Class55.aByte2071
                    = Class68_Sub13_Sub8.inStream.method955(3390);
            int i_158_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            if ((i_158_ ^ 0xffffffff) == -256) {
                Class49.anInt962 = -1;
                return true;
            }
            Class68_Sub20_Sub8.anInt4278 = i_158_;
            Class68_Sub19[] class68_sub19s = new Class68_Sub19[100];
            for (int i_159_ = 0; Class68_Sub20_Sub8.anInt4278 > i_159_;
                 i_159_++) {
                class68_sub19s[i_159_] = new Class68_Sub19();
                class68_sub19s[i_159_].aLong1218
                        = Class68_Sub13_Sub8.inStream
                        .readQWord(98);
                class68_sub19s[i_159_].aRSString_3073
                        = Class56.method570(class68_sub19s[i_159_].aLong1218, -1);
                class68_sub19s[i_159_].anInt3067
                        = Class68_Sub13_Sub8.inStream
                        .readUnsignedWord(1355769544);
                class68_sub19s[i_159_].aByte3075
                        = Class68_Sub13_Sub8.inStream
                        .method955(3390);
                class68_sub19s[i_159_].aRSString_3076
                        = Class68_Sub13_Sub8.inStream
                        .readString(i ^ ~0x668e);
                if (class68_sub19s[i_159_].aLong1218 == Class72_Sub1.aLong3285)
                    Class68.aByte1225 = class68_sub19s[i_159_].aByte3075;
            }
            boolean bool = false;
            int i_160_ = Class68_Sub20_Sub8.anInt4278;
            while ((i_160_ ^ 0xffffffff) < -1) {
                i_160_--;
                bool = true;
                for (int i_161_ = 0; i_160_ > i_161_; i_161_++) {
                    if ((class68_sub19s[i_161_].aRSString_3073.method1614
                            (false, class68_sub19s[i_161_ + 1].aRSString_3073))
                            > 0) {
                        Class68_Sub19 class68_sub19 = class68_sub19s[i_161_];
                        bool = false;
                        class68_sub19s[i_161_] = class68_sub19s[1 + i_161_];
                        class68_sub19s[1 + i_161_] = class68_sub19;
                    }
                }
                if (bool)
                    break;
            }
            Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630 = class68_sub19s;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 40) {
            int i_162_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(i ^ ~0x50cf0039);
            int i_163_
                    = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(108);
            Class16.anInt275 = i_163_;
            Class8.anInt163 = i_162_;
            Class68_Sub13_Sub20.method799((byte) -100);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -38) {
            Class68_Sub13.method701(0);
            Class75_Sub3.anInt3330
                    = Class68_Sub13_Sub8.inStream
                    .method957(-22489);
            Class68_Sub20_Sub5.anInt4220 = Class68_Sub22.anInt3148;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 59) {
            boolean bool = (Class68_Sub13_Sub8.inStream.readUnsignedByteC() == 1);
            int i_164_ = Class68_Sub13_Sub8.inStream.readDWord_v1();

            Class45 class45 = Class68_Sub20_Sub15.method1170(i_164_, (byte) -80);

            if (class45.aBoolean764 == !bool) {
                class45.aBoolean764 = bool;
                Class113.method1682(class45, -120);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -227) {
            Class68_Sub9.anInt2882
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 247) {
            int i_165_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            int i_166_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
            int i_167_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            Class68_Sub13_Sub38.method900(-119, i_165_);
            Class68_Sub13_Sub28.method846(i_166_, i + 26475, i_167_);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -178) {
            Class68_Sub28_Sub1.anInt4491 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            Class93.anInt1668 = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -141) {
            int i_168_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(i ^ ~0x50cf0039);
            int i_169_
                    = Class68_Sub13_Sub8.inStream.readDWord();
            int i_170_
                    = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(-96);
            int i_171_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            if (i_169_ >> -314135746 == 0) {
                if ((i_169_ >> 1271725373 ^ 0xffffffff) != -1) {
                    int i_172_ = i_169_ & 0xffff;
                    Class1_Sub6_Sub1 class1_sub6_sub1
                            = Class102.aClass1_Sub6_Sub1Array1746[i_172_];
                    if (class1_sub6_sub1 != null) {
                        class1_sub6_sub1.anInt2586 = 0;
                        class1_sub6_sub1.anInt2552 = i_170_;
                        if ((class1_sub6_sub1.anInt2552 ^ 0xffffffff)
                                == -65536)
                            class1_sub6_sub1.anInt2552 = -1;
                        class1_sub6_sub1.anInt2578 = 0;
                        class1_sub6_sub1.anInt2560 = i_171_;
                        class1_sub6_sub1.anInt2541
                                = Class68_Sub3.anInt2812 + i_168_;
                        if ((class1_sub6_sub1.anInt2541 ^ 0xffffffff)
                                < (Class68_Sub3.anInt2812 ^ 0xffffffff))
                            class1_sub6_sub1.anInt2578 = -1;
                    }
                } else if (i_169_ >> 678636924 != 0) {
                    int i_173_ = 0xffff & i_169_;
                    Class1_Sub6_Sub2 class1_sub6_sub2;
                    if ((Class68_Sub10.anInt2911 ^ 0xffffffff)
                            != (i_173_ ^ 0xffffffff))
                        class1_sub6_sub2
                                = (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483
                                [i_173_]);
                    else
                        class1_sub6_sub2 = Class68_Sub7.aClass1_Sub6_Sub2_2860;
                    if (class1_sub6_sub2 != null) {
                        class1_sub6_sub2.anInt2541
                                = i_168_ + Class68_Sub3.anInt2812;
                        class1_sub6_sub2.anInt2552 = i_170_;
                        class1_sub6_sub2.anInt2560 = i_171_;
                        if ((class1_sub6_sub2.anInt2552 ^ 0xffffffff)
                                == -65536)
                            class1_sub6_sub2.anInt2552 = -1;
                        class1_sub6_sub2.anInt2586 = 0;
                        class1_sub6_sub2.anInt2578 = 0;
                        if ((class1_sub6_sub2.anInt2541 ^ 0xffffffff)
                                < (Class68_Sub3.anInt2812 ^ 0xffffffff))
                            class1_sub6_sub2.anInt2578 = -1;
                    }
                }
            } else {
                int i_174_ = i_169_ >> 1381623388 & 0x3;
                int i_175_
                        = -Class36.anInt643 + (0x3fff & i_169_ >> 1195453614);
                int i_176_
                        = (i_169_ & 0x3fff) + -Class68_Sub13_Sub35.anInt4026;
                if (i_175_ >= 0 && i_176_ >= 0 && i_175_ < 104
                        && (i_176_ ^ 0xffffffff) > -105) {
                    i_175_ = 64 + 128 * i_175_;
                    i_176_ = i_176_ * 128 + 64;
                    Class1_Sub5 class1_sub5
                            = new Class1_Sub5(i_170_, i_174_, i_175_, i_176_,
                            -i_171_ + (Class1_Sub6_Sub2.method163
                                    (i_175_, i_174_, i_176_,
                                            false)),
                            i_168_, Class68_Sub3.anInt2812);
                    Class105.aClass16_1790
                            .method286(new Class68_Sub20_Sub5(class1_sub5), true);
                }
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 174) {
            int i_177_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            int i_178_
                    = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(-49);
            int i_179_
                    = Class68_Sub13_Sub8.inStream.readDWord_v2(false);
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_179_, (byte) -80);
            Class49.anInt962 = -1;
            class45.anInt910 = (i_177_ << 1980630896) - -i_178_;
            return true;
        }
        if (Class49.anInt962 == 216) {
            Class95.method1551((byte) -108);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -246) {
            int i_180_
                    = Class68_Sub13_Sub8.inStream.readDWord_v2(false);
            int i_181_ = Class68_Sub13_Sub8.inStream
                    .method957(-22489);
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_180_, (byte) -80);
            if ((class45.anInt831 ^ 0xffffffff) != (i_181_ ^ 0xffffffff)
                    || (i_181_ ^ 0xffffffff) == 0) {
                class45.anInt771 = 0;
                class45.anInt831 = i_181_;
                class45.anInt756 = 0;
                Class113.method1682(class45, -122);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 118) {
            int i_182_
                    = Class68_Sub13_Sub8.inStream.readDWord();
            int i_183_
                    = Class68_Sub13_Sub8.inStream.readDWord();
            Class68_Sub3 class68_sub3
                    = ((Class68_Sub3)
                    Login.aClass113_1512.method1678((long) i_182_, 88));
            Class68_Sub3 class68_sub3_184_
                    = ((Class68_Sub3)
                    Login.aClass113_1512.method1678((long) i_183_, 111));
            if (class68_sub3_184_ != null)
                Class68_Sub13_Sub10.method744(class68_sub3_184_, true,
                        (class68_sub3 == null
                                || (class68_sub3.anInt2803
                                != (class68_sub3_184_
                                .anInt2803))));
            if (class68_sub3 != null) {
                class68_sub3.method647(-17554);
                Login.aClass113_1512.method1677((byte) 127, class68_sub3,
                        (long) i_183_);
            }
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_182_, (byte) -80);
            if (class45 != null)
                Class113.method1682(class45, -115);
            class45 = Class68_Sub20_Sub15.method1170(i_183_, (byte) -80);
            if (class45 != null) {
                Class113.method1682(class45, -122);
                Class68_Sub13_Sub27.method838(-1, true, class45);
            }
            if ((Class68_Sub13_Sub10.anInt3595 ^ 0xffffffff) != 0)
                GameException
                        .method1796(i + 26449, Class68_Sub13_Sub10.anInt3595, 1);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 211) {
            int i_185_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_186_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_187_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            int i_188_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_189_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedByte(i + 19677);
            Class68_Sub13_Sub33.method867(i_185_, i_186_, i_189_, i_188_, -118,
                    i_187_, true);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 10) {
            int i_190_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            int i_191_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            int i_192_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            Class1_Sub6_Sub1 class1_sub6_sub1
                    = Class102.aClass1_Sub6_Sub1Array1746[i_192_];
            if (class1_sub6_sub1 != null)
                Class101.method1625(0, i_191_, class1_sub6_sub1, i_190_);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -109) {
            Class119.method1735(i + 26430);
            Class68_Sub13.method701(0);
            Class68_Sub4.anInt2815 += 32;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 252) {
            int i_193_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
            RSString class100 = Class68_Sub13_Sub8.inStream.readString(127);
            int i_194_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
            if (i_194_ >= 1 && i_194_ <= 8) {
                if (class100.method1600(false, Class68_Sub13_Sub32.aRSString_3982))
                    class100 = null;
                Class127.aRSStringArray2207[i_194_ - 1] = class100;
                Class118.aBooleanArray2078[-1 + i_194_] = i_193_ == 0;
            }
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -50) {
            int i_195_
                    = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(-82);
            int i_196_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(i + 1355795898);
            int i_197_ = Class68_Sub13_Sub8.inStream
                    .method940((byte) 123);
            int i_198_
                    = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(102);
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_197_, (byte) -80);
            if ((i_195_ ^ 0xffffffff) != (class45.anInt864 ^ 0xffffffff)
                    || i_198_ != class45.anInt814
                    || (class45.anInt762 ^ 0xffffffff) != (i_196_ ^ 0xffffffff)) {
                class45.anInt762 = i_196_;
                class45.anInt864 = i_195_;
                class45.anInt814 = i_198_;
                Class113.method1682(class45, -120);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -153) {
            RSString class100
                    = Class68_Sub13_Sub8.inStream.readString(127);
            Object[] objects
                    = new Object[1 + class100.method1590((byte) -119)];
            for (int i_199_ = -1 + class100.method1590((byte) -100);
                 i_199_ >= 0; i_199_--) {
                if (class100.method1578(i_199_, 7178) == 115)
                    objects[i_199_ - -1]
                            = Class68_Sub13_Sub8.inStream
                            .readString(i + 26481);
                else
                    objects[1 + i_199_] = new Integer(Class68_Sub13_Sub8.inStream.readDWord());
            }
            objects[0] = new Integer(Class68_Sub13_Sub8.inStream.readDWord());
            Class68_Sub29 class68_sub29 = new Class68_Sub29();
            class68_sub29.anObjectArray3237 = objects;
            Class68_Sub13_Sub16.method776(class68_sub29, 16);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 173) {
            Class68_Sub13_Sub15.method768((byte) 95, true);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 109) {
            int i_200_ = Class68_Sub13_Sub8.inStream.readDWord();
            int i_201_
                    = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(-60);
            Class13_Sub3.method261(i ^ ~0x66f1, i_200_, i_201_);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -194) {
            int i_202_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_203_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_204_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(1355769544);
            int i_205_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_206_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            Class68_Sub13_Sub24.method819(i_205_, i_204_, i_202_, true, i_203_,
                    i_206_);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 38) {
            for (int i_207_ = 0; Class103.anIntArray1767.length > i_207_;
                 i_207_++) {
                if (Class103.anIntArray1767[i_207_]
                        != Class3.anIntArray79[i_207_]) {
                    Class103.anIntArray1767[i_207_]
                            = Class3.anIntArray79[i_207_];
                    Class68_Sub13_Sub35.method878((byte) 67, i_207_);
                    Class68_Sub13_Sub34.anIntArray4012
                            [Class120.method1740(Class68_Sub4.anInt2815++, 31)]
                            = i_207_;
                }
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 6) {
            int i_208_
                    = Class68_Sub13_Sub8.inStream.readDWord_v2(false);
            int i_209_
                    = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(-43);
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_208_, (byte) -80);
            if ((i_209_ ^ 0xffffffff) == -65536)
                i_209_ = -1;
            if (class45.anInt865 != 2 || class45.anInt803 != i_209_) {
                class45.anInt803 = i_209_;
                class45.anInt865 = 2;
                Class113.method1682(class45, -113);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 205) {
            if ((Class106.anInt1804 ^ 0xffffffff) == -1)
                Class37.aRSString_653 = Class68_Sub13_Sub33.aRSString_3987;
            else
                Class37.aRSString_653
                        = Class68_Sub13_Sub8.inStream
                        .readString(i ^ ~0x668e);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 218) {
            RSString class100 = Class68_Sub13_Sub8.inStream
                    .readString(i ^ ~0x668e);
            if (!class100.method1573(Class68_Sub13.aRSString_2922, true)) {
                if (!class100.method1573(Class8.aRSString_165, true)) {
                    if (class100.method1573(Class68_Sub22.aRSString_3146,
                            true)) {
                        RSString class100_210_
                                = (class100.method1607
                                (0, (byte) -74,
                                        class100.method1595(83,
                                                Class13.aRSString_218)));
                        long l = class100_210_.toLong(10908);
                        boolean bool = false;
                        for (int i_211_ = 0;
                             ((i_211_ ^ 0xffffffff)
                                     > (Class68_Sub13_Sub26.anInt3880 ^ 0xffffffff));
                             i_211_++) {
                            if ((l ^ 0xffffffffffffffffL)
                                    == (Class21_Sub1.aLongArray2703[i_211_]
                                    ^ 0xffffffffffffffffL)) {
                                bool = true;
                                break;
                            }
                        }
                        if (!bool && Class116.anInt2011 == 0)
                            Class48.method520(class100_210_, -110,
                                    (Class68_Sub28_Sub2
                                            .aRSString_4556),
                                    10);
                    } else if (class100.method1573(Class83.aRSString_1528,
                            true)) {
                        RSString class100_212_
                                = (class100.method1607
                                (0, (byte) -74,
                                        class100.method1595(-71,
                                                Class83.aRSString_1528)));
                        Class48.method520(Class68_Sub28_Sub2.aRSString_4556,
                                126, class100_212_, 11);
                    } else if (!class100.method1573(Class127.aRSString_2211,
                            true)) {
                        if (!class100.method1573(Class104.aRSString_1777,
                                true)) {
                            if (class100.method1573((Class68_Sub20_Sub11
                                    .aRSString_4323),
                                    true)) {
                                RSString class100_213_
                                        = (class100.method1607
                                        (0, (byte) -74,
                                                (class100.method1595
                                                        (37, Class13.aRSString_218))));
                                long l = class100_213_.toLong(i ^ ~0x4c6d);
                                boolean bool = false;
                                for (int i_214_ = 0;
                                     ((i_214_ ^ 0xffffffff)
                                             > (Class68_Sub13_Sub26.anInt3880
                                             ^ 0xffffffff));
                                     i_214_++) {
                                    if (l == (Class21_Sub1.aLongArray2703
                                            [i_214_])) {
                                        bool = true;
                                        break;
                                    }
                                }
                                if (!bool
                                        && (Class116.anInt2011 ^ 0xffffffff) == -1)
                                    Class48.method520(class100_213_,
                                            i ^ 0x66b1,
                                            (Class68_Sub28_Sub2
                                                    .aRSString_4556),
                                            14);
                            } else if (class100.method1573((Class68_Sub20_Sub15
                                    .aRSString_4396),
                                    true)) {
                                RSString class100_215_
                                        = (class100.method1607
                                        (0, (byte) -74,
                                                (class100.method1595
                                                        (-90, Class13.aRSString_218))));
                                long l = class100_215_.toLong(10908);
                                boolean bool = false;
                                for (int i_216_ = 0;
                                     ((Class68_Sub13_Sub26.anInt3880
                                             ^ 0xffffffff)
                                             < (i_216_ ^ 0xffffffff));
                                     i_216_++) {
                                    if ((l ^ 0xffffffffffffffffL)
                                            == (Class21_Sub1.aLongArray2703[i_216_]
                                            ^ 0xffffffffffffffffL)) {
                                        bool = true;
                                        break;
                                    }
                                }
                                if (!bool && Class116.anInt2011 == 0)
                                    Class48.method520(class100_215_, -108,
                                            (Class68_Sub28_Sub2
                                                    .aRSString_4556),
                                            15);
                            } else if (!class100.method1573
                                    ((Class68_Sub13_Sub26_Sub1
                                            .aRSString_4602),
                                            true))
                                Class48.method520((Class68_Sub28_Sub2
                                        .aRSString_4556),
                                        127, class100, 0);
                            else {
                                RSString class100_217_
                                        = (class100.method1607
                                        (0, (byte) -74,
                                                (class100.method1595
                                                        (63, Class13.aRSString_218))));
                                long l = class100_217_.toLong(i ^ ~0x4c6d);
                                boolean bool = false;
                                for (int i_218_ = 0;
                                     Class68_Sub13_Sub26.anInt3880 > i_218_;
                                     i_218_++) {
                                    if ((Class21_Sub1.aLongArray2703[i_218_]
                                            ^ 0xffffffffffffffffL)
                                            == (l ^ 0xffffffffffffffffL)) {
                                        bool = true;
                                        break;
                                    }
                                }
                                if (!bool && Class116.anInt2011 == 0)
                                    Class48.method520(class100_217_,
                                            i ^ 0x6680,
                                            (Class68_Sub28_Sub2
                                                    .aRSString_4556),
                                            16);
                            }
                        } else {
                            RSString class100_219_
                                    = (class100.method1607
                                    (0, (byte) -74,
                                            class100.method1595(-113,
                                                    (Class104
                                                            .aRSString_1777))));
                            if (Class116.anInt2011 == 0)
                                Class48.method520((Class68_Sub28_Sub2
                                        .aRSString_4556),
                                        -12, class100_219_, 13);
                        }
                    } else {
                        RSString class100_220_
                                = (class100.method1607
                                (0, (byte) -74,
                                        class100.method1595(-57,
                                                Class127.aRSString_2211)));
                        if ((Class116.anInt2011 ^ 0xffffffff) == -1)
                            Class48.method520((Class68_Sub28_Sub2
                                    .aRSString_4556),
                                    i + 26270, class100_220_, 12);
                    }
                } else {
                    RSString class100_221_
                            = (class100.method1607
                            (0, (byte) -74,
                                    class100.method1595(89, Class13.aRSString_218)));
                    long l = class100_221_.toLong(10908);
                    boolean bool = false;
                    for (int i_222_ = 0;
                         ((i_222_ ^ 0xffffffff)
                                 > (Class68_Sub13_Sub26.anInt3880 ^ 0xffffffff));
                         i_222_++) {
                        if (Class21_Sub1.aLongArray2703[i_222_] == l) {
                            bool = true;
                            break;
                        }
                    }
                    if (!bool && Class116.anInt2011 == 0) {
                        RSString class100_223_
                                = (class100.method1607
                                (class100.method1595(-126,
                                        Class13.aRSString_218) + 1,
                                        (byte) -74,
                                        class100.method1590((byte) -121) + -9));
                        Class48.method520(class100_221_, -112, class100_223_,
                                8);
                    }
                }
            } else {
                RSString class100_224_
                        = (class100.method1607
                        (0, (byte) -74,
                                class100.method1595(i ^ 0x668d,
                                        Class13.aRSString_218)));
                long l = class100_224_.toLong(10908);
                boolean bool = false;
                for (int i_225_ = 0;
                     ((i_225_ ^ 0xffffffff)
                             > (Class68_Sub13_Sub26.anInt3880 ^ 0xffffffff));
                     i_225_++) {
                    if (Class21_Sub1.aLongArray2703[i_225_] == l) {
                        bool = true;
                        break;
                    }
                }
                if (!bool && (Class116.anInt2011 ^ 0xffffffff) == -1)
                    Class48.method520(class100_224_, i ^ 0x6698,
                            Class68_Sub16.aRSString_3027, 4);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -145) {
            byte[] is = new byte[Class106.anInt1804];
            Class68_Sub13_Sub8.inStream
                    .method976(is, Class106.anInt1804, 0, false);
            Class1_Sub6_Sub1.method155
                    (Class68_Sub13_Sub27.method842(Class106.anInt1804, is, 104, 0),
                            true, -125);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -4) {
            Class49.anInt962 = -1;
            Class95.anInt1684 = 0;
            return true;
        }
        if (Class49.anInt962 == 161) {
            int i_226_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
            int i_227_ = Class68_Sub13_Sub8.inStream.readDWord_v1();
            Class66.method638(95, i_227_, i_226_);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -228) {
            int i_228_
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            int i_229_ = i_228_ >> -577809018;
            Class23 class23 = new Class23();
            class23.anInt489 = i_228_ & 0x3f;
            class23.anInt499
                    = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            if ((class23.anInt499 ^ 0xffffffff) <= -1
                    && ((class23.anInt499 ^ 0xffffffff)
                    > (Class68_Sub13_Sub12.aClass68_Sub20_Sub10Array3646.length
                    ^ 0xffffffff))) {
                if ((class23.anInt489 ^ 0xffffffff) == -2
                        || class23.anInt489 == 10) {
                    class23.anInt493
                            = Class68_Sub13_Sub8.inStream
                            .readUnsignedWord(1355769544);
                    Class68_Sub13_Sub8.inStream.currentOffset += 3;
                } else if ((class23.anInt489 ^ 0xffffffff) <= -3
                        && (class23.anInt489 ^ 0xffffffff) >= -7) {
                    if (class23.anInt489 == 2) {
                        class23.anInt502 = 64;
                        class23.anInt503 = 64;
                    }
                    if ((class23.anInt489 ^ 0xffffffff) == -4) {
                        class23.anInt502 = 0;
                        class23.anInt503 = 64;
                    }
                    if (class23.anInt489 == 4) {
                        class23.anInt503 = 64;
                        class23.anInt502 = 128;
                    }
                    if (class23.anInt489 == 5) {
                        class23.anInt503 = 0;
                        class23.anInt502 = 64;
                    }
                    if (class23.anInt489 == 6) {
                        class23.anInt503 = 128;
                        class23.anInt502 = 64;
                    }
                    class23.anInt489 = 2;
                    class23.anInt496
                            = Class68_Sub13_Sub8.inStream
                            .readUnsignedWord(1355769544);
                    class23.anInt492
                            = Class68_Sub13_Sub8.inStream
                            .readUnsignedWord(1355769544);
                    class23.anInt497
                            = Class68_Sub13_Sub8.inStream
                            .readUnsignedByte(-6677);
                }
                class23.anInt495 = Class68_Sub13_Sub8
                        .inStream
                        .readUnsignedWord(1355769544);
                if (class23.anInt495 == 65535)
                    class23.anInt495 = -1;
                Class34.aClass23Array594[i_229_] = class23;
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 190) {
            int i_230_ = Class68_Sub13_Sub8.inStream
                    .readUnsignedWord(i + 1355795898);
            Class72_Sub1.method1364(i_230_, -107);
            Class68_Sub13_Sub39.anIntArray4102
                    [Class120.method1740(31, Class68_Sub29.anInt3243++)]
                    = Class120.method1740(i_230_, 32767);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 246) {
            int i_231_ = Class68_Sub13_Sub8.inStream.readDWord();
            Class68_Sub3 class68_sub3
                    = ((Class68_Sub3)
                    Login.aClass113_1512.method1678((long) i_231_, 107));
            if (class68_sub3 != null)
                Class68_Sub13_Sub10.method744(class68_sub3, true, true);
            if (Class29.aClass45_539 != null) {
                Class113.method1682(Class29.aClass45_539, -125);
                Class29.aClass45_539 = null;
            }
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -192) {
            RSString class100
                    = Class68_Sub13_Sub8.inStream.readString(127);
            int i_232_
                    = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(-91);
            int i_233_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            Class68_Sub13_Sub38.method900(-55, i_233_);
            Class68_Sub13_Sub7.method730((byte) 88, i_232_, class100);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 255) {
            int i_234_ = Class68_Sub13_Sub8.inStream.readDWord();
            int i_235_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(1355769544);
            Class45 class45;
            if (i_234_ >= 0)
                class45 = Class68_Sub20_Sub15.method1170(i_234_, (byte) -80);
            else
                class45 = null;
            if (class45 != null) {
                for (int i_236_ = 0; i_236_ < class45.anIntArray795.length; i_236_++) {
                    class45.anIntArray795[i_236_] = 0;
                    class45.anIntArray774[i_236_] = 0;
                }
            }
            if (i_234_ < -70000)
                i_235_ += 32768;
            Class11.method235(i_235_, (byte) 45);
            int i_237_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(i ^ ~0x50cf0039);
            for (int i_238_ = 0; i_237_ > i_238_; i_238_++) {
                int i_239_ = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
                if (i_239_ == 255)
                    i_239_ = Class68_Sub13_Sub8.inStream.readDWord_v2(false);
                int i_240_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndian(i ^ ~0x6698);
                if (class45 != null && class45.anIntArray795.length > i_238_) {
                    class45.anIntArray795[i_238_] = i_240_;
                    class45.anIntArray774[i_238_] = i_239_;
                }
                Class128.method1792(i_238_, i_239_, (byte) -32, i_235_, i_240_ + -1);
            }
            if (class45 != null)
                Class113.method1682(class45, -118);
            Class68_Sub13.method701(0);
            Class68_Sub13_Sub39.anIntArray4102[Class120.method1740(Class68_Sub29.anInt3243++, 31)] = Class120.method1740(32767, i_235_);
            Class49.anInt962 = -1;
            return true;
        }
        if ((Class49.anInt962 ^ 0xffffffff) == -2) {
            int i_241_ = Class68_Sub13_Sub8.inStream.readUnsignedByteS();
            int i_242_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            Class13_Sub3.method261(i ^ ~0x66f1, i_241_, i_242_);
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 99) {
            Class68_Sub13.method701(0);
            Class68_Sub20_Sub9.anInt4295 = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            Class68_Sub20_Sub5.anInt4220 = Class68_Sub22.anInt3148;
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 35) {
            int i_243_
                    = Class68_Sub13_Sub8.inStream.readDWord_v2(false);
            int i_244_ = Class68_Sub13_Sub8.inStream
                    .method940((byte) 103);
            int i_245_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            Class45 class45
                    = Class68_Sub20_Sub15.method1170(i_243_, (byte) -80);
            if (i_245_ == 65535)
                i_245_ = -1;
            if (!class45.aBoolean863) {
                if (i_245_ == -1) {
                    Class49.anInt962 = -1;
                    class45.anInt865 = 0;
                    return true;
                }
                ItemDef class19 = Applet_Sub1.method18(i ^ 0x2b6, i_245_);
                class45.anInt814 = class19.anInt395;
                class45.anInt864 = class19.anInt389;
                class45.anInt803 = i_245_;
                class45.anInt762 = 100 * class19.anInt336 / i_244_;
                class45.anInt865 = 4;
                Class113.method1682(class45, i + 26234);
            } else {
                class45.anInt915 = i_244_;
                class45.anInt798 = i_245_;
                ItemDef class19 = Applet_Sub1.method18(-25672, i_245_);
                class45.anInt814 = class19.anInt395;
                class45.anInt853 = class19.anInt355;
                class45.anInt864 = class19.anInt389;
                class45.anInt781 = class19.anInt358;
                class45.anInt842 = class19.anInt391;
                class45.anInt762 = class19.anInt336;
                if (class45.anInt793 > 0)
                    class45.anInt762
                            = 32 * class45.anInt762 / class45.anInt793;
                else if (class45.anInt773 > 0)
                    class45.anInt762
                            = 32 * class45.anInt762 / class45.anInt773;
                Class113.method1682(class45, -126);
            }
            Class49.anInt962 = -1;
            return true;
        }
        if (Class49.anInt962 == 114) {
            for (int i_246_ = 0;
                 Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483.length > i_246_;
                 i_246_++) {
                if (Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_246_]
                        != null)
                    Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_246_]
                            .anInt2568
                            = -1;
            }
            for (int i_247_ = 0;
                 Class102.aClass1_Sub6_Sub1Array1746.length > i_247_;
                 i_247_++) {
                if (Class102.aClass1_Sub6_Sub1Array1746[i_247_] != null)
                    Class102.aClass1_Sub6_Sub1Array1746[i_247_].anInt2568 = -1;
            }
            Class49.anInt962 = -1;
            return true;
        }
        Class71.method1339(("T1 - " + Class49.anInt962 + ","
                + Class68_Sub20_Sub6.anInt4240 + ","
                + Class68_Sub20_Sub7.anInt4252 + " - "
                + Class106.anInt1804),
                null, 38);
        Class68_Sub3.method651((byte) -116);
        return true;
    }

    static {
        anIntArray1863 = new int[64];
        aRSString_1870 = aRSString_1864;
        aCRC32_1872 = new CRC32();
        aClass113_1874 = new Class113(4096);
        anIntArray1876 = new int[50];
    }
}
