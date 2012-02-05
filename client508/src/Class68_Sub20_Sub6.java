/* Class68_Sub20_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub6 extends Class68_Sub20 {
    public static int[] anIntArray4230;
    public static int anInt4231;
    public static RSString aRSString_4232 = RSString.newRsString(" )2> ");
    public static int anInt4233;
    public boolean aBoolean4234;
    public static int anInt4235;
    public static RSString aRSString_4236 = RSString.newRsString(" ");
    public static int anInt4237;
    public static int anInt4238;
    public boolean aBoolean4239;
    public static int anInt4240 = 0;
    public static int anInt4241;
    public Class3 aClass3_4242;
    public int[] anIntArray4243;
    public float aFloat4244;
    public int anInt4245;
    public static int[][] anIntArrayArray4246;
    public boolean aBoolean4247 = false;
    public static int anInt4248;
    public int anInt4249;
    public static int anInt4250;
    public static int anInt4251;

    public static boolean method1064(int i, int i_0_) {
        if (i_0_ != -207106658)
            method1066((byte) 70, null);
        anInt4233++;
        if ((0x7ecfbac6 & i) >> -207106658 == 0)
            return false;
        return true;
    }

    public int[] method1065(Interface4 interface4, int i, Class21renamed class21,
                            boolean bool) {
        try {
            anInt4250++;
            if (!aClass3_4242.method180(interface4, 0, class21))
                return null;
            if (i > -30)
                method1070(-97, -107);
            int i_1_ = !bool ? 128 : 64;
            return aClass3_4242.method178(aBoolean4239, false, class21,
                    interface4, i_1_, i_1_, 1.0, 2000);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("fe.H("
                            + (interface4 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (class21 != null ? "{...}" : "null")
                            + ',' + bool + ')'));
        }
    }

    public static Class45 method1066(byte i, Class45 class45) {
        anInt4251++;
        if ((class45.anInt799 ^ 0xffffffff) != 0)
            return Class68_Sub20_Sub15.method1170(class45.anInt799,
                    (byte) -80);
        int i_2_ = class45.anInt792 >>> 207487280;
        if (i < 121)
            aRSString_4236 = null;
        for (Class68_Sub3 class68_sub3
                     = (Class68_Sub3) Login.aClass113_1512.method1679(-32642);
             class68_sub3 != null;
             class68_sub3 = ((Class68_Sub3)
                     Login.aClass113_1512.method1683((byte) -125))) {
            if (i_2_ == class68_sub3.anInt2803)
                return Class68_Sub20_Sub15.method1170((int) (class68_sub3
                        .aLong1218),
                        (byte) -80);
        }
        return null;
    }

    public static void method1067(int i) {
        anInt4241++;
        Class68_Sub13_Sub8.inStream.method965(111);
        int i_3_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
        if (i_3_ != 0) {
            if (i != -19342)
                anInt4240 = -21;
            int i_4_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 2);
            if (i_4_ == 0)
                PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = 2047;
            else if (i_4_ == 1) {
                int i_5_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 3);
                Class68_Sub7.aClass1_Sub6_Sub2_2860.method151(false, i_5_, (byte) 21);
                int i_6_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
                if (i_6_ == 1)
                    PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = 2047;
            } else if (i_4_ == 2) {
                int i_7_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 3);
                Class68_Sub7.aClass1_Sub6_Sub2_2860.method151(true, i_7_, (byte) 21);
                int i_8_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 3);
                Class68_Sub7.aClass1_Sub6_Sub2_2860.method151(true, i_8_, (byte) 21);
                int i_9_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
                if (i_9_ == 1)
                    PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = 2047;
            } else if (i_4_ == 3) {
                int i_10_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 7);
                int i_11_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
                GameSocket.anInt1149 = Class68_Sub13_Sub8.inStream.method967((byte) 0, 2);
                int i_12_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 1);
                if (i_12_ == 1)
                    PacketStream.anIntArray4110[Class68_Sub20_Sub16.anInt4418++] = 2047;
                int i_13_ = Class68_Sub13_Sub8.inStream.method967((byte) 0, 7);
                Class68_Sub7.aClass1_Sub6_Sub2_2860.method147(i_13_, (byte) -68, i_10_, i_11_ == 1);
            }
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        anInt4248++;
    }

    public boolean method1068(Interface4 interface4, int i, Class21renamed class21) {
        try {
            anInt4238++;
            if (i != -5947)
                method1072((byte) -13, null, null, -0.6478323F, true);
            return aClass3_4242.method180(interface4, 0, class21);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("fe.E("
                            + (interface4 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (class21 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method1069(int i) {
        aRSString_4236 = null;
        if (i <= -63) {
            anIntArray4230 = null;
            anIntArrayArray4246 = null;
            aRSString_4232 = null;
        }
    }

    public void method1070(int i, int i_14_) {
        anInt4231++;
        if (i_14_ != -27276)
            aRSString_4236 = null;
        if (anIntArray4243 != null) {
            if ((anInt4245 ^ 0xffffffff) != -1
                    || (anInt4249 ^ 0xffffffff) != -1) {
                if (Class68_Sub28_Sub2.anIntArray4546 == null
                        || (Class68_Sub28_Sub2.anIntArray4546.length
                        < anIntArray4243.length))
                    Class68_Sub28_Sub2.anIntArray4546
                            = new int[anIntArray4243.length];
                int i_15_
                        = (anIntArray4243.length ^ 0xffffffff) != -4097 ? 128 : 64;
                int i_16_ = anIntArray4243.length;
                int i_17_ = anInt4249 * i;
                int i_18_ = -1 + i_15_;
                int i_19_ = i_15_ * (i * anInt4245);
                int i_20_ = i_16_ + -1;
                for (int i_21_ = 0; i_16_ > i_21_; i_21_ += i_15_) {
                    int i_22_ = i_21_ - -i_19_ & i_20_;
                    for (int i_23_ = 0; i_23_ < i_15_; i_23_++) {
                        int i_24_ = i_21_ - -i_23_;
                        int i_25_ = (i_18_ & i_17_ + i_23_) + i_22_;
                        Class68_Sub28_Sub2.anIntArray4546[i_24_]
                                = anIntArray4243[i_25_];
                    }
                }
                int[] is = anIntArray4243;
                anIntArray4243 = Class68_Sub28_Sub2.anIntArray4546;
                Class68_Sub28_Sub2.anIntArray4546 = is;
            }
        }
    }

    public static void method1071(byte i) {
        ISAACRandomGen.aLong1480 = 0L;
        anInt4237++;
        if (i != -118)
            aRSString_4232 = null;
    }

    public int[] method1072(byte i, Class21renamed class21, Interface4 interface4,
                            float f, boolean bool) {
        try {
            anInt4235++;
            if (anIntArray4243 == null || f != aFloat4244) {
                if (!aClass3_4242.method180(interface4, 0, class21))
                    return null;
                int i_26_ = bool ? 64 : 128;
                anIntArray4243
                        = aClass3_4242.method178(aBoolean4239, true, class21,
                        interface4, i_26_, i_26_,
                        (double) f, 2000);
                aFloat4244 = f;
                if (aBoolean4234) {
                    int[] is = new int[i_26_];
                    int[] is_27_ = new int[i_26_];
                    int[] is_28_ = new int[i_26_];
                    int i_29_ = i_26_;
                    int i_31_;
                    int i_30_ = i_31_ = i_29_;
                    int[] is_32_ = new int[i_26_ * i_26_];
                    int i_33_ = -1 + i_29_;
                    int i_34_ = i_26_;
                    int i_35_ = i_34_ + -1;
                    int i_36_ = i_29_ * i_34_;
                    for (int i_37_ = 2; i_37_ >= 0; i_37_--) {
                        for (int i_38_ = i_33_; (i_38_ ^ 0xffffffff) <= -1;
                             i_38_--) {
                            int i_39_ = anIntArray4243[--i_31_];
                            is_27_[i_38_]
                                    += Class120.method1740(255,
                                    i_39_ >> -830962224);
                            is[i_38_]
                                    += Class120.method1740(255,
                                    i_39_ >> 1877808232);
                            is_28_[i_38_] += Class120.method1740(255, i_39_);
                        }
                        if (i_31_ == 0)
                            i_31_ = i_36_;
                    }
                    int i_40_ = i_36_;
                    for (int i_41_ = i_35_; i_41_ >= 0; i_41_--) {
                        int i_43_;
                        int i_44_;
                        int i_42_ = i_43_ = i_44_ = 0;
                        int i_45_ = 1;
                        int i_46_ = 1;
                        for (int i_47_ = 2; (i_47_ ^ 0xffffffff) <= -1;
                             i_47_--) {
                            i_45_--;
                            i_42_ += is_27_[i_45_];
                            i_43_ += is_28_[i_45_];
                            i_44_ += is[i_45_];
                            if ((i_45_ ^ 0xffffffff) == -1)
                                i_45_ = i_29_;
                        }
                        for (int i_48_ = i_33_; i_48_ >= 0; i_48_--) {
                            i_46_--;
                            int i_49_ = i_43_ / 9;
                            int i_50_ = i_42_ / 9;
                            int i_51_ = i_44_ / 9;
                            is_32_[--i_40_]
                                    = (Class70.method1335
                                    (Class70.method1335(i_50_ << 603893968,
                                            i_51_ << -458277048),
                                            i_49_));
                            i_45_--;
                            i_43_ += is_28_[i_45_] + -is_28_[i_46_];
                            i_42_ += is_27_[i_45_] + -is_27_[i_46_];
                            i_44_ += -is[i_46_] + is[i_45_];
                            if ((i_46_ ^ 0xffffffff) == -1)
                                i_46_ = i_29_;
                            if (i_45_ == 0)
                                i_45_ = i_29_;
                        }
                        for (int i_52_ = i_33_; (i_52_ ^ 0xffffffff) <= -1;
                             i_52_--) {
                            int i_53_ = anIntArray4243[--i_31_];
                            int i_54_ = anIntArray4243[--i_30_];
                            is_27_[i_52_]
                                    += (-Class120.method1740(255,
                                    i_54_ >> -1471256592)
                                    + (Class120.method1740(i_53_, 16759453)
                                    >> -1671353904));
                            is[i_52_] += (-(Class120.method1740(65376, i_54_)
                                    >> 1171490600)
                                    + (Class120.method1740(i_53_, 65471)
                                    >> -903277688));
                            is_28_[i_52_]
                                    += (Class120.method1740(255, i_53_)
                                    - Class120.method1740(255, i_54_));
                        }
                        if (i_31_ == 0)
                            i_31_ = i_36_;
                        if (i_30_ == 0)
                            i_30_ = i_36_;
                    }
                    anIntArray4243 = is_32_;
                }
            }
            int i_55_ = 120 / ((i - 49) / 61);
            return anIntArray4243;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("fe.C(" + i + ','
                            + (class21 != null ? "{...}" : "null")
                            + ','
                            + (interface4 != null ? "{...}"
                            : "null")
                            + ',' + f + ',' + bool + ')'));
        }
    }

    public Class68_Sub20_Sub6(Stream class68_sub14) {
        aClass3_4242 = new Class3(class68_sub14);
        aBoolean4234 = (class68_sub14.readUnsignedByte(-6677) ^ 0xffffffff) == -2;
        aBoolean4239 = class68_sub14.readUnsignedByte(-6677) == 1;
        class68_sub14.readUnsignedByte(-6677);
        class68_sub14.readUnsignedByte(-6677);
        int i = 0x3 & class68_sub14.readUnsignedByte(-6677);
        anInt4249 = class68_sub14.method955(3390);
        anInt4245 = class68_sub14.method955(3390);
        class68_sub14.readUnsignedByte(-6677);
        class68_sub14.readUnsignedByte(-6677);
    }
}
