/* Class68_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub1 extends Class68 {
    public static RSString[] aRSStringArray2754 = new RSString[200];
    public static Stream[] aStreamArray2755
            = new Stream[2048];
    public static int anInt2756;
    public Class64 aClass64_2757;
    public Class7 aClass7_2758;
    public Class57 aClass57_2759;
    public static int anInt2760;
    public static RSString aRSString_2761 = RSString.newRsString("Cabbage");
    public static int anInt2762;
    public int anInt2763;
    public Class76 aClass76_2764;
    public int anInt2765;
    public int[] anIntArray2766;
    public int anInt2767;
    public int anInt2768;
    public boolean aBoolean2769;
    public boolean aBoolean2770;
    public int anInt2771;
    public Class69[] aClass69Array2772 = new Class69[5];
    public int anInt2773;
    public int anInt2774;
    public static int anInt2775;
    public int anInt2776;
    public Class47 aClass47_2777;
    public int anInt2778;
    public Class77 aClass77_2779;
    public Class68_Sub1 aClass68_Sub1_2780;
    public boolean aBoolean2781;
    public int anInt2782;

    public static void method648(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 int i_4_, int i_5_, int i_6_, int i_7_,
                                 int i_8_, int i_9_, int i_10_, int i_11_,
                                 int i_12_, int i_13_, int i_14_, int i_15_,
                                 int i_16_, int i_17_, int i_18_) {
        if (i_2_ == 0) {
            Class7 class7
                    = new Class7(i_9_, i_10_, i_11_, i_12_, -1, i_17_, false);
            for (int i_19_ = i; i_19_ >= 0; i_19_--) {
                if (Class22.aClass68_Sub1ArrayArrayArray484[i_19_][i_0_][i_1_]
                        == null)
                    Class22.aClass68_Sub1ArrayArrayArray484[i_19_][i_0_][i_1_]
                            = new Class68_Sub1(i_19_, i_0_, i_1_);
            }
            Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_][i_1_].aClass7_2758
                    = class7;
        } else if (i_2_ == 1) {
            Class7 class7
                    = new Class7(i_13_, i_14_, i_15_, i_16_, i_4_, i_18_,
                    i_5_ == i_6_ && i_5_ == i_7_ && i_5_ == i_8_);
            for (int i_20_ = i; i_20_ >= 0; i_20_--) {
                if (Class22.aClass68_Sub1ArrayArrayArray484[i_20_][i_0_][i_1_]
                        == null)
                    Class22.aClass68_Sub1ArrayArrayArray484[i_20_][i_0_][i_1_]
                            = new Class68_Sub1(i_20_, i_0_, i_1_);
            }
            Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_][i_1_].aClass7_2758
                    = class7;
        } else {
            Class77 class77
                    = new Class77(i_2_, i_3_, i_4_, i_0_, i_1_, i_5_, i_6_, i_7_,
                    i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_,
                    i_15_, i_16_, i_17_, i_18_);
            for (int i_21_ = i; i_21_ >= 0; i_21_--) {
                if (Class22.aClass68_Sub1ArrayArrayArray484[i_21_][i_0_][i_1_]
                        == null)
                    Class22.aClass68_Sub1ArrayArrayArray484[i_21_][i_0_][i_1_]
                            = new Class68_Sub1(i_21_, i_0_, i_1_);
            }
            Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_][i_1_]
                    .aClass77_2779
                    = class77;
        }
    }

    public Class68_Sub1(int i, int i_22_, int i_23_) {
        anIntArray2766 = new int[5];
        anInt2768 = 0;
        anInt2782 = i_23_;
        anInt2763 = i_22_;
        anInt2765 = anInt2767 = i;
    }

    public static void method649(int i) {
        aRSStringArray2754 = null;
        aRSString_2761 = null;
        if (i == 0)
            aStreamArray2755 = null;
    }
}
