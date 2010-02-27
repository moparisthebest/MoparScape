/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class103
{
    static int anInt1761;
    static int anInt1762;
    private int[] anIntArray1763;
    static volatile boolean hasFocus;
    static Widget[] aClass45Array1765;
    private byte[] aByteArray1766;
    private int[] anIntArray1767;
    static int anInt1768;
    static int[] settingArray = new int[2000];
    static int anInt1770;
    static MutableString aClass100_1771 = Class112.makeMutableString(43, "<col=c0ff00>");
    static int anInt1772;
    static MutableString aClass100_1773;
    static int anInt1774;
    static int port;
    static int anInt1776;

    final int method1638(int i, byte[] is, byte[] is_0_, int i_1_, int i_2_, int i_3_)
    {
        try
        {
            if (i_1_ != -2147483648)
                anInt1770 = -125;
            i += i_3_;
            anInt1762++;
            int i_4_ = 0;
            int i_5_ = i_2_ << 3;
            for (/**/; i > i_3_; i_3_++)
            {
                int i_6_ = 0xff & is_0_[i_3_];
                int i_7_ = anIntArray1763[i_6_];
                int i_8_ = aByteArray1766[i_6_];
                if (i_8_ == 0)
                    throw new RuntimeException("No codeword for data value " + i_6_);
                int i_9_ = i_5_ & 0x7;
                i_4_ &= -i_9_ >> 31;
                int i_10_ = i_5_ >> 3;
                i_5_ += i_8_;
                int i_11_ = i_10_ + (i_9_ + i_8_ - 1 >> 3);
                i_9_ += 24;
                is[i_10_] = (byte) (i_4_ = Class70.OR(i_4_, i_7_ >>> i_9_));
                if (i_10_ < i_11_)
                {
                    i_10_++;
                    i_9_ -= 8;
                    is[i_10_] = (byte) (i_4_ = i_7_ >>> i_9_);
                    if (i_10_ < i_11_)
                    {
                        i_9_ -= 8;
                        i_10_++;
                        is[i_10_] = (byte) (i_4_ = i_7_ >>> i_9_);
                        if (i_11_ > i_10_)
                        {
                            i_9_ -= 8;
                            i_10_++;
                            is[i_10_] = (byte) (i_4_ = i_7_ >>> i_9_);
                            if (i_10_ < i_11_)
                            {
                                i_9_ -= 8;
                                i_10_++;
                                is[i_10_] = (byte) (i_4_ = i_7_ << -i_9_);
                            }
                        }
                    }
                }
            }
            return (i_5_ + 7 >> 3) - i_2_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("sb.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (is_0_ != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
        }
    }

    static final void method1639(int i, int i_12_, int i_13_, byte i_14_, NPCDefinition class80)
    {
        try
        {
            anInt1776++;
            if (Class68_Sub13_Sub21.menuOptionsCount < 400)
            {
                if (((NPCDefinition) class80).anIntArray1433 != null)
                    class80 = class80.method1453(-94);
                if (class80 != null && ((NPCDefinition) class80).aBoolean1435)
                {
                    MutableString class100 = ((NPCDefinition) class80).name;
                    int i_15_ = 3 / ((50 - i_14_) / 35);
                    if (((NPCDefinition) class80).anInt1446 != 0)
                        class100 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100, (Class68_Sub20_Sub8.method1089(((NPCDefinition) class80).anInt1446, true, (((Player) Class68_Sub7.localPlayer).combatLevel))), Class68_Sub19.aClass100_3068, Class58.aClass100_1095, Class68_Sub13_Sub24.method816((((NPCDefinition) class80).anInt1446), 0), Class68_Sub26.aClass100_3197 })));
                    if (Class68_Sub13_Sub37.anInt4064 == 1)
                    {
                        Class68_Sub3.method652(i_13_, i_12_, (byte) -102, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class44.aClass100_743, GameSocket.aClass100_1146, class100 }))), (short) 15, Object2.aClass100_1347, (long) i);
                        Class111.anInt1870++;
                    } else if (Class21_Sub1.aBoolean2707)
                    {
                        if ((Class33.anInt589 & 0x2) == 2)
                        {
                            Class75_Sub1_Sub1.anInt4586++;
                            Class68_Sub3.method652(i_13_, i_12_, (byte) -70, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub1.aClass100_3454, GameSocket.aClass100_1146, class100 }))), (short) 44, Class7.aClass100_118, (long) i);
                        }
                    } else
                    {
                        Ground.anInt2764++;
                        MutableString[] class100s = ((NPCDefinition) class80).actions;
                        if (Class92.aBoolean1651)
                            class100s = Class75_Sub1.method1387((byte) -117, class100s);
                        if (class100s != null)
                        {
                            for (int i_16_ = 4; i_16_ >= 0; i_16_--)
                            {
                                if (class100s[i_16_] != null && (Class68_Sub13_Sub34.game != 0 || !(class100s[i_16_].method1606(false, Class29.aClass100_535))))
                                {
                                    Item.anInt2439++;
                                    short i_17_ = 0;
                                    if (i_16_ == 0)
                                        i_17_ = (short) 12;
                                    if (i_16_ == 1)
                                        i_17_ = (short) 29;
                                    if (i_16_ == 2)
                                        i_17_ = (short) 48;
                                    if (i_16_ == 3)
                                        i_17_ = (short) 21;
                                    if (i_16_ == 4)
                                        i_17_ = (short) 11;
                                    Class68_Sub3.method652(i_13_, i_12_, (byte) -91, (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { (CipheredByteVector.aClass100_4123), class100 })), i_17_, class100s[i_16_], (long) i);
                                }
                            }
                        }
                        if (Class68_Sub13_Sub34.game == 0 && class100s != null)
                        {
                            for (int i_18_ = 4; i_18_ >= 0; i_18_--)
                            {
                                if (class100s[i_18_] != null && (class100s[i_18_].method1606(false, Class29.aClass100_535)))
                                {
                                    short i_19_ = 0;
                                    Class95.anInt1683++;
                                    short i_20_ = 0;
                                    if (i_18_ == 0)
                                        i_20_ = (short) 12;
                                    if (((NPCDefinition) class80).anInt1446 > (((Player) (Class68_Sub7.localPlayer)).combatLevel))
                                        i_19_ = (short) 2000;
                                    if (i_18_ == 1)
                                        i_20_ = (short) 29;
                                    if (i_18_ == 2)
                                        i_20_ = (short) 48;
                                    if (i_18_ == 3)
                                        i_20_ = (short) 21;
                                    if (i_18_ == 4)
                                        i_20_ = (short) 11;
                                    if (i_20_ != 0)
                                        i_20_ += i_19_;
                                    Class68_Sub3.method652(i_13_, i_12_, (byte) -86, (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { (CipheredByteVector.aClass100_4123), class100 })), i_20_, class100s[i_18_], (long) i);
                                }
                            }
                        }
                        Class68_Sub3.method652(i_13_, i_12_, (byte) -126, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (CipheredByteVector.aClass100_4123), class100 }))), (short) 1002, Class119.aClass100_2088, (long) i);
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("sb.E(" + i + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + (class80 != null ? "{...}" : "null") + ')'));
        }
    }

    static final boolean method1640(Class21 class21, int i)
    {
        try
        {
            if (i != -1)
                method1642(11);
            anInt1772++;
            if (class21.method360(Class68_Sub20_Sub15.anInt4404, 0))
                return true;
            return false;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "sb.D(" + (class21 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final int method1641(byte[] is, int i, int i_21_, int i_22_, int i_23_, byte[] is_24_)
    {
        try
        {
            anInt1768++;
            if (i_22_ == 0)
                return 0;
            i_22_ += i_23_;
            int i_25_ = 0;
            if (i != 8)
                method1641(null, -18, 64, 32, 16, null);
            int i_26_ = i_21_;
            for (;;)
            {
                byte i_27_ = is_24_[i_26_];
                if (i_27_ < 0)
                    i_25_ = anIntArray1767[i_25_];
                else
                    i_25_++;
                int i_28_;
                if ((i_28_ = anIntArray1767[i_25_]) < 0)
                {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_22_ <= i_23_)
                        break;
                    i_25_ = 0;
                }
                if ((i_27_ & 0x40) != 0)
                    i_25_ = anIntArray1767[i_25_];
                else
                    i_25_++;
                if ((i_28_ = anIntArray1767[i_25_]) < 0)
                {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_22_ <= i_23_)
                        break;
                    i_25_ = 0;
                }
                if ((0x20 & i_27_) == 0)
                    i_25_++;
                else
                    i_25_ = anIntArray1767[i_25_];
                if ((i_28_ = anIntArray1767[i_25_]) < 0)
                {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_23_ >= i_22_)
                        break;
                    i_25_ = 0;
                }
                if ((0x10 & i_27_) != 0)
                    i_25_ = anIntArray1767[i_25_];
                else
                    i_25_++;
                if ((i_28_ = anIntArray1767[i_25_]) < 0)
                {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_22_ <= i_23_)
                        break;
                    i_25_ = 0;
                }
                if ((i_27_ & 0x8) != 0)
                    i_25_ = anIntArray1767[i_25_];
                else
                    i_25_++;
                if ((i_28_ = anIntArray1767[i_25_]) < 0)
                {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_23_ >= i_22_)
                        break;
                    i_25_ = 0;
                }
                if ((i_27_ & 0x4) == 0)
                    i_25_++;
                else
                    i_25_ = anIntArray1767[i_25_];
                if ((i_28_ = anIntArray1767[i_25_]) < 0)
                {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_23_ >= i_22_)
                        break;
                    i_25_ = 0;
                }
                if ((0x2 & i_27_) != 0)
                    i_25_ = anIntArray1767[i_25_];
                else
                    i_25_++;
                if ((i_28_ = anIntArray1767[i_25_]) < 0)
                {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_22_ <= i_23_)
                        break;
                    i_25_ = 0;
                }
                if ((i_27_ & 0x1) != 0)
                    i_25_ = anIntArray1767[i_25_];
                else
                    i_25_++;
                if ((i_28_ = anIntArray1767[i_25_]) < 0)
                {
                    is[i_23_++] = (byte) (i_28_ ^ 0xffffffff);
                    if (i_23_ >= i_22_)
                        break;
                    i_25_ = 0;
                }
                i_26_++;
            }
            return i_26_ + 1 - i_21_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("sb.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + (is_24_ != null ? "{...}" : "null") + ')'));
        }
    }

    Class103(byte[] is)
    {
        try
        {
            int[] is_29_ = new int[33];
            int i = 0;
            int i_30_ = is.length;
            aByteArray1766 = is;
            anIntArray1767 = new int[8];
            anIntArray1763 = new int[i_30_];
            for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
            {
                int i_32_ = is[i_31_];
                if (i_32_ != 0)
                {
                    int i_33_ = 1 << 32 - i_32_;
                    int i_34_ = is_29_[i_32_];
                    anIntArray1763[i_31_] = i_34_;
                    int i_35_;
                    if ((i_34_ & i_33_) != 0)
                        i_35_ = is_29_[i_32_ - 1];
                    else
                    {
                        for (int i_36_ = i_32_ - 1; i_36_ >= 1; i_36_--)
                        {
                            int i_37_ = is_29_[i_36_];
                            if (i_34_ != i_37_)
                                break;
                            int i_38_ = 1 << 32 - i_36_;
                            if ((i_37_ & i_38_) == 0)
                                is_29_[i_36_] = Class70.OR(i_37_, i_38_);
                            else
                            {
                                is_29_[i_36_] = is_29_[i_36_ - 1];
                                break;
                            }
                        }
                        i_35_ = i_34_ | i_33_;
                    }
                    is_29_[i_32_] = i_35_;
                    for (int i_39_ = i_32_ + 1; i_39_ <= 32; i_39_++)
                    {
                        if (i_34_ == is_29_[i_39_])
                            is_29_[i_39_] = i_35_;
                    }
                    int i_40_ = 0;
                    for (int i_41_ = 0; i_32_ > i_41_; i_41_++)
                    {
                        int i_42_ = -2147483648 >>> i_41_;
                        if ((i_42_ & i_34_) != 0)
                        {
                            if (anIntArray1767[i_40_] == 0)
                                anIntArray1767[i_40_] = i;
                            i_40_ = anIntArray1767[i_40_];
                        } else
                            i_40_++;
                        if (i_40_ >= anIntArray1767.length)
                        {
                            int[] is_43_ = new int[2 * anIntArray1767.length];
                            for (int i_44_ = 0; i_44_ < anIntArray1767.length; i_44_++)
                                is_43_[i_44_] = anIntArray1767[i_44_];
                            anIntArray1767 = is_43_;
                        }
                        i_42_ >>>= 1;
                    }
                    anIntArray1767[i_40_] = i_31_ ^ 0xffffffff;
                    if (i <= i_40_)
                        i = i_40_ + 1;
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "sb.<init>(" + (is != null ? "{...}" : "null") + ')');
        }
    }

    public static void method1642(int i)
    {
        settingArray = null;
        aClass100_1773 = null;
        int i_45_ = -70 / ((i + 71) / 48);
        aClass100_1771 = null;
        aClass45Array1765 = null;
    }

    static
    {
        hasFocus = true;
        aClass100_1773 = Class112.makeMutableString(43, "showVideoAd");
    }
}
