/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class34 {
    public static int anInt591;
    public static int anInt592 = 0;
    public static Class92[] aClass92Array593;
    public static Class23[] aClass23Array594;
    public static RSString aRSString_595;
    public static int[] anIntArray596;
    public static int anInt597 = 0;
    public static RSString aRSString_598;
    public static int anInt599;
    public static RSString aRSString_600;
    public static int anInt601;

    public static void method414(int i) {
        Class68_Sub2 class68_sub2
                = ((Class68_Sub2)
                Class68_Sub13_Sub31.aClass16_3963.method293((byte) 76));
        anInt601++;
        for (/**/; class68_sub2 != null;
                 class68_sub2 = (Class68_Sub2) Class68_Sub13_Sub31
                         .aClass16_3963
                         .method290((byte) 79)) {
            if ((class68_sub2.anInt2795 ^ 0xffffffff) != 0)
                class68_sub2.method647(-17554);
            else {
                class68_sub2.anInt2794 = 0;
                Class68_Sub13_Sub36.method882(class68_sub2, true);
            }
        }
        if (i != -28968)
            method414(42);
    }

    public static int method415(byte i) {
        int i_0_ = 122 / ((51 - i) / 57);
        anInt599++;
        return (((Class106.anInt1801 == 0 ? 0 : 1) << 351497908)
                + (((!Class74.aBoolean1324 ? 0 : 1) << 1969149779)
                + (0x60000 & Class69.anInt1245 << -2121078959)
                + (((Class43.aBoolean741 ? 1 : 0) << -1422848656)
                + ((Class68_Sub6.aBoolean2838 ? 1 : 0) << 778354863)))
                + (((Class68_Sub28_Sub1.aBoolean4521 ? 1 : 0) << -1047818099)
                + ((Class68_Sub20_Sub13_Sub2.aBoolean4629 ? 1 : 0)
                << 803447498)
                + ((!Class68_Sub22.aBoolean3149 ? 0 : 1) << -1737613527)
                + (((RSString.aBoolean2262 ? 1 : 0) << 840780039)
                + ((!Class1_Sub2.aBoolean2432 ? 0 : 1) << 126168518)
                + ((ISAACRandomGen.aBoolean1487 ? 1 : 0) << 1515986597)))
                + (((Class68_Sub20_Sub2.aBoolean4188 ? 1 : 0) << 995280516)
                + ((Class45.anInt919 & 0x7)
                + (((Class23.aBoolean501 ? 1 : 0) << 940635459)
                - (-((!Class68_Sub13_Sub2.aBoolean3460 ? 0 : 1)
                << -764083448)
                + -(0x1800
                & Class68_Sub13_Sub26.anInt3876 << -716929333)
                - ((Class68_Sub13_Sub25.anInt3855 != 0 ? 1 : 0)
                << 698829205))
                + ((Class68_Sub20_Sub15.anInt4399 != 0 ? 1 : 0)
                << 1148366230)))));
    }

    public static void method416(int i, byte i_1_, int i_2_, int[] is,
                                 int i_3_) {
        if (i_1_ != -17)
            method417(false);
        int i_4_ = --i_3_ - 7;
        anInt591++;
        i--;
        while ((i ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
            is[++i] = i_2_;
            is[++i] = i_2_;
            is[++i] = i_2_;
            is[++i] = i_2_;
            is[++i] = i_2_;
            is[++i] = i_2_;
            is[++i] = i_2_;
            is[++i] = i_2_;
        }
        while ((i ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
            is[++i] = i_2_;
    }

    public static void method417(boolean bool) {
        aRSString_600 = null;
        aClass23Array594 = null;
        aClass92Array593 = null;
        aRSString_595 = null;
        if (bool == true) {
            anIntArray596 = null;
            aRSString_598 = null;
        }
    }

    static {
        anIntArray596 = new int[50];
        aRSString_595 = RSString.newRsString("::noclip");
        aClass23Array594 = new Class23[4];
        aRSString_600 = RSString.newRsString("Cancel");
        aRSString_598 = aRSString_600;
    }
}
