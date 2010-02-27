/* Class1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class1_Sub1 extends Animable
{
    private int anInt2388;
    private int anInt2389;
    private int anInt2390;
    private double aDouble2391;
    double aDouble2392;
    static int anInt2393;
    private boolean aBoolean2394 = false;
    int anInt2395;
    private double aDouble2396;
    static Login aClass82_2397;
    private int anInt2398;
    private double aDouble2399;
    double aDouble2400;
    static int anInt2401;
    private static MutableString aClass100_2402;
    static int anInt2403;
    private int anInt2404;
    private double aDouble2405;
    static int anInt2406;
    static MutableString aClass100_2407;
    double aDouble2408;
    int anInt2409;
    int anInt2410;
    private double aDouble2411;
    private Animation aClass117_2412;
    static MutableString aClass100_2413;
    static int anInt2414 = 1;
    private int anInt2415 = -32768;
    static boolean aBoolean2416;
    static int anInt2417;
    static int anInt2418;
    int anInt2419;
    private int anInt2420;
    private int anInt2421 = 0;
    int anInt2422;
    private int anInt2423;
    int anInt2424;
    static int anInt2425;
    static int anInt2426;
    private int anInt2427;
    static int anInt2428;
    static Class21 aClass21_2429;
    static int anInt2430;

    static final void method63(int i, int i_0_)
    {
        if (i_0_ == -1 && !Keyboard.aBoolean2129)
            Class68_Sub13_Sub13.method760(16777215);
        else if (i_0_ != -1 && (Class101.anInt1747 != i_0_ || !Class111.method1670(20778)) && Class68_Sub13_Sub25.anInt3857 != 0 && !Keyboard.aBoolean2129)
            Class111.method1668(false, 0, 2, i_0_, Class21.aClass21_Sub1_459, false, Class68_Sub13_Sub25.anInt3857);
        if (i <= 0)
            method63(-56, -73);
        Class101.anInt1747 = i_0_;
        anInt2430++;
    }

    final void method64(int i, byte i_1_, int i_2_, int i_3_, int i_4_)
    {
        if (!aBoolean2394)
        {
            double d = (double) (i - anInt2389);
            double d_5_ = (double) (i_2_ - anInt2390);
            double d_6_ = Math.sqrt(d_5_ * d_5_ + d * d);
            ((Class1_Sub1) this).aDouble2408 = (double) anInt2389 + d * (double) anInt2398 / d_6_;
            ((Class1_Sub1) this).aDouble2392 = (double) anInt2427;
            ((Class1_Sub1) this).aDouble2400 = d_5_ * (double) anInt2398 / d_6_ + (double) anInt2390;
        }
        anInt2393++;
        double d = (double) (((Class1_Sub1) this).anInt2410 - (i_4_ - 1));
        aDouble2411 = ((double) i_2_ - ((Class1_Sub1) this).aDouble2400) / d;
        aDouble2399 = (-((Class1_Sub1) this).aDouble2408 + (double) i) / d;
        aDouble2405 = Math.sqrt(aDouble2399 * aDouble2399 + aDouble2411 * aDouble2411);
        if (i_1_ < -2)
        {
            if (!aBoolean2394)
                aDouble2391 = -aDouble2405 * Math.tan(0.02454369 * (double) anInt2388);
            aDouble2396 = ((double) i_3_ - ((Class1_Sub1) this).aDouble2392 - d * aDouble2391) * 2.0 / (d * d);
        }
    }

    static final void method65(int i, int i_7_, byte i_8_, Widget class45, int i_9_)
    {
        do
        {
            try
            {
                do
                {
                    if (Class68_Sub9.anInt2884 < 3)
                    {
                        ((Sprite) ObjectDefinition.aClass68_Sub20_Sub10_2021).method1119(i_9_, i, ((Widget) class45).anInt892, ((Widget) class45).anInt873, (((Class68_Sub20_Sub10) ObjectDefinition.aClass68_Sub20_Sub10_2021).width / 2), (((Class68_Sub20_Sub10) ObjectDefinition.aClass68_Sub20_Sub10_2021).height / 2), Class8.minimapInt2, 256, ((Widget) class45).anIntArray854, ((Widget) class45).anIntArray783);
                        if (client.anInt2387 == 0)
                            break;
                    }
                    Class79.method1425(i_9_, i, 0, ((Widget) class45).anIntArray854, ((Widget) class45).anIntArray783);
                } while (false);
                anInt2401++;
                Class68_Sub17.aBooleanArray3039[i_7_] = true;
                if (i_8_ == -123)
                    break;
                aClass82_2397 = null;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("b.J(" + i + ',' + i_7_ + ',' + i_8_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_9_ + ')'));
            }
            break;
        } while (false);
    }

    final void method66(int i, boolean bool)
    {
        ((Class1_Sub1) this).aDouble2408 += (double) i * aDouble2399;
        aBoolean2394 = true;
        if (bool == false)
        {
            ((Class1_Sub1) this).aDouble2400 += (double) i * aDouble2411;
            anInt2406++;
            ((Class1_Sub1) this).aDouble2392 += ((double) i * (0.5 * aDouble2396 * (double) i) + aDouble2391 * (double) i);
            aDouble2391 += aDouble2396 * (double) i;
            ((Class1_Sub1) this).anInt2409 = ((int) (325.949 * Math.atan2(aDouble2399, aDouble2411)) + 1024) & 0x7ff;
            anInt2423 = ((int) (Math.atan2(aDouble2391, aDouble2405) * 325.949) & 0x7ff);
            if (aClass117_2412 != null)
            {
                anInt2420 += i;
                while (anInt2420 > (((Animation) aClass117_2412).anIntArray2060[anInt2421]))
                {
                    anInt2420 -= (((Animation) aClass117_2412).anIntArray2060[anInt2421]);
                    anInt2421++;
                    if (((Animation) aClass117_2412).anIntArray2037.length <= anInt2421)
                    {
                        anInt2421 -= ((Animation) aClass117_2412).anInt2074;
                        if (anInt2421 < 0 || (((Animation) aClass117_2412).anIntArray2037).length <= anInt2421)
                            anInt2421 = 0;
                    }
                }
            }
        }
    }

    final void render(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, long l)
    {
        anInt2425++;
        Model class1_sub3 = method67((byte) 46);
        if (class1_sub3 != null)
        {
            class1_sub3.render(i, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, l);
            anInt2415 = class1_sub3.method56();
        }
    }

    private final Model method67(byte i)
    {
        anInt2417++;
        int i_17_ = -10 % ((-36 - i) / 62);
        Class70 class70 = Class68_Sub20_Sub13.method1160(anInt2404, 1);
        Model class1_sub3 = class70.method1337(anInt2421, -10);
        if (class1_sub3 == null)
            return null;
        class1_sub3.method78(anInt2423);
        return class1_sub3;
    }

    static final void method68(byte i)
    {
        if (i != -96)
            anInt2426 = -18;
        Class75_Sub1.itemDefinitionNodes.method1572((byte) 94);
        Keyboard.aClass98_2131.method1572((byte) 94);
        anInt2418++;
        Widget.aClass98_918.method1572((byte) 94);
    }

    final int method56()
    {
        anInt2403++;
        return anInt2415;
    }

    public static void method69(boolean bool)
    {
        if (bool == true)
        {
            aClass100_2413 = null;
            aClass82_2397 = null;
            aClass100_2402 = null;
            aClass21_2429 = null;
            aClass100_2407 = null;
        }
    }

    Class1_Sub1(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_)
    {
        anInt2420 = 0;
        anInt2404 = i;
        aBoolean2394 = false;
        anInt2390 = i_20_;
        anInt2388 = i_24_;
        ((Class1_Sub1) this).anInt2395 = i_22_;
        ((Class1_Sub1) this).anInt2422 = i_27_;
        anInt2398 = i_25_;
        ((Class1_Sub1) this).anInt2410 = i_23_;
        ((Class1_Sub1) this).anInt2419 = i_26_;
        anInt2389 = i_19_;
        anInt2427 = i_21_;
        ((Class1_Sub1) this).anInt2424 = i_18_;
        int i_28_ = (((Class70) Class68_Sub20_Sub13.method1160(anInt2404, 1)).anInt1282);
        if (i_28_ == -1)
            aClass117_2412 = null;
        else
            aClass117_2412 = Object1.getAnimation(i_28_);
    }

    static
    {
        aClass100_2402 = Class112.makeMutableString(43, "Location");
        aBoolean2416 = false;
        aClass100_2413 = Class112.makeMutableString(43, "::rect_debug");
        aClass100_2407 = aClass100_2402;
        aClass82_2397 = new Login(64);
        anInt2426 = (int) (Math.random() * 17.0) - 8;
    }
}
