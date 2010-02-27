/* Class68_Sub20_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub6 extends NodeSub
{
    static int[] anIntArray4232;
    static int anInt4233;
    static MutableString aClass100_4234 = Class112.makeMutableString(43, " )2> ");
    static int anInt4235;
    private boolean aBoolean4236;
    static int anInt4237;
    static MutableString aClass100_4238 = Class112.makeMutableString(43, " ");
    static int anInt4239;
    static int anInt4240;
    private boolean aBoolean4241;
    static int anInt4242 = 0;
    static int anInt4243;
    private Class3 aClass3_4244;
    private int[] anIntArray4245;
    private float aFloat4246;
    private int anInt4247;
    static int[][] mapData;
    boolean aBoolean4249 = false;
    static int anInt4250;
    private int anInt4251;
    static int anInt4252;
    static int anInt4253;

    static final boolean method1064(int i, int i_0_)
    {
        if (i_0_ != -207106658)
            method1066((byte) 70, null);
        anInt4235++;
        if ((0x7ecfbac6 & i) >> 30 == 0)
            return false;
        return true;
    }

    final int[] method1065(Interface4 interface4, int i, Class21 class21, boolean bool)
    {
        try
        {
            anInt4252++;
            if (!aClass3_4244.method180(interface4, 0, class21))
                return null;
            if (i > -30)
                method1070(-97, -107);
            int i_1_ = !bool ? 128 : 64;
            return aClass3_4244.method178(aBoolean4241, false, class21, interface4, i_1_, i_1_, 1.0, 2000);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("fe.H(" + (interface4 != null ? "{...}" : "null") + ',' + i + ',' + (class21 != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    static final Widget method1066(byte i, Widget class45)
    {
        try
        {
            anInt4253++;
            if (((Widget) class45).anInt799 != -1)
                return Class68_Sub20_Sub15.method1170((((Widget) class45).anInt799), (byte) -80);
            int i_2_ = ((Widget) class45).anInt792 >>> 16;
            if (i < 121)
                aClass100_4238 = null;
            for (Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1514.method1685(-32642)); class68_sub3 != null; class68_sub3 = (Class68_Sub3) Login.aClass113_1514.method1689((byte) -125))
            {
                if (i_2_ == ((Class68_Sub3) class68_sub3).anInt2805)
                    return Class68_Sub20_Sub15.method1170((int) (((Node) class68_sub3).nodeID), (byte) -80);
            }
            return null;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("fe.F(" + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void parseLocalPlayerUpdateHeader()
    {
        Class68_Sub13_Sub8.connectionVector.bitAccess();
        int has_update = Class68_Sub13_Sub8.connectionVector.readBits(1);
        if (has_update != 0)
        {
            int update_type = Class68_Sub13_Sub8.connectionVector.readBits(2);
            if (update_type == 0)
                CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = 2047;
            else if (update_type == 1)
            {
                int dir = Class68_Sub13_Sub8.connectionVector.readBits(3);
                Class68_Sub7.localPlayer.moveInDirection(false, dir);
                int has_ublock = Class68_Sub13_Sub8.connectionVector.readBits(1);
                if (has_ublock == 1)
                    CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = 2047;
            } else if (update_type == 2)
            {
                int dir = Class68_Sub13_Sub8.connectionVector.readBits(3);
                Class68_Sub7.localPlayer.moveInDirection(true, dir);
                dir = Class68_Sub13_Sub8.connectionVector.readBits(3);
                Class68_Sub7.localPlayer.moveInDirection(true, dir);
                int has_ublock = Class68_Sub13_Sub8.connectionVector.readBits(1);
                if (has_ublock == 1)
                    CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = 2047;
            } else if (update_type == 3)
            {
                int x = Class68_Sub13_Sub8.connectionVector.readBits(7);
                int teleported = Class68_Sub13_Sub8.connectionVector.readBits(1);
                GameSocket.plane = Class68_Sub13_Sub8.connectionVector.readBits(2);
                int has_ublock = Class68_Sub13_Sub8.connectionVector.readBits(1);
                if (has_ublock == 1)
                    CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = 2047;
                int y = Class68_Sub13_Sub8.connectionVector.readBits(7);
                Class68_Sub7.localPlayer.setPosition(y, x, teleported == 1);
            }
        }
    }

    protected final void finalize() throws Throwable
    {
        super.finalize();
        anInt4250++;
    }

    final boolean method1068(Interface4 interface4, int i, Class21 class21)
    {
        try
        {
            anInt4240++;
            if (i != -5947)
                method1072((byte) -13, null, null, -0.6478323F, true);
            return aClass3_4244.method180(interface4, 0, class21);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("fe.E(" + (interface4 != null ? "{...}" : "null") + ',' + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1069(int i)
    {
        aClass100_4238 = null;
        if (i <= -63)
        {
            anIntArray4232 = null;
            mapData = null;
            aClass100_4234 = null;
        }
    }

    final void method1070(int i, int i_14_)
    {
        anInt4233++;
        if (i_14_ != -27276)
            aClass100_4238 = null;
        if (anIntArray4245 != null)
        {
            if (anInt4247 != 0 || anInt4251 != 0)
            {
                if (Class68_Sub28_Sub2.anIntArray4548 == null || (Class68_Sub28_Sub2.anIntArray4548.length < anIntArray4245.length))
                    Class68_Sub28_Sub2.anIntArray4548 = new int[anIntArray4245.length];
                int i_15_ = anIntArray4245.length != 4096 ? 128 : 64;
                int i_16_ = anIntArray4245.length;
                int i_17_ = anInt4251 * i;
                int i_18_ = i_15_ - 1;
                int i_19_ = i_15_ * (i * anInt4247);
                int i_20_ = i_16_ - 1;
                for (int i_21_ = 0; i_16_ > i_21_; i_21_ += i_15_)
                {
                    int i_22_ = i_21_ + i_19_ & i_20_;
                    for (int i_23_ = 0; i_23_ < i_15_; i_23_++)
                    {
                        int i_24_ = i_21_ + i_23_;
                        int i_25_ = (i_18_ & i_17_ + i_23_) + i_22_;
                        Class68_Sub28_Sub2.anIntArray4548[i_24_] = anIntArray4245[i_25_];
                    }
                }
                int[] is = anIntArray4245;
                anIntArray4245 = Class68_Sub28_Sub2.anIntArray4548;
                Class68_Sub28_Sub2.anIntArray4548 = is;
            }
        }
    }

    static final void method1071(byte i)
    {
        RandomNumberGenerator.aLong1482 = 0L;
        anInt4239++;
        if (i != -118)
            aClass100_4234 = null;
    }

    final int[] method1072(byte i, Class21 class21, Interface4 interface4, float f, boolean bool)
    {
        try
        {
            anInt4237++;
            if (anIntArray4245 == null || f != aFloat4246)
            {
                if (!aClass3_4244.method180(interface4, 0, class21))
                    return null;
                int i_26_ = bool ? 64 : 128;
                anIntArray4245 = aClass3_4244.method178(aBoolean4241, true, class21, interface4, i_26_, i_26_, (double) f, 2000);
                aFloat4246 = f;
                if (aBoolean4236)
                {
                    int[] is = new int[i_26_];
                    int[] is_27_ = new int[i_26_];
                    int[] is_28_ = new int[i_26_];
                    int i_29_ = i_26_;
                    int i_31_;
                    int i_30_ = i_31_ = i_29_;
                    int[] is_32_ = new int[i_26_ * i_26_];
                    int i_33_ = i_29_ - 1;
                    int i_34_ = i_26_;
                    int i_35_ = i_34_ - 1;
                    int i_36_ = i_29_ * i_34_;
                    for (int i_37_ = 2; i_37_ >= 0; i_37_--)
                    {
                        for (int i_38_ = i_33_; i_38_ >= 0; i_38_--)
                        {
                            int i_39_ = anIntArray4245[--i_31_];
                            is_27_[i_38_] += Class120.method1746(255, i_39_ >> 16);
                            is[i_38_] += Class120.method1746(255, i_39_ >> 8);
                            is_28_[i_38_] += Class120.method1746(255, i_39_);
                        }
                        if (i_31_ == 0)
                            i_31_ = i_36_;
                    }
                    int i_40_ = i_36_;
                    for (int i_41_ = i_35_; i_41_ >= 0; i_41_--)
                    {
                        int i_43_;
                        int i_44_;
                        int i_42_ = i_43_ = i_44_ = 0;
                        int i_45_ = 1;
                        int i_46_ = 1;
                        for (int i_47_ = 2; i_47_ >= 0; i_47_--)
                        {
                            i_45_--;
                            i_42_ += is_27_[i_45_];
                            i_43_ += is_28_[i_45_];
                            i_44_ += is[i_45_];
                            if (i_45_ == 0)
                                i_45_ = i_29_;
                        }
                        for (int i_48_ = i_33_; i_48_ >= 0; i_48_--)
                        {
                            i_46_--;
                            int i_49_ = i_43_ / 9;
                            int i_50_ = i_42_ / 9;
                            int i_51_ = i_44_ / 9;
                            is_32_[--i_40_] = (Class70.OR(Class70.OR(i_50_ << 16, i_51_ << 8), i_49_));
                            i_45_--;
                            i_43_ += is_28_[i_45_] - is_28_[i_46_];
                            i_42_ += is_27_[i_45_] - is_27_[i_46_];
                            i_44_ += is[i_45_] - is[i_46_];
                            if (i_46_ == 0)
                                i_46_ = i_29_;
                            if (i_45_ == 0)
                                i_45_ = i_29_;
                        }
                        for (int i_52_ = i_33_; i_52_ >= 0; i_52_--)
                        {
                            int i_53_ = anIntArray4245[--i_31_];
                            int i_54_ = anIntArray4245[--i_30_];
                            is_27_[i_52_] += ((Class120.method1746(i_53_, 16759453) >> 16) - Class120.method1746(255, i_54_ >> 16));
                            is[i_52_] += ((Class120.method1746(i_53_, 65471) >> 8) - (Class120.method1746(65376, i_54_) >> 8));
                            is_28_[i_52_] += (Class120.method1746(255, i_53_) - Class120.method1746(255, i_54_));
                        }
                        if (i_31_ == 0)
                            i_31_ = i_36_;
                        if (i_30_ == 0)
                            i_30_ = i_36_;
                    }
                    anIntArray4245 = is_32_;
                }
            }
            int i_55_ = 120 / ((i - 49) / 61);
            return anIntArray4245;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("fe.C(" + i + ',' + (class21 != null ? "{...}" : "null") + ',' + (interface4 != null ? "{...}" : "null") + ',' + f + ',' + bool + ')'));
        }
    }

    Class68_Sub20_Sub6(Stream class68_sub14)
    {
        try
        {
            aClass3_4244 = new Class3(class68_sub14);
            aBoolean4236 = class68_sub14.readUByte() == 1;
            aBoolean4241 = class68_sub14.readUByte() == 1;
            class68_sub14.readUByte();
            class68_sub14.readUByte();
            int i = 0x3 & class68_sub14.readUByte();
            anInt4251 = class68_sub14.readByte();
            anInt4247 = class68_sub14.readByte();
            class68_sub14.readUByte();
            class68_sub14.readUByte();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "fe.<init>(" + (class68_sub14 != null ? "{...}" : "null") + ')');
        }
    }
}
