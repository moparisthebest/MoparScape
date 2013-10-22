/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Animable
{
    static int anInt54;
    static int anInt55;
    static int anInt56;
    static int anInt57;
    static int anInt58;
    static Class68_Sub20_Sub10 aClass68_Sub20_Sub10_59;
    static int anInt60;
    static Widget aClass45_61 = null;
    static int anInt62;
    static int anInt63;
    static MutableString aClass100_64 = Class112.makeMutableString(43, "Bitte entfernen Sie ");
    static int anInt65;
    static Class35 aClass35_66;
    static int anInt67;
    static int anInt68;

    static final MutableString method50(byte i, int i_0_)
    {
        if (i > -36)
            anInt63 = -44;
        anInt55++;
        if (i_0_ < 100000)
            return (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class85.aClass100_1558, Class68_Sub13_Sub24.method816(i_0_, 0), Class96.aClass100_1699 }));
        if (i_0_ < 10000000)
            return (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class21_Sub1.aClass100_2697, Class68_Sub13_Sub24.method816(i_0_ / 1000, 0), Class68_Sub13_Sub11.aClass100_3613, Class96.aClass100_1699 })));
        return (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub29.aClass100_3936, Class68_Sub13_Sub24.method816(i_0_ / 1000000, 0), Class18.aClass100_296, Class96.aClass100_1699 })));
    }

    abstract void render(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, long l);

    public Animable()
    {
        /* empty */
    }

    void method52(Animable class1_8_, int i, int i_9_, int i_10_, boolean bool)
    {
        try
        {
            anInt58++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("a.S(" + (class1_8_ != null ? "{...}" : "null") + ',' + i + ',' + i_9_ + ',' + i_10_ + ',' + bool + ')'));
        }
    }

    static final byte[] method53(boolean bool, byte i, Object object)
    {
        try
        {
            anInt56++;
            if (object == null)
                return null;
            if (object instanceof byte[])
            {
                byte[] is = (byte[]) object;
                if (bool)
                    return Class89.method1514(is, false);
                return is;
            }
            if (i != -4)
                method54((byte) -77, -30, -86, 85);
            if (object instanceof Class15)
            {
                Class15 class15 = (Class15) object;
                return class15.method275(-82);
            }
            throw new IllegalArgumentException();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("a.L(" + bool + ',' + i + ',' + (object != null ? "{...}" : "null") + ')'));
        }
    }

    static final int method54(byte i, int i_11_, int i_12_, int i_13_)
    {
        anInt57++;
        i_11_ &= 0x3;
        if (i_11_ == 0)
            return i_12_;
        int i_14_ = -17 / ((-35 - i) / 45);
        if (i_11_ == 1)
            return 7 - i_13_;
        if (i_11_ == 2)
            return 7 - i_12_;
        return i_13_;
    }

    static final void method55(int i)
    {
        anInt60++;
        Class68_Sub13_Sub27.aClass98_3895.method1573(-20);
        ClientScript.aClass98_4374.method1573(111);
        if (i != -7816)
            aClass35_66 = null;
    }

    abstract int method56();

    Animable method57(int i, int i_15_, int i_16_)
    {
        anInt62++;
        return this;
    }

    boolean method58()
    {
        anInt67++;
        return false;
    }

    static final Class92_Sub1[] method59(int i, Class21 class21, boolean bool)
    {
        try
        {
            anInt65++;
            if (bool != false)
                aClass68_Sub20_Sub10_59 = null;
            if (!Class56.method572(class21, -1, i))
                return null;
            return RandomNumberGenerator.method1463(31);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("a.O(" + i + ',' + (class21 != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    void method60(int i, int i_17_, int i_18_, int i_19_, int i_20_)
    {
        if (i_18_ <= 96)
            anInt63 = 32;
        anInt68++;
    }

    public static void method61(int i)
    {
        aClass68_Sub20_Sub10_59 = null;
        aClass45_61 = null;
        aClass35_66 = null;
        aClass100_64 = null;
        if (i <= 35)
            method59(5, null, false);
    }

    static final void method62(int i, byte[] is, int i_21_, boolean bool, int i_22_, int i_23_, int i_24_, GroundData[] class38s)
    {
        try
        {
            anInt54++;
            int i_25_;
            if (bool)
                i_25_ = 1;
            else
                i_25_ = 4;
            if (i_22_ < -1)
            {
                if (!bool)
                {
                    for (int i_26_ = 0; i_26_ < 4; i_26_++)
                    {
                        for (int i_27_ = 0; i_27_ < 64; i_27_++)
                        {
                            for (int i_28_ = 0; i_28_ < 64; i_28_++)
                            {
                                if (i_21_ + i_27_ > 0 && i_21_ + i_27_ < 103 && i_28_ + i > 0 && i + i_28_ < 103)
                                    ((GroundData) class38s[i_26_]).blocks[i_27_ + i_21_][i_28_ + i] = (Class120.method1746((((GroundData) class38s[i_26_]).blocks[i_27_ + i_21_][i_28_ + i]), -16777217));
                            }
                        }
                    }
                }
                Stream class68_sub14 = new Stream(is);
                for (int i_29_ = 0; i_25_ > i_29_; i_29_++)
                {
                    for (int i_30_ = 0; i_30_ < 64; i_30_++)
                    {
                        for (int i_31_ = 0; i_31_ < 64; i_31_++)
                            Class96.method1560(bool, i_21_ + i_30_, i_24_, i_23_, class68_sub14, i_29_, 0, (byte) 91, i_31_ + i);
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("a.Q(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_21_ + ',' + bool + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + (class38s != null ? "{...}" : "null") + ')'));
        }
    }
}
