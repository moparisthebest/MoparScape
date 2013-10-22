/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class45 {
    public int anInt756 = 0;
    public static int anInt757;
    public static int anInt758;
    public Object[] anObjectArray759;
    public static int anInt760;
    public boolean aBoolean761;
    public int anInt762;
    public int anInt763;
    public boolean aBoolean764;
    public boolean aBoolean765;
    public boolean aBoolean766;
    public int[] anIntArray767;
    public int anInt768;
    public Class45[] aClass45Array769;
    public Object[] anObjectArray770;
    public int anInt771;
    public Object[] anObjectArray772;
    public int anInt773 = 0;
    public int[] anIntArray774;
    public int anInt775;
    public int anInt776;
    public int anInt777;
    public Object[] anObjectArray778;
    public byte aByte779;
    public int[] anIntArray780;
    public int anInt781;
    public int anInt782;
    public int[] anIntArray783;
    public Object[] anObjectArray784;
    public boolean aBoolean785;
    public Object[] anObjectArray786;
    public int[] anIntArray787;
    public Object[] anObjectArray788;
    public int anInt789;
    public Object[] anObjectArray790;
    public int[] anIntArray791;
    public int anInt792;
    public int anInt793;
    public int anInt794;
    public int[] anIntArray795;
    public int[] anIntArray796;
    public int anInt797;
    public int anInt798;
    public int anInt799;
    public static int anInt800;
    public Object[] anObjectArray801;
    public Object[] anObjectArray802;
    public int anInt803;
    public static int anInt804;
    public static int anInt805;
    public Object[] anObjectArray806;
    public Object[] anObjectArray807;
    public int anInt808;
    public static int anInt809;
    public int anInt810;
    public byte aByte811;
    public Object[] anObjectArray812;
    public boolean aBoolean813;
    public int anInt814;
    public int anInt815;
    public int anInt816;
    public RSString[] aRSStringArray817;
    public int anInt818;
    public boolean aBoolean819;
    public byte aByte820;
    public Object[] anObjectArray821;
    public int anInt822;
    public RSString[] aRSStringArray823;
    public static int anInt824;
    public boolean aBoolean825;
    public int[] anIntArray826;
    public boolean aBoolean827;
    public int anInt828;
    public static int anInt829;
    public int anInt830;
    public int anInt831;
    public int anInt832;
    public int anInt833;
    public static int anInt834;
    public Object[] anObjectArray835;
    public int anInt836;
    public Object[] anObjectArray837;
    public Object[] anObjectArray838;
    public int anInt839;
    public int anInt840;
    public int[] anIntArray841;
    public int anInt842;
    public Object[] anObjectArray843;
    public int anInt844;
    public int anInt845;
    public int anInt846;
    public int anInt847;
    public Object[] anObjectArray848;
    public int anInt849;
    public boolean aBoolean850;
    public boolean aBoolean851;
    public int anInt852;
    public int anInt853;
    public int[] anIntArray854;
    public int anInt855;
    public Object[] anObjectArray856;
    public int anInt857;
    public static int anInt858;
    public int anInt859;
    public int anInt860;
    public Object[] anObjectArray861;
    public int anInt862;
    public boolean aBoolean863;
    public int anInt864;
    public int anInt865;
    public boolean aBoolean866;
    public int anInt867;
    public Object[] anObjectArray868;
    public int anInt869;
    public int anInt870;
    public Object[] anObjectArray871;
    public Object[] anObjectArray872;
    public int anInt873;
    public Object[] anObjectArray874;
    public Object[] anObjectArray875;
    public RSString aRSString_876;
    public int anInt877;
    public Object[] anObjectArray878;
    public int anInt879;
    public RSString aRSString_880;
    public RSString aRSString_881;
    public static int anInt882;
    public int anInt883;
    public RSString aRSString_884;
    public int anInt885;
    public static Class16 aClass16_886 = new Class16();
    public int[] anIntArray887;
    public int anInt888;
    public int anInt889;
    public RSString aRSString_890;
    public int[] anIntArray891;
    public int anInt892;
    public Class45 aClass45_893;
    public boolean aBoolean894;
    public static int anInt895;
    public int anInt896;
    public Object[] anObjectArray897;
    public RSString aRSString_898;
    public int anInt899;
    public int[] anIntArray900;
    public int anInt901;
    public int anInt902;
    public int anInt903;
    public byte aByte904;
    public boolean aBoolean905;
    public int anInt906;
    public byte[] aByteArray907;
    public int[][] anIntArrayArray908;
    public int anInt909;
    public int anInt910;
    public Object[] anObjectArray911;
    public static int anInt912;
    public Object[] anObjectArray913;
    public int anInt914;
    public int anInt915;
    public boolean aBoolean916;
    public static int anInt917 = 0;
    public static Class98 aClass98_918 = new Class98(100);
    public static int anInt919 = 3;
    public static RSString aRSString_920;
    public static float aFloat921;
    public static RSString aRSString_922;
    public static RSString aRSString_923;
    public static RSString aRSString_924;
    public static int anInt925 = 0;
    public static Class16[][][] aClass16ArrayArrayArray926
            = new Class16[4][104][104];
    public static RSString aRSString_927;

    public void method495(int i, int i_0_, int i_1_) {
        if (i_0_ < 27)
            aBoolean764 = false;
        int i_2_ = anIntArray795[i_1_];
        anInt757++;
        anIntArray795[i_1_] = anIntArray795[i];
        anIntArray795[i] = i_2_;
        i_2_ = anIntArray774[i_1_];
        anIntArray774[i_1_] = anIntArray774[i];
        anIntArray774[i] = i_2_;
    }

    public void method496(int i, RSString class100, int i_3_) {
        if (i_3_ != 0)
            anInt768 = 47;
        if (aRSStringArray823 == null
                || (aRSStringArray823.length ^ 0xffffffff) >= (i ^ 0xffffffff)) {
            RSString[] class100s = new RSString[1 + i];
            if (aRSStringArray823 != null) {
                for (int i_4_ = 0;
                     ((i_4_ ^ 0xffffffff)
                             > (aRSStringArray823.length ^ 0xffffffff));
                     i_4_++)
                    class100s[i_4_] = aRSStringArray823[i_4_];
            }
            aRSStringArray823 = class100s;
        }
        aRSStringArray823[i] = class100;
        anInt809++;
    }

    public boolean method497(int i) {
        anInt895++;
        if (anIntArray854 != null)
            return true;
        Class92_Sub1 class92_sub1
                = Class68_Sub13_Sub18.method791(Class8.aClass21_164, (byte) 66,
                anInt840, 0);
        if (class92_sub1 == null)
            return false;
        if (i != 2663)
            anInt773 = 6;
        class92_sub1.method1539();
        anIntArray854 = new int[class92_sub1.anInt1658];
        anIntArray783 = new int[class92_sub1.anInt1658];
        for (int i_5_ = 0;
             (i_5_ ^ 0xffffffff) > (class92_sub1.anInt1658 ^ 0xffffffff);
             i_5_++) {
            int i_6_ = 0;
            int i_7_ = class92_sub1.anInt1659;
            for (int i_8_ = 0; class92_sub1.anInt1659 > i_8_; i_8_++) {
                if (((class92_sub1.aByteArray3332
                        [class92_sub1.anInt1659 * i_5_ + i_8_])
                        ^ 0xffffffff)
                        != -1) {
                    i_6_ = i_8_;
                    break;
                }
            }
            for (int i_9_ = i_6_; i_9_ < class92_sub1.anInt1659; i_9_++) {
                if ((class92_sub1.aByteArray3332
                        [class92_sub1.anInt1659 * i_5_ + i_9_])
                        == 0) {
                    i_7_ = i_9_;
                    break;
                }
            }
            anIntArray854[i_5_] = i_6_;
            anIntArray783[i_5_] = -i_6_ + i_7_;
        }
        return true;
    }

    public void method498(int i, Stream class68_sub14) {
        anInt882++;
        aBoolean863 = false;
        anInt896 = class68_sub14.readUnsignedByte(i + 11488);
        anInt782 = class68_sub14.readUnsignedByte(-6677);
        anInt808 = class68_sub14.readUnsignedWord(1355769544);
        anInt810 = class68_sub14.method957(-22489);
        anInt914 = class68_sub14.method957(-22489);
        anInt773 = class68_sub14.readUnsignedWord(1355769544);
        anInt899 = class68_sub14.readUnsignedWord(1355769544);
        aByte779 = (byte) 0;
        aByte904 = (byte) 0;
        aByte811 = (byte) 0;
        aByte820 = (byte) 0;
        anInt775 = class68_sub14.readUnsignedByte(-6677);
        anInt799 = class68_sub14.readUnsignedWord(1355769544);
        if ((anInt799 ^ 0xffffffff) == -65536)
            anInt799 = -1;
        else
            anInt799 = anInt799 + (~0xffff & anInt792);
        anInt844 = class68_sub14.readUnsignedWord(i + 1355787709);
        if (anInt844 == 65535)
            anInt844 = -1;
        int i_10_ = class68_sub14.readUnsignedByte(-6677);
        if ((i_10_ ^ 0xffffffff) < -1) {
            anIntArray796 = new int[i_10_];
            anIntArray791 = new int[i_10_];
            for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff);
                 i_11_++) {
                anIntArray796[i_11_]
                        = class68_sub14.readUnsignedByte(Class15.method278(i, 23776));
                anIntArray791[i_11_] = class68_sub14.readUnsignedWord(1355769544);
            }
        }
        if (i != -18165)
            aRSString_923 = null;
        int i_12_ = class68_sub14.readUnsignedByte(-6677);
        if (i_12_ > 0) {
            anIntArrayArray908 = new int[i_12_][];
            for (int i_13_ = 0; (i_12_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff);
                 i_13_++) {
                int i_14_ = class68_sub14.readUnsignedWord(1355769544);
                anIntArrayArray908[i_13_] = new int[i_14_];
                for (int i_15_ = 0;
                     (i_14_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
                    anIntArrayArray908[i_13_][i_15_]
                            = class68_sub14.readUnsignedWord(1355769544);
                    if ((anIntArrayArray908[i_13_][i_15_] ^ 0xffffffff)
                            == -65536)
                        anIntArrayArray908[i_13_][i_15_] = -1;
                }
            }
        }
        if ((anInt896 ^ 0xffffffff) == -1) {
            anInt794 = class68_sub14.readUnsignedWord(1355769544);
            aBoolean764 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
        }
        if (anInt896 == 1) {
            class68_sub14.readUnsignedWord(1355769544);
            class68_sub14.readUnsignedByte(-6677);
        }
        if (anInt896 == 2) {
            aByte811 = (byte) 3;
            anIntArray774 = new int[anInt773 * anInt899];
            anIntArray795 = new int[anInt773 * anInt899];
            aByte779 = (byte) 3;
            int i_16_ = class68_sub14.readUnsignedByte(-6677);
            if (i_16_ == 1)
                anInt763 |= 0x10000000;
            int i_17_ = class68_sub14.readUnsignedByte(-6677);
            if ((i_17_ ^ 0xffffffff) == -2)
                anInt763 |= 0x40000000;
            int i_18_ = class68_sub14.readUnsignedByte(i ^ 0x5ce0);
            if ((i_18_ ^ 0xffffffff) == -2)
                anInt763 |= ~0x7fffffff;
            int i_19_ = class68_sub14.readUnsignedByte(-6677);
            if (i_19_ == 1)
                anInt763 |= 0x20000000;
            anInt885 = class68_sub14.readUnsignedByte(-6677);
            anInt846 = class68_sub14.readUnsignedByte(-6677);
            anIntArray767 = new int[20];
            anIntArray841 = new int[20];
            anIntArray826 = new int[20];
            for (int i_20_ = 0; i_20_ < 20; i_20_++) {
                int i_21_ = class68_sub14.readUnsignedByte(i ^ 0x5ce0);
                if ((i_21_ ^ 0xffffffff) == -2) {
                    anIntArray826[i_20_] = class68_sub14.method957(-22489);
                    anIntArray767[i_20_] = class68_sub14.method957(-22489);
                    anIntArray841[i_20_] = class68_sub14.readDWord();
                } else
                    anIntArray841[i_20_] = -1;
            }
            aRSStringArray817 = new RSString[5];
            for (int i_22_ = 0; i_22_ < 5; i_22_++) {
                RSString class100 = class68_sub14.readString(127);
                if ((class100.method1590((byte) -103) ^ 0xffffffff) < -1) {
                    aRSStringArray817[i_22_] = class100;
                    anInt763 |= 1 << i_22_ + 23;
                }
            }
        }
        if ((anInt896 ^ 0xffffffff) == -4)
            aBoolean866 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
        if ((anInt896 ^ 0xffffffff) == -5 || anInt896 == 1) {
            anInt777 = class68_sub14.readUnsignedByte(i + 11488);
            anInt830 = class68_sub14.readUnsignedByte(-6677);
            anInt789 = class68_sub14.readUnsignedByte(-6677);
            anInt901 = class68_sub14.readUnsignedWord(1355769544);
            if (anInt901 == 65535)
                anInt901 = -1;
            aBoolean761 = class68_sub14.readUnsignedByte(-6677) == 1;
        }
        if ((anInt896 ^ 0xffffffff) == -5) {
            aRSString_881 = class68_sub14.readString(127);
            aRSString_880 = class68_sub14.readString(127);
        }
        if ((anInt896 ^ 0xffffffff) == -2 || (anInt896 ^ 0xffffffff) == -4
                || (anInt896 ^ 0xffffffff) == -5)
            anInt832 = class68_sub14.readDWord();
        if (anInt896 == 3 || (anInt896 ^ 0xffffffff) == -5) {
            anInt862 = class68_sub14.readDWord();
            anInt828 = class68_sub14.readDWord();
            anInt776 = class68_sub14.readDWord();
        }
        if (anInt896 == 5) {
            anInt840 = class68_sub14.readDWord();
            anInt833 = class68_sub14.readDWord();
        }
        if (anInt896 == 6) {
            anInt865 = 1;
            anInt803 = class68_sub14.readUnsignedWord(i + 1355787709);
            anInt797 = 1;
            if ((anInt803 ^ 0xffffffff) == -65536)
                anInt803 = -1;
            anInt852 = class68_sub14.readUnsignedWord(i ^ ~0x50cf203c);
            if (anInt852 == 65535)
                anInt852 = -1;
            anInt831 = class68_sub14.readUnsignedWord(i + 1355787709);
            if (anInt831 == 65535)
                anInt831 = -1;
            anInt869 = class68_sub14.readUnsignedWord(1355769544);
            if ((anInt869 ^ 0xffffffff) == -65536)
                anInt869 = -1;
            anInt762 = class68_sub14.readUnsignedWord(1355769544);
            anInt864 = class68_sub14.readUnsignedWord(i + 1355787709);
            anInt814 = class68_sub14.readUnsignedWord(1355769544);
        }
        if ((anInt896 ^ 0xffffffff) == -8) {
            aByte811 = (byte) 3;
            anIntArray774 = new int[anInt899 * anInt773];
            anIntArray795 = new int[anInt899 * anInt773];
            aByte779 = (byte) 3;
            anInt777 = class68_sub14.readUnsignedByte(i + 11488);
            anInt901 = class68_sub14.readUnsignedWord(i ^ ~0x50cf203c);
            if (anInt901 == 65535)
                anInt901 = -1;
            aBoolean761 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
            anInt832 = class68_sub14.readDWord();
            anInt885 = class68_sub14.method957(-22489);
            anInt846 = class68_sub14.method957(-22489);
            int i_23_ = class68_sub14.readUnsignedByte(-6677);
            aRSStringArray817 = new RSString[5];
            if ((i_23_ ^ 0xffffffff) == -2)
                anInt763 |= 0x40000000;
            for (int i_24_ = 0; i_24_ < 5; i_24_++) {
                RSString class100 = class68_sub14.readString(i ^ ~0x468b);
                if ((class100.method1590((byte) -124) ^ 0xffffffff) < -1) {
                    aRSStringArray817[i_24_] = class100;
                    anInt763 |= 1 << 23 - -i_24_;
                }
            }
        }
        if (anInt896 == 8)
            aRSString_881 = class68_sub14.readString(127);
        if (anInt782 == 2 || (anInt896 ^ 0xffffffff) == -3) {
            aRSString_884 = class68_sub14.readString(127);
            aRSString_898 = class68_sub14.readString(i ^ ~0x468b);
            int i_25_ = class68_sub14.readUnsignedWord(1355769544) & 0x3f;
            anInt763 |= i_25_ << 68141611;
        }
        if ((anInt782 ^ 0xffffffff) == -2 || (anInt782 ^ 0xffffffff) == -5
                || anInt782 == 5 || anInt782 == 6) {
            aRSString_876 = class68_sub14.readString(127);
            if (aRSString_876.method1590((byte) -118) == 0) {
                if ((anInt782 ^ 0xffffffff) == -2)
                    aRSString_876 = Class78.aRSString_1389;
                if ((anInt782 ^ 0xffffffff) == -5)
                    aRSString_876 = Class20.aRSString_401;
                if ((anInt782 ^ 0xffffffff) == -6)
                    aRSString_876 = Class20.aRSString_401;
                if (anInt782 == 6)
                    aRSString_876 = Class75_Sub3.aRSString_3321;
            }
        }
        if (anInt782 == 1 || (anInt782 ^ 0xffffffff) == -5
                || (anInt782 ^ 0xffffffff) == -6)
            anInt763 |= 0x400000;
        if ((anInt782 ^ 0xffffffff) == -7)
            anInt763 |= 0x1;
    }

    public Class68_Sub20_Sub10 method499(byte i, int i_26_) {
        Class93.aBoolean1669 = false;
        anInt758++;
        if ((i_26_ ^ 0xffffffff) > -1
                || (anIntArray841.length ^ 0xffffffff) >= (i_26_ ^ 0xffffffff))
            return null;
        int i_27_ = anIntArray841[i_26_];
        if (i > -26)
            anObjectArray778 = null;
        if ((i_27_ ^ 0xffffffff) == 0)
            return null;
        Class68_Sub20_Sub10 class68_sub20_sub10
                = ((Class68_Sub20_Sub10)
                Class125.aClass98_2171.method1570(14366, (long) i_27_));
        if (class68_sub20_sub10 != null)
            return class68_sub20_sub10;
        class68_sub20_sub10
                = Class119.method1736(64, i_27_, 0, Class8.aClass21_164);
        if (class68_sub20_sub10 == null)
            Class93.aBoolean1669 = true;
        else
            Class125.aClass98_2171.method1568(class68_sub20_sub10, 99,
                    (long) i_27_);
        return class68_sub20_sub10;
    }

    public static void method500(int i) {
        aRSString_920 = null;
        aClass16ArrayArrayArray926 = null;
        aRSString_927 = null;
        aRSString_923 = null;
        aClass16_886 = null;
        if (i != 104)
            method501(null, 57);
        aClass98_918 = null;
        aRSString_924 = null;
        aRSString_922 = null;
    }

    public static void method501(Class21renamed class21, int i) {
        anInt829++;
        if (i == 1)
            Class102.aClass21_1753 = class21;
    }

    public void method502(int i, Stream class68_sub14) {
        class68_sub14.currentOffset++;
        anInt912++;
        aBoolean863 = true;
        anInt896 = class68_sub14.readUnsignedByte(-6677);
        anInt808 = class68_sub14.readUnsignedWord(1355769544);
        anInt810 = class68_sub14.method957(-22489);
        anInt914 = class68_sub14.method957(-22489);
        anInt773 = class68_sub14.readUnsignedWord(1355769544);
        anInt899 = class68_sub14.readUnsignedWord(1355769544);
        aByte779 = class68_sub14.method955(3390);
        aByte811 = class68_sub14.method955(3390);
        aByte904 = class68_sub14.method955(3390);
        aByte820 = class68_sub14.method955(3390);
        anInt799 = class68_sub14.readUnsignedWord(1355769544);
        if ((anInt799 ^ 0xffffffff) == -65536)
            anInt799 = -1;
        else
            anInt799 = anInt799 + (~0xffff & anInt792);
        aBoolean764 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == i;
        if (anInt896 == 0) {
            anInt888 = class68_sub14.readUnsignedWord(1355769544);
            anInt794 = class68_sub14.readUnsignedWord(i ^ ~0x50cf66c9);
            aBoolean916 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
        }
        if ((anInt896 ^ 0xffffffff) == -6) {
            anInt840 = class68_sub14.readDWord();
            anInt845 = class68_sub14.readUnsignedWord(1355769544);
            int i_28_ = class68_sub14.readUnsignedByte(-6677);
            aBoolean827 = (0x1 & i_28_ ^ 0xffffffff) != -1;
            aBoolean765 = (i_28_ & 0x2) != 0;
            anInt775 = class68_sub14.readUnsignedByte(-6677);
            anInt859 = class68_sub14.readUnsignedByte(-6677);
            anInt906 = class68_sub14.readDWord();
            aBoolean819 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
            aBoolean825
                    = (class68_sub14.readUnsignedByte(i ^ 0x1a15) ^ 0xffffffff) == -2;
        }
        if ((anInt896 ^ 0xffffffff) == -7) {
            anInt865 = 1;
            anInt803 = class68_sub14.readUnsignedWord(1355769544);
            if ((anInt803 ^ 0xffffffff) == -65536)
                anInt803 = -1;
            anInt857 = class68_sub14.method957(-22489);
            anInt816 = class68_sub14.method957(-22489);
            anInt864 = class68_sub14.readUnsignedWord(1355769544);
            anInt814 = class68_sub14.readUnsignedWord(1355769544);
            anInt853 = class68_sub14.readUnsignedWord(1355769544);
            anInt762 = class68_sub14.readUnsignedWord(1355769544);
            anInt831 = class68_sub14.readUnsignedWord(i + 1355769546);
            if (anInt831 == 65535)
                anInt831 = -1;
            aBoolean813 = class68_sub14.readUnsignedByte(i ^ 0x1a15) == 1;
            class68_sub14.readUnsignedWord(1355769544);
            class68_sub14.readUnsignedWord(1355769544);
            class68_sub14.readUnsignedByte(-6677);
            if ((aByte779 ^ 0xffffffff) != -1)
                anInt793 = class68_sub14.readUnsignedWord(i ^ ~0x50cf66c9);
            if ((aByte811 ^ 0xffffffff) != -1)
                anInt883 = class68_sub14.readUnsignedWord(1355769544);
        }
        if ((anInt896 ^ 0xffffffff) == -5) {
            anInt901 = class68_sub14.readUnsignedWord(1355769544);
            if (anInt901 == 65535)
                anInt901 = -1;
            aRSString_881 = class68_sub14.readString(127);
            anInt789 = class68_sub14.readUnsignedByte(-6677);
            anInt777 = class68_sub14.readUnsignedByte(i + -6675);
            anInt830 = class68_sub14.readUnsignedByte(i + -6675);
            aBoolean761 = class68_sub14.readUnsignedByte(i ^ 0x1a15) == 1;
            anInt832 = class68_sub14.readDWord();
        }
        if (anInt896 == 3) {
            anInt832 = class68_sub14.readDWord();
            aBoolean866 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
            anInt775 = class68_sub14.readUnsignedByte(i + -6675);
        }
        if ((anInt896 ^ 0xffffffff) == -10) {
            anInt822 = class68_sub14.readUnsignedByte(-6677);
            anInt832 = class68_sub14.readDWord();
            aBoolean894 = class68_sub14.readUnsignedByte(-6677) == 1;
        }
        anInt763 = class68_sub14.method921((byte) -113);
        int i_29_ = class68_sub14.readUnsignedByte(-6677);
        if (i_29_ > 0) {
            aByteArray907 = new byte[i_29_];
            for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff);
                 i_30_++)
                aByteArray907[i_30_] = class68_sub14.method955(i + 3392);
        }
        aRSString_890 = class68_sub14.readString(i ^ ~0x7e);
        int i_31_ = class68_sub14.readUnsignedByte(-6677);
        if ((i_31_ ^ 0xffffffff) < -1) {
            aRSStringArray823 = new RSString[i_31_];
            for (int i_32_ = 0; (i_31_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff);
                 i_32_++)
                aRSStringArray823[i_32_] = class68_sub14.readString(127);
        }
        anInt870 = class68_sub14.readUnsignedByte(-6677);
        anInt909 = class68_sub14.readUnsignedByte(i ^ 0x1a15);
        aBoolean766 = class68_sub14.readUnsignedByte(-6677) == 1;
        aRSString_884 = class68_sub14.readString(127);
        anObjectArray759 = method504((byte) -72, class68_sub14);
        anObjectArray784 = method504((byte) -72, class68_sub14);
        anObjectArray772 = method504((byte) -72, class68_sub14);
        anObjectArray806 = method504((byte) -72, class68_sub14);
        anObjectArray913 = method504((byte) -72, class68_sub14);
        anObjectArray786 = method504((byte) -72, class68_sub14);
        anObjectArray837 = method504((byte) -72, class68_sub14);
        anObjectArray861 = method504((byte) -72, class68_sub14);
        anObjectArray878 = method504((byte) -72, class68_sub14);
        anObjectArray856 = method504((byte) -72, class68_sub14);
        anObjectArray838 = method504((byte) -72, class68_sub14);
        anObjectArray788 = method504((byte) -72, class68_sub14);
        anObjectArray911 = method504((byte) -72, class68_sub14);
        anObjectArray790 = method504((byte) -72, class68_sub14);
        anObjectArray821 = method504((byte) -72, class68_sub14);
        anObjectArray807 = method504((byte) -72, class68_sub14);
        anObjectArray778 = method504((byte) -72, class68_sub14);
        anObjectArray848 = method504((byte) -72, class68_sub14);
        anObjectArray875 = method504((byte) -72, class68_sub14);
        anObjectArray835 = method504((byte) -72, class68_sub14);
        anIntArray787 = method503(class68_sub14, 0);
        anIntArray887 = method503(class68_sub14, 0);
        anIntArray891 = method503(class68_sub14, 0);
        anIntArray900 = method503(class68_sub14, 0);
        anIntArray780 = method503(class68_sub14, 0);
    }

    public int[] method503(Stream class68_sub14, int i) {
        anInt804++;
        int i_33_ = class68_sub14.readUnsignedByte(-6677);
        if (i == i_33_)
            return null;
        int[] is = new int[i_33_];
        for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
            is[i_34_] = class68_sub14.readDWord();
        return is;
    }

    public Object[] method504(byte i, Stream class68_sub14) {
        anInt800++;
        int i_35_ = class68_sub14.readUnsignedByte(i + -6605);
        if (i_35_ == 0)
            return null;
        Object[] objects = new Object[i_35_];
        if (i != -72)
            anObjectArray913 = null;
        for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff);
             i_36_++) {
            int i_37_ = class68_sub14.readUnsignedByte(-6677);
            if ((i_37_ ^ 0xffffffff) == -1)
                objects[i_36_] = new Integer(class68_sub14.readDWord());
            else if (i_37_ == 1)
                objects[i_36_] = class68_sub14.readString(127);
        }
        aBoolean851 = true;
        return objects;
    }

    public Class68_Sub20_Sub1 method505(int i, Class92[] class92s) {
        anInt858++;
        Class93.aBoolean1669 = false;
        if ((anInt901 ^ 0xffffffff) == 0)
            return null;
        if (i >= -86)
            method495(51, 87, -18);
        Class68_Sub20_Sub1 class68_sub20_sub1
                = ((Class68_Sub20_Sub1)
                Class68_Sub13_Sub20.aClass98_3778.method1570(14366,
                        (long) anInt901));
        if (class68_sub20_sub1 != null)
            return class68_sub20_sub1;
        class68_sub20_sub1
                = Class90.method1509(Class8.aClass21_164, 0, (byte) 127,
                Class68_Sub10.aClass21_2907, anInt901);
        if (class68_sub20_sub1 == null)
            Class93.aBoolean1669 = true;
        else {
            class68_sub20_sub1.method1017(class92s, null);
            Class68_Sub13_Sub20.aClass98_3778.method1568(class68_sub20_sub1,
                    107, (long) anInt901);
        }
        return class68_sub20_sub1;
    }

    public Class1_Sub3 method506(int i, boolean bool, byte i_38_,
                                 PlayerDefinition class126, Class55 class117) {
        try {
            anInt760++;
            if (i_38_ != -27)
                method505(103, null);
            Class93.aBoolean1669 = false;
            int i_39_;
            int i_40_;
            if (!bool) {
                i_40_ = anInt803;
                i_39_ = anInt865;
            } else {
                i_39_ = anInt797;
                i_40_ = anInt852;
            }
            if (i_39_ == 0)
                return null;
            if (i_39_ == 1 && i_40_ == -1)
                return null;
            if (i_39_ == 1) {
                Class1_Sub3 class1_sub3
                        = ((Class1_Sub3)
                        Class12.aClass98_211.method1570(i_38_ + 14393,
                                (long) ((i_39_
                                        << -989736496)
                                        + i_40_)));
                if (class1_sub3 == null) {
                    Class1_Sub4 class1_sub4
                            = Class1_Sub4.method115(Class1_Sub7.aClass21_2618,
                            i_40_, 0);
                    if (class1_sub4 == null) {
                        Class93.aBoolean1669 = true;
                        return null;
                    }
                    class1_sub3
                            = class1_sub4.method127(64, 768, -50, -10, -50);
                    Class12.aClass98_211.method1568
                            (class1_sub3, i_38_ ^ ~0x63,
                                    (long) (i_40_ + (i_39_ << -181231824)));
                }
                if (class117 != null)
                    class1_sub3
                            = class117.method1722((byte) 123, class1_sub3, i);
                return class1_sub3;
            }
            if ((i_39_ ^ 0xffffffff) == -3) {
                Class1_Sub3 class1_sub3
                        = Class68_Sub13_Sub11.method753(i_40_, 101)
                        .method1450(class117, (byte) 12, i);
                if (class1_sub3 == null) {
                    Class93.aBoolean1669 = true;
                    return null;
                }
                return class1_sub3;
            }
            if ((i_39_ ^ 0xffffffff) == -4) {
                if (class126 == null)
                    return null;
                Class1_Sub3 class1_sub3
                        = class126.method1771(i, class117, -13);
                if (class1_sub3 == null) {
                    Class93.aBoolean1669 = true;
                    return null;
                }
                return class1_sub3;
            }
            if (i_39_ == 4) {
                ItemDef class19 = Applet_Sub1.method18(-25672, i_40_);
                Class1_Sub3 class1_sub3
                        = class19.method318(10, class117, i, 13895);
                if (class1_sub3 == null) {
                    Class93.aBoolean1669 = true;
                    return null;
                }
                return class1_sub3;
            }
            if ((i_39_ ^ 0xffffffff) == -7) {
                Class1_Sub3 class1_sub3
                        = Class68_Sub13_Sub11.method753(i_40_, -119)
                        .method1451(0, null, (byte) -121, class117, i);
                if (class1_sub3 == null) {
                    Class93.aBoolean1669 = true;
                    return null;
                }
                return class1_sub3;
            }
            if ((i_39_ ^ 0xffffffff) == -8) {
                int i_41_ = anInt803 & 0xffff;
                int i_42_ = anInt803 >>> 1664705104;
                Class1_Sub3 class1_sub3
                        = class126.method1766(i, class117, i_42_, i_41_,
                        (byte) -37);
                if (class1_sub3 == null) {
                    Class93.aBoolean1669 = true;
                    return null;
                }
                return class1_sub3;
            }
            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ha.J(" + i + ',' + bool + ',' + i_38_
                            + ','
                            + (class126 != null ? "{...}" : "null")
                            + ','
                            + (class117 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public Class68_Sub20_Sub10 method507(boolean bool, int i) {
        Class93.aBoolean1669 = false;
        anInt805++;
        int i_43_;
        if (bool)
            i_43_ = anInt833;
        else
            i_43_ = anInt840;
        if ((i_43_ ^ 0xffffffff) == 0)
            return null;
        long l = ((long) i_43_ + ((!aBoolean765 ? 0L : 1L) << 1356195)
                + (((long) anInt859 << 1472580260)
                + ((!aBoolean819 ? 0L : 1L) << 1233233126)
                - -((aBoolean825 ? 1L : 0L) << 2132906599)
                - -((long) anInt906 << -670715992)));
        Class68_Sub20_Sub10 class68_sub20_sub10
                = ((Class68_Sub20_Sub10)
                Class125.aClass98_2171.method1570(i ^ 0x6809, l));
        if (class68_sub20_sub10 != null)
            return class68_sub20_sub10;
        Sprite sprite;
        if (aBoolean765)
            sprite
                    = Class68_Sub13_Sub31.method854(90, Class8.aClass21_164, 0,
                    i_43_);
        else
            sprite
                    = Class68_Sub22.method1202(i_43_, (byte) -96,
                    Class8.aClass21_164, 0);
        if (sprite == null) {
            Class93.aBoolean1669 = true;
            return null;
        }
        if (aBoolean819)
            sprite.method1117();
        Sprite sprite_44_
                = sprite;
        if (aBoolean825)
            sprite.method1120();
        if (i != 20503)
            method506(45, true, (byte) 41, null, null);
        if (anInt859 > 0)
            sprite.method1125(anInt859);
        if ((anInt859 ^ 0xffffffff) <= -2)
            sprite.method1118(1);
        if (anInt859 >= 2)
            sprite.method1118(16777215);
        if ((anInt906 ^ 0xffffffff) != -1)
            sprite.method1123(anInt906);
        Class125.aClass98_2171.method1568(sprite_44_,
                i + -20386, l);
        return sprite_44_;
    }

    public Class45() {
        anInt768 = 1;
        anInt771 = 0;
        aBoolean765 = false;
        anInt777 = 0;
        anInt789 = 0;
        anInt794 = 0;
        anInt775 = 0;
        anInt810 = 0;
        anInt798 = -1;
        anInt799 = -1;
        aBoolean827 = false;
        anInt830 = 0;
        anInt792 = -1;
        anInt793 = 0;
        anInt840 = -1;
        aBoolean766 = false;
        anInt797 = 1;
        aBoolean785 = true;
        aByte820 = (byte) 0;
        anInt822 = 1;
        anInt816 = 0;
        anInt831 = -1;
        anInt847 = 0;
        anInt845 = 0;
        anInt814 = 0;
        anInt869 = -1;
        anInt870 = 0;
        aBoolean761 = false;
        anInt862 = 0;
        anInt852 = -1;
        anInt844 = -1;
        aBoolean813 = false;
        anInt839 = 0;
        anInt776 = 0;
        anInt857 = 0;
        anInt808 = 0;
        anInt855 = 0;
        anInt815 = 0;
        aBoolean764 = false;
        anInt818 = 0;
        aRSString_880 = Class68_Sub22.aRSString_3139;
        anInt781 = 0;
        aBoolean863 = false;
        anInt842 = 0;
        aBoolean850 = false;
        anInt867 = -1;
        anInt803 = -1;
        anInt885 = 0;
        anInt849 = 1;
        aRSString_890 = Class68_Sub22.aRSString_3139;
        aRSString_881 = Class68_Sub22.aRSString_3139;
        aBoolean851 = false;
        aByte779 = (byte) 0;
        anInt892 = 0;
        anInt762 = 100;
        anInt836 = -1;
        anInt828 = 0;
        anInt883 = 0;
        anInt899 = 0;
        anInt902 = -1;
        aBoolean894 = false;
        anInt832 = 0;
        aRSString_884 = Class68_Sub22.aRSString_3139;
        anInt889 = 0;
        aBoolean866 = false;
        aByte811 = (byte) 0;
        aByte904 = (byte) 0;
        anInt873 = 0;
        aRSString_876 = Class78.aRSString_1389;
        aRSString_898 = Class68_Sub22.aRSString_3139;
        anInt909 = 0;
        anInt864 = 0;
        anInt782 = 0;
        anInt846 = 0;
        anInt888 = 0;
        anInt906 = 0;
        anInt879 = 0;
        anInt903 = 0;
        aBoolean905 = false;
        anInt914 = 0;
        anInt910 = 0;
        anInt853 = 0;
        anInt865 = 1;
        anInt763 = 0;
        anInt859 = 0;
        anInt833 = -1;
        anInt901 = -1;
        aClass45_893 = null;
        anInt915 = 0;
        anInt877 = 0;
        aBoolean916 = false;
        anInt860 = -1;
    }

    static {
        aRSString_922 = RSString.newRsString("glow3:");
        aRSString_923 = aRSString_922;
        aRSString_920 = aRSString_922;
        aRSString_927 = RSString.newRsString("Close");
        aRSString_924 = aRSString_927;
    }
}
