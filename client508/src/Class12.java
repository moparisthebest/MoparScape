/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12 {
    public static RSString aRSString_197;
    public static RSString aRSString_198;
    public static volatile int anInt199;
    public static RSString[] aRSStringArray200;
    public static int[] anIntArray201 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    public static int anInt202;
    public static RSString aRSString_203;
    public static RSString aRSString_204;
    public static RSString aRSString_205;
    public static RSString aRSString_206;
    public static RSString aRSString_207;
    public static int anInt208;
    public static RSString aRSString_209;
    public static int anInt210;
    public static Class98 aClass98_211;
    public static byte[][][] aByteArrayArrayArray212;

    public static void method237(int i) {
        aRSString_203 = null;
        aRSString_197 = null;
        aClass98_211 = null;
        aRSString_204 = null;
        aRSString_206 = null;
        aRSString_209 = null;
        aRSStringArray200 = null;
        aByteArrayArrayArray212 = null;
        if (i != -5)
            method239((byte) 49, null, null);
        aRSString_207 = null;
        aRSString_205 = null;
        aRSString_198 = null;
        anIntArray201 = null;
    }

    public static void method238(SignLink class55, Stream class68_sub14,
                                 int i, byte i_0_) {
        try {
            int i_1_ = -54 % ((-40 - i_0_) / 34);
            anInt210++;
            Class68_Sub9 class68_sub9 = new Class68_Sub9();
            class68_sub9.anInt2884 = class68_sub14.readUnsignedByte(-6677);
            class68_sub9.anInt2897 = class68_sub14.readDWord();
            class68_sub9.anIntArray2893 = new int[class68_sub9.anInt2884];
            class68_sub9.anIntArray2889 = new int[class68_sub9.anInt2884];
            class68_sub9.aByteArrayArrayArray2881
                    = new byte[class68_sub9.anInt2884][][];
            class68_sub9.aClass31Array2894
                    = new JagSocket[class68_sub9.anInt2884];
            class68_sub9.anIntArray2888 = new int[class68_sub9.anInt2884];
            class68_sub9.aClass31Array2898
                    = new JagSocket[class68_sub9.anInt2884];
            for (int i_2_ = 0;
                 (i_2_ ^ 0xffffffff) > (class68_sub9.anInt2884 ^ 0xffffffff);
                 i_2_++) {
                try {
                    int i_3_ = class68_sub14.readUnsignedByte(-6677);
                    if (i_3_ == 0 || (i_3_ ^ 0xffffffff) == -2
                            || (i_3_ ^ 0xffffffff) == -3) {
                        String string
                                = new String(class68_sub14.readString(127)
                                .method1575((byte) -115));
                        String string_4_
                                = new String(class68_sub14.readString(127)
                                .method1575((byte) -82));
                        int i_5_ = 0;
                        if (i_3_ == 1)
                            i_5_ = class68_sub14.readDWord();
                        class68_sub9.anIntArray2889[i_2_] = i_3_;
                        class68_sub9.anIntArray2893[i_2_] = i_5_;
                        class68_sub9.aClass31Array2898[i_2_]
                                = class55.method561(30810, string_4_,
                                Class68_Sub13_Sub7
                                        .method729(string, -1));
                    } else if (i_3_ == 3 || (i_3_ ^ 0xffffffff) == -5) {
                        String string
                                = new String(class68_sub14.readString(127)
                                .method1575((byte) -88));
                        String string_6_
                                = new String(class68_sub14.readString(127)
                                .method1575((byte) -86));
                        int i_7_ = class68_sub14.readUnsignedByte(-6677);
                        String[] strings = new String[i_7_];
                        for (int i_8_ = 0;
                             (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
                            strings[i_8_]
                                    = new String(class68_sub14.readString(127)
                                    .method1575((byte) -113));
                        byte[][] is = new byte[i_7_][];
                        if ((i_3_ ^ 0xffffffff) == -4) {
                            for (int i_9_ = 0;
                                 (i_9_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff);
                                 i_9_++) {
                                int i_10_ = class68_sub14.readDWord();
                                is[i_9_] = new byte[i_10_];
                                class68_sub14.readBytes(0, 0, i_10_, is[i_9_]);
                            }
                        }
                        Class[] var_classes = new Class[i_7_];
                        class68_sub9.anIntArray2889[i_2_] = i_3_;
                        for (int i_11_ = 0; i_11_ < i_7_; i_11_++)
                            var_classes[i_11_]
                                    = Class68_Sub13_Sub7.method729(strings[i_11_],
                                    -1);
                        class68_sub9.aClass31Array2894[i_2_]
                                = class55.method564(var_classes, 0, string_6_,
                                Class68_Sub13_Sub7
                                        .method729(string, -1));
                        class68_sub9.aByteArrayArrayArray2881[i_2_] = is;
                    }
                } catch (ClassNotFoundException classnotfoundexception) {
                    class68_sub9.anIntArray2888[i_2_] = -1;
                } catch (SecurityException securityexception) {
                    class68_sub9.anIntArray2888[i_2_] = -2;
                } catch (NullPointerException nullpointerexception) {
                    class68_sub9.anIntArray2888[i_2_] = -3;
                } catch (Exception exception) {
                    class68_sub9.anIntArray2888[i_2_] = -4;
                } catch (Throwable throwable) {
                    class68_sub9.anIntArray2888[i_2_] = -5;
                }
            }
            Class50.aClass16_984.method286(class68_sub9, true);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("bg.B("
                            + (class55 != null ? "{...}" : "null")
                            + ','
                            + (class68_sub14 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_0_ + ')'));
        }
    }

    public static void method239(byte i, Class68_Sub20 class68_sub20,
                                 Class68_Sub20 class68_sub20_12_) {
        try {
            anInt202++;
            if (class68_sub20.aClass68_Sub20_3087 != null)
                class68_sub20.method1005((byte) 73);
            class68_sub20.aClass68_Sub20_3087 = class68_sub20_12_;
            class68_sub20.aClass68_Sub20_3092
                    = class68_sub20_12_.aClass68_Sub20_3092;
            if (i == -74) {
                class68_sub20.aClass68_Sub20_3087.aClass68_Sub20_3092
                        = class68_sub20;
                class68_sub20.aClass68_Sub20_3092.aClass68_Sub20_3087
                        = class68_sub20;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("bg.A(" + i + ','
                            + (class68_sub20 != null ? "{...}"
                            : "null")
                            + ','
                            + (class68_sub20_12_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    static {
        aRSString_198 = RSString.newRsString("rot:");
        anInt199 = 0;
        aRSString_205 = RSString.newRsString("Sat");
        aRSString_197 = RSString.newRsString("Thu");
        aRSString_207 = RSString.newRsString("Fri");
        aRSString_206 = RSString.newRsString("Tue");
        anInt208 = 0;
        aRSString_203 = RSString.newRsString("Wed");
        aRSString_209 = RSString.newRsString("Sun");
        aRSString_204 = RSString.newRsString("Mon");
        aRSStringArray200
                = new RSString[]{aRSString_209, aRSString_204, aRSString_206,
                aRSString_203, aRSString_197, aRSString_207,
                aRSString_205};
        aClass98_211 = new Class98(50);
    }
}
