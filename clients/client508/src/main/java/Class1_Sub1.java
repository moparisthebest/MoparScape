/* Class1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub1 extends Animable {
    public int anInt2386;
    public int anInt2387;
    public int anInt2388;
    public double aDouble2389;
    public double aDouble2390;
    public static int anInt2391;
    public boolean aBoolean2392 = false;
    public int anInt2393;
    public double aDouble2394;
    public static Login aLogin_2395;
    public int anInt2396;
    public double aDouble2397;
    public double aDouble2398;
    public static int anInt2399;
    public static RSString aRSString_2400;
    public static int anInt2401;
    public int anInt2402;
    public double aDouble2403;
    public static int anInt2404;
    public static RSString aRSString_2405;
    public double aDouble2406;
    public int anInt2407;
    public int anInt2408;
    public double aDouble2409;
    public Class55 aClass55_2410;
    public static RSString aRSString_2411;
    public static int anInt2412 = 1;
    public int anInt2413 = -32768;
    public static boolean aBoolean2414;
    public static int anInt2415;
    public static int anInt2416;
    public int anInt2417;
    public int anInt2418;
    public int anInt2419 = 0;
    public int anInt2420;
    public int anInt2421;
    public int anInt2422;
    public static int anInt2423;
    public static int anInt2424;
    public int anInt2425;
    public static int anInt2426;
    public static Class21renamed aClass21_2427;
    public static int anInt2428;

    public static void method63(int i, int i_0_) {
        if ((i_0_ ^ 0xffffffff) == 0 && !Class123.aBoolean2127)
            Class68_Sub13_Sub13.method760(16777215);
        else if ((i_0_ ^ 0xffffffff) != 0
                && ((Class101.anInt1745 ^ 0xffffffff) != (i_0_ ^ 0xffffffff)
                || !PacketParser.method1664(20778))
                && Class68_Sub13_Sub25.anInt3855 != 0
                && !Class123.aBoolean2127)
            PacketParser.method1662(false, 0, 2, i_0_, Class21renamed.aClass21_Sub1_459,
                    false, Class68_Sub13_Sub25.anInt3855);
        if (i <= 0)
            method63(-56, -73);
        Class101.anInt1745 = i_0_;
        anInt2428++;
    }

    public void method64(int i, byte i_1_, int i_2_, int i_3_, int i_4_) {
        if (!aBoolean2392) {
            double d = (double) (i + -anInt2387);
            double d_5_ = (double) (i_2_ + -anInt2388);
            double d_6_ = Math.sqrt(d_5_ * d_5_ + d * d);
            aDouble2406 = (double) anInt2387 + d * (double) anInt2396 / d_6_;
            aDouble2390 = (double) anInt2425;
            aDouble2398
                    = d_5_ * (double) anInt2396 / d_6_ + (double) anInt2388;
        }
        anInt2391++;
        double d = (double) (anInt2408 - (-1 - -i_4_));
        aDouble2409 = ((double) i_2_ - aDouble2398) / d;
        aDouble2397 = (-aDouble2406 + (double) i) / d;
        aDouble2403
                = Math.sqrt(aDouble2397 * aDouble2397 + aDouble2409 * aDouble2409);
        if (i_1_ < -2) {
            if (!aBoolean2392)
                aDouble2389
                        = -aDouble2403 * Math.tan(0.02454369 * (double) anInt2386);
            aDouble2394 = (((double) i_3_ - aDouble2390 - d * aDouble2389)
                    * 2.0 / (d * d));
        }
    }

    public static void method65(int i, int i_7_, byte i_8_, Class45 class45,
                                int i_9_) {
        if (Class68_Sub9.anInt2882 < 3)
            ((Sprite) Class116.aClass68_Sub20_Sub10_2019)
                    .method1119
                            (i_9_, i, class45.anInt892, class45.anInt873,
                                    Class116.aClass68_Sub20_Sub10_2019.anInt4309 / 2,
                                    Class116.aClass68_Sub20_Sub10_2019.anInt4311 / 2,
                                    Class8.anInt163, 256, class45.anIntArray854,
                                    class45.anIntArray783);
        else
            Class79.method1419(i_9_, i, 0, class45.anIntArray854,
                    class45.anIntArray783);
        anInt2399++;
        Class68_Sub17.aBooleanArray3037[i_7_] = true;
        if (i_8_ != -123)
            aLogin_2395 = null;
    }

    public void method66(int i, boolean bool) {
        aDouble2406 += (double) i * aDouble2397;
        aBoolean2392 = true;
        if (bool == false) {
            aDouble2398 += (double) i * aDouble2409;
            anInt2404++;
            aDouble2390 += ((double) i * (0.5 * aDouble2394 * (double) i)
                    + aDouble2389 * (double) i);
            aDouble2389 += aDouble2394 * (double) i;
            anInt2407 = ((int) (325.949 * Math.atan2(aDouble2397, aDouble2409))
                    - -1024) & 0x7ff;
            anInt2421 = ((int) (Math.atan2(aDouble2389, aDouble2403) * 325.949)
                    & 0x7ff);
            if (aClass55_2410 != null) {
                anInt2418 += i;
                while (anInt2418 > aClass55_2410.anIntArray2058[anInt2419]) {
                    anInt2418 -= aClass55_2410.anIntArray2058[anInt2419];
                    anInt2419++;
                    if (aClass55_2410.anIntArray2035.length <= anInt2419) {
                        anInt2419 -= aClass55_2410.anInt2072;
                        if ((anInt2419 ^ 0xffffffff) > -1
                                || (aClass55_2410.anIntArray2035.length
                                <= anInt2419))
                            anInt2419 = 0;
                    }
                }
            }
        }
    }

    public void method51(int i, int i_10_, int i_11_, int i_12_, int i_13_,
                         int i_14_, int i_15_, int i_16_, long l) {
        anInt2423++;
        Class1_Sub3 class1_sub3 = method67((byte) 46);
        if (class1_sub3 != null) {
            class1_sub3.method51(i, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_,
                    i_16_, l);
            anInt2413 = class1_sub3.method56();
        }
    }

    public Class1_Sub3 method67(byte i) {
        anInt2415++;
        int i_17_ = -10 % ((-36 - i) / 62);
        Class70 class70 = Class68_Sub20_Sub13.method1160(anInt2402, 1);
        Class1_Sub3 class1_sub3 = class70.method1337(anInt2419, -10);
        if (class1_sub3 == null)
            return null;
        class1_sub3.method78(anInt2421);
        return class1_sub3;
    }

    public static void method68(byte i) {
        if (i != -96)
            anInt2424 = -18;
        Class75_Sub1.aClass98_3294.method1566((byte) 94);
        Class123.aClass98_2129.method1566((byte) 94);
        anInt2416++;
        Class45.aClass98_918.method1566((byte) 94);
    }

    public int method56() {
        anInt2401++;
        return anInt2413;
    }

    public static void method69(boolean bool) {
        if (bool == true) {
            aRSString_2411 = null;
            aLogin_2395 = null;
            aRSString_2400 = null;
            aClass21_2427 = null;
            aRSString_2405 = null;
        }
    }

    public Class1_Sub1(int i, int i_18_, int i_19_, int i_20_, int i_21_,
                       int i_22_, int i_23_, int i_24_, int i_25_, int i_26_,
                       int i_27_) {
        anInt2418 = 0;
        anInt2402 = i;
        aBoolean2392 = false;
        anInt2388 = i_20_;
        anInt2386 = i_24_;
        anInt2393 = i_22_;
        anInt2420 = i_27_;
        anInt2396 = i_25_;
        anInt2408 = i_23_;
        anInt2417 = i_26_;
        anInt2387 = i_19_;
        anInt2425 = i_21_;
        anInt2422 = i_18_;
        int i_28_ = Class68_Sub20_Sub13.method1160(anInt2402, 1).anInt1282;
        if ((i_28_ ^ 0xffffffff) == 0)
            aClass55_2410 = null;
        else
            aClass55_2410 = Class64.method624((byte) -36, i_28_);
    }

    static {
        aRSString_2400 = RSString.newRsString("Location");
        aBoolean2414 = false;
        aRSString_2411 = RSString.newRsString("::rect_debug");
        aRSString_2405 = aRSString_2400;
        aLogin_2395 = new Login(64);
        anInt2424 = -8 + (int) (Math.random() * 17.0);
    }
}
