/* Class68_Sub13_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub36 extends Class68_Sub13
{
    static int anInt4032;
    private int[][] anIntArrayArray4033;
    private static MutableString aClass100_4034;
    static int anInt4035;
    static int anInt4036;
    static Class35 aClass35_4037;
    static int anInt4038;
    static int anInt4039 = -1;
    static int anInt4040;
    static int[] anIntArray4041;
    static Widget[][] widgetCache;
    static int anInt4043;
    static int anInt4044;
    private int[] anIntArray4045 = new int[257];
    static int[] anIntArray4046;
    static int anInt4047;
    static int anInt4048;
    static int anInt4049;
    static int anInt4050;
    static MutableString aClass100_4051;

    final void method690(byte i)
    {
        anInt4040++;
        if (i >= -22)
            method883(-65, 21, -105);
        if (anIntArrayArray4033 == null)
            method881(false, 1);
        method884(3);
    }

    final int[][] method697(int i, boolean bool)
    {
        if (bool != true)
            return null;
        anInt4047++;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -122);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[] is_0_ = this.method696(0, i, 29149);
            int[] is_1_ = is[0];
            int[] is_2_ = is[1];
            int[] is_3_ = is[2];
            for (int i_4_ = 0; i_4_ < Class68_Sub13_Sub19.anInt3748; i_4_++)
            {
                int i_5_ = is_0_[i_4_] >> 4;
                if (i_5_ < 0)
                    i_5_ = 0;
                if (i_5_ > 256)
                    i_5_ = 256;
                i_5_ = anIntArray4045[i_5_];
                is_1_[i_4_] = Class120.method1746(16711680, i_5_) >> 12;
                is_2_[i_4_] = Class120.method1746(4080, i_5_ >> 4);
                is_3_[i_4_] = Class120.method1746(i_5_ << 4, 4080);
            }
        }
        return is;
    }

    static final boolean method880(int i, int i_6_, Class21 class21, int i_7_)
    {
        try
        {
            anInt4032++;
            byte[] is = class21.method338(i_7_, i ^ i, i_6_);
            if (is == null)
                return false;
            Class68_Sub13_Sub24.method818(i + 43813, is);
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ve.B(" + i + ',' + i_6_ + ',' + (class21 != null ? "{...}" : "null") + ',' + i_7_ + ')'));
        }
    }

    private final void method881(boolean bool, int i)
    {
        if (bool != false)
            aClass35_4037 = null;
        anInt4044++;
        if (i != 0)
        {
            int i_8_ = i;
            while_174_: do
            {
                while_173_: do
                {
                    while_172_: do
                    {
                        while_171_: do
                        {
                            do
                            {
                                if (i_8_ != 1)
                                {
                                    if (i_8_ != 2)
                                    {
                                        if (i_8_ != 3)
                                        {
                                            if (i_8_ != 4)
                                            {
                                                if (i_8_ != 5)
                                                {
                                                    if (i_8_ != 6)
                                                        break while_174_;
                                                } else
                                                    break while_172_;
                                                break while_173_;
                                            }
                                        } else
                                            break;
                                        break while_171_;
                                    }
                                } else
                                {
                                    anIntArrayArray4033 = new int[2][4];
                                    anIntArrayArray4033[0][0] = 0;
                                    anIntArrayArray4033[0][2] = 0;
                                    anIntArrayArray4033[1][0] = 4096;
                                    anIntArrayArray4033[0][3] = 0;
                                    anIntArrayArray4033[1][3] = 4096;
                                    anIntArrayArray4033[1][2] = 4096;
                                    anIntArrayArray4033[0][1] = 0;
                                    anIntArrayArray4033[1][1] = 4096;
                                    return;
                                }
                                anIntArrayArray4033 = new int[8][4];
                                anIntArrayArray4033[0][3] = 2361;
                                anIntArrayArray4033[0][2] = 2602;
                                anIntArrayArray4033[0][0] = 0;
                                anIntArrayArray4033[0][1] = 2650;
                                anIntArrayArray4033[1][2] = 1799;
                                anIntArrayArray4033[1][0] = 2867;
                                anIntArrayArray4033[2][2] = 1734;
                                anIntArrayArray4033[3][2] = 1220;
                                anIntArrayArray4033[1][1] = 2313;
                                anIntArrayArray4033[1][3] = 1558;
                                anIntArrayArray4033[2][1] = 2618;
                                anIntArrayArray4033[4][2] = 963;
                                anIntArrayArray4033[3][1] = 2296;
                                anIntArrayArray4033[5][2] = 2152;
                                anIntArrayArray4033[6][2] = 1060;
                                anIntArrayArray4033[2][0] = 3072;
                                anIntArrayArray4033[2][3] = 1413;
                                anIntArrayArray4033[3][0] = 3276;
                                anIntArrayArray4033[7][2] = 1413;
                                anIntArrayArray4033[3][3] = 947;
                                anIntArrayArray4033[4][3] = 722;
                                anIntArrayArray4033[4][0] = 3481;
                                anIntArrayArray4033[4][1] = 2072;
                                anIntArrayArray4033[5][3] = 1766;
                                anIntArrayArray4033[6][3] = 915;
                                anIntArrayArray4033[5][0] = 3686;
                                anIntArrayArray4033[7][3] = 1140;
                                anIntArrayArray4033[5][1] = 2730;
                                anIntArrayArray4033[6][1] = 2232;
                                anIntArrayArray4033[6][0] = 3891;
                                anIntArrayArray4033[7][1] = 1686;
                                anIntArrayArray4033[7][0] = 4096;
                                return;
                            } while (false);
                            anIntArrayArray4033 = new int[7][4];
                            anIntArrayArray4033[0][2] = 0;
                            anIntArrayArray4033[1][2] = 4096;
                            anIntArrayArray4033[2][2] = 4096;
                            anIntArrayArray4033[0][1] = 0;
                            anIntArrayArray4033[0][0] = 0;
                            anIntArrayArray4033[1][1] = 0;
                            anIntArrayArray4033[0][3] = 4096;
                            anIntArrayArray4033[1][0] = 663;
                            anIntArrayArray4033[3][2] = 4096;
                            anIntArrayArray4033[4][2] = 0;
                            anIntArrayArray4033[5][2] = 0;
                            anIntArrayArray4033[2][1] = 0;
                            anIntArrayArray4033[2][0] = 1363;
                            anIntArrayArray4033[3][1] = 4096;
                            anIntArrayArray4033[3][0] = 2048;
                            anIntArrayArray4033[1][3] = 4096;
                            anIntArrayArray4033[6][2] = 0;
                            anIntArrayArray4033[4][0] = 2727;
                            anIntArrayArray4033[2][3] = 0;
                            anIntArrayArray4033[5][0] = 3411;
                            anIntArrayArray4033[4][1] = 4096;
                            anIntArrayArray4033[5][1] = 4096;
                            anIntArrayArray4033[3][3] = 0;
                            anIntArrayArray4033[6][0] = 4096;
                            anIntArrayArray4033[6][1] = 0;
                            anIntArrayArray4033[4][3] = 0;
                            anIntArrayArray4033[5][3] = 4096;
                            anIntArrayArray4033[6][3] = 4096;
                            return;
                        } while (false);
                        anIntArrayArray4033 = new int[6][4];
                        anIntArrayArray4033[0][3] = 0;
                        anIntArrayArray4033[1][3] = 1493;
                        anIntArrayArray4033[0][0] = 0;
                        anIntArrayArray4033[1][0] = 1843;
                        anIntArrayArray4033[2][3] = 2939;
                        anIntArrayArray4033[0][1] = 0;
                        anIntArrayArray4033[2][0] = 2457;
                        anIntArrayArray4033[3][0] = 2781;
                        anIntArrayArray4033[3][3] = 3565;
                        anIntArrayArray4033[4][3] = 4031;
                        anIntArrayArray4033[0][2] = 0;
                        anIntArrayArray4033[4][0] = 3481;
                        anIntArrayArray4033[5][3] = 4096;
                        anIntArrayArray4033[1][1] = 0;
                        anIntArrayArray4033[1][2] = 0;
                        anIntArrayArray4033[2][1] = 0;
                        anIntArrayArray4033[2][2] = 0;
                        anIntArrayArray4033[5][0] = 4096;
                        anIntArrayArray4033[3][2] = 1124;
                        anIntArrayArray4033[3][1] = 0;
                        anIntArrayArray4033[4][1] = 546;
                        anIntArrayArray4033[4][2] = 3084;
                        anIntArrayArray4033[5][1] = 4096;
                        anIntArrayArray4033[5][2] = 4096;
                        return;
                    } while (false);
                    anIntArrayArray4033 = new int[16][4];
                    anIntArrayArray4033[0][3] = 321;
                    anIntArrayArray4033[0][2] = 192;
                    anIntArrayArray4033[0][0] = 0;
                    anIntArrayArray4033[1][3] = 562;
                    anIntArrayArray4033[2][3] = 803;
                    anIntArrayArray4033[1][0] = 155;
                    anIntArrayArray4033[1][2] = 449;
                    anIntArrayArray4033[2][2] = 690;
                    anIntArrayArray4033[0][1] = 80;
                    anIntArrayArray4033[3][3] = 1140;
                    anIntArrayArray4033[1][1] = 321;
                    anIntArrayArray4033[2][1] = 578;
                    anIntArrayArray4033[3][1] = 947;
                    anIntArrayArray4033[3][2] = 995;
                    anIntArrayArray4033[2][0] = 389;
                    anIntArrayArray4033[4][3] = 1509;
                    anIntArrayArray4033[4][2] = 1397;
                    anIntArrayArray4033[3][0] = 671;
                    anIntArrayArray4033[4][0] = 897;
                    anIntArrayArray4033[5][3] = 1413;
                    anIntArrayArray4033[4][1] = 1285;
                    anIntArrayArray4033[5][2] = 1429;
                    anIntArrayArray4033[5][1] = 1525;
                    anIntArrayArray4033[5][0] = 1175;
                    anIntArrayArray4033[6][0] = 1368;
                    anIntArrayArray4033[7][0] = 1507;
                    anIntArrayArray4033[6][3] = 1333;
                    anIntArrayArray4033[8][0] = 1736;
                    anIntArrayArray4033[7][3] = 1702;
                    anIntArrayArray4033[6][2] = 1461;
                    anIntArrayArray4033[9][0] = 2088;
                    anIntArrayArray4033[6][1] = 1734;
                    anIntArrayArray4033[10][0] = 2355;
                    anIntArrayArray4033[7][2] = 1525;
                    anIntArrayArray4033[8][3] = 2056;
                    anIntArrayArray4033[9][3] = 2666;
                    anIntArrayArray4033[10][3] = 3276;
                    anIntArrayArray4033[7][1] = 1413;
                    anIntArrayArray4033[8][1] = 1108;
                    anIntArrayArray4033[9][1] = 1766;
                    anIntArrayArray4033[8][2] = 1590;
                    anIntArrayArray4033[11][3] = 3228;
                    anIntArrayArray4033[11][0] = 2691;
                    anIntArrayArray4033[12][3] = 3196;
                    anIntArrayArray4033[13][3] = 3019;
                    anIntArrayArray4033[12][0] = 3031;
                    anIntArrayArray4033[13][0] = 3522;
                    anIntArrayArray4033[14][0] = 3727;
                    anIntArrayArray4033[9][2] = 2056;
                    anIntArrayArray4033[10][2] = 2586;
                    anIntArrayArray4033[15][0] = 4096;
                    anIntArrayArray4033[14][3] = 3228;
                    anIntArrayArray4033[11][2] = 3148;
                    anIntArrayArray4033[12][2] = 3710;
                    anIntArrayArray4033[10][1] = 2409;
                    anIntArrayArray4033[11][1] = 3116;
                    anIntArrayArray4033[15][3] = 2746;
                    anIntArrayArray4033[13][2] = 3421;
                    anIntArrayArray4033[12][1] = 3806;
                    anIntArrayArray4033[14][2] = 3148;
                    anIntArrayArray4033[13][1] = 3437;
                    anIntArrayArray4033[14][1] = 3116;
                    anIntArrayArray4033[15][1] = 2377;
                    anIntArrayArray4033[15][2] = 2505;
                    return;
                } while (false);
                anIntArrayArray4033 = new int[4][4];
                anIntArrayArray4033[0][2] = 4096;
                anIntArrayArray4033[0][0] = 2048;
                anIntArrayArray4033[1][0] = 2867;
                anIntArrayArray4033[2][0] = 3276;
                anIntArrayArray4033[0][1] = 0;
                anIntArrayArray4033[1][2] = 4096;
                anIntArrayArray4033[0][3] = 0;
                anIntArrayArray4033[2][2] = 4096;
                anIntArrayArray4033[3][2] = 0;
                anIntArrayArray4033[1][1] = 4096;
                anIntArrayArray4033[1][3] = 0;
                anIntArrayArray4033[3][0] = 4096;
                anIntArrayArray4033[2][3] = 0;
                anIntArrayArray4033[3][3] = 0;
                anIntArrayArray4033[2][1] = 4096;
                anIntArrayArray4033[3][1] = 4096;
                return;
            } while (false);
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    public Class68_Sub13_Sub36()
    {
        super(1, false);
    }

    static final void method882(Class68_Sub2 class68_sub2, boolean bool)
    {
        try
        {
            anInt4043++;
            long l = 0L;
            int i = -1;
            if (((Class68_Sub2) class68_sub2).anInt2788 == 0)
                l = Class107.method1656((((Class68_Sub2) class68_sub2).anInt2791), (((Class68_Sub2) class68_sub2).anInt2793), (((Class68_Sub2) class68_sub2).anInt2786));
            if (((Class68_Sub2) class68_sub2).anInt2788 == 1)
                l = method883(((Class68_Sub2) class68_sub2).anInt2791, ((Class68_Sub2) class68_sub2).anInt2793, ((Class68_Sub2) class68_sub2).anInt2786);
            if (bool == true)
            {
                int i_9_ = 0;
                int i_10_ = 0;
                if (((Class68_Sub2) class68_sub2).anInt2788 == 2)
                    l = (Class68_Sub13_Sub9.method738(((Class68_Sub2) class68_sub2).anInt2791, ((Class68_Sub2) class68_sub2).anInt2793, ((Class68_Sub2) class68_sub2).anInt2786));
                if (((Class68_Sub2) class68_sub2).anInt2788 == 3)
                    l = Class89.method1512((((Class68_Sub2) class68_sub2).anInt2791), (((Class68_Sub2) class68_sub2).anInt2793), (((Class68_Sub2) class68_sub2).anInt2786));
                if (l != 0L)
                {
                    i_10_ = 0x3 & (int) l >> 20;
                    i_9_ = (0x7ec4a & (int) l) >> 14;
                    i = (int) (l >>> 32) & 0x7fffffff;
                }
                ((Class68_Sub2) class68_sub2).anInt2790 = i;
                ((Class68_Sub2) class68_sub2).anInt2785 = i_9_;
                ((Class68_Sub2) class68_sub2).anInt2795 = i_10_;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ve.J(" + (class68_sub2 != null ? "{...}" : "null") + ',' + bool + ')');
        }
    }

    static final long method883(int i, int i_11_, int i_12_)
    {
        Ground class68_sub1 = Class22.groundArray[i][i_11_][i_12_];
        if (class68_sub1 == null || ((Ground) class68_sub1).object_2 == null)
            return 0L;
        return (((Object2) ((Ground) class68_sub1).object_2).uid);
    }

    private final void method884(int i)
    {
        anInt4038++;
        if (i != 3)
            anIntArray4045 = null;
        int i_13_ = anIntArrayArray4033.length;
        if (i_13_ > 0)
        {
            for (int i_14_ = 0; i_14_ < 257; i_14_++)
            {
                int i_15_ = 0;
                int i_16_ = i_14_ << 4;
                for (int i_17_ = 0; i_17_ < i_13_; i_17_++)
                {
                    if (anIntArrayArray4033[i_17_][0] > i_16_)
                        break;
                    i_15_++;
                }
                int i_18_;
                int i_19_;
                int i_20_;
                if (i_13_ > i_15_)
                {
                    int[] is = anIntArrayArray4033[i_15_];
                    if (i_15_ <= 0)
                    {
                        i_20_ = is[3];
                        i_18_ = is[2];
                        i_19_ = is[1];
                    } else
                    {
                        int[] is_21_ = anIntArrayArray4033[i_15_ - 1];
                        int i_22_ = (i_16_ - is_21_[0] << 12) / (is[0] - is_21_[0]);
                        int i_23_ = 4096 - i_22_;
                        i_18_ = is_21_[2] * i_23_ + is[2] * i_22_ >> 12;
                        i_19_ = i_23_ * is_21_[1] + i_22_ * is[1] >> 12;
                        i_20_ = i_22_ * is[3] + is_21_[3] * i_23_ >> 12;
                    }
                } else
                {
                    int[] is = anIntArrayArray4033[i_13_ - 1];
                    i_18_ = is[2];
                    i_19_ = is[1];
                    i_20_ = is[3];
                }
                i_20_ >>= 4;
                i_19_ >>= 4;
                if (i_19_ < 0)
                    i_19_ = 0;
                else if (i_19_ > 255)
                    i_19_ = 255;
                i_18_ >>= 4;
                if (i_18_ >= 0)
                {
                    if (i_18_ > 255)
                        i_18_ = 255;
                } else
                    i_18_ = 0;
                if (i_20_ >= 0)
                {
                    if (i_20_ > 255)
                        i_20_ = 255;
                } else
                    i_20_ = 0;
                anIntArray4045[i_14_] = Class70.OR(Class70.OR(i_18_ << 8, i_19_ << 16), i_20_);
            }
        }
    }

    static final void method885(byte i, MutableString class100)
    {
        try
        {
            anInt4036++;
            if (i == -62 && Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632 != null)
            {
                int i_24_ = 0;
                long l = class100.method1615(10908);
                if (l != 0L)
                {
                    for (/**/; ((Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632).length > i_24_); i_24_++)
                    {
                        if (l == (((Node) (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_24_])).nodeID))
                            break;
                    }
                    if (i_24_ < (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632).length && (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_24_]) != null)
                    {
                        Class21.connectionVector.startPacket(200);
                        Class75_Sub2.anInt3318++;
                        Class21.connectionVector.writeLong(((Node) (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4632[i_24_])).nodeID);
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ve.H(" + i + ',' + (class100 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method886(int i)
    {
        if (i != 0)
            method883(-69, -77, -25);
        aClass35_4037 = null;
        aClass100_4034 = null;
        anIntArray4041 = null;
        aClass100_4051 = null;
        anIntArray4046 = null;
        widgetCache = null;
    }

    static final void method887(int i, int i_25_, boolean bool, int i_26_)
    {
        anInt4049++;
        int i_27_ = -66 % ((i_26_ + 73) / 51);
        if (i < 8000 || i > 48000)
            throw new IllegalArgumentException();
        Class7.aBoolean132 = bool;
        Class32.anInt560 = i_25_;
        Class93.anInt1662 = i;
    }

    final void method700(Stream class68_sub14, int i, int i_28_)
    {
        try
        {
            if (i_28_ == -1)
            {
                if (i == 0)
                {
                    int i_29_ = class68_sub14.readUByte();
                    if (i_29_ == 0)
                    {
                        anIntArrayArray4033 = (new int[class68_sub14.readUByte()][4]);
                        for (int i_30_ = 0; anIntArrayArray4033.length > i_30_; i_30_++)
                        {
                            anIntArrayArray4033[i_30_][0] = class68_sub14.readUShort();
                            anIntArrayArray4033[i_30_][1] = class68_sub14.readUByte() << 4;
                            anIntArrayArray4033[i_30_][2] = class68_sub14.readUByte() << 4;
                            anIntArrayArray4033[i_30_][3] = class68_sub14.readUByte() << 4;
                        }
                    } else
                        method881(false, i_29_);
                }
                anInt4048++;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ve.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_28_ + ')'));
        }
    }

    static
    {
        aClass100_4034 = Class112.makeMutableString(43, "Starting 3d library");
        anInt4035 = 0;
        anIntArray4046 = new int[32];
        aClass100_4051 = aClass100_4034;
        anIntArray4041 = new int[4096];
        for (int i = 0; i < 4096; i++)
            anIntArray4041[i] = Class68_Sub13_Sub20.method798(26151, i);
    }
}
