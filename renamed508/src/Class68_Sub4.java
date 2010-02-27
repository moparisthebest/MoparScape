/* Class68_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class68_Sub4 extends Node
{
    static int anInt2815;
    static BigInteger RSA_ENCRYPT_KEY;
    static int anInt2817 = 0;
    static int anInt2818;
    int anInt2819;
    static int anInt2820;
    static MutableString aClass100_2821;
    static int anInt2822;
    int anInt2823;
    int anInt2824;
    int anInt2825;
    static int anInt2826;
    static int anInt2827;
    static int anInt2828;
    static MutableString[] aClass100Array2829;
    static int[] anIntArray2830;
    static MutableString aClass100_2831;

    final boolean method656(int i, int i_0_, int i_1_)
    {
        if (i_0_ != -9710)
            method659(11, 92, 40, 111, -64, -112, -113);
        anInt2820++;
        if (i >= ((Class68_Sub4) this).anInt2819 && ((Class68_Sub4) this).anInt2825 >= i && ((Class68_Sub4) this).anInt2824 <= i_1_ && ((Class68_Sub4) this).anInt2823 >= i_1_)
            return true;
        return false;
    }

    static final void method657(int i)
    {
        ObjectDefinition.anInt2013 = 0;
        anInt2827++;
        int i_2_ = ((((Character) Class68_Sub7.localPlayer).x >> 7) + Class36.baseX);
        if (i > -123)
            method660(-46, (byte) 115);
        int i_3_ = (Class68_Sub13_Sub35.baseY + (((Character) Class68_Sub7.localPlayer).y >> 7));
        if (i_2_ >= 3053 && i_2_ <= 3156 && i_3_ >= 3056 && i_3_ <= 3136)
            ObjectDefinition.anInt2013 = 1;
        if (i_2_ >= 3072 && i_2_ <= 3118 && i_3_ >= 9492 && i_3_ <= 9535)
            ObjectDefinition.anInt2013 = 1;
        if (ObjectDefinition.anInt2013 == 1 && i_2_ >= 3139 && i_2_ <= 3199 && i_3_ >= 3008 && i_3_ <= 3062)
            ObjectDefinition.anInt2013 = 0;
    }

    public static void method658(int i)
    {
        aClass100Array2829 = null;
        RSA_ENCRYPT_KEY = null;
        if (i != 27392)
            method660(41, (byte) -106);
        anIntArray2830 = null;
        aClass100_2831 = null;
        aClass100_2821 = null;
    }

    static final void method659(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_)
    {
        if (i >= 22)
        {
            int i_10_ = 0;
            for (Class23[] class23s = Class34.aClass23Array594; class23s.length > i_10_; i_10_++)
            {
                Class23 class23 = class23s[i_10_];
                if (class23 != null && ((Class23) class23).anInt489 == 2)
                {
                    Class67.method641(i_7_, i_9_, i_4_ >> 1, ((((Class23) class23).anInt492 - Class68_Sub13_Sub35.baseY) << 7) + ((Class23) class23).anInt503, ((Class23) class23).anInt497 * 2, i_8_ >> 1, ((((Class23) class23).anInt496 - Class36.baseX) << 7) + ((Class23) class23).anInt502, (byte) -124);
                    if (Mouse.anInt1578 > -1 && Class68_Sub3.loopCycle % 20 < 10)
                        Class68_Sub13_Sub12.aClass68_Sub20_Sub10Array3648[((Class23) class23).anInt499].method1103(i_6_ + Mouse.anInt1578 - 12, i_5_ - (28 - Class114.anInt1927));
                }
            }
            anInt2822++;
        }
    }

    static final void method660(int i, byte i_11_)
    {
        anInt2828++;
        Object3.anInt934 += 128 * i;
        if (Object3.anInt934 > Class68_Sub20_Sub6.anIntArray4232.length)
        {
            int i_12_ = (int) (Math.random() * 12.0);
            Object3.anInt934 -= Class68_Sub20_Sub6.anIntArray4232.length;
            Class84.method1482(79, Class68_Sub13.aClass92_Sub1Array2923[i_12_]);
        }
        int i_13_ = 256;
        int i_14_ = i * 128;
        int i_15_ = (i_13_ - i) * 128;
        int i_16_ = 0;
        for (int i_17_ = 0; i_17_ < i_15_; i_17_++)
        {
            int i_18_ = (NodeSub.anIntArray3092[i_14_ + i_16_] - ((Class68_Sub20_Sub6.anIntArray4232[(Object3.anInt934 + i_16_ & Class68_Sub20_Sub6.anIntArray4232.length - 1)]) * i / 6));
            if (i_18_ < 0)
                i_18_ = 0;
            NodeSub.anIntArray3092[i_16_++] = i_18_;
        }
        for (int i_19_ = i_13_ - i; i_19_ < i_13_; i_19_++)
        {
            int i_20_ = i_19_ * 128;
            for (int i_21_ = 0; i_21_ < 128; i_21_++)
            {
                int i_22_ = (int) (Math.random() * 100.0);
                if (i_22_ >= 50 || i_21_ <= 10 || i_21_ >= 118)
                    NodeSub.anIntArray3092[i_21_ + i_20_] = 0;
                else
                    NodeSub.anIntArray3092[i_20_ + i_21_] = 255;
            }
        }
        if (i_11_ != 60)
            aClass100_2831 = null;
        for (int i_23_ = 0; i_23_ < i_13_ - i; i_23_++)
            Class68_Sub20_Sub16.anIntArray4418[i_23_] = Class68_Sub20_Sub16.anIntArray4418[i_23_ + i];
        for (int i_24_ = i_13_ - i; i_24_ < i_13_; i_24_++)
        {
            Class68_Sub20_Sub16.anIntArray4418[i_24_] = (int) ((16.0 * Math.sin((double) Class68_Sub13.anInt2925 / 14.0)) + 14.0 * Math.sin((double) Class68_Sub13.anInt2925 / 15.0) + (Math.sin((double) Class68_Sub13.anInt2925 / 16.0) * 12.0));
            Class68_Sub13.anInt2925++;
        }
        Class114.anInt1929 += i;
        int i_25_ = (i + (Class68_Sub3.loopCycle & 0x1)) / 2;
        if (i_25_ > 0)
        {
            for (int i_26_ = 0; Class114.anInt1929 > i_26_; i_26_++)
            {
                int i_27_ = (int) (124.0 * Math.random()) + 2;
                int i_28_ = (int) (128.0 * Math.random()) + 128;
                NodeSub.anIntArray3092[(i_28_ << 7) + i_27_] = 192;
            }
            Class114.anInt1929 = 0;
            for (int i_29_ = 0; i_13_ > i_29_; i_29_++)
            {
                int i_30_ = 0;
                int i_31_ = i_29_ * 128;
                for (int i_32_ = -i_25_; i_32_ < 128; i_32_++)
                {
                    if (i_32_ + i_25_ < 128)
                        i_30_ += (NodeSub.anIntArray3092[i_25_ + i_31_ + i_32_]);
                    if (i_32_ + (-1 - i_25_) >= 0)
                        i_30_ -= (NodeSub.anIntArray3092[i_32_ + i_31_ - i_25_ - 1]);
                    if (i_32_ >= 0)
                        Class90.anIntArray2347[i_32_ + i_31_] = i_30_ / (i_25_ * 2 + 1);
                }
            }
            for (int i_33_ = 0; i_33_ < 128; i_33_++)
            {
                int i_34_ = 0;
                for (int i_35_ = -i_25_; i_13_ > i_35_; i_35_++)
                {
                    int i_36_ = i_35_ * 128;
                    if (i_35_ + i_25_ < i_13_)
                        i_34_ += (Class90.anIntArray2347[i_36_ + i_33_ + i_25_ * 128]);
                    if (i_35_ + (-1 - i_25_) >= 0)
                        i_34_ -= (Class90.anIntArray2347[-(128 * i_25_) - 128 + (i_36_ + i_33_)]);
                    if (i_35_ >= 0)
                        NodeSub.anIntArray3092[i_36_ + i_33_] = i_34_ / (i_25_ * 2 + 1);
                }
            }
        }
    }

    static final void method661(Player class1_sub6_sub2, int i, int i_37_, int i_38_, int i_39_)
    {
        try
        {
            anInt2826++;
            if (Class68_Sub7.localPlayer != class1_sub6_sub2)
            {
                if (i > -56)
                    anIntArray2830 = null;
                if (Class68_Sub13_Sub21.menuOptionsCount < 400)
                {
                    MutableString class100;
                    if (((Player) class1_sub6_sub2).anInt3408 != 0)
                        class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class1_sub6_sub2.method160(), Class68_Sub19.aClass100_3068, Class118.aClass100_2082, (Class68_Sub13_Sub24.method816((((Player) class1_sub6_sub2).anInt3408), 0)), Class68_Sub26.aClass100_3197 })));
                    else
                        class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class1_sub6_sub2.method160(), (Class68_Sub20_Sub8.method1089((((Player) class1_sub6_sub2).combatLevel), true, (((Player) Class68_Sub7.localPlayer).combatLevel))), Class68_Sub19.aClass100_3068, Class58.aClass100_1095, (Class68_Sub13_Sub24.method816((((Player) class1_sub6_sub2).combatLevel), 0)), Class68_Sub26.aClass100_3197 })));
                    if (Class68_Sub13_Sub37.anInt4064 == 1)
                    {
                        Class68_Sub3.method652(i_37_, i_38_, (byte) -124, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class44.aClass100_743, Class68_Sub20_Sub13_Sub2.aClass100_4625, class100 }))), (short) 2, Object2.aClass100_1347, (long) i_39_);
                        Class25.anInt514++;
                    } else if (Class21_Sub1.aBoolean2707)
                    {
                        if ((Class33.anInt589 & 0x8) == 8)
                        {
                            Class33.anInt575++;
                            Class68_Sub3.method652(i_37_, i_38_, (byte) -85, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub1.aClass100_3454, Class68_Sub20_Sub13_Sub2.aClass100_4625, class100 }))), (short) 50, Class7.aClass100_118, (long) i_39_);
                        }
                    } else
                    {
                        for (int i_40_ = 7; i_40_ >= 0; i_40_--)
                        {
                            if (Class127.aClass100Array2209[i_40_] != null)
                            {
                                short i_41_ = 0;
                                if (Class68_Sub13_Sub34.game == 0 && (Class127.aClass100Array2209[i_40_].method1606(false, Class29.aClass100_535)))
                                {
                                    if ((((Player) Class68_Sub7.localPlayer).combatLevel) < ((Player) class1_sub6_sub2).combatLevel)
                                        i_41_ = (short) 2000;
                                    if ((((Player) Class68_Sub7.localPlayer).anInt3433) != 0 && ((Player) class1_sub6_sub2).anInt3433 != 0)
                                    {
                                        if ((((Player) (Class68_Sub7.localPlayer)).anInt3433) == ((Player) class1_sub6_sub2).anInt3433)
                                            i_41_ = (short) 2000;
                                        else
                                            i_41_ = (short) 0;
                                    }
                                } else if (Class118.aBooleanArray2080[i_40_])
                                    i_41_ = (short) 2000;
                                boolean bool = false;
                                Class68_Sub6.anInt2844++;
                                short i_42_ = Class109.aShortArray1838[i_40_];
                                i_42_ += i_41_;
                                Class68_Sub3.method652(i_37_, i_38_, (byte) -56, (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Node.aClass100_1223, class100 })), i_42_, Class127.aClass100Array2209[i_40_], (long) i_39_);
                            }
                        }
                    }
                    for (int i_43_ = 0; i_43_ < Class68_Sub13_Sub21.menuOptionsCount; i_43_++)
                    {
                        if (Class68_Sub28_Sub1.menuActionIDs[i_43_] == 5)
                        {
                            Class33.menuOptions[i_43_] = (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Node.aClass100_1223, class100 }));
                            break;
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("dc.D(" + (class1_sub6_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ')'));
        }
    }

    Class68_Sub4(int i, int i_44_, int i_45_, int i_46_)
    {
        ((Class68_Sub4) this).anInt2824 = i_44_;
        ((Class68_Sub4) this).anInt2819 = i;
        ((Class68_Sub4) this).anInt2825 = i_45_;
        ((Class68_Sub4) this).anInt2823 = i_46_;
    }

    static
    {
        anInt2815 = 0;
        aClass100_2821 = null;
        RSA_ENCRYPT_KEY = (new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821"));
        aClass100_2831 = Class112.makeMutableString(43, "zap");
        anIntArray2830 = new int[200];
        aClass100Array2829 = new MutableString[100];
    }
}
