/* Class13_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class13_Sub4 extends Class13 {
    public int anInt2676;
    public static int anInt2677;
    public int anInt2678;
    public int anInt2679;
    public static int anInt2680;
    public int anInt2681;
    public static int anInt2682 = 0;
    public int anInt2683;
    public static int anInt2684;
    public int anInt2685;
    public int anInt2686;
    public static int anInt2687;
    public int anInt2688;
    public static int anInt2689;
    public static int anInt2690 = 0;
    public static int anInt2691;

    public void method245(boolean bool, int i, int i_0_) {
        int i_1_ = i * anInt2676 >> -891261044;
        anInt2689++;
        int i_2_ = anInt2681 * i >> -1931743604;
        int i_3_ = i_0_ * anInt2685 >> -457698516;
        int i_4_ = anInt2683 * i_0_ >> -559875604;
        int i_5_ = i * anInt2678 >> 1874872492;
        int i_6_ = i_0_ * anInt2679 >> -921279860;
        int i_7_ = anInt2686 * i_0_ >> -1294546068;
        int i_8_ = i * anInt2688 >> -2028756724;
        Class68_Sub25.method1212(i_2_, (byte) -119, i_3_, i_4_, i_1_, i_8_,
                i_6_, anInt220, i_7_, i_5_);
        if (bool != true)
            method245(false, -1, 2);
    }

    public void method243(int i, int i_9_, int i_10_) {
        anInt2677++;
        if (i_9_ != 23700)
            anInt2682 = -52;
    }

    public void method244(int i, int i_11_, int i_12_) {
        int i_13_ = -39 % ((i_11_ - -49) / 43);
        anInt2684++;
    }

    public static void method264(int i) {
        anInt2680++;
        if (i != -1)
            method264(84);
        for (Class68_Sub20_Sub5 class68_sub20_sub5
                     = ((Class68_Sub20_Sub5)
                Class105.aClass16_1790.method293((byte) 76));
             class68_sub20_sub5 != null;
             class68_sub20_sub5
                     = ((Class68_Sub20_Sub5)
                     Class105.aClass16_1790.method290((byte) 34))) {
            Class1_Sub5 class1_sub5 = class68_sub20_sub5.aClass1_Sub5_4222;
            if (GameSocket.anInt1149 != class1_sub5.anInt2506
                    || class1_sub5.aBoolean2512)
                class68_sub20_sub5.method647(-17554);
            else if ((Class68_Sub3.anInt2812 ^ 0xffffffff)
                    <= (class1_sub5.anInt2503 ^ 0xffffffff)) {
                class1_sub5.method139(Class109.anInt1844, false);
                if (!class1_sub5.aBoolean2512)
                    Class68_Sub20_Sub4.method1061(class1_sub5.anInt2506,
                            class1_sub5.anInt2513,
                            class1_sub5.anInt2505,
                            class1_sub5.anInt2493, 60,
                            class1_sub5, 0, -1L, false);
                else
                    class68_sub20_sub5.method647(-17554);
            }
        }
    }

    public Class13_Sub4(int i, int i_14_, int i_15_, int i_16_, int i_17_,
                        int i_18_, int i_19_, int i_20_, int i_21_,
                        int i_22_) {
        super(-1, i_21_, i_22_);
        anInt2681 = i_15_;
        anInt2688 = i_19_;
        anInt2676 = i;
        anInt2683 = i_16_;
        anInt2679 = i_18_;
        anInt2686 = i_20_;
        anInt2678 = i_17_;
        anInt2685 = i_14_;
    }
}
