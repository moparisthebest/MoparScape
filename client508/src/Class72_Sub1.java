/* Class72_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.*;

public class Class72_Sub1 extends Class72
        implements ImageProducer, ImageObserver {
    public static int anInt3258;
    public static int anInt3259;
    public static int anInt3260;
    public static int anInt3261;
    public static int anInt3262;
    public static int anInt3263;
    public static int anInt3264;
    public static int anInt3265;
    public static int anInt3266;
    public static int anInt3267;
    public static Login aLogin_3268 = new Login(64);
    public static int anInt3269;
    public static int anInt3270;
    public static RSString aRSString_3271;
    public static RSString aRSString_3272;
    public static int[] anIntArray3273
            = {160, 192, 80, 96, 0, 144, 80, 48, 160};
    public static RSString aRSString_3274
            = RSString.newRsString(" has logged out)3");
    public static int anInt3275;
    public static Class68_Sub20_Sub1_Sub1 aClass68_Sub20_Sub1_Sub1_3276;
    public static RSString aRSString_3277;
    public ColorModel aColorModel3278;
    public static RSString aRSString_3279;
    public static int anInt3280;
    public static RSString aRSString_3281;
    public static int anInt3282;
    public static int anInt3283;
    public static int anInt3284;
    public static long aLong3285;
    public static int anInt3286;
    public static RSString aRSString_3287;
    public static RSString aRSString_3288;
    public ImageConsumer anImageConsumer3289;

    public static void method1362(int i, Component component) {
        anInt3258++;
        int i_0_ = 121 % ((i - -20) / 60);
        component.addMouseListener(Class33.aClass86_581);
        component.addMouseMotionListener(Class33.aClass86_581);
        component.addFocusListener(Class33.aClass86_581);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
        anInt3267++;
        if (anImageConsumer3289 != imageconsumer)
            return false;
        return true;
    }

    public void startProduction(ImageConsumer imageconsumer) {
        addConsumer(imageconsumer);
        anInt3260++;
    }

    public synchronized void method1363(boolean bool) {
        anInt3284++;
        if (anImageConsumer3289 != null) {
            anImageConsumer3289.setPixels(0, 0, anInt1322, anInt1308,
                    aColorModel3278, anIntArray1307, 0,
                    anInt1322);
            anImageConsumer3289.imageComplete(2);
            if (bool != false)
                aRSString_3281 = null;
        }
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer) {
        if (imageconsumer == anImageConsumer3289)
            anImageConsumer3289 = null;
        anInt3261++;
    }

    public static void method1364(int i, int i_1_) {
        if (i_1_ >= -54)
            aRSString_3271 = null;
        anInt3264++;
        Class68_Sub22 class68_sub22
                = ((Class68_Sub22)
                Class68_Sub13_Sub8.aClass113_3564.method1678((long) i, 117));
        if (class68_sub22 != null)
            class68_sub22.method647(-17554);
    }

    public static void method1365(RSString[] class100s, short[] is, int i) {
        try {
            anInt3270++;
            Class60.method589(class100s, is, -1 + class100s.length, false, 0);
            int i_2_ = 44 / ((1 - i) / 48);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("ak.Q("
                            + (class100s != null ? "{...}" : "null")
                            + ',' + (is != null ? "{...}" : "null")
                            + ',' + i + ')'));
        }
    }

    public boolean imageUpdate(Image image, int i, int i_3_, int i_4_,
                               int i_5_, int i_6_) {
        anInt3265++;
        return true;
    }

    public synchronized void method1366(int i, int i_7_, byte i_8_, int i_9_,
                                        int i_10_) {
        anInt3262++;
        if (anImageConsumer3289 != null) {
            if (i_8_ != 87)
                aRSString_3272 = null;
            anImageConsumer3289.setPixels(i, i_7_, i_10_, i_9_,
                    aColorModel3278, anIntArray1307,
                    i_7_ * anInt1322 - -i, anInt1322);
            anImageConsumer3289.imageComplete(2);
        }
    }

    public static void method1367(byte i) {
        anInt3269++;
        if (Class16.anInt273 > 0)
            Class68_Sub3.method651((byte) -113);
        else {
            Class106.aClass61_1798 = PlayerDefinition.connection;
            PlayerDefinition.connection = null;
            if (i != -21)
                method1369(-15);
            Class17.method296(40, (byte) -69);
        }
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer) {
        anImageConsumer3289 = imageconsumer;
        imageconsumer.setDimensions(anInt1322, anInt1308);
        anInt3263++;
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(aColorModel3278);
        imageconsumer.setHints(14);
    }

    public void method1356(Component component, int i, int i_11_, int i_12_) {
        anInt1322 = i;
        anInt1308 = i_12_;
        anIntArray1307 = new int[1 + i_12_ * i];
        anInt3266++;
        aColorModel3278 = new DirectColorModel(32, 16711680, 65280, 255);
        anImage1314 = component.createImage(this);
        method1363(false);
        component.prepareImage(anImage1314, this);
        int i_13_ = -100 % ((-80 - i_11_) / 38);
        method1363(false);
        component.prepareImage(anImage1314, this);
        method1363(false);
        component.prepareImage(anImage1314, this);
        this.method1358(25);
    }

    public void method1350(int i, int i_14_, int i_15_, Graphics graphics) {
        method1363(false);
        if (i > 72) {
            graphics.drawImage(anImage1314, i_14_, i_15_, this);
            anInt3259++;
        }
    }

    public static void method1368(byte i) {
        anIntArray3273 = null;
        aLogin_3268 = null;
        aClass68_Sub20_Sub1_Sub1_3276 = null;
        aRSString_3281 = null;
        aRSString_3288 = null;
        int i_16_ = 1 % ((74 - i) / 49);
        aRSString_3279 = null;
        aRSString_3271 = null;
        aRSString_3274 = null;
        aRSString_3272 = null;
        aRSString_3287 = null;
        aRSString_3277 = null;
    }

    public static void method1369(int i) {
        Class85.aRSString_1564 = Class13.aRSString_214;
        Class68_Sub20_Sub14.aRSString_4387 = Animable.aRSString_64;
        Class68_Sub13_Sub36.aRSString_4049 = Class122.aRSString_2118;
        Class125.aRSString_2165 = Class57.aRSString_1072;
        Class68_Sub13_Sub18.aRSString_3731 = Class68_Sub2.aRSString_2792;
        Class58.aRSString_1095 = Class68_Sub13_Sub23.aRSString_3826;
        Class102.aRSString_1751 = Class83.aRSString_1530;
        Class68_Sub7.aRSString_2861 = Class21_Sub1.aRSString_2698;
        Class29.aRSString_535 = Class47.aRSString_939;
        Class68_Sub13_Sub12.aRSString_3635 = Class68_Sub13_Sub9.aRSString_3581;
        Class68_Sub13_Sub26_Sub1.aRSString_4603 = Class114.aRSString_1932;
        Class34.aRSString_598 = Class68_Sub9.aRSString_2885;
        Class85.aRSString_1559 = Class83.aRSString_1524;
        Class52.aRSString_1005 = Class106.aRSString_1808;
        Class84.aRSString_1536 = Class68_Sub28_Sub2.aRSString_4550;
        Class72.aRSString_1306 = Class68_Sub13_Sub7.aRSString_3552;
        GameException.aRSString_2243
                = Class68_Sub13_Sub2.aRSString_3458;
        Class76.aRSString_1347 = Class14.aRSString_243;
        Class68_Sub13_Sub5.aRSString_3517 = Class128.aRSString_2225;
        Class55.aRSString_2053 = Class68_Sub13_Sub31.aRSString_3976;
        Class124.aRSString_2163 = Class68_Sub13_Sub37.aRSString_4061;
        Class119.aRSString_2086 = Class68_Sub20_Sub3.aRSString_4194;
        Class45.aRSString_924 = Class1_Sub7.aRSString_2590;
        Class68_Sub13_Sub29.aRSString_3940 = Class106.aRSString_1810;
        Class68_Sub13_Sub19.aRSString_3740 = Class68_Sub20.aRSString_3088;
        Class48.aRSString_952 = Class68_Sub13_Sub17.aRSString_3720;
        Class97.aRSString_1716 = Class114.aRSString_1926;
        Class1_Sub7.aRSString_2601 = Class68_Sub13_Sub23.aRSString_3819;
        Class68_Sub13_Sub26_Sub1.aRSString_4605 = Class30.aRSString_551;
        Class75_Sub3.aRSString_3324 = Class32.aRSString_567;
        Class68_Sub16.aRSString_3027 = Unknown.aRSString_1611;
        Class51.aRSString_2258 = Class105.aRSString_1792;
        Class68_Sub24.aRSString_3152 = Class97.aRSString_1713;
        Class68_Sub13_Sub5.aRSString_3520 = Class30.aRSString_542;
        Class97.aRSString_1718 = Class68_Sub8.aRSString_2864;
        Class1_Sub6_Sub2.aRSString_3440 = Class101.aRSString_1738;
        PacketParser.aRSString_1867 = Class64.aRSString_1188;
        if (i < -19) {
            Class32.aRSString_562 = Class68_Sub13_Sub12.aRSString_3645;
            Class18.aRSString_296 = Class68_Sub18.aRSString_3048;
            Class78.aRSString_1389 = Class21renamed.aRSString_477;
            Class1_Sub1.aRSString_2405 = Class68_Sub13_Sub8.aRSString_3565;
            aRSString_3272 = Class33.aRSString_585;
            Class74.aRSString_1331 = Class1_Sub6_Sub2.aRSString_3413;
            Class68_Sub13_Sub33.aRSString_3987 = Class80.aRSString_1455;
            Class68_Sub13_Sub29.aRSString_3939 = Class68_Sub18.aRSString_3063;
            Class1_Sub6.aRSString_2573 = Class68_Sub20_Sub10.aRSString_4320;
            Class68_Sub20_Sub18.aRSString_4450 = Class48.aRSString_948;
            Class13_Sub1.aRSString_2633 = Class90.aRSString_2354;
            Class20.aRSString_400 = Class107.aRSString_1818;
            Class68_Sub20_Sub14.aRSString_4386 = Animable.aRSString_64;
            Class7.aRSString_137 = Class56.aRSString_1062;
            aRSString_3288 = aRSString_3287;
            Class68_Sub13_Sub19.aRSString_3742
                    = PacketStream.aRSString_4120;
            Class55.aRSString_2059 = Class78.aRSString_1387;
            Class20.aRSString_401 = Class68_Sub26.aRSString_3184;
            Class50.aRSString_985 = Class68_Sub20_Sub13_Sub2.aRSString_4622;
            anInt3280++;
            Class57.aRSString_1081 = Class68_Sub5.aRSString_2832;
            Class71.aRSString_1289 = Class68_Sub13_Sub24.aRSString_3847;
            Class68_Sub13_Sub24.aRSString_3834 = Class68_Sub18.aRSString_3043;
            Class118.aRSString_2083 = Class75.aRSString_1340;
            Class86.aRSString_1574 = Class68.aRSString_1230;
            Class74.aRSString_1338 = Class68_Sub13_Sub26.aRSString_3878;
            Class18.aRSString_309 = Class68_Sub18.aRSString_3048;
            RSString.aRSString_2317 = Class75_Sub1_Sub1.aRSString_4587;
            Login.aRSString_1521 = Class68_Sub28_Sub2.aRSString_4549;
            Class68_Sub8.aRSString_2866 = Class68_Sub13_Sub34.aRSString_4014;
            Class75_Sub2.aRSString_3317 = Class75_Sub2.aRSString_3307;
            Class69.aRSString_1236 = Class101.aRSString_1740;
            Class75_Sub3.aRSString_3321 = Class108.aRSString_1831;
            Class67.aRSString_1213 = Class68_Sub13_Sub13.aRSString_3650;
            Class118.aRSString_2080 = Class68_Sub13_Sub9.aRSString_3577;
            Class75.aRSString_1341 = Class104.aRSString_1775;
            Class13_Sub2.aRSString_2647 = Class84.aRSString_1539;
            Class45.aRSString_920 = Class68_Sub20_Sub17.aRSString_4438;
            Class59.aRSString_1108 = Class91.aRSString_1642;
            Class68_Sub13_Sub21.aRSString_3795 = Class75_Sub2.aRSString_3309;
            Class68_Sub13_Sub11.aRSString_3627
                    = Class68_Sub13_Sub8.aRSString_3566;
            Class68_Sub13_Sub11.aRSString_3611
                    = Class68_Sub13_Sub8.aRSString_3566;
            Class68_Sub13_Sub3.aRSString_3472 = Class124.aRSString_2148;
            Class122.aRSString_2112 = Class50.aRSString_988;
            aRSString_3277 = Class68_Sub13_Sub20.aRSString_3781;
            Class68_Sub3.aRSString_2807 = Class75_Sub3.aRSString_3318;
            Class124.aRSString_2136 = GroundData.aRSString_656;
            Class127.aRSString_2208 = Class84.aRSString_1538;
            Class68_Sub20_Sub14.aRSString_4376 = Class14.aRSString_224;
            Class67.aRSString_1207 = Class68_Sub13_Sub13.aRSString_3657;
            Login.aRSString_1507 = Class37.aRSString_655;
            Class68_Sub13_Sub25.aRSString_3868
                    = Class68_Sub13_Sub14.aRSString_3669;
            Class120.aRSString_2092 = Class12.aRSString_198;
            Class68_Sub13_Sub20.aRSString_3782
                    = Class1_Sub6_Sub2.aRSString_3429;
            Class68_Sub20_Sub13_Sub2.aRSString_4624
                    = Class68_Sub13_Sub26_Sub1.aRSString_4613;
            Class68_Sub28_Sub1.aRSString_4509 = ItemDef.aRSString_368;
        }
    }

    public void method1359(Graphics graphics, boolean bool, int i, int i_17_,
                           int i_18_, int i_19_) {
        anInt3275++;
        method1366(i_17_, i_18_, (byte) 87, i_19_, i);
        Shape shape = graphics.getClip();
        if (bool != true)
            method1368((byte) 40);
        graphics.clipRect(i_17_, i_18_, i, i_19_);
        graphics.drawImage(anImage1314, 0, 0, this);
        graphics.setClip(shape);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
        anInt3286++;
    }

    static {
        aRSString_3272 = aRSString_3274;
        aRSString_3287 = RSString.newRsString("scrollen:");
        aRSString_3281 = RSString.newRsString("scroll:");
        aRSString_3288 = aRSString_3281;
        aRSString_3279 = RSString.newRsString("Allocating memory");
        aRSString_3271 = aRSString_3281;
        aRSString_3277 = aRSString_3279;
    }
}
