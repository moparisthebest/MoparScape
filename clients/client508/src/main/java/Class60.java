/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class60 {
    public static int anInt1113;
    public static int anInt1114;
    public static RSString aRSString_1115 = RSString.newRsString("overlay");
    public static int anInt1116;
    public static int anInt1117;

    public static void method586(Unknown unknown, Class21_Sub1 class21_sub1,
                                 int i, int i_0_) {
        try {
            anInt1113++;
            byte[] is = null;
            synchronized (Class68_Sub20_Sub10.aClass16_4314) {
                for (Class68_Sub25 class68_sub25
                             = (Class68_Sub25) Class68_Sub20_Sub10
                        .aClass16_4314
                        .method293((byte) 76);
                     class68_sub25 != null;
                     class68_sub25
                             = (Class68_Sub25) Class68_Sub20_Sub10
                             .aClass16_4314
                             .method290((byte) -128)) {
                    if ((long) i_0_ == class68_sub25.aLong1218
                            && unknown == class68_sub25.aUnknown_3170
                            && class68_sub25.anInt3177 == 0) {
                        is = class68_sub25.aByteArray3165;
                        break;
                    }
                }
            }
            if (is != null)
                class21_sub1.method364(-71, true, is, unknown, i_0_);
            else {
                if (i != 1)
                    method588(5);
                byte[] is_1_ = unknown.method1507(i_0_, true);
                class21_sub1.method364(-44, true, is_1_, unknown, i_0_);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("jj.C("
                            + (unknown != null ? "{...}" : "null")
                            + ','
                            + (class21_sub1 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_0_ + ')'));
        }
    }

    public static void method587(int i, int i_2_) {
        anInt1114++;
        if (i == -1) {
            if (Class71_Sub1.anIntArray3255 == null
                    || ((Class71_Sub1.anIntArray3255.length ^ 0xffffffff)
                    > (i_2_ ^ 0xffffffff)))
                Class71_Sub1.anIntArray3255 = new int[i_2_];
        }
    }

    public static void method588(int i) {
        if (i == -1)
            aRSString_1115 = null;
    }

    public static void method589(RSString[] class100s, short[] is, int i,
                                 boolean bool, int i_3_) {
        do {
            try {
                if ((i ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
                    int i_4_ = (i_3_ + i) / 2;
                    int i_5_ = i_3_;
                    RSString class100 = class100s[i_4_];
                    class100s[i_4_] = class100s[i];
                    class100s[i] = class100;
                    short i_6_ = is[i_4_];
                    is[i_4_] = is[i];
                    is[i] = i_6_;
                    for (int i_7_ = i_3_; i > i_7_; i_7_++) {
                        if (class100 == null
                                || (class100s[i_7_] != null
                                && ((class100s[i_7_].method1614(bool, class100)
                                ^ 0xffffffff)
                                > (i_7_ & 0x1 ^ 0xffffffff)))) {
                            RSString class100_8_ = class100s[i_7_];
                            class100s[i_7_] = class100s[i_5_];
                            class100s[i_5_] = class100_8_;
                            short i_9_ = is[i_7_];
                            is[i_7_] = is[i_5_];
                            is[i_5_++] = i_9_;
                        }
                    }
                    class100s[i] = class100s[i_5_];
                    class100s[i_5_] = class100;
                    is[i] = is[i_5_];
                    is[i_5_] = i_6_;
                    method589(class100s, is, i_5_ + -1, bool, i_3_);
                    method589(class100s, is, i, false, i_5_ + 1);
                }
                anInt1117++;
                if (bool == false)
                    break;
                method588(93);
            } catch (RuntimeException runtimeexception) {
                throw Class107.method1652(runtimeexception,
                        ("jj.B("
                                + (class100s != null ? "{...}"
                                : "null")
                                + ','
                                + (is != null ? "{...}" : "null")
                                + ',' + i + ',' + bool + ',' + i_3_
                                + ')'));
            }
            break;
        } while (false);
    }
}
