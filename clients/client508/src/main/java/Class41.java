/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class41 {
    public int anInt694;
    public int[] anIntArray695;
    public static int[] anIntArray696 = {256, 128, 86, 64};
    public static int[] anIntArray697;
    public int[][] anIntArrayArray698;
    public int[] anIntArray699;
    public int[] anIntArray700;
    public static float[] aFloatArray701
            = {1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F,
            1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F,
            1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
            2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F,
            2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F,
            3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
            4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F,
            6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F,
            7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F,
            1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
            1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F,
            1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F,
            2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F,
            2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
            3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F,
            4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
            5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
            7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F,
            1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F,
            1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F,
            1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F,
            2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
            2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F,
            3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
            4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F,
            6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F,
            7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F,
            1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
            1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
            1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F,
            2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
            2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
            3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
            4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F,
            5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F,
            7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
            9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F,
            0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F,
            0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F,
            0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
            0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F,
            0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F,
            0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
            0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F,
            0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F,
            0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F,
            0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
            0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F,
            0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
            0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
            0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F,
            0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F,
            0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
            0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F,
            0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F,
            0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
            0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F,
            0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
            0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F,
            0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F,
            0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F};
    public int[] anIntArray702;
    public static boolean[] aBooleanArray703;
    public static int[] anIntArray704;
    public int[] anIntArray705;

    public static int method468(int[] is, int i) {
        int i_0_ = is[i];
        int i_1_ = -1;
        int i_2_ = 2147483647;
        for (int i_3_ = 0; i_3_ < i; i_3_++) {
            int i_4_ = is[i_3_];
            if (i_4_ > i_0_ && i_4_ < i_2_) {
                i_1_ = i_3_;
                i_2_ = i_4_;
            }
        }
        return i_1_;
    }

    public void method469(int i, int i_5_) {
        if (i < i_5_) {
            int i_6_ = i;
            int i_7_ = anIntArray704[i_6_];
            int i_8_ = anIntArray697[i_6_];
            boolean bool = aBooleanArray703[i_6_];
            for (int i_9_ = i + 1; i_9_ <= i_5_; i_9_++) {
                int i_10_ = anIntArray704[i_9_];
                if (i_10_ < i_7_) {
                    anIntArray704[i_6_] = i_10_;
                    anIntArray697[i_6_] = anIntArray697[i_9_];
                    aBooleanArray703[i_6_] = aBooleanArray703[i_9_];
                    i_6_++;
                    anIntArray704[i_9_] = anIntArray704[i_6_];
                    anIntArray697[i_9_] = anIntArray697[i_6_];
                    aBooleanArray703[i_9_] = aBooleanArray703[i_6_];
                }
            }
            anIntArray704[i_6_] = i_7_;
            anIntArray697[i_6_] = i_8_;
            aBooleanArray703[i_6_] = bool;
            method469(i, i_6_ - 1);
            method469(i_6_ + 1, i_5_);
        }
    }

    public static void method470() {
        anIntArray696 = null;
        aFloatArray701 = null;
        anIntArray704 = null;
        anIntArray697 = null;
        aBooleanArray703 = null;
    }

    public boolean method471() {
        boolean bool = Class68_Sub21.method1196() != 0;
        if (!bool)
            return false;
        int i = anIntArray695.length;
        for (int i_11_ = 0; i_11_ < i; i_11_++)
            anIntArray704[i_11_] = anIntArray695[i_11_];
        int i_12_ = anIntArray696[anInt694 - 1];
        int i_13_ = Class92.method1526(i_12_ - 1, (byte) 58);
        anIntArray697[0] = Class68_Sub21.method1190(i_13_);
        anIntArray697[1] = Class68_Sub21.method1190(i_13_);
        int i_14_ = 2;
        for (int i_15_ = 0; i_15_ < anIntArray700.length; i_15_++) {
            int i_16_ = anIntArray700[i_15_];
            int i_17_ = anIntArray705[i_16_];
            int i_18_ = anIntArray699[i_16_];
            int i_19_ = (1 << i_18_) - 1;
            int i_20_ = 0;
            if (i_18_ > 0)
                i_20_ = Class68_Sub21.aClass24Array3123
                        [anIntArray702[i_16_]].method383();
            for (int i_21_ = 0; i_21_ < i_17_; i_21_++) {
                int i_22_ = anIntArrayArray698[i_16_][i_20_ & i_19_];
                i_20_ >>>= i_18_;
                anIntArray697[i_14_++]
                        = (i_22_ >= 0
                        ? Class68_Sub21.aClass24Array3123[i_22_].method383()
                        : 0);
            }
        }
        return true;
    }

    public void method472(float[] fs, int i) {
        int i_23_ = anIntArray695.length;
        int i_24_ = anIntArray696[anInt694 - 1];
        aBooleanArray703[0] = aBooleanArray703[1] = true;
        for (int i_25_ = 2; i_25_ < i_23_; i_25_++) {
            int i_26_ = method474(anIntArray704, i_25_);
            int i_27_ = method468(anIntArray704, i_25_);
            int i_28_ = method473(anIntArray704[i_26_], anIntArray697[i_26_],
                    anIntArray704[i_27_], anIntArray697[i_27_],
                    anIntArray704[i_25_]);
            int i_29_ = anIntArray697[i_25_];
            int i_30_ = i_24_ - i_28_;
            int i_31_ = i_28_;
            int i_32_ = (i_30_ < i_31_ ? i_30_ : i_31_) << 1;
            if (i_29_ != 0) {
                aBooleanArray703[i_26_] = aBooleanArray703[i_27_] = true;
                aBooleanArray703[i_25_] = true;
                if (i_29_ >= i_32_)
                    anIntArray697[i_25_]
                            = (i_30_ > i_31_ ? i_29_ - i_31_ + i_28_
                            : i_28_ - i_29_ + i_30_ - 1);
                else
                    anIntArray697[i_25_]
                            = ((i_29_ & 0x1) != 0 ? i_28_ - (i_29_ + 1) / 2
                            : i_28_ + i_29_ / 2);
            } else {
                aBooleanArray703[i_25_] = false;
                anIntArray697[i_25_] = i_28_;
            }
        }
        method469(0, i_23_ - 1);
        int i_33_ = 0;
        int i_34_ = anIntArray697[0] * anInt694;
        for (int i_35_ = 1; i_35_ < i_23_; i_35_++) {
            if (aBooleanArray703[i_35_]) {
                int i_36_ = anIntArray704[i_35_];
                int i_37_ = anIntArray697[i_35_] * anInt694;
                method475(i_33_, i_34_, i_36_, i_37_, fs, i);
                if (i_36_ >= i)
                    return;
                i_33_ = i_36_;
                i_34_ = i_37_;
            }
        }
        float f = aFloatArray701[i_34_];
        for (int i_38_ = i_33_; i_38_ < i; i_38_++)
            fs[i_38_] *= f;
    }

    public Class41() {
        int i = Class68_Sub21.method1190(16);
        if (i != 1)
            throw new RuntimeException();
        int i_39_ = Class68_Sub21.method1190(5);
        int i_40_ = 0;
        anIntArray700 = new int[i_39_];
        for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
            int i_42_ = Class68_Sub21.method1190(4);
            anIntArray700[i_41_] = i_42_;
            if (i_42_ >= i_40_)
                i_40_ = i_42_ + 1;
        }
        anIntArray705 = new int[i_40_];
        anIntArray699 = new int[i_40_];
        anIntArray702 = new int[i_40_];
        anIntArrayArray698 = new int[i_40_][];
        for (int i_43_ = 0; i_43_ < i_40_; i_43_++) {
            anIntArray705[i_43_] = Class68_Sub21.method1190(3) + 1;
            int i_44_ = anIntArray699[i_43_] = Class68_Sub21.method1190(2);
            if (i_44_ != 0)
                anIntArray702[i_43_] = Class68_Sub21.method1190(8);
            i_44_ = 1 << i_44_;
            int[] is = new int[i_44_];
            anIntArrayArray698[i_43_] = is;
            for (int i_45_ = 0; i_45_ < i_44_; i_45_++)
                is[i_45_] = Class68_Sub21.method1190(8) - 1;
        }
        anInt694 = Class68_Sub21.method1190(2) + 1;
        int i_46_ = Class68_Sub21.method1190(4);
        int i_47_ = 2;
        for (int i_48_ = 0; i_48_ < i_39_; i_48_++)
            i_47_ += anIntArray705[anIntArray700[i_48_]];
        anIntArray695 = new int[i_47_];
        anIntArray695[0] = 0;
        anIntArray695[1] = 1 << i_46_;
        i_47_ = 2;
        for (int i_49_ = 0; i_49_ < i_39_; i_49_++) {
            int i_50_ = anIntArray700[i_49_];
            for (int i_51_ = 0; i_51_ < anIntArray705[i_50_]; i_51_++)
                anIntArray695[i_47_++] = Class68_Sub21.method1190(i_46_);
        }
        if (anIntArray704 == null || anIntArray704.length < i_47_) {
            anIntArray704 = new int[i_47_];
            anIntArray697 = new int[i_47_];
            aBooleanArray703 = new boolean[i_47_];
        }
    }

    public int method473(int i, int i_52_, int i_53_, int i_54_, int i_55_) {
        int i_56_ = i_54_ - i_52_;
        int i_57_ = i_53_ - i;
        int i_58_ = i_56_ < 0 ? -i_56_ : i_56_;
        int i_59_ = i_58_ * (i_55_ - i);
        int i_60_ = i_59_ / i_57_;
        if (i_56_ < 0)
            return i_52_ - i_60_;
        return i_52_ + i_60_;
    }

    public static int method474(int[] is, int i) {
        int i_61_ = is[i];
        int i_62_ = -1;
        int i_63_ = -2147483648;
        for (int i_64_ = 0; i_64_ < i; i_64_++) {
            int i_65_ = is[i_64_];
            if (i_65_ < i_61_ && i_65_ > i_63_) {
                i_62_ = i_64_;
                i_63_ = i_65_;
            }
        }
        return i_62_;
    }

    public void method475(int i, int i_66_, int i_67_, int i_68_, float[] fs,
                          int i_69_) {
        int i_70_ = i_68_ - i_66_;
        int i_71_ = i_67_ - i;
        int i_72_ = i_70_ < 0 ? -i_70_ : i_70_;
        int i_73_ = i_70_ / i_71_;
        int i_74_ = i_66_;
        int i_75_ = 0;
        int i_76_ = i_70_ < 0 ? i_73_ - 1 : i_73_ + 1;
        i_72_ = i_72_ - (i_73_ < 0 ? -i_73_ : i_73_) * i_71_;
        fs[i] *= aFloatArray701[i_74_];
        if (i_67_ > i_69_)
            i_67_ = i_69_;
        for (int i_77_ = i + 1; i_77_ < i_67_; i_77_++) {
            i_75_ += i_72_;
            if (i_75_ >= i_71_) {
                i_75_ -= i_71_;
                i_74_ += i_76_;
            } else
                i_74_ += i_73_;
            fs[i_77_] *= aFloatArray701[i_74_];
        }
    }
}
