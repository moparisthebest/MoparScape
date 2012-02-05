/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class16 {

    public static int anInt253;
    public static int anInt254;
    public static int anInt255;
    public static int anInt256;
    public static int anInt257;
    public static int anInt258;
    public static int[] anIntArray259 = new int[32];
    public static int anInt260;
    public static int anInt261;
    public static int anInt262;
    public static int anInt263;
    public static int anInt264;
    public static int anInt265;
    public Class68 aClass68_266 = new Class68();
    public static int anInt267;
    public static int anInt268;
    public static int anInt269;
    public Class68 aClass68_270;
    public static int anInt271;
    public static boolean aBoolean272;
    public static int anInt273;
    public static RSString aRSString_274;
    public static int anInt275;
    public static int anInt276;
    public static long aLong277;
    public static int anInt278;

    public Class68 method280(byte i) {
        anInt253++;
        Class68 class68 = aClass68_270;
        if (class68 == aClass68_266) {
            aClass68_270 = null;
            return null;
        }
        aClass68_270 = class68.aClass68_1227;
        if (i > -28) {
            method288((byte) 93);
        }
        return class68;
    }

    public static void method281(int i) {
        aRSString_274 = null;
        if (i != 0) {
            anInt278 = 92;
        }
        anIntArray259 = null;
    }

    public static void method282(boolean bool, int i) {
        Class68_Sub13_Sub22.anIntArray3805 = new int[104];
        Class64.anIntArray1180 = new int[104];
        Stream.anIntArray3005 = new int[104];
        anInt268++;
        Class68_Sub25.anInt3174 = 99;
        Class68_Sub13_Sub15.anIntArray3679 = new int[104];
        Class14.anIntArray236 = new int[104];
        int i_0_;
        if (!bool) {
            i_0_ = 4;
        } else {
            i_0_ = 1;
        }
        Class52.aByteArrayArrayArray1014 = new byte[i_0_][104][104];
        Class68_Sub13_Sub35.aByteArrayArrayArray4028 = new byte[i_0_][104][104];
        GroundData.aByteArrayArrayArray676 = new byte[i_0_][105][105];
        Class109.aByteArrayArrayArray1847 = new byte[i_0_][104][104];
        Class85.aByteArrayArrayArray1554 = new byte[i_0_][104][104];
        if (i != -1261) {
            anInt276 = -118;
        }
        Class74.anIntArrayArrayArray1336 = new int[i_0_][105][105];
    }

    public static void method283(RSString password, int i,
                                 RSString username, int i_2_) {
        try {
            Class68_Sub28_Sub2.password = password;
            anInt264++;
            Class68_Sub28_Sub2.username = username;

            // System.out.println("method283 username: "+Class68_Sub28_Sub2.username.toString());

            Class75_Sub3_Sub1.aBoolean4597 = false;
            Class36.anInt642 = 0;
            Class68_Sub13_Sub5.anInt3518 = i_2_;
            if (Class68_Sub28_Sub2.username.method1593(Class68_Sub28_Sub2.aRSString_4556, (byte) 116) || (Class68_Sub28_Sub2.password.method1593(Class68_Sub28_Sub2.aRSString_4556, (byte) 127))) {
                Class68_Sub20_Sub7.anInt4257 = 3;
                Class32.anInt574 = 0;
            } else {
                Class68_Sub20_Sub7.anInt4257 = -3;
                if (i <= 10) {
                    method285(-14, null, -44, null);
                }
                GroundData.anInt666 = 0;
                Class32.anInt574 = 1;
                Class68_Sub13_Sub24.anInt3841 = 0;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("c.B(" + (password != null ? "{...}" : "null") + ',' + i + ',' + (username != null ? "{...}"
                            : "null") + ',' + i_2_ + ')'));
        }
    }

    public void method284(int i) {
        anInt263++;
        for (; ; ) {
            Class68 class68 = aClass68_266.aClass68_1229;
            if (aClass68_266 == class68) {
                break;
            }
            class68.method647(-17554);
        }
        if (i != 105) {
            method287(-95);
        }
        aClass68_270 = null;
    }

    public static void method285(int i, byte[] is, int i_3_, Unknown unknown) {
        try {
            anInt256++;
            Class68_Sub25 class68_sub25 = new Class68_Sub25();
            class68_sub25.aByteArray3165 = is;
            class68_sub25.aLong1218 = (long) i;
            class68_sub25.anInt3177 = 0;
            class68_sub25.aUnknown_3170 = unknown;
            synchronized (Class68_Sub20_Sub10.aClass16_4314) {
                Class68_Sub20_Sub10.aClass16_4314.method286(class68_sub25,
                        true);
                if (i_3_ != -30372) {
                    method283(null, -25, null, -36);
                }
            }
            Class68_Sub20_Sub11.method1140(600);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("c.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_3_ + ',' + (unknown != null ? "{...}" : "null") + ')'));
        }
    }

    public void method286(Class68 class68, boolean bool) {
        anInt257++;
        if (bool == true) {
            if (class68.aClass68_1227 != null) {
                class68.method647(-17554);
            }
            class68.aClass68_1229 = aClass68_266;
            class68.aClass68_1227 = aClass68_266.aClass68_1227;
            class68.aClass68_1227.aClass68_1229 = class68;
            class68.aClass68_1229.aClass68_1227 = class68;
        }
    }

    public static void method287(int i) {
        for (int i_4_ = i; Class68_Sub20_Sub16.anInt4418 > i_4_; i_4_++) {
            int i_5_ = PacketStream.anIntArray4110[i_4_];
            Class1_Sub6_Sub2 class1_sub6_sub2 = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_5_];
            int i_6_ = Class68_Sub13_Sub8.inStream.readUnsignedByte(-6677);
            if ((i_6_ & 0x10) != 0) {
                i_6_ += Class68_Sub13_Sub8.inStream.readUnsignedByte(i + -6677) << -1148449432;
            }
            Class58.method577(i_6_, class1_sub6_sub2, -19219, i_5_);
        }
        anInt255++;
    }

    public int method288(byte i) {
        anInt267++;
        Class68 class68 = aClass68_266.aClass68_1229;
        int i_7_ = 0;
        for (/**/; aClass68_266 != class68; class68 = class68.aClass68_1229) {
            i_7_++;
        }
        if (i < 12) {
            anIntArray259 = null;
        }
        return i_7_;
    }

    public Class68 method289(int i) {
        if (i != 30568) {
            method291((byte) 75, null);
        }
        anInt258++;
        Class68 class68 = aClass68_266.aClass68_1227;
        if (aClass68_266 == class68) {
            aClass68_270 = null;
            return null;
        }
        aClass68_270 = class68.aClass68_1227;
        return class68;
    }

    public Class68 method290(byte i) {
        Class68 class68 = aClass68_270;
        anInt254++;
        if (aClass68_266 == class68) {
            aClass68_270 = null;
            return null;
        }
        aClass68_270 = class68.aClass68_1229;
        int i_8_ = 81 / ((-49 - i) / 56);
        return class68;
    }

    public void method291(byte i, Class68 class68) {
        if (class68.aClass68_1227 != null) {
            class68.method647(-17554);
        }
        anInt261++;
        class68.aClass68_1229 = aClass68_266.aClass68_1229;
        class68.aClass68_1227 = aClass68_266;
        class68.aClass68_1227.aClass68_1229 = class68;
        class68.aClass68_1229.aClass68_1227 = class68;
        if (i <= 33) {
            anInt275 = 117;
        }
    }

    public static void method292(byte i) {
        anInt265++;
        for (int i_9_ = 0; i_9_ < 100; i_9_++) {
            Class121.aBooleanArray2109[i_9_] = true;
        }
        if (i <= 30) {
            anInt275 = 91;
        }
    }

    public Class68 method293(byte i) {
        if (i != 76) {
            aClass68_270 = null;
        }
        Class68 class68 = aClass68_266.aClass68_1229;
        anInt260++;
        if (class68 == aClass68_266) {
            aClass68_270 = null;
            return null;
        }
        aClass68_270 = class68.aClass68_1229;
        return class68;
    }

    public Class68 method294(int i) {
        anInt269++;
        Class68 class68 = aClass68_266.aClass68_1229;
        int i_10_ = -90 % ((-41 - i) / 50);
        if (class68 == aClass68_266) {
            return null;
        }
        class68.method647(-17554);
        return class68;
    }

    public Class16() {
        aClass68_266.aClass68_1227 = aClass68_266;
        aClass68_266.aClass68_1229 = aClass68_266;
    }


    static {
        int i = 2;
        for (int i_11_ = 0; i_11_ < 32; i_11_++) {
            anIntArray259[i_11_] = i + -1;
            i += i;
        }
        anInt275 = 128;
        anInt276 = -1;
        anInt271 = 0;
        aRSString_274 = RSString.newRsString(": ");
        aLong277 = 0L;
        anInt273 = 0;
    }
}
