/* Class68_Sub20_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub16 extends Class68_Sub20 {
    public int anInt4406;
    public int anInt4407 = 12800;
    public static int[] anIntArray4408 = new int[2];
    public int anInt4409 = -1;
    public int anInt4410;
    public static int anInt4411;
    public RSString aRSString_4412;
    public boolean aBoolean4413;
    public static RSString aRSString_4414
            = RSString.newRsString(" <col=00ff80>");
    public static int anInt4415;
    public static int[] anIntArray4416 = new int[256];
    public static Class65 aClass65_4417;
    public static int anInt4418;
    public int anInt4419 = 12800;
    public static int anInt4420;
    public static int anInt4421;
    public static int anInt4422 = -1;
    public int anInt4423;
    public static RSString aRSString_4424;
    public static Class92_Sub1 aClass92_Sub1_4425;
    public static int anInt4426;
    public static int anInt4427;
    public int anInt4428;
    public RSString aRSString_4429;
    public Class16 aClass16_4430;

    public void method1172(int i) {
        anInt4419 = i;
        anInt4415++;
        anInt4406 = 0;
        anInt4407 = 12800;
        anInt4410 = 0;
        for (Class68_Sub4 class68_sub4
                     = (Class68_Sub4) aClass16_4430.method293((byte) 76);
             class68_sub4 != null;
             class68_sub4
                     = (Class68_Sub4) aClass16_4430.method290((byte) -106)) {
            if ((class68_sub4.anInt2823 ^ 0xffffffff)
                    < (anInt4410 ^ 0xffffffff))
                anInt4410 = class68_sub4.anInt2823;
            if (anInt4407 > class68_sub4.anInt2822)
                anInt4407 = class68_sub4.anInt2822;
            if (anInt4419 > class68_sub4.anInt2817)
                anInt4419 = class68_sub4.anInt2817;
            if (class68_sub4.anInt2821 > anInt4406)
                anInt4406 = class68_sub4.anInt2821;
        }
    }

    public static void method1173(int i, boolean bool, int i_0_, byte[] is,
                                  int i_1_, GroundData[] class38s, int i_2_,
                                  int i_3_, boolean bool_4_, int i_5_,
                                  int i_6_) {
        try {
            if (bool != false)
                anIntArray4408 = null;
            if (!bool_4_) {
                for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -9; i_7_++) {
                    for (int i_8_ = 0; i_8_ < 8; i_8_++) {
                        if (i_7_ + i_0_ > 0
                                && (i_0_ + i_7_ ^ 0xffffffff) > -104
                                && (i_6_ + i_8_ ^ 0xffffffff) < -1
                                && (i_6_ - -i_8_ ^ 0xffffffff) > -104)
                            class38s[i_3_].anIntArrayArray681[i_0_ - -i_7_]
                                    [i_8_ + i_6_]
                                    = Class120.method1740((class38s[i_3_]
                                    .anIntArrayArray681
                                    [i_0_ - -i_7_]
                                    [i_8_ + i_6_]),
                                    -16777217);
                    }
                }
            }
            anInt4426++;
            int i_9_;
            if (bool_4_)
                i_9_ = 1;
            else
                i_9_ = 4;
            Stream class68_sub14 = new Stream(is);
            for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
                for (int i_11_ = 0; i_11_ < 64; i_11_++) {
                    for (int i_12_ = 0; i_12_ < 64; i_12_++) {
                        if ((i_5_ ^ 0xffffffff) != (i_10_ ^ 0xffffffff)
                                || i > i_11_ || i_11_ >= 8 + i
                                || (i_1_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff)
                                || (i_1_ - -8 ^ 0xffffffff) >= (i_12_
                                ^ 0xffffffff))
                            Class96.method1554(bool_4_, -1, 0, 0,
                                    class68_sub14, 0, 0, (byte) 118,
                                    -1);
                        else
                            Class96.method1554
                                    (bool_4_,
                                            (i_0_
                                                    + Class68_Sub13_Sub17.method780(i_2_,
                                                    0x7 & i_12_,
                                                    0x7 & i_11_,
                                                    -27039)),
                                            0, 0, class68_sub14, i_3_, i_2_, (byte) 37,
                                            Animable.method54((byte) -94, i_2_, i_12_ & 0x7,
                                                    i_11_ & 0x7) + i_6_);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("uf.E(" + i + ',' + bool + ',' + i_0_
                            + ',' + (is != null ? "{...}" : "null")
                            + ',' + i_1_ + ','
                            + (class38s != null ? "{...}" : "null")
                            + ',' + i_2_ + ',' + i_3_ + ','
                            + bool_4_ + ',' + i_5_ + ',' + i_6_
                            + ')'));
        }
    }

    public boolean method1174(int i, int i_13_, int i_14_) {
        anInt4427++;
        if ((anInt4419 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)
                || i_13_ > anInt4410
                || (i_14_ ^ 0xffffffff) > (anInt4407 ^ 0xffffffff)
                || anInt4406 < i_14_)
            return false;
        Class68_Sub4 class68_sub4
                = (Class68_Sub4) aClass16_4430.method293((byte) 76);
        int i_15_ = -107 / ((-26 - i) / 57);
        for (/**/; class68_sub4 != null;
                 class68_sub4
                         = (Class68_Sub4) aClass16_4430.method290((byte) 109)) {
            if (class68_sub4.method656(i_13_, -9710, i_14_))
                return true;
        }
        return false;
    }

    public static void method1175(int i) {
        aClass92_Sub1_4425 = null;
        aRSString_4414 = null;
        if (i != 25465)
            anIntArray4408 = null;
        aRSString_4424 = null;
        anIntArray4408 = null;
        anIntArray4416 = null;
        aClass65_4417 = null;
    }

    public static int method1176(int i, int i_16_) {
        if (i_16_ != 255)
            return 40;
        anInt4421++;
        return i & 0xff;
    }

    public static void method1177(int i, Class21renamed class21, boolean bool,
                                  Class21renamed class21_17_) {
        try {
            Class68_Sub20_Sub3.aClass21_4192 = class21;
            if (i != 12800)
                method1176(62, 98);
            anInt4411++;
            Class68_Sub27.aBoolean3220 = bool;
            Class68_Sub28_Sub1.aClass21_4478 = class21_17_;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("uf.F(" + i + ','
                            + (class21 != null ? "{...}" : "null")
                            + ',' + bool + ','
                            + (class21_17_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public Class68_Sub20_Sub16(RSString class100, RSString class100_18_, int i,
                               int i_19_, int i_20_, boolean bool) {
        anInt4406 = 0;
        anInt4410 = 0;
        aBoolean4413 = true;
        try {
            anInt4409 = i_20_;
            aBoolean4413 = bool;
            aRSString_4429 = class100_18_;
            anInt4423 = i;
            anInt4428 = i_19_;
            aRSString_4412 = class100;
            aClass16_4430 = new Class16();
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("uf.<init>("
                            + (class100 != null ? "{...}" : "null")
                            + ','
                            + (class100_18_ != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_19_ + ',' + i_20_
                            + ',' + bool + ')'));
        }
    }

    static {
        anInt4420 = 0;
        aRSString_4424 = RSString.newRsString("l");
        aClass92_Sub1_4425 = null;
        anInt4418 = 0;
    }
}
