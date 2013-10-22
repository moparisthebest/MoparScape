/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67 {
    public static RSString aRSString_1206 = RSString.newRsString(")3)3)3");
    public static RSString aRSString_1207;
    public static RSString aRSString_1208;
    public static int anInt1209;
    public static boolean aBoolean1210;
    public static RSString aRSString_1211
            = RSString.newRsString("Loaded input handler");
    public static int anInt1212;
    public static RSString aRSString_1213;
    public static int anInt1214;
    public static int anInt1215;
    public static int anInt1216;
    public static int anInt1217;

    public static void method639(int i) {
        aRSString_1206 = null;
        if (i == 988656400) {
            aRSString_1211 = null;
            aRSString_1207 = null;
            aRSString_1213 = null;
            aRSString_1208 = null;
        }
    }

    public static void method640(int i) {
        anInt1209++;
        synchronized (Class33.aClass86_581) {
            Class20.anInt412++;
            Class68_Sub20_Sub12.anInt4352 = client.anInt2372;
            Class96.anInt1695 = Class115.anInt1958;
            Class13.anInt223 = Class68_Sub20_Sub13.anInt4365;
            Class29.anInt537 = Class122.anInt2116;
            Class68_Sub13_Sub37.anInt4077 = Class12.anInt199;
            Class125.anInt2173 = Class48.anInt954;
            Class68_Sub20_Sub7.aLong4262 = Class68_Sub13_Sub11.aLong3619;
            Class122.anInt2116 = 0;
        }
        if (i != -1)
            aRSString_1206 = null;
    }

    public static void method641(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 int i_4_, int i_5_, byte i_6_) {
        anInt1212++;
        if ((i_5_ ^ 0xffffffff) > -129 || i_2_ < 128
                || (i_5_ ^ 0xffffffff) < -13057 || (i_2_ ^ 0xffffffff) < -13057) {
            Class114.anInt1925 = -1;
            Class86.anInt1576 = -1;
        } else {
            if (i_6_ >= -122)
                aRSString_1211 = null;
            int i_7_
                    = -i_3_ + Class1_Sub6_Sub2.method163(i_5_, GameSocket.anInt1149,
                    i_2_, false);
            int i_8_ = Class62.anIntArray1167[Canvas_Sub1.anInt45];
            int i_9_ = Class62.anIntArray1167[Class74.anInt1333];
            i_5_ -= Class68_Sub7.anInt2862;
            int i_10_ = Class62.anIntArray1155[Canvas_Sub1.anInt45];
            i_7_ -= Class68_Sub5.anInt2833;
            int i_11_ = Class62.anIntArray1155[Class74.anInt1333];
            i_2_ -= Class85.anInt1558;
            int i_12_ = i_2_ * i_11_ - -(i_9_ * i_5_) >> 988656400;
            i_2_ = i_9_ * i_2_ + -(i_5_ * i_11_) >> 2006409232;
            i_5_ = i_12_;
            i_12_ = i_8_ * i_7_ + -(i_2_ * i_10_) >> -1697007760;
            i_2_ = i_7_ * i_10_ + i_2_ * i_8_ >> -881511344;
            i_7_ = i_12_;
            if ((i_2_ ^ 0xffffffff) <= -51) {
                Class86.anInt1576 = (i_5_ << 1769409001) / i_2_ + i_1_;
                Class114.anInt1925 = i_4_ + (i_7_ << -1247133719) / i_2_;
            } else {
                Class114.anInt1925 = -1;
                Class86.anInt1576 = -1;
            }
        }
    }

    public static Class92 method642(Class21renamed class21, int i, int i_13_) {
        anInt1215++;
        if (!Class56.method572(class21, -1, i))
            return null;
        if (i_13_ != -30509)
            aRSString_1211 = null;
        return Class74.method1383(i_13_ + 30509);
    }

    static {
        aBoolean1210 = false;
        aRSString_1208
                = RSString.newRsString(" is already on your ignore list)3");
        aRSString_1207 = aRSString_1211;
        aRSString_1213 = aRSString_1208;
    }
}
