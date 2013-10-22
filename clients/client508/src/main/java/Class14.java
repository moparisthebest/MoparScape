/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14 {
    public static RSString aRSString_224 = RSString.newRsString("Art");
    public static int anInt225;
    public static int anInt226;
    public Class21renamed aClass21_227;
    public static int anInt228 = 0;
    public static Class21_Sub1 aClass21_Sub1_229;
    public Class113 aClass113_230 = new Class113(256);
    public Class21renamed aClass21_231;
    public static int anInt232;
    public static int anInt233;
    public static int anInt234;
    public static int anInt235;
    public static int[] anIntArray236;
    public static int anInt237;
    public static int anInt238;
    public static int anInt239;
    public static int anInt240;
    public static Class84 aClass84_241;
    public Class113 aClass113_242 = new Class113(256);
    public static RSString aRSString_243 = RSString.newRsString("Benutzen");

    public static boolean method265(int i) {
        anInt234++;
        try {
            if (i >= -98)
                anInt225 = 39;
            return PacketParser.method1667(-26354);
        } catch (java.io.IOException ioexception) {
            Class72_Sub1.method1367((byte) -21);
            return true;
        } catch (Exception exception) {
            String string
                    = ("T2 - " + Class49.anInt962 + ","
                    + Class68_Sub20_Sub6.anInt4240 + ","
                    + Class68_Sub20_Sub7.anInt4252 + " - " + Class106.anInt1804
                    + ","
                    + (Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2523[0]
                    + Class36.anInt643)
                    + ","
                    + (Class68_Sub7.aClass1_Sub6_Sub2_2860.anIntArray2570[0]
                    + Class68_Sub13_Sub35.anInt4026)
                    + " - ");
            for (int i_0_ = 0;
                 ((Class106.anInt1804 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)
                         && (i_0_ ^ 0xffffffff) > -51);
                 i_0_++)
                string += (Class68_Sub13_Sub8.inStream
                        .buffer[i_0_]) + ",";
            Class71.method1339(string, exception, 38);
            Class68_Sub3.method651((byte) -109);
            return true;
        }
    }

    public Class68_Sub11_Sub1 method266(int i, int[] is, int i_1_) {
        anInt237++;
        if (aClass21_231.method337(0) == 1)
            return method272(0, is, i_1_, (byte) 91);
        if ((aClass21_231.method355(i_1_, i + i) ^ 0xffffffff) == -2)
            return method272(i_1_, is, 0, (byte) 112);
        throw new RuntimeException();
    }

    public static Class68_Sub20_Sub11 method267(boolean bool, int i) {
        if (bool != true)
            anIntArray236 = null;
        Class68_Sub20_Sub11 class68_sub20_sub11
                = ((Class68_Sub20_Sub11)
                Class1_Sub6_Sub2.aLogin_3418.method1473((long) i,
                        (byte) -76));
        anInt240++;
        if (class68_sub20_sub11 != null)
            return class68_sub20_sub11;
        byte[] is;
        if ((i ^ 0xffffffff) > -32769)
            is = Class68_Sub20_Sub8.aClass21_4290.method338(i, 0, 0);
        else
            is = Class25.aClass21_513.method338(0x7fff & i, 0, 0);
        class68_sub20_sub11 = new Class68_Sub20_Sub11();
        if (is != null)
            class68_sub20_sub11.method1143(new Stream(is), bool);
        if (i >= 32768)
            class68_sub20_sub11.method1145((byte) -67);
        Class1_Sub6_Sub2.aLogin_3418.method1465((long) i, (byte) -126,
                class68_sub20_sub11);
        return class68_sub20_sub11;
    }

    public Class68_Sub11_Sub1 method268(byte i, int i_2_, int i_3_, int[] is) {
        if (i != -113)
            aRSString_224 = null;
        anInt239++;
        int i_4_ = i_3_ ^ (i_2_ >>> 1030641644 | i_2_ << -1517522620 & 0xfffc);
        i_4_ |= i_2_ << -637707920;
        long l = (long) i_4_ ^ 0x100000000L;
        Class68_Sub11_Sub1 class68_sub11_sub1
                = (Class68_Sub11_Sub1) aClass113_242.method1678(l, -80);
        if (class68_sub11_sub1 != null)
            return class68_sub11_sub1;
        if (is != null && is[0] <= 0)
            return null;
        Class68_Sub21 class68_sub21
                = (Class68_Sub21) aClass113_230.method1678(l, 82);
        if (class68_sub21 == null) {
            class68_sub21 = Class68_Sub21.method1192(aClass21_227, i_2_, i_3_);
            if (class68_sub21 == null)
                return null;
            aClass113_230.method1677((byte) 123, class68_sub21, l);
        }
        class68_sub11_sub1 = class68_sub21.method1193(is);
        if (class68_sub11_sub1 == null)
            return null;
        class68_sub21.method647(-17554);
        aClass113_242.method1677((byte) 122, class68_sub11_sub1, l);
        return class68_sub11_sub1;
    }

    public static void method269(boolean bool) {
        anIntArray236 = null;
        aRSString_224 = null;
        aClass21_Sub1_229 = null;
        if (bool == false) {
            aRSString_243 = null;
            aClass84_241 = null;
        }
    }

    public Class68_Sub11_Sub1 method270(int i, byte i_5_, int[] is) {
        anInt238++;
        if (aClass21_227.method337(0) == 1)
            return method268((byte) -113, 0, i, is);
        if ((aClass21_227.method355(i, 0) ^ 0xffffffff) == -2)
            return method268((byte) -113, i, 0, is);
        if (i_5_ <= 5)
            anInt233 = -21;
        throw new RuntimeException();
    }

    public static void method271
            (boolean bool, Class21renamed class21, Class21renamed class21_6_, byte i,
             Class68_Sub20_Sub1_Sub1 class68_sub20_sub1_sub1) {
        try {
            Class68_Sub26.aClass21_3191 = class21;
            Class86.aClass21_1566 = class21_6_;
            anInt226++;
            Class16.aBoolean272 = bool;
            if (i <= 26)
                aClass84_241 = null;
            int i_7_ = -1 + Class86.aClass21_1566.method337(0);
            anInt233 = i_7_ * 256 + Class86.aClass21_1566.method355(i_7_, 0);
            Class18.aClass68_Sub20_Sub1_Sub1_289 = class68_sub20_sub1_sub1;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("bi.C(" + bool + ','
                            + (class21 != null ? "{...}" : "null")
                            + ','
                            + (class21_6_ != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (class68_sub20_sub1_sub1 != null
                            ? "{...}" : "null")
                            + ')'));
        }
    }

    public Class68_Sub11_Sub1 method272(int i, int[] is, int i_8_, byte i_9_) {
        anInt235++;
        int i_10_ = (i >>> 1727410956 | i << -759980412 & 0xfffd) ^ i_8_;
        i_10_ |= i << 1741927728;
        long l = (long) i_10_;
        Class68_Sub11_Sub1 class68_sub11_sub1
                = (Class68_Sub11_Sub1) aClass113_242.method1678(l, -40);
        if (class68_sub11_sub1 != null)
            return class68_sub11_sub1;
        if (is != null && is[0] <= 0)
            return null;
        Class46 class46 = Class46.method509(aClass21_231, i, i_8_);
        if (class46 == null)
            return null;
        int i_11_ = 46 / (-i_9_ / 36);
        class68_sub11_sub1 = class46.method508();
        aClass113_242.method1677((byte) -126, class68_sub11_sub1, l);
        if (is != null)
            is[0] -= class68_sub11_sub1.aByteArray3445.length;
        return class68_sub11_sub1;
    }

    public Class14(Class21renamed class21, Class21renamed class21_12_) {
        try {
            aClass21_227 = class21_12_;
            aClass21_231 = class21;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("bi.<init>("
                            + (class21 != null ? "{...}" : "null")
                            + ','
                            + (class21_12_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }
}
