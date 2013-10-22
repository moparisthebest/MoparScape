/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

public class Class44 {
    public static Class125 aClass125_742;
    public static RSString aRSString_743 = null;
    public static int anInt744;
    public static int anInt745;
    public Animable aClass1_746;
    public static int anInt747;
    public static int anInt748;
    public static int anInt749;
    public static int anInt750;
    public static int anInt751;
    public static int anInt752;
    public static int anInt753;
    public static int anInt754;
    public static Login aLogin_755 = new Login(128);

    public static void method484(byte i, int i_0_) {
        if (i > 6) {
            anInt745++;
            Class68_Sub20_Sub13.aClass98_4359.method1564(-18767, i_0_);
        }
    }

    public static void method485(int i) {
        anInt749++;
        if (i != -1)
            aRSString_743 = null;
        Class71_Sub1.method1345(-68, Class86.aCanvas1585);
        Class68_Sub20.method1007(Class86.aCanvas1585, true);
        if (RSString.aClass97_2261 != null)
            RSString.aClass97_2261.method1558(i + 101, Class86.aCanvas1585);
        Class1_Sub2.method71(-125);
        Class53.method545(Class86.aCanvas1585, 1611550343);
        Class72_Sub1.method1362(i + -88, Class86.aCanvas1585);
        if (RSString.aClass97_2261 != null)
            RSString.aClass97_2261.method1562(Class86.aCanvas1585, true);
        Class72.method1348(0);
        Class36.aLong644 = 0L;
    }

    public static void method486(RSString class100, byte i) {
        anInt752++;
        if ((Class68_Sub13_Sub13.anInt3663 ^ 0xffffffff) <= -3) {
            if (class100.method1600(false, Class75_Sub1_Sub1.aRSString_4581)) {
                GameSocket.method596(0);
                for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -11; i_1_++)
                    System.gc();
                Runtime runtime = Runtime.getRuntime();
                int i_2_
                        = (int) ((runtime.totalMemory() + -runtime.freeMemory())
                        / 1024L);
                Class48.method520(null, 14,
                        (Class68_Sub20_Sub13_Sub2.method1166
                                (2,
                                        (new RSString[]
                                                {Class68_Sub22.aRSString_3150,
                                                        Class68_Sub13_Sub24.method816(i_2_, 0),
                                                        Class54.aRSString_1030}))),
                        0);
            }
            if (class100.method1600(false, Class68_Sub10.aRSString_2900))
                Class72_Sub1.method1367((byte) -21);
            if (class100.method1600(false, Class68_Sub13_Sub37.aRSString_4072))
                Class17.method296(25, (byte) -98);
            if (class100.method1600(false, Class64.aRSString_1179))
                Class68_Sub22.aBoolean3134 = true;
            if (class100.method1600(false, Class68_Sub13_Sub34.aRSString_4004))
                Class68_Sub22.aBoolean3134 = false;
            if (class100.method1600(false, Class34.aRSString_595)) {
                for (int i_3_ = 0; i_3_ < 4; i_3_++) {
                    for (int i_4_ = 1; (i_4_ ^ 0xffffffff) > -104; i_4_++) {
                        for (int i_5_ = 1; i_5_ < 103; i_5_++)
                            Class109.aClass38Array1843[i_3_]
                                    .anIntArrayArray681[i_4_][i_5_]
                                    = 0;
                    }
                }
            }
            if (class100.method1589(Class50.aRSString_989, 95)
                    && Class75_Sub3.anInt3328 != 0)
                Class68_Sub8.method672(class100.method1615(6, true)
                        .method1619((byte) 16),
                        -47);
            if (class100.method1600(false, Class68_Sub13_Sub12.aRSString_3648)
                    && (Class75_Sub3.anInt3328 ^ 0xffffffff) == -3)
                throw new RuntimeException();
            if (class100.method1589(Class1_Sub1.aRSString_2411, 96)) {
                Class68_Sub20_Sub5.anInt4229
                        = class100.method1615(12, true).method1585(true)
                        .method1619((byte) -41);
                Class48.method520(null, 126,
                        (Class68_Sub20_Sub13_Sub2.method1166
                                (2, (new RSString[]
                                        {Class68_Sub13_Sub10.aRSString_3586,
                                                (Class68_Sub13_Sub24.method816
                                                        (Class68_Sub20_Sub5.anInt4229,
                                                                0))}))),
                        0);
            }
            if (class100.method1600(false, Class68_Sub20_Sub11.aRSString_4331))
                Class68_Sub20.aBoolean3094 = true;
        }
        if (i == 1) {
            Class68_Sub20_Sub5.anInt4224++;
            Class21renamed.stream.createFrame(107);
            Class21renamed.stream
                    .writeByte(-1 + class100.method1590((byte) -96));
            Class21renamed.stream
                    .writeString(class100.method1615(2, true));
        }
    }

    public static void method487(int i, int i_6_, byte i_7_, int i_8_,
                                 int i_9_, int i_10_) {
        anInt750++;
        int i_11_ = -i_10_ + i_6_;
        int i_12_ = i_8_ - i;
        if ((i_12_ ^ 0xffffffff) != -1) {
            if (i_11_ == 0) {
                Class15.method276(1, i_8_, i, i_9_, i_10_);
                return;
            }
        } else {
            if ((i_11_ ^ 0xffffffff) != -1)
                GameSocket.method595(-6, i, i_6_, i_9_, i_10_);
            return;
        }
        if ((i_11_ ^ 0xffffffff) > -1)
            i_11_ = -i_11_;
        if ((i_12_ ^ 0xffffffff) > -1)
            i_12_ = -i_12_;
        if (i_7_ > 29) {
            boolean bool = (i_11_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
            if (bool) {
                int i_13_ = i;
                i = i_10_;
                int i_14_ = i_8_;
                i_10_ = i_13_;
                i_8_ = i_6_;
                i_6_ = i_14_;
            }
            if (i > i_8_) {
                int i_15_ = i;
                int i_16_ = i_10_;
                i_10_ = i_6_;
                i = i_8_;
                i_8_ = i_15_;
                i_6_ = i_16_;
            }
            int i_17_ = i_8_ - i;
            int i_18_ = i_10_;
            int i_19_ = i_6_ + -i_10_;
            int i_20_ = -(i_17_ >> -783505855);
            int i_21_ = (i_6_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff) ? 1 : -1;
            if ((i_19_ ^ 0xffffffff) > -1)
                i_19_ = -i_19_;
            if (!bool) {
                for (int i_22_ = i; i_8_ >= i_22_; i_22_++) {
                    Class68_Sub22.anIntArrayArray3132[i_18_][i_22_] = i_9_;
                    i_20_ += i_19_;
                    if ((i_20_ ^ 0xffffffff) < -1) {
                        i_20_ -= i_17_;
                        i_18_ += i_21_;
                    }
                }
            } else {
                for (int i_23_ = i;
                     (i_23_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff); i_23_++) {
                    Class68_Sub22.anIntArrayArray3132[i_23_][i_18_] = i_9_;
                    i_20_ += i_19_;
                    if (i_20_ > 0) {
                        i_18_ += i_21_;
                        i_20_ -= i_17_;
                    }
                }
            }
        }
    }

    public static boolean method488(int i) {
        anInt754++;
        if (i >= -86)
            return true;
        long l = Class36.method438(17161);
        int i_24_ = (int) (l - ISAACRandomGen.aLong1495);
        if (i_24_ > 200)
            i_24_ = 200;
        Class16.anInt271 += i_24_;
        ISAACRandomGen.aLong1495 = l;
        if (Class22.anInt483 == 0
                && (Class68_Sub24.anInt3153 ^ 0xffffffff) == -1
                && Class128.anInt2227 == 0 && Class56.anInt1067 == 0)
            return true;
        if (Class68_Sub25.updateSocketCopy == null)
            return false;
        try {
            if (Class16.anInt271 > 30000)
                throw new IOException();
            while (Class68_Sub24.anInt3153 < 20) {
                if (Class56.anInt1067 <= 0)
                    break;
                Class68_Sub20_Sub15 class68_sub20_sub15
                        = ((Class68_Sub20_Sub15)
                        Class123.aClass113_2123.method1679(-32642));
                Stream class68_sub14 = new Stream(4);
                class68_sub14.writeByte(1);
                class68_sub14.method918((int) class68_sub20_sub15.aLong1218,
                        false);
                Class68_Sub25.updateSocketCopy.queueBytes(4, class68_sub14.buffer);
                Class68_Sub20_Sub13.aClass113_4366.method1677
                        ((byte) -21, class68_sub20_sub15,
                                class68_sub20_sub15.aLong1218);
                Class68_Sub24.anInt3153++;
                Class56.anInt1067--;
            }
            for (/**/; ((Class22.anInt483 ^ 0xffffffff) > -21
                    && Class128.anInt2227 > 0); Class22.anInt483++) {
                Class68_Sub20_Sub15 class68_sub20_sub15
                        = ((Class68_Sub20_Sub15)
                        Class68_Sub7.aClass128_2854.method1784(1742));
                Stream class68_sub14 = new Stream(4);
                class68_sub14.writeByte(0);
                class68_sub14.method918((int) class68_sub20_sub15.aLong1218,
                        false);
                Class68_Sub25.updateSocketCopy
                        .queueBytes(4, class68_sub14.buffer);
                class68_sub20_sub15.method1005((byte) 73);
                PacketParser.aClass113_1874.method1677((byte) -82,
                        class68_sub20_sub15,
                        (class68_sub20_sub15
                                .aLong1218));
                Class128.anInt2227--;
            }
            for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -101; i_25_++) {
                int i_26_ = Class68_Sub25.updateSocketCopy.available();
                if ((i_26_ ^ 0xffffffff) > -1)
                    throw new IOException();
                if (i_26_ == 0)
                    break;
                int i_27_ = 0;
                Class16.anInt271 = 0;
                if (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811 != null) {
                    if (Class47.anInt942 == 0)
                        i_27_ = 1;
                } else
                    i_27_ = 8;
                if ((i_27_ ^ 0xffffffff) < -1) {
                    int i_28_ = i_27_ + -Class74.aStream_1330.currentOffset;
                    if (i_28_ > i_26_)
                        i_28_ = i_26_;
                    Class68_Sub25.updateSocketCopy.flushInputStream(i_28_, Class74.aStream_1330.currentOffset, Class74.aStream_1330.buffer);
                    if (Unknown.aByte1615 != 0) {
                        for (int i_29_ = 0;
                             (i_29_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff);
                             i_29_++)
                            Class74.aStream_1330.buffer
                                    [i_29_ + Class74.aStream_1330.currentOffset]
                                    = (byte) (Class15.method278
                                    ((Class74.aStream_1330
                                            .buffer
                                            [i_29_ + (Class74
                                            .aStream_1330
                                            .currentOffset)]),
                                            Unknown.aByte1615));
                    }
                    Class74.aStream_1330.currentOffset += i_28_;
                    if (i_27_ > Class74.aStream_1330.currentOffset)
                        break;
                    if (Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811 == null) {
                        Class74.aStream_1330.currentOffset = 0;
                        int i_30_ = Class74.aStream_1330.readUnsignedByte(-6677);
                        int i_31_ = Class74.aStream_1330.readUnsignedWord(1355769544);
                        int i_32_ = Class74.aStream_1330.readUnsignedByte(-6677);
                        int i_33_ = Class74.aStream_1330.readDWord();
                        long l_34_ = (long) (i_31_ + (i_30_ << -2087565424));
                        Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) Class68_Sub20_Sub13.aClass113_4366.method1678(l_34_, 84));
                        Class109.aBoolean1838 = true;
                        if (class68_sub20_sub15 == null) {
                            class68_sub20_sub15
                                    = ((Class68_Sub20_Sub15)
                                    PacketParser.aClass113_1874.method1678(l_34_,
                                            101));
                            Class109.aBoolean1838 = false;
                        }
                        if (class68_sub20_sub15 == null)
                            throw new IOException();
                        Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811
                                = class68_sub20_sub15;
                        int i_35_ = i_32_ != 0 ? 9 : 5;
                        Class123.aStream_2128 = new Stream((Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811.aByte4391) + i_35_ + i_33_);
                        Class123.aStream_2128.writeByte(i_32_);
                        Class123.aStream_2128.writeDWord(i_33_);
                        Class74.aStream_1330.currentOffset = 0;
                        Class47.anInt942 = 8;
                    } else if ((Class47.anInt942 ^ 0xffffffff) == -1) {
                        if (Class74.aStream_1330.buffer[0]
                                == -1) {
                            Class47.anInt942 = 1;
                            Class74.aStream_1330.currentOffset = 0;
                        } else
                            Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811
                                    = null;
                    }
                } else {
                    int i_36_
                            = (Class123.aStream_2128.buffer.length
                            + -(Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811
                            .aByte4391));
                    int i_37_ = 512 - Class47.anInt942;
                    if ((i_36_ + -Class123.aStream_2128.currentOffset
                            ^ 0xffffffff)
                            > (i_37_ ^ 0xffffffff))
                        i_37_ = i_36_ - Class123.aStream_2128.currentOffset;
                    if ((i_26_ ^ 0xffffffff) > (i_37_ ^ 0xffffffff))
                        i_37_ = i_26_;
                    Class68_Sub25.updateSocketCopy.flushInputStream(i_37_, Class123.aStream_2128.currentOffset, Class123.aStream_2128.buffer);
                    if (Unknown.aByte1615 != 0) {
                        for (int i_38_ = 0;
                             (i_37_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff);
                             i_38_++)
                            Class123.aStream_2128.buffer
                                    [(i_38_
                                    + Class123.aStream_2128.currentOffset)]
                                    = (byte) (Class15.method278
                                    ((Class123.aStream_2128
                                            .buffer
                                            [i_38_ + (Class123
                                            .aStream_2128
                                            .currentOffset)]),
                                            Unknown.aByte1615));
                    }
                    Class123.aStream_2128.currentOffset += i_37_;
                    Class47.anInt942 += i_37_;
                    if (i_36_ == Class123.aStream_2128.currentOffset) {
                        if (((Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811
                                .aLong1218)
                                ^ 0xffffffffffffffffL)
                                != -16711936L) {
                            Class112.aCRC32_1887.reset();
                            Class112.aCRC32_1887.update((Class123
                                    .aStream_2128
                                    .buffer),
                                    0, i_36_);
                            int i_39_ = (int) Class112.aCRC32_1887.getValue();
                            if (i_39_
                                    != (Class68_Sub13_Sub22
                                    .aClass68_Sub20_Sub15_3811.anInt4392)) {
                                try {
                                    Class68_Sub25.updateSocketCopy
                                            .method594(-105);
                                } catch (Exception exception) {
                                    /* empty */
                                }
                                Class75_Sub1_Sub1.anInt4585++;
                                Class68_Sub25.updateSocketCopy = null;
                                Unknown.aByte1615
                                        = (byte) (int) (Math.random() * 255.0
                                        + 1.0);
                                return false;
                            }
                            Class75_Sub1_Sub1.anInt4585 = 0;
                            Class68_Sub10.anInt2909 = 0;
                            Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811
                                    .aClass21_Sub1_4394.method371
                                    (Class109.aBoolean1838,
                                            (0xff0000L & (Class68_Sub13_Sub22
                                                    .aClass68_Sub20_Sub15_3811
                                                    .aLong1218)
                                                    ^ 0xffffffffffffffffL) == -16711681L,
                                            (int) (0xffffL & (Class68_Sub13_Sub22
                                                    .aClass68_Sub20_Sub15_3811
                                                    .aLong1218)),
                                            125,
                                            Class123.aStream_2128.buffer);
                        } else {
                            Class50.aStream_979
                                    = Class123.aStream_2128;
                            for (int i_40_ = 0; i_40_ < 256; i_40_++) {
                                Class21_Sub1 class21_sub1
                                        = (Class68_Sub20.aClass21_Sub1Array3081
                                        [i_40_]);
                                if (class21_sub1 != null) {
                                    Class50.aStream_979.currentOffset
                                            = 8 * i_40_ + 5;
                                    int i_41_ = Class50.aStream_979.readDWord();
                                    int i_42_ = Class50.aStream_979.readDWord();
                                    class21_sub1.method368(i_42_, (byte) 102,
                                            i_41_);
                                }
                            }
                        }
                        Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811
                                .method647(-17554);
                        Class47.anInt942 = 0;
                        Class68_Sub13_Sub22.aClass68_Sub20_Sub15_3811 = null;
                        Class123.aStream_2128 = null;
                        if (!Class109.aBoolean1838)
                            Class22.anInt483--;
                        else
                            Class68_Sub24.anInt3153--;
                    } else {
                        if ((Class47.anInt942 ^ 0xffffffff) != -513)
                            break;
                        Class47.anInt942 = 0;
                    }
                }
            }
            return true;
        } catch (IOException ioexception) {
            try {
                Class68_Sub25.updateSocketCopy.method594(-89);
            } catch (Exception exception) {
                /* empty */
            }
            Class68_Sub25.updateSocketCopy = null;
            Class68_Sub10.anInt2909++;
            return false;
        }
    }

    public static void method489(boolean bool, int i, int i_43_,
                                 Class55 class117, boolean bool_44_,
                                 int i_45_) {
        anInt751++;
        if ((Class1_Sub2.anInt2435 ^ 0xffffffff) > -51
                && (class117.anIntArrayArray2034 != null
                && class117.anIntArrayArray2034.length > i
                && class117.anIntArrayArray2034[i] != null)) {
            if (bool != false)
                method488(105);
            int i_46_ = class117.anIntArrayArray2034[i][0];
            int i_47_ = i_46_ >> 125390056;
            if (class117.anIntArrayArray2034[i].length > 1) {
                int i_48_ = (int) (Math.random()
                        * (double) (class117.anIntArrayArray2034
                        [i]).length);
                if ((i_48_ ^ 0xffffffff) < -1)
                    i_47_ = class117.anIntArrayArray2034[i][i_48_];
            }
            int i_49_ = i_46_ & 0xf;
            int i_50_ = i_46_ >> -1746099356 & 0x7;
            if (i_49_ == 0) {
                if (bool_44_)
                    Class57.method575((byte) -124, 0, i_50_, i_47_);
            } else if (Class68_Sub20_Sub15.anInt4399 != 0) {
                Login.anIntArray1515[Class1_Sub2.anInt2435] = i_47_;
                PacketParser.anIntArray1876[Class1_Sub2.anInt2435] = i_50_;
                Class34.anIntArray596[Class1_Sub2.anInt2435] = 0;
                int i_51_ = (-64 + i_43_) / 128;
                Class3.aClass46Array80[Class1_Sub2.anInt2435] = null;
                int i_52_ = (i_45_ - 64) / 128;
                Class102.anIntArray1757[Class1_Sub2.anInt2435]
                        = i_49_ + ((i_51_ << -777582416) + (i_52_ << 60528936));
                Class1_Sub2.anInt2435++;
            }
        }
    }

    public static RSString method490(boolean bool, byte i, int i_53_) {
        anInt748++;
        if (i != 42)
            method494(126);
        return Class13_Sub1.method247(10, bool, (byte) 125, i_53_);
    }

    public static Class68_Sub20_Sub10 method491(int i, int i_54_, boolean bool,
                                                int i_55_, int i_56_,
                                                boolean bool_57_) {
        anInt744++;
        int i_58_ = i_54_;
        int i_59_ = ((i << -238182831) + i_55_
                + ((!bool_57_ ? 0 : 65536) + (i_56_ << -2123486893)));
        long l = (long) i_59_ * 3849834839L + 3147483667L * (long) i_58_;
        Class68_Sub20_Sub10 class68_sub20_sub10
                = (Class68_Sub20_Sub10) Class45.aClass98_918.method1570(14366, l);
        if (class68_sub20_sub10 != null)
            return class68_sub20_sub10;
        Class62.aBoolean1152 = false;
        class68_sub20_sub10
                = Class68_Sub13_Sub13.method757(bool, i_56_, -126, i_55_, bool_57_,
                i, false, i_54_);
        if (class68_sub20_sub10 != null && !Class62.aBoolean1152)
            Class45.aClass98_918.method1568(class68_sub20_sub10, 121, l);
        return class68_sub20_sub10;
    }

    public static void method492(int i) {
        anInt747++;
        int[] is = new int[Class14.anInt233];
        if (i == 4) {
            int i_60_ = 0;
            for (int i_61_ = 0; i_61_ < Class14.anInt233; i_61_++) {
                ItemDef class19 = Applet_Sub1.method18(-25672, i_61_);
                if ((class19.anInt390 ^ 0xffffffff) <= -1
                        || (class19.anInt387 ^ 0xffffffff) <= -1)
                    is[i_60_++] = i_61_;
            }
            Class68_Sub20_Sub13.anIntArray4367 = new int[i_60_];
            for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > (i_60_ ^ 0xffffffff);
                 i_62_++)
                Class68_Sub20_Sub13.anIntArray4367[i_62_] = is[i_62_];
        }
    }

    public static void method493(byte i) {
        anInt753++;
        Class68_Sub13_Sub2.aClass98_3459.method1566((byte) 94);
        Class75_Sub1_Sub1.aClass98_4577.method1566((byte) 94);
        if (i > -56)
            aClass125_742 = null;
    }

    public static void method494(int i) {
        aClass125_742 = null;
        aRSString_743 = null;
        if (i == 8412)
            aLogin_755 = null;
    }
}
