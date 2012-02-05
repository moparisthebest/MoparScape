/* Class68_Sub20_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub18 extends Class68_Sub20 {
    public static byte[] aByteArray4444 = new byte[32896];
    public Class1_Sub2 aClass1_Sub2_4445;
    public static int anInt4446;
    public static int anInt4447;
    public static int anInt4448;
    public static int anInt4449;
    public static RSString aRSString_4450;
    public static RSString aRSString_4451;

    public static void method1183(byte i) {
        anInt4448++;
        Class97.anInt1715++;
        Class21renamed.stream.createFrame(42);
        if (i >= 81)
            Class21renamed.stream.writeQWord(true, 0L);
    }

    public static void method1184(int i, int i_0_, int i_1_, int i_2_,
                                  int i_3_) {
        anInt4447++;
        if (client.anInt2376 == 1)
            Class75_Sub2.aClass68_Sub20_Sub10Array3310
                    [Class26.anInt523 / 100].method1103
                    (Class68_Sub22.anInt3140 - 8,
                            Class68_Sub13_Sub21.anInt3787 - 8);
        if ((client.anInt2376 ^ 0xffffffff) == -3)
            Class75_Sub2.aClass68_Sub20_Sub10Array3310
                    [4 + Class26.anInt523 / 100].method1103
                    (Class68_Sub22.anInt3140 - 8,
                            Class68_Sub13_Sub21.anInt3787 + -8);
        if (i_3_ != -17234)
            method1184(44, -23, -41, 64, -106);
        Class68_Sub4.method657(-127);
    }

    public Class68_Sub20_Sub18(Class1_Sub2 class1_sub2) {
        aClass1_Sub2_4445 = class1_sub2;
    }

    public static void method1185(byte i) {
        aByteArray4444 = null;
        aRSString_4451 = null;
        aRSString_4450 = null;
        if (i < 17)
            aByteArray4444 = null;
    }

    public static Class69 method1186(int i, int i_4_, int i_5_) {
        Class68_Sub1 class68_sub1
                = Class22.aClass68_Sub1ArrayArrayArray484[i][i_4_][i_5_];
        if (class68_sub1 == null)
            return null;
        for (int i_6_ = 0; i_6_ < class68_sub1.anInt2771; i_6_++) {
            Class69 class69 = class68_sub1.aClass69Array2772[i_6_];
            if ((class69.aLong1243 >> 29 & 0x3L) == 2L
                    && class69.anInt1254 == i_4_ && class69.anInt1253 == i_5_) {
                Class95.method1549(class69);
                return class69;
            }
        }
        return null;
    }

    public static Class13_Sub4 method1187(byte i,
                                          Stream class68_sub14) {
        if (i != 116)
            return null;
        anInt4446++;
        return new Class13_Sub4(class68_sub14.method957(-22489),
                class68_sub14.method957(-22489),
                class68_sub14.method957(i + -22605),
                class68_sub14.method957(i + -22605),
                class68_sub14.method957(i + -22605),
                class68_sub14.method957(-22489),
                class68_sub14.method957(-22489),
                class68_sub14.method957(-22489),
                class68_sub14.method921((byte) 113),
                class68_sub14.readUnsignedByte(-6677));
    }

    static {
        int i = 0;
        for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -257; i_7_++) {
            for (int i_8_ = 0; i_7_ >= i_8_; i_8_++)
                aByteArray4444[i++]
                        = (byte) (int) (255.0
                        / Math.sqrt((double) ((float) (i_7_ * i_7_
                        + ((i_8_
                        * i_8_)
                        + 65535))
                        / 65535.0F)));
        }
        aRSString_4451
                = RSString.newRsString(" from your friend list first)3");
        aRSString_4450 = aRSString_4451;
    }
}
