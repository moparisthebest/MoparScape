/* Class72_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

final class Class72_Sub1 extends Class72 implements ImageProducer, ImageObserver
{
    static int anInt3260;
    static int anInt3261;
    static int anInt3262;
    static int anInt3263;
    static int anInt3264;
    static int anInt3265;
    static int anInt3266;
    static int anInt3267;
    static int anInt3268;
    static int anInt3269;
    static Login aClass82_3270 = new Login(64);
    static int anInt3271;
    static int anInt3272;
    static MutableString aClass100_3273;
    static MutableString aClass100_3274;
    static int[] anIntArray3275 = { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
    private static MutableString aClass100_3276 = Class112.makeMutableString(43, " has logged out)3");
    static int anInt3277;
    static Class68_Sub20_Sub1_Sub1 aClass68_Sub20_Sub1_Sub1_3278;
    static MutableString aClass100_3279;
    private ColorModel aColorModel3280;
    private static MutableString aClass100_3281;
    static int anInt3282;
    private static MutableString aClass100_3283;
    static int anInt3284;
    static int anInt3285;
    static int anInt3286;
    static long aLong3287;
    static int anInt3288;
    private static MutableString aClass100_3289;
    static MutableString aClass100_3290;
    private ImageConsumer anImageConsumer3291;

    static final void method1362(int i, Component component)
    {
        try
        {
            anInt3260++;
            int i_0_ = 121 % ((i + 20) / 60);
            component.addMouseListener(Class33.mouse);
            component.addMouseMotionListener(Class33.mouse);
            component.addFocusListener(Class33.mouse);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.V(" + i + ',' + (component != null ? "{...}" : "null") + ')'));
        }
    }

    public final synchronized boolean isConsumer(ImageConsumer imageconsumer)
    {
        try
        {
            anInt3269++;
            if (anImageConsumer3291 != imageconsumer)
                return false;
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ak.isConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')');
        }
    }

    public final void startProduction(ImageConsumer imageconsumer)
    {
        try
        {
            addConsumer(imageconsumer);
            anInt3262++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.startProduction(" + (imageconsumer != null ? "{...}" : "null") + ')'));
        }
    }

    private final synchronized void method1363(boolean bool)
    {
        anInt3286++;
        if (anImageConsumer3291 != null)
        {
            anImageConsumer3291.setPixels(0, 0, ((Class72) this).anInt1322, ((Class72) this).anInt1308, aColorModel3280, ((Class72) this).anIntArray1307, 0, ((Class72) this).anInt1322);
            anImageConsumer3291.imageComplete(2);
            if (bool != false)
                aClass100_3283 = null;
        }
    }

    public final synchronized void removeConsumer(ImageConsumer imageconsumer)
    {
        try
        {
            if (imageconsumer == anImageConsumer3291)
                anImageConsumer3291 = null;
            anInt3263++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.removeConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1364(int i, int i_1_)
    {
        if (i_1_ >= -54)
            aClass100_3273 = null;
        anInt3266++;
        Class68_Sub22 class68_sub22 = ((Class68_Sub22) Class68_Sub13_Sub8.aClass113_3566.method1684((long) i, 117));
        if (class68_sub22 != null)
            class68_sub22.unlink();
    }

    static final void method1365(MutableString[] class100s, short[] is, int i)
    {
        try
        {
            anInt3272++;
            Class60.method589(class100s, is, class100s.length - 1, false, 0);
            int i_2_ = 44 / ((1 - i) / 48);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.Q(" + (class100s != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    public final boolean imageUpdate(Image image, int i, int i_3_, int i_4_, int i_5_, int i_6_)
    {
        try
        {
            anInt3267++;
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.imageUpdate(" + (image != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
        }
    }

    private final synchronized void method1366(int i, int i_7_, byte i_8_, int i_9_, int i_10_)
    {
        anInt3264++;
        if (anImageConsumer3291 != null)
        {
            if (i_8_ != 87)
                aClass100_3274 = null;
            anImageConsumer3291.setPixels(i, i_7_, i_10_, i_9_, aColorModel3280, ((Class72) this).anIntArray1307, (i_7_ * ((Class72) this).anInt1322 + i), ((Class72) this).anInt1322);
            anImageConsumer3291.imageComplete(2);
        }
    }

    static final void method1367(byte i)
    {
        anInt3271++;
        if (NodeList.anInt273 > 0)
            Class68_Sub3.method651((byte) -113);
        else
        {
            Class106.aClass61_1800 = PlayerDefinition.connection;
            PlayerDefinition.connection = null;
            if (i != -21)
                method1369(-15);
            Class17.method296(40, (byte) -69);
        }
    }

    public final synchronized void addConsumer(ImageConsumer imageconsumer)
    {
        try
        {
            anImageConsumer3291 = imageconsumer;
            imageconsumer.setDimensions(((Class72) this).anInt1322, ((Class72) this).anInt1308);
            anInt3265++;
            imageconsumer.setProperties(null);
            imageconsumer.setColorModel(aColorModel3280);
            imageconsumer.setHints(14);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.addConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1356(Component component, int i, int i_11_, int i_12_)
    {
        try
        {
            ((Class72) this).anInt1322 = i;
            ((Class72) this).anInt1308 = i_12_;
            ((Class72) this).anIntArray1307 = new int[i_12_ * i + 1];
            anInt3268++;
            aColorModel3280 = new DirectColorModel(32, 16711680, 65280, 255);
            ((Class72) this).anImage1314 = component.createImage(this);
            method1363(false);
            component.prepareImage(((Class72) this).anImage1314, this);
            int i_13_ = -100 % ((-80 - i_11_) / 38);
            method1363(false);
            component.prepareImage(((Class72) this).anImage1314, this);
            method1363(false);
            component.prepareImage(((Class72) this).anImage1314, this);
            this.method1358(25);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.D(" + (component != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ',' + i_12_ + ')'));
        }
    }

    final void method1350(int i, int i_14_, int i_15_, Graphics graphics)
    {
        try
        {
            method1363(false);
            if (i > 72)
            {
                graphics.drawImage(((Class72) this).anImage1314, i_14_, i_15_, this);
                anInt3261++;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.G(" + i + ',' + i_14_ + ',' + i_15_ + ',' + (graphics != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1368(byte i)
    {
        anIntArray3275 = null;
        aClass82_3270 = null;
        aClass68_Sub20_Sub1_Sub1_3278 = null;
        aClass100_3283 = null;
        aClass100_3290 = null;
        int i_16_ = 1 % ((74 - i) / 49);
        aClass100_3281 = null;
        aClass100_3273 = null;
        aClass100_3276 = null;
        aClass100_3274 = null;
        aClass100_3289 = null;
        aClass100_3279 = null;
    }

    static final void method1369(int i)
    {
        Class85.aClass100_1566 = Class13.aClass100_214;
        ClientScript.aClass100_4389 = Animable.aClass100_64;
        Class68_Sub13_Sub36.aClass100_4051 = Class122.aClass100_2120;
        Class125.aClass100_2167 = Object4.aClass100_1072;
        Class68_Sub13_Sub18.aClass100_3733 = Class68_Sub2.aClass100_2794;
        Class58.aClass100_1095 = Class68_Sub13_Sub23.aClass100_3828;
        Class102.aClass100_1753 = Class83.aClass100_1532;
        Class68_Sub7.aClass100_2863 = Class21_Sub1.aClass100_2700;
        Class29.aClass100_535 = Object3.aClass100_939;
        Class68_Sub13_Sub12.aClass100_3637 = Class68_Sub13_Sub9.aClass100_3583;
        Class68_Sub13_Sub26_Sub1.aClass100_4605 = Class114.aClass100_1934;
        Class34.aClass100_598 = Class68_Sub9.aClass100_2887;
        Class85.aClass100_1561 = Class83.aClass100_1526;
        Class52.aClass100_1005 = Class106.aClass100_1810;
        Class84.aClass100_1538 = Class68_Sub28_Sub2.aClass100_4552;
        Class72.aClass100_1306 = Class68_Sub13_Sub7.aClass100_3554;
        GameException.aClass100_2245 = Class68_Sub13_Sub2.aClass100_3460;
        Object2.aClass100_1347 = Class14.aClass100_243;
        Class68_Sub13_Sub5.aClass100_3519 = NodeSubList.aClass100_2227;
        Animation.aClass100_2055 = Class68_Sub13_Sub31.aClass100_3978;
        Class124.aClass100_2165 = Class68_Sub13_Sub37.aClass100_4063;
        Class119.aClass100_2088 = Class68_Sub20_Sub3.aClass100_4196;
        Widget.aClass100_924 = Class1_Sub7.aClass100_2592;
        Class68_Sub13_Sub29.aClass100_3942 = Class106.aClass100_1812;
        Class68_Sub13_Sub19.aClass100_3742 = NodeSub.aClass100_3090;
        Class48.aClass100_952 = Class68_Sub13_Sub17.aClass100_3722;
        Class97.aClass100_1718 = Class114.aClass100_1928;
        Class1_Sub7.aClass100_2603 = Class68_Sub13_Sub23.aClass100_3821;
        Class68_Sub13_Sub26_Sub1.aClass100_4607 = Class30.aClass100_551;
        Class75_Sub3.aClass100_3326 = Class32.aClass100_567;
        Class68_Sub16.aClass100_3029 = Class89.aClass100_1613;
        Class51.aClass100_2260 = Class105.aClass100_1794;
        Class68_Sub24.aClass100_3154 = Class97.aClass100_1715;
        Class68_Sub13_Sub5.aClass100_3522 = Class30.aClass100_542;
        Class97.aClass100_1720 = Class68_Sub8.aClass100_2866;
        Player.aClass100_3442 = Class101.aClass100_1740;
        Class111.aClass100_1869 = Object1.aClass100_1188;
        if (i < -19)
        {
            Class32.aClass100_562 = Class68_Sub13_Sub12.aClass100_3647;
            Class18.aClass100_296 = Class68_Sub18.aClass100_3050;
            Class78.aClass100_1391 = Class21.aClass100_477;
            Class1_Sub1.aClass100_2407 = Class68_Sub13_Sub8.aClass100_3567;
            aClass100_3274 = Class33.aClass100_585;
            Class74.aClass100_1331 = Player.aClass100_3415;
            Class68_Sub13_Sub33.aClass100_3989 = NPCDefinition.aClass100_1457;
            Class68_Sub13_Sub29.aClass100_3941 = Class68_Sub18.aClass100_3065;
            Character.aClass100_2575 = Class68_Sub20_Sub10.aClass100_4322;
            CachedItem.aClass100_4452 = Class48.aClass100_948;
            Class13_Sub1.aClass100_2635 = Class90.aClass100_2356;
            Class20.aClass100_400 = Class107.aClass100_1820;
            ClientScript.aClass100_4388 = Animable.aClass100_64;
            Class7.aClass100_137 = Class56.aClass100_1062;
            aClass100_3290 = aClass100_3289;
            Class68_Sub13_Sub19.aClass100_3744 = CipheredByteVector.aClass100_4122;
            Animation.aClass100_2061 = Class78.aClass100_1389;
            Class20.aClass100_401 = Class68_Sub26.aClass100_3186;
            Class50.aClass100_985 = Class68_Sub20_Sub13_Sub2.aClass100_4624;
            anInt3282++;
            Object4.aClass100_1081 = Class68_Sub5.aClass100_2834;
            Class71.aClass100_1289 = Class68_Sub13_Sub24.aClass100_3849;
            Class68_Sub13_Sub24.aClass100_3836 = Class68_Sub18.aClass100_3045;
            Class118.aClass100_2085 = Class75.aClass100_1340;
            Mouse.aClass100_1576 = Node.aClass100_1230;
            Class74.aClass100_1338 = Class68_Sub13_Sub26.aClass100_3880;
            Class18.aClass100_309 = Class68_Sub18.aClass100_3050;
            MutableString.aClass100_2319 = Class75_Sub1_Sub1.aClass100_4589;
            Login.aClass100_1523 = Class68_Sub28_Sub2.aClass100_4551;
            Class68_Sub8.aClass100_2868 = Class68_Sub13_Sub34.aClass100_4016;
            Class75_Sub2.aClass100_3319 = Class75_Sub2.aClass100_3309;
            Object5.aClass100_1236 = Class101.aClass100_1742;
            Class75_Sub3.aClass100_3323 = Class108.aClass100_1833;
            Class67.aClass100_1213 = Class68_Sub13_Sub13.aClass100_3652;
            Class118.aClass100_2082 = Class68_Sub13_Sub9.aClass100_3579;
            Class75.aClass100_1341 = Class104.aClass100_1777;
            Class13_Sub2.aClass100_2649 = Class84.aClass100_1541;
            Widget.aClass100_920 = Class68_Sub20_Sub17.aClass100_4440;
            Class59.aClass100_1108 = Class91.aClass100_1644;
            Class68_Sub13_Sub21.aClass100_3797 = Class75_Sub2.aClass100_3311;
            Class68_Sub13_Sub11.aClass100_3629 = Class68_Sub13_Sub8.aClass100_3568;
            Class68_Sub13_Sub11.aClass100_3613 = Class68_Sub13_Sub8.aClass100_3568;
            Class68_Sub13_Sub3.aClass100_3474 = Class124.aClass100_2150;
            Class122.aClass100_2114 = Class50.aClass100_988;
            aClass100_3279 = Class68_Sub13_Sub20.aClass100_3783;
            Class68_Sub3.aClass100_2809 = Class75_Sub3.aClass100_3320;
            Class124.aClass100_2138 = GroundData.aClass100_656;
            Class127.aClass100_2210 = Class84.aClass100_1540;
            ClientScript.aClass100_4378 = Class14.aClass100_224;
            Class67.aClass100_1207 = Class68_Sub13_Sub13.aClass100_3659;
            Login.aClass100_1509 = Class37.aClass100_655;
            Class68_Sub13_Sub25.aClass100_3870 = Class68_Sub13_Sub14.aClass100_3671;
            Class120.aClass100_2094 = Class12.aClass100_198;
            Class68_Sub13_Sub20.aClass100_3784 = Player.aClass100_3431;
            Class68_Sub20_Sub13_Sub2.aClass100_4626 = Class68_Sub13_Sub26_Sub1.aClass100_4615;
            Class68_Sub28_Sub1.aClass100_4511 = ItemDefinition.aClass100_368;
        }
    }

    final void method1359(Graphics graphics, boolean bool, int i, int i_17_, int i_18_, int i_19_)
    {
        try
        {
            anInt3277++;
            method1366(i_17_, i_18_, (byte) 87, i_19_, i);
            Shape shape = graphics.getClip();
            if (bool != true)
                method1368((byte) 40);
            graphics.clipRect(i_17_, i_18_, i, i_19_);
            graphics.drawImage(((Class72) this).anImage1314, 0, 0, this);
            graphics.setClip(shape);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.M(" + (graphics != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
        }
    }

    public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer)
    {
        try
        {
            anInt3288++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ak.requestTopDownLeftRightResend(" + (imageconsumer != null ? "{...}" : "null") + ')'));
        }
    }

    public Class72_Sub1()
    {
        /* empty */
    }

    static
    {
        aClass100_3274 = aClass100_3276;
        aClass100_3289 = Class112.makeMutableString(43, "scrollen:");
        aClass100_3283 = Class112.makeMutableString(43, "scroll:");
        aClass100_3290 = aClass100_3283;
        aClass100_3281 = Class112.makeMutableString(43, "Allocating memory");
        aClass100_3273 = aClass100_3283;
        aClass100_3279 = aClass100_3281;
    }
}
