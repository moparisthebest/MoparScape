/* Class68_Sub13_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Class68_Sub13_Sub15 extends Class68_Sub13 {
    public int anInt3677 = 3216;
    public static int anInt3678;
    public static int[] anIntArray3679;
    public static int anInt3680;
    public static int anInt3681;
    public int anInt3682;
    public static int anInt3683;
    public int[] anIntArray3684;
    public static int anInt3685;
    public static int anInt3686;
    public static int anInt3687;
    public int anInt3688 = 4096;
    public static int anInt3689;
    public static int anInt3690;
    public static int anInt3691;
    public static int anInt3692;
    public static int anInt3693;

    public void method690(byte i) {
        if (i < -22) {
            method765((byte) -23);
            anInt3683++;
        }
    }

    public static void method764(int i, int i_0_, boolean bool) {
        if (i != Class68_Sub13_Sub19.anInt3746) {
            Class68_Sub13_Sub3.anIntArray3479 = new int[i];
            for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff); i_1_++)
                Class68_Sub13_Sub3.anIntArray3479[i_1_]
                        = (i_1_ << 898224364) / i;
            Class68_Sub20_Sub13_Sub2.anInt4620 = i == 64 ? 2048 : 4096;
            Class30.anInt543 = -1 + i;
            Class68_Sub13_Sub19.anInt3746 = i;
        }
        anInt3693++;
        if ((i_0_ ^ 0xffffffff) != (Class68_Sub1.anInt2775 ^ 0xffffffff)) {
            if ((i_0_ ^ 0xffffffff)
                    != (Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)) {
                Class13_Sub3.anIntArray2672 = new int[i_0_];
                for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff);
                     i_2_++)
                    Class13_Sub3.anIntArray2672[i_2_]
                            = (i_2_ << -1932024276) / i_0_;
            } else
                Class13_Sub3.anIntArray2672
                        = Class68_Sub13_Sub3.anIntArray3479;
            Class1_Sub6_Sub2.anInt3432 = i_0_ - 1;
            Class68_Sub1.anInt2775 = i_0_;
        }
        if (bool != true)
            method767(81, 122, -111);
    }

    public Class68_Sub13_Sub15() {
        super(1, true);
        anIntArray3684 = new int[3];
        anInt3682 = 3216;
    }

    public void method765(byte i) {
        double d = Math.cos((double) ((float) anInt3677 / 4096.0F));
        anInt3690++;
        anIntArray3684[0]
                = (int) (Math.sin((double) ((float) anInt3682 / 4096.0F)) * d
                * 4096.0);
        anIntArray3684[1]
                = (int) (d * Math.cos((double) ((float) anInt3682 / 4096.0F))
                * 4096.0);
        anIntArray3684[2]
                = (int) (4096.0
                * Math.sin((double) ((float) anInt3677 / 4096.0F)));
        int i_3_ = anIntArray3684[1] * anIntArray3684[1] >> -1148302068;
        int i_4_ = anIntArray3684[2] * anIntArray3684[2] >> 1285443756;
        int i_5_ = anIntArray3684[0] * anIntArray3684[0] >> 1915040716;
        int i_6_ = (int) (4096.0 * Math.sqrt((double) (i_4_ + i_3_ + i_5_
                >> 732006508)));
        if (i != -23)
            method766(3, -86L);
        if (i_6_ != 0) {
            anIntArray3684[2] = (anIntArray3684[2] << 1771585100) / i_6_;
            anIntArray3684[0] = (anIntArray3684[0] << -1837682996) / i_6_;
            anIntArray3684[1] = (anIntArray3684[1] << -805177300) / i_6_;
        }
    }

    public static void method766(int i, long l) {
        try {
            anInt3680++;
            if ((l ^ 0xffffffffffffffffL) != -1L) {
                int i_7_ = 0;
                if (i != 23136)
                    method770((byte) -1);
                for (/**/; i_7_ < Class32.anInt573; i_7_++) {
                    if (Class68_Sub13_Sub21.aLongArray3802[i_7_] == l) {
                        Class66.anInt1201++;
                        Class32.anInt573--;
                        for (int i_8_ = i_7_; Class32.anInt573 > i_8_;
                             i_8_++) {
                            Class68_Sub13_Sub38.aRSStringArray4084[i_8_]
                                    = (Class68_Sub13_Sub38.aRSStringArray4084
                                    [i_8_ + 1]);
                            Class98.anIntArray1724[i_8_]
                                    = Class98.anIntArray1724[i_8_ - -1];
                            Class68_Sub1.aRSStringArray2754[i_8_]
                                    = Class68_Sub1.aRSStringArray2754[i_8_ - -1];
                            Class68_Sub13_Sub21.aLongArray3802[i_8_]
                                    = (Class68_Sub13_Sub21.aLongArray3802
                                    [i_8_ - -1]);
                            Class68_Sub4.anIntArray2828[i_8_]
                                    = Class68_Sub4.anIntArray2828[1 + i_8_];
                            Class68_Sub13_Sub29.aBooleanArray3941[i_8_]
                                    = (Class68_Sub13_Sub29.aBooleanArray3941
                                    [1 + i_8_]);
                        }
                        Class123.anInt2130 = Class68_Sub22.anInt3148;
                        Class21renamed.stream.createFrame(132);
                        Class21renamed.stream.writeQWord(true, l);
                        break;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "ii.D(" + i + ',' + l + ')');
        }
    }

    public static void method767(int i, int i_9_, int i_10_) {
        Class103.anIntArray1767[i] = i_9_;
        anInt3685++;
        Class68_Sub15 class68_sub15
                = (Class68_Sub15) Class37.aClass113_646.method1678((long) i, -123);
        if (class68_sub15 != null)
            class68_sub15.aLong3014 = 500L + Class36.method438(17161);
        else {
            class68_sub15 = new Class68_Sub15(500L + Class36.method438(17161));
            Class37.aClass113_646.method1677((byte) 126, class68_sub15,
                    (long) i);
        }
        int i_11_ = 97 % ((34 - i_10_) / 52);
    }

    public void method700(Stream class68_sub14, int i, int i_12_) {
        int i_13_ = i;
        while_68_:
        do {
            do {
                if (i_13_ != 0) {
                    if (i_13_ != 1) {
                        if ((i_13_ ^ 0xffffffff) == -3)
                            break;
                        break while_68_;
                    }
                } else {
                    anInt3688 = class68_sub14.readUnsignedWord(1355769544);
                    break while_68_;
                }
                anInt3682 = class68_sub14.readUnsignedWord(1355769544);
                break while_68_;
            } while (false);
            anInt3677 = class68_sub14.readUnsignedWord(1355769544);
        } while (false);
        if (i_12_ != -1)
            anInt3677 = 123;
        anInt3678++;
    }

    public int[] method698(byte i, int i_14_) {
        anInt3686++;
        if (i != -61)
            anInt3688 = 7;
        int[] is = aClass115_2936.method1697(false, i_14_);
        if (aClass115_2936.aBoolean1957) {
            int i_15_
                    = Class68_Sub20_Sub13_Sub2.anInt4620 * anInt3688 >> -803028372;
            int[] is_16_
                    = this.method696(0, Class1_Sub6_Sub2.anInt3432 & -1 + i_14_,
                    29149);
            int[] is_17_ = this.method696(0, i_14_, 29149);
            int[] is_18_
                    = this.method696(0, 1 + i_14_ & Class1_Sub6_Sub2.anInt3432,
                    29149);
            for (int i_19_ = 0; ((Class68_Sub13_Sub19.anInt3746 ^ 0xffffffff)
                    < (i_19_ ^ 0xffffffff)); i_19_++) {
                int i_20_ = ((-is_17_[i_19_ - -1 & Class30.anInt543]
                        + is_17_[i_19_ - 1 & Class30.anInt543]) * i_15_
                        >> 250522988);
                int i_21_
                        = (-is_16_[i_19_] + is_18_[i_19_]) * i_15_ >> 1504576684;
                int i_22_ = i_20_ >> 1299021796;
                int i_23_ = i_21_ >> 1318447268;
                if ((i_22_ ^ 0xffffffff) > -1)
                    i_22_ = -i_22_;
                if ((i_23_ ^ 0xffffffff) > -1)
                    i_23_ = -i_23_;
                if ((i_22_ ^ 0xffffffff) < -256)
                    i_22_ = 255;
                if (i_23_ > 255)
                    i_23_ = 255;
                int i_24_ = ((Class68_Sub20_Sub18.aByteArray4444
                        [i_22_ + ((i_23_ + 1) * i_23_ >> -1206695839)])
                        & 0xff);
                int i_25_ = i_20_ * i_24_ >> 1247637544;
                int i_26_ = 4096 * i_24_ >> -1998727416;
                i_25_ = i_25_ * anIntArray3684[0] >> -753290548;
                i_26_ = anIntArray3684[2] * i_26_ >> -555307668;
                int i_27_ = i_24_ * i_21_ >> 2011762088;
                i_27_ = i_27_ * anIntArray3684[1] >> 1453414380;
                is[i_19_] = i_27_ + (i_25_ + i_26_);
            }
        }
        return is;
    }

    public static void method768(byte i, boolean bool) {
        Class36.aBoolean640 = bool;
        if (!Class36.aBoolean640) {
            int i_28_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            int i_29_ = Class68_Sub13_Sub8.inStream.readUnsignedWordBigEndianA();
            int i_30_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            int i_31_ = (-Class68_Sub13_Sub8.inStream.currentOffset + Class106.anInt1804) / 16;
            Class68_Sub20_Sub6.anIntArrayArray4246 = new int[i_31_][4];
            for (int i_32_ = 0; (i_31_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
                for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > -5; i_33_++) {
                    Class68_Sub20_Sub6.anIntArrayArray4246[i_32_][i_33_] = Class68_Sub13_Sub8.inStream.readDWord();
                    //System.out.println("data: " + Class68_Sub20_Sub6.anIntArrayArray4246[i_32_][i_33_]);
                }
            }
            boolean bool_34_ = false;
            int i_35_ = Class68_Sub13_Sub8.inStream.readUnsignedByteC();
            int i_36_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(i + 1355769449);
            //System.out.println("x & y: " + (i_28_ << 3) + ", " + (i_36_ << 3)); //map regions
            //System.out.println("height: " + i_35_);
            Class119.anIntArray2089 = new int[i_31_];
            Class23.aByteArrayArray490 = new byte[i_31_][];
            Class80.anIntArray1406 = null;
            Class7.aByteArrayArray133 = null;
            if (((i_28_ / 8 ^ 0xffffffff) == -49 || i_28_ / 8 == 49) && i_36_ / 8 == 48)
                bool_34_ = true;
            Class68_Sub13_Sub29.anIntArray3942 = new int[i_31_];
            Class68_Sub20_Sub11.aByteArrayArray4332 = new byte[i_31_][];
            if (i_28_ / 8 == 48 && i_36_ / 8 == 148)
                bool_34_ = true;
            Class96.anIntArray1699 = new int[i_31_];
            i_31_ = 0;
            for (int i_37_ = (i_28_ + -6) / 8; ((6 + i_28_) / 8 ^ 0xffffffff) <= (i_37_ ^ 0xffffffff); i_37_++) {
                for (int i_38_ = (i_36_ + -6) / 8; (i_36_ - -6) / 8 >= i_38_; i_38_++) {
                    int i_39_ = (i_37_ << 1786653352) + i_38_;
                    if (!bool_34_ || (i_38_ != 49 && (i_38_ ^ 0xffffffff) != -150 && i_38_ != 147 && i_37_ != 50 && ((i_37_ ^ 0xffffffff) != -50 || i_38_ != 47))) {
                        Class119.anIntArray2089[i_31_] = i_39_;
                        Class96.anIntArray1699[i_31_] = (Class92.aClass21_Sub1_1644.method335((Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class83.aRSString_1525, Class68_Sub13_Sub24.method816(i_37_, 0), Class68_Sub20_Sub5.aRSString_4223, Class68_Sub13_Sub24.method816(i_38_, 0)}))), (byte) -82));
                        Class68_Sub13_Sub29.anIntArray3942[i_31_] = (Class92.aClass21_Sub1_1644.method335((Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class68_Sub20_Sub16.aRSString_4424, Class68_Sub13_Sub24.method816(i_37_, 0), Class68_Sub20_Sub5.aRSString_4223, Class68_Sub13_Sub24.method816(i_38_, i + -95)}))), (byte) -88));
                    } else {
                        Class119.anIntArray2089[i_31_] = i_39_;
                        Class96.anIntArray1699[i_31_] = -1;
                        Class68_Sub13_Sub29.anIntArray3942[i_31_] = -1;
                    }
                    //Class128.method1890(i_39_, Class68_Sub20_Sub6.anIntArrayArray4246[i_31_]);
                    //dumpData(i_39_, Class68_Sub20_Sub6.anIntArrayArray4246[i_31_]);
                    i_31_++;
                }
            }
            ISAACRandomGen.method1455((byte) -12, i_29_, i_35_, false, i_30_, i_28_, i_36_);
        } else {
            int i_40_ = Class68_Sub13_Sub8.inStream.readUnsignedByteA();
            int i_41_ = Class68_Sub13_Sub8.inStream.readUnsignedWord(i + 1355769449);
            int i_42_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            Class68_Sub13_Sub8.inStream.method965(i + 17);
            for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > -5; i_43_++) {
                for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > -14; i_44_++) {
                    for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > -14; i_45_++) {
                        int i_46_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
                        if (i_46_ == 1)
                            Class68_Sub2.anIntArrayArrayArray2796[i_43_][i_44_][i_45_] = Class68_Sub13_Sub8.inStream.method967((byte) 0, 26);
                        else
                            Class68_Sub2.anIntArrayArrayArray2796[i_43_][i_44_][i_45_] = -1;
                    }
                }
            }
            Class68_Sub13_Sub8.inStream.method966((byte) -59);
            int i_47_ = (-Class68_Sub13_Sub8.inStream.currentOffset + Class106.anInt1804) / 16;
            Class68_Sub20_Sub6.anIntArrayArray4246 = new int[i_47_][4];
            for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
                for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -5; i_49_++)
                    Class68_Sub20_Sub6.anIntArrayArray4246[i_48_][i_49_] = Class68_Sub13_Sub8.inStream.method940((byte) 115);
            }
            int i_50_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            int i_51_ = Class68_Sub13_Sub8.inStream.readUnsignedWordA();
            Class68_Sub20_Sub11.aByteArrayArray4332 = new byte[i_47_][];
            Class7.aByteArrayArray133 = null;
            Class96.anIntArray1699 = new int[i_47_];
            Class80.anIntArray1406 = null;
            Class119.anIntArray2089 = new int[i_47_];
            Class23.aByteArrayArray490 = new byte[i_47_][];
            Class68_Sub13_Sub29.anIntArray3942 = new int[i_47_];
            i_47_ = 0;
            for (int i_52_ = 0; i_52_ < 4; i_52_++) {
                for (int i_53_ = 0; (i_53_ ^ 0xffffffff) > -14; i_53_++) {
                    for (int i_54_ = 0; i_54_ < 13; i_54_++) {
                        int i_55_ = (Class68_Sub2.anIntArrayArrayArray2796[i_52_][i_53_][i_54_]);
                        if (i_55_ != -1) {
                            int i_56_ = 0x3ff & i_55_ >> -1474462546;
                            int i_57_ = (i_55_ & 0x3fff) >> 160515;
                            int i_58_ = i_57_ / 8 + (i_56_ / 8 << 2129198792);
                            for (int i_59_ = 0; i_59_ < i_47_; i_59_++) {
                                if (Class119.anIntArray2089[i_59_] == i_58_) {
                                    i_58_ = -1;
                                    break;
                                }
                            }
                            if (i_58_ != -1) {
                                int i_60_ = (i_58_ & 0xff02) >> 1393055048;
                                int i_61_ = i_58_ & 0xff;
                                Class119.anIntArray2089[i_47_] = i_58_;
                                Class96.anIntArray1699[i_47_] = (Class92.aClass21_Sub1_1644.method335((Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class83.aRSString_1525, Class68_Sub13_Sub24.method816(i_60_, i + -95), Class68_Sub20_Sub5.aRSString_4223, (Class68_Sub13_Sub24.method816(i_61_, Class15.method278(i, 95)))}))), (byte) -99));
                                Class68_Sub13_Sub29.anIntArray3942[i_47_] = (Class92.aClass21_Sub1_1644.method335((Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{(Class68_Sub20_Sub16.aRSString_4424), Class68_Sub13_Sub24.method816(i_60_, 0), Class68_Sub20_Sub5.aRSString_4223, Class68_Sub13_Sub24.method816(i_61_, 0)}))), (byte) -88));
                                //Class128.method1890(i_58_, Class68_Sub20_Sub6.anIntArrayArray4246[i_47_]);
                                //dumpData(i_58_, Class68_Sub20_Sub6.anIntArrayArray4246[i_47_]);
                                i_47_++;
                            }
                        }
                    }
                }
            }
            ISAACRandomGen.method1455((byte) -45, i_50_, i_40_, false, i_42_, i_51_, i_41_);
        }
        if (i != 95)
            anInt3681 = 18;
        anInt3692++;
    }

    public static void dumpData(int region, int[] data) {
        try {
            FileWriter fileWriter = new FileWriter("./mapdata/" + region + ".txt");
            BufferedWriter out = new BufferedWriter(fileWriter);
            for (int i = 0; i < data.length; i++) {
                out.write("" + data[i]);
                out.newLine();
            }
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method769(byte i) {
        if (i < 6)
            anIntArray3679 = null;
        anIntArray3679 = null;
    }

    public static void method770(byte i) {
        if (Class68_Sub13_Sub27.aFloat3913 > Class68_Sub9.aFloat2892) {
            Class68_Sub9.aFloat2892 += (double) Class68_Sub9.aFloat2892 / 30.0;
            if (Class68_Sub13_Sub27.aFloat3913 < Class68_Sub9.aFloat2892)
                Class68_Sub9.aFloat2892 = Class68_Sub13_Sub27.aFloat3913;
            Class128.method1782(-1);
        } else if (Class68_Sub13_Sub27.aFloat3913 < Class68_Sub9.aFloat2892) {
            Class68_Sub9.aFloat2892 -= (double) Class68_Sub9.aFloat2892 / 30.0;
            if (Class68_Sub13_Sub27.aFloat3913 > Class68_Sub9.aFloat2892)
                Class68_Sub9.aFloat2892 = Class68_Sub13_Sub27.aFloat3913;
            Class128.method1782(-1);
        }
        anInt3691++;
        if ((Class3.anInt85 ^ 0xffffffff) != 0
                && (Class68_Sub22.anInt3145 ^ 0xffffffff) != 0) {
            int i_62_ = -Class68_Sub13_Sub24.anInt3844 + Class3.anInt85;
            int i_63_ = Class68_Sub22.anInt3145 - Class85.anInt1551;
            if (i_62_ < 2 || i_62_ > 2)
                i_62_ >>= 4;
            Class68_Sub13_Sub24.anInt3844
                    = i_62_ + Class68_Sub13_Sub24.anInt3844;
            if (i_63_ < 2 || i_63_ > 2)
                i_63_ >>= 4;
            Class85.anInt1551 = i_63_ + Class85.anInt1551;
            if ((i_62_ ^ 0xffffffff) == -1 && (i_63_ ^ 0xffffffff) == -1) {
                Class3.anInt85 = -1;
                Class68_Sub22.anInt3145 = -1;
            }
            Class128.method1782(-1);
        }
        if (i >= -45)
            method764(72, -116, false);
    }
}
