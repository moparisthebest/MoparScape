/* Class68_Sub13_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub17 extends Class68_Sub13
{
    static boolean aBoolean3713 = false;
    private int anInt3714;
    private int anInt3715 = 4096;
    static int anInt3716;
    static int anInt3717;
    private int anInt3718;
    private int[] anIntArray3719;
    static int anInt3720;
    static int[] anIntArray3721;
    static MutableString aClass100_3722 = Class112.makeMutableString(43, "RuneScape wird geladen )2 bitte warten)3)3)3");
    static int anInt3723;
    static int anInt3724;
    private int anInt3725;
    static int anInt3726;
    static int anInt3727;

    public Class68_Sub13_Sub17()
    {
        super(1, false);
        anInt3714 = 4096;
        anIntArray3719 = new int[3];
        anInt3718 = 409;
        anInt3725 = 4096;
    }

    static final int method780(int i, int i_0_, int i_1_, int i_2_)
    {
        anInt3716++;
        i &= 0x3;
        if (i == 0)
            return i_1_;
        if (i == 1)
            return i_0_;
        if (i_2_ != -27039)
            method785(-105, null);
        if (i == 2)
            return 7 - i_1_;
        return 7 - i_0_;
    }

    static final MutableString method781(int i, int i_3_, Widget class45)
    {
        try
        {
            anInt3723++;
            if (!Class68_Sub13_Sub20.method803(i_3_, client.method41(class45), i - 28702) && ((Widget) class45).anObjectArray856 == null)
                return null;
            if (((Widget) class45).aClass100Array823 == null || i_3_ >= ((Widget) class45).aClass100Array823.length || ((Widget) class45).aClass100Array823[i_3_] == null || ((Widget) class45).aClass100Array823[i_3_].method1591(true).getLength() == 0)
            {
                if (NodeSub.aBoolean3096)
                    return (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Login.aClass100_1515, Class68_Sub13_Sub24.method816(i_3_, 0) })));
                return null;
            }
            if (i != -3574)
                method785(-79, null);
            return ((Widget) class45).aClass100Array823[i_3_];
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ji.D(" + i + ',' + i_3_ + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method782(int i)
    {
        aClass100_3722 = null;
        if (i == 0)
            anIntArray3721 = null;
    }

    final int[][] method697(int i, boolean bool)
    {
        if (bool != true)
            method781(-121, 56, null);
        anInt3724++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -102);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[][] is_4_ = this.method699(-71, 0, i);
            int[] is_5_ = is_4_[0];
            int[] is_6_ = is_4_[1];
            int[] is_7_ = is_4_[2];
            int[] is_8_ = is[0];
            int[] is_9_ = is[1];
            int[] is_10_ = is[2];
            for (int i_11_ = 0; i_11_ < Class68_Sub13_Sub19.anInt3748; i_11_++)
            {
                int i_12_ = is_5_[i_11_];
                int i_13_ = i_12_ - anIntArray3719[0];
                if (i_13_ < 0)
                    i_13_ = -i_13_;
                if (anInt3718 < i_13_)
                {
                    is_8_[i_11_] = i_12_;
                    is_9_[i_11_] = is_6_[i_11_];
                    is_10_[i_11_] = is_7_[i_11_];
                } else
                {
                    int i_14_ = is_6_[i_11_];
                    i_13_ = i_14_ - anIntArray3719[1];
                    if (i_13_ < 0)
                        i_13_ = -i_13_;
                    if (anInt3718 < i_13_)
                    {
                        is_8_[i_11_] = i_12_;
                        is_9_[i_11_] = i_14_;
                        is_10_[i_11_] = is_7_[i_11_];
                    } else
                    {
                        int i_15_ = is_7_[i_11_];
                        i_13_ = i_15_ - anIntArray3719[2];
                        if (i_13_ < 0)
                            i_13_ = -i_13_;
                        if (i_13_ > anInt3718)
                        {
                            is_8_[i_11_] = i_12_;
                            is_9_[i_11_] = i_14_;
                            is_10_[i_11_] = i_15_;
                        } else
                        {
                            is_8_[i_11_] = anInt3714 * i_12_ >> 12;
                            is_9_[i_11_] = i_14_ * anInt3725 >> 12;
                            is_10_[i_11_] = anInt3715 * i_15_ >> 12;
                        }
                    }
                }
            }
        }
        return is;
    }

    static final int method783(int i, Class21 class21)
    {
        try
        {
            int i_16_ = 0;
            if (class21.method360(NodeSub.anInt3091, 0))
                i_16_++;
            if (class21.method360(Class68_Sub26.anInt3184, 0))
                i_16_++;
            if (class21.method360(Class51.anInt2261, 0))
                i_16_++;
            anInt3720++;
            if (class21.method360(Class17.anInt280, 0))
                i_16_++;
            if (class21.method360(Class68_Sub13_Sub16.anInt3697, 0))
                i_16_++;
            if (class21.method360(NodeCache.anInt1904, i))
                i_16_++;
            if (class21.method360(Class1_Sub5.anInt2502, i))
                i_16_++;
            if (class21.method360(Class68_Sub8.anInt2878, i))
                i_16_++;
            if (class21.method360(GameApplet.anInt16, 0))
                i_16_++;
            if (class21.method360(Class68_Sub13_Sub38.anInt4084, 0))
                i_16_++;
            if (class21.method360(Class68_Sub13_Sub27.anInt3893, 0))
                i_16_++;
            if (class21.method360(ClientScript.anInt4380, i + i))
                i_16_++;
            if (class21.method360(Class15.anInt252, 0))
                i_16_++;
            i_16_++;
            if (class21.method360(Class97.anInt1714, 0))
                i_16_++;
            if (class21.method360(Class97.anInt1708, i))
                i_16_++;
            return i_16_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ji.E(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method700(Stream class68_sub14, int i, int i_17_)
    {
        try
        {
            int i_18_ = i;
            while_75_: do
            {
                while_74_: do
                {
                    while_73_: do
                    {
                        do
                        {
                            if (i_18_ != 0)
                            {
                                if (i_18_ != 1)
                                {
                                    if (i_18_ != 2)
                                    {
                                        if (i_18_ != 3)
                                        {
                                            if (i_18_ == 4)
                                                break while_74_;
                                            break while_75_;
                                        }
                                    } else
                                        break;
                                    break while_73_;
                                }
                            } else
                            {
                                anInt3718 = class68_sub14.readUShort();
                                break while_75_;
                            }
                            anInt3715 = class68_sub14.readUShort();
                            break while_75_;
                        } while (false);
                        anInt3725 = class68_sub14.readUShort();
                        break while_75_;
                    } while (false);
                    anInt3714 = class68_sub14.readUShort();
                    break while_75_;
                } while (false);
                int i_19_ = class68_sub14.readTInteger();
                anIntArray3719[0] = Class120.method1746(16711680, i_19_) << 4;
                anIntArray3719[1] = Class120.method1746(4080, i_19_ >> 4);
                anIntArray3719[2] = Class120.method1746(i_19_, 255) >> 12;
            } while (false);
            if (i_17_ != -1)
                method781(22, -40, null);
            anInt3727++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ji.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_17_ + ')'));
        }
    }

    static final ClientScript method784(int i, byte i_20_)
    {
        anInt3726++;
        ClientScript class68_sub20_sub14 = ((ClientScript) Class68_Sub13_Sub16.aClass82_3704.method1479((long) i, (byte) -76));
        if (class68_sub20_sub14 != null)
            return class68_sub20_sub14;
        byte[] is = Class13.aClass21_Sub1_221.method338(0, 0, i);
        if (is == null)
            return null;
        class68_sub20_sub14 = new ClientScript();
        if (i_20_ < 22)
            aClass100_3722 = null;
        Stream class68_sub14 = new Stream(is);
        ((Stream) class68_sub14).position = ((Stream) class68_sub14).buffer.length - 2;
        int i_21_ = class68_sub14.readUShort();
        int i_22_ = (((Stream) class68_sub14).buffer.length - 2 - (i_21_ + 12));
        ((Stream) class68_sub14).position = i_22_;
        int i_23_ = class68_sub14.readInteger();
        ((ClientScript) class68_sub20_sub14).anInt4381 = class68_sub14.readUShort();
        ((ClientScript) class68_sub20_sub14).anInt4372 = class68_sub14.readUShort();
        ((ClientScript) class68_sub20_sub14).anInt4375 = class68_sub14.readUShort();
        ((ClientScript) class68_sub20_sub14).anInt4373 = class68_sub14.readUShort();
        int i_24_ = class68_sub14.readUByte();
        if (i_24_ > 0)
        {
            ((ClientScript) class68_sub20_sub14).aClass113Array4382 = new NodeCache[i_24_];
            for (int i_25_ = 0; i_24_ > i_25_; i_25_++)
            {
                int i_26_ = class68_sub14.readUShort();
                NodeCache class113 = new NodeCache(Class90.method1523(i_26_, -21189));
                ((ClientScript) class68_sub20_sub14).aClass113Array4382[i_25_] = class113;
                while (i_26_-- > 0)
                {
                    int i_27_ = class68_sub14.readInteger();
                    int i_28_ = class68_sub14.readInteger();
                    class113.method1683((byte) -89, new Class68_Sub10(i_28_), (long) i_27_);
                }
            }
        }
        int i_29_ = 0;
        ((Stream) class68_sub14).position = 0;
        ((ClientScript) class68_sub20_sub14).aClass100_4371 = class68_sub14.readStringSafe();
        ((ClientScript) class68_sub20_sub14).anIntArray4376 = new int[i_23_];
        ((ClientScript) class68_sub20_sub14).anIntArray4379 = new int[i_23_];
        ((ClientScript) class68_sub20_sub14).aClass100Array4377 = new MutableString[i_23_];
        while (((Stream) class68_sub14).position < i_22_)
        {
            int i_30_ = class68_sub14.readUShort();
            if (i_30_ != 3)
            {
                if (i_30_ >= 100 || i_30_ == 21 || i_30_ == 38 || i_30_ == 39)
                    ((ClientScript) class68_sub20_sub14).anIntArray4376[i_29_] = class68_sub14.readUByte();
                else
                    ((ClientScript) class68_sub20_sub14).anIntArray4376[i_29_] = class68_sub14.readInteger();
            } else
                ((ClientScript) class68_sub20_sub14).aClass100Array4377[i_29_] = class68_sub14.readString();
            ((ClientScript) class68_sub20_sub14).anIntArray4379[i_29_++] = i_30_;
        }
        Class68_Sub13_Sub16.aClass82_3704.method1471((long) i, (byte) -107, class68_sub20_sub14);
        return class68_sub20_sub14;
    }

    static final boolean method785(int i, MutableString class100)
    {
        try
        {
            anInt3717++;
            if (class100 == null)
                return false;
            if (i > -68)
                anIntArray3721 = null;
            for (int i_31_ = 0; Class32.friendCount > i_31_; i_31_++)
            {
                if (class100.method1606(false, (Class68_Sub13_Sub38.aClass100Array4086[i_31_])))
                    return true;
            }
            if (class100.method1606(false, (((Player) Class68_Sub7.localPlayer).name)))
                return true;
            return false;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ji.H(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }
}
