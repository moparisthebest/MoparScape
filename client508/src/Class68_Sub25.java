/* Class68_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub25 extends Class68 {
    public static RSString aRSString_3164 = RSString.newRsString("");
    public byte[] aByteArray3165;
    public static int anInt3166;
    public static GameSocket updateSocketCopy;
    public static Class8[] aClass8Array3168 = new Class8[500];
    public static int anInt3169;
    public Unknown aUnknown_3170;
    public static RSString aRSString_3171
            = RSString.newRsString("event_opbase");
    public static int[] anIntArray3172;
    public static int anInt3173;
    public static int anInt3174 = 99;
    public Class21_Sub1 aClass21_Sub1_3175;
    public static int anInt3176;
    public int anInt3177;

    public static boolean method1210(byte i) {
        anInt3169++;
        synchronized (Class66.aClass123_1200) {
            if (Class70.anInt1281 == Class75_Sub1_Sub1.anInt4590)
                return false;
            Class59.anInt1104
                    = Class68_Sub22.anIntArray3133[Class70.anInt1281];
            Class1_Sub6.anInt2536
                    = Class13_Sub2.anIntArray2643[Class70.anInt1281];
            Class70.anInt1281 = 0x7f & 1 + Class70.anInt1281;
            if (i != 111)
                return false;
            return true;
        }
    }

    public static void method1211(int i) {
        aClass8Array3168 = null;
        anIntArray3172 = null;
        aRSString_3164 = null;
        int i_0_ = -53 % ((i - 33) / 49);
        updateSocketCopy = null;
        aRSString_3171 = null;
    }

    public static void method1212(int i, byte i_1_, int i_2_, int i_3_,
                                  int i_4_, int i_5_, int i_6_, int i_7_,
                                  int i_8_, int i_9_) {
        anInt3173++;
        if (i_4_ < GroundData.anInt677
                || (i_4_ ^ 0xffffffff) < (Class113.anInt1918 ^ 0xffffffff)
                || GroundData.anInt677 > i || i > Class113.anInt1918
                || i_9_ < GroundData.anInt677 || i_9_ > Class113.anInt1918
                || i_5_ < GroundData.anInt677
                || (Class113.anInt1918 ^ 0xffffffff) > (i_5_ ^ 0xffffffff)
                || Class35.anInt605 > i_2_ || Class51.anInt2255 < i_2_
                || Class35.anInt605 > i_3_
                || (Class51.anInt2255 ^ 0xffffffff) > (i_3_ ^ 0xffffffff)
                || (i_6_ ^ 0xffffffff) > (Class35.anInt605 ^ 0xffffffff)
                || Class51.anInt2255 < i_6_ || Class35.anInt605 > i_8_
                || i_8_ > Class51.anInt2255)
            Class9.method212(i_2_, i_9_, i, 1580177356, i_8_, i_6_, i_3_, i_5_,
                    i_4_, i_7_);
        else
            Class70.method1333(i_5_, -99, i_6_, i, i_2_, i_4_, i_7_, i_3_,
                    i_9_, i_8_);
        if (i_1_ > -80)
            aRSString_3164 = null;
    }

    public static void method1213(Class21_Sub1 class21_sub1, byte i,
                                  Unknown unknown, int i_10_) {
        try {
            anInt3166++;
            Class68_Sub25 class68_sub25 = new Class68_Sub25();
            int i_11_ = 4 / ((-78 - i) / 32);
            class68_sub25.anInt3177 = 1;
            class68_sub25.aClass21_Sub1_3175 = class21_sub1;
            class68_sub25.aLong1218 = (long) i_10_;
            class68_sub25.aUnknown_3170 = unknown;
            synchronized (Class68_Sub20_Sub10.aClass16_4314) {
                Class68_Sub20_Sub10.aClass16_4314.method286(class68_sub25,
                        true);
            }
            Class68_Sub20_Sub11.method1140(600);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("v.C("
                            + (class21_sub1 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (unknown != null ? "{...}" : "null")
                            + ',' + i_10_ + ')'));
        }
    }
}
