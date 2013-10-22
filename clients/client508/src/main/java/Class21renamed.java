/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class21renamed {
    public static int anInt422;
    public static int anInt423;
    public static int anInt424;
    public int[][] anIntArrayArray425;
    public boolean aBoolean426;
    public Class109[] aClass109Array427;
    public int anInt428;
    public static int anInt429;
    public static int anInt430;
    public static int anInt431;
    public static int anInt432;
    public int[][] anIntArrayArray433;
    public static int anInt434;
    public Object[] anObjectArray435;
    public static int anInt436;
    public static int anInt437;
    public static int anInt438;
    public int[] anIntArray439;
    public static int anInt440;
    public int[] anIntArray441;
    public static int anInt442;
    public static int anInt443;
    public Class109 aClass109_444;
    public static int anInt445;
    public static int anInt446;
    public boolean aBoolean447;
    public int[] anIntArray448;
    public static int anInt449;
    public static int anInt450;
    public static int anInt451;
    public static int anInt452;
    public static int anInt453;
    public int anInt454;
    public static int anInt455;
    public static int anInt456;
    public Object[][] anObjectArrayArray457;
    public static int anInt458;
    public static Class21_Sub1 aClass21_Sub1_459;
    public static int anInt460;
    public static int anInt461;
    public static int anInt462;
    public static int anInt463;
    public static int anInt464;
    public static int anInt465;
    public static PacketStream stream
            = new PacketStream(5000);
    public static int anInt467;
    public int[] anIntArray468;
    public static int anInt469;
    public static int anInt470;
    public static int anInt471;
    public static Class21_Sub1 aClass21_Sub1_472;
    public static int anInt473;
    public int[] anIntArray474;
    public int[] anIntArray475;
    public static long aLong476;
    public static RSString aRSString_477 = RSString.newRsString("Okay");
    public static RSString aRSString_478;
    public static int anInt479;
    public static int anInt480 = 0;

    public static Class92[] method328(int i) {
        anInt460++;
        Class92[] class92s = new Class92[Stream.anInt3007];
        for (int i_0_ = 0; Stream.anInt3007 > i_0_; i_0_++)
            class92s[i_0_]
                    = new Class92_Sub1(Class97.anInt1703,
                    Class68_Sub20_Sub15.anInt4405,
                    Class4.anIntArray96[i_0_],
                    Class116.anIntArray1996[i_0_],
                    Class68_Sub13_Sub12.anIntArray3639[i_0_],
                    Class68_Sub13_Sub19.anIntArray3757[i_0_],
                    Class69.aByteArrayArray1240[i_0_],
                    Class68_Sub13_Sub17.anIntArray3719);
        Class87.method1487((byte) -93);
        if (i != 32568)
            method348(null, (byte) -128, null);
        return class92s;
    }

    public static void method329(int i) {
        int i_1_ = 54 % ((i - 65) / 36);
        System.out.println
                ("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        anInt462++;
        System.exit(1);
    }

    public void method330(RSString class100, int i) {
        class100 = class100.method1608((byte) -109);
        anInt461++;
        int i_2_ = 58 / ((68 - i) / 42);
        int i_3_ = aClass109_444.method1657(class100.method1603(5745), -1);
        method334(i_3_, (byte) 113);
    }

    public void method331(byte i, int i_4_) {
        if (i < -103)
            anInt440++;
    }

    public int method332(int i, int i_5_) {
        anInt458++;
        if (!method346(i_5_, i))
            return 0;
        if (anObjectArray435[i_5_] != null)
            return 100;
        return 0;
    }

    public boolean method333(byte i, int i_6_) {
        anInt452++;
        if (!method346(i_6_, 0))
            return false;
        if (anObjectArray435[i_6_] != null)
            return true;
        method331((byte) -107, i_6_);
        if (anObjectArray435[i_6_] != null)
            return true;
        int i_7_ = 105 / ((-74 - i) / 40);
        return false;
    }

    public void method334(int i, byte i_8_) {
        anInt469++;
        if (i_8_ <= 84)
            anIntArrayArray425 = null;
    }

    public int method335(RSString class100, byte i) {
        class100 = class100.method1608((byte) 104);
        anInt432++;
        if (i >= -81)
            anInt454 = -45;
        int i_9_ = aClass109_444.method1657(class100.method1603(5745), -1);
        if (!method346(i_9_, 0))
            return -1;
        return i_9_;
    }

    public boolean method336(int i, int[] is, int i_10_) {
        anInt431++;
        if (!method346(i_10_, 0))
            return false;
        if (anObjectArray435[i_10_] == null)
            return false;
        int[] is_11_ = anIntArrayArray433[i_10_];
        boolean bool = true;
        int i_12_ = anIntArray441[i_10_];
        if (anObjectArrayArray457[i_10_] == null)
            anObjectArrayArray457[i_10_] = new Object[anIntArray448[i_10_]];
        Object[] objects = anObjectArrayArray457[i_10_];
        for (int i_13_ = 0; (i_12_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff);
             i_13_++) {
            int i_14_;
            if (is_11_ != null)
                i_14_ = is_11_[i_13_];
            else
                i_14_ = i_13_;
            if (objects[i_14_] == null) {
                bool = false;
                break;
            }
        }
        if (bool)
            return true;
        int i_15_ = -124 % ((i - 9) / 44);
        byte[] is_16_;
        if (is == null
                || ((is[0] ^ 0xffffffff) == -1 && (is[1] ^ 0xffffffff) == -1
                && (is[2] ^ 0xffffffff) == -1 && (is[3] ^ 0xffffffff) == -1))
            is_16_
                    = Animable.method53(false, (byte) -4, anObjectArray435[i_10_]);
        else {
            is_16_ = Animable.method53(true, (byte) -4, anObjectArray435[i_10_]);
            Stream class68_sub14 = new Stream(is_16_);
            class68_sub14.method946(is, 5, class68_sub14.buffer.length,
                    (byte) 102);
        }
        byte[] is_17_;
        try {
            is_17_ = RSString.method1612(is_16_, true);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("T3 - " + (is != null) + "," + i_10_
                            + "," + is_16_.length + ","
                            + Class72.method1357(is_16_.length, -1,
                            is_16_)
                            + ","
                            + Class72.method1357(is_16_.length + -2,
                            -1, is_16_)
                            + "," + anIntArray468[i_10_] + ","
                            + anInt428));
        }
        if (aBoolean426)
            anObjectArray435[i_10_] = null;
        if ((i_12_ ^ 0xffffffff) < -2) {
            int i_18_ = is_17_.length;
            int i_19_ = is_17_[--i_18_] & 0xff;
            Stream class68_sub14 = new Stream(is_17_);
            i_18_ -= i_19_ * (i_12_ * 4);
            class68_sub14.currentOffset = i_18_;
            int[] is_20_ = new int[i_12_];
            for (int i_21_ = 0; i_19_ > i_21_; i_21_++) {
                int i_22_ = 0;
                for (int i_23_ = 0;
                     (i_12_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
                    i_22_ += class68_sub14.readDWord();
                    is_20_[i_23_] += i_22_;
                }
            }
            byte[][] is_24_ = new byte[i_12_][];
            for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff);
                 i_25_++) {
                is_24_[i_25_] = new byte[is_20_[i_25_]];
                is_20_[i_25_] = 0;
            }
            int i_26_ = 0;
            class68_sub14.currentOffset = i_18_;
            for (int i_27_ = 0; (i_19_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff);
                 i_27_++) {
                int i_28_ = 0;
                for (int i_29_ = 0; i_29_ < i_12_; i_29_++) {
                    i_28_ += class68_sub14.readDWord();
                    Class39.method465(is_17_, i_26_, is_24_[i_29_],
                            is_20_[i_29_], i_28_);
                    i_26_ += i_28_;
                    is_20_[i_29_] += i_28_;
                }
            }
            for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff);
                 i_30_++) {
                int i_31_;
                if (is_11_ != null)
                    i_31_ = is_11_[i_30_];
                else
                    i_31_ = i_30_;
                if (!aBoolean447)
                    objects[i_31_]
                            = Class120.method1739(false, (byte) -2, is_24_[i_30_]);
                else
                    objects[i_31_] = is_24_[i_30_];
            }
        } else {
            int i_32_;
            if (is_11_ != null)
                i_32_ = is_11_[0];
            else
                i_32_ = 0;
            if (!aBoolean447)
                objects[i_32_]
                        = Class120.method1739(false, (byte) -128, is_17_);
            else
                objects[i_32_] = is_17_;
        }
        return true;
    }

    public int method337(int i) {
        anInt471++;
        if (i != 0)
            return -124;
        return anIntArray448.length;
    }

    public byte[] method338(int i, int i_33_, int i_34_) {
        if (i_33_ != 0)
            anIntArray448 = null;
        anInt442++;
        return method350(null, i_34_, i, (byte) -91);
    }

    public static RSString method339(int i, int i_35_) {
        anInt445++;
        RSString class100 = new RSString();
        if (i != -18982)
            return null;
        class100.bytes = new byte[i_35_];
        class100.anInt2293 = 0;
        return class100;
    }

    public boolean method340(byte i, int i_36_, int i_37_) {
        anInt467++;
        int i_38_ = -92 / ((9 - i) / 43);
        if ((i_36_ ^ 0xffffffff) > -1 || i_37_ < 0
                || anIntArray448.length <= i_36_
                || (i_37_ ^ 0xffffffff) <= (anIntArray448[i_36_] ^ 0xffffffff)) {
            if (!Class68_Sub13_Sub17.aBoolean3711)
                return false;
            throw new IllegalArgumentException(String.valueOf(i_36_) + ","
                    + i_37_);
        }
        return true;
    }

    public void method341(int i, int i_39_) {
        anInt464++;
        if (method346(i, i_39_))
            anObjectArrayArray457[i] = null;
    }

    public void method342(boolean bool, byte i, boolean bool_40_) {
        if (bool) {
            anIntArray475 = null;
            aClass109_444 = null;
        }
        if (i == 113) {
            if (bool_40_) {
                anIntArrayArray425 = null;
                aClass109Array427 = null;
            }
            anInt473++;
        }
    }

    public byte[] method343(int i, int i_41_, int i_42_) {
        if (i_41_ != 14281)
            method345(false, -94);
        anInt424++;
        if (!method340((byte) 115, i_42_, i))
            return null;
        if (anObjectArrayArray457[i_42_] == null
                || anObjectArrayArray457[i_42_][i] == null) {
            boolean bool = method336(i_41_ + -14355, null, i_42_);
            if (!bool) {
                method331((byte) -124, i_42_);
                bool = method336(i_41_ + -14194, null, i_42_);
                if (!bool)
                    return null;
            }
        }
        byte[] is = Animable.method53(false, (byte) -4,
                anObjectArrayArray457[i_42_][i]);
        return is;
    }

    public boolean method344(int i, int i_43_, byte i_44_) {
        anInt463++;
        if (!method340((byte) -81, i, i_43_))
            return false;
        if (anObjectArrayArray457[i] != null
                && anObjectArrayArray457[i][i_43_] != null)
            return true;
        if (i_44_ >= -92)
            return false;
        if (anObjectArray435[i] != null)
            return true;
        method331((byte) -107, i);
        if (anObjectArray435[i] != null)
            return true;
        return false;
    }

    public int[] method345(boolean bool, int i) {
        anInt446++;
        if (bool != false)
            anInt480 = 56;
        if (!method346(i, 0))
            return null;
        int[] is = anIntArrayArray433[i];
        if (is == null) {
            is = new int[anIntArray441[i]];
            for (int i_45_ = 0;
                 (i_45_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_45_++)
                is[i_45_] = i_45_;
        }
        return is;
    }

    public boolean method346(int i, int i_46_) {
        anInt450++;
        if (i < i_46_ || anIntArray448.length <= i
                || (anIntArray448[i] ^ 0xffffffff) == -1) {
            if (Class68_Sub13_Sub17.aBoolean3711)
                throw new IllegalArgumentException(Integer.toString(i));
            return false;
        }
        return true;
    }

    public boolean method347(byte i, RSString class100) {
        anInt422++;
        class100 = class100.method1608((byte) 95);
        int i_47_ = aClass109_444.method1657(class100.method1603(5745), -1);
        if ((i_47_ ^ 0xffffffff) > -1)
            return false;
        if (i >= -88)
            return false;
        return true;
    }

    public static void method348(Class21renamed class21, byte i,
                                 Class21renamed class21_48_) {
        try {
            Class25.aClass21_513 = class21_48_;
            if (i == -72) {
                Class68_Sub20_Sub8.aClass21_4290 = class21;
                anInt470++;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("cj.O("
                            + (class21 != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (class21_48_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public void method349(byte[] is, int i) {
        anInt428 = Class72.method1357(is.length, -1, is);
        anInt434++;
        Stream class68_sub14 = new Stream(RSString.method1612(is, true));
        int i_49_ = class68_sub14.readUnsignedByte(i + 18852);
        if (i_49_ != 5 && i_49_ != 6)
            throw new RuntimeException("Incorrect JS5 protocol number: "
                    + i_49_);
        if ((i_49_ ^ 0xffffffff) <= -7)
            class68_sub14.readDWord();
        int i_50_ = class68_sub14.readUnsignedByte(-6677);
        anInt454 = class68_sub14.readUnsignedWord(1355769544);
        anIntArray439 = new int[anInt454];
        int i_51_ = 0;
        int i_52_ = -1;
        if (i != -25529)
            aBoolean426 = true;
        for (int i_53_ = 0; anInt454 > i_53_; i_53_++) {
            anIntArray439[i_53_] = i_51_
                    += class68_sub14.readUnsignedWord(1355769544);
            if ((i_52_ ^ 0xffffffff) > (anIntArray439[i_53_] ^ 0xffffffff))
                i_52_ = anIntArray439[i_53_];
        }
        anIntArray468 = new int[1 + i_52_];
        anIntArray474 = new int[i_52_ + 1];
        anIntArray441 = new int[1 + i_52_];
        anIntArrayArray433 = new int[i_52_ + 1][];
        anObjectArray435 = new Object[1 + i_52_];
        anObjectArrayArray457 = new Object[i_52_ + 1][];
        anIntArray448 = new int[i_52_ - -1];
        if (i_50_ != 0) {
            anIntArray475 = new int[i_52_ + 1];
            for (int i_54_ = 0; 1 + i_52_ > i_54_; i_54_++)
                anIntArray475[i_54_] = -1;
            for (int i_55_ = 0; i_55_ < anInt454; i_55_++)
                anIntArray475[anIntArray439[i_55_]] = class68_sub14.readDWord();
            aClass109_444 = new Class109(anIntArray475);
        }
        for (int i_56_ = 0; (i_56_ ^ 0xffffffff) > (anInt454 ^ 0xffffffff); i_56_++)
            anIntArray468[anIntArray439[i_56_]] = class68_sub14.readDWord();
        for (int i_57_ = 0; (anInt454 ^ 0xffffffff) < (i_57_ ^ 0xffffffff); i_57_++)
            anIntArray474[anIntArray439[i_57_]] = class68_sub14.readDWord();
        for (int i_58_ = 0; (i_58_ ^ 0xffffffff) > (anInt454 ^ 0xffffffff);
             i_58_++)
            anIntArray441[anIntArray439[i_58_]]
                    = class68_sub14.readUnsignedWord(1355769544);
        for (int i_59_ = 0; (anInt454 ^ 0xffffffff) < (i_59_ ^ 0xffffffff);
             i_59_++) {
            i_51_ = 0;
            int i_60_ = anIntArray439[i_59_];
            int i_61_ = anIntArray441[i_60_];
            anIntArrayArray433[i_60_] = new int[i_61_];
            int i_62_ = -1;
            for (int i_63_ = 0; (i_61_ ^ 0xffffffff) < (i_63_ ^ 0xffffffff);
                 i_63_++) {
                int i_64_ = (anIntArrayArray433[i_60_][i_63_] = i_51_
                        += class68_sub14.readUnsignedWord(1355769544));
                if (i_64_ > i_62_)
                    i_62_ = i_64_;
            }
            anIntArray448[i_60_] = 1 + i_62_;
            if ((i_61_ ^ 0xffffffff) == (i_62_ + 1 ^ 0xffffffff))
                anIntArrayArray433[i_60_] = null;
        }
        if (i_50_ != 0) {
            aClass109Array427 = new Class109[i_52_ - -1];
            anIntArrayArray425 = new int[i_52_ + 1][];
            for (int i_65_ = 0; (anInt454 ^ 0xffffffff) < (i_65_ ^ 0xffffffff);
                 i_65_++) {
                int i_66_ = anIntArray439[i_65_];
                int i_67_ = anIntArray441[i_66_];
                anIntArrayArray425[i_66_] = new int[anIntArray448[i_66_]];
                for (int i_68_ = 0;
                     ((i_68_ ^ 0xffffffff)
                             > (anIntArray448[i_66_] ^ 0xffffffff));
                     i_68_++)
                    anIntArrayArray425[i_66_][i_68_] = -1;
                for (int i_69_ = 0; i_69_ < i_67_; i_69_++) {
                    int i_70_;
                    if (anIntArrayArray433[i_66_] == null)
                        i_70_ = i_69_;
                    else
                        i_70_ = anIntArrayArray433[i_66_][i_69_];
                    anIntArrayArray425[i_66_][i_70_] = class68_sub14.readDWord();
                }
                aClass109Array427[i_66_]
                        = new Class109(anIntArrayArray425[i_66_]);
            }
        }
    }

    public byte[] method350(int[] is, int i, int i_71_, byte i_72_) {
        anInt453++;
        int i_73_ = -126 / ((i_72_ - 39) / 50);
        if (!method340((byte) 67, i, i_71_))
            return null;
        if (anObjectArrayArray457[i] == null
                || anObjectArrayArray457[i][i_71_] == null) {
            boolean bool = method336(82, is, i);
            if (!bool) {
                method331((byte) -110, i);
                bool = method336(69, is, i);
                if (!bool)
                    return null;
            }
        }
        byte[] is_74_ = Animable.method53(false, (byte) -4,
                anObjectArrayArray457[i][i_71_]);
        if (aBoolean447) {
            anObjectArrayArray457[i][i_71_] = null;
            if (anIntArray448[i] == 1)
                anObjectArrayArray457[i] = null;
        }
        return is_74_;
    }

    public byte[] method351(RSString class100, RSString class100_75_, byte i) {
        try {
            class100 = class100.method1608((byte) 67);
            class100_75_ = class100_75_.method1608((byte) 75);
            int i_76_
                    = aClass109_444.method1657(class100.method1603(5745), -1);
            anInt436++;
            if (!method346(i_76_, 0))
                return null;
            if (i <= 65)
                return null;
            int i_77_ = aClass109Array427[i_76_]
                    .method1657(class100_75_.method1603(5745), -1);
            return method338(i_77_, 0, i_76_);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("cj.H("
                            + (class100 != null ? "{...}" : "null")
                            + ','
                            + (class100_75_ != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    public int method352(int i) {
        anInt423++;
        int i_78_ = 0;
        int i_79_ = 0;
        for (int i_80_ = i;
             (i_80_ ^ 0xffffffff) > (anObjectArray435.length ^ 0xffffffff);
             i_80_++) {
            if (anIntArray441[i_80_] > 0) {
                i_79_ += method332(i, i_80_);
                i_78_ += 100;
            }
        }
        if (i_78_ == 0)
            return 100;
        int i_81_ = 100 * i_79_ / i_78_;
        return i_81_;
    }

    public boolean method353(byte i) {
        anInt437++;
        if (i != -62)
            return true;
        boolean bool = true;
        for (int i_82_ = 0;
             (i_82_ ^ 0xffffffff) > (anIntArray439.length ^ 0xffffffff);
             i_82_++) {
            int i_83_ = anIntArray439[i_82_];
            if (anObjectArray435[i_83_] == null) {
                method331((byte) -109, i_83_);
                if (anObjectArray435[i_83_] == null)
                    bool = false;
            }
        }
        return bool;
    }

    public boolean method354(int i, RSString class100) {
        if (i != 0)
            method346(11, -69);
        class100 = class100.method1608((byte) -82);
        anInt438++;
        int i_84_ = aClass109_444.method1657(class100.method1603(5745), -1);
        return method333((byte) -122, i_84_);
    }

    public int method355(int i, int i_85_) {
        anInt451++;
        if (!method346(i, i_85_))
            return 0;
        return anIntArray448[i];
    }

    public static void method356(int i) {
        aRSString_478 = null;
        aClass21_Sub1_459 = null;
        aRSString_477 = null;
        if (i >= 39) {
            aClass21_Sub1_472 = null;
            stream = null;
        }
    }

    public void method357(int i) {
        for (int i_86_ = i; ((anObjectArrayArray457.length ^ 0xffffffff)
                < (i_86_ ^ 0xffffffff)); i_86_++)
            anObjectArrayArray457[i_86_] = null;
        anInt430++;
    }

    public static void method358(int i) {
        Class68_Sub20_Sub10.aLong4306 = 0L;
        Class14.aClass84_241.anInt1545 = 0;
        Class17.aBoolean284 = true;
        Class7.anInt122 = 0;
        anInt465++;
        Class80.anInt1417 = 0;
        client.anInt2368 = 0;
        Class48.anInt951 = 0;
        ISAACRandomGen.anInt1473 = 0;
        Class21_Sub1.anInt2700 = 0;
        anInt423 = 0;
        Class21_Sub1.anInt2719 = 0;
        Class14.anInt239 = 0;
        Class90.anInt2338 = 0;
        RSString.anInt2280 = 0;
        Class116.anInt2015 = 0;
        Class16.anInt254 = 0;
        Class72.anInt1310 = 0;
        Class68_Sub9.anInt2895 = 0;
        Class68_Sub18.anInt3056 = 0;
        RSString.anInt2288 = 0;
        Login.anInt1502 = 0;
        Class68_Sub20_Sub11.anInt4325 = 0;
        Class32.anInt570 = 0;
        Class68_Sub19.anInt3068 = 0;
        Class68_Sub20_Sub8.anInt4269 = 0;
        GameSocket.anInt1126 = 0;
        Class128.anInt2213 = 0;
        Class68_Sub13_Sub13.anInt3652 = 0;
        Applet_Sub1.anInt37 = 0;
        Class98.anInt1731 = 0;
        Class98.anInt1725 = 0;
        Applet_Sub1.anInt15 = 0;
        Class68_Sub13_Sub26_Sub1.anInt4612 = 0;
        PacketStream.anInt4122 = 0;
        PlayerDefinition.anInt2184 = 0;
        Class68_Sub9.anInt2890 = 0;
        Class28.anInt533 = 0;
        Class128.anInt2215 = 0;
        Class68_Sub28_Sub1.anInt4487 = 0;
        Class72.anInt1313 = 0;
        Class68_Sub13_Sub23.anInt3824 = 0;
        Class68_Sub13_Sub21.anInt3789 = 0;
        Class68_Sub20_Sub8.anInt4283 = 0;
        Stream.anInt2952 = 0;
        Class68_Sub13_Sub12.anInt3642 = 0;
        RSString.anInt2264 = 0;
        Class114.anInt1931 = 0;
        Class68_Sub13_Sub24.anInt3846 = 0;
        Class68_Sub20_Sub3.anInt4204 = 0;
        Class68_Sub19.anInt3065 = 0;
        Class13_Sub2.anInt2648 = 0;
        Class68_Sub20_Sub10.anInt4304 = 0;
        Class68_Sub20_Sub19.anInt4453 = 0;
        Class80.anInt1408 = 0;
        Class116.anInt2009 = 0;
        Login.anInt1518 = 0;
        Class98.anInt1726 = 0;
        Class55.anInt2057 = 0;
        Applet_Sub1.anInt29 = 0;
        Class90.anInt2350 = 0;
        Class103.anInt1774 = 0;
        Class68_Sub13_Sub21.anInt3798 = 0;
        Animable.anInt55 = 0;
        GameException.anInt2245 = 0;
        Class1_Sub7.anInt2615 = 0;
        Class68_Sub13_Sub37.anInt4074 = 0;
        Class68_Sub17.anInt3032 = 0;
        Class21_Sub1.anInt2694 = 0;
        RSString.anInt2281 = 0;
        Class80.anInt1450 = 0;
        Class68_Sub13_Sub36.anInt4048 = 0;
        Unknown.anInt1613 = 0;
        Class68_Sub28_Sub2.anInt4533 = 0;
        Class68_Sub20_Sub3.anInt4201 = 0;
        Class57.anInt1076 = 0;
        Class1_Sub1.anInt2428 = 0;
        Class68_Sub28_Sub1.anInt4479 = 0;
        Class35.anInt621 = 0;
        Class95.anInt1692 = 0;
        Class68_Sub13_Sub25.anInt3849 = 0;
        Class55.anInt2069 = 0;
        Class68_Sub13_Sub7.anInt3546 = 0;
        Class70.anInt1280 = 0;
        Class68_Sub13_Sub26.anInt3875 = 0;
        Class68_Sub13_Sub11.anInt3624 = 0;
        Class68_Sub13_Sub31.anInt3957 = 0;
        Class68_Sub28_Sub2.anInt4534 = 0;
        Class68_Sub4.anInt2826 = 0;
        Class68_Sub13.anInt2933 = 0;
        Class68_Sub28_Sub1.anInt4466 = 0;
        Class13_Sub3.anInt2661 = 0;
        Class68_Sub25.anInt3166 = 0;
        Class68_Sub20_Sub17.anInt4443 = 0;
        Class68_Sub13_Sub25.anInt3861 = 0;
        Class3.anInt86 = 0;
        Class68_Sub20_Sub13_Sub2.anInt4618 = 0;
        Class68_Sub13_Sub22.anInt3813 = 0;
        Class20.anInt420 = 0;
        Class1_Sub7.anInt2607 = 0;
        Class124.anInt2157 = 0;
        Class68_Sub13.anInt2940 = 0;
        Class68_Sub13_Sub30.anInt3944 = 0;
        Class58.anInt1093 = 0;
        Class68_Sub25.anInt3169 = 0;
        Class96.anInt1696 = 0;
        Applet_Sub1.anInt35 = 0;
        Class68_Sub13_Sub34.anInt4003 = 0;
        Class112.anInt1888 = 0;
        Class68_Sub20_Sub12.anInt4347 = 0;
        Class123.anInt2121 = 0;
        client.anInt2377 = 0;
        Class114.anInt1935 = 0;
        Class74.anInt1326 = 0;
        Applet_Sub1.anInt30 = 0;
        ItemDef.anInt372 = 0;
        Class72_Sub1.anInt3284 = 0;
        Class68_Sub20_Sub3.anInt4206 = 0;
        Applet_Sub1.anInt24 = 0;
        Class72.anInt1309 = 0;
        Class68_Sub29.anInt3229 = 0;
        Class45.anInt882 = 0;
        RSString.anInt2319 = 0;
        Class68_Sub20_Sub8.anInt4275 = 0;
        Class109.anInt1842 = 0;
        Class35.anInt620 = 0;
        Class68_Sub13_Sub33.anInt3997 = 0;
        Class68_Sub8.anInt2877 = 0;
        ISAACRandomGen.anInt1474 = 0;
        Class112.anInt1899 = 0;
        Class68_Sub13_Sub31.anInt3972 = 0;
        Class116.anInt1984 = 0;
        Class90.anInt2364 = 0;
        Class86.anInt1572 = 0;
        Class112.anInt1893 = 0;
        Class67.anInt1214 = 0;
        Applet_Sub1.anInt27 = 0;
        Class34.anInt599 = 0;
        Class68_Sub20_Sub13.anInt4360 = 0;
        Class68_Sub13_Sub36.anInt4038 = 0;
        Class102.anInt1755 = 0;
        GroundData.anInt673 = 0;
        anInt430 = 0;
        PlayerDefinition.anInt2200 = 0;
        Class28.anInt526 = 0;
        Class68_Sub13_Sub36.anInt4036 = 0;
        Class11.anInt194 = 0;
        Class103.anInt1766 = 0;
        Class71.anInt1292 = 0;
        Stream.anInt3002 = 0;
        Animable.anInt56 = 0;
        Class68_Sub13_Sub32.anInt3983 = 0;
        RSString.anInt2289 = 0;
        Class68_Sub20_Sub7.anInt4253 = 0;
        Class68_Sub13_Sub26.anInt3870 = 0;
        Class9.anInt166 = 0;
        Class128.anInt2222 = 0;
        Class74.anInt1325 = 0;
        Class68_Sub20_Sub13_Sub2.anInt4617 = 0;
        Class68_Sub8.anInt2874 = 0;
        PacketStream.anInt4125 = 0;
        Class68_Sub20_Sub15.anInt4398 = 0;
        Class68_Sub13.anInt2938 = 0;
        Class53.anInt1018 = 0;
        Class72.anInt1316 = 0;
        Class1_Sub6_Sub2.anInt3400 = 0;
        Class16.anInt264 = 0;
        anInt424 = 0;
        Class80.anInt1460 = 0;
        Class68_Sub13_Sub17.anInt3722 = 0;
        Class17.anInt281 = 0;
        Class68_Sub28_Sub2.anInt4536 = 0;
        Class68_Sub13_Sub39.anInt4105 = 0;
        Class25.anInt510 = 0;
        Class68_Sub13_Sub13.anInt3658 = 0;
        Animable.anInt68 = 0;
        Class128.anInt2217 = 0;
        Class90.anInt2347 = 0;
        Class104.anInt1776 = 0;
        Class13_Sub1.anInt2637 = 0;
        Applet_Sub1.anInt22 = 0;
        Class68_Sub13_Sub25.anInt3857 = 0;
        RSString.anInt2277 = 0;
        GroundData.anInt665 = 0;
        Class68_Sub13_Sub13.anInt3654 = 0;
        Class68_Sub29.anInt3238 = 0;
        Canvas_Sub1.anInt52 = 0;
        Class103.anInt1759 = 0;
        Class68_Sub13_Sub16.anInt3700 = 0;
        Applet_Sub1.anInt18 = 0;
        Class68_Sub13_Sub25.anInt3848 = 0;
        RSString.anInt2294 = 0;
        Class68_Sub7.anInt2848 = 0;
        Class50.anInt991 = 0;
        Class49.anInt976 = 0;
        ItemDef.anInt359 = 0;
        GroundData.anInt671 = 0;
        Class68_Sub20_Sub3.anInt4198 = 0;
        RSString.anInt2282 = 0;
        Class68_Sub28_Sub1.anInt4460 = 0;
        Class122.anInt2114 = 0;
        Class68_Sub28_Sub1.anInt4468 = 0;
        Class15.anInt246 = 0;
        Class14.anInt232 = 0;
        Class71_Sub1.anInt3253 = 0;
        Class68_Sub3.anInt2802 = 0;
        Stream.anInt2959 = 0;
        Class68_Sub13_Sub18.anInt3730 = 0;
        Class1_Sub6_Sub1.anInt3390 = 0;
        Class68_Sub13_Sub28.anInt3921 = 0;
        Stream.anInt2977 = 0;
        ISAACRandomGen.anInt1490 = 0;
        Class76.anInt1357 = 0;
        Class68_Sub13_Sub4.anInt3504 = 0;
        Class68_Sub13_Sub15.anInt3683 = 0;
        Class106.anInt1806 = 0;
        anInt438 = 0;
        Class128.anInt2226 = 0;
        Class98.anInt1727 = 0;
        Class68_Sub28_Sub2.anInt4531 = 0;
        Stream.anInt2962 = 0;
        Class68_Sub20_Sub8.anInt4271 = 0;
        Class60.anInt1114 = 0;
        Applet_Sub1.anInt10 = 0;
        Class68_Sub13_Sub39.anInt4108 = 0;
        Class68_Sub20_Sub2.anInt4185 = 0;
        Class68_Sub20_Sub3.anInt4200 = 0;
        Stream.anInt2982 = 0;
        Class68_Sub13_Sub27.anInt3909 = 0;
        Class70.anInt1268 = 0;
        Stream.anInt2957 = 0;
        Class107.anInt1816 = 0;
        Class68_Sub13_Sub27.anInt3895 = 0;
        Class68_Sub28_Sub1.anInt4490 = 0;
        Class112.anInt1877 = 0;
        Class16.anInt255 = 0;
        PlayerDefinition.anInt2197 = 0;
        Class68_Sub13.anInt2932 = 0;
        Class68_Sub13_Sub38.anInt4078 = 0;
        anInt455 = 0;
        Class68_Sub13_Sub7.anInt3550 = 0;
        Animable.anInt58 = 0;
        Class34.anInt591 = 0;
        GroundData.anInt683 = 0;
        RSString.anInt2300 = 0;
        Class68_Sub13_Sub5.anInt3513 = 0;
        Class60.anInt1116 = 0;
        Class50_Sub2.anInt2733 = 0;
        Class75_Sub1.anInt3302 = 0;
        Stream.anInt2993 = 0;
        Class113.anInt1911 = 0;
        Class11.anInt189 = 0;
        Class112.anInt1882 = 0;
        Stream.anInt2986 = 0;
        GameException.anInt2234 = 0;
        Class72_Sub1.anInt3270 = 0;
        Class75_Sub1_Sub1.anInt4576 = 0;
        Stream.anInt2997 = 0;
        Class71_Sub1.anInt3254 = 0;
        Class55.anInt2041 = 0;
        Class95.anInt1687 = 0;
        Class68_Sub13_Sub13.anInt3653 = 0;
        Class68.anInt1220 = 0;
        anInt431 = 0;
        Class13_Sub4.anInt2689 = 0;
        Stream.anInt2988 = 0;
        Class68_Sub28_Sub1.anInt4472 = 0;
        Class68_Sub13_Sub18.anInt3726 = 0;
        Class78.anInt1393 = 0;
        Class68.anInt1226 = 0;
        Class68_Sub9.anInt2896 = 0;
        Class13_Sub1.anInt2620 = 0;
        Class68_Sub13_Sub30.anInt3946 = 0;
        Class112.anInt1896 = 0;
        Class68_Sub20_Sub11.anInt4336 = 0;
        Class68_Sub13_Sub6.anInt3525 = 0;
        Class68_Sub28_Sub1.anInt4492 = 0;
        Class86.anInt1573 = 0;
        Class72_Sub1.anInt3267 = 0;
        PacketStream.anInt4111 = 0;
        Class68_Sub13_Sub35.anInt4020 = 0;
        Class68_Sub28_Sub2.anInt4535 = 0;
        Stream.anInt2974 = 0;
        Class20.anInt398 = 0;
        Class68_Sub13_Sub7.anInt3554 = 0;
        RSString.anInt2274 = 0;
        GroundData.anInt668 = 0;
        Class68_Sub20_Sub6.anInt4250 = 0;
        GameSocket.anInt1136 = 0;
        Class91.anInt1639 = 0;
        client.anInt2374 = 0;
        Class1_Sub6_Sub2.anInt3417 = 0;
        Class35.anInt617 = 0;
        client.anInt2383 = 0;
        Class75_Sub1_Sub1.anInt4584 = 0;
        Class68_Sub20_Sub8.anInt4276 = 0;
        Class16.anInt263 = 0;
        Class68_Sub13_Sub22.anInt3815 = 0;
        Class1_Sub6_Sub1.anInt3398 = 0;
        Class55.anInt2046 = 0;
        Class68_Sub16.anInt3025 = 0;
        Class68_Sub13_Sub36.anInt4046 = 0;
        Class68_Sub28_Sub1.anInt4508 = 0;
        anInt471 = 0;
        Class1_Sub6_Sub2.anInt3405 = 0;
        ItemDef.anInt351 = 0;
        Class75_Sub1_Sub1.anInt4578 = 0;
        Class124.anInt2134 = 0;
        Class92.anInt1653 = 0;
        Class20.anInt410 = 0;
        ItemDef.anInt392 = 0;
        RSString.anInt2302 = 0;
        Class68_Sub28_Sub2.anInt4554 = 0;
        Class35.anInt614 = 0;
        Class35.anInt618 = 0;
        Class68_Sub20_Sub2.anInt4183 = 0;
        Class68_Sub20_Sub17.anInt4433 = 0;
        Stream.anInt2955 = 0;
        Class80.anInt1411 = 0;
        Stream.anInt2949 = 0;
        Class68_Sub13.anInt2929 = 0;
        Class68_Sub20_Sub12.anInt4343 = 0;
        Class13_Sub3.anInt2666 = 0;
        Class68_Sub20_Sub11.anInt4328 = 0;
        Class116.anInt1959 = 0;
        Class21_Sub1.anInt2714 = 0;
        Class1_Sub5.anInt2507 = 0;
        RSString.anInt2313 = 0;
        Class72_Sub1.anInt3265 = 0;
        Class68_Sub24.anInt3161 = 0;
        Class121.anInt2105 = 0;
        Class35.anInt603 = 0;
        Class86.anInt1578 = 0;
        Class13_Sub3.anInt2659 = 0;
        PlayerDefinition.anInt2194 = 0;
        Applet_Sub1.anInt19 = 0;
        Class75_Sub1.anInt3296 = 0;
        Class59.anInt1100 = 0;
        Class1_Sub6_Sub2.anInt3404 = 0;
        Class72.anInt1304 = 0;
        Class13_Sub3.anInt2673 = 0;
        Class68_Sub20_Sub12.anInt4349 = 0;
        Class68_Sub13_Sub6.anInt3531 = 0;
        Class75.anInt1339 = 0;
        Class80.anInt1407 = 0;
        Class68.anInt1224 = 0;
        anInt446 = 0;
        Class68_Sub13_Sub17.anInt3714 = 0;
        Class68_Sub20_Sub17.anInt4434 = 0;
        Class68_Sub20_Sub18.anInt4446 = 0;
        Class21_Sub1.anInt2716 = 0;
        ItemDef.anInt354 = 0;
        Class13_Sub1.anInt2638 = 0;
        Class52.anInt1010 = 0;
        Class68_Sub13_Sub31.anInt3965 = 0;
        Class68_Sub13_Sub34.anInt4009 = 0;
        Class94.anInt1675 = 0;
        Class68_Sub1.anInt2762 = 0;
        Class54.anInt1035 = 0;
        Class68_Sub13_Sub35.anInt4017 = 0;
        Class68_Sub20_Sub8.anInt4281 = 0;
        Unknown.anInt1626 = 0;
        Class68_Sub20_Sub11.anInt4321 = 0;
        Class67.anInt1209 = 0;
        Class68_Sub20_Sub6.anInt4251 = 0;
        Class118.anInt2073 = 0;
        Class68_Sub13_Sub27.anInt3910 = 0;
        Class68_Sub20_Sub8.anInt4286 = 0;
        Class68_Sub13_Sub6.anInt3540 = 0;
        Class68_Sub13_Sub30.anInt3949 = 0;
        Class68_Sub20.anInt3084 = 0;
        Class1_Sub1.anInt2423 = 0;
        Class113.anInt1908 = 0;
        Class68_Sub20_Sub16.anInt4415 = 0;
        Class29.anInt534 = 0;
        Class68_Sub13_Sub18.anInt3729 = 0;
        Class57.anInt1079 = 0;
        Class28.anInt530 = 0;
        Class86.anInt1583 = 0;
        RSString.anInt2309 = 0;
        Class1_Sub6.anInt2567 = 0;
        if (i == 10938) {
            Class68_Sub13_Sub33.anInt3992 = 0;
            Class116.anInt1974 = 0;
            Class68_Sub13_Sub38.anInt4088 = 0;
            Class68_Sub13_Sub38.anInt4085 = 0;
            Unknown.anInt1623 = 0;
            Class55.anInt2066 = 0;
            Class56.anInt1063 = 0;
            Class35.anInt610 = 0;
            Class91.anInt1630 = 0;
            Class68_Sub20_Sub11.anInt4330 = 0;
            RSString.anInt2272 = 0;
            Class97.anInt1709 = 0;
            Unknown.anInt1620 = 0;
            Class66.anInt1204 = 0;
            Class116.anInt2029 = 0;
            Class68_Sub13_Sub25.anInt3863 = 0;
            Class14.anInt237 = 0;
            Class128.anInt2218 = 0;
            Class113.anInt1922 = 0;
            Class68_Sub13_Sub1.anInt3451 = 0;
            Class107.anInt1819 = 0;
            Class68_Sub13_Sub8.anInt3558 = 0;
            Class49.anInt965 = 0;
            Class7.anInt120 = 0;
            Class68_Sub13_Sub34.anInt4002 = 0;
            Class68_Sub5.anInt2834 = 0;
            Class68_Sub27.anInt3210 = 0;
            Class68_Sub20_Sub9.anInt4292 = 0;
            Stream.anInt2970 = 0;
            client.anInt2371 = 0;
            Stream.anInt2998 = 0;
            Class45.anInt912 = 0;
            Class68_Sub13.anInt2919 = 0;
            Class68_Sub16.anInt3022 = 0;
            Class86.anInt1577 = 0;
            Class68_Sub13.anInt2918 = 0;
            Class87.anInt1590 = 0;
            Class68_Sub20_Sub9.anInt4297 = 0;
            Class64.anInt1182 = 0;
            Class67.anInt1215 = 0;
            Class68_Sub13_Sub36.anInt4042 = 0;
            Class68_Sub13_Sub31.anInt3956 = 0;
            Class16.anInt269 = 0;
            Applet_Sub1.anInt13 = 0;
            Class68_Sub3.anInt2810 = 0;
            Class48.anInt947 = 0;
            Class113.anInt1914 = 0;
            Class68_Sub13_Sub6.anInt3527 = 0;
            Class68_Sub13_Sub7.anInt3555 = 0;
            Class55.anInt2044 = 0;
            Class3.anInt87 = 0;
            Class68_Sub20_Sub12.anInt4351 = 0;
            Class45.anInt757 = 0;
            Class68_Sub20_Sub16.anInt4411 = 0;
            client.anInt2370 = 0;
            Class86.anInt1586 = 0;
            Class44.anInt754 = 0;
            Class21_Sub1.anInt2712 = 0;
            Class125.anInt2168 = 0;
            Class86.anInt1580 = 0;
            Stream.anInt2989 = 0;
            Class68_Sub13_Sub15.anInt3689 = 0;
            Class68_Sub13_Sub10.anInt3587 = 0;
            GroundData.anInt667 = 0;
            Class16.anInt267 = 0;
            RSString.anInt2325 = 0;
            Class16.anInt256 = 0;
            Class86.anInt1579 = 0;
            Class68_Sub20_Sub12.anInt4346 = 0;
            Class115.anInt1942 = 0;
            Class14.anInt238 = 0;
            Class11.anInt188 = 0;
            Class68_Sub13_Sub11.anInt3612 = 0;
            Class1_Sub2.anInt2441 = 0;
            Class1_Sub7.anInt2608 = 0;
            Class68_Sub13_Sub38.anInt4089 = 0;
            Animable.anInt57 = 0;
            ItemDef.anInt328 = 0;
            Class25.anInt515 = 0;
            Class68_Sub13_Sub9.anInt3572 = 0;
            Class1_Sub5.anInt2498 = 0;
            Animable.anInt60 = 0;
            Class68_Sub13_Sub14.anInt3668 = 0;
            Class72_Sub1.anInt3261 = 0;
            GroundData.anInt664 = 0;
            Class68_Sub13_Sub26_Sub1.anInt4610 = 0;
            Class68_Sub13_Sub19.anInt3756 = 0;
            Class95.anInt1689 = 0;
            Class1_Sub5.anInt2501 = 0;
            Class12.anInt202 = 0;
            Class68_Sub28_Sub1.anInt4518 = 0;
            Class68_Sub13_Sub39.anInt4092 = 0;
            Unknown.anInt1624 = 0;
            RSString.anInt2299 = 0;
            Class53.anInt1024 = 0;
            Class68_Sub17.anInt3036 = 0;
            Class4.anInt97 = 0;
            Class68_Sub20_Sub16.anInt4427 = 0;
            Class68_Sub28_Sub1.anInt4507 = 0;
            Class4.anInt92 = 0;
            Class71.anInt1291 = 0;
            GameSocket.anInt1137 = 0;
            Class1_Sub6_Sub2.anInt3420 = 0;
            Class87.anInt1589 = 0;
            Class68_Sub13_Sub35.anInt4016 = 0;
            Class68_Sub20_Sub6.anInt4237 = 0;
            Class72_Sub1.anInt3259 = 0;
            Class68_Sub7.anInt2852 = 0;
            Class88.anInt1607 = 0;
            Class68_Sub20_Sub10.anInt4312 = 0;
            Unknown.anInt1628 = 0;
            RSString.anInt2304 = 0;
            Class1_Sub6_Sub2.anInt3437 = 0;
            Class13_Sub1.anInt2636 = 0;
            Class68_Sub13_Sub4.anInt3508 = 0;
            Class68_Sub13_Sub16.anInt3706 = 0;
            Class16.anInt257 = 0;
            Class68_Sub13_Sub33.anInt3988 = 0;
            Class107.anInt1813 = 0;
            Class68_Sub20_Sub2.anInt4187 = 0;
            Class68_Sub20_Sub18.anInt4448 = 0;
            Class13_Sub2.anInt2658 = 0;
            Class55.anInt2065 = 0;
            ItemDef.anInt333 = 0;
            PacketStream.anInt4130 = 0;
            Class68_Sub19.anInt3071 = 0;
            Class68_Sub28_Sub1.anInt4517 = 0;
            PacketStream.anInt4114 = 0;
            Class91.anInt1643 = 0;
            Class68_Sub20_Sub10.anInt4302 = 0;
            Class1_Sub6_Sub1.anInt3393 = 0;
            Class68_Sub20_Sub11.anInt4339 = 0;
            Class68_Sub13_Sub2.anInt3457 = 0;
            Class106.anInt1805 = 0;
            Class68_Sub13_Sub16.anInt3701 = 0;
            Class68_Sub13_Sub37.anInt4059 = 0;
            Class68_Sub13_Sub9.anInt3567 = 0;
            Class45.anInt858 = 0;
            Class18.anInt326 = 0;
            GameSocket.anInt1119 = 0;
            Class74.anInt1327 = 0;
            Class124.anInt2151 = 0;
            anInt460 = 0;
            PacketParser.anInt1873 = 0;
            Class68_Sub9.anInt2899 = 0;
            GameException.anInt2235 = 0;
            Class36.anInt645 = 0;
            Class9.anInt171 = 0;
            Class68_Sub13_Sub11.anInt3607 = 0;
            anInt422 = 0;
            Class16.anInt253 = 0;
            Class68_Sub28_Sub1.anInt4488 = 0;
            Class68_Sub13.anInt2935 = 0;
            anInt456 = 0;
            Class37.anInt647 = 0;
            Class50_Sub2.anInt2748 = 0;
            Applet_Sub1.anInt21 = 0;
            Class68_Sub13_Sub3.anInt3477 = 0;
            Class37.anInt648 = 0;
            Class68_Sub20_Sub15.anInt4395 = 0;
            Class68_Sub13_Sub27.anInt3904 = 0;
            Class68_Sub13_Sub19.anInt3749 = 0;
            Class50_Sub2.anInt2738 = 0;
            Class87.anInt1591 = 0;
            Class20.anInt406 = 0;
            anInt432 = 0;
            Class68_Sub13_Sub11.anInt3617 = 0;
            Stream.anInt2969 = 0;
            Class72.anInt1320 = 0;
            Applet_Sub1.anInt23 = 0;
            Class68_Sub13_Sub2.anInt3462 = 0;
            Class1_Sub7.anInt2591 = 0;
            Stream.anInt2964 = 0;
            Class68_Sub7.anInt2851 = 0;
            Class68_Sub13_Sub17.anInt3725 = 0;
            Class68_Sub10.anInt2910 = 0;
            Class50.anInt982 = 0;
            Class33.anInt575 = 0;
            Class68_Sub20_Sub8.anInt4268 = 0;
            Class68_Sub13_Sub10.anInt3594 = 0;
            PlayerDefinition.anInt2188 = 0;
            Class1_Sub6.anInt2587 = 0;
            Class17.anInt282 = 0;
            Class68_Sub29.anInt3236 = 0;
            Class21_Sub1.anInt2715 = 0;
            Class68_Sub13_Sub34.anInt4007 = 0;
            Class68_Sub6.anInt2841 = 0;
            Animable.anInt54 = 0;
            PacketParser.anInt1869 = 0;
            RSString.anInt2322 = 0;
            Class78.anInt1392 = 0;
            Class75_Sub1_Sub1.anInt4579 = 0;
            Class118.anInt2075 = 0;
            RSString.anInt2323 = 0;
            Stream.anInt2958 = 0;
            Class68_Sub28_Sub2.anInt4541 = 0;
            anInt452 = 0;
            Class68_Sub13_Sub27.anInt3903 = 0;
            Login.anInt1499 = 0;
            anInt469 = 0;
            Class128.anInt2219 = 0;
            Class15.anInt245 = 0;
            Class68_Sub13_Sub37.anInt4055 = 0;
            Animable.anInt67 = 0;
            Class68_Sub3.anInt2811 = 0;
            Class68_Sub13_Sub21.anInt3790 = 0;
            Class68_Sub13_Sub2.anInt3461 = 0;
            Class17.anInt285 = 0;
            Class44.anInt747 = 0;
            anInt465 = 0;
            Stream.anInt2950 = 0;
            Class68_Sub13_Sub19.anInt3751 = 0;
            Class44.anInt751 = 0;
            Class53.anInt1021 = 0;
            GameException.anInt2237 = 0;
            Class68_Sub13_Sub8.anInt3562 = 0;
            Class1_Sub7.anInt2610 = 0;
            Class68_Sub13_Sub9.anInt3573 = 0;
            Class72_Sub1.anInt3282 = 0;
            Class68_Sub13_Sub31.anInt3967 = 0;
            Class28.anInt525 = 0;
            Class1_Sub1.anInt2391 = 0;
            Class23.anInt500 = 0;
            Class68_Sub20_Sub10.anInt4307 = 0;
            Stream.anInt2975 = 0;
            Class68_Sub13_Sub26.anInt3871 = 0;
            Class98.anInt1721 = 0;
            Class68_Sub13.anInt2930 = 0;
            Class9.anInt174 = 0;
            anInt462 = 0;
            Class8.anInt151 = 0;
            Applet_Sub1.anInt20 = 0;
            Class68_Sub13_Sub10.anInt3584 = 0;
            Class71_Sub1.anInt3250 = 0;
            Class52.anInt994 = 0;
            Class48.anInt950 = 0;
            Class68_Sub4.anInt2825 = 0;
            ISAACRandomGen.anInt1475 = 0;
            Class127.anInt2210 = 0;
            Class68_Sub28_Sub1.anInt4482 = 0;
            PacketStream.anInt4119 = 0;
            Class101.anInt1739 = 0;
            Stream.anInt2946 = 0;
            Class68_Sub13_Sub13.anInt3649 = 0;
            client.anInt2378 = 0;
            Class68_Sub13_Sub15.anInt3691 = 0;
            Class44.anInt753 = 0;
            Class18.anInt317 = 0;
            Unknown.anInt1627 = 0;
            Class68_Sub13_Sub24.anInt3832 = 0;
            Class20.anInt411 = 0;
            Class119.anInt2087 = 0;
            Stream.anInt2981 = 0;
            Class44.anInt748 = 0;
            PacketStream.anInt4113 = 0;
            Class114.anInt1938 = 0;
            Class75_Sub3.anInt3325 = 0;
            Class68_Sub13_Sub39.anInt4095 = 0;
            Class72_Sub1.anInt3283 = 0;
            Class68_Sub13.anInt2937 = 0;
            Class68_Sub20_Sub13.anInt4362 = 0;
            Class1_Sub1.anInt2399 = 0;
            Class58.anInt1091 = 0;
            Class13_Sub1.anInt2622 = 0;
            Class128.anInt2216 = 0;
            Class1_Sub6_Sub1.anInt3396 = 0;
            Class1_Sub2.anInt2440 = 0;
            Class45.anInt809 = 0;
            Class68_Sub20_Sub6.anInt4238 = 0;
            Class68_Sub13_Sub15.anInt3693 = 0;
            GameException.anInt2233 = 0;
            Class30.anInt547 = 0;
            Class71.anInt1295 = 0;
            Class116.anInt2001 = 0;
            Class72.anInt1301 = 0;
            Class69.anInt1235 = 0;
            Class76.anInt1351 = 0;
            Class43.anInt737 = 0;
            Class68_Sub13_Sub33.anInt3994 = 0;
            Class106.anInt1807 = 0;
            Class14.anInt240 = 0;
            Class13_Sub2.anInt2649 = 0;
            Class68_Sub28_Sub1.anInt4520 = 0;
            Class16.anInt261 = 0;
            anInt437 = 0;
            Class16.anInt268 = 0;
            Class128.anInt2212 = 0;
            Applet_Sub1.anInt41 = 0;
            Class75_Sub1.anInt3291 = 0;
            Class124.anInt2135 = 0;
            Applet_Sub1.anInt32 = 0;
            RSString.anInt2276 = 0;
            Class68_Sub28_Sub1.anInt4463 = 0;
            Class68_Sub20_Sub6.anInt4235 = 0;
            Class68_Sub13_Sub15.anInt3680 = 0;
            anInt470 = 0;
            Class80.anInt1449 = 0;
            Class98.anInt1728 = 0;
            Stream.anInt2995 = 0;
            ISAACRandomGen.anInt1483 = 0;
            Class90.anInt2362 = 0;
            Stream.anInt3001 = 0;
            anInt458 = 0;
            GameSocket.anInt1125 = 0;
            anInt473 = 0;
            Class68_Sub13_Sub28.anInt3926 = 0;
            Class68_Sub13_Sub36.anInt4047 = 0;
            Login.anInt1509 = 0;
            Class44.anInt750 = 0;
            Class116.anInt1970 = 0;
            Class68_Sub13_Sub7.anInt3547 = 0;
            Class68_Sub13_Sub23.anInt3816 = 0;
            Class68_Sub13_Sub37.anInt4069 = 0;
            PlayerDefinition.anInt2193 = 0;
            Class68_Sub13_Sub14.anInt3665 = 0;
            Class32.anInt568 = 0;
            Applet_Sub1.anInt14 = 0;
            Class68_Sub13_Sub8.anInt3559 = 0;
            Applet_Sub1.anInt39 = 0;
            Class68_Sub13_Sub3.anInt3476 = 0;
            ISAACRandomGen.anInt1492 = 0;
            GroundData.anInt680 = 0;
            Class102.anInt1750 = 0;
            Class68_Sub13_Sub28.anInt3927 = 0;
            Class68_Sub13.anInt2934 = 0;
            Stream.anInt2992 = 0;
            Class68_Sub13_Sub38.anInt4087 = 0;
            Class68_Sub20_Sub16.anInt4421 = 0;
            Class68_Sub20_Sub9.anInt4296 = 0;
            RSString.anInt2283 = 0;
            Class68_Sub13_Sub3.anInt3470 = 0;
            Class68_Sub8.anInt2865 = 0;
            RSString.anInt2311 = 0;
            Class107.anInt1823 = 0;
            RSString.anInt2314 = 0;
            Class23.anInt494 = 0;
            Class68_Sub13_Sub28.anInt3924 = 0;
            RSString.anInt2278 = 0;
            Class75_Sub3_Sub1.anInt4592 = 0;
            Class1_Sub7.anInt2600 = 0;
            Class68_Sub20_Sub3.anInt4207 = 0;
            Class68_Sub27.anInt3214 = 0;
            Class1_Sub6.anInt2551 = 0;
            Stream.anInt3004 = 0;
            Class68_Sub13_Sub20.anInt3773 = 0;
            Class80.anInt1414 = 0;
            Class68_Sub28_Sub1.anInt4462 = 0;
            Class90.anInt2343 = 0;
            Class52.anInt999 = 0;
            Class84.anInt1531 = 0;
            Class68_Sub28_Sub1.anInt4457 = 0;
            Class68_Sub13_Sub15.anInt3692 = 0;
            Class68_Sub29.anInt3249 = 0;
            Class68_Sub15.anInt3017 = 0;
            Class1_Sub1.anInt2401 = 0;
            Class95.anInt1679 = 0;
            Class116.anInt2014 = 0;
            Class55.anInt2040 = 0;
            Class68_Sub13_Sub32.anInt3984 = 0;
            Class68_Sub20_Sub7.anInt4259 = 0;
            Class11.anInt195 = 0;
            Class68_Sub20.anInt3096 = 0;
            Class121.anInt2101 = 0;
            Class115.anInt1947 = 0;
            Class124.anInt2132 = 0;
            Class68_Sub13_Sub23.anInt3818 = 0;
            Class68_Sub13_Sub31.anInt3961 = 0;
            Applet_Sub1.anInt5 = 0;
            RSString.anInt2292 = 0;
            client.anInt2375 = 0;
            Class95.anInt1686 = 0;
            Class68_Sub13_Sub12.anInt3633 = 0;
            Applet_Sub1.anInt28 = 0;
            Class1_Sub1.anInt2404 = 0;
            Class45.anInt760 = 0;
            Class68_Sub13_Sub32.anInt3980 = 0;
            Class13_Sub4.anInt2680 = 0;
            Class68_Sub13_Sub29.anInt3933 = 0;
            Class55.anInt2060 = 0;
            Class68_Sub20_Sub8.anInt4280 = 0;
            Class68_Sub28_Sub1.anInt4502 = 0;
            Class1_Sub1.anInt2416 = 0;
            Class68_Sub28_Sub1.anInt4506 = 0;
            Class68_Sub13_Sub7.anInt3556 = 0;
            Class72_Sub1.anInt3262 = 0;
            Class68_Sub13_Sub17.anInt3721 = 0;
            ItemDef.anInt361 = 0;
            Class68_Sub13_Sub36.anInt4030 = 0;
            Class113.anInt1917 = 0;
            Login.anInt1514 = 0;
            Class35.anInt607 = 0;
            Class68_Sub20_Sub13.anInt4361 = 0;
            Class45.anInt895 = 0;
            Stream.anInt2980 = 0;
            Class13_Sub2.anInt2655 = 0;
            PacketParser.anInt1862 = 0;
            Class109.anInt1841 = 0;
            Class68_Sub13_Sub16.anInt3704 = 0;
            Class1_Sub5.anInt2508 = 0;
            Class97.anInt1715 = 0;
            Class68_Sub13.anInt2927 = 0;
            Class68_Sub13_Sub34.anInt4011 = 0;
            Class35.anInt622 = 0;
            Class68_Sub20_Sub6.anInt4231 = 0;
            Class68_Sub13_Sub33.anInt3993 = 0;
            Class68_Sub13_Sub32.anInt3986 = 0;
            Stream.anInt2963 = 0;
            Class68_Sub13_Sub27.anInt3887 = 0;
            Class68_Sub13_Sub13.anInt3660 = 0;
            Class68_Sub13_Sub1.anInt3454 = 0;
            Class68_Sub13_Sub16.anInt3707 = 0;
            Class68_Sub13_Sub31.anInt3962 = 0;
            GameSocket.anInt1135 = 0;
            Class30.anInt545 = 0;
            Class57.anInt1070 = 0;
            Class68_Sub13_Sub33.anInt3995 = 0;
            ItemDef.anInt367 = 0;
            Class68_Sub13_Sub15.anInt3685 = 0;
            Class68_Sub13_Sub19.anInt3753 = 0;
            Class69.anInt1247 = 0;
            Class75_Sub2.anInt3316 = 0;
            Class85.anInt1562 = 0;
            Class116.anInt2020 = 0;
            Class16.anInt265 = 0;
            client.anInt2384 = 0;
            anInt434 = 0;
            Class68_Sub20.anInt3097 = 0;
            RSString.anInt2286 = 0;
            Class68_Sub13_Sub17.anInt3715 = 0;
            Class68_Sub13_Sub13.anInt3655 = 0;
            Stream.anInt2985 = 0;
            Class72_Sub1.anInt3263 = 0;
            Class45.anInt824 = 0;
            Class68_Sub20_Sub11.anInt4337 = 0;
            Class21_Sub1.anInt2718 = 0;
            PacketStream.anInt4115 = 0;
            Class72_Sub1.anInt3264 = 0;
            Class116.anInt2028 = 0;
            Class68_Sub13_Sub27.anInt3900 = 0;
            Class68_Sub13_Sub12.anInt3634 = 0;
            Class68_Sub20_Sub6.anInt4241 = 0;
            anInt442 = 0;
            Class51.anInt2250 = 0;
            Class68_Sub13_Sub18.anInt3733 = 0;
            Class35.anInt608 = 0;
            Class90.anInt2329 = 0;
            Class75_Sub1_Sub1.anInt4582 = 0;
            Class68_Sub20_Sub18.anInt4447 = 0;
            RSString.anInt2307 = 0;
            Class90.anInt2333 = 0;
            Class125.anInt2179 = 0;
            Class1_Sub1.anInt2415 = 0;
            PacketParser.anInt1866 = 0;
            Class68_Sub29.anInt3247 = 0;
            Class80.anInt1452 = 0;
            RSString.anInt2287 = 0;
            Class44.anInt745 = 0;
            Applet_Sub1.anInt8 = 0;
            Class68_Sub13_Sub19.anInt3744 = 0;
            Class68_Sub13_Sub20.anInt3767 = 0;
            Class68_Sub28_Sub2.anInt4540 = 0;
            Login.anInt1505 = 0;
            Class68_Sub20_Sub7.anInt4258 = 0;
            ItemDef.anInt393 = 0;
            Class68_Sub13_Sub11.anInt3615 = 0;
            Class13_Sub2.anInt2644 = 0;
            Class68_Sub13_Sub29.anInt3938 = 0;
            Class71.anInt1299 = 0;
            Class70.anInt1278 = 0;
            GroundData.anInt682 = 0;
            Class68_Sub13_Sub3.anInt3466 = 0;
            Class50.anInt987 = 0;
            Class1_Sub5.anInt2504 = 0;
            Class125.anInt2177 = 0;
            Class68_Sub13_Sub26_Sub1.anInt4604 = 0;
            RSString.anInt2315 = 0;
            Class1_Sub6_Sub2.anInt3423 = 0;
            Class68_Sub15.anInt3011 = 0;
            Class68_Sub7.anInt2859 = 0;
            Class8.anInt155 = 0;
            Class124.anInt2155 = 0;
            Class68_Sub16.anInt3023 = 0;
            Class50.anInt978 = 0;
            Class48.anInt961 = 0;
            Class68_Sub20.anInt3082 = 0;
            Class68_Sub13_Sub29.anInt3931 = 0;
            Class66.anInt1201 = 0;
            Class76.anInt1353 = 0;
            Class68_Sub13_Sub3.anInt3473 = 0;
            Class53.anInt1023 = 0;
            Class74.anInt1329 = 0;
            Class105.anInt1797 = 0;
            client.anInt2369 = 0;
            RSString.anInt2310 = 0;
            Class68_Sub13_Sub18.anInt3736 = 0;
            Stream.anInt3000 = 0;
            Login.anInt1501 = 0;
            Class68_Sub10.anInt2904 = 0;
            Class68_Sub24.anInt3157 = 0;
            Class68_Sub13_Sub11.anInt3599 = 0;
            Applet_Sub1.anInt4 = 0;
            Class1_Sub6.anInt2528 = 0;
            Class25.anInt512 = 0;
            Class13.anInt217 = 0;
            Class45.anInt829 = 0;
            Class84.anInt1542 = 0;
            Class68_Sub13_Sub39.anInt4094 = 0;
            Class88.anInt1599 = 0;
            Class68_Sub13_Sub25.anInt3865 = 0;
            Class68_Sub13_Sub7.anInt3545 = 0;
            Class48.anInt946 = 0;
            Class75_Sub3.anInt3319 = 0;
            Class92.anInt1654 = 0;
            Class68_Sub13_Sub31.anInt3960 = 0;
            Class123.anInt2122 = 0;
            Class85.anInt1555 = 0;
            Class68_Sub20_Sub8.anInt4284 = 0;
            Class57.anInt1082 = 0;
            Class9.anInt167 = 0;
            Class94.anInt1673 = 0;
            Class68_Sub13_Sub32.anInt3979 = 0;
            Class13_Sub4.anInt2677 = 0;
            Class54.anInt1034 = 0;
            Class56.anInt1060 = 0;
            Class68_Sub20_Sub2.anInt4182 = 0;
            RSString.anInt2318 = 0;
            Class112.anInt1885 = 0;
            Class68_Sub13_Sub37.anInt4050 = 0;
            Class68_Sub13_Sub35.anInt4019 = 0;
            Class124.anInt2144 = 0;
            Class68_Sub13_Sub34.anInt4006 = 0;
            Class97.anInt1708 = 0;
            Class116.anInt1991 = 0;
            GroundData.anInt663 = 0;
            Class68_Sub6.anInt2842 = 0;
            Class55.anInt2062 = 0;
            Class68_Sub13_Sub24.anInt3842 = 0;
            Class86.anInt1565 = 0;
            Class68_Sub13_Sub5.anInt3512 = 0;
            Class55.anInt2049 = 0;
            Class68_Sub28_Sub2.anInt4539 = 0;
            Class68_Sub13_Sub15.anInt3690 = 0;
            Class68_Sub13_Sub6.anInt3523 = 0;
            Class68_Sub13_Sub4.anInt3493 = 0;
            Class68_Sub20_Sub4.anInt4216 = 0;
            Class68_Sub20_Sub13_Sub2.anInt4625 = 0;
            Class60.anInt1117 = 0;
            Class121.anInt2106 = 0;
            Class68_Sub13_Sub19.anInt3758 = 0;
            Login.anInt1497 = 0;
            Class68_Sub13_Sub3.anInt3475 = 0;
            Class68_Sub26.anInt3203 = 0;
            Class68_Sub20_Sub15.anInt4401 = 0;
            Class67.anInt1212 = 0;
            Class68_Sub26.anInt3205 = 0;
            Class45.anInt805 = 0;
            Class68_Sub4.anInt2818 = 0;
            Class13_Sub3.anInt2667 = 0;
            Class115.anInt1945 = 0;
            Class127.anInt2203 = 0;
            Class68_Sub13_Sub4.anInt3499 = 0;
            Class96.anInt1693 = 0;
            RSString.anInt2266 = 0;
            RSString.anInt2320 = 0;
            Class57.anInt1084 = 0;
            Class124.anInt2137 = 0;
            Class66.anInt1202 = 0;
            Class85.anInt1561 = 0;
            Class68_Sub13_Sub21.anInt3794 = 0;
            Class13_Sub3.anInt2670 = 0;
            Class75_Sub1_Sub1.anInt4583 = 0;
            Class102.anInt1747 = 0;
            Class35.anInt609 = 0;
            Class94.anInt1674 = 0;
            Class35.anInt619 = 0;
            Class68_Sub3.anInt2801 = 0;
            Class1_Sub6.anInt2553 = 0;
            PacketStream.anInt4129 = 0;
            Class68_Sub24.anInt3156 = 0;
            PlayerDefinition.anInt2187 = 0;
            Class20.anInt419 = 0;
            Class28.anInt524 = 0;
            RSString.anInt2324 = 0;
            Class88.anInt1595 = 0;
            Class68_Sub20_Sub15.anInt4404 = 0;
            Class68_Sub8.anInt2880 = 0;
            Class18.anInt301 = 0;
            Class68_Sub28_Sub1.anInt4504 = 0;
            Class53.anInt1016 = 0;
            Class3.anInt77 = 0;
            Class68_Sub13.anInt2926 = 0;
            Class56.anInt1064 = 0;
            Class68_Sub13_Sub21.anInt3785 = 0;
            Class16.anInt260 = 0;
            Class68_Sub13_Sub14.anInt3672 = 0;
            RSString.anInt2267 = 0;
            Class72.anInt1317 = 0;
            Class68_Sub20_Sub9.anInt4298 = 0;
            Class64.anInt1189 = 0;
            Class68_Sub13_Sub26.anInt3874 = 0;
            Class68_Sub13_Sub6.anInt3535 = 0;
            Class68_Sub13_Sub34.anInt4005 = 0;
            RSString.anInt2312 = 0;
            Stream.anInt2987 = 0;
            Class71.anInt1297 = 0;
            Class113.anInt1915 = 0;
            Class75_Sub3_Sub1.anInt4594 = 0;
            Class45.anInt758 = 0;
            Login.anInt1503 = 0;
            Class125.anInt2172 = 0;
            Class68_Sub13_Sub9.anInt3576 = 0;
            Class21_Sub1.anInt2707 = 0;
            Stream.anInt2967 = 0;
            Class68.anInt1221 = 0;
            Class68_Sub20_Sub11.anInt4340 = 0;
            Class75_Sub3.anInt3323 = 0;
            Class16.anInt262 = 0;
            Class68_Sub28_Sub1.anInt4456 = 0;
            Class68_Sub25.anInt3173 = 0;
            Class1_Sub5.anInt2494 = 0;
            Class1_Sub7.anInt2593 = 0;
            RSString.anInt2291 = 0;
            Class78.anInt1396 = 0;
            Class68_Sub13_Sub39.anInt4093 = 0;
            anInt463 = 0;
            Class68_Sub20_Sub11.anInt4341 = 0;
            ItemDef.anInt335 = 0;
            Class68_Sub28_Sub1.anInt4474 = 0;
            Class13_Sub1.anInt2632 = 0;
            Class95.anInt1682 = 0;
            Class116.anInt1993 = 0;
            Class68_Sub13_Sub22.anInt3809 = 0;
            anInt467 = 0;
            Class123.anInt2124 = 0;
            Class68_Sub20_Sub8.anInt4272 = 0;
            Class68_Sub20_Sub10.anInt4316 = 0;
            Class124.anInt2158 = 0;
            Class88.anInt1606 = 0;
            Class68_Sub28_Sub1.anInt4470 = 0;
            Class68_Sub13_Sub24.anInt3836 = 0;
            Class68_Sub28_Sub1.anInt4475 = 0;
            Class68_Sub13_Sub18.anInt3735 = 0;
            Class72.anInt1303 = 0;
            Class112.anInt1880 = 0;
            Class68_Sub20_Sub9.anInt4301 = 0;
            Class75_Sub1_Sub1.anInt4580 = 0;
            Class113.anInt1913 = 0;
            RSString.anInt2275 = 0;
            Class68_Sub20_Sub16.anInt4426 = 0;
            RSString.anInt2271 = 0;
            Class68_Sub28_Sub2.anInt4538 = 0;
            Class68_Sub7.anInt2856 = 0;
            Class68_Sub15.anInt3016 = 0;
            Applet_Sub1.anInt25 = 0;
            Class87.anInt1592 = 0;
            Class1_Sub6.anInt2517 = 0;
            Class68_Sub13_Sub21.anInt3800 = 0;
            Class68_Sub13_Sub23.anInt3823 = 0;
            Class1_Sub6_Sub2.anInt3436 = 0;
            Class113.anInt1916 = 0;
            Class45.anInt834 = 0;
            Class68_Sub27.anInt3223 = 0;
            Class68_Sub13_Sub26.anInt3885 = 0;
            Class120.anInt2097 = 0;
            Class119.anInt2090 = 0;
            GroundData.anInt669 = 0;
            Class13_Sub3.anInt2665 = 0;
            Class68_Sub13_Sub11.anInt3610 = 0;
            Class48.anInt957 = 0;
            Class68_Sub13_Sub12.anInt3637 = 0;
            Stream.anInt2951 = 0;
            Class116.anInt2012 = 0;
            PacketParser.anInt1871 = 0;
            Class68_Sub13_Sub26.anInt3884 = 0;
            Class23.anInt491 = 0;
            Class68_Sub20_Sub7.anInt4254 = 0;
            Class68_Sub19.anInt3078 = 0;
            Class13_Sub1.anInt2631 = 0;
            Class74.anInt1328 = 0;
            RSString.anInt2306 = 0;
            Class1_Sub6.anInt2527 = 0;
            Class114.anInt1929 = 0;
            Class68_Sub15.anInt3018 = 0;
            Stream.anInt2983 = 0;
            RSString.anInt2284 = 0;
            Class104.anInt1786 = 0;
            Stream.anInt2966 = 0;
            Class68_Sub28_Sub1.anInt4486 = 0;
            Class13_Sub4.anInt2684 = 0;
            Class32.anInt561 = 0;
            GameException.anInt2242 = 0;
            Class68_Sub29.anInt3245 = 0;
            Class68_Sub13_Sub36.anInt4045 = 0;
            Class11.anInt190 = 0;
            Canvas_Sub1.anInt49 = 0;
            Class115.anInt1939 = 0;
            PacketStream.anInt4131 = 0;
            Class104.anInt1789 = 0;
            Class68_Sub13_Sub14.anInt3674 = 0;
            Class116.anInt2024 = 0;
            Class68_Sub13_Sub38.anInt4081 = 0;
            Class68_Sub13_Sub16.anInt3698 = 0;
            Class114.anInt1933 = 0;
            Class78.anInt1390 = 0;
            Class44.anInt744 = 0;
            Stream.anInt3003 = 0;
            Class68_Sub13_Sub17.anInt3724 = 0;
            Class68_Sub20_Sub13_Sub2.anInt4619 = 0;
            RSString.anInt2298 = 0;
            Class68_Sub20_Sub8.anInt4288 = 0;
            Unknown.anInt1625 = 0;
            client.anInt2366 = 0;
            Class33.anInt578 = 0;
            Class11.anInt192 = 0;
            Class68_Sub20_Sub3.anInt4212 = 0;
            ItemDef.anInt373 = 0;
            PlayerDefinition.anInt2189 = 0;
            Class127.anInt2202 = 0;
            Class51.anInt2254 = 0;
            Class35.anInt612 = 0;
            Class102.anInt1758 = 0;
            Class43.anInt740 = 0;
            Class68_Sub26.anInt3190 = 0;
            Class68_Sub13_Sub20.anInt3774 = 0;
            anInt464 = 0;
            PacketParser.anInt1868 = 0;
            RSString.anInt2270 = 0;
            Class44.anInt749 = 0;
            Class21_Sub1.anInt2709 = 0;
            Class72_Sub1.anInt3280 = 0;
            Class86.anInt1581 = 0;
            Class68_Sub20_Sub13.anInt4356 = 0;
            GameException.anInt2238 = 0;
            Class68_Sub6.anInt2837 = 0;
            Class105.anInt1796 = 0;
            Class68_Sub13_Sub20.anInt3762 = 0;
            Class13_Sub1.anInt2623 = 0;
            Class68_Sub13_Sub31.anInt3974 = 0;
            Class112.anInt1890 = 0;
            Class119.anInt2085 = 0;
            ItemDef.anInt379 = 0;
            Class90.anInt2330 = 0;
            Class68_Sub18.anInt3041 = 0;
            RSString.anInt2295 = 0;
            Class68_Sub20_Sub7.anInt4265 = 0;
            Canvas_Sub1.anInt46 = 0;
            Class68_Sub13_Sub12.anInt3628 = 0;
            Class121.anInt2103 = 0;
            Class13_Sub2.anInt2654 = 0;
            Class68_Sub13_Sub33.anInt3990 = 0;
            Class68_Sub13_Sub20.anInt3763 = 0;
            Class28.anInt527 = 0;
            RSString.anInt2316 = 0;
            Class68_Sub13_Sub13.anInt3651 = 0;
            Class68_Sub13_Sub34.anInt4015 = 0;
            Class68_Sub13_Sub11.anInt3604 = 0;
            RSString.anInt2263 = 0;
            Class68_Sub22.anInt3143 = 0;
            Class49.anInt971 = 0;
            Class91.anInt1633 = 0;
            Class33.anInt580 = 0;
            Class68_Sub13_Sub14.anInt3675 = 0;
            Class68_Sub20.anInt3083 = 0;
            Class80.anInt1468 = 0;
            Class68_Sub27.anInt3218 = 0;
            Class14.anInt234 = 0;
            Class123.anInt2120 = 0;
            Class68_Sub13_Sub24.anInt3845 = 0;
            Canvas_Sub1.anInt50 = 0;
            GroundData.anInt679 = 0;
            Class68_Sub20_Sub17.anInt4436 = 0;
            Class68_Sub28_Sub1.anInt4497 = 0;
            Class83.anInt1527 = 0;
            Class68_Sub13_Sub16.anInt3703 = 0;
            Class128.anInt2223 = 0;
            Class68_Sub13_Sub25.anInt3862 = 0;
            Class68_Sub13_Sub37.anInt4054 = 0;
            Class59.anInt1105 = 0;
            Class68_Sub20_Sub8.anInt4273 = 0;
            GameSocket.anInt1133 = 0;
            Class68_Sub13_Sub2.anInt3456 = 0;
            Class68_Sub13_Sub7.anInt3553 = 0;
            GameSocket.anInt1129 = 0;
            Class1_Sub6.anInt2531 = 0;
            Class68_Sub10.anInt2913 = 0;
            Class113.anInt1906 = 0;
            Class68_Sub20_Sub2.anInt4191 = 0;
            Class35.anInt613 = 0;
            Class67.anInt1216 = 0;
            Class68_Sub13_Sub10.anInt3585 = 0;
            Stream.anInt2999 = 0;
            PacketStream.anInt4123 = 0;
            Class68_Sub20_Sub13_Sub2.anInt4628 = 0;
            Class51.anInt2253 = 0;
            Class124.anInt2133 = 0;
            Class68_Sub13_Sub28.anInt3925 = 0;
            GroundData.anInt670 = 0;
            Class45.anInt804 = 0;
            Applet_Sub1.anInt26 = 0;
            PacketStream.anInt4128 = 0;
            Class113.anInt1904 = 0;
            Class16.anInt258 = 0;
            GameSocket.anInt1120 = 0;
            Class68_Sub13_Sub30.anInt3950 = 0;
            anInt449 = 0;
            Stream.anInt2979 = 0;
            Class68_Sub13_Sub3.anInt3478 = 0;
            Class68_Sub20_Sub3.anInt4211 = 0;
            Class68_Sub28_Sub1.anInt4477 = 0;
            PacketStream.anInt4124 = 0;
            Class68_Sub20_Sub6.anInt4233 = 0;
            Class90.anInt2332 = 0;
            Class58.anInt1092 = 0;
            Class70.anInt1275 = 0;
            Class1_Sub7.anInt2594 = 0;
            Class69.anInt1258 = 0;
            Class68_Sub13_Sub38.anInt4083 = 0;
            Canvas_Sub1.anInt47 = 0;
            Class68_Sub13_Sub34.anInt4010 = 0;
            Class43.anInt735 = 0;
            Class68_Sub13_Sub37.anInt4068 = 0;
            Class115.anInt1956 = 0;
            Login.anInt1500 = 0;
            Class1_Sub6_Sub1.anInt3394 = 0;
            ISAACRandomGen.anInt1485 = 0;
            Class68_Sub20_Sub3.anInt4209 = 0;
            Class68_Sub20_Sub10.anInt4310 = 0;
            RSString.anInt2301 = 0;
            Class103.anInt1760 = 0;
            Class68_Sub6.anInt2840 = 0;
            Class86.anInt1570 = 0;
            Class80.anInt1472 = 0;
            PlayerDefinition.anInt2199 = 0;
            Class68_Sub3.anInt2806 = 0;
            Class68_Sub15.anInt3019 = 0;
            Class85.anInt1560 = 0;
            Class115.anInt1949 = 0;
            Class70.anInt1265 = 0;
            Class75_Sub3_Sub1.anInt4593 = 0;
            Class68_Sub13_Sub33.anInt3989 = 0;
            Class68_Sub13_Sub4.anInt3496 = 0;
            Class68_Sub18.anInt3055 = 0;
            GroundData.anInt685 = 0;
            Class49.anInt973 = 0;
            Class88.anInt1609 = 0;
            Class68_Sub13_Sub39.anInt4090 = 0;
            anInt440 = 0;
            Class90.anInt2352 = 0;
            Class68_Sub20_Sub3.anInt4203 = 0;
            Applet_Sub1.anInt1 = 0;
            Class68_Sub8.anInt2868 = 0;
            Class55.anInt2032 = 0;
            RSString.anInt2296 = 0;
            Class118.anInt2079 = 0;
            Class29.anInt536 = 0;
            Class68_Sub20_Sub9.anInt4299 = 0;
            Class3.anInt74 = 0;
            Class68_Sub20_Sub6.anInt4248 = 0;
            Class68_Sub28_Sub1.anInt4500 = 0;
            anInt445 = 0;
            Class68_Sub4.anInt2820 = 0;
            Class68_Sub28_Sub1.anInt4514 = 0;
            Class68_Sub13_Sub9.anInt3583 = 0;
            client.anInt2367 = 0;
            Class78.anInt1395 = 0;
            Class86.anInt1584 = 0;
            Class35.anInt611 = 0;
            Class68_Sub13_Sub11.anInt3601 = 0;
            Class68_Sub28_Sub2.anInt4532 = 0;
            GroundData.anInt661 = 0;
            GroundData.anInt660 = 0;
            PlayerDefinition.anInt2181 = 0;
            Class12.anInt210 = 0;
            RSString.anInt2321 = 0;
            Class96.anInt1698 = 0;
            Class92.anInt1651 = 0;
            Class105.anInt1791 = 0;
            Login.anInt1508 = 0;
            Class107.anInt1812 = 0;
            Class13_Sub1.anInt2630 = 0;
            Stream.anInt2990 = 0;
            Class103.anInt1770 = 0;
            anInt451 = 0;
            Class90.anInt2328 = 0;
            RSString.anInt2285 = 0;
            Class68_Sub4.anInt2824 = 0;
            Class51.anInt2248 = 0;
            Class14.anInt226 = 0;
            anInt436 = 0;
            Class35.anInt615 = 0;
            GroundData.anInt675 = 0;
            Class68_Sub13_Sub28.anInt3928 = 0;
            GameSocket.anInt1122 = 0;
            ItemDef.anInt364 = 0;
            Class90.anInt2356 = 0;
            Applet_Sub1.anInt34 = 0;
            Stream.anInt2973 = 0;
            PacketStream.anInt4112 = 0;
            Class68_Sub28_Sub1.anInt4515 = 0;
            Class36.anInt641 = 0;
            Class68_Sub20_Sub13.anInt4357 = 0;
            Class68_Sub13_Sub1.anInt3449 = 0;
            Applet_Sub1.anInt40 = 0;
            Class122.anInt2117 = 0;
            Stream.anInt2996 = 0;
            Class68_Sub13_Sub19.anInt3750 = 0;
            Class127.anInt2204 = 0;
            Class68_Sub13_Sub24.anInt3840 = 0;
            Animable.anInt62 = 0;
            Class68_Sub28_Sub1.anInt4481 = 0;
            Class68_Sub13_Sub8.anInt3563 = 0;
            Class68_Sub13_Sub39.anInt4107 = 0;
            Class113.anInt1910 = 0;
            Class1_Sub6.anInt2589 = 0;
            Class75_Sub3_Sub1.anInt4600 = 0;
            Class50_Sub2.anInt2732 = 0;
            Class68_Sub13_Sub39.anInt4091 = 0;
            Applet_Sub1.anInt38 = 0;
            anInt461 = 0;
            Class104.anInt1778 = 0;
            Class88.anInt1594 = 0;
            Stream.anInt2976 = 0;
            Class9.anInt176 = 0;
            Class98.anInt1729 = 0;
            Class68_Sub13_Sub30.anInt3954 = 0;
            Class4.anInt91 = 0;
            Stream.anInt2971 = 0;
            Class32.anInt572 = 0;
            Class68_Sub13_Sub36.anInt4034 = 0;
            Class68_Sub13_Sub26.anInt3886 = 0;
            Class18.anInt318 = 0;
            Class68_Sub13_Sub28.anInt3918 = 0;
            Class25.anInt514 = 0;
            Applet_Sub1.anInt11 = 0;
            Class68_Sub20_Sub13.anInt4358 = 0;
            Class80.anInt1459 = 0;
            anInt453 = 0;
            Class68_Sub13_Sub23.anInt3817 = 0;
            Class68_Sub13_Sub31.anInt3966 = 0;
            Class94.anInt1672 = 0;
            Class68_Sub20_Sub8.anInt4270 = 0;
            Class68_Sub13_Sub37.anInt4053 = 0;
            Class20.anInt416 = 0;
            Stream.anInt2978 = 0;
            Class68_Sub20_Sub11.anInt4324 = 0;
            Class68_Sub13_Sub17.anInt3718 = 0;
            Class44.anInt752 = 0;
            Class68_Sub20_Sub3.anInt4213 = 0;
            Class68_Sub28_Sub2.anInt4537 = 0;
            GroundData.anInt657 = 0;
            Class34.anInt601 = 0;
            Class68_Sub26.anInt3207 = 0;
            Class68_Sub20_Sub13_Sub2.anInt4626 = 0;
            Class101.anInt1741 = 0;
            Class68_Sub13_Sub27.anInt3890 = 0;
            RSString.anInt2290 = 0;
            Class55.anInt2068 = 0;
            Class1_Sub2.anInt2434 = 0;
            Class69.anInt1261 = 0;
            Class51.anInt2252 = 0;
            Class91.anInt1632 = 0;
            Class13.anInt219 = 0;
            Class72_Sub1.anInt3269 = 0;
            Class68_Sub13_Sub20.anInt3768 = 0;
            Class72_Sub1.anInt3258 = 0;
            Class75_Sub1.anInt3298 = 0;
            Class90.anInt2359 = 0;
            Class71_Sub1.anInt3252 = 0;
            Class68_Sub28_Sub1.anInt4499 = 0;
            Class68_Sub13_Sub13.anInt3661 = 0;
            Class123.anInt2126 = 0;
            Class47.anInt936 = 0;
            Class28.anInt532 = 0;
            Class68_Sub13_Sub5.anInt3514 = 0;
            Class21_Sub1.anInt2706 = 0;
            Class95.anInt1681 = 0;
            Class72_Sub1.anInt3266 = 0;
            Class13_Sub1.anInt2625 = 0;
            Class68_Sub20_Sub8.anInt4287 = 0;
            Class124.anInt2138 = 0;
            Class68_Sub13_Sub1.anInt3450 = 0;
            Class68_Sub20_Sub3.anInt4195 = 0;
            Class68_Sub22.anInt3147 = 0;
            Class1_Sub2.anInt2438 = 0;
            Class8.anInt154 = 0;
            client.anInt2373 = 0;
            Class1_Sub1.anInt2426 = 0;
            Class90.anInt2344 = 0;
            Class68_Sub20_Sub5.anInt4224 = 0;
            client.anInt2381 = 0;
            GameSocket.anInt1150 = 0;
            Class22.anInt487 = 0;
            Class45.anInt800 = 0;
            Class68_Sub13_Sub10.anInt3589 = 0;
            Class68_Sub28_Sub1.anInt4469 = 0;
            Class68_Sub20_Sub11.anInt4322 = 0;
            Class68_Sub13_Sub4.anInt3506 = 0;
            Class123.anInt2119 = 0;
            Class68_Sub13_Sub24.anInt3830 = 0;
            RSString.anInt2273 = 0;
            Class68_Sub28_Sub1.anInt4505 = 0;
            Stream.anInt2961 = 0;
            Stream.anInt2965 = 0;
            Class114.anInt1934 = 0;
            Class1_Sub2.anInt2437 = 0;
            Class72_Sub1.anInt3260 = 0;
            Class76.anInt1348 = 0;
            Class72_Sub1.anInt3286 = 0;
            Class72.anInt1315 = 0;
            Stream.anInt2953 = 0;
            GroundData.anInt674 = 0;
            anInt429 = 0;
            Class68_Sub13_Sub35.anInt4029 = 0;
            Class115.anInt1944 = 0;
            Class87.anInt1593 = 0;
            Animable.anInt65 = 0;
            Class90.anInt2331 = 0;
            Class68_Sub13_Sub36.anInt4041 = 0;
            Class68_Sub28_Sub1.anInt4458 = 0;
            ISAACRandomGen.anInt1494 = 0;
            Class68_Sub13_Sub15.anInt3678 = 0;
            Login.anInt1504 = 0;
            Class68_Sub13_Sub37.anInt4063 = 0;
            ISAACRandomGen.anInt1484 = 0;
            Class72.anInt1319 = 0;
            PlayerDefinition.anInt2195 = 0;
            Class68_Sub13_Sub23.anInt3827 = 0;
            Applet_Sub1.anInt9 = 0;
            anInt450 = 0;
            Class68_Sub20_Sub2.anInt4184 = 0;
            Class8.anInt158 = 0;
            Stream.anInt2968 = 0;
            Class4.anInt90 = 0;
            Class1_Sub5.anInt2497 = 0;
            Class68_Sub13_Sub38.anInt4080 = 0;
            Stream.anInt2948 = 0;
            Class70.anInt1272 = 0;
            Class68_Sub20_Sub11.anInt4329 = 0;
            Class101.anInt1737 = 0;
            Class14.anInt235 = 0;
            Class68_Sub13_Sub15.anInt3686 = 0;
            Class68_Sub13.anInt2925 = 0;
            Class58.anInt1094 = 0;
            Class3.anInt76 = 0;
            Class68_Sub20_Sub4.anInt4215 = 0;
            Class72_Sub1.anInt3275 = 0;
            Class58.anInt1096 = 0;
            Applet_Sub1.anInt3 = 0;
            Class1_Sub6_Sub1.anInt3397 = 0;
            Class90.anInt2336 = 0;
            Class70.anInt1263 = 0;
            Class68_Sub19.anInt3074 = 0;
            Applet_Sub1.anInt12 = 0;
            Unknown.anInt1629 = 0;
            Class64.anInt1193 = 0;
            Class68_Sub28_Sub1.anInt4484 = 0;
            Class90.anInt2337 = 0;
            Stream.anInt2947 = 0;
            Stream.anInt2972 = 0;
            Class68_Sub13_Sub19.anInt3747 = 0;
            Class68_Sub13_Sub25.anInt3850 = 0;
            Class22.anInt486 = 0;
            anInt443 = 0;
            Class68_Sub28_Sub1.anInt4523 = 0;
            Class11.anInt191 = 0;
            Class68_Sub28_Sub1.anInt4510 = 0;
            Class102.anInt1752 = 0;
            Class75_Sub2.anInt3308 = 0;
            Class68_Sub13_Sub20.anInt3776 = 0;
            Class114.anInt1936 = 0;
            Class53.anInt1019 = 0;
            Class49.anInt974 = 0;
            Class1_Sub7.anInt2616 = 0;
            Class68_Sub13_Sub3.anInt3465 = 0;
            Class13_Sub1.anInt2640 = 0;
            Class68_Sub13_Sub26_Sub1.anInt4611 = 0;
            Class84.anInt1534 = 0;
            Class68_Sub13_Sub27.anInt3889 = 0;
            GameSocket.anInt1140 = 0;
            Class68_Sub20_Sub15.anInt4388 = 0;
            Class58.anInt1088 = 0;
            Class68_Sub20_Sub10.anInt4308 = 0;
            Class54.anInt1031 = 0;
            Class51.anInt2249 = 0;
            Class68_Sub13_Sub39.anInt4096 = 0;
            Class68_Sub13_Sub11.anInt3623 = 0;
            Class104.anInt1785 = 0;
            Class68_Sub22.anInt3142 = 0;
            Class103.anInt1772 = 0;
            Class1_Sub6_Sub2.anInt3403 = 0;
            Class68_Sub24.anInt3155 = 0;
            Stream.anInt2956 = 0;
            PacketParser.anInt1865 = 0;
            Class68_Sub22.anInt3138 = 0;
            Class68_Sub19.anInt3072 = 0;
            ItemDef.anInt346 = 0;
            Class68_Sub13_Sub20.anInt3772 = 0;
            RSString.anInt2303 = 0;
            Class60.anInt1113 = 0;
            Class13_Sub4.anInt2691 = 0;
            Class68_Sub13_Sub8.anInt3557 = 0;
            ItemDef.anInt382 = 0;
            Class68_Sub13_Sub26.anInt3877 = 0;
            GroundData.anInt678 = 0;
            Class7.anInt128 = 0;
            Class68_Sub13_Sub7.anInt3549 = 0;
            Stream.anInt2991 = 0;
            Class15.aBoolean250 = true;
            Class68_Sub20_Sub2.method1041(-13893);
            Class49.anInt962 = -1;
            Class104.anInt1784 = 0;
            Class68_Sub20_Sub7.anInt4252 = -1;
            Class68_Sub20.anInt3086 = -1;
            stream.currentOffset = 0;
            Class68_Sub20_Sub6.anInt4240 = -1;
            Class16.anInt273 = 0;
            Class68_Sub20_Sub13.anInt4368 = 0;
            Class68_Sub13_Sub8.inStream.currentOffset = 0;
            for (int i_87_ = 0;
                 ((i_87_ ^ 0xffffffff)
                         > (Class34.aClass23Array594.length ^ 0xffffffff));
                 i_87_++)
                Class34.aClass23Array594[i_87_] = null;
            Class120.aBoolean2099 = false;
            Class68_Sub13_Sub21.anInt3803 = 0;
            Class86.method1482(0, 0);
            for (int i_88_ = 0; (i_88_ ^ 0xffffffff) > -101; i_88_++)
                Class55.aRSStringArray2067[i_88_] = null;
            Class68_Sub13_Sub32.anInt3981 = -1;
            Class21_Sub1.aBoolean2705 = false;
            Class68_Sub13_Sub26.anInt3883
                    = -60 + (int) (Math.random() * 120.0);
            Class1_Sub2.anInt2435 = 0;
            Class68_Sub13_Sub28.anInt3920 = (int) (Math.random() * 80.0) + -40;
            Class68_Sub3.anInt2805 = (int) (Math.random() * 100.0) + -50;
            Class13_Sub2.anInt2645 = 0;
            Class8.anInt163 = 0x7ff & (int) (20.0 * Math.random()) + -10;
            Class68_Sub9.anInt2882 = 0;
            Class95.anInt1684 = 0;
            Class22.anInt485 = 0;
            Class68_Sub20_Sub16.anInt4420 = (int) (Math.random() * 30.0) - 20;
            Class68_Sub13_Sub37.anInt4062 = 0;
            Class75_Sub2.anInt3315 = 0;
            client.anInt2382 = 0;
            Class68_Sub20_Sub9.anInt4291 = (int) (110.0 * Math.random()) - 55;
            for (int i_89_ = 0; (i_89_ ^ 0xffffffff) > -2049; i_89_++) {
                Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_89_] = null;
                Class68_Sub1.aStreamArray2755[i_89_] = null;
            }
            for (int i_90_ = 0; i_90_ < 32768; i_90_++)
                Class102.aClass1_Sub6_Sub1Array1746[i_90_] = null;
            Class68_Sub7.aClass1_Sub6_Sub2_2860
                    = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[2047]
                    = new Class1_Sub6_Sub2();
            Class45.aClass16_886.method284(105);
            Class105.aClass16_1790.method284(105);
            for (int i_91_ = 0; i_91_ < 4; i_91_++) {
                for (int i_92_ = 0; i_92_ < 104; i_92_++) {
                    for (int i_93_ = 0; (i_93_ ^ 0xffffffff) > -105; i_93_++)
                        Class45.aClass16ArrayArrayArray926[i_91_][i_92_][i_93_]
                                = null;
                }
            }
            Class68_Sub13_Sub31.aClass16_3963 = new Class16();
            Class32.anInt573 = 0;
            Class45.anInt917 = 0;
            Class119.method1735(i + -10953);
            Class68_Sub5.method663(0);
            Class68_Sub20_Sub12.anInt4354 = 0;
            Class68_Sub13_Sub31.anInt3977 = 0;
            Stream.anInt2954 = 0;
            Class8.anInt161 = 0;
            Class68_Sub13.anInt2943 = 0;
            Class72.anInt1321 = 0;
            Class68_Sub13_Sub37.anInt4067 = 0;
            PlayerDefinition.anInt2191 = 0;
            Class68_Sub24.anInt3160 = 0;
            Class125.anInt2167 = 0;
            for (int i_94_ = 0; i_94_ < Class106.anIntArray1809.length;
                 i_94_++)
                Class106.anIntArray1809[i_94_] = -1;
            if ((Class68_Sub13_Sub10.anInt3595 ^ 0xffffffff) != 0)
                ItemDef.method314(i ^ ~0x2ab3, Class68_Sub13_Sub10.anInt3595);
            for (Class68_Sub3 class68_sub3
                         = ((Class68_Sub3)
                    Login.aClass113_1512.method1679(-32642));
                 class68_sub3 != null;
                 class68_sub3 = (Class68_Sub3) Login.aClass113_1512
                         .method1683((byte) -115))
                Class68_Sub13_Sub10.method744(class68_sub3, true, true);
            Class68_Sub13_Sub10.anInt3595 = -1;
            Login.aClass113_1512 = new Class113(8);
            Class29.aClass45_539 = null;
            Class120.aBoolean2099 = false;
            Class68_Sub13_Sub21.anInt3803 = 0;
            Class68_Sub13_Sub33.aClass126_3991
                    .method1773(new int[5], null, false, (byte) -128, -1);
            for (int i_95_ = 0; i_95_ < 8; i_95_++) {
                Class127.aRSStringArray2207[i_95_] = null;
                Class118.aBooleanArray2078[i_95_] = false;
            }
            Login.method1469(121);
            Class68_Sub13_Sub28.aBoolean3919 = true;
            for (int i_96_ = 0; (i_96_ ^ 0xffffffff) > -101; i_96_++)
                Class121.aBooleanArray2109[i_96_] = true;
            Class68_Sub20_Sub8.anInt4278 = 0;
            Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630 = null;
            Class69.aRSString_1251 = null;
            for (int i_97_ = 0; (i_97_ ^ 0xffffffff) > -7; i_97_++)
                Class63.aClass49Array1171[i_97_] = new Class49();
            for (int i_98_ = 0; (i_98_ ^ 0xffffffff) > -26; i_98_++) {
                Class30.anIntArray548[i_98_] = 0;
                Class88.anIntArray1603[i_98_] = 0;
                Class1_Sub5.anIntArray2516[i_98_] = 0;
            }
            Class102.aBoolean1748 = true;
            Class63.aBoolean1170 = false;
            Class37.aRSString_653 = Class68_Sub13_Sub33.aRSString_3987;
            Class105.aShortArray1793 = Class33.aShortArray579
                    = Class68_Sub13_Sub25.aShortArray3854
                    = Class68_Sub20_Sub7.aShortArray4266 = new short[256];
            Class30.aClass16_541.method284(105);
            Class68_Sub20_Sub6.method1071((byte) -118);
        }
    }

    public byte[] method359(int i, int i_99_) {
        anInt429++;
        if (anIntArray448.length == 1)
            return method338(i_99_, 0, 0);
        if (!method346(i_99_, i))
            return null;
        if (anIntArray448[i_99_] == 1)
            return method338(0, i, i_99_);
        throw new RuntimeException();
    }

    public boolean method360(int i, int i_100_) {
        anInt443++;
        if (anIntArray448.length == 1)
            return method344(0, i, (byte) -116);
        if (!method346(i, i_100_))
            return false;
        if (anIntArray448[i] == 1)
            return method344(i, 0, (byte) -123);
        throw new RuntimeException();
    }

    public static boolean method361(int i, int i_101_, int i_102_) {
        int i_103_ = Class72.anIntArrayArrayArray1311[i][i_101_][i_102_];
        if (i_103_ == -Class68_Sub1.anInt2756)
            return false;
        if (i_103_ == Class68_Sub1.anInt2756)
            return true;
        int i_104_ = i_101_ << 7;
        int i_105_ = i_102_ << 7;
        if (Login.method1472(i_104_ + 1,
                (Class68_Sub20_Sub12.anIntArrayArrayArray4353[i]
                        [i_101_][i_102_]),
                i_105_ + 1)
                && Login.method1472(i_104_ + 128 - 1,
                (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [i][i_101_ + 1][i_102_]),
                i_105_ + 1)
                && Login.method1472(i_104_ + 128 - 1,
                (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [i][i_101_ + 1][i_102_ + 1]),
                i_105_ + 128 - 1)
                && Login.method1472(i_104_ + 1,
                (Class68_Sub20_Sub12.anIntArrayArrayArray4353
                        [i][i_101_][i_102_ + 1]),
                i_105_ + 128 - 1)) {
            Class72.anIntArrayArrayArray1311[i][i_101_][i_102_]
                    = Class68_Sub1.anInt2756;
            return true;
        }
        Class72.anIntArrayArrayArray1311[i][i_101_][i_102_]
                = -Class68_Sub1.anInt2756;
        return false;
    }

    public boolean method362(byte i, RSString class100,
                             RSString class100_106_) {
        try {
            if (i <= 42)
                anIntArray439 = null;
            class100 = class100.method1608((byte) -84);
            class100_106_ = class100_106_.method1608((byte) 37);
            int i_107_
                    = aClass109_444.method1657(class100.method1603(5745), -1);
            anInt449++;
            if (!method346(i_107_, 0))
                return false;
            int i_108_ = aClass109Array427[i_107_]
                    .method1657(class100_106_.method1603(5745), -1);
            return method344(i_107_, i_108_, (byte) -126);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("cj.E(" + i + ','
                            + (class100 != null ? "{...}" : "null")
                            + ','
                            + (class100_106_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public int method363(int i, RSString class100) {
        anInt455++;
        class100 = class100.method1608((byte) 120);
        if (i <= 125)
            method337(-21);
        int i_109_ = aClass109_444.method1657(class100.method1603(5745), -1);
        return method332(0, i_109_);
    }

    public Class21renamed(boolean bool, boolean bool_110_) {
        aBoolean447 = bool_110_;
        aBoolean426 = bool;
    }

    static {
        aRSString_478 = RSString.newRsString("<col=00ffff>");
    }
}
