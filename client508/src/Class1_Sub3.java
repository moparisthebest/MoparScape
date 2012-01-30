/* Class1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class1_Sub3 extends Animable {
    public boolean aBoolean2443 = false;

    public abstract void method72(int i, int i_0_, int i_1_);

    public void method73(int[][] is, int i, int i_2_, int i_3_, int i_4_,
                         int i_5_) {
        boolean bool = false;
        boolean bool_6_ = false;
        boolean bool_7_ = false;
        int i_8_ = -i_4_ / 2;
        int i_9_ = -i_5_ / 2;
        int i_10_ = method91(is, i + i_8_, i_3_ + i_9_);
        int i_11_ = i_4_ / 2;
        int i_12_ = -i_5_ / 2;
        int i_13_ = method91(is, i + i_11_, i_3_ + i_12_);
        int i_14_ = -i_4_ / 2;
        int i_15_ = i_5_ / 2;
        int i_16_ = method91(is, i + i_14_, i_3_ + i_15_);
        int i_17_ = i_4_ / 2;
        int i_18_ = i_5_ / 2;
        int i_19_ = method91(is, i + i_17_, i_3_ + i_18_);
        int i_20_ = i_10_ < i_13_ ? i_10_ : i_13_;
        int i_21_ = i_16_ < i_19_ ? i_16_ : i_19_;
        int i_22_ = i_13_ < i_19_ ? i_13_ : i_19_;
        int i_23_ = i_10_ < i_16_ ? i_10_ : i_16_;
        if (i_5_ != 0) {
            int i_24_
                    = ((int) (Math.atan2((double) (i_20_ - i_21_), (double) i_5_)
                    * 325.95)
                    & 0x7ff);
            if (i_24_ != 0)
                method78(i_24_);
        }
        if (i_4_ != 0) {
            int i_25_
                    = ((int) (Math.atan2((double) (i_23_ - i_22_), (double) i_4_)
                    * 325.95)
                    & 0x7ff);
            if (i_25_ != 0)
                method85(i_25_);
        }
        int i_26_ = i_10_ + i_19_;
        if (i_13_ + i_16_ < i_26_)
            i_26_ = i_13_ + i_16_;
        i_26_ = (i_26_ >> 1) - i_2_;
        if (i_26_ != 0)
            method92(0, i_26_, 0);
    }

    public abstract void method74(Class68_Sub20_Sub17 class68_sub20_sub17,
                                  int i, boolean bool);

    public abstract int method75();

    public abstract void method76(Class68_Sub20_Sub17 class68_sub20_sub17,
                                  int i);

    public abstract void method77(int i, int i_27_, int i_28_, int i_29_,
                                  int i_30_, int i_31_, int i_32_);

    public abstract void method78(int i);

    public abstract int method79();

    public abstract void method80();

    public abstract Class1_Sub3 method81(boolean bool, boolean bool_33_);

    public abstract Class1_Sub3 method82(boolean bool, boolean bool_34_);

    public abstract void method83();

    public abstract int method84();

    public abstract void method85(int i);

    public abstract void method86(Class68_Sub20_Sub17 class68_sub20_sub17,
                                  int i,
                                  Class68_Sub20_Sub17 class68_sub20_sub17_35_,
                                  int i_36_, int[] is, boolean bool);

    public abstract int method87();

    public abstract void method51(int i, int i_37_, int i_38_, int i_39_,
                                  int i_40_, int i_41_, int i_42_, int i_43_,
                                  long l);

    public abstract void method88();

    public abstract int method89();

    public abstract void method90(int i);

    public abstract int method56();

    public static int method91(int[][] is, int i, int i_44_) {
        int i_45_ = i >> 7;
        int i_46_ = i_44_ >> 7;
        if (i_45_ < 0 || i_46_ < 0 || i_45_ >= is.length
                || i_46_ >= is[0].length)
            return 0;
        int i_47_ = i & 0x7f;
        int i_48_ = i_44_ & 0x7f;
        int i_49_
                = (is[i_45_][i_46_] * (128 - i_47_) + is[i_45_ + 1][i_46_] * i_47_
                >> 7);
        int i_50_ = ((is[i_45_][i_46_ + 1] * (128 - i_47_)
                + is[i_45_ + 1][i_46_ + 1] * i_47_)
                >> 7);
        return i_49_ * (128 - i_48_) + i_50_ * i_48_ >> 7;
    }

    public abstract void method92(int i, int i_51_, int i_52_);
}
