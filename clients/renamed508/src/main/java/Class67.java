/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class67
{
    static MutableString aClass100_1206 = Class112.makeMutableString(43, ")3)3)3");
    static MutableString aClass100_1207;
    private static MutableString aClass100_1208;
    static int anInt1209;
    static boolean aBoolean1210;
    private static MutableString aClass100_1211 = Class112.makeMutableString(43, "Loaded input handler");
    static int anInt1212;
    static MutableString aClass100_1213;
    static int anInt1214;
    static int anInt1215;
    static int anInt1216;
    static int anInt1217;

    public static void method639(int i)
    {
        aClass100_1206 = null;
        if (i == 988656400)
        {
            aClass100_1211 = null;
            aClass100_1207 = null;
            aClass100_1213 = null;
            aClass100_1208 = null;
        }
    }

    static final void method640(int i)
    {
        anInt1209++;
        synchronized (Class33.mouse)
        {
            Class20.idleTime++;
            Class68_Sub20_Sub12.anInt4354 = client.mouseClickButton;
            Class96.anInt1697 = Class115.mouseX;
            Class13.anInt223 = Class68_Sub20_Sub13.mouseY;
            Class29.anInt537 = Class122.mouseClickLastButton;
            Class68_Sub13_Sub37.anInt4079 = Class12.mouseClickX;
            Class125.anInt2175 = Class48.mouseClickY;
            Class68_Sub20_Sub7.aLong4264 = Class68_Sub13_Sub11.mouseClickTime;
            Class122.mouseClickLastButton = 0;
        }
        if (i != -1)
            aClass100_1206 = null;
    }

    static final void method641(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, byte i_6_)
    {
        anInt1212++;
        if (i_5_ < 128 || i_2_ < 128 || i_5_ > 13056 || i_2_ > 13056)
        {
            Class114.anInt1927 = -1;
            Mouse.anInt1578 = -1;
        } else
        {
            if (i_6_ >= -122)
                aClass100_1211 = null;
            int i_7_ = (Player.fixZ(i_5_, GameSocket.plane, i_2_) - i_3_);
            int i_8_ = Class62.PRECOMUPTED_COSINE_CACHE[GameCanvas.cameraPitch];
            int i_9_ = Class62.PRECOMUPTED_COSINE_CACHE[Class74.cameraYaw];
            i_5_ -= Class68_Sub7.cameraPositionX;
            int i_10_ = Class62.PRECOMPUTED_SINE_CACHE[GameCanvas.cameraPitch];
            i_7_ -= Class68_Sub5.cameraPositionZ;
            int i_11_ = Class62.PRECOMPUTED_SINE_CACHE[Class74.cameraYaw];
            i_2_ -= Class85.cameraPositionY;
            int i_12_ = i_2_ * i_11_ + i_9_ * i_5_ >> 16;
            i_2_ = i_9_ * i_2_ - i_5_ * i_11_ >> 16;
            i_5_ = i_12_;
            i_12_ = i_8_ * i_7_ - i_2_ * i_10_ >> 16;
            i_2_ = i_7_ * i_10_ + i_2_ * i_8_ >> 16;
            i_7_ = i_12_;
            if (i_2_ >= 50)
            {
                Mouse.anInt1578 = (i_5_ << 9) / i_2_ + i_1_;
                Class114.anInt1927 = i_4_ + (i_7_ << 9) / i_2_;
            } else
            {
                Class114.anInt1927 = -1;
                Mouse.anInt1578 = -1;
            }
        }
    }

    static final Class92 method642(Class21 class21, int i, int i_13_)
    {
        try
        {
            anInt1215++;
            if (!Class56.method572(class21, -1, i))
                return null;
            if (i_13_ != -30509)
                aClass100_1211 = null;
            return Class74.method1383(i_13_ + 30509);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("lg.A(" + (class21 != null ? "{...}" : "null") + ',' + i + ',' + i_13_ + ')'));
        }
    }

    static
    {
        aBoolean1210 = false;
        aClass100_1208 = Class112.makeMutableString(43, " is already on your ignore list)3");
        aClass100_1207 = aClass100_1211;
        aClass100_1213 = aClass100_1208;
    }
}
