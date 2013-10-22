/* ItemDef - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemDef {
    public int anInt327 = 0;
    public static int anInt328;
    public int anInt329;
    public int anInt330;
    public int[][] anIntArrayArray331;
    public short[] aShortArray332;
    public static int anInt333;
    public byte[] aByteArray334;
    public static int anInt335;
    public int anInt336;
    public int anInt337;
    public int anInt338;
    public int anInt339;
    public RSString[] aRSStringArray340;
    public int anInt341 = 0;
    public short[] aShortArray342;
    public int[] anIntArray343;
    public int anInt344;
    public int anInt345;
    public static int anInt346;
    public int anInt347;
    public int anInt348 = 0;
    public int anInt349;
    public int anInt350;
    public static int anInt351;
    public int anInt352;
    public int[] anIntArray353;
    public static int anInt354;
    public int anInt355;
    public short[] aShortArray356;
    public short[] aShortArray357;
    public int anInt358;
    public static int anInt359;
    public int anInt360;
    public static int anInt361;
    public RSString aRSString_362;
    public int anInt363;
    public static int anInt364;
    public static int anInt365;
    public boolean aBoolean366;
    public static int anInt367;
    public static RSString aRSString_368
            = RSString.newRsString("Lade Konfiguration )2 ");
    public RSString[] aRSStringArray369;
    public int anInt370;
    public boolean aBoolean371;
    public static int anInt372;
    public static int anInt373;
    public int anInt374;
    public int anInt375;
    public static int[] anIntArray376 = new int[100];
    public int anInt377;
    public int anInt378;
    public static int anInt379;
    public int anInt380;
    public int anInt381;
    public static int anInt382;
    public int anInt383;
    public int anInt384;
    public int anInt385;
    public int anInt386;
    public int anInt387;
    public int anInt388;
    public int anInt389;
    public int anInt390;
    public int anInt391;
    public static int anInt392;
    public static int anInt393;
    public Class113 aClass113_394;
    public int anInt395;
    public static RSString aRSString_396 = RSString.newRsString("Fps:");
    public int anInt397;

    public int method303(int i, byte i_0_, int i_1_) {
        anInt354++;
        if (aClass113_394 == null)
            return i;
        if (i_0_ != -79)
            return -115;
        Class68_Sub10 class68_sub10
                = (Class68_Sub10) aClass113_394.method1678((long) i_1_, 115);
        if (class68_sub10 == null)
            return i;
        return class68_sub10.anInt2902;
    }

    public void method304(int i, byte i_2_, Stream class68_sub14) {
        anInt359++;
        if (i_2_ > -11)
            method315(-82);
        if (i == 1)
            anInt330 = class68_sub14.readUnsignedWord(1355769544);
        else if ((i ^ 0xffffffff) == -3)
            aRSString_362 = class68_sub14.readString(127);
        else if (i == 4)
            anInt336 = class68_sub14.readUnsignedWord(1355769544);
        else if (i == 5)
            anInt389 = class68_sub14.readUnsignedWord(1355769544);
        else {
            do {
                if (i != 6) {
                    if (i != 7) {
                        if (i != 8) {
                            if (i != 11) {
                                if (i == 12)
                                    anInt375 = class68_sub14.readDWord();
                                else if (i == 16) {
                                    aBoolean371 = true;
                                } else if (i != 23) {
                                    if (i == 24)
                                        anInt347 = class68_sub14.readUnsignedWord(1355769544);
                                    else if (i != 25) {
                                        if (i == 26)
                                            anInt344 = class68_sub14.readUnsignedWord(1355769544);
                                        else if (i < 30 || i >= 35) {
                                            if (i >= 35 && i < 40)
                                                aRSStringArray340[i + -35] = class68_sub14.readString(127);
                                            else if (i == 40) {
                                                int i_3_ = class68_sub14.readUnsignedByte(-6677);
                                                aShortArray342 = new short[i_3_];
                                                aShortArray332 = new short[i_3_];
                                                for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
                                                    aShortArray342[i_4_] = (short) (class68_sub14.readUnsignedWord(1355769544));
                                                    aShortArray332[i_4_] = (short) (class68_sub14.readUnsignedWord(1355769544));
                                                }
                                            } else if (i != 41) {
                                                if (i == 42) {
                                                    int i_5_ = (class68_sub14.readUnsignedByte(-6677));
                                                    aByteArray334 = new byte[i_5_];
                                                    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
                                                        aByteArray334[i_6_] = (class68_sub14.method955(3390));
                                                } else if (i != 65) {
                                                    if (i == 78)
                                                        anInt377 = (class68_sub14.readUnsignedWord(1355769544));
                                                    else if (i != 79) {
                                                        if (i != 90) {
                                                            if (i == 91)
                                                                anInt337 = (class68_sub14.readUnsignedWord(1355769544));
                                                            else if (i != 92) {
                                                                if (i == 93)
                                                                    anInt349 = (class68_sub14.readUnsignedWord(1355769544));
                                                                else if (i != 95) {
                                                                    if (i != 96) {
                                                                        if (i != 97) {
                                                                            if (i == 98)
                                                                                anInt385 = class68_sub14.readUnsignedWord(1355769544);
                                                                            else if (i >= 100 && i < 110) {
                                                                                if (anIntArray343 == null) {
                                                                                    anIntArray353 = new int[10];
                                                                                    anIntArray343 = new int[10];
                                                                                }
                                                                                anIntArray343[i + -100] = class68_sub14.readUnsignedWord(1355769544);
                                                                                anIntArray353[i + -100] = class68_sub14.readUnsignedWord(1355769544);
                                                                            } else if (i == 110)
                                                                                anInt397 = class68_sub14.readUnsignedWord(1355769544);
                                                                            else if (i == 111)
                                                                                anInt338 = class68_sub14.readUnsignedWord(1355769544);
                                                                            else if (i != 112) {
                                                                                if (i == 113)
                                                                                    anInt363 = class68_sub14.method955(3390);
                                                                                else if (i == 114)
                                                                                    anInt348 = 5 * class68_sub14.method955(3390);
                                                                                else if (i == 115)
                                                                                    anInt383 = class68_sub14.readUnsignedByte(-6677);
                                                                                else if (i == 121)
                                                                                    anInt345 = class68_sub14.readUnsignedWord(1355769544);
                                                                                else if (i == 122)
                                                                                    anInt339 = class68_sub14.readUnsignedWord(1355769544);
                                                                                else if (i != 124) {
                                                                                    if (i == 125) {
                                                                                        anInt352 = class68_sub14.method955(3390);
                                                                                        anInt370 = class68_sub14.method955(3390);
                                                                                        anInt384 = class68_sub14.method955(3390);
                                                                                    } else if (i != 126) {
                                                                                        if (i == 249) {
                                                                                            int i_7_ = class68_sub14.readUnsignedByte(-6677);
                                                                                            if (aClass113_394 == null) {
                                                                                                int i_8_ = Class90.method1517(i_7_, -21189);
                                                                                                aClass113_394 = new Class113(i_8_);
                                                                                            }
                                                                                            for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_9_++) {
                                                                                                boolean bool = class68_sub14.readUnsignedByte(-6677) == 1;
                                                                                                int i_10_ = class68_sub14.method921((byte) -96);
                                                                                                Class68 class68;
                                                                                                if (bool)
                                                                                                    class68 = new Class68_Sub5(class68_sub14.readString(127));
                                                                                                else
                                                                                                    class68 = new Class68_Sub10(class68_sub14.readDWord());
                                                                                                aClass113_394.method1677((byte) -57, class68, (long) i_10_);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        anInt374 = class68_sub14.method955(3390);
                                                                                        anInt327 = class68_sub14.method955(3390);
                                                                                        anInt360 = class68_sub14.method955(3390);
                                                                                    }
                                                                                } else {
                                                                                    if (anIntArrayArray331 == null)
                                                                                        anIntArrayArray331 = new int[11][];
                                                                                    int i_11_ = class68_sub14.readUnsignedByte(-6677);
                                                                                    anIntArrayArray331[i_11_] = new int[6];
                                                                                    for (int i_12_ = 0; i_12_ < 6; i_12_++)
                                                                                        anIntArrayArray331[i_11_][i_12_] = class68_sub14.method957(-22489);
                                                                                }
                                                                            } else
                                                                                anInt386 = class68_sub14.readUnsignedWord(1355769544);
                                                                        } else
                                                                            anInt378 = class68_sub14.readUnsignedWord(1355769544);
                                                                    } else
                                                                        anInt341
                                                                                = class68_sub14.readUnsignedByte(-6677);
                                                                } else
                                                                    anInt355
                                                                            = (class68_sub14.readUnsignedWord
                                                                            (1355769544));
                                                            } else
                                                                anInt329
                                                                        = (class68_sub14
                                                                        .readUnsignedWord
                                                                                (1355769544));
                                                        } else
                                                            anInt388
                                                                    = (class68_sub14
                                                                    .readUnsignedWord
                                                                            (1355769544));
                                                    } else
                                                        anInt380
                                                                = (class68_sub14
                                                                .readUnsignedWord
                                                                        (1355769544));
                                                } else
                                                    aBoolean366 = true;
                                            } else {
                                                int i_13_
                                                        = class68_sub14
                                                        .readUnsignedByte(-6677);
                                                aShortArray357
                                                        = new short[i_13_];
                                                aShortArray356
                                                        = new short[i_13_];
                                                for (int i_14_ = 0;
                                                     i_14_ < i_13_; i_14_++) {
                                                    aShortArray357[i_14_]
                                                            = (short) (class68_sub14
                                                            .readUnsignedWord
                                                                    (1355769544));
                                                    aShortArray356[i_14_]
                                                            = (short) (class68_sub14
                                                            .readUnsignedWord
                                                                    (1355769544));
                                                }
                                            }
                                        } else {
                                            aRSStringArray369[-30 + i]
                                                    = class68_sub14.readString(127);
                                            if (aRSStringArray369[i - 30]
                                                    .method1600
                                                            (false,
                                                                    Class13_Sub2.aRSString_2647))
                                                aRSStringArray369[-30 + i]
                                                        = null;
                                        }
                                    } else
                                        anInt387 = class68_sub14
                                                .readUnsignedWord(1355769544);
                                } else
                                    anInt390
                                            = class68_sub14.readUnsignedWord(1355769544);
                            } else
                                anInt381 = 1;
                        } else {
                            anInt391 = class68_sub14.readUnsignedWord(1355769544);
                            if ((anInt391 ^ 0xffffffff) < -32768)
                                anInt391 -= 65536;
                        }
                    } else {
                        anInt358 = class68_sub14.readUnsignedWord(1355769544);
                        if (anInt358 <= 32767)
                            break;
                        anInt358 -= 65536;
                    }
                    break;
                }
                anInt395 = class68_sub14.readUnsignedWord(1355769544);
            } while (false);
        }
    }

    public Class1_Sub3_Sub1 method305(int i) {
        Class1_Sub4 class1_sub4
                = Class1_Sub4.method115(Class68_Sub26.aClass21_3191, anInt330, 0);
        anInt364++;
        if (class1_sub4 == null)
            return null;
        if (aShortArray342 != null) {
            for (int i_15_ = 0;
                 (i_15_ ^ 0xffffffff) > (aShortArray342.length ^ 0xffffffff);
                 i_15_++) {
                if (aByteArray334 == null
                        || (i_15_ ^ 0xffffffff) <= (aByteArray334.length
                        ^ 0xffffffff))
                    class1_sub4.method129(aShortArray342[i_15_],
                            aShortArray332[i_15_]);
                else
                    class1_sub4.method129(aShortArray342[i_15_],
                            (Class68_Sub20_Sub7.aShortArray4266
                                    [aByteArray334[i_15_] & 0xff]));
            }
        }
        if (aShortArray357 != null) {
            for (int i_16_ = 0;
                 (i_16_ ^ 0xffffffff) > (aShortArray357.length ^ 0xffffffff);
                 i_16_++)
                class1_sub4.method110(aShortArray357[i_16_],
                        aShortArray356[i_16_]);
        }
        Class1_Sub3_Sub1 class1_sub3_sub1
                = class1_sub4.method118(anInt363 + 64, 768 + anInt348, i, -10,
                -50);
        if (anInt397 != 128 || anInt338 != 128 || anInt386 != 128)
            class1_sub3_sub1.method72(anInt397, anInt338, anInt386);
        return class1_sub3_sub1;
    }

    public void method306(byte i, ItemDef class19_17_, ItemDef class19_18_) {
        try {
            anInt381 = 1;
            anInt330 = class19_18_.anInt330;
            aShortArray357 = class19_18_.aShortArray357;
            anInt391 = class19_18_.anInt391;
            anInt358 = class19_18_.anInt358;
            anInt351++;
            aShortArray342 = class19_18_.aShortArray342;
            anInt395 = class19_18_.anInt395;
            aShortArray356 = class19_18_.aShortArray356;
            anInt355 = class19_18_.anInt355;
            anInt375 = class19_17_.anInt375;
            aShortArray332 = class19_18_.aShortArray332;
            anInt336 = class19_18_.anInt336;
            aBoolean371 = class19_17_.aBoolean371;
            aByteArray334 = class19_18_.aByteArray334;
            aRSString_362 = class19_17_.aRSString_362;
            if (i <= -62)
                anInt389 = class19_18_.anInt389;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception, ("cf.O(" + i + ','
                    + (class19_17_ != null
                    ? "{...}" : "null")
                    + ','
                    + (class19_18_ != null
                    ? "{...}" : "null")
                    + ')'));
        }
    }

    public void method307(int i) {
        anInt333++;
        if (i != 1)
            aShortArray356 = null;
    }

    public boolean method308(boolean bool, int i) {
        anInt328++;
        int i_19_ = anInt390;
        int i_20_ = anInt347;
        if (i != -116)
            return false;
        int i_21_ = anInt377;
        if (bool) {
            i_20_ = anInt344;
            i_21_ = anInt380;
            i_19_ = anInt387;
        }
        if (i_19_ == -1)
            return true;
        boolean bool_22_ = true;
        if (!Class68_Sub26.aClass21_3191.method344(i_19_, 0, (byte) -127))
            bool_22_ = false;
        if (i_20_ != -1
                && !Class68_Sub26.aClass21_3191.method344(i_20_, 0, (byte) -107))
            bool_22_ = false;
        if (i_21_ != -1
                && !Class68_Sub26.aClass21_3191.method344(i_21_, 0, (byte) -125))
            bool_22_ = false;
        return bool_22_;
    }

    public void method309(byte i, Stream class68_sub14) {
        for (; ; ) {
            int i_23_ = class68_sub14.readUnsignedByte(-6677);
            if (i_23_ == 0)
                break;
            method304(i_23_, (byte) -39, class68_sub14);
        }
        if (i != -7)
            anInt395 = -16;
        anInt392++;
    }

    public boolean method310(boolean bool, byte i) {
        if (i != 75)
            return false;
        int i_24_ = anInt388;
        int i_25_ = anInt329;
        if (bool) {
            i_24_ = anInt337;
            i_25_ = anInt349;
        }
        anInt372++;
        if (i_24_ == -1)
            return true;
        boolean bool_26_ = true;
        if (!Class68_Sub26.aClass21_3191.method344(i_24_, 0, (byte) -105))
            bool_26_ = false;
        if (i_25_ != -1
                && !Class68_Sub26.aClass21_3191.method344(i_25_, 0, (byte) -128))
            bool_26_ = false;
        return bool_26_;
    }

    public void method311(ItemDef class19_27_, int i, ItemDef class19_28_) {
        try {
            anInt383 = class19_28_.anInt383;
            anInt329 = class19_28_.anInt329;
            anInt349 = class19_28_.anInt349;
            anInt370 = class19_28_.anInt370;
            anInt358 = class19_27_.anInt358;
            anInt387 = class19_28_.anInt387;
            anInt389 = class19_27_.anInt389;
            anInt375 = 0;
            anInt330 = class19_27_.anInt330;
            anInt388 = class19_28_.anInt388;
            aRSStringArray369 = class19_28_.aRSStringArray369;
            anInt384 = class19_28_.anInt384;
            anInt374 = class19_28_.anInt374;
            aShortArray342 = class19_28_.aShortArray342;
            anInt377 = class19_28_.anInt377;
            anInt360 = class19_28_.anInt360;
            anInt327 = class19_28_.anInt327;
            aShortArray356 = class19_28_.aShortArray356;
            if (i != -50)
                method308(true, -108);
            anInt337 = class19_28_.anInt337;
            anInt355 = class19_27_.anInt355;
            aShortArray332 = class19_28_.aShortArray332;
            aRSString_362 = class19_28_.aRSString_362;
            anInt352 = class19_28_.anInt352;
            anInt347 = class19_28_.anInt347;
            aClass113_394 = class19_28_.aClass113_394;
            anInt391 = class19_27_.anInt391;
            anInt344 = class19_28_.anInt344;
            anInt361++;
            aShortArray357 = class19_28_.aShortArray357;
            anInt395 = class19_27_.anInt395;
            anInt336 = class19_27_.anInt336;
            aRSStringArray340 = new RSString[5];
            anInt380 = class19_28_.anInt380;
            aByteArray334 = class19_28_.aByteArray334;
            anInt390 = class19_28_.anInt390;
            aBoolean371 = class19_28_.aBoolean371;
            if (class19_28_.aRSStringArray340 != null) {
                for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -5; i_29_++)
                    aRSStringArray340[i_29_]
                            = class19_28_.aRSStringArray340[i_29_];
            }
            aRSStringArray340[4] = Class68_Sub20_Sub13_Sub2.aRSString_4624;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception, ("cf.I("
                    + (class19_27_ != null
                    ? "{...}" : "null")
                    + ',' + i + ','
                    + (class19_28_ != null
                    ? "{...}" : "null")
                    + ')'));
        }
    }

    public RSString method312(RSString class100, byte i, int i_30_) {
        anInt346++;
        if (aClass113_394 == null)
            return class100;
        if (i != 21)
            method314(23, 81);
        Class68_Sub5 class68_sub5
                = (Class68_Sub5) aClass113_394.method1678((long) i_30_, -123);
        if (class68_sub5 == null)
            return class100;
        return class68_sub5.aRSString_2830;
    }

    public static void method313(int i) {
        aRSString_368 = null;
        aRSString_396 = null;
        if (i != -1)
            aRSString_368 = null;
        anIntArray376 = null;
    }

    public static void method314(int i, int i_31_) {
        anInt367++;
        if ((i_31_ ^ 0xffffffff) != 0 && GameSocket.aBooleanArray1142[i_31_]) {
            client.aClass21_2380.method341(i_31_, i ^ i);
            if (Class68_Sub13_Sub36.aClass45ArrayArray4040[i_31_] != null) {
                boolean bool = true;
                for (int i_32_ = 0;
                     (Class68_Sub13_Sub36.aClass45ArrayArray4040[i_31_].length
                             > i_32_);
                     i_32_++) {
                    if ((Class68_Sub13_Sub36.aClass45ArrayArray4040[i_31_]
                            [i_32_])
                            != null) {
                        if ((Class68_Sub13_Sub36.aClass45ArrayArray4040[i_31_]
                                [i_32_].anInt896)
                                != 2)
                            Class68_Sub13_Sub36.aClass45ArrayArray4040
                                    [i_31_][i_32_]
                                    = null;
                        else
                            bool = false;
                    }
                }
                if (bool)
                    Class68_Sub13_Sub36.aClass45ArrayArray4040[i_31_] = null;
                GameSocket.aBooleanArray1142[i_31_] = false;
            }
        }
    }

    public static void method315(int i) {
        int i_33_ = -75 / ((-68 - i) / 45);
        anInt335++;
        synchronized (Class63.anObject1169) {
            if ((Class9.anInt169 ^ 0xffffffff) != -1) {
                Class9.anInt169 = 1;
                try {
                    Class63.anObject1169.wait();
                } catch (InterruptedException interruptedexception) {
                    /* empty */
                }
            }
        }
    }

    public Class1_Sub4 method316(int i, boolean bool) {
        if (i != -31779)
            return null;
        int i_34_ = anInt388;
        anInt382++;
        int i_35_ = anInt329;
        if (bool) {
            i_34_ = anInt337;
            i_35_ = anInt349;
        }
        if ((i_34_ ^ 0xffffffff) == 0)
            return null;
        Class1_Sub4 class1_sub4
                = Class1_Sub4.method115(Class68_Sub26.aClass21_3191, i_34_, 0);
        if ((i_35_ ^ 0xffffffff) != 0) {
            Class1_Sub4 class1_sub4_36_
                    = Class1_Sub4.method115(Class68_Sub26.aClass21_3191, i_35_, 0);
            Class1_Sub4[] class1_sub4s = {class1_sub4, class1_sub4_36_};
            class1_sub4 = new Class1_Sub4(class1_sub4s, 2);
        }
        if (aShortArray342 != null) {
            for (int i_37_ = 0; i_37_ < aShortArray342.length; i_37_++)
                class1_sub4.method129(aShortArray342[i_37_],
                        aShortArray332[i_37_]);
        }
        if (aShortArray357 != null) {
            for (int i_38_ = 0;
                 (i_38_ ^ 0xffffffff) > (aShortArray357.length ^ 0xffffffff);
                 i_38_++)
                class1_sub4.method110(aShortArray357[i_38_],
                        aShortArray356[i_38_]);
        }
        return class1_sub4;
    }

    public ItemDef method317(int i, int i_39_) {
        anInt379++;
        if (i_39_ != -126)
            method303(109, (byte) 24, -67);
        if (anIntArray343 != null && (i ^ 0xffffffff) < -2) {
            int i_40_ = -1;
            for (int i_41_ = 0; (i_41_ ^ 0xffffffff) > -11; i_41_++) {
                if ((anIntArray353[i_41_] ^ 0xffffffff) >= (i ^ 0xffffffff)
                        && (anIntArray353[i_41_] ^ 0xffffffff) != -1)
                    i_40_ = anIntArray343[i_41_];
            }
            if (i_40_ != -1)
                return Applet_Sub1.method18(-25672, i_40_);
        }
        return this;
    }

    public Class1_Sub3 method318(int i, Class55 class117, int i_42_,
                                 int i_43_) {
        anInt393++;
        if (i_43_ != 13895)
            anInt381 = 83;
        if (anIntArray343 != null && i > 1) {
            int i_44_ = -1;
            for (int i_45_ = 0; i_45_ < 10; i_45_++) {
                if ((i ^ 0xffffffff) <= (anIntArray353[i_45_] ^ 0xffffffff)
                        && (anIntArray353[i_45_] ^ 0xffffffff) != -1)
                    i_44_ = anIntArray343[i_45_];
            }
            if (i_44_ != -1)
                return Applet_Sub1.method18(-25672, i_44_)
                        .method318(1, class117, i_42_, 13895);
        }
        Class1_Sub3 class1_sub3
                = ((Class1_Sub3)
                Class123.aClass98_2129.method1570(14366, (long) anInt350));
        if (class1_sub3 == null) {
            Class1_Sub4 class1_sub4
                    = Class1_Sub4.method115(Class68_Sub26.aClass21_3191, anInt330,
                    0);
            if (class1_sub4 == null)
                return null;
            if (aShortArray342 != null) {
                for (int i_46_ = 0; i_46_ < aShortArray342.length; i_46_++) {
                    if (aByteArray334 != null
                            && (i_46_ ^ 0xffffffff) > (aByteArray334.length
                            ^ 0xffffffff))
                        class1_sub4.method129(aShortArray342[i_46_],
                                (Class68_Sub20_Sub7
                                        .aShortArray4266
                                        [0xff & aByteArray334[i_46_]]));
                    else
                        class1_sub4.method129(aShortArray342[i_46_],
                                aShortArray332[i_46_]);
                }
            }
            if (aShortArray357 != null) {
                for (int i_47_ = 0;
                     ((i_47_ ^ 0xffffffff)
                             > (aShortArray357.length ^ 0xffffffff));
                     i_47_++)
                    class1_sub4.method110(aShortArray357[i_47_],
                            aShortArray356[i_47_]);
            }
            class1_sub3 = class1_sub4.method127(anInt363 + 64, anInt348 + 768,
                    -50, -10, -50);
            if ((anInt397 ^ 0xffffffff) != -129
                    || (anInt338 ^ 0xffffffff) != -129 || anInt386 != 128)
                class1_sub3.method72(anInt397, anInt338, anInt386);
            class1_sub3.aBoolean2443 = true;
            Class123.aClass98_2129.method1568(class1_sub3, i_43_ + -13790,
                    (long) anInt350);
        }
        if (class117 != null)
            class1_sub3 = class117.method1722((byte) -127, class1_sub3, i_42_);
        return class1_sub3;
    }

    public Class1_Sub4 method319(boolean bool, byte i) {
        int i_48_ = anInt390;
        anInt373++;
        int i_49_ = anInt347;
        int i_50_ = anInt377;
        if (bool) {
            i_48_ = anInt387;
            i_49_ = anInt344;
            i_50_ = anInt380;
        }
        if ((i_48_ ^ 0xffffffff) == 0)
            return null;
        Class1_Sub4 class1_sub4
                = Class1_Sub4.method115(Class68_Sub26.aClass21_3191, i_48_, 0);
        if ((i_49_ ^ 0xffffffff) != 0) {
            Class1_Sub4 class1_sub4_51_
                    = Class1_Sub4.method115(Class68_Sub26.aClass21_3191, i_49_, 0);
            if (i_50_ == -1) {
                Class1_Sub4[] class1_sub4s = {class1_sub4, class1_sub4_51_};
                class1_sub4 = new Class1_Sub4(class1_sub4s, 2);
            } else {
                Class1_Sub4 class1_sub4_52_
                        = Class1_Sub4.method115(Class68_Sub26.aClass21_3191, i_50_,
                        0);
                Class1_Sub4[] class1_sub4s
                        = {class1_sub4, class1_sub4_51_, class1_sub4_52_};
                class1_sub4 = new Class1_Sub4(class1_sub4s, 3);
            }
        }
        int i_53_ = 39 / ((i - 47) / 52);
        if (!bool && (anInt352 != 0 || (anInt370 ^ 0xffffffff) != -1
                || anInt384 != 0))
            class1_sub4.method128(anInt352, anInt370, anInt384);
        if (bool && (anInt374 != 0 || (anInt327 ^ 0xffffffff) != -1
                || anInt360 != 0))
            class1_sub4.method128(anInt374, anInt327, anInt360);
        if (aShortArray342 != null) {
            for (int i_54_ = 0;
                 (aShortArray342.length ^ 0xffffffff) < (i_54_ ^ 0xffffffff);
                 i_54_++)
                class1_sub4.method129(aShortArray342[i_54_],
                        aShortArray332[i_54_]);
        }
        if (aShortArray357 != null) {
            for (int i_55_ = 0;
                 (i_55_ ^ 0xffffffff) > (aShortArray357.length ^ 0xffffffff);
                 i_55_++)
                class1_sub4.method110(aShortArray357[i_55_],
                        aShortArray356[i_55_]);
        }
        return class1_sub4;
    }

    public ItemDef() {
        anInt338 = 128;
        anInt344 = -1;
        anInt336 = 2000;
        anInt339 = -1;
        aBoolean366 = false;
        anInt345 = -1;
        aBoolean371 = false;
        aRSStringArray369
                = new RSString[]{null, null, Class68_Sub13_Sub24.aRSString_3834,
                null, null};
        anInt349 = -1;
        anInt337 = -1;
        aRSStringArray340 = new RSString[]{null, null, null, null,
                Class122.aRSString_2112};
        anInt360 = 0;
        anInt329 = -1;
        anInt377 = -1;
        anInt347 = -1;
        anInt355 = 0;
        anInt378 = -1;
        anInt381 = 0;
        anInt374 = 0;
        aRSString_362 = Class68_Sub7.aRSString_2858;
        anInt363 = 0;
        anInt389 = 0;
        anInt358 = 0;
        anInt352 = 0;
        anInt380 = -1;
        anInt390 = -1;
        anInt370 = 0;
        anInt391 = 0;
        anInt386 = 128;
        anInt388 = -1;
        anInt375 = 1;
        anInt384 = 0;
        anInt387 = -1;
        anInt383 = 0;
        anInt385 = -1;
        anInt395 = 0;
        anInt397 = 128;
    }
}
