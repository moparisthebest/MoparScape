/* Class68_Sub20_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub7 extends Class68_Sub20 {
    public static int anInt4252 = 0;
    public static int anInt4253;
    public static int anInt4254;
    public static int anInt4255;
    public static RSString aRSString_4256 = RSString.newRsString(")4g");
    public static int anInt4257;
    public static int anInt4258;
    public static int anInt4259;
    public static int anInt4260 = 0;
    public static int[] anIntArray4261 = {16, 32, 64, 128};
    public static long aLong4262;
    public static int[] anIntArray4263;
    public Class113 aClass113_4264;
    public static int anInt4265;
    public static short[] aShortArray4266;
    public static RSString aRSString_4267;

    public static void method1073(int i) {
        if (i != -23562)
            method1075(false, 72, 88, 47, null);
        anIntArray4261 = null;
        aRSString_4256 = null;
        aRSString_4267 = null;
        anIntArray4263 = null;
        aShortArray4266 = null;
    }

    public void method1074(int i, int i_0_, Stream class68_sub14) {
        if (i == 249) {
            int i_1_ = class68_sub14.readUnsignedByte(-6677);
            if (aClass113_4264 == null) {
                int i_2_ = Class90.method1517(i_1_, -21189);
                aClass113_4264 = new Class113(i_2_);
            }
            for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
                boolean bool = class68_sub14.readUnsignedByte(i_0_ ^ 0x1a11) == 1;
                int i_4_ = class68_sub14.method921((byte) -69);
                Class68 class68;
                if (!bool)
                    class68 = new Class68_Sub10(class68_sub14.readDWord());
                else
                    class68 = new Class68_Sub5(class68_sub14.readString(127));
                aClass113_4264.method1677((byte) 127, class68, (long) i_4_);
            }
        }
        if (i_0_ != -6)
            method1077(34, -83, -92);
        anInt4259++;
    }

    public static void method1075(boolean bool, int i, int i_5_, int i_6_,
                                  Class45 class45) {
        if (i <= 9)
            anIntArray4261 = null;
        anInt4254++;
        int i_7_ = class45.anInt892;
        int i_8_ = class45.anInt873;
        if (class45.aByte779 != 0) {
            if (class45.aByte779 == 1)
                class45.anInt892 = -class45.anInt773 + i_6_;
            else if ((class45.aByte779 ^ 0xffffffff) == -3)
                class45.anInt892 = class45.anInt773 * i_6_ >> -1008088050;
            else if (class45.aByte779 == 3) {
                if ((class45.anInt896 ^ 0xffffffff) == -3)
                    class45.anInt892
                            = ((-1 + class45.anInt773) * class45.anInt885
                            + 32 * class45.anInt773);
                else if (class45.anInt896 == 7)
                    class45.anInt892
                            = (115 * class45.anInt773
                            + (-1 + class45.anInt773) * class45.anInt885);
            }
        } else
            class45.anInt892 = class45.anInt773;
        if ((class45.aByte811 ^ 0xffffffff) == -1)
            class45.anInt873 = class45.anInt899;
        else if ((class45.aByte811 ^ 0xffffffff) != -2) {
            if (class45.aByte811 == 2)
                class45.anInt873 = i_5_ * class45.anInt899 >> -37038450;
            else if (class45.aByte811 == 3) {
                if (class45.anInt896 == 2)
                    class45.anInt873
                            = (class45.anInt846 * (-1 + class45.anInt899)
                            + 32 * class45.anInt899);
                else if ((class45.anInt896 ^ 0xffffffff) == -8)
                    class45.anInt873
                            = ((-1 + class45.anInt899) * class45.anInt846
                            + class45.anInt899 * 12);
            }
        } else
            class45.anInt873 = i_5_ - class45.anInt899;
        if (class45.aByte779 == 4)
            class45.anInt892
                    = class45.anInt849 * class45.anInt873 / class45.anInt768;
        if ((class45.aByte811 ^ 0xffffffff) == -5)
            class45.anInt873
                    = class45.anInt892 * class45.anInt768 / class45.anInt849;
        if (Class68_Sub20.aBoolean3094
                && (client.method41(class45) != 0 || class45.anInt896 == 0)) {
            if ((class45.anInt873 ^ 0xffffffff) > -6
                    && (class45.anInt892 ^ 0xffffffff) > -6) {
                class45.anInt892 = 5;
                class45.anInt873 = 5;
            } else {
                if (class45.anInt892 <= 0)
                    class45.anInt892 = 5;
                if (class45.anInt873 <= 0)
                    class45.anInt873 = 5;
            }
        }
        if (class45.anInt808 == 1337)
            Class68_Sub20_Sub17.aClass45_4441 = class45;
        if (bool && class45.anObjectArray802 != null
                && (i_7_ != class45.anInt892 || i_8_ != class45.anInt873)) {
            Class68_Sub29 class68_sub29 = new Class68_Sub29();
            class68_sub29.anObjectArray3237 = class45.anObjectArray802;
            class68_sub29.aClass45_3239 = class45;
            Class115.aClass16_1955.method286(class68_sub29, true);
        }
    }

    public RSString method1076(int i, RSString class100, int i_9_) {
        anInt4258++;
        if (aClass113_4264 == null)
            return class100;
        Class68_Sub5 class68_sub5
                = (Class68_Sub5) aClass113_4264.method1678((long) i_9_, 73);
        if (i != -1)
            return null;
        if (class68_sub5 == null)
            return class100;
        return class68_sub5.aRSString_2830;
    }

    public int method1077(int i, int i_10_, int i_11_) {
        anInt4265++;
        if (aClass113_4264 == null)
            return i;
        if (i_10_ != 9081)
            return -34;
        Class68_Sub10 class68_sub10
                = (Class68_Sub10) aClass113_4264.method1678((long) i_11_, 74);
        if (class68_sub10 == null)
            return i;
        return class68_sub10.anInt2902;
    }

    public void method1078(Stream class68_sub14, byte i) {
        if (i > -91)
            method1074(93, -71, null);
        for (; ; ) {
            int i_12_ = class68_sub14.readUnsignedByte(-6677);
            if ((i_12_ ^ 0xffffffff) == -1)
                break;
            method1074(i_12_, -6, class68_sub14);
        }
        anInt4253++;
    }

    static {
        anInt4257 = -2;
        anInt4255 = 0;
        aLong4262 = 0L;
        anIntArray4263 = new int[]{1, 0, -1, 0};
        aRSString_4267 = RSString.newRsString("(U");
        aShortArray4266 = new short[256];
    }
}
