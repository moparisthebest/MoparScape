/* Class21_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class21_Sub1 extends Class21renamed {
    public static int[] anIntArray2693 = new int[2];
    public static int anInt2694;
    public static RSString aRSString_2695;
    public volatile boolean aBoolean2696;
    public int anInt2697;
    public static RSString aRSString_2698
            = RSString.newRsString("Musik)2Engine vorbereitet)3");
    public Unknown aUnknown_2699;
    public static int anInt2700;
    public int anInt2701;
    public static RSString aRSString_2702;
    public static long[] aLongArray2703;
    public boolean aBoolean2704 = false;
    public static boolean aBoolean2705;
    public static int anInt2706;
    public static int anInt2707;
    public int anInt2708;
    public static int anInt2709;
    public static RSString[] aRSStringArray2710;
    public int anInt2711;
    public static int anInt2712;
    public Unknown aUnknown_2713;
    public static int anInt2714;
    public static int anInt2715;
    public static int anInt2716;
    public volatile boolean[] aBooleanArray2717;
    public static int anInt2718;
    public static int anInt2719;

    public void method334(int i, byte i_0_) {
        anInt2707++;
        if (i_0_ < 84)
            aBoolean2704 = true;
        if (this.method346(i, 0))
            Class20.method326(anInt2697, i, true);
    }

    public void method364(int i, boolean bool, byte[] is, Unknown unknown,
                          int i_1_) {
        try {
            anInt2712++;
            if (unknown != aUnknown_2713) {
                if (!bool && i_1_ == anInt2711)
                    aBoolean2696 = true;
                if (is == null || is.length <= 2) {
                    aBooleanArray2717[i_1_] = false;
                    if (aBoolean2704 || bool)
                        GameException.method1798(bool,
                                anIntArray468[i_1_],
                                anInt2697, (byte) 2,
                                i_1_, this,
                                (byte) 22);
                    return;
                }
                PacketParser.aCRC32_1872.reset();
                PacketParser.aCRC32_1872.update(is, 0, -2 + is.length);
                int i_2_ = (int) PacketParser.aCRC32_1872.getValue();
                int i_3_ = ((0xff & is[-1 + is.length])
                        + (is[-2 + is.length] << -1474592440 & 0xff00));
                if ((anIntArray468[i_1_] ^ 0xffffffff) != (i_2_ ^ 0xffffffff)
                        || i_3_ != anIntArray474[i_1_]) {
                    aBooleanArray2717[i_1_] = false;
                    if (aBoolean2704 || bool)
                        GameException.method1798(bool,
                                anIntArray468[i_1_],
                                anInt2697, (byte) 2,
                                i_1_, this,
                                (byte) 22);
                    return;
                }
                aBooleanArray2717[i_1_] = true;
                if (bool)
                    anObjectArray435[i_1_]
                            = Class120.method1739(false, (byte) -126, is);
            } else {
                if (aBoolean2696)
                    throw new RuntimeException();
                if (is == null) {
                    GameException.method1798(true, anInt2701, 255,
                            (byte) 0, anInt2697, this,
                            (byte) 22);
                    return;
                }
                PacketParser.aCRC32_1872.reset();
                PacketParser.aCRC32_1872.update(is, 0, is.length);
                int i_4_ = (int) PacketParser.aCRC32_1872.getValue();
                if ((anInt2701 ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
                    GameException.method1798(true, anInt2701, 255,
                            (byte) 0, anInt2697, this,
                            (byte) 22);
                    return;
                }
                Stream class68_sub14;
                try {
                    class68_sub14
                            = new Stream(RSString.method1612(is, true));
                } catch (RuntimeException runtimeexception) {
                    GameException.method1798(true, anInt2701, 255,
                            (byte) 0, anInt2697, this,
                            (byte) 22);
                    return;
                }
                int i_5_ = class68_sub14.readUnsignedByte(-6677);
                if ((i_5_ ^ 0xffffffff) != -6 && i_5_ != 6) {
                    GameException.method1798(true, anInt2701, 255,
                            (byte) 0, anInt2697, this,
                            (byte) 22);
                    return;
                }
                int i_6_ = 0;
                if (i_5_ >= 6)
                    i_6_ = class68_sub14.readDWord();
                if ((i_6_ ^ 0xffffffff) != (anInt2708 ^ 0xffffffff)) {
                    GameException.method1798(true, anInt2701, 255,
                            (byte) 0, anInt2697, this,
                            (byte) 22);
                    return;
                }
                this.method349(is, -25529);
                method372(-1);
            }
            int i_7_ = -14 / ((i - 77) / 41);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("sg.OA(" + i + ',' + bool + ','
                            + (is != null ? "{...}" : "null") + ','
                            + (unknown != null ? "{...}" : "null")
                            + ',' + i_1_ + ')'));
        }
    }

    public int method365(int i) {
        anInt2715++;
        if (aBoolean2696)
            return 100;
        if (anObjectArray435 != null)
            return 99;
        int i_8_ = Class68_Sub24.method1209(0, anInt2697, 255);
        if ((i_8_ ^ 0xffffffff) <= -101)
            i_8_ = 99;
        int i_9_ = 120 / ((i - -13) / 59);
        return i_8_;
    }

    public static void method366(int i) {
        anInt2709++;
        Class68_Sub13_Sub2.aClass98_3459.method1567(-114);
        if (i >= 29)
            Class75_Sub1_Sub1.aClass98_4577.method1567(-50);
    }

    public static boolean method367(int i, int i_10_) {
        if (i_10_ != -1)
            method370(-14);
        anInt2718++;
        if (i != (-i & i))
            return false;
        return true;
    }

    public Class21_Sub1(Unknown unknown, Unknown unknown_11_, int i,
                        boolean bool, boolean bool_12_, boolean bool_13_) {
        super(bool, bool_12_);
        aBoolean2696 = false;
        anInt2711 = -1;
        try {
            anInt2697 = i;
            aUnknown_2713 = unknown_11_;
            aUnknown_2699 = unknown;
            aBoolean2704 = bool_13_;
            Class72.method1360(this, -5720, anInt2697);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("sg.<init>("
                            + (unknown != null ? "{...}" : "null")
                            + ','
                            + (unknown_11_ != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + bool + ',' + bool_12_
                            + ',' + bool_13_ + ')'));
        }
    }

    public int method332(int i, int i_14_) {
        anInt2694++;
        if (!this.method346(i_14_, i))
            return 0;
        if (anObjectArray435[i_14_] != null)
            return 100;
        if (aBooleanArray2717[i_14_])
            return 100;
        return Class68_Sub24.method1209(0, i_14_, anInt2697);
    }

    public void method368(int i, byte i_15_, int i_16_) {
        anInt2706++;
        anInt2701 = i_16_;
        anInt2708 = i;
        if (aUnknown_2713 != null)
            Class60.method586(aUnknown_2713, this, 1, anInt2697);
        else
            GameException.method1798(true, anInt2701, 255, (byte) 0,
                    anInt2697, this, (byte) 22);
        if (i_15_ <= 76)
            aLongArray2703 = null;
    }

    public static void method369(int i, int i_17_, int i_18_, int i_19_,
                                 int i_20_, int i_21_, byte i_22_, int i_23_) {
        anInt2716++;
        int i_24_ = 0;
        if (i_22_ < -58) {
            int i_25_ = i_17_;
            int i_26_ = 0;
            int i_27_ = i_21_ + -i;
            int i_28_ = i_21_ * i_21_;
            int i_29_ = -i + i_17_;
            int i_30_ = i_17_ * i_17_;
            int i_31_ = i_27_ * i_27_;
            int i_32_ = i_29_ * i_29_;
            int i_33_ = i_30_ << -1237884991;
            int i_34_ = i_28_ << -1926222943;
            int i_35_ = i_32_ << -537209631;
            int i_36_ = i_31_ << 1572030849;
            int i_37_ = i_29_ << 724144353;
            int i_38_ = i_17_ << -677379135;
            int i_39_ = i_30_ + -((i_38_ + -1) * i_34_);
            int i_40_ = (1 - i_38_) * i_28_ + i_33_;
            int i_41_ = i_31_ * (-i_37_ + 1) - -i_35_;
            int i_42_ = i_28_ << 1081088002;
            int i_43_ = i_32_ + -(i_36_ * (i_37_ - 1));
            int i_44_ = i_31_ << -406053726;
            int i_45_ = i_30_ << 1232063042;
            int i_46_ = i_32_ << -1319405822;
            int i_47_ = i_35_ * 3;
            int i_48_ = i_33_ * 3;
            int i_49_ = i_36_ * (-3 + i_37_);
            int i_50_ = i_34_ * (-3 + i_38_);
            int i_51_ = i_45_;
            int i_52_ = (-1 + i_17_) * i_42_;
            int i_53_ = (-1 + i_29_) * i_44_;
            int[] is = Class68_Sub22.anIntArrayArray3132[i_23_];
            int i_54_ = i_46_;
            Class34.method416(-i_21_ + i_19_, (byte) -17, i_18_, is,
                    -i_27_ + i_19_);
            Class34.method416(-i_27_ + i_19_, (byte) -17, i_20_, is,
                    i_27_ + i_19_);
            Class34.method416(i_27_ + i_19_, (byte) -17, i_18_, is,
                    i_21_ + i_19_);
            while (i_25_ > 0) {
                if ((i_40_ ^ 0xffffffff) > -1) {
                    while ((i_40_ ^ 0xffffffff) > -1) {
                        i_24_++;
                        i_40_ += i_48_;
                        i_39_ += i_51_;
                        i_51_ += i_45_;
                        i_48_ += i_45_;
                    }
                }
                boolean bool = (i_25_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff);
                if (bool) {
                    if (i_41_ < 0) {
                        while ((i_41_ ^ 0xffffffff) > -1) {
                            i_26_++;
                            i_43_ += i_54_;
                            i_41_ += i_47_;
                            i_54_ += i_46_;
                            i_47_ += i_46_;
                        }
                    }
                    if ((i_43_ ^ 0xffffffff) > -1) {
                        i_41_ += i_47_;
                        i_43_ += i_54_;
                        i_26_++;
                        i_54_ += i_46_;
                        i_47_ += i_46_;
                    }
                    i_41_ += -i_53_;
                    i_43_ += -i_49_;
                    i_49_ -= i_44_;
                    i_53_ -= i_44_;
                }
                if ((i_39_ ^ 0xffffffff) > -1) {
                    i_40_ += i_48_;
                    i_39_ += i_51_;
                    i_24_++;
                    i_48_ += i_45_;
                    i_51_ += i_45_;
                }
                i_40_ += -i_52_;
                i_25_--;
                int i_55_ = i_19_ - -i_24_;
                int i_56_ = i_23_ - -i_25_;
                i_52_ -= i_42_;
                int i_57_ = i_23_ + -i_25_;
                int i_58_ = -i_24_ + i_19_;
                i_39_ += -i_50_;
                if (!bool) {
                    Class34.method416(i_58_, (byte) -17, i_18_,
                            Class68_Sub22.anIntArrayArray3132[i_57_],
                            i_55_);
                    Class34.method416(i_58_, (byte) -17, i_18_,
                            Class68_Sub22.anIntArrayArray3132[i_56_],
                            i_55_);
                } else {
                    int i_59_ = i_19_ + i_26_;
                    int i_60_ = i_19_ + -i_26_;
                    Class34.method416(i_58_, (byte) -17, i_18_,
                            Class68_Sub22.anIntArrayArray3132[i_57_],
                            i_60_);
                    Class34.method416(i_60_, (byte) -17, i_20_,
                            Class68_Sub22.anIntArrayArray3132[i_57_],
                            i_59_);
                    Class34.method416(i_59_, (byte) -17, i_18_,
                            Class68_Sub22.anIntArrayArray3132[i_57_],
                            i_55_);
                    Class34.method416(i_58_, (byte) -17, i_18_,
                            Class68_Sub22.anIntArrayArray3132[i_56_],
                            i_60_);
                    Class34.method416(i_60_, (byte) -17, i_20_,
                            Class68_Sub22.anIntArrayArray3132[i_56_],
                            i_59_);
                    Class34.method416(i_59_, (byte) -17, i_18_,
                            Class68_Sub22.anIntArrayArray3132[i_56_],
                            i_55_);
                }
                i_50_ -= i_42_;
            }
        }
    }

    public void method331(byte i, int i_61_) {
        anInt2719++;
        if (this.method346(i_61_, 0)) {
            if (aUnknown_2699 == null || aBooleanArray2717 == null
                    || !aBooleanArray2717[i_61_])
                GameException.method1798(true, anIntArray468[i_61_],
                        anInt2697, (byte) 2, i_61_,
                        this, (byte) 22);
            else
                Class60.method586(aUnknown_2699, this, 1, i_61_);
            if (i > -103)
                anIntArray2693 = null;
        }
    }

    public static void method370(int i) {
        aRSString_2702 = null;
        if (i != -677379135)
            method366(107);
        aRSString_2698 = null;
        aLongArray2703 = null;
        aRSString_2695 = null;
        anIntArray2693 = null;
        aRSStringArray2710 = null;
    }

    public void method371(boolean bool, boolean bool_62_, int i, int i_63_,
                          byte[] is) {
        if (i_63_ >= 122) {
            anInt2700++;
            if (bool_62_) {
                if (aBoolean2696)
                    throw new RuntimeException();
                if (aUnknown_2713 != null)
                    Class16.method285(anInt2697, is, -30372, aUnknown_2713);
                this.method349(is, -25529);
                method372(-1);
            } else {
                is[is.length + -2] = (byte) (anIntArray474[i] >> 840888328);
                is[is.length - 1] = (byte) anIntArray474[i];
                if (aUnknown_2699 != null) {
                    Class16.method285(i, is, -30372, aUnknown_2699);
                    aBooleanArray2717[i] = true;
                }
                if (bool)
                    anObjectArray435[i]
                            = Class120.method1739(false, (byte) 71, is);
            }
        }
    }

    public void method372(int i) {
        anInt2714++;
        aBooleanArray2717 = new boolean[anObjectArray435.length];
        for (int i_64_ = 0;
             (i_64_ ^ 0xffffffff) > (aBooleanArray2717.length ^ 0xffffffff);
             i_64_++)
            aBooleanArray2717[i_64_] = false;
        if (aUnknown_2699 == null)
            aBoolean2696 = true;
        else {
            anInt2711 = i;
            for (int i_65_ = 0; ((aBooleanArray2717.length ^ 0xffffffff)
                    < (i_65_ ^ 0xffffffff)); i_65_++) {
                if ((anIntArray441[i_65_] ^ 0xffffffff) < -1) {
                    Class68_Sub25.method1213(this, (byte) -119, aUnknown_2699,
                            i_65_);
                    anInt2711 = i_65_;
                }
            }
            if ((anInt2711 ^ 0xffffffff) == 0)
                aBoolean2696 = true;
        }
    }

    static {
        aRSString_2695 = RSString.newRsString("<col=ffffff>");
        aLongArray2703 = new long[100];
        aBoolean2705 = false;
        aRSStringArray2710 = new RSString[1000];
        aRSString_2702 = RSString.newRsString("(Udns");
    }
}
