/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class21
{
    static int anInt422;
    static int anInt423;
    static int anInt424;
    private int[][] anIntArrayArray425;
    private boolean aBoolean426;
    private Class109[] aClass109Array427;
    int anInt428;
    static int anInt429;
    static int anInt430;
    static int anInt431;
    static int anInt432;
    private int[][] anIntArrayArray433;
    static int anInt434;
    Object[] anObjectArray435;
    static int anInt436;
    static int anInt437;
    static int anInt438;
    private int[] anIntArray439;
    static int anInt440;
    int[] dataSizes;
    static int anInt442;
    static int anInt443;
    private Class109 aClass109_444;
    static int anInt445;
    static int anInt446;
    private boolean aBoolean447;
    private int[] anIntArray448;
    static int anInt449;
    static int anInt450;
    static int anInt451;
    static int anInt452;
    static int anInt453;
    private int anInt454;
    static int anInt455;
    static int anInt456;
    private Object[][] anObjectArrayArray457;
    static int anInt458;
    static Class21_Sub1 aClass21_Sub1_459;
    static int anInt460;
    static int anInt461;
    static int anInt462;
    static int anInt463;
    static int anInt464;
    static int anInt465;
    static CipheredByteVector connectionVector = new CipheredByteVector(5000);
    static int anInt467;
    int[] anIntArray468;
    static int anInt469;
    static int anInt470;
    static int anInt471;
    static Class21_Sub1 aClass21_Sub1_472;
    static int anInt473;
    int[] anIntArray474;
    private int[] anIntArray475;
    static long aLong476;
    static MutableString aClass100_477 = Class112.makeMutableString(43, "Okay");
    static MutableString aClass100_478;
    static int appletHeight;
    static int anInt480 = 0;

    static final Class92[] method328(int i)
    {
        anInt460++;
        Class92[] class92s = new Class92[Stream.anInt3009];
        for (int i_0_ = 0; Stream.anInt3009 > i_0_; i_0_++)
            class92s[i_0_] = new Class92_Sub1(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[i_0_], ObjectDefinition.anIntArray1998[i_0_], Class68_Sub13_Sub12.anIntArray3641[i_0_], Class68_Sub13_Sub19.anIntArray3759[i_0_], Object5.aByteArrayArray1240[i_0_], Class68_Sub13_Sub17.anIntArray3721);
        Class87.method1493((byte) -93);
        if (i != 32568)
            method348(null, (byte) -128, null);
        return class92s;
    }

    static final void ShowUsage()
    {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        anInt462++;
        System.exit(1);
    }

    final void method330(MutableString class100, int i)
    {
        try
        {
            class100 = class100.toLowerCase((byte) -109);
            anInt461++;
            int i_2_ = 58 / ((68 - i) / 42);
            int i_3_ = aClass109_444.method1663(class100.generateHash(), -1);
            method334(i_3_, (byte) 113);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "cj.EA(" + (class100 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    void method331(byte i, int i_4_)
    {
        if (i < -103)
            anInt440++;
    }

    int method332(int i, int i_5_)
    {
        anInt458++;
        if (!validIndex(i_5_, i))
            return 0;
        if (((Class21) this).anObjectArray435[i_5_] != null)
            return 100;
        return 0;
    }

    final boolean method333(byte i, int i_6_)
    {
        anInt452++;
        if (!validIndex(i_6_, 0))
            return false;
        if (((Class21) this).anObjectArray435[i_6_] != null)
            return true;
        method331((byte) -107, i_6_);
        if (((Class21) this).anObjectArray435[i_6_] != null)
            return true;
        int i_7_ = 105 / ((-74 - i) / 40);
        return false;
    }

    void method334(int i, byte i_8_)
    {
        anInt469++;
        if (i_8_ <= 84)
            anIntArrayArray425 = null;
    }

    final int getIndex(MutableString str, byte i)
    {
        try
        {
            str = str.toLowerCase((byte) 104);
            int i_9_ = aClass109_444.method1663(str.generateHash(), -1);
            if (!validIndex(i_9_, 0))
                return -1;
            return i_9_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "cj.HA(" + (str != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    private final boolean method336(int i, int[] is, int i_10_)
    {
        try
        {
            anInt431++;
            if (!validIndex(i_10_, 0))
                return false;
            if (((Class21) this).anObjectArray435[i_10_] == null)
                return false;
            int[] is_11_ = anIntArrayArray433[i_10_];
            boolean bool = true;
            int i_12_ = ((Class21) this).dataSizes[i_10_];
            if (anObjectArrayArray457[i_10_] == null)
                anObjectArrayArray457[i_10_] = new Object[anIntArray448[i_10_]];
            Object[] objects = anObjectArrayArray457[i_10_];
            for (int i_13_ = 0; i_12_ > i_13_; i_13_++)
            {
                int i_14_;
                if (is_11_ != null)
                    i_14_ = is_11_[i_13_];
                else
                    i_14_ = i_13_;
                if (objects[i_14_] == null)
                {
                    bool = false;
                    break;
                }
            }
            if (bool)
                return true;
            int i_15_ = -124 % ((i - 9) / 44);
            byte[] is_16_;
            if (is == null || is[0] == 0 && is[1] == 0 && is[2] == 0 && is[3] == 0)
                is_16_ = Animable.method53(false, (byte) -4, (((Class21) this).anObjectArray435[i_10_]));
            else
            {
                is_16_ = Animable.method53(true, (byte) -4, (((Class21) this).anObjectArray435[i_10_]));
                Stream class68_sub14 = new Stream(is_16_);
                class68_sub14.method946(is, 5, (((Stream) class68_sub14).buffer).length, (byte) 102);
            }
            byte[] is_17_;
            try
            {
                is_17_ = MutableString.method1618(is_16_, true);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("T3 - " + (is != null) + "," + i_10_ + "," + is_16_.length + "," + Class72.method1357(is_16_.length, -1, is_16_) + "," + Class72.method1357(is_16_.length - 2, -1, is_16_) + "," + ((Class21) this).anIntArray468[i_10_] + "," + ((Class21) this).anInt428));
            }
            if (aBoolean426)
                ((Class21) this).anObjectArray435[i_10_] = null;
            if (i_12_ > 1)
            {
                int i_18_ = is_17_.length;
                int i_19_ = is_17_[--i_18_] & 0xff;
                Stream class68_sub14 = new Stream(is_17_);
                i_18_ -= i_19_ * (i_12_ * 4);
                ((Stream) class68_sub14).position = i_18_;
                int[] is_20_ = new int[i_12_];
                for (int i_21_ = 0; i_19_ > i_21_; i_21_++)
                {
                    int i_22_ = 0;
                    for (int i_23_ = 0; i_12_ > i_23_; i_23_++)
                    {
                        i_22_ += class68_sub14.readInteger();
                        is_20_[i_23_] += i_22_;
                    }
                }
                byte[][] is_24_ = new byte[i_12_][];
                for (int i_25_ = 0; i_25_ < i_12_; i_25_++)
                {
                    is_24_[i_25_] = new byte[is_20_[i_25_]];
                    is_20_[i_25_] = 0;
                }
                int i_26_ = 0;
                ((Stream) class68_sub14).position = i_18_;
                for (int i_27_ = 0; i_19_ > i_27_; i_27_++)
                {
                    int i_28_ = 0;
                    for (int i_29_ = 0; i_29_ < i_12_; i_29_++)
                    {
                        i_28_ += class68_sub14.readInteger();
                        Class39.arraycopy(is_17_, i_26_, is_24_[i_29_], is_20_[i_29_], i_28_);
                        i_26_ += i_28_;
                        is_20_[i_29_] += i_28_;
                    }
                }
                for (int i_30_ = 0; i_30_ < i_12_; i_30_++)
                {
                    int i_31_;
                    if (is_11_ != null)
                        i_31_ = is_11_[i_30_];
                    else
                        i_31_ = i_30_;
                    if (!aBoolean447)
                        objects[i_31_] = Class120.method1745(false, (byte) -2, is_24_[i_30_]);
                    else
                        objects[i_31_] = is_24_[i_30_];
                }
            } else
            {
                int i_32_;
                if (is_11_ != null)
                    i_32_ = is_11_[0];
                else
                    i_32_ = 0;
                if (!aBoolean447)
                    objects[i_32_] = Class120.method1745(false, (byte) -128, is_17_);
                else
                    objects[i_32_] = is_17_;
            }
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cj.DA(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_10_ + ')'));
        }
    }

    final int method337(int i)
    {
        anInt471++;
        if (i != 0)
            return -124;
        return anIntArray448.length;
    }

    final byte[] method338(int i, int i_33_, int i_34_)
    {
        if (i_33_ != 0)
            anIntArray448 = null;
        anInt442++;
        return method350(null, i_34_, i, (byte) -91);
    }

    static final MutableString method339(int i, int i_35_)
    {
        anInt445++;
        MutableString class100 = new MutableString();
        if (i != -18982)
            return null;
        ((MutableString) class100).data = new byte[i_35_];
        ((MutableString) class100).length = 0;
        return class100;
    }

    private final boolean method340(byte i, int i_36_, int i_37_)
    {
        anInt467++;
        int i_38_ = -92 / ((9 - i) / 43);
        if (i_36_ < 0 || i_37_ < 0 || anIntArray448.length <= i_36_ || i_37_ >= anIntArray448[i_36_])
        {
            if (!Class68_Sub13_Sub17.aBoolean3713)
                return false;
            throw new IllegalArgumentException(String.valueOf(i_36_) + "," + i_37_);
        }
        return true;
    }

    final void method341(int i, int i_39_)
    {
        anInt464++;
        if (validIndex(i, i_39_))
            anObjectArrayArray457[i] = null;
    }

    final void method342(boolean bool, byte i, boolean bool_40_)
    {
        if (bool)
        {
            anIntArray475 = null;
            aClass109_444 = null;
        }
        if (i == 113)
        {
            if (bool_40_)
            {
                anIntArrayArray425 = null;
                aClass109Array427 = null;
            }
            anInt473++;
        }
    }

    final byte[] method343(int i, int i_41_, int i_42_)
    {
        if (i_41_ != 14281)
            getData(-94);
        anInt424++;
        if (!method340((byte) 115, i_42_, i))
            return null;
        if (anObjectArrayArray457[i_42_] == null || anObjectArrayArray457[i_42_][i] == null)
        {
            boolean bool = method336(i_41_ - 14355, null, i_42_);
            if (!bool)
            {
                method331((byte) -124, i_42_);
                bool = method336(i_41_ - 14194, null, i_42_);
                if (!bool)
                    return null;
            }
        }
        byte[] is = Animable.method53(false, (byte) -4, anObjectArrayArray457[i_42_][i]);
        return is;
    }

    final boolean method344(int i, int i_43_, byte i_44_)
    {
        anInt463++;
        if (!method340((byte) -81, i, i_43_))
            return false;
        if (anObjectArrayArray457[i] != null && anObjectArrayArray457[i][i_43_] != null)
            return true;
        if (i_44_ >= -92)
            return false;
        if (((Class21) this).anObjectArray435[i] != null)
            return true;
        method331((byte) -107, i);
        if (((Class21) this).anObjectArray435[i] != null)
            return true;
        return false;
    }

    final int[] getData(int dataIndex)
    {
        if (!validIndex(dataIndex, 0))
            return null;
        int[] data = anIntArrayArray433[dataIndex];
        if (data == null)
        {
            data = new int[dataSizes[dataIndex]];
            for (int idx = 0; idx < data.length; idx++)
                data[idx] = idx;
        }
        return data;
    }

    final boolean validIndex(int i, int i_46_)
    {
        anInt450++;
        if (i < i_46_ || anIntArray448.length <= i || anIntArray448[i] == 0)
        {
            if (Class68_Sub13_Sub17.aBoolean3713)
                throw new IllegalArgumentException(Integer.toString(i));
            return false;
        }
        return true;
    }

    final boolean method347(byte i, MutableString class100)
    {
        try
        {
            anInt422++;
            class100 = class100.toLowerCase((byte) 95);
            int i_47_ = aClass109_444.method1663(class100.generateHash(), -1);
            if (i_47_ < 0)
                return false;
            if (i >= -88)
                return false;
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cj.A(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method348(Class21 class21, byte i, Class21 class21_48_)
    {
        try
        {
            Class25.aClass21_513 = class21_48_;
            if (i == -72)
            {
                Class68_Sub20_Sub8.aClass21_4292 = class21;
                anInt470++;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cj.O(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + (class21_48_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method349(byte[] is, int i)
    {
        do
        {
            try
            {
                ((Class21) this).anInt428 = Class72.method1357(is.length, -1, is);
                anInt434++;
                Stream class68_sub14 = new Stream(MutableString.method1618(is, true));
                int i_49_ = class68_sub14.readUByte();
                if (i_49_ != 5 && i_49_ != 6)
                    throw new RuntimeException("Incorrect JS5 protocol number: " + i_49_);
                if (i_49_ >= 6)
                    class68_sub14.readInteger();
                int i_50_ = class68_sub14.readUByte();
                anInt454 = class68_sub14.readUShort();
                anIntArray439 = new int[anInt454];
                int i_51_ = 0;
                int i_52_ = -1;
                if (i != -25529)
                    aBoolean426 = true;
                for (int i_53_ = 0; anInt454 > i_53_; i_53_++)
                {
                    anIntArray439[i_53_] = i_51_ += class68_sub14.readUShort();
                    if (i_52_ < anIntArray439[i_53_])
                        i_52_ = anIntArray439[i_53_];
                }
                ((Class21) this).anIntArray468 = new int[i_52_ + 1];
                ((Class21) this).anIntArray474 = new int[i_52_ + 1];
                ((Class21) this).dataSizes = new int[i_52_ + 1];
                anIntArrayArray433 = new int[i_52_ + 1][];
                ((Class21) this).anObjectArray435 = new Object[i_52_ + 1];
                anObjectArrayArray457 = new Object[i_52_ + 1][];
                anIntArray448 = new int[i_52_ + 1];
                if (i_50_ != 0)
                {
                    anIntArray475 = new int[i_52_ + 1];
                    for (int i_54_ = 0; i_52_ + 1 > i_54_; i_54_++)
                        anIntArray475[i_54_] = -1;
                    for (int i_55_ = 0; i_55_ < anInt454; i_55_++)
                        anIntArray475[anIntArray439[i_55_]] = class68_sub14.readInteger();
                    aClass109_444 = new Class109(anIntArray475);
                }
                for (int i_56_ = 0; i_56_ < anInt454; i_56_++)
                    ((Class21) this).anIntArray468[anIntArray439[i_56_]] = class68_sub14.readInteger();
                for (int i_57_ = 0; anInt454 > i_57_; i_57_++)
                    ((Class21) this).anIntArray474[anIntArray439[i_57_]] = class68_sub14.readInteger();
                for (int i_58_ = 0; i_58_ < anInt454; i_58_++)
                    ((Class21) this).dataSizes[anIntArray439[i_58_]] = class68_sub14.readUShort();
                for (int i_59_ = 0; anInt454 > i_59_; i_59_++)
                {
                    i_51_ = 0;
                    int i_60_ = anIntArray439[i_59_];
                    int i_61_ = ((Class21) this).dataSizes[i_60_];
                    anIntArrayArray433[i_60_] = new int[i_61_];
                    int i_62_ = -1;
                    for (int i_63_ = 0; i_61_ > i_63_; i_63_++)
                    {
                        int i_64_ = (anIntArrayArray433[i_60_][i_63_] = i_51_ += class68_sub14.readUShort());
                        if (i_64_ > i_62_)
                            i_62_ = i_64_;
                    }
                    anIntArray448[i_60_] = i_62_ + 1;
                    if (i_61_ == i_62_ + 1)
                        anIntArrayArray433[i_60_] = null;
                }
                if (i_50_ == 0)
                    break;
                aClass109Array427 = new Class109[i_52_ + 1];
                anIntArrayArray425 = new int[i_52_ + 1][];
                for (int i_65_ = 0; anInt454 > i_65_; i_65_++)
                {
                    int i_66_ = anIntArray439[i_65_];
                    int i_67_ = ((Class21) this).dataSizes[i_66_];
                    anIntArrayArray425[i_66_] = new int[anIntArray448[i_66_]];
                    for (int i_68_ = 0; i_68_ < anIntArray448[i_66_]; i_68_++)
                        anIntArrayArray425[i_66_][i_68_] = -1;
                    for (int i_69_ = 0; i_69_ < i_67_; i_69_++)
                    {
                        int i_70_;
                        if (anIntArrayArray433[i_66_] == null)
                            i_70_ = i_69_;
                        else
                            i_70_ = anIntArrayArray433[i_66_][i_69_];
                        anIntArrayArray425[i_66_][i_70_] = class68_sub14.readInteger();
                    }
                    aClass109Array427[i_66_] = new Class109(anIntArrayArray425[i_66_]);
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("cj.U(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    final byte[] method350(int[] is, int i, int i_71_, byte i_72_)
    {
        try
        {
            anInt453++;
            int i_73_ = -126 / ((i_72_ - 39) / 50);
            if (!method340((byte) 67, i, i_71_))
                return null;
            if (anObjectArrayArray457[i] == null || anObjectArrayArray457[i][i_71_] == null)
            {
                boolean bool = method336(82, is, i);
                if (!bool)
                {
                    method331((byte) -110, i);
                    bool = method336(69, is, i);
                    if (!bool)
                        return null;
                }
            }
            byte[] is_74_ = Animable.method53(false, (byte) -4, anObjectArrayArray457[i][i_71_]);
            if (aBoolean447)
            {
                anObjectArrayArray457[i][i_71_] = null;
                if (anIntArray448[i] == 1)
                    anObjectArrayArray457[i] = null;
            }
            return is_74_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cj.F(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_71_ + ',' + i_72_ + ')'));
        }
    }

    final byte[] method351(MutableString class100, MutableString class100_75_, byte i)
    {
        try
        {
            class100 = class100.toLowerCase((byte) 67);
            class100_75_ = class100_75_.toLowerCase((byte) 75);
            int i_76_ = aClass109_444.method1663(class100.generateHash(), -1);
            anInt436++;
            if (!validIndex(i_76_, 0))
                return null;
            if (i <= 65)
                return null;
            int i_77_ = aClass109Array427[i_76_].method1663(class100_75_.generateHash(), -1);
            return method338(i_77_, 0, i_76_);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cj.H(" + (class100 != null ? "{...}" : "null") + ',' + (class100_75_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final int method352(int i)
    {
        anInt423++;
        int i_78_ = 0;
        int i_79_ = 0;
        for (int i_80_ = i; i_80_ < ((Class21) this).anObjectArray435.length; i_80_++)
        {
            if (((Class21) this).dataSizes[i_80_] > 0)
            {
                i_79_ += method332(i, i_80_);
                i_78_ += 100;
            }
        }
        if (i_78_ == 0)
            return 100;
        int i_81_ = 100 * i_79_ / i_78_;
        return i_81_;
    }

    final boolean method353(byte i)
    {
        anInt437++;
        if (i != -62)
            return true;
        boolean bool = true;
        for (int i_82_ = 0; i_82_ < anIntArray439.length; i_82_++)
        {
            int i_83_ = anIntArray439[i_82_];
            if (((Class21) this).anObjectArray435[i_83_] == null)
            {
                method331((byte) -109, i_83_);
                if (((Class21) this).anObjectArray435[i_83_] == null)
                    bool = false;
            }
        }
        return bool;
    }

    final boolean method354(int i, MutableString class100)
    {
        try
        {
            if (i != 0)
                validIndex(11, -69);
            class100 = class100.toLowerCase((byte) -82);
            anInt438++;
            int i_84_ = aClass109_444.method1663(class100.generateHash(), -1);
            return method333((byte) -122, i_84_);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cj.LA(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    final int method355(int i, int i_85_)
    {
        anInt451++;
        if (!validIndex(i, i_85_))
            return 0;
        return anIntArray448[i];
    }

    public static void method356(int i)
    {
        aClass100_478 = null;
        aClass21_Sub1_459 = null;
        aClass100_477 = null;
        if (i >= 39)
        {
            aClass21_Sub1_472 = null;
            connectionVector = null;
        }
    }

    final void method357(int i)
    {
        for (int i_86_ = i; anObjectArrayArray457.length > i_86_; i_86_++)
            anObjectArrayArray457[i_86_] = null;
        anInt430++;
    }

    static final void method358(int i)
    {
        Class68_Sub20_Sub10.aLong4308 = 0L;
        ((Class84) Class14.aClass84_241).anInt1547 = 0;
        Class17.aBoolean284 = true;
        Class7.anInt122 = 0;
        anInt465++;
        NPCDefinition.anInt1419 = 0;
        client.anInt2370 = 0;
        Class48.anInt951 = 0;
        RandomNumberGenerator.anInt1475 = 0;
        Class21_Sub1.anInt2702 = 0;
        anInt423 = 0;
        Class21_Sub1.anInt2721 = 0;
        Class14.anInt239 = 0;
        Class90.anInt2340 = 0;
        MutableString.anInt2282 = 0;
        ObjectDefinition.anInt2017 = 0;
        NodeList.anInt254 = 0;
        Class72.anInt1310 = 0;
        Class68_Sub9.anInt2897 = 0;
        Class68_Sub18.anInt3058 = 0;
        MutableString.anInt2290 = 0;
        Login.anInt1504 = 0;
        Class68_Sub20_Sub11.anInt4327 = 0;
        Class32.anInt570 = 0;
        Class68_Sub19.anInt3070 = 0;
        Class68_Sub20_Sub8.anInt4271 = 0;
        GameSocket.anInt1126 = 0;
        NodeSubList.anInt2215 = 0;
        Class68_Sub13_Sub13.anInt3654 = 0;
        GameApplet.anInt37 = 0;
        MRUNodes.anInt1733 = 0;
        MRUNodes.anInt1727 = 0;
        GameApplet.anInt15 = 0;
        Class68_Sub13_Sub26_Sub1.anInt4614 = 0;
        CipheredByteVector.anInt4124 = 0;
        PlayerDefinition.anInt2186 = 0;
        Class68_Sub9.anInt2892 = 0;
        Class28.anInt533 = 0;
        NodeSubList.anInt2217 = 0;
        Class68_Sub28_Sub1.anInt4489 = 0;
        Class72.anInt1313 = 0;
        Class68_Sub13_Sub23.anInt3826 = 0;
        Class68_Sub13_Sub21.anInt3791 = 0;
        Class68_Sub20_Sub8.anInt4285 = 0;
        Stream.anInt2954 = 0;
        Class68_Sub13_Sub12.anInt3644 = 0;
        MutableString.anInt2266 = 0;
        Class114.anInt1933 = 0;
        Class68_Sub13_Sub24.anInt3848 = 0;
        Class68_Sub20_Sub3.anInt4206 = 0;
        Class68_Sub19.anInt3067 = 0;
        Class13_Sub2.anInt2650 = 0;
        Class68_Sub20_Sub10.anInt4306 = 0;
        Class68_Sub20_Sub19.anInt4455 = 0;
        NPCDefinition.anInt1410 = 0;
        ObjectDefinition.anInt2011 = 0;
        Login.anInt1520 = 0;
        MRUNodes.anInt1728 = 0;
        Animation.anInt2059 = 0;
        GameApplet.anInt29 = 0;
        Class90.anInt2352 = 0;
        Class103.anInt1776 = 0;
        Class68_Sub13_Sub21.anInt3800 = 0;
        Animable.anInt55 = 0;
        GameException.anInt2247 = 0;
        Class1_Sub7.anInt2617 = 0;
        Class68_Sub13_Sub37.anInt4076 = 0;
        Class68_Sub17.anInt3034 = 0;
        Class21_Sub1.anInt2696 = 0;
        MutableString.anInt2283 = 0;
        NPCDefinition.anInt1452 = 0;
        Class68_Sub13_Sub36.anInt4050 = 0;
        Class89.anInt1615 = 0;
        Class68_Sub28_Sub2.anInt4535 = 0;
        Class68_Sub20_Sub3.anInt4203 = 0;
        Object4.anInt1076 = 0;
        Class1_Sub1.anInt2430 = 0;
        Class68_Sub28_Sub1.anInt4481 = 0;
        Class35.anInt621 = 0;
        Class95.anInt1694 = 0;
        Class68_Sub13_Sub25.anInt3851 = 0;
        Animation.anInt2071 = 0;
        Class68_Sub13_Sub7.anInt3548 = 0;
        Class70.anInt1280 = 0;
        Class68_Sub13_Sub26.anInt3877 = 0;
        Class68_Sub13_Sub11.anInt3626 = 0;
        Class68_Sub13_Sub31.anInt3959 = 0;
        Class68_Sub28_Sub2.anInt4536 = 0;
        Class68_Sub4.anInt2828 = 0;
        Class68_Sub13.anInt2935 = 0;
        Class68_Sub28_Sub1.anInt4468 = 0;
        Class13_Sub3.anInt2663 = 0;
        Class68_Sub25.anInt3168 = 0;
        Class68_Sub20_Sub17.anInt4445 = 0;
        Class68_Sub13_Sub25.anInt3863 = 0;
        Class3.anInt86 = 0;
        Class68_Sub20_Sub13_Sub2.anInt4620 = 0;
        Class68_Sub13_Sub22.anInt3815 = 0;
        Class20.anInt420 = 0;
        Class1_Sub7.anInt2609 = 0;
        Class124.anInt2159 = 0;
        Class68_Sub13.anInt2942 = 0;
        Class68_Sub13_Sub30.anInt3946 = 0;
        Class58.anInt1093 = 0;
        Class68_Sub25.anInt3171 = 0;
        Class96.anInt1698 = 0;
        GameApplet.anInt35 = 0;
        Class68_Sub13_Sub34.anInt4005 = 0;
        Class112.anInt1890 = 0;
        Class68_Sub20_Sub12.anInt4349 = 0;
        Keyboard.anInt2123 = 0;
        client.anInt2379 = 0;
        Class114.anInt1937 = 0;
        Class74.anInt1326 = 0;
        GameApplet.anInt30 = 0;
        ItemDefinition.anInt372 = 0;
        Class72_Sub1.anInt3286 = 0;
        Class68_Sub20_Sub3.anInt4208 = 0;
        GameApplet.numParamsCounter = 0;
        Class72.anInt1309 = 0;
        ScriptParameters.anInt3231 = 0;
        Widget.anInt882 = 0;
        MutableString.anInt2321 = 0;
        Class68_Sub20_Sub8.anInt4277 = 0;
        Class109.anInt1844 = 0;
        Class35.anInt620 = 0;
        Class68_Sub13_Sub33.anInt3999 = 0;
        Class68_Sub8.anInt2879 = 0;
        RandomNumberGenerator.anInt1476 = 0;
        Class112.anInt1901 = 0;
        Class68_Sub13_Sub31.anInt3974 = 0;
        ObjectDefinition.anInt1986 = 0;
        Class90.anInt2366 = 0;
        Mouse.anInt1574 = 0;
        Class112.anInt1895 = 0;
        Class67.anInt1214 = 0;
        GameApplet.anInt27 = 0;
        Class34.anInt599 = 0;
        Class68_Sub20_Sub13.anInt4362 = 0;
        Class68_Sub13_Sub36.anInt4040 = 0;
        Class102.anInt1757 = 0;
        GroundData.anInt673 = 0;
        anInt430 = 0;
        PlayerDefinition.anInt2202 = 0;
        Class28.anInt526 = 0;
        Class68_Sub13_Sub36.anInt4038 = 0;
        Class11.anInt194 = 0;
        Class103.anInt1768 = 0;
        Class71.anInt1292 = 0;
        Stream.anInt3004 = 0;
        Animable.anInt56 = 0;
        Class68_Sub13_Sub32.anInt3985 = 0;
        MutableString.anInt2291 = 0;
        Class68_Sub20_Sub7.anInt4255 = 0;
        Class68_Sub13_Sub26.anInt3872 = 0;
        Class9.anInt166 = 0;
        NodeSubList.anInt2224 = 0;
        Class74.anInt1325 = 0;
        Class68_Sub20_Sub13_Sub2.anInt4619 = 0;
        Class68_Sub8.anInt2876 = 0;
        CipheredByteVector.anInt4127 = 0;
        Class68_Sub20_Sub15.anInt4400 = 0;
        Class68_Sub13.anInt2940 = 0;
        Class53.anInt1018 = 0;
        Class72.anInt1316 = 0;
        Player.anInt3402 = 0;
        NodeList.anInt264 = 0;
        anInt424 = 0;
        NPCDefinition.anInt1462 = 0;
        Class68_Sub13_Sub17.anInt3724 = 0;
        Class17.anInt281 = 0;
        Class68_Sub28_Sub2.anInt4538 = 0;
        Class68_Sub13_Sub39.anInt4107 = 0;
        Class25.anInt510 = 0;
        Class68_Sub13_Sub13.anInt3660 = 0;
        Animable.anInt68 = 0;
        NodeSubList.anInt2219 = 0;
        Class90.anInt2349 = 0;
        Class104.anInt1778 = 0;
        Class13_Sub1.anInt2639 = 0;
        GameApplet.anInt22 = 0;
        Class68_Sub13_Sub25.anInt3859 = 0;
        MutableString.anInt2279 = 0;
        GroundData.anInt665 = 0;
        Class68_Sub13_Sub13.anInt3656 = 0;
        ScriptParameters.anInt3240 = 0;
        GameCanvas.anInt52 = 0;
        Class103.anInt1761 = 0;
        Class68_Sub13_Sub16.anInt3702 = 0;
        GameApplet.anInt18 = 0;
        Class68_Sub13_Sub25.anInt3850 = 0;
        MutableString.anInt2296 = 0;
        Class68_Sub7.anInt2850 = 0;
        Class50.anInt991 = 0;
        Class49.anInt976 = 0;
        ItemDefinition.anInt359 = 0;
        GroundData.anInt671 = 0;
        Class68_Sub20_Sub3.anInt4200 = 0;
        MutableString.anInt2284 = 0;
        Class68_Sub28_Sub1.anInt4462 = 0;
        Class122.anInt2116 = 0;
        Class68_Sub28_Sub1.anInt4470 = 0;
        Class15.anInt246 = 0;
        Class14.anInt232 = 0;
        Class71_Sub1.anInt3255 = 0;
        Class68_Sub3.anInt2804 = 0;
        Stream.anInt2961 = 0;
        Class68_Sub13_Sub18.anInt3732 = 0;
        NPC.anInt3392 = 0;
        Class68_Sub13_Sub28.anInt3923 = 0;
        Stream.anInt2979 = 0;
        RandomNumberGenerator.anInt1492 = 0;
        Object2.anInt1357 = 0;
        Class68_Sub13_Sub4.anInt3506 = 0;
        Class68_Sub13_Sub15.anInt3685 = 0;
        Class106.anInt1808 = 0;
        anInt438 = 0;
        NodeSubList.anInt2228 = 0;
        MRUNodes.anInt1729 = 0;
        Class68_Sub28_Sub2.anInt4533 = 0;
        Stream.anInt2964 = 0;
        Class68_Sub20_Sub8.anInt4273 = 0;
        Class60.anInt1114 = 0;
        GameApplet.anInt10 = 0;
        Class68_Sub13_Sub39.anInt4110 = 0;
        Class68_Sub20_Sub2.anInt4187 = 0;
        Class68_Sub20_Sub3.anInt4202 = 0;
        Stream.anInt2984 = 0;
        Class68_Sub13_Sub27.anInt3911 = 0;
        Class70.anInt1268 = 0;
        Stream.anInt2959 = 0;
        Class107.anInt1818 = 0;
        Class68_Sub13_Sub27.anInt3897 = 0;
        Class68_Sub28_Sub1.anInt4492 = 0;
        Class112.anInt1879 = 0;
        NodeList.anInt255 = 0;
        PlayerDefinition.anInt2199 = 0;
        Class68_Sub13.anInt2934 = 0;
        Class68_Sub13_Sub38.anInt4080 = 0;
        anInt455 = 0;
        Class68_Sub13_Sub7.anInt3552 = 0;
        Animable.anInt58 = 0;
        Class34.anInt591 = 0;
        GroundData.anInt683 = 0;
        MutableString.anInt2302 = 0;
        Class68_Sub13_Sub5.anInt3515 = 0;
        Class60.anInt1116 = 0;
        Class50_Sub2.anInt2735 = 0;
        Class75_Sub1.anInt3304 = 0;
        Stream.anInt2995 = 0;
        NodeCache.anInt1913 = 0;
        Class11.anInt189 = 0;
        Class112.anInt1884 = 0;
        Stream.anInt2988 = 0;
        GameException.anInt2236 = 0;
        Class72_Sub1.anInt3272 = 0;
        Class75_Sub1_Sub1.anInt4578 = 0;
        Stream.anInt2999 = 0;
        Class71_Sub1.anInt3256 = 0;
        Animation.anInt2043 = 0;
        Class95.anInt1689 = 0;
        Class68_Sub13_Sub13.anInt3655 = 0;
        Node.anInt1220 = 0;
        anInt431 = 0;
        Class13_Sub4.anInt2691 = 0;
        Stream.anInt2990 = 0;
        Class68_Sub28_Sub1.anInt4474 = 0;
        Class68_Sub13_Sub18.anInt3728 = 0;
        Class78.anInt1395 = 0;
        Node.anInt1226 = 0;
        Class68_Sub9.anInt2898 = 0;
        Class13_Sub1.anInt2622 = 0;
        Class68_Sub13_Sub30.anInt3948 = 0;
        Class112.anInt1898 = 0;
        Class68_Sub20_Sub11.anInt4338 = 0;
        Class68_Sub13_Sub6.anInt3527 = 0;
        Class68_Sub28_Sub1.anInt4494 = 0;
        Mouse.anInt1575 = 0;
        Class72_Sub1.anInt3269 = 0;
        CipheredByteVector.anInt4113 = 0;
        Class68_Sub13_Sub35.anInt4022 = 0;
        Class68_Sub28_Sub2.anInt4537 = 0;
        Stream.anInt2976 = 0;
        Class20.anInt398 = 0;
        Class68_Sub13_Sub7.anInt3556 = 0;
        MutableString.anInt2276 = 0;
        GroundData.anInt668 = 0;
        Class68_Sub20_Sub6.anInt4252 = 0;
        GameSocket.anInt1136 = 0;
        Class91.anInt1641 = 0;
        client.anInt2376 = 0;
        Player.anInt3419 = 0;
        Class35.anInt617 = 0;
        client.anInt2385 = 0;
        Class75_Sub1_Sub1.anInt4586 = 0;
        Class68_Sub20_Sub8.anInt4278 = 0;
        NodeList.anInt263 = 0;
        Class68_Sub13_Sub22.anInt3817 = 0;
        NPC.anInt3400 = 0;
        Animation.anInt2048 = 0;
        Class68_Sub16.anInt3027 = 0;
        Class68_Sub13_Sub36.anInt4048 = 0;
        Class68_Sub28_Sub1.anInt4510 = 0;
        anInt471 = 0;
        Player.anInt3407 = 0;
        ItemDefinition.anInt351 = 0;
        Class75_Sub1_Sub1.anInt4580 = 0;
        Class124.anInt2136 = 0;
        Class92.anInt1655 = 0;
        Class20.anInt410 = 0;
        ItemDefinition.anInt392 = 0;
        MutableString.anInt2304 = 0;
        Class68_Sub28_Sub2.anInt4556 = 0;
        Class35.anInt614 = 0;
        Class35.anInt618 = 0;
        Class68_Sub20_Sub2.anInt4185 = 0;
        Class68_Sub20_Sub17.anInt4435 = 0;
        Stream.anInt2957 = 0;
        NPCDefinition.anInt1413 = 0;
        Stream.anInt2951 = 0;
        Class68_Sub13.anInt2931 = 0;
        Class68_Sub20_Sub12.anInt4345 = 0;
        Class13_Sub3.anInt2668 = 0;
        Class68_Sub20_Sub11.anInt4330 = 0;
        ObjectDefinition.anInt1961 = 0;
        Class21_Sub1.anInt2716 = 0;
        Class1_Sub5.anInt2509 = 0;
        MutableString.anInt2315 = 0;
        Class72_Sub1.anInt3267 = 0;
        Class68_Sub24.anInt3163 = 0;
        Class121.anInt2107 = 0;
        Class35.anInt603 = 0;
        Mouse.anInt1580 = 0;
        Class13_Sub3.anInt2661 = 0;
        PlayerDefinition.anInt2196 = 0;
        GameApplet.anInt19 = 0;
        Class75_Sub1.anInt3298 = 0;
        Class59.anInt1100 = 0;
        Player.anInt3406 = 0;
        Class72.anInt1304 = 0;
        Class13_Sub3.anInt2675 = 0;
        Class68_Sub20_Sub12.anInt4351 = 0;
        Class68_Sub13_Sub6.anInt3533 = 0;
        Class75.anInt1339 = 0;
        NPCDefinition.anInt1409 = 0;
        Node.anInt1224 = 0;
        anInt446 = 0;
        Class68_Sub13_Sub17.anInt3716 = 0;
        Class68_Sub20_Sub17.anInt4436 = 0;
        CachedItem.anInt4448 = 0;
        Class21_Sub1.anInt2718 = 0;
        ItemDefinition.anInt354 = 0;
        Class13_Sub1.anInt2640 = 0;
        Class52.anInt1010 = 0;
        Class68_Sub13_Sub31.anInt3967 = 0;
        Class68_Sub13_Sub34.anInt4011 = 0;
        Class94.anInt1677 = 0;
        Ground.anInt2764 = 0;
        Class54.anInt1035 = 0;
        Class68_Sub13_Sub35.anInt4019 = 0;
        Class68_Sub20_Sub8.anInt4283 = 0;
        Class89.anInt1628 = 0;
        Class68_Sub20_Sub11.anInt4323 = 0;
        Class67.anInt1209 = 0;
        Class68_Sub20_Sub6.anInt4253 = 0;
        Class118.anInt2075 = 0;
        Class68_Sub13_Sub27.anInt3912 = 0;
        Class68_Sub20_Sub8.anInt4288 = 0;
        Class68_Sub13_Sub6.anInt3542 = 0;
        Class68_Sub13_Sub30.anInt3951 = 0;
        NodeSub.anInt3086 = 0;
        Class1_Sub1.anInt2425 = 0;
        NodeCache.anInt1910 = 0;
        Class68_Sub20_Sub16.anInt4417 = 0;
        Class29.anInt534 = 0;
        Class68_Sub13_Sub18.anInt3731 = 0;
        Object4.anInt1079 = 0;
        Class28.anInt530 = 0;
        Mouse.anInt1585 = 0;
        MutableString.anInt2311 = 0;
        Character.anInt2569 = 0;
        if (i == 10938)
        {
            Class68_Sub13_Sub33.anInt3994 = 0;
            ObjectDefinition.anInt1976 = 0;
            Class68_Sub13_Sub38.anInt4090 = 0;
            Class68_Sub13_Sub38.anInt4087 = 0;
            Class89.anInt1625 = 0;
            Animation.anInt2068 = 0;
            Class56.anInt1063 = 0;
            Class35.anInt610 = 0;
            Class91.anInt1632 = 0;
            Class68_Sub20_Sub11.anInt4332 = 0;
            MutableString.anInt2274 = 0;
            Class97.anInt1711 = 0;
            Class89.anInt1622 = 0;
            Class66.anInt1204 = 0;
            ObjectDefinition.anInt2031 = 0;
            Class68_Sub13_Sub25.anInt3865 = 0;
            Class14.anInt237 = 0;
            NodeSubList.anInt2220 = 0;
            NodeCache.anInt1924 = 0;
            Class68_Sub13_Sub1.anInt3453 = 0;
            Class107.anInt1821 = 0;
            Class68_Sub13_Sub8.anInt3560 = 0;
            Class49.anInt965 = 0;
            Class7.anInt120 = 0;
            Class68_Sub13_Sub34.anInt4004 = 0;
            Class68_Sub5.anInt2836 = 0;
            Class68_Sub27.anInt3212 = 0;
            Class68_Sub20_Sub9.anInt4294 = 0;
            Stream.anInt2972 = 0;
            client.anInt2373 = 0;
            Stream.anInt3000 = 0;
            Widget.anInt912 = 0;
            Class68_Sub13.anInt2921 = 0;
            Class68_Sub16.anInt3024 = 0;
            Mouse.anInt1579 = 0;
            Class68_Sub13.anInt2920 = 0;
            Class87.anInt1592 = 0;
            Class68_Sub20_Sub9.anInt4299 = 0;
            Object1.anInt1182 = 0;
            Class67.anInt1215 = 0;
            Class68_Sub13_Sub36.anInt4044 = 0;
            Class68_Sub13_Sub31.anInt3958 = 0;
            NodeList.anInt269 = 0;
            GameApplet.anInt13 = 0;
            Class68_Sub3.anInt2812 = 0;
            Class48.anInt947 = 0;
            NodeCache.anInt1916 = 0;
            Class68_Sub13_Sub6.anInt3529 = 0;
            Class68_Sub13_Sub7.anInt3557 = 0;
            Animation.anInt2046 = 0;
            Class3.anInt87 = 0;
            Class68_Sub20_Sub12.anInt4353 = 0;
            Widget.anInt757 = 0;
            Class68_Sub20_Sub16.anInt4413 = 0;
            client.anInt2372 = 0;
            Mouse.anInt1588 = 0;
            Class44.anInt754 = 0;
            Class21_Sub1.anInt2714 = 0;
            Class125.anInt2170 = 0;
            Mouse.anInt1582 = 0;
            Stream.anInt2991 = 0;
            Class68_Sub13_Sub15.anInt3691 = 0;
            Class68_Sub13_Sub10.anInt3589 = 0;
            GroundData.anInt667 = 0;
            NodeList.anInt267 = 0;
            MutableString.anInt2327 = 0;
            NodeList.anInt256 = 0;
            Mouse.anInt1581 = 0;
            Class68_Sub20_Sub12.anInt4348 = 0;
            Class115.anInt1944 = 0;
            Class14.anInt238 = 0;
            Class11.anInt188 = 0;
            Class68_Sub13_Sub11.anInt3614 = 0;
            Item.anInt2443 = 0;
            Class1_Sub7.anInt2610 = 0;
            Class68_Sub13_Sub38.anInt4091 = 0;
            Animable.anInt57 = 0;
            ItemDefinition.anInt328 = 0;
            Class25.anInt515 = 0;
            Class68_Sub13_Sub9.anInt3574 = 0;
            Class1_Sub5.anInt2500 = 0;
            Animable.anInt60 = 0;
            Class68_Sub13_Sub14.anInt3670 = 0;
            Class72_Sub1.anInt3263 = 0;
            GroundData.anInt664 = 0;
            Class68_Sub13_Sub26_Sub1.anInt4612 = 0;
            Class68_Sub13_Sub19.anInt3758 = 0;
            Class95.anInt1691 = 0;
            Class1_Sub5.anInt2503 = 0;
            Class12.anInt202 = 0;
            Class68_Sub28_Sub1.anInt4520 = 0;
            Class68_Sub13_Sub39.anInt4094 = 0;
            Class89.anInt1626 = 0;
            MutableString.anInt2301 = 0;
            Class53.anInt1024 = 0;
            Class68_Sub17.anInt3038 = 0;
            Class4.anInt97 = 0;
            Class68_Sub20_Sub16.anInt4429 = 0;
            Class68_Sub28_Sub1.anInt4509 = 0;
            Class4.anInt92 = 0;
            Class71.anInt1291 = 0;
            GameSocket.anInt1137 = 0;
            Player.anInt3422 = 0;
            Class87.anInt1591 = 0;
            Class68_Sub13_Sub35.anInt4018 = 0;
            Class68_Sub20_Sub6.anInt4239 = 0;
            Class72_Sub1.anInt3261 = 0;
            Class68_Sub7.anInt2854 = 0;
            Class88.anInt1609 = 0;
            Class68_Sub20_Sub10.anInt4314 = 0;
            Class89.anInt1630 = 0;
            MutableString.anInt2306 = 0;
            Player.anInt3439 = 0;
            Class13_Sub1.anInt2638 = 0;
            Class68_Sub13_Sub4.anInt3510 = 0;
            Class68_Sub13_Sub16.anInt3708 = 0;
            NodeList.anInt257 = 0;
            Class68_Sub13_Sub33.anInt3990 = 0;
            Class107.anInt1815 = 0;
            Class68_Sub20_Sub2.anInt4189 = 0;
            CachedItem.anInt4450 = 0;
            Class13_Sub2.anInt2660 = 0;
            Animation.anInt2067 = 0;
            ItemDefinition.anInt333 = 0;
            CipheredByteVector.anInt4132 = 0;
            Class68_Sub19.anInt3073 = 0;
            Class68_Sub28_Sub1.anInt4519 = 0;
            CipheredByteVector.anInt4116 = 0;
            Class91.anInt1645 = 0;
            Class68_Sub20_Sub10.anInt4304 = 0;
            NPC.anInt3395 = 0;
            Class68_Sub20_Sub11.anInt4341 = 0;
            Class68_Sub13_Sub2.anInt3459 = 0;
            Class106.anInt1807 = 0;
            Class68_Sub13_Sub16.anInt3703 = 0;
            Class68_Sub13_Sub37.anInt4061 = 0;
            Class68_Sub13_Sub9.anInt3569 = 0;
            Widget.anInt858 = 0;
            Class18.anInt326 = 0;
            GameSocket.anInt1119 = 0;
            Class74.anInt1327 = 0;
            Class124.anInt2153 = 0;
            anInt460 = 0;
            Class111.anInt1875 = 0;
            Class68_Sub9.anInt2901 = 0;
            GameException.anInt2237 = 0;
            Class36.anInt645 = 0;
            Class9.anInt171 = 0;
            Class68_Sub13_Sub11.anInt3609 = 0;
            anInt422 = 0;
            NodeList.anInt253 = 0;
            Class68_Sub28_Sub1.anInt4490 = 0;
            Class68_Sub13.anInt2937 = 0;
            anInt456 = 0;
            Class37.anInt647 = 0;
            Class50_Sub2.anInt2750 = 0;
            GameApplet.getAppletContextCounter = 0;
            Class68_Sub13_Sub3.anInt3479 = 0;
            Class37.anInt648 = 0;
            Class68_Sub20_Sub15.anInt4397 = 0;
            Class68_Sub13_Sub27.anInt3906 = 0;
            Class68_Sub13_Sub19.anInt3751 = 0;
            Class50_Sub2.anInt2740 = 0;
            Class87.anInt1593 = 0;
            Class20.anInt406 = 0;
            anInt432 = 0;
            Class68_Sub13_Sub11.anInt3619 = 0;
            Stream.anInt2971 = 0;
            Class72.anInt1320 = 0;
            GameApplet.anInt23 = 0;
            Class68_Sub13_Sub2.anInt3464 = 0;
            Class1_Sub7.anInt2593 = 0;
            Stream.anInt2966 = 0;
            Class68_Sub7.anInt2853 = 0;
            Class68_Sub13_Sub17.anInt3727 = 0;
            Class68_Sub10.anInt2912 = 0;
            Class50.anInt982 = 0;
            Class33.anInt575 = 0;
            Class68_Sub20_Sub8.anInt4270 = 0;
            Class68_Sub13_Sub10.anInt3596 = 0;
            PlayerDefinition.anInt2190 = 0;
            Character.anInt2589 = 0;
            Class17.anInt282 = 0;
            ScriptParameters.anInt3238 = 0;
            Class21_Sub1.anInt2717 = 0;
            Class68_Sub13_Sub34.anInt4009 = 0;
            Class68_Sub6.anInt2843 = 0;
            Animable.anInt54 = 0;
            Class111.anInt1871 = 0;
            MutableString.anInt2324 = 0;
            Class78.anInt1394 = 0;
            Class75_Sub1_Sub1.anInt4581 = 0;
            Class118.anInt2077 = 0;
            MutableString.anInt2325 = 0;
            Stream.anInt2960 = 0;
            Class68_Sub28_Sub2.anInt4543 = 0;
            anInt452 = 0;
            Class68_Sub13_Sub27.anInt3905 = 0;
            Login.anInt1501 = 0;
            anInt469 = 0;
            NodeSubList.anInt2221 = 0;
            Class15.anInt245 = 0;
            Class68_Sub13_Sub37.anInt4057 = 0;
            Animable.anInt67 = 0;
            Class68_Sub3.anInt2813 = 0;
            Class68_Sub13_Sub21.anInt3792 = 0;
            Class68_Sub13_Sub2.anInt3463 = 0;
            Class17.anInt285 = 0;
            Class44.anInt747 = 0;
            anInt465 = 0;
            Stream.anInt2952 = 0;
            Class68_Sub13_Sub19.anInt3753 = 0;
            Class44.anInt751 = 0;
            Class53.anInt1021 = 0;
            GameException.anInt2239 = 0;
            Class68_Sub13_Sub8.anInt3564 = 0;
            Class1_Sub7.anInt2612 = 0;
            Class68_Sub13_Sub9.anInt3575 = 0;
            Class72_Sub1.anInt3284 = 0;
            Class68_Sub13_Sub31.anInt3969 = 0;
            Class28.anInt525 = 0;
            Class1_Sub1.anInt2393 = 0;
            Class23.anInt500 = 0;
            Class68_Sub20_Sub10.anInt4309 = 0;
            Stream.anInt2977 = 0;
            Class68_Sub13_Sub26.anInt3873 = 0;
            MRUNodes.anInt1723 = 0;
            Class68_Sub13.anInt2932 = 0;
            Class9.anInt174 = 0;
            anInt462 = 0;
            Class8.anInt151 = 0;
            GameApplet.anInt20 = 0;
            Class68_Sub13_Sub10.anInt3586 = 0;
            Class71_Sub1.anInt3252 = 0;
            Class52.anInt994 = 0;
            Class48.anInt950 = 0;
            Class68_Sub4.anInt2827 = 0;
            RandomNumberGenerator.anInt1477 = 0;
            Class127.anInt2212 = 0;
            Class68_Sub28_Sub1.anInt4484 = 0;
            CipheredByteVector.anInt4121 = 0;
            Class101.anInt1741 = 0;
            Stream.anInt2948 = 0;
            Class68_Sub13_Sub13.anInt3651 = 0;
            client.anInt2380 = 0;
            Class68_Sub13_Sub15.anInt3693 = 0;
            Class44.anInt753 = 0;
            Class18.anInt317 = 0;
            Class89.anInt1629 = 0;
            Class68_Sub13_Sub24.anInt3834 = 0;
            Class20.anInt411 = 0;
            Class119.anInt2089 = 0;
            Stream.anInt2983 = 0;
            Class44.anInt748 = 0;
            CipheredByteVector.anInt4115 = 0;
            Class114.anInt1940 = 0;
            Class75_Sub3.anInt3327 = 0;
            Class68_Sub13_Sub39.anInt4097 = 0;
            Class72_Sub1.anInt3285 = 0;
            Class68_Sub13.anInt2939 = 0;
            Class68_Sub20_Sub13.anInt4364 = 0;
            Class1_Sub1.anInt2401 = 0;
            Class58.anInt1091 = 0;
            Class13_Sub1.anInt2624 = 0;
            NodeSubList.anInt2218 = 0;
            NPC.anInt3398 = 0;
            Item.anInt2442 = 0;
            Widget.anInt809 = 0;
            Class68_Sub20_Sub6.anInt4240 = 0;
            Class68_Sub13_Sub15.anInt3695 = 0;
            GameException.anInt2235 = 0;
            Class30.anInt547 = 0;
            Class71.anInt1295 = 0;
            ObjectDefinition.anInt2003 = 0;
            Class72.anInt1301 = 0;
            Object5.anInt1235 = 0;
            Object2.anInt1351 = 0;
            Class43.anInt737 = 0;
            Class68_Sub13_Sub33.anInt3996 = 0;
            Class106.anInt1809 = 0;
            Class14.anInt240 = 0;
            Class13_Sub2.anInt2651 = 0;
            Class68_Sub28_Sub1.anInt4522 = 0;
            NodeList.anInt261 = 0;
            anInt437 = 0;
            NodeList.anInt268 = 0;
            NodeSubList.anInt2214 = 0;
            GameApplet.anInt41 = 0;
            Class75_Sub1.anInt3293 = 0;
            Class124.anInt2137 = 0;
            GameApplet.anInt32 = 0;
            MutableString.anInt2278 = 0;
            Class68_Sub28_Sub1.anInt4465 = 0;
            Class68_Sub20_Sub6.anInt4237 = 0;
            Class68_Sub13_Sub15.anInt3682 = 0;
            anInt470 = 0;
            NPCDefinition.anInt1451 = 0;
            MRUNodes.anInt1730 = 0;
            Stream.anInt2997 = 0;
            RandomNumberGenerator.anInt1485 = 0;
            Class90.anInt2364 = 0;
            Stream.anInt3003 = 0;
            anInt458 = 0;
            GameSocket.anInt1125 = 0;
            anInt473 = 0;
            Class68_Sub13_Sub28.anInt3928 = 0;
            Class68_Sub13_Sub36.anInt4049 = 0;
            Login.anInt1511 = 0;
            Class44.anInt750 = 0;
            ObjectDefinition.anInt1972 = 0;
            Class68_Sub13_Sub7.anInt3549 = 0;
            Class68_Sub13_Sub23.anInt3818 = 0;
            Class68_Sub13_Sub37.anInt4071 = 0;
            PlayerDefinition.anInt2195 = 0;
            Class68_Sub13_Sub14.anInt3667 = 0;
            Class32.anInt568 = 0;
            GameApplet.anInt14 = 0;
            Class68_Sub13_Sub8.anInt3561 = 0;
            GameApplet.anInt39 = 0;
            Class68_Sub13_Sub3.anInt3478 = 0;
            RandomNumberGenerator.anInt1494 = 0;
            GroundData.anInt680 = 0;
            Class102.anInt1752 = 0;
            Class68_Sub13_Sub28.anInt3929 = 0;
            Class68_Sub13.anInt2936 = 0;
            Stream.anInt2994 = 0;
            Class68_Sub13_Sub38.anInt4089 = 0;
            Class68_Sub20_Sub16.anInt4423 = 0;
            Class68_Sub20_Sub9.anInt4298 = 0;
            MutableString.anInt2285 = 0;
            Class68_Sub13_Sub3.anInt3472 = 0;
            Class68_Sub8.anInt2867 = 0;
            MutableString.anInt2313 = 0;
            Class107.anInt1825 = 0;
            MutableString.anInt2316 = 0;
            Class23.anInt494 = 0;
            Class68_Sub13_Sub28.anInt3926 = 0;
            MutableString.anInt2280 = 0;
            Class75_Sub3_Sub1.anInt4594 = 0;
            Class1_Sub7.anInt2602 = 0;
            Class68_Sub20_Sub3.anInt4209 = 0;
            Class68_Sub27.anInt3216 = 0;
            Character.anInt2553 = 0;
            Stream.anInt3006 = 0;
            Class68_Sub13_Sub20.anInt3775 = 0;
            NPCDefinition.anInt1416 = 0;
            Class68_Sub28_Sub1.anInt4464 = 0;
            Class90.anInt2345 = 0;
            Class52.anInt999 = 0;
            Class84.anInt1533 = 0;
            Class68_Sub28_Sub1.anInt4459 = 0;
            Class68_Sub13_Sub15.anInt3694 = 0;
            ScriptParameters.anInt3251 = 0;
            Class68_Sub15.anInt3019 = 0;
            Class1_Sub1.anInt2403 = 0;
            Class95.anInt1681 = 0;
            ObjectDefinition.anInt2016 = 0;
            Animation.anInt2042 = 0;
            Class68_Sub13_Sub32.anInt3986 = 0;
            Class68_Sub20_Sub7.anInt4261 = 0;
            Class11.anInt195 = 0;
            NodeSub.anInt3098 = 0;
            Class121.anInt2103 = 0;
            Class115.anInt1949 = 0;
            Class124.anInt2134 = 0;
            Class68_Sub13_Sub23.anInt3820 = 0;
            Class68_Sub13_Sub31.anInt3963 = 0;
            GameApplet.anInt5 = 0;
            MutableString.anInt2294 = 0;
            client.anInt2377 = 0;
            Class95.anInt1688 = 0;
            Class68_Sub13_Sub12.anInt3635 = 0;
            GameApplet.numPaints = 0;
            Class1_Sub1.anInt2406 = 0;
            Widget.anInt760 = 0;
            Class68_Sub13_Sub32.anInt3982 = 0;
            Class13_Sub4.anInt2682 = 0;
            Class68_Sub13_Sub29.anInt3935 = 0;
            Animation.anInt2062 = 0;
            Class68_Sub20_Sub8.anInt4282 = 0;
            Class68_Sub28_Sub1.anInt4504 = 0;
            Class1_Sub1.anInt2418 = 0;
            Class68_Sub28_Sub1.anInt4508 = 0;
            Class68_Sub13_Sub7.anInt3558 = 0;
            Class72_Sub1.anInt3264 = 0;
            Class68_Sub13_Sub17.anInt3723 = 0;
            ItemDefinition.anInt361 = 0;
            Class68_Sub13_Sub36.anInt4032 = 0;
            NodeCache.anInt1919 = 0;
            Login.anInt1516 = 0;
            Class35.anInt607 = 0;
            Class68_Sub20_Sub13.anInt4363 = 0;
            Widget.anInt895 = 0;
            Stream.anInt2982 = 0;
            Class13_Sub2.anInt2657 = 0;
            Class111.anInt1864 = 0;
            Class109.anInt1843 = 0;
            Class68_Sub13_Sub16.anInt3706 = 0;
            Class1_Sub5.anInt2510 = 0;
            Class97.anInt1717 = 0;
            Class68_Sub13.anInt2929 = 0;
            Class68_Sub13_Sub34.anInt4013 = 0;
            Class35.anInt622 = 0;
            Class68_Sub20_Sub6.anInt4233 = 0;
            Class68_Sub13_Sub33.anInt3995 = 0;
            Class68_Sub13_Sub32.anInt3988 = 0;
            Stream.anInt2965 = 0;
            Class68_Sub13_Sub27.anInt3889 = 0;
            Class68_Sub13_Sub13.anInt3662 = 0;
            Class68_Sub13_Sub1.anInt3456 = 0;
            Class68_Sub13_Sub16.anInt3709 = 0;
            Class68_Sub13_Sub31.anInt3964 = 0;
            GameSocket.anInt1135 = 0;
            Class30.anInt545 = 0;
            Object4.anInt1070 = 0;
            Class68_Sub13_Sub33.anInt3997 = 0;
            ItemDefinition.anInt367 = 0;
            Class68_Sub13_Sub15.anInt3687 = 0;
            Class68_Sub13_Sub19.anInt3755 = 0;
            Object5.anInt1247 = 0;
            Class75_Sub2.anInt3318 = 0;
            Class85.anInt1564 = 0;
            ObjectDefinition.anInt2022 = 0;
            NodeList.anInt265 = 0;
            client.anInt2386 = 0;
            anInt434 = 0;
            NodeSub.anInt3099 = 0;
            MutableString.anInt2288 = 0;
            Class68_Sub13_Sub17.anInt3717 = 0;
            Class68_Sub13_Sub13.anInt3657 = 0;
            Stream.anInt2987 = 0;
            Class72_Sub1.anInt3265 = 0;
            Widget.anInt824 = 0;
            Class68_Sub20_Sub11.anInt4339 = 0;
            Class21_Sub1.anInt2720 = 0;
            CipheredByteVector.anInt4117 = 0;
            Class72_Sub1.anInt3266 = 0;
            ObjectDefinition.anInt2030 = 0;
            Class68_Sub13_Sub27.anInt3902 = 0;
            Class68_Sub13_Sub12.anInt3636 = 0;
            Class68_Sub20_Sub6.anInt4243 = 0;
            anInt442 = 0;
            Class51.anInt2252 = 0;
            Class68_Sub13_Sub18.anInt3735 = 0;
            Class35.anInt608 = 0;
            Class90.anInt2331 = 0;
            Class75_Sub1_Sub1.anInt4584 = 0;
            CachedItem.anInt4449 = 0;
            MutableString.anInt2309 = 0;
            Class90.anInt2335 = 0;
            Class125.anInt2181 = 0;
            Class1_Sub1.anInt2417 = 0;
            Class111.anInt1868 = 0;
            ScriptParameters.anInt3249 = 0;
            NPCDefinition.anInt1454 = 0;
            MutableString.anInt2289 = 0;
            Class44.anInt745 = 0;
            GameApplet.anInt8 = 0;
            Class68_Sub13_Sub19.anInt3746 = 0;
            Class68_Sub13_Sub20.anInt3769 = 0;
            Class68_Sub28_Sub2.anInt4542 = 0;
            Login.anInt1507 = 0;
            Class68_Sub20_Sub7.anInt4260 = 0;
            ItemDefinition.anInt393 = 0;
            Class68_Sub13_Sub11.anInt3617 = 0;
            Class13_Sub2.anInt2646 = 0;
            Class68_Sub13_Sub29.anInt3940 = 0;
            Class71.anInt1299 = 0;
            Class70.anInt1278 = 0;
            GroundData.anInt682 = 0;
            Class68_Sub13_Sub3.anInt3468 = 0;
            Class50.anInt987 = 0;
            Class1_Sub5.anInt2506 = 0;
            Class125.anInt2179 = 0;
            Class68_Sub13_Sub26_Sub1.anInt4606 = 0;
            MutableString.anInt2317 = 0;
            Player.anInt3425 = 0;
            Class68_Sub15.anInt3013 = 0;
            Class68_Sub7.anInt2861 = 0;
            Class8.anInt155 = 0;
            Class124.anInt2157 = 0;
            Class68_Sub16.anInt3025 = 0;
            Class50.anInt978 = 0;
            Class48.anInt961 = 0;
            NodeSub.anInt3084 = 0;
            Class68_Sub13_Sub29.anInt3933 = 0;
            Class66.anInt1201 = 0;
            Object2.anInt1353 = 0;
            Class68_Sub13_Sub3.anInt3475 = 0;
            Class53.anInt1023 = 0;
            Class74.anInt1329 = 0;
            Class105.anInt1799 = 0;
            client.anInt2371 = 0;
            MutableString.anInt2312 = 0;
            Class68_Sub13_Sub18.anInt3738 = 0;
            Stream.anInt3002 = 0;
            Login.anInt1503 = 0;
            Class68_Sub10.anInt2906 = 0;
            Class68_Sub24.anInt3159 = 0;
            Class68_Sub13_Sub11.anInt3601 = 0;
            GameApplet.anInt4 = 0;
            Character.anInt2530 = 0;
            Class25.anInt512 = 0;
            Class13.anInt217 = 0;
            Widget.anInt829 = 0;
            Class84.anInt1544 = 0;
            Class68_Sub13_Sub39.anInt4096 = 0;
            Class88.anInt1601 = 0;
            Class68_Sub13_Sub25.anInt3867 = 0;
            Class68_Sub13_Sub7.anInt3547 = 0;
            Class48.anInt946 = 0;
            Class75_Sub3.anInt3321 = 0;
            Class92.anInt1656 = 0;
            Class68_Sub13_Sub31.anInt3962 = 0;
            Keyboard.anInt2124 = 0;
            Class85.anInt1557 = 0;
            Class68_Sub20_Sub8.anInt4286 = 0;
            Object4.anInt1082 = 0;
            Class9.anInt167 = 0;
            Class94.anInt1675 = 0;
            Class68_Sub13_Sub32.anInt3981 = 0;
            Class13_Sub4.anInt2679 = 0;
            Class54.anInt1034 = 0;
            Class56.anInt1060 = 0;
            Class68_Sub20_Sub2.anInt4184 = 0;
            MutableString.anInt2320 = 0;
            Class112.anInt1887 = 0;
            Class68_Sub13_Sub37.anInt4052 = 0;
            Class68_Sub13_Sub35.anInt4021 = 0;
            Class124.anInt2146 = 0;
            Class68_Sub13_Sub34.anInt4008 = 0;
            Class97.anInt1710 = 0;
            ObjectDefinition.anInt1993 = 0;
            GroundData.anInt663 = 0;
            Class68_Sub6.anInt2844 = 0;
            Animation.anInt2064 = 0;
            Class68_Sub13_Sub24.anInt3844 = 0;
            Mouse.anInt1567 = 0;
            Class68_Sub13_Sub5.anInt3514 = 0;
            Animation.anInt2051 = 0;
            Class68_Sub28_Sub2.anInt4541 = 0;
            Class68_Sub13_Sub15.anInt3692 = 0;
            Class68_Sub13_Sub6.anInt3525 = 0;
            Class68_Sub13_Sub4.anInt3495 = 0;
            Class68_Sub20_Sub4.anInt4218 = 0;
            Class68_Sub20_Sub13_Sub2.anInt4627 = 0;
            Class60.anInt1117 = 0;
            Class121.anInt2108 = 0;
            Class68_Sub13_Sub19.anInt3760 = 0;
            Login.anInt1499 = 0;
            Class68_Sub13_Sub3.anInt3477 = 0;
            Class68_Sub26.anInt3205 = 0;
            Class68_Sub20_Sub15.anInt4403 = 0;
            Class67.anInt1212 = 0;
            Class68_Sub26.anInt3207 = 0;
            Widget.anInt805 = 0;
            Class68_Sub4.anInt2820 = 0;
            Class13_Sub3.anInt2669 = 0;
            Class115.anInt1947 = 0;
            Class127.anInt2205 = 0;
            Class68_Sub13_Sub4.anInt3501 = 0;
            Class96.anInt1695 = 0;
            MutableString.anInt2268 = 0;
            MutableString.anInt2322 = 0;
            Object4.anInt1084 = 0;
            Class124.anInt2139 = 0;
            Class66.anInt1202 = 0;
            Class85.anInt1563 = 0;
            Class68_Sub13_Sub21.anInt3796 = 0;
            Class13_Sub3.anInt2672 = 0;
            Class75_Sub1_Sub1.anInt4585 = 0;
            Class102.anInt1749 = 0;
            Class35.anInt609 = 0;
            Class94.anInt1676 = 0;
            Class35.anInt619 = 0;
            Class68_Sub3.anInt2803 = 0;
            Character.anInt2555 = 0;
            CipheredByteVector.anInt4131 = 0;
            Class68_Sub24.anInt3158 = 0;
            PlayerDefinition.anInt2189 = 0;
            Class20.anInt419 = 0;
            Class28.anInt524 = 0;
            MutableString.anInt2326 = 0;
            Class88.anInt1597 = 0;
            Class68_Sub20_Sub15.anInt4406 = 0;
            Class68_Sub8.anInt2882 = 0;
            Class18.anInt301 = 0;
            Class68_Sub28_Sub1.anInt4506 = 0;
            Class53.anInt1016 = 0;
            Class3.anInt77 = 0;
            Class68_Sub13.anInt2928 = 0;
            Class56.anInt1064 = 0;
            Class68_Sub13_Sub21.anInt3787 = 0;
            NodeList.anInt260 = 0;
            Class68_Sub13_Sub14.anInt3674 = 0;
            MutableString.anInt2269 = 0;
            Class72.anInt1317 = 0;
            Class68_Sub20_Sub9.anInt4300 = 0;
            Object1.anInt1189 = 0;
            Class68_Sub13_Sub26.anInt3876 = 0;
            Class68_Sub13_Sub6.anInt3537 = 0;
            Class68_Sub13_Sub34.anInt4007 = 0;
            MutableString.anInt2314 = 0;
            Stream.anInt2989 = 0;
            Class71.anInt1297 = 0;
            NodeCache.anInt1917 = 0;
            Class75_Sub3_Sub1.anInt4596 = 0;
            Widget.anInt758 = 0;
            Login.anInt1505 = 0;
            Class125.anInt2174 = 0;
            Class68_Sub13_Sub9.anInt3578 = 0;
            Class21_Sub1.anInt2709 = 0;
            Stream.anInt2969 = 0;
            Node.anInt1221 = 0;
            Class68_Sub20_Sub11.anInt4342 = 0;
            Class75_Sub3.anInt3325 = 0;
            NodeList.anInt262 = 0;
            Class68_Sub28_Sub1.anInt4458 = 0;
            Class68_Sub25.anInt3175 = 0;
            Class1_Sub5.anInt2496 = 0;
            Class1_Sub7.anInt2595 = 0;
            MutableString.anInt2293 = 0;
            Class78.anInt1398 = 0;
            Class68_Sub13_Sub39.anInt4095 = 0;
            anInt463 = 0;
            Class68_Sub20_Sub11.anInt4343 = 0;
            ItemDefinition.anInt335 = 0;
            Class68_Sub28_Sub1.anInt4476 = 0;
            Class13_Sub1.anInt2634 = 0;
            Class95.anInt1684 = 0;
            ObjectDefinition.anInt1995 = 0;
            Class68_Sub13_Sub22.anInt3811 = 0;
            anInt467 = 0;
            Keyboard.anInt2126 = 0;
            Class68_Sub20_Sub8.anInt4274 = 0;
            Class68_Sub20_Sub10.anInt4318 = 0;
            Class124.anInt2160 = 0;
            Class88.anInt1608 = 0;
            Class68_Sub28_Sub1.anInt4472 = 0;
            Class68_Sub13_Sub24.anInt3838 = 0;
            Class68_Sub28_Sub1.anInt4477 = 0;
            Class68_Sub13_Sub18.anInt3737 = 0;
            Class72.anInt1303 = 0;
            Class112.anInt1882 = 0;
            Class68_Sub20_Sub9.anInt4303 = 0;
            Class75_Sub1_Sub1.anInt4582 = 0;
            NodeCache.anInt1915 = 0;
            MutableString.anInt2277 = 0;
            Class68_Sub20_Sub16.anInt4428 = 0;
            MutableString.hashCodeCounter = 0;
            Class68_Sub28_Sub2.anInt4540 = 0;
            Class68_Sub7.anInt2858 = 0;
            Class68_Sub15.anInt3018 = 0;
            GameApplet.anInt25 = 0;
            Class87.anInt1594 = 0;
            Character.anInt2519 = 0;
            Class68_Sub13_Sub21.anInt3802 = 0;
            Class68_Sub13_Sub23.anInt3825 = 0;
            Player.anInt3438 = 0;
            NodeCache.anInt1918 = 0;
            Widget.anInt834 = 0;
            Class68_Sub27.anInt3225 = 0;
            Class68_Sub13_Sub26.anInt3887 = 0;
            Class120.anInt2099 = 0;
            Class119.anInt2092 = 0;
            GroundData.anInt669 = 0;
            Class13_Sub3.anInt2667 = 0;
            Class68_Sub13_Sub11.anInt3612 = 0;
            Class48.anInt957 = 0;
            Class68_Sub13_Sub12.anInt3639 = 0;
            Stream.anInt2953 = 0;
            ObjectDefinition.anInt2014 = 0;
            Class111.anInt1873 = 0;
            Class68_Sub13_Sub26.anInt3886 = 0;
            Class23.anInt491 = 0;
            Class68_Sub20_Sub7.anInt4256 = 0;
            Class68_Sub19.anInt3080 = 0;
            Class13_Sub1.anInt2633 = 0;
            Class74.anInt1328 = 0;
            MutableString.anInt2308 = 0;
            Character.anInt2529 = 0;
            Class114.anInt1931 = 0;
            Class68_Sub15.anInt3020 = 0;
            Stream.anInt2985 = 0;
            MutableString.anInt2286 = 0;
            Class104.anInt1788 = 0;
            Stream.anInt2968 = 0;
            Class68_Sub28_Sub1.anInt4488 = 0;
            Class13_Sub4.anInt2686 = 0;
            Class32.anInt561 = 0;
            GameException.anInt2244 = 0;
            ScriptParameters.anInt3247 = 0;
            Class68_Sub13_Sub36.anInt4047 = 0;
            Class11.anInt190 = 0;
            GameCanvas.anInt49 = 0;
            Class115.anInt1941 = 0;
            CipheredByteVector.anInt4133 = 0;
            Class104.anInt1791 = 0;
            Class68_Sub13_Sub14.anInt3676 = 0;
            ObjectDefinition.anInt2026 = 0;
            Class68_Sub13_Sub38.anInt4083 = 0;
            Class68_Sub13_Sub16.anInt3700 = 0;
            Class114.anInt1935 = 0;
            Class78.anInt1392 = 0;
            Class44.anInt744 = 0;
            Stream.anInt3005 = 0;
            Class68_Sub13_Sub17.anInt3726 = 0;
            Class68_Sub20_Sub13_Sub2.anInt4621 = 0;
            MutableString.anInt2300 = 0;
            Class68_Sub20_Sub8.anInt4290 = 0;
            Class89.anInt1627 = 0;
            client.anInt2368 = 0;
            Class33.anInt578 = 0;
            Class11.anInt192 = 0;
            Class68_Sub20_Sub3.anInt4214 = 0;
            ItemDefinition.anInt373 = 0;
            PlayerDefinition.anInt2191 = 0;
            Class127.anInt2204 = 0;
            Class51.anInt2256 = 0;
            Class35.anInt612 = 0;
            Class102.anInt1760 = 0;
            Class43.anInt740 = 0;
            Class68_Sub26.anInt3192 = 0;
            Class68_Sub13_Sub20.anInt3776 = 0;
            anInt464 = 0;
            Class111.anInt1870 = 0;
            MutableString.anInt2272 = 0;
            Class44.anInt749 = 0;
            Class21_Sub1.anInt2711 = 0;
            Class72_Sub1.anInt3282 = 0;
            Mouse.anInt1583 = 0;
            Class68_Sub20_Sub13.anInt4358 = 0;
            GameException.anInt2240 = 0;
            Class68_Sub6.anInt2839 = 0;
            Class105.anInt1798 = 0;
            Class68_Sub13_Sub20.anInt3764 = 0;
            Class13_Sub1.anInt2625 = 0;
            Class68_Sub13_Sub31.anInt3976 = 0;
            Class112.anInt1892 = 0;
            Class119.anInt2087 = 0;
            ItemDefinition.anInt379 = 0;
            Class90.anInt2332 = 0;
            Class68_Sub18.anInt3043 = 0;
            MutableString.anInt2297 = 0;
            Class68_Sub20_Sub7.anInt4267 = 0;
            GameCanvas.anInt46 = 0;
            Class68_Sub13_Sub12.anInt3630 = 0;
            Class121.anInt2105 = 0;
            Class13_Sub2.anInt2656 = 0;
            Class68_Sub13_Sub33.anInt3992 = 0;
            Class68_Sub13_Sub20.anInt3765 = 0;
            Class28.anInt527 = 0;
            MutableString.anInt2318 = 0;
            Class68_Sub13_Sub13.anInt3653 = 0;
            Class68_Sub13_Sub34.anInt4017 = 0;
            Class68_Sub13_Sub11.anInt3606 = 0;
            MutableString.anInt2265 = 0;
            Class68_Sub22.anInt3145 = 0;
            Class49.anInt971 = 0;
            Class91.anInt1635 = 0;
            Class33.anInt580 = 0;
            Class68_Sub13_Sub14.anInt3677 = 0;
            NodeSub.anInt3085 = 0;
            NPCDefinition.anInt1470 = 0;
            Class68_Sub27.anInt3220 = 0;
            Class14.anInt234 = 0;
            Keyboard.anInt2122 = 0;
            Class68_Sub13_Sub24.anInt3847 = 0;
            GameCanvas.anInt50 = 0;
            GroundData.anInt679 = 0;
            Class68_Sub20_Sub17.anInt4438 = 0;
            Class68_Sub28_Sub1.anInt4499 = 0;
            Class83.anInt1529 = 0;
            Class68_Sub13_Sub16.anInt3705 = 0;
            NodeSubList.anInt2225 = 0;
            Class68_Sub13_Sub25.anInt3864 = 0;
            Class68_Sub13_Sub37.anInt4056 = 0;
            Class59.anInt1105 = 0;
            Class68_Sub20_Sub8.anInt4275 = 0;
            GameSocket.anInt1133 = 0;
            Class68_Sub13_Sub2.anInt3458 = 0;
            Class68_Sub13_Sub7.anInt3555 = 0;
            GameSocket.anInt1129 = 0;
            Character.anInt2533 = 0;
            Class68_Sub10.anInt2915 = 0;
            NodeCache.anInt1908 = 0;
            Class68_Sub20_Sub2.anInt4193 = 0;
            Class35.anInt613 = 0;
            Class67.anInt1216 = 0;
            Class68_Sub13_Sub10.anInt3587 = 0;
            Stream.anInt3001 = 0;
            CipheredByteVector.anInt4125 = 0;
            Class68_Sub20_Sub13_Sub2.anInt4630 = 0;
            Class51.anInt2255 = 0;
            Class124.anInt2135 = 0;
            Class68_Sub13_Sub28.anInt3927 = 0;
            GroundData.anInt670 = 0;
            Widget.anInt804 = 0;
            GameApplet.anInt26 = 0;
            CipheredByteVector.anInt4130 = 0;
            NodeCache.anInt1906 = 0;
            NodeList.anInt258 = 0;
            GameSocket.anInt1120 = 0;
            Class68_Sub13_Sub30.anInt3952 = 0;
            anInt449 = 0;
            Stream.anInt2981 = 0;
            Class68_Sub13_Sub3.anInt3480 = 0;
            Class68_Sub20_Sub3.anInt4213 = 0;
            Class68_Sub28_Sub1.anInt4479 = 0;
            CipheredByteVector.anInt4126 = 0;
            Class68_Sub20_Sub6.anInt4235 = 0;
            Class90.anInt2334 = 0;
            Class58.anInt1092 = 0;
            Class70.anInt1275 = 0;
            Class1_Sub7.anInt2596 = 0;
            Object5.anInt1258 = 0;
            Class68_Sub13_Sub38.anInt4085 = 0;
            GameCanvas.anInt47 = 0;
            Class68_Sub13_Sub34.anInt4012 = 0;
            Class43.anInt735 = 0;
            Class68_Sub13_Sub37.anInt4070 = 0;
            Class115.anInt1958 = 0;
            Login.anInt1502 = 0;
            NPC.anInt3396 = 0;
            RandomNumberGenerator.anInt1487 = 0;
            Class68_Sub20_Sub3.anInt4211 = 0;
            Class68_Sub20_Sub10.anInt4312 = 0;
            MutableString.anInt2303 = 0;
            Class103.anInt1762 = 0;
            Class68_Sub6.anInt2842 = 0;
            Mouse.anInt1572 = 0;
            NPCDefinition.anInt1474 = 0;
            PlayerDefinition.anInt2201 = 0;
            Class68_Sub3.anInt2808 = 0;
            Class68_Sub15.anInt3021 = 0;
            Class85.anInt1562 = 0;
            Class115.anInt1951 = 0;
            Class70.anInt1265 = 0;
            Class75_Sub3_Sub1.anInt4595 = 0;
            Class68_Sub13_Sub33.anInt3991 = 0;
            Class68_Sub13_Sub4.anInt3498 = 0;
            Class68_Sub18.anInt3057 = 0;
            GroundData.anInt685 = 0;
            Class49.anInt973 = 0;
            Class88.anInt1611 = 0;
            Class68_Sub13_Sub39.anInt4092 = 0;
            anInt440 = 0;
            Class90.anInt2354 = 0;
            Class68_Sub20_Sub3.anInt4205 = 0;
            GameApplet.anInt1 = 0;
            Class68_Sub8.anInt2870 = 0;
            Animation.anInt2034 = 0;
            MutableString.anInt2298 = 0;
            Class118.anInt2081 = 0;
            Class29.anInt536 = 0;
            Class68_Sub20_Sub9.anInt4301 = 0;
            Class3.anInt74 = 0;
            Class68_Sub20_Sub6.anInt4250 = 0;
            Class68_Sub28_Sub1.anInt4502 = 0;
            anInt445 = 0;
            Class68_Sub4.anInt2822 = 0;
            Class68_Sub28_Sub1.anInt4516 = 0;
            Class68_Sub13_Sub9.anInt3585 = 0;
            client.anInt2369 = 0;
            Class78.anInt1397 = 0;
            Mouse.anInt1586 = 0;
            Class35.anInt611 = 0;
            Class68_Sub13_Sub11.anInt3603 = 0;
            Class68_Sub28_Sub2.anInt4534 = 0;
            GroundData.anInt661 = 0;
            GroundData.anInt660 = 0;
            PlayerDefinition.anInt2183 = 0;
            Class12.anInt210 = 0;
            MutableString.anInt2323 = 0;
            Class96.anInt1700 = 0;
            Class92.anInt1653 = 0;
            Class105.anInt1793 = 0;
            Login.anInt1510 = 0;
            Class107.anInt1814 = 0;
            Class13_Sub1.anInt2632 = 0;
            Stream.anInt2992 = 0;
            Class103.anInt1772 = 0;
            anInt451 = 0;
            Class90.anInt2330 = 0;
            MutableString.anInt2287 = 0;
            Class68_Sub4.anInt2826 = 0;
            Class51.anInt2250 = 0;
            Class14.anInt226 = 0;
            anInt436 = 0;
            Class35.anInt615 = 0;
            GroundData.anInt675 = 0;
            Class68_Sub13_Sub28.anInt3930 = 0;
            GameSocket.anInt1122 = 0;
            ItemDefinition.anInt364 = 0;
            Class90.anInt2358 = 0;
            GameApplet.anInt34 = 0;
            Stream.anInt2975 = 0;
            CipheredByteVector.anInt4114 = 0;
            Class68_Sub28_Sub1.anInt4517 = 0;
            Class36.anInt641 = 0;
            Class68_Sub20_Sub13.anInt4359 = 0;
            Class68_Sub13_Sub1.anInt3451 = 0;
            GameApplet.anInt40 = 0;
            Class122.anInt2119 = 0;
            Stream.anInt2998 = 0;
            Class68_Sub13_Sub19.anInt3752 = 0;
            Class127.anInt2206 = 0;
            Class68_Sub13_Sub24.anInt3842 = 0;
            Animable.anInt62 = 0;
            Class68_Sub28_Sub1.anInt4483 = 0;
            Class68_Sub13_Sub8.anInt3565 = 0;
            Class68_Sub13_Sub39.anInt4109 = 0;
            NodeCache.anInt1912 = 0;
            Character.anInt2591 = 0;
            Class75_Sub3_Sub1.anInt4602 = 0;
            Class50_Sub2.anInt2734 = 0;
            Class68_Sub13_Sub39.anInt4093 = 0;
            GameApplet.anInt38 = 0;
            anInt461 = 0;
            Class104.anInt1780 = 0;
            Class88.anInt1596 = 0;
            Stream.anInt2978 = 0;
            Class9.anInt176 = 0;
            MRUNodes.anInt1731 = 0;
            Class68_Sub13_Sub30.anInt3956 = 0;
            Class4.anInt91 = 0;
            Stream.anInt2973 = 0;
            Class32.anInt572 = 0;
            Class68_Sub13_Sub36.anInt4036 = 0;
            Class68_Sub13_Sub26.anInt3888 = 0;
            Class18.anInt318 = 0;
            Class68_Sub13_Sub28.anInt3920 = 0;
            Class25.anInt514 = 0;
            GameApplet.anInt11 = 0;
            Class68_Sub20_Sub13.anInt4360 = 0;
            NPCDefinition.anInt1461 = 0;
            anInt453 = 0;
            Class68_Sub13_Sub23.anInt3819 = 0;
            Class68_Sub13_Sub31.anInt3968 = 0;
            Class94.anInt1674 = 0;
            Class68_Sub20_Sub8.anInt4272 = 0;
            Class68_Sub13_Sub37.anInt4055 = 0;
            Class20.anInt416 = 0;
            Stream.anInt2980 = 0;
            Class68_Sub20_Sub11.anInt4326 = 0;
            Class68_Sub13_Sub17.anInt3720 = 0;
            Class44.anInt752 = 0;
            Class68_Sub20_Sub3.anInt4215 = 0;
            Class68_Sub28_Sub2.anInt4539 = 0;
            GroundData.anInt657 = 0;
            Class34.anInt601 = 0;
            Class68_Sub26.anInt3209 = 0;
            Class68_Sub20_Sub13_Sub2.anInt4628 = 0;
            Class101.anInt1743 = 0;
            Class68_Sub13_Sub27.anInt3892 = 0;
            MutableString.anInt2292 = 0;
            Animation.anInt2070 = 0;
            Item.anInt2436 = 0;
            Object5.anInt1261 = 0;
            Class51.anInt2254 = 0;
            Class91.anInt1634 = 0;
            Class13.anInt219 = 0;
            Class72_Sub1.anInt3271 = 0;
            Class68_Sub13_Sub20.anInt3770 = 0;
            Class72_Sub1.anInt3260 = 0;
            Class75_Sub1.anInt3300 = 0;
            Class90.anInt2361 = 0;
            Class71_Sub1.anInt3254 = 0;
            Class68_Sub28_Sub1.anInt4501 = 0;
            Class68_Sub13_Sub13.anInt3663 = 0;
            Keyboard.anInt2128 = 0;
            Object3.anInt936 = 0;
            Class28.anInt532 = 0;
            Class68_Sub13_Sub5.anInt3516 = 0;
            Class21_Sub1.anInt2708 = 0;
            Class95.anInt1683 = 0;
            Class72_Sub1.anInt3268 = 0;
            Class13_Sub1.anInt2627 = 0;
            Class68_Sub20_Sub8.anInt4289 = 0;
            Class124.anInt2140 = 0;
            Class68_Sub13_Sub1.anInt3452 = 0;
            Class68_Sub20_Sub3.anInt4197 = 0;
            Class68_Sub22.anInt3149 = 0;
            Item.anInt2440 = 0;
            Class8.anInt154 = 0;
            client.anInt2375 = 0;
            Class1_Sub1.anInt2428 = 0;
            Class90.anInt2346 = 0;
            Class68_Sub20_Sub5.anInt4226 = 0;
            client.anInt2383 = 0;
            GameSocket.anInt1150 = 0;
            Class22.anInt487 = 0;
            Widget.anInt800 = 0;
            Class68_Sub13_Sub10.anInt3591 = 0;
            Class68_Sub28_Sub1.anInt4471 = 0;
            Class68_Sub20_Sub11.anInt4324 = 0;
            Class68_Sub13_Sub4.anInt3508 = 0;
            Keyboard.anInt2121 = 0;
            Class68_Sub13_Sub24.anInt3832 = 0;
            MutableString.anInt2275 = 0;
            Class68_Sub28_Sub1.anInt4507 = 0;
            Stream.anInt2963 = 0;
            Stream.anInt2967 = 0;
            Class114.anInt1936 = 0;
            Item.anInt2439 = 0;
            Class72_Sub1.anInt3262 = 0;
            Object2.anInt1348 = 0;
            Class72_Sub1.anInt3288 = 0;
            Class72.anInt1315 = 0;
            Stream.anInt2955 = 0;
            GroundData.anInt674 = 0;
            anInt429 = 0;
            Class68_Sub13_Sub35.anInt4031 = 0;
            Class115.anInt1946 = 0;
            Class87.anInt1595 = 0;
            Animable.anInt65 = 0;
            Class90.anInt2333 = 0;
            Class68_Sub13_Sub36.anInt4043 = 0;
            Class68_Sub28_Sub1.anInt4460 = 0;
            RandomNumberGenerator.anInt1496 = 0;
            Class68_Sub13_Sub15.anInt3680 = 0;
            Login.anInt1506 = 0;
            Class68_Sub13_Sub37.anInt4065 = 0;
            RandomNumberGenerator.anInt1486 = 0;
            Class72.anInt1319 = 0;
            PlayerDefinition.anInt2197 = 0;
            Class68_Sub13_Sub23.anInt3829 = 0;
            GameApplet.anInt9 = 0;
            anInt450 = 0;
            Class68_Sub20_Sub2.anInt4186 = 0;
            Class8.anInt158 = 0;
            Stream.anInt2970 = 0;
            Class4.anInt90 = 0;
            Class1_Sub5.anInt2499 = 0;
            Class68_Sub13_Sub38.anInt4082 = 0;
            Stream.anInt2950 = 0;
            Class70.anInt1272 = 0;
            Class68_Sub20_Sub11.anInt4331 = 0;
            Class101.anInt1739 = 0;
            Class14.anInt235 = 0;
            Class68_Sub13_Sub15.anInt3688 = 0;
            Class68_Sub13.anInt2927 = 0;
            Class58.anInt1094 = 0;
            Class3.anInt76 = 0;
            Class68_Sub20_Sub4.anInt4217 = 0;
            Class72_Sub1.anInt3277 = 0;
            Class58.anInt1096 = 0;
            GameApplet.anInt3 = 0;
            NPC.anInt3399 = 0;
            Class90.anInt2338 = 0;
            Class70.anInt1263 = 0;
            Class68_Sub19.anInt3076 = 0;
            GameApplet.anInt12 = 0;
            Class89.anInt1631 = 0;
            Object1.anInt1193 = 0;
            Class68_Sub28_Sub1.anInt4486 = 0;
            Class90.anInt2339 = 0;
            Stream.anInt2949 = 0;
            Stream.anInt2974 = 0;
            Class68_Sub13_Sub19.anInt3749 = 0;
            Class68_Sub13_Sub25.anInt3852 = 0;
            Class22.anInt486 = 0;
            anInt443 = 0;
            Class68_Sub28_Sub1.anInt4525 = 0;
            Class11.anInt191 = 0;
            Class68_Sub28_Sub1.anInt4512 = 0;
            Class102.anInt1754 = 0;
            Class75_Sub2.anInt3310 = 0;
            Class68_Sub13_Sub20.anInt3778 = 0;
            Class114.anInt1938 = 0;
            Class53.anInt1019 = 0;
            Class49.anInt974 = 0;
            Class1_Sub7.anInt2618 = 0;
            Class68_Sub13_Sub3.anInt3467 = 0;
            Class13_Sub1.anInt2642 = 0;
            Class68_Sub13_Sub26_Sub1.anInt4613 = 0;
            Class84.anInt1536 = 0;
            Class68_Sub13_Sub27.anInt3891 = 0;
            GameSocket.anInt1140 = 0;
            Class68_Sub20_Sub15.anInt4390 = 0;
            Class58.anInt1088 = 0;
            Class68_Sub20_Sub10.anInt4310 = 0;
            Class54.anInt1031 = 0;
            Class51.anInt2251 = 0;
            Class68_Sub13_Sub39.anInt4098 = 0;
            Class68_Sub13_Sub11.anInt3625 = 0;
            Class104.anInt1787 = 0;
            Class68_Sub22.anInt3144 = 0;
            Class103.anInt1774 = 0;
            Player.anInt3405 = 0;
            Class68_Sub24.anInt3157 = 0;
            Stream.anInt2958 = 0;
            Class111.anInt1867 = 0;
            Class68_Sub22.anInt3140 = 0;
            Class68_Sub19.anInt3074 = 0;
            ItemDefinition.anInt346 = 0;
            Class68_Sub13_Sub20.anInt3774 = 0;
            MutableString.anInt2305 = 0;
            Class60.anInt1113 = 0;
            Class13_Sub4.anInt2693 = 0;
            Class68_Sub13_Sub8.anInt3559 = 0;
            ItemDefinition.anInt382 = 0;
            Class68_Sub13_Sub26.anInt3879 = 0;
            GroundData.anInt678 = 0;
            Class7.anInt128 = 0;
            Class68_Sub13_Sub7.anInt3551 = 0;
            Stream.anInt2993 = 0;
            Class15.aBoolean250 = true;
            Class68_Sub20_Sub2.method1041(-13893);
            Class49.packetOpcode = -1;
            Class104.anInt1786 = 0;
            Class68_Sub20_Sub7.anInt4254 = -1;
            NodeSub.anInt3088 = -1;
            ((Stream) connectionVector).position = 0;
            Class68_Sub20_Sub6.anInt4242 = -1;
            NodeList.anInt273 = 0;
            Class68_Sub20_Sub13.anInt4370 = 0;
            ((Stream) Class68_Sub13_Sub8.connectionVector).position = 0;
            for (int i_87_ = 0; i_87_ < Class34.aClass23Array594.length; i_87_++)
                Class34.aClass23Array594[i_87_] = null;
            Class120.menuOpen = false;
            Class68_Sub13_Sub21.menuOptionsCount = 0;
            Mouse.method1488(0, 0);
            for (int i_88_ = 0; i_88_ < 100; i_88_++)
                Animation.chatNames[i_88_] = null;
            Class68_Sub13_Sub32.anInt3983 = -1;
            Class21_Sub1.aBoolean2707 = false;
            Class68_Sub13_Sub26.minimapInt1 = (int) (Math.random() * 120.0) - 60;
            Item.anInt2437 = 0;
            Class68_Sub13_Sub28.anInt3922 = (int) (Math.random() * 80.0) - 40;
            Class68_Sub3.anInt2807 = (int) (Math.random() * 100.0) - 50;
            Class13_Sub2.localNPCCount = 0;
            Class8.minimapInt2 = 0x7ff & (int) (20.0 * Math.random()) - 10;
            Class68_Sub9.anInt2884 = 0;
            Class95.destinationX = 0;
            Class22.anInt485 = 0;
            Class68_Sub20_Sub16.minimapInt3 = (int) (Math.random() * 30.0) - 20;
            Class68_Sub13_Sub37.anInt4064 = 0;
            Class75_Sub2.destinationY = 0;
            client.localPlayerCount = 0;
            Class68_Sub20_Sub9.anInt4293 = (int) (110.0 * Math.random()) - 55;
            for (int i_89_ = 0; i_89_ < 2048; i_89_++)
            {
                Class68_Sub13_Sub4.localPlayers[i_89_] = null;
                Ground.aClass68_Sub14Array2757[i_89_] = null;
            }
            for (int i_90_ = 0; i_90_ < 32768; i_90_++)
                Class102.localNPCs[i_90_] = null;
            Class68_Sub7.localPlayer = Class68_Sub13_Sub4.localPlayers[2047] = new Player();
            Widget.aClass16_886.method284(105);
            Class105.aClass16_1792.method284(105);
            for (int i_91_ = 0; i_91_ < 4; i_91_++)
            {
                for (int i_92_ = 0; i_92_ < 104; i_92_++)
                {
                    for (int i_93_ = 0; i_93_ < 104; i_93_++)
                        Widget.groundItems[i_91_][i_92_][i_93_] = null;
                }
            }
            Class68_Sub13_Sub31.aClass16_3965 = new NodeList();
            Class32.friendCount = 0;
            Widget.anInt917 = 0;
            Class119.method1741(i - 10953);
            Class68_Sub5.method663(0);
            Class68_Sub20_Sub12.anInt4356 = 0;
            Class68_Sub13_Sub31.cameraPositionZ_local = 0;
            Stream.cameraPositionX_local = 0;
            Class8.cameraViewToX = 0;
            Class68_Sub13.cameraViewToZ = 0;
            Class72.anInt1321 = 0;
            Class68_Sub13_Sub37.cameraPositionY_local = 0;
            PlayerDefinition.cameraViewToY = 0;
            Class68_Sub24.cameraTurnStep_local = 0;
            Class125.cameraTurnSpeed_local = 0;
            for (int i_94_ = 0; i_94_ < Class106.anIntArray1811.length; i_94_++)
                Class106.anIntArray1811[i_94_] = -1;
            if (Class68_Sub13_Sub10.anInt3597 != -1)
                ItemDefinition.method314(i ^ ~0x2ab3, Class68_Sub13_Sub10.anInt3597);
            for (Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1685(-32642)); class68_sub3 != null; class68_sub3 = (Class68_Sub3) Login.aClass113_1514.method1689((byte) -115))
                Class68_Sub13_Sub10.method744(class68_sub3, true, true);
            Class68_Sub13_Sub10.anInt3597 = -1;
            Login.aClass113_1514 = new NodeCache(8);
            Class29.aClass45_539 = null;
            Class120.menuOpen = false;
            Class68_Sub13_Sub21.menuOptionsCount = 0;
            Class68_Sub13_Sub33.aClass126_3993.method1779(new int[5], null, false, (byte) -128, -1);
            for (int i_95_ = 0; i_95_ < 8; i_95_++)
            {
                Class127.aClass100Array2209[i_95_] = null;
                Class118.aBooleanArray2080[i_95_] = false;
            }
            Login.method1475(121);
            Class68_Sub13_Sub28.aBoolean3921 = true;
            for (int i_96_ = 0; i_96_ < 100; i_96_++)
                Class121.aBooleanArray2111[i_96_] = true;
            Class68_Sub20_Sub8.anInt4280 = 0;
            Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632 = null;
            Object5.aClass100_1251 = null;
            for (int i_97_ = 0; i_97_ < 6; i_97_++)
                Class63.aClass49Array1171[i_97_] = new Class49();
            for (int i_98_ = 0; i_98_ < 25; i_98_++)
            {
                Class30.skillLevels[i_98_] = 0;
                Class88.skillLevelMaxes[i_98_] = 0;
                Class1_Sub5.skillExperiences[i_98_] = 0;
            }
            Class102.aBoolean1750 = true;
            Class63.aBoolean1170 = false;
            Class37.aClass100_653 = Class68_Sub13_Sub33.aClass100_3989;
            Class105.aShortArray1795 = Class33.aShortArray579 = Class68_Sub13_Sub25.aShortArray3856 = Class68_Sub20_Sub7.aShortArray4268 = new short[256];
            Class30.aClass16_541.method284(105);
            Class68_Sub20_Sub6.method1071((byte) -118);
        }
    }

    final byte[] method359(int i, int i_99_)
    {
        anInt429++;
        if (anIntArray448.length == 1)
            return method338(i_99_, 0, 0);
        if (!validIndex(i_99_, i))
            return null;
        if (anIntArray448[i_99_] == 1)
            return method338(0, i, i_99_);
        throw new RuntimeException();
    }

    final boolean method360(int i, int i_100_)
    {
        anInt443++;
        if (anIntArray448.length == 1)
            return method344(0, i, (byte) -116);
        if (!validIndex(i, i_100_))
            return false;
        if (anIntArray448[i] == 1)
            return method344(i, 0, (byte) -123);
        throw new RuntimeException();
    }

    static final boolean method361(int i, int i_101_, int i_102_)
    {
        int i_103_ = Class72.anIntArrayArrayArray1311[i][i_101_][i_102_];
        if (i_103_ == -Ground.anInt2758)
            return false;
        if (i_103_ == Ground.anInt2758)
            return true;
        int i_104_ = i_101_ << 7;
        int i_105_ = i_102_ << 7;
        if (Login.method1478(i_104_ + 1, (Class68_Sub20_Sub12.intGroundArray[i][i_101_][i_102_]), i_105_ + 1) && Login.method1478(i_104_ + 128 - 1, (Class68_Sub20_Sub12.intGroundArray[i][i_101_ + 1][i_102_]), i_105_ + 1) && Login.method1478(i_104_ + 128 - 1, (Class68_Sub20_Sub12.intGroundArray[i][i_101_ + 1][i_102_ + 1]), i_105_ + 128 - 1)
                && Login.method1478(i_104_ + 1, (Class68_Sub20_Sub12.intGroundArray[i][i_101_][i_102_ + 1]), i_105_ + 128 - 1))
        {
            Class72.anIntArrayArrayArray1311[i][i_101_][i_102_] = Ground.anInt2758;
            return true;
        }
        Class72.anIntArrayArrayArray1311[i][i_101_][i_102_] = -Ground.anInt2758;
        return false;
    }

    final boolean method362(byte i, MutableString class100, MutableString class100_106_)
    {
        try
        {
            if (i <= 42)
                anIntArray439 = null;
            class100 = class100.toLowerCase((byte) -84);
            class100_106_ = class100_106_.toLowerCase((byte) 37);
            int i_107_ = aClass109_444.method1663(class100.generateHash(), -1);
            anInt449++;
            if (!validIndex(i_107_, 0))
                return false;
            int i_108_ = aClass109Array427[i_107_].method1663(class100_106_.generateHash(), -1);
            return method344(i_107_, i_108_, (byte) -126);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cj.E(" + i + ',' + (class100 != null ? "{...}" : "null") + ',' + (class100_106_ != null ? "{...}" : "null") + ')'));
        }
    }

    final int method363(int i, MutableString class100)
    {
        try
        {
            anInt455++;
            class100 = class100.toLowerCase((byte) 120);
            if (i <= 125)
                method337(-21);
            int i_109_ = aClass109_444.method1663(class100.generateHash(), -1);
            return method332(0, i_109_);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cj.AA(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    Class21(boolean bool, boolean bool_110_)
    {
        aBoolean447 = bool_110_;
        aBoolean426 = bool;
    }

    static
    {
        aClass100_478 = Class112.makeMutableString(43, "<col=00ffff>");
    }
}
