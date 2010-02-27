/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjectDefinition
{
    static int anInt1961;
    boolean aBoolean1962;
    private short aShort1963 = -1;
    private byte[] aByteArray1964;
    private byte aByte1965 = 0;
    int anInt1966;
    private int anInt1967;
    private boolean aBoolean1968;
    private int[] anIntArray1969;
    boolean aBoolean1970;
    private NodeCache aClass113_1971;
    static int anInt1972;
    private boolean aBoolean1973;
    int anInt1974;
    int anInt1975;
    static int anInt1976;
    int anInt1977;
    private int anInt1978;
    private int anInt1979;
    boolean aBoolean1980;
    private int anInt1981;
    int anInt1982;
    private short[] aShortArray1983;
    int anInt1984;
    int anInt1985;
    static int anInt1986;
    private short[] aShortArray1987;
    private int anInt1988;
    int anInt1989;
    int anInt1990;
    private int anInt1991;
    int anInt1992;
    static int anInt1993;
    static MutableString[] aClass100Array1994;
    static int anInt1995;
    int[] childrenIDs;
    int[] anIntArray1997;
    static int[] anIntArray1998;
    boolean aBoolean1999;
    private int anInt2000;
    private int anInt2001;
    int anInt2002;
    static int anInt2003;
    int anInt2004;
    private int anInt2005;
    boolean aBoolean2006;
    boolean aBoolean2007;
    MutableString[] actions;
    static int anInt2009 = 0;
    boolean aBoolean2010;
    static int anInt2011;
    private int[] anIntArray2012;
    static int anInt2013 = 0;
    static int anInt2014;
    private int anInt2015;
    static int anInt2016;
    static int anInt2017;
    static int[][] anIntArrayArray2018 = new int[104][104];
    boolean aBoolean2019;
    boolean aBoolean2020;
    static Class68_Sub20_Sub10 aClass68_Sub20_Sub10_2021;
    static int anInt2022;
    MutableString name;
    int anInt2024;
    private short[] aShortArray2025;
    static int anInt2026;
    int anInt2027;
    private short[] aShortArray2028;
    boolean aBoolean2029;
    static int anInt2030;
    static int anInt2031;
    boolean aBoolean2032;
    int type;

    final Class44 method1708(int i, Class92_Sub1 class92_sub1, boolean bool, byte i_0_, boolean bool_1_, int i_2_, int i_3_, int[][] is, int i_4_, int[][] is_5_, int i_6_)
    {
        try
        {
            anInt2022++;
            long l;
            if (anIntArray2012 == null)
                l = (long) ((((ObjectDefinition) this).type << 10) + i_3_);
            else
                l = (long) ((((ObjectDefinition) this).type << 10) + (i << 3) + i_3_);
            int i_7_ = 82 % ((58 - i_0_) / 62);
            boolean bool_8_;
            if (!bool_1_ || !aBoolean1968)
                bool_8_ = false;
            else
            {
                bool_8_ = true;
                l |= ~0x7fffffffffffffffL;
            }
            Animable class1 = ((Animable) Class68_Sub13_Sub20.aClass98_3767.getNodeForID(l));
            if (class1 == null)
            {
                Class1_Sub4 class1_sub4 = method1721(i_3_, 0, i);
                if (class1_sub4 == null)
                {
                    ((Class44) Class68_Sub13_Sub5.aClass44_3517).aClass1_746 = null;
                    return Class68_Sub13_Sub5.aClass44_3517;
                }
                class1_sub4.method132();
                if (i == 10 && i_3_ > 3)
                    class1_sub4.method107(256);
                if (bool_8_)
                {
                    ((Class1_Sub4) class1_sub4).aShort2470 = (short) (anInt2015 + 64);
                    class1 = class1_sub4;
                    ((Class1_Sub4) class1_sub4).aShort2476 = (short) (5 * anInt1981 + 768);
                    class1_sub4.method120();
                } else
                    class1 = new SpriteFactory(class1_sub4, anInt2015 + 64, anInt1981 * 5 + 768, -50, -10, -50);
                Class68_Sub13_Sub20.aClass98_3767.addObject(class1, l);
            }
            if (bool_8_)
                class1 = ((Class1_Sub4) class1).method109();
            if (aByte1965 != 0)
            {
                if (!(class1 instanceof SpriteFactory))
                {
                    if (class1 instanceof Class1_Sub4)
                        class1 = ((Class1_Sub4) class1).method111(aByte1965, aShort1963, is, is_5_, i_6_, i_2_, i_4_, true, false);
                } else
                    class1 = ((SpriteFactory) class1).method100(aByte1965, aShort1963, is, is_5_, i_6_, i_2_, i_4_, true);
            }
            ((Class44) Class68_Sub13_Sub5.aClass44_3517).aClass1_746 = class1;
            return Class68_Sub13_Sub5.aClass44_3517;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ub.G(" + i + ',' + (class92_sub1 != null ? "{...}" : "null") + ',' + bool + ',' + i_0_ + ',' + bool_1_ + ',' + i_2_ + ',' + i_3_ + ',' + (is != null ? "{...}" : "null") + ',' + i_4_ + ',' + (is_5_ != null ? "{...}" : "null") + ',' + i_6_ + ')'));
        }
    }

    final int method1709(byte i, int i_9_, int i_10_)
    {
        anInt2003++;
        if (aClass113_1971 == null)
            return i_9_;
        Class68_Sub10 class68_sub10 = (Class68_Sub10) aClass113_1971.method1684((long) i_10_, 79);
        if (i > -85)
            ((ObjectDefinition) this).aBoolean1962 = false;
        if (class68_sub10 == null)
            return i_9_;
        return ((Class68_Sub10) class68_sub10).anInt2904;
    }

    final boolean method1710(int i, int i_11_)
    {
        int i_12_ = 100 % ((i - 49) / 62);
        anInt2030++;
        if (anIntArray2012 == null)
        {
            if (anIntArray1969 == null)
                return true;
            if (i_11_ != 10)
                return true;
            boolean bool = true;
            for (int i_13_ = 0; i_13_ < anIntArray1969.length; i_13_++)
                bool &= (Class68_Sub20_Sub3.aClass21_4194.method344(0xffff & anIntArray1969[i_13_], 0, (byte) -95));
            return bool;
        }
        for (int i_14_ = 0; anIntArray2012.length > i_14_; i_14_++)
        {
            if (i_11_ == anIntArray2012[i_14_])
                return (Class68_Sub20_Sub3.aClass21_4194.method344(0xffff & anIntArray1969[i_14_], 0, (byte) -116));
        }
        return true;
    }

    final MutableString method1711(int i, MutableString class100, int i_15_)
    {
        try
        {
            anInt2031++;
            if (i != 256)
                ((ObjectDefinition) this).aBoolean2007 = false;
            if (aClass113_1971 == null)
                return class100;
            Class68_Sub5 class68_sub5 = ((Class68_Sub5) aClass113_1971.method1684((long) i_15_, i ^ ~0x12c));
            if (class68_sub5 == null)
                return class100;
            return ((Class68_Sub5) class68_sub5).aClass100_2832;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ub.H(" + i + ',' + (class100 != null ? "{...}" : "null") + ',' + i_15_ + ')'));
        }
    }

    final void method1712(int i)
    {
        anInt1976++;
        if (((ObjectDefinition) this).anInt1985 == -1)
        {
            ((ObjectDefinition) this).anInt1985 = 0;
            if (anIntArray1969 != null && (anIntArray2012 == null || anIntArray2012[0] == 10))
                ((ObjectDefinition) this).anInt1985 = 1;
            for (int i_16_ = 0; i_16_ < 5; i_16_++)
            {
                if (((ObjectDefinition) this).actions[i_16_] != null)
                {
                    ((ObjectDefinition) this).anInt1985 = 1;
                    break;
                }
            }
        }
        if (((ObjectDefinition) this).anInt1974 == -1)
            ((ObjectDefinition) this).anInt1974 = ((ObjectDefinition) this).anInt2024 != 0 ? 1 : 0;
        if (i != -129)
            ((ObjectDefinition) this).anInt1990 = -45;
    }

    final boolean method1713(byte i)
    {
        anInt1993++;
        if (((ObjectDefinition) this).childrenIDs == null)
        {
            if (((ObjectDefinition) this).anInt1984 == -1 && ((ObjectDefinition) this).anIntArray1997 == null)
                return false;
            return true;
        }
        if (i != -6)
            return true;
        for (int i_17_ = 0; i_17_ < ((ObjectDefinition) this).childrenIDs.length; i_17_++)
        {
            if (((ObjectDefinition) this).childrenIDs[i_17_] != -1)
            {
                ObjectDefinition class116_18_ = Class1_Sub5.method140(96, (((ObjectDefinition) this).childrenIDs[i_17_]));
                if (((ObjectDefinition) class116_18_).anInt1984 != -1 || ((ObjectDefinition) class116_18_).anIntArray1997 != null)
                    return true;
            }
        }
        return false;
    }

    static final int method1714(int i, byte i_19_, int i_20_)
    {
        if (i > i_20_)
        {
            int i_21_ = i_20_;
            i_20_ = i;
            i = i_21_;
        }
        int i_22_ = 12 % ((-35 - i_19_) / 38);
        anInt2014++;
        int i_23_;
        for (/**/; i != 0; i = i_23_)
        {
            i_23_ = i_20_ % i;
            i_20_ = i;
        }
        return i_20_;
    }

    private final void method1715(int i, Stream class68_sub14, int i_24_)
    {
        do
        {
            try
            {
                if (i_24_ == 1)
                {
                    int i_25_ = class68_sub14.readUByte();
                    if (i_25_ > 0)
                    {
                        if (anIntArray1969 != null && !Class68_Sub13_Sub16.aBoolean3711)
                            ((Stream) class68_sub14).position += 3 * i_25_;
                        else
                        {
                            anIntArray2012 = new int[i_25_];
                            anIntArray1969 = new int[i_25_];
                            for (int i_26_ = 0; i_25_ > i_26_; i_26_++)
                            {
                                anIntArray1969[i_26_] = class68_sub14.readUShort();
                                anIntArray2012[i_26_] = class68_sub14.readUByte();
                            }
                        }
                    }
                } else if (i_24_ == 2)
                    ((ObjectDefinition) this).name = class68_sub14.readString();
                else if (i_24_ != 5)
                {
                    if (i_24_ != 14)
                    {
                        if (i_24_ == 15)
                            ((ObjectDefinition) this).anInt1989 = class68_sub14.readUByte();
                        else if (i_24_ != 17)
                        {
                            if (i_24_ == 18)
                                ((ObjectDefinition) this).aBoolean2032 = false;
                            else if (i_24_ == 19)
                                ((ObjectDefinition) this).anInt1985 = class68_sub14.readUByte();
                            else if (i_24_ != 21)
                            {
                                if (i_24_ != 22)
                                {
                                    if (i_24_ != 23)
                                    {
                                        if (i_24_ != 24)
                                        {
                                            if (i_24_ != 27)
                                            {
                                                if (i_24_ != 28)
                                                {
                                                    if (i_24_ != 29)
                                                    {
                                                        if (i_24_ != 39)
                                                        {
                                                            if (i_24_ >= 30 && (i_24_ < 35))
                                                            {
                                                                ((ObjectDefinition) this).actions[(i_24_ - 30)] = (class68_sub14.readString());
                                                                if (((ObjectDefinition) this).actions[(i_24_ - 30)].method1606(false, (Class13_Sub2.aClass100_2649)))
                                                                    ((ObjectDefinition) this).actions[(i_24_ - 30)] = null;
                                                            } else if (i_24_ != 40)
                                                            {
                                                                if (i_24_ != 41)
                                                                {
                                                                    if (i_24_ != 42)
                                                                    {
                                                                        if (i_24_ != 60)
                                                                        {
                                                                            if (i_24_ != 62)
                                                                            {
                                                                                if (i_24_ == 64)
                                                                                    ((ObjectDefinition) this).aBoolean2029 = false;
                                                                                else if (i_24_ == 65)
                                                                                    anInt1979 = class68_sub14.readUShort();
                                                                                else if (i_24_ != 66)
                                                                                {
                                                                                    if (i_24_ == 67)
                                                                                        anInt2005 = class68_sub14.readUShort();
                                                                                    else if (i_24_ == 68)
                                                                                        ((ObjectDefinition) this).anInt1975 = class68_sub14.readUShort();
                                                                                    else if (i_24_ != 69)
                                                                                    {
                                                                                        if (i_24_ != 70)
                                                                                        {
                                                                                            if (i_24_ != 71)
                                                                                            {
                                                                                                if (i_24_ == 72)
                                                                                                    anInt1988 = class68_sub14.readShort();
                                                                                                else if (i_24_ != 73)
                                                                                                {
                                                                                                    if (i_24_ != 74)
                                                                                                    {
                                                                                                        if (i_24_ != 75)
                                                                                                        {
                                                                                                            if (i_24_ == 77 || i_24_ == 92)
                                                                                                            {
                                                                                                                anInt1978 = class68_sub14.readUShort();
                                                                                                                if (anInt1978 == 65535)
                                                                                                                    anInt1978 = -1;
                                                                                                                int i_27_ = -1;
                                                                                                                anInt2000 = class68_sub14.readUShort();
                                                                                                                if (anInt2000 == 65535)
                                                                                                                    anInt2000 = -1;
                                                                                                                if (i_24_ == 92)
                                                                                                                {
                                                                                                                    i_27_ = class68_sub14.readUShort();
                                                                                                                    if (i_27_ == 65535)
                                                                                                                        i_27_ = -1;
                                                                                                                }
                                                                                                                int i_28_ = class68_sub14.readUByte();
                                                                                                                ((ObjectDefinition) this).childrenIDs = new int[i_28_ + 2];
                                                                                                                for (int i_29_ = 0; i_28_ >= i_29_; i_29_++)
                                                                                                                {
                                                                                                                    ((ObjectDefinition) this).childrenIDs[i_29_] = class68_sub14.readUShort();
                                                                                                                    if (((ObjectDefinition) this).childrenIDs[i_29_] == 65535)
                                                                                                                        ((ObjectDefinition) this).childrenIDs[i_29_] = -1;
                                                                                                                }
                                                                                                                ((ObjectDefinition) this).childrenIDs[i_28_ + 1] = i_27_;
                                                                                                            } else if (i_24_ != 78)
                                                                                                            {
                                                                                                                if (i_24_ == 79)
                                                                                                                {
                                                                                                                    ((ObjectDefinition) this).anInt1966 = class68_sub14.readUShort();
                                                                                                                    ((ObjectDefinition) this).anInt2002 = class68_sub14.readUShort();
                                                                                                                    ((ObjectDefinition) this).anInt1977 = class68_sub14.readUByte();
                                                                                                                    int i_30_ = class68_sub14.readUByte();
                                                                                                                    ((ObjectDefinition) this).anIntArray1997 = new int[i_30_];
                                                                                                                    for (int i_31_ = 0; i_30_ > i_31_; i_31_++)
                                                                                                                        ((ObjectDefinition) this).anIntArray1997[i_31_] = class68_sub14.readUShort();
                                                                                                                } else if (i_24_ != 81)
                                                                                                                {
                                                                                                                    if (i_24_ != 82)
                                                                                                                    {
                                                                                                                        if (i_24_ == 88)
                                                                                                                            ((ObjectDefinition) this).aBoolean2020 = false;
                                                                                                                        else if (i_24_ != 89)
                                                                                                                        {
                                                                                                                            if (i_24_ != 90)
                                                                                                                            {
                                                                                                                                if (i_24_ != 91)
                                                                                                                                {
                                                                                                                                    if (i_24_ == 93)
                                                                                                                                    {
                                                                                                                                        aByte1965 = (byte) 3;
                                                                                                                                        aShort1963 = (short) class68_sub14.readUShort();
                                                                                                                                    } else if (i_24_ != 94)
                                                                                                                                    {
                                                                                                                                        if (i_24_ == 95)
                                                                                                                                            aByte1965 = (byte) 5;
                                                                                                                                        else if (i_24_ != 96)
                                                                                                                                        {
                                                                                                                                            if (i_24_ == 97)
                                                                                                                                                ((ObjectDefinition) this).aBoolean2019 = true;
                                                                                                                                            else if (i_24_ == 249)
                                                                                                                                            {
                                                                                                                                                int i_32_ = class68_sub14.readUByte();
                                                                                                                                                if (aClass113_1971 == null)
                                                                                                                                                {
                                                                                                                                                    int i_33_ = Class90.method1523(i_32_, i ^ 0x7eed99b1);
                                                                                                                                                    aClass113_1971 = new NodeCache(i_33_);
                                                                                                                                                }
                                                                                                                                                for (int i_34_ = 0; i_32_ > i_34_; i_34_++)
                                                                                                                                                {
                                                                                                                                                    boolean bool = class68_sub14.readUByte() == 1;
                                                                                                                                                    int i_35_ = class68_sub14.readTInteger();
                                                                                                                                                    Node class68;
                                                                                                                                                    if (bool)
                                                                                                                                                        class68 = new Class68_Sub5(class68_sub14.readString());
                                                                                                                                                    else
                                                                                                                                                        class68 = new Class68_Sub10(class68_sub14.readInteger());
                                                                                                                                                    aClass113_1971.method1683((byte) 11, class68, (long) i_35_);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } else
                                                                                                                                            ((ObjectDefinition) this).aBoolean2007 = true;
                                                                                                                                    } else
                                                                                                                                        aByte1965 = (byte) 4;
                                                                                                                                } else
                                                                                                                                    ((ObjectDefinition) this).aBoolean1980 = true;
                                                                                                                            } else
                                                                                                                                ((ObjectDefinition) this).aBoolean1962 = true;
                                                                                                                        } else
                                                                                                                            ((ObjectDefinition) this).aBoolean1999 = false;
                                                                                                                    }
                                                                                                                } else
                                                                                                                {
                                                                                                                    aByte1965 = (byte) 2;
                                                                                                                    aShort1963 = (short) (256 * class68_sub14.readUByte());
                                                                                                                }
                                                                                                            } else
                                                                                                            {
                                                                                                                ((ObjectDefinition) this).anInt1984 = class68_sub14.readUShort();
                                                                                                                ((ObjectDefinition) this).anInt1977 = class68_sub14.readUByte();
                                                                                                            }
                                                                                                        } else
                                                                                                            ((ObjectDefinition) this).anInt1974 = class68_sub14.readUByte();
                                                                                                    } else
                                                                                                        ((ObjectDefinition) this).aBoolean1970 = true;
                                                                                                } else
                                                                                                    ((ObjectDefinition) this).aBoolean2006 = true;
                                                                                            } else
                                                                                                anInt1991 = class68_sub14.readShort();
                                                                                        } else
                                                                                            anInt1967 = class68_sub14.readShort();
                                                                                    } else
                                                                                        ((ObjectDefinition) this).anInt1992 = class68_sub14.readUByte();
                                                                                } else
                                                                                    anInt2001 = class68_sub14.readUShort();
                                                                            } else
                                                                                aBoolean1973 = true;
                                                                        } else
                                                                            ((ObjectDefinition) this).anInt1982 = class68_sub14.readUShort();
                                                                    } else
                                                                    {
                                                                        int i_36_ = class68_sub14.readUByte();
                                                                        aByteArray1964 = new byte[i_36_];
                                                                        for (int i_37_ = 0; i_36_ > i_37_; i_37_++)
                                                                            aByteArray1964[i_37_] = class68_sub14.readByte();
                                                                    }
                                                                } else
                                                                {
                                                                    int i_38_ = (class68_sub14.readUByte());
                                                                    aShortArray1987 = (new short[i_38_]);
                                                                    aShortArray2025 = (new short[i_38_]);
                                                                    for (int i_39_ = 0; (i_39_ < i_38_); i_39_++)
                                                                    {
                                                                        aShortArray2025[i_39_] = (short) class68_sub14.readUShort();
                                                                        aShortArray1987[i_39_] = (short) class68_sub14.readUShort();
                                                                    }
                                                                }
                                                            } else
                                                            {
                                                                int i_40_ = (class68_sub14.readUByte());
                                                                aShortArray1983 = (new short[i_40_]);
                                                                aShortArray2028 = (new short[i_40_]);
                                                                for (int i_41_ = 0; (i_40_ > i_41_); i_41_++)
                                                                {
                                                                    aShortArray2028[i_41_] = (short) class68_sub14.readUShort();
                                                                    aShortArray1983[i_41_] = (short) class68_sub14.readUShort();
                                                                }
                                                            }
                                                        } else
                                                            anInt1981 = (5 * (class68_sub14.readByte()));
                                                    } else
                                                        anInt2015 = (class68_sub14.readByte());
                                                } else
                                                    ((ObjectDefinition) this).anInt2027 = (class68_sub14.readUByte());
                                            } else
                                                ((ObjectDefinition) this).anInt2024 = 1;
                                        } else
                                        {
                                            ((ObjectDefinition) this).anInt2004 = class68_sub14.readUShort();
                                            if (((ObjectDefinition) this).anInt2004 == 65535)
                                                ((ObjectDefinition) this).anInt2004 = -1;
                                        }
                                    } else
                                        ((ObjectDefinition) this).aBoolean2010 = true;
                                } else
                                    aBoolean1968 = true;
                            } else
                                aByte1965 = (byte) 1;
                        } else
                        {
                            ((ObjectDefinition) this).anInt2024 = 0;
                            ((ObjectDefinition) this).aBoolean2032 = false;
                        }
                    } else
                        ((ObjectDefinition) this).anInt1990 = class68_sub14.readUByte();
                } else
                {
                    int i_42_ = class68_sub14.readUByte();
                    if (i_42_ > 0)
                    {
                        if (anIntArray1969 != null && !Class68_Sub13_Sub16.aBoolean3711)
                            ((Stream) class68_sub14).position += 2 * i_42_;
                        else
                        {
                            anIntArray1969 = new int[i_42_];
                            anIntArray2012 = null;
                            for (int i_43_ = 0; i_42_ > i_43_; i_43_++)
                                anIntArray1969[i_43_] = class68_sub14.readUShort();
                        }
                    }
                }
                anInt2017++;
                if (i == -2129513334)
                    break;
                aClass113_1971 = null;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ub.K(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ',' + i_24_ + ')'));
            }
            break;
        } while (false);
    }

    final ObjectDefinition method1716(int i)
    {
        anInt2026++;
        int i_44_ = -1;
        if (anInt1978 != i)
            i_44_ = Class18.method300(anInt1978, false);
        else if (anInt2000 != -1)
            i_44_ = Class103.settingArray[anInt2000];
        if (i_44_ < 0 || i_44_ >= ((ObjectDefinition) this).childrenIDs.length - 1 || ((ObjectDefinition) this).childrenIDs[i_44_] == -1)
        {
            int i_45_ = (((ObjectDefinition) this).childrenIDs[((ObjectDefinition) this).childrenIDs.length - 1]);
            if (i_45_ == -1)
                return null;
            return Class1_Sub5.method140(87, i_45_);
        }
        return Class1_Sub5.method140(126, ((ObjectDefinition) this).childrenIDs[i_44_]);
    }

    final void method1717(byte i, Stream class68_sub14)
    {
        try
        {
            for (;;)
            {
                int i_46_ = class68_sub14.readUByte();
                if (i_46_ == 0)
                    break;
                method1715(-2129513334, class68_sub14, i_46_);
            }
            if (i != 29)
                method1712(62);
            anInt2011++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ub.M(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    final boolean method1718(int i)
    {
        anInt2016++;
        if (i < 88)
            method1714(123, (byte) 83, -84);
        if (anIntArray1969 == null)
            return true;
        boolean bool = true;
        for (int i_47_ = 0; anIntArray1969.length > i_47_; i_47_++)
            bool &= (Class68_Sub20_Sub3.aClass21_4194.method344(0xffff & anIntArray1969[i_47_], 0, (byte) -113));
        return bool;
    }

    public static void method1719(int i)
    {
        aClass100Array1994 = null;
        anIntArrayArray2018 = null;
        if (i == 0)
        {
            anIntArray1998 = null;
            aClass68_Sub20_Sub10_2021 = null;
        }
    }

    final Class44 method1720(Class92_Sub1 class92_sub1, Animation class117, boolean bool, int i, int i_48_, int i_49_, int i_50_, int[][] is, int[][] is_51_, int i_52_, int i_53_, int i_54_)
    {
        try
        {
            anInt1972++;
            long l;
            do
            {
                if (anIntArray2012 == null)
                {
                    l = (long) ((((ObjectDefinition) this).type << 10) + i_50_);
                    if (client.anInt2387 == 0)
                        break;
                }
                l = (long) ((((ObjectDefinition) this).type << 10) + (i_54_ << 3) + i_50_);
            } while (false);
            SpriteFactory class1_sub3_sub1 = ((SpriteFactory) Class68_Sub13_Sub37.aClass98_4066.getNodeForID(l));
            if (class1_sub3_sub1 == null)
            {
                Class1_Sub4 class1_sub4 = method1721(i_50_, 0, i_54_);
                if (class1_sub4 == null)
                    return null;
                class1_sub3_sub1 = new SpriteFactory(class1_sub4, anInt2015 + 64, 5 * anInt1981 + 768, -50, -10, -50);
                Class68_Sub13_Sub37.aClass98_4066.addObject(class1_sub3_sub1, l);
            }
            if (i_52_ != 65535)
                return null;
            boolean bool_55_ = false;
            if (class117 != null)
            {
                class1_sub3_sub1 = (SpriteFactory) class117.method1734(i_49_, class1_sub3_sub1, i_50_, -11436);
                bool_55_ = true;
            }
            if (i_54_ == 10 && i_50_ > 3)
            {
                if (!bool_55_)
                {
                    bool_55_ = true;
                    class1_sub3_sub1 = (SpriteFactory) class1_sub3_sub1.method82(true, true);
                }
                class1_sub3_sub1.method90(256);
            }
            if (aByte1965 != 0)
            {
                if (!bool_55_)
                {
                    bool_55_ = true;
                    class1_sub3_sub1 = (SpriteFactory) class1_sub3_sub1.method82(true, true);
                }
                class1_sub3_sub1 = class1_sub3_sub1.method100(aByte1965, aShort1963, is_51_, is, i, i_48_, i_53_, false);
            }
            ((Class44) Class68_Sub13_Sub5.aClass44_3517).aClass1_746 = class1_sub3_sub1;
            return Class68_Sub13_Sub5.aClass44_3517;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ub.D(" + (class92_sub1 != null ? "{...}" : "null") + ',' + (class117 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_48_ + ',' + i_49_ + ',' + i_50_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_51_ != null ? "{...}" : "null") + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ')'));
        }
    }

    private final Class1_Sub4 method1721(int i, int i_56_, int i_57_)
    {
        boolean bool = aBoolean1973;
        anInt1986++;
        Class1_Sub4 class1_sub4 = null;
        if (i_57_ == 2 && i > 3)
            bool = !bool;
        if (anIntArray2012 != null)
        {
            int i_58_ = -1;
            for (int i_59_ = 0; i_59_ < anIntArray2012.length; i_59_++)
            {
                if (anIntArray2012[i_59_] == i_57_)
                {
                    i_58_ = i_59_;
                    break;
                }
            }
            if (i_58_ == -1)
                return null;
            int i_60_ = anIntArray1969[i_58_];
            if (bool)
                i_60_ += 65536;
            class1_sub4 = (Class1_Sub4) Class52.aClass98_1000.getNodeForID((long) i_60_);
            if (class1_sub4 == null)
            {
                class1_sub4 = Class1_Sub4.method115(Class68_Sub20_Sub3.aClass21_4194, i_60_ & 0xffff, 0);
                if (class1_sub4 == null)
                    return null;
                if (bool)
                    class1_sub4.method114();
                Class52.aClass98_1000.addObject(class1_sub4, (long) i_60_);
            }
        } else
        {
            if (i_57_ != 10)
                return null;
            if (anIntArray1969 == null)
                return null;
            int i_61_ = anIntArray1969.length;
            for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
            {
                int i_63_ = anIntArray1969[i_62_];
                if (bool)
                    i_63_ += 65536;
                class1_sub4 = ((Class1_Sub4) Class52.aClass98_1000.getNodeForID((long) i_63_));
                if (class1_sub4 == null)
                {
                    class1_sub4 = Class1_Sub4.method115((Class68_Sub20_Sub3.aClass21_4194), i_63_ & 0xffff, 0);
                    if (class1_sub4 == null)
                        return null;
                    if (bool)
                        class1_sub4.method114();
                    Class52.aClass98_1000.addObject(class1_sub4, (long) i_63_);
                }
                if (i_61_ > 1)
                    CipheredByteVector.aClass1_Sub4Array4119[i_62_] = class1_sub4;
            }
            if (i_61_ > 1)
                class1_sub4 = new Class1_Sub4(CipheredByteVector.aClass1_Sub4Array4119, i_61_);
        }
        boolean bool_64_;
        if (anInt1967 != 0 || anInt1991 != 0 || anInt1988 != 0)
            bool_64_ = true;
        else
            bool_64_ = false;
        boolean bool_65_;
        if (anInt1979 == 128 && anInt2001 == 128 && anInt2005 == 128)
            bool_65_ = false;
        else
            bool_65_ = true;
        Class1_Sub4 class1_sub4_66_ = new Class1_Sub4(class1_sub4, i == i_56_ && !bool_65_ && !bool_64_, aShortArray2028 == null, aShortArray2025 == null, true);
        if (i_57_ == 4 && i > 3)
        {
            class1_sub4_66_.method107(256);
            class1_sub4_66_.method128(45, 0, -45);
        }
        i &= 0x3;
        if (i != 1)
        {
            if (i != 2)
            {
                if (i == 3)
                    class1_sub4_66_.method133();
            } else
                class1_sub4_66_.method123();
        } else
            class1_sub4_66_.method130();
        if (aShortArray2028 != null)
        {
            for (int i_67_ = 0; i_67_ < aShortArray2028.length; i_67_++)
            {
                if (aByteArray1964 != null && i_67_ < aByteArray1964.length)
                    class1_sub4_66_.method129(aShortArray2028[i_67_], (Class33.aShortArray579[(aByteArray1964[i_67_] & 0xff)]));
                else
                    class1_sub4_66_.method129(aShortArray2028[i_67_], aShortArray1983[i_67_]);
            }
        }
        if (aShortArray2025 != null)
        {
            for (int i_68_ = 0; i_68_ < aShortArray2025.length; i_68_++)
                class1_sub4_66_.method110(aShortArray2025[i_68_], aShortArray1987[i_68_]);
        }
        if (bool_65_)
            class1_sub4_66_.method135(anInt1979, anInt2001, anInt2005);
        if (bool_64_)
            class1_sub4_66_.method128(anInt1967, anInt1991, anInt1988);
        return class1_sub4_66_;
    }

    public ObjectDefinition()
    {
        ((ObjectDefinition) this).aBoolean1962 = false;
        anInt1979 = 128;
        anInt1981 = 0;
        ((ObjectDefinition) this).anInt1982 = -1;
        ((ObjectDefinition) this).aBoolean1970 = false;
        anInt1967 = 0;
        ((ObjectDefinition) this).anInt1974 = -1;
        aBoolean1973 = false;
        anInt1988 = 0;
        anInt2001 = 128;
        anInt1991 = 0;
        anInt1978 = -1;
        ((ObjectDefinition) this).anInt2002 = 0;
        ((ObjectDefinition) this).anInt1984 = -1;
        ((ObjectDefinition) this).aBoolean1999 = true;
        ((ObjectDefinition) this).aBoolean2006 = false;
        anInt2015 = 0;
        ((ObjectDefinition) this).anInt1990 = 1;
        ((ObjectDefinition) this).aBoolean2010 = false;
        ((ObjectDefinition) this).anInt1977 = 0;
        ((ObjectDefinition) this).anInt1966 = 0;
        aBoolean1968 = false;
        anInt2000 = -1;
        ((ObjectDefinition) this).anInt1989 = 1;
        ((ObjectDefinition) this).anInt1975 = -1;
        ((ObjectDefinition) this).aBoolean1980 = false;
        ((ObjectDefinition) this).anInt1985 = -1;
        ((ObjectDefinition) this).actions = new MutableString[5];
        ((ObjectDefinition) this).anInt2004 = -1;
        ((ObjectDefinition) this).name = Class68_Sub20_Sub10.aClass100_4319;
        ((ObjectDefinition) this).aBoolean2007 = false;
        anInt2005 = 128;
        ((ObjectDefinition) this).anInt2024 = 2;
        ((ObjectDefinition) this).aBoolean2019 = false;
        ((ObjectDefinition) this).aBoolean2020 = true;
        ((ObjectDefinition) this).anInt2027 = 16;
        ((ObjectDefinition) this).aBoolean2029 = true;
        ((ObjectDefinition) this).anInt1992 = 0;
        ((ObjectDefinition) this).aBoolean2032 = true;
    }
}
