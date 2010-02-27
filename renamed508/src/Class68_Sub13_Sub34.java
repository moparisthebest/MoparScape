/* Class68_Sub13_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub34 extends Class68_Sub13
{
    static int anInt4004;
    static int anInt4005;
    static MutableString aClass100_4006 = Class112.makeMutableString(43, "::fpsoff");
    static int anInt4007;
    static int anInt4008;
    static int anInt4009;
    static int game = 0;
    static int anInt4011;
    static int anInt4012;
    static int anInt4013;
    static int[] anIntArray4014;
    static int anInt4015 = -2;
    static MutableString aClass100_4016;
    static int anInt4017;

    static final boolean method869(int i, byte i_0_)
    {
        anInt4005++;
        if (i < 32)
            return false;
        if (i == 127)
            return false;
        if (i_0_ > -34)
            game = 46;
        if (i >= 129 && i <= 159)
            return false;
        return true;
    }

    static final void method870(int i)
    {
        for (Class68_Sub18 class68_sub18 = (Class68_Sub18) Class8.aClass16_140.method293((byte) 76); class68_sub18 != null; class68_sub18 = (Class68_Sub18) Class8.aClass16_140.method290((byte) 58))
        {
            if (((Class68_Sub18) class68_sub18).aBoolean3063)
                class68_sub18.method993(31506);
        }
        if (i != 2)
            method874(-53);
        for (Class68_Sub18 class68_sub18 = (Class68_Sub18) Class51.aClass16_2253.method293((byte) 76); class68_sub18 != null; class68_sub18 = ((Class68_Sub18) Class51.aClass16_2253.method290((byte) 60)))
        {
            if (((Class68_Sub18) class68_sub18).aBoolean3063)
                class68_sub18.method993(i + 31504);
        }
        anInt4011++;
    }

    static final int method871(int i, int i_1_)
    {
        i_1_ = i_1_ * (i & 0x7f) >> 7;
        if (i_1_ < 2)
            i_1_ = 2;
        else if (i_1_ > 126)
            i_1_ = 126;
        return (i & 0xff80) + i_1_;
    }

    final int[] method698(byte i, int i_2_)
    {
        if (i != -61)
            return null;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_2_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int[] is_3_ = this.method696(0, i_2_, 29149);
            int[] is_4_ = this.method696(1, i_2_, 29149);
            int[] is_5_ = this.method696(2, i_2_, 29149);
            for (int i_6_ = 0; i_6_ < Class68_Sub13_Sub19.anInt3748; i_6_++)
            {
                int i_7_ = is_5_[i_6_];
                if (i_7_ == 4096)
                    is[i_6_] = is_3_[i_6_];
                else if (i_7_ != 0)
                    is[i_6_] = (is_4_[i_6_] * (4096 - i_7_) + i_7_ * is_3_[i_6_] >> 12);
                else
                    is[i_6_] = is_4_[i_6_];
            }
        }
        anInt4009++;
        return is;
    }

    final int[][] method697(int i, boolean bool)
    {
        if (bool != true)
            method697(-2, true);
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) -118);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[] is_8_ = this.method696(2, i, 29149);
            int[][] is_9_ = this.method699(-67, 0, i);
            int[][] is_10_ = this.method699(-114, 1, i);
            int[] is_11_ = is[2];
            int[] is_12_ = is[0];
            int[] is_13_ = is[1];
            int[] is_14_ = is_9_[0];
            int[] is_15_ = is_9_[1];
            int[] is_16_ = is_9_[2];
            int[] is_17_ = is_10_[0];
            int[] is_18_ = is_10_[1];
            int[] is_19_ = is_10_[2];
            for (int i_20_ = 0; Class68_Sub13_Sub19.anInt3748 > i_20_; i_20_++)
            {
                int i_21_ = is_8_[i_20_];
                if (i_21_ != 4096)
                {
                    if (i_21_ == 0)
                    {
                        is_12_[i_20_] = is_17_[i_20_];
                        is_13_[i_20_] = is_18_[i_20_];
                        is_11_[i_20_] = is_19_[i_20_];
                    } else
                    {
                        int i_22_ = 4096 - i_21_;
                        is_12_[i_20_] = (is_17_[i_20_] * i_22_ + i_21_ * is_14_[i_20_] >> 12);
                        is_13_[i_20_] = (is_18_[i_20_] * i_22_ + is_15_[i_20_] * i_21_ >> 12);
                        is_11_[i_20_] = (i_21_ * is_16_[i_20_] + i_22_ * is_19_[i_20_] >> 12);
                    }
                } else
                {
                    is_12_[i_20_] = is_14_[i_20_];
                    is_13_[i_20_] = is_15_[i_20_];
                    is_11_[i_20_] = is_16_[i_20_];
                }
            }
        }
        anInt4017++;
        return is;
    }

    static final boolean method872(int i)
    {
        anInt4007++;
        if (i != 0)
            anIntArray4014 = null;
        try
        {
            if (Class70.anInt1287 == 2)
            {
                if (client.aClass68_Sub12_2381 == null)
                {
                    client.aClass68_Sub12_2381 = Class68_Sub12.method686((GameException.aClass21_2238), (Class68_Sub20_Sub15.anInt4405), Class105.anInt1796);
                    if (client.aClass68_Sub12_2381 == null)
                        return false;
                }
                if (Class93.aClass14_1669 == null)
                    Class93.aClass14_1669 = new Class14(Class68_Sub20_Sub8.aClass21_4281, Class83.aClass21_1531);
                if (Item.aClass68_Sub28_Sub1_2435.method1235((byte) -70, client.aClass68_Sub12_2381, Class93.aClass14_1669, 22050, Class125.aClass21_2172))
                {
                    Item.aClass68_Sub28_Sub1_2435.method1236((byte) 84);
                    Item.aClass68_Sub28_Sub1_2435.method1239((byte) -126, Class67.anInt1217);
                    Item.aClass68_Sub28_Sub1_2435.method1259(Class52.aBoolean998, true, client.aClass68_Sub12_2381);
                    GameException.aClass21_2238 = null;
                    client.aClass68_Sub12_2381 = null;
                    Class70.anInt1287 = 0;
                    Class93.aClass14_1669 = null;
                    return true;
                }
            }
        } catch (Exception exception)
        {
            exception.printStackTrace();
            Item.aClass68_Sub28_Sub1_2435.method1249(73);
            GameException.aClass21_2238 = null;
            client.aClass68_Sub12_2381 = null;
            Class70.anInt1287 = 0;
            Class93.aClass14_1669 = null;
        }
        return false;
    }

    public static void method873(int i)
    {
        aClass100_4006 = null;
        aClass100_4016 = null;
        if (i != -26774)
            method871(-65, -93);
        anIntArray4014 = null;
    }

    static final void method874(int i)
    {
        Class68_Sub13_Sub21.menuOptionsCount = 0;
        NodeSub.anInt3088 = -1;
        Class49.packetOpcode = -1;
        Class104.anInt1786 = 0;
        anInt4012++;
        Class106.packetSize = 0;
        Class68_Sub20_Sub6.anInt4242 = -1;
        Class68_Sub20_Sub13.anInt4370 = 0;
        Class120.menuOpen = false;
        Class68_Sub20_Sub7.anInt4254 = -1;
        Class68_Sub9.anInt2884 = 0;
        if (i == 2)
        {
            Class95.destinationX = 0;
            ((Stream) Class21.connectionVector).position = 0;
            ((Stream) Class68_Sub13_Sub8.connectionVector).position = 0;
            for (int i_23_ = 0; Class68_Sub13_Sub4.localPlayers.length > i_23_; i_23_++)
            {
                if (Class68_Sub13_Sub4.localPlayers[i_23_] != null)
                    ((Character) (Class68_Sub13_Sub4.localPlayers[i_23_])).interactingEntity = -1;
            }
            for (int i_24_ = 0; Class102.localNPCs.length > i_24_; i_24_++)
            {
                if (Class102.localNPCs[i_24_] != null)
                    ((Character) Class102.localNPCs[i_24_]).interactingEntity = -1;
            }
            Login.method1475(i ^ 0x7e);
            NodeSubList.anInt2216 = 1;
            Class17.method296(30, (byte) -68);
            for (int i_25_ = 0; i_25_ < 100; i_25_++)
                Class121.aBooleanArray2111[i_25_] = true;
            Class30.aClass16_541.method284(105);
            Class68_Sub20_Sub6.method1071((byte) -118);
        }
    }

    static final void method875(byte i)
    {
        Class30.aClass68_Sub20_Sub16_540 = null;
        Class68_Sub13_Sub11.aShortArrayArrayArray3628 = null;
        Class68_Sub13_Sub16.aByteArrayArrayArray3712 = null;
        Object4.anInt1080 = 0;
        Node.aClass45_1231 = null;
        Class12.aByteArrayArrayArray212 = null;
        anInt4008++;
        Class33.anIntArrayArrayArray584 = null;
        Class49.aByteArrayArrayArray970 = null;
        Class68_Sub13_Sub11.aByteArrayArrayArray3624 = null;
        Class48.aByteArrayArrayArray949 = null;
        Class68_Sub20_Sub17.anIntArrayArrayArray4444 = null;
        Class121.anIntArray2106 = null;
        Class75.aClass16_1343.method284(i ^ 0x5);
        Class72.aClass65_1305 = null;
        Class75.aClass65_1344 = null;
        Class102.aClass91_1758 = null;
        Class68_Sub16.aClass65_3033 = null;
        Class68_Sub10.aClass65_2914 = null;
        Animation.aClass65_2038 = null;
        Class104.aClass65_1789 = null;
        Animable.aClass68_Sub20_Sub10_59 = null;
        Class68_Sub20_Sub16.aClass65_4419 = null;
        if (i != 108)
            method869(-15, (byte) 46);
        Class68_Sub13_Sub27.aClass65_3914 = null;
    }

    final void method700(Stream class68_sub14, int i, int i_26_)
    {
        try
        {
            if (i_26_ != -1)
                method872(111);
            if (i == 0)
                ((Class68_Sub13) this).aBoolean2933 = class68_sub14.readUByte() == 1;
            anInt4004++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("u.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_26_ + ')'));
        }
    }

    public Class68_Sub13_Sub34()
    {
        super(3, false);
    }

    static
    {
        anIntArray4014 = new int[32];
        aClass100_4016 = (Class112.makeMutableString(43, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q"));
    }
}
