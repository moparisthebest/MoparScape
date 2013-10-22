/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91 {
    public static int anInt1630;
    public short[] aShortArray1631;
    public static int anInt1632;
    public static int anInt1633;
    public short[] aShortArray1634;
    public RSString[] aRSStringArray1635;
    public static Class98 aClass98_1636;
    public int anInt1637;
    public byte[] aByteArray1638;
    public static int anInt1639;
    public int[] anIntArray1640;
    public static RSString aRSString_1641
            = RSString.newRsString("scrollbar");
    public static RSString aRSString_1642;
    public static int anInt1643;

    public static int method1520(int i, boolean bool) {
        if (bool != false)
            aRSString_1642 = null;
        anInt1643++;
        int i_0_ = 0x3f & i;
        int i_1_ = (i & 0xe6) >> 977256934;
        if ((i_0_ ^ 0xffffffff) != -19) {
            if ((i_0_ ^ 0xffffffff) == -20 || (i_0_ ^ 0xffffffff) == -22) {
                if (i_1_ == 0)
                    return 16;
                if ((i_1_ ^ 0xffffffff) == -2)
                    return 32;
                if (i_1_ == 2)
                    return 64;
                if (i_1_ == 3)
                    return 128;
            }
        } else {
            if (i_1_ == 0)
                return 1;
            if ((i_1_ ^ 0xffffffff) == -2)
                return 2;
            if (i_1_ == 2)
                return 4;
            if (i_1_ == 3)
                return 8;
        }
        return 0;
    }

    public boolean method1521(byte i, int i_2_) {
        anInt1630++;
        int i_3_ = 38 % ((i - -11) / 51);
        if ((0x4 & aByteArray1638[i_2_]) == 0)
            return false;
        return true;
    }

    public static void method1522(byte i) {
        if (i > -52)
            aRSString_1642 = null;
        aRSString_1641 = null;
        aClass98_1636 = null;
        aRSString_1642 = null;
    }

    public static void method1523(int i, int i_4_, int i_5_, Class45 class45) {
        anInt1632++;
        if (Class35.aClass45_606 == null && !Class120.aBoolean2099
                && (class45 != null
                && Class95.method1548(class45, (byte) 3) != null)) {
            if (i_5_ != -4798)
                method1524(-50, null);
            Class35.aClass45_606 = class45;
            Class68_Sub13_Sub26_Sub1.aClass45_4607
                    = Class95.method1548(class45, (byte) 3);
            Class68_Sub26.anInt3200 = 0;
            Class58.anInt1087 = i_4_;
            Class68_Sub13_Sub25.anInt3853 = i;
            Class15.aBoolean247 = false;
        }
    }

    public static void method1524(int i, Class45 class45) {
        if (i != 30341)
            method1520(-53, true);
        int i_6_ = class45.anInt808;
        anInt1633++;
        if (i_6_ == 324) {
            if (Class80.anInt1434 == -1) {
                Class80.anInt1434 = class45.anInt840;
                Class68_Sub13_Sub31.anInt3975 = class45.anInt833;
            }
            if (Class68_Sub13_Sub33.aClass126_3991.aBoolean2196)
                class45.anInt840 = Class80.anInt1434;
            else
                class45.anInt840 = Class68_Sub13_Sub31.anInt3975;
        } else if (i_6_ == 325) {
            if ((Class80.anInt1434 ^ 0xffffffff) == 0) {
                Class80.anInt1434 = class45.anInt840;
                Class68_Sub13_Sub31.anInt3975 = class45.anInt833;
            }
            if (Class68_Sub13_Sub33.aClass126_3991.aBoolean2196)
                class45.anInt840 = Class68_Sub13_Sub31.anInt3975;
            else
                class45.anInt840 = Class80.anInt1434;
        } else if ((i_6_ ^ 0xffffffff) == -328) {
            class45.anInt864 = 150;
            class45.anInt814
                    = ((int) (256.0
                    * Math.sin((double) Class68_Sub3.anInt2812 / 40.0))
                    & 0x7ff);
            class45.anInt803 = -1;
            class45.anInt865 = 5;
        } else if (i_6_ == 328) {
            if (Class68_Sub7.aClass1_Sub6_Sub2_2860.aRSString_3414 == null)
                class45.anInt803 = 0;
            else {
                class45.anInt864 = 150;
                class45.anInt814
                        = (int) (256.0 * Math.sin((double) Class68_Sub3.anInt2812
                        / 40.0)) & 0x7ff;
                class45.anInt865 = 5;
                class45.anInt803
                        = 2047 + ((int) Class68_Sub7.aClass1_Sub6_Sub2_2860
                        .aRSString_3414.toLong(10908)
                        << -1259687477);
                class45.anInt831
                        = Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2524;
                class45.anInt756
                        = Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2555;
            }
        }
    }

    public int method1525(int i, int i_7_) {
        int i_8_ = 20 / ((29 - i) / 48);
        anInt1639++;
        return 0x3 & aByteArray1638[i_7_];
    }

    public Class91(int i) {
        anInt1637 = i;
        aShortArray1634 = new short[anInt1637];
        aShortArray1631 = new short[anInt1637];
        anIntArray1640 = new int[anInt1637];
        aByteArray1638 = new byte[anInt1637];
        aRSStringArray1635 = new RSString[anInt1637];
    }

    static {
        aClass98_1636 = new Class98(64);
        aRSString_1642 = RSString.newRsString("Texturen geladen)3");
    }
}
