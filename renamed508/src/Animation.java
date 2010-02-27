/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Animation
{
    static int anInt2034;
    int anInt2035;
    int[][] anIntArrayArray2036;
    int[] anIntArray2037;
    static Class65 aClass65_2038;
    int anInt2039;
    static Class21_Sub1 aClass21_Sub1_2040;
    int resetStyle;
    static int anInt2042;
    static int anInt2043;
    static int[] anIntArray2044;
    int anInt2045;
    static int anInt2046;
    private static MutableString aClass100_2047;
    static int anInt2048;
    int anInt2049 = -1;
    private int[] anIntArray2050;
    static int anInt2051;
    private int[] anIntArray2052;
    int anInt2053;
    static MutableString aClass100_2054;
    static MutableString aClass100_2055;
    boolean aBoolean2056;
    static int anInt2057 = 0;
    private boolean aBoolean2058;
    static int anInt2059;
    int[] anIntArray2060;
    static MutableString aClass100_2061;
    static int anInt2062;
    int anInt2063;
    static int anInt2064;
    static MutableString aClass100_2065;
    static MutableString aClass100_2066;
    static int anInt2067;
    static int anInt2068;
    static MutableString[] chatNames;
    static int anInt2070;
    static int anInt2071;
    private static MutableString aClass100_2072;
    static byte aByte2073;
    int anInt2074;

    final Model method1722(Model class1_sub3, int i, int i_0_)
    {
        try
        {
            i_0_ = ((Animation) this).anIntArray2037[i_0_];
            anInt2067++;
            Class68_Sub20_Sub17 class68_sub20_sub17 = Class35.method432(i_0_ >> 16, (byte) -40);
            i_0_ &= 0xffff;
            if (class68_sub20_sub17 == null)
                return class1_sub3.method81(true, true);
            Model class1_sub3_1_ = class1_sub3.method81(!class68_sub20_sub17.method1180(true, i_0_), !aBoolean2058);
            if (i != 8493)
                ((Animation) this).anInt2035 = 85;
            class1_sub3_1_.method74(class68_sub20_sub17, i_0_, aBoolean2058);
            return class1_sub3_1_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uc.C(" + (class1_sub3 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
        }
    }

    static final Class35 method1723(Signlink class55, byte i, Component component, int i_2_, int i_3_)
    {
        try
        {
            anInt2071++;
            if (Class93.anInt1662 == 0)
                throw new IllegalStateException();
            if (i_3_ < 0 || i_3_ >= 2)
                throw new IllegalArgumentException();
            if (i_2_ < 256)
                i_2_ = 256;
            try
            {
                Class35 class35 = (Class35) Class.forName("Class35_Sub2").newInstance();
                ((Class35) class35).anIntArray625 = new int[256 * (Class7.aBoolean132 ? 2 : 1)];
                ((Class35) class35).anInt632 = i_2_;
                class35.method433(component);
                ((Class35) class35).anInt636 = (i_2_ & ~0x3ff) + 1024;
                if (((Class35) class35).anInt636 > 16384)
                    ((Class35) class35).anInt636 = 16384;
                class35.method423(((Class35) class35).anInt636);
                if (Class32.anInt560 > 0 && Class44.aClass125_742 == null)
                {
                    Class44.aClass125_742 = new Class125();
                    ((Class125) Class44.aClass125_742).aClass55_2168 = class55;
                    class55.method558((byte) -125, Class32.anInt560, Class44.aClass125_742);
                }
                if (Class44.aClass125_742 != null)
                {
                    if ((((Class125) Class44.aClass125_742).aClass35Array2176[i_3_]) != null)
                        throw new IllegalArgumentException();
                    ((Class125) Class44.aClass125_742).aClass35Array2176[i_3_] = class35;
                }
                return class35;
            } catch (Throwable throwable)
            {
                try
                {
                    Class35_Sub1 class35_sub1 = new Class35_Sub1(class55, i_3_);
                    if (i != 104)
                        return null;
                    ((Class35) class35_sub1).anInt632 = i_2_;
                    ((Class35) class35_sub1).anIntArray625 = new int[(Class7.aBoolean132 ? 2 : 1) * 256];
                    class35_sub1.method433(component);
                    ((Class35) class35_sub1).anInt636 = 16384;
                    class35_sub1.method423(((Class35) class35_sub1).anInt636);
                    if (Class32.anInt560 > 0 && Class44.aClass125_742 == null)
                    {
                        Class44.aClass125_742 = new Class125();
                        ((Class125) Class44.aClass125_742).aClass55_2168 = class55;
                        class55.method558((byte) -117, Class32.anInt560, Class44.aClass125_742);
                    }
                    if (Class44.aClass125_742 != null)
                    {
                        if ((((Class125) Class44.aClass125_742).aClass35Array2176[i_3_]) != null)
                            throw new IllegalArgumentException();
                        ((Class125) Class44.aClass125_742).aClass35Array2176[i_3_] = class35_sub1;
                    }
                    return class35_sub1;
                } catch (Throwable throwable_4_)
                {
                    return new Class35();
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uc.B(" + (class55 != null ? "{...}" : "null") + ',' + i + ',' + (component != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ')'));
        }
    }

    public static void method1724(int i)
    {
        aClass100_2055 = null;
        aClass21_Sub1_2040 = null;
        aClass65_2038 = null;
        anIntArray2044 = null;
        aClass100_2061 = null;
        aClass100_2066 = null;
        if (i == 31891)
        {
            aClass100_2047 = null;
            chatNames = null;
            aClass100_2072 = null;
            aClass100_2054 = null;
            aClass100_2065 = null;
        }
    }

    final Model method1725(int i, boolean bool, Model class1_sub3)
    {
        try
        {
            anInt2064++;
            i = ((Animation) this).anIntArray2037[i];
            Class68_Sub20_Sub17 class68_sub20_sub17 = Class35.method432(i >> 16, (byte) -89);
            i &= 0xffff;
            if (class68_sub20_sub17 == null)
                return class1_sub3.method82(true, true);
            Model class1_sub3_5_ = class1_sub3.method82(!class68_sub20_sub17.method1180(bool, i), !aBoolean2058);
            class1_sub3_5_.method74(class68_sub20_sub17, i, aBoolean2058);
            return class1_sub3_5_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uc.F(" + i + ',' + bool + ',' + (class1_sub3 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1726(int i, int i_6_, Player class1_sub6_sub2, int i_7_)
    {
        do
        {
            try
            {
                if (i_6_ == 0)
                {
                    anInt2046++;
                    if (i_7_ != ((Character) class1_sub6_sub2).animationID || i_7_ == -1)
                    {
                        if (i_7_ == -1 || ((Character) class1_sub6_sub2).animationID == -1 || (((Animation) Object1.getAnimation(i_7_)).anInt2053 >= (((Animation) Object1.getAnimation((((Character) class1_sub6_sub2).animationID))).anInt2053)))
                        {
                            ((Character) class1_sub6_sub2).animationID = i_7_;
                            ((Character) class1_sub6_sub2).anInt2524 = 0;
                            ((Character) class1_sub6_sub2).anInt2551 = 0;
                            ((Character) class1_sub6_sub2).anInt2558 = 0;
                            ((Character) class1_sub6_sub2).anInt2547 = i;
                            ((Character) class1_sub6_sub2).anInt2559 = ((Character) class1_sub6_sub2).walkQueueLength;
                            if (((Character) class1_sub6_sub2).animationID == -1)
                                break;
                            Class44.method489(false, ((Character) class1_sub6_sub2).anInt2524, ((Character) class1_sub6_sub2).x, Object1.getAnimation((((Character) class1_sub6_sub2).animationID)), (class1_sub6_sub2 == Class68_Sub7.localPlayer), ((Character) class1_sub6_sub2).y);
                        }
                    } else
                    {
                        Animation class117 = Object1.getAnimation(i_7_);
                        int i_8_ = ((Animation) class117).anInt2063;
                        if (i_8_ == 1)
                        {
                            ((Character) class1_sub6_sub2).anInt2551 = 0;
                            ((Character) class1_sub6_sub2).anInt2558 = 0;
                            ((Character) class1_sub6_sub2).anInt2524 = 0;
                            ((Character) class1_sub6_sub2).anInt2547 = i;
                            Class44.method489(false, ((Character) class1_sub6_sub2).anInt2524, ((Character) class1_sub6_sub2).x, class117, (Class68_Sub7.localPlayer == class1_sub6_sub2), ((Character) class1_sub6_sub2).y);
                        }
                        if (i_8_ != 2)
                            break;
                        ((Character) class1_sub6_sub2).anInt2551 = 0;
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("uc.N(" + i + ',' + i_6_ + ',' + (class1_sub6_sub2 != null ? "{...}" : "null") + ',' + i_7_ + ')'));
            }
            break;
        } while (false);
    }

    static final int method1727(int i, int i_9_)
    {
        anInt2051++;
        if (i != 1)
            anIntArray2044 = null;
        if (i_9_ >= 65 && i_9_ <= 90 || i_9_ >= 192 && i_9_ <= 222 && i_9_ != 215)
            return i_9_ + 32;
        if (i_9_ == 159)
            return 255;
        if (i_9_ == 140)
            return 156;
        return i_9_;
    }

    final Model method1728(byte i, Model class1_sub3, int i_10_)
    {
        try
        {
            anInt2068++;
            int i_11_ = ((Animation) this).anIntArray2037[i_10_];
            Class68_Sub20_Sub17 class68_sub20_sub17 = Class35.method432(i_11_ >> 16, (byte) -94);
            i_11_ &= 0xffff;
            if (class68_sub20_sub17 == null)
                return class1_sub3.method82(true, true);
            Class68_Sub20_Sub17 class68_sub20_sub17_12_ = null;
            int i_13_ = 0;
            if (anIntArray2050 != null && anIntArray2050.length > i_10_)
            {
                i_13_ = anIntArray2050[i_10_];
                class68_sub20_sub17_12_ = Class35.method432(i_13_ >> 16, (byte) -48);
                i_13_ &= 0xffff;
            }
            if (class68_sub20_sub17_12_ == null || i_13_ == 65535)
            {
                Model class1_sub3_14_ = class1_sub3.method82(!class68_sub20_sub17.method1180(true, i_11_), !aBoolean2058);
                class1_sub3_14_.method74(class68_sub20_sub17, i_11_, aBoolean2058);
                return class1_sub3_14_;
            }
            int i_15_ = -27 % ((i + 5) / 51);
            Model class1_sub3_16_ = class1_sub3.method82((!class68_sub20_sub17.method1180(true, i_11_) & !class68_sub20_sub17_12_.method1180(true, i_13_)), !aBoolean2058);
            class1_sub3_16_.method74(class68_sub20_sub17, i_11_, aBoolean2058);
            class1_sub3_16_.method74(class68_sub20_sub17_12_, i_13_, aBoolean2058);
            return class1_sub3_16_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uc.I(" + i + ',' + (class1_sub3 != null ? "{...}" : "null") + ',' + i_10_ + ')'));
        }
    }

    private final void method1729(Stream class68_sub14, int i)
    {
        try
        {
            if (i == 1)
            {
                int i_18_ = class68_sub14.readUShort();
                ((Animation) this).anIntArray2060 = new int[i_18_];
                for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
                    ((Animation) this).anIntArray2060[i_19_] = (class68_sub14.readUShort());
                ((Animation) this).anIntArray2037 = new int[i_18_];
                for (int i_20_ = 0; i_18_ > i_20_; i_20_++)
                    ((Animation) this).anIntArray2037[i_20_] = class68_sub14.readUShort();
                for (int i_21_ = 0; i_18_ > i_21_; i_21_++)
                    ((Animation) this).anIntArray2037[i_21_] = ((class68_sub14.readUShort() << 16) + ((Animation) this).anIntArray2037[i_21_]);
            } else if (i != 2)
            {
                if (i == 3)
                {
                    int i_22_ = class68_sub14.readUByte();
                    anIntArray2052 = new int[i_22_ + 1];
                    for (int i_23_ = 0; i_22_ > i_23_; i_23_++)
                        anIntArray2052[i_23_] = class68_sub14.readUByte();
                    anIntArray2052[i_22_] = 9999999;
                } else if (i != 4)
                {
                    if (i != 5)
                    {
                        if (i != 6)
                        {
                            if (i != 7)
                            {
                                if (i != 8)
                                {
                                    if (i != 9)
                                    {
                                        if (i == 10)
                                            ((Animation) this).resetStyle = class68_sub14.readUByte();
                                        else if (i != 11)
                                        {
                                            if (i == 12)
                                            {
                                                int i_24_ = (class68_sub14.readUByte());
                                                anIntArray2050 = new int[i_24_];
                                                for (int i_25_ = 0; i_24_ > i_25_; i_25_++)
                                                    anIntArray2050[i_25_] = (class68_sub14.readUShort());
                                                for (int i_26_ = 0; i_24_ > i_26_; i_26_++)
                                                    anIntArray2050[i_26_] = (((class68_sub14.readUShort()) << 16) + (anIntArray2050[i_26_]));
                                            } else if (i != 13)
                                            {
                                                if (i == 14)
                                                    aBoolean2058 = true;
                                            } else
                                            {
                                                int i_27_ = (class68_sub14.readUShort());
                                                ((Animation) this).anIntArrayArray2036 = new int[i_27_][];
                                                for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
                                                {
                                                    int i_29_ = (class68_sub14.readUByte());
                                                    if (i_29_ > 0)
                                                    {
                                                        ((Animation) this).anIntArrayArray2036[i_28_] = new int[i_29_];
                                                        ((Animation) this).anIntArrayArray2036[i_28_][0] = (class68_sub14.readTInteger());
                                                        for (int i_30_ = 1; i_29_ > i_30_; i_30_++)
                                                            ((Animation) this).anIntArrayArray2036[i_28_][i_30_] = (class68_sub14.readUShort());
                                                    }
                                                }
                                            }
                                        } else
                                            ((Animation) this).anInt2063 = class68_sub14.readUByte();
                                    } else
                                        ((Animation) this).anInt2045 = class68_sub14.readUByte();
                                } else
                                    ((Animation) this).anInt2039 = class68_sub14.readUByte();
                            } else
                                ((Animation) this).anInt2035 = class68_sub14.readUShort();
                        } else
                            ((Animation) this).anInt2049 = class68_sub14.readUShort();
                    } else
                        ((Animation) this).anInt2053 = class68_sub14.readUByte();
                } else
                    ((Animation) this).aBoolean2056 = true;
            } else
                ((Animation) this).anInt2074 = class68_sub14.readUShort();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uc.J(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    static final void method1730(int i, int i_31_, boolean bool, int i_32_, int i_33_, int i_34_, int[] is, int i_35_, int i_36_, int i_37_, int i_38_)
    {
        try
        {
            int i_39_ = i_35_;
            anInt2062++;
            if (i_39_ < Class79.anInt1400)
            {
                if (i_39_ < Class79.anInt1402)
                    i_39_ = Class79.anInt1402;
                int i_40_ = i_35_ + i_31_;
                if (Class79.anInt1402 < i_40_)
                {
                    int i_41_ = i_36_;
                    if (Class79.anInt1400 < i_40_)
                        i_40_ = Class79.anInt1400;
                    if (Class79.anInt1406 > i_41_)
                    {
                        int i_42_ = i_32_ + i_36_;
                        if (i_41_ < Class79.anInt1405)
                            i_41_ = Class79.anInt1405;
                        if (i_42_ > Class79.anInt1405)
                        {
                            if (i_42_ > Class79.anInt1406)
                                i_42_ = Class79.anInt1406;
                            i_42_ -= i_36_;
                            if (i == 9)
                            {
                                i_37_ = 0x3 & i_37_ + 1;
                                i = 1;
                            }
                            if (i_38_ != 2)
                                method1724(-121);
                            int i_43_ = i_41_ * Class79.anInt1403 + i_39_;
                            if (i == 10)
                            {
                                i_37_ = 0x3 & i_37_ + 3;
                                i = 1;
                            }
                            i_41_ -= i_36_;
                            if (i == 11)
                            {
                                i = 8;
                                i_37_ = i_37_ + 3 & 0x3;
                            }
                            int i_44_ = Class79.anInt1403 + i_39_ - i_40_;
                            i_39_ -= i_35_;
                            i_40_ -= i_35_;
                            int i_45_ = i_31_ - i_40_;
                            int i_46_ = i_31_ - i_39_;
                            int i_47_ = i_32_ - i_42_;
                            int i_48_ = i_32_ - i_41_;
                            if (i == 1)
                            {
                                if (i_37_ == 0)
                                {
                                    for (int i_49_ = i_41_; i_49_ < i_42_; i_49_++)
                                    {
                                        for (int i_50_ = i_39_; i_40_ > i_50_; i_50_++)
                                        {
                                            if (i_49_ >= i_50_)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 1)
                                {
                                    for (int i_51_ = i_48_ - 1; i_51_ >= i_47_; i_51_--)
                                    {
                                        for (int i_52_ = i_39_; i_52_ < i_40_; i_52_++)
                                        {
                                            if (i_52_ > i_51_)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 2)
                                {
                                    for (int i_53_ = i_41_; i_42_ > i_53_; i_53_++)
                                    {
                                        for (int i_54_ = i_39_; i_54_ < i_40_; i_54_++)
                                        {
                                            if (i_54_ >= i_53_)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 3)
                                {
                                    for (int i_55_ = i_48_ - 1; i_55_ >= i_47_; i_55_--)
                                    {
                                        for (int i_56_ = i_39_; i_56_ < i_40_; i_56_++)
                                        {
                                            if (i_55_ > i_56_)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                }
                            } else if (i == 2)
                            {
                                if (i_37_ == 0)
                                {
                                    for (int i_57_ = i_48_ - 1; i_47_ <= i_57_; i_57_--)
                                    {
                                        for (int i_58_ = i_39_; i_58_ < i_40_; i_58_++)
                                        {
                                            if (i_58_ > i_57_ >> 1)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 1)
                                {
                                    for (int i_59_ = i_41_; i_42_ > i_59_; i_59_++)
                                    {
                                        for (int i_60_ = i_39_; i_40_ > i_60_; i_60_++)
                                        {
                                            if (i_43_ < 0 || is.length <= i_43_)
                                                i_43_++;
                                            else
                                            {
                                                if (i_59_ << 1 <= i_60_)
                                                    is[i_43_] = i_34_;
                                                else if (bool)
                                                    is[i_43_] = i_33_;
                                                i_43_++;
                                            }
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 2)
                                {
                                    for (int i_61_ = i_41_; i_61_ < i_42_; i_61_++)
                                    {
                                        for (int i_62_ = i_46_ - 1; i_62_ >= i_45_; i_62_--)
                                        {
                                            if (i_61_ >> 1 < i_62_)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 3)
                                {
                                    for (int i_63_ = i_48_ - 1; i_47_ <= i_63_; i_63_--)
                                    {
                                        for (int i_64_ = i_46_ - 1; i_64_ >= i_45_; i_64_--)
                                        {
                                            if (i_63_ << 1 > i_64_)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                }
                            } else if (i == 3)
                            {
                                if (i_37_ == 0)
                                {
                                    for (int i_65_ = i_48_ - 1; i_47_ <= i_65_; i_65_--)
                                    {
                                        for (int i_66_ = i_46_ - 1; i_66_ >= i_45_; i_66_--)
                                        {
                                            if (i_65_ >> 1 >= i_66_)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 1)
                                {
                                    for (int i_67_ = i_48_ - 1; i_47_ <= i_67_; i_67_--)
                                    {
                                        for (int i_68_ = i_39_; i_40_ > i_68_; i_68_++)
                                        {
                                            if (i_68_ < i_67_ << 1)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 2)
                                {
                                    for (int i_69_ = i_41_; i_42_ > i_69_; i_69_++)
                                    {
                                        for (int i_70_ = i_39_; i_70_ < i_40_; i_70_++)
                                        {
                                            if (i_69_ >> 1 < i_70_)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 3)
                                {
                                    for (int i_71_ = i_41_; i_42_ > i_71_; i_71_++)
                                    {
                                        for (int i_72_ = i_46_ - 1; i_72_ >= i_45_; i_72_--)
                                        {
                                            if (i_72_ >= i_71_ << 1)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                }
                            } else if (i == 4)
                            {
                                if (i_37_ == 0)
                                {
                                    for (int i_73_ = i_48_ - 1; i_47_ <= i_73_; i_73_--)
                                    {
                                        for (int i_74_ = i_39_; i_40_ > i_74_; i_74_++)
                                        {
                                            if (i_73_ >> 1 > i_74_)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 1)
                                {
                                    for (int i_75_ = i_41_; i_42_ > i_75_; i_75_++)
                                    {
                                        for (int i_76_ = i_39_; i_40_ > i_76_; i_76_++)
                                        {
                                            if (i_75_ << 1 < i_76_)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 2)
                                {
                                    for (int i_77_ = i_41_; i_42_ > i_77_; i_77_++)
                                    {
                                        for (int i_78_ = i_46_ - 1; i_78_ >= i_45_; i_78_--)
                                        {
                                            if (i_77_ >> 1 <= i_78_)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 3)
                                {
                                    for (int i_79_ = i_48_ - 1; i_47_ <= i_79_; i_79_--)
                                    {
                                        for (int i_80_ = i_46_ - 1; i_80_ >= i_45_; i_80_--)
                                        {
                                            if (i_79_ << 1 >= i_80_)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                }
                            } else if (i == 5)
                            {
                                if (i_37_ == 0)
                                {
                                    for (int i_81_ = i_48_ - 1; i_47_ <= i_81_; i_81_--)
                                    {
                                        for (int i_82_ = i_46_ - 1; i_45_ <= i_82_; i_82_--)
                                        {
                                            if (i_82_ >= i_81_ >> 1)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 1)
                                {
                                    for (int i_83_ = i_48_ - 1; i_83_ >= i_47_; i_83_--)
                                    {
                                        for (int i_84_ = i_39_; i_40_ > i_84_; i_84_++)
                                        {
                                            if (i_83_ << 1 < i_84_)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 2)
                                {
                                    for (int i_85_ = i_41_; i_85_ < i_42_; i_85_++)
                                    {
                                        for (int i_86_ = i_39_; i_86_ < i_40_; i_86_++)
                                        {
                                            if (i_86_ < i_85_ >> 1)
                                            {
                                                if (bool)
                                                    is[i_43_] = i_33_;
                                            } else
                                                is[i_43_] = i_34_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                } else if (i_37_ == 3)
                                {
                                    for (int i_87_ = i_41_; i_42_ > i_87_; i_87_++)
                                    {
                                        for (int i_88_ = i_46_ - 1; i_88_ >= i_45_; i_88_--)
                                        {
                                            if (i_87_ << 1 >= i_88_)
                                                is[i_43_] = i_34_;
                                            else if (bool)
                                                is[i_43_] = i_33_;
                                            i_43_++;
                                        }
                                        i_43_ += i_44_;
                                    }
                                }
                            } else
                            {
                                if (i == 6)
                                {
                                    if (i_37_ == 0)
                                    {
                                        for (int i_89_ = i_41_; i_89_ < i_42_; i_89_++)
                                        {
                                            for (int i_90_ = i_39_; i_90_ < i_40_; i_90_++)
                                            {
                                                if (i_31_ / 2 >= i_90_)
                                                    is[i_43_] = i_34_;
                                                else if (bool)
                                                    is[i_43_] = i_33_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                        return;
                                    }
                                    if (i_37_ == 1)
                                    {
                                        for (int i_91_ = i_41_; i_42_ > i_91_; i_91_++)
                                        {
                                            for (int i_92_ = i_39_; i_92_ < i_40_; i_92_++)
                                            {
                                                if (i_91_ > i_32_ / 2)
                                                {
                                                    if (bool)
                                                        is[i_43_] = i_33_;
                                                } else
                                                    is[i_43_] = i_34_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                        return;
                                    }
                                    if (i_37_ == 2)
                                    {
                                        for (int i_93_ = i_41_; i_42_ > i_93_; i_93_++)
                                        {
                                            for (int i_94_ = i_39_; i_94_ < i_40_; i_94_++)
                                            {
                                                if (i_94_ < i_31_ / 2)
                                                {
                                                    if (bool)
                                                        is[i_43_] = i_33_;
                                                } else
                                                    is[i_43_] = i_34_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                        return;
                                    }
                                    if (i_37_ == 3)
                                    {
                                        for (int i_95_ = i_41_; i_95_ < i_42_; i_95_++)
                                        {
                                            for (int i_96_ = i_39_; i_96_ < i_40_; i_96_++)
                                            {
                                                if (i_95_ >= i_32_ / 2)
                                                    is[i_43_] = i_34_;
                                                else if (bool)
                                                    is[i_43_] = i_33_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                        return;
                                    }
                                }
                                if (i == 7)
                                {
                                    if (i_37_ == 0)
                                    {
                                        for (int i_97_ = i_41_; i_97_ < i_42_; i_97_++)
                                        {
                                            for (int i_98_ = i_39_; i_40_ > i_98_; i_98_++)
                                            {
                                                if (i_97_ - i_32_ / 2 < i_98_)
                                                {
                                                    if (bool)
                                                        is[i_43_] = i_33_;
                                                } else
                                                    is[i_43_] = i_34_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                        return;
                                    }
                                    if (i_37_ == 1)
                                    {
                                        for (int i_99_ = i_48_ - 1; i_47_ <= i_99_; i_99_--)
                                        {
                                            for (int i_100_ = i_39_; i_40_ > i_100_; i_100_++)
                                            {
                                                if (i_99_ - i_32_ / 2 >= i_100_)
                                                    is[i_43_] = i_34_;
                                                else if (bool)
                                                    is[i_43_] = i_33_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                        return;
                                    }
                                    if (i_37_ == 2)
                                    {
                                        for (int i_101_ = i_48_ - 1; i_101_ >= i_47_; i_101_--)
                                        {
                                            for (int i_102_ = i_46_ - 1; i_45_ <= i_102_; i_102_--)
                                            {
                                                if (i_102_ > i_101_ - i_32_ / 2)
                                                {
                                                    if (bool)
                                                        is[i_43_] = i_33_;
                                                } else
                                                    is[i_43_] = i_34_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                        return;
                                    }
                                    if (i_37_ == 3)
                                    {
                                        for (int i_103_ = i_41_; i_103_ < i_42_; i_103_++)
                                        {
                                            for (int i_104_ = i_46_ - 1; i_104_ >= i_45_; i_104_--)
                                            {
                                                if (i_103_ - i_32_ / 2 < i_104_)
                                                {
                                                    if (bool)
                                                        is[i_43_] = i_33_;
                                                } else
                                                    is[i_43_] = i_34_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                        return;
                                    }
                                }
                                if (i == 8)
                                {
                                    if (i_37_ == 0)
                                    {
                                        for (int i_105_ = i_41_; i_42_ > i_105_; i_105_++)
                                        {
                                            for (int i_106_ = i_39_; i_40_ > i_106_; i_106_++)
                                            {
                                                if (i_105_ - i_32_ / 2 <= i_106_)
                                                    is[i_43_] = i_34_;
                                                else if (bool)
                                                    is[i_43_] = i_33_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                    } else if (i_37_ == 1)
                                    {
                                        for (int i_107_ = i_48_ - 1; i_47_ <= i_107_; i_107_--)
                                        {
                                            for (int i_108_ = i_39_; i_40_ > i_108_; i_108_++)
                                            {
                                                if (i_107_ - i_32_ / 2 <= i_108_)
                                                    is[i_43_] = i_34_;
                                                else if (bool)
                                                    is[i_43_] = i_33_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                    } else if (i_37_ == 2)
                                    {
                                        for (int i_109_ = i_48_ - 1; i_109_ >= i_47_; i_109_--)
                                        {
                                            for (int i_110_ = i_46_ - 1; i_110_ >= i_45_; i_110_--)
                                            {
                                                if (i_109_ - i_32_ / 2 <= i_110_)
                                                    is[i_43_] = i_34_;
                                                else if (bool)
                                                    is[i_43_] = i_33_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                    } else if (i_37_ == 3)
                                    {
                                        for (int i_111_ = i_41_; i_42_ > i_111_; i_111_++)
                                        {
                                            for (int i_112_ = i_46_ - 1; i_112_ >= i_45_; i_112_--)
                                            {
                                                if (i_111_ - i_32_ / 2 > i_112_)
                                                {
                                                    if (bool)
                                                        is[i_43_] = i_33_;
                                                } else
                                                    is[i_43_] = i_34_;
                                                i_43_++;
                                            }
                                            i_43_ += i_44_;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uc.A(" + i + ',' + i_31_ + ',' + bool + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + (is != null ? "{...}" : "null") + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ')'));
        }
    }

    final void method1731(byte i)
    {
        if (((Animation) this).resetStyle == -1)
        {
            if (anIntArray2052 != null)
                ((Animation) this).resetStyle = 2;
            else
                ((Animation) this).resetStyle = 0;
        }
        int i_113_ = 17 % ((55 - i) / 54);
        anInt2070++;
        if (((Animation) this).anInt2045 == -1)
        {
            if (anIntArray2052 != null)
                ((Animation) this).anInt2045 = 2;
            else
                ((Animation) this).anInt2045 = 0;
        }
    }

    static final void method1732(int i, int i_114_)
    {
        anInt2048++;
        Class68_Sub20_Sub12.objectDefinitionNodes.method1570(-18767, i_114_);
        Class52.aClass98_1000.method1570(i ^ 0x494e, i_114_);
        if (i == -1)
        {
            Class68_Sub13_Sub20.aClass98_3767.method1570(-18767, i_114_);
            Class68_Sub13_Sub37.aClass98_4066.method1570(-18767, i_114_);
        }
    }

    final Model method1733(Model class1_sub3, Animation class117_115_, int i, byte i_116_, int i_117_)
    {
        try
        {
            i_117_ = ((Animation) this).anIntArray2037[i_117_];
            int i_118_ = -52 / ((i_116_ - 57) / 44);
            anInt2059++;
            Class68_Sub20_Sub17 class68_sub20_sub17 = Class35.method432(i_117_ >> 16, (byte) -47);
            i_117_ &= 0xffff;
            if (class68_sub20_sub17 == null)
                return class117_115_.method1725(i, true, class1_sub3);
            i = ((Animation) class117_115_).anIntArray2037[i];
            Class68_Sub20_Sub17 class68_sub20_sub17_119_ = Class35.method432(i >> 16, (byte) -96);
            i &= 0xffff;
            if (class68_sub20_sub17_119_ == null)
            {
                Model class1_sub3_120_ = class1_sub3.method82(!class68_sub20_sub17.method1180(true, i_117_), !aBoolean2058);
                class1_sub3_120_.method74(class68_sub20_sub17, i_117_, aBoolean2058);
                return class1_sub3_120_;
            }
            Model class1_sub3_121_ = class1_sub3.method82((!class68_sub20_sub17.method1180(true, i_117_) & !class68_sub20_sub17_119_.method1180(true, i)), (!aBoolean2058 & !class117_115_.aBoolean2058));
            class1_sub3_121_.method86(class68_sub20_sub17, i_117_, class68_sub20_sub17_119_, i, anIntArray2052, (aBoolean2058 | class117_115_.aBoolean2058));
            return class1_sub3_121_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uc.H(" + (class1_sub3 != null ? "{...}" : "null") + ',' + (class117_115_ != null ? "{...}" : "null") + ',' + i + ',' + i_116_ + ',' + i_117_ + ')'));
        }
    }

    final Model method1734(int i, Model class1_sub3, int i_122_, int i_123_)
    {
        try
        {
            i = ((Animation) this).anIntArray2037[i];
            anInt2043++;
            if (i_123_ != -11436)
                anIntArray2050 = null;
            Class68_Sub20_Sub17 class68_sub20_sub17 = Class35.method432(i >> 16, (byte) -90);
            i &= 0xffff;
            if (class68_sub20_sub17 == null)
                return class1_sub3.method82(true, true);
            i_122_ &= 0x3;
            Model class1_sub3_124_ = class1_sub3.method82(!class68_sub20_sub17.method1180(true, i), !aBoolean2058);
            if (i_122_ != 1)
            {
                if (i_122_ != 2)
                {
                    if (i_122_ == 3)
                        class1_sub3_124_.method80();
                } else
                    class1_sub3_124_.method83();
            } else
                class1_sub3_124_.method88();
            class1_sub3_124_.method74(class68_sub20_sub17, i, aBoolean2058);
            if (i_122_ != 1)
            {
                if (i_122_ == 2)
                    class1_sub3_124_.method83();
                else if (i_122_ == 3)
                    class1_sub3_124_.method88();
            } else
                class1_sub3_124_.method80();
            return class1_sub3_124_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uc.D(" + i + ',' + (class1_sub3 != null ? "{...}" : "null") + ',' + i_122_ + ',' + i_123_ + ')'));
        }
    }

    final void method1735(Stream class68_sub14)
    {
        try
        {
            anInt2042++;
            for (;;)
            {
                int i_125_ = class68_sub14.readUByte();
                if (i_125_ == 0)
                    break;
                method1729(class68_sub14, i_125_);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("uc.K(" + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    public Animation()
    {
        ((Animation) this).anInt2045 = -1;
        ((Animation) this).anInt2035 = -1;
        ((Animation) this).resetStyle = -1;
        ((Animation) this).anInt2039 = 99;
        ((Animation) this).anInt2053 = 5;
        aBoolean2058 = false;
        ((Animation) this).aBoolean2056 = false;
        ((Animation) this).anInt2063 = 2;
        ((Animation) this).anInt2074 = -1;
    }

    static
    {
        aClass100_2047 = Class112.makeMutableString(43, "purple:");
        aClass100_2061 = aClass100_2047;
        aClass100_2054 = Class112.makeMutableString(43, "details");
        aClass100_2065 = aClass100_2047;
        aClass100_2066 = Class112.makeMutableString(43, "hint_mapedge");
        chatNames = new MutableString[100];
        aClass100_2072 = (Class112.makeMutableString(43, "Please wait )2 attempting to reestablish)3"));
        aClass100_2055 = aClass100_2072;
    }
}
