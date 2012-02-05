/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class90 implements Interface4 {
    public boolean[] aBooleanArray2327;
    public static int anInt2328;
    public static int anInt2329;
    public static int anInt2330;
    public static int anInt2331;
    public static int anInt2332;
    public static int anInt2333;
    public Class21renamed aClass21_2334;
    public static int[] anIntArray2335;
    public static int anInt2336;
    public static int anInt2337;
    public static int anInt2338;
    public Class21renamed aClass21_2339;
    public Login aLogin_2340;
    public static RSString aRSString_2341
            = RSString.newRsString("headicons_pk");
    public byte[] aByteArray2342;
    public static int anInt2343;
    public static int anInt2344;
    public static int[] anIntArray2345;
    public boolean aBoolean2346;
    public static int anInt2347;
    public boolean[] aBooleanArray2348;
    public byte[] aByteArray2349;
    public static int anInt2350;
    public static RSString aRSString_2351;
    public static int anInt2352;
    public int anInt2353 = 50;
    public static RSString aRSString_2354;
    public static RSString aRSString_2355;
    public static int anInt2356;
    public boolean[] aBooleanArray2357;
    public short[] aShortArray2358;
    public static int anInt2359;
    public boolean[] aBooleanArray2360;
    public byte[] aByteArray2361;
    public static int anInt2362;
    public boolean[] aBooleanArray2363;
    public static int anInt2364;
    public byte[] aByteArray2365;

    public boolean method9(byte i, int i_0_) {
        anInt2343++;
        if (aBoolean2346 || aBooleanArray2327[i_0_])
            return true;
        if (i >= -110)
            method1513((byte) -57);
        return false;
    }

    public int[] method11(int i, int i_1_) {
        Class68_Sub20_Sub6 class68_sub20_sub6 = method1514((byte) 84, i_1_);
        anInt2331++;
        if (i <= 70)
            return null;
        if (class68_sub20_sub6 == null)
            return null;
        return class68_sub20_sub6.method1065(this, -109, aClass21_2334,
                (aBoolean2346
                        || aBooleanArray2327[i_1_]));
    }

    public boolean method10(int i, int i_2_) {
        if (i_2_ != 2)
            return true;
        anInt2356++;
        return aBooleanArray2363[i];
    }

    public static Class68_Sub20_Sub1 method1509
            (Class21renamed class21, int i, byte i_3_, Class21renamed class21_4_, int i_5_) {
        try {
            anInt2337++;
            if (!Class68_Sub13_Sub36.method880(-29381, i_5_, class21, i))
                return null;
            if (i_3_ < 52)
                method1519(45);
            return Class85.method1481(class21_4_.method338(i, 0, i_5_), false);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("pa.O("
                            + (class21 != null ? "{...}" : "null")
                            + ',' + i + ',' + i_3_ + ','
                            + (class21_4_ != null ? "{...}"
                            : "null")
                            + ',' + i_5_ + ')'));
        }
    }

    public static Class91 method1510(RSString class100, int i,
                                     Class21renamed class21) {
        try {
            anInt2328++;
            int i_6_ = class21.method335(class100, (byte) -94);
            if (i != 12666)
                aRSString_2354 = null;
            if (i_6_ == -1)
                return new Class91(0);
            int[] is = class21.method345(false, i_6_);
            Class91 class91 = new Class91(is.length);
            for (int i_7_ = 0; class91.anInt1637 > i_7_; i_7_++) {
                Stream class68_sub14
                        = new Stream(class21.method338(is[i_7_], 0, i_6_));
                class91.aRSStringArray1635[i_7_]
                        = class68_sub14.readString(i + -12539);
                class91.aByteArray1638[i_7_] = class68_sub14.method955(3390);
                class91.aShortArray1631[i_7_]
                        = (short) class68_sub14.readUnsignedWord(1355769544);
                class91.aShortArray1634[i_7_]
                        = (short) class68_sub14.readUnsignedWord(i + 1355756878);
                class91.anIntArray1640[i_7_] = class68_sub14.readDWord();
            }
            return class91;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("pa.H("
                            + (class100 != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (class21 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method1511(boolean bool) {
        if (Class16.anInt273 > 0)
            Class16.anInt273--;
        anInt2362++;
        if (Class104.anInt1784 > 1) {
            Class68_Sub20_Sub5.anInt4220 = Class68_Sub22.anInt3148;
            Class104.anInt1784--;
        }
        if (Class75_Sub3_Sub1.aBoolean4597) {
            Class75_Sub3_Sub1.aBoolean4597 = false;
            Class72_Sub1.method1367((byte) -21);
        } else {
            for (int i = 0; (i ^ 0xffffffff) > -101; i++) {
                if (!Class14.method265(-110))
                    break;
            }
            if ((GameException.anInt2231 ^ 0xffffffff) == -31) {
                Class50.method531(false, 141, Class21renamed.stream);
                synchronized (Class14.aClass84_241.anObject1543) {
                    if (!Class68_Sub13_Sub33.aBoolean4000)
                        Class14.aClass84_241.anInt1545 = 0;
                    else if (Class29.anInt537 != 0
                            || Class14.aClass84_241.anInt1545 >= 40) {
                        Class83.anInt1527++;
                        Class21renamed.stream.createFrame(117);
                        Class21renamed.stream.writeByte(0);
                        int i = Class21renamed.stream.currentOffset;
                        int i_8_ = 0;
                        for (int i_9_ = 0;
                             i_9_ < Class14.aClass84_241.anInt1545; i_9_++) {
                            if ((Class21renamed.stream.currentOffset + -i
                                    ^ 0xffffffff)
                                    <= -241)
                                break;
                            int i_10_
                                    = Class14.aClass84_241.anIntArray1546[i_9_];
                            int i_11_
                                    = Class14.aClass84_241.anIntArray1544[i_9_];
                            if (i_10_ >= 0) {
                                if (i_10_ > 65534)
                                    i_10_ = 65534;
                            } else
                                i_10_ = 0;
                            i_8_++;
                            if ((i_11_ ^ 0xffffffff) > -1)
                                i_11_ = 0;
                            else if ((i_11_ ^ 0xffffffff) < -65535)
                                i_11_ = 65534;
                            boolean bool_12_ = false;
                            if ((Class14.aClass84_241.anIntArray1546[i_9_]
                                    ^ 0xffffffff) == 0
                                    && (Class14.aClass84_241.anIntArray1544[i_9_]
                                    == -1)) {
                                bool_12_ = true;
                                i_10_ = -1;
                                i_11_ = -1;
                            }
                            if (Class68_Sub13_Sub4.anInt3488 == i_11_
                                    && ((i_10_ ^ 0xffffffff)
                                    == (Class68_Sub20_Sub17.anInt4439
                                    ^ 0xffffffff))) {
                                if ((Class7.anInt122 ^ 0xffffffff) > -2048)
                                    Class7.anInt122++;
                            } else {
                                int i_13_
                                        = -Class68_Sub20_Sub17.anInt4439 + i_10_;
                                Class68_Sub20_Sub17.anInt4439 = i_10_;
                                int i_14_
                                        = i_11_ + -Class68_Sub13_Sub4.anInt3488;
                                Class68_Sub13_Sub4.anInt3488 = i_11_;
                                if (Class7.anInt122 < 8
                                        && (i_14_ ^ 0xffffffff) <= 31
                                        && i_14_ <= 31 && i_13_ >= -32
                                        && i_13_ <= 31) {
                                    i_14_ += 32;
                                    i_13_ += 32;
                                    Class21renamed.stream.writeWord
                                            (
                                                    ((i_14_ << 1808956998)
                                                            + (Class7.anInt122 << 674618540)
                                                            + i_13_));
                                    Class7.anInt122 = 0;
                                } else if (Class7.anInt122 < 32
                                        && (i_14_ ^ 0xffffffff) <= 127
                                        && i_14_ <= 127 && i_13_ >= -128
                                        && (i_13_ ^ 0xffffffff) >= -128) {
                                    i_13_ += 128;
                                    Class21renamed.stream
                                            .writeByte(Class7.anInt122 + 128);
                                    i_14_ += 128;
                                    Class21renamed.stream.writeWord
                                            ((i_14_ << 1323552040) + i_13_);
                                    Class7.anInt122 = 0;
                                } else if (Class7.anInt122 < 32) {
                                    Class21renamed.stream
                                            .writeByte(192 - -Class7.anInt122);
                                    if (!bool_12_)
                                        Class21renamed.stream
                                                .writeDWord
                                                        (
                                                                i_10_ << 1282459408 | i_11_);
                                    else
                                        Class21renamed.stream
                                                .writeDWord(-2147483648);
                                    Class7.anInt122 = 0;
                                } else {
                                    Class21renamed.stream.writeWord
                                            (Class7.anInt122 + 57344);
                                    if (bool_12_)
                                        Class21renamed.stream
                                                .writeDWord(-2147483648);
                                    else
                                        Class21renamed.stream
                                                .writeDWord
                                                        (
                                                                i_10_ << 658823504 | i_11_);
                                    Class7.anInt122 = 0;
                                }
                            }
                        }
                        Class21renamed.stream.method935
                                (Class21renamed.stream.currentOffset - i,
                                        119);
                        if (Class14.aClass84_241.anInt1545 <= i_8_)
                            Class14.aClass84_241.anInt1545 = 0;
                        else {
                            Class14.aClass84_241.anInt1545 -= i_8_;
                            for (int i_15_ = 0;
                                 Class14.aClass84_241.anInt1545 > i_15_;
                                 i_15_++) {
                                Class14.aClass84_241.anIntArray1544[i_15_]
                                        = (Class14.aClass84_241.anIntArray1544
                                        [i_15_ - -i_8_]);
                                Class14.aClass84_241.anIntArray1546[i_15_]
                                        = (Class14.aClass84_241.anIntArray1546
                                        [i_8_ + i_15_]);
                            }
                        }
                    }
                }
                if (Class29.anInt537 != 0) {
                    long l = ((-Class68_Sub20_Sub10.aLong4306
                            + Class68_Sub20_Sub7.aLong4262)
                            / 50L);
                    Class50_Sub2.anInt2732++;
                    Class68_Sub20_Sub10.aLong4306
                            = Class68_Sub20_Sub7.aLong4262;
                    if ((l ^ 0xffffffffffffffffL) < -32768L)
                        l = 32767L;
                    int i = Class125.anInt2173;
                    int i_16_ = Class68_Sub13_Sub37.anInt4077;
                    int i_17_ = (int) l;
                    if (i >= 0) {
                        if (i > 65535)
                            i = 65535;
                    } else
                        i = 0;
                    int i_18_ = 0;
                    if (i_16_ >= 0) {
                        if ((i_16_ ^ 0xffffffff) < -65536)
                            i_16_ = 65535;
                    } else
                        i_16_ = 0;
                    if ((Class29.anInt537 ^ 0xffffffff) == -3)
                        i_18_ = 1;
                    Class21renamed.stream.createFrame(59);
                    Class21renamed.stream.writeWord(i_17_ | i_18_ << 714360111);
                    Class21renamed.stream.writeDWord_v1((byte) -116, i_16_ | i << 189839792);
                }
                if (Class108.anInt1826 > 0)
                    Class108.anInt1826--;
                if (Class128.aBooleanArray2228[96]
                        || Class128.aBooleanArray2228[97]
                        || Class128.aBooleanArray2228[98]
                        || Class128.aBooleanArray2228[99])
                    Class102.aBoolean1748 = true;
                if (Class102.aBoolean1748
                        && (Class108.anInt1826 ^ 0xffffffff) >= -1) {
                    Class68_Sub13_Sub8.anInt3557++;
                    Class108.anInt1826 = 20;
                    Class102.aBoolean1748 = false;
                    Class21renamed.stream.createFrame(99);
                    Class21renamed.stream.writeWordBigEndianA((byte) 19, Class16.anInt275);
                    Class21renamed.stream.writeWordA(Class8.anInt163, -22);
                }
                if (!Class15.aBoolean250 == false
                        && !Class17.aBoolean284 == true) {
                    Applet_Sub1.anInt22++;
                    Class17.aBoolean284 = true;
                    Class21renamed.stream.createFrame(248);
                    Class21renamed.stream.writeByte(1);
                }
                if (!Class15.aBoolean250 != false
                        && Class17.aBoolean284 != false) {
                    Applet_Sub1.anInt22++;
                    Class17.aBoolean284 = false;
                    Class21renamed.stream.createFrame(248);
                    Class21renamed.stream.writeByte(0);
                }
                if (!Class108.aBoolean1830) {
                    Class68_Sub22.anInt3143++;
                    Class21renamed.stream.createFrame(165);
                    Class21renamed.stream.writeDWord_v2(-19237, Class34.method415((byte) 112));
                    Class108.aBoolean1830 = true;
                }
                Class114.method1692(0);
                if (GameException.anInt2231 == 30) {
                    Class68_Sub13_Sub32.method864(0);
                    Class68_Sub29.method1321((byte) -110);
                    Class68_Sub20_Sub13.anInt4368++;
                    if (Class68_Sub20_Sub13.anInt4368 > 750)
                        Class72_Sub1.method1367((byte) -21);
                    else {
                        Class68_Sub7.method669(51);
                        Class68_Sub18.method995(16986);
                        Class71.method1341((byte) 122);
                        if (Class68.aClass45_1231 != null)
                            Class68_Sub13_Sub15.method770((byte) -84);
                        for (int i = Class68_Sub13_Sub2.method710(bool, -115);
                             i != -1;
                             i = Class68_Sub13_Sub2.method710(false, -122)) {
                            Class68_Sub13_Sub35.method878((byte) 67, i);
                            Class68_Sub13_Sub34.anIntArray4012
                                    [Class120.method1740(Class68_Sub4.anInt2815++,
                                    31)]
                                    = i;
                        }
                        for (Class68_Sub20_Sub9 class68_sub20_sub9
                                     = Class71_Sub1.method1346((byte) 37);
                             class68_sub20_sub9 != null;
                             class68_sub20_sub9
                                     = Class71_Sub1.method1346((byte) 37)) {
                            int i = class68_sub20_sub9.method1102(!bool);
                            int i_19_
                                    = class68_sub20_sub9.method1096(-1597153401);
                            if (i != 1) {
                                if (i == 2) {
                                    Class21_Sub1.aRSStringArray2710[i_19_]
                                            = class68_sub20_sub9.aRSString_4300;
                                    Class68_Sub13_Sub31.anIntArray3970
                                            [Class120.method1740(31,
                                            Class68_Sub10
                                                    .anInt2908++)]
                                            = i_19_;
                                }
                            } else {
                                Class106.anIntArray1809[i_19_]
                                        = class68_sub20_sub9.anInt4293;
                                Class125.anIntArray2169
                                        [Class120.method1740(31, Class13_Sub1
                                        .anInt2639++)]
                                        = i_19_;
                            }
                        }
                        if ((client.anInt2376 ^ 0xffffffff) != -1) {
                            Class26.anInt523 += 20;
                            if (Class26.anInt523 >= 400)
                                client.anInt2376 = 0;
                        }
                        Class109.anInt1844++;
                        if (Class1_Sub5.aClass45_2515 != null) {
                            Class68_Sub13_Sub24.anInt3833++;
                            if ((Class68_Sub13_Sub24.anInt3833 ^ 0xffffffff)
                                    <= -16) {
                                Class113.method1682(Class1_Sub5.aClass45_2515,
                                        -116);
                                Class1_Sub5.aClass45_2515 = null;
                            }
                        }
                        if (Class54.aClass45_1033 != null) {
                            Class113.method1682(Class54.aClass45_1033, -116);
                            if (Class59.anInt1102 - -5 < Class96.anInt1695
                                    || Class59.anInt1102 + -5 > Class96.anInt1695
                                    || ((Class68_Sub18.anInt3046 + 5 ^ 0xffffffff)
                                    > (Class13.anInt223 ^ 0xffffffff))
                                    || ((Class13.anInt223 ^ 0xffffffff)
                                    > (Class68_Sub18.anInt3046 - 5
                                    ^ 0xffffffff)))
                                Class87.aBoolean1587 = true;
                            Class68_Sub13_Sub6.anInt3532++;
                            if (Class68_Sub20_Sub12.anInt4352 == 0) {
                                if (!Class87.aBoolean1587
                                        || (Class68_Sub13_Sub6.anInt3532
                                        ^ 0xffffffff) > -6) {
                                    if (((Class14.anInt228 ^ 0xffffffff) == -2
                                            || (Applet_Sub1.method17
                                            ((byte) -125,
                                                    -1 + (Class68_Sub13_Sub21
                                                            .anInt3803))))
                                            && (Class68_Sub13_Sub21.anInt3803
                                            ^ 0xffffffff) < -3)
                                        Class68_Sub13_Sub18
                                                .method787((byte) -49);
                                    else if ((Class68_Sub13_Sub21.anInt3803
                                            ^ 0xffffffff)
                                            < -1)
                                        Class68_Sub13_Sub39
                                                .method901((byte) 46);
                                } else if ((Class3.aClass45_73
                                        == Class54.aClass45_1033)
                                        && (Class68_Sub20_Sub2.anInt4189
                                        != (Class68_Sub13_Sub32
                                        .anInt3978))) {
                                    Class68_Sub9.anInt2890++;
                                    Class45 class45 = Class54.aClass45_1033;
                                    int i = 0;
                                    if ((Class108.anInt1824 ^ 0xffffffff) == -2
                                            && class45.anInt808 == 206)
                                        i = 1;
                                    if ((class45.anIntArray795
                                            [Class68_Sub13_Sub32.anInt3978])
                                            <= 0)
                                        i = 0;
                                    if (Class68_Sub13_Sub8.method733
                                            (0, client.method41(class45))) {
                                        int i_20_
                                                = Class68_Sub20_Sub2.anInt4189;
                                        int i_21_
                                                = Class68_Sub13_Sub32.anInt3978;
                                        class45.anIntArray795[i_21_]
                                                = class45.anIntArray795[i_20_];
                                        class45.anIntArray774[i_21_]
                                                = class45.anIntArray774[i_20_];
                                        class45.anIntArray795[i_20_] = -1;
                                        class45.anIntArray774[i_20_] = 0;
                                    } else if ((i ^ 0xffffffff) != -2)
                                        class45.method495((Class68_Sub13_Sub32
                                                .anInt3978),
                                                95,
                                                (Class68_Sub20_Sub2
                                                        .anInt4189));
                                    else {
                                        int i_22_
                                                = Class68_Sub13_Sub32.anInt3978;
                                        int i_23_
                                                = Class68_Sub20_Sub2.anInt4189;
                                        while ((i_23_ ^ 0xffffffff)
                                                != (i_22_ ^ 0xffffffff)) {
                                            if (i_22_ >= i_23_) {
                                                if ((i_22_ ^ 0xffffffff)
                                                        < (i_23_ ^ 0xffffffff)) {
                                                    class45.method495
                                                            (1 + i_23_, 49, i_23_);
                                                    i_23_++;
                                                }
                                            } else {
                                                class45.method495(i_23_ + -1,
                                                        87, i_23_);
                                                i_23_--;
                                            }
                                        }
                                    }
                                    Class21renamed.stream.createFrame(167);
                                    Class21renamed.stream.writeWordBigEndianA((byte) 19, Class68_Sub13_Sub32.anInt3978);
                                    Class21renamed.stream.writeByteA(-772724656, i);
                                    Class21renamed.stream.writeWordBigEndianA((byte) 19, Class68_Sub20_Sub2.anInt4189);
                                    Class21renamed.stream.writeDWordBigEndian((byte) 127, Class54.aClass45_1033.anInt792);
                                }
                                Class68_Sub13_Sub24.anInt3833 = 10;
                                Class54.aClass45_1033 = null;
                                Class29.anInt537 = 0;
                            }
                        }
                        Class124.aBoolean2159 = false;
                        Class68_Sub18.aBoolean3058 = false;
                        Class45 class45 = Class108.aClass45_1825;
                        Class108.aClass45_1825 = null;
                        Animable.aClass45_61 = null;
                        Class43.anInt739 = 0;
                        Class45 class45_24_ = Class121.aClass45_2108;
                        Class121.aClass45_2108 = null;
                        for (/**/;
                                 (Class68_Sub25.method1210((byte) 111)
                                         && (Class43.anInt739 ^ 0xffffffff) > -129);
                                 Class43.anInt739++) {
                            Class68_Sub20_Sub14.anIntArray4385[(Class43
                                    .anInt739)]
                                    = Class59.anInt1104;
                            Class50.anIntArray983[Class43.anInt739]
                                    = Class1_Sub6.anInt2536;
                        }
                        Class68.aClass45_1231 = null;
                        if ((Class68_Sub13_Sub10.anInt3595 ^ 0xffffffff) != 0)
                            Class25.method384(-88,
                                    Class68_Sub13_Sub10.anInt3595,
                                    Class13_Sub3.width, 0, 0, 0,
                                    0, Class68_Sub13_Sub9.height);
                        Class68_Sub22.anInt3148++;
                        for (; ; ) {
                            Class68_Sub29 class68_sub29
                                    = ((Class68_Sub29)
                                    Class35.aClass16_623.method294(-107));
                            if (class68_sub29 == null)
                                break;
                            Class45 class45_25_ = class68_sub29.aClass45_3239;
                            if (class45_25_.anInt867 >= 0) {
                                Class45 class45_26_
                                        = (Class68_Sub20_Sub15.method1170
                                        (class45_25_.anInt799, (byte) -80));
                                if (class45_26_ == null
                                        || class45_26_.aClass45Array769 == null
                                        || ((class45_25_.anInt867 ^ 0xffffffff)
                                        <= (class45_26_.aClass45Array769.length
                                        ^ 0xffffffff))
                                        || class45_25_ != (class45_26_
                                        .aClass45Array769
                                        [class45_25_.anInt867]))
                                    continue;
                            }
                            Class68_Sub13_Sub16.method776(class68_sub29, 16);
                        }
                        for (; ; ) {
                            Class68_Sub29 class68_sub29
                                    = ((Class68_Sub29)
                                    Class13_Sub1.aClass16_2627.method294(-95));
                            if (class68_sub29 == null)
                                break;
                            Class45 class45_27_ = class68_sub29.aClass45_3239;
                            if ((class45_27_.anInt867 ^ 0xffffffff) <= -1) {
                                Class45 class45_28_
                                        = (Class68_Sub20_Sub15.method1170
                                        (class45_27_.anInt799, (byte) -80));
                                if (class45_28_ == null
                                        || class45_28_.aClass45Array769 == null
                                        || (class45_27_.anInt867
                                        >= class45_28_.aClass45Array769.length)
                                        || (class45_28_.aClass45Array769
                                        [class45_27_.anInt867]) != class45_27_)
                                    continue;
                            }
                            Class68_Sub13_Sub16.method776(class68_sub29, 16);
                        }
                        for (; ; ) {
                            Class68_Sub29 class68_sub29
                                    = ((Class68_Sub29)
                                    Class115.aClass16_1955.method294(80));
                            if (class68_sub29 == null)
                                break;
                            Class45 class45_29_ = class68_sub29.aClass45_3239;
                            if ((class45_29_.anInt867 ^ 0xffffffff) <= -1) {
                                Class45 class45_30_
                                        = (Class68_Sub20_Sub15.method1170
                                        (class45_29_.anInt799, (byte) -80));
                                if (class45_30_ == null
                                        || class45_30_.aClass45Array769 == null
                                        || ((class45_29_.anInt867 ^ 0xffffffff)
                                        <= (class45_30_.aClass45Array769.length
                                        ^ 0xffffffff))
                                        || class45_29_ != (class45_30_
                                        .aClass45Array769
                                        [class45_29_.anInt867]))
                                    continue;
                            }
                            Class68_Sub13_Sub16.method776(class68_sub29, 16);
                        }
                        if (Class68_Sub10.aBoolean2903
                                && Class68.aClass45_1231 == null)
                            Class68_Sub10.aBoolean2903 = false;
                        if (Class35.aClass45_606 != null)
                            Class127.method1777((byte) -113);
                        if (Class68_Sub13_Sub13.anInt3663 > 0
                                && Class128.aBooleanArray2228[82]
                                && Class128.aBooleanArray2228[81]
                                && Class68_Sub13_Sub30.anInt3948 != 0) {
                            int i = (GameSocket.anInt1149
                                    + -Class68_Sub13_Sub30.anInt3948);
                            if (i < 0)
                                i = 0;
                            else if (i > 3)
                                i = 3;
                            Class51.method539(((Class68_Sub7
                                    .aClass1_Sub6_Sub2_2860
                                    .anIntArray2523[0])
                                    + Class36.anInt643),
                                    i,
                                    (Class68_Sub13_Sub35.anInt4026
                                            + (Class68_Sub7
                                            .aClass1_Sub6_Sub2_2860
                                            .anIntArray2570[0])),
                                    24867);
                        }
                        if (Class68_Sub20_Sub15.anInt4400 != -1) {
                            int i = Class68_Sub20_Sub15.anInt4400;
                            int i_31_ = ISAACRandomGen.anInt1489;
                            if (Class68_Sub13_Sub13.anInt3663 <= 0
                                    || !Class128.aBooleanArray2228[82]
                                    || !Class128.aBooleanArray2228[81]) {
                                boolean bool_32_
                                        = (Class68_Sub13_Sub3.method713
                                        (0, 0,
                                                (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                        .anIntArray2523[0]),
                                                (Class68_Sub7.aClass1_Sub6_Sub2_2860
                                                        .anIntArray2570[0]),
                                                0, 0, i_31_, true, 0, -3, 0, i));
                                if (bool_32_) {
                                    Class26.anInt523 = 0;
                                    Class68_Sub22.anInt3140
                                            = Class68_Sub13_Sub37.anInt4077;
                                    client.anInt2376 = 1;
                                    Class68_Sub13_Sub21.anInt3787
                                            = Class125.anInt2173;
                                }
                            } else
                                Class51.method539(Class36.anInt643 + i,
                                        GameSocket.anInt1149,
                                        (Class68_Sub13_Sub35
                                                .anInt4026) + i_31_,
                                        24867);
                            Class68_Sub20_Sub15.anInt4400 = -1;
                        }
                        Class68_Sub28_Sub2.method1265(-2);
                        if (class45 != Class108.aClass45_1825) {
                            if (class45 != null)
                                Class113.method1682(class45, -114);
                            if (Class108.aClass45_1825 != null)
                                Class113.method1682(Class108.aClass45_1825,
                                        -116);
                        }
                        if (Class121.aClass45_2108 != class45_24_
                                && ((Class59.anInt1109 ^ 0xffffffff)
                                == (Class94.anInt1676 ^ 0xffffffff))) {
                            if (class45_24_ != null)
                                Class113.method1682(class45_24_, -119);
                            if (Class121.aClass45_2108 != null)
                                Class113.method1682(Class121.aClass45_2108,
                                        -119);
                        }
                        if (Class121.aClass45_2108 != null) {
                            if ((Class94.anInt1676 ^ 0xffffffff)
                                    < (Class59.anInt1109 ^ 0xffffffff)) {
                                Class59.anInt1109++;
                                if (Class59.anInt1109 == Class94.anInt1676)
                                    Class113.method1682(Class121.aClass45_2108,
                                            -113);
                            }
                        } else if ((Class59.anInt1109 ^ 0xffffffff) < -1)
                            Class59.anInt1109--;
                        if (Class128.anInt2214 != 1) {
                            if ((Class128.anInt2214 ^ 0xffffffff) != -3)
                                Class76.method1407(-1);
                            else
                                Class114.method1691(-128);
                        } else
                            Class68_Sub20_Sub17.method1178(2);
                        for (int i = 0; (i ^ 0xffffffff) > -6; i++)
                            Class68_Sub13_Sub16.anIntArray3697[i]++;
                        int i = Class11.method229((byte) 47);
                        int i_33_ = Class68_Sub13_Sub18.method790(7);
                        if (i > 4500 && i_33_ > 4500) {
                            Class16.anInt273 = 250;
                            Class86.method1482(4000, 0);
                            Class14.anInt232++;
                            Class21renamed.stream.createFrame(47);
                        }
                        Class68_Sub20_Sub13.anInt4363++;
                        Class22.anInt482++;
                        if ((Class22.anInt482 ^ 0xffffffff) < -501) {
                            Class22.anInt482 = 0;
                            int i_34_ = (int) (Math.random() * 8.0);
                            if ((i_34_ & 0x2) == 2)
                                Class68_Sub20_Sub9.anInt4291
                                        += Class68_Sub13_Sub14.anInt3673;
                            if ((0x1 & i_34_) == 1)
                                Class68_Sub3.anInt2805
                                        += Class68_Sub26.anInt3183;
                            if ((0x4 & i_34_ ^ 0xffffffff) == -5)
                                Class68_Sub13_Sub28.anInt3920
                                        += Class68_Sub28_Sub1.anInt4503;
                        }
                        if ((Class68_Sub20_Sub13.anInt4363 ^ 0xffffffff)
                                < -501) {
                            Class68_Sub20_Sub13.anInt4363 = 0;
                            int i_35_ = (int) (8.0 * Math.random());
                            if ((i_35_ & 0x2 ^ 0xffffffff) == -3)
                                Class68_Sub20_Sub16.anInt4420
                                        += Class1_Sub1.anInt2412;
                            if ((0x1 & i_35_) == 1)
                                Class68_Sub13_Sub26.anInt3883
                                        += Class68_Sub13_Sub4.anInt3501;
                        }
                        if ((Class68_Sub20_Sub16.anInt4420 ^ 0xffffffff) > 19)
                            Class1_Sub1.anInt2412 = 1;
                        if ((Class68_Sub13_Sub28.anInt3920 ^ 0xffffffff) > 39)
                            Class68_Sub28_Sub1.anInt4503 = 1;
                        if ((Class68_Sub3.anInt2805 ^ 0xffffffff) > 49)
                            Class68_Sub26.anInt3183 = 2;
                        if ((Class68_Sub20_Sub16.anInt4420 ^ 0xffffffff) < -11)
                            Class1_Sub1.anInt2412 = -1;
                        Class75_Sub2.anInt3313++;
                        if ((Class68_Sub13_Sub26.anInt3883 ^ 0xffffffff) > 59)
                            Class68_Sub13_Sub4.anInt3501 = 2;
                        if ((Class68_Sub3.anInt2805 ^ 0xffffffff) < -51)
                            Class68_Sub26.anInt3183 = -2;
                        if ((Class68_Sub13_Sub28.anInt3920 ^ 0xffffffff) < -41)
                            Class68_Sub28_Sub1.anInt4503 = -1;
                        if ((Class68_Sub20_Sub9.anInt4291 ^ 0xffffffff) > 54)
                            Class68_Sub13_Sub14.anInt3673 = 2;
                        if ((Class68_Sub13_Sub26.anInt3883 ^ 0xffffffff) < -61)
                            Class68_Sub13_Sub4.anInt3501 = -2;
                        if ((Class68_Sub20_Sub9.anInt4291 ^ 0xffffffff) < -56)
                            Class68_Sub13_Sub14.anInt3673 = -2;
                        if (Class75_Sub2.anInt3313 > 50) {
                            Class78.anInt1392++;
                            Class21renamed.stream.createFrame(115);
                        }
                        Class107.method1651(-14394);
                        do {
                            try {
                                if (PlayerDefinition.connection == null
                                        || (Class21renamed.stream
                                        .currentOffset) <= 0)
                                    break;
                                PlayerDefinition.connection.queueBytes
                                        (
                                                Class21renamed.stream.currentOffset,
                                                (Class21renamed.stream
                                                        .buffer));
                                Class75_Sub2.anInt3313 = 0;
                                Class21renamed.stream.currentOffset = 0;
                            } catch (java.io.IOException ioexception) {
                                Class72_Sub1.method1367((byte) -21);
                                break;
                            }
                            break;
                        } while (false);
                    }
                }
            }
        }
    }

    public static void method1512(int i, byte i_36_, int i_37_, int i_38_,
                                  int i_39_) {
        if (Class57.anInt1080 < 100)
            Class115.method1695(false);
        anInt2336++;
        Class79.method1427(i_39_, i, i_38_ + i_39_, i + i_37_);
        if (Class57.anInt1080 < 100) {
            int i_40_ = 20;
            int i_41_ = i_39_ + i_38_ / 2;
            int i_42_ = -18 + i_37_ / 2 + i - i_40_;
            Class79.method1439(i_39_, i, i_38_, i_37_, 0);
            Class79.method1415(i_41_ - 152, i_42_, 304, 34, 9179409);
            Class79.method1415(-151 + i_41_, 1 + i_42_, 302, 32, 0);
            Class79.method1439(i_41_ - 150, i_42_ - -2, 3 * Class57.anInt1080,
                    30, 9179409);
            Class79.method1439(Class57.anInt1080 * 3 + -150 + i_41_,
                    i_42_ - -2, 300 - Class57.anInt1080 * 3, 30, 0);
            Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511.method1032
                    (Class86.aRSString_1574, i_41_, i_42_ - -i_40_, 16777215, -1);
        } else {
            Class64.anInt1192
                    = Class85.anInt1551 + -(int) ((float) i_37_
                    / Class68_Sub9.aFloat2892);
            Class13_Sub4.anInt2687
                    = (int) ((float) (i_38_ * 2) / Class68_Sub9.aFloat2892);
            Class1_Sub7.anInt2619
                    = (int) ((float) (i_37_ * 2) / Class68_Sub9.aFloat2892);
            Class25.anInt516
                    = (-(int) ((float) i_38_ / Class68_Sub9.aFloat2892)
                    + Class68_Sub13_Sub24.anInt3844);
            if (i_36_ != 51)
                method1511(false);
            int i_43_ = (-(int) ((float) i_38_ / Class68_Sub9.aFloat2892)
                    + Class68_Sub13_Sub24.anInt3844);
            int i_44_ = (Class85.anInt1551
                    - (int) ((float) i_37_ / Class68_Sub9.aFloat2892));
            int i_45_ = ((int) ((float) i_37_ / Class68_Sub9.aFloat2892)
                    + Class85.anInt1551);
            int i_46_ = ((int) ((float) i_38_ / Class68_Sub9.aFloat2892)
                    + Class68_Sub13_Sub24.anInt3844);
            Class68_Sub29.method1323(i, i_44_, i_45_, i_39_, i_43_,
                    i_38_ + i_39_, 1391070128, i - -i_37_,
                    i_46_);
            Class115.method1694(i_43_, i, false, i_37_ + i, i_39_ + i_38_,
                    i_45_, i_44_, i_46_, i_39_);
            Class68_Sub13_Sub1.method705(i_45_, i, i_37_ + i, i_39_, i_44_,
                    i_39_ + i_38_, i_46_, i_43_, 73);
            if (Class68_Sub13_Sub36.anInt4033 > 0)
                Class68_Sub13_Sub36.anInt4033--;
            if (Class68_Sub22.aBoolean3134) {
                int i_47_ = i_38_ + i_39_ + -5;
                int i_48_ = -8 + (i + i_37_);
                Class68_Sub6.aClass68_Sub20_Sub1_2847.method1022
                        ((Class68_Sub20_Sub13_Sub2.method1166
                                (2, (new RSString[]
                                        {Class71.aRSString_1288,
                                                Class68_Sub13_Sub24.method816(Class34.anInt597,
                                                        0)}))),
                                i_47_, i_48_, 16776960, -1);
                i_48_ -= 15;
                Runtime runtime = Runtime.getRuntime();
                int i_49_ = 16776960;
                int i_50_
                        = (int) ((runtime.totalMemory() + -runtime.freeMemory())
                        / 1024L);
                if (i_50_ > 65536)
                    i_49_ = 16711680;
                Class68_Sub6.aClass68_Sub20_Sub1_2847.method1022
                        ((Class68_Sub20_Sub13_Sub2.method1166
                                (2, new RSString[]{Class47.aRSString_933,
                                        Class68_Sub13_Sub24.method816(i_50_,
                                                0),
                                        Class114.aRSString_1928})),
                                i_47_, i_48_, i_49_, -1);
                i_48_ -= 15;
            }
        }
    }

    public void method1513(byte i) {
        anInt2333++;
        aLogin_2340.method1470((byte) -11);
        if (i <= -94) {
            /* empty */
        }
    }

    public boolean method8(byte i, int i_51_) {
        if (i != 39)
            method1518((byte) 2, true);
        anInt2352++;
        return aBooleanArray2357[i_51_];
    }

    public int[] method14(float f, int i, int i_52_) {
        if (i != 99)
            return null;
        anInt2330++;
        Class68_Sub20_Sub6 class68_sub20_sub6 = method1514((byte) 109, i_52_);
        if (class68_sub20_sub6 == null)
            return null;
        class68_sub20_sub6.aBoolean4247 = true;
        return class68_sub20_sub6.method1072((byte) -92, aClass21_2334, this,
                f,
                (aBoolean2346
                        || aBooleanArray2327[i_52_]));
    }

    public Class68_Sub20_Sub6 method1514(byte i, int i_53_) {
        int i_54_ = -67 / (-i / 47);
        anInt2359++;
        Class68_Sub20_Sub6 class68_sub20_sub6
                = ((Class68_Sub20_Sub6)
                aLogin_2340.method1473((long) i_53_, (byte) -76));
        if (class68_sub20_sub6 != null)
            return class68_sub20_sub6;
        byte[] is = aClass21_2339.method338(0, 0, i_53_);
        if (is == null)
            return null;
        Stream class68_sub14 = new Stream(is);
        class68_sub20_sub6 = new Class68_Sub20_Sub6(class68_sub14);
        aLogin_2340.method1465((long) i_53_, (byte) 105, class68_sub20_sub6);
        return class68_sub20_sub6;
    }

    public static int method1515(int i, int i_55_) {
        if (i_55_ != 522)
            return -35;
        anInt2347++;
        return i & 0x7f;
    }

    public int method12(int i, int i_56_) {
        int i_57_ = 103 / ((56 - i_56_) / 44);
        anInt2344++;
        return 0xffff & aShortArray2358[i];
    }

    public void method1516(int i, int i_58_) {
        for (Class68_Sub20_Sub6 class68_sub20_sub6
                     = (Class68_Sub20_Sub6) aLogin_2340.method1474(i_58_);
             class68_sub20_sub6 != null;
             class68_sub20_sub6
                     = (Class68_Sub20_Sub6) aLogin_2340.method1466(125)) {
            if (class68_sub20_sub6.aBoolean4247) {
                class68_sub20_sub6.method1070(i, -27276);
                class68_sub20_sub6.aBoolean4247 = false;
            }
        }
        anInt2350++;
    }

    public static int method1517(int i, int i_59_) {
        i--;
        anInt2332++;
        i |= i >>> 363406817;
        i |= i >>> 1563808354;
        i |= i >>> 225433060;
        if (i_59_ != -21189)
            method1517(-80, 15);
        i |= i >>> -132522520;
        i |= i >>> 1065595664;
        return 1 + i;
    }

    public void method1518(byte i, boolean bool) {
        if (i == -97) {
            aBoolean2346 = bool;
            anInt2364++;
            method1513((byte) -117);
        }
    }

    public static void method1519(int i) {
        if (i == 6287) {
            anIntArray2345 = null;
            aRSString_2351 = null;
            anIntArray2335 = null;
            aRSString_2354 = null;
            aRSString_2341 = null;
            aRSString_2355 = null;
        }
    }

    public boolean method13(boolean bool, int i) {
        Class68_Sub20_Sub6 class68_sub20_sub6 = method1514((byte) -120, i);
        anInt2338++;
        if (class68_sub20_sub6 == null)
            return false;
        if (bool != true)
            method1514((byte) 35, -31);
        return class68_sub20_sub6.method1068(this, -5947, aClass21_2334);
    }

    public Class90(Class21renamed class21, Class21renamed class21_60_, Class21renamed class21_61_,
                   int i, boolean bool) {
        aBoolean2346 = false;
        try {
            anInt2353 = i;
            aClass21_2339 = class21;
            aClass21_2334 = class21_61_;
            aBoolean2346 = bool;
            aLogin_2340 = new Login(anInt2353);
            Stream class68_sub14
                    = new Stream(class21_60_.method338(0, 0, 0));
            int i_62_ = class68_sub14.readUnsignedWord(1355769544);
            aBooleanArray2360 = new boolean[i_62_];
            aBooleanArray2348 = new boolean[i_62_];
            aBooleanArray2363 = new boolean[i_62_];
            aByteArray2365 = new byte[i_62_];
            aBooleanArray2327 = new boolean[i_62_];
            aByteArray2342 = new byte[i_62_];
            aShortArray2358 = new short[i_62_];
            aBooleanArray2357 = new boolean[i_62_];
            aByteArray2349 = new byte[i_62_];
            aByteArray2361 = new byte[i_62_];
            for (int i_63_ = 0; i_62_ > i_63_; i_63_++)
                aBooleanArray2348[i_63_]
                        = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
            for (int i_64_ = 0; (i_62_ ^ 0xffffffff) < (i_64_ ^ 0xffffffff);
                 i_64_++) {
                if (aBooleanArray2348[i_64_])
                    aBooleanArray2357[i_64_]
                            = class68_sub14.readUnsignedByte(-6677) == 1;
            }
            for (int i_65_ = 0; (i_65_ ^ 0xffffffff) > (i_62_ ^ 0xffffffff);
                 i_65_++) {
                if (aBooleanArray2348[i_65_])
                    aBooleanArray2363[i_65_]
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
            }
            for (int i_66_ = 0; i_66_ < i_62_; i_66_++) {
                if (aBooleanArray2348[i_66_])
                    aBooleanArray2327[i_66_]
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
            }
            for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > (i_62_ ^ 0xffffffff);
                 i_67_++) {
                if (aBooleanArray2348[i_67_])
                    aBooleanArray2360[i_67_]
                            = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
            }
            for (int i_68_ = 0; i_68_ < i_62_; i_68_++) {
                if (aBooleanArray2348[i_68_])
                    aByteArray2349[i_68_] = class68_sub14.method955(3390);
            }
            for (int i_69_ = 0; i_69_ < i_62_; i_69_++) {
                if (aBooleanArray2348[i_69_])
                    aByteArray2365[i_69_] = class68_sub14.method955(3390);
            }
            for (int i_70_ = 0; (i_62_ ^ 0xffffffff) < (i_70_ ^ 0xffffffff);
                 i_70_++) {
                if (aBooleanArray2348[i_70_])
                    aByteArray2342[i_70_] = class68_sub14.method955(3390);
            }
            for (int i_71_ = 0; i_62_ > i_71_; i_71_++) {
                if (aBooleanArray2348[i_71_])
                    aByteArray2361[i_71_] = class68_sub14.method955(3390);
            }
            for (int i_72_ = 0; i_62_ > i_72_; i_72_++) {
                if (aBooleanArray2348[i_72_])
                    aShortArray2358[i_72_]
                            = (short) class68_sub14.readUnsignedWord(1355769544);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("pa.<init>("
                            + (class21 != null ? "{...}" : "null")
                            + ','
                            + (class21_60_ != null ? "{...}"
                            : "null")
                            + ','
                            + (class21_61_ != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + bool + ')'));
        }
    }

    static {
        anIntArray2335 = new int[128];
        aRSString_2354
                = RSString.newRsString("Lade Benutzeroberfl-=che )2 ");
        aRSString_2351 = null;
        aRSString_2355 = RSString.newRsString("p11_full");
    }
}
