/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class43 {
    public int[] anIntArray731;
    public static int anInt732;
    public Class68_Sub20_Sub14 aClass68_Sub20_Sub14_733;
    public static Unknown aUnknown_734;
    public static int anInt735;
    public int anInt736 = -1;
    public static int anInt737;
    public RSString[] aRSStringArray738;
    public static int anInt739 = 0;
    public static int anInt740;
    public static boolean aBoolean741 = true;

    public static void method480(int i, int i_0_) {
        anInt737++;
        if (Class68_Sub13_Sub25.method824(i, (byte) -2))
            Class18.method302(0, Class68_Sub13_Sub36.aClass45ArrayArray4040[i],
                    i_0_);
    }

    public static void method481(int i, Class21renamed class21) {
        if (i != 3)
            aUnknown_734 = null;
        Class68_Sub13.aClass92_Sub1Array2921
                = Animable.method59(Class68_Sub20_Sub15.anInt4402, class21, false);
        anInt740++;
        Class68_Sub25.anIntArray3172 = new int[256];
        for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -4; i_1_++) {
            float f = (float) (0xff & (Class68_Sub13_Sub21.anIntArray3786[i_1_]
                    >> -2137176912));
            int i_2_ = 0xff & (Class68_Sub13_Sub21.anIntArray3786[1 + i_1_]
                    >> -1319431152);
            float f_3_ = (float) ((Class68_Sub13_Sub21.anIntArray3786[i_1_]
                    >> -1218847512)
                    & 0xff);
            float f_4_ = (-f + (float) i_2_) / 64.0F;
            int i_5_
                    = (Class68_Sub13_Sub21.anIntArray3786[i_1_ + 1] >> 1406699464
                    & 0xff);
            float f_6_ = (-f_3_ + (float) i_5_) / 64.0F;
            float f_7_
                    = (float) (0xff & Class68_Sub13_Sub21.anIntArray3786[i_1_]);
            int i_8_ = Class68_Sub13_Sub21.anIntArray3786[i_1_ - -1] & 0xff;
            float f_9_ = ((float) i_8_ - f_7_) / 64.0F;
            for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -65; i_10_++) {
                Class68_Sub25.anIntArray3172[i_10_ + 64 * i_1_]
                        = Class70.method1335((int) f_7_,
                        Class70.method1335(((int) f
                                << -1933748848),
                                ((int) f_3_
                                        << -892646456)));
                f_3_ += f_6_;
                f += f_4_;
                f_7_ += f_9_;
            }
        }
        for (int i_11_ = 192; (i_11_ ^ 0xffffffff) > -256; i_11_++)
            Class68_Sub25.anIntArray3172[i_11_]
                    = Class68_Sub13_Sub21.anIntArray3786[3];
        Class68_Sub19.anIntArray3077 = new int[32768];
        Class68_Sub20_Sub6.anIntArray4230 = new int[32768];
        Class84.method1476(i + 96, null);
        Class90.anIntArray2345 = new int[32768];
        Class68_Sub20.anIntArray3090 = new int[32768];
        GameException.aSprite_2246
                = new Sprite(128, 254);
    }

    public static void method482(int i) {
        if (i != -2)
            anInt739 = -115;
        aUnknown_734 = null;
    }

    public static void method483(int i, int i_12_, int i_13_, int i_14_,
                                 int i_15_, byte i_16_, int i_17_, int i_18_) {
        anInt735++;
        if (i_16_ > 115) {
            if ((i_15_ ^ 0xffffffff) <= -1 && (i ^ 0xffffffff) <= -1
                    && (i_15_ ^ 0xffffffff) > -104 && (i ^ 0xffffffff) > -104) {
                if (i_18_ == 0) {
                    Class64 class64
                            = Class68_Sub13_Sub6.method724(i_13_, i_15_, i);
                    if (class64 != null) {
                        int i_19_ = 0x7fffffff & (int) (class64.aLong1185
                                >>> -44778016);
                        if ((i_12_ ^ 0xffffffff) != -3)
                            class64.aClass1_1181
                                    = new Class1_Sub7(i_19_, i_12_, i_14_, i_13_,
                                    i_15_, i, i_17_, false,
                                    class64.aClass1_1181);
                        else {
                            class64.aClass1_1181
                                    = new Class1_Sub7(i_19_, 2, i_14_ + 4, i_13_,
                                    i_15_, i, i_17_, false,
                                    class64.aClass1_1181);
                            class64.aClass1_1184
                                    = new Class1_Sub7(i_19_, 2, 0x3 & 1 + i_14_,
                                    i_13_, i_15_, i, i_17_,
                                    false, class64.aClass1_1184);
                        }
                    }
                }
                if ((i_18_ ^ 0xffffffff) == -2) {
                    Class76 class76 = Class26.method388(i_13_, i_15_, i);
                    if (class76 != null) {
                        int i_20_ = ((int) (class76.aLong1364 >>> -1175873888)
                                & 0x7fffffff);
                        if (i_12_ != 4 && (i_12_ ^ 0xffffffff) != -6) {
                            if (i_12_ == 6)
                                class76.aClass1_1358
                                        = new Class1_Sub7(i_20_, 4, i_14_ - -4,
                                        i_13_, i_15_, i, i_17_,
                                        false,
                                        class76.aClass1_1358);
                            else if (i_12_ == 7)
                                class76.aClass1_1358
                                        = new Class1_Sub7(i_20_, 4,
                                        (2 + i_14_ & 0x3) + 4,
                                        i_13_, i_15_, i, i_17_,
                                        false,
                                        class76.aClass1_1358);
                            else if ((i_12_ ^ 0xffffffff) == -9) {
                                class76.aClass1_1358
                                        = new Class1_Sub7(i_20_, 4, 4 + i_14_,
                                        i_13_, i_15_, i, i_17_,
                                        false,
                                        class76.aClass1_1358);
                                class76.aClass1_1360
                                        = new Class1_Sub7(i_20_, 4,
                                        (2 + i_14_ & 0x3) - -4,
                                        i_13_, i_15_, i, i_17_,
                                        false,
                                        class76.aClass1_1360);
                            }
                        } else
                            class76.aClass1_1358
                                    = new Class1_Sub7(i_20_, 4, i_14_, i_13_,
                                    i_15_, i, i_17_, false,
                                    class76.aClass1_1358);
                    }
                }
                if (i_18_ == 2) {
                    if (i_12_ == 11)
                        i_12_ = 10;
                    Class69 class69 = Class102.method1627(i_13_, i_15_, i);
                    if (class69 != null)
                        class69.aClass1_1242
                                = new Class1_Sub7(((int) (class69.aLong1243
                                >>> 892662880)
                                & 0x7fffffff),
                                i_12_, i_14_, i_13_, i_15_, i,
                                i_17_, false,
                                class69.aClass1_1242);
                }
                if ((i_18_ ^ 0xffffffff) == -4) {
                    Class47 class47
                            = Class68_Sub13_Sub28.method848(i_13_, i_15_, i);
                    if (class47 != null)
                        class47.aClass1_931
                                = new Class1_Sub7((0x7fffffff
                                & (int) (class47.aLong943
                                >>> -1374568992)),
                                22, i_14_, i_13_, i_15_, i,
                                i_17_, false,
                                class47.aClass1_931);
                }
            }
        }
    }
}
