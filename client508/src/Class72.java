/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public abstract class Class72 {
    public static int anInt1301;
    public static RSString aRSString_1302 = RSString.newRsString("www");
    public static int anInt1303;
    public static int anInt1304;
    public static Class65 aClass65_1305;
    public static RSString aRSString_1306;
    public int[] anIntArray1307;
    public int anInt1308;
    public static int anInt1309;
    public static int anInt1310;
    public static int[][][] anIntArrayArrayArray1311;
    public static Class16 aClass16_1312;
    public static int anInt1313;
    public Image anImage1314;
    public static int anInt1315;
    public static int anInt1316;
    public static int anInt1317;
    public static RSString aRSString_1318
            = RSString.newRsString("Connection lost)3");
    public static int anInt1319;
    public static int anInt1320;
    public static int anInt1321;
    public int anInt1322;

    public static void method1347(boolean bool) {
        anInt1313++;
        Class75_Sub3_Sub1.anInt4595 = 0;
        Class68_Sub20_Sub16.anInt4418 = 0;
        Class22.method373((byte) -67);
        Class68_Sub13_Sub7.method732(19114);
        Unknown.method1505((byte) -11);
        for (int i = 0; i < Class75_Sub3_Sub1.anInt4595; i++) {
            int i_0_ = Class68_Sub13_Sub14.anIntArray3666[i];
            if (Class102.aClass1_Sub6_Sub1Array1746[i_0_].anInt2575
                    != Class68_Sub3.anInt2812) {
                if (Class102.aClass1_Sub6_Sub1Array1746[i_0_].aClass80_3395
                        .method1444(0))
                    Class68_Sub13_Sub4.method717((Class102
                            .aClass1_Sub6_Sub1Array1746
                            [i_0_]),
                            2);
                Class102.aClass1_Sub6_Sub1Array1746[i_0_].aClass80_3395 = null;
                Class102.aClass1_Sub6_Sub1Array1746[i_0_] = null;
            }
        }
        if (Class106.anInt1804
                != Class68_Sub13_Sub8.inStream.currentOffset)
            throw new RuntimeException("gnp1 pos:"
                    + (Class68_Sub13_Sub8
                    .inStream.currentOffset)
                    + " psize:" + Class106.anInt1804);
        if (bool != false)
            aRSString_1302 = null;
        for (int i = 0;
             (i ^ 0xffffffff) > (Class13_Sub2.anInt2645 ^ 0xffffffff); i++) {
            if ((Class102.aClass1_Sub6_Sub1Array1746
                    [Class68_Sub10.anIntArray2906[i]])
                    == null)
                throw new RuntimeException("gnp2 pos:" + i + " size:"
                        + Class13_Sub2.anInt2645);
        }
    }

    public static void method1348(int i) {
        anInt1316++;
        int i_1_ = Class52.anInt1013;
        int i_2_ = Class68_Sub13_Sub25.anInt3858;
        if (i != 0)
            aClass16_1312 = null;
        int i_3_
                = Class68_Sub20_Sub17.anInt4437 + -Class13_Sub3.width + -i_1_;
        int i_4_ = -i_2_ + (Class21renamed.anInt479 + -Class68_Sub13_Sub9.height);
        do {
            if ((i_1_ ^ 0xffffffff) < -1 || (i_3_ ^ 0xffffffff) < -1
                    || (i_2_ ^ 0xffffffff) < -1 || (i_4_ ^ 0xffffffff) < -1) {
                try {
                    int i_5_ = 0;
                    java.awt.Container container;
                    if (Class1_Sub2.aFrame2429 == null) {
                        if (Class108.aFrame1832 != null)
                            container = Class108.aFrame1832;
                        else
                            container
                                    = Class75_Sub1_Sub1.signlink.anApplet1042;
                    } else
                        container = Class1_Sub2.aFrame2429;
                    int i_6_ = 0;
                    if (container == Class108.aFrame1832) {
                        Insets insets = Class108.aFrame1832.getInsets();
                        i_6_ = insets.left;
                        i_5_ = insets.top;
                    }
                    Graphics graphics = container.getGraphics();
                    graphics.setColor(Color.black);
                    if (i_1_ > 0)
                        graphics.fillRect(i_6_, i_5_, i_1_, Class21renamed.anInt479);
                    if (i_2_ > 0)
                        graphics.fillRect(i_6_, i_5_,
                                Class68_Sub20_Sub17.anInt4437, i_2_);
                    if (i_3_ > 0)
                        graphics.fillRect((i_6_ + Class68_Sub20_Sub17.anInt4437
                                + -i_3_),
                                i_5_, i_3_, Class21renamed.anInt479);
                    if ((i_4_ ^ 0xffffffff) >= -1)
                        break;
                    graphics.fillRect(i_6_, Class21renamed.anInt479 + (i_5_ + -i_4_),
                            Class68_Sub20_Sub17.anInt4437, i_4_);
                } catch (Exception exception) {
                    break;
                }
                break;
            }
        } while (false);
    }

    public static int method1349(Class1_Sub6_Sub1 class1_sub6_sub1,
                                 boolean bool) {
        anInt1309++;
        if (bool != false)
            anInt1321 = 75;
        Class80 class80 = class1_sub6_sub1.aClass80_3395;
        if (class80.anIntArray1431 != null) {
            class80 = class80.method1447(-94);
            if (class80 == null)
                return -1;
        }
        int i = class80.anInt1430;
        if (class1_sub6_sub1.anInt2524 != class1_sub6_sub1.anInt2530) {
            if (class1_sub6_sub1.anInt2524 == class1_sub6_sub1.anInt2540)
                i = class80.anInt1471;
        } else
            i = class80.anInt1429;
        return i;
    }

    public abstract void method1350(int i, int i_7_, int i_8_,
                                    Graphics graphics);

    public static void method1351(byte i) {
        aRSString_1306 = null;
        anIntArrayArrayArray1311 = null;
        aClass16_1312 = null;
        aRSString_1302 = null;
        aClass65_1305 = null;
        if (i < 75)
            method1352(52);
        aRSString_1318 = null;
    }

    public static void method1352(int i) {
        anInt1304++;
        int i_9_ = -15 / ((i - 7) / 57);
        Class68_Sub20_Sub12.aClass98_4348.method1567(-120);
        Class52.aClass98_1000.method1567(-64);
        Class68_Sub13_Sub20.aClass98_3765.method1567(-128);
        Class68_Sub13_Sub37.aClass98_4064.method1567(-121);
    }

    public static void method1353(int i, int i_10_, int i_11_, int i_12_,
                                  int i_13_, int i_14_, int i_15_, int i_16_) {
        anInt1315++;
        int i_17_ = i_13_ + i;
        int i_18_ = i_11_ + -i;
        int i_19_ = -i + i_14_;
        int i_20_ = i + i_10_;
        for (int i_21_ = i_13_; i_21_ < i_17_; i_21_++)
            Class34.method416(i_10_, (byte) -17, i_12_,
                    Class68_Sub22.anIntArrayArray3132[i_21_], i_14_);
        if (i_16_ == -17229) {
            for (int i_22_ = i_11_;
                 (i_18_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff); i_22_--)
                Class34.method416(i_10_, (byte) -17, i_12_,
                        Class68_Sub22.anIntArrayArray3132[i_22_],
                        i_14_);
            for (int i_23_ = i_17_;
                 (i_18_ ^ 0xffffffff) <= (i_23_ ^ 0xffffffff); i_23_++) {
                int[] is = Class68_Sub22.anIntArrayArray3132[i_23_];
                Class34.method416(i_10_, (byte) -17, i_12_, is, i_20_);
                Class34.method416(i_20_, (byte) -17, i_15_, is, i_19_);
                Class34.method416(i_19_, (byte) -17, i_12_, is, i_14_);
            }
        }
    }

    public static void method1354(RSString class100, int i) {
        anInt1319++;
        int i_24_ = Class68_Sub13_Sub31.method858(64, class100);
        if (i != i_24_) {
            Class3.anInt85 = (-Class70.anInt1273
                    + Class102.aClass91_1756.aShortArray1631[i_24_]);
            int i_25_ = (Class3.anInt85
                    - (int) ((float) Class68.aClass45_1231.anInt892
                    / Class68_Sub9.aFloat2892));
            int i_26_ = (Class3.anInt85
                    - -(int) ((float) Class68.aClass45_1231.anInt892
                    / Class68_Sub9.aFloat2892));
            Class68_Sub22.anInt3145
                    = (Class68_Sub1.anInt2760
                    - Class102.aClass91_1756.aShortArray1634[i_24_]
                    + (Class103.anInt1768 - 1));
            int i_27_ = (-(int) ((float) Class68.aClass45_1231.anInt873
                    / Class68_Sub9.aFloat2892)
                    + Class68_Sub22.anInt3145);
            if ((i_25_ ^ 0xffffffff) > -1)
                Class3.anInt85 = (int) ((float) Class68.aClass45_1231.anInt892
                        / Class68_Sub9.aFloat2892);
            if ((i_26_ ^ 0xffffffff) < (Class68_Sub6.anInt2846 ^ 0xffffffff))
                Class3.anInt85
                        = (-(int) ((float) Class68.aClass45_1231.anInt892
                        / Class68_Sub9.aFloat2892)
                        + Class68_Sub6.anInt2846);
            int i_28_ = ((int) ((float) Class68.aClass45_1231.anInt873
                    / Class68_Sub9.aFloat2892)
                    + Class68_Sub22.anInt3145);
            if (i_27_ < 0)
                Class68_Sub22.anInt3145
                        = (int) ((float) Class68.aClass45_1231.anInt873
                        / Class68_Sub9.aFloat2892);
            if ((Class103.anInt1768 ^ 0xffffffff) > (i_28_ ^ 0xffffffff))
                Class68_Sub22.anInt3145
                        = -(int) ((float) Class68.aClass45_1231.anInt873
                        / Class68_Sub9.aFloat2892) + Class103.anInt1768;
        }
    }

    public static Class21_Sub1 method1355(byte i, boolean bool, boolean bool_29_, int i_30_, boolean bool_31_) {
        int i_32_ = 28 % ((-13 - i) / 59);
        anInt1310++;
        Unknown unknown = null;
        if (Class68_Sub20_Sub10.aClass124_4318 != null)
            unknown = new Unknown(i_30_, Class68_Sub20_Sub10.aClass124_4318,
                    Class26.aClass124Array520[i_30_], 1000000);
        return new Class21_Sub1(unknown, Class43.aUnknown_734, i_30_, bool,
                bool_29_, bool_31_);
    }

    public abstract void method1356(Component component, int i, int i_33_,
                                    int i_34_);

    public static int method1357(int i, int i_35_, byte[] is) {
        anInt1320++;
        if (i_35_ != -1)
            return 65;
        return Class64.method622(i, false, 0, is);
    }

    public void method1358(int i) {
        anInt1303++;
        Class79.method1432(anIntArray1307, anInt1322, anInt1308);
        if (i < 7)
            anInt1321 = 45;
    }

    public abstract void method1359(Graphics graphics, boolean bool, int i,
                                    int i_36_, int i_37_, int i_38_);

    public static void method1360(Class21_Sub1 class21_sub1, int i,
                                  int i_39_) {
        anInt1317++;
        if (Class50.aStream_979 != null) {
            Class50.aStream_979.currentOffset = i_39_ * 8 - -5;
            int i_40_ = Class50.aStream_979.readDWord();
            int i_41_ = Class50.aStream_979.readDWord();
            class21_sub1.method368(i_41_, (byte) 80, i_40_);
        } else {
            if (i != -5720)
                aClass65_1305 = null;
            GameException.method1798(true, 0, 255, (byte) 0, 255, null,
                    (byte) 22);
            Class68_Sub20.aClass21_Sub1Array3081[i_39_] = class21_sub1;
        }
    }

    public static Class50 method1361(int i) {
        if (i >= -4)
            method1349(null, false);
        anInt1301++;
        try {
            //return (Class50) Class.forName("Class50_Sub1").newInstance();
            return new Class50_Sub1();
        } catch (Throwable throwable) {
            return new Class50_Sub2();
        }
    }

    static {
        aRSString_1306 = aRSString_1318;
        aClass16_1312 = new Class16();
    }
}
