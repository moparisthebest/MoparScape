/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GameException extends RuntimeException
{
    static MutableString aClass100_2232;
    static int anInt2233;
    static MutableString aClass100_2234;
    static int anInt2235;
    static int anInt2236;
    static int anInt2237;
    static Class21 aClass21_2238;
    static int anInt2239;
    static int anInt2240;
    String message;
    static MutableString aClass100_2242 = Class112.makeMutableString(43, " <col=ffffff>");
    static int anInt2243;
    static int anInt2244;
    static MutableString aClass100_2245;
    private static MutableString aClass100_2246;
    static int anInt2247;
    static Sprite aClass68_Sub20_Sub10_Sub1_2248;
    Throwable cause;

    static final Model method1799(int i, int i_0_, int i_1_, Model class1_sub3, int i_2_, Animation class117, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool)
    {
        try
        {
            long l = (((long) i_8_ << 32) + (long) ((i_3_ << 24) + (i_7_ << 16) + i_6_) + ((long) i_4_ << 48));
            anInt2240++;
            Model class1_sub3_10_ = (Model) Class121.aClass98_2102.getNodeForID(l);
            if (class1_sub3_10_ == null)
            {
                int i_11_;
                if (i_6_ == 1)
                    i_11_ = 9;
                else if (i_6_ != 2)
                {
                    if (i_6_ == 3)
                        i_11_ = 15;
                    else if (i_6_ == 4)
                        i_11_ = 18;
                    else
                        i_11_ = 21;
                } else
                    i_11_ = 12;
                int i_12_ = 3;
                int[] is = { 64, 96, 128 };
                int[][] is_13_ = new int[i_12_][i_11_];
                Class1_Sub4 class1_sub4 = new Class1_Sub4(i_11_ * i_12_ + 1, 2 * i_11_ * i_12_ - i_11_, 0);
                int i_14_ = class1_sub4.method131(0, 0, 0);
                for (int i_15_ = 0; i_12_ > i_15_; i_15_++)
                {
                    int i_16_ = is[i_15_];
                    int i_17_ = is[i_15_];
                    for (int i_18_ = 0; i_18_ < i_11_; i_18_++)
                    {
                        int i_19_ = (i_18_ << 11) / i_11_;
                        int i_20_ = (i_5_ + i_17_ * Class62.PRECOMPUTED_SINE_CACHE[i_19_] >> 16);
                        int i_21_ = i + i_16_ * Class62.PRECOMUPTED_COSINE_CACHE[i_19_] >> 16;
                        is_13_[i_15_][i_18_] = class1_sub4.method131(i_20_, 0, i_21_);
                    }
                }
                for (int i_22_ = 0; i_12_ > i_22_; i_22_++)
                {
                    int i_23_ = (256 * i_22_ + 128) / i_12_;
                    int i_24_ = 256 - i_23_;
                    short i_25_ = (short) ((((i_24_ * (i_8_ & 0x380) + (0x380 & i_4_) * i_23_) & 0x38000) + (((i_4_ & 0xfc00) * i_23_ + (0xfc00 & i_8_) * i_24_) & 0xfc0000) + (((0x7f & i_4_) * i_23_ + (0x7f & i_8_) * i_24_) & 0x7f00)) >> 8);
                    byte i_26_ = (byte) (i_23_ * i_3_ + i_7_ * i_24_ >> 8);
                    for (int i_27_ = 0; i_11_ > i_27_; i_27_++)
                    {
                        if (i_22_ != 0)
                        {
                            class1_sub4.method136(is_13_[i_22_ - 1][i_27_], (is_13_[i_22_ - 1][(i_27_ + 1) % i_11_]), (is_13_[i_22_][(i_27_ + 1) % i_11_]), (byte) 1, i_25_, i_26_);
                            class1_sub4.method136(is_13_[i_22_ - 1][i_27_], (is_13_[i_22_][(i_27_ + 1) % i_11_]), is_13_[i_22_][i_27_], (byte) 1, i_25_, i_26_);
                        } else
                            class1_sub4.method136(i_14_, (is_13_[0][(i_27_ + 1) % i_11_]), is_13_[0][i_27_], (byte) 1, i_25_, i_26_);
                    }
                }
                class1_sub3_10_ = class1_sub4.method127(64, 768, -50, -10, -50);
                Class121.aClass98_2102.addObject(class1_sub3_10_, l);
            }
            int i_28_ = 64 * i_6_ - 1;
            int i_29_ = -i_28_;
            int i_30_ = -i_28_;
            int i_31_ = i_28_;
            int i_32_ = i_28_;
            int i_33_ = class1_sub3.method89();
            if (bool)
            {
                if (i_0_ > 640 && i_0_ < 1408)
                    i_32_ += 128;
                if (i_0_ > 128 && i_0_ < 896)
                    i_29_ -= 128;
                if (i_0_ > 1664 || i_0_ < 384)
                    i_30_ -= 128;
                if (i_0_ > 1152 && i_0_ < 1920)
                    i_31_ += 128;
            }
            if (i_33_ < i_29_)
                i_33_ = i_29_;
            int i_34_ = class1_sub3.method84();
            if (i_34_ > i_31_)
                i_34_ = i_31_;
            int i_35_ = class1_sub3.method75();
            if (i_35_ < i_30_)
                i_35_ = i_30_;
            Class68_Sub20_Sub17 class68_sub20_sub17 = null;
            int i_36_ = class1_sub3.getHeight();
            if (class117 != null)
            {
                i_2_ = ((Animation) class117).anIntArray2037[i_2_];
                class68_sub20_sub17 = Class35.method432(i_2_ >> 16, (byte) -96);
                i_2_ &= 0xffff;
            }
            int i_37_ = 125 % ((-7 - i_9_) / 52);
            if (i_32_ < i_36_)
                i_36_ = i_32_;
            if (class68_sub20_sub17 == null)
            {
                class1_sub3_10_ = class1_sub3_10_.method81(true, true);
                class1_sub3_10_.method72((i_34_ - i_33_) / 2, 128, (i_36_ - i_35_) / 2);
                class1_sub3_10_.method92((i_33_ + i_34_) / 2, 0, (i_35_ + i_36_) / 2);
            } else
            {
                class1_sub3_10_ = class1_sub3_10_.method81(!class68_sub20_sub17.method1180(true, i_2_), true);
                class1_sub3_10_.method72((i_34_ - i_33_) / 2, 128, (i_36_ - i_35_) / 2);
                class1_sub3_10_.method92((i_33_ + i_34_) / 2, 0, (i_36_ + i_35_) / 2);
                class1_sub3_10_.method76(class68_sub20_sub17, i_2_);
            }
            if (i_0_ != 0)
                class1_sub3_10_.method90(i_0_);
            SpriteFactory class1_sub3_sub1 = (SpriteFactory) class1_sub3_10_;
            if (i_1_ != Player.fixZ(i_5_ + i_33_, GameSocket.plane, i_35_ + i) || Player.fixZ(i_34_ + i_5_, GameSocket.plane, i_36_ + i) != i_1_)
            {
                for (int i_38_ = 0; ((SpriteFactory) class1_sub3_sub1).anInt3357 > i_38_; i_38_++)
                    ((SpriteFactory) class1_sub3_sub1).anIntArray3336[i_38_] += Player.fixZ(((((SpriteFactory) class1_sub3_sub1).anIntArray3356[i_38_]) + i_5_), GameSocket.plane, i + (((SpriteFactory) class1_sub3_sub1).anIntArray3345[i_38_])) - i_1_;
                ((SpriteFactory) class1_sub3_sub1).aBoolean3347 = false;
            }
            return class1_sub3_10_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ua.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (class1_sub3 != null ? "{...}" : "null") + ',' + i_2_ + ',' + (class117 != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + bool + ')'));
        }
    }

    public static void method1800(int i)
    {
        aClass100_2232 = null;
        aClass100_2246 = null;
        aClass100_2234 = null;
        aClass100_2245 = null;
        aClass68_Sub20_Sub10_Sub1_2248 = null;
        aClass21_2238 = null;
        if (i != 64)
            method1804(false, 79, 66, (byte) 113, 45, null, (byte) 12);
        aClass100_2242 = null;
    }

    static final int method1801(int i, int i_39_)
    {
        anInt2239++;
        if (i_39_ <= 44)
            anInt2243 = 118;
        return 0x3ff & i;
    }

    static final void method1802(int i, int i_40_, int i_41_)
    {
        if (i >= 65)
        {
            anInt2235++;
            if (Class68_Sub13_Sub25.method824(i_40_, (byte) -2))
                Class1_Sub5.method142(i_41_, (Class68_Sub13_Sub36.widgetCache[i_40_]), 16);
        }
    }

    static final void method1803(int i, boolean bool, int i_42_, int i_43_, int i_44_, int i_45_, byte[] is, int i_46_, GroundData[] class38s, int i_47_, int i_48_)
    {
        try
        {
            anInt2247++;
            int i_49_ = -1;
            if (i_47_ < 67)
                aClass68_Sub20_Sub10_Sub1_2248 = null;
            Stream class68_sub14 = new Stream(is);
            for (;;)
            {
                int i_50_ = class68_sub14.method937(true);
                if (i_50_ == 0)
                    break;
                int i_51_ = 0;
                i_49_ += i_50_;
                for (;;)
                {
                    int i_52_ = class68_sub14.method912(255);
                    if (i_52_ == 0)
                        break;
                    i_51_ += i_52_ - 1;
                    int i_53_ = (i_51_ & 0xfc8) >> 6;
                    int i_54_ = i_51_ >> 12;
                    int i_55_ = class68_sub14.readUByte();
                    int i_56_ = i_51_ & 0x3f;
                    int i_57_ = i_55_ >> 2;
                    int i_58_ = i_55_ & 0x3;
                    if (i_54_ == i_46_ && i_45_ <= i_53_ && i_45_ + 8 > i_53_ && i_56_ >= i_42_ && i_42_ + 8 > i_56_)
                    {
                        ObjectDefinition class116 = Class1_Sub5.method140(110, i_49_);
                        int i_59_ = i_43_ + Class3.method183(i_58_, i_56_ & 0x7, (((ObjectDefinition) class116).anInt1990), i_53_ & 0x7, (((ObjectDefinition) class116).anInt1989), -120, i_44_);
                        int i_60_ = i_48_ + (Class68_Sub27.method1219(i_58_, ((ObjectDefinition) class116).anInt1990, i_44_, i_56_ & 0x7, ((ObjectDefinition) class116).anInt1989, 0x7 & i_53_, (byte) -128));
                        if (i_59_ > 0 && i_60_ > 0 && i_59_ < 103 && i_60_ < 103)
                        {
                            GroundData class38 = null;
                            if (!bool)
                            {
                                int i_61_ = i;
                                if (((Object1.byteGroundArray[1][i_59_][i_60_]) & 0x2) == 2)
                                    i_61_--;
                                if (i_61_ >= 0)
                                    class38 = class38s[i_61_];
                            }
                            Class68_Sub20_Sub17.method1181(class38, 1, bool, i_60_, 0x3 & i_58_ + i_44_, i_59_, i_57_, i, i, !bool, i_49_);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ua.D(" + i + ',' + bool + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ',' + (is != null ? "{...}" : "null") + ',' + i_46_ + ',' + (class38s != null ? "{...}" : "null") + ',' + i_47_ + ',' + i_48_ + ')'));
        }
    }

    static final void method1804(boolean bool, int i, int i_62_, byte i_63_, int i_64_, Class21_Sub1 class21_sub1, byte i_65_)
    {
        try
        {
            long l = (long) (i_64_ + (i_62_ << 16));
            anInt2236++;
            Class68_Sub20_Sub15 class68_sub20_sub15 = ((Class68_Sub20_Sub15) Keyboard.aClass113_2125.method1684(l, -58));
            if (i_65_ == 22 && class68_sub20_sub15 == null)
            {
                class68_sub20_sub15 = ((Class68_Sub20_Sub15) Class68_Sub20_Sub13.aClass113_4368.method1684(l, -47));
                if (class68_sub20_sub15 == null)
                {
                    class68_sub20_sub15 = ((Class68_Sub20_Sub15) Stream.aClass113_3010.method1684(l, 73));
                    if (class68_sub20_sub15 != null)
                    {
                        if (bool)
                        {
                            class68_sub20_sub15.unlinkSub();
                            Keyboard.aClass113_2125.method1683((byte) 123, class68_sub20_sub15, l);
                            Class56.anInt1067++;
                            NodeSubList.anInt2229--;
                        }
                    } else
                    {
                        if (!bool)
                        {
                            class68_sub20_sub15 = ((Class68_Sub20_Sub15) Class111.aClass113_1876.method1684(l, -100));
                            if (class68_sub20_sub15 != null)
                                return;
                        }
                        class68_sub20_sub15 = new Class68_Sub20_Sub15();
                        ((Class68_Sub20_Sub15) class68_sub20_sub15).aClass21_Sub1_4396 = class21_sub1;
                        ((Class68_Sub20_Sub15) class68_sub20_sub15).anInt4394 = i;
                        ((Class68_Sub20_Sub15) class68_sub20_sub15).aByte4393 = i_63_;
                        if (bool)
                        {
                            Keyboard.aClass113_2125.method1683((byte) 119, class68_sub20_sub15, l);
                            Class56.anInt1067++;
                        } else
                        {
                            Class68_Sub7.aClass128_2856.method1793(class68_sub20_sub15);
                            Stream.aClass113_3010.method1683((byte) 127, class68_sub20_sub15, l);
                            NodeSubList.anInt2229++;
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ua.F(" + bool + ',' + i + ',' + i_62_ + ',' + i_63_ + ',' + i_64_ + ',' + (class21_sub1 != null ? "{...}" : "null") + ',' + i_65_ + ')'));
        }
    }

    GameException(Throwable throwable, String string)
    {
        ((GameException) this).cause = throwable;
        ((GameException) this).message = string;
    }

    static
    {
        aClass100_2234 = Class112.makeMutableString(43, "http:)4)4");
        aClass100_2246 = Class112.makeMutableString(43, "glow1:");
        aClass100_2232 = aClass100_2246;
        anInt2233 = 0;
        aClass100_2245 = aClass100_2246;
    }
}
