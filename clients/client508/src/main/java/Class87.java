/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87 implements Runnable {
    public static boolean aBoolean1587 = false;
    public static Class21renamed aClass21_1588;
    public static int anInt1589;
    public static int anInt1590;
    public static int anInt1591;
    public static int anInt1592;
    public static int anInt1593;

    public static void method1487(byte i) {
        Class68_Sub13_Sub12.anIntArray3639 = null;
        Class69.aByteArrayArray1240 = null;
        Class68_Sub13_Sub17.anIntArray3719 = null;
        if (i != -93)
            aBoolean1587 = true;
        Class116.anIntArray1996 = null;
        Class4.anIntArray96 = null;
        Class68_Sub13_Sub19.anIntArray3757 = null;
        anInt1593++;
    }

    public static void method1488(byte i) {
        aClass21_1588 = null;
        int i_0_ = 9 % ((i - -76) / 48);
    }

    public static void method1489(int i) {
        Class93.aClass98_1662.method1567(-51);
        anInt1591++;
        Class7.aClass98_124.method1567(-54);
        Class96.aClass98_1694.method1567(-9);
        if (i <= 52)
            aClass21_1588 = null;
    }

    public void run() {
        anInt1592++;
        try {
            for (; ; ) {
                Class68_Sub25 class68_sub25;
                synchronized (Class68_Sub20_Sub10.aClass16_4314) {
                    class68_sub25
                            = (Class68_Sub25) Class68_Sub20_Sub10.aClass16_4314
                            .method293((byte) 76);
                }
                if (class68_sub25 == null) {
                    Class50.method528(-5, 100L);
                    synchronized (Class63.anObject1169) {
                        if (Class9.anInt169 <= 1) {
                            Class9.anInt169 = 0;
                            Class63.anObject1169.notifyAll();
                            break;
                        }
                        Class9.anInt169--;
                    }
                } else {
                    if (class68_sub25.anInt3177 == 0) {
                        class68_sub25.aUnknown_3170.method1503
                                (class68_sub25.aByteArray3165,
                                        (int) class68_sub25.aLong1218,
                                        class68_sub25.aByteArray3165.length, (byte) -111);
                        synchronized (Class68_Sub20_Sub10.aClass16_4314) {
                            class68_sub25.method647(-17554);
                        }
                    } else if ((class68_sub25.anInt3177 ^ 0xffffffff) == -2) {

                        class68_sub25.aByteArray3165 = (class68_sub25.aUnknown_3170.method1507((int) class68_sub25.aLong1218, true));
                        synchronized (Class68_Sub20_Sub10.aClass16_4314) {
                            Class127.aClass16_2205.method286(class68_sub25,
                                    true);
                        }
                    }
                    synchronized (Class63.anObject1169) {
                        if (Class9.anInt169 <= 1) {
                            Class9.anInt169 = 0;
                            Class63.anObject1169.notifyAll();
                            break;
                        }
                        Class9.anInt169 = 600;
                    }
                }
            }
        } catch (Exception exception) {
            Class71.method1339(null, exception, 38);
        }
    }

    public static Class68_Sub20_Sub10 method1490(byte i) {
        int i_1_ = -82 % ((-66 - i) / 35);
        int i_2_ = (Class68_Sub13_Sub19.anIntArray3757[0]
                * Class68_Sub13_Sub12.anIntArray3639[0]);
        byte[] is = Class69.aByteArrayArray1240[0];
        int[] is_3_ = new int[i_2_];
        anInt1589++;
        for (int i_4_ = 0; i_2_ > i_4_; i_4_++)
            is_3_[i_4_] = (Class68_Sub13_Sub17.anIntArray3719
                    [Class120.method1740(is[i_4_], 255)]);
        Sprite sprite
                = (new Sprite
                (Class97.anInt1703, Class68_Sub20_Sub15.anInt4405,
                        Class4.anIntArray96[0], Class116.anIntArray1996[0],
                        Class68_Sub13_Sub12.anIntArray3639[0],
                        Class68_Sub13_Sub19.anIntArray3757[0], is_3_));
        method1487((byte) -93);
        return sprite;
    }

    public static void method1491(byte i) {
        if (i != -110)
            method1491((byte) -69);
        anInt1590++;
        int i_5_ = Class7.aByteArrayArray133.length;
        for (int i_6_ = 0; (i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
            if (Class7.aByteArrayArray133[i_6_] != null) {
                int i_7_ = -1;
                for (int i_8_ = 0;
                     (Class85.anInt1548 ^ 0xffffffff) < (i_8_ ^ 0xffffffff);
                     i_8_++) {
                    if ((PacketParser.anIntArray1863[i_8_] ^ 0xffffffff)
                            == (Class119.anIntArray2089[i_6_] ^ 0xffffffff)) {
                        i_7_ = i_8_;
                        break;
                    }
                }
                if (i_7_ == -1) {
                    PacketParser.anIntArray1863[Class85.anInt1548]
                            = Class119.anIntArray2089[i_6_];
                    i_7_ = Class85.anInt1548++;
                }
                Stream class68_sub14
                        = new Stream(Class7.aByteArrayArray133[i_6_]);
                int i_9_ = 0;
                while ((Class7.aByteArrayArray133[i_6_].length ^ 0xffffffff)
                        < (class68_sub14.currentOffset ^ 0xffffffff)) {
                    if ((i_9_ ^ 0xffffffff) <= -512)
                        break;
                    int i_10_ = i_7_ | i_9_++ << -1428217914;
                    int i_11_ = class68_sub14.readUnsignedWord(1355769544);
                    int i_12_ = i_11_ >> -308588978;
                    int i_13_ = i_11_ & 0x3f;
                    int i_14_ = 0x3f & i_11_ >> 1724002311;
                    int i_15_ = i_14_ + (-Class36.anInt643
                            + (Class119.anIntArray2089[i_6_]
                            >> -1417238360) * 64);
                    int i_16_
                            = i_13_ + (64 * (Class119.anIntArray2089[i_6_] & 0xff)
                            - Class68_Sub13_Sub35.anInt4026);
                    Class80 class80
                            = (Class68_Sub13_Sub11.method753
                            (class68_sub14.readUnsignedWord(1355769544), i ^ ~0x55));
                    if (Class102.aClass1_Sub6_Sub1Array1746[i_10_] == null
                            && (class80.aByte1446 & 0x1) > 0
                            && Class68_Sub13_Sub18.anInt3737 == i_12_ && i_15_ >= 0
                            && class80.anInt1451 + i_15_ < 104
                            && (i_16_ ^ 0xffffffff) <= -1
                            && class80.anInt1451 + i_16_ < 104) {
                        Class102.aClass1_Sub6_Sub1Array1746[i_10_]
                                = new Class1_Sub6_Sub1();
                        Class1_Sub6_Sub1 class1_sub6_sub1
                                = Class102.aClass1_Sub6_Sub1Array1746[i_10_];
                        Class68_Sub10.anIntArray2906[Class13_Sub2.anInt2645++]
                                = i_10_;
                        class1_sub6_sub1.anInt2575 = Class68_Sub3.anInt2812;
                        class1_sub6_sub1.aClass80_3395 = class80;
                        class1_sub6_sub1.anInt2530
                                = class1_sub6_sub1.aClass80_3395.anInt1409;
                        class1_sub6_sub1.anInt2543
                                = class1_sub6_sub1.aClass80_3395.anInt1440;
                        class1_sub6_sub1.anInt2564
                                = class1_sub6_sub1.aClass80_3395.anInt1421;
                        class1_sub6_sub1.anInt2565
                                = class1_sub6_sub1.aClass80_3395.anInt1467;
                        class1_sub6_sub1.anInt2581
                                = class1_sub6_sub1.aClass80_3395.anInt1456;
                        class1_sub6_sub1.anInt2563
                                = class1_sub6_sub1.aClass80_3395.anInt1415;
                        class1_sub6_sub1.anInt2532
                                = class1_sub6_sub1.aClass80_3395.anInt1410;
                        class1_sub6_sub1.anInt2544
                                = class1_sub6_sub1.aClass80_3395.anInt1451;
                        class1_sub6_sub1.anInt2574
                                = class1_sub6_sub1.aClass80_3395.anInt1447;
                        if ((class1_sub6_sub1.anInt2581 ^ 0xffffffff) == -1)
                            class1_sub6_sub1.anInt2548 = 0;
                        class1_sub6_sub1.method147(i_16_, (byte) -68, i_15_,
                                true);
                    }
                }
            }
        }
    }
}
