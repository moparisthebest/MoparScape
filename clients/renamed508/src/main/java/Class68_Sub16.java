/* Class68_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub16 extends Node
{
    byte[] aByteArray3023;
    static int anInt3024;
    static int anInt3025;
    static Class105 aClass105_3026;
    static int anInt3027;
    private static MutableString aClass100_3028 = Class112.makeMutableString(43, "wishes to trade with you)3");
    static MutableString aClass100_3029 = aClass100_3028;
    static Class103 aClass103_3030;
    static int[] anIntArray3031;
    static Class68_Sub20_Sub10[] aClass68_Sub20_Sub10Array3032;
    static Class65 aClass65_3033;

    static final void method983(Class7 class7, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool)
    {
        int i_7_;
        int i_6_ = i_7_ = (i_4_ << 7) - Class25.anInt518;
        int i_9_;
        int i_8_ = i_9_ = (i_5_ << 7) - Class68_Sub20_Sub12.anInt4357;
        int i_11_;
        int i_10_ = i_11_ = i_6_ + 128;
        int i_13_;
        int i_12_ = i_13_ = i_8_ + 128;
        int i_14_ = (Class68_Sub20_Sub12.intGroundArray[i][i_4_][i_5_] - Class68_Sub17.anInt3035);
        int i_15_ = (Class68_Sub20_Sub12.intGroundArray[i][i_4_ + 1][i_5_] - Class68_Sub17.anInt3035);
        int i_16_ = ((Class68_Sub20_Sub12.intGroundArray[i][i_4_ + 1][i_5_ + 1]) - Class68_Sub17.anInt3035);
        int i_17_ = (Class68_Sub20_Sub12.intGroundArray[i][i_4_][i_5_ + 1] - Class68_Sub17.anInt3035);
        int i_18_ = i_8_ * i_2_ + i_6_ * i_3_ >> 16;
        i_8_ = i_8_ * i_3_ - i_6_ * i_2_ >> 16;
        i_6_ = i_18_;
        i_18_ = i_14_ * i_1_ - i_8_ * i_0_ >> 16;
        i_8_ = i_14_ * i_0_ + i_8_ * i_1_ >> 16;
        i_14_ = i_18_;
        if (i_8_ >= 50)
        {
            i_18_ = i_9_ * i_2_ + i_10_ * i_3_ >> 16;
            i_9_ = i_9_ * i_3_ - i_10_ * i_2_ >> 16;
            i_10_ = i_18_;
            i_18_ = i_15_ * i_1_ - i_9_ * i_0_ >> 16;
            i_9_ = i_15_ * i_0_ + i_9_ * i_1_ >> 16;
            i_15_ = i_18_;
            if (i_9_ >= 50)
            {
                i_18_ = i_12_ * i_2_ + i_11_ * i_3_ >> 16;
                i_12_ = i_12_ * i_3_ - i_11_ * i_2_ >> 16;
                i_11_ = i_18_;
                i_18_ = i_16_ * i_1_ - i_12_ * i_0_ >> 16;
                i_12_ = i_16_ * i_0_ + i_12_ * i_1_ >> 16;
                i_16_ = i_18_;
                if (i_12_ >= 50)
                {
                    i_18_ = i_13_ * i_2_ + i_7_ * i_3_ >> 16;
                    i_13_ = i_13_ * i_3_ - i_7_ * i_2_ >> 16;
                    i_7_ = i_18_;
                    i_18_ = i_17_ * i_1_ - i_13_ * i_0_ >> 16;
                    i_13_ = i_17_ * i_0_ + i_13_ * i_1_ >> 16;
                    i_17_ = i_18_;
                    if (i_13_ >= 50)
                    {
                        int i_19_ = Class62.anInt1164 + (i_6_ << 9) / i_8_;
                        int i_20_ = Class62.anInt1160 + (i_14_ << 9) / i_8_;
                        int i_21_ = Class62.anInt1164 + (i_10_ << 9) / i_9_;
                        int i_22_ = Class62.anInt1160 + (i_15_ << 9) / i_9_;
                        int i_23_ = Class62.anInt1164 + (i_11_ << 9) / i_12_;
                        int i_24_ = Class62.anInt1160 + (i_16_ << 9) / i_12_;
                        int i_25_ = Class62.anInt1164 + (i_7_ << 9) / i_13_;
                        int i_26_ = Class62.anInt1160 + (i_17_ << 9) / i_13_;
                        Class62.anInt1153 = 0;
                        if (((i_23_ - i_25_) * (i_22_ - i_26_) - (i_24_ - i_26_) * (i_21_ - i_25_)) > 0)
                        {
                            if (Stream.aBoolean2986 && (Class68_Sub20_Sub17.method1182(Mouse.anInt1569 + Class62.anInt1164, (Class68_Sub20_Sub7.anInt4262 + Class62.anInt1160), i_24_, i_26_, i_22_, i_23_, i_25_, i_21_)))
                            {
                                Class68_Sub20_Sub15.anInt4402 = i_4_;
                                RandomNumberGenerator.anInt1491 = i_5_;
                            }
                            if (!bool)
                            {
                                Class62.aBoolean1157 = false;
                                if (i_23_ < 0 || i_25_ < 0 || i_21_ < 0 || i_23_ > Class62.anInt1168 || i_25_ > Class62.anInt1168 || i_21_ > Class62.anInt1168)
                                    Class62.aBoolean1157 = true;
                                if (((Class7) class7).anInt125 == -1)
                                {
                                    if (((Class7) class7).anInt129 != 12345678)
                                        Class62.method617(i_24_, i_26_, i_22_, i_23_, i_25_, i_21_, ((Class7) class7).anInt129, ((Class7) class7).anInt117, ((Class7) class7).anInt121);
                                } else if (Class68_Sub22.aBoolean3151)
                                {
                                    if (((Class7) class7).aBoolean126)
                                        Class62.method600(i_24_, i_26_, i_22_, i_23_, i_25_, i_21_, ((Class7) class7).anInt129, ((Class7) class7).anInt117, ((Class7) class7).anInt121, i_6_, i_10_, i_7_, i_14_, i_15_, i_17_, i_8_, i_9_, i_13_, ((Class7) class7).anInt125);
                                    else
                                        Class62.method600(i_24_, i_26_, i_22_, i_23_, i_25_, i_21_, ((Class7) class7).anInt129, ((Class7) class7).anInt117, ((Class7) class7).anInt121, i_11_, i_7_, i_10_, i_16_, i_17_, i_15_, i_12_, i_13_, i_9_, ((Class7) class7).anInt125);
                                } else
                                {
                                    int i_27_ = (Class62.anInterface4_1159.method12(((Class7) class7).anInt125, -23));
                                    Class62.method617(i_24_, i_26_, i_22_, i_23_, i_25_, i_21_, (Class68_Sub13_Sub34.method871(i_27_, ((Class7) class7).anInt129)), (Class68_Sub13_Sub34.method871(i_27_, ((Class7) class7).anInt117)), (Class68_Sub13_Sub34.method871(i_27_, ((Class7) class7).anInt121)));
                                }
                            }
                        }
                        if (((i_19_ - i_21_) * (i_26_ - i_22_) - (i_20_ - i_22_) * (i_25_ - i_21_)) > 0)
                        {
                            if (Stream.aBoolean2986 && (Class68_Sub20_Sub17.method1182(Mouse.anInt1569 + Class62.anInt1164, (Class68_Sub20_Sub7.anInt4262 + Class62.anInt1160), i_20_, i_22_, i_26_, i_19_, i_21_, i_25_)))
                            {
                                Class68_Sub20_Sub15.anInt4402 = i_4_;
                                RandomNumberGenerator.anInt1491 = i_5_;
                            }
                            if (!bool)
                            {
                                Class62.aBoolean1157 = false;
                                if (i_19_ < 0 || i_21_ < 0 || i_25_ < 0 || i_19_ > Class62.anInt1168 || i_21_ > Class62.anInt1168 || i_25_ > Class62.anInt1168)
                                    Class62.aBoolean1157 = true;
                                if (((Class7) class7).anInt125 == -1)
                                {
                                    if (((Class7) class7).anInt131 != 12345678)
                                        Class62.method617(i_20_, i_22_, i_26_, i_19_, i_21_, i_25_, ((Class7) class7).anInt131, ((Class7) class7).anInt121, ((Class7) class7).anInt117);
                                } else if (Class68_Sub22.aBoolean3151)
                                    Class62.method600(i_20_, i_22_, i_26_, i_19_, i_21_, i_25_, ((Class7) class7).anInt131, ((Class7) class7).anInt121, ((Class7) class7).anInt117, i_6_, i_10_, i_7_, i_14_, i_15_, i_17_, i_8_, i_9_, i_13_, ((Class7) class7).anInt125);
                                else
                                {
                                    int i_28_ = (Class62.anInterface4_1159.method12(((Class7) class7).anInt125, 117));
                                    Class62.method617(i_20_, i_22_, i_26_, i_19_, i_21_, i_25_, (Class68_Sub13_Sub34.method871(i_28_, ((Class7) class7).anInt131)), (Class68_Sub13_Sub34.method871(i_28_, ((Class7) class7).anInt121)), (Class68_Sub13_Sub34.method871(i_28_, ((Class7) class7).anInt117)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static final Class13_Sub3 method984(byte i, Stream class68_sub14)
    {
        try
        {
            anInt3027++;
            if (i < 70)
                aClass65_3033 = null;
            return new Class13_Sub3(class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readTInteger(), class68_sub14.readTInteger(), class68_sub14.readUByte());
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("md.E(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method985(byte i)
    {
        anInt3025++;
        CipheredByteVector.aClass98_4120.method1573(-123);
        if (i != -79)
            aClass65_3033 = null;
    }

    public static void method986(boolean bool)
    {
        aClass103_3030 = null;
        anIntArray3031 = null;
        aClass100_3029 = null;
        if (bool != false)
            method984((byte) -8, null);
        aClass68_Sub20_Sub10Array3032 = null;
        aClass100_3028 = null;
        aClass105_3026 = null;
        aClass65_3033 = null;
    }

    static final void method987(Class21 class21, int i)
    {
        try
        {
            if (i != -7486)
                aClass68_Sub20_Sub10Array3032 = null;
            Class15.aClass21_249 = class21;
            anInt3024++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "md.C(" + (class21 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final Object1 method988(int i, int i_29_, int i_30_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_29_][i_30_];
        if (class68_sub1 == null)
            return null;
        Object1 class64 = ((Ground) class68_sub1).object_1;
        ((Ground) class68_sub1).object_1 = null;
        return class64;
    }

    Class68_Sub16(byte[] is)
    {
        try
        {
            ((Class68_Sub16) this).aByteArray3023 = is;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "md.<init>(" + (is != null ? "{...}" : "null") + ')');
        }
    }

    static
    {
        aClass105_3026 = Class68_Sub20_Sub3.method1052(3253);
    }
}
