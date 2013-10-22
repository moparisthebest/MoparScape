/* Class68_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub1 extends Class68_Sub13
{
    static int anInt3450;
    static int anInt3451;
    static int anInt3452;
    static int anInt3453;
    static MutableString aClass100_3454 = null;
    static int anInt3455;
    static int anInt3456;
    static short aShort3457;

    static final void method702(int i, boolean bool)
    {
        for (Class68_Sub18 class68_sub18 = (Class68_Sub18) Class8.aClass16_140.method293((byte) 76); class68_sub18 != null; class68_sub18 = (Class68_Sub18) Class8.aClass16_140.method290((byte) 41))
        {
            if (((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 != null)
            {
                NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042);
                ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = null;
            }
            if (((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051 != null)
            {
                NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051);
                ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3051 = null;
            }
            class68_sub18.unlink();
        }
        anInt3453++;
        if (i == 0)
        {
            if (bool)
            {
                for (Class68_Sub18 class68_sub18 = ((Class68_Sub18) Class51.aClass16_2253.method293((byte) 76)); class68_sub18 != null; class68_sub18 = ((Class68_Sub18) Class51.aClass16_2253.method290((byte) -127)))
                {
                    if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042) != null)
                    {
                        NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042);
                        ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = null;
                    }
                    class68_sub18.unlink();
                }
                for (Class68_Sub18 class68_sub18 = ((Class68_Sub18) Class1_Sub5.aClass113_2511.method1685(-32642)); class68_sub18 != null; class68_sub18 = (Class68_Sub18) Class1_Sub5.aClass113_2511.method1689((byte) -105))
                {
                    if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042) != null)
                    {
                        NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042);
                        ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = null;
                    }
                    class68_sub18.unlink();
                }
            }
        }
    }

    static final void method703(boolean bool, int i, int i_0_, int i_1_, int i_2_, int i_3_)
    {
        Class68_Sub20_Sub15.anInt4399 = (short) i;
        anInt3452++;
        Class34.anInt592 = (short) i_1_;
        if (i_2_ >= -65)
            aShort3457 = (short) -98;
    }

    final int[] method698(byte i, int i_4_)
    {
        if (i != -61)
            aClass100_3454 = null;
        anInt3456++;
        return Class68_Sub13_Sub3.anIntArray3481;
    }

    public Class68_Sub13_Sub1()
    {
        super(0, true);
    }

    public static void method704(byte i)
    {
        aClass100_3454 = null;
        if (i != -57)
            method703(true, -90, -110, 25, 4, 82);
    }

    static final void method705(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_)
    {
        int i_13_ = 0;
        if (i_12_ >= 53)
        {
            for (/**/; ((Class91) Class102.aClass91_1758).anInt1639 > i_13_; i_13_++)
            {
                int i_14_ = ((((Class91) Class102.aClass91_1758).aShortArray1633[i_13_]) - Class70.anInt1273);
                int i_15_ = (Class103.anInt1770 - (1 - (Ground.anInt2762 - (((Class91) Class102.aClass91_1758).aShortArray1636[i_13_]))));
                int i_16_ = (i_9_ - i_7_) * (i_14_ - i_11_) / (i_10_ - i_11_) + i_7_;
                int i_17_ = i_5_ + (i_6_ - i_5_) * (i_15_ - i_8_) / (i - i_8_);
                int i_18_ = 16777215;
                int i_19_ = Class102.aClass91_1758.method1531(-67, i_13_);
                Class65 class65 = null;
                if (i_19_ == 0)
                {
                    if ((double) Class68_Sub9.aFloat2894 == 3.0)
                        class65 = Class68_Sub13_Sub27.aClass65_3914;
                    if ((double) Class68_Sub9.aFloat2894 == 4.0)
                        class65 = Class68_Sub10.aClass65_2914;
                    if ((double) Class68_Sub9.aFloat2894 == 6.0)
                        class65 = Class68_Sub16.aClass65_3033;
                    if ((double) Class68_Sub9.aFloat2894 == 8.0)
                        class65 = Animation.aClass65_2038;
                }
                if (i_19_ == 1)
                {
                    if ((double) Class68_Sub9.aFloat2894 == 3.0)
                        class65 = Class68_Sub16.aClass65_3033;
                    if ((double) Class68_Sub9.aFloat2894 == 4.0)
                        class65 = Animation.aClass65_2038;
                    if ((double) Class68_Sub9.aFloat2894 == 6.0)
                        class65 = Class104.aClass65_1789;
                    if ((double) Class68_Sub9.aFloat2894 == 8.0)
                        class65 = Class72.aClass65_1305;
                }
                if (i_19_ == 2)
                {
                    i_18_ = 16755200;
                    if ((double) Class68_Sub9.aFloat2894 == 3.0)
                        class65 = Class104.aClass65_1789;
                    if ((double) Class68_Sub9.aFloat2894 == 4.0)
                        class65 = Class72.aClass65_1305;
                    if ((double) Class68_Sub9.aFloat2894 == 6.0)
                        class65 = Class75.aClass65_1344;
                    if ((double) Class68_Sub9.aFloat2894 == 8.0)
                        class65 = Class68_Sub20_Sub16.aClass65_4419;
                }
                if (((Class91) Class102.aClass91_1758).anIntArray1642[i_13_] != -1)
                    i_18_ = (((Class91) Class102.aClass91_1758).anIntArray1642[i_13_]);
                if (class65 != null)
                {
                    MutableString[] class100s = new MutableString[((Class91) Class102.aClass91_1758).aClass100Array1637[i_13_].method1602(60, 74) + 1];
                    Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3803.method1013((((Class91) Class102.aClass91_1758).aClass100Array1637[i_13_]), null, class100s);
                    int i_20_ = class100s.length;
                    i_17_ -= class65.method627() * (i_20_ - 1) / 2;
                    i_17_ += class65.method629() / 2;
                    for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
                    {
                        MutableString class100 = (i_20_ - 1 == i_21_ ? class100s[i_21_] : (class100s[i_21_].method1613(0, (byte) -74, (class100s[i_21_].getLength() - 4))));
                        class65.method630(class100, i_16_, i_17_, i_18_, true);
                        i_17_ += class65.method627();
                    }
                }
            }
            anInt3451++;
        }
    }

    static final void method706(boolean bool)
    {
        if (bool)
        {
            Class68_Sub20_Sub12.intGroundArray = Class68_Sub13_Sub14.anIntArrayArrayArray3673;
            Class22.groundArray = NodeCache.aClass68_Sub1ArrayArrayArray1921;
        } else
        {
            Class68_Sub20_Sub12.intGroundArray = Class74.anIntArrayArrayArray1335;
            Class22.groundArray = Class108.aClass68_Sub1ArrayArrayArray1835;
        }
        Mouse.anInt1584 = Class22.groundArray.length;
    }

    static
    {
        anInt3450 = 0;
        anInt3455 = 3353893;
        aShort3457 = (short) 1;
    }
}
