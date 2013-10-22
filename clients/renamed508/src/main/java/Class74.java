/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

final class Class74
{
    static boolean aBoolean1324 = true;
    static int anInt1325;
    static int anInt1326;
    static int anInt1327;
    static int anInt1328;
    static int anInt1329;
    static Stream aClass68_Sub14_1330 = new Stream(8);
    static MutableString aClass100_1331;
    static MutableString aClass100_1332;
    static int cameraYaw;
    private static MutableString aClass100_1334 = Class112.makeMutableString(43, "slide:");
    static int[][][] anIntArrayArrayArray1335;
    static int[][][] anIntArrayArrayArray1336;
    private static MutableString aClass100_1337;
    static MutableString aClass100_1338;

    public static void method1379(int i)
    {
        aClass100_1332 = null;
        aClass100_1338 = null;
        aClass100_1331 = null;
        aClass100_1337 = null;
        aClass68_Sub14_1330 = null;
        aClass100_1334 = null;
        anIntArrayArrayArray1335 = null;
        anIntArrayArrayArray1336 = null;
        if (i > -2)
            aClass68_Sub14_1330 = null;
    }

    static final Sprite method1380(int i)
    {
        anInt1327++;
        if (i != -14452)
            aClass68_Sub14_1330 = null;
        byte[] is = Object5.aByteArrayArray1240[0];
        int i_0_ = (Class68_Sub13_Sub12.anIntArray3641[0] * Class68_Sub13_Sub19.anIntArray3759[0]);
        Sprite class68_sub20_sub10_sub1;
        if (!Class68_Sub10.aBooleanArray2907[0])
        {
            int[] is_1_ = new int[i_0_];
            for (int i_2_ = 0; i_0_ > i_2_; i_2_++)
                is_1_[i_2_] = (Class68_Sub13_Sub17.anIntArray3721[Class120.method1746(is[i_2_], 255)]);
            class68_sub20_sub10_sub1 = (new Sprite(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[0], ObjectDefinition.anIntArray1998[0], Class68_Sub13_Sub12.anIntArray3641[0], Class68_Sub13_Sub19.anIntArray3759[0], is_1_));
        } else
        {
            byte[] is_3_ = Class3.aByteArrayArray78[0];
            int[] is_4_ = new int[i_0_];
            for (int i_5_ = 0; i_0_ > i_5_; i_5_++)
                is_4_[i_5_] = Class70.OR((Class68_Sub13_Sub17.anIntArray3721[Class120.method1746(is[i_5_], 255)]), (Class120.method1746(255, is_3_[i_5_]) << 24));
            class68_sub20_sub10_sub1 = (new Class68_Sub20_Sub10_Sub1_Sub1(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[0], ObjectDefinition.anIntArray1998[0], Class68_Sub13_Sub12.anIntArray3641[0], Class68_Sub13_Sub19.anIntArray3759[0], is_4_));
        }
        Class87.method1493((byte) -93);
        return class68_sub20_sub10_sub1;
    }

    static final void method1381(boolean bool, MutableString class100, int i)
    {
        try
        {
            anInt1329++;
            int i_6_ = 4;
            int i_7_ = i_6_ + 6;
            if (i != -16678)
                method1384(79L, 67, 108, 3, null, -121, 64);
            int i_8_ = i_6_ + 6;
            int i_9_ = Class68_Sub6.aClass68_Sub20_Sub1_2849.method1018(class100, 250);
            int i_10_ = 13 * Class68_Sub6.aClass68_Sub20_Sub1_2849.method1020(class100, 250);
            Class79.method1445(i_7_ - i_6_, i_8_ - i_6_, i_6_ + i_6_ + i_9_, i_6_ + i_6_ + i_10_, 0);
            Class79.method1421(i_7_ - i_6_, i_8_ - i_6_, i_6_ + i_9_ + i_6_, i_10_ - (-i_6_ - i_6_), 16777215);
            Class68_Sub6.aClass68_Sub20_Sub1_2849.method1019(class100, i_7_, i_8_, i_9_, i_10_, 16777215, -1, 1, 1, 0);
            Class127.method1787(i_7_ - i_6_, i_8_ - i_6_, i_6_ + (i_6_ + i_9_), i_10_ + i_6_ + i_6_, (byte) -62);
            if (!bool)
                Class13.method242(-121, i_9_, i_10_, i_7_, i_8_);
            else
            {
                try
                {
                    Graphics graphics = Mouse.gameCanvas.getGraphics();
                    Class1_Sub5.aClass72_2498.method1350(99, 0, 0, graphics);
                } catch (Exception exception)
                {
                    Mouse.gameCanvas.repaint();
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("mg.B(" + bool + ',' + (class100 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    static final int method1382(int i, int i_11_)
    {
        double d = (double) (i >> 16 & 0xff) / 256.0;
        double d_12_ = (double) (0xff & i) / 256.0;
        anInt1325++;
        int i_13_ = -26 % ((i_11_ - 61) / 33);
        double d_14_ = (double) ((i & 0xfff1) >> 8) / 256.0;
        double d_15_ = 0.0;
        double d_16_ = d;
        if (d_16_ > d_14_)
            d_16_ = d_14_;
        if (d_16_ > d_12_)
            d_16_ = d_12_;
        double d_17_ = d;
        if (d_17_ < d_14_)
            d_17_ = d_14_;
        double d_18_ = 0.0;
        if (d_17_ < d_12_)
            d_17_ = d_12_;
        double d_19_ = (d_17_ + d_16_) / 2.0;
        int i_20_ = (int) (256.0 * d_19_);
        if (i_20_ < 0)
            i_20_ = 0;
        else if (i_20_ > 255)
            i_20_ = 255;
        if (d_17_ != d_16_)
        {
            if (d_19_ < 0.5)
                d_18_ = (-d_16_ + d_17_) / (d_16_ + d_17_);
            if (d_19_ >= 0.5)
                d_18_ = (d_17_ - d_16_) / (-d_17_ + 2.0 - d_16_);
            if (d == d_17_)
                d_15_ = (-d_12_ + d_14_) / (d_17_ - d_16_);
            else if (d_17_ == d_14_)
                d_15_ = (-d + d_12_) / (d_17_ - d_16_) + 2.0;
            else if (d_12_ == d_17_)
                d_15_ = (-d_14_ + d) / (-d_16_ + d_17_) + 4.0;
        }
        int i_21_ = (int) (d_18_ * 256.0);
        d_15_ /= 6.0;
        if (i_21_ < 0)
            i_21_ = 0;
        else if (i_21_ > 255)
            i_21_ = 255;
        int i_22_ = (int) (d_15_ * 256.0);
        if (i_20_ > 243)
            i_21_ >>= 4;
        else if (i_20_ <= 217)
        {
            if (i_20_ <= 192)
            {
                if (i_20_ > 179)
                    i_21_ >>= 1;
            } else
                i_21_ >>= 2;
        } else
            i_21_ >>= 3;
        return (i_20_ >> 1) + ((i_21_ >> 5 << 7) + (i_22_ >> 2 << 10));
    }

    static final Class92 method1383(int i)
    {
        anInt1326++;
        Class92_Sub1 class92_sub1 = new Class92_Sub1(Class97.anInt1705, Class68_Sub20_Sub15.anInt4407, Class4.anIntArray96[0], ObjectDefinition.anIntArray1998[0], Class68_Sub13_Sub12.anIntArray3641[0], Class68_Sub13_Sub19.anIntArray3759[i], Object5.aByteArrayArray1240[0], Class68_Sub13_Sub17.anIntArray3721);
        Class87.method1493((byte) -93);
        return class92_sub1;
    }

    static final void method1384(long l, int i, int i_23_, int i_24_, MutableString class100, int i_25_, int i_26_)
    {
        try
        {
            anInt1328++;
            Stream class68_sub14 = new Stream(128);
            class68_sub14.writeByte(10);
            class68_sub14.writeShort((int) (Math.random() * 99999.0));
            class68_sub14.writeShort(508);
            class68_sub14.writeLong(l);
            class68_sub14.writeDWord((int) (Math.random() * 9.9999999E7));
            class68_sub14.writeString(class100);
            class68_sub14.writeDWord((int) (9.9999999E7 * Math.random()));
            class68_sub14.writeShort(Class68_Sub13_Sub20.anInt3782);
            class68_sub14.writeByte(i);
            int i_27_ = -21 / ((-52 - i_23_) / 55);
            class68_sub14.writeByte(i_24_);
            class68_sub14.writeDWord((int) (Math.random() * 9.9999999E7));
            class68_sub14.writeShort(i_26_);
            class68_sub14.writeShort(i_25_);
            class68_sub14.writeDWord((int) (9.9999999E7 * Math.random()));
            class68_sub14.rsaEncrypt(Class68_Sub4.RSA_ENCRYPT_KEY, Class68_Sub22.RSA_ENCRYPT_MODULUS);
            ((Stream) Class21.connectionVector).position = 0;
            Class21.connectionVector.writeByte(48);
            Class21.connectionVector.writeByte(((Stream) class68_sub14).position);
            Class21.connectionVector.writeBytes(((Stream) class68_sub14).position, 0, ((Stream) class68_sub14).buffer);
            Class68_Sub13_Sub27.anInt3916 = 1;
            Object1.anInt1190 = 0;
            Class50.anInt980 = -3;
            Class88.anInt1604 = 0;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("mg.E(" + l + ',' + i + ',' + i_23_ + ',' + i_24_ + ',' + (class100 != null ? "{...}" : "null") + ',' + i_25_ + ',' + i_26_ + ')'));
        }
    }

    static
    {
        aClass100_1332 = aClass100_1334;
        aClass100_1337 = Class112.makeMutableString(43, "Loading title screen )2 ");
        aClass100_1331 = aClass100_1337;
        aClass100_1338 = aClass100_1334;
    }
}
