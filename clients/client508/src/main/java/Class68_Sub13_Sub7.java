/* Class68_Sub13_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub13_Sub7 extends Class68_Sub13 {
    public static int anInt3545;
    public static int anInt3546;
    public static int anInt3547;
    public int anInt3548 = 4096;
    public static int anInt3549;
    public static int anInt3550;
    public static RSString aRSString_3551
            = RSString.newRsString("cookieprefix");
    public static RSString aRSString_3552
            = RSString.newRsString("Verbindung abgebrochen)3");
    public static int anInt3553;
    public static int anInt3554;
    public static int anInt3555;
    public static int anInt3556;

    public static void method725(boolean bool, long l) {
        try {
            try {
                Thread.sleep(l);
                if (bool != false)
                    method725(false, 103L);
            } catch (InterruptedException interruptedexception) {
                /* empty */
            }
            anInt3553++;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "ee.E(" + bool + ',' + l + ')');
        }
    }

    public Class68_Sub13_Sub7() {
        this(4096);
    }

    public int[] method698(byte i, int i_0_) {
        anInt3545++;
        if (i != -61)
            method700(null, 45, -36);
        int[] is = aClass115_2936.method1697(false, i_0_);
        if (aClass115_2936.aBoolean1957)
            Class39.method464(is, 0, Class68_Sub13_Sub19.anInt3746, anInt3548);
        return is;
    }

    public static Class68_Sub20_Sub16 method726(byte i, RSString class100) {
        anInt3549++;
        for (Class68_Sub20_Sub16 class68_sub20_sub16
                     = ((Class68_Sub20_Sub16)
                Class35.aClass16_602.method293((byte) 76));
             class68_sub20_sub16 != null;
             class68_sub20_sub16
                     = ((Class68_Sub20_Sub16)
                     Class35.aClass16_602.method290((byte) -118))) {
            if (class68_sub20_sub16.aRSString_4412.method1593(class100,
                    (byte) 125))
                return class68_sub20_sub16;
        }
        int i_1_ = 46 % ((i - 28) / 32);
        return null;
    }

    public static void method727(int i) {
        aRSString_3551 = null;
        aRSString_3552 = null;
        if (i != 0)
            aRSString_3551 = null;
    }

    public static int method728(int i, int i_2_) {
        anInt3554++;
        if (i != -1872384500)
            aRSString_3551 = null;
        if (i_2_ >= 97 && (i_2_ ^ 0xffffffff) >= -123
                || i_2_ >= 224 && i_2_ <= 254 && i_2_ != 247)
            return i_2_ - 32;
        if ((i_2_ ^ 0xffffffff) == -256)
            return 159;
        if ((i_2_ ^ 0xffffffff) == -157)
            return 140;
        return i_2_;
    }

    public Class68_Sub13_Sub7(int i) {
        super(0, true);
        anInt3548 = i;
    }

    public static Class method729(String string, int i)
            throws ClassNotFoundException {
        anInt3550++;
        if (string.equals("B"))
            return Byte.TYPE;
        if (string.equals("I"))
            return Integer.TYPE;
        if (string.equals("S"))
            return Short.TYPE;
        if (string.equals("J"))
            return Long.TYPE;
        if (string.equals("Z"))
            return Boolean.TYPE;
        if (string.equals("F"))
            return Float.TYPE;
        if (string.equals("D"))
            return Double.TYPE;
        if (i != -1)
            aRSString_3552 = null;
        if (string.equals("C"))
            return Character.TYPE;
        return Class.forName(string);
    }

    public static void method730(byte i, int i_3_, RSString class100) {
        anInt3547++;
        Class68_Sub20_Sub9 class68_sub20_sub9
                = Class68_Sub13_Sub26_Sub1.method835(i_3_, 2, (byte) -120);
        class68_sub20_sub9.method1097(0);
        class68_sub20_sub9.aRSString_4300 = class100;
        if (i < 69)
            aRSString_3552 = null;
    }

    public static int method731(Class21renamed class21, int i, Class21renamed class21_4_) {
        try {
            anInt3546++;
            int i_5_ = 0;
            if (class21.method360(Class113.anInt1912, 0))
                i_5_++;
            if (class21.method360(GameException.anInt2241, 0))
                i_5_++;
            if (class21.method360(Class50.anInt986, 0))
                i_5_++;
            if (class21_4_.method360(Class113.anInt1912, 0))
                i_5_++;
            if (i < 43)
                method726((byte) -13, null);
            if (class21_4_.method360(GameException.anInt2241, 0))
                i_5_++;
            if (class21_4_.method360(Class50.anInt986, 0))
                i_5_++;
            return i_5_;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ee.H("
                            + (class21 != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (class21_4_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public void method700(Stream class68_sub14, int i, int i_6_) {
        if (i_6_ != -1)
            aRSString_3551 = null;
        int i_7_ = i;
        if ((i_7_ ^ 0xffffffff) == -1)
            anInt3548
                    = (class68_sub14.readUnsignedByte(i_6_ + -6676) << -1872384500) / 255;
        anInt3556++;
    }

    public static void method732(int i) {
        anInt3555++;
        if (i != 19114)
            aRSString_3551 = null;
        while (Class68_Sub13_Sub8.inStream.method970(Class106.anInt1804, -104) >= 27) {
            int i_8_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 15);
            if (i_8_ == 32767)
                break;
            boolean bool = false;
            if (Class102.aClass1_Sub6_Sub1Array1746[i_8_] == null) {
                bool = true;
                Class102.aClass1_Sub6_Sub1Array1746[i_8_]
                        = new Class1_Sub6_Sub1();
            }
            Class1_Sub6_Sub1 class1_sub6_sub1 = Class102.aClass1_Sub6_Sub1Array1746[i_8_];
            Class68_Sub10.anIntArray2906[Class13_Sub2.anInt2645++] = i_8_;
            class1_sub6_sub1.anInt2575 = Class68_Sub3.anInt2812;
            class1_sub6_sub1.aClass80_3395 = Class68_Sub13_Sub11.method753(Class68_Sub13_Sub8.inStream.method967((byte) 0, 14), -103);
            int i_9_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
            if (i_9_ == 1)
                PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = i_8_;
            int i_10_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 5);
            if (i_10_ > 15)
                i_10_ -= 32;
            int i_11_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 5);
            int i_12_ = (Class68_Sub13_Sub9.anIntArray3578[Class68_Sub13_Sub8.inStream.method967((byte) 0, 3)]);
            if (bool)
                class1_sub6_sub1.anInt2533 = class1_sub6_sub1.anInt2548
                        = i_12_;
            if (i_11_ > 15)
                i_11_ -= 32;
            int i_13_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
            class1_sub6_sub1.anInt2532 = class1_sub6_sub1.aClass80_3395.anInt1410;
            class1_sub6_sub1.anInt2544 = class1_sub6_sub1.aClass80_3395.anInt1451;
            class1_sub6_sub1.anInt2530 = class1_sub6_sub1.aClass80_3395.anInt1409;
            class1_sub6_sub1.anInt2581 = class1_sub6_sub1.aClass80_3395.anInt1456;
            class1_sub6_sub1.anInt2565 = class1_sub6_sub1.aClass80_3395.anInt1467;
            class1_sub6_sub1.anInt2564 = class1_sub6_sub1.aClass80_3395.anInt1421;
            class1_sub6_sub1.anInt2543 = class1_sub6_sub1.aClass80_3395.anInt1440;
            if (class1_sub6_sub1.anInt2581 == 0)
                class1_sub6_sub1.anInt2548 = 0;
            class1_sub6_sub1.anInt2574 = class1_sub6_sub1.aClass80_3395.anInt1447;
            class1_sub6_sub1.anInt2563 = class1_sub6_sub1.aClass80_3395.anInt1415;
            class1_sub6_sub1.method147(i_10_ + (Class68_Sub7
                    .aClass1_Sub6_Sub2_2860
                    .anIntArray2570[0]),
                    (byte) -68,
                    (Class68_Sub7.aClass1_Sub6_Sub2_2860
                            .anIntArray2523[0]) - -i_11_,
                    (i_13_ ^ 0xffffffff) == -2);
            if (class1_sub6_sub1.aClass80_3395.method1444(i ^ 0x4aaa))
                Class52.method543(19395, class1_sub6_sub1.anIntArray2570[0],
                        class1_sub6_sub1, null, 0,
                        class1_sub6_sub1.anIntArray2523[0],
                        GameSocket.anInt1149, null);
        }
        Class68_Sub13_Sub8.inStream.method966((byte) -59);
    }
}
