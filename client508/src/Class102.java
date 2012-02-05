/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class102 {
    public static Class1_Sub6_Sub1[] aClass1_Sub6_Sub1Array1746;
    public static int anInt1747;
    public static boolean aBoolean1748;
    public static RSString aRSString_1749
            = RSString.newRsString("www)2wtrc");
    public static int anInt1750;
    public static RSString aRSString_1751;
    public static int anInt1752;
    public static Class21renamed aClass21_1753;
    public static RSString aRSString_1754;
    public static int anInt1755;
    public static Class91 aClass91_1756;
    public static int[] anIntArray1757;
    public static int anInt1758;

    public static void method1626(int i) {
        aRSString_1749 = null;
        aRSString_1754 = null;
        aClass91_1756 = null;
        aRSString_1751 = null;
        aClass1_Sub6_Sub1Array1746 = null;
        if (i != 32768)
            aRSString_1754 = null;
        aClass21_1753 = null;
        anIntArray1757 = null;
    }

    public static Class69 method1627(int i, int i_0_, int i_1_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_][i_1_];
        if (class68_sub1 == null)
            return null;
        for (int i_2_ = 0; i_2_ < class68_sub1.anInt2771; i_2_++) {
            Class69 class69 = class68_sub1.aClass69Array2772[i_2_];
            if ((class69.aLong1243 >> 29 & 0x3L) == 2L
                    && class69.anInt1254 == i_0_ && class69.anInt1253 == i_1_)
                return class69;
        }
        return null;
    }

    public static void method1628(int i, boolean bool, int i_3_, int i_4_,
                                  int i_5_, int i_6_) {
        if (bool == true) {
            for (int i_7_ = i; i_3_ >= i_7_; i_7_++)
                Class34.method416(i_5_, (byte) -17, i_6_,
                        Class68_Sub22.anIntArrayArray3132[i_7_],
                        i_4_);
            anInt1752++;
        }
    }

    public static void method1629(int i, int i_8_, int i_9_) {
        anInt1758++;
        Class48 class48 = Class68_Sub13_Sub11.method752((byte) 81, i);
        if (i_8_ != 0)
            aRSString_1754 = null;
        int i_10_ = class48.anInt958;
        int i_11_ = class48.anInt945;
        int i_12_ = class48.anInt956;
        int i_13_ = Class16.anIntArray259[i_12_ + -i_10_];
        if ((i_9_ ^ 0xffffffff) > -1
                || (i_9_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff))
            i_9_ = 0;
        i_13_ <<= i_10_;
        Class68_Sub13_Sub15.method767(i_11_,
                (((i_13_ ^ 0xffffffff)
                        & Class103.anIntArray1767[i_11_])
                        | i_9_ << i_10_ & i_13_),
                87);
    }

    public static void method1630(int i, int i_14_, int i_15_, boolean bool,
                                  int i_16_) {
        anInt1755++;
        if ((i ^ 0xffffffff) <= (Class35.anInt605 ^ 0xffffffff)
                && i <= Class51.anInt2255) {
            i_15_
                    = Class68_Sub20_Sub15.method1171(i_15_, Class113.anInt1918,
                    (byte) 114, GroundData.anInt677);
            i_16_
                    = Class68_Sub20_Sub15.method1171(i_16_, Class113.anInt1918,
                    (byte) 114, GroundData.anInt677);
            Class15.method276(1, i_16_, i_15_, i_14_, i);
        }
        if (bool != true)
            method1630(-105, 101, 125, false, -95);
    }

    public static void method1631(byte i, int i_17_, int i_18_, int i_19_) {
        anInt1747++;
        if (i > -48)
            method1626(118);
        Class45 class45 = Class66.method637(i_19_, false, i_18_);
        if (class45 != null && class45.anObjectArray913 != null) {
            Class68_Sub29 class68_sub29 = new Class68_Sub29();
            class68_sub29.aClass45_3239 = class45;
            class68_sub29.anObjectArray3237 = class45.anObjectArray913;
            Class68_Sub13_Sub16.method776(class68_sub29, 16);
        }
        Class21_Sub1.aBoolean2705 = true;
        Class33.anInt589 = i_17_;
        Class107.anInt1821 = i_19_;
        Class68_Sub20_Sub16.anInt4422 = i_18_;
        Class113.method1682(class45, -122);
    }

    static {
        aClass1_Sub6_Sub1Array1746 = new Class1_Sub6_Sub1[32768];
        aBoolean1748 = true;
        aRSString_1754 = RSString.newRsString("OFF");
        aRSString_1751 = aRSString_1754;
        anIntArray1757 = new int[50];
    }
}
