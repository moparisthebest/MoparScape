/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class PlayerDefinition
{
    static int[] anIntArray2182;
    static int anInt2183;
    private int[] anIntArray2184;
    private int[] anIntArray2185;
    static int anInt2186;
    static boolean aBoolean2187 = false;
    private long aLong2188;
    static int anInt2189;
    static int anInt2190;
    static int anInt2191;
    static GameSocket connection;
    static int cameraViewToY;
    static Class21 aClass21_2194;
    static int anInt2195;
    static int anInt2196;
    static int anInt2197;
    boolean aBoolean2198;
    static int anInt2199;
    private long aLong2200;
    static int anInt2201;
    static int anInt2202;
    int anInt2203;

    static final MutableString method1771(long l, int i)
    {
        anInt2197++;
        int i_0_ = -20 % ((-16 - i) / 36);
        return ScriptParameters.method1322(10, l, 97, false);
    }

    final Model method1772(int i, Animation class117, int i_1_, int i_2_, byte i_3_)
    {
        try
        {
            anInt2189++;
            long l = (long) i_1_ | ((long) i_1_ << 32 | (long) (i_2_ << 16));
            if (i_3_ != -37)
                method1771(37L, 25);
            Model class1_sub3 = ((Model) Class75_Sub1_Sub1.aClass98_4579.getNodeForID(l));
            if (class1_sub3 == null)
            {
                Class1_Sub4[] class1_sub4s = new Class1_Sub4[2];
                int i_4_ = 0;
                if (Class54.method552(i_1_, i_3_ + 40).method1679(i_3_ ^ 0x5c83) && Class54.method552(i_2_, 3).method1679(i_3_ ^ 0x5c83))
                {
                    Class1_Sub4 class1_sub4 = Class54.method552(i_1_, i_3_ ^ ~0x27).method1678(-74);
                    if (class1_sub4 != null)
                        class1_sub4s[i_4_++] = class1_sub4;
                    class1_sub4 = Class54.method552(i_2_, 3).method1678(-123);
                    if (class1_sub4 != null)
                        class1_sub4s[i_4_++] = class1_sub4;
                    class1_sub4 = new Class1_Sub4(class1_sub4s, i_4_);
                    for (int i_5_ = 0; i_5_ < 5; i_5_++)
                    {
                        if (Class56.aShortArrayArray1065[i_5_].length > anIntArray2184[i_5_])
                            class1_sub4.method129((Class120.aShortArray2100[i_5_]), (Class56.aShortArrayArray1065[i_5_][anIntArray2184[i_5_]]));
                        if (anIntArray2184[i_5_] < Class92.aShortArrayArray1652[i_5_].length)
                            class1_sub4.method129((Class68_Sub13_Sub35.aShortArray4025[i_5_]), (Class92.aShortArrayArray1652[i_5_][anIntArray2184[i_5_]]));
                    }
                    class1_sub3 = class1_sub4.method127(64, 768, -50, -10, -50);
                    Class75_Sub1_Sub1.aClass98_4579.addObject(class1_sub3, l);
                } else
                    return null;
            }
            if (class117 != null)
                class1_sub3 = class117.method1728((byte) -98, class1_sub3, i);
            return class1_sub3;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wf.D(" + i + ',' + (class117 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
        }
    }

    final void method1773(boolean bool, int i)
    {
        ((PlayerDefinition) this).aBoolean2198 = bool;
        anInt2186++;
        int i_6_ = -19 / ((7 - i) / 45);
        method1781(-1);
    }

    final Model method1774(int i, Animation class117, int i_7_, Animation class117_8_, byte i_9_)
    {
        try
        {
            anInt2191++;
            if (((PlayerDefinition) this).anInt2203 != -1)
                return (Class68_Sub13_Sub11.getNPCDefinition(((PlayerDefinition) this).anInt2203).method1457(i_7_, class117_8_, (byte) -119, class117, i));
            long l = aLong2188;
            int[] is = anIntArray2185;
            if (i_9_ <= 43)
                aClass21_2194 = null;
            if (class117 != null && (((Animation) class117).anInt2049 >= 0 || ((Animation) class117).anInt2035 >= 0))
            {
                is = new int[12];
                for (int i_10_ = 0; i_10_ < 12; i_10_++)
                    is[i_10_] = anIntArray2185[i_10_];
                if (((Animation) class117).anInt2049 >= 0)
                {
                    if (((Animation) class117).anInt2049 != 65535)
                    {
                        is[5] = Class70.OR(1073741824, (((Animation) class117).anInt2049));
                        l ^= (long) is[5] << 32;
                    } else
                    {
                        l ^= ~0xffffffffL;
                        is[5] = 0;
                    }
                }
                if (((Animation) class117).anInt2035 >= 0)
                {
                    if (((Animation) class117).anInt2035 == 65535)
                    {
                        is[3] = 0;
                        l ^= 0xffffffffL;
                    } else
                    {
                        is[3] = Class70.OR(1073741824, (((Animation) class117).anInt2035));
                        l ^= (long) is[3];
                    }
                }
            }
            Model class1_sub3 = ((Model) Class68_Sub13_Sub2.aClass98_3461.getNodeForID(l));
            if (class1_sub3 == null)
            {
                boolean bool = false;
                for (int i_11_ = 0; i_11_ < 12; i_11_++)
                {
                    int i_12_ = is[i_11_];
                    if ((0x40000000 & i_12_) != 0)
                    {
                        if (!GameApplet.method18(-25672, 0x3fffffff & i_12_).method308(((PlayerDefinition) this).aBoolean2198, -116))
                            bool = true;
                    } else if ((i_12_ & ~0x7fffffff) != 0 && !Class54.method552(i_12_ & 0x3fffffff, 3).method1680((byte) -118))
                        bool = true;
                }
                if (bool)
                {
                    if (aLong2200 != -1L)
                        class1_sub3 = (Model) Class68_Sub13_Sub2.aClass98_3461.getNodeForID(aLong2200);
                    if (class1_sub3 == null)
                        return null;
                }
                if (class1_sub3 == null)
                {
                    Class1_Sub4[] class1_sub4s = new Class1_Sub4[12];
                    int i_13_ = 0;
                    for (int i_14_ = 0; i_14_ < 12; i_14_++)
                    {
                        int i_15_ = is[i_14_];
                        if ((0x40000000 & i_15_) == 0)
                        {
                            if ((i_15_ & ~0x7fffffff) != 0)
                            {
                                Class1_Sub4 class1_sub4 = Class54.method552(0x3fffffff & i_15_, 3).method1675(false);
                                if (class1_sub4 != null)
                                    class1_sub4s[i_13_++] = class1_sub4;
                            }
                        } else
                        {
                            Class1_Sub4 class1_sub4 = (GameApplet.method18(-25672, 0x3fffffff & i_15_).method319(((PlayerDefinition) this).aBoolean2198, (byte) 118));
                            if (class1_sub4 != null)
                                class1_sub4s[i_13_++] = class1_sub4;
                        }
                    }
                    int i_16_ = is[0];
                    if ((i_16_ & 0x40000000) != 0)
                    {
                        ItemDefinition class19 = GameApplet.method18(-25672, 0x3fffffff & i_16_);
                        if (((ItemDefinition) class19).anIntArrayArray331 != null)
                        {
                            for (int i_17_ = 0; (((ItemDefinition) class19).anIntArrayArray331.length > i_17_); i_17_++)
                            {
                                if ((((ItemDefinition) class19).anIntArrayArray331[i_17_]) != null && class1_sub4s[i_17_ + 1] != null)
                                {
                                    int i_18_ = (((ItemDefinition) class19).anIntArrayArray331[i_17_][0]);
                                    int i_19_ = (((ItemDefinition) class19).anIntArrayArray331[i_17_][1]);
                                    int i_20_ = (((ItemDefinition) class19).anIntArrayArray331[i_17_][2]);
                                    int i_21_ = (((ItemDefinition) class19).anIntArrayArray331[i_17_][3]);
                                    int i_22_ = (((ItemDefinition) class19).anIntArrayArray331[i_17_][4]);
                                    int i_23_ = (((ItemDefinition) class19).anIntArrayArray331[i_17_][5]);
                                    class1_sub4s[i_17_ + 1].method128(i_18_, i_19_, i_20_);
                                    class1_sub4s[i_17_ + 1].method125(i_21_, i_22_, i_23_);
                                }
                            }
                        }
                    }
                    Class1_Sub4 class1_sub4 = new Class1_Sub4(class1_sub4s, i_13_);
                    for (int i_24_ = 0; i_24_ < 5; i_24_++)
                    {
                        if (anIntArray2184[i_24_] < Class56.aShortArrayArray1065[i_24_].length)
                            class1_sub4.method129((Class120.aShortArray2100[i_24_]), (Class56.aShortArrayArray1065[i_24_][anIntArray2184[i_24_]]));
                        if (anIntArray2184[i_24_] < Class92.aShortArrayArray1652[i_24_].length)
                            class1_sub4.method129((Class68_Sub13_Sub35.aShortArray4025[i_24_]), (Class92.aShortArrayArray1652[i_24_][anIntArray2184[i_24_]]));
                    }
                    class1_sub3 = class1_sub4.method127(64, 850, -30, -50, -30);
                    Class68_Sub13_Sub2.aClass98_3461.addObject(class1_sub3, l);
                    aLong2200 = l;
                }
            }
            if (class117 == null && class117_8_ == null)
                return class1_sub3;
            Model class1_sub3_25_;
            if (class117 != null && class117_8_ != null)
                class1_sub3_25_ = class117.method1733(class1_sub3, class117_8_, i_7_, (byte) -79, i);
            else if (class117 == null)
                class1_sub3_25_ = class117_8_.method1725(i_7_, true, class1_sub3);
            else
                class1_sub3_25_ = class117.method1725(i, true, class1_sub3);
            return class1_sub3_25_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wf.E(" + i + ',' + (class117 != null ? "{...}" : "null") + ',' + i_7_ + ',' + (class117_8_ != null ? "{...}" : "null") + ',' + i_9_ + ')'));
        }
    }

    final void method1775(int i, int i_26_, int i_27_)
    {
        if (i_26_ == 41)
        {
            anIntArray2184[i] = i_27_;
            method1781(-1);
            anInt2183++;
        }
    }

    public static void method1776(int i)
    {
        connection = null;
        anIntArray2182 = null;
        if (i <= 56)
            aClass21_2194 = null;
        aClass21_2194 = null;
    }

    final Model method1777(int i, Animation class117, int i_28_)
    {
        try
        {
            if (i_28_ != -13)
                return null;
            anInt2196++;
            if (((PlayerDefinition) this).anInt2203 != -1)
                return Class68_Sub13_Sub11.getNPCDefinition(((PlayerDefinition) this).anInt2203).method1456(class117, (byte) 12, i);
            Model class1_sub3 = ((Model) Class75_Sub1_Sub1.aClass98_4579.getNodeForID(aLong2188));
            if (class1_sub3 == null)
            {
                boolean bool = false;
                for (int i_29_ = 0; i_29_ < 12; i_29_++)
                {
                    int i_30_ = anIntArray2185[i_29_];
                    if ((0x40000000 & i_30_) == 0)
                    {
                        if ((i_30_ & ~0x7fffffff) != 0 && !Class54.method552(0x3fffffff & i_30_, 3).method1679(i_28_ ^ 0x5cab))
                            bool = true;
                    } else if (!GameApplet.method18(-25672, i_30_ & 0x3fffffff).method310(((PlayerDefinition) this).aBoolean2198, (byte) 75))
                        bool = true;
                }
                if (bool)
                    return null;
                Class1_Sub4[] class1_sub4s = new Class1_Sub4[12];
                int i_31_ = 0;
                for (int i_32_ = 0; i_32_ < 12; i_32_++)
                {
                    int i_33_ = anIntArray2185[i_32_];
                    if ((0x40000000 & i_33_) != 0)
                    {
                        Class1_Sub4 class1_sub4 = (GameApplet.method18(-25672, 0x3fffffff & i_33_).method316(-31779, ((PlayerDefinition) this).aBoolean2198));
                        if (class1_sub4 != null)
                            class1_sub4s[i_31_++] = class1_sub4;
                    } else if ((~0x7fffffff & i_33_) != 0)
                    {
                        Class1_Sub4 class1_sub4 = Class54.method552(0x3fffffff & i_33_, i_28_ ^ ~0xf).method1678(-50);
                        if (class1_sub4 != null)
                            class1_sub4s[i_31_++] = class1_sub4;
                    }
                }
                Class1_Sub4 class1_sub4 = new Class1_Sub4(class1_sub4s, i_31_);
                for (int i_34_ = 0; i_34_ < 5; i_34_++)
                {
                    if (anIntArray2184[i_34_] < Class56.aShortArrayArray1065[i_34_].length)
                        class1_sub4.method129(Class120.aShortArray2100[i_34_], (Class56.aShortArrayArray1065[i_34_][anIntArray2184[i_34_]]));
                    if (anIntArray2184[i_34_] < Class92.aShortArrayArray1652[i_34_].length)
                        class1_sub4.method129((Class68_Sub13_Sub35.aShortArray4025[i_34_]), (Class92.aShortArrayArray1652[i_34_][anIntArray2184[i_34_]]));
                }
                class1_sub3 = class1_sub4.method127(64, 768, -50, -10, -50);
                Class75_Sub1_Sub1.aClass98_4579.addObject(class1_sub3, aLong2188);
            }
            if (class117 != null)
                class1_sub3 = class117.method1728((byte) -64, class1_sub3, i);
            return class1_sub3;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wf.G(" + i + ',' + (class117 != null ? "{...}" : "null") + ',' + i_28_ + ')'));
        }
    }

    final void method1778(int i, int i_35_, int i_36_)
    {
        anInt2201++;
        int i_37_ = Class48.anIntArray960[i];
        if (i_36_ != -27345)
            method1780(false);
        if (anIntArray2185[i_37_] != 0 && Class54.method552(i_35_, 3) != null)
        {
            anIntArray2185[i_37_] = Class70.OR(i_35_, -2147483648);
            method1781(-1);
        }
    }

    final void method1779(int[] is, int[] is_38_, boolean bool, byte i, int i_39_)
    {
        do
        {
            try
            {
                if (is_38_ == null)
                {
                    is_38_ = new int[12];
                    for (int i_40_ = 0; i_40_ < 7; i_40_++)
                    {
                        for (int i_41_ = 0; i_41_ < Class119.anInt2090; i_41_++)
                        {
                            Class112 class112 = Class54.method552(i_41_, 3);
                            if (class112 != null && !class112.aBoolean1880 && ((class112.anInt1897 ^ 0xffffffff) == ((!bool ? 0 : i_40_) + 7 ^ 0xffffffff)))
                            {
                                is_38_[Class48.anIntArray960[i_40_]] = Class70.OR(-2147483648, i_41_);
                                break;
                            }
                        }
                    }
                }
                anInt2203 = i_39_;
                anInt2199++;
                anIntArray2184 = is;
                aBoolean2198 = bool;
                anIntArray2185 = is_38_;
                method1781(-1);
                if (i < -125)
                    break;
                method1772(121, null, -17, 99, (byte) -74);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("wf.K(" + (is != null ? "{...}" : "null") + ',' + (is_38_ != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_39_ + ')'));
            }
            break;
        } while (false);
    }

    final int method1780(boolean bool)
    {
        if (bool != true)
            method1773(false, -75);
        anInt2202++;
        if (((PlayerDefinition) this).anInt2203 != -1)
            return (((NPCDefinition) Class68_Sub13_Sub11.getNPCDefinition(((PlayerDefinition) this).anInt2203)).type + 305419896);
        return (anIntArray2185[1] + ((anIntArray2185[11] << 5) + (anIntArray2185[0] << 15)) + (anIntArray2184[4] << 20) + ((anIntArray2184[0] << 25) + (anIntArray2185[8] << 10)));
    }

    private final void method1781(int i)
    {
        anInt2190++;
        long l = aLong2188;
        long[] ls = Class118.aLongArray2078;
        aLong2188 = -1L;
        if (i != -1)
            method1771(-7L, 114);
        for (int i_42_ = 0; i_42_ < 12; i_42_++)
        {
            aLong2188 = (aLong2188 >>> 8 ^ ls[(int) (0xffL & (aLong2188 ^ (long) (anIntArray2185[i_42_] >> 24)))]);
            aLong2188 = aLong2188 >>> 8 ^ ls[(int) ((aLong2188 ^ (long) (anIntArray2185[i_42_] >> 16)) & 0xffL)];
            aLong2188 = aLong2188 >>> 8 ^ ls[(int) (((long) (anIntArray2185[i_42_] >> 8) ^ aLong2188) & 0xffL)];
            aLong2188 = ls[(int) (((long) anIntArray2185[i_42_] ^ aLong2188) & 0xffL)] ^ aLong2188 >>> 8;
        }
        for (int i_43_ = 0; i_43_ < 5; i_43_++)
            aLong2188 = (ls[(int) (0xffL & (aLong2188 ^ (long) anIntArray2184[i_43_]))] ^ aLong2188 >>> 8);
        aLong2188 = (aLong2188 >>> 8 ^ ls[(int) (((long) (!((PlayerDefinition) this).aBoolean2198 ? 0 : 1) ^ aLong2188) & 0xffL)]);
        if (l != 0L && aLong2188 != l)
            Class68_Sub13_Sub2.aClass98_3461.method1575((byte) 28, l);
    }

    static final String method1782(Throwable throwable, int i) throws IOException
    {
        anInt2195++;
        String string;
        if (!(throwable instanceof GameException))
            string = "";
        else
        {
            GameException runtimeexception_sub1 = (GameException) throwable;
            throwable = (((GameException) runtimeexception_sub1).cause);
            string = (((GameException) runtimeexception_sub1).message + " | ");
        }
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        throwable.printStackTrace(printwriter);
        printwriter.close();
        String string_44_ = stringwriter.toString();
        BufferedReader bufferedreader = new BufferedReader(new StringReader(string_44_));
        String string_45_ = bufferedreader.readLine();
        for (;;)
        {
            String string_46_ = bufferedreader.readLine();
            if (string_46_ == null)
                break;
            int i_47_ = string_46_.indexOf('(');
            int i_48_ = string_46_.indexOf(')', i_47_ + 1);
            if (i_47_ >= 0 && i_48_ >= 0)
            {
                String string_49_ = string_46_.substring(i_47_ + 1, i_48_);
                int i_50_ = string_49_.indexOf(".java:");
                if (i_50_ >= 0)
                {
                    string_49_ = (string_49_.substring(0, i_50_) + string_49_.substring(i_50_ + 5));
                    string += string_49_ + ' ';
                    continue;
                }
                string_46_ = string_46_.substring(0, i_47_);
            }
            string_46_ = string_46_.trim();
            string_46_ = string_46_.substring(string_46_.lastIndexOf(' ') + 1);
            string_46_ = string_46_.substring(string_46_.lastIndexOf('\t') + 1);
            string += string_46_ + ' ';
        }
        string += "| " + (String) string_45_;
        int i_51_ = -123 / ((9 - i) / 32);
        return string;
    }

    public PlayerDefinition()
    {
        /* empty */
    }

    static
    {
        anIntArray2182 = new int[2];
    }
}
