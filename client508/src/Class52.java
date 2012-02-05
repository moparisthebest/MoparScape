/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class52 {
    public static RSString aRSString_993
            = RSString.newRsString(
            "Your ignore list is full)3 Max of 100 users)3");
    public static int anInt994;
    public int anInt995;
    public byte[] aByteArray996 = new byte[4];
    public int anInt997;
    public static boolean aBoolean998;
    public static int anInt999;
    public static Class98 aClass98_1000;
    public JagSocket aClass31_1001;
    public static RSString aRSString_1002 = RSString.newRsString(" )2>");
    public byte[] aByteArray1003;
    public static Class92[] aClass92Array1004;
    public static RSString aRSString_1005 = aRSString_993;
    public static int anInt1006 = 0;
    public long aLong1007;
    public int anInt1008;
    public static RSString aRSString_1009 = RSString.newRsString(")4a=");
    public static int anInt1010;
    public static Class21_Sub1 aClass21_Sub1_1011;
    public DataInputStream aDataInputStream1012;
    public static int anInt1013;
    public static byte[][][] aByteArrayArrayArray1014;

    public byte[] method541(byte i) throws IOException {
        anInt999++;
        if ((Class36.method438(17161) ^ 0xffffffffffffffffL)
                < (aLong1007 ^ 0xffffffffffffffffL))
            throw new IOException("fdt");
        if (i <= 15)
            return null;
        if ((anInt997 ^ 0xffffffff) == -1) {
            if (aClass31_1001.anInt555 != 2) {
                if (aClass31_1001.anInt555 == 1) {
                    anInt997 = 1;
                    aDataInputStream1012
                            = (DataInputStream) aClass31_1001.playerDefSocket;
                }
            } else
                throw new IOException("fds");
        }
        if (anInt997 == 1) {
            int i_0_ = aDataInputStream1012.available();
            if ((i_0_ ^ 0xffffffff) < -1) {
                if ((i_0_ + anInt995 ^ 0xffffffff) < -5)
                    i_0_ = -anInt995 + 4;
                anInt995 += aDataInputStream1012.read(aByteArray996, anInt995,
                        i_0_);
                if ((anInt995 ^ 0xffffffff) == -5) {
                    int i_1_
                            = new Stream(aByteArray996).readDWord();
                    anInt997 = 2;
                    aByteArray1003 = new byte[i_1_];
                }
            }
        }
        if ((anInt997 ^ 0xffffffff) == -3) {
            int i_2_ = aDataInputStream1012.available();
            if ((i_2_ ^ 0xffffffff) < -1) {
                if ((i_2_ + anInt1008 ^ 0xffffffff)
                        < (aByteArray1003.length ^ 0xffffffff))
                    i_2_ = aByteArray1003.length + -anInt1008;
                anInt1008 += aDataInputStream1012.read(aByteArray1003,
                        anInt1008, i_2_);
                if (anInt1008 == aByteArray1003.length)
                    return aByteArray1003;
            }
        }
        return null;
    }

    public static boolean method542(int i, boolean bool) {
        if (bool != true)
            return true;
        anInt994++;
        if (((0x11196c85 & i) >> -137274020 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    public static void method543
            (int i, int i_3_, Class1_Sub6_Sub1 class1_sub6_sub1, Class116 class116,
             int i_4_, int i_5_, int i_6_, Class1_Sub6_Sub2 class1_sub6_sub2) {
        do {
            try {
                if (i != 19395)
                    method544((byte) 123);
                Class68_Sub18 class68_sub18 = new Class68_Sub18();
                class68_sub18.anInt3064 = 128 * i_5_;
                class68_sub18.anInt3039 = i_6_;
                anInt1010++;
                class68_sub18.anInt3051 = i_3_ * 128;
                if (class116 != null) {
                    class68_sub18.anIntArray3053 = class116.anIntArray1995;
                    class68_sub18.anInt3042 = class116.anInt1982;
                    class68_sub18.anInt3057 = 128 * class116.anInt1975;
                    class68_sub18.anInt3059 = class116.anInt2000;
                    int i_7_ = class116.anInt1987;
                    class68_sub18.aClass116_3045 = class116;
                    class68_sub18.anInt3044 = class116.anInt1964;
                    int i_8_ = class116.anInt1988;
                    if ((i_4_ ^ 0xffffffff) == -2
                            || (i_4_ ^ 0xffffffff) == -4) {
                        i_8_ = class116.anInt1987;
                        i_7_ = class116.anInt1988;
                    }
                    class68_sub18.anInt3062 = 128 * (i_8_ + i_5_);
                    class68_sub18.anInt3038 = (i_7_ + i_3_) * 128;
                    if (class116.anIntArray1994 != null) {
                        class68_sub18.aBoolean3061 = true;
                        class68_sub18.method993(i + 12111);
                    }
                    if (class68_sub18.anIntArray3053 != null)
                        class68_sub18.anInt3054
                                = (class68_sub18.anInt3044
                                - -(int) (Math.random()
                                * (double) (-class68_sub18.anInt3044
                                + (class68_sub18
                                .anInt3059))));
                    Class8.aClass16_140.method286(class68_sub18, true);
                } else if (class1_sub6_sub1 != null) {
                    Class80 class80 = class1_sub6_sub1.aClass80_3395;
                    class68_sub18.aClass1_Sub6_Sub1_3060 = class1_sub6_sub1;
                    if (class80.anIntArray1431 != null) {
                        class68_sub18.aBoolean3061 = true;
                        class80 = class80.method1447(i ^ ~0x4b9e);
                    }
                    if (class80 != null) {
                        class68_sub18.anInt3062
                                = (i_5_ + class80.anInt1451) * 128;
                        class68_sub18.anInt3038
                                = 128 * (i_3_ - -class80.anInt1451);
                        class68_sub18.anInt3042
                                = Class72.method1349(class1_sub6_sub1, false);
                        class68_sub18.anInt3057 = 128 * class80.anInt1463;
                    }
                    Class51.aClass16_2251.method286(class68_sub18, true);
                } else {
                    if (class1_sub6_sub2 == null)
                        break;
                    class68_sub18.anInt3038
                            = 128 * (class1_sub6_sub2.anInt2544 + i_3_);
                    class68_sub18.anInt3062
                            = (class1_sub6_sub2.anInt2544 + i_5_) * 128;
                    class68_sub18.aClass1_Sub6_Sub2_3050 = class1_sub6_sub2;
                    class68_sub18.anInt3042
                            = Applet_Sub1.method32(class1_sub6_sub2, i ^ ~0x51e6);
                    class68_sub18.anInt3057 = 128 * class1_sub6_sub2.anInt3427;
                    Class1_Sub5.aClass113_2509.method1677
                            ((byte) 119, class68_sub18,
                                    class1_sub6_sub2.aRSString_3414.toLong(10908));
                }
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("id.A(" + i + ',' + i_3_ + ','
                                + (class1_sub6_sub1 != null
                                ? "{...}" : "null")
                                + ','
                                + (class116 != null ? "{...}"
                                : "null")
                                + ',' + i_4_ + ',' + i_5_ + ','
                                + i_6_ + ','
                                + (class1_sub6_sub2 != null
                                ? "{...}" : "null")
                                + ')'));
            }
            break;
        } while (false);
    }

    public Class52(SignLink class55, URL url) {
        try {
            aClass31_1001 = class55.method562(url, 0);
            anInt997 = 0;
            aLong1007 = 30000L + Class36.method438(17161);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("id.<init>("
                            + (class55 != null ? "{...}" : "null")
                            + ',' + (url != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method544(byte i) {
        aClass21_Sub1_1011 = null;
        aRSString_1002 = null;
        aRSString_993 = null;
        aClass98_1000 = null;
        aClass92Array1004 = null;
        aRSString_1005 = null;
        int i_9_ = 59 % ((-19 - i) / 34);
        aByteArrayArrayArray1014 = null;
        aRSString_1009 = null;
    }

    static {
        aClass98_1000 = new Class98(500);
        anInt1013 = 0;
    }
}
