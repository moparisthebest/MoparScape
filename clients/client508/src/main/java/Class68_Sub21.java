/* Class68_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub21 extends Class68 {
    public int anInt3098;
    public static Class99[] aClass99Array3099;
    public boolean aBoolean3100;
    public int anInt3101;
    public static boolean aBoolean3102 = false;
    public static float[] aFloatArray3103;
    public static float[] aFloatArray3104;
    public int anInt3105;
    public byte[][] aByteArrayArray3106;
    public static int[] anIntArray3107;
    public static float[] aFloatArray3108;
    public static int anInt3109;
    public static Class40[] aClass40Array3110;
    public static float[] aFloatArray3111;
    public static Class41[] aClass41Array3112;
    public static float[] aFloatArray3113;
    public static int anInt3114;
    public int anInt3115;
    public static boolean[] aBooleanArray3116;
    public int anInt3117;
    public static byte[] aByteArray3118;
    public static float[] aFloatArray3119;
    public static int[] anIntArray3120;
    public static float[] aFloatArray3121;
    public float[] aFloatArray3122;
    public static Class24[] aClass24Array3123;
    public int anInt3124;
    public static int anInt3125;
    public boolean aBoolean3126;
    public static int[] anIntArray3127;
    public static int anInt3128;
    public int anInt3129;
    public byte[] aByteArray3130;
    public int anInt3131;

    public static int method1190(int i) {
        int i_0_ = 0;
        int i_1_ = 0;
        int i_2_;
        for (/**/; i >= 8 - anInt3109; i -= i_2_) {
            i_2_ = 8 - anInt3109;
            int i_3_ = (1 << i_2_) - 1;
            i_0_ += (aByteArray3118[anInt3125] >> anInt3109 & i_3_) << i_1_;
            anInt3109 = 0;
            anInt3125++;
            i_1_ += i_2_;
        }
        if (i > 0) {
            i_2_ = (1 << i) - 1;
            i_0_ += (aByteArray3118[anInt3125] >> anInt3109 & i_2_) << i_1_;
            anInt3109 += i;
        }
        return i_0_;
    }

    public void method1191(byte[] is) {
        Stream class68_sub14 = new Stream(is);
        anInt3117 = class68_sub14.readDWord();
        anInt3105 = class68_sub14.readDWord();
        anInt3124 = class68_sub14.readDWord();
        anInt3098 = class68_sub14.readDWord();
        if (anInt3098 < 0) {
            anInt3098 = anInt3098 ^ 0xffffffff;
            aBoolean3126 = true;
        }
        int i = class68_sub14.readDWord();
        aByteArrayArray3106 = new byte[i][];
        for (int i_4_ = 0; i_4_ < i; i_4_++) {
            int i_5_ = 0;
            int i_6_;
            do {
                i_6_ = class68_sub14.readUnsignedByte(-6677);
                i_5_ += i_6_;
            } while (i_6_ >= 255);
            byte[] is_7_ = new byte[i_5_];
            class68_sub14.readBytes(0, 0, i_5_, is_7_);
            aByteArrayArray3106[i_4_] = is_7_;
        }
    }

    public static Class68_Sub21 method1192(Class21renamed class21, int i, int i_8_) {
        if (!method1198(class21)) {
            class21.method344(i, i_8_, (byte) -101);
            return null;
        }
        byte[] is = class21.method338(i_8_, 0, i);
        if (is == null)
            return null;
        return new Class68_Sub21(is);
    }

    public Class68_Sub11_Sub1 method1193(int[] is) {
        if (is != null && is[0] <= 0)
            return null;
        if (aByteArray3130 == null) {
            anInt3115 = 0;
            aFloatArray3122 = new float[anInt3128];
            aByteArray3130 = new byte[anInt3105];
            anInt3129 = 0;
            anInt3131 = 0;
        }
        for (/**/; anInt3131 < aByteArrayArray3106.length; anInt3131++) {
            if (is != null && is[0] <= 0)
                return null;
            float[] fs = method1195(anInt3131);
            if (fs != null) {
                int i = anInt3129;
                int i_9_ = fs.length;
                if (i_9_ > anInt3105 - i)
                    i_9_ = anInt3105 - i;
                for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
                    int i_11_ = (int) (128.0F + fs[i_10_] * 128.0F);
                    if ((i_11_ & ~0xff) != 0)
                        i_11_ = (i_11_ ^ 0xffffffff) >> 31;
                    aByteArray3130[i++] = (byte) (i_11_ - 128);
                }
                if (is != null)
                    is[0] -= i - anInt3129;
                anInt3129 = i;
            }
        }
        aFloatArray3122 = null;
        byte[] is_12_ = aByteArray3130;
        aByteArray3130 = null;
        return new Class68_Sub11_Sub1(anInt3117, is_12_, anInt3124, anInt3098,
                aBoolean3126);
    }

    public static void method1194(byte[] is, int i) {
        aByteArray3118 = is;
        anInt3125 = i;
        anInt3109 = 0;
    }

    public float[] method1195(int i) {
        method1194(aByteArrayArray3106[i], 0);
        method1196();
        int i_13_ = method1190(Class92.method1526(anIntArray3107.length - 1,
                (byte) 33));
        boolean bool = aBooleanArray3116[i_13_];
        int i_14_ = bool ? anInt3128 : anInt3114;
        boolean bool_15_ = false;
        boolean bool_16_ = false;
        if (bool) {
            bool_15_ = method1196() != 0;
            bool_16_ = method1196() != 0;
        }
        int i_17_ = i_14_ >> 1;
        int i_18_;
        int i_19_;
        int i_20_;
        if (bool && !bool_15_) {
            i_18_ = (i_14_ >> 2) - (anInt3114 >> 2);
            i_19_ = (i_14_ >> 2) + (anInt3114 >> 2);
            i_20_ = anInt3114 >> 1;
        } else {
            i_18_ = 0;
            i_19_ = i_17_;
            i_20_ = i_14_ >> 1;
        }
        int i_21_;
        int i_22_;
        int i_23_;
        if (bool && !bool_16_) {
            i_21_ = i_14_ - (i_14_ >> 2) - (anInt3114 >> 2);
            i_22_ = i_14_ - (i_14_ >> 2) + (anInt3114 >> 2);
            i_23_ = anInt3114 >> 1;
        } else {
            i_21_ = i_17_;
            i_22_ = i_14_;
            i_23_ = i_14_ >> 1;
        }
        Class99 class99 = aClass99Array3099[anIntArray3107[i_13_]];
        int i_24_ = class99.anInt1733;
        int i_25_ = class99.anIntArray1736[i_24_];
        boolean bool_26_ = !aClass41Array3112[i_25_].method471();
        boolean bool_27_ = bool_26_;
        for (int i_28_ = 0; i_28_ < class99.anInt1734; i_28_++) {
            Class40 class40 = aClass40Array3110[class99.anIntArray1735[i_28_]];
            float[] fs = aFloatArray3121;
            class40.method467(fs, i_14_ >> 1, bool_27_);
        }
        if (!bool_26_) {
            int i_29_ = class99.anInt1733;
            int i_30_ = class99.anIntArray1736[i_29_];
            aClass41Array3112[i_30_].method472(aFloatArray3121, i_14_ >> 1);
        }
        if (bool_26_) {
            for (int i_31_ = i_14_ >> 1; i_31_ < i_14_; i_31_++)
                aFloatArray3121[i_31_] = 0.0F;
        } else {
            int i_32_ = i_14_ >> 1;
            int i_33_ = i_14_ >> 2;
            int i_34_ = i_14_ >> 3;
            float[] fs = aFloatArray3121;
            for (int i_35_ = 0; i_35_ < i_32_; i_35_++)
                fs[i_35_] *= 0.5F;
            for (int i_36_ = i_32_; i_36_ < i_14_; i_36_++)
                fs[i_36_] = -fs[i_14_ - i_36_ - 1];
            float[] fs_37_ = bool ? aFloatArray3111 : aFloatArray3103;
            float[] fs_38_ = bool ? aFloatArray3113 : aFloatArray3119;
            float[] fs_39_ = bool ? aFloatArray3108 : aFloatArray3104;
            int[] is = bool ? anIntArray3120 : anIntArray3127;
            for (int i_40_ = 0; i_40_ < i_33_; i_40_++) {
                float f = fs[4 * i_40_] - fs[i_14_ - 4 * i_40_ - 1];
                float f_41_ = fs[4 * i_40_ + 2] - fs[i_14_ - 4 * i_40_ - 3];
                float f_42_ = fs_37_[2 * i_40_];
                float f_43_ = fs_37_[2 * i_40_ + 1];
                fs[i_14_ - 4 * i_40_ - 1] = f * f_42_ - f_41_ * f_43_;
                fs[i_14_ - 4 * i_40_ - 3] = f * f_43_ + f_41_ * f_42_;
            }
            for (int i_44_ = 0; i_44_ < i_34_; i_44_++) {
                float f = fs[i_32_ + 3 + 4 * i_44_];
                float f_45_ = fs[i_32_ + 1 + 4 * i_44_];
                float f_46_ = fs[4 * i_44_ + 3];
                float f_47_ = fs[4 * i_44_ + 1];
                fs[i_32_ + 3 + 4 * i_44_] = f + f_46_;
                fs[i_32_ + 1 + 4 * i_44_] = f_45_ + f_47_;
                float f_48_ = fs_37_[i_32_ - 4 - 4 * i_44_];
                float f_49_ = fs_37_[i_32_ - 3 - 4 * i_44_];
                fs[4 * i_44_ + 3]
                        = (f - f_46_) * f_48_ - (f_45_ - f_47_) * f_49_;
                fs[4 * i_44_ + 1]
                        = (f_45_ - f_47_) * f_48_ + (f - f_46_) * f_49_;
            }
            int i_50_ = Class92.method1526(i_14_ - 1, (byte) -114);
            for (int i_51_ = 0; i_51_ < i_50_ - 3; i_51_++) {
                int i_52_ = i_14_ >> i_51_ + 2;
                int i_53_ = 8 << i_51_;
                for (int i_54_ = 0; i_54_ < 2 << i_51_; i_54_++) {
                    int i_55_ = i_14_ - i_52_ * 2 * i_54_;
                    int i_56_ = i_14_ - i_52_ * (2 * i_54_ + 1);
                    for (int i_57_ = 0; i_57_ < i_14_ >> i_51_ + 4; i_57_++) {
                        int i_58_ = 4 * i_57_;
                        float f = fs[i_55_ - 1 - i_58_];
                        float f_59_ = fs[i_55_ - 3 - i_58_];
                        float f_60_ = fs[i_56_ - 1 - i_58_];
                        float f_61_ = fs[i_56_ - 3 - i_58_];
                        fs[i_55_ - 1 - i_58_] = f + f_60_;
                        fs[i_55_ - 3 - i_58_] = f_59_ + f_61_;
                        float f_62_ = fs_37_[i_57_ * i_53_];
                        float f_63_ = fs_37_[i_57_ * i_53_ + 1];
                        fs[i_56_ - 1 - i_58_]
                                = (f - f_60_) * f_62_ - (f_59_ - f_61_) * f_63_;
                        fs[i_56_ - 3 - i_58_]
                                = (f_59_ - f_61_) * f_62_ + (f - f_60_) * f_63_;
                    }
                }
            }
            for (int i_64_ = 1; i_64_ < i_34_ - 1; i_64_++) {
                int i_65_ = is[i_64_];
                if (i_64_ < i_65_) {
                    int i_66_ = 8 * i_64_;
                    int i_67_ = 8 * i_65_;
                    float f = fs[i_66_ + 1];
                    fs[i_66_ + 1] = fs[i_67_ + 1];
                    fs[i_67_ + 1] = f;
                    f = fs[i_66_ + 3];
                    fs[i_66_ + 3] = fs[i_67_ + 3];
                    fs[i_67_ + 3] = f;
                    f = fs[i_66_ + 5];
                    fs[i_66_ + 5] = fs[i_67_ + 5];
                    fs[i_67_ + 5] = f;
                    f = fs[i_66_ + 7];
                    fs[i_66_ + 7] = fs[i_67_ + 7];
                    fs[i_67_ + 7] = f;
                }
            }
            for (int i_68_ = 0; i_68_ < i_32_; i_68_++)
                fs[i_68_] = fs[2 * i_68_ + 1];
            for (int i_69_ = 0; i_69_ < i_34_; i_69_++) {
                fs[i_14_ - 1 - 2 * i_69_] = fs[4 * i_69_];
                fs[i_14_ - 2 - 2 * i_69_] = fs[4 * i_69_ + 1];
                fs[i_14_ - i_33_ - 1 - 2 * i_69_] = fs[4 * i_69_ + 2];
                fs[i_14_ - i_33_ - 2 - 2 * i_69_] = fs[4 * i_69_ + 3];
            }
            for (int i_70_ = 0; i_70_ < i_34_; i_70_++) {
                float f = fs_39_[2 * i_70_];
                float f_71_ = fs_39_[2 * i_70_ + 1];
                float f_72_ = fs[i_32_ + 2 * i_70_];
                float f_73_ = fs[i_32_ + 2 * i_70_ + 1];
                float f_74_ = fs[i_14_ - 2 - 2 * i_70_];
                float f_75_ = fs[i_14_ - 1 - 2 * i_70_];
                float f_76_ = f_71_ * (f_72_ - f_74_) + f * (f_73_ + f_75_);
                fs[i_32_ + 2 * i_70_] = (f_72_ + f_74_ + f_76_) * 0.5F;
                fs[i_14_ - 2 - 2 * i_70_] = (f_72_ + f_74_ - f_76_) * 0.5F;
                f_76_ = f_71_ * (f_73_ + f_75_) - f * (f_72_ - f_74_);
                fs[i_32_ + 2 * i_70_ + 1] = (f_73_ - f_75_ + f_76_) * 0.5F;
                fs[i_14_ - 1 - 2 * i_70_] = (-f_73_ + f_75_ + f_76_) * 0.5F;
            }
            for (int i_77_ = 0; i_77_ < i_33_; i_77_++) {
                fs[i_77_]
                        = (fs[2 * i_77_ + i_32_] * fs_38_[2 * i_77_]
                        + fs[2 * i_77_ + 1 + i_32_] * fs_38_[2 * i_77_ + 1]);
                fs[i_32_ - 1 - i_77_]
                        = (fs[2 * i_77_ + i_32_] * fs_38_[2 * i_77_ + 1]
                        - fs[2 * i_77_ + 1 + i_32_] * fs_38_[2 * i_77_]);
            }
            for (int i_78_ = 0; i_78_ < i_33_; i_78_++)
                fs[i_14_ - i_33_ + i_78_] = -fs[i_78_];
            for (int i_79_ = 0; i_79_ < i_33_; i_79_++)
                fs[i_79_] = fs[i_33_ + i_79_];
            for (int i_80_ = 0; i_80_ < i_33_; i_80_++)
                fs[i_33_ + i_80_] = -fs[i_33_ - i_80_ - 1];
            for (int i_81_ = 0; i_81_ < i_33_; i_81_++)
                fs[i_32_ + i_81_] = fs[i_14_ - i_81_ - 1];
            for (int i_82_ = i_18_; i_82_ < i_19_; i_82_++) {
                float f = (float) Math.sin(((double) (i_82_ - i_18_) + 0.5)
                        / (double) i_20_ * 0.5
                        * 3.141592653589793);
                aFloatArray3121[i_82_]
                        *= (float) Math.sin(1.5707963267948966 * (double) f
                        * (double) f);
            }
            for (int i_83_ = i_21_; i_83_ < i_22_; i_83_++) {
                float f = (float) Math.sin((((double) (i_83_ - i_21_) + 0.5)
                        / (double) i_23_ * 0.5
                        * 3.141592653589793)
                        + 1.5707963267948966);
                aFloatArray3121[i_83_]
                        *= (float) Math.sin(1.5707963267948966 * (double) f
                        * (double) f);
            }
        }
        float[] fs = null;
        if (anInt3115 > 0) {
            int i_84_ = anInt3115 + i_14_ >> 2;
            fs = new float[i_84_];
            if (!aBoolean3100) {
                for (int i_85_ = 0; i_85_ < anInt3101; i_85_++) {
                    int i_86_ = (anInt3115 >> 1) + i_85_;
                    fs[i_85_] += aFloatArray3122[i_86_];
                }
            }
            if (!bool_26_) {
                for (int i_87_ = i_18_; i_87_ < i_14_ >> 1; i_87_++) {
                    int i_88_ = fs.length - (i_14_ >> 1) + i_87_;
                    fs[i_88_] += aFloatArray3121[i_87_];
                }
            }
        }
        float[] fs_89_ = aFloatArray3122;
        aFloatArray3122 = aFloatArray3121;
        aFloatArray3121 = fs_89_;
        anInt3115 = i_14_;
        anInt3101 = i_22_ - (i_14_ >> 1);
        aBoolean3100 = bool_26_;
        return fs;
    }

    public static int method1196() {
        int i = aByteArray3118[anInt3125] >> anInt3109 & 0x1;
        anInt3109++;
        anInt3125 += anInt3109 >> 3;
        anInt3109 &= 0x7;
        return i;
    }

    public static float method1197(int i) {
        int i_90_ = i & 0x1fffff;
        int i_91_ = i & ~0x7fffffff;
        int i_92_ = (i & 0x7fe00000) >> 21;
        if (i_91_ != 0)
            i_90_ = -i_90_;
        return (float) ((double) i_90_
                * Math.pow(2.0, (double) (i_92_ - 788)));
    }

    public static boolean method1198(Class21renamed class21) {
        if (!aBoolean3102) {
            byte[] is = class21.method338(0, 0, 0);
            if (is == null)
                return false;
            method1199(is);
            aBoolean3102 = true;
        }
        return true;
    }

    public static void method1199(byte[] is) {
        method1194(is, 0);
        anInt3114 = 1 << method1190(4);
        anInt3128 = 1 << method1190(4);
        aFloatArray3121 = new float[anInt3128];
        for (int i = 0; i < 2; i++) {
            int i_93_ = i != 0 ? anInt3128 : anInt3114;
            int i_94_ = i_93_ >> 1;
            int i_95_ = i_93_ >> 2;
            int i_96_ = i_93_ >> 3;
            float[] fs = new float[i_94_];
            for (int i_97_ = 0; i_97_ < i_95_; i_97_++) {
                fs[2 * i_97_]
                        = (float) Math.cos((double) (4 * i_97_) * 3.141592653589793
                        / (double) i_93_);
                fs[2 * i_97_ + 1]
                        = -(float) Math.sin((double) (4 * i_97_)
                        * 3.141592653589793 / (double) i_93_);
            }
            float[] fs_98_ = new float[i_94_];
            for (int i_99_ = 0; i_99_ < i_95_; i_99_++) {
                fs_98_[2 * i_99_] = (float) Math.cos((double) (2 * i_99_ + 1)
                        * 3.141592653589793
                        / (double) (2 * i_93_));
                fs_98_[2 * i_99_ + 1]
                        = (float) Math.sin((double) (2 * i_99_ + 1)
                        * 3.141592653589793
                        / (double) (2 * i_93_));
            }
            float[] fs_100_ = new float[i_95_];
            for (int i_101_ = 0; i_101_ < i_96_; i_101_++) {
                fs_100_[2 * i_101_]
                        = (float) Math.cos((double) (4 * i_101_ + 2)
                        * 3.141592653589793 / (double) i_93_);
                fs_100_[2 * i_101_ + 1]
                        = -(float) Math.sin((double) (4 * i_101_ + 2)
                        * 3.141592653589793 / (double) i_93_);
            }
            int[] is_102_ = new int[i_96_];
            int i_103_ = Class92.method1526(i_96_ - 1, (byte) 75);
            for (int i_104_ = 0; i_104_ < i_96_; i_104_++)
                is_102_[i_104_]
                        = Class68_Sub13_Sub21.method807((byte) -88, i_104_,
                        i_103_);
            if (i != 0) {
                aFloatArray3111 = fs;
                aFloatArray3113 = fs_98_;
                aFloatArray3108 = fs_100_;
                anIntArray3120 = is_102_;
            } else {
                aFloatArray3103 = fs;
                aFloatArray3119 = fs_98_;
                aFloatArray3104 = fs_100_;
                anIntArray3127 = is_102_;
            }
        }
        int i = method1190(8) + 1;
        aClass24Array3123 = new Class24[i];
        for (int i_105_ = 0; i_105_ < i; i_105_++)
            aClass24Array3123[i_105_] = new Class24();
        int i_106_ = method1190(6) + 1;
        for (int i_107_ = 0; i_107_ < i_106_; i_107_++)
            method1190(16);
        int i_108_ = method1190(6) + 1;
        aClass41Array3112 = new Class41[i_108_];
        for (int i_109_ = 0; i_109_ < i_108_; i_109_++)
            aClass41Array3112[i_109_] = new Class41();
        int i_110_ = method1190(6) + 1;
        aClass40Array3110 = new Class40[i_110_];
        for (int i_111_ = 0; i_111_ < i_110_; i_111_++)
            aClass40Array3110[i_111_] = new Class40();
        int i_112_ = method1190(6) + 1;
        aClass99Array3099 = new Class99[i_112_];
        for (int i_113_ = 0; i_113_ < i_112_; i_113_++)
            aClass99Array3099[i_113_] = new Class99();
        int i_114_ = method1190(6) + 1;
        aBooleanArray3116 = new boolean[i_114_];
        anIntArray3107 = new int[i_114_];
        for (int i_115_ = 0; i_115_ < i_114_; i_115_++) {
            aBooleanArray3116[i_115_] = method1196() != 0;
            method1190(16);
            method1190(16);
            anIntArray3107[i_115_] = method1190(8);
        }
    }

    public static void method1200() {
        aByteArray3118 = null;
        aClass24Array3123 = null;
        aClass41Array3112 = null;
        aClass40Array3110 = null;
        aClass99Array3099 = null;
        aBooleanArray3116 = null;
        anIntArray3107 = null;
        aFloatArray3121 = null;
        aFloatArray3103 = null;
        aFloatArray3119 = null;
        aFloatArray3104 = null;
        aFloatArray3111 = null;
        aFloatArray3113 = null;
        aFloatArray3108 = null;
        anIntArray3127 = null;
        anIntArray3120 = null;
    }

    public Class68_Sub21(byte[] is) {
        method1191(is);
    }
}
