/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class14
{
    static MutableString aClass100_224 = Class112.makeMutableString(43, "Art");
    static int anInt225;
    static int anInt226;
    private Class21 aClass21_227;
    static int anInt228 = 0;
    static Class21_Sub1 aClass21_Sub1_229;
    private NodeCache aClass113_230 = new NodeCache(256);
    private Class21 aClass21_231;
    static int anInt232;
    static int anInt233;
    static int anInt234;
    static int anInt235;
    static int[] anIntArray236;
    static int anInt237;
    static int anInt238;
    static int anInt239;
    static int anInt240;
    static Class84 aClass84_241;
    private NodeCache aClass113_242 = new NodeCache(256);
    static MutableString aClass100_243 = Class112.makeMutableString(43, "Benutzen");

    static final boolean method265(int i)
    {
        anInt234++;
        try
        {
            if (i >= -98)
                anInt225 = 39;
            return Class111.parsePacket(-26354);
        } catch (java.io.IOException ioexception)
        {
            Class72_Sub1.method1367((byte) -21);
            return true;
        } catch (Exception exception)
        {
            String string = ("T2 - " + Class49.packetOpcode + "," + Class68_Sub20_Sub6.anInt4242 + "," + Class68_Sub20_Sub7.anInt4254 + " - " + Class106.packetSize + "," + ((((Character) Class68_Sub7.localPlayer).walkQueueX[0]) + Class36.baseX) + "," + ((((Character) Class68_Sub7.localPlayer).walkQueueY[0]) + Class68_Sub13_Sub35.baseY) + " - ");
            for (int i_0_ = 0; Class106.packetSize > i_0_ && i_0_ < 50; i_0_++)
                string += (((Stream) Class68_Sub13_Sub8.connectionVector).buffer[i_0_]) + ",";
            Class71.method1339(string, exception, 38);
            Class68_Sub3.method651((byte) -109);
            return true;
        }
    }

    final Class68_Sub11_Sub1 method266(int i, int[] is, int i_1_)
    {
        try
        {
            anInt237++;
            if (aClass21_231.method337(0) == 1)
                return method272(0, is, i_1_, (byte) 91);
            if (aClass21_231.method355(i_1_, i + i) == 1)
                return method272(i_1_, is, 0, (byte) 112);
            throw new RuntimeException();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bi.F(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_1_ + ')'));
        }
    }

    static final Class68_Sub20_Sub11 method267(boolean bool, int i)
    {
        if (bool != true)
            anIntArray236 = null;
        Class68_Sub20_Sub11 class68_sub20_sub11 = ((Class68_Sub20_Sub11) Player.aClass82_3420.method1479((long) i, (byte) -76));
        anInt240++;
        if (class68_sub20_sub11 != null)
            return class68_sub20_sub11;
        byte[] is;
        if (i < 32768)
            is = Class68_Sub20_Sub8.aClass21_4292.method338(i, 0, 0);
        else
            is = Class25.aClass21_513.method338(0x7fff & i, 0, 0);
        class68_sub20_sub11 = new Class68_Sub20_Sub11();
        if (is != null)
            class68_sub20_sub11.method1143(new Stream(is), bool);
        if (i >= 32768)
            class68_sub20_sub11.method1145((byte) -67);
        Player.aClass82_3420.method1471((long) i, (byte) -126, class68_sub20_sub11);
        return class68_sub20_sub11;
    }

    private final Class68_Sub11_Sub1 method268(byte i, int i_2_, int i_3_, int[] is)
    {
        try
        {
            if (i != -113)
                aClass100_224 = null;
            anInt239++;
            int i_4_ = i_3_ ^ (i_2_ >>> 12 | i_2_ << 4 & 0xfffc);
            i_4_ |= i_2_ << 16;
            long l = (long) i_4_ ^ 0x100000000L;
            Class68_Sub11_Sub1 class68_sub11_sub1 = (Class68_Sub11_Sub1) aClass113_242.method1684(l, -80);
            if (class68_sub11_sub1 != null)
                return class68_sub11_sub1;
            if (is != null && is[0] <= 0)
                return null;
            Class68_Sub21 class68_sub21 = (Class68_Sub21) aClass113_230.method1684(l, 82);
            if (class68_sub21 == null)
            {
                class68_sub21 = Class68_Sub21.method1192(aClass21_227, i_2_, i_3_);
                if (class68_sub21 == null)
                    return null;
                aClass113_230.method1683((byte) 123, class68_sub21, l);
            }
            class68_sub11_sub1 = class68_sub21.method1193(is);
            if (class68_sub11_sub1 == null)
                return null;
            class68_sub21.unlink();
            aClass113_242.method1683((byte) 122, class68_sub11_sub1, l);
            return class68_sub11_sub1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bi.A(" + i + ',' + i_2_ + ',' + i_3_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method269(boolean bool)
    {
        anIntArray236 = null;
        aClass100_224 = null;
        aClass21_Sub1_229 = null;
        if (bool == false)
        {
            aClass100_243 = null;
            aClass84_241 = null;
        }
    }

    final Class68_Sub11_Sub1 method270(int i, byte i_5_, int[] is)
    {
        try
        {
            anInt238++;
            if (aClass21_227.method337(0) == 1)
                return method268((byte) -113, 0, i, is);
            if (aClass21_227.method355(i, 0) == 1)
                return method268((byte) -113, i, 0, is);
            if (i_5_ <= 5)
                anInt233 = -21;
            throw new RuntimeException();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bi.E(" + i + ',' + i_5_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method271(boolean bool, Class21 class21, Class21 class21_6_, byte i, Class68_Sub20_Sub1_Sub1 class68_sub20_sub1_sub1)
    {
        try
        {
            Class68_Sub26.aClass21_3193 = class21;
            Mouse.aClass21_1568 = class21_6_;
            anInt226++;
            NodeList.aBoolean272 = bool;
            if (i <= 26)
                aClass84_241 = null;
            int i_7_ = Mouse.aClass21_1568.method337(0) - 1;
            anInt233 = i_7_ * 256 + Mouse.aClass21_1568.method355(i_7_, 0);
            Class18.aClass68_Sub20_Sub1_Sub1_289 = class68_sub20_sub1_sub1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bi.C(" + bool + ',' + (class21 != null ? "{...}" : "null") + ',' + (class21_6_ != null ? "{...}" : "null") + ',' + i + ',' + (class68_sub20_sub1_sub1 != null ? "{...}" : "null") + ')'));
        }
    }

    private final Class68_Sub11_Sub1 method272(int i, int[] is, int i_8_, byte i_9_)
    {
        try
        {
            anInt235++;
            int i_10_ = (i >>> 12 | i << 4 & 0xfffd) ^ i_8_;
            i_10_ |= i << 16;
            long l = (long) i_10_;
            Class68_Sub11_Sub1 class68_sub11_sub1 = (Class68_Sub11_Sub1) aClass113_242.method1684(l, -40);
            if (class68_sub11_sub1 != null)
                return class68_sub11_sub1;
            if (is != null && is[0] <= 0)
                return null;
            Class46 class46 = Class46.method509(aClass21_231, i, i_8_);
            if (class46 == null)
                return null;
            int i_11_ = 46 / (-i_9_ / 36);
            class68_sub11_sub1 = class46.method508();
            aClass113_242.method1683((byte) -126, class68_sub11_sub1, l);
            if (is != null)
                is[0] -= (((Class68_Sub11_Sub1) class68_sub11_sub1).aByteArray3447).length;
            return class68_sub11_sub1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bi.G(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_8_ + ',' + i_9_ + ')'));
        }
    }

    Class14(Class21 class21, Class21 class21_12_)
    {
        try
        {
            aClass21_227 = class21_12_;
            aClass21_231 = class21;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("bi.<init>(" + (class21 != null ? "{...}" : "null") + ',' + (class21_12_ != null ? "{...}" : "null") + ')'));
        }
    }
}
