/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class104 {
    public static RSString aRSString_1775
            = RSString.newRsString(" zuerst von Ihrer Ignorieren)2Liste(Q");
    public static int anInt1776;
    public static RSString aRSString_1777;
    public static int anInt1778;
    public static Class92_Sub1[] aClass92_Sub1Array1779;
    public static boolean aBoolean1780 = false;
    public int anInt1781;
    public int anInt1782;
    public static RSString aRSString_1783;
    public static int anInt1784;
    public static int anInt1785;
    public static int anInt1786;
    public static Class65 aClass65_1787;
    public int anInt1788;
    public static int anInt1789;

    public static Class68_Sub13 method1637(boolean bool,
                                           Stream class68_sub14) {
        class68_sub14.readUnsignedByte(-6677);
        anInt1789++;
        int i = class68_sub14.readUnsignedByte(-6677);
        Class68_Sub13 class68_sub13 = Class48.method515(i, (byte) -46);
        if (bool != true)
            return null;
        class68_sub13.anInt2942 = class68_sub14.readUnsignedByte(-6677);
        int i_0_ = class68_sub14.readUnsignedByte(-6677);
        for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
            int i_2_ = class68_sub14.readUnsignedByte(-6677);
            class68_sub13.method700(class68_sub14, i_2_, -1);
        }
        class68_sub13.method690((byte) -34);
        return class68_sub13;
    }

    public static void method1638(int i) {
        if (i == 0) {
            aRSString_1777 = null;
            aClass65_1787 = null;
            aRSString_1775 = null;
            aClass92_Sub1Array1779 = null;
            aRSString_1783 = null;
        }
    }

    public static void method1639(int i, int i_3_, int i_4_, int i_5_,
                                  int i_6_, int i_7_, int i_8_) {
        anInt1778++;
        if (i >= -101)
            aRSString_1775 = null;
        int i_9_
                = Class68_Sub20_Sub15.method1171(i_5_, Class51.anInt2255,
                (byte) 114, Class35.anInt605);
        int i_10_
                = Class68_Sub20_Sub15.method1171(i_4_, Class51.anInt2255,
                (byte) 114, Class35.anInt605);
        int i_11_
                = Class68_Sub20_Sub15.method1171(i_7_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        int i_12_
                = Class68_Sub20_Sub15.method1171(i_3_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        int i_13_
                = Class68_Sub20_Sub15.method1171(i_5_ + i_6_, Class51.anInt2255,
                (byte) 114, Class35.anInt605);
        int i_14_
                = Class68_Sub20_Sub15.method1171(i_4_ - i_6_, Class51.anInt2255,
                (byte) 114, Class35.anInt605);
        for (int i_15_ = i_9_; (i_15_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff);
             i_15_++)
            Class34.method416(i_11_, (byte) -17, i_8_,
                    Class68_Sub22.anIntArrayArray3132[i_15_], i_12_);
        for (int i_16_ = i_10_; i_16_ > i_14_; i_16_--)
            Class34.method416(i_11_, (byte) -17, i_8_,
                    Class68_Sub22.anIntArrayArray3132[i_16_], i_12_);
        int i_17_
                = Class68_Sub20_Sub15.method1171(i_7_ - -i_6_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        int i_18_
                = Class68_Sub20_Sub15.method1171(-i_6_ + i_3_, Class113.anInt1918,
                (byte) 114, GroundData.anInt677);
        for (int i_19_ = i_13_; (i_19_ ^ 0xffffffff) >= (i_14_ ^ 0xffffffff);
             i_19_++) {
            int[] is = Class68_Sub22.anIntArrayArray3132[i_19_];
            Class34.method416(i_11_, (byte) -17, i_8_, is, i_17_);
            Class34.method416(i_18_, (byte) -17, i_8_, is, i_12_);
        }
    }

    public static void method1640(int i, int i_20_) {
        Class125.aClass98_2171.method1564(-18767, i_20_);
        Class12.aClass98_211.method1564(-18767, i_20_);
        anInt1776++;
        Class68_Sub13_Sub20.aClass98_3778.method1564(i ^ ~0x494e, i_20_);
        if (i != 0)
            method1637(true, null);
    }

    static {
        aRSString_1777 = RSString.newRsString(":assist:");
        aRSString_1783 = RSString.newRsString("slr2)3ws?order=LPWM");
        anInt1784 = 0;
    }
}
